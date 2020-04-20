package com.chao.dao;


import com.chao.domain.Customer;

/**
 * ClassName:CustomerDao
 * Package:com.chao.dao
 * Description:
 *
 * @Date:2020/4/20 13:04
 * @Author: wxc
 */
public interface CustomerDao {
    public Customer findById(Integer id);
}
