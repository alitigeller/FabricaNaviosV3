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
public abstract class NavioBuilder {
    
    public void buildCapacidadePessoas(){}
    public void buildCapacidadeCarga(){}
    public abstract Navio getNavio();
}
