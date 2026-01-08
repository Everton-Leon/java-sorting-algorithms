/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mergesort;


public class MergeSort {

    
    public static void main(String[] args) {
        // inicializando variaveis
        int[] vetor = new int[10];
        int[] aux = new int[vetor.length];
        
        // preenchendo 1° metade do vetor
        for(int i = 0; i < vetor.length; i++)
        {
            vetor[i] = (int) (Math.random() * vetor.length);
        }
        
        // preenchendo 2° metade do vetor
        for(int i = 0; i < vetor.length; i++)
        {
            aux[i] = (int) (Math.random() * vetor.length);
        }
       
        // aplicando método
        mergeSort(vetor, aux, 0, vetor.length - 1);
        
        // mostrando vetor
        for(int i = 0; i < vetor.length; i++)
        {
            System.out.println(vetor[i] + " ");
        }
    }
    
    public static void mergeSort(int[] vetor, int[] aux, int inicio, int fim){
        if(inicio < fim)
        {
            int meio = (inicio + fim) / 2;
            mergeSort(vetor, aux, inicio, meio);
            mergeSort(vetor, aux, meio + 1, fim);
            intercalar(vetor, aux, inicio, meio, fim);
        }
    }
    public static void intercalar(int[] vetor, int[] aux, int inicio, int meio, int fim){
        for(int k = inicio; k <= fim; k++)
        {
            aux[k] = vetor[k];         
        }
        
        int i = inicio;
        int j = meio + 1;
        
        for(int k = inicio; k <= fim; k++)
        {
            if(i > meio)
            {
                vetor[k] = aux[j++];
            }else if(j > fim)
            {
                vetor[k] = aux[i++];
            }else if(aux[i] < aux[j])
            {
                vetor[k] = aux[i++];
            }else
            {
                vetor[k] = aux[j++];
            }
        }
    }
    
}
