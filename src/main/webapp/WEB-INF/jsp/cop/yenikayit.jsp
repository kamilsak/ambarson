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
	href="${path}/webjars/bootstrap/3.3.5/css/bootstrap.min.css">
<link rel="stylesheet"
	href="${path}/webjars/font-awesome/4.7.0/css/font-awesome.min.css">

<script type="text/javascript"
	src="${path}/webjars/jquery/3.2.0/jquery.min.js"></script>
<script type="text/javascript"
	src="${path}/webjars/bootstrap/3.3.5/bootstrap.min.js"></script>
<script type="text/javascript" src="${path}/js/jquery.boot.js"></script>
<script type="text/javascript" src="${path}/js/jquery.save.js"></script>
<script type="text/javascript"
	src="https://cdnjs.cloudflare.com/ajax/libs/toastr.js/latest/js/toastr.min.js"></script>
<title>Örnek Ambara Hoşgeldiniz</title>
<style>
/* Set height of the grid so .sidenav can be 100% (adjust if needed) */
.row.content {
	height: 1500px
}

/* Set gray background color and 100% height */
.sidenav {
	background-color: #ffffff;
	height: 100%;
}

/* Set black background color, white text and some padding */
footer {
	background-color: #ffffff;
	color: black;
	padding: 15px;
}

/* On small screens, set height to 'auto' for sidenav and grid */
@media screen and (max-width: 767px) {
	.sidenav {
		height: auto;
		padding: 15px;
	}
	.row.content {
		height: auto;
	}
}
</style>
</head>
<body>
	<%-- ${SPRING_SECURITY_CONTEXT.authentication.principal.authorities} kullanıcı role bilgisi için --%>
	<form id="logoutForm" method="POST" action="/musteri/">
		<input type="hidden" name="${_csrf.parameterName}"
			value="${_csrf.token}" />
	</form>
	<div class="navbar navbar-default navbar-fixed-top">
		<div class="container-fluid">
			<div class="navbar-header">
				<a class="navbar-brand " href="${path}/">Ambarlar</a>
			</div>
			<div class="collapse navbar-collapse">
				<ul class="nav navbar-nav">
					<li class="active"><a href="${path}"><span
							class="glyphicon glyphicon-home"></span> Home</a></li>
					<li><a href="javascript:void(0);"><span
							class="glyphicon glyphicon-info-sign"></span> About</a></li>
					<li><a href="javascript:void(0);"><span
							class="glyphicon glyphicon-phone-alt"></span> Contact</a></li>
				</ul>
				<ul class="nav navbar-nav navbar-right">
					<li><a href="javascript:void(0);"
						onclick="document.forms['logoutForm'].submit()"> Hoşgeldiniz
							${pageContext.request.userPrincipal.name} | <span
							class="glyphicon glyphicon-log-out"></span> Giriş
					</a></li>
				</ul>
			</div>
		</div>
	</div><br><br><br>
	<!-- =================================================================================================================== -->

	<div class="container-fluid">
		<div class="row content">


			<div class="col-sm-2 sidenav">
				<ul class="nav nav nav-stacked">
					<li><a href="javascript:void(0);" id="personel"><span
							class="glyphicon glyphicon-user"></span> Talep List</a></li>
					<li><a href="javascript:void(0);" id="patron"><i
							class="fa fa-address-card-o"></i> Address List</a></li>
					<li><a href="javascript:void(0);"
						onclick="gonderiForm('user/form?patron=true')"><span
							class="glyphicon glyphicon-user"></span> Personel Kaydet</a></li>

				</ul>
				<br>
				<div class="input-group">
					<input type="text" class="form-control" placeholder="Search Blog..">
					<span class="input-group-btn">
						<button class="btn btn-default" type="button">
							<span class="glyphicon glyphicon-search"></span>
						</button>
					</span>
				</div>
			</div>

			<div class="inner-jsp col-sm-10">
				<form:form method="post" class="form-horizontal"
					modelAttribute="user" id="gonderilenform">
					<form:hidden path="id" />
					<div class="panel-body">
						<div class="form-group">
							<label class="col-md-2 control-label">İsim : </label>
							<div class="col-md-4">
								<form:input class="form-control" path="ad"
									placeholder="Enter Full Name" />
							</div>

							<label class="col-md-2 control-label">Soyisim : </label>
							<div class="col-md-4">
								<form:input class="form-control" path="soyad"
									placeholder="Soyisim" />
							</div>
						</div>
						<div class="form-group">
							<label class="col-md-2 control-label">Kullanıcı Adı : </label>
							<div class="col-md-4">
								<form:input class="form-control" path="userName"
									placeholder="Enter User Name" />
								<form:errors path="userName"></form:errors>
							</div>

							<label class="col-md-2 control-label">Şifre : </label>
							<div class="col-md-4">
								<form:password class="form-control" path="password"
									placeholder="Enter Password" />
							</div>
						</div>
						<div class="form-group">
							<label class="col-md-2 control-label">Ünvan : </label>
							<div class="col-md-4">
								<form:input class="form-control" path="unvan"
									placeholder="Ünvan" />
							</div>

							<label class="col-md-2 control-label">Mobile : </label>
							<div class="col-md-4">
								<form:input class="form-control" path="telefonNo[CEP]"
									placeholder="Enter Mobile Number" />
							</div>
						</div>

						<div class="form-group">
							<h4>Adres bilgileri</h4>
							<label class="col-md-2 control-label">Şehir: </label>
							<div class="col-md-4">
								<form:input class="form-control" path="adres[0].sehir"
									placeholder="Enter Full Name" />
							</div>

							<label class="col-md-2 control-label">İlçe : </label>
							<div class="col-md-4">
								<form:input class="form-control" path="adres[0].ilce"
									placeholder="Soyisim" />
							</div>
						</div>
						<div class="form-group">
							<label class="col-md-2 control-label">Mahalle : </label>
							<div class="col-md-4">
								<form:input class="form-control" path="adres[0].mahalle"
									placeholder="Enter Full Name" />
							</div>

						</div>

					</div>
					<div class="panel-footer">
						<a href="javascript:void(0);" id="userKayit"
							class="btn btn-xs btn-default"> <span
							class="glyphicon glyphicon-floppy-disk"></span> <c:choose>
								<c:when test="${isNew}"> Kayıt</c:when>
								<c:otherwise> Update</c:otherwise>
							</c:choose>
						</a>
					</div>
				</form:form>
			</div>
		</div>
	</div>
	<footer class="container-fluid">
		<p class="col-sm-10 navbar-text text-center">© 2018-19, Tüm
			Hakları Ambarlar Net'e Aittir</p>
	</footer>
</body>
</html>

