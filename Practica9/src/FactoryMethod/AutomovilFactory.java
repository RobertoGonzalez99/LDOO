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
public class AutomovilFactory {
    
     public Automovil getAutomovil(String automovilType){
      if(automovilType == null){
         return null;
      }		
      if(automovilType.equalsIgnoreCase("CAMIONETA")){
         return new Camioneta();
         
      } else if(automovilType.equalsIgnoreCase("CARRO")){
         return new Carro();
         
      } else if(automovilType.equalsIgnoreCase("CAMION")){
         return new Camion();
      }
      
      return null;
   }
}
