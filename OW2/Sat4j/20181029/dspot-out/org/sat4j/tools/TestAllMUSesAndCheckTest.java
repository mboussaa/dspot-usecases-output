package org.sat4j.tools;


import java.util.List;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.sat4j.core.VecInt;
import org.sat4j.minisat.SolverFactory;
import org.sat4j.minisat.constraints.cnf.OriginalBinaryClause;
import org.sat4j.minisat.constraints.cnf.OriginalWLClause;
import org.sat4j.specs.ContradictionException;
import org.sat4j.specs.IConstr;
import org.sat4j.specs.ISolver;
import org.sat4j.specs.IVecInt;
import org.sat4j.specs.TimeoutException;


public class TestAllMUSesAndCheckTest {
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
    public void testGlobalInconsistency() throws Exception, ContradictionException, TimeoutException {
        int o_testGlobalInconsistency__1 = this.solver.newVar(2);
        Assert.assertEquals(2, ((int) (o_testGlobalInconsistency__1)));
        IVecInt clause = new VecInt();
        IVecInt o_testGlobalInconsistency__4 = clause.push(1).push(2);
        Assert.assertEquals("1,2", ((VecInt) (o_testGlobalInconsistency__4)).toString());
        Assert.assertEquals(1, ((int) (((VecInt) (o_testGlobalInconsistency__4)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testGlobalInconsistency__4)).isEmpty());
        this.checkListener.addOriginalClause(clause);
        IConstr o_testGlobalInconsistency__7 = this.solver.addClause(clause);
        int[] array_1741761454 = new int[]{2,4,6};
        	int[] array_192374342 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testGlobalInconsistency__7).getLits();
        	for(int ii = 0; ii <array_1741761454.length; ii++) {
        		org.junit.Assert.assertEquals(array_1741761454[ii], array_192374342[ii]);
        	};
        Assert.assertFalse(((OriginalWLClause) (o_testGlobalInconsistency__7)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testGlobalInconsistency__7)).getActivity())), 0.1);
        Assert.assertEquals("1[?] 2[?] 3[?] ", ((OriginalWLClause) (o_testGlobalInconsistency__7)).toString());
        Assert.assertEquals(4, ((int) (((OriginalWLClause) (o_testGlobalInconsistency__7)).hashCode())));
        clause.clear();
        IVecInt o_testGlobalInconsistency__9 = clause.push(1).push((-2));
        Assert.assertEquals("1,-2", ((VecInt) (o_testGlobalInconsistency__9)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_testGlobalInconsistency__9)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testGlobalInconsistency__9)).isEmpty());
        this.checkListener.addOriginalClause(clause);
        IConstr o_testGlobalInconsistency__13 = this.solver.addClause(clause);
        int[] array_1731805221 = new int[]{2,5,8};
        	int[] array_944922376 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testGlobalInconsistency__13).getLits();
        	for(int ii = 0; ii <array_1731805221.length; ii++) {
        		org.junit.Assert.assertEquals(array_1731805221[ii], array_944922376[ii]);
        	};
        Assert.assertFalse(((OriginalWLClause) (o_testGlobalInconsistency__13)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testGlobalInconsistency__13)).getActivity())), 0.1);
        Assert.assertEquals("1[?] -2[?] 4[?] ", ((OriginalWLClause) (o_testGlobalInconsistency__13)).toString());
        Assert.assertEquals(5, ((int) (((OriginalWLClause) (o_testGlobalInconsistency__13)).hashCode())));
        clause.clear();
        IVecInt o_testGlobalInconsistency__15 = clause.push((-1)).push(2);
        Assert.assertEquals("-1,2", ((VecInt) (o_testGlobalInconsistency__15)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_testGlobalInconsistency__15)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testGlobalInconsistency__15)).isEmpty());
        this.checkListener.addOriginalClause(clause);
        IConstr o_testGlobalInconsistency__19 = this.solver.addClause(clause);
        int[] array_685280022 = new int[]{3,4,10};
        	int[] array_1646797803 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testGlobalInconsistency__19).getLits();
        	for(int ii = 0; ii <array_685280022.length; ii++) {
        		org.junit.Assert.assertEquals(array_685280022[ii], array_1646797803[ii]);
        	};
        Assert.assertFalse(((OriginalWLClause) (o_testGlobalInconsistency__19)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testGlobalInconsistency__19)).getActivity())), 0.1);
        Assert.assertEquals("-1[?] 2[?] 5[?] ", ((OriginalWLClause) (o_testGlobalInconsistency__19)).toString());
        Assert.assertEquals(5, ((int) (((OriginalWLClause) (o_testGlobalInconsistency__19)).hashCode())));
        clause.clear();
        IVecInt o_testGlobalInconsistency__21 = clause.push((-1)).push((-2));
        Assert.assertEquals("-1,-2", ((VecInt) (o_testGlobalInconsistency__21)).toString());
        Assert.assertEquals(-1, ((int) (((VecInt) (o_testGlobalInconsistency__21)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testGlobalInconsistency__21)).isEmpty());
        this.checkListener.addOriginalClause(clause);
        IConstr o_testGlobalInconsistency__26 = this.solver.addClause(clause);
        int[] array_508070101 = new int[]{3,5,12};
        	int[] array_229522636 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testGlobalInconsistency__26).getLits();
        	for(int ii = 0; ii <array_508070101.length; ii++) {
        		org.junit.Assert.assertEquals(array_508070101[ii], array_229522636[ii]);
        	};
        Assert.assertFalse(((OriginalWLClause) (o_testGlobalInconsistency__26)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testGlobalInconsistency__26)).getActivity())), 0.1);
        Assert.assertEquals("-1[?] -2[?] 6[?] ", ((OriginalWLClause) (o_testGlobalInconsistency__26)).toString());
        Assert.assertEquals(6, ((int) (((OriginalWLClause) (o_testGlobalInconsistency__26)).hashCode())));
        clause.clear();
        List<IVecInt> muses = allMUSes.computeAllMUSes(checkListener);
        int o_testGlobalInconsistency__30 = muses.size();
        Assert.assertEquals(1, ((int) (o_testGlobalInconsistency__30)));
        Assert.assertEquals(2, ((int) (o_testGlobalInconsistency__1)));
        Assert.assertEquals("", ((VecInt) (o_testGlobalInconsistency__4)).toString());
        Assert.assertTrue(((VecInt) (o_testGlobalInconsistency__4)).isEmpty());
        int[] array_745331015 = new int[]{2,4,6};
        	int[] array_1708412118 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testGlobalInconsistency__7).getLits();
        	for(int ii = 0; ii <array_745331015.length; ii++) {
        		org.junit.Assert.assertEquals(array_745331015[ii], array_1708412118[ii]);
        	};
        Assert.assertFalse(((OriginalWLClause) (o_testGlobalInconsistency__7)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testGlobalInconsistency__7)).getActivity())), 0.1);
        Assert.assertEquals("1[?] 2[?] 3[F] ", ((OriginalWLClause) (o_testGlobalInconsistency__7)).toString());
        Assert.assertEquals(4, ((int) (((OriginalWLClause) (o_testGlobalInconsistency__7)).hashCode())));
        Assert.assertEquals("", ((VecInt) (o_testGlobalInconsistency__9)).toString());
        Assert.assertTrue(((VecInt) (o_testGlobalInconsistency__9)).isEmpty());
        int[] array_1056102257 = new int[]{2,5,8};
        	int[] array_1238023107 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testGlobalInconsistency__13).getLits();
        	for(int ii = 0; ii <array_1056102257.length; ii++) {
        		org.junit.Assert.assertEquals(array_1056102257[ii], array_1238023107[ii]);
        	};
        Assert.assertFalse(((OriginalWLClause) (o_testGlobalInconsistency__13)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testGlobalInconsistency__13)).getActivity())), 0.1);
        Assert.assertEquals("1[?] -2[?] 4[F] ", ((OriginalWLClause) (o_testGlobalInconsistency__13)).toString());
        Assert.assertEquals(5, ((int) (((OriginalWLClause) (o_testGlobalInconsistency__13)).hashCode())));
        Assert.assertEquals("", ((VecInt) (o_testGlobalInconsistency__15)).toString());
        Assert.assertTrue(((VecInt) (o_testGlobalInconsistency__15)).isEmpty());
        int[] array_2120230585 = new int[]{4,10,3};
        	int[] array_978161085 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testGlobalInconsistency__19).getLits();
        	for(int ii = 0; ii <array_2120230585.length; ii++) {
        		org.junit.Assert.assertEquals(array_2120230585[ii], array_978161085[ii]);
        	};
        Assert.assertFalse(((OriginalWLClause) (o_testGlobalInconsistency__19)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testGlobalInconsistency__19)).getActivity())), 0.1);
        Assert.assertEquals("2[?] 5[F] -1[?] ", ((OriginalWLClause) (o_testGlobalInconsistency__19)).toString());
        Assert.assertEquals(5, ((int) (((OriginalWLClause) (o_testGlobalInconsistency__19)).hashCode())));
        Assert.assertEquals("", ((VecInt) (o_testGlobalInconsistency__21)).toString());
        Assert.assertTrue(((VecInt) (o_testGlobalInconsistency__21)).isEmpty());
        int[] array_646833211 = new int[]{5,12,3};
        	int[] array_916459056 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testGlobalInconsistency__26).getLits();
        	for(int ii = 0; ii <array_646833211.length; ii++) {
        		org.junit.Assert.assertEquals(array_646833211[ii], array_916459056[ii]);
        	};
        Assert.assertFalse(((OriginalWLClause) (o_testGlobalInconsistency__26)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testGlobalInconsistency__26)).getActivity())), 0.1);
        Assert.assertEquals("-2[?] 6[F] -1[?] ", ((OriginalWLClause) (o_testGlobalInconsistency__26)).toString());
        Assert.assertEquals(6, ((int) (((OriginalWLClause) (o_testGlobalInconsistency__26)).hashCode())));
    }

    @Test(timeout = 10000)
    public void testEclipseTestCase2() throws Exception, ContradictionException, TimeoutException {
        int o_testEclipseTestCase2__1 = this.solver.newVar(4);
        Assert.assertEquals(4, ((int) (o_testEclipseTestCase2__1)));
        IVecInt clause = new VecInt();
        IVecInt o_testEclipseTestCase2__4 = clause.push((-1)).push(2);
        Assert.assertEquals("-1,2", ((VecInt) (o_testEclipseTestCase2__4)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_testEclipseTestCase2__4)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testEclipseTestCase2__4)).isEmpty());
        this.checkListener.addOriginalClause(clause);
        IConstr o_testEclipseTestCase2__8 = this.solver.addClause(clause);
        int[] array_631881511 = new int[]{3,4,10};
        	int[] array_516632337 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testEclipseTestCase2__8).getLits();
        	for(int ii = 0; ii <array_631881511.length; ii++) {
        		org.junit.Assert.assertEquals(array_631881511[ii], array_516632337[ii]);
        	};
        Assert.assertFalse(((OriginalWLClause) (o_testEclipseTestCase2__8)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testEclipseTestCase2__8)).getActivity())), 0.1);
        Assert.assertEquals("-1[?] 2[?] 5[?] ", ((OriginalWLClause) (o_testEclipseTestCase2__8)).toString());
        Assert.assertEquals(5, ((int) (((OriginalWLClause) (o_testEclipseTestCase2__8)).hashCode())));
        clause.clear();
        IVecInt o_testEclipseTestCase2__10 = clause.push((-1)).push(3);
        Assert.assertEquals("-1,3", ((VecInt) (o_testEclipseTestCase2__10)).toString());
        Assert.assertEquals(1, ((int) (((VecInt) (o_testEclipseTestCase2__10)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testEclipseTestCase2__10)).isEmpty());
        this.checkListener.addOriginalClause(clause);
        IConstr o_testEclipseTestCase2__14 = this.solver.addClause(clause);
        int[] array_2128111712 = new int[]{3,6,12};
        	int[] array_2026272900 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testEclipseTestCase2__14).getLits();
        	for(int ii = 0; ii <array_2128111712.length; ii++) {
        		org.junit.Assert.assertEquals(array_2128111712[ii], array_2026272900[ii]);
        	};
        Assert.assertFalse(((OriginalWLClause) (o_testEclipseTestCase2__14)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testEclipseTestCase2__14)).getActivity())), 0.1);
        Assert.assertEquals("-1[?] 3[?] 6[?] ", ((OriginalWLClause) (o_testEclipseTestCase2__14)).toString());
        Assert.assertEquals(7, ((int) (((OriginalWLClause) (o_testEclipseTestCase2__14)).hashCode())));
        clause.clear();
        IVecInt o_testEclipseTestCase2__16 = clause.push((-2)).push((-3));
        Assert.assertEquals("-2,-3", ((VecInt) (o_testEclipseTestCase2__16)).toString());
        Assert.assertEquals(-2, ((int) (((VecInt) (o_testEclipseTestCase2__16)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testEclipseTestCase2__16)).isEmpty());
        this.checkListener.addOriginalClause(clause);
        IConstr o_testEclipseTestCase2__21 = this.solver.addClause(clause);
        int[] array_1460069037 = new int[]{5,7,14};
        	int[] array_92005784 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testEclipseTestCase2__21).getLits();
        	for(int ii = 0; ii <array_1460069037.length; ii++) {
        		org.junit.Assert.assertEquals(array_1460069037[ii], array_92005784[ii]);
        	};
        Assert.assertFalse(((OriginalWLClause) (o_testEclipseTestCase2__21)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testEclipseTestCase2__21)).getActivity())), 0.1);
        Assert.assertEquals("-2[?] -3[?] 7[?] ", ((OriginalWLClause) (o_testEclipseTestCase2__21)).toString());
        Assert.assertEquals(8, ((int) (((OriginalWLClause) (o_testEclipseTestCase2__21)).hashCode())));
        clause.clear();
        IVecInt o_testEclipseTestCase2__23 = clause.push((-4)).push(1);
        Assert.assertEquals("-4,1", ((VecInt) (o_testEclipseTestCase2__23)).toString());
        Assert.assertEquals(-1, ((int) (((VecInt) (o_testEclipseTestCase2__23)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testEclipseTestCase2__23)).isEmpty());
        this.checkListener.addOriginalClause(clause);
        IConstr o_testEclipseTestCase2__27 = this.solver.addClause(clause);
        int[] array_1484458729 = new int[]{2,9,16};
        	int[] array_628678277 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testEclipseTestCase2__27).getLits();
        	for(int ii = 0; ii <array_1484458729.length; ii++) {
        		org.junit.Assert.assertEquals(array_1484458729[ii], array_628678277[ii]);
        	};
        Assert.assertFalse(((OriginalWLClause) (o_testEclipseTestCase2__27)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testEclipseTestCase2__27)).getActivity())), 0.1);
        Assert.assertEquals("1[?] -4[?] 8[?] ", ((OriginalWLClause) (o_testEclipseTestCase2__27)).toString());
        Assert.assertEquals(9, ((int) (((OriginalWLClause) (o_testEclipseTestCase2__27)).hashCode())));
        clause.clear();
        List<IVecInt> muses = allMUSes.computeAllMUSes(checkListener);
        int o_testEclipseTestCase2__31 = muses.size();
        Assert.assertEquals(0, ((int) (o_testEclipseTestCase2__31)));
        Assert.assertEquals(4, ((int) (o_testEclipseTestCase2__1)));
        Assert.assertEquals("", ((VecInt) (o_testEclipseTestCase2__4)).toString());
        Assert.assertTrue(((VecInt) (o_testEclipseTestCase2__4)).isEmpty());
        int[] array_625466331 = new int[]{3,4,10};
        	int[] array_680015168 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testEclipseTestCase2__8).getLits();
        	for(int ii = 0; ii <array_625466331.length; ii++) {
        		org.junit.Assert.assertEquals(array_625466331[ii], array_680015168[ii]);
        	};
        Assert.assertFalse(((OriginalWLClause) (o_testEclipseTestCase2__8)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testEclipseTestCase2__8)).getActivity())), 0.1);
        Assert.assertEquals("-1[?] 2[?] 5[?] ", ((OriginalWLClause) (o_testEclipseTestCase2__8)).toString());
        Assert.assertEquals(5, ((int) (((OriginalWLClause) (o_testEclipseTestCase2__8)).hashCode())));
        Assert.assertEquals("", ((VecInt) (o_testEclipseTestCase2__10)).toString());
        Assert.assertTrue(((VecInt) (o_testEclipseTestCase2__10)).isEmpty());
        int[] array_30162768 = new int[]{3,6,12};
        	int[] array_1760117071 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testEclipseTestCase2__14).getLits();
        	for(int ii = 0; ii <array_30162768.length; ii++) {
        		org.junit.Assert.assertEquals(array_30162768[ii], array_1760117071[ii]);
        	};
        Assert.assertFalse(((OriginalWLClause) (o_testEclipseTestCase2__14)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testEclipseTestCase2__14)).getActivity())), 0.1);
        Assert.assertEquals("-1[?] 3[?] 6[?] ", ((OriginalWLClause) (o_testEclipseTestCase2__14)).toString());
        Assert.assertEquals(7, ((int) (((OriginalWLClause) (o_testEclipseTestCase2__14)).hashCode())));
        Assert.assertEquals("", ((VecInt) (o_testEclipseTestCase2__16)).toString());
        Assert.assertTrue(((VecInt) (o_testEclipseTestCase2__16)).isEmpty());
        int[] array_587074814 = new int[]{5,7,14};
        	int[] array_1759996544 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testEclipseTestCase2__21).getLits();
        	for(int ii = 0; ii <array_587074814.length; ii++) {
        		org.junit.Assert.assertEquals(array_587074814[ii], array_1759996544[ii]);
        	};
        Assert.assertFalse(((OriginalWLClause) (o_testEclipseTestCase2__21)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testEclipseTestCase2__21)).getActivity())), 0.1);
        Assert.assertEquals("-2[?] -3[?] 7[?] ", ((OriginalWLClause) (o_testEclipseTestCase2__21)).toString());
        Assert.assertEquals(8, ((int) (((OriginalWLClause) (o_testEclipseTestCase2__21)).hashCode())));
        Assert.assertEquals("", ((VecInt) (o_testEclipseTestCase2__23)).toString());
        Assert.assertTrue(((VecInt) (o_testEclipseTestCase2__23)).isEmpty());
        int[] array_183863255 = new int[]{9,16,2};
        	int[] array_1567672146 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testEclipseTestCase2__27).getLits();
        	for(int ii = 0; ii <array_183863255.length; ii++) {
        		org.junit.Assert.assertEquals(array_183863255[ii], array_1567672146[ii]);
        	};
        Assert.assertFalse(((OriginalWLClause) (o_testEclipseTestCase2__27)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testEclipseTestCase2__27)).getActivity())), 0.1);
        Assert.assertEquals("-4[?] 8[?] 1[?] ", ((OriginalWLClause) (o_testEclipseTestCase2__27)).toString());
        Assert.assertEquals(9, ((int) (((OriginalWLClause) (o_testEclipseTestCase2__27)).hashCode())));
    }

    @Test(timeout = 10000)
    public void testExample1CADECedric() throws Exception, ContradictionException, TimeoutException {
        int o_testExample1CADECedric__1 = this.solver.newVar(5);
        Assert.assertEquals(5, ((int) (o_testExample1CADECedric__1)));
        IVecInt clause = new VecInt();
        IVecInt o_testExample1CADECedric__4 = clause.push((-4)).push(5);
        Assert.assertEquals("-4,5", ((VecInt) (o_testExample1CADECedric__4)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_testExample1CADECedric__4)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testExample1CADECedric__4)).isEmpty());
        this.checkListener.addOriginalClause(clause);
        IConstr o_testExample1CADECedric__8 = this.solver.addClause(clause);
        int[] array_1096219195 = new int[]{9,10,12};
        	int[] array_1062426610 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample1CADECedric__8).getLits();
        	for(int ii = 0; ii <array_1096219195.length; ii++) {
        		org.junit.Assert.assertEquals(array_1096219195[ii], array_1062426610[ii]);
        	};
        Assert.assertFalse(((OriginalWLClause) (o_testExample1CADECedric__8)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testExample1CADECedric__8)).getActivity())), 0.1);
        Assert.assertEquals("-4[?] 5[?] 6[?] ", ((OriginalWLClause) (o_testExample1CADECedric__8)).toString());
        Assert.assertEquals(10, ((int) (((OriginalWLClause) (o_testExample1CADECedric__8)).hashCode())));
        clause.clear();
        IVecInt o_testExample1CADECedric__10 = clause.push(2).push((-3));
        Assert.assertEquals("2,-3", ((VecInt) (o_testExample1CADECedric__10)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_testExample1CADECedric__10)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testExample1CADECedric__10)).isEmpty());
        this.checkListener.addOriginalClause(clause);
        IConstr o_testExample1CADECedric__14 = this.solver.addClause(clause);
        int[] array_2028373570 = new int[]{4,7,14};
        	int[] array_1411028109 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample1CADECedric__14).getLits();
        	for(int ii = 0; ii <array_2028373570.length; ii++) {
        		org.junit.Assert.assertEquals(array_2028373570[ii], array_1411028109[ii]);
        	};
        Assert.assertFalse(((OriginalWLClause) (o_testExample1CADECedric__14)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testExample1CADECedric__14)).getActivity())), 0.1);
        Assert.assertEquals("2[?] -3[?] 7[?] ", ((OriginalWLClause) (o_testExample1CADECedric__14)).toString());
        Assert.assertEquals(8, ((int) (((OriginalWLClause) (o_testExample1CADECedric__14)).hashCode())));
        clause.clear();
        IVecInt o_testExample1CADECedric__16 = clause.push((-4));
        Assert.assertEquals("-4", ((VecInt) (o_testExample1CADECedric__16)).toString());
        Assert.assertEquals(-4, ((int) (((VecInt) (o_testExample1CADECedric__16)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testExample1CADECedric__16)).isEmpty());
        this.checkListener.addOriginalClause(clause);
        IConstr o_testExample1CADECedric__19 = this.solver.addClause(clause);
        int[] array_1917111029 = new int[]{9,16};
        	int[] array_636981950 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testExample1CADECedric__19).getLits();
        	for(int ii = 0; ii <array_1917111029.length; ii++) {
        		org.junit.Assert.assertEquals(array_1917111029[ii], array_636981950[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_testExample1CADECedric__19)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testExample1CADECedric__19)).getActivity())), 0.1);
        Assert.assertEquals("-4[?] 8[?]", ((OriginalBinaryClause) (o_testExample1CADECedric__19)).toString());
        Assert.assertEquals(12, ((int) (((OriginalBinaryClause) (o_testExample1CADECedric__19)).hashCode())));
        clause.clear();
        IVecInt o_testExample1CADECedric__21 = clause.push((-1)).push(2);
        Assert.assertEquals("-1,2", ((VecInt) (o_testExample1CADECedric__21)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_testExample1CADECedric__21)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testExample1CADECedric__21)).isEmpty());
        this.checkListener.addOriginalClause(clause);
        IConstr o_testExample1CADECedric__25 = this.solver.addClause(clause);
        int[] array_342650539 = new int[]{3,4,18};
        	int[] array_428809999 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample1CADECedric__25).getLits();
        	for(int ii = 0; ii <array_342650539.length; ii++) {
        		org.junit.Assert.assertEquals(array_342650539[ii], array_428809999[ii]);
        	};
        Assert.assertFalse(((OriginalWLClause) (o_testExample1CADECedric__25)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testExample1CADECedric__25)).getActivity())), 0.1);
        Assert.assertEquals("-1[?] 2[?] 9[?] ", ((OriginalWLClause) (o_testExample1CADECedric__25)).toString());
        Assert.assertEquals(8, ((int) (((OriginalWLClause) (o_testExample1CADECedric__25)).hashCode())));
        clause.clear();
        IVecInt o_testExample1CADECedric__27 = clause.push(1);
        Assert.assertEquals("1", ((VecInt) (o_testExample1CADECedric__27)).toString());
        Assert.assertEquals(1, ((int) (((VecInt) (o_testExample1CADECedric__27)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testExample1CADECedric__27)).isEmpty());
        this.checkListener.addOriginalClause(clause);
        IConstr o_testExample1CADECedric__29 = this.solver.addClause(clause);
        int[] array_1450303765 = new int[]{2,20};
        	int[] array_1890874282 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testExample1CADECedric__29).getLits();
        	for(int ii = 0; ii <array_1450303765.length; ii++) {
        		org.junit.Assert.assertEquals(array_1450303765[ii], array_1890874282[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_testExample1CADECedric__29)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testExample1CADECedric__29)).getActivity())), 0.1);
        Assert.assertEquals("1[?] 10[?]", ((OriginalBinaryClause) (o_testExample1CADECedric__29)).toString());
        Assert.assertEquals(11, ((int) (((OriginalBinaryClause) (o_testExample1CADECedric__29)).hashCode())));
        clause.clear();
        IVecInt o_testExample1CADECedric__31 = clause.push(1).push((-3)).push((-5));
        Assert.assertEquals("1,-3,-5", ((VecInt) (o_testExample1CADECedric__31)).toString());
        Assert.assertEquals(-2, ((int) (((VecInt) (o_testExample1CADECedric__31)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testExample1CADECedric__31)).isEmpty());
        this.checkListener.addOriginalClause(clause);
        IConstr o_testExample1CADECedric__37 = this.solver.addClause(clause);
        int[] array_1641205176 = new int[]{2,7,11,22};
        	int[] array_1310907894 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample1CADECedric__37).getLits();
        	for(int ii = 0; ii <array_1641205176.length; ii++) {
        		org.junit.Assert.assertEquals(array_1641205176[ii], array_1310907894[ii]);
        	};
        Assert.assertFalse(((OriginalWLClause) (o_testExample1CADECedric__37)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testExample1CADECedric__37)).getActivity())), 0.1);
        Assert.assertEquals("1[?] -3[?] -5[?] 11[?] ", ((OriginalWLClause) (o_testExample1CADECedric__37)).toString());
        Assert.assertEquals(10, ((int) (((OriginalWLClause) (o_testExample1CADECedric__37)).hashCode())));
        clause.clear();
        IVecInt o_testExample1CADECedric__39 = clause.push((-1)).push(3).push(4);
        Assert.assertEquals("-1,3,4", ((VecInt) (o_testExample1CADECedric__39)).toString());
        Assert.assertEquals(2, ((int) (((VecInt) (o_testExample1CADECedric__39)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testExample1CADECedric__39)).isEmpty());
        this.checkListener.addOriginalClause(clause);
        IConstr o_testExample1CADECedric__44 = this.solver.addClause(clause);
        int[] array_474759098 = new int[]{3,6,8,24};
        	int[] array_1123190291 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample1CADECedric__44).getLits();
        	for(int ii = 0; ii <array_474759098.length; ii++) {
        		org.junit.Assert.assertEquals(array_474759098[ii], array_1123190291[ii]);
        	};
        Assert.assertFalse(((OriginalWLClause) (o_testExample1CADECedric__44)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testExample1CADECedric__44)).getActivity())), 0.1);
        Assert.assertEquals("-1[?] 3[?] 4[?] 12[?] ", ((OriginalWLClause) (o_testExample1CADECedric__44)).toString());
        Assert.assertEquals(10, ((int) (((OriginalWLClause) (o_testExample1CADECedric__44)).hashCode())));
        clause.clear();
        IVecInt o_testExample1CADECedric__46 = clause.push((-2));
        Assert.assertEquals("-2", ((VecInt) (o_testExample1CADECedric__46)).toString());
        Assert.assertEquals(-2, ((int) (((VecInt) (o_testExample1CADECedric__46)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testExample1CADECedric__46)).isEmpty());
        this.checkListener.addOriginalClause(clause);
        IConstr o_testExample1CADECedric__49 = this.solver.addClause(clause);
        int[] array_522322455 = new int[]{5,26};
        	int[] array_846497352 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testExample1CADECedric__49).getLits();
        	for(int ii = 0; ii <array_522322455.length; ii++) {
        		org.junit.Assert.assertEquals(array_522322455[ii], array_846497352[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_testExample1CADECedric__49)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testExample1CADECedric__49)).getActivity())), 0.1);
        Assert.assertEquals("-2[?] 13[?]", ((OriginalBinaryClause) (o_testExample1CADECedric__49)).toString());
        Assert.assertEquals(15, ((int) (((OriginalBinaryClause) (o_testExample1CADECedric__49)).hashCode())));
        clause.clear();
        List<IVecInt> muses = allMUSes.computeAllMUSes(checkListener);
        int o_testExample1CADECedric__53 = muses.size();
        Assert.assertEquals(2, ((int) (o_testExample1CADECedric__53)));
        Assert.assertEquals(5, ((int) (o_testExample1CADECedric__1)));
        Assert.assertEquals("", ((VecInt) (o_testExample1CADECedric__4)).toString());
        Assert.assertTrue(((VecInt) (o_testExample1CADECedric__4)).isEmpty());
        int[] array_13395021 = new int[]{9,10,12};
        	int[] array_1132059818 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample1CADECedric__8).getLits();
        	for(int ii = 0; ii <array_13395021.length; ii++) {
        		org.junit.Assert.assertEquals(array_13395021[ii], array_1132059818[ii]);
        	};
        Assert.assertFalse(((OriginalWLClause) (o_testExample1CADECedric__8)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testExample1CADECedric__8)).getActivity())), 0.1);
        Assert.assertEquals("-4[?] 5[?] 6[?] ", ((OriginalWLClause) (o_testExample1CADECedric__8)).toString());
        Assert.assertEquals(10, ((int) (((OriginalWLClause) (o_testExample1CADECedric__8)).hashCode())));
        Assert.assertEquals("", ((VecInt) (o_testExample1CADECedric__10)).toString());
        Assert.assertTrue(((VecInt) (o_testExample1CADECedric__10)).isEmpty());
        int[] array_2059735998 = new int[]{4,7,14};
        	int[] array_951908817 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample1CADECedric__14).getLits();
        	for(int ii = 0; ii <array_2059735998.length; ii++) {
        		org.junit.Assert.assertEquals(array_2059735998[ii], array_951908817[ii]);
        	};
        Assert.assertFalse(((OriginalWLClause) (o_testExample1CADECedric__14)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testExample1CADECedric__14)).getActivity())), 0.1);
        Assert.assertEquals("2[?] -3[?] 7[?] ", ((OriginalWLClause) (o_testExample1CADECedric__14)).toString());
        Assert.assertEquals(8, ((int) (((OriginalWLClause) (o_testExample1CADECedric__14)).hashCode())));
        Assert.assertEquals("", ((VecInt) (o_testExample1CADECedric__16)).toString());
        Assert.assertTrue(((VecInt) (o_testExample1CADECedric__16)).isEmpty());
        int[] array_1657558002 = new int[]{9,16};
        	int[] array_1236821265 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testExample1CADECedric__19).getLits();
        	for(int ii = 0; ii <array_1657558002.length; ii++) {
        		org.junit.Assert.assertEquals(array_1657558002[ii], array_1236821265[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_testExample1CADECedric__19)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testExample1CADECedric__19)).getActivity())), 0.1);
        Assert.assertEquals("-4[?] 8[?]", ((OriginalBinaryClause) (o_testExample1CADECedric__19)).toString());
        Assert.assertEquals(12, ((int) (((OriginalBinaryClause) (o_testExample1CADECedric__19)).hashCode())));
        Assert.assertEquals("", ((VecInt) (o_testExample1CADECedric__21)).toString());
        Assert.assertTrue(((VecInt) (o_testExample1CADECedric__21)).isEmpty());
        int[] array_1021325852 = new int[]{4,18,3};
        	int[] array_519653665 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample1CADECedric__25).getLits();
        	for(int ii = 0; ii <array_1021325852.length; ii++) {
        		org.junit.Assert.assertEquals(array_1021325852[ii], array_519653665[ii]);
        	};
        Assert.assertFalse(((OriginalWLClause) (o_testExample1CADECedric__25)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testExample1CADECedric__25)).getActivity())), 0.1);
        Assert.assertEquals("2[?] 9[?] -1[?] ", ((OriginalWLClause) (o_testExample1CADECedric__25)).toString());
        Assert.assertEquals(8, ((int) (((OriginalWLClause) (o_testExample1CADECedric__25)).hashCode())));
        Assert.assertEquals("", ((VecInt) (o_testExample1CADECedric__27)).toString());
        Assert.assertTrue(((VecInt) (o_testExample1CADECedric__27)).isEmpty());
        int[] array_2023942225 = new int[]{2,20};
        	int[] array_1223615889 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testExample1CADECedric__29).getLits();
        	for(int ii = 0; ii <array_2023942225.length; ii++) {
        		org.junit.Assert.assertEquals(array_2023942225[ii], array_1223615889[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_testExample1CADECedric__29)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testExample1CADECedric__29)).getActivity())), 0.1);
        Assert.assertEquals("1[?] 10[F]", ((OriginalBinaryClause) (o_testExample1CADECedric__29)).toString());
        Assert.assertEquals(11, ((int) (((OriginalBinaryClause) (o_testExample1CADECedric__29)).hashCode())));
        Assert.assertEquals("", ((VecInt) (o_testExample1CADECedric__31)).toString());
        Assert.assertTrue(((VecInt) (o_testExample1CADECedric__31)).isEmpty());
        int[] array_389343845 = new int[]{2,11,7,22};
        	int[] array_401578560 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample1CADECedric__37).getLits();
        	for(int ii = 0; ii <array_389343845.length; ii++) {
        		org.junit.Assert.assertEquals(array_389343845[ii], array_401578560[ii]);
        	};
        Assert.assertFalse(((OriginalWLClause) (o_testExample1CADECedric__37)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testExample1CADECedric__37)).getActivity())), 0.1);
        Assert.assertEquals("1[?] -5[?] -3[?] 11[?] ", ((OriginalWLClause) (o_testExample1CADECedric__37)).toString());
        Assert.assertEquals(10, ((int) (((OriginalWLClause) (o_testExample1CADECedric__37)).hashCode())));
        Assert.assertEquals("", ((VecInt) (o_testExample1CADECedric__39)).toString());
        Assert.assertTrue(((VecInt) (o_testExample1CADECedric__39)).isEmpty());
        int[] array_1431822547 = new int[]{6,8,24,3};
        	int[] array_286959549 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample1CADECedric__44).getLits();
        	for(int ii = 0; ii <array_1431822547.length; ii++) {
        		org.junit.Assert.assertEquals(array_1431822547[ii], array_286959549[ii]);
        	};
        Assert.assertFalse(((OriginalWLClause) (o_testExample1CADECedric__44)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testExample1CADECedric__44)).getActivity())), 0.1);
        Assert.assertEquals("3[?] 4[?] 12[?] -1[?] ", ((OriginalWLClause) (o_testExample1CADECedric__44)).toString());
        Assert.assertEquals(10, ((int) (((OriginalWLClause) (o_testExample1CADECedric__44)).hashCode())));
        Assert.assertEquals("", ((VecInt) (o_testExample1CADECedric__46)).toString());
        Assert.assertTrue(((VecInt) (o_testExample1CADECedric__46)).isEmpty());
        int[] array_1206738222 = new int[]{5,26};
        	int[] array_1668696322 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testExample1CADECedric__49).getLits();
        	for(int ii = 0; ii <array_1206738222.length; ii++) {
        		org.junit.Assert.assertEquals(array_1206738222[ii], array_1668696322[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_testExample1CADECedric__49)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testExample1CADECedric__49)).getActivity())), 0.1);
        Assert.assertEquals("-2[?] 13[F]", ((OriginalBinaryClause) (o_testExample1CADECedric__49)).toString());
        Assert.assertEquals(15, ((int) (((OriginalBinaryClause) (o_testExample1CADECedric__49)).hashCode())));
    }

    @Test(timeout = 10000)
    public void testExample3CADECedric() throws Exception, ContradictionException, TimeoutException {
        int o_testExample3CADECedric__1 = this.solver.newVar(6);
        Assert.assertEquals(6, ((int) (o_testExample3CADECedric__1)));
        IVecInt clause = new VecInt();
        IVecInt o_testExample3CADECedric__4 = clause.push(1);
        Assert.assertEquals("1", ((VecInt) (o_testExample3CADECedric__4)).toString());
        Assert.assertEquals(1, ((int) (((VecInt) (o_testExample3CADECedric__4)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testExample3CADECedric__4)).isEmpty());
        this.checkListener.addOriginalClause(clause);
        IConstr o_testExample3CADECedric__6 = this.solver.addClause(clause);
        int[] array_335714866 = new int[]{2,14};
        	int[] array_471100622 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testExample3CADECedric__6).getLits();
        	for(int ii = 0; ii <array_335714866.length; ii++) {
        		org.junit.Assert.assertEquals(array_335714866[ii], array_471100622[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_testExample3CADECedric__6)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testExample3CADECedric__6)).getActivity())), 0.1);
        Assert.assertEquals("1[?] 7[?]", ((OriginalBinaryClause) (o_testExample3CADECedric__6)).toString());
        Assert.assertEquals(8, ((int) (((OriginalBinaryClause) (o_testExample3CADECedric__6)).hashCode())));
        clause.clear();
        IVecInt o_testExample3CADECedric__8 = clause.push(2).push(4);
        Assert.assertEquals("2,4", ((VecInt) (o_testExample3CADECedric__8)).toString());
        Assert.assertEquals(3, ((int) (((VecInt) (o_testExample3CADECedric__8)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testExample3CADECedric__8)).isEmpty());
        this.checkListener.addOriginalClause(clause);
        IConstr o_testExample3CADECedric__11 = this.solver.addClause(clause);
        int[] array_28036555 = new int[]{4,8,16};
        	int[] array_2027123732 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__11).getLits();
        	for(int ii = 0; ii <array_28036555.length; ii++) {
        		org.junit.Assert.assertEquals(array_28036555[ii], array_2027123732[ii]);
        	};
        Assert.assertFalse(((OriginalWLClause) (o_testExample3CADECedric__11)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testExample3CADECedric__11)).getActivity())), 0.1);
        Assert.assertEquals("2[?] 4[?] 8[?] ", ((OriginalWLClause) (o_testExample3CADECedric__11)).toString());
        Assert.assertEquals(9, ((int) (((OriginalWLClause) (o_testExample3CADECedric__11)).hashCode())));
        clause.clear();
        IVecInt o_testExample3CADECedric__13 = clause.push((-2)).push((-5));
        Assert.assertEquals("-2,-5", ((VecInt) (o_testExample3CADECedric__13)).toString());
        Assert.assertEquals(-3, ((int) (((VecInt) (o_testExample3CADECedric__13)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testExample3CADECedric__13)).isEmpty());
        this.checkListener.addOriginalClause(clause);
        IConstr o_testExample3CADECedric__18 = this.solver.addClause(clause);
        int[] array_572173145 = new int[]{5,11,18};
        	int[] array_1446440604 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__18).getLits();
        	for(int ii = 0; ii <array_572173145.length; ii++) {
        		org.junit.Assert.assertEquals(array_572173145[ii], array_1446440604[ii]);
        	};
        Assert.assertFalse(((OriginalWLClause) (o_testExample3CADECedric__18)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testExample3CADECedric__18)).getActivity())), 0.1);
        Assert.assertEquals("-2[?] -5[?] 9[?] ", ((OriginalWLClause) (o_testExample3CADECedric__18)).toString());
        Assert.assertEquals(11, ((int) (((OriginalWLClause) (o_testExample3CADECedric__18)).hashCode())));
        clause.clear();
        IVecInt o_testExample3CADECedric__20 = clause.push(1).push(4);
        Assert.assertEquals("1,4", ((VecInt) (o_testExample3CADECedric__20)).toString());
        Assert.assertEquals(2, ((int) (((VecInt) (o_testExample3CADECedric__20)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testExample3CADECedric__20)).isEmpty());
        this.checkListener.addOriginalClause(clause);
        IConstr o_testExample3CADECedric__23 = this.solver.addClause(clause);
        int[] array_1199334510 = new int[]{2,8,20};
        	int[] array_1046995333 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__23).getLits();
        	for(int ii = 0; ii <array_1199334510.length; ii++) {
        		org.junit.Assert.assertEquals(array_1199334510[ii], array_1046995333[ii]);
        	};
        Assert.assertFalse(((OriginalWLClause) (o_testExample3CADECedric__23)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testExample3CADECedric__23)).getActivity())), 0.1);
        Assert.assertEquals("1[?] 4[?] 10[?] ", ((OriginalWLClause) (o_testExample3CADECedric__23)).toString());
        Assert.assertEquals(10, ((int) (((OriginalWLClause) (o_testExample3CADECedric__23)).hashCode())));
        clause.clear();
        IVecInt o_testExample3CADECedric__25 = clause.push(2).push((-3));
        Assert.assertEquals("2,-3", ((VecInt) (o_testExample3CADECedric__25)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_testExample3CADECedric__25)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testExample3CADECedric__25)).isEmpty());
        this.checkListener.addOriginalClause(clause);
        IConstr o_testExample3CADECedric__29 = this.solver.addClause(clause);
        int[] array_929475412 = new int[]{4,7,22};
        	int[] array_2021468007 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__29).getLits();
        	for(int ii = 0; ii <array_929475412.length; ii++) {
        		org.junit.Assert.assertEquals(array_929475412[ii], array_2021468007[ii]);
        	};
        Assert.assertFalse(((OriginalWLClause) (o_testExample3CADECedric__29)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testExample3CADECedric__29)).getActivity())), 0.1);
        Assert.assertEquals("2[?] -3[?] 11[?] ", ((OriginalWLClause) (o_testExample3CADECedric__29)).toString());
        Assert.assertEquals(11, ((int) (((OriginalWLClause) (o_testExample3CADECedric__29)).hashCode())));
        clause.clear();
        IVecInt o_testExample3CADECedric__31 = clause.push(6);
        Assert.assertEquals("6", ((VecInt) (o_testExample3CADECedric__31)).toString());
        Assert.assertEquals(6, ((int) (((VecInt) (o_testExample3CADECedric__31)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testExample3CADECedric__31)).isEmpty());
        this.checkListener.addOriginalClause(clause);
        IConstr o_testExample3CADECedric__33 = this.solver.addClause(clause);
        int[] array_656726059 = new int[]{12,24};
        	int[] array_2085548796 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testExample3CADECedric__33).getLits();
        	for(int ii = 0; ii <array_656726059.length; ii++) {
        		org.junit.Assert.assertEquals(array_656726059[ii], array_2085548796[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_testExample3CADECedric__33)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testExample3CADECedric__33)).getActivity())), 0.1);
        Assert.assertEquals("6[?] 12[?]", ((OriginalBinaryClause) (o_testExample3CADECedric__33)).toString());
        Assert.assertEquals(18, ((int) (((OriginalBinaryClause) (o_testExample3CADECedric__33)).hashCode())));
        clause.clear();
        IVecInt o_testExample3CADECedric__35 = clause.push(3).push((-4));
        Assert.assertEquals("3,-4", ((VecInt) (o_testExample3CADECedric__35)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_testExample3CADECedric__35)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testExample3CADECedric__35)).isEmpty());
        this.checkListener.addOriginalClause(clause);
        IConstr o_testExample3CADECedric__39 = this.solver.addClause(clause);
        int[] array_558055093 = new int[]{6,9,26};
        	int[] array_1635344698 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__39).getLits();
        	for(int ii = 0; ii <array_558055093.length; ii++) {
        		org.junit.Assert.assertEquals(array_558055093[ii], array_1635344698[ii]);
        	};
        Assert.assertFalse(((OriginalWLClause) (o_testExample3CADECedric__39)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testExample3CADECedric__39)).getActivity())), 0.1);
        Assert.assertEquals("3[?] -4[?] 13[?] ", ((OriginalWLClause) (o_testExample3CADECedric__39)).toString());
        Assert.assertEquals(13, ((int) (((OriginalWLClause) (o_testExample3CADECedric__39)).hashCode())));
        clause.clear();
        IVecInt o_testExample3CADECedric__41 = clause.push((-1));
        Assert.assertEquals("-1", ((VecInt) (o_testExample3CADECedric__41)).toString());
        Assert.assertEquals(-1, ((int) (((VecInt) (o_testExample3CADECedric__41)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testExample3CADECedric__41)).isEmpty());
        this.checkListener.addOriginalClause(clause);
        IConstr o_testExample3CADECedric__44 = this.solver.addClause(clause);
        int[] array_1233065619 = new int[]{3,28};
        	int[] array_1245095490 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testExample3CADECedric__44).getLits();
        	for(int ii = 0; ii <array_1233065619.length; ii++) {
        		org.junit.Assert.assertEquals(array_1233065619[ii], array_1245095490[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_testExample3CADECedric__44)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testExample3CADECedric__44)).getActivity())), 0.1);
        Assert.assertEquals("-1[?] 14[?]", ((OriginalBinaryClause) (o_testExample3CADECedric__44)).toString());
        Assert.assertEquals(15, ((int) (((OriginalBinaryClause) (o_testExample3CADECedric__44)).hashCode())));
        clause.clear();
        IVecInt o_testExample3CADECedric__46 = clause.push((-2)).push((-3));
        Assert.assertEquals("-2,-3", ((VecInt) (o_testExample3CADECedric__46)).toString());
        Assert.assertEquals(-2, ((int) (((VecInt) (o_testExample3CADECedric__46)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testExample3CADECedric__46)).isEmpty());
        this.checkListener.addOriginalClause(clause);
        IConstr o_testExample3CADECedric__51 = this.solver.addClause(clause);
        int[] array_645584472 = new int[]{5,7,30};
        	int[] array_232604353 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__51).getLits();
        	for(int ii = 0; ii <array_645584472.length; ii++) {
        		org.junit.Assert.assertEquals(array_645584472[ii], array_232604353[ii]);
        	};
        Assert.assertFalse(((OriginalWLClause) (o_testExample3CADECedric__51)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testExample3CADECedric__51)).getActivity())), 0.1);
        Assert.assertEquals("-2[?] -3[?] 15[?] ", ((OriginalWLClause) (o_testExample3CADECedric__51)).toString());
        Assert.assertEquals(14, ((int) (((OriginalWLClause) (o_testExample3CADECedric__51)).hashCode())));
        clause.clear();
        IVecInt o_testExample3CADECedric__53 = clause.push(2).push(4).push(6);
        Assert.assertEquals("2,4,6", ((VecInt) (o_testExample3CADECedric__53)).toString());
        Assert.assertEquals(4, ((int) (((VecInt) (o_testExample3CADECedric__53)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testExample3CADECedric__53)).isEmpty());
        this.checkListener.addOriginalClause(clause);
        IConstr o_testExample3CADECedric__57 = this.solver.addClause(clause);
        int[] array_1023774664 = new int[]{4,8,12,32};
        	int[] array_1718993965 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__57).getLits();
        	for(int ii = 0; ii <array_1023774664.length; ii++) {
        		org.junit.Assert.assertEquals(array_1023774664[ii], array_1718993965[ii]);
        	};
        Assert.assertFalse(((OriginalWLClause) (o_testExample3CADECedric__57)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testExample3CADECedric__57)).getActivity())), 0.1);
        Assert.assertEquals("2[?] 4[?] 6[?] 16[?] ", ((OriginalWLClause) (o_testExample3CADECedric__57)).toString());
        Assert.assertEquals(14, ((int) (((OriginalWLClause) (o_testExample3CADECedric__57)).hashCode())));
        clause.clear();
        IVecInt o_testExample3CADECedric__59 = clause.push(5);
        Assert.assertEquals("5", ((VecInt) (o_testExample3CADECedric__59)).toString());
        Assert.assertEquals(5, ((int) (((VecInt) (o_testExample3CADECedric__59)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testExample3CADECedric__59)).isEmpty());
        this.checkListener.addOriginalClause(clause);
        IConstr o_testExample3CADECedric__61 = this.solver.addClause(clause);
        int[] array_2119615823 = new int[]{10,34};
        	int[] array_1536082878 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testExample3CADECedric__61).getLits();
        	for(int ii = 0; ii <array_2119615823.length; ii++) {
        		org.junit.Assert.assertEquals(array_2119615823[ii], array_1536082878[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_testExample3CADECedric__61)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testExample3CADECedric__61)).getActivity())), 0.1);
        Assert.assertEquals("5[?] 17[?]", ((OriginalBinaryClause) (o_testExample3CADECedric__61)).toString());
        Assert.assertEquals(22, ((int) (((OriginalBinaryClause) (o_testExample3CADECedric__61)).hashCode())));
        clause.clear();
        IVecInt o_testExample3CADECedric__63 = clause.push((-6)).push(4);
        Assert.assertEquals("-6,4", ((VecInt) (o_testExample3CADECedric__63)).toString());
        Assert.assertEquals(-1, ((int) (((VecInt) (o_testExample3CADECedric__63)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testExample3CADECedric__63)).isEmpty());
        this.checkListener.addOriginalClause(clause);
        IConstr o_testExample3CADECedric__67 = this.solver.addClause(clause);
        int[] array_1273764582 = new int[]{8,13,36};
        	int[] array_1920226080 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__67).getLits();
        	for(int ii = 0; ii <array_1273764582.length; ii++) {
        		org.junit.Assert.assertEquals(array_1273764582[ii], array_1920226080[ii]);
        	};
        Assert.assertFalse(((OriginalWLClause) (o_testExample3CADECedric__67)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testExample3CADECedric__67)).getActivity())), 0.1);
        Assert.assertEquals("4[?] -6[?] 18[?] ", ((OriginalWLClause) (o_testExample3CADECedric__67)).toString());
        Assert.assertEquals(19, ((int) (((OriginalWLClause) (o_testExample3CADECedric__67)).hashCode())));
        clause.clear();
        IVecInt o_testExample3CADECedric__69 = clause.push((-5)).push((-6));
        Assert.assertEquals("-5,-6", ((VecInt) (o_testExample3CADECedric__69)).toString());
        Assert.assertEquals(-5, ((int) (((VecInt) (o_testExample3CADECedric__69)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testExample3CADECedric__69)).isEmpty());
        this.checkListener.addOriginalClause(clause);
        IConstr o_testExample3CADECedric__74 = this.solver.addClause(clause);
        int[] array_2063885383 = new int[]{11,13,38};
        	int[] array_855720920 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__74).getLits();
        	for(int ii = 0; ii <array_2063885383.length; ii++) {
        		org.junit.Assert.assertEquals(array_2063885383[ii], array_855720920[ii]);
        	};
        Assert.assertFalse(((OriginalWLClause) (o_testExample3CADECedric__74)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testExample3CADECedric__74)).getActivity())), 0.1);
        Assert.assertEquals("-5[?] -6[?] 19[?] ", ((OriginalWLClause) (o_testExample3CADECedric__74)).toString());
        Assert.assertEquals(20, ((int) (((OriginalWLClause) (o_testExample3CADECedric__74)).hashCode())));
        clause.clear();
        IVecInt o_testExample3CADECedric__76 = clause.push(1).push((-3)).push(4);
        Assert.assertEquals("1,-3,4", ((VecInt) (o_testExample3CADECedric__76)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_testExample3CADECedric__76)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testExample3CADECedric__76)).isEmpty());
        this.checkListener.addOriginalClause(clause);
        IConstr o_testExample3CADECedric__81 = this.solver.addClause(clause);
        int[] array_341532737 = new int[]{2,7,8,40};
        	int[] array_1630717123 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__81).getLits();
        	for(int ii = 0; ii <array_341532737.length; ii++) {
        		org.junit.Assert.assertEquals(array_341532737[ii], array_1630717123[ii]);
        	};
        Assert.assertFalse(((OriginalWLClause) (o_testExample3CADECedric__81)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testExample3CADECedric__81)).getActivity())), 0.1);
        Assert.assertEquals("1[?] -3[?] 4[?] 20[?] ", ((OriginalWLClause) (o_testExample3CADECedric__81)).toString());
        Assert.assertEquals(14, ((int) (((OriginalWLClause) (o_testExample3CADECedric__81)).hashCode())));
        clause.clear();
        List<IVecInt> muses = allMUSes.computeAllMUSes(checkListener);
        int o_testExample3CADECedric__85 = muses.size();
        Assert.assertEquals(9, ((int) (o_testExample3CADECedric__85)));
        Assert.assertEquals(6, ((int) (o_testExample3CADECedric__1)));
        Assert.assertEquals("", ((VecInt) (o_testExample3CADECedric__4)).toString());
        Assert.assertTrue(((VecInt) (o_testExample3CADECedric__4)).isEmpty());
        int[] array_1065846110 = new int[]{2,14};
        	int[] array_1056329933 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testExample3CADECedric__6).getLits();
        	for(int ii = 0; ii <array_1065846110.length; ii++) {
        		org.junit.Assert.assertEquals(array_1065846110[ii], array_1056329933[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_testExample3CADECedric__6)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testExample3CADECedric__6)).getActivity())), 0.1);
        Assert.assertEquals("1[?] 7[?]", ((OriginalBinaryClause) (o_testExample3CADECedric__6)).toString());
        Assert.assertEquals(8, ((int) (((OriginalBinaryClause) (o_testExample3CADECedric__6)).hashCode())));
        Assert.assertEquals("", ((VecInt) (o_testExample3CADECedric__8)).toString());
        Assert.assertTrue(((VecInt) (o_testExample3CADECedric__8)).isEmpty());
        int[] array_1978506840 = new int[]{4,16,8};
        	int[] array_964785252 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__11).getLits();
        	for(int ii = 0; ii <array_1978506840.length; ii++) {
        		org.junit.Assert.assertEquals(array_1978506840[ii], array_964785252[ii]);
        	};
        Assert.assertFalse(((OriginalWLClause) (o_testExample3CADECedric__11)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testExample3CADECedric__11)).getActivity())), 0.1);
        Assert.assertEquals("2[?] 8[?] 4[?] ", ((OriginalWLClause) (o_testExample3CADECedric__11)).toString());
        Assert.assertEquals(9, ((int) (((OriginalWLClause) (o_testExample3CADECedric__11)).hashCode())));
        Assert.assertEquals("", ((VecInt) (o_testExample3CADECedric__13)).toString());
        Assert.assertTrue(((VecInt) (o_testExample3CADECedric__13)).isEmpty());
        int[] array_319719329 = new int[]{18,5,11};
        	int[] array_107382710 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__18).getLits();
        	for(int ii = 0; ii <array_319719329.length; ii++) {
        		org.junit.Assert.assertEquals(array_319719329[ii], array_107382710[ii]);
        	};
        Assert.assertFalse(((OriginalWLClause) (o_testExample3CADECedric__18)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testExample3CADECedric__18)).getActivity())), 0.1);
        Assert.assertEquals("9[?] -2[?] -5[?] ", ((OriginalWLClause) (o_testExample3CADECedric__18)).toString());
        Assert.assertEquals(11, ((int) (((OriginalWLClause) (o_testExample3CADECedric__18)).hashCode())));
        Assert.assertEquals("", ((VecInt) (o_testExample3CADECedric__20)).toString());
        Assert.assertTrue(((VecInt) (o_testExample3CADECedric__20)).isEmpty());
        int[] array_1401706523 = new int[]{2,8,20};
        	int[] array_582141270 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__23).getLits();
        	for(int ii = 0; ii <array_1401706523.length; ii++) {
        		org.junit.Assert.assertEquals(array_1401706523[ii], array_582141270[ii]);
        	};
        Assert.assertFalse(((OriginalWLClause) (o_testExample3CADECedric__23)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testExample3CADECedric__23)).getActivity())), 0.1);
        Assert.assertEquals("1[?] 4[?] 10[?] ", ((OriginalWLClause) (o_testExample3CADECedric__23)).toString());
        Assert.assertEquals(10, ((int) (((OriginalWLClause) (o_testExample3CADECedric__23)).hashCode())));
        Assert.assertEquals("", ((VecInt) (o_testExample3CADECedric__25)).toString());
        Assert.assertTrue(((VecInt) (o_testExample3CADECedric__25)).isEmpty());
        int[] array_814486765 = new int[]{4,7,22};
        	int[] array_1681966735 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__29).getLits();
        	for(int ii = 0; ii <array_814486765.length; ii++) {
        		org.junit.Assert.assertEquals(array_814486765[ii], array_1681966735[ii]);
        	};
        Assert.assertFalse(((OriginalWLClause) (o_testExample3CADECedric__29)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testExample3CADECedric__29)).getActivity())), 0.1);
        Assert.assertEquals("2[?] -3[?] 11[?] ", ((OriginalWLClause) (o_testExample3CADECedric__29)).toString());
        Assert.assertEquals(11, ((int) (((OriginalWLClause) (o_testExample3CADECedric__29)).hashCode())));
        Assert.assertEquals("", ((VecInt) (o_testExample3CADECedric__31)).toString());
        Assert.assertTrue(((VecInt) (o_testExample3CADECedric__31)).isEmpty());
        int[] array_1868576422 = new int[]{12,24};
        	int[] array_425747121 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testExample3CADECedric__33).getLits();
        	for(int ii = 0; ii <array_1868576422.length; ii++) {
        		org.junit.Assert.assertEquals(array_1868576422[ii], array_425747121[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_testExample3CADECedric__33)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testExample3CADECedric__33)).getActivity())), 0.1);
        Assert.assertEquals("6[?] 12[?]", ((OriginalBinaryClause) (o_testExample3CADECedric__33)).toString());
        Assert.assertEquals(18, ((int) (((OriginalBinaryClause) (o_testExample3CADECedric__33)).hashCode())));
        Assert.assertEquals("", ((VecInt) (o_testExample3CADECedric__35)).toString());
        Assert.assertTrue(((VecInt) (o_testExample3CADECedric__35)).isEmpty());
        int[] array_1234484683 = new int[]{9,6,26};
        	int[] array_1294758391 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__39).getLits();
        	for(int ii = 0; ii <array_1234484683.length; ii++) {
        		org.junit.Assert.assertEquals(array_1234484683[ii], array_1294758391[ii]);
        	};
        Assert.assertFalse(((OriginalWLClause) (o_testExample3CADECedric__39)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testExample3CADECedric__39)).getActivity())), 0.1);
        Assert.assertEquals("-4[?] 3[?] 13[?] ", ((OriginalWLClause) (o_testExample3CADECedric__39)).toString());
        Assert.assertEquals(13, ((int) (((OriginalWLClause) (o_testExample3CADECedric__39)).hashCode())));
        Assert.assertEquals("", ((VecInt) (o_testExample3CADECedric__41)).toString());
        Assert.assertTrue(((VecInt) (o_testExample3CADECedric__41)).isEmpty());
        int[] array_357425431 = new int[]{3,28};
        	int[] array_1570395053 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testExample3CADECedric__44).getLits();
        	for(int ii = 0; ii <array_357425431.length; ii++) {
        		org.junit.Assert.assertEquals(array_357425431[ii], array_1570395053[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_testExample3CADECedric__44)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testExample3CADECedric__44)).getActivity())), 0.1);
        Assert.assertEquals("-1[?] 14[?]", ((OriginalBinaryClause) (o_testExample3CADECedric__44)).toString());
        Assert.assertEquals(15, ((int) (((OriginalBinaryClause) (o_testExample3CADECedric__44)).hashCode())));
        Assert.assertEquals("", ((VecInt) (o_testExample3CADECedric__46)).toString());
        Assert.assertTrue(((VecInt) (o_testExample3CADECedric__46)).isEmpty());
        int[] array_651844234 = new int[]{7,30,5};
        	int[] array_587453235 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__51).getLits();
        	for(int ii = 0; ii <array_651844234.length; ii++) {
        		org.junit.Assert.assertEquals(array_651844234[ii], array_587453235[ii]);
        	};
        Assert.assertFalse(((OriginalWLClause) (o_testExample3CADECedric__51)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testExample3CADECedric__51)).getActivity())), 0.1);
        Assert.assertEquals("-3[?] 15[?] -2[?] ", ((OriginalWLClause) (o_testExample3CADECedric__51)).toString());
        Assert.assertEquals(14, ((int) (((OriginalWLClause) (o_testExample3CADECedric__51)).hashCode())));
        Assert.assertEquals("", ((VecInt) (o_testExample3CADECedric__53)).toString());
        Assert.assertTrue(((VecInt) (o_testExample3CADECedric__53)).isEmpty());
        int[] array_531804122 = new int[]{12,4,32,8};
        	int[] array_1552565251 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__57).getLits();
        	for(int ii = 0; ii <array_531804122.length; ii++) {
        		org.junit.Assert.assertEquals(array_531804122[ii], array_1552565251[ii]);
        	};
        Assert.assertFalse(((OriginalWLClause) (o_testExample3CADECedric__57)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testExample3CADECedric__57)).getActivity())), 0.1);
        Assert.assertEquals("6[?] 2[?] 16[?] 4[?] ", ((OriginalWLClause) (o_testExample3CADECedric__57)).toString());
        Assert.assertEquals(14, ((int) (((OriginalWLClause) (o_testExample3CADECedric__57)).hashCode())));
        Assert.assertEquals("", ((VecInt) (o_testExample3CADECedric__59)).toString());
        Assert.assertTrue(((VecInt) (o_testExample3CADECedric__59)).isEmpty());
        int[] array_2080617520 = new int[]{10,34};
        	int[] array_1383607688 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testExample3CADECedric__61).getLits();
        	for(int ii = 0; ii <array_2080617520.length; ii++) {
        		org.junit.Assert.assertEquals(array_2080617520[ii], array_1383607688[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_testExample3CADECedric__61)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testExample3CADECedric__61)).getActivity())), 0.1);
        Assert.assertEquals("5[?] 17[?]", ((OriginalBinaryClause) (o_testExample3CADECedric__61)).toString());
        Assert.assertEquals(22, ((int) (((OriginalBinaryClause) (o_testExample3CADECedric__61)).hashCode())));
        Assert.assertEquals("", ((VecInt) (o_testExample3CADECedric__63)).toString());
        Assert.assertTrue(((VecInt) (o_testExample3CADECedric__63)).isEmpty());
        int[] array_664384372 = new int[]{36,8,13};
        	int[] array_690684 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__67).getLits();
        	for(int ii = 0; ii <array_664384372.length; ii++) {
        		org.junit.Assert.assertEquals(array_664384372[ii], array_690684[ii]);
        	};
        Assert.assertFalse(((OriginalWLClause) (o_testExample3CADECedric__67)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testExample3CADECedric__67)).getActivity())), 0.1);
        Assert.assertEquals("18[?] 4[?] -6[?] ", ((OriginalWLClause) (o_testExample3CADECedric__67)).toString());
        Assert.assertEquals(19, ((int) (((OriginalWLClause) (o_testExample3CADECedric__67)).hashCode())));
        Assert.assertEquals("", ((VecInt) (o_testExample3CADECedric__69)).toString());
        Assert.assertTrue(((VecInt) (o_testExample3CADECedric__69)).isEmpty());
        int[] array_297311369 = new int[]{38,13,11};
        	int[] array_266432151 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__74).getLits();
        	for(int ii = 0; ii <array_297311369.length; ii++) {
        		org.junit.Assert.assertEquals(array_297311369[ii], array_266432151[ii]);
        	};
        Assert.assertFalse(((OriginalWLClause) (o_testExample3CADECedric__74)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testExample3CADECedric__74)).getActivity())), 0.1);
        Assert.assertEquals("19[?] -6[?] -5[?] ", ((OriginalWLClause) (o_testExample3CADECedric__74)).toString());
        Assert.assertEquals(20, ((int) (((OriginalWLClause) (o_testExample3CADECedric__74)).hashCode())));
        Assert.assertEquals("", ((VecInt) (o_testExample3CADECedric__76)).toString());
        Assert.assertTrue(((VecInt) (o_testExample3CADECedric__76)).isEmpty());
        int[] array_2095188425 = new int[]{2,7,8,40};
        	int[] array_813286795 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__81).getLits();
        	for(int ii = 0; ii <array_2095188425.length; ii++) {
        		org.junit.Assert.assertEquals(array_2095188425[ii], array_813286795[ii]);
        	};
        Assert.assertFalse(((OriginalWLClause) (o_testExample3CADECedric__81)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testExample3CADECedric__81)).getActivity())), 0.1);
        Assert.assertEquals("1[?] -3[?] 4[?] 20[?] ", ((OriginalWLClause) (o_testExample3CADECedric__81)).toString());
        Assert.assertEquals(14, ((int) (((OriginalWLClause) (o_testExample3CADECedric__81)).hashCode())));
    }
}

