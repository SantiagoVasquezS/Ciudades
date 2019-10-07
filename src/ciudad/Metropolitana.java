package ciudad;

import java.util.Date;

public class Metropolitana extends Ciudad{
    
    private int distritos;
    private Date fechaConversion;
    private String nombreDistrito;

    public Metropolitana(int distritos, Date fechaConversion, String nombreDistrito, int numeroDeBarrios, Date fechaDeFundacion, boolean impuestos, int numeroDeHabitantes, boolean aeropuertos, boolean democracia) {
        super(numeroDeBarrios, fechaDeFundacion, impuestos, numeroDeHabitantes, aeropuertos, democracia);
        this.distritos = distritos;
        this.fechaConversion = fechaConversion;
        this.nombreDistrito = nombreDistrito;
    }
    
    public void renombrarDistrito(String nuevoNombre){
        this.nombreDistrito = nuevoNombre;
    }
    
    public void renombrarDistrito(String nuevoNombre, String especialidad){
        this.nombreDistrito = nuevoNombre + " de " + especialidad;
    }

    public int getDistritos() {
        return distritos;
    }

    public void setDistritos(int distritos) {
        this.distritos = distritos;
    }

    public Date getFechaConversion() {
        return fechaConversion;
    }

    public void setFechaConversion(Date fechaConversion) {
        this.fechaConversion = fechaConversion;
    }

    public String getNombreDistrito() {
        return nombreDistrito;
    }

    public void setNombreDistrito(String nombreDistrito) {
        this.nombreDistrito = nombreDistrito;
    }

    
}

