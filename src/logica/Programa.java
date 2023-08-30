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
	      int num[] = new int [50];
	      int pro = 0;
	      System.out.println("\nEjercicio 2 y 3:");
	      for (int i = 0; i < num.length; i++) {
		   num[i] = azar.nextInt(50)+1;
		   System.out.println(i+1 + " - " + num[i]);
	           pro+=num[i];
	      }
	      System.out.println("El promedio es: " + pro/50);

   		//4 y 5
		int num[] = new int [5];
		
		System.out.println("Ingrese un número:");
		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
		}
		int resultMay = p.cargarMayor(num);
		int resultMen = p.cargarMenor(num);
		System.out.println("Mayor: " + resultMay);
		System.out.println("Menor: " + resultMen);
	}
	
   		 //6
		int matriz[][] = new int [4][4];
		int mult = 0;		
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				mult = mult + 2;
				matriz[i][j] = mult;
				System.out.print(matriz[i][j] + " ");
			}
	} 

	//7
  int matriz[][] = new int [6][6];
        int mult = 0;
        
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                mult = rd.nextInt(100) + 1;
                matriz[i][j] = mult;
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        
        System.out.println("\nNúmeros pares: ");
        numeroPar(matriz);
    }
    
   
  } //fin main


	int cargarMayor (int a[]) {
		int mayor = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] > mayor)
				mayor = a[i];
		}
		return(mayor);
	}
	
	int cargarMenor (int a[]) {
		int menor = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] < menor)
				menor = a[i];
		}
		return(menor);
	}

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
