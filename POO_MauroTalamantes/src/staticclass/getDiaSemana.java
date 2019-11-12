/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staticclass;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author mauro
 */
public class getDiaSemana {
    
    public String getDiaSemana(String fecha) {
 //Crear variable de tipo String       
 String Valor_dia = null;
 //crear un objeto de tipo fecha con ese fomrmato
 SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
 //crear un tipo de dato Date
 Date fechaActual = null;
 try {//esto es para excepciones
 fechaActual = df.parse(fecha);//pasar de un tipo a otro
 } catch (ParseException e) {
 System.err.println("No se ha podido parsear la fecha.");
 e.printStackTrace();
 }
 //Es el uso del calendario gregoriano
 GregorianCalendar fechaCalendario = new GregorianCalendar();//creas un objeto de tipo GreogrianCalendar
 //le seteas al objeto anterior el tiempo(lo que pusiste en el string de fecha al principio, ya llego aca
 fechaCalendario.setTime(fechaActual);
 //aca tomas el dia de la semana que se almacena como un entero
 int diaSemana = fechaCalendario.get(Calendar.DAY_OF_WEEK);
 //comienza la comparacion de lo que obtuviste arriba
 if (diaSemana == 1) {
 Valor_dia = "Domingo";
 } else if (diaSemana == 2) {
 Valor_dia = "Lunes";
 } else if (diaSemana == 3) {
 Valor_dia = "Martes";
 } else if (diaSemana == 4) {
 Valor_dia = "Miercoles";
 } else if (diaSemana == 5) {
 Valor_dia = "Jueves";
 } else if (diaSemana == 6) {
 Valor_dia = "Viernes";
 } else if (diaSemana == 7) {
 Valor_dia = "Sabado";
 }
 //finalmente solo regresa el dato al que pudo entrar
 return Valor_dia;
 }
}
