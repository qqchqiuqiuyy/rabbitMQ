package cn.bb.receiver;

import cn.bb.entity.User;
import cn.bb.receiver.receive.HelloReceive;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ReceiverApplicationTests {

    @Autowired
    private HelloReceive receive;

    @Test
    public void contextLoads() {
        User user = new User();
        receive.processC(user);
        user.toString();
    }

}

