package org.sat4j.tools;


import java.math.BigInteger;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.sat4j.core.Vec;
import org.sat4j.core.VecInt;
import org.sat4j.minisat.SolverFactory;
import org.sat4j.specs.ContradictionException;
import org.sat4j.specs.ISolver;
import org.sat4j.specs.IVec;
import org.sat4j.specs.IVecInt;
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
    public void testTwoValues() throws Exception, ContradictionException {
        IVecInt literals = new VecInt().push(1).push(2);
        IVec<BigInteger> coefs = new Vec<BigInteger>().push(BigInteger.valueOf(3)).push(BigInteger.valueOf(6));
        IVecInt result = new VecInt();
        this.gator.optimisationFunction(literals, coefs, result);
        System.out.println(result);
        int o_testTwoValues__15 = result.size();
        Assert.assertEquals(4, ((int) (o_testTwoValues__15)));
    }

    @Test(timeout = 10000)
    public void testSATIfThen1() throws Exception, ContradictionException, TimeoutException {
        gator.it(1, 2, 3);
        boolean o_testSATIfThen1__2 = this.gator.isSatisfiable(new VecInt(new int[]{ 1, 2, 3 }));
        Assert.assertTrue(o_testSATIfThen1__2);
    }

    @Test(timeout = 10000)
    public void testSATIfThen2() throws Exception, ContradictionException, TimeoutException {
        gator.it(1, 2, 3);
        boolean o_testSATIfThen2__2 = this.gator.isSatisfiable(new VecInt(new int[]{ 1, 2, -3 }));
        Assert.assertFalse(o_testSATIfThen2__2);
    }

    @Test(timeout = 10000)
    public void testSATIfThen6() throws Exception, ContradictionException, TimeoutException {
        gator.it(1, 2, 3);
        boolean o_testSATIfThen6__2 = this.gator.isSatisfiable(new VecInt(new int[]{ -1, 2, -3 }));
        Assert.assertTrue(o_testSATIfThen6__2);
    }
}

