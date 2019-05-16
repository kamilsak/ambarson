//var pageConstant = "?page=0&size=3";

$(function() {
	
	/*  /hesap/hesabim
	*/
	$("#hesabim").click(function() {
		fetchList("/hesap/hesabim");
	});
	$("#ambarim").click(function() {
		fetchList("/hesap/ambarim");
	});
	$("#adres").click(function() {
		fetchList("/adres/listPage");
	});
	$("#tarifeler").click(function() {
		fetchList("/hesap/tarifeler");
	});
});
var pageConstant = "?page=1";
function fetchList(type) {
	modifyData(type+pageConstant);
}

/*  /user/form
 * 
*/
function addForm(type) {
	modifyData("/"+type+"/form");
}
/*/musteri/formAdres
 *  /patron/add
*/
function gonderiForm(type) { 
	modifyData(type);
}
/*patron/form
*/
function addForm1(type) {
	modifyData1("/"+type+"/personel");
}

function list(type, page,arm) {
	modifyData2(type+"?page="+page+"&neyi="+arm);
}
function modifyData(suffix) {
	$.ajax({
		type : "GET",
		url :suffix,
		success : function(data) {
			$(".inner-jsp").html(data);
		}
	});
}
function modifyData1(suffix) {
	$.ajax({
		type : "GET",
		url :suffix,
		success : function(data) {
			$(".sonuc-jsp").html(data);
		}
	});
}
function modifyData2(suffix) {
	$.ajax({
		type : "GET",
		url :suffix,
		success : function(data) {
			$(".adres-jsp").html(data);
		}
	});
}
function gonderiForm1(type) { 
	modifyData3(type);
}
function modifyData3(suffix) {
	$.ajax({
		type : "GET",
		url :suffix,
		success:function(data) {
			if(data.status == "basarili") {
				toastr.success(data.message, data.title, {
					closeButton:true
				});
				gonderiForm(data.urlgit);
				
			} else {
				toastr.error(data.message, data.title, {
					allowHtml:true,
					closeButton:true
				});
			}
		}
	});
}
function deleteData(type, id,kim,armt) { 
	toastr.warning("<div>Silmek istediğinizden eminmisiniz?</div>" +
			"<div class='btn-group pull-right'>" +
			"<button type='button' id='confirmationYes' class='btn btn-xs btn-default'><i class='glyphicon glyphicon-ok'></i> Evet </button>" +
			"<button type='button' class='btn btn-xs btn-default clear'><i class='glyphicon glyphicon-remove'></i> Hayır</button>" +
			"</div>", "Silme işlemi", {
		allowHtml:true,
		closeButton:true,
		onShown: function() {
			$("#confirmationYes").click(function() {
				$.ajax({
					type : "GET",
					url : type+"/"+id+"/?neyisil="+kim,
					success : function(data) {
						gonderiForm(armt);
						toastr.success(data.message, "Silindi", {
							closeButton:true
						});
					}
				});
			});
		}
	});
}

