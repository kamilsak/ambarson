<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@  taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<script type="text/javascript" src="${path}/js/jquery.save.js"></script>
<div class="panel panel-default">
	<div class="panel-heading">
		<strong> <c:choose>
				<c:when test="${empty user.userName}">
					<span class="glyphicon glyphicon-plus-sign"></span> Yeni Kullanıcı Kaydı
				</c:when>
				<c:otherwise>
				<c:if test="${empty user}">
					<span class="glyphicon glyphicon-edit"></span> Kişisel Bilgi Kaydı
					</c:if>
				</c:otherwise>
			</c:choose>
		</strong>
	</div>
	<form:form method="post" class="form-horizontal" action="${path}/add/user"  modelAttribute="user"
		id="submitUserForm" >
		<form:hidden path="id" />
		<div class="panel-body">
			<div class="form-group">
				<label class="col-md-2 control-label">Kullanıcı Adı : </label>
				<div class="col-md-4">
					<form:input class="form-control" path="userName"
						placeholder="Kullanıcı Adınızı Giriniz" />
					<form:errors path="userName"></form:errors>
				</div>

				<label class="col-md-2 control-label">Şifre : </label>
				<div class="col-md-4">
					<form:password class="form-control" path="password"
						placeholder="Şifre Giriniz." />
						<form:errors path="password"></form:errors>
				</div>
			</div>
			<div class="form-group">
				<label class="col-md-2 control-label">Email : </label>
				<div class="col-md-4">
					<form:input class="form-control" path="email"
						placeholder="E mail Adresini Giriniz." />
					<form:errors path="email"></form:errors>
				</div>

				<label class="col-md-2 control-label">Şifre Tekrar : </label>
				<div class="col-md-4">
					<form:password class="form-control" path=""
						placeholder="Şifrenizi Tekrar Giriniz." />
						<form:errors path="password"></form:errors>
						
				</div>
			</div>
		</div>
		<div class="panel-footer">
						<form:button value="save" class="btn btn-xs btn-default">
				<span class="glyphicon glyphicon-floppy-disk"></span>
				 Kayıt
			</form:button>
		</div>
	</form:form>
</div>
