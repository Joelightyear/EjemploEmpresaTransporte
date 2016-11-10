
package ejemploempresatransporte;


public abstract class Envio {
    
    private double peso;
    private String fecha;

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    public void mostrar(){
        System.out.println(this.peso);  //----> Main
        System.out.println(this.fecha);  //----> Main
    }
}
