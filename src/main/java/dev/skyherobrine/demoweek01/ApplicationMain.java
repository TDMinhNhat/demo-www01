package dev.skyherobrine.demoweek01;

import dev.skyherobrine.demoweek01.models.Account;
import dev.skyherobrine.demoweek01.repositories.impl.AccountRepository;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Persistence;
import net.datafaker.Faker;
import org.checkerframework.checker.units.qual.A;

public class ApplicationMain {

    private static AccountRepository ar = new AccountRepository();

    public static void main(String[] args) {
        Faker faker = new Faker();
        for(int i = 1; i <= 10; ++i) {
            Account account = new Account(
                    faker.name().fullName(),
                    faker.internet().password(),
                    faker.internet().emailAddress(),
                    faker.phoneNumber().cellPhone()
            );

            ar.insert(account);
        }
    }
}
