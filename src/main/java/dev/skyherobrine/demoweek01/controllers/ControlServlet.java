package dev.skyherobrine.demoweek01.controllers;

import dev.skyherobrine.demoweek01.models.Account;
import dev.skyherobrine.demoweek01.repositories.InitDAO;
import dev.skyherobrine.demoweek01.repositories.impl.AccountRepository;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "ControlServlet", urlPatterns = "/control-servlet")
public class ControlServlet extends HttpServlet {

    private AccountRepository ar = new AccountRepository();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String getAction = req.getParameter("action");
        switch(getAction) {
            case "LogIn": {
                String getEmail = req.getParameter("email");
                String getPassword = req.getParameter("password");

                Account target = ar.checkLogin(getEmail, getPassword).orElse(null);
                if(target != null) {
                    req.getServletContext().setAttribute("account", target);
                    req.getServletContext().getRequestDispatcher("/person_not_admin.jsp").forward(req, resp);
                }

            }
        }
    }
}
