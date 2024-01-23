package com.example.CharCounter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class Controller {
    @Autowired
    Service service;

    /**
     * Count all symbols in string.
     * Example: inputText - "ааааббббб3335"
     * return - "б":5, "а":4, "3":3, "5":1
     *
     * @param inputText -  Your string witch need to divide by symbols and count each entry
     * @return String with all symbols in input string and their numbers of entry.
     */
    @GetMapping()
    public String main(@RequestParam String inputText) {
        Map<Character, Integer> result = service.calculateChar(inputText);
        StringBuilder builder = new StringBuilder();
        result.entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .forEach(e -> builder
                        .append("\"")
                        .append(e.getKey())
                        .append("\":")
                        .append(e.getValue())
                        .append(", "));
        builder.delete(builder.length() - 2, builder.length() - 1);
        return builder.toString();
    }
}
