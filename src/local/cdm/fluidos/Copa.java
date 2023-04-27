/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package local.cdm.fluidos;

/**
 *
 * @author Sebastián Álvarez Fontán
 */
public class Copa extends Liquido {
    private Graduable alcohol;
    private Liquido mezcla;

    public Copa(Double litros, String color) {
        super(litros, color);
    }
    
    public Liquido mezclar(Liquido x){
        try{
            
        }catch(Exception NoSePuedeMezclarException){
            System.err.println("No se puede mezclar esto");
        }
        return null;
        
    }

    public Graduable getAlcohol() {
        return alcohol;
    }

    public void setAlcohol(Graduable alcohol) {
        this.alcohol = alcohol;
    }

    public local.cdm.fluidos.Liquido getMezcla() {
        return mezcla;
    }

    public void setMezcla(local.cdm.fluidos.Liquido mezcla) {
        this.mezcla = mezcla;
    }
    
    
}
