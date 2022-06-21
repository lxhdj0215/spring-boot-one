package com.lxhdj.dubbo;

import com.lxhdj.DemoApplication;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {DemoApplication.class})
@Slf4j
public class DubboTest {

//    @DubboReference
    private DemoService demoService;


    @Test
    public void sayHelloTest() {
        System.setProperty("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        String ret = demoService.sayHello("wgj");
        System.out.println(ret);
    }


}
