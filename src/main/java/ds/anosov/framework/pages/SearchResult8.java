package ds.anosov.framework.pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.List;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class SearchResult8 extends BasePage {

    @FindBy(xpath = "//*[text()='Все результаты поиска']")
    private WebElement title;

    @FindBy(xpath = "//article[@data-autotest-id='product-snippet']")
    private List<WebElement> listResultProduct;

    public SearchResult8 searchResult(String product) {
        wait.until(visibilityOf(title));
        WebElement productTitle;
        for (WebElement item : listResultProduct) {
            productTitle = item.findElement(By.xpath(".//h3[@data-zone-name='title']"));
            if (productTitle.getText().contains(product)) {
                return pageManager.getSearchResult8();
            }
        }
         Assertions.fail("Товар '" + product + "' не найден!");
        return pageManager.getSearchResult8();
    }
}
