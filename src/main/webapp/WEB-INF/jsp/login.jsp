<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@  taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<c:set var="path" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link rel="shortcut icon"
	href="https://ignite.apache.org/images/java.png">

<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/toastr.js/latest/css/toastr.min.css">
<link rel="stylesheet"
	href="${path}/webjars/bootstrap/3.4.0/css/bootstrap.min.css">
<link rel="stylesheet"
	href="${path}/webjars/font-awesome/4.7.0/css/font-awesome.min.css">

<script type="text/javascript"
	src="${path}/webjars/jquery/3.2.0/jquery.min.js"></script>
<script type="text/javascript"
	src="${path}/webjars/bootstrap/3.4.0/js/bootstrap.min.js"></script>
<script type="text/javascript" src="${path}/js/jquery.boot.js"></script>
<script type="text/javascript" src="${path}/js/jquery.save.js"></script>
<script type="text/javascript"
	src="https://cdnjs.cloudflare.com/ajax/libs/toastr.js/latest/js/toastr.min.js"></script>
<title>Login</title>
<link rel="stylesheet"
	href="${path}/webjars/bootstrap/3.3.5/css/bootstrap.min.css">
<style type="text/css">
body {
	background:
		url("http://quatangquangcao.net/wp-content/uploads/2016/02/AF-Client-Login-background-1024x682.png")
		no-repeat center center fixed;
	background-size: cover;
	display: flex;
	align-items: center;
	height: 100vh;
}
</style>
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col-md-4 col-md-offset-4">
				<div class="panel panel-default">
					<div class="panel-heading">
						<strong>${giris }</strong>
					</div>
					<div class="panel-body">
						<form method="POST" action="${path}/login"
							class="form-signin form-horizontal">
							<c:if test="${error != null}">
								<div class="alert alert-danger">
									<c:out value="${error}"></c:out>
								</div>
							</c:if>
							<c:if test="${message != null}">
								<div class="alert alert-success">
									<strong>${message}</strong>
								</div>
							</c:if>
							<c:if test="${ahmet != null}">
								<div class="alert alert-success">
									<strong>${ahmet}</strong>
								</div>
							</c:if>
							<c:if test="${mesaj != null}">
								<div >
								<script type="text/javascript">
									toastr.success("${mesaj}", "Kayıtınız başarılı", {
								closeButton:true
							});
									</script>
									
								</div>
							</c:if>
							<div class="form-group">
								<div class="col-md-12">
									<div class="input-group input-group-md">
										<span class="input-group-addon"> <span
											class="glyphicon glyphicon-user"></span>
										</span> <input type="text" class="form-control" name="username"
											placeholder="Kullanıcı Adınızı giriniz." />
									</div>
								</div>
							</div>
							<div class="form-group">
								<div class="col-md-12">
									<div class="input-group input-group-md">
										<span class="input-group-addon"> <span
											class="glyphicon glyphicon-lock"></span>
										</span> <input type="password" class="form-control" name="password"
											placeholder="Şifrenizi Giriniz." />
									</div>
								</div>
							</div>
							<div class="form-group">
								<div class="col-md-12">
									<div class="checkbox">
										<label> <input type="checkbox" name="remember-me"
											id="remember-me" /> Remember Me
										</label>
									</div>
								</div>
							</div>
							<input type="hidden" name="${_csrf.parameterName}"
								value="${_csrf.token}" />
							<div class="form-group">
								<div class="col-md-12">
									<button type="submit" class="btn btn-default btn-block">
										<span class="glyphicon glyphicon-log-in"></span> Login
									</button>
									<ul class="nav navbar-nav">
										<li class="active"><a href="${path}/useryenikayit"><span
												class="glyphicon glyphicon-home"></span> Yeni kayıt</a></li>
										<li class="active"><a href="javascript:void(0);"><span
												class="glyphicon glyphicon-info-sign"></span> Şifremi
												unuttum </a></li>
									</ul>
								</div>
							</div>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>