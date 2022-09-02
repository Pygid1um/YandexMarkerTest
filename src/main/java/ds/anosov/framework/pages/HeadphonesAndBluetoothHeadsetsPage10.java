package ds.anosov.framework.pages;

import ds.anosov.framework.managers.PageManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class HeadphonesAndBluetoothHeadsetsPage10 extends BasePage {

    @FindBy(xpath = "//div[@data-grabber='SearchTitle']")
    private WebElement title;

    public HeadphonesAndBluetoothHeadsetsPage10 checkOpenHeadphonesAndBluetoothHeadsetsPage(String pageName) {
        switchToWindow();
        waitUtilElementToBeClickable(title);
        assertTrue(title.getText().contains(pageName),
                "Страница не открылась/открылась не правильная страница");
        return this;
    }

}
