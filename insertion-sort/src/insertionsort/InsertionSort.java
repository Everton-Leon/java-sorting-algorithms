/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package insertionsort;


public class InsertionSort {


    public static void main(String[] args) {
        // inicializando variaveis
        int vetor[] = new int[100];
        int aux;
        int j;
        
        // preenchendo vetor
        for(int i = 0; i < vetor.length; i++)
        {
            vetor[i] = (int)(Math.random() * vetor.length);
        }
        
        // aplicando método
        for(int i = 1; i < vetor.length; i++)
        {
            aux = vetor[i];
            j = i - 1;
            while(j >= 0 && vetor[j] > aux)
            {
                vetor[j + 1] = vetor[j];
                j--;
            }
            vetor[j + 1] = aux;
        }
        
        // mostrando vetor
        for(int i = 0; i < vetor.length; i++)
        {
            System.out.println(vetor[i] + " ");
        }
        
    }
}
    

