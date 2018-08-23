package ru.kpfu.itis.producer.component;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;
import ru.kpfu.itis.domain.Email;

import java.util.Date;

@Component
@Slf4j
public class Producer {

    @Autowired
    private JmsTemplate jmsTemplate;

    public void produceMessage() {
        Email message = new Email("example@mail.ru", "Hello! Sended at: " + new Date());
        jmsTemplate.convertAndSend("mail", message);
        log.info("Email sended. {}", message);
    }
}
