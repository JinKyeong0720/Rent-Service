function checkValues(htmlForm) {
	let url = "regist?";

	const client_id = document.getElementById("client_id").value;
	const client_pw = document.getElementById("client_pw").value;
	const client_name = document.getElementById("client_name").value;
	const client_phone = document.getElementById("client_phone").value;

	let check = true;

	if (client_id !== "") {
		url += "&id=" + client_id;
	}

	if (client_pw !== "") {
		url += "&pw=" + client_pw;
	}

	if (client_name !== "") {
		url += "&name=" + client_name;
	}
	
	if (client_phone !== "") {
		url += "&phone=" + client_phone;
	}

	if (client_id == "") {
		alert('회원성명이 입력되지 않았습니다');
		check = false;
	}

	else if (client_pw == "") {
		alert('비밀번호가 입력되지 않았습니다');
		check = false;
	}

	else if (client_name == "") {
		alert('이름이 입력되지 않았습니다');
		check = false;
	}
	
	else if (client_phone == "") {
		alert('전화번호가 입력되지 않았습니다');
		check = false;
	}

	if (check === false) {
		location.href = url;
	}

	else {
		htmlForm.submit();
	}
}