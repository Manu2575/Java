/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contador01;

/**
 *
 * @author manue
 */
public class Contador01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //int cc = 1;
        //      while (cc<=4) {
        //          System.out.println("Cambalhota " + cc);
        //          cc++;
        //      }
        int cc = 0;
        while (cc<10) {
            cc++;
            if (cc == 1 || cc == 3 || cc == 5 || cc == 7 || cc == 9){
                continue;
            } if (cc == 8){
                break;
            }
            System.out.println("Cambalhota " + cc);
        }
    }
}