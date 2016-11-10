
package ejemploempresatransporte;


public abstract class Vehiculo {
    
    private String marca;
    private String matricula;
    private Empleado conductor;

    public void mostrar(){
        System.out.println(this.marca);
        System.out.println(this.matricula);
        this.conductor.mostrar();
    }
    
    public Empleado getEmpleado() {
        return conductor;
    }

    public void setEmpleado(Empleado empleado) {
        this.conductor = empleado;
    }
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
}
