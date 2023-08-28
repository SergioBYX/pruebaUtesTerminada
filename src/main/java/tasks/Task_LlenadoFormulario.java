package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.By;
import userinterface.UserInt_LlenadoFormulario;

public class Task_LlenadoFormulario implements Task {
    private UserInt_LlenadoFormulario llenadoformulario;

    public static Performable onThePage() { return Tasks.instrumented(Task_LlenadoFormulario.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(llenadoformulario.FIRSTNAME_INPUT),
                Enter.theValue("Sergio").into(llenadoformulario.FIRSTNAME_INPUT),
                Enter.theValue("Salas").into(llenadoformulario.LAST_NAME_INPUT),
                Enter.theValue("Sergio9990@gmail.com").into(llenadoformulario.EMAIL_INPUT),
                Click.on(llenadoformulario.BMONTH_INPUT),
                Enter.theValue("July").into(By.name("birthMonth")),
                Click.on(llenadoformulario.BDAY_INPUT),
                Enter.theValue("9").into(By.name("birthDay")),
                Click.on(llenadoformulario.BYEAR_INPUT),
                Enter.theValue("2000").into(By.name("birthYear")),
                Click.on(llenadoformulario.L_SPOKEN_INPUT),
                Enter.theValue("spa").into(By.cssSelector("input.ui-select-search")),
                Click.on(llenadoformulario. L_SPOKEN_INPUT2)
        );
        actor.attemptsTo(Click.on(llenadoformulario.PRESS_NEXT_LOCATION),
                Enter.theValue("Bogot").into(llenadoformulario.INPUT_CITY),
                Click.on(llenadoformulario.CITY_SELECTOR),
                Enter.theValue("50001").into(llenadoformulario.INPUT_ZIP),
                Click.on(llenadoformulario.PRESS_NEXT_DEVICES),
                Click.on(llenadoformulario.PRESS_LASTSTEP_BUTTON),
                Enter.theValue("FxhDJvkZqT8KfPB").into(llenadoformulario.PASSWORD),
                Enter.theValue("FxhDJvkZqT8KfPB").into(llenadoformulario.CONFIRMPASSWORD),
                Click.on(llenadoformulario.CHECK_BOX),
                Click.on(llenadoformulario.CHECK_BOX),
                Click.on(llenadoformulario.CHECK_BOX_ERROR),
                Click.on(llenadoformulario.CHECK_BOX_ERROR),
                Click.on(llenadoformulario.PRESS_COMPLETE_BUTTON)
        );

        actor.attemptsTo(Click.on(llenadoformulario.LOG_IN),
                Click.on(llenadoformulario.USER),
                Enter.theValue("Sergio9994@gmail.com").into(llenadoformulario.USER),
                Click.on(llenadoformulario.USER_PASS),
                Enter.theValue("FxhDJvkZqT8KfPB").into(llenadoformulario.USER_PASS)

        );

        actor.attemptsTo(Click.on(llenadoformulario.SIGN_IN)

        );
    }
}
