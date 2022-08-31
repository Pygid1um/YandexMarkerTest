package ds.anosov.framework.steps;

import ds.anosov.framework.managers.PageManager;
import io.cucumber.java.ru.Тогда;

public class SearchResult8 {

    PageManager pageManager = PageManager.getPageManager();

    @Тогда("^сравнивает наименование товара с запомненным значением$")
    public void searchResult() {
        pageManager.getSearchResult8().searchResult();
    }
}
