package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.entities.Note;
import com.helper.FactoryProvider;


public class SaveNotesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public SaveNotesServlet() {
        super();
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		
		Note note = new Note(title, content, new Date());
		System.out.println(note.toString());
		
		Session s = FactoryProvider.getFactory().openSession();
		Transaction tx = s.beginTransaction();
		s.save(note);
		tx.commit();
		s.close();
		
//		response.setContentType("text/html");
//		PrintWriter out = response.getWriter();
//		out.println("<h1>Note Added</h1>");
		
		response.sendRedirect("add_notes.jsp");
	}

}
