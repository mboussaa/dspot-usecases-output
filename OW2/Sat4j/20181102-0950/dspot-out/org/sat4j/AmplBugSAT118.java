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
        int[] array_1277744427 = new int[]{3,4};
        	int[] array_1685777374 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test__6).getLits();
        	for(int ii = 0; ii <array_1277744427.length; ii++) {
        		org.junit.Assert.assertEquals(array_1277744427[ii], array_1685777374[ii]);
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
    public void testlitNum1() throws Exception, ContradictionException, TimeoutException {
        IVecInt clause = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause)).toString());
        Assert.assertTrue(((VecInt) (clause)).isEmpty());
        IVecInt o_testlitNum1__3 = clause.push((-2)).push(2);
        Assert.assertEquals("-2,2", ((VecInt) (o_testlitNum1__3)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_testlitNum1__3)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testlitNum1__3)).isEmpty());
        solver.addClause(clause);
        clause.clear();
        clause.push(1);
        solver.addClause(clause);
        clause.clear();
        clause.push((-2));
        solver.addClause(clause);
        solver.isSatisfiable();
        this.solver.unsatExplanation();
    }

    @Test(timeout = 30000)
    public void testlitNum6() throws Exception, ContradictionException, TimeoutException {
        IVecInt clause = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause)).toString());
        Assert.assertTrue(((VecInt) (clause)).isEmpty());
        IVecInt o_testlitNum6__3 = clause.push((-1)).push(3);
        Assert.assertEquals("-1,3", ((VecInt) (o_testlitNum6__3)).toString());
        Assert.assertEquals(1, ((int) (((VecInt) (o_testlitNum6__3)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testlitNum6__3)).isEmpty());
        IConstr o_testlitNum6__6 = solver.addClause(clause);
        int[] array_1485437103 = new int[]{3,6};
        	int[] array_1050481416 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testlitNum6__6).getLits();
        	for(int ii = 0; ii <array_1485437103.length; ii++) {
        		org.junit.Assert.assertEquals(array_1485437103[ii], array_1050481416[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_testlitNum6__6)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testlitNum6__6)).getActivity())), 0.1);
        Assert.assertEquals("-1[?] 3[?]", ((OriginalBinaryClause) (o_testlitNum6__6)).toString());
        Assert.assertEquals(4, ((int) (((OriginalBinaryClause) (o_testlitNum6__6)).hashCode())));
        clause.clear();
        IVecInt o_testlitNum6__8 = clause.push(1);
        Assert.assertEquals("1", ((VecInt) (o_testlitNum6__8)).toString());
        Assert.assertEquals(1, ((int) (((VecInt) (o_testlitNum6__8)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testlitNum6__8)).isEmpty());
        IConstr o_testlitNum6__9 = solver.addClause(clause);
        Assert.assertTrue(((UnitClause) (o_testlitNum6__9)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_testlitNum6__9)).getActivity())), 0.1);
        Assert.assertEquals("1", ((UnitClause) (o_testlitNum6__9)).toString());
        clause.clear();
        IVecInt o_testlitNum6__11 = clause.push((-2));
        Assert.assertEquals("-2", ((VecInt) (o_testlitNum6__11)).toString());
        Assert.assertEquals(-2, ((int) (((VecInt) (o_testlitNum6__11)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testlitNum6__11)).isEmpty());
        IConstr o_testlitNum6__13 = solver.addClause(clause);
        Assert.assertTrue(((UnitClause) (o_testlitNum6__13)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_testlitNum6__13)).getActivity())), 0.1);
        Assert.assertEquals("-2", ((UnitClause) (o_testlitNum6__13)).toString());
        solver.isSatisfiable();
        this.solver.unsatExplanation();
    }

    @Test(timeout = 30000)
    public void testlitNum7() throws Exception, ContradictionException, TimeoutException {
        IVecInt clause = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause)).toString());
        Assert.assertTrue(((VecInt) (clause)).isEmpty());
        IVecInt o_testlitNum7__3 = clause.push((-1)).push(1);
        Assert.assertEquals("-1,1", ((VecInt) (o_testlitNum7__3)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_testlitNum7__3)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testlitNum7__3)).isEmpty());
        solver.addClause(clause);
        clause.clear();
        clause.push(1);
        solver.addClause(clause);
        clause.clear();
        clause.push((-2));
        solver.addClause(clause);
        solver.isSatisfiable();
        this.solver.unsatExplanation();
    }

    @Test(timeout = 30000)
    public void testlitNum17() throws Exception, ContradictionException, TimeoutException {
        IVecInt clause = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause)).toString());
        Assert.assertTrue(((VecInt) (clause)).isEmpty());
        IVecInt o_testlitNum17__3 = clause.push((-1)).push(2);
        Assert.assertEquals("-1,2", ((VecInt) (o_testlitNum17__3)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_testlitNum17__3)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testlitNum17__3)).isEmpty());
        IConstr o_testlitNum17__6 = solver.addClause(clause);
        int[] array_170937217 = new int[]{3,4};
        	int[] array_267024016 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testlitNum17__6).getLits();
        	for(int ii = 0; ii <array_170937217.length; ii++) {
        		org.junit.Assert.assertEquals(array_170937217[ii], array_267024016[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_testlitNum17__6)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testlitNum17__6)).getActivity())), 0.1);
        Assert.assertEquals("-1[?] 2[?]", ((OriginalBinaryClause) (o_testlitNum17__6)).toString());
        Assert.assertEquals(3, ((int) (((OriginalBinaryClause) (o_testlitNum17__6)).hashCode())));
        clause.clear();
        IVecInt o_testlitNum17__8 = clause.push(1);
        Assert.assertEquals("1", ((VecInt) (o_testlitNum17__8)).toString());
        Assert.assertEquals(1, ((int) (((VecInt) (o_testlitNum17__8)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testlitNum17__8)).isEmpty());
        IConstr o_testlitNum17__9 = solver.addClause(clause);
        Assert.assertTrue(((UnitClause) (o_testlitNum17__9)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_testlitNum17__9)).getActivity())), 0.1);
        Assert.assertEquals("1", ((UnitClause) (o_testlitNum17__9)).toString());
        clause.clear();
        IVecInt o_testlitNum17__11 = clause.push((-3));
        Assert.assertEquals("-3", ((VecInt) (o_testlitNum17__11)).toString());
        Assert.assertEquals(-3, ((int) (((VecInt) (o_testlitNum17__11)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testlitNum17__11)).isEmpty());
        IConstr o_testlitNum17__13 = solver.addClause(clause);
        Assert.assertTrue(((UnitClause) (o_testlitNum17__13)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_testlitNum17__13)).getActivity())), 0.1);
        Assert.assertEquals("-3", ((UnitClause) (o_testlitNum17__13)).toString());
        solver.isSatisfiable();
        this.solver.unsatExplanation();
    }

    @Test(timeout = 30000)
    public void test_add23() throws Exception, ContradictionException, TimeoutException {
        IVecInt clause = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause)).toString());
        Assert.assertTrue(((VecInt) (clause)).isEmpty());
        IVecInt o_test_add23__3 = clause.push((-1)).push(2);
        Assert.assertEquals("-1,2", ((VecInt) (o_test_add23__3)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_test_add23__3)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_add23__3)).isEmpty());
        IVecInt o_test_add23__6 = clause.push((-1)).push(2);
        Assert.assertEquals("-1,2,-1,2", ((VecInt) (o_test_add23__6)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_test_add23__6)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_add23__6)).isEmpty());
        IConstr o_test_add23__9 = solver.addClause(clause);
        int[] array_1262234341 = new int[]{3,4};
        	int[] array_1724606793 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add23__9).getLits();
        	for(int ii = 0; ii <array_1262234341.length; ii++) {
        		org.junit.Assert.assertEquals(array_1262234341[ii], array_1724606793[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_test_add23__9)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_test_add23__9)).getActivity())), 0.1);
        Assert.assertEquals("-1[?] 2[?]", ((OriginalBinaryClause) (o_test_add23__9)).toString());
        Assert.assertEquals(3, ((int) (((OriginalBinaryClause) (o_test_add23__9)).hashCode())));
        clause.clear();
        IVecInt o_test_add23__11 = clause.push(1);
        Assert.assertEquals("1", ((VecInt) (o_test_add23__11)).toString());
        Assert.assertEquals(1, ((int) (((VecInt) (o_test_add23__11)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_add23__11)).isEmpty());
        IConstr o_test_add23__12 = solver.addClause(clause);
        Assert.assertTrue(((UnitClause) (o_test_add23__12)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_test_add23__12)).getActivity())), 0.1);
        Assert.assertEquals("1", ((UnitClause) (o_test_add23__12)).toString());
        clause.clear();
        IVecInt o_test_add23__14 = clause.push((-2));
        Assert.assertEquals("-2", ((VecInt) (o_test_add23__14)).toString());
        Assert.assertEquals(-2, ((int) (((VecInt) (o_test_add23__14)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_add23__14)).isEmpty());
        IConstr o_test_add23__16 = solver.addClause(clause);
        Assert.assertTrue(((UnitClause) (o_test_add23__16)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_test_add23__16)).getActivity())), 0.1);
        Assert.assertEquals("-2", ((UnitClause) (o_test_add23__16)).toString());
        solver.isSatisfiable();
        this.solver.unsatExplanation();
    }

    @Test(timeout = 30000)
    public void test_add24() throws Exception, ContradictionException, TimeoutException {
        IVecInt clause = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause)).toString());
        Assert.assertTrue(((VecInt) (clause)).isEmpty());
        IVecInt o_test_add24__3 = clause.push((-1));
        Assert.assertEquals("-1", ((VecInt) (o_test_add24__3)).toString());
        Assert.assertEquals(-1, ((int) (((VecInt) (o_test_add24__3)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_add24__3)).isEmpty());
        IVecInt o_test_add24__5 = clause.push((-1)).push(2);
        Assert.assertEquals("-1,-1,2", ((VecInt) (o_test_add24__5)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_test_add24__5)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_add24__5)).isEmpty());
        IConstr o_test_add24__8 = solver.addClause(clause);
        int[] array_1162855462 = new int[]{3,4};
        	int[] array_720563899 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add24__8).getLits();
        	for(int ii = 0; ii <array_1162855462.length; ii++) {
        		org.junit.Assert.assertEquals(array_1162855462[ii], array_720563899[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_test_add24__8)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_test_add24__8)).getActivity())), 0.1);
        Assert.assertEquals("-1[?] 2[?]", ((OriginalBinaryClause) (o_test_add24__8)).toString());
        Assert.assertEquals(3, ((int) (((OriginalBinaryClause) (o_test_add24__8)).hashCode())));
        clause.clear();
        IVecInt o_test_add24__10 = clause.push(1);
        Assert.assertEquals("1", ((VecInt) (o_test_add24__10)).toString());
        Assert.assertEquals(1, ((int) (((VecInt) (o_test_add24__10)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_add24__10)).isEmpty());
        IConstr o_test_add24__11 = solver.addClause(clause);
        Assert.assertTrue(((UnitClause) (o_test_add24__11)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_test_add24__11)).getActivity())), 0.1);
        Assert.assertEquals("1", ((UnitClause) (o_test_add24__11)).toString());
        clause.clear();
        IVecInt o_test_add24__13 = clause.push((-2));
        Assert.assertEquals("-2", ((VecInt) (o_test_add24__13)).toString());
        Assert.assertEquals(-2, ((int) (((VecInt) (o_test_add24__13)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_add24__13)).isEmpty());
        IConstr o_test_add24__15 = solver.addClause(clause);
        Assert.assertTrue(((UnitClause) (o_test_add24__15)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_test_add24__15)).getActivity())), 0.1);
        Assert.assertEquals("-2", ((UnitClause) (o_test_add24__15)).toString());
        solver.isSatisfiable();
        this.solver.unsatExplanation();
    }

    @Test(timeout = 30000)
    public void test_add25() throws Exception, ContradictionException, TimeoutException {
        IVecInt clause = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause)).toString());
        Assert.assertTrue(((VecInt) (clause)).isEmpty());
        IVecInt o_test_add25__3 = clause.push((-1)).push(2);
        Assert.assertEquals("-1,2", ((VecInt) (o_test_add25__3)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_test_add25__3)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_add25__3)).isEmpty());
        IConstr o_test_add25__6 = solver.addClause(clause);
        int[] array_1724035434 = new int[]{3,4};
        	int[] array_537650639 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__6).getLits();
        	for(int ii = 0; ii <array_1724035434.length; ii++) {
        		org.junit.Assert.assertEquals(array_1724035434[ii], array_537650639[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_test_add25__6)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_test_add25__6)).getActivity())), 0.1);
        Assert.assertEquals("-1[?] 2[?]", ((OriginalBinaryClause) (o_test_add25__6)).toString());
        Assert.assertEquals(3, ((int) (((OriginalBinaryClause) (o_test_add25__6)).hashCode())));
        IConstr o_test_add25__7 = solver.addClause(clause);
        int[] array_1506081513 = new int[]{3,4};
        	int[] array_945850769 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__7).getLits();
        	for(int ii = 0; ii <array_1506081513.length; ii++) {
        		org.junit.Assert.assertEquals(array_1506081513[ii], array_945850769[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_test_add25__7)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_test_add25__7)).getActivity())), 0.1);
        Assert.assertEquals("-1[?] 2[?]", ((OriginalBinaryClause) (o_test_add25__7)).toString());
        Assert.assertEquals(3, ((int) (((OriginalBinaryClause) (o_test_add25__7)).hashCode())));
        clause.clear();
        IVecInt o_test_add25__9 = clause.push(1);
        Assert.assertEquals("1", ((VecInt) (o_test_add25__9)).toString());
        Assert.assertEquals(1, ((int) (((VecInt) (o_test_add25__9)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_add25__9)).isEmpty());
        IConstr o_test_add25__10 = solver.addClause(clause);
        Assert.assertTrue(((UnitClause) (o_test_add25__10)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_test_add25__10)).getActivity())), 0.1);
        Assert.assertEquals("1", ((UnitClause) (o_test_add25__10)).toString());
        clause.clear();
        IVecInt o_test_add25__12 = clause.push((-2));
        Assert.assertEquals("-2", ((VecInt) (o_test_add25__12)).toString());
        Assert.assertEquals(-2, ((int) (((VecInt) (o_test_add25__12)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_add25__12)).isEmpty());
        IConstr o_test_add25__14 = solver.addClause(clause);
        Assert.assertTrue(((UnitClause) (o_test_add25__14)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_test_add25__14)).getActivity())), 0.1);
        Assert.assertEquals("-2", ((UnitClause) (o_test_add25__14)).toString());
        solver.isSatisfiable();
        this.solver.unsatExplanation();
    }

    @Test(timeout = 30000)
    public void test_add28() throws Exception, ContradictionException, TimeoutException {
        IVecInt clause = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause)).toString());
        Assert.assertTrue(((VecInt) (clause)).isEmpty());
        IVecInt o_test_add28__3 = clause.push((-1)).push(2);
        Assert.assertEquals("-1,2", ((VecInt) (o_test_add28__3)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_test_add28__3)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_add28__3)).isEmpty());
        IConstr o_test_add28__6 = solver.addClause(clause);
        int[] array_1878766099 = new int[]{3,4};
        	int[] array_706827619 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add28__6).getLits();
        	for(int ii = 0; ii <array_1878766099.length; ii++) {
        		org.junit.Assert.assertEquals(array_1878766099[ii], array_706827619[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_test_add28__6)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_test_add28__6)).getActivity())), 0.1);
        Assert.assertEquals("-1[?] 2[?]", ((OriginalBinaryClause) (o_test_add28__6)).toString());
        Assert.assertEquals(3, ((int) (((OriginalBinaryClause) (o_test_add28__6)).hashCode())));
        clause.clear();
        IVecInt o_test_add28__8 = clause.push(1);
        Assert.assertEquals("1", ((VecInt) (o_test_add28__8)).toString());
        Assert.assertEquals(1, ((int) (((VecInt) (o_test_add28__8)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_add28__8)).isEmpty());
        IConstr o_test_add28__9 = solver.addClause(clause);
        Assert.assertTrue(((UnitClause) (o_test_add28__9)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_test_add28__9)).getActivity())), 0.1);
        Assert.assertEquals("1", ((UnitClause) (o_test_add28__9)).toString());
        solver.addClause(clause);
        clause.clear();
        clause.push((-2));
        solver.addClause(clause);
        solver.isSatisfiable();
        this.solver.unsatExplanation();
    }

    @Test(timeout = 30000)
    public void test_add32() throws Exception, ContradictionException, TimeoutException {
        IVecInt clause = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause)).toString());
        Assert.assertTrue(((VecInt) (clause)).isEmpty());
        IVecInt o_test_add32__3 = clause.push((-1)).push(2);
        Assert.assertEquals("-1,2", ((VecInt) (o_test_add32__3)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_test_add32__3)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_add32__3)).isEmpty());
        IConstr o_test_add32__6 = solver.addClause(clause);
        int[] array_1975844523 = new int[]{3,4};
        	int[] array_890396027 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add32__6).getLits();
        	for(int ii = 0; ii <array_1975844523.length; ii++) {
        		org.junit.Assert.assertEquals(array_1975844523[ii], array_890396027[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_test_add32__6)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_test_add32__6)).getActivity())), 0.1);
        Assert.assertEquals("-1[?] 2[?]", ((OriginalBinaryClause) (o_test_add32__6)).toString());
        Assert.assertEquals(3, ((int) (((OriginalBinaryClause) (o_test_add32__6)).hashCode())));
        clause.clear();
        IVecInt o_test_add32__8 = clause.push(1);
        Assert.assertEquals("1", ((VecInt) (o_test_add32__8)).toString());
        Assert.assertEquals(1, ((int) (((VecInt) (o_test_add32__8)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_add32__8)).isEmpty());
        IConstr o_test_add32__9 = solver.addClause(clause);
        Assert.assertTrue(((UnitClause) (o_test_add32__9)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_test_add32__9)).getActivity())), 0.1);
        Assert.assertEquals("1", ((UnitClause) (o_test_add32__9)).toString());
        clause.clear();
        IVecInt o_test_add32__11 = clause.push((-2));
        Assert.assertEquals("-2", ((VecInt) (o_test_add32__11)).toString());
        Assert.assertEquals(-2, ((int) (((VecInt) (o_test_add32__11)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_add32__11)).isEmpty());
        IConstr o_test_add32__13 = solver.addClause(clause);
        Assert.assertTrue(((UnitClause) (o_test_add32__13)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_test_add32__13)).getActivity())), 0.1);
        Assert.assertEquals("-2", ((UnitClause) (o_test_add32__13)).toString());
        solver.isSatisfiable();
        solver.isSatisfiable();
        this.solver.unsatExplanation();
    }

    @Test(timeout = 30000)
    public void testlitNum2_failAssert0() throws Exception, ContradictionException, TimeoutException {
        try {
            IVecInt clause = new VecInt();
            clause.push((-0)).push(2);
            solver.addClause(clause);
            clause.clear();
            clause.push(1);
            solver.addClause(clause);
            clause.clear();
            clause.push((-2));
            solver.addClause(clause);
            solver.isSatisfiable();
            solver.unsatExplanation();
            org.junit.Assert.fail("testlitNum2 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testlitNum3_failAssert1() throws Exception, ContradictionException, TimeoutException {
        try {
            IVecInt clause = new VecInt();
            clause.push((-(Integer.MAX_VALUE))).push(2);
            solver.addClause(clause);
            clause.clear();
            clause.push(1);
            solver.addClause(clause);
            clause.clear();
            clause.push((-2));
            solver.addClause(clause);
            solver.isSatisfiable();
            solver.unsatExplanation();
            org.junit.Assert.fail("testlitNum3 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testlitNum4_failAssert2() throws Exception, ContradictionException, TimeoutException {
        try {
            IVecInt clause = new VecInt();
            clause.push((-(Integer.MIN_VALUE))).push(2);
            solver.addClause(clause);
            clause.clear();
            clause.push(1);
            solver.addClause(clause);
            clause.clear();
            clause.push((-2));
            solver.addClause(clause);
            solver.isSatisfiable();
            solver.unsatExplanation();
            org.junit.Assert.fail("testlitNum4 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-2147483648", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testlitNum8_failAssert3() throws Exception, ContradictionException, TimeoutException {
        try {
            IVecInt clause = new VecInt();
            clause.push((-1)).push(Integer.MAX_VALUE);
            solver.addClause(clause);
            clause.clear();
            clause.push(1);
            solver.addClause(clause);
            clause.clear();
            clause.push((-2));
            solver.addClause(clause);
            solver.isSatisfiable();
            solver.unsatExplanation();
            org.junit.Assert.fail("testlitNum8 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testlitNum10_failAssert5() throws Exception, ContradictionException, TimeoutException {
        try {
            IVecInt clause = new VecInt();
            clause.push((-1)).push(0);
            solver.addClause(clause);
            clause.clear();
            clause.push(1);
            solver.addClause(clause);
            clause.clear();
            clause.push((-2));
            solver.addClause(clause);
            solver.isSatisfiable();
            solver.unsatExplanation();
            org.junit.Assert.fail("testlitNum10 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testlitNum12_failAssert6() throws Exception, ContradictionException, TimeoutException {
        try {
            IVecInt clause = new VecInt();
            clause.push((-1)).push(2);
            solver.addClause(clause);
            clause.clear();
            clause.push(2);
            solver.addClause(clause);
            clause.clear();
            clause.push((-2));
            solver.addClause(clause);
            solver.isSatisfiable();
            solver.unsatExplanation();
            org.junit.Assert.fail("testlitNum12 should have thrown ContradictionException");
        } catch (ContradictionException expected) {
            Assert.assertEquals("Creating Empty clause ?", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testlitNum13_failAssert7() throws Exception, ContradictionException, TimeoutException {
        try {
            IVecInt clause = new VecInt();
            clause.push((-1)).push(2);
            solver.addClause(clause);
            clause.clear();
            clause.push(0);
            solver.addClause(clause);
            clause.clear();
            clause.push((-2));
            solver.addClause(clause);
            solver.isSatisfiable();
            solver.unsatExplanation();
            org.junit.Assert.fail("testlitNum13 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testlitNum14_failAssert8() throws Exception, ContradictionException, TimeoutException {
        try {
            IVecInt clause = new VecInt();
            clause.push((-1)).push(2);
            solver.addClause(clause);
            clause.clear();
            clause.push(Integer.MAX_VALUE);
            solver.addClause(clause);
            clause.clear();
            clause.push((-2));
            solver.addClause(clause);
            solver.isSatisfiable();
            solver.unsatExplanation();
            org.junit.Assert.fail("testlitNum14 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testlitNum19_failAssert11() throws Exception, ContradictionException, TimeoutException {
        try {
            IVecInt clause = new VecInt();
            clause.push((-1)).push(2);
            solver.addClause(clause);
            clause.clear();
            clause.push(1);
            solver.addClause(clause);
            clause.clear();
            clause.push((-(Integer.MAX_VALUE)));
            solver.addClause(clause);
            solver.isSatisfiable();
            solver.unsatExplanation();
            org.junit.Assert.fail("testlitNum19 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testlitNum21_failAssert13() throws Exception, ContradictionException, TimeoutException {
        try {
            IVecInt clause = new VecInt();
            clause.push((-1)).push(2);
            solver.addClause(clause);
            clause.clear();
            clause.push(1);
            solver.addClause(clause);
            clause.clear();
            clause.push((-0));
            solver.addClause(clause);
            solver.isSatisfiable();
            solver.unsatExplanation();
            org.junit.Assert.fail("testlitNum21 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test_add25_add654() throws Exception, ContradictionException, TimeoutException {
        IVecInt clause = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause)).toString());
        Assert.assertTrue(((VecInt) (clause)).isEmpty());
        IVecInt o_test_add25__3 = clause.push((-1)).push(2);
        Assert.assertEquals("-1,2", ((VecInt) (o_test_add25__3)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_test_add25__3)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_add25__3)).isEmpty());
        IConstr o_test_add25__6 = this.solver.addClause(clause);
        int[] array_1446703237 = new int[]{3,4};
        	int[] array_607863791 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__6).getLits();
        	for(int ii = 0; ii <array_1446703237.length; ii++) {
        		org.junit.Assert.assertEquals(array_1446703237[ii], array_607863791[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_test_add25__6)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_test_add25__6)).getActivity())), 0.1);
        Assert.assertEquals("-1[?] 2[?]", ((OriginalBinaryClause) (o_test_add25__6)).toString());
        Assert.assertEquals(3, ((int) (((OriginalBinaryClause) (o_test_add25__6)).hashCode())));
        int[] array_1724035434 = new int[]{3,4};
        	int[] array_537650639 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__6).getLits();
        	for(int ii = 0; ii <array_1724035434.length; ii++) {
        		org.junit.Assert.assertEquals(array_1724035434[ii], array_537650639[ii]);
        	};
        IConstr o_test_add25__7 = this.solver.addClause(clause);
        int[] array_753014721 = new int[]{3,4};
        	int[] array_903618528 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__7).getLits();
        	for(int ii = 0; ii <array_753014721.length; ii++) {
        		org.junit.Assert.assertEquals(array_753014721[ii], array_903618528[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_test_add25__7)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_test_add25__7)).getActivity())), 0.1);
        Assert.assertEquals("-1[?] 2[?]", ((OriginalBinaryClause) (o_test_add25__7)).toString());
        Assert.assertEquals(3, ((int) (((OriginalBinaryClause) (o_test_add25__7)).hashCode())));
        int[] array_1506081513 = new int[]{3,4};
        	int[] array_945850769 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__7).getLits();
        	for(int ii = 0; ii <array_1506081513.length; ii++) {
        		org.junit.Assert.assertEquals(array_1506081513[ii], array_945850769[ii]);
        	};
        ((OriginalBinaryClause) (o_test_add25__7)).isSatisfied();
        clause.clear();
        IVecInt o_test_add25__9 = clause.push(1);
        Assert.assertEquals("1", ((VecInt) (o_test_add25__9)).toString());
        Assert.assertEquals(1, ((int) (((VecInt) (o_test_add25__9)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_add25__9)).isEmpty());
        IConstr o_test_add25__10 = this.solver.addClause(clause);
        Assert.assertTrue(((UnitClause) (o_test_add25__10)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_test_add25__10)).getActivity())), 0.1);
        Assert.assertEquals("1", ((UnitClause) (o_test_add25__10)).toString());
        clause.clear();
        IVecInt o_test_add25__12 = clause.push((-2));
        Assert.assertEquals("-2", ((VecInt) (o_test_add25__12)).toString());
        Assert.assertEquals(-2, ((int) (((VecInt) (o_test_add25__12)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_add25__12)).isEmpty());
        IConstr o_test_add25__14 = this.solver.addClause(clause);
        Assert.assertTrue(((UnitClause) (o_test_add25__14)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_test_add25__14)).getActivity())), 0.1);
        Assert.assertEquals("-2", ((UnitClause) (o_test_add25__14)).toString());
        this.solver.isSatisfiable();
        this.solver.unsatExplanation();
    }

    @Test(timeout = 30000)
    public void test_add25_add672() throws Exception, ContradictionException, TimeoutException {
        IVecInt clause = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause)).toString());
        Assert.assertTrue(((VecInt) (clause)).isEmpty());
        IVecInt o_test_add25__3 = clause.push((-1)).push(2);
        Assert.assertEquals("-1,2", ((VecInt) (o_test_add25__3)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_test_add25__3)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_add25__3)).isEmpty());
        IConstr o_test_add25__6 = this.solver.addClause(clause);
        int[] array_1206605329 = new int[]{3,4};
        	int[] array_755771935 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__6).getLits();
        	for(int ii = 0; ii <array_1206605329.length; ii++) {
        		org.junit.Assert.assertEquals(array_1206605329[ii], array_755771935[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_test_add25__6)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_test_add25__6)).getActivity())), 0.1);
        Assert.assertEquals("-1[?] 2[?]", ((OriginalBinaryClause) (o_test_add25__6)).toString());
        Assert.assertEquals(3, ((int) (((OriginalBinaryClause) (o_test_add25__6)).hashCode())));
        int[] array_1724035434 = new int[]{3,4};
        	int[] array_537650639 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__6).getLits();
        	for(int ii = 0; ii <array_1724035434.length; ii++) {
        		org.junit.Assert.assertEquals(array_1724035434[ii], array_537650639[ii]);
        	};
        IConstr o_test_add25__7 = this.solver.addClause(clause);
        int[] array_568544798 = new int[]{3,4};
        	int[] array_1220418847 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__7).getLits();
        	for(int ii = 0; ii <array_568544798.length; ii++) {
        		org.junit.Assert.assertEquals(array_568544798[ii], array_1220418847[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_test_add25__7)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_test_add25__7)).getActivity())), 0.1);
        Assert.assertEquals("-1[?] 2[?]", ((OriginalBinaryClause) (o_test_add25__7)).toString());
        Assert.assertEquals(3, ((int) (((OriginalBinaryClause) (o_test_add25__7)).hashCode())));
        int[] array_1506081513 = new int[]{3,4};
        	int[] array_945850769 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__7).getLits();
        	for(int ii = 0; ii <array_1506081513.length; ii++) {
        		org.junit.Assert.assertEquals(array_1506081513[ii], array_945850769[ii]);
        	};
        clause.clear();
        IVecInt o_test_add25__9 = clause.push(1);
        Assert.assertEquals("1", ((VecInt) (o_test_add25__9)).toString());
        Assert.assertEquals(1, ((int) (((VecInt) (o_test_add25__9)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_add25__9)).isEmpty());
        IConstr o_test_add25_add672__22 = this.solver.addClause(clause);
        Assert.assertTrue(((UnitClause) (o_test_add25_add672__22)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_test_add25_add672__22)).getActivity())), 0.1);
        Assert.assertEquals("1", ((UnitClause) (o_test_add25_add672__22)).toString());
        IConstr o_test_add25__10 = this.solver.addClause(clause);
        clause.clear();
        IVecInt o_test_add25__12 = clause.push((-2));
        IConstr o_test_add25__14 = this.solver.addClause(clause);
        this.solver.isSatisfiable();
        this.solver.unsatExplanation();
    }

    @Test(timeout = 30000)
    public void test_add25_add653() throws Exception, ContradictionException, TimeoutException {
        IVecInt clause = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause)).toString());
        Assert.assertTrue(((VecInt) (clause)).isEmpty());
        IVecInt o_test_add25__3 = clause.push((-1)).push(2);
        Assert.assertEquals("-1,2", ((VecInt) (o_test_add25__3)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_test_add25__3)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_add25__3)).isEmpty());
        IConstr o_test_add25__6 = this.solver.addClause(clause);
        int[] array_7720934 = new int[]{3,4};
        	int[] array_1873932885 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__6).getLits();
        	for(int ii = 0; ii <array_7720934.length; ii++) {
        		org.junit.Assert.assertEquals(array_7720934[ii], array_1873932885[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_test_add25__6)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_test_add25__6)).getActivity())), 0.1);
        Assert.assertEquals("-1[?] 2[?]", ((OriginalBinaryClause) (o_test_add25__6)).toString());
        Assert.assertEquals(3, ((int) (((OriginalBinaryClause) (o_test_add25__6)).hashCode())));
        int[] array_1724035434 = new int[]{3,4};
        	int[] array_537650639 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__6).getLits();
        	for(int ii = 0; ii <array_1724035434.length; ii++) {
        		org.junit.Assert.assertEquals(array_1724035434[ii], array_537650639[ii]);
        	};
        IConstr o_test_add25_add653__13 = this.solver.addClause(clause);
        int[] array_805440592 = new int[]{3,4};
        	int[] array_416946738 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25_add653__13).getLits();
        	for(int ii = 0; ii <array_805440592.length; ii++) {
        		org.junit.Assert.assertEquals(array_805440592[ii], array_416946738[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_test_add25_add653__13)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_test_add25_add653__13)).getActivity())), 0.1);
        Assert.assertEquals("-1[?] 2[?]", ((OriginalBinaryClause) (o_test_add25_add653__13)).toString());
        Assert.assertEquals(3, ((int) (((OriginalBinaryClause) (o_test_add25_add653__13)).hashCode())));
        IConstr o_test_add25__7 = this.solver.addClause(clause);
        int[] array_1242534560 = new int[]{3,4};
        	int[] array_1661711585 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__7).getLits();
        	for(int ii = 0; ii <array_1242534560.length; ii++) {
        		org.junit.Assert.assertEquals(array_1242534560[ii], array_1661711585[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_test_add25__7)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_test_add25__7)).getActivity())), 0.1);
        Assert.assertEquals("-1[?] 2[?]", ((OriginalBinaryClause) (o_test_add25__7)).toString());
        Assert.assertEquals(3, ((int) (((OriginalBinaryClause) (o_test_add25__7)).hashCode())));
        int[] array_1506081513 = new int[]{3,4};
        	int[] array_945850769 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__7).getLits();
        	for(int ii = 0; ii <array_1506081513.length; ii++) {
        		org.junit.Assert.assertEquals(array_1506081513[ii], array_945850769[ii]);
        	};
        clause.clear();
        IVecInt o_test_add25__9 = clause.push(1);
        Assert.assertEquals("1", ((VecInt) (o_test_add25__9)).toString());
        Assert.assertEquals(1, ((int) (((VecInt) (o_test_add25__9)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_add25__9)).isEmpty());
        IConstr o_test_add25__10 = this.solver.addClause(clause);
        Assert.assertTrue(((UnitClause) (o_test_add25__10)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_test_add25__10)).getActivity())), 0.1);
        Assert.assertEquals("1", ((UnitClause) (o_test_add25__10)).toString());
        clause.clear();
        IVecInt o_test_add25__12 = clause.push((-2));
        Assert.assertEquals("-2", ((VecInt) (o_test_add25__12)).toString());
        Assert.assertEquals(-2, ((int) (((VecInt) (o_test_add25__12)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_add25__12)).isEmpty());
        IConstr o_test_add25__14 = this.solver.addClause(clause);
        Assert.assertTrue(((UnitClause) (o_test_add25__14)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_test_add25__14)).getActivity())), 0.1);
        Assert.assertEquals("-2", ((UnitClause) (o_test_add25__14)).toString());
        this.solver.isSatisfiable();
        this.solver.unsatExplanation();
    }

    @Test(timeout = 30000)
    public void test_add25_add709() throws Exception, ContradictionException, TimeoutException {
        IVecInt clause = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause)).toString());
        Assert.assertTrue(((VecInt) (clause)).isEmpty());
        IVecInt o_test_add25__3 = clause.push((-1)).push(2);
        Assert.assertEquals("-1,2", ((VecInt) (o_test_add25__3)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_test_add25__3)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_add25__3)).isEmpty());
        IConstr o_test_add25__6 = this.solver.addClause(clause);
        int[] array_399839390 = new int[]{3,4};
        	int[] array_1572713630 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__6).getLits();
        	for(int ii = 0; ii <array_399839390.length; ii++) {
        		org.junit.Assert.assertEquals(array_399839390[ii], array_1572713630[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_test_add25__6)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_test_add25__6)).getActivity())), 0.1);
        Assert.assertEquals("-1[?] 2[?]", ((OriginalBinaryClause) (o_test_add25__6)).toString());
        Assert.assertEquals(3, ((int) (((OriginalBinaryClause) (o_test_add25__6)).hashCode())));
        int[] array_1724035434 = new int[]{3,4};
        	int[] array_537650639 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__6).getLits();
        	for(int ii = 0; ii <array_1724035434.length; ii++) {
        		org.junit.Assert.assertEquals(array_1724035434[ii], array_537650639[ii]);
        	};
        IConstr o_test_add25__7 = this.solver.addClause(clause);
        int[] array_386846173 = new int[]{3,4};
        	int[] array_893480475 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__7).getLits();
        	for(int ii = 0; ii <array_386846173.length; ii++) {
        		org.junit.Assert.assertEquals(array_386846173[ii], array_893480475[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_test_add25__7)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_test_add25__7)).getActivity())), 0.1);
        Assert.assertEquals("-1[?] 2[?]", ((OriginalBinaryClause) (o_test_add25__7)).toString());
        Assert.assertEquals(3, ((int) (((OriginalBinaryClause) (o_test_add25__7)).hashCode())));
        int[] array_1506081513 = new int[]{3,4};
        	int[] array_945850769 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__7).getLits();
        	for(int ii = 0; ii <array_1506081513.length; ii++) {
        		org.junit.Assert.assertEquals(array_1506081513[ii], array_945850769[ii]);
        	};
        clause.clear();
        IVecInt o_test_add25__9 = clause.push(1);
        Assert.assertEquals("1", ((VecInt) (o_test_add25__9)).toString());
        Assert.assertEquals(1, ((int) (((VecInt) (o_test_add25__9)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_add25__9)).isEmpty());
        IConstr o_test_add25__10 = this.solver.addClause(clause);
        Assert.assertTrue(((UnitClause) (o_test_add25__10)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_test_add25__10)).getActivity())), 0.1);
        Assert.assertEquals("1", ((UnitClause) (o_test_add25__10)).toString());
        clause.clear();
        IVecInt o_test_add25__12 = clause.push((-2));
        Assert.assertEquals("-2", ((VecInt) (o_test_add25__12)).toString());
        Assert.assertEquals(-2, ((int) (((VecInt) (o_test_add25__12)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_add25__12)).isEmpty());
        IConstr o_test_add25__14 = this.solver.addClause(clause);
        Assert.assertTrue(((UnitClause) (o_test_add25__14)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_test_add25__14)).getActivity())), 0.1);
        Assert.assertEquals("-2", ((UnitClause) (o_test_add25__14)).toString());
        this.solver.isSatisfiable();
        this.solver.isSatisfiable();
        this.solver.unsatExplanation();
    }

    @Test(timeout = 30000)
    public void test_add25_add623() throws Exception, ContradictionException, TimeoutException {
        IVecInt clause = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause)).toString());
        Assert.assertTrue(((VecInt) (clause)).isEmpty());
        IVecInt o_test_add25_add623__3 = clause.push((-1)).push(2);
        Assert.assertEquals("-1,2", ((VecInt) (o_test_add25_add623__3)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_test_add25_add623__3)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_add25_add623__3)).isEmpty());
        IVecInt o_test_add25__3 = clause.push((-1)).push(2);
        Assert.assertEquals("-1,2,-1,2", ((VecInt) (o_test_add25__3)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_test_add25__3)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_add25__3)).isEmpty());
        IConstr o_test_add25__6 = this.solver.addClause(clause);
        int[] array_575868324 = new int[]{3,4};
        	int[] array_1514791894 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__6).getLits();
        	for(int ii = 0; ii <array_575868324.length; ii++) {
        		org.junit.Assert.assertEquals(array_575868324[ii], array_1514791894[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_test_add25__6)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_test_add25__6)).getActivity())), 0.1);
        Assert.assertEquals("-1[?] 2[?]", ((OriginalBinaryClause) (o_test_add25__6)).toString());
        Assert.assertEquals(3, ((int) (((OriginalBinaryClause) (o_test_add25__6)).hashCode())));
        int[] array_1724035434 = new int[]{3,4};
        	int[] array_537650639 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__6).getLits();
        	for(int ii = 0; ii <array_1724035434.length; ii++) {
        		org.junit.Assert.assertEquals(array_1724035434[ii], array_537650639[ii]);
        	};
        IConstr o_test_add25__7 = this.solver.addClause(clause);
        int[] array_1467232237 = new int[]{3,4};
        	int[] array_975816113 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__7).getLits();
        	for(int ii = 0; ii <array_1467232237.length; ii++) {
        		org.junit.Assert.assertEquals(array_1467232237[ii], array_975816113[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_test_add25__7)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_test_add25__7)).getActivity())), 0.1);
        Assert.assertEquals("-1[?] 2[?]", ((OriginalBinaryClause) (o_test_add25__7)).toString());
        Assert.assertEquals(3, ((int) (((OriginalBinaryClause) (o_test_add25__7)).hashCode())));
        int[] array_1506081513 = new int[]{3,4};
        	int[] array_945850769 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__7).getLits();
        	for(int ii = 0; ii <array_1506081513.length; ii++) {
        		org.junit.Assert.assertEquals(array_1506081513[ii], array_945850769[ii]);
        	};
        clause.clear();
        IVecInt o_test_add25__9 = clause.push(1);
        Assert.assertEquals("1", ((VecInt) (o_test_add25__9)).toString());
        Assert.assertEquals(1, ((int) (((VecInt) (o_test_add25__9)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_add25__9)).isEmpty());
        IConstr o_test_add25__10 = this.solver.addClause(clause);
        Assert.assertTrue(((UnitClause) (o_test_add25__10)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_test_add25__10)).getActivity())), 0.1);
        Assert.assertEquals("1", ((UnitClause) (o_test_add25__10)).toString());
        clause.clear();
        IVecInt o_test_add25__12 = clause.push((-2));
        Assert.assertEquals("-2", ((VecInt) (o_test_add25__12)).toString());
        Assert.assertEquals(-2, ((int) (((VecInt) (o_test_add25__12)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_add25__12)).isEmpty());
        IConstr o_test_add25__14 = this.solver.addClause(clause);
        Assert.assertTrue(((UnitClause) (o_test_add25__14)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_test_add25__14)).getActivity())), 0.1);
        Assert.assertEquals("-2", ((UnitClause) (o_test_add25__14)).toString());
        this.solver.isSatisfiable();
        this.solver.unsatExplanation();
    }

    @Test(timeout = 30000)
    public void test_add25litNum588() throws Exception, ContradictionException, TimeoutException {
        IVecInt clause = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause)).toString());
        Assert.assertTrue(((VecInt) (clause)).isEmpty());
        IVecInt o_test_add25__3 = clause.push((-1)).push(2);
        Assert.assertEquals("-1,2", ((VecInt) (o_test_add25__3)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_test_add25__3)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_add25__3)).isEmpty());
        IConstr o_test_add25__6 = this.solver.addClause(clause);
        int[] array_1826818177 = new int[]{3,4};
        	int[] array_1835794795 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__6).getLits();
        	for(int ii = 0; ii <array_1826818177.length; ii++) {
        		org.junit.Assert.assertEquals(array_1826818177[ii], array_1835794795[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_test_add25__6)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_test_add25__6)).getActivity())), 0.1);
        Assert.assertEquals("-1[?] 2[?]", ((OriginalBinaryClause) (o_test_add25__6)).toString());
        Assert.assertEquals(3, ((int) (((OriginalBinaryClause) (o_test_add25__6)).hashCode())));
        int[] array_1724035434 = new int[]{3,4};
        	int[] array_537650639 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__6).getLits();
        	for(int ii = 0; ii <array_1724035434.length; ii++) {
        		org.junit.Assert.assertEquals(array_1724035434[ii], array_537650639[ii]);
        	};
        IConstr o_test_add25__7 = this.solver.addClause(clause);
        int[] array_1743611578 = new int[]{3,4};
        	int[] array_988780090 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__7).getLits();
        	for(int ii = 0; ii <array_1743611578.length; ii++) {
        		org.junit.Assert.assertEquals(array_1743611578[ii], array_988780090[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_test_add25__7)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_test_add25__7)).getActivity())), 0.1);
        Assert.assertEquals("-1[?] 2[?]", ((OriginalBinaryClause) (o_test_add25__7)).toString());
        Assert.assertEquals(3, ((int) (((OriginalBinaryClause) (o_test_add25__7)).hashCode())));
        int[] array_1506081513 = new int[]{3,4};
        	int[] array_945850769 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__7).getLits();
        	for(int ii = 0; ii <array_1506081513.length; ii++) {
        		org.junit.Assert.assertEquals(array_1506081513[ii], array_945850769[ii]);
        	};
        clause.clear();
        IVecInt o_test_add25__9 = clause.push(1);
        Assert.assertEquals("1", ((VecInt) (o_test_add25__9)).toString());
        Assert.assertEquals(1, ((int) (((VecInt) (o_test_add25__9)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_add25__9)).isEmpty());
        IConstr o_test_add25__10 = this.solver.addClause(clause);
        Assert.assertTrue(((UnitClause) (o_test_add25__10)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_test_add25__10)).getActivity())), 0.1);
        Assert.assertEquals("1", ((UnitClause) (o_test_add25__10)).toString());
        clause.clear();
        IVecInt o_test_add25__12 = clause.push((-3));
        Assert.assertEquals("-3", ((VecInt) (o_test_add25__12)).toString());
        Assert.assertEquals(-3, ((int) (((VecInt) (o_test_add25__12)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_add25__12)).isEmpty());
        IConstr o_test_add25__14 = this.solver.addClause(clause);
        Assert.assertTrue(((UnitClause) (o_test_add25__14)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_test_add25__14)).getActivity())), 0.1);
        Assert.assertEquals("-3", ((UnitClause) (o_test_add25__14)).toString());
        this.solver.isSatisfiable();
        this.solver.unsatExplanation();
    }

    @Test(timeout = 30000)
    public void test_add25litNum597_failAssert14() throws Exception, ContradictionException, TimeoutException {
        try {
            IVecInt clause = new VecInt();
            IVecInt o_test_add25__3 = clause.push((-1)).push(2);
            IConstr o_test_add25__6 = this.solver.addClause(clause);
            int[] array_1724035434 = new int[]{3,4};
            	int[] array_537650639 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__6).getLits();
            	for(int ii = 0; ii <array_1724035434.length; ii++) {
            		org.junit.Assert.assertEquals(array_1724035434[ii], array_537650639[ii]);
            	};
            IConstr o_test_add25__7 = this.solver.addClause(clause);
            int[] array_1506081513 = new int[]{3,4};
            	int[] array_945850769 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__7).getLits();
            	for(int ii = 0; ii <array_1506081513.length; ii++) {
            		org.junit.Assert.assertEquals(array_1506081513[ii], array_945850769[ii]);
            	};
            clause.clear();
            IVecInt o_test_add25__9 = clause.push(1);
            IConstr o_test_add25__10 = this.solver.addClause(clause);
            clause.clear();
            IVecInt o_test_add25__12 = clause.push((-(Integer.MIN_VALUE)));
            IConstr o_test_add25__14 = this.solver.addClause(clause);
            this.solver.isSatisfiable();
            this.solver.unsatExplanation();
            org.junit.Assert.fail("test_add25litNum597 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-2147483648", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test_add25litNum546_failAssert16() throws Exception, ContradictionException, TimeoutException {
        try {
            IVecInt clause = new VecInt();
            IVecInt o_test_add25__3 = clause.push((-(Integer.MAX_VALUE))).push(2);
            IConstr o_test_add25__6 = this.solver.addClause(clause);
            int[] array_1724035434 = new int[]{3,4};
            	int[] array_537650639 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__6).getLits();
            	for(int ii = 0; ii <array_1724035434.length; ii++) {
            		org.junit.Assert.assertEquals(array_1724035434[ii], array_537650639[ii]);
            	};
            IConstr o_test_add25__7 = this.solver.addClause(clause);
            int[] array_1506081513 = new int[]{3,4};
            	int[] array_945850769 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__7).getLits();
            	for(int ii = 0; ii <array_1506081513.length; ii++) {
            		org.junit.Assert.assertEquals(array_1506081513[ii], array_945850769[ii]);
            	};
            clause.clear();
            IVecInt o_test_add25__9 = clause.push(1);
            IConstr o_test_add25__10 = this.solver.addClause(clause);
            clause.clear();
            IVecInt o_test_add25__12 = clause.push((-2));
            IConstr o_test_add25__14 = this.solver.addClause(clause);
            this.solver.isSatisfiable();
            this.solver.unsatExplanation();
            org.junit.Assert.fail("test_add25litNum546 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test_add25litNum550_failAssert17() throws Exception, ContradictionException, TimeoutException {
        try {
            IVecInt clause = new VecInt();
            IVecInt o_test_add25__3 = clause.push((-(Integer.MIN_VALUE))).push(2);
            IConstr o_test_add25__6 = this.solver.addClause(clause);
            int[] array_1724035434 = new int[]{3,4};
            	int[] array_537650639 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__6).getLits();
            	for(int ii = 0; ii <array_1724035434.length; ii++) {
            		org.junit.Assert.assertEquals(array_1724035434[ii], array_537650639[ii]);
            	};
            IConstr o_test_add25__7 = this.solver.addClause(clause);
            int[] array_1506081513 = new int[]{3,4};
            	int[] array_945850769 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__7).getLits();
            	for(int ii = 0; ii <array_1506081513.length; ii++) {
            		org.junit.Assert.assertEquals(array_1506081513[ii], array_945850769[ii]);
            	};
            clause.clear();
            IVecInt o_test_add25__9 = clause.push(1);
            IConstr o_test_add25__10 = this.solver.addClause(clause);
            clause.clear();
            IVecInt o_test_add25__12 = clause.push((-2));
            IConstr o_test_add25__14 = this.solver.addClause(clause);
            this.solver.isSatisfiable();
            this.solver.unsatExplanation();
            org.junit.Assert.fail("test_add25litNum550 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-2147483648", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test_add25litNum567_failAssert18() throws Exception, ContradictionException, TimeoutException {
        try {
            IVecInt clause = new VecInt();
            IVecInt o_test_add25__3 = clause.push((-1)).push(Integer.MIN_VALUE);
            IConstr o_test_add25__6 = this.solver.addClause(clause);
            int[] array_1724035434 = new int[]{3,4};
            	int[] array_537650639 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__6).getLits();
            	for(int ii = 0; ii <array_1724035434.length; ii++) {
            		org.junit.Assert.assertEquals(array_1724035434[ii], array_537650639[ii]);
            	};
            IConstr o_test_add25__7 = this.solver.addClause(clause);
            int[] array_1506081513 = new int[]{3,4};
            	int[] array_945850769 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__7).getLits();
            	for(int ii = 0; ii <array_1506081513.length; ii++) {
            		org.junit.Assert.assertEquals(array_1506081513[ii], array_945850769[ii]);
            	};
            clause.clear();
            IVecInt o_test_add25__9 = clause.push(1);
            IConstr o_test_add25__10 = this.solver.addClause(clause);
            clause.clear();
            IVecInt o_test_add25__12 = clause.push((-2));
            IConstr o_test_add25__14 = this.solver.addClause(clause);
            this.solver.isSatisfiable();
            this.solver.unsatExplanation();
            org.junit.Assert.fail("test_add25litNum567 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-2147483648", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test_add25litNum584_failAssert19() throws Exception, ContradictionException, TimeoutException {
        try {
            IVecInt clause = new VecInt();
            IVecInt o_test_add25__3 = clause.push((-1)).push(2);
            IConstr o_test_add25__6 = this.solver.addClause(clause);
            int[] array_1724035434 = new int[]{3,4};
            	int[] array_537650639 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__6).getLits();
            	for(int ii = 0; ii <array_1724035434.length; ii++) {
            		org.junit.Assert.assertEquals(array_1724035434[ii], array_537650639[ii]);
            	};
            IConstr o_test_add25__7 = this.solver.addClause(clause);
            int[] array_1506081513 = new int[]{3,4};
            	int[] array_945850769 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__7).getLits();
            	for(int ii = 0; ii <array_1506081513.length; ii++) {
            		org.junit.Assert.assertEquals(array_1506081513[ii], array_945850769[ii]);
            	};
            clause.clear();
            IVecInt o_test_add25__9 = clause.push(Integer.MIN_VALUE);
            IConstr o_test_add25__10 = this.solver.addClause(clause);
            clause.clear();
            IVecInt o_test_add25__12 = clause.push((-2));
            IConstr o_test_add25__14 = this.solver.addClause(clause);
            this.solver.isSatisfiable();
            this.solver.unsatExplanation();
            org.junit.Assert.fail("test_add25litNum584 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-2147483648", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test_add25litNum578_failAssert22() throws Exception, ContradictionException, TimeoutException {
        try {
            IVecInt clause = new VecInt();
            IVecInt o_test_add25__3 = clause.push((-1)).push(2);
            IConstr o_test_add25__6 = this.solver.addClause(clause);
            int[] array_1724035434 = new int[]{3,4};
            	int[] array_537650639 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__6).getLits();
            	for(int ii = 0; ii <array_1724035434.length; ii++) {
            		org.junit.Assert.assertEquals(array_1724035434[ii], array_537650639[ii]);
            	};
            IConstr o_test_add25__7 = this.solver.addClause(clause);
            int[] array_1506081513 = new int[]{3,4};
            	int[] array_945850769 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__7).getLits();
            	for(int ii = 0; ii <array_1506081513.length; ii++) {
            		org.junit.Assert.assertEquals(array_1506081513[ii], array_945850769[ii]);
            	};
            clause.clear();
            IVecInt o_test_add25__9 = clause.push(0);
            IConstr o_test_add25__10 = this.solver.addClause(clause);
            clause.clear();
            IVecInt o_test_add25__12 = clause.push((-2));
            IConstr o_test_add25__14 = this.solver.addClause(clause);
            this.solver.isSatisfiable();
            this.solver.unsatExplanation();
            org.junit.Assert.fail("test_add25litNum578 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test_add25litNum539_failAssert23() throws Exception, ContradictionException, TimeoutException {
        try {
            IVecInt clause = new VecInt();
            IVecInt o_test_add25__3 = clause.push((-2)).push(2);
            IConstr o_test_add25__6 = this.solver.addClause(clause);
            int[] array_1724035434 = new int[]{3,4};
            	int[] array_537650639 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__6).getLits();
            	for(int ii = 0; ii <array_1724035434.length; ii++) {
            		org.junit.Assert.assertEquals(array_1724035434[ii], array_537650639[ii]);
            	};
            IConstr o_test_add25__7 = this.solver.addClause(clause);
            int[] array_1506081513 = new int[]{3,4};
            	int[] array_945850769 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__7).getLits();
            	for(int ii = 0; ii <array_1506081513.length; ii++) {
            		org.junit.Assert.assertEquals(array_1506081513[ii], array_945850769[ii]);
            	};
            clause.clear();
            IVecInt o_test_add25__9 = clause.push(1);
            IConstr o_test_add25__10 = this.solver.addClause(clause);
            clause.clear();
            IVecInt o_test_add25__12 = clause.push((-2));
            IConstr o_test_add25__14 = this.solver.addClause(clause);
            this.solver.isSatisfiable();
            this.solver.unsatExplanation();
            org.junit.Assert.fail("test_add25litNum539 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test_add25litNum569_failAssert24() throws Exception, ContradictionException, TimeoutException {
        try {
            IVecInt clause = new VecInt();
            IVecInt o_test_add25__3 = clause.push((-1)).push(0);
            IConstr o_test_add25__6 = this.solver.addClause(clause);
            int[] array_1724035434 = new int[]{3,4};
            	int[] array_537650639 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__6).getLits();
            	for(int ii = 0; ii <array_1724035434.length; ii++) {
            		org.junit.Assert.assertEquals(array_1724035434[ii], array_537650639[ii]);
            	};
            IConstr o_test_add25__7 = this.solver.addClause(clause);
            int[] array_1506081513 = new int[]{3,4};
            	int[] array_945850769 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__7).getLits();
            	for(int ii = 0; ii <array_1506081513.length; ii++) {
            		org.junit.Assert.assertEquals(array_1506081513[ii], array_945850769[ii]);
            	};
            clause.clear();
            IVecInt o_test_add25__9 = clause.push(1);
            IConstr o_test_add25__10 = this.solver.addClause(clause);
            clause.clear();
            IVecInt o_test_add25__12 = clause.push((-2));
            IConstr o_test_add25__14 = this.solver.addClause(clause);
            this.solver.isSatisfiable();
            this.solver.unsatExplanation();
            org.junit.Assert.fail("test_add25litNum569 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test_add25litNum575_failAssert25() throws Exception, ContradictionException, TimeoutException {
        try {
            IVecInt clause = new VecInt();
            IVecInt o_test_add25__3 = clause.push((-1)).push(2);
            IConstr o_test_add25__6 = this.solver.addClause(clause);
            int[] array_1724035434 = new int[]{3,4};
            	int[] array_537650639 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__6).getLits();
            	for(int ii = 0; ii <array_1724035434.length; ii++) {
            		org.junit.Assert.assertEquals(array_1724035434[ii], array_537650639[ii]);
            	};
            IConstr o_test_add25__7 = this.solver.addClause(clause);
            int[] array_1506081513 = new int[]{3,4};
            	int[] array_945850769 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__7).getLits();
            	for(int ii = 0; ii <array_1506081513.length; ii++) {
            		org.junit.Assert.assertEquals(array_1506081513[ii], array_945850769[ii]);
            	};
            clause.clear();
            IVecInt o_test_add25__9 = clause.push(2);
            IConstr o_test_add25__10 = this.solver.addClause(clause);
            clause.clear();
            IVecInt o_test_add25__12 = clause.push((-2));
            IConstr o_test_add25__14 = this.solver.addClause(clause);
            this.solver.isSatisfiable();
            this.solver.unsatExplanation();
            org.junit.Assert.fail("test_add25litNum575 should have thrown ContradictionException");
        } catch (ContradictionException expected) {
            Assert.assertEquals("Creating Empty clause ?", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test_add25litNum542_failAssert27() throws Exception, ContradictionException, TimeoutException {
        try {
            IVecInt clause = new VecInt();
            IVecInt o_test_add25__3 = clause.push((-0)).push(2);
            IConstr o_test_add25__6 = this.solver.addClause(clause);
            int[] array_1724035434 = new int[]{3,4};
            	int[] array_537650639 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__6).getLits();
            	for(int ii = 0; ii <array_1724035434.length; ii++) {
            		org.junit.Assert.assertEquals(array_1724035434[ii], array_537650639[ii]);
            	};
            IConstr o_test_add25__7 = this.solver.addClause(clause);
            int[] array_1506081513 = new int[]{3,4};
            	int[] array_945850769 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__7).getLits();
            	for(int ii = 0; ii <array_1506081513.length; ii++) {
            		org.junit.Assert.assertEquals(array_1506081513[ii], array_945850769[ii]);
            	};
            clause.clear();
            IVecInt o_test_add25__9 = clause.push(1);
            IConstr o_test_add25__10 = this.solver.addClause(clause);
            clause.clear();
            IVecInt o_test_add25__12 = clause.push((-2));
            IConstr o_test_add25__14 = this.solver.addClause(clause);
            this.solver.isSatisfiable();
            this.solver.unsatExplanation();
            org.junit.Assert.fail("test_add25litNum542 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test_add25litNum600_failAssert29() throws Exception, ContradictionException, TimeoutException {
        try {
            IVecInt clause = new VecInt();
            IVecInt o_test_add25__3 = clause.push((-1)).push(2);
            IConstr o_test_add25__6 = this.solver.addClause(clause);
            int[] array_1724035434 = new int[]{3,4};
            	int[] array_537650639 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__6).getLits();
            	for(int ii = 0; ii <array_1724035434.length; ii++) {
            		org.junit.Assert.assertEquals(array_1724035434[ii], array_537650639[ii]);
            	};
            IConstr o_test_add25__7 = this.solver.addClause(clause);
            int[] array_1506081513 = new int[]{3,4};
            	int[] array_945850769 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__7).getLits();
            	for(int ii = 0; ii <array_1506081513.length; ii++) {
            		org.junit.Assert.assertEquals(array_1506081513[ii], array_945850769[ii]);
            	};
            clause.clear();
            IVecInt o_test_add25__9 = clause.push(1);
            IConstr o_test_add25__10 = this.solver.addClause(clause);
            clause.clear();
            IVecInt o_test_add25__12 = clause.push((-0));
            IConstr o_test_add25__14 = this.solver.addClause(clause);
            this.solver.isSatisfiable();
            this.solver.unsatExplanation();
            org.junit.Assert.fail("test_add25litNum600 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testlitNum12_failAssert6litNum573_failAssert30() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                IVecInt clause = new VecInt();
                clause.push((-1)).push(2);
                this.solver.addClause(clause);
                clause.clear();
                clause.push(2);
                this.solver.addClause(clause);
                clause.clear();
                clause.push((-0));
                this.solver.addClause(clause);
                this.solver.isSatisfiable();
                this.solver.unsatExplanation();
                org.junit.Assert.fail("testlitNum12 should have thrown ContradictionException");
            }
            org.junit.Assert.fail("testlitNum12_failAssert6litNum573 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testlitNum14_failAssert8litNum215_failAssert48() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                IVecInt clause = new VecInt();
                clause.push((-1)).push(2);
                this.solver.addClause(clause);
                clause.clear();
                clause.push(Integer.MAX_VALUE);
                this.solver.addClause(clause);
                clause.clear();
                clause.push((-0));
                this.solver.addClause(clause);
                this.solver.isSatisfiable();
                this.solver.unsatExplanation();
                org.junit.Assert.fail("testlitNum14 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testlitNum14_failAssert8litNum215 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testlitNum19_failAssert11litNum390_failAssert64() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                IVecInt clause = new VecInt();
                clause.push((-1)).push(2);
                this.solver.addClause(clause);
                clause.clear();
                clause.push(2);
                this.solver.addClause(clause);
                clause.clear();
                clause.push((-(Integer.MAX_VALUE)));
                this.solver.addClause(clause);
                this.solver.isSatisfiable();
                this.solver.unsatExplanation();
                org.junit.Assert.fail("testlitNum19 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testlitNum19_failAssert11litNum390 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testlitNum19_failAssert11litNum375_failAssert65() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                IVecInt clause = new VecInt();
                clause.push((-1)).push(1);
                this.solver.addClause(clause);
                clause.clear();
                clause.push(1);
                this.solver.addClause(clause);
                clause.clear();
                clause.push((-(Integer.MAX_VALUE)));
                this.solver.addClause(clause);
                this.solver.isSatisfiable();
                this.solver.unsatExplanation();
                org.junit.Assert.fail("testlitNum19 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testlitNum19_failAssert11litNum375 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testlitNum19_failAssert11litNum393_failAssert66() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                IVecInt clause = new VecInt();
                clause.push((-1)).push(2);
                this.solver.addClause(clause);
                clause.clear();
                clause.push(0);
                this.solver.addClause(clause);
                clause.clear();
                clause.push((-(Integer.MAX_VALUE)));
                this.solver.addClause(clause);
                this.solver.isSatisfiable();
                this.solver.unsatExplanation();
                org.junit.Assert.fail("testlitNum19 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testlitNum19_failAssert11litNum393 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testlitNum19_failAssert11litNum370_failAssert83() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                IVecInt clause = new VecInt();
                clause.push((-91135323)).push(2);
                this.solver.addClause(clause);
                clause.clear();
                clause.push(1);
                this.solver.addClause(clause);
                clause.clear();
                clause.push((-(Integer.MAX_VALUE)));
                this.solver.addClause(clause);
                this.solver.isSatisfiable();
                this.solver.unsatExplanation();
                org.junit.Assert.fail("testlitNum19 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testlitNum19_failAssert11litNum370 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testlitNum12_failAssert6_add585_failAssert85() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                IVecInt clause = new VecInt();
                clause.push((-1)).push(2);
                this.solver.addClause(clause);
                clause.clear();
                clause.push(2);
                clause.push(2);
                this.solver.addClause(clause);
                clause.clear();
                clause.push((-2));
                this.solver.addClause(clause);
                this.solver.isSatisfiable();
                this.solver.unsatExplanation();
                org.junit.Assert.fail("testlitNum12 should have thrown ContradictionException");
            }
            org.junit.Assert.fail("testlitNum12_failAssert6_add585 should have thrown ContradictionException");
        } catch (ContradictionException expected) {
            Assert.assertEquals("Creating Empty clause ?", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testlitNum13_failAssert7litNum486_failAssert90() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                IVecInt clause = new VecInt();
                clause.push((-1)).push(2);
                this.solver.addClause(clause);
                clause.clear();
                clause.push(0);
                this.solver.addClause(clause);
                clause.clear();
                clause.push((-2115448388));
                this.solver.addClause(clause);
                this.solver.isSatisfiable();
                this.solver.unsatExplanation();
                org.junit.Assert.fail("testlitNum13 should have thrown IllegalArgumentException");
            }
            org.junit.Assert.fail("testlitNum13_failAssert7litNum486 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testlitNum12_failAssert6_add577_failAssert106() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                IVecInt clause = new VecInt();
                clause.push((-1)).push(2);
                clause.push((-1)).push(2);
                this.solver.addClause(clause);
                clause.clear();
                clause.push(2);
                this.solver.addClause(clause);
                clause.clear();
                clause.push((-2));
                this.solver.addClause(clause);
                this.solver.isSatisfiable();
                this.solver.unsatExplanation();
                org.junit.Assert.fail("testlitNum12 should have thrown ContradictionException");
            }
            org.junit.Assert.fail("testlitNum12_failAssert6_add577 should have thrown ContradictionException");
        } catch (ContradictionException expected) {
            Assert.assertEquals("Creating Empty clause ?", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testlitNum4_failAssert2litNum131_failAssert120() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                IVecInt clause = new VecInt();
                clause.push((-(Integer.MIN_VALUE))).push(-1447384179);
                this.solver.addClause(clause);
                clause.clear();
                clause.push(1);
                this.solver.addClause(clause);
                clause.clear();
                clause.push((-2));
                this.solver.addClause(clause);
                this.solver.isSatisfiable();
                this.solver.unsatExplanation();
                org.junit.Assert.fail("testlitNum4 should have thrown ArrayIndexOutOfBoundsException");
            }
            org.junit.Assert.fail("testlitNum4_failAssert2litNum131 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-2147483648", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testlitNum14_failAssert8_add224_failAssert149() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                IVecInt clause = new VecInt();
                clause.push((-1)).push(2);
                clause.push((-1)).push(2);
                this.solver.addClause(clause);
                clause.clear();
                clause.push(Integer.MAX_VALUE);
                this.solver.addClause(clause);
                clause.clear();
                clause.push((-2));
                this.solver.addClause(clause);
                this.solver.isSatisfiable();
                this.solver.unsatExplanation();
                org.junit.Assert.fail("testlitNum14 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testlitNum14_failAssert8_add224 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testlitNum12_failAssert6_add590_failAssert151() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                IVecInt clause = new VecInt();
                clause.push((-1)).push(2);
                this.solver.addClause(clause);
                clause.clear();
                clause.push(2);
                this.solver.addClause(clause);
                this.solver.addClause(clause);
                clause.clear();
                clause.push((-2));
                this.solver.addClause(clause);
                this.solver.isSatisfiable();
                this.solver.unsatExplanation();
                org.junit.Assert.fail("testlitNum12 should have thrown ContradictionException");
            }
            org.junit.Assert.fail("testlitNum12_failAssert6_add590 should have thrown ContradictionException");
        } catch (ContradictionException expected) {
            Assert.assertEquals("Creating Empty clause ?", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testlitNum12_failAssert6_add582_failAssert152() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                IVecInt clause = new VecInt();
                clause.push((-1)).push(2);
                this.solver.addClause(clause);
                this.solver.addClause(clause);
                clause.clear();
                clause.push(2);
                this.solver.addClause(clause);
                clause.clear();
                clause.push((-2));
                this.solver.addClause(clause);
                this.solver.isSatisfiable();
                this.solver.unsatExplanation();
                org.junit.Assert.fail("testlitNum12 should have thrown ContradictionException");
            }
            org.junit.Assert.fail("testlitNum12_failAssert6_add582 should have thrown ContradictionException");
        } catch (ContradictionException expected) {
            Assert.assertEquals("Creating Empty clause ?", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testlitNum19_failAssert11_add407_failAssert156() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                IVecInt clause = new VecInt();
                clause.push((-1)).push(2);
                clause.push((-1)).push(2);
                this.solver.addClause(clause);
                clause.clear();
                clause.push(1);
                this.solver.addClause(clause);
                clause.clear();
                clause.push((-(Integer.MAX_VALUE)));
                this.solver.addClause(clause);
                this.solver.isSatisfiable();
                this.solver.unsatExplanation();
                org.junit.Assert.fail("testlitNum19 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testlitNum19_failAssert11_add407 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test_add25_add653_add2101() throws Exception, ContradictionException, TimeoutException {
        IVecInt clause = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause)).toString());
        Assert.assertTrue(((VecInt) (clause)).isEmpty());
        IVecInt o_test_add25__3 = clause.push((-1)).push(2);
        Assert.assertEquals("-1,2", ((VecInt) (o_test_add25__3)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_test_add25__3)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_add25__3)).isEmpty());
        IConstr o_test_add25__6 = this.solver.addClause(clause);
        int[] array_1190812652 = new int[]{3,4};
        	int[] array_819857104 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__6).getLits();
        	for(int ii = 0; ii <array_1190812652.length; ii++) {
        		org.junit.Assert.assertEquals(array_1190812652[ii], array_819857104[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_test_add25__6)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_test_add25__6)).getActivity())), 0.1);
        Assert.assertEquals("-1[?] 2[?]", ((OriginalBinaryClause) (o_test_add25__6)).toString());
        Assert.assertEquals(3, ((int) (((OriginalBinaryClause) (o_test_add25__6)).hashCode())));
        int[] array_7720934 = new int[]{3,4};
        	int[] array_1873932885 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__6).getLits();
        	for(int ii = 0; ii <array_7720934.length; ii++) {
        		org.junit.Assert.assertEquals(array_7720934[ii], array_1873932885[ii]);
        	};
        int[] array_1724035434 = new int[]{3,4};
        	int[] array_537650639 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__6).getLits();
        	for(int ii = 0; ii <array_1724035434.length; ii++) {
        		org.junit.Assert.assertEquals(array_1724035434[ii], array_537650639[ii]);
        	};
        IConstr o_test_add25_add653__13 = this.solver.addClause(clause);
        int[] array_1801322893 = new int[]{3,4};
        	int[] array_944888386 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25_add653__13).getLits();
        	for(int ii = 0; ii <array_1801322893.length; ii++) {
        		org.junit.Assert.assertEquals(array_1801322893[ii], array_944888386[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_test_add25_add653__13)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_test_add25_add653__13)).getActivity())), 0.1);
        Assert.assertEquals("-1[?] 2[?]", ((OriginalBinaryClause) (o_test_add25_add653__13)).toString());
        Assert.assertEquals(3, ((int) (((OriginalBinaryClause) (o_test_add25_add653__13)).hashCode())));
        int[] array_805440592 = new int[]{3,4};
        	int[] array_416946738 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25_add653__13).getLits();
        	for(int ii = 0; ii <array_805440592.length; ii++) {
        		org.junit.Assert.assertEquals(array_805440592[ii], array_416946738[ii]);
        	};
        ((OriginalBinaryClause) (o_test_add25_add653__13)).isSatisfied();
        IConstr o_test_add25__7 = this.solver.addClause(clause);
        int[] array_154786914 = new int[]{3,4};
        	int[] array_1692672314 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__7).getLits();
        	for(int ii = 0; ii <array_154786914.length; ii++) {
        		org.junit.Assert.assertEquals(array_154786914[ii], array_1692672314[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_test_add25__7)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_test_add25__7)).getActivity())), 0.1);
        Assert.assertEquals("-1[?] 2[?]", ((OriginalBinaryClause) (o_test_add25__7)).toString());
        Assert.assertEquals(3, ((int) (((OriginalBinaryClause) (o_test_add25__7)).hashCode())));
        int[] array_1242534560 = new int[]{3,4};
        	int[] array_1661711585 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__7).getLits();
        	for(int ii = 0; ii <array_1242534560.length; ii++) {
        		org.junit.Assert.assertEquals(array_1242534560[ii], array_1661711585[ii]);
        	};
        int[] array_1506081513 = new int[]{3,4};
        	int[] array_945850769 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__7).getLits();
        	for(int ii = 0; ii <array_1506081513.length; ii++) {
        		org.junit.Assert.assertEquals(array_1506081513[ii], array_945850769[ii]);
        	};
        clause.clear();
        IVecInt o_test_add25__9 = clause.push(1);
        Assert.assertEquals("1", ((VecInt) (o_test_add25__9)).toString());
        Assert.assertEquals(1, ((int) (((VecInt) (o_test_add25__9)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_add25__9)).isEmpty());
        IConstr o_test_add25__10 = this.solver.addClause(clause);
        Assert.assertTrue(((UnitClause) (o_test_add25__10)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_test_add25__10)).getActivity())), 0.1);
        Assert.assertEquals("1", ((UnitClause) (o_test_add25__10)).toString());
        clause.clear();
        IVecInt o_test_add25__12 = clause.push((-2));
        Assert.assertEquals("-2", ((VecInt) (o_test_add25__12)).toString());
        Assert.assertEquals(-2, ((int) (((VecInt) (o_test_add25__12)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_add25__12)).isEmpty());
        IConstr o_test_add25__14 = this.solver.addClause(clause);
        Assert.assertTrue(((UnitClause) (o_test_add25__14)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_test_add25__14)).getActivity())), 0.1);
        Assert.assertEquals("-2", ((UnitClause) (o_test_add25__14)).toString());
        this.solver.isSatisfiable();
        this.solver.unsatExplanation();
    }

    @Test(timeout = 30000)
    public void test_add25_add653_add2088() throws Exception, ContradictionException, TimeoutException {
        IVecInt clause = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause)).toString());
        Assert.assertTrue(((VecInt) (clause)).isEmpty());
        ((VecInt) (clause)).toString();
        IVecInt o_test_add25__3 = clause.push((-1)).push(2);
        Assert.assertEquals("-1,2", ((VecInt) (o_test_add25__3)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_test_add25__3)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_add25__3)).isEmpty());
        IConstr o_test_add25__6 = this.solver.addClause(clause);
        int[] array_83770211 = new int[]{3,4};
        	int[] array_2144419218 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__6).getLits();
        	for(int ii = 0; ii <array_83770211.length; ii++) {
        		org.junit.Assert.assertEquals(array_83770211[ii], array_2144419218[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_test_add25__6)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_test_add25__6)).getActivity())), 0.1);
        Assert.assertEquals("-1[?] 2[?]", ((OriginalBinaryClause) (o_test_add25__6)).toString());
        Assert.assertEquals(3, ((int) (((OriginalBinaryClause) (o_test_add25__6)).hashCode())));
        int[] array_7720934 = new int[]{3,4};
        	int[] array_1873932885 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__6).getLits();
        	for(int ii = 0; ii <array_7720934.length; ii++) {
        		org.junit.Assert.assertEquals(array_7720934[ii], array_1873932885[ii]);
        	};
        int[] array_1724035434 = new int[]{3,4};
        	int[] array_537650639 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__6).getLits();
        	for(int ii = 0; ii <array_1724035434.length; ii++) {
        		org.junit.Assert.assertEquals(array_1724035434[ii], array_537650639[ii]);
        	};
        IConstr o_test_add25_add653__13 = this.solver.addClause(clause);
        int[] array_1597065229 = new int[]{3,4};
        	int[] array_1256647754 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25_add653__13).getLits();
        	for(int ii = 0; ii <array_1597065229.length; ii++) {
        		org.junit.Assert.assertEquals(array_1597065229[ii], array_1256647754[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_test_add25_add653__13)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_test_add25_add653__13)).getActivity())), 0.1);
        Assert.assertEquals("-1[?] 2[?]", ((OriginalBinaryClause) (o_test_add25_add653__13)).toString());
        Assert.assertEquals(3, ((int) (((OriginalBinaryClause) (o_test_add25_add653__13)).hashCode())));
        int[] array_805440592 = new int[]{3,4};
        	int[] array_416946738 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25_add653__13).getLits();
        	for(int ii = 0; ii <array_805440592.length; ii++) {
        		org.junit.Assert.assertEquals(array_805440592[ii], array_416946738[ii]);
        	};
        IConstr o_test_add25__7 = this.solver.addClause(clause);
        int[] array_1329671364 = new int[]{3,4};
        	int[] array_1739629334 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__7).getLits();
        	for(int ii = 0; ii <array_1329671364.length; ii++) {
        		org.junit.Assert.assertEquals(array_1329671364[ii], array_1739629334[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_test_add25__7)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_test_add25__7)).getActivity())), 0.1);
        Assert.assertEquals("-1[?] 2[?]", ((OriginalBinaryClause) (o_test_add25__7)).toString());
        Assert.assertEquals(3, ((int) (((OriginalBinaryClause) (o_test_add25__7)).hashCode())));
        int[] array_1242534560 = new int[]{3,4};
        	int[] array_1661711585 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__7).getLits();
        	for(int ii = 0; ii <array_1242534560.length; ii++) {
        		org.junit.Assert.assertEquals(array_1242534560[ii], array_1661711585[ii]);
        	};
        int[] array_1506081513 = new int[]{3,4};
        	int[] array_945850769 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__7).getLits();
        	for(int ii = 0; ii <array_1506081513.length; ii++) {
        		org.junit.Assert.assertEquals(array_1506081513[ii], array_945850769[ii]);
        	};
        clause.clear();
        IVecInt o_test_add25__9 = clause.push(1);
        Assert.assertEquals("1", ((VecInt) (o_test_add25__9)).toString());
        Assert.assertEquals(1, ((int) (((VecInt) (o_test_add25__9)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_add25__9)).isEmpty());
        IConstr o_test_add25__10 = this.solver.addClause(clause);
        Assert.assertTrue(((UnitClause) (o_test_add25__10)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_test_add25__10)).getActivity())), 0.1);
        Assert.assertEquals("1", ((UnitClause) (o_test_add25__10)).toString());
        clause.clear();
        IVecInt o_test_add25__12 = clause.push((-2));
        Assert.assertEquals("-2", ((VecInt) (o_test_add25__12)).toString());
        Assert.assertEquals(-2, ((int) (((VecInt) (o_test_add25__12)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_add25__12)).isEmpty());
        IConstr o_test_add25__14 = this.solver.addClause(clause);
        Assert.assertTrue(((UnitClause) (o_test_add25__14)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_test_add25__14)).getActivity())), 0.1);
        Assert.assertEquals("-2", ((UnitClause) (o_test_add25__14)).toString());
        this.solver.isSatisfiable();
        this.solver.unsatExplanation();
    }

    @Test(timeout = 30000)
    public void test_add25_add653_add2115() throws Exception, ContradictionException, TimeoutException {
        IVecInt clause = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause)).toString());
        Assert.assertTrue(((VecInt) (clause)).isEmpty());
        IVecInt o_test_add25__3 = clause.push((-1)).push(2);
        Assert.assertEquals("-1,2", ((VecInt) (o_test_add25__3)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_test_add25__3)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_add25__3)).isEmpty());
        IConstr o_test_add25__6 = this.solver.addClause(clause);
        int[] array_1258082617 = new int[]{3,4};
        	int[] array_1242252468 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__6).getLits();
        	for(int ii = 0; ii <array_1258082617.length; ii++) {
        		org.junit.Assert.assertEquals(array_1258082617[ii], array_1242252468[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_test_add25__6)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_test_add25__6)).getActivity())), 0.1);
        Assert.assertEquals("-1[?] 2[?]", ((OriginalBinaryClause) (o_test_add25__6)).toString());
        Assert.assertEquals(3, ((int) (((OriginalBinaryClause) (o_test_add25__6)).hashCode())));
        int[] array_7720934 = new int[]{3,4};
        	int[] array_1873932885 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__6).getLits();
        	for(int ii = 0; ii <array_7720934.length; ii++) {
        		org.junit.Assert.assertEquals(array_7720934[ii], array_1873932885[ii]);
        	};
        int[] array_1724035434 = new int[]{3,4};
        	int[] array_537650639 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__6).getLits();
        	for(int ii = 0; ii <array_1724035434.length; ii++) {
        		org.junit.Assert.assertEquals(array_1724035434[ii], array_537650639[ii]);
        	};
        IConstr o_test_add25_add653__13 = this.solver.addClause(clause);
        int[] array_2088512020 = new int[]{3,4};
        	int[] array_49303417 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25_add653__13).getLits();
        	for(int ii = 0; ii <array_2088512020.length; ii++) {
        		org.junit.Assert.assertEquals(array_2088512020[ii], array_49303417[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_test_add25_add653__13)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_test_add25_add653__13)).getActivity())), 0.1);
        Assert.assertEquals("-1[?] 2[?]", ((OriginalBinaryClause) (o_test_add25_add653__13)).toString());
        Assert.assertEquals(3, ((int) (((OriginalBinaryClause) (o_test_add25_add653__13)).hashCode())));
        int[] array_805440592 = new int[]{3,4};
        	int[] array_416946738 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25_add653__13).getLits();
        	for(int ii = 0; ii <array_805440592.length; ii++) {
        		org.junit.Assert.assertEquals(array_805440592[ii], array_416946738[ii]);
        	};
        IConstr o_test_add25__7 = this.solver.addClause(clause);
        int[] array_353067316 = new int[]{3,4};
        	int[] array_1099425423 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__7).getLits();
        	for(int ii = 0; ii <array_353067316.length; ii++) {
        		org.junit.Assert.assertEquals(array_353067316[ii], array_1099425423[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_test_add25__7)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_test_add25__7)).getActivity())), 0.1);
        Assert.assertEquals("-1[?] 2[?]", ((OriginalBinaryClause) (o_test_add25__7)).toString());
        Assert.assertEquals(3, ((int) (((OriginalBinaryClause) (o_test_add25__7)).hashCode())));
        int[] array_1242534560 = new int[]{3,4};
        	int[] array_1661711585 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__7).getLits();
        	for(int ii = 0; ii <array_1242534560.length; ii++) {
        		org.junit.Assert.assertEquals(array_1242534560[ii], array_1661711585[ii]);
        	};
        int[] array_1506081513 = new int[]{3,4};
        	int[] array_945850769 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__7).getLits();
        	for(int ii = 0; ii <array_1506081513.length; ii++) {
        		org.junit.Assert.assertEquals(array_1506081513[ii], array_945850769[ii]);
        	};
        clause.clear();
        IVecInt o_test_add25__9 = clause.push(1);
        Assert.assertEquals("1", ((VecInt) (o_test_add25__9)).toString());
        Assert.assertEquals(1, ((int) (((VecInt) (o_test_add25__9)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_add25__9)).isEmpty());
        IConstr o_test_add25_add653_add2115__31 = this.solver.addClause(clause);
        Assert.assertTrue(((UnitClause) (o_test_add25_add653_add2115__31)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_test_add25_add653_add2115__31)).getActivity())), 0.1);
        Assert.assertEquals("1", ((UnitClause) (o_test_add25_add653_add2115__31)).toString());
        IConstr o_test_add25__10 = this.solver.addClause(clause);
        clause.clear();
        IVecInt o_test_add25__12 = clause.push((-2));
        IConstr o_test_add25__14 = this.solver.addClause(clause);
        this.solver.isSatisfiable();
        this.solver.unsatExplanation();
    }

    @Test(timeout = 30000)
    public void test_add25_add653_add2128() throws Exception, ContradictionException, TimeoutException {
        IVecInt clause = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause)).toString());
        Assert.assertTrue(((VecInt) (clause)).isEmpty());
        IVecInt o_test_add25__3 = clause.push((-1)).push(2);
        Assert.assertEquals("-1,2", ((VecInt) (o_test_add25__3)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_test_add25__3)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_add25__3)).isEmpty());
        IConstr o_test_add25__6 = this.solver.addClause(clause);
        int[] array_968610107 = new int[]{3,4};
        	int[] array_1016071641 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__6).getLits();
        	for(int ii = 0; ii <array_968610107.length; ii++) {
        		org.junit.Assert.assertEquals(array_968610107[ii], array_1016071641[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_test_add25__6)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_test_add25__6)).getActivity())), 0.1);
        Assert.assertEquals("-1[?] 2[?]", ((OriginalBinaryClause) (o_test_add25__6)).toString());
        Assert.assertEquals(3, ((int) (((OriginalBinaryClause) (o_test_add25__6)).hashCode())));
        int[] array_7720934 = new int[]{3,4};
        	int[] array_1873932885 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__6).getLits();
        	for(int ii = 0; ii <array_7720934.length; ii++) {
        		org.junit.Assert.assertEquals(array_7720934[ii], array_1873932885[ii]);
        	};
        int[] array_1724035434 = new int[]{3,4};
        	int[] array_537650639 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__6).getLits();
        	for(int ii = 0; ii <array_1724035434.length; ii++) {
        		org.junit.Assert.assertEquals(array_1724035434[ii], array_537650639[ii]);
        	};
        IConstr o_test_add25_add653__13 = this.solver.addClause(clause);
        int[] array_1699220368 = new int[]{3,4};
        	int[] array_896145006 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25_add653__13).getLits();
        	for(int ii = 0; ii <array_1699220368.length; ii++) {
        		org.junit.Assert.assertEquals(array_1699220368[ii], array_896145006[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_test_add25_add653__13)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_test_add25_add653__13)).getActivity())), 0.1);
        Assert.assertEquals("-1[?] 2[?]", ((OriginalBinaryClause) (o_test_add25_add653__13)).toString());
        Assert.assertEquals(3, ((int) (((OriginalBinaryClause) (o_test_add25_add653__13)).hashCode())));
        int[] array_805440592 = new int[]{3,4};
        	int[] array_416946738 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25_add653__13).getLits();
        	for(int ii = 0; ii <array_805440592.length; ii++) {
        		org.junit.Assert.assertEquals(array_805440592[ii], array_416946738[ii]);
        	};
        IConstr o_test_add25__7 = this.solver.addClause(clause);
        int[] array_960841835 = new int[]{3,4};
        	int[] array_313767094 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__7).getLits();
        	for(int ii = 0; ii <array_960841835.length; ii++) {
        		org.junit.Assert.assertEquals(array_960841835[ii], array_313767094[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_test_add25__7)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_test_add25__7)).getActivity())), 0.1);
        Assert.assertEquals("-1[?] 2[?]", ((OriginalBinaryClause) (o_test_add25__7)).toString());
        Assert.assertEquals(3, ((int) (((OriginalBinaryClause) (o_test_add25__7)).hashCode())));
        int[] array_1242534560 = new int[]{3,4};
        	int[] array_1661711585 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__7).getLits();
        	for(int ii = 0; ii <array_1242534560.length; ii++) {
        		org.junit.Assert.assertEquals(array_1242534560[ii], array_1661711585[ii]);
        	};
        int[] array_1506081513 = new int[]{3,4};
        	int[] array_945850769 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__7).getLits();
        	for(int ii = 0; ii <array_1506081513.length; ii++) {
        		org.junit.Assert.assertEquals(array_1506081513[ii], array_945850769[ii]);
        	};
        clause.clear();
        IVecInt o_test_add25__9 = clause.push(1);
        Assert.assertEquals("1", ((VecInt) (o_test_add25__9)).toString());
        Assert.assertEquals(1, ((int) (((VecInt) (o_test_add25__9)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_add25__9)).isEmpty());
        IConstr o_test_add25__10 = this.solver.addClause(clause);
        Assert.assertTrue(((UnitClause) (o_test_add25__10)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_test_add25__10)).getActivity())), 0.1);
        Assert.assertEquals("1", ((UnitClause) (o_test_add25__10)).toString());
        clause.clear();
        IVecInt o_test_add25__12 = clause.push((-2));
        Assert.assertEquals("-2", ((VecInt) (o_test_add25__12)).toString());
        Assert.assertEquals(-2, ((int) (((VecInt) (o_test_add25__12)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_add25__12)).isEmpty());
        IConstr o_test_add25__14 = this.solver.addClause(clause);
        Assert.assertTrue(((UnitClause) (o_test_add25__14)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_test_add25__14)).getActivity())), 0.1);
        Assert.assertEquals("-2", ((UnitClause) (o_test_add25__14)).toString());
        this.solver.isSatisfiable();
        this.solver.isSatisfiable();
        this.solver.unsatExplanation();
    }

    @Test(timeout = 30000)
    public void test_add25_add653_add2090() throws Exception, ContradictionException, TimeoutException {
        IVecInt clause = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause)).toString());
        Assert.assertTrue(((VecInt) (clause)).isEmpty());
        IVecInt o_test_add25_add653_add2090__3 = clause.push((-1)).push(2);
        Assert.assertEquals("-1,2", ((VecInt) (o_test_add25_add653_add2090__3)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_test_add25_add653_add2090__3)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_add25_add653_add2090__3)).isEmpty());
        IVecInt o_test_add25__3 = clause.push((-1)).push(2);
        Assert.assertEquals("-1,2,-1,2", ((VecInt) (o_test_add25__3)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_test_add25__3)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_add25__3)).isEmpty());
        IConstr o_test_add25__6 = this.solver.addClause(clause);
        int[] array_535912381 = new int[]{3,4};
        	int[] array_1861261997 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__6).getLits();
        	for(int ii = 0; ii <array_535912381.length; ii++) {
        		org.junit.Assert.assertEquals(array_535912381[ii], array_1861261997[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_test_add25__6)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_test_add25__6)).getActivity())), 0.1);
        Assert.assertEquals("-1[?] 2[?]", ((OriginalBinaryClause) (o_test_add25__6)).toString());
        Assert.assertEquals(3, ((int) (((OriginalBinaryClause) (o_test_add25__6)).hashCode())));
        int[] array_7720934 = new int[]{3,4};
        	int[] array_1873932885 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__6).getLits();
        	for(int ii = 0; ii <array_7720934.length; ii++) {
        		org.junit.Assert.assertEquals(array_7720934[ii], array_1873932885[ii]);
        	};
        int[] array_1724035434 = new int[]{3,4};
        	int[] array_537650639 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__6).getLits();
        	for(int ii = 0; ii <array_1724035434.length; ii++) {
        		org.junit.Assert.assertEquals(array_1724035434[ii], array_537650639[ii]);
        	};
        IConstr o_test_add25_add653__13 = this.solver.addClause(clause);
        int[] array_1261361721 = new int[]{3,4};
        	int[] array_1611585272 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25_add653__13).getLits();
        	for(int ii = 0; ii <array_1261361721.length; ii++) {
        		org.junit.Assert.assertEquals(array_1261361721[ii], array_1611585272[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_test_add25_add653__13)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_test_add25_add653__13)).getActivity())), 0.1);
        Assert.assertEquals("-1[?] 2[?]", ((OriginalBinaryClause) (o_test_add25_add653__13)).toString());
        Assert.assertEquals(3, ((int) (((OriginalBinaryClause) (o_test_add25_add653__13)).hashCode())));
        int[] array_805440592 = new int[]{3,4};
        	int[] array_416946738 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25_add653__13).getLits();
        	for(int ii = 0; ii <array_805440592.length; ii++) {
        		org.junit.Assert.assertEquals(array_805440592[ii], array_416946738[ii]);
        	};
        IConstr o_test_add25__7 = this.solver.addClause(clause);
        int[] array_1266616177 = new int[]{3,4};
        	int[] array_1036150792 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__7).getLits();
        	for(int ii = 0; ii <array_1266616177.length; ii++) {
        		org.junit.Assert.assertEquals(array_1266616177[ii], array_1036150792[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_test_add25__7)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_test_add25__7)).getActivity())), 0.1);
        Assert.assertEquals("-1[?] 2[?]", ((OriginalBinaryClause) (o_test_add25__7)).toString());
        Assert.assertEquals(3, ((int) (((OriginalBinaryClause) (o_test_add25__7)).hashCode())));
        int[] array_1242534560 = new int[]{3,4};
        	int[] array_1661711585 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__7).getLits();
        	for(int ii = 0; ii <array_1242534560.length; ii++) {
        		org.junit.Assert.assertEquals(array_1242534560[ii], array_1661711585[ii]);
        	};
        int[] array_1506081513 = new int[]{3,4};
        	int[] array_945850769 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__7).getLits();
        	for(int ii = 0; ii <array_1506081513.length; ii++) {
        		org.junit.Assert.assertEquals(array_1506081513[ii], array_945850769[ii]);
        	};
        clause.clear();
        IVecInt o_test_add25__9 = clause.push(1);
        Assert.assertEquals("1", ((VecInt) (o_test_add25__9)).toString());
        Assert.assertEquals(1, ((int) (((VecInt) (o_test_add25__9)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_add25__9)).isEmpty());
        IConstr o_test_add25__10 = this.solver.addClause(clause);
        Assert.assertTrue(((UnitClause) (o_test_add25__10)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_test_add25__10)).getActivity())), 0.1);
        Assert.assertEquals("1", ((UnitClause) (o_test_add25__10)).toString());
        clause.clear();
        IVecInt o_test_add25__12 = clause.push((-2));
        Assert.assertEquals("-2", ((VecInt) (o_test_add25__12)).toString());
        Assert.assertEquals(-2, ((int) (((VecInt) (o_test_add25__12)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_add25__12)).isEmpty());
        IConstr o_test_add25__14 = this.solver.addClause(clause);
        Assert.assertTrue(((UnitClause) (o_test_add25__14)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_test_add25__14)).getActivity())), 0.1);
        Assert.assertEquals("-2", ((UnitClause) (o_test_add25__14)).toString());
        this.solver.isSatisfiable();
        this.solver.unsatExplanation();
    }

    @Test(timeout = 30000)
    public void test_add25_add653litNum2053() throws Exception, ContradictionException, TimeoutException {
        IVecInt clause = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause)).toString());
        Assert.assertTrue(((VecInt) (clause)).isEmpty());
        IVecInt o_test_add25__3 = clause.push((-1)).push(2);
        Assert.assertEquals("-1,2", ((VecInt) (o_test_add25__3)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_test_add25__3)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_add25__3)).isEmpty());
        IConstr o_test_add25__6 = this.solver.addClause(clause);
        int[] array_1174234043 = new int[]{3,4};
        	int[] array_1326030862 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__6).getLits();
        	for(int ii = 0; ii <array_1174234043.length; ii++) {
        		org.junit.Assert.assertEquals(array_1174234043[ii], array_1326030862[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_test_add25__6)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_test_add25__6)).getActivity())), 0.1);
        Assert.assertEquals("-1[?] 2[?]", ((OriginalBinaryClause) (o_test_add25__6)).toString());
        Assert.assertEquals(3, ((int) (((OriginalBinaryClause) (o_test_add25__6)).hashCode())));
        int[] array_7720934 = new int[]{3,4};
        	int[] array_1873932885 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__6).getLits();
        	for(int ii = 0; ii <array_7720934.length; ii++) {
        		org.junit.Assert.assertEquals(array_7720934[ii], array_1873932885[ii]);
        	};
        int[] array_1724035434 = new int[]{3,4};
        	int[] array_537650639 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__6).getLits();
        	for(int ii = 0; ii <array_1724035434.length; ii++) {
        		org.junit.Assert.assertEquals(array_1724035434[ii], array_537650639[ii]);
        	};
        IConstr o_test_add25_add653__13 = this.solver.addClause(clause);
        int[] array_489267895 = new int[]{3,4};
        	int[] array_1465254737 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25_add653__13).getLits();
        	for(int ii = 0; ii <array_489267895.length; ii++) {
        		org.junit.Assert.assertEquals(array_489267895[ii], array_1465254737[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_test_add25_add653__13)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_test_add25_add653__13)).getActivity())), 0.1);
        Assert.assertEquals("-1[?] 2[?]", ((OriginalBinaryClause) (o_test_add25_add653__13)).toString());
        Assert.assertEquals(3, ((int) (((OriginalBinaryClause) (o_test_add25_add653__13)).hashCode())));
        int[] array_805440592 = new int[]{3,4};
        	int[] array_416946738 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25_add653__13).getLits();
        	for(int ii = 0; ii <array_805440592.length; ii++) {
        		org.junit.Assert.assertEquals(array_805440592[ii], array_416946738[ii]);
        	};
        IConstr o_test_add25__7 = this.solver.addClause(clause);
        int[] array_233199218 = new int[]{3,4};
        	int[] array_1697900587 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__7).getLits();
        	for(int ii = 0; ii <array_233199218.length; ii++) {
        		org.junit.Assert.assertEquals(array_233199218[ii], array_1697900587[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_test_add25__7)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_test_add25__7)).getActivity())), 0.1);
        Assert.assertEquals("-1[?] 2[?]", ((OriginalBinaryClause) (o_test_add25__7)).toString());
        Assert.assertEquals(3, ((int) (((OriginalBinaryClause) (o_test_add25__7)).hashCode())));
        int[] array_1242534560 = new int[]{3,4};
        	int[] array_1661711585 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__7).getLits();
        	for(int ii = 0; ii <array_1242534560.length; ii++) {
        		org.junit.Assert.assertEquals(array_1242534560[ii], array_1661711585[ii]);
        	};
        int[] array_1506081513 = new int[]{3,4};
        	int[] array_945850769 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__7).getLits();
        	for(int ii = 0; ii <array_1506081513.length; ii++) {
        		org.junit.Assert.assertEquals(array_1506081513[ii], array_945850769[ii]);
        	};
        clause.clear();
        IVecInt o_test_add25__9 = clause.push(1);
        Assert.assertEquals("1", ((VecInt) (o_test_add25__9)).toString());
        Assert.assertEquals(1, ((int) (((VecInt) (o_test_add25__9)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_add25__9)).isEmpty());
        IConstr o_test_add25__10 = this.solver.addClause(clause);
        Assert.assertTrue(((UnitClause) (o_test_add25__10)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_test_add25__10)).getActivity())), 0.1);
        Assert.assertEquals("1", ((UnitClause) (o_test_add25__10)).toString());
        clause.clear();
        IVecInt o_test_add25__12 = clause.push((-3));
        Assert.assertEquals("-3", ((VecInt) (o_test_add25__12)).toString());
        Assert.assertEquals(-3, ((int) (((VecInt) (o_test_add25__12)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_add25__12)).isEmpty());
        IConstr o_test_add25__14 = this.solver.addClause(clause);
        Assert.assertTrue(((UnitClause) (o_test_add25__14)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_test_add25__14)).getActivity())), 0.1);
        Assert.assertEquals("-3", ((UnitClause) (o_test_add25__14)).toString());
        this.solver.isSatisfiable();
        this.solver.unsatExplanation();
    }

    @Test(timeout = 30000)
    public void test_add25_add623_add1947() throws Exception, ContradictionException, TimeoutException {
        IVecInt clause = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause)).toString());
        Assert.assertTrue(((VecInt) (clause)).isEmpty());
        IVecInt o_test_add25_add623__3 = clause.push((-1)).push(2);
        Assert.assertEquals("-1,2", ((VecInt) (o_test_add25_add623__3)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_test_add25_add623__3)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_add25_add623__3)).isEmpty());
        IVecInt o_test_add25__3 = clause.push((-1)).push(2);
        Assert.assertEquals("-1,2,-1,2", ((VecInt) (o_test_add25__3)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_test_add25__3)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_add25__3)).isEmpty());
        IConstr o_test_add25__6 = this.solver.addClause(clause);
        int[] array_2117232166 = new int[]{3,4};
        	int[] array_1829447316 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__6).getLits();
        	for(int ii = 0; ii <array_2117232166.length; ii++) {
        		org.junit.Assert.assertEquals(array_2117232166[ii], array_1829447316[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_test_add25__6)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_test_add25__6)).getActivity())), 0.1);
        Assert.assertEquals("-1[?] 2[?]", ((OriginalBinaryClause) (o_test_add25__6)).toString());
        Assert.assertEquals(3, ((int) (((OriginalBinaryClause) (o_test_add25__6)).hashCode())));
        int[] array_575868324 = new int[]{3,4};
        	int[] array_1514791894 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__6).getLits();
        	for(int ii = 0; ii <array_575868324.length; ii++) {
        		org.junit.Assert.assertEquals(array_575868324[ii], array_1514791894[ii]);
        	};
        ((OriginalBinaryClause) (o_test_add25__6)).isSatisfied();
        int[] array_1724035434 = new int[]{3,4};
        	int[] array_537650639 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__6).getLits();
        	for(int ii = 0; ii <array_1724035434.length; ii++) {
        		org.junit.Assert.assertEquals(array_1724035434[ii], array_537650639[ii]);
        	};
        IConstr o_test_add25__7 = this.solver.addClause(clause);
        int[] array_1749178534 = new int[]{3,4};
        	int[] array_456913371 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__7).getLits();
        	for(int ii = 0; ii <array_1749178534.length; ii++) {
        		org.junit.Assert.assertEquals(array_1749178534[ii], array_456913371[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_test_add25__7)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_test_add25__7)).getActivity())), 0.1);
        Assert.assertEquals("-1[?] 2[?]", ((OriginalBinaryClause) (o_test_add25__7)).toString());
        Assert.assertEquals(3, ((int) (((OriginalBinaryClause) (o_test_add25__7)).hashCode())));
        int[] array_1467232237 = new int[]{3,4};
        	int[] array_975816113 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__7).getLits();
        	for(int ii = 0; ii <array_1467232237.length; ii++) {
        		org.junit.Assert.assertEquals(array_1467232237[ii], array_975816113[ii]);
        	};
        int[] array_1506081513 = new int[]{3,4};
        	int[] array_945850769 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__7).getLits();
        	for(int ii = 0; ii <array_1506081513.length; ii++) {
        		org.junit.Assert.assertEquals(array_1506081513[ii], array_945850769[ii]);
        	};
        clause.clear();
        IVecInt o_test_add25__9 = clause.push(1);
        Assert.assertEquals("1", ((VecInt) (o_test_add25__9)).toString());
        Assert.assertEquals(1, ((int) (((VecInt) (o_test_add25__9)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_add25__9)).isEmpty());
        IConstr o_test_add25__10 = this.solver.addClause(clause);
        Assert.assertTrue(((UnitClause) (o_test_add25__10)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_test_add25__10)).getActivity())), 0.1);
        Assert.assertEquals("1", ((UnitClause) (o_test_add25__10)).toString());
        clause.clear();
        IVecInt o_test_add25__12 = clause.push((-2));
        Assert.assertEquals("-2", ((VecInt) (o_test_add25__12)).toString());
        Assert.assertEquals(-2, ((int) (((VecInt) (o_test_add25__12)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_add25__12)).isEmpty());
        IConstr o_test_add25__14 = this.solver.addClause(clause);
        Assert.assertTrue(((UnitClause) (o_test_add25__14)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_test_add25__14)).getActivity())), 0.1);
        Assert.assertEquals("-2", ((UnitClause) (o_test_add25__14)).toString());
        this.solver.isSatisfiable();
        this.solver.unsatExplanation();
    }

    @Test(timeout = 30000)
    public void test_add25_add623_add2063() throws Exception, ContradictionException, TimeoutException {
        IVecInt clause = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause)).toString());
        Assert.assertTrue(((VecInt) (clause)).isEmpty());
        IVecInt o_test_add25_add623__3 = clause.push((-1)).push(2);
        Assert.assertEquals("-1,2", ((VecInt) (o_test_add25_add623__3)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_test_add25_add623__3)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_add25_add623__3)).isEmpty());
        IVecInt o_test_add25__3 = clause.push((-1)).push(2);
        Assert.assertEquals("-1,2,-1,2", ((VecInt) (o_test_add25__3)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_test_add25__3)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_add25__3)).isEmpty());
        IConstr o_test_add25__6 = this.solver.addClause(clause);
        int[] array_688492832 = new int[]{3,4};
        	int[] array_898331490 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__6).getLits();
        	for(int ii = 0; ii <array_688492832.length; ii++) {
        		org.junit.Assert.assertEquals(array_688492832[ii], array_898331490[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_test_add25__6)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_test_add25__6)).getActivity())), 0.1);
        Assert.assertEquals("-1[?] 2[?]", ((OriginalBinaryClause) (o_test_add25__6)).toString());
        Assert.assertEquals(3, ((int) (((OriginalBinaryClause) (o_test_add25__6)).hashCode())));
        int[] array_575868324 = new int[]{3,4};
        	int[] array_1514791894 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__6).getLits();
        	for(int ii = 0; ii <array_575868324.length; ii++) {
        		org.junit.Assert.assertEquals(array_575868324[ii], array_1514791894[ii]);
        	};
        int[] array_1724035434 = new int[]{3,4};
        	int[] array_537650639 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__6).getLits();
        	for(int ii = 0; ii <array_1724035434.length; ii++) {
        		org.junit.Assert.assertEquals(array_1724035434[ii], array_537650639[ii]);
        	};
        IConstr o_test_add25__7 = this.solver.addClause(clause);
        int[] array_1937459523 = new int[]{3,4};
        	int[] array_1478843575 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__7).getLits();
        	for(int ii = 0; ii <array_1937459523.length; ii++) {
        		org.junit.Assert.assertEquals(array_1937459523[ii], array_1478843575[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_test_add25__7)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_test_add25__7)).getActivity())), 0.1);
        Assert.assertEquals("-1[?] 2[?]", ((OriginalBinaryClause) (o_test_add25__7)).toString());
        Assert.assertEquals(3, ((int) (((OriginalBinaryClause) (o_test_add25__7)).hashCode())));
        int[] array_1467232237 = new int[]{3,4};
        	int[] array_975816113 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__7).getLits();
        	for(int ii = 0; ii <array_1467232237.length; ii++) {
        		org.junit.Assert.assertEquals(array_1467232237[ii], array_975816113[ii]);
        	};
        int[] array_1506081513 = new int[]{3,4};
        	int[] array_945850769 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__7).getLits();
        	for(int ii = 0; ii <array_1506081513.length; ii++) {
        		org.junit.Assert.assertEquals(array_1506081513[ii], array_945850769[ii]);
        	};
        clause.clear();
        IVecInt o_test_add25__9 = clause.push(1);
        Assert.assertEquals("1", ((VecInt) (o_test_add25__9)).toString());
        Assert.assertEquals(1, ((int) (((VecInt) (o_test_add25__9)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_add25__9)).isEmpty());
        IConstr o_test_add25__10 = this.solver.addClause(clause);
        Assert.assertTrue(((UnitClause) (o_test_add25__10)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_test_add25__10)).getActivity())), 0.1);
        Assert.assertEquals("1", ((UnitClause) (o_test_add25__10)).toString());
        clause.clear();
        IVecInt o_test_add25__12 = clause.push((-2));
        Assert.assertEquals("-2", ((VecInt) (o_test_add25__12)).toString());
        Assert.assertEquals(-2, ((int) (((VecInt) (o_test_add25__12)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_add25__12)).isEmpty());
        IConstr o_test_add25_add623_add2063__39 = this.solver.addClause(clause);
        Assert.assertTrue(((UnitClause) (o_test_add25_add623_add2063__39)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_test_add25_add623_add2063__39)).getActivity())), 0.1);
        Assert.assertEquals("-2", ((UnitClause) (o_test_add25_add623_add2063__39)).toString());
        IConstr o_test_add25__14 = this.solver.addClause(clause);
        this.solver.isSatisfiable();
        this.solver.unsatExplanation();
    }

    @Test(timeout = 30000)
    public void test_add25_add623_add2080() throws Exception, ContradictionException, TimeoutException {
        IVecInt clause = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause)).toString());
        Assert.assertTrue(((VecInt) (clause)).isEmpty());
        IVecInt o_test_add25_add623__3 = clause.push((-1)).push(2);
        Assert.assertEquals("-1,2", ((VecInt) (o_test_add25_add623__3)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_test_add25_add623__3)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_add25_add623__3)).isEmpty());
        IVecInt o_test_add25__3 = clause.push((-1)).push(2);
        Assert.assertEquals("-1,2,-1,2", ((VecInt) (o_test_add25__3)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_test_add25__3)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_add25__3)).isEmpty());
        IConstr o_test_add25__6 = this.solver.addClause(clause);
        int[] array_276699413 = new int[]{3,4};
        	int[] array_2056683114 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__6).getLits();
        	for(int ii = 0; ii <array_276699413.length; ii++) {
        		org.junit.Assert.assertEquals(array_276699413[ii], array_2056683114[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_test_add25__6)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_test_add25__6)).getActivity())), 0.1);
        Assert.assertEquals("-1[?] 2[?]", ((OriginalBinaryClause) (o_test_add25__6)).toString());
        Assert.assertEquals(3, ((int) (((OriginalBinaryClause) (o_test_add25__6)).hashCode())));
        int[] array_575868324 = new int[]{3,4};
        	int[] array_1514791894 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__6).getLits();
        	for(int ii = 0; ii <array_575868324.length; ii++) {
        		org.junit.Assert.assertEquals(array_575868324[ii], array_1514791894[ii]);
        	};
        int[] array_1724035434 = new int[]{3,4};
        	int[] array_537650639 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__6).getLits();
        	for(int ii = 0; ii <array_1724035434.length; ii++) {
        		org.junit.Assert.assertEquals(array_1724035434[ii], array_537650639[ii]);
        	};
        IConstr o_test_add25__7 = this.solver.addClause(clause);
        int[] array_360881070 = new int[]{3,4};
        	int[] array_1780684798 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__7).getLits();
        	for(int ii = 0; ii <array_360881070.length; ii++) {
        		org.junit.Assert.assertEquals(array_360881070[ii], array_1780684798[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_test_add25__7)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_test_add25__7)).getActivity())), 0.1);
        Assert.assertEquals("-1[?] 2[?]", ((OriginalBinaryClause) (o_test_add25__7)).toString());
        Assert.assertEquals(3, ((int) (((OriginalBinaryClause) (o_test_add25__7)).hashCode())));
        int[] array_1467232237 = new int[]{3,4};
        	int[] array_975816113 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__7).getLits();
        	for(int ii = 0; ii <array_1467232237.length; ii++) {
        		org.junit.Assert.assertEquals(array_1467232237[ii], array_975816113[ii]);
        	};
        int[] array_1506081513 = new int[]{3,4};
        	int[] array_945850769 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__7).getLits();
        	for(int ii = 0; ii <array_1506081513.length; ii++) {
        		org.junit.Assert.assertEquals(array_1506081513[ii], array_945850769[ii]);
        	};
        clause.clear();
        IVecInt o_test_add25__9 = clause.push(1);
        Assert.assertEquals("1", ((VecInt) (o_test_add25__9)).toString());
        Assert.assertEquals(1, ((int) (((VecInt) (o_test_add25__9)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_add25__9)).isEmpty());
        IConstr o_test_add25__10 = this.solver.addClause(clause);
        Assert.assertTrue(((UnitClause) (o_test_add25__10)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_test_add25__10)).getActivity())), 0.1);
        Assert.assertEquals("1", ((UnitClause) (o_test_add25__10)).toString());
        clause.clear();
        IVecInt o_test_add25__12 = clause.push((-2));
        Assert.assertEquals("-2", ((VecInt) (o_test_add25__12)).toString());
        Assert.assertEquals(-2, ((int) (((VecInt) (o_test_add25__12)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_add25__12)).isEmpty());
        IConstr o_test_add25__14 = this.solver.addClause(clause);
        Assert.assertTrue(((UnitClause) (o_test_add25__14)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_test_add25__14)).getActivity())), 0.1);
        Assert.assertEquals("-2", ((UnitClause) (o_test_add25__14)).toString());
        this.solver.isSatisfiable();
        this.solver.isSatisfiable();
        this.solver.unsatExplanation();
    }

    @Test(timeout = 30000)
    public void test_add25_add623_add1898() throws Exception, ContradictionException, TimeoutException {
        IVecInt clause = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause)).toString());
        Assert.assertTrue(((VecInt) (clause)).isEmpty());
        IVecInt o_test_add25_add623_add1898__3 = clause.push((-1)).push(2);
        Assert.assertEquals("-1,2", ((VecInt) (o_test_add25_add623_add1898__3)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_test_add25_add623_add1898__3)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_add25_add623_add1898__3)).isEmpty());
        IVecInt o_test_add25_add623__3 = clause.push((-1)).push(2);
        Assert.assertEquals("-1,2,-1,2", ((VecInt) (o_test_add25_add623__3)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_test_add25_add623__3)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_add25_add623__3)).isEmpty());
        IVecInt o_test_add25__3 = clause.push((-1)).push(2);
        Assert.assertEquals("-1,2,-1,2,-1,2", ((VecInt) (o_test_add25__3)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_test_add25__3)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_add25__3)).isEmpty());
        IConstr o_test_add25__6 = this.solver.addClause(clause);
        int[] array_1313385436 = new int[]{3,4};
        	int[] array_879751829 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__6).getLits();
        	for(int ii = 0; ii <array_1313385436.length; ii++) {
        		org.junit.Assert.assertEquals(array_1313385436[ii], array_879751829[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_test_add25__6)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_test_add25__6)).getActivity())), 0.1);
        Assert.assertEquals("-1[?] 2[?]", ((OriginalBinaryClause) (o_test_add25__6)).toString());
        Assert.assertEquals(3, ((int) (((OriginalBinaryClause) (o_test_add25__6)).hashCode())));
        int[] array_575868324 = new int[]{3,4};
        	int[] array_1514791894 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__6).getLits();
        	for(int ii = 0; ii <array_575868324.length; ii++) {
        		org.junit.Assert.assertEquals(array_575868324[ii], array_1514791894[ii]);
        	};
        int[] array_1724035434 = new int[]{3,4};
        	int[] array_537650639 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__6).getLits();
        	for(int ii = 0; ii <array_1724035434.length; ii++) {
        		org.junit.Assert.assertEquals(array_1724035434[ii], array_537650639[ii]);
        	};
        IConstr o_test_add25__7 = this.solver.addClause(clause);
        int[] array_160246814 = new int[]{3,4};
        	int[] array_1057465994 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__7).getLits();
        	for(int ii = 0; ii <array_160246814.length; ii++) {
        		org.junit.Assert.assertEquals(array_160246814[ii], array_1057465994[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_test_add25__7)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_test_add25__7)).getActivity())), 0.1);
        Assert.assertEquals("-1[?] 2[?]", ((OriginalBinaryClause) (o_test_add25__7)).toString());
        Assert.assertEquals(3, ((int) (((OriginalBinaryClause) (o_test_add25__7)).hashCode())));
        int[] array_1467232237 = new int[]{3,4};
        	int[] array_975816113 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__7).getLits();
        	for(int ii = 0; ii <array_1467232237.length; ii++) {
        		org.junit.Assert.assertEquals(array_1467232237[ii], array_975816113[ii]);
        	};
        int[] array_1506081513 = new int[]{3,4};
        	int[] array_945850769 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__7).getLits();
        	for(int ii = 0; ii <array_1506081513.length; ii++) {
        		org.junit.Assert.assertEquals(array_1506081513[ii], array_945850769[ii]);
        	};
        clause.clear();
        IVecInt o_test_add25__9 = clause.push(1);
        Assert.assertEquals("1", ((VecInt) (o_test_add25__9)).toString());
        Assert.assertEquals(1, ((int) (((VecInt) (o_test_add25__9)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_add25__9)).isEmpty());
        IConstr o_test_add25__10 = this.solver.addClause(clause);
        Assert.assertTrue(((UnitClause) (o_test_add25__10)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_test_add25__10)).getActivity())), 0.1);
        Assert.assertEquals("1", ((UnitClause) (o_test_add25__10)).toString());
        clause.clear();
        IVecInt o_test_add25__12 = clause.push((-2));
        Assert.assertEquals("-2", ((VecInt) (o_test_add25__12)).toString());
        Assert.assertEquals(-2, ((int) (((VecInt) (o_test_add25__12)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_add25__12)).isEmpty());
        IConstr o_test_add25__14 = this.solver.addClause(clause);
        Assert.assertTrue(((UnitClause) (o_test_add25__14)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_test_add25__14)).getActivity())), 0.1);
        Assert.assertEquals("-2", ((UnitClause) (o_test_add25__14)).toString());
        this.solver.isSatisfiable();
        this.solver.unsatExplanation();
    }

    @Test(timeout = 30000)
    public void test_add25_add623litNum1849() throws Exception, ContradictionException, TimeoutException {
        IVecInt clause = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause)).toString());
        Assert.assertTrue(((VecInt) (clause)).isEmpty());
        IVecInt o_test_add25_add623__3 = clause.push((-1)).push(2);
        Assert.assertEquals("-1,2", ((VecInt) (o_test_add25_add623__3)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_test_add25_add623__3)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_add25_add623__3)).isEmpty());
        IVecInt o_test_add25__3 = clause.push((-1)).push(2);
        Assert.assertEquals("-1,2,-1,2", ((VecInt) (o_test_add25__3)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_test_add25__3)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_add25__3)).isEmpty());
        IConstr o_test_add25__6 = this.solver.addClause(clause);
        int[] array_752402900 = new int[]{3,4};
        	int[] array_1274154853 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__6).getLits();
        	for(int ii = 0; ii <array_752402900.length; ii++) {
        		org.junit.Assert.assertEquals(array_752402900[ii], array_1274154853[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_test_add25__6)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_test_add25__6)).getActivity())), 0.1);
        Assert.assertEquals("-1[?] 2[?]", ((OriginalBinaryClause) (o_test_add25__6)).toString());
        Assert.assertEquals(3, ((int) (((OriginalBinaryClause) (o_test_add25__6)).hashCode())));
        int[] array_575868324 = new int[]{3,4};
        	int[] array_1514791894 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__6).getLits();
        	for(int ii = 0; ii <array_575868324.length; ii++) {
        		org.junit.Assert.assertEquals(array_575868324[ii], array_1514791894[ii]);
        	};
        int[] array_1724035434 = new int[]{3,4};
        	int[] array_537650639 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__6).getLits();
        	for(int ii = 0; ii <array_1724035434.length; ii++) {
        		org.junit.Assert.assertEquals(array_1724035434[ii], array_537650639[ii]);
        	};
        IConstr o_test_add25__7 = this.solver.addClause(clause);
        int[] array_6398508 = new int[]{3,4};
        	int[] array_822636149 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__7).getLits();
        	for(int ii = 0; ii <array_6398508.length; ii++) {
        		org.junit.Assert.assertEquals(array_6398508[ii], array_822636149[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_test_add25__7)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_test_add25__7)).getActivity())), 0.1);
        Assert.assertEquals("-1[?] 2[?]", ((OriginalBinaryClause) (o_test_add25__7)).toString());
        Assert.assertEquals(3, ((int) (((OriginalBinaryClause) (o_test_add25__7)).hashCode())));
        int[] array_1467232237 = new int[]{3,4};
        	int[] array_975816113 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__7).getLits();
        	for(int ii = 0; ii <array_1467232237.length; ii++) {
        		org.junit.Assert.assertEquals(array_1467232237[ii], array_975816113[ii]);
        	};
        int[] array_1506081513 = new int[]{3,4};
        	int[] array_945850769 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__7).getLits();
        	for(int ii = 0; ii <array_1506081513.length; ii++) {
        		org.junit.Assert.assertEquals(array_1506081513[ii], array_945850769[ii]);
        	};
        clause.clear();
        IVecInt o_test_add25__9 = clause.push(1);
        Assert.assertEquals("1", ((VecInt) (o_test_add25__9)).toString());
        Assert.assertEquals(1, ((int) (((VecInt) (o_test_add25__9)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_add25__9)).isEmpty());
        IConstr o_test_add25__10 = this.solver.addClause(clause);
        Assert.assertTrue(((UnitClause) (o_test_add25__10)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_test_add25__10)).getActivity())), 0.1);
        Assert.assertEquals("1", ((UnitClause) (o_test_add25__10)).toString());
        clause.clear();
        IVecInt o_test_add25__12 = clause.push((-3));
        Assert.assertEquals("-3", ((VecInt) (o_test_add25__12)).toString());
        Assert.assertEquals(-3, ((int) (((VecInt) (o_test_add25__12)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_add25__12)).isEmpty());
        IConstr o_test_add25__14 = this.solver.addClause(clause);
        Assert.assertTrue(((UnitClause) (o_test_add25__14)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_test_add25__14)).getActivity())), 0.1);
        Assert.assertEquals("-3", ((UnitClause) (o_test_add25__14)).toString());
        this.solver.isSatisfiable();
        this.solver.unsatExplanation();
    }

    @Test(timeout = 30000)
    public void test_add25_add654_add1984() throws Exception, ContradictionException, TimeoutException {
        IVecInt clause = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause)).toString());
        Assert.assertTrue(((VecInt) (clause)).isEmpty());
        IVecInt o_test_add25__3 = clause.push((-1)).push(2);
        Assert.assertEquals("-1,2", ((VecInt) (o_test_add25__3)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_test_add25__3)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_add25__3)).isEmpty());
        IConstr o_test_add25__6 = this.solver.addClause(clause);
        int[] array_756134656 = new int[]{3,4};
        	int[] array_1664481816 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__6).getLits();
        	for(int ii = 0; ii <array_756134656.length; ii++) {
        		org.junit.Assert.assertEquals(array_756134656[ii], array_1664481816[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_test_add25__6)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_test_add25__6)).getActivity())), 0.1);
        Assert.assertEquals("-1[?] 2[?]", ((OriginalBinaryClause) (o_test_add25__6)).toString());
        Assert.assertEquals(3, ((int) (((OriginalBinaryClause) (o_test_add25__6)).hashCode())));
        int[] array_1446703237 = new int[]{3,4};
        	int[] array_607863791 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__6).getLits();
        	for(int ii = 0; ii <array_1446703237.length; ii++) {
        		org.junit.Assert.assertEquals(array_1446703237[ii], array_607863791[ii]);
        	};
        ((OriginalBinaryClause) (o_test_add25__6)).isSatisfied();
        int[] array_1724035434 = new int[]{3,4};
        	int[] array_537650639 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__6).getLits();
        	for(int ii = 0; ii <array_1724035434.length; ii++) {
        		org.junit.Assert.assertEquals(array_1724035434[ii], array_537650639[ii]);
        	};
        IConstr o_test_add25__7 = this.solver.addClause(clause);
        int[] array_494291821 = new int[]{3,4};
        	int[] array_1969247049 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__7).getLits();
        	for(int ii = 0; ii <array_494291821.length; ii++) {
        		org.junit.Assert.assertEquals(array_494291821[ii], array_1969247049[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_test_add25__7)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_test_add25__7)).getActivity())), 0.1);
        Assert.assertEquals("-1[?] 2[?]", ((OriginalBinaryClause) (o_test_add25__7)).toString());
        Assert.assertEquals(3, ((int) (((OriginalBinaryClause) (o_test_add25__7)).hashCode())));
        int[] array_753014721 = new int[]{3,4};
        	int[] array_903618528 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__7).getLits();
        	for(int ii = 0; ii <array_753014721.length; ii++) {
        		org.junit.Assert.assertEquals(array_753014721[ii], array_903618528[ii]);
        	};
        int[] array_1506081513 = new int[]{3,4};
        	int[] array_945850769 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__7).getLits();
        	for(int ii = 0; ii <array_1506081513.length; ii++) {
        		org.junit.Assert.assertEquals(array_1506081513[ii], array_945850769[ii]);
        	};
        ((OriginalBinaryClause) (o_test_add25__7)).isSatisfied();
        clause.clear();
        IVecInt o_test_add25__9 = clause.push(1);
        Assert.assertEquals("1", ((VecInt) (o_test_add25__9)).toString());
        Assert.assertEquals(1, ((int) (((VecInt) (o_test_add25__9)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_add25__9)).isEmpty());
        IConstr o_test_add25__10 = this.solver.addClause(clause);
        Assert.assertTrue(((UnitClause) (o_test_add25__10)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_test_add25__10)).getActivity())), 0.1);
        Assert.assertEquals("1", ((UnitClause) (o_test_add25__10)).toString());
        clause.clear();
        IVecInt o_test_add25__12 = clause.push((-2));
        Assert.assertEquals("-2", ((VecInt) (o_test_add25__12)).toString());
        Assert.assertEquals(-2, ((int) (((VecInt) (o_test_add25__12)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_add25__12)).isEmpty());
        IConstr o_test_add25__14 = this.solver.addClause(clause);
        Assert.assertTrue(((UnitClause) (o_test_add25__14)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_test_add25__14)).getActivity())), 0.1);
        Assert.assertEquals("-2", ((UnitClause) (o_test_add25__14)).toString());
        this.solver.isSatisfiable();
        this.solver.unsatExplanation();
    }

    @Test(timeout = 30000)
    public void test_add25_add654_add2049() throws Exception, ContradictionException, TimeoutException {
        IVecInt clause = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause)).toString());
        Assert.assertTrue(((VecInt) (clause)).isEmpty());
        IVecInt o_test_add25__3 = clause.push((-1)).push(2);
        Assert.assertEquals("-1,2", ((VecInt) (o_test_add25__3)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_test_add25__3)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_add25__3)).isEmpty());
        IConstr o_test_add25__6 = this.solver.addClause(clause);
        int[] array_395760513 = new int[]{3,4};
        	int[] array_136247332 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__6).getLits();
        	for(int ii = 0; ii <array_395760513.length; ii++) {
        		org.junit.Assert.assertEquals(array_395760513[ii], array_136247332[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_test_add25__6)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_test_add25__6)).getActivity())), 0.1);
        Assert.assertEquals("-1[?] 2[?]", ((OriginalBinaryClause) (o_test_add25__6)).toString());
        Assert.assertEquals(3, ((int) (((OriginalBinaryClause) (o_test_add25__6)).hashCode())));
        int[] array_1446703237 = new int[]{3,4};
        	int[] array_607863791 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__6).getLits();
        	for(int ii = 0; ii <array_1446703237.length; ii++) {
        		org.junit.Assert.assertEquals(array_1446703237[ii], array_607863791[ii]);
        	};
        int[] array_1724035434 = new int[]{3,4};
        	int[] array_537650639 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__6).getLits();
        	for(int ii = 0; ii <array_1724035434.length; ii++) {
        		org.junit.Assert.assertEquals(array_1724035434[ii], array_537650639[ii]);
        	};
        IConstr o_test_add25__7 = this.solver.addClause(clause);
        int[] array_662525401 = new int[]{3,4};
        	int[] array_1766373321 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__7).getLits();
        	for(int ii = 0; ii <array_662525401.length; ii++) {
        		org.junit.Assert.assertEquals(array_662525401[ii], array_1766373321[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_test_add25__7)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_test_add25__7)).getActivity())), 0.1);
        Assert.assertEquals("-1[?] 2[?]", ((OriginalBinaryClause) (o_test_add25__7)).toString());
        Assert.assertEquals(3, ((int) (((OriginalBinaryClause) (o_test_add25__7)).hashCode())));
        int[] array_753014721 = new int[]{3,4};
        	int[] array_903618528 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__7).getLits();
        	for(int ii = 0; ii <array_753014721.length; ii++) {
        		org.junit.Assert.assertEquals(array_753014721[ii], array_903618528[ii]);
        	};
        int[] array_1506081513 = new int[]{3,4};
        	int[] array_945850769 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__7).getLits();
        	for(int ii = 0; ii <array_1506081513.length; ii++) {
        		org.junit.Assert.assertEquals(array_1506081513[ii], array_945850769[ii]);
        	};
        ((OriginalBinaryClause) (o_test_add25__7)).isSatisfied();
        clause.clear();
        IVecInt o_test_add25__9 = clause.push(1);
        Assert.assertEquals("1", ((VecInt) (o_test_add25__9)).toString());
        Assert.assertEquals(1, ((int) (((VecInt) (o_test_add25__9)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_add25__9)).isEmpty());
        IConstr o_test_add25_add654_add2049__27 = this.solver.addClause(clause);
        Assert.assertTrue(((UnitClause) (o_test_add25_add654_add2049__27)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_test_add25_add654_add2049__27)).getActivity())), 0.1);
        Assert.assertEquals("1", ((UnitClause) (o_test_add25_add654_add2049__27)).toString());
        IConstr o_test_add25__10 = this.solver.addClause(clause);
        clause.clear();
        IVecInt o_test_add25__12 = clause.push((-2));
        IConstr o_test_add25__14 = this.solver.addClause(clause);
        this.solver.isSatisfiable();
        this.solver.unsatExplanation();
    }

    @Test(timeout = 30000)
    public void test_add25_add709_add1535() throws Exception, ContradictionException, TimeoutException {
        IVecInt clause = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause)).toString());
        Assert.assertTrue(((VecInt) (clause)).isEmpty());
        IVecInt o_test_add25__3 = clause.push((-1)).push(2);
        Assert.assertEquals("-1,2", ((VecInt) (o_test_add25__3)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_test_add25__3)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_add25__3)).isEmpty());
        IConstr o_test_add25__6 = this.solver.addClause(clause);
        int[] array_1796576204 = new int[]{3,4};
        	int[] array_498113705 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__6).getLits();
        	for(int ii = 0; ii <array_1796576204.length; ii++) {
        		org.junit.Assert.assertEquals(array_1796576204[ii], array_498113705[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_test_add25__6)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_test_add25__6)).getActivity())), 0.1);
        Assert.assertEquals("-1[?] 2[?]", ((OriginalBinaryClause) (o_test_add25__6)).toString());
        Assert.assertEquals(3, ((int) (((OriginalBinaryClause) (o_test_add25__6)).hashCode())));
        int[] array_399839390 = new int[]{3,4};
        	int[] array_1572713630 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__6).getLits();
        	for(int ii = 0; ii <array_399839390.length; ii++) {
        		org.junit.Assert.assertEquals(array_399839390[ii], array_1572713630[ii]);
        	};
        ((OriginalBinaryClause) (o_test_add25__6)).isSatisfied();
        int[] array_1724035434 = new int[]{3,4};
        	int[] array_537650639 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__6).getLits();
        	for(int ii = 0; ii <array_1724035434.length; ii++) {
        		org.junit.Assert.assertEquals(array_1724035434[ii], array_537650639[ii]);
        	};
        IConstr o_test_add25__7 = this.solver.addClause(clause);
        int[] array_1326971102 = new int[]{3,4};
        	int[] array_1236779627 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__7).getLits();
        	for(int ii = 0; ii <array_1326971102.length; ii++) {
        		org.junit.Assert.assertEquals(array_1326971102[ii], array_1236779627[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_test_add25__7)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_test_add25__7)).getActivity())), 0.1);
        Assert.assertEquals("-1[?] 2[?]", ((OriginalBinaryClause) (o_test_add25__7)).toString());
        Assert.assertEquals(3, ((int) (((OriginalBinaryClause) (o_test_add25__7)).hashCode())));
        int[] array_386846173 = new int[]{3,4};
        	int[] array_893480475 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__7).getLits();
        	for(int ii = 0; ii <array_386846173.length; ii++) {
        		org.junit.Assert.assertEquals(array_386846173[ii], array_893480475[ii]);
        	};
        int[] array_1506081513 = new int[]{3,4};
        	int[] array_945850769 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__7).getLits();
        	for(int ii = 0; ii <array_1506081513.length; ii++) {
        		org.junit.Assert.assertEquals(array_1506081513[ii], array_945850769[ii]);
        	};
        clause.clear();
        IVecInt o_test_add25__9 = clause.push(1);
        Assert.assertEquals("1", ((VecInt) (o_test_add25__9)).toString());
        Assert.assertEquals(1, ((int) (((VecInt) (o_test_add25__9)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_add25__9)).isEmpty());
        IConstr o_test_add25__10 = this.solver.addClause(clause);
        Assert.assertTrue(((UnitClause) (o_test_add25__10)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_test_add25__10)).getActivity())), 0.1);
        Assert.assertEquals("1", ((UnitClause) (o_test_add25__10)).toString());
        clause.clear();
        IVecInt o_test_add25__12 = clause.push((-2));
        Assert.assertEquals("-2", ((VecInt) (o_test_add25__12)).toString());
        Assert.assertEquals(-2, ((int) (((VecInt) (o_test_add25__12)).hashCode())));
        Assert.assertFalse(((VecInt) (o_test_add25__12)).isEmpty());
        IConstr o_test_add25__14 = this.solver.addClause(clause);
        Assert.assertTrue(((UnitClause) (o_test_add25__14)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_test_add25__14)).getActivity())), 0.1);
        Assert.assertEquals("-2", ((UnitClause) (o_test_add25__14)).toString());
        this.solver.isSatisfiable();
        this.solver.isSatisfiable();
        this.solver.unsatExplanation();
    }

    @Test(timeout = 30000)
    public void test_add25_add653litNum1986_failAssert162() throws Exception, ContradictionException, TimeoutException {
        try {
            IVecInt clause = new VecInt();
            IVecInt o_test_add25__3 = clause.push((-(Integer.MAX_VALUE))).push(2);
            IConstr o_test_add25__6 = this.solver.addClause(clause);
            int[] array_7720934 = new int[]{3,4};
            	int[] array_1873932885 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__6).getLits();
            	for(int ii = 0; ii <array_7720934.length; ii++) {
            		org.junit.Assert.assertEquals(array_7720934[ii], array_1873932885[ii]);
            	};
            int[] array_1724035434 = new int[]{3,4};
            	int[] array_537650639 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__6).getLits();
            	for(int ii = 0; ii <array_1724035434.length; ii++) {
            		org.junit.Assert.assertEquals(array_1724035434[ii], array_537650639[ii]);
            	};
            IConstr o_test_add25_add653__13 = this.solver.addClause(clause);
            int[] array_805440592 = new int[]{3,4};
            	int[] array_416946738 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25_add653__13).getLits();
            	for(int ii = 0; ii <array_805440592.length; ii++) {
            		org.junit.Assert.assertEquals(array_805440592[ii], array_416946738[ii]);
            	};
            IConstr o_test_add25__7 = this.solver.addClause(clause);
            int[] array_1242534560 = new int[]{3,4};
            	int[] array_1661711585 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__7).getLits();
            	for(int ii = 0; ii <array_1242534560.length; ii++) {
            		org.junit.Assert.assertEquals(array_1242534560[ii], array_1661711585[ii]);
            	};
            int[] array_1506081513 = new int[]{3,4};
            	int[] array_945850769 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__7).getLits();
            	for(int ii = 0; ii <array_1506081513.length; ii++) {
            		org.junit.Assert.assertEquals(array_1506081513[ii], array_945850769[ii]);
            	};
            clause.clear();
            IVecInt o_test_add25__9 = clause.push(1);
            IConstr o_test_add25__10 = this.solver.addClause(clause);
            clause.clear();
            IVecInt o_test_add25__12 = clause.push((-2));
            IConstr o_test_add25__14 = this.solver.addClause(clause);
            this.solver.isSatisfiable();
            this.solver.unsatExplanation();
            org.junit.Assert.fail("test_add25_add653litNum1986 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test_add25_add653litNum1990_failAssert163() throws Exception, ContradictionException, TimeoutException {
        try {
            IVecInt clause = new VecInt();
            IVecInt o_test_add25__3 = clause.push((-(Integer.MIN_VALUE))).push(2);
            IConstr o_test_add25__6 = this.solver.addClause(clause);
            int[] array_7720934 = new int[]{3,4};
            	int[] array_1873932885 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__6).getLits();
            	for(int ii = 0; ii <array_7720934.length; ii++) {
            		org.junit.Assert.assertEquals(array_7720934[ii], array_1873932885[ii]);
            	};
            int[] array_1724035434 = new int[]{3,4};
            	int[] array_537650639 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__6).getLits();
            	for(int ii = 0; ii <array_1724035434.length; ii++) {
            		org.junit.Assert.assertEquals(array_1724035434[ii], array_537650639[ii]);
            	};
            IConstr o_test_add25_add653__13 = this.solver.addClause(clause);
            int[] array_805440592 = new int[]{3,4};
            	int[] array_416946738 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25_add653__13).getLits();
            	for(int ii = 0; ii <array_805440592.length; ii++) {
            		org.junit.Assert.assertEquals(array_805440592[ii], array_416946738[ii]);
            	};
            IConstr o_test_add25__7 = this.solver.addClause(clause);
            int[] array_1242534560 = new int[]{3,4};
            	int[] array_1661711585 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__7).getLits();
            	for(int ii = 0; ii <array_1242534560.length; ii++) {
            		org.junit.Assert.assertEquals(array_1242534560[ii], array_1661711585[ii]);
            	};
            int[] array_1506081513 = new int[]{3,4};
            	int[] array_945850769 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__7).getLits();
            	for(int ii = 0; ii <array_1506081513.length; ii++) {
            		org.junit.Assert.assertEquals(array_1506081513[ii], array_945850769[ii]);
            	};
            clause.clear();
            IVecInt o_test_add25__9 = clause.push(1);
            IConstr o_test_add25__10 = this.solver.addClause(clause);
            clause.clear();
            IVecInt o_test_add25__12 = clause.push((-2));
            IConstr o_test_add25__14 = this.solver.addClause(clause);
            this.solver.isSatisfiable();
            this.solver.unsatExplanation();
            org.junit.Assert.fail("test_add25_add653litNum1990 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-2147483648", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test_add25_add653litNum2067_failAssert164() throws Exception, ContradictionException, TimeoutException {
        try {
            IVecInt clause = new VecInt();
            IVecInt o_test_add25__3 = clause.push((-1)).push(2);
            IConstr o_test_add25__6 = this.solver.addClause(clause);
            int[] array_7720934 = new int[]{3,4};
            	int[] array_1873932885 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__6).getLits();
            	for(int ii = 0; ii <array_7720934.length; ii++) {
            		org.junit.Assert.assertEquals(array_7720934[ii], array_1873932885[ii]);
            	};
            int[] array_1724035434 = new int[]{3,4};
            	int[] array_537650639 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__6).getLits();
            	for(int ii = 0; ii <array_1724035434.length; ii++) {
            		org.junit.Assert.assertEquals(array_1724035434[ii], array_537650639[ii]);
            	};
            IConstr o_test_add25_add653__13 = this.solver.addClause(clause);
            int[] array_805440592 = new int[]{3,4};
            	int[] array_416946738 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25_add653__13).getLits();
            	for(int ii = 0; ii <array_805440592.length; ii++) {
            		org.junit.Assert.assertEquals(array_805440592[ii], array_416946738[ii]);
            	};
            IConstr o_test_add25__7 = this.solver.addClause(clause);
            int[] array_1242534560 = new int[]{3,4};
            	int[] array_1661711585 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__7).getLits();
            	for(int ii = 0; ii <array_1242534560.length; ii++) {
            		org.junit.Assert.assertEquals(array_1242534560[ii], array_1661711585[ii]);
            	};
            int[] array_1506081513 = new int[]{3,4};
            	int[] array_945850769 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__7).getLits();
            	for(int ii = 0; ii <array_1506081513.length; ii++) {
            		org.junit.Assert.assertEquals(array_1506081513[ii], array_945850769[ii]);
            	};
            clause.clear();
            IVecInt o_test_add25__9 = clause.push(1);
            IConstr o_test_add25__10 = this.solver.addClause(clause);
            clause.clear();
            IVecInt o_test_add25__12 = clause.push((-(Integer.MIN_VALUE)));
            IConstr o_test_add25__14 = this.solver.addClause(clause);
            this.solver.isSatisfiable();
            this.solver.unsatExplanation();
            org.junit.Assert.fail("test_add25_add653litNum2067 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-2147483648", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test_add25_add653litNum2038_failAssert166() throws Exception, ContradictionException, TimeoutException {
        try {
            IVecInt clause = new VecInt();
            IVecInt o_test_add25__3 = clause.push((-1)).push(2);
            IConstr o_test_add25__6 = this.solver.addClause(clause);
            int[] array_7720934 = new int[]{3,4};
            	int[] array_1873932885 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__6).getLits();
            	for(int ii = 0; ii <array_7720934.length; ii++) {
            		org.junit.Assert.assertEquals(array_7720934[ii], array_1873932885[ii]);
            	};
            int[] array_1724035434 = new int[]{3,4};
            	int[] array_537650639 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__6).getLits();
            	for(int ii = 0; ii <array_1724035434.length; ii++) {
            		org.junit.Assert.assertEquals(array_1724035434[ii], array_537650639[ii]);
            	};
            IConstr o_test_add25_add653__13 = this.solver.addClause(clause);
            int[] array_805440592 = new int[]{3,4};
            	int[] array_416946738 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25_add653__13).getLits();
            	for(int ii = 0; ii <array_805440592.length; ii++) {
            		org.junit.Assert.assertEquals(array_805440592[ii], array_416946738[ii]);
            	};
            IConstr o_test_add25__7 = this.solver.addClause(clause);
            int[] array_1242534560 = new int[]{3,4};
            	int[] array_1661711585 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__7).getLits();
            	for(int ii = 0; ii <array_1242534560.length; ii++) {
            		org.junit.Assert.assertEquals(array_1242534560[ii], array_1661711585[ii]);
            	};
            int[] array_1506081513 = new int[]{3,4};
            	int[] array_945850769 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__7).getLits();
            	for(int ii = 0; ii <array_1506081513.length; ii++) {
            		org.junit.Assert.assertEquals(array_1506081513[ii], array_945850769[ii]);
            	};
            clause.clear();
            IVecInt o_test_add25__9 = clause.push(Integer.MAX_VALUE);
            IConstr o_test_add25__10 = this.solver.addClause(clause);
            clause.clear();
            IVecInt o_test_add25__12 = clause.push((-2));
            IConstr o_test_add25__14 = this.solver.addClause(clause);
            this.solver.isSatisfiable();
            this.solver.unsatExplanation();
            org.junit.Assert.fail("test_add25_add653litNum2038 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test_add25_add653litNum2008_failAssert167() throws Exception, ContradictionException, TimeoutException {
        try {
            IVecInt clause = new VecInt();
            IVecInt o_test_add25__3 = clause.push((-1)).push(Integer.MAX_VALUE);
            IConstr o_test_add25__6 = this.solver.addClause(clause);
            int[] array_7720934 = new int[]{3,4};
            	int[] array_1873932885 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__6).getLits();
            	for(int ii = 0; ii <array_7720934.length; ii++) {
            		org.junit.Assert.assertEquals(array_7720934[ii], array_1873932885[ii]);
            	};
            int[] array_1724035434 = new int[]{3,4};
            	int[] array_537650639 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__6).getLits();
            	for(int ii = 0; ii <array_1724035434.length; ii++) {
            		org.junit.Assert.assertEquals(array_1724035434[ii], array_537650639[ii]);
            	};
            IConstr o_test_add25_add653__13 = this.solver.addClause(clause);
            int[] array_805440592 = new int[]{3,4};
            	int[] array_416946738 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25_add653__13).getLits();
            	for(int ii = 0; ii <array_805440592.length; ii++) {
            		org.junit.Assert.assertEquals(array_805440592[ii], array_416946738[ii]);
            	};
            IConstr o_test_add25__7 = this.solver.addClause(clause);
            int[] array_1242534560 = new int[]{3,4};
            	int[] array_1661711585 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__7).getLits();
            	for(int ii = 0; ii <array_1242534560.length; ii++) {
            		org.junit.Assert.assertEquals(array_1242534560[ii], array_1661711585[ii]);
            	};
            int[] array_1506081513 = new int[]{3,4};
            	int[] array_945850769 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__7).getLits();
            	for(int ii = 0; ii <array_1506081513.length; ii++) {
            		org.junit.Assert.assertEquals(array_1506081513[ii], array_945850769[ii]);
            	};
            clause.clear();
            IVecInt o_test_add25__9 = clause.push(1);
            IConstr o_test_add25__10 = this.solver.addClause(clause);
            clause.clear();
            IVecInt o_test_add25__12 = clause.push((-2));
            IConstr o_test_add25__14 = this.solver.addClause(clause);
            this.solver.isSatisfiable();
            this.solver.unsatExplanation();
            org.junit.Assert.fail("test_add25_add653litNum2008 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test_add25_add653litNum1977_failAssert171() throws Exception, ContradictionException, TimeoutException {
        try {
            IVecInt clause = new VecInt();
            IVecInt o_test_add25__3 = clause.push((-2)).push(2);
            IConstr o_test_add25__6 = this.solver.addClause(clause);
            int[] array_7720934 = new int[]{3,4};
            	int[] array_1873932885 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__6).getLits();
            	for(int ii = 0; ii <array_7720934.length; ii++) {
            		org.junit.Assert.assertEquals(array_7720934[ii], array_1873932885[ii]);
            	};
            int[] array_1724035434 = new int[]{3,4};
            	int[] array_537650639 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__6).getLits();
            	for(int ii = 0; ii <array_1724035434.length; ii++) {
            		org.junit.Assert.assertEquals(array_1724035434[ii], array_537650639[ii]);
            	};
            IConstr o_test_add25_add653__13 = this.solver.addClause(clause);
            int[] array_805440592 = new int[]{3,4};
            	int[] array_416946738 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25_add653__13).getLits();
            	for(int ii = 0; ii <array_805440592.length; ii++) {
            		org.junit.Assert.assertEquals(array_805440592[ii], array_416946738[ii]);
            	};
            IConstr o_test_add25__7 = this.solver.addClause(clause);
            int[] array_1242534560 = new int[]{3,4};
            	int[] array_1661711585 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__7).getLits();
            	for(int ii = 0; ii <array_1242534560.length; ii++) {
            		org.junit.Assert.assertEquals(array_1242534560[ii], array_1661711585[ii]);
            	};
            int[] array_1506081513 = new int[]{3,4};
            	int[] array_945850769 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__7).getLits();
            	for(int ii = 0; ii <array_1506081513.length; ii++) {
            		org.junit.Assert.assertEquals(array_1506081513[ii], array_945850769[ii]);
            	};
            clause.clear();
            IVecInt o_test_add25__9 = clause.push(1);
            IConstr o_test_add25__10 = this.solver.addClause(clause);
            clause.clear();
            IVecInt o_test_add25__12 = clause.push((-2));
            IConstr o_test_add25__14 = this.solver.addClause(clause);
            this.solver.isSatisfiable();
            this.solver.unsatExplanation();
            org.junit.Assert.fail("test_add25_add653litNum1977 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test_add25_add653litNum1981_failAssert172() throws Exception, ContradictionException, TimeoutException {
        try {
            IVecInt clause = new VecInt();
            IVecInt o_test_add25__3 = clause.push((-0)).push(2);
            IConstr o_test_add25__6 = this.solver.addClause(clause);
            int[] array_7720934 = new int[]{3,4};
            	int[] array_1873932885 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__6).getLits();
            	for(int ii = 0; ii <array_7720934.length; ii++) {
            		org.junit.Assert.assertEquals(array_7720934[ii], array_1873932885[ii]);
            	};
            int[] array_1724035434 = new int[]{3,4};
            	int[] array_537650639 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__6).getLits();
            	for(int ii = 0; ii <array_1724035434.length; ii++) {
            		org.junit.Assert.assertEquals(array_1724035434[ii], array_537650639[ii]);
            	};
            IConstr o_test_add25_add653__13 = this.solver.addClause(clause);
            int[] array_805440592 = new int[]{3,4};
            	int[] array_416946738 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25_add653__13).getLits();
            	for(int ii = 0; ii <array_805440592.length; ii++) {
            		org.junit.Assert.assertEquals(array_805440592[ii], array_416946738[ii]);
            	};
            IConstr o_test_add25__7 = this.solver.addClause(clause);
            int[] array_1242534560 = new int[]{3,4};
            	int[] array_1661711585 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__7).getLits();
            	for(int ii = 0; ii <array_1242534560.length; ii++) {
            		org.junit.Assert.assertEquals(array_1242534560[ii], array_1661711585[ii]);
            	};
            int[] array_1506081513 = new int[]{3,4};
            	int[] array_945850769 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__7).getLits();
            	for(int ii = 0; ii <array_1506081513.length; ii++) {
            		org.junit.Assert.assertEquals(array_1506081513[ii], array_945850769[ii]);
            	};
            clause.clear();
            IVecInt o_test_add25__9 = clause.push(1);
            IConstr o_test_add25__10 = this.solver.addClause(clause);
            clause.clear();
            IVecInt o_test_add25__12 = clause.push((-2));
            IConstr o_test_add25__14 = this.solver.addClause(clause);
            this.solver.isSatisfiable();
            this.solver.unsatExplanation();
            org.junit.Assert.fail("test_add25_add653litNum1981 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test_add25_add653litNum2029_failAssert173() throws Exception, ContradictionException, TimeoutException {
        try {
            IVecInt clause = new VecInt();
            IVecInt o_test_add25__3 = clause.push((-1)).push(2);
            IConstr o_test_add25__6 = this.solver.addClause(clause);
            int[] array_7720934 = new int[]{3,4};
            	int[] array_1873932885 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__6).getLits();
            	for(int ii = 0; ii <array_7720934.length; ii++) {
            		org.junit.Assert.assertEquals(array_7720934[ii], array_1873932885[ii]);
            	};
            int[] array_1724035434 = new int[]{3,4};
            	int[] array_537650639 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__6).getLits();
            	for(int ii = 0; ii <array_1724035434.length; ii++) {
            		org.junit.Assert.assertEquals(array_1724035434[ii], array_537650639[ii]);
            	};
            IConstr o_test_add25_add653__13 = this.solver.addClause(clause);
            int[] array_805440592 = new int[]{3,4};
            	int[] array_416946738 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25_add653__13).getLits();
            	for(int ii = 0; ii <array_805440592.length; ii++) {
            		org.junit.Assert.assertEquals(array_805440592[ii], array_416946738[ii]);
            	};
            IConstr o_test_add25__7 = this.solver.addClause(clause);
            int[] array_1242534560 = new int[]{3,4};
            	int[] array_1661711585 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__7).getLits();
            	for(int ii = 0; ii <array_1242534560.length; ii++) {
            		org.junit.Assert.assertEquals(array_1242534560[ii], array_1661711585[ii]);
            	};
            int[] array_1506081513 = new int[]{3,4};
            	int[] array_945850769 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__7).getLits();
            	for(int ii = 0; ii <array_1506081513.length; ii++) {
            		org.junit.Assert.assertEquals(array_1506081513[ii], array_945850769[ii]);
            	};
            clause.clear();
            IVecInt o_test_add25__9 = clause.push(2);
            IConstr o_test_add25__10 = this.solver.addClause(clause);
            clause.clear();
            IVecInt o_test_add25__12 = clause.push((-2));
            IConstr o_test_add25__14 = this.solver.addClause(clause);
            this.solver.isSatisfiable();
            this.solver.unsatExplanation();
            org.junit.Assert.fail("test_add25_add653litNum2029 should have thrown ContradictionException");
        } catch (ContradictionException expected) {
            Assert.assertEquals("Creating Empty clause ?", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test_add25_add653litNum2018_failAssert175() throws Exception, ContradictionException, TimeoutException {
        try {
            IVecInt clause = new VecInt();
            IVecInt o_test_add25__3 = clause.push((-1)).push(0);
            IConstr o_test_add25__6 = this.solver.addClause(clause);
            int[] array_7720934 = new int[]{3,4};
            	int[] array_1873932885 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__6).getLits();
            	for(int ii = 0; ii <array_7720934.length; ii++) {
            		org.junit.Assert.assertEquals(array_7720934[ii], array_1873932885[ii]);
            	};
            int[] array_1724035434 = new int[]{3,4};
            	int[] array_537650639 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__6).getLits();
            	for(int ii = 0; ii <array_1724035434.length; ii++) {
            		org.junit.Assert.assertEquals(array_1724035434[ii], array_537650639[ii]);
            	};
            IConstr o_test_add25_add653__13 = this.solver.addClause(clause);
            int[] array_805440592 = new int[]{3,4};
            	int[] array_416946738 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25_add653__13).getLits();
            	for(int ii = 0; ii <array_805440592.length; ii++) {
            		org.junit.Assert.assertEquals(array_805440592[ii], array_416946738[ii]);
            	};
            IConstr o_test_add25__7 = this.solver.addClause(clause);
            int[] array_1242534560 = new int[]{3,4};
            	int[] array_1661711585 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__7).getLits();
            	for(int ii = 0; ii <array_1242534560.length; ii++) {
            		org.junit.Assert.assertEquals(array_1242534560[ii], array_1661711585[ii]);
            	};
            int[] array_1506081513 = new int[]{3,4};
            	int[] array_945850769 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__7).getLits();
            	for(int ii = 0; ii <array_1506081513.length; ii++) {
            		org.junit.Assert.assertEquals(array_1506081513[ii], array_945850769[ii]);
            	};
            clause.clear();
            IVecInt o_test_add25__9 = clause.push(1);
            IConstr o_test_add25__10 = this.solver.addClause(clause);
            clause.clear();
            IVecInt o_test_add25__12 = clause.push((-2));
            IConstr o_test_add25__14 = this.solver.addClause(clause);
            this.solver.isSatisfiable();
            this.solver.unsatExplanation();
            org.junit.Assert.fail("test_add25_add653litNum2018 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test_add25_add653litNum2072_failAssert176() throws Exception, ContradictionException, TimeoutException {
        try {
            IVecInt clause = new VecInt();
            IVecInt o_test_add25__3 = clause.push((-1)).push(2);
            IConstr o_test_add25__6 = this.solver.addClause(clause);
            int[] array_7720934 = new int[]{3,4};
            	int[] array_1873932885 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__6).getLits();
            	for(int ii = 0; ii <array_7720934.length; ii++) {
            		org.junit.Assert.assertEquals(array_7720934[ii], array_1873932885[ii]);
            	};
            int[] array_1724035434 = new int[]{3,4};
            	int[] array_537650639 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__6).getLits();
            	for(int ii = 0; ii <array_1724035434.length; ii++) {
            		org.junit.Assert.assertEquals(array_1724035434[ii], array_537650639[ii]);
            	};
            IConstr o_test_add25_add653__13 = this.solver.addClause(clause);
            int[] array_805440592 = new int[]{3,4};
            	int[] array_416946738 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25_add653__13).getLits();
            	for(int ii = 0; ii <array_805440592.length; ii++) {
            		org.junit.Assert.assertEquals(array_805440592[ii], array_416946738[ii]);
            	};
            IConstr o_test_add25__7 = this.solver.addClause(clause);
            int[] array_1242534560 = new int[]{3,4};
            	int[] array_1661711585 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__7).getLits();
            	for(int ii = 0; ii <array_1242534560.length; ii++) {
            		org.junit.Assert.assertEquals(array_1242534560[ii], array_1661711585[ii]);
            	};
            int[] array_1506081513 = new int[]{3,4};
            	int[] array_945850769 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__7).getLits();
            	for(int ii = 0; ii <array_1506081513.length; ii++) {
            		org.junit.Assert.assertEquals(array_1506081513[ii], array_945850769[ii]);
            	};
            clause.clear();
            IVecInt o_test_add25__9 = clause.push(1);
            IConstr o_test_add25__10 = this.solver.addClause(clause);
            clause.clear();
            IVecInt o_test_add25__12 = clause.push((-0));
            IConstr o_test_add25__14 = this.solver.addClause(clause);
            this.solver.isSatisfiable();
            this.solver.unsatExplanation();
            org.junit.Assert.fail("test_add25_add653litNum2072 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test_add25_add653litNum2034_failAssert177() throws Exception, ContradictionException, TimeoutException {
        try {
            IVecInt clause = new VecInt();
            IVecInt o_test_add25__3 = clause.push((-1)).push(2);
            IConstr o_test_add25__6 = this.solver.addClause(clause);
            int[] array_7720934 = new int[]{3,4};
            	int[] array_1873932885 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__6).getLits();
            	for(int ii = 0; ii <array_7720934.length; ii++) {
            		org.junit.Assert.assertEquals(array_7720934[ii], array_1873932885[ii]);
            	};
            int[] array_1724035434 = new int[]{3,4};
            	int[] array_537650639 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__6).getLits();
            	for(int ii = 0; ii <array_1724035434.length; ii++) {
            		org.junit.Assert.assertEquals(array_1724035434[ii], array_537650639[ii]);
            	};
            IConstr o_test_add25_add653__13 = this.solver.addClause(clause);
            int[] array_805440592 = new int[]{3,4};
            	int[] array_416946738 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25_add653__13).getLits();
            	for(int ii = 0; ii <array_805440592.length; ii++) {
            		org.junit.Assert.assertEquals(array_805440592[ii], array_416946738[ii]);
            	};
            IConstr o_test_add25__7 = this.solver.addClause(clause);
            int[] array_1242534560 = new int[]{3,4};
            	int[] array_1661711585 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__7).getLits();
            	for(int ii = 0; ii <array_1242534560.length; ii++) {
            		org.junit.Assert.assertEquals(array_1242534560[ii], array_1661711585[ii]);
            	};
            int[] array_1506081513 = new int[]{3,4};
            	int[] array_945850769 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__7).getLits();
            	for(int ii = 0; ii <array_1506081513.length; ii++) {
            		org.junit.Assert.assertEquals(array_1506081513[ii], array_945850769[ii]);
            	};
            clause.clear();
            IVecInt o_test_add25__9 = clause.push(0);
            IConstr o_test_add25__10 = this.solver.addClause(clause);
            clause.clear();
            IVecInt o_test_add25__12 = clause.push((-2));
            IConstr o_test_add25__14 = this.solver.addClause(clause);
            this.solver.isSatisfiable();
            this.solver.unsatExplanation();
            org.junit.Assert.fail("test_add25_add653litNum2034 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test_add25_add623litNum1858_failAssert180() throws Exception, ContradictionException, TimeoutException {
        try {
            IVecInt clause = new VecInt();
            IVecInt o_test_add25_add623__3 = clause.push((-1)).push(2);
            IVecInt o_test_add25__3 = clause.push((-1)).push(2);
            IConstr o_test_add25__6 = this.solver.addClause(clause);
            int[] array_575868324 = new int[]{3,4};
            	int[] array_1514791894 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__6).getLits();
            	for(int ii = 0; ii <array_575868324.length; ii++) {
            		org.junit.Assert.assertEquals(array_575868324[ii], array_1514791894[ii]);
            	};
            int[] array_1724035434 = new int[]{3,4};
            	int[] array_537650639 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__6).getLits();
            	for(int ii = 0; ii <array_1724035434.length; ii++) {
            		org.junit.Assert.assertEquals(array_1724035434[ii], array_537650639[ii]);
            	};
            IConstr o_test_add25__7 = this.solver.addClause(clause);
            int[] array_1467232237 = new int[]{3,4};
            	int[] array_975816113 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__7).getLits();
            	for(int ii = 0; ii <array_1467232237.length; ii++) {
            		org.junit.Assert.assertEquals(array_1467232237[ii], array_975816113[ii]);
            	};
            int[] array_1506081513 = new int[]{3,4};
            	int[] array_945850769 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__7).getLits();
            	for(int ii = 0; ii <array_1506081513.length; ii++) {
            		org.junit.Assert.assertEquals(array_1506081513[ii], array_945850769[ii]);
            	};
            clause.clear();
            IVecInt o_test_add25__9 = clause.push(1);
            IConstr o_test_add25__10 = this.solver.addClause(clause);
            clause.clear();
            IVecInt o_test_add25__12 = clause.push((-(Integer.MAX_VALUE)));
            IConstr o_test_add25__14 = this.solver.addClause(clause);
            this.solver.isSatisfiable();
            this.solver.unsatExplanation();
            org.junit.Assert.fail("test_add25_add623litNum1858 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test_add25_add623litNum1818_failAssert187() throws Exception, ContradictionException, TimeoutException {
        try {
            IVecInt clause = new VecInt();
            IVecInt o_test_add25_add623__3 = clause.push((-1)).push(2);
            IVecInt o_test_add25__3 = clause.push((-1)).push(2);
            IConstr o_test_add25__6 = this.solver.addClause(clause);
            int[] array_575868324 = new int[]{3,4};
            	int[] array_1514791894 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__6).getLits();
            	for(int ii = 0; ii <array_575868324.length; ii++) {
            		org.junit.Assert.assertEquals(array_575868324[ii], array_1514791894[ii]);
            	};
            int[] array_1724035434 = new int[]{3,4};
            	int[] array_537650639 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__6).getLits();
            	for(int ii = 0; ii <array_1724035434.length; ii++) {
            		org.junit.Assert.assertEquals(array_1724035434[ii], array_537650639[ii]);
            	};
            IConstr o_test_add25__7 = this.solver.addClause(clause);
            int[] array_1467232237 = new int[]{3,4};
            	int[] array_975816113 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__7).getLits();
            	for(int ii = 0; ii <array_1467232237.length; ii++) {
            		org.junit.Assert.assertEquals(array_1467232237[ii], array_975816113[ii]);
            	};
            int[] array_1506081513 = new int[]{3,4};
            	int[] array_945850769 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__7).getLits();
            	for(int ii = 0; ii <array_1506081513.length; ii++) {
            		org.junit.Assert.assertEquals(array_1506081513[ii], array_945850769[ii]);
            	};
            clause.clear();
            IVecInt o_test_add25__9 = clause.push(Integer.MIN_VALUE);
            IConstr o_test_add25__10 = this.solver.addClause(clause);
            clause.clear();
            IVecInt o_test_add25__12 = clause.push((-2));
            IConstr o_test_add25__14 = this.solver.addClause(clause);
            this.solver.isSatisfiable();
            this.solver.unsatExplanation();
            org.junit.Assert.fail("test_add25_add623litNum1818 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-2147483648", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test_add25_add623litNum1688_failAssert191() throws Exception, ContradictionException, TimeoutException {
        try {
            IVecInt clause = new VecInt();
            IVecInt o_test_add25_add623__3 = clause.push((-186118186)).push(2);
            IVecInt o_test_add25__3 = clause.push((-1)).push(2);
            IConstr o_test_add25__6 = this.solver.addClause(clause);
            int[] array_575868324 = new int[]{3,4};
            	int[] array_1514791894 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__6).getLits();
            	for(int ii = 0; ii <array_575868324.length; ii++) {
            		org.junit.Assert.assertEquals(array_575868324[ii], array_1514791894[ii]);
            	};
            int[] array_1724035434 = new int[]{3,4};
            	int[] array_537650639 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__6).getLits();
            	for(int ii = 0; ii <array_1724035434.length; ii++) {
            		org.junit.Assert.assertEquals(array_1724035434[ii], array_537650639[ii]);
            	};
            IConstr o_test_add25__7 = this.solver.addClause(clause);
            int[] array_1467232237 = new int[]{3,4};
            	int[] array_975816113 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__7).getLits();
            	for(int ii = 0; ii <array_1467232237.length; ii++) {
            		org.junit.Assert.assertEquals(array_1467232237[ii], array_975816113[ii]);
            	};
            int[] array_1506081513 = new int[]{3,4};
            	int[] array_945850769 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__7).getLits();
            	for(int ii = 0; ii <array_1506081513.length; ii++) {
            		org.junit.Assert.assertEquals(array_1506081513[ii], array_945850769[ii]);
            	};
            clause.clear();
            IVecInt o_test_add25__9 = clause.push(1);
            IConstr o_test_add25__10 = this.solver.addClause(clause);
            clause.clear();
            IVecInt o_test_add25__12 = clause.push((-2));
            IConstr o_test_add25__14 = this.solver.addClause(clause);
            this.solver.isSatisfiable();
            this.solver.unsatExplanation();
            org.junit.Assert.fail("test_add25_add623litNum1688 should have thrown ClassCastException");
        } catch (ClassCastException expected) {
            Assert.assertEquals("org.sat4j.minisat.constraints.cnf.OriginalWLClause cannot be cast to org.sat4j.minisat.constraints.cnf.OriginalBinaryClause", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test_add25_add623litNum1667_failAssert192() throws Exception, ContradictionException, TimeoutException {
        try {
            IVecInt clause = new VecInt();
            IVecInt o_test_add25_add623__3 = clause.push((-2)).push(2);
            IVecInt o_test_add25__3 = clause.push((-1)).push(2);
            IConstr o_test_add25__6 = this.solver.addClause(clause);
            int[] array_575868324 = new int[]{3,4};
            	int[] array_1514791894 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__6).getLits();
            	for(int ii = 0; ii <array_575868324.length; ii++) {
            		org.junit.Assert.assertEquals(array_575868324[ii], array_1514791894[ii]);
            	};
            int[] array_1724035434 = new int[]{3,4};
            	int[] array_537650639 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__6).getLits();
            	for(int ii = 0; ii <array_1724035434.length; ii++) {
            		org.junit.Assert.assertEquals(array_1724035434[ii], array_537650639[ii]);
            	};
            IConstr o_test_add25__7 = this.solver.addClause(clause);
            int[] array_1467232237 = new int[]{3,4};
            	int[] array_975816113 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__7).getLits();
            	for(int ii = 0; ii <array_1467232237.length; ii++) {
            		org.junit.Assert.assertEquals(array_1467232237[ii], array_975816113[ii]);
            	};
            int[] array_1506081513 = new int[]{3,4};
            	int[] array_945850769 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__7).getLits();
            	for(int ii = 0; ii <array_1506081513.length; ii++) {
            		org.junit.Assert.assertEquals(array_1506081513[ii], array_945850769[ii]);
            	};
            clause.clear();
            IVecInt o_test_add25__9 = clause.push(1);
            IConstr o_test_add25__10 = this.solver.addClause(clause);
            clause.clear();
            IVecInt o_test_add25__12 = clause.push((-2));
            IConstr o_test_add25__14 = this.solver.addClause(clause);
            this.solver.isSatisfiable();
            this.solver.unsatExplanation();
            org.junit.Assert.fail("test_add25_add623litNum1667 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test_add25_add623litNum1775_failAssert193() throws Exception, ContradictionException, TimeoutException {
        try {
            IVecInt clause = new VecInt();
            IVecInt o_test_add25_add623__3 = clause.push((-1)).push(2);
            IVecInt o_test_add25__3 = clause.push((-1)).push(3);
            IConstr o_test_add25__6 = this.solver.addClause(clause);
            int[] array_575868324 = new int[]{3,4};
            	int[] array_1514791894 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__6).getLits();
            	for(int ii = 0; ii <array_575868324.length; ii++) {
            		org.junit.Assert.assertEquals(array_575868324[ii], array_1514791894[ii]);
            	};
            int[] array_1724035434 = new int[]{3,4};
            	int[] array_537650639 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__6).getLits();
            	for(int ii = 0; ii <array_1724035434.length; ii++) {
            		org.junit.Assert.assertEquals(array_1724035434[ii], array_537650639[ii]);
            	};
            IConstr o_test_add25__7 = this.solver.addClause(clause);
            int[] array_1467232237 = new int[]{3,4};
            	int[] array_975816113 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__7).getLits();
            	for(int ii = 0; ii <array_1467232237.length; ii++) {
            		org.junit.Assert.assertEquals(array_1467232237[ii], array_975816113[ii]);
            	};
            int[] array_1506081513 = new int[]{3,4};
            	int[] array_945850769 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__7).getLits();
            	for(int ii = 0; ii <array_1506081513.length; ii++) {
            		org.junit.Assert.assertEquals(array_1506081513[ii], array_945850769[ii]);
            	};
            clause.clear();
            IVecInt o_test_add25__9 = clause.push(1);
            IConstr o_test_add25__10 = this.solver.addClause(clause);
            clause.clear();
            IVecInt o_test_add25__12 = clause.push((-2));
            IConstr o_test_add25__14 = this.solver.addClause(clause);
            this.solver.isSatisfiable();
            this.solver.unsatExplanation();
            org.junit.Assert.fail("test_add25_add623litNum1775 should have thrown ClassCastException");
        } catch (ClassCastException expected) {
            Assert.assertEquals("org.sat4j.minisat.constraints.cnf.OriginalWLClause cannot be cast to org.sat4j.minisat.constraints.cnf.OriginalBinaryClause", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test_add25_add623litNum1865_failAssert195() throws Exception, ContradictionException, TimeoutException {
        try {
            IVecInt clause = new VecInt();
            IVecInt o_test_add25_add623__3 = clause.push((-1)).push(2);
            IVecInt o_test_add25__3 = clause.push((-1)).push(2);
            IConstr o_test_add25__6 = this.solver.addClause(clause);
            int[] array_575868324 = new int[]{3,4};
            	int[] array_1514791894 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__6).getLits();
            	for(int ii = 0; ii <array_575868324.length; ii++) {
            		org.junit.Assert.assertEquals(array_575868324[ii], array_1514791894[ii]);
            	};
            int[] array_1724035434 = new int[]{3,4};
            	int[] array_537650639 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__6).getLits();
            	for(int ii = 0; ii <array_1724035434.length; ii++) {
            		org.junit.Assert.assertEquals(array_1724035434[ii], array_537650639[ii]);
            	};
            IConstr o_test_add25__7 = this.solver.addClause(clause);
            int[] array_1467232237 = new int[]{3,4};
            	int[] array_975816113 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__7).getLits();
            	for(int ii = 0; ii <array_1467232237.length; ii++) {
            		org.junit.Assert.assertEquals(array_1467232237[ii], array_975816113[ii]);
            	};
            int[] array_1506081513 = new int[]{3,4};
            	int[] array_945850769 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__7).getLits();
            	for(int ii = 0; ii <array_1506081513.length; ii++) {
            		org.junit.Assert.assertEquals(array_1506081513[ii], array_945850769[ii]);
            	};
            clause.clear();
            IVecInt o_test_add25__9 = clause.push(1);
            IConstr o_test_add25__10 = this.solver.addClause(clause);
            clause.clear();
            IVecInt o_test_add25__12 = clause.push((-0));
            IConstr o_test_add25__14 = this.solver.addClause(clause);
            this.solver.isSatisfiable();
            this.solver.unsatExplanation();
            org.junit.Assert.fail("test_add25_add623litNum1865 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test_add25_add623litNum1854_failAssert197() throws Exception, ContradictionException, TimeoutException {
        try {
            IVecInt clause = new VecInt();
            IVecInt o_test_add25_add623__3 = clause.push((-1)).push(2);
            IVecInt o_test_add25__3 = clause.push((-1)).push(2);
            IConstr o_test_add25__6 = this.solver.addClause(clause);
            int[] array_575868324 = new int[]{3,4};
            	int[] array_1514791894 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__6).getLits();
            	for(int ii = 0; ii <array_575868324.length; ii++) {
            		org.junit.Assert.assertEquals(array_575868324[ii], array_1514791894[ii]);
            	};
            int[] array_1724035434 = new int[]{3,4};
            	int[] array_537650639 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__6).getLits();
            	for(int ii = 0; ii <array_1724035434.length; ii++) {
            		org.junit.Assert.assertEquals(array_1724035434[ii], array_537650639[ii]);
            	};
            IConstr o_test_add25__7 = this.solver.addClause(clause);
            int[] array_1467232237 = new int[]{3,4};
            	int[] array_975816113 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__7).getLits();
            	for(int ii = 0; ii <array_1467232237.length; ii++) {
            		org.junit.Assert.assertEquals(array_1467232237[ii], array_975816113[ii]);
            	};
            int[] array_1506081513 = new int[]{3,4};
            	int[] array_945850769 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__7).getLits();
            	for(int ii = 0; ii <array_1506081513.length; ii++) {
            		org.junit.Assert.assertEquals(array_1506081513[ii], array_945850769[ii]);
            	};
            clause.clear();
            IVecInt o_test_add25__9 = clause.push(1);
            IConstr o_test_add25__10 = this.solver.addClause(clause);
            clause.clear();
            IVecInt o_test_add25__12 = clause.push((-1));
            IConstr o_test_add25__14 = this.solver.addClause(clause);
            this.solver.isSatisfiable();
            this.solver.unsatExplanation();
            org.junit.Assert.fail("test_add25_add623litNum1854 should have thrown ContradictionException");
        } catch (ContradictionException expected) {
            Assert.assertEquals("Creating Empty clause ?", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test_add25_add623litNum1808_failAssert198() throws Exception, ContradictionException, TimeoutException {
        try {
            IVecInt clause = new VecInt();
            IVecInt o_test_add25_add623__3 = clause.push((-1)).push(2);
            IVecInt o_test_add25__3 = clause.push((-1)).push(2);
            IConstr o_test_add25__6 = this.solver.addClause(clause);
            int[] array_575868324 = new int[]{3,4};
            	int[] array_1514791894 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__6).getLits();
            	for(int ii = 0; ii <array_575868324.length; ii++) {
            		org.junit.Assert.assertEquals(array_575868324[ii], array_1514791894[ii]);
            	};
            int[] array_1724035434 = new int[]{3,4};
            	int[] array_537650639 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__6).getLits();
            	for(int ii = 0; ii <array_1724035434.length; ii++) {
            		org.junit.Assert.assertEquals(array_1724035434[ii], array_537650639[ii]);
            	};
            IConstr o_test_add25__7 = this.solver.addClause(clause);
            int[] array_1467232237 = new int[]{3,4};
            	int[] array_975816113 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__7).getLits();
            	for(int ii = 0; ii <array_1467232237.length; ii++) {
            		org.junit.Assert.assertEquals(array_1467232237[ii], array_975816113[ii]);
            	};
            int[] array_1506081513 = new int[]{3,4};
            	int[] array_945850769 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__7).getLits();
            	for(int ii = 0; ii <array_1506081513.length; ii++) {
            		org.junit.Assert.assertEquals(array_1506081513[ii], array_945850769[ii]);
            	};
            clause.clear();
            IVecInt o_test_add25__9 = clause.push(0);
            IConstr o_test_add25__10 = this.solver.addClause(clause);
            clause.clear();
            IVecInt o_test_add25__12 = clause.push((-2));
            IConstr o_test_add25__14 = this.solver.addClause(clause);
            this.solver.isSatisfiable();
            this.solver.unsatExplanation();
            org.junit.Assert.fail("test_add25_add623litNum1808 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test_add25_add623litNum1722_failAssert204() throws Exception, ContradictionException, TimeoutException {
        try {
            IVecInt clause = new VecInt();
            IVecInt o_test_add25_add623__3 = clause.push((-1)).push(3);
            IVecInt o_test_add25__3 = clause.push((-1)).push(2);
            IConstr o_test_add25__6 = this.solver.addClause(clause);
            int[] array_575868324 = new int[]{3,4};
            	int[] array_1514791894 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__6).getLits();
            	for(int ii = 0; ii <array_575868324.length; ii++) {
            		org.junit.Assert.assertEquals(array_575868324[ii], array_1514791894[ii]);
            	};
            int[] array_1724035434 = new int[]{3,4};
            	int[] array_537650639 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__6).getLits();
            	for(int ii = 0; ii <array_1724035434.length; ii++) {
            		org.junit.Assert.assertEquals(array_1724035434[ii], array_537650639[ii]);
            	};
            IConstr o_test_add25__7 = this.solver.addClause(clause);
            int[] array_1467232237 = new int[]{3,4};
            	int[] array_975816113 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__7).getLits();
            	for(int ii = 0; ii <array_1467232237.length; ii++) {
            		org.junit.Assert.assertEquals(array_1467232237[ii], array_975816113[ii]);
            	};
            int[] array_1506081513 = new int[]{3,4};
            	int[] array_945850769 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__7).getLits();
            	for(int ii = 0; ii <array_1506081513.length; ii++) {
            		org.junit.Assert.assertEquals(array_1506081513[ii], array_945850769[ii]);
            	};
            clause.clear();
            IVecInt o_test_add25__9 = clause.push(1);
            IConstr o_test_add25__10 = this.solver.addClause(clause);
            clause.clear();
            IVecInt o_test_add25__12 = clause.push((-2));
            IConstr o_test_add25__14 = this.solver.addClause(clause);
            this.solver.isSatisfiable();
            this.solver.unsatExplanation();
            org.junit.Assert.fail("test_add25_add623litNum1722 should have thrown ClassCastException");
        } catch (ClassCastException expected) {
            Assert.assertEquals("org.sat4j.minisat.constraints.cnf.OriginalWLClause cannot be cast to org.sat4j.minisat.constraints.cnf.OriginalBinaryClause", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test_add25_add654litNum1915_failAssert208() throws Exception, ContradictionException, TimeoutException {
        try {
            IVecInt clause = new VecInt();
            IVecInt o_test_add25__3 = clause.push((-1)).push(2);
            IConstr o_test_add25__6 = this.solver.addClause(clause);
            int[] array_1446703237 = new int[]{3,4};
            	int[] array_607863791 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__6).getLits();
            	for(int ii = 0; ii <array_1446703237.length; ii++) {
            		org.junit.Assert.assertEquals(array_1446703237[ii], array_607863791[ii]);
            	};
            int[] array_1724035434 = new int[]{3,4};
            	int[] array_537650639 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__6).getLits();
            	for(int ii = 0; ii <array_1724035434.length; ii++) {
            		org.junit.Assert.assertEquals(array_1724035434[ii], array_537650639[ii]);
            	};
            IConstr o_test_add25__7 = this.solver.addClause(clause);
            int[] array_753014721 = new int[]{3,4};
            	int[] array_903618528 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__7).getLits();
            	for(int ii = 0; ii <array_753014721.length; ii++) {
            		org.junit.Assert.assertEquals(array_753014721[ii], array_903618528[ii]);
            	};
            int[] array_1506081513 = new int[]{3,4};
            	int[] array_945850769 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__7).getLits();
            	for(int ii = 0; ii <array_1506081513.length; ii++) {
            		org.junit.Assert.assertEquals(array_1506081513[ii], array_945850769[ii]);
            	};
            ((OriginalBinaryClause) (o_test_add25__7)).isSatisfied();
            clause.clear();
            IVecInt o_test_add25__9 = clause.push(1);
            IConstr o_test_add25__10 = this.solver.addClause(clause);
            clause.clear();
            IVecInt o_test_add25__12 = clause.push((-(Integer.MIN_VALUE)));
            IConstr o_test_add25__14 = this.solver.addClause(clause);
            this.solver.isSatisfiable();
            this.solver.unsatExplanation();
            org.junit.Assert.fail("test_add25_add654litNum1915 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-2147483648", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test_add25_add654litNum1889_failAssert210() throws Exception, ContradictionException, TimeoutException {
        try {
            IVecInt clause = new VecInt();
            IVecInt o_test_add25__3 = clause.push((-1)).push(2);
            IConstr o_test_add25__6 = this.solver.addClause(clause);
            int[] array_1446703237 = new int[]{3,4};
            	int[] array_607863791 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__6).getLits();
            	for(int ii = 0; ii <array_1446703237.length; ii++) {
            		org.junit.Assert.assertEquals(array_1446703237[ii], array_607863791[ii]);
            	};
            int[] array_1724035434 = new int[]{3,4};
            	int[] array_537650639 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__6).getLits();
            	for(int ii = 0; ii <array_1724035434.length; ii++) {
            		org.junit.Assert.assertEquals(array_1724035434[ii], array_537650639[ii]);
            	};
            IConstr o_test_add25__7 = this.solver.addClause(clause);
            int[] array_753014721 = new int[]{3,4};
            	int[] array_903618528 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__7).getLits();
            	for(int ii = 0; ii <array_753014721.length; ii++) {
            		org.junit.Assert.assertEquals(array_753014721[ii], array_903618528[ii]);
            	};
            int[] array_1506081513 = new int[]{3,4};
            	int[] array_945850769 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_test_add25__7).getLits();
            	for(int ii = 0; ii <array_1506081513.length; ii++) {
            		org.junit.Assert.assertEquals(array_1506081513[ii], array_945850769[ii]);
            	};
            ((OriginalBinaryClause) (o_test_add25__7)).isSatisfied();
            clause.clear();
            IVecInt o_test_add25__9 = clause.push(Integer.MAX_VALUE);
            IConstr o_test_add25__10 = this.solver.addClause(clause);
            clause.clear();
            IVecInt o_test_add25__12 = clause.push((-2));
            IConstr o_test_add25__14 = this.solver.addClause(clause);
            this.solver.isSatisfiable();
            this.solver.unsatExplanation();
            org.junit.Assert.fail("test_add25_add654litNum1889 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }
}

