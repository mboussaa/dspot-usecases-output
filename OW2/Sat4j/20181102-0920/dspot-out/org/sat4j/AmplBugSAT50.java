package org.sat4j;


import org.junit.Assert;
import org.junit.Test;
import org.sat4j.core.VecInt;
import org.sat4j.minisat.SolverFactory;
import org.sat4j.minisat.core.DataStructureFactory;
import org.sat4j.minisat.core.IOrder;
import org.sat4j.minisat.core.Solver;
import org.sat4j.minisat.orders.SubsetVarOrder;
import org.sat4j.specs.ContradictionException;
import org.sat4j.specs.IVecInt;
import org.sat4j.specs.TimeoutException;
import org.sat4j.tools.TextOutputTracing;


public class AmplBugSAT50 {
    @Test(timeout = 30000)
    public void test_remove2_failAssert1() throws Exception, ContradictionException, TimeoutException {
        try {
            Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
            int[] backdoor = new int[]{ 1, 2, 3 };
            IOrder order = new SubsetVarOrder(backdoor);
            solver.setOrder(order);
            IVecInt clause = new VecInt();
            solver.addClause(clause);
            clause = new VecInt();
            clause.push(2).push(5);
            solver.addClause(clause);
            clause = new VecInt();
            clause.push(3).push(6);
            solver.addClause(clause);
            solver.isSatisfiable();
            org.junit.Assert.fail("test_remove2 should have thrown ContradictionException");
        } catch (ContradictionException expected) {
            Assert.assertEquals("Creating Empty clause ?", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test_remove4_failAssert2() throws Exception, ContradictionException, TimeoutException {
        try {
            Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
            int[] backdoor = new int[]{ 1, 2, 3 };
            IOrder order = new SubsetVarOrder(backdoor);
            solver.setOrder(order);
            IVecInt clause = new VecInt();
            clause.push(1).push(4);
            solver.addClause(clause);
            clause = new VecInt();
            solver.addClause(clause);
            clause = new VecInt();
            clause.push(3).push(6);
            solver.addClause(clause);
            solver.isSatisfiable();
            org.junit.Assert.fail("test_remove4 should have thrown ContradictionException");
        } catch (ContradictionException expected) {
            Assert.assertEquals("Creating Empty clause ?", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test_remove6_failAssert3() throws Exception, ContradictionException, TimeoutException {
        try {
            Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
            int[] backdoor = new int[]{ 1, 2, 3 };
            IOrder order = new SubsetVarOrder(backdoor);
            solver.setOrder(order);
            IVecInt clause = new VecInt();
            clause.push(1).push(4);
            solver.addClause(clause);
            solver.addClause(clause);
            clause = new VecInt();
            clause.push(2).push(5);
            clause = new VecInt();
            solver.addClause(clause);
            solver.isSatisfiable();
            org.junit.Assert.fail("test_remove6 should have thrown ContradictionException");
        } catch (ContradictionException expected) {
            Assert.assertEquals("Creating Empty clause ?", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test2_remove27_failAssert4() throws Exception, ContradictionException, TimeoutException {
        try {
            Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
            int[] backdoor = new int[]{ 1, 2, 3 };
            IOrder order = new SubsetVarOrder(backdoor);
            solver.setOrder(order);
            IVecInt clause = new VecInt();
            solver.addClause(clause);
            clause = new VecInt();
            clause.push((-2)).push(5);
            solver.addClause(clause);
            clause = new VecInt();
            clause.push((-3)).push(6);
            solver.addClause(clause);
            solver.isSatisfiable();
            org.junit.Assert.fail("test2_remove27 should have thrown ContradictionException");
        } catch (ContradictionException expected) {
            Assert.assertEquals("Creating Empty clause ?", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test2_remove29_failAssert5() throws Exception, ContradictionException, TimeoutException {
        try {
            Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
            int[] backdoor = new int[]{ 1, 2, 3 };
            IOrder order = new SubsetVarOrder(backdoor);
            solver.setOrder(order);
            IVecInt clause = new VecInt();
            clause.push((-1)).push(4);
            solver.addClause(clause);
            clause = new VecInt();
            solver.addClause(clause);
            clause = new VecInt();
            clause.push((-3)).push(6);
            solver.addClause(clause);
            solver.isSatisfiable();
            org.junit.Assert.fail("test2_remove29 should have thrown ContradictionException");
        } catch (ContradictionException expected) {
            Assert.assertEquals("Creating Empty clause ?", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test2_remove31_failAssert6() throws Exception, ContradictionException, TimeoutException {
        try {
            Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
            int[] backdoor = new int[]{ 1, 2, 3 };
            IOrder order = new SubsetVarOrder(backdoor);
            solver.setOrder(order);
            IVecInt clause = new VecInt();
            clause.push((-1)).push(4);
            solver.addClause(clause);
            solver.addClause(clause);
            clause = new VecInt();
            clause.push((-2)).push(5);
            clause = new VecInt();
            solver.addClause(clause);
            solver.isSatisfiable();
            org.junit.Assert.fail("test2_remove31 should have thrown ContradictionException");
        } catch (ContradictionException expected) {
            Assert.assertEquals("Creating Empty clause ?", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test3_failAssert0() throws Exception, ContradictionException, TimeoutException {
        try {
            Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
            solver.setSearchListener(new TextOutputTracing<Object>(null));
            int[] backdoor = new int[]{ 1, 2, 3 };
            IOrder order = new SubsetVarOrder(backdoor);
            solver.setOrder(order);
            IVecInt clause = new VecInt();
            clause.push((-1)).push(4).push(7);
            solver.addClause(clause);
            clause = new VecInt();
            clause.push((-2)).push(5).push(7);
            solver.addClause(clause);
            clause = new VecInt();
            clause.push((-3)).push(6).push(5);
            solver.addClause(clause);
            clause = new VecInt();
            clause.push(1).push(2).push(3).push(7).push(8);
            solver.addClause(clause);
            solver.isSatisfiable();
            org.junit.Assert.fail("test3 should have thrown TimeoutException");
        } catch (TimeoutException expected) {
            Assert.assertEquals("Cannot decide the satisfiability", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test3_remove51_failAssert7() throws Exception, ContradictionException, TimeoutException {
        try {
            Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
            int[] backdoor = new int[]{ 1, 2, 3 };
            IOrder order = new SubsetVarOrder(backdoor);
            solver.setOrder(order);
            IVecInt clause = new VecInt();
            clause.push((-1)).push(4).push(7);
            solver.addClause(clause);
            clause = new VecInt();
            clause.push((-2)).push(5).push(7);
            solver.addClause(clause);
            clause = new VecInt();
            clause.push((-3)).push(6).push(5);
            solver.addClause(clause);
            clause = new VecInt();
            clause.push(1).push(2).push(3).push(7).push(8);
            solver.addClause(clause);
            solver.isSatisfiable();
            org.junit.Assert.fail("test3_remove51 should have thrown TimeoutException");
        } catch (TimeoutException expected) {
            Assert.assertEquals("Cannot decide the satisfiability", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test3_remove53_failAssert8() throws Exception, ContradictionException, TimeoutException {
        try {
            Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
            solver.setSearchListener(new TextOutputTracing<Object>(null));
            int[] backdoor = new int[]{ 1, 2, 3 };
            IOrder order = new SubsetVarOrder(backdoor);
            solver.setOrder(order);
            IVecInt clause = new VecInt();
            solver.addClause(clause);
            clause = new VecInt();
            clause.push((-2)).push(5).push(7);
            solver.addClause(clause);
            clause = new VecInt();
            clause.push((-3)).push(6).push(5);
            solver.addClause(clause);
            clause = new VecInt();
            clause.push(1).push(2).push(3).push(7).push(8);
            solver.addClause(clause);
            solver.isSatisfiable();
            org.junit.Assert.fail("test3_remove53 should have thrown ContradictionException");
        } catch (ContradictionException expected) {
            Assert.assertEquals("Creating Empty clause ?", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test3_remove55_failAssert9() throws Exception, ContradictionException, TimeoutException {
        try {
            Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
            solver.setSearchListener(new TextOutputTracing<Object>(null));
            int[] backdoor = new int[]{ 1, 2, 3 };
            IOrder order = new SubsetVarOrder(backdoor);
            solver.setOrder(order);
            IVecInt clause = new VecInt();
            clause.push((-1)).push(4).push(7);
            solver.addClause(clause);
            clause = new VecInt();
            solver.addClause(clause);
            clause = new VecInt();
            clause.push((-3)).push(6).push(5);
            solver.addClause(clause);
            clause = new VecInt();
            clause.push(1).push(2).push(3).push(7).push(8);
            solver.addClause(clause);
            solver.isSatisfiable();
            org.junit.Assert.fail("test3_remove55 should have thrown ContradictionException");
        } catch (ContradictionException expected) {
            Assert.assertEquals("Creating Empty clause ?", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test3_remove57_failAssert10() throws Exception, ContradictionException, TimeoutException {
        try {
            Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
            solver.setSearchListener(new TextOutputTracing<Object>(null));
            int[] backdoor = new int[]{ 1, 2, 3 };
            IOrder order = new SubsetVarOrder(backdoor);
            solver.setOrder(order);
            IVecInt clause = new VecInt();
            clause.push((-1)).push(4).push(7);
            solver.addClause(clause);
            solver.addClause(clause);
            clause = new VecInt();
            clause.push((-2)).push(5).push(7);
            clause = new VecInt();
            solver.addClause(clause);
            clause = new VecInt();
            clause.push(1).push(2).push(3).push(7).push(8);
            solver.addClause(clause);
            solver.isSatisfiable();
            org.junit.Assert.fail("test3_remove57 should have thrown ContradictionException");
        } catch (ContradictionException expected) {
            Assert.assertEquals("Creating Empty clause ?", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test3_remove59_failAssert11() throws Exception, ContradictionException, TimeoutException {
        try {
            Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
            solver.setSearchListener(new TextOutputTracing<Object>(null));
            int[] backdoor = new int[]{ 1, 2, 3 };
            IOrder order = new SubsetVarOrder(backdoor);
            solver.setOrder(order);
            IVecInt clause = new VecInt();
            clause.push((-1)).push(4).push(7);
            solver.addClause(clause);
            solver.addClause(clause);
            solver.addClause(clause);
            clause = new VecInt();
            clause.push((-2)).push(5).push(7);
            clause = new VecInt();
            clause.push((-3)).push(6).push(5);
            clause = new VecInt();
            solver.addClause(clause);
            solver.isSatisfiable();
            org.junit.Assert.fail("test3_remove59 should have thrown ContradictionException");
        } catch (ContradictionException expected) {
            Assert.assertEquals("Creating Empty clause ?", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testJeanGuy1_remove91_failAssert12() throws Exception, ContradictionException, TimeoutException {
        try {
            Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
            int[] backdoor = new int[]{ 1, 2, 3, 4 };
            IOrder order = new SubsetVarOrder(backdoor);
            solver.setOrder(order);
            IVecInt clause = new VecInt();
            solver.addClause(clause);
            clause = new VecInt();
            clause.push((-2)).push(3).push(5);
            solver.addClause(clause);
            clause = new VecInt();
            clause.push((-4)).push(5);
            solver.addClause(clause);
            solver.isSatisfiable();
            org.junit.Assert.fail("testJeanGuy1_remove91 should have thrown ContradictionException");
        } catch (ContradictionException expected) {
            Assert.assertEquals("Creating Empty clause ?", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testJeanGuy1_remove93_failAssert13() throws Exception, ContradictionException, TimeoutException {
        try {
            Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
            int[] backdoor = new int[]{ 1, 2, 3, 4 };
            IOrder order = new SubsetVarOrder(backdoor);
            solver.setOrder(order);
            IVecInt clause = new VecInt();
            clause.push((-1)).push(5);
            solver.addClause(clause);
            clause = new VecInt();
            solver.addClause(clause);
            clause = new VecInt();
            clause.push((-4)).push(5);
            solver.addClause(clause);
            solver.isSatisfiable();
            org.junit.Assert.fail("testJeanGuy1_remove93 should have thrown ContradictionException");
        } catch (ContradictionException expected) {
            Assert.assertEquals("Creating Empty clause ?", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testJeanGuy1_remove95_failAssert14() throws Exception, ContradictionException, TimeoutException {
        try {
            Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
            int[] backdoor = new int[]{ 1, 2, 3, 4 };
            IOrder order = new SubsetVarOrder(backdoor);
            solver.setOrder(order);
            IVecInt clause = new VecInt();
            clause.push((-1)).push(5);
            solver.addClause(clause);
            solver.addClause(clause);
            clause = new VecInt();
            clause.push((-2)).push(3).push(5);
            clause = new VecInt();
            solver.addClause(clause);
            solver.isSatisfiable();
            org.junit.Assert.fail("testJeanGuy1_remove95 should have thrown ContradictionException");
        } catch (ContradictionException expected) {
            Assert.assertEquals("Creating Empty clause ?", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testJeanGuy2_remove116_failAssert15() throws Exception, ContradictionException, TimeoutException {
        try {
            Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
            int[] backdoor = new int[]{ 5 };
            IOrder order = new SubsetVarOrder(backdoor);
            solver.setOrder(order);
            IVecInt clause = new VecInt();
            solver.addClause(clause);
            clause = new VecInt();
            clause.push((-2)).push(3).push(5);
            solver.addClause(clause);
            clause = new VecInt();
            clause.push((-4)).push(5);
            solver.addClause(clause);
            solver.isSatisfiable();
            org.junit.Assert.fail("testJeanGuy2_remove116 should have thrown ContradictionException");
        } catch (ContradictionException expected) {
            Assert.assertEquals("Creating Empty clause ?", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testJeanGuy2_remove118_failAssert16() throws Exception, ContradictionException, TimeoutException {
        try {
            Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
            int[] backdoor = new int[]{ 5 };
            IOrder order = new SubsetVarOrder(backdoor);
            solver.setOrder(order);
            IVecInt clause = new VecInt();
            clause.push((-1)).push(5);
            solver.addClause(clause);
            clause = new VecInt();
            solver.addClause(clause);
            clause = new VecInt();
            clause.push((-4)).push(5);
            solver.addClause(clause);
            solver.isSatisfiable();
            org.junit.Assert.fail("testJeanGuy2_remove118 should have thrown ContradictionException");
        } catch (ContradictionException expected) {
            Assert.assertEquals("Creating Empty clause ?", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testJeanGuy2_remove120_failAssert17() throws Exception, ContradictionException, TimeoutException {
        try {
            Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
            int[] backdoor = new int[]{ 5 };
            IOrder order = new SubsetVarOrder(backdoor);
            solver.setOrder(order);
            IVecInt clause = new VecInt();
            clause.push((-1)).push(5);
            solver.addClause(clause);
            solver.addClause(clause);
            clause = new VecInt();
            clause.push((-2)).push(3).push(5);
            clause = new VecInt();
            solver.addClause(clause);
            solver.isSatisfiable();
            org.junit.Assert.fail("testJeanGuy2_remove120 should have thrown ContradictionException");
        } catch (ContradictionException expected) {
            Assert.assertEquals("Creating Empty clause ?", expected.getMessage());
        }
    }
}

