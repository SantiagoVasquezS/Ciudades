package ciudad;

import java.util.Date;

public class Ciudad {

    private int numeroDeBarrios;
    private Date fechaDeFundacion;
    private boolean impuestos;
    private int numeroDeHabitantes;
    private boolean aeropuertos;
    private boolean democracia;

    public Ciudad(int numeroDeBarrios, Date fechaDeFundacion, boolean impuestos, int numeroDeHabitantes, boolean aeropuertos, boolean democracia) {
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
            System.out.println("El nuevo número de habitantes son: " + 
                    String.valueOf(nuevoNumeroDeHabitantes) + " personas ");
            }
        }

    public int getNumeroDeBarrios() {
        return numeroDeBarrios;
    }

    public void setNumeroDeBarrios(int numeroDeBarrios) {
        this.numeroDeBarrios = numeroDeBarrios;
    }

    public Date getFechaDeFundacion() {
        return fechaDeFundacion;
    }

    public void setFechaDeFundacion(Date fechaDeFundacion) {
        this.fechaDeFundacion = fechaDeFundacion;
    }

    public boolean isImpuestos() {
        return impuestos;
    }

    public void setImpuestos(boolean impuestos) {
        this.impuestos = impuestos;
    }

    public boolean isAeropuertos() {
        return aeropuertos;
    }

    public void setAeropuertos(boolean aeropuertos) {
        this.aeropuertos = aeropuertos;
    }

    public boolean isDemocracia() {
        return democracia;
    }

    public void setDemocracia(boolean democracia) {
        this.democracia = democracia;
    }

    public int getNumeroDeHabitantes() {
        return numeroDeHabitantes;
    }

    public void setNumeroDeHabitantes(int numeroDeHabitantes) {
        this.numeroDeHabitantes = numeroDeHabitantes;
    }
    
    
    
    }
    


     
