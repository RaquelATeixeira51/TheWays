/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.theways;

/**
 *
 * @author 014653631
 */
public class Jogador extends Personagens{
    //variáveis para armazenar atributos de defesa e ataque
    public int numAtaAtibutos, numDefAtributos, numIntAtributos, numPespAtributos;
    
    //Array pra armazenar características do personagem
    public String[] Thomas = {"Thomas ", "Experiente ", "Inteligente ", "Teimoso ", "Bom de lábia "};
    public String[] Alex = {"Alex ", "Destemida ", "Inteligente ", "Corajosa ", "Boa de briga "};
    public String[] Hugo = {"Hugo ", "Agitado ", "Perspicaz ", "Curioso ", "Boa de se esconder "};
    
    //construtor do jogador
    public Jogador(String nome){
        super(100, 0);
        //Setando numero de atributos para 0
        this.numAtaAtibutos = 0;
        this.numDefAtributos = 0;
        this.numIntAtributos = 0;
        this.numIntAtributos = 0;
        //Será sobescrevido quando o jogador criar seu personagem
        escolhePersonagem();
    }
    
    @Override
    public int ataque(){
        return 0;
    }
    
    @Override
    public int defesa(){
        return 0;
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
