package ds.anosov.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.List;

import static org.junit.jupiter.api.Assertions.fail;

public class CommonElementsPage extends BasePage {

    @FindBy(xpath = "//div[contains(@data-zone-data,'/catalog--')]")
    private List<WebElement> listMenuSection;

    @FindBy(xpath = "//div[@data-tid='66fc8fcb']/a[@data-tid='d78fd628 ec3a733d']")
    private List<WebElement> listElectronicsMenu;


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


    public BasePage selectElectronicsMenu(String electronicsMenu) {
        switchToWindow();
        for (WebElement item : listElectronicsMenu) {
            if (item.getText().contains(electronicsMenu)) {
                waitUtilElementToBeClickable(item).click();
                switch (electronicsMenu) {
                    case "Телевизоры и аксессуары":
                        return pageManager.getTVsAndAccessoriesPage();
                    case "Наушники и аудиотехника" :
                        return pageManager.getHeadphonesAndAudioEquipmentPage9();
                    default:
                        fail("Не правильно указано название раздела");
                }
            }
        }
        fail("Раздел '" + electronicsMenu + "' не найден");
        return this;
    }

}
