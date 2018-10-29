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


public class TestAllMUSesAndCheckTestAmpl {
    private AllMUSes allMUSes;

    private ISolver solver;

    private CheckMUSSolutionListener checkListener;

    @Before
    public void setUp() throws Exception {
        this.allMUSes = new AllMUSes(SolverFactory.instance());
        this.solver = allMUSes.getSolverInstance();
        this.checkListener = new CheckMUSSolutionListener(SolverFactory.instance());
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
        this.checkListener.addOriginalClause(clause);
        IConstr o_testEclipseTestCase2__8 = this.solver.addClause(clause);
        int[] array_587074814 = new int[]{3, 4, 10};
        	int[] array_1759996544 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testEclipseTestCase2__8).getLits();
        	for(int ii = 0; ii <array_587074814.length; ii++) {
        		org.junit.Assert.assertEquals(array_587074814[ii], array_1759996544[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testEclipseTestCase2__8).getActivity())), 0.1);
        Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testEclipseTestCase2__8).isSatisfied());
        Assert.assertEquals("-1[?] 2[?] 5[?] ", ((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testEclipseTestCase2__8).toString());
        Assert.assertEquals(5, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testEclipseTestCase2__8).hashCode())));
        clause.clear();
        IVecInt o_testEclipseTestCase2__10 = clause.push((-1)).push(3);
        Assert.assertEquals("-1,3", ((org.sat4j.core.VecInt)o_testEclipseTestCase2__10).toString());
        Assert.assertEquals(1, ((int) (((org.sat4j.core.VecInt)o_testEclipseTestCase2__10).hashCode())));
        Assert.assertFalse(((org.sat4j.core.VecInt)o_testEclipseTestCase2__10).isEmpty());
        this.checkListener.addOriginalClause(clause);
        IConstr o_testEclipseTestCase2__14 = this.solver.addClause(clause);
        int[] array_183863255 = new int[]{3, 6, 12};
        	int[] array_1567672146 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testEclipseTestCase2__14).getLits();
        	for(int ii = 0; ii <array_183863255.length; ii++) {
        		org.junit.Assert.assertEquals(array_183863255[ii], array_1567672146[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testEclipseTestCase2__14).getActivity())), 0.1);
        Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testEclipseTestCase2__14).isSatisfied());
        Assert.assertEquals("-1[?] 3[?] 6[?] ", ((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testEclipseTestCase2__14).toString());
        Assert.assertEquals(7, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testEclipseTestCase2__14).hashCode())));
        clause.clear();
        IVecInt o_testEclipseTestCase2__16 = clause.push((-2)).push((-3));
        Assert.assertEquals("-2,-3", ((org.sat4j.core.VecInt)o_testEclipseTestCase2__16).toString());
        Assert.assertEquals(-2, ((int) (((org.sat4j.core.VecInt)o_testEclipseTestCase2__16).hashCode())));
        Assert.assertFalse(((org.sat4j.core.VecInt)o_testEclipseTestCase2__16).isEmpty());
        this.checkListener.addOriginalClause(clause);
        IConstr o_testEclipseTestCase2__21 = this.solver.addClause(clause);
        int[] array_1096219195 = new int[]{5, 7, 14};
        	int[] array_1062426610 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testEclipseTestCase2__21).getLits();
        	for(int ii = 0; ii <array_1096219195.length; ii++) {
        		org.junit.Assert.assertEquals(array_1096219195[ii], array_1062426610[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testEclipseTestCase2__21).getActivity())), 0.1);
        Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testEclipseTestCase2__21).isSatisfied());
        Assert.assertEquals("-2[?] -3[?] 7[?] ", ((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testEclipseTestCase2__21).toString());
        Assert.assertEquals(8, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testEclipseTestCase2__21).hashCode())));
        clause.clear();
        IVecInt o_testEclipseTestCase2__23 = clause.push((-4)).push(1);
        Assert.assertEquals("-4,1", ((org.sat4j.core.VecInt)o_testEclipseTestCase2__23).toString());
        Assert.assertEquals(-1, ((int) (((org.sat4j.core.VecInt)o_testEclipseTestCase2__23).hashCode())));
        Assert.assertFalse(((org.sat4j.core.VecInt)o_testEclipseTestCase2__23).isEmpty());
        this.checkListener.addOriginalClause(clause);
        IConstr o_testEclipseTestCase2__27 = this.solver.addClause(clause);
        int[] array_2028373570 = new int[]{2, 9, 16};
        	int[] array_1411028109 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testEclipseTestCase2__27).getLits();
        	for(int ii = 0; ii <array_2028373570.length; ii++) {
        		org.junit.Assert.assertEquals(array_2028373570[ii], array_1411028109[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testEclipseTestCase2__27).getActivity())), 0.1);
        Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testEclipseTestCase2__27).isSatisfied());
        Assert.assertEquals("1[?] -4[?] 8[?] ", ((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testEclipseTestCase2__27).toString());
        Assert.assertEquals(9, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testEclipseTestCase2__27).hashCode())));
        clause.clear();
        List<IVecInt> muses = allMUSes.computeAllMUSes(checkListener);
        int o_testEclipseTestCase2__31 = muses.size();
        Assert.assertEquals(0, ((int) (o_testEclipseTestCase2__31)));
        Assert.assertEquals(4, ((int) (o_testEclipseTestCase2__1)));
        Assert.assertEquals("", ((org.sat4j.core.VecInt)o_testEclipseTestCase2__4).toString());
        Assert.assertTrue(((org.sat4j.core.VecInt)o_testEclipseTestCase2__4).isEmpty());
        int[] array_1917111029 = new int[]{3, 4, 10};
        	int[] array_636981950 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testEclipseTestCase2__8).getLits();
        	for(int ii = 0; ii <array_1917111029.length; ii++) {
        		org.junit.Assert.assertEquals(array_1917111029[ii], array_636981950[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testEclipseTestCase2__8).getActivity())), 0.1);
        Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testEclipseTestCase2__8).isSatisfied());
        Assert.assertEquals("-1[?] 2[?] 5[?] ", ((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testEclipseTestCase2__8).toString());
        Assert.assertEquals(5, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testEclipseTestCase2__8).hashCode())));
        Assert.assertEquals("", ((org.sat4j.core.VecInt)o_testEclipseTestCase2__10).toString());
        Assert.assertTrue(((org.sat4j.core.VecInt)o_testEclipseTestCase2__10).isEmpty());
        int[] array_342650539 = new int[]{3, 6, 12};
        	int[] array_428809999 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testEclipseTestCase2__14).getLits();
        	for(int ii = 0; ii <array_342650539.length; ii++) {
        		org.junit.Assert.assertEquals(array_342650539[ii], array_428809999[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testEclipseTestCase2__14).getActivity())), 0.1);
        Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testEclipseTestCase2__14).isSatisfied());
        Assert.assertEquals("-1[?] 3[?] 6[?] ", ((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testEclipseTestCase2__14).toString());
        Assert.assertEquals(7, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testEclipseTestCase2__14).hashCode())));
        Assert.assertEquals("", ((org.sat4j.core.VecInt)o_testEclipseTestCase2__16).toString());
        Assert.assertTrue(((org.sat4j.core.VecInt)o_testEclipseTestCase2__16).isEmpty());
        int[] array_1450303765 = new int[]{5, 7, 14};
        	int[] array_1890874282 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testEclipseTestCase2__21).getLits();
        	for(int ii = 0; ii <array_1450303765.length; ii++) {
        		org.junit.Assert.assertEquals(array_1450303765[ii], array_1890874282[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testEclipseTestCase2__21).getActivity())), 0.1);
        Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testEclipseTestCase2__21).isSatisfied());
        Assert.assertEquals("-2[?] -3[?] 7[?] ", ((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testEclipseTestCase2__21).toString());
        Assert.assertEquals(8, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testEclipseTestCase2__21).hashCode())));
        Assert.assertEquals("", ((org.sat4j.core.VecInt)o_testEclipseTestCase2__23).toString());
        Assert.assertTrue(((org.sat4j.core.VecInt)o_testEclipseTestCase2__23).isEmpty());
        int[] array_1641205176 = new int[]{9, 16, 2};
        	int[] array_1310907894 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testEclipseTestCase2__27).getLits();
        	for(int ii = 0; ii <array_1641205176.length; ii++) {
        		org.junit.Assert.assertEquals(array_1641205176[ii], array_1310907894[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testEclipseTestCase2__27).getActivity())), 0.1);
        Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testEclipseTestCase2__27).isSatisfied());
        Assert.assertEquals("-4[?] 8[?] 1[?] ", ((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testEclipseTestCase2__27).toString());
        Assert.assertEquals(9, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testEclipseTestCase2__27).hashCode())));
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
        this.checkListener.addOriginalClause(clause);
        IConstr o_testExample3CADECedric__6 = this.solver.addClause(clause);
        int[] array_558055093 = new int[]{2, 14};
        	int[] array_1635344698 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testExample3CADECedric__6).getLits();
        	for(int ii = 0; ii <array_558055093.length; ii++) {
        		org.junit.Assert.assertEquals(array_558055093[ii], array_1635344698[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testExample3CADECedric__6).getActivity())), 0.1);
        Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testExample3CADECedric__6).isSatisfied());
        Assert.assertEquals("1[?] 7[?]", ((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testExample3CADECedric__6).toString());
        Assert.assertEquals(8, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testExample3CADECedric__6).hashCode())));
        clause.clear();
        IVecInt o_testExample3CADECedric__8 = clause.push(2).push(4);
        Assert.assertEquals("2,4", ((org.sat4j.core.VecInt)o_testExample3CADECedric__8).toString());
        Assert.assertEquals(3, ((int) (((org.sat4j.core.VecInt)o_testExample3CADECedric__8).hashCode())));
        Assert.assertFalse(((org.sat4j.core.VecInt)o_testExample3CADECedric__8).isEmpty());
        this.checkListener.addOriginalClause(clause);
        IConstr o_testExample3CADECedric__11 = this.solver.addClause(clause);
        int[] array_1233065619 = new int[]{4, 8, 16};
        	int[] array_1245095490 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__11).getLits();
        	for(int ii = 0; ii <array_1233065619.length; ii++) {
        		org.junit.Assert.assertEquals(array_1233065619[ii], array_1245095490[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__11).getActivity())), 0.1);
        Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__11).isSatisfied());
        Assert.assertEquals("2[?] 4[?] 8[?] ", ((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__11).toString());
        Assert.assertEquals(9, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__11).hashCode())));
        clause.clear();
        IVecInt o_testExample3CADECedric__13 = clause.push((-2)).push((-5));
        Assert.assertEquals("-2,-5", ((org.sat4j.core.VecInt)o_testExample3CADECedric__13).toString());
        Assert.assertEquals(-3, ((int) (((org.sat4j.core.VecInt)o_testExample3CADECedric__13).hashCode())));
        Assert.assertFalse(((org.sat4j.core.VecInt)o_testExample3CADECedric__13).isEmpty());
        this.checkListener.addOriginalClause(clause);
        IConstr o_testExample3CADECedric__18 = this.solver.addClause(clause);
        int[] array_645584472 = new int[]{5, 11, 18};
        	int[] array_232604353 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__18).getLits();
        	for(int ii = 0; ii <array_645584472.length; ii++) {
        		org.junit.Assert.assertEquals(array_645584472[ii], array_232604353[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__18).getActivity())), 0.1);
        Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__18).isSatisfied());
        Assert.assertEquals("-2[?] -5[?] 9[?] ", ((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__18).toString());
        Assert.assertEquals(11, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__18).hashCode())));
        clause.clear();
        IVecInt o_testExample3CADECedric__20 = clause.push(1).push(4);
        Assert.assertEquals("1,4", ((org.sat4j.core.VecInt)o_testExample3CADECedric__20).toString());
        Assert.assertEquals(2, ((int) (((org.sat4j.core.VecInt)o_testExample3CADECedric__20).hashCode())));
        Assert.assertFalse(((org.sat4j.core.VecInt)o_testExample3CADECedric__20).isEmpty());
        this.checkListener.addOriginalClause(clause);
        IConstr o_testExample3CADECedric__23 = this.solver.addClause(clause);
        int[] array_1023774664 = new int[]{2, 8, 20};
        	int[] array_1718993965 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__23).getLits();
        	for(int ii = 0; ii <array_1023774664.length; ii++) {
        		org.junit.Assert.assertEquals(array_1023774664[ii], array_1718993965[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__23).getActivity())), 0.1);
        Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__23).isSatisfied());
        Assert.assertEquals("1[?] 4[?] 10[?] ", ((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__23).toString());
        Assert.assertEquals(10, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__23).hashCode())));
        clause.clear();
        IVecInt o_testExample3CADECedric__25 = clause.push(2).push((-3));
        Assert.assertEquals("2,-3", ((org.sat4j.core.VecInt)o_testExample3CADECedric__25).toString());
        Assert.assertEquals(0, ((int) (((org.sat4j.core.VecInt)o_testExample3CADECedric__25).hashCode())));
        Assert.assertFalse(((org.sat4j.core.VecInt)o_testExample3CADECedric__25).isEmpty());
        this.checkListener.addOriginalClause(clause);
        IConstr o_testExample3CADECedric__29 = this.solver.addClause(clause);
        int[] array_2119615823 = new int[]{4, 7, 22};
        	int[] array_1536082878 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__29).getLits();
        	for(int ii = 0; ii <array_2119615823.length; ii++) {
        		org.junit.Assert.assertEquals(array_2119615823[ii], array_1536082878[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__29).getActivity())), 0.1);
        Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__29).isSatisfied());
        Assert.assertEquals("2[?] -3[?] 11[?] ", ((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__29).toString());
        Assert.assertEquals(11, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__29).hashCode())));
        clause.clear();
        IVecInt o_testExample3CADECedric__31 = clause.push(6);
        Assert.assertEquals("6", ((org.sat4j.core.VecInt)o_testExample3CADECedric__31).toString());
        Assert.assertEquals(6, ((int) (((org.sat4j.core.VecInt)o_testExample3CADECedric__31).hashCode())));
        Assert.assertFalse(((org.sat4j.core.VecInt)o_testExample3CADECedric__31).isEmpty());
        this.checkListener.addOriginalClause(clause);
        IConstr o_testExample3CADECedric__33 = this.solver.addClause(clause);
        int[] array_1273764582 = new int[]{12, 24};
        	int[] array_1920226080 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testExample3CADECedric__33).getLits();
        	for(int ii = 0; ii <array_1273764582.length; ii++) {
        		org.junit.Assert.assertEquals(array_1273764582[ii], array_1920226080[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testExample3CADECedric__33).getActivity())), 0.1);
        Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testExample3CADECedric__33).isSatisfied());
        Assert.assertEquals("6[?] 12[?]", ((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testExample3CADECedric__33).toString());
        Assert.assertEquals(18, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testExample3CADECedric__33).hashCode())));
        clause.clear();
        IVecInt o_testExample3CADECedric__35 = clause.push(3).push((-4));
        Assert.assertEquals("3,-4", ((org.sat4j.core.VecInt)o_testExample3CADECedric__35).toString());
        Assert.assertEquals(0, ((int) (((org.sat4j.core.VecInt)o_testExample3CADECedric__35).hashCode())));
        Assert.assertFalse(((org.sat4j.core.VecInt)o_testExample3CADECedric__35).isEmpty());
        this.checkListener.addOriginalClause(clause);
        IConstr o_testExample3CADECedric__39 = this.solver.addClause(clause);
        int[] array_2063885383 = new int[]{6, 9, 26};
        	int[] array_855720920 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__39).getLits();
        	for(int ii = 0; ii <array_2063885383.length; ii++) {
        		org.junit.Assert.assertEquals(array_2063885383[ii], array_855720920[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__39).getActivity())), 0.1);
        Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__39).isSatisfied());
        Assert.assertEquals("3[?] -4[?] 13[?] ", ((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__39).toString());
        Assert.assertEquals(13, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__39).hashCode())));
        clause.clear();
        IVecInt o_testExample3CADECedric__41 = clause.push((-1));
        Assert.assertEquals("-1", ((org.sat4j.core.VecInt)o_testExample3CADECedric__41).toString());
        Assert.assertEquals(-1, ((int) (((org.sat4j.core.VecInt)o_testExample3CADECedric__41).hashCode())));
        Assert.assertFalse(((org.sat4j.core.VecInt)o_testExample3CADECedric__41).isEmpty());
        this.checkListener.addOriginalClause(clause);
        IConstr o_testExample3CADECedric__44 = this.solver.addClause(clause);
        int[] array_341532737 = new int[]{3, 28};
        	int[] array_1630717123 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testExample3CADECedric__44).getLits();
        	for(int ii = 0; ii <array_341532737.length; ii++) {
        		org.junit.Assert.assertEquals(array_341532737[ii], array_1630717123[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testExample3CADECedric__44).getActivity())), 0.1);
        Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testExample3CADECedric__44).isSatisfied());
        Assert.assertEquals("-1[?] 14[?]", ((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testExample3CADECedric__44).toString());
        Assert.assertEquals(15, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testExample3CADECedric__44).hashCode())));
        clause.clear();
        IVecInt o_testExample3CADECedric__46 = clause.push((-2)).push((-3));
        Assert.assertEquals("-2,-3", ((org.sat4j.core.VecInt)o_testExample3CADECedric__46).toString());
        Assert.assertEquals(-2, ((int) (((org.sat4j.core.VecInt)o_testExample3CADECedric__46).hashCode())));
        Assert.assertFalse(((org.sat4j.core.VecInt)o_testExample3CADECedric__46).isEmpty());
        this.checkListener.addOriginalClause(clause);
        IConstr o_testExample3CADECedric__51 = this.solver.addClause(clause);
        int[] array_1065846110 = new int[]{5, 7, 30};
        	int[] array_1056329933 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__51).getLits();
        	for(int ii = 0; ii <array_1065846110.length; ii++) {
        		org.junit.Assert.assertEquals(array_1065846110[ii], array_1056329933[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__51).getActivity())), 0.1);
        Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__51).isSatisfied());
        Assert.assertEquals("-2[?] -3[?] 15[?] ", ((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__51).toString());
        Assert.assertEquals(14, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__51).hashCode())));
        clause.clear();
        IVecInt o_testExample3CADECedric__53 = clause.push(2).push(4).push(6);
        Assert.assertEquals("2,4,6", ((org.sat4j.core.VecInt)o_testExample3CADECedric__53).toString());
        Assert.assertEquals(4, ((int) (((org.sat4j.core.VecInt)o_testExample3CADECedric__53).hashCode())));
        Assert.assertFalse(((org.sat4j.core.VecInt)o_testExample3CADECedric__53).isEmpty());
        this.checkListener.addOriginalClause(clause);
        IConstr o_testExample3CADECedric__57 = this.solver.addClause(clause);
        int[] array_1978506840 = new int[]{4, 8, 12, 32};
        	int[] array_964785252 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__57).getLits();
        	for(int ii = 0; ii <array_1978506840.length; ii++) {
        		org.junit.Assert.assertEquals(array_1978506840[ii], array_964785252[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__57).getActivity())), 0.1);
        Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__57).isSatisfied());
        Assert.assertEquals("2[?] 4[?] 6[?] 16[?] ", ((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__57).toString());
        Assert.assertEquals(14, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__57).hashCode())));
        clause.clear();
        IVecInt o_testExample3CADECedric__59 = clause.push(5);
        Assert.assertEquals("5", ((org.sat4j.core.VecInt)o_testExample3CADECedric__59).toString());
        Assert.assertEquals(5, ((int) (((org.sat4j.core.VecInt)o_testExample3CADECedric__59).hashCode())));
        Assert.assertFalse(((org.sat4j.core.VecInt)o_testExample3CADECedric__59).isEmpty());
        this.checkListener.addOriginalClause(clause);
        IConstr o_testExample3CADECedric__61 = this.solver.addClause(clause);
        int[] array_319719329 = new int[]{10, 34};
        	int[] array_107382710 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testExample3CADECedric__61).getLits();
        	for(int ii = 0; ii <array_319719329.length; ii++) {
        		org.junit.Assert.assertEquals(array_319719329[ii], array_107382710[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testExample3CADECedric__61).getActivity())), 0.1);
        Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testExample3CADECedric__61).isSatisfied());
        Assert.assertEquals("5[?] 17[?]", ((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testExample3CADECedric__61).toString());
        Assert.assertEquals(22, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testExample3CADECedric__61).hashCode())));
        clause.clear();
        IVecInt o_testExample3CADECedric__63 = clause.push((-6)).push(4);
        Assert.assertEquals("-6,4", ((org.sat4j.core.VecInt)o_testExample3CADECedric__63).toString());
        Assert.assertEquals(-1, ((int) (((org.sat4j.core.VecInt)o_testExample3CADECedric__63).hashCode())));
        Assert.assertFalse(((org.sat4j.core.VecInt)o_testExample3CADECedric__63).isEmpty());
        this.checkListener.addOriginalClause(clause);
        IConstr o_testExample3CADECedric__67 = this.solver.addClause(clause);
        int[] array_1401706523 = new int[]{8, 13, 36};
        	int[] array_582141270 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__67).getLits();
        	for(int ii = 0; ii <array_1401706523.length; ii++) {
        		org.junit.Assert.assertEquals(array_1401706523[ii], array_582141270[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__67).getActivity())), 0.1);
        Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__67).isSatisfied());
        Assert.assertEquals("4[?] -6[?] 18[?] ", ((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__67).toString());
        Assert.assertEquals(19, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__67).hashCode())));
        clause.clear();
        IVecInt o_testExample3CADECedric__69 = clause.push((-5)).push((-6));
        Assert.assertEquals("-5,-6", ((org.sat4j.core.VecInt)o_testExample3CADECedric__69).toString());
        Assert.assertEquals(-5, ((int) (((org.sat4j.core.VecInt)o_testExample3CADECedric__69).hashCode())));
        Assert.assertFalse(((org.sat4j.core.VecInt)o_testExample3CADECedric__69).isEmpty());
        this.checkListener.addOriginalClause(clause);
        IConstr o_testExample3CADECedric__74 = this.solver.addClause(clause);
        int[] array_814486765 = new int[]{11, 13, 38};
        	int[] array_1681966735 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__74).getLits();
        	for(int ii = 0; ii <array_814486765.length; ii++) {
        		org.junit.Assert.assertEquals(array_814486765[ii], array_1681966735[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__74).getActivity())), 0.1);
        Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__74).isSatisfied());
        Assert.assertEquals("-5[?] -6[?] 19[?] ", ((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__74).toString());
        Assert.assertEquals(20, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__74).hashCode())));
        clause.clear();
        IVecInt o_testExample3CADECedric__76 = clause.push(1).push((-3)).push(4);
        Assert.assertEquals("1,-3,4", ((org.sat4j.core.VecInt)o_testExample3CADECedric__76).toString());
        Assert.assertEquals(0, ((int) (((org.sat4j.core.VecInt)o_testExample3CADECedric__76).hashCode())));
        Assert.assertFalse(((org.sat4j.core.VecInt)o_testExample3CADECedric__76).isEmpty());
        this.checkListener.addOriginalClause(clause);
        IConstr o_testExample3CADECedric__81 = this.solver.addClause(clause);
        int[] array_1868576422 = new int[]{2, 7, 8, 40};
        	int[] array_425747121 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__81).getLits();
        	for(int ii = 0; ii <array_1868576422.length; ii++) {
        		org.junit.Assert.assertEquals(array_1868576422[ii], array_425747121[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__81).getActivity())), 0.1);
        Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__81).isSatisfied());
        Assert.assertEquals("1[?] -3[?] 4[?] 20[?] ", ((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__81).toString());
        Assert.assertEquals(14, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__81).hashCode())));
        clause.clear();
        List<IVecInt> muses = allMUSes.computeAllMUSes(checkListener);
        int o_testExample3CADECedric__85 = muses.size();
        Assert.assertEquals(9, ((int) (o_testExample3CADECedric__85)));
        Assert.assertEquals(6, ((int) (o_testExample3CADECedric__1)));
        Assert.assertEquals("", ((org.sat4j.core.VecInt)o_testExample3CADECedric__4).toString());
        Assert.assertTrue(((org.sat4j.core.VecInt)o_testExample3CADECedric__4).isEmpty());
        int[] array_1234484683 = new int[]{2, 14};
        	int[] array_1294758391 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testExample3CADECedric__6).getLits();
        	for(int ii = 0; ii <array_1234484683.length; ii++) {
        		org.junit.Assert.assertEquals(array_1234484683[ii], array_1294758391[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testExample3CADECedric__6).getActivity())), 0.1);
        Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testExample3CADECedric__6).isSatisfied());
        Assert.assertEquals("1[?] 7[?]", ((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testExample3CADECedric__6).toString());
        Assert.assertEquals(8, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testExample3CADECedric__6).hashCode())));
        Assert.assertEquals("", ((org.sat4j.core.VecInt)o_testExample3CADECedric__8).toString());
        Assert.assertTrue(((org.sat4j.core.VecInt)o_testExample3CADECedric__8).isEmpty());
        int[] array_357425431 = new int[]{4, 16, 8};
        	int[] array_1570395053 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__11).getLits();
        	for(int ii = 0; ii <array_357425431.length; ii++) {
        		org.junit.Assert.assertEquals(array_357425431[ii], array_1570395053[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__11).getActivity())), 0.1);
        Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__11).isSatisfied());
        Assert.assertEquals("2[?] 8[?] 4[?] ", ((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__11).toString());
        Assert.assertEquals(9, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__11).hashCode())));
        Assert.assertEquals("", ((org.sat4j.core.VecInt)o_testExample3CADECedric__13).toString());
        Assert.assertTrue(((org.sat4j.core.VecInt)o_testExample3CADECedric__13).isEmpty());
        int[] array_651844234 = new int[]{5, 18, 11};
        	int[] array_587453235 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__18).getLits();
        	for(int ii = 0; ii <array_651844234.length; ii++) {
        		org.junit.Assert.assertEquals(array_651844234[ii], array_587453235[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__18).getActivity())), 0.1);
        Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__18).isSatisfied());
        Assert.assertEquals("-2[?] 9[?] -5[?] ", ((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__18).toString());
        Assert.assertEquals(11, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__18).hashCode())));
        Assert.assertEquals("", ((org.sat4j.core.VecInt)o_testExample3CADECedric__20).toString());
        Assert.assertTrue(((org.sat4j.core.VecInt)o_testExample3CADECedric__20).isEmpty());
        int[] array_531804122 = new int[]{2, 20, 8};
        	int[] array_1552565251 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__23).getLits();
        	for(int ii = 0; ii <array_531804122.length; ii++) {
        		org.junit.Assert.assertEquals(array_531804122[ii], array_1552565251[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__23).getActivity())), 0.1);
        Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__23).isSatisfied());
        Assert.assertEquals("1[?] 10[?] 4[?] ", ((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__23).toString());
        Assert.assertEquals(10, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__23).hashCode())));
        Assert.assertEquals("", ((org.sat4j.core.VecInt)o_testExample3CADECedric__25).toString());
        Assert.assertTrue(((org.sat4j.core.VecInt)o_testExample3CADECedric__25).isEmpty());
        int[] array_2080617520 = new int[]{4, 7, 22};
        	int[] array_1383607688 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__29).getLits();
        	for(int ii = 0; ii <array_2080617520.length; ii++) {
        		org.junit.Assert.assertEquals(array_2080617520[ii], array_1383607688[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__29).getActivity())), 0.1);
        Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__29).isSatisfied());
        Assert.assertEquals("2[?] -3[?] 11[?] ", ((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__29).toString());
        Assert.assertEquals(11, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__29).hashCode())));
        Assert.assertEquals("", ((org.sat4j.core.VecInt)o_testExample3CADECedric__31).toString());
        Assert.assertTrue(((org.sat4j.core.VecInt)o_testExample3CADECedric__31).isEmpty());
        int[] array_664384372 = new int[]{12, 24};
        	int[] array_690684 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testExample3CADECedric__33).getLits();
        	for(int ii = 0; ii <array_664384372.length; ii++) {
        		org.junit.Assert.assertEquals(array_664384372[ii], array_690684[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testExample3CADECedric__33).getActivity())), 0.1);
        Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testExample3CADECedric__33).isSatisfied());
        Assert.assertEquals("6[?] 12[?]", ((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testExample3CADECedric__33).toString());
        Assert.assertEquals(18, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testExample3CADECedric__33).hashCode())));
        Assert.assertEquals("", ((org.sat4j.core.VecInt)o_testExample3CADECedric__35).toString());
        Assert.assertTrue(((org.sat4j.core.VecInt)o_testExample3CADECedric__35).isEmpty());
        int[] array_297311369 = new int[]{9, 6, 26};
        	int[] array_266432151 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__39).getLits();
        	for(int ii = 0; ii <array_297311369.length; ii++) {
        		org.junit.Assert.assertEquals(array_297311369[ii], array_266432151[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__39).getActivity())), 0.1);
        Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__39).isSatisfied());
        Assert.assertEquals("-4[?] 3[?] 13[?] ", ((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__39).toString());
        Assert.assertEquals(13, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__39).hashCode())));
        Assert.assertEquals("", ((org.sat4j.core.VecInt)o_testExample3CADECedric__41).toString());
        Assert.assertTrue(((org.sat4j.core.VecInt)o_testExample3CADECedric__41).isEmpty());
        int[] array_2095188425 = new int[]{3, 28};
        	int[] array_813286795 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testExample3CADECedric__44).getLits();
        	for(int ii = 0; ii <array_2095188425.length; ii++) {
        		org.junit.Assert.assertEquals(array_2095188425[ii], array_813286795[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testExample3CADECedric__44).getActivity())), 0.1);
        Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testExample3CADECedric__44).isSatisfied());
        Assert.assertEquals("-1[?] 14[?]", ((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testExample3CADECedric__44).toString());
        Assert.assertEquals(15, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testExample3CADECedric__44).hashCode())));
        Assert.assertEquals("", ((org.sat4j.core.VecInt)o_testExample3CADECedric__46).toString());
        Assert.assertTrue(((org.sat4j.core.VecInt)o_testExample3CADECedric__46).isEmpty());
        int[] array_2138278411 = new int[]{30, 5, 7};
        	int[] array_25340382 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__51).getLits();
        	for(int ii = 0; ii <array_2138278411.length; ii++) {
        		org.junit.Assert.assertEquals(array_2138278411[ii], array_25340382[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__51).getActivity())), 0.1);
        Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__51).isSatisfied());
        Assert.assertEquals("15[?] -2[?] -3[?] ", ((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__51).toString());
        Assert.assertEquals(14, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__51).hashCode())));
        Assert.assertEquals("", ((org.sat4j.core.VecInt)o_testExample3CADECedric__53).toString());
        Assert.assertTrue(((org.sat4j.core.VecInt)o_testExample3CADECedric__53).isEmpty());
        int[] array_157688678 = new int[]{12, 32, 4, 8};
        	int[] array_1207405105 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__57).getLits();
        	for(int ii = 0; ii <array_157688678.length; ii++) {
        		org.junit.Assert.assertEquals(array_157688678[ii], array_1207405105[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__57).getActivity())), 0.1);
        Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__57).isSatisfied());
        Assert.assertEquals("6[?] 16[?] 2[?] 4[?] ", ((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__57).toString());
        Assert.assertEquals(14, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__57).hashCode())));
        Assert.assertEquals("", ((org.sat4j.core.VecInt)o_testExample3CADECedric__59).toString());
        Assert.assertTrue(((org.sat4j.core.VecInt)o_testExample3CADECedric__59).isEmpty());
        int[] array_849229942 = new int[]{10, 34};
        	int[] array_1281430758 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testExample3CADECedric__61).getLits();
        	for(int ii = 0; ii <array_849229942.length; ii++) {
        		org.junit.Assert.assertEquals(array_849229942[ii], array_1281430758[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testExample3CADECedric__61).getActivity())), 0.1);
        Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testExample3CADECedric__61).isSatisfied());
        Assert.assertEquals("5[?] 17[?]", ((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testExample3CADECedric__61).toString());
        Assert.assertEquals(22, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testExample3CADECedric__61).hashCode())));
        Assert.assertEquals("", ((org.sat4j.core.VecInt)o_testExample3CADECedric__63).toString());
        Assert.assertTrue(((org.sat4j.core.VecInt)o_testExample3CADECedric__63).isEmpty());
        int[] array_538466924 = new int[]{36, 8, 13};
        	int[] array_1110762115 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__67).getLits();
        	for(int ii = 0; ii <array_538466924.length; ii++) {
        		org.junit.Assert.assertEquals(array_538466924[ii], array_1110762115[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__67).getActivity())), 0.1);
        Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__67).isSatisfied());
        Assert.assertEquals("18[?] 4[?] -6[?] ", ((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__67).toString());
        Assert.assertEquals(19, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__67).hashCode())));
        Assert.assertEquals("", ((org.sat4j.core.VecInt)o_testExample3CADECedric__69).toString());
        Assert.assertTrue(((org.sat4j.core.VecInt)o_testExample3CADECedric__69).isEmpty());
        int[] array_1599955113 = new int[]{38, 13, 11};
        	int[] array_54525455 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__74).getLits();
        	for(int ii = 0; ii <array_1599955113.length; ii++) {
        		org.junit.Assert.assertEquals(array_1599955113[ii], array_54525455[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__74).getActivity())), 0.1);
        Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__74).isSatisfied());
        Assert.assertEquals("19[?] -6[?] -5[?] ", ((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__74).toString());
        Assert.assertEquals(20, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__74).hashCode())));
        Assert.assertEquals("", ((org.sat4j.core.VecInt)o_testExample3CADECedric__76).toString());
        Assert.assertTrue(((org.sat4j.core.VecInt)o_testExample3CADECedric__76).isEmpty());
        int[] array_239346921 = new int[]{7, 8, 40, 2};
        	int[] array_975430358 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__81).getLits();
        	for(int ii = 0; ii <array_239346921.length; ii++) {
        		org.junit.Assert.assertEquals(array_239346921[ii], array_975430358[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__81).getActivity())), 0.1);
        Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__81).isSatisfied());
        Assert.assertEquals("-3[?] 4[?] 20[?] 1[?] ", ((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__81).toString());
        Assert.assertEquals(14, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__81).hashCode())));
    }
}

