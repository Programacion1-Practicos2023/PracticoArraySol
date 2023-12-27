package logica;

import java.util.Scanner;
import java.util.Random;

public class Programa {
	Scanner entrada = new Scanner(System.in);
	Random azar = new Random();
	
	public void iniciar() {
				
		//1
		System.out.println("\nEjercicio 1:");
		int num[] = new int[20];
		for (int i = 0; i < num.length; i++) {
			num[i] = 1;
			System.out.println(i+1 + " - " +num[i]);
		}

    //2 y 3
        	System.out.println("\nEjercicio 2 y 3:");
	      int num2[] = new int [50];
	      int pro = 0;
	      System.out.println("\nEjercicio 2 y 3:");
	      for (int i = 0; i < num2.length; i++) {
		   num2[i] = azar.nextInt(50)+1;
		   System.out.println(i+1 + " - " + num2[i]);
	           pro+=num2[i];
	      }
	      System.out.println("El promedio es: " + pro/50);
	
   //4 y 5
    	System.out.println("\nEjercicio 4 y 5:");
		int num4[] = new int [5];
		
		System.out.println("Ingrese un número:");
		for (int i = 0; i < num4.length; i++) {
			num4[i] = entrada.nextInt();
		}
		int resultMay = elMayor(num4);
		int resultMen = elMenor(num4);
		System.out.println("Mayor: " + resultMay);
		System.out.println("Menor: " + resultMen);

     //6
    System.out.println("\nEjercicio 6:");
		int matriz6[][] = new int [4][4];
		int mult6 = 0;		
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				mult6 = mult6 + 2;
				matriz6[i][j] = mult6;
				System.out.print(matriz6[i][j] + " ");
			}
	} 
	
   //7
  System.out.println("\nEjercicio 7:");
  int matriz7[][] = new int [6][6];
        int mult7 = 0;
        
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                mult7 = azar.nextInt(100) + 1;
                matriz7[i][j] = mult7;
                System.out.print(matriz7[i][j] + " ");
            }
            System.out.println();
        }
        
        System.out.println("\nNúmeros pares: ");
        numeroPar(matriz7);
  
    
   
  } //fin main


	

 public static void numeroPar (int a[][]) {
        int numPar[][] = new int [6][6];
        
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (a[i][j] % 2 == 0) 
                    numPar[i][j] = a[i][j];
                System.out.print(numPar[i][j] + " ");
            }
            System.out.println();
        }

		
}

  int elMayor (int a[]) {
		int mayor = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] > mayor)
				mayor = a[i];
		}
		return(mayor);
	}
	
	int elMenor (int a[]) {
		int menor = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] < menor)
				menor = a[i];
		}
		return(menor);
	}
}

