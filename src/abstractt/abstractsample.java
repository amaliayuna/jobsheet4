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
public class abstractsample {
    public static void main(String[] args){
        
        bangundatar obyek1 = new bujursangkar(10);
        
        System.out.println("Luas bujur sangkar dengan sisi 10 =" +obyek1.hitungluas());
        System.out.print("Kelilingnya =" +obyek1.hitungkeliling());
        System.out.print("\n");
        
        bangundatar obyek2 = new lingkaran(7);
        
        System.out.println("Luas lingkaran dengan jari-jari 7 =" +obyek2.hitungluas());
        System.out.print("Kelilingnya =" +obyek2.hitungkeliling());
    }
}
