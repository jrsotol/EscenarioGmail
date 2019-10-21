package co.com.test.stepdefinitions;

import co.com.test.questions.LaValidacion;
import co.com.test.tasks.Abrir;
import co.com.test.tasks.Ingresar;
import co.com.test.tasks.IngresarLogin;
import co.com.test.tasks.IrAMensajes;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

/**
 * Created by Candado on 21/10/2019.
 */
public class GmailStepDefinition {

    @Managed(driver = "chrome")
    private WebDriver hisBrowser;
    private Actor usuario = Actor.named("Usuario");

    @Before
    public void configuracionInicial(){
        usuario.can(BrowseTheWeb.with(hisBrowser));
    }

    @Dado("^que usuario quiere ingresar a su (.*) gmail$")
    public void queUsuarioQuiereIngresarASuCorreoGmail(String correo) throws Exception {
        usuario.wasAbleTo(Abrir.CorreoGmail());
        usuario.wasAbleTo(Ingresar.Login(correo));
    }


    @Cuando("^el lo ingrese debera ingresar de nuevo su (.*) y (.*)$")
    public void elLoIngreseDeberaIngresarDeNuevoSuCorreoYContraseña(String correo, String contraseña) throws Exception {
        usuario.attemptsTo(IngresarLogin.Unal(correo, contraseña));


    }

    @Cuando("^dirigirse a la bandeja de correos enviados$")
    public void dirigirseALaBandejaDeCorreosEnviados() throws Exception {
        usuario.attemptsTo(IrAMensajes.Enviados());


    }

    @Entonces("^el deberia ver el (.*) de redactar mensaje$")
    public void elDeberiaVerElMensajeDeRedactarMensaje(String validacion) throws Exception {
        usuario.should(GivenWhenThen.seeThat(LaValidacion.Es(), Matchers.equalTo(validacion)));


    }
}
