package co.com.test.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.apache.tools.ant.taskdefs.Tar;

/**
 * Created by Candado on 21/10/2019.
 */

@DefaultUrl("https://accounts.google.com/signin/v2/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin")
public class GmailLoginPage extends PageObject {

    public static final Target INGRESAR_CORREO = Target.the("casilla para ingresar correo").located(By.xpath("//input[@id='identifierId']"));
    public static final Target BOTON_SIGUIENTE = Target.the("El botón para continuar el proceso de logeo").located(By.xpath("//span[@class='RveJvd snByac'] "));
}
