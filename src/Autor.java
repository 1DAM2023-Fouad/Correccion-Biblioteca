import java.util.ArrayList;

public class Autor {

    private String nombre;
    private String apellidos;
    private String fechaNacimento;
    private String localidad;
    private String nif;
    private ArrayList<Libro>libros;

    String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getFechaNacimento() {
        return fechaNacimento;
    }
    public void setFechaNacimento(String fechaNacimento) {
        this.fechaNacimento = fechaNacimento;
    }

    public String getLocalidad() {
        return localidad;
    }
    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getNif() {
        return nif;
    }
    public void setNif(String nif) {
        this.nif = nif;
    }

    public ArrayList<Libro> getLibros() {
        return libros;
    }

    public void setLibros(ArrayList<Libro> libros) {
        this.libros = libros;
    }
}
