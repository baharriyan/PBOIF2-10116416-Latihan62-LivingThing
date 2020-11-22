package pboif2.pkg10116416.latihan61.livingthing;
/**
 * @author
 * Nama  : Riyan Bahar
 * Kelas : PBOIF2
 * NIM   : 10116416
 * Deskripsi Program : 
 * Program untuk memanggil makhluk bernyawa.
 */

//Import Class
import LivingThing.Human;

public class PBOIF210116416Latihan62LivingThing {
    public static void main(String[] args) {
        
        // Human
        Human human = new Human();
        human.setNama("Riyan Bahar");
        human.walk(human.getNama());
        human.breath(human.getNama());
        human.eat(human.getNama());
    }
    
}
