package com.rocket.rpc;

import org.junit.Test;

import static org.junit.Assert.*;

public class JSONDecoderTest {

    @Test
    public void decode() {
        Encoder encoder = new JSONEncoder();
        TestClass testClass = new TestClass();
        testClass.setName("panson");
        testClass.setAge(21);
        byte[] encodeBytes = encoder.encode(testClass);

        Decoder decoder = new JSONDecoder();
        TestClass testClass1 = decoder.decode(encodeBytes, TestClass.class);
        assertNotNull(testClass1);
        assertEquals(testClass.getAge(), testClass1.getAge());
        assertEquals(testClass.getName(), testClass1.getName());
    }
}