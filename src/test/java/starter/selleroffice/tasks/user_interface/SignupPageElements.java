package starter.selleroffice.tasks.user_interface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SignupPageElements {

    public static Target USERNAME_FIELD = Target.the("username textbox").located(By.id("usernameInputText"));
    public static Target PASSWORD_FIELD = Target.the("pass textbox").located(By.id("passwordInputText"));
    public static Target PASSWORDRETYPE_FIELD = Target.the("passretype textbox").located(By.id("passwordRetypeInputText"));
    public static Target EMAIL_FIELD = Target.the("email textbox").located(By.id("emailInputText"));
    public static Target EMAILRETYPE_FIELD = Target.the("emailretype textbox").located(By.id("emailRetypeInputText"));
    public static Target STORE_FIELD = Target.the("store textbox").located(By.id("nicknameInputText"));
    public static Target SIGNUP_BTN = Target.the("signup btn").located(By.id("j_id275_j_id_dk"));
}
