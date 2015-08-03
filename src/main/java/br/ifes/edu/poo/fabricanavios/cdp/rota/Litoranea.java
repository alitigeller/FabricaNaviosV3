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
public class Litoranea extends AbstractRota{

    public Litoranea() {
        setFator(3);
        setNome("Litoranea");
    }

    public Litoranea(Rota rota) {
        super(rota);
        setFator(3);
        setNome("Litoranea");
    }
    
    
    
}
