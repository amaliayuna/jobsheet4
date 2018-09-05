/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorphism;

/**
 *
 * @author Amalia Yuna
 */
class kucing extends hewan{
    
    @Override
    void setNama(){
        String kucing = "melly";
        System.out.println("nama kucing :"+kucing);
    }
    
    @Override
    void setSuara(){
        String suara = "miaw meow meong";
        System.out.println("suara kucing :"+suara);
    }
    @Override
    void setBerat(){
        double berat = 3.0;
        System.out.println("berat kucing:"+berat+"Kg");
    }
    
}
