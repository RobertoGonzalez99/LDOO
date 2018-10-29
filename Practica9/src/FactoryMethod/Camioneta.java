/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryMethod;

/**
 *
 * @author luis_
 */
public class Camioneta implements Automovil {


    @Override
    public void tipo() {

        System.out.println("Tipo: pickup");
    }

    @Override
    public void color() {
        System.out.println("Color: Rojo");
    }

    @Override
    public void motor() {
        System.out.println("Motor: 2.7 VVTI");
    }
    @Override
    public void numeroPuertas() {
        System.out.println("Puertas: 4");
    }

    @Override
    public void combustible() {
        System.out.println("Combustible: Diesel");
    }

    @Override
    public void cabina() {
        System.out.println("Cabinaa: Caja");
    }
    
    @Override
    public void transmision() {
        System.out.println("Transmision: Standar \n");
    }
}
