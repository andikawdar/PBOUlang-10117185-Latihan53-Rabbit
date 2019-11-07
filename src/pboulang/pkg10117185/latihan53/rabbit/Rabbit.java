/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboulang.pkg10117185.latihan53.rabbit;

/**
 *
 * @author user
 * Nama     : Andhyka Widariyanto
 * NIM      : 10117185
 * Kelas    : PBO-Ulang
 * Tugas    : Latihan 53 - Rabbit
 * 
 */
public class Rabbit extends Animal {
    //Atribute
    String color;
    String name;
    
    //Constructor
    Rabbit (String parName, boolean vegetarian, String food, int legs, String parColor){
        super(vegetarian, food, legs);
        name = parName;
        color = parColor;
    }
    
    //Function

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }
    
   
}
