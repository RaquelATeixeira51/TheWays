

package com.mycompany.theways;

import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Txt {

    public static void main(String[] args) throws IOException {
        
        Path path = Path.of("C:\\teste\\teste.txt");//local que o arquivo vai ser criado
        
        //String Pontos = Files.readString(path);//ler o que ja tem no ranking do arquivo
        if(Files.notExists(path))
            Files.createFile(path);//cria o arquivo
        
        List<String> pontos = Files.readAllLines(path);

        String teste[] = pontos.toArray(new String[10]);
        int org[] = new int[10];
        for(int i = 0; i < 10; i++){
            if(teste[i] == null)
                org[i] = 0;
            else
                org[i] = Integer.parseInt(teste[i]);
        }
       
       int n = 10; 
            int a = 0;  
             for(int i=0; i < n; i++){  
                     for(int j=1; j < (n-i); j++){  
                              if(org[j-1] > org[j]){  
                                     //Organizando com o bubble short que o prof pediu 
                                     a = org[j-1];  
                                     org[j-1] = org[j];  
                                     org[j] = a;  
                             }  
                              
                     }  
             } 
       String fim = ""; 
       for(int i = 0; i < 10; i++){
           fim = org[i] + "\n" + fim;
       }
       
       Files.writeString(path, fim);
       
    }
}
