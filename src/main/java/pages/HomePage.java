package pages;

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
    public By questionOne = By.xpath(".//div[@aria-controls='accordion__panel-0']"); //Локатор для первого вопроса
    public By questionTwo = By.xpath(".//div[@aria-controls='accordion__panel-1']"); //Локатор для второго вопроса
    public By questionThree = By.xpath(".//div[@aria-controls='accordion__panel-2']"); //Локатор для третьего вопроса
    public By questionFour = By.xpath(".//div[@aria-controls='accordion__panel-3']"); //Локатор для четвертого вопроса
    public By questionFive = By.xpath(".//div[@aria-controls='accordion__panel-4']"); //Локатор для пятого вопроса
    public By questionSix = By.xpath(".//div[@aria-controls='accordion__panel-5']"); //Локатор для шестого вопроса
    public By questionSeven = By.xpath(".//div[@aria-controls='accordion__panel-6']"); //Локатор для седьмого вопроса
    public By questionEight = By.xpath(".//div[@aria-controls='accordion__panel-7']"); //Локатор для восьмого вопроса
    private String answerOne = ".//div[@id='accordion__panel-0']/p";
    private String answerTwo = ".//div[@id='accordion__panel-1']/p";
    private String answerThree = ".//div[@id='accordion__panel-2']/p";
    private String answerFour = ".//div[@id='accordion__panel-3']/p";
    private String answerFive = ".//div[@id='accordion__panel-4']/p";
    private String answerSix = ".//div[@id='accordion__panel-5']/p";
    private String answerSeven = ".//div[@id='accordion__panel-6']/p";
    private String answerEight = ".//div[@id='accordion__panel-7']/p";
    public String questionOneText = "Сутки — 400 рублей. Оплата курьеру — наличными или картой.";
    public String questionTwoText = "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.";
    public String questionThreeText = "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.";
    public String questionFourText = "Только начиная с завтрашнего дня. Но скоро станем расторопнее.";
    public String questionFiveText = "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.";
    public String questionSixText = "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.";
    public String questionSevenText = "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.";
    public String questionEightText = "Да, обязательно. Всем самокатов! И Москве, и Московской области.";

    public void scrollQuestions() { //скролл до элемента FAQ
        WebElement element = driver.findElement(scrollQuestions);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
    }

    public void standBy(By element) { //Ожидание
        (new WebDriverWait(driver, Duration.ofSeconds(10))).until(ExpectedConditions.presenceOfElementLocated(element));
    }

    public void clickButtonOneQuestion() {    //Кликаем по первому вопросу
        standBy(questionOne);
        driver.findElement(questionOne).click();
    }

    public void clickButtonTwoQuestion() {    //Кликаем по второму вопросу
        standBy(questionTwo);
        driver.findElement(questionTwo).click();
    }

    public void clickButtonThreeQuestion() {    //Кликаем по третьему вопросу
        standBy(questionThree);
        driver.findElement(questionThree).click();
    }

    public void clickButtonFourQuestion() {    //Кликаем по четвертому вопросу
        standBy(questionFour);
        driver.findElement(questionFour).click();
    }

    public void clickButtonFiveQuestion() {    //Кликаем по пятому вопросу
        standBy(questionFive);
        driver.findElement(questionFive).click();
    }

    public void clickButtonSixQuestion() {    //Кликаем по шестому вопросу
        standBy(questionSix);
        driver.findElement(questionSix).click();
    }

    public void clickButtonSevenQuestion() {    //Кликаем по седьмому вопросу
        standBy(questionSeven);
        driver.findElement(questionSeven).click();
    }

    public void clickButtonEightQuestion() {    //Кликаем по восьмому вопросу
        standBy(questionEight);
        driver.findElement(questionEight).click();
    }

    public String getTextQuestionOne() { // метод получения текста первого вопроса
        return driver.findElement(By.xpath(answerOne)).getAttribute("innerHTML");
    }

    public String getTextQuestionTwo() { // метод получения текста второго вопроса
        return driver.findElement(By.xpath(answerTwo)).getAttribute("innerHTML");
    }

    public String getTextQuestionThree() { // метод получения текста третьего вопроса
        return driver.findElement(By.xpath(answerThree)).getAttribute("innerHTML");
    }

    public String getTextQuestionFour() { // метод получения текста четвертого вопроса
        return driver.findElement(By.xpath(answerFour)).getAttribute("innerHTML");
    }

    public String getTextQuestionFive() { // метод получения текста пятого вопроса
        return driver.findElement(By.xpath(answerFive)).getAttribute("innerHTML");
    }

    public String getTextQuestionSix() { // метод получения текста шестого вопроса
        return driver.findElement(By.xpath(answerSix)).getAttribute("innerHTML");
    }

    public String getTextQuestionSeven() { // метод получения текста седьмого вопроса
        return driver.findElement(By.xpath(answerSeven)).getAttribute("innerHTML");
    }

    public String getTextQuestionEight() { // метод получения текста восьмого вопроса
        return driver.findElement(By.xpath(answerEight)).getAttribute("innerHTML");
    }
}
