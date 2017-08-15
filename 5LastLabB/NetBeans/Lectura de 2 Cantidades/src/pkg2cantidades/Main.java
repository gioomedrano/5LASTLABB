/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2cantidades;
import java.util.Scanner;
/**
 *
 * @author estudiante
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int A;
        int B;
        System.out.println("Ingresar el valor de A");
        Scanner a=new Scanner(System.in);
        A=a.nextInt();
        
        System.out.println("Ingresar el valor de B");
        Scanner b=new Scanner(System.in);
        B=b.nextInt();
        
        if(A>B){
            System.out.println(A+"  "+B);
        }else{
            System.out.println(B+"  "+A);
        }
        
    }
    
}
