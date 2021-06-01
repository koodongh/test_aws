package com.mult.myboot02;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.spring_mvc.mybatis.ProductService;
import com.spring_mvc.mybatis.ProductVO;

@Controller
public class TestController {
//		@Autowired
//		ProductService service;
//	
//	@ResponseBody
//	@RequestMapping("/") //요청 url : http://localhost:8181
//	public String home() {
//			return "myboot02!!";
//		}
//	
//	// 시작 시 index 페이지 열기
//	@RequestMapping("/")
//	public String viewIndex() {
//		return "index"; // 상품 등록 뷰 페이지
//	}
//	
//	// 전제 상품 조회
//	@RequestMapping(value = "/product/productListView", method = RequestMethod.GET)
//	public String viewProductList(Model model) {
//		ArrayList<ProductVO> prdList = service.productList();
//		model.addAttribute("prdList", prdList);
//		return "product/productListView"; // 상품 리스트 뷰 페이지
//	}
}
