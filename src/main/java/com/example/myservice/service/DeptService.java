package com.example.myservice.service;

import com.example.myservice.model.Dept;

import java.util.List;

/**
 * packageName : com.example.myservice.service
 * fileName : DeptService
 * author : TaeGyung
 * date : 2022-05-10
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-05-10         TaeGyung          최초 생성
 */
public interface DeptService {
    public List<Dept> selectList();
}
