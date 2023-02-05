package com.MicroSarvices.ProductSarvice.service;

import com.MicroSarvices.ProductSarvice.model.ProductRequest;
import com.MicroSarvices.ProductSarvice.model.ProductResponse;

public interface ProductService {
    long addProduct(ProductRequest productRequest);
    ProductResponse getProductById(long productId);

}
