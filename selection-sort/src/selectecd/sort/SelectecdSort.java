/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package selectecd.sort;


public class SelectecdSort {


    public static void main(String[] args) {
        // inicializando variaveis
        int[] vetor = new int[100];
        int menor;
        int aux;
        
        // preenchendo vetor
        for(int i = 0; i < vetor.length; i++)
        {
            vetor[i] = (int) (Math.random() * vetor.length);
        }
        
        // aplincando método
        for (int i = 0; i < vetor.length; i++)
        {
            menor = i;
            for (int j = i + 1; j < vetor.length; j++)
            {
                if(vetor[j] < vetor[menor])
                {
                    menor = j;
                }
                
            }
            aux = vetor[menor];
            vetor[menor] = vetor[i];
            vetor[i] = aux;
        }
        
        // mostrnado vetor ordenado 
        for(int i = 0; i < vetor.length; i++)
        {
            System.out.println(vetor[i] + " ");
        }
    }
    
}
