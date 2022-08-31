package ds.anosov.framework.pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.List;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class SearchResult8 extends BasePage {

    ResultTVsPage7 resultTVsPage7 = new ResultTVsPage7();

    @FindBy(xpath = "//*[text()='Все результаты поиска']")
    private WebElement title;

    @FindBy(xpath = "//article[@data-autotest-id='product-snippet']")
    private List<WebElement> listResultProduct;


    public SearchResult8 checkOpenSearchResultPage(String pageName) {
        switchToWindow();
        wait.until(visibilityOf(title));
        Assertions.assertTrue(title.getText().contains(pageName),
                "Страница не открылась/открылась не правильная страница");
        return this;
    }

      public SearchResult8 searchResult() {
        WebElement productTitle;
        String productSelected = resultTVsPage7.selectedProduct;
        for (WebElement item : listResultProduct) {
            productTitle = item.findElement(By.xpath(".//h3[@data-zone-name='title']"));
            if (productTitle.getText().contains(productSelected)) {
                return pageManager.getSearchResult8();
            }
        }
         Assertions.fail("Товар '" + productSelected + "' не найден!");
        return pageManager.getSearchResult8();
    }
}
