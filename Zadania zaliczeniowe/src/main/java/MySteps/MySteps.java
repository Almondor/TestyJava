package MySteps;


import Pages.*;
import Utils.Utils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class MySteps {

    WebDriver driver;


    @Given("User is on {string}")
    public void userIsOn(String url) {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
        driver.manage().window().maximize();
        driver.get(url);

    }

    @When("User click Sign in")
    public void userClickSignIn() {
        MainPage mainPage = new MainPage(driver);
        mainPage.signIn();
    }

    @And("User types valid Email and Password and press Sign in")
    public void userTypesValidEmailAndPasswordAndPressSignIn() {
        SignInPage signInPage = new SignInPage(driver);
        signInPage.loginUser();
    }






//  Zadanie 1 Dodanie nowego adresu

    @And("User click Addresses button")
    public void userClickAddressesButton() {
        AccountPage accountPage = new AccountPage(driver);
        accountPage.addresses();
    }


    @And("User click Add a new address tile")
    public void userClickAddANewAddressTile() {
        AddressesPage addressesPage = new AddressesPage(driver);
        addressesPage.newAddress();

    }

    @And("User input {string} and {string} and {string} and {string} and {string} and {string}")
    public void userInputAndAndAndAndAnd(String alias, String address, String city, String zip, String country, String phone) {


        NewAddressPage newAddressPage = new NewAddressPage(driver);
        newAddressPage.newAddress(alias,address,city,zip,country,phone);


    }

    @Then("User has added new address")
    public void userHasAddedNewAddress() throws Exception {

        NewAddressPage newAddressPage = new NewAddressPage(driver);
        newAddressPage.Save();

    }




// Zadanie 1 Dodanie nowego adresu oraz jego usunięcie

    @And("User press save")
    public void userPressSave() {
        NewAddressPage newAddressPage = new NewAddressPage(driver);
        newAddressPage.Save();
    }

    @And("User deletes address")
    public void userDeletesAddress() {
        WebElement delete = driver.findElement(By.xpath("/html/body/main/section/div/div/section/section/div[1]/article/div[2]/a[2]"));
        delete.click();
    }

    @Then("User deleted address")
    public void userDeletedAddress() throws Exception {
        Utils utils = new Utils(driver);
        utils.takeSnapShot(driver,"C:\\Users\\Komputerek Adaś\\Desktop\\ScreanShots\\Usuwanie adresu.png");
    }



//  Zadanie 2 zakup swetra

    @And("User go to MainPage")
    public void userGoToMainPage() {
        AccountPage accountPage = new AccountPage(driver);
        accountPage.MainPage();
    }

    @And("User Choose Hummingbird Printed Sweater")
    public void userChooseHummingbirdPrintedSweater() {


        MainPage mainPage = new MainPage(driver);
        mainPage.Sweater();

    }

    @And("User Choose size {string}")
    public void userChooseSize(String size) {

        SweaterPage sweaterPage = new SweaterPage(driver);
        sweaterPage.size(size);

    }

    @And("User Choose {int} units")
    public void userChooseUnits(int a) {
        SweaterPage sweaterPage = new SweaterPage(driver);
        sweaterPage.ammount(a);
    }

    @And("User Adds items to basket")
    public void userAddsItemsToBasket() {
        SweaterPage sweaterPage = new SweaterPage(driver);
        sweaterPage.addBasket();
    }

    @And("User Checkout")
    public void userCheckout() {
        SweaterPage sweaterPage = new SweaterPage(driver);
        sweaterPage.checkout();
    }

    @And("User Checkout in basket")
    public void userCheckoutInBasket() {
        BasketPage basketPage = new BasketPage(driver);
        basketPage.Checkout();

    }

    @And("User Confirms Address")
    public void userConfirmsAddress() {
        AddressesCheckout addressesCheckout = new AddressesCheckout(driver);
        addressesCheckout.Continue();
    }

    @And("User Choose pick up in store")
    public void userChoose() {
        ShippingMethodPage shippingMethodPage = new ShippingMethodPage(driver);
        shippingMethodPage.Continue();
    }

    @And("User pays by check")
    public void userPaysByCheck() {

        PaymentPage paymentPage = new PaymentPage(driver);
        paymentPage.check();
        paymentPage.terms();

    }

    @And("User clicks order with and obligation to pay")
    public void userClicks() {
        PaymentPage paymentPage = new PaymentPage(driver);
        paymentPage.order();

    }

    @Then("User bought item")
    public void userBoughtItem() throws Exception {
        Utils utils = new Utils(driver);
        utils.takeSnapShot(driver,"C:\\Users\\Komputerek Adaś\\Desktop\\ScreanShots\\Status zamównienia.png");

    }

// Zadanie 2 Zakup swetra oraz sprawdzenie jego statusu
    @And("User bought item and checks it status")
    public void userBoughtItemAndChecksItStatus() {
        OrderPage orderPage = new OrderPage(driver);
        orderPage.AccountPage();
        AccountPage accountPage = new AccountPage(driver);
        accountPage.OrdersPage();
    }

    @Then("User has checked the order status")
    public void userHasCheckedTheOrderStatus() throws Exception {
        Utils utils = new Utils(driver);
        utils.takeSnapShot(driver,"C:\\Users\\Komputerek Adaś\\Desktop\\ScreanShots\\Historia zamówienia.png");
    }

    @And("User click create new account")
    public void userClickCreateNewAccount() {
        SignInPage signInPage = new SignInPage(driver);
        signInPage.newUser();
    }

    @And("User choose {string}")
    public void userChoose(String sex) {
        NewAccountPage newAccountPage = new NewAccountPage(driver);
        newAccountPage.sex(sex);
    }

    @And("User input first name")
    public void userInputFirstName() {
        NewAccountPage newAccountPage = new NewAccountPage(driver);
        newAccountPage.firstName();
    }

    @And("User input last name")
    public void userInputLastName() {
        NewAccountPage newAccountPage = new NewAccountPage(driver);
        newAccountPage.lastName();
    }

    @And("User input email")
    public void userInputEmail() {
        NewAccountPage newAccountPage = new NewAccountPage(driver);
        newAccountPage.email();
    }

    @And("User input password")
    public void userInputPassword() throws Exception {
        NewAccountPage newAccountPage = new NewAccountPage(driver);
        newAccountPage.password();
        WebElement show = driver.findElement(By.xpath("//*[@id=\"customer-form\"]/div/div[5]/div[1]/div/span/button"));
        show.click();
        Utils utils = new Utils(driver);
        utils.takeSnapShot(driver,"C:\\Users\\Komputerek Adaś\\Desktop\\ScreanShots\\Dane nowego konta.png");
    }

    @And("User click save")
    public void userClickSave() {
        NewAccountPage newAccountPage = new NewAccountPage(driver);
        newAccountPage.save();
    }

    @Then("User created new account")
    public void userCreatedNewAccount() {
        driver.quit();
    }

    @When("{string} create new account")
    public void createNewAccount(String sex) {
        MainPage mainPage = new MainPage(driver);
        mainPage.signIn();
        SignInPage signInPage = new SignInPage(driver);
        signInPage.newUser();
        NewAccountPage newAccountPage = new NewAccountPage(driver);
        newAccountPage.newUser(sex);
    }


    @And("User click account button")
    public void userClickAccountButton() {
        MainPage mainPage = new MainPage(driver);
        mainPage.accountPage();

    }

    @And("User click add first address")
    public void userClickAddFirstAddress() {
        AccountPage accountPage = new AccountPage(driver);
        accountPage.newAddress();
    }

    @And("User fills in the address details and press save")
    public void userFillsInTheAddressDetailsAndPressSave() throws Exception {
        NewAddressPage newAddressPage = new NewAddressPage(driver);
        newAddressPage.fullAddress();
        Utils utils = new Utils(driver);
        utils.takeSnapShot(driver,"C:\\Users\\Komputerek Adaś\\Desktop\\ScreanShots\\Adres nowego użytkownika.png");
        newAddressPage.Save();
    }

    @Then("User has added a new address")
    public void userHasAddedANewAddress() {
        driver.quit();
    }


}
