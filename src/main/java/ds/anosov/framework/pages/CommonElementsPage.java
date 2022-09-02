package ds.anosov.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.List;

import static org.junit.jupiter.api.Assertions.fail;

public class CommonElementsPage extends BasePage {

    @FindBy(xpath = "//div[contains(@data-zone-data,'/catalog--')]")
    private List<WebElement> listMenuSection;

    public BasePage selectMenuSection(String sectionName) {
        for (WebElement menuItem : listMenuSection) {
            if (menuItem.getText().trim().equalsIgnoreCase(sectionName)) {
                waitUtilElementToBeClickable(menuItem).click();
                switch (sectionName) {
                    case "Телевизоры":
                        return pageManager.getTVsPage5();
                    case "Наушники и Bluetooth-гарнитуры":
                        return pageManager.getHeadphonesAndBluetoothHeadsetsPage10();
                    default:
                        fail("Не правильно указано название раздела");
                }
            }
        }
        fail("Раздел '" + sectionName + "' не найден");
        return this;
    }

}
