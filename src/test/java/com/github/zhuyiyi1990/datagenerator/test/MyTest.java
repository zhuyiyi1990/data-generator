package com.github.zhuyiyi1990.datagenerator.test;

import com.github.zhuyiyi1990.datagenerator.service.DataGeneratorService;
import org.apache.commons.codec.digest.DigestUtils;
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
    public void testInsertMasterTableByReferenceNumber() {
        DecimalFormat df1 = new DecimalFormat("000000");
        String s = "BAX1736";
        for (int i = 1; i <= 10; i += 1) {
            dataGeneratorService.insertMasterTableByReferenceNumber(s + df1.format(i));
            System.out.println("sql " + i + " executed");
        }
        System.out.println("done");
    }

    @Test
    public void testMD5Hex() {
        System.out.println(DigestUtils.md5Hex("32        1         "));
    }

    @Test
    public void testFitasUserGenerate() {
        for (int i = 20000; i <= 20002; i++) {
            String s = Integer.toString(i);
            StringBuilder sb = new StringBuilder(s);
            for (int l = 1; l <= 10 - s.length(); l++) {
                sb.append(" ");
            }
            sb.append("1         ");
            dataGeneratorService.fitasUserGenerate(s, DigestUtils.md5Hex(sb.toString()));
        }
    }

}
