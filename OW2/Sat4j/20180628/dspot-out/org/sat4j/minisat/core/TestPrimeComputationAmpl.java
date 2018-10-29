package org.sat4j.minisat.core;


import java.util.Arrays;
import java.util.Collection;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.sat4j.core.VecInt;
import org.sat4j.minisat.SolverFactory;
import org.sat4j.minisat.orders.PositiveLiteralSelectionStrategy;
import org.sat4j.specs.ContradictionException;
import org.sat4j.specs.IConstr;
import org.sat4j.specs.IVecInt;
import org.sat4j.specs.TimeoutException;


@RunWith(Parameterized.class)
public class TestPrimeComputationAmpl {
    private Solver<DataStructureFactory> solver;

    private final PrimeImplicantStrategy prime;

    public TestPrimeComputationAmpl(PrimeImplicantStrategy prime) {
        this.prime = prime;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> strategies() {
        return Arrays.asList(new Object[][]{ new Object[]{ new QuadraticPrimeImplicantStrategy() }, new Object[]{ new CounterBasedPrimeImplicantStrategy() }, new Object[]{ new WatcherBasedPrimeImplicantStrategy() } });
    }

    @Before
    public void setUp() {
        this.solver = SolverFactory.newBestWL();
        this.solver.getOrder().setPhaseSelectionStrategy(new PositiveLiteralSelectionStrategy());
    }

    @Test(timeout = 10000)
    public void test() throws Exception, ContradictionException, TimeoutException {
        int o_test__1 = this.optimizer.newVar(4);
        Assert.assertEquals(4, ((int) (o_test__1)));
        IVecInt clause = new VecInt();
        IVecInt o_test__4 = clause.push(1).push(2);
        Assert.assertEquals("1,2", ((org.sat4j.core.VecInt)o_test__4).toString());
        Assert.assertEquals(1, ((int) (((org.sat4j.core.VecInt)o_test__4).hashCode())));
        Assert.assertFalse(((org.sat4j.core.VecInt)o_test__4).isEmpty());
        IConstr o_test__6 = this.optimizer.addClause(clause);
        int[] array_169188043 = new int[]{2, 4, 10};
        	int[] array_1636271262 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_test__6).getLits();
        	for(int ii = 0; ii <array_169188043.length; ii++) {
        		org.junit.Assert.assertEquals(array_169188043[ii], array_1636271262[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_test__6).getActivity())), 0.1);
        Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_test__6).isSatisfied());
        Assert.assertEquals("1[?] 2[?] 5[?] ", ((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_test__6).toString());
        Assert.assertEquals(5, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_test__6).hashCode())));
        clause.clear();
        IVecInt o_test__8 = clause.push((-1)).push(2);
        Assert.assertEquals("-1,2", ((org.sat4j.core.VecInt)o_test__8).toString());
        Assert.assertEquals(0, ((int) (((org.sat4j.core.VecInt)o_test__8).hashCode())));
        Assert.assertFalse(((org.sat4j.core.VecInt)o_test__8).isEmpty());
        IConstr o_test__11 = this.optimizer.addClause(clause);
        int[] array_1236722744 = new int[]{3, 4, 12};
        	int[] array_89108549 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_test__11).getLits();
        	for(int ii = 0; ii <array_1236722744.length; ii++) {
        		org.junit.Assert.assertEquals(array_1236722744[ii], array_89108549[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_test__11).getActivity())), 0.1);
        Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_test__11).isSatisfied());
        Assert.assertEquals("-1[?] 2[?] 6[?] ", ((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_test__11).toString());
        Assert.assertEquals(6, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_test__11).hashCode())));
        clause.clear();
        IVecInt o_test__13 = clause.push(1).push((-2));
        Assert.assertEquals("1,-2", ((org.sat4j.core.VecInt)o_test__13).toString());
        Assert.assertEquals(0, ((int) (((org.sat4j.core.VecInt)o_test__13).hashCode())));
        Assert.assertFalse(((org.sat4j.core.VecInt)o_test__13).isEmpty());
        IConstr o_test__16 = this.optimizer.addClause(clause);
        int[] array_884293419 = new int[]{2, 5, 14};
        	int[] array_839256037 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_test__16).getLits();
        	for(int ii = 0; ii <array_884293419.length; ii++) {
        		org.junit.Assert.assertEquals(array_884293419[ii], array_839256037[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_test__16).getActivity())), 0.1);
        Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_test__16).isSatisfied());
        Assert.assertEquals("1[?] -2[?] 7[?] ", ((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_test__16).toString());
        Assert.assertEquals(7, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_test__16).hashCode())));
        clause.clear();
        IVecInt o_test__18 = clause.push((-1)).push((-2));
        Assert.assertEquals("-1,-2", ((org.sat4j.core.VecInt)o_test__18).toString());
        Assert.assertEquals(-1, ((int) (((org.sat4j.core.VecInt)o_test__18).hashCode())));
        Assert.assertFalse(((org.sat4j.core.VecInt)o_test__18).isEmpty());
        IConstr o_test__22 = this.optimizer.addClause(clause);
        int[] array_1835716233 = new int[]{3, 5, 16};
        	int[] array_1663993594 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_test__22).getLits();
        	for(int ii = 0; ii <array_1835716233.length; ii++) {
        		org.junit.Assert.assertEquals(array_1835716233[ii], array_1663993594[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_test__22).getActivity())), 0.1);
        Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_test__22).isSatisfied());
        Assert.assertEquals("-1[?] -2[?] 8[?] ", ((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_test__22).toString());
        Assert.assertEquals(8, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_test__22).hashCode())));
        clause.clear();
        IVecInt o_test__24 = clause.push(3).push(4);
        Assert.assertEquals("3,4", ((org.sat4j.core.VecInt)o_test__24).toString());
        Assert.assertEquals(3, ((int) (((org.sat4j.core.VecInt)o_test__24).hashCode())));
        Assert.assertFalse(((org.sat4j.core.VecInt)o_test__24).isEmpty());
        IConstr o_test__26 = this.optimizer.addClause(clause);
        int[] array_1103456365 = new int[]{6, 8, 18};
        	int[] array_568510461 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_test__26).getLits();
        	for(int ii = 0; ii <array_1103456365.length; ii++) {
        		org.junit.Assert.assertEquals(array_1103456365[ii], array_568510461[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_test__26).getActivity())), 0.1);
        Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_test__26).isSatisfied());
        Assert.assertEquals("3[?] 4[?] 9[?] ", ((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_test__26).toString());
        Assert.assertEquals(10, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_test__26).hashCode())));
        clause.clear();
        IVecInt o_test__28 = clause.push((-3)).push(4);
        Assert.assertEquals("-3,4", ((org.sat4j.core.VecInt)o_test__28).toString());
        Assert.assertEquals(0, ((int) (((org.sat4j.core.VecInt)o_test__28).hashCode())));
        Assert.assertFalse(((org.sat4j.core.VecInt)o_test__28).isEmpty());
        IConstr o_test__31 = this.optimizer.addClause(clause);
        int[] array_819833656 = new int[]{7, 8, 20};
        	int[] array_867105381 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_test__31).getLits();
        	for(int ii = 0; ii <array_819833656.length; ii++) {
        		org.junit.Assert.assertEquals(array_819833656[ii], array_867105381[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_test__31).getActivity())), 0.1);
        Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_test__31).isSatisfied());
        Assert.assertEquals("-3[?] 4[?] 10[?] ", ((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_test__31).toString());
        Assert.assertEquals(11, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_test__31).hashCode())));
        clause.clear();
        IVecInt o_test__33 = clause.push(3).push((-4));
        Assert.assertEquals("3,-4", ((org.sat4j.core.VecInt)o_test__33).toString());
        Assert.assertEquals(0, ((int) (((org.sat4j.core.VecInt)o_test__33).hashCode())));
        Assert.assertFalse(((org.sat4j.core.VecInt)o_test__33).isEmpty());
        IConstr o_test__36 = this.optimizer.addClause(clause);
        int[] array_626588748 = new int[]{6, 9, 22};
        	int[] array_381537604 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_test__36).getLits();
        	for(int ii = 0; ii <array_626588748.length; ii++) {
        		org.junit.Assert.assertEquals(array_626588748[ii], array_381537604[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_test__36).getActivity())), 0.1);
        Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_test__36).isSatisfied());
        Assert.assertEquals("3[?] -4[?] 11[?] ", ((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_test__36).toString());
        Assert.assertEquals(12, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_test__36).hashCode())));
        clause.clear();
        IVecInt o_test__38 = clause.push((-3)).push((-4));
        Assert.assertEquals("-3,-4", ((org.sat4j.core.VecInt)o_test__38).toString());
        Assert.assertEquals(-3, ((int) (((org.sat4j.core.VecInt)o_test__38).hashCode())));
        Assert.assertFalse(((org.sat4j.core.VecInt)o_test__38).isEmpty());
        IConstr o_test__42 = this.optimizer.addClause(clause);
        int[] array_1303786134 = new int[]{7, 9, 24};
        	int[] array_1882681703 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_test__42).getLits();
        	for(int ii = 0; ii <array_1303786134.length; ii++) {
        		org.junit.Assert.assertEquals(array_1303786134[ii], array_1882681703[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_test__42).getActivity())), 0.1);
        Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_test__42).isSatisfied());
        Assert.assertEquals("-3[?] -4[?] 12[?] ", ((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_test__42).toString());
        Assert.assertEquals(13, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_test__42).hashCode())));
        clause.clear();
        IVecInt o_test__44 = clause.push(1).push(2).push(3).push(4);
        Assert.assertEquals("1,2,3,4", ((org.sat4j.core.VecInt)o_test__44).toString());
        Assert.assertEquals(2, ((int) (((org.sat4j.core.VecInt)o_test__44).hashCode())));
        Assert.assertFalse(((org.sat4j.core.VecInt)o_test__44).isEmpty());
        IConstr o_test__48 = this.optimizer.addClause(clause);
        int[] array_197191046 = new int[]{2, 4, 6, 8, 26};
        	int[] array_877581281 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_test__48).getLits();
        	for(int ii = 0; ii <array_197191046.length; ii++) {
        		org.junit.Assert.assertEquals(array_197191046[ii], array_877581281[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_test__48).getActivity())), 0.1);
        Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_test__48).isSatisfied());
        Assert.assertEquals("1[?] 2[?] 3[?] 4[?] 13[?] ", ((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_test__48).toString());
        Assert.assertEquals(9, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_test__48).hashCode())));
        clause.clear();
        boolean o_test__50 = this.optimizer.isSatisfiable();
        Assert.assertTrue(o_test__50);
        boolean o_test__51 = this.optimizer.isOptimal();
        Assert.assertTrue(o_test__51);
        Number o_test__52 = this.maxsat.getObjectiveValue();
        Assert.assertEquals(2, ((int) (o_test__52)));
        Assert.assertEquals(4, ((int) (o_test__1)));
        Assert.assertEquals("", ((org.sat4j.core.VecInt)o_test__4).toString());
        Assert.assertTrue(((org.sat4j.core.VecInt)o_test__4).isEmpty());
        int[] array_1888385220 = new int[]{2, 10, 4};
        	int[] array_929718541 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_test__6).getLits();
        	for(int ii = 0; ii <array_1888385220.length; ii++) {
        		org.junit.Assert.assertEquals(array_1888385220[ii], array_929718541[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_test__6).getActivity())), 0.1);
        Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_test__6).isSatisfied());
        Assert.assertEquals("1[?] 5[?] 2[?] ", ((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_test__6).toString());
        Assert.assertEquals(5, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_test__6).hashCode())));
        Assert.assertEquals("", ((org.sat4j.core.VecInt)o_test__8).toString());
        Assert.assertTrue(((org.sat4j.core.VecInt)o_test__8).isEmpty());
        int[] array_1804688562 = new int[]{4, 12, 3};
        	int[] array_1802104709 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_test__11).getLits();
        	for(int ii = 0; ii <array_1804688562.length; ii++) {
        		org.junit.Assert.assertEquals(array_1804688562[ii], array_1802104709[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_test__11).getActivity())), 0.1);
        Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_test__11).isSatisfied());
        Assert.assertEquals("2[?] 6[?] -1[?] ", ((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_test__11).toString());
        Assert.assertEquals(6, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_test__11).hashCode())));
        Assert.assertEquals("", ((org.sat4j.core.VecInt)o_test__13).toString());
        Assert.assertTrue(((org.sat4j.core.VecInt)o_test__13).isEmpty());
        int[] array_1544939470 = new int[]{2, 5, 14};
        	int[] array_1757580696 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_test__16).getLits();
        	for(int ii = 0; ii <array_1544939470.length; ii++) {
        		org.junit.Assert.assertEquals(array_1544939470[ii], array_1757580696[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_test__16).getActivity())), 0.1);
        Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_test__16).isSatisfied());
        Assert.assertEquals("1[?] -2[?] 7[?] ", ((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_test__16).toString());
        Assert.assertEquals(7, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_test__16).hashCode())));
        Assert.assertEquals("", ((org.sat4j.core.VecInt)o_test__18).toString());
        Assert.assertTrue(((org.sat4j.core.VecInt)o_test__18).isEmpty());
        int[] array_1890989873 = new int[]{5, 16, 3};
        	int[] array_673313865 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_test__22).getLits();
        	for(int ii = 0; ii <array_1890989873.length; ii++) {
        		org.junit.Assert.assertEquals(array_1890989873[ii], array_673313865[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_test__22).getActivity())), 0.1);
        Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_test__22).isSatisfied());
        Assert.assertEquals("-2[?] 8[?] -1[?] ", ((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_test__22).toString());
        Assert.assertEquals(8, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_test__22).hashCode())));
        Assert.assertEquals("", ((org.sat4j.core.VecInt)o_test__24).toString());
        Assert.assertTrue(((org.sat4j.core.VecInt)o_test__24).isEmpty());
        int[] array_220029483 = new int[]{6, 18, 8};
        	int[] array_1963105152 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_test__26).getLits();
        	for(int ii = 0; ii <array_220029483.length; ii++) {
        		org.junit.Assert.assertEquals(array_220029483[ii], array_1963105152[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_test__26).getActivity())), 0.1);
        Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_test__26).isSatisfied());
        Assert.assertEquals("3[?] 9[?] 4[?] ", ((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_test__26).toString());
        Assert.assertEquals(10, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_test__26).hashCode())));
        Assert.assertEquals("", ((org.sat4j.core.VecInt)o_test__28).toString());
        Assert.assertTrue(((org.sat4j.core.VecInt)o_test__28).isEmpty());
        int[] array_1051236602 = new int[]{20, 7, 8};
        	int[] array_1884914248 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_test__31).getLits();
        	for(int ii = 0; ii <array_1051236602.length; ii++) {
        		org.junit.Assert.assertEquals(array_1051236602[ii], array_1884914248[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_test__31).getActivity())), 0.1);
        Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_test__31).isSatisfied());
        Assert.assertEquals("10[?] -3[?] 4[?] ", ((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_test__31).toString());
        Assert.assertEquals(11, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_test__31).hashCode())));
        Assert.assertEquals("", ((org.sat4j.core.VecInt)o_test__33).toString());
        Assert.assertTrue(((org.sat4j.core.VecInt)o_test__33).isEmpty());
        int[] array_1434180727 = new int[]{22, 9, 6};
        	int[] array_1244704648 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_test__36).getLits();
        	for(int ii = 0; ii <array_1434180727.length; ii++) {
        		org.junit.Assert.assertEquals(array_1434180727[ii], array_1244704648[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_test__36).getActivity())), 0.1);
        Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_test__36).isSatisfied());
        Assert.assertEquals("11[?] -4[?] 3[?] ", ((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_test__36).toString());
        Assert.assertEquals(12, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_test__36).hashCode())));
        Assert.assertEquals("", ((org.sat4j.core.VecInt)o_test__38).toString());
        Assert.assertTrue(((org.sat4j.core.VecInt)o_test__38).isEmpty());
        int[] array_820282934 = new int[]{24, 9, 7};
        	int[] array_1771905559 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_test__42).getLits();
        	for(int ii = 0; ii <array_820282934.length; ii++) {
        		org.junit.Assert.assertEquals(array_820282934[ii], array_1771905559[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_test__42).getActivity())), 0.1);
        Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_test__42).isSatisfied());
        Assert.assertEquals("12[?] -4[?] -3[?] ", ((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_test__42).toString());
        Assert.assertEquals(13, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_test__42).hashCode())));
        Assert.assertEquals("", ((org.sat4j.core.VecInt)o_test__44).toString());
        Assert.assertTrue(((org.sat4j.core.VecInt)o_test__44).isEmpty());
        int[] array_1204814236 = new int[]{4, 26, 6, 8, 2};
        	int[] array_1724064495 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_test__48).getLits();
        	for(int ii = 0; ii <array_1204814236.length; ii++) {
        		org.junit.Assert.assertEquals(array_1204814236[ii], array_1724064495[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_test__48).getActivity())), 0.1);
        Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_test__48).isSatisfied());
        Assert.assertEquals("2[?] 13[?] 3[?] 4[?] 1[?] ", ((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_test__48).toString());
        Assert.assertEquals(9, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_test__48).hashCode())));
        Assert.assertTrue(o_test__50);
        Assert.assertTrue(o_test__51);
    }
}

