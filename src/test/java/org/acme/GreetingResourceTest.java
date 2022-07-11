package org.acme;

import io.quarkus.test.junit.QuarkusTest;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class GreetingResourceTest {

    @Test
    public void testHelloEndpoint() {
        given()
          .when().get("/hello")
          .then()
             .statusCode(200)
             .header("Content-Type",is("application/json;charset=UTF-8"))
             .body(is("Hello from RESTEasy Reactive"));
    }

}