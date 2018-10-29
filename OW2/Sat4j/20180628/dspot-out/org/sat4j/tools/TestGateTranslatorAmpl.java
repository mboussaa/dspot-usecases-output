package org.sat4j.tools;


import org.junit.Before;
import org.sat4j.minisat.SolverFactory;
import org.sat4j.specs.ISolver;


public class TestGateTranslatorAmpl {
    private ISolver solver;

    private GateTranslator gator;

    @Before
    public void startUp() {
        this.solver = SolverFactory.newDefault();
        this.gator = new GateTranslator(this.solver);
    }
}

