package ds.anosov.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class ElectronicsPage3 extends BasePage {

    @FindBy(tagName = "//h3[text()='Электроника']")
    private WebElement title;

    public ElectronicsPage3 checkOpenElectronicsPage() {
        switchToWindow();
        wait.until(visibilityOf(title));
        assertTrue(title.getText().contains("Электроника"),
                "Страница не открылась/открылась не правильная страница");
        return this;
    }
}
