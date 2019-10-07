
package ciudad;

import java.util.Date;

public class CiudadIndustrial extends Ciudad{
    
    private int cantidadDeIndustrias;
    private boolean contaminacion;
    private int consumoEnergetico;

    public CiudadIndustrial(int cantidadDeIndustrias, boolean contaminacion, int consumoEnergetico, int numeroDeBarrios, Date fechaDeFundacion, boolean impuestos, int numeroDeHabitantes, boolean aeropuertos, boolean democracia) {
        super(numeroDeBarrios, fechaDeFundacion, impuestos, numeroDeHabitantes, aeropuertos, democracia);
        this.cantidadDeIndustrias = cantidadDeIndustrias;
        this.contaminacion = contaminacion;
        this.consumoEnergetico = consumoEnergetico;
    }
    
    public void limpiarCiudad(){
        this.contaminacion = false;
    }
    
    public void limpiarCiudad(int consumo){
        this.contaminacion = false;
        this.consumoEnergetico += consumo; 
    }


    public int getCantidadDeIndustrias(){
       return cantidadDeIndustrias; 
    }
    
    public void setCantidadDeIndustrias(int cantidadDeIndustrias){
        this.cantidadDeIndustrias = cantidadDeIndustrias;
    }

    public boolean isContaminacion() {
        return contaminacion;
    }

    public void setContaminacion(boolean contaminacion) {
        this.contaminacion = contaminacion;
    }

    public int getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(int consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }
    
}
