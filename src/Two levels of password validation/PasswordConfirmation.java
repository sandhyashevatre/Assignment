package com.learning.hello;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

/**
 * Servlet implementation class PasswordConfirmation
 */
public class PasswordConfirmation extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			List<String> passwords = Files
					.lines(Path.of("/home/sandhya/eclipse-workspace/learning-web/src/PassFile.txt")).toList();
			PrintWriter out = response.getWriter();
			if (passwords.contains(request.getParameter("pwd")))
				out.print(String.format("<p>failure,This is a banned password- %s</p>", request.getParameter("pwd")));
			else {
				response.getWriter().write("Given password is applicable!!");
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}