function listTemp(listData){
	let template =
	`<li>
			<p> \${listData.name} </p>
			<p> \${listData.email} </p>
			<p> \${listData.mobile} </p>
			<button onclick="updateFunction('\${listData.name}','\${listData.email}','\${listData.mobile}');">Update</button>
			<button onclick="deleteFunction('\${listData.name}')">Delete</button>
			
		</li>`;
		return template;
}

function genarateLIst(data){
	let list = '';
	data.map((listData) => {
		list += listTemp(listData);
	});
	console.log(data);
	return list;
}

function getAllEmployee() {
    $.get("http://localhost:8080/api/get/all", function(response) {
        $("#output").html(genarateLIst(response));
    });
}

function deleteFunction(name) {
    $.ajax({
        type: "DELETE",
        url: "http://localhost:8080/api/delete/" + name,
        success: function() {
        
        }
    });
}

function updateFunction(name, email, mobile) {
    console.log(name, email,mobile);
    $("#name").val(name).prop('disabled', true);
    $("#email").val(email);
    $("#mobile").val(mobile);
}

$("#form").on("submit",function(e){
	e.preventDefault()
	let data = {
		name : $("#name").val(),
		email : $("#email").val(),
		mobile : $("#mobile").val()
	}
	
	$.ajax({
		type :"post",
		contentType: "application/json",
		dataType: 'json',
		url: "http://localhost:8080/api/add",
		data: JSON.stringify(data)
	})
	
	$("#name").val("")
	$("#email").val("")
	$("#mobile").val("")
	
});

getAllEmployee();

