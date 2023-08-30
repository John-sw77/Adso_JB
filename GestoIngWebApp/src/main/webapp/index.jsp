<%-- 
    Document   : index
    Created on : 13/08/2023, 08:31:51 PM
    Author     : John Bojacá
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
<!-- ADD de web ingresos  -->
            <!--Import Google Icon Font-->
    <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
    <!-- Compiled and minified CSS -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">
    <link rel="stylesheet" href="css/style.css">
    
    
    </head>
    <body>
        <!-- <h1>Hello World!</h1> -->
        <!-- <%String Programa = "ADSO"; %> -->
        <!-- <%= "Hola! " +  Programa %> -->
        
         <!-----------------------------Encabezado inicio de sesion cliente-------------------------->    
        <header class="headcliente">
            <img class="imgcliente" id="foto_cliente" src="" alt="Foto del cliente">
            <h4 class="nombrecliente">Bienvenido, <span id="nombre_cliente"></span></h4>
            <p class="idcliente">ID de Cliente: <span id="id_cliente"></span></p>        
        </header>
    
        <!---------------------------Formulario Datos Secundarios de Solicitud------------------------------------>    

            
     <section class="insesion">

      <!--Text Inicial-->
      <div class="container section">
      <div class="row card-panel teal lighten-3">
        <h5>
        Estamos encantados de brindarte nuestro servicio de calidad y práctico para agilizar tu solicitud de muestras. Por favor, completa los datos requeridos a continuación para procesar tu solicitud de manera eficiente:
        </h5>
      </div>
      </div>
      
      <!--Formulario Datos Secundarios de Solicitud-->
      <div class="container section">        
          <div class="row card-panel teal darken-4">            
              <form >

                <label class="col s6"><h5>Contacto</h5>
                  <input type="text" placeholder="Contacto" name="Contacto" class="validate" required>
                </label>
              
                <label class="col s6"><h5>Numero de Remisión</h5>
                  <input type="text" placeholder="Numero de Remisión" name="N.Remision" class="validate" required>
                </label>
                      
                <label class="col s6"><h5>Teléfono</h5>
                  <input type="text" placeholder="Teléfono" name="Tel" class="validate" required>
                </label>
      
                <label class="col s6"><h5>Orden de Compra</h5>
                  <input type="text" placeholder="Orden de Compra" name="OC" class="validate" required>
                </label>
                               
                <label class="col s6"><h5>Correo electronico</h5>
                  <input type="email" placeholder="Correo electronico" name="email" class="validate" required>
                </label>


                  <br><br>

                  <!--  <input type="submit" value="Entrar :)">  -->

                  <button class="waves-effect waves-light btn" type="submit">Entrar</buttton>              

              </form>    
          </div>    
      </div>

     </section>

    
          <!--------------------------------Informacion Pie de pagina------------------------------->
          <footer>
            <p>¿Necesitas ayuda con el inicio de sesión? contáctanos a través de nuestro servicio de atención al cliente.
                <br><br>
                política de privacidad y términos de uso, para obtener más información sobre cómo manejamos tu información personal y cómo esperamos que uses nuestro sitio.
                <br><br>
                Si tienes alguna otra pregunta o inquietud, no dudes en ponerte en contacto con nosotros. Nos encantaría escuchar tus comentarios y ayudarte a sacar el máximo provecho de nuestra plataforma.
                <br><br>
                © 2023 [Nombre de la Empresa]. Todos los derechos reservados. Síguenos en nuestras redes sociales para obtener las últimas actualizaciones y noticias.
            </p>
        </footer>
    

    <!-- Compiled and minified JavaScript -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
    <script src="js/script.js"></script>

        
    </body>
</html>
