package pageobjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertTrue;


public class LoginPage {

    protected WebDriver driver;

    public LoginPage(WebDriver driver){
        this.driver = driver;

        PageFactory.initElements(driver,this);
    }

    @FindBy (how = How.ID, using = "txtUsername")
    private WebElement usuario;

    @FindBy (how = How.ID, using = "txtPassword")
    private WebElement senha;

    @FindBy (how = How.ID,using = "btnLogin")
    private WebElement btnlogin;

    @FindBy (how = How.CSS, using = "h1:contains('DashBoard')")
    private WebElement dashboard;

    public void esperarElemento(WebElement elemento){
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOf(elemento));
    }

    public void preencherUsuario(String nomeUsuario){
        esperarElemento(usuario);
        usuario.sendKeys(nomeUsuario);
    }

    public void preencherSenha(String nomeSenha){
        esperarElemento(senha);
        senha.sendKeys(nomeSenha);
    }

    public void clicarBotaoLogin(){
        esperarElemento(btnlogin);
        btnlogin.click();
    }

    public void validarDashboard(){
        esperarElemento(dashboard);
        assertTrue(dashboard.isEnabled());
    }
}
