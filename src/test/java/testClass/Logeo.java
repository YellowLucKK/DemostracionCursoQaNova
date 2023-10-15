package testClass;

import org.openqa.selenium.WebDriver;
import page.CargaInformacion;
import page.Login;

public class Logeo {


    private Login login;


    private CargaInformacion cargaInformacion;


    WebDriver webDriver;


    public Logeo(WebDriver webDriver){
        this.webDriver = webDriver;
    }


    public void CasoLogin1(String usuario, String clave){
        login = new Login(webDriver);
        cargaInformacion = new CargaInformacion(webDriver);
        login.ingresarUsuario(usuario);
        login.ingresarClave(clave);
        login.clickBtnIngresar();
        cargaInformacion.recuperarTitulo();
        cargaInformacion.rellenarCampoTexto("Testeo");
        cargaInformacion.rellenarCampoMail("aaa@aa.com");
        cargaInformacion.rellenarCampoAreaTexto("AAA");
        cargaInformacion.rellenarCampoFecha("02/02/2023");
        cargaInformacion.rellenarCampoLista("valor 3");
        cargaInformacion.seleccionMultiple(2);
        cargaInformacion.comboRadio(1);
        cargaInformacion.clickBtnEnviar();
    }
}
