<h3>Segunda pagina</h3>
<%
    // aqui podria ir cualquier código java valido....
    // Incluso conexiones a base de datos para generar código HTML más dinámico...  
    /**
     * Recuperamos el atributo "user" que esta en el alcance de session y que fue creado
     * por el JSP "setSessionVar.jsp"
     */
    String name = (String) session.getAttribute("user");
    out.print("Hola " + name);
%>  
