package loot;

public abstract class Botin {
    protected String rareza;
    protected String tipo;
    
    public Botin(String rareza, String tipo) {
        this.rareza = rareza;
        this.tipo = tipo;
    }
    
    public String getRareza() {
        return rareza;
    }
    
    public String getTipo() {
        return tipo;
    }
    
    public abstract void imprimirAtributos();
}
