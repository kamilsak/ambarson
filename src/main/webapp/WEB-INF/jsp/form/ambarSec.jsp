<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@  taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<script type="text/javascript" src="${path}/js/jquery.save.js"></script>
<div class="panel panel-default">
	<div class="panel-heading">
		<strong> <span class="glyphicon glyphicon-check"></span>
			Ambar seç
		</strong>
	</div>

	<form:form method="post" class="form-horizontal" id="userBilgi"
		action="${path}/add/tip?neyi=${neyi}" modelAttribute="islem">
		<form:hidden path="id" />
		<form:hidden path="durum" />
		<form:hidden path="islemiOlusturan" />
		<form:hidden path="islemTipi" />
		<form:hidden path="gonderici" />
		<form:hidden path="alici" />
		<form:hidden path="adresGon" />
		<form:hidden path="adresAl" />
		<div class="panel-body">
			<div class="form-group">
				<label class="col-md-2 control-label">Ambar : </label>
				<div class="col-md-4">
					<form:select class="form-control" path="ambar">
						<option value="-1">-Select-</option>
						<form:options items="${ambarlar}" itemValue="id" itemLabel="ad"></form:options>
					</form:select>
				</div>
			</div>
		</div>
		<div class="panel-footer">
			<button value="save" class="btn btn-xs btn-default">
				<span class="glyphicon glyphicon-ok"></span>
				<c:choose>
					<c:when test="${empty islem.ambar}"> Devam et</c:when>
					<c:otherwise> Güncelle</c:otherwise>
				</c:choose>
			</button>
		</div>
	</form:form>
</div>
