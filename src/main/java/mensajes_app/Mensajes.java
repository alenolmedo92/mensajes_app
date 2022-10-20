package mensajes_app;

public class Mensajes {
    int idMensaje;
    String mensaje;
    String autorMensaje;
    String fechaMensaje;

    //Constructores:

    public Mensajes() {
    }

    public Mensajes(String mensaje, String autorMensaje, String fechaMensaje) {
        this.mensaje = mensaje;
        this.autorMensaje = autorMensaje;
        this.fechaMensaje = fechaMensaje;
    }

    //Getters:

    public int getIdMensaje() {
        return idMensaje;
    }

    public String getMensaje() {
        return mensaje;
    }

    public String getAutorMensaje() {
        return autorMensaje;
    }

    public String getFechaMensaje() {
        return fechaMensaje;
    }

    //Setters:

    public void setIdMensaje(int idMensaje) {
        this.idMensaje = idMensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public void setAutorMensaje(String autorMensaje) {
        this.autorMensaje = autorMensaje;
    }

    public void setFechaMensaje(String fechaMensaje) {
        this.fechaMensaje = fechaMensaje;
    }
}
