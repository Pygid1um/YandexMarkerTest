package ds.anosov.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ElectronicsPage3 extends BasePage {


    @FindBy(xpath = "//div[@data-tid=66fc8fcb]")
    private List<WebElement> listElectronicsMenu;

    //если не найдет, можно просто кликнуть по кнопке ТВ (захардкодить)
    public TVsAndAccessoriesPage4 selectElectronicsMenu(String electronicsMenu) {
        for ( WebElement item : listElectronicsMenu) {
            if (item.getText().contains(electronicsMenu)) {
                waitUtilElementToBeClickable(item).click();
                return pageManager.getTVsAndAccessoriesPage();
            }
        }
        return pageManager.getTVsAndAccessoriesPage();
    }

}
//TVsAndAccessoriesPage4