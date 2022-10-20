package mensajes_app;

import java.util.Scanner;

public class MensajesService {
    public static void CrearMensaje(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe tu mensaje: ");
        String texto = sc.nextLine();

        System.out.println("Autor del Mensaje: ");
        String autor = sc.nextLine();

        Mensajes mensaje = new Mensajes();
        mensaje.setMensaje(texto);
        mensaje.setAutorMensaje(autor);

        MensajesDAO.crearMensaje(mensaje);
    }

    public static void listarMensajes(){
        MensajesDAO.leerMensajeDB();
    }

    public static void borrarMensaje(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Cúal es el ID del mensaje a borrar? -> ");
        int id_mensaje = sc.nextInt();
        MensajesDAO.borrarMensaje(id_mensaje);

    }

    public static void editarMensaje(){
        Scanner sc = new Scanner(System.in);
        System.out.print("indica el Id del mensaje a Actualizar: ->");
        int idMensaje = sc.nextInt();
        sc.nextLine();
        System.out.println("Escribe el Nuevo texto del mensaje: ");
        String mensajeNuevo = sc.nextLine();

        Mensajes actualizacionMensaje = new Mensajes();
        actualizacionMensaje.setMensaje(mensajeNuevo);
        actualizacionMensaje.setIdMensaje(idMensaje);

        MensajesDAO.actualizarMensajeBD(actualizacionMensaje);



    }

}
