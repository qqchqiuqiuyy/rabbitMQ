package cn.bb.sender;

import cn.bb.entity.User;
import cn.bb.sender.sender.HelloSender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SenderApplicationTests {

    @Autowired
    private HelloSender sender;

    @Test
    public void contextLoads() {
        User user = new User();
        user.setAge(11);
        user.setUserName("bobo");

        sender.send(user);
    }

}

