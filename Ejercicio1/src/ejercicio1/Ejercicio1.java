package ejercicio1;

import java.util.Scanner;
public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b;
        System.out.println("Ingrese numnero 1:");
        a=sc.nextInt();
        System.out.println("Ingrese numero 2:");
        b=sc.nextInt();
        if(a>b){
            System.out.println(a+" es mayor que "+b);
        }else{
            if(b>a){
                System.out.println(b+" es mayor que "+a);
            }else{
                if(a==b){
                    System.out.println("SON IGUALES");
                }
            }
        }
        
    }
    
}
