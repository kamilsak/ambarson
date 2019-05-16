<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@  taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
			<div class="panel panel-default">
				<div class="panel-heading">
					<strong> <c:choose>
							<c:when test="${empty sozlesmeler}">
								<span class="glyphicon glyphicon-list"></span>  ${ambar.ad} | Tarife Listesi   <p
									class="text-danger fa fa-exclamation-triangle"
									aria-hidden="true">Henüz tarife bilgilerinizi girmediniz.</p>
							</c:when>
							<c:otherwise>
								<span class="glyphicon glyphicon-edit"></span> ${ambar.ad} | Tarife Listesi
				</c:otherwise>
						</c:choose>
					</strong>
					<div class="btn-group pull-right">
						<a href="javascript:void(0);" class="btn btn-default btn-sm"
							onclick="gonderiForm('form/tarife')"
							title="Yeni tarife kaydet"> <span
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
						class="table table-bordered table-condensed table-hover table-striped ">
						<thead  >
							<tr >
								<th colspan="2"><p class="text-center">Nereden</p></th>
								<th colspan="2"><p class="text-center">Nereye</p></th>
								
							</tr>
							<tr>
								<th>İl</th>
								<th>İlce</th>
								<th>İl</th>
								<th>İlce</th>
								<th>Brm Fiyat</th>
								<th>Tes. Süresi</th>
							</tr>
						</thead>
						<tbody>
							<c:choose>
								<c:when test="${sozlesmeler.size() > 0}">
									<c:forEach items="${sozlesmeler}" var="sozlesme">
										<tr>
											<td>${sozlesme.neredenIl}</td>
											<td>${sozlesme.neredenIlce}</td>
											<td>${sozlesme.nereyeIl}</td>
											<td>${sozlesme.nereyeIlce}</td>
											<td>${sozlesme.birimFiyat}</td>
											<td>${sozlesme.teslimatSüresi}</td>
											<td><a href="javascript:void(0);"
												onclick="deleteData('/ortak/delete', '${sozlesme.id}','adres','hesap/ambarim?page=1')"><span
													class="glyphicon glyphicon-trash"></span></a></td>
										</tr>
									</c:forEach>
								</c:when>
								<c:otherwise>
									<tr align="center">
										<td colspan="8">Tarife bulunamadı</td>
									</tr>
								</c:otherwise>
							</c:choose>
						</tbody>
					</table>
				</div>
				<c:if test="${sozlesmeler.size() > 0}">
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
										onclick="list('adres/listPage', '1', '&neyi=ambar')">First</a></li>
									<li><a href="javascript:void(0);"
										onclick="list('adres/listPage', '${current - 1}', '&neyi=ambar')">Prev</a></li>
								</c:otherwise>
							</c:choose>
							<c:forEach begin="${begin}" end="${end}" var="i">
								<c:choose>
									<c:when test="${i == current}">
										<li class="active"><a href="javascript:void(0);"
											onclick="list('adres/listPage', '${i}', '&neyi=ambar')">${i}</a></li>
									</c:when>
									<c:otherwise>
										<li><a href="javascript:void(0);"
											onclick="list('adres/listPage', '${i}', '&neyi=ambar')">${i}</a></li>
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
										onclick="list('adres/listPage', '${current + 1}', '&neyi=ambar')">Next</a></li>
									<li><a href="javascript:void(0);"
										onclick="list('adres/listPage', '${totalPages}', '&neyi=ambar')">Last</a></li>
								</c:otherwise>
							</c:choose>
						</ul>
					</div>
				</c:if>
				</div>
			</div>
<input type="date" id="myDate" value="2014-02-09">
<script>
function myFunction() {
  var x = document.getElementById("myDate").value;
  document.getElementById("demo").innerHTML = x;
}
</script>
<input type="number" id="myNumber" placeholder="Quantity">
<script>
function myFunction() {
  document.getElementById("myNumber").placeholder = "Amount";
}
</script>

			