package ds.anosov.framework.pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.List;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;


public class MainYandexPage1 extends BasePage {


    @FindBy(xpath = "//div[@class='home-logo home-arrow__logo']")
    private WebElement mainPageLogoTitle;

    @FindBy(xpath = "//a[contains(@class, 'home-link services-new__item')]")
    private List<WebElement> listMainMenu;


    //"Выбор основного меню на главной странице"
    public MainMarketPage2 selectMainMenu(String nameMainMenu) {
        wait.until(visibilityOf(mainPageLogoTitle));
        for (WebElement itemMenu : listMainMenu) {
            if(itemMenu.getText().contains(nameMainMenu)){
                waitUtilElementToBeClickable(itemMenu).click();
                return pageManager.getMainMarketPage();
            }
        }
        Assertions.fail("Меню '" + nameMainMenu + "' не найдено на странице!");
       return pageManager.getMainMarketPage();
    }
}
