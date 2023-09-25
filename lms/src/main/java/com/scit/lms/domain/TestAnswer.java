package com.scit.lms.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TestAnswer {
    int answernum;  //답안 번호(시퀀스, PK)
    int asnum; //답안지 고유번호(FK)
    int qid;   //문제 번호
    String answer; // 답안
    int points; //　득점
    String originalfile; //파일 원본 이름
    String savedfile; //저장된 파일 이름
}
