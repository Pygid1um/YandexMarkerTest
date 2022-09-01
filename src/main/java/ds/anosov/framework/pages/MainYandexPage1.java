package ds.anosov.framework.pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;


public class MainYandexPage1 extends BasePage {

    @FindBy(xpath = "//a[contains(@class, 'home-link services-new__item')]")
    private List<WebElement> listMainMenu;

    public MainMarketPage2 selectMainMenu(String nameMainMenu) {
        for (WebElement itemMenu : listMainMenu) {
            if (itemMenu.getText().contains(nameMainMenu)) {
                waitUtilElementToBeClickable(itemMenu).click();
                return pageManager.getMainMarketPage();
            }
        }
        Assertions.fail("Меню '" + nameMainMenu + "' не найдено на странице!");
        return pageManager.getMainMarketPage();
    }
}
