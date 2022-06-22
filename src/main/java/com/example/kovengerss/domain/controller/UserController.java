package com.example.kovengerss.domain.controller;

import com.example.kovengerss.domain.service.UserService;
import com.example.kovengerss.domain.vo.UserVO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

//TASK			        URL			           METHOD		PARAMETER		      FORM	    URL이동
//관리자로그인	        adminLogin		        post		모든항목			      필요	    adminpage
//로그인			        login			        post		모든항목			      필요	    main
//회원가입		        sign			        post		모든 항목			  필요  	    choice
//연애선택		        love		    	    post		모든 항목			  필요	    main
//결혼선택		        marry			        post		모든 항목			  필요	    main
//글작성			        /board/boardWrite		post		모든 항목			  필요	    /board/board
//글목록			        /board/boardList		get		    boardNum,boardField   없음	    /board/boardList
//어필목록		        /board/appilBoardList	get		    boardNum,boardField	  없음	    /board/appilBoardList
//리뷰목록		        /board/reviewBoardList	get		    boardNum,boardField	  없음	    /board/reviewBoardList
//쪽지보내기		        pick			        post		모든항목			      필요	    pick
//쪽지발신함		        letter			        get		    letterToNum		      필요	    letter
//쪽지수신목록		    letter			        get		    letterFromNum		  없음	    letter
//마이페이지전체정보    	myPage			        get		    userNum			      없음	    myPage
//마이페이지 글목록	    myPageText		        get		    boardNum		      없음	    myPageText
//마이페이지 답장목록	    myPageAnswer		    get		    replyNum		      없음	    myPageAnswer
//마이페이지 매칭인     	myPageMatching		    get			                      없음	    myPageMatching
//마이페이지 포인트내역	myPagePoint		        get		    pointNum		      없음	    myPagePoint
//포인트 결제		        myPagePoint		        post		모든항목			      필요	    myPagePoint
//블랙리스트     		    adminpage               get         blackListNum          없음       adminpage
@Controller
@Slf4j
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;
    //회원가입
    @GetMapping("sign")
    public void signUpForm(){
    }

    @PostMapping("sign")
    public String userInsert(UserVO userVO){
        log.info("----------------------------");
        log.info("Insert............. : " + userVO);
        log.info("----------------------------");
        userService.userInsert(userVO);
        return "login";
    }

    //로그인
    @GetMapping("login")
    public String loginForm(HttpServletRequest req){
        return "login";
    }

    @PostMapping("login")
    public String userLogin(){
        return "main";
    }

    //마이페이지 전체정보
    @GetMapping("myPage")
    public void getMyPage(){

    }
    //마이페이지 글 목록
    @GetMapping("myPageText")
    public void getMyPageList(){

    }
    //마이페이지 답장 목록
    @GetMapping("myPageAnswer")
    public void getMyPageAnswerList(){

    }

    //마이페이지 매칭인
    @GetMapping("myPageMatching")
    public void getMyPageMatching(){

    }

    //마이페이지 포인트 내역
    @GetMapping("myPagePoint")
    public void getPointSelect(){

    }

    //연애 선택
    @PostMapping("love")
    public void getLove(){

    }

    //결혼 선택
    @PostMapping("marry")
    public void getMarry(){

    }

//    //회원 탈퇴
//    @PostMapping("myPage/user")
//    public void deleteUser(int userNum){
//        System.out.println(userNum);
//        userService.userDelete(userNum);
//    }
    //회원 탈퇴2
    @PostMapping("myPage/user")
    public String deleteUser(String userPw, Model model){
        userService.userDeleteWithPw(userPw);
        return "main";
    }
}
