
public class NumerosInteiros {
    private int numero;
    private NumerosInteiros proximo;

    public NumerosInteiros(int numero) {
        this.numero = numero;
        this.proximo = null;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public NumerosInteiros getProximo() {
        return proximo;
    }

    public void setProximo(NumerosInteiros proximo) {
        this.proximo = proximo;
    }
    public String toString(){
        return String.format("%d", numero);
    }
    
}
