/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miproyecto;

import poo.Audifonos;
import poo.Automovil;
import poo.Barco;
import poo.Cacerola;
import poo.Camara;
import poo.Casa;
import poo.Celular;
import poo.Computadora;
import poo.Desodorante;
import poo.Figura_Geometrica;
import poo.Gato;
import poo.Hamburgesa;
import poo.Instrumento;
import poo.Lapiz;
import poo.Libro;
import poo.Mochila;
import poo.Moneda;
import poo.Pajaro;
import poo.Perro;
import poo.Persona;
import poo.Tablet;

/**
 *
 * @author Mauro Talamantes();
        System.out.println();
        
    }
    
 */
public class MiProyecto {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Persona beto = new Persona("dario",16,175,65,"masculino");
        //beto.nombre="beto";
        System.out.println(beto.getNombre());
        beto.setNombre("beto");
        System.out.println(beto.getNombre());

        //1
        Audifonos x = new Audifonos("Sony",20,3.5,499, "manos libres" );
        x.precio=500;
        //2
        Automovil carro = new Automovil("volkswagen",2000,"Negro",500,"Pointer");
        carro.año=2019;
        //3
        Barco barco = new Barco("El venganza de la reina Anne",20, 1000000, "madera", "pirata");
        barco.nombre="El maravilla";
        //4
        Cacerola cocina = new Cacerola("Super2000", "Tefal", 400, .500,"Teflon");
        cocina.material="jade";
        //5
        Casa nuevaa = new Casa("Zacatecas", 2000, "Rosa",100000 , "Duplex");
        nuevaa.tipo="departamento";
        //6
        Camara otra = new Camara("Nikon",10000,"Nose",31.2,40.1);
        otra.marca="Samsung";
        //7
        Celular hiper = new Celular("P30", "Tornasol", 20000, 41, "Huawei");
        hiper.nombre="P30 lite";
        //8
        Computadora compu = new Computadora("Jerry", "rojo", 6000, 2, "asus");
        compu.color="yrrej";
        //9
        Desodorante rico = new Desodorante("invisible", "axe", "chcolate", 20, "hombre");
        rico.nombre="ice";
        //10
        Figura_Geometrica mate = new Figura_Geometrica("trigangulo",4,12,6,24);
        mate.lados=3;
        //11
        Gato micho = new Gato("pelusa", 1 ,"noruego", 2, "hembra");
        micho.edad=2;
        //12
        Hamburgesa kfc = new Hamburgesa("lechuga", "tomate","cangrejo", "mostaza", "queso");
        kfc.ingrediente_1="repollo";
        //13
        Instrumento musica = new Instrumento("piano", 10000, 500, "marfil");
        musica.material="madera";
        //14
        Lapiz esc = new Lapiz("bic", "HB", 10, "negro");
        esc.precio=15;
        //15
        Libro ula = new Libro("El kybalion", 100, 40, "los 3 iniciados");
        ula.autor="desconocido";
        //16
        Mochila la = new Mochila("chenson",1,"escolar");
        la.peso=2.2;
        //17
        Moneda dinero = new Moneda("mexicana",5,"oro");
        dinero.pais="Peru";
        //18
        Pajaro pio = new Pajaro("piolin", 1, "chencho", .3, "macho");
        pio.raza="xenxotle";
        //19
        Perro rro= new Perro("firulais", 2, "husky", 4, "macho");
        rro.nombre="pluto";
        //20
        Tablet rata= new Tablet("950", "azul", 2000, .500, "samsung");
        rata.peso=.550;
        
        
    }
    
}
