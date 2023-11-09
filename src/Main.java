import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // Generos
        Genero genero=new Genero();
        genero.setCodigo("1");
        genero.setNombre("Comedia");
        genero.setDescripcion("Género de xxxxx");


        //
        Genero genero2=new Genero();
        genero2.setCodigo("2");
        genero2.setNombre("Terror");
        genero2.setDescripcion("Género de xxxx");

        System.out.println("Código del genero: " + genero.getCodigo());

        Autor autor=new Autor();
        autor.setNombre("Miguel");
        autor.setApellidos("De Cervantes");
        autor.setLocalidad("Toledo");
        autor.setFechaNacimento("16/01/1605");

        Libro libro=new Libro();
        libro.setIsbn("0123");
        libro.setTitulo("Don Quijote");

        ArrayList<Autor> autores =new ArrayList<>();
        autores.add(autor);

        libro.setAutores(autores);

        ArrayList<Genero> generos =new ArrayList<>();
        generos.add(genero);
        generos.add(genero2);

        libro.setGeneros(generos);

        libro.getAutores().get(0).setNombre("Miguelito");
        System.out.println("");
    }
}