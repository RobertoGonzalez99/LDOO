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
public class FactoryPatternDemo {
    
    public static void main(String[] args) {
      AutomovilFactory automovilFactory = new AutomovilFactory();

      //get an object of Circle and call its draw method.
      Automovil automovil1 = automovilFactory.getAutomovil("CAMIONETA");

      //call method of Automovil
      automovil1.tipo();
      automovil1.color();
      automovil1.motor();
      automovil1.numeroPuertas();
      automovil1.combustible();
      automovil1.cabina();
      automovil1.transmision();

      //get an object of Rectangle and call its draw method.
      Automovil automovil2 = automovilFactory.getAutomovil("CARRO");

      //call draw method of Rectangle0000
      automovil2.tipo();
      automovil2.color();
      automovil2.motor();
      automovil2.numeroPuertas();
      automovil2.combustible();
      automovil2.cabina();
      automovil2.transmision();

      //get an object of Square and call its draw method.
      Automovil automovil3 = automovilFactory.getAutomovil("CAMION");

      //call draw method of square
      automovil3.tipo();
      automovil3.color();
      automovil3.motor();
      automovil3.numeroPuertas();
      automovil3.combustible();
      automovil3.cabina();
      automovil3.transmision();
   }
    
}
