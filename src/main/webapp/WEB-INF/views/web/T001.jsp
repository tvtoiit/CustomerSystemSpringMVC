
<%@include file="/common/taglib.jsp" %>
<style type="text/css">
	<%@ include file="/template/web/css/T001.css" %>
</style>
</head>
<body>
	<div class="content">
			<div class="content-text">Login</div>
			<div class="content-login">
				<form:form action="/ProjectSmartphoneMVC/authen/login" method="POST" modelAttribute="userLogin">
					<div class="content-login__header">
						<h3>LOGIN</h3>
						<div id="lblErrorMessage">
							<label class="error-message">Loi</label>
						</div>
					</div>
					<div class="content-login__container">
						<div class="form-group">
							<label for="fullname" class="form-label form-label__userID">User Id: </label> 
							<form:input id="txtUserID" path="username" value="" maxlength="8" cssClass="form-control"/>	
						</div>
						<div class="form-group__password">
							<label for="password" class="form-label">Password: </label> 
							<form:input id="txtPassword" path="password" type="password" maxlength="8" cssClass="form-control"/>
						</div>
						<div class="form-group__btn">
							<button type="submit" id="btnLogin" class="form-submit">Login</button>
							<button type="button" id="btnClear" onclick="clearForm()" class="form-submit">Clear</button>
						</div>
					</div>
				</form:form>
			</div>
		</div>
</body>
