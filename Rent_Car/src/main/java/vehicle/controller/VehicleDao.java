package vehicle.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import util.DBManager;
import vehicle.Vehicle;
import vehicle.VehicleRequestDto;

public class VehicleDao {
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;

	private VehicleDao() {}
	private static VehicleDao instance = new VehicleDao();
	public static VehicleDao getInstance() {
		return instance;
	}
	
	public void createVehicle(VehicleRequestDto vehicleDto) {
		Vehicle vehicle = new Vehicle(vehicleDto);
		
		this.conn = DBManager.getConnectionFromMySQL();
		if(this.conn != null) {
			String sql = "INSERT INTO Vehicle VALUES (?, ?, ?, ?, ?)";

			try {
				this.pstmt = this.conn.prepareStatement(sql);
				this.pstmt.setInt(1, vehicle.getVehicle_num());
				this.pstmt.setString(2, vehicle.getVehicle_code());
				this.pstmt.setString(3, vehicle.getVehicle_name());
				this.pstmt.setString(4, vehicle.getVehicle_location());
				this.pstmt.setInt(5, vehicle.getVehicle_hour_price());
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				DBManager.close(conn, pstmt);
			}
		}
	}
	
	public Vehicle getVehicleById(int vehicle_num) {
		Vehicle vehicle = null;
		this.conn = DBManager.getConnectionFromMySQL();
		if(this.conn != null) {
			String sql = "SELECT * FROM Vehicle WHERE vehicle_num=?";
		
			try {
				this.pstmt = this.conn.prepareStatement(sql);
				this.pstmt.setInt(1, vehicle_num);
				this.rs = this.pstmt.executeQuery();
				
				while(this.rs.next()) {
					String vehicle_code = this.rs.getString(2);
					String vehicle_name = this.rs.getString(3);
					String vehicle_location = this.rs.getString(4);
					int vehicle_hour_price = this.rs.getInt(5);
					
					vehicle = new Vehicle(vehicle_num, vehicle_code, vehicle_name, vehicle_location, vehicle_hour_price);
				}
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				DBManager.close(conn, pstmt, rs);
			}
		}
		return vehicle;
	}
	
	public ArrayList<Vehicle> getVehicleAll(){
		ArrayList<Vehicle> list = new ArrayList<Vehicle>();
		this.conn = DBManager.getConnectionFromMySQL();
		
		if(this.conn != null) {
			String sql = "SELECT * FROM Vehicle ORDER BY vehicle_num";
			
			try {
				this.pstmt = this.conn.prepareStatement(sql);
				this.rs = this.pstmt.executeQuery();
				
				while(this.rs.next()) {
					int vehicle_num = this.rs.getInt(1);
					String vehicle_code = this.rs.getString(2);
					String vehicle_name = this.rs.getString(3);
					String vehicle_location = this.rs.getString(4);
					int vehicle_hour_price = this.rs.getInt(5);
					
					Vehicle vehicle = new Vehicle(vehicle_num, vehicle_code, vehicle_name, vehicle_location, vehicle_hour_price);
					list.add(vehicle);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return list;
	}
}
