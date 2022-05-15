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

        //Escolhas dos usuários
        public static void decisao1_1(){

            int contador = 0;


            while (contador <= 2){
                System.out.println ("--------------------------");
                System.out.println ("(1) - Aceitar a ajuda");
                System.out.println ("(2) - Recusar ajuda");
                System.out.println ("--------------------------");
                System.out.print ("Aceita a ajuda da criança? ");
                Scanner entrada = new Scanner(System.in);
                int ajuda = entrada.nextInt();

                    if (ajuda == 2){
                        System.out.println ("Agradeço sua ajuda, mas devo continuar sozinho");
                        System.out.println ("----------------------------------------------");
                        System.out.println ("\nDeixo a criança para trás e sigo meu caminho, não existem motivos para confiar em um totalmente estranho, mesmo que seja uma criança.");
                        Estrutura.qualquerCoisaParaContinuar();
                        contador = 3;
                        
    
                    }
    
                    else if (ajuda == 1){
                        System.out.println ("Ok, aceito sua ajuda.");
                        System.out.println ("\nAceito a ajuda da criança, o que? Espere… não é uma  criança!");
                        System.out.println ("\nA criança mostra sua verdadeira forma se apresentando como um agente do FBI do futuro camuflado, no qual o objetivo é eliminar os seres humanos que sejam uma possível ameaça ao tempo espaço ...");
                        GamerOver();
                        contador = 3;
    
                    }

                    else {
                        System.out.println ("Valor inválido. Por favor, digite novamente.");
                        contador = 1;
                    }
                contador ++;
            }
                
                
        }

        public static void decisao1_2(){
            System.out.println ("\nA criança mostra que era apenas um holograma, assim vejo aquele pequeno garoto se transformar em sua real forma, na qual surge um homem alto com uma arma em sua cintura vestindo um terno preto com uma logo em seu peito.");
           
          int contador = 0;

          while (contador <= 2){
            Scanner input = new Scanner(System.in);
            System.out.println ("--------- O que farei?--------- ");
            System.out.println ("1 - Corro do agente mesmo sabendo das minhas condições físicas?");
            System.out.println ("2 - Decido enfrentar o agente?");
            System.out.println ("3 - Deve me camuflar na multidão?");
            System.out.println ("-------------------------------");
            System.out.println ("Qual é a sua escolha? ");
            int escolha1 = input.nextInt();

            switch(escolha1){
                case 1:
                System.out.println ("\nEm alerta, corro do agente. Entro em meio a multidão com toda a velocidade que consigo. Isso infelizmente acaba não sendo o suficiente para escapar e o agente do tempo consegue me alcançar.");
                contador = 3;
                GamerOver();
                break;


                case 2:
                System.out.println ("\nPor um momento de coragem decido que está na hora de enfrentar o adversário. Observo seus movimentos com atenção, a fim de descobrir os motivos da perseguição, então o questiono:");

                System.out.println ("\n - O que eu fiz para você? Não me recordo de conhecê-lo. O agente expressa uma risada sarcástica em seu rosto como se esperasse por isso");

                System.out.println ("\n- Você causou diversos problemas com a sua invenção, destruiu até mesmo sua família. Você é literalmente uma bomba relógio que deve ser desativada o quanto antes. Por isso estou aqui, para acabar com os problemas da sociedade.");

                System.out.println ("\nMais veloz que o tempo, sinto um tiro atingido meu peito. De repente tudo fica escuro...");
                GamerOver();
                contador = 3;
                break;

                case 3:
                System.out.println ("\nConsigo despistar o agente e após conseguir uma certa distância de nosso último local de encontro começo a procurar onde estaria o meu laboratório...");
                contador = 3;
                break;
            
                default:
                System.out.println ("Valor invalido. Por favor, digite novamente");
                contador = 1;
            }       
       

          }
    
            

        }

        public static void decisao2_1(){}

        public static void decisao2_2(){}

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

            System.out.println ("\n - Boa tarde, senhor! Gostaria de ajuda para conhecer a cidade? - A criança que me chamava tinha voz doce e sorriso contagiante, lembrava muito o meu bisneto.\n - Bem, acredito que não precise de ajuda. - É claro que eu necessitava  de ajuda, não conhecia nada do lugar que eu estava,  mas pedi ajuda de uma criança não parecia ser a escolha mais viável.\nA criança me olhou de cima a baixo, como se soubesse que eu era um velho louco perdido na cidade grande. Quando terminou de examinar meu rosto, retrucou:\n -Eu tenho certeza que você precisa de ajuda. Olha para suas roupas estranhas! Fora  que desde de que você chegou está aí parado olhando para tudo. Posso te levar pela cidade se deseja, ainda te mostro um lugar para você comprar roupas novas.");
            

            //Decisão do usuário 01 (Em tratamento)
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
            TerceiroAto();
        }

        public static void TerceiroAto(){
            Estrutura.cabecalho("TERCEIRO ATO");
            Estrutura.qualquerCoisaParaContinuar();

            //inicio fase 03
            System.out.println ("Finalmente entro em meu laboratório e noto algumas diferenças. Um grande buraco de minhoca está estabilizado na máquina do tempo. Reparo que os agentes estavam utilizando a máquina que criei como um artifício para viajar no tempo como se fosse propriedade deles, isso me enoja.\nComeço a ouvir barulhos de passos próximos a mim. Olho ao redor e sinto a presença próxima dos agentes.");

            //Decisão 04


            //Sistema de combate

            Historia.Final();

          
        }


    }
}
