package Repetição;
import java.util.Scanner;

/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares.
*/
public class Ex4_ParImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //ler teclado

        int quantNumeros;
        int numero;
        int quantPares = 0;
        int quantImpares = 0;

        System.out.println("Quantidade de números: ");
        quantNumeros = scan.nextInt(); // guarda quant numeros

        int count = 0; //iniciando contador
        do {
            System.out.println("Número: ");
            numero = scan.nextInt(); //recebe numero

            if (numero % 2 == 0 ) quantPares++; //testa se e par
            else quantImpares++; // se nao e impar

            count = count +1;
        } while(count < quantNumeros); //conta quantidade numeros que serão informados

        System.out.println("Quantidade Par: " + quantPares);
        System.out.println("Quantidade Ímpar: " + quantImpares);
    }
}