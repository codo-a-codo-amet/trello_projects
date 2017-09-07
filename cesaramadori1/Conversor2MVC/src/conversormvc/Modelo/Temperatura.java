package conversormvc.Modelo;


public class Temperatura {
    private double valor;
    private int tipo;

    public Temperatura(double valor, int tipo) {
        this.valor = valor;
        this.tipo = tipo;
    }

    
    
    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
    
    
}
