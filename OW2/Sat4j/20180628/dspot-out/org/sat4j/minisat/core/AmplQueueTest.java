package org.sat4j.minisat.core;


import junit.framework.TestCase;
import org.junit.Before;


public class AmplQueueTest {
    private IntQueue qu;

    public AmplQueueTest(String arg0) {
        super(arg0);
    }

    @Before
    public void setUp() throws Exception {
        this.qu = new IntQueue();
    }
}

