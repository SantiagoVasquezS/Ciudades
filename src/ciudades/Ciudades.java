package Ciudades;
// 2.0
import java.util.Date;

public class Ciudades {

    private int numeroDeBarrios;
    private Date fechaDeFundacion;
    private boolean impuestos;
    private int numeroDeHabitantes;
    private boolean aeropuertos;
    private boolean democracia;

    public Ciudades(int numeroDeBarrios, Date fechaDeFundacion, boolean impuestos, int numeroDeHabitantes, boolean aeropuertos, boolean democracia) {
        this.numeroDeBarrios = numeroDeBarrios;
        this.fechaDeFundacion = fechaDeFundacion;
        this.impuestos = impuestos;
        this.numeroDeHabitantes = numeroDeHabitantes;
        this.aeropuertos = aeropuertos;
        this.democracia = democracia;
    }

    public void votarPorAlcalde() {
        democracia = true;
    }

    public void viajaEnAvion() {
        aeropuertos = true;
    }

    public void pagarIva() {
        impuestos = true;
    }
    
    public void ampliarAreaMetropolitana() {
        numeroDeBarrios += 10 ;
    }
    
    public void aumentoDePoblacion() {
        numeroDeHabitantes += 100000 ;
    }
    
    public void aumentoDePoblacion(int nuevoNumeroDeHabitantes){
        if(nuevoNumeroDeHabitantes<=this.numeroDeHabitantes){
            System.out.println("La población no ha aumentado");
        }else{
            this.numeroDeHabitantes = nuevoNumeroDeHabitantes;
            System.out.println("El nuevo número de habitantes son" + 
                    String.valueOf(nuevoNumeroDeHabitantes) + "personas");
            }
        }
    
    }
    
