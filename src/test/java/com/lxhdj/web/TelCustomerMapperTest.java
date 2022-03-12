package com.lxhdj.web;

import com.lxhdj.DemoApplication;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {DemoApplication.class})
@Slf4j
public class TelCustomerMapperTest {

    @Autowired
    private TelCustomerMapper telCustomerMapper;

    @Test
    public void updateByExampleSelectiveTest() {
        TelCustomer telCustomer = new TelCustomer();
        telCustomer.setAddress("测试1");
        TelCustomerExample telCustomerExample = new TelCustomerExample();
        TelCustomerExample.Criteria criteria = telCustomerExample.createCriteria();
        criteria.andIdEqualTo(347284L);
        int i = telCustomerMapper.updateByExampleSelective(telCustomer, telCustomerExample);
        log.info("i = {}", i);
    }
}
