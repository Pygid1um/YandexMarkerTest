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


            default:
                fail("Не правильно указано название страницы");
        }
    }
}
