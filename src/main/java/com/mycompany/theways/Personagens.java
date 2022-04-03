/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.theways;

/**
 *
 * @author 014653631
 */
public abstract class Personagens {
    
   //Atributos dos personagens 
   /*
    *hp = hitpoints pontos de ataque, bateu levou
    *xp = experiencepoints experiencia
    */
    public String nome;
    public int hp,xp,it;
    
    //Construtor para o personagem
    public Personagens(int xp, int hp){
        this.nome = nome;
        this.hp = hp;
        this.xp = xp;
    }
    
   //Método de ataque, defesa para todos os personagens
    public abstract int ataque();
    public abstract int defesa();
    
}
