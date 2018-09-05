/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractt;

/**
 *
 * @author Amalia Yuna
 */
public class bujursangkar extends bangundatar {
    private final double sisi;
    
    public bujursangkar(double sisi){
        this.sisi = sisi;
    }
    @Override
    public double hitungkeliling(){
        return 4 * sisi;
    }
    
    @Override
    public double hitungluas(){
        return sisi * sisi;
    }
    
}
