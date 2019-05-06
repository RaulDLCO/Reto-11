package reto11;

public class Comida {
    private int nivelSabor;
    private int nivelPicante;
    public String nombre;
    private String ingredientes [];

    public String[] getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String[] ingredientes) {
        this.ingredientes = ingredientes;
    }

    public int getNivelPicante() {
        return nivelPicante;
    }

    public void setNivelPicante(int nivelPicante) {
        this.nivelPicante = nivelPicante;
    }
    
    
}
