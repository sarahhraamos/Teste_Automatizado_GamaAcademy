![](https://img.shields.io/badge/cucumber-v.0.0.1-yellow.svg)
![](https://img.shields.io/badge/selenium-v.3.141.59-green.svg)

# Teste_Automatizado_GamaAcademy
<br>
<b>Objetivo:</b> O objetivo era fazer o teste automatizado com o [site da Gama](https://www.gama.academy/?gclid=CjwKCAjwgZuDBhBTEiwAXNofRH72c4zcKAViB5mjYF2CNPL1ij_guGMW2SUm8m_xk_W8GzxRWJJOCxoCIZIQAvD_BwE) testando algumas funcionalidades básicas do site.

<br>
<br>

## Caso de Teste :red_circle: <br>
O objetivo e acessar o site e ver o item Manifesto.<br>
<b>Cenario I:</b> Entrar o site da Gama Academy e clicar na opcao quem somos<br>
Dado que eu estou no site da gama academy<br>
Entao eu fecho a propaganda<br>
E clico na opcao Quem somos<br>
Entao devo ver a palavra "Manifesto"<br>
<br>
<br>

## Caso de Teste II :red_circle: <br>
Entrar no site Gama Academy e clicar nas opcoes<br>
<br>
<b>Cenario I:</b> Entrar no site Gama Academy Products e ver o botao comprar<br>
Dado que eu estou no site da gama academy products<br>
E cliclo na opcao Quero ir para proximo nivel<br>
Entao devo ver o valor e o botao comprar agora<br>
<br>
<b>Cenario II:</b> Entrar no site Gama Academy e ver uma lista de opcoes<br>
<br>
Dado que eu estou no site da gama academy<br>
Entao eu fecho a propaganda<br>
E cliclo na opcao DEV FULL STACK<br>
Entao devo ver as opcoes<br>
  |Crie seu portfólio!| <br>
  |Acompanhamento de Carreira|<br>
  |Professores de surf que sabem surfar!|<br>
  |Estude na Melhor Startup de Educação|<br>
<br>
<br>
<br>

## Tecnologias utilizadas :heart_eyes: <br>
 :white_check_mark: <b>Java</b><br>
> Linguagem de programação para desenvolvimento da aplicação.<br>
 
 :white_check_mark: <b>Selenium</b><br>
> Framework responsável por fazer a integração do código java com a linguagem Gherkin(Cucumber) abrindo o browser fazendo o teste de comportamento.<br>
 
 :white_check_mark: <b>Cucumber</b><br>
> Framework responsável por traduzir uma linguagem humana em código Java.<br>

:white_check_mark: <b>Maven</b><br>
> Gerenciador de dependências para o Java.<br>

<br>
<br>
<br>

## Como utilizar :computer:<br>

- Instalar o [Java](https://www.java.com/pt-BR/download/ie_manual.jsp?locale=pt_BR)
- Instalar [JDK](https://www.oracle.com/br/java/technologies/javase/javase-jdk8-downloads.html)
- Verificar se o JAVA_HOME está configurado em seu computador.
- Clone do projeto.<br>
`` git clone https://github.com/sarahhraamos/Teste_Automatizado.GamaAcademy.git ``
- Entrando na pasta do projeto<br>
`` cd TesteIndividual_Accenture ``
- Fazer o download do [Chrome Webdriver](https://chromedriver.chromium.org/downloads) e colocar o arquivo descompactado dentro da pasta driver na raiz do projeto:<br>
<b>Exemplo:</b><br>
``cd driver``<br>
``curl https://chromedriver.storage.googleapis.com/89.0.4389.23/chromedriver_linux64.zip``<br>
``unzip chromedriver_linux64.zip``<br>
``rm -rf chromedriver_linux64.zip``<br>
``cd ../driver``<br>
- Limpando e validando maven Unix<br>
``./mvnw clean``<br>
- Limpando e validando maven Windows<br>
``mvnw.cmd clean``<br>
- Executando teste no Unix<br>
``./test.sh``<br>
- Executando teste no Windows<br>
``test.bat``<br>

<br>
<br>
<br>
