package test.com.asiainfo.general.service;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.asiainfo.general.model.UserVO;
import com.asiainfo.general.service.IUserService;
//表示继承了SpringJUnit4ClassRunner类  
@RunWith(SpringJUnit4ClassRunner.class)     
@ContextConfiguration(locations = {"classpath:spring/spring-mybatis.xml"})  
public class UserServiceTest {
    private static Logger logger = LoggerFactory.getLogger(UserServiceTest.class);  
    @Autowired
    private IUserService userService;  
  
//  @Before  
//  public void before() {  
//      ac = new ClassPathXmlApplicationContext("applicationContext.xml");  
//      userService = (IUserService) ac.getBean("userService");  
//  }  
  
    @Test  
    public void test1() { 
        UserVO user = userService.getUserById(1);  
        logger.debug(user.getUserName());  
        // logger.info("值："+user.getUserName());  
    }
}