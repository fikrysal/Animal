/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Animal;

/**
 *
 * @author Hj. Elis Yulifah
 */
public class Main {
    public static void main(String [] args)
   {
       Animal a = new Animal();
       a.eat();
       a.walk();
       System.out.println("");
       Animal a2 = new Animal(4);
       a2.eat();
       a2.walk();
       System.out.println("");
       Pet p = new Pet(){};
       p.play();
       System.out.println("");
       Spider s = new Spider();
       s.eat();
       System.out.println("");
       Fish f = new Fish();
       f.eat();
       f.walk();
       f.eat();
       System.out.println("");
       Pet p1 = new Fish();
       p1.setName("Jon"); 
       p1.getName();
       p1.play();
       p1.walk();
       p1.eat();
       System.out.println("");
       Pet p2 = new cat("Garfield"); 
       p2.getName();
       p2.play();
       p2.eat();
    }
}
