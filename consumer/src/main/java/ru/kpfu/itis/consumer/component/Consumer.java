package ru.kpfu.itis.consumer.component;

import lombok.extern.slf4j.Slf4j;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;
import ru.kpfu.itis.domain.Email;

@Slf4j
@Component
public class Consumer {

    @JmsListener(destination = "mail")
    public void receiveMessage(Email email) {
        log.info("Mail {} received.", email);
    }
}
