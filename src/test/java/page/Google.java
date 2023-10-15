package page;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Google {

    @FindBy(name = "q")
    WebElement inputBuscar;

    @FindBy(xpath = "/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]")
    WebElement btnBusqueda;

    public Google(WebDriver webDriver){
        PageFactory.initElements(webDriver, this);
    }

    public void ingresarBusqueda(String busqueda){
        inputBuscar.sendKeys(busqueda);
    }

    public void clickBtnBusqueda(){
        btnBusqueda.click();
    }

    public void clickBtnBusqueda(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(btnBusqueda));
        element.click();
    }
}
