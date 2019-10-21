package co.com.test.questions;

import co.com.test.userinterface.GmailHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

/**
 * Created by Candado on 21/10/2019.
 */
public class LaValidacion implements Question<String>{

    @Override
    public String answeredBy(Actor actor) {
       return Text.of(GmailHomePage.AREA_VALIDACION).viewedBy(actor).asString();
    }


    public static Question Es() {
        return new LaValidacion();
    }
}
