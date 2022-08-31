package ds.anosov.framework.steps;

import ds.anosov.framework.managers.PageManager;
import io.cucumber.java.ru.И;

public class ResultTVsPageSteps7 {

    PageManager pageManager = PageManager.getPageManager();

    @И("^проверяет что элементов на странице \"(.*)\"$")
    public void checkAmountOfElements(String amountElements) {
        pageManager.getResultTVsPage7().checkAmountOfElements(amountElements);
    }

    @И("^ищет в поисковой строке первый телевизор в списке$")
    public void selectProductTv() {
        pageManager.getResultTVsPage7().selectProductTv();
    }
}
