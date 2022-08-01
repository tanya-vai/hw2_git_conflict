package guru.qa;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class FirstTest {

    @Test
    void clickTest() {
        open("https://www.google.com/");
        $(By.name("q")).sendKeys("Hello, I'm branch number 2");

    }
}
