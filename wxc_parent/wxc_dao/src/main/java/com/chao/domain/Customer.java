package com.chao.domain;

import java.io.Serializable;

/**
 * ClassName:Customer
 * Package:com.chao.pojo
 * Description:
 *
 * @Date:2020/4/20 14:47
 * @Author: wxc
 */
public class Customer implements Serializable {
    private Integer id;
    private String username;
    private String dream;
    
    public Integer getId() {
        return id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    
    public String getDream() {
        return dream;
    }
    
    public void setDream(String dream) {
        this.dream = dream;
    }
    
    public String getUsername() {
        return username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    
    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", dream='" + dream + '\'' +
                '}';
    }
}
