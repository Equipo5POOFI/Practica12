/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poop12;
/**
 * @author Alin
 */
public class Hilo extends Thread{

    public Hilo(String name) {
        super(name);
    }
    
    public void run(){
        for(int i = 0; i < 10; i++) {
            System.out.println("Iteracion "+i+" de "+ getName());
        }
        System.out.println("Termina el " + getName());
    }   
}
