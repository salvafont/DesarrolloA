/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package local.cdm.fluidos;

/**
 *
 * @author Sebastián Álvarez Fontán
 */
public class Ron extends Liquido {
    private Double pureza;

    public Ron(Double litros, String color) {
        super(litros, color);
        this.color = "ámbar";
        
    }
    
    public Liquido mezclar(Liquido x){
        try{
            
        }catch(Exception NoSePuedeMezclarException){
            System.err.println("No se puede mezclar esto");
        }
        return null;
        
    }

    public Double getPureza() {
        return pureza;
    }

    public void setPureza(Double pureza) {
        this.pureza = pureza;
    }
    
    
}
