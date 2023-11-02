import java.util.ArrayList;

public class Libro {
    private String titulo;
    private String isbn;
    private String fechaPublicacion;
    private ArrayList<Autor> autores;
    private ArrayList<Genero> generos;
    private Prestamo prestamo;

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIsbn() {
        return isbn;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getFechaPublicacion() {
        return fechaPublicacion;
    }
    public void setFechaPublicacion(String fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public ArrayList<Autor> getAutores() {
        return autores;
    }
    public void setAutores(ArrayList<Autor> autores) {
        this.autores = autores;
    }

    public ArrayList<Genero> getGeneros() {
        return generos;
    }
    public void setGeneros(ArrayList<Genero> generos) {
        this.generos = generos;
    }

    public Prestamo getPrestamo() {
        return prestamo;
    }
    public void setPrestamo(Prestamo prestamo) {
        this.prestamo = prestamo;
    }
}
