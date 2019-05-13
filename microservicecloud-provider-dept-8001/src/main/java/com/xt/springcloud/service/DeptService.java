package com.xt.springcloud.service;

import com.xt.springcloud.bean.Dept;

import java.util.List;

/**
 * @author xt
 * @create 2019/5/9 18:21
 * @Desc
 */
public interface DeptService {
    boolean add(Dept dept);

    Dept get(Long id);

    List<Dept> list();
}
