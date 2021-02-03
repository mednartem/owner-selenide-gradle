package tests;

import config.ApiConfigHelper;
import org.junit.jupiter.api.Test;

public class ApiTests {

    @Test
    void getProperties() {
        System.out.println(ApiConfigHelper.getUrl());
        System.out.println(ApiConfigHelper.getToken());
    }
}
