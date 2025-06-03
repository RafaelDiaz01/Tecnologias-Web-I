<html>  
  <body>  
    <%
        // aqui podria ir cualquier código java valido....
        // Incluso conexiones a base de datos para generar código HTML más dinámico...

        String saludo = "Bienvenido al modulo de reportes";
        out.print("<h2>Today is:" + java.util.Calendar.getInstance().getTime() + "</h2>");
    %>  
    <h3><% out.println(saludo);%></h3> 
  </body>  
</html> 