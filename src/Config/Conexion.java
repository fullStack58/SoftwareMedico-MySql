package Config;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion 
{
    Connection con; // Declaramos variable tipo conneción 
    //Nombre de la BD
    String nomBD = "tablasj";
    //Dirección donde se alojara la BD seguido de la ubicación host*/
    String dirBD = "jdbc:mysql://localhost:3306/" + nomBD;
    // Dirección del driver de la BD
    String dirDriverBD = "com.mysql.cj.jdbc.Driver";
    // Nombre del usuario
    String usuario = "root";
    // Contraseña del usuario
    String contraseña = "";
    
    
    // CONSTRUCTOR ////////////////////////////////
    
    public Conexion()
    {
        // Control de errores
        try{
            Class.forName(dirDriverBD);
            con = DriverManager.getConnection(dirBD, usuario, contraseña);
        } catch (Exception e){
            System.err.println("No se pudo establecer conexion con la Base de datos. Error: " + e);
        }
    }
    
    
    // METODOS GET ////////////////////////////////
    
    // Para retornar el estado de la conección
    public Connection getConnection()
    {
        return con;
    }
}
