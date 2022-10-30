package com.mycompany.theways;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Historia {
    Estrutura estrutura = new Estrutura();
    public void Introducao() {
        estrutura.cabecalho("INTRODUÇÃO");
        Date data = new Date();
        SimpleDateFormat formatador = new SimpleDateFormat("dd-MM-yyyy");
        String diaHoje = formatador.format(data);
        System.out.println("Era madrugada do dia " + diaHoje
                + " o céu estava escuro pela lua coberta pelas nuvens. Um velho estava sentado em seu laboratório numa poça de café. Ele estava cansado, tentando raciocinar formas de solucionar as questões do espaço tempo. Porém, em um momento de frustração, ele desconta sua raiva em sua máquina do tempo que a anos não funciona, e de repente a máquina atrai tudo na sala inclusive Thomas para seu interior.");
        estrutura.qualquerCoisaParaContinuar();
    }

    public void Final() {
        estrutura.cabecalho("THE END");
        System.out.println("Thomas se encontra em seu laboratório novamente, porém, por conta de todo ocorrido dos últimos tempos, sua memória acabou se fragmentando fazendo-o esquecer de algumas coisas.\nHugo adentra seu local de trabalho feliz por finalmente ter reencontrado seu avô, e emocionado pergunta sobre sua mãe adotiva: Vô, onde está mamãe?\nThomas um pouco confuso responde: Sua mãe não está mais entre nós a um tempo...\nE Hugo rebate: Estou falando a Alex... \nE por fim Thomas devolve a pergunta: Quem é Alex?");
    }
}
