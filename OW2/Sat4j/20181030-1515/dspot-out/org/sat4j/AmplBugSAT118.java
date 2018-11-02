package org.sat4j;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.sat4j.core.VecInt;
import org.sat4j.minisat.SolverFactory;
import org.sat4j.minisat.constraints.cnf.OriginalBinaryClause;
import org.sat4j.minisat.constraints.cnf.UnitClause;
import org.sat4j.specs.ContradictionException;
import org.sat4j.specs.IConstr;
import org.sat4j.specs.ISolver;
import org.sat4j.specs.IVecInt;
import org.sat4j.specs.TimeoutException;


public class AmplBugSAT118 {
    private ISolver solver;

    @Before
    public void setUp() {
        solver = SolverFactory.newDefault();
    }

    @Test(timeout = 30000)
    public void test() throws Exception, ContradictionException, TimeoutException {
        IVecInt clause = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause)).toString());
        Assert.assertTrue(((VecInt) (clause)).isEmpty());
        IVecInt o_test__3 = clause.push((-1)).push(2);
        Assert.assertEquals("-1,2", ((VecInt) (o_test__3)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_test__3)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test__3)).isEmpty());
        IConstr o_test__6 = solver.addClause(clause);
        int[] array_478132801 = new int[]{3,4};
        	int[] array_776558984 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test__6).getLits();
        	for(int ii = 0; ii <array_478132801.length; ii++) {
        		org.junit.Assert.assertEquals(array_478132801[ii], array_776558984[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_test__6)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_test__6)).getActivity())), 0.1);
        Assert.assertEquals("-1[?] 2[?]", ((OriginalBinaryClause) (o_test__6)).toString());
        Assert.assertEquals(3, ((int) (((OriginalBinaryClause) (o_test__6)).hashCode())));
        clause.clear();
        IVecInt o_test__8 = clause.push(1);
        Assert.assertEquals("1", ((VecInt) (o_test__8)).toString());
        Assert.assertEquals(1, ((int) (((VecInt) (o_test__8)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test__8)).isEmpty());
        IConstr o_test__9 = solver.addClause(clause);
        Assert.assertTrue(((UnitClause) (o_test__9)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_test__9)).getActivity())), 0.1);
        Assert.assertEquals("1", ((UnitClause) (o_test__9)).toString());
        clause.clear();
        IVecInt o_test__11 = clause.push((-2));
        Assert.assertEquals("-2", ((VecInt) (o_test__11)).toString());
        Assert.assertEquals(-2, ((int) (((VecInt) (o_test__11)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test__11)).isEmpty());
        IConstr o_test__13 = solver.addClause(clause);
        Assert.assertTrue(((UnitClause) (o_test__13)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_test__13)).getActivity())), 0.1);
        Assert.assertEquals("-2", ((UnitClause) (o_test__13)).toString());
        solver.isSatisfiable();
        this.solver.unsatExplanation();
    }
}

