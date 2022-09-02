package ds.anosov.framework.steps;

import ds.anosov.framework.managers.PageManager;
import io.cucumber.java.ru.И;

import static org.junit.Assert.fail;

public class BasePageSteps {

    PageManager pageManager = PageManager.getPageManager();

    @И("^открылась страница \"(.*)\"$")
    public void checkOpenPage(String pageName) {
        switch (pageName) {
            case "Маркет":
                pageManager.getMainMarketPage().checkOpenMainMarketPage(pageName);
                break;
            case "Телевизоры и аксессуары":
                pageManager.getTVsAndAccessoriesPage().checkOpenTvsAndAccessoriesPage(pageName);
                break;
            case "Все фильтры":
                pageManager.getFiltersPage6().checkAllFiltersTitlePage(pageName);
                break;
            case "Все результаты поиска":
                pageManager.getSearchResult8().checkOpenSearchResultPage(pageName);
                break;
            case "Наушники и аудиотехника":
                pageManager.getHeadphonesAndAudioEquipmentPage9().checkOpenHeadphonesAndAudioEquipmentPage(pageName);
                break;
            case "Наушники и Bluetooth-гарнитуры":
                pageManager.getHeadphonesAndBluetoothHeadsetsPage10().checkOpenHeadphonesAndBluetoothHeadsetsPage(pageName);
                break;
            default:
                fail("Не правильно указано название страницы");
        }
    }

    @И("^переходит в подменю \"(.*)\"$")
    public void selectTvMenuSection(String sectionName) {
        pageManager.getCommonElementsPage().selectMenuSection(sectionName);
    }

}
