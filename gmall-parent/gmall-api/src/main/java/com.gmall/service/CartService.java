package com.gmall.service;

import com.gmall.bean.OmsCartItem;

import java.util.List;

public interface CartService {
    OmsCartItem idCartExistByUser(String memberId, String skuId);

    void addCart(OmsCartItem omsCartItem);

    void updateCart(OmsCartItem omsCartItemFromDb);

    void flushCartCache(String memberId);

    List<OmsCartItem> cartList(String memberId);

    void checkCart(OmsCartItem omsCartItem);

    OmsCartItem ifCartExistByUser(String memberId, String skuId);

    void deleteInOrder(String memberId, String productSkuId);
}
