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


public class TestAllMUSes {
    private AllMUSes allMUSes;

    private ISolver solver;

    @Before
    public void setUp() throws Exception {
        this.allMUSes = new AllMUSes(SolverFactory.instance());
        this.solver = allMUSes.getSolverInstance();
    }

    @Test(timeout = 10000)
    public void testSimpleCase() throws Exception {
        IVecInt c1 = new VecInt();
        IVecInt c2 = new VecInt();
        IVecInt c3 = new VecInt();
        IVecInt c4 = new VecInt();
        IVecInt c5 = new VecInt();
        IVecInt o_testSimpleCase__11 = c1.push(1);
        Assert.assertEquals("1", ((VecInt) (o_testSimpleCase__11)).toString());
        Assert.assertEquals(1, ((int) (((VecInt) (o_testSimpleCase__11)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testSimpleCase__11)).isEmpty());
        IVecInt o_testSimpleCase__12 = c2.push(2);
        Assert.assertEquals("2", ((VecInt) (o_testSimpleCase__12)).toString());
        Assert.assertEquals(2, ((int) (((VecInt) (o_testSimpleCase__12)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testSimpleCase__12)).isEmpty());
        IVecInt o_testSimpleCase__13 = c3.push((-1)).push((-2));
        Assert.assertEquals("-1,-2", ((VecInt) (o_testSimpleCase__13)).toString());
        Assert.assertEquals(-1, ((int) (((VecInt) (o_testSimpleCase__13)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testSimpleCase__13)).isEmpty());
        IVecInt o_testSimpleCase__17 = c4.push(3);
        Assert.assertEquals("3", ((VecInt) (o_testSimpleCase__17)).toString());
        Assert.assertEquals(3, ((int) (((VecInt) (o_testSimpleCase__17)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testSimpleCase__17)).isEmpty());
        IVecInt o_testSimpleCase__18 = c5.push((-3));
        Assert.assertEquals("-3", ((VecInt) (o_testSimpleCase__18)).toString());
        Assert.assertEquals(-3, ((int) (((VecInt) (o_testSimpleCase__18)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testSimpleCase__18)).isEmpty());
        int o_testSimpleCase__20 = this.solver.newVar(3);
        Assert.assertEquals(3, ((int) (o_testSimpleCase__20)));
        try {
            IConstr o_testSimpleCase__23 = this.solver.addClause(c1);
            int[] array_366681637 = new int[]{2,8};
            	int[] array_478948525 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testSimpleCase__23).getLits();
            	for(int ii = 0; ii <array_366681637.length; ii++) {
            		org.junit.Assert.assertEquals(array_366681637[ii], array_478948525[ii]);
            	};
            Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testSimpleCase__23)).getActivity())), 0.1);
            Assert.assertFalse(((OriginalBinaryClause) (o_testSimpleCase__23)).isSatisfied());
            Assert.assertEquals("1[?] 4[?]", ((OriginalBinaryClause) (o_testSimpleCase__23)).toString());
            Assert.assertEquals(5, ((int) (((OriginalBinaryClause) (o_testSimpleCase__23)).hashCode())));
            IConstr o_testSimpleCase__24 = this.solver.addClause(c2);
            int[] array_1692447621 = new int[]{4,10};
            	int[] array_806836836 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testSimpleCase__24).getLits();
            	for(int ii = 0; ii <array_1692447621.length; ii++) {
            		org.junit.Assert.assertEquals(array_1692447621[ii], array_806836836[ii]);
            	};
            Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testSimpleCase__24)).getActivity())), 0.1);
            Assert.assertFalse(((OriginalBinaryClause) (o_testSimpleCase__24)).isSatisfied());
            Assert.assertEquals("2[?] 5[?]", ((OriginalBinaryClause) (o_testSimpleCase__24)).toString());
            Assert.assertEquals(7, ((int) (((OriginalBinaryClause) (o_testSimpleCase__24)).hashCode())));
            IConstr o_testSimpleCase__25 = this.solver.addClause(c3);
            int[] array_972984347 = new int[]{3,5,12};
            	int[] array_800627653 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testSimpleCase__25).getLits();
            	for(int ii = 0; ii <array_972984347.length; ii++) {
            		org.junit.Assert.assertEquals(array_972984347[ii], array_800627653[ii]);
            	};
            Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testSimpleCase__25)).getActivity())), 0.1);
            Assert.assertFalse(((OriginalWLClause) (o_testSimpleCase__25)).isSatisfied());
            Assert.assertEquals("-1[?] -2[?] 6[?] ", ((OriginalWLClause) (o_testSimpleCase__25)).toString());
            Assert.assertEquals(6, ((int) (((OriginalWLClause) (o_testSimpleCase__25)).hashCode())));
            IConstr o_testSimpleCase__26 = this.solver.addClause(c4);
            int[] array_589804332 = new int[]{6,14};
            	int[] array_1741432753 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testSimpleCase__26).getLits();
            	for(int ii = 0; ii <array_589804332.length; ii++) {
            		org.junit.Assert.assertEquals(array_589804332[ii], array_1741432753[ii]);
            	};
            Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testSimpleCase__26)).getActivity())), 0.1);
            Assert.assertFalse(((OriginalBinaryClause) (o_testSimpleCase__26)).isSatisfied());
            Assert.assertEquals("3[?] 7[?]", ((OriginalBinaryClause) (o_testSimpleCase__26)).toString());
            Assert.assertEquals(10, ((int) (((OriginalBinaryClause) (o_testSimpleCase__26)).hashCode())));
            IConstr o_testSimpleCase__27 = this.solver.addClause(c5);
            int[] array_859388150 = new int[]{7,16};
            	int[] array_252034302 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testSimpleCase__27).getLits();
            	for(int ii = 0; ii <array_859388150.length; ii++) {
            		org.junit.Assert.assertEquals(array_859388150[ii], array_252034302[ii]);
            	};
            Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testSimpleCase__27)).getActivity())), 0.1);
            Assert.assertFalse(((OriginalBinaryClause) (o_testSimpleCase__27)).isSatisfied());
            Assert.assertEquals("-3[?] 8[?]", ((OriginalBinaryClause) (o_testSimpleCase__27)).toString());
            Assert.assertEquals(11, ((int) (((OriginalBinaryClause) (o_testSimpleCase__27)).hashCode())));
            List<IVecInt> muses = this.allMUSes.computeAllMUSes();
            int o_testSimpleCase__30 = muses.size();
            Assert.assertEquals(2, ((int) (o_testSimpleCase__30)));
            int[] array_1382825899 = new int[]{2,8};
            	int[] array_1192620589 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testSimpleCase__23).getLits();
            	for(int ii = 0; ii <array_1382825899.length; ii++) {
            		org.junit.Assert.assertEquals(array_1382825899[ii], array_1192620589[ii]);
            	};
            Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testSimpleCase__23)).getActivity())), 0.1);
            Assert.assertFalse(((OriginalBinaryClause) (o_testSimpleCase__23)).isSatisfied());
            Assert.assertEquals("1[?] 4[?]", ((OriginalBinaryClause) (o_testSimpleCase__23)).toString());
            Assert.assertEquals(5, ((int) (((OriginalBinaryClause) (o_testSimpleCase__23)).hashCode())));
            int[] array_1407587105 = new int[]{4,10};
            	int[] array_1590116196 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testSimpleCase__24).getLits();
            	for(int ii = 0; ii <array_1407587105.length; ii++) {
            		org.junit.Assert.assertEquals(array_1407587105[ii], array_1590116196[ii]);
            	};
            Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testSimpleCase__24)).getActivity())), 0.1);
            Assert.assertFalse(((OriginalBinaryClause) (o_testSimpleCase__24)).isSatisfied());
            Assert.assertEquals("2[?] 5[?]", ((OriginalBinaryClause) (o_testSimpleCase__24)).toString());
            Assert.assertEquals(7, ((int) (((OriginalBinaryClause) (o_testSimpleCase__24)).hashCode())));
            int[] array_628948037 = new int[]{12,5,3};
            	int[] array_1405051721 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testSimpleCase__25).getLits();
            	for(int ii = 0; ii <array_628948037.length; ii++) {
            		org.junit.Assert.assertEquals(array_628948037[ii], array_1405051721[ii]);
            	};
            Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testSimpleCase__25)).getActivity())), 0.1);
            Assert.assertFalse(((OriginalWLClause) (o_testSimpleCase__25)).isSatisfied());
            Assert.assertEquals("6[?] -2[?] -1[?] ", ((OriginalWLClause) (o_testSimpleCase__25)).toString());
            Assert.assertEquals(6, ((int) (((OriginalWLClause) (o_testSimpleCase__25)).hashCode())));
            int[] array_1602856171 = new int[]{6,14};
            	int[] array_1351425984 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testSimpleCase__26).getLits();
            	for(int ii = 0; ii <array_1602856171.length; ii++) {
            		org.junit.Assert.assertEquals(array_1602856171[ii], array_1351425984[ii]);
            	};
            Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testSimpleCase__26)).getActivity())), 0.1);
            Assert.assertFalse(((OriginalBinaryClause) (o_testSimpleCase__26)).isSatisfied());
            Assert.assertEquals("3[?] 7[?]", ((OriginalBinaryClause) (o_testSimpleCase__26)).toString());
            Assert.assertEquals(10, ((int) (((OriginalBinaryClause) (o_testSimpleCase__26)).hashCode())));
            int[] array_60966180 = new int[]{7,16};
            	int[] array_1652527992 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testSimpleCase__27).getLits();
            	for(int ii = 0; ii <array_60966180.length; ii++) {
            		org.junit.Assert.assertEquals(array_60966180[ii], array_1652527992[ii]);
            	};
            Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testSimpleCase__27)).getActivity())), 0.1);
            Assert.assertFalse(((OriginalBinaryClause) (o_testSimpleCase__27)).isSatisfied());
            Assert.assertEquals("-3[?] 8[?]", ((OriginalBinaryClause) (o_testSimpleCase__27)).toString());
            Assert.assertEquals(11, ((int) (((OriginalBinaryClause) (o_testSimpleCase__27)).hashCode())));
        } catch (ContradictionException e) {
            e.printStackTrace();
        }
        Assert.assertEquals("1,4", ((VecInt) (o_testSimpleCase__11)).toString());
        Assert.assertEquals(2, ((int) (((VecInt) (o_testSimpleCase__11)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testSimpleCase__11)).isEmpty());
        Assert.assertEquals("2,5", ((VecInt) (o_testSimpleCase__12)).toString());
        Assert.assertEquals(3, ((int) (((VecInt) (o_testSimpleCase__12)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testSimpleCase__12)).isEmpty());
        Assert.assertEquals("-1,-2,6", ((VecInt) (o_testSimpleCase__13)).toString());
        Assert.assertEquals(1, ((int) (((VecInt) (o_testSimpleCase__13)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testSimpleCase__13)).isEmpty());
        Assert.assertEquals("3,7", ((VecInt) (o_testSimpleCase__17)).toString());
        Assert.assertEquals(5, ((int) (((VecInt) (o_testSimpleCase__17)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testSimpleCase__17)).isEmpty());
        Assert.assertEquals("-3,8", ((VecInt) (o_testSimpleCase__18)).toString());
        Assert.assertEquals(2, ((int) (((VecInt) (o_testSimpleCase__18)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testSimpleCase__18)).isEmpty());
        Assert.assertEquals(3, ((int) (o_testSimpleCase__20)));
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
            IConstr o_testVerySimpleCase__11 = this.solver.addClause(c1);
            int[] array_121009145 = new int[]{2,4};
            	int[] array_826203082 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testVerySimpleCase__11).getLits();
            	for(int ii = 0; ii <array_121009145.length; ii++) {
            		org.junit.Assert.assertEquals(array_121009145[ii], array_826203082[ii]);
            	};
            Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testVerySimpleCase__11)).getActivity())), 0.1);
            Assert.assertFalse(((OriginalBinaryClause) (o_testVerySimpleCase__11)).isSatisfied());
            Assert.assertEquals("1[?] 2[?]", ((OriginalBinaryClause) (o_testVerySimpleCase__11)).toString());
            Assert.assertEquals(3, ((int) (((OriginalBinaryClause) (o_testVerySimpleCase__11)).hashCode())));
            IConstr o_testVerySimpleCase__12 = this.solver.addClause(c2);
            int[] array_1835463440 = new int[]{3,6};
            	int[] array_1678932049 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testVerySimpleCase__12).getLits();
            	for(int ii = 0; ii <array_1835463440.length; ii++) {
            		org.junit.Assert.assertEquals(array_1835463440[ii], array_1678932049[ii]);
            	};
            Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testVerySimpleCase__12)).getActivity())), 0.1);
            Assert.assertFalse(((OriginalBinaryClause) (o_testVerySimpleCase__12)).isSatisfied());
            Assert.assertEquals("-1[?] 3[?]", ((OriginalBinaryClause) (o_testVerySimpleCase__12)).toString());
            Assert.assertEquals(4, ((int) (((OriginalBinaryClause) (o_testVerySimpleCase__12)).hashCode())));
            List<IVecInt> muses = this.allMUSes.computeAllMUSes();
            int o_testVerySimpleCase__15 = muses.size();
            Assert.assertEquals(1, ((int) (o_testVerySimpleCase__15)));
            int[] array_650330338 = new int[]{2,4};
            	int[] array_1763091955 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testVerySimpleCase__11).getLits();
            	for(int ii = 0; ii <array_650330338.length; ii++) {
            		org.junit.Assert.assertEquals(array_650330338[ii], array_1763091955[ii]);
            	};
            Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testVerySimpleCase__11)).getActivity())), 0.1);
            Assert.assertFalse(((OriginalBinaryClause) (o_testVerySimpleCase__11)).isSatisfied());
            Assert.assertEquals("1[?] 2[F]", ((OriginalBinaryClause) (o_testVerySimpleCase__11)).toString());
            Assert.assertEquals(3, ((int) (((OriginalBinaryClause) (o_testVerySimpleCase__11)).hashCode())));
            int[] array_314315347 = new int[]{3,6};
            	int[] array_688232918 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testVerySimpleCase__12).getLits();
            	for(int ii = 0; ii <array_314315347.length; ii++) {
            		org.junit.Assert.assertEquals(array_314315347[ii], array_688232918[ii]);
            	};
            Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testVerySimpleCase__12)).getActivity())), 0.1);
            Assert.assertFalse(((OriginalBinaryClause) (o_testVerySimpleCase__12)).isSatisfied());
            Assert.assertEquals("-1[?] 3[F]", ((OriginalBinaryClause) (o_testVerySimpleCase__12)).toString());
            Assert.assertEquals(4, ((int) (((OriginalBinaryClause) (o_testVerySimpleCase__12)).hashCode())));
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
    public void testGlobalInconsistency() throws Exception, ContradictionException, TimeoutException {
        int o_testGlobalInconsistency__1 = this.solver.newVar(2);
        Assert.assertEquals(2, ((int) (o_testGlobalInconsistency__1)));
        IVecInt clause = new VecInt();
        IVecInt o_testGlobalInconsistency__4 = clause.push(1).push(2);
        Assert.assertEquals("1,2", ((VecInt) (o_testGlobalInconsistency__4)).toString());
        Assert.assertEquals(1, ((int) (((VecInt) (o_testGlobalInconsistency__4)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testGlobalInconsistency__4)).isEmpty());
        IConstr o_testGlobalInconsistency__6 = this.solver.addClause(clause);
        int[] array_804819380 = new int[]{2,4,6};
        	int[] array_975056820 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testGlobalInconsistency__6).getLits();
        	for(int ii = 0; ii <array_804819380.length; ii++) {
        		org.junit.Assert.assertEquals(array_804819380[ii], array_975056820[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testGlobalInconsistency__6)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalWLClause) (o_testGlobalInconsistency__6)).isSatisfied());
        Assert.assertEquals("1[?] 2[?] 3[?] ", ((OriginalWLClause) (o_testGlobalInconsistency__6)).toString());
        Assert.assertEquals(4, ((int) (((OriginalWLClause) (o_testGlobalInconsistency__6)).hashCode())));
        clause.clear();
        IVecInt o_testGlobalInconsistency__8 = clause.push(1).push((-2));
        Assert.assertEquals("1,-2", ((VecInt) (o_testGlobalInconsistency__8)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_testGlobalInconsistency__8)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testGlobalInconsistency__8)).isEmpty());
        IConstr o_testGlobalInconsistency__11 = this.solver.addClause(clause);
        int[] array_580653162 = new int[]{2,5,8};
        	int[] array_894193159 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testGlobalInconsistency__11).getLits();
        	for(int ii = 0; ii <array_580653162.length; ii++) {
        		org.junit.Assert.assertEquals(array_580653162[ii], array_894193159[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testGlobalInconsistency__11)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalWLClause) (o_testGlobalInconsistency__11)).isSatisfied());
        Assert.assertEquals("1[?] -2[?] 4[?] ", ((OriginalWLClause) (o_testGlobalInconsistency__11)).toString());
        Assert.assertEquals(5, ((int) (((OriginalWLClause) (o_testGlobalInconsistency__11)).hashCode())));
        clause.clear();
        IVecInt o_testGlobalInconsistency__13 = clause.push((-1)).push(2);
        Assert.assertEquals("-1,2", ((VecInt) (o_testGlobalInconsistency__13)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_testGlobalInconsistency__13)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testGlobalInconsistency__13)).isEmpty());
        IConstr o_testGlobalInconsistency__16 = this.solver.addClause(clause);
        int[] array_1972314964 = new int[]{3,4,10};
        	int[] array_1309494294 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testGlobalInconsistency__16).getLits();
        	for(int ii = 0; ii <array_1972314964.length; ii++) {
        		org.junit.Assert.assertEquals(array_1972314964[ii], array_1309494294[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testGlobalInconsistency__16)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalWLClause) (o_testGlobalInconsistency__16)).isSatisfied());
        Assert.assertEquals("-1[?] 2[?] 5[?] ", ((OriginalWLClause) (o_testGlobalInconsistency__16)).toString());
        Assert.assertEquals(5, ((int) (((OriginalWLClause) (o_testGlobalInconsistency__16)).hashCode())));
        clause.clear();
        IVecInt o_testGlobalInconsistency__18 = clause.push((-1)).push((-2));
        Assert.assertEquals("-1,-2", ((VecInt) (o_testGlobalInconsistency__18)).toString());
        Assert.assertEquals(-1, ((int) (((VecInt) (o_testGlobalInconsistency__18)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testGlobalInconsistency__18)).isEmpty());
        IConstr o_testGlobalInconsistency__22 = this.solver.addClause(clause);
        int[] array_2041369093 = new int[]{3,5,12};
        	int[] array_727694771 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testGlobalInconsistency__22).getLits();
        	for(int ii = 0; ii <array_2041369093.length; ii++) {
        		org.junit.Assert.assertEquals(array_2041369093[ii], array_727694771[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testGlobalInconsistency__22)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalWLClause) (o_testGlobalInconsistency__22)).isSatisfied());
        Assert.assertEquals("-1[?] -2[?] 6[?] ", ((OriginalWLClause) (o_testGlobalInconsistency__22)).toString());
        Assert.assertEquals(6, ((int) (((OriginalWLClause) (o_testGlobalInconsistency__22)).hashCode())));
        clause.clear();
        List<IVecInt> muses = allMUSes.computeAllMUSes();
        int o_testGlobalInconsistency__26 = muses.size();
        Assert.assertEquals(1, ((int) (o_testGlobalInconsistency__26)));
        Assert.assertEquals(2, ((int) (o_testGlobalInconsistency__1)));
        Assert.assertEquals("", ((VecInt) (o_testGlobalInconsistency__4)).toString());
        Assert.assertTrue(((VecInt) (o_testGlobalInconsistency__4)).isEmpty());
        int[] array_1014778677 = new int[]{2,4,6};
        	int[] array_1807543333 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testGlobalInconsistency__6).getLits();
        	for(int ii = 0; ii <array_1014778677.length; ii++) {
        		org.junit.Assert.assertEquals(array_1014778677[ii], array_1807543333[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testGlobalInconsistency__6)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalWLClause) (o_testGlobalInconsistency__6)).isSatisfied());
        Assert.assertEquals("1[?] 2[?] 3[F] ", ((OriginalWLClause) (o_testGlobalInconsistency__6)).toString());
        Assert.assertEquals(4, ((int) (((OriginalWLClause) (o_testGlobalInconsistency__6)).hashCode())));
        Assert.assertEquals("", ((VecInt) (o_testGlobalInconsistency__8)).toString());
        Assert.assertTrue(((VecInt) (o_testGlobalInconsistency__8)).isEmpty());
        int[] array_1951477550 = new int[]{2,5,8};
        	int[] array_795769093 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testGlobalInconsistency__11).getLits();
        	for(int ii = 0; ii <array_1951477550.length; ii++) {
        		org.junit.Assert.assertEquals(array_1951477550[ii], array_795769093[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testGlobalInconsistency__11)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalWLClause) (o_testGlobalInconsistency__11)).isSatisfied());
        Assert.assertEquals("1[?] -2[?] 4[F] ", ((OriginalWLClause) (o_testGlobalInconsistency__11)).toString());
        Assert.assertEquals(5, ((int) (((OriginalWLClause) (o_testGlobalInconsistency__11)).hashCode())));
        Assert.assertEquals("", ((VecInt) (o_testGlobalInconsistency__13)).toString());
        Assert.assertTrue(((VecInt) (o_testGlobalInconsistency__13)).isEmpty());
        int[] array_271746577 = new int[]{4,10,3};
        	int[] array_1525125080 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testGlobalInconsistency__16).getLits();
        	for(int ii = 0; ii <array_271746577.length; ii++) {
        		org.junit.Assert.assertEquals(array_271746577[ii], array_1525125080[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testGlobalInconsistency__16)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalWLClause) (o_testGlobalInconsistency__16)).isSatisfied());
        Assert.assertEquals("2[?] 5[F] -1[?] ", ((OriginalWLClause) (o_testGlobalInconsistency__16)).toString());
        Assert.assertEquals(5, ((int) (((OriginalWLClause) (o_testGlobalInconsistency__16)).hashCode())));
        Assert.assertEquals("", ((VecInt) (o_testGlobalInconsistency__18)).toString());
        Assert.assertTrue(((VecInt) (o_testGlobalInconsistency__18)).isEmpty());
        int[] array_573926002 = new int[]{5,12,3};
        	int[] array_21125798 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testGlobalInconsistency__22).getLits();
        	for(int ii = 0; ii <array_573926002.length; ii++) {
        		org.junit.Assert.assertEquals(array_573926002[ii], array_21125798[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testGlobalInconsistency__22)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalWLClause) (o_testGlobalInconsistency__22)).isSatisfied());
        Assert.assertEquals("-2[?] 6[F] -1[?] ", ((OriginalWLClause) (o_testGlobalInconsistency__22)).toString());
        Assert.assertEquals(6, ((int) (((OriginalWLClause) (o_testGlobalInconsistency__22)).hashCode())));
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
        IConstr o_testEclipseTestCase2__7 = this.solver.addClause(clause);
        int[] array_471491861 = new int[]{3,4,10};
        	int[] array_684196805 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testEclipseTestCase2__7).getLits();
        	for(int ii = 0; ii <array_471491861.length; ii++) {
        		org.junit.Assert.assertEquals(array_471491861[ii], array_684196805[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testEclipseTestCase2__7)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalWLClause) (o_testEclipseTestCase2__7)).isSatisfied());
        Assert.assertEquals("-1[?] 2[?] 5[?] ", ((OriginalWLClause) (o_testEclipseTestCase2__7)).toString());
        Assert.assertEquals(5, ((int) (((OriginalWLClause) (o_testEclipseTestCase2__7)).hashCode())));
        clause.clear();
        IVecInt o_testEclipseTestCase2__9 = clause.push((-1)).push(3);
        Assert.assertEquals("-1,3", ((VecInt) (o_testEclipseTestCase2__9)).toString());
        Assert.assertEquals(1, ((int) (((VecInt) (o_testEclipseTestCase2__9)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testEclipseTestCase2__9)).isEmpty());
        IConstr o_testEclipseTestCase2__12 = this.solver.addClause(clause);
        int[] array_1135003405 = new int[]{3,6,12};
        	int[] array_169851362 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testEclipseTestCase2__12).getLits();
        	for(int ii = 0; ii <array_1135003405.length; ii++) {
        		org.junit.Assert.assertEquals(array_1135003405[ii], array_169851362[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testEclipseTestCase2__12)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalWLClause) (o_testEclipseTestCase2__12)).isSatisfied());
        Assert.assertEquals("-1[?] 3[?] 6[?] ", ((OriginalWLClause) (o_testEclipseTestCase2__12)).toString());
        Assert.assertEquals(7, ((int) (((OriginalWLClause) (o_testEclipseTestCase2__12)).hashCode())));
        clause.clear();
        IVecInt o_testEclipseTestCase2__14 = clause.push((-2)).push((-3));
        Assert.assertEquals("-2,-3", ((VecInt) (o_testEclipseTestCase2__14)).toString());
        Assert.assertEquals(-2, ((int) (((VecInt) (o_testEclipseTestCase2__14)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testEclipseTestCase2__14)).isEmpty());
        IConstr o_testEclipseTestCase2__18 = this.solver.addClause(clause);
        int[] array_136339376 = new int[]{5,7,14};
        	int[] array_296864866 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testEclipseTestCase2__18).getLits();
        	for(int ii = 0; ii <array_136339376.length; ii++) {
        		org.junit.Assert.assertEquals(array_136339376[ii], array_296864866[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testEclipseTestCase2__18)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalWLClause) (o_testEclipseTestCase2__18)).isSatisfied());
        Assert.assertEquals("-2[?] -3[?] 7[?] ", ((OriginalWLClause) (o_testEclipseTestCase2__18)).toString());
        Assert.assertEquals(8, ((int) (((OriginalWLClause) (o_testEclipseTestCase2__18)).hashCode())));
        clause.clear();
        IVecInt o_testEclipseTestCase2__20 = clause.push((-4)).push(1);
        Assert.assertEquals("-4,1", ((VecInt) (o_testEclipseTestCase2__20)).toString());
        Assert.assertEquals(-1, ((int) (((VecInt) (o_testEclipseTestCase2__20)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testEclipseTestCase2__20)).isEmpty());
        IConstr o_testEclipseTestCase2__23 = this.solver.addClause(clause);
        int[] array_368360060 = new int[]{2,9,16};
        	int[] array_1512034214 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testEclipseTestCase2__23).getLits();
        	for(int ii = 0; ii <array_368360060.length; ii++) {
        		org.junit.Assert.assertEquals(array_368360060[ii], array_1512034214[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testEclipseTestCase2__23)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalWLClause) (o_testEclipseTestCase2__23)).isSatisfied());
        Assert.assertEquals("1[?] -4[?] 8[?] ", ((OriginalWLClause) (o_testEclipseTestCase2__23)).toString());
        Assert.assertEquals(9, ((int) (((OriginalWLClause) (o_testEclipseTestCase2__23)).hashCode())));
        clause.clear();
        List<IVecInt> muses = allMUSes.computeAllMUSes();
        int o_testEclipseTestCase2__27 = muses.size();
        Assert.assertEquals(0, ((int) (o_testEclipseTestCase2__27)));
        Assert.assertEquals(4, ((int) (o_testEclipseTestCase2__1)));
        Assert.assertEquals("", ((VecInt) (o_testEclipseTestCase2__4)).toString());
        Assert.assertTrue(((VecInt) (o_testEclipseTestCase2__4)).isEmpty());
        int[] array_1173932210 = new int[]{3,4,10};
        	int[] array_1749666106 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testEclipseTestCase2__7).getLits();
        	for(int ii = 0; ii <array_1173932210.length; ii++) {
        		org.junit.Assert.assertEquals(array_1173932210[ii], array_1749666106[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testEclipseTestCase2__7)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalWLClause) (o_testEclipseTestCase2__7)).isSatisfied());
        Assert.assertEquals("-1[?] 2[?] 5[?] ", ((OriginalWLClause) (o_testEclipseTestCase2__7)).toString());
        Assert.assertEquals(5, ((int) (((OriginalWLClause) (o_testEclipseTestCase2__7)).hashCode())));
        Assert.assertEquals("", ((VecInt) (o_testEclipseTestCase2__9)).toString());
        Assert.assertTrue(((VecInt) (o_testEclipseTestCase2__9)).isEmpty());
        int[] array_1150978389 = new int[]{3,6,12};
        	int[] array_1071459684 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testEclipseTestCase2__12).getLits();
        	for(int ii = 0; ii <array_1150978389.length; ii++) {
        		org.junit.Assert.assertEquals(array_1150978389[ii], array_1071459684[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testEclipseTestCase2__12)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalWLClause) (o_testEclipseTestCase2__12)).isSatisfied());
        Assert.assertEquals("-1[?] 3[?] 6[?] ", ((OriginalWLClause) (o_testEclipseTestCase2__12)).toString());
        Assert.assertEquals(7, ((int) (((OriginalWLClause) (o_testEclipseTestCase2__12)).hashCode())));
        Assert.assertEquals("", ((VecInt) (o_testEclipseTestCase2__14)).toString());
        Assert.assertTrue(((VecInt) (o_testEclipseTestCase2__14)).isEmpty());
        int[] array_469502747 = new int[]{5,7,14};
        	int[] array_979578557 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testEclipseTestCase2__18).getLits();
        	for(int ii = 0; ii <array_469502747.length; ii++) {
        		org.junit.Assert.assertEquals(array_469502747[ii], array_979578557[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testEclipseTestCase2__18)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalWLClause) (o_testEclipseTestCase2__18)).isSatisfied());
        Assert.assertEquals("-2[?] -3[?] 7[?] ", ((OriginalWLClause) (o_testEclipseTestCase2__18)).toString());
        Assert.assertEquals(8, ((int) (((OriginalWLClause) (o_testEclipseTestCase2__18)).hashCode())));
        Assert.assertEquals("", ((VecInt) (o_testEclipseTestCase2__20)).toString());
        Assert.assertTrue(((VecInt) (o_testEclipseTestCase2__20)).isEmpty());
        int[] array_1505372927 = new int[]{9,16,2};
        	int[] array_835295846 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testEclipseTestCase2__23).getLits();
        	for(int ii = 0; ii <array_1505372927.length; ii++) {
        		org.junit.Assert.assertEquals(array_1505372927[ii], array_835295846[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testEclipseTestCase2__23)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalWLClause) (o_testEclipseTestCase2__23)).isSatisfied());
        Assert.assertEquals("-4[?] 8[?] 1[?] ", ((OriginalWLClause) (o_testEclipseTestCase2__23)).toString());
        Assert.assertEquals(9, ((int) (((OriginalWLClause) (o_testEclipseTestCase2__23)).hashCode())));
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
        IConstr o_testExample1CADECedric__7 = this.solver.addClause(clause);
        int[] array_374338128 = new int[]{9,10,12};
        	int[] array_493514425 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample1CADECedric__7).getLits();
        	for(int ii = 0; ii <array_374338128.length; ii++) {
        		org.junit.Assert.assertEquals(array_374338128[ii], array_493514425[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testExample1CADECedric__7)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalWLClause) (o_testExample1CADECedric__7)).isSatisfied());
        Assert.assertEquals("-4[?] 5[?] 6[?] ", ((OriginalWLClause) (o_testExample1CADECedric__7)).toString());
        Assert.assertEquals(10, ((int) (((OriginalWLClause) (o_testExample1CADECedric__7)).hashCode())));
        clause.clear();
        IVecInt o_testExample1CADECedric__9 = clause.push(2).push((-3));
        Assert.assertEquals("2,-3", ((VecInt) (o_testExample1CADECedric__9)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_testExample1CADECedric__9)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testExample1CADECedric__9)).isEmpty());
        IConstr o_testExample1CADECedric__12 = this.solver.addClause(clause);
        int[] array_1125692951 = new int[]{4,7,14};
        	int[] array_1152772302 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample1CADECedric__12).getLits();
        	for(int ii = 0; ii <array_1125692951.length; ii++) {
        		org.junit.Assert.assertEquals(array_1125692951[ii], array_1152772302[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testExample1CADECedric__12)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalWLClause) (o_testExample1CADECedric__12)).isSatisfied());
        Assert.assertEquals("2[?] -3[?] 7[?] ", ((OriginalWLClause) (o_testExample1CADECedric__12)).toString());
        Assert.assertEquals(8, ((int) (((OriginalWLClause) (o_testExample1CADECedric__12)).hashCode())));
        clause.clear();
        IVecInt o_testExample1CADECedric__14 = clause.push((-4));
        Assert.assertEquals("-4", ((VecInt) (o_testExample1CADECedric__14)).toString());
        Assert.assertEquals(-4, ((int) (((VecInt) (o_testExample1CADECedric__14)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testExample1CADECedric__14)).isEmpty());
        IConstr o_testExample1CADECedric__16 = this.solver.addClause(clause);
        int[] array_403966787 = new int[]{9,16};
        	int[] array_426445072 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testExample1CADECedric__16).getLits();
        	for(int ii = 0; ii <array_403966787.length; ii++) {
        		org.junit.Assert.assertEquals(array_403966787[ii], array_426445072[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testExample1CADECedric__16)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalBinaryClause) (o_testExample1CADECedric__16)).isSatisfied());
        Assert.assertEquals("-4[?] 8[?]", ((OriginalBinaryClause) (o_testExample1CADECedric__16)).toString());
        Assert.assertEquals(12, ((int) (((OriginalBinaryClause) (o_testExample1CADECedric__16)).hashCode())));
        clause.clear();
        IVecInt o_testExample1CADECedric__18 = clause.push((-1)).push(2);
        Assert.assertEquals("-1,2", ((VecInt) (o_testExample1CADECedric__18)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_testExample1CADECedric__18)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testExample1CADECedric__18)).isEmpty());
        IConstr o_testExample1CADECedric__21 = this.solver.addClause(clause);
        int[] array_388526397 = new int[]{3,4,18};
        	int[] array_1518421836 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample1CADECedric__21).getLits();
        	for(int ii = 0; ii <array_388526397.length; ii++) {
        		org.junit.Assert.assertEquals(array_388526397[ii], array_1518421836[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testExample1CADECedric__21)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalWLClause) (o_testExample1CADECedric__21)).isSatisfied());
        Assert.assertEquals("-1[?] 2[?] 9[?] ", ((OriginalWLClause) (o_testExample1CADECedric__21)).toString());
        Assert.assertEquals(8, ((int) (((OriginalWLClause) (o_testExample1CADECedric__21)).hashCode())));
        clause.clear();
        IVecInt o_testExample1CADECedric__23 = clause.push(1);
        Assert.assertEquals("1", ((VecInt) (o_testExample1CADECedric__23)).toString());
        Assert.assertEquals(1, ((int) (((VecInt) (o_testExample1CADECedric__23)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testExample1CADECedric__23)).isEmpty());
        IConstr o_testExample1CADECedric__24 = this.solver.addClause(clause);
        int[] array_230982896 = new int[]{2,20};
        	int[] array_270082025 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testExample1CADECedric__24).getLits();
        	for(int ii = 0; ii <array_230982896.length; ii++) {
        		org.junit.Assert.assertEquals(array_230982896[ii], array_270082025[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testExample1CADECedric__24)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalBinaryClause) (o_testExample1CADECedric__24)).isSatisfied());
        Assert.assertEquals("1[?] 10[?]", ((OriginalBinaryClause) (o_testExample1CADECedric__24)).toString());
        Assert.assertEquals(11, ((int) (((OriginalBinaryClause) (o_testExample1CADECedric__24)).hashCode())));
        clause.clear();
        IVecInt o_testExample1CADECedric__26 = clause.push(1).push((-3)).push((-5));
        Assert.assertEquals("1,-3,-5", ((VecInt) (o_testExample1CADECedric__26)).toString());
        Assert.assertEquals(-2, ((int) (((VecInt) (o_testExample1CADECedric__26)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testExample1CADECedric__26)).isEmpty());
        IConstr o_testExample1CADECedric__31 = this.solver.addClause(clause);
        int[] array_1000514304 = new int[]{2,7,11,22};
        	int[] array_424327499 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample1CADECedric__31).getLits();
        	for(int ii = 0; ii <array_1000514304.length; ii++) {
        		org.junit.Assert.assertEquals(array_1000514304[ii], array_424327499[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testExample1CADECedric__31)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalWLClause) (o_testExample1CADECedric__31)).isSatisfied());
        Assert.assertEquals("1[?] -3[?] -5[?] 11[?] ", ((OriginalWLClause) (o_testExample1CADECedric__31)).toString());
        Assert.assertEquals(10, ((int) (((OriginalWLClause) (o_testExample1CADECedric__31)).hashCode())));
        clause.clear();
        IVecInt o_testExample1CADECedric__33 = clause.push((-1)).push(3).push(4);
        Assert.assertEquals("-1,3,4", ((VecInt) (o_testExample1CADECedric__33)).toString());
        Assert.assertEquals(2, ((int) (((VecInt) (o_testExample1CADECedric__33)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testExample1CADECedric__33)).isEmpty());
        IConstr o_testExample1CADECedric__37 = this.solver.addClause(clause);
        int[] array_1827632475 = new int[]{3,6,8,24};
        	int[] array_221477669 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample1CADECedric__37).getLits();
        	for(int ii = 0; ii <array_1827632475.length; ii++) {
        		org.junit.Assert.assertEquals(array_1827632475[ii], array_221477669[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testExample1CADECedric__37)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalWLClause) (o_testExample1CADECedric__37)).isSatisfied());
        Assert.assertEquals("-1[?] 3[?] 4[?] 12[?] ", ((OriginalWLClause) (o_testExample1CADECedric__37)).toString());
        Assert.assertEquals(10, ((int) (((OriginalWLClause) (o_testExample1CADECedric__37)).hashCode())));
        clause.clear();
        IVecInt o_testExample1CADECedric__39 = clause.push((-2));
        Assert.assertEquals("-2", ((VecInt) (o_testExample1CADECedric__39)).toString());
        Assert.assertEquals(-2, ((int) (((VecInt) (o_testExample1CADECedric__39)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testExample1CADECedric__39)).isEmpty());
        IConstr o_testExample1CADECedric__41 = this.solver.addClause(clause);
        int[] array_1904320861 = new int[]{5,26};
        	int[] array_1979099070 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testExample1CADECedric__41).getLits();
        	for(int ii = 0; ii <array_1904320861.length; ii++) {
        		org.junit.Assert.assertEquals(array_1904320861[ii], array_1979099070[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testExample1CADECedric__41)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalBinaryClause) (o_testExample1CADECedric__41)).isSatisfied());
        Assert.assertEquals("-2[?] 13[?]", ((OriginalBinaryClause) (o_testExample1CADECedric__41)).toString());
        Assert.assertEquals(15, ((int) (((OriginalBinaryClause) (o_testExample1CADECedric__41)).hashCode())));
        clause.clear();
        List<IVecInt> muses = allMUSes.computeAllMUSes();
        int o_testExample1CADECedric__45 = muses.size();
        Assert.assertEquals(2, ((int) (o_testExample1CADECedric__45)));
        Assert.assertEquals(5, ((int) (o_testExample1CADECedric__1)));
        Assert.assertEquals("", ((VecInt) (o_testExample1CADECedric__4)).toString());
        Assert.assertTrue(((VecInt) (o_testExample1CADECedric__4)).isEmpty());
        int[] array_416956815 = new int[]{9,10,12};
        	int[] array_879569244 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample1CADECedric__7).getLits();
        	for(int ii = 0; ii <array_416956815.length; ii++) {
        		org.junit.Assert.assertEquals(array_416956815[ii], array_879569244[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testExample1CADECedric__7)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalWLClause) (o_testExample1CADECedric__7)).isSatisfied());
        Assert.assertEquals("-4[?] 5[?] 6[?] ", ((OriginalWLClause) (o_testExample1CADECedric__7)).toString());
        Assert.assertEquals(10, ((int) (((OriginalWLClause) (o_testExample1CADECedric__7)).hashCode())));
        Assert.assertEquals("", ((VecInt) (o_testExample1CADECedric__9)).toString());
        Assert.assertTrue(((VecInt) (o_testExample1CADECedric__9)).isEmpty());
        int[] array_533326347 = new int[]{4,7,14};
        	int[] array_14515348 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample1CADECedric__12).getLits();
        	for(int ii = 0; ii <array_533326347.length; ii++) {
        		org.junit.Assert.assertEquals(array_533326347[ii], array_14515348[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testExample1CADECedric__12)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalWLClause) (o_testExample1CADECedric__12)).isSatisfied());
        Assert.assertEquals("2[?] -3[?] 7[?] ", ((OriginalWLClause) (o_testExample1CADECedric__12)).toString());
        Assert.assertEquals(8, ((int) (((OriginalWLClause) (o_testExample1CADECedric__12)).hashCode())));
        Assert.assertEquals("", ((VecInt) (o_testExample1CADECedric__14)).toString());
        Assert.assertTrue(((VecInt) (o_testExample1CADECedric__14)).isEmpty());
        int[] array_1722904138 = new int[]{9,16};
        	int[] array_1221341321 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testExample1CADECedric__16).getLits();
        	for(int ii = 0; ii <array_1722904138.length; ii++) {
        		org.junit.Assert.assertEquals(array_1722904138[ii], array_1221341321[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testExample1CADECedric__16)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalBinaryClause) (o_testExample1CADECedric__16)).isSatisfied());
        Assert.assertEquals("-4[?] 8[?]", ((OriginalBinaryClause) (o_testExample1CADECedric__16)).toString());
        Assert.assertEquals(12, ((int) (((OriginalBinaryClause) (o_testExample1CADECedric__16)).hashCode())));
        Assert.assertEquals("", ((VecInt) (o_testExample1CADECedric__18)).toString());
        Assert.assertTrue(((VecInt) (o_testExample1CADECedric__18)).isEmpty());
        int[] array_1251781007 = new int[]{4,18,3};
        	int[] array_567385950 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample1CADECedric__21).getLits();
        	for(int ii = 0; ii <array_1251781007.length; ii++) {
        		org.junit.Assert.assertEquals(array_1251781007[ii], array_567385950[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testExample1CADECedric__21)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalWLClause) (o_testExample1CADECedric__21)).isSatisfied());
        Assert.assertEquals("2[?] 9[?] -1[?] ", ((OriginalWLClause) (o_testExample1CADECedric__21)).toString());
        Assert.assertEquals(8, ((int) (((OriginalWLClause) (o_testExample1CADECedric__21)).hashCode())));
        Assert.assertEquals("", ((VecInt) (o_testExample1CADECedric__23)).toString());
        Assert.assertTrue(((VecInt) (o_testExample1CADECedric__23)).isEmpty());
        int[] array_1337954303 = new int[]{2,20};
        	int[] array_416812937 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testExample1CADECedric__24).getLits();
        	for(int ii = 0; ii <array_1337954303.length; ii++) {
        		org.junit.Assert.assertEquals(array_1337954303[ii], array_416812937[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testExample1CADECedric__24)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalBinaryClause) (o_testExample1CADECedric__24)).isSatisfied());
        Assert.assertEquals("1[?] 10[F]", ((OriginalBinaryClause) (o_testExample1CADECedric__24)).toString());
        Assert.assertEquals(11, ((int) (((OriginalBinaryClause) (o_testExample1CADECedric__24)).hashCode())));
        Assert.assertEquals("", ((VecInt) (o_testExample1CADECedric__26)).toString());
        Assert.assertTrue(((VecInt) (o_testExample1CADECedric__26)).isEmpty());
        int[] array_1516230915 = new int[]{2,11,7,22};
        	int[] array_74047512 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample1CADECedric__31).getLits();
        	for(int ii = 0; ii <array_1516230915.length; ii++) {
        		org.junit.Assert.assertEquals(array_1516230915[ii], array_74047512[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testExample1CADECedric__31)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalWLClause) (o_testExample1CADECedric__31)).isSatisfied());
        Assert.assertEquals("1[?] -5[?] -3[?] 11[?] ", ((OriginalWLClause) (o_testExample1CADECedric__31)).toString());
        Assert.assertEquals(10, ((int) (((OriginalWLClause) (o_testExample1CADECedric__31)).hashCode())));
        Assert.assertEquals("", ((VecInt) (o_testExample1CADECedric__33)).toString());
        Assert.assertTrue(((VecInt) (o_testExample1CADECedric__33)).isEmpty());
        int[] array_566841318 = new int[]{6,8,24,3};
        	int[] array_1777133809 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample1CADECedric__37).getLits();
        	for(int ii = 0; ii <array_566841318.length; ii++) {
        		org.junit.Assert.assertEquals(array_566841318[ii], array_1777133809[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testExample1CADECedric__37)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalWLClause) (o_testExample1CADECedric__37)).isSatisfied());
        Assert.assertEquals("3[?] 4[?] 12[?] -1[?] ", ((OriginalWLClause) (o_testExample1CADECedric__37)).toString());
        Assert.assertEquals(10, ((int) (((OriginalWLClause) (o_testExample1CADECedric__37)).hashCode())));
        Assert.assertEquals("", ((VecInt) (o_testExample1CADECedric__39)).toString());
        Assert.assertTrue(((VecInt) (o_testExample1CADECedric__39)).isEmpty());
        int[] array_402677617 = new int[]{5,26};
        	int[] array_1030573006 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testExample1CADECedric__41).getLits();
        	for(int ii = 0; ii <array_402677617.length; ii++) {
        		org.junit.Assert.assertEquals(array_402677617[ii], array_1030573006[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testExample1CADECedric__41)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalBinaryClause) (o_testExample1CADECedric__41)).isSatisfied());
        Assert.assertEquals("-2[?] 13[F]", ((OriginalBinaryClause) (o_testExample1CADECedric__41)).toString());
        Assert.assertEquals(15, ((int) (((OriginalBinaryClause) (o_testExample1CADECedric__41)).hashCode())));
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
        IConstr o_testExample3CADECedric__5 = this.solver.addClause(clause);
        int[] array_1874542138 = new int[]{2,14};
        	int[] array_1832891739 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testExample3CADECedric__5).getLits();
        	for(int ii = 0; ii <array_1874542138.length; ii++) {
        		org.junit.Assert.assertEquals(array_1874542138[ii], array_1832891739[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testExample3CADECedric__5)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalBinaryClause) (o_testExample3CADECedric__5)).isSatisfied());
        Assert.assertEquals("1[?] 7[?]", ((OriginalBinaryClause) (o_testExample3CADECedric__5)).toString());
        Assert.assertEquals(8, ((int) (((OriginalBinaryClause) (o_testExample3CADECedric__5)).hashCode())));
        clause.clear();
        IVecInt o_testExample3CADECedric__7 = clause.push(2).push(4);
        Assert.assertEquals("2,4", ((VecInt) (o_testExample3CADECedric__7)).toString());
        Assert.assertEquals(3, ((int) (((VecInt) (o_testExample3CADECedric__7)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testExample3CADECedric__7)).isEmpty());
        IConstr o_testExample3CADECedric__9 = this.solver.addClause(clause);
        int[] array_1330701543 = new int[]{4,8,16};
        	int[] array_1575304216 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__9).getLits();
        	for(int ii = 0; ii <array_1330701543.length; ii++) {
        		org.junit.Assert.assertEquals(array_1330701543[ii], array_1575304216[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testExample3CADECedric__9)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalWLClause) (o_testExample3CADECedric__9)).isSatisfied());
        Assert.assertEquals("2[?] 4[?] 8[?] ", ((OriginalWLClause) (o_testExample3CADECedric__9)).toString());
        Assert.assertEquals(9, ((int) (((OriginalWLClause) (o_testExample3CADECedric__9)).hashCode())));
        clause.clear();
        IVecInt o_testExample3CADECedric__11 = clause.push((-2)).push((-5));
        Assert.assertEquals("-2,-5", ((VecInt) (o_testExample3CADECedric__11)).toString());
        Assert.assertEquals(-3, ((int) (((VecInt) (o_testExample3CADECedric__11)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testExample3CADECedric__11)).isEmpty());
        IConstr o_testExample3CADECedric__15 = this.solver.addClause(clause);
        int[] array_967239513 = new int[]{5,11,18};
        	int[] array_1396166128 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__15).getLits();
        	for(int ii = 0; ii <array_967239513.length; ii++) {
        		org.junit.Assert.assertEquals(array_967239513[ii], array_1396166128[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testExample3CADECedric__15)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalWLClause) (o_testExample3CADECedric__15)).isSatisfied());
        Assert.assertEquals("-2[?] -5[?] 9[?] ", ((OriginalWLClause) (o_testExample3CADECedric__15)).toString());
        Assert.assertEquals(11, ((int) (((OriginalWLClause) (o_testExample3CADECedric__15)).hashCode())));
        clause.clear();
        IVecInt o_testExample3CADECedric__17 = clause.push(1).push(4);
        Assert.assertEquals("1,4", ((VecInt) (o_testExample3CADECedric__17)).toString());
        Assert.assertEquals(2, ((int) (((VecInt) (o_testExample3CADECedric__17)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testExample3CADECedric__17)).isEmpty());
        IConstr o_testExample3CADECedric__19 = this.solver.addClause(clause);
        int[] array_835106084 = new int[]{2,8,20};
        	int[] array_1666019680 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__19).getLits();
        	for(int ii = 0; ii <array_835106084.length; ii++) {
        		org.junit.Assert.assertEquals(array_835106084[ii], array_1666019680[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testExample3CADECedric__19)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalWLClause) (o_testExample3CADECedric__19)).isSatisfied());
        Assert.assertEquals("1[?] 4[?] 10[?] ", ((OriginalWLClause) (o_testExample3CADECedric__19)).toString());
        Assert.assertEquals(10, ((int) (((OriginalWLClause) (o_testExample3CADECedric__19)).hashCode())));
        clause.clear();
        IVecInt o_testExample3CADECedric__21 = clause.push(2).push((-3));
        Assert.assertEquals("2,-3", ((VecInt) (o_testExample3CADECedric__21)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_testExample3CADECedric__21)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testExample3CADECedric__21)).isEmpty());
        IConstr o_testExample3CADECedric__24 = this.solver.addClause(clause);
        int[] array_758981284 = new int[]{4,7,22};
        	int[] array_323067337 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__24).getLits();
        	for(int ii = 0; ii <array_758981284.length; ii++) {
        		org.junit.Assert.assertEquals(array_758981284[ii], array_323067337[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testExample3CADECedric__24)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalWLClause) (o_testExample3CADECedric__24)).isSatisfied());
        Assert.assertEquals("2[?] -3[?] 11[?] ", ((OriginalWLClause) (o_testExample3CADECedric__24)).toString());
        Assert.assertEquals(11, ((int) (((OriginalWLClause) (o_testExample3CADECedric__24)).hashCode())));
        clause.clear();
        IVecInt o_testExample3CADECedric__26 = clause.push(6);
        Assert.assertEquals("6", ((VecInt) (o_testExample3CADECedric__26)).toString());
        Assert.assertEquals(6, ((int) (((VecInt) (o_testExample3CADECedric__26)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testExample3CADECedric__26)).isEmpty());
        IConstr o_testExample3CADECedric__27 = this.solver.addClause(clause);
        int[] array_738477146 = new int[]{12,24};
        	int[] array_237581701 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testExample3CADECedric__27).getLits();
        	for(int ii = 0; ii <array_738477146.length; ii++) {
        		org.junit.Assert.assertEquals(array_738477146[ii], array_237581701[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testExample3CADECedric__27)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalBinaryClause) (o_testExample3CADECedric__27)).isSatisfied());
        Assert.assertEquals("6[?] 12[?]", ((OriginalBinaryClause) (o_testExample3CADECedric__27)).toString());
        Assert.assertEquals(18, ((int) (((OriginalBinaryClause) (o_testExample3CADECedric__27)).hashCode())));
        clause.clear();
        IVecInt o_testExample3CADECedric__29 = clause.push(3).push((-4));
        Assert.assertEquals("3,-4", ((VecInt) (o_testExample3CADECedric__29)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_testExample3CADECedric__29)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testExample3CADECedric__29)).isEmpty());
        IConstr o_testExample3CADECedric__32 = this.solver.addClause(clause);
        int[] array_1598938065 = new int[]{6,9,26};
        	int[] array_2014885925 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__32).getLits();
        	for(int ii = 0; ii <array_1598938065.length; ii++) {
        		org.junit.Assert.assertEquals(array_1598938065[ii], array_2014885925[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testExample3CADECedric__32)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalWLClause) (o_testExample3CADECedric__32)).isSatisfied());
        Assert.assertEquals("3[?] -4[?] 13[?] ", ((OriginalWLClause) (o_testExample3CADECedric__32)).toString());
        Assert.assertEquals(13, ((int) (((OriginalWLClause) (o_testExample3CADECedric__32)).hashCode())));
        clause.clear();
        IVecInt o_testExample3CADECedric__34 = clause.push((-1));
        Assert.assertEquals("-1", ((VecInt) (o_testExample3CADECedric__34)).toString());
        Assert.assertEquals(-1, ((int) (((VecInt) (o_testExample3CADECedric__34)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testExample3CADECedric__34)).isEmpty());
        IConstr o_testExample3CADECedric__36 = this.solver.addClause(clause);
        int[] array_739419041 = new int[]{3,28};
        	int[] array_113152347 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testExample3CADECedric__36).getLits();
        	for(int ii = 0; ii <array_739419041.length; ii++) {
        		org.junit.Assert.assertEquals(array_739419041[ii], array_113152347[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testExample3CADECedric__36)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalBinaryClause) (o_testExample3CADECedric__36)).isSatisfied());
        Assert.assertEquals("-1[?] 14[?]", ((OriginalBinaryClause) (o_testExample3CADECedric__36)).toString());
        Assert.assertEquals(15, ((int) (((OriginalBinaryClause) (o_testExample3CADECedric__36)).hashCode())));
        clause.clear();
        IVecInt o_testExample3CADECedric__38 = clause.push((-2)).push((-3));
        Assert.assertEquals("-2,-3", ((VecInt) (o_testExample3CADECedric__38)).toString());
        Assert.assertEquals(-2, ((int) (((VecInt) (o_testExample3CADECedric__38)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testExample3CADECedric__38)).isEmpty());
        IConstr o_testExample3CADECedric__42 = this.solver.addClause(clause);
        int[] array_542285104 = new int[]{5,7,30};
        	int[] array_1113299406 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__42).getLits();
        	for(int ii = 0; ii <array_542285104.length; ii++) {
        		org.junit.Assert.assertEquals(array_542285104[ii], array_1113299406[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testExample3CADECedric__42)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalWLClause) (o_testExample3CADECedric__42)).isSatisfied());
        Assert.assertEquals("-2[?] -3[?] 15[?] ", ((OriginalWLClause) (o_testExample3CADECedric__42)).toString());
        Assert.assertEquals(14, ((int) (((OriginalWLClause) (o_testExample3CADECedric__42)).hashCode())));
        clause.clear();
        IVecInt o_testExample3CADECedric__44 = clause.push(2).push(4).push(6);
        Assert.assertEquals("2,4,6", ((VecInt) (o_testExample3CADECedric__44)).toString());
        Assert.assertEquals(4, ((int) (((VecInt) (o_testExample3CADECedric__44)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testExample3CADECedric__44)).isEmpty());
        IConstr o_testExample3CADECedric__47 = this.solver.addClause(clause);
        int[] array_542859932 = new int[]{4,8,12,32};
        	int[] array_288947405 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__47).getLits();
        	for(int ii = 0; ii <array_542859932.length; ii++) {
        		org.junit.Assert.assertEquals(array_542859932[ii], array_288947405[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testExample3CADECedric__47)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalWLClause) (o_testExample3CADECedric__47)).isSatisfied());
        Assert.assertEquals("2[?] 4[?] 6[?] 16[?] ", ((OriginalWLClause) (o_testExample3CADECedric__47)).toString());
        Assert.assertEquals(14, ((int) (((OriginalWLClause) (o_testExample3CADECedric__47)).hashCode())));
        clause.clear();
        IVecInt o_testExample3CADECedric__49 = clause.push(5);
        Assert.assertEquals("5", ((VecInt) (o_testExample3CADECedric__49)).toString());
        Assert.assertEquals(5, ((int) (((VecInt) (o_testExample3CADECedric__49)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testExample3CADECedric__49)).isEmpty());
        IConstr o_testExample3CADECedric__50 = this.solver.addClause(clause);
        int[] array_217909470 = new int[]{10,34};
        	int[] array_1594241263 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testExample3CADECedric__50).getLits();
        	for(int ii = 0; ii <array_217909470.length; ii++) {
        		org.junit.Assert.assertEquals(array_217909470[ii], array_1594241263[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testExample3CADECedric__50)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalBinaryClause) (o_testExample3CADECedric__50)).isSatisfied());
        Assert.assertEquals("5[?] 17[?]", ((OriginalBinaryClause) (o_testExample3CADECedric__50)).toString());
        Assert.assertEquals(22, ((int) (((OriginalBinaryClause) (o_testExample3CADECedric__50)).hashCode())));
        clause.clear();
        IVecInt o_testExample3CADECedric__52 = clause.push((-6)).push(4);
        Assert.assertEquals("-6,4", ((VecInt) (o_testExample3CADECedric__52)).toString());
        Assert.assertEquals(-1, ((int) (((VecInt) (o_testExample3CADECedric__52)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testExample3CADECedric__52)).isEmpty());
        IConstr o_testExample3CADECedric__55 = this.solver.addClause(clause);
        int[] array_1262462105 = new int[]{8,13,36};
        	int[] array_1145255968 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__55).getLits();
        	for(int ii = 0; ii <array_1262462105.length; ii++) {
        		org.junit.Assert.assertEquals(array_1262462105[ii], array_1145255968[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testExample3CADECedric__55)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalWLClause) (o_testExample3CADECedric__55)).isSatisfied());
        Assert.assertEquals("4[?] -6[?] 18[?] ", ((OriginalWLClause) (o_testExample3CADECedric__55)).toString());
        Assert.assertEquals(19, ((int) (((OriginalWLClause) (o_testExample3CADECedric__55)).hashCode())));
        clause.clear();
        IVecInt o_testExample3CADECedric__57 = clause.push((-5)).push((-6));
        Assert.assertEquals("-5,-6", ((VecInt) (o_testExample3CADECedric__57)).toString());
        Assert.assertEquals(-5, ((int) (((VecInt) (o_testExample3CADECedric__57)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testExample3CADECedric__57)).isEmpty());
        IConstr o_testExample3CADECedric__61 = this.solver.addClause(clause);
        int[] array_1120430660 = new int[]{11,13,38};
        	int[] array_880546439 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__61).getLits();
        	for(int ii = 0; ii <array_1120430660.length; ii++) {
        		org.junit.Assert.assertEquals(array_1120430660[ii], array_880546439[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testExample3CADECedric__61)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalWLClause) (o_testExample3CADECedric__61)).isSatisfied());
        Assert.assertEquals("-5[?] -6[?] 19[?] ", ((OriginalWLClause) (o_testExample3CADECedric__61)).toString());
        Assert.assertEquals(20, ((int) (((OriginalWLClause) (o_testExample3CADECedric__61)).hashCode())));
        clause.clear();
        IVecInt o_testExample3CADECedric__63 = clause.push(1).push((-3)).push(4);
        Assert.assertEquals("1,-3,4", ((VecInt) (o_testExample3CADECedric__63)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_testExample3CADECedric__63)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testExample3CADECedric__63)).isEmpty());
        IConstr o_testExample3CADECedric__67 = this.solver.addClause(clause);
        int[] array_992979946 = new int[]{2,7,8,40};
        	int[] array_222622855 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__67).getLits();
        	for(int ii = 0; ii <array_992979946.length; ii++) {
        		org.junit.Assert.assertEquals(array_992979946[ii], array_222622855[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testExample3CADECedric__67)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalWLClause) (o_testExample3CADECedric__67)).isSatisfied());
        Assert.assertEquals("1[?] -3[?] 4[?] 20[?] ", ((OriginalWLClause) (o_testExample3CADECedric__67)).toString());
        Assert.assertEquals(14, ((int) (((OriginalWLClause) (o_testExample3CADECedric__67)).hashCode())));
        clause.clear();
        List<IVecInt> muses = allMUSes.computeAllMUSes();
        int o_testExample3CADECedric__71 = muses.size();
        Assert.assertEquals(9, ((int) (o_testExample3CADECedric__71)));
        Assert.assertEquals(6, ((int) (o_testExample3CADECedric__1)));
        Assert.assertEquals("", ((VecInt) (o_testExample3CADECedric__4)).toString());
        Assert.assertTrue(((VecInt) (o_testExample3CADECedric__4)).isEmpty());
        int[] array_2088225685 = new int[]{2,14};
        	int[] array_100151216 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testExample3CADECedric__5).getLits();
        	for(int ii = 0; ii <array_2088225685.length; ii++) {
        		org.junit.Assert.assertEquals(array_2088225685[ii], array_100151216[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testExample3CADECedric__5)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalBinaryClause) (o_testExample3CADECedric__5)).isSatisfied());
        Assert.assertEquals("1[?] 7[?]", ((OriginalBinaryClause) (o_testExample3CADECedric__5)).toString());
        Assert.assertEquals(8, ((int) (((OriginalBinaryClause) (o_testExample3CADECedric__5)).hashCode())));
        Assert.assertEquals("", ((VecInt) (o_testExample3CADECedric__7)).toString());
        Assert.assertTrue(((VecInt) (o_testExample3CADECedric__7)).isEmpty());
        int[] array_1935660128 = new int[]{4,16,8};
        	int[] array_435813242 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__9).getLits();
        	for(int ii = 0; ii <array_1935660128.length; ii++) {
        		org.junit.Assert.assertEquals(array_1935660128[ii], array_435813242[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testExample3CADECedric__9)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalWLClause) (o_testExample3CADECedric__9)).isSatisfied());
        Assert.assertEquals("2[?] 8[?] 4[?] ", ((OriginalWLClause) (o_testExample3CADECedric__9)).toString());
        Assert.assertEquals(9, ((int) (((OriginalWLClause) (o_testExample3CADECedric__9)).hashCode())));
        Assert.assertEquals("", ((VecInt) (o_testExample3CADECedric__11)).toString());
        Assert.assertTrue(((VecInt) (o_testExample3CADECedric__11)).isEmpty());
        int[] array_714347117 = new int[]{18,5,11};
        	int[] array_1619729999 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__15).getLits();
        	for(int ii = 0; ii <array_714347117.length; ii++) {
        		org.junit.Assert.assertEquals(array_714347117[ii], array_1619729999[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testExample3CADECedric__15)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalWLClause) (o_testExample3CADECedric__15)).isSatisfied());
        Assert.assertEquals("9[?] -2[?] -5[?] ", ((OriginalWLClause) (o_testExample3CADECedric__15)).toString());
        Assert.assertEquals(11, ((int) (((OriginalWLClause) (o_testExample3CADECedric__15)).hashCode())));
        Assert.assertEquals("", ((VecInt) (o_testExample3CADECedric__17)).toString());
        Assert.assertTrue(((VecInt) (o_testExample3CADECedric__17)).isEmpty());
        int[] array_925052670 = new int[]{2,8,20};
        	int[] array_1885232289 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__19).getLits();
        	for(int ii = 0; ii <array_925052670.length; ii++) {
        		org.junit.Assert.assertEquals(array_925052670[ii], array_1885232289[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testExample3CADECedric__19)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalWLClause) (o_testExample3CADECedric__19)).isSatisfied());
        Assert.assertEquals("1[?] 4[?] 10[?] ", ((OriginalWLClause) (o_testExample3CADECedric__19)).toString());
        Assert.assertEquals(10, ((int) (((OriginalWLClause) (o_testExample3CADECedric__19)).hashCode())));
        Assert.assertEquals("", ((VecInt) (o_testExample3CADECedric__21)).toString());
        Assert.assertTrue(((VecInt) (o_testExample3CADECedric__21)).isEmpty());
        int[] array_110211353 = new int[]{4,7,22};
        	int[] array_483770255 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__24).getLits();
        	for(int ii = 0; ii <array_110211353.length; ii++) {
        		org.junit.Assert.assertEquals(array_110211353[ii], array_483770255[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testExample3CADECedric__24)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalWLClause) (o_testExample3CADECedric__24)).isSatisfied());
        Assert.assertEquals("2[?] -3[?] 11[?] ", ((OriginalWLClause) (o_testExample3CADECedric__24)).toString());
        Assert.assertEquals(11, ((int) (((OriginalWLClause) (o_testExample3CADECedric__24)).hashCode())));
        Assert.assertEquals("", ((VecInt) (o_testExample3CADECedric__26)).toString());
        Assert.assertTrue(((VecInt) (o_testExample3CADECedric__26)).isEmpty());
        int[] array_1914705027 = new int[]{12,24};
        	int[] array_221548755 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testExample3CADECedric__27).getLits();
        	for(int ii = 0; ii <array_1914705027.length; ii++) {
        		org.junit.Assert.assertEquals(array_1914705027[ii], array_221548755[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testExample3CADECedric__27)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalBinaryClause) (o_testExample3CADECedric__27)).isSatisfied());
        Assert.assertEquals("6[?] 12[?]", ((OriginalBinaryClause) (o_testExample3CADECedric__27)).toString());
        Assert.assertEquals(18, ((int) (((OriginalBinaryClause) (o_testExample3CADECedric__27)).hashCode())));
        Assert.assertEquals("", ((VecInt) (o_testExample3CADECedric__29)).toString());
        Assert.assertTrue(((VecInt) (o_testExample3CADECedric__29)).isEmpty());
        int[] array_1732722452 = new int[]{9,6,26};
        	int[] array_266940695 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__32).getLits();
        	for(int ii = 0; ii <array_1732722452.length; ii++) {
        		org.junit.Assert.assertEquals(array_1732722452[ii], array_266940695[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testExample3CADECedric__32)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalWLClause) (o_testExample3CADECedric__32)).isSatisfied());
        Assert.assertEquals("-4[?] 3[?] 13[?] ", ((OriginalWLClause) (o_testExample3CADECedric__32)).toString());
        Assert.assertEquals(13, ((int) (((OriginalWLClause) (o_testExample3CADECedric__32)).hashCode())));
        Assert.assertEquals("", ((VecInt) (o_testExample3CADECedric__34)).toString());
        Assert.assertTrue(((VecInt) (o_testExample3CADECedric__34)).isEmpty());
        int[] array_2065162280 = new int[]{3,28};
        	int[] array_1947384779 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testExample3CADECedric__36).getLits();
        	for(int ii = 0; ii <array_2065162280.length; ii++) {
        		org.junit.Assert.assertEquals(array_2065162280[ii], array_1947384779[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testExample3CADECedric__36)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalBinaryClause) (o_testExample3CADECedric__36)).isSatisfied());
        Assert.assertEquals("-1[?] 14[?]", ((OriginalBinaryClause) (o_testExample3CADECedric__36)).toString());
        Assert.assertEquals(15, ((int) (((OriginalBinaryClause) (o_testExample3CADECedric__36)).hashCode())));
        Assert.assertEquals("", ((VecInt) (o_testExample3CADECedric__38)).toString());
        Assert.assertTrue(((VecInt) (o_testExample3CADECedric__38)).isEmpty());
        int[] array_1625541399 = new int[]{7,30,5};
        	int[] array_1745347144 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__42).getLits();
        	for(int ii = 0; ii <array_1625541399.length; ii++) {
        		org.junit.Assert.assertEquals(array_1625541399[ii], array_1745347144[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testExample3CADECedric__42)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalWLClause) (o_testExample3CADECedric__42)).isSatisfied());
        Assert.assertEquals("-3[?] 15[?] -2[?] ", ((OriginalWLClause) (o_testExample3CADECedric__42)).toString());
        Assert.assertEquals(14, ((int) (((OriginalWLClause) (o_testExample3CADECedric__42)).hashCode())));
        Assert.assertEquals("", ((VecInt) (o_testExample3CADECedric__44)).toString());
        Assert.assertTrue(((VecInt) (o_testExample3CADECedric__44)).isEmpty());
        int[] array_1222220459 = new int[]{12,4,32,8};
        	int[] array_1839866620 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__47).getLits();
        	for(int ii = 0; ii <array_1222220459.length; ii++) {
        		org.junit.Assert.assertEquals(array_1222220459[ii], array_1839866620[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testExample3CADECedric__47)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalWLClause) (o_testExample3CADECedric__47)).isSatisfied());
        Assert.assertEquals("6[?] 2[?] 16[?] 4[?] ", ((OriginalWLClause) (o_testExample3CADECedric__47)).toString());
        Assert.assertEquals(14, ((int) (((OriginalWLClause) (o_testExample3CADECedric__47)).hashCode())));
        Assert.assertEquals("", ((VecInt) (o_testExample3CADECedric__49)).toString());
        Assert.assertTrue(((VecInt) (o_testExample3CADECedric__49)).isEmpty());
        int[] array_234071959 = new int[]{10,34};
        	int[] array_1199591453 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testExample3CADECedric__50).getLits();
        	for(int ii = 0; ii <array_234071959.length; ii++) {
        		org.junit.Assert.assertEquals(array_234071959[ii], array_1199591453[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testExample3CADECedric__50)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalBinaryClause) (o_testExample3CADECedric__50)).isSatisfied());
        Assert.assertEquals("5[?] 17[?]", ((OriginalBinaryClause) (o_testExample3CADECedric__50)).toString());
        Assert.assertEquals(22, ((int) (((OriginalBinaryClause) (o_testExample3CADECedric__50)).hashCode())));
        Assert.assertEquals("", ((VecInt) (o_testExample3CADECedric__52)).toString());
        Assert.assertTrue(((VecInt) (o_testExample3CADECedric__52)).isEmpty());
        int[] array_1549497873 = new int[]{36,8,13};
        	int[] array_2034946429 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__55).getLits();
        	for(int ii = 0; ii <array_1549497873.length; ii++) {
        		org.junit.Assert.assertEquals(array_1549497873[ii], array_2034946429[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testExample3CADECedric__55)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalWLClause) (o_testExample3CADECedric__55)).isSatisfied());
        Assert.assertEquals("18[?] 4[?] -6[?] ", ((OriginalWLClause) (o_testExample3CADECedric__55)).toString());
        Assert.assertEquals(19, ((int) (((OriginalWLClause) (o_testExample3CADECedric__55)).hashCode())));
        Assert.assertEquals("", ((VecInt) (o_testExample3CADECedric__57)).toString());
        Assert.assertTrue(((VecInt) (o_testExample3CADECedric__57)).isEmpty());
        int[] array_1667689327 = new int[]{38,13,11};
        	int[] array_1035891738 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__61).getLits();
        	for(int ii = 0; ii <array_1667689327.length; ii++) {
        		org.junit.Assert.assertEquals(array_1667689327[ii], array_1035891738[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testExample3CADECedric__61)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalWLClause) (o_testExample3CADECedric__61)).isSatisfied());
        Assert.assertEquals("19[?] -6[?] -5[?] ", ((OriginalWLClause) (o_testExample3CADECedric__61)).toString());
        Assert.assertEquals(20, ((int) (((OriginalWLClause) (o_testExample3CADECedric__61)).hashCode())));
        Assert.assertEquals("", ((VecInt) (o_testExample3CADECedric__63)).toString());
        Assert.assertTrue(((VecInt) (o_testExample3CADECedric__63)).isEmpty());
        int[] array_1854323044 = new int[]{2,7,8,40};
        	int[] array_1182590295 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3CADECedric__67).getLits();
        	for(int ii = 0; ii <array_1854323044.length; ii++) {
        		org.junit.Assert.assertEquals(array_1854323044[ii], array_1182590295[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testExample3CADECedric__67)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalWLClause) (o_testExample3CADECedric__67)).isSatisfied());
        Assert.assertEquals("1[?] -3[?] 4[?] 20[?] ", ((OriginalWLClause) (o_testExample3CADECedric__67)).toString());
        Assert.assertEquals(14, ((int) (((OriginalWLClause) (o_testExample3CADECedric__67)).hashCode())));
    }

    @Test(timeout = 10000)
    public void testExample3IJCAICedric() throws Exception, ContradictionException, TimeoutException {
        int o_testExample3IJCAICedric__1 = this.solver.newVar(5);
        Assert.assertEquals(5, ((int) (o_testExample3IJCAICedric__1)));
        IVecInt clause = new VecInt();
        IVecInt o_testExample3IJCAICedric__4 = clause.push(4);
        Assert.assertEquals("4", ((VecInt) (o_testExample3IJCAICedric__4)).toString());
        Assert.assertEquals(4, ((int) (((VecInt) (o_testExample3IJCAICedric__4)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testExample3IJCAICedric__4)).isEmpty());
        IConstr o_testExample3IJCAICedric__5 = this.solver.addClause(clause);
        int[] array_2108503400 = new int[]{8,12};
        	int[] array_159663009 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testExample3IJCAICedric__5).getLits();
        	for(int ii = 0; ii <array_2108503400.length; ii++) {
        		org.junit.Assert.assertEquals(array_2108503400[ii], array_159663009[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testExample3IJCAICedric__5)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalBinaryClause) (o_testExample3IJCAICedric__5)).isSatisfied());
        Assert.assertEquals("4[?] 6[?]", ((OriginalBinaryClause) (o_testExample3IJCAICedric__5)).toString());
        Assert.assertEquals(10, ((int) (((OriginalBinaryClause) (o_testExample3IJCAICedric__5)).hashCode())));
        clause.clear();
        IVecInt o_testExample3IJCAICedric__7 = clause.push(2).push(3);
        Assert.assertEquals("2,3", ((VecInt) (o_testExample3IJCAICedric__7)).toString());
        Assert.assertEquals(2, ((int) (((VecInt) (o_testExample3IJCAICedric__7)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testExample3IJCAICedric__7)).isEmpty());
        IConstr o_testExample3IJCAICedric__9 = this.solver.addClause(clause);
        int[] array_2070150263 = new int[]{4,6,14};
        	int[] array_413741129 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3IJCAICedric__9).getLits();
        	for(int ii = 0; ii <array_2070150263.length; ii++) {
        		org.junit.Assert.assertEquals(array_2070150263[ii], array_413741129[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testExample3IJCAICedric__9)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalWLClause) (o_testExample3IJCAICedric__9)).isSatisfied());
        Assert.assertEquals("2[?] 3[?] 7[?] ", ((OriginalWLClause) (o_testExample3IJCAICedric__9)).toString());
        Assert.assertEquals(8, ((int) (((OriginalWLClause) (o_testExample3IJCAICedric__9)).hashCode())));
        clause.clear();
        IVecInt o_testExample3IJCAICedric__11 = clause.push(1).push(2);
        Assert.assertEquals("1,2", ((VecInt) (o_testExample3IJCAICedric__11)).toString());
        Assert.assertEquals(1, ((int) (((VecInt) (o_testExample3IJCAICedric__11)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testExample3IJCAICedric__11)).isEmpty());
        IConstr o_testExample3IJCAICedric__13 = this.solver.addClause(clause);
        int[] array_828986944 = new int[]{2,4,16};
        	int[] array_1912522041 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3IJCAICedric__13).getLits();
        	for(int ii = 0; ii <array_828986944.length; ii++) {
        		org.junit.Assert.assertEquals(array_828986944[ii], array_1912522041[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testExample3IJCAICedric__13)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalWLClause) (o_testExample3IJCAICedric__13)).isSatisfied());
        Assert.assertEquals("1[?] 2[?] 8[?] ", ((OriginalWLClause) (o_testExample3IJCAICedric__13)).toString());
        Assert.assertEquals(7, ((int) (((OriginalWLClause) (o_testExample3IJCAICedric__13)).hashCode())));
        clause.clear();
        IVecInt o_testExample3IJCAICedric__15 = clause.push(1).push((-3));
        Assert.assertEquals("1,-3", ((VecInt) (o_testExample3IJCAICedric__15)).toString());
        Assert.assertEquals(-1, ((int) (((VecInt) (o_testExample3IJCAICedric__15)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testExample3IJCAICedric__15)).isEmpty());
        IConstr o_testExample3IJCAICedric__18 = this.solver.addClause(clause);
        int[] array_976010804 = new int[]{2,7,18};
        	int[] array_1323661043 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3IJCAICedric__18).getLits();
        	for(int ii = 0; ii <array_976010804.length; ii++) {
        		org.junit.Assert.assertEquals(array_976010804[ii], array_1323661043[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testExample3IJCAICedric__18)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalWLClause) (o_testExample3IJCAICedric__18)).isSatisfied());
        Assert.assertEquals("1[?] -3[?] 9[?] ", ((OriginalWLClause) (o_testExample3IJCAICedric__18)).toString());
        Assert.assertEquals(9, ((int) (((OriginalWLClause) (o_testExample3IJCAICedric__18)).hashCode())));
        clause.clear();
        IVecInt o_testExample3IJCAICedric__20 = clause.push((-2)).push((-5));
        Assert.assertEquals("-2,-5", ((VecInt) (o_testExample3IJCAICedric__20)).toString());
        Assert.assertEquals(-3, ((int) (((VecInt) (o_testExample3IJCAICedric__20)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testExample3IJCAICedric__20)).isEmpty());
        IConstr o_testExample3IJCAICedric__24 = this.solver.addClause(clause);
        int[] array_1513180531 = new int[]{5,11,20};
        	int[] array_1663272577 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3IJCAICedric__24).getLits();
        	for(int ii = 0; ii <array_1513180531.length; ii++) {
        		org.junit.Assert.assertEquals(array_1513180531[ii], array_1663272577[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testExample3IJCAICedric__24)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalWLClause) (o_testExample3IJCAICedric__24)).isSatisfied());
        Assert.assertEquals("-2[?] -5[?] 10[?] ", ((OriginalWLClause) (o_testExample3IJCAICedric__24)).toString());
        Assert.assertEquals(12, ((int) (((OriginalWLClause) (o_testExample3IJCAICedric__24)).hashCode())));
        clause.clear();
        IVecInt o_testExample3IJCAICedric__26 = clause.push((-1)).push((-2));
        Assert.assertEquals("-1,-2", ((VecInt) (o_testExample3IJCAICedric__26)).toString());
        Assert.assertEquals(-1, ((int) (((VecInt) (o_testExample3IJCAICedric__26)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testExample3IJCAICedric__26)).isEmpty());
        IConstr o_testExample3IJCAICedric__30 = this.solver.addClause(clause);
        int[] array_1818680526 = new int[]{3,5,22};
        	int[] array_459488428 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3IJCAICedric__30).getLits();
        	for(int ii = 0; ii <array_1818680526.length; ii++) {
        		org.junit.Assert.assertEquals(array_1818680526[ii], array_459488428[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testExample3IJCAICedric__30)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalWLClause) (o_testExample3IJCAICedric__30)).isSatisfied());
        Assert.assertEquals("-1[?] -2[?] 11[?] ", ((OriginalWLClause) (o_testExample3IJCAICedric__30)).toString());
        Assert.assertEquals(10, ((int) (((OriginalWLClause) (o_testExample3IJCAICedric__30)).hashCode())));
        clause.clear();
        IVecInt o_testExample3IJCAICedric__32 = clause.push(1).push(5);
        Assert.assertEquals("1,5", ((VecInt) (o_testExample3IJCAICedric__32)).toString());
        Assert.assertEquals(3, ((int) (((VecInt) (o_testExample3IJCAICedric__32)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testExample3IJCAICedric__32)).isEmpty());
        IConstr o_testExample3IJCAICedric__34 = this.solver.addClause(clause);
        int[] array_341077786 = new int[]{2,10,24};
        	int[] array_1310757609 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3IJCAICedric__34).getLits();
        	for(int ii = 0; ii <array_341077786.length; ii++) {
        		org.junit.Assert.assertEquals(array_341077786[ii], array_1310757609[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testExample3IJCAICedric__34)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalWLClause) (o_testExample3IJCAICedric__34)).isSatisfied());
        Assert.assertEquals("1[?] 5[?] 12[?] ", ((OriginalWLClause) (o_testExample3IJCAICedric__34)).toString());
        Assert.assertEquals(12, ((int) (((OriginalWLClause) (o_testExample3IJCAICedric__34)).hashCode())));
        clause.clear();
        IVecInt o_testExample3IJCAICedric__36 = clause.push((-1)).push((-5));
        Assert.assertEquals("-1,-5", ((VecInt) (o_testExample3IJCAICedric__36)).toString());
        Assert.assertEquals(-3, ((int) (((VecInt) (o_testExample3IJCAICedric__36)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testExample3IJCAICedric__36)).isEmpty());
        IConstr o_testExample3IJCAICedric__40 = this.solver.addClause(clause);
        int[] array_2097597516 = new int[]{3,11,26};
        	int[] array_998001196 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3IJCAICedric__40).getLits();
        	for(int ii = 0; ii <array_2097597516.length; ii++) {
        		org.junit.Assert.assertEquals(array_2097597516[ii], array_998001196[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testExample3IJCAICedric__40)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalWLClause) (o_testExample3IJCAICedric__40)).isSatisfied());
        Assert.assertEquals("-1[?] -5[?] 13[?] ", ((OriginalWLClause) (o_testExample3IJCAICedric__40)).toString());
        Assert.assertEquals(13, ((int) (((OriginalWLClause) (o_testExample3IJCAICedric__40)).hashCode())));
        clause.clear();
        IVecInt o_testExample3IJCAICedric__42 = clause.push(2).push(5);
        Assert.assertEquals("2,5", ((VecInt) (o_testExample3IJCAICedric__42)).toString());
        Assert.assertEquals(3, ((int) (((VecInt) (o_testExample3IJCAICedric__42)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testExample3IJCAICedric__42)).isEmpty());
        IConstr o_testExample3IJCAICedric__44 = this.solver.addClause(clause);
        int[] array_1974847519 = new int[]{4,10,28};
        	int[] array_1269076980 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3IJCAICedric__44).getLits();
        	for(int ii = 0; ii <array_1974847519.length; ii++) {
        		org.junit.Assert.assertEquals(array_1974847519[ii], array_1269076980[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testExample3IJCAICedric__44)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalWLClause) (o_testExample3IJCAICedric__44)).isSatisfied());
        Assert.assertEquals("2[?] 5[?] 14[?] ", ((OriginalWLClause) (o_testExample3IJCAICedric__44)).toString());
        Assert.assertEquals(14, ((int) (((OriginalWLClause) (o_testExample3IJCAICedric__44)).hashCode())));
        clause.clear();
        IVecInt o_testExample3IJCAICedric__46 = clause.push((-1)).push(2).push((-3));
        Assert.assertEquals("-1,2,-3", ((VecInt) (o_testExample3IJCAICedric__46)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_testExample3IJCAICedric__46)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testExample3IJCAICedric__46)).isEmpty());
        IConstr o_testExample3IJCAICedric__51 = this.solver.addClause(clause);
        int[] array_1474125218 = new int[]{3,4,7,30};
        	int[] array_95853501 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3IJCAICedric__51).getLits();
        	for(int ii = 0; ii <array_1474125218.length; ii++) {
        		org.junit.Assert.assertEquals(array_1474125218[ii], array_95853501[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testExample3IJCAICedric__51)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalWLClause) (o_testExample3IJCAICedric__51)).isSatisfied());
        Assert.assertEquals("-1[?] 2[?] -3[?] 15[?] ", ((OriginalWLClause) (o_testExample3IJCAICedric__51)).toString());
        Assert.assertEquals(11, ((int) (((OriginalWLClause) (o_testExample3IJCAICedric__51)).hashCode())));
        clause.clear();
        IVecInt o_testExample3IJCAICedric__53 = clause.push((-1)).push(2).push((-4));
        Assert.assertEquals("-1,2,-4", ((VecInt) (o_testExample3IJCAICedric__53)).toString());
        Assert.assertEquals(-1, ((int) (((VecInt) (o_testExample3IJCAICedric__53)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testExample3IJCAICedric__53)).isEmpty());
        IConstr o_testExample3IJCAICedric__58 = this.solver.addClause(clause);
        int[] array_1277165973 = new int[]{3,4,9,32};
        	int[] array_1528156635 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3IJCAICedric__58).getLits();
        	for(int ii = 0; ii <array_1277165973.length; ii++) {
        		org.junit.Assert.assertEquals(array_1277165973[ii], array_1528156635[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testExample3IJCAICedric__58)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalWLClause) (o_testExample3IJCAICedric__58)).isSatisfied());
        Assert.assertEquals("-1[?] 2[?] -4[?] 16[?] ", ((OriginalWLClause) (o_testExample3IJCAICedric__58)).toString());
        Assert.assertEquals(12, ((int) (((OriginalWLClause) (o_testExample3IJCAICedric__58)).hashCode())));
        clause.clear();
        IVecInt o_testExample3IJCAICedric__60 = clause.push(1).push((-2)).push(3);
        Assert.assertEquals("1,-2,3", ((VecInt) (o_testExample3IJCAICedric__60)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_testExample3IJCAICedric__60)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testExample3IJCAICedric__60)).isEmpty());
        IConstr o_testExample3IJCAICedric__64 = this.solver.addClause(clause);
        int[] array_1595884080 = new int[]{2,5,6,34};
        	int[] array_821054638 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3IJCAICedric__64).getLits();
        	for(int ii = 0; ii <array_1595884080.length; ii++) {
        		org.junit.Assert.assertEquals(array_1595884080[ii], array_821054638[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testExample3IJCAICedric__64)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalWLClause) (o_testExample3IJCAICedric__64)).isSatisfied());
        Assert.assertEquals("1[?] -2[?] 3[?] 17[?] ", ((OriginalWLClause) (o_testExample3IJCAICedric__64)).toString());
        Assert.assertEquals(11, ((int) (((OriginalWLClause) (o_testExample3IJCAICedric__64)).hashCode())));
        clause.clear();
        IVecInt o_testExample3IJCAICedric__66 = clause.push(1).push((-2)).push((-4));
        Assert.assertEquals("1,-2,-4", ((VecInt) (o_testExample3IJCAICedric__66)).toString());
        Assert.assertEquals(-1, ((int) (((VecInt) (o_testExample3IJCAICedric__66)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testExample3IJCAICedric__66)).isEmpty());
        IConstr o_testExample3IJCAICedric__71 = this.solver.addClause(clause);
        int[] array_1334856907 = new int[]{2,5,9,36};
        	int[] array_1160956515 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3IJCAICedric__71).getLits();
        	for(int ii = 0; ii <array_1334856907.length; ii++) {
        		org.junit.Assert.assertEquals(array_1334856907[ii], array_1160956515[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testExample3IJCAICedric__71)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalWLClause) (o_testExample3IJCAICedric__71)).isSatisfied());
        Assert.assertEquals("1[?] -2[?] -4[?] 18[?] ", ((OriginalWLClause) (o_testExample3IJCAICedric__71)).toString());
        Assert.assertEquals(13, ((int) (((OriginalWLClause) (o_testExample3IJCAICedric__71)).hashCode())));
        clause.clear();
        List<IVecInt> muses = allMUSes.computeAllMUSes();
        int o_testExample3IJCAICedric__75 = muses.size();
        Assert.assertEquals(17, ((int) (o_testExample3IJCAICedric__75)));
        Assert.assertEquals(5, ((int) (o_testExample3IJCAICedric__1)));
        Assert.assertEquals("", ((VecInt) (o_testExample3IJCAICedric__4)).toString());
        Assert.assertTrue(((VecInt) (o_testExample3IJCAICedric__4)).isEmpty());
        int[] array_338994308 = new int[]{8,12};
        	int[] array_905339313 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testExample3IJCAICedric__5).getLits();
        	for(int ii = 0; ii <array_338994308.length; ii++) {
        		org.junit.Assert.assertEquals(array_338994308[ii], array_905339313[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testExample3IJCAICedric__5)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalBinaryClause) (o_testExample3IJCAICedric__5)).isSatisfied());
        Assert.assertEquals("4[?] 6[?]", ((OriginalBinaryClause) (o_testExample3IJCAICedric__5)).toString());
        Assert.assertEquals(10, ((int) (((OriginalBinaryClause) (o_testExample3IJCAICedric__5)).hashCode())));
        Assert.assertEquals("", ((VecInt) (o_testExample3IJCAICedric__7)).toString());
        Assert.assertTrue(((VecInt) (o_testExample3IJCAICedric__7)).isEmpty());
        int[] array_1437849653 = new int[]{6,14,4};
        	int[] array_445612720 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3IJCAICedric__9).getLits();
        	for(int ii = 0; ii <array_1437849653.length; ii++) {
        		org.junit.Assert.assertEquals(array_1437849653[ii], array_445612720[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testExample3IJCAICedric__9)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalWLClause) (o_testExample3IJCAICedric__9)).isSatisfied());
        Assert.assertEquals("3[?] 7[?] 2[?] ", ((OriginalWLClause) (o_testExample3IJCAICedric__9)).toString());
        Assert.assertEquals(8, ((int) (((OriginalWLClause) (o_testExample3IJCAICedric__9)).hashCode())));
        Assert.assertEquals("", ((VecInt) (o_testExample3IJCAICedric__11)).toString());
        Assert.assertTrue(((VecInt) (o_testExample3IJCAICedric__11)).isEmpty());
        int[] array_721015330 = new int[]{2,4,16};
        	int[] array_515354821 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3IJCAICedric__13).getLits();
        	for(int ii = 0; ii <array_721015330.length; ii++) {
        		org.junit.Assert.assertEquals(array_721015330[ii], array_515354821[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testExample3IJCAICedric__13)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalWLClause) (o_testExample3IJCAICedric__13)).isSatisfied());
        Assert.assertEquals("1[?] 2[?] 8[?] ", ((OriginalWLClause) (o_testExample3IJCAICedric__13)).toString());
        Assert.assertEquals(7, ((int) (((OriginalWLClause) (o_testExample3IJCAICedric__13)).hashCode())));
        Assert.assertEquals("", ((VecInt) (o_testExample3IJCAICedric__15)).toString());
        Assert.assertTrue(((VecInt) (o_testExample3IJCAICedric__15)).isEmpty());
        int[] array_823452500 = new int[]{2,7,18};
        	int[] array_2146767871 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3IJCAICedric__18).getLits();
        	for(int ii = 0; ii <array_823452500.length; ii++) {
        		org.junit.Assert.assertEquals(array_823452500[ii], array_2146767871[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testExample3IJCAICedric__18)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalWLClause) (o_testExample3IJCAICedric__18)).isSatisfied());
        Assert.assertEquals("1[?] -3[?] 9[?] ", ((OriginalWLClause) (o_testExample3IJCAICedric__18)).toString());
        Assert.assertEquals(9, ((int) (((OriginalWLClause) (o_testExample3IJCAICedric__18)).hashCode())));
        Assert.assertEquals("", ((VecInt) (o_testExample3IJCAICedric__20)).toString());
        Assert.assertTrue(((VecInt) (o_testExample3IJCAICedric__20)).isEmpty());
        int[] array_2020530168 = new int[]{5,11,20};
        	int[] array_269581368 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3IJCAICedric__24).getLits();
        	for(int ii = 0; ii <array_2020530168.length; ii++) {
        		org.junit.Assert.assertEquals(array_2020530168[ii], array_269581368[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testExample3IJCAICedric__24)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalWLClause) (o_testExample3IJCAICedric__24)).isSatisfied());
        Assert.assertEquals("-2[?] -5[?] 10[?] ", ((OriginalWLClause) (o_testExample3IJCAICedric__24)).toString());
        Assert.assertEquals(12, ((int) (((OriginalWLClause) (o_testExample3IJCAICedric__24)).hashCode())));
        Assert.assertEquals("", ((VecInt) (o_testExample3IJCAICedric__26)).toString());
        Assert.assertTrue(((VecInt) (o_testExample3IJCAICedric__26)).isEmpty());
        int[] array_2104148478 = new int[]{5,22,3};
        	int[] array_908264772 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3IJCAICedric__30).getLits();
        	for(int ii = 0; ii <array_2104148478.length; ii++) {
        		org.junit.Assert.assertEquals(array_2104148478[ii], array_908264772[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testExample3IJCAICedric__30)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalWLClause) (o_testExample3IJCAICedric__30)).isSatisfied());
        Assert.assertEquals("-2[?] 11[F] -1[?] ", ((OriginalWLClause) (o_testExample3IJCAICedric__30)).toString());
        Assert.assertEquals(10, ((int) (((OriginalWLClause) (o_testExample3IJCAICedric__30)).hashCode())));
        Assert.assertEquals("", ((VecInt) (o_testExample3IJCAICedric__32)).toString());
        Assert.assertTrue(((VecInt) (o_testExample3IJCAICedric__32)).isEmpty());
        int[] array_771602901 = new int[]{2,10,24};
        	int[] array_377294912 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3IJCAICedric__34).getLits();
        	for(int ii = 0; ii <array_771602901.length; ii++) {
        		org.junit.Assert.assertEquals(array_771602901[ii], array_377294912[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testExample3IJCAICedric__34)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalWLClause) (o_testExample3IJCAICedric__34)).isSatisfied());
        Assert.assertEquals("1[?] 5[?] 12[?] ", ((OriginalWLClause) (o_testExample3IJCAICedric__34)).toString());
        Assert.assertEquals(12, ((int) (((OriginalWLClause) (o_testExample3IJCAICedric__34)).hashCode())));
        Assert.assertEquals("", ((VecInt) (o_testExample3IJCAICedric__36)).toString());
        Assert.assertTrue(((VecInt) (o_testExample3IJCAICedric__36)).isEmpty());
        int[] array_104917262 = new int[]{26,11,3};
        	int[] array_2070404094 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3IJCAICedric__40).getLits();
        	for(int ii = 0; ii <array_104917262.length; ii++) {
        		org.junit.Assert.assertEquals(array_104917262[ii], array_2070404094[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testExample3IJCAICedric__40)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalWLClause) (o_testExample3IJCAICedric__40)).isSatisfied());
        Assert.assertEquals("13[?] -5[?] -1[?] ", ((OriginalWLClause) (o_testExample3IJCAICedric__40)).toString());
        Assert.assertEquals(13, ((int) (((OriginalWLClause) (o_testExample3IJCAICedric__40)).hashCode())));
        Assert.assertEquals("", ((VecInt) (o_testExample3IJCAICedric__42)).toString());
        Assert.assertTrue(((VecInt) (o_testExample3IJCAICedric__42)).isEmpty());
        int[] array_274424739 = new int[]{10,28,4};
        	int[] array_2121386503 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3IJCAICedric__44).getLits();
        	for(int ii = 0; ii <array_274424739.length; ii++) {
        		org.junit.Assert.assertEquals(array_274424739[ii], array_2121386503[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testExample3IJCAICedric__44)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalWLClause) (o_testExample3IJCAICedric__44)).isSatisfied());
        Assert.assertEquals("5[?] 14[?] 2[?] ", ((OriginalWLClause) (o_testExample3IJCAICedric__44)).toString());
        Assert.assertEquals(14, ((int) (((OriginalWLClause) (o_testExample3IJCAICedric__44)).hashCode())));
        Assert.assertEquals("", ((VecInt) (o_testExample3IJCAICedric__46)).toString());
        Assert.assertTrue(((VecInt) (o_testExample3IJCAICedric__46)).isEmpty());
        int[] array_1011985419 = new int[]{30,7,4,3};
        	int[] array_1520976945 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3IJCAICedric__51).getLits();
        	for(int ii = 0; ii <array_1011985419.length; ii++) {
        		org.junit.Assert.assertEquals(array_1011985419[ii], array_1520976945[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testExample3IJCAICedric__51)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalWLClause) (o_testExample3IJCAICedric__51)).isSatisfied());
        Assert.assertEquals("15[?] -3[?] 2[?] -1[?] ", ((OriginalWLClause) (o_testExample3IJCAICedric__51)).toString());
        Assert.assertEquals(11, ((int) (((OriginalWLClause) (o_testExample3IJCAICedric__51)).hashCode())));
        Assert.assertEquals("", ((VecInt) (o_testExample3IJCAICedric__53)).toString());
        Assert.assertTrue(((VecInt) (o_testExample3IJCAICedric__53)).isEmpty());
        int[] array_1672987406 = new int[]{32,9,4,3};
        	int[] array_960178132 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3IJCAICedric__58).getLits();
        	for(int ii = 0; ii <array_1672987406.length; ii++) {
        		org.junit.Assert.assertEquals(array_1672987406[ii], array_960178132[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testExample3IJCAICedric__58)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalWLClause) (o_testExample3IJCAICedric__58)).isSatisfied());
        Assert.assertEquals("16[?] -4[?] 2[?] -1[?] ", ((OriginalWLClause) (o_testExample3IJCAICedric__58)).toString());
        Assert.assertEquals(12, ((int) (((OriginalWLClause) (o_testExample3IJCAICedric__58)).hashCode())));
        Assert.assertEquals("", ((VecInt) (o_testExample3IJCAICedric__60)).toString());
        Assert.assertTrue(((VecInt) (o_testExample3IJCAICedric__60)).isEmpty());
        int[] array_1131787365 = new int[]{2,6,34,5};
        	int[] array_1240554721 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3IJCAICedric__64).getLits();
        	for(int ii = 0; ii <array_1131787365.length; ii++) {
        		org.junit.Assert.assertEquals(array_1131787365[ii], array_1240554721[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testExample3IJCAICedric__64)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalWLClause) (o_testExample3IJCAICedric__64)).isSatisfied());
        Assert.assertEquals("1[?] 3[?] 17[?] -2[?] ", ((OriginalWLClause) (o_testExample3IJCAICedric__64)).toString());
        Assert.assertEquals(11, ((int) (((OriginalWLClause) (o_testExample3IJCAICedric__64)).hashCode())));
        Assert.assertEquals("", ((VecInt) (o_testExample3IJCAICedric__66)).toString());
        Assert.assertTrue(((VecInt) (o_testExample3IJCAICedric__66)).isEmpty());
        int[] array_1148018720 = new int[]{2,36,5,9};
        	int[] array_1063632618 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testExample3IJCAICedric__71).getLits();
        	for(int ii = 0; ii <array_1148018720.length; ii++) {
        		org.junit.Assert.assertEquals(array_1148018720[ii], array_1063632618[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testExample3IJCAICedric__71)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalWLClause) (o_testExample3IJCAICedric__71)).isSatisfied());
        Assert.assertEquals("1[?] 18[?] -2[?] -4[?] ", ((OriginalWLClause) (o_testExample3IJCAICedric__71)).toString());
        Assert.assertEquals(13, ((int) (((OriginalWLClause) (o_testExample3IJCAICedric__71)).hashCode())));
    }
}

