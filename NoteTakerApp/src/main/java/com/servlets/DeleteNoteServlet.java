package com.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.entities.Note;
import com.helper.FactoryProvider;

public class DeleteNoteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public DeleteNoteServlet() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		Session s = FactoryProvider.getFactory().openSession();
		
		Note n = (Note)s.get(Note.class, id);
		Transaction tx = s.beginTransaction();
		s.delete(n);
			
		tx.commit();	
		s.close();
		System.out.println("Done");
		response.sendRedirect("AllNotesServlet");
	}	

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
