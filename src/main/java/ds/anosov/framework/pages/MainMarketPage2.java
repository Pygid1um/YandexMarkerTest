package ds.anosov.framework.pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class MainMarketPage2 extends BasePage {

    @FindBy(xpath = "//button[@data-testid='submit']")
    private WebElement capture;

    @FindBy(xpath = "//a[@id='logoPartMarket']")
    private WebElement mainMarketLogoTitle;

    @FindBy(xpath = "//div[contains(@data-zone-name, 'menu')]//span[text()='Электроника']")
    private WebElement listCategoryMenu;

    //Для КАПЧИ :(
//    public MainMarketPage2 faf() {
//        //driverManager.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//        // Thread.sleep(25000);
//        if (capture.isDisplayed())
//            waitUtilElementToBeClickable(capture);
//        return this;
//
//    }

    public MainMarketPage2 checkOpenMainMarketPage(String pageName) {
        switchToWindow();
        wait.until(visibilityOf(mainMarketLogoTitle));
        Assertions.assertTrue(mainMarketLogoTitle.getText().contains(pageName),
                "Страница не открылась/открылась не правильная страница");
        return this;
    }


    public ElectronicsPage3 selectCategoryMenu() {
        waitUtilElementToBeClickable(listCategoryMenu).click();
       return pageManager.getElectronicsPage();
    }
}
