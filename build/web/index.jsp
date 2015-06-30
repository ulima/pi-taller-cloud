<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>UL Alumnos - Login</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="css/bootstrap.min.css" rel="stylesheet">
        <link href="css/login.css" rel="stylesheet">
    </head>
    <body>
        <div class="container">
            <img class="logo" src="images/logo.png" alt="Logo ULima"/>
            
            <form action="LoginServlet" method="POST" class="form-signin">
                <h2>Login</h2>
                <label for="inputCodigo" class="sr-only">C&oacute;digo de alumno</label>
                <input type="text" id="inputCodigo" name="inputCodigo" class="form-control" placeholder="Ingrese c&oacute;digo" required autofocus>
                <label for="inputPassword" class="sr-only">Password</label>
                <input type="password" id="inputPassword" name="inputPassword" class="form-control" placeholder="Ingrese Password" required>
                <button class="btn btn-lg btn-primary btn-block" type="submit">Ingresar</button>
            </form>
            
        </div>
    </body>
</html>

