package org;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class gridData
 */
@WebServlet("/gridData")
public class gridDataServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public gridDataServlet() {
        super();
        // TODO Auto-generated constructor stub
        System.out.println("gridData");
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("doGet");
		PrintWriter out = response.getWriter();
		String str=new String();
		str="{ Rows: [{ CustomerID: '01', CompanyName:'����01' },{ CustomerID: '02', CompanyName:'����02' },{ CustomerID: '03', CompanyName:'����03' },{ CustomerID: '04', CompanyName:'����04' },{ CustomerID: '05', CompanyName:'����05' },{ CustomerID: '06', CompanyName:'����06' },{ CustomerID: '07', CompanyName:'����07' }]; }";
		out.write(str);
		out.flush();
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("doPost");
		
		response.setContentType("html/txt");
		response.setCharacterEncoding("utf-8");
		response.setHeader("Pragma", "no-cache");
		response.setHeader("Cache-Control", "no-cache, must-revalidate");
		response.setHeader("Pragma", "no-cache");
		
		PrintWriter out = response.getWriter();
		String str=new String();
		str = "{ Rows: [{ CustomerID: '01', CompanyName:'����01' },{ CustomerID: '02', CompanyName:'����02' },{ CustomerID: '03', CompanyName:'����03' },{ CustomerID: '04', CompanyName:'����04' },{ CustomerID: '05', CompanyName:'����05' },{ CustomerID: '06', CompanyName:'����06' },{ CustomerID: '07', CompanyName:'����07' }]; }";
		str = "{'total':200,'page':2,'rows':[{'id':1,'cell':[1,'Key Account Manager/��ͻ�����CFC��  ','����','5-10��','����']},{'id':2,'cell':[2,'Key Account Manager/��ͻ�����CFC��  ','����','5-10��','����']},{'id':3,'cell':[3,'Key Account Manager/��ͻ�����CFC��  ','����','5-10��','����']}]}";  
		out.write(str);
		out.flush();
		out.close();
	}

}
