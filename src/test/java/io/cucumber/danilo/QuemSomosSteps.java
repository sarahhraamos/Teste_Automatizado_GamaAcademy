package io.cucumber.danilo;

import io.cucumber.java.pt.*;
import io.cucumber.danilo.config.Config;
import static org.junit.Assert.assertEquals;



public class QuemSomosSteps{
    
    @Dado("clico na opcao Quem somos")
    public void clico_na_opcao() throws InterruptedException{
        Thread.sleep(2000);
        Config.seletorQueryCss("a[href='/sobre']").click();
    }
    
    @Entao("devo ver a palavra {string}")
    public void devo_ver_a_palavra(String string) {
        Config.seletorQueryCss("div.all.manifesto h1.heading.lado");
        Config.fechar();
    }
    
}