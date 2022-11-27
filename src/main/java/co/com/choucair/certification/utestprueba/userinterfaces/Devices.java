package co.com.choucair.certification.utestprueba.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class Devices {
    public static final Target COMPUTER = Target.the("your computer").
            locatedBy("(//span[@class=\"btn btn-default form-control ui-select-toggle\"])[1]");
    public static final Target VERSION = Target.the("version").
            locatedBy("(//span[@class=\"btn btn-default form-control ui-select-toggle\"])[2]");
    public static final Target LANGUAGE = Target.the("languaje").
            locatedBy("(//span[@class=\"btn btn-default form-control ui-select-toggle\"])[3]");

    public static final Target MOBILE = Target.the("your mobile device").
            locatedBy("(//span[@class=\"btn btn-default form-control ui-select-toggle\"])[4]");
    public static final Target APPLE = Target.the("apple").
            locatedBy("(//span[@class=\"ui-select-choices-row-inner\"])[3]");
    public static final Target MODEL = Target.the("model mobile").
            locatedBy("(//span[@class=\"btn btn-default form-control ui-select-toggle\"])[5]");
    public static final Target IPHONE5 = Target.the("iphone 5").
            locatedBy("(//span[@class=\"ui-select-choices-row-inner\"])[17]");
    public static final Target SYSTEM = Target.the("model mobile").
            locatedBy("(//span[@class=\"btn btn-default form-control ui-select-toggle\"])[5]");
    public static final Target IOS1002 = Target.the("iOS 10.0.2").
            locatedBy("(//span[@class=\"ui-select-choices-row-inner\"])[4]");


    public static final Target LASTSTEP = Target.the("button next to last step").
            locatedBy("//a[@class=\"btn btn-blue pull-right\"]");
}


