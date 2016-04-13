function toast(text,time){
	$('.tusi').remove();
	var div = $('<div class="mymask" style="background:#5E5E5E;max-width: 85%;padding:20px 50px;min-width: 270px;position: absolute;left: -1000px;top: -1000px;text-align: center;border-radius:3px;"><span style="color: #ffffff;line-height: 35px;font-size: 16px;">'+ text +'</span></div>');
	$('body').append(div);
	div.css('zIndex',9999999);
	div.css('left',parseInt(($(window).width()-div.width())/2));
	var top = parseInt($(window).scrollTop()+($(window).height()-div.height())/2);
	div.css('top',top);
	if(time > 0){
		setTimeout(function(){
			div.remove();
		},time);
	}
}
function untoast(){
	$(".mymask").remove();
}