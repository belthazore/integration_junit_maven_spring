package com.mycompany.integration;


import com.mycompany.service.frontend.IFrontendService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertTrue;

@RunWith(SpringJUnit4ClassRunner.class)
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_EACH_TEST_METHOD)
@ContextConfiguration(locations = {"classpath:frontend-beans.xml"})
public class FrontendServiceTest {

    @Autowired
    IFrontendService frontendService; // todo: Саш, почему Autowired смотрит на интерфейс, а контекст "frontend-beans.xml": на класс "FrontendService" ?


    @Test
    public  void testBond() {
        String agent = frontendService.getAgent();
        assertTrue("It should be Bond", agent.contains("Bond"));
    }

}