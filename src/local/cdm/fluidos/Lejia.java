/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package local.cdm.fluidos;

/**
 *
 * @author Sebastián Álvarez Fontán
 */
public class Lejia extends Liquido{
    private Double pureza;

    public Lejia(Double litros, String color) {
        super(litros, color);
        this.color = "incoloro";
        this.pureza = 1.0;
    }

    public Liquido mezclar(Liquido x){
        
        return null;
        
    }

    public Double getPureza() {
        return pureza;
    }

    public void setPureza(Double pureza) {
        this.pureza = pureza;
    }
    
    
}
