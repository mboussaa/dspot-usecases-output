package org.sat4j;


import org.junit.Before;
import org.sat4j.core.VecInt;
import org.sat4j.minisat.SolverFactory;
import org.sat4j.specs.ContradictionException;
import org.sat4j.specs.ISolver;


public class AmplBugSAT18 {
    private ISolver solver;

    @Before
    public void setup() throws ContradictionException {
        this.solver = SolverFactory.newDefault();
        this.solver.setTimeout(15);
        this.solver.addClause(new VecInt(new int[]{ 1 }));
        this.solver.addClause(new VecInt(new int[]{ -1, 2 }));
        this.solver.addClause(new VecInt(new int[]{ -1, 3 }));
        this.solver.addClause(new VecInt(new int[]{ -2, 1 }));
        this.solver.addClause(new VecInt(new int[]{ -4, 1 }));
        this.solver.addClause(new VecInt(new int[]{ -3, 1 }));
        this.solver.addClause(new VecInt(new int[]{ -3, 5 }));
        this.solver.addClause(new VecInt(new int[]{ -5, 3 }));
        this.solver.addClause(new VecInt(new int[]{ 6 }));
        this.solver.addClause(new VecInt(new int[]{ -7 }));
        this.solver.addClause(new VecInt(new int[]{ 2, 5, 4, 6 }));
    }
}

