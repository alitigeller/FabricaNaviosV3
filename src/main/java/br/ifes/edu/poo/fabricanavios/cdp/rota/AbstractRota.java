/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.edu.poo.fabricanavios.cdp.rota;

/**
 *
 * @author Alessandro Eller
 */
public abstract class AbstractRota extends Rota{
   Rota rota = new Rota();

    public AbstractRota() {
    }

    public AbstractRota(Rota rota) {
        this.rota = rota;
    }
   
   
    
}
