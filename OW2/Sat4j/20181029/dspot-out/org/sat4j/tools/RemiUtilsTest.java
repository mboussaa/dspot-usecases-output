package org.sat4j.tools;


import org.junit.Assert;
import org.junit.Test;
import org.sat4j.core.VecInt;
import org.sat4j.minisat.SolverFactory;
import org.sat4j.specs.ContradictionException;
import org.sat4j.specs.ISolver;
import org.sat4j.specs.IVecInt;
import org.sat4j.specs.TimeoutException;


public class RemiUtilsTest {
    @Test(timeout = 10000)
    public void testBugUnitClauses() throws Exception, ContradictionException, TimeoutException {
        ISolver solver1 = SolverFactory.newDefault();
        ISolver solver2 = SolverFactory.newDefault();
        ISolver solver3 = SolverFactory.newDefault();
        int[][] cnf1 = new int[][]{ new int[]{ 1 }, new int[]{ 1, -2 }, new int[]{ 1, -3 }, new int[]{ -1, 2 } };
        int[][] cnf2 = new int[][]{ new int[]{ -1, 2 }, new int[]{ 1, -2 }, new int[]{ 1, -3 }, new int[]{ 1 } };
        int[][] cnf3 = new int[][]{ new int[]{ 1, -2 }, new int[]{ -1, 3 }, new int[]{ 1, -3 }, new int[]{ 1 } };
        for (int[] is : cnf1) {
            solver1.addClause(new VecInt(is));
        }
        for (int[] is : cnf2) {
            solver2.addClause(new VecInt(is));
        }
        for (int[] is : cnf3) {
            solver3.addClause(new VecInt(is));
        }
        IVecInt vecInt1 = RemiUtils.backbone(solver1);
        int o_testBugUnitClauses__42 = vecInt1.size();
        Assert.assertEquals(2, ((int) (o_testBugUnitClauses__42)));
        boolean o_testBugUnitClauses__43 = vecInt1.contains(1);
        Assert.assertTrue(o_testBugUnitClauses__43);
        boolean o_testBugUnitClauses__44 = vecInt1.contains(2);
        Assert.assertTrue(o_testBugUnitClauses__44);
        IVecInt vecInt2 = RemiUtils.backbone(solver2);
        int o_testBugUnitClauses__47 = vecInt2.size();
        Assert.assertEquals(2, ((int) (o_testBugUnitClauses__47)));
        boolean o_testBugUnitClauses__48 = vecInt2.contains(1);
        Assert.assertTrue(o_testBugUnitClauses__48);
        boolean o_testBugUnitClauses__49 = vecInt2.contains(2);
        Assert.assertTrue(o_testBugUnitClauses__49);
        IVecInt vecInt3 = RemiUtils.backbone(solver3);
        int o_testBugUnitClauses__52 = vecInt3.size();
        Assert.assertEquals(2, ((int) (o_testBugUnitClauses__52)));
        boolean o_testBugUnitClauses__53 = vecInt3.contains(1);
        Assert.assertTrue(o_testBugUnitClauses__53);
        boolean o_testBugUnitClauses__54 = vecInt3.contains(3);
        Assert.assertTrue(o_testBugUnitClauses__54);
        Assert.assertEquals(2, ((int) (o_testBugUnitClauses__42)));
        Assert.assertTrue(o_testBugUnitClauses__43);
        Assert.assertTrue(o_testBugUnitClauses__44);
        Assert.assertEquals(2, ((int) (o_testBugUnitClauses__47)));
        Assert.assertTrue(o_testBugUnitClauses__48);
        Assert.assertTrue(o_testBugUnitClauses__49);
        Assert.assertEquals(2, ((int) (o_testBugUnitClauses__52)));
        Assert.assertTrue(o_testBugUnitClauses__53);
    }
}

