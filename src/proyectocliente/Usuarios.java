
package proyectocliente;


public class Usuarios {
    private String nombre;
    private String apellido;
    private String usuario;
    private String password;
    private boolean estado;

    public Usuarios() {
        this.nombre = "";
        this.apellido = "";
        this.usuario = "";
        this.password = "";
        this.estado = false;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Usuarios{" + "nombre=" + nombre + ", apellido=" + 
                apellido + ", usuario=" + usuario + ", password=" + 
                password + ", estado=" + estado + '}';
    }
}
