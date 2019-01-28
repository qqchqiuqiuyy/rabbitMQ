package cn.bb.sender.sender;

import cn.bb.entity.User;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HelloSender {
    @Autowired
    private AmqpTemplate template;


    public void send(User user){
        /**
         * 1.交换机名
         * 2.routing key
         */
        template.convertAndSend("amq.direct","eqeq2",user);
    }
}
