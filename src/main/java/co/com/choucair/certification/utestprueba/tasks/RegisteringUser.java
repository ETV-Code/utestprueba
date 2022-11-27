package co.com.choucair.certification.utestprueba.tasks;

import co.com.choucair.certification.utestprueba.userinterfaces.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class RegisteringUser implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
            Click.on(Home.REGISTER),

            SendKeys.of("Emmanuel").into(Personal.FIRSTNAME),
            SendKeys.of("Taborda").into(Personal.LASTNAME),
            SendKeys.of("taborda@gmail.com").into(Personal.EMAIL),
            SendKeys.of("october").into(Personal.MONTH),
            SendKeys.of("23").into(Personal.DAY),
            SendKeys.of("2002").into(Personal.YEAR),

            Click.on(Personal.NEXTLOCATION),
            Click.on(Address.BUTTONDEVICES),

            SendKeys.of("Windows").into(Devices.COMPUTER),
            SendKeys.of("10").into(Devices.VERSION),
            SendKeys.of("Spanish").into(Devices.LANGUAGE),
            Click.on(Devices.MOBILE), Click.on(Devices.APPLE),
            Click.on(Devices.MODEL), Click.on(Devices.IPHONE5),
            Click.on(Devices.SYSTEM), Click.on(Devices.IOS1002),

            Click.on(Devices.LASTSTEP),

            SendKeys.of("Utest0123456789").into(Complete.PASSWORD),
            SendKeys.of("Utest0123456789").into(Complete.CONFIRMPASS),
            Click.on(Complete.CHECKONE),
            Click.on(Complete.CHECKTWO),

            Click.on(Complete.COMPLETE)
        );
    }
    public static RegisteringUser makeInformation(){
        return instrumented(RegisteringUser.class);
    }
}
