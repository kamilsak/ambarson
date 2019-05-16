<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@  taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<script type="text/javascript" src="${path}/js/jquery.save.js"></script>
<style>
.my-custom-scrollbar {
	position: relative;
	height: 200px;
	overflow: auto;
}

.table-wrapper-scroll-y {
	display: block;
}
</style>
<div class="panel panel-default">
	<div class="panel-heading">
		<strong> <c:if test="${neyi.equals('islemGonderici')}">
		
				<span class="glyphicon glyphicon-pencil"></span> Gönderici bilgilerini giriniz
		 </c:if> <c:if test="${neyi.equals('islemAlici')}">
				<span class="glyphicon glyphicon-pencil"></span> Alıcı bilgilerini giriniz
		</c:if>
		</strong>
		<div class="btn-group pull-right"> <button  onclick="list('${abc}', '1', '${neyi}')"
				class="btn btn-xs btn-default"> <span
				class="glyphicon glyphicon-pencil"></span> <c:choose>
						<c:when test="${neyi.equals('islemGonderici')}"> Yeni gönderici</c:when>
						<c:otherwise> Yeni alıcı </c:otherwise></c:choose>
			</button></div>
	</div>
	<div class="table-wrapper-scroll-y my-custom-scrollbar">
		<div class="panel-body">
			<table class="table ">
				<thead>
					<tr>
						<th colspan="4" class="text-center" >Kayıt Defteriniz</th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<td colspan="3" class="text-center">Benim</td>
						<td><a href="javascript:void(0);"
							onclick="list('form/userBveAdresSec', '${benim}','${neyi}')"><span
								class="glyphicon glyphicon-saved">seçiniz</span></a></td>
					</tr>
					<c:forEach items="${musteriList}" var="musteri">
					<tr>
						<th>${musteri.unvan}</th>
						<td>${musteri.ad}</td>
						<td>${musteri.soyad}</td>
						<td><a href="javascript:void(0);"
							onclick="list('form/userBveAdresSec', '${musteri.id}','${neyi}')"><span
								class="glyphicon glyphicon-saved">seçiniz</span></a></td>
					</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>

	<br> <br>
	<div class="table-wrapper-scroll-y my-custom-scrollbar">
		<div class="panel-body">
			<h4 class="text-center text-fixed"> <c:if test="${not empty userr.id}"> ${userr.unvan} |</c:if> adres
				listesi</h4>
			<table class="table table-bordered table-hover table-striped mb-0">
				<thead>
					<tr>
						<th>Başlık</th>
						<th>Adres</th>
						<th>Telefon No</th>
						<th>Seçim</th>
					</tr>
				</thead>
				<tbody>
					<c:choose>
						<c:when test="${adresler.size() > 0}">
							<c:forEach items="${adresler}" var="adres">
								<tr>
									<td>${adres.baslik}</td>
									<td>${adres.mahalle}  : ${adres.ilce}/${adres.il}</td>
									<td><c:forEach items="${adres.telefonNo}" var="telNo">
											<li>${telNo.key}:${telNo.value}</li>
										</c:forEach></td>
									<td><a href="javascript:void(0);"
										onclick="gonderiForm1('add/islemGonAlAdd?page=${adres.id}&neyi=${neyi}')"><span
											class="glyphicon glyphicon-trash"></span></a></td>
								</tr>
							</c:forEach>
						</c:when>
						<c:otherwise>
							<tr align="center">
								<td colspan="8">Adres bulunamadı</td>
							</tr>
						</c:otherwise>
					</c:choose>
				</tbody>
			</table>
		</div>
	</div>

	<%-- <form:form method="post" class="form-horizontal" action="adres/add?neyi=${neyi}" modelAttribute="adres"
		 id="personelKayit">
		<form:hidden path="id" />
		<div class="panel-body">
			<div class="form-group">
				<label class="col-md-2 control-label">Başlık : </label>
				<div class="col-md-4">
					<form:input class="form-control" path="baslik"
						placeholder="Örnek: Merkez, şube vb.." />
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
					<form:select class="form-control" id="selectCategory" path="il">
						<option value="-1">-Select-</option>
						<form:options items="${iller}" itemValue="ad" itemLabel="ad"></form:options>
					</form:select>
				</div>
				<label class="col-md-2 control-label">İlçe : </label>
				<div class="col-md-4">
					<form:select class="form-control" on path="ilce">
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
			<form:button value="save"
				class="btn btn-xs btn-default"> <span
				class="glyphicon glyphicon-floppy-disk"></span> <c:choose>
					<c:when test="${empty adres.id}"> Kayıt</c:when>
					<c:otherwise> Güncelle</c:otherwise>
				</c:choose>
			</form:button>
		</div>
	</form:form> --%>
</div>
