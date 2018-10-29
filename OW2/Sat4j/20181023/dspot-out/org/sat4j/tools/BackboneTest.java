package org.sat4j.tools;


import org.junit.Assert;
import org.junit.Test;
import org.sat4j.core.VecInt;
import org.sat4j.minisat.SolverFactory;
import org.sat4j.minisat.constraints.cnf.OriginalBinaryClause;
import org.sat4j.minisat.constraints.cnf.OriginalWLClause;
import org.sat4j.minisat.constraints.cnf.UnitClause;
import org.sat4j.specs.ContradictionException;
import org.sat4j.specs.IConstr;
import org.sat4j.specs.ISolver;
import org.sat4j.specs.IVecInt;
import org.sat4j.specs.TimeoutException;


public class BackboneTest {
    @Test(timeout = 10000)
    public void testEmptyBackbone() throws Exception, ContradictionException, TimeoutException {
        ISolver solver = SolverFactory.newDefault();
        IVecInt clause = new VecInt();
        IVecInt o_testEmptyBackbone__5 = clause.push(1).push(2).push(3);
        Assert.assertEquals("1,2,3", ((VecInt) (o_testEmptyBackbone__5)).toString());
        Assert.assertEquals(2, ((int) (((VecInt) (o_testEmptyBackbone__5)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testEmptyBackbone__5)).isEmpty());
        IConstr o_testEmptyBackbone__8 = solver.addClause(clause);
        Assert.assertFalse(((OriginalWLClause) (o_testEmptyBackbone__8)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testEmptyBackbone__8)).getActivity())), 0.1);
        int[] array_1882063694 = new int[]{2,4,6};
        	int[] array_901263046 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testEmptyBackbone__8).getLits();
        	for(int ii = 0; ii <array_1882063694.length; ii++) {
        		org.junit.Assert.assertEquals(array_1882063694[ii], array_901263046[ii]);
        	};
        Assert.assertEquals("1[?] 2[?] 3[?] ", ((OriginalWLClause) (o_testEmptyBackbone__8)).toString());
        Assert.assertEquals(4, ((int) (((OriginalWLClause) (o_testEmptyBackbone__8)).hashCode())));
        clause.clear();
        IVecInt o_testEmptyBackbone__10 = clause.push((-1)).push((-2));
        Assert.assertEquals("-1,-2", ((VecInt) (o_testEmptyBackbone__10)).toString());
        Assert.assertEquals(-1, ((int) (((VecInt) (o_testEmptyBackbone__10)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testEmptyBackbone__10)).isEmpty());
        IConstr o_testEmptyBackbone__14 = solver.addClause(clause);
        Assert.assertFalse(((OriginalBinaryClause) (o_testEmptyBackbone__14)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testEmptyBackbone__14)).getActivity())), 0.1);
        int[] array_1825005533 = new int[]{3,5};
        	int[] array_927971380 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testEmptyBackbone__14).getLits();
        	for(int ii = 0; ii <array_1825005533.length; ii++) {
        		org.junit.Assert.assertEquals(array_1825005533[ii], array_927971380[ii]);
        	};
        Assert.assertEquals("-1[?] -2[?]", ((OriginalBinaryClause) (o_testEmptyBackbone__14)).toString());
        Assert.assertEquals(4, ((int) (((OriginalBinaryClause) (o_testEmptyBackbone__14)).hashCode())));
        clause.clear();
        IVecInt o_testEmptyBackbone__16 = clause.push((-1)).push((-3));
        Assert.assertEquals("-1,-3", ((VecInt) (o_testEmptyBackbone__16)).toString());
        Assert.assertEquals(-2, ((int) (((VecInt) (o_testEmptyBackbone__16)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testEmptyBackbone__16)).isEmpty());
        IConstr o_testEmptyBackbone__20 = solver.addClause(clause);
        Assert.assertFalse(((OriginalBinaryClause) (o_testEmptyBackbone__20)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testEmptyBackbone__20)).getActivity())), 0.1);
        int[] array_340637712 = new int[]{3,7};
        	int[] array_2028163065 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testEmptyBackbone__20).getLits();
        	for(int ii = 0; ii <array_340637712.length; ii++) {
        		org.junit.Assert.assertEquals(array_340637712[ii], array_2028163065[ii]);
        	};
        Assert.assertEquals("-1[?] -3[?]", ((OriginalBinaryClause) (o_testEmptyBackbone__20)).toString());
        Assert.assertEquals(5, ((int) (((OriginalBinaryClause) (o_testEmptyBackbone__20)).hashCode())));
        clause.clear();
        IVecInt backbone = Backbone.instance().compute(solver);
        int o_testEmptyBackbone__25 = backbone.size();
        Assert.assertEquals(0, ((int) (o_testEmptyBackbone__25)));
        Assert.assertEquals("", ((VecInt) (o_testEmptyBackbone__5)).toString());
        Assert.assertTrue(((VecInt) (o_testEmptyBackbone__5)).isEmpty());
        Assert.assertFalse(((OriginalWLClause) (o_testEmptyBackbone__8)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testEmptyBackbone__8)).getActivity())), 0.1);
        int[] array_194402919 = new int[]{2,6,4};
        	int[] array_2024550689 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testEmptyBackbone__8).getLits();
        	for(int ii = 0; ii <array_194402919.length; ii++) {
        		org.junit.Assert.assertEquals(array_194402919[ii], array_2024550689[ii]);
        	};
        Assert.assertEquals("1[?] 3[?] 2[?] ", ((OriginalWLClause) (o_testEmptyBackbone__8)).toString());
        Assert.assertEquals(4, ((int) (((OriginalWLClause) (o_testEmptyBackbone__8)).hashCode())));
        Assert.assertEquals("", ((VecInt) (o_testEmptyBackbone__10)).toString());
        Assert.assertTrue(((VecInt) (o_testEmptyBackbone__10)).isEmpty());
        Assert.assertFalse(((OriginalBinaryClause) (o_testEmptyBackbone__14)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testEmptyBackbone__14)).getActivity())), 0.1);
        int[] array_1775383297 = new int[]{3,5};
        	int[] array_1318706812 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testEmptyBackbone__14).getLits();
        	for(int ii = 0; ii <array_1775383297.length; ii++) {
        		org.junit.Assert.assertEquals(array_1775383297[ii], array_1318706812[ii]);
        	};
        Assert.assertEquals("-1[?] -2[?]", ((OriginalBinaryClause) (o_testEmptyBackbone__14)).toString());
        Assert.assertEquals(4, ((int) (((OriginalBinaryClause) (o_testEmptyBackbone__14)).hashCode())));
        Assert.assertEquals("", ((VecInt) (o_testEmptyBackbone__16)).toString());
        Assert.assertTrue(((VecInt) (o_testEmptyBackbone__16)).isEmpty());
        Assert.assertFalse(((OriginalBinaryClause) (o_testEmptyBackbone__20)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testEmptyBackbone__20)).getActivity())), 0.1);
        int[] array_823822799 = new int[]{3,7};
        	int[] array_2137733469 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testEmptyBackbone__20).getLits();
        	for(int ii = 0; ii <array_823822799.length; ii++) {
        		org.junit.Assert.assertEquals(array_823822799[ii], array_2137733469[ii]);
        	};
        Assert.assertEquals("-1[?] -3[?]", ((OriginalBinaryClause) (o_testEmptyBackbone__20)).toString());
        Assert.assertEquals(5, ((int) (((OriginalBinaryClause) (o_testEmptyBackbone__20)).hashCode())));
    }

    @Test(timeout = 10000)
    public void testCaseWithUnsatProblem_failAssert0() throws Exception, ContradictionException, TimeoutException {
        try {
            ISolver solver = SolverFactory.newDefault();
            IVecInt clause = new VecInt();
            clause.push(1).push(2);
            solver.addClause(clause);
            clause.clear();
            clause.push((-1)).push(2);
            solver.addClause(clause);
            clause.clear();
            clause.push(1).push((-2));
            solver.addClause(clause);
            clause.clear();
            clause.push((-1)).push((-2));
            solver.addClause(clause);
            clause.clear();
            IVecInt backbone = Backbone.instance().compute(solver);
            org.junit.Assert.fail("testCaseWithUnsatProblem should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("Formula is UNSAT!", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testBugUnitClauses() throws Exception, ContradictionException, TimeoutException {
        ISolver solver1 = SolverFactory.newDefault();
        ISolver solver2 = SolverFactory.newDefault();
        ISolver solver3 = SolverFactory.newDefault();
        int[][] cnf1 = new int[][]{ new int[]{ 1 }, new int[]{ 1, -2 }, new int[]{ 1, -3 }, new int[]{ -1, 2 } };
        int[][] cnf2 = new int[][]{ new int[]{ -1, 2 }, new int[]{ 1, -2 }, new int[]{ 1, -3 }, new int[]{ 1 } };
        int[][] cnf3 = new int[][]{ new int[]{ 1, -2 }, new int[]{ -1, 3 }, new int[]{ 1, -3 }, new int[]{ 1 } };
        for (int[] is : cnf1) {
            solver1.addClause(new VecInt(is));
        }
        for (int[] is : cnf2) {
            solver2.addClause(new VecInt(is));
        }
        for (int[] is : cnf3) {
            solver3.addClause(new VecInt(is));
        }
        IVecInt vecInt1 = Backbone.instance().compute(solver1);
        int o_testBugUnitClauses__43 = vecInt1.size();
        Assert.assertEquals(2, ((int) (o_testBugUnitClauses__43)));
        boolean o_testBugUnitClauses__44 = vecInt1.contains(1);
        Assert.assertTrue(o_testBugUnitClauses__44);
        boolean o_testBugUnitClauses__45 = vecInt1.contains(2);
        Assert.assertTrue(o_testBugUnitClauses__45);
        IVecInt vecInt2 = Backbone.instance().compute(solver2);
        int o_testBugUnitClauses__49 = vecInt2.size();
        Assert.assertEquals(2, ((int) (o_testBugUnitClauses__49)));
        boolean o_testBugUnitClauses__50 = vecInt2.contains(1);
        Assert.assertTrue(o_testBugUnitClauses__50);
        boolean o_testBugUnitClauses__51 = vecInt2.contains(2);
        Assert.assertTrue(o_testBugUnitClauses__51);
        IVecInt vecInt3 = Backbone.instance().compute(solver3);
        int o_testBugUnitClauses__55 = vecInt3.size();
        Assert.assertEquals(2, ((int) (o_testBugUnitClauses__55)));
        boolean o_testBugUnitClauses__56 = vecInt3.contains(1);
        Assert.assertTrue(o_testBugUnitClauses__56);
        boolean o_testBugUnitClauses__57 = vecInt3.contains(3);
        Assert.assertTrue(o_testBugUnitClauses__57);
        Assert.assertEquals(2, ((int) (o_testBugUnitClauses__43)));
        Assert.assertTrue(o_testBugUnitClauses__44);
        Assert.assertTrue(o_testBugUnitClauses__45);
        Assert.assertEquals(2, ((int) (o_testBugUnitClauses__49)));
        Assert.assertTrue(o_testBugUnitClauses__50);
        Assert.assertTrue(o_testBugUnitClauses__51);
        Assert.assertEquals(2, ((int) (o_testBugUnitClauses__55)));
        Assert.assertTrue(o_testBugUnitClauses__56);
    }

    @Test(timeout = 10000)
    public void testFilter() throws Exception, ContradictionException, TimeoutException {
        ISolver solver = SolverFactory.newDefault();
        IVecInt clause = new VecInt();
        IVecInt o_testFilter__5 = clause.push(1).push(2).push(3);
        Assert.assertEquals("1,2,3", ((VecInt) (o_testFilter__5)).toString());
        Assert.assertEquals(2, ((int) (((VecInt) (o_testFilter__5)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testFilter__5)).isEmpty());
        IConstr o_testFilter__8 = solver.addClause(clause);
        Assert.assertFalse(((OriginalWLClause) (o_testFilter__8)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testFilter__8)).getActivity())), 0.1);
        int[] array_376272347 = new int[]{2,4,6};
        	int[] array_2013800860 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testFilter__8).getLits();
        	for(int ii = 0; ii <array_376272347.length; ii++) {
        		org.junit.Assert.assertEquals(array_376272347[ii], array_2013800860[ii]);
        	};
        Assert.assertEquals("1[?] 2[?] 3[?] ", ((OriginalWLClause) (o_testFilter__8)).toString());
        Assert.assertEquals(4, ((int) (((OriginalWLClause) (o_testFilter__8)).hashCode())));
        clause.clear();
        IVecInt o_testFilter__10 = clause.push((-1)).push(2).push(3);
        Assert.assertEquals("-1,2,3", ((VecInt) (o_testFilter__10)).toString());
        Assert.assertEquals(1, ((int) (((VecInt) (o_testFilter__10)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testFilter__10)).isEmpty());
        IConstr o_testFilter__14 = solver.addClause(clause);
        Assert.assertFalse(((OriginalWLClause) (o_testFilter__14)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testFilter__14)).getActivity())), 0.1);
        int[] array_459256098 = new int[]{3,4,6};
        	int[] array_1110374170 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testFilter__14).getLits();
        	for(int ii = 0; ii <array_459256098.length; ii++) {
        		org.junit.Assert.assertEquals(array_459256098[ii], array_1110374170[ii]);
        	};
        Assert.assertEquals("-1[?] 2[?] 3[?] ", ((OriginalWLClause) (o_testFilter__14)).toString());
        Assert.assertEquals(4, ((int) (((OriginalWLClause) (o_testFilter__14)).hashCode())));
        clause.clear();
        IVecInt o_testFilter__16 = clause.push(1).push((-2));
        Assert.assertEquals("1,-2", ((VecInt) (o_testFilter__16)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_testFilter__16)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testFilter__16)).isEmpty());
        IConstr o_testFilter__19 = solver.addClause(clause);
        Assert.assertFalse(((OriginalBinaryClause) (o_testFilter__19)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testFilter__19)).getActivity())), 0.1);
        int[] array_2035717878 = new int[]{2,5};
        	int[] array_2069531944 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testFilter__19).getLits();
        	for(int ii = 0; ii <array_2035717878.length; ii++) {
        		org.junit.Assert.assertEquals(array_2035717878[ii], array_2069531944[ii]);
        	};
        Assert.assertEquals("1[?] -2[?]", ((OriginalBinaryClause) (o_testFilter__19)).toString());
        Assert.assertEquals(3, ((int) (((OriginalBinaryClause) (o_testFilter__19)).hashCode())));
        clause.clear();
        IVecInt o_testFilter__21 = clause.push((-1)).push((-2));
        Assert.assertEquals("-1,-2", ((VecInt) (o_testFilter__21)).toString());
        Assert.assertEquals(-1, ((int) (((VecInt) (o_testFilter__21)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testFilter__21)).isEmpty());
        IConstr o_testFilter__25 = solver.addClause(clause);
        Assert.assertFalse(((OriginalBinaryClause) (o_testFilter__25)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testFilter__25)).getActivity())), 0.1);
        int[] array_1439016066 = new int[]{3,5};
        	int[] array_1867322158 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testFilter__25).getLits();
        	for(int ii = 0; ii <array_1439016066.length; ii++) {
        		org.junit.Assert.assertEquals(array_1439016066[ii], array_1867322158[ii]);
        	};
        Assert.assertEquals("-1[?] -2[?]", ((OriginalBinaryClause) (o_testFilter__25)).toString());
        Assert.assertEquals(4, ((int) (((OriginalBinaryClause) (o_testFilter__25)).hashCode())));
        clause.clear();
        IVecInt filter = new VecInt(new int[]{ 1, 2 });
        IVecInt backbone = Backbone.instance().compute(solver, VecInt.EMPTY, filter);
        int o_testFilter__32 = backbone.size();
        Assert.assertEquals(1, ((int) (o_testFilter__32)));
        boolean o_testFilter__33 = backbone.contains((-2));
        Assert.assertTrue(o_testFilter__33);
        boolean o_testFilter__35 = backbone.contains(3);
        Assert.assertFalse(o_testFilter__35);
        backbone = Backbone.instance().compute(solver);
        int o_testFilter__39 = backbone.size();
        Assert.assertEquals(2, ((int) (o_testFilter__39)));
        boolean o_testFilter__40 = backbone.contains((-2));
        Assert.assertTrue(o_testFilter__40);
        boolean o_testFilter__42 = backbone.contains((-2));
        Assert.assertTrue(o_testFilter__42);
        boolean o_testFilter__44 = backbone.contains(3);
        Assert.assertTrue(o_testFilter__44);
        Assert.assertEquals("", ((VecInt) (o_testFilter__5)).toString());
        Assert.assertTrue(((VecInt) (o_testFilter__5)).isEmpty());
        Assert.assertFalse(((OriginalWLClause) (o_testFilter__8)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testFilter__8)).getActivity())), 0.1);
        int[] array_2076912544 = new int[]{4,2,6};
        	int[] array_1469107799 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testFilter__8).getLits();
        	for(int ii = 0; ii <array_2076912544.length; ii++) {
        		org.junit.Assert.assertEquals(array_2076912544[ii], array_1469107799[ii]);
        	};
        Assert.assertEquals("2[?] 1[?] 3[?] ", ((OriginalWLClause) (o_testFilter__8)).toString());
        Assert.assertEquals(4, ((int) (((OriginalWLClause) (o_testFilter__8)).hashCode())));
        Assert.assertEquals("", ((VecInt) (o_testFilter__10)).toString());
        Assert.assertTrue(((VecInt) (o_testFilter__10)).isEmpty());
        Assert.assertFalse(((OriginalWLClause) (o_testFilter__14)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testFilter__14)).getActivity())), 0.1);
        int[] array_1031401030 = new int[]{4,3,6};
        	int[] array_471243514 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testFilter__14).getLits();
        	for(int ii = 0; ii <array_1031401030.length; ii++) {
        		org.junit.Assert.assertEquals(array_1031401030[ii], array_471243514[ii]);
        	};
        Assert.assertEquals("2[?] -1[?] 3[?] ", ((OriginalWLClause) (o_testFilter__14)).toString());
        Assert.assertEquals(4, ((int) (((OriginalWLClause) (o_testFilter__14)).hashCode())));
        Assert.assertEquals("", ((VecInt) (o_testFilter__16)).toString());
        Assert.assertTrue(((VecInt) (o_testFilter__16)).isEmpty());
        Assert.assertFalse(((OriginalBinaryClause) (o_testFilter__19)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testFilter__19)).getActivity())), 0.1);
        int[] array_974525135 = new int[]{2,5};
        	int[] array_739918547 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testFilter__19).getLits();
        	for(int ii = 0; ii <array_974525135.length; ii++) {
        		org.junit.Assert.assertEquals(array_974525135[ii], array_739918547[ii]);
        	};
        Assert.assertEquals("1[?] -2[?]", ((OriginalBinaryClause) (o_testFilter__19)).toString());
        Assert.assertEquals(3, ((int) (((OriginalBinaryClause) (o_testFilter__19)).hashCode())));
        Assert.assertEquals("", ((VecInt) (o_testFilter__21)).toString());
        Assert.assertTrue(((VecInt) (o_testFilter__21)).isEmpty());
        Assert.assertFalse(((OriginalBinaryClause) (o_testFilter__25)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testFilter__25)).getActivity())), 0.1);
        int[] array_231144324 = new int[]{3,5};
        	int[] array_1281367601 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testFilter__25).getLits();
        	for(int ii = 0; ii <array_231144324.length; ii++) {
        		org.junit.Assert.assertEquals(array_231144324[ii], array_1281367601[ii]);
        	};
        Assert.assertEquals("-1[?] -2[?]", ((OriginalBinaryClause) (o_testFilter__25)).toString());
        Assert.assertEquals(4, ((int) (((OriginalBinaryClause) (o_testFilter__25)).hashCode())));
        Assert.assertEquals(1, ((int) (o_testFilter__32)));
        Assert.assertTrue(o_testFilter__33);
        Assert.assertFalse(o_testFilter__35);
        Assert.assertEquals(2, ((int) (o_testFilter__39)));
        Assert.assertTrue(o_testFilter__40);
        Assert.assertTrue(o_testFilter__42);
    }

    @Test(timeout = 10000)
    public void testBugBr4cp() throws Exception, ContradictionException, TimeoutException {
        ISolver solver = SolverFactory.newDefault();
        IVecInt clause = new VecInt();
        IVecInt o_testBugBr4cp__5 = clause.push(1);
        Assert.assertEquals("1", ((VecInt) (o_testBugBr4cp__5)).toString());
        Assert.assertEquals(1, ((int) (((VecInt) (o_testBugBr4cp__5)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testBugBr4cp__5)).isEmpty());
        IConstr o_testBugBr4cp__6 = solver.addClause(clause);
        Assert.assertTrue(((UnitClause) (o_testBugBr4cp__6)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_testBugBr4cp__6)).getActivity())), 0.1);
        Assert.assertEquals("1", ((UnitClause) (o_testBugBr4cp__6)).toString());
        clause.clear();
        IVecInt o_testBugBr4cp__8 = clause.push(2).push(3);
        Assert.assertEquals("2,3", ((VecInt) (o_testBugBr4cp__8)).toString());
        Assert.assertEquals(2, ((int) (((VecInt) (o_testBugBr4cp__8)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testBugBr4cp__8)).isEmpty());
        IConstr o_testBugBr4cp__10 = solver.addClause(clause);
        Assert.assertFalse(((OriginalBinaryClause) (o_testBugBr4cp__10)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testBugBr4cp__10)).getActivity())), 0.1);
        int[] array_891875899 = new int[]{4,6};
        	int[] array_1935558803 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testBugBr4cp__10).getLits();
        	for(int ii = 0; ii <array_891875899.length; ii++) {
        		org.junit.Assert.assertEquals(array_891875899[ii], array_1935558803[ii]);
        	};
        Assert.assertEquals("2[?] 3[?]", ((OriginalBinaryClause) (o_testBugBr4cp__10)).toString());
        Assert.assertEquals(5, ((int) (((OriginalBinaryClause) (o_testBugBr4cp__10)).hashCode())));
        clause.clear();
        IVecInt o_testBugBr4cp__12 = clause.push((-2)).push((-3));
        Assert.assertEquals("-2,-3", ((VecInt) (o_testBugBr4cp__12)).toString());
        Assert.assertEquals(-2, ((int) (((VecInt) (o_testBugBr4cp__12)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testBugBr4cp__12)).isEmpty());
        IConstr o_testBugBr4cp__16 = solver.addClause(clause);
        Assert.assertFalse(((OriginalBinaryClause) (o_testBugBr4cp__16)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testBugBr4cp__16)).getActivity())), 0.1);
        int[] array_2132100624 = new int[]{5,7};
        	int[] array_2041933864 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testBugBr4cp__16).getLits();
        	for(int ii = 0; ii <array_2132100624.length; ii++) {
        		org.junit.Assert.assertEquals(array_2132100624[ii], array_2041933864[ii]);
        	};
        Assert.assertEquals("-2[?] -3[?]", ((OriginalBinaryClause) (o_testBugBr4cp__16)).toString());
        Assert.assertEquals(6, ((int) (((OriginalBinaryClause) (o_testBugBr4cp__16)).hashCode())));
        clause.clear();
        IVecInt backbone = Backbone.instance().compute(solver);
        int o_testBugBr4cp__21 = backbone.size();
        Assert.assertEquals(1, ((int) (o_testBugBr4cp__21)));
        int o_testBugBr4cp__22 = backbone.get(0);
        Assert.assertEquals(1, ((int) (o_testBugBr4cp__22)));
        boolean o_testBugBr4cp__23 = solver.isSatisfiable(new VecInt(new int[]{ 2 }));
        Assert.assertTrue(o_testBugBr4cp__23);
        boolean o_testBugBr4cp__25 = solver.isSatisfiable(new VecInt(new int[]{ 3 }));
        Assert.assertTrue(o_testBugBr4cp__25);
        boolean o_testBugBr4cp__27 = solver.isSatisfiable(new VecInt(new int[]{ -2 }));
        Assert.assertTrue(o_testBugBr4cp__27);
        boolean o_testBugBr4cp__30 = solver.isSatisfiable(new VecInt(new int[]{ -3 }));
        Assert.assertTrue(o_testBugBr4cp__30);
        backbone = Backbone.instance().compute(solver, new VecInt(new int[]{ 2 }));
        int o_testBugBr4cp__37 = backbone.size();
        Assert.assertEquals(3, ((int) (o_testBugBr4cp__37)));
        backbone = Backbone.instance().compute(solver, new VecInt(new int[]{ -2 }));
        int o_testBugBr4cp__43 = backbone.size();
        Assert.assertEquals(3, ((int) (o_testBugBr4cp__43)));
        int o_testBugBr4cp__44 = backbone.size();
        Assert.assertEquals(3, ((int) (o_testBugBr4cp__44)));
        backbone = Backbone.instance().compute(solver, new VecInt(new int[]{ 3 }));
        int o_testBugBr4cp__49 = backbone.size();
        Assert.assertEquals(3, ((int) (o_testBugBr4cp__49)));
        int o_testBugBr4cp__50 = backbone.size();
        Assert.assertEquals(3, ((int) (o_testBugBr4cp__50)));
        int o_testBugBr4cp__51 = backbone.size();
        Assert.assertEquals(3, ((int) (o_testBugBr4cp__51)));
        backbone = Backbone.instance().compute(solver, new VecInt(new int[]{ -3 }));
        int o_testBugBr4cp__57 = backbone.size();
        Assert.assertEquals(3, ((int) (o_testBugBr4cp__57)));
        int o_testBugBr4cp__58 = backbone.size();
        Assert.assertEquals(3, ((int) (o_testBugBr4cp__58)));
        int o_testBugBr4cp__59 = backbone.size();
        Assert.assertEquals(3, ((int) (o_testBugBr4cp__59)));
        int o_testBugBr4cp__60 = backbone.size();
        Assert.assertEquals(3, ((int) (o_testBugBr4cp__60)));
        Assert.assertEquals("", ((VecInt) (o_testBugBr4cp__5)).toString());
        Assert.assertTrue(((VecInt) (o_testBugBr4cp__5)).isEmpty());
        Assert.assertTrue(((UnitClause) (o_testBugBr4cp__6)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_testBugBr4cp__6)).getActivity())), 0.1);
        Assert.assertEquals("1", ((UnitClause) (o_testBugBr4cp__6)).toString());
        Assert.assertEquals("", ((VecInt) (o_testBugBr4cp__8)).toString());
        Assert.assertTrue(((VecInt) (o_testBugBr4cp__8)).isEmpty());
        Assert.assertFalse(((OriginalBinaryClause) (o_testBugBr4cp__10)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testBugBr4cp__10)).getActivity())), 0.1);
        int[] array_1361681830 = new int[]{4,6};
        	int[] array_1535424992 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testBugBr4cp__10).getLits();
        	for(int ii = 0; ii <array_1361681830.length; ii++) {
        		org.junit.Assert.assertEquals(array_1361681830[ii], array_1535424992[ii]);
        	};
        Assert.assertEquals("2[?] 3[?]", ((OriginalBinaryClause) (o_testBugBr4cp__10)).toString());
        Assert.assertEquals(5, ((int) (((OriginalBinaryClause) (o_testBugBr4cp__10)).hashCode())));
        Assert.assertEquals("", ((VecInt) (o_testBugBr4cp__12)).toString());
        Assert.assertTrue(((VecInt) (o_testBugBr4cp__12)).isEmpty());
        Assert.assertFalse(((OriginalBinaryClause) (o_testBugBr4cp__16)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testBugBr4cp__16)).getActivity())), 0.1);
        int[] array_1073873590 = new int[]{5,7};
        	int[] array_1570815776 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testBugBr4cp__16).getLits();
        	for(int ii = 0; ii <array_1073873590.length; ii++) {
        		org.junit.Assert.assertEquals(array_1073873590[ii], array_1570815776[ii]);
        	};
        Assert.assertEquals("-2[?] -3[?]", ((OriginalBinaryClause) (o_testBugBr4cp__16)).toString());
        Assert.assertEquals(6, ((int) (((OriginalBinaryClause) (o_testBugBr4cp__16)).hashCode())));
        Assert.assertEquals(1, ((int) (o_testBugBr4cp__21)));
        Assert.assertEquals(1, ((int) (o_testBugBr4cp__22)));
        Assert.assertTrue(o_testBugBr4cp__23);
        Assert.assertTrue(o_testBugBr4cp__25);
        Assert.assertTrue(o_testBugBr4cp__27);
        Assert.assertTrue(o_testBugBr4cp__30);
        Assert.assertEquals(3, ((int) (o_testBugBr4cp__37)));
        Assert.assertEquals(3, ((int) (o_testBugBr4cp__43)));
        Assert.assertEquals(3, ((int) (o_testBugBr4cp__44)));
        Assert.assertEquals(3, ((int) (o_testBugBr4cp__49)));
        Assert.assertEquals(3, ((int) (o_testBugBr4cp__50)));
        Assert.assertEquals(3, ((int) (o_testBugBr4cp__51)));
        Assert.assertEquals(3, ((int) (o_testBugBr4cp__57)));
        Assert.assertEquals(3, ((int) (o_testBugBr4cp__58)));
        Assert.assertEquals(3, ((int) (o_testBugBr4cp__59)));
    }
}

