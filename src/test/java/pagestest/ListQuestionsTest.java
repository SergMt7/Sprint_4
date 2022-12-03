package pagestest;

import pages.HomePage;
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
        assertEquals(homePage.questionOneText, homePage.getTextQuestionOne());//сравнить текст первого вопроса
    }

    @Test
    public void testQuestionTwo() {
        driver = new ChromeDriver();
        HomePage homePage = new HomePage(driver);
        driver.manage().window().maximize();
        homePage.openSite();
        homePage.scrollQuestions();
        homePage.clickButtonTwoQuestion();
        assertEquals(homePage.questionTwoText, homePage.getTextQuestionTwo()); //сравнить текст второго вопроса
    }

    @Test
    public void testQuestionThree() {
        driver = new ChromeDriver();
        HomePage homePage = new HomePage(driver);
        driver.manage().window().maximize();
        homePage.openSite();
        homePage.scrollQuestions();
        homePage.clickButtonThreeQuestion();
        assertEquals(homePage.questionThreeText, homePage.getTextQuestionThree()); //сравнить текст третьего вопроса
    }

    @Test
    public void testQuestionFour() {
        driver = new ChromeDriver();
        HomePage homePage = new HomePage(driver);
        driver.manage().window().maximize();
        homePage.openSite();
        homePage.scrollQuestions();
        homePage.clickButtonFourQuestion();
        assertEquals(homePage.questionFourText, homePage.getTextQuestionFour()); //сравнить текст четвертого вопроса
    }

    @Test
    public void testQuestionFive() {
        driver = new ChromeDriver();
        HomePage homePage = new HomePage(driver);
        driver.manage().window().maximize();
        homePage.openSite();
        homePage.scrollQuestions();
        homePage.clickButtonFiveQuestion();
        assertEquals(homePage.questionFiveText, homePage.getTextQuestionFive()); //сравнить текст пятого вопроса
    }

    @Test
    public void testQuestionSix() {
        driver = new ChromeDriver();
        HomePage homePage = new HomePage(driver);
        driver.manage().window().maximize();
        homePage.openSite();
        homePage.scrollQuestions();
        homePage.clickButtonSixQuestion();
        assertEquals(homePage.questionSixText, homePage.getTextQuestionSix()); //сравнить текст шестого вопроса
    }

    @Test
    public void testQuestionSeven() {
        driver = new ChromeDriver();
        HomePage homePage = new HomePage(driver);
        driver.manage().window().maximize();
        homePage.openSite();
        homePage.scrollQuestions();
        homePage.clickButtonSevenQuestion();
        assertEquals(homePage.questionSevenText, homePage.getTextQuestionSeven()); //сравнить текст седьмого вопроса
    }

    @Test
    public void testQuestionEight() {
        driver = new ChromeDriver();
        HomePage homePage = new HomePage(driver);
        driver.manage().window().maximize();
        homePage.openSite();
        homePage.scrollQuestions();
        homePage.clickButtonEightQuestion();
        assertEquals(homePage.questionEightText, homePage.getTextQuestionEight()); //сравнить текст восьмого вопроса
    }

    @After
    public void teardown() {
        driver.quit();
    }
}
