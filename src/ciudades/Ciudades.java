/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ciudades;

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
        numeroDeBarrios = ;
    }
}

