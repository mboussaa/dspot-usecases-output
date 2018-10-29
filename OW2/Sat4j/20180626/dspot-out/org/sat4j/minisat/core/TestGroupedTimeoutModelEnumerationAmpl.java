package org.sat4j.minisat.core;


import org.junit.Before;
import org.junit.Ignore;
import org.sat4j.core.VecInt;
import org.sat4j.minisat.SolverFactory;
import org.sat4j.specs.ContradictionException;
import org.sat4j.specs.ISolver;
import org.sat4j.specs.IVecInt;
import org.sat4j.specs.TimeoutException;
import org.sat4j.tools.ModelIterator;


public class TestGroupedTimeoutModelEnumerationAmpl {
    private ISolver solver;

    @Before
    public void setUp() throws ContradictionException {
        this.solver = new ModelIterator(SolverFactory.newDefault());
        IVecInt clause = new VecInt();
        for (int i = 1; i <= 15; i++) {
            clause.push((-i));
        }
        this.solver.addClause(clause);
    }

    @Ignore
    public void testTimeoutOnConflicts() throws TimeoutException {
        this.solver.setTimeoutOnConflicts(100);
        int i = 1;
        while (this.solver.isSatisfiable()) {
            System.out.println(this.solver.createBlockingClauseForCurrentModel());
            this.solver.model();
        } 
        this.solver.printStat(System.out, ">");
    }
}

