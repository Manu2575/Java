/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testefuncao01retorno;

/**
 *
 * @author manue
 */
public class TesteFuncao01Retorno {

    /**
     * @param args the command line arguments
     */
     static int soma(int a, int b){
        int s = a + b;
        return s;
    }
    public static void main(String[] args) {
        // TODO code application logic here
         System.out.println("Comecou o programa");
        int sm = soma(5,2);
        System.out.println("A soma vale " + sm);
    }
    
}
