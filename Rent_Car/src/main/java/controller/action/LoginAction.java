package controller.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import client.Client;
import client.controller.ClientDao;

public class LoginAction implements Action {
	@Override
	public void excute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String client_id = request.getParameter("id");
		String client_pw = request.getParameter("pw");

		ClientDao clientDao = ClientDao.getInstance();
		Client client = clientDao.getClientById(client_id);

		if (client != null && client_pw.equals(client.getClient_pw())) {
			HttpSession session = request.getSession();
			session.setAttribute("log", client);
			response.sendRedirect("/");
		}
	}
}
