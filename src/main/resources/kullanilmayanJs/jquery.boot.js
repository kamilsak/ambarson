//var pageConstant = "?page=0&size=3";

$(function() {
	
	/*  /hesap/hesabim
	*/
	$("#hesap").click(function() {
		fetchList("hesap");
	});
	$("#adres").click(function() {
		fetchList("adres");
	});
});


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

function formEdit(type, id) {
	modifyData(type+"/edit/"+id);
}
var pageConstant = "?page=1";
function fetchList(type) {
	modifyData("/"+type+"/hesabim"+pageConstant);
}

function refresh(type) {
	modifyData(type+"/refresh"+pageConstant);
}

function list(type, page) {
	modifyData(type+"/hesabim?page="+page);
}
/*patron/form
*/
function addForm1(type) {
	modifyData1("/"+type+"/form");
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

