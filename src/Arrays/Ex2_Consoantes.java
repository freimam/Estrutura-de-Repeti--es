package Arrays;

/*
Faça um Programa que leia um vetor de 6 caracteres,
e diga quantas foram atendidas foram lidas.
Imprima as consoantes.
*/

import java.util.Scanner;

public class Ex2_Consoantes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //ler teclado

        String[] consoantes = new String[6]; //array guardar letras - 6 posições
        int quantidadeConsoantes = 0;

        int count = 0;
        do {
            System.out.println("Letra: ");
            String letra = scan.next(); // recebe as letras

            if ( !(letra.equalsIgnoreCase("a") | //equalsIgnoreCase - compara strings
                    letra.equalsIgnoreCase("e") |
                    letra.equalsIgnoreCase("i") |
                    letra.equalsIgnoreCase("o") |
                    letra.equalsIgnoreCase("u")) )  {
                consoantes[count] = letra; //se for diferente, guarda em consoantes
                quantidadeConsoantes++;
            }

            count++;

        } while(count < consoantes.length); //conta posições de consoantes 

        System.out.print("Consoantes: ");
        for ( String consoante  :  consoantes ) { // tipo array : array
            if ( consoante != null)
                System.out.print(consoante + " ");
        }
        System.out.println("Quantidade de consoantes: " + quantidadeConsoantes);
        System.out.println(consoantes.length);

    }

}