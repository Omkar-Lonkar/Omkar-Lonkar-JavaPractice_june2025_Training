<%@ page import= "com.BookStore.model.Book" %>
<%@ page import= "java.util.List" %>
<%@ page import= "com.BookStore.BookDAO" %>
<%@ page import= "com.BookStore.BookDAOImpl" %>

<html>
<body>
    <h1>View Books</h1>
    <%
        BookDAO bookDAO = new BookDAOImpl();
        List<Book> books = (List<Book>)request.getAttribute("books");
    %>

    <%    
        if (books == null){
    %>
            <p>No Books Found.</p>
    <%  
        }
        else{
    %>
    <table border collapse>
        <tr>
            <th>Id</th>
            <th>Name</th>
            <th>Price</th>
        </tr>
    <%
        for (Book book : books) {
    %>
        <tr>
            <td><%=book.getId()%></td>
            <td><%=book.getName()%></td>
            <td><%=book.getPrice()%></td>
        </tr>
    <%    
            }
        }
    %>
    </table>
</body>
</html>
