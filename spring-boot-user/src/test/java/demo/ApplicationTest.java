package demo;


import com.easyarch.Application;

import com.easyarch.using.entity.Position;
import com.easyarch.using.entity.Resume;
import com.easyarch.using.entity.User1;
import com.easyarch.using.service.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
public class ApplicationTest {

    @Autowired
    private CompanyServiceImpl companyService;

    @Autowired
    private User1ServiceImpl user1Service;

    @Autowired
    private Com_posserviceImpl com_posservice;

    @Autowired
    private ControllerServiceImpl controllerService;

    @Autowired
    private MessageServiceImpl messageService;

    @Autowired
    private NeedServiceImpl needService;

    @Autowired
    private PositionServiceImpl positionService;

    @Autowired
    private ResumeServiceImpl resumeService;

    @Autowired
    private User_posServiceImpl user_posService;

    @Before
    public void before(){
       /* userService.deleteAllUser();*/
    }

    @Test
    public void testadduser(){
        user1Service.insertUser1(new User1("123","123",1));
        resumeService.insertResume(new Resume(1,2));

    }

    @Test
    public void testaddlog(){

        /*List<Integer> list=userAndCService.findCollegeByuid(1);
        System.out.println(list.get(1));*/
    }
}
