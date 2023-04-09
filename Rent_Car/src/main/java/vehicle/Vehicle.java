package vehicle;

public class Vehicle {
	private int vehicle_num;
	private String vehicle_code;
	private String vehicle_name;
	private String vehicle_location;
	private int vehicle_hour_price;
	
	public Vehicle(int vehicle_num, String vehicle_code, String vehicle_name, String vehicle_location, int vehicle_hour_price) {
		this.vehicle_num = vehicle_num;
		this.vehicle_code = vehicle_code;
		this.vehicle_name = vehicle_name;
		this.vehicle_location = vehicle_location;
		this.vehicle_hour_price = vehicle_hour_price;
	}
	
	public Vehicle(VehicleRequestDto vehicleDto) {
		this.vehicle_num = vehicleDto.getVehicle_num();
		this.vehicle_code = vehicleDto.getVehicle_code();
		this.vehicle_name = vehicleDto.getVehicle_name();
		this.vehicle_location = vehicleDto.getVehicle_location();
		this.vehicle_hour_price = vehicleDto.getVehicle_hour_price();
	}

	public int getVehicle_num() {
		return vehicle_num;
	}

	public String getVehicle_code() {
		return vehicle_code;
	}

	public String getVehicle_name() {
		return vehicle_name;
	}

	public String getVehicle_location() {
		return vehicle_location;
	}

	public int getVehicle_hour_price() {
		return vehicle_hour_price;
	}
}
