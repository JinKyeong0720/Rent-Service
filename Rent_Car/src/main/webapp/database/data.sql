INSERT INTO Venue VALUES (1, '롯데월드 주차장');
INSERT INTO Venue VALUES (2, '에버랜드 주차장');
INSERT INTO Venue VALUES (3, '디즈니랜드 주차장');
INSERT INTO Venue VALUES (4, '레고랜드 주차장');
INSERT INTO Venue VALUES (5, '해운대 주차장');
INSERT INTO Venue VALUES (6, '애플 주차장');
INSERT INTO Venue VALUES (7, '청와대 주차장');
INSERT INTO Venue VALUES (8, '인천국제공항 주차장');
INSERT INTO Venue VALUES (9, '석촌호수 주차장');
INSERT INTO Venue VALUES (10, '한강 주차장');

INSERT INTO Vehicle VALUES (1, '1111', '거북이', '롯데월드 주차장', 600);
INSERT INTO Vehicle VALUES (2, '2222', '해파리', '롯데월드 주차장', 500);
INSERT INTO Vehicle VALUES (3, '3333', '상어', '에버랜드 주차장', 1000);
INSERT INTO Vehicle VALUES (4, '4444', '용왕의 어부바', '디즈니랜드 주차장', 10000);
INSERT INTO Vehicle VALUES (5, '5555', '문어', '롯데월드 주차장', 700);
INSERT INTO Vehicle VALUES (6, '6666', '오징어', '디즈니랜드 주차장', 700);
INSERT INTO Vehicle VALUES (7, '7777', '물개', '인천국제공항 주차장', 1300);
INSERT INTO Vehicle VALUES (8, '8888', '펭귄', '석촌호수 주차장', 1500);
INSERT INTO Vehicle VALUES (9, '9999', '조개', '청와대 주차장', 100);
INSERT INTO Vehicle VALUES (10, '1010', '바다코끼리', '인천국제공항 주차장', 2400);
INSERT INTO Vehicle VALUES (11, '1112', '개복치', '레고랜드 주차장', 3800);
INSERT INTO Vehicle VALUES (12, '1212', '물뱀', '석촌호수 주차장', 1100);
INSERT INTO Vehicle VALUES (13, '1313', '범고래', '인천국제공항 주차장', 4500);
INSERT INTO Vehicle VALUES (14, '1414', '돌고래', '인천국제공항 주차장', 6700);
INSERT INTO Vehicle VALUES (15, '1515', '연어', '레고랜드 주차장', 5900);

INSERT INTO Client(client_id, client_pw, client_name, client_phone) VALUES ('1', '1', '김토끼', '010-1111-1111');
INSERT INTO Client(client_id, client_pw, client_name, client_phone) VALUES ('2', '2', '김기린', '010-2222-2222');
INSERT INTO Client(client_id, client_pw, client_name, client_phone) VALUES ('3', '3', '김낙타', '010-3333-3333');
INSERT INTO Client(client_id, client_pw, client_name, client_phone) VALUES ('4', '4', '농담곰', '010-4444-4444');
INSERT INTO Client(client_id, client_pw, client_name, client_phone) VALUES ('5', '5', '김여우', '010-5555-5555');

INSERT INTO Board(board_num, board_title, board_content, board_writter) VALUES (1, '거북이 체험 후기', '거북이가 친절해요!', '1');

INSERT INTO Booking(booking_num, booking_vehicle_code, booking_client_id, booking_use_date, booking_use_day, booking_use_hour, booking_payment) 
VALUES (1, 1, '1', '2023-04-10', 0, 1, 600);
