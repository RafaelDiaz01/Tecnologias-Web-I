<%  
  // aqui podria ir cualquier código java valido....
  // Incluso conexiones a base de datos para generar código HTML más dinámico...  
  
  // Recibimos el parametro enviado por el formulario HTML...
  String name=request.getParameter("uname");  
   
  //Hacemos algo con los datos del formulario. Lo podriamos guardar en una BD
  System.out.println("Nombre enviado por el usuario: " + name);
  out.print("<h1>Welcome " + name + "</h1>");  

  /*
    Creamos un atributo llamado "user" en el alcance de session, al cual le estamos
    asignando como valor el nombre que ingreso el usuario en el formulario. 
    De esta forma que este atributo estara disponble incluso, para otros JSP, 
    siempre y cuando la session este activa. 
    Te recomiendo abrir el Administrador de aplicaciones de Apache Tomcat para ver
    que efectivamente este atributo esta creado en la session de esta aplicacion.
        1. http://localhost:8080/manager.
        2. Ingresar usuario/password.
        3. Dar cli en la columna de Sessions para la aplicacion.
  */
  session.setAttribute("user",name);  
%>
<!-- Hacemos una rediccion a otro JSP, solo para ver que efectivamente este atributo
que acabamos de crear en el alcance de sesion, lo podemos recuperar en el JSP llamado
second.jsp
-->
<a href="second.jsp">Otra pagina JSP</a>  

