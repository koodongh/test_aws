package com.spring_mvc.mybatis;

import java.util.ArrayList;

public interface IProductService {
	ArrayList<ProductVO> productList();
	void insertProduct(ProductVO prd);
	void updateProduct(ProductVO prd);
	void deleteProduct(String prdNo);
	ProductVO productDetailView(String prdNo);
}
