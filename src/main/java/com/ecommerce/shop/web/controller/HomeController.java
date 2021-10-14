package com.ecommerce.shop.web.controller;

import com.ecommerce.shop.data.model.Product;
import com.ecommerce.shop.data.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;


@Controller
    public class HomeController {

    @Autowired
        ProductService productServiceImpl;

        @GetMapping("/index")
        public String getIndex(Model model){
            List<Product> productList = productServiceImpl.findAll();
            model.addAttribute("products", productList);
            return "index_page";
        }
        @GetMapping("/about")
        public String getAbout(){
            return "about";
        }
        @GetMapping("/product")
        public String getProduct(){
            return "product";
        }
        @GetMapping("/service")
        public String getService(){
            return "service";
        }
        @GetMapping("/single")
        public String getSingle(){
            return "single";
        }

    }

