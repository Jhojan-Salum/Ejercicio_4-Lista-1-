/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_4;

/**
 *
 * @author Jhojan
 */
import java.util.Scanner;
public class Ejercicio_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        int Edjuan, Edalberto, Edana, Edmama;
        System.out.println("Ingrese la Edad de Juan: ");
        Edjuan = Entrada.nextInt();
        Edalberto = (2/3)*Edjuan;
        Edana = (4/3)*Edjuan;
        Edmama = Edjuan + Edalberto + Edana;
        System.out.println("La mama tiene: " + Edmama + " Años");
    }
    
}
