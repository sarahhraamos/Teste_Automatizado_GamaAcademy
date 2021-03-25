package io.cucumber.danilo;

import io.cucumber.java.pt.*;
import io.cucumber.danilo.config.Config;
import static org.junit.Assert.assertEquals;

public class ListDeOpcoesSteps {

    @Dado("cliclo na opcao DEV FULL STACK")
    public void cliclo_na_opcao_DEV_FULL_STACK() throws InterruptedException {
        Thread.sleep(2000);
        Config.seletorQueryCss(".btc-alt").click();
    
    }

    @Entao("devo ver as opcoes")
    public void devo_ver_as_opcoes(io.cucumber.datatable.DataTable dataTable) {
        Config.seletorQueryCssTodos(".w-dyn-list");
        Config.fechar();

    }

}