/*$(function() {
	alert("selamlar");
});
*/
$(function() {
	/*  /user/add
	 *  /musteri/addAmbar
	*/
	$("#submitUserForm").submit(function(e) {
		e.preventDefault();
		var frm = $("#submitUserForm");
		var data = {};
		$.each(this, function(i, v){
			var input = $(v);
			data[input.attr("name")] = input.val();
			delete data["undefined"];
		});
		saveRequestedData(frm, data);
	});
	
	$("#submitAddressForm").submit(function(e) {
		e.preventDefault();
		var frm = $("#submitAddressForm");
		var data = {};
		$.each(this, function(i, v){
			var input = $(v);
			data[input.attr("name")] = input.val();
			delete data["undefined"];
		});
		saveRequestedData(frm, data,"/musteri/hesabim");
	});
});
function saveRequestedData(frm,data,type) {
	$.ajax({
		contentType:"application/json; charset=utf-8",
		type:frm.attr("method"),
		url:frm.attr("action"),
		dataType:'json',
		data:JSON.stringify(data),
		success:function(data) {
			if(data.status == "basarili") {
				toastr.success(data.message, data.title, {
					closeButton:true
				});
				window.location.replace("/login?kayit=true");
				
			} else {
				toastr.error(data.message, data.title, {
					allowHtml:true,
					closeButton:true
				});
			}
		}
	});
}
$(function() {
	$("#submit").submit(function(e) {
		e.preventDefault();
		var frm = $("#submit");
		var data = {};
		$.each(this, function(i, v){
			var input = $(v);
			data[input.attr("name")] = input.val();
			delete data["undefined"];
		});
		save(frm, data);
	});
	/*/musteri/add
	*/
	$("#userBilgi").submit(function(e) {
		e.preventDefault();
		var frm = $("#userBilgi");
		var data = {};
		$.each(this, function(i, v){
			var input = $(v);
			data[input.attr("name")] = input.val();
			delete data["undefined"];
		});
		save(frm, data,"musteri");
	});
});
function save(frm,data,type) {
	$.ajax({
		contentType:"application/json; charset=utf-8",
		type:frm.attr("method"),
		url:frm.attr("action"),
		dataType:'json',
		data:JSON.stringify(data),
		success:function(data) {
			if(data.status == "basarili") {
				toastr.success(data.message, data.title, {
					closeButton:true
				});
				fetchList(type);
				
			} else {
				toastr.error(data.message, data.title, {
					allowHtml:true,
					closeButton:true
				});
			}
		}
	});
}
/*  /musteri/addAdres
 * 	
*/
$(document).ready(function(){
	$("#adresKayit").on("click", function(){ 
		var gonderilenform = $("#adresKayitForm").serialize(); 
		$.ajax({
			url:'musteri/addAdres', 
			type:'POST', 
			data:gonderilenform, 
			success:function(data){
				if(data.status == "basarili") {
						  toastr.success(data.message, data.title, {
								closeButton:true
							}); 
						  fetchList("musteri")
				} else {
					toastr.error(data.message, data.title, {
						allowHtml:true,
						closeButton:true
					});
				}
			}
		});
		
	});
	
	$("#userKayit").on("click", function(){ 
		var gonderilenform = $("#gonderilenform").serialize(); 
		$.ajax({
			url:'add', 
			type:'POST', 
			data:gonderilenform, 
			success:function(data){
				if(data.status == "basarili") {
						  toastr.success(data.message, data.title, {
								closeButton:true
							}); 
					window.location.replace("/login?kayit=true");
				} else {
					toastr.error(data.message, data.title, {
						allowHtml:true,
						closeButton:true
					});
				}
			}
		});
		
	});
	
	$("#ambarolustur").on("click", function(){ 
		var gonderilenform = $("#ambarformu").serialize(); 
		$.ajax({
			url:'musteri/add', 
			type:'POST', 
			data:gonderilenform, 
			success:function(data){
				if(data.status == "basarili") {
						  toastr.success(data.message, data.title, {
								closeButton:true
							}); 
					window.location.replace("/login?kayit=true");
				} else {
					toastr.error(data.message, data.title, {
						allowHtml:true,
						closeButton:true
					});
				}
			}
		});
		
	});

	
	$("#selectCategory").change(function() {
		var ill = $(this).val();
	$.ajax({
		type : 'GET',
		url : "/musteri/ilceler?ad="+ill,
		success : function(data) {
			var slctSubcat = $('#selectSubcat'), option = "";
			slctSubcat.empty();
			for (var i = 0; i < data.length; i++) {
				 option = option + "<option value='"+data[i].ad + "'>"
						+ data[i].ad + "</option>";
			}
			slctSubcat.append(option);
		},
		error : function() {
			alert("error");
		}
	});
	});		
	
});

/* adres/add
*  patron/add
*/
var frm = $('#personelKayit');
frm.submit(function (e) {
    e.preventDefault();
    $.ajax({
        type: frm.attr('method'),
        url: frm.attr('action'),
        data: frm.serialize(),
        success:function(data){
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
});


