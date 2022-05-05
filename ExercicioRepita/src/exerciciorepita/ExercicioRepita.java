/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciorepita;

import javax.swing.JOptionPane;

/**
 *
 * @author manue
 */
public class ExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //JOptionPane.showMessageDialog(null, "Ola, Mundo!", "Boas Vindas", JOptionPane.ERROR_MESSAGE);
        int n, tot =0;
        int totPar = 0;
        int totImpar = 0;
        int mCen = 0;
        float m = 0;
        int s = 0;
        do{
            n = Integer.parseInt(JOptionPane.showInputDialog(null,"<html>Informe um numero: <br><em>(Valor 0 interrompe)</em></html>"));
            tot += n;{
                if (n!= 0){
                    s++;
                }
                if (n >= 100){
                    mCen++;
                }
                if (n%2 == 0){
                    totPar++;
                } else {
                    totImpar++;
                }
            }
        } while(n != 0);
        m = tot/s;
        JOptionPane.showMessageDialog(null,
                 "<html>Resultado: <br><hr>" + "<br>Total de Valores: " + tot 
                         + "<br>Total de Pares: " + totPar 
                         + "<br>Total de Impares: " + totImpar
                         + "<br>Acima de 100: " + mCen
                         + "<br>Total de Valores Imputados: " + s
                         + "<br>Media dos valores: " + m
                         + "</html>",
                         "Resultado Final", JOptionPane.WARNING_MESSAGE);
    }
    
}
