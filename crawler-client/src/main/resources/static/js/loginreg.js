	function changkb1() {
		var pwd = document.getElementById("password");
		_skb1.showSoftKB(pwd);
	}
	
	
	//页面元素用户登录名格式检验 
	/*  要求：登录名由6-16位数字、字母、“_”、“-”、“/”组成    */
	function checkLoginName(){
		//var loginName = $.trim($("#loginname").val());
		var loginName = $("#loginname").val();
		var reg = new RegExp("^[a-zA-Z0-9\-_/]*$");
		if(loginName.length < 1 ||loginName.indexOf(" ")>=0){
			$("#loginNameInfo").text("登录名不能为空或空格");
			$("#loginNameInfo").removeClass("yes").addClass("no");
			return false;
		}if(loginName.length < 6   ){
			$("#loginNameInfo").text("登录名不能小于6位字符");
			$("#loginNameInfo").removeClass("yes").addClass("no");
			return false;
		}else if(loginName.length > 16){
			$("#loginNameInfo").text("登录名不能大于16位字符");
			$("#loginNameInfo").removeClass("yes").addClass("no");
				return false;
		}else if(!reg.test(loginName)){
			$("#loginNameInfo").text("登录名只能包含字母、数字、_、-、/");
			$("#loginNameInfo").removeClass("yes").addClass("no"); 
				return false;
		}else{
			$("#loginNameInfo").text(" "); 
			$("#loginNameInfo").removeClass("no").addClass("yes");
				return true;
		}
	}
	
	//页面元素用户登陆密码格式检验
	/*要求：密码长度在6-20个字符，包含数字、小写字母和大写字母,至少包含两种  */
	function checkPassword(){
		var length = pgeditor.pwdLength();//获得密码长度
		var reg = /^(?![0-9]+$)(?![a-zA-Z]+$)[0-9A-Za-z]+$/;
		if(length == 0 || length == undefined ){
			$("#passwordInfo").text("密码不能为空");
			$("#passwordInfo").removeClass("yes").addClass("no");
			return false;
		}else if(length < 6){
			$("#passwordInfo").text("密码不能小于6位字符");
			$("#passwordInfo").removeClass("yes").addClass("no");
			return false;
		}else if(length > 20){
			$("#passwordInfo").text("密码不能超过20位字符");
			$("#passwordInfo").removeClass("yes").addClass("no");
			return false;
		}/*else if(!reg.test(password)){
			$("#passwordInfo").text("密码只能使用数字和字母，且必须同时包含数字和字母");
			$("#passwordInfo").removeClass("yes").addClass("no");
			return false;
		}*/
			$("#passwordInfo").text("");
			$("#passwordInfo").removeClass("no").addClass("yes");
			return true;
	}
	
	//页面元素 图形验证码检验 
	function checkImageCode(){
		if (document.getElementById('_@IMGRC@_').value == '') {
			$("#imageCodeInfo").text("验证码不能为空或空格");
			$("#imageCodeInfo").removeClass("yes").addClass("no");
			return false;
		}
		$("#imageCodeInfo").text("");
		$("#imageCodeInfo").removeClass("no").addClass("yes");
		return true;
	}
	
	//表单提交前检验 
	function check(obj){
		return checkLoginName() && checkPassword() && checkImageCode();
	}