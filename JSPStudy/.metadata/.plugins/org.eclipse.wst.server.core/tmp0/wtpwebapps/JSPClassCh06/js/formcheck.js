document.addEventListener("DOMContentLoaded",function(){
	const writeForm = document.getElementById("writeForm");
	
	writeForm.addEventListener("submit",(e)=>{
		//alert("writeForm submit");
		//판단 - 서버로 전송해도 되는지 판단
		
		const writer = document.getElementById("writer").value;
		const title = document.getElementById("title").value;
		const pass = document.getElementById("pass").value;
		const content = document.getElementById("content").value;
		
		
		if(writer.trim().length<=0){
			//폼을 전송하면 안됨
			alert("작성자를 입력해주세요")
			e.preventDefault();
			
		}
		if(title.trim().length<=0){
			//폼을 전송하면 안됨
			alert("제목를 입력해주세요")
			e.preventDefault();
		}
		if(pass.trim().length<=0){
			//폼을 전송하면 안됨
			alert("비밀번호를 입력해주세요")
			e.preventDefault();
		}
		if(content.trim().length<=0){
			//폼을 전송하면 안됨
			alert("내용을 입력해주세요")
			e.preventDefault();
		}
	});
})

	