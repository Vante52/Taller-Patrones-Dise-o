package src;

public class Libro{
    private int id;
    private String titulo;
    private String autor;
    private int cantidadDisponible;

    public Libro(int id, String titulo, String autor, int cantidadInicial) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.cantidadDisponible = cantidadInicial;
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getCantidadDisponible() {
        return cantidadDisponible;
    }

    public void setCantidadDisponible(int cantidad) {
        this.cantidadDisponible = cantidad;
    }
}
