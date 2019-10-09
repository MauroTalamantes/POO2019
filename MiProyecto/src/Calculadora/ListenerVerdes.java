/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculadora;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;

/**
 *
 * @author Phoenix Azrael
 */
public class ListenerVerdes implements ActionListener{
    JTextField h = new JTextField();
    JButtonC aux = new JButtonC();
    //Calculadora calc = new Calculadora();
    
    public ListenerVerdes(JTextField a) {
        this.h = a;
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        
        aux = (JButtonC) ae.getSource();
        if("+/-" == aux.getText()){
            int i,j,w=0;
            char a,b='#';
            String x=null,y=null;
            
            i = h.getText().length();
            
            
            for(j=0; j<i; j++){
                a = h.getText().charAt(j);
                if(a == 'x' || a == '/' || a == '−' || a == '+'){
                    w=1;
                    b= a;
                }
            }
            
            if(w==1){
                for(j=i-1; j>=0; j--){
                    a = h.getText().charAt(j);
                    if(a == 'x' || a == '/' || a == '−' || a == '+'){
                        if(x.charAt(0)=='-'){
                            x = x.substring(1, x.length());
                        }
                        else{
                            x = ("-" + x);
                        }
                        
                        b = a;
                        j=-1;
                    }
                    else{
                        if(x==null){
                            x = String.valueOf(a);
                        }
                        else{
                            x = (a + x);
                        }
                    }
                }
                for(j=0; j<i; j++){
                    a = h.getText().charAt(j);
                    if(a == 'x' || a == '/' || a == '−' || a == '+'){
                        j=i;
                    }
                    else{
                        if(y==null){
                            y = String.valueOf(a);
                        }
                        else{
                            y = (y + a);
                        }
                    }
                }
                h.setText(y + b + x);
            }
            else{
                for(j=0; j<i; j++){
                    a = h.getText().charAt(j);
                    if(a == 'x' || a == '/' || a == '−' || a == '+'){
                        j=i;
                    }
                    else{
                        if(x==null){
                            x = String.valueOf(a);
                        }
                        else{
                            x = (x + a);
                        }
                    }
                }
                if(x.charAt(0)=='-'){
                    x = x.substring(1, x.length());
                }
                else{
                    x= ("-" + x);
                }
                
                h.setText(x);
            }
        }
        else{
            h.setText(h.getText() + aux.getText());
        }
    }
}
