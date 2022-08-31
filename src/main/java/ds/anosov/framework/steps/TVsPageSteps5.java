package ds.anosov.framework.steps;

import ds.anosov.framework.managers.PageManager;
import io.cucumber.java.ru.И;

public class TVsPageSteps5 {

    PageManager pageManager = PageManager.getPageManager();

    @И("^нажимает на кнопку \"(.*)\"$")
    public void clickAllFiltersButton() {
        pageManager.getTVsPage5().clickAllFiltersButton();
    }
}
