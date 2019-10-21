package co.com.test.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;
import org.apache.tools.ant.taskdefs.Tar;

/**
 * Created by Candado on 21/10/2019.
 */
public class GmailUnalPage {

    public static final Target INGRESAR_CORREO = Target.the("casilla para ingresar correo").located(By.xpath("//input[@id='j_username'] "));
    public static final Target INGRESAR_CONTRASEÑA = Target.the("casilla para ingresar contraseña").located(By.xpath("//input[@id='j_password'] "));
    public static final Target BOTON_ENTRAR = Target.the("Boton para ingresar").located(By.xpath("//span[@id='dijit_form_Button_0_label'] "));
    public static final Target BOTON_VERIFICAR = Target.the("Botón para verificar cuenta").located(By.xpath("//span[@class='RveJvd snByac'] "));
}
