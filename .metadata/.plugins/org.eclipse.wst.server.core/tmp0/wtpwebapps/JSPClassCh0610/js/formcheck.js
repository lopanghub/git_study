document.addEventListener("DOMContentLoaded", function(){
	
	const writeForm = document.getElementById("writeForm");
	writeForm.addEventListener("submit", (e)=>{
		
		const writer = document.getElementById("writer").value;
		const title = document.querySelector("#title").value;
		const pass = document.querySelector("#pass").value;
		const content = document.querySelector("#content").value;
		
		if(writer.trim().length<=0){
			alert("작성자를 입력하세요");
			e.preventDefault();
		}
		if(title.trim().length<=0){
			alert("제목을 입력하세요");
			e.preventDefault();
		}
		if(pass.trim().length<=0){
			alert("비밀번호를 입력하세요");
			e.preventDefault();
		}
		if(content.trim().length<=0){
			alert("내용을 입력하세요");
			e.preventDefault();
		}
	})
})