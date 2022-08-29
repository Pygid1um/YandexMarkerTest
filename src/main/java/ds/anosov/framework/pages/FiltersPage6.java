package ds.anosov.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class FiltersPage6 extends BasePage {

    @FindBy(xpath = "//h1")
    private WebElement allFiltersTitle;

    @FindBy(xpath = "//div[@data-filter-id='glprice']//div[@data-prefix]/input")
    private List<WebElement> priceMinimal;

    @FindBy(xpath = "//h4[text()='Производитель']/../following-sibling::div//input[not(@type)]")
    private WebElement manufacturerCheckBox;

    @FindBy(xpath = "//a[contains(@href, '/catalog--') and contains(text(),'Показать')]")
    private WebElement showResultButton;


    public FiltersPage6 selectPrice(String minPrice, String maxPrice) {
        wait.until(visibilityOf(allFiltersTitle));
        fillInputField(priceMinimal.get(0), minPrice);
        fillInputField(priceMinimal.get(1), maxPrice);
        return pageManager.getFiltersPage6();
    }

    public FiltersPage6 selectManufacturerCheckBox(String value) {
        fillInputField(manufacturerCheckBox, value);
        if (manufacturerCheckBox.getText().contains(value)) {
            selectCheckbox(manufacturerCheckBox, value);
        }
        return pageManager.getFiltersPage6();
    }

    public ResultTVsPage7 clickShowResultButton() {
        waitUtilElementToBeClickable(showResultButton);
        return pageManager.getResultTVsPage7();
    }

}
