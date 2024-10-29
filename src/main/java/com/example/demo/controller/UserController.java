package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.*;
import com.example.demo.common.CommonUtil;
import com.example.demo.service.UserService;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    /**
     * 
     * @param user 登録対象ユーザー情報
     * @return 処理結果
     */
    @RequestMapping("/userRegist")
    public ResUser userRegist(@ModelAttribute User user) {
        // ユーザー認証
        if (!CommonUtil.userAuthentication(user.getAuthId())) {
            ResUser res = new ResUser();

            res.setResult(false);
            res.setErrCode(999);
            res.setErrMessage("認証エラー");

            return res;
        }

        // ユーザー登録
        return userService.userRegist(user);
    }

    @RequestMapping("/getUser")
    public ResUser getUser(User user) {
        // ユーザー認証
        if (!CommonUtil.userAuthentication(user.getAuthId())) {
            ResUser res = new ResUser();

            res.setResult(false);
            res.setErrCode(999);
            res.setErrMessage("認証エラー");

            return res;
        }

        // ユーザー情報取得
        return userService.getUser(user);
    }
}