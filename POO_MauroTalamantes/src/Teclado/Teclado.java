/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teclado;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import static java.awt.event.KeyEvent.VK_Q;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Phoenix Azrael
 */
public class Teclado extends JFrame implements KeyListener{
    public Teclado(){
        iniciarPanel();
    }

    private void iniciarPanel() {
        JPanel numeros = new JPanel(new GridLayout(1, 10));
        JPanel letras = new JPanel(new GridLayout(4, 7));
        JPanel flechas = new JPanel(new GridLayout(1, 4));
        
        Dimension dim = new Dimension(30,30);
        
        JButtonC Q = new JButtonC("Q", dim, Color.red);
        JButtonC W = new JButtonC("W", dim, Color.red);
        JButtonC E = new JButtonC("E", dim, Color.red);
        JButtonC R = new JButtonC("R", dim, Color.red);
        JButtonC T = new JButtonC("T", dim, Color.red);
        JButtonC Y = new JButtonC("Y", dim, Color.red);
        JButtonC U = new JButtonC("U", dim, Color.red);
        JButtonC I = new JButtonC("I", dim, Color.red);
        JButtonC O = new JButtonC("O", dim, Color.red);
        JButtonC P = new JButtonC("P", dim, Color.red);
        JButtonC A = new JButtonC("A", dim, Color.red);
        JButtonC S = new JButtonC("S", dim, Color.red);
        JButtonC D = new JButtonC("D", dim, Color.red);
        JButtonC F = new JButtonC("F", dim, Color.red);
        JButtonC G = new JButtonC("G", dim, Color.red);
        JButtonC H = new JButtonC("H", dim, Color.red);
        JButtonC J = new JButtonC("J", dim, Color.red);
        JButtonC K = new JButtonC("K", dim, Color.red);
        JButtonC L = new JButtonC("L", dim, Color.red);
        JButtonC Ñ = new JButtonC("Ñ", dim, Color.red);
        JButtonC Z = new JButtonC("Z", dim, Color.red);
        JButtonC X = new JButtonC("X", dim, Color.red);
        JButtonC C = new JButtonC("C", dim, Color.red);
        JButtonC V = new JButtonC("V", dim, Color.red);
        JButtonC B = new JButtonC("B", dim, Color.red);
        JButtonC N = new JButtonC("N", dim, Color.red);
        JButtonC M = new JButtonC("M", dim, Color.red);
        JButtonC uno = new JButtonC("1", dim, Color.yellow);
        JButtonC dos = new JButtonC("2", dim, Color.yellow);
        JButtonC tres = new JButtonC("3", dim, Color.yellow);
        JButtonC cuatro = new JButtonC("4", dim, Color.yellow);
        JButtonC cinco = new JButtonC("5", dim, Color.yellow);
        JButtonC seis = new JButtonC("6", dim, Color.yellow);
        JButtonC siete = new JButtonC("7", dim, Color.yellow);
        JButtonC ocho = new JButtonC("8", dim, Color.yellow);
        JButtonC nueve = new JButtonC("9", dim, Color.yellow);
        JButtonC cero = new JButtonC("0", dim, Color.yellow);
        JButtonC up = new JButtonC("↑", dim, Color.green);
        JButtonC down = new JButtonC("↓", dim, Color.green);
        JButtonC right = new JButtonC("→", dim, Color.green);
        JButtonC left = new JButtonC("←", dim, Color.green);
       
        flechas.add(left);
        flechas.add(up);
        flechas.add(down);
        flechas.add(right);
        
        letras.add(Q);
        letras.add(W);
        letras.add(E);
        letras.add(R);
        letras.add(T);
        letras.add(Y);
        letras.add(U);
        letras.add(I);
        letras.add(O);
        letras.add(P);
        letras.add(A);
        letras.add(S);
        letras.add(D);
        letras.add(F);
        letras.add(G);
        letras.add(H);
        letras.add(J);
        letras.add(K);
        letras.add(L);
        letras.add(Ñ);
        letras.add(Z);
        letras.add(X);
        letras.add(C);
        letras.add(V);
        letras.add(B);
        letras.add(N);
        letras.add(M);
        
        numeros.add(uno);
        numeros.add(dos);
        numeros.add(tres);
        numeros.add(cuatro);
        numeros.add(cinco);
        numeros.add(seis);
        numeros.add(siete);
        numeros.add(ocho);
        numeros.add(nueve);
        numeros.add(cero);
        
        JTextField ira = new JTextField();
        ira.setSize(dim);
        ira.setBackground(Color.blue);
        ira.setVisible(true);
        ira.setHorizontalAlignment(JTextField.CENTER);
        letras.add(ira);
        
        
        
        setLayout(new BorderLayout());
        add(numeros, BorderLayout.NORTH);
        add(letras, BorderLayout.CENTER);
        add(flechas, BorderLayout.SOUTH);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        KeyListener klel;
        klel = new KeyListener() {
        
            
            @Override
            public void keyTyped(KeyEvent e) {
                if(e.getKeyChar()=='Q' || e.getKeyChar()=='q'){
                    Q.change();
                }
                if(e.getKeyChar()=='W' || e.getKeyChar()=='w'){
                    W.change();
                }
                if(e.getKeyChar()=='E' || e.getKeyChar()=='e'){
                    E.change();
                }
                if(e.getKeyChar()=='R' || e.getKeyChar()=='r'){
                    R.change();
                }
                if(e.getKeyChar()=='T' || e.getKeyChar()=='t'){
                    T.change();
                }
                if(e.getKeyChar()=='Y' || e.getKeyChar()=='y'){
                    Y.change();
                }
                if(e.getKeyChar()=='U' || e.getKeyChar()=='u'){
                    U.change();
                }
                if(e.getKeyChar()=='I' || e.getKeyChar()=='i'){
                    I.change();
                }
                if(e.getKeyChar()=='O' || e.getKeyChar()=='o'){
                    O.change();
                }
                if(e.getKeyChar()=='P' || e.getKeyChar()=='p'){
                    P.change();
                }
                if(e.getKeyChar()=='A' || e.getKeyChar()=='a'){
                    A.change();
                }
                if(e.getKeyChar()=='S' || e.getKeyChar()=='s'){
                    S.change();
                }
                if(e.getKeyChar()=='D' || e.getKeyChar()=='d'){
                    D.change();
                }
                if(e.getKeyChar()=='F' || e.getKeyChar()=='f'){
                    F.change();
                }
                if(e.getKeyChar()=='G' || e.getKeyChar()=='g'){
                    G.change();
                }
                if(e.getKeyChar()=='H' || e.getKeyChar()=='h'){
                    H.change();
                }
                if(e.getKeyChar()=='J' || e.getKeyChar()=='j'){
                    J.change();
                }
                if(e.getKeyChar()=='K' || e.getKeyChar()=='k'){
                    K.change();
                }
                if(e.getKeyChar()=='L' || e.getKeyChar()=='l'){
                    L.change();
                }
                if(e.getKeyChar()=='Ñ' || e.getKeyChar()=='ñ'){
                    Ñ.change();
                }
                if(e.getKeyChar()=='Z' || e.getKeyChar()=='z'){
                    Z.change();
                }
                if(e.getKeyChar()=='X' || e.getKeyChar()=='x'){
                    X.change();
                }
                if(e.getKeyChar()=='C' || e.getKeyChar()=='c'){
                    C.change();
                }
                if(e.getKeyChar()=='V' || e.getKeyChar()=='v'){
                    V.change();
                }
                if(e.getKeyChar()=='B' || e.getKeyChar()=='b'){
                    B.change();
                }
                if(e.getKeyChar()=='N' || e.getKeyChar()=='n'){
                    N.change();
                }
                if(e.getKeyChar()=='M' || e.getKeyChar()=='m'){
                    M.change();
                }
                if(e.getKeyChar()=='1'){
                    uno.change();
                }
                if(e.getKeyChar()=='2'){
                    dos.change();
                }
                if(e.getKeyChar()=='3'){
                    tres.change();
                }
                if(e.getKeyChar()=='4'){
                    cuatro.change();
                }
                if(e.getKeyChar()=='5'){
                    cinco.change();
                }
                if(e.getKeyChar()=='6'){
                    seis.change();
                }
                if(e.getKeyChar()=='7'){
                    siete.change();
                }
                if(e.getKeyChar()=='8'){
                    ocho.change();
                }
                if(e.getKeyChar()=='9'){
                    nueve.change();
                }
                if(e.getKeyChar()=='0'){
                    cero.change();
                }
                if(e.getKeyCode()==37){
                    left.change();
                }
                if(e.getKeyCode()==38){
                    up.change();
                }
                if(e.getKeyCode()==39){
                    right.change();
                }
                if(e.getKeyCode()==40){
                    down.change();
                }
                else{
                    
                }
                ira.setText(null);
            }
            @Override
            public void keyPressed(KeyEvent e) {
                if(e.getKeyChar()=='Q' || e.getKeyChar()=='q'){
                    Q.change2();
                }
                if(e.getKeyChar()=='W' || e.getKeyChar()=='w'){
                    W.change2();
                }
                if(e.getKeyChar()=='E' || e.getKeyChar()=='e'){
                    E.change2();
                }
                if(e.getKeyChar()=='R' || e.getKeyChar()=='r'){
                    R.change2();
                }
                if(e.getKeyChar()=='T' || e.getKeyChar()=='t'){
                    T.change2();
                }
                if(e.getKeyChar()=='Y' || e.getKeyChar()=='y'){
                    Y.change2();
                }
                if(e.getKeyChar()=='U' || e.getKeyChar()=='u'){
                    U.change2();
                }
                if(e.getKeyChar()=='I' || e.getKeyChar()=='i'){
                    I.change2();
                }
                if(e.getKeyChar()=='O' || e.getKeyChar()=='o'){
                    O.change2();
                }
                if(e.getKeyChar()=='P' || e.getKeyChar()=='p'){
                    P.change2();
                }
                if(e.getKeyChar()=='A' || e.getKeyChar()=='a'){
                    A.change2();
                }
                if(e.getKeyChar()=='S' || e.getKeyChar()=='s'){
                    S.change2();
                }
                if(e.getKeyChar()=='D' || e.getKeyChar()=='d'){
                    D.change2();
                }
                if(e.getKeyChar()=='F' || e.getKeyChar()=='f'){
                    F.change2();
                }
                if(e.getKeyChar()=='G' || e.getKeyChar()=='g'){
                    G.change2();
                }
                if(e.getKeyChar()=='H' || e.getKeyChar()=='h'){
                    H.change2();
                }
                if(e.getKeyChar()=='J' || e.getKeyChar()=='j'){
                    J.change2();
                }
                if(e.getKeyChar()=='K' || e.getKeyChar()=='k'){
                    K.change2();
                }
                if(e.getKeyChar()=='L' || e.getKeyChar()=='l'){
                    L.change2();
                }
                if(e.getKeyChar()=='Ñ' || e.getKeyChar()=='ñ'){
                    Ñ.change2();
                }
                if(e.getKeyChar()=='Z' || e.getKeyChar()=='z'){
                    Z.change2();
                }
                if(e.getKeyChar()=='X' || e.getKeyChar()=='x'){
                    X.change2();
                }
                if(e.getKeyChar()=='C' || e.getKeyChar()=='c'){
                    C.change2();
                }
                if(e.getKeyChar()=='V' || e.getKeyChar()=='v'){
                    V.change2();
                }
                if(e.getKeyChar()=='B' || e.getKeyChar()=='b'){
                    B.change2();
                }
                if(e.getKeyChar()=='N' || e.getKeyChar()=='n'){
                    N.change2();
                }
                if(e.getKeyChar()=='M' || e.getKeyChar()=='m'){
                    M.change2();
                }
                if(e.getKeyChar()=='1'){
                    uno.change2();
                }
                if(e.getKeyChar()=='2'){
                    dos.change2();
                }
                if(e.getKeyChar()=='3'){
                    tres.change2();
                }
                if(e.getKeyChar()=='4'){
                    cuatro.change2();
                }
                if(e.getKeyChar()=='5'){
                    cinco.change2();
                }
                if(e.getKeyChar()=='6'){
                    seis.change2();
                }
                if(e.getKeyChar()=='7'){
                    siete.change2();
                }
                if(e.getKeyChar()=='8'){
                    ocho.change2();
                }
                if(e.getKeyChar()=='9'){
                    nueve.change2();
                }
                if(e.getKeyChar()=='0'){
                    cero.change2();
                }
                if(e.getKeyCode()==37){
                    left.change();
                }
                if(e.getKeyCode()==38){
                    up.change();
                }
                if(e.getKeyCode()==39){
                    right.change();
                }
                if(e.getKeyCode()==40){
                    down.change();
                }
             
              
                else{
                    
                }
          ira.setText(null);
            }
            @Override
            public void keyReleased(KeyEvent e) {
                if(e.getKeyChar()=='Q' || e.getKeyChar()=='q'){
                    Q.change();
                }
                if(e.getKeyChar()=='W' || e.getKeyChar()=='w'){
                    W.change();
                }
                if(e.getKeyChar()=='E' || e.getKeyChar()=='e'){
                    E.change();
                }
                if(e.getKeyChar()=='R' || e.getKeyChar()=='r'){
                    R.change();
                }
                if(e.getKeyChar()=='T' || e.getKeyChar()=='t'){
                    T.change();
                }
                if(e.getKeyChar()=='Y' || e.getKeyChar()=='y'){
                    Y.change();
                }
                if(e.getKeyChar()=='U' || e.getKeyChar()=='u'){
                    U.change();
                }
                if(e.getKeyChar()=='I' || e.getKeyChar()=='i'){
                    I.change();
                }
                if(e.getKeyChar()=='O' || e.getKeyChar()=='o'){
                    O.change();
                }
                if(e.getKeyChar()=='P' || e.getKeyChar()=='p'){
                    P.change();
                }
                if(e.getKeyChar()=='A' || e.getKeyChar()=='a'){
                    A.change();
                }
                if(e.getKeyChar()=='S' || e.getKeyChar()=='s'){
                    S.change();
                }
                if(e.getKeyChar()=='D' || e.getKeyChar()=='d'){
                    D.change();
                }
                if(e.getKeyChar()=='F' || e.getKeyChar()=='f'){
                    F.change();
                }
                if(e.getKeyChar()=='G' || e.getKeyChar()=='g'){
                    G.change();
                }
                if(e.getKeyChar()=='H' || e.getKeyChar()=='h'){
                    H.change();
                }
                if(e.getKeyChar()=='J' || e.getKeyChar()=='j'){
                    J.change();
                }
                if(e.getKeyChar()=='K' || e.getKeyChar()=='k'){
                    K.change();
                }
                if(e.getKeyChar()=='L' || e.getKeyChar()=='l'){
                    L.change();
                }
                if(e.getKeyChar()=='Ñ' || e.getKeyChar()=='ñ'){
                    Ñ.change();
                }
                if(e.getKeyChar()=='Z' || e.getKeyChar()=='z'){
                    Z.change();
                }
                if(e.getKeyChar()=='X' || e.getKeyChar()=='x'){
                    X.change();
                }
                if(e.getKeyChar()=='C' || e.getKeyChar()=='c'){
                    C.change();
                }
                if(e.getKeyChar()=='V' || e.getKeyChar()=='v'){
                    V.change();
                }
                if(e.getKeyChar()=='B' || e.getKeyChar()=='b'){
                    B.change();
                }
                if(e.getKeyChar()=='N' || e.getKeyChar()=='n'){
                    N.change();
                }
                if(e.getKeyChar()=='M' || e.getKeyChar()=='m'){
                    M.change();
                }
                if(e.getKeyChar()=='1'){
                    uno.change();
                }
                if(e.getKeyChar()=='2'){
                    dos.change();
                }
                if(e.getKeyChar()=='3'){
                    tres.change();
                }
                if(e.getKeyChar()=='4'){
                    cuatro.change();
                }
                if(e.getKeyChar()=='5'){
                    cinco.change();
                }
                if(e.getKeyChar()=='6'){
                    seis.change();
                }
                if(e.getKeyChar()=='7'){
                    siete.change();
                }
                if(e.getKeyChar()=='8'){
                    ocho.change();
                }
                if(e.getKeyChar()=='9'){
                    nueve.change();
                }
                if(e.getKeyChar()=='0'){
                    cero.change();
                }
                if(e.getKeyCode()==37){
                    left.change();
                }
                if(e.getKeyCode()==38){
                    up.change();
                }
                if(e.getKeyCode()==39){
                    right.change();
                }
                if(e.getKeyCode()==40){
                    down.change();
                }
                else{
                    
                }
                ira.setText(null);
            }
        };
        ira.addKeyListener(klel);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyReleased(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}


