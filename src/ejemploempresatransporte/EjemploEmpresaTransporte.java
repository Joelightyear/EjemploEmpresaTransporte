package ejemploempresatransporte;

import java.util.ArrayList;

public class EjemploEmpresaTransporte {

    static ArrayList<Empleado> empleados = new ArrayList<>();
    static ArrayList<Envio> envios = new ArrayList<>();
    static ArrayList<Vehiculo> vehiculos = new ArrayList<>();

    public static void rellenarDatos() {

        Empleado e;

        for (int i = 0; i < 30; i++) {
            e = new Empleado();
            e.setNombre("Empleado " + i);
            e.setEdad(28 + i);
            empleados.add(e);
        }

        EnvioAzul azul;

        for (int i = 0; i < 10; i++) {
            azul = new EnvioAzul();
            azul.setPeso(200 + i);
            azul.setFecha("15/10/2016 " + i);
            azul.setValor(20 + i);
            envios.add(azul);
        }

        Envio24Horas e24horas;

        for (int i = 0; i < 10; i++) {
            e24horas = new Envio24Horas();
            e24horas.setPeso(190 + i);
            e24horas.setFecha("10/10/2016 " + i);
            e24horas.setPrioriad("Alta " + i);
            envios.add(e24horas);
        }

        Coche c;

        for (int i = 0; i < 10; i++) {
            c = new Coche();
            c.setMarca("Audi A3" + i);
            c.setColor("Gris " + i);
            c.setMatricula("BA 3453 CD");
            c.setEmpleado(empleados.get(i));
            vehiculos.add(c);
        }

        Furgoneta f;

        for (int i = 0; i < 10; i++) {
            f = new Furgoneta();
            f.setMarca("Mercedes Vito " + i);
            f.setMatricula("BA 4664 DF");
            f.setPeso_maximo_autorizado(3500);
            vehiculos.add(f);
        }

        Camion ca;

        for (int i = 0; i < 10; i++) {
            ca = new Camion();
            ca.setMarca("BMW " + i);
            ca.setMatricula("BA 2482 EW" + i);
            ca.setVolumen(6000);
            vehiculos.add(ca);
        }
    }

    public static void mostrarTodosEnvios() {
        // 1 ) Forma de hacerlo
        for (Envio envio : envios) {
            envio.mostrar();              //--> Ir a la clase Envio
        }
        System.out.println();

        /*//2 ) Forma de hacerlo
        for (int i = 0; i < envios.size(); i++) {
            envios.get(i).mostrar();   
        }
        System.out.println();   */
    }

    public static void mostrarEnvio24HMayorPeso() {

        double maxpeso = 0;

        for (int i = 0; i < envios.size(); i++) {
            if (envios.get(i) instanceof Envio24Horas) {
                if (maxpeso < envios.get(i).getPeso()) {
                    maxpeso = envios.get(i).getPeso();
                }
            }
        }

        System.out.println(maxpeso);
    }

    public static void mostrarSumaPorTipoEnvio() {

        double suma24h = 0;
        int contador24h = 0;
        double sumaazul = 0;
        int contadorazul = 0;       
        double sumatotal = 0;

        for (int i = 0; i < envios.size(); i++) {
            if (envios.get(i) instanceof Envio24Horas) {
                suma24h = suma24h + envios.get(i).getPeso();                
            }            
            if (envios.get(i) instanceof EnvioAzul){
                sumaazul = sumaazul + envios.get(i).getPeso();
            }
        }
        
        sumatotal = suma24h + sumaazul;
        
        System.out.println("La suma del peso de los paquetes 24H es " + suma24h);
        System.out.println("La suma del peso de los paquetes es " + sumaazul);
        System.out.println("La suma total de los paquetes es " + sumatotal);    
    }

    public static void asignarEmpleadoAVehiculo(Vehiculo vehi, Empleado empl){
        
        vehi.setEmpleado(empl);

    }

    public static void main(String[] args) {
        rellenarDatos();

        //-----------------EJERCICIO 1 ---------------------------
          //Crear una función que me muestre todos los envios
        //mostrarTodosEnvios();
        
        //-----------------EJERCICIO 2 ---------------------------
          //Crear una función que me muestre el peso de todos los envios 24H.
        //mostrarEnvio24HMayorPeso();
        
        //-----------------EJERCICIO 3 ---------------------------
          //Crear una función que sume por tipo de envio.
        //mostrarSumaPorTipoEnvio();
        
        //-----------------EJERCICIO 4 ---------------------------
          //Crear una función que me asigne un empleado a un vehículo
          
        Vehiculo mivehiculo = vehiculos.get(2);
        Empleado miEmpleado = empleados.get(3);
        asignarEmpleadoAVehiculo(mivehiculo, miEmpleado);
    }

}
