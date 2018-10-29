package org.sat4j;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.sat4j.core.VecInt;
import org.sat4j.minisat.SolverFactory;
import org.sat4j.specs.ContradictionException;
import org.sat4j.specs.ISolver;
import org.sat4j.specs.TimeoutException;


public class BugSAT18 {
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

    @Test(timeout = 10000)
    public void testSingle1() throws Exception, ContradictionException, TimeoutException {
        boolean o_testSingle1__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 4, -3 }));
        Assert.assertFalse(o_testSingle1__1);
    }
}

