package com.mycompany.theways;

public class Presente {
    Estrutura estrutura = new Estrutura();
    Historia historia = new Historia();
    public void PrimeiroAto(){
        estrutura.cabecalho("PRIMEIRO ATO");
        estrutura.cabecalho("CENÁRIO ATUAL");
        System.out.println("Você está no presente.");
        estrutura.qualquerCoisaParaContinuar();
        System.out.println("Era o segundo café da manhã que eu comia sozinho até perceber que algo estava errado. \nNão tinha notícias de minha tia que me criava, e nem de meu bisavô, o que nesse caso não era de se surpreender.\nApesar da vontade de jogar videogame como fazia todos os dias, decidi ir ao local que minha tia me disse que iria no dia em que desapareceu.");

        estrutura.qualquerCoisaParaContinuar();
            System.out.println("Fui ao laboratório de meu bisavô (o local onde Alex disse que iria quando sumiu) e ao chegar na rua já percebi uma movimentação diferente. As pessoas estavam agitadas, murmurando sobre uma possível explosão.\nEu, como a criança curiosa que sou, fui à procura do motivo da agitação da multidão.\nAo encontrar tal motivo me deparei com a máquina do tempo de meu bisavô em estado instável. \nAntes que eu pudesse analisar a máquina para entender o que pode ter acontecido com minha família, os agentes do FBI invadiram o local.");

            estrutura.qualquerCoisaParaContinuar();
            boolean jogoSegue=false;

            while(!jogoSegue){
                System.out.println("O que devo fazer?");
                System.out.println("[1] Me esconder embaixo da mesa de meu bisavô e ouvir a conversa dos agentes.");
                System.out.println("[2] Brigar com os agentes.");
                System.out.println("[3] Conversar com os agentes sobre minha família.");

                int input = estrutura.leiaInput("->", 3);

                switch(input){
                    case 1:
                    SegundoAto();
                    jogoSegue=true;
                    break;
                    case 2:
                    System.out.println("Tento brigar com os agentes, mas por minha pouca força acabo sendo pego e me levam embora.\nGAME OVER.");
                    break;
                    case 3:
                    System.out.println("Tento conversar com os agentes sobre o desaparecimento de minha família, mas acabam me levando para um intenso interrogatório.\nGAME OVER.");
                    break;
            }
            
        }
    }

    public void SegundoAto() {
        estrutura.cabecalho("SEGUNDO ATO");
        System.out.println("Ao me esconder embaixo da mesa, ouço sobre o ocorrido de dias atrás com meu bisavô e minha tia.\n\n Agente 1:  Nunca vi nada desse tipo... \n\n Agente 2 : Todos os radares de energia dispararam! \n\n Agente 3: Ficaram sabendo? Um dos procurados foi para o futuro e outro para o passado. \n\n");
        System.out.println("Chefe do FBI: Agentes, isso não pode sair deste laboratório. Os agentes do tempo já estão atrás dos responsáveis. Vamos aguardar e ver se achamos alguma evidência do que ocorreu aqui.");
        estrutura.qualquerCoisaParaContinuar();
        System.out.println("Ao perceber que os agentes irão vasculhar o local, preciso rapidamente pensar em como fugir sem ser pego.");
        boolean jogoSegue=false;

        while(!jogoSegue){
            System.out.println("O que devo fazer?");
            System.out.println("[1] Sair correndo e tentar a sorte de não ser pego");
            System.out.println("[2] Tentar roubar a arma do agente.");
            System.out.println("[3] Engatinhar até uma saída secreta que levava até o esgoto.");

            int input = estrutura.leiaInput("->", 3);

            switch(input){
                case 1:
                System.out.println("Infelizmente você não era rápido como pensava, haviam muitos agentes e conseguiram te capturar.\nGAME OVER.");
                break;
                case 2:
                System.out.println("O tiro saiu pela culatra! Hugo não foi sorrateiro o suficiente ao pegar a arma do agente, e em um momento de susto o agente saca a arma e atira nele.\nGAME OVER.");
                break;
                case 3:
                TerceiroAto();
                jogoSegue=true;
                break;
            }
        }
    }

    public void TerceiroAto() {
        estrutura.cabecalho("TERCEIRO ATO");
        System.out.println("Consegui sair com sucesso pelo esgoto, mas durante minha caminhada procurando a saída do prédio penso na frase que um dos agentes falou sobre um de meus familiares ter ido pro passado.\nMinha característica é ser esperto apesar da pouca idade e em uma tentativa de salvar minha família, penso em procurar alguma pista em um livro de história.");
        estrutura.qualquerCoisaParaContinuar();
        System.out.println("Dias se passaram, eu me encontrava deitado no chão rodeado de livros e latinhas de energético.\nE como última tentativa, vejo na prateleira de minha casa 3 últimos livros. ");
        estrutura.qualquerCoisaParaContinuar();
        boolean jogoSegue=false;

        while(!jogoSegue){
            System.out.println("O que devo fazer?");
            System.out.println("[1] Pego o livro sobre a Segunda Guerra Mundial.");
            System.out.println("[2] Pego o livro sobre Idade Média.");
            System.out.println("[3] Pego o livro sobre mulheres que fizeram história.");

            int input = estrutura.leiaInput("->", 3);

            switch(input){
                case 1:
                System.out.println("Apesar de querer encontrar muito minha tia, eu não sabia se ficava aliviado ou desesperado por não conter nada sobre ela no livro. Infelizmente continuo sem pistas e desisto da busca.\nGAME OVER.");
                break;
                case 2:
                jogoSegue=true;
                break; 
                case 3:
                System.out.println("Apesar de minha tia ter o perfil para se encaixar naquele livro com facilidade, não havia nada sobre ela. Continuo sem pistas e cansado acabo desistindo da procura.\nGAME OVER.");
                break;
            }
        }
       
        System.out.println("Apesar da pista encontrada, o final do livro não continha o destino daquela mulher, então decido voltar ao laboratório e procurar pistas sobre minha mãe adotiva.\nAo chegar na rua do laboratório, percebo que a entrada pela qual entrei da primeira vez estava repleta de agentes.\n\nEnquanto pensava no que fazer, percebo alguém em minha frente me puxando pelo pescoço");


        boolean jogoSegue2=false;

        while(!jogoSegue2){
            System.out.println("O que devo fazer?");
            System.out.println("[1] Tento acertar a cara do agente.");
            System.out.println("[2] Tento chutar o saco do agente.");
            System.out.println("[3] Tento afrouxar os dedos do agente que estavam em meu pescoço.");
           
            int input = estrutura.leiaInput("->", 3);

            switch(input){
                case 1:
                System.out.println("Acerto o rosto do agente porém não forte o suficiente para fazer ele me soltar.\nGAME OVER.");
                break;
                case 2:
                System.out.println("Assim que consigo me desvencilhar do agente, corri para o bueiro pelo qual saíra da última vez.\nEnquanto caminho pelos esgotos, me questiono sobre o que poderia encontrar.\nAlgo estaria diferente? Estaria tudo igual?");
                jogoSegue2=true;
                estrutura.qualquerCoisaParaContinuar();
                historia.Final();
                break;
                case 3:
                System.out.println("Me debato e tento soltar os dedos do agente que estavam em meu pescoço, mas ele era muito forte.\nGAME OVER.");
                break;
            }
        }
    }
}

