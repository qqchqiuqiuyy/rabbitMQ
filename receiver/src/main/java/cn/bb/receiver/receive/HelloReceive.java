package cn.bb.receiver.receive;

import cn.bb.entity.User;
import org.springframework.amqp.rabbit.annotation.Exchange;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.QueueBinding;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class HelloReceive {

    @RabbitListener(bindings = @QueueBinding(
                    value = @Queue("queue2"),
                    key = "eqeq2",
                    exchange = @Exchange("amq.direct")
    ))
    public void processC(User user){
        System.out.println("receive : "+user);
    }
}
