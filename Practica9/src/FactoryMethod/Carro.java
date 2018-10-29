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
public class Carro implements Automovil {
    
    @Override
    public void tipo() {

        System.out.println("Tipo: sedan");
    }

    @Override
    public void color() {
        System.out.println("Color: Azul");
    }

    @Override
    public void motor() {
        System.out.println("Motor: 1.8");
    }
    @Override
    public void numeroPuertas() {
        System.out.println("Puertas: 4");
    }

    @Override
    public void combustible() {
        System.out.println("Combustible: Gasolina");
    }

    @Override
    public void cabina() {
        System.out.println("Cabinaa: Cerrada");
    }
    
    @Override
    public void transmision() {
        System.out.println("Transmision: Automitica \n");
    }
}
