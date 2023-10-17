package testClass;

import page.CargaInformacion;
import page.Login;

import java.text.ParseException;

public class Logeo {

    private Login login;
    private CargaInformacion cargaInformacion;
    public Logeo(){
    }


    public void CasoLogin1(String usuario, String clave)throws ParseException {
        login = new Login();
        cargaInformacion = new CargaInformacion();
        login.ingresarUsuario(usuario);
        login.ingresarClave(clave);
        login.clickBtnIngresar();
        cargaInformacion.recuperarTitulo();
        cargaInformacion.rellenarCampoTexto("Testeo");
        cargaInformacion.rellenarCampoMail("aaa@aa.com");
        cargaInformacion.rellenarCampoAreaTexto("AAA");
        cargaInformacion.seleccionarFechaCalendario("2023-03-19");
        cargaInformacion.rellenarCampoFecha("02/02/2023");
        cargaInformacion.rellenarCampoLista("valor 3");
        cargaInformacion.seleccionMultiple(2);
        cargaInformacion.comboRadio(1);
        cargaInformacion.clickBtnEnviar();
    }
}
