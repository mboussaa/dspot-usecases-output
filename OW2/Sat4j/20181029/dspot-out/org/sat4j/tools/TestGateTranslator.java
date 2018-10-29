package org.sat4j.tools;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.sat4j.core.VecInt;
import org.sat4j.minisat.SolverFactory;
import org.sat4j.specs.ContradictionException;
import org.sat4j.specs.ISolver;
import org.sat4j.specs.TimeoutException;


public class TestGateTranslator {
    private ISolver solver;

    private GateTranslator gator;

    @Before
    public void startUp() {
        this.solver = SolverFactory.newDefault();
        this.gator = new GateTranslator(this.solver);
    }

    @Test(timeout = 10000)
    public void testSATIfThen3() throws Exception, ContradictionException, TimeoutException {
        gator.it(1, 2, 3);
        boolean o_testSATIfThen3__2 = this.gator.isSatisfiable(new VecInt(new int[]{ 1, -2, 3 }));
        Assert.assertTrue(o_testSATIfThen3__2);
    }

    @Test(timeout = 10000)
    public void testSATIfThen5() throws Exception, ContradictionException, TimeoutException {
        gator.it(1, 2, 3);
        boolean o_testSATIfThen5__2 = this.gator.isSatisfiable(new VecInt(new int[]{ -1, 2, 3 }));
        Assert.assertFalse(o_testSATIfThen5__2);
    }
}

