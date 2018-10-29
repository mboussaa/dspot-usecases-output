package org.sat4j;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.sat4j.core.VecInt;
import org.sat4j.minisat.SolverFactory;
import org.sat4j.minisat.constraints.cnf.OriginalBinaryClause;
import org.sat4j.minisat.constraints.cnf.UnitClause;
import org.sat4j.opt.MinOneDecorator;
import org.sat4j.specs.ContradictionException;
import org.sat4j.specs.IConstr;
import org.sat4j.specs.IVecInt;
import org.sat4j.specs.TimeoutException;
import org.sat4j.tools.OptToSatAdapter;


public class BugSAT107 {
    private OptToSatAdapter solver;

    @Before
    public void setUp() throws ContradictionException {
        solver = new OptToSatAdapter(new MinOneDecorator(SolverFactory.newDefault()));
        solver.newVar(100);
        IVecInt clause = new VecInt();
        for (int i = 2; i < 100; i++) {
            clause.push((-1)).push(i);
            solver.addClause(clause);
            clause.clear();
            clause.push((-i)).push((i + 1));
            solver.addClause(clause);
        }
        clause.clear();
        for (int i = 1; i <= 10; i++) {
            clause.push(i);
        }
        solver.addClause(clause);
    }

    @Test(timeout = 10000)
    public void testNoSolutionfound_failAssert0() throws Exception, TimeoutException {
        try {
            solver.setTimeoutOnConflicts(1);
            solver.isSatisfiable();
            org.junit.Assert.fail("testNoSolutionfound should have thrown TimeoutException");
        } catch (TimeoutException expected) {
            Assert.assertEquals(" Timeout (1 conflicts) exceeded", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testNoSolutionExists() throws Exception, ContradictionException, TimeoutException {
        IVecInt clause = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause)).toString());
        Assert.assertTrue(((VecInt) (clause)).isEmpty());
        IVecInt o_testNoSolutionExists__3 = clause.push(100).push(99);
        Assert.assertEquals("100,99", ((VecInt) (o_testNoSolutionExists__3)).toString());
        Assert.assertEquals(99, ((int) (((VecInt) (o_testNoSolutionExists__3)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExists__3)).isEmpty());
        IConstr o_testNoSolutionExists__5 = solver.addClause(clause);
        Assert.assertFalse(((OriginalBinaryClause) (o_testNoSolutionExists__5)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testNoSolutionExists__5)).getActivity())), 0.1);
        int[] array_1150482841 = new int[]{198,200};
        	int[] array_1434614297 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists__5).getLits();
        	for(int ii = 0; ii <array_1150482841.length; ii++) {
        		org.junit.Assert.assertEquals(array_1150482841[ii], array_1434614297[ii]);
        	};
        Assert.assertEquals("99[?] 100[?]", ((OriginalBinaryClause) (o_testNoSolutionExists__5)).toString());
        Assert.assertEquals(199, ((int) (((OriginalBinaryClause) (o_testNoSolutionExists__5)).hashCode())));
        clause.clear();
        IVecInt o_testNoSolutionExists__7 = clause.push((-99));
        Assert.assertEquals("-99", ((VecInt) (o_testNoSolutionExists__7)).toString());
        Assert.assertEquals(-99, ((int) (((VecInt) (o_testNoSolutionExists__7)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExists__7)).isEmpty());
        IConstr o_testNoSolutionExists__9 = solver.addClause(clause);
        Assert.assertTrue(((UnitClause) (o_testNoSolutionExists__9)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_testNoSolutionExists__9)).getActivity())), 0.1);
        Assert.assertEquals("-99", ((UnitClause) (o_testNoSolutionExists__9)).toString());
        clause.clear();
        IVecInt o_testNoSolutionExists__11 = clause.push((-100));
        Assert.assertEquals("-100", ((VecInt) (o_testNoSolutionExists__11)).toString());
        Assert.assertEquals(-100, ((int) (((VecInt) (o_testNoSolutionExists__11)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExists__11)).isEmpty());
        IConstr o_testNoSolutionExists__13 = solver.addClause(clause);
        Assert.assertTrue(((UnitClause) (o_testNoSolutionExists__13)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_testNoSolutionExists__13)).getActivity())), 0.1);
        Assert.assertEquals("-100", ((UnitClause) (o_testNoSolutionExists__13)).toString());
        clause.clear();
        this.solver.isSatisfiable();
        Assert.assertEquals("", ((VecInt) (clause)).toString());
        Assert.assertTrue(((VecInt) (clause)).isEmpty());
        Assert.assertEquals("", ((VecInt) (o_testNoSolutionExists__3)).toString());
        Assert.assertTrue(((VecInt) (o_testNoSolutionExists__3)).isEmpty());
        Assert.assertFalse(((OriginalBinaryClause) (o_testNoSolutionExists__5)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testNoSolutionExists__5)).getActivity())), 0.1);
        int[] array_156591366 = new int[]{198,200};
        	int[] array_825130495 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists__5).getLits();
        	for(int ii = 0; ii <array_156591366.length; ii++) {
        		org.junit.Assert.assertEquals(array_156591366[ii], array_825130495[ii]);
        	};
        Assert.assertEquals("99[F] 100[F]", ((OriginalBinaryClause) (o_testNoSolutionExists__5)).toString());
        Assert.assertEquals(199, ((int) (((OriginalBinaryClause) (o_testNoSolutionExists__5)).hashCode())));
        Assert.assertEquals("", ((VecInt) (o_testNoSolutionExists__7)).toString());
        Assert.assertTrue(((VecInt) (o_testNoSolutionExists__7)).isEmpty());
        Assert.assertTrue(((UnitClause) (o_testNoSolutionExists__9)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_testNoSolutionExists__9)).getActivity())), 0.1);
        Assert.assertEquals("-99", ((UnitClause) (o_testNoSolutionExists__9)).toString());
        Assert.assertEquals("", ((VecInt) (o_testNoSolutionExists__11)).toString());
        Assert.assertTrue(((VecInt) (o_testNoSolutionExists__11)).isEmpty());
        Assert.assertTrue(((UnitClause) (o_testNoSolutionExists__13)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_testNoSolutionExists__13)).getActivity())), 0.1);
        Assert.assertEquals("-100", ((UnitClause) (o_testNoSolutionExists__13)).toString());
    }
}

