package co.com.choucair.certification.utestprueba.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/register_user.feature",
glue = "co.com.choucair.certification.utestprueba.stepdefinitions",
snippets = CucumberOptions.SnippetType.CAMELCASE)

public class RegisterUser {
}
