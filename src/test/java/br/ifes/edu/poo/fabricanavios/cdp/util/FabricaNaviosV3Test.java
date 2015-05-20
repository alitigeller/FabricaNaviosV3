/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.edu.poo.fabricanavios.cdp.util;

import br.ifes.edu.poo.fabricanavios.cdp.util.director.NavioDirector;
import br.ifes.edu.poo.fabricanavios.cdp.util.director.GraneleiroDirector;
import br.ifes.edu.poo.fabricanavios.cdp.util.director.CargaGeralDirector;
import br.ifes.edu.poo.fabricanavios.cdp.util.director.EscunaDirector;
import br.ifes.edu.poo.fabricanavios.cdp.util.director.CruzeiroDirector;
import br.ifes.edu.poo.fabricanavios.cdp.util.builder.CargaGeralBuilder;
import br.ifes.edu.poo.fabricanavios.cdp.util.builder.NavioBuilder;
import br.ifes.edu.poo.fabricanavios.cdp.util.builder.EscunaBuilder;
import br.ifes.edu.poo.fabricanavios.cdp.util.builder.CruzeiroBuilder;
import br.ifes.edu.poo.fabricanavios.cdp.util.builder.GraneleiroBuilder;
import br.ifes.edu.poo.fabricanavios.cdp.Cruzeiro;
import br.ifes.edu.poo.fabricanavios.cdp.Escuna;
import br.ifes.edu.poo.fabricanavios.cdp.Navio;
import br.ifes.edu.poo.fabricanavios.cdp.CargaGeral;
import br.ifes.edu.poo.fabricanavios.cdp.Graneleiro;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author Alessandro Eller
 */
public class FabricaNaviosV3Test {
    
    
    @Before    
    public void Before(){}
    
    
    
    @Test 
   public void criarCruzeiro()
   {
        Navio navio = NavioManager.NAVIO.createCruzeiro();
        NavioBuilder builder = new CruzeiroBuilder(navio);
        NavioDirector director = new CruzeiroDirector();
        Navio resultado = director.build(builder);
       Assert.assertEquals(Cruzeiro.class ,resultado.getClass());
   }
   
   @Test 
   public void criarEscuna()
   {
        Navio navio = NavioManager.NAVIO.createEscuna();
        NavioBuilder builder = new EscunaBuilder(navio);
        NavioDirector director = new EscunaDirector();
        Navio resultado = director.build(builder);
       Assert.assertEquals(Escuna.class ,resultado.getClass());
   }
   
   @Test 
   public void criarCargaGeral()
   {
        Navio navio = NavioManager.NAVIO.createCargaGeral();
        NavioBuilder builder = new CargaGeralBuilder(navio);
        NavioDirector director = new CargaGeralDirector();
        Navio resultado = director.build(builder);
       Assert.assertEquals(CargaGeral.class ,resultado.getClass());
   }
   
   @Test 
   public void criarGraneleiro()
   {
        Navio navio = NavioManager.NAVIO.createGraneleiro();
        NavioBuilder builder = new GraneleiroBuilder(navio);
        NavioDirector director = new GraneleiroDirector();
        Navio resultado = director.build(builder);
       Assert.assertEquals(Graneleiro.class ,resultado.getClass());
       System.out.println(Graneleiro.class);
   }
}