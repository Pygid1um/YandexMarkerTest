package ds.anosov.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class TVsAndAccessoriesPage4 extends BasePage {


    @FindBy(xpath = "//h1")
    private WebElement tVsAndAccessoriesTitle;

    @FindBy(xpath = "//div[contains(@data-zone-data,'/catalog--')]")
    private List<WebElement> listMenuSection;


    public TVsPage5 selectTvMenuSection(String sectionName) {
        wait.until(visibilityOf(tVsAndAccessoriesTitle));
        for (WebElement item: listMenuSection) {
            if (item.getText().contains(sectionName)) {
                waitUtilElementToBeClickable(item).click();
                return pageManager.getTVsPage5();
            }
        }
        return pageManager.getTVsPage5();
    }

}
