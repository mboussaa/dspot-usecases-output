package org.sat4j.minisat.core;


import org.junit.Before;
import org.sat4j.core.VecInt;
import org.sat4j.minisat.SolverFactory;
import org.sat4j.specs.ContradictionException;
import org.sat4j.specs.ISolver;
import org.sat4j.specs.IVecInt;


public class AmplBugSAT117 {
    private ISolver solver;

    @Before
    public void setUp() throws ContradictionException {
        solver = SolverFactory.newDefault();
        IVecInt clause = new VecInt();
        clause.push(1).push(2).push(3);
        solver.addClause(clause);
    }
}

