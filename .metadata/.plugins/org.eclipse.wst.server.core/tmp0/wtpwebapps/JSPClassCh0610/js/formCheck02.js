$(function(){
	
	$("#detailDelete").on("click", function(){
		let pass=$("#pass").val();
		if(pass.trim().length<=0){
			alert("게시글을 삭제하려면 비번을 입력하세요");
			return false;
		}
		
		$("#rPass").val(pass);
		$("#checkForm").attr("action", "deleteProcess");
		$("#checkForm").attr("method", "post");
		$("#checkForm").submit();
	})
	
	//$("#detailUpdate").click( function() { })
	$("#detailUpdate").on("click", function() {
		 //const passElem = document.querySelector("#pass");
		 // const pass = passElem.value = "1234";		
		let pass = $("#pass").val();
		if(pass.trim().length <= 0) {
			alert("게시 글을 수정하려면 비밀번호를 입력하세요");
			return false;
		}
		
		$("#rPass").val(pass);
		$("#checkForm").attr("action", "updateForm");
		$("#checkForm").attr("method", "post");
		//const checkForm = document.querySelector("#checkForm");
		//checkForm.setAttribute("method", "post");
		
		$("#checkForm").submit();		
	});
	
	$("#updateForm").on("submit", function(e) {
				
		if($("#writer").val().trim().length <= 0) {
			alert("작성자를 입력해주세요");
			// e.preventDefault() + e.stopPropagation()
			$("#writer").val("");
			$("#writer").focus();
			return false;
		}
		if($("#title").val().trim().length <= 0) {
			alert("제목을 입력해주세요");			
			return false;
		}
		if($("#pass").val().trim().length <= 0) {
			alert("비밀번호를 입력해주세요");			
			return false;
		}
		if($("#content").val().trim().length <= 0) {
			alert("내용을 입력해주세요");			
			return false;
		}		
	})	;	
	
	
	// const writeForm = document.querySelector("#writeForm");
	// writeForm.addEventListener("submit", (e) => { } );
	$("#writeForm").on("submit", function(e) {
				
		if($("#writer").val().trim().length <= 0) {
			alert("작성자를 입력해주세요");
			// e.preventDefault() + e.stopPropagation()
			$("#writer").val("");
			$("#writer").focus();
			return false;
		}
		if($("#title").val().trim().length <= 0) {
			alert("제목을 입력해주세요");			
			return false;
		}
		if($("#pass").val().trim().length <= 0) {
			alert("비밀번호를 입력해주세요");			
			return false;
		}
		if($("#content").val().trim().length <= 0) {
			alert("내용을 입력해주세요");			
			return false;
		}		
	})	;	
})