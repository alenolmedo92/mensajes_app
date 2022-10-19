package mensajes_app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    public Connection get_connection(){
        Connection conection = null;
        try{
            conection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mensajes_app","root","");

            if(conection != null){
                System.out.println("Conexion Exitosa!");
            }
        }catch(SQLException e){
            System.out.println(e + "\n Nose Pudo conectar a la base de datos");
        }
        return conection;
    }
}
