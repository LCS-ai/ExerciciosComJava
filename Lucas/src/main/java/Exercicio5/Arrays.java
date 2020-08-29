package Exercicio5;

import java.util.Scanner;


public class Arrays 
{
    public static void main(String[] args )
    {
        
        System.out.println("\n\nDIGITE A QUANTIA DE NOTAS: ");
        Scanner leitor = new Scanner(System.in);
        int qtdNotas = leitor.nextInt();

        int [] notasArmazenadas = new int [qtdNotas];

        for(int i = 0; i<notasArmazenadas.length; i++)
        {
            int indice = 1+i;
            System.out.println("\n\nDIGITE A "+indice+"ª NOTA: ");
            notasArmazenadas[i] = leitor.nextInt();
        }

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

        for(int counter = 0; counter < notasArmazenadas.length; counter++)
        {
            if(notasArmazenadas[counter] <= 9)
            {
                graph0 += "*";
            }
            
            else if(notasArmazenadas[counter] >= 10 && notasArmazenadas[counter] <= 19)
            {
                graph10 +="*";
            }
            
            else if(notasArmazenadas[counter] >= 20 && notasArmazenadas[counter] <= 29)
            {
                graph20 += "*";
            }
            
            else if(notasArmazenadas[counter] >= 30 && notasArmazenadas[counter] <= 39)
            {
                graph30 += "*";
            }
            
            else if(notasArmazenadas[counter] >= 40 && notasArmazenadas[counter] <= 49)
            {
                graph40 += "*";
            }

            else if(notasArmazenadas[counter] >= 50 && notasArmazenadas[counter] <= 59)
            {
                graph50 += "*";
            }

            else if(notasArmazenadas[counter] >= 60 && notasArmazenadas[counter] <= 69)
            {
                graph60 += "*";
            }

            else if(notasArmazenadas[counter] >= 70 && notasArmazenadas[counter] <= 79)
            {
                graph70 += "*";
            }

            else if(notasArmazenadas[counter] >= 80 && notasArmazenadas[counter] <= 89)
            {
                graph80 += "*";
            }

            else if(notasArmazenadas[counter] >= 90 && notasArmazenadas[counter] <= 99)
            {
                graph90 += "*";
            }

            else if(notasArmazenadas[counter] == 100)
            {
                graph100 += "*";
            }

            else if(notasArmazenadas[counter] > 9 && notasArmazenadas[counter] < 20)
            {
                graph10 = graph10 + "*";
            }

            else if(notasArmazenadas[counter] > 9 && notasArmazenadas[counter] < 20)
            {
                graph10 = graph10 + "*";
            }
        }

        System.out.println("\n\n--------------GRÁFICO DE NOTAS--------------\n00-09: "+ graph0 + "\n10-19: " + graph10 + "\n20-29: " + graph20 + "\n30-39: " + graph30 + "\n40-49: " + graph40 + "\n50-59: " + graph50 + "\n60-69: " + graph60 + "\n70-79: " + graph70 + "\n80-89: " + graph80 + "\n90-99: " + graph90 + "\n100: "+ graph100 +"\n--------------------------------------------");            
        leitor.close();
    }
}