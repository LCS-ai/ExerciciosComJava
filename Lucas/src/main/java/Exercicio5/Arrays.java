package Exercicio5;

import java.util.Scanner;


public class Arrays 
{
    public static void main( String[] args )
    {
        int [][] notas = {
            {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, 
            {10, 11, 12, 13, 14, 15, 16, 17, 18, 19}, 
            {20, 21, 22, 23, 24, 25, 26, 27, 28, 29}, 
            {30, 31, 32, 33, 34, 35, 36, 37, 38, 39}, 
            {40, 41, 42, 43, 44, 45, 46, 47, 48, 49}, 
            {50, 51, 52, 53, 54, 55, 56, 57, 58, 59}, 
            {60, 61, 62, 63, 64, 65, 66, 67, 68, 69}, 
            {70, 71, 72, 73, 74, 75, 76, 77, 78, 79}, 
            {80, 81, 82, 83, 84, 85, 86, 87, 88, 89}, 
            {90, 91, 92, 93, 94, 95, 96, 97, 98, 99}, 
            {100}};


        String graph0 = "";
        String graph10 = "";
        String graph20 = "";
        String graph30 = "";
        String graph40 = "";
        String graph50 = "";
        String graph60 = "";
        String graph70 = "";
        String graph80 = "";
        String graph90 = "";
        String graph100 = "";


        //TESTE DE LEITURA

        int quantidadeDeLinhas = notas.length;
        System.out.println("\n\nQuantidade de linhas: "+quantidadeDeLinhas);

        int tamanhoDasColunas = notas[0].length;
        System.out.println("\nQuantidade de colunas por linha: "+tamanhoDasColunas);




        System.out.println("\n\nDIGITE UM VALOR: ");

        Scanner leitor = new Scanner(System.in);
        int notadoaluno = leitor.nextInt();

        for (int i=0; i<notas.length; i++)
        {
            for (int j=0; j<notas[i].length; j++)
            {
                if(notas[0][j] == notadoaluno)
                {
                    graph0 = graph0 + "*";
                    break;
                }

                if (notas[1][j] == notadoaluno)
                {
                    graph10 = graph10 + "*";
                    break;
                }        

                if (notas[2][j] == notadoaluno)
                {
                    graph20 = graph20 + "*";
                    break;
                }

                if (notas[3][j] == notadoaluno)
                {
                    graph30 = graph30 + "*";
                    break;
                }

                if (notas[4][j] == notadoaluno)
                {
                    graph40 = graph40 + "*";
                    break;
                }

                if (notas[5][j] == notadoaluno)
                {
                    graph50 = graph50 + "*";
                    break;
                }

                if (notas[6][j] == notadoaluno)
                {
                    graph60 = graph60 + "*";
                    break;
                }

                if (notas[7][j] == notadoaluno)
                {
                    graph70 = graph70 + "*";
                    break;
                }

                if (notas[8][j] == notadoaluno)
                {
                    graph80 = graph80 + "*";
                    break;
                }

                if (notas[9][j] == notadoaluno)
                {
                    graph90 = graph90 + "*";
                    break;
                }

                if (notas[10][j] == notadoaluno)
                {
                    graph100 = graph100 + "*";
                    break;
                }                       
            }
        }

        System.out.println("00-09: "+ graph0 + "\n10-19: " + graph10 + "\n20-29: " + graph20 + "\n30-39: " + graph30 + "\n40-49: " + graph40 + "\n50-59: " + graph50 + "\n60-69: " + graph60 + "\n70-79: " + graph70 + "\n80-89: " + graph80 + "\n90-99: " + graph90 + "\n100: "+ graph100);            

        leitor.close();
    }
}
