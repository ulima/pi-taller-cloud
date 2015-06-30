
package pe.edu.ulima.ulalumnos.model;


public class Configuracion {
    public static final String MONGO_USER = "ul_alumnos";
    public static final String MONGO_PASSWORD = "ul_alumnos";
    public static final String MONGO_URI = 
            "mongodb://" + MONGO_USER +":" + MONGO_PASSWORD + 
            "@ds031711.mongolab.com:31711/ul_alumnos";
}
