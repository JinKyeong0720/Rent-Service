function checkBookingValues(htmlForm) {
	let url = "booking?";

	const booking_vehicle_ID = document.getElementById("booking_vehicle_ID ").value;
	const booking_register_Num = document.getElementById("type").value;
	const booking_client_Password = document.getElementById("bookingDate").value;
	const booking_client_ID = document.getElementById("bookingTime").value;
	const booking_venue_Locate = document.getElementById("rentDay").value;
	const booking_register_Date = document.getElementById("rentHour").value;
	const booking_use_Day = document.getElementById("rentHour").value;
	const bookingg_use_Hour = document.getElementById("rentHour").value;
	const booking_total_Payment = document.getElementById("rentHour").value;

	let check = true;
	let today = new Date();
	let year = today.getFullYear();
	let month = today.getMonth() + 1;
	let day = today.getDate();


	if (check === false) {
		location.href = url;
	}

	else {
		htmlForm.submit();
	}
}