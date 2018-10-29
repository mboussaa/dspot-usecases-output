package org.sat4j.minisat.core;


import org.junit.Assert;
import org.junit.Test;
import org.sat4j.core.VecInt;
import org.sat4j.minisat.SolverFactory;
import org.sat4j.specs.ContradictionException;
import org.sat4j.specs.ISolver;
import org.sat4j.specs.IVecInt;
import org.sat4j.specs.TimeoutException;


public class BugTrivialAssumption {
    @Test(timeout = 10000)
    public void testEasyInconsistencyInAssumption() throws Exception, ContradictionException, TimeoutException {
        final ISolver solver = SolverFactory.newDefault();
        int o_testEasyInconsistencyInAssumption__3 = solver.newVar(1);
        Assert.assertEquals(1, ((int) (o_testEasyInconsistencyInAssumption__3)));
        boolean o_testEasyInconsistencyInAssumption__4 = solver.isSatisfiable(new VecInt(new int[]{ -1, 1 }));
        Assert.assertFalse(o_testEasyInconsistencyInAssumption__4);
        IVecInt explanation = solver.unsatExplanation();
        boolean o_testEasyInconsistencyInAssumption__9 = explanation.contains((-1));
        Assert.assertTrue(o_testEasyInconsistencyInAssumption__9);
        boolean o_testEasyInconsistencyInAssumption__11 = explanation.contains(1);
        Assert.assertTrue(o_testEasyInconsistencyInAssumption__11);
        int o_testEasyInconsistencyInAssumption__12 = explanation.size();
        Assert.assertEquals(2, ((int) (o_testEasyInconsistencyInAssumption__12)));
        Assert.assertEquals(1, ((int) (o_testEasyInconsistencyInAssumption__3)));
        Assert.assertFalse(o_testEasyInconsistencyInAssumption__4);
        Assert.assertTrue(o_testEasyInconsistencyInAssumption__9);
        Assert.assertTrue(o_testEasyInconsistencyInAssumption__11);
    }
}

