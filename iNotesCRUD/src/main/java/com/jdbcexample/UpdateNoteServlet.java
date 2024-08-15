package com.jdbcexample;

import java.io.IOException;

@WebServlet("/UpdateNoteServlet")
public class UpdateNoteServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String title = request.getParameter("title");
        String content = request.getParameter("content");
        
        Note note = new Note();
        note.setId(id);
        note.setTitle(title);
        note.setContent(content);
        
        if(NoteDao.updateNote(note)) {
            response.sendRedirect("viewNotes.jsp");
        } else {
            response.getWriter().write("Failed to update note");
        }
    }
}
