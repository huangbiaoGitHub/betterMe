$(function() {
	
})

//ajax post 提交
function ajaxPost(url, obj, succ) {
	$.ajax({
		url:url,
		data:obj,
		type:'post',
		async:true,
		success:function(data){
			succ(data);
		},
		error:function(){
			toast("连接服务器错误",2000);
		}
	}) ;
}

// OKFun 跳转操作
function redFun(data) {
	toast(data.msg);
	if(data.ret == 0) {
		setTimeout("window.location.href = '" + data.url + "'", 2000);
	}
}