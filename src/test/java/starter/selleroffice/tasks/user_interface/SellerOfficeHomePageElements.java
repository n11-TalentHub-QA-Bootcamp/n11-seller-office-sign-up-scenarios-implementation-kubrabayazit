package starter.selleroffice.tasks.user_interface;

import net.serenitybdd.screenplay.targets.Target;

public class SellerOfficeHomePageElements {

    public static Target SIGNUP_LINK =
            Target.the("signup link")
                    .locatedBy(".ui-message-error-detail");


}
