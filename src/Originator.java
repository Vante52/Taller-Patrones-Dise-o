package src;

import src.Memento;

import java.util.ArrayList;
import java.util.List;

public class Originator {
    private List<String> libros;

    public Originator() {
        this.libros = new ArrayList<>();
    }

    public void setLibros(List<String> libros) {
        this.libros = new ArrayList<>(libros);
    }

    public List<String> getLibros() {
        return libros;
    }

    public Memento guardar() {
        return new Memento(this.libros);
    }

    public void restaurarE(Memento m) {
        this.libros = m.getStatus();
    }
}
