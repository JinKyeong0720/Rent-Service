create database rent;
use rent;

CREATE table Venue(
venue_num int(100) PRIMARY KEY,
venue_Name varchar(100) NOT NULL
);

CREATE table Vehicle(
vehicle_num int(100) PRIMARY KEY,
vehicle_code varchar(100) NOT NULL,
vehicle_name varchar(100) NOT NULL,
vehicle_location varchar(100) NOT NULL,
vehicle_hour_price int(100) NOT NULL
);

CREATE table Client(
client_id varchar(100) PRIMARY KEY,
client_pw varchar(100) NOT NULL,
client_name varchar(100) NOT NULL,
client_join_date timestamp default current_timestamp NOT NULL,
client_phone varchar(13) NOT NULL
);

CREATE table Board(
board_num int(100) PRIMARY KEY,
board_title varchar(100) NOT NULL,
board_content varchar(100) NOT NULL,
board_register timestamp default current_timestamp NOT NULL,
board_modify timestamp default current_timestamp NOT NULL,
board_writter varchar(100) NOT NULL,
FOREIGN KEY(board_writter) REFERENCES Client(client_id)
);

CREATE table Booking(
booking_num int(100) PRIMARY KEY,
booking_vehicle_code int(100) NOT NULL,
booking_client_id varchar(100) NOT NULL,
booking_book_date timestamp default current_timestamp NOT NULL,
booking_use_date timestamp NOT NULL,
booking_use_day int(100) NOT NULL,
booking_use_hour int(100) NOT NULL,
booking_payment int(100) NOT NULL,
FOREIGN KEY(booking_vehicle_code) REFERENCES Vehicle(vehicle_num),
FOREIGN KEY(booking_client_id) REFERENCES Client(client_id)
);