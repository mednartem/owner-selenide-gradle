package tests;

import config.WebDriverConfigHelper;
import org.junit.jupiter.api.Test;

public class WebTests {

    @Test
    void test() {
        System.out.println(WebDriverConfigHelper.getWebUrl());
        System.out.println(WebDriverConfigHelper.getBrowserName());
        System.out.println(WebDriverConfigHelper.getBrowserVersion());
    }
}