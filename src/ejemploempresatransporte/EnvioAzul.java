
package ejemploempresatransporte;


public class EnvioAzul extends Envio{
    
    private int valor;

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    public void mostrar(){
        super.mostrar();
        System.out.println(this.valor);
    }
}
