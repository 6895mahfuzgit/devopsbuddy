package com.devopsbuddy.test.intregration;

import com.devopsbuddy.DevopsbuddyApplication;
import com.devopsbuddy.backend.presistence.repositories.PlanRepository;
import com.devopsbuddy.backend.presistence.repositories.RoleRepository;
import com.devopsbuddy.backend.presistence.repositories.UserRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by MahfuzCSE'11 on 20-Sep-16.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = DevopsbuddyApplication.class)
public class RepositoryIntregrationTest {

    @Autowired
    private PlanRepository planRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private UserRepository userRepository;

    @Before
    public void init() {

        Assert.assertNotNull(planRepository);
        Assert.assertNotNull(roleRepository);
        Assert.assertNotNull(userRepository);

    }

    @Test
    public void crateNewTestPlan() throws Exception{


    }


}
