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


public class TestMaxSatDecoratorAmpl {
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
        int[] array_1150482841 = new int[]{2,4,10};
        	int[] array_1434614297 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_test__6).getLits();
        	for(int ii = 0; ii <array_1150482841.length; ii++) {
        		org.junit.Assert.assertEquals(array_1150482841[ii], array_1434614297[ii]);
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
        int[] array_156591366 = new int[]{3,4,12};
        	int[] array_825130495 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_test__11).getLits();
        	for(int ii = 0; ii <array_156591366.length; ii++) {
        		org.junit.Assert.assertEquals(array_156591366[ii], array_825130495[ii]);
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
        int[] array_960144037 = new int[]{2,5,14};
        	int[] array_619987209 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_test__16).getLits();
        	for(int ii = 0; ii <array_960144037.length; ii++) {
        		org.junit.Assert.assertEquals(array_960144037[ii], array_619987209[ii]);
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
        int[] array_1635508580 = new int[]{3,5,16};
        	int[] array_312752620 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_test__22).getLits();
        	for(int ii = 0; ii <array_1635508580.length; ii++) {
        		org.junit.Assert.assertEquals(array_1635508580[ii], array_312752620[ii]);
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
        int[] array_924246133 = new int[]{6,8,18};
        	int[] array_1280460106 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_test__26).getLits();
        	for(int ii = 0; ii <array_924246133.length; ii++) {
        		org.junit.Assert.assertEquals(array_924246133[ii], array_1280460106[ii]);
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
        int[] array_1780117107 = new int[]{7,8,20};
        	int[] array_1918579922 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_test__31).getLits();
        	for(int ii = 0; ii <array_1780117107.length; ii++) {
        		org.junit.Assert.assertEquals(array_1780117107[ii], array_1918579922[ii]);
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
        int[] array_582027917 = new int[]{6,9,22};
        	int[] array_2113184556 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_test__36).getLits();
        	for(int ii = 0; ii <array_582027917.length; ii++) {
        		org.junit.Assert.assertEquals(array_582027917[ii], array_2113184556[ii]);
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
        int[] array_1848848534 = new int[]{7,9,24};
        	int[] array_1904675524 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_test__42).getLits();
        	for(int ii = 0; ii <array_1848848534.length; ii++) {
        		org.junit.Assert.assertEquals(array_1848848534[ii], array_1904675524[ii]);
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
        int[] array_21383048 = new int[]{2,4,6,8,26};
        	int[] array_2064975260 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_test__48).getLits();
        	for(int ii = 0; ii <array_21383048.length; ii++) {
        		org.junit.Assert.assertEquals(array_21383048[ii], array_2064975260[ii]);
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
        int[] array_19668052 = new int[]{2,10,4};
        	int[] array_564957235 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_test__6).getLits();
        	for(int ii = 0; ii <array_19668052.length; ii++) {
        		org.junit.Assert.assertEquals(array_19668052[ii], array_564957235[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_test__6)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalWLClause) (o_test__6)).isSatisfied());
        Assert.assertEquals("1[?] 5[?] 2[?] ", ((OriginalWLClause) (o_test__6)).toString());
        Assert.assertEquals(5, ((int) (((OriginalWLClause) (o_test__6)).hashCode())));
        Assert.assertEquals("", ((VecInt) (o_test__8)).toString());
        Assert.assertTrue(((VecInt) (o_test__8)).isEmpty());
        int[] array_1348236471 = new int[]{4,12,3};
        	int[] array_2145706595 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_test__11).getLits();
        	for(int ii = 0; ii <array_1348236471.length; ii++) {
        		org.junit.Assert.assertEquals(array_1348236471[ii], array_2145706595[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_test__11)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalWLClause) (o_test__11)).isSatisfied());
        Assert.assertEquals("2[?] 6[?] -1[?] ", ((OriginalWLClause) (o_test__11)).toString());
        Assert.assertEquals(6, ((int) (((OriginalWLClause) (o_test__11)).hashCode())));
        Assert.assertEquals("", ((VecInt) (o_test__13)).toString());
        Assert.assertTrue(((VecInt) (o_test__13)).isEmpty());
        int[] array_1231906488 = new int[]{2,5,14};
        	int[] array_344656050 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_test__16).getLits();
        	for(int ii = 0; ii <array_1231906488.length; ii++) {
        		org.junit.Assert.assertEquals(array_1231906488[ii], array_344656050[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_test__16)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalWLClause) (o_test__16)).isSatisfied());
        Assert.assertEquals("1[?] -2[?] 7[?] ", ((OriginalWLClause) (o_test__16)).toString());
        Assert.assertEquals(7, ((int) (((OriginalWLClause) (o_test__16)).hashCode())));
        Assert.assertEquals("", ((VecInt) (o_test__18)).toString());
        Assert.assertTrue(((VecInt) (o_test__18)).isEmpty());
        int[] array_986475328 = new int[]{5,16,3};
        	int[] array_323897869 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_test__22).getLits();
        	for(int ii = 0; ii <array_986475328.length; ii++) {
        		org.junit.Assert.assertEquals(array_986475328[ii], array_323897869[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_test__22)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalWLClause) (o_test__22)).isSatisfied());
        Assert.assertEquals("-2[?] 8[?] -1[?] ", ((OriginalWLClause) (o_test__22)).toString());
        Assert.assertEquals(8, ((int) (((OriginalWLClause) (o_test__22)).hashCode())));
        Assert.assertEquals("", ((VecInt) (o_test__24)).toString());
        Assert.assertTrue(((VecInt) (o_test__24)).isEmpty());
        int[] array_1112195874 = new int[]{6,18,8};
        	int[] array_938903036 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_test__26).getLits();
        	for(int ii = 0; ii <array_1112195874.length; ii++) {
        		org.junit.Assert.assertEquals(array_1112195874[ii], array_938903036[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_test__26)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalWLClause) (o_test__26)).isSatisfied());
        Assert.assertEquals("3[?] 9[?] 4[?] ", ((OriginalWLClause) (o_test__26)).toString());
        Assert.assertEquals(10, ((int) (((OriginalWLClause) (o_test__26)).hashCode())));
        Assert.assertEquals("", ((VecInt) (o_test__28)).toString());
        Assert.assertTrue(((VecInt) (o_test__28)).isEmpty());
        int[] array_630434226 = new int[]{20,7,8};
        	int[] array_510123478 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_test__31).getLits();
        	for(int ii = 0; ii <array_630434226.length; ii++) {
        		org.junit.Assert.assertEquals(array_630434226[ii], array_510123478[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_test__31)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalWLClause) (o_test__31)).isSatisfied());
        Assert.assertEquals("10[?] -3[?] 4[?] ", ((OriginalWLClause) (o_test__31)).toString());
        Assert.assertEquals(11, ((int) (((OriginalWLClause) (o_test__31)).hashCode())));
        Assert.assertEquals("", ((VecInt) (o_test__33)).toString());
        Assert.assertTrue(((VecInt) (o_test__33)).isEmpty());
        int[] array_2086707665 = new int[]{22,9,6};
        	int[] array_1278592644 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_test__36).getLits();
        	for(int ii = 0; ii <array_2086707665.length; ii++) {
        		org.junit.Assert.assertEquals(array_2086707665[ii], array_1278592644[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_test__36)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalWLClause) (o_test__36)).isSatisfied());
        Assert.assertEquals("11[?] -4[?] 3[?] ", ((OriginalWLClause) (o_test__36)).toString());
        Assert.assertEquals(12, ((int) (((OriginalWLClause) (o_test__36)).hashCode())));
        Assert.assertEquals("", ((VecInt) (o_test__38)).toString());
        Assert.assertTrue(((VecInt) (o_test__38)).isEmpty());
        int[] array_497080696 = new int[]{24,9,7};
        	int[] array_40865201 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_test__42).getLits();
        	for(int ii = 0; ii <array_497080696.length; ii++) {
        		org.junit.Assert.assertEquals(array_497080696[ii], array_40865201[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_test__42)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalWLClause) (o_test__42)).isSatisfied());
        Assert.assertEquals("12[?] -4[?] -3[?] ", ((OriginalWLClause) (o_test__42)).toString());
        Assert.assertEquals(13, ((int) (((OriginalWLClause) (o_test__42)).hashCode())));
        Assert.assertEquals("", ((VecInt) (o_test__44)).toString());
        Assert.assertTrue(((VecInt) (o_test__44)).isEmpty());
        int[] array_1226901677 = new int[]{4,26,6,8,2};
        	int[] array_433345085 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_test__48).getLits();
        	for(int ii = 0; ii <array_1226901677.length; ii++) {
        		org.junit.Assert.assertEquals(array_1226901677[ii], array_433345085[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_test__48)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalWLClause) (o_test__48)).isSatisfied());
        Assert.assertEquals("2[?] 13[?] 3[?] 4[?] 1[?] ", ((OriginalWLClause) (o_test__48)).toString());
        Assert.assertEquals(9, ((int) (((OriginalWLClause) (o_test__48)).hashCode())));
    }
}

