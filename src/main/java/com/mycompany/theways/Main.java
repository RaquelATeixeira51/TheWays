/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.theways;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author 014653631
 */
public class Main {
    public static void main(String[] args){
        Estrutura.startaGame();
    }

    public static class Estrutura {
        static Scanner entrada = new Scanner(System.in);
        static Jogador jogador;

        public static int leiaInput(String prompt, int numEscolhas) {
            int input;
            do {
                System.out.println(prompt);
                try {
                    input = Integer.parseInt(entrada.next());
                } catch (Exception e) {
                    input = -1;
                    System.out.println("Por favor insira um número válido");
                }
            } while (input < 1 || input > numEscolhas);
            return input;
        }

        public static void separador(int numero) {
            for (int i = 0; i < numero; i++) {
                System.out.println("------------------------------------------------");
                System.out.println("");
            }
        }

        public static void cabecalho(String titulo) {
            separador(1);
            System.out.println(titulo);
            separador(1);
        }

        public static void qualquerCoisaParaContinuar() {
            System.out.println("\nDigite qualquer coisa para continuar...");
            entrada.next();
        }

        public static void jogar() {
            String nome;
            boolean setouNome = false;
            // Pegando o nome do jogador
            do {
                System.out.println("Qual o seu nome, ousado jogador?");
                nome = entrada.next();
                System.out.println("Seu nome é: " + nome + "\nEstá correto?");
                System.out.println("(1) Sim!");
                System.out.println("(2) Não, esse não é meu nome...");
                int input = leiaInput("->", 2);
                if (input == 1) {
                    setouNome = true;
                }
            } while (!setouNome);
            // Cria novo objeto jogador com o nome
            jogador = new Jogador(nome);
            cabecalho("ESSE É SEU PERSONAGEM");
            informacoesPersonagem();

            Historia.Introducao();

            if (jogador.nome.equals("Thomas")) {
                Futuro.PrimeiroAto();
            } else if (jogador.nome.equals("Alex")) {
                Passado.PrimeiroAto();
            } else {
                Presente.PrimeiroAto();
            }

        }

        public static void instrucoes() {
            cabecalho("INSTRUÇÕES");
            System.out.println("Dada as opções digite um número para seguir certo caminho");
            qualquerCoisaParaContinuar();
        }

        public static void creditos() {
            cabecalho("CRÉDITOS");
            System.out.println(
                    "Esse jogo foi feito pelo grupo 1: Raquel, Luzinete, Vinicius, Natalia, Renan e Rayane, da 1NC de analise e desenvolvimento de sistemas no Senac");
            qualquerCoisaParaContinuar();
        }

        public static void informacoesPersonagem() {
            cabecalho("INFORMAÇÕES DO PERSONAGEM");
            System.out.println("Nome do personagem: " + jogador.nome);
            System.out.println("O hp do seu personagem " + jogador.hp);
            System.out.println("O xp do seu personagem " + jogador.xp);
            if (jogador.numAtaAtibutos > 0 || jogador.numDefAtributos > 0 || jogador.numIntAtributos > 0
                    || jogador.numPespAtributos > 0) {
                System.out.println("Pontuação ofensiva " + jogador.numAtaAtibutos);
                System.out.println("Pontuação defensiva " + jogador.numDefAtributos);
                System.out.println("Pontuação de inteligencia " + jogador.numIntAtributos);
                System.out.println("Pontuação de perspicacia " + jogador.numPespAtributos);
            }
            qualquerCoisaParaContinuar();
        }

        public static void menuPrincipal() {
            int input;
            boolean jogando = false;
            boolean sair = false;
            do {
                cabecalho("MENU");
                System.out.println("Escolha uma ação");
                separador(1);
                System.out.println("(1) Instruções");
                System.out.println("(2) Jogar");
                System.out.println("(3) Créditos");
                System.out.println("(4) Sair");
                input = leiaInput("->", 4);
                switch (input) {
                case 1:
                    instrucoes();
                    break;
                case 2:
                    jogar();
                    break;
                case 3:
                    creditos();
                    break;
                case 4:
                    System.out.println("Você saiu do jogo");
                    break;
                }
                if (input == 2) {
                    jogando = true;
                } else if (input == 4) {
                    sair = true;
                }
            } while (!jogando && !sair);

        }

        public static void startaGame() {
            // Titulo
            separador(1);
            System.out.println("THE WAYS");
            separador(1);
            System.out.println("SE PREPARE PARA ENTRAR EM UMA JORNADA DELIRANTE");
            separador(1);
            qualquerCoisaParaContinuar();

            // chama menu principal
            menuPrincipal();

        }

    }
     
     public static class Jogador{
        public static String nome;
        //variáveis para armazenar atributos de defesa e ataque
        public int numAtaAtibutos, numDefAtributos, numIntAtributos, numPespAtributos;
        public static int hp = 150;
        public static int xp = 100;

        
        //Array pra armazenar características do personagem
        public String[] Thomas = {"Thomas ", "Experiente ", "Inteligente ", "Teimoso ", "Bom de lábia "};
        public String[] Alex = {"Alex ", "Destemida ", "Inteligente ", "Corajosa ", "Boa de briga "};
        public String[] Hugo = {"Hugo ", "Agitado ", "Perspicaz ", "Curioso ", "Boa de se esconder "};
        
        //construtor do jogador
        public Jogador(String nome){
            //Setando numero de atributos para 0
            this.numAtaAtibutos = 0;
            this.numDefAtributos = 0;
            this.numIntAtributos = 0;
            this.numIntAtributos = 0;
            //Será sobescrevido quando o jogador criar seu personagem
            escolhePersonagem();
        }
        
        
        //Ao jogador escolher o personagem certos atributos serão configurados
        public void escolhePersonagem(){
            Estrutura.cabecalho("Escolha um dos personagens:");
            System.out.println("(1)" + Thomas[0] + Thomas[1] + Thomas[2] + Thomas[3] + Thomas[4]);
            System.out.println("(2)" + Alex[0] + Alex[1] + Alex[2] + Alex[3] + Alex[4]);
            System.out.println("(3)" + Hugo[0] + Hugo[1] + Hugo[2] + Hugo[3] + Hugo[4]);
            //Pega a escolha do jogador
            int input = Estrutura.leiaInput("->", 3);
            //Atribuindo
            if(input == 1){
                System.out.println("Você escolheu: " + Thomas[0] + "!");
                nome = "Thomas";
                numDefAtributos++;
                numIntAtributos++;
                numIntAtributos++;
                numIntAtributos++;
            } else if(input == 2){
                System.out.println("Você escolheu: " + Alex[0] + "!");
                nome = "Alex";
                numAtaAtibutos++;
                numIntAtributos++;
                numIntAtributos++;
                numPespAtributos++;
            } else {
                System.out.println("Você escolheu: " + Hugo[0] + "!");
                nome = "Hugo";
                numDefAtributos++;
                numIntAtributos++;
                numPespAtributos++;
                numPespAtributos++;
            }
            Estrutura.qualquerCoisaParaContinuar();
        }
    }

    public static class Historia {
        public static void Introducao() {
            Estrutura.cabecalho("INTRODUÇÃO");
            Date data = new Date();
            SimpleDateFormat formatador = new SimpleDateFormat("dd-MM-yyyy");
            String diaHoje = formatador.format(data);
            System.out.println("Era madrugada do dia " + diaHoje
                    + " o céu estava escuro pela lua coberta pelas nuvens. Um velho estava sentado em seu laboratório numa poça de café. Ele estava cansado, tentando raciocinar formas de solucionar as questões do espaço tempo. Porém, em um momento de frustração, ele desconta sua raiva em sua máquina do tempo que a anos não funciona, e de repente a máquina atrai tudo na sala inclusive Thomas para seu interior.");
            Estrutura.qualquerCoisaParaContinuar();
        }

        public static void Final() {
            Estrutura.cabecalho("THE END");
            System.out.println("Thomas se encontra em seu laboratório novamente, porém, por conta de todo ocorrido dos últimos tempos, sua memória acabou se fragmentando fazendo-o esquecer de algumas coisas.\nHugo adentra seu local de trabalho feliz por finalmente ter reencontrado seu avô, e emocionado pergunta sobre sua mãe adotiva: Vô, onde está mamãe?\nThomas um pouco confuso responde: Sua mãe não está mais entre nós a um tempo...\nE Hugo rebate: Estou falando a Alex... \nE por fim Thomas devolve a pergunta: Quem é Alex?");
        }
    }

    public static class Presente {
        public static void PrimeiroAto(){
            Estrutura.cabecalho("PRIMEIRO ATO");
            Estrutura.cabecalho("CENÁRIO ATUAL");
            System.out.println("Você está no presente.");
            Estrutura.qualquerCoisaParaContinuar();
            System.out.println("Era o segundo café da manhã que eu comia sozinho até perceber que algo estava errado. \nNão tinha notícias de minha tia que me criava, e nem de meu bisavô, o que nesse caso não era de se surpreender.\nApesar da vontade de jogar videogame como fazia todos os dias, decidi ir ao local que minha tia me disse que iria no dia em que desapareceu.");

            Estrutura.qualquerCoisaParaContinuar();
                System.out.println("Fui ao laboratório de meu bisavô (o local onde Alex disse que iria quando sumiu) e ao chegar na rua já percebi uma movimentação diferente. As pessoas estavam agitadas, murmurando sobre uma possível explosão.\nEu, como a criança curiosa que sou, fui à procura do motivo da agitação da multidão.\nAo encontrar tal motivo me deparei com a máquina do tempo de meu bisavô em estado instável. \nAntes que eu pudesse analisar a máquina para entender o que pode ter acontecido com minha família, os agentes do FBI invadiram o local.");

            Estrutura.qualquerCoisaParaContinuar();
                boolean jogoSegue=false;

                while(!jogoSegue){
                    System.out.println("O que devo fazer?");
                    System.out.println("[1] Me esconder embaixo da mesa de meu bisavô e ouvir a conversa dos agentes.");
                    System.out.println("[2] Brigar com os agentes.");
                    System.out.println("[3] Conversar com os agentes sobre minha família.");

                    int input = Estrutura.leiaInput("->", 3);

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

        public static void SegundoAto() {
            Estrutura.cabecalho("SEGUNDO ATO");
            System.out.println("Ao me esconder embaixo da mesa, ouço sobre o ocorrido de dias atrás com meu bisavô e minha tia.\n\n Agente 1:  Nunca vi nada desse tipo... \n\n Agente 2 : Todos os radares de energia dispararam! \n\n Agente 3: Ficaram sabendo? Um dos procurados foi para o futuro e outro para o passado. \n\n");
            System.out.println("Chefe do FBI: Agentes, isso não pode sair deste laboratório. Os agentes do tempo já estão atrás dos responsáveis. Vamos aguardar e ver se achamos alguma evidência do que ocorreu aqui.");
            Estrutura.qualquerCoisaParaContinuar();
            System.out.println("Ao perceber que os agentes irão vasculhar o local, preciso rapidamente pensar em como fugir sem ser pego.");
            boolean jogoSegue=false;

            while(!jogoSegue){
                System.out.println("O que devo fazer?");
                System.out.println("[1] Sair correndo e tentar a sorte de não ser pego");
                System.out.println("[2] Tentar roubar a arma do agente.");
                System.out.println("[3] Engatinhar até uma saída secreta que levava até o esgoto.");

                int input = Estrutura.leiaInput("->", 3);

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

        public static void TerceiroAto() {
            Estrutura.cabecalho("TERCEIRO ATO");
            System.out.println("Consegui sair com sucesso pelo esgoto, mas durante minha caminhada procurando a saída do prédio penso na frase que um dos agentes falou sobre um de meus familiares ter ido pro passado.\nMinha característica é ser esperto apesar da pouca idade e em uma tentativa de salvar minha família, penso em procurar alguma pista em um livro de história.");
            Estrutura.qualquerCoisaParaContinuar();
            System.out.println("Dias se passaram, eu me encontrava deitado no chão rodeado de livros e latinhas de energético.\nE como última tentativa, vejo na prateleira de minha casa 3 últimos livros. ");
            Estrutura.qualquerCoisaParaContinuar();
            boolean jogoSegue=false;

            while(!jogoSegue){
                System.out.println("O que devo fazer?");
                System.out.println("[1] Pego o livro sobre a Segunda Guerra Mundial.");
                System.out.println("[2] Pego o livro sobre Idade Média.");
                System.out.println("[3] Pego o livro sobre mulheres que fizeram história.");

                int input = Estrutura.leiaInput("->", 3);

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
               
                int input = Estrutura.leiaInput("->", 3);

                switch(input){
                    case 1:
                    System.out.println("Acerto o rosto do agente porém não forte o suficiente para fazer ele me soltar.\nGAME OVER.");
                    break;
                    case 2:
                    System.out.println("Assim que consigo me desvencilhar do agente, corri para o bueiro pelo qual saíra da última vez.\nEnquanto caminho pelos esgotos, me questiono sobre o que poderia encontrar.\nAlgo estaria diferente? Estaria tudo igual?");
                    jogoSegue2=true;
                    Estrutura.qualquerCoisaParaContinuar();
                    Historia.Final();
                    break;
                    case 3:
                    System.out.println("Me debato e tento soltar os dedos do agente que estavam em meu pescoço, mas ele era muito forte.\nGAME OVER.");
                    break;
                }
            }
        }
    }

    public static class Passado {
        public static void PrimeiroAto() {
            Estrutura.cabecalho("PRIMEIRO ATO");
            Estrutura.cabecalho("CENÁRIO ATUAL");
                System.out.println("você está no passado");
                System.out.println("Sempre fui uma mulher moderna e descolada, que nunca deixei que pré me\n julgassem pelos meus cabelos ruivos e meu corpo tatuado, Sempre busquei ter o destaque\n em tudo que faço não é atoa que me tornei uma das melhores biotécnicas do mundo tão\njovem, Mesmo tendo que cuidar do meu sobrinho cujo a mãe\nfaleceráAntes da morte de minha irmã eu era muito distanciada da minha família pensando\napenas em mim mesma, o meu futuro sempre foi uma prioridade para mim me levando\nassim a uma vida de solidão, após a chegada do Hugo TUDO MUDOU!! e percebi que\nhavia abandonado o meu bem mais precioso que era minha família.");
            Estrutura.qualquerCoisaParaContinuar();
                System.out.println("Determinada a mudar essa situação decidi ir ao encontro do meu avô, então segui\ndiretamente para o seu refúgio (Laboratório) onde me deparo com tudo revirado como se\n houvesse passado um furacão,percebo a ausência do meu avô e um alarme ensurdecedor\nvindo de sua máquina e me aproximo e não pode ser AHHHH");

            Estrutura.qualquerCoisaParaContinuar();
                System.out.println("De repente desperto em uma praça feia e sombria com algumas pessoas estranhas\n e “fora de moda” a minha volta me observando e alguns comentários me julgando como\n praticante de bruxaria, levanto assustada e tentando entender o que houvera acontecido;");

            Estrutura.qualquerCoisaParaContinuar();
                boolean jogoSegue=false;

                while(!jogoSegue){
                    System.out.println("O que devo fazer?");
                    System.out.println("[1] Questionar (onde estou? o que está acontecendo??.");
                    System.out.println("[2] Sair correndo.");
                    System.out.println("[3] Pegar o celular.");

                    int input = Estrutura.leiaInput("->", 3);

                    switch(input){
                        case 1:
                        System.out.println("Estamos em Sallen em 1619, e você apenas surgiu aqui do nada como se fosse bruxaria!");
                        SegundoAto();
                        jogoSegue=true;
                        break;
                        case 2:
                        System.out.println("Sua ação gerou revolta na população que começou a lhe apedrejar causando sua morte. \nGAME OVER.");
                        break;
                        case 3:
                        System.out.println("Sua ação assustou a população que com seus “gadanhos” a mutilaram.\nGAME OVER.");
                        break;
                }
                
            }
        }

        public static void SegundoAto() {
            Estrutura.cabecalho("SEGUNDO ATO");
            System.out.println("Suas mãos e pés foram amarradas e vc foi arrastada ate a cadeia.");
            Estrutura.qualquerCoisaParaContinuar();
            System.out.println("Você foi presa se encontra numa cela:)observa que contém .");
            System.out.println("● uma cama\n● uma pia\n● um espelho\n● e um sanitário");
            System.out.println("Você precisa agir rapido para fugir antes que a levem para ser queimada em praça publica.");
            boolean jogoSegue=false;

            while(!jogoSegue){
                System.out.println("O que devo fazer?");
                System.out.println("[1] Gritar");
                System.out.println("[2] Quebrar o espelho.");
                System.out.println("[3] Esconder-se em baixo da cama.");

                int input = Estrutura.leiaInput("->", 3);

                switch(input){
                    case 1:
                    System.out.println("(vem o guarda sem entender as gírias e algumas palavras gritado pela moça, acredita que está sendo amaldiçoado e para impedi-la corta sua garganta com a espada.\nGAME OVER.");
                    break;
                    case 2:
                    System.out.println("vc recolhe um grande pedaço de vidro, o guarda surge com o barulho ao entrar na cela para verificar vc o golpeia com o vidro e foge.");
                    TerceiroAto();
                    jogoSegue=true;
                    break;
                    case 3:
                    System.out.println("(após algum tempo um guarda percebe sua ausência e desesperado ele vai averiguar a cela,depois de minutos se assustando com a aparição repentina seguida de uma tentativa de fuga o guarda a golpeia no rosto perfurando seu olho com uma espada\nGAME OVER!");
                   
                    break;
                }
            }
        }

        public static void TerceiroAto() {
            Estrutura.cabecalho("TERCEIRO ATO");
            System.out.println("Ao sair da cadeia e ir o mais distante possível encontra uma pacata loja de roupas e tem a ideia de se afeiçoar as pessoas e esconder suas tatuagens");
            Estrutura.qualquerCoisaParaContinuar();
            System.out.println("Ao entrar na loja se surpreende com a variedade de roupas e precisa decidir qual irá escolher:. ");
            Estrutura.qualquerCoisaParaContinuar();
            boolean jogoSegue=false;

            while(!jogoSegue){
                System.out.println("O que devo fazer?");
                System.out.println("[1] Vestido de mangas curtas e cheias,bota de cano baixo e chapéu alto ou largo com abas e Rufo.");
                System.out.println("[2] Uma saia amassada com mangas longas e penduradas e gola de renda, uma coifa decorada com pena e aba virada.");
                System.out.println("[3] Uma calça larga,uma camisa com renda e colarinho com farrapos,casaco com gola alta e um chapéu de feltro largo, e botas de punho altos..");

                int input = Estrutura.leiaInput("->", 3);

                switch(input){
                    case 1:
                    System.out.println("Você deixou seus braços a mostra, iram ver suas tatuagens\nTENTE NOVAMENTE.");
                    break;
                    case 2:
                    System.out.println("Você escolheu vestimentas que não correspondem com o seu gênero e idade, coifa só era utilizado por crianças e idosos,você seria descoberta\nTENTE NOVAMENTE");
                    break; 
                    case 3:
                    System.out.println("Ótima escolha!! Você se vestiu a caráter,devido aos maus olhos da sociedade,você conseguiu cobrir suas tatuagens e se afeiçoar as pessoas da época");
                    jogoSegue=true;
                    break;
                }
            }
           
            System.out.println("Durante a camuflagem encontra o celular que havia com você escondido, sai andando distraída pela multidão, quando esbarra numa mulher que andava apressadamente,que acaba a identificando:");
            Estrutura.qualquerCoisaParaContinuar();
             
            System.out.println("Você é a mulher que diz vir do futuro?? você precisa vir comigo, eu preciso da sua ajuda!!");
            
            boolean jogoSegue2=false;

            while(!jogoSegue2){
                System.out.println("Devo ajuda-lá?");
                System.out.println("[1] Sim .");
                System.out.println("[2] Não.");
              
                int input = Estrutura.leiaInput("->", 3);
            switch(input){
                    case 1:
                    System.out.println("me acompanhe, após um periodo de caminhada elas chegam numa humilde cabana onde passam a conversar percebendo que já era tarde da noite desconhecida enfatiza “ohhh meu Deus, precisamos dormir que amanhã você entenderá tudo!!)");
                    jogoSegue=true;
                    break;
                    case 2:
                    System.out.println("(Continua vagando sem rumo, ao anoitecer se depara com um grupo de homens que na tentativa de rouba-la a ferem e vc morre agonizando perdendo sangue (Continua vagando sem rumo, ao anoitecer se depara com um grupo de homens\n que na tentativa de rouba-la a ferem e vc morre agonizando perdendo sangue \ngame over");
                    break;
                }
            }
                   System.out.println("Se sentindo segura pela primeira vez, com o cansaço cai em sono profundo");
                   Estrutura.qualquerCoisaParaContinuar();
                   System.out.println("De repente, escuta gritos e sente um cheiro forte de\n queimado, ainda sonolenta percebe que a casa está pegando fogo e que diversas pessoas\n estavam a gritar “queimem a bruxa!! queimem a bruxa!!” ,desesperada ela tem que tomar\n uma decisão rápida");


            boolean jogoSegue3=false;

            while(!jogoSegue3){
                System.out.println("O que devo fazer?");
                System.out.println("[1] Acorde a desconhecida e fuja pela janela.");
                System.out.println("[2] Acorde a desconhecida bloqueie as saídas e entre no porão.");
                System.out.println("[3] Acorde a desconhecida e tente confrontar os revoltados.");
               
                int input = Estrutura.leiaInput("->", 3);

                switch(input){
                    case 1:
                    System.out.println("(saiu pela janela e foi alvejada por flechas flamejantes\nGAME OVER.");
                    break;
                    case 2:
                    System.out.println("vc passa um tempo no porão a cabana é consumida pelo fogo e desmorona sobre\n vc, ocasionando seu soterramento\nGAME OVER");
                    break;
                    case 3:
                    System.out.println("você se arma com um castiçal e sai para o confronto, porém são muitos revoltados\n que a capturam-na e a queimam.\nGAME OVER.");
                    Estrutura.qualquerCoisaParaContinuar();
                    Historia.Final();
                    break;
                   
        }
    }

        }
    }
        }
    

    public static class Futuro {

        // Escolhas dos usuários fase 01
        public static void decisao1_1() {

            System.out.println("--------------------------");
            System.out.println("(1) - Aceitar a ajuda");
            System.out.println("(2) - Recusar ajuda");
            System.out.println("--------------------------");
            System.out.print("Aceita a ajuda da criança? ");
            Scanner entrada = new Scanner(System.in);
            int ajuda = Estrutura.leiaInput("->", 2);

            switch (ajuda) {
            case 1:
                System.out.println("Ok, aceito sua ajuda.");
                System.out.println("\nAceito a ajuda da criança, o que? Espere… não é uma  criança!");
                System.out.println(
                        "\nA criança mostra sua verdadeira forma se apresentando como um agente do FBI do futuro camuflado, no qual o objetivo é eliminar os seres humanos que sejam uma possível ameaça ao espaço tempo ...");
                System.out.println("GAME OVER! Tente outra opção...");
                System.out.println("");
                Estrutura.qualquerCoisaParaContinuar();
                System.out.println("");
                decisao1_1();
                break;

            case 2:
                System.out.println("Agradeço sua ajuda, mas devo continuar sozinho");
                System.out.println("----------------------------------------------");
                System.out.println(
                        "\nDeixo a criança para trás e sigo meu caminho, não existem motivos para confiar em um totalmente estranho, mesmo que seja uma criança.");
                Estrutura.qualquerCoisaParaContinuar();
                break;
            }

        }

        public static void decisao1_2() {
            System.out.println(
                    "\nA criança mostra que era apenas um holograma, assim vejo aquele pequeno garoto se transformar em sua real forma, na qual surge um homem alto com uma arma em sua cintura vestindo um terno preto com uma logo em seu peito.");

            Scanner entrada = new Scanner(System.in);
            System.out.println("--------- O que farei?--------- ");
            System.out.println("1 - Corro do agente mesmo sabendo das minhas condições físicas?");
            System.out.println("2 - Decido enfrentar o agente?");
            System.out.println("3 - Devo me camuflar na multidão?");
            System.out.println("-------------------------------");
            System.out.println("Qual é a sua escolha? ");
            int escolha1 = Estrutura.leiaInput("->", 3);

            switch (escolha1) {
            case 1:
                System.out.println(
                        "\nEm alerta, corro do agente. Entro em meio a multidão com toda a velocidade que consigo. Isso infelizmente acaba não sendo o suficiente para escapar e o agente do tempo consegue me alcançar.");
                System.out.println("GAME OVER! Tente outra opção...");
                System.out.println("");
                Estrutura.qualquerCoisaParaContinuar();
                System.out.println("");
                decisao1_2();
                break;

            case 2:
                System.out.println(
                        "\nPor um momento de coragem decido que está na hora de enfrentar o adversário. Observo seus movimentos com atenção, a fim de descobrir os motivos da perseguição, então o questiono:");

                System.out.println(
                        "\n - O que eu fiz para você? Não me recordo de conhecê-lo. O agente expressa uma risada sarcástica em seu rosto como se esperasse por isso");

                System.out.println(
                        "\n- Você causou diversos problemas com a sua invenção, destruiu até mesmo sua família. Você é literalmente uma bomba relógio que deve ser desativada o quanto antes. Por isso estou aqui, para acabar com os problemas da sociedade.");

                System.out.println(
                        "\nMais veloz que o tempo, sinto um tiro atingido meu peito. De repente tudo fica escuro...");
                System.out.println("GAME OVER! Tente outra opção...");
                System.out.println("");
                Estrutura.qualquerCoisaParaContinuar();
                System.out.println("");
                decisao1_2();
                break;

            case 3:
                System.out.println(
                        "\nConsigo despistar o agente e após conseguir uma certa distância de nosso último local de encontro começo a procurar onde estaria o meu laboratório...");
                break;

            }

        }

        // Escolhas dos usuários fase 02
        public static void decisao2_1() {
            System.out.println("------- o que posso fazer?------- ");
            System.out.println("1 - Comida");
            System.out.println("2 - Roupas");
            System.out.println("3 - Celular");
            System.out.println("---------------------------");
            System.out.println("Qual é a sua escolha? ");

            int opcao = Estrutura.leiaInput("->", 3);
            switch (opcao) {
            case 1:
                System.out.println("Vou economizar, não sei quando irei precisar de mais.");
                System.out.println("");
                Estrutura.qualquerCoisaParaContinuar();
                System.out.println("");
                decisao2_1();

                break;

            case 2:
                System.out.println("Huum item interessante. Eventualmente pode ser útil.");
                System.out.println("");
                Estrutura.qualquerCoisaParaContinuar();
                System.out.println("");
                decisao2_1();
                break;

            case 3:
                System.out.println(
                        "Ligo o celular e  abro o GPS, procuro a distância entre meu lugar atual e onde seria a rua"
                                + "\nde meu laboratório, sei que ele ainda existe. Vejo que está na mesma região, porém, visto como um lugar"
                                + "\ninterditado e controlado pelo FBI. Só me resta uma opção: conheço todas as rotas de fuga do prédio, chegou"
                                + "\na hora de usar esses conhecimentos.");
                Estrutura.qualquerCoisaParaContinuar();
                break;

            }
        }

        public static void decisao2_2() {
            System.out.println("------- Thomas anda por 40 minutos até avistar seu laboratório. "
                    + "\nDecide que deve arrumar uma maneira de entrar no local, como ele deve fazer isso?------- ");
            System.out.println("1 -  Tento entrar pela porta da frente disfarçado com as roupas adquiridas na loja.");
            System.out.println("2 - Subo as escadas de incêndio do local. ");
            System.out.println("3 -  Entrada do esgoto.");
            System.out.println("---------------------------");
            System.out.println("Qual é a sua escolha? ");
            int opcao = Estrutura.leiaInput("->", 3);
            switch (opcao) {
            case 1:
                System.out.println("Thomas é fuzilado por todos os agentes do local, pois, na entrada havia um"
                        + "\nscanner biométrico que revelou sua identidade.");
                System.out.println("");
                System.out.println("GAME OVER! Tente outra opção...");
                System.out.println("");
                decisao2_2();

                break;

            case 2:
                System.out.println(
                        "Thomas já andou muito e não se alimentou, perdendo as forças acaba caindo de uma certa"
                                + "\naltura da escada e morrendo espatifado no chão.");
                System.out.println("");
                System.out.println("GAME OVER! Tente outra opção...");
                System.out.println("");
                decisao2_2();
                break;

            case 3:
                System.out.println(
                        "Sigo pelos esgotos do laboratório. Os caminhos que seguiam mais pareciam um labirinto e somente"
                                + "\neu conhecia o trajeto. O esgoto termina em uma porta que serve como acesso aos corredores, porém, não tenho"
                                + " a chave…");

                Estrutura.qualquerCoisaParaContinuar();

                System.out.println(
                        "Procuro a chave rebatendo minhas mãos em meu corpo, percebo que elas estão em minhas roupas antigas"
                                + "\nque havia trocado. Ao substituir as roupas novas acabei deixando as antigas na loja, o que me irrita, como um"
                                + "\ncientista brilhante pode cometer tamanha burrice, grr!!!!");
                Estrutura.qualquerCoisaParaContinuar();
                break;

            }

        }

        public static void decisao2_3() {
            System.out.println("------- O que devo fazer?------- ");
            System.out.println("1 - Tentar arrombar a porta");
            System.out.println("2 - Volto para loja e pego a chave");
            System.out.println("---------------------------");

            int opcao = Estrutura.leiaInput("->", 2);
            switch (opcao) {
            case 1:
                System.out.println("Fiz muito barulho, essa não… escuto os agentes descendo. Vou me esconder.\n"
                        + "\nOs agentes abrem a porta e rodam o esgoto me procurando. Como nunca tiveram naquele lugar, ao se separarem "
                        + "\nconsigo atravessar a porta e corro até meu laboratório.");
                System.out.println("");
                Estrutura.qualquerCoisaParaContinuar();
                System.out.println("");

                break;

            case 2:
                System.out.println("No caminho de volta Thomas é pego pelos agentes.");
                System.out.println("");
                System.out.println("GAME OVER! Tente outra opção...");
                System.out.println("");
                decisao2_3();
                break;

            }

        }

        // Escolhas dos usuários fase 03
        public static void decisao3_1() {
            Scanner entrada = new Scanner(System.in);
            System.out.println("Fecho a porta do laboratório e empurro um armário com toda a força que o me resta, enquanto tento descobrir como voltar para o tempo e arrumar tudo.");

            System.out.println("O que ele deve fazer?");
            System.out.println("1 - Combate direto");
            System.out.println("2 - Se esconder dos agentes");
            System.out.println("3 - Chutar a máquina de novo");
            int escolha = Estrutura.leiaInput("->", 3);

            switch (escolha) {
            case 1:
                break;

            case 2:
                System.out.println("Tento me esconder atrás de algo o mais rápido possível. ");
                System.out.println(
                        "Mesmo com a minha velocidade, em menos de um minuto os agentes arrombaram e entraram no laboratório e conseguiram me achar.");
                System.out.println("- Droga, vocês não podem fazer isso comigo! AAAAAAAAAAH");
                System.out.println(
                        "Os agentes jogam Thomas no buraco de minhoca e o vêem ser destroçado em mil pedaços se perdendo pelo tempo.");
                System.out.println("");
                System.out.println("GAME OVER! Tente outra opção...");
                System.out.println("");
                Estrutura.qualquerCoisaParaContinuar();
                System.out.println("");
                decisao3_1();
                break;

            case 3:
                System.out.println(
                        "Mas que porcaria eu não quero morrer, AAAAAAH que se dane essa porcaria, BUUUUUM!\nThomas ao chutar a máquina a sobrecarrega e não apenas se mata como leva o quarteirão inteiro a ser sugado pelo buraco de minhoca.");
                System.out.println("");
                System.out.println("GAME OVER! Tente outra opção...");
                System.out.println("");
                Estrutura.qualquerCoisaParaContinuar();
                System.out.println("");
                decisao3_1();
                break;

            }

        }

        public static void CombateFinal() {
            System.out.println(
                    "Deparo com três agentes do tempo e mais para frente noto uma arma que se assemelha a um blaster. Impossível não lembrar das referências pop dos anos 80. Corro em direção ao armamento com a intenção de atingir meus adversários. Consigo pegar o blaster a tempo e sinto um dos agentes referindo um ataque em minhas costas. ");

            System.out.println("O que devo fazer?");
            System.out.println(
                    "1 - Revido dando um soco no agente e saio correndo.\n 2 - Tento dar um tiro de blaster.\n 3 -  Tento enfrentá los todos de uma vez");
            int opcao = Estrutura.leiaInput("->", 3);

            int dano = 0;
            int dano2 = 0;

            // Dano 01
            if (opcao == 1 || opcao == 01) {
                System.out.println("sofro muito dano e acabo morrendo.");

                dano = Jogador.hp - 150;
                System.out.println("TOTAL: " + dano + " HP");
                System.out.println("");
                System.out.println("GAME OVER! Tente outra opção...");
                System.out.println("");CombateFinal();
                

            }

            else if (opcao == 02 || opcao == 2) {
                System.out.println("Consequência:  porém, ele está muito perto e me atingi também.");
                dano = Jogador.hp - 50;
                
                System.out.println("TOTAL: " + dano + " HP");
            }

            else if (opcao == 3 || opcao == 03) {
                System.out.println(
                        "Consequência: A morte total de Thomas. Ele não tem condicionamento físico o suficiente.");
                dano = Jogador.hp - 150;
                System.out.println("TOTAL: " + dano + " HP");
                System.out.println("");
                System.out.println("GAME OVER! Tente outra opção...");
                System.out.println("");
                CombateFinal();

            }


        }

        public static void PrimeiroAto() {
            Estrutura.cabecalho("PRIMEIRO ATO");
            Estrutura.cabecalho("CENÁRIO ATUAL");
            System.out.println("você está no futuro");

            // Prólogo
            System.out.println(
                    "\nDurante a minha longa vida, trabalhei como cientista renomado para diversas intuições de ciência do mundo. Isso me propiciou alguns prêmios e reconhecimentos de contribuições para física moderna. Também me casei e tive duas netas, mas uma delas infelizmente veio a falecer aos 21 anos. Tudo isso contribuiu para a solidão que eu vivo agora, já que só me resta descobrir uma maneira de viajar no tempo e achar formas de solucionar problemas da sociedade.");

            System.out.println(
                    "\nNo meu laboratório encaro a máquina que criei. Grande, cinza e inútil, esses são os melhores adjetivos que posso dar para uma máquina de viagem no tempo que não funciona.\nJá testei todas as possibilidades possíveis e até Einstein não teve tantas ideias para viagem no tempo. Gostaria que ao menos ligasse.");

            System.out.println(
                    "\nCansado, realizei uma última  tentativa de verificar as engrenagens  da máquina. Um surto de frustração e raiva passou pela minha mente, NADA, ABSOLUTAMENTE NADA! Até mesmo a lua se escondeu nas nuvens após esse fracasso. Com toda a força que eu tive chutei a máquina e para minha surpresa ela ligou...");

            Estrutura.qualquerCoisaParaContinuar();

            // Chegando no futuro
            System.out.println("\nEm alguns segundos já não estava no laboratório...");

            System.out.println(
                    "\nEntão eu finalmente entendi, havia conseguido o que estava buscando. Como meus colegas cientistas irão reagir? Será que ficariam felizes com a nova descoberta? Em um primeiro momento provavelmente me chamariam de louco. Não muito fora do normal, estava acostumado com esse tipo de “apelido” nada amigável.  O que importava é que havia conquistado a maior façanha de todos os tempos.");

            System.out.println(
                    "\nDeterminado a conhecer o lugar, caminho pelas ruas da cidade. Luzes automáticas, carros voadores, prédios futuristas, robôs, telões e crianças com roupas peculiares em todas as partes. Aquele sem dúvidas é o futuro.");

            System.out.println("Liberto dos meus pensamentos quando uma voz de uma criança me chama:");

            System.out.println(
                    "\n - Boa tarde, senhor! Gostaria de ajuda para conhecer a cidade? - A criança que me chamava tinha voz doce e sorriso contagiante, lembrava muito o meu bisneto.\n - Bem, acredito que não precise de ajuda. - É claro que eu necessitava  de ajuda, não conhecia nada do lugar que eu estava,  mas pedir ajuda de uma criança não parecia ser a escolha mais viável.\nA criança me olhou de cima a baixo, como se soubesse que eu era um velho louco perdido na cidade grande. Quando terminou de examinar meu rosto, retrucou:\n -Eu tenho certeza que você precisa de ajuda. Olha para suas roupas estranhas! Fora  que desde de que você chegou está aí parado olhando para tudo. Posso te levar pela cidade se deseja, ainda te mostro um lugar para você comprar roupas novas.");

            // Decisão do usuário 01
            decisao1_1();

            // Loja de itens

            System.out.println(
                    "Caminho pelas ruas da cidade até encontrar algo que fosse interessante e me deparo com uma loja de itens. Entro em busca de itens que possam ajudar na minha trajetória pela cidade futurista.");

            System.out.println("------- Observo os sequintes itens: -------");
            System.out.println("1 - Roupa nova");
            System.out.println("2 - Aparelho eletrônico  desconhecido");
            System.out.println("3 - Alimentos para viagem");
            System.out.println("--------------------------------------------");

            System.out.println(
                    "\nApós escolher os itens, percebo um pequeno detalhe… Estou sem dinheiro. Levando em consideração minha atual situação, não tenho escolha senão roubar os itens da loja e sair o mais rápido possível.\nMe escondo para que ninguém perceba o furto que acabo de cometer. Ao encontrar um lugar seguro, noto que estou sendo observado. Aquela mesma criança de manhã cedo estava me olhando do outro lado da rua, seus olhos ficam fibrados em cada movimento que eu possa fazer. Em meio ao desespero reparo o perigo, aquele jovem não queria apenas fazer companhia");

            // Decisão 02
            decisao1_2();

            Estrutura.qualquerCoisaParaContinuar();
            SegundoAto();
        }

        public static void SegundoAto() {
            Estrutura.cabecalho("SEGUNDO ATO");
            Estrutura.qualquerCoisaParaContinuar();
            System.out.println(
                    "\n Após caminhar horas pela cidade, decidi descansar. Após um tempo abro minha mochila e vejo meus itens.");

            Estrutura.qualquerCoisaParaContinuar();

            decisao2_1();

            decisao2_2();

            decisao2_3();

            TerceiroAto();
        }

        public static void TerceiroAto() {
            Estrutura.cabecalho("TERCEIRO ATO");
            Estrutura.qualquerCoisaParaContinuar();

            // inicio fase 03
            System.out.println(
                    "Finalmente entro em meu laboratório e noto algumas diferenças. Um grande buraco de minhoca está estabilizado na máquina do tempo. Reparo que os agentes estavam utilizando a máquina que criei como um artifício para viajar no tempo como se fosse propriedade deles, isso me enoja.\nComeço a ouvir barulhos de passos próximos a mim. Olho ao redor e sinto a presença próxima dos agentes.");


            // Decisão 04
            decisao3_1();

            // Sistema de combate
            CombateFinal();

            //Final história
            System.out.println ("Finalmente em “paz” leio minhas anotações. Percebo onde estava errando esse tempo todo: Havia esquecido uma vincular na conta. Se fosse em outros tempos com certeza ficaria revoltado, mas neste momento estou feliz de encontrar uma solução para tratar meu problema.\nApós ligar, entro na máquina com um sorriso no rosto. Logo estaria com a minha família, veria Hugo e Alex após muito tempo. Quem sabe agora teria tempo para viajar com eles e conhecer o mundo inteiro. Poderia ver a evolução dos dois em meus últimos dias de vida…\nDe repente sinto minha cabeça doendo, seria apenas uma consequência da viajar? Essa dor se intensifica até que eu durma.\nAcordo no outro dia com meu bisneto chamado… Ele repetia várias vezes de uma moça chamada Alex. Nunca conheci alguém com esse nome. Deixo ele falando e vou até meu laboratório, preciso fazer minha máquina do tempo funcionar.");


            Historia.Final();

        }

    }

