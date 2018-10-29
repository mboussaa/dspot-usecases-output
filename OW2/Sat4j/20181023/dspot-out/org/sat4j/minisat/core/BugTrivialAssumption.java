package org.sat4j.minisat.core;


import org.junit.Assert;
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


public class BugTrivialAssumption {
    @Test(timeout = 10000)
    public void testUnitClauseInFormulaUnsat() throws Exception, ContradictionException, TimeoutException {
        final ISolver solver = SolverFactory.newDefault();
        int o_testUnitClauseInFormulaUnsat__3 = solver.newVar(1);
        Assert.assertEquals(1, ((int) (o_testUnitClauseInFormulaUnsat__3)));
        IConstr o_testUnitClauseInFormulaUnsat__4 = solver.addClause(new VecInt(new int[]{ 1 }));
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_testUnitClauseInFormulaUnsat__4)).getActivity())), 0.1);
        Assert.assertTrue(((UnitClause) (o_testUnitClauseInFormulaUnsat__4)).isSatisfied());
        Assert.assertEquals("1", ((UnitClause) (o_testUnitClauseInFormulaUnsat__4)).toString());
        boolean o_testUnitClauseInFormulaUnsat__6 = solver.isSatisfiable(new VecInt(new int[]{ -1 }));
        Assert.assertFalse(o_testUnitClauseInFormulaUnsat__6);
        IVecInt explanation = solver.unsatExplanation();
        boolean o_testUnitClauseInFormulaUnsat__11 = explanation.contains((-1));
        Assert.assertTrue(o_testUnitClauseInFormulaUnsat__11);
        int o_testUnitClauseInFormulaUnsat__13 = explanation.size();
        Assert.assertEquals(1, ((int) (o_testUnitClauseInFormulaUnsat__13)));
        Assert.assertEquals(1, ((int) (o_testUnitClauseInFormulaUnsat__3)));
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_testUnitClauseInFormulaUnsat__4)).getActivity())), 0.1);
        Assert.assertTrue(((UnitClause) (o_testUnitClauseInFormulaUnsat__4)).isSatisfied());
        Assert.assertEquals("1", ((UnitClause) (o_testUnitClauseInFormulaUnsat__4)).toString());
        Assert.assertFalse(o_testUnitClauseInFormulaUnsat__6);
        Assert.assertTrue(o_testUnitClauseInFormulaUnsat__11);
    }

    @Test(timeout = 10000)
    public void testBinaryClauseInFormula() throws Exception, ContradictionException, TimeoutException {
        final ISolver solver = SolverFactory.newDefault();
        IConstr o_testBinaryClauseInFormula__3 = solver.addClause(new VecInt(new int[]{ 1, 2 }));
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testBinaryClauseInFormula__3)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalBinaryClause) (o_testBinaryClauseInFormula__3)).isSatisfied());
        int[] array_6673440 = new int[]{2,4};
        	int[] array_1048528542 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testBinaryClauseInFormula__3).getLits();
        	for(int ii = 0; ii <array_6673440.length; ii++) {
        		org.junit.Assert.assertEquals(array_6673440[ii], array_1048528542[ii]);
        	};
        Assert.assertEquals("1[?] 2[?]", ((OriginalBinaryClause) (o_testBinaryClauseInFormula__3)).toString());
        Assert.assertEquals(3, ((int) (((OriginalBinaryClause) (o_testBinaryClauseInFormula__3)).hashCode())));
        boolean o_testBinaryClauseInFormula__5 = solver.isSatisfiable(new VecInt(new int[]{ -1, -2 }));
        Assert.assertFalse(o_testBinaryClauseInFormula__5);
        IVecInt explanation = solver.unsatExplanation();
        boolean o_testBinaryClauseInFormula__11 = explanation.contains((-1));
        Assert.assertTrue(o_testBinaryClauseInFormula__11);
        boolean o_testBinaryClauseInFormula__13 = explanation.contains((-2));
        Assert.assertTrue(o_testBinaryClauseInFormula__13);
        int o_testBinaryClauseInFormula__15 = explanation.size();
        Assert.assertEquals(2, ((int) (o_testBinaryClauseInFormula__15)));
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testBinaryClauseInFormula__3)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalBinaryClause) (o_testBinaryClauseInFormula__3)).isSatisfied());
        int[] array_80830477 = new int[]{2,4};
        	int[] array_396831297 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testBinaryClauseInFormula__3).getLits();
        	for(int ii = 0; ii <array_80830477.length; ii++) {
        		org.junit.Assert.assertEquals(array_80830477[ii], array_396831297[ii]);
        	};
        Assert.assertEquals("1[?] 2[?]", ((OriginalBinaryClause) (o_testBinaryClauseInFormula__3)).toString());
        Assert.assertEquals(3, ((int) (((OriginalBinaryClause) (o_testBinaryClauseInFormula__3)).hashCode())));
        Assert.assertFalse(o_testBinaryClauseInFormula__5);
        Assert.assertTrue(o_testBinaryClauseInFormula__11);
        Assert.assertTrue(o_testBinaryClauseInFormula__13);
    }

    @Test(timeout = 10000)
    public void testInconsistencyInAssumption() throws Exception, ContradictionException, TimeoutException {
        final ISolver solver = SolverFactory.newDefault();
        int o_testInconsistencyInAssumption__3 = solver.newVar(3);
        Assert.assertEquals(3, ((int) (o_testInconsistencyInAssumption__3)));
        boolean o_testInconsistencyInAssumption__4 = solver.isSatisfiable(new VecInt(new int[]{ -1, 2, 3, 1 }));
        Assert.assertFalse(o_testInconsistencyInAssumption__4);
        IVecInt explanation = solver.unsatExplanation();
        boolean o_testInconsistencyInAssumption__9 = explanation.contains((-1));
        Assert.assertTrue(o_testInconsistencyInAssumption__9);
        boolean o_testInconsistencyInAssumption__11 = explanation.contains(1);
        Assert.assertTrue(o_testInconsistencyInAssumption__11);
        int o_testInconsistencyInAssumption__12 = explanation.size();
        Assert.assertEquals(2, ((int) (o_testInconsistencyInAssumption__12)));
        Assert.assertEquals(3, ((int) (o_testInconsistencyInAssumption__3)));
        Assert.assertFalse(o_testInconsistencyInAssumption__4);
        Assert.assertTrue(o_testInconsistencyInAssumption__9);
        Assert.assertTrue(o_testInconsistencyInAssumption__11);
    }
}

