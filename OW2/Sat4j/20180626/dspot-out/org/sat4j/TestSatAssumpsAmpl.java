package org.sat4j;


import org.junit.Assert;
import org.junit.Test;
import org.sat4j.core.VecInt;
import org.sat4j.specs.ContradictionException;
import org.sat4j.specs.IConstr;
import org.sat4j.specs.IVecInt;


public class TestSatAssumpsAmpl {
    @Test(timeout = 10000)
    public void testIncrementalFeed() throws Exception, ContradictionException {
        int o_testIncrementalFeed__1 = this.solver.nextFreeVarId(false);
        Assert.assertEquals(1, ((int) (o_testIncrementalFeed__1)));
        IVecInt clause = new VecInt();
        Assert.assertEquals("", ((org.sat4j.core.VecInt)clause).toString());
        Assert.assertTrue(((org.sat4j.core.VecInt)clause).isEmpty());
        IVecInt o_testIncrementalFeed__4 = clause.push(3).push((-5));
        Assert.assertEquals("3,-5", ((org.sat4j.core.VecInt)o_testIncrementalFeed__4).toString());
        Assert.assertEquals(-1, ((int) (((org.sat4j.core.VecInt)o_testIncrementalFeed__4).hashCode())));
        Assert.assertFalse(((org.sat4j.core.VecInt)o_testIncrementalFeed__4).isEmpty());
        IConstr o_testIncrementalFeed__7 = this.solver.addClause(clause);
        int[] array_1649747311 = new int[]{6, 11};
        	int[] array_1761002551 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testIncrementalFeed__7).getLits();
        	for(int ii = 0; ii <array_1649747311.length; ii++) {
        		org.junit.Assert.assertEquals(array_1649747311[ii], array_1761002551[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testIncrementalFeed__7).getActivity())), 0.1);
        Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testIncrementalFeed__7).isSatisfied());
        Assert.assertEquals("3[?] -5[?]", ((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testIncrementalFeed__7).toString());
        Assert.assertEquals(8, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testIncrementalFeed__7).hashCode())));
        int o_testIncrementalFeed__8 = this.solver.nextFreeVarId(false);
        Assert.assertEquals(6, ((int) (o_testIncrementalFeed__8)));
        clause.clear();
        IVecInt o_testIncrementalFeed__10 = clause.push(1).push((-2));
        Assert.assertEquals("1,-2", ((org.sat4j.core.VecInt)o_testIncrementalFeed__10).toString());
        Assert.assertEquals(0, ((int) (((org.sat4j.core.VecInt)o_testIncrementalFeed__10).hashCode())));
        Assert.assertFalse(((org.sat4j.core.VecInt)o_testIncrementalFeed__10).isEmpty());
        IConstr o_testIncrementalFeed__13 = this.solver.addClause(clause);
        int[] array_381992009 = new int[]{2, 5};
        	int[] array_1276769733 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testIncrementalFeed__13).getLits();
        	for(int ii = 0; ii <array_381992009.length; ii++) {
        		org.junit.Assert.assertEquals(array_381992009[ii], array_1276769733[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testIncrementalFeed__13).getActivity())), 0.1);
        Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testIncrementalFeed__13).isSatisfied());
        Assert.assertEquals("1[?] -2[?]", ((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testIncrementalFeed__13).toString());
        Assert.assertEquals(3, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testIncrementalFeed__13).hashCode())));
        int o_testIncrementalFeed__14 = this.solver.nextFreeVarId(false);
        Assert.assertEquals(6, ((int) (o_testIncrementalFeed__14)));
        int o_testIncrementalFeed__15 = this.solver.nextFreeVarId(false);
        Assert.assertEquals(6, ((int) (o_testIncrementalFeed__15)));
        clause.clear();
        IVecInt o_testIncrementalFeed__17 = clause.push(1000).push((-31));
        Assert.assertEquals("1000,-31", ((org.sat4j.core.VecInt)o_testIncrementalFeed__17).toString());
        Assert.assertEquals(484, ((int) (((org.sat4j.core.VecInt)o_testIncrementalFeed__17).hashCode())));
        Assert.assertFalse(((org.sat4j.core.VecInt)o_testIncrementalFeed__17).isEmpty());
        IConstr o_testIncrementalFeed__20 = this.solver.addClause(clause);
        int[] array_269206278 = new int[]{63, 2000};
        	int[] array_845287145 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testIncrementalFeed__20).getLits();
        	for(int ii = 0; ii <array_269206278.length; ii++) {
        		org.junit.Assert.assertEquals(array_269206278[ii], array_845287145[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testIncrementalFeed__20).getActivity())), 0.1);
        Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testIncrementalFeed__20).isSatisfied());
        Assert.assertEquals("-31[?] 1000[?]", ((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testIncrementalFeed__20).toString());
        Assert.assertEquals(1031, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testIncrementalFeed__20).hashCode())));
        int o_testIncrementalFeed__21 = this.solver.nextFreeVarId(false);
        Assert.assertEquals(1001, ((int) (o_testIncrementalFeed__21)));
        Assert.assertEquals(1, ((int) (o_testIncrementalFeed__1)));
        Assert.assertEquals("1000,-31", ((org.sat4j.core.VecInt)clause).toString());
        Assert.assertEquals(484, ((int) (((org.sat4j.core.VecInt)clause).hashCode())));
        Assert.assertFalse(((org.sat4j.core.VecInt)clause).isEmpty());
        Assert.assertEquals("1000,-31", ((org.sat4j.core.VecInt)o_testIncrementalFeed__4).toString());
        Assert.assertEquals(484, ((int) (((org.sat4j.core.VecInt)o_testIncrementalFeed__4).hashCode())));
        Assert.assertFalse(((org.sat4j.core.VecInt)o_testIncrementalFeed__4).isEmpty());
        int[] array_137427397 = new int[]{6, 11};
        	int[] array_1573863871 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testIncrementalFeed__7).getLits();
        	for(int ii = 0; ii <array_137427397.length; ii++) {
        		org.junit.Assert.assertEquals(array_137427397[ii], array_1573863871[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testIncrementalFeed__7).getActivity())), 0.1);
        Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testIncrementalFeed__7).isSatisfied());
        Assert.assertEquals("3[?] -5[?]", ((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testIncrementalFeed__7).toString());
        Assert.assertEquals(8, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testIncrementalFeed__7).hashCode())));
        Assert.assertEquals(6, ((int) (o_testIncrementalFeed__8)));
        Assert.assertEquals("1000,-31", ((org.sat4j.core.VecInt)o_testIncrementalFeed__10).toString());
        Assert.assertEquals(484, ((int) (((org.sat4j.core.VecInt)o_testIncrementalFeed__10).hashCode())));
        Assert.assertFalse(((org.sat4j.core.VecInt)o_testIncrementalFeed__10).isEmpty());
        int[] array_1904329269 = new int[]{2, 5};
        	int[] array_806590541 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testIncrementalFeed__13).getLits();
        	for(int ii = 0; ii <array_1904329269.length; ii++) {
        		org.junit.Assert.assertEquals(array_1904329269[ii], array_806590541[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testIncrementalFeed__13).getActivity())), 0.1);
        Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testIncrementalFeed__13).isSatisfied());
        Assert.assertEquals("1[?] -2[?]", ((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testIncrementalFeed__13).toString());
        Assert.assertEquals(3, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testIncrementalFeed__13).hashCode())));
        Assert.assertEquals(6, ((int) (o_testIncrementalFeed__14)));
        Assert.assertEquals(6, ((int) (o_testIncrementalFeed__15)));
        Assert.assertEquals("1000,-31", ((org.sat4j.core.VecInt)o_testIncrementalFeed__17).toString());
        Assert.assertEquals(484, ((int) (((org.sat4j.core.VecInt)o_testIncrementalFeed__17).hashCode())));
        Assert.assertFalse(((org.sat4j.core.VecInt)o_testIncrementalFeed__17).isEmpty());
        int[] array_657556134 = new int[]{63, 2000};
        	int[] array_1280677651 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testIncrementalFeed__20).getLits();
        	for(int ii = 0; ii <array_657556134.length; ii++) {
        		org.junit.Assert.assertEquals(array_657556134[ii], array_1280677651[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testIncrementalFeed__20).getActivity())), 0.1);
        Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testIncrementalFeed__20).isSatisfied());
        Assert.assertEquals("-31[?] 1000[?]", ((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testIncrementalFeed__20).toString());
        Assert.assertEquals(1031, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testIncrementalFeed__20).hashCode())));
    }
}

