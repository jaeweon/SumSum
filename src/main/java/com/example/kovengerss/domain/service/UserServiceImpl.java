package com.example.kovengerss.domain.service;

import com.example.kovengerss.domain.dao.UserDAO;
import com.example.kovengerss.domain.vo.UserVO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Qualifier("user") @Primary
@Slf4j
public class UserServiceImpl implements UserService{
    private final UserDAO userDAO;

    @Override
    public void userSelect(Integer userNum) {

    }

    @Override
    public void userInsert(UserVO userVO) {
        userDAO.userInsert(userVO);
    }

    @Override
    public void userUpdate(Integer userNum) {

    }

    @Override
    public boolean userDelete(int userNum) {
        return userDAO.userDelete(userNum);
    }

    @Override
    public void CheckId(String userId) {

    }

    @Override
    public void userGetId(UserVO userVO) {

    }

    @Override
    public void userGetPw(UserVO userVO) {

    }

    @Override
    public void userGetEmail(UserVO userVO) {

    }

    @Override
    public void userGetPhoneNumber(UserVO userVO) {

    }

    @Override
    public void userGetBirth(UserVO userVO) {

    }

    @Override
    public void userGetGender(UserVO userVO) {

    }

    @Override
    public void userGetIdealNum(UserVO userVO) {

    }

    @Override
    public void userDeleteWithPw(String userPw) {
        userDAO.userDeleteWithPw(userPw);
    }
}
