package org.sat4j.minisat.core;


import org.junit.Assert;
import org.sat4j.core.VecInt;
import org.sat4j.minisat.SolverFactory;
import org.sat4j.specs.ContradictionException;
import org.sat4j.specs.ISolver;
import org.sat4j.specs.TimeoutException;


public class AmplBugReset {
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

