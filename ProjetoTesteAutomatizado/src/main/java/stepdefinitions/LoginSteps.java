package stepdefinitions;

import io.cucumber.java.it.Quando;
import io.cucumber.java.pt.*;
import org.openqa.selenium.WebDriver;
import pageobjects.LoginPage;


import java.util.concurrent.TimeUnit;




public class LoginSteps {
    WebDriver driver;



    @Dado("que o usuario esteja na pagina principal do sistema")
    public void que_o_usuario_esteja_na_pagina_principal_do_sistema() {
        Hooks.abrirUrl("https://opensource-demo.orangehrmlive.com");
        driver = Hooks.getDriver();


    }
    @Quando("informar o campo Username como {string}")
    public void informar_o_campo_username_como(String string) {
        LoginPage lp = new LoginPage(driver);
        lp.preencherUsuario(string);

    }
    @Quando("informar o Password como {string}")
    public void informar_o_password_como(String string) {
        LoginPage lp = new LoginPage(driver);
        lp.preencherSenha(string);

    }
    @Quando("clicar no botão Login")
    public void clicar_no_botao_login() {
        LoginPage lp = new LoginPage(driver);
        lp.clicarBotaoLogin();

    }
    @Entao("o sistema deverá autorizar o login, exibindo a página contendo a dashboard.")
    public void o_sistema_devera_autorizar_o_login_exibindo_a_pagina_contendo_a_dashboard() {
        LoginPage lp = new LoginPage(driver);
        lp.validarDashboard();

    }
}
