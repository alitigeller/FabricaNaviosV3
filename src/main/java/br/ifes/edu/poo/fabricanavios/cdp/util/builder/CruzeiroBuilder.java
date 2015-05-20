/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.edu.poo.fabricanavios.cdp.util.builder;

import br.ifes.edu.poo.fabricanavios.cdp.Navio;

/**
 *
 * @author aeller
 */
public class CruzeiroBuilder extends NavioBuilder{
    private Navio navioInProgress;
    
    public CruzeiroBuilder(Navio cruzeiro){
        navioInProgress = cruzeiro;
    }

    @Override
    public void buildCapacidadePessoas() {
        navioInProgress.setCapacidadePessoas(500);
        
    }

    @Override
    public Navio getNavio() {
        return navioInProgress;
    }

  
    
    
}
