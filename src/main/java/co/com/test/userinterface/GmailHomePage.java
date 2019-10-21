package co.com.test.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

/**
 * Created by Candado on 21/10/2019.
 */

public class GmailHomePage {

    public static final Target BOTON_REDACTAR_MENSAJE = Target.the("Botón de redactar mensaje ").located(By.xpath("//div[@class='T-I J-J5-Ji T-I-KE L3']"));
    public static final Target AREA_VALIDACION =  Target.the("Area para validar que estamos redactar mensaje").located(By.xpath("//div[@class='aYF']"));

}