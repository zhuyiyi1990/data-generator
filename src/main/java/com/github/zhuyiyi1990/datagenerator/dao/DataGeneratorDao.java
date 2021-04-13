package com.github.zhuyiyi1990.datagenerator.dao;

public interface DataGeneratorDao {

    public abstract void insertMasterTableByReferenceNumber(String referenceNumber);

    public abstract void fitasUserGenerate(String userId, String userMD5Password);

}
