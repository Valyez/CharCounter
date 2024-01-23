package com.example.CharCounter;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;


@Component
public class Service {
    public Service() {
    }

    /**
     * Count the occurrence of all char in String
     *
     * @param input - String in which need to count the character
     * @return Map with pairs "symbol-count"
     */
    public Map<Character, Integer> calculateChar(String input) {
        Map<Character, Integer> map = new HashMap<>();
        if (input.length() == 0) {
            throw new RuntimeException("Empty input");
        }
        for (char c : input.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        return map;
    }
}
