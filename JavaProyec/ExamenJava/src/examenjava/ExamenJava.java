/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenjava;

import java.util.Scanner;
public class ExamenJava {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        String name = leer.nextLine();

        System.out.println("Bienvenido " + name + "!");
    
        Cuenta cuenta = new Cuenta(name);
        
        cuenta.ingresar(2000.0);
        
        cuenta.retirar(500.0);
        
        System.out.println(cuenta.toString());
        
        System.out.println("");
        System.out.println("");
        
        int numero = 0;
        int contador = 0;
        
        System.out.println("Introduce un numero (introduce -1 para finalizar)");
        
        while (leer.hasNextInt()){
            numero = leer.nextInt();
            if (numero == -1){
                break;
            }
            contador++;
            System.out.println("Introduce otro numero (Introduce -1 para finalizar)");
        }
        
        System.out.println("Has introducido " + contador + " numeros.");
        
    }
    
    
    
}
