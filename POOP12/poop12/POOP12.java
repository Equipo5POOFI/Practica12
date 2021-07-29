/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poop12;

/**
 *
 * @author Alin
 */
public class POOP12 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("#########################Theread######################");
        Hilo hilo1 = new Hilo("Primer hilo");
        hilo1.start();
        
        new Hilo("Segundo hilo").start();
        
        System.out.println("#########################Runnable######################");
        
        new Thread(new HiloR(),"HiloR 1").start();
        new Thread(new HiloR(),"HiloR 2").start();
        System.out.println("Termina el hilo principal");
        
    }   
}
