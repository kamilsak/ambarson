<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@  taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<script type="text/javascript" src="${path}/js/jquery.save.js"></script>
<div class="panel panel-default">
	<div class="panel-heading">
		<strong> <c:choose>
				<c:when test="${empty mal.id}">
					<span class="glyphicon glyphicon-plus-sign"></span> Malın bilgileri
				</c:when>
				<c:otherwise>
					<span class="glyphicon glyphicon-edit"></span> Mal bilgilerini güncelle
				</c:otherwise>
			</c:choose>
		</strong>
	</div>
	<form:form method="post" class="form-horizontal" action="add/mal?neyi=${neyi}" modelAttribute="mal"
		 id="userBilgi">
		<form:hidden path="id" />
		<form:hidden path="islem" />
		<div class="panel-body">
			<div class="form-group">
				<label class="col-md-2 control-label">İçerik : </label>
				<div class="col-md-4">
					<form:input class="form-control" path="icerik"
						placeholder="Malın içeriğini giriniz." />
					<form:errors path="icerik"></form:errors>
				</div>
			</div>
			<div class="form-group">
				<label class="col-md-2 control-label">Ağırlık : </label>
				<div class="col-md-4">
					<form:input class="form-control" path="agirlik"
						placeholder="Malın ağırlığını Kg olarak giriniz." />
					<form:errors path="agirlik"></form:errors>
				</div>
				<label class="col-md-2 control-label">Hacim : </label>
				<div class="col-md-4">
					<form:input class="form-control" path="hacim"
						placeholder="Malın hacmini desi olarak giriniz." />
					<form:errors path="hacim"></form:errors>
				</div>
			</div>
			
		</div>
		<div class="panel-footer">
			<button value="save" class="btn btn-xs btn-default">
						<span class="glyphicon glyphicon-ok"></span>
						<c:choose>
							<c:when test="${empty mal.id}"> Devam et</c:when>
							<c:otherwise> Güncelle</c:otherwise>
						</c:choose>
					</button>
		</div>
	</form:form>
</div>
