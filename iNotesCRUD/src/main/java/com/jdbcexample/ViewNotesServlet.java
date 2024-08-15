package com.jdbcexample;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ViewNotesServlet")
public class ViewNotesServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Note> list = NoteDao.getAllNotes();
        request.setAttribute("noteList", list);
        request.getRequestDispatcher("viewNotes.jsp").forward(request, response);
    }
}
