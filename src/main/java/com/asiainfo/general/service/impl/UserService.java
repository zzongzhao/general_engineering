package com.asiainfo.general.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.asiainfo.general.dao.UserVOMapper;
import com.asiainfo.general.model.UserVO;
import com.asiainfo.general.model.UserVOExample;
import com.asiainfo.general.service.IUserService;

@Service("userService")
public class UserService implements IUserService {
    
    @Resource
    private UserVOMapper userVOMapper;
    
    
    public List<UserVO> selectUserList(UserVOExample example) {
        
//        return new ArrayList<UserVO>();
        return userVOMapper.selectByExample(example);
    }
    
    public UserVO getUserById(int userId) {  
        
        return this.userVOMapper.selectByPrimaryKey(userId); 
//        return new UserVO();
    }
}
