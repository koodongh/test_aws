package com.spring_mvc.mybatis;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ProductController {
	@Autowired
	ProductService service;
	
	//시작 시 index 페이지 열기
	@RequestMapping("/")
	public String viewIndex() {		
		return "index"; //상품 등록 뷰 페이지
	}
	
	//전제 상품 조회
	@RequestMapping("/product/productListView")
	public String viewProductList(Model model) {		
		ArrayList<ProductVO> prdList = service.productList();	
		model.addAttribute("prdList", prdList);
		return "product/productListView"; //상품 리스트 뷰 페이지
	}
	
	// 상품 등록 화면으로 이동
	@RequestMapping(value = "/product/productNewForm", method = RequestMethod.GET)
	public String viewProductForm() {
		return "product/productNewForm"; // 상품 등록 뷰 페이지
	}
	
	//상품 등록
	@RequestMapping(value="/product/insert", method=RequestMethod.POST)
	public String insertProduct(ProductVO prd) {		
		service.insertProduct(prd);
		return "redirect:./productListView"; //productListView 페이지로 이동-정상
		//return "product/productListView"; //데이터 출력 안 됨		 
	}
	
	//상품 상세 정보 페이지로 이동
	@RequestMapping(value="/product/productDetailView/{prdNo}")
	public String detailVewProduct(@PathVariable  String prdNo, Model model) {		
		ProductVO prd = service.productDetailView(prdNo);	
		model.addAttribute("prd", prd);
		return "product/productDetailView"; //상품 상세 정보 뷰 페이지
	}
	
	//상품 정보 수정 화면으로 이동 (수정하기 위해 상품 상세 정보를 화면에 출력)
	@RequestMapping(value="/product/updateForm/{prdNo}")
	public String updateProductForm(@PathVariable  String prdNo, Model model) {		
		ProductVO prd = service.productDetailView(prdNo);	
		model.addAttribute("prd", prd);
		return "product/productUpdateForm"; //상품 정보 수정 화면
	}	

	//상품 정보 수정 
	@RequestMapping(value="/product/update")
	public String updateProduct(ProductVO prd) {		
		service.updateProduct(prd);	
		//return "redirect:/product/productListView"; //OK
		return "redirect:./productListView";  //OK
	}

	//상품 정보 삭제
	@RequestMapping(value="/product/delete/{prdNo}")
	public String  deleteProduct(@PathVariable  String prdNo) {	
		service.deleteProduct(prdNo);	
		//return "product/productListView"; //뷰는 찾지만 데이터는 출력 안 됨
		return "redirect:/product/productListView"; //OK 
		//절대 경로 사용 가능
		//return "redirect:http://localhost:8080/jdbc/product/productListView"; 	//OK
		//return "http://localhost:8080/jdbc/product/productListView"; //안 됨(views 아래 찾기 때문)	
	}

}

