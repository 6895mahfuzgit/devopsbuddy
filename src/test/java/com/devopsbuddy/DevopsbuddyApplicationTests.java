package com.devopsbuddy;

import com.devopsbuddy.web.i18n.I18NService;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DevopsbuddyApplicationTests {


    
    @Autowired
    private I18NService i18NService;

    /*@Test
    public void contextLoads() {
    }*/
    @Test
    public void testMessageByLocalService() throws Exception {

        String expectedResult = "Bootstrap starter template";
        String messageId = "index.main.callout";
        String action = i18NService.getMessage(messageId);
        Assert.assertEquals("String does not match", expectedResult, action);

    }


}
