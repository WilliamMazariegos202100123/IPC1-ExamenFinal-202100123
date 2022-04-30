/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3;

/**
 *
 * @author Willy
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //PROCESO PARA 8 VACAS
        int[] peso = new int[8];
        int[] leche = new int[8];
        peso[0] = 223;
        peso[1] = 243;
        peso[2] = 100;
        peso[3] = 200;
        peso[4] = 200;
        peso[5] = 155;
        peso[6] = 300;
        peso[6] = 300;

        leche[0] = 30;
        leche[1] = 34;
        leche[2] = 28;
        leche[3] = 45;
        leche[4] = 31;
        leche[5] = 50;
        leche[6] = 29;
        leche[7] = 1;
        int temporal;
        int temporal2;
        for (int i = 0; i < peso.length; i++) {
            for (int j = 0; j < peso.length - 1; j++) {
                if (peso[j + 1] > peso[j]) {
                    temporal = peso[j + 1];
                    peso[j + 1] = peso[j];
                    peso[j] = temporal;
                    temporal2 = leche[j + 1];
                    leche[j + 1] = leche[j];
                    leche[j] = temporal2;
                }
            }
        }
        int suma = 0;
        int suma2 = 0;
        int cap = 0;
        for (int i = 0; i < peso.length; i++) {
            if (suma > 1000) {
                suma=suma-peso[i-1];
                System.out.println("El peso total de las vacas es de: " + suma);
                break;
            } else {
                suma = suma + peso[i];
                cap = i-1;
            }
        }
        for (int i = 0; i < cap + 1; i++) {
            suma2 = suma2 + leche[i];
        }

        System.out.println("Su produccion de leche es de: " + suma2);
    }

}
