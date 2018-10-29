package org.sat4j.minisat.core;


import org.junit.Assert;
import org.junit.Test;
import org.sat4j.core.VecInt;
import org.sat4j.minisat.SolverFactory;
import org.sat4j.minisat.constraints.cnf.UnitClause;
import org.sat4j.specs.ContradictionException;
import org.sat4j.specs.IConstr;
import org.sat4j.specs.ISolver;
import org.sat4j.specs.TimeoutException;


public class BugThomas {
    @Test(timeout = 10000)
    public void testBugReport() throws Exception, ContradictionException, TimeoutException {
        ISolver solver = SolverFactory.newDefault();
        int o_testBugReport__3 = solver.newVar(3);
        Assert.assertEquals(3, ((int) (o_testBugReport__3)));
        IConstr o_testBugReport__4 = solver.addClause(new VecInt(new int[]{ 1 }));
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_testBugReport__4)).getActivity())), 0.1);
        Assert.assertTrue(((UnitClause) (o_testBugReport__4)).isSatisfied());
        Assert.assertEquals("1", ((UnitClause) (o_testBugReport__4)).toString());
        IConstr o_testBugReport__6 = solver.addClause(new VecInt(new int[]{ -1, 2 }));
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_testBugReport__6)).getActivity())), 0.1);
        Assert.assertTrue(((UnitClause) (o_testBugReport__6)).isSatisfied());
        Assert.assertEquals("2", ((UnitClause) (o_testBugReport__6)).toString());
        solver.addClause(new VecInt(new int[]{ 1, -2 }));
        solver.addClause(new VecInt(new int[]{ -3 }));
        solver.newVar(1);
        solver.isSatisfiable(new VecInt(new int[]{ -4 }));
    }
}

