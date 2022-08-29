package ds.anosov.framework.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ResultTVsPage7 extends BasePage {

    //10. Проверить, что элементов на странице 12 (настройка в конце списка)
    @FindBy(xpath = "")
    private WebElement elem12;

    @FindBy(xpath = "//article[@data-autotest-id='product-snippet']//h3[@data-zone-name='title']")
    private List<WebElement> listProducts;

    @FindBy(xpath = "//input[@id = 'header-search']")
    private WebElement headerSearch;


    public SearchResult8 selectProductTv() {
        String selectedProduct = listProducts.get(0).getText();
        fillInputField(headerSearch, selectedProduct);
        headerSearch.sendKeys(Keys.ENTER);
        return pageManager.getSearchResult8();
    }

}
