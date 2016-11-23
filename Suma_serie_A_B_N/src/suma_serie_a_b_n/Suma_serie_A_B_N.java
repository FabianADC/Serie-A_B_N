/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suma_serie_a_b_n;

import javax.swing.JOptionPane;
import m_serie.m_serie;

/**
 *
 * @author usuario
 */
public class Suma_serie_A_B_N {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        int lim;
        double a;
        double b;
        double n;
        
        lim=Integer.parseInt(JOptionPane.showInputDialog("ingres un limite"));
        a=Integer.parseInt(JOptionPane.showInputDialog("ingrese el valor de a"));
        b=Integer.parseInt(JOptionPane.showInputDialog("ingrese el valor de b"));
        n=Integer.parseInt(JOptionPane.showInputDialog("ingrese el valor de n"));
        
        m_serie ob1= new m_serie(a, b, n, lim);
        
        ob1.result();
        System.out.println(+ob1.result());
        
        
        
        
        // TODO code application logic here
    }
    
}
