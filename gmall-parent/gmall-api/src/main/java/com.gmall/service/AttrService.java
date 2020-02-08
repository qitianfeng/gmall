package com.gmall.service;


import com.gmall.bean.PmsBaseAttrInfo;
import com.gmall.bean.PmsBaseSaleAttr;

import java.util.List;


public interface AttrService {

    List<PmsBaseAttrInfo> attrInfoList(String catalog3Id);

    String saveAttrInfo(PmsBaseAttrInfo pmsBaseAttrInfo);

    List<com.atguigu.gmall.bean.PmsBaseAttrValue> getAttrValueList(String attrId);

    List<PmsBaseSaleAttr> baseSaleAttrList();
}
