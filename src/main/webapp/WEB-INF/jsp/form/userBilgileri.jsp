<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@  taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<script type="text/javascript" src="${path}/js/jquery.save.js"></script>
<div class="panel panel-default">
	<div class="panel-heading">
		<strong> <c:if test="${neyi.equals('islemGonderici')}">
				<span class="glyphicon glyphicon-pencil"></span> Gönderici bilgilerini giriniz
		</c:if> <c:if test="${neyi.equals('islemAlici')}">
				<span class="glyphicon glyphicon-pencil"></span> Alıcı bilgilerini giriniz
		</c:if> <c:if test="${neyi.equals('user')}">
				<c:choose>
					<c:when test="${empty theUserBilgileri.id}">
						<span class="glyphicon glyphicon-plus-sign"></span> Kişisel Bilgilerimi Kaydet
				</c:when>
					<c:otherwise>
						<span class="glyphicon glyphicon-edit"></span> Kişisel Bilgilerimi Güncelle
				</c:otherwise>
				</c:choose>
			</c:if>
		</strong>
		<c:if test="${neyi.equals('islemAlici') || neyi.equals('islemGonderici')}">
		<div class="btn-group pull-right">
			<a href="javascript:void(0);" class="btn btn-default btn-sm"
				onclick="gonderiForm('islem/index')" title="Geri"> <span
				class="glyphicon glyphicon-share-alt"></span>
			</a>
		</div>
		</c:if>
	</div>
	<form:form method="post" class="form-horizontal"
		action="${path}/add/userBilgileri?neyi=${neyi}"
		modelAttribute="theUserBilgileri" id="userBilgi">
		<form:hidden path="id" />
		<div class="panel-body">
			<div class="form-group">
				<label class="col-md-2 control-label">Ünvan : </label>
				<div class="col-md-4">
					<c:choose>
						<c:when test="${empty theUserBilgileri.id || neyi.equals('islemGonderici') || neyi.equals('islemAlici')}">
							<form:input class="form-control" path="unvan"
								placeholder="Ünvan varsa giriniz." />
							<form:errors path="unvan"></form:errors>
						</c:when>
						<c:otherwise>
							<form:hidden path="unvan" value="${theUserBilgileri.unvan}" />${theUserBilgileri.unvan}
					</c:otherwise>
					</c:choose>
				</div>
			</div>
			<div class="form-group">
				<label class="col-md-2 control-label">İsim : </label>
				<div class="col-md-4">
					<form:input class="form-control" path="ad"
						placeholder="İsim giriniz." />
					<form:errors path="ad"></form:errors>
				</div>
				<label class="col-md-2 control-label">Soyisim : </label>
				<div class="col-md-4">
					<form:input class="form-control" path="soyad"
						placeholder="Soyisim Giriniz." />
					<form:errors path="soyad"></form:errors>
				</div>
			</div>
		</div>
		<div class="panel-footer">

			<c:choose>
				<c:when test="${neyi.equals('user')}">
					<button value="save" class="btn btn-xs btn-default">
						<span class="glyphicon glyphicon-floppy-disk"></span>
						<c:choose>
							<c:when test="${empty theUserBilgileri.id}"> Kayıt</c:when>
							<c:otherwise> Güncelle</c:otherwise>
						</c:choose>
					</button>
				</c:when>
				<c:otherwise>
					<button value="save" class="btn btn-xs btn-default">
						<span class="glyphicon glyphicon-ok"></span>
						<c:choose>
							<c:when test="${empty theUserBilgileri.id}"> Devam et</c:when>
							<c:otherwise> Güncelle</c:otherwise>
						</c:choose>
					</button>
				</c:otherwise>
			</c:choose>
		</div>
	</form:form>
</div>

