
import java.util.List;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
List es una colección, y una colección puede ser interfaces y clase abstracta que nos permite identificar los objetos independientemente de la implementación. Es decir, son genéricas.

Mientras, un ArrayList es contenedor que contiene una implementación de la colección List.
 */

/**
 *
 * @author mauro
 */
public class Lista {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        List<String> Nombres;
        List<Object> X;
        
        X = new ArrayList<>();
        Nombres = new ArrayList<>();
        
        Nombres.add("Peru");
        Nombres.add("Colombia");
        Nombres.add("Mexico");
        
        X.add("1");
        X.add('1');
        X.add(124);
        X.add(15.4);
        
        System.out.println(X);
        System.out.println(Nombres.contains("Colombia"));

    }
    
}
