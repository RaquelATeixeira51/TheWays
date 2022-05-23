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

    public class Estrutura {
        static Scanner entrada = new Scanner(System.in);
        static Jogador jogador;
        
        public static int leiaInput(String prompt, int numEscolhas){
            int input;
            do{
                System.out.println(prompt);
                try{
                    input = Integer.parseInt(entrada.next());
                }catch(Exception e){
                    input = -1;
                    System.out.println("Por favor insira um número válido");
                }
            } while(input < 1 || input > numEscolhas);
            return input;
        }
        
        public static void separador(int numero){
            for(int i = 0; i < numero; i++){
                System.out.println("------------------------------------------------");
                System.out.println("");
            }
        }
        
        public static void cabecalho(String titulo){
            separador(1);
            System.out.println(titulo);
            separador(1);
        }
        
        public static void qualquerCoisaParaContinuar(){
            System.out.println("\nDigite qualquer coisa para continuar...");
            entrada.next();
        }
        
        public static void jogar(){
            String nome;
            boolean setouNome = false;
            //Pegando o nome do jogador
            do{
                System.out.println("Qual o seu nome, ousado jogador?");
                nome = entrada.next();
                System.out.println("Seu nome é: " + nome + "\nEstá correto?");
                System.out.println("(1) Sim!");
                System.out.println("(2) Não, esse não é meu nome...");
                int input = leiaInput("->", 2);
                if(input == 1){
                    setouNome = true;
                }
            }while(!setouNome);
            //Cria novo objeto jogador com o nome
            jogador = new Jogador(nome);
            cabecalho("ESSE É SEU PERSONAGEM");
            informacoesPersonagem();
            
            Historia.Introducao();
            
            if(jogador.nome.equals("Thomas")){
                Futuro.PrimeiroAto();
            } else if (jogador.nome.equals("Alex")){
                Passado.PrimeiroAto();
            } else {
                Presente.PrimeiroAto();
            }
            
        }
        
        public static void instrucoes(){
            cabecalho("INSTRUÇÕES");
            System.out.println("Dada as opções digite um número para seguir certo caminho");
            qualquerCoisaParaContinuar();
        }
        
        public static void creditos(){
           cabecalho("CRÉDITOS");
            System.out.println("Esse jogo foi feito pelo grupo 1: Raquel, Luzinete, Vinicius, Natalia, Renan e Rayane, da 1NC de analise e desenvolvimento de sistemas no Senac");
            qualquerCoisaParaContinuar();
        }
        
        public static void informacoesPersonagem(){
            cabecalho("INFORMAÇÕES DO PERSONAGEM");
            System.out.println("Nome do personagem: " + jogador.nome);
            System.out.println("O hp do seu personagem " + jogador.hp);
            System.out.println("O xp do seu personagem " + jogador.xp);
            if(jogador.numAtaAtibutos > 0 || jogador.numDefAtributos > 0 || jogador.numIntAtributos > 0 || jogador.numPespAtributos > 0){
                System.out.println("Pontuação ofensiva " + jogador.numAtaAtibutos);
                System.out.println("Pontuação defensiva " + jogador.numDefAtributos);
                System.out.println("Pontuação de inteligencia " + jogador.numIntAtributos);
                System.out.println("Pontuação de perspicacia " + jogador.numPespAtributos);
            } 
            qualquerCoisaParaContinuar();
        }
        
        public static void menuPrincipal(){
            int input;
            boolean jogando = false;
            boolean sair = false;
            do{
                cabecalho("MENU");
                System.out.println("Escolha uma ação");
                separador(1);
                System.out.println("(1) Instruções");
                System.out.println("(2) Jogar");
                System.out.println("(3) Créditos");
                System.out.println("(4) Sair");
                input = leiaInput("->", 4);
                switch(input){
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
                if(input == 2){
                    jogando = true;
                } else if (input == 4){
                    sair = true;
                }
            } while(!jogando && !sair );
            
        }
        
        public static void startaGame(){
            //Titulo
            separador(1);
            System.out.println("THE WAYS");
            separador(1);
            System.out.println("SE PREPARE PARA ENTRAR EM UMA JORNADA DELIRANTE");
            separador(1);
            qualquerCoisaParaContinuar();
            
            
            //chama menu principal
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

    public class Historia {
        public static void Introducao(){
            Estrutura.cabecalho("INTRODUÇÃO");
            Date data = new Date();
            SimpleDateFormat formatador = new SimpleDateFormat("dd-MM-yyyy");
            String diaHoje = formatador.format(data);
            System.out.println("Era madrugada do dia " + diaHoje +" o céu estava escuro pela lua coberta pelas nuvens. Um velho estava sentado em seu laboratório numa poça de café. Ele estava cansado, tentando raciocinar formas de solucionar as questões do espaço tempo. Porém, em um momento de frustração, ele desconta sua raiva em sua máquina do tempo que a anos não funciona, e de repente a máquina atrai tudo na sala inclusive Thomas para seu interior.");
            Estrutura.qualquerCoisaParaContinuar();
        }

        public static void Final(){
            Estrutura.cabecalho("THE END");
            System.out.println("Thomas se encontra em seu laboratório novamente, porém por conta de todo ocorrido dos últimos tempos, sua memória acabou se fragmentando fazendo-o esquecer de algumas coisas.\nHugo adentra seu local de trabalho feliz por finalmente ter reencontrado seu avô, e emocionado pergunta sobre sua mãe adotiva “Vô, onde está mamãe?”\nThomas um pouco confuso responde “Sua mãe não está mais entre nós a um tempo…”\nE Hugo rebate:  “Estou falando a Alex…”\nE por fim Thomas devolve a pergunta: “Quem é Alex?”");
        }
    }

    public class Presente {
        public static void PrimeiroAto(){
            Estrutura.cabecalho("PRIMEIRO ATO");
            Estrutura.cabecalho("CENÁRIO ATUAL");
            System.out.println("você está no presente");
            Estrutura.qualquerCoisaParaContinuar();
            SegundoAto();
        }

        public static void SegundoAto(){
            Estrutura.cabecalho("SEGUNDO ATO");
            Estrutura.qualquerCoisaParaContinuar();
            TerceiroAto();
        }

        public static void TerceiroAto(){
            Estrutura.cabecalho("TERCEIRO ATO");
            Estrutura.qualquerCoisaParaContinuar();
            Historia.Final();
        }
    }

    public class Passado {
        public static void PrimeiroAto(){
            Estrutura.cabecalho("PRIMEIRO ATO");
            Estrutura.cabecalho("CENÁRIO ATUAL");
            System.out.println("você está no passado");
        }
    }

    public class Futuro {

        //Escolhas dos usuários fase 01
        public static void decisao1_1(){

                System.out.println ("--------------------------");
                System.out.println ("(1) - Aceitar a ajuda");
                System.out.println ("(2) - Recusar ajuda");
                System.out.println ("--------------------------");
                System.out.print ("Aceita a ajuda da criança? ");
                Scanner entrada = new Scanner(System.in);
                int ajuda = Estrutura.leiaInput("->", 2);

                switch(ajuda){
                    case 1:
                    System.out.println ("Ok, aceito sua ajuda.");
                    System.out.println ("\nAceito a ajuda da criança, o que? Espere… não é uma  criança!");
                    System.out.println ("\nA criança mostra sua verdadeira forma se apresentando como um agente do FBI do futuro camuflado, no qual o objetivo é eliminar os seres humanos que sejam uma possível ameaça ao espaço tempo ...");
                    GamerOver();
                    break;

                    case 2:
                    System.out.println ("Agradeço sua ajuda, mas devo continuar sozinho");
                    System.out.println ("----------------------------------------------");
                    System.out.println ("\nDeixo a criança para trás e sigo meu caminho, não existem motivos para confiar em um totalmente estranho, mesmo que seja uma criança.");
                    Estrutura.qualquerCoisaParaContinuar();
                    break;
                }

                    
                
        }

        public static void decisao1_2(){
            System.out.println ("\nA criança mostra que era apenas um holograma, assim vejo aquele pequeno garoto se transformar em sua real forma, na qual surge um homem alto com uma arma em sua cintura vestindo um terno preto com uma logo em seu peito.");
           
            Scanner entrada = new Scanner(System.in);
            System.out.println ("--------- O que farei?--------- ");
            System.out.println ("1 - Corro do agente mesmo sabendo das minhas condições físicas?");
            System.out.println ("2 - Decido enfrentar o agente?");
            System.out.println ("3 - Devo me camuflar na multidão?");
            System.out.println ("-------------------------------");
            System.out.println ("Qual é a sua escolha? ");
            int escolha1 = Estrutura.leiaInput("->", 3);

            switch(escolha1){
                case 1:
                System.out.println ("\nEm alerta, corro do agente. Entro em meio a multidão com toda a velocidade que consigo. Isso infelizmente acaba não sendo o suficiente para escapar e o agente do tempo consegue me alcançar.");
                GamerOver();
                break;


                case 2:
                System.out.println ("\nPor um momento de coragem decido que está na hora de enfrentar o adversário. Observo seus movimentos com atenção, a fim de descobrir os motivos da perseguição, então o questiono:");

                System.out.println ("\n - O que eu fiz para você? Não me recordo de conhecê-lo. O agente expressa uma risada sarcástica em seu rosto como se esperasse por isso");

                System.out.println ("\n- Você causou diversos problemas com a sua invenção, destruiu até mesmo sua família. Você é literalmente uma bomba relógio que deve ser desativada o quanto antes. Por isso estou aqui, para acabar com os problemas da sociedade.");

                System.out.println ("\nMais veloz que o tempo, sinto um tiro atingido meu peito. De repente tudo fica escuro...");
                GamerOver();
                break;

                case 3:
                System.out.println ("\nConsigo despistar o agente e após conseguir uma certa distância de nosso último local de encontro começo a procurar onde estaria o meu laboratório...");
                break;
            
            
            }       
       

          }
    
        //Escolhas dos usuários fase 02
        public static void decisao2_1(){
                System.out.println ("------- o que posso fazer?------- ");
                System.out.println ("1 - Comida");
                System.out.println ("2 - Roupas");
                System.out.println ("3 - Celular");
                System.out.println ("---------------------------");
                System.out.println ("Qual é a sua escolha? ");
                
                int opcao = Estrutura.leiaInput("->", 3);
                switch(opcao){
                    case 1:
                    System.out.println ("Vou economizar, não sei quando irei precisar de mais.");
                    System.out.println("");
                    Estrutura.qualquerCoisaParaContinuar();
                    System.out.println("");
                    decisao2_1();
                  
                break;
                
                    case 2:
                        System.out.println ("Huum item interessante. Eventualmente pode ser útil.");
                        System.out.println("");
                        Estrutura.qualquerCoisaParaContinuar();
                        System.out.println("");
                        decisao2_1();
                    break;
                
                case 3:
                    System.out.println ("Ligo o celular e  abro o GPS, procuro a distância entre meu lugar atual e onde seria a rua"
                          + "\nde meu laboratório, sei que ele ainda existe. Vejo que está na mesma região, porém, visto como um lugar"
                          + "\ninterditado e controlado pelo FBI. Só me resta uma opção: conheço todas as rotas de fuga do prédio, chegou"
                          + "\na hora de usar esses conhecimentos.");
                    Estrutura.qualquerCoisaParaContinuar();
                  break;
                  
            }
            }
        public static void decisao2_2(){
                System.out.println ("------- Thomas anda por 40 minutos até avistar seu laboratório. "
                        + "\nDecide que deve arrumar uma maneira de entrar no local, como ele deve fazer isso?------- ");
                System.out.println ("1 -  Tento entrar pela porta da frente disfarçado com as roupas adquiridas na loja.");
                System.out.println ("2 - Subo as escadas de incêndio do local. ");
                System.out.println ("3 -  Entrada do esgoto.");
                System.out.println ("---------------------------");
                System.out.println ("Qual é a sua escolha? ");
                int opcao = Estrutura.leiaInput("->", 3);
                switch(opcao){
                    case 1:
                      System.out.println ("Thomas é fuzilado por todos os agentes do local, pois, na entrada havia um"
                              + "\nscanner biométrico que revelou sua identidade.");
                      System.out.println("");
                      System.out.println("GAME OVER!!!!");
                      System.out.println("");
                      Estrutura.qualquerCoisaParaContinuar();
                      System.out.println("");
                      Estrutura.menuPrincipal();
                      
                    break;
                    
                    case 2:
                     System.out.println ("Thomas já andou muito e não se alimentou, perdendo as forças acaba caindo de uma certa"
                             + "\naltura da escada e morrendo espatifado no chão.");
                     System.out.println("");
                      System.out.println("GAME OVER!!!!");
                      System.out.println("");
                      Estrutura.qualquerCoisaParaContinuar();
                      System.out.println("");
                      Estrutura.menuPrincipal();
                     break;
                    
                    case 3:
                      System.out.println ("Sigo pelos esgotos do laboratório. Os caminhos que seguiam mais pareciam um labirinto e somente"
                              + "\neu conhecia o trajeto. O esgoto termina em uma porta que serve como acesso aos corredores, porém, não tenho"
                              + " a chave…");
                      
                      Estrutura.qualquerCoisaParaContinuar();
                      
                      System.out.println ("Procuro a chave rebatendo minhas mãos em meu corpo, percebo que elas estão em minhas roupas antigas"
                              + "\nque havia trocado. Ao substituir as roupas novas acabei deixando as antigas na loja, o que me irrita, como um"
                              + "\ncientista brilhante pode cometer tamanha burrice, grr!!!!");
                      Estrutura.qualquerCoisaParaContinuar();
                      break;
                      
                }
                    
            }
        public static void decisao2_3(){
                System.out.println ("------- O que devo fazer?------- ");
                System.out.println ("1 - Tentar arrombar a porta");
                System.out.println ("2 - Volto para loja e pego a chave");
                System.out.println ("---------------------------");
                
                int opcao = Estrutura.leiaInput("->", 2);
                switch(opcao){
                    case 1:
                      System.out.println ("Fiz muito barulho, essa não… escuto os agentes descendo. Vou me esconder.\n" +
                      "\nOs agentes abrem a porta e rodam o esgoto me procurando. Como nunca tiveram naquele lugar, ao se separarem "
                      +"\nconsigo atravessar a porta e corro até meu laboratório.");
                      System.out.println("");
                      Estrutura.qualquerCoisaParaContinuar();
                      System.out.println("");
                     
                      
                    break;
                    
                    case 2:
                     System.out.println ("No caminho de volta Thomas é pego pelos agentes.");
                     System.out.println("");
                      System.out.println("GAME OVER!!!!");
                      System.out.println("");
                      Estrutura.qualquerCoisaParaContinuar();
                      System.out.println("");
                      Estrutura.menuPrincipal();
                     break;
              
                }
                
            }

        //Escolhas dos usuários fase 03
        public static void decisao3_1(){
            Scanner entrada  = new Scanner(System.in);
            System.out.println("Fecho a porta do laboratório e empurro um armário com toda a força que o me resta, enquanto tento descobrir como voltar para o tempo e arrumar tudo.");


            System.out.println ("O que ele deve fazer?");
            System.out.println ("1 - Combate direto");
            System.out.println ("2 - Se esconder dos agentes");
            System.out.println ("3 - Chutar a máquina de novo");
            int escolha = Estrutura.leiaInput("->", 3);

            switch(escolha){
                case 1:
                break;

                case 2:
                System.out.println("Tento me esconder atrás de algo o mais rápido possível. ");
                System.out.println("Mesmo com a minha velocidade, em menos de um minuto os agentes arrombaram e entraram no laboratório e conseguiram me achar.");
                System.out.println("- Droga, vocês não podem fazer isso comigo! AAAAAAAAAAH");
                System.out.println("Os agentes jogam Thomas no buraco de minhoca e o vêem ser destroçado em mil pedaços se perdendo pelo tempo.");
                GamerOver();
                break;

                case 3:
                System.out.println("Mas que porcaria eu não quero morrer, AAAAAAH que se dane essa porcaria, BUUUUUM!\nThomas ao chutar a máquina a sobrecarrega e não apenas se mata como leva o quarteirão inteiro a ser sugado pelo buraco de minhoca.");
                GamerOver();
                break;

                

            }

        }
        public static void CombateFinal(){
            System.out.println("Deparo com três agentes do tempo e mais para frente noto uma arma que se assemelha a um blaster. Impossível não lembrar das referências pop dos anos 80. Corro em direção ao armamento com a intenção de atingir meus adversários. Consigo pegar o blaster a tempo e sinto um dos agentes referindo um ataque em minhas costas. ");

            System.out.println ("O que devo fazer?");
            System.out.println ("1 - Revido dando um soco no agente e saio correndo.\n 2 - Tento dar um tiro de blaster.\n 3 -  Tento enfrentá los todos de uma vez");
            int opcao = Estrutura.leiaInput("->", 3);


            int dano = 0;

            //Danos 01
            if(opcao == 1 || opcao == 01){
                System.out.println ("sofro um certo dano, mas consigo aguentar.");

                dano = Jogador.hp - 50;
                System.out.println("TOTAL: " + dano + " HP");

            }

            else if ( opcao == 02 || opcao == 2 ){
                System.out.println ("Consequência:  porém, ele está muito perto e me atingi também.");
                dano = Jogador.hp - 75;
                System.out.println("TOTAL: " + dano + " HP");
            }

            else if ( opcao == 3  || opcao == 03 ) {
                System.out.println ("Consequência: A morte total de Thomas. Ele não tem condicionamento físico o suficiente.");
                dano = Jogador.hp - 150;
                GamerOver();

            }

            System.out.println(Jogador.hp);


            //Dano 02
        }

        public static void GamerOver(){
            System.out.println ("GAMER OVER!!");
            Estrutura.qualquerCoisaParaContinuar();
            Estrutura.menuPrincipal();

        }

        public static void PrimeiroAto(){
            Estrutura.cabecalho("PRIMEIRO ATO");
            Estrutura.cabecalho("CENÁRIO ATUAL");
            System.out.println("você está no futuro");

            //Prólogo
            System.out.println ("\nDurante a minha longa vida, trabalhei como cientista renomado para diversas intuições de ciência do mundo. Isso me propiciou alguns prêmios e reconhecimentos de contribuições para física moderna. Também me casei e tive duas netas, mas uma delas infelizmente veio a falecer aos 21 anos. Tudo isso contribuiu para a solidão que eu vivo agora, já que só me resta descobrir uma maneira de viajar no tempo e achar formas de solucionar problemas da sociedade.");

            System.out.println("\nNo meu laboratório encaro a máquina que criei. Grande, cinza e inútil, esses são os melhores adjetivos que posso dar para uma máquina de viagem no tempo que não funciona.\nJá testei todas as possibilidades possíveis e até Einstein não teve tantas ideias para viagem no tempo. Gostaria que ao menos ligasse.");


            System.out.println ("\nCansado, realizei uma última  tentativa de verificar as engrenagens  da máquina. Um surto de frustração e raiva passou pela minha mente, NADA, ABSOLUTAMENTE NADA! Até mesmo a lua se escondeu nas nuvens após esse fracasso. Com toda a força que eu tive chutei a máquina e para minha surpresa ela ligou...");

            Estrutura.qualquerCoisaParaContinuar();

            //Chegando no futuro
            System.out.println("\nEm alguns segundos já não estava no laboratório...");

            System.out.println ("\nEntão eu finalmente entendi, havia conseguido o que estava buscando. Como meus colegas cientistas irão reagir? Será que ficariam felizes com a nova descoberta? Em um primeiro momento provavelmente me chamariam de louco. Não muito fora do normal, estava acostumado com esse tipo de “apelido” nada amigável.  O que importava é que havia conquistado a maior façanha de todos os tempos.");

            System.out.println("\nDeterminado a conhecer o lugar, caminho pelas ruas da cidade. Luzes automáticas, carros voadores, prédios futuristas, robôs, telões e crianças com roupas peculiares em todas as partes. Aquele sem dúvidas é o futuro.");


            System.out.println("Liberto dos meus pensamentos quando uma voz de uma criança me chama:");

            System.out.println ("\n - Boa tarde, senhor! Gostaria de ajuda para conhecer a cidade? - A criança que me chamava tinha voz doce e sorriso contagiante, lembrava muito o meu bisneto.\n - Bem, acredito que não precise de ajuda. - É claro que eu necessitava  de ajuda, não conhecia nada do lugar que eu estava,  mas pedir ajuda de uma criança não parecia ser a escolha mais viável.\nA criança me olhou de cima a baixo, como se soubesse que eu era um velho louco perdido na cidade grande. Quando terminou de examinar meu rosto, retrucou:\n -Eu tenho certeza que você precisa de ajuda. Olha para suas roupas estranhas! Fora  que desde de que você chegou está aí parado olhando para tudo. Posso te levar pela cidade se deseja, ainda te mostro um lugar para você comprar roupas novas.");
            

            //Decisão do usuário 01 
            decisao1_1();
                       
            //Loja de itens
            
            System.out.println ("Caminho pelas ruas da cidade até encontrar algo que fosse interessante e me deparo com uma loja de itens. Entro em busca de itens que possam ajudar na minha trajetória pela cidade futurista.");

            System.out.println ("------- Observo os sequintes itens: -------");
            System.out.println ("1 - Roupa nova");
            System.out.println ("2 - Aparelho eletrônico  desconhecido");
            System.out.println ("3 - Alimentos para viagem");
            System.out.println ("--------------------------------------------");

            System.out.println ("\nApós escolher os itens, percebo um pequeno detalhe… Estou sem dinheiro. Levando em consideração minha atual situação, não tenho escolha senão roubar os itens da loja e sair o mais rápido possível.\nMe escondo para que ninguém perceba o furto que acabo de cometer. Ao encontrar um lugar seguro, noto que estou sendo observado. Aquela mesma criança de manhã cedo estava me olhando do outro lado da rua, seus olhos ficam fibrados em cada movimento que eu possa fazer. Em meio ao desespero reparo o perigo, aquele jovem não queria apenas fazer companhia");

            //Decisão 02
            decisao1_2();
            

            Estrutura.qualquerCoisaParaContinuar();
            SegundoAto();       
        }


        public static void SegundoAto(){
            Estrutura.cabecalho("SEGUNDO ATO");
            Estrutura.qualquerCoisaParaContinuar();
            System.out.println ("\n Após caminhar horas pela cidade, decidi descansar. Após um tempo abro minha mochila e vejo meus itens.");
            
            Estrutura.qualquerCoisaParaContinuar();
            
            decisao2_1();
              
            decisao2_2();
            
            decisao2_3();

            TerceiroAto();
        }

        public static void TerceiroAto(){
            Estrutura.cabecalho("TERCEIRO ATO");
            Estrutura.qualquerCoisaParaContinuar();

            //inicio fase 03
            System.out.println ("Finalmente entro em meu laboratório e noto algumas diferenças. Um grande buraco de minhoca está estabilizado na máquina do tempo. Reparo que os agentes estavam utilizando a máquina que criei como um artifício para viajar no tempo como se fosse propriedade deles, isso me enoja.\nComeço a ouvir barulhos de passos próximos a mim. Olho ao redor e sinto a presença próxima dos agentes.");

            Estrutura.qualquerCoisaParaContinuar();

            //Decisão 04
            decisao3_1();


            //Sistema de combate
            CombateFinal();

            Estrutura.qualquerCoisaParaContinuar();

            Historia.Final();

          
       
    }
            

}

}