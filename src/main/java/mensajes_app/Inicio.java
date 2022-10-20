package mensajes_app;

import java.sql.Connection;
import java.util.Scanner;

public class Inicio {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        do{
            System.out.println("**********************************************************");
            System.out.println("Bienvenido a MSJServ!");
            System.out.println("\n 1-> Crear mensaje " +
                                "\n 2-> Ver Mensajes " +
                                "\n 3-> Eliminar Mensaje " +
                                "\n 4-> Editar Mensaje" +
                                "\n 0-> Salir");

            opcion = sc.nextInt();

            switch(opcion) {
                case 0:
                    break;
                case 1:
                    MensajesService.CrearMensaje();
                    break;
                case 2:
                    MensajesService.listarMensajes();
                    break;
                case 3:
                    MensajesService.borrarMensaje();
                    break;
                case 4:
                    MensajesService.editarMensaje();
                    break;
                default:
                    break;
            }

        }while(opcion != 0);

    }
}
