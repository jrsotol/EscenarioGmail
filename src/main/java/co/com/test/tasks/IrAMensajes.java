package co.com.test.tasks;

import co.com.test.userinterface.GmailHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import java.lang.management.GarbageCollectorMXBean;

/**
 * Created by Candado on 21/10/2019.
 */
public class IrAMensajes implements Task {

    private GmailHomePage gmailHomePage;


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(GmailHomePage.BOTON_REDACTAR_MENSAJE));
    }

    public static IrAMensajes Enviados() {
        return Tasks.instrumented(IrAMensajes.class);
    }
}
