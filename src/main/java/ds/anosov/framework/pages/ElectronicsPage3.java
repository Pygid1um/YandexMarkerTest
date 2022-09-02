package ds.anosov.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class ElectronicsPage3 extends BasePage {

    @FindBy(tagName = "//h3[text()='Электроника']")
    private WebElement title;

    @FindBy(xpath = "//a[contains(@href, '26960170')]")
    private WebElement TvsAndAccessoriesMenu;

    @FindBy(xpath = "//a[contains(@href, '26992071')]")
    private WebElement HeadphonesAndAudioEquipmentMenu;


    public ElectronicsPage3 checkOpenElectronicsPage() {
        switchToWindow();
        wait.until(visibilityOf(title));
        assertTrue(title.getText().contains("Электроника"),
                "Страница не открылась/открылась не правильная страница");
        return this;
    }

    public TVsAndAccessoriesPage4 selectTvsAndAccessoriesMenu() {
        waitUtilElementToBeClickable(TvsAndAccessoriesMenu).click();
        return pageManager.getTVsAndAccessoriesPage();
    }

    public HeadphonesAndAudioEquipmentPage9 selectHeadphonesAndAudioEquipmentPage() {
        waitUtilElementToBeClickable(HeadphonesAndAudioEquipmentMenu).click();
        return pageManager.getHeadphonesAndAudioEquipmentPage9();
    }

}
