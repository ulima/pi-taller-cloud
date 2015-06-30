

package pe.edu.ulima.ulalumnos;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import pe.edu.ulima.ulalumnos.model.Alumno;
import pe.edu.ulima.ulalumnos.model.AlumnoMongoDAO;

public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String codigo = request.getParameter("inputCodigo");
        String password = request.getParameter("inputPassword");
        AlumnoMongoDAO alumnoDAO = new AlumnoMongoDAO();
        Alumno alumno = alumnoDAO.get(codigo, password);
        
        if (alumno != null){
            request.getSession().setAttribute("alumno", alumno);
            response.sendRedirect("main.html");
        }else{
            response.sendRedirect("index.jsp");
        }
       
    }


}
