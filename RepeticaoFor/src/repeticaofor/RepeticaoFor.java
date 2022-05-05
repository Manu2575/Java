/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repeticaofor;

/**
 *
 * @author manue
 */
public class RepeticaoFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*for(int cc=0; cc<=3; cc+=1) {     
              System.out.println("Cambalhota");
        }
        int cc=0;
        while (cc<4) {
            System.out.println("Cambalhota");
        cc++;
        }
        */
            for (int i=1; i<3; i+=1){
                    for(int j=0;j<=2;j+=2){
                        System.out.println(i +" "+ j);
                    }
            }
    }
    
}
