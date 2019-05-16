<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@  taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
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
									onclick="deleteData('/ortak/delete', '${adres.id}','adres','hesap/${userAmbar}?page=1')"><span
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
							onclick="list('adres/listPage', '1', '${userAmbar}')">First</a></li>
						<li><a href="javascript:void(0);"
							onclick="list('adres/listPage', '${current - 1}', '${userAmbar}' )">Prev</a></li>
					</c:otherwise>
				</c:choose>
				<c:forEach begin="${begin}" end="${end}" var="i">
					<c:choose>
						<c:when test="${i == current}">
							<li class="active"><a href="javascript:void(0);"
								onclick="list('adres/listPage', '${i}', '${userAmbar}')">${i}</a></li>
						</c:when>
						<c:otherwise>
							<li><a href="javascript:void(0);"
								onclick="list('adres/listPage', '${i}', '${userAmbar}')">${i}</a></li>
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
							onclick="list('adres/listPage', '${current + 1}', '${userAmbar}')">Next</a></li>
						<li><a href="javascript:void(0);"
							onclick="list('adres/listPage', '${totalPages}', '${userAmbar}')">Last</a></li>
					</c:otherwise>
				</c:choose>
			</ul>
		</div>
	</c:if>
















<%-- <div class="panel-footer">
		<a href="javascript:void(0);" id="buton"
			class="btn btn-xs btn-default"> <span
			class="glyphicon glyphicon-floppy-disk"></span> <c:choose>
				<c:when test="${isNew}"> Kayıt</c:when>
				<c:otherwise> Update</c:otherwise>
			</c:choose>
		</a>
	</div>
 --%>
