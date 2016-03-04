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
public class Guerrero extends Personajes{
    private final String arma;
    private int res;

    public Guerrero(String nombre, int energia, String arma, int res) {
        super(nombre, energia);
        this.arma = arma;
        this.res = res;
    }

    public int getRes() {
        return res;
    }

    public void setRes(int res) {
        this.res = res;
    }
    
    public String Combatir(int res){
        super.ConsumirEnergia(res);
        return " y su arma es: " + arma + " \n Su energia total es de: " + super.getEnergia();
    }

  
}
