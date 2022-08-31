package ds.anosov.framework.pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class ResultTVsPage7 extends BasePage {

    //10. Проверить, что элементов на странице 48
    @FindBy(xpath = "//div[@class='_3mStq _2y-pc']")
    private WebElement amountOfElements;

    @FindBy(xpath = "//article[@data-autotest-id='product-snippet']//h3[@data-zone-name='title']")
    private List<WebElement> listProducts;

    @FindBy(xpath = "//input[@id = 'header-search']")
    private WebElement headerSearch;

    public String selectedProduct;

    public ResultTVsPage7 checkAmountOfElements(String amountElements) {
        switchToWindow();
        wait.until(visibilityOf(amountOfElements));
        String amount = String.valueOf(amountOfElements.getText().contains(amountElements));
        Assertions.assertEquals(amountElements, amount, "Элементов на странице не равно " + amountElements);
        return this;
    }


    public SearchResult8 selectProductTv() {
        this.selectedProduct = listProducts.get(0).getText();
        fillInputField(headerSearch, this.selectedProduct);
        headerSearch.sendKeys(Keys.ENTER);
        return pageManager.getSearchResult8();
    }

}
