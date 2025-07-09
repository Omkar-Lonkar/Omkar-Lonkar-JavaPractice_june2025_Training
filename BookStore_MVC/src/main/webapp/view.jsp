<html>

<body>
    <h2>View all books<h2>
    <%--- Declaratives:- Declare instance level objects / variables / methods        ! is the difference ---%>
        <%! String msg = "Instance Hello"; %>        <%--- Declare instance level variable msg ---%>

    <%--- Scriplet:- Declare local level objects / variables / methods ---%>
        <% String msg = "Local Hello"; %>        <%--- Declare local level variable msg ---%>  

    <%--- Expression:- Display Variable on html page  = is the difference ---%>
    <%! String msg = "Instance Hello"; %>      
    <% String colorName = "red"; %>
    <p style="color: <%= colorName%>"> Text</p>  <%--- Declare instance level variable msg ---%>
        <%= msg %>        <%--- Display local level variable msg ---%>

    <%--- Directive:- Import meta data ---%>
    <%@ Import java.util.*; %>    <%--- Declare local level variable msg       @ is the difference---%>
</body>

</html>