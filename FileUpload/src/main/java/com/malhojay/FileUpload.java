package com.malhojay;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

@WebServlet("/upload")
public class FileUpload extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletFileUpload up = new ServletFileUpload(new DiskFileItemFactory());
		try {
			List<FileItem> result = up.parseRequest(request);
			for(FileItem item : result) {
				item.write(new File("C:\\Users\\jayma\\Downloads\\" + item.getName()));
			}
			System.out.println("File uploaded successfully");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
