package mensajes_app;

import java.sql.*;

public class MensajesDAO {
    public static void crearMensaje(Mensajes mensaje){

        Conexion dbConnect = new Conexion();

        try(Connection conexion = dbConnect.get_connection()){
            PreparedStatement ps = null;
            try{
                String query = "INSERT INTO mensajes(mensaje, autor_mensaje) VALUES (?,?)";
                ps = conexion.prepareStatement(query);
                ps.setString(1,mensaje.getMensaje());
                ps.setString(2,mensaje.getAutorMensaje());
                ps.executeUpdate();

                System.out.println("Mensaje Creado Correctamente!");

            }catch(SQLException e){
                System.out.println("Hubo un Error!: \n" + e.getMessage());
            }

        }catch(SQLException e){
            System.out.println(e);
        }
    }

    public static void leerMensajeDB(){
        Conexion dbConnect = new Conexion();

        PreparedStatement ps = null;
        ResultSet rs = null;

        try(Connection conexion = dbConnect.get_connection()) {
            String query = "SELECT * FROM mensajes";
            ps = conexion.prepareStatement(query);
            rs = ps.executeQuery(query);

            while(rs.next()) {
                System.out.println("**********************************************************");
                System.out.println(">ID Mensaje: " + rs.getInt("ID_mensaje") + "\n" +
                                   ">Mensaje: " + rs.getString("mensaje") + "\n" +
                                   ">Autor: " + rs.getString("autor_mensaje") + "\n" +
                                   ">Fecha: " + rs.getString("fecha_mensaje"));
                System.out.println("**********************************************************");
            }
        }catch(SQLException e){
            System.out.println("No se pudieron leer los Mensajes");
            System.out.println(e);
        }
    }

    public static void borrarMensaje(int id_mensaje){
        Conexion dbConnect = new Conexion();
        try(Connection conexion = dbConnect.get_connection()) {
            PreparedStatement ps = null;
            try{
                String query = "DELETE FROM mensajes WHERE ID_mensaje = ?";
                ps = conexion.prepareStatement(query);
                ps.setInt(1, id_mensaje);

                int countRowsUpdated = ps.executeUpdate();
                if (countRowsUpdated != 0) {
                    System.out.println("Borrado correctamente");
                } else {
                    System.out.println("nose encontró el mensaje");
                }

                ps.executeUpdate();

                System.out.println("El mensaje fue borrado exitosamente");
            }catch(SQLException e){
                System.out.println(e);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public static void actualizarMensajeBD(Mensajes mensaje){
        Conexion dbConnect = new Conexion();

        try(Connection conexion = dbConnect.get_connection()){
            PreparedStatement ps = null;
            try{
               String query = "UPDATE mensajes SET mensaje = ? WHERE ID_mensaje = ?";
                ps = conexion.prepareStatement(query);
                ps.setString(1,mensaje.getMensaje());
                ps.setInt(2,mensaje.getIdMensaje());
                ps.executeUpdate();

                System.out.println("Mensaje Editado Correctamente!");


            }catch (SQLException e){
                System.out.println("No se pudo Actualizar el mensaje!");
                System.out.println(e);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }

    }
}
