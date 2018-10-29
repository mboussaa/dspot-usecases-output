package org.sat4j.core;


import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.sat4j.specs.IVec;


public class AmplVecTest {
    private IVec<Integer> myvec;

    public AmplVecTest(String arg0) {
        super(arg0);
    }

    @Before
    public void setUp() throws Exception {
        this.myvec = new Vec<Integer>();
    }

    @After
    public void tearDown() throws Exception {
    }
}

