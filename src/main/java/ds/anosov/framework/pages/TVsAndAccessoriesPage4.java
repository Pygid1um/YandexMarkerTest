package ds.anosov.framework.pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class TVsAndAccessoriesPage4 extends BasePage {

    @FindBy(xpath = "//h1")
    private WebElement tVsAndAccessoriesTitle;

    public TVsAndAccessoriesPage4 checkOpenTvsAndAccessoriesPage(String pageName) {
        switchToWindow();
        wait.until(visibilityOf(tVsAndAccessoriesTitle));
        Assertions.assertTrue(tVsAndAccessoriesTitle.getText().contains(pageName),
                "Страница не открылась/открылась не правильная страница");
        return this;
    }

}
