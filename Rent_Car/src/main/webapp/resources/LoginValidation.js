function loginCheck(htmlForm) {
	let url = "login.jsp?&";

	const client_id = document.getElementById("client_id").value;
	const client_pw = document.getElementById("client_pw").value;

	let check = true;

	if (client_id !== "") {
		url += "&client_id=" + client_id;
	}

	if (client_pw !== "") {
		url += "&client_pw=" + client_pw;
	}

	if (client_id == "") {
		alert('아이디를 입력하세요');
		check = false;
	}

	else if (client_pw == "") {
		alert('비밀번호를 입력하세요');
		check = false;
	}

	if (check === false) {
		location.href = url;
	}

	else {
		htmlForm.submit();
	}
}