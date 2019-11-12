/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculadora;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Phoenix Azrael
 */
public class ListenerAmarillos implements ActionListener{
    JTextField h = new JTextField();
    JButtonC aux = new JButtonC();
    
    public ListenerAmarillos(JTextField a) {
        this.h = a;
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        aux = (JButtonC) ae.getSource();
        if("C".equals(aux.getText())){
            h.setText(null);
        }
        if("CE".equals(aux.getText())){
            h.setText(h.getText().substring(0, h.getText().length()-1));
        }
        if(".".equals(aux.getText())){
            int i=0,j=0,k=0;
            i = h.getText().length();
            char auxilio;
            for(j=0; j<i; j++){
                auxilio = h.getText().charAt(j);
                if(auxilio == '.'){
                    k= 1;
                }
                if(auxilio == 'x' || auxilio == '/' || auxilio == '+' || auxilio == '−'){
                    k= 0;
                }
            }
            if(k==0){
                h.setText(h.getText() + aux.getText());
            }
        }
        if("?".equals(aux.getText())){
            h.setText(null);
           h.setText("Que vez aca 😒😤");
            JOptionPane.showMessageDialog( null, "Guau ;)" );
            h.setText("");
        }
    }
}
