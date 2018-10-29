package org.sat4j.minisat.core;


import junit.framework.TestCase;
import org.junit.Before;
import org.sat4j.minisat.SolverFactory;
import org.sat4j.specs.ISolver;


public class TestAtMostAmpl {
    private ISolver solver;

    public TestAtMostAmpl(String s) {
        super(s);
    }

    @Before
    public void setUp() {
        this.solver = SolverFactory.newMiniSATHeap();
    }
}

