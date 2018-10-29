package org.sat4j.minisat.core;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.sat4j.core.VecInt;
import org.sat4j.minisat.SolverFactory;
import org.sat4j.specs.ContradictionException;
import org.sat4j.specs.ISolver;
import org.sat4j.specs.IVecInt;
import org.sat4j.specs.TimeoutException;
import org.sat4j.tools.ModelIterator;


public class TestGroupedTimeoutModelEnumeration {
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

    @Test(timeout = 10000)
    public void testTimeoutOnSeconds_failAssert1() throws Exception, TimeoutException {
        try {
            this.solver.setTimeout(2);
            while (this.solver.isSatisfiable()) {
                this.solver.model();
            } 
            org.junit.Assert.fail("testTimeoutOnSeconds should have thrown TimeoutException");
        } catch (TimeoutException expected) {
            Assert.assertEquals(" Timeout (2000s) exceeded", expected.getMessage());
        }
    }

    @Test(timeout = 10000)
    public void testTimeoutOnMilliSeconds_failAssert0() throws Exception, TimeoutException {
        try {
            this.solver.setTimeoutMs(2000);
            while (this.solver.isSatisfiable()) {
                this.solver.model();
            } 
            org.junit.Assert.fail("testTimeoutOnMilliSeconds should have thrown TimeoutException");
        } catch (TimeoutException expected) {
            Assert.assertEquals(" Timeout (2000s) exceeded", expected.getMessage());
        }
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

