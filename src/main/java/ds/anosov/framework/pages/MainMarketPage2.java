package ds.anosov.framework.pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.List;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class MainMarketPage2 extends BasePage {

    @FindBy(xpath = "//button[@data-testid='submit']")
    private WebElement capture;

    @FindBy(xpath = "//a[@id='logoPartMarket']")
    private WebElement mainMarketLogoTitle;

    @FindBy(xpath = "//div[@data-zone-name='category-link']")
    private List<WebElement> listCategoryMenu;

    //Если появится снова КАПЧА :(
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

    //Выбор раздела Электроника ElectronicsPage3
    public ElectronicsPage3 selectCategoryMenu(String categoryMainMenu) {
        for (WebElement item : listCategoryMenu) {
            if(item.getText().contains(categoryMainMenu))
                waitUtilElementToBeClickable(item).click();
            return pageManager.getElectronicsPage();

        }
        Assertions.fail("Меню '" + categoryMainMenu + "' не найдено!");
        return pageManager.getElectronicsPage();
    }
}
