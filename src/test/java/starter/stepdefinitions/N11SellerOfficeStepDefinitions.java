package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import starter.selleroffice.tasks.SignupSellerOffice;
import starter.selleroffice.tasks.NavigateTo;
import starter.selleroffice.tasks.user_interface.SellerOfficeHomePageElements;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.containsText;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.hasValue;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

public class N11SellerOfficeStepDefinitions {

    Actor actor = Actor.named("patikabootcampers");
    @Managed
    WebDriver webDriver;

    @Given("user launch browser and open the signup page")
    public void userLaunchBrowserAndOpenTheSignupPage() {
        actor.can(BrowseTheWeb.with(webDriver));
        actor.wasAbleTo(NavigateTo.theSellerofficeSignupPage());
    }

    @When("user registered in selleroffice with valid credentials")
    public void userRegisteredInSellerofficeWithValidCredentials() {
        actor.attemptsTo(SignupSellerOffice.);

    }

    @Then("user registered in selleroffice see the warning message")
    public void userRegisteredInSellerofficeSeeTheWarningMessage() {
        actor.attemptsTo(
                Ensure.that(SellerOfficeHomePageElements.SIGNUP_LINK).isDisplayed(),
                Ensure.that(SellerOfficeHomePageElements.SIGNUP_LINK).value().startsWith("Lütfen sözleşmeyi")

        );
    }
}
