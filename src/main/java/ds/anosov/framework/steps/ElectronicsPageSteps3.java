package ds.anosov.framework.steps;

import ds.anosov.framework.managers.PageManager;
import io.cucumber.java.ru.И;

public class ElectronicsPageSteps3 {

    PageManager pageManager = PageManager.getPageManager();

    @И("^выбирает проверяет раздел Электроника2$")
    public void checkOpenElectronicsPage() {
        pageManager.getElectronicsPage().checkOpenElectronicsPage();
    }

    @И("^выбирает раздел 'Телевизоры и аксессуары'$")
    public void selectElectronicsMenu() {
        pageManager.getElectronicsPage().selectTvsAndAccessoriesMenu();
    }

    @И("^выбирает раздел 'Наушники и аудиотехника'$")
    public void selectHeadphonesAndAudioEquipmentPage() {
        pageManager.getElectronicsPage().selectHeadphonesAndAudioEquipmentPage();
    }

}
