/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

import javax.swing.JOptionPane;

/**
 *
 * @author Andres Matta
 */
public class Menu {
    
    private String nombreG;
    private String nombreM;
    private final static int ENERGIA = 60;
    private String arma;
    private String poder;

    Guerrero g1 = new Guerrero(nombreG,ENERGIA,arma,2);
    Mago m1 = new Mago(nombreM,ENERGIA,poder,2);
    
    public Menu() {    
    }
    
    public void ElegirPersonaje(){
        nombreG = JOptionPane.showInputDialog(null,"Escriba el nombre del guerrero", "JUGADOR 1", JOptionPane.QUESTION_MESSAGE);
        nombreM = JOptionPane.showInputDialog(null,"Escriba el nombre del mago", "JUGADOR 2", JOptionPane.QUESTION_MESSAGE);
        
        int contador1 = 0;
        int contador2 = 0;
        
        while(contador1==0){
            String armaReq = JOptionPane.showInputDialog(null,"Elija el arma del guerrero:\n 1.Espada 2.Hacha 3.Maza", "JUGADOR 1", JOptionPane.QUESTION_MESSAGE);
        switch(armaReq){
            case "1":
                arma = "Espada";
                contador1++;
                break;
            case "2":    
                arma = "Hacha";
                contador1++;
                break;
            case "3":
                arma = "Maza";
                contador1++;
                break;
            default:
                JOptionPane.showMessageDialog(null, "Error, elija una de las opciones");
                break;
        }
        }
        while(contador2==0){
            String poderReq = JOptionPane.showInputDialog(null,"Elija el poder del mago:\n 1.Incinerar 2.Congelar 3.Electrochoque", "JUGADOR 1", JOptionPane.QUESTION_MESSAGE);
            switch(poderReq){
            case "1":
                poder = "Incinerar";
                contador2++;
                break;
            case "2":    
                poder = "Congelar";
                contador2++;
                break;
            case "3":
                poder = "Electrochoque";
                contador2++;
                break;
            default:
                JOptionPane.showMessageDialog(null, "Error, elija una de las opciones");
                break;
        }
        }
        
        JOptionPane.showMessageDialog(null, "Jugador 1\n" + "Nombre: " + nombreG + "  //  Arma: " + arma, "Características", JOptionPane.INFORMATION_MESSAGE );
        JOptionPane.showMessageDialog(null, "Jugador 2\n" + "Nombre: " + nombreM + "  //  Poder: " + poder, "Características", JOptionPane.INFORMATION_MESSAGE );
    }
    
    public void Damage(){
    
    if("Espada".equals(arma)){
        g1.setRes(2);
    }
    if("Hacha".equals(arma)){
        g1.setRes(4);
    }
    if("Maza".equals(arma)){
        g1.setRes(6);
    }
    if("Incinerar".equals(poder)){
        m1.setRes(4);
    }
    if("congelar".equals(poder)){
        m1.setRes(2);
    }
    if("Electrochoque".equals(poder)){
        m1.setRes(6);
    }
    }
    
    public void Combate(){
        
        int ataque;
        int sanacion;
        int contador = 0;
        
        while(contador==0){ 
            String movG = JOptionPane.showInputDialog(null, "1.Ataque 2.Curar", "Elige el movimiento", JOptionPane.INFORMATION_MESSAGE);
            switch(movG){
                case "1":
                    ataque = g1.getRes()*(int)(Math.random()*2+1);
                    g1.Combatir(g1.getRes()/2);
                    m1.ConsumirEnergia(ataque);
                    JOptionPane.showMessageDialog(null, "Ataque de: " + ataque, "DPS", JOptionPane.INFORMATION_MESSAGE);
                    if(ataque>g1.getRes()){
                        JOptionPane.showMessageDialog(null, "¡Golpe Crítico!", "DPS", JOptionPane.WARNING_MESSAGE);
                    }
                    JOptionPane.showMessageDialog(null, "Energia del guerrero: " + g1.getEnergia() + "  //  Energia del mago: " + m1.getEnergia(), "ESTADO", JOptionPane.INFORMATION_MESSAGE);
                    if(m1.getEnergia()<=0){
                JOptionPane.showMessageDialog(null, "El ganador es el guerrero", "¡Fin del juego!", JOptionPane.INFORMATION_MESSAGE);
                System.exit(0);
            }
                    break;
                case "2":
                    sanacion = (int)(Math.random()*10+1);
                    g1.Alimentarse(sanacion);
                    JOptionPane.showMessageDialog(null, "Te has curado: " + sanacion + " puntos", "SANACIÓN", JOptionPane.INFORMATION_MESSAGE);
                    JOptionPane.showMessageDialog(null, "Energia del guerrero: " + g1.getEnergia() + "  //  Energia del mago: " + m1.getEnergia(), "ESTADO", JOptionPane.INFORMATION_MESSAGE);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion equivocada", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
                    break;
            }
            
            String movM = JOptionPane.showInputDialog(null, "1.Encantar 2.Curar", "Elige el movimiento", JOptionPane.INFORMATION_MESSAGE);
            switch(movM){
                case "1":
                    ataque = m1.getRes()*(int)(Math.random()*2+1);
                    m1.Encantar(m1.getRes()/2);
                    g1.ConsumirEnergia(ataque);
                    JOptionPane.showMessageDialog(null, "Ataque de: " + ataque, "DPS", JOptionPane.INFORMATION_MESSAGE);
                    if(ataque>m1.getRes()){
                        JOptionPane.showMessageDialog(null, "¡Golpe Crítico!", "DPS", JOptionPane.WARNING_MESSAGE);
                    }
                    JOptionPane.showMessageDialog(null, "Energia del guerrero: " + g1.getEnergia() + "  //  Energia del mago: " + m1.getEnergia(), "ESTADO", JOptionPane.INFORMATION_MESSAGE);
                   
                    if(g1.getEnergia()<=0){
                JOptionPane.showMessageDialog(null, "El ganador es el mago", "¡Fin del juego!", JOptionPane.INFORMATION_MESSAGE);
                System.exit(0);
            }
                    break;
                case "2":
                    sanacion = (int)(Math.random()*10+1);
                    m1.Alimentarse(sanacion);
                    JOptionPane.showMessageDialog(null, "Te has curado: " + sanacion + " puntos", "SANACIÓN", JOptionPane.INFORMATION_MESSAGE);
                    JOptionPane.showMessageDialog(null, "Energia del guerrero: " + g1.getEnergia() + "  //  Energia del mago: " + m1.getEnergia(), "ESTADO", JOptionPane.INFORMATION_MESSAGE);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion equivocada", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
                    break;
            }
        }
    }
}
