package com.github.zhuyiyi1990.datagenerator.service;

public interface DataGeneratorService {

    public abstract void insertMasterTableByReferenceNumber(String referenceNumber);

    public abstract void fitasUserGenerate(String userId, String userMD5Password);

}
