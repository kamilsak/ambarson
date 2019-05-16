<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@  taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<script type="text/javascript" src="${path}/js/jquery.save.js"></script>
<div class="panel panel-default">
	<div class="panel-heading">
		<strong> <c:choose>
				<c:when test="${not empty ambar.id}">
					<span class="glyphicon glyphicon-edit"></span> Ambar bilgilerimi güncelle
				</c:when>
				<c:otherwise>
					<span class="glyphicon glyphicon-plus-sign"></span>
				</c:otherwise>
			</c:choose> Ambar Oluştur
		</strong>
	</div>

	<form:form method="post" class="form-horizontal" id="submitUserForm" action="${path}/add/ambar"
		 modelAttribute="ambar">
		<form:hidden path="id" />
		<div class="panel-body">
			<div class="form-group">
				<label class="col-md-2 control-label">Ambar İsmi :</label>
				<div class="col-md-4">
					<form:input class="form-control" path="ad"
						placeholder="Ambar adını giriniz. benzersiz olmalı"  />
				</div>
			</div>
		</div>
		<div class="panel-footer">
			<form:button  class="btn btn-xs btn-default">
				<span class="glyphicon glyphicon-floppy-disk" ></span>
				<c:choose>
					<c:when test="${empty ambar.id}"> Kayıt</c:when>
					<c:otherwise> Güncelle</c:otherwise>
				</c:choose>
			</form:button>
		</div>
	</form:form>
</div>
