package org.eichstaedt.finance;

import static io.restassured.RestAssured.given;
import io.quarkus.test.junit.QuarkusTest;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;

/**
 * Created by konrad.eichstaedt@gmx.de on 11.07.22.
 */

@QuarkusTest
public class OutcomeResourceTest {

  @Test
  void testCreateOutcome() {

    given().body(new Outcome("Essen",12F))
        .contentType(ContentType.JSON)
        .when()
        .post("/finance/outcome")
        .then().statusCode(201);
  }
}
