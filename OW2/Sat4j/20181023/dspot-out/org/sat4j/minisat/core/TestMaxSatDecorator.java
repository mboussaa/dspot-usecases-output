package org.sat4j.minisat.core;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.sat4j.core.VecInt;
import org.sat4j.minisat.SolverFactory;
import org.sat4j.minisat.constraints.cnf.OriginalWLClause;
import org.sat4j.opt.MaxSatDecorator;
import org.sat4j.specs.ContradictionException;
import org.sat4j.specs.IConstr;
import org.sat4j.specs.IVecInt;
import org.sat4j.specs.TimeoutException;
import org.sat4j.tools.OptToSatAdapter;


public class TestMaxSatDecorator {
    private MaxSatDecorator maxsat;

    private OptToSatAdapter optimizer;

    @Before
    public void setUp() {
        maxsat = new MaxSatDecorator(SolverFactory.newDefault());
        optimizer = new OptToSatAdapter(maxsat);
    }

    @Test(timeout = 10000)
    public void test() throws Exception, ContradictionException, TimeoutException {
        int o_test__1 = optimizer.newVar(4);
        Assert.assertEquals(4, ((int) (o_test__1)));
        IVecInt clause = new VecInt();
        IVecInt o_test__4 = clause.push(1).push(2);
        Assert.assertEquals("1,2", ((VecInt) (o_test__4)).toString());
        Assert.assertEquals(1, ((int) (((VecInt) (o_test__4)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test__4)).isEmpty());
        IConstr o_test__6 = optimizer.addClause(clause);
        int[] array_1802617092 = new int[]{2,4,10};
        	int[] array_634465093 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_test__6).getLits();
        	for(int ii = 0; ii <array_1802617092.length; ii++) {
        		org.junit.Assert.assertEquals(array_1802617092[ii], array_634465093[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_test__6)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalWLClause) (o_test__6)).isSatisfied());
        Assert.assertEquals("1[?] 2[?] 5[?] ", ((OriginalWLClause) (o_test__6)).toString());
        Assert.assertEquals(5, ((int) (((OriginalWLClause) (o_test__6)).hashCode())));
        clause.clear();
        IVecInt o_test__8 = clause.push((-1)).push(2);
        Assert.assertEquals("-1,2", ((VecInt) (o_test__8)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_test__8)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test__8)).isEmpty());
        IConstr o_test__11 = optimizer.addClause(clause);
        int[] array_1308935963 = new int[]{3,4,12};
        	int[] array_227930919 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_test__11).getLits();
        	for(int ii = 0; ii <array_1308935963.length; ii++) {
        		org.junit.Assert.assertEquals(array_1308935963[ii], array_227930919[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_test__11)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalWLClause) (o_test__11)).isSatisfied());
        Assert.assertEquals("-1[?] 2[?] 6[?] ", ((OriginalWLClause) (o_test__11)).toString());
        Assert.assertEquals(6, ((int) (((OriginalWLClause) (o_test__11)).hashCode())));
        clause.clear();
        IVecInt o_test__13 = clause.push(1).push((-2));
        Assert.assertEquals("1,-2", ((VecInt) (o_test__13)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_test__13)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test__13)).isEmpty());
        IConstr o_test__16 = optimizer.addClause(clause);
        int[] array_1749214480 = new int[]{2,5,14};
        	int[] array_443814113 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_test__16).getLits();
        	for(int ii = 0; ii <array_1749214480.length; ii++) {
        		org.junit.Assert.assertEquals(array_1749214480[ii], array_443814113[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_test__16)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalWLClause) (o_test__16)).isSatisfied());
        Assert.assertEquals("1[?] -2[?] 7[?] ", ((OriginalWLClause) (o_test__16)).toString());
        Assert.assertEquals(7, ((int) (((OriginalWLClause) (o_test__16)).hashCode())));
        clause.clear();
        IVecInt o_test__18 = clause.push((-1)).push((-2));
        Assert.assertEquals("-1,-2", ((VecInt) (o_test__18)).toString());
        Assert.assertEquals(-1, ((int) (((VecInt) (o_test__18)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test__18)).isEmpty());
        IConstr o_test__22 = optimizer.addClause(clause);
        int[] array_727859487 = new int[]{3,5,16};
        	int[] array_1350746207 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_test__22).getLits();
        	for(int ii = 0; ii <array_727859487.length; ii++) {
        		org.junit.Assert.assertEquals(array_727859487[ii], array_1350746207[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_test__22)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalWLClause) (o_test__22)).isSatisfied());
        Assert.assertEquals("-1[?] -2[?] 8[?] ", ((OriginalWLClause) (o_test__22)).toString());
        Assert.assertEquals(8, ((int) (((OriginalWLClause) (o_test__22)).hashCode())));
        clause.clear();
        IVecInt o_test__24 = clause.push(3).push(4);
        Assert.assertEquals("3,4", ((VecInt) (o_test__24)).toString());
        Assert.assertEquals(3, ((int) (((VecInt) (o_test__24)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test__24)).isEmpty());
        IConstr o_test__26 = optimizer.addClause(clause);
        int[] array_1507256666 = new int[]{6,8,18};
        	int[] array_1390764368 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_test__26).getLits();
        	for(int ii = 0; ii <array_1507256666.length; ii++) {
        		org.junit.Assert.assertEquals(array_1507256666[ii], array_1390764368[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_test__26)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalWLClause) (o_test__26)).isSatisfied());
        Assert.assertEquals("3[?] 4[?] 9[?] ", ((OriginalWLClause) (o_test__26)).toString());
        Assert.assertEquals(10, ((int) (((OriginalWLClause) (o_test__26)).hashCode())));
        clause.clear();
        IVecInt o_test__28 = clause.push((-3)).push(4);
        Assert.assertEquals("-3,4", ((VecInt) (o_test__28)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_test__28)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test__28)).isEmpty());
        IConstr o_test__31 = optimizer.addClause(clause);
        int[] array_82454969 = new int[]{7,8,20};
        	int[] array_1089801689 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_test__31).getLits();
        	for(int ii = 0; ii <array_82454969.length; ii++) {
        		org.junit.Assert.assertEquals(array_82454969[ii], array_1089801689[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_test__31)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalWLClause) (o_test__31)).isSatisfied());
        Assert.assertEquals("-3[?] 4[?] 10[?] ", ((OriginalWLClause) (o_test__31)).toString());
        Assert.assertEquals(11, ((int) (((OriginalWLClause) (o_test__31)).hashCode())));
        clause.clear();
        IVecInt o_test__33 = clause.push(3).push((-4));
        Assert.assertEquals("3,-4", ((VecInt) (o_test__33)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_test__33)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test__33)).isEmpty());
        IConstr o_test__36 = optimizer.addClause(clause);
        int[] array_1494360137 = new int[]{6,9,22};
        	int[] array_861863287 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_test__36).getLits();
        	for(int ii = 0; ii <array_1494360137.length; ii++) {
        		org.junit.Assert.assertEquals(array_1494360137[ii], array_861863287[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_test__36)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalWLClause) (o_test__36)).isSatisfied());
        Assert.assertEquals("3[?] -4[?] 11[?] ", ((OriginalWLClause) (o_test__36)).toString());
        Assert.assertEquals(12, ((int) (((OriginalWLClause) (o_test__36)).hashCode())));
        clause.clear();
        IVecInt o_test__38 = clause.push((-3)).push((-4));
        Assert.assertEquals("-3,-4", ((VecInt) (o_test__38)).toString());
        Assert.assertEquals(-3, ((int) (((VecInt) (o_test__38)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test__38)).isEmpty());
        IConstr o_test__42 = optimizer.addClause(clause);
        int[] array_267407017 = new int[]{7,9,24};
        	int[] array_1015252987 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_test__42).getLits();
        	for(int ii = 0; ii <array_267407017.length; ii++) {
        		org.junit.Assert.assertEquals(array_267407017[ii], array_1015252987[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_test__42)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalWLClause) (o_test__42)).isSatisfied());
        Assert.assertEquals("-3[?] -4[?] 12[?] ", ((OriginalWLClause) (o_test__42)).toString());
        Assert.assertEquals(13, ((int) (((OriginalWLClause) (o_test__42)).hashCode())));
        clause.clear();
        IVecInt o_test__44 = clause.push(1).push(2).push(3).push(4);
        Assert.assertEquals("1,2,3,4", ((VecInt) (o_test__44)).toString());
        Assert.assertEquals(2, ((int) (((VecInt) (o_test__44)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test__44)).isEmpty());
        IConstr o_test__48 = optimizer.addClause(clause);
        int[] array_169188043 = new int[]{2,4,6,8,26};
        	int[] array_1636271262 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_test__48).getLits();
        	for(int ii = 0; ii <array_169188043.length; ii++) {
        		org.junit.Assert.assertEquals(array_169188043[ii], array_1636271262[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_test__48)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalWLClause) (o_test__48)).isSatisfied());
        Assert.assertEquals("1[?] 2[?] 3[?] 4[?] 13[?] ", ((OriginalWLClause) (o_test__48)).toString());
        Assert.assertEquals(9, ((int) (((OriginalWLClause) (o_test__48)).hashCode())));
        clause.clear();
        optimizer.isSatisfiable();
        optimizer.isOptimal();
        this.maxsat.getObjectiveValue();
        Assert.assertEquals(4, ((int) (o_test__1)));
        Assert.assertEquals("", ((VecInt) (o_test__4)).toString());
        Assert.assertTrue(((VecInt) (o_test__4)).isEmpty());
        int[] array_1236722744 = new int[]{2,4,10};
        	int[] array_89108549 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_test__6).getLits();
        	for(int ii = 0; ii <array_1236722744.length; ii++) {
        		org.junit.Assert.assertEquals(array_1236722744[ii], array_89108549[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_test__6)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalWLClause) (o_test__6)).isSatisfied());
        Assert.assertEquals("1[?] 2[?] 5[?] ", ((OriginalWLClause) (o_test__6)).toString());
        Assert.assertEquals(5, ((int) (((OriginalWLClause) (o_test__6)).hashCode())));
        Assert.assertEquals("", ((VecInt) (o_test__8)).toString());
        Assert.assertTrue(((VecInt) (o_test__8)).isEmpty());
        int[] array_884293419 = new int[]{4,12,3};
        	int[] array_839256037 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_test__11).getLits();
        	for(int ii = 0; ii <array_884293419.length; ii++) {
        		org.junit.Assert.assertEquals(array_884293419[ii], array_839256037[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_test__11)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalWLClause) (o_test__11)).isSatisfied());
        Assert.assertEquals("2[?] 6[?] -1[?] ", ((OriginalWLClause) (o_test__11)).toString());
        Assert.assertEquals(6, ((int) (((OriginalWLClause) (o_test__11)).hashCode())));
        Assert.assertEquals("", ((VecInt) (o_test__13)).toString());
        Assert.assertTrue(((VecInt) (o_test__13)).isEmpty());
        int[] array_1835716233 = new int[]{2,5,14};
        	int[] array_1663993594 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_test__16).getLits();
        	for(int ii = 0; ii <array_1835716233.length; ii++) {
        		org.junit.Assert.assertEquals(array_1835716233[ii], array_1663993594[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_test__16)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalWLClause) (o_test__16)).isSatisfied());
        Assert.assertEquals("1[?] -2[?] 7[?] ", ((OriginalWLClause) (o_test__16)).toString());
        Assert.assertEquals(7, ((int) (((OriginalWLClause) (o_test__16)).hashCode())));
        Assert.assertEquals("", ((VecInt) (o_test__18)).toString());
        Assert.assertTrue(((VecInt) (o_test__18)).isEmpty());
        int[] array_1103456365 = new int[]{5,16,3};
        	int[] array_568510461 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_test__22).getLits();
        	for(int ii = 0; ii <array_1103456365.length; ii++) {
        		org.junit.Assert.assertEquals(array_1103456365[ii], array_568510461[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_test__22)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalWLClause) (o_test__22)).isSatisfied());
        Assert.assertEquals("-2[?] 8[?] -1[?] ", ((OriginalWLClause) (o_test__22)).toString());
        Assert.assertEquals(8, ((int) (((OriginalWLClause) (o_test__22)).hashCode())));
        Assert.assertEquals("", ((VecInt) (o_test__24)).toString());
        Assert.assertTrue(((VecInt) (o_test__24)).isEmpty());
        int[] array_819833656 = new int[]{6,8,18};
        	int[] array_867105381 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_test__26).getLits();
        	for(int ii = 0; ii <array_819833656.length; ii++) {
        		org.junit.Assert.assertEquals(array_819833656[ii], array_867105381[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_test__26)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalWLClause) (o_test__26)).isSatisfied());
        Assert.assertEquals("3[?] 4[?] 9[?] ", ((OriginalWLClause) (o_test__26)).toString());
        Assert.assertEquals(10, ((int) (((OriginalWLClause) (o_test__26)).hashCode())));
        Assert.assertEquals("", ((VecInt) (o_test__28)).toString());
        Assert.assertTrue(((VecInt) (o_test__28)).isEmpty());
        int[] array_626588748 = new int[]{20,7,8};
        	int[] array_381537604 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_test__31).getLits();
        	for(int ii = 0; ii <array_626588748.length; ii++) {
        		org.junit.Assert.assertEquals(array_626588748[ii], array_381537604[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_test__31)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalWLClause) (o_test__31)).isSatisfied());
        Assert.assertEquals("10[?] -3[?] 4[?] ", ((OriginalWLClause) (o_test__31)).toString());
        Assert.assertEquals(11, ((int) (((OriginalWLClause) (o_test__31)).hashCode())));
        Assert.assertEquals("", ((VecInt) (o_test__33)).toString());
        Assert.assertTrue(((VecInt) (o_test__33)).isEmpty());
        int[] array_1303786134 = new int[]{6,22,9};
        	int[] array_1882681703 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_test__36).getLits();
        	for(int ii = 0; ii <array_1303786134.length; ii++) {
        		org.junit.Assert.assertEquals(array_1303786134[ii], array_1882681703[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_test__36)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalWLClause) (o_test__36)).isSatisfied());
        Assert.assertEquals("3[?] 11[?] -4[?] ", ((OriginalWLClause) (o_test__36)).toString());
        Assert.assertEquals(12, ((int) (((OriginalWLClause) (o_test__36)).hashCode())));
        Assert.assertEquals("", ((VecInt) (o_test__38)).toString());
        Assert.assertTrue(((VecInt) (o_test__38)).isEmpty());
        int[] array_197191046 = new int[]{24,9,7};
        	int[] array_877581281 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_test__42).getLits();
        	for(int ii = 0; ii <array_197191046.length; ii++) {
        		org.junit.Assert.assertEquals(array_197191046[ii], array_877581281[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_test__42)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalWLClause) (o_test__42)).isSatisfied());
        Assert.assertEquals("12[?] -4[?] -3[?] ", ((OriginalWLClause) (o_test__42)).toString());
        Assert.assertEquals(13, ((int) (((OriginalWLClause) (o_test__42)).hashCode())));
        Assert.assertEquals("", ((VecInt) (o_test__44)).toString());
        Assert.assertTrue(((VecInt) (o_test__44)).isEmpty());
        int[] array_1888385220 = new int[]{2,4,6,8,26};
        	int[] array_929718541 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_test__48).getLits();
        	for(int ii = 0; ii <array_1888385220.length; ii++) {
        		org.junit.Assert.assertEquals(array_1888385220[ii], array_929718541[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_test__48)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalWLClause) (o_test__48)).isSatisfied());
        Assert.assertEquals("1[?] 2[?] 3[?] 4[?] 13[?] ", ((OriginalWLClause) (o_test__48)).toString());
        Assert.assertEquals(9, ((int) (((OriginalWLClause) (o_test__48)).hashCode())));
    }
}

