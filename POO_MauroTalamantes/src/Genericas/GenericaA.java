/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Genericas;

/**
 *
 * @author mauro
 * @param <Tipo>
 
 */
public class GenericaA<Tipo> {

   Tipo aux ;
   
    public GenericaA(Tipo aux){
        this.aux = aux;
    }
    
    public void classType(){
        System.out.println(this.aux.toString());
    }
    
}
