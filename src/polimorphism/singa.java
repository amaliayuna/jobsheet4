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
class singa extends hewan{
    
    @Override
    void setNama(){
        String singa = "diablo";
        System.out.println("nama singa :"+singa);
    }
    
    @Override
    void setSuara(){
        String suara = "roaarrrrrr";
        System.out.println("suara singa :"+suara);
    }
    @Override
    void setBerat(){
        double berat = 10.0;
        System.out.println("berat singa:"+berat+"Kg");
    }
}
