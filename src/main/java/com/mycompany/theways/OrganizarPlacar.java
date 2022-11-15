/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.theways;

/**
 *
 * @author vitor
 */
public class OrganizarPlacar {
    static void bubbleSort(int[] Organizar) {  
        int n = Organizar.length;  
        int a = 0;  
         for(int i=0; i < n; i++){  
                 for(int j=1; j < (n-i); j++){  
                          if(Organizar[j-1] > Organizar[j]){  
                                 //Orfanizando com o bubble short que o prof pediu 
                                 a = Organizar[j-1];  
                                 Organizar[j-1] = Organizar[j];  
                                 Organizar[j] = a;  
                         }  
                          
                 }  
         }  
  
    }  
    public static void main(String[] args) {  //Pode excluir essa parte, so estou usando para testar.
                int Organizar[] ={3,4,35,2,7,353,5}; 
                 
                System.out.println("testando lugares antes de organizar");  
                for(int i=0; i < Organizar.length; i++){  
                        System.out.print(Organizar[i] + " ");  
                }  
                System.out.println();  
                  
                bubbleSort(Organizar);  
                 
                System.out.println("depois de organizar");  
                for(int i=0; i < Organizar.length; i++){  
                        System.out.print(Organizar[i] + " "); 
                }  
   
        }  
}  

