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
public class interfacesegitiga implements interfacebangundatar{
    private  double alas;
    private  double tinggi;
    
    public interfacesegitiga(double alas, double tinggi){
    this.alas = alas;
    this.tinggi = tinggi;
}

    @Override
    public double hitungluas() {
        return 2 * alas + tinggi;
    }

    @Override
    public double hitungkeliling() {
        return((alas * tinggi)/2);
    }
}
