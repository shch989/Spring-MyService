package com.example.myservice.model;

import lombok.Data;

/**
 * packageName : com.example.myservice.model
 * fileName : Dept
 * author : TaeGyung
 * date : 2022-05-10
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-05-10         TaeGyung          최초 생성
 */
// Rombok 의 Data 정의
@Data
public class Dept {
    private String dno; // 부서번호
    private String dname; // 부서이름
    private String loc; // 지역
}
