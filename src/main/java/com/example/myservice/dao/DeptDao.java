package com.example.myservice.dao;

import com.example.myservice.model.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * packageName : com.example.myservice.dao
 * fileName : DeptDao
 * author : TaeGyung
 * date : 2022-05-10
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-05-10         TaeGyung          최초 생성
 */
@Mapper // mapping 파일에 있는 sql을 인터페이스로 호출
public interface DeptDao {
    public List<Dept> selectList();
}
