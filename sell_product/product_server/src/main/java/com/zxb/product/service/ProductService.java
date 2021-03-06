package com.zxb.product.service;

import com.zxb.common.product.domain.DecreaseStockInput;
import com.zxb.common.product.domain.ProductInfoOutput;
import com.zxb.product.model.ProductInfo;

import java.util.List;

/**
 * ProductService interface
 *
 * @author Mr.zxb
 * @date 2019-09-25 13:51
 */
public interface ProductService {

    List<ProductInfo> findUpAll();

    List<ProductInfoOutput> findList(List<String> productIds);

    void decreaseStock(List<DecreaseStockInput> cartDTOS);
}
