package Repetição;
import java.util.Scanner;

/*
Faça um programa que leia conjuntos de dois valores,
o primeiro representando o nome do aluno e o segundo representando a sua idade.
(Pare o programa inserindo o valor 0 no campo nome)
*/
public class Ex1_NomeIdade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //scanner ler através do teclado

        String nome;
        int idade;

        while(true) { // enquanto verdade .... 
            System.out.println("Nome: ");
            nome = scan.next(); //scan.next() - utilizado para receber caracter ao objeto nome
            if (nome.equals("0")) break; //se nome igual a 0 -

            System.out.println("Idade: ");
            idade = scan.nextInt(); //scan.nextInt() - utilizado para receber numeros inteiros ao objeto idade
        }

        System.out.println("Continua aqui...");

    }

}