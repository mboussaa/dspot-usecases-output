package org.sat4j.minisat.core;


import org.junit.Assert;
import org.junit.Test;
import org.sat4j.core.VecInt;
import org.sat4j.minisat.SolverFactory;
import org.sat4j.minisat.constraints.cnf.OriginalWLClause;
import org.sat4j.minisat.constraints.cnf.UnitClause;
import org.sat4j.specs.ContradictionException;
import org.sat4j.specs.IConstr;
import org.sat4j.specs.ISolver;
import org.sat4j.specs.TimeoutException;


public class BugReset {
    @Test(timeout = 10000)
    public void testBugKostya() throws Exception, ContradictionException, TimeoutException {
        ISolver solver = SolverFactory.newDefault();
        solver.setTimeout(3600);
        boolean res;
        solver.isSatisfiable();
        solver.reset();
        int o_testBugKostya__7 = solver.newVar(1);
        Assert.assertEquals(1, ((int) (o_testBugKostya__7)));
        int[] clause = new int[]{ -4 };
        IConstr o_testBugKostya__11 = solver.addClause(new VecInt(clause));
        Assert.assertTrue(((UnitClause) (o_testBugKostya__11)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_testBugKostya__11)).getActivity())), 0.1);
        Assert.assertEquals("-4", ((UnitClause) (o_testBugKostya__11)).toString());
        res = solver.isSatisfiable();
        solver.reset();
        int o_testBugKostya__20 = solver.newVar(4);
        Assert.assertEquals(4, ((int) (o_testBugKostya__20)));
        clause = new int[]{ -1, -2, -3, 4 };
        IConstr o_testBugKostya__26 = solver.addClause(new VecInt(clause));
        Assert.assertFalse(((OriginalWLClause) (o_testBugKostya__26)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testBugKostya__26)).getActivity())), 0.1);
        int[] array_857740484 = new int[]{3,5,7,8};
        	int[] array_1219658779 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testBugKostya__26).getLits();
        	for(int ii = 0; ii <array_857740484.length; ii++) {
        		org.junit.Assert.assertEquals(array_857740484[ii], array_1219658779[ii]);
        	};
        Assert.assertEquals("-1[?] -2[?] -3[?] 4[?] ", ((OriginalWLClause) (o_testBugKostya__26)).toString());
        Assert.assertEquals(5, ((int) (((OriginalWLClause) (o_testBugKostya__26)).hashCode())));
        clause = new int[]{ 1 };
        IConstr o_testBugKostya__29 = solver.addClause(new VecInt(clause));
        Assert.assertTrue(((UnitClause) (o_testBugKostya__29)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_testBugKostya__29)).getActivity())), 0.1);
        Assert.assertEquals("1", ((UnitClause) (o_testBugKostya__29)).toString());
        clause = new int[]{ 2 };
        IConstr o_testBugKostya__32 = solver.addClause(new VecInt(clause));
        Assert.assertTrue(((UnitClause) (o_testBugKostya__32)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_testBugKostya__32)).getActivity())), 0.1);
        Assert.assertEquals("2", ((UnitClause) (o_testBugKostya__32)).toString());
        clause = new int[]{ 3 };
        IConstr o_testBugKostya__35 = solver.addClause(new VecInt(clause));
        Assert.assertTrue(((UnitClause) (o_testBugKostya__35)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_testBugKostya__35)).getActivity())), 0.1);
        Assert.assertEquals("3", ((UnitClause) (o_testBugKostya__35)).toString());
        solver.isSatisfiable();
        solver.isSatisfiable();
        Assert.assertEquals(1, ((int) (o_testBugKostya__7)));
        Assert.assertTrue(((UnitClause) (o_testBugKostya__11)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_testBugKostya__11)).getActivity())), 0.1);
        Assert.assertEquals("-4", ((UnitClause) (o_testBugKostya__11)).toString());
        Assert.assertEquals(4, ((int) (o_testBugKostya__20)));
        Assert.assertFalse(((OriginalWLClause) (o_testBugKostya__26)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testBugKostya__26)).getActivity())), 0.1);
        int[] array_866297653 = new int[]{8,5,3,7};
        	int[] array_288027983 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testBugKostya__26).getLits();
        	for(int ii = 0; ii <array_866297653.length; ii++) {
        		org.junit.Assert.assertEquals(array_866297653[ii], array_288027983[ii]);
        	};
        Assert.assertEquals("4[?] -2[F] -1[F] -3[F] ", ((OriginalWLClause) (o_testBugKostya__26)).toString());
        Assert.assertEquals(5, ((int) (((OriginalWLClause) (o_testBugKostya__26)).hashCode())));
        Assert.assertTrue(((UnitClause) (o_testBugKostya__29)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_testBugKostya__29)).getActivity())), 0.1);
        Assert.assertEquals("1", ((UnitClause) (o_testBugKostya__29)).toString());
        Assert.assertTrue(((UnitClause) (o_testBugKostya__32)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_testBugKostya__32)).getActivity())), 0.1);
        Assert.assertEquals("2", ((UnitClause) (o_testBugKostya__32)).toString());
        Assert.assertTrue(((UnitClause) (o_testBugKostya__35)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_testBugKostya__35)).getActivity())), 0.1);
        Assert.assertEquals("3", ((UnitClause) (o_testBugKostya__35)).toString());
    }

    @Test(timeout = 10000)
    public void testWithReset() throws Exception, ContradictionException, TimeoutException {
        ISolver solver = SolverFactory.newDefault();
        int[] clause;
        boolean res;
        int o_testWithReset__5 = solver.newVar(4);
        Assert.assertEquals(4, ((int) (o_testWithReset__5)));
        solver.setExpectedNumberOfClauses(6);
        res = solver.isSatisfiable();
        solver.reset();
        int o_testWithReset__15 = solver.newVar(1);
        Assert.assertEquals(1, ((int) (o_testWithReset__15)));
        clause = new int[]{ -4 };
        IConstr o_testWithReset__19 = solver.addClause(new VecInt(clause));
        Assert.assertTrue(((UnitClause) (o_testWithReset__19)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_testWithReset__19)).getActivity())), 0.1);
        Assert.assertEquals("-4", ((UnitClause) (o_testWithReset__19)).toString());
        res = solver.isSatisfiable();
        solver.reset();
        int o_testWithReset__24 = solver.newVar(4);
        Assert.assertEquals(4, ((int) (o_testWithReset__24)));
        addData(solver);
        solver.isSatisfiable();
        clause = new int[]{ -4 };
        IConstr o_testWithReset__30 = solver.addClause(new VecInt(clause));
        Assert.assertTrue(((UnitClause) (o_testWithReset__30)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_testWithReset__30)).getActivity())), 0.1);
        Assert.assertEquals("-4", ((UnitClause) (o_testWithReset__30)).toString());
        try {
            addData(solver);
            res = solver.isSatisfiable();
        } catch (ContradictionException e) {
            res = false;
        }
        solver.reset();
        Assert.assertEquals(4, ((int) (o_testWithReset__5)));
        Assert.assertEquals(1, ((int) (o_testWithReset__15)));
        Assert.assertTrue(((UnitClause) (o_testWithReset__19)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_testWithReset__19)).getActivity())), 0.1);
        Assert.assertEquals("-4", ((UnitClause) (o_testWithReset__19)).toString());
        Assert.assertEquals(4, ((int) (o_testWithReset__24)));
        Assert.assertTrue(((UnitClause) (o_testWithReset__30)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_testWithReset__30)).getActivity())), 0.1);
        Assert.assertEquals("-4", ((UnitClause) (o_testWithReset__30)).toString());
    }

    private void addData(ISolver solver) throws ContradictionException {
        int[] clause = new int[]{ -1, -2, -3, 4 };
        solver.addClause(new VecInt(clause));
        clause = new int[]{ 1 };
        solver.addClause(new VecInt(clause));
        clause = new int[]{ 2 };
        solver.addClause(new VecInt(clause));
        clause = new int[]{ 3 };
        solver.addClause(new VecInt(clause));
    }

    private void solve(ISolver solver, int[] clause, boolean value) throws ContradictionException, TimeoutException {
        boolean res = true;
        try {
            if ((clause.length) > 0) {
                solver.addClause(new VecInt(clause));
            }
            clause = new int[]{ -1, 2, 4 };
            solver.addClause(new VecInt(clause));
            clause = new int[]{ 1, -2 };
            solver.addClause(new VecInt(clause));
            clause = new int[]{ 1, 2 };
            solver.addClause(new VecInt(clause));
            clause = new int[]{ -1, -2 };
            solver.addClause(new VecInt(clause));
        } catch (ContradictionException e) {
            res = false;
        }
        if (res) {
            res = solver.isSatisfiable();
        }
        solver.reset();
        Assert.assertEquals(res, value);
    }

    private void solve2(ISolver solver, int[] clause, boolean value) throws ContradictionException, TimeoutException {
        boolean res = true;
        try {
            int[] lclause = new int[]{ -1, -2, -3, 4 };
            solver.addClause(new VecInt(lclause));
            lclause = new int[]{ 1 };
            solver.addClause(new VecInt(lclause));
            lclause = new int[]{ 2 };
            solver.addClause(new VecInt(lclause));
            lclause = new int[]{ 3 };
            solver.addClause(new VecInt(lclause));
            if ((clause.length) > 0) {
                solver.addClause(new VecInt(clause));
            }
        } catch (ContradictionException e) {
            res = false;
        }
        if (res) {
            res = solver.isSatisfiable();
        }
        Assert.assertEquals(res, value);
    }

    private ISolver getSolver(ISolver solver, int vars, int clauses) {
        if (solver == null) {
            solver = SolverFactory.newDefault();
            solver.setTimeout(3600);
            solver.newVar(vars);
            solver.setExpectedNumberOfClauses(clauses);
        }else {
            solver.reset();
            solver.clearLearntClauses();
        }
        return solver;
    }
}

