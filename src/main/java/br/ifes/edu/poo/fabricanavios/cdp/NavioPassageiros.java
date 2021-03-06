package br.ifes.edu.poo.fabricanavios.cdp;




/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alessandro Eller
 */
public abstract class NavioPassageiros implements Navio {
    
    private int capacidadePessoas;
    private int capacidadeCarga;
    
    public NavioPassageiros() {
    }   

    

    @Override
    public int getCapacidadePessoas() {
        return capacidadePessoas;
    }

    @Override
    public void setCapacidadePessoas(int capacidadePessoas) {
        this.capacidadePessoas = capacidadePessoas;
    }

    @Override
    public void setCapacidadeCarga(int capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }

    @Override
    public int getCapacidadeCarga() {
        return capacidadeCarga;
    }
    
    
    public Object clone(){
        Object obj = null;
        try{
          obj=super.clone();
        }catch(CloneNotSupportedException x){
            
        }
        return obj;
    }
}
