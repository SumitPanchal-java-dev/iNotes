package com.jdbcexample;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AddNoteServlet")
public class AddNoteServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String title = request.getParameter("title");
        String content = request.getParameter("content");
        
        Note note = new Note();
        note.setTitle(title);
        note.setContent(content);
        
        if(NoteDao.addNote(note)) {
            response.sendRedirect("viewNotes.jsp");
        } else {
            response.getWriter().write("Failed to add note");
        }
    }
}
