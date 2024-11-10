/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contarletrasa;

import java.util.Scanner;

/**
 *
 * @author jcplo
 */
public class Contarletrasa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
    Scanner teclado = new Scanner(System.in);
    System.out.print("Ingrese una palabra: ");
    String palabra = scanner.nextLine();
    int contador = 0;
    for (int i = 0; i < palabra.length(); i++){     
    if (palabra.charAt(i) == 'a' || palabra.charAt(i) == 'A'){
    contador++;
       }
    }
    System.out.println("La letra 'a' aparece " + contador + " veces en la palabra ingresada.");
    }
    
}
