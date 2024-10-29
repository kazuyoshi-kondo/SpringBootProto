package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.model.ResUser;
import com.example.demo.model.User;

@Service
public class UserService {

    public ResUser userRegist(User user) {
        ResUser res = new ResUser();

        // 入力チェック
        System.out.println("入力内容チェック実施");

        // DB登録
        System.out.println("DB登録実施");

        // 処理結果
//        res.setUser(new User(user.getId(), user.getName(), user.getRank()));
        res.setResult(true);

        return res;
    }

    public ResUser getUser(User user) {
        ResUser res = new ResUser();

        // 入力チェック
        System.out.println("入力内容チェック実施");

        // DBデータ取得
        System.out.println("DBデータ取得実施");
        

        // 処理結果
        res.setUser(new User(user.getId(), "取得対象ユーザー名",1));
        res.setResult(true);

        return res;
    }

}