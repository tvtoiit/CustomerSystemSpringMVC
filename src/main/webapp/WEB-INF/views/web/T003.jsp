<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit - Training</title>
</head>
<body>
<div id="main">
	<form:form id="formSubmit" modelAttribute="model">
		<h1 class="error">Thông báo</h1>
			<div class="comntent-customer_id">
				<span>Customer Id</span>
					<span></span>
				<form:hidden path="customerId" id="customerId"/>
			</div>
			<div class="comntent-customer_name">
				<span>Customer Name</span> 
				<form:input path="customerName"/>
			</div>
			<div class="comntent-customer_sex">
				<span>Sex</span> <select name="sex">
					<option value=""></option>
					<option value="0">Male</option>
		    		<option value="1">Female</option>
				</select>
			</div>
			<div class="comntent-customer_birthday">
				<span>Customer birthday</span> 
				<form:input path="birthDay"/>
			</div>
			<div class="comntent-customer_email">
				<span>Customer Email</span> 
				<form:input path="email"/>
			</div>
			<div class="comntent-customer_address">
				<span>Customer Address</span> 
				<form:input path="address"/>
			</div>
			<c:url var="createCustomerUrl" value="/T003/chinh-sua" />
			<c:if test="${empty model.customerId }">
				<button id="btnAddOrUpdateNew">Save</button>
			</c:if>
			<c:if test = "${not empty model.customerId }">
				<button  id="btnAddOrUpdateNew">Update</button>
			</c:if>
	</form:form>
</div>
<script>
document.getElementById('btnAddOrUpdateNew').addEventListener('click', function (e) {
    e.preventDefault();
    console.log('123');
    var data = {};
    var formData = document.getElementById('formSubmit').elements;
    for (var i = 0; i < formData.length; i++) {
        if (formData[i].name) {
            data[formData[i].name] = formData[i].value;
        }
    }
    var id = document.getElementById('customerId').value;
    if (id === "") {
    	console.log(data + "data");
        addNew(data);
    } else {
    	console.log(data);
        //updateData(data, id);
    }
});


function addNew(data) {
	const api = "/api/T003";
    fetch(api, {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(data)
    })
    .then(response => response.json())
    .then(result => {
    	console.log(data + "data");
        //window.location.href = '/api/T003?id=' + result.id;
    })
    .catch(error => {
    	console.log(data);
        //window.location.href = '/api/T003';
    });
}


 
</script>
</body>
</html>