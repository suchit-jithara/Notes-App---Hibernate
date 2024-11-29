package com.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hibernate.Query;
import org.hibernate.Session;

import com.entities.Note;
import com.helper.FactoryProvider;

public class AllNotesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public AllNotesServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Session s = FactoryProvider.getFactory().openSession();
		Query query = s.createQuery("from Note");
		List<Note> list = query.list();

		HttpSession session = request.getSession();
		session.setAttribute("allNotes", list);

		for (Note n : list) {
			System.out.println(n.getId());
			System.out.println(n.getTitle());
			System.out.println(n.getContent());
			System.out.println(n.getAddedDate());
			System.out.println();
		}

		response.sendRedirect("show_notes.jsp");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}
