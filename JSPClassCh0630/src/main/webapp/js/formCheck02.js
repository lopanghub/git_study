$(function() {
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
});