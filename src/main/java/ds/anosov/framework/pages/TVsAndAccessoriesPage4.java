package ds.anosov.framework.pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class TVsAndAccessoriesPage4 extends BasePage {

    @FindBy(xpath = "//h1")
    private WebElement tVsAndAccessoriesTitle;

    @FindBy(xpath = "//div[contains(@data-zone-data,'/catalog--')]")
    private List<WebElement> listMenuSection;

    public TVsAndAccessoriesPage4 checkOpenTvsAndAccessoriesPage(String pageName) {
        switchToWindow();
        wait.until(visibilityOf(tVsAndAccessoriesTitle));
        Assertions.assertTrue(tVsAndAccessoriesTitle.getText().contains(pageName),
                "Страница не открылась/открылась не правильная страница");
        return this;
    }

    public TVsPage5 selectTvMenuSection(String sectionName) {
        for (WebElement item: listMenuSection) {
            if (item.getText().contains(sectionName)) {
                waitUtilElementToBeClickable(item).click();
                return pageManager.getTVsPage5();
            }
        }
        return pageManager.getTVsPage5();
    }

}
