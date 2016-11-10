
package ejemploempresatransporte;


public class Envio24Horas extends Envio{
    
    private String prioridad;

    public String getPrioriad() {
        return prioridad;
    }

    public void setPrioriad(String prioriad) {
        this.prioridad = prioriad;
    }
    
    public void mostrar(){
        super.mostrar();
        System.out.println(this.prioridad);
    }
}
