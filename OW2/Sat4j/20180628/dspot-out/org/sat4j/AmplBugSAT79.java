package org.sat4j;


import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Ignore;
import org.junit.runners.MethodSorters;
import org.sat4j.core.VecInt;
import org.sat4j.minisat.SolverFactory;
import org.sat4j.specs.ISolver;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@Ignore
public class AmplBugSAT79 {
    private ISolver solver;

    @Before
    public void setUp() throws Exception {
        solver = SolverFactory.newDefault();
        solver.addClause(new VecInt(new int[]{ 1, -2, 3 }));
    }
}

