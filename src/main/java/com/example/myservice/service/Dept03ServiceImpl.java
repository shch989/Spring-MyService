package com.example.myservice.service;

import com.example.myservice.dao.Dept03Dao;
import com.example.myservice.dao.DeptDao;
import com.example.myservice.model.Dept;
import com.example.myservice.model.Dept03;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * packageName : com.example.myservice.service
 * fileName : DeptServiceImpl
 * author : TaeGyung
 * date : 2022-05-10
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-05-10         TaeGyung          최초 생성
 */
public class Dept03ServiceImpl implements Dept03Service{

    @Autowired
    Dept03Dao dept03Dao;

    @Override
    public List<Dept03> selectList() {
        return null;
    }
}
