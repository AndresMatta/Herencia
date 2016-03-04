/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author Andres Matta
 */
public class Personajes {
    private String nombre;
    private int energia;

    public Personajes(String nombre, int energia) {
        this.nombre = nombre;
        this.energia = energia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }
    
    public void Alimentarse(int curar){
      energia = energia + curar;
    }
    
    public void ConsumirEnergia(int decremento){
        energia = energia -  decremento;
    }
    
}
