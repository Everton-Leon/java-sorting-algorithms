/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package shellsort;


public class ShellSort {


    public static void main(String[] args) {
        // inicializando variaveis 
        int[] vetor = new int[100];
        int h = 1;
        int n = vetor.length;
        
        // preenchendo vetor
        for(int i = 0; i < vetor.length; i++)
        {
            vetor[i] = (int) (Math.random() * vetor.length);
        }
        
        // aplicando método
        while(h < n)
        {
            h = h * 3 + 1;
        }
        h = (int) Math.floor(h / 3);
        
        int c, j;
        while(h > 0)
        {
            for(int i = 0; i < n; i++)
            {
                c = vetor[i];
                j = i;
                while(j >= h && vetor[j - h] > c)
                {
                    vetor[j] = vetor[j - h];
                    j = j - h;
                }
                vetor[j] = c;
            }
            h = h / 2;
        }
        
        // mostrando vetor
        for(int i = 0; i < vetor.length; i++)
        {
            System.out.println(vetor[i] + " ");
        }
        
    }
    
}
