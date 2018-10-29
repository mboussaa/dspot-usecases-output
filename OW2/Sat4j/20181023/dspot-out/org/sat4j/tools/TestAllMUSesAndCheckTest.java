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
    public void testVerySimpleCase() throws Exception {
        IVecInt c1 = new VecInt();
        IVecInt c2 = new VecInt();
        IVecInt o_testVerySimpleCase__5 = c1.push(1);
        Assert.assertEquals("1", ((VecInt) (o_testVerySimpleCase__5)).toString());
        Assert.assertEquals(1, ((int) (((VecInt) (o_testVerySimpleCase__5)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testVerySimpleCase__5)).isEmpty());
        IVecInt o_testVerySimpleCase__6 = c2.push((-1));
        Assert.assertEquals("-1", ((VecInt) (o_testVerySimpleCase__6)).toString());
        Assert.assertEquals(-1, ((int) (((VecInt) (o_testVerySimpleCase__6)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testVerySimpleCase__6)).isEmpty());
        int o_testVerySimpleCase__8 = this.solver.newVar(1);
        Assert.assertEquals(1, ((int) (o_testVerySimpleCase__8)));
        try {
            this.checkListener.addOriginalClause(c1);
            this.checkListener.addOriginalClause(c2);
            IConstr o_testVerySimpleCase__13 = this.solver.addClause(c1);
            int[] array_579714296 = new int[]{2,4};
            	int[] array_1266705815 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testVerySimpleCase__13).getLits();
            	for(int ii = 0; ii <array_579714296.length; ii++) {
            		org.junit.Assert.assertEquals(array_579714296[ii], array_1266705815[ii]);
            	};
            Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testVerySimpleCase__13)).getActivity())), 0.1);
            Assert.assertFalse(((OriginalBinaryClause) (o_testVerySimpleCase__13)).isSatisfied());
            Assert.assertEquals("1[?] 2[?]", ((OriginalBinaryClause) (o_testVerySimpleCase__13)).toString());
            Assert.assertEquals(3, ((int) (((OriginalBinaryClause) (o_testVerySimpleCase__13)).hashCode())));
            IConstr o_testVerySimpleCase__14 = this.solver.addClause(c2);
            int[] array_1471293194 = new int[]{3,6};
            	int[] array_728056842 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testVerySimpleCase__14).getLits();
            	for(int ii = 0; ii <array_1471293194.length; ii++) {
            		org.junit.Assert.assertEquals(array_1471293194[ii], array_728056842[ii]);
            	};
            Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testVerySimpleCase__14)).getActivity())), 0.1);
            Assert.assertFalse(((OriginalBinaryClause) (o_testVerySimpleCase__14)).isSatisfied());
            Assert.assertEquals("-1[?] 3[?]", ((OriginalBinaryClause) (o_testVerySimpleCase__14)).toString());
            Assert.assertEquals(4, ((int) (((OriginalBinaryClause) (o_testVerySimpleCase__14)).hashCode())));
            List<IVecInt> muses = this.allMUSes.computeAllMUSes(this.checkListener);
            int o_testVerySimpleCase__17 = muses.size();
            Assert.assertEquals(1, ((int) (o_testVerySimpleCase__17)));
            int[] array_511426807 = new int[]{2,4};
            	int[] array_1511764224 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testVerySimpleCase__13).getLits();
            	for(int ii = 0; ii <array_511426807.length; ii++) {
            		org.junit.Assert.assertEquals(array_511426807[ii], array_1511764224[ii]);
            	};
            Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testVerySimpleCase__13)).getActivity())), 0.1);
            Assert.assertFalse(((OriginalBinaryClause) (o_testVerySimpleCase__13)).isSatisfied());
            Assert.assertEquals("1[?] 2[F]", ((OriginalBinaryClause) (o_testVerySimpleCase__13)).toString());
            Assert.assertEquals(3, ((int) (((OriginalBinaryClause) (o_testVerySimpleCase__13)).hashCode())));
            int[] array_1834701347 = new int[]{3,6};
            	int[] array_285185404 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testVerySimpleCase__14).getLits();
            	for(int ii = 0; ii <array_1834701347.length; ii++) {
            		org.junit.Assert.assertEquals(array_1834701347[ii], array_285185404[ii]);
            	};
            Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testVerySimpleCase__14)).getActivity())), 0.1);
            Assert.assertFalse(((OriginalBinaryClause) (o_testVerySimpleCase__14)).isSatisfied());
            Assert.assertEquals("-1[?] 3[F]", ((OriginalBinaryClause) (o_testVerySimpleCase__14)).toString());
            Assert.assertEquals(4, ((int) (((OriginalBinaryClause) (o_testVerySimpleCase__14)).hashCode())));
        } catch (ContradictionException e) {
            e.printStackTrace();
        }
        Assert.assertEquals("1,2", ((VecInt) (o_testVerySimpleCase__5)).toString());
        Assert.assertEquals(1, ((int) (((VecInt) (o_testVerySimpleCase__5)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testVerySimpleCase__5)).isEmpty());
        Assert.assertEquals("-1,3", ((VecInt) (o_testVerySimpleCase__6)).toString());
        Assert.assertEquals(1, ((int) (((VecInt) (o_testVerySimpleCase__6)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testVerySimpleCase__6)).isEmpty());
        Assert.assertEquals(1, ((int) (o_testVerySimpleCase__8)));
    }

    @Test(timeout = 10000)
    public void testAlmostGlobalInconsistencyIIIndex() throws Exception, ContradictionException, TimeoutException {
        int o_testAlmostGlobalInconsistencyIIIndex__1 = this.solver.newVar(3);
        Assert.assertEquals(3, ((int) (o_testAlmostGlobalInconsistencyIIIndex__1)));
        IVecInt clause = new VecInt();
        IVecInt o_testAlmostGlobalInconsistencyIIIndex__4 = clause.push(1).push(2);
        Assert.assertEquals("1,2", ((VecInt) (o_testAlmostGlobalInconsistencyIIIndex__4)).toString());
        Assert.assertEquals(1, ((int) (((VecInt) (o_testAlmostGlobalInconsistencyIIIndex__4)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testAlmostGlobalInconsistencyIIIndex__4)).isEmpty());
        this.checkListener.addOriginalClause(clause);
        IConstr o_testAlmostGlobalInconsistencyIIIndex__7 = this.solver.addClause(clause);
        int[] array_1277197333 = new int[]{2,4,8};
        	int[] array_451559378 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testAlmostGlobalInconsistencyIIIndex__7).getLits();
        	for(int ii = 0; ii <array_1277197333.length; ii++) {
        		org.junit.Assert.assertEquals(array_1277197333[ii], array_451559378[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testAlmostGlobalInconsistencyIIIndex__7)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalWLClause) (o_testAlmostGlobalInconsistencyIIIndex__7)).isSatisfied());
        Assert.assertEquals("1[?] 2[?] 4[?] ", ((OriginalWLClause) (o_testAlmostGlobalInconsistencyIIIndex__7)).toString());
        Assert.assertEquals(4, ((int) (((OriginalWLClause) (o_testAlmostGlobalInconsistencyIIIndex__7)).hashCode())));
        clause.clear();
        IVecInt o_testAlmostGlobalInconsistencyIIIndex__9 = clause.push(1).push((-2));
        Assert.assertEquals("1,-2", ((VecInt) (o_testAlmostGlobalInconsistencyIIIndex__9)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_testAlmostGlobalInconsistencyIIIndex__9)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testAlmostGlobalInconsistencyIIIndex__9)).isEmpty());
        this.checkListener.addOriginalClause(clause);
        IConstr o_testAlmostGlobalInconsistencyIIIndex__13 = this.solver.addClause(clause);
        int[] array_539305492 = new int[]{2,5,10};
        	int[] array_2041404087 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testAlmostGlobalInconsistencyIIIndex__13).getLits();
        	for(int ii = 0; ii <array_539305492.length; ii++) {
        		org.junit.Assert.assertEquals(array_539305492[ii], array_2041404087[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testAlmostGlobalInconsistencyIIIndex__13)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalWLClause) (o_testAlmostGlobalInconsistencyIIIndex__13)).isSatisfied());
        Assert.assertEquals("1[?] -2[?] 5[?] ", ((OriginalWLClause) (o_testAlmostGlobalInconsistencyIIIndex__13)).toString());
        Assert.assertEquals(5, ((int) (((OriginalWLClause) (o_testAlmostGlobalInconsistencyIIIndex__13)).hashCode())));
        clause.clear();
        IVecInt o_testAlmostGlobalInconsistencyIIIndex__15 = clause.push(1).push(3);
        Assert.assertEquals("1,3", ((VecInt) (o_testAlmostGlobalInconsistencyIIIndex__15)).toString());
        Assert.assertEquals(2, ((int) (((VecInt) (o_testAlmostGlobalInconsistencyIIIndex__15)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testAlmostGlobalInconsistencyIIIndex__15)).isEmpty());
        this.checkListener.addOriginalClause(clause);
        IConstr o_testAlmostGlobalInconsistencyIIIndex__18 = this.solver.addClause(clause);
        int[] array_806323824 = new int[]{2,6,12};
        	int[] array_77504538 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testAlmostGlobalInconsistencyIIIndex__18).getLits();
        	for(int ii = 0; ii <array_806323824.length; ii++) {
        		org.junit.Assert.assertEquals(array_806323824[ii], array_77504538[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testAlmostGlobalInconsistencyIIIndex__18)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalWLClause) (o_testAlmostGlobalInconsistencyIIIndex__18)).isSatisfied());
        Assert.assertEquals("1[?] 3[?] 6[?] ", ((OriginalWLClause) (o_testAlmostGlobalInconsistencyIIIndex__18)).toString());
        Assert.assertEquals(6, ((int) (((OriginalWLClause) (o_testAlmostGlobalInconsistencyIIIndex__18)).hashCode())));
        clause.clear();
        IVecInt o_testAlmostGlobalInconsistencyIIIndex__20 = clause.push((-1)).push(2);
        Assert.assertEquals("-1,2", ((VecInt) (o_testAlmostGlobalInconsistencyIIIndex__20)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_testAlmostGlobalInconsistencyIIIndex__20)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testAlmostGlobalInconsistencyIIIndex__20)).isEmpty());
        this.checkListener.addOriginalClause(clause);
        IConstr o_testAlmostGlobalInconsistencyIIIndex__24 = this.solver.addClause(clause);
        int[] array_409643395 = new int[]{3,4,14};
        	int[] array_951642998 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testAlmostGlobalInconsistencyIIIndex__24).getLits();
        	for(int ii = 0; ii <array_409643395.length; ii++) {
        		org.junit.Assert.assertEquals(array_409643395[ii], array_951642998[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testAlmostGlobalInconsistencyIIIndex__24)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalWLClause) (o_testAlmostGlobalInconsistencyIIIndex__24)).isSatisfied());
        Assert.assertEquals("-1[?] 2[?] 7[?] ", ((OriginalWLClause) (o_testAlmostGlobalInconsistencyIIIndex__24)).toString());
        Assert.assertEquals(7, ((int) (((OriginalWLClause) (o_testAlmostGlobalInconsistencyIIIndex__24)).hashCode())));
        clause.clear();
        IVecInt o_testAlmostGlobalInconsistencyIIIndex__26 = clause.push((-1)).push((-2));
        Assert.assertEquals("-1,-2", ((VecInt) (o_testAlmostGlobalInconsistencyIIIndex__26)).toString());
        Assert.assertEquals(-1, ((int) (((VecInt) (o_testAlmostGlobalInconsistencyIIIndex__26)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testAlmostGlobalInconsistencyIIIndex__26)).isEmpty());
        this.checkListener.addOriginalClause(clause);
        IConstr o_testAlmostGlobalInconsistencyIIIndex__31 = this.solver.addClause(clause);
        int[] array_932229205 = new int[]{3,5,16};
        	int[] array_1227602745 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testAlmostGlobalInconsistencyIIIndex__31).getLits();
        	for(int ii = 0; ii <array_932229205.length; ii++) {
        		org.junit.Assert.assertEquals(array_932229205[ii], array_1227602745[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testAlmostGlobalInconsistencyIIIndex__31)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalWLClause) (o_testAlmostGlobalInconsistencyIIIndex__31)).isSatisfied());
        Assert.assertEquals("-1[?] -2[?] 8[?] ", ((OriginalWLClause) (o_testAlmostGlobalInconsistencyIIIndex__31)).toString());
        Assert.assertEquals(8, ((int) (((OriginalWLClause) (o_testAlmostGlobalInconsistencyIIIndex__31)).hashCode())));
        clause.clear();
        List<IVecInt> muses = allMUSes.computeAllMUSes(checkListener);
        int o_testAlmostGlobalInconsistencyIIIndex__35 = muses.size();
        Assert.assertEquals(1, ((int) (o_testAlmostGlobalInconsistencyIIIndex__35)));
        Assert.assertEquals(3, ((int) (o_testAlmostGlobalInconsistencyIIIndex__1)));
        Assert.assertEquals("", ((VecInt) (o_testAlmostGlobalInconsistencyIIIndex__4)).toString());
        Assert.assertTrue(((VecInt) (o_testAlmostGlobalInconsistencyIIIndex__4)).isEmpty());
        int[] array_1832903391 = new int[]{2,4,8};
        	int[] array_566827444 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testAlmostGlobalInconsistencyIIIndex__7).getLits();
        	for(int ii = 0; ii <array_1832903391.length; ii++) {
        		org.junit.Assert.assertEquals(array_1832903391[ii], array_566827444[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testAlmostGlobalInconsistencyIIIndex__7)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalWLClause) (o_testAlmostGlobalInconsistencyIIIndex__7)).isSatisfied());
        Assert.assertEquals("1[?] 2[?] 4[F] ", ((OriginalWLClause) (o_testAlmostGlobalInconsistencyIIIndex__7)).toString());
        Assert.assertEquals(4, ((int) (((OriginalWLClause) (o_testAlmostGlobalInconsistencyIIIndex__7)).hashCode())));
        Assert.assertEquals("", ((VecInt) (o_testAlmostGlobalInconsistencyIIIndex__9)).toString());
        Assert.assertTrue(((VecInt) (o_testAlmostGlobalInconsistencyIIIndex__9)).isEmpty());
        int[] array_41484259 = new int[]{2,5,10};
        	int[] array_1660021251 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testAlmostGlobalInconsistencyIIIndex__13).getLits();
        	for(int ii = 0; ii <array_41484259.length; ii++) {
        		org.junit.Assert.assertEquals(array_41484259[ii], array_1660021251[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testAlmostGlobalInconsistencyIIIndex__13)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalWLClause) (o_testAlmostGlobalInconsistencyIIIndex__13)).isSatisfied());
        Assert.assertEquals("1[?] -2[?] 5[F] ", ((OriginalWLClause) (o_testAlmostGlobalInconsistencyIIIndex__13)).toString());
        Assert.assertEquals(5, ((int) (((OriginalWLClause) (o_testAlmostGlobalInconsistencyIIIndex__13)).hashCode())));
        Assert.assertEquals("", ((VecInt) (o_testAlmostGlobalInconsistencyIIIndex__15)).toString());
        Assert.assertTrue(((VecInt) (o_testAlmostGlobalInconsistencyIIIndex__15)).isEmpty());
        int[] array_1224473187 = new int[]{2,6,12};
        	int[] array_1784252092 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testAlmostGlobalInconsistencyIIIndex__18).getLits();
        	for(int ii = 0; ii <array_1224473187.length; ii++) {
        		org.junit.Assert.assertEquals(array_1224473187[ii], array_1784252092[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testAlmostGlobalInconsistencyIIIndex__18)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalWLClause) (o_testAlmostGlobalInconsistencyIIIndex__18)).isSatisfied());
        Assert.assertEquals("1[?] 3[?] 6[?] ", ((OriginalWLClause) (o_testAlmostGlobalInconsistencyIIIndex__18)).toString());
        Assert.assertEquals(6, ((int) (((OriginalWLClause) (o_testAlmostGlobalInconsistencyIIIndex__18)).hashCode())));
        Assert.assertEquals("", ((VecInt) (o_testAlmostGlobalInconsistencyIIIndex__20)).toString());
        Assert.assertTrue(((VecInt) (o_testAlmostGlobalInconsistencyIIIndex__20)).isEmpty());
        int[] array_577657856 = new int[]{4,14,3};
        	int[] array_110603213 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testAlmostGlobalInconsistencyIIIndex__24).getLits();
        	for(int ii = 0; ii <array_577657856.length; ii++) {
        		org.junit.Assert.assertEquals(array_577657856[ii], array_110603213[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testAlmostGlobalInconsistencyIIIndex__24)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalWLClause) (o_testAlmostGlobalInconsistencyIIIndex__24)).isSatisfied());
        Assert.assertEquals("2[?] 7[F] -1[?] ", ((OriginalWLClause) (o_testAlmostGlobalInconsistencyIIIndex__24)).toString());
        Assert.assertEquals(7, ((int) (((OriginalWLClause) (o_testAlmostGlobalInconsistencyIIIndex__24)).hashCode())));
        Assert.assertEquals("", ((VecInt) (o_testAlmostGlobalInconsistencyIIIndex__26)).toString());
        Assert.assertTrue(((VecInt) (o_testAlmostGlobalInconsistencyIIIndex__26)).isEmpty());
        int[] array_1461493731 = new int[]{5,16,3};
        	int[] array_1918693274 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testAlmostGlobalInconsistencyIIIndex__31).getLits();
        	for(int ii = 0; ii <array_1461493731.length; ii++) {
        		org.junit.Assert.assertEquals(array_1461493731[ii], array_1918693274[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testAlmostGlobalInconsistencyIIIndex__31)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalWLClause) (o_testAlmostGlobalInconsistencyIIIndex__31)).isSatisfied());
        Assert.assertEquals("-2[?] 8[F] -1[?] ", ((OriginalWLClause) (o_testAlmostGlobalInconsistencyIIIndex__31)).toString());
        Assert.assertEquals(8, ((int) (((OriginalWLClause) (o_testAlmostGlobalInconsistencyIIIndex__31)).hashCode())));
    }

    @Test(timeout = 10000)
    public void testTheCaseOfTwoMUSes() throws Exception, ContradictionException, TimeoutException {
        int o_testTheCaseOfTwoMUSes__1 = this.solver.newVar(4);
        Assert.assertEquals(4, ((int) (o_testTheCaseOfTwoMUSes__1)));
        IVecInt clause = new VecInt();
        IVecInt o_testTheCaseOfTwoMUSes__4 = clause.push(1).push(2);
        Assert.assertEquals("1,2", ((VecInt) (o_testTheCaseOfTwoMUSes__4)).toString());
        Assert.assertEquals(1, ((int) (((VecInt) (o_testTheCaseOfTwoMUSes__4)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testTheCaseOfTwoMUSes__4)).isEmpty());
        this.checkListener.addOriginalClause(clause);
        IConstr c1 = this.solver.addClause(clause);
        clause.clear();
        IVecInt o_testTheCaseOfTwoMUSes__10 = clause.push(1).push((-2));
        Assert.assertEquals("1,-2", ((VecInt) (o_testTheCaseOfTwoMUSes__10)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_testTheCaseOfTwoMUSes__10)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testTheCaseOfTwoMUSes__10)).isEmpty());
        this.checkListener.addOriginalClause(clause);
        IConstr c2 = this.solver.addClause(clause);
        clause.clear();
        IVecInt o_testTheCaseOfTwoMUSes__17 = clause.push((-1)).push(3);
        Assert.assertEquals("-1,3", ((VecInt) (o_testTheCaseOfTwoMUSes__17)).toString());
        Assert.assertEquals(1, ((int) (((VecInt) (o_testTheCaseOfTwoMUSes__17)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testTheCaseOfTwoMUSes__17)).isEmpty());
        this.checkListener.addOriginalClause(clause);
        IConstr o_testTheCaseOfTwoMUSes__21 = this.solver.addClause(clause);
        int[] array_1490784739 = new int[]{3,6,14};
        	int[] array_920037367 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testTheCaseOfTwoMUSes__21).getLits();
        	for(int ii = 0; ii <array_1490784739.length; ii++) {
        		org.junit.Assert.assertEquals(array_1490784739[ii], array_920037367[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testTheCaseOfTwoMUSes__21)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalWLClause) (o_testTheCaseOfTwoMUSes__21)).isSatisfied());
        Assert.assertEquals("-1[?] 3[?] 7[?] ", ((OriginalWLClause) (o_testTheCaseOfTwoMUSes__21)).toString());
        Assert.assertEquals(7, ((int) (((OriginalWLClause) (o_testTheCaseOfTwoMUSes__21)).hashCode())));
        clause.clear();
        IVecInt o_testTheCaseOfTwoMUSes__23 = clause.push((-1)).push((-3));
        Assert.assertEquals("-1,-3", ((VecInt) (o_testTheCaseOfTwoMUSes__23)).toString());
        Assert.assertEquals(-2, ((int) (((VecInt) (o_testTheCaseOfTwoMUSes__23)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testTheCaseOfTwoMUSes__23)).isEmpty());
        this.checkListener.addOriginalClause(clause);
        IConstr o_testTheCaseOfTwoMUSes__28 = this.solver.addClause(clause);
        int[] array_1411769582 = new int[]{3,7,16};
        	int[] array_1973209931 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testTheCaseOfTwoMUSes__28).getLits();
        	for(int ii = 0; ii <array_1411769582.length; ii++) {
        		org.junit.Assert.assertEquals(array_1411769582[ii], array_1973209931[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testTheCaseOfTwoMUSes__28)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalWLClause) (o_testTheCaseOfTwoMUSes__28)).isSatisfied());
        Assert.assertEquals("-1[?] -3[?] 8[?] ", ((OriginalWLClause) (o_testTheCaseOfTwoMUSes__28)).toString());
        Assert.assertEquals(8, ((int) (((OriginalWLClause) (o_testTheCaseOfTwoMUSes__28)).hashCode())));
        clause.clear();
        IVecInt o_testTheCaseOfTwoMUSes__30 = clause.push((-1)).push(4);
        Assert.assertEquals("-1,4", ((VecInt) (o_testTheCaseOfTwoMUSes__30)).toString());
        Assert.assertEquals(1, ((int) (((VecInt) (o_testTheCaseOfTwoMUSes__30)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testTheCaseOfTwoMUSes__30)).isEmpty());
        this.checkListener.addOriginalClause(clause);
        IConstr o_testTheCaseOfTwoMUSes__34 = this.solver.addClause(clause);
        int[] array_1241259380 = new int[]{3,8,18};
        	int[] array_1372236783 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testTheCaseOfTwoMUSes__34).getLits();
        	for(int ii = 0; ii <array_1241259380.length; ii++) {
        		org.junit.Assert.assertEquals(array_1241259380[ii], array_1372236783[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testTheCaseOfTwoMUSes__34)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalWLClause) (o_testTheCaseOfTwoMUSes__34)).isSatisfied());
        Assert.assertEquals("-1[?] 4[?] 9[?] ", ((OriginalWLClause) (o_testTheCaseOfTwoMUSes__34)).toString());
        Assert.assertEquals(9, ((int) (((OriginalWLClause) (o_testTheCaseOfTwoMUSes__34)).hashCode())));
        clause.clear();
        IVecInt o_testTheCaseOfTwoMUSes__36 = clause.push((-1)).push((-4));
        Assert.assertEquals("-1,-4", ((VecInt) (o_testTheCaseOfTwoMUSes__36)).toString());
        Assert.assertEquals(-2, ((int) (((VecInt) (o_testTheCaseOfTwoMUSes__36)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testTheCaseOfTwoMUSes__36)).isEmpty());
        this.checkListener.addOriginalClause(clause);
        IConstr o_testTheCaseOfTwoMUSes__41 = this.solver.addClause(clause);
        int[] array_1067417954 = new int[]{3,9,20};
        	int[] array_339746675 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testTheCaseOfTwoMUSes__41).getLits();
        	for(int ii = 0; ii <array_1067417954.length; ii++) {
        		org.junit.Assert.assertEquals(array_1067417954[ii], array_339746675[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testTheCaseOfTwoMUSes__41)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalWLClause) (o_testTheCaseOfTwoMUSes__41)).isSatisfied());
        Assert.assertEquals("-1[?] -4[?] 10[?] ", ((OriginalWLClause) (o_testTheCaseOfTwoMUSes__41)).toString());
        Assert.assertEquals(10, ((int) (((OriginalWLClause) (o_testTheCaseOfTwoMUSes__41)).hashCode())));
        clause.clear();
        List<IVecInt> muses = allMUSes.computeAllMUSes(checkListener);
        int o_testTheCaseOfTwoMUSes__45 = muses.size();
        Assert.assertEquals(2, ((int) (o_testTheCaseOfTwoMUSes__45)));
        Assert.assertEquals(4, ((int) (o_testTheCaseOfTwoMUSes__1)));
        Assert.assertEquals("", ((VecInt) (o_testTheCaseOfTwoMUSes__4)).toString());
        Assert.assertTrue(((VecInt) (o_testTheCaseOfTwoMUSes__4)).isEmpty());
        Assert.assertEquals("", ((VecInt) (o_testTheCaseOfTwoMUSes__10)).toString());
        Assert.assertTrue(((VecInt) (o_testTheCaseOfTwoMUSes__10)).isEmpty());
        Assert.assertEquals("", ((VecInt) (o_testTheCaseOfTwoMUSes__17)).toString());
        Assert.assertTrue(((VecInt) (o_testTheCaseOfTwoMUSes__17)).isEmpty());
        int[] array_1360057752 = new int[]{6,14,3};
        	int[] array_2024044901 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testTheCaseOfTwoMUSes__21).getLits();
        	for(int ii = 0; ii <array_1360057752.length; ii++) {
        		org.junit.Assert.assertEquals(array_1360057752[ii], array_2024044901[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testTheCaseOfTwoMUSes__21)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalWLClause) (o_testTheCaseOfTwoMUSes__21)).isSatisfied());
        Assert.assertEquals("3[?] 7[?] -1[?] ", ((OriginalWLClause) (o_testTheCaseOfTwoMUSes__21)).toString());
        Assert.assertEquals(7, ((int) (((OriginalWLClause) (o_testTheCaseOfTwoMUSes__21)).hashCode())));
        Assert.assertEquals("", ((VecInt) (o_testTheCaseOfTwoMUSes__23)).toString());
        Assert.assertTrue(((VecInt) (o_testTheCaseOfTwoMUSes__23)).isEmpty());
        int[] array_1745991239 = new int[]{16,7,3};
        	int[] array_1016300921 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testTheCaseOfTwoMUSes__28).getLits();
        	for(int ii = 0; ii <array_1745991239.length; ii++) {
        		org.junit.Assert.assertEquals(array_1745991239[ii], array_1016300921[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testTheCaseOfTwoMUSes__28)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalWLClause) (o_testTheCaseOfTwoMUSes__28)).isSatisfied());
        Assert.assertEquals("8[?] -3[?] -1[?] ", ((OriginalWLClause) (o_testTheCaseOfTwoMUSes__28)).toString());
        Assert.assertEquals(8, ((int) (((OriginalWLClause) (o_testTheCaseOfTwoMUSes__28)).hashCode())));
        Assert.assertEquals("", ((VecInt) (o_testTheCaseOfTwoMUSes__30)).toString());
        Assert.assertTrue(((VecInt) (o_testTheCaseOfTwoMUSes__30)).isEmpty());
        int[] array_1097282652 = new int[]{8,18,3};
        	int[] array_830046701 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testTheCaseOfTwoMUSes__34).getLits();
        	for(int ii = 0; ii <array_1097282652.length; ii++) {
        		org.junit.Assert.assertEquals(array_1097282652[ii], array_830046701[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testTheCaseOfTwoMUSes__34)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalWLClause) (o_testTheCaseOfTwoMUSes__34)).isSatisfied());
        Assert.assertEquals("4[?] 9[?] -1[?] ", ((OriginalWLClause) (o_testTheCaseOfTwoMUSes__34)).toString());
        Assert.assertEquals(9, ((int) (((OriginalWLClause) (o_testTheCaseOfTwoMUSes__34)).hashCode())));
        Assert.assertEquals("", ((VecInt) (o_testTheCaseOfTwoMUSes__36)).toString());
        Assert.assertTrue(((VecInt) (o_testTheCaseOfTwoMUSes__36)).isEmpty());
        int[] array_1881035040 = new int[]{20,9,3};
        	int[] array_456341994 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testTheCaseOfTwoMUSes__41).getLits();
        	for(int ii = 0; ii <array_1881035040.length; ii++) {
        		org.junit.Assert.assertEquals(array_1881035040[ii], array_456341994[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testTheCaseOfTwoMUSes__41)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalWLClause) (o_testTheCaseOfTwoMUSes__41)).isSatisfied());
        Assert.assertEquals("10[?] -4[?] -1[?] ", ((OriginalWLClause) (o_testTheCaseOfTwoMUSes__41)).toString());
        Assert.assertEquals(10, ((int) (((OriginalWLClause) (o_testTheCaseOfTwoMUSes__41)).hashCode())));
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
        int[] array_1460069037 = new int[]{3,4,10};
        	int[] array_92005784 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testEclipseTestCase2__8).getLits();
        	for(int ii = 0; ii <array_1460069037.length; ii++) {
        		org.junit.Assert.assertEquals(array_1460069037[ii], array_92005784[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testEclipseTestCase2__8)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalWLClause) (o_testEclipseTestCase2__8)).isSatisfied());
        Assert.assertEquals("-1[?] 2[?] 5[?] ", ((OriginalWLClause) (o_testEclipseTestCase2__8)).toString());
        Assert.assertEquals(5, ((int) (((OriginalWLClause) (o_testEclipseTestCase2__8)).hashCode())));
        clause.clear();
        IVecInt o_testEclipseTestCase2__10 = clause.push((-1)).push(3);
        Assert.assertEquals("-1,3", ((VecInt) (o_testEclipseTestCase2__10)).toString());
        Assert.assertEquals(1, ((int) (((VecInt) (o_testEclipseTestCase2__10)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testEclipseTestCase2__10)).isEmpty());
        this.checkListener.addOriginalClause(clause);
        IConstr o_testEclipseTestCase2__14 = this.solver.addClause(clause);
        int[] array_1484458729 = new int[]{3,6,12};
        	int[] array_628678277 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testEclipseTestCase2__14).getLits();
        	for(int ii = 0; ii <array_1484458729.length; ii++) {
        		org.junit.Assert.assertEquals(array_1484458729[ii], array_628678277[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testEclipseTestCase2__14)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalWLClause) (o_testEclipseTestCase2__14)).isSatisfied());
        Assert.assertEquals("-1[?] 3[?] 6[?] ", ((OriginalWLClause) (o_testEclipseTestCase2__14)).toString());
        Assert.assertEquals(7, ((int) (((OriginalWLClause) (o_testEclipseTestCase2__14)).hashCode())));
        clause.clear();
        IVecInt o_testEclipseTestCase2__16 = clause.push((-2)).push((-3));
        Assert.assertEquals("-2,-3", ((VecInt) (o_testEclipseTestCase2__16)).toString());
        Assert.assertEquals(-2, ((int) (((VecInt) (o_testEclipseTestCase2__16)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testEclipseTestCase2__16)).isEmpty());
        this.checkListener.addOriginalClause(clause);
        IConstr o_testEclipseTestCase2__21 = this.solver.addClause(clause);
        int[] array_625466331 = new int[]{5,7,14};
        	int[] array_680015168 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testEclipseTestCase2__21).getLits();
        	for(int ii = 0; ii <array_625466331.length; ii++) {
        		org.junit.Assert.assertEquals(array_625466331[ii], array_680015168[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testEclipseTestCase2__21)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalWLClause) (o_testEclipseTestCase2__21)).isSatisfied());
        Assert.assertEquals("-2[?] -3[?] 7[?] ", ((OriginalWLClause) (o_testEclipseTestCase2__21)).toString());
        Assert.assertEquals(8, ((int) (((OriginalWLClause) (o_testEclipseTestCase2__21)).hashCode())));
        clause.clear();
        IVecInt o_testEclipseTestCase2__23 = clause.push((-4)).push(1);
        Assert.assertEquals("-4,1", ((VecInt) (o_testEclipseTestCase2__23)).toString());
        Assert.assertEquals(-1, ((int) (((VecInt) (o_testEclipseTestCase2__23)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testEclipseTestCase2__23)).isEmpty());
        this.checkListener.addOriginalClause(clause);
        IConstr o_testEclipseTestCase2__27 = this.solver.addClause(clause);
        int[] array_30162768 = new int[]{2,9,16};
        	int[] array_1760117071 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testEclipseTestCase2__27).getLits();
        	for(int ii = 0; ii <array_30162768.length; ii++) {
        		org.junit.Assert.assertEquals(array_30162768[ii], array_1760117071[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testEclipseTestCase2__27)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalWLClause) (o_testEclipseTestCase2__27)).isSatisfied());
        Assert.assertEquals("1[?] -4[?] 8[?] ", ((OriginalWLClause) (o_testEclipseTestCase2__27)).toString());
        Assert.assertEquals(9, ((int) (((OriginalWLClause) (o_testEclipseTestCase2__27)).hashCode())));
        clause.clear();
        List<IVecInt> muses = allMUSes.computeAllMUSes(checkListener);
        int o_testEclipseTestCase2__31 = muses.size();
        Assert.assertEquals(0, ((int) (o_testEclipseTestCase2__31)));
        Assert.assertEquals(4, ((int) (o_testEclipseTestCase2__1)));
        Assert.assertEquals("", ((VecInt) (o_testEclipseTestCase2__4)).toString());
        Assert.assertTrue(((VecInt) (o_testEclipseTestCase2__4)).isEmpty());
        int[] array_587074814 = new int[]{3,4,10};
        	int[] array_1759996544 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testEclipseTestCase2__8).getLits();
        	for(int ii = 0; ii <array_587074814.length; ii++) {
        		org.junit.Assert.assertEquals(array_587074814[ii], array_1759996544[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testEclipseTestCase2__8)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalWLClause) (o_testEclipseTestCase2__8)).isSatisfied());
        Assert.assertEquals("-1[?] 2[?] 5[?] ", ((OriginalWLClause) (o_testEclipseTestCase2__8)).toString());
        Assert.assertEquals(5, ((int) (((OriginalWLClause) (o_testEclipseTestCase2__8)).hashCode())));
        Assert.assertEquals("", ((VecInt) (o_testEclipseTestCase2__10)).toString());
        Assert.assertTrue(((VecInt) (o_testEclipseTestCase2__10)).isEmpty());
        int[] array_183863255 = new int[]{3,6,12};
        	int[] array_1567672146 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testEclipseTestCase2__14).getLits();
        	for(int ii = 0; ii <array_183863255.length; ii++) {
        		org.junit.Assert.assertEquals(array_183863255[ii], array_1567672146[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testEclipseTestCase2__14)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalWLClause) (o_testEclipseTestCase2__14)).isSatisfied());
        Assert.assertEquals("-1[?] 3[?] 6[?] ", ((OriginalWLClause) (o_testEclipseTestCase2__14)).toString());
        Assert.assertEquals(7, ((int) (((OriginalWLClause) (o_testEclipseTestCase2__14)).hashCode())));
        Assert.assertEquals("", ((VecInt) (o_testEclipseTestCase2__16)).toString());
        Assert.assertTrue(((VecInt) (o_testEclipseTestCase2__16)).isEmpty());
        int[] array_1096219195 = new int[]{5,7,14};
        	int[] array_1062426610 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testEclipseTestCase2__21).getLits();
        	for(int ii = 0; ii <array_1096219195.length; ii++) {
        		org.junit.Assert.assertEquals(array_1096219195[ii], array_1062426610[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testEclipseTestCase2__21)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalWLClause) (o_testEclipseTestCase2__21)).isSatisfied());
        Assert.assertEquals("-2[?] -3[?] 7[?] ", ((OriginalWLClause) (o_testEclipseTestCase2__21)).toString());
        Assert.assertEquals(8, ((int) (((OriginalWLClause) (o_testEclipseTestCase2__21)).hashCode())));
        Assert.assertEquals("", ((VecInt) (o_testEclipseTestCase2__23)).toString());
        Assert.assertTrue(((VecInt) (o_testEclipseTestCase2__23)).isEmpty());
        int[] array_2028373570 = new int[]{9,16,2};
        	int[] array_1411028109 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testEclipseTestCase2__27).getLits();
        	for(int ii = 0; ii <array_2028373570.length; ii++) {
        		org.junit.Assert.assertEquals(array_2028373570[ii], array_1411028109[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testEclipseTestCase2__27)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalWLClause) (o_testEclipseTestCase2__27)).isSatisfied());
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
        int[] array_1917111029 = new int[]{9,10,12};
        	int[] array_636981950 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample1CADECedric__8).getLits();
        	for(int ii = 0; ii <array_1917111029.length; ii++) {
        		org.junit.Assert.assertEquals(array_1917111029[ii], array_636981950[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testExample1CADECedric__8)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalWLClause) (o_testExample1CADECedric__8)).isSatisfied());
        Assert.assertEquals("-4[?] 5[?] 6[?] ", ((OriginalWLClause) (o_testExample1CADECedric__8)).toString());
        Assert.assertEquals(10, ((int) (((OriginalWLClause) (o_testExample1CADECedric__8)).hashCode())));
        clause.clear();
        IVecInt o_testExample1CADECedric__10 = clause.push(2).push((-3));
        Assert.assertEquals("2,-3", ((VecInt) (o_testExample1CADECedric__10)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_testExample1CADECedric__10)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testExample1CADECedric__10)).isEmpty());
        this.checkListener.addOriginalClause(clause);
        IConstr o_testExample1CADECedric__14 = this.solver.addClause(clause);
        int[] array_342650539 = new int[]{4,7,14};
        	int[] array_428809999 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample1CADECedric__14).getLits();
        	for(int ii = 0; ii <array_342650539.length; ii++) {
        		org.junit.Assert.assertEquals(array_342650539[ii], array_428809999[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testExample1CADECedric__14)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalWLClause) (o_testExample1CADECedric__14)).isSatisfied());
        Assert.assertEquals("2[?] -3[?] 7[?] ", ((OriginalWLClause) (o_testExample1CADECedric__14)).toString());
        Assert.assertEquals(8, ((int) (((OriginalWLClause) (o_testExample1CADECedric__14)).hashCode())));
        clause.clear();
        IVecInt o_testExample1CADECedric__16 = clause.push((-4));
        Assert.assertEquals("-4", ((VecInt) (o_testExample1CADECedric__16)).toString());
        Assert.assertEquals(-4, ((int) (((VecInt) (o_testExample1CADECedric__16)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testExample1CADECedric__16)).isEmpty());
        this.checkListener.addOriginalClause(clause);
        IConstr o_testExample1CADECedric__19 = this.solver.addClause(clause);
        int[] array_1450303765 = new int[]{9,16};
        	int[] array_1890874282 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testExample1CADECedric__19).getLits();
        	for(int ii = 0; ii <array_1450303765.length; ii++) {
        		org.junit.Assert.assertEquals(array_1450303765[ii], array_1890874282[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testExample1CADECedric__19)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalBinaryClause) (o_testExample1CADECedric__19)).isSatisfied());
        Assert.assertEquals("-4[?] 8[?]", ((OriginalBinaryClause) (o_testExample1CADECedric__19)).toString());
        Assert.assertEquals(12, ((int) (((OriginalBinaryClause) (o_testExample1CADECedric__19)).hashCode())));
        clause.clear();
        IVecInt o_testExample1CADECedric__21 = clause.push((-1)).push(2);
        Assert.assertEquals("-1,2", ((VecInt) (o_testExample1CADECedric__21)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_testExample1CADECedric__21)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testExample1CADECedric__21)).isEmpty());
        this.checkListener.addOriginalClause(clause);
        IConstr o_testExample1CADECedric__25 = this.solver.addClause(clause);
        int[] array_1641205176 = new int[]{3,4,18};
        	int[] array_1310907894 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample1CADECedric__25).getLits();
        	for(int ii = 0; ii <array_1641205176.length; ii++) {
        		org.junit.Assert.assertEquals(array_1641205176[ii], array_1310907894[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testExample1CADECedric__25)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalWLClause) (o_testExample1CADECedric__25)).isSatisfied());
        Assert.assertEquals("-1[?] 2[?] 9[?] ", ((OriginalWLClause) (o_testExample1CADECedric__25)).toString());
        Assert.assertEquals(8, ((int) (((OriginalWLClause) (o_testExample1CADECedric__25)).hashCode())));
        clause.clear();
        IVecInt o_testExample1CADECedric__27 = clause.push(1);
        Assert.assertEquals("1", ((VecInt) (o_testExample1CADECedric__27)).toString());
        Assert.assertEquals(1, ((int) (((VecInt) (o_testExample1CADECedric__27)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testExample1CADECedric__27)).isEmpty());
        this.checkListener.addOriginalClause(clause);
        IConstr o_testExample1CADECedric__29 = this.solver.addClause(clause);
        int[] array_474759098 = new int[]{2,20};
        	int[] array_1123190291 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testExample1CADECedric__29).getLits();
        	for(int ii = 0; ii <array_474759098.length; ii++) {
        		org.junit.Assert.assertEquals(array_474759098[ii], array_1123190291[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testExample1CADECedric__29)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalBinaryClause) (o_testExample1CADECedric__29)).isSatisfied());
        Assert.assertEquals("1[?] 10[?]", ((OriginalBinaryClause) (o_testExample1CADECedric__29)).toString());
        Assert.assertEquals(11, ((int) (((OriginalBinaryClause) (o_testExample1CADECedric__29)).hashCode())));
        clause.clear();
        IVecInt o_testExample1CADECedric__31 = clause.push(1).push((-3)).push((-5));
        Assert.assertEquals("1,-3,-5", ((VecInt) (o_testExample1CADECedric__31)).toString());
        Assert.assertEquals(-2, ((int) (((VecInt) (o_testExample1CADECedric__31)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testExample1CADECedric__31)).isEmpty());
        this.checkListener.addOriginalClause(clause);
        IConstr o_testExample1CADECedric__37 = this.solver.addClause(clause);
        int[] array_522322455 = new int[]{2,7,11,22};
        	int[] array_846497352 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample1CADECedric__37).getLits();
        	for(int ii = 0; ii <array_522322455.length; ii++) {
        		org.junit.Assert.assertEquals(array_522322455[ii], array_846497352[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testExample1CADECedric__37)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalWLClause) (o_testExample1CADECedric__37)).isSatisfied());
        Assert.assertEquals("1[?] -3[?] -5[?] 11[?] ", ((OriginalWLClause) (o_testExample1CADECedric__37)).toString());
        Assert.assertEquals(10, ((int) (((OriginalWLClause) (o_testExample1CADECedric__37)).hashCode())));
        clause.clear();
        IVecInt o_testExample1CADECedric__39 = clause.push((-1)).push(3).push(4);
        Assert.assertEquals("-1,3,4", ((VecInt) (o_testExample1CADECedric__39)).toString());
        Assert.assertEquals(2, ((int) (((VecInt) (o_testExample1CADECedric__39)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testExample1CADECedric__39)).isEmpty());
        this.checkListener.addOriginalClause(clause);
        IConstr o_testExample1CADECedric__44 = this.solver.addClause(clause);
        int[] array_13395021 = new int[]{3,6,8,24};
        	int[] array_1132059818 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample1CADECedric__44).getLits();
        	for(int ii = 0; ii <array_13395021.length; ii++) {
        		org.junit.Assert.assertEquals(array_13395021[ii], array_1132059818[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testExample1CADECedric__44)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalWLClause) (o_testExample1CADECedric__44)).isSatisfied());
        Assert.assertEquals("-1[?] 3[?] 4[?] 12[?] ", ((OriginalWLClause) (o_testExample1CADECedric__44)).toString());
        Assert.assertEquals(10, ((int) (((OriginalWLClause) (o_testExample1CADECedric__44)).hashCode())));
        clause.clear();
        IVecInt o_testExample1CADECedric__46 = clause.push((-2));
        Assert.assertEquals("-2", ((VecInt) (o_testExample1CADECedric__46)).toString());
        Assert.assertEquals(-2, ((int) (((VecInt) (o_testExample1CADECedric__46)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testExample1CADECedric__46)).isEmpty());
        this.checkListener.addOriginalClause(clause);
        IConstr o_testExample1CADECedric__49 = this.solver.addClause(clause);
        int[] array_2059735998 = new int[]{5,26};
        	int[] array_951908817 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testExample1CADECedric__49).getLits();
        	for(int ii = 0; ii <array_2059735998.length; ii++) {
        		org.junit.Assert.assertEquals(array_2059735998[ii], array_951908817[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testExample1CADECedric__49)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalBinaryClause) (o_testExample1CADECedric__49)).isSatisfied());
        Assert.assertEquals("-2[?] 13[?]", ((OriginalBinaryClause) (o_testExample1CADECedric__49)).toString());
        Assert.assertEquals(15, ((int) (((OriginalBinaryClause) (o_testExample1CADECedric__49)).hashCode())));
        clause.clear();
        List<IVecInt> muses = allMUSes.computeAllMUSes(checkListener);
        int o_testExample1CADECedric__53 = muses.size();
        Assert.assertEquals(2, ((int) (o_testExample1CADECedric__53)));
        Assert.assertEquals(5, ((int) (o_testExample1CADECedric__1)));
        Assert.assertEquals("", ((VecInt) (o_testExample1CADECedric__4)).toString());
        Assert.assertTrue(((VecInt) (o_testExample1CADECedric__4)).isEmpty());
        int[] array_1657558002 = new int[]{9,10,12};
        	int[] array_1236821265 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample1CADECedric__8).getLits();
        	for(int ii = 0; ii <array_1657558002.length; ii++) {
        		org.junit.Assert.assertEquals(array_1657558002[ii], array_1236821265[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testExample1CADECedric__8)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalWLClause) (o_testExample1CADECedric__8)).isSatisfied());
        Assert.assertEquals("-4[?] 5[?] 6[?] ", ((OriginalWLClause) (o_testExample1CADECedric__8)).toString());
        Assert.assertEquals(10, ((int) (((OriginalWLClause) (o_testExample1CADECedric__8)).hashCode())));
        Assert.assertEquals("", ((VecInt) (o_testExample1CADECedric__10)).toString());
        Assert.assertTrue(((VecInt) (o_testExample1CADECedric__10)).isEmpty());
        int[] array_1021325852 = new int[]{4,7,14};
        	int[] array_519653665 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample1CADECedric__14).getLits();
        	for(int ii = 0; ii <array_1021325852.length; ii++) {
        		org.junit.Assert.assertEquals(array_1021325852[ii], array_519653665[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testExample1CADECedric__14)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalWLClause) (o_testExample1CADECedric__14)).isSatisfied());
        Assert.assertEquals("2[?] -3[?] 7[?] ", ((OriginalWLClause) (o_testExample1CADECedric__14)).toString());
        Assert.assertEquals(8, ((int) (((OriginalWLClause) (o_testExample1CADECedric__14)).hashCode())));
        Assert.assertEquals("", ((VecInt) (o_testExample1CADECedric__16)).toString());
        Assert.assertTrue(((VecInt) (o_testExample1CADECedric__16)).isEmpty());
        int[] array_2023942225 = new int[]{9,16};
        	int[] array_1223615889 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testExample1CADECedric__19).getLits();
        	for(int ii = 0; ii <array_2023942225.length; ii++) {
        		org.junit.Assert.assertEquals(array_2023942225[ii], array_1223615889[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testExample1CADECedric__19)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalBinaryClause) (o_testExample1CADECedric__19)).isSatisfied());
        Assert.assertEquals("-4[?] 8[?]", ((OriginalBinaryClause) (o_testExample1CADECedric__19)).toString());
        Assert.assertEquals(12, ((int) (((OriginalBinaryClause) (o_testExample1CADECedric__19)).hashCode())));
        Assert.assertEquals("", ((VecInt) (o_testExample1CADECedric__21)).toString());
        Assert.assertTrue(((VecInt) (o_testExample1CADECedric__21)).isEmpty());
        int[] array_389343845 = new int[]{4,18,3};
        	int[] array_401578560 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample1CADECedric__25).getLits();
        	for(int ii = 0; ii <array_389343845.length; ii++) {
        		org.junit.Assert.assertEquals(array_389343845[ii], array_401578560[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testExample1CADECedric__25)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalWLClause) (o_testExample1CADECedric__25)).isSatisfied());
        Assert.assertEquals("2[?] 9[?] -1[?] ", ((OriginalWLClause) (o_testExample1CADECedric__25)).toString());
        Assert.assertEquals(8, ((int) (((OriginalWLClause) (o_testExample1CADECedric__25)).hashCode())));
        Assert.assertEquals("", ((VecInt) (o_testExample1CADECedric__27)).toString());
        Assert.assertTrue(((VecInt) (o_testExample1CADECedric__27)).isEmpty());
        int[] array_1431822547 = new int[]{2,20};
        	int[] array_286959549 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testExample1CADECedric__29).getLits();
        	for(int ii = 0; ii <array_1431822547.length; ii++) {
        		org.junit.Assert.assertEquals(array_1431822547[ii], array_286959549[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testExample1CADECedric__29)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalBinaryClause) (o_testExample1CADECedric__29)).isSatisfied());
        Assert.assertEquals("1[?] 10[F]", ((OriginalBinaryClause) (o_testExample1CADECedric__29)).toString());
        Assert.assertEquals(11, ((int) (((OriginalBinaryClause) (o_testExample1CADECedric__29)).hashCode())));
        Assert.assertEquals("", ((VecInt) (o_testExample1CADECedric__31)).toString());
        Assert.assertTrue(((VecInt) (o_testExample1CADECedric__31)).isEmpty());
        int[] array_1206738222 = new int[]{2,11,7,22};
        	int[] array_1668696322 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample1CADECedric__37).getLits();
        	for(int ii = 0; ii <array_1206738222.length; ii++) {
        		org.junit.Assert.assertEquals(array_1206738222[ii], array_1668696322[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testExample1CADECedric__37)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalWLClause) (o_testExample1CADECedric__37)).isSatisfied());
        Assert.assertEquals("1[?] -5[?] -3[?] 11[?] ", ((OriginalWLClause) (o_testExample1CADECedric__37)).toString());
        Assert.assertEquals(10, ((int) (((OriginalWLClause) (o_testExample1CADECedric__37)).hashCode())));
        Assert.assertEquals("", ((VecInt) (o_testExample1CADECedric__39)).toString());
        Assert.assertTrue(((VecInt) (o_testExample1CADECedric__39)).isEmpty());
        int[] array_335714866 = new int[]{6,8,24,3};
        	int[] array_471100622 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample1CADECedric__44).getLits();
        	for(int ii = 0; ii <array_335714866.length; ii++) {
        		org.junit.Assert.assertEquals(array_335714866[ii], array_471100622[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testExample1CADECedric__44)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalWLClause) (o_testExample1CADECedric__44)).isSatisfied());
        Assert.assertEquals("3[?] 4[?] 12[?] -1[?] ", ((OriginalWLClause) (o_testExample1CADECedric__44)).toString());
        Assert.assertEquals(10, ((int) (((OriginalWLClause) (o_testExample1CADECedric__44)).hashCode())));
        Assert.assertEquals("", ((VecInt) (o_testExample1CADECedric__46)).toString());
        Assert.assertTrue(((VecInt) (o_testExample1CADECedric__46)).isEmpty());
        int[] array_28036555 = new int[]{5,26};
        	int[] array_2027123732 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testExample1CADECedric__49).getLits();
        	for(int ii = 0; ii <array_28036555.length; ii++) {
        		org.junit.Assert.assertEquals(array_28036555[ii], array_2027123732[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testExample1CADECedric__49)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalBinaryClause) (o_testExample1CADECedric__49)).isSatisfied());
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
        int[] array_572173145 = new int[]{2,14};
        	int[] array_1446440604 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testExample3CADECedric__6).getLits();
        	for(int ii = 0; ii <array_572173145.length; ii++) {
        		org.junit.Assert.assertEquals(array_572173145[ii], array_1446440604[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testExample3CADECedric__6)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalBinaryClause) (o_testExample3CADECedric__6)).isSatisfied());
        Assert.assertEquals("1[?] 7[?]", ((OriginalBinaryClause) (o_testExample3CADECedric__6)).toString());
        Assert.assertEquals(8, ((int) (((OriginalBinaryClause) (o_testExample3CADECedric__6)).hashCode())));
        clause.clear();
        IVecInt o_testExample3CADECedric__8 = clause.push(2).push(4);
        Assert.assertEquals("2,4", ((VecInt) (o_testExample3CADECedric__8)).toString());
        Assert.assertEquals(3, ((int) (((VecInt) (o_testExample3CADECedric__8)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testExample3CADECedric__8)).isEmpty());
        this.checkListener.addOriginalClause(clause);
        IConstr o_testExample3CADECedric__11 = this.solver.addClause(clause);
        int[] array_1199334510 = new int[]{4,8,16};
        	int[] array_1046995333 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__11).getLits();
        	for(int ii = 0; ii <array_1199334510.length; ii++) {
        		org.junit.Assert.assertEquals(array_1199334510[ii], array_1046995333[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testExample3CADECedric__11)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalWLClause) (o_testExample3CADECedric__11)).isSatisfied());
        Assert.assertEquals("2[?] 4[?] 8[?] ", ((OriginalWLClause) (o_testExample3CADECedric__11)).toString());
        Assert.assertEquals(9, ((int) (((OriginalWLClause) (o_testExample3CADECedric__11)).hashCode())));
        clause.clear();
        IVecInt o_testExample3CADECedric__13 = clause.push((-2)).push((-5));
        Assert.assertEquals("-2,-5", ((VecInt) (o_testExample3CADECedric__13)).toString());
        Assert.assertEquals(-3, ((int) (((VecInt) (o_testExample3CADECedric__13)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testExample3CADECedric__13)).isEmpty());
        this.checkListener.addOriginalClause(clause);
        IConstr o_testExample3CADECedric__18 = this.solver.addClause(clause);
        int[] array_929475412 = new int[]{5,11,18};
        	int[] array_2021468007 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__18).getLits();
        	for(int ii = 0; ii <array_929475412.length; ii++) {
        		org.junit.Assert.assertEquals(array_929475412[ii], array_2021468007[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testExample3CADECedric__18)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalWLClause) (o_testExample3CADECedric__18)).isSatisfied());
        Assert.assertEquals("-2[?] -5[?] 9[?] ", ((OriginalWLClause) (o_testExample3CADECedric__18)).toString());
        Assert.assertEquals(11, ((int) (((OriginalWLClause) (o_testExample3CADECedric__18)).hashCode())));
        clause.clear();
        IVecInt o_testExample3CADECedric__20 = clause.push(1).push(4);
        Assert.assertEquals("1,4", ((VecInt) (o_testExample3CADECedric__20)).toString());
        Assert.assertEquals(2, ((int) (((VecInt) (o_testExample3CADECedric__20)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testExample3CADECedric__20)).isEmpty());
        this.checkListener.addOriginalClause(clause);
        IConstr o_testExample3CADECedric__23 = this.solver.addClause(clause);
        int[] array_656726059 = new int[]{2,8,20};
        	int[] array_2085548796 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__23).getLits();
        	for(int ii = 0; ii <array_656726059.length; ii++) {
        		org.junit.Assert.assertEquals(array_656726059[ii], array_2085548796[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testExample3CADECedric__23)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalWLClause) (o_testExample3CADECedric__23)).isSatisfied());
        Assert.assertEquals("1[?] 4[?] 10[?] ", ((OriginalWLClause) (o_testExample3CADECedric__23)).toString());
        Assert.assertEquals(10, ((int) (((OriginalWLClause) (o_testExample3CADECedric__23)).hashCode())));
        clause.clear();
        IVecInt o_testExample3CADECedric__25 = clause.push(2).push((-3));
        Assert.assertEquals("2,-3", ((VecInt) (o_testExample3CADECedric__25)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_testExample3CADECedric__25)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testExample3CADECedric__25)).isEmpty());
        this.checkListener.addOriginalClause(clause);
        IConstr o_testExample3CADECedric__29 = this.solver.addClause(clause);
        int[] array_558055093 = new int[]{4,7,22};
        	int[] array_1635344698 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__29).getLits();
        	for(int ii = 0; ii <array_558055093.length; ii++) {
        		org.junit.Assert.assertEquals(array_558055093[ii], array_1635344698[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testExample3CADECedric__29)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalWLClause) (o_testExample3CADECedric__29)).isSatisfied());
        Assert.assertEquals("2[?] -3[?] 11[?] ", ((OriginalWLClause) (o_testExample3CADECedric__29)).toString());
        Assert.assertEquals(11, ((int) (((OriginalWLClause) (o_testExample3CADECedric__29)).hashCode())));
        clause.clear();
        IVecInt o_testExample3CADECedric__31 = clause.push(6);
        Assert.assertEquals("6", ((VecInt) (o_testExample3CADECedric__31)).toString());
        Assert.assertEquals(6, ((int) (((VecInt) (o_testExample3CADECedric__31)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testExample3CADECedric__31)).isEmpty());
        this.checkListener.addOriginalClause(clause);
        IConstr o_testExample3CADECedric__33 = this.solver.addClause(clause);
        int[] array_1233065619 = new int[]{12,24};
        	int[] array_1245095490 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testExample3CADECedric__33).getLits();
        	for(int ii = 0; ii <array_1233065619.length; ii++) {
        		org.junit.Assert.assertEquals(array_1233065619[ii], array_1245095490[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testExample3CADECedric__33)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalBinaryClause) (o_testExample3CADECedric__33)).isSatisfied());
        Assert.assertEquals("6[?] 12[?]", ((OriginalBinaryClause) (o_testExample3CADECedric__33)).toString());
        Assert.assertEquals(18, ((int) (((OriginalBinaryClause) (o_testExample3CADECedric__33)).hashCode())));
        clause.clear();
        IVecInt o_testExample3CADECedric__35 = clause.push(3).push((-4));
        Assert.assertEquals("3,-4", ((VecInt) (o_testExample3CADECedric__35)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_testExample3CADECedric__35)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testExample3CADECedric__35)).isEmpty());
        this.checkListener.addOriginalClause(clause);
        IConstr o_testExample3CADECedric__39 = this.solver.addClause(clause);
        int[] array_645584472 = new int[]{6,9,26};
        	int[] array_232604353 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__39).getLits();
        	for(int ii = 0; ii <array_645584472.length; ii++) {
        		org.junit.Assert.assertEquals(array_645584472[ii], array_232604353[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testExample3CADECedric__39)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalWLClause) (o_testExample3CADECedric__39)).isSatisfied());
        Assert.assertEquals("3[?] -4[?] 13[?] ", ((OriginalWLClause) (o_testExample3CADECedric__39)).toString());
        Assert.assertEquals(13, ((int) (((OriginalWLClause) (o_testExample3CADECedric__39)).hashCode())));
        clause.clear();
        IVecInt o_testExample3CADECedric__41 = clause.push((-1));
        Assert.assertEquals("-1", ((VecInt) (o_testExample3CADECedric__41)).toString());
        Assert.assertEquals(-1, ((int) (((VecInt) (o_testExample3CADECedric__41)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testExample3CADECedric__41)).isEmpty());
        this.checkListener.addOriginalClause(clause);
        IConstr o_testExample3CADECedric__44 = this.solver.addClause(clause);
        int[] array_1023774664 = new int[]{3,28};
        	int[] array_1718993965 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testExample3CADECedric__44).getLits();
        	for(int ii = 0; ii <array_1023774664.length; ii++) {
        		org.junit.Assert.assertEquals(array_1023774664[ii], array_1718993965[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testExample3CADECedric__44)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalBinaryClause) (o_testExample3CADECedric__44)).isSatisfied());
        Assert.assertEquals("-1[?] 14[?]", ((OriginalBinaryClause) (o_testExample3CADECedric__44)).toString());
        Assert.assertEquals(15, ((int) (((OriginalBinaryClause) (o_testExample3CADECedric__44)).hashCode())));
        clause.clear();
        IVecInt o_testExample3CADECedric__46 = clause.push((-2)).push((-3));
        Assert.assertEquals("-2,-3", ((VecInt) (o_testExample3CADECedric__46)).toString());
        Assert.assertEquals(-2, ((int) (((VecInt) (o_testExample3CADECedric__46)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testExample3CADECedric__46)).isEmpty());
        this.checkListener.addOriginalClause(clause);
        IConstr o_testExample3CADECedric__51 = this.solver.addClause(clause);
        int[] array_2119615823 = new int[]{5,7,30};
        	int[] array_1536082878 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__51).getLits();
        	for(int ii = 0; ii <array_2119615823.length; ii++) {
        		org.junit.Assert.assertEquals(array_2119615823[ii], array_1536082878[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testExample3CADECedric__51)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalWLClause) (o_testExample3CADECedric__51)).isSatisfied());
        Assert.assertEquals("-2[?] -3[?] 15[?] ", ((OriginalWLClause) (o_testExample3CADECedric__51)).toString());
        Assert.assertEquals(14, ((int) (((OriginalWLClause) (o_testExample3CADECedric__51)).hashCode())));
        clause.clear();
        IVecInt o_testExample3CADECedric__53 = clause.push(2).push(4).push(6);
        Assert.assertEquals("2,4,6", ((VecInt) (o_testExample3CADECedric__53)).toString());
        Assert.assertEquals(4, ((int) (((VecInt) (o_testExample3CADECedric__53)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testExample3CADECedric__53)).isEmpty());
        this.checkListener.addOriginalClause(clause);
        IConstr o_testExample3CADECedric__57 = this.solver.addClause(clause);
        int[] array_1273764582 = new int[]{4,8,12,32};
        	int[] array_1920226080 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__57).getLits();
        	for(int ii = 0; ii <array_1273764582.length; ii++) {
        		org.junit.Assert.assertEquals(array_1273764582[ii], array_1920226080[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testExample3CADECedric__57)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalWLClause) (o_testExample3CADECedric__57)).isSatisfied());
        Assert.assertEquals("2[?] 4[?] 6[?] 16[?] ", ((OriginalWLClause) (o_testExample3CADECedric__57)).toString());
        Assert.assertEquals(14, ((int) (((OriginalWLClause) (o_testExample3CADECedric__57)).hashCode())));
        clause.clear();
        IVecInt o_testExample3CADECedric__59 = clause.push(5);
        Assert.assertEquals("5", ((VecInt) (o_testExample3CADECedric__59)).toString());
        Assert.assertEquals(5, ((int) (((VecInt) (o_testExample3CADECedric__59)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testExample3CADECedric__59)).isEmpty());
        this.checkListener.addOriginalClause(clause);
        IConstr o_testExample3CADECedric__61 = this.solver.addClause(clause);
        int[] array_2063885383 = new int[]{10,34};
        	int[] array_855720920 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testExample3CADECedric__61).getLits();
        	for(int ii = 0; ii <array_2063885383.length; ii++) {
        		org.junit.Assert.assertEquals(array_2063885383[ii], array_855720920[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testExample3CADECedric__61)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalBinaryClause) (o_testExample3CADECedric__61)).isSatisfied());
        Assert.assertEquals("5[?] 17[?]", ((OriginalBinaryClause) (o_testExample3CADECedric__61)).toString());
        Assert.assertEquals(22, ((int) (((OriginalBinaryClause) (o_testExample3CADECedric__61)).hashCode())));
        clause.clear();
        IVecInt o_testExample3CADECedric__63 = clause.push((-6)).push(4);
        Assert.assertEquals("-6,4", ((VecInt) (o_testExample3CADECedric__63)).toString());
        Assert.assertEquals(-1, ((int) (((VecInt) (o_testExample3CADECedric__63)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testExample3CADECedric__63)).isEmpty());
        this.checkListener.addOriginalClause(clause);
        IConstr o_testExample3CADECedric__67 = this.solver.addClause(clause);
        int[] array_341532737 = new int[]{8,13,36};
        	int[] array_1630717123 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__67).getLits();
        	for(int ii = 0; ii <array_341532737.length; ii++) {
        		org.junit.Assert.assertEquals(array_341532737[ii], array_1630717123[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testExample3CADECedric__67)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalWLClause) (o_testExample3CADECedric__67)).isSatisfied());
        Assert.assertEquals("4[?] -6[?] 18[?] ", ((OriginalWLClause) (o_testExample3CADECedric__67)).toString());
        Assert.assertEquals(19, ((int) (((OriginalWLClause) (o_testExample3CADECedric__67)).hashCode())));
        clause.clear();
        IVecInt o_testExample3CADECedric__69 = clause.push((-5)).push((-6));
        Assert.assertEquals("-5,-6", ((VecInt) (o_testExample3CADECedric__69)).toString());
        Assert.assertEquals(-5, ((int) (((VecInt) (o_testExample3CADECedric__69)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testExample3CADECedric__69)).isEmpty());
        this.checkListener.addOriginalClause(clause);
        IConstr o_testExample3CADECedric__74 = this.solver.addClause(clause);
        int[] array_1065846110 = new int[]{11,13,38};
        	int[] array_1056329933 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__74).getLits();
        	for(int ii = 0; ii <array_1065846110.length; ii++) {
        		org.junit.Assert.assertEquals(array_1065846110[ii], array_1056329933[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testExample3CADECedric__74)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalWLClause) (o_testExample3CADECedric__74)).isSatisfied());
        Assert.assertEquals("-5[?] -6[?] 19[?] ", ((OriginalWLClause) (o_testExample3CADECedric__74)).toString());
        Assert.assertEquals(20, ((int) (((OriginalWLClause) (o_testExample3CADECedric__74)).hashCode())));
        clause.clear();
        IVecInt o_testExample3CADECedric__76 = clause.push(1).push((-3)).push(4);
        Assert.assertEquals("1,-3,4", ((VecInt) (o_testExample3CADECedric__76)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_testExample3CADECedric__76)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testExample3CADECedric__76)).isEmpty());
        this.checkListener.addOriginalClause(clause);
        IConstr o_testExample3CADECedric__81 = this.solver.addClause(clause);
        int[] array_1978506840 = new int[]{2,7,8,40};
        	int[] array_964785252 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__81).getLits();
        	for(int ii = 0; ii <array_1978506840.length; ii++) {
        		org.junit.Assert.assertEquals(array_1978506840[ii], array_964785252[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testExample3CADECedric__81)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalWLClause) (o_testExample3CADECedric__81)).isSatisfied());
        Assert.assertEquals("1[?] -3[?] 4[?] 20[?] ", ((OriginalWLClause) (o_testExample3CADECedric__81)).toString());
        Assert.assertEquals(14, ((int) (((OriginalWLClause) (o_testExample3CADECedric__81)).hashCode())));
        clause.clear();
        List<IVecInt> muses = allMUSes.computeAllMUSes(checkListener);
        int o_testExample3CADECedric__85 = muses.size();
        Assert.assertEquals(9, ((int) (o_testExample3CADECedric__85)));
        Assert.assertEquals(6, ((int) (o_testExample3CADECedric__1)));
        Assert.assertEquals("", ((VecInt) (o_testExample3CADECedric__4)).toString());
        Assert.assertTrue(((VecInt) (o_testExample3CADECedric__4)).isEmpty());
        int[] array_319719329 = new int[]{2,14};
        	int[] array_107382710 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testExample3CADECedric__6).getLits();
        	for(int ii = 0; ii <array_319719329.length; ii++) {
        		org.junit.Assert.assertEquals(array_319719329[ii], array_107382710[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testExample3CADECedric__6)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalBinaryClause) (o_testExample3CADECedric__6)).isSatisfied());
        Assert.assertEquals("1[?] 7[?]", ((OriginalBinaryClause) (o_testExample3CADECedric__6)).toString());
        Assert.assertEquals(8, ((int) (((OriginalBinaryClause) (o_testExample3CADECedric__6)).hashCode())));
        Assert.assertEquals("", ((VecInt) (o_testExample3CADECedric__8)).toString());
        Assert.assertTrue(((VecInt) (o_testExample3CADECedric__8)).isEmpty());
        int[] array_1401706523 = new int[]{4,16,8};
        	int[] array_582141270 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__11).getLits();
        	for(int ii = 0; ii <array_1401706523.length; ii++) {
        		org.junit.Assert.assertEquals(array_1401706523[ii], array_582141270[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testExample3CADECedric__11)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalWLClause) (o_testExample3CADECedric__11)).isSatisfied());
        Assert.assertEquals("2[?] 8[?] 4[?] ", ((OriginalWLClause) (o_testExample3CADECedric__11)).toString());
        Assert.assertEquals(9, ((int) (((OriginalWLClause) (o_testExample3CADECedric__11)).hashCode())));
        Assert.assertEquals("", ((VecInt) (o_testExample3CADECedric__13)).toString());
        Assert.assertTrue(((VecInt) (o_testExample3CADECedric__13)).isEmpty());
        int[] array_814486765 = new int[]{18,5,11};
        	int[] array_1681966735 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__18).getLits();
        	for(int ii = 0; ii <array_814486765.length; ii++) {
        		org.junit.Assert.assertEquals(array_814486765[ii], array_1681966735[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testExample3CADECedric__18)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalWLClause) (o_testExample3CADECedric__18)).isSatisfied());
        Assert.assertEquals("9[?] -2[?] -5[?] ", ((OriginalWLClause) (o_testExample3CADECedric__18)).toString());
        Assert.assertEquals(11, ((int) (((OriginalWLClause) (o_testExample3CADECedric__18)).hashCode())));
        Assert.assertEquals("", ((VecInt) (o_testExample3CADECedric__20)).toString());
        Assert.assertTrue(((VecInt) (o_testExample3CADECedric__20)).isEmpty());
        int[] array_1868576422 = new int[]{2,8,20};
        	int[] array_425747121 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__23).getLits();
        	for(int ii = 0; ii <array_1868576422.length; ii++) {
        		org.junit.Assert.assertEquals(array_1868576422[ii], array_425747121[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testExample3CADECedric__23)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalWLClause) (o_testExample3CADECedric__23)).isSatisfied());
        Assert.assertEquals("1[?] 4[?] 10[?] ", ((OriginalWLClause) (o_testExample3CADECedric__23)).toString());
        Assert.assertEquals(10, ((int) (((OriginalWLClause) (o_testExample3CADECedric__23)).hashCode())));
        Assert.assertEquals("", ((VecInt) (o_testExample3CADECedric__25)).toString());
        Assert.assertTrue(((VecInt) (o_testExample3CADECedric__25)).isEmpty());
        int[] array_1234484683 = new int[]{4,7,22};
        	int[] array_1294758391 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__29).getLits();
        	for(int ii = 0; ii <array_1234484683.length; ii++) {
        		org.junit.Assert.assertEquals(array_1234484683[ii], array_1294758391[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testExample3CADECedric__29)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalWLClause) (o_testExample3CADECedric__29)).isSatisfied());
        Assert.assertEquals("2[?] -3[?] 11[?] ", ((OriginalWLClause) (o_testExample3CADECedric__29)).toString());
        Assert.assertEquals(11, ((int) (((OriginalWLClause) (o_testExample3CADECedric__29)).hashCode())));
        Assert.assertEquals("", ((VecInt) (o_testExample3CADECedric__31)).toString());
        Assert.assertTrue(((VecInt) (o_testExample3CADECedric__31)).isEmpty());
        int[] array_357425431 = new int[]{12,24};
        	int[] array_1570395053 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testExample3CADECedric__33).getLits();
        	for(int ii = 0; ii <array_357425431.length; ii++) {
        		org.junit.Assert.assertEquals(array_357425431[ii], array_1570395053[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testExample3CADECedric__33)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalBinaryClause) (o_testExample3CADECedric__33)).isSatisfied());
        Assert.assertEquals("6[?] 12[?]", ((OriginalBinaryClause) (o_testExample3CADECedric__33)).toString());
        Assert.assertEquals(18, ((int) (((OriginalBinaryClause) (o_testExample3CADECedric__33)).hashCode())));
        Assert.assertEquals("", ((VecInt) (o_testExample3CADECedric__35)).toString());
        Assert.assertTrue(((VecInt) (o_testExample3CADECedric__35)).isEmpty());
        int[] array_651844234 = new int[]{9,6,26};
        	int[] array_587453235 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__39).getLits();
        	for(int ii = 0; ii <array_651844234.length; ii++) {
        		org.junit.Assert.assertEquals(array_651844234[ii], array_587453235[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testExample3CADECedric__39)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalWLClause) (o_testExample3CADECedric__39)).isSatisfied());
        Assert.assertEquals("-4[?] 3[?] 13[?] ", ((OriginalWLClause) (o_testExample3CADECedric__39)).toString());
        Assert.assertEquals(13, ((int) (((OriginalWLClause) (o_testExample3CADECedric__39)).hashCode())));
        Assert.assertEquals("", ((VecInt) (o_testExample3CADECedric__41)).toString());
        Assert.assertTrue(((VecInt) (o_testExample3CADECedric__41)).isEmpty());
        int[] array_531804122 = new int[]{3,28};
        	int[] array_1552565251 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testExample3CADECedric__44).getLits();
        	for(int ii = 0; ii <array_531804122.length; ii++) {
        		org.junit.Assert.assertEquals(array_531804122[ii], array_1552565251[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testExample3CADECedric__44)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalBinaryClause) (o_testExample3CADECedric__44)).isSatisfied());
        Assert.assertEquals("-1[?] 14[?]", ((OriginalBinaryClause) (o_testExample3CADECedric__44)).toString());
        Assert.assertEquals(15, ((int) (((OriginalBinaryClause) (o_testExample3CADECedric__44)).hashCode())));
        Assert.assertEquals("", ((VecInt) (o_testExample3CADECedric__46)).toString());
        Assert.assertTrue(((VecInt) (o_testExample3CADECedric__46)).isEmpty());
        int[] array_2080617520 = new int[]{7,30,5};
        	int[] array_1383607688 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__51).getLits();
        	for(int ii = 0; ii <array_2080617520.length; ii++) {
        		org.junit.Assert.assertEquals(array_2080617520[ii], array_1383607688[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testExample3CADECedric__51)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalWLClause) (o_testExample3CADECedric__51)).isSatisfied());
        Assert.assertEquals("-3[?] 15[?] -2[?] ", ((OriginalWLClause) (o_testExample3CADECedric__51)).toString());
        Assert.assertEquals(14, ((int) (((OriginalWLClause) (o_testExample3CADECedric__51)).hashCode())));
        Assert.assertEquals("", ((VecInt) (o_testExample3CADECedric__53)).toString());
        Assert.assertTrue(((VecInt) (o_testExample3CADECedric__53)).isEmpty());
        int[] array_664384372 = new int[]{12,4,32,8};
        	int[] array_690684 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__57).getLits();
        	for(int ii = 0; ii <array_664384372.length; ii++) {
        		org.junit.Assert.assertEquals(array_664384372[ii], array_690684[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testExample3CADECedric__57)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalWLClause) (o_testExample3CADECedric__57)).isSatisfied());
        Assert.assertEquals("6[?] 2[?] 16[?] 4[?] ", ((OriginalWLClause) (o_testExample3CADECedric__57)).toString());
        Assert.assertEquals(14, ((int) (((OriginalWLClause) (o_testExample3CADECedric__57)).hashCode())));
        Assert.assertEquals("", ((VecInt) (o_testExample3CADECedric__59)).toString());
        Assert.assertTrue(((VecInt) (o_testExample3CADECedric__59)).isEmpty());
        int[] array_297311369 = new int[]{10,34};
        	int[] array_266432151 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testExample3CADECedric__61).getLits();
        	for(int ii = 0; ii <array_297311369.length; ii++) {
        		org.junit.Assert.assertEquals(array_297311369[ii], array_266432151[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testExample3CADECedric__61)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalBinaryClause) (o_testExample3CADECedric__61)).isSatisfied());
        Assert.assertEquals("5[?] 17[?]", ((OriginalBinaryClause) (o_testExample3CADECedric__61)).toString());
        Assert.assertEquals(22, ((int) (((OriginalBinaryClause) (o_testExample3CADECedric__61)).hashCode())));
        Assert.assertEquals("", ((VecInt) (o_testExample3CADECedric__63)).toString());
        Assert.assertTrue(((VecInt) (o_testExample3CADECedric__63)).isEmpty());
        int[] array_2095188425 = new int[]{36,8,13};
        	int[] array_813286795 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__67).getLits();
        	for(int ii = 0; ii <array_2095188425.length; ii++) {
        		org.junit.Assert.assertEquals(array_2095188425[ii], array_813286795[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testExample3CADECedric__67)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalWLClause) (o_testExample3CADECedric__67)).isSatisfied());
        Assert.assertEquals("18[?] 4[?] -6[?] ", ((OriginalWLClause) (o_testExample3CADECedric__67)).toString());
        Assert.assertEquals(19, ((int) (((OriginalWLClause) (o_testExample3CADECedric__67)).hashCode())));
        Assert.assertEquals("", ((VecInt) (o_testExample3CADECedric__69)).toString());
        Assert.assertTrue(((VecInt) (o_testExample3CADECedric__69)).isEmpty());
        int[] array_2138278411 = new int[]{38,13,11};
        	int[] array_25340382 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__74).getLits();
        	for(int ii = 0; ii <array_2138278411.length; ii++) {
        		org.junit.Assert.assertEquals(array_2138278411[ii], array_25340382[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testExample3CADECedric__74)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalWLClause) (o_testExample3CADECedric__74)).isSatisfied());
        Assert.assertEquals("19[?] -6[?] -5[?] ", ((OriginalWLClause) (o_testExample3CADECedric__74)).toString());
        Assert.assertEquals(20, ((int) (((OriginalWLClause) (o_testExample3CADECedric__74)).hashCode())));
        Assert.assertEquals("", ((VecInt) (o_testExample3CADECedric__76)).toString());
        Assert.assertTrue(((VecInt) (o_testExample3CADECedric__76)).isEmpty());
        int[] array_157688678 = new int[]{2,7,8,40};
        	int[] array_1207405105 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__81).getLits();
        	for(int ii = 0; ii <array_157688678.length; ii++) {
        		org.junit.Assert.assertEquals(array_157688678[ii], array_1207405105[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testExample3CADECedric__81)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalWLClause) (o_testExample3CADECedric__81)).isSatisfied());
        Assert.assertEquals("1[?] -3[?] 4[?] 20[?] ", ((OriginalWLClause) (o_testExample3CADECedric__81)).toString());
        Assert.assertEquals(14, ((int) (((OriginalWLClause) (o_testExample3CADECedric__81)).hashCode())));
    }
}

