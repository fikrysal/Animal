/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Animal;

/**
 *
 * @author STUDENT
 */
public abstract class Pet extends Animal{
    public String name;
    public Pet(){
        System.out.println("Constructing Pet");
    }
    
    public String getName(){
        return name;
    }
    public String setName(String name){
        this.name = name;
        return name;
    }
    public void play(){
        System.out.println("pet bermain");
    }
}
