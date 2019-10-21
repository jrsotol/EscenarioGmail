package co.com.test.tasks;

import co.com.test.userinterface.GmailUnalPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

/**
 * Created by Candado on 21/10/2019.
 */
public class IngresarLogin implements Task{

    private GmailUnalPage gmailUnalPage;

    private String contraseña;
    private String correo;

    public IngresarLogin(String contraseña, String correo) {
        this.contraseña = contraseña;
        this.correo = correo;
    }

    @Override

    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(correo).into(GmailUnalPage.INGRESAR_CORREO));
        actor.attemptsTo(Enter.theValue(contraseña).into(GmailUnalPage.INGRESAR_CONTRASEÑA));
        actor.attemptsTo(Click.on(GmailUnalPage.BOTON_ENTRAR));
        actor.attemptsTo(Click.on(GmailUnalPage.BOTON_VERIFICAR));



    }

    public static IngresarLogin Unal(String correo, String contraseña) {
        return Tasks.instrumented(IngresarLogin.class, correo, contraseña);
    }
}
