package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class HomePage {
    private WebDriver driver;
    OrderPage orderPage = new OrderPage(driver);
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }
    public String site = "https://qa-scooter.praktikum-services.ru/";   //ссылка на сайт
    public void openSite() {    //открытие сайта
        driver.get(site);
    }
    public By scrollQuestions = By.id("accordion__heading-0"); //Локатор блока FAQ
    public By QuestionOne = By.xpath(".//div[@aria-controls='accordion__panel-0']"); //Локатор для первого вопроса
    public By QuestionTwo = By.xpath(".//div[@aria-controls='accordion__panel-1']"); //Локатор для второго вопроса
    public By QuestionThree = By.xpath(".//div[@aria-controls='accordion__panel-2']"); //Локатор для третьего вопроса
    public By QuestionFour = By.xpath(".//div[@aria-controls='accordion__panel-3']"); //Локатор для четвертого вопроса
    public By QuestionFive = By.xpath(".//div[@aria-controls='accordion__panel-4']"); //Локатор для пятого вопроса
    public By QuestionSix = By.xpath(".//div[@aria-controls='accordion__panel-5']"); //Локатор для шестого вопроса
    public By QuestionSeven = By.xpath(".//div[@aria-controls='accordion__panel-6']"); //Локатор для седьмого вопроса
    public By QuestionEight = By.xpath(".//div[@aria-controls='accordion__panel-7']"); //Локатор для восьмого вопроса
    public String QuestionOneText = "Сутки — 400 рублей. Оплата курьеру — наличными или картой.";
    public String QuestionTwoText = "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.";
    public String QuestionThreeText = "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.";
    public String QuestionFourText = "Только начиная с завтрашнего дня. Но скоро станем расторопнее.";
    public String QuestionFiveText = "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.";
    public String QuestionSixText = "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.";
    public String QuestionSevenText = "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.";
    public String QuestionEightText = "Да, обязательно. Всем самокатов! И Москве, и Московской области.";

    public void scrollQuestions() { //скролл до элемента FAQ
        WebElement element = driver.findElement(scrollQuestions);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
    }
    public void standBy(By element) { //Ожидание
        (new WebDriverWait(driver, Duration.ofSeconds(10)))
                .until(ExpectedConditions.presenceOfElementLocated(element));
    }
    public void clickButtonOneQuestion() {    //Кликаем по первому вопросу
        standBy(QuestionOne);
        driver.findElement(QuestionOne).click();
    }
    public void clickButtonTwoQuestion() {    //Кликаем по второму вопросу
        standBy(QuestionTwo);
        driver.findElement(QuestionTwo).click();
    }
    public void clickButtonThreeQuestion() {    //Кликаем по третьему вопросу
        standBy(QuestionThree);
        driver.findElement(QuestionThree).click();
    }
    public void clickButtonFourQuestion() {    //Кликаем по четвертому вопросу
        standBy(QuestionFour);
        driver.findElement(QuestionFour).click();
    }
    public void clickButtonFiveQuestion() {    //Кликаем по пятому вопросу
        standBy(QuestionFive);
        driver.findElement(QuestionFive).click();
    }
    public void clickButtonSixQuestion() {    //Кликаем по шестому вопросу
        standBy(QuestionSix);
        driver.findElement(QuestionSix).click();
    }
    public void clickButtonSevenQuestion() {    //Кликаем по седьмому вопросу
        standBy(QuestionSeven);
        driver.findElement(QuestionSeven).click();
    }
    public void clickButtonEightQuestion() {    //Кликаем по восьмому вопросу
        standBy(QuestionEight);
        driver.findElement(QuestionEight).click();
    }
}
