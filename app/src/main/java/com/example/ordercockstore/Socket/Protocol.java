package com.example.ordercockstore.Socket;

public class Protocol {
    public static final String MARKET_LOGIN = "90"; // 마켓로그인(request)

    public static final String MANAGER_LOGIN_OK = "91"; // finally 드디어라는뜻

    public static final String MANAGER_LOGIN_NO = "99"; // faill 실패라는뜻

    public static final String REGISTER = "100"; // 회원가입(request)

    public static final String IDCHECK = "120"; // ID찾기 Join (request)


    public static final String STORESELECT = "130"; // 매장 선택

    public static final String LOGIN = "110"; // 로그인

    public static final String LOGOUT = "115"; // 로그아웃
    

    public static final String ENTERLOGIN_NO = "119"; // 로그인 실패

    public static final String ENTERLOGIN_OK = "111"; // 로그인 성공

    public static final String ENTERSIGNUP_OK = "101"; // 로그인 실패

}
