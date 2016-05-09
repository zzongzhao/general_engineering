package com.asiainfo.general.service;

import java.util.List;

import com.asiainfo.general.model.UserVO;
import com.asiainfo.general.model.UserVOExample;

public interface IUserService {
    
    List<UserVO> selectUserList(UserVOExample example);
    
    public UserVO getUserById(int userId);
}
