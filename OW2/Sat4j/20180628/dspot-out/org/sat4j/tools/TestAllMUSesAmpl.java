package org.sat4j.tools;


import java.util.List;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.sat4j.core.VecInt;
import org.sat4j.minisat.SolverFactory;
import org.sat4j.specs.ContradictionException;
import org.sat4j.specs.IConstr;
import org.sat4j.specs.ISolver;
import org.sat4j.specs.IVecInt;
import org.sat4j.specs.TimeoutException;


public class TestAllMUSesAmpl {
    private AllMUSes allMUSes;

    private ISolver solver;

    @Before
    public void setUp() throws Exception {
        this.allMUSes = new AllMUSes(SolverFactory.instance());
        this.solver = allMUSes.getSolverInstance();
    }

    @Test(timeout = 10000)
    public void testGlobalInconsistency() throws Exception, ContradictionException, TimeoutException {
        int o_testGlobalInconsistency__1 = this.solver.newVar(2);
        Assert.assertEquals(2, ((int) (o_testGlobalInconsistency__1)));
        IVecInt clause = new VecInt();
        IVecInt o_testGlobalInconsistency__4 = clause.push(1).push(2);
        Assert.assertEquals("1,2", ((org.sat4j.core.VecInt)o_testGlobalInconsistency__4).toString());
        Assert.assertEquals(1, ((int) (((org.sat4j.core.VecInt)o_testGlobalInconsistency__4).hashCode())));
        Assert.assertFalse(((org.sat4j.core.VecInt)o_testGlobalInconsistency__4).isEmpty());
        IConstr o_testGlobalInconsistency__6 = this.solver.addClause(clause);
        int[] array_1014778677 = new int[]{2, 4, 6};
        	int[] array_1807543333 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testGlobalInconsistency__6).getLits();
        	for(int ii = 0; ii <array_1014778677.length; ii++) {
        		org.junit.Assert.assertEquals(array_1014778677[ii], array_1807543333[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testGlobalInconsistency__6).getActivity())), 0.1);
        Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testGlobalInconsistency__6).isSatisfied());
        Assert.assertEquals("1[?] 2[?] 3[?] ", ((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testGlobalInconsistency__6).toString());
        Assert.assertEquals(4, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testGlobalInconsistency__6).hashCode())));
        clause.clear();
        IVecInt o_testGlobalInconsistency__8 = clause.push(1).push((-2));
        Assert.assertEquals("1,-2", ((org.sat4j.core.VecInt)o_testGlobalInconsistency__8).toString());
        Assert.assertEquals(0, ((int) (((org.sat4j.core.VecInt)o_testGlobalInconsistency__8).hashCode())));
        Assert.assertFalse(((org.sat4j.core.VecInt)o_testGlobalInconsistency__8).isEmpty());
        IConstr o_testGlobalInconsistency__11 = this.solver.addClause(clause);
        int[] array_1951477550 = new int[]{2, 5, 8};
        	int[] array_795769093 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testGlobalInconsistency__11).getLits();
        	for(int ii = 0; ii <array_1951477550.length; ii++) {
        		org.junit.Assert.assertEquals(array_1951477550[ii], array_795769093[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testGlobalInconsistency__11).getActivity())), 0.1);
        Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testGlobalInconsistency__11).isSatisfied());
        Assert.assertEquals("1[?] -2[?] 4[?] ", ((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testGlobalInconsistency__11).toString());
        Assert.assertEquals(5, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testGlobalInconsistency__11).hashCode())));
        clause.clear();
        IVecInt o_testGlobalInconsistency__13 = clause.push((-1)).push(2);
        Assert.assertEquals("-1,2", ((org.sat4j.core.VecInt)o_testGlobalInconsistency__13).toString());
        Assert.assertEquals(0, ((int) (((org.sat4j.core.VecInt)o_testGlobalInconsistency__13).hashCode())));
        Assert.assertFalse(((org.sat4j.core.VecInt)o_testGlobalInconsistency__13).isEmpty());
        IConstr o_testGlobalInconsistency__16 = this.solver.addClause(clause);
        int[] array_271746577 = new int[]{3, 4, 10};
        	int[] array_1525125080 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testGlobalInconsistency__16).getLits();
        	for(int ii = 0; ii <array_271746577.length; ii++) {
        		org.junit.Assert.assertEquals(array_271746577[ii], array_1525125080[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testGlobalInconsistency__16).getActivity())), 0.1);
        Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testGlobalInconsistency__16).isSatisfied());
        Assert.assertEquals("-1[?] 2[?] 5[?] ", ((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testGlobalInconsistency__16).toString());
        Assert.assertEquals(5, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testGlobalInconsistency__16).hashCode())));
        clause.clear();
        IVecInt o_testGlobalInconsistency__18 = clause.push((-1)).push((-2));
        Assert.assertEquals("-1,-2", ((org.sat4j.core.VecInt)o_testGlobalInconsistency__18).toString());
        Assert.assertEquals(-1, ((int) (((org.sat4j.core.VecInt)o_testGlobalInconsistency__18).hashCode())));
        Assert.assertFalse(((org.sat4j.core.VecInt)o_testGlobalInconsistency__18).isEmpty());
        IConstr o_testGlobalInconsistency__22 = this.solver.addClause(clause);
        int[] array_573926002 = new int[]{3, 5, 12};
        	int[] array_21125798 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testGlobalInconsistency__22).getLits();
        	for(int ii = 0; ii <array_573926002.length; ii++) {
        		org.junit.Assert.assertEquals(array_573926002[ii], array_21125798[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testGlobalInconsistency__22).getActivity())), 0.1);
        Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testGlobalInconsistency__22).isSatisfied());
        Assert.assertEquals("-1[?] -2[?] 6[?] ", ((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testGlobalInconsistency__22).toString());
        Assert.assertEquals(6, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testGlobalInconsistency__22).hashCode())));
        clause.clear();
        List<IVecInt> muses = allMUSes.computeAllMUSes();
        int o_testGlobalInconsistency__26 = muses.size();
        Assert.assertEquals(1, ((int) (o_testGlobalInconsistency__26)));
        Assert.assertEquals(2, ((int) (o_testGlobalInconsistency__1)));
        Assert.assertEquals("", ((org.sat4j.core.VecInt)o_testGlobalInconsistency__4).toString());
        Assert.assertTrue(((org.sat4j.core.VecInt)o_testGlobalInconsistency__4).isEmpty());
        int[] array_2033489896 = new int[]{2, 4, 6};
        	int[] array_1271429239 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testGlobalInconsistency__6).getLits();
        	for(int ii = 0; ii <array_2033489896.length; ii++) {
        		org.junit.Assert.assertEquals(array_2033489896[ii], array_1271429239[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testGlobalInconsistency__6).getActivity())), 0.1);
        Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testGlobalInconsistency__6).isSatisfied());
        Assert.assertEquals("1[?] 2[?] 3[F] ", ((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testGlobalInconsistency__6).toString());
        Assert.assertEquals(4, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testGlobalInconsistency__6).hashCode())));
        Assert.assertEquals("", ((org.sat4j.core.VecInt)o_testGlobalInconsistency__8).toString());
        Assert.assertTrue(((org.sat4j.core.VecInt)o_testGlobalInconsistency__8).isEmpty());
        int[] array_528037162 = new int[]{2, 5, 8};
        	int[] array_1267006314 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testGlobalInconsistency__11).getLits();
        	for(int ii = 0; ii <array_528037162.length; ii++) {
        		org.junit.Assert.assertEquals(array_528037162[ii], array_1267006314[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testGlobalInconsistency__11).getActivity())), 0.1);
        Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testGlobalInconsistency__11).isSatisfied());
        Assert.assertEquals("1[?] -2[?] 4[F] ", ((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testGlobalInconsistency__11).toString());
        Assert.assertEquals(5, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testGlobalInconsistency__11).hashCode())));
        Assert.assertEquals("", ((org.sat4j.core.VecInt)o_testGlobalInconsistency__13).toString());
        Assert.assertTrue(((org.sat4j.core.VecInt)o_testGlobalInconsistency__13).isEmpty());
        int[] array_548180185 = new int[]{4, 10, 3};
        	int[] array_2080400486 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testGlobalInconsistency__16).getLits();
        	for(int ii = 0; ii <array_548180185.length; ii++) {
        		org.junit.Assert.assertEquals(array_548180185[ii], array_2080400486[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testGlobalInconsistency__16).getActivity())), 0.1);
        Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testGlobalInconsistency__16).isSatisfied());
        Assert.assertEquals("2[?] 5[F] -1[?] ", ((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testGlobalInconsistency__16).toString());
        Assert.assertEquals(5, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testGlobalInconsistency__16).hashCode())));
        Assert.assertEquals("", ((org.sat4j.core.VecInt)o_testGlobalInconsistency__18).toString());
        Assert.assertTrue(((org.sat4j.core.VecInt)o_testGlobalInconsistency__18).isEmpty());
        int[] array_1043710295 = new int[]{5, 12, 3};
        	int[] array_1720103287 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testGlobalInconsistency__22).getLits();
        	for(int ii = 0; ii <array_1043710295.length; ii++) {
        		org.junit.Assert.assertEquals(array_1043710295[ii], array_1720103287[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testGlobalInconsistency__22).getActivity())), 0.1);
        Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testGlobalInconsistency__22).isSatisfied());
        Assert.assertEquals("-2[?] 6[F] -1[?] ", ((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testGlobalInconsistency__22).toString());
        Assert.assertEquals(6, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testGlobalInconsistency__22).hashCode())));
    }

    @Test(timeout = 10000)
    public void testEclipseTestCase2() throws Exception, ContradictionException, TimeoutException {
        int o_testEclipseTestCase2__1 = this.solver.newVar(4);
        Assert.assertEquals(4, ((int) (o_testEclipseTestCase2__1)));
        IVecInt clause = new VecInt();
        IVecInt o_testEclipseTestCase2__4 = clause.push((-1)).push(2);
        Assert.assertEquals("-1,2", ((org.sat4j.core.VecInt)o_testEclipseTestCase2__4).toString());
        Assert.assertEquals(0, ((int) (((org.sat4j.core.VecInt)o_testEclipseTestCase2__4).hashCode())));
        Assert.assertFalse(((org.sat4j.core.VecInt)o_testEclipseTestCase2__4).isEmpty());
        IConstr o_testEclipseTestCase2__7 = this.solver.addClause(clause);
        int[] array_1173932210 = new int[]{3, 4, 10};
        	int[] array_1749666106 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testEclipseTestCase2__7).getLits();
        	for(int ii = 0; ii <array_1173932210.length; ii++) {
        		org.junit.Assert.assertEquals(array_1173932210[ii], array_1749666106[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testEclipseTestCase2__7).getActivity())), 0.1);
        Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testEclipseTestCase2__7).isSatisfied());
        Assert.assertEquals("-1[?] 2[?] 5[?] ", ((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testEclipseTestCase2__7).toString());
        Assert.assertEquals(5, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testEclipseTestCase2__7).hashCode())));
        clause.clear();
        IVecInt o_testEclipseTestCase2__9 = clause.push((-1)).push(3);
        Assert.assertEquals("-1,3", ((org.sat4j.core.VecInt)o_testEclipseTestCase2__9).toString());
        Assert.assertEquals(1, ((int) (((org.sat4j.core.VecInt)o_testEclipseTestCase2__9).hashCode())));
        Assert.assertFalse(((org.sat4j.core.VecInt)o_testEclipseTestCase2__9).isEmpty());
        IConstr o_testEclipseTestCase2__12 = this.solver.addClause(clause);
        int[] array_1150978389 = new int[]{3, 6, 12};
        	int[] array_1071459684 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testEclipseTestCase2__12).getLits();
        	for(int ii = 0; ii <array_1150978389.length; ii++) {
        		org.junit.Assert.assertEquals(array_1150978389[ii], array_1071459684[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testEclipseTestCase2__12).getActivity())), 0.1);
        Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testEclipseTestCase2__12).isSatisfied());
        Assert.assertEquals("-1[?] 3[?] 6[?] ", ((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testEclipseTestCase2__12).toString());
        Assert.assertEquals(7, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testEclipseTestCase2__12).hashCode())));
        clause.clear();
        IVecInt o_testEclipseTestCase2__14 = clause.push((-2)).push((-3));
        Assert.assertEquals("-2,-3", ((org.sat4j.core.VecInt)o_testEclipseTestCase2__14).toString());
        Assert.assertEquals(-2, ((int) (((org.sat4j.core.VecInt)o_testEclipseTestCase2__14).hashCode())));
        Assert.assertFalse(((org.sat4j.core.VecInt)o_testEclipseTestCase2__14).isEmpty());
        IConstr o_testEclipseTestCase2__18 = this.solver.addClause(clause);
        int[] array_469502747 = new int[]{5, 7, 14};
        	int[] array_979578557 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testEclipseTestCase2__18).getLits();
        	for(int ii = 0; ii <array_469502747.length; ii++) {
        		org.junit.Assert.assertEquals(array_469502747[ii], array_979578557[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testEclipseTestCase2__18).getActivity())), 0.1);
        Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testEclipseTestCase2__18).isSatisfied());
        Assert.assertEquals("-2[?] -3[?] 7[?] ", ((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testEclipseTestCase2__18).toString());
        Assert.assertEquals(8, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testEclipseTestCase2__18).hashCode())));
        clause.clear();
        IVecInt o_testEclipseTestCase2__20 = clause.push((-4)).push(1);
        Assert.assertEquals("-4,1", ((org.sat4j.core.VecInt)o_testEclipseTestCase2__20).toString());
        Assert.assertEquals(-1, ((int) (((org.sat4j.core.VecInt)o_testEclipseTestCase2__20).hashCode())));
        Assert.assertFalse(((org.sat4j.core.VecInt)o_testEclipseTestCase2__20).isEmpty());
        IConstr o_testEclipseTestCase2__23 = this.solver.addClause(clause);
        int[] array_1505372927 = new int[]{2, 9, 16};
        	int[] array_835295846 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testEclipseTestCase2__23).getLits();
        	for(int ii = 0; ii <array_1505372927.length; ii++) {
        		org.junit.Assert.assertEquals(array_1505372927[ii], array_835295846[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testEclipseTestCase2__23).getActivity())), 0.1);
        Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testEclipseTestCase2__23).isSatisfied());
        Assert.assertEquals("1[?] -4[?] 8[?] ", ((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testEclipseTestCase2__23).toString());
        Assert.assertEquals(9, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testEclipseTestCase2__23).hashCode())));
        clause.clear();
        List<IVecInt> muses = allMUSes.computeAllMUSes();
        int o_testEclipseTestCase2__27 = muses.size();
        Assert.assertEquals(0, ((int) (o_testEclipseTestCase2__27)));
        Assert.assertEquals(4, ((int) (o_testEclipseTestCase2__1)));
        Assert.assertEquals("", ((org.sat4j.core.VecInt)o_testEclipseTestCase2__4).toString());
        Assert.assertTrue(((org.sat4j.core.VecInt)o_testEclipseTestCase2__4).isEmpty());
        int[] array_374338128 = new int[]{3, 4, 10};
        	int[] array_493514425 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testEclipseTestCase2__7).getLits();
        	for(int ii = 0; ii <array_374338128.length; ii++) {
        		org.junit.Assert.assertEquals(array_374338128[ii], array_493514425[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testEclipseTestCase2__7).getActivity())), 0.1);
        Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testEclipseTestCase2__7).isSatisfied());
        Assert.assertEquals("-1[?] 2[?] 5[?] ", ((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testEclipseTestCase2__7).toString());
        Assert.assertEquals(5, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testEclipseTestCase2__7).hashCode())));
        Assert.assertEquals("", ((org.sat4j.core.VecInt)o_testEclipseTestCase2__9).toString());
        Assert.assertTrue(((org.sat4j.core.VecInt)o_testEclipseTestCase2__9).isEmpty());
        int[] array_1125692951 = new int[]{3, 6, 12};
        	int[] array_1152772302 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testEclipseTestCase2__12).getLits();
        	for(int ii = 0; ii <array_1125692951.length; ii++) {
        		org.junit.Assert.assertEquals(array_1125692951[ii], array_1152772302[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testEclipseTestCase2__12).getActivity())), 0.1);
        Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testEclipseTestCase2__12).isSatisfied());
        Assert.assertEquals("-1[?] 3[?] 6[?] ", ((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testEclipseTestCase2__12).toString());
        Assert.assertEquals(7, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testEclipseTestCase2__12).hashCode())));
        Assert.assertEquals("", ((org.sat4j.core.VecInt)o_testEclipseTestCase2__14).toString());
        Assert.assertTrue(((org.sat4j.core.VecInt)o_testEclipseTestCase2__14).isEmpty());
        int[] array_403966787 = new int[]{5, 7, 14};
        	int[] array_426445072 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testEclipseTestCase2__18).getLits();
        	for(int ii = 0; ii <array_403966787.length; ii++) {
        		org.junit.Assert.assertEquals(array_403966787[ii], array_426445072[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testEclipseTestCase2__18).getActivity())), 0.1);
        Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testEclipseTestCase2__18).isSatisfied());
        Assert.assertEquals("-2[?] -3[?] 7[?] ", ((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testEclipseTestCase2__18).toString());
        Assert.assertEquals(8, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testEclipseTestCase2__18).hashCode())));
        Assert.assertEquals("", ((org.sat4j.core.VecInt)o_testEclipseTestCase2__20).toString());
        Assert.assertTrue(((org.sat4j.core.VecInt)o_testEclipseTestCase2__20).isEmpty());
        int[] array_388526397 = new int[]{9, 16, 2};
        	int[] array_1518421836 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testEclipseTestCase2__23).getLits();
        	for(int ii = 0; ii <array_388526397.length; ii++) {
        		org.junit.Assert.assertEquals(array_388526397[ii], array_1518421836[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testEclipseTestCase2__23).getActivity())), 0.1);
        Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testEclipseTestCase2__23).isSatisfied());
        Assert.assertEquals("-4[?] 8[?] 1[?] ", ((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testEclipseTestCase2__23).toString());
        Assert.assertEquals(9, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testEclipseTestCase2__23).hashCode())));
    }

    @Test(timeout = 10000)
    public void testVerySimpleCase() throws Exception {
        IVecInt c1 = new VecInt();
        IVecInt c2 = new VecInt();
        IVecInt o_testVerySimpleCase__5 = c1.push(1);
        Assert.assertEquals("1", ((org.sat4j.core.VecInt)o_testVerySimpleCase__5).toString());
        Assert.assertEquals(1, ((int) (((org.sat4j.core.VecInt)o_testVerySimpleCase__5).hashCode())));
        Assert.assertFalse(((org.sat4j.core.VecInt)o_testVerySimpleCase__5).isEmpty());
        IVecInt o_testVerySimpleCase__6 = c2.push((-1));
        Assert.assertEquals("-1", ((org.sat4j.core.VecInt)o_testVerySimpleCase__6).toString());
        Assert.assertEquals(-1, ((int) (((org.sat4j.core.VecInt)o_testVerySimpleCase__6).hashCode())));
        Assert.assertFalse(((org.sat4j.core.VecInt)o_testVerySimpleCase__6).isEmpty());
        int o_testVerySimpleCase__8 = this.solver.newVar(1);
        Assert.assertEquals(1, ((int) (o_testVerySimpleCase__8)));
        try {
            IConstr o_testVerySimpleCase__11 = this.solver.addClause(c1);
            int[] array_952687826 = new int[]{2, 4};
            	int[] array_943728346 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testVerySimpleCase__11).getLits();
            	for(int ii = 0; ii <array_952687826.length; ii++) {
            		org.junit.Assert.assertEquals(array_952687826[ii], array_943728346[ii]);
            	};
            Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testVerySimpleCase__11).getActivity())), 0.1);
            Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testVerySimpleCase__11).isSatisfied());
            Assert.assertEquals("1[?] 2[?]", ((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testVerySimpleCase__11).toString());
            Assert.assertEquals(3, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testVerySimpleCase__11).hashCode())));
            IConstr o_testVerySimpleCase__12 = this.solver.addClause(c2);
            int[] array_637517741 = new int[]{3, 6};
            	int[] array_1729988776 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testVerySimpleCase__12).getLits();
            	for(int ii = 0; ii <array_637517741.length; ii++) {
            		org.junit.Assert.assertEquals(array_637517741[ii], array_1729988776[ii]);
            	};
            Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testVerySimpleCase__12).getActivity())), 0.1);
            Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testVerySimpleCase__12).isSatisfied());
            Assert.assertEquals("-1[?] 3[?]", ((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testVerySimpleCase__12).toString());
            Assert.assertEquals(4, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testVerySimpleCase__12).hashCode())));
            List<IVecInt> muses = this.allMUSes.computeAllMUSes();
            int o_testVerySimpleCase__15 = muses.size();
            Assert.assertEquals(1, ((int) (o_testVerySimpleCase__15)));
            int[] array_1043982111 = new int[]{2, 4};
            	int[] array_432070049 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testVerySimpleCase__11).getLits();
            	for(int ii = 0; ii <array_1043982111.length; ii++) {
            		org.junit.Assert.assertEquals(array_1043982111[ii], array_432070049[ii]);
            	};
            Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testVerySimpleCase__11).getActivity())), 0.1);
            Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testVerySimpleCase__11).isSatisfied());
            Assert.assertEquals("1[?] 2[F]", ((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testVerySimpleCase__11).toString());
            Assert.assertEquals(3, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testVerySimpleCase__11).hashCode())));
            int[] array_1644972435 = new int[]{3, 6};
            	int[] array_932571789 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testVerySimpleCase__12).getLits();
            	for(int ii = 0; ii <array_1644972435.length; ii++) {
            		org.junit.Assert.assertEquals(array_1644972435[ii], array_932571789[ii]);
            	};
            Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testVerySimpleCase__12).getActivity())), 0.1);
            Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testVerySimpleCase__12).isSatisfied());
            Assert.assertEquals("-1[?] 3[F]", ((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testVerySimpleCase__12).toString());
            Assert.assertEquals(4, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testVerySimpleCase__12).hashCode())));
        } catch (ContradictionException e) {
            e.printStackTrace();
        }
        Assert.assertEquals("1,2", ((org.sat4j.core.VecInt)o_testVerySimpleCase__5).toString());
        Assert.assertEquals(1, ((int) (((org.sat4j.core.VecInt)o_testVerySimpleCase__5).hashCode())));
        Assert.assertFalse(((org.sat4j.core.VecInt)o_testVerySimpleCase__5).isEmpty());
        Assert.assertEquals("-1,3", ((org.sat4j.core.VecInt)o_testVerySimpleCase__6).toString());
        Assert.assertEquals(1, ((int) (((org.sat4j.core.VecInt)o_testVerySimpleCase__6).hashCode())));
        Assert.assertFalse(((org.sat4j.core.VecInt)o_testVerySimpleCase__6).isEmpty());
        Assert.assertEquals(1, ((int) (o_testVerySimpleCase__8)));
    }

    @Test(timeout = 10000)
    public void testExample3CADECedric() throws Exception, ContradictionException, TimeoutException {
        int o_testExample3CADECedric__1 = this.solver.newVar(6);
        Assert.assertEquals(6, ((int) (o_testExample3CADECedric__1)));
        IVecInt clause = new VecInt();
        IVecInt o_testExample3CADECedric__4 = clause.push(1);
        Assert.assertEquals("1", ((org.sat4j.core.VecInt)o_testExample3CADECedric__4).toString());
        Assert.assertEquals(1, ((int) (((org.sat4j.core.VecInt)o_testExample3CADECedric__4).hashCode())));
        Assert.assertFalse(((org.sat4j.core.VecInt)o_testExample3CADECedric__4).isEmpty());
        IConstr o_testExample3CADECedric__5 = this.solver.addClause(clause);
        int[] array_758981284 = new int[]{2, 14};
        	int[] array_323067337 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testExample3CADECedric__5).getLits();
        	for(int ii = 0; ii <array_758981284.length; ii++) {
        		org.junit.Assert.assertEquals(array_758981284[ii], array_323067337[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testExample3CADECedric__5).getActivity())), 0.1);
        Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testExample3CADECedric__5).isSatisfied());
        Assert.assertEquals("1[?] 7[?]", ((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testExample3CADECedric__5).toString());
        Assert.assertEquals(8, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testExample3CADECedric__5).hashCode())));
        clause.clear();
        IVecInt o_testExample3CADECedric__7 = clause.push(2).push(4);
        Assert.assertEquals("2,4", ((org.sat4j.core.VecInt)o_testExample3CADECedric__7).toString());
        Assert.assertEquals(3, ((int) (((org.sat4j.core.VecInt)o_testExample3CADECedric__7).hashCode())));
        Assert.assertFalse(((org.sat4j.core.VecInt)o_testExample3CADECedric__7).isEmpty());
        IConstr o_testExample3CADECedric__9 = this.solver.addClause(clause);
        int[] array_738477146 = new int[]{4, 8, 16};
        	int[] array_237581701 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__9).getLits();
        	for(int ii = 0; ii <array_738477146.length; ii++) {
        		org.junit.Assert.assertEquals(array_738477146[ii], array_237581701[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__9).getActivity())), 0.1);
        Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__9).isSatisfied());
        Assert.assertEquals("2[?] 4[?] 8[?] ", ((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__9).toString());
        Assert.assertEquals(9, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__9).hashCode())));
        clause.clear();
        IVecInt o_testExample3CADECedric__11 = clause.push((-2)).push((-5));
        Assert.assertEquals("-2,-5", ((org.sat4j.core.VecInt)o_testExample3CADECedric__11).toString());
        Assert.assertEquals(-3, ((int) (((org.sat4j.core.VecInt)o_testExample3CADECedric__11).hashCode())));
        Assert.assertFalse(((org.sat4j.core.VecInt)o_testExample3CADECedric__11).isEmpty());
        IConstr o_testExample3CADECedric__15 = this.solver.addClause(clause);
        int[] array_1598938065 = new int[]{5, 11, 18};
        	int[] array_2014885925 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__15).getLits();
        	for(int ii = 0; ii <array_1598938065.length; ii++) {
        		org.junit.Assert.assertEquals(array_1598938065[ii], array_2014885925[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__15).getActivity())), 0.1);
        Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__15).isSatisfied());
        Assert.assertEquals("-2[?] -5[?] 9[?] ", ((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__15).toString());
        Assert.assertEquals(11, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__15).hashCode())));
        clause.clear();
        IVecInt o_testExample3CADECedric__17 = clause.push(1).push(4);
        Assert.assertEquals("1,4", ((org.sat4j.core.VecInt)o_testExample3CADECedric__17).toString());
        Assert.assertEquals(2, ((int) (((org.sat4j.core.VecInt)o_testExample3CADECedric__17).hashCode())));
        Assert.assertFalse(((org.sat4j.core.VecInt)o_testExample3CADECedric__17).isEmpty());
        IConstr o_testExample3CADECedric__19 = this.solver.addClause(clause);
        int[] array_739419041 = new int[]{2, 8, 20};
        	int[] array_113152347 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__19).getLits();
        	for(int ii = 0; ii <array_739419041.length; ii++) {
        		org.junit.Assert.assertEquals(array_739419041[ii], array_113152347[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__19).getActivity())), 0.1);
        Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__19).isSatisfied());
        Assert.assertEquals("1[?] 4[?] 10[?] ", ((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__19).toString());
        Assert.assertEquals(10, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__19).hashCode())));
        clause.clear();
        IVecInt o_testExample3CADECedric__21 = clause.push(2).push((-3));
        Assert.assertEquals("2,-3", ((org.sat4j.core.VecInt)o_testExample3CADECedric__21).toString());
        Assert.assertEquals(0, ((int) (((org.sat4j.core.VecInt)o_testExample3CADECedric__21).hashCode())));
        Assert.assertFalse(((org.sat4j.core.VecInt)o_testExample3CADECedric__21).isEmpty());
        IConstr o_testExample3CADECedric__24 = this.solver.addClause(clause);
        int[] array_542285104 = new int[]{4, 7, 22};
        	int[] array_1113299406 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__24).getLits();
        	for(int ii = 0; ii <array_542285104.length; ii++) {
        		org.junit.Assert.assertEquals(array_542285104[ii], array_1113299406[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__24).getActivity())), 0.1);
        Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__24).isSatisfied());
        Assert.assertEquals("2[?] -3[?] 11[?] ", ((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__24).toString());
        Assert.assertEquals(11, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__24).hashCode())));
        clause.clear();
        IVecInt o_testExample3CADECedric__26 = clause.push(6);
        Assert.assertEquals("6", ((org.sat4j.core.VecInt)o_testExample3CADECedric__26).toString());
        Assert.assertEquals(6, ((int) (((org.sat4j.core.VecInt)o_testExample3CADECedric__26).hashCode())));
        Assert.assertFalse(((org.sat4j.core.VecInt)o_testExample3CADECedric__26).isEmpty());
        IConstr o_testExample3CADECedric__27 = this.solver.addClause(clause);
        int[] array_542859932 = new int[]{12, 24};
        	int[] array_288947405 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testExample3CADECedric__27).getLits();
        	for(int ii = 0; ii <array_542859932.length; ii++) {
        		org.junit.Assert.assertEquals(array_542859932[ii], array_288947405[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testExample3CADECedric__27).getActivity())), 0.1);
        Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testExample3CADECedric__27).isSatisfied());
        Assert.assertEquals("6[?] 12[?]", ((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testExample3CADECedric__27).toString());
        Assert.assertEquals(18, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testExample3CADECedric__27).hashCode())));
        clause.clear();
        IVecInt o_testExample3CADECedric__29 = clause.push(3).push((-4));
        Assert.assertEquals("3,-4", ((org.sat4j.core.VecInt)o_testExample3CADECedric__29).toString());
        Assert.assertEquals(0, ((int) (((org.sat4j.core.VecInt)o_testExample3CADECedric__29).hashCode())));
        Assert.assertFalse(((org.sat4j.core.VecInt)o_testExample3CADECedric__29).isEmpty());
        IConstr o_testExample3CADECedric__32 = this.solver.addClause(clause);
        int[] array_217909470 = new int[]{6, 9, 26};
        	int[] array_1594241263 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__32).getLits();
        	for(int ii = 0; ii <array_217909470.length; ii++) {
        		org.junit.Assert.assertEquals(array_217909470[ii], array_1594241263[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__32).getActivity())), 0.1);
        Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__32).isSatisfied());
        Assert.assertEquals("3[?] -4[?] 13[?] ", ((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__32).toString());
        Assert.assertEquals(13, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__32).hashCode())));
        clause.clear();
        IVecInt o_testExample3CADECedric__34 = clause.push((-1));
        Assert.assertEquals("-1", ((org.sat4j.core.VecInt)o_testExample3CADECedric__34).toString());
        Assert.assertEquals(-1, ((int) (((org.sat4j.core.VecInt)o_testExample3CADECedric__34).hashCode())));
        Assert.assertFalse(((org.sat4j.core.VecInt)o_testExample3CADECedric__34).isEmpty());
        IConstr o_testExample3CADECedric__36 = this.solver.addClause(clause);
        int[] array_1262462105 = new int[]{3, 28};
        	int[] array_1145255968 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testExample3CADECedric__36).getLits();
        	for(int ii = 0; ii <array_1262462105.length; ii++) {
        		org.junit.Assert.assertEquals(array_1262462105[ii], array_1145255968[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testExample3CADECedric__36).getActivity())), 0.1);
        Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testExample3CADECedric__36).isSatisfied());
        Assert.assertEquals("-1[?] 14[?]", ((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testExample3CADECedric__36).toString());
        Assert.assertEquals(15, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testExample3CADECedric__36).hashCode())));
        clause.clear();
        IVecInt o_testExample3CADECedric__38 = clause.push((-2)).push((-3));
        Assert.assertEquals("-2,-3", ((org.sat4j.core.VecInt)o_testExample3CADECedric__38).toString());
        Assert.assertEquals(-2, ((int) (((org.sat4j.core.VecInt)o_testExample3CADECedric__38).hashCode())));
        Assert.assertFalse(((org.sat4j.core.VecInt)o_testExample3CADECedric__38).isEmpty());
        IConstr o_testExample3CADECedric__42 = this.solver.addClause(clause);
        int[] array_1120430660 = new int[]{5, 7, 30};
        	int[] array_880546439 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__42).getLits();
        	for(int ii = 0; ii <array_1120430660.length; ii++) {
        		org.junit.Assert.assertEquals(array_1120430660[ii], array_880546439[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__42).getActivity())), 0.1);
        Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__42).isSatisfied());
        Assert.assertEquals("-2[?] -3[?] 15[?] ", ((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__42).toString());
        Assert.assertEquals(14, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__42).hashCode())));
        clause.clear();
        IVecInt o_testExample3CADECedric__44 = clause.push(2).push(4).push(6);
        Assert.assertEquals("2,4,6", ((org.sat4j.core.VecInt)o_testExample3CADECedric__44).toString());
        Assert.assertEquals(4, ((int) (((org.sat4j.core.VecInt)o_testExample3CADECedric__44).hashCode())));
        Assert.assertFalse(((org.sat4j.core.VecInt)o_testExample3CADECedric__44).isEmpty());
        IConstr o_testExample3CADECedric__47 = this.solver.addClause(clause);
        int[] array_992979946 = new int[]{4, 8, 12, 32};
        	int[] array_222622855 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__47).getLits();
        	for(int ii = 0; ii <array_992979946.length; ii++) {
        		org.junit.Assert.assertEquals(array_992979946[ii], array_222622855[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__47).getActivity())), 0.1);
        Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__47).isSatisfied());
        Assert.assertEquals("2[?] 4[?] 6[?] 16[?] ", ((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__47).toString());
        Assert.assertEquals(14, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__47).hashCode())));
        clause.clear();
        IVecInt o_testExample3CADECedric__49 = clause.push(5);
        Assert.assertEquals("5", ((org.sat4j.core.VecInt)o_testExample3CADECedric__49).toString());
        Assert.assertEquals(5, ((int) (((org.sat4j.core.VecInt)o_testExample3CADECedric__49).hashCode())));
        Assert.assertFalse(((org.sat4j.core.VecInt)o_testExample3CADECedric__49).isEmpty());
        IConstr o_testExample3CADECedric__50 = this.solver.addClause(clause);
        int[] array_2088225685 = new int[]{10, 34};
        	int[] array_100151216 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testExample3CADECedric__50).getLits();
        	for(int ii = 0; ii <array_2088225685.length; ii++) {
        		org.junit.Assert.assertEquals(array_2088225685[ii], array_100151216[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testExample3CADECedric__50).getActivity())), 0.1);
        Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testExample3CADECedric__50).isSatisfied());
        Assert.assertEquals("5[?] 17[?]", ((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testExample3CADECedric__50).toString());
        Assert.assertEquals(22, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testExample3CADECedric__50).hashCode())));
        clause.clear();
        IVecInt o_testExample3CADECedric__52 = clause.push((-6)).push(4);
        Assert.assertEquals("-6,4", ((org.sat4j.core.VecInt)o_testExample3CADECedric__52).toString());
        Assert.assertEquals(-1, ((int) (((org.sat4j.core.VecInt)o_testExample3CADECedric__52).hashCode())));
        Assert.assertFalse(((org.sat4j.core.VecInt)o_testExample3CADECedric__52).isEmpty());
        IConstr o_testExample3CADECedric__55 = this.solver.addClause(clause);
        int[] array_1935660128 = new int[]{8, 13, 36};
        	int[] array_435813242 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__55).getLits();
        	for(int ii = 0; ii <array_1935660128.length; ii++) {
        		org.junit.Assert.assertEquals(array_1935660128[ii], array_435813242[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__55).getActivity())), 0.1);
        Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__55).isSatisfied());
        Assert.assertEquals("4[?] -6[?] 18[?] ", ((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__55).toString());
        Assert.assertEquals(19, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__55).hashCode())));
        clause.clear();
        IVecInt o_testExample3CADECedric__57 = clause.push((-5)).push((-6));
        Assert.assertEquals("-5,-6", ((org.sat4j.core.VecInt)o_testExample3CADECedric__57).toString());
        Assert.assertEquals(-5, ((int) (((org.sat4j.core.VecInt)o_testExample3CADECedric__57).hashCode())));
        Assert.assertFalse(((org.sat4j.core.VecInt)o_testExample3CADECedric__57).isEmpty());
        IConstr o_testExample3CADECedric__61 = this.solver.addClause(clause);
        int[] array_714347117 = new int[]{11, 13, 38};
        	int[] array_1619729999 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__61).getLits();
        	for(int ii = 0; ii <array_714347117.length; ii++) {
        		org.junit.Assert.assertEquals(array_714347117[ii], array_1619729999[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__61).getActivity())), 0.1);
        Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__61).isSatisfied());
        Assert.assertEquals("-5[?] -6[?] 19[?] ", ((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__61).toString());
        Assert.assertEquals(20, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__61).hashCode())));
        clause.clear();
        IVecInt o_testExample3CADECedric__63 = clause.push(1).push((-3)).push(4);
        Assert.assertEquals("1,-3,4", ((org.sat4j.core.VecInt)o_testExample3CADECedric__63).toString());
        Assert.assertEquals(0, ((int) (((org.sat4j.core.VecInt)o_testExample3CADECedric__63).hashCode())));
        Assert.assertFalse(((org.sat4j.core.VecInt)o_testExample3CADECedric__63).isEmpty());
        IConstr o_testExample3CADECedric__67 = this.solver.addClause(clause);
        int[] array_925052670 = new int[]{2, 7, 8, 40};
        	int[] array_1885232289 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__67).getLits();
        	for(int ii = 0; ii <array_925052670.length; ii++) {
        		org.junit.Assert.assertEquals(array_925052670[ii], array_1885232289[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__67).getActivity())), 0.1);
        Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__67).isSatisfied());
        Assert.assertEquals("1[?] -3[?] 4[?] 20[?] ", ((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__67).toString());
        Assert.assertEquals(14, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__67).hashCode())));
        clause.clear();
        List<IVecInt> muses = allMUSes.computeAllMUSes();
        int o_testExample3CADECedric__71 = muses.size();
        Assert.assertEquals(9, ((int) (o_testExample3CADECedric__71)));
        Assert.assertEquals(6, ((int) (o_testExample3CADECedric__1)));
        Assert.assertEquals("", ((org.sat4j.core.VecInt)o_testExample3CADECedric__4).toString());
        Assert.assertTrue(((org.sat4j.core.VecInt)o_testExample3CADECedric__4).isEmpty());
        int[] array_110211353 = new int[]{2, 14};
        	int[] array_483770255 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testExample3CADECedric__5).getLits();
        	for(int ii = 0; ii <array_110211353.length; ii++) {
        		org.junit.Assert.assertEquals(array_110211353[ii], array_483770255[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testExample3CADECedric__5).getActivity())), 0.1);
        Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testExample3CADECedric__5).isSatisfied());
        Assert.assertEquals("1[?] 7[?]", ((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testExample3CADECedric__5).toString());
        Assert.assertEquals(8, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testExample3CADECedric__5).hashCode())));
        Assert.assertEquals("", ((org.sat4j.core.VecInt)o_testExample3CADECedric__7).toString());
        Assert.assertTrue(((org.sat4j.core.VecInt)o_testExample3CADECedric__7).isEmpty());
        int[] array_1914705027 = new int[]{4, 16, 8};
        	int[] array_221548755 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__9).getLits();
        	for(int ii = 0; ii <array_1914705027.length; ii++) {
        		org.junit.Assert.assertEquals(array_1914705027[ii], array_221548755[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__9).getActivity())), 0.1);
        Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__9).isSatisfied());
        Assert.assertEquals("2[?] 8[?] 4[?] ", ((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__9).toString());
        Assert.assertEquals(9, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__9).hashCode())));
        Assert.assertEquals("", ((org.sat4j.core.VecInt)o_testExample3CADECedric__11).toString());
        Assert.assertTrue(((org.sat4j.core.VecInt)o_testExample3CADECedric__11).isEmpty());
        int[] array_1732722452 = new int[]{5, 18, 11};
        	int[] array_266940695 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__15).getLits();
        	for(int ii = 0; ii <array_1732722452.length; ii++) {
        		org.junit.Assert.assertEquals(array_1732722452[ii], array_266940695[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__15).getActivity())), 0.1);
        Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__15).isSatisfied());
        Assert.assertEquals("-2[?] 9[?] -5[?] ", ((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__15).toString());
        Assert.assertEquals(11, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__15).hashCode())));
        Assert.assertEquals("", ((org.sat4j.core.VecInt)o_testExample3CADECedric__17).toString());
        Assert.assertTrue(((org.sat4j.core.VecInt)o_testExample3CADECedric__17).isEmpty());
        int[] array_2065162280 = new int[]{2, 20, 8};
        	int[] array_1947384779 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__19).getLits();
        	for(int ii = 0; ii <array_2065162280.length; ii++) {
        		org.junit.Assert.assertEquals(array_2065162280[ii], array_1947384779[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__19).getActivity())), 0.1);
        Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__19).isSatisfied());
        Assert.assertEquals("1[?] 10[?] 4[?] ", ((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__19).toString());
        Assert.assertEquals(10, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__19).hashCode())));
        Assert.assertEquals("", ((org.sat4j.core.VecInt)o_testExample3CADECedric__21).toString());
        Assert.assertTrue(((org.sat4j.core.VecInt)o_testExample3CADECedric__21).isEmpty());
        int[] array_1625541399 = new int[]{4, 7, 22};
        	int[] array_1745347144 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__24).getLits();
        	for(int ii = 0; ii <array_1625541399.length; ii++) {
        		org.junit.Assert.assertEquals(array_1625541399[ii], array_1745347144[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__24).getActivity())), 0.1);
        Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__24).isSatisfied());
        Assert.assertEquals("2[?] -3[?] 11[?] ", ((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__24).toString());
        Assert.assertEquals(11, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__24).hashCode())));
        Assert.assertEquals("", ((org.sat4j.core.VecInt)o_testExample3CADECedric__26).toString());
        Assert.assertTrue(((org.sat4j.core.VecInt)o_testExample3CADECedric__26).isEmpty());
        int[] array_1222220459 = new int[]{12, 24};
        	int[] array_1839866620 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testExample3CADECedric__27).getLits();
        	for(int ii = 0; ii <array_1222220459.length; ii++) {
        		org.junit.Assert.assertEquals(array_1222220459[ii], array_1839866620[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testExample3CADECedric__27).getActivity())), 0.1);
        Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testExample3CADECedric__27).isSatisfied());
        Assert.assertEquals("6[?] 12[?]", ((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testExample3CADECedric__27).toString());
        Assert.assertEquals(18, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testExample3CADECedric__27).hashCode())));
        Assert.assertEquals("", ((org.sat4j.core.VecInt)o_testExample3CADECedric__29).toString());
        Assert.assertTrue(((org.sat4j.core.VecInt)o_testExample3CADECedric__29).isEmpty());
        int[] array_234071959 = new int[]{9, 6, 26};
        	int[] array_1199591453 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__32).getLits();
        	for(int ii = 0; ii <array_234071959.length; ii++) {
        		org.junit.Assert.assertEquals(array_234071959[ii], array_1199591453[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__32).getActivity())), 0.1);
        Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__32).isSatisfied());
        Assert.assertEquals("-4[?] 3[?] 13[?] ", ((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__32).toString());
        Assert.assertEquals(13, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__32).hashCode())));
        Assert.assertEquals("", ((org.sat4j.core.VecInt)o_testExample3CADECedric__34).toString());
        Assert.assertTrue(((org.sat4j.core.VecInt)o_testExample3CADECedric__34).isEmpty());
        int[] array_1549497873 = new int[]{3, 28};
        	int[] array_2034946429 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testExample3CADECedric__36).getLits();
        	for(int ii = 0; ii <array_1549497873.length; ii++) {
        		org.junit.Assert.assertEquals(array_1549497873[ii], array_2034946429[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testExample3CADECedric__36).getActivity())), 0.1);
        Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testExample3CADECedric__36).isSatisfied());
        Assert.assertEquals("-1[?] 14[?]", ((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testExample3CADECedric__36).toString());
        Assert.assertEquals(15, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testExample3CADECedric__36).hashCode())));
        Assert.assertEquals("", ((org.sat4j.core.VecInt)o_testExample3CADECedric__38).toString());
        Assert.assertTrue(((org.sat4j.core.VecInt)o_testExample3CADECedric__38).isEmpty());
        int[] array_1667689327 = new int[]{30, 5, 7};
        	int[] array_1035891738 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__42).getLits();
        	for(int ii = 0; ii <array_1667689327.length; ii++) {
        		org.junit.Assert.assertEquals(array_1667689327[ii], array_1035891738[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__42).getActivity())), 0.1);
        Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__42).isSatisfied());
        Assert.assertEquals("15[?] -2[?] -3[?] ", ((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__42).toString());
        Assert.assertEquals(14, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__42).hashCode())));
        Assert.assertEquals("", ((org.sat4j.core.VecInt)o_testExample3CADECedric__44).toString());
        Assert.assertTrue(((org.sat4j.core.VecInt)o_testExample3CADECedric__44).isEmpty());
        int[] array_1854323044 = new int[]{12, 32, 4, 8};
        	int[] array_1182590295 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__47).getLits();
        	for(int ii = 0; ii <array_1854323044.length; ii++) {
        		org.junit.Assert.assertEquals(array_1854323044[ii], array_1182590295[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__47).getActivity())), 0.1);
        Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__47).isSatisfied());
        Assert.assertEquals("6[?] 16[?] 2[?] 4[?] ", ((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__47).toString());
        Assert.assertEquals(14, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__47).hashCode())));
        Assert.assertEquals("", ((org.sat4j.core.VecInt)o_testExample3CADECedric__49).toString());
        Assert.assertTrue(((org.sat4j.core.VecInt)o_testExample3CADECedric__49).isEmpty());
        int[] array_2108503400 = new int[]{10, 34};
        	int[] array_159663009 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testExample3CADECedric__50).getLits();
        	for(int ii = 0; ii <array_2108503400.length; ii++) {
        		org.junit.Assert.assertEquals(array_2108503400[ii], array_159663009[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testExample3CADECedric__50).getActivity())), 0.1);
        Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testExample3CADECedric__50).isSatisfied());
        Assert.assertEquals("5[?] 17[?]", ((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testExample3CADECedric__50).toString());
        Assert.assertEquals(22, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testExample3CADECedric__50).hashCode())));
        Assert.assertEquals("", ((org.sat4j.core.VecInt)o_testExample3CADECedric__52).toString());
        Assert.assertTrue(((org.sat4j.core.VecInt)o_testExample3CADECedric__52).isEmpty());
        int[] array_2070150263 = new int[]{36, 8, 13};
        	int[] array_413741129 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__55).getLits();
        	for(int ii = 0; ii <array_2070150263.length; ii++) {
        		org.junit.Assert.assertEquals(array_2070150263[ii], array_413741129[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__55).getActivity())), 0.1);
        Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__55).isSatisfied());
        Assert.assertEquals("18[?] 4[?] -6[?] ", ((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__55).toString());
        Assert.assertEquals(19, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__55).hashCode())));
        Assert.assertEquals("", ((org.sat4j.core.VecInt)o_testExample3CADECedric__57).toString());
        Assert.assertTrue(((org.sat4j.core.VecInt)o_testExample3CADECedric__57).isEmpty());
        int[] array_828986944 = new int[]{38, 13, 11};
        	int[] array_1912522041 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__61).getLits();
        	for(int ii = 0; ii <array_828986944.length; ii++) {
        		org.junit.Assert.assertEquals(array_828986944[ii], array_1912522041[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__61).getActivity())), 0.1);
        Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__61).isSatisfied());
        Assert.assertEquals("19[?] -6[?] -5[?] ", ((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__61).toString());
        Assert.assertEquals(20, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__61).hashCode())));
        Assert.assertEquals("", ((org.sat4j.core.VecInt)o_testExample3CADECedric__63).toString());
        Assert.assertTrue(((org.sat4j.core.VecInt)o_testExample3CADECedric__63).isEmpty());
        int[] array_976010804 = new int[]{7, 8, 40, 2};
        	int[] array_1323661043 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__67).getLits();
        	for(int ii = 0; ii <array_976010804.length; ii++) {
        		org.junit.Assert.assertEquals(array_976010804[ii], array_1323661043[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__67).getActivity())), 0.1);
        Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__67).isSatisfied());
        Assert.assertEquals("-3[?] 4[?] 20[?] 1[?] ", ((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__67).toString());
        Assert.assertEquals(14, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__67).hashCode())));
    }
}

