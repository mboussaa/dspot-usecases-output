package org.sat4j;


import org.junit.Assert;
import org.junit.Test;
import org.sat4j.core.VecInt;
import org.sat4j.minisat.constraints.cnf.OriginalBinaryClause;
import org.sat4j.specs.ContradictionException;
import org.sat4j.specs.IConstr;
import org.sat4j.specs.IVecInt;


public class TestSatAssumps {
    @Test(timeout = 10000)
    public void testIncrementalFeed() throws Exception, ContradictionException {
        int o_testIncrementalFeed__1 = this.solver.nextFreeVarId(false);
        Assert.assertEquals(1, ((int) (o_testIncrementalFeed__1)));
        IVecInt clause = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause)).toString());
        Assert.assertTrue(((VecInt) (clause)).isEmpty());
        IVecInt o_testIncrementalFeed__4 = clause.push(3).push((-5));
        Assert.assertEquals("3,-5", ((VecInt) (o_testIncrementalFeed__4)).toString());
        Assert.assertEquals(-1, ((int) (((VecInt) (o_testIncrementalFeed__4)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testIncrementalFeed__4)).isEmpty());
        IConstr o_testIncrementalFeed__7 = this.solver.addClause(clause);
        int[] array_337731290 = new int[]{6,11};
        	int[] array_1983218481 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testIncrementalFeed__7).getLits();
        	for(int ii = 0; ii <array_337731290.length; ii++) {
        		org.junit.Assert.assertEquals(array_337731290[ii], array_1983218481[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_testIncrementalFeed__7)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testIncrementalFeed__7)).getActivity())), 0.1);
        Assert.assertEquals("3[?] -5[?]", ((OriginalBinaryClause) (o_testIncrementalFeed__7)).toString());
        Assert.assertEquals(8, ((int) (((OriginalBinaryClause) (o_testIncrementalFeed__7)).hashCode())));
        int o_testIncrementalFeed__8 = this.solver.nextFreeVarId(false);
        Assert.assertEquals(6, ((int) (o_testIncrementalFeed__8)));
        clause.clear();
        IVecInt o_testIncrementalFeed__10 = clause.push(1).push((-2));
        Assert.assertEquals("1,-2", ((VecInt) (o_testIncrementalFeed__10)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_testIncrementalFeed__10)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testIncrementalFeed__10)).isEmpty());
        IConstr o_testIncrementalFeed__13 = this.solver.addClause(clause);
        int[] array_1020758105 = new int[]{2,5};
        	int[] array_292790849 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testIncrementalFeed__13).getLits();
        	for(int ii = 0; ii <array_1020758105.length; ii++) {
        		org.junit.Assert.assertEquals(array_1020758105[ii], array_292790849[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_testIncrementalFeed__13)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testIncrementalFeed__13)).getActivity())), 0.1);
        Assert.assertEquals("1[?] -2[?]", ((OriginalBinaryClause) (o_testIncrementalFeed__13)).toString());
        Assert.assertEquals(3, ((int) (((OriginalBinaryClause) (o_testIncrementalFeed__13)).hashCode())));
        int o_testIncrementalFeed__14 = this.solver.nextFreeVarId(false);
        Assert.assertEquals(6, ((int) (o_testIncrementalFeed__14)));
        int o_testIncrementalFeed__15 = this.solver.nextFreeVarId(false);
        Assert.assertEquals(6, ((int) (o_testIncrementalFeed__15)));
        clause.clear();
        IVecInt o_testIncrementalFeed__17 = clause.push(1000).push((-31));
        Assert.assertEquals("1000,-31", ((VecInt) (o_testIncrementalFeed__17)).toString());
        Assert.assertEquals(484, ((int) (((VecInt) (o_testIncrementalFeed__17)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testIncrementalFeed__17)).isEmpty());
        IConstr o_testIncrementalFeed__20 = this.solver.addClause(clause);
        int[] array_1816246477 = new int[]{63,2000};
        	int[] array_987720869 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testIncrementalFeed__20).getLits();
        	for(int ii = 0; ii <array_1816246477.length; ii++) {
        		org.junit.Assert.assertEquals(array_1816246477[ii], array_987720869[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_testIncrementalFeed__20)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testIncrementalFeed__20)).getActivity())), 0.1);
        Assert.assertEquals("-31[?] 1000[?]", ((OriginalBinaryClause) (o_testIncrementalFeed__20)).toString());
        Assert.assertEquals(1031, ((int) (((OriginalBinaryClause) (o_testIncrementalFeed__20)).hashCode())));
        int o_testIncrementalFeed__21 = this.solver.nextFreeVarId(false);
        Assert.assertEquals(1001, ((int) (o_testIncrementalFeed__21)));
        Assert.assertEquals(1, ((int) (o_testIncrementalFeed__1)));
        Assert.assertEquals("1000,-31", ((VecInt) (clause)).toString());
        Assert.assertEquals(484, ((int) (((VecInt) (clause)).hashCode())));
        Assert.assertFalse(((VecInt) (clause)).isEmpty());
        Assert.assertEquals("1000,-31", ((VecInt) (o_testIncrementalFeed__4)).toString());
        Assert.assertEquals(484, ((int) (((VecInt) (o_testIncrementalFeed__4)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testIncrementalFeed__4)).isEmpty());
        int[] array_490514772 = new int[]{6,11};
        	int[] array_432943687 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testIncrementalFeed__7).getLits();
        	for(int ii = 0; ii <array_490514772.length; ii++) {
        		org.junit.Assert.assertEquals(array_490514772[ii], array_432943687[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_testIncrementalFeed__7)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testIncrementalFeed__7)).getActivity())), 0.1);
        Assert.assertEquals("3[?] -5[?]", ((OriginalBinaryClause) (o_testIncrementalFeed__7)).toString());
        Assert.assertEquals(8, ((int) (((OriginalBinaryClause) (o_testIncrementalFeed__7)).hashCode())));
        Assert.assertEquals(6, ((int) (o_testIncrementalFeed__8)));
        Assert.assertEquals("1000,-31", ((VecInt) (o_testIncrementalFeed__10)).toString());
        Assert.assertEquals(484, ((int) (((VecInt) (o_testIncrementalFeed__10)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testIncrementalFeed__10)).isEmpty());
        int[] array_285541076 = new int[]{2,5};
        	int[] array_1417757496 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testIncrementalFeed__13).getLits();
        	for(int ii = 0; ii <array_285541076.length; ii++) {
        		org.junit.Assert.assertEquals(array_285541076[ii], array_1417757496[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_testIncrementalFeed__13)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testIncrementalFeed__13)).getActivity())), 0.1);
        Assert.assertEquals("1[?] -2[?]", ((OriginalBinaryClause) (o_testIncrementalFeed__13)).toString());
        Assert.assertEquals(3, ((int) (((OriginalBinaryClause) (o_testIncrementalFeed__13)).hashCode())));
        Assert.assertEquals(6, ((int) (o_testIncrementalFeed__14)));
        Assert.assertEquals(6, ((int) (o_testIncrementalFeed__15)));
        Assert.assertEquals("1000,-31", ((VecInt) (o_testIncrementalFeed__17)).toString());
        Assert.assertEquals(484, ((int) (((VecInt) (o_testIncrementalFeed__17)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testIncrementalFeed__17)).isEmpty());
        int[] array_891270992 = new int[]{63,2000};
        	int[] array_2018925350 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testIncrementalFeed__20).getLits();
        	for(int ii = 0; ii <array_891270992.length; ii++) {
        		org.junit.Assert.assertEquals(array_891270992[ii], array_2018925350[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_testIncrementalFeed__20)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testIncrementalFeed__20)).getActivity())), 0.1);
        Assert.assertEquals("-31[?] 1000[?]", ((OriginalBinaryClause) (o_testIncrementalFeed__20)).toString());
        Assert.assertEquals(1031, ((int) (((OriginalBinaryClause) (o_testIncrementalFeed__20)).hashCode())));
    }
}

