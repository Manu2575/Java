/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programaidade;

import java.util.Scanner;

/**
 *
 * @author manue
 */
public class ProgramaIdade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.print("Em que ano voce nasceu? ");
        int nasc = teclado.nextInt();
        int i = 2022-nasc;
        System.out.println("Sua idade e de " + i + " anos");
        if (i>=18){
            System.out.println("Voce e maior de Idade");
        }else{
            System.out.println("Voce e menor de Idade");
        }
        
    }
    
}
