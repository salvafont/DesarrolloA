/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package local.cdm.fluidos;

/**
 *
 * @author Sebastián Álvarez Fontán
 */
public class Liquido {
    //Atributos
    protected Double litros;
    protected String color;
    
    //Constructores
    public Liquido(Double litros, String color) {
        this.litros = litros;
        this.color = color;
    }
    
    //Métodos  
    public void Liquido(Double x, String y){
        
    }
    
    public void incrementar(Double x){
        this.litros++;
    }
    
    //public abstract Liquido mezclar(Liquido x);

    //Getters y Setters
    public Double getLitros() {
        return litros;
    }

    public void setLitros(Double litros) {
        this.litros = litros;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    
}
