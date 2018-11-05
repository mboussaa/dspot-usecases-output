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


public class AmplBugSAT107 {
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

    @Test(timeout = 30000)
    public void testNoSolutionExists() throws Exception, ContradictionException, TimeoutException {
        IVecInt clause = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause)).toString());
        Assert.assertTrue(((VecInt) (clause)).isEmpty());
        IVecInt o_testNoSolutionExists__3 = clause.push(100).push(99);
        Assert.assertEquals("100,99", ((VecInt) (o_testNoSolutionExists__3)).toString());
        Assert.assertEquals(99, ((int) (((VecInt) (o_testNoSolutionExists__3)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExists__3)).isEmpty());
        IConstr o_testNoSolutionExists__5 = solver.addClause(clause);
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testNoSolutionExists__5)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalBinaryClause) (o_testNoSolutionExists__5)).isSatisfied());
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
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_testNoSolutionExists__9)).getActivity())), 0.1);
        Assert.assertTrue(((UnitClause) (o_testNoSolutionExists__9)).isSatisfied());
        Assert.assertEquals("-99", ((UnitClause) (o_testNoSolutionExists__9)).toString());
        clause.clear();
        IVecInt o_testNoSolutionExists__11 = clause.push((-100));
        Assert.assertEquals("-100", ((VecInt) (o_testNoSolutionExists__11)).toString());
        Assert.assertEquals(-100, ((int) (((VecInt) (o_testNoSolutionExists__11)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExists__11)).isEmpty());
        IConstr o_testNoSolutionExists__13 = solver.addClause(clause);
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_testNoSolutionExists__13)).getActivity())), 0.1);
        Assert.assertTrue(((UnitClause) (o_testNoSolutionExists__13)).isSatisfied());
        Assert.assertEquals("-100", ((UnitClause) (o_testNoSolutionExists__13)).toString());
        clause.clear();
        this.solver.isSatisfiable();
        Assert.assertEquals("", ((VecInt) (clause)).toString());
        Assert.assertTrue(((VecInt) (clause)).isEmpty());
        Assert.assertEquals("", ((VecInt) (o_testNoSolutionExists__3)).toString());
        Assert.assertTrue(((VecInt) (o_testNoSolutionExists__3)).isEmpty());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testNoSolutionExists__5)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalBinaryClause) (o_testNoSolutionExists__5)).isSatisfied());
        int[] array_156591366 = new int[]{198,200};
        	int[] array_825130495 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists__5).getLits();
        	for(int ii = 0; ii <array_156591366.length; ii++) {
        		org.junit.Assert.assertEquals(array_156591366[ii], array_825130495[ii]);
        	};
        Assert.assertEquals("99[F] 100[F]", ((OriginalBinaryClause) (o_testNoSolutionExists__5)).toString());
        Assert.assertEquals(199, ((int) (((OriginalBinaryClause) (o_testNoSolutionExists__5)).hashCode())));
        Assert.assertEquals("", ((VecInt) (o_testNoSolutionExists__7)).toString());
        Assert.assertTrue(((VecInt) (o_testNoSolutionExists__7)).isEmpty());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_testNoSolutionExists__9)).getActivity())), 0.1);
        Assert.assertTrue(((UnitClause) (o_testNoSolutionExists__9)).isSatisfied());
        Assert.assertEquals("-99", ((UnitClause) (o_testNoSolutionExists__9)).toString());
        Assert.assertEquals("", ((VecInt) (o_testNoSolutionExists__11)).toString());
        Assert.assertTrue(((VecInt) (o_testNoSolutionExists__11)).isEmpty());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_testNoSolutionExists__13)).getActivity())), 0.1);
        Assert.assertTrue(((UnitClause) (o_testNoSolutionExists__13)).isSatisfied());
        Assert.assertEquals("-100", ((UnitClause) (o_testNoSolutionExists__13)).toString());
    }

    @Test(timeout = 30000)
    public void testNoSolutionExists_remove2() throws Exception, ContradictionException, TimeoutException {
        IVecInt clause = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause)).toString());
        Assert.assertTrue(((VecInt) (clause)).isEmpty());
        IVecInt o_testNoSolutionExists_remove2__3 = clause.push(100).push(99);
        Assert.assertEquals("100,99", ((VecInt) (o_testNoSolutionExists_remove2__3)).toString());
        Assert.assertEquals(99, ((int) (((VecInt) (o_testNoSolutionExists_remove2__3)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExists_remove2__3)).isEmpty());
        clause.clear();
        clause.clear();
        clause.clear();
        IVecInt o_testNoSolutionExists_remove2__6 = clause.push((-99));
        Assert.assertEquals("-99", ((VecInt) (o_testNoSolutionExists_remove2__6)).toString());
        Assert.assertEquals(-99, ((int) (((VecInt) (o_testNoSolutionExists_remove2__6)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExists_remove2__6)).isEmpty());
        IConstr o_testNoSolutionExists_remove2__8 = solver.addClause(clause);
        Assert.assertTrue(((UnitClause) (o_testNoSolutionExists_remove2__8)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_testNoSolutionExists_remove2__8)).getActivity())), 0.1);
        Assert.assertEquals("-99", ((UnitClause) (o_testNoSolutionExists_remove2__8)).toString());
        IVecInt o_testNoSolutionExists_remove2__10 = clause.push((-100));
        Assert.assertEquals("-100", ((VecInt) (o_testNoSolutionExists_remove2__10)).toString());
        Assert.assertEquals(-100, ((int) (((VecInt) (o_testNoSolutionExists_remove2__10)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExists_remove2__10)).isEmpty());
        IConstr o_testNoSolutionExists_remove2__12 = solver.addClause(clause);
        Assert.assertTrue(((UnitClause) (o_testNoSolutionExists_remove2__12)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_testNoSolutionExists_remove2__12)).getActivity())), 0.1);
        Assert.assertEquals("-100", ((UnitClause) (o_testNoSolutionExists_remove2__12)).toString());
        this.solver.isSatisfiable();
        Assert.assertEquals("", ((VecInt) (clause)).toString());
        Assert.assertTrue(((VecInt) (clause)).isEmpty());
        Assert.assertEquals("", ((VecInt) (o_testNoSolutionExists_remove2__3)).toString());
        Assert.assertTrue(((VecInt) (o_testNoSolutionExists_remove2__3)).isEmpty());
        Assert.assertEquals("", ((VecInt) (o_testNoSolutionExists_remove2__6)).toString());
        Assert.assertTrue(((VecInt) (o_testNoSolutionExists_remove2__6)).isEmpty());
        Assert.assertTrue(((UnitClause) (o_testNoSolutionExists_remove2__8)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_testNoSolutionExists_remove2__8)).getActivity())), 0.1);
        Assert.assertEquals("-99", ((UnitClause) (o_testNoSolutionExists_remove2__8)).toString());
        Assert.assertEquals("", ((VecInt) (o_testNoSolutionExists_remove2__10)).toString());
        Assert.assertTrue(((VecInt) (o_testNoSolutionExists_remove2__10)).isEmpty());
        Assert.assertTrue(((UnitClause) (o_testNoSolutionExists_remove2__12)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_testNoSolutionExists_remove2__12)).getActivity())), 0.1);
        Assert.assertEquals("-100", ((UnitClause) (o_testNoSolutionExists_remove2__12)).toString());
    }

    @Test(timeout = 30000)
    public void testNoSolutionExists_remove3() throws Exception, ContradictionException, TimeoutException {
        IVecInt clause = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause)).toString());
        Assert.assertTrue(((VecInt) (clause)).isEmpty());
        IVecInt o_testNoSolutionExists_remove3__3 = clause.push(100).push(99);
        Assert.assertEquals("100,99", ((VecInt) (o_testNoSolutionExists_remove3__3)).toString());
        Assert.assertEquals(99, ((int) (((VecInt) (o_testNoSolutionExists_remove3__3)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExists_remove3__3)).isEmpty());
        IConstr o_testNoSolutionExists_remove3__5 = solver.addClause(clause);
        Assert.assertFalse(((OriginalBinaryClause) (o_testNoSolutionExists_remove3__5)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testNoSolutionExists_remove3__5)).getActivity())), 0.1);
        int[] array_960144037 = new int[]{198,200};
        	int[] array_619987209 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove3__5).getLits();
        	for(int ii = 0; ii <array_960144037.length; ii++) {
        		org.junit.Assert.assertEquals(array_960144037[ii], array_619987209[ii]);
        	};
        Assert.assertEquals("99[?] 100[?]", ((OriginalBinaryClause) (o_testNoSolutionExists_remove3__5)).toString());
        Assert.assertEquals(199, ((int) (((OriginalBinaryClause) (o_testNoSolutionExists_remove3__5)).hashCode())));
        IVecInt o_testNoSolutionExists_remove3__6 = clause.push((-99));
        Assert.assertEquals("100,99,-99", ((VecInt) (o_testNoSolutionExists_remove3__6)).toString());
        Assert.assertEquals(33, ((int) (((VecInt) (o_testNoSolutionExists_remove3__6)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExists_remove3__6)).isEmpty());
        solver.addClause(clause);
        solver.addClause(clause);
        clause.clear();
        clause.clear();
        clause.push((-100));
        this.solver.isSatisfiable();
    }

    @Test(timeout = 30000)
    public void testNoSolutionExists_remove5() throws Exception, ContradictionException, TimeoutException {
        IVecInt clause = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause)).toString());
        Assert.assertTrue(((VecInt) (clause)).isEmpty());
        IVecInt o_testNoSolutionExists_remove5__3 = clause.push(100).push(99);
        Assert.assertEquals("100,99", ((VecInt) (o_testNoSolutionExists_remove5__3)).toString());
        Assert.assertEquals(99, ((int) (((VecInt) (o_testNoSolutionExists_remove5__3)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExists_remove5__3)).isEmpty());
        IConstr o_testNoSolutionExists_remove5__5 = solver.addClause(clause);
        Assert.assertFalse(((OriginalBinaryClause) (o_testNoSolutionExists_remove5__5)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testNoSolutionExists_remove5__5)).getActivity())), 0.1);
        int[] array_1635508580 = new int[]{198,200};
        	int[] array_312752620 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove5__5).getLits();
        	for(int ii = 0; ii <array_1635508580.length; ii++) {
        		org.junit.Assert.assertEquals(array_1635508580[ii], array_312752620[ii]);
        	};
        Assert.assertEquals("99[?] 100[?]", ((OriginalBinaryClause) (o_testNoSolutionExists_remove5__5)).toString());
        Assert.assertEquals(199, ((int) (((OriginalBinaryClause) (o_testNoSolutionExists_remove5__5)).hashCode())));
        clause.clear();
        clause.clear();
        clause.clear();
        IVecInt o_testNoSolutionExists_remove5__7 = clause.push((-99));
        Assert.assertEquals("-99", ((VecInt) (o_testNoSolutionExists_remove5__7)).toString());
        Assert.assertEquals(-99, ((int) (((VecInt) (o_testNoSolutionExists_remove5__7)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExists_remove5__7)).isEmpty());
        IVecInt o_testNoSolutionExists_remove5__10 = clause.push((-100));
        Assert.assertEquals("-100", ((VecInt) (o_testNoSolutionExists_remove5__10)).toString());
        Assert.assertEquals(-100, ((int) (((VecInt) (o_testNoSolutionExists_remove5__10)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExists_remove5__10)).isEmpty());
        IConstr o_testNoSolutionExists_remove5__12 = solver.addClause(clause);
        Assert.assertTrue(((UnitClause) (o_testNoSolutionExists_remove5__12)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_testNoSolutionExists_remove5__12)).getActivity())), 0.1);
        Assert.assertEquals("-100", ((UnitClause) (o_testNoSolutionExists_remove5__12)).toString());
        this.solver.isSatisfiable();
        Assert.assertEquals("", ((VecInt) (clause)).toString());
        Assert.assertTrue(((VecInt) (clause)).isEmpty());
        Assert.assertEquals("", ((VecInt) (o_testNoSolutionExists_remove5__3)).toString());
        Assert.assertTrue(((VecInt) (o_testNoSolutionExists_remove5__3)).isEmpty());
        Assert.assertFalse(((OriginalBinaryClause) (o_testNoSolutionExists_remove5__5)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testNoSolutionExists_remove5__5)).getActivity())), 0.1);
        int[] array_924246133 = new int[]{198,200};
        	int[] array_1280460106 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove5__5).getLits();
        	for(int ii = 0; ii <array_924246133.length; ii++) {
        		org.junit.Assert.assertEquals(array_924246133[ii], array_1280460106[ii]);
        	};
        Assert.assertEquals("99[?] 100[F]", ((OriginalBinaryClause) (o_testNoSolutionExists_remove5__5)).toString());
        Assert.assertEquals(199, ((int) (((OriginalBinaryClause) (o_testNoSolutionExists_remove5__5)).hashCode())));
        Assert.assertEquals("", ((VecInt) (o_testNoSolutionExists_remove5__7)).toString());
        Assert.assertTrue(((VecInt) (o_testNoSolutionExists_remove5__7)).isEmpty());
        Assert.assertEquals("", ((VecInt) (o_testNoSolutionExists_remove5__10)).toString());
        Assert.assertTrue(((VecInt) (o_testNoSolutionExists_remove5__10)).isEmpty());
        Assert.assertTrue(((UnitClause) (o_testNoSolutionExists_remove5__12)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_testNoSolutionExists_remove5__12)).getActivity())), 0.1);
        Assert.assertEquals("-100", ((UnitClause) (o_testNoSolutionExists_remove5__12)).toString());
    }

    @Test(timeout = 30000)
    public void testNoSolutionExists_remove6() throws Exception, ContradictionException, TimeoutException {
        IVecInt clause = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause)).toString());
        Assert.assertTrue(((VecInt) (clause)).isEmpty());
        IVecInt o_testNoSolutionExists_remove6__3 = clause.push(100).push(99);
        Assert.assertEquals("100,99", ((VecInt) (o_testNoSolutionExists_remove6__3)).toString());
        Assert.assertEquals(99, ((int) (((VecInt) (o_testNoSolutionExists_remove6__3)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExists_remove6__3)).isEmpty());
        IConstr o_testNoSolutionExists_remove6__5 = solver.addClause(clause);
        Assert.assertFalse(((OriginalBinaryClause) (o_testNoSolutionExists_remove6__5)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testNoSolutionExists_remove6__5)).getActivity())), 0.1);
        int[] array_1780117107 = new int[]{198,200};
        	int[] array_1918579922 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove6__5).getLits();
        	for(int ii = 0; ii <array_1780117107.length; ii++) {
        		org.junit.Assert.assertEquals(array_1780117107[ii], array_1918579922[ii]);
        	};
        Assert.assertEquals("99[?] 100[?]", ((OriginalBinaryClause) (o_testNoSolutionExists_remove6__5)).toString());
        Assert.assertEquals(199, ((int) (((OriginalBinaryClause) (o_testNoSolutionExists_remove6__5)).hashCode())));
        IConstr o_testNoSolutionExists_remove6__6 = solver.addClause(clause);
        Assert.assertFalse(((OriginalBinaryClause) (o_testNoSolutionExists_remove6__6)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testNoSolutionExists_remove6__6)).getActivity())), 0.1);
        int[] array_582027917 = new int[]{198,200};
        	int[] array_2113184556 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove6__6).getLits();
        	for(int ii = 0; ii <array_582027917.length; ii++) {
        		org.junit.Assert.assertEquals(array_582027917[ii], array_2113184556[ii]);
        	};
        Assert.assertEquals("99[?] 100[?]", ((OriginalBinaryClause) (o_testNoSolutionExists_remove6__6)).toString());
        Assert.assertEquals(199, ((int) (((OriginalBinaryClause) (o_testNoSolutionExists_remove6__6)).hashCode())));
        clause.clear();
        clause.clear();
        IVecInt o_testNoSolutionExists_remove6__8 = clause.push((-99));
        Assert.assertEquals("-99", ((VecInt) (o_testNoSolutionExists_remove6__8)).toString());
        Assert.assertEquals(-99, ((int) (((VecInt) (o_testNoSolutionExists_remove6__8)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExists_remove6__8)).isEmpty());
        IVecInt o_testNoSolutionExists_remove6__10 = clause.push((-100));
        Assert.assertEquals("-99,-100", ((VecInt) (o_testNoSolutionExists_remove6__10)).toString());
        Assert.assertEquals(-99, ((int) (((VecInt) (o_testNoSolutionExists_remove6__10)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExists_remove6__10)).isEmpty());
        IConstr o_testNoSolutionExists_remove6__12 = solver.addClause(clause);
        Assert.assertFalse(((OriginalBinaryClause) (o_testNoSolutionExists_remove6__12)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testNoSolutionExists_remove6__12)).getActivity())), 0.1);
        int[] array_1848848534 = new int[]{199,201};
        	int[] array_1904675524 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove6__12).getLits();
        	for(int ii = 0; ii <array_1848848534.length; ii++) {
        		org.junit.Assert.assertEquals(array_1848848534[ii], array_1904675524[ii]);
        	};
        Assert.assertEquals("-99[?] -100[?]", ((OriginalBinaryClause) (o_testNoSolutionExists_remove6__12)).toString());
        Assert.assertEquals(200, ((int) (((OriginalBinaryClause) (o_testNoSolutionExists_remove6__12)).hashCode())));
        this.solver.isSatisfiable();
        Assert.assertEquals("", ((VecInt) (clause)).toString());
        Assert.assertTrue(((VecInt) (clause)).isEmpty());
        Assert.assertEquals("", ((VecInt) (o_testNoSolutionExists_remove6__3)).toString());
        Assert.assertTrue(((VecInt) (o_testNoSolutionExists_remove6__3)).isEmpty());
        Assert.assertFalse(((OriginalBinaryClause) (o_testNoSolutionExists_remove6__5)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testNoSolutionExists_remove6__5)).getActivity())), 0.1);
        int[] array_21383048 = new int[]{198,200};
        	int[] array_2064975260 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove6__5).getLits();
        	for(int ii = 0; ii <array_21383048.length; ii++) {
        		org.junit.Assert.assertEquals(array_21383048[ii], array_2064975260[ii]);
        	};
        Assert.assertEquals("99[?] 100[?]", ((OriginalBinaryClause) (o_testNoSolutionExists_remove6__5)).toString());
        Assert.assertEquals(199, ((int) (((OriginalBinaryClause) (o_testNoSolutionExists_remove6__5)).hashCode())));
        Assert.assertFalse(((OriginalBinaryClause) (o_testNoSolutionExists_remove6__6)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testNoSolutionExists_remove6__6)).getActivity())), 0.1);
        int[] array_19668052 = new int[]{198,200};
        	int[] array_564957235 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove6__6).getLits();
        	for(int ii = 0; ii <array_19668052.length; ii++) {
        		org.junit.Assert.assertEquals(array_19668052[ii], array_564957235[ii]);
        	};
        Assert.assertEquals("99[?] 100[?]", ((OriginalBinaryClause) (o_testNoSolutionExists_remove6__6)).toString());
        Assert.assertEquals(199, ((int) (((OriginalBinaryClause) (o_testNoSolutionExists_remove6__6)).hashCode())));
        Assert.assertEquals("", ((VecInt) (o_testNoSolutionExists_remove6__8)).toString());
        Assert.assertTrue(((VecInt) (o_testNoSolutionExists_remove6__8)).isEmpty());
        Assert.assertEquals("", ((VecInt) (o_testNoSolutionExists_remove6__10)).toString());
        Assert.assertTrue(((VecInt) (o_testNoSolutionExists_remove6__10)).isEmpty());
        Assert.assertFalse(((OriginalBinaryClause) (o_testNoSolutionExists_remove6__12)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testNoSolutionExists_remove6__12)).getActivity())), 0.1);
        int[] array_1348236471 = new int[]{199,201};
        	int[] array_2145706595 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove6__12).getLits();
        	for(int ii = 0; ii <array_1348236471.length; ii++) {
        		org.junit.Assert.assertEquals(array_1348236471[ii], array_2145706595[ii]);
        	};
        Assert.assertEquals("-99[?] -100[?]", ((OriginalBinaryClause) (o_testNoSolutionExists_remove6__12)).toString());
        Assert.assertEquals(200, ((int) (((OriginalBinaryClause) (o_testNoSolutionExists_remove6__12)).hashCode())));
    }

    @Test(timeout = 30000)
    public void testNoSolutionExists_remove7() throws Exception, ContradictionException, TimeoutException {
        IVecInt clause = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause)).toString());
        Assert.assertTrue(((VecInt) (clause)).isEmpty());
        IVecInt o_testNoSolutionExists_remove7__3 = clause.push(100).push(99);
        Assert.assertEquals("100,99", ((VecInt) (o_testNoSolutionExists_remove7__3)).toString());
        Assert.assertEquals(99, ((int) (((VecInt) (o_testNoSolutionExists_remove7__3)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExists_remove7__3)).isEmpty());
        IConstr o_testNoSolutionExists_remove7__5 = solver.addClause(clause);
        Assert.assertFalse(((OriginalBinaryClause) (o_testNoSolutionExists_remove7__5)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testNoSolutionExists_remove7__5)).getActivity())), 0.1);
        int[] array_1231906488 = new int[]{198,200};
        	int[] array_344656050 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove7__5).getLits();
        	for(int ii = 0; ii <array_1231906488.length; ii++) {
        		org.junit.Assert.assertEquals(array_1231906488[ii], array_344656050[ii]);
        	};
        Assert.assertEquals("99[?] 100[?]", ((OriginalBinaryClause) (o_testNoSolutionExists_remove7__5)).toString());
        Assert.assertEquals(199, ((int) (((OriginalBinaryClause) (o_testNoSolutionExists_remove7__5)).hashCode())));
        IConstr o_testNoSolutionExists_remove7__6 = solver.addClause(clause);
        Assert.assertFalse(((OriginalBinaryClause) (o_testNoSolutionExists_remove7__6)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testNoSolutionExists_remove7__6)).getActivity())), 0.1);
        int[] array_986475328 = new int[]{198,200};
        	int[] array_323897869 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove7__6).getLits();
        	for(int ii = 0; ii <array_986475328.length; ii++) {
        		org.junit.Assert.assertEquals(array_986475328[ii], array_323897869[ii]);
        	};
        Assert.assertEquals("99[?] 100[?]", ((OriginalBinaryClause) (o_testNoSolutionExists_remove7__6)).toString());
        Assert.assertEquals(199, ((int) (((OriginalBinaryClause) (o_testNoSolutionExists_remove7__6)).hashCode())));
        clause.clear();
        clause.clear();
        clause.clear();
        IVecInt o_testNoSolutionExists_remove7__9 = clause.push((-99));
        Assert.assertEquals("-99", ((VecInt) (o_testNoSolutionExists_remove7__9)).toString());
        Assert.assertEquals(-99, ((int) (((VecInt) (o_testNoSolutionExists_remove7__9)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExists_remove7__9)).isEmpty());
        IConstr o_testNoSolutionExists_remove7__11 = solver.addClause(clause);
        Assert.assertTrue(((UnitClause) (o_testNoSolutionExists_remove7__11)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_testNoSolutionExists_remove7__11)).getActivity())), 0.1);
        Assert.assertEquals("-99", ((UnitClause) (o_testNoSolutionExists_remove7__11)).toString());
        this.solver.isSatisfiable();
        Assert.assertEquals("", ((VecInt) (clause)).toString());
        Assert.assertTrue(((VecInt) (clause)).isEmpty());
        Assert.assertEquals("", ((VecInt) (o_testNoSolutionExists_remove7__3)).toString());
        Assert.assertTrue(((VecInt) (o_testNoSolutionExists_remove7__3)).isEmpty());
        Assert.assertFalse(((OriginalBinaryClause) (o_testNoSolutionExists_remove7__5)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testNoSolutionExists_remove7__5)).getActivity())), 0.1);
        int[] array_1112195874 = new int[]{198,200};
        	int[] array_938903036 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove7__5).getLits();
        	for(int ii = 0; ii <array_1112195874.length; ii++) {
        		org.junit.Assert.assertEquals(array_1112195874[ii], array_938903036[ii]);
        	};
        Assert.assertEquals("99[F] 100[?]", ((OriginalBinaryClause) (o_testNoSolutionExists_remove7__5)).toString());
        Assert.assertEquals(199, ((int) (((OriginalBinaryClause) (o_testNoSolutionExists_remove7__5)).hashCode())));
        Assert.assertFalse(((OriginalBinaryClause) (o_testNoSolutionExists_remove7__6)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testNoSolutionExists_remove7__6)).getActivity())), 0.1);
        int[] array_630434226 = new int[]{198,200};
        	int[] array_510123478 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove7__6).getLits();
        	for(int ii = 0; ii <array_630434226.length; ii++) {
        		org.junit.Assert.assertEquals(array_630434226[ii], array_510123478[ii]);
        	};
        Assert.assertEquals("99[F] 100[?]", ((OriginalBinaryClause) (o_testNoSolutionExists_remove7__6)).toString());
        Assert.assertEquals(199, ((int) (((OriginalBinaryClause) (o_testNoSolutionExists_remove7__6)).hashCode())));
        Assert.assertEquals("", ((VecInt) (o_testNoSolutionExists_remove7__9)).toString());
        Assert.assertTrue(((VecInt) (o_testNoSolutionExists_remove7__9)).isEmpty());
        Assert.assertTrue(((UnitClause) (o_testNoSolutionExists_remove7__11)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_testNoSolutionExists_remove7__11)).getActivity())), 0.1);
        Assert.assertEquals("-99", ((UnitClause) (o_testNoSolutionExists_remove7__11)).toString());
    }

    @Test(timeout = 30000)
    public void testNoSolutionExists_remove8() throws Exception, ContradictionException, TimeoutException {
        IVecInt clause = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause)).toString());
        Assert.assertTrue(((VecInt) (clause)).isEmpty());
        IVecInt o_testNoSolutionExists_remove8__3 = clause.push(100).push(99);
        Assert.assertEquals("100,99", ((VecInt) (o_testNoSolutionExists_remove8__3)).toString());
        Assert.assertEquals(99, ((int) (((VecInt) (o_testNoSolutionExists_remove8__3)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExists_remove8__3)).isEmpty());
        IConstr o_testNoSolutionExists_remove8__5 = solver.addClause(clause);
        Assert.assertFalse(((OriginalBinaryClause) (o_testNoSolutionExists_remove8__5)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testNoSolutionExists_remove8__5)).getActivity())), 0.1);
        int[] array_2086707665 = new int[]{198,200};
        	int[] array_1278592644 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove8__5).getLits();
        	for(int ii = 0; ii <array_2086707665.length; ii++) {
        		org.junit.Assert.assertEquals(array_2086707665[ii], array_1278592644[ii]);
        	};
        Assert.assertEquals("99[?] 100[?]", ((OriginalBinaryClause) (o_testNoSolutionExists_remove8__5)).toString());
        Assert.assertEquals(199, ((int) (((OriginalBinaryClause) (o_testNoSolutionExists_remove8__5)).hashCode())));
        IConstr o_testNoSolutionExists_remove8__6 = solver.addClause(clause);
        Assert.assertFalse(((OriginalBinaryClause) (o_testNoSolutionExists_remove8__6)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testNoSolutionExists_remove8__6)).getActivity())), 0.1);
        int[] array_497080696 = new int[]{198,200};
        	int[] array_40865201 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove8__6).getLits();
        	for(int ii = 0; ii <array_497080696.length; ii++) {
        		org.junit.Assert.assertEquals(array_497080696[ii], array_40865201[ii]);
        	};
        Assert.assertEquals("99[?] 100[?]", ((OriginalBinaryClause) (o_testNoSolutionExists_remove8__6)).toString());
        Assert.assertEquals(199, ((int) (((OriginalBinaryClause) (o_testNoSolutionExists_remove8__6)).hashCode())));
        clause.clear();
        clause.clear();
        clause.clear();
        IVecInt o_testNoSolutionExists_remove8__9 = clause.push((-99));
        Assert.assertEquals("-99", ((VecInt) (o_testNoSolutionExists_remove8__9)).toString());
        Assert.assertEquals(-99, ((int) (((VecInt) (o_testNoSolutionExists_remove8__9)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExists_remove8__9)).isEmpty());
        IVecInt o_testNoSolutionExists_remove8__11 = clause.push((-100));
        Assert.assertEquals("-99,-100", ((VecInt) (o_testNoSolutionExists_remove8__11)).toString());
        Assert.assertEquals(-99, ((int) (((VecInt) (o_testNoSolutionExists_remove8__11)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExists_remove8__11)).isEmpty());
        this.solver.isSatisfiable();
        Assert.assertEquals("", ((VecInt) (clause)).toString());
        Assert.assertTrue(((VecInt) (clause)).isEmpty());
        Assert.assertEquals("", ((VecInt) (o_testNoSolutionExists_remove8__3)).toString());
        Assert.assertTrue(((VecInt) (o_testNoSolutionExists_remove8__3)).isEmpty());
        Assert.assertFalse(((OriginalBinaryClause) (o_testNoSolutionExists_remove8__5)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testNoSolutionExists_remove8__5)).getActivity())), 0.1);
        int[] array_1226901677 = new int[]{198,200};
        	int[] array_433345085 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove8__5).getLits();
        	for(int ii = 0; ii <array_1226901677.length; ii++) {
        		org.junit.Assert.assertEquals(array_1226901677[ii], array_433345085[ii]);
        	};
        Assert.assertEquals("99[?] 100[?]", ((OriginalBinaryClause) (o_testNoSolutionExists_remove8__5)).toString());
        Assert.assertEquals(199, ((int) (((OriginalBinaryClause) (o_testNoSolutionExists_remove8__5)).hashCode())));
        Assert.assertFalse(((OriginalBinaryClause) (o_testNoSolutionExists_remove8__6)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testNoSolutionExists_remove8__6)).getActivity())), 0.1);
        int[] array_710729714 = new int[]{198,200};
        	int[] array_418055333 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove8__6).getLits();
        	for(int ii = 0; ii <array_710729714.length; ii++) {
        		org.junit.Assert.assertEquals(array_710729714[ii], array_418055333[ii]);
        	};
        Assert.assertEquals("99[?] 100[?]", ((OriginalBinaryClause) (o_testNoSolutionExists_remove8__6)).toString());
        Assert.assertEquals(199, ((int) (((OriginalBinaryClause) (o_testNoSolutionExists_remove8__6)).hashCode())));
        Assert.assertEquals("", ((VecInt) (o_testNoSolutionExists_remove8__9)).toString());
        Assert.assertTrue(((VecInt) (o_testNoSolutionExists_remove8__9)).isEmpty());
        Assert.assertEquals("", ((VecInt) (o_testNoSolutionExists_remove8__11)).toString());
        Assert.assertTrue(((VecInt) (o_testNoSolutionExists_remove8__11)).isEmpty());
    }

    @Test(timeout = 30000)
    public void testNoSolutionExists_remove9() throws Exception, ContradictionException, TimeoutException {
        IVecInt clause = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause)).toString());
        Assert.assertTrue(((VecInt) (clause)).isEmpty());
        IVecInt o_testNoSolutionExists_remove9__3 = clause.push(100).push(99);
        Assert.assertEquals("100,99", ((VecInt) (o_testNoSolutionExists_remove9__3)).toString());
        Assert.assertEquals(99, ((int) (((VecInt) (o_testNoSolutionExists_remove9__3)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExists_remove9__3)).isEmpty());
        IConstr o_testNoSolutionExists_remove9__5 = solver.addClause(clause);
        Assert.assertFalse(((OriginalBinaryClause) (o_testNoSolutionExists_remove9__5)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testNoSolutionExists_remove9__5)).getActivity())), 0.1);
        int[] array_221006639 = new int[]{198,200};
        	int[] array_1045185488 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove9__5).getLits();
        	for(int ii = 0; ii <array_221006639.length; ii++) {
        		org.junit.Assert.assertEquals(array_221006639[ii], array_1045185488[ii]);
        	};
        Assert.assertEquals("99[?] 100[?]", ((OriginalBinaryClause) (o_testNoSolutionExists_remove9__5)).toString());
        Assert.assertEquals(199, ((int) (((OriginalBinaryClause) (o_testNoSolutionExists_remove9__5)).hashCode())));
        IConstr o_testNoSolutionExists_remove9__6 = solver.addClause(clause);
        Assert.assertFalse(((OriginalBinaryClause) (o_testNoSolutionExists_remove9__6)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testNoSolutionExists_remove9__6)).getActivity())), 0.1);
        int[] array_705254390 = new int[]{198,200};
        	int[] array_934395863 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove9__6).getLits();
        	for(int ii = 0; ii <array_705254390.length; ii++) {
        		org.junit.Assert.assertEquals(array_705254390[ii], array_934395863[ii]);
        	};
        Assert.assertEquals("99[?] 100[?]", ((OriginalBinaryClause) (o_testNoSolutionExists_remove9__6)).toString());
        Assert.assertEquals(199, ((int) (((OriginalBinaryClause) (o_testNoSolutionExists_remove9__6)).hashCode())));
        IConstr o_testNoSolutionExists_remove9__7 = solver.addClause(clause);
        Assert.assertFalse(((OriginalBinaryClause) (o_testNoSolutionExists_remove9__7)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testNoSolutionExists_remove9__7)).getActivity())), 0.1);
        int[] array_1517406316 = new int[]{198,200};
        	int[] array_362573722 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove9__7).getLits();
        	for(int ii = 0; ii <array_1517406316.length; ii++) {
        		org.junit.Assert.assertEquals(array_1517406316[ii], array_362573722[ii]);
        	};
        Assert.assertEquals("99[?] 100[?]", ((OriginalBinaryClause) (o_testNoSolutionExists_remove9__7)).toString());
        Assert.assertEquals(199, ((int) (((OriginalBinaryClause) (o_testNoSolutionExists_remove9__7)).hashCode())));
        clause.clear();
        clause.clear();
        IVecInt o_testNoSolutionExists_remove9__10 = clause.push((-99));
        Assert.assertEquals("-99", ((VecInt) (o_testNoSolutionExists_remove9__10)).toString());
        Assert.assertEquals(-99, ((int) (((VecInt) (o_testNoSolutionExists_remove9__10)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExists_remove9__10)).isEmpty());
        IVecInt o_testNoSolutionExists_remove9__12 = clause.push((-100));
        Assert.assertEquals("-99,-100", ((VecInt) (o_testNoSolutionExists_remove9__12)).toString());
        Assert.assertEquals(-99, ((int) (((VecInt) (o_testNoSolutionExists_remove9__12)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExists_remove9__12)).isEmpty());
        this.solver.isSatisfiable();
        Assert.assertEquals("-99,-100", ((VecInt) (clause)).toString());
        Assert.assertEquals(-99, ((int) (((VecInt) (clause)).hashCode())));
        Assert.assertFalse(((VecInt) (clause)).isEmpty());
        Assert.assertEquals("-99,-100", ((VecInt) (o_testNoSolutionExists_remove9__3)).toString());
        Assert.assertEquals(-99, ((int) (((VecInt) (o_testNoSolutionExists_remove9__3)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExists_remove9__3)).isEmpty());
        Assert.assertFalse(((OriginalBinaryClause) (o_testNoSolutionExists_remove9__5)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testNoSolutionExists_remove9__5)).getActivity())), 0.1);
        int[] array_1640902160 = new int[]{198,200};
        	int[] array_1486333941 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove9__5).getLits();
        	for(int ii = 0; ii <array_1640902160.length; ii++) {
        		org.junit.Assert.assertEquals(array_1640902160[ii], array_1486333941[ii]);
        	};
        Assert.assertEquals("99[?] 100[?]", ((OriginalBinaryClause) (o_testNoSolutionExists_remove9__5)).toString());
        Assert.assertEquals(199, ((int) (((OriginalBinaryClause) (o_testNoSolutionExists_remove9__5)).hashCode())));
        Assert.assertFalse(((OriginalBinaryClause) (o_testNoSolutionExists_remove9__6)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testNoSolutionExists_remove9__6)).getActivity())), 0.1);
        int[] array_1990166463 = new int[]{198,200};
        	int[] array_1391374059 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove9__6).getLits();
        	for(int ii = 0; ii <array_1990166463.length; ii++) {
        		org.junit.Assert.assertEquals(array_1990166463[ii], array_1391374059[ii]);
        	};
        Assert.assertEquals("99[?] 100[?]", ((OriginalBinaryClause) (o_testNoSolutionExists_remove9__6)).toString());
        Assert.assertEquals(199, ((int) (((OriginalBinaryClause) (o_testNoSolutionExists_remove9__6)).hashCode())));
        Assert.assertFalse(((OriginalBinaryClause) (o_testNoSolutionExists_remove9__7)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testNoSolutionExists_remove9__7)).getActivity())), 0.1);
        int[] array_986292459 = new int[]{198,200};
        	int[] array_60832105 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove9__7).getLits();
        	for(int ii = 0; ii <array_986292459.length; ii++) {
        		org.junit.Assert.assertEquals(array_986292459[ii], array_60832105[ii]);
        	};
        Assert.assertEquals("99[?] 100[?]", ((OriginalBinaryClause) (o_testNoSolutionExists_remove9__7)).toString());
        Assert.assertEquals(199, ((int) (((OriginalBinaryClause) (o_testNoSolutionExists_remove9__7)).hashCode())));
        Assert.assertEquals("-99,-100", ((VecInt) (o_testNoSolutionExists_remove9__10)).toString());
        Assert.assertEquals(-99, ((int) (((VecInt) (o_testNoSolutionExists_remove9__10)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExists_remove9__10)).isEmpty());
        Assert.assertEquals("-99,-100", ((VecInt) (o_testNoSolutionExists_remove9__12)).toString());
        Assert.assertEquals(-99, ((int) (((VecInt) (o_testNoSolutionExists_remove9__12)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExists_remove9__12)).isEmpty());
    }

    @Test(timeout = 30000)
    public void testNoSolutionExists_remove1_failAssert1() throws Exception, ContradictionException, TimeoutException {
        try {
            IVecInt clause = new VecInt();
            solver.addClause(clause);
            clause.clear();
            clause.push((-99));
            solver.addClause(clause);
            clause.clear();
            clause.push((-100));
            solver.addClause(clause);
            clause.clear();
            solver.isSatisfiable();
            org.junit.Assert.fail("testNoSolutionExists_remove1 should have thrown ContradictionException");
        } catch (ContradictionException expected) {
            Assert.assertEquals("Creating Empty clause ?", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testNoSolutionExists_remove2_remove49() throws Exception, ContradictionException, TimeoutException {
        IVecInt clause = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause)).toString());
        Assert.assertTrue(((VecInt) (clause)).isEmpty());
        IVecInt o_testNoSolutionExists_remove2__3 = clause.push(100).push(99);
        Assert.assertEquals("100,99", ((VecInt) (o_testNoSolutionExists_remove2__3)).toString());
        Assert.assertEquals(99, ((int) (((VecInt) (o_testNoSolutionExists_remove2__3)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExists_remove2__3)).isEmpty());
        IVecInt o_testNoSolutionExists_remove2__6 = clause.push((-99));
        Assert.assertEquals("100,99,-99", ((VecInt) (o_testNoSolutionExists_remove2__6)).toString());
        Assert.assertEquals(33, ((int) (((VecInt) (o_testNoSolutionExists_remove2__6)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExists_remove2__6)).isEmpty());
        IConstr o_testNoSolutionExists_remove2__8 = solver.addClause(clause);
        clause.clear();
        clause.clear();
        IVecInt o_testNoSolutionExists_remove2__10 = clause.push((-100));
        IConstr o_testNoSolutionExists_remove2__12 = solver.addClause(clause);
        this.solver.isSatisfiable();
    }

    @Test(timeout = 30000)
    public void testNoSolutionExists_remove2_remove50() throws Exception, ContradictionException, TimeoutException {
        IVecInt clause = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause)).toString());
        Assert.assertTrue(((VecInt) (clause)).isEmpty());
        IVecInt o_testNoSolutionExists_remove2__3 = clause.push(100).push(99);
        Assert.assertEquals("100,99", ((VecInt) (o_testNoSolutionExists_remove2__3)).toString());
        Assert.assertEquals(99, ((int) (((VecInt) (o_testNoSolutionExists_remove2__3)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExists_remove2__3)).isEmpty());
        clause.clear();
        clause.clear();
        IVecInt o_testNoSolutionExists_remove2__6 = clause.push((-99));
        Assert.assertEquals("-99", ((VecInt) (o_testNoSolutionExists_remove2__6)).toString());
        Assert.assertEquals(-99, ((int) (((VecInt) (o_testNoSolutionExists_remove2__6)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExists_remove2__6)).isEmpty());
        IConstr o_testNoSolutionExists_remove2__8 = solver.addClause(clause);
        Assert.assertTrue(((UnitClause) (o_testNoSolutionExists_remove2__8)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_testNoSolutionExists_remove2__8)).getActivity())), 0.1);
        Assert.assertEquals("-99", ((UnitClause) (o_testNoSolutionExists_remove2__8)).toString());
        IVecInt o_testNoSolutionExists_remove2__10 = clause.push((-100));
        Assert.assertEquals("-99,-100", ((VecInt) (o_testNoSolutionExists_remove2__10)).toString());
        Assert.assertEquals(-99, ((int) (((VecInt) (o_testNoSolutionExists_remove2__10)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExists_remove2__10)).isEmpty());
        IConstr o_testNoSolutionExists_remove2__12 = solver.addClause(clause);
        this.solver.isSatisfiable();
    }

    @Test(timeout = 30000)
    public void testNoSolutionExists_remove2_remove55() throws Exception, ContradictionException, TimeoutException {
        IVecInt clause = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause)).toString());
        Assert.assertTrue(((VecInt) (clause)).isEmpty());
        IVecInt o_testNoSolutionExists_remove2__3 = clause.push(100).push(99);
        Assert.assertEquals("100,99", ((VecInt) (o_testNoSolutionExists_remove2__3)).toString());
        Assert.assertEquals(99, ((int) (((VecInt) (o_testNoSolutionExists_remove2__3)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExists_remove2__3)).isEmpty());
        clause.clear();
        clause.clear();
        clause.clear();
        IVecInt o_testNoSolutionExists_remove2__6 = clause.push((-99));
        Assert.assertEquals("-99", ((VecInt) (o_testNoSolutionExists_remove2__6)).toString());
        Assert.assertEquals(-99, ((int) (((VecInt) (o_testNoSolutionExists_remove2__6)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExists_remove2__6)).isEmpty());
        IConstr o_testNoSolutionExists_remove2__8 = solver.addClause(clause);
        Assert.assertTrue(((UnitClause) (o_testNoSolutionExists_remove2__8)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_testNoSolutionExists_remove2__8)).getActivity())), 0.1);
        Assert.assertEquals("-99", ((UnitClause) (o_testNoSolutionExists_remove2__8)).toString());
        IVecInt o_testNoSolutionExists_remove2__10 = clause.push((-100));
        Assert.assertEquals("-99,-100", ((VecInt) (o_testNoSolutionExists_remove2__10)).toString());
        Assert.assertEquals(-99, ((int) (((VecInt) (o_testNoSolutionExists_remove2__10)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExists_remove2__10)).isEmpty());
        IConstr o_testNoSolutionExists_remove2__12 = this.solver.addClause(clause);
    }

    @Test(timeout = 30000)
    public void testNoSolutionExists_remove3_remove35() throws Exception, ContradictionException, TimeoutException {
        IVecInt clause = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause)).toString());
        Assert.assertTrue(((VecInt) (clause)).isEmpty());
        IVecInt o_testNoSolutionExists_remove3__3 = clause.push(100).push(99);
        Assert.assertEquals("100,99", ((VecInt) (o_testNoSolutionExists_remove3__3)).toString());
        Assert.assertEquals(99, ((int) (((VecInt) (o_testNoSolutionExists_remove3__3)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExists_remove3__3)).isEmpty());
        IConstr o_testNoSolutionExists_remove3__5 = solver.addClause(clause);
        int[] array_437357759 = new int[]{198,200};
        	int[] array_840349311 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove3__5).getLits();
        	for(int ii = 0; ii <array_437357759.length; ii++) {
        		org.junit.Assert.assertEquals(array_437357759[ii], array_840349311[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_testNoSolutionExists_remove3__5)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testNoSolutionExists_remove3__5)).getActivity())), 0.1);
        Assert.assertEquals("99[?] 100[?]", ((OriginalBinaryClause) (o_testNoSolutionExists_remove3__5)).toString());
        Assert.assertEquals(199, ((int) (((OriginalBinaryClause) (o_testNoSolutionExists_remove3__5)).hashCode())));
        int[] array_960144037 = new int[]{198,200};
        	int[] array_619987209 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove3__5).getLits();
        	for(int ii = 0; ii <array_960144037.length; ii++) {
        		org.junit.Assert.assertEquals(array_960144037[ii], array_619987209[ii]);
        	};
        IVecInt o_testNoSolutionExists_remove3__6 = clause.push((-99));
        Assert.assertEquals("100,99,-99", ((VecInt) (o_testNoSolutionExists_remove3__6)).toString());
        Assert.assertEquals(33, ((int) (((VecInt) (o_testNoSolutionExists_remove3__6)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExists_remove3__6)).isEmpty());
        clause.clear();
        clause.clear();
        IVecInt o_testNoSolutionExists_remove3_remove35__17 = clause.push((-100));
        Assert.assertEquals("-100", ((VecInt) (o_testNoSolutionExists_remove3_remove35__17)).toString());
        Assert.assertEquals(-100, ((int) (((VecInt) (o_testNoSolutionExists_remove3_remove35__17)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExists_remove3_remove35__17)).isEmpty());
        IConstr o_testNoSolutionExists_remove3_remove35__19 = solver.addClause(clause);
        Assert.assertTrue(((UnitClause) (o_testNoSolutionExists_remove3_remove35__19)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_testNoSolutionExists_remove3_remove35__19)).getActivity())), 0.1);
        Assert.assertEquals("-100", ((UnitClause) (o_testNoSolutionExists_remove3_remove35__19)).toString());
        this.solver.isSatisfiable();
        Assert.assertEquals("", ((VecInt) (clause)).toString());
        Assert.assertTrue(((VecInt) (clause)).isEmpty());
        Assert.assertEquals("", ((VecInt) (o_testNoSolutionExists_remove3__3)).toString());
        Assert.assertTrue(((VecInt) (o_testNoSolutionExists_remove3__3)).isEmpty());
        int[] array_478132801 = new int[]{198,200};
        	int[] array_776558984 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove3__5).getLits();
        	for(int ii = 0; ii <array_478132801.length; ii++) {
        		org.junit.Assert.assertEquals(array_478132801[ii], array_776558984[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_testNoSolutionExists_remove3__5)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testNoSolutionExists_remove3__5)).getActivity())), 0.1);
        Assert.assertEquals("99[?] 100[F]", ((OriginalBinaryClause) (o_testNoSolutionExists_remove3__5)).toString());
        Assert.assertEquals(199, ((int) (((OriginalBinaryClause) (o_testNoSolutionExists_remove3__5)).hashCode())));
        Assert.assertEquals("", ((VecInt) (o_testNoSolutionExists_remove3__6)).toString());
        Assert.assertTrue(((VecInt) (o_testNoSolutionExists_remove3__6)).isEmpty());
        Assert.assertEquals("", ((VecInt) (o_testNoSolutionExists_remove3_remove35__17)).toString());
        Assert.assertTrue(((VecInt) (o_testNoSolutionExists_remove3_remove35__17)).isEmpty());
        Assert.assertTrue(((UnitClause) (o_testNoSolutionExists_remove3_remove35__19)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_testNoSolutionExists_remove3_remove35__19)).getActivity())), 0.1);
        Assert.assertEquals("-100", ((UnitClause) (o_testNoSolutionExists_remove3_remove35__19)).toString());
    }

    @Test(timeout = 30000)
    public void testNoSolutionExists_remove3_remove36() throws Exception, ContradictionException, TimeoutException {
        IVecInt clause = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause)).toString());
        Assert.assertTrue(((VecInt) (clause)).isEmpty());
        IVecInt o_testNoSolutionExists_remove3__3 = clause.push(100).push(99);
        Assert.assertEquals("100,99", ((VecInt) (o_testNoSolutionExists_remove3__3)).toString());
        Assert.assertEquals(99, ((int) (((VecInt) (o_testNoSolutionExists_remove3__3)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExists_remove3__3)).isEmpty());
        IConstr o_testNoSolutionExists_remove3__5 = solver.addClause(clause);
        int[] array_2098187935 = new int[]{198,200};
        	int[] array_653917512 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove3__5).getLits();
        	for(int ii = 0; ii <array_2098187935.length; ii++) {
        		org.junit.Assert.assertEquals(array_2098187935[ii], array_653917512[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_testNoSolutionExists_remove3__5)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testNoSolutionExists_remove3__5)).getActivity())), 0.1);
        Assert.assertEquals("99[?] 100[?]", ((OriginalBinaryClause) (o_testNoSolutionExists_remove3__5)).toString());
        Assert.assertEquals(199, ((int) (((OriginalBinaryClause) (o_testNoSolutionExists_remove3__5)).hashCode())));
        int[] array_960144037 = new int[]{198,200};
        	int[] array_619987209 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove3__5).getLits();
        	for(int ii = 0; ii <array_960144037.length; ii++) {
        		org.junit.Assert.assertEquals(array_960144037[ii], array_619987209[ii]);
        	};
        IVecInt o_testNoSolutionExists_remove3__6 = clause.push((-99));
        Assert.assertEquals("100,99,-99", ((VecInt) (o_testNoSolutionExists_remove3__6)).toString());
        Assert.assertEquals(33, ((int) (((VecInt) (o_testNoSolutionExists_remove3__6)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExists_remove3__6)).isEmpty());
        solver.addClause(clause);
        solver.addClause(clause);
        clause.push((-100));
        clause.clear();
        this.solver.isSatisfiable();
    }

    @Test(timeout = 30000)
    public void testNoSolutionExists_remove3_remove39() throws Exception, ContradictionException, TimeoutException {
        IVecInt clause = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause)).toString());
        Assert.assertTrue(((VecInt) (clause)).isEmpty());
        IVecInt o_testNoSolutionExists_remove3__3 = clause.push(100).push(99);
        Assert.assertEquals("100,99", ((VecInt) (o_testNoSolutionExists_remove3__3)).toString());
        Assert.assertEquals(99, ((int) (((VecInt) (o_testNoSolutionExists_remove3__3)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExists_remove3__3)).isEmpty());
        IConstr o_testNoSolutionExists_remove3__5 = solver.addClause(clause);
        int[] array_1601397512 = new int[]{198,200};
        	int[] array_995075168 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove3__5).getLits();
        	for(int ii = 0; ii <array_1601397512.length; ii++) {
        		org.junit.Assert.assertEquals(array_1601397512[ii], array_995075168[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_testNoSolutionExists_remove3__5)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testNoSolutionExists_remove3__5)).getActivity())), 0.1);
        Assert.assertEquals("99[?] 100[?]", ((OriginalBinaryClause) (o_testNoSolutionExists_remove3__5)).toString());
        Assert.assertEquals(199, ((int) (((OriginalBinaryClause) (o_testNoSolutionExists_remove3__5)).hashCode())));
        int[] array_960144037 = new int[]{198,200};
        	int[] array_619987209 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove3__5).getLits();
        	for(int ii = 0; ii <array_960144037.length; ii++) {
        		org.junit.Assert.assertEquals(array_960144037[ii], array_619987209[ii]);
        	};
        IVecInt o_testNoSolutionExists_remove3__6 = clause.push((-99));
        Assert.assertEquals("100,99,-99", ((VecInt) (o_testNoSolutionExists_remove3__6)).toString());
        Assert.assertEquals(33, ((int) (((VecInt) (o_testNoSolutionExists_remove3__6)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExists_remove3__6)).isEmpty());
        solver.addClause(clause);
        clause.clear();
        clause.clear();
        clause.push((-100));
        this.solver.isSatisfiable();
    }

    @Test(timeout = 30000)
    public void testNoSolutionExists_remove3_remove45() throws Exception, ContradictionException, TimeoutException {
        IVecInt clause = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause)).toString());
        Assert.assertTrue(((VecInt) (clause)).isEmpty());
        IVecInt o_testNoSolutionExists_remove3__3 = clause.push(100).push(99);
        Assert.assertEquals("100,99", ((VecInt) (o_testNoSolutionExists_remove3__3)).toString());
        Assert.assertEquals(99, ((int) (((VecInt) (o_testNoSolutionExists_remove3__3)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExists_remove3__3)).isEmpty());
        IConstr o_testNoSolutionExists_remove3__5 = solver.addClause(clause);
        int[] array_1733830533 = new int[]{198,200};
        	int[] array_757772451 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove3__5).getLits();
        	for(int ii = 0; ii <array_1733830533.length; ii++) {
        		org.junit.Assert.assertEquals(array_1733830533[ii], array_757772451[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_testNoSolutionExists_remove3__5)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testNoSolutionExists_remove3__5)).getActivity())), 0.1);
        Assert.assertEquals("99[?] 100[?]", ((OriginalBinaryClause) (o_testNoSolutionExists_remove3__5)).toString());
        Assert.assertEquals(199, ((int) (((OriginalBinaryClause) (o_testNoSolutionExists_remove3__5)).hashCode())));
        int[] array_960144037 = new int[]{198,200};
        	int[] array_619987209 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove3__5).getLits();
        	for(int ii = 0; ii <array_960144037.length; ii++) {
        		org.junit.Assert.assertEquals(array_960144037[ii], array_619987209[ii]);
        	};
        IVecInt o_testNoSolutionExists_remove3__6 = clause.push((-99));
        Assert.assertEquals("100,99,-99", ((VecInt) (o_testNoSolutionExists_remove3__6)).toString());
        Assert.assertEquals(33, ((int) (((VecInt) (o_testNoSolutionExists_remove3__6)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExists_remove3__6)).isEmpty());
        solver.addClause(clause);
        solver.addClause(clause);
        clause.clear();
        clause.clear();
        clause.push((-100));
    }

    @Test(timeout = 30000)
    public void testNoSolutionExists_remove5_remove48() throws Exception, ContradictionException, TimeoutException {
        IVecInt clause = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause)).toString());
        Assert.assertTrue(((VecInt) (clause)).isEmpty());
        IVecInt o_testNoSolutionExists_remove5__3 = clause.push(100).push(99);
        Assert.assertEquals("100,99", ((VecInt) (o_testNoSolutionExists_remove5__3)).toString());
        Assert.assertEquals(99, ((int) (((VecInt) (o_testNoSolutionExists_remove5__3)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExists_remove5__3)).isEmpty());
        IConstr o_testNoSolutionExists_remove5__5 = solver.addClause(clause);
        int[] array_380008966 = new int[]{198,200};
        	int[] array_1258681960 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove5__5).getLits();
        	for(int ii = 0; ii <array_380008966.length; ii++) {
        		org.junit.Assert.assertEquals(array_380008966[ii], array_1258681960[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_testNoSolutionExists_remove5__5)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testNoSolutionExists_remove5__5)).getActivity())), 0.1);
        Assert.assertEquals("99[?] 100[?]", ((OriginalBinaryClause) (o_testNoSolutionExists_remove5__5)).toString());
        Assert.assertEquals(199, ((int) (((OriginalBinaryClause) (o_testNoSolutionExists_remove5__5)).hashCode())));
        int[] array_1635508580 = new int[]{198,200};
        	int[] array_312752620 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove5__5).getLits();
        	for(int ii = 0; ii <array_1635508580.length; ii++) {
        		org.junit.Assert.assertEquals(array_1635508580[ii], array_312752620[ii]);
        	};
        clause.clear();
        clause.clear();
        IVecInt o_testNoSolutionExists_remove5__7 = clause.push((-99));
        Assert.assertEquals("-99", ((VecInt) (o_testNoSolutionExists_remove5__7)).toString());
        Assert.assertEquals(-99, ((int) (((VecInt) (o_testNoSolutionExists_remove5__7)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExists_remove5__7)).isEmpty());
        IVecInt o_testNoSolutionExists_remove5__10 = clause.push((-100));
        Assert.assertEquals("-99,-100", ((VecInt) (o_testNoSolutionExists_remove5__10)).toString());
        Assert.assertEquals(-99, ((int) (((VecInt) (o_testNoSolutionExists_remove5__10)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExists_remove5__10)).isEmpty());
        IConstr o_testNoSolutionExists_remove5__12 = solver.addClause(clause);
        int[] array_715956334 = new int[]{199,201};
        	int[] array_2139907821 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove5__12).getLits();
        	for(int ii = 0; ii <array_715956334.length; ii++) {
        		org.junit.Assert.assertEquals(array_715956334[ii], array_2139907821[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_testNoSolutionExists_remove5__12)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testNoSolutionExists_remove5__12)).getActivity())), 0.1);
        Assert.assertEquals("-99[?] -100[?]", ((OriginalBinaryClause) (o_testNoSolutionExists_remove5__12)).toString());
        Assert.assertEquals(200, ((int) (((OriginalBinaryClause) (o_testNoSolutionExists_remove5__12)).hashCode())));
        this.solver.isSatisfiable();
        int[] array_924246133 = new int[]{198,200};
        	int[] array_1280460106 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove5__5).getLits();
        	for(int ii = 0; ii <array_924246133.length; ii++) {
        		org.junit.Assert.assertEquals(array_924246133[ii], array_1280460106[ii]);
        	};
        Assert.assertEquals("", ((VecInt) (clause)).toString());
        Assert.assertTrue(((VecInt) (clause)).isEmpty());
        Assert.assertEquals("", ((VecInt) (o_testNoSolutionExists_remove5__3)).toString());
        Assert.assertTrue(((VecInt) (o_testNoSolutionExists_remove5__3)).isEmpty());
        int[] array_161647393 = new int[]{198,200};
        	int[] array_1329652965 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove5__5).getLits();
        	for(int ii = 0; ii <array_161647393.length; ii++) {
        		org.junit.Assert.assertEquals(array_161647393[ii], array_1329652965[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_testNoSolutionExists_remove5__5)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testNoSolutionExists_remove5__5)).getActivity())), 0.1);
        Assert.assertEquals("99[?] 100[?]", ((OriginalBinaryClause) (o_testNoSolutionExists_remove5__5)).toString());
        Assert.assertEquals(199, ((int) (((OriginalBinaryClause) (o_testNoSolutionExists_remove5__5)).hashCode())));
        Assert.assertEquals("", ((VecInt) (o_testNoSolutionExists_remove5__7)).toString());
        Assert.assertTrue(((VecInt) (o_testNoSolutionExists_remove5__7)).isEmpty());
        Assert.assertEquals("", ((VecInt) (o_testNoSolutionExists_remove5__10)).toString());
        Assert.assertTrue(((VecInt) (o_testNoSolutionExists_remove5__10)).isEmpty());
        int[] array_1465160341 = new int[]{199,201};
        	int[] array_170326452 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove5__12).getLits();
        	for(int ii = 0; ii <array_1465160341.length; ii++) {
        		org.junit.Assert.assertEquals(array_1465160341[ii], array_170326452[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_testNoSolutionExists_remove5__12)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testNoSolutionExists_remove5__12)).getActivity())), 0.1);
        Assert.assertEquals("-99[?] -100[?]", ((OriginalBinaryClause) (o_testNoSolutionExists_remove5__12)).toString());
        Assert.assertEquals(200, ((int) (((OriginalBinaryClause) (o_testNoSolutionExists_remove5__12)).hashCode())));
    }

    @Test(timeout = 30000)
    public void testNoSolutionExists_remove5_remove59() throws Exception, ContradictionException, TimeoutException {
        IVecInt clause = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause)).toString());
        Assert.assertTrue(((VecInt) (clause)).isEmpty());
        IVecInt o_testNoSolutionExists_remove5__3 = clause.push(100).push(99);
        Assert.assertEquals("100,99", ((VecInt) (o_testNoSolutionExists_remove5__3)).toString());
        Assert.assertEquals(99, ((int) (((VecInt) (o_testNoSolutionExists_remove5__3)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExists_remove5__3)).isEmpty());
        IConstr o_testNoSolutionExists_remove5__5 = solver.addClause(clause);
        int[] array_384043331 = new int[]{198,200};
        	int[] array_1272642964 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove5__5).getLits();
        	for(int ii = 0; ii <array_384043331.length; ii++) {
        		org.junit.Assert.assertEquals(array_384043331[ii], array_1272642964[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_testNoSolutionExists_remove5__5)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testNoSolutionExists_remove5__5)).getActivity())), 0.1);
        Assert.assertEquals("99[?] 100[?]", ((OriginalBinaryClause) (o_testNoSolutionExists_remove5__5)).toString());
        Assert.assertEquals(199, ((int) (((OriginalBinaryClause) (o_testNoSolutionExists_remove5__5)).hashCode())));
        int[] array_1635508580 = new int[]{198,200};
        	int[] array_312752620 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove5__5).getLits();
        	for(int ii = 0; ii <array_1635508580.length; ii++) {
        		org.junit.Assert.assertEquals(array_1635508580[ii], array_312752620[ii]);
        	};
        clause.clear();
        clause.clear();
        clause.clear();
        IVecInt o_testNoSolutionExists_remove5__7 = clause.push((-99));
        Assert.assertEquals("-99", ((VecInt) (o_testNoSolutionExists_remove5__7)).toString());
        Assert.assertEquals(-99, ((int) (((VecInt) (o_testNoSolutionExists_remove5__7)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExists_remove5__7)).isEmpty());
        IVecInt o_testNoSolutionExists_remove5__10 = clause.push((-100));
        Assert.assertEquals("-99,-100", ((VecInt) (o_testNoSolutionExists_remove5__10)).toString());
        Assert.assertEquals(-99, ((int) (((VecInt) (o_testNoSolutionExists_remove5__10)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExists_remove5__10)).isEmpty());
        IConstr o_testNoSolutionExists_remove5__12 = solver.addClause(clause);
        int[] array_31446627 = new int[]{199,201};
        	int[] array_1739616368 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove5__12).getLits();
        	for(int ii = 0; ii <array_31446627.length; ii++) {
        		org.junit.Assert.assertEquals(array_31446627[ii], array_1739616368[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_testNoSolutionExists_remove5__12)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testNoSolutionExists_remove5__12)).getActivity())), 0.1);
        Assert.assertEquals("-99[?] -100[?]", ((OriginalBinaryClause) (o_testNoSolutionExists_remove5__12)).toString());
        Assert.assertEquals(200, ((int) (((OriginalBinaryClause) (o_testNoSolutionExists_remove5__12)).hashCode())));
        int[] array_924246133 = new int[]{198,200};
        	int[] array_1280460106 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove5__5).getLits();
        	for(int ii = 0; ii <array_924246133.length; ii++) {
        		org.junit.Assert.assertEquals(array_924246133[ii], array_1280460106[ii]);
        	};
        Assert.assertEquals("-99,-100", ((VecInt) (clause)).toString());
        Assert.assertEquals(-99, ((int) (((VecInt) (clause)).hashCode())));
        Assert.assertFalse(((VecInt) (clause)).isEmpty());
        Assert.assertEquals("-99,-100", ((VecInt) (o_testNoSolutionExists_remove5__3)).toString());
        Assert.assertEquals(-99, ((int) (((VecInt) (o_testNoSolutionExists_remove5__3)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExists_remove5__3)).isEmpty());
        int[] array_32565637 = new int[]{198,200};
        	int[] array_720162583 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove5__5).getLits();
        	for(int ii = 0; ii <array_32565637.length; ii++) {
        		org.junit.Assert.assertEquals(array_32565637[ii], array_720162583[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_testNoSolutionExists_remove5__5)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testNoSolutionExists_remove5__5)).getActivity())), 0.1);
        Assert.assertEquals("99[?] 100[?]", ((OriginalBinaryClause) (o_testNoSolutionExists_remove5__5)).toString());
        Assert.assertEquals(199, ((int) (((OriginalBinaryClause) (o_testNoSolutionExists_remove5__5)).hashCode())));
        Assert.assertEquals("-99,-100", ((VecInt) (o_testNoSolutionExists_remove5__7)).toString());
        Assert.assertEquals(-99, ((int) (((VecInt) (o_testNoSolutionExists_remove5__7)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExists_remove5__7)).isEmpty());
        Assert.assertEquals("-99,-100", ((VecInt) (o_testNoSolutionExists_remove5__10)).toString());
        Assert.assertEquals(-99, ((int) (((VecInt) (o_testNoSolutionExists_remove5__10)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExists_remove5__10)).isEmpty());
        int[] array_1482001999 = new int[]{199,201};
        	int[] array_1636306375 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove5__12).getLits();
        	for(int ii = 0; ii <array_1482001999.length; ii++) {
        		org.junit.Assert.assertEquals(array_1482001999[ii], array_1636306375[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_testNoSolutionExists_remove5__12)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testNoSolutionExists_remove5__12)).getActivity())), 0.1);
        Assert.assertEquals("-99[?] -100[?]", ((OriginalBinaryClause) (o_testNoSolutionExists_remove5__12)).toString());
        Assert.assertEquals(200, ((int) (((OriginalBinaryClause) (o_testNoSolutionExists_remove5__12)).hashCode())));
    }

    @Test(timeout = 30000)
    public void testNoSolutionExists_remove6_remove61() throws Exception, ContradictionException, TimeoutException {
        IVecInt clause = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause)).toString());
        Assert.assertTrue(((VecInt) (clause)).isEmpty());
        IVecInt o_testNoSolutionExists_remove6__3 = clause.push(100).push(99);
        Assert.assertEquals("100,99", ((VecInt) (o_testNoSolutionExists_remove6__3)).toString());
        Assert.assertEquals(99, ((int) (((VecInt) (o_testNoSolutionExists_remove6__3)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExists_remove6__3)).isEmpty());
        IConstr o_testNoSolutionExists_remove6__5 = solver.addClause(clause);
        int[] array_1913680303 = new int[]{198,200};
        	int[] array_792779551 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove6__5).getLits();
        	for(int ii = 0; ii <array_1913680303.length; ii++) {
        		org.junit.Assert.assertEquals(array_1913680303[ii], array_792779551[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_testNoSolutionExists_remove6__5)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testNoSolutionExists_remove6__5)).getActivity())), 0.1);
        Assert.assertEquals("99[?] 100[?]", ((OriginalBinaryClause) (o_testNoSolutionExists_remove6__5)).toString());
        Assert.assertEquals(199, ((int) (((OriginalBinaryClause) (o_testNoSolutionExists_remove6__5)).hashCode())));
        int[] array_1780117107 = new int[]{198,200};
        	int[] array_1918579922 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove6__5).getLits();
        	for(int ii = 0; ii <array_1780117107.length; ii++) {
        		org.junit.Assert.assertEquals(array_1780117107[ii], array_1918579922[ii]);
        	};
        IConstr o_testNoSolutionExists_remove6__6 = solver.addClause(clause);
        int[] array_1814531737 = new int[]{198,200};
        	int[] array_376286662 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove6__6).getLits();
        	for(int ii = 0; ii <array_1814531737.length; ii++) {
        		org.junit.Assert.assertEquals(array_1814531737[ii], array_376286662[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_testNoSolutionExists_remove6__6)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testNoSolutionExists_remove6__6)).getActivity())), 0.1);
        Assert.assertEquals("99[?] 100[?]", ((OriginalBinaryClause) (o_testNoSolutionExists_remove6__6)).toString());
        Assert.assertEquals(199, ((int) (((OriginalBinaryClause) (o_testNoSolutionExists_remove6__6)).hashCode())));
        int[] array_582027917 = new int[]{198,200};
        	int[] array_2113184556 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove6__6).getLits();
        	for(int ii = 0; ii <array_582027917.length; ii++) {
        		org.junit.Assert.assertEquals(array_582027917[ii], array_2113184556[ii]);
        	};
        clause.clear();
        IVecInt o_testNoSolutionExists_remove6__8 = clause.push((-99));
        Assert.assertEquals("-99", ((VecInt) (o_testNoSolutionExists_remove6__8)).toString());
        Assert.assertEquals(-99, ((int) (((VecInt) (o_testNoSolutionExists_remove6__8)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExists_remove6__8)).isEmpty());
        IVecInt o_testNoSolutionExists_remove6__10 = clause.push((-100));
        Assert.assertEquals("-99,-100", ((VecInt) (o_testNoSolutionExists_remove6__10)).toString());
        Assert.assertEquals(-99, ((int) (((VecInt) (o_testNoSolutionExists_remove6__10)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExists_remove6__10)).isEmpty());
        IConstr o_testNoSolutionExists_remove6__12 = solver.addClause(clause);
        int[] array_901534982 = new int[]{199,201};
        	int[] array_415120022 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove6__12).getLits();
        	for(int ii = 0; ii <array_901534982.length; ii++) {
        		org.junit.Assert.assertEquals(array_901534982[ii], array_415120022[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_testNoSolutionExists_remove6__12)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testNoSolutionExists_remove6__12)).getActivity())), 0.1);
        Assert.assertEquals("-99[?] -100[?]", ((OriginalBinaryClause) (o_testNoSolutionExists_remove6__12)).toString());
        Assert.assertEquals(200, ((int) (((OriginalBinaryClause) (o_testNoSolutionExists_remove6__12)).hashCode())));
        int[] array_1848848534 = new int[]{199,201};
        	int[] array_1904675524 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove6__12).getLits();
        	for(int ii = 0; ii <array_1848848534.length; ii++) {
        		org.junit.Assert.assertEquals(array_1848848534[ii], array_1904675524[ii]);
        	};
        this.solver.isSatisfiable();
        int[] array_21383048 = new int[]{198,200};
        	int[] array_2064975260 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove6__5).getLits();
        	for(int ii = 0; ii <array_21383048.length; ii++) {
        		org.junit.Assert.assertEquals(array_21383048[ii], array_2064975260[ii]);
        	};
        int[] array_19668052 = new int[]{198,200};
        	int[] array_564957235 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove6__6).getLits();
        	for(int ii = 0; ii <array_19668052.length; ii++) {
        		org.junit.Assert.assertEquals(array_19668052[ii], array_564957235[ii]);
        	};
        int[] array_1348236471 = new int[]{199,201};
        	int[] array_2145706595 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove6__12).getLits();
        	for(int ii = 0; ii <array_1348236471.length; ii++) {
        		org.junit.Assert.assertEquals(array_1348236471[ii], array_2145706595[ii]);
        	};
        Assert.assertEquals("-99,-100", ((VecInt) (clause)).toString());
        Assert.assertEquals(-99, ((int) (((VecInt) (clause)).hashCode())));
        Assert.assertFalse(((VecInt) (clause)).isEmpty());
        Assert.assertEquals("-99,-100", ((VecInt) (o_testNoSolutionExists_remove6__3)).toString());
        Assert.assertEquals(-99, ((int) (((VecInt) (o_testNoSolutionExists_remove6__3)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExists_remove6__3)).isEmpty());
        int[] array_9384774 = new int[]{198,200};
        	int[] array_1005908705 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove6__5).getLits();
        	for(int ii = 0; ii <array_9384774.length; ii++) {
        		org.junit.Assert.assertEquals(array_9384774[ii], array_1005908705[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_testNoSolutionExists_remove6__5)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testNoSolutionExists_remove6__5)).getActivity())), 0.1);
        Assert.assertEquals("99[?] 100[?]", ((OriginalBinaryClause) (o_testNoSolutionExists_remove6__5)).toString());
        Assert.assertEquals(199, ((int) (((OriginalBinaryClause) (o_testNoSolutionExists_remove6__5)).hashCode())));
        int[] array_1245696546 = new int[]{198,200};
        	int[] array_911069722 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove6__6).getLits();
        	for(int ii = 0; ii <array_1245696546.length; ii++) {
        		org.junit.Assert.assertEquals(array_1245696546[ii], array_911069722[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_testNoSolutionExists_remove6__6)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testNoSolutionExists_remove6__6)).getActivity())), 0.1);
        Assert.assertEquals("99[?] 100[?]", ((OriginalBinaryClause) (o_testNoSolutionExists_remove6__6)).toString());
        Assert.assertEquals(199, ((int) (((OriginalBinaryClause) (o_testNoSolutionExists_remove6__6)).hashCode())));
        Assert.assertEquals("-99,-100", ((VecInt) (o_testNoSolutionExists_remove6__8)).toString());
        Assert.assertEquals(-99, ((int) (((VecInt) (o_testNoSolutionExists_remove6__8)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExists_remove6__8)).isEmpty());
        Assert.assertEquals("-99,-100", ((VecInt) (o_testNoSolutionExists_remove6__10)).toString());
        Assert.assertEquals(-99, ((int) (((VecInt) (o_testNoSolutionExists_remove6__10)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExists_remove6__10)).isEmpty());
        int[] array_373026092 = new int[]{199,201};
        	int[] array_186471031 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove6__12).getLits();
        	for(int ii = 0; ii <array_373026092.length; ii++) {
        		org.junit.Assert.assertEquals(array_373026092[ii], array_186471031[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_testNoSolutionExists_remove6__12)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testNoSolutionExists_remove6__12)).getActivity())), 0.1);
        Assert.assertEquals("-99[?] -100[?]", ((OriginalBinaryClause) (o_testNoSolutionExists_remove6__12)).toString());
        Assert.assertEquals(200, ((int) (((OriginalBinaryClause) (o_testNoSolutionExists_remove6__12)).hashCode())));
    }

    @Test(timeout = 30000)
    public void testNoSolutionExists_remove7_remove46() throws Exception, ContradictionException, TimeoutException {
        IVecInt clause = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause)).toString());
        Assert.assertTrue(((VecInt) (clause)).isEmpty());
        IVecInt o_testNoSolutionExists_remove7__3 = clause.push(100).push(99);
        Assert.assertEquals("100,99", ((VecInt) (o_testNoSolutionExists_remove7__3)).toString());
        Assert.assertEquals(99, ((int) (((VecInt) (o_testNoSolutionExists_remove7__3)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExists_remove7__3)).isEmpty());
        IConstr o_testNoSolutionExists_remove7__5 = solver.addClause(clause);
        int[] array_360841435 = new int[]{198,200};
        	int[] array_15911933 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove7__5).getLits();
        	for(int ii = 0; ii <array_360841435.length; ii++) {
        		org.junit.Assert.assertEquals(array_360841435[ii], array_15911933[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_testNoSolutionExists_remove7__5)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testNoSolutionExists_remove7__5)).getActivity())), 0.1);
        Assert.assertEquals("99[?] 100[?]", ((OriginalBinaryClause) (o_testNoSolutionExists_remove7__5)).toString());
        Assert.assertEquals(199, ((int) (((OriginalBinaryClause) (o_testNoSolutionExists_remove7__5)).hashCode())));
        int[] array_1231906488 = new int[]{198,200};
        	int[] array_344656050 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove7__5).getLits();
        	for(int ii = 0; ii <array_1231906488.length; ii++) {
        		org.junit.Assert.assertEquals(array_1231906488[ii], array_344656050[ii]);
        	};
        IConstr o_testNoSolutionExists_remove7__6 = solver.addClause(clause);
        int[] array_1014115561 = new int[]{198,200};
        	int[] array_1065588677 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove7__6).getLits();
        	for(int ii = 0; ii <array_1014115561.length; ii++) {
        		org.junit.Assert.assertEquals(array_1014115561[ii], array_1065588677[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_testNoSolutionExists_remove7__6)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testNoSolutionExists_remove7__6)).getActivity())), 0.1);
        Assert.assertEquals("99[?] 100[?]", ((OriginalBinaryClause) (o_testNoSolutionExists_remove7__6)).toString());
        Assert.assertEquals(199, ((int) (((OriginalBinaryClause) (o_testNoSolutionExists_remove7__6)).hashCode())));
        int[] array_986475328 = new int[]{198,200};
        	int[] array_323897869 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove7__6).getLits();
        	for(int ii = 0; ii <array_986475328.length; ii++) {
        		org.junit.Assert.assertEquals(array_986475328[ii], array_323897869[ii]);
        	};
        clause.clear();
        clause.clear();
        IVecInt o_testNoSolutionExists_remove7__9 = clause.push((-99));
        Assert.assertEquals("-99", ((VecInt) (o_testNoSolutionExists_remove7__9)).toString());
        Assert.assertEquals(-99, ((int) (((VecInt) (o_testNoSolutionExists_remove7__9)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExists_remove7__9)).isEmpty());
        IConstr o_testNoSolutionExists_remove7__11 = solver.addClause(clause);
        Assert.assertTrue(((UnitClause) (o_testNoSolutionExists_remove7__11)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_testNoSolutionExists_remove7__11)).getActivity())), 0.1);
        Assert.assertEquals("-99", ((UnitClause) (o_testNoSolutionExists_remove7__11)).toString());
        this.solver.isSatisfiable();
        int[] array_1112195874 = new int[]{198,200};
        	int[] array_938903036 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove7__5).getLits();
        	for(int ii = 0; ii <array_1112195874.length; ii++) {
        		org.junit.Assert.assertEquals(array_1112195874[ii], array_938903036[ii]);
        	};
        int[] array_630434226 = new int[]{198,200};
        	int[] array_510123478 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove7__6).getLits();
        	for(int ii = 0; ii <array_630434226.length; ii++) {
        		org.junit.Assert.assertEquals(array_630434226[ii], array_510123478[ii]);
        	};
        Assert.assertEquals("", ((VecInt) (clause)).toString());
        Assert.assertTrue(((VecInt) (clause)).isEmpty());
        Assert.assertEquals("", ((VecInt) (o_testNoSolutionExists_remove7__3)).toString());
        Assert.assertTrue(((VecInt) (o_testNoSolutionExists_remove7__3)).isEmpty());
        int[] array_20548404 = new int[]{198,200};
        	int[] array_2129087437 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove7__5).getLits();
        	for(int ii = 0; ii <array_20548404.length; ii++) {
        		org.junit.Assert.assertEquals(array_20548404[ii], array_2129087437[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_testNoSolutionExists_remove7__5)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testNoSolutionExists_remove7__5)).getActivity())), 0.1);
        Assert.assertEquals("99[F] 100[?]", ((OriginalBinaryClause) (o_testNoSolutionExists_remove7__5)).toString());
        Assert.assertEquals(199, ((int) (((OriginalBinaryClause) (o_testNoSolutionExists_remove7__5)).hashCode())));
        int[] array_451956994 = new int[]{198,200};
        	int[] array_473135604 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove7__6).getLits();
        	for(int ii = 0; ii <array_451956994.length; ii++) {
        		org.junit.Assert.assertEquals(array_451956994[ii], array_473135604[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_testNoSolutionExists_remove7__6)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testNoSolutionExists_remove7__6)).getActivity())), 0.1);
        Assert.assertEquals("99[F] 100[?]", ((OriginalBinaryClause) (o_testNoSolutionExists_remove7__6)).toString());
        Assert.assertEquals(199, ((int) (((OriginalBinaryClause) (o_testNoSolutionExists_remove7__6)).hashCode())));
        Assert.assertEquals("", ((VecInt) (o_testNoSolutionExists_remove7__9)).toString());
        Assert.assertTrue(((VecInt) (o_testNoSolutionExists_remove7__9)).isEmpty());
        Assert.assertTrue(((UnitClause) (o_testNoSolutionExists_remove7__11)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_testNoSolutionExists_remove7__11)).getActivity())), 0.1);
        Assert.assertEquals("-99", ((UnitClause) (o_testNoSolutionExists_remove7__11)).toString());
    }

    @Test(timeout = 30000)
    public void testNoSolutionExists_remove7_remove58() throws Exception, ContradictionException, TimeoutException {
        IVecInt clause = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause)).toString());
        Assert.assertTrue(((VecInt) (clause)).isEmpty());
        IVecInt o_testNoSolutionExists_remove7__3 = clause.push(100).push(99);
        Assert.assertEquals("100,99", ((VecInt) (o_testNoSolutionExists_remove7__3)).toString());
        Assert.assertEquals(99, ((int) (((VecInt) (o_testNoSolutionExists_remove7__3)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExists_remove7__3)).isEmpty());
        IConstr o_testNoSolutionExists_remove7__5 = solver.addClause(clause);
        int[] array_1332729922 = new int[]{198,200};
        	int[] array_297783422 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove7__5).getLits();
        	for(int ii = 0; ii <array_1332729922.length; ii++) {
        		org.junit.Assert.assertEquals(array_1332729922[ii], array_297783422[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_testNoSolutionExists_remove7__5)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testNoSolutionExists_remove7__5)).getActivity())), 0.1);
        Assert.assertEquals("99[?] 100[?]", ((OriginalBinaryClause) (o_testNoSolutionExists_remove7__5)).toString());
        Assert.assertEquals(199, ((int) (((OriginalBinaryClause) (o_testNoSolutionExists_remove7__5)).hashCode())));
        int[] array_1231906488 = new int[]{198,200};
        	int[] array_344656050 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove7__5).getLits();
        	for(int ii = 0; ii <array_1231906488.length; ii++) {
        		org.junit.Assert.assertEquals(array_1231906488[ii], array_344656050[ii]);
        	};
        IConstr o_testNoSolutionExists_remove7__6 = solver.addClause(clause);
        int[] array_616761814 = new int[]{198,200};
        	int[] array_1823286531 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove7__6).getLits();
        	for(int ii = 0; ii <array_616761814.length; ii++) {
        		org.junit.Assert.assertEquals(array_616761814[ii], array_1823286531[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_testNoSolutionExists_remove7__6)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testNoSolutionExists_remove7__6)).getActivity())), 0.1);
        Assert.assertEquals("99[?] 100[?]", ((OriginalBinaryClause) (o_testNoSolutionExists_remove7__6)).toString());
        Assert.assertEquals(199, ((int) (((OriginalBinaryClause) (o_testNoSolutionExists_remove7__6)).hashCode())));
        int[] array_986475328 = new int[]{198,200};
        	int[] array_323897869 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove7__6).getLits();
        	for(int ii = 0; ii <array_986475328.length; ii++) {
        		org.junit.Assert.assertEquals(array_986475328[ii], array_323897869[ii]);
        	};
        clause.clear();
        clause.clear();
        clause.clear();
        IVecInt o_testNoSolutionExists_remove7__9 = clause.push((-99));
        Assert.assertEquals("-99", ((VecInt) (o_testNoSolutionExists_remove7__9)).toString());
        Assert.assertEquals(-99, ((int) (((VecInt) (o_testNoSolutionExists_remove7__9)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExists_remove7__9)).isEmpty());
        IConstr o_testNoSolutionExists_remove7__11 = solver.addClause(clause);
        Assert.assertTrue(((UnitClause) (o_testNoSolutionExists_remove7__11)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_testNoSolutionExists_remove7__11)).getActivity())), 0.1);
        Assert.assertEquals("-99", ((UnitClause) (o_testNoSolutionExists_remove7__11)).toString());
        int[] array_1112195874 = new int[]{198,200};
        	int[] array_938903036 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove7__5).getLits();
        	for(int ii = 0; ii <array_1112195874.length; ii++) {
        		org.junit.Assert.assertEquals(array_1112195874[ii], array_938903036[ii]);
        	};
        int[] array_630434226 = new int[]{198,200};
        	int[] array_510123478 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove7__6).getLits();
        	for(int ii = 0; ii <array_630434226.length; ii++) {
        		org.junit.Assert.assertEquals(array_630434226[ii], array_510123478[ii]);
        	};
        Assert.assertEquals("-99", ((VecInt) (clause)).toString());
        Assert.assertEquals(-99, ((int) (((VecInt) (clause)).hashCode())));
        Assert.assertFalse(((VecInt) (clause)).isEmpty());
        Assert.assertEquals("-99", ((VecInt) (o_testNoSolutionExists_remove7__3)).toString());
        Assert.assertEquals(-99, ((int) (((VecInt) (o_testNoSolutionExists_remove7__3)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExists_remove7__3)).isEmpty());
        int[] array_6270082 = new int[]{198,200};
        	int[] array_1181874356 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove7__5).getLits();
        	for(int ii = 0; ii <array_6270082.length; ii++) {
        		org.junit.Assert.assertEquals(array_6270082[ii], array_1181874356[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_testNoSolutionExists_remove7__5)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testNoSolutionExists_remove7__5)).getActivity())), 0.1);
        Assert.assertEquals("99[F] 100[?]", ((OriginalBinaryClause) (o_testNoSolutionExists_remove7__5)).toString());
        Assert.assertEquals(199, ((int) (((OriginalBinaryClause) (o_testNoSolutionExists_remove7__5)).hashCode())));
        int[] array_1336129686 = new int[]{198,200};
        	int[] array_218475904 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove7__6).getLits();
        	for(int ii = 0; ii <array_1336129686.length; ii++) {
        		org.junit.Assert.assertEquals(array_1336129686[ii], array_218475904[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_testNoSolutionExists_remove7__6)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testNoSolutionExists_remove7__6)).getActivity())), 0.1);
        Assert.assertEquals("99[F] 100[?]", ((OriginalBinaryClause) (o_testNoSolutionExists_remove7__6)).toString());
        Assert.assertEquals(199, ((int) (((OriginalBinaryClause) (o_testNoSolutionExists_remove7__6)).hashCode())));
        Assert.assertEquals("-99", ((VecInt) (o_testNoSolutionExists_remove7__9)).toString());
        Assert.assertEquals(-99, ((int) (((VecInt) (o_testNoSolutionExists_remove7__9)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExists_remove7__9)).isEmpty());
        Assert.assertTrue(((UnitClause) (o_testNoSolutionExists_remove7__11)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_testNoSolutionExists_remove7__11)).getActivity())), 0.1);
        Assert.assertEquals("-99", ((UnitClause) (o_testNoSolutionExists_remove7__11)).toString());
    }

    @Test(timeout = 30000)
    public void testNoSolutionExists_remove8_remove38() throws Exception, ContradictionException, TimeoutException {
        IVecInt clause = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause)).toString());
        Assert.assertTrue(((VecInt) (clause)).isEmpty());
        IVecInt o_testNoSolutionExists_remove8__3 = clause.push(100).push(99);
        Assert.assertEquals("100,99", ((VecInt) (o_testNoSolutionExists_remove8__3)).toString());
        Assert.assertEquals(99, ((int) (((VecInt) (o_testNoSolutionExists_remove8__3)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExists_remove8__3)).isEmpty());
        IConstr o_testNoSolutionExists_remove8__5 = solver.addClause(clause);
        int[] array_1265264946 = new int[]{198,200};
        	int[] array_1330491211 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove8__5).getLits();
        	for(int ii = 0; ii <array_1265264946.length; ii++) {
        		org.junit.Assert.assertEquals(array_1265264946[ii], array_1330491211[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_testNoSolutionExists_remove8__5)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testNoSolutionExists_remove8__5)).getActivity())), 0.1);
        Assert.assertEquals("99[?] 100[?]", ((OriginalBinaryClause) (o_testNoSolutionExists_remove8__5)).toString());
        Assert.assertEquals(199, ((int) (((OriginalBinaryClause) (o_testNoSolutionExists_remove8__5)).hashCode())));
        int[] array_2086707665 = new int[]{198,200};
        	int[] array_1278592644 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove8__5).getLits();
        	for(int ii = 0; ii <array_2086707665.length; ii++) {
        		org.junit.Assert.assertEquals(array_2086707665[ii], array_1278592644[ii]);
        	};
        IConstr o_testNoSolutionExists_remove8__6 = solver.addClause(clause);
        int[] array_661030971 = new int[]{198,200};
        	int[] array_111462766 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove8__6).getLits();
        	for(int ii = 0; ii <array_661030971.length; ii++) {
        		org.junit.Assert.assertEquals(array_661030971[ii], array_111462766[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_testNoSolutionExists_remove8__6)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testNoSolutionExists_remove8__6)).getActivity())), 0.1);
        Assert.assertEquals("99[?] 100[?]", ((OriginalBinaryClause) (o_testNoSolutionExists_remove8__6)).toString());
        Assert.assertEquals(199, ((int) (((OriginalBinaryClause) (o_testNoSolutionExists_remove8__6)).hashCode())));
        int[] array_497080696 = new int[]{198,200};
        	int[] array_40865201 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove8__6).getLits();
        	for(int ii = 0; ii <array_497080696.length; ii++) {
        		org.junit.Assert.assertEquals(array_497080696[ii], array_40865201[ii]);
        	};
        clause.clear();
        clause.clear();
        IVecInt o_testNoSolutionExists_remove8__9 = clause.push((-99));
        Assert.assertEquals("-99", ((VecInt) (o_testNoSolutionExists_remove8__9)).toString());
        Assert.assertEquals(-99, ((int) (((VecInt) (o_testNoSolutionExists_remove8__9)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExists_remove8__9)).isEmpty());
        IVecInt o_testNoSolutionExists_remove8__11 = clause.push((-100));
        Assert.assertEquals("-99,-100", ((VecInt) (o_testNoSolutionExists_remove8__11)).toString());
        Assert.assertEquals(-99, ((int) (((VecInt) (o_testNoSolutionExists_remove8__11)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExists_remove8__11)).isEmpty());
        this.solver.isSatisfiable();
        int[] array_1226901677 = new int[]{198,200};
        	int[] array_433345085 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove8__5).getLits();
        	for(int ii = 0; ii <array_1226901677.length; ii++) {
        		org.junit.Assert.assertEquals(array_1226901677[ii], array_433345085[ii]);
        	};
        int[] array_710729714 = new int[]{198,200};
        	int[] array_418055333 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove8__6).getLits();
        	for(int ii = 0; ii <array_710729714.length; ii++) {
        		org.junit.Assert.assertEquals(array_710729714[ii], array_418055333[ii]);
        	};
        Assert.assertEquals("", ((VecInt) (clause)).toString());
        Assert.assertTrue(((VecInt) (clause)).isEmpty());
        Assert.assertEquals("", ((VecInt) (o_testNoSolutionExists_remove8__3)).toString());
        Assert.assertTrue(((VecInt) (o_testNoSolutionExists_remove8__3)).isEmpty());
        int[] array_743199523 = new int[]{198,200};
        	int[] array_1419382805 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove8__5).getLits();
        	for(int ii = 0; ii <array_743199523.length; ii++) {
        		org.junit.Assert.assertEquals(array_743199523[ii], array_1419382805[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_testNoSolutionExists_remove8__5)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testNoSolutionExists_remove8__5)).getActivity())), 0.1);
        Assert.assertEquals("99[?] 100[?]", ((OriginalBinaryClause) (o_testNoSolutionExists_remove8__5)).toString());
        Assert.assertEquals(199, ((int) (((OriginalBinaryClause) (o_testNoSolutionExists_remove8__5)).hashCode())));
        int[] array_1720556284 = new int[]{198,200};
        	int[] array_1251315957 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove8__6).getLits();
        	for(int ii = 0; ii <array_1720556284.length; ii++) {
        		org.junit.Assert.assertEquals(array_1720556284[ii], array_1251315957[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_testNoSolutionExists_remove8__6)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testNoSolutionExists_remove8__6)).getActivity())), 0.1);
        Assert.assertEquals("99[?] 100[?]", ((OriginalBinaryClause) (o_testNoSolutionExists_remove8__6)).toString());
        Assert.assertEquals(199, ((int) (((OriginalBinaryClause) (o_testNoSolutionExists_remove8__6)).hashCode())));
        Assert.assertEquals("", ((VecInt) (o_testNoSolutionExists_remove8__9)).toString());
        Assert.assertTrue(((VecInt) (o_testNoSolutionExists_remove8__9)).isEmpty());
        Assert.assertEquals("", ((VecInt) (o_testNoSolutionExists_remove8__11)).toString());
        Assert.assertTrue(((VecInt) (o_testNoSolutionExists_remove8__11)).isEmpty());
    }

    @Test(timeout = 30000)
    public void testNoSolutionExists_remove8_remove43() throws Exception, ContradictionException, TimeoutException {
        IVecInt clause = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause)).toString());
        Assert.assertTrue(((VecInt) (clause)).isEmpty());
        IVecInt o_testNoSolutionExists_remove8__3 = clause.push(100).push(99);
        Assert.assertEquals("100,99", ((VecInt) (o_testNoSolutionExists_remove8__3)).toString());
        Assert.assertEquals(99, ((int) (((VecInt) (o_testNoSolutionExists_remove8__3)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExists_remove8__3)).isEmpty());
        IConstr o_testNoSolutionExists_remove8__5 = solver.addClause(clause);
        int[] array_813903072 = new int[]{198,200};
        	int[] array_1752251416 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove8__5).getLits();
        	for(int ii = 0; ii <array_813903072.length; ii++) {
        		org.junit.Assert.assertEquals(array_813903072[ii], array_1752251416[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_testNoSolutionExists_remove8__5)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testNoSolutionExists_remove8__5)).getActivity())), 0.1);
        Assert.assertEquals("99[?] 100[?]", ((OriginalBinaryClause) (o_testNoSolutionExists_remove8__5)).toString());
        Assert.assertEquals(199, ((int) (((OriginalBinaryClause) (o_testNoSolutionExists_remove8__5)).hashCode())));
        int[] array_2086707665 = new int[]{198,200};
        	int[] array_1278592644 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove8__5).getLits();
        	for(int ii = 0; ii <array_2086707665.length; ii++) {
        		org.junit.Assert.assertEquals(array_2086707665[ii], array_1278592644[ii]);
        	};
        IConstr o_testNoSolutionExists_remove8__6 = solver.addClause(clause);
        int[] array_1206684408 = new int[]{198,200};
        	int[] array_83732820 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove8__6).getLits();
        	for(int ii = 0; ii <array_1206684408.length; ii++) {
        		org.junit.Assert.assertEquals(array_1206684408[ii], array_83732820[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_testNoSolutionExists_remove8__6)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testNoSolutionExists_remove8__6)).getActivity())), 0.1);
        Assert.assertEquals("99[?] 100[?]", ((OriginalBinaryClause) (o_testNoSolutionExists_remove8__6)).toString());
        Assert.assertEquals(199, ((int) (((OriginalBinaryClause) (o_testNoSolutionExists_remove8__6)).hashCode())));
        int[] array_497080696 = new int[]{198,200};
        	int[] array_40865201 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove8__6).getLits();
        	for(int ii = 0; ii <array_497080696.length; ii++) {
        		org.junit.Assert.assertEquals(array_497080696[ii], array_40865201[ii]);
        	};
        clause.clear();
        clause.clear();
        clause.clear();
        IVecInt o_testNoSolutionExists_remove8__9 = clause.push((-99));
        Assert.assertEquals("-99", ((VecInt) (o_testNoSolutionExists_remove8__9)).toString());
        Assert.assertEquals(-99, ((int) (((VecInt) (o_testNoSolutionExists_remove8__9)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExists_remove8__9)).isEmpty());
        IVecInt o_testNoSolutionExists_remove8__11 = clause.push((-100));
        Assert.assertEquals("-99,-100", ((VecInt) (o_testNoSolutionExists_remove8__11)).toString());
        Assert.assertEquals(-99, ((int) (((VecInt) (o_testNoSolutionExists_remove8__11)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExists_remove8__11)).isEmpty());
        int[] array_1226901677 = new int[]{198,200};
        	int[] array_433345085 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove8__5).getLits();
        	for(int ii = 0; ii <array_1226901677.length; ii++) {
        		org.junit.Assert.assertEquals(array_1226901677[ii], array_433345085[ii]);
        	};
        int[] array_710729714 = new int[]{198,200};
        	int[] array_418055333 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove8__6).getLits();
        	for(int ii = 0; ii <array_710729714.length; ii++) {
        		org.junit.Assert.assertEquals(array_710729714[ii], array_418055333[ii]);
        	};
        Assert.assertEquals("-99,-100", ((VecInt) (clause)).toString());
        Assert.assertEquals(-99, ((int) (((VecInt) (clause)).hashCode())));
        Assert.assertFalse(((VecInt) (clause)).isEmpty());
        Assert.assertEquals("-99,-100", ((VecInt) (o_testNoSolutionExists_remove8__3)).toString());
        Assert.assertEquals(-99, ((int) (((VecInt) (o_testNoSolutionExists_remove8__3)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExists_remove8__3)).isEmpty());
        int[] array_941236618 = new int[]{198,200};
        	int[] array_1946306464 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove8__5).getLits();
        	for(int ii = 0; ii <array_941236618.length; ii++) {
        		org.junit.Assert.assertEquals(array_941236618[ii], array_1946306464[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_testNoSolutionExists_remove8__5)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testNoSolutionExists_remove8__5)).getActivity())), 0.1);
        Assert.assertEquals("99[?] 100[?]", ((OriginalBinaryClause) (o_testNoSolutionExists_remove8__5)).toString());
        Assert.assertEquals(199, ((int) (((OriginalBinaryClause) (o_testNoSolutionExists_remove8__5)).hashCode())));
        int[] array_1367102476 = new int[]{198,200};
        	int[] array_991407625 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove8__6).getLits();
        	for(int ii = 0; ii <array_1367102476.length; ii++) {
        		org.junit.Assert.assertEquals(array_1367102476[ii], array_991407625[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_testNoSolutionExists_remove8__6)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testNoSolutionExists_remove8__6)).getActivity())), 0.1);
        Assert.assertEquals("99[?] 100[?]", ((OriginalBinaryClause) (o_testNoSolutionExists_remove8__6)).toString());
        Assert.assertEquals(199, ((int) (((OriginalBinaryClause) (o_testNoSolutionExists_remove8__6)).hashCode())));
        Assert.assertEquals("-99,-100", ((VecInt) (o_testNoSolutionExists_remove8__9)).toString());
        Assert.assertEquals(-99, ((int) (((VecInt) (o_testNoSolutionExists_remove8__9)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExists_remove8__9)).isEmpty());
        Assert.assertEquals("-99,-100", ((VecInt) (o_testNoSolutionExists_remove8__11)).toString());
        Assert.assertEquals(-99, ((int) (((VecInt) (o_testNoSolutionExists_remove8__11)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExists_remove8__11)).isEmpty());
    }

    @Test(timeout = 30000)
    public void testNoSolutionExists_remove9_remove44() throws Exception, ContradictionException, TimeoutException {
        IVecInt clause = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause)).toString());
        Assert.assertTrue(((VecInt) (clause)).isEmpty());
        IVecInt o_testNoSolutionExists_remove9__3 = clause.push(100).push(99);
        Assert.assertEquals("100,99", ((VecInt) (o_testNoSolutionExists_remove9__3)).toString());
        Assert.assertEquals(99, ((int) (((VecInt) (o_testNoSolutionExists_remove9__3)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExists_remove9__3)).isEmpty());
        IConstr o_testNoSolutionExists_remove9__5 = solver.addClause(clause);
        int[] array_880674157 = new int[]{198,200};
        	int[] array_338723763 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove9__5).getLits();
        	for(int ii = 0; ii <array_880674157.length; ii++) {
        		org.junit.Assert.assertEquals(array_880674157[ii], array_338723763[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_testNoSolutionExists_remove9__5)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testNoSolutionExists_remove9__5)).getActivity())), 0.1);
        Assert.assertEquals("99[?] 100[?]", ((OriginalBinaryClause) (o_testNoSolutionExists_remove9__5)).toString());
        Assert.assertEquals(199, ((int) (((OriginalBinaryClause) (o_testNoSolutionExists_remove9__5)).hashCode())));
        int[] array_221006639 = new int[]{198,200};
        	int[] array_1045185488 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove9__5).getLits();
        	for(int ii = 0; ii <array_221006639.length; ii++) {
        		org.junit.Assert.assertEquals(array_221006639[ii], array_1045185488[ii]);
        	};
        IConstr o_testNoSolutionExists_remove9__6 = solver.addClause(clause);
        int[] array_651321302 = new int[]{198,200};
        	int[] array_1063796781 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove9__6).getLits();
        	for(int ii = 0; ii <array_651321302.length; ii++) {
        		org.junit.Assert.assertEquals(array_651321302[ii], array_1063796781[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_testNoSolutionExists_remove9__6)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testNoSolutionExists_remove9__6)).getActivity())), 0.1);
        Assert.assertEquals("99[?] 100[?]", ((OriginalBinaryClause) (o_testNoSolutionExists_remove9__6)).toString());
        Assert.assertEquals(199, ((int) (((OriginalBinaryClause) (o_testNoSolutionExists_remove9__6)).hashCode())));
        int[] array_705254390 = new int[]{198,200};
        	int[] array_934395863 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove9__6).getLits();
        	for(int ii = 0; ii <array_705254390.length; ii++) {
        		org.junit.Assert.assertEquals(array_705254390[ii], array_934395863[ii]);
        	};
        IConstr o_testNoSolutionExists_remove9__7 = solver.addClause(clause);
        int[] array_1173446498 = new int[]{198,200};
        	int[] array_1553752628 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove9__7).getLits();
        	for(int ii = 0; ii <array_1173446498.length; ii++) {
        		org.junit.Assert.assertEquals(array_1173446498[ii], array_1553752628[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_testNoSolutionExists_remove9__7)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testNoSolutionExists_remove9__7)).getActivity())), 0.1);
        Assert.assertEquals("99[?] 100[?]", ((OriginalBinaryClause) (o_testNoSolutionExists_remove9__7)).toString());
        Assert.assertEquals(199, ((int) (((OriginalBinaryClause) (o_testNoSolutionExists_remove9__7)).hashCode())));
        int[] array_1517406316 = new int[]{198,200};
        	int[] array_362573722 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove9__7).getLits();
        	for(int ii = 0; ii <array_1517406316.length; ii++) {
        		org.junit.Assert.assertEquals(array_1517406316[ii], array_362573722[ii]);
        	};
        clause.clear();
        IVecInt o_testNoSolutionExists_remove9__10 = clause.push((-99));
        Assert.assertEquals("-99", ((VecInt) (o_testNoSolutionExists_remove9__10)).toString());
        Assert.assertEquals(-99, ((int) (((VecInt) (o_testNoSolutionExists_remove9__10)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExists_remove9__10)).isEmpty());
        IVecInt o_testNoSolutionExists_remove9__12 = clause.push((-100));
        Assert.assertEquals("-99,-100", ((VecInt) (o_testNoSolutionExists_remove9__12)).toString());
        Assert.assertEquals(-99, ((int) (((VecInt) (o_testNoSolutionExists_remove9__12)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExists_remove9__12)).isEmpty());
        this.solver.isSatisfiable();
        int[] array_1640902160 = new int[]{198,200};
        	int[] array_1486333941 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove9__5).getLits();
        	for(int ii = 0; ii <array_1640902160.length; ii++) {
        		org.junit.Assert.assertEquals(array_1640902160[ii], array_1486333941[ii]);
        	};
        int[] array_1990166463 = new int[]{198,200};
        	int[] array_1391374059 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove9__6).getLits();
        	for(int ii = 0; ii <array_1990166463.length; ii++) {
        		org.junit.Assert.assertEquals(array_1990166463[ii], array_1391374059[ii]);
        	};
        int[] array_986292459 = new int[]{198,200};
        	int[] array_60832105 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove9__7).getLits();
        	for(int ii = 0; ii <array_986292459.length; ii++) {
        		org.junit.Assert.assertEquals(array_986292459[ii], array_60832105[ii]);
        	};
        Assert.assertEquals("-99,-100", ((VecInt) (clause)).toString());
        Assert.assertEquals(-99, ((int) (((VecInt) (clause)).hashCode())));
        Assert.assertFalse(((VecInt) (clause)).isEmpty());
        Assert.assertEquals("-99,-100", ((VecInt) (o_testNoSolutionExists_remove9__3)).toString());
        Assert.assertEquals(-99, ((int) (((VecInt) (o_testNoSolutionExists_remove9__3)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExists_remove9__3)).isEmpty());
        int[] array_941898802 = new int[]{198,200};
        	int[] array_1794034100 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove9__5).getLits();
        	for(int ii = 0; ii <array_941898802.length; ii++) {
        		org.junit.Assert.assertEquals(array_941898802[ii], array_1794034100[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_testNoSolutionExists_remove9__5)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testNoSolutionExists_remove9__5)).getActivity())), 0.1);
        Assert.assertEquals("99[?] 100[?]", ((OriginalBinaryClause) (o_testNoSolutionExists_remove9__5)).toString());
        Assert.assertEquals(199, ((int) (((OriginalBinaryClause) (o_testNoSolutionExists_remove9__5)).hashCode())));
        int[] array_1177382155 = new int[]{198,200};
        	int[] array_830860305 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove9__6).getLits();
        	for(int ii = 0; ii <array_1177382155.length; ii++) {
        		org.junit.Assert.assertEquals(array_1177382155[ii], array_830860305[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_testNoSolutionExists_remove9__6)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testNoSolutionExists_remove9__6)).getActivity())), 0.1);
        Assert.assertEquals("99[?] 100[?]", ((OriginalBinaryClause) (o_testNoSolutionExists_remove9__6)).toString());
        Assert.assertEquals(199, ((int) (((OriginalBinaryClause) (o_testNoSolutionExists_remove9__6)).hashCode())));
        int[] array_1821905175 = new int[]{198,200};
        	int[] array_1097965990 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove9__7).getLits();
        	for(int ii = 0; ii <array_1821905175.length; ii++) {
        		org.junit.Assert.assertEquals(array_1821905175[ii], array_1097965990[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_testNoSolutionExists_remove9__7)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testNoSolutionExists_remove9__7)).getActivity())), 0.1);
        Assert.assertEquals("99[?] 100[?]", ((OriginalBinaryClause) (o_testNoSolutionExists_remove9__7)).toString());
        Assert.assertEquals(199, ((int) (((OriginalBinaryClause) (o_testNoSolutionExists_remove9__7)).hashCode())));
        Assert.assertEquals("-99,-100", ((VecInt) (o_testNoSolutionExists_remove9__10)).toString());
        Assert.assertEquals(-99, ((int) (((VecInt) (o_testNoSolutionExists_remove9__10)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExists_remove9__10)).isEmpty());
        Assert.assertEquals("-99,-100", ((VecInt) (o_testNoSolutionExists_remove9__12)).toString());
        Assert.assertEquals(-99, ((int) (((VecInt) (o_testNoSolutionExists_remove9__12)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExists_remove9__12)).isEmpty());
    }

    @Test(timeout = 30000)
    public void testNoSolutionExists_remove3_remove37_failAssert3() throws Exception, ContradictionException, TimeoutException {
        try {
            IVecInt clause = new VecInt();
            IVecInt o_testNoSolutionExists_remove3__3 = clause.push(100).push(99);
            IConstr o_testNoSolutionExists_remove3__5 = solver.addClause(clause);
            int[] array_960144037 = new int[]{198,200};
            	int[] array_619987209 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove3__5).getLits();
            	for(int ii = 0; ii <array_960144037.length; ii++) {
            		org.junit.Assert.assertEquals(array_960144037[ii], array_619987209[ii]);
            	};
            IVecInt o_testNoSolutionExists_remove3__6 = clause.push((-99));
            solver.addClause(clause);
            clause.clear();
            solver.addClause(clause);
            clause.clear();
            this.solver.isSatisfiable();
            org.junit.Assert.fail("testNoSolutionExists_remove3_remove37 should have thrown ContradictionException");
        } catch (ContradictionException expected) {
            Assert.assertEquals("Creating Empty clause ?", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testNoSolutionExists_remove6_remove60_failAssert4() throws Exception, ContradictionException, TimeoutException {
        try {
            IVecInt clause = new VecInt();
            IVecInt o_testNoSolutionExists_remove6__3 = clause.push(100).push(99);
            IConstr o_testNoSolutionExists_remove6__5 = solver.addClause(clause);
            int[] array_1780117107 = new int[]{198,200};
            	int[] array_1918579922 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove6__5).getLits();
            	for(int ii = 0; ii <array_1780117107.length; ii++) {
            		org.junit.Assert.assertEquals(array_1780117107[ii], array_1918579922[ii]);
            	};
            IConstr o_testNoSolutionExists_remove6__6 = solver.addClause(clause);
            int[] array_582027917 = new int[]{198,200};
            	int[] array_2113184556 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove6__6).getLits();
            	for(int ii = 0; ii <array_582027917.length; ii++) {
            		org.junit.Assert.assertEquals(array_582027917[ii], array_2113184556[ii]);
            	};
            IVecInt o_testNoSolutionExists_remove6__8 = clause.push((-99));
            IVecInt o_testNoSolutionExists_remove6__10 = clause.push((-100));
            IConstr o_testNoSolutionExists_remove6__12 = solver.addClause(clause);
            int[] array_1848848534 = new int[]{199,201};
            	int[] array_1904675524 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove6__12).getLits();
            	for(int ii = 0; ii <array_1848848534.length; ii++) {
            		org.junit.Assert.assertEquals(array_1848848534[ii], array_1904675524[ii]);
            	};
            clause.clear();
            this.solver.isSatisfiable();
            int[] array_21383048 = new int[]{198,200};
            	int[] array_2064975260 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove6__5).getLits();
            	for(int ii = 0; ii <array_21383048.length; ii++) {
            		org.junit.Assert.assertEquals(array_21383048[ii], array_2064975260[ii]);
            	};
            int[] array_19668052 = new int[]{198,200};
            	int[] array_564957235 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove6__6).getLits();
            	for(int ii = 0; ii <array_19668052.length; ii++) {
            		org.junit.Assert.assertEquals(array_19668052[ii], array_564957235[ii]);
            	};
            int[] array_1348236471 = new int[]{199,201};
            	int[] array_2145706595 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove6__12).getLits();
            	for(int ii = 0; ii <array_1348236471.length; ii++) {
            		org.junit.Assert.assertEquals(array_1348236471[ii], array_2145706595[ii]);
            	};
            org.junit.Assert.fail("testNoSolutionExists_remove6_remove60 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testNoSolutionExists_remove2_remove49_remove187() throws Exception, ContradictionException, TimeoutException {
        IVecInt clause = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause)).toString());
        Assert.assertTrue(((VecInt) (clause)).isEmpty());
        IVecInt o_testNoSolutionExists_remove2__3 = clause.push(100).push(99);
        Assert.assertEquals("100,99", ((VecInt) (o_testNoSolutionExists_remove2__3)).toString());
        Assert.assertEquals(99, ((int) (((VecInt) (o_testNoSolutionExists_remove2__3)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExists_remove2__3)).isEmpty());
        IVecInt o_testNoSolutionExists_remove2__6 = clause.push((-99));
        Assert.assertEquals("100,99,-99", ((VecInt) (o_testNoSolutionExists_remove2__6)).toString());
        Assert.assertEquals(33, ((int) (((VecInt) (o_testNoSolutionExists_remove2__6)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExists_remove2__6)).isEmpty());
        IConstr o_testNoSolutionExists_remove2__8 = solver.addClause(clause);
        IVecInt o_testNoSolutionExists_remove2__10 = clause.push((-100));
        IConstr o_testNoSolutionExists_remove2__12 = solver.addClause(clause);
        clause.clear();
        this.solver.isSatisfiable();
    }

    @Test(timeout = 30000)
    public void testNoSolutionExists_remove2_remove49_remove188() throws Exception, ContradictionException, TimeoutException {
        IVecInt clause = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause)).toString());
        Assert.assertTrue(((VecInt) (clause)).isEmpty());
        IVecInt o_testNoSolutionExists_remove2__3 = clause.push(100).push(99);
        Assert.assertEquals("100,99", ((VecInt) (o_testNoSolutionExists_remove2__3)).toString());
        Assert.assertEquals(99, ((int) (((VecInt) (o_testNoSolutionExists_remove2__3)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExists_remove2__3)).isEmpty());
        IVecInt o_testNoSolutionExists_remove2__6 = clause.push((-99));
        Assert.assertEquals("100,99,-99", ((VecInt) (o_testNoSolutionExists_remove2__6)).toString());
        Assert.assertEquals(33, ((int) (((VecInt) (o_testNoSolutionExists_remove2__6)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExists_remove2__6)).isEmpty());
        IConstr o_testNoSolutionExists_remove2__8 = solver.addClause(clause);
        clause.clear();
        IVecInt o_testNoSolutionExists_remove2__10 = clause.push((-100));
        IConstr o_testNoSolutionExists_remove2__12 = solver.addClause(clause);
        this.solver.isSatisfiable();
    }

    @Test(timeout = 30000)
    public void testNoSolutionExists_remove2_remove49_remove190() throws Exception, ContradictionException, TimeoutException {
        IVecInt clause = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause)).toString());
        Assert.assertTrue(((VecInt) (clause)).isEmpty());
        IVecInt o_testNoSolutionExists_remove2__3 = clause.push(100).push(99);
        Assert.assertEquals("100,99", ((VecInt) (o_testNoSolutionExists_remove2__3)).toString());
        Assert.assertEquals(99, ((int) (((VecInt) (o_testNoSolutionExists_remove2__3)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExists_remove2__3)).isEmpty());
        IVecInt o_testNoSolutionExists_remove2__6 = clause.push((-99));
        Assert.assertEquals("100,99,-99", ((VecInt) (o_testNoSolutionExists_remove2__6)).toString());
        Assert.assertEquals(33, ((int) (((VecInt) (o_testNoSolutionExists_remove2__6)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExists_remove2__6)).isEmpty());
        IConstr o_testNoSolutionExists_remove2__8 = solver.addClause(clause);
        clause.clear();
        clause.clear();
        IVecInt o_testNoSolutionExists_remove2__10 = clause.push((-100));
        IConstr o_testNoSolutionExists_remove2__12 = this.solver.addClause(clause);
    }

    @Test(timeout = 30000)
    public void testNoSolutionExists_remove2_remove50_remove186() throws Exception, ContradictionException, TimeoutException {
        IVecInt clause = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause)).toString());
        Assert.assertTrue(((VecInt) (clause)).isEmpty());
        IVecInt o_testNoSolutionExists_remove2__3 = clause.push(100).push(99);
        Assert.assertEquals("100,99", ((VecInt) (o_testNoSolutionExists_remove2__3)).toString());
        Assert.assertEquals(99, ((int) (((VecInt) (o_testNoSolutionExists_remove2__3)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExists_remove2__3)).isEmpty());
        clause.clear();
        IVecInt o_testNoSolutionExists_remove2__6 = clause.push((-99));
        Assert.assertEquals("-99", ((VecInt) (o_testNoSolutionExists_remove2__6)).toString());
        Assert.assertEquals(-99, ((int) (((VecInt) (o_testNoSolutionExists_remove2__6)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExists_remove2__6)).isEmpty());
        IConstr o_testNoSolutionExists_remove2__8 = solver.addClause(clause);
        Assert.assertTrue(((UnitClause) (o_testNoSolutionExists_remove2__8)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_testNoSolutionExists_remove2__8)).getActivity())), 0.1);
        Assert.assertEquals("-99", ((UnitClause) (o_testNoSolutionExists_remove2__8)).toString());
        IVecInt o_testNoSolutionExists_remove2__10 = clause.push((-100));
        Assert.assertEquals("-99,-100", ((VecInt) (o_testNoSolutionExists_remove2__10)).toString());
        Assert.assertEquals(-99, ((int) (((VecInt) (o_testNoSolutionExists_remove2__10)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExists_remove2__10)).isEmpty());
        IConstr o_testNoSolutionExists_remove2__12 = solver.addClause(clause);
        this.solver.isSatisfiable();
    }

    @Test(timeout = 30000)
    public void testNoSolutionExists_remove2_remove50_remove189() throws Exception, ContradictionException, TimeoutException {
        IVecInt clause = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause)).toString());
        Assert.assertTrue(((VecInt) (clause)).isEmpty());
        IVecInt o_testNoSolutionExists_remove2__3 = clause.push(100).push(99);
        Assert.assertEquals("100,99", ((VecInt) (o_testNoSolutionExists_remove2__3)).toString());
        Assert.assertEquals(99, ((int) (((VecInt) (o_testNoSolutionExists_remove2__3)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExists_remove2__3)).isEmpty());
        clause.clear();
        clause.clear();
        IVecInt o_testNoSolutionExists_remove2__6 = clause.push((-99));
        Assert.assertEquals("-99", ((VecInt) (o_testNoSolutionExists_remove2__6)).toString());
        Assert.assertEquals(-99, ((int) (((VecInt) (o_testNoSolutionExists_remove2__6)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExists_remove2__6)).isEmpty());
        IConstr o_testNoSolutionExists_remove2__8 = solver.addClause(clause);
        Assert.assertTrue(((UnitClause) (o_testNoSolutionExists_remove2__8)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_testNoSolutionExists_remove2__8)).getActivity())), 0.1);
        Assert.assertEquals("-99", ((UnitClause) (o_testNoSolutionExists_remove2__8)).toString());
        IVecInt o_testNoSolutionExists_remove2__10 = clause.push((-100));
        Assert.assertEquals("-99,-100", ((VecInt) (o_testNoSolutionExists_remove2__10)).toString());
        Assert.assertEquals(-99, ((int) (((VecInt) (o_testNoSolutionExists_remove2__10)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExists_remove2__10)).isEmpty());
        IConstr o_testNoSolutionExists_remove2__12 = this.solver.addClause(clause);
    }

    @Test(timeout = 30000)
    public void testNoSolutionExists_remove3_remove35_remove191() throws Exception, ContradictionException, TimeoutException {
        IVecInt clause = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause)).toString());
        Assert.assertTrue(((VecInt) (clause)).isEmpty());
        IVecInt o_testNoSolutionExists_remove3__3 = clause.push(100).push(99);
        Assert.assertEquals("100,99", ((VecInt) (o_testNoSolutionExists_remove3__3)).toString());
        Assert.assertEquals(99, ((int) (((VecInt) (o_testNoSolutionExists_remove3__3)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExists_remove3__3)).isEmpty());
        IConstr o_testNoSolutionExists_remove3__5 = solver.addClause(clause);
        int[] array_465063425 = new int[]{198,200};
        	int[] array_31963640 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove3__5).getLits();
        	for(int ii = 0; ii <array_465063425.length; ii++) {
        		org.junit.Assert.assertEquals(array_465063425[ii], array_31963640[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_testNoSolutionExists_remove3__5)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testNoSolutionExists_remove3__5)).getActivity())), 0.1);
        Assert.assertEquals("99[?] 100[?]", ((OriginalBinaryClause) (o_testNoSolutionExists_remove3__5)).toString());
        Assert.assertEquals(199, ((int) (((OriginalBinaryClause) (o_testNoSolutionExists_remove3__5)).hashCode())));
        int[] array_437357759 = new int[]{198,200};
        	int[] array_840349311 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove3__5).getLits();
        	for(int ii = 0; ii <array_437357759.length; ii++) {
        		org.junit.Assert.assertEquals(array_437357759[ii], array_840349311[ii]);
        	};
        int[] array_960144037 = new int[]{198,200};
        	int[] array_619987209 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove3__5).getLits();
        	for(int ii = 0; ii <array_960144037.length; ii++) {
        		org.junit.Assert.assertEquals(array_960144037[ii], array_619987209[ii]);
        	};
        IVecInt o_testNoSolutionExists_remove3__6 = clause.push((-99));
        Assert.assertEquals("100,99,-99", ((VecInt) (o_testNoSolutionExists_remove3__6)).toString());
        Assert.assertEquals(33, ((int) (((VecInt) (o_testNoSolutionExists_remove3__6)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExists_remove3__6)).isEmpty());
        IVecInt o_testNoSolutionExists_remove3_remove35__17 = clause.push((-100));
        Assert.assertEquals("100,99,-99,-100", ((VecInt) (o_testNoSolutionExists_remove3_remove35__17)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_testNoSolutionExists_remove3_remove35__17)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExists_remove3_remove35__17)).isEmpty());
        IConstr o_testNoSolutionExists_remove3_remove35__19 = solver.addClause(clause);
        clause.clear();
        this.solver.isSatisfiable();
        int[] array_478132801 = new int[]{198,200};
        	int[] array_776558984 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove3__5).getLits();
        	for(int ii = 0; ii <array_478132801.length; ii++) {
        		org.junit.Assert.assertEquals(array_478132801[ii], array_776558984[ii]);
        	};
    }

    @Test(timeout = 30000)
    public void testNoSolutionExists_remove3_remove35_remove192() throws Exception, ContradictionException, TimeoutException {
        IVecInt clause = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause)).toString());
        Assert.assertTrue(((VecInt) (clause)).isEmpty());
        IVecInt o_testNoSolutionExists_remove3__3 = clause.push(100).push(99);
        Assert.assertEquals("100,99", ((VecInt) (o_testNoSolutionExists_remove3__3)).toString());
        Assert.assertEquals(99, ((int) (((VecInt) (o_testNoSolutionExists_remove3__3)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExists_remove3__3)).isEmpty());
        IConstr o_testNoSolutionExists_remove3__5 = solver.addClause(clause);
        int[] array_1649700730 = new int[]{198,200};
        	int[] array_164298280 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove3__5).getLits();
        	for(int ii = 0; ii <array_1649700730.length; ii++) {
        		org.junit.Assert.assertEquals(array_1649700730[ii], array_164298280[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_testNoSolutionExists_remove3__5)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testNoSolutionExists_remove3__5)).getActivity())), 0.1);
        Assert.assertEquals("99[?] 100[?]", ((OriginalBinaryClause) (o_testNoSolutionExists_remove3__5)).toString());
        Assert.assertEquals(199, ((int) (((OriginalBinaryClause) (o_testNoSolutionExists_remove3__5)).hashCode())));
        int[] array_437357759 = new int[]{198,200};
        	int[] array_840349311 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove3__5).getLits();
        	for(int ii = 0; ii <array_437357759.length; ii++) {
        		org.junit.Assert.assertEquals(array_437357759[ii], array_840349311[ii]);
        	};
        int[] array_960144037 = new int[]{198,200};
        	int[] array_619987209 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove3__5).getLits();
        	for(int ii = 0; ii <array_960144037.length; ii++) {
        		org.junit.Assert.assertEquals(array_960144037[ii], array_619987209[ii]);
        	};
        IVecInt o_testNoSolutionExists_remove3__6 = clause.push((-99));
        Assert.assertEquals("100,99,-99", ((VecInt) (o_testNoSolutionExists_remove3__6)).toString());
        Assert.assertEquals(33, ((int) (((VecInt) (o_testNoSolutionExists_remove3__6)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExists_remove3__6)).isEmpty());
        clause.clear();
        IVecInt o_testNoSolutionExists_remove3_remove35__17 = clause.push((-100));
        Assert.assertEquals("-100", ((VecInt) (o_testNoSolutionExists_remove3_remove35__17)).toString());
        Assert.assertEquals(-100, ((int) (((VecInt) (o_testNoSolutionExists_remove3_remove35__17)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExists_remove3_remove35__17)).isEmpty());
        IConstr o_testNoSolutionExists_remove3_remove35__19 = solver.addClause(clause);
        Assert.assertTrue(((UnitClause) (o_testNoSolutionExists_remove3_remove35__19)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_testNoSolutionExists_remove3_remove35__19)).getActivity())), 0.1);
        Assert.assertEquals("-100", ((UnitClause) (o_testNoSolutionExists_remove3_remove35__19)).toString());
        this.solver.isSatisfiable();
        int[] array_478132801 = new int[]{198,200};
        	int[] array_776558984 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove3__5).getLits();
        	for(int ii = 0; ii <array_478132801.length; ii++) {
        		org.junit.Assert.assertEquals(array_478132801[ii], array_776558984[ii]);
        	};
        Assert.assertEquals("-100", ((VecInt) (clause)).toString());
        Assert.assertEquals(-100, ((int) (((VecInt) (clause)).hashCode())));
        Assert.assertFalse(((VecInt) (clause)).isEmpty());
        Assert.assertEquals("-100", ((VecInt) (o_testNoSolutionExists_remove3__3)).toString());
        Assert.assertEquals(-100, ((int) (((VecInt) (o_testNoSolutionExists_remove3__3)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExists_remove3__3)).isEmpty());
        int[] array_238031218 = new int[]{198,200};
        	int[] array_45922017 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove3__5).getLits();
        	for(int ii = 0; ii <array_238031218.length; ii++) {
        		org.junit.Assert.assertEquals(array_238031218[ii], array_45922017[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_testNoSolutionExists_remove3__5)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testNoSolutionExists_remove3__5)).getActivity())), 0.1);
        Assert.assertEquals("99[?] 100[F]", ((OriginalBinaryClause) (o_testNoSolutionExists_remove3__5)).toString());
        Assert.assertEquals(199, ((int) (((OriginalBinaryClause) (o_testNoSolutionExists_remove3__5)).hashCode())));
        Assert.assertEquals("-100", ((VecInt) (o_testNoSolutionExists_remove3__6)).toString());
        Assert.assertEquals(-100, ((int) (((VecInt) (o_testNoSolutionExists_remove3__6)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExists_remove3__6)).isEmpty());
        Assert.assertEquals("-100", ((VecInt) (o_testNoSolutionExists_remove3_remove35__17)).toString());
        Assert.assertEquals(-100, ((int) (((VecInt) (o_testNoSolutionExists_remove3_remove35__17)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExists_remove3_remove35__17)).isEmpty());
        Assert.assertTrue(((UnitClause) (o_testNoSolutionExists_remove3_remove35__19)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_testNoSolutionExists_remove3_remove35__19)).getActivity())), 0.1);
        Assert.assertEquals("-100", ((UnitClause) (o_testNoSolutionExists_remove3_remove35__19)).toString());
    }

    @Test(timeout = 30000)
    public void testNoSolutionExists_remove3_remove35_remove193() throws Exception, ContradictionException, TimeoutException {
        IVecInt clause = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause)).toString());
        Assert.assertTrue(((VecInt) (clause)).isEmpty());
        IVecInt o_testNoSolutionExists_remove3__3 = clause.push(100).push(99);
        Assert.assertEquals("100,99", ((VecInt) (o_testNoSolutionExists_remove3__3)).toString());
        Assert.assertEquals(99, ((int) (((VecInt) (o_testNoSolutionExists_remove3__3)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExists_remove3__3)).isEmpty());
        IConstr o_testNoSolutionExists_remove3__5 = solver.addClause(clause);
        int[] array_536654171 = new int[]{198,200};
        	int[] array_322346155 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove3__5).getLits();
        	for(int ii = 0; ii <array_536654171.length; ii++) {
        		org.junit.Assert.assertEquals(array_536654171[ii], array_322346155[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_testNoSolutionExists_remove3__5)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testNoSolutionExists_remove3__5)).getActivity())), 0.1);
        Assert.assertEquals("99[?] 100[?]", ((OriginalBinaryClause) (o_testNoSolutionExists_remove3__5)).toString());
        Assert.assertEquals(199, ((int) (((OriginalBinaryClause) (o_testNoSolutionExists_remove3__5)).hashCode())));
        int[] array_437357759 = new int[]{198,200};
        	int[] array_840349311 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove3__5).getLits();
        	for(int ii = 0; ii <array_437357759.length; ii++) {
        		org.junit.Assert.assertEquals(array_437357759[ii], array_840349311[ii]);
        	};
        int[] array_960144037 = new int[]{198,200};
        	int[] array_619987209 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove3__5).getLits();
        	for(int ii = 0; ii <array_960144037.length; ii++) {
        		org.junit.Assert.assertEquals(array_960144037[ii], array_619987209[ii]);
        	};
        IVecInt o_testNoSolutionExists_remove3__6 = clause.push((-99));
        Assert.assertEquals("100,99,-99", ((VecInt) (o_testNoSolutionExists_remove3__6)).toString());
        Assert.assertEquals(33, ((int) (((VecInt) (o_testNoSolutionExists_remove3__6)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExists_remove3__6)).isEmpty());
        clause.clear();
        clause.clear();
        IVecInt o_testNoSolutionExists_remove3_remove35__17 = clause.push((-100));
        Assert.assertEquals("-100", ((VecInt) (o_testNoSolutionExists_remove3_remove35__17)).toString());
        Assert.assertEquals(-100, ((int) (((VecInt) (o_testNoSolutionExists_remove3_remove35__17)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExists_remove3_remove35__17)).isEmpty());
        IConstr o_testNoSolutionExists_remove3_remove35__19 = solver.addClause(clause);
        Assert.assertTrue(((UnitClause) (o_testNoSolutionExists_remove3_remove35__19)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_testNoSolutionExists_remove3_remove35__19)).getActivity())), 0.1);
        Assert.assertEquals("-100", ((UnitClause) (o_testNoSolutionExists_remove3_remove35__19)).toString());
        int[] array_478132801 = new int[]{198,200};
        	int[] array_776558984 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove3__5).getLits();
        	for(int ii = 0; ii <array_478132801.length; ii++) {
        		org.junit.Assert.assertEquals(array_478132801[ii], array_776558984[ii]);
        	};
        Assert.assertEquals("-100", ((VecInt) (clause)).toString());
        Assert.assertEquals(-100, ((int) (((VecInt) (clause)).hashCode())));
        Assert.assertFalse(((VecInt) (clause)).isEmpty());
        Assert.assertEquals("-100", ((VecInt) (o_testNoSolutionExists_remove3__3)).toString());
        Assert.assertEquals(-100, ((int) (((VecInt) (o_testNoSolutionExists_remove3__3)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExists_remove3__3)).isEmpty());
        int[] array_787551030 = new int[]{198,200};
        	int[] array_385783573 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove3__5).getLits();
        	for(int ii = 0; ii <array_787551030.length; ii++) {
        		org.junit.Assert.assertEquals(array_787551030[ii], array_385783573[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_testNoSolutionExists_remove3__5)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testNoSolutionExists_remove3__5)).getActivity())), 0.1);
        Assert.assertEquals("99[?] 100[F]", ((OriginalBinaryClause) (o_testNoSolutionExists_remove3__5)).toString());
        Assert.assertEquals(199, ((int) (((OriginalBinaryClause) (o_testNoSolutionExists_remove3__5)).hashCode())));
        Assert.assertEquals("-100", ((VecInt) (o_testNoSolutionExists_remove3__6)).toString());
        Assert.assertEquals(-100, ((int) (((VecInt) (o_testNoSolutionExists_remove3__6)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExists_remove3__6)).isEmpty());
        Assert.assertEquals("-100", ((VecInt) (o_testNoSolutionExists_remove3_remove35__17)).toString());
        Assert.assertEquals(-100, ((int) (((VecInt) (o_testNoSolutionExists_remove3_remove35__17)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExists_remove3_remove35__17)).isEmpty());
        Assert.assertTrue(((UnitClause) (o_testNoSolutionExists_remove3_remove35__19)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_testNoSolutionExists_remove3_remove35__19)).getActivity())), 0.1);
        Assert.assertEquals("-100", ((UnitClause) (o_testNoSolutionExists_remove3_remove35__19)).toString());
    }

    @Test(timeout = 30000)
    public void testNoSolutionExists_remove3_remove36_remove163() throws Exception, ContradictionException, TimeoutException {
        IVecInt clause = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause)).toString());
        Assert.assertTrue(((VecInt) (clause)).isEmpty());
        IVecInt o_testNoSolutionExists_remove3__3 = clause.push(100).push(99);
        Assert.assertEquals("100,99", ((VecInt) (o_testNoSolutionExists_remove3__3)).toString());
        Assert.assertEquals(99, ((int) (((VecInt) (o_testNoSolutionExists_remove3__3)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExists_remove3__3)).isEmpty());
        IConstr o_testNoSolutionExists_remove3__5 = solver.addClause(clause);
        int[] array_776805622 = new int[]{198,200};
        	int[] array_628448202 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove3__5).getLits();
        	for(int ii = 0; ii <array_776805622.length; ii++) {
        		org.junit.Assert.assertEquals(array_776805622[ii], array_628448202[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_testNoSolutionExists_remove3__5)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testNoSolutionExists_remove3__5)).getActivity())), 0.1);
        Assert.assertEquals("99[?] 100[?]", ((OriginalBinaryClause) (o_testNoSolutionExists_remove3__5)).toString());
        Assert.assertEquals(199, ((int) (((OriginalBinaryClause) (o_testNoSolutionExists_remove3__5)).hashCode())));
        int[] array_2098187935 = new int[]{198,200};
        	int[] array_653917512 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove3__5).getLits();
        	for(int ii = 0; ii <array_2098187935.length; ii++) {
        		org.junit.Assert.assertEquals(array_2098187935[ii], array_653917512[ii]);
        	};
        int[] array_960144037 = new int[]{198,200};
        	int[] array_619987209 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove3__5).getLits();
        	for(int ii = 0; ii <array_960144037.length; ii++) {
        		org.junit.Assert.assertEquals(array_960144037[ii], array_619987209[ii]);
        	};
        IVecInt o_testNoSolutionExists_remove3__6 = clause.push((-99));
        Assert.assertEquals("100,99,-99", ((VecInt) (o_testNoSolutionExists_remove3__6)).toString());
        Assert.assertEquals(33, ((int) (((VecInt) (o_testNoSolutionExists_remove3__6)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExists_remove3__6)).isEmpty());
        solver.addClause(clause);
        solver.addClause(clause);
        clause.clear();
        this.solver.isSatisfiable();
    }

    @Test(timeout = 30000)
    public void testNoSolutionExists_remove3_remove36_remove171() throws Exception, ContradictionException, TimeoutException {
        IVecInt clause = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause)).toString());
        Assert.assertTrue(((VecInt) (clause)).isEmpty());
        IVecInt o_testNoSolutionExists_remove3__3 = clause.push(100).push(99);
        Assert.assertEquals("100,99", ((VecInt) (o_testNoSolutionExists_remove3__3)).toString());
        Assert.assertEquals(99, ((int) (((VecInt) (o_testNoSolutionExists_remove3__3)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExists_remove3__3)).isEmpty());
        IConstr o_testNoSolutionExists_remove3__5 = solver.addClause(clause);
        int[] array_889849171 = new int[]{198,200};
        	int[] array_1391488440 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove3__5).getLits();
        	for(int ii = 0; ii <array_889849171.length; ii++) {
        		org.junit.Assert.assertEquals(array_889849171[ii], array_1391488440[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_testNoSolutionExists_remove3__5)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testNoSolutionExists_remove3__5)).getActivity())), 0.1);
        Assert.assertEquals("99[?] 100[?]", ((OriginalBinaryClause) (o_testNoSolutionExists_remove3__5)).toString());
        Assert.assertEquals(199, ((int) (((OriginalBinaryClause) (o_testNoSolutionExists_remove3__5)).hashCode())));
        int[] array_2098187935 = new int[]{198,200};
        	int[] array_653917512 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove3__5).getLits();
        	for(int ii = 0; ii <array_2098187935.length; ii++) {
        		org.junit.Assert.assertEquals(array_2098187935[ii], array_653917512[ii]);
        	};
        int[] array_960144037 = new int[]{198,200};
        	int[] array_619987209 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove3__5).getLits();
        	for(int ii = 0; ii <array_960144037.length; ii++) {
        		org.junit.Assert.assertEquals(array_960144037[ii], array_619987209[ii]);
        	};
        IVecInt o_testNoSolutionExists_remove3__6 = clause.push((-99));
        Assert.assertEquals("100,99,-99", ((VecInt) (o_testNoSolutionExists_remove3__6)).toString());
        Assert.assertEquals(33, ((int) (((VecInt) (o_testNoSolutionExists_remove3__6)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExists_remove3__6)).isEmpty());
        solver.addClause(clause);
        solver.addClause(clause);
        clause.push((-100));
        clause.clear();
    }

    @Test(timeout = 30000)
    public void testNoSolutionExists_remove3_remove39_remove146() throws Exception, ContradictionException, TimeoutException {
        IVecInt clause = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause)).toString());
        Assert.assertTrue(((VecInt) (clause)).isEmpty());
        IVecInt o_testNoSolutionExists_remove3__3 = clause.push(100).push(99);
        Assert.assertEquals("100,99", ((VecInt) (o_testNoSolutionExists_remove3__3)).toString());
        Assert.assertEquals(99, ((int) (((VecInt) (o_testNoSolutionExists_remove3__3)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExists_remove3__3)).isEmpty());
        IConstr o_testNoSolutionExists_remove3__5 = solver.addClause(clause);
        int[] array_426440655 = new int[]{198,200};
        	int[] array_956645493 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove3__5).getLits();
        	for(int ii = 0; ii <array_426440655.length; ii++) {
        		org.junit.Assert.assertEquals(array_426440655[ii], array_956645493[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_testNoSolutionExists_remove3__5)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testNoSolutionExists_remove3__5)).getActivity())), 0.1);
        Assert.assertEquals("99[?] 100[?]", ((OriginalBinaryClause) (o_testNoSolutionExists_remove3__5)).toString());
        Assert.assertEquals(199, ((int) (((OriginalBinaryClause) (o_testNoSolutionExists_remove3__5)).hashCode())));
        int[] array_1601397512 = new int[]{198,200};
        	int[] array_995075168 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove3__5).getLits();
        	for(int ii = 0; ii <array_1601397512.length; ii++) {
        		org.junit.Assert.assertEquals(array_1601397512[ii], array_995075168[ii]);
        	};
        int[] array_960144037 = new int[]{198,200};
        	int[] array_619987209 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove3__5).getLits();
        	for(int ii = 0; ii <array_960144037.length; ii++) {
        		org.junit.Assert.assertEquals(array_960144037[ii], array_619987209[ii]);
        	};
        IVecInt o_testNoSolutionExists_remove3__6 = clause.push((-99));
        Assert.assertEquals("100,99,-99", ((VecInt) (o_testNoSolutionExists_remove3__6)).toString());
        Assert.assertEquals(33, ((int) (((VecInt) (o_testNoSolutionExists_remove3__6)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExists_remove3__6)).isEmpty());
        clause.clear();
        IVecInt o_testNoSolutionExists_remove3_remove39_remove146__19 = clause.push((-100));
        Assert.assertEquals("-100", ((VecInt) (o_testNoSolutionExists_remove3_remove39_remove146__19)).toString());
        Assert.assertEquals(-100, ((int) (((VecInt) (o_testNoSolutionExists_remove3_remove39_remove146__19)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExists_remove3_remove39_remove146__19)).isEmpty());
        clause.clear();
        this.solver.isSatisfiable();
        Assert.assertEquals("", ((VecInt) (clause)).toString());
        Assert.assertTrue(((VecInt) (clause)).isEmpty());
        Assert.assertEquals("", ((VecInt) (o_testNoSolutionExists_remove3__3)).toString());
        Assert.assertTrue(((VecInt) (o_testNoSolutionExists_remove3__3)).isEmpty());
        int[] array_401149906 = new int[]{198,200};
        	int[] array_1200772553 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove3__5).getLits();
        	for(int ii = 0; ii <array_401149906.length; ii++) {
        		org.junit.Assert.assertEquals(array_401149906[ii], array_1200772553[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_testNoSolutionExists_remove3__5)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testNoSolutionExists_remove3__5)).getActivity())), 0.1);
        Assert.assertEquals("99[?] 100[?]", ((OriginalBinaryClause) (o_testNoSolutionExists_remove3__5)).toString());
        Assert.assertEquals(199, ((int) (((OriginalBinaryClause) (o_testNoSolutionExists_remove3__5)).hashCode())));
        Assert.assertEquals("", ((VecInt) (o_testNoSolutionExists_remove3__6)).toString());
        Assert.assertTrue(((VecInt) (o_testNoSolutionExists_remove3__6)).isEmpty());
        Assert.assertEquals("", ((VecInt) (o_testNoSolutionExists_remove3_remove39_remove146__19)).toString());
        Assert.assertTrue(((VecInt) (o_testNoSolutionExists_remove3_remove39_remove146__19)).isEmpty());
    }

    @Test(timeout = 30000)
    public void testNoSolutionExists_remove3_remove39_remove154() throws Exception, ContradictionException, TimeoutException {
        IVecInt clause = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause)).toString());
        Assert.assertTrue(((VecInt) (clause)).isEmpty());
        IVecInt o_testNoSolutionExists_remove3__3 = clause.push(100).push(99);
        Assert.assertEquals("100,99", ((VecInt) (o_testNoSolutionExists_remove3__3)).toString());
        Assert.assertEquals(99, ((int) (((VecInt) (o_testNoSolutionExists_remove3__3)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExists_remove3__3)).isEmpty());
        IConstr o_testNoSolutionExists_remove3__5 = solver.addClause(clause);
        int[] array_1213887554 = new int[]{198,200};
        	int[] array_1981039630 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove3__5).getLits();
        	for(int ii = 0; ii <array_1213887554.length; ii++) {
        		org.junit.Assert.assertEquals(array_1213887554[ii], array_1981039630[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_testNoSolutionExists_remove3__5)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testNoSolutionExists_remove3__5)).getActivity())), 0.1);
        Assert.assertEquals("99[?] 100[?]", ((OriginalBinaryClause) (o_testNoSolutionExists_remove3__5)).toString());
        Assert.assertEquals(199, ((int) (((OriginalBinaryClause) (o_testNoSolutionExists_remove3__5)).hashCode())));
        int[] array_1601397512 = new int[]{198,200};
        	int[] array_995075168 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove3__5).getLits();
        	for(int ii = 0; ii <array_1601397512.length; ii++) {
        		org.junit.Assert.assertEquals(array_1601397512[ii], array_995075168[ii]);
        	};
        int[] array_960144037 = new int[]{198,200};
        	int[] array_619987209 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove3__5).getLits();
        	for(int ii = 0; ii <array_960144037.length; ii++) {
        		org.junit.Assert.assertEquals(array_960144037[ii], array_619987209[ii]);
        	};
        IVecInt o_testNoSolutionExists_remove3__6 = clause.push((-99));
        Assert.assertEquals("100,99,-99", ((VecInt) (o_testNoSolutionExists_remove3__6)).toString());
        Assert.assertEquals(33, ((int) (((VecInt) (o_testNoSolutionExists_remove3__6)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExists_remove3__6)).isEmpty());
        solver.addClause(clause);
        clause.clear();
        clause.clear();
        clause.push((-100));
    }

    @Test(timeout = 30000)
    public void testNoSolutionExists_remove5_remove48_remove175() throws Exception, ContradictionException, TimeoutException {
        IVecInt clause = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause)).toString());
        Assert.assertTrue(((VecInt) (clause)).isEmpty());
        IVecInt o_testNoSolutionExists_remove5__3 = clause.push(100).push(99);
        Assert.assertEquals("100,99", ((VecInt) (o_testNoSolutionExists_remove5__3)).toString());
        Assert.assertEquals(99, ((int) (((VecInt) (o_testNoSolutionExists_remove5__3)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExists_remove5__3)).isEmpty());
        IConstr o_testNoSolutionExists_remove5__5 = solver.addClause(clause);
        int[] array_1548647315 = new int[]{198,200};
        	int[] array_1710076909 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove5__5).getLits();
        	for(int ii = 0; ii <array_1548647315.length; ii++) {
        		org.junit.Assert.assertEquals(array_1548647315[ii], array_1710076909[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_testNoSolutionExists_remove5__5)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testNoSolutionExists_remove5__5)).getActivity())), 0.1);
        Assert.assertEquals("99[?] 100[?]", ((OriginalBinaryClause) (o_testNoSolutionExists_remove5__5)).toString());
        Assert.assertEquals(199, ((int) (((OriginalBinaryClause) (o_testNoSolutionExists_remove5__5)).hashCode())));
        int[] array_380008966 = new int[]{198,200};
        	int[] array_1258681960 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove5__5).getLits();
        	for(int ii = 0; ii <array_380008966.length; ii++) {
        		org.junit.Assert.assertEquals(array_380008966[ii], array_1258681960[ii]);
        	};
        int[] array_1635508580 = new int[]{198,200};
        	int[] array_312752620 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove5__5).getLits();
        	for(int ii = 0; ii <array_1635508580.length; ii++) {
        		org.junit.Assert.assertEquals(array_1635508580[ii], array_312752620[ii]);
        	};
        clause.clear();
        IVecInt o_testNoSolutionExists_remove5__7 = clause.push((-99));
        Assert.assertEquals("-99", ((VecInt) (o_testNoSolutionExists_remove5__7)).toString());
        Assert.assertEquals(-99, ((int) (((VecInt) (o_testNoSolutionExists_remove5__7)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExists_remove5__7)).isEmpty());
        IVecInt o_testNoSolutionExists_remove5__10 = clause.push((-100));
        Assert.assertEquals("-99,-100", ((VecInt) (o_testNoSolutionExists_remove5__10)).toString());
        Assert.assertEquals(-99, ((int) (((VecInt) (o_testNoSolutionExists_remove5__10)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExists_remove5__10)).isEmpty());
        IConstr o_testNoSolutionExists_remove5__12 = solver.addClause(clause);
        int[] array_821234175 = new int[]{199,201};
        	int[] array_811262187 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove5__12).getLits();
        	for(int ii = 0; ii <array_821234175.length; ii++) {
        		org.junit.Assert.assertEquals(array_821234175[ii], array_811262187[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_testNoSolutionExists_remove5__12)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testNoSolutionExists_remove5__12)).getActivity())), 0.1);
        Assert.assertEquals("-99[?] -100[?]", ((OriginalBinaryClause) (o_testNoSolutionExists_remove5__12)).toString());
        Assert.assertEquals(200, ((int) (((OriginalBinaryClause) (o_testNoSolutionExists_remove5__12)).hashCode())));
        int[] array_715956334 = new int[]{199,201};
        	int[] array_2139907821 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove5__12).getLits();
        	for(int ii = 0; ii <array_715956334.length; ii++) {
        		org.junit.Assert.assertEquals(array_715956334[ii], array_2139907821[ii]);
        	};
        this.solver.isSatisfiable();
        int[] array_924246133 = new int[]{198,200};
        	int[] array_1280460106 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove5__5).getLits();
        	for(int ii = 0; ii <array_924246133.length; ii++) {
        		org.junit.Assert.assertEquals(array_924246133[ii], array_1280460106[ii]);
        	};
        int[] array_161647393 = new int[]{198,200};
        	int[] array_1329652965 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove5__5).getLits();
        	for(int ii = 0; ii <array_161647393.length; ii++) {
        		org.junit.Assert.assertEquals(array_161647393[ii], array_1329652965[ii]);
        	};
        int[] array_1465160341 = new int[]{199,201};
        	int[] array_170326452 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove5__12).getLits();
        	for(int ii = 0; ii <array_1465160341.length; ii++) {
        		org.junit.Assert.assertEquals(array_1465160341[ii], array_170326452[ii]);
        	};
        Assert.assertEquals("-99,-100", ((VecInt) (clause)).toString());
        Assert.assertEquals(-99, ((int) (((VecInt) (clause)).hashCode())));
        Assert.assertFalse(((VecInt) (clause)).isEmpty());
        Assert.assertEquals("-99,-100", ((VecInt) (o_testNoSolutionExists_remove5__3)).toString());
        Assert.assertEquals(-99, ((int) (((VecInt) (o_testNoSolutionExists_remove5__3)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExists_remove5__3)).isEmpty());
        int[] array_1098966944 = new int[]{198,200};
        	int[] array_1577838887 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove5__5).getLits();
        	for(int ii = 0; ii <array_1098966944.length; ii++) {
        		org.junit.Assert.assertEquals(array_1098966944[ii], array_1577838887[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_testNoSolutionExists_remove5__5)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testNoSolutionExists_remove5__5)).getActivity())), 0.1);
        Assert.assertEquals("99[?] 100[?]", ((OriginalBinaryClause) (o_testNoSolutionExists_remove5__5)).toString());
        Assert.assertEquals(199, ((int) (((OriginalBinaryClause) (o_testNoSolutionExists_remove5__5)).hashCode())));
        Assert.assertEquals("-99,-100", ((VecInt) (o_testNoSolutionExists_remove5__7)).toString());
        Assert.assertEquals(-99, ((int) (((VecInt) (o_testNoSolutionExists_remove5__7)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExists_remove5__7)).isEmpty());
        Assert.assertEquals("-99,-100", ((VecInt) (o_testNoSolutionExists_remove5__10)).toString());
        Assert.assertEquals(-99, ((int) (((VecInt) (o_testNoSolutionExists_remove5__10)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExists_remove5__10)).isEmpty());
        int[] array_306257734 = new int[]{199,201};
        	int[] array_1709229574 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove5__12).getLits();
        	for(int ii = 0; ii <array_306257734.length; ii++) {
        		org.junit.Assert.assertEquals(array_306257734[ii], array_1709229574[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_testNoSolutionExists_remove5__12)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testNoSolutionExists_remove5__12)).getActivity())), 0.1);
        Assert.assertEquals("-99[?] -100[?]", ((OriginalBinaryClause) (o_testNoSolutionExists_remove5__12)).toString());
        Assert.assertEquals(200, ((int) (((OriginalBinaryClause) (o_testNoSolutionExists_remove5__12)).hashCode())));
    }

    @Test(timeout = 30000)
    public void testNoSolutionExists_remove5_remove48_remove177() throws Exception, ContradictionException, TimeoutException {
        IVecInt clause = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause)).toString());
        Assert.assertTrue(((VecInt) (clause)).isEmpty());
        IVecInt o_testNoSolutionExists_remove5__3 = clause.push(100).push(99);
        Assert.assertEquals("100,99", ((VecInt) (o_testNoSolutionExists_remove5__3)).toString());
        Assert.assertEquals(99, ((int) (((VecInt) (o_testNoSolutionExists_remove5__3)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExists_remove5__3)).isEmpty());
        IConstr o_testNoSolutionExists_remove5__5 = solver.addClause(clause);
        int[] array_1499926403 = new int[]{198,200};
        	int[] array_661689706 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove5__5).getLits();
        	for(int ii = 0; ii <array_1499926403.length; ii++) {
        		org.junit.Assert.assertEquals(array_1499926403[ii], array_661689706[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_testNoSolutionExists_remove5__5)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testNoSolutionExists_remove5__5)).getActivity())), 0.1);
        Assert.assertEquals("99[?] 100[?]", ((OriginalBinaryClause) (o_testNoSolutionExists_remove5__5)).toString());
        Assert.assertEquals(199, ((int) (((OriginalBinaryClause) (o_testNoSolutionExists_remove5__5)).hashCode())));
        int[] array_380008966 = new int[]{198,200};
        	int[] array_1258681960 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove5__5).getLits();
        	for(int ii = 0; ii <array_380008966.length; ii++) {
        		org.junit.Assert.assertEquals(array_380008966[ii], array_1258681960[ii]);
        	};
        int[] array_1635508580 = new int[]{198,200};
        	int[] array_312752620 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove5__5).getLits();
        	for(int ii = 0; ii <array_1635508580.length; ii++) {
        		org.junit.Assert.assertEquals(array_1635508580[ii], array_312752620[ii]);
        	};
        clause.clear();
        clause.clear();
        IVecInt o_testNoSolutionExists_remove5__7 = clause.push((-99));
        Assert.assertEquals("-99", ((VecInt) (o_testNoSolutionExists_remove5__7)).toString());
        Assert.assertEquals(-99, ((int) (((VecInt) (o_testNoSolutionExists_remove5__7)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExists_remove5__7)).isEmpty());
        IVecInt o_testNoSolutionExists_remove5__10 = clause.push((-100));
        Assert.assertEquals("-99,-100", ((VecInt) (o_testNoSolutionExists_remove5__10)).toString());
        Assert.assertEquals(-99, ((int) (((VecInt) (o_testNoSolutionExists_remove5__10)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExists_remove5__10)).isEmpty());
        IConstr o_testNoSolutionExists_remove5__12 = solver.addClause(clause);
        int[] array_247042739 = new int[]{199,201};
        	int[] array_1567167673 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove5__12).getLits();
        	for(int ii = 0; ii <array_247042739.length; ii++) {
        		org.junit.Assert.assertEquals(array_247042739[ii], array_1567167673[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_testNoSolutionExists_remove5__12)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testNoSolutionExists_remove5__12)).getActivity())), 0.1);
        Assert.assertEquals("-99[?] -100[?]", ((OriginalBinaryClause) (o_testNoSolutionExists_remove5__12)).toString());
        Assert.assertEquals(200, ((int) (((OriginalBinaryClause) (o_testNoSolutionExists_remove5__12)).hashCode())));
        int[] array_715956334 = new int[]{199,201};
        	int[] array_2139907821 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove5__12).getLits();
        	for(int ii = 0; ii <array_715956334.length; ii++) {
        		org.junit.Assert.assertEquals(array_715956334[ii], array_2139907821[ii]);
        	};
        int[] array_924246133 = new int[]{198,200};
        	int[] array_1280460106 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove5__5).getLits();
        	for(int ii = 0; ii <array_924246133.length; ii++) {
        		org.junit.Assert.assertEquals(array_924246133[ii], array_1280460106[ii]);
        	};
        int[] array_161647393 = new int[]{198,200};
        	int[] array_1329652965 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove5__5).getLits();
        	for(int ii = 0; ii <array_161647393.length; ii++) {
        		org.junit.Assert.assertEquals(array_161647393[ii], array_1329652965[ii]);
        	};
        int[] array_1465160341 = new int[]{199,201};
        	int[] array_170326452 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove5__12).getLits();
        	for(int ii = 0; ii <array_1465160341.length; ii++) {
        		org.junit.Assert.assertEquals(array_1465160341[ii], array_170326452[ii]);
        	};
        Assert.assertEquals("-99,-100", ((VecInt) (clause)).toString());
        Assert.assertEquals(-99, ((int) (((VecInt) (clause)).hashCode())));
        Assert.assertFalse(((VecInt) (clause)).isEmpty());
        Assert.assertEquals("-99,-100", ((VecInt) (o_testNoSolutionExists_remove5__3)).toString());
        Assert.assertEquals(-99, ((int) (((VecInt) (o_testNoSolutionExists_remove5__3)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExists_remove5__3)).isEmpty());
        int[] array_99167899 = new int[]{198,200};
        	int[] array_1475731910 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove5__5).getLits();
        	for(int ii = 0; ii <array_99167899.length; ii++) {
        		org.junit.Assert.assertEquals(array_99167899[ii], array_1475731910[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_testNoSolutionExists_remove5__5)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testNoSolutionExists_remove5__5)).getActivity())), 0.1);
        Assert.assertEquals("99[?] 100[?]", ((OriginalBinaryClause) (o_testNoSolutionExists_remove5__5)).toString());
        Assert.assertEquals(199, ((int) (((OriginalBinaryClause) (o_testNoSolutionExists_remove5__5)).hashCode())));
        Assert.assertEquals("-99,-100", ((VecInt) (o_testNoSolutionExists_remove5__7)).toString());
        Assert.assertEquals(-99, ((int) (((VecInt) (o_testNoSolutionExists_remove5__7)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExists_remove5__7)).isEmpty());
        Assert.assertEquals("-99,-100", ((VecInt) (o_testNoSolutionExists_remove5__10)).toString());
        Assert.assertEquals(-99, ((int) (((VecInt) (o_testNoSolutionExists_remove5__10)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExists_remove5__10)).isEmpty());
        int[] array_1676125145 = new int[]{199,201};
        	int[] array_1834201035 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove5__12).getLits();
        	for(int ii = 0; ii <array_1676125145.length; ii++) {
        		org.junit.Assert.assertEquals(array_1676125145[ii], array_1834201035[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_testNoSolutionExists_remove5__12)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testNoSolutionExists_remove5__12)).getActivity())), 0.1);
        Assert.assertEquals("-99[?] -100[?]", ((OriginalBinaryClause) (o_testNoSolutionExists_remove5__12)).toString());
        Assert.assertEquals(200, ((int) (((OriginalBinaryClause) (o_testNoSolutionExists_remove5__12)).hashCode())));
    }

    @Test(timeout = 30000)
    public void testNoSolutionExists_remove7_remove46_remove145() throws Exception, ContradictionException, TimeoutException {
        IVecInt clause = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause)).toString());
        Assert.assertTrue(((VecInt) (clause)).isEmpty());
        IVecInt o_testNoSolutionExists_remove7__3 = clause.push(100).push(99);
        Assert.assertEquals("100,99", ((VecInt) (o_testNoSolutionExists_remove7__3)).toString());
        Assert.assertEquals(99, ((int) (((VecInt) (o_testNoSolutionExists_remove7__3)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExists_remove7__3)).isEmpty());
        IConstr o_testNoSolutionExists_remove7__5 = solver.addClause(clause);
        int[] array_1520222736 = new int[]{198,200};
        	int[] array_1938180512 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove7__5).getLits();
        	for(int ii = 0; ii <array_1520222736.length; ii++) {
        		org.junit.Assert.assertEquals(array_1520222736[ii], array_1938180512[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_testNoSolutionExists_remove7__5)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testNoSolutionExists_remove7__5)).getActivity())), 0.1);
        Assert.assertEquals("99[?] 100[?]", ((OriginalBinaryClause) (o_testNoSolutionExists_remove7__5)).toString());
        Assert.assertEquals(199, ((int) (((OriginalBinaryClause) (o_testNoSolutionExists_remove7__5)).hashCode())));
        int[] array_360841435 = new int[]{198,200};
        	int[] array_15911933 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove7__5).getLits();
        	for(int ii = 0; ii <array_360841435.length; ii++) {
        		org.junit.Assert.assertEquals(array_360841435[ii], array_15911933[ii]);
        	};
        int[] array_1231906488 = new int[]{198,200};
        	int[] array_344656050 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove7__5).getLits();
        	for(int ii = 0; ii <array_1231906488.length; ii++) {
        		org.junit.Assert.assertEquals(array_1231906488[ii], array_344656050[ii]);
        	};
        IConstr o_testNoSolutionExists_remove7__6 = solver.addClause(clause);
        int[] array_2051890960 = new int[]{198,200};
        	int[] array_1689653879 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove7__6).getLits();
        	for(int ii = 0; ii <array_2051890960.length; ii++) {
        		org.junit.Assert.assertEquals(array_2051890960[ii], array_1689653879[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_testNoSolutionExists_remove7__6)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testNoSolutionExists_remove7__6)).getActivity())), 0.1);
        Assert.assertEquals("99[?] 100[?]", ((OriginalBinaryClause) (o_testNoSolutionExists_remove7__6)).toString());
        Assert.assertEquals(199, ((int) (((OriginalBinaryClause) (o_testNoSolutionExists_remove7__6)).hashCode())));
        int[] array_1014115561 = new int[]{198,200};
        	int[] array_1065588677 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove7__6).getLits();
        	for(int ii = 0; ii <array_1014115561.length; ii++) {
        		org.junit.Assert.assertEquals(array_1014115561[ii], array_1065588677[ii]);
        	};
        int[] array_986475328 = new int[]{198,200};
        	int[] array_323897869 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove7__6).getLits();
        	for(int ii = 0; ii <array_986475328.length; ii++) {
        		org.junit.Assert.assertEquals(array_986475328[ii], array_323897869[ii]);
        	};
        IVecInt o_testNoSolutionExists_remove7__9 = clause.push((-99));
        Assert.assertEquals("100,99,-99", ((VecInt) (o_testNoSolutionExists_remove7__9)).toString());
        Assert.assertEquals(33, ((int) (((VecInt) (o_testNoSolutionExists_remove7__9)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExists_remove7__9)).isEmpty());
        IConstr o_testNoSolutionExists_remove7__11 = solver.addClause(clause);
        clause.clear();
        this.solver.isSatisfiable();
        int[] array_1112195874 = new int[]{198,200};
        	int[] array_938903036 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove7__5).getLits();
        	for(int ii = 0; ii <array_1112195874.length; ii++) {
        		org.junit.Assert.assertEquals(array_1112195874[ii], array_938903036[ii]);
        	};
        int[] array_630434226 = new int[]{198,200};
        	int[] array_510123478 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove7__6).getLits();
        	for(int ii = 0; ii <array_630434226.length; ii++) {
        		org.junit.Assert.assertEquals(array_630434226[ii], array_510123478[ii]);
        	};
        int[] array_20548404 = new int[]{198,200};
        	int[] array_2129087437 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove7__5).getLits();
        	for(int ii = 0; ii <array_20548404.length; ii++) {
        		org.junit.Assert.assertEquals(array_20548404[ii], array_2129087437[ii]);
        	};
        int[] array_451956994 = new int[]{198,200};
        	int[] array_473135604 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove7__6).getLits();
        	for(int ii = 0; ii <array_451956994.length; ii++) {
        		org.junit.Assert.assertEquals(array_451956994[ii], array_473135604[ii]);
        	};
    }

    @Test(timeout = 30000)
    public void testNoSolutionExists_remove7_remove46_remove147() throws Exception, ContradictionException, TimeoutException {
        IVecInt clause = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause)).toString());
        Assert.assertTrue(((VecInt) (clause)).isEmpty());
        IVecInt o_testNoSolutionExists_remove7__3 = clause.push(100).push(99);
        Assert.assertEquals("100,99", ((VecInt) (o_testNoSolutionExists_remove7__3)).toString());
        Assert.assertEquals(99, ((int) (((VecInt) (o_testNoSolutionExists_remove7__3)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExists_remove7__3)).isEmpty());
        IConstr o_testNoSolutionExists_remove7__5 = solver.addClause(clause);
        int[] array_1613092688 = new int[]{198,200};
        	int[] array_2041349239 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove7__5).getLits();
        	for(int ii = 0; ii <array_1613092688.length; ii++) {
        		org.junit.Assert.assertEquals(array_1613092688[ii], array_2041349239[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_testNoSolutionExists_remove7__5)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testNoSolutionExists_remove7__5)).getActivity())), 0.1);
        Assert.assertEquals("99[?] 100[?]", ((OriginalBinaryClause) (o_testNoSolutionExists_remove7__5)).toString());
        Assert.assertEquals(199, ((int) (((OriginalBinaryClause) (o_testNoSolutionExists_remove7__5)).hashCode())));
        int[] array_360841435 = new int[]{198,200};
        	int[] array_15911933 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove7__5).getLits();
        	for(int ii = 0; ii <array_360841435.length; ii++) {
        		org.junit.Assert.assertEquals(array_360841435[ii], array_15911933[ii]);
        	};
        int[] array_1231906488 = new int[]{198,200};
        	int[] array_344656050 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove7__5).getLits();
        	for(int ii = 0; ii <array_1231906488.length; ii++) {
        		org.junit.Assert.assertEquals(array_1231906488[ii], array_344656050[ii]);
        	};
        IConstr o_testNoSolutionExists_remove7__6 = solver.addClause(clause);
        int[] array_1137725833 = new int[]{198,200};
        	int[] array_1246075668 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove7__6).getLits();
        	for(int ii = 0; ii <array_1137725833.length; ii++) {
        		org.junit.Assert.assertEquals(array_1137725833[ii], array_1246075668[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_testNoSolutionExists_remove7__6)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testNoSolutionExists_remove7__6)).getActivity())), 0.1);
        Assert.assertEquals("99[?] 100[?]", ((OriginalBinaryClause) (o_testNoSolutionExists_remove7__6)).toString());
        Assert.assertEquals(199, ((int) (((OriginalBinaryClause) (o_testNoSolutionExists_remove7__6)).hashCode())));
        int[] array_1014115561 = new int[]{198,200};
        	int[] array_1065588677 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove7__6).getLits();
        	for(int ii = 0; ii <array_1014115561.length; ii++) {
        		org.junit.Assert.assertEquals(array_1014115561[ii], array_1065588677[ii]);
        	};
        int[] array_986475328 = new int[]{198,200};
        	int[] array_323897869 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove7__6).getLits();
        	for(int ii = 0; ii <array_986475328.length; ii++) {
        		org.junit.Assert.assertEquals(array_986475328[ii], array_323897869[ii]);
        	};
        clause.clear();
        IVecInt o_testNoSolutionExists_remove7__9 = clause.push((-99));
        Assert.assertEquals("-99", ((VecInt) (o_testNoSolutionExists_remove7__9)).toString());
        Assert.assertEquals(-99, ((int) (((VecInt) (o_testNoSolutionExists_remove7__9)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExists_remove7__9)).isEmpty());
        IConstr o_testNoSolutionExists_remove7__11 = solver.addClause(clause);
        Assert.assertTrue(((UnitClause) (o_testNoSolutionExists_remove7__11)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_testNoSolutionExists_remove7__11)).getActivity())), 0.1);
        Assert.assertEquals("-99", ((UnitClause) (o_testNoSolutionExists_remove7__11)).toString());
        this.solver.isSatisfiable();
        int[] array_1112195874 = new int[]{198,200};
        	int[] array_938903036 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove7__5).getLits();
        	for(int ii = 0; ii <array_1112195874.length; ii++) {
        		org.junit.Assert.assertEquals(array_1112195874[ii], array_938903036[ii]);
        	};
        int[] array_630434226 = new int[]{198,200};
        	int[] array_510123478 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove7__6).getLits();
        	for(int ii = 0; ii <array_630434226.length; ii++) {
        		org.junit.Assert.assertEquals(array_630434226[ii], array_510123478[ii]);
        	};
        int[] array_20548404 = new int[]{198,200};
        	int[] array_2129087437 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove7__5).getLits();
        	for(int ii = 0; ii <array_20548404.length; ii++) {
        		org.junit.Assert.assertEquals(array_20548404[ii], array_2129087437[ii]);
        	};
        int[] array_451956994 = new int[]{198,200};
        	int[] array_473135604 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove7__6).getLits();
        	for(int ii = 0; ii <array_451956994.length; ii++) {
        		org.junit.Assert.assertEquals(array_451956994[ii], array_473135604[ii]);
        	};
        Assert.assertEquals("-99", ((VecInt) (clause)).toString());
        Assert.assertEquals(-99, ((int) (((VecInt) (clause)).hashCode())));
        Assert.assertFalse(((VecInt) (clause)).isEmpty());
        Assert.assertEquals("-99", ((VecInt) (o_testNoSolutionExists_remove7__3)).toString());
        Assert.assertEquals(-99, ((int) (((VecInt) (o_testNoSolutionExists_remove7__3)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExists_remove7__3)).isEmpty());
        int[] array_1241836039 = new int[]{198,200};
        	int[] array_82777264 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove7__5).getLits();
        	for(int ii = 0; ii <array_1241836039.length; ii++) {
        		org.junit.Assert.assertEquals(array_1241836039[ii], array_82777264[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_testNoSolutionExists_remove7__5)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testNoSolutionExists_remove7__5)).getActivity())), 0.1);
        Assert.assertEquals("99[F] 100[?]", ((OriginalBinaryClause) (o_testNoSolutionExists_remove7__5)).toString());
        Assert.assertEquals(199, ((int) (((OriginalBinaryClause) (o_testNoSolutionExists_remove7__5)).hashCode())));
        int[] array_1122436600 = new int[]{198,200};
        	int[] array_2054462281 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove7__6).getLits();
        	for(int ii = 0; ii <array_1122436600.length; ii++) {
        		org.junit.Assert.assertEquals(array_1122436600[ii], array_2054462281[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_testNoSolutionExists_remove7__6)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testNoSolutionExists_remove7__6)).getActivity())), 0.1);
        Assert.assertEquals("99[F] 100[?]", ((OriginalBinaryClause) (o_testNoSolutionExists_remove7__6)).toString());
        Assert.assertEquals(199, ((int) (((OriginalBinaryClause) (o_testNoSolutionExists_remove7__6)).hashCode())));
        Assert.assertEquals("-99", ((VecInt) (o_testNoSolutionExists_remove7__9)).toString());
        Assert.assertEquals(-99, ((int) (((VecInt) (o_testNoSolutionExists_remove7__9)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExists_remove7__9)).isEmpty());
        Assert.assertTrue(((UnitClause) (o_testNoSolutionExists_remove7__11)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_testNoSolutionExists_remove7__11)).getActivity())), 0.1);
        Assert.assertEquals("-99", ((UnitClause) (o_testNoSolutionExists_remove7__11)).toString());
    }

    @Test(timeout = 30000)
    public void testNoSolutionExists_remove8_remove38_remove174() throws Exception, ContradictionException, TimeoutException {
        IVecInt clause = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause)).toString());
        Assert.assertTrue(((VecInt) (clause)).isEmpty());
        IVecInt o_testNoSolutionExists_remove8__3 = clause.push(100).push(99);
        Assert.assertEquals("100,99", ((VecInt) (o_testNoSolutionExists_remove8__3)).toString());
        Assert.assertEquals(99, ((int) (((VecInt) (o_testNoSolutionExists_remove8__3)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExists_remove8__3)).isEmpty());
        IConstr o_testNoSolutionExists_remove8__5 = solver.addClause(clause);
        int[] array_33521935 = new int[]{198,200};
        	int[] array_1190471741 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove8__5).getLits();
        	for(int ii = 0; ii <array_33521935.length; ii++) {
        		org.junit.Assert.assertEquals(array_33521935[ii], array_1190471741[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_testNoSolutionExists_remove8__5)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testNoSolutionExists_remove8__5)).getActivity())), 0.1);
        Assert.assertEquals("99[?] 100[?]", ((OriginalBinaryClause) (o_testNoSolutionExists_remove8__5)).toString());
        Assert.assertEquals(199, ((int) (((OriginalBinaryClause) (o_testNoSolutionExists_remove8__5)).hashCode())));
        int[] array_1265264946 = new int[]{198,200};
        	int[] array_1330491211 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove8__5).getLits();
        	for(int ii = 0; ii <array_1265264946.length; ii++) {
        		org.junit.Assert.assertEquals(array_1265264946[ii], array_1330491211[ii]);
        	};
        int[] array_2086707665 = new int[]{198,200};
        	int[] array_1278592644 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove8__5).getLits();
        	for(int ii = 0; ii <array_2086707665.length; ii++) {
        		org.junit.Assert.assertEquals(array_2086707665[ii], array_1278592644[ii]);
        	};
        IConstr o_testNoSolutionExists_remove8__6 = solver.addClause(clause);
        int[] array_487418983 = new int[]{198,200};
        	int[] array_1239513899 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove8__6).getLits();
        	for(int ii = 0; ii <array_487418983.length; ii++) {
        		org.junit.Assert.assertEquals(array_487418983[ii], array_1239513899[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_testNoSolutionExists_remove8__6)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testNoSolutionExists_remove8__6)).getActivity())), 0.1);
        Assert.assertEquals("99[?] 100[?]", ((OriginalBinaryClause) (o_testNoSolutionExists_remove8__6)).toString());
        Assert.assertEquals(199, ((int) (((OriginalBinaryClause) (o_testNoSolutionExists_remove8__6)).hashCode())));
        int[] array_661030971 = new int[]{198,200};
        	int[] array_111462766 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove8__6).getLits();
        	for(int ii = 0; ii <array_661030971.length; ii++) {
        		org.junit.Assert.assertEquals(array_661030971[ii], array_111462766[ii]);
        	};
        int[] array_497080696 = new int[]{198,200};
        	int[] array_40865201 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove8__6).getLits();
        	for(int ii = 0; ii <array_497080696.length; ii++) {
        		org.junit.Assert.assertEquals(array_497080696[ii], array_40865201[ii]);
        	};
        IVecInt o_testNoSolutionExists_remove8__9 = clause.push((-99));
        Assert.assertEquals("100,99,-99", ((VecInt) (o_testNoSolutionExists_remove8__9)).toString());
        Assert.assertEquals(33, ((int) (((VecInt) (o_testNoSolutionExists_remove8__9)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExists_remove8__9)).isEmpty());
        IVecInt o_testNoSolutionExists_remove8__11 = clause.push((-100));
        Assert.assertEquals("100,99,-99,-100", ((VecInt) (o_testNoSolutionExists_remove8__11)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_testNoSolutionExists_remove8__11)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExists_remove8__11)).isEmpty());
        clause.clear();
        this.solver.isSatisfiable();
        int[] array_1226901677 = new int[]{198,200};
        	int[] array_433345085 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove8__5).getLits();
        	for(int ii = 0; ii <array_1226901677.length; ii++) {
        		org.junit.Assert.assertEquals(array_1226901677[ii], array_433345085[ii]);
        	};
        int[] array_710729714 = new int[]{198,200};
        	int[] array_418055333 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove8__6).getLits();
        	for(int ii = 0; ii <array_710729714.length; ii++) {
        		org.junit.Assert.assertEquals(array_710729714[ii], array_418055333[ii]);
        	};
        int[] array_743199523 = new int[]{198,200};
        	int[] array_1419382805 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove8__5).getLits();
        	for(int ii = 0; ii <array_743199523.length; ii++) {
        		org.junit.Assert.assertEquals(array_743199523[ii], array_1419382805[ii]);
        	};
        int[] array_1720556284 = new int[]{198,200};
        	int[] array_1251315957 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove8__6).getLits();
        	for(int ii = 0; ii <array_1720556284.length; ii++) {
        		org.junit.Assert.assertEquals(array_1720556284[ii], array_1251315957[ii]);
        	};
        Assert.assertEquals("", ((VecInt) (clause)).toString());
        Assert.assertTrue(((VecInt) (clause)).isEmpty());
        Assert.assertEquals("", ((VecInt) (o_testNoSolutionExists_remove8__3)).toString());
        Assert.assertTrue(((VecInt) (o_testNoSolutionExists_remove8__3)).isEmpty());
        int[] array_1192411423 = new int[]{198,200};
        	int[] array_1962142694 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove8__5).getLits();
        	for(int ii = 0; ii <array_1192411423.length; ii++) {
        		org.junit.Assert.assertEquals(array_1192411423[ii], array_1962142694[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_testNoSolutionExists_remove8__5)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testNoSolutionExists_remove8__5)).getActivity())), 0.1);
        Assert.assertEquals("99[?] 100[?]", ((OriginalBinaryClause) (o_testNoSolutionExists_remove8__5)).toString());
        Assert.assertEquals(199, ((int) (((OriginalBinaryClause) (o_testNoSolutionExists_remove8__5)).hashCode())));
        int[] array_1753651898 = new int[]{198,200};
        	int[] array_454354284 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove8__6).getLits();
        	for(int ii = 0; ii <array_1753651898.length; ii++) {
        		org.junit.Assert.assertEquals(array_1753651898[ii], array_454354284[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_testNoSolutionExists_remove8__6)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testNoSolutionExists_remove8__6)).getActivity())), 0.1);
        Assert.assertEquals("99[?] 100[?]", ((OriginalBinaryClause) (o_testNoSolutionExists_remove8__6)).toString());
        Assert.assertEquals(199, ((int) (((OriginalBinaryClause) (o_testNoSolutionExists_remove8__6)).hashCode())));
        Assert.assertEquals("", ((VecInt) (o_testNoSolutionExists_remove8__9)).toString());
        Assert.assertTrue(((VecInt) (o_testNoSolutionExists_remove8__9)).isEmpty());
        Assert.assertEquals("", ((VecInt) (o_testNoSolutionExists_remove8__11)).toString());
        Assert.assertTrue(((VecInt) (o_testNoSolutionExists_remove8__11)).isEmpty());
    }

    @Test(timeout = 30000)
    public void testNoSolutionExists_remove8_remove38_remove178() throws Exception, ContradictionException, TimeoutException {
        IVecInt clause = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause)).toString());
        Assert.assertTrue(((VecInt) (clause)).isEmpty());
        IVecInt o_testNoSolutionExists_remove8__3 = clause.push(100).push(99);
        Assert.assertEquals("100,99", ((VecInt) (o_testNoSolutionExists_remove8__3)).toString());
        Assert.assertEquals(99, ((int) (((VecInt) (o_testNoSolutionExists_remove8__3)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExists_remove8__3)).isEmpty());
        IConstr o_testNoSolutionExists_remove8__5 = solver.addClause(clause);
        int[] array_334839618 = new int[]{198,200};
        	int[] array_1081385268 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove8__5).getLits();
        	for(int ii = 0; ii <array_334839618.length; ii++) {
        		org.junit.Assert.assertEquals(array_334839618[ii], array_1081385268[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_testNoSolutionExists_remove8__5)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testNoSolutionExists_remove8__5)).getActivity())), 0.1);
        Assert.assertEquals("99[?] 100[?]", ((OriginalBinaryClause) (o_testNoSolutionExists_remove8__5)).toString());
        Assert.assertEquals(199, ((int) (((OriginalBinaryClause) (o_testNoSolutionExists_remove8__5)).hashCode())));
        int[] array_1265264946 = new int[]{198,200};
        	int[] array_1330491211 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove8__5).getLits();
        	for(int ii = 0; ii <array_1265264946.length; ii++) {
        		org.junit.Assert.assertEquals(array_1265264946[ii], array_1330491211[ii]);
        	};
        int[] array_2086707665 = new int[]{198,200};
        	int[] array_1278592644 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove8__5).getLits();
        	for(int ii = 0; ii <array_2086707665.length; ii++) {
        		org.junit.Assert.assertEquals(array_2086707665[ii], array_1278592644[ii]);
        	};
        IConstr o_testNoSolutionExists_remove8__6 = solver.addClause(clause);
        int[] array_1075955345 = new int[]{198,200};
        	int[] array_417040302 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove8__6).getLits();
        	for(int ii = 0; ii <array_1075955345.length; ii++) {
        		org.junit.Assert.assertEquals(array_1075955345[ii], array_417040302[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_testNoSolutionExists_remove8__6)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testNoSolutionExists_remove8__6)).getActivity())), 0.1);
        Assert.assertEquals("99[?] 100[?]", ((OriginalBinaryClause) (o_testNoSolutionExists_remove8__6)).toString());
        Assert.assertEquals(199, ((int) (((OriginalBinaryClause) (o_testNoSolutionExists_remove8__6)).hashCode())));
        int[] array_661030971 = new int[]{198,200};
        	int[] array_111462766 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove8__6).getLits();
        	for(int ii = 0; ii <array_661030971.length; ii++) {
        		org.junit.Assert.assertEquals(array_661030971[ii], array_111462766[ii]);
        	};
        int[] array_497080696 = new int[]{198,200};
        	int[] array_40865201 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove8__6).getLits();
        	for(int ii = 0; ii <array_497080696.length; ii++) {
        		org.junit.Assert.assertEquals(array_497080696[ii], array_40865201[ii]);
        	};
        clause.clear();
        clause.clear();
        IVecInt o_testNoSolutionExists_remove8__9 = clause.push((-99));
        Assert.assertEquals("-99", ((VecInt) (o_testNoSolutionExists_remove8__9)).toString());
        Assert.assertEquals(-99, ((int) (((VecInt) (o_testNoSolutionExists_remove8__9)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExists_remove8__9)).isEmpty());
        IVecInt o_testNoSolutionExists_remove8__11 = clause.push((-100));
        Assert.assertEquals("-99,-100", ((VecInt) (o_testNoSolutionExists_remove8__11)).toString());
        Assert.assertEquals(-99, ((int) (((VecInt) (o_testNoSolutionExists_remove8__11)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExists_remove8__11)).isEmpty());
        int[] array_1226901677 = new int[]{198,200};
        	int[] array_433345085 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove8__5).getLits();
        	for(int ii = 0; ii <array_1226901677.length; ii++) {
        		org.junit.Assert.assertEquals(array_1226901677[ii], array_433345085[ii]);
        	};
        int[] array_710729714 = new int[]{198,200};
        	int[] array_418055333 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove8__6).getLits();
        	for(int ii = 0; ii <array_710729714.length; ii++) {
        		org.junit.Assert.assertEquals(array_710729714[ii], array_418055333[ii]);
        	};
        int[] array_743199523 = new int[]{198,200};
        	int[] array_1419382805 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove8__5).getLits();
        	for(int ii = 0; ii <array_743199523.length; ii++) {
        		org.junit.Assert.assertEquals(array_743199523[ii], array_1419382805[ii]);
        	};
        int[] array_1720556284 = new int[]{198,200};
        	int[] array_1251315957 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove8__6).getLits();
        	for(int ii = 0; ii <array_1720556284.length; ii++) {
        		org.junit.Assert.assertEquals(array_1720556284[ii], array_1251315957[ii]);
        	};
        Assert.assertEquals("-99,-100", ((VecInt) (clause)).toString());
        Assert.assertEquals(-99, ((int) (((VecInt) (clause)).hashCode())));
        Assert.assertFalse(((VecInt) (clause)).isEmpty());
        Assert.assertEquals("-99,-100", ((VecInt) (o_testNoSolutionExists_remove8__3)).toString());
        Assert.assertEquals(-99, ((int) (((VecInt) (o_testNoSolutionExists_remove8__3)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExists_remove8__3)).isEmpty());
        int[] array_113946123 = new int[]{198,200};
        	int[] array_537925983 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove8__5).getLits();
        	for(int ii = 0; ii <array_113946123.length; ii++) {
        		org.junit.Assert.assertEquals(array_113946123[ii], array_537925983[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_testNoSolutionExists_remove8__5)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testNoSolutionExists_remove8__5)).getActivity())), 0.1);
        Assert.assertEquals("99[?] 100[?]", ((OriginalBinaryClause) (o_testNoSolutionExists_remove8__5)).toString());
        Assert.assertEquals(199, ((int) (((OriginalBinaryClause) (o_testNoSolutionExists_remove8__5)).hashCode())));
        int[] array_2142196056 = new int[]{198,200};
        	int[] array_825895993 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove8__6).getLits();
        	for(int ii = 0; ii <array_2142196056.length; ii++) {
        		org.junit.Assert.assertEquals(array_2142196056[ii], array_825895993[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_testNoSolutionExists_remove8__6)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testNoSolutionExists_remove8__6)).getActivity())), 0.1);
        Assert.assertEquals("99[?] 100[?]", ((OriginalBinaryClause) (o_testNoSolutionExists_remove8__6)).toString());
        Assert.assertEquals(199, ((int) (((OriginalBinaryClause) (o_testNoSolutionExists_remove8__6)).hashCode())));
        Assert.assertEquals("-99,-100", ((VecInt) (o_testNoSolutionExists_remove8__9)).toString());
        Assert.assertEquals(-99, ((int) (((VecInt) (o_testNoSolutionExists_remove8__9)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExists_remove8__9)).isEmpty());
        Assert.assertEquals("-99,-100", ((VecInt) (o_testNoSolutionExists_remove8__11)).toString());
        Assert.assertEquals(-99, ((int) (((VecInt) (o_testNoSolutionExists_remove8__11)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExists_remove8__11)).isEmpty());
    }

    @Test(timeout = 30000)
    public void testNoSolutionExists_remove9_remove44_remove155() throws Exception, ContradictionException, TimeoutException {
        IVecInt clause = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause)).toString());
        Assert.assertTrue(((VecInt) (clause)).isEmpty());
        IVecInt o_testNoSolutionExists_remove9__3 = clause.push(100).push(99);
        Assert.assertEquals("100,99", ((VecInt) (o_testNoSolutionExists_remove9__3)).toString());
        Assert.assertEquals(99, ((int) (((VecInt) (o_testNoSolutionExists_remove9__3)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExists_remove9__3)).isEmpty());
        IConstr o_testNoSolutionExists_remove9__5 = solver.addClause(clause);
        int[] array_1816246477 = new int[]{198,200};
        	int[] array_987720869 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove9__5).getLits();
        	for(int ii = 0; ii <array_1816246477.length; ii++) {
        		org.junit.Assert.assertEquals(array_1816246477[ii], array_987720869[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_testNoSolutionExists_remove9__5)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testNoSolutionExists_remove9__5)).getActivity())), 0.1);
        Assert.assertEquals("99[?] 100[?]", ((OriginalBinaryClause) (o_testNoSolutionExists_remove9__5)).toString());
        Assert.assertEquals(199, ((int) (((OriginalBinaryClause) (o_testNoSolutionExists_remove9__5)).hashCode())));
        int[] array_880674157 = new int[]{198,200};
        	int[] array_338723763 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove9__5).getLits();
        	for(int ii = 0; ii <array_880674157.length; ii++) {
        		org.junit.Assert.assertEquals(array_880674157[ii], array_338723763[ii]);
        	};
        int[] array_221006639 = new int[]{198,200};
        	int[] array_1045185488 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove9__5).getLits();
        	for(int ii = 0; ii <array_221006639.length; ii++) {
        		org.junit.Assert.assertEquals(array_221006639[ii], array_1045185488[ii]);
        	};
        IConstr o_testNoSolutionExists_remove9__6 = solver.addClause(clause);
        int[] array_490514772 = new int[]{198,200};
        	int[] array_432943687 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove9__6).getLits();
        	for(int ii = 0; ii <array_490514772.length; ii++) {
        		org.junit.Assert.assertEquals(array_490514772[ii], array_432943687[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_testNoSolutionExists_remove9__6)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testNoSolutionExists_remove9__6)).getActivity())), 0.1);
        Assert.assertEquals("99[?] 100[?]", ((OriginalBinaryClause) (o_testNoSolutionExists_remove9__6)).toString());
        Assert.assertEquals(199, ((int) (((OriginalBinaryClause) (o_testNoSolutionExists_remove9__6)).hashCode())));
        int[] array_651321302 = new int[]{198,200};
        	int[] array_1063796781 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove9__6).getLits();
        	for(int ii = 0; ii <array_651321302.length; ii++) {
        		org.junit.Assert.assertEquals(array_651321302[ii], array_1063796781[ii]);
        	};
        int[] array_705254390 = new int[]{198,200};
        	int[] array_934395863 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove9__6).getLits();
        	for(int ii = 0; ii <array_705254390.length; ii++) {
        		org.junit.Assert.assertEquals(array_705254390[ii], array_934395863[ii]);
        	};
        IConstr o_testNoSolutionExists_remove9__7 = solver.addClause(clause);
        int[] array_285541076 = new int[]{198,200};
        	int[] array_1417757496 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove9__7).getLits();
        	for(int ii = 0; ii <array_285541076.length; ii++) {
        		org.junit.Assert.assertEquals(array_285541076[ii], array_1417757496[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_testNoSolutionExists_remove9__7)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testNoSolutionExists_remove9__7)).getActivity())), 0.1);
        Assert.assertEquals("99[?] 100[?]", ((OriginalBinaryClause) (o_testNoSolutionExists_remove9__7)).toString());
        Assert.assertEquals(199, ((int) (((OriginalBinaryClause) (o_testNoSolutionExists_remove9__7)).hashCode())));
        int[] array_1173446498 = new int[]{198,200};
        	int[] array_1553752628 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove9__7).getLits();
        	for(int ii = 0; ii <array_1173446498.length; ii++) {
        		org.junit.Assert.assertEquals(array_1173446498[ii], array_1553752628[ii]);
        	};
        int[] array_1517406316 = new int[]{198,200};
        	int[] array_362573722 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove9__7).getLits();
        	for(int ii = 0; ii <array_1517406316.length; ii++) {
        		org.junit.Assert.assertEquals(array_1517406316[ii], array_362573722[ii]);
        	};
        IVecInt o_testNoSolutionExists_remove9__10 = clause.push((-99));
        Assert.assertEquals("100,99,-99", ((VecInt) (o_testNoSolutionExists_remove9__10)).toString());
        Assert.assertEquals(33, ((int) (((VecInt) (o_testNoSolutionExists_remove9__10)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExists_remove9__10)).isEmpty());
        IVecInt o_testNoSolutionExists_remove9__12 = clause.push((-100));
        Assert.assertEquals("100,99,-99,-100", ((VecInt) (o_testNoSolutionExists_remove9__12)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_testNoSolutionExists_remove9__12)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExists_remove9__12)).isEmpty());
        this.solver.isSatisfiable();
        int[] array_1640902160 = new int[]{198,200};
        	int[] array_1486333941 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove9__5).getLits();
        	for(int ii = 0; ii <array_1640902160.length; ii++) {
        		org.junit.Assert.assertEquals(array_1640902160[ii], array_1486333941[ii]);
        	};
        int[] array_1990166463 = new int[]{198,200};
        	int[] array_1391374059 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove9__6).getLits();
        	for(int ii = 0; ii <array_1990166463.length; ii++) {
        		org.junit.Assert.assertEquals(array_1990166463[ii], array_1391374059[ii]);
        	};
        int[] array_986292459 = new int[]{198,200};
        	int[] array_60832105 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove9__7).getLits();
        	for(int ii = 0; ii <array_986292459.length; ii++) {
        		org.junit.Assert.assertEquals(array_986292459[ii], array_60832105[ii]);
        	};
        int[] array_941898802 = new int[]{198,200};
        	int[] array_1794034100 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove9__5).getLits();
        	for(int ii = 0; ii <array_941898802.length; ii++) {
        		org.junit.Assert.assertEquals(array_941898802[ii], array_1794034100[ii]);
        	};
        int[] array_1177382155 = new int[]{198,200};
        	int[] array_830860305 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove9__6).getLits();
        	for(int ii = 0; ii <array_1177382155.length; ii++) {
        		org.junit.Assert.assertEquals(array_1177382155[ii], array_830860305[ii]);
        	};
        int[] array_1821905175 = new int[]{198,200};
        	int[] array_1097965990 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove9__7).getLits();
        	for(int ii = 0; ii <array_1821905175.length; ii++) {
        		org.junit.Assert.assertEquals(array_1821905175[ii], array_1097965990[ii]);
        	};
        Assert.assertEquals("100,99,-99,-100", ((VecInt) (clause)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (clause)).hashCode())));
        Assert.assertFalse(((VecInt) (clause)).isEmpty());
        Assert.assertEquals("100,99,-99,-100", ((VecInt) (o_testNoSolutionExists_remove9__3)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_testNoSolutionExists_remove9__3)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExists_remove9__3)).isEmpty());
        int[] array_891270992 = new int[]{198,200};
        	int[] array_2018925350 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove9__5).getLits();
        	for(int ii = 0; ii <array_891270992.length; ii++) {
        		org.junit.Assert.assertEquals(array_891270992[ii], array_2018925350[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_testNoSolutionExists_remove9__5)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testNoSolutionExists_remove9__5)).getActivity())), 0.1);
        Assert.assertEquals("99[?] 100[?]", ((OriginalBinaryClause) (o_testNoSolutionExists_remove9__5)).toString());
        Assert.assertEquals(199, ((int) (((OriginalBinaryClause) (o_testNoSolutionExists_remove9__5)).hashCode())));
        int[] array_1326342444 = new int[]{198,200};
        	int[] array_965184200 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove9__6).getLits();
        	for(int ii = 0; ii <array_1326342444.length; ii++) {
        		org.junit.Assert.assertEquals(array_1326342444[ii], array_965184200[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_testNoSolutionExists_remove9__6)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testNoSolutionExists_remove9__6)).getActivity())), 0.1);
        Assert.assertEquals("99[?] 100[?]", ((OriginalBinaryClause) (o_testNoSolutionExists_remove9__6)).toString());
        Assert.assertEquals(199, ((int) (((OriginalBinaryClause) (o_testNoSolutionExists_remove9__6)).hashCode())));
        int[] array_15891639 = new int[]{198,200};
        	int[] array_707913561 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove9__7).getLits();
        	for(int ii = 0; ii <array_15891639.length; ii++) {
        		org.junit.Assert.assertEquals(array_15891639[ii], array_707913561[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_testNoSolutionExists_remove9__7)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testNoSolutionExists_remove9__7)).getActivity())), 0.1);
        Assert.assertEquals("99[?] 100[?]", ((OriginalBinaryClause) (o_testNoSolutionExists_remove9__7)).toString());
        Assert.assertEquals(199, ((int) (((OriginalBinaryClause) (o_testNoSolutionExists_remove9__7)).hashCode())));
        Assert.assertEquals("100,99,-99,-100", ((VecInt) (o_testNoSolutionExists_remove9__10)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_testNoSolutionExists_remove9__10)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExists_remove9__10)).isEmpty());
        Assert.assertEquals("100,99,-99,-100", ((VecInt) (o_testNoSolutionExists_remove9__12)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_testNoSolutionExists_remove9__12)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExists_remove9__12)).isEmpty());
    }

    @Test(timeout = 30000)
    public void testNoSolutionExists_remove5_remove48_remove173_failAssert5() throws Exception, ContradictionException, TimeoutException {
        try {
            IVecInt clause = new VecInt();
            IVecInt o_testNoSolutionExists_remove5__3 = clause.push(100).push(99);
            IConstr o_testNoSolutionExists_remove5__5 = solver.addClause(clause);
            int[] array_380008966 = new int[]{198,200};
            	int[] array_1258681960 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove5__5).getLits();
            	for(int ii = 0; ii <array_380008966.length; ii++) {
            		org.junit.Assert.assertEquals(array_380008966[ii], array_1258681960[ii]);
            	};
            int[] array_1635508580 = new int[]{198,200};
            	int[] array_312752620 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove5__5).getLits();
            	for(int ii = 0; ii <array_1635508580.length; ii++) {
            		org.junit.Assert.assertEquals(array_1635508580[ii], array_312752620[ii]);
            	};
            IVecInt o_testNoSolutionExists_remove5__7 = clause.push((-99));
            IVecInt o_testNoSolutionExists_remove5__10 = clause.push((-100));
            IConstr o_testNoSolutionExists_remove5__12 = solver.addClause(clause);
            int[] array_715956334 = new int[]{199,201};
            	int[] array_2139907821 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove5__12).getLits();
            	for(int ii = 0; ii <array_715956334.length; ii++) {
            		org.junit.Assert.assertEquals(array_715956334[ii], array_2139907821[ii]);
            	};
            clause.clear();
            this.solver.isSatisfiable();
            int[] array_924246133 = new int[]{198,200};
            	int[] array_1280460106 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove5__5).getLits();
            	for(int ii = 0; ii <array_924246133.length; ii++) {
            		org.junit.Assert.assertEquals(array_924246133[ii], array_1280460106[ii]);
            	};
            int[] array_161647393 = new int[]{198,200};
            	int[] array_1329652965 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove5__5).getLits();
            	for(int ii = 0; ii <array_161647393.length; ii++) {
            		org.junit.Assert.assertEquals(array_161647393[ii], array_1329652965[ii]);
            	};
            int[] array_1465160341 = new int[]{199,201};
            	int[] array_170326452 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_remove5__12).getLits();
            	for(int ii = 0; ii <array_1465160341.length; ii++) {
            		org.junit.Assert.assertEquals(array_1465160341[ii], array_170326452[ii]);
            	};
            org.junit.Assert.fail("testNoSolutionExists_remove5_remove48_remove173 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }
}

