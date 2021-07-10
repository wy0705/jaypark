package demo;


import com.easyarch.Application;

import com.easyarch.using.entity.User;
import com.easyarch.using.service.CollegeServiceImpl;
import com.easyarch.using.service.UserAndCServiceImpl;
import com.easyarch.using.service.UserServiceImpl;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
public class ApplicationTest {

    @Autowired
    private UserServiceImpl userService;
    
    @Autowired
    private CollegeServiceImpl collegeService;
    
    @Autowired
    private UserAndCServiceImpl userAndCService;

   /* @Autowired
    private LogServie logServie;*/

   /* @Resource
    private RedisTemplate<String, User> redisTemplate;
*/
    @Before
    public void before(){
       /* userService.deleteAllUser();*/
    }

    @Test
    public void testadduser(){
        userService.insertUser(new User("aaa","166383","123","河南",523));
        userService.insertUser(new User("bbb","133222","123","tianjin",555));
        userService.insertUser(new User("ccc","123443","123","anhui",543));
    }

    @Test
    public void testaddlog(){
        User user=userService.findById(1);
     System.out.println(user.getName());
        /*List<Integer> list=userAndCService.findCollegeByuid(1);
        System.out.println(list.get(1));*/
    }
}
