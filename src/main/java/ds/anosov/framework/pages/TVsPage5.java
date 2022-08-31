package ds.anosov.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TVsPage5 extends BasePage {

    @FindBy(xpath = "//span[text()='Все фильтры']")
    private WebElement allFiltersButton;

    public FiltersPage6 clickAllFiltersButton() {
        switchToWindow();
        waitUtilElementToBeClickable(allFiltersButton).click();
        return pageManager.getFiltersPage6();
    }
}
