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
public class Transcontinental extends AbstractRota{

    public Transcontinental() {
        setFator(2);
        setNome("Transcontinental");
    }
    
    public Transcontinental(Rota rota) {
        super(rota);
        setFator(2);
        setNome("Transcontinental");
    }
    
}
