package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int filas = 0;
        //System.out.println(filas%2);
        while (filas % 2 == 0) {
            System.out.print("Ingrese el tamaño del triangulo: ");
            filas=sc.nextInt();
        }
        int f=(filas+1)/2;
        for (int i=f;i>0;i--){
            for(int j=1;j<i+1;j++){
                System.out.print(" ");
            }
            for(int k=i;k<f+1;k++){
                System.out.print(" *");
            }
            System.out.println("");
        }

    }

}
