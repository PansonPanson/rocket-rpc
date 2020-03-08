package com.rocket.rpc;

import org.junit.Test;

import static org.junit.Assert.*;

public class JSONEncoderTest {

    @Test
    public void encode() {
        Encoder encoder = new JSONEncoder();
        TestClass testClass = new TestClass();
        testClass.setName("panson");
        testClass.setAge(21);
        byte[] encodeBytes = encoder.encode(testClass);
        assertNotNull(encodeBytes);
    }
}