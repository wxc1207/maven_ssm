package com.chao.controller;

import com.chao.domain.Customer;
import com.chao.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * ClassName:controller
 * Package:com.chao
 * Description:
 *
 * @Date:2020/4/20 13:16
 * @Author: wxc
 */
@Controller
@RequestMapping("/customer")
public class CustomerController {
    
    @Autowired
    private CustomerService customerService;
    
    @RequestMapping("/show")
    
    public String show(Model model) {
        System.out.println("已经入show");
        Customer customer = customerService.findById(1);
        model.addAttribute("customer", customer);
        return "show";
    }
}
