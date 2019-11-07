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
 */
public class Animal {
    //Atribute
    boolean vegetarian;
    String eats;
    int noOfLegs;
    
    //Constructor
    Animal(boolean parVegetarian, String food, int legs){
        eats = food;
        vegetarian = parVegetarian;
        noOfLegs = legs;
    }
    
    //Function
    boolean isVegetarian(){
        return vegetarian;
    }

    public String getEats() {
        return eats;
    }

    public int getNoOfLegs() {
        return noOfLegs;
    }
    
}
