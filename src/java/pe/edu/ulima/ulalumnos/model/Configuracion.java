/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.ulima.ulalumnos.model;

/**
 *
 * @author hquintana
 */
public class Configuracion {
    public static final String MONGO_USER = "ul_alumnos";
    public static final String MONGO_PASSWORD = "ul_alumnos";
    public static final String MONGO_URI = "mongodb://" + MONGO_USER +":" + MONGO_PASSWORD + "@ds031711.mongolab.com:31711/ul_alumnos";
}
