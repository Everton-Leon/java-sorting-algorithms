/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bubble_sort;


public class Bubble_Sort {

    public static void main(String[] args) {
        // inicializando variaveis
        int vetor[] = new int[100];
        int aux; 
        
        // preenchendo vetor 
        for(int i = 0; i < vetor.length; i++)
        {
            vetor[i] = (int)(Math.random() * vetor.length);
        }
        
        // aplicando método de ordenação 
        for(int i = 0; i < vetor.length; ++i) 
        { 
            for(int j = 0; j < vetor.length - 1; ++j) 
            { 
                if(vetor[j] > vetor[j + 1]) 
                { 
                    aux = vetor[j]; 
                    vetor[j] = vetor[j + 1]; 
                    vetor[j + 1] = aux; 
                } 
            } 
        } 

        
        // mostrando vetor 
        for(int i = 0; i < vetor.length; i++) 
        { 
            System.out.println(vetor[i] + " "); 
        }      
        
    }
    
}
