package com.spring_mvc.mybatis;

import java.util.ArrayList;

public interface IProductDAO {
	 ArrayList<ProductVO> productList(); //전체 상품 조회
	 void insertProduct(ProductVO prd); //상품 등록
	 ProductVO productDeailView(String prdNo); //상품 상세 정보 조회
	 void updateProduct(ProductVO prd); //상품 정보 수정
	 void deleteProduct(String prdNo); //상품 정보 삭제
}

