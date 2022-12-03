package PagesTest;

import Pages.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ListQuestionsTest {

    private WebDriver driver;

    @Test
    public void testQuestionOne() {
        driver = new ChromeDriver();
        HomePage homePage = new HomePage(driver);
        driver.manage().window().maximize();
        homePage.openSite();
        homePage.scrollQuestions();
        homePage.clickButtonOneQuestion();
        assertEquals(homePage.QuestionOneText, driver.findElement(By.id("accordion__panel-0")).getText()); //сравнить текст первого вопроса
    }
    @Test
    public void testQuestionTwo() {
        driver = new ChromeDriver();
        HomePage homePage = new HomePage(driver);
        driver.manage().window().maximize();
        homePage.openSite();
        homePage.scrollQuestions();
        homePage.clickButtonTwoQuestion();
        assertEquals(homePage.QuestionTwoText, driver.findElement(By.id("accordion__panel-1")).getText()); //сравнить текст второго вопроса
    }
    @Test
    public void testQuestionThree() {
        driver = new ChromeDriver();
        HomePage homePage = new HomePage(driver);
        driver.manage().window().maximize();
        homePage.openSite();
        homePage.scrollQuestions();
        homePage.clickButtonThreeQuestion();
        assertEquals(homePage.QuestionThreeText, driver.findElement(By.id("accordion__panel-2")).getText()); //сравнить текст третьего вопроса
    }
    @Test
    public void testQuestionFour() {
        driver = new ChromeDriver();
        HomePage homePage = new HomePage(driver);
        driver.manage().window().maximize();
        homePage.openSite();
        homePage.scrollQuestions();
        homePage.clickButtonFourQuestion();
        assertEquals(homePage.QuestionFourText, driver.findElement(By.id("accordion__panel-3")).getText()); //сравнить текст четвертого вопроса
    }
    @Test
    public void testQuestionFive() {
        driver = new ChromeDriver();
        HomePage homePage = new HomePage(driver);
        driver.manage().window().maximize();
        homePage.openSite();
        homePage.scrollQuestions();
        homePage.clickButtonFiveQuestion();
        assertEquals(homePage.QuestionFiveText, driver.findElement(By.id("accordion__panel-4")).getText()); //сравнить текст пятого вопроса
    }
    @Test
    public void testQuestionSix() {
        driver = new ChromeDriver();
        HomePage homePage = new HomePage(driver);
        driver.manage().window().maximize();
        homePage.openSite();
        homePage.scrollQuestions();
        homePage.clickButtonSixQuestion();
        assertEquals(homePage.QuestionSixText, driver.findElement(By.id("accordion__panel-5")).getText()); //сравнить текст шестого вопроса
    }
    @Test
    public void testQuestionSeven() {
        driver = new ChromeDriver();
        HomePage homePage = new HomePage(driver);
        driver.manage().window().maximize();
        homePage.openSite();
        homePage.scrollQuestions();
        homePage.clickButtonSevenQuestion();
        assertEquals(homePage.QuestionSevenText, driver.findElement(By.id("accordion__panel-6")).getText()); //сравнить текст седьмого вопроса
    }
    @Test
    public void testQuestionEight() {
        driver = new ChromeDriver();
        HomePage homePage = new HomePage(driver);
        driver.manage().window().maximize();
        homePage.openSite();
        homePage.scrollQuestions();
        homePage.clickButtonEightQuestion();
        assertEquals(homePage.QuestionEightText, driver.findElement(By.id("accordion__panel-7")).getText()); //сравнить текст восьмого вопроса
    }
    @After
    public void teardown() {
        driver.quit();
    }











}
