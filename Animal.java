/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Animal;

/**
 *
 * @author STUDENT
 */
public class Animal {
    protected int legs;
    
    protected Animal(){
        System.out.println("Constructing Animal");
        
    }
    protected Animal(int legs){
        this.legs = legs;
        System.out.println("kaki animal : " +legs);
    }
    public void walk(){
        System.out.println("animal berjalan");
    }
    public void eat(){
        System.out.println("animal makan");
    }
}
