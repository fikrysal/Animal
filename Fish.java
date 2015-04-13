/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Animal;

/**
 *
 * @author STUDENT
 */
public class Fish extends Pet{
    
    public Fish(){
    }
    public String getName(){
        System.out.println("Nama fish : "+name);
        return name;
    }
    public String setName(String name){
        this.name = name;
        return name;
    }
    public void play(){
        System.out.println("Fish bermain");
    }
    public void walk(){
        System.out.println("Fish berjalan");
    }
    public void eat(){
        System.out.println("Fish makan");
    }
}
