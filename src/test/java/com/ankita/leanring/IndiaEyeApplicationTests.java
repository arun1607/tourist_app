package com.ankita.leanring;

import com.ankita.leanring.service.UserService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class IndiaEyeApplicationTests {

    @Autowired
    private UserService userService;

    @Test
    public void testNotNull() throws Exception {
        Assert.assertNotNull(userService);
    }
}
