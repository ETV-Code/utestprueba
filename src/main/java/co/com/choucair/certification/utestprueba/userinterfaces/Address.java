package co.com.choucair.certification.utestprueba.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class Address {

    public static final Target BUTTONDEVICES = Target.the("button next to devices").
            locatedBy("//a[@aria-label=\"Next step - select your devices\"]");
}

