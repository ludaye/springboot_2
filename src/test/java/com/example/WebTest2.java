package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Administrator on 2017/2/3.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class WebTest2 {
    @Test(expected = HttpClientErrorException.class)
    public void pageNotFound() {
        try {
            RestTemplate rest = new RestTemplate();
            rest.getForObject(
                    "http://localhost:8080/test", String.class);
        } catch (HttpClientErrorException e) {
            throw e;
        }
    }
}
