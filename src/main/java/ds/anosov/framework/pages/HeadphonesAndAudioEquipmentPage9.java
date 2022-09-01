package ds.anosov.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class HeadphonesAndAudioEquipmentPage9 extends BasePage {

    @FindBy(tagName = "h1")
    private WebElement title;

    public HeadphonesAndAudioEquipmentPage9 checkOpenHeadphonesAndAudioEquipmentPage(String pageName) {
        switchToWindow();
        wait.until(visibilityOf(title));
        assertTrue(title.getText().contains(pageName),
                "Страница не открылась/открылась не правильная страница");
        return this;
    }


}
