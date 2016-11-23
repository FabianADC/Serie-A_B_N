/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m_serie;

/**
 *
 * @author usuario
 */
public class m_serie {
    
    
    
    public double a;
    public double b;
    public double n;
    public int lim;

    public m_serie(double a, double b, double n, int lim) {
        this.a = a;
        this.b = b;
        this.n = n;
        this.lim = lim;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getN() {
        return n;
    }

    public void setN(double n) {
        this.n = n;
    }

    public int getLim() {
        return lim;
    }

    public void setLim(int lim) {
        this.lim = lim;
    }

public double result(){
       
        
        double suma = 0.0;
        

        for (int i = 1; i <= lim; i++) {
            if (i == 1) {
                suma = suma + (1 / a);

            } else {
                suma = suma + (1 / (a + (n * b)));

                n += 1;
            }

        }

        return suma;
    }

}
