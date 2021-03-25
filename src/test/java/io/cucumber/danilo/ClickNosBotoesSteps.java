package io.cucumber.danilo;

import io.cucumber.java.pt.*;
import io.cucumber.danilo.config.Config;

public class ClickNosBotoesSteps {

    @Dado("que eu estou no site da gama academy products")
    public void que_eu_estou_no_site_da_gama_academy_products() {
        Config.abrir("https://pages.gama.academy/curso-de-product-management/");
    }
    
    @Entao("cliclo na opcao Quero ir para proximo nivel")
    public void cliclo_na_opcao_Quero_ir_para_proximo_nivel() throws InterruptedException {
        Thread.sleep(2000);
        Config.seletorQueryCss("#lp-pom-button-849").click();
    }

    @Entao("devo ver o valor e o botao comprar agora")
    public void devo_ver_o_valor_e_o_botÒo_comprar_agora() {
        Config.seletorQueryCss("#lp-pom-block-702");
        Config.fechar();
    }
    
}