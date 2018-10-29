package org.sat4j;


import org.junit.Before;
import org.sat4j.core.VecInt;
import org.sat4j.minisat.SolverFactory;
import org.sat4j.specs.ContradictionException;
import org.sat4j.specs.ISolver;


public class AmplBugSAT17 {
    private ISolver solver;

    @Before
    public void setup() throws ContradictionException {
        this.solver = SolverFactory.newDefault();
        this.solver.addClause(new VecInt(new int[]{ 1 }));
        this.solver.addClause(new VecInt(new int[]{ 2 }));
    }
}

