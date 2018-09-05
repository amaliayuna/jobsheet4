/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacee;

/**
 *
 * @author Amalia Yuna
 */
public class interfacebujursangkar implements interfacebangundatar{
    private final double sisi;
    
    public interfacebujursangkar(double sisi){
        this.sisi = sisi;
    }
    
    @Override
    public double hitungkeliling() {
        return sisi* 4;
    }

    @Override
    public double hitungluas(){
        return sisi * sisi;
    }
}
    

