package io.quarkus.it.amazon;

import static org.hamcrest.CoreMatchers.is;

import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;
import io.restassured.RestAssured;

@QuarkusTest
public class AmazonDynamoDBEnhancedTest {

    @Test
    public void testDynamoDbEnhancedClientWithCustomExtensionAsync() {
        RestAssured.when().get("/test/dynamodbenhanced/async").then().body(is("INTERCEPTED EXTENSION OK@1"));
    }

    @Test
    public void testDynamoDbEnhancedClientWithCustomExtensionBlocking() {
        RestAssured.when().get("/test/dynamodbenhanced/blocking").then().body(is("INTERCEPTED EXTENSION OK@1"));
    }
}
