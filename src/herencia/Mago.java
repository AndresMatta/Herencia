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
public class Mago extends Personajes{

    private final String poder;
    private int res;
    
    public Mago(String nombre, int energia, String poder, int res) {
        super(nombre, energia);
        this.poder = poder;
        this.res = res;
    }

    public int getRes() {
        return res;
    }

    public void setRes(int res) {
        this.res = res;
    }
    
    public String Encantar(int res){
        super.ConsumirEnergia(res);
        return " y su poder es: " + poder + "\n Su energia total es de: " + super.getEnergia();
    }
    
}
