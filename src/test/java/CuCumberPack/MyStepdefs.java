package CuCumberPack;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

/**
 * Created by Shristy Shikha on 31-05-2017.
 */
public class MyStepdefs {
    @Given("^user opens the page$")
    public void userOpensThePage() throws Throwable {

        System.out.println("I am in given "+'\n');
        //throw new PendingException();
    }

    @Then("^User enter the \"([^\"]*)\"$")
    public void userEnterTheLoginId(String uname) throws Throwable {

        System.out.println("My User is : " +uname +'\t');
        //throw new PendingException();
    }

    @Then("^User enters the \"([^\"]*)\"$")
    public void userEntersThePassword(String password) throws Throwable {
        System.out.println("My password is : "+password +'\n');
       //throw new PendingException();
    }

    @And("^Click on sign in button$")
    public void clickOnSignInButton() throws Throwable {
        System.out.println("Here i am innn"+'\t');
        //throw new PendingException();
    }

    @And("^close the browser$")
    public void closeTheBrowser() throws Throwable {
        System.out.println("Bye close" +'\n');
        //throw new PendingException();
    }
}
