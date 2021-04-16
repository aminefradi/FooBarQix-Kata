package com.kata.fooBarQix;

import java.util.HashMap;
import java.util.Map;
import static java.util.stream.Collectors.joining;

public class FooBarQix {

    private static final Map<Integer, String> replacementMap = createReplacementMap();

    private static Map<Integer, String> createReplacementMap() {
        Map<Integer, String> map = new HashMap<>();
        map.put(3, "Foo");
        map.put(5, "Bar");
        map.put(7, "Qix");
        return map;
    }

    /**
     * Compute FooBarQix
     * @param number
     * @return
     */
    public String compute(Integer number) {

        String stringNumber = String.valueOf(number);
        String result = "";

        // Replace if number divisible
        result += replaceIfDivisible(number);

        // Replace if number exists
        result += replaceIfNumberExists(stringNumber);

        return result.isEmpty() ? stringNumber : result;
    }

    private String replaceIfNumberExists(String stringNumber) {
        return stringNumber.chars() //
                           .mapToObj(FooBarQix::replaceChar) //
                           .collect(joining());
    }

    private String replaceIfDivisible(Integer number) {
        return replacementMap.keySet().stream() //
                                      .filter(numberToReplace -> number % numberToReplace == 0) //
                                      .map(replacementMap::get) //
                                      .collect(joining());
    }

    private static String replaceChar(int digitChar) {
        int digit = Character.getNumericValue(digitChar);
        return replacementMap.getOrDefault(digit, "");
    }

}
