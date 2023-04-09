package client;

import java.sql.Timestamp;

public class ClientRequestDto {
	private String client_id;
	private String client_pw;
	private String client_name;
	private Timestamp client_join_date;
	private String client_phone;
	
	public ClientRequestDto(String client_id, String client_pw, String client_name, Timestamp client_join_date, String client_phone) {
		this.client_id = client_id;
		this.client_pw = client_pw;
		this.client_name = client_name;
		this.client_join_date = client_join_date;
		this.client_phone = client_phone;
	}

	public ClientRequestDto(String client_id, String client_pw, String client_name, String client_phone) {
		this.client_id = client_id;
		this.client_pw = client_pw;
		this.client_name = client_name;
		this.client_phone = client_phone;
	}

	public String getClient_id() {
		return client_id;
	}

	public void setClient_id(String client_id) {
		this.client_id = client_id;
	}

	public String getClient_pw() {
		return client_pw;
	}

	public void setClient_pw(String client_pw) {
		this.client_pw = client_pw;
	}

	public String getClient_name() {
		return client_name;
	}

	public void setClient_name(String client_name) {
		this.client_name = client_name;
	}

	public Timestamp getClient_join_date() {
		return client_join_date;
	}

	public void setClient_join_date(Timestamp client_join_date) {
		this.client_join_date = client_join_date;
	}

	public String getClient_phone() {
		return client_phone;
	}

	public void setClient_phone(String client_phone) {
		this.client_phone = client_phone;
	}
}
