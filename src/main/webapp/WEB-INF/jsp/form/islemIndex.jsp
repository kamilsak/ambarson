<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@  taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<script type="text/javascript" src="${path}/js/jquery.save.js"></script>
<script>
	jQuery(function() {
		jQuery('#modal').click();
	});
</script>
<div class="panel panel-default">
	<div class="row">
		<div class="col-sm-5">
			<div class="panel panel-default">
				<div class="panel-heading">
					<strong> <c:choose>
							<c:when test="${empty islem.id}">
								<span class="glyphicon glyphicon-pencil"></span> Musteri | İşlem süreci   
							</c:when>
							<c:otherwise>
								<span class="glyphicon glyphicon-save-file"></span> Musteri | İşlem süreci
				</c:otherwise>
						</c:choose>
					</strong>
				</div>
				<c:choose>
					<c:when test="${empty islem.id}">
						<form:form method="post" class="form-horizontal" id="userBilgi"
							action="${path}add/tip?neyi=${neyi}" modelAttribute="islem">
							<div class="sonuc-jsp panel-body">
								<table class=" table  ">
									<thead>
										<tr>
											<th>İşlem tipini seçiniz</th>
										</tr>
									</thead>
									<tbody>
										<tr>
											<td><form:hidden path="id" />
												<div class="form-group">
													<div class="col-md-12">
														<label>İşlem tipini seçiniz</label>
														<form:select class="form-control" path="islemTipi">
															<option value="-1">-Seçiniz-</option>
															<form:options></form:options>
														</form:select>
													</div>
												</div></td>
										</tr>
										<tr>
											<td>İşlem tipini seçiniz</td>
										</tr>
									</tbody>
								</table>
							</div>
							<div class="panel-footer">
								<form:button value="save" class="btn btn-xs btn-default">
									<span class="glyphicon glyphicon-ok"></span>
									<c:choose>
										<c:when test="${empty islem.id}"> Devam et</c:when>
										<c:otherwise> Güncelle</c:otherwise>
									</c:choose>
								</form:button>
							</div>
						</form:form>
					</c:when>
					<c:otherwise>
						<div class="sonuc-jsp panel-body">
							<table class="table">
								<thead>
									<tr>
										<th colspan="2">İşlem durumu</th>
									</tr>
								</thead>
								<tbody>
									<tr>
										<th>İşlem tipi :</th>
										<td>${islem.islemTipi}<a href="javascript:void(0);"
											id="modal" onclick="list('${abc}', '1', '${neyi}')"></a></td>
									</tr>
									<c:if test="${islem.islemTipi.ordinal() == 0}">
										<c:if test="${not empty islem.gonderici}">
											<tr>
												<th><a href="javascript:void(0);"
												onclick="list('form/userBveAdresSec', '1', 'islemGonderici')"> Gönderici bilgileri :</a></th>
												<td>${userBilgileriGon.unvan}  |  ${userBilgileriGon.ad }
													${userBilgileriGon.soyad}</td>
											</tr>
										</c:if>
										<c:if test="${not empty adreslerGon}">
											<tr>
												<th>Gönderici adresi :</th>
												<td>${adreslerGon.mahalle}  ${adreslerGon.il}
													${adreslerGon.ilce} <c:forEach
														items="${adreslerGon.telefonNo}" var="telNo">
														<li>${telNo.key} : ${telNo.value}</li>
													</c:forEach>
												</td>
											</tr>
										</c:if>
									</c:if>
									<c:if test="${not empty islem.alici}">
										<tr>
											<th>Alici bilgileri</th>
											<td>${userBilgileriAl.unvan}  |  ${userBilgileriAl.ad }
												${userBilgileriAl.soyad}</td>
										</tr>
									</c:if>
									<c:if test="${not empty adreslerAl}">
										<tr>
											<th>Alici adresi :</th>
											<td>${adreslerAl.mahalle}  ${adreslerAl.il}
												${adreslerAl.ilce} <c:forEach
													items="${adreslerAl.telefonNo}" var="telNo">
													<li>${telNo.key} : ${telNo.value}</li>
												</c:forEach>
											</td>
										</tr>
									</c:if>
									<c:if test="${islem.islemTipi.ordinal() == 1}">
										<c:if test="${not empty islem.gonderici}">
											<tr>
												<th>Gönderici bilgileri :</th>
												<td>${userBilgileriGon.unvan}  |  ${userBilgileriGon.ad }
													${userBilgileriGon.soyad}</td>
											</tr>
										</c:if>
										<c:if test="${not empty adreslerGon}">
											<tr>
												<th>Gönderici adresi :</th>
												<td>${adreslerGon.mahalle}  $  {adreslerGon.il}
													${adreslerGon.ilce} <c:forEach
														items="${adreslerGon.telefonNo}" var="telNo">
														<li>${telNo.key} : ${telNo.value}</li>
													</c:forEach>
												</td>
											</tr>
										</c:if>
									</c:if>
									<c:if test="${mallar.size() > 0}">
										<tr>
											<th>Mal bilgileri :</th>
											<td><c:forEach items="${mallar}" var="mal">
													<li>${mal.icerik}  ${mal.agirlik}kg ${mal.hacim}ds</li>
												</c:forEach></td>
										</tr>
									</c:if>
									<c:if test="${not empty islem.ambar}">
										<tr>
											<th>Ambar :</th>
											<td>${ambar.ad}</td>
										</tr>
									</c:if>
								</tbody>
							</table>
						</div>
						<div class="panel-footer">
							<button
								onclick="deleteData('/ortak/delete', '${islem.id}','islem','islem/index?page=1')"
								class="btn btn-xs btn-default">
								<span class="glyphicon glyphicon-remove"></span> işlemi iptal et
							</button>
						</div>
					</c:otherwise>
				</c:choose>
			</div>
		</div>

		<div class="adres-jsp col-sm-7">gdfg</div>
	</div>
</div>