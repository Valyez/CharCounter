package com.example.CharCounter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@SpringBootTest
@ExtendWith(SpringExtension.class)
public class ServiceTest {
    @Autowired
    Service service;


    @Test
    public void calculateCharTest() {
        String a = "aaaaabcccc";
        Assertions.assertEquals(3, service.calculateChar(a).size());
        Assertions.assertEquals(5, service.calculateChar(a).get('a'));
        Assertions.assertEquals(1, service.calculateChar(a).get('b'));
        Assertions.assertEquals(4, service.calculateChar(a).get('c'));

        String b = "";
        Assertions.assertThrows(RuntimeException.class, () -> service.calculateChar(b), "Empty input");

        String c = "abcdefghijklmnopqrstuvwxyz";
        Assertions.assertEquals(26, service.calculateChar(c).size());

        String d = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        Assertions.assertEquals(33, service.calculateChar(d).size());

        String e = "a b c a b c";
        Assertions.assertEquals(4, service.calculateChar(e).size());
        Assertions.assertEquals(5, service.calculateChar(e).get(' ').intValue());

        String f = "abcdefghijklmnopqrstuvwxyzабвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        Assertions.assertEquals(59, service.calculateChar(f).size());


    }
}
