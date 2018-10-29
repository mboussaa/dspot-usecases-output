package org.sat4j;


import org.junit.Before;
import org.sat4j.minisat.SolverFactory;
import org.sat4j.specs.ISolver;


public class TestSolverEngineAmpl {
    private ISolver solver;

    @Before
    public void startUp() {
        solver = SolverFactory.newDefault();
    }
}

