package client;

import java.sql.Timestamp;

import client.controller.ClientDao;

public class Client {
	private String client_id;
	private String client_pw;
	private String client_name;
	private Timestamp client_join_date;
	private String client_phone;

	public Client(String client_id, String client_pw, String client_name, Timestamp client_join_date, String client_phone) {
		this.client_id = client_id;
		this.client_pw = client_pw;
		this.client_name = client_name;
		this.client_join_date = client_join_date;
		this.client_phone = client_phone;
	}

	public Client(ClientRequestDto clientDto) {
		ClientDao clientDao = ClientDao.getInstance();
		
		this.client_id = clientDto.getClient_id();
		this.client_pw = clientDto.getClient_pw();
		this.client_name = clientDto.getClient_name();
		this.client_join_date = clientDto.getClient_join_date();
		this.client_phone = clientDto.getClient_phone();
	}

	public String getClient_id() {
		return client_id;
	}

	public String getClient_pw() {
		return client_pw;
	}

	public String getClient_name() {
		return client_name;
	}

	public Timestamp getClient_join_date() {
		return client_join_date;
	}

	public String getClient_phone() {
		return client_phone;
	}
}
