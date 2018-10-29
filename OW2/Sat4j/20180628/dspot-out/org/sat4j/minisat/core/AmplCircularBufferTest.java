package org.sat4j.minisat.core;


import org.junit.Before;


public class AmplCircularBufferTest {
    private CircularBuffer buffer;

    @Before
    public void setUp() throws Exception {
        this.buffer = new CircularBuffer(5);
    }
}

