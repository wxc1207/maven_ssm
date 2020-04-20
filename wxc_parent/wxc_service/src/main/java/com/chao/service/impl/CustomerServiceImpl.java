package com.chao.service.impl;

import com.chao.dao.CustomerDao;
import com.chao.domain.Customer;

import com.chao.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ClassName:CustomerServiceImpl
 * Package:com.chao.service.impl
 * Description:
 *
 * @Date:2020/4/20 13:11
 * @Author: wxc
 */
@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerDao customerDao;
    @Override
    public Customer findById(Integer id) {
        return customerDao.findById(id);
    }
}
