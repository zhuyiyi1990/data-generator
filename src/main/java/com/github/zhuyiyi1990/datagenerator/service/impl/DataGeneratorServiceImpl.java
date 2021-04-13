package com.github.zhuyiyi1990.datagenerator.service.impl;

import com.github.zhuyiyi1990.datagenerator.dao.DataGeneratorDao;
import com.github.zhuyiyi1990.datagenerator.service.DataGeneratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DataGeneratorServiceImpl implements DataGeneratorService {

    @Autowired
    private DataGeneratorDao dataGeneratorDao;

    @Override
    public void generateData(String arg) {
        dataGeneratorDao.generateData(arg);
    }

}
