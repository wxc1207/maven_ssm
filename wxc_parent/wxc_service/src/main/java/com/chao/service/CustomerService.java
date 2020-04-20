package com.chao.service;

import com.chao.domain.Customer;

/**
 * ClassName:Customer
 * Package:com.chao.service
 * Description:
 *
 * @Date:2020/4/20 13:10
 * @Author: wxc
 */
public interface CustomerService {
    public Customer findById(Integer id);
}
