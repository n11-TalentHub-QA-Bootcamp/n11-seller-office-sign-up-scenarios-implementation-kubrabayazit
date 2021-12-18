package starter.selleroffice.tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import starter.selleroffice.tasks.user_interface.SellerOfficeHomePage;

public class NavigateTo {

    public static Performable theSellerofficeSignupPage() {
        return Task.where("{0} opens the selleroffice signup page",
                Open.browserOn().the(SellerOfficeHomePage.class));
    }
}
