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
public class PBOUlang10117185Latihan53Rabbit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Rabbit bunny = new Rabbit("Peter", false, "grass", 4, "grey");
        System.out.println("Hello, His name is "+bunny.getName());
        System.out.println(bunny.getName()+" is Vegetarian? "+bunny.isVegetarian());
        System.out.println(bunny.getName()+" eats "+bunny.getEats());
        System.out.println(bunny.getName()+" has "+bunny.getNoOfLegs()+" legs.");
        System.out.println(bunny.getName()+" color is "+bunny.getColor());
    }
    
}
