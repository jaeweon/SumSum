package com.example.kovengerss.domain.dao;

import com.example.kovengerss.domain.vo.UserVO;
import com.example.kovengerss.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class UserDAO {
    private final UserMapper userMapper;

    //회원 정보 조회ㅋ
    public void userSelect(Integer userNum){;}
    //회원가입
    public void userInsert(UserVO userVO){userMapper.insert(userVO);}
    //회원 정보 수정
    public void userUpdate(Integer userNum){;}
    //회원 탈퇴
    public boolean userDelete(int userNum){
        return userMapper.delete(userNum) == 1;
    }
    //아이디 중복검사
    public void CheckId(String userId){;}
    //아이디 가져오기
    public void userGetId(String userId){;}
    //현재 비밀번호 가져오기
    public void userGetPw(UserVO userVO){;}
    //이메일 가져오기
    public void userGetEmail(UserVO userVO){;}
    //핸드폰 번호 가져오기
    public void userGetPhoneNumber(UserVO userVO){;}
    //출생년도 가져오기
    public void userGetBirth(UserVO userVO){;}
    //성별 가져오기
    public void userGetGender(UserVO userVO){;}
    //해당 회원 이상형 번호(ideal_num)가져오기
    public void userGetIdealNum(UserVO userVO){;}

    public void userDeleteWithPw(String userPw) {
        userMapper.deleteWithPw(userPw);
    }
}
