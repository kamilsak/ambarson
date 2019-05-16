<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@  taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<script type="text/javascript" src="${path}/js/jquery.save.js"></script>

<div class="panel panel-default">
	<div class="panel-heading">
		<strong> <c:choose>
				<c:when test="${empty adres.id}">
					<span class="glyphicon glyphicon-plus-sign"></span> Adres Kaydı
				</c:when>
				<c:otherwise>
					<span class="glyphicon glyphicon-edit"></span> Adres Güncelleme
				</c:otherwise>
			</c:choose>
		</strong>
	</div>
	<form:form method="post" class="form-horizontal" modelAttribute="adres"
		 id="personelKayit"  action="patron/addAmbarAdres"  >
		<form:hidden path="id" />
		<div class="panel-body">
			<div class="form-group">
				<label class="col-md-2 control-label">Başlık : </label>
				<div class="col-md-4">
					<form:input class="form-control" path="baslik"
						placeholder="Örnek: Merkez adres vb.." />
					<form:errors path="baslik"></form:errors>
				</div>
			</div>
			<div class="form-group">
				<label class="col-md-2 control-label">Adres detay : </label>
				<div class="col-md-10">
					<form:textarea class="form-control" path="mahalle"
						placeholder="Mah,sokak,no vb." />
					<form:errors path="mahalle"></form:errors>
				</div>
			</div>
			<div class="form-group">
				<label class="col-md-2 control-label">İl : </label>
				<div class="col-md-4">
					<form:select class="form-control" id="selectCategory555555" path="il">
						<option value="-1">-Select-</option>
						<form:options items="${iller}" itemValue="ad" itemLabel="ad"></form:options>
					</form:select>
				</div>
				<label class="col-md-2 control-label">İlçe : </label>
				<div class="col-md-4">
					<form:select class="form-control" id="selectSubcat555555" path="ilce">
						<option value="-1">-Select-</option>
					</form:select>
				</div>
			</div>
			<div class="form-group">
				<label class="col-md-2 control-label">Cep Tel No : </label>
				<div class="col-md-4">
					<form:input class="form-control" path="telefonNo[cep]"
						placeholder="Cep Tel Numaranızı Giriniz." />
				</div>
			</div>
			<div class="form-group">
				<label class="col-md-2 control-label">Sabit Tel No : </label>
				<div class="col-md-4">
					<form:input class="form-control" path="telefonNo[tel]"
						placeholder="Sabit tel no giriniz." />
				</div>
			</div>
			<div class="form-group">
				<label class="col-md-2 control-label">Sabit Tel No 2 : </label>
				<div class="col-md-4">
					<form:input class="form-control" path="telefonNo[tel2]"
						placeholder="Sabit bir tel no daha giriniz." />
				</div>
			</div>
		</div>
		<div class="panel-footer">
			<form:button value="save"  class="btn btn-xs btn-default" >
				<span class="glyphicon glyphicon-floppy-disk"></span>
				 Kayıt
			</form:button>
		</div>
	</form:form>
</div>
