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
        int[] array_613597612 = new int[]{3,4};
        	int[] array_1248197255 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test__6).getLits();
        	for(int ii = 0; ii <array_613597612.length; ii++) {
        		org.junit.Assert.assertEquals(array_613597612[ii], array_1248197255[ii]);
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

    @Test(timeout = 30000)
    public void test_remove2() throws Exception, ContradictionException, TimeoutException {
        IVecInt clause = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause)).toString());
        Assert.assertTrue(((VecInt) (clause)).isEmpty());
        IVecInt o_test_remove2__3 = clause.push((-1)).push(2);
        Assert.assertEquals("-1,2", ((VecInt) (o_test_remove2__3)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_test_remove2__3)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_remove2__3)).isEmpty());
        clause.clear();
        clause.clear();
        IVecInt o_test_remove2__7 = clause.push(1);
        Assert.assertEquals("1", ((VecInt) (o_test_remove2__7)).toString());
        Assert.assertEquals(1, ((int) (((VecInt) (o_test_remove2__7)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_remove2__7)).isEmpty());
        IConstr o_test_remove2__8 = solver.addClause(clause);
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_test_remove2__8)).getActivity())), 0.1);
        Assert.assertTrue(((UnitClause) (o_test_remove2__8)).isSatisfied());
        Assert.assertEquals("1", ((UnitClause) (o_test_remove2__8)).toString());
        IVecInt o_test_remove2__10 = clause.push((-2));
        Assert.assertEquals("-2", ((VecInt) (o_test_remove2__10)).toString());
        Assert.assertEquals(-2, ((int) (((VecInt) (o_test_remove2__10)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_remove2__10)).isEmpty());
        IConstr o_test_remove2__12 = solver.addClause(clause);
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_test_remove2__12)).getActivity())), 0.1);
        Assert.assertTrue(((UnitClause) (o_test_remove2__12)).isSatisfied());
        Assert.assertEquals("-2", ((UnitClause) (o_test_remove2__12)).toString());
        solver.isSatisfiable();
        this.solver.unsatExplanation();
    }

    @Test(timeout = 30000)
    public void test_remove3() throws Exception, ContradictionException, TimeoutException {
        IVecInt clause = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause)).toString());
        Assert.assertTrue(((VecInt) (clause)).isEmpty());
        IVecInt o_test_remove3__3 = clause.push((-1)).push(2);
        Assert.assertEquals("-1,2", ((VecInt) (o_test_remove3__3)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_test_remove3__3)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_remove3__3)).isEmpty());
        IConstr o_test_remove3__6 = solver.addClause(clause);
        int[] array_604600082 = new int[]{3,4};
        	int[] array_1754635521 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove3__6).getLits();
        	for(int ii = 0; ii <array_604600082.length; ii++) {
        		org.junit.Assert.assertEquals(array_604600082[ii], array_1754635521[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_test_remove3__6)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalBinaryClause) (o_test_remove3__6)).isSatisfied());
        Assert.assertEquals("-1[?] 2[?]", ((OriginalBinaryClause) (o_test_remove3__6)).toString());
        Assert.assertEquals(3, ((int) (((OriginalBinaryClause) (o_test_remove3__6)).hashCode())));
        IVecInt o_test_remove3__7 = clause.push(1);
        Assert.assertEquals("-1,2,1", ((VecInt) (o_test_remove3__7)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_test_remove3__7)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_remove3__7)).isEmpty());
        solver.addClause(clause);
        solver.addClause(clause);
        clause.clear();
        clause.push((-2));
        solver.isSatisfiable();
        this.solver.unsatExplanation();
    }

    @Test(timeout = 30000)
    public void test_remove5() throws Exception, ContradictionException, TimeoutException {
        IVecInt clause = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause)).toString());
        Assert.assertTrue(((VecInt) (clause)).isEmpty());
        IVecInt o_test_remove5__3 = clause.push((-1)).push(2);
        Assert.assertEquals("-1,2", ((VecInt) (o_test_remove5__3)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_test_remove5__3)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_remove5__3)).isEmpty());
        IConstr o_test_remove5__6 = solver.addClause(clause);
        int[] array_93386990 = new int[]{3,4};
        	int[] array_1694934693 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove5__6).getLits();
        	for(int ii = 0; ii <array_93386990.length; ii++) {
        		org.junit.Assert.assertEquals(array_93386990[ii], array_1694934693[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_test_remove5__6)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalBinaryClause) (o_test_remove5__6)).isSatisfied());
        Assert.assertEquals("-1[?] 2[?]", ((OriginalBinaryClause) (o_test_remove5__6)).toString());
        Assert.assertEquals(3, ((int) (((OriginalBinaryClause) (o_test_remove5__6)).hashCode())));
        clause.clear();
        clause.clear();
        IVecInt o_test_remove5__8 = clause.push(1);
        Assert.assertEquals("1", ((VecInt) (o_test_remove5__8)).toString());
        Assert.assertEquals(1, ((int) (((VecInt) (o_test_remove5__8)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_remove5__8)).isEmpty());
        IVecInt o_test_remove5__10 = clause.push((-2));
        Assert.assertEquals("-2", ((VecInt) (o_test_remove5__10)).toString());
        Assert.assertEquals(-2, ((int) (((VecInt) (o_test_remove5__10)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_remove5__10)).isEmpty());
        IConstr o_test_remove5__12 = solver.addClause(clause);
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_test_remove5__12)).getActivity())), 0.1);
        Assert.assertTrue(((UnitClause) (o_test_remove5__12)).isSatisfied());
        Assert.assertEquals("-2", ((UnitClause) (o_test_remove5__12)).toString());
        solver.isSatisfiable();
        this.solver.unsatExplanation();
    }

    @Test(timeout = 30000)
    public void test_remove6() throws Exception, ContradictionException, TimeoutException {
        IVecInt clause = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause)).toString());
        Assert.assertTrue(((VecInt) (clause)).isEmpty());
        IVecInt o_test_remove6__3 = clause.push((-1)).push(2);
        Assert.assertEquals("-1,2", ((VecInt) (o_test_remove6__3)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_test_remove6__3)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_remove6__3)).isEmpty());
        IConstr o_test_remove6__6 = solver.addClause(clause);
        int[] array_693168991 = new int[]{3,4};
        	int[] array_1819371744 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove6__6).getLits();
        	for(int ii = 0; ii <array_693168991.length; ii++) {
        		org.junit.Assert.assertEquals(array_693168991[ii], array_1819371744[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_test_remove6__6)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalBinaryClause) (o_test_remove6__6)).isSatisfied());
        Assert.assertEquals("-1[?] 2[?]", ((OriginalBinaryClause) (o_test_remove6__6)).toString());
        Assert.assertEquals(3, ((int) (((OriginalBinaryClause) (o_test_remove6__6)).hashCode())));
        IConstr o_test_remove6__7 = solver.addClause(clause);
        int[] array_133895881 = new int[]{3,4};
        	int[] array_704882353 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove6__7).getLits();
        	for(int ii = 0; ii <array_133895881.length; ii++) {
        		org.junit.Assert.assertEquals(array_133895881[ii], array_704882353[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_test_remove6__7)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalBinaryClause) (o_test_remove6__7)).isSatisfied());
        Assert.assertEquals("-1[?] 2[?]", ((OriginalBinaryClause) (o_test_remove6__7)).toString());
        Assert.assertEquals(3, ((int) (((OriginalBinaryClause) (o_test_remove6__7)).hashCode())));
        clause.clear();
        IVecInt o_test_remove6__9 = clause.push(1);
        Assert.assertEquals("1", ((VecInt) (o_test_remove6__9)).toString());
        Assert.assertEquals(1, ((int) (((VecInt) (o_test_remove6__9)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_remove6__9)).isEmpty());
        IVecInt o_test_remove6__10 = clause.push((-2));
        Assert.assertEquals("1,-2", ((VecInt) (o_test_remove6__10)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_test_remove6__10)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_remove6__10)).isEmpty());
        IConstr o_test_remove6__12 = solver.addClause(clause);
        int[] array_2094448682 = new int[]{2,5};
        	int[] array_476261279 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove6__12).getLits();
        	for(int ii = 0; ii <array_2094448682.length; ii++) {
        		org.junit.Assert.assertEquals(array_2094448682[ii], array_476261279[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_test_remove6__12)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalBinaryClause) (o_test_remove6__12)).isSatisfied());
        Assert.assertEquals("1[?] -2[?]", ((OriginalBinaryClause) (o_test_remove6__12)).toString());
        Assert.assertEquals(3, ((int) (((OriginalBinaryClause) (o_test_remove6__12)).hashCode())));
        solver.isSatisfiable();
        this.solver.unsatExplanation();
    }

    @Test(timeout = 30000)
    public void test_remove7() throws Exception, ContradictionException, TimeoutException {
        IVecInt clause = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause)).toString());
        Assert.assertTrue(((VecInt) (clause)).isEmpty());
        IVecInt o_test_remove7__3 = clause.push((-1)).push(2);
        Assert.assertEquals("-1,2", ((VecInt) (o_test_remove7__3)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_test_remove7__3)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_remove7__3)).isEmpty());
        IConstr o_test_remove7__6 = solver.addClause(clause);
        int[] array_1099665245 = new int[]{3,4};
        	int[] array_1020946551 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove7__6).getLits();
        	for(int ii = 0; ii <array_1099665245.length; ii++) {
        		org.junit.Assert.assertEquals(array_1099665245[ii], array_1020946551[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_test_remove7__6)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalBinaryClause) (o_test_remove7__6)).isSatisfied());
        Assert.assertEquals("-1[?] 2[?]", ((OriginalBinaryClause) (o_test_remove7__6)).toString());
        Assert.assertEquals(3, ((int) (((OriginalBinaryClause) (o_test_remove7__6)).hashCode())));
        IConstr o_test_remove7__7 = solver.addClause(clause);
        int[] array_1495089740 = new int[]{3,4};
        	int[] array_1221105098 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove7__7).getLits();
        	for(int ii = 0; ii <array_1495089740.length; ii++) {
        		org.junit.Assert.assertEquals(array_1495089740[ii], array_1221105098[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_test_remove7__7)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalBinaryClause) (o_test_remove7__7)).isSatisfied());
        Assert.assertEquals("-1[?] 2[?]", ((OriginalBinaryClause) (o_test_remove7__7)).toString());
        Assert.assertEquals(3, ((int) (((OriginalBinaryClause) (o_test_remove7__7)).hashCode())));
        clause.clear();
        clause.clear();
        IVecInt o_test_remove7__10 = clause.push(1);
        Assert.assertEquals("1", ((VecInt) (o_test_remove7__10)).toString());
        Assert.assertEquals(1, ((int) (((VecInt) (o_test_remove7__10)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_remove7__10)).isEmpty());
        IConstr o_test_remove7__11 = solver.addClause(clause);
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_test_remove7__11)).getActivity())), 0.1);
        Assert.assertTrue(((UnitClause) (o_test_remove7__11)).isSatisfied());
        Assert.assertEquals("1", ((UnitClause) (o_test_remove7__11)).toString());
        solver.isSatisfiable();
        this.solver.unsatExplanation();
    }

    @Test(timeout = 30000)
    public void test_remove8() throws Exception, ContradictionException, TimeoutException {
        IVecInt clause = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause)).toString());
        Assert.assertTrue(((VecInt) (clause)).isEmpty());
        IVecInt o_test_remove8__3 = clause.push((-1)).push(2);
        Assert.assertEquals("-1,2", ((VecInt) (o_test_remove8__3)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_test_remove8__3)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_remove8__3)).isEmpty());
        IConstr o_test_remove8__6 = solver.addClause(clause);
        int[] array_1917574668 = new int[]{3,4};
        	int[] array_2090982333 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove8__6).getLits();
        	for(int ii = 0; ii <array_1917574668.length; ii++) {
        		org.junit.Assert.assertEquals(array_1917574668[ii], array_2090982333[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_test_remove8__6)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalBinaryClause) (o_test_remove8__6)).isSatisfied());
        Assert.assertEquals("-1[?] 2[?]", ((OriginalBinaryClause) (o_test_remove8__6)).toString());
        Assert.assertEquals(3, ((int) (((OriginalBinaryClause) (o_test_remove8__6)).hashCode())));
        IConstr o_test_remove8__7 = solver.addClause(clause);
        int[] array_1733007852 = new int[]{3,4};
        	int[] array_476141655 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove8__7).getLits();
        	for(int ii = 0; ii <array_1733007852.length; ii++) {
        		org.junit.Assert.assertEquals(array_1733007852[ii], array_476141655[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_test_remove8__7)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalBinaryClause) (o_test_remove8__7)).isSatisfied());
        Assert.assertEquals("-1[?] 2[?]", ((OriginalBinaryClause) (o_test_remove8__7)).toString());
        Assert.assertEquals(3, ((int) (((OriginalBinaryClause) (o_test_remove8__7)).hashCode())));
        clause.clear();
        clause.clear();
        IVecInt o_test_remove8__10 = clause.push(1);
        Assert.assertEquals("1", ((VecInt) (o_test_remove8__10)).toString());
        Assert.assertEquals(1, ((int) (((VecInt) (o_test_remove8__10)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_remove8__10)).isEmpty());
        IVecInt o_test_remove8__11 = clause.push((-2));
        Assert.assertEquals("1,-2", ((VecInt) (o_test_remove8__11)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_test_remove8__11)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_remove8__11)).isEmpty());
        solver.isSatisfiable();
        this.solver.unsatExplanation();
    }

    @Test(timeout = 30000)
    public void test_remove9() throws Exception, ContradictionException, TimeoutException {
        IVecInt clause = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause)).toString());
        Assert.assertTrue(((VecInt) (clause)).isEmpty());
        IVecInt o_test_remove9__3 = clause.push((-1)).push(2);
        Assert.assertEquals("-1,2", ((VecInt) (o_test_remove9__3)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_test_remove9__3)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_remove9__3)).isEmpty());
        IConstr o_test_remove9__6 = solver.addClause(clause);
        int[] array_1882063694 = new int[]{3,4};
        	int[] array_901263046 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove9__6).getLits();
        	for(int ii = 0; ii <array_1882063694.length; ii++) {
        		org.junit.Assert.assertEquals(array_1882063694[ii], array_901263046[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_test_remove9__6)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalBinaryClause) (o_test_remove9__6)).isSatisfied());
        Assert.assertEquals("-1[?] 2[?]", ((OriginalBinaryClause) (o_test_remove9__6)).toString());
        Assert.assertEquals(3, ((int) (((OriginalBinaryClause) (o_test_remove9__6)).hashCode())));
        IConstr o_test_remove9__7 = solver.addClause(clause);
        int[] array_1825005533 = new int[]{3,4};
        	int[] array_927971380 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove9__7).getLits();
        	for(int ii = 0; ii <array_1825005533.length; ii++) {
        		org.junit.Assert.assertEquals(array_1825005533[ii], array_927971380[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_test_remove9__7)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalBinaryClause) (o_test_remove9__7)).isSatisfied());
        Assert.assertEquals("-1[?] 2[?]", ((OriginalBinaryClause) (o_test_remove9__7)).toString());
        Assert.assertEquals(3, ((int) (((OriginalBinaryClause) (o_test_remove9__7)).hashCode())));
        IConstr o_test_remove9__8 = solver.addClause(clause);
        int[] array_340637712 = new int[]{3,4};
        	int[] array_2028163065 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove9__8).getLits();
        	for(int ii = 0; ii <array_340637712.length; ii++) {
        		org.junit.Assert.assertEquals(array_340637712[ii], array_2028163065[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_test_remove9__8)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalBinaryClause) (o_test_remove9__8)).isSatisfied());
        Assert.assertEquals("-1[?] 2[?]", ((OriginalBinaryClause) (o_test_remove9__8)).toString());
        Assert.assertEquals(3, ((int) (((OriginalBinaryClause) (o_test_remove9__8)).hashCode())));
        clause.clear();
        clause.clear();
        IVecInt o_test_remove9__11 = clause.push(1);
        Assert.assertEquals("1", ((VecInt) (o_test_remove9__11)).toString());
        Assert.assertEquals(1, ((int) (((VecInt) (o_test_remove9__11)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_remove9__11)).isEmpty());
        IVecInt o_test_remove9__12 = clause.push((-2));
        Assert.assertEquals("1,-2", ((VecInt) (o_test_remove9__12)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_test_remove9__12)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_remove9__12)).isEmpty());
        this.solver.isSatisfiable();
        Assert.assertEquals("1,-2", ((VecInt) (clause)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (clause)).hashCode())));
        Assert.assertFalse(((VecInt) (clause)).isEmpty());
        Assert.assertEquals("1,-2", ((VecInt) (o_test_remove9__3)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_test_remove9__3)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_remove9__3)).isEmpty());
        int[] array_194402919 = new int[]{3,4};
        	int[] array_2024550689 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove9__6).getLits();
        	for(int ii = 0; ii <array_194402919.length; ii++) {
        		org.junit.Assert.assertEquals(array_194402919[ii], array_2024550689[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_test_remove9__6)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalBinaryClause) (o_test_remove9__6)).isSatisfied());
        Assert.assertEquals("-1[?] 2[?]", ((OriginalBinaryClause) (o_test_remove9__6)).toString());
        Assert.assertEquals(3, ((int) (((OriginalBinaryClause) (o_test_remove9__6)).hashCode())));
        int[] array_1775383297 = new int[]{3,4};
        	int[] array_1318706812 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove9__7).getLits();
        	for(int ii = 0; ii <array_1775383297.length; ii++) {
        		org.junit.Assert.assertEquals(array_1775383297[ii], array_1318706812[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_test_remove9__7)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalBinaryClause) (o_test_remove9__7)).isSatisfied());
        Assert.assertEquals("-1[?] 2[?]", ((OriginalBinaryClause) (o_test_remove9__7)).toString());
        Assert.assertEquals(3, ((int) (((OriginalBinaryClause) (o_test_remove9__7)).hashCode())));
        int[] array_823822799 = new int[]{3,4};
        	int[] array_2137733469 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove9__8).getLits();
        	for(int ii = 0; ii <array_823822799.length; ii++) {
        		org.junit.Assert.assertEquals(array_823822799[ii], array_2137733469[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_test_remove9__8)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalBinaryClause) (o_test_remove9__8)).isSatisfied());
        Assert.assertEquals("-1[?] 2[?]", ((OriginalBinaryClause) (o_test_remove9__8)).toString());
        Assert.assertEquals(3, ((int) (((OriginalBinaryClause) (o_test_remove9__8)).hashCode())));
        Assert.assertEquals("1,-2", ((VecInt) (o_test_remove9__11)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_test_remove9__11)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_remove9__11)).isEmpty());
        Assert.assertEquals("1,-2", ((VecInt) (o_test_remove9__12)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_test_remove9__12)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_remove9__12)).isEmpty());
    }

    @Test(timeout = 30000)
    public void test_remove1_failAssert0() throws Exception, ContradictionException, TimeoutException {
        try {
            IVecInt clause = new VecInt();
            solver.addClause(clause);
            clause.clear();
            clause.push(1);
            solver.addClause(clause);
            clause.clear();
            clause.push((-2));
            solver.addClause(clause);
            solver.isSatisfiable();
            solver.unsatExplanation();
            org.junit.Assert.fail("test_remove1 should have thrown ContradictionException");
        } catch (ContradictionException expected) {
            Assert.assertEquals("Creating Empty clause ?", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test_remove4_failAssert1() throws Exception, ContradictionException, TimeoutException {
        try {
            IVecInt clause = new VecInt();
            clause.push((-1)).push(2);
            solver.addClause(clause);
            clause.clear();
            solver.addClause(clause);
            clause.clear();
            clause.push((-2));
            solver.addClause(clause);
            solver.isSatisfiable();
            solver.unsatExplanation();
            org.junit.Assert.fail("test_remove4 should have thrown ContradictionException");
        } catch (ContradictionException expected) {
            Assert.assertEquals("Creating Empty clause ?", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test_remove2_remove51() throws Exception, ContradictionException, TimeoutException {
        IVecInt clause = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause)).toString());
        Assert.assertTrue(((VecInt) (clause)).isEmpty());
        IVecInt o_test_remove2__3 = clause.push((-1)).push(2);
        Assert.assertEquals("-1,2", ((VecInt) (o_test_remove2__3)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_test_remove2__3)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_remove2__3)).isEmpty());
        IVecInt o_test_remove2__7 = clause.push(1);
        Assert.assertEquals("-1,2,1", ((VecInt) (o_test_remove2__7)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_test_remove2__7)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_remove2__7)).isEmpty());
        IConstr o_test_remove2__8 = solver.addClause(clause);
        clause.clear();
        IVecInt o_test_remove2__10 = clause.push((-2));
        IConstr o_test_remove2__12 = solver.addClause(clause);
        solver.isSatisfiable();
        this.solver.unsatExplanation();
    }

    @Test(timeout = 30000)
    public void test_remove2_remove53() throws Exception, ContradictionException, TimeoutException {
        IVecInt clause = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause)).toString());
        Assert.assertTrue(((VecInt) (clause)).isEmpty());
        IVecInt o_test_remove2__3 = clause.push((-1)).push(2);
        Assert.assertEquals("-1,2", ((VecInt) (o_test_remove2__3)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_test_remove2__3)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_remove2__3)).isEmpty());
        clause.clear();
        IVecInt o_test_remove2__7 = clause.push(1);
        Assert.assertEquals("1", ((VecInt) (o_test_remove2__7)).toString());
        Assert.assertEquals(1, ((int) (((VecInt) (o_test_remove2__7)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_remove2__7)).isEmpty());
        IConstr o_test_remove2__8 = solver.addClause(clause);
        Assert.assertTrue(((UnitClause) (o_test_remove2__8)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_test_remove2__8)).getActivity())), 0.1);
        Assert.assertEquals("1", ((UnitClause) (o_test_remove2__8)).toString());
        IVecInt o_test_remove2__10 = clause.push((-2));
        Assert.assertEquals("1,-2", ((VecInt) (o_test_remove2__10)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_test_remove2__10)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_remove2__10)).isEmpty());
        IConstr o_test_remove2__12 = solver.addClause(clause);
        solver.isSatisfiable();
        this.solver.unsatExplanation();
    }

    @Test(timeout = 30000)
    public void test_remove2_remove55() throws Exception, ContradictionException, TimeoutException {
        IVecInt clause = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause)).toString());
        Assert.assertTrue(((VecInt) (clause)).isEmpty());
        IVecInt o_test_remove2__3 = clause.push((-1)).push(2);
        Assert.assertEquals("-1,2", ((VecInt) (o_test_remove2__3)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_test_remove2__3)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_remove2__3)).isEmpty());
        clause.clear();
        clause.clear();
        IVecInt o_test_remove2__7 = clause.push(1);
        Assert.assertEquals("1", ((VecInt) (o_test_remove2__7)).toString());
        Assert.assertEquals(1, ((int) (((VecInt) (o_test_remove2__7)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_remove2__7)).isEmpty());
        IConstr o_test_remove2__8 = solver.addClause(clause);
        Assert.assertTrue(((UnitClause) (o_test_remove2__8)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_test_remove2__8)).getActivity())), 0.1);
        Assert.assertEquals("1", ((UnitClause) (o_test_remove2__8)).toString());
        IVecInt o_test_remove2__10 = clause.push((-2));
        Assert.assertEquals("1,-2", ((VecInt) (o_test_remove2__10)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_test_remove2__10)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_remove2__10)).isEmpty());
        IConstr o_test_remove2__12 = solver.addClause(clause);
        this.solver.unsatExplanation();
    }

    @Test(timeout = 30000)
    public void test_remove2_remove57() throws Exception, ContradictionException, TimeoutException {
        IVecInt clause = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause)).toString());
        Assert.assertTrue(((VecInt) (clause)).isEmpty());
        IVecInt o_test_remove2__3 = clause.push((-1)).push(2);
        Assert.assertEquals("-1,2", ((VecInt) (o_test_remove2__3)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_test_remove2__3)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_remove2__3)).isEmpty());
        clause.clear();
        clause.clear();
        IVecInt o_test_remove2__7 = clause.push(1);
        Assert.assertEquals("1", ((VecInt) (o_test_remove2__7)).toString());
        Assert.assertEquals(1, ((int) (((VecInt) (o_test_remove2__7)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_remove2__7)).isEmpty());
        IConstr o_test_remove2__8 = solver.addClause(clause);
        Assert.assertTrue(((UnitClause) (o_test_remove2__8)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_test_remove2__8)).getActivity())), 0.1);
        Assert.assertEquals("1", ((UnitClause) (o_test_remove2__8)).toString());
        IVecInt o_test_remove2__10 = clause.push((-2));
        Assert.assertEquals("1,-2", ((VecInt) (o_test_remove2__10)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_test_remove2__10)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_remove2__10)).isEmpty());
        IConstr o_test_remove2__12 = solver.addClause(clause);
        this.solver.isSatisfiable();
    }

    @Test(timeout = 30000)
    public void test_remove3_remove39() throws Exception, ContradictionException, TimeoutException {
        IVecInt clause = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause)).toString());
        Assert.assertTrue(((VecInt) (clause)).isEmpty());
        IVecInt o_test_remove3__3 = clause.push((-1)).push(2);
        Assert.assertEquals("-1,2", ((VecInt) (o_test_remove3__3)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_test_remove3__3)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_remove3__3)).isEmpty());
        IConstr o_test_remove3__6 = solver.addClause(clause);
        int[] array_376272347 = new int[]{3,4};
        	int[] array_2013800860 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove3__6).getLits();
        	for(int ii = 0; ii <array_376272347.length; ii++) {
        		org.junit.Assert.assertEquals(array_376272347[ii], array_2013800860[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_test_remove3__6)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_test_remove3__6)).getActivity())), 0.1);
        Assert.assertEquals("-1[?] 2[?]", ((OriginalBinaryClause) (o_test_remove3__6)).toString());
        Assert.assertEquals(3, ((int) (((OriginalBinaryClause) (o_test_remove3__6)).hashCode())));
        int[] array_604600082 = new int[]{3,4};
        	int[] array_1754635521 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove3__6).getLits();
        	for(int ii = 0; ii <array_604600082.length; ii++) {
        		org.junit.Assert.assertEquals(array_604600082[ii], array_1754635521[ii]);
        	};
        IVecInt o_test_remove3__7 = clause.push(1);
        Assert.assertEquals("-1,2,1", ((VecInt) (o_test_remove3__7)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_test_remove3__7)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_remove3__7)).isEmpty());
        clause.clear();
        IVecInt o_test_remove3_remove39__17 = clause.push((-2));
        Assert.assertEquals("-2", ((VecInt) (o_test_remove3_remove39__17)).toString());
        Assert.assertEquals(-2, ((int) (((VecInt) (o_test_remove3_remove39__17)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_remove3_remove39__17)).isEmpty());
        IConstr o_test_remove3_remove39__19 = solver.addClause(clause);
        Assert.assertTrue(((UnitClause) (o_test_remove3_remove39__19)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_test_remove3_remove39__19)).getActivity())), 0.1);
        Assert.assertEquals("-2", ((UnitClause) (o_test_remove3_remove39__19)).toString());
        solver.isSatisfiable();
        this.solver.unsatExplanation();
    }

    @Test(timeout = 30000)
    public void test_remove3_remove40() throws Exception, ContradictionException, TimeoutException {
        IVecInt clause = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause)).toString());
        Assert.assertTrue(((VecInt) (clause)).isEmpty());
        IVecInt o_test_remove3__3 = clause.push((-1)).push(2);
        Assert.assertEquals("-1,2", ((VecInt) (o_test_remove3__3)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_test_remove3__3)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_remove3__3)).isEmpty());
        IConstr o_test_remove3__6 = solver.addClause(clause);
        int[] array_459256098 = new int[]{3,4};
        	int[] array_1110374170 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove3__6).getLits();
        	for(int ii = 0; ii <array_459256098.length; ii++) {
        		org.junit.Assert.assertEquals(array_459256098[ii], array_1110374170[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_test_remove3__6)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_test_remove3__6)).getActivity())), 0.1);
        Assert.assertEquals("-1[?] 2[?]", ((OriginalBinaryClause) (o_test_remove3__6)).toString());
        Assert.assertEquals(3, ((int) (((OriginalBinaryClause) (o_test_remove3__6)).hashCode())));
        int[] array_604600082 = new int[]{3,4};
        	int[] array_1754635521 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove3__6).getLits();
        	for(int ii = 0; ii <array_604600082.length; ii++) {
        		org.junit.Assert.assertEquals(array_604600082[ii], array_1754635521[ii]);
        	};
        IVecInt o_test_remove3__7 = clause.push(1);
        Assert.assertEquals("-1,2,1", ((VecInt) (o_test_remove3__7)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_test_remove3__7)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_remove3__7)).isEmpty());
        solver.addClause(clause);
        solver.addClause(clause);
        clause.push((-2));
        solver.isSatisfiable();
        this.solver.unsatExplanation();
    }

    @Test(timeout = 30000)
    public void test_remove3_remove44() throws Exception, ContradictionException, TimeoutException {
        IVecInt clause = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause)).toString());
        Assert.assertTrue(((VecInt) (clause)).isEmpty());
        IVecInt o_test_remove3__3 = clause.push((-1)).push(2);
        Assert.assertEquals("-1,2", ((VecInt) (o_test_remove3__3)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_test_remove3__3)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_remove3__3)).isEmpty());
        IConstr o_test_remove3__6 = solver.addClause(clause);
        int[] array_2035717878 = new int[]{3,4};
        	int[] array_2069531944 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove3__6).getLits();
        	for(int ii = 0; ii <array_2035717878.length; ii++) {
        		org.junit.Assert.assertEquals(array_2035717878[ii], array_2069531944[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_test_remove3__6)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_test_remove3__6)).getActivity())), 0.1);
        Assert.assertEquals("-1[?] 2[?]", ((OriginalBinaryClause) (o_test_remove3__6)).toString());
        Assert.assertEquals(3, ((int) (((OriginalBinaryClause) (o_test_remove3__6)).hashCode())));
        int[] array_604600082 = new int[]{3,4};
        	int[] array_1754635521 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove3__6).getLits();
        	for(int ii = 0; ii <array_604600082.length; ii++) {
        		org.junit.Assert.assertEquals(array_604600082[ii], array_1754635521[ii]);
        	};
        IVecInt o_test_remove3__7 = clause.push(1);
        Assert.assertEquals("-1,2,1", ((VecInt) (o_test_remove3__7)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_test_remove3__7)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_remove3__7)).isEmpty());
        solver.addClause(clause);
        clause.clear();
        clause.push((-2));
        solver.isSatisfiable();
        this.solver.unsatExplanation();
    }

    @Test(timeout = 30000)
    public void test_remove3_remove47() throws Exception, ContradictionException, TimeoutException {
        IVecInt clause = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause)).toString());
        Assert.assertTrue(((VecInt) (clause)).isEmpty());
        IVecInt o_test_remove3__3 = clause.push((-1)).push(2);
        Assert.assertEquals("-1,2", ((VecInt) (o_test_remove3__3)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_test_remove3__3)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_remove3__3)).isEmpty());
        IConstr o_test_remove3__6 = solver.addClause(clause);
        int[] array_1439016066 = new int[]{3,4};
        	int[] array_1867322158 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove3__6).getLits();
        	for(int ii = 0; ii <array_1439016066.length; ii++) {
        		org.junit.Assert.assertEquals(array_1439016066[ii], array_1867322158[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_test_remove3__6)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_test_remove3__6)).getActivity())), 0.1);
        Assert.assertEquals("-1[?] 2[?]", ((OriginalBinaryClause) (o_test_remove3__6)).toString());
        Assert.assertEquals(3, ((int) (((OriginalBinaryClause) (o_test_remove3__6)).hashCode())));
        int[] array_604600082 = new int[]{3,4};
        	int[] array_1754635521 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove3__6).getLits();
        	for(int ii = 0; ii <array_604600082.length; ii++) {
        		org.junit.Assert.assertEquals(array_604600082[ii], array_1754635521[ii]);
        	};
        IVecInt o_test_remove3__7 = clause.push(1);
        Assert.assertEquals("-1,2,1", ((VecInt) (o_test_remove3__7)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_test_remove3__7)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_remove3__7)).isEmpty());
        solver.addClause(clause);
        solver.addClause(clause);
        clause.clear();
        clause.push((-2));
        this.solver.unsatExplanation();
    }

    @Test(timeout = 30000)
    public void test_remove3_remove48() throws Exception, ContradictionException, TimeoutException {
        IVecInt clause = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause)).toString());
        Assert.assertTrue(((VecInt) (clause)).isEmpty());
        IVecInt o_test_remove3__3 = clause.push((-1)).push(2);
        Assert.assertEquals("-1,2", ((VecInt) (o_test_remove3__3)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_test_remove3__3)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_remove3__3)).isEmpty());
        IConstr o_test_remove3__6 = solver.addClause(clause);
        int[] array_2076912544 = new int[]{3,4};
        	int[] array_1469107799 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove3__6).getLits();
        	for(int ii = 0; ii <array_2076912544.length; ii++) {
        		org.junit.Assert.assertEquals(array_2076912544[ii], array_1469107799[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_test_remove3__6)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_test_remove3__6)).getActivity())), 0.1);
        Assert.assertEquals("-1[?] 2[?]", ((OriginalBinaryClause) (o_test_remove3__6)).toString());
        Assert.assertEquals(3, ((int) (((OriginalBinaryClause) (o_test_remove3__6)).hashCode())));
        int[] array_604600082 = new int[]{3,4};
        	int[] array_1754635521 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove3__6).getLits();
        	for(int ii = 0; ii <array_604600082.length; ii++) {
        		org.junit.Assert.assertEquals(array_604600082[ii], array_1754635521[ii]);
        	};
        IVecInt o_test_remove3__7 = clause.push(1);
        Assert.assertEquals("-1,2,1", ((VecInt) (o_test_remove3__7)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_test_remove3__7)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_remove3__7)).isEmpty());
        solver.addClause(clause);
        solver.addClause(clause);
        clause.clear();
        clause.push((-2));
        this.solver.isSatisfiable();
    }

    @Test(timeout = 30000)
    public void test_remove5_remove38() throws Exception, ContradictionException, TimeoutException {
        IVecInt clause = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause)).toString());
        Assert.assertTrue(((VecInt) (clause)).isEmpty());
        IVecInt o_test_remove5__3 = clause.push((-1)).push(2);
        Assert.assertEquals("-1,2", ((VecInt) (o_test_remove5__3)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_test_remove5__3)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_remove5__3)).isEmpty());
        IConstr o_test_remove5__6 = solver.addClause(clause);
        int[] array_974525135 = new int[]{3,4};
        	int[] array_739918547 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove5__6).getLits();
        	for(int ii = 0; ii <array_974525135.length; ii++) {
        		org.junit.Assert.assertEquals(array_974525135[ii], array_739918547[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_test_remove5__6)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_test_remove5__6)).getActivity())), 0.1);
        Assert.assertEquals("-1[?] 2[?]", ((OriginalBinaryClause) (o_test_remove5__6)).toString());
        Assert.assertEquals(3, ((int) (((OriginalBinaryClause) (o_test_remove5__6)).hashCode())));
        int[] array_93386990 = new int[]{3,4};
        	int[] array_1694934693 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove5__6).getLits();
        	for(int ii = 0; ii <array_93386990.length; ii++) {
        		org.junit.Assert.assertEquals(array_93386990[ii], array_1694934693[ii]);
        	};
        clause.clear();
        IVecInt o_test_remove5__8 = clause.push(1);
        Assert.assertEquals("1", ((VecInt) (o_test_remove5__8)).toString());
        Assert.assertEquals(1, ((int) (((VecInt) (o_test_remove5__8)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_remove5__8)).isEmpty());
        IVecInt o_test_remove5__10 = clause.push((-2));
        Assert.assertEquals("1,-2", ((VecInt) (o_test_remove5__10)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_test_remove5__10)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_remove5__10)).isEmpty());
        IConstr o_test_remove5__12 = solver.addClause(clause);
        int[] array_231144324 = new int[]{2,5};
        	int[] array_1281367601 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove5__12).getLits();
        	for(int ii = 0; ii <array_231144324.length; ii++) {
        		org.junit.Assert.assertEquals(array_231144324[ii], array_1281367601[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_test_remove5__12)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_test_remove5__12)).getActivity())), 0.1);
        Assert.assertEquals("1[?] -2[?]", ((OriginalBinaryClause) (o_test_remove5__12)).toString());
        Assert.assertEquals(3, ((int) (((OriginalBinaryClause) (o_test_remove5__12)).hashCode())));
        solver.isSatisfiable();
        this.solver.unsatExplanation();
    }

    @Test(timeout = 30000)
    public void test_remove5_remove45() throws Exception, ContradictionException, TimeoutException {
        IVecInt clause = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause)).toString());
        Assert.assertTrue(((VecInt) (clause)).isEmpty());
        IVecInt o_test_remove5__3 = clause.push((-1)).push(2);
        Assert.assertEquals("-1,2", ((VecInt) (o_test_remove5__3)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_test_remove5__3)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_remove5__3)).isEmpty());
        IConstr o_test_remove5__6 = solver.addClause(clause);
        int[] array_309932283 = new int[]{3,4};
        	int[] array_750147619 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove5__6).getLits();
        	for(int ii = 0; ii <array_309932283.length; ii++) {
        		org.junit.Assert.assertEquals(array_309932283[ii], array_750147619[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_test_remove5__6)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_test_remove5__6)).getActivity())), 0.1);
        Assert.assertEquals("-1[?] 2[?]", ((OriginalBinaryClause) (o_test_remove5__6)).toString());
        Assert.assertEquals(3, ((int) (((OriginalBinaryClause) (o_test_remove5__6)).hashCode())));
        int[] array_93386990 = new int[]{3,4};
        	int[] array_1694934693 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove5__6).getLits();
        	for(int ii = 0; ii <array_93386990.length; ii++) {
        		org.junit.Assert.assertEquals(array_93386990[ii], array_1694934693[ii]);
        	};
        clause.clear();
        clause.clear();
        IVecInt o_test_remove5__8 = clause.push(1);
        Assert.assertEquals("1", ((VecInt) (o_test_remove5__8)).toString());
        Assert.assertEquals(1, ((int) (((VecInt) (o_test_remove5__8)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_remove5__8)).isEmpty());
        IVecInt o_test_remove5__10 = clause.push((-2));
        Assert.assertEquals("1,-2", ((VecInt) (o_test_remove5__10)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_test_remove5__10)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_remove5__10)).isEmpty());
        IConstr o_test_remove5__12 = solver.addClause(clause);
        int[] array_1546312652 = new int[]{2,5};
        	int[] array_1916813367 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove5__12).getLits();
        	for(int ii = 0; ii <array_1546312652.length; ii++) {
        		org.junit.Assert.assertEquals(array_1546312652[ii], array_1916813367[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_test_remove5__12)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_test_remove5__12)).getActivity())), 0.1);
        Assert.assertEquals("1[?] -2[?]", ((OriginalBinaryClause) (o_test_remove5__12)).toString());
        Assert.assertEquals(3, ((int) (((OriginalBinaryClause) (o_test_remove5__12)).hashCode())));
        this.solver.unsatExplanation();
    }

    @Test(timeout = 30000)
    public void test_remove5_remove49() throws Exception, ContradictionException, TimeoutException {
        IVecInt clause = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause)).toString());
        Assert.assertTrue(((VecInt) (clause)).isEmpty());
        IVecInt o_test_remove5__3 = clause.push((-1)).push(2);
        Assert.assertEquals("-1,2", ((VecInt) (o_test_remove5__3)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_test_remove5__3)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_remove5__3)).isEmpty());
        IConstr o_test_remove5__6 = solver.addClause(clause);
        int[] array_1307195635 = new int[]{3,4};
        	int[] array_1886911774 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove5__6).getLits();
        	for(int ii = 0; ii <array_1307195635.length; ii++) {
        		org.junit.Assert.assertEquals(array_1307195635[ii], array_1886911774[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_test_remove5__6)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_test_remove5__6)).getActivity())), 0.1);
        Assert.assertEquals("-1[?] 2[?]", ((OriginalBinaryClause) (o_test_remove5__6)).toString());
        Assert.assertEquals(3, ((int) (((OriginalBinaryClause) (o_test_remove5__6)).hashCode())));
        int[] array_93386990 = new int[]{3,4};
        	int[] array_1694934693 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove5__6).getLits();
        	for(int ii = 0; ii <array_93386990.length; ii++) {
        		org.junit.Assert.assertEquals(array_93386990[ii], array_1694934693[ii]);
        	};
        clause.clear();
        clause.clear();
        IVecInt o_test_remove5__8 = clause.push(1);
        Assert.assertEquals("1", ((VecInt) (o_test_remove5__8)).toString());
        Assert.assertEquals(1, ((int) (((VecInt) (o_test_remove5__8)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_remove5__8)).isEmpty());
        IVecInt o_test_remove5__10 = clause.push((-2));
        Assert.assertEquals("1,-2", ((VecInt) (o_test_remove5__10)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_test_remove5__10)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_remove5__10)).isEmpty());
        IConstr o_test_remove5__12 = solver.addClause(clause);
        int[] array_827161975 = new int[]{2,5};
        	int[] array_737501397 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove5__12).getLits();
        	for(int ii = 0; ii <array_827161975.length; ii++) {
        		org.junit.Assert.assertEquals(array_827161975[ii], array_737501397[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_test_remove5__12)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_test_remove5__12)).getActivity())), 0.1);
        Assert.assertEquals("1[?] -2[?]", ((OriginalBinaryClause) (o_test_remove5__12)).toString());
        Assert.assertEquals(3, ((int) (((OriginalBinaryClause) (o_test_remove5__12)).hashCode())));
        this.solver.isSatisfiable();
        Assert.assertEquals("1,-2", ((VecInt) (clause)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (clause)).hashCode())));
        Assert.assertFalse(((VecInt) (clause)).isEmpty());
        Assert.assertEquals("1,-2", ((VecInt) (o_test_remove5__3)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_test_remove5__3)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_remove5__3)).isEmpty());
        int[] array_1307483367 = new int[]{3,4};
        	int[] array_1605040354 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove5__6).getLits();
        	for(int ii = 0; ii <array_1307483367.length; ii++) {
        		org.junit.Assert.assertEquals(array_1307483367[ii], array_1605040354[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_test_remove5__6)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_test_remove5__6)).getActivity())), 0.1);
        Assert.assertEquals("-1[?] 2[?]", ((OriginalBinaryClause) (o_test_remove5__6)).toString());
        Assert.assertEquals(3, ((int) (((OriginalBinaryClause) (o_test_remove5__6)).hashCode())));
        Assert.assertEquals("1,-2", ((VecInt) (o_test_remove5__8)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_test_remove5__8)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_remove5__8)).isEmpty());
        Assert.assertEquals("1,-2", ((VecInt) (o_test_remove5__10)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_test_remove5__10)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_remove5__10)).isEmpty());
        int[] array_344963405 = new int[]{2,5};
        	int[] array_369915631 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove5__12).getLits();
        	for(int ii = 0; ii <array_344963405.length; ii++) {
        		org.junit.Assert.assertEquals(array_344963405[ii], array_369915631[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_test_remove5__12)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_test_remove5__12)).getActivity())), 0.1);
        Assert.assertEquals("1[?] -2[?]", ((OriginalBinaryClause) (o_test_remove5__12)).toString());
        Assert.assertEquals(3, ((int) (((OriginalBinaryClause) (o_test_remove5__12)).hashCode())));
    }

    @Test(timeout = 30000)
    public void test_remove7_remove52() throws Exception, ContradictionException, TimeoutException {
        IVecInt clause = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause)).toString());
        Assert.assertTrue(((VecInt) (clause)).isEmpty());
        IVecInt o_test_remove7__3 = clause.push((-1)).push(2);
        Assert.assertEquals("-1,2", ((VecInt) (o_test_remove7__3)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_test_remove7__3)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_remove7__3)).isEmpty());
        IConstr o_test_remove7__6 = solver.addClause(clause);
        int[] array_994963651 = new int[]{3,4};
        	int[] array_1810461298 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove7__6).getLits();
        	for(int ii = 0; ii <array_994963651.length; ii++) {
        		org.junit.Assert.assertEquals(array_994963651[ii], array_1810461298[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_test_remove7__6)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_test_remove7__6)).getActivity())), 0.1);
        Assert.assertEquals("-1[?] 2[?]", ((OriginalBinaryClause) (o_test_remove7__6)).toString());
        Assert.assertEquals(3, ((int) (((OriginalBinaryClause) (o_test_remove7__6)).hashCode())));
        int[] array_1099665245 = new int[]{3,4};
        	int[] array_1020946551 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove7__6).getLits();
        	for(int ii = 0; ii <array_1099665245.length; ii++) {
        		org.junit.Assert.assertEquals(array_1099665245[ii], array_1020946551[ii]);
        	};
        IConstr o_test_remove7__7 = solver.addClause(clause);
        int[] array_1227856507 = new int[]{3,4};
        	int[] array_713970107 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove7__7).getLits();
        	for(int ii = 0; ii <array_1227856507.length; ii++) {
        		org.junit.Assert.assertEquals(array_1227856507[ii], array_713970107[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_test_remove7__7)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_test_remove7__7)).getActivity())), 0.1);
        Assert.assertEquals("-1[?] 2[?]", ((OriginalBinaryClause) (o_test_remove7__7)).toString());
        Assert.assertEquals(3, ((int) (((OriginalBinaryClause) (o_test_remove7__7)).hashCode())));
        int[] array_1495089740 = new int[]{3,4};
        	int[] array_1221105098 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove7__7).getLits();
        	for(int ii = 0; ii <array_1495089740.length; ii++) {
        		org.junit.Assert.assertEquals(array_1495089740[ii], array_1221105098[ii]);
        	};
        clause.clear();
        IVecInt o_test_remove7__10 = clause.push(1);
        Assert.assertEquals("1", ((VecInt) (o_test_remove7__10)).toString());
        Assert.assertEquals(1, ((int) (((VecInt) (o_test_remove7__10)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_remove7__10)).isEmpty());
        IConstr o_test_remove7__11 = solver.addClause(clause);
        Assert.assertTrue(((UnitClause) (o_test_remove7__11)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_test_remove7__11)).getActivity())), 0.1);
        Assert.assertEquals("1", ((UnitClause) (o_test_remove7__11)).toString());
        solver.isSatisfiable();
        this.solver.unsatExplanation();
    }

    @Test(timeout = 30000)
    public void test_remove7_remove58() throws Exception, ContradictionException, TimeoutException {
        IVecInt clause = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause)).toString());
        Assert.assertTrue(((VecInt) (clause)).isEmpty());
        IVecInt o_test_remove7__3 = clause.push((-1)).push(2);
        Assert.assertEquals("-1,2", ((VecInt) (o_test_remove7__3)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_test_remove7__3)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_remove7__3)).isEmpty());
        IConstr o_test_remove7__6 = solver.addClause(clause);
        int[] array_944630394 = new int[]{3,4};
        	int[] array_218714234 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove7__6).getLits();
        	for(int ii = 0; ii <array_944630394.length; ii++) {
        		org.junit.Assert.assertEquals(array_944630394[ii], array_218714234[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_test_remove7__6)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_test_remove7__6)).getActivity())), 0.1);
        Assert.assertEquals("-1[?] 2[?]", ((OriginalBinaryClause) (o_test_remove7__6)).toString());
        Assert.assertEquals(3, ((int) (((OriginalBinaryClause) (o_test_remove7__6)).hashCode())));
        int[] array_1099665245 = new int[]{3,4};
        	int[] array_1020946551 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove7__6).getLits();
        	for(int ii = 0; ii <array_1099665245.length; ii++) {
        		org.junit.Assert.assertEquals(array_1099665245[ii], array_1020946551[ii]);
        	};
        IConstr o_test_remove7__7 = solver.addClause(clause);
        int[] array_1520847815 = new int[]{3,4};
        	int[] array_2069838431 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove7__7).getLits();
        	for(int ii = 0; ii <array_1520847815.length; ii++) {
        		org.junit.Assert.assertEquals(array_1520847815[ii], array_2069838431[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_test_remove7__7)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_test_remove7__7)).getActivity())), 0.1);
        Assert.assertEquals("-1[?] 2[?]", ((OriginalBinaryClause) (o_test_remove7__7)).toString());
        Assert.assertEquals(3, ((int) (((OriginalBinaryClause) (o_test_remove7__7)).hashCode())));
        int[] array_1495089740 = new int[]{3,4};
        	int[] array_1221105098 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove7__7).getLits();
        	for(int ii = 0; ii <array_1495089740.length; ii++) {
        		org.junit.Assert.assertEquals(array_1495089740[ii], array_1221105098[ii]);
        	};
        clause.clear();
        clause.clear();
        IVecInt o_test_remove7__10 = clause.push(1);
        Assert.assertEquals("1", ((VecInt) (o_test_remove7__10)).toString());
        Assert.assertEquals(1, ((int) (((VecInt) (o_test_remove7__10)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_remove7__10)).isEmpty());
        IConstr o_test_remove7__11 = solver.addClause(clause);
        Assert.assertTrue(((UnitClause) (o_test_remove7__11)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_test_remove7__11)).getActivity())), 0.1);
        Assert.assertEquals("1", ((UnitClause) (o_test_remove7__11)).toString());
        this.solver.unsatExplanation();
    }

    @Test(timeout = 30000)
    public void test_remove7_remove59() throws Exception, ContradictionException, TimeoutException {
        IVecInt clause = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause)).toString());
        Assert.assertTrue(((VecInt) (clause)).isEmpty());
        IVecInt o_test_remove7__3 = clause.push((-1)).push(2);
        Assert.assertEquals("-1,2", ((VecInt) (o_test_remove7__3)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_test_remove7__3)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_remove7__3)).isEmpty());
        IConstr o_test_remove7__6 = solver.addClause(clause);
        int[] array_444312794 = new int[]{3,4};
        	int[] array_1448749422 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove7__6).getLits();
        	for(int ii = 0; ii <array_444312794.length; ii++) {
        		org.junit.Assert.assertEquals(array_444312794[ii], array_1448749422[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_test_remove7__6)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_test_remove7__6)).getActivity())), 0.1);
        Assert.assertEquals("-1[?] 2[?]", ((OriginalBinaryClause) (o_test_remove7__6)).toString());
        Assert.assertEquals(3, ((int) (((OriginalBinaryClause) (o_test_remove7__6)).hashCode())));
        int[] array_1099665245 = new int[]{3,4};
        	int[] array_1020946551 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove7__6).getLits();
        	for(int ii = 0; ii <array_1099665245.length; ii++) {
        		org.junit.Assert.assertEquals(array_1099665245[ii], array_1020946551[ii]);
        	};
        IConstr o_test_remove7__7 = solver.addClause(clause);
        int[] array_362830603 = new int[]{3,4};
        	int[] array_1130414306 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove7__7).getLits();
        	for(int ii = 0; ii <array_362830603.length; ii++) {
        		org.junit.Assert.assertEquals(array_362830603[ii], array_1130414306[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_test_remove7__7)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_test_remove7__7)).getActivity())), 0.1);
        Assert.assertEquals("-1[?] 2[?]", ((OriginalBinaryClause) (o_test_remove7__7)).toString());
        Assert.assertEquals(3, ((int) (((OriginalBinaryClause) (o_test_remove7__7)).hashCode())));
        int[] array_1495089740 = new int[]{3,4};
        	int[] array_1221105098 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove7__7).getLits();
        	for(int ii = 0; ii <array_1495089740.length; ii++) {
        		org.junit.Assert.assertEquals(array_1495089740[ii], array_1221105098[ii]);
        	};
        clause.clear();
        clause.clear();
        IVecInt o_test_remove7__10 = clause.push(1);
        Assert.assertEquals("1", ((VecInt) (o_test_remove7__10)).toString());
        Assert.assertEquals(1, ((int) (((VecInt) (o_test_remove7__10)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_remove7__10)).isEmpty());
        IConstr o_test_remove7__11 = solver.addClause(clause);
        Assert.assertTrue(((UnitClause) (o_test_remove7__11)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_test_remove7__11)).getActivity())), 0.1);
        Assert.assertEquals("1", ((UnitClause) (o_test_remove7__11)).toString());
        this.solver.isSatisfiable();
        Assert.assertEquals("1", ((VecInt) (clause)).toString());
        Assert.assertEquals(1, ((int) (((VecInt) (clause)).hashCode())));
        Assert.assertFalse(((VecInt) (clause)).isEmpty());
        Assert.assertEquals("1", ((VecInt) (o_test_remove7__3)).toString());
        Assert.assertEquals(1, ((int) (((VecInt) (o_test_remove7__3)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_remove7__3)).isEmpty());
        int[] array_1757647601 = new int[]{3,4};
        	int[] array_613481288 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove7__6).getLits();
        	for(int ii = 0; ii <array_1757647601.length; ii++) {
        		org.junit.Assert.assertEquals(array_1757647601[ii], array_613481288[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_test_remove7__6)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_test_remove7__6)).getActivity())), 0.1);
        Assert.assertEquals("-1[F] 2[?]", ((OriginalBinaryClause) (o_test_remove7__6)).toString());
        Assert.assertEquals(3, ((int) (((OriginalBinaryClause) (o_test_remove7__6)).hashCode())));
        int[] array_220926561 = new int[]{3,4};
        	int[] array_513100619 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove7__7).getLits();
        	for(int ii = 0; ii <array_220926561.length; ii++) {
        		org.junit.Assert.assertEquals(array_220926561[ii], array_513100619[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_test_remove7__7)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_test_remove7__7)).getActivity())), 0.1);
        Assert.assertEquals("-1[F] 2[?]", ((OriginalBinaryClause) (o_test_remove7__7)).toString());
        Assert.assertEquals(3, ((int) (((OriginalBinaryClause) (o_test_remove7__7)).hashCode())));
        Assert.assertEquals("1", ((VecInt) (o_test_remove7__10)).toString());
        Assert.assertEquals(1, ((int) (((VecInt) (o_test_remove7__10)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_remove7__10)).isEmpty());
        Assert.assertTrue(((UnitClause) (o_test_remove7__11)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_test_remove7__11)).getActivity())), 0.1);
        Assert.assertEquals("1", ((UnitClause) (o_test_remove7__11)).toString());
    }

    @Test(timeout = 30000)
    public void test_remove8_remove35() throws Exception, ContradictionException, TimeoutException {
        IVecInt clause = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause)).toString());
        Assert.assertTrue(((VecInt) (clause)).isEmpty());
        IVecInt o_test_remove8__3 = clause.push((-1)).push(2);
        Assert.assertEquals("-1,2", ((VecInt) (o_test_remove8__3)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_test_remove8__3)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_remove8__3)).isEmpty());
        IConstr o_test_remove8__6 = solver.addClause(clause);
        int[] array_203350472 = new int[]{3,4};
        	int[] array_934378535 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove8__6).getLits();
        	for(int ii = 0; ii <array_203350472.length; ii++) {
        		org.junit.Assert.assertEquals(array_203350472[ii], array_934378535[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_test_remove8__6)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_test_remove8__6)).getActivity())), 0.1);
        Assert.assertEquals("-1[?] 2[?]", ((OriginalBinaryClause) (o_test_remove8__6)).toString());
        Assert.assertEquals(3, ((int) (((OriginalBinaryClause) (o_test_remove8__6)).hashCode())));
        int[] array_1917574668 = new int[]{3,4};
        	int[] array_2090982333 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove8__6).getLits();
        	for(int ii = 0; ii <array_1917574668.length; ii++) {
        		org.junit.Assert.assertEquals(array_1917574668[ii], array_2090982333[ii]);
        	};
        IConstr o_test_remove8__7 = solver.addClause(clause);
        int[] array_503713077 = new int[]{3,4};
        	int[] array_1999051967 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove8__7).getLits();
        	for(int ii = 0; ii <array_503713077.length; ii++) {
        		org.junit.Assert.assertEquals(array_503713077[ii], array_1999051967[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_test_remove8__7)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_test_remove8__7)).getActivity())), 0.1);
        Assert.assertEquals("-1[?] 2[?]", ((OriginalBinaryClause) (o_test_remove8__7)).toString());
        Assert.assertEquals(3, ((int) (((OriginalBinaryClause) (o_test_remove8__7)).hashCode())));
        int[] array_1733007852 = new int[]{3,4};
        	int[] array_476141655 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove8__7).getLits();
        	for(int ii = 0; ii <array_1733007852.length; ii++) {
        		org.junit.Assert.assertEquals(array_1733007852[ii], array_476141655[ii]);
        	};
        clause.clear();
        IVecInt o_test_remove8__10 = clause.push(1);
        Assert.assertEquals("1", ((VecInt) (o_test_remove8__10)).toString());
        Assert.assertEquals(1, ((int) (((VecInt) (o_test_remove8__10)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_remove8__10)).isEmpty());
        IVecInt o_test_remove8__11 = clause.push((-2));
        Assert.assertEquals("1,-2", ((VecInt) (o_test_remove8__11)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_test_remove8__11)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_remove8__11)).isEmpty());
        solver.isSatisfiable();
        this.solver.unsatExplanation();
    }

    @Test(timeout = 30000)
    public void test_remove8_remove46() throws Exception, ContradictionException, TimeoutException {
        IVecInt clause = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause)).toString());
        Assert.assertTrue(((VecInt) (clause)).isEmpty());
        IVecInt o_test_remove8__3 = clause.push((-1)).push(2);
        Assert.assertEquals("-1,2", ((VecInt) (o_test_remove8__3)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_test_remove8__3)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_remove8__3)).isEmpty());
        IConstr o_test_remove8__6 = solver.addClause(clause);
        int[] array_1975003510 = new int[]{3,4};
        	int[] array_321839895 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove8__6).getLits();
        	for(int ii = 0; ii <array_1975003510.length; ii++) {
        		org.junit.Assert.assertEquals(array_1975003510[ii], array_321839895[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_test_remove8__6)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_test_remove8__6)).getActivity())), 0.1);
        Assert.assertEquals("-1[?] 2[?]", ((OriginalBinaryClause) (o_test_remove8__6)).toString());
        Assert.assertEquals(3, ((int) (((OriginalBinaryClause) (o_test_remove8__6)).hashCode())));
        int[] array_1917574668 = new int[]{3,4};
        	int[] array_2090982333 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove8__6).getLits();
        	for(int ii = 0; ii <array_1917574668.length; ii++) {
        		org.junit.Assert.assertEquals(array_1917574668[ii], array_2090982333[ii]);
        	};
        IConstr o_test_remove8__7 = solver.addClause(clause);
        int[] array_1066442916 = new int[]{3,4};
        	int[] array_2035055015 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove8__7).getLits();
        	for(int ii = 0; ii <array_1066442916.length; ii++) {
        		org.junit.Assert.assertEquals(array_1066442916[ii], array_2035055015[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_test_remove8__7)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_test_remove8__7)).getActivity())), 0.1);
        Assert.assertEquals("-1[?] 2[?]", ((OriginalBinaryClause) (o_test_remove8__7)).toString());
        Assert.assertEquals(3, ((int) (((OriginalBinaryClause) (o_test_remove8__7)).hashCode())));
        int[] array_1733007852 = new int[]{3,4};
        	int[] array_476141655 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove8__7).getLits();
        	for(int ii = 0; ii <array_1733007852.length; ii++) {
        		org.junit.Assert.assertEquals(array_1733007852[ii], array_476141655[ii]);
        	};
        clause.clear();
        clause.clear();
        IVecInt o_test_remove8__10 = clause.push(1);
        Assert.assertEquals("1", ((VecInt) (o_test_remove8__10)).toString());
        Assert.assertEquals(1, ((int) (((VecInt) (o_test_remove8__10)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_remove8__10)).isEmpty());
        IVecInt o_test_remove8__11 = clause.push((-2));
        Assert.assertEquals("1,-2", ((VecInt) (o_test_remove8__11)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_test_remove8__11)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_remove8__11)).isEmpty());
        this.solver.isSatisfiable();
        Assert.assertEquals("1,-2", ((VecInt) (clause)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (clause)).hashCode())));
        Assert.assertFalse(((VecInt) (clause)).isEmpty());
        Assert.assertEquals("1,-2", ((VecInt) (o_test_remove8__3)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_test_remove8__3)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_remove8__3)).isEmpty());
        int[] array_227718924 = new int[]{3,4};
        	int[] array_187789681 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove8__6).getLits();
        	for(int ii = 0; ii <array_227718924.length; ii++) {
        		org.junit.Assert.assertEquals(array_227718924[ii], array_187789681[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_test_remove8__6)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_test_remove8__6)).getActivity())), 0.1);
        Assert.assertEquals("-1[?] 2[?]", ((OriginalBinaryClause) (o_test_remove8__6)).toString());
        Assert.assertEquals(3, ((int) (((OriginalBinaryClause) (o_test_remove8__6)).hashCode())));
        int[] array_575614001 = new int[]{3,4};
        	int[] array_1891949631 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove8__7).getLits();
        	for(int ii = 0; ii <array_575614001.length; ii++) {
        		org.junit.Assert.assertEquals(array_575614001[ii], array_1891949631[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_test_remove8__7)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_test_remove8__7)).getActivity())), 0.1);
        Assert.assertEquals("-1[?] 2[?]", ((OriginalBinaryClause) (o_test_remove8__7)).toString());
        Assert.assertEquals(3, ((int) (((OriginalBinaryClause) (o_test_remove8__7)).hashCode())));
        Assert.assertEquals("1,-2", ((VecInt) (o_test_remove8__10)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_test_remove8__10)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_remove8__10)).isEmpty());
        Assert.assertEquals("1,-2", ((VecInt) (o_test_remove8__11)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_test_remove8__11)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_remove8__11)).isEmpty());
    }

    @Test(timeout = 30000)
    public void test_remove9_remove41() throws Exception, ContradictionException, TimeoutException {
        IVecInt clause = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause)).toString());
        Assert.assertTrue(((VecInt) (clause)).isEmpty());
        IVecInt o_test_remove9__3 = clause.push((-1)).push(2);
        Assert.assertEquals("-1,2", ((VecInt) (o_test_remove9__3)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_test_remove9__3)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_remove9__3)).isEmpty());
        IConstr o_test_remove9__6 = solver.addClause(clause);
        int[] array_351792462 = new int[]{3,4};
        	int[] array_346878020 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove9__6).getLits();
        	for(int ii = 0; ii <array_351792462.length; ii++) {
        		org.junit.Assert.assertEquals(array_351792462[ii], array_346878020[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_test_remove9__6)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_test_remove9__6)).getActivity())), 0.1);
        Assert.assertEquals("-1[?] 2[?]", ((OriginalBinaryClause) (o_test_remove9__6)).toString());
        Assert.assertEquals(3, ((int) (((OriginalBinaryClause) (o_test_remove9__6)).hashCode())));
        int[] array_1882063694 = new int[]{3,4};
        	int[] array_901263046 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove9__6).getLits();
        	for(int ii = 0; ii <array_1882063694.length; ii++) {
        		org.junit.Assert.assertEquals(array_1882063694[ii], array_901263046[ii]);
        	};
        IConstr o_test_remove9__7 = solver.addClause(clause);
        int[] array_782134375 = new int[]{3,4};
        	int[] array_631423233 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove9__7).getLits();
        	for(int ii = 0; ii <array_782134375.length; ii++) {
        		org.junit.Assert.assertEquals(array_782134375[ii], array_631423233[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_test_remove9__7)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_test_remove9__7)).getActivity())), 0.1);
        Assert.assertEquals("-1[?] 2[?]", ((OriginalBinaryClause) (o_test_remove9__7)).toString());
        Assert.assertEquals(3, ((int) (((OriginalBinaryClause) (o_test_remove9__7)).hashCode())));
        int[] array_1825005533 = new int[]{3,4};
        	int[] array_927971380 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove9__7).getLits();
        	for(int ii = 0; ii <array_1825005533.length; ii++) {
        		org.junit.Assert.assertEquals(array_1825005533[ii], array_927971380[ii]);
        	};
        IConstr o_test_remove9__8 = solver.addClause(clause);
        int[] array_1554650392 = new int[]{3,4};
        	int[] array_1805633005 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove9__8).getLits();
        	for(int ii = 0; ii <array_1554650392.length; ii++) {
        		org.junit.Assert.assertEquals(array_1554650392[ii], array_1805633005[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_test_remove9__8)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_test_remove9__8)).getActivity())), 0.1);
        Assert.assertEquals("-1[?] 2[?]", ((OriginalBinaryClause) (o_test_remove9__8)).toString());
        Assert.assertEquals(3, ((int) (((OriginalBinaryClause) (o_test_remove9__8)).hashCode())));
        int[] array_340637712 = new int[]{3,4};
        	int[] array_2028163065 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove9__8).getLits();
        	for(int ii = 0; ii <array_340637712.length; ii++) {
        		org.junit.Assert.assertEquals(array_340637712[ii], array_2028163065[ii]);
        	};
        clause.clear();
        IVecInt o_test_remove9__11 = clause.push(1);
        Assert.assertEquals("1", ((VecInt) (o_test_remove9__11)).toString());
        Assert.assertEquals(1, ((int) (((VecInt) (o_test_remove9__11)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_remove9__11)).isEmpty());
        IVecInt o_test_remove9__12 = clause.push((-2));
        Assert.assertEquals("1,-2", ((VecInt) (o_test_remove9__12)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_test_remove9__12)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_remove9__12)).isEmpty());
        this.solver.isSatisfiable();
        int[] array_194402919 = new int[]{3,4};
        	int[] array_2024550689 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove9__6).getLits();
        	for(int ii = 0; ii <array_194402919.length; ii++) {
        		org.junit.Assert.assertEquals(array_194402919[ii], array_2024550689[ii]);
        	};
        int[] array_1775383297 = new int[]{3,4};
        	int[] array_1318706812 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove9__7).getLits();
        	for(int ii = 0; ii <array_1775383297.length; ii++) {
        		org.junit.Assert.assertEquals(array_1775383297[ii], array_1318706812[ii]);
        	};
        int[] array_823822799 = new int[]{3,4};
        	int[] array_2137733469 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove9__8).getLits();
        	for(int ii = 0; ii <array_823822799.length; ii++) {
        		org.junit.Assert.assertEquals(array_823822799[ii], array_2137733469[ii]);
        	};
        Assert.assertEquals("1,-2", ((VecInt) (clause)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (clause)).hashCode())));
        Assert.assertFalse(((VecInt) (clause)).isEmpty());
        Assert.assertEquals("1,-2", ((VecInt) (o_test_remove9__3)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_test_remove9__3)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_remove9__3)).isEmpty());
        int[] array_1811030604 = new int[]{3,4};
        	int[] array_162359218 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove9__6).getLits();
        	for(int ii = 0; ii <array_1811030604.length; ii++) {
        		org.junit.Assert.assertEquals(array_1811030604[ii], array_162359218[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_test_remove9__6)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_test_remove9__6)).getActivity())), 0.1);
        Assert.assertEquals("-1[?] 2[?]", ((OriginalBinaryClause) (o_test_remove9__6)).toString());
        Assert.assertEquals(3, ((int) (((OriginalBinaryClause) (o_test_remove9__6)).hashCode())));
        int[] array_345250180 = new int[]{3,4};
        	int[] array_1867043952 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove9__7).getLits();
        	for(int ii = 0; ii <array_345250180.length; ii++) {
        		org.junit.Assert.assertEquals(array_345250180[ii], array_1867043952[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_test_remove9__7)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_test_remove9__7)).getActivity())), 0.1);
        Assert.assertEquals("-1[?] 2[?]", ((OriginalBinaryClause) (o_test_remove9__7)).toString());
        Assert.assertEquals(3, ((int) (((OriginalBinaryClause) (o_test_remove9__7)).hashCode())));
        int[] array_1177909530 = new int[]{3,4};
        	int[] array_1429829737 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove9__8).getLits();
        	for(int ii = 0; ii <array_1177909530.length; ii++) {
        		org.junit.Assert.assertEquals(array_1177909530[ii], array_1429829737[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_test_remove9__8)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_test_remove9__8)).getActivity())), 0.1);
        Assert.assertEquals("-1[?] 2[?]", ((OriginalBinaryClause) (o_test_remove9__8)).toString());
        Assert.assertEquals(3, ((int) (((OriginalBinaryClause) (o_test_remove9__8)).hashCode())));
        Assert.assertEquals("1,-2", ((VecInt) (o_test_remove9__11)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_test_remove9__11)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_remove9__11)).isEmpty());
        Assert.assertEquals("1,-2", ((VecInt) (o_test_remove9__12)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_test_remove9__12)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_remove9__12)).isEmpty());
    }

    @Test(timeout = 30000)
    public void test_remove9_remove56() throws Exception, ContradictionException, TimeoutException {
        IVecInt clause = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause)).toString());
        Assert.assertTrue(((VecInt) (clause)).isEmpty());
        IVecInt o_test_remove9__3 = clause.push((-1)).push(2);
        Assert.assertEquals("-1,2", ((VecInt) (o_test_remove9__3)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_test_remove9__3)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_remove9__3)).isEmpty());
        IConstr o_test_remove9__6 = solver.addClause(clause);
        int[] array_15999762 = new int[]{3,4};
        	int[] array_1062577317 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove9__6).getLits();
        	for(int ii = 0; ii <array_15999762.length; ii++) {
        		org.junit.Assert.assertEquals(array_15999762[ii], array_1062577317[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_test_remove9__6)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_test_remove9__6)).getActivity())), 0.1);
        Assert.assertEquals("-1[?] 2[?]", ((OriginalBinaryClause) (o_test_remove9__6)).toString());
        Assert.assertEquals(3, ((int) (((OriginalBinaryClause) (o_test_remove9__6)).hashCode())));
        int[] array_1882063694 = new int[]{3,4};
        	int[] array_901263046 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove9__6).getLits();
        	for(int ii = 0; ii <array_1882063694.length; ii++) {
        		org.junit.Assert.assertEquals(array_1882063694[ii], array_901263046[ii]);
        	};
        IConstr o_test_remove9__7 = solver.addClause(clause);
        int[] array_1647490445 = new int[]{3,4};
        	int[] array_1523841896 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove9__7).getLits();
        	for(int ii = 0; ii <array_1647490445.length; ii++) {
        		org.junit.Assert.assertEquals(array_1647490445[ii], array_1523841896[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_test_remove9__7)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_test_remove9__7)).getActivity())), 0.1);
        Assert.assertEquals("-1[?] 2[?]", ((OriginalBinaryClause) (o_test_remove9__7)).toString());
        Assert.assertEquals(3, ((int) (((OriginalBinaryClause) (o_test_remove9__7)).hashCode())));
        int[] array_1825005533 = new int[]{3,4};
        	int[] array_927971380 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove9__7).getLits();
        	for(int ii = 0; ii <array_1825005533.length; ii++) {
        		org.junit.Assert.assertEquals(array_1825005533[ii], array_927971380[ii]);
        	};
        IConstr o_test_remove9__8 = solver.addClause(clause);
        int[] array_1609868476 = new int[]{3,4};
        	int[] array_327662580 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove9__8).getLits();
        	for(int ii = 0; ii <array_1609868476.length; ii++) {
        		org.junit.Assert.assertEquals(array_1609868476[ii], array_327662580[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_test_remove9__8)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_test_remove9__8)).getActivity())), 0.1);
        Assert.assertEquals("-1[?] 2[?]", ((OriginalBinaryClause) (o_test_remove9__8)).toString());
        Assert.assertEquals(3, ((int) (((OriginalBinaryClause) (o_test_remove9__8)).hashCode())));
        int[] array_340637712 = new int[]{3,4};
        	int[] array_2028163065 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove9__8).getLits();
        	for(int ii = 0; ii <array_340637712.length; ii++) {
        		org.junit.Assert.assertEquals(array_340637712[ii], array_2028163065[ii]);
        	};
        clause.clear();
        clause.clear();
        IVecInt o_test_remove9__11 = clause.push(1);
        Assert.assertEquals("1", ((VecInt) (o_test_remove9__11)).toString());
        Assert.assertEquals(1, ((int) (((VecInt) (o_test_remove9__11)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_remove9__11)).isEmpty());
        IVecInt o_test_remove9__12 = clause.push((-2));
        Assert.assertEquals("1,-2", ((VecInt) (o_test_remove9__12)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_test_remove9__12)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_remove9__12)).isEmpty());
        int[] array_194402919 = new int[]{3,4};
        	int[] array_2024550689 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove9__6).getLits();
        	for(int ii = 0; ii <array_194402919.length; ii++) {
        		org.junit.Assert.assertEquals(array_194402919[ii], array_2024550689[ii]);
        	};
        int[] array_1775383297 = new int[]{3,4};
        	int[] array_1318706812 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove9__7).getLits();
        	for(int ii = 0; ii <array_1775383297.length; ii++) {
        		org.junit.Assert.assertEquals(array_1775383297[ii], array_1318706812[ii]);
        	};
        int[] array_823822799 = new int[]{3,4};
        	int[] array_2137733469 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove9__8).getLits();
        	for(int ii = 0; ii <array_823822799.length; ii++) {
        		org.junit.Assert.assertEquals(array_823822799[ii], array_2137733469[ii]);
        	};
        Assert.assertEquals("1,-2", ((VecInt) (clause)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (clause)).hashCode())));
        Assert.assertFalse(((VecInt) (clause)).isEmpty());
        Assert.assertEquals("1,-2", ((VecInt) (o_test_remove9__3)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_test_remove9__3)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_remove9__3)).isEmpty());
        int[] array_571441765 = new int[]{3,4};
        	int[] array_1172047088 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove9__6).getLits();
        	for(int ii = 0; ii <array_571441765.length; ii++) {
        		org.junit.Assert.assertEquals(array_571441765[ii], array_1172047088[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_test_remove9__6)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_test_remove9__6)).getActivity())), 0.1);
        Assert.assertEquals("-1[?] 2[?]", ((OriginalBinaryClause) (o_test_remove9__6)).toString());
        Assert.assertEquals(3, ((int) (((OriginalBinaryClause) (o_test_remove9__6)).hashCode())));
        int[] array_666162082 = new int[]{3,4};
        	int[] array_267681211 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove9__7).getLits();
        	for(int ii = 0; ii <array_666162082.length; ii++) {
        		org.junit.Assert.assertEquals(array_666162082[ii], array_267681211[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_test_remove9__7)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_test_remove9__7)).getActivity())), 0.1);
        Assert.assertEquals("-1[?] 2[?]", ((OriginalBinaryClause) (o_test_remove9__7)).toString());
        Assert.assertEquals(3, ((int) (((OriginalBinaryClause) (o_test_remove9__7)).hashCode())));
        int[] array_597239996 = new int[]{3,4};
        	int[] array_74124859 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove9__8).getLits();
        	for(int ii = 0; ii <array_597239996.length; ii++) {
        		org.junit.Assert.assertEquals(array_597239996[ii], array_74124859[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_test_remove9__8)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_test_remove9__8)).getActivity())), 0.1);
        Assert.assertEquals("-1[?] 2[?]", ((OriginalBinaryClause) (o_test_remove9__8)).toString());
        Assert.assertEquals(3, ((int) (((OriginalBinaryClause) (o_test_remove9__8)).hashCode())));
        Assert.assertEquals("1,-2", ((VecInt) (o_test_remove9__11)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_test_remove9__11)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_remove9__11)).isEmpty());
        Assert.assertEquals("1,-2", ((VecInt) (o_test_remove9__12)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_test_remove9__12)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_remove9__12)).isEmpty());
    }

    @Test(timeout = 30000)
    public void test_remove3_remove43_failAssert2() throws Exception, ContradictionException, TimeoutException {
        try {
            IVecInt clause = new VecInt();
            IVecInt o_test_remove3__3 = clause.push((-1)).push(2);
            IConstr o_test_remove3__6 = solver.addClause(clause);
            int[] array_604600082 = new int[]{3,4};
            	int[] array_1754635521 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove3__6).getLits();
            	for(int ii = 0; ii <array_604600082.length; ii++) {
            		org.junit.Assert.assertEquals(array_604600082[ii], array_1754635521[ii]);
            	};
            IVecInt o_test_remove3__7 = clause.push(1);
            solver.addClause(clause);
            clause.clear();
            solver.addClause(clause);
            solver.isSatisfiable();
            this.solver.unsatExplanation();
            org.junit.Assert.fail("test_remove3_remove43 should have thrown ContradictionException");
        } catch (ContradictionException expected) {
            Assert.assertEquals("Creating Empty clause ?", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test_remove6_remove60_failAssert3() throws Exception, ContradictionException, TimeoutException {
        try {
            IVecInt clause = new VecInt();
            IVecInt o_test_remove6__3 = clause.push((-1)).push(2);
            IConstr o_test_remove6__6 = solver.addClause(clause);
            int[] array_693168991 = new int[]{3,4};
            	int[] array_1819371744 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove6__6).getLits();
            	for(int ii = 0; ii <array_693168991.length; ii++) {
            		org.junit.Assert.assertEquals(array_693168991[ii], array_1819371744[ii]);
            	};
            IConstr o_test_remove6__7 = solver.addClause(clause);
            int[] array_133895881 = new int[]{3,4};
            	int[] array_704882353 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove6__7).getLits();
            	for(int ii = 0; ii <array_133895881.length; ii++) {
            		org.junit.Assert.assertEquals(array_133895881[ii], array_704882353[ii]);
            	};
            IVecInt o_test_remove6__9 = clause.push(1);
            IVecInt o_test_remove6__10 = clause.push((-2));
            IConstr o_test_remove6__12 = solver.addClause(clause);
            int[] array_2094448682 = new int[]{2,5};
            	int[] array_476261279 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove6__12).getLits();
            	for(int ii = 0; ii <array_2094448682.length; ii++) {
            		org.junit.Assert.assertEquals(array_2094448682[ii], array_476261279[ii]);
            	};
            solver.isSatisfiable();
            this.solver.unsatExplanation();
            org.junit.Assert.fail("test_remove6_remove60 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test_remove2_remove51_remove196() throws Exception, ContradictionException, TimeoutException {
        IVecInt clause = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause)).toString());
        Assert.assertTrue(((VecInt) (clause)).isEmpty());
        IVecInt o_test_remove2__3 = clause.push((-1)).push(2);
        Assert.assertEquals("-1,2", ((VecInt) (o_test_remove2__3)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_test_remove2__3)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_remove2__3)).isEmpty());
        IVecInt o_test_remove2__7 = clause.push(1);
        Assert.assertEquals("-1,2,1", ((VecInt) (o_test_remove2__7)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_test_remove2__7)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_remove2__7)).isEmpty());
        IConstr o_test_remove2__8 = solver.addClause(clause);
        IVecInt o_test_remove2__10 = clause.push((-2));
        IConstr o_test_remove2__12 = solver.addClause(clause);
        solver.isSatisfiable();
        this.solver.unsatExplanation();
    }

    @Test(timeout = 30000)
    public void test_remove2_remove51_remove197() throws Exception, ContradictionException, TimeoutException {
        IVecInt clause = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause)).toString());
        Assert.assertTrue(((VecInt) (clause)).isEmpty());
        IVecInt o_test_remove2__3 = clause.push((-1)).push(2);
        Assert.assertEquals("-1,2", ((VecInt) (o_test_remove2__3)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_test_remove2__3)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_remove2__3)).isEmpty());
        IVecInt o_test_remove2__7 = clause.push(1);
        Assert.assertEquals("-1,2,1", ((VecInt) (o_test_remove2__7)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_test_remove2__7)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_remove2__7)).isEmpty());
        IConstr o_test_remove2__8 = solver.addClause(clause);
        clause.clear();
        IVecInt o_test_remove2__10 = clause.push((-2));
        IConstr o_test_remove2__12 = solver.addClause(clause);
        this.solver.unsatExplanation();
    }

    @Test(timeout = 30000)
    public void test_remove2_remove51_remove201() throws Exception, ContradictionException, TimeoutException {
        IVecInt clause = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause)).toString());
        Assert.assertTrue(((VecInt) (clause)).isEmpty());
        IVecInt o_test_remove2__3 = clause.push((-1)).push(2);
        Assert.assertEquals("-1,2", ((VecInt) (o_test_remove2__3)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_test_remove2__3)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_remove2__3)).isEmpty());
        IVecInt o_test_remove2__7 = clause.push(1);
        Assert.assertEquals("-1,2,1", ((VecInt) (o_test_remove2__7)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_test_remove2__7)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_remove2__7)).isEmpty());
        IConstr o_test_remove2__8 = solver.addClause(clause);
        clause.clear();
        IVecInt o_test_remove2__10 = clause.push((-2));
        IConstr o_test_remove2__12 = solver.addClause(clause);
        this.solver.isSatisfiable();
    }

    @Test(timeout = 30000)
    public void test_remove2_remove53_remove189() throws Exception, ContradictionException, TimeoutException {
        IVecInt clause = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause)).toString());
        Assert.assertTrue(((VecInt) (clause)).isEmpty());
        IVecInt o_test_remove2__3 = clause.push((-1)).push(2);
        Assert.assertEquals("-1,2", ((VecInt) (o_test_remove2__3)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_test_remove2__3)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_remove2__3)).isEmpty());
        clause.clear();
        IVecInt o_test_remove2__7 = clause.push(1);
        Assert.assertEquals("1", ((VecInt) (o_test_remove2__7)).toString());
        Assert.assertEquals(1, ((int) (((VecInt) (o_test_remove2__7)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_remove2__7)).isEmpty());
        IConstr o_test_remove2__8 = solver.addClause(clause);
        Assert.assertTrue(((UnitClause) (o_test_remove2__8)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_test_remove2__8)).getActivity())), 0.1);
        Assert.assertEquals("1", ((UnitClause) (o_test_remove2__8)).toString());
        IVecInt o_test_remove2__10 = clause.push((-2));
        Assert.assertEquals("1,-2", ((VecInt) (o_test_remove2__10)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_test_remove2__10)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_remove2__10)).isEmpty());
        IConstr o_test_remove2__12 = solver.addClause(clause);
        this.solver.unsatExplanation();
    }

    @Test(timeout = 30000)
    public void test_remove2_remove53_remove190() throws Exception, ContradictionException, TimeoutException {
        IVecInt clause = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause)).toString());
        Assert.assertTrue(((VecInt) (clause)).isEmpty());
        IVecInt o_test_remove2__3 = clause.push((-1)).push(2);
        Assert.assertEquals("-1,2", ((VecInt) (o_test_remove2__3)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_test_remove2__3)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_remove2__3)).isEmpty());
        clause.clear();
        IVecInt o_test_remove2__7 = clause.push(1);
        Assert.assertEquals("1", ((VecInt) (o_test_remove2__7)).toString());
        Assert.assertEquals(1, ((int) (((VecInt) (o_test_remove2__7)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_remove2__7)).isEmpty());
        IConstr o_test_remove2__8 = solver.addClause(clause);
        Assert.assertTrue(((UnitClause) (o_test_remove2__8)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_test_remove2__8)).getActivity())), 0.1);
        Assert.assertEquals("1", ((UnitClause) (o_test_remove2__8)).toString());
        IVecInt o_test_remove2__10 = clause.push((-2));
        Assert.assertEquals("1,-2", ((VecInt) (o_test_remove2__10)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_test_remove2__10)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_remove2__10)).isEmpty());
        IConstr o_test_remove2__12 = solver.addClause(clause);
        this.solver.isSatisfiable();
    }

    @Test(timeout = 30000)
    public void test_remove2_remove55_remove161() throws Exception, ContradictionException, TimeoutException {
        IVecInt clause = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause)).toString());
        Assert.assertTrue(((VecInt) (clause)).isEmpty());
        IVecInt o_test_remove2__3 = clause.push((-1)).push(2);
        Assert.assertEquals("-1,2", ((VecInt) (o_test_remove2__3)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_test_remove2__3)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_remove2__3)).isEmpty());
        clause.clear();
        clause.clear();
        IVecInt o_test_remove2__7 = clause.push(1);
        Assert.assertEquals("1", ((VecInt) (o_test_remove2__7)).toString());
        Assert.assertEquals(1, ((int) (((VecInt) (o_test_remove2__7)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_remove2__7)).isEmpty());
        IConstr o_test_remove2__8 = solver.addClause(clause);
        Assert.assertTrue(((UnitClause) (o_test_remove2__8)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_test_remove2__8)).getActivity())), 0.1);
        Assert.assertEquals("1", ((UnitClause) (o_test_remove2__8)).toString());
        IVecInt o_test_remove2__10 = clause.push((-2));
        Assert.assertEquals("1,-2", ((VecInt) (o_test_remove2__10)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_test_remove2__10)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_remove2__10)).isEmpty());
        IConstr o_test_remove2__12 = this.solver.addClause(clause);
    }

    @Test(timeout = 30000)
    public void test_remove3_remove39_remove163() throws Exception, ContradictionException, TimeoutException {
        IVecInt clause = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause)).toString());
        Assert.assertTrue(((VecInt) (clause)).isEmpty());
        IVecInt o_test_remove3__3 = clause.push((-1)).push(2);
        Assert.assertEquals("-1,2", ((VecInt) (o_test_remove3__3)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_test_remove3__3)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_remove3__3)).isEmpty());
        IConstr o_test_remove3__6 = solver.addClause(clause);
        int[] array_943939508 = new int[]{3,4};
        	int[] array_1027002502 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove3__6).getLits();
        	for(int ii = 0; ii <array_943939508.length; ii++) {
        		org.junit.Assert.assertEquals(array_943939508[ii], array_1027002502[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_test_remove3__6)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_test_remove3__6)).getActivity())), 0.1);
        Assert.assertEquals("-1[?] 2[?]", ((OriginalBinaryClause) (o_test_remove3__6)).toString());
        Assert.assertEquals(3, ((int) (((OriginalBinaryClause) (o_test_remove3__6)).hashCode())));
        int[] array_376272347 = new int[]{3,4};
        	int[] array_2013800860 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove3__6).getLits();
        	for(int ii = 0; ii <array_376272347.length; ii++) {
        		org.junit.Assert.assertEquals(array_376272347[ii], array_2013800860[ii]);
        	};
        int[] array_604600082 = new int[]{3,4};
        	int[] array_1754635521 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove3__6).getLits();
        	for(int ii = 0; ii <array_604600082.length; ii++) {
        		org.junit.Assert.assertEquals(array_604600082[ii], array_1754635521[ii]);
        	};
        IVecInt o_test_remove3__7 = clause.push(1);
        Assert.assertEquals("-1,2,1", ((VecInt) (o_test_remove3__7)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_test_remove3__7)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_remove3__7)).isEmpty());
        IVecInt o_test_remove3_remove39__17 = clause.push((-2));
        Assert.assertEquals("-1,2,1,-2", ((VecInt) (o_test_remove3_remove39__17)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_test_remove3_remove39__17)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_remove3_remove39__17)).isEmpty());
        IConstr o_test_remove3_remove39__19 = solver.addClause(clause);
        solver.isSatisfiable();
        this.solver.unsatExplanation();
    }

    @Test(timeout = 30000)
    public void test_remove3_remove39_remove166() throws Exception, ContradictionException, TimeoutException {
        IVecInt clause = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause)).toString());
        Assert.assertTrue(((VecInt) (clause)).isEmpty());
        IVecInt o_test_remove3__3 = clause.push((-1)).push(2);
        Assert.assertEquals("-1,2", ((VecInt) (o_test_remove3__3)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_test_remove3__3)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_remove3__3)).isEmpty());
        IConstr o_test_remove3__6 = solver.addClause(clause);
        int[] array_127025727 = new int[]{3,4};
        	int[] array_2086871735 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove3__6).getLits();
        	for(int ii = 0; ii <array_127025727.length; ii++) {
        		org.junit.Assert.assertEquals(array_127025727[ii], array_2086871735[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_test_remove3__6)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_test_remove3__6)).getActivity())), 0.1);
        Assert.assertEquals("-1[?] 2[?]", ((OriginalBinaryClause) (o_test_remove3__6)).toString());
        Assert.assertEquals(3, ((int) (((OriginalBinaryClause) (o_test_remove3__6)).hashCode())));
        int[] array_376272347 = new int[]{3,4};
        	int[] array_2013800860 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove3__6).getLits();
        	for(int ii = 0; ii <array_376272347.length; ii++) {
        		org.junit.Assert.assertEquals(array_376272347[ii], array_2013800860[ii]);
        	};
        int[] array_604600082 = new int[]{3,4};
        	int[] array_1754635521 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove3__6).getLits();
        	for(int ii = 0; ii <array_604600082.length; ii++) {
        		org.junit.Assert.assertEquals(array_604600082[ii], array_1754635521[ii]);
        	};
        IVecInt o_test_remove3__7 = clause.push(1);
        Assert.assertEquals("-1,2,1", ((VecInt) (o_test_remove3__7)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_test_remove3__7)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_remove3__7)).isEmpty());
        clause.clear();
        IVecInt o_test_remove3_remove39__17 = clause.push((-2));
        Assert.assertEquals("-2", ((VecInt) (o_test_remove3_remove39__17)).toString());
        Assert.assertEquals(-2, ((int) (((VecInt) (o_test_remove3_remove39__17)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_remove3_remove39__17)).isEmpty());
        IConstr o_test_remove3_remove39__19 = solver.addClause(clause);
        Assert.assertTrue(((UnitClause) (o_test_remove3_remove39__19)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_test_remove3_remove39__19)).getActivity())), 0.1);
        Assert.assertEquals("-2", ((UnitClause) (o_test_remove3_remove39__19)).toString());
        this.solver.unsatExplanation();
    }

    @Test(timeout = 30000)
    public void test_remove3_remove39_remove169() throws Exception, ContradictionException, TimeoutException {
        IVecInt clause = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause)).toString());
        Assert.assertTrue(((VecInt) (clause)).isEmpty());
        IVecInt o_test_remove3__3 = clause.push((-1)).push(2);
        Assert.assertEquals("-1,2", ((VecInt) (o_test_remove3__3)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_test_remove3__3)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_remove3__3)).isEmpty());
        IConstr o_test_remove3__6 = solver.addClause(clause);
        int[] array_1034662008 = new int[]{3,4};
        	int[] array_1023278215 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove3__6).getLits();
        	for(int ii = 0; ii <array_1034662008.length; ii++) {
        		org.junit.Assert.assertEquals(array_1034662008[ii], array_1023278215[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_test_remove3__6)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_test_remove3__6)).getActivity())), 0.1);
        Assert.assertEquals("-1[?] 2[?]", ((OriginalBinaryClause) (o_test_remove3__6)).toString());
        Assert.assertEquals(3, ((int) (((OriginalBinaryClause) (o_test_remove3__6)).hashCode())));
        int[] array_376272347 = new int[]{3,4};
        	int[] array_2013800860 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove3__6).getLits();
        	for(int ii = 0; ii <array_376272347.length; ii++) {
        		org.junit.Assert.assertEquals(array_376272347[ii], array_2013800860[ii]);
        	};
        int[] array_604600082 = new int[]{3,4};
        	int[] array_1754635521 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove3__6).getLits();
        	for(int ii = 0; ii <array_604600082.length; ii++) {
        		org.junit.Assert.assertEquals(array_604600082[ii], array_1754635521[ii]);
        	};
        IVecInt o_test_remove3__7 = clause.push(1);
        Assert.assertEquals("-1,2,1", ((VecInt) (o_test_remove3__7)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_test_remove3__7)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_remove3__7)).isEmpty());
        clause.clear();
        IVecInt o_test_remove3_remove39__17 = clause.push((-2));
        Assert.assertEquals("-2", ((VecInt) (o_test_remove3_remove39__17)).toString());
        Assert.assertEquals(-2, ((int) (((VecInt) (o_test_remove3_remove39__17)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_remove3_remove39__17)).isEmpty());
        IConstr o_test_remove3_remove39__19 = solver.addClause(clause);
        Assert.assertTrue(((UnitClause) (o_test_remove3_remove39__19)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_test_remove3_remove39__19)).getActivity())), 0.1);
        Assert.assertEquals("-2", ((UnitClause) (o_test_remove3_remove39__19)).toString());
        this.solver.isSatisfiable();
        Assert.assertEquals("-2", ((VecInt) (clause)).toString());
        Assert.assertEquals(-2, ((int) (((VecInt) (clause)).hashCode())));
        Assert.assertFalse(((VecInt) (clause)).isEmpty());
        Assert.assertEquals("-2", ((VecInt) (o_test_remove3__3)).toString());
        Assert.assertEquals(-2, ((int) (((VecInt) (o_test_remove3__3)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_remove3__3)).isEmpty());
        int[] array_1985739705 = new int[]{3,4};
        	int[] array_507272895 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove3__6).getLits();
        	for(int ii = 0; ii <array_1985739705.length; ii++) {
        		org.junit.Assert.assertEquals(array_1985739705[ii], array_507272895[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_test_remove3__6)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_test_remove3__6)).getActivity())), 0.1);
        Assert.assertEquals("-1[?] 2[F]", ((OriginalBinaryClause) (o_test_remove3__6)).toString());
        Assert.assertEquals(3, ((int) (((OriginalBinaryClause) (o_test_remove3__6)).hashCode())));
        Assert.assertEquals("-2", ((VecInt) (o_test_remove3__7)).toString());
        Assert.assertEquals(-2, ((int) (((VecInt) (o_test_remove3__7)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_remove3__7)).isEmpty());
        Assert.assertEquals("-2", ((VecInt) (o_test_remove3_remove39__17)).toString());
        Assert.assertEquals(-2, ((int) (((VecInt) (o_test_remove3_remove39__17)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_remove3_remove39__17)).isEmpty());
        Assert.assertTrue(((UnitClause) (o_test_remove3_remove39__19)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_test_remove3_remove39__19)).getActivity())), 0.1);
        Assert.assertEquals("-2", ((UnitClause) (o_test_remove3_remove39__19)).toString());
    }

    @Test(timeout = 30000)
    public void test_remove3_remove40_remove164() throws Exception, ContradictionException, TimeoutException {
        IVecInt clause = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause)).toString());
        Assert.assertTrue(((VecInt) (clause)).isEmpty());
        IVecInt o_test_remove3__3 = clause.push((-1)).push(2);
        Assert.assertEquals("-1,2", ((VecInt) (o_test_remove3__3)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_test_remove3__3)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_remove3__3)).isEmpty());
        IConstr o_test_remove3__6 = solver.addClause(clause);
        int[] array_1831915615 = new int[]{3,4};
        	int[] array_1658967346 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove3__6).getLits();
        	for(int ii = 0; ii <array_1831915615.length; ii++) {
        		org.junit.Assert.assertEquals(array_1831915615[ii], array_1658967346[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_test_remove3__6)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_test_remove3__6)).getActivity())), 0.1);
        Assert.assertEquals("-1[?] 2[?]", ((OriginalBinaryClause) (o_test_remove3__6)).toString());
        Assert.assertEquals(3, ((int) (((OriginalBinaryClause) (o_test_remove3__6)).hashCode())));
        int[] array_459256098 = new int[]{3,4};
        	int[] array_1110374170 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove3__6).getLits();
        	for(int ii = 0; ii <array_459256098.length; ii++) {
        		org.junit.Assert.assertEquals(array_459256098[ii], array_1110374170[ii]);
        	};
        int[] array_604600082 = new int[]{3,4};
        	int[] array_1754635521 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove3__6).getLits();
        	for(int ii = 0; ii <array_604600082.length; ii++) {
        		org.junit.Assert.assertEquals(array_604600082[ii], array_1754635521[ii]);
        	};
        IVecInt o_test_remove3__7 = clause.push(1);
        Assert.assertEquals("-1,2,1", ((VecInt) (o_test_remove3__7)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_test_remove3__7)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_remove3__7)).isEmpty());
        IVecInt o_test_remove3_remove40_remove164__18 = clause.push((-2));
        Assert.assertEquals("-1,2,1,-2", ((VecInt) (o_test_remove3_remove40_remove164__18)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_test_remove3_remove40_remove164__18)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_remove3_remove40_remove164__18)).isEmpty());
        solver.addClause(clause);
        solver.isSatisfiable();
        this.solver.unsatExplanation();
    }

    @Test(timeout = 30000)
    public void test_remove3_remove40_remove168() throws Exception, ContradictionException, TimeoutException {
        IVecInt clause = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause)).toString());
        Assert.assertTrue(((VecInt) (clause)).isEmpty());
        IVecInt o_test_remove3__3 = clause.push((-1)).push(2);
        Assert.assertEquals("-1,2", ((VecInt) (o_test_remove3__3)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_test_remove3__3)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_remove3__3)).isEmpty());
        IConstr o_test_remove3__6 = solver.addClause(clause);
        int[] array_1856449869 = new int[]{3,4};
        	int[] array_2090117230 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove3__6).getLits();
        	for(int ii = 0; ii <array_1856449869.length; ii++) {
        		org.junit.Assert.assertEquals(array_1856449869[ii], array_2090117230[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_test_remove3__6)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_test_remove3__6)).getActivity())), 0.1);
        Assert.assertEquals("-1[?] 2[?]", ((OriginalBinaryClause) (o_test_remove3__6)).toString());
        Assert.assertEquals(3, ((int) (((OriginalBinaryClause) (o_test_remove3__6)).hashCode())));
        int[] array_459256098 = new int[]{3,4};
        	int[] array_1110374170 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove3__6).getLits();
        	for(int ii = 0; ii <array_459256098.length; ii++) {
        		org.junit.Assert.assertEquals(array_459256098[ii], array_1110374170[ii]);
        	};
        int[] array_604600082 = new int[]{3,4};
        	int[] array_1754635521 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove3__6).getLits();
        	for(int ii = 0; ii <array_604600082.length; ii++) {
        		org.junit.Assert.assertEquals(array_604600082[ii], array_1754635521[ii]);
        	};
        IVecInt o_test_remove3__7 = clause.push(1);
        Assert.assertEquals("-1,2,1", ((VecInt) (o_test_remove3__7)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_test_remove3__7)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_remove3__7)).isEmpty());
        solver.addClause(clause);
        solver.addClause(clause);
        solver.isSatisfiable();
        this.solver.unsatExplanation();
    }

    @Test(timeout = 30000)
    public void test_remove3_remove40_remove175() throws Exception, ContradictionException, TimeoutException {
        IVecInt clause = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause)).toString());
        Assert.assertTrue(((VecInt) (clause)).isEmpty());
        IVecInt o_test_remove3__3 = clause.push((-1)).push(2);
        Assert.assertEquals("-1,2", ((VecInt) (o_test_remove3__3)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_test_remove3__3)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_remove3__3)).isEmpty());
        IConstr o_test_remove3__6 = solver.addClause(clause);
        int[] array_471491861 = new int[]{3,4};
        	int[] array_684196805 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove3__6).getLits();
        	for(int ii = 0; ii <array_471491861.length; ii++) {
        		org.junit.Assert.assertEquals(array_471491861[ii], array_684196805[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_test_remove3__6)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_test_remove3__6)).getActivity())), 0.1);
        Assert.assertEquals("-1[?] 2[?]", ((OriginalBinaryClause) (o_test_remove3__6)).toString());
        Assert.assertEquals(3, ((int) (((OriginalBinaryClause) (o_test_remove3__6)).hashCode())));
        int[] array_459256098 = new int[]{3,4};
        	int[] array_1110374170 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove3__6).getLits();
        	for(int ii = 0; ii <array_459256098.length; ii++) {
        		org.junit.Assert.assertEquals(array_459256098[ii], array_1110374170[ii]);
        	};
        int[] array_604600082 = new int[]{3,4};
        	int[] array_1754635521 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove3__6).getLits();
        	for(int ii = 0; ii <array_604600082.length; ii++) {
        		org.junit.Assert.assertEquals(array_604600082[ii], array_1754635521[ii]);
        	};
        IVecInt o_test_remove3__7 = clause.push(1);
        Assert.assertEquals("-1,2,1", ((VecInt) (o_test_remove3__7)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_test_remove3__7)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_remove3__7)).isEmpty());
        solver.addClause(clause);
        solver.addClause(clause);
        clause.push((-2));
        this.solver.unsatExplanation();
    }

    @Test(timeout = 30000)
    public void test_remove3_remove40_remove179() throws Exception, ContradictionException, TimeoutException {
        IVecInt clause = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause)).toString());
        Assert.assertTrue(((VecInt) (clause)).isEmpty());
        IVecInt o_test_remove3__3 = clause.push((-1)).push(2);
        Assert.assertEquals("-1,2", ((VecInt) (o_test_remove3__3)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_test_remove3__3)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_remove3__3)).isEmpty());
        IConstr o_test_remove3__6 = solver.addClause(clause);
        int[] array_1135003405 = new int[]{3,4};
        	int[] array_169851362 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove3__6).getLits();
        	for(int ii = 0; ii <array_1135003405.length; ii++) {
        		org.junit.Assert.assertEquals(array_1135003405[ii], array_169851362[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_test_remove3__6)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_test_remove3__6)).getActivity())), 0.1);
        Assert.assertEquals("-1[?] 2[?]", ((OriginalBinaryClause) (o_test_remove3__6)).toString());
        Assert.assertEquals(3, ((int) (((OriginalBinaryClause) (o_test_remove3__6)).hashCode())));
        int[] array_459256098 = new int[]{3,4};
        	int[] array_1110374170 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove3__6).getLits();
        	for(int ii = 0; ii <array_459256098.length; ii++) {
        		org.junit.Assert.assertEquals(array_459256098[ii], array_1110374170[ii]);
        	};
        int[] array_604600082 = new int[]{3,4};
        	int[] array_1754635521 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove3__6).getLits();
        	for(int ii = 0; ii <array_604600082.length; ii++) {
        		org.junit.Assert.assertEquals(array_604600082[ii], array_1754635521[ii]);
        	};
        IVecInt o_test_remove3__7 = clause.push(1);
        Assert.assertEquals("-1,2,1", ((VecInt) (o_test_remove3__7)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_test_remove3__7)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_remove3__7)).isEmpty());
        solver.addClause(clause);
        solver.addClause(clause);
        clause.push((-2));
        this.solver.isSatisfiable();
    }

    @Test(timeout = 30000)
    public void test_remove3_remove44_remove145() throws Exception, ContradictionException, TimeoutException {
        IVecInt clause = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause)).toString());
        Assert.assertTrue(((VecInt) (clause)).isEmpty());
        IVecInt o_test_remove3__3 = clause.push((-1)).push(2);
        Assert.assertEquals("-1,2", ((VecInt) (o_test_remove3__3)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_test_remove3__3)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_remove3__3)).isEmpty());
        IConstr o_test_remove3__6 = solver.addClause(clause);
        int[] array_136339376 = new int[]{3,4};
        	int[] array_296864866 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove3__6).getLits();
        	for(int ii = 0; ii <array_136339376.length; ii++) {
        		org.junit.Assert.assertEquals(array_136339376[ii], array_296864866[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_test_remove3__6)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_test_remove3__6)).getActivity())), 0.1);
        Assert.assertEquals("-1[?] 2[?]", ((OriginalBinaryClause) (o_test_remove3__6)).toString());
        Assert.assertEquals(3, ((int) (((OriginalBinaryClause) (o_test_remove3__6)).hashCode())));
        int[] array_2035717878 = new int[]{3,4};
        	int[] array_2069531944 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove3__6).getLits();
        	for(int ii = 0; ii <array_2035717878.length; ii++) {
        		org.junit.Assert.assertEquals(array_2035717878[ii], array_2069531944[ii]);
        	};
        int[] array_604600082 = new int[]{3,4};
        	int[] array_1754635521 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove3__6).getLits();
        	for(int ii = 0; ii <array_604600082.length; ii++) {
        		org.junit.Assert.assertEquals(array_604600082[ii], array_1754635521[ii]);
        	};
        IVecInt o_test_remove3__7 = clause.push(1);
        Assert.assertEquals("-1,2,1", ((VecInt) (o_test_remove3__7)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_test_remove3__7)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_remove3__7)).isEmpty());
        clause.clear();
        IVecInt o_test_remove3_remove44_remove145__19 = clause.push((-2));
        Assert.assertEquals("-2", ((VecInt) (o_test_remove3_remove44_remove145__19)).toString());
        Assert.assertEquals(-2, ((int) (((VecInt) (o_test_remove3_remove44_remove145__19)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_remove3_remove44_remove145__19)).isEmpty());
        solver.isSatisfiable();
        this.solver.unsatExplanation();
    }

    @Test(timeout = 30000)
    public void test_remove3_remove44_remove156() throws Exception, ContradictionException, TimeoutException {
        IVecInt clause = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause)).toString());
        Assert.assertTrue(((VecInt) (clause)).isEmpty());
        IVecInt o_test_remove3__3 = clause.push((-1)).push(2);
        Assert.assertEquals("-1,2", ((VecInt) (o_test_remove3__3)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_test_remove3__3)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_remove3__3)).isEmpty());
        IConstr o_test_remove3__6 = solver.addClause(clause);
        int[] array_1150978389 = new int[]{3,4};
        	int[] array_1071459684 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove3__6).getLits();
        	for(int ii = 0; ii <array_1150978389.length; ii++) {
        		org.junit.Assert.assertEquals(array_1150978389[ii], array_1071459684[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_test_remove3__6)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_test_remove3__6)).getActivity())), 0.1);
        Assert.assertEquals("-1[?] 2[?]", ((OriginalBinaryClause) (o_test_remove3__6)).toString());
        Assert.assertEquals(3, ((int) (((OriginalBinaryClause) (o_test_remove3__6)).hashCode())));
        int[] array_2035717878 = new int[]{3,4};
        	int[] array_2069531944 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove3__6).getLits();
        	for(int ii = 0; ii <array_2035717878.length; ii++) {
        		org.junit.Assert.assertEquals(array_2035717878[ii], array_2069531944[ii]);
        	};
        int[] array_604600082 = new int[]{3,4};
        	int[] array_1754635521 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove3__6).getLits();
        	for(int ii = 0; ii <array_604600082.length; ii++) {
        		org.junit.Assert.assertEquals(array_604600082[ii], array_1754635521[ii]);
        	};
        IVecInt o_test_remove3__7 = clause.push(1);
        Assert.assertEquals("-1,2,1", ((VecInt) (o_test_remove3__7)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_test_remove3__7)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_remove3__7)).isEmpty());
        solver.addClause(clause);
        clause.clear();
        clause.push((-2));
        this.solver.unsatExplanation();
    }

    @Test(timeout = 30000)
    public void test_remove3_remove44_remove158() throws Exception, ContradictionException, TimeoutException {
        IVecInt clause = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause)).toString());
        Assert.assertTrue(((VecInt) (clause)).isEmpty());
        IVecInt o_test_remove3__3 = clause.push((-1)).push(2);
        Assert.assertEquals("-1,2", ((VecInt) (o_test_remove3__3)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_test_remove3__3)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_remove3__3)).isEmpty());
        IConstr o_test_remove3__6 = solver.addClause(clause);
        int[] array_469502747 = new int[]{3,4};
        	int[] array_979578557 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove3__6).getLits();
        	for(int ii = 0; ii <array_469502747.length; ii++) {
        		org.junit.Assert.assertEquals(array_469502747[ii], array_979578557[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_test_remove3__6)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_test_remove3__6)).getActivity())), 0.1);
        Assert.assertEquals("-1[?] 2[?]", ((OriginalBinaryClause) (o_test_remove3__6)).toString());
        Assert.assertEquals(3, ((int) (((OriginalBinaryClause) (o_test_remove3__6)).hashCode())));
        int[] array_2035717878 = new int[]{3,4};
        	int[] array_2069531944 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove3__6).getLits();
        	for(int ii = 0; ii <array_2035717878.length; ii++) {
        		org.junit.Assert.assertEquals(array_2035717878[ii], array_2069531944[ii]);
        	};
        int[] array_604600082 = new int[]{3,4};
        	int[] array_1754635521 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove3__6).getLits();
        	for(int ii = 0; ii <array_604600082.length; ii++) {
        		org.junit.Assert.assertEquals(array_604600082[ii], array_1754635521[ii]);
        	};
        IVecInt o_test_remove3__7 = clause.push(1);
        Assert.assertEquals("-1,2,1", ((VecInt) (o_test_remove3__7)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_test_remove3__7)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_remove3__7)).isEmpty());
        solver.addClause(clause);
        clause.clear();
        clause.push((-2));
        this.solver.isSatisfiable();
    }

    @Test(timeout = 30000)
    public void test_remove3_remove47_remove198() throws Exception, ContradictionException, TimeoutException {
        IVecInt clause = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause)).toString());
        Assert.assertTrue(((VecInt) (clause)).isEmpty());
        IVecInt o_test_remove3__3 = clause.push((-1)).push(2);
        Assert.assertEquals("-1,2", ((VecInt) (o_test_remove3__3)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_test_remove3__3)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_remove3__3)).isEmpty());
        IConstr o_test_remove3__6 = solver.addClause(clause);
        int[] array_388526397 = new int[]{3,4};
        	int[] array_1518421836 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove3__6).getLits();
        	for(int ii = 0; ii <array_388526397.length; ii++) {
        		org.junit.Assert.assertEquals(array_388526397[ii], array_1518421836[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_test_remove3__6)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_test_remove3__6)).getActivity())), 0.1);
        Assert.assertEquals("-1[?] 2[?]", ((OriginalBinaryClause) (o_test_remove3__6)).toString());
        Assert.assertEquals(3, ((int) (((OriginalBinaryClause) (o_test_remove3__6)).hashCode())));
        int[] array_1439016066 = new int[]{3,4};
        	int[] array_1867322158 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove3__6).getLits();
        	for(int ii = 0; ii <array_1439016066.length; ii++) {
        		org.junit.Assert.assertEquals(array_1439016066[ii], array_1867322158[ii]);
        	};
        int[] array_604600082 = new int[]{3,4};
        	int[] array_1754635521 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove3__6).getLits();
        	for(int ii = 0; ii <array_604600082.length; ii++) {
        		org.junit.Assert.assertEquals(array_604600082[ii], array_1754635521[ii]);
        	};
        IVecInt o_test_remove3__7 = clause.push(1);
        Assert.assertEquals("-1,2,1", ((VecInt) (o_test_remove3__7)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_test_remove3__7)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_remove3__7)).isEmpty());
        solver.addClause(clause);
        solver.addClause(clause);
        clause.clear();
        clause.push((-2));
    }

    @Test(timeout = 30000)
    public void test_remove5_remove38_remove205() throws Exception, ContradictionException, TimeoutException {
        IVecInt clause = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause)).toString());
        Assert.assertTrue(((VecInt) (clause)).isEmpty());
        IVecInt o_test_remove5__3 = clause.push((-1)).push(2);
        Assert.assertEquals("-1,2", ((VecInt) (o_test_remove5__3)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_test_remove5__3)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_remove5__3)).isEmpty());
        IConstr o_test_remove5__6 = solver.addClause(clause);
        int[] array_533326347 = new int[]{3,4};
        	int[] array_14515348 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove5__6).getLits();
        	for(int ii = 0; ii <array_533326347.length; ii++) {
        		org.junit.Assert.assertEquals(array_533326347[ii], array_14515348[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_test_remove5__6)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_test_remove5__6)).getActivity())), 0.1);
        Assert.assertEquals("-1[?] 2[?]", ((OriginalBinaryClause) (o_test_remove5__6)).toString());
        Assert.assertEquals(3, ((int) (((OriginalBinaryClause) (o_test_remove5__6)).hashCode())));
        int[] array_974525135 = new int[]{3,4};
        	int[] array_739918547 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove5__6).getLits();
        	for(int ii = 0; ii <array_974525135.length; ii++) {
        		org.junit.Assert.assertEquals(array_974525135[ii], array_739918547[ii]);
        	};
        int[] array_93386990 = new int[]{3,4};
        	int[] array_1694934693 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove5__6).getLits();
        	for(int ii = 0; ii <array_93386990.length; ii++) {
        		org.junit.Assert.assertEquals(array_93386990[ii], array_1694934693[ii]);
        	};
        clause.clear();
        IVecInt o_test_remove5__8 = clause.push(1);
        Assert.assertEquals("1", ((VecInt) (o_test_remove5__8)).toString());
        Assert.assertEquals(1, ((int) (((VecInt) (o_test_remove5__8)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_remove5__8)).isEmpty());
        IVecInt o_test_remove5__10 = clause.push((-2));
        Assert.assertEquals("1,-2", ((VecInt) (o_test_remove5__10)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_test_remove5__10)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_remove5__10)).isEmpty());
        IConstr o_test_remove5__12 = solver.addClause(clause);
        int[] array_1722904138 = new int[]{2,5};
        	int[] array_1221341321 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove5__12).getLits();
        	for(int ii = 0; ii <array_1722904138.length; ii++) {
        		org.junit.Assert.assertEquals(array_1722904138[ii], array_1221341321[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_test_remove5__12)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_test_remove5__12)).getActivity())), 0.1);
        Assert.assertEquals("1[?] -2[?]", ((OriginalBinaryClause) (o_test_remove5__12)).toString());
        Assert.assertEquals(3, ((int) (((OriginalBinaryClause) (o_test_remove5__12)).hashCode())));
        int[] array_231144324 = new int[]{2,5};
        	int[] array_1281367601 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove5__12).getLits();
        	for(int ii = 0; ii <array_231144324.length; ii++) {
        		org.junit.Assert.assertEquals(array_231144324[ii], array_1281367601[ii]);
        	};
        this.solver.unsatExplanation();
    }

    @Test(timeout = 30000)
    public void test_remove5_remove38_remove207() throws Exception, ContradictionException, TimeoutException {
        IVecInt clause = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause)).toString());
        Assert.assertTrue(((VecInt) (clause)).isEmpty());
        IVecInt o_test_remove5__3 = clause.push((-1)).push(2);
        Assert.assertEquals("-1,2", ((VecInt) (o_test_remove5__3)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_test_remove5__3)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_remove5__3)).isEmpty());
        IConstr o_test_remove5__6 = solver.addClause(clause);
        int[] array_1251781007 = new int[]{3,4};
        	int[] array_567385950 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove5__6).getLits();
        	for(int ii = 0; ii <array_1251781007.length; ii++) {
        		org.junit.Assert.assertEquals(array_1251781007[ii], array_567385950[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_test_remove5__6)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_test_remove5__6)).getActivity())), 0.1);
        Assert.assertEquals("-1[?] 2[?]", ((OriginalBinaryClause) (o_test_remove5__6)).toString());
        Assert.assertEquals(3, ((int) (((OriginalBinaryClause) (o_test_remove5__6)).hashCode())));
        int[] array_974525135 = new int[]{3,4};
        	int[] array_739918547 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove5__6).getLits();
        	for(int ii = 0; ii <array_974525135.length; ii++) {
        		org.junit.Assert.assertEquals(array_974525135[ii], array_739918547[ii]);
        	};
        int[] array_93386990 = new int[]{3,4};
        	int[] array_1694934693 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove5__6).getLits();
        	for(int ii = 0; ii <array_93386990.length; ii++) {
        		org.junit.Assert.assertEquals(array_93386990[ii], array_1694934693[ii]);
        	};
        clause.clear();
        IVecInt o_test_remove5__8 = clause.push(1);
        Assert.assertEquals("1", ((VecInt) (o_test_remove5__8)).toString());
        Assert.assertEquals(1, ((int) (((VecInt) (o_test_remove5__8)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_remove5__8)).isEmpty());
        IVecInt o_test_remove5__10 = clause.push((-2));
        Assert.assertEquals("1,-2", ((VecInt) (o_test_remove5__10)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_test_remove5__10)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_remove5__10)).isEmpty());
        IConstr o_test_remove5__12 = solver.addClause(clause);
        int[] array_1337954303 = new int[]{2,5};
        	int[] array_416812937 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove5__12).getLits();
        	for(int ii = 0; ii <array_1337954303.length; ii++) {
        		org.junit.Assert.assertEquals(array_1337954303[ii], array_416812937[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_test_remove5__12)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_test_remove5__12)).getActivity())), 0.1);
        Assert.assertEquals("1[?] -2[?]", ((OriginalBinaryClause) (o_test_remove5__12)).toString());
        Assert.assertEquals(3, ((int) (((OriginalBinaryClause) (o_test_remove5__12)).hashCode())));
        int[] array_231144324 = new int[]{2,5};
        	int[] array_1281367601 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove5__12).getLits();
        	for(int ii = 0; ii <array_231144324.length; ii++) {
        		org.junit.Assert.assertEquals(array_231144324[ii], array_1281367601[ii]);
        	};
        this.solver.isSatisfiable();
        Assert.assertEquals("1,-2", ((VecInt) (clause)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (clause)).hashCode())));
        Assert.assertFalse(((VecInt) (clause)).isEmpty());
        Assert.assertEquals("1,-2", ((VecInt) (o_test_remove5__3)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_test_remove5__3)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_remove5__3)).isEmpty());
        int[] array_1516230915 = new int[]{3,4};
        	int[] array_74047512 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove5__6).getLits();
        	for(int ii = 0; ii <array_1516230915.length; ii++) {
        		org.junit.Assert.assertEquals(array_1516230915[ii], array_74047512[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_test_remove5__6)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_test_remove5__6)).getActivity())), 0.1);
        Assert.assertEquals("-1[?] 2[?]", ((OriginalBinaryClause) (o_test_remove5__6)).toString());
        Assert.assertEquals(3, ((int) (((OriginalBinaryClause) (o_test_remove5__6)).hashCode())));
        Assert.assertEquals("1,-2", ((VecInt) (o_test_remove5__8)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_test_remove5__8)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_remove5__8)).isEmpty());
        Assert.assertEquals("1,-2", ((VecInt) (o_test_remove5__10)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_test_remove5__10)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_remove5__10)).isEmpty());
        int[] array_566841318 = new int[]{2,5};
        	int[] array_1777133809 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove5__12).getLits();
        	for(int ii = 0; ii <array_566841318.length; ii++) {
        		org.junit.Assert.assertEquals(array_566841318[ii], array_1777133809[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_test_remove5__12)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_test_remove5__12)).getActivity())), 0.1);
        Assert.assertEquals("1[?] -2[?]", ((OriginalBinaryClause) (o_test_remove5__12)).toString());
        Assert.assertEquals(3, ((int) (((OriginalBinaryClause) (o_test_remove5__12)).hashCode())));
    }

    @Test(timeout = 30000)
    public void test_remove5_remove45_remove206() throws Exception, ContradictionException, TimeoutException {
        IVecInt clause = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause)).toString());
        Assert.assertTrue(((VecInt) (clause)).isEmpty());
        IVecInt o_test_remove5__3 = clause.push((-1)).push(2);
        Assert.assertEquals("-1,2", ((VecInt) (o_test_remove5__3)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_test_remove5__3)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_remove5__3)).isEmpty());
        IConstr o_test_remove5__6 = solver.addClause(clause);
        int[] array_835106084 = new int[]{3,4};
        	int[] array_1666019680 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove5__6).getLits();
        	for(int ii = 0; ii <array_835106084.length; ii++) {
        		org.junit.Assert.assertEquals(array_835106084[ii], array_1666019680[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_test_remove5__6)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_test_remove5__6)).getActivity())), 0.1);
        Assert.assertEquals("-1[?] 2[?]", ((OriginalBinaryClause) (o_test_remove5__6)).toString());
        Assert.assertEquals(3, ((int) (((OriginalBinaryClause) (o_test_remove5__6)).hashCode())));
        int[] array_309932283 = new int[]{3,4};
        	int[] array_750147619 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove5__6).getLits();
        	for(int ii = 0; ii <array_309932283.length; ii++) {
        		org.junit.Assert.assertEquals(array_309932283[ii], array_750147619[ii]);
        	};
        int[] array_93386990 = new int[]{3,4};
        	int[] array_1694934693 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove5__6).getLits();
        	for(int ii = 0; ii <array_93386990.length; ii++) {
        		org.junit.Assert.assertEquals(array_93386990[ii], array_1694934693[ii]);
        	};
        clause.clear();
        clause.clear();
        IVecInt o_test_remove5__8 = clause.push(1);
        Assert.assertEquals("1", ((VecInt) (o_test_remove5__8)).toString());
        Assert.assertEquals(1, ((int) (((VecInt) (o_test_remove5__8)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_remove5__8)).isEmpty());
        IVecInt o_test_remove5__10 = clause.push((-2));
        Assert.assertEquals("1,-2", ((VecInt) (o_test_remove5__10)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_test_remove5__10)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_remove5__10)).isEmpty());
        IConstr o_test_remove5__12 = solver.addClause(clause);
        int[] array_758981284 = new int[]{2,5};
        	int[] array_323067337 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove5__12).getLits();
        	for(int ii = 0; ii <array_758981284.length; ii++) {
        		org.junit.Assert.assertEquals(array_758981284[ii], array_323067337[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_test_remove5__12)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_test_remove5__12)).getActivity())), 0.1);
        Assert.assertEquals("1[?] -2[?]", ((OriginalBinaryClause) (o_test_remove5__12)).toString());
        Assert.assertEquals(3, ((int) (((OriginalBinaryClause) (o_test_remove5__12)).hashCode())));
        int[] array_1546312652 = new int[]{2,5};
        	int[] array_1916813367 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove5__12).getLits();
        	for(int ii = 0; ii <array_1546312652.length; ii++) {
        		org.junit.Assert.assertEquals(array_1546312652[ii], array_1916813367[ii]);
        	};
        Assert.assertEquals("1,-2", ((VecInt) (clause)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (clause)).hashCode())));
        Assert.assertFalse(((VecInt) (clause)).isEmpty());
        Assert.assertEquals("1,-2", ((VecInt) (o_test_remove5__3)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_test_remove5__3)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_remove5__3)).isEmpty());
        int[] array_738477146 = new int[]{3,4};
        	int[] array_237581701 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove5__6).getLits();
        	for(int ii = 0; ii <array_738477146.length; ii++) {
        		org.junit.Assert.assertEquals(array_738477146[ii], array_237581701[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_test_remove5__6)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_test_remove5__6)).getActivity())), 0.1);
        Assert.assertEquals("-1[?] 2[?]", ((OriginalBinaryClause) (o_test_remove5__6)).toString());
        Assert.assertEquals(3, ((int) (((OriginalBinaryClause) (o_test_remove5__6)).hashCode())));
        Assert.assertEquals("1,-2", ((VecInt) (o_test_remove5__8)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_test_remove5__8)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_remove5__8)).isEmpty());
        Assert.assertEquals("1,-2", ((VecInt) (o_test_remove5__10)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_test_remove5__10)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_remove5__10)).isEmpty());
        int[] array_1598938065 = new int[]{2,5};
        	int[] array_2014885925 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove5__12).getLits();
        	for(int ii = 0; ii <array_1598938065.length; ii++) {
        		org.junit.Assert.assertEquals(array_1598938065[ii], array_2014885925[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_test_remove5__12)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_test_remove5__12)).getActivity())), 0.1);
        Assert.assertEquals("1[?] -2[?]", ((OriginalBinaryClause) (o_test_remove5__12)).toString());
        Assert.assertEquals(3, ((int) (((OriginalBinaryClause) (o_test_remove5__12)).hashCode())));
    }

    @Test(timeout = 30000)
    public void test_remove7_remove52_remove146() throws Exception, ContradictionException, TimeoutException {
        IVecInt clause = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause)).toString());
        Assert.assertTrue(((VecInt) (clause)).isEmpty());
        IVecInt o_test_remove7__3 = clause.push((-1)).push(2);
        Assert.assertEquals("-1,2", ((VecInt) (o_test_remove7__3)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_test_remove7__3)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_remove7__3)).isEmpty());
        IConstr o_test_remove7__6 = solver.addClause(clause);
        int[] array_1914705027 = new int[]{3,4};
        	int[] array_221548755 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove7__6).getLits();
        	for(int ii = 0; ii <array_1914705027.length; ii++) {
        		org.junit.Assert.assertEquals(array_1914705027[ii], array_221548755[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_test_remove7__6)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_test_remove7__6)).getActivity())), 0.1);
        Assert.assertEquals("-1[?] 2[?]", ((OriginalBinaryClause) (o_test_remove7__6)).toString());
        Assert.assertEquals(3, ((int) (((OriginalBinaryClause) (o_test_remove7__6)).hashCode())));
        int[] array_994963651 = new int[]{3,4};
        	int[] array_1810461298 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove7__6).getLits();
        	for(int ii = 0; ii <array_994963651.length; ii++) {
        		org.junit.Assert.assertEquals(array_994963651[ii], array_1810461298[ii]);
        	};
        int[] array_1099665245 = new int[]{3,4};
        	int[] array_1020946551 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove7__6).getLits();
        	for(int ii = 0; ii <array_1099665245.length; ii++) {
        		org.junit.Assert.assertEquals(array_1099665245[ii], array_1020946551[ii]);
        	};
        IConstr o_test_remove7__7 = solver.addClause(clause);
        int[] array_1732722452 = new int[]{3,4};
        	int[] array_266940695 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove7__7).getLits();
        	for(int ii = 0; ii <array_1732722452.length; ii++) {
        		org.junit.Assert.assertEquals(array_1732722452[ii], array_266940695[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_test_remove7__7)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_test_remove7__7)).getActivity())), 0.1);
        Assert.assertEquals("-1[?] 2[?]", ((OriginalBinaryClause) (o_test_remove7__7)).toString());
        Assert.assertEquals(3, ((int) (((OriginalBinaryClause) (o_test_remove7__7)).hashCode())));
        int[] array_1227856507 = new int[]{3,4};
        	int[] array_713970107 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove7__7).getLits();
        	for(int ii = 0; ii <array_1227856507.length; ii++) {
        		org.junit.Assert.assertEquals(array_1227856507[ii], array_713970107[ii]);
        	};
        int[] array_1495089740 = new int[]{3,4};
        	int[] array_1221105098 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove7__7).getLits();
        	for(int ii = 0; ii <array_1495089740.length; ii++) {
        		org.junit.Assert.assertEquals(array_1495089740[ii], array_1221105098[ii]);
        	};
        IVecInt o_test_remove7__10 = clause.push(1);
        Assert.assertEquals("-1,2,1", ((VecInt) (o_test_remove7__10)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_test_remove7__10)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_remove7__10)).isEmpty());
        IConstr o_test_remove7__11 = solver.addClause(clause);
        solver.isSatisfiable();
        this.solver.unsatExplanation();
    }

    @Test(timeout = 30000)
    public void test_remove7_remove52_remove149() throws Exception, ContradictionException, TimeoutException {
        IVecInt clause = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause)).toString());
        Assert.assertTrue(((VecInt) (clause)).isEmpty());
        IVecInt o_test_remove7__3 = clause.push((-1)).push(2);
        Assert.assertEquals("-1,2", ((VecInt) (o_test_remove7__3)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_test_remove7__3)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_remove7__3)).isEmpty());
        IConstr o_test_remove7__6 = solver.addClause(clause);
        int[] array_2065162280 = new int[]{3,4};
        	int[] array_1947384779 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove7__6).getLits();
        	for(int ii = 0; ii <array_2065162280.length; ii++) {
        		org.junit.Assert.assertEquals(array_2065162280[ii], array_1947384779[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_test_remove7__6)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_test_remove7__6)).getActivity())), 0.1);
        Assert.assertEquals("-1[?] 2[?]", ((OriginalBinaryClause) (o_test_remove7__6)).toString());
        Assert.assertEquals(3, ((int) (((OriginalBinaryClause) (o_test_remove7__6)).hashCode())));
        int[] array_994963651 = new int[]{3,4};
        	int[] array_1810461298 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove7__6).getLits();
        	for(int ii = 0; ii <array_994963651.length; ii++) {
        		org.junit.Assert.assertEquals(array_994963651[ii], array_1810461298[ii]);
        	};
        int[] array_1099665245 = new int[]{3,4};
        	int[] array_1020946551 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove7__6).getLits();
        	for(int ii = 0; ii <array_1099665245.length; ii++) {
        		org.junit.Assert.assertEquals(array_1099665245[ii], array_1020946551[ii]);
        	};
        IConstr o_test_remove7__7 = solver.addClause(clause);
        int[] array_1625541399 = new int[]{3,4};
        	int[] array_1745347144 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove7__7).getLits();
        	for(int ii = 0; ii <array_1625541399.length; ii++) {
        		org.junit.Assert.assertEquals(array_1625541399[ii], array_1745347144[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_test_remove7__7)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_test_remove7__7)).getActivity())), 0.1);
        Assert.assertEquals("-1[?] 2[?]", ((OriginalBinaryClause) (o_test_remove7__7)).toString());
        Assert.assertEquals(3, ((int) (((OriginalBinaryClause) (o_test_remove7__7)).hashCode())));
        int[] array_1227856507 = new int[]{3,4};
        	int[] array_713970107 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove7__7).getLits();
        	for(int ii = 0; ii <array_1227856507.length; ii++) {
        		org.junit.Assert.assertEquals(array_1227856507[ii], array_713970107[ii]);
        	};
        int[] array_1495089740 = new int[]{3,4};
        	int[] array_1221105098 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove7__7).getLits();
        	for(int ii = 0; ii <array_1495089740.length; ii++) {
        		org.junit.Assert.assertEquals(array_1495089740[ii], array_1221105098[ii]);
        	};
        clause.clear();
        IVecInt o_test_remove7__10 = clause.push(1);
        Assert.assertEquals("1", ((VecInt) (o_test_remove7__10)).toString());
        Assert.assertEquals(1, ((int) (((VecInt) (o_test_remove7__10)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_remove7__10)).isEmpty());
        IConstr o_test_remove7__11 = solver.addClause(clause);
        Assert.assertTrue(((UnitClause) (o_test_remove7__11)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_test_remove7__11)).getActivity())), 0.1);
        Assert.assertEquals("1", ((UnitClause) (o_test_remove7__11)).toString());
        this.solver.unsatExplanation();
    }

    @Test(timeout = 30000)
    public void test_remove7_remove52_remove153() throws Exception, ContradictionException, TimeoutException {
        IVecInt clause = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause)).toString());
        Assert.assertTrue(((VecInt) (clause)).isEmpty());
        IVecInt o_test_remove7__3 = clause.push((-1)).push(2);
        Assert.assertEquals("-1,2", ((VecInt) (o_test_remove7__3)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_test_remove7__3)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_remove7__3)).isEmpty());
        IConstr o_test_remove7__6 = solver.addClause(clause);
        int[] array_1222220459 = new int[]{3,4};
        	int[] array_1839866620 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove7__6).getLits();
        	for(int ii = 0; ii <array_1222220459.length; ii++) {
        		org.junit.Assert.assertEquals(array_1222220459[ii], array_1839866620[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_test_remove7__6)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_test_remove7__6)).getActivity())), 0.1);
        Assert.assertEquals("-1[?] 2[?]", ((OriginalBinaryClause) (o_test_remove7__6)).toString());
        Assert.assertEquals(3, ((int) (((OriginalBinaryClause) (o_test_remove7__6)).hashCode())));
        int[] array_994963651 = new int[]{3,4};
        	int[] array_1810461298 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove7__6).getLits();
        	for(int ii = 0; ii <array_994963651.length; ii++) {
        		org.junit.Assert.assertEquals(array_994963651[ii], array_1810461298[ii]);
        	};
        int[] array_1099665245 = new int[]{3,4};
        	int[] array_1020946551 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove7__6).getLits();
        	for(int ii = 0; ii <array_1099665245.length; ii++) {
        		org.junit.Assert.assertEquals(array_1099665245[ii], array_1020946551[ii]);
        	};
        IConstr o_test_remove7__7 = solver.addClause(clause);
        int[] array_234071959 = new int[]{3,4};
        	int[] array_1199591453 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove7__7).getLits();
        	for(int ii = 0; ii <array_234071959.length; ii++) {
        		org.junit.Assert.assertEquals(array_234071959[ii], array_1199591453[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_test_remove7__7)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_test_remove7__7)).getActivity())), 0.1);
        Assert.assertEquals("-1[?] 2[?]", ((OriginalBinaryClause) (o_test_remove7__7)).toString());
        Assert.assertEquals(3, ((int) (((OriginalBinaryClause) (o_test_remove7__7)).hashCode())));
        int[] array_1227856507 = new int[]{3,4};
        	int[] array_713970107 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove7__7).getLits();
        	for(int ii = 0; ii <array_1227856507.length; ii++) {
        		org.junit.Assert.assertEquals(array_1227856507[ii], array_713970107[ii]);
        	};
        int[] array_1495089740 = new int[]{3,4};
        	int[] array_1221105098 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove7__7).getLits();
        	for(int ii = 0; ii <array_1495089740.length; ii++) {
        		org.junit.Assert.assertEquals(array_1495089740[ii], array_1221105098[ii]);
        	};
        clause.clear();
        IVecInt o_test_remove7__10 = clause.push(1);
        Assert.assertEquals("1", ((VecInt) (o_test_remove7__10)).toString());
        Assert.assertEquals(1, ((int) (((VecInt) (o_test_remove7__10)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_remove7__10)).isEmpty());
        IConstr o_test_remove7__11 = solver.addClause(clause);
        Assert.assertTrue(((UnitClause) (o_test_remove7__11)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_test_remove7__11)).getActivity())), 0.1);
        Assert.assertEquals("1", ((UnitClause) (o_test_remove7__11)).toString());
        this.solver.isSatisfiable();
        Assert.assertEquals("1", ((VecInt) (clause)).toString());
        Assert.assertEquals(1, ((int) (((VecInt) (clause)).hashCode())));
        Assert.assertFalse(((VecInt) (clause)).isEmpty());
        Assert.assertEquals("1", ((VecInt) (o_test_remove7__3)).toString());
        Assert.assertEquals(1, ((int) (((VecInt) (o_test_remove7__3)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_remove7__3)).isEmpty());
        int[] array_1549497873 = new int[]{3,4};
        	int[] array_2034946429 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove7__6).getLits();
        	for(int ii = 0; ii <array_1549497873.length; ii++) {
        		org.junit.Assert.assertEquals(array_1549497873[ii], array_2034946429[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_test_remove7__6)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_test_remove7__6)).getActivity())), 0.1);
        Assert.assertEquals("-1[F] 2[?]", ((OriginalBinaryClause) (o_test_remove7__6)).toString());
        Assert.assertEquals(3, ((int) (((OriginalBinaryClause) (o_test_remove7__6)).hashCode())));
        int[] array_1667689327 = new int[]{3,4};
        	int[] array_1035891738 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove7__7).getLits();
        	for(int ii = 0; ii <array_1667689327.length; ii++) {
        		org.junit.Assert.assertEquals(array_1667689327[ii], array_1035891738[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_test_remove7__7)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_test_remove7__7)).getActivity())), 0.1);
        Assert.assertEquals("-1[F] 2[?]", ((OriginalBinaryClause) (o_test_remove7__7)).toString());
        Assert.assertEquals(3, ((int) (((OriginalBinaryClause) (o_test_remove7__7)).hashCode())));
        Assert.assertEquals("1", ((VecInt) (o_test_remove7__10)).toString());
        Assert.assertEquals(1, ((int) (((VecInt) (o_test_remove7__10)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_remove7__10)).isEmpty());
        Assert.assertTrue(((UnitClause) (o_test_remove7__11)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_test_remove7__11)).getActivity())), 0.1);
        Assert.assertEquals("1", ((UnitClause) (o_test_remove7__11)).toString());
    }

    @Test(timeout = 30000)
    public void test_remove7_remove58_remove180() throws Exception, ContradictionException, TimeoutException {
        IVecInt clause = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause)).toString());
        Assert.assertTrue(((VecInt) (clause)).isEmpty());
        IVecInt o_test_remove7__3 = clause.push((-1)).push(2);
        Assert.assertEquals("-1,2", ((VecInt) (o_test_remove7__3)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_test_remove7__3)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_remove7__3)).isEmpty());
        IConstr o_test_remove7__6 = solver.addClause(clause);
        int[] array_976010804 = new int[]{3,4};
        	int[] array_1323661043 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove7__6).getLits();
        	for(int ii = 0; ii <array_976010804.length; ii++) {
        		org.junit.Assert.assertEquals(array_976010804[ii], array_1323661043[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_test_remove7__6)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_test_remove7__6)).getActivity())), 0.1);
        Assert.assertEquals("-1[?] 2[?]", ((OriginalBinaryClause) (o_test_remove7__6)).toString());
        Assert.assertEquals(3, ((int) (((OriginalBinaryClause) (o_test_remove7__6)).hashCode())));
        int[] array_944630394 = new int[]{3,4};
        	int[] array_218714234 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove7__6).getLits();
        	for(int ii = 0; ii <array_944630394.length; ii++) {
        		org.junit.Assert.assertEquals(array_944630394[ii], array_218714234[ii]);
        	};
        int[] array_1099665245 = new int[]{3,4};
        	int[] array_1020946551 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove7__6).getLits();
        	for(int ii = 0; ii <array_1099665245.length; ii++) {
        		org.junit.Assert.assertEquals(array_1099665245[ii], array_1020946551[ii]);
        	};
        IConstr o_test_remove7__7 = solver.addClause(clause);
        int[] array_1513180531 = new int[]{3,4};
        	int[] array_1663272577 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove7__7).getLits();
        	for(int ii = 0; ii <array_1513180531.length; ii++) {
        		org.junit.Assert.assertEquals(array_1513180531[ii], array_1663272577[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_test_remove7__7)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_test_remove7__7)).getActivity())), 0.1);
        Assert.assertEquals("-1[?] 2[?]", ((OriginalBinaryClause) (o_test_remove7__7)).toString());
        Assert.assertEquals(3, ((int) (((OriginalBinaryClause) (o_test_remove7__7)).hashCode())));
        int[] array_1520847815 = new int[]{3,4};
        	int[] array_2069838431 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove7__7).getLits();
        	for(int ii = 0; ii <array_1520847815.length; ii++) {
        		org.junit.Assert.assertEquals(array_1520847815[ii], array_2069838431[ii]);
        	};
        int[] array_1495089740 = new int[]{3,4};
        	int[] array_1221105098 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove7__7).getLits();
        	for(int ii = 0; ii <array_1495089740.length; ii++) {
        		org.junit.Assert.assertEquals(array_1495089740[ii], array_1221105098[ii]);
        	};
        clause.clear();
        clause.clear();
        IVecInt o_test_remove7__10 = clause.push(1);
        Assert.assertEquals("1", ((VecInt) (o_test_remove7__10)).toString());
        Assert.assertEquals(1, ((int) (((VecInt) (o_test_remove7__10)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_remove7__10)).isEmpty());
        IConstr o_test_remove7__11 = this.solver.addClause(clause);
        Assert.assertTrue(((UnitClause) (o_test_remove7__11)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_test_remove7__11)).getActivity())), 0.1);
        Assert.assertEquals("1", ((UnitClause) (o_test_remove7__11)).toString());
        Assert.assertEquals("1", ((VecInt) (clause)).toString());
        Assert.assertEquals(1, ((int) (((VecInt) (clause)).hashCode())));
        Assert.assertFalse(((VecInt) (clause)).isEmpty());
        Assert.assertEquals("1", ((VecInt) (o_test_remove7__3)).toString());
        Assert.assertEquals(1, ((int) (((VecInt) (o_test_remove7__3)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_remove7__3)).isEmpty());
        int[] array_1818680526 = new int[]{3,4};
        	int[] array_459488428 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove7__6).getLits();
        	for(int ii = 0; ii <array_1818680526.length; ii++) {
        		org.junit.Assert.assertEquals(array_1818680526[ii], array_459488428[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_test_remove7__6)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_test_remove7__6)).getActivity())), 0.1);
        Assert.assertEquals("-1[F] 2[?]", ((OriginalBinaryClause) (o_test_remove7__6)).toString());
        Assert.assertEquals(3, ((int) (((OriginalBinaryClause) (o_test_remove7__6)).hashCode())));
        int[] array_341077786 = new int[]{3,4};
        	int[] array_1310757609 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove7__7).getLits();
        	for(int ii = 0; ii <array_341077786.length; ii++) {
        		org.junit.Assert.assertEquals(array_341077786[ii], array_1310757609[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_test_remove7__7)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_test_remove7__7)).getActivity())), 0.1);
        Assert.assertEquals("-1[F] 2[?]", ((OriginalBinaryClause) (o_test_remove7__7)).toString());
        Assert.assertEquals(3, ((int) (((OriginalBinaryClause) (o_test_remove7__7)).hashCode())));
        Assert.assertEquals("1", ((VecInt) (o_test_remove7__10)).toString());
        Assert.assertEquals(1, ((int) (((VecInt) (o_test_remove7__10)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_remove7__10)).isEmpty());
    }

    @Test(timeout = 30000)
    public void test_remove8_remove35_remove174() throws Exception, ContradictionException, TimeoutException {
        IVecInt clause = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause)).toString());
        Assert.assertTrue(((VecInt) (clause)).isEmpty());
        IVecInt o_test_remove8__3 = clause.push((-1)).push(2);
        Assert.assertEquals("-1,2", ((VecInt) (o_test_remove8__3)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_test_remove8__3)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_remove8__3)).isEmpty());
        IConstr o_test_remove8__6 = solver.addClause(clause);
        int[] array_771602901 = new int[]{3,4};
        	int[] array_377294912 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove8__6).getLits();
        	for(int ii = 0; ii <array_771602901.length; ii++) {
        		org.junit.Assert.assertEquals(array_771602901[ii], array_377294912[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_test_remove8__6)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_test_remove8__6)).getActivity())), 0.1);
        Assert.assertEquals("-1[?] 2[?]", ((OriginalBinaryClause) (o_test_remove8__6)).toString());
        Assert.assertEquals(3, ((int) (((OriginalBinaryClause) (o_test_remove8__6)).hashCode())));
        int[] array_203350472 = new int[]{3,4};
        	int[] array_934378535 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove8__6).getLits();
        	for(int ii = 0; ii <array_203350472.length; ii++) {
        		org.junit.Assert.assertEquals(array_203350472[ii], array_934378535[ii]);
        	};
        int[] array_1917574668 = new int[]{3,4};
        	int[] array_2090982333 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove8__6).getLits();
        	for(int ii = 0; ii <array_1917574668.length; ii++) {
        		org.junit.Assert.assertEquals(array_1917574668[ii], array_2090982333[ii]);
        	};
        IConstr o_test_remove8__7 = solver.addClause(clause);
        int[] array_104917262 = new int[]{3,4};
        	int[] array_2070404094 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove8__7).getLits();
        	for(int ii = 0; ii <array_104917262.length; ii++) {
        		org.junit.Assert.assertEquals(array_104917262[ii], array_2070404094[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_test_remove8__7)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_test_remove8__7)).getActivity())), 0.1);
        Assert.assertEquals("-1[?] 2[?]", ((OriginalBinaryClause) (o_test_remove8__7)).toString());
        Assert.assertEquals(3, ((int) (((OriginalBinaryClause) (o_test_remove8__7)).hashCode())));
        int[] array_503713077 = new int[]{3,4};
        	int[] array_1999051967 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove8__7).getLits();
        	for(int ii = 0; ii <array_503713077.length; ii++) {
        		org.junit.Assert.assertEquals(array_503713077[ii], array_1999051967[ii]);
        	};
        int[] array_1733007852 = new int[]{3,4};
        	int[] array_476141655 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove8__7).getLits();
        	for(int ii = 0; ii <array_1733007852.length; ii++) {
        		org.junit.Assert.assertEquals(array_1733007852[ii], array_476141655[ii]);
        	};
        IVecInt o_test_remove8__10 = clause.push(1);
        Assert.assertEquals("-1,2,1", ((VecInt) (o_test_remove8__10)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_test_remove8__10)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_remove8__10)).isEmpty());
        IVecInt o_test_remove8__11 = clause.push((-2));
        Assert.assertEquals("-1,2,1,-2", ((VecInt) (o_test_remove8__11)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_test_remove8__11)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_remove8__11)).isEmpty());
        solver.isSatisfiable();
        this.solver.unsatExplanation();
    }

    @Test(timeout = 30000)
    public void test_remove8_remove35_remove181() throws Exception, ContradictionException, TimeoutException {
        IVecInt clause = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause)).toString());
        Assert.assertTrue(((VecInt) (clause)).isEmpty());
        IVecInt o_test_remove8__3 = clause.push((-1)).push(2);
        Assert.assertEquals("-1,2", ((VecInt) (o_test_remove8__3)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_test_remove8__3)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_remove8__3)).isEmpty());
        IConstr o_test_remove8__6 = solver.addClause(clause);
        int[] array_1672987406 = new int[]{3,4};
        	int[] array_960178132 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove8__6).getLits();
        	for(int ii = 0; ii <array_1672987406.length; ii++) {
        		org.junit.Assert.assertEquals(array_1672987406[ii], array_960178132[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_test_remove8__6)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_test_remove8__6)).getActivity())), 0.1);
        Assert.assertEquals("-1[?] 2[?]", ((OriginalBinaryClause) (o_test_remove8__6)).toString());
        Assert.assertEquals(3, ((int) (((OriginalBinaryClause) (o_test_remove8__6)).hashCode())));
        int[] array_203350472 = new int[]{3,4};
        	int[] array_934378535 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove8__6).getLits();
        	for(int ii = 0; ii <array_203350472.length; ii++) {
        		org.junit.Assert.assertEquals(array_203350472[ii], array_934378535[ii]);
        	};
        int[] array_1917574668 = new int[]{3,4};
        	int[] array_2090982333 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove8__6).getLits();
        	for(int ii = 0; ii <array_1917574668.length; ii++) {
        		org.junit.Assert.assertEquals(array_1917574668[ii], array_2090982333[ii]);
        	};
        IConstr o_test_remove8__7 = solver.addClause(clause);
        int[] array_1131787365 = new int[]{3,4};
        	int[] array_1240554721 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove8__7).getLits();
        	for(int ii = 0; ii <array_1131787365.length; ii++) {
        		org.junit.Assert.assertEquals(array_1131787365[ii], array_1240554721[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_test_remove8__7)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_test_remove8__7)).getActivity())), 0.1);
        Assert.assertEquals("-1[?] 2[?]", ((OriginalBinaryClause) (o_test_remove8__7)).toString());
        Assert.assertEquals(3, ((int) (((OriginalBinaryClause) (o_test_remove8__7)).hashCode())));
        int[] array_503713077 = new int[]{3,4};
        	int[] array_1999051967 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove8__7).getLits();
        	for(int ii = 0; ii <array_503713077.length; ii++) {
        		org.junit.Assert.assertEquals(array_503713077[ii], array_1999051967[ii]);
        	};
        int[] array_1733007852 = new int[]{3,4};
        	int[] array_476141655 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove8__7).getLits();
        	for(int ii = 0; ii <array_1733007852.length; ii++) {
        		org.junit.Assert.assertEquals(array_1733007852[ii], array_476141655[ii]);
        	};
        clause.clear();
        IVecInt o_test_remove8__10 = clause.push(1);
        Assert.assertEquals("1", ((VecInt) (o_test_remove8__10)).toString());
        Assert.assertEquals(1, ((int) (((VecInt) (o_test_remove8__10)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_remove8__10)).isEmpty());
        IVecInt o_test_remove8__11 = clause.push((-2));
        Assert.assertEquals("1,-2", ((VecInt) (o_test_remove8__11)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_test_remove8__11)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_remove8__11)).isEmpty());
        this.solver.isSatisfiable();
        Assert.assertEquals("1,-2", ((VecInt) (clause)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (clause)).hashCode())));
        Assert.assertFalse(((VecInt) (clause)).isEmpty());
        Assert.assertEquals("1,-2", ((VecInt) (o_test_remove8__3)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_test_remove8__3)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_remove8__3)).isEmpty());
        int[] array_1148018720 = new int[]{3,4};
        	int[] array_1063632618 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove8__6).getLits();
        	for(int ii = 0; ii <array_1148018720.length; ii++) {
        		org.junit.Assert.assertEquals(array_1148018720[ii], array_1063632618[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_test_remove8__6)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_test_remove8__6)).getActivity())), 0.1);
        Assert.assertEquals("-1[?] 2[?]", ((OriginalBinaryClause) (o_test_remove8__6)).toString());
        Assert.assertEquals(3, ((int) (((OriginalBinaryClause) (o_test_remove8__6)).hashCode())));
        int[] array_804819380 = new int[]{3,4};
        	int[] array_975056820 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove8__7).getLits();
        	for(int ii = 0; ii <array_804819380.length; ii++) {
        		org.junit.Assert.assertEquals(array_804819380[ii], array_975056820[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_test_remove8__7)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_test_remove8__7)).getActivity())), 0.1);
        Assert.assertEquals("-1[?] 2[?]", ((OriginalBinaryClause) (o_test_remove8__7)).toString());
        Assert.assertEquals(3, ((int) (((OriginalBinaryClause) (o_test_remove8__7)).hashCode())));
        Assert.assertEquals("1,-2", ((VecInt) (o_test_remove8__10)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_test_remove8__10)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_remove8__10)).isEmpty());
        Assert.assertEquals("1,-2", ((VecInt) (o_test_remove8__11)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_test_remove8__11)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_remove8__11)).isEmpty());
    }

    @Test(timeout = 30000)
    public void test_remove9_remove56_remove147() throws Exception, ContradictionException, TimeoutException {
        IVecInt clause = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause)).toString());
        Assert.assertTrue(((VecInt) (clause)).isEmpty());
        IVecInt o_test_remove9__3 = clause.push((-1)).push(2);
        Assert.assertEquals("-1,2", ((VecInt) (o_test_remove9__3)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_test_remove9__3)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_remove9__3)).isEmpty());
        IConstr o_test_remove9__6 = solver.addClause(clause);
        int[] array_60966180 = new int[]{3,4};
        	int[] array_1652527992 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove9__6).getLits();
        	for(int ii = 0; ii <array_60966180.length; ii++) {
        		org.junit.Assert.assertEquals(array_60966180[ii], array_1652527992[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_test_remove9__6)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_test_remove9__6)).getActivity())), 0.1);
        Assert.assertEquals("-1[?] 2[?]", ((OriginalBinaryClause) (o_test_remove9__6)).toString());
        Assert.assertEquals(3, ((int) (((OriginalBinaryClause) (o_test_remove9__6)).hashCode())));
        int[] array_15999762 = new int[]{3,4};
        	int[] array_1062577317 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove9__6).getLits();
        	for(int ii = 0; ii <array_15999762.length; ii++) {
        		org.junit.Assert.assertEquals(array_15999762[ii], array_1062577317[ii]);
        	};
        int[] array_1882063694 = new int[]{3,4};
        	int[] array_901263046 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove9__6).getLits();
        	for(int ii = 0; ii <array_1882063694.length; ii++) {
        		org.junit.Assert.assertEquals(array_1882063694[ii], array_901263046[ii]);
        	};
        IConstr o_test_remove9__7 = solver.addClause(clause);
        int[] array_144906454 = new int[]{3,4};
        	int[] array_842361327 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove9__7).getLits();
        	for(int ii = 0; ii <array_144906454.length; ii++) {
        		org.junit.Assert.assertEquals(array_144906454[ii], array_842361327[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_test_remove9__7)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_test_remove9__7)).getActivity())), 0.1);
        Assert.assertEquals("-1[?] 2[?]", ((OriginalBinaryClause) (o_test_remove9__7)).toString());
        Assert.assertEquals(3, ((int) (((OriginalBinaryClause) (o_test_remove9__7)).hashCode())));
        int[] array_1647490445 = new int[]{3,4};
        	int[] array_1523841896 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove9__7).getLits();
        	for(int ii = 0; ii <array_1647490445.length; ii++) {
        		org.junit.Assert.assertEquals(array_1647490445[ii], array_1523841896[ii]);
        	};
        int[] array_1825005533 = new int[]{3,4};
        	int[] array_927971380 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove9__7).getLits();
        	for(int ii = 0; ii <array_1825005533.length; ii++) {
        		org.junit.Assert.assertEquals(array_1825005533[ii], array_927971380[ii]);
        	};
        IConstr o_test_remove9__8 = solver.addClause(clause);
        int[] array_324076790 = new int[]{3,4};
        	int[] array_1620116220 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove9__8).getLits();
        	for(int ii = 0; ii <array_324076790.length; ii++) {
        		org.junit.Assert.assertEquals(array_324076790[ii], array_1620116220[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_test_remove9__8)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_test_remove9__8)).getActivity())), 0.1);
        Assert.assertEquals("-1[?] 2[?]", ((OriginalBinaryClause) (o_test_remove9__8)).toString());
        Assert.assertEquals(3, ((int) (((OriginalBinaryClause) (o_test_remove9__8)).hashCode())));
        int[] array_1609868476 = new int[]{3,4};
        	int[] array_327662580 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove9__8).getLits();
        	for(int ii = 0; ii <array_1609868476.length; ii++) {
        		org.junit.Assert.assertEquals(array_1609868476[ii], array_327662580[ii]);
        	};
        int[] array_340637712 = new int[]{3,4};
        	int[] array_2028163065 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove9__8).getLits();
        	for(int ii = 0; ii <array_340637712.length; ii++) {
        		org.junit.Assert.assertEquals(array_340637712[ii], array_2028163065[ii]);
        	};
        clause.clear();
        IVecInt o_test_remove9__11 = clause.push(1);
        Assert.assertEquals("1", ((VecInt) (o_test_remove9__11)).toString());
        Assert.assertEquals(1, ((int) (((VecInt) (o_test_remove9__11)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_remove9__11)).isEmpty());
        IVecInt o_test_remove9__12 = clause.push((-2));
        Assert.assertEquals("1,-2", ((VecInt) (o_test_remove9__12)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_test_remove9__12)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_remove9__12)).isEmpty());
        int[] array_194402919 = new int[]{3,4};
        	int[] array_2024550689 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove9__6).getLits();
        	for(int ii = 0; ii <array_194402919.length; ii++) {
        		org.junit.Assert.assertEquals(array_194402919[ii], array_2024550689[ii]);
        	};
        int[] array_1775383297 = new int[]{3,4};
        	int[] array_1318706812 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove9__7).getLits();
        	for(int ii = 0; ii <array_1775383297.length; ii++) {
        		org.junit.Assert.assertEquals(array_1775383297[ii], array_1318706812[ii]);
        	};
        int[] array_823822799 = new int[]{3,4};
        	int[] array_2137733469 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove9__8).getLits();
        	for(int ii = 0; ii <array_823822799.length; ii++) {
        		org.junit.Assert.assertEquals(array_823822799[ii], array_2137733469[ii]);
        	};
        int[] array_571441765 = new int[]{3,4};
        	int[] array_1172047088 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove9__6).getLits();
        	for(int ii = 0; ii <array_571441765.length; ii++) {
        		org.junit.Assert.assertEquals(array_571441765[ii], array_1172047088[ii]);
        	};
        int[] array_666162082 = new int[]{3,4};
        	int[] array_267681211 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove9__7).getLits();
        	for(int ii = 0; ii <array_666162082.length; ii++) {
        		org.junit.Assert.assertEquals(array_666162082[ii], array_267681211[ii]);
        	};
        int[] array_597239996 = new int[]{3,4};
        	int[] array_74124859 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove9__8).getLits();
        	for(int ii = 0; ii <array_597239996.length; ii++) {
        		org.junit.Assert.assertEquals(array_597239996[ii], array_74124859[ii]);
        	};
        Assert.assertEquals("1,-2", ((VecInt) (clause)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (clause)).hashCode())));
        Assert.assertFalse(((VecInt) (clause)).isEmpty());
        Assert.assertEquals("1,-2", ((VecInt) (o_test_remove9__3)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_test_remove9__3)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_remove9__3)).isEmpty());
        int[] array_1065629848 = new int[]{3,4};
        	int[] array_903404050 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove9__6).getLits();
        	for(int ii = 0; ii <array_1065629848.length; ii++) {
        		org.junit.Assert.assertEquals(array_1065629848[ii], array_903404050[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_test_remove9__6)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_test_remove9__6)).getActivity())), 0.1);
        Assert.assertEquals("-1[?] 2[?]", ((OriginalBinaryClause) (o_test_remove9__6)).toString());
        Assert.assertEquals(3, ((int) (((OriginalBinaryClause) (o_test_remove9__6)).hashCode())));
        int[] array_895823773 = new int[]{3,4};
        	int[] array_2089159937 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove9__7).getLits();
        	for(int ii = 0; ii <array_895823773.length; ii++) {
        		org.junit.Assert.assertEquals(array_895823773[ii], array_2089159937[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_test_remove9__7)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_test_remove9__7)).getActivity())), 0.1);
        Assert.assertEquals("-1[?] 2[?]", ((OriginalBinaryClause) (o_test_remove9__7)).toString());
        Assert.assertEquals(3, ((int) (((OriginalBinaryClause) (o_test_remove9__7)).hashCode())));
        int[] array_997914045 = new int[]{3,4};
        	int[] array_2033974010 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove9__8).getLits();
        	for(int ii = 0; ii <array_997914045.length; ii++) {
        		org.junit.Assert.assertEquals(array_997914045[ii], array_2033974010[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_test_remove9__8)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_test_remove9__8)).getActivity())), 0.1);
        Assert.assertEquals("-1[?] 2[?]", ((OriginalBinaryClause) (o_test_remove9__8)).toString());
        Assert.assertEquals(3, ((int) (((OriginalBinaryClause) (o_test_remove9__8)).hashCode())));
        Assert.assertEquals("1,-2", ((VecInt) (o_test_remove9__11)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_test_remove9__11)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_remove9__11)).isEmpty());
        Assert.assertEquals("1,-2", ((VecInt) (o_test_remove9__12)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_test_remove9__12)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_remove9__12)).isEmpty());
    }

    @Test(timeout = 30000)
    public void test_remove5_remove38_remove202_failAssert4() throws Exception, ContradictionException, TimeoutException {
        try {
            IVecInt clause = new VecInt();
            IVecInt o_test_remove5__3 = clause.push((-1)).push(2);
            IConstr o_test_remove5__6 = solver.addClause(clause);
            int[] array_974525135 = new int[]{3,4};
            	int[] array_739918547 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove5__6).getLits();
            	for(int ii = 0; ii <array_974525135.length; ii++) {
            		org.junit.Assert.assertEquals(array_974525135[ii], array_739918547[ii]);
            	};
            int[] array_93386990 = new int[]{3,4};
            	int[] array_1694934693 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove5__6).getLits();
            	for(int ii = 0; ii <array_93386990.length; ii++) {
            		org.junit.Assert.assertEquals(array_93386990[ii], array_1694934693[ii]);
            	};
            IVecInt o_test_remove5__8 = clause.push(1);
            IVecInt o_test_remove5__10 = clause.push((-2));
            IConstr o_test_remove5__12 = solver.addClause(clause);
            int[] array_231144324 = new int[]{2,5};
            	int[] array_1281367601 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_remove5__12).getLits();
            	for(int ii = 0; ii <array_231144324.length; ii++) {
            		org.junit.Assert.assertEquals(array_231144324[ii], array_1281367601[ii]);
            	};
            solver.isSatisfiable();
            this.solver.unsatExplanation();
            org.junit.Assert.fail("test_remove5_remove38_remove202 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }
}

