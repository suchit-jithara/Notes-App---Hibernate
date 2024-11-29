package com.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hibernate.Session;

import com.entities.Note;
import com.helper.FactoryProvider;


public class EditNoteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public EditNoteServlet() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		Session s = FactoryProvider.getFactory().openSession();
		
		Note n = (Note)s.get(Note.class, id);
		
		HttpSession session = request.getSession();
		session.setAttribute("editNote", n);
		
		response.sendRedirect("edit_note.jsp");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
