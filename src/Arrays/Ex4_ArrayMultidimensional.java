package Arrays;

import java.util.Random;

/*
Gere e imprima uma matriz M 4x4 com valores aleatórios entre 0-9.
*/
public class Ex4_ArrayMultidimensional {
    public static void main(String[] args) {
        Random random = new Random(); // gera numeros automaticamente

        int[][] M = new int[4][4]; //Matriz multidimensional 1ª [] linha, 2ª [] coluna

        for(int i = 0; i < M.length; i++) { // busca 1ª linha
            for( int j = 0; j < M[i].length; j++) { // busca 1ª coluna
                M[i][j] = random.nextInt(9);
            }
        }

        System.out.println("Matriz: ");
        for (int[] linha : M  ) {
            for (int coluna : linha ) {
                System.out.print(coluna + " ");
            }
            System.out.println();
        }

    }


}