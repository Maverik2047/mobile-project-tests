package helpers;

import static io.restassured.RestAssured.given;
import static java.lang.String.format;

public class BrowserStack {
    public static String videoUrl(String sessionId) {
        String url = format("https://api.browserstack.com/app-automate/sessions/%s.json", sessionId);

        return given()
                .auth().basic("maverik_16EwPC", "pDEtruXmfQUhBfzF7Kg7")
                .log().all()
                .when()
                .get(url)
                .then()
                .log().all()
                .statusCode(200)
                .extract()
                .path("automation_session.video_url");
    }
}