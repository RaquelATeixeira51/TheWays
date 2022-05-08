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
        public static void PrimeiroAto(){
            Estrutura.cabecalho("PRIMEIRO ATO");
            Estrutura.cabecalho("CENÁRIO ATUAL");
            System.out.println("você está no futuro");
        }
    }
}
