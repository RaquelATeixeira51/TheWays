

package com.mycompany.theways;

import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Txt {

    public static void main(String[] args) throws IOException {
        Path path = Path.of("C:\\teste\\teste.txt");//local que o arquivo vai ser criado
        
        String Pontos = Files.readString(path);//ler o que ja tem no ranking do arquivo
        String Placar = "\n300";//a nova pontuação vai entrar aqui, tb to usando o "300" so para teste
        if(Files.exists(path))
            Files.delete(path);//deleta o arquivo depois de abrir para nao duplicar
        
        if(Files.notExists(path))
            Files.createFile(path);//cria o arquivo

        String texto = Pontos + Placar;
        Files.writeString(path, texto);
        
    }
}
