package co.com.test.tasks;

import co.com.test.userinterface.GmailLoginPage;
import cucumber.api.java.bs.A;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

/**
 * Created by Candado on 21/10/2019.
 */
public class Abrir implements Task{

    private GmailLoginPage gmailLoginPage;


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(gmailLoginPage));

    }

    public static Abrir CorreoGmail() {
        return Tasks.instrumented(Abrir.class);
    }
}
