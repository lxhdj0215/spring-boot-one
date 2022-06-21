//package com.lxhdj.redis;
//
//
//import com.lxhdj.DemoApplication;
//import lombok.extern.slf4j.Slf4j;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.data.redis.core.RedisTemplate;
//import org.springframework.data.redis.core.StringRedisTemplate;
//import org.springframework.data.redis.core.ValueOperations;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import javax.annotation.Resource;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest(classes = {DemoApplication.class})
//@Slf4j
//public class RedisTest {
//
//    @Autowired
//    private RedisTemplate<String, Object> redisTemplate;
//
//
//    @Resource
//    private StringRedisTemplate stringRedisTemplate;
//
//
//    @Test
//    public void setTest() {
//        // 操作Redis中的string类型的数据,先获取ValueOperation
//        ValueOperations valueOperations = redisTemplate.opsForValue();
//        String key = "wgj";
//        String value = "123";
//        valueOperations.set(key, value);
//    }
//
//    @Test
//    public void getTest() {
//        ValueOperations valueOperations = redisTemplate.opsForValue();
//        String key = "test";
//        Object v = valueOperations.get(key);
//        System.out.println(v);
//    }
//
//    @Test
//    public void setStringKVTest() {
//        String key = "wgj1";
//        String value = "123";
//        stringRedisTemplate.opsForValue().set(key, value);
//    }
//
//    @Test
//    public void getStringKVTest() {
//        String key = "wgj";
//        String s = stringRedisTemplate.opsForValue().get(key);
//        System.out.println(s);
//    }
//}
