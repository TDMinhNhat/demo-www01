package dev.skyherobrine.demoweek01.repositories.impl;

import dev.skyherobrine.demoweek01.models.Account;
import dev.skyherobrine.demoweek01.repositories.IDAO;
import dev.skyherobrine.demoweek01.repositories.InitDAO;
import jakarta.inject.Inject;
import jakarta.persistence.EntityTransaction;

import java.util.List;
import java.util.Optional;

public class AccountRepository implements IDAO<Account,Long> {

    private InitDAO dao;

    public AccountRepository() {
        this.dao = new InitDAO();
    }

    @Override
    public boolean insert(Account account) {
        EntityTransaction trans = dao.getEntityManager().getTransaction();
        try {
            trans.begin();
            dao.getEntityManager().persist(account);
            trans.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            trans.rollback();
            return false;
        }
    }

    @Override
    public boolean update(Account account) {
        EntityTransaction trans = dao.getEntityManager().getTransaction();
        try {
            trans.begin();
            dao.getEntityManager().persist(account);
            trans.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            trans.rollback();
            return false;
        }
    }

    @Override
    public boolean delete(Long aLong) {
        EntityTransaction trans = dao.getEntityManager().getTransaction();
        try {
            trans.begin();
            Optional<Account> target = select(aLong);
            if(target.isPresent()) {
                dao.getEntityManager().remove(target);
            } else throw new Exception("Account not found");
            trans.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            trans.rollback();
            return false;
        }
    }

    @Override
    public Optional<Account> select(Long aLong) {
        return Optional.of(dao.getEntityManager().find(Account.class, aLong));
    }

    @Override
    public List<Account> selectAll() {
        return dao.getEntityManager().createNamedQuery("Account.findAll", Account.class).getResultList();
    }

    public Optional<Account> checkLogin(String email, String password) {
        return Optional.of(dao.getEntityManager().createNamedQuery("Account.findByEmailAndPassword", Account.class)
                .setParameter("email", email)
                .setParameter("password", password)
                .getSingleResult());
    }
}
