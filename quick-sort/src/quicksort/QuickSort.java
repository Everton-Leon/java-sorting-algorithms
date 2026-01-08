/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quicksort;


public class QuickSort {


    public static void main(String[] args) {
        // inicializando vetor
        int[] vetor = new int[100];
        
        // preenchendo vetor 
        for(int i = 0; i < vetor.length; i++)
        {
            vetor[i] = (int) (Math.random() * vetor.length);
        }
        
        // aplicando método
        quicksort(vetor, 0, vetor.length - 1);
        
        // mostrando vetor
        for(int i = 0; i < vetor.length; i++)
        {
            System.out.println(vetor[i] + " ");
        }
    }
    
    static void quicksort(int[] vetor, int esquerda, int direita){
        if(esquerda < direita)
        {
            int p = particao(vetor, esquerda, direita);
            quicksort(vetor, esquerda, p);
            quicksort(vetor, p + 1, direita);
        }
    }
    
    static int particao(int[] vetor, int esquerda, int direita){
        int meio = (int) (esquerda + direita) / 2;
        int pivo = vetor[meio];
        int i = esquerda - 1;
        int j = direita + 1;        
        
        while(true)
        {
            do
            {
                i++;
            }while(vetor[i] < pivo);
            do
            {
                j--;
            }while(vetor[j] > pivo);
            if(i >= j)
            {
                return j;
            }
            int aux = vetor[i];
            vetor[i] = vetor[j];
            vetor[j] = aux;
        }
        
    }
    
}
