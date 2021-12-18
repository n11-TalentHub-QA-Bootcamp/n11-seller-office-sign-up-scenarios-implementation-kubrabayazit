package starter.selleroffice.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.Keys;
import starter.selleroffice.tasks.user_interface.SellerOfficeHomePageElements;
import starter.selleroffice.tasks.user_interface.SignupPageElements;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class SignupSellerOffice implements Task {

    private final String email_text;
    private final String emailretype_text;
    private final String password_text;
    private final String passwordretype_text;
    private final String username_text;
    private final String store_text;


    @Step("{0} Login with email '#email_text' and password '#password_text' and '#username_text'")
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(SellerOfficeHomePageElements.SIGNUP_LINK),
                WaitUntil.the(SignupPageElements.EMAIL_FIELD,isClickable()).forNoMoreThan(2).seconds(),
                Click.on(SignupPageElements.USERNAME_FIELD),
                SendKeys.of(this.username_text).into(SignupPageElements.USERNAME_FIELD),
                Click.on(SignupPageElements.PASSWORD_FIELD),
                SendKeys.of(this.password_text).into(SignupPageElements.PASSWORD_FIELD),
                Click.on(SignupPageElements.PASSWORDRETYPE_FIELD),
                SendKeys.of(this.passwordretype_text).into(SignupPageElements.PASSWORDRETYPE_FIELD),
                Click.on(SignupPageElements.EMAIL_FIELD),
                SendKeys.of(this.email_text).into(SignupPageElements.EMAIL_FIELD),
                Click.on(SignupPageElements.EMAILRETYPE_FIELD),
                SendKeys.of(this.emailretype_text).into(SignupPageElements.EMAILRETYPE_FIELD),
                Click.on(SignupPageElements.STORE_FIELD),
                SendKeys.of(this.store_text).into(SignupPageElements.STORE_FIELD)
                        .thenHit(Keys.ENTER)
        );

    }

    public SignupSellerOffice(String email_text, String password_text, String username_text, String passwordretype_text, String emailretype_text, String store_text ){
        this.email_text = email_text;
        this.emailretype_text = emailretype_text;
        this.password_text = password_text;
        this.passwordretype_text = passwordretype_text;
        this.username_text = username_text;
        this.store_text = store_text;


    }


    public SignupSellerOffice loginThePage (String email_text, String password_text, String username_text, String passwordretype_text, String emailretype_text, String store_text) {
        return instrumented(SignupSellerOffice.class
                ,email_text,password_text,username_text,emailretype_text,passwordretype_text,store_text);
    }
}
