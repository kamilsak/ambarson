<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@  taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<script type="text/javascript" src="${path}/js/jquery.save.js"></script>
<div class="row">
	<div class="col-sm-5">
		<div class="panel panel-default">
			<div class="panel-heading">
				<strong> <c:choose>
						<c:when test="${isNew}">
							<span class="glyphicon glyphicon-list"></span>
						</c:when>
						<c:otherwise>
							<span class="glyphicon glyphicon-edit"></span>
						</c:otherwise>
					</c:choose> Hesabım | ${user.email}
				</strong>
			</div>

			<div class="panel-body">
				<div class="row">
					<div class="col-sm-6">
						<table class="table  table-condensed table-hover table-striped">
							<thead>
								<tr>
									<th>Kullanıcı Adı</th>
								</tr>
							</thead>
							<tbody>
								<tr>
									<td>${user.userName}</td>
								</tr>
							</tbody>
						</table>
					</div>
					<div class="col-sm-6">
						<table class="table  table-condensed table-hover table-striped">
							<thead>
								<tr>
									<th>Şifre Bilgileri</th>
								</tr>
							</thead>
							<tbody>
								<tr>
									<td><div class="form-group">
											<a href="javascript:void(0);" type="button"
												class="fa fa-hand-o-down " aria-hidden="true"
												data-toggle="collapse" data-target="#demo"> şifremi
												güncelle</a>
											<div id="demo" class="collapse">
												<form:form method="post" class="form-horizontal"
													action="${path}/add/user" modelAttribute="user"
													id="submitUserForm">
													<form:hidden path="id" />
													<form:hidden path="userName" value="userName" />
													<form:password class="form-control input-sm"
														path="password" placeholder="Şifrenizi Giriniz." />
													<form:errors path="password"></form:errors>
													<form:button value="Save" class="btn btn-xs btn-default">
														<span class="glyphicon glyphicon-floppy-disk">Güncelle</span>
													</form:button>
												</form:form>
											</div>
										</div></td>
								</tr>
							</tbody>
						</table>
					</div>
				</div>
			</div>
			<div class="panel-footer"></div>
		</div>
	</div>
	<div class="col-sm-7">
		<div class="panel panel-default">
			<div class="panel-heading">
				<strong> <c:choose>
						<c:when test="${empty theUserBilgileri.id}">
							<span class="glyphicon glyphicon-list"></span>  Adres Bilgilerim   <p
								class="text-danger fa fa-exclamation-triangle"
								aria-hidden="true"> Önce kişisel bilgilerinizi girmelisiniz.</p>
						</c:when>
						<c:otherwise>
							<span class="glyphicon glyphicon-edit"></span> Adres Bilgilerim 
				</c:otherwise>
					</c:choose>
				</strong>
				<c:if test="${not empty theUserBilgileri.id}">
					<div class="btn-group pull-right">
						<a href="javascript:void(0);" class="btn btn-default btn-sm"
							onclick="gonderiForm('form/adres?neyi=user')"
							title="Yeni adres kaydet"> <span
							class="glyphicon glyphicon-plus-sign"></span>
						</a> <a href="javascript:void(0);" class="btn btn-default btn-sm"
							onclick="refresh('user')" title="Refresh User"> <span
							class="glyphicon glyphicon-refresh"></span>
						</a>
					</div>
				</c:if>
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
												onclick="deleteData('/ortak/delete', '${adres.id}','adres','hesap/hesabim?page=1')"><span
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
										onclick="list('adres/listPage', '1', 'hesabim')">First</a></li>
									<li><a href="javascript:void(0);"
										onclick="list('adres/listPage', '${current - 1}', 'hesabim')">Prev</a></li>
								</c:otherwise>
							</c:choose>
							<c:forEach begin="${begin}" end="${end}" var="i">
								<c:choose>
									<c:when test="${i == current}">
										<li class="active"><a href="javascript:void(0);"
											onclick="list('adres/listPage', '${i}', 'hesabim')">${i}</a></li>
									</c:when>
									<c:otherwise>
										<li><a href="javascript:void(0);"
											onclick="list('adres/listPage', '${i}', 'hesabim')">${i}</a></li>
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
										onclick="list('adres/listPage', '${current + 1}', 'hesabim')">Next</a></li>
									<li><a href="javascript:void(0);"
										onclick="list('adres/listPage', '${totalPages}', 'hesabim')">Last</a></li>
								</c:otherwise>
							</c:choose>
						</ul>
					</div>
				</c:if>
			</div>
		</div>
	</div>
</div>

<div class="row">
	<div class="col-sm-5">
		<div class="panel panel-default">
			<div class="panel-heading">
				<strong> <c:choose>
						<c:when test="${empty theUserBilgileri.id}">
							<span class="glyphicon glyphicon-list"></span>  Kişisel Bilgilerim   <p
								class="text-danger fa fa-exclamation-triangle"
								aria-hidden="true">Henüz kişisel bilgilerinizi girmediniz.</p>
						</c:when>
						<c:otherwise>
							<span class="glyphicon glyphicon-edit"></span> Kişisel Bilgilerim 
				</c:otherwise>
					</c:choose>
				</strong>
				<c:if test="${not empty theUserBilgileri.id}">
					<div class="btn-group pull-right">
						<a href="javascript:void(0);" class="btn btn-default btn-sm"
							onclick="gonderiForm('form/userBilgileri?neyi=user')" title="Düzenle">
							<span class="glyphicon glyphicon-edit"></span>
						</a> <a href="javascript:void(0);" class="btn btn-default btn-sm"
							onclick="refresh('user')" title="Refresh User"> <span
							class="glyphicon glyphicon-refresh"></span>
						</a>
					</div>
				</c:if>
			</div>
			
			<c:if test="${not empty theUserBilgileri.id}">
				<div class="panel-body">

					<table
						class="table table-bordered table-condensed table-hover table-striped">
						<thead>
							<tr>
								<th>Ünvan</th>
								<th>Adınız</th>
								<th>Soyadınız</th>
							</tr>
						</thead>
						<tbody>
							<tr>
								<td>${theUserBilgileri.unvan}</td>
								<td>${theUserBilgileri.ad}</td>
								<td>${theUserBilgileri.soyad}</td>
							</tr>
						</tbody>
					</table>
				</div>
			</c:if>
			<div class="panel-footer">
				<c:if test="${empty theUserBilgileri.id}">
					<a href="javascript:void(0);"
						onclick="gonderiForm('form/userBilgileri?neyi=user')"
						class="btn btn-xs btn-default"> <span
						class="glyphicon glyphicon-floppy-disk"></span> Kayıt
					</a>
				</c:if>
			</div>
		</div>
	</div>


</div>
