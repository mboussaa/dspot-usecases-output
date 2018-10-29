package org.sat4j.tools;


import org.junit.Assert;
import org.junit.Test;
import org.sat4j.core.VecInt;
import org.sat4j.minisat.SolverFactory;
import org.sat4j.specs.ContradictionException;
import org.sat4j.specs.IConstr;
import org.sat4j.specs.ISolver;
import org.sat4j.specs.IVecInt;
import org.sat4j.specs.TimeoutException;


public class AmplBackboneTest {
    @Test(timeout = 10000)
    public void testEasyCaseWithOnlyOneModel() throws Exception, ContradictionException, TimeoutException {
        ISolver solver = SolverFactory.newDefault();
        IVecInt clause = new VecInt();
        IVecInt o_testEasyCaseWithOnlyOneModel__5 = clause.push(1).push(2).push(3);
        Assert.assertEquals("1,2,3", ((org.sat4j.core.VecInt)o_testEasyCaseWithOnlyOneModel__5).toString());
        Assert.assertEquals(2, ((int) (((org.sat4j.core.VecInt)o_testEasyCaseWithOnlyOneModel__5).hashCode())));
        Assert.assertFalse(((org.sat4j.core.VecInt)o_testEasyCaseWithOnlyOneModel__5).isEmpty());
        IConstr o_testEasyCaseWithOnlyOneModel__8 = solver.addClause(clause);
        Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testEasyCaseWithOnlyOneModel__8).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testEasyCaseWithOnlyOneModel__8).getActivity())), 0.1);
        int[] array_1917574668 = new int[]{2, 4, 6};
        	int[] array_2090982333 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testEasyCaseWithOnlyOneModel__8).getLits();
        	for(int ii = 0; ii <array_1917574668.length; ii++) {
        		org.junit.Assert.assertEquals(array_1917574668[ii], array_2090982333[ii]);
        	};
        Assert.assertEquals("1[?] 2[?] 3[?] ", ((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testEasyCaseWithOnlyOneModel__8).toString());
        Assert.assertEquals(4, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testEasyCaseWithOnlyOneModel__8).hashCode())));
        clause.clear();
        IVecInt o_testEasyCaseWithOnlyOneModel__10 = clause.push((-1)).push((-2));
        Assert.assertEquals("-1,-2", ((org.sat4j.core.VecInt)o_testEasyCaseWithOnlyOneModel__10).toString());
        Assert.assertEquals(-1, ((int) (((org.sat4j.core.VecInt)o_testEasyCaseWithOnlyOneModel__10).hashCode())));
        Assert.assertFalse(((org.sat4j.core.VecInt)o_testEasyCaseWithOnlyOneModel__10).isEmpty());
        IConstr o_testEasyCaseWithOnlyOneModel__14 = solver.addClause(clause);
        Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testEasyCaseWithOnlyOneModel__14).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testEasyCaseWithOnlyOneModel__14).getActivity())), 0.1);
        int[] array_1733007852 = new int[]{3, 5};
        	int[] array_476141655 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testEasyCaseWithOnlyOneModel__14).getLits();
        	for(int ii = 0; ii <array_1733007852.length; ii++) {
        		org.junit.Assert.assertEquals(array_1733007852[ii], array_476141655[ii]);
        	};
        Assert.assertEquals("-1[?] -2[?]", ((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testEasyCaseWithOnlyOneModel__14).toString());
        Assert.assertEquals(4, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testEasyCaseWithOnlyOneModel__14).hashCode())));
        clause.clear();
        IVecInt o_testEasyCaseWithOnlyOneModel__16 = clause.push((-1)).push((-3));
        Assert.assertEquals("-1,-3", ((org.sat4j.core.VecInt)o_testEasyCaseWithOnlyOneModel__16).toString());
        Assert.assertEquals(-2, ((int) (((org.sat4j.core.VecInt)o_testEasyCaseWithOnlyOneModel__16).hashCode())));
        Assert.assertFalse(((org.sat4j.core.VecInt)o_testEasyCaseWithOnlyOneModel__16).isEmpty());
        IConstr o_testEasyCaseWithOnlyOneModel__20 = solver.addClause(clause);
        Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testEasyCaseWithOnlyOneModel__20).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testEasyCaseWithOnlyOneModel__20).getActivity())), 0.1);
        int[] array_1882063694 = new int[]{3, 7};
        	int[] array_901263046 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testEasyCaseWithOnlyOneModel__20).getLits();
        	for(int ii = 0; ii <array_1882063694.length; ii++) {
        		org.junit.Assert.assertEquals(array_1882063694[ii], array_901263046[ii]);
        	};
        Assert.assertEquals("-1[?] -3[?]", ((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testEasyCaseWithOnlyOneModel__20).toString());
        Assert.assertEquals(5, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testEasyCaseWithOnlyOneModel__20).hashCode())));
        clause.clear();
        IVecInt o_testEasyCaseWithOnlyOneModel__22 = clause.push(1);
        Assert.assertEquals("1", ((org.sat4j.core.VecInt)o_testEasyCaseWithOnlyOneModel__22).toString());
        Assert.assertEquals(1, ((int) (((org.sat4j.core.VecInt)o_testEasyCaseWithOnlyOneModel__22).hashCode())));
        Assert.assertFalse(((org.sat4j.core.VecInt)o_testEasyCaseWithOnlyOneModel__22).isEmpty());
        IConstr o_testEasyCaseWithOnlyOneModel__23 = solver.addClause(clause);
        Assert.assertTrue(((org.sat4j.minisat.constraints.cnf.UnitClause)o_testEasyCaseWithOnlyOneModel__23).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.UnitClause)o_testEasyCaseWithOnlyOneModel__23).getActivity())), 0.1);
        Assert.assertEquals("1", ((org.sat4j.minisat.constraints.cnf.UnitClause)o_testEasyCaseWithOnlyOneModel__23).toString());
        clause.clear();
        IVecInt backbone = Backbone.instance().compute(solver);
        boolean o_testEasyCaseWithOnlyOneModel__28 = backbone.contains(1);
        Assert.assertTrue(o_testEasyCaseWithOnlyOneModel__28);
        boolean o_testEasyCaseWithOnlyOneModel__29 = backbone.contains((-2));
        Assert.assertTrue(o_testEasyCaseWithOnlyOneModel__29);
        boolean o_testEasyCaseWithOnlyOneModel__31 = backbone.contains((-3));
        Assert.assertTrue(o_testEasyCaseWithOnlyOneModel__31);
        Assert.assertEquals("", ((org.sat4j.core.VecInt)o_testEasyCaseWithOnlyOneModel__5).toString());
        Assert.assertTrue(((org.sat4j.core.VecInt)o_testEasyCaseWithOnlyOneModel__5).isEmpty());
        Assert.assertTrue(((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testEasyCaseWithOnlyOneModel__8).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testEasyCaseWithOnlyOneModel__8).getActivity())), 0.1);
        int[] array_1825005533 = new int[]{2, 4, 6};
        	int[] array_927971380 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testEasyCaseWithOnlyOneModel__8).getLits();
        	for(int ii = 0; ii <array_1825005533.length; ii++) {
        		org.junit.Assert.assertEquals(array_1825005533[ii], array_927971380[ii]);
        	};
        Assert.assertEquals("1[T] 2[?] 3[?] ", ((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testEasyCaseWithOnlyOneModel__8).toString());
        Assert.assertEquals(4, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testEasyCaseWithOnlyOneModel__8).hashCode())));
        Assert.assertEquals("", ((org.sat4j.core.VecInt)o_testEasyCaseWithOnlyOneModel__10).toString());
        Assert.assertTrue(((org.sat4j.core.VecInt)o_testEasyCaseWithOnlyOneModel__10).isEmpty());
        Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testEasyCaseWithOnlyOneModel__14).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testEasyCaseWithOnlyOneModel__14).getActivity())), 0.1);
        int[] array_340637712 = new int[]{3, 5};
        	int[] array_2028163065 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testEasyCaseWithOnlyOneModel__14).getLits();
        	for(int ii = 0; ii <array_340637712.length; ii++) {
        		org.junit.Assert.assertEquals(array_340637712[ii], array_2028163065[ii]);
        	};
        Assert.assertEquals("-1[F] -2[?]", ((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testEasyCaseWithOnlyOneModel__14).toString());
        Assert.assertEquals(4, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testEasyCaseWithOnlyOneModel__14).hashCode())));
        Assert.assertEquals("", ((org.sat4j.core.VecInt)o_testEasyCaseWithOnlyOneModel__16).toString());
        Assert.assertTrue(((org.sat4j.core.VecInt)o_testEasyCaseWithOnlyOneModel__16).isEmpty());
        Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testEasyCaseWithOnlyOneModel__20).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testEasyCaseWithOnlyOneModel__20).getActivity())), 0.1);
        int[] array_194402919 = new int[]{3, 7};
        	int[] array_2024550689 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testEasyCaseWithOnlyOneModel__20).getLits();
        	for(int ii = 0; ii <array_194402919.length; ii++) {
        		org.junit.Assert.assertEquals(array_194402919[ii], array_2024550689[ii]);
        	};
        Assert.assertEquals("-1[F] -3[?]", ((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testEasyCaseWithOnlyOneModel__20).toString());
        Assert.assertEquals(5, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testEasyCaseWithOnlyOneModel__20).hashCode())));
        Assert.assertEquals("", ((org.sat4j.core.VecInt)o_testEasyCaseWithOnlyOneModel__22).toString());
        Assert.assertTrue(((org.sat4j.core.VecInt)o_testEasyCaseWithOnlyOneModel__22).isEmpty());
        Assert.assertTrue(((org.sat4j.minisat.constraints.cnf.UnitClause)o_testEasyCaseWithOnlyOneModel__23).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.UnitClause)o_testEasyCaseWithOnlyOneModel__23).getActivity())), 0.1);
        Assert.assertEquals("1", ((org.sat4j.minisat.constraints.cnf.UnitClause)o_testEasyCaseWithOnlyOneModel__23).toString());
        Assert.assertTrue(o_testEasyCaseWithOnlyOneModel__28);
        Assert.assertTrue(o_testEasyCaseWithOnlyOneModel__29);
    }

    @Test(timeout = 10000, expected = IllegalArgumentException.class)
    public void testCaseWithUnsatProblem() throws Exception, ContradictionException, TimeoutException {
        ISolver solver = SolverFactory.newDefault();
        IVecInt clause = new VecInt();
        IVecInt o_testCaseWithUnsatProblem__5 = clause.push(1).push(2);
        Assert.assertEquals("1,2", ((org.sat4j.core.VecInt)o_testCaseWithUnsatProblem__5).toString());
        Assert.assertEquals(1, ((int) (((org.sat4j.core.VecInt)o_testCaseWithUnsatProblem__5).hashCode())));
        Assert.assertFalse(((org.sat4j.core.VecInt)o_testCaseWithUnsatProblem__5).isEmpty());
        IConstr o_testCaseWithUnsatProblem__7 = solver.addClause(clause);
        Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testCaseWithUnsatProblem__7).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testCaseWithUnsatProblem__7).getActivity())), 0.1);
        int[] array_133895881 = new int[]{2, 4};
        	int[] array_704882353 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testCaseWithUnsatProblem__7).getLits();
        	for(int ii = 0; ii <array_133895881.length; ii++) {
        		org.junit.Assert.assertEquals(array_133895881[ii], array_704882353[ii]);
        	};
        Assert.assertEquals("1[?] 2[?]", ((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testCaseWithUnsatProblem__7).toString());
        Assert.assertEquals(3, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testCaseWithUnsatProblem__7).hashCode())));
        clause.clear();
        IVecInt o_testCaseWithUnsatProblem__9 = clause.push((-1)).push(2);
        Assert.assertEquals("-1,2", ((org.sat4j.core.VecInt)o_testCaseWithUnsatProblem__9).toString());
        Assert.assertEquals(0, ((int) (((org.sat4j.core.VecInt)o_testCaseWithUnsatProblem__9).hashCode())));
        Assert.assertFalse(((org.sat4j.core.VecInt)o_testCaseWithUnsatProblem__9).isEmpty());
        IConstr o_testCaseWithUnsatProblem__12 = solver.addClause(clause);
        Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testCaseWithUnsatProblem__12).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testCaseWithUnsatProblem__12).getActivity())), 0.1);
        int[] array_2094448682 = new int[]{3, 4};
        	int[] array_476261279 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testCaseWithUnsatProblem__12).getLits();
        	for(int ii = 0; ii <array_2094448682.length; ii++) {
        		org.junit.Assert.assertEquals(array_2094448682[ii], array_476261279[ii]);
        	};
        Assert.assertEquals("-1[?] 2[?]", ((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testCaseWithUnsatProblem__12).toString());
        Assert.assertEquals(3, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testCaseWithUnsatProblem__12).hashCode())));
        clause.clear();
        IVecInt o_testCaseWithUnsatProblem__14 = clause.push(1).push((-2));
        Assert.assertEquals("1,-2", ((org.sat4j.core.VecInt)o_testCaseWithUnsatProblem__14).toString());
        Assert.assertEquals(0, ((int) (((org.sat4j.core.VecInt)o_testCaseWithUnsatProblem__14).hashCode())));
        Assert.assertFalse(((org.sat4j.core.VecInt)o_testCaseWithUnsatProblem__14).isEmpty());
        IConstr o_testCaseWithUnsatProblem__17 = solver.addClause(clause);
        Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testCaseWithUnsatProblem__17).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testCaseWithUnsatProblem__17).getActivity())), 0.1);
        int[] array_1099665245 = new int[]{2, 5};
        	int[] array_1020946551 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testCaseWithUnsatProblem__17).getLits();
        	for(int ii = 0; ii <array_1099665245.length; ii++) {
        		org.junit.Assert.assertEquals(array_1099665245[ii], array_1020946551[ii]);
        	};
        Assert.assertEquals("1[?] -2[?]", ((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testCaseWithUnsatProblem__17).toString());
        Assert.assertEquals(3, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testCaseWithUnsatProblem__17).hashCode())));
        clause.clear();
        IVecInt o_testCaseWithUnsatProblem__19 = clause.push((-1)).push((-2));
        Assert.assertEquals("-1,-2", ((org.sat4j.core.VecInt)o_testCaseWithUnsatProblem__19).toString());
        Assert.assertEquals(-1, ((int) (((org.sat4j.core.VecInt)o_testCaseWithUnsatProblem__19).hashCode())));
        Assert.assertFalse(((org.sat4j.core.VecInt)o_testCaseWithUnsatProblem__19).isEmpty());
        IConstr o_testCaseWithUnsatProblem__23 = solver.addClause(clause);
        Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testCaseWithUnsatProblem__23).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testCaseWithUnsatProblem__23).getActivity())), 0.1);
        int[] array_1495089740 = new int[]{3, 5};
        	int[] array_1221105098 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testCaseWithUnsatProblem__23).getLits();
        	for(int ii = 0; ii <array_1495089740.length; ii++) {
        		org.junit.Assert.assertEquals(array_1495089740[ii], array_1221105098[ii]);
        	};
        Assert.assertEquals("-1[?] -2[?]", ((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testCaseWithUnsatProblem__23).toString());
        Assert.assertEquals(4, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testCaseWithUnsatProblem__23).hashCode())));
        clause.clear();
        IVecInt backbone = Backbone.instance().compute(solver);
    }
}

