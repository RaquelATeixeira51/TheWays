/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.theways;

/**
 *
 * @author 014653631
 */
public class Historia {
    public static void Introducao(){
        Estrutura.cabecalho("INTRODUÇÃO");
        System.out.println("Introdução do game");
        Estrutura.qualquerCoisaParaContinuar();
    }
    
    public static void Passado(){
        Estrutura.cabecalho("CENÁRIO ATUAL");
        System.out.println("você está no passado");
    }
    public static void Presente(){
        Estrutura.cabecalho("CENÁRIO ATUAL");
        System.out.println("você está no presente");
    }
    public static void Futuro(){
        Estrutura.cabecalho("CENÁRIO ATUAL");
        System.out.println("você está no futuro");
    }
}
