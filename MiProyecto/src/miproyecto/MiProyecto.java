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
        System.out.println(x.getAudifonos());
        x.setAudifonos("Xperia");
        System.out.println(x.getAudifonos());
        //2
        Automovil carro = new Automovil("volkswagen",2000,"Negro",500,"Pointer");
        System.out.println(carro.getAutomovil());
        carro.setAutomovil("toyota");
        System.out.println(carro.getAutomovil());
        //3
        Barco barco = new Barco("El venganza de la reina Anne",20, 1000000, "madera", "pirata");
        System.out.println(barco.getBarco());
        barco.setBarco("El maravilla");
        System.out.println(barco.getBarco());
        //4
        Cacerola cocina = new Cacerola("Super2000", "Tefal", 400, .500,"Teflon");
        System.out.println(cocina.getCacerola());
        cocina.setCacerola("2001xyz");
        System.out.println(cocina.getCacerola());
        //5
        Casa nuevaa = new Casa("Zacatecas", 2000, "Rosa",100000 , "Duplex");
        System.out.println(nuevaa.getCasa());
        nuevaa.setCasa("Guadalupe");
        System.out.println(nuevaa.getCasa());
        //6
        Camara otra = new Camara("Nikon",10000,"Nose",31.2,40.1);
        System.out.println(otra.getCamara());
        otra.setCamara("Sony");
        System.out.println(otra.getCamara());
        //7
        Celular hiper = new Celular("P30", "Tornasol", 20000, 41, "Huawei");
        System.out.println(hiper.getCelular());
        hiper.setCelular("P30 lite");
        System.out.println(hiper.getCelular());
        //8
        Computadora compu = new Computadora("Jerry", "rojo", 6000, 2, "asus");
        System.out.println(compu.getComputadora());
        compu.setComputadora("Larry");
        System.out.println(compu.getComputadora());
        //9
        Desodorante rico = new Desodorante("invisible", "axe", "chcolate", 20, "hombre");
        System.out.println(rico.getDesodorante());
        rico.setDesodorante("ice");
        System.out.println(rico.getDesodorante());
        //10
        Figura_Geometrica mate = new Figura_Geometrica("trigangulo",4,12,6,24);
        System.out.println(mate.getFigura_Geometrica());
        mate.setFigura_Geometrica("cuadrado");
        System.out.println(mate.getFigura_Geometrica());
        //11
        Gato micho = new Gato("pelusa", 1 ,"noruego", 2, "hembra");
       System.out.println(micho.getGato());
        micho.SetGato("squichi");
        System.out.println(micho.getGato());
        //12
        Hamburgesa kfc = new Hamburgesa("lechuga", "tomate","cangrejo", "mostaza", "queso");
        System.out.println(kfc.getHamburgesa());
        kfc.setHamburgesa("tocino");
        System.out.println(kfc.getHamburgesa());
        //13
        Instrumento musica = new Instrumento("piano", 10000, 500, "marfil");
       System.out.println(musica.getInstrumento());
        musica.setInstrumento("violin");
        System.out.println(musica.getInstrumento());
        //14
        Lapiz esc = new Lapiz("bic", "HB", 10, "negro");
        System.out.println(esc.getLapiz());
        esc.setLapiz("prismacolor");
        System.out.println(esc.getLapiz());
        //15
        Libro ula = new Libro("El kybalion", 100, 40, "los 3 iniciados");
        System.out.println(ula.getLibro());
        ula.setLibro("Raromagedon");
        System.out.println(ula.getLibro());
        //16
        Mochila la = new Mochila("chenson",1,"escolar");
       System.out.println(la.getMochila());
        la.setMochila("Tupperware");
        System.out.println(la.getMochila());
        //17
        Moneda dinero = new Moneda("mexicana",5,"oro");
        System.out.println(dinero.getMoneda());
        dinero.setMoneda("peruana");
        System.out.println(dinero.getMoneda());
        //18
        Pajaro pio = new Pajaro("piolin", 1, "chencho", .3, "macho");
        System.out.println(pio.getPajaro());
        pio.setPajaro("picachu");
        System.out.println(pio.getPajaro());
        //19
        Perro rro= new Perro("firulais", 2, "husky", 4, "macho");
        System.out.println(rro.getPerro());
        rro.SetPerro("pluto");
        System.out.println(rro.getPerro());
        //20
        Tablet rata= new Tablet("950", "azul", 2000, .500, "samsung");
        System.out.println(rata.getTablet());
        rata.setTablet("750");
        System.out.println(rata.getTablet());
        
        
    }
    
}
