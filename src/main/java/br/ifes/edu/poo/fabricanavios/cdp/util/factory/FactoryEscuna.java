/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.edu.poo.fabricanavios.cdp.util.factory;

import br.ifes.edu.poo.fabricanavios.cdp.Escuna;
import br.ifes.edu.poo.fabricanavios.cdp.Navio;

/**
 *
 * @author Alessandro Eller
 */
public class FactoryEscuna extends NavioPassageirosFactory{

    @Override
    public Navio Create() {
        Navio escuna= new Escuna();
        return escuna;
    }
    
}
