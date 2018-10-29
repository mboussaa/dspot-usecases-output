package org.sat4j;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.sat4j.core.VecInt;
import org.sat4j.minisat.SolverFactory;
import org.sat4j.specs.ContradictionException;
import org.sat4j.specs.ISolver;
import org.sat4j.specs.TimeoutException;


public class BugSAT17 {
    private ISolver solver;

    @Before
    public void setup() throws ContradictionException {
        this.solver = SolverFactory.newDefault();
        this.solver.addClause(new VecInt(new int[]{ 1 }));
        this.solver.addClause(new VecInt(new int[]{ 2 }));
    }

    @Test(timeout = 10000)
    public void testInconsistentLits() throws Exception, ContradictionException, TimeoutException {
        boolean o_testInconsistentLits__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 2, -2 }));
        Assert.assertFalse(o_testInconsistentLits__1);
    }
}

