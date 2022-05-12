package com.example.myservice.controller;

import com.example.myservice.dao.Dept03Dao;
import com.example.myservice.dao.DeptDao;
import com.example.myservice.model.Dept;
import com.example.myservice.model.Dept03;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * packageName : com.example.myservice.controller
 * fileName : DeptController
 * author : TaeGyung
 * date : 2022-05-10
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-05-10         TaeGyung          최초 생성
 */
@RestController
public class DeptController {

    @Autowired
    DeptDao deptDao;
    @Autowired
    Dept03Dao dept03Dao;

    @GetMapping("/main")
    public List<Dept> main() {
        List<Dept> list = deptDao.selectList();
        return list;
    }

    @GetMapping("/main2")
    public List<Dept03> main2() {
        List<Dept03> list = dept03Dao.selectList();
        return list;
    }
}
