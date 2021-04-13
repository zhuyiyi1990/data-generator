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
    public void insertMasterTableByReferenceNumber(String referenceNumber) {
        dataGeneratorDao.insertMasterTableByReferenceNumber(referenceNumber);
    }

    @Override
    public void fitasUserGenerate(String userId, String userMD5Password) {
        dataGeneratorDao.fitasUserGenerate(userId, userMD5Password);
    }

}
