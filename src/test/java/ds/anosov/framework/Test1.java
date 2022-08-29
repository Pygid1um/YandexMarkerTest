package ds.anosov.framework;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Test1 extends BaseTest {


    @Test
    public void createOpty() throws InterruptedException {

        app.getMainYandexPage()
                .selectMainMenu("Маркет")
                .selectCategoryMenu("Электроника")
//                .selectElectronicsMenu("Телевизоры и аксессуары")
//                .selectTvMenuSection("Телевизоры")
//                .clickAllFiltersButton()
//                .selectPrice("20000", "")
//                .selectManufacturerCheckBox("LG")
//                .selectManufacturerCheckBox("Samsung")
//                .clickShowResultButton()


        ;


    }
}
