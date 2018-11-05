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
    public void testNoSolutionfound_add2386_failAssert238() throws Exception, TimeoutException {
        try {
            solver.setTimeoutOnConflicts(1);
            solver.setTimeoutOnConflicts(1);
            solver.isSatisfiable();
            org.junit.Assert.fail("testNoSolutionfound_add2386 should have thrown TimeoutException");
        } catch (TimeoutException expected) {
            Assert.assertEquals(" Timeout (1 conflicts) exceeded", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testNoSolutionfound_add2387_failAssert239() throws Exception, TimeoutException {
        try {
            solver.setTimeoutOnConflicts(1);
            solver.isSatisfiable();
            solver.isSatisfiable();
            org.junit.Assert.fail("testNoSolutionfound_add2387 should have thrown TimeoutException");
        } catch (TimeoutException expected) {
            Assert.assertEquals(" Timeout (1 conflicts) exceeded", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testNoSolutionfound_add2386_failAssert238litNum2407_failAssert240() throws Exception, TimeoutException {
        try {
            {
                solver.setTimeoutOnConflicts(2);
                solver.setTimeoutOnConflicts(1);
                solver.isSatisfiable();
                org.junit.Assert.fail("testNoSolutionfound_add2386 should have thrown TimeoutException");
            }
            org.junit.Assert.fail("testNoSolutionfound_add2386_failAssert238litNum2407 should have thrown TimeoutException");
        } catch (TimeoutException expected) {
            Assert.assertEquals(" Timeout (1 conflicts) exceeded", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testNoSolutionfound_add2386_failAssert238litNum2412_failAssert243() throws Exception, TimeoutException {
        try {
            {
                solver.setTimeoutOnConflicts(Integer.MIN_VALUE);
                solver.setTimeoutOnConflicts(1);
                solver.isSatisfiable();
                org.junit.Assert.fail("testNoSolutionfound_add2386 should have thrown TimeoutException");
            }
            org.junit.Assert.fail("testNoSolutionfound_add2386_failAssert238litNum2412 should have thrown TimeoutException");
        } catch (TimeoutException expected) {
            Assert.assertEquals(" Timeout (1 conflicts) exceeded", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testNoSolutionfound_add2386_failAssert238litNum2407_failAssert240_add2487_failAssert253() throws Exception, TimeoutException {
        try {
            {
                {
                    solver.setTimeoutOnConflicts(2);
                    solver.setTimeoutOnConflicts(2);
                    solver.setTimeoutOnConflicts(1);
                    solver.isSatisfiable();
                    org.junit.Assert.fail("testNoSolutionfound_add2386 should have thrown TimeoutException");
                }
                org.junit.Assert.fail("testNoSolutionfound_add2386_failAssert238litNum2407 should have thrown TimeoutException");
            }
            org.junit.Assert.fail("testNoSolutionfound_add2386_failAssert238litNum2407_failAssert240_add2487 should have thrown TimeoutException");
        } catch (TimeoutException expected) {
            Assert.assertEquals(" Timeout (1 conflicts) exceeded", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testNoSolutionfound_add2386_failAssert238litNum2407_failAssert240_add2490_failAssert254() throws Exception, TimeoutException {
        try {
            {
                {
                    solver.setTimeoutOnConflicts(2);
                    solver.setTimeoutOnConflicts(1);
                    solver.setTimeoutOnConflicts(1);
                    solver.isSatisfiable();
                    org.junit.Assert.fail("testNoSolutionfound_add2386 should have thrown TimeoutException");
                }
                org.junit.Assert.fail("testNoSolutionfound_add2386_failAssert238litNum2407 should have thrown TimeoutException");
            }
            org.junit.Assert.fail("testNoSolutionfound_add2386_failAssert238litNum2407_failAssert240_add2490 should have thrown TimeoutException");
        } catch (TimeoutException expected) {
            Assert.assertEquals(" Timeout (1 conflicts) exceeded", expected.getMessage());
        }
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

    @Test(timeout = 30000)
    public void testNoSolutionExistslitNum1() throws Exception, ContradictionException, TimeoutException {
        IVecInt clause = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause)).toString());
        Assert.assertTrue(((VecInt) (clause)).isEmpty());
        IVecInt o_testNoSolutionExistslitNum1__3 = clause.push(101).push(99);
        Assert.assertEquals("101,99", ((VecInt) (o_testNoSolutionExistslitNum1__3)).toString());
        Assert.assertEquals(100, ((int) (((VecInt) (o_testNoSolutionExistslitNum1__3)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExistslitNum1__3)).isEmpty());
        IConstr o_testNoSolutionExistslitNum1__5 = solver.addClause(clause);
        Assert.assertFalse(((OriginalBinaryClause) (o_testNoSolutionExistslitNum1__5)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testNoSolutionExistslitNum1__5)).getActivity())), 0.1);
        int[] array_924246133 = new int[]{198,202};
        	int[] array_1280460106 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExistslitNum1__5).getLits();
        	for(int ii = 0; ii <array_924246133.length; ii++) {
        		org.junit.Assert.assertEquals(array_924246133[ii], array_1280460106[ii]);
        	};
        Assert.assertEquals("99[?] 101[?]", ((OriginalBinaryClause) (o_testNoSolutionExistslitNum1__5)).toString());
        Assert.assertEquals(200, ((int) (((OriginalBinaryClause) (o_testNoSolutionExistslitNum1__5)).hashCode())));
        clause.clear();
        IVecInt o_testNoSolutionExistslitNum1__7 = clause.push((-99));
        Assert.assertEquals("-99", ((VecInt) (o_testNoSolutionExistslitNum1__7)).toString());
        Assert.assertEquals(-99, ((int) (((VecInt) (o_testNoSolutionExistslitNum1__7)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExistslitNum1__7)).isEmpty());
        IConstr o_testNoSolutionExistslitNum1__9 = solver.addClause(clause);
        Assert.assertTrue(((UnitClause) (o_testNoSolutionExistslitNum1__9)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_testNoSolutionExistslitNum1__9)).getActivity())), 0.1);
        Assert.assertEquals("-99", ((UnitClause) (o_testNoSolutionExistslitNum1__9)).toString());
        clause.clear();
        IVecInt o_testNoSolutionExistslitNum1__11 = clause.push((-100));
        Assert.assertEquals("-100", ((VecInt) (o_testNoSolutionExistslitNum1__11)).toString());
        Assert.assertEquals(-100, ((int) (((VecInt) (o_testNoSolutionExistslitNum1__11)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExistslitNum1__11)).isEmpty());
        IConstr o_testNoSolutionExistslitNum1__13 = solver.addClause(clause);
        Assert.assertTrue(((UnitClause) (o_testNoSolutionExistslitNum1__13)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_testNoSolutionExistslitNum1__13)).getActivity())), 0.1);
        Assert.assertEquals("-100", ((UnitClause) (o_testNoSolutionExistslitNum1__13)).toString());
        clause.clear();
        this.solver.isSatisfiable();
        Assert.assertEquals("", ((VecInt) (clause)).toString());
        Assert.assertTrue(((VecInt) (clause)).isEmpty());
        Assert.assertEquals("", ((VecInt) (o_testNoSolutionExistslitNum1__3)).toString());
        Assert.assertTrue(((VecInt) (o_testNoSolutionExistslitNum1__3)).isEmpty());
        Assert.assertFalse(((OriginalBinaryClause) (o_testNoSolutionExistslitNum1__5)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testNoSolutionExistslitNum1__5)).getActivity())), 0.1);
        int[] array_1780117107 = new int[]{198,202};
        	int[] array_1918579922 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExistslitNum1__5).getLits();
        	for(int ii = 0; ii <array_1780117107.length; ii++) {
        		org.junit.Assert.assertEquals(array_1780117107[ii], array_1918579922[ii]);
        	};
        Assert.assertEquals("99[F] 101[?]", ((OriginalBinaryClause) (o_testNoSolutionExistslitNum1__5)).toString());
        Assert.assertEquals(200, ((int) (((OriginalBinaryClause) (o_testNoSolutionExistslitNum1__5)).hashCode())));
        Assert.assertEquals("", ((VecInt) (o_testNoSolutionExistslitNum1__7)).toString());
        Assert.assertTrue(((VecInt) (o_testNoSolutionExistslitNum1__7)).isEmpty());
        Assert.assertTrue(((UnitClause) (o_testNoSolutionExistslitNum1__9)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_testNoSolutionExistslitNum1__9)).getActivity())), 0.1);
        Assert.assertEquals("-99", ((UnitClause) (o_testNoSolutionExistslitNum1__9)).toString());
        Assert.assertEquals("", ((VecInt) (o_testNoSolutionExistslitNum1__11)).toString());
        Assert.assertTrue(((VecInt) (o_testNoSolutionExistslitNum1__11)).isEmpty());
        Assert.assertTrue(((UnitClause) (o_testNoSolutionExistslitNum1__13)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_testNoSolutionExistslitNum1__13)).getActivity())), 0.1);
        Assert.assertEquals("-100", ((UnitClause) (o_testNoSolutionExistslitNum1__13)).toString());
    }

    @Test(timeout = 30000)
    public void testNoSolutionExistslitNum8() throws Exception, ContradictionException, TimeoutException {
        IVecInt clause = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause)).toString());
        Assert.assertTrue(((VecInt) (clause)).isEmpty());
        IVecInt o_testNoSolutionExistslitNum8__3 = clause.push(100).push(98);
        Assert.assertEquals("100,98", ((VecInt) (o_testNoSolutionExistslitNum8__3)).toString());
        Assert.assertEquals(99, ((int) (((VecInt) (o_testNoSolutionExistslitNum8__3)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExistslitNum8__3)).isEmpty());
        IConstr o_testNoSolutionExistslitNum8__5 = solver.addClause(clause);
        Assert.assertFalse(((OriginalBinaryClause) (o_testNoSolutionExistslitNum8__5)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testNoSolutionExistslitNum8__5)).getActivity())), 0.1);
        int[] array_582027917 = new int[]{196,200};
        	int[] array_2113184556 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExistslitNum8__5).getLits();
        	for(int ii = 0; ii <array_582027917.length; ii++) {
        		org.junit.Assert.assertEquals(array_582027917[ii], array_2113184556[ii]);
        	};
        Assert.assertEquals("98[?] 100[?]", ((OriginalBinaryClause) (o_testNoSolutionExistslitNum8__5)).toString());
        Assert.assertEquals(198, ((int) (((OriginalBinaryClause) (o_testNoSolutionExistslitNum8__5)).hashCode())));
        clause.clear();
        IVecInt o_testNoSolutionExistslitNum8__7 = clause.push((-99));
        Assert.assertEquals("-99", ((VecInt) (o_testNoSolutionExistslitNum8__7)).toString());
        Assert.assertEquals(-99, ((int) (((VecInt) (o_testNoSolutionExistslitNum8__7)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExistslitNum8__7)).isEmpty());
        IConstr o_testNoSolutionExistslitNum8__9 = solver.addClause(clause);
        Assert.assertTrue(((UnitClause) (o_testNoSolutionExistslitNum8__9)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_testNoSolutionExistslitNum8__9)).getActivity())), 0.1);
        Assert.assertEquals("-99", ((UnitClause) (o_testNoSolutionExistslitNum8__9)).toString());
        clause.clear();
        IVecInt o_testNoSolutionExistslitNum8__11 = clause.push((-100));
        Assert.assertEquals("-100", ((VecInt) (o_testNoSolutionExistslitNum8__11)).toString());
        Assert.assertEquals(-100, ((int) (((VecInt) (o_testNoSolutionExistslitNum8__11)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExistslitNum8__11)).isEmpty());
        IConstr o_testNoSolutionExistslitNum8__13 = solver.addClause(clause);
        Assert.assertTrue(((UnitClause) (o_testNoSolutionExistslitNum8__13)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_testNoSolutionExistslitNum8__13)).getActivity())), 0.1);
        Assert.assertEquals("-100", ((UnitClause) (o_testNoSolutionExistslitNum8__13)).toString());
        clause.clear();
        this.solver.isSatisfiable();
        Assert.assertEquals("", ((VecInt) (clause)).toString());
        Assert.assertTrue(((VecInt) (clause)).isEmpty());
        Assert.assertEquals("", ((VecInt) (o_testNoSolutionExistslitNum8__3)).toString());
        Assert.assertTrue(((VecInt) (o_testNoSolutionExistslitNum8__3)).isEmpty());
        Assert.assertFalse(((OriginalBinaryClause) (o_testNoSolutionExistslitNum8__5)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testNoSolutionExistslitNum8__5)).getActivity())), 0.1);
        int[] array_1848848534 = new int[]{196,200};
        	int[] array_1904675524 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExistslitNum8__5).getLits();
        	for(int ii = 0; ii <array_1848848534.length; ii++) {
        		org.junit.Assert.assertEquals(array_1848848534[ii], array_1904675524[ii]);
        	};
        Assert.assertEquals("98[?] 100[F]", ((OriginalBinaryClause) (o_testNoSolutionExistslitNum8__5)).toString());
        Assert.assertEquals(198, ((int) (((OriginalBinaryClause) (o_testNoSolutionExistslitNum8__5)).hashCode())));
        Assert.assertEquals("", ((VecInt) (o_testNoSolutionExistslitNum8__7)).toString());
        Assert.assertTrue(((VecInt) (o_testNoSolutionExistslitNum8__7)).isEmpty());
        Assert.assertTrue(((UnitClause) (o_testNoSolutionExistslitNum8__9)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_testNoSolutionExistslitNum8__9)).getActivity())), 0.1);
        Assert.assertEquals("-99", ((UnitClause) (o_testNoSolutionExistslitNum8__9)).toString());
        Assert.assertEquals("", ((VecInt) (o_testNoSolutionExistslitNum8__11)).toString());
        Assert.assertTrue(((VecInt) (o_testNoSolutionExistslitNum8__11)).isEmpty());
        Assert.assertTrue(((UnitClause) (o_testNoSolutionExistslitNum8__13)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_testNoSolutionExistslitNum8__13)).getActivity())), 0.1);
        Assert.assertEquals("-100", ((UnitClause) (o_testNoSolutionExistslitNum8__13)).toString());
    }

    @Test(timeout = 30000)
    public void testNoSolutionExistslitNum13() throws Exception, ContradictionException, TimeoutException {
        IVecInt clause = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause)).toString());
        Assert.assertTrue(((VecInt) (clause)).isEmpty());
        IVecInt o_testNoSolutionExistslitNum13__3 = clause.push(100).push(99);
        Assert.assertEquals("100,99", ((VecInt) (o_testNoSolutionExistslitNum13__3)).toString());
        Assert.assertEquals(99, ((int) (((VecInt) (o_testNoSolutionExistslitNum13__3)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExistslitNum13__3)).isEmpty());
        IConstr o_testNoSolutionExistslitNum13__5 = solver.addClause(clause);
        Assert.assertFalse(((OriginalBinaryClause) (o_testNoSolutionExistslitNum13__5)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testNoSolutionExistslitNum13__5)).getActivity())), 0.1);
        int[] array_21383048 = new int[]{198,200};
        	int[] array_2064975260 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExistslitNum13__5).getLits();
        	for(int ii = 0; ii <array_21383048.length; ii++) {
        		org.junit.Assert.assertEquals(array_21383048[ii], array_2064975260[ii]);
        	};
        Assert.assertEquals("99[?] 100[?]", ((OriginalBinaryClause) (o_testNoSolutionExistslitNum13__5)).toString());
        Assert.assertEquals(199, ((int) (((OriginalBinaryClause) (o_testNoSolutionExistslitNum13__5)).hashCode())));
        clause.clear();
        IVecInt o_testNoSolutionExistslitNum13__7 = clause.push((-100));
        Assert.assertEquals("-100", ((VecInt) (o_testNoSolutionExistslitNum13__7)).toString());
        Assert.assertEquals(-100, ((int) (((VecInt) (o_testNoSolutionExistslitNum13__7)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExistslitNum13__7)).isEmpty());
        IConstr o_testNoSolutionExistslitNum13__9 = solver.addClause(clause);
        Assert.assertTrue(((UnitClause) (o_testNoSolutionExistslitNum13__9)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_testNoSolutionExistslitNum13__9)).getActivity())), 0.1);
        Assert.assertEquals("-100", ((UnitClause) (o_testNoSolutionExistslitNum13__9)).toString());
        clause.clear();
        IVecInt o_testNoSolutionExistslitNum13__11 = clause.push((-100));
        Assert.assertEquals("-100", ((VecInt) (o_testNoSolutionExistslitNum13__11)).toString());
        Assert.assertEquals(-100, ((int) (((VecInt) (o_testNoSolutionExistslitNum13__11)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExistslitNum13__11)).isEmpty());
        solver.addClause(clause);
        clause.clear();
        this.solver.isSatisfiable();
    }

    @Test(timeout = 30000)
    public void testNoSolutionExistslitNum14() throws Exception, ContradictionException, TimeoutException {
        IVecInt clause = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause)).toString());
        Assert.assertTrue(((VecInt) (clause)).isEmpty());
        IVecInt o_testNoSolutionExistslitNum14__3 = clause.push(100).push(99);
        Assert.assertEquals("100,99", ((VecInt) (o_testNoSolutionExistslitNum14__3)).toString());
        Assert.assertEquals(99, ((int) (((VecInt) (o_testNoSolutionExistslitNum14__3)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExistslitNum14__3)).isEmpty());
        IConstr o_testNoSolutionExistslitNum14__5 = solver.addClause(clause);
        Assert.assertFalse(((OriginalBinaryClause) (o_testNoSolutionExistslitNum14__5)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testNoSolutionExistslitNum14__5)).getActivity())), 0.1);
        int[] array_19668052 = new int[]{198,200};
        	int[] array_564957235 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExistslitNum14__5).getLits();
        	for(int ii = 0; ii <array_19668052.length; ii++) {
        		org.junit.Assert.assertEquals(array_19668052[ii], array_564957235[ii]);
        	};
        Assert.assertEquals("99[?] 100[?]", ((OriginalBinaryClause) (o_testNoSolutionExistslitNum14__5)).toString());
        Assert.assertEquals(199, ((int) (((OriginalBinaryClause) (o_testNoSolutionExistslitNum14__5)).hashCode())));
        clause.clear();
        IVecInt o_testNoSolutionExistslitNum14__7 = clause.push((-98));
        Assert.assertEquals("-98", ((VecInt) (o_testNoSolutionExistslitNum14__7)).toString());
        Assert.assertEquals(-98, ((int) (((VecInt) (o_testNoSolutionExistslitNum14__7)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExistslitNum14__7)).isEmpty());
        IConstr o_testNoSolutionExistslitNum14__9 = solver.addClause(clause);
        Assert.assertTrue(((UnitClause) (o_testNoSolutionExistslitNum14__9)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_testNoSolutionExistslitNum14__9)).getActivity())), 0.1);
        Assert.assertEquals("-98", ((UnitClause) (o_testNoSolutionExistslitNum14__9)).toString());
        clause.clear();
        IVecInt o_testNoSolutionExistslitNum14__11 = clause.push((-100));
        Assert.assertEquals("-100", ((VecInt) (o_testNoSolutionExistslitNum14__11)).toString());
        Assert.assertEquals(-100, ((int) (((VecInt) (o_testNoSolutionExistslitNum14__11)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExistslitNum14__11)).isEmpty());
        IConstr o_testNoSolutionExistslitNum14__13 = solver.addClause(clause);
        Assert.assertTrue(((UnitClause) (o_testNoSolutionExistslitNum14__13)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_testNoSolutionExistslitNum14__13)).getActivity())), 0.1);
        Assert.assertEquals("-100", ((UnitClause) (o_testNoSolutionExistslitNum14__13)).toString());
        clause.clear();
        this.solver.isSatisfiable();
        Assert.assertEquals("", ((VecInt) (clause)).toString());
        Assert.assertTrue(((VecInt) (clause)).isEmpty());
        Assert.assertEquals("", ((VecInt) (o_testNoSolutionExistslitNum14__3)).toString());
        Assert.assertTrue(((VecInt) (o_testNoSolutionExistslitNum14__3)).isEmpty());
        Assert.assertFalse(((OriginalBinaryClause) (o_testNoSolutionExistslitNum14__5)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testNoSolutionExistslitNum14__5)).getActivity())), 0.1);
        int[] array_1348236471 = new int[]{198,200};
        	int[] array_2145706595 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExistslitNum14__5).getLits();
        	for(int ii = 0; ii <array_1348236471.length; ii++) {
        		org.junit.Assert.assertEquals(array_1348236471[ii], array_2145706595[ii]);
        	};
        Assert.assertEquals("99[?] 100[F]", ((OriginalBinaryClause) (o_testNoSolutionExistslitNum14__5)).toString());
        Assert.assertEquals(199, ((int) (((OriginalBinaryClause) (o_testNoSolutionExistslitNum14__5)).hashCode())));
        Assert.assertEquals("", ((VecInt) (o_testNoSolutionExistslitNum14__7)).toString());
        Assert.assertTrue(((VecInt) (o_testNoSolutionExistslitNum14__7)).isEmpty());
        Assert.assertTrue(((UnitClause) (o_testNoSolutionExistslitNum14__9)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_testNoSolutionExistslitNum14__9)).getActivity())), 0.1);
        Assert.assertEquals("-98", ((UnitClause) (o_testNoSolutionExistslitNum14__9)).toString());
        Assert.assertEquals("", ((VecInt) (o_testNoSolutionExistslitNum14__11)).toString());
        Assert.assertTrue(((VecInt) (o_testNoSolutionExistslitNum14__11)).isEmpty());
        Assert.assertTrue(((UnitClause) (o_testNoSolutionExistslitNum14__13)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_testNoSolutionExistslitNum14__13)).getActivity())), 0.1);
        Assert.assertEquals("-100", ((UnitClause) (o_testNoSolutionExistslitNum14__13)).toString());
    }

    @Test(timeout = 30000)
    public void testNoSolutionExistslitNum19() throws Exception, ContradictionException, TimeoutException {
        IVecInt clause = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause)).toString());
        Assert.assertTrue(((VecInt) (clause)).isEmpty());
        IVecInt o_testNoSolutionExistslitNum19__3 = clause.push(100).push(99);
        Assert.assertEquals("100,99", ((VecInt) (o_testNoSolutionExistslitNum19__3)).toString());
        Assert.assertEquals(99, ((int) (((VecInt) (o_testNoSolutionExistslitNum19__3)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExistslitNum19__3)).isEmpty());
        IConstr o_testNoSolutionExistslitNum19__5 = solver.addClause(clause);
        Assert.assertFalse(((OriginalBinaryClause) (o_testNoSolutionExistslitNum19__5)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testNoSolutionExistslitNum19__5)).getActivity())), 0.1);
        int[] array_1231906488 = new int[]{198,200};
        	int[] array_344656050 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExistslitNum19__5).getLits();
        	for(int ii = 0; ii <array_1231906488.length; ii++) {
        		org.junit.Assert.assertEquals(array_1231906488[ii], array_344656050[ii]);
        	};
        Assert.assertEquals("99[?] 100[?]", ((OriginalBinaryClause) (o_testNoSolutionExistslitNum19__5)).toString());
        Assert.assertEquals(199, ((int) (((OriginalBinaryClause) (o_testNoSolutionExistslitNum19__5)).hashCode())));
        clause.clear();
        IVecInt o_testNoSolutionExistslitNum19__7 = clause.push((-99));
        Assert.assertEquals("-99", ((VecInt) (o_testNoSolutionExistslitNum19__7)).toString());
        Assert.assertEquals(-99, ((int) (((VecInt) (o_testNoSolutionExistslitNum19__7)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExistslitNum19__7)).isEmpty());
        IConstr o_testNoSolutionExistslitNum19__9 = solver.addClause(clause);
        Assert.assertTrue(((UnitClause) (o_testNoSolutionExistslitNum19__9)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_testNoSolutionExistslitNum19__9)).getActivity())), 0.1);
        Assert.assertEquals("-99", ((UnitClause) (o_testNoSolutionExistslitNum19__9)).toString());
        clause.clear();
        IVecInt o_testNoSolutionExistslitNum19__11 = clause.push((-101));
        Assert.assertEquals("-101", ((VecInt) (o_testNoSolutionExistslitNum19__11)).toString());
        Assert.assertEquals(-101, ((int) (((VecInt) (o_testNoSolutionExistslitNum19__11)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExistslitNum19__11)).isEmpty());
        IConstr o_testNoSolutionExistslitNum19__13 = solver.addClause(clause);
        Assert.assertTrue(((UnitClause) (o_testNoSolutionExistslitNum19__13)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_testNoSolutionExistslitNum19__13)).getActivity())), 0.1);
        Assert.assertEquals("-101", ((UnitClause) (o_testNoSolutionExistslitNum19__13)).toString());
        clause.clear();
        this.solver.isSatisfiable();
        Assert.assertEquals("", ((VecInt) (clause)).toString());
        Assert.assertTrue(((VecInt) (clause)).isEmpty());
        Assert.assertEquals("", ((VecInt) (o_testNoSolutionExistslitNum19__3)).toString());
        Assert.assertTrue(((VecInt) (o_testNoSolutionExistslitNum19__3)).isEmpty());
        Assert.assertFalse(((OriginalBinaryClause) (o_testNoSolutionExistslitNum19__5)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testNoSolutionExistslitNum19__5)).getActivity())), 0.1);
        int[] array_986475328 = new int[]{198,200};
        	int[] array_323897869 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExistslitNum19__5).getLits();
        	for(int ii = 0; ii <array_986475328.length; ii++) {
        		org.junit.Assert.assertEquals(array_986475328[ii], array_323897869[ii]);
        	};
        Assert.assertEquals("99[F] 100[?]", ((OriginalBinaryClause) (o_testNoSolutionExistslitNum19__5)).toString());
        Assert.assertEquals(199, ((int) (((OriginalBinaryClause) (o_testNoSolutionExistslitNum19__5)).hashCode())));
        Assert.assertEquals("", ((VecInt) (o_testNoSolutionExistslitNum19__7)).toString());
        Assert.assertTrue(((VecInt) (o_testNoSolutionExistslitNum19__7)).isEmpty());
        Assert.assertTrue(((UnitClause) (o_testNoSolutionExistslitNum19__9)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_testNoSolutionExistslitNum19__9)).getActivity())), 0.1);
        Assert.assertEquals("-99", ((UnitClause) (o_testNoSolutionExistslitNum19__9)).toString());
        Assert.assertEquals("", ((VecInt) (o_testNoSolutionExistslitNum19__11)).toString());
        Assert.assertTrue(((VecInt) (o_testNoSolutionExistslitNum19__11)).isEmpty());
        Assert.assertTrue(((UnitClause) (o_testNoSolutionExistslitNum19__13)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_testNoSolutionExistslitNum19__13)).getActivity())), 0.1);
        Assert.assertEquals("-101", ((UnitClause) (o_testNoSolutionExistslitNum19__13)).toString());
    }

    @Test(timeout = 30000)
    public void testNoSolutionExistslitNum20() throws Exception, ContradictionException, TimeoutException {
        IVecInt clause = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause)).toString());
        Assert.assertTrue(((VecInt) (clause)).isEmpty());
        IVecInt o_testNoSolutionExistslitNum20__3 = clause.push(100).push(99);
        Assert.assertEquals("100,99", ((VecInt) (o_testNoSolutionExistslitNum20__3)).toString());
        Assert.assertEquals(99, ((int) (((VecInt) (o_testNoSolutionExistslitNum20__3)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExistslitNum20__3)).isEmpty());
        IConstr o_testNoSolutionExistslitNum20__5 = solver.addClause(clause);
        Assert.assertFalse(((OriginalBinaryClause) (o_testNoSolutionExistslitNum20__5)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testNoSolutionExistslitNum20__5)).getActivity())), 0.1);
        int[] array_1112195874 = new int[]{198,200};
        	int[] array_938903036 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExistslitNum20__5).getLits();
        	for(int ii = 0; ii <array_1112195874.length; ii++) {
        		org.junit.Assert.assertEquals(array_1112195874[ii], array_938903036[ii]);
        	};
        Assert.assertEquals("99[?] 100[?]", ((OriginalBinaryClause) (o_testNoSolutionExistslitNum20__5)).toString());
        Assert.assertEquals(199, ((int) (((OriginalBinaryClause) (o_testNoSolutionExistslitNum20__5)).hashCode())));
        clause.clear();
        IVecInt o_testNoSolutionExistslitNum20__7 = clause.push((-99));
        Assert.assertEquals("-99", ((VecInt) (o_testNoSolutionExistslitNum20__7)).toString());
        Assert.assertEquals(-99, ((int) (((VecInt) (o_testNoSolutionExistslitNum20__7)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExistslitNum20__7)).isEmpty());
        IConstr o_testNoSolutionExistslitNum20__9 = solver.addClause(clause);
        Assert.assertTrue(((UnitClause) (o_testNoSolutionExistslitNum20__9)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_testNoSolutionExistslitNum20__9)).getActivity())), 0.1);
        Assert.assertEquals("-99", ((UnitClause) (o_testNoSolutionExistslitNum20__9)).toString());
        clause.clear();
        IVecInt o_testNoSolutionExistslitNum20__11 = clause.push((-99));
        Assert.assertEquals("-99", ((VecInt) (o_testNoSolutionExistslitNum20__11)).toString());
        Assert.assertEquals(-99, ((int) (((VecInt) (o_testNoSolutionExistslitNum20__11)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExistslitNum20__11)).isEmpty());
        solver.addClause(clause);
        clause.clear();
        this.solver.isSatisfiable();
    }

    @Test(timeout = 30000)
    public void testNoSolutionExists_add25() throws Exception, ContradictionException, TimeoutException {
        IVecInt clause = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause)).toString());
        Assert.assertTrue(((VecInt) (clause)).isEmpty());
        IVecInt o_testNoSolutionExists_add25__3 = clause.push(100).push(99);
        Assert.assertEquals("100,99", ((VecInt) (o_testNoSolutionExists_add25__3)).toString());
        Assert.assertEquals(99, ((int) (((VecInt) (o_testNoSolutionExists_add25__3)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExists_add25__3)).isEmpty());
        IVecInt o_testNoSolutionExists_add25__5 = clause.push(100).push(99);
        Assert.assertEquals("100,99,100,99", ((VecInt) (o_testNoSolutionExists_add25__5)).toString());
        Assert.assertEquals(99, ((int) (((VecInt) (o_testNoSolutionExists_add25__5)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExists_add25__5)).isEmpty());
        IConstr o_testNoSolutionExists_add25__7 = solver.addClause(clause);
        Assert.assertFalse(((OriginalBinaryClause) (o_testNoSolutionExists_add25__7)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testNoSolutionExists_add25__7)).getActivity())), 0.1);
        int[] array_630434226 = new int[]{198,200};
        	int[] array_510123478 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add25__7).getLits();
        	for(int ii = 0; ii <array_630434226.length; ii++) {
        		org.junit.Assert.assertEquals(array_630434226[ii], array_510123478[ii]);
        	};
        Assert.assertEquals("99[?] 100[?]", ((OriginalBinaryClause) (o_testNoSolutionExists_add25__7)).toString());
        Assert.assertEquals(199, ((int) (((OriginalBinaryClause) (o_testNoSolutionExists_add25__7)).hashCode())));
        clause.clear();
        IVecInt o_testNoSolutionExists_add25__9 = clause.push((-99));
        Assert.assertEquals("-99", ((VecInt) (o_testNoSolutionExists_add25__9)).toString());
        Assert.assertEquals(-99, ((int) (((VecInt) (o_testNoSolutionExists_add25__9)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExists_add25__9)).isEmpty());
        IConstr o_testNoSolutionExists_add25__11 = solver.addClause(clause);
        Assert.assertTrue(((UnitClause) (o_testNoSolutionExists_add25__11)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_testNoSolutionExists_add25__11)).getActivity())), 0.1);
        Assert.assertEquals("-99", ((UnitClause) (o_testNoSolutionExists_add25__11)).toString());
        clause.clear();
        IVecInt o_testNoSolutionExists_add25__13 = clause.push((-100));
        Assert.assertEquals("-100", ((VecInt) (o_testNoSolutionExists_add25__13)).toString());
        Assert.assertEquals(-100, ((int) (((VecInt) (o_testNoSolutionExists_add25__13)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExists_add25__13)).isEmpty());
        IConstr o_testNoSolutionExists_add25__15 = solver.addClause(clause);
        Assert.assertTrue(((UnitClause) (o_testNoSolutionExists_add25__15)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_testNoSolutionExists_add25__15)).getActivity())), 0.1);
        Assert.assertEquals("-100", ((UnitClause) (o_testNoSolutionExists_add25__15)).toString());
        clause.clear();
        this.solver.isSatisfiable();
        Assert.assertEquals("", ((VecInt) (clause)).toString());
        Assert.assertTrue(((VecInt) (clause)).isEmpty());
        Assert.assertEquals("", ((VecInt) (o_testNoSolutionExists_add25__3)).toString());
        Assert.assertTrue(((VecInt) (o_testNoSolutionExists_add25__3)).isEmpty());
        Assert.assertEquals("", ((VecInt) (o_testNoSolutionExists_add25__5)).toString());
        Assert.assertTrue(((VecInt) (o_testNoSolutionExists_add25__5)).isEmpty());
        Assert.assertFalse(((OriginalBinaryClause) (o_testNoSolutionExists_add25__7)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testNoSolutionExists_add25__7)).getActivity())), 0.1);
        int[] array_2086707665 = new int[]{198,200};
        	int[] array_1278592644 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add25__7).getLits();
        	for(int ii = 0; ii <array_2086707665.length; ii++) {
        		org.junit.Assert.assertEquals(array_2086707665[ii], array_1278592644[ii]);
        	};
        Assert.assertEquals("99[F] 100[F]", ((OriginalBinaryClause) (o_testNoSolutionExists_add25__7)).toString());
        Assert.assertEquals(199, ((int) (((OriginalBinaryClause) (o_testNoSolutionExists_add25__7)).hashCode())));
        Assert.assertEquals("", ((VecInt) (o_testNoSolutionExists_add25__9)).toString());
        Assert.assertTrue(((VecInt) (o_testNoSolutionExists_add25__9)).isEmpty());
        Assert.assertTrue(((UnitClause) (o_testNoSolutionExists_add25__11)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_testNoSolutionExists_add25__11)).getActivity())), 0.1);
        Assert.assertEquals("-99", ((UnitClause) (o_testNoSolutionExists_add25__11)).toString());
        Assert.assertEquals("", ((VecInt) (o_testNoSolutionExists_add25__13)).toString());
        Assert.assertTrue(((VecInt) (o_testNoSolutionExists_add25__13)).isEmpty());
        Assert.assertTrue(((UnitClause) (o_testNoSolutionExists_add25__15)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_testNoSolutionExists_add25__15)).getActivity())), 0.1);
        Assert.assertEquals("-100", ((UnitClause) (o_testNoSolutionExists_add25__15)).toString());
    }

    @Test(timeout = 30000)
    public void testNoSolutionExists_add26() throws Exception, ContradictionException, TimeoutException {
        IVecInt clause = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause)).toString());
        Assert.assertTrue(((VecInt) (clause)).isEmpty());
        IVecInt o_testNoSolutionExists_add26__3 = clause.push(100);
        Assert.assertEquals("100", ((VecInt) (o_testNoSolutionExists_add26__3)).toString());
        Assert.assertEquals(100, ((int) (((VecInt) (o_testNoSolutionExists_add26__3)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExists_add26__3)).isEmpty());
        IVecInt o_testNoSolutionExists_add26__4 = clause.push(100).push(99);
        Assert.assertEquals("100,100,99", ((VecInt) (o_testNoSolutionExists_add26__4)).toString());
        Assert.assertEquals(99, ((int) (((VecInt) (o_testNoSolutionExists_add26__4)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExists_add26__4)).isEmpty());
        IConstr o_testNoSolutionExists_add26__6 = solver.addClause(clause);
        Assert.assertFalse(((OriginalBinaryClause) (o_testNoSolutionExists_add26__6)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testNoSolutionExists_add26__6)).getActivity())), 0.1);
        int[] array_497080696 = new int[]{198,200};
        	int[] array_40865201 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add26__6).getLits();
        	for(int ii = 0; ii <array_497080696.length; ii++) {
        		org.junit.Assert.assertEquals(array_497080696[ii], array_40865201[ii]);
        	};
        Assert.assertEquals("99[?] 100[?]", ((OriginalBinaryClause) (o_testNoSolutionExists_add26__6)).toString());
        Assert.assertEquals(199, ((int) (((OriginalBinaryClause) (o_testNoSolutionExists_add26__6)).hashCode())));
        clause.clear();
        IVecInt o_testNoSolutionExists_add26__8 = clause.push((-99));
        Assert.assertEquals("-99", ((VecInt) (o_testNoSolutionExists_add26__8)).toString());
        Assert.assertEquals(-99, ((int) (((VecInt) (o_testNoSolutionExists_add26__8)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExists_add26__8)).isEmpty());
        IConstr o_testNoSolutionExists_add26__10 = solver.addClause(clause);
        Assert.assertTrue(((UnitClause) (o_testNoSolutionExists_add26__10)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_testNoSolutionExists_add26__10)).getActivity())), 0.1);
        Assert.assertEquals("-99", ((UnitClause) (o_testNoSolutionExists_add26__10)).toString());
        clause.clear();
        IVecInt o_testNoSolutionExists_add26__12 = clause.push((-100));
        Assert.assertEquals("-100", ((VecInt) (o_testNoSolutionExists_add26__12)).toString());
        Assert.assertEquals(-100, ((int) (((VecInt) (o_testNoSolutionExists_add26__12)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExists_add26__12)).isEmpty());
        IConstr o_testNoSolutionExists_add26__14 = solver.addClause(clause);
        Assert.assertTrue(((UnitClause) (o_testNoSolutionExists_add26__14)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_testNoSolutionExists_add26__14)).getActivity())), 0.1);
        Assert.assertEquals("-100", ((UnitClause) (o_testNoSolutionExists_add26__14)).toString());
        clause.clear();
        this.solver.isSatisfiable();
        Assert.assertEquals("", ((VecInt) (clause)).toString());
        Assert.assertTrue(((VecInt) (clause)).isEmpty());
        Assert.assertEquals("", ((VecInt) (o_testNoSolutionExists_add26__3)).toString());
        Assert.assertTrue(((VecInt) (o_testNoSolutionExists_add26__3)).isEmpty());
        Assert.assertEquals("", ((VecInt) (o_testNoSolutionExists_add26__4)).toString());
        Assert.assertTrue(((VecInt) (o_testNoSolutionExists_add26__4)).isEmpty());
        Assert.assertFalse(((OriginalBinaryClause) (o_testNoSolutionExists_add26__6)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testNoSolutionExists_add26__6)).getActivity())), 0.1);
        int[] array_1226901677 = new int[]{198,200};
        	int[] array_433345085 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add26__6).getLits();
        	for(int ii = 0; ii <array_1226901677.length; ii++) {
        		org.junit.Assert.assertEquals(array_1226901677[ii], array_433345085[ii]);
        	};
        Assert.assertEquals("99[F] 100[F]", ((OriginalBinaryClause) (o_testNoSolutionExists_add26__6)).toString());
        Assert.assertEquals(199, ((int) (((OriginalBinaryClause) (o_testNoSolutionExists_add26__6)).hashCode())));
        Assert.assertEquals("", ((VecInt) (o_testNoSolutionExists_add26__8)).toString());
        Assert.assertTrue(((VecInt) (o_testNoSolutionExists_add26__8)).isEmpty());
        Assert.assertTrue(((UnitClause) (o_testNoSolutionExists_add26__10)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_testNoSolutionExists_add26__10)).getActivity())), 0.1);
        Assert.assertEquals("-99", ((UnitClause) (o_testNoSolutionExists_add26__10)).toString());
        Assert.assertEquals("", ((VecInt) (o_testNoSolutionExists_add26__12)).toString());
        Assert.assertTrue(((VecInt) (o_testNoSolutionExists_add26__12)).isEmpty());
        Assert.assertTrue(((UnitClause) (o_testNoSolutionExists_add26__14)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_testNoSolutionExists_add26__14)).getActivity())), 0.1);
        Assert.assertEquals("-100", ((UnitClause) (o_testNoSolutionExists_add26__14)).toString());
    }

    @Test(timeout = 30000)
    public void testNoSolutionExists_add27() throws Exception, ContradictionException, TimeoutException {
        IVecInt clause = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause)).toString());
        Assert.assertTrue(((VecInt) (clause)).isEmpty());
        IVecInt o_testNoSolutionExists_add27__3 = clause.push(100).push(99);
        Assert.assertEquals("100,99", ((VecInt) (o_testNoSolutionExists_add27__3)).toString());
        Assert.assertEquals(99, ((int) (((VecInt) (o_testNoSolutionExists_add27__3)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExists_add27__3)).isEmpty());
        IConstr o_testNoSolutionExists_add27__5 = solver.addClause(clause);
        Assert.assertFalse(((OriginalBinaryClause) (o_testNoSolutionExists_add27__5)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testNoSolutionExists_add27__5)).getActivity())), 0.1);
        int[] array_710729714 = new int[]{198,200};
        	int[] array_418055333 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__5).getLits();
        	for(int ii = 0; ii <array_710729714.length; ii++) {
        		org.junit.Assert.assertEquals(array_710729714[ii], array_418055333[ii]);
        	};
        Assert.assertEquals("99[?] 100[?]", ((OriginalBinaryClause) (o_testNoSolutionExists_add27__5)).toString());
        Assert.assertEquals(199, ((int) (((OriginalBinaryClause) (o_testNoSolutionExists_add27__5)).hashCode())));
        IConstr o_testNoSolutionExists_add27__6 = solver.addClause(clause);
        Assert.assertFalse(((OriginalBinaryClause) (o_testNoSolutionExists_add27__6)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testNoSolutionExists_add27__6)).getActivity())), 0.1);
        int[] array_221006639 = new int[]{198,200};
        	int[] array_1045185488 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__6).getLits();
        	for(int ii = 0; ii <array_221006639.length; ii++) {
        		org.junit.Assert.assertEquals(array_221006639[ii], array_1045185488[ii]);
        	};
        Assert.assertEquals("99[?] 100[?]", ((OriginalBinaryClause) (o_testNoSolutionExists_add27__6)).toString());
        Assert.assertEquals(199, ((int) (((OriginalBinaryClause) (o_testNoSolutionExists_add27__6)).hashCode())));
        clause.clear();
        IVecInt o_testNoSolutionExists_add27__8 = clause.push((-99));
        Assert.assertEquals("-99", ((VecInt) (o_testNoSolutionExists_add27__8)).toString());
        Assert.assertEquals(-99, ((int) (((VecInt) (o_testNoSolutionExists_add27__8)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExists_add27__8)).isEmpty());
        IConstr o_testNoSolutionExists_add27__10 = solver.addClause(clause);
        Assert.assertTrue(((UnitClause) (o_testNoSolutionExists_add27__10)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_testNoSolutionExists_add27__10)).getActivity())), 0.1);
        Assert.assertEquals("-99", ((UnitClause) (o_testNoSolutionExists_add27__10)).toString());
        clause.clear();
        IVecInt o_testNoSolutionExists_add27__12 = clause.push((-100));
        Assert.assertEquals("-100", ((VecInt) (o_testNoSolutionExists_add27__12)).toString());
        Assert.assertEquals(-100, ((int) (((VecInt) (o_testNoSolutionExists_add27__12)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExists_add27__12)).isEmpty());
        IConstr o_testNoSolutionExists_add27__14 = solver.addClause(clause);
        Assert.assertTrue(((UnitClause) (o_testNoSolutionExists_add27__14)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_testNoSolutionExists_add27__14)).getActivity())), 0.1);
        Assert.assertEquals("-100", ((UnitClause) (o_testNoSolutionExists_add27__14)).toString());
        clause.clear();
        this.solver.isSatisfiable();
        Assert.assertEquals("", ((VecInt) (clause)).toString());
        Assert.assertTrue(((VecInt) (clause)).isEmpty());
        Assert.assertEquals("", ((VecInt) (o_testNoSolutionExists_add27__3)).toString());
        Assert.assertTrue(((VecInt) (o_testNoSolutionExists_add27__3)).isEmpty());
        Assert.assertFalse(((OriginalBinaryClause) (o_testNoSolutionExists_add27__5)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testNoSolutionExists_add27__5)).getActivity())), 0.1);
        int[] array_705254390 = new int[]{198,200};
        	int[] array_934395863 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__5).getLits();
        	for(int ii = 0; ii <array_705254390.length; ii++) {
        		org.junit.Assert.assertEquals(array_705254390[ii], array_934395863[ii]);
        	};
        Assert.assertEquals("99[F] 100[F]", ((OriginalBinaryClause) (o_testNoSolutionExists_add27__5)).toString());
        Assert.assertEquals(199, ((int) (((OriginalBinaryClause) (o_testNoSolutionExists_add27__5)).hashCode())));
        Assert.assertFalse(((OriginalBinaryClause) (o_testNoSolutionExists_add27__6)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testNoSolutionExists_add27__6)).getActivity())), 0.1);
        int[] array_1517406316 = new int[]{198,200};
        	int[] array_362573722 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__6).getLits();
        	for(int ii = 0; ii <array_1517406316.length; ii++) {
        		org.junit.Assert.assertEquals(array_1517406316[ii], array_362573722[ii]);
        	};
        Assert.assertEquals("99[F] 100[F]", ((OriginalBinaryClause) (o_testNoSolutionExists_add27__6)).toString());
        Assert.assertEquals(199, ((int) (((OriginalBinaryClause) (o_testNoSolutionExists_add27__6)).hashCode())));
        Assert.assertEquals("", ((VecInt) (o_testNoSolutionExists_add27__8)).toString());
        Assert.assertTrue(((VecInt) (o_testNoSolutionExists_add27__8)).isEmpty());
        Assert.assertTrue(((UnitClause) (o_testNoSolutionExists_add27__10)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_testNoSolutionExists_add27__10)).getActivity())), 0.1);
        Assert.assertEquals("-99", ((UnitClause) (o_testNoSolutionExists_add27__10)).toString());
        Assert.assertEquals("", ((VecInt) (o_testNoSolutionExists_add27__12)).toString());
        Assert.assertTrue(((VecInt) (o_testNoSolutionExists_add27__12)).isEmpty());
        Assert.assertTrue(((UnitClause) (o_testNoSolutionExists_add27__14)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_testNoSolutionExists_add27__14)).getActivity())), 0.1);
        Assert.assertEquals("-100", ((UnitClause) (o_testNoSolutionExists_add27__14)).toString());
    }

    @Test(timeout = 30000)
    public void testNoSolutionExists_add30() throws Exception, ContradictionException, TimeoutException {
        IVecInt clause = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause)).toString());
        Assert.assertTrue(((VecInt) (clause)).isEmpty());
        IVecInt o_testNoSolutionExists_add30__3 = clause.push(100).push(99);
        Assert.assertEquals("100,99", ((VecInt) (o_testNoSolutionExists_add30__3)).toString());
        Assert.assertEquals(99, ((int) (((VecInt) (o_testNoSolutionExists_add30__3)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExists_add30__3)).isEmpty());
        IConstr o_testNoSolutionExists_add30__5 = solver.addClause(clause);
        Assert.assertFalse(((OriginalBinaryClause) (o_testNoSolutionExists_add30__5)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testNoSolutionExists_add30__5)).getActivity())), 0.1);
        int[] array_478132801 = new int[]{198,200};
        	int[] array_776558984 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add30__5).getLits();
        	for(int ii = 0; ii <array_478132801.length; ii++) {
        		org.junit.Assert.assertEquals(array_478132801[ii], array_776558984[ii]);
        	};
        Assert.assertEquals("99[?] 100[?]", ((OriginalBinaryClause) (o_testNoSolutionExists_add30__5)).toString());
        Assert.assertEquals(199, ((int) (((OriginalBinaryClause) (o_testNoSolutionExists_add30__5)).hashCode())));
        clause.clear();
        IVecInt o_testNoSolutionExists_add30__7 = clause.push((-99));
        Assert.assertEquals("-99", ((VecInt) (o_testNoSolutionExists_add30__7)).toString());
        Assert.assertEquals(-99, ((int) (((VecInt) (o_testNoSolutionExists_add30__7)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExists_add30__7)).isEmpty());
        IConstr o_testNoSolutionExists_add30__9 = solver.addClause(clause);
        Assert.assertTrue(((UnitClause) (o_testNoSolutionExists_add30__9)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_testNoSolutionExists_add30__9)).getActivity())), 0.1);
        Assert.assertEquals("-99", ((UnitClause) (o_testNoSolutionExists_add30__9)).toString());
        solver.addClause(clause);
        clause.clear();
        clause.push((-100));
        solver.addClause(clause);
        clause.clear();
        this.solver.isSatisfiable();
    }

    @Test(timeout = 30000)
    public void testNoSolutionExists_add35() throws Exception, ContradictionException, TimeoutException {
        IVecInt clause = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause)).toString());
        Assert.assertTrue(((VecInt) (clause)).isEmpty());
        IVecInt o_testNoSolutionExists_add35__3 = clause.push(100).push(99);
        Assert.assertEquals("100,99", ((VecInt) (o_testNoSolutionExists_add35__3)).toString());
        Assert.assertEquals(99, ((int) (((VecInt) (o_testNoSolutionExists_add35__3)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExists_add35__3)).isEmpty());
        IConstr o_testNoSolutionExists_add35__5 = solver.addClause(clause);
        Assert.assertFalse(((OriginalBinaryClause) (o_testNoSolutionExists_add35__5)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testNoSolutionExists_add35__5)).getActivity())), 0.1);
        int[] array_715956334 = new int[]{198,200};
        	int[] array_2139907821 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add35__5).getLits();
        	for(int ii = 0; ii <array_715956334.length; ii++) {
        		org.junit.Assert.assertEquals(array_715956334[ii], array_2139907821[ii]);
        	};
        Assert.assertEquals("99[?] 100[?]", ((OriginalBinaryClause) (o_testNoSolutionExists_add35__5)).toString());
        Assert.assertEquals(199, ((int) (((OriginalBinaryClause) (o_testNoSolutionExists_add35__5)).hashCode())));
        clause.clear();
        IVecInt o_testNoSolutionExists_add35__7 = clause.push((-99));
        Assert.assertEquals("-99", ((VecInt) (o_testNoSolutionExists_add35__7)).toString());
        Assert.assertEquals(-99, ((int) (((VecInt) (o_testNoSolutionExists_add35__7)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExists_add35__7)).isEmpty());
        IConstr o_testNoSolutionExists_add35__9 = solver.addClause(clause);
        Assert.assertTrue(((UnitClause) (o_testNoSolutionExists_add35__9)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_testNoSolutionExists_add35__9)).getActivity())), 0.1);
        Assert.assertEquals("-99", ((UnitClause) (o_testNoSolutionExists_add35__9)).toString());
        clause.clear();
        IVecInt o_testNoSolutionExists_add35__11 = clause.push((-100));
        Assert.assertEquals("-100", ((VecInt) (o_testNoSolutionExists_add35__11)).toString());
        Assert.assertEquals(-100, ((int) (((VecInt) (o_testNoSolutionExists_add35__11)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExists_add35__11)).isEmpty());
        IConstr o_testNoSolutionExists_add35__13 = solver.addClause(clause);
        Assert.assertTrue(((UnitClause) (o_testNoSolutionExists_add35__13)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_testNoSolutionExists_add35__13)).getActivity())), 0.1);
        Assert.assertEquals("-100", ((UnitClause) (o_testNoSolutionExists_add35__13)).toString());
        clause.clear();
        solver.isSatisfiable();
        this.solver.isSatisfiable();
        Assert.assertEquals("", ((VecInt) (clause)).toString());
        Assert.assertTrue(((VecInt) (clause)).isEmpty());
        Assert.assertEquals("", ((VecInt) (o_testNoSolutionExists_add35__3)).toString());
        Assert.assertTrue(((VecInt) (o_testNoSolutionExists_add35__3)).isEmpty());
        Assert.assertFalse(((OriginalBinaryClause) (o_testNoSolutionExists_add35__5)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testNoSolutionExists_add35__5)).getActivity())), 0.1);
        int[] array_161647393 = new int[]{198,200};
        	int[] array_1329652965 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add35__5).getLits();
        	for(int ii = 0; ii <array_161647393.length; ii++) {
        		org.junit.Assert.assertEquals(array_161647393[ii], array_1329652965[ii]);
        	};
        Assert.assertEquals("99[F] 100[F]", ((OriginalBinaryClause) (o_testNoSolutionExists_add35__5)).toString());
        Assert.assertEquals(199, ((int) (((OriginalBinaryClause) (o_testNoSolutionExists_add35__5)).hashCode())));
        Assert.assertEquals("", ((VecInt) (o_testNoSolutionExists_add35__7)).toString());
        Assert.assertTrue(((VecInt) (o_testNoSolutionExists_add35__7)).isEmpty());
        Assert.assertTrue(((UnitClause) (o_testNoSolutionExists_add35__9)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_testNoSolutionExists_add35__9)).getActivity())), 0.1);
        Assert.assertEquals("-99", ((UnitClause) (o_testNoSolutionExists_add35__9)).toString());
        Assert.assertEquals("", ((VecInt) (o_testNoSolutionExists_add35__11)).toString());
        Assert.assertTrue(((VecInt) (o_testNoSolutionExists_add35__11)).isEmpty());
        Assert.assertTrue(((UnitClause) (o_testNoSolutionExists_add35__13)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_testNoSolutionExists_add35__13)).getActivity())), 0.1);
        Assert.assertEquals("-100", ((UnitClause) (o_testNoSolutionExists_add35__13)).toString());
    }

    @Test(timeout = 30000)
    public void testNoSolutionExistslitNum2_failAssert1() throws Exception, ContradictionException, TimeoutException {
        try {
            IVecInt clause = new VecInt();
            clause.push(99).push(99);
            solver.addClause(clause);
            clause.clear();
            clause.push((-99));
            solver.addClause(clause);
            clause.clear();
            clause.push((-100));
            solver.addClause(clause);
            clause.clear();
            solver.isSatisfiable();
            org.junit.Assert.fail("testNoSolutionExistslitNum2 should have thrown ContradictionException");
        } catch (ContradictionException expected) {
            Assert.assertEquals("Creating Empty clause ?", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testNoSolutionExistslitNum3_failAssert2() throws Exception, ContradictionException, TimeoutException {
        try {
            IVecInt clause = new VecInt();
            clause.push(Integer.MAX_VALUE).push(99);
            solver.addClause(clause);
            clause.clear();
            clause.push((-99));
            solver.addClause(clause);
            clause.clear();
            clause.push((-100));
            solver.addClause(clause);
            clause.clear();
            solver.isSatisfiable();
            org.junit.Assert.fail("testNoSolutionExistslitNum3 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testNoSolutionExistslitNum5_failAssert4() throws Exception, ContradictionException, TimeoutException {
        try {
            IVecInt clause = new VecInt();
            clause.push(0).push(99);
            solver.addClause(clause);
            clause.clear();
            clause.push((-99));
            solver.addClause(clause);
            clause.clear();
            clause.push((-100));
            solver.addClause(clause);
            clause.clear();
            solver.isSatisfiable();
            org.junit.Assert.fail("testNoSolutionExistslitNum5 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testNoSolutionExistslitNum7_failAssert5() throws Exception, ContradictionException, TimeoutException {
        try {
            IVecInt clause = new VecInt();
            clause.push(100).push(100);
            solver.addClause(clause);
            clause.clear();
            clause.push((-99));
            solver.addClause(clause);
            clause.clear();
            clause.push((-100));
            solver.addClause(clause);
            clause.clear();
            solver.isSatisfiable();
            org.junit.Assert.fail("testNoSolutionExistslitNum7 should have thrown ContradictionException");
        } catch (ContradictionException expected) {
            Assert.assertEquals("Creating Empty clause ?", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testNoSolutionExistslitNum10_failAssert7() throws Exception, ContradictionException, TimeoutException {
        try {
            IVecInt clause = new VecInt();
            clause.push(100).push(Integer.MIN_VALUE);
            solver.addClause(clause);
            clause.clear();
            clause.push((-99));
            solver.addClause(clause);
            clause.clear();
            clause.push((-100));
            solver.addClause(clause);
            clause.clear();
            solver.isSatisfiable();
            org.junit.Assert.fail("testNoSolutionExistslitNum10 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-2147483648", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testNoSolutionExistslitNum21_failAssert12() throws Exception, ContradictionException, TimeoutException {
        try {
            IVecInt clause = new VecInt();
            clause.push(100).push(99);
            solver.addClause(clause);
            clause.clear();
            clause.push((-99));
            solver.addClause(clause);
            clause.clear();
            clause.push((-(Integer.MAX_VALUE)));
            solver.addClause(clause);
            clause.clear();
            solver.isSatisfiable();
            org.junit.Assert.fail("testNoSolutionExistslitNum21 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testNoSolutionExistslitNum23_failAssert14() throws Exception, ContradictionException, TimeoutException {
        try {
            IVecInt clause = new VecInt();
            clause.push(100).push(99);
            solver.addClause(clause);
            clause.clear();
            clause.push((-99));
            solver.addClause(clause);
            clause.clear();
            clause.push((-0));
            solver.addClause(clause);
            clause.clear();
            solver.isSatisfiable();
            org.junit.Assert.fail("testNoSolutionExistslitNum23 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testNoSolutionExists_add27_add967() throws Exception, ContradictionException, TimeoutException {
        IVecInt clause = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause)).toString());
        Assert.assertTrue(((VecInt) (clause)).isEmpty());
        IVecInt o_testNoSolutionExists_add27__3 = clause.push(100).push(99);
        Assert.assertEquals("100,99", ((VecInt) (o_testNoSolutionExists_add27__3)).toString());
        Assert.assertEquals(99, ((int) (((VecInt) (o_testNoSolutionExists_add27__3)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExists_add27__3)).isEmpty());
        IConstr o_testNoSolutionExists_add27__5 = this.solver.addClause(clause);
        int[] array_473135604 = new int[]{198,200};
        	int[] array_579487939 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__5).getLits();
        	for(int ii = 0; ii <array_473135604.length; ii++) {
        		org.junit.Assert.assertEquals(array_473135604[ii], array_579487939[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_testNoSolutionExists_add27__5)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testNoSolutionExists_add27__5)).getActivity())), 0.1);
        Assert.assertEquals("99[?] 100[?]", ((OriginalBinaryClause) (o_testNoSolutionExists_add27__5)).toString());
        Assert.assertEquals(199, ((int) (((OriginalBinaryClause) (o_testNoSolutionExists_add27__5)).hashCode())));
        int[] array_710729714 = new int[]{198,200};
        	int[] array_418055333 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__5).getLits();
        	for(int ii = 0; ii <array_710729714.length; ii++) {
        		org.junit.Assert.assertEquals(array_710729714[ii], array_418055333[ii]);
        	};
        IConstr o_testNoSolutionExists_add27__6 = this.solver.addClause(clause);
        int[] array_1884141543 = new int[]{198,200};
        	int[] array_677604576 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__6).getLits();
        	for(int ii = 0; ii <array_1884141543.length; ii++) {
        		org.junit.Assert.assertEquals(array_1884141543[ii], array_677604576[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_testNoSolutionExists_add27__6)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testNoSolutionExists_add27__6)).getActivity())), 0.1);
        Assert.assertEquals("99[?] 100[?]", ((OriginalBinaryClause) (o_testNoSolutionExists_add27__6)).toString());
        Assert.assertEquals(199, ((int) (((OriginalBinaryClause) (o_testNoSolutionExists_add27__6)).hashCode())));
        int[] array_221006639 = new int[]{198,200};
        	int[] array_1045185488 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__6).getLits();
        	for(int ii = 0; ii <array_221006639.length; ii++) {
        		org.junit.Assert.assertEquals(array_221006639[ii], array_1045185488[ii]);
        	};
        clause.clear();
        IVecInt o_testNoSolutionExists_add27__8 = clause.push((-99));
        Assert.assertEquals("-99", ((VecInt) (o_testNoSolutionExists_add27__8)).toString());
        Assert.assertEquals(-99, ((int) (((VecInt) (o_testNoSolutionExists_add27__8)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExists_add27__8)).isEmpty());
        IConstr o_testNoSolutionExists_add27__10 = this.solver.addClause(clause);
        Assert.assertTrue(((UnitClause) (o_testNoSolutionExists_add27__10)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_testNoSolutionExists_add27__10)).getActivity())), 0.1);
        Assert.assertEquals("-99", ((UnitClause) (o_testNoSolutionExists_add27__10)).toString());
        clause.clear();
        IVecInt o_testNoSolutionExists_add27__12 = clause.push((-100));
        Assert.assertEquals("-100", ((VecInt) (o_testNoSolutionExists_add27__12)).toString());
        Assert.assertEquals(-100, ((int) (((VecInt) (o_testNoSolutionExists_add27__12)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExists_add27__12)).isEmpty());
        IConstr o_testNoSolutionExists_add27__14 = this.solver.addClause(clause);
        Assert.assertTrue(((UnitClause) (o_testNoSolutionExists_add27__14)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_testNoSolutionExists_add27__14)).getActivity())), 0.1);
        Assert.assertEquals("-100", ((UnitClause) (o_testNoSolutionExists_add27__14)).toString());
        clause.clear();
        this.solver.isSatisfiable();
        int[] array_705254390 = new int[]{198,200};
        	int[] array_934395863 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__5).getLits();
        	for(int ii = 0; ii <array_705254390.length; ii++) {
        		org.junit.Assert.assertEquals(array_705254390[ii], array_934395863[ii]);
        	};
        ((OriginalBinaryClause) (o_testNoSolutionExists_add27__6)).isSatisfied();
        int[] array_1517406316 = new int[]{198,200};
        	int[] array_362573722 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__6).getLits();
        	for(int ii = 0; ii <array_1517406316.length; ii++) {
        		org.junit.Assert.assertEquals(array_1517406316[ii], array_362573722[ii]);
        	};
        Assert.assertEquals("", ((VecInt) (clause)).toString());
        Assert.assertTrue(((VecInt) (clause)).isEmpty());
        Assert.assertEquals("", ((VecInt) (o_testNoSolutionExists_add27__3)).toString());
        Assert.assertTrue(((VecInt) (o_testNoSolutionExists_add27__3)).isEmpty());
        int[] array_1760617803 = new int[]{198,200};
        	int[] array_1073115312 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__5).getLits();
        	for(int ii = 0; ii <array_1760617803.length; ii++) {
        		org.junit.Assert.assertEquals(array_1760617803[ii], array_1073115312[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_testNoSolutionExists_add27__5)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testNoSolutionExists_add27__5)).getActivity())), 0.1);
        Assert.assertEquals("99[F] 100[F]", ((OriginalBinaryClause) (o_testNoSolutionExists_add27__5)).toString());
        Assert.assertEquals(199, ((int) (((OriginalBinaryClause) (o_testNoSolutionExists_add27__5)).hashCode())));
        int[] array_23528505 = new int[]{198,200};
        	int[] array_1960950195 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__6).getLits();
        	for(int ii = 0; ii <array_23528505.length; ii++) {
        		org.junit.Assert.assertEquals(array_23528505[ii], array_1960950195[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_testNoSolutionExists_add27__6)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testNoSolutionExists_add27__6)).getActivity())), 0.1);
        Assert.assertEquals("99[F] 100[F]", ((OriginalBinaryClause) (o_testNoSolutionExists_add27__6)).toString());
        Assert.assertEquals(199, ((int) (((OriginalBinaryClause) (o_testNoSolutionExists_add27__6)).hashCode())));
        Assert.assertEquals("", ((VecInt) (o_testNoSolutionExists_add27__8)).toString());
        Assert.assertTrue(((VecInt) (o_testNoSolutionExists_add27__8)).isEmpty());
        Assert.assertTrue(((UnitClause) (o_testNoSolutionExists_add27__10)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_testNoSolutionExists_add27__10)).getActivity())), 0.1);
        Assert.assertEquals("-99", ((UnitClause) (o_testNoSolutionExists_add27__10)).toString());
        Assert.assertEquals("", ((VecInt) (o_testNoSolutionExists_add27__12)).toString());
        Assert.assertTrue(((VecInt) (o_testNoSolutionExists_add27__12)).isEmpty());
        Assert.assertTrue(((UnitClause) (o_testNoSolutionExists_add27__14)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_testNoSolutionExists_add27__14)).getActivity())), 0.1);
        Assert.assertEquals("-100", ((UnitClause) (o_testNoSolutionExists_add27__14)).toString());
    }

    @Test(timeout = 30000)
    public void testNoSolutionExists_add27_add895() throws Exception, ContradictionException, TimeoutException {
        IVecInt clause = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause)).toString());
        Assert.assertTrue(((VecInt) (clause)).isEmpty());
        IVecInt o_testNoSolutionExists_add27__3 = clause.push(100).push(99);
        Assert.assertEquals("100,99", ((VecInt) (o_testNoSolutionExists_add27__3)).toString());
        Assert.assertEquals(99, ((int) (((VecInt) (o_testNoSolutionExists_add27__3)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExists_add27__3)).isEmpty());
        IConstr o_testNoSolutionExists_add27__5 = this.solver.addClause(clause);
        int[] array_768733878 = new int[]{198,200};
        	int[] array_965497076 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__5).getLits();
        	for(int ii = 0; ii <array_768733878.length; ii++) {
        		org.junit.Assert.assertEquals(array_768733878[ii], array_965497076[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_testNoSolutionExists_add27__5)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testNoSolutionExists_add27__5)).getActivity())), 0.1);
        Assert.assertEquals("99[?] 100[?]", ((OriginalBinaryClause) (o_testNoSolutionExists_add27__5)).toString());
        Assert.assertEquals(199, ((int) (((OriginalBinaryClause) (o_testNoSolutionExists_add27__5)).hashCode())));
        ((OriginalBinaryClause) (o_testNoSolutionExists_add27__5)).isSatisfied();
        int[] array_710729714 = new int[]{198,200};
        	int[] array_418055333 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__5).getLits();
        	for(int ii = 0; ii <array_710729714.length; ii++) {
        		org.junit.Assert.assertEquals(array_710729714[ii], array_418055333[ii]);
        	};
        IConstr o_testNoSolutionExists_add27__6 = this.solver.addClause(clause);
        int[] array_831880648 = new int[]{198,200};
        	int[] array_845241424 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__6).getLits();
        	for(int ii = 0; ii <array_831880648.length; ii++) {
        		org.junit.Assert.assertEquals(array_831880648[ii], array_845241424[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_testNoSolutionExists_add27__6)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testNoSolutionExists_add27__6)).getActivity())), 0.1);
        Assert.assertEquals("99[?] 100[?]", ((OriginalBinaryClause) (o_testNoSolutionExists_add27__6)).toString());
        Assert.assertEquals(199, ((int) (((OriginalBinaryClause) (o_testNoSolutionExists_add27__6)).hashCode())));
        int[] array_221006639 = new int[]{198,200};
        	int[] array_1045185488 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__6).getLits();
        	for(int ii = 0; ii <array_221006639.length; ii++) {
        		org.junit.Assert.assertEquals(array_221006639[ii], array_1045185488[ii]);
        	};
        clause.clear();
        IVecInt o_testNoSolutionExists_add27__8 = clause.push((-99));
        Assert.assertEquals("-99", ((VecInt) (o_testNoSolutionExists_add27__8)).toString());
        Assert.assertEquals(-99, ((int) (((VecInt) (o_testNoSolutionExists_add27__8)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExists_add27__8)).isEmpty());
        IConstr o_testNoSolutionExists_add27__10 = this.solver.addClause(clause);
        Assert.assertTrue(((UnitClause) (o_testNoSolutionExists_add27__10)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_testNoSolutionExists_add27__10)).getActivity())), 0.1);
        Assert.assertEquals("-99", ((UnitClause) (o_testNoSolutionExists_add27__10)).toString());
        clause.clear();
        IVecInt o_testNoSolutionExists_add27__12 = clause.push((-100));
        Assert.assertEquals("-100", ((VecInt) (o_testNoSolutionExists_add27__12)).toString());
        Assert.assertEquals(-100, ((int) (((VecInt) (o_testNoSolutionExists_add27__12)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExists_add27__12)).isEmpty());
        IConstr o_testNoSolutionExists_add27__14 = this.solver.addClause(clause);
        Assert.assertTrue(((UnitClause) (o_testNoSolutionExists_add27__14)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_testNoSolutionExists_add27__14)).getActivity())), 0.1);
        Assert.assertEquals("-100", ((UnitClause) (o_testNoSolutionExists_add27__14)).toString());
        clause.clear();
        this.solver.isSatisfiable();
        int[] array_705254390 = new int[]{198,200};
        	int[] array_934395863 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__5).getLits();
        	for(int ii = 0; ii <array_705254390.length; ii++) {
        		org.junit.Assert.assertEquals(array_705254390[ii], array_934395863[ii]);
        	};
        int[] array_1517406316 = new int[]{198,200};
        	int[] array_362573722 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__6).getLits();
        	for(int ii = 0; ii <array_1517406316.length; ii++) {
        		org.junit.Assert.assertEquals(array_1517406316[ii], array_362573722[ii]);
        	};
        Assert.assertEquals("", ((VecInt) (clause)).toString());
        Assert.assertTrue(((VecInt) (clause)).isEmpty());
        Assert.assertEquals("", ((VecInt) (o_testNoSolutionExists_add27__3)).toString());
        Assert.assertTrue(((VecInt) (o_testNoSolutionExists_add27__3)).isEmpty());
        int[] array_797947727 = new int[]{198,200};
        	int[] array_839241703 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__5).getLits();
        	for(int ii = 0; ii <array_797947727.length; ii++) {
        		org.junit.Assert.assertEquals(array_797947727[ii], array_839241703[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_testNoSolutionExists_add27__5)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testNoSolutionExists_add27__5)).getActivity())), 0.1);
        Assert.assertEquals("99[F] 100[F]", ((OriginalBinaryClause) (o_testNoSolutionExists_add27__5)).toString());
        Assert.assertEquals(199, ((int) (((OriginalBinaryClause) (o_testNoSolutionExists_add27__5)).hashCode())));
        int[] array_1920258044 = new int[]{198,200};
        	int[] array_1054826861 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__6).getLits();
        	for(int ii = 0; ii <array_1920258044.length; ii++) {
        		org.junit.Assert.assertEquals(array_1920258044[ii], array_1054826861[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_testNoSolutionExists_add27__6)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testNoSolutionExists_add27__6)).getActivity())), 0.1);
        Assert.assertEquals("99[F] 100[F]", ((OriginalBinaryClause) (o_testNoSolutionExists_add27__6)).toString());
        Assert.assertEquals(199, ((int) (((OriginalBinaryClause) (o_testNoSolutionExists_add27__6)).hashCode())));
        Assert.assertEquals("", ((VecInt) (o_testNoSolutionExists_add27__8)).toString());
        Assert.assertTrue(((VecInt) (o_testNoSolutionExists_add27__8)).isEmpty());
        Assert.assertTrue(((UnitClause) (o_testNoSolutionExists_add27__10)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_testNoSolutionExists_add27__10)).getActivity())), 0.1);
        Assert.assertEquals("-99", ((UnitClause) (o_testNoSolutionExists_add27__10)).toString());
        Assert.assertEquals("", ((VecInt) (o_testNoSolutionExists_add27__12)).toString());
        Assert.assertTrue(((VecInt) (o_testNoSolutionExists_add27__12)).isEmpty());
        Assert.assertTrue(((UnitClause) (o_testNoSolutionExists_add27__14)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_testNoSolutionExists_add27__14)).getActivity())), 0.1);
        Assert.assertEquals("-100", ((UnitClause) (o_testNoSolutionExists_add27__14)).toString());
    }

    @Test(timeout = 30000)
    public void testNoSolutionExistslitNum2_failAssert1litNum174_failAssert15() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                IVecInt clause = new VecInt();
                clause.push(99).push(99);
                this.solver.addClause(clause);
                clause.clear();
                clause.push((-99));
                this.solver.addClause(clause);
                clause.clear();
                clause.push((-0));
                this.solver.addClause(clause);
                clause.clear();
                this.solver.isSatisfiable();
                org.junit.Assert.fail("testNoSolutionExistslitNum2 should have thrown ContradictionException");
            }
            org.junit.Assert.fail("testNoSolutionExistslitNum2_failAssert1litNum174 should have thrown ContradictionException");
        } catch (ContradictionException expected) {
            Assert.assertEquals("Creating Empty clause ?", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testNoSolutionExistslitNum2_failAssert1litNum138_failAssert16() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                IVecInt clause = new VecInt();
                clause.push(99).push(0);
                this.solver.addClause(clause);
                clause.clear();
                clause.push((-99));
                this.solver.addClause(clause);
                clause.clear();
                clause.push((-100));
                this.solver.addClause(clause);
                clause.clear();
                this.solver.isSatisfiable();
                org.junit.Assert.fail("testNoSolutionExistslitNum2 should have thrown ContradictionException");
            }
            org.junit.Assert.fail("testNoSolutionExistslitNum2_failAssert1litNum138 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testNoSolutionExistslitNum2_failAssert1litNum167_failAssert17() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                IVecInt clause = new VecInt();
                clause.push(99).push(99);
                this.solver.addClause(clause);
                clause.clear();
                clause.push((-0));
                this.solver.addClause(clause);
                clause.clear();
                clause.push((-100));
                this.solver.addClause(clause);
                clause.clear();
                this.solver.isSatisfiable();
                org.junit.Assert.fail("testNoSolutionExistslitNum2 should have thrown ContradictionException");
            }
            org.junit.Assert.fail("testNoSolutionExistslitNum2_failAssert1litNum167 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testNoSolutionExistslitNum7_failAssert5litNum330_failAssert19() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                IVecInt clause = new VecInt();
                clause.push(100).push(100);
                this.solver.addClause(clause);
                clause.clear();
                clause.push((-99));
                this.solver.addClause(clause);
                clause.clear();
                clause.push((-0));
                this.solver.addClause(clause);
                clause.clear();
                this.solver.isSatisfiable();
                org.junit.Assert.fail("testNoSolutionExistslitNum7 should have thrown ContradictionException");
            }
            org.junit.Assert.fail("testNoSolutionExistslitNum7_failAssert5litNum330 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testNoSolutionExistslitNum7_failAssert5litNum314_failAssert22() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                IVecInt clause = new VecInt();
                clause.push(100).push(100);
                this.solver.addClause(clause);
                clause.clear();
                clause.push((-98));
                this.solver.addClause(clause);
                clause.clear();
                clause.push((-100));
                this.solver.addClause(clause);
                clause.clear();
                this.solver.isSatisfiable();
                org.junit.Assert.fail("testNoSolutionExistslitNum7 should have thrown ContradictionException");
            }
            org.junit.Assert.fail("testNoSolutionExistslitNum7_failAssert5litNum314 should have thrown ContradictionException");
        } catch (ContradictionException expected) {
            Assert.assertEquals("Creating Empty clause ?", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testNoSolutionExistslitNum3_failAssert2litNum295_failAssert24() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                IVecInt clause = new VecInt();
                clause.push(Integer.MAX_VALUE).push(99);
                this.solver.addClause(clause);
                clause.clear();
                clause.push((-99));
                this.solver.addClause(clause);
                clause.clear();
                clause.push((-0));
                this.solver.addClause(clause);
                clause.clear();
                this.solver.isSatisfiable();
                org.junit.Assert.fail("testNoSolutionExistslitNum3 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testNoSolutionExistslitNum3_failAssert2litNum295 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testNoSolutionExistslitNum21_failAssert12litNum231_failAssert46() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                IVecInt clause = new VecInt();
                clause.push(101).push(99);
                this.solver.addClause(clause);
                clause.clear();
                clause.push((-99));
                this.solver.addClause(clause);
                clause.clear();
                clause.push((-(Integer.MAX_VALUE)));
                this.solver.addClause(clause);
                clause.clear();
                this.solver.isSatisfiable();
                org.junit.Assert.fail("testNoSolutionExistslitNum21 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testNoSolutionExistslitNum21_failAssert12litNum231 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testNoSolutionExistslitNum21_failAssert12litNum254_failAssert47() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                IVecInt clause = new VecInt();
                clause.push(100).push(98);
                this.solver.addClause(clause);
                clause.clear();
                clause.push((-99));
                this.solver.addClause(clause);
                clause.clear();
                clause.push((-(Integer.MAX_VALUE)));
                this.solver.addClause(clause);
                clause.clear();
                this.solver.isSatisfiable();
                org.junit.Assert.fail("testNoSolutionExistslitNum21 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testNoSolutionExistslitNum21_failAssert12litNum254 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testNoSolutionExistslitNum21_failAssert12litNum251_failAssert49() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                IVecInt clause = new VecInt();
                clause.push(100).push(100);
                this.solver.addClause(clause);
                clause.clear();
                clause.push((-99));
                this.solver.addClause(clause);
                clause.clear();
                clause.push((-(Integer.MAX_VALUE)));
                this.solver.addClause(clause);
                clause.clear();
                this.solver.isSatisfiable();
                org.junit.Assert.fail("testNoSolutionExistslitNum21 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testNoSolutionExistslitNum21_failAssert12litNum251 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testNoSolutionExistslitNum21_failAssert12litNum263_failAssert53() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                IVecInt clause = new VecInt();
                clause.push(100).push(31446627);
                this.solver.addClause(clause);
                clause.clear();
                clause.push((-99));
                this.solver.addClause(clause);
                clause.clear();
                clause.push((-(Integer.MAX_VALUE)));
                this.solver.addClause(clause);
                clause.clear();
                this.solver.isSatisfiable();
                org.junit.Assert.fail("testNoSolutionExistslitNum21 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testNoSolutionExistslitNum21_failAssert12litNum263 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testNoSolutionExistslitNum10_failAssert7litNum127_failAssert72() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                IVecInt clause = new VecInt();
                clause.push(101).push(Integer.MIN_VALUE);
                this.solver.addClause(clause);
                clause.clear();
                clause.push((-99));
                this.solver.addClause(clause);
                clause.clear();
                clause.push((-100));
                this.solver.addClause(clause);
                clause.clear();
                this.solver.isSatisfiable();
                org.junit.Assert.fail("testNoSolutionExistslitNum10 should have thrown ArrayIndexOutOfBoundsException");
            }
            org.junit.Assert.fail("testNoSolutionExistslitNum10_failAssert7litNum127 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-2147483648", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testNoSolutionExistslitNum2_failAssert1litNum146_failAssert97() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                IVecInt clause = new VecInt();
                clause.push(99).push(99);
                this.solver.addClause(clause);
                clause.clear();
                clause.push((-(Integer.MIN_VALUE)));
                this.solver.addClause(clause);
                clause.clear();
                clause.push((-100));
                this.solver.addClause(clause);
                clause.clear();
                this.solver.isSatisfiable();
                org.junit.Assert.fail("testNoSolutionExistslitNum2 should have thrown ContradictionException");
            }
            org.junit.Assert.fail("testNoSolutionExistslitNum2_failAssert1litNum146 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testNoSolutionExistslitNum23_failAssert14_add211_failAssert100() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                IVecInt clause = new VecInt();
                clause.push(100).push(99);
                this.solver.addClause(clause);
                clause.clear();
                clause.push((-99));
                this.solver.addClause(clause);
                clause.clear();
                clause.clear();
                clause.push((-0));
                this.solver.addClause(clause);
                clause.clear();
                this.solver.isSatisfiable();
                org.junit.Assert.fail("testNoSolutionExistslitNum23 should have thrown IllegalArgumentException");
            }
            org.junit.Assert.fail("testNoSolutionExistslitNum23_failAssert14_add211 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testNoSolutionExistslitNum7_failAssert5litNum326_failAssert101() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                IVecInt clause = new VecInt();
                clause.push(100).push(100);
                this.solver.addClause(clause);
                clause.clear();
                clause.push((-99));
                this.solver.addClause(clause);
                clause.clear();
                clause.push((-(Integer.MAX_VALUE)));
                this.solver.addClause(clause);
                clause.clear();
                this.solver.isSatisfiable();
                org.junit.Assert.fail("testNoSolutionExistslitNum7 should have thrown ContradictionException");
            }
            org.junit.Assert.fail("testNoSolutionExistslitNum7_failAssert5litNum326 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testNoSolutionExistslitNum2_failAssert1_add189_failAssert118() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                IVecInt clause = new VecInt();
                clause.push(99).push(99);
                this.solver.addClause(clause);
                this.solver.addClause(clause);
                clause.clear();
                clause.push((-99));
                this.solver.addClause(clause);
                clause.clear();
                clause.push((-100));
                this.solver.addClause(clause);
                clause.clear();
                this.solver.isSatisfiable();
                org.junit.Assert.fail("testNoSolutionExistslitNum2 should have thrown ContradictionException");
            }
            org.junit.Assert.fail("testNoSolutionExistslitNum2_failAssert1_add189 should have thrown ContradictionException");
        } catch (ContradictionException expected) {
            Assert.assertEquals("Creating Empty clause ?", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testNoSolutionExistslitNum7_failAssert5_add341_failAssert120() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                IVecInt clause = new VecInt();
                clause.push(100).push(100);
                this.solver.addClause(clause);
                this.solver.addClause(clause);
                clause.clear();
                clause.push((-99));
                this.solver.addClause(clause);
                clause.clear();
                clause.push((-100));
                this.solver.addClause(clause);
                clause.clear();
                this.solver.isSatisfiable();
                org.junit.Assert.fail("testNoSolutionExistslitNum7 should have thrown ContradictionException");
            }
            org.junit.Assert.fail("testNoSolutionExistslitNum7_failAssert5_add341 should have thrown ContradictionException");
        } catch (ContradictionException expected) {
            Assert.assertEquals("Creating Empty clause ?", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testNoSolutionExistslitNum21_failAssert12_add297_failAssert164() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                IVecInt clause = new VecInt();
                clause.push(100).push(99);
                this.solver.addClause(clause);
                clause.clear();
                clause.push((-99));
                this.solver.addClause(clause);
                this.solver.addClause(clause);
                clause.clear();
                clause.push((-(Integer.MAX_VALUE)));
                this.solver.addClause(clause);
                clause.clear();
                this.solver.isSatisfiable();
                org.junit.Assert.fail("testNoSolutionExistslitNum21 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testNoSolutionExistslitNum21_failAssert12_add297 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testNoSolutionExistslitNum23_failAssert14_add209_failAssert168() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                IVecInt clause = new VecInt();
                clause.push(100).push(99);
                this.solver.addClause(clause);
                clause.clear();
                clause.push((-99));
                this.solver.addClause(clause);
                this.solver.addClause(clause);
                clause.clear();
                clause.push((-0));
                this.solver.addClause(clause);
                clause.clear();
                this.solver.isSatisfiable();
                org.junit.Assert.fail("testNoSolutionExistslitNum23 should have thrown IllegalArgumentException");
            }
            org.junit.Assert.fail("testNoSolutionExistslitNum23_failAssert14_add209 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testNoSolutionExists_add27_add895_add1889() throws Exception, ContradictionException, TimeoutException {
        IVecInt clause = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause)).toString());
        Assert.assertTrue(((VecInt) (clause)).isEmpty());
        IVecInt o_testNoSolutionExists_add27__3 = clause.push(100).push(99);
        Assert.assertEquals("100,99", ((VecInt) (o_testNoSolutionExists_add27__3)).toString());
        Assert.assertEquals(99, ((int) (((VecInt) (o_testNoSolutionExists_add27__3)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExists_add27__3)).isEmpty());
        IConstr o_testNoSolutionExists_add27__5 = this.solver.addClause(clause);
        int[] array_1553752628 = new int[]{198,200};
        	int[] array_941898802 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__5).getLits();
        	for(int ii = 0; ii <array_1553752628.length; ii++) {
        		org.junit.Assert.assertEquals(array_1553752628[ii], array_941898802[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_testNoSolutionExists_add27__5)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testNoSolutionExists_add27__5)).getActivity())), 0.1);
        Assert.assertEquals("99[?] 100[?]", ((OriginalBinaryClause) (o_testNoSolutionExists_add27__5)).toString());
        Assert.assertEquals(199, ((int) (((OriginalBinaryClause) (o_testNoSolutionExists_add27__5)).hashCode())));
        int[] array_768733878 = new int[]{198,200};
        	int[] array_965497076 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__5).getLits();
        	for(int ii = 0; ii <array_768733878.length; ii++) {
        		org.junit.Assert.assertEquals(array_768733878[ii], array_965497076[ii]);
        	};
        ((OriginalBinaryClause) (o_testNoSolutionExists_add27__5)).isSatisfied();
        int[] array_710729714 = new int[]{198,200};
        	int[] array_418055333 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__5).getLits();
        	for(int ii = 0; ii <array_710729714.length; ii++) {
        		org.junit.Assert.assertEquals(array_710729714[ii], array_418055333[ii]);
        	};
        IConstr o_testNoSolutionExists_add27__6 = this.solver.addClause(clause);
        int[] array_1794034100 = new int[]{198,200};
        	int[] array_1177382155 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__6).getLits();
        	for(int ii = 0; ii <array_1794034100.length; ii++) {
        		org.junit.Assert.assertEquals(array_1794034100[ii], array_1177382155[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_testNoSolutionExists_add27__6)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testNoSolutionExists_add27__6)).getActivity())), 0.1);
        Assert.assertEquals("99[?] 100[?]", ((OriginalBinaryClause) (o_testNoSolutionExists_add27__6)).toString());
        Assert.assertEquals(199, ((int) (((OriginalBinaryClause) (o_testNoSolutionExists_add27__6)).hashCode())));
        int[] array_831880648 = new int[]{198,200};
        	int[] array_845241424 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__6).getLits();
        	for(int ii = 0; ii <array_831880648.length; ii++) {
        		org.junit.Assert.assertEquals(array_831880648[ii], array_845241424[ii]);
        	};
        int[] array_221006639 = new int[]{198,200};
        	int[] array_1045185488 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__6).getLits();
        	for(int ii = 0; ii <array_221006639.length; ii++) {
        		org.junit.Assert.assertEquals(array_221006639[ii], array_1045185488[ii]);
        	};
        clause.clear();
        IVecInt o_testNoSolutionExists_add27__8 = clause.push((-99));
        Assert.assertEquals("-99", ((VecInt) (o_testNoSolutionExists_add27__8)).toString());
        Assert.assertEquals(-99, ((int) (((VecInt) (o_testNoSolutionExists_add27__8)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExists_add27__8)).isEmpty());
        IConstr o_testNoSolutionExists_add27__10 = this.solver.addClause(clause);
        Assert.assertTrue(((UnitClause) (o_testNoSolutionExists_add27__10)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_testNoSolutionExists_add27__10)).getActivity())), 0.1);
        Assert.assertEquals("-99", ((UnitClause) (o_testNoSolutionExists_add27__10)).toString());
        clause.clear();
        IVecInt o_testNoSolutionExists_add27__12 = clause.push((-100));
        Assert.assertEquals("-100", ((VecInt) (o_testNoSolutionExists_add27__12)).toString());
        Assert.assertEquals(-100, ((int) (((VecInt) (o_testNoSolutionExists_add27__12)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExists_add27__12)).isEmpty());
        IConstr o_testNoSolutionExists_add27__14 = this.solver.addClause(clause);
        Assert.assertTrue(((UnitClause) (o_testNoSolutionExists_add27__14)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_testNoSolutionExists_add27__14)).getActivity())), 0.1);
        Assert.assertEquals("-100", ((UnitClause) (o_testNoSolutionExists_add27__14)).toString());
        clause.clear();
        this.solver.isSatisfiable();
        int[] array_705254390 = new int[]{198,200};
        	int[] array_934395863 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__5).getLits();
        	for(int ii = 0; ii <array_705254390.length; ii++) {
        		org.junit.Assert.assertEquals(array_705254390[ii], array_934395863[ii]);
        	};
        int[] array_1517406316 = new int[]{198,200};
        	int[] array_362573722 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__6).getLits();
        	for(int ii = 0; ii <array_1517406316.length; ii++) {
        		org.junit.Assert.assertEquals(array_1517406316[ii], array_362573722[ii]);
        	};
        int[] array_797947727 = new int[]{198,200};
        	int[] array_839241703 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__5).getLits();
        	for(int ii = 0; ii <array_797947727.length; ii++) {
        		org.junit.Assert.assertEquals(array_797947727[ii], array_839241703[ii]);
        	};
        int[] array_1920258044 = new int[]{198,200};
        	int[] array_1054826861 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__6).getLits();
        	for(int ii = 0; ii <array_1920258044.length; ii++) {
        		org.junit.Assert.assertEquals(array_1920258044[ii], array_1054826861[ii]);
        	};
        ((OriginalBinaryClause) (o_testNoSolutionExists_add27__6)).isSatisfied();
        Assert.assertEquals("", ((VecInt) (clause)).toString());
        Assert.assertTrue(((VecInt) (clause)).isEmpty());
        Assert.assertEquals("", ((VecInt) (o_testNoSolutionExists_add27__3)).toString());
        Assert.assertTrue(((VecInt) (o_testNoSolutionExists_add27__3)).isEmpty());
        int[] array_830860305 = new int[]{198,200};
        	int[] array_1821905175 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__5).getLits();
        	for(int ii = 0; ii <array_830860305.length; ii++) {
        		org.junit.Assert.assertEquals(array_830860305[ii], array_1821905175[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_testNoSolutionExists_add27__5)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testNoSolutionExists_add27__5)).getActivity())), 0.1);
        Assert.assertEquals("99[F] 100[F]", ((OriginalBinaryClause) (o_testNoSolutionExists_add27__5)).toString());
        Assert.assertEquals(199, ((int) (((OriginalBinaryClause) (o_testNoSolutionExists_add27__5)).hashCode())));
        int[] array_1097965990 = new int[]{198,200};
        	int[] array_1718106486 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__6).getLits();
        	for(int ii = 0; ii <array_1097965990.length; ii++) {
        		org.junit.Assert.assertEquals(array_1097965990[ii], array_1718106486[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_testNoSolutionExists_add27__6)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testNoSolutionExists_add27__6)).getActivity())), 0.1);
        Assert.assertEquals("99[F] 100[F]", ((OriginalBinaryClause) (o_testNoSolutionExists_add27__6)).toString());
        Assert.assertEquals(199, ((int) (((OriginalBinaryClause) (o_testNoSolutionExists_add27__6)).hashCode())));
        Assert.assertEquals("", ((VecInt) (o_testNoSolutionExists_add27__8)).toString());
        Assert.assertTrue(((VecInt) (o_testNoSolutionExists_add27__8)).isEmpty());
        Assert.assertTrue(((UnitClause) (o_testNoSolutionExists_add27__10)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_testNoSolutionExists_add27__10)).getActivity())), 0.1);
        Assert.assertEquals("-99", ((UnitClause) (o_testNoSolutionExists_add27__10)).toString());
        Assert.assertEquals("", ((VecInt) (o_testNoSolutionExists_add27__12)).toString());
        Assert.assertTrue(((VecInt) (o_testNoSolutionExists_add27__12)).isEmpty());
        Assert.assertTrue(((UnitClause) (o_testNoSolutionExists_add27__14)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_testNoSolutionExists_add27__14)).getActivity())), 0.1);
        Assert.assertEquals("-100", ((UnitClause) (o_testNoSolutionExists_add27__14)).toString());
    }

    @Test(timeout = 30000)
    public void testNoSolutionExists_add27_add967_add1796() throws Exception, ContradictionException, TimeoutException {
        IVecInt clause = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause)).toString());
        Assert.assertTrue(((VecInt) (clause)).isEmpty());
        ((VecInt) (clause)).toString();
        IVecInt o_testNoSolutionExists_add27__3 = clause.push(100).push(99);
        Assert.assertEquals("100,99", ((VecInt) (o_testNoSolutionExists_add27__3)).toString());
        Assert.assertEquals(99, ((int) (((VecInt) (o_testNoSolutionExists_add27__3)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExists_add27__3)).isEmpty());
        IConstr o_testNoSolutionExists_add27__5 = this.solver.addClause(clause);
        int[] array_411048556 = new int[]{198,200};
        	int[] array_2045443968 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__5).getLits();
        	for(int ii = 0; ii <array_411048556.length; ii++) {
        		org.junit.Assert.assertEquals(array_411048556[ii], array_2045443968[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_testNoSolutionExists_add27__5)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testNoSolutionExists_add27__5)).getActivity())), 0.1);
        Assert.assertEquals("99[?] 100[?]", ((OriginalBinaryClause) (o_testNoSolutionExists_add27__5)).toString());
        Assert.assertEquals(199, ((int) (((OriginalBinaryClause) (o_testNoSolutionExists_add27__5)).hashCode())));
        int[] array_473135604 = new int[]{198,200};
        	int[] array_579487939 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__5).getLits();
        	for(int ii = 0; ii <array_473135604.length; ii++) {
        		org.junit.Assert.assertEquals(array_473135604[ii], array_579487939[ii]);
        	};
        int[] array_710729714 = new int[]{198,200};
        	int[] array_418055333 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__5).getLits();
        	for(int ii = 0; ii <array_710729714.length; ii++) {
        		org.junit.Assert.assertEquals(array_710729714[ii], array_418055333[ii]);
        	};
        IConstr o_testNoSolutionExists_add27__6 = this.solver.addClause(clause);
        int[] array_1684880193 = new int[]{198,200};
        	int[] array_1001709341 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__6).getLits();
        	for(int ii = 0; ii <array_1684880193.length; ii++) {
        		org.junit.Assert.assertEquals(array_1684880193[ii], array_1001709341[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_testNoSolutionExists_add27__6)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testNoSolutionExists_add27__6)).getActivity())), 0.1);
        Assert.assertEquals("99[?] 100[?]", ((OriginalBinaryClause) (o_testNoSolutionExists_add27__6)).toString());
        Assert.assertEquals(199, ((int) (((OriginalBinaryClause) (o_testNoSolutionExists_add27__6)).hashCode())));
        int[] array_1884141543 = new int[]{198,200};
        	int[] array_677604576 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__6).getLits();
        	for(int ii = 0; ii <array_1884141543.length; ii++) {
        		org.junit.Assert.assertEquals(array_1884141543[ii], array_677604576[ii]);
        	};
        int[] array_221006639 = new int[]{198,200};
        	int[] array_1045185488 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__6).getLits();
        	for(int ii = 0; ii <array_221006639.length; ii++) {
        		org.junit.Assert.assertEquals(array_221006639[ii], array_1045185488[ii]);
        	};
        clause.clear();
        IVecInt o_testNoSolutionExists_add27__8 = clause.push((-99));
        Assert.assertEquals("-99", ((VecInt) (o_testNoSolutionExists_add27__8)).toString());
        Assert.assertEquals(-99, ((int) (((VecInt) (o_testNoSolutionExists_add27__8)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExists_add27__8)).isEmpty());
        IConstr o_testNoSolutionExists_add27__10 = this.solver.addClause(clause);
        Assert.assertTrue(((UnitClause) (o_testNoSolutionExists_add27__10)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_testNoSolutionExists_add27__10)).getActivity())), 0.1);
        Assert.assertEquals("-99", ((UnitClause) (o_testNoSolutionExists_add27__10)).toString());
        clause.clear();
        IVecInt o_testNoSolutionExists_add27__12 = clause.push((-100));
        Assert.assertEquals("-100", ((VecInt) (o_testNoSolutionExists_add27__12)).toString());
        Assert.assertEquals(-100, ((int) (((VecInt) (o_testNoSolutionExists_add27__12)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExists_add27__12)).isEmpty());
        IConstr o_testNoSolutionExists_add27__14 = this.solver.addClause(clause);
        Assert.assertTrue(((UnitClause) (o_testNoSolutionExists_add27__14)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_testNoSolutionExists_add27__14)).getActivity())), 0.1);
        Assert.assertEquals("-100", ((UnitClause) (o_testNoSolutionExists_add27__14)).toString());
        clause.clear();
        this.solver.isSatisfiable();
        int[] array_705254390 = new int[]{198,200};
        	int[] array_934395863 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__5).getLits();
        	for(int ii = 0; ii <array_705254390.length; ii++) {
        		org.junit.Assert.assertEquals(array_705254390[ii], array_934395863[ii]);
        	};
        ((OriginalBinaryClause) (o_testNoSolutionExists_add27__6)).isSatisfied();
        int[] array_1517406316 = new int[]{198,200};
        	int[] array_362573722 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__6).getLits();
        	for(int ii = 0; ii <array_1517406316.length; ii++) {
        		org.junit.Assert.assertEquals(array_1517406316[ii], array_362573722[ii]);
        	};
        int[] array_1760617803 = new int[]{198,200};
        	int[] array_1073115312 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__5).getLits();
        	for(int ii = 0; ii <array_1760617803.length; ii++) {
        		org.junit.Assert.assertEquals(array_1760617803[ii], array_1073115312[ii]);
        	};
        int[] array_23528505 = new int[]{198,200};
        	int[] array_1960950195 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__6).getLits();
        	for(int ii = 0; ii <array_23528505.length; ii++) {
        		org.junit.Assert.assertEquals(array_23528505[ii], array_1960950195[ii]);
        	};
        Assert.assertEquals("", ((VecInt) (clause)).toString());
        Assert.assertTrue(((VecInt) (clause)).isEmpty());
        Assert.assertEquals("", ((VecInt) (o_testNoSolutionExists_add27__3)).toString());
        Assert.assertTrue(((VecInt) (o_testNoSolutionExists_add27__3)).isEmpty());
        int[] array_980101166 = new int[]{198,200};
        	int[] array_1548094317 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__5).getLits();
        	for(int ii = 0; ii <array_980101166.length; ii++) {
        		org.junit.Assert.assertEquals(array_980101166[ii], array_1548094317[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_testNoSolutionExists_add27__5)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testNoSolutionExists_add27__5)).getActivity())), 0.1);
        Assert.assertEquals("99[F] 100[F]", ((OriginalBinaryClause) (o_testNoSolutionExists_add27__5)).toString());
        Assert.assertEquals(199, ((int) (((OriginalBinaryClause) (o_testNoSolutionExists_add27__5)).hashCode())));
        int[] array_1532223203 = new int[]{198,200};
        	int[] array_149630311 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__6).getLits();
        	for(int ii = 0; ii <array_1532223203.length; ii++) {
        		org.junit.Assert.assertEquals(array_1532223203[ii], array_149630311[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_testNoSolutionExists_add27__6)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testNoSolutionExists_add27__6)).getActivity())), 0.1);
        Assert.assertEquals("99[F] 100[F]", ((OriginalBinaryClause) (o_testNoSolutionExists_add27__6)).toString());
        Assert.assertEquals(199, ((int) (((OriginalBinaryClause) (o_testNoSolutionExists_add27__6)).hashCode())));
        Assert.assertEquals("", ((VecInt) (o_testNoSolutionExists_add27__8)).toString());
        Assert.assertTrue(((VecInt) (o_testNoSolutionExists_add27__8)).isEmpty());
        Assert.assertTrue(((UnitClause) (o_testNoSolutionExists_add27__10)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_testNoSolutionExists_add27__10)).getActivity())), 0.1);
        Assert.assertEquals("-99", ((UnitClause) (o_testNoSolutionExists_add27__10)).toString());
        Assert.assertEquals("", ((VecInt) (o_testNoSolutionExists_add27__12)).toString());
        Assert.assertTrue(((VecInt) (o_testNoSolutionExists_add27__12)).isEmpty());
        Assert.assertTrue(((UnitClause) (o_testNoSolutionExists_add27__14)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_testNoSolutionExists_add27__14)).getActivity())), 0.1);
        Assert.assertEquals("-100", ((UnitClause) (o_testNoSolutionExists_add27__14)).toString());
    }

    @Test(timeout = 30000)
    public void testNoSolutionExists_add27_add895_add1844() throws Exception, ContradictionException, TimeoutException {
        IVecInt clause = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause)).toString());
        Assert.assertTrue(((VecInt) (clause)).isEmpty());
        IVecInt o_testNoSolutionExists_add27__3 = clause.push(100).push(99);
        Assert.assertEquals("100,99", ((VecInt) (o_testNoSolutionExists_add27__3)).toString());
        Assert.assertEquals(99, ((int) (((VecInt) (o_testNoSolutionExists_add27__3)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExists_add27__3)).isEmpty());
        IConstr o_testNoSolutionExists_add27__5 = this.solver.addClause(clause);
        int[] array_1365663434 = new int[]{198,200};
        	int[] array_613597612 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__5).getLits();
        	for(int ii = 0; ii <array_1365663434.length; ii++) {
        		org.junit.Assert.assertEquals(array_1365663434[ii], array_613597612[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_testNoSolutionExists_add27__5)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testNoSolutionExists_add27__5)).getActivity())), 0.1);
        Assert.assertEquals("99[?] 100[?]", ((OriginalBinaryClause) (o_testNoSolutionExists_add27__5)).toString());
        Assert.assertEquals(199, ((int) (((OriginalBinaryClause) (o_testNoSolutionExists_add27__5)).hashCode())));
        int[] array_768733878 = new int[]{198,200};
        	int[] array_965497076 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__5).getLits();
        	for(int ii = 0; ii <array_768733878.length; ii++) {
        		org.junit.Assert.assertEquals(array_768733878[ii], array_965497076[ii]);
        	};
        ((OriginalBinaryClause) (o_testNoSolutionExists_add27__5)).isSatisfied();
        int[] array_710729714 = new int[]{198,200};
        	int[] array_418055333 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__5).getLits();
        	for(int ii = 0; ii <array_710729714.length; ii++) {
        		org.junit.Assert.assertEquals(array_710729714[ii], array_418055333[ii]);
        	};
        IConstr o_testNoSolutionExists_add27__6 = this.solver.addClause(clause);
        int[] array_1248197255 = new int[]{198,200};
        	int[] array_604600082 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__6).getLits();
        	for(int ii = 0; ii <array_1248197255.length; ii++) {
        		org.junit.Assert.assertEquals(array_1248197255[ii], array_604600082[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_testNoSolutionExists_add27__6)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testNoSolutionExists_add27__6)).getActivity())), 0.1);
        Assert.assertEquals("99[?] 100[?]", ((OriginalBinaryClause) (o_testNoSolutionExists_add27__6)).toString());
        Assert.assertEquals(199, ((int) (((OriginalBinaryClause) (o_testNoSolutionExists_add27__6)).hashCode())));
        int[] array_831880648 = new int[]{198,200};
        	int[] array_845241424 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__6).getLits();
        	for(int ii = 0; ii <array_831880648.length; ii++) {
        		org.junit.Assert.assertEquals(array_831880648[ii], array_845241424[ii]);
        	};
        int[] array_221006639 = new int[]{198,200};
        	int[] array_1045185488 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__6).getLits();
        	for(int ii = 0; ii <array_221006639.length; ii++) {
        		org.junit.Assert.assertEquals(array_221006639[ii], array_1045185488[ii]);
        	};
        clause.clear();
        IVecInt o_testNoSolutionExists_add27__8 = clause.push((-99));
        Assert.assertEquals("-99", ((VecInt) (o_testNoSolutionExists_add27__8)).toString());
        Assert.assertEquals(-99, ((int) (((VecInt) (o_testNoSolutionExists_add27__8)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExists_add27__8)).isEmpty());
        IConstr o_testNoSolutionExists_add27_add895_add1844__27 = this.solver.addClause(clause);
        Assert.assertTrue(((UnitClause) (o_testNoSolutionExists_add27_add895_add1844__27)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_testNoSolutionExists_add27_add895_add1844__27)).getActivity())), 0.1);
        Assert.assertEquals("-99", ((UnitClause) (o_testNoSolutionExists_add27_add895_add1844__27)).toString());
        IConstr o_testNoSolutionExists_add27__10 = this.solver.addClause(clause);
        clause.clear();
        IVecInt o_testNoSolutionExists_add27__12 = clause.push((-100));
        IConstr o_testNoSolutionExists_add27__14 = this.solver.addClause(clause);
        clause.clear();
        this.solver.isSatisfiable();
        int[] array_705254390 = new int[]{198,200};
        	int[] array_934395863 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__5).getLits();
        	for(int ii = 0; ii <array_705254390.length; ii++) {
        		org.junit.Assert.assertEquals(array_705254390[ii], array_934395863[ii]);
        	};
        int[] array_1517406316 = new int[]{198,200};
        	int[] array_362573722 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__6).getLits();
        	for(int ii = 0; ii <array_1517406316.length; ii++) {
        		org.junit.Assert.assertEquals(array_1517406316[ii], array_362573722[ii]);
        	};
        int[] array_797947727 = new int[]{198,200};
        	int[] array_839241703 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__5).getLits();
        	for(int ii = 0; ii <array_797947727.length; ii++) {
        		org.junit.Assert.assertEquals(array_797947727[ii], array_839241703[ii]);
        	};
        int[] array_1920258044 = new int[]{198,200};
        	int[] array_1054826861 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__6).getLits();
        	for(int ii = 0; ii <array_1920258044.length; ii++) {
        		org.junit.Assert.assertEquals(array_1920258044[ii], array_1054826861[ii]);
        	};
    }

    @Test(timeout = 30000)
    public void testNoSolutionExists_add27_add895_add1871() throws Exception, ContradictionException, TimeoutException {
        IVecInt clause = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause)).toString());
        Assert.assertTrue(((VecInt) (clause)).isEmpty());
        IVecInt o_testNoSolutionExists_add27__3 = clause.push(100).push(99);
        Assert.assertEquals("100,99", ((VecInt) (o_testNoSolutionExists_add27__3)).toString());
        Assert.assertEquals(99, ((int) (((VecInt) (o_testNoSolutionExists_add27__3)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExists_add27__3)).isEmpty());
        IConstr o_testNoSolutionExists_add27__5 = this.solver.addClause(clause);
        int[] array_1710226138 = new int[]{198,200};
        	int[] array_24742384 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__5).getLits();
        	for(int ii = 0; ii <array_1710226138.length; ii++) {
        		org.junit.Assert.assertEquals(array_1710226138[ii], array_24742384[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_testNoSolutionExists_add27__5)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testNoSolutionExists_add27__5)).getActivity())), 0.1);
        Assert.assertEquals("99[?] 100[?]", ((OriginalBinaryClause) (o_testNoSolutionExists_add27__5)).toString());
        Assert.assertEquals(199, ((int) (((OriginalBinaryClause) (o_testNoSolutionExists_add27__5)).hashCode())));
        int[] array_768733878 = new int[]{198,200};
        	int[] array_965497076 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__5).getLits();
        	for(int ii = 0; ii <array_768733878.length; ii++) {
        		org.junit.Assert.assertEquals(array_768733878[ii], array_965497076[ii]);
        	};
        ((OriginalBinaryClause) (o_testNoSolutionExists_add27__5)).isSatisfied();
        int[] array_710729714 = new int[]{198,200};
        	int[] array_418055333 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__5).getLits();
        	for(int ii = 0; ii <array_710729714.length; ii++) {
        		org.junit.Assert.assertEquals(array_710729714[ii], array_418055333[ii]);
        	};
        IConstr o_testNoSolutionExists_add27__6 = this.solver.addClause(clause);
        int[] array_726566497 = new int[]{198,200};
        	int[] array_1764739549 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__6).getLits();
        	for(int ii = 0; ii <array_726566497.length; ii++) {
        		org.junit.Assert.assertEquals(array_726566497[ii], array_1764739549[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_testNoSolutionExists_add27__6)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testNoSolutionExists_add27__6)).getActivity())), 0.1);
        Assert.assertEquals("99[?] 100[?]", ((OriginalBinaryClause) (o_testNoSolutionExists_add27__6)).toString());
        Assert.assertEquals(199, ((int) (((OriginalBinaryClause) (o_testNoSolutionExists_add27__6)).hashCode())));
        int[] array_831880648 = new int[]{198,200};
        	int[] array_845241424 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__6).getLits();
        	for(int ii = 0; ii <array_831880648.length; ii++) {
        		org.junit.Assert.assertEquals(array_831880648[ii], array_845241424[ii]);
        	};
        int[] array_221006639 = new int[]{198,200};
        	int[] array_1045185488 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__6).getLits();
        	for(int ii = 0; ii <array_221006639.length; ii++) {
        		org.junit.Assert.assertEquals(array_221006639[ii], array_1045185488[ii]);
        	};
        clause.clear();
        IVecInt o_testNoSolutionExists_add27__8 = clause.push((-99));
        Assert.assertEquals("-99", ((VecInt) (o_testNoSolutionExists_add27__8)).toString());
        Assert.assertEquals(-99, ((int) (((VecInt) (o_testNoSolutionExists_add27__8)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExists_add27__8)).isEmpty());
        IConstr o_testNoSolutionExists_add27__10 = this.solver.addClause(clause);
        Assert.assertTrue(((UnitClause) (o_testNoSolutionExists_add27__10)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_testNoSolutionExists_add27__10)).getActivity())), 0.1);
        Assert.assertEquals("-99", ((UnitClause) (o_testNoSolutionExists_add27__10)).toString());
        clause.clear();
        IVecInt o_testNoSolutionExists_add27__12 = clause.push((-100));
        Assert.assertEquals("-100", ((VecInt) (o_testNoSolutionExists_add27__12)).toString());
        Assert.assertEquals(-100, ((int) (((VecInt) (o_testNoSolutionExists_add27__12)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExists_add27__12)).isEmpty());
        IConstr o_testNoSolutionExists_add27__14 = this.solver.addClause(clause);
        Assert.assertTrue(((UnitClause) (o_testNoSolutionExists_add27__14)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_testNoSolutionExists_add27__14)).getActivity())), 0.1);
        Assert.assertEquals("-100", ((UnitClause) (o_testNoSolutionExists_add27__14)).toString());
        clause.clear();
        this.solver.isSatisfiable();
        this.solver.isSatisfiable();
        int[] array_705254390 = new int[]{198,200};
        	int[] array_934395863 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__5).getLits();
        	for(int ii = 0; ii <array_705254390.length; ii++) {
        		org.junit.Assert.assertEquals(array_705254390[ii], array_934395863[ii]);
        	};
        int[] array_1517406316 = new int[]{198,200};
        	int[] array_362573722 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__6).getLits();
        	for(int ii = 0; ii <array_1517406316.length; ii++) {
        		org.junit.Assert.assertEquals(array_1517406316[ii], array_362573722[ii]);
        	};
        int[] array_797947727 = new int[]{198,200};
        	int[] array_839241703 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__5).getLits();
        	for(int ii = 0; ii <array_797947727.length; ii++) {
        		org.junit.Assert.assertEquals(array_797947727[ii], array_839241703[ii]);
        	};
        int[] array_1920258044 = new int[]{198,200};
        	int[] array_1054826861 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__6).getLits();
        	for(int ii = 0; ii <array_1920258044.length; ii++) {
        		org.junit.Assert.assertEquals(array_1920258044[ii], array_1054826861[ii]);
        	};
        Assert.assertEquals("", ((VecInt) (clause)).toString());
        Assert.assertTrue(((VecInt) (clause)).isEmpty());
        Assert.assertEquals("", ((VecInt) (o_testNoSolutionExists_add27__3)).toString());
        Assert.assertTrue(((VecInt) (o_testNoSolutionExists_add27__3)).isEmpty());
        int[] array_848647461 = new int[]{198,200};
        	int[] array_1060450426 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__5).getLits();
        	for(int ii = 0; ii <array_848647461.length; ii++) {
        		org.junit.Assert.assertEquals(array_848647461[ii], array_1060450426[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_testNoSolutionExists_add27__5)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testNoSolutionExists_add27__5)).getActivity())), 0.1);
        Assert.assertEquals("99[F] 100[F]", ((OriginalBinaryClause) (o_testNoSolutionExists_add27__5)).toString());
        Assert.assertEquals(199, ((int) (((OriginalBinaryClause) (o_testNoSolutionExists_add27__5)).hashCode())));
        int[] array_2057747254 = new int[]{198,200};
        	int[] array_2050057155 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__6).getLits();
        	for(int ii = 0; ii <array_2057747254.length; ii++) {
        		org.junit.Assert.assertEquals(array_2057747254[ii], array_2050057155[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_testNoSolutionExists_add27__6)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testNoSolutionExists_add27__6)).getActivity())), 0.1);
        Assert.assertEquals("99[F] 100[F]", ((OriginalBinaryClause) (o_testNoSolutionExists_add27__6)).toString());
        Assert.assertEquals(199, ((int) (((OriginalBinaryClause) (o_testNoSolutionExists_add27__6)).hashCode())));
        Assert.assertEquals("", ((VecInt) (o_testNoSolutionExists_add27__8)).toString());
        Assert.assertTrue(((VecInt) (o_testNoSolutionExists_add27__8)).isEmpty());
        Assert.assertTrue(((UnitClause) (o_testNoSolutionExists_add27__10)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_testNoSolutionExists_add27__10)).getActivity())), 0.1);
        Assert.assertEquals("-99", ((UnitClause) (o_testNoSolutionExists_add27__10)).toString());
        Assert.assertEquals("", ((VecInt) (o_testNoSolutionExists_add27__12)).toString());
        Assert.assertTrue(((VecInt) (o_testNoSolutionExists_add27__12)).isEmpty());
        Assert.assertTrue(((UnitClause) (o_testNoSolutionExists_add27__14)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_testNoSolutionExists_add27__14)).getActivity())), 0.1);
        Assert.assertEquals("-100", ((UnitClause) (o_testNoSolutionExists_add27__14)).toString());
    }

    @Test(timeout = 30000)
    public void testNoSolutionExists_add27_add895litNum1770() throws Exception, ContradictionException, TimeoutException {
        IVecInt clause = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause)).toString());
        Assert.assertTrue(((VecInt) (clause)).isEmpty());
        IVecInt o_testNoSolutionExists_add27__3 = clause.push(100).push(99);
        Assert.assertEquals("100,99", ((VecInt) (o_testNoSolutionExists_add27__3)).toString());
        Assert.assertEquals(99, ((int) (((VecInt) (o_testNoSolutionExists_add27__3)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExists_add27__3)).isEmpty());
        IConstr o_testNoSolutionExists_add27__5 = this.solver.addClause(clause);
        int[] array_1518421836 = new int[]{198,200};
        	int[] array_230982896 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__5).getLits();
        	for(int ii = 0; ii <array_1518421836.length; ii++) {
        		org.junit.Assert.assertEquals(array_1518421836[ii], array_230982896[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_testNoSolutionExists_add27__5)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testNoSolutionExists_add27__5)).getActivity())), 0.1);
        Assert.assertEquals("99[?] 100[?]", ((OriginalBinaryClause) (o_testNoSolutionExists_add27__5)).toString());
        Assert.assertEquals(199, ((int) (((OriginalBinaryClause) (o_testNoSolutionExists_add27__5)).hashCode())));
        int[] array_768733878 = new int[]{198,200};
        	int[] array_965497076 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__5).getLits();
        	for(int ii = 0; ii <array_768733878.length; ii++) {
        		org.junit.Assert.assertEquals(array_768733878[ii], array_965497076[ii]);
        	};
        ((OriginalBinaryClause) (o_testNoSolutionExists_add27__5)).isSatisfied();
        int[] array_710729714 = new int[]{198,200};
        	int[] array_418055333 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__5).getLits();
        	for(int ii = 0; ii <array_710729714.length; ii++) {
        		org.junit.Assert.assertEquals(array_710729714[ii], array_418055333[ii]);
        	};
        IConstr o_testNoSolutionExists_add27__6 = this.solver.addClause(clause);
        int[] array_270082025 = new int[]{198,200};
        	int[] array_1000514304 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__6).getLits();
        	for(int ii = 0; ii <array_270082025.length; ii++) {
        		org.junit.Assert.assertEquals(array_270082025[ii], array_1000514304[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_testNoSolutionExists_add27__6)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testNoSolutionExists_add27__6)).getActivity())), 0.1);
        Assert.assertEquals("99[?] 100[?]", ((OriginalBinaryClause) (o_testNoSolutionExists_add27__6)).toString());
        Assert.assertEquals(199, ((int) (((OriginalBinaryClause) (o_testNoSolutionExists_add27__6)).hashCode())));
        int[] array_831880648 = new int[]{198,200};
        	int[] array_845241424 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__6).getLits();
        	for(int ii = 0; ii <array_831880648.length; ii++) {
        		org.junit.Assert.assertEquals(array_831880648[ii], array_845241424[ii]);
        	};
        int[] array_221006639 = new int[]{198,200};
        	int[] array_1045185488 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__6).getLits();
        	for(int ii = 0; ii <array_221006639.length; ii++) {
        		org.junit.Assert.assertEquals(array_221006639[ii], array_1045185488[ii]);
        	};
        clause.clear();
        IVecInt o_testNoSolutionExists_add27__8 = clause.push((-100));
        Assert.assertEquals("-100", ((VecInt) (o_testNoSolutionExists_add27__8)).toString());
        Assert.assertEquals(-100, ((int) (((VecInt) (o_testNoSolutionExists_add27__8)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExists_add27__8)).isEmpty());
        IConstr o_testNoSolutionExists_add27__10 = this.solver.addClause(clause);
        Assert.assertTrue(((UnitClause) (o_testNoSolutionExists_add27__10)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_testNoSolutionExists_add27__10)).getActivity())), 0.1);
        Assert.assertEquals("-100", ((UnitClause) (o_testNoSolutionExists_add27__10)).toString());
        clause.clear();
        IVecInt o_testNoSolutionExists_add27__12 = clause.push((-100));
        Assert.assertEquals("-100", ((VecInt) (o_testNoSolutionExists_add27__12)).toString());
        Assert.assertEquals(-100, ((int) (((VecInt) (o_testNoSolutionExists_add27__12)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExists_add27__12)).isEmpty());
        IConstr o_testNoSolutionExists_add27__14 = this.solver.addClause(clause);
        clause.clear();
        this.solver.isSatisfiable();
        int[] array_705254390 = new int[]{198,200};
        	int[] array_934395863 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__5).getLits();
        	for(int ii = 0; ii <array_705254390.length; ii++) {
        		org.junit.Assert.assertEquals(array_705254390[ii], array_934395863[ii]);
        	};
        int[] array_1517406316 = new int[]{198,200};
        	int[] array_362573722 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__6).getLits();
        	for(int ii = 0; ii <array_1517406316.length; ii++) {
        		org.junit.Assert.assertEquals(array_1517406316[ii], array_362573722[ii]);
        	};
        int[] array_797947727 = new int[]{198,200};
        	int[] array_839241703 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__5).getLits();
        	for(int ii = 0; ii <array_797947727.length; ii++) {
        		org.junit.Assert.assertEquals(array_797947727[ii], array_839241703[ii]);
        	};
        int[] array_1920258044 = new int[]{198,200};
        	int[] array_1054826861 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__6).getLits();
        	for(int ii = 0; ii <array_1920258044.length; ii++) {
        		org.junit.Assert.assertEquals(array_1920258044[ii], array_1054826861[ii]);
        	};
    }

    @Test(timeout = 30000)
    public void testNoSolutionExists_add27_add895litNum1782() throws Exception, ContradictionException, TimeoutException {
        IVecInt clause = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause)).toString());
        Assert.assertTrue(((VecInt) (clause)).isEmpty());
        IVecInt o_testNoSolutionExists_add27__3 = clause.push(100).push(99);
        Assert.assertEquals("100,99", ((VecInt) (o_testNoSolutionExists_add27__3)).toString());
        Assert.assertEquals(99, ((int) (((VecInt) (o_testNoSolutionExists_add27__3)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExists_add27__3)).isEmpty());
        IConstr o_testNoSolutionExists_add27__5 = this.solver.addClause(clause);
        int[] array_424327499 = new int[]{198,200};
        	int[] array_1827632475 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__5).getLits();
        	for(int ii = 0; ii <array_424327499.length; ii++) {
        		org.junit.Assert.assertEquals(array_424327499[ii], array_1827632475[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_testNoSolutionExists_add27__5)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testNoSolutionExists_add27__5)).getActivity())), 0.1);
        Assert.assertEquals("99[?] 100[?]", ((OriginalBinaryClause) (o_testNoSolutionExists_add27__5)).toString());
        Assert.assertEquals(199, ((int) (((OriginalBinaryClause) (o_testNoSolutionExists_add27__5)).hashCode())));
        int[] array_768733878 = new int[]{198,200};
        	int[] array_965497076 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__5).getLits();
        	for(int ii = 0; ii <array_768733878.length; ii++) {
        		org.junit.Assert.assertEquals(array_768733878[ii], array_965497076[ii]);
        	};
        ((OriginalBinaryClause) (o_testNoSolutionExists_add27__5)).isSatisfied();
        int[] array_710729714 = new int[]{198,200};
        	int[] array_418055333 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__5).getLits();
        	for(int ii = 0; ii <array_710729714.length; ii++) {
        		org.junit.Assert.assertEquals(array_710729714[ii], array_418055333[ii]);
        	};
        IConstr o_testNoSolutionExists_add27__6 = this.solver.addClause(clause);
        int[] array_221477669 = new int[]{198,200};
        	int[] array_1904320861 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__6).getLits();
        	for(int ii = 0; ii <array_221477669.length; ii++) {
        		org.junit.Assert.assertEquals(array_221477669[ii], array_1904320861[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_testNoSolutionExists_add27__6)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testNoSolutionExists_add27__6)).getActivity())), 0.1);
        Assert.assertEquals("99[?] 100[?]", ((OriginalBinaryClause) (o_testNoSolutionExists_add27__6)).toString());
        Assert.assertEquals(199, ((int) (((OriginalBinaryClause) (o_testNoSolutionExists_add27__6)).hashCode())));
        int[] array_831880648 = new int[]{198,200};
        	int[] array_845241424 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__6).getLits();
        	for(int ii = 0; ii <array_831880648.length; ii++) {
        		org.junit.Assert.assertEquals(array_831880648[ii], array_845241424[ii]);
        	};
        int[] array_221006639 = new int[]{198,200};
        	int[] array_1045185488 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__6).getLits();
        	for(int ii = 0; ii <array_221006639.length; ii++) {
        		org.junit.Assert.assertEquals(array_221006639[ii], array_1045185488[ii]);
        	};
        clause.clear();
        IVecInt o_testNoSolutionExists_add27__8 = clause.push((-99));
        Assert.assertEquals("-99", ((VecInt) (o_testNoSolutionExists_add27__8)).toString());
        Assert.assertEquals(-99, ((int) (((VecInt) (o_testNoSolutionExists_add27__8)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExists_add27__8)).isEmpty());
        IConstr o_testNoSolutionExists_add27__10 = this.solver.addClause(clause);
        Assert.assertTrue(((UnitClause) (o_testNoSolutionExists_add27__10)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_testNoSolutionExists_add27__10)).getActivity())), 0.1);
        Assert.assertEquals("-99", ((UnitClause) (o_testNoSolutionExists_add27__10)).toString());
        clause.clear();
        IVecInt o_testNoSolutionExists_add27__12 = clause.push((-101));
        Assert.assertEquals("-101", ((VecInt) (o_testNoSolutionExists_add27__12)).toString());
        Assert.assertEquals(-101, ((int) (((VecInt) (o_testNoSolutionExists_add27__12)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExists_add27__12)).isEmpty());
        IConstr o_testNoSolutionExists_add27__14 = this.solver.addClause(clause);
        Assert.assertTrue(((UnitClause) (o_testNoSolutionExists_add27__14)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_testNoSolutionExists_add27__14)).getActivity())), 0.1);
        Assert.assertEquals("-101", ((UnitClause) (o_testNoSolutionExists_add27__14)).toString());
        clause.clear();
        this.solver.isSatisfiable();
        int[] array_705254390 = new int[]{198,200};
        	int[] array_934395863 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__5).getLits();
        	for(int ii = 0; ii <array_705254390.length; ii++) {
        		org.junit.Assert.assertEquals(array_705254390[ii], array_934395863[ii]);
        	};
        int[] array_1517406316 = new int[]{198,200};
        	int[] array_362573722 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__6).getLits();
        	for(int ii = 0; ii <array_1517406316.length; ii++) {
        		org.junit.Assert.assertEquals(array_1517406316[ii], array_362573722[ii]);
        	};
        int[] array_797947727 = new int[]{198,200};
        	int[] array_839241703 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__5).getLits();
        	for(int ii = 0; ii <array_797947727.length; ii++) {
        		org.junit.Assert.assertEquals(array_797947727[ii], array_839241703[ii]);
        	};
        int[] array_1920258044 = new int[]{198,200};
        	int[] array_1054826861 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__6).getLits();
        	for(int ii = 0; ii <array_1920258044.length; ii++) {
        		org.junit.Assert.assertEquals(array_1920258044[ii], array_1054826861[ii]);
        	};
        Assert.assertEquals("", ((VecInt) (clause)).toString());
        Assert.assertTrue(((VecInt) (clause)).isEmpty());
        Assert.assertEquals("", ((VecInt) (o_testNoSolutionExists_add27__3)).toString());
        Assert.assertTrue(((VecInt) (o_testNoSolutionExists_add27__3)).isEmpty());
        int[] array_1979099070 = new int[]{198,200};
        	int[] array_416956815 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__5).getLits();
        	for(int ii = 0; ii <array_1979099070.length; ii++) {
        		org.junit.Assert.assertEquals(array_1979099070[ii], array_416956815[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_testNoSolutionExists_add27__5)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testNoSolutionExists_add27__5)).getActivity())), 0.1);
        Assert.assertEquals("99[F] 100[?]", ((OriginalBinaryClause) (o_testNoSolutionExists_add27__5)).toString());
        Assert.assertEquals(199, ((int) (((OriginalBinaryClause) (o_testNoSolutionExists_add27__5)).hashCode())));
        int[] array_879569244 = new int[]{198,200};
        	int[] array_533326347 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__6).getLits();
        	for(int ii = 0; ii <array_879569244.length; ii++) {
        		org.junit.Assert.assertEquals(array_879569244[ii], array_533326347[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_testNoSolutionExists_add27__6)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testNoSolutionExists_add27__6)).getActivity())), 0.1);
        Assert.assertEquals("99[F] 100[?]", ((OriginalBinaryClause) (o_testNoSolutionExists_add27__6)).toString());
        Assert.assertEquals(199, ((int) (((OriginalBinaryClause) (o_testNoSolutionExists_add27__6)).hashCode())));
        Assert.assertEquals("", ((VecInt) (o_testNoSolutionExists_add27__8)).toString());
        Assert.assertTrue(((VecInt) (o_testNoSolutionExists_add27__8)).isEmpty());
        Assert.assertTrue(((UnitClause) (o_testNoSolutionExists_add27__10)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_testNoSolutionExists_add27__10)).getActivity())), 0.1);
        Assert.assertEquals("-99", ((UnitClause) (o_testNoSolutionExists_add27__10)).toString());
        Assert.assertEquals("", ((VecInt) (o_testNoSolutionExists_add27__12)).toString());
        Assert.assertTrue(((VecInt) (o_testNoSolutionExists_add27__12)).isEmpty());
        Assert.assertTrue(((UnitClause) (o_testNoSolutionExists_add27__14)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_testNoSolutionExists_add27__14)).getActivity())), 0.1);
        Assert.assertEquals("-101", ((UnitClause) (o_testNoSolutionExists_add27__14)).toString());
    }

    @Test(timeout = 30000)
    public void testNoSolutionExists_add27_add895litNum1772() throws Exception, ContradictionException, TimeoutException {
        IVecInt clause = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause)).toString());
        Assert.assertTrue(((VecInt) (clause)).isEmpty());
        IVecInt o_testNoSolutionExists_add27__3 = clause.push(100).push(99);
        Assert.assertEquals("100,99", ((VecInt) (o_testNoSolutionExists_add27__3)).toString());
        Assert.assertEquals(99, ((int) (((VecInt) (o_testNoSolutionExists_add27__3)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExists_add27__3)).isEmpty());
        IConstr o_testNoSolutionExists_add27__5 = this.solver.addClause(clause);
        int[] array_14515348 = new int[]{198,200};
        	int[] array_1722904138 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__5).getLits();
        	for(int ii = 0; ii <array_14515348.length; ii++) {
        		org.junit.Assert.assertEquals(array_14515348[ii], array_1722904138[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_testNoSolutionExists_add27__5)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testNoSolutionExists_add27__5)).getActivity())), 0.1);
        Assert.assertEquals("99[?] 100[?]", ((OriginalBinaryClause) (o_testNoSolutionExists_add27__5)).toString());
        Assert.assertEquals(199, ((int) (((OriginalBinaryClause) (o_testNoSolutionExists_add27__5)).hashCode())));
        int[] array_768733878 = new int[]{198,200};
        	int[] array_965497076 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__5).getLits();
        	for(int ii = 0; ii <array_768733878.length; ii++) {
        		org.junit.Assert.assertEquals(array_768733878[ii], array_965497076[ii]);
        	};
        ((OriginalBinaryClause) (o_testNoSolutionExists_add27__5)).isSatisfied();
        int[] array_710729714 = new int[]{198,200};
        	int[] array_418055333 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__5).getLits();
        	for(int ii = 0; ii <array_710729714.length; ii++) {
        		org.junit.Assert.assertEquals(array_710729714[ii], array_418055333[ii]);
        	};
        IConstr o_testNoSolutionExists_add27__6 = this.solver.addClause(clause);
        int[] array_1221341321 = new int[]{198,200};
        	int[] array_1251781007 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__6).getLits();
        	for(int ii = 0; ii <array_1221341321.length; ii++) {
        		org.junit.Assert.assertEquals(array_1221341321[ii], array_1251781007[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_testNoSolutionExists_add27__6)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testNoSolutionExists_add27__6)).getActivity())), 0.1);
        Assert.assertEquals("99[?] 100[?]", ((OriginalBinaryClause) (o_testNoSolutionExists_add27__6)).toString());
        Assert.assertEquals(199, ((int) (((OriginalBinaryClause) (o_testNoSolutionExists_add27__6)).hashCode())));
        int[] array_831880648 = new int[]{198,200};
        	int[] array_845241424 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__6).getLits();
        	for(int ii = 0; ii <array_831880648.length; ii++) {
        		org.junit.Assert.assertEquals(array_831880648[ii], array_845241424[ii]);
        	};
        int[] array_221006639 = new int[]{198,200};
        	int[] array_1045185488 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__6).getLits();
        	for(int ii = 0; ii <array_221006639.length; ii++) {
        		org.junit.Assert.assertEquals(array_221006639[ii], array_1045185488[ii]);
        	};
        clause.clear();
        IVecInt o_testNoSolutionExists_add27__8 = clause.push((-98));
        Assert.assertEquals("-98", ((VecInt) (o_testNoSolutionExists_add27__8)).toString());
        Assert.assertEquals(-98, ((int) (((VecInt) (o_testNoSolutionExists_add27__8)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExists_add27__8)).isEmpty());
        IConstr o_testNoSolutionExists_add27__10 = this.solver.addClause(clause);
        Assert.assertTrue(((UnitClause) (o_testNoSolutionExists_add27__10)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_testNoSolutionExists_add27__10)).getActivity())), 0.1);
        Assert.assertEquals("-98", ((UnitClause) (o_testNoSolutionExists_add27__10)).toString());
        clause.clear();
        IVecInt o_testNoSolutionExists_add27__12 = clause.push((-100));
        Assert.assertEquals("-100", ((VecInt) (o_testNoSolutionExists_add27__12)).toString());
        Assert.assertEquals(-100, ((int) (((VecInt) (o_testNoSolutionExists_add27__12)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExists_add27__12)).isEmpty());
        IConstr o_testNoSolutionExists_add27__14 = this.solver.addClause(clause);
        Assert.assertTrue(((UnitClause) (o_testNoSolutionExists_add27__14)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_testNoSolutionExists_add27__14)).getActivity())), 0.1);
        Assert.assertEquals("-100", ((UnitClause) (o_testNoSolutionExists_add27__14)).toString());
        clause.clear();
        this.solver.isSatisfiable();
        int[] array_705254390 = new int[]{198,200};
        	int[] array_934395863 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__5).getLits();
        	for(int ii = 0; ii <array_705254390.length; ii++) {
        		org.junit.Assert.assertEquals(array_705254390[ii], array_934395863[ii]);
        	};
        int[] array_1517406316 = new int[]{198,200};
        	int[] array_362573722 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__6).getLits();
        	for(int ii = 0; ii <array_1517406316.length; ii++) {
        		org.junit.Assert.assertEquals(array_1517406316[ii], array_362573722[ii]);
        	};
        int[] array_797947727 = new int[]{198,200};
        	int[] array_839241703 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__5).getLits();
        	for(int ii = 0; ii <array_797947727.length; ii++) {
        		org.junit.Assert.assertEquals(array_797947727[ii], array_839241703[ii]);
        	};
        int[] array_1920258044 = new int[]{198,200};
        	int[] array_1054826861 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__6).getLits();
        	for(int ii = 0; ii <array_1920258044.length; ii++) {
        		org.junit.Assert.assertEquals(array_1920258044[ii], array_1054826861[ii]);
        	};
        Assert.assertEquals("", ((VecInt) (clause)).toString());
        Assert.assertTrue(((VecInt) (clause)).isEmpty());
        Assert.assertEquals("", ((VecInt) (o_testNoSolutionExists_add27__3)).toString());
        Assert.assertTrue(((VecInt) (o_testNoSolutionExists_add27__3)).isEmpty());
        int[] array_567385950 = new int[]{198,200};
        	int[] array_1337954303 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__5).getLits();
        	for(int ii = 0; ii <array_567385950.length; ii++) {
        		org.junit.Assert.assertEquals(array_567385950[ii], array_1337954303[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_testNoSolutionExists_add27__5)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testNoSolutionExists_add27__5)).getActivity())), 0.1);
        Assert.assertEquals("99[?] 100[F]", ((OriginalBinaryClause) (o_testNoSolutionExists_add27__5)).toString());
        Assert.assertEquals(199, ((int) (((OriginalBinaryClause) (o_testNoSolutionExists_add27__5)).hashCode())));
        int[] array_416812937 = new int[]{198,200};
        	int[] array_1516230915 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__6).getLits();
        	for(int ii = 0; ii <array_416812937.length; ii++) {
        		org.junit.Assert.assertEquals(array_416812937[ii], array_1516230915[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_testNoSolutionExists_add27__6)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testNoSolutionExists_add27__6)).getActivity())), 0.1);
        Assert.assertEquals("99[?] 100[F]", ((OriginalBinaryClause) (o_testNoSolutionExists_add27__6)).toString());
        Assert.assertEquals(199, ((int) (((OriginalBinaryClause) (o_testNoSolutionExists_add27__6)).hashCode())));
        Assert.assertEquals("", ((VecInt) (o_testNoSolutionExists_add27__8)).toString());
        Assert.assertTrue(((VecInt) (o_testNoSolutionExists_add27__8)).isEmpty());
        Assert.assertTrue(((UnitClause) (o_testNoSolutionExists_add27__10)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_testNoSolutionExists_add27__10)).getActivity())), 0.1);
        Assert.assertEquals("-98", ((UnitClause) (o_testNoSolutionExists_add27__10)).toString());
        Assert.assertEquals("", ((VecInt) (o_testNoSolutionExists_add27__12)).toString());
        Assert.assertTrue(((VecInt) (o_testNoSolutionExists_add27__12)).isEmpty());
        Assert.assertTrue(((UnitClause) (o_testNoSolutionExists_add27__14)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_testNoSolutionExists_add27__14)).getActivity())), 0.1);
        Assert.assertEquals("-100", ((UnitClause) (o_testNoSolutionExists_add27__14)).toString());
    }

    @Test(timeout = 30000)
    public void testNoSolutionExists_add27_add895litNum1784() throws Exception, ContradictionException, TimeoutException {
        IVecInt clause = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause)).toString());
        Assert.assertTrue(((VecInt) (clause)).isEmpty());
        IVecInt o_testNoSolutionExists_add27__3 = clause.push(100).push(99);
        Assert.assertEquals("100,99", ((VecInt) (o_testNoSolutionExists_add27__3)).toString());
        Assert.assertEquals(99, ((int) (((VecInt) (o_testNoSolutionExists_add27__3)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExists_add27__3)).isEmpty());
        IConstr o_testNoSolutionExists_add27__5 = this.solver.addClause(clause);
        int[] array_1030573006 = new int[]{198,200};
        	int[] array_1874542138 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__5).getLits();
        	for(int ii = 0; ii <array_1030573006.length; ii++) {
        		org.junit.Assert.assertEquals(array_1030573006[ii], array_1874542138[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_testNoSolutionExists_add27__5)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testNoSolutionExists_add27__5)).getActivity())), 0.1);
        Assert.assertEquals("99[?] 100[?]", ((OriginalBinaryClause) (o_testNoSolutionExists_add27__5)).toString());
        Assert.assertEquals(199, ((int) (((OriginalBinaryClause) (o_testNoSolutionExists_add27__5)).hashCode())));
        int[] array_768733878 = new int[]{198,200};
        	int[] array_965497076 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__5).getLits();
        	for(int ii = 0; ii <array_768733878.length; ii++) {
        		org.junit.Assert.assertEquals(array_768733878[ii], array_965497076[ii]);
        	};
        ((OriginalBinaryClause) (o_testNoSolutionExists_add27__5)).isSatisfied();
        int[] array_710729714 = new int[]{198,200};
        	int[] array_418055333 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__5).getLits();
        	for(int ii = 0; ii <array_710729714.length; ii++) {
        		org.junit.Assert.assertEquals(array_710729714[ii], array_418055333[ii]);
        	};
        IConstr o_testNoSolutionExists_add27__6 = this.solver.addClause(clause);
        int[] array_1832891739 = new int[]{198,200};
        	int[] array_1330701543 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__6).getLits();
        	for(int ii = 0; ii <array_1832891739.length; ii++) {
        		org.junit.Assert.assertEquals(array_1832891739[ii], array_1330701543[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_testNoSolutionExists_add27__6)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testNoSolutionExists_add27__6)).getActivity())), 0.1);
        Assert.assertEquals("99[?] 100[?]", ((OriginalBinaryClause) (o_testNoSolutionExists_add27__6)).toString());
        Assert.assertEquals(199, ((int) (((OriginalBinaryClause) (o_testNoSolutionExists_add27__6)).hashCode())));
        int[] array_831880648 = new int[]{198,200};
        	int[] array_845241424 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__6).getLits();
        	for(int ii = 0; ii <array_831880648.length; ii++) {
        		org.junit.Assert.assertEquals(array_831880648[ii], array_845241424[ii]);
        	};
        int[] array_221006639 = new int[]{198,200};
        	int[] array_1045185488 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__6).getLits();
        	for(int ii = 0; ii <array_221006639.length; ii++) {
        		org.junit.Assert.assertEquals(array_221006639[ii], array_1045185488[ii]);
        	};
        clause.clear();
        IVecInt o_testNoSolutionExists_add27__8 = clause.push((-99));
        Assert.assertEquals("-99", ((VecInt) (o_testNoSolutionExists_add27__8)).toString());
        Assert.assertEquals(-99, ((int) (((VecInt) (o_testNoSolutionExists_add27__8)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExists_add27__8)).isEmpty());
        IConstr o_testNoSolutionExists_add27__10 = this.solver.addClause(clause);
        Assert.assertTrue(((UnitClause) (o_testNoSolutionExists_add27__10)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_testNoSolutionExists_add27__10)).getActivity())), 0.1);
        Assert.assertEquals("-99", ((UnitClause) (o_testNoSolutionExists_add27__10)).toString());
        clause.clear();
        IVecInt o_testNoSolutionExists_add27__12 = clause.push((-99));
        Assert.assertEquals("-99", ((VecInt) (o_testNoSolutionExists_add27__12)).toString());
        Assert.assertEquals(-99, ((int) (((VecInt) (o_testNoSolutionExists_add27__12)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNoSolutionExists_add27__12)).isEmpty());
        IConstr o_testNoSolutionExists_add27__14 = this.solver.addClause(clause);
        clause.clear();
        this.solver.isSatisfiable();
        int[] array_705254390 = new int[]{198,200};
        	int[] array_934395863 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__5).getLits();
        	for(int ii = 0; ii <array_705254390.length; ii++) {
        		org.junit.Assert.assertEquals(array_705254390[ii], array_934395863[ii]);
        	};
        int[] array_1517406316 = new int[]{198,200};
        	int[] array_362573722 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__6).getLits();
        	for(int ii = 0; ii <array_1517406316.length; ii++) {
        		org.junit.Assert.assertEquals(array_1517406316[ii], array_362573722[ii]);
        	};
        int[] array_797947727 = new int[]{198,200};
        	int[] array_839241703 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__5).getLits();
        	for(int ii = 0; ii <array_797947727.length; ii++) {
        		org.junit.Assert.assertEquals(array_797947727[ii], array_839241703[ii]);
        	};
        int[] array_1920258044 = new int[]{198,200};
        	int[] array_1054826861 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__6).getLits();
        	for(int ii = 0; ii <array_1920258044.length; ii++) {
        		org.junit.Assert.assertEquals(array_1920258044[ii], array_1054826861[ii]);
        	};
    }

    @Test(timeout = 30000)
    public void testNoSolutionExists_add27_add895litNum1774_failAssert183() throws Exception, ContradictionException, TimeoutException {
        try {
            IVecInt clause = new VecInt();
            IVecInt o_testNoSolutionExists_add27__3 = clause.push(100).push(99);
            IConstr o_testNoSolutionExists_add27__5 = this.solver.addClause(clause);
            int[] array_768733878 = new int[]{198,200};
            	int[] array_965497076 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__5).getLits();
            	for(int ii = 0; ii <array_768733878.length; ii++) {
            		org.junit.Assert.assertEquals(array_768733878[ii], array_965497076[ii]);
            	};
            ((OriginalBinaryClause) (o_testNoSolutionExists_add27__5)).isSatisfied();
            int[] array_710729714 = new int[]{198,200};
            	int[] array_418055333 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__5).getLits();
            	for(int ii = 0; ii <array_710729714.length; ii++) {
            		org.junit.Assert.assertEquals(array_710729714[ii], array_418055333[ii]);
            	};
            IConstr o_testNoSolutionExists_add27__6 = this.solver.addClause(clause);
            int[] array_831880648 = new int[]{198,200};
            	int[] array_845241424 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__6).getLits();
            	for(int ii = 0; ii <array_831880648.length; ii++) {
            		org.junit.Assert.assertEquals(array_831880648[ii], array_845241424[ii]);
            	};
            int[] array_221006639 = new int[]{198,200};
            	int[] array_1045185488 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__6).getLits();
            	for(int ii = 0; ii <array_221006639.length; ii++) {
            		org.junit.Assert.assertEquals(array_221006639[ii], array_1045185488[ii]);
            	};
            clause.clear();
            IVecInt o_testNoSolutionExists_add27__8 = clause.push((-(Integer.MAX_VALUE)));
            IConstr o_testNoSolutionExists_add27__10 = this.solver.addClause(clause);
            clause.clear();
            IVecInt o_testNoSolutionExists_add27__12 = clause.push((-100));
            IConstr o_testNoSolutionExists_add27__14 = this.solver.addClause(clause);
            clause.clear();
            this.solver.isSatisfiable();
            int[] array_705254390 = new int[]{198,200};
            	int[] array_934395863 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__5).getLits();
            	for(int ii = 0; ii <array_705254390.length; ii++) {
            		org.junit.Assert.assertEquals(array_705254390[ii], array_934395863[ii]);
            	};
            int[] array_1517406316 = new int[]{198,200};
            	int[] array_362573722 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__6).getLits();
            	for(int ii = 0; ii <array_1517406316.length; ii++) {
            		org.junit.Assert.assertEquals(array_1517406316[ii], array_362573722[ii]);
            	};
            int[] array_797947727 = new int[]{198,200};
            	int[] array_839241703 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__5).getLits();
            	for(int ii = 0; ii <array_797947727.length; ii++) {
            		org.junit.Assert.assertEquals(array_797947727[ii], array_839241703[ii]);
            	};
            int[] array_1920258044 = new int[]{198,200};
            	int[] array_1054826861 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__6).getLits();
            	for(int ii = 0; ii <array_1920258044.length; ii++) {
            		org.junit.Assert.assertEquals(array_1920258044[ii], array_1054826861[ii]);
            	};
            org.junit.Assert.fail("testNoSolutionExists_add27_add895litNum1774 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testNoSolutionExists_add27_add895litNum1786_failAssert185() throws Exception, ContradictionException, TimeoutException {
        try {
            IVecInt clause = new VecInt();
            IVecInt o_testNoSolutionExists_add27__3 = clause.push(100).push(99);
            IConstr o_testNoSolutionExists_add27__5 = this.solver.addClause(clause);
            int[] array_768733878 = new int[]{198,200};
            	int[] array_965497076 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__5).getLits();
            	for(int ii = 0; ii <array_768733878.length; ii++) {
            		org.junit.Assert.assertEquals(array_768733878[ii], array_965497076[ii]);
            	};
            ((OriginalBinaryClause) (o_testNoSolutionExists_add27__5)).isSatisfied();
            int[] array_710729714 = new int[]{198,200};
            	int[] array_418055333 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__5).getLits();
            	for(int ii = 0; ii <array_710729714.length; ii++) {
            		org.junit.Assert.assertEquals(array_710729714[ii], array_418055333[ii]);
            	};
            IConstr o_testNoSolutionExists_add27__6 = this.solver.addClause(clause);
            int[] array_831880648 = new int[]{198,200};
            	int[] array_845241424 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__6).getLits();
            	for(int ii = 0; ii <array_831880648.length; ii++) {
            		org.junit.Assert.assertEquals(array_831880648[ii], array_845241424[ii]);
            	};
            int[] array_221006639 = new int[]{198,200};
            	int[] array_1045185488 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__6).getLits();
            	for(int ii = 0; ii <array_221006639.length; ii++) {
            		org.junit.Assert.assertEquals(array_221006639[ii], array_1045185488[ii]);
            	};
            clause.clear();
            IVecInt o_testNoSolutionExists_add27__8 = clause.push((-99));
            IConstr o_testNoSolutionExists_add27__10 = this.solver.addClause(clause);
            clause.clear();
            IVecInt o_testNoSolutionExists_add27__12 = clause.push((-(Integer.MAX_VALUE)));
            IConstr o_testNoSolutionExists_add27__14 = this.solver.addClause(clause);
            clause.clear();
            this.solver.isSatisfiable();
            int[] array_705254390 = new int[]{198,200};
            	int[] array_934395863 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__5).getLits();
            	for(int ii = 0; ii <array_705254390.length; ii++) {
            		org.junit.Assert.assertEquals(array_705254390[ii], array_934395863[ii]);
            	};
            int[] array_1517406316 = new int[]{198,200};
            	int[] array_362573722 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__6).getLits();
            	for(int ii = 0; ii <array_1517406316.length; ii++) {
            		org.junit.Assert.assertEquals(array_1517406316[ii], array_362573722[ii]);
            	};
            int[] array_797947727 = new int[]{198,200};
            	int[] array_839241703 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__5).getLits();
            	for(int ii = 0; ii <array_797947727.length; ii++) {
            		org.junit.Assert.assertEquals(array_797947727[ii], array_839241703[ii]);
            	};
            int[] array_1920258044 = new int[]{198,200};
            	int[] array_1054826861 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__6).getLits();
            	for(int ii = 0; ii <array_1920258044.length; ii++) {
            		org.junit.Assert.assertEquals(array_1920258044[ii], array_1054826861[ii]);
            	};
            org.junit.Assert.fail("testNoSolutionExists_add27_add895litNum1786 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testNoSolutionExists_add27_add967litNum1779_failAssert187() throws Exception, ContradictionException, TimeoutException {
        try {
            IVecInt clause = new VecInt();
            IVecInt o_testNoSolutionExists_add27__3 = clause.push(100).push(99);
            IConstr o_testNoSolutionExists_add27__5 = this.solver.addClause(clause);
            int[] array_473135604 = new int[]{198,200};
            	int[] array_579487939 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__5).getLits();
            	for(int ii = 0; ii <array_473135604.length; ii++) {
            		org.junit.Assert.assertEquals(array_473135604[ii], array_579487939[ii]);
            	};
            int[] array_710729714 = new int[]{198,200};
            	int[] array_418055333 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__5).getLits();
            	for(int ii = 0; ii <array_710729714.length; ii++) {
            		org.junit.Assert.assertEquals(array_710729714[ii], array_418055333[ii]);
            	};
            IConstr o_testNoSolutionExists_add27__6 = this.solver.addClause(clause);
            int[] array_1884141543 = new int[]{198,200};
            	int[] array_677604576 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__6).getLits();
            	for(int ii = 0; ii <array_1884141543.length; ii++) {
            		org.junit.Assert.assertEquals(array_1884141543[ii], array_677604576[ii]);
            	};
            int[] array_221006639 = new int[]{198,200};
            	int[] array_1045185488 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__6).getLits();
            	for(int ii = 0; ii <array_221006639.length; ii++) {
            		org.junit.Assert.assertEquals(array_221006639[ii], array_1045185488[ii]);
            	};
            clause.clear();
            IVecInt o_testNoSolutionExists_add27__8 = clause.push((-(Integer.MAX_VALUE)));
            IConstr o_testNoSolutionExists_add27__10 = this.solver.addClause(clause);
            clause.clear();
            IVecInt o_testNoSolutionExists_add27__12 = clause.push((-100));
            IConstr o_testNoSolutionExists_add27__14 = this.solver.addClause(clause);
            clause.clear();
            this.solver.isSatisfiable();
            int[] array_705254390 = new int[]{198,200};
            	int[] array_934395863 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__5).getLits();
            	for(int ii = 0; ii <array_705254390.length; ii++) {
            		org.junit.Assert.assertEquals(array_705254390[ii], array_934395863[ii]);
            	};
            ((OriginalBinaryClause) (o_testNoSolutionExists_add27__6)).isSatisfied();
            int[] array_1517406316 = new int[]{198,200};
            	int[] array_362573722 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__6).getLits();
            	for(int ii = 0; ii <array_1517406316.length; ii++) {
            		org.junit.Assert.assertEquals(array_1517406316[ii], array_362573722[ii]);
            	};
            int[] array_1760617803 = new int[]{198,200};
            	int[] array_1073115312 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__5).getLits();
            	for(int ii = 0; ii <array_1760617803.length; ii++) {
            		org.junit.Assert.assertEquals(array_1760617803[ii], array_1073115312[ii]);
            	};
            int[] array_23528505 = new int[]{198,200};
            	int[] array_1960950195 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__6).getLits();
            	for(int ii = 0; ii <array_23528505.length; ii++) {
            		org.junit.Assert.assertEquals(array_23528505[ii], array_1960950195[ii]);
            	};
            org.junit.Assert.fail("testNoSolutionExists_add27_add967litNum1779 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testNoSolutionExists_add27_add967litNum1791_failAssert189() throws Exception, ContradictionException, TimeoutException {
        try {
            IVecInt clause = new VecInt();
            IVecInt o_testNoSolutionExists_add27__3 = clause.push(100).push(99);
            IConstr o_testNoSolutionExists_add27__5 = this.solver.addClause(clause);
            int[] array_473135604 = new int[]{198,200};
            	int[] array_579487939 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__5).getLits();
            	for(int ii = 0; ii <array_473135604.length; ii++) {
            		org.junit.Assert.assertEquals(array_473135604[ii], array_579487939[ii]);
            	};
            int[] array_710729714 = new int[]{198,200};
            	int[] array_418055333 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__5).getLits();
            	for(int ii = 0; ii <array_710729714.length; ii++) {
            		org.junit.Assert.assertEquals(array_710729714[ii], array_418055333[ii]);
            	};
            IConstr o_testNoSolutionExists_add27__6 = this.solver.addClause(clause);
            int[] array_1884141543 = new int[]{198,200};
            	int[] array_677604576 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__6).getLits();
            	for(int ii = 0; ii <array_1884141543.length; ii++) {
            		org.junit.Assert.assertEquals(array_1884141543[ii], array_677604576[ii]);
            	};
            int[] array_221006639 = new int[]{198,200};
            	int[] array_1045185488 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__6).getLits();
            	for(int ii = 0; ii <array_221006639.length; ii++) {
            		org.junit.Assert.assertEquals(array_221006639[ii], array_1045185488[ii]);
            	};
            clause.clear();
            IVecInt o_testNoSolutionExists_add27__8 = clause.push((-99));
            IConstr o_testNoSolutionExists_add27__10 = this.solver.addClause(clause);
            clause.clear();
            IVecInt o_testNoSolutionExists_add27__12 = clause.push((-(Integer.MAX_VALUE)));
            IConstr o_testNoSolutionExists_add27__14 = this.solver.addClause(clause);
            clause.clear();
            this.solver.isSatisfiable();
            int[] array_705254390 = new int[]{198,200};
            	int[] array_934395863 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__5).getLits();
            	for(int ii = 0; ii <array_705254390.length; ii++) {
            		org.junit.Assert.assertEquals(array_705254390[ii], array_934395863[ii]);
            	};
            ((OriginalBinaryClause) (o_testNoSolutionExists_add27__6)).isSatisfied();
            int[] array_1517406316 = new int[]{198,200};
            	int[] array_362573722 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__6).getLits();
            	for(int ii = 0; ii <array_1517406316.length; ii++) {
            		org.junit.Assert.assertEquals(array_1517406316[ii], array_362573722[ii]);
            	};
            int[] array_1760617803 = new int[]{198,200};
            	int[] array_1073115312 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__5).getLits();
            	for(int ii = 0; ii <array_1760617803.length; ii++) {
            		org.junit.Assert.assertEquals(array_1760617803[ii], array_1073115312[ii]);
            	};
            int[] array_23528505 = new int[]{198,200};
            	int[] array_1960950195 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__6).getLits();
            	for(int ii = 0; ii <array_23528505.length; ii++) {
            		org.junit.Assert.assertEquals(array_23528505[ii], array_1960950195[ii]);
            	};
            org.junit.Assert.fail("testNoSolutionExists_add27_add967litNum1791 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testNoSolutionExists_add27_add895litNum1760_failAssert192() throws Exception, ContradictionException, TimeoutException {
        try {
            IVecInt clause = new VecInt();
            IVecInt o_testNoSolutionExists_add27__3 = clause.push(100).push(Integer.MAX_VALUE);
            IConstr o_testNoSolutionExists_add27__5 = this.solver.addClause(clause);
            int[] array_768733878 = new int[]{198,200};
            	int[] array_965497076 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__5).getLits();
            	for(int ii = 0; ii <array_768733878.length; ii++) {
            		org.junit.Assert.assertEquals(array_768733878[ii], array_965497076[ii]);
            	};
            ((OriginalBinaryClause) (o_testNoSolutionExists_add27__5)).isSatisfied();
            int[] array_710729714 = new int[]{198,200};
            	int[] array_418055333 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__5).getLits();
            	for(int ii = 0; ii <array_710729714.length; ii++) {
            		org.junit.Assert.assertEquals(array_710729714[ii], array_418055333[ii]);
            	};
            IConstr o_testNoSolutionExists_add27__6 = this.solver.addClause(clause);
            int[] array_831880648 = new int[]{198,200};
            	int[] array_845241424 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__6).getLits();
            	for(int ii = 0; ii <array_831880648.length; ii++) {
            		org.junit.Assert.assertEquals(array_831880648[ii], array_845241424[ii]);
            	};
            int[] array_221006639 = new int[]{198,200};
            	int[] array_1045185488 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__6).getLits();
            	for(int ii = 0; ii <array_221006639.length; ii++) {
            		org.junit.Assert.assertEquals(array_221006639[ii], array_1045185488[ii]);
            	};
            clause.clear();
            IVecInt o_testNoSolutionExists_add27__8 = clause.push((-99));
            IConstr o_testNoSolutionExists_add27__10 = this.solver.addClause(clause);
            clause.clear();
            IVecInt o_testNoSolutionExists_add27__12 = clause.push((-100));
            IConstr o_testNoSolutionExists_add27__14 = this.solver.addClause(clause);
            clause.clear();
            this.solver.isSatisfiable();
            int[] array_705254390 = new int[]{198,200};
            	int[] array_934395863 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__5).getLits();
            	for(int ii = 0; ii <array_705254390.length; ii++) {
            		org.junit.Assert.assertEquals(array_705254390[ii], array_934395863[ii]);
            	};
            int[] array_1517406316 = new int[]{198,200};
            	int[] array_362573722 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__6).getLits();
            	for(int ii = 0; ii <array_1517406316.length; ii++) {
            		org.junit.Assert.assertEquals(array_1517406316[ii], array_362573722[ii]);
            	};
            int[] array_797947727 = new int[]{198,200};
            	int[] array_839241703 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__5).getLits();
            	for(int ii = 0; ii <array_797947727.length; ii++) {
            		org.junit.Assert.assertEquals(array_797947727[ii], array_839241703[ii]);
            	};
            int[] array_1920258044 = new int[]{198,200};
            	int[] array_1054826861 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__6).getLits();
            	for(int ii = 0; ii <array_1920258044.length; ii++) {
            		org.junit.Assert.assertEquals(array_1920258044[ii], array_1054826861[ii]);
            	};
            org.junit.Assert.fail("testNoSolutionExists_add27_add895litNum1760 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testNoSolutionExists_add27_add967litNum1768_failAssert195() throws Exception, ContradictionException, TimeoutException {
        try {
            IVecInt clause = new VecInt();
            IVecInt o_testNoSolutionExists_add27__3 = clause.push(100).push(Integer.MAX_VALUE);
            IConstr o_testNoSolutionExists_add27__5 = this.solver.addClause(clause);
            int[] array_473135604 = new int[]{198,200};
            	int[] array_579487939 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__5).getLits();
            	for(int ii = 0; ii <array_473135604.length; ii++) {
            		org.junit.Assert.assertEquals(array_473135604[ii], array_579487939[ii]);
            	};
            int[] array_710729714 = new int[]{198,200};
            	int[] array_418055333 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__5).getLits();
            	for(int ii = 0; ii <array_710729714.length; ii++) {
            		org.junit.Assert.assertEquals(array_710729714[ii], array_418055333[ii]);
            	};
            IConstr o_testNoSolutionExists_add27__6 = this.solver.addClause(clause);
            int[] array_1884141543 = new int[]{198,200};
            	int[] array_677604576 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__6).getLits();
            	for(int ii = 0; ii <array_1884141543.length; ii++) {
            		org.junit.Assert.assertEquals(array_1884141543[ii], array_677604576[ii]);
            	};
            int[] array_221006639 = new int[]{198,200};
            	int[] array_1045185488 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__6).getLits();
            	for(int ii = 0; ii <array_221006639.length; ii++) {
            		org.junit.Assert.assertEquals(array_221006639[ii], array_1045185488[ii]);
            	};
            clause.clear();
            IVecInt o_testNoSolutionExists_add27__8 = clause.push((-99));
            IConstr o_testNoSolutionExists_add27__10 = this.solver.addClause(clause);
            clause.clear();
            IVecInt o_testNoSolutionExists_add27__12 = clause.push((-100));
            IConstr o_testNoSolutionExists_add27__14 = this.solver.addClause(clause);
            clause.clear();
            this.solver.isSatisfiable();
            int[] array_705254390 = new int[]{198,200};
            	int[] array_934395863 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__5).getLits();
            	for(int ii = 0; ii <array_705254390.length; ii++) {
            		org.junit.Assert.assertEquals(array_705254390[ii], array_934395863[ii]);
            	};
            ((OriginalBinaryClause) (o_testNoSolutionExists_add27__6)).isSatisfied();
            int[] array_1517406316 = new int[]{198,200};
            	int[] array_362573722 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__6).getLits();
            	for(int ii = 0; ii <array_1517406316.length; ii++) {
            		org.junit.Assert.assertEquals(array_1517406316[ii], array_362573722[ii]);
            	};
            int[] array_1760617803 = new int[]{198,200};
            	int[] array_1073115312 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__5).getLits();
            	for(int ii = 0; ii <array_1760617803.length; ii++) {
            		org.junit.Assert.assertEquals(array_1760617803[ii], array_1073115312[ii]);
            	};
            int[] array_23528505 = new int[]{198,200};
            	int[] array_1960950195 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__6).getLits();
            	for(int ii = 0; ii <array_23528505.length; ii++) {
            		org.junit.Assert.assertEquals(array_23528505[ii], array_1960950195[ii]);
            	};
            org.junit.Assert.fail("testNoSolutionExists_add27_add967litNum1768 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testNoSolutionExists_add27_add895litNum1747_failAssert199() throws Exception, ContradictionException, TimeoutException {
        try {
            IVecInt clause = new VecInt();
            IVecInt o_testNoSolutionExists_add27__3 = clause.push(100).push(100);
            IConstr o_testNoSolutionExists_add27__5 = this.solver.addClause(clause);
            int[] array_768733878 = new int[]{198,200};
            	int[] array_965497076 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__5).getLits();
            	for(int ii = 0; ii <array_768733878.length; ii++) {
            		org.junit.Assert.assertEquals(array_768733878[ii], array_965497076[ii]);
            	};
            ((OriginalBinaryClause) (o_testNoSolutionExists_add27__5)).isSatisfied();
            int[] array_710729714 = new int[]{198,200};
            	int[] array_418055333 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__5).getLits();
            	for(int ii = 0; ii <array_710729714.length; ii++) {
            		org.junit.Assert.assertEquals(array_710729714[ii], array_418055333[ii]);
            	};
            IConstr o_testNoSolutionExists_add27__6 = this.solver.addClause(clause);
            int[] array_831880648 = new int[]{198,200};
            	int[] array_845241424 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__6).getLits();
            	for(int ii = 0; ii <array_831880648.length; ii++) {
            		org.junit.Assert.assertEquals(array_831880648[ii], array_845241424[ii]);
            	};
            int[] array_221006639 = new int[]{198,200};
            	int[] array_1045185488 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__6).getLits();
            	for(int ii = 0; ii <array_221006639.length; ii++) {
            		org.junit.Assert.assertEquals(array_221006639[ii], array_1045185488[ii]);
            	};
            clause.clear();
            IVecInt o_testNoSolutionExists_add27__8 = clause.push((-99));
            IConstr o_testNoSolutionExists_add27__10 = this.solver.addClause(clause);
            clause.clear();
            IVecInt o_testNoSolutionExists_add27__12 = clause.push((-100));
            IConstr o_testNoSolutionExists_add27__14 = this.solver.addClause(clause);
            clause.clear();
            this.solver.isSatisfiable();
            int[] array_705254390 = new int[]{198,200};
            	int[] array_934395863 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__5).getLits();
            	for(int ii = 0; ii <array_705254390.length; ii++) {
            		org.junit.Assert.assertEquals(array_705254390[ii], array_934395863[ii]);
            	};
            int[] array_1517406316 = new int[]{198,200};
            	int[] array_362573722 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__6).getLits();
            	for(int ii = 0; ii <array_1517406316.length; ii++) {
            		org.junit.Assert.assertEquals(array_1517406316[ii], array_362573722[ii]);
            	};
            int[] array_797947727 = new int[]{198,200};
            	int[] array_839241703 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__5).getLits();
            	for(int ii = 0; ii <array_797947727.length; ii++) {
            		org.junit.Assert.assertEquals(array_797947727[ii], array_839241703[ii]);
            	};
            int[] array_1920258044 = new int[]{198,200};
            	int[] array_1054826861 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__6).getLits();
            	for(int ii = 0; ii <array_1920258044.length; ii++) {
            		org.junit.Assert.assertEquals(array_1920258044[ii], array_1054826861[ii]);
            	};
            org.junit.Assert.fail("testNoSolutionExists_add27_add895litNum1747 should have thrown ClassCastException");
        } catch (ClassCastException expected) {
            Assert.assertEquals("org.sat4j.minisat.constraints.cnf.UnitClause cannot be cast to org.sat4j.minisat.constraints.cnf.OriginalBinaryClause", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testNoSolutionExists_add27_add895litNum1778_failAssert202() throws Exception, ContradictionException, TimeoutException {
        try {
            IVecInt clause = new VecInt();
            IVecInt o_testNoSolutionExists_add27__3 = clause.push(100).push(99);
            IConstr o_testNoSolutionExists_add27__5 = this.solver.addClause(clause);
            int[] array_768733878 = new int[]{198,200};
            	int[] array_965497076 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__5).getLits();
            	for(int ii = 0; ii <array_768733878.length; ii++) {
            		org.junit.Assert.assertEquals(array_768733878[ii], array_965497076[ii]);
            	};
            ((OriginalBinaryClause) (o_testNoSolutionExists_add27__5)).isSatisfied();
            int[] array_710729714 = new int[]{198,200};
            	int[] array_418055333 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__5).getLits();
            	for(int ii = 0; ii <array_710729714.length; ii++) {
            		org.junit.Assert.assertEquals(array_710729714[ii], array_418055333[ii]);
            	};
            IConstr o_testNoSolutionExists_add27__6 = this.solver.addClause(clause);
            int[] array_831880648 = new int[]{198,200};
            	int[] array_845241424 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__6).getLits();
            	for(int ii = 0; ii <array_831880648.length; ii++) {
            		org.junit.Assert.assertEquals(array_831880648[ii], array_845241424[ii]);
            	};
            int[] array_221006639 = new int[]{198,200};
            	int[] array_1045185488 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__6).getLits();
            	for(int ii = 0; ii <array_221006639.length; ii++) {
            		org.junit.Assert.assertEquals(array_221006639[ii], array_1045185488[ii]);
            	};
            clause.clear();
            IVecInt o_testNoSolutionExists_add27__8 = clause.push((-0));
            IConstr o_testNoSolutionExists_add27__10 = this.solver.addClause(clause);
            clause.clear();
            IVecInt o_testNoSolutionExists_add27__12 = clause.push((-100));
            IConstr o_testNoSolutionExists_add27__14 = this.solver.addClause(clause);
            clause.clear();
            this.solver.isSatisfiable();
            int[] array_705254390 = new int[]{198,200};
            	int[] array_934395863 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__5).getLits();
            	for(int ii = 0; ii <array_705254390.length; ii++) {
            		org.junit.Assert.assertEquals(array_705254390[ii], array_934395863[ii]);
            	};
            int[] array_1517406316 = new int[]{198,200};
            	int[] array_362573722 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__6).getLits();
            	for(int ii = 0; ii <array_1517406316.length; ii++) {
            		org.junit.Assert.assertEquals(array_1517406316[ii], array_362573722[ii]);
            	};
            int[] array_797947727 = new int[]{198,200};
            	int[] array_839241703 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__5).getLits();
            	for(int ii = 0; ii <array_797947727.length; ii++) {
            		org.junit.Assert.assertEquals(array_797947727[ii], array_839241703[ii]);
            	};
            int[] array_1920258044 = new int[]{198,200};
            	int[] array_1054826861 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__6).getLits();
            	for(int ii = 0; ii <array_1920258044.length; ii++) {
            		org.junit.Assert.assertEquals(array_1920258044[ii], array_1054826861[ii]);
            	};
            org.junit.Assert.fail("testNoSolutionExists_add27_add895litNum1778 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testNoSolutionExists_add27_add895litNum1765_failAssert203() throws Exception, ContradictionException, TimeoutException {
        try {
            IVecInt clause = new VecInt();
            IVecInt o_testNoSolutionExists_add27__3 = clause.push(100).push(0);
            IConstr o_testNoSolutionExists_add27__5 = this.solver.addClause(clause);
            int[] array_768733878 = new int[]{198,200};
            	int[] array_965497076 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__5).getLits();
            	for(int ii = 0; ii <array_768733878.length; ii++) {
            		org.junit.Assert.assertEquals(array_768733878[ii], array_965497076[ii]);
            	};
            ((OriginalBinaryClause) (o_testNoSolutionExists_add27__5)).isSatisfied();
            int[] array_710729714 = new int[]{198,200};
            	int[] array_418055333 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__5).getLits();
            	for(int ii = 0; ii <array_710729714.length; ii++) {
            		org.junit.Assert.assertEquals(array_710729714[ii], array_418055333[ii]);
            	};
            IConstr o_testNoSolutionExists_add27__6 = this.solver.addClause(clause);
            int[] array_831880648 = new int[]{198,200};
            	int[] array_845241424 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__6).getLits();
            	for(int ii = 0; ii <array_831880648.length; ii++) {
            		org.junit.Assert.assertEquals(array_831880648[ii], array_845241424[ii]);
            	};
            int[] array_221006639 = new int[]{198,200};
            	int[] array_1045185488 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__6).getLits();
            	for(int ii = 0; ii <array_221006639.length; ii++) {
            		org.junit.Assert.assertEquals(array_221006639[ii], array_1045185488[ii]);
            	};
            clause.clear();
            IVecInt o_testNoSolutionExists_add27__8 = clause.push((-99));
            IConstr o_testNoSolutionExists_add27__10 = this.solver.addClause(clause);
            clause.clear();
            IVecInt o_testNoSolutionExists_add27__12 = clause.push((-100));
            IConstr o_testNoSolutionExists_add27__14 = this.solver.addClause(clause);
            clause.clear();
            this.solver.isSatisfiable();
            int[] array_705254390 = new int[]{198,200};
            	int[] array_934395863 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__5).getLits();
            	for(int ii = 0; ii <array_705254390.length; ii++) {
            		org.junit.Assert.assertEquals(array_705254390[ii], array_934395863[ii]);
            	};
            int[] array_1517406316 = new int[]{198,200};
            	int[] array_362573722 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__6).getLits();
            	for(int ii = 0; ii <array_1517406316.length; ii++) {
            		org.junit.Assert.assertEquals(array_1517406316[ii], array_362573722[ii]);
            	};
            int[] array_797947727 = new int[]{198,200};
            	int[] array_839241703 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__5).getLits();
            	for(int ii = 0; ii <array_797947727.length; ii++) {
            		org.junit.Assert.assertEquals(array_797947727[ii], array_839241703[ii]);
            	};
            int[] array_1920258044 = new int[]{198,200};
            	int[] array_1054826861 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__6).getLits();
            	for(int ii = 0; ii <array_1920258044.length; ii++) {
            		org.junit.Assert.assertEquals(array_1920258044[ii], array_1054826861[ii]);
            	};
            org.junit.Assert.fail("testNoSolutionExists_add27_add895litNum1765 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testNoSolutionExists_add27_add895litNum1790_failAssert205() throws Exception, ContradictionException, TimeoutException {
        try {
            IVecInt clause = new VecInt();
            IVecInt o_testNoSolutionExists_add27__3 = clause.push(100).push(99);
            IConstr o_testNoSolutionExists_add27__5 = this.solver.addClause(clause);
            int[] array_768733878 = new int[]{198,200};
            	int[] array_965497076 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__5).getLits();
            	for(int ii = 0; ii <array_768733878.length; ii++) {
            		org.junit.Assert.assertEquals(array_768733878[ii], array_965497076[ii]);
            	};
            ((OriginalBinaryClause) (o_testNoSolutionExists_add27__5)).isSatisfied();
            int[] array_710729714 = new int[]{198,200};
            	int[] array_418055333 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__5).getLits();
            	for(int ii = 0; ii <array_710729714.length; ii++) {
            		org.junit.Assert.assertEquals(array_710729714[ii], array_418055333[ii]);
            	};
            IConstr o_testNoSolutionExists_add27__6 = this.solver.addClause(clause);
            int[] array_831880648 = new int[]{198,200};
            	int[] array_845241424 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__6).getLits();
            	for(int ii = 0; ii <array_831880648.length; ii++) {
            		org.junit.Assert.assertEquals(array_831880648[ii], array_845241424[ii]);
            	};
            int[] array_221006639 = new int[]{198,200};
            	int[] array_1045185488 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__6).getLits();
            	for(int ii = 0; ii <array_221006639.length; ii++) {
            		org.junit.Assert.assertEquals(array_221006639[ii], array_1045185488[ii]);
            	};
            clause.clear();
            IVecInt o_testNoSolutionExists_add27__8 = clause.push((-99));
            IConstr o_testNoSolutionExists_add27__10 = this.solver.addClause(clause);
            clause.clear();
            IVecInt o_testNoSolutionExists_add27__12 = clause.push((-0));
            IConstr o_testNoSolutionExists_add27__14 = this.solver.addClause(clause);
            clause.clear();
            this.solver.isSatisfiable();
            int[] array_705254390 = new int[]{198,200};
            	int[] array_934395863 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__5).getLits();
            	for(int ii = 0; ii <array_705254390.length; ii++) {
            		org.junit.Assert.assertEquals(array_705254390[ii], array_934395863[ii]);
            	};
            int[] array_1517406316 = new int[]{198,200};
            	int[] array_362573722 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__6).getLits();
            	for(int ii = 0; ii <array_1517406316.length; ii++) {
            		org.junit.Assert.assertEquals(array_1517406316[ii], array_362573722[ii]);
            	};
            int[] array_797947727 = new int[]{198,200};
            	int[] array_839241703 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__5).getLits();
            	for(int ii = 0; ii <array_797947727.length; ii++) {
            		org.junit.Assert.assertEquals(array_797947727[ii], array_839241703[ii]);
            	};
            int[] array_1920258044 = new int[]{198,200};
            	int[] array_1054826861 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__6).getLits();
            	for(int ii = 0; ii <array_1920258044.length; ii++) {
            		org.junit.Assert.assertEquals(array_1920258044[ii], array_1054826861[ii]);
            	};
            org.junit.Assert.fail("testNoSolutionExists_add27_add895litNum1790 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testNoSolutionExists_add27_add967litNum1783_failAssert207() throws Exception, ContradictionException, TimeoutException {
        try {
            IVecInt clause = new VecInt();
            IVecInt o_testNoSolutionExists_add27__3 = clause.push(100).push(99);
            IConstr o_testNoSolutionExists_add27__5 = this.solver.addClause(clause);
            int[] array_473135604 = new int[]{198,200};
            	int[] array_579487939 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__5).getLits();
            	for(int ii = 0; ii <array_473135604.length; ii++) {
            		org.junit.Assert.assertEquals(array_473135604[ii], array_579487939[ii]);
            	};
            int[] array_710729714 = new int[]{198,200};
            	int[] array_418055333 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__5).getLits();
            	for(int ii = 0; ii <array_710729714.length; ii++) {
            		org.junit.Assert.assertEquals(array_710729714[ii], array_418055333[ii]);
            	};
            IConstr o_testNoSolutionExists_add27__6 = this.solver.addClause(clause);
            int[] array_1884141543 = new int[]{198,200};
            	int[] array_677604576 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__6).getLits();
            	for(int ii = 0; ii <array_1884141543.length; ii++) {
            		org.junit.Assert.assertEquals(array_1884141543[ii], array_677604576[ii]);
            	};
            int[] array_221006639 = new int[]{198,200};
            	int[] array_1045185488 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__6).getLits();
            	for(int ii = 0; ii <array_221006639.length; ii++) {
            		org.junit.Assert.assertEquals(array_221006639[ii], array_1045185488[ii]);
            	};
            clause.clear();
            IVecInt o_testNoSolutionExists_add27__8 = clause.push((-0));
            IConstr o_testNoSolutionExists_add27__10 = this.solver.addClause(clause);
            clause.clear();
            IVecInt o_testNoSolutionExists_add27__12 = clause.push((-100));
            IConstr o_testNoSolutionExists_add27__14 = this.solver.addClause(clause);
            clause.clear();
            this.solver.isSatisfiable();
            int[] array_705254390 = new int[]{198,200};
            	int[] array_934395863 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__5).getLits();
            	for(int ii = 0; ii <array_705254390.length; ii++) {
            		org.junit.Assert.assertEquals(array_705254390[ii], array_934395863[ii]);
            	};
            ((OriginalBinaryClause) (o_testNoSolutionExists_add27__6)).isSatisfied();
            int[] array_1517406316 = new int[]{198,200};
            	int[] array_362573722 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__6).getLits();
            	for(int ii = 0; ii <array_1517406316.length; ii++) {
            		org.junit.Assert.assertEquals(array_1517406316[ii], array_362573722[ii]);
            	};
            int[] array_1760617803 = new int[]{198,200};
            	int[] array_1073115312 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__5).getLits();
            	for(int ii = 0; ii <array_1760617803.length; ii++) {
            		org.junit.Assert.assertEquals(array_1760617803[ii], array_1073115312[ii]);
            	};
            int[] array_23528505 = new int[]{198,200};
            	int[] array_1960950195 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__6).getLits();
            	for(int ii = 0; ii <array_23528505.length; ii++) {
            		org.junit.Assert.assertEquals(array_23528505[ii], array_1960950195[ii]);
            	};
            org.junit.Assert.fail("testNoSolutionExists_add27_add967litNum1783 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testNoSolutionExists_add27_add967litNum1794_failAssert209() throws Exception, ContradictionException, TimeoutException {
        try {
            IVecInt clause = new VecInt();
            IVecInt o_testNoSolutionExists_add27__3 = clause.push(100).push(99);
            IConstr o_testNoSolutionExists_add27__5 = this.solver.addClause(clause);
            int[] array_473135604 = new int[]{198,200};
            	int[] array_579487939 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__5).getLits();
            	for(int ii = 0; ii <array_473135604.length; ii++) {
            		org.junit.Assert.assertEquals(array_473135604[ii], array_579487939[ii]);
            	};
            int[] array_710729714 = new int[]{198,200};
            	int[] array_418055333 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__5).getLits();
            	for(int ii = 0; ii <array_710729714.length; ii++) {
            		org.junit.Assert.assertEquals(array_710729714[ii], array_418055333[ii]);
            	};
            IConstr o_testNoSolutionExists_add27__6 = this.solver.addClause(clause);
            int[] array_1884141543 = new int[]{198,200};
            	int[] array_677604576 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__6).getLits();
            	for(int ii = 0; ii <array_1884141543.length; ii++) {
            		org.junit.Assert.assertEquals(array_1884141543[ii], array_677604576[ii]);
            	};
            int[] array_221006639 = new int[]{198,200};
            	int[] array_1045185488 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__6).getLits();
            	for(int ii = 0; ii <array_221006639.length; ii++) {
            		org.junit.Assert.assertEquals(array_221006639[ii], array_1045185488[ii]);
            	};
            clause.clear();
            IVecInt o_testNoSolutionExists_add27__8 = clause.push((-99));
            IConstr o_testNoSolutionExists_add27__10 = this.solver.addClause(clause);
            clause.clear();
            IVecInt o_testNoSolutionExists_add27__12 = clause.push((-0));
            IConstr o_testNoSolutionExists_add27__14 = this.solver.addClause(clause);
            clause.clear();
            this.solver.isSatisfiable();
            int[] array_705254390 = new int[]{198,200};
            	int[] array_934395863 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__5).getLits();
            	for(int ii = 0; ii <array_705254390.length; ii++) {
            		org.junit.Assert.assertEquals(array_705254390[ii], array_934395863[ii]);
            	};
            ((OriginalBinaryClause) (o_testNoSolutionExists_add27__6)).isSatisfied();
            int[] array_1517406316 = new int[]{198,200};
            	int[] array_362573722 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__6).getLits();
            	for(int ii = 0; ii <array_1517406316.length; ii++) {
            		org.junit.Assert.assertEquals(array_1517406316[ii], array_362573722[ii]);
            	};
            int[] array_1760617803 = new int[]{198,200};
            	int[] array_1073115312 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__5).getLits();
            	for(int ii = 0; ii <array_1760617803.length; ii++) {
            		org.junit.Assert.assertEquals(array_1760617803[ii], array_1073115312[ii]);
            	};
            int[] array_23528505 = new int[]{198,200};
            	int[] array_1960950195 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testNoSolutionExists_add27__6).getLits();
            	for(int ii = 0; ii <array_23528505.length; ii++) {
            		org.junit.Assert.assertEquals(array_23528505[ii], array_1960950195[ii]);
            	};
            org.junit.Assert.fail("testNoSolutionExists_add27_add967litNum1794 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testNoSolutionExistslitNum7_failAssert5litNum314_failAssert22litNum1413_failAssert211() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    IVecInt clause = new VecInt();
                    clause.push(100).push(100);
                    this.solver.addClause(clause);
                    clause.clear();
                    clause.push((-98));
                    this.solver.addClause(clause);
                    clause.clear();
                    clause.push((-0));
                    this.solver.addClause(clause);
                    clause.clear();
                    this.solver.isSatisfiable();
                    org.junit.Assert.fail("testNoSolutionExistslitNum7 should have thrown ContradictionException");
                }
                org.junit.Assert.fail("testNoSolutionExistslitNum7_failAssert5litNum314 should have thrown ContradictionException");
            }
            org.junit.Assert.fail("testNoSolutionExistslitNum7_failAssert5litNum314_failAssert22litNum1413 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testNoSolutionExistslitNum2_failAssert1litNum167_failAssert17litNum1698_failAssert213() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    IVecInt clause = new VecInt();
                    clause.push(99).push(99);
                    this.solver.addClause(clause);
                    clause.clear();
                    clause.push((-0));
                    this.solver.addClause(clause);
                    clause.clear();
                    clause.push((-0));
                    this.solver.addClause(clause);
                    clause.clear();
                    this.solver.isSatisfiable();
                    org.junit.Assert.fail("testNoSolutionExistslitNum2 should have thrown ContradictionException");
                }
                org.junit.Assert.fail("testNoSolutionExistslitNum2_failAssert1litNum167 should have thrown IllegalArgumentException");
            }
            org.junit.Assert.fail("testNoSolutionExistslitNum2_failAssert1litNum167_failAssert17litNum1698 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testNoSolutionExistslitNum7_failAssert5litNum326_failAssert101litNum1665_failAssert220() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    IVecInt clause = new VecInt();
                    clause.push(100).push(100);
                    this.solver.addClause(clause);
                    clause.clear();
                    clause.push((-98));
                    this.solver.addClause(clause);
                    clause.clear();
                    clause.push((-(Integer.MAX_VALUE)));
                    this.solver.addClause(clause);
                    clause.clear();
                    this.solver.isSatisfiable();
                    org.junit.Assert.fail("testNoSolutionExistslitNum7 should have thrown ContradictionException");
                }
                org.junit.Assert.fail("testNoSolutionExistslitNum7_failAssert5litNum326 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testNoSolutionExistslitNum7_failAssert5litNum326_failAssert101litNum1665 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testNoSolutionExistslitNum7_failAssert5litNum326_failAssert101litNum1664_failAssert223() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    IVecInt clause = new VecInt();
                    clause.push(100).push(100);
                    this.solver.addClause(clause);
                    clause.clear();
                    clause.push((-100));
                    this.solver.addClause(clause);
                    clause.clear();
                    clause.push((-(Integer.MAX_VALUE)));
                    this.solver.addClause(clause);
                    clause.clear();
                    this.solver.isSatisfiable();
                    org.junit.Assert.fail("testNoSolutionExistslitNum7 should have thrown ContradictionException");
                }
                org.junit.Assert.fail("testNoSolutionExistslitNum7_failAssert5litNum326 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testNoSolutionExistslitNum7_failAssert5litNum326_failAssert101litNum1664 should have thrown ContradictionException");
        } catch (ContradictionException expected) {
            Assert.assertEquals("Creating Empty clause ?", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testNoSolutionExistslitNum21_failAssert12litNum231_failAssert46litNum1507_failAssert226() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    IVecInt clause = new VecInt();
                    clause.push(101).push(99);
                    this.solver.addClause(clause);
                    clause.clear();
                    clause.push((-0));
                    this.solver.addClause(clause);
                    clause.clear();
                    clause.push((-(Integer.MAX_VALUE)));
                    this.solver.addClause(clause);
                    clause.clear();
                    this.solver.isSatisfiable();
                    org.junit.Assert.fail("testNoSolutionExistslitNum21 should have thrown NegativeArraySizeException");
                }
                org.junit.Assert.fail("testNoSolutionExistslitNum21_failAssert12litNum231 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testNoSolutionExistslitNum21_failAssert12litNum231_failAssert46litNum1507 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testNoSolutionExistslitNum21_failAssert12litNum231_failAssert46litNum1502_failAssert233() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    IVecInt clause = new VecInt();
                    clause.push(101).push(99);
                    this.solver.addClause(clause);
                    clause.clear();
                    clause.push((-98));
                    this.solver.addClause(clause);
                    clause.clear();
                    clause.push((-(Integer.MAX_VALUE)));
                    this.solver.addClause(clause);
                    clause.clear();
                    this.solver.isSatisfiable();
                    org.junit.Assert.fail("testNoSolutionExistslitNum21 should have thrown NegativeArraySizeException");
                }
                org.junit.Assert.fail("testNoSolutionExistslitNum21_failAssert12litNum231 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testNoSolutionExistslitNum21_failAssert12litNum231_failAssert46litNum1502 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testNoSolutionExistslitNum21_failAssert12litNum254_failAssert47litNum1577_failAssert235() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    IVecInt clause = new VecInt();
                    clause.push(100).push(98);
                    this.solver.addClause(clause);
                    clause.clear();
                    clause.push((-98));
                    this.solver.addClause(clause);
                    clause.clear();
                    clause.push((-(Integer.MAX_VALUE)));
                    this.solver.addClause(clause);
                    clause.clear();
                    this.solver.isSatisfiable();
                    org.junit.Assert.fail("testNoSolutionExistslitNum21 should have thrown NegativeArraySizeException");
                }
                org.junit.Assert.fail("testNoSolutionExistslitNum21_failAssert12litNum254 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testNoSolutionExistslitNum21_failAssert12litNum254_failAssert47litNum1577 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }
}

