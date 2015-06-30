/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.ulima.ulalumnos.model;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import java.net.UnknownHostException;
import org.bson.types.ObjectId;

/**
 *
 * @author hquintana
 */
public class AlumnoMongoDAO {
    MongoClient client;
    private DBCollection conectarse() throws UnknownHostException{
        MongoClientURI uri = new MongoClientURI(Configuracion.MONGO_URI);
        client = new MongoClient(uri);
        DB db = client.getDB("ul_alumnos");
        return db.getCollection("alumnos");
    }
    
    private void desconectarse(){
        client.close();
    }
    public Alumno get(String codigo, String password) throws UnknownHostException {
        
        DBCollection alumnosCol = conectarse();
        
        DBObject filtro = new BasicDBObject();
        filtro.put("codigo", codigo);
        filtro.put("password", password);
        DBObject dbAlumno = alumnosCol.findOne(filtro);
        
        Alumno alumno = null;
        if (dbAlumno != null){
            alumno = new Alumno();
            alumno.setId(((ObjectId)dbAlumno.get("_id")).getTimestamp());
            alumno.setNombre(dbAlumno.get("nombre").toString());
            alumno.setCodigo(dbAlumno.get("codigo").toString());
            alumno.setPassword(dbAlumno.get("password").toString());
        }
        client.close();
        return alumno;
    }
    
}
