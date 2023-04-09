package client.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;

import client.Client;
import client.ClientRequestDto;
import util.DBManager;

public class ClientDao {
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;

	private ClientDao() {
	}

	private static ClientDao instance = new ClientDao();

	public static ClientDao getInstance() {
		return instance;
	}

	public void createClient(ClientRequestDto clientDto) {
		Client client = new Client(clientDto);

		this.conn = DBManager.getConnectionFromMySQL();
		if (this.conn != null) {
			String sql = "INSERT INTO Client VALUES (?, ?, ?, ?, ?);";

			try {
				this.pstmt = this.conn.prepareStatement(sql);
				this.pstmt.setString(1, client.getClient_id());
				this.pstmt.setString(2, client.getClient_pw());
				this.pstmt.setString(3, client.getClient_name());
				this.pstmt.setTimestamp(4, client.getClient_join_date());
				this.pstmt.setString(5, client.getClient_phone());
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				DBManager.close(conn, pstmt, rs);
			}
		}
	}

	public ArrayList<Client> getClientAll() {
		ArrayList<Client> list = new ArrayList<Client>();
		this.conn = DBManager.getConnectionFromMySQL();
		if (this.conn != null) {
			String sql = "SELECT * FROM client ORDER BY client_join_date";

			try {
				this.pstmt = this.conn.prepareStatement(sql);
				this.rs = this.pstmt.executeQuery();

				while (this.rs.next()) {
					String client_id = this.rs.getString(1);
					String client_pw = this.rs.getString(2);
					String client_name = this.rs.getString(3);
					Timestamp client_join_date = this.rs.getTimestamp(4);
					String client_phone = this.rs.getString(5);

					Client client = new Client(client_id, client_pw, client_name, client_join_date, client_phone);
					list.add(client);
				}
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				DBManager.close(conn, pstmt, rs);
			}
		}
		return list;
	}

	public Client getClientVyId(String client_id) {
		Client client = null;
		this.conn = DBManager.getConnectionFromMySQL();
		if (this.conn != null) {
			String sql = "SELECT * FROM client WHERE client_id=?";

			try {
				this.pstmt = this.conn.prepareStatement(sql);
				this.pstmt.setString(1, client_id);
				this.rs = this.pstmt.executeQuery();
				
				while(this.rs.next()) {
					String client_pw = this.rs.getString(2);
					String client_name = this.rs.getString(3);
					Timestamp client_join_date = this.rs.getTimestamp(4);
					String client_phone = this.rs.getString(5);
				}
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				DBManager.close(conn, pstmt, rs);
			}
		}
		return client;
	}

	public void updateClient(ClientRequestDto clientDto) {
		Client client = new Client(clientDto);
		this.conn = DBManager.getConnectionFromMySQL();
		
		if (this.conn != null && client != null) {
			String sql = "UPDATE client SET client_pw=?, client_name=?, client_phone=?";

			try {
				this.pstmt = this.conn.prepareStatement(sql);
				this.pstmt.setString(1, client.getClient_pw());
				this.pstmt.setString(2, client.getClient_name());
				this.pstmt.setString(3, client.getClient_phone());
				this.pstmt.execute();
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				DBManager.close(conn, pstmt);
			}
		}
	}
}
