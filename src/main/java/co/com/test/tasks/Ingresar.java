package co.com.test.tasks;

import co.com.test.userinterface.GmailLoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

/**
 * Created by Candado on 21/10/2019.
 */
public class Ingresar implements Task{

    private String correo;

    public Ingresar(String correo) {
        this.correo = correo;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Enter.theValue(correo).into(GmailLoginPage.INGRESAR_CORREO));
        actor.attemptsTo(Click.on(GmailLoginPage.BOTON_SIGUIENTE));

    }

    public static Ingresar Login(String correo) {
        return Tasks.instrumented(Ingresar.class, correo);
    }
}
