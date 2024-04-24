package com.jspstudy.ch06.controller;

import java.io.File;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jspstudy.ch06.dao.BoardDao;
import com.jspstudy.ch06.vo.Board;
import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

@WebServlet("/writeProcess")
public class BoardWirteController extends HttpServlet{
	private static String uploadDir;
	private static File parentFile;
	
	
	@Override
	public void init() throws ServletException {
		uploadDir = getServletContext().getInitParameter("uploadDir");
		String realPath = getServletContext().getRealPath(uploadDir);
		parentFile = new File(realPath);
		
		if(!(parentFile.exists() &&parentFile.isDirectory()))
			parentFile.mkdir();
		System.out.println("init() - "+parentFile);
	}



	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		// 
		String realPath = request.getServletContext().getRealPath(uploadDir);
		
		int maxFileSize = 100*1024*1024;
		
		String encoding = "utf-8";
		
		MultipartRequest multi = new MultipartRequest(request, realPath,
				maxFileSize, encoding, new DefaultFileRenamePolicy());
		
		
		String title = multi.getParameter("title");
		String writer = multi.getParameter("writer");
		String pass = multi.getParameter("pass");
		String content = multi.getParameter("content");
		Board board = new Board();
		
		board.setTitle(title);
		board.setWriter(writer);
		board.setContent(content);
		board.setPass(pass);
		
		//업로드한 파일 정보에 접근
		String fileName = multi.getFilesystemName("file1");
		System.out.println("업로드 된 파일명 : " + fileName);
		System.out.println("원본 파일 명 : "+multi.getOriginalFileName("file1"));
		board.setFile1(fileName);
		
		if(board.getFile1()==null) {
			System.out.println("파일이 업로드 되지 않음");
		}
		
		BoardDao dao = new BoardDao();
		dao.insertBoard(board);
		
		response.sendRedirect("boardList");
	}
	
}
