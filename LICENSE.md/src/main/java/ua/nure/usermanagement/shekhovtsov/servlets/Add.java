package ua.nure.usermanagement.shekhovtsov.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ua.nure.usermanagement.shekhovtsov.User;
import ua.nure.usermanagement.shekhovtsov.db.DAOFactory;
import ua.nure.usermanagement.shekhovtsov.db.DatabaseException;

public class AddServlet extends HttpServlet {

	protected void showPage(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/add.jsp").forward(req, resp);
	}

	protected void processUser(User user) throws DatabaseException {
		DAOFactory.getInstance().getUserDAO().create(user);
	}
}
