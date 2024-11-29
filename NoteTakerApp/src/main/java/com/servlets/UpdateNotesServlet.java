package com.servlets;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.entities.Note;
import com.helper.FactoryProvider;


public class UpdateNotesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public UpdateNotesServlet() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		
		Session s = FactoryProvider.getFactory().openSession();
		Note n = (Note)s.get(Note.class, id);
		Transaction tx = s.beginTransaction();
		n.setTitle(title);
		n.setContent(content);
		n.setAddedDate(new Date());
			
		tx.commit();	
		s.close();
		System.out.println("Done");
		response.sendRedirect("AllNotesServlet");
		
	}

}
