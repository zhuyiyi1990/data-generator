package com.github.zhuyiyi1990.datagenerator.test;

import com.github.zhuyiyi1990.datagenerator.service.DataGeneratorService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.text.DecimalFormat;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring.xml"})
public class MyTest {

    @Autowired
    private DataGeneratorService dataGeneratorService;

    @Test
    public void test() {
        testInsertByReferenceNumber(1, 10, 1);
    }

    private void testInsertByReferenceNumber(int start, int end, int step) {
        DecimalFormat df1 = new DecimalFormat("000000");
        String s = "BAX1736";
        for (int i = start; i <= end; i += step) {
            dataGeneratorService.generateData(s + df1.format(i));
            System.out.println("sql " + i + " executed");
        }
        System.out.println("done");
    }

}
