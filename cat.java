/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Animal;

/**
 *
 * @author STUDENT
 */
public class cat extends Pet{
    public cat(){
    }
    public cat(String name){
        this.name=name;
    }
    
    public String getName(){
        System.out.println("nama cat : "+name);
        return name;
    }
    public String setName(String name){
        name = name;
        return name;
    }
    public void play(){
        System.out.println(name +" bermain");
    }
    public void eat(){
        System.out.println(name +" makan");
    }
}
