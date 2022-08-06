package tests_browserstack;

import io.appium.java_client.AppiumBy;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static io.qameta.allure.Allure.step;

public class AndroidSearchTests extends TestBase {
    @Test
    void searchTest() {
        step("Type search", () -> {
            $(AppiumBy.accessibilityId("Search Wikipedia")).click();
            $(AppiumBy.id("org.wikipedia.alpha:id/search_src_text"))
                    .sendKeys("duckduckgo");
        });
        step("Verify content found", () ->
                $$(AppiumBy.id("org.wikipedia.alpha:id/pcs-edit-section-title-description"))
                        .shouldHave(sizeGreaterThan(0)));
    }
}


//Resource-Id	org.wikipedia.alpha:id/search_src_text
//	android.widget.TextView
//Resource-Id	pcs-edit-section-title-description    -Text	Internet search engine