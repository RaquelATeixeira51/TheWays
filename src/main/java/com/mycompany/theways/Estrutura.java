package com.mycompany.theways;

import java.util.Scanner;

public class Estrutura {
        Scanner entrada = new Scanner(System.in);
        Historia historia = new Historia();
        Futuro futuro = new Futuro();
        Passado passado = new Passado();
        Presente presente = new Presente();
        String nome;
        Jogador jogador;

        public int leiaInput(String prompt, int numEscolhas) {
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

        public void separador(int numero) {
            for (int i = 0; i < numero; i++) {
                System.out.println("------------------------------------------------");
                System.out.println("");
            }
        }

        public void cabecalho(String titulo) {
            separador(1);
            System.out.println(titulo);
            separador(1);
        }

        public void qualquerCoisaParaContinuar() {
            System.out.println("\nDigite qualquer coisa para continuar...");
            entrada.next();
        }

        public void jogar() {
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

            historia.Introducao();

            if (jogador.nome.equals("Thomas")) {
                futuro.PrimeiroAto();
            } else if (jogador.nome.equals("Alex")) {
                passado.PrimeiroAto();
            } else {
                presente.PrimeiroAto();
            }
        }

            public void instrucoes() {
                cabecalho("INSTRUÇÕES");
                System.out.println("Dada as opções digite um número para seguir certo caminho");
                qualquerCoisaParaContinuar();
            }
    
            public void creditos() {
                cabecalho("CRÉDITOS");
                System.out.println(
                        "Esse jogo foi feito pelo grupo 1: Raquel, Luzinete, Vinicius, Natalia, Renan e Rayane, da 1NC de analise e desenvolvimento de sistemas no Senac");
                qualquerCoisaParaContinuar();
            }
    
            public void informacoesPersonagem() {
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
    
            public void menuPrincipal() {
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
            
            public void startaGame() {
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
