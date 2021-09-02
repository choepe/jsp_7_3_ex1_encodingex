package com.javachopy.ex;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class encoding
 */
@WebServlet("/EncodingEx")
public class EncodingEx extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EncodingEx() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());
		System.out.println("Get ������� ����");
		
		request.setCharacterEncoding("euc-kr");
		
		String name = request.getParameter("name");
		
		response.setContentType("test/html; charset=euc-kr");
		PrintWriter writer = response.getWriter();
		
		writer.println("<html><head></head><body>");
		writer.println("�ȳ��ϼ���" + name + "�� �ݰ����ϴ�." + "<br/>");		
		writer.println("</body></html>");
		
		writer.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
