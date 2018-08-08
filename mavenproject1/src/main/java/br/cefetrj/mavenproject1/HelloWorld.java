/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cefetrj.mavenproject1;

import org.apache.log4j.Logger;

/**
 *
 * @author 09513592740
 */
public class HelloWorld {
    
    static Logger lg = Logger.getLogger(HelloWorld.class);
    
    public static int soma(int a, int b){
        lg.trace("soma " + a + " + " + b);
        int r = a - b; 
        lg.trace("resultado da soma = " + r);
        return r;
    }
    
    public static void main(String[] args) {
        
        lg.info("main chamado");
        try{
            if(args.length == 0)
                lg.warn("Programa executado sem nenhum parâmetro");
            
            System.out.println("Soma = " + soma(Integer.parseInt(args[0]), Integer.parseInt(args[1])));
        }catch(Exception e){
            lg.error("Erro ao executar o hello world!!!", e);
            lg.fatal(e);
        }
        lg.debug("DEBUG");
        lg.trace("TRACE");
        lg.info("terminou main");
    }
    
}
