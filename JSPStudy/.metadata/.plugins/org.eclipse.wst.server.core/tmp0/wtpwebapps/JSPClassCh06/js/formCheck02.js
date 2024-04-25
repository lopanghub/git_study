$(function(){
	$("#detailDelete").on("click", function(){
		let pass = $("#pass").val();
		if(pass.trim().length<=0){
			alert("게시 글을 삭제하려면 비밀번호를 입력하세요")
			return false;
		}
		$("#rPass").val(pass);
		$("#checkForm").attr("action", "deleteProcess");
		$("#checkForm").attr("method", "post");
		$("#checkForm").submit();
	});
	
	$("#detailUpdate").on("click", function(){
		let pass = $("#pass").val();
		if(pass.trim().length<=0){
			alert("게시 글을 수정하려면 비밀번호를 입력하세요")
			return false;
		}
		$("#rPass").val(pass);
		$("#checkForm").attr("action", "updateForm");
		$("#checkForm").attr("method", "post");
		$("#checkForm").submit();
	});
	
	
	$("#updateForm").on("submit", function(){
		if($("#writer").val().trim().length<=0){
			alert("작성자를 입력");
			$("#writer").val("");
			$("#writer").focus();
			return false;	
		}
		if($("#title").val().length<=0){
			alert("제목을 입력");
			return false;	
		}
		if($("#pass").val().length<=0){
			alert("비밀번호를 입력");
			return false;	
		}
		if($("#content").val().length<=0){
			alert("내용을 입력");
			return false;	
		}
	});
	
	
	$("#writeForm").on("submit", function(){
		if($("#writer").val().trim().length<=0){
			alert("작성자를 입력");
			$("#writer").val("");
			$("#writer").focus();
			return false;	
		}
		if($("#title").val().length<=0){
			alert("제목을 입력");
			return false;	
		}
		if($("#pass").val().length<=0){
			alert("비밀번호를 입력");
			return false;	
		}
		if($("#content").val().length<=0){
			alert("내용을 입력");
			return false;	
		}
	});
	
});