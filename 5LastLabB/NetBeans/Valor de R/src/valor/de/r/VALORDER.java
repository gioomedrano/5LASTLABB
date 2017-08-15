/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package valor.de.r;
import java.util.Scanner;
/**
 *
 * @author estudiante
 */
public class VALORDER {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double R;
        double M;
        double C;
        
        System.out.println("Ingresar el valor de C");
        Scanner c=new Scanner(System.in);
        C=c.nextInt();
        
        System.out.println("Ingresar el valor de M");
        Scanner m=new Scanner(System.in);
        M=m.nextInt();
        
       R=M+C/2;
               
       System.out.println(R); 
       
       
    }
    
}
