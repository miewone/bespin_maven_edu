package com.example.bespin_maven_edu;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class BespinMavenEduApplicationTests {


    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @DisplayName("1. Hello API Test")
    @Test
    void helloapiTest()
    {
        String url = "http://localhost:"+port+"/api/hello";

        ResponseEntity<String> resEntity = restTemplate.getForEntity(url, String.class);

        System.out.println("Test API hello");
        assertThat(resEntity.getStatusCode()).isEqualTo(HttpStatus.OK);
        assertThat(resEntity.getBody()).isEqualTo("hello");
    }

    @DisplayName("2. Bye API Test")
    @Test
    void byeapiTest()
    {
        String url = "http://localhost:"+port+"/api/bye";

        ResponseEntity<String> resEntity = restTemplate.getForEntity(url, String.class);

        System.out.println("Test API bye");
        assertThat(resEntity.getStatusCode()).isEqualTo(HttpStatus.OK);
        assertThat(resEntity.getBody()).isEqualTo("bye");
    }

}
