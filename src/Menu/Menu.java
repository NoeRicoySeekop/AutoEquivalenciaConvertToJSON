package Menu;

import java.util.Scanner;

public class Menu {
      
    public int showOptionsConvertJson() {
        
        String entradaTeclado = "";
        Scanner entradaEscaner = new Scanner (System.in);
        
        System.out.println("Convertir la API de Auto Equivalencia a un Objeto JS");
        
        System.out.println("1 - Mercado Libre");
        System.out.println("2 - Autocosmos");
        System.out.println("3 - Seminuevos");
        System.out.println("4 - Segunda mano");
        
        System.out.print("Introducir la opción de la interfaz a obtener: ");
        
        entradaTeclado = entradaEscaner.nextLine();
        
        return Integer.parseInt(entradaTeclado);
    }
    
    public int showOptionsAutoCosmos() {
        String entradaTeclado = "";
        Scanner entradaEscaner = new Scanner (System.in);
        
        System.out.println("\nConvertir la API de Auto cosmos");
        
        System.out.println("1 - Data");
        System.out.println("2 - URL Modelos");
        
        System.out.print("Introducir la opción a obtener: ");
        
        entradaTeclado = entradaEscaner.nextLine();
        
        return Integer.parseInt(entradaTeclado);
    }
    
    public int showOptionsSegundaMano() {
        String entradaTeclado = "";
        Scanner entradaEscaner = new Scanner (System.in);
        
        System.out.println("\nConvertir la API de Segunda Mano");
        
        System.out.println("1 - 2021");
        System.out.println("2 - 2022");
        System.out.println("3 - 2023");
        
        System.out.print("Introducir la opción a obtener: ");
        
        entradaTeclado = entradaEscaner.nextLine();
        
        return Integer.parseInt(entradaTeclado);
    }
}
