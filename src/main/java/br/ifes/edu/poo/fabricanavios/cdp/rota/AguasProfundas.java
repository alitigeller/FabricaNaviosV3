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
public class AguasProfundas extends AbstractRota{

    public AguasProfundas() {
        
        setFator(1);
        setNome("AguaProfunda");
    }

    public AguasProfundas(Rota rota) {
        super(rota);
        setFator(1);
        setNome("AguaProfunda");
    }
    
    
    
}
