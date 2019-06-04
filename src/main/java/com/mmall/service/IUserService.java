package com.mmall.service;

import com.mmall.common.ServerResponse;
import com.mmall.pojo.User;

public interface IUserService {

    /**
     * 用户登录，对密码进行MD5加密匹配
     * @param username
     * @param password
     * @return
     */
    ServerResponse<User> login(String username, String password);

    /**
     * 用户注册，对注册密码进行MD5加密
     * @param user
     * @return
     */
    ServerResponse<String> register(User user);

    /**
     * 检查用户名和邮箱是否重复
     * @param str
     * @param type
     * @return
     */
    ServerResponse<String> checkValid(String str, String type);

    /**
     * 找回密码，找回密码问题
     * @param username
     * @return
     */
    ServerResponse selectQuestion(String username);

    /**
     * 校验答案是否正确
     * @param username
     * @param question
     * @param answer
     * @return
     */
    ServerResponse<String> checkAnswer(String username, String question, String answer);

    /**
     * 修改密码
     * @param username
     * @param passwordNew
     * @param forgetToken
     * @return
     */
    ServerResponse<String> forgetResetPassword(String username, String passwordNew, String forgetToken);

    /**
     * 重置密码，通过该用户id进行校验，防止横向越权
     * @param passwordOld
     * @param passwordNew
     * @param user
     * @return
     */
    ServerResponse<String> resetPassword(String passwordOld, String passwordNew, User user);

    /**
     * 更新用户信息，用户名不允许更新，先校验email是否存在，是否是自己
     * @param user
     * @return
     */
    ServerResponse<User> updateInformation(User user);

    /**
     * 获取用户信息
     * @param userId
     * @return
     */
    ServerResponse<User> getInformation(Integer userId);

    /**
     * 检验是否为管理员身份
     * @param user
     * @return
     */
    ServerResponse checkAdminRole(User user);
}
