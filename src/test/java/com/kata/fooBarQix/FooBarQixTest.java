package com.kata.fooBarQix;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.AbstractMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FooBarQixTest {

    private FooBarQix fooBarQix;
    private static Map<Integer, String> testExamples = Stream.of(
            new AbstractMap.SimpleEntry<>(1, "1"),
            new AbstractMap.SimpleEntry<>(2, "2"),
            new AbstractMap.SimpleEntry<>(3, "FooFoo"),
            new AbstractMap.SimpleEntry<>(4, "4"),
            new AbstractMap.SimpleEntry<>(5, "BarBar"),
            new AbstractMap.SimpleEntry<>(6, "Foo"),
            new AbstractMap.SimpleEntry<>(7, "QixQix"),
            new AbstractMap.SimpleEntry<>(8, "8"),
            new AbstractMap.SimpleEntry<>(9, "Foo"),
            new AbstractMap.SimpleEntry<>(10, "Bar"),
            new AbstractMap.SimpleEntry<>(13, "Foo"),
            new AbstractMap.SimpleEntry<>(15, "FooBarBar"),
            new AbstractMap.SimpleEntry<>(21, "FooQix"),
            new AbstractMap.SimpleEntry<>(33, "FooFooFoo"),
            new AbstractMap.SimpleEntry<>(51, "FooBar"),
            new AbstractMap.SimpleEntry<>(53, "BarFoo"))
            .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));


    @Before
    public void setUp(){
        fooBarQix = new FooBarQix();
    }

    @Test
    public void should_return_like_test_examples() {

        testExamples.keySet().stream()
                             .forEach(value -> Assert.assertEquals(testExamples.get(value), fooBarQix.compute(value)));

    }


}
