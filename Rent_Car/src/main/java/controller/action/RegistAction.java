package controller.action;

import java.io.IOException;
import java.sql.Timestamp;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import client.ClientRequestDto;
import client.controller.ClientDao;

public class RegistAction implements Action {

	@Override
	public void excute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String client_id = request.getParameter("id");
		String client_pw = request.getParameter("pw");
		String client_name = request.getParameter("name");
		Timestamp client_join_date = new Timestamp(System.currentTimeMillis());
		String client_phone = request.getParameter("phone");
		ClientRequestDto clientDto = new ClientRequestDto(client_id, client_pw, client_name, client_join_date, client_phone);
		ClientDao clientDao = ClientDao.getInstance();
		clientDao.createClient(clientDto);

		response.sendRedirect("/");
	}
}