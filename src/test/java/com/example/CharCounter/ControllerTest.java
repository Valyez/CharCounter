package com.example.CharCounter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@SpringBootTest
@ExtendWith(SpringExtension.class)
class ControllerTest {
    @Autowired
    Controller controller;

    @Test
    void main() {
        Assertions.assertEquals("\"б\":5, \"а\":4, \"3\":3, \"5\":1 ", controller.main("ааааббббб3335"));
        Assertions.assertEquals("\"￠\":1, \"￡\":1, \"￢\":1, \"￤\":1, \"￥\":1, \"￦\":1, \"￩\":1, \"￪\":1, \"￫\":1, \"￬\":1 ",
                controller.main("￠￡￢￤￥￦￩￪￫￬"));
        Assertions.assertThrows(RuntimeException.class, () -> controller.main(null));
    }
}