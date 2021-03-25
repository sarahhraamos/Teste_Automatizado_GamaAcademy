package io.cucumber.danilo;

import io.cucumber.java.pt.*;
import io.cucumber.danilo.config.Config;

public class CompartilhadoSteps {

    @Dado("que eu estou no site da gama academy")
    public void acessandoSite() {
    Config.abrir("https://www.gama.academy/");
    }

    @Entao("eu fecho a propaganda")
    public void eu_fecho_a_propaganda() throws InterruptedException {
    Thread.sleep(2000);    
    Config.seletorQueryCss(".ub-emb-close").click();  
    }
   

}
