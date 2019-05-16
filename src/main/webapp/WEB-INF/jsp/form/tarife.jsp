<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@  taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<script type="text/javascript" src="${path}/js/jquery.save.js"></script>
<div class="panel panel-default">
	<div class="panel-heading">
		<strong> <c:choose>
				<c:when test="${empty sozlesme.id}">
					<span class="glyphicon glyphicon-plus-sign"></span> Tarife Kaydı
				</c:when>
				<c:otherwise>
					<span class="glyphicon glyphicon-edit"></span> Tarife Güncelleme
				</c:otherwise>
			</c:choose>
		</strong>
	</div>
	<form:form method="post" class="form-horizontal" action="${path}/add/sozlesme" modelAttribute="sozlesme"
		 id="userBilgi">
		<form:hidden path="id" />
		<div class="panel-body">
			<div class="form-group">
				<label class="col-md-2 control-label">Nereden İl : </label>
				<div class="col-md-4">
					<form:select class="form-control" id="neredenIl" path="neredenIl">
						<option value="-1">-Select-</option>
						<form:options items="${iller}" itemValue="ad" itemLabel="ad"></form:options>
					</form:select>
				</div>
				<label class="col-md-2 control-label">Nereden İlçe : </label>
				<div class="col-md-4">
					<form:select class="form-control" id="neredenIlce" path="neredenIlce">
						<option value="-1">-Select-</option>
					</form:select>
				</div>
			</div>
			<div class="form-group">
				<label class="col-md-2 control-label">Nereye İl : </label>
				<div class="col-md-4">
					<form:select class="form-control" id="nereyeIl" path="nereyeIl">
						<option value="-1">-Select-</option>
						<form:options items="${iller}" itemValue="ad" itemLabel="ad"></form:options>
					</form:select>
				</div>
				<label class="col-md-2 control-label">Nereye İlçe : </label>
				<div class="col-md-4">
					<form:select class="form-control" id="nereyeIlce" path="nereyeIlce">
						<option value="-1">-Select-</option>
					</form:select>
				</div>
			</div>
			<div class="form-group">
				<label data-domain="domain.com" class="col-md-2 control-label">Birim fiyat : </label>
				<div class="col-md-4">
					<form:input type="text" class="form-control" path="birimFiyat" 
						placeholder="1 desi veya 1kg. TL olarak fyt giriniz." />
					<form:errors path="birimFiyat"></form:errors>
					
				</div>
				<label class="col-md-2 control-label">Tesmt süresi : </label>
				<div class="col-md-4">
					<form:input class="form-control" path="teslimatSüresi"
						placeholder="Saat olarak max. teslim süresini giriniz." />
					<form:errors path="teslimatSüresi"></form:errors>
				</div>
			</div>
		</div>
		<div class="panel-footer">
			<form:button value="save"
				class="btn btn-xs btn-default"> <span
				class="glyphicon glyphicon-floppy-disk"></span> <c:choose>
					<c:when test="${empty adres.id}"> Kayıt</c:when>
					<c:otherwise> Güncelle</c:otherwise>
				</c:choose>
			</form:button>
		</div>
	</form:form>
</div>

<!-- <link rel="stylesheet" type="text/css" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-select/1.12.2/css/bootstrap-select.min.css">

<div class="container">
  <select class="selectpicker" multiple data-title="Options" data-size="10" data-width="100%" data-selected-text-format="static">
    <option value="1">1</option>
    <option value="2">2</option>
    <option value="3">3</option>
    <option value="4">4</option>
    <option value="5">5</option>
    <option value="6">6</option>
    <option value="7">7</option>
    <option value="8">8</option>
    <option value="9">9</option>
    <option value="10">10</option>
    <option value="11">11</option>
    <option value="12">12</option>
  </select>
</div>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-select/1.12.2/js/bootstrap-select.min.js"></script>
 -->