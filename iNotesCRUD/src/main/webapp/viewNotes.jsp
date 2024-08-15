<%@ page import="java.util.List" %>
<%@ page import="com.jdbcexample.Note" %>

<!DOCTYPE html>
<html>
<head>
    <title>View Notes</title>
</head>
<body>
    <h2>All Notes</h2>
    <table border="1">
        <tr>
            <th>ID</th>
            <th>Title</th>
            <th>Content</th>
            <th>Actions</th>
        </tr>
        <%
            List<Note> list = (List<Note>) request.getAttribute("noteList");
            if (list != null) {
                for (Note note : list) {
        %>
        <tr>
            <td><%= note.getId() %></td>
            <td><%= note.getTitle() %></td>
            <td><%= note.getContent() %></td>
            <td>
                <a href="updateNote.html?id=<%= note.getId() %>&title=<%= note.getTitle() %>&content=<%= note.getContent() %>">Update</a>
                <a href="DeleteNoteServlet?id=<%= note.getId() %>">Delete</a>
            </td>
        </tr>
        <%
                }
            }
        %>
    </table>
    <br>
    <a href="index.html">Back to Home</a>
</body>
</html>
