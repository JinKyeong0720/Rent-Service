package util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class DBManager {
	public static Connection getConnectionFromMySQL() {
		Connection conn = null;
		
		try {
//			Timestamp now = new Timestamp(System.currentTimeMillis());
//			System.out.println(now);
			// JNDI
			// Java Naming and Directory Interface
			Context init = new InitialContext();
			DataSource source = (DataSource) init.lookup("java:comp/env/jdbc/rent");
			conn = source.getConnection();
			System.out.println("돌고래 DB연동 성공");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("돌고래 DB연동 실패");
		}
		return conn;
	}
	
	public static void close(Connection conn, PreparedStatement pstmt, ResultSet rs) {
		try {
			conn.close();
			pstmt.close();
			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void close(Connection conn, PreparedStatement pstmt) {
		try {
			conn.close();
			pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
