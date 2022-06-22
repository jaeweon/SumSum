package com.example.kovengerss.mapper;


import com.example.kovengerss.domain.vo.UserVO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    //회원 정보 조회
    public UserVO select(int userNum);
    //회원가입
    public void insert(UserVO userVO);
    //회원 정보 수정
    public void update(int userNum);
    //회원 탈퇴
    public int delete(int userNum);
    //아이디 중복검사
    public Boolean checkId(String userId);
    //아이디 가져오기
    public String getId(UserVO userVO);
    //현재 비밀번호 가져오기
    public String getPw(UserVO userVO);
    //이메일 가져오기
    public String getEmail(UserVO userVO);
    //핸드폰 번호 가져오기
    public String getPhoneNumber(UserVO userVO);
    //출생년도 가져오기
    public String getBirth(UserVO userVO);
    //성별 가져오기
    public String getGender(UserVO userVO);
    //해당 회원 이상형 번호(ideal_num)가져오기
    public Integer getIdealNum(UserVO userVO);

    void deleteWithPw(String userPw);
}
