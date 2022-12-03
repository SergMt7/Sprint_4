package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderPage {

    private WebDriver driver;

    public OrderPage(WebDriver driver) {
        this.driver = driver;

    }

    public String siteOrder = "https://qa-scooter.praktikum-services.ru/order"; // Ссылка на страницу заказа
    public By orderButton = By.xpath(".//button[(@class = 'Button_Button__ra12g' and (text()='Заказать'))]");   //Локатор кнопки "Заказать" в верхнем углу страницы
    public By nameOrder = By.xpath(".//input[@placeholder='* Имя']");   //Локатор поля Имя
    public By surnameOrder = By.xpath(".//input[@placeholder='* Фамилия']");    //Локатор поля Фамилия
    public By addressOrder = By.xpath(".//input[@placeholder='* Адрес: куда привезти заказ']"); //Локатор поля Адрес
    public By stationOrder = By.xpath(".//input[@placeholder='* Станция метро']");  //Локатор поля Станция метро
    public By telephoneOrder = By.xpath(".//input[@placeholder='* Телефон: на него позвонит курьер']"); //Локатор поля Телефон
    public By nextOrderButton = By.xpath(".//button[@class ='Button_Button__ra12g Button_Middle__1CSJM']"); //Локатор кнопки Далее
    public By whenOrder = By.xpath(".//input[@placeholder='* Когда привезти самокат']");    //Локатор поля даты заказа
    public By dateOrder = By.xpath(".//div[contains(@class, 'react-datepicker__day') and (@tabindex='0')]");    //Локатор сегодняшней даты
    public By periodOrder = By.className("Dropdown-placeholder");   //Локатор поля срок аренды
    public By periodOrderDay = By.xpath(".//div[@class='Dropdown-option'][4]"); //Локатор срока аренды
    public By colorScooterBlack = By.xpath("//*[@id='black']"); //Локатор Черный цвет самоката
    public By colorScooterGrey = By.xpath("//*[@id='grey']");   //Локатор Серый цвет самоката
    public By commentOrder = By.xpath(".//input[@placeholder='Комментарий для курьера']");  //Локатор комментария по доставке
    public By yesButton = By.xpath(".//button[(@class = 'Button_Button__ra12g Button_Middle__1CSJM' and (text()='Да'))]");  //Локатор кнопки Да в заказе
    public By finishOrderWindow = By.xpath(".//div[@class = 'Order_ModalHeader__3FDaJ']");  //Локатор текса модального окна успешного оформления
    public By downOrderButton = By.xpath(".//div[@class='Home_FinishButton__1_cWm']/button");   //Локатор кнопки "Заказать" внизу страницы
    public String currentUrl = "https://qa-scooter.praktikum-services.ru/order"; // Ссылка на страницу заказа
    public By dateOrderNextMonth = By.xpath(".//button[@aria-label ='Next Month']");    //Локатор кнопки следующего месяца

    public void clickOrderButton() {
        driver.findElement(orderButton).click();
    }

    public void fillName(String name) {
        driver.findElement(nameOrder).sendKeys(name);
    }

    public void fillSurname(String surname) {
        driver.findElement(surnameOrder).sendKeys(surname);
    }

    public void fillAddressOrder(String address) {
        driver.findElement(addressOrder).sendKeys(address);
    }

    public void fillStationOrder(By station) {   //метод заполнения станции
        driver.findElement(stationOrder).click();
        driver.findElement(station).click();
    }

    public void fillTelephoneOrder(String telephone) {   //метод заполнения телефона
        driver.findElement(telephoneOrder).sendKeys(telephone);
    }

    public void clickNextOrderButton() {    //метод нажатия на кнопку Далее
        driver.findElement(nextOrderButton).click();
    }

    public void setDate() { //метод заполнения сегодняшней даты
        driver.findElement(whenOrder).click();
        driver.findElement(dateOrder).click();
    }

    public void setDateOrderNextMonth() { //метод заполнения даты следующего месяца
        driver.findElement(whenOrder).click();
        driver.findElement(dateOrderNextMonth).click();
        driver.findElement(dateOrder).click();
    }

    public void setPeriod(By periodOrderDay) { //метод срока аренды
        driver.findElement(periodOrder).click();
        driver.findElement(periodOrderDay).click();
    }

    public void setScooterBlack(By colorScooterBlack) { //метод выбора цвета самоката
        driver.findElement(colorScooterBlack).click();
    }

    public void setScooterGrey(By colorScooterGrey) { //метод выбора цвета самоката
        driver.findElement(colorScooterGrey).click();
    }

    public void fillComment(String comment) { //метод записи комментария
        driver.findElement(commentOrder).sendKeys(comment);
    }

    public void clickYesButton() {  //метод клика по кнопке Да в заказе
        driver.findElement(yesButton).click();
    }

    public String getTextWindowSuccessfulOrder() { // метод возврата текста окна завершения заказа
        return driver.findElement(finishOrderWindow).getText();
    }

    public void clickDownOrderButton() {    //Нажатие на кнопку Заказать внизу
        driver.findElement(downOrderButton).click();
    }

    public String currentUrl() {    //Получение URL текущей страницы
        return driver.getCurrentUrl();
    }
}
