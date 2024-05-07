package src;

import java.util.ArrayList;
import java.util.List;

public class Memento {
    private List<String> libros = new ArrayList<>();

    public Memento(List<String> libros) {
        this.libros = new ArrayList<>(libros);
    }

    public List<String> getStatus() {
        return libros;
    }
}
