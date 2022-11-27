package co.com.choucair.certification.utestprueba.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class Complete {
    public static final Target PASSWORD = Target.the("create your uTest password").
            locatedBy("//input[@id=\"password\"]");

    public static final Target CONFIRMPASS = Target.the("confirm your password").
            locatedBy("//input[@id=\"confirmPassword\"]");


    public static final Target CHECKONE = Target.the("check one").
            locatedBy("//span[@class=\"checkmark signup-consent__checkbox error\"]");
    public static final Target CHECKTWO = Target.the("check two").
            locatedBy("//span[@ng-class=\"{error: userForm.privacySetting.$error.required}\"]");

    public static final Target COMPLETE = Target.the("complete setup").
            locatedBy("//a[@aria-label=\"Complete Setup\"]");

    //a[@aria-label="Complete Setup"]
}
