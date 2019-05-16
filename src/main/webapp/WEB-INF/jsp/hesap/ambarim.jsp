<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@  taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<div class="panel panel-default">
	<div class="row">
		<div class="col-sm-5">
			<div class="panel panel-default">
				<div class="panel-heading">
					<strong> <c:choose>
							<c:when test="${empty personeller}">
								<span class="glyphicon glyphicon-list"></span> ${ambar.ad} | Personel Listesi   <p
									class="text-danger fa fa-exclamation-triangle"
									aria-hidden="true">Henüz personel bilgilerinizi girmediniz.</p>
							</c:when>
							<c:otherwise>
								<span class="glyphicon glyphicon-list"></span> ${ambar.ad} | Personel Listesi
				</c:otherwise>
						</c:choose>
					</strong>
					<div class="btn-group pull-right">
						<a href="javascript:void(0);" class="btn btn-default btn-sm"
							onclick="addForm1('form')" title="Yeni Personel Oluştur"> <span
							class="glyphicon glyphicon-plus-sign"></span>
						</a> <a href="javascript:void(0);" class="btn btn-default btn-sm"
							onclick="refresh('user')" title="Refresh User"> <span
							class="glyphicon glyphicon-refresh"></span>
						</a>
					</div>
				</div>
				<div class="sonuc-jsp panel-body">
					<table
						class="table table-bordered table-condensed table-hover table-striped">
						<thead>
							<tr>
								<th>Kullanıcı adı</th>
								<th>Sil</th>
							</tr>
						</thead>
						<tbody>
							<c:choose>
								<c:when test="${personeller.size() > 0}">
									<c:forEach items="${personeller}" var="personel">
										<tr>
											<td>${personel.userName}</td>
											<td><a href="javascript:void(0);"
												onclick="deleteData('/ortak/delete', '${personel.id}','personel','hesap/ambarim?page=1')"><span
													class="glyphicon glyphicon-trash"></span></a></td>
										</tr>
									</c:forEach>
								</c:when>
								<c:otherwise>
									<tr align="center">
										<td colspan="8">Hiç personel yok.</td>
									</tr>
								</c:otherwise>
							</c:choose>
						</tbody>
					</table>
				</div>
				<div class="panel-footer"></div>
			</div>
		</div>
		<div class="col-sm-7">
			<div class="panel panel-default">
				<div class="panel-heading">
					<strong> <c:choose>
							<c:when test="${empty adresler}">
								<span class="glyphicon glyphicon-list"></span>  ${ambar.ad} | Adres Bilgileri   <p
									class="text-danger fa fa-exclamation-triangle"
									aria-hidden="true">Henüz adres bilgilerinizi girmediniz.</p>
							</c:when>
							<c:otherwise>
								<span class="glyphicon glyphicon-edit"></span> ${ambar.ad} | Adres Bilgileri
				</c:otherwise>
						</c:choose>
					</strong>
					<div class="btn-group pull-right">
						<a href="javascript:void(0);" class="btn btn-default btn-sm"
							onclick="gonderiForm('form/adres?neyi=ambar')"
							title="Yeni adres kaydet"> <span
							class="glyphicon glyphicon-plus-sign"></span>
						</a> <a href="javascript:void(0);" class="btn btn-default btn-sm"
							onclick="refresh('user')" title="Refresh User"> <span
							class="glyphicon glyphicon-refresh"></span>
						</a>
					</div>
				</div>
				<div class="adres-jsp">
				<div class="panel-body">
					<table
						class="table table-bordered table-condensed table-hover table-striped">
						<thead>
							<tr>
								<th>Başlık</th>
								<th>Adres</th>
								<th>Telefon No</th>
								<th>Sil</th>
							</tr>
						</thead>
						<tbody>
							<c:choose>
								<c:when test="${adresler.size() > 0}">
									<c:forEach items="${adresler}" var="adres">
										<tr>
											<td>${adres.baslik}</td>
											<td>${adres.mahalle}${adres.il}/${adres.ilce}</td>
											<td><c:forEach items="${adres.telefonNo}" var="telNo">
													<li>${telNo.key}:${telNo.value}</li>
												</c:forEach></td>
											<td><a href="javascript:void(0);"
												onclick="deleteData('/ortak/delete', '${adres.id}','adres','hesap/ambarim?page=1')"><span
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
				<c:if test="${adresler.size() > 0}">
					<div class="panel-footer">
						Showing ${current} to ${end} of ${totalElements}
						<ul class="pagination pull-right" style="margin: -7px;">
							<c:choose>
								<c:when test="${current == 1}">
									<li class="disabled"><a href="javascript:void(0);">First</a></li>
									<li class="disabled"><a href="javascript:void(0);">Prev</a></li>
								</c:when>
								<c:otherwise>
									<li><a href="javascript:void(0);"
										onclick="list('adres/listPage', '1', 'ambarim')">First</a></li>
									<li><a href="javascript:void(0);"
										onclick="list('adres/listPage', '${current - 1}', 'ambarim')">Prev</a></li>
								</c:otherwise>
							</c:choose>
							<c:forEach begin="${begin}" end="${end}" var="i">
								<c:choose>
									<c:when test="${i == current}">
										<li class="active"><a href="javascript:void(0);"
											onclick="list('adres/listPage', '${i}', 'ambarim')">${i}</a></li>
									</c:when>
									<c:otherwise>
										<li><a href="javascript:void(0);"
											onclick="list('adres/listPage', '${i}', 'ambarim')">${i}</a></li>
									</c:otherwise>
								</c:choose>
							</c:forEach>
							<c:choose>
								<c:when test="${current == totalPages}">
									<li class="disabled"><a href="javascript:void(0);">Next</a></li>
									<li class="disabled"><a href="javascript:void(0);">Last</a></li>
								</c:when>
								<c:otherwise>
									<li><a href="javascript:void(0);"
										onclick="list('adres/listPage', '${current + 1}', 'ambarim')">Next</a></li>
									<li><a href="javascript:void(0);"
										onclick="list('adres/listPage', '${totalPages}', 'ambarim')">Last</a></li>
								</c:otherwise>
							</c:choose>
						</ul>
					</div>
				</c:if>
				</div>
			</div>

		</div>
	</div>
</div>