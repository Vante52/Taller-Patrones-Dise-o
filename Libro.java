package src;

public class Libro implements Sujeto{
    private String titulo;
    private int cantidad;
    private List<Observador> observadores = new ArrayList<>();

    public void establecerDisponibilidad(boolean disponible) {
        if(cantidad_disponible>0 ) //esto lo arreglo después con los cambios de ellos
            this.disponible = true;
        else
            this.disponible = false;
        notificarObservadores();
    }
    @Override
    public void adjuntar(Observador observador) {
        observadores.add(observador);
    }

    @Override
    public void desadjuntar(Observador observador) {
        observadores.remove(observador);
    }

    @Override
    public void notificarObservadores() {
        for (Observador observador : observadores) {
            observador.actualizar();
        }
    }
}
