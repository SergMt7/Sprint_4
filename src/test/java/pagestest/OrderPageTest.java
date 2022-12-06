package pagestest;

import pages.HomePage;
import pages.OrderPage;
import org.hamcrest.MatcherAssert;
import static org.junit.Assert.assertEquals;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.hamcrest.CoreMatchers.startsWith;

public class OrderPageTest {

    private WebDriver driver;
    private String name = "Вася";
    private String surname = "Петров";
    private String address = "г. Москва, ул. Большая, д.1";
    private By station1 = By.xpath(".//button[@value='1']"); //Станция метро выбор 1
    private By station2 = By.xpath(".//button[@value='2']"); //Станция метро выбор 2
    private String telephone = "+70001234567";
    private String comment = "Комментарий к доставке";
    private String expectedTextSuccessOrder = "Заказ успешно оформлен";

    @Test
    public void order() {
        driver = new ChromeDriver();
        HomePage homePage = new HomePage(driver);
        OrderPage orderPage = new OrderPage(driver);
        driver.manage().window().maximize();
        homePage.openSite();
        orderPage.clickOrderButton();
        orderPage.fillName(name);
        orderPage.fillSurname(surname);
        orderPage.fillAddressOrder(address);
        orderPage.fillStationOrder(station1);
        orderPage.fillTelephoneOrder(telephone);
        orderPage.clickNextOrderButton();
        orderPage.setDate();
        orderPage.setPeriod(orderPage.periodOrderDay);
        orderPage.setScooterBlack(orderPage.colorScooterBlack);
        orderPage.fillComment(comment);
        orderPage.clickNextOrderButton();
        orderPage.clickYesButton();
        String actualTextSuccessOrder = orderPage.getTextWindowSuccessfulOrder();
        MatcherAssert.assertThat("Статус заказа неверный", actualTextSuccessOrder, startsWith(expectedTextSuccessOrder));
    }

    @Test
    public void orderDown() {
        driver = new ChromeDriver();
        HomePage homePage = new HomePage(driver);
        OrderPage orderPage = new OrderPage(driver);
        homePage.openSite();
        homePage.scrollQuestions();
        orderPage.clickDownOrderButton();
        assertEquals("Url по нижней кнопке заказа отличается", orderPage.siteOrder, orderPage.currentUrl);

    }

    @Test
    public void orderOther() {
        driver = new ChromeDriver();
        HomePage homePage = new HomePage(driver);
        OrderPage orderPage = new OrderPage(driver);
        driver.manage().window().maximize();
        homePage.openSite();
        orderPage.clickOrderButton();
        orderPage.fillName(name);
        orderPage.fillSurname(surname);
        orderPage.fillAddressOrder(address);
        orderPage.fillStationOrder(station2);
        orderPage.fillTelephoneOrder(telephone);
        orderPage.clickNextOrderButton();
        orderPage.setDateOrderNextMonth();
        orderPage.setPeriod(orderPage.periodOrderDay);
        orderPage.setScooterGrey(orderPage.colorScooterGrey);
        orderPage.fillComment(comment);
        orderPage.clickNextOrderButton();
        orderPage.clickYesButton();
        String actualTextSuccessOrder = orderPage.getTextWindowSuccessfulOrder();
        MatcherAssert.assertThat("Статус заказа неверный", actualTextSuccessOrder, startsWith(expectedTextSuccessOrder));
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}