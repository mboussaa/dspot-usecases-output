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
    public void testlitNum1_failAssert1() throws Exception, ContradictionException, TimeoutException {
        try {
            Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
            int[] backdoor = new int[]{ 2, 2, 3 };
            IOrder order = new SubsetVarOrder(backdoor);
            solver.setOrder(order);
            IVecInt clause = new VecInt();
            clause.push(1).push(4);
            solver.addClause(clause);
            clause = new VecInt();
            clause.push(2).push(5);
            solver.addClause(clause);
            clause = new VecInt();
            clause.push(3).push(6);
            solver.addClause(clause);
            solver.isSatisfiable();
            org.junit.Assert.fail("testlitNum1 should have thrown TimeoutException");
        } catch (TimeoutException expected) {
            Assert.assertEquals("Cannot decide the satisfiability", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testlitNum2_failAssert2() throws Exception, ContradictionException, TimeoutException {
        try {
            Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
            int[] backdoor = new int[]{ 0, 2, 3 };
            IOrder order = new SubsetVarOrder(backdoor);
            solver.setOrder(order);
            IVecInt clause = new VecInt();
            clause.push(1).push(4);
            solver.addClause(clause);
            clause = new VecInt();
            clause.push(2).push(5);
            solver.addClause(clause);
            clause = new VecInt();
            clause.push(3).push(6);
            solver.addClause(clause);
            solver.isSatisfiable();
            org.junit.Assert.fail("testlitNum2 should have thrown TimeoutException");
        } catch (TimeoutException expected) {
            Assert.assertEquals("Cannot decide the satisfiability", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testlitNum3_failAssert3() throws Exception, ContradictionException, TimeoutException {
        try {
            Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
            int[] backdoor = new int[]{ Integer.MAX_VALUE, 2, 3 };
            IOrder order = new SubsetVarOrder(backdoor);
            solver.setOrder(order);
            IVecInt clause = new VecInt();
            clause.push(1).push(4);
            solver.addClause(clause);
            clause = new VecInt();
            clause.push(2).push(5);
            solver.addClause(clause);
            clause = new VecInt();
            clause.push(3).push(6);
            solver.addClause(clause);
            solver.isSatisfiable();
            org.junit.Assert.fail("testlitNum3 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("2147483647", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testlitNum6_failAssert6() throws Exception, ContradictionException, TimeoutException {
        try {
            Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
            int[] backdoor = new int[]{ 1, 3, 3 };
            IOrder order = new SubsetVarOrder(backdoor);
            solver.setOrder(order);
            IVecInt clause = new VecInt();
            clause.push(1).push(4);
            solver.addClause(clause);
            clause = new VecInt();
            clause.push(2).push(5);
            solver.addClause(clause);
            clause = new VecInt();
            clause.push(3).push(6);
            solver.addClause(clause);
            solver.isSatisfiable();
            org.junit.Assert.fail("testlitNum6 should have thrown TimeoutException");
        } catch (TimeoutException expected) {
            Assert.assertEquals("Cannot decide the satisfiability", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testlitNum8_failAssert8() throws Exception, ContradictionException, TimeoutException {
        try {
            Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
            int[] backdoor = new int[]{ 1, Integer.MAX_VALUE, 3 };
            IOrder order = new SubsetVarOrder(backdoor);
            solver.setOrder(order);
            IVecInt clause = new VecInt();
            clause.push(1).push(4);
            solver.addClause(clause);
            clause = new VecInt();
            clause.push(2).push(5);
            solver.addClause(clause);
            clause = new VecInt();
            clause.push(3).push(6);
            solver.addClause(clause);
            solver.isSatisfiable();
            org.junit.Assert.fail("testlitNum8 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("2147483647", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testlitNum10_failAssert10() throws Exception, ContradictionException, TimeoutException {
        try {
            Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
            int[] backdoor = new int[]{ 1, 0, 3 };
            IOrder order = new SubsetVarOrder(backdoor);
            solver.setOrder(order);
            IVecInt clause = new VecInt();
            clause.push(1).push(4);
            solver.addClause(clause);
            clause = new VecInt();
            clause.push(2).push(5);
            solver.addClause(clause);
            clause = new VecInt();
            clause.push(3).push(6);
            solver.addClause(clause);
            solver.isSatisfiable();
            org.junit.Assert.fail("testlitNum10 should have thrown TimeoutException");
        } catch (TimeoutException expected) {
            Assert.assertEquals("Cannot decide the satisfiability", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testlitNum12_failAssert12() throws Exception, ContradictionException, TimeoutException {
        try {
            Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
            int[] backdoor = new int[]{ 1, 2, 4 };
            IOrder order = new SubsetVarOrder(backdoor);
            solver.setOrder(order);
            IVecInt clause = new VecInt();
            clause.push(1).push(4);
            solver.addClause(clause);
            clause = new VecInt();
            clause.push(2).push(5);
            solver.addClause(clause);
            clause = new VecInt();
            clause.push(3).push(6);
            solver.addClause(clause);
            solver.isSatisfiable();
            org.junit.Assert.fail("testlitNum12 should have thrown TimeoutException");
        } catch (TimeoutException expected) {
            Assert.assertEquals("Cannot decide the satisfiability", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testlitNum13_failAssert13() throws Exception, ContradictionException, TimeoutException {
        try {
            Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
            int[] backdoor = new int[]{ 1, 2, 2 };
            IOrder order = new SubsetVarOrder(backdoor);
            solver.setOrder(order);
            IVecInt clause = new VecInt();
            clause.push(1).push(4);
            solver.addClause(clause);
            clause = new VecInt();
            clause.push(2).push(5);
            solver.addClause(clause);
            clause = new VecInt();
            clause.push(3).push(6);
            solver.addClause(clause);
            solver.isSatisfiable();
            org.junit.Assert.fail("testlitNum13 should have thrown TimeoutException");
        } catch (TimeoutException expected) {
            Assert.assertEquals("Cannot decide the satisfiability", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testlitNum14_failAssert14() throws Exception, ContradictionException, TimeoutException {
        try {
            Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
            int[] backdoor = new int[]{ 1, 2, Integer.MAX_VALUE };
            IOrder order = new SubsetVarOrder(backdoor);
            solver.setOrder(order);
            IVecInt clause = new VecInt();
            clause.push(1).push(4);
            solver.addClause(clause);
            clause = new VecInt();
            clause.push(2).push(5);
            solver.addClause(clause);
            clause = new VecInt();
            clause.push(3).push(6);
            solver.addClause(clause);
            solver.isSatisfiable();
            org.junit.Assert.fail("testlitNum14 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("2147483647", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testlitNum15_failAssert15() throws Exception, ContradictionException, TimeoutException {
        try {
            Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
            int[] backdoor = new int[]{ 1, 2, Integer.MIN_VALUE };
            IOrder order = new SubsetVarOrder(backdoor);
            solver.setOrder(order);
            IVecInt clause = new VecInt();
            clause.push(1).push(4);
            solver.addClause(clause);
            clause = new VecInt();
            clause.push(2).push(5);
            solver.addClause(clause);
            clause = new VecInt();
            clause.push(3).push(6);
            solver.addClause(clause);
            solver.isSatisfiable();
            org.junit.Assert.fail("testlitNum15 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-2147483648", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testlitNum19_failAssert18() throws Exception, ContradictionException, TimeoutException {
        try {
            Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
            int[] backdoor = new int[]{ 1, 2, 3 };
            IOrder order = new SubsetVarOrder(backdoor);
            solver.setOrder(order);
            IVecInt clause = new VecInt();
            clause.push(0).push(4);
            solver.addClause(clause);
            clause = new VecInt();
            clause.push(2).push(5);
            solver.addClause(clause);
            clause = new VecInt();
            clause.push(3).push(6);
            solver.addClause(clause);
            solver.isSatisfiable();
            org.junit.Assert.fail("testlitNum19 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testlitNum20_failAssert19() throws Exception, ContradictionException, TimeoutException {
        try {
            Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
            int[] backdoor = new int[]{ 1, 2, 3 };
            IOrder order = new SubsetVarOrder(backdoor);
            solver.setOrder(order);
            IVecInt clause = new VecInt();
            clause.push(Integer.MAX_VALUE).push(4);
            solver.addClause(clause);
            clause = new VecInt();
            clause.push(2).push(5);
            solver.addClause(clause);
            clause = new VecInt();
            clause.push(3).push(6);
            solver.addClause(clause);
            solver.isSatisfiable();
            org.junit.Assert.fail("testlitNum20 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testlitNum21_failAssert20() throws Exception, ContradictionException, TimeoutException {
        try {
            Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
            int[] backdoor = new int[]{ 1, 2, 3 };
            IOrder order = new SubsetVarOrder(backdoor);
            solver.setOrder(order);
            IVecInt clause = new VecInt();
            clause.push(Integer.MIN_VALUE).push(4);
            solver.addClause(clause);
            clause = new VecInt();
            clause.push(2).push(5);
            solver.addClause(clause);
            clause = new VecInt();
            clause.push(3).push(6);
            solver.addClause(clause);
            solver.isSatisfiable();
            org.junit.Assert.fail("testlitNum21 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-2147483648", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testlitNum25_failAssert21() throws Exception, ContradictionException, TimeoutException {
        try {
            Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
            int[] backdoor = new int[]{ 1, 2, 3 };
            IOrder order = new SubsetVarOrder(backdoor);
            solver.setOrder(order);
            IVecInt clause = new VecInt();
            clause.push(1).push(Integer.MAX_VALUE);
            solver.addClause(clause);
            clause = new VecInt();
            clause.push(2).push(5);
            solver.addClause(clause);
            clause = new VecInt();
            clause.push(3).push(6);
            solver.addClause(clause);
            solver.isSatisfiable();
            org.junit.Assert.fail("testlitNum25 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testlitNum27_failAssert23() throws Exception, ContradictionException, TimeoutException {
        try {
            Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
            int[] backdoor = new int[]{ 1, 2, 3 };
            IOrder order = new SubsetVarOrder(backdoor);
            solver.setOrder(order);
            IVecInt clause = new VecInt();
            clause.push(1).push(0);
            solver.addClause(clause);
            clause = new VecInt();
            clause.push(2).push(5);
            solver.addClause(clause);
            clause = new VecInt();
            clause.push(3).push(6);
            solver.addClause(clause);
            solver.isSatisfiable();
            org.junit.Assert.fail("testlitNum27 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testlitNum31_failAssert24() throws Exception, ContradictionException, TimeoutException {
        try {
            Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
            int[] backdoor = new int[]{ 1, 2, 3 };
            IOrder order = new SubsetVarOrder(backdoor);
            solver.setOrder(order);
            IVecInt clause = new VecInt();
            clause.push(1).push(4);
            solver.addClause(clause);
            clause = new VecInt();
            clause.push(Integer.MAX_VALUE).push(5);
            solver.addClause(clause);
            clause = new VecInt();
            clause.push(3).push(6);
            solver.addClause(clause);
            solver.isSatisfiable();
            org.junit.Assert.fail("testlitNum31 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testlitNum33_failAssert26() throws Exception, ContradictionException, TimeoutException {
        try {
            Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
            int[] backdoor = new int[]{ 1, 2, 3 };
            IOrder order = new SubsetVarOrder(backdoor);
            solver.setOrder(order);
            IVecInt clause = new VecInt();
            clause.push(1).push(4);
            solver.addClause(clause);
            clause = new VecInt();
            clause.push(0).push(5);
            solver.addClause(clause);
            clause = new VecInt();
            clause.push(3).push(6);
            solver.addClause(clause);
            solver.isSatisfiable();
            org.junit.Assert.fail("testlitNum33 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testlitNum43_failAssert30() throws Exception, ContradictionException, TimeoutException {
        try {
            Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
            int[] backdoor = new int[]{ 1, 2, 3 };
            IOrder order = new SubsetVarOrder(backdoor);
            solver.setOrder(order);
            IVecInt clause = new VecInt();
            clause.push(1).push(4);
            solver.addClause(clause);
            clause = new VecInt();
            clause.push(2).push(5);
            solver.addClause(clause);
            clause = new VecInt();
            clause.push(Integer.MAX_VALUE).push(6);
            solver.addClause(clause);
            solver.isSatisfiable();
            org.junit.Assert.fail("testlitNum43 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testlitNum45_failAssert32() throws Exception, ContradictionException, TimeoutException {
        try {
            Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
            int[] backdoor = new int[]{ 1, 2, 3 };
            IOrder order = new SubsetVarOrder(backdoor);
            solver.setOrder(order);
            IVecInt clause = new VecInt();
            clause.push(1).push(4);
            solver.addClause(clause);
            clause = new VecInt();
            clause.push(2).push(5);
            solver.addClause(clause);
            clause = new VecInt();
            clause.push(0).push(6);
            solver.addClause(clause);
            solver.isSatisfiable();
            org.junit.Assert.fail("testlitNum45 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testlitNum50_failAssert34() throws Exception, ContradictionException, TimeoutException {
        try {
            Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
            int[] backdoor = new int[]{ 1, 2, 3 };
            IOrder order = new SubsetVarOrder(backdoor);
            solver.setOrder(order);
            IVecInt clause = new VecInt();
            clause.push(1).push(4);
            solver.addClause(clause);
            clause = new VecInt();
            clause.push(2).push(5);
            solver.addClause(clause);
            clause = new VecInt();
            clause.push(3).push(Integer.MIN_VALUE);
            solver.addClause(clause);
            solver.isSatisfiable();
            org.junit.Assert.fail("testlitNum50 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-2147483648", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testlitNum50_failAssert34_add1132_failAssert37() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                SolverFactory.newGlucose();
                Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                int[] backdoor = new int[]{ 1, 2, 3 };
                IOrder order = new SubsetVarOrder(backdoor);
                solver.setOrder(order);
                IVecInt clause = new VecInt();
                clause.push(1).push(4);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push(2).push(5);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push(3).push(Integer.MIN_VALUE);
                solver.addClause(clause);
                solver.isSatisfiable();
                org.junit.Assert.fail("testlitNum50 should have thrown ArrayIndexOutOfBoundsException");
            }
            org.junit.Assert.fail("testlitNum50_failAssert34_add1132 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-2147483648", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testlitNum15_failAssert15_add570_failAssert39() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                SolverFactory.newGlucose();
                Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                int[] backdoor = new int[]{ 1, 2, Integer.MIN_VALUE };
                IOrder order = new SubsetVarOrder(backdoor);
                solver.setOrder(order);
                IVecInt clause = new VecInt();
                clause.push(1).push(4);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push(2).push(5);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push(3).push(6);
                solver.addClause(clause);
                solver.isSatisfiable();
                org.junit.Assert.fail("testlitNum15 should have thrown ArrayIndexOutOfBoundsException");
            }
            org.junit.Assert.fail("testlitNum15_failAssert15_add570 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-2147483648", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testlitNum21_failAssert20_add397_failAssert40() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                SolverFactory.newGlucose();
                Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                int[] backdoor = new int[]{ 1, 2, 3 };
                IOrder order = new SubsetVarOrder(backdoor);
                solver.setOrder(order);
                IVecInt clause = new VecInt();
                clause.push(Integer.MIN_VALUE).push(4);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push(2).push(5);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push(3).push(6);
                solver.addClause(clause);
                solver.isSatisfiable();
                org.junit.Assert.fail("testlitNum21 should have thrown ArrayIndexOutOfBoundsException");
            }
            org.junit.Assert.fail("testlitNum21_failAssert20_add397 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-2147483648", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testlitNum8_failAssert8_add755_failAssert43() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                SolverFactory.newGlucose();
                Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                int[] backdoor = new int[]{ 1, Integer.MAX_VALUE, 3 };
                IOrder order = new SubsetVarOrder(backdoor);
                solver.setOrder(order);
                IVecInt clause = new VecInt();
                clause.push(1).push(4);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push(2).push(5);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push(3).push(6);
                solver.addClause(clause);
                solver.isSatisfiable();
                org.junit.Assert.fail("testlitNum8 should have thrown ArrayIndexOutOfBoundsException");
            }
            org.junit.Assert.fail("testlitNum8_failAssert8_add755 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("2147483647", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testlitNum3_failAssert3_add483_failAssert44() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                SolverFactory.newGlucose();
                Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                int[] backdoor = new int[]{ Integer.MAX_VALUE, 2, 3 };
                IOrder order = new SubsetVarOrder(backdoor);
                solver.setOrder(order);
                IVecInt clause = new VecInt();
                clause.push(1).push(4);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push(2).push(5);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push(3).push(6);
                solver.addClause(clause);
                solver.isSatisfiable();
                org.junit.Assert.fail("testlitNum3 should have thrown ArrayIndexOutOfBoundsException");
            }
            org.junit.Assert.fail("testlitNum3_failAssert3_add483 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("2147483647", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testlitNum19_failAssert18_add1152_failAssert46() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                SolverFactory.newGlucose();
                Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                int[] backdoor = new int[]{ 1, 2, 3 };
                IOrder order = new SubsetVarOrder(backdoor);
                solver.setOrder(order);
                IVecInt clause = new VecInt();
                clause.push(0).push(4);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push(2).push(5);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push(3).push(6);
                solver.addClause(clause);
                solver.isSatisfiable();
                org.junit.Assert.fail("testlitNum19 should have thrown IllegalArgumentException");
            }
            org.junit.Assert.fail("testlitNum19_failAssert18_add1152 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testlitNum45_failAssert32_add1208_failAssert47() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                SolverFactory.newGlucose();
                Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                int[] backdoor = new int[]{ 1, 2, 3 };
                IOrder order = new SubsetVarOrder(backdoor);
                solver.setOrder(order);
                IVecInt clause = new VecInt();
                clause.push(1).push(4);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push(2).push(5);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push(0).push(6);
                solver.addClause(clause);
                solver.isSatisfiable();
                org.junit.Assert.fail("testlitNum45 should have thrown IllegalArgumentException");
            }
            org.junit.Assert.fail("testlitNum45_failAssert32_add1208 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testlitNum33_failAssert26_add1155_failAssert48() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                SolverFactory.newGlucose();
                Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                int[] backdoor = new int[]{ 1, 2, 3 };
                IOrder order = new SubsetVarOrder(backdoor);
                solver.setOrder(order);
                IVecInt clause = new VecInt();
                clause.push(1).push(4);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push(0).push(5);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push(3).push(6);
                solver.addClause(clause);
                solver.isSatisfiable();
                org.junit.Assert.fail("testlitNum33 should have thrown IllegalArgumentException");
            }
            org.junit.Assert.fail("testlitNum33_failAssert26_add1155 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testlitNum27_failAssert23_add571_failAssert49() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                SolverFactory.newGlucose();
                Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                int[] backdoor = new int[]{ 1, 2, 3 };
                IOrder order = new SubsetVarOrder(backdoor);
                solver.setOrder(order);
                IVecInt clause = new VecInt();
                clause.push(1).push(0);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push(2).push(5);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push(3).push(6);
                solver.addClause(clause);
                solver.isSatisfiable();
                org.junit.Assert.fail("testlitNum27 should have thrown IllegalArgumentException");
            }
            org.junit.Assert.fail("testlitNum27_failAssert23_add571 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testlitNum31_failAssert24_add1250_failAssert50() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                SolverFactory.newGlucose();
                Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                int[] backdoor = new int[]{ 1, 2, 3 };
                IOrder order = new SubsetVarOrder(backdoor);
                solver.setOrder(order);
                IVecInt clause = new VecInt();
                clause.push(1).push(4);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push(Integer.MAX_VALUE).push(5);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push(3).push(6);
                solver.addClause(clause);
                solver.isSatisfiable();
                org.junit.Assert.fail("testlitNum31 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testlitNum31_failAssert24_add1250 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testlitNum25_failAssert21_add778_failAssert52() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                SolverFactory.newGlucose();
                Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                int[] backdoor = new int[]{ 1, 2, 3 };
                IOrder order = new SubsetVarOrder(backdoor);
                solver.setOrder(order);
                IVecInt clause = new VecInt();
                clause.push(1).push(Integer.MAX_VALUE);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push(2).push(5);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push(3).push(6);
                solver.addClause(clause);
                solver.isSatisfiable();
                org.junit.Assert.fail("testlitNum25 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testlitNum25_failAssert21_add778 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testlitNum20_failAssert19_add992_failAssert53() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                SolverFactory.newGlucose();
                Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                int[] backdoor = new int[]{ 1, 2, 3 };
                IOrder order = new SubsetVarOrder(backdoor);
                solver.setOrder(order);
                IVecInt clause = new VecInt();
                clause.push(Integer.MAX_VALUE).push(4);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push(2).push(5);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push(3).push(6);
                solver.addClause(clause);
                solver.isSatisfiable();
                org.junit.Assert.fail("testlitNum20 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testlitNum20_failAssert19_add992 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testlitNum2_failAssert2litNum810_failAssert58() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                int[] backdoor = new int[]{ 0, 1, 3 };
                IOrder order = new SubsetVarOrder(backdoor);
                solver.setOrder(order);
                IVecInt clause = new VecInt();
                clause.push(1).push(4);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push(2).push(5);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push(3).push(6);
                solver.addClause(clause);
                solver.isSatisfiable();
                org.junit.Assert.fail("testlitNum2 should have thrown TimeoutException");
            }
            org.junit.Assert.fail("testlitNum2_failAssert2litNum810 should have thrown TimeoutException");
        } catch (TimeoutException expected) {
            Assert.assertEquals("Cannot decide the satisfiability", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testlitNum2_failAssert2litNum832_failAssert60() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                int[] backdoor = new int[]{ 0, 2, 0 };
                IOrder order = new SubsetVarOrder(backdoor);
                solver.setOrder(order);
                IVecInt clause = new VecInt();
                clause.push(1).push(4);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push(2).push(5);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push(3).push(6);
                solver.addClause(clause);
                solver.isSatisfiable();
                org.junit.Assert.fail("testlitNum2 should have thrown TimeoutException");
            }
            org.junit.Assert.fail("testlitNum2_failAssert2litNum832 should have thrown TimeoutException");
        } catch (TimeoutException expected) {
            Assert.assertEquals("Cannot decide the satisfiability", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testlitNum2_failAssert2litNum920_failAssert65() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                int[] backdoor = new int[]{ 0, 2, 3 };
                IOrder order = new SubsetVarOrder(backdoor);
                solver.setOrder(order);
                IVecInt clause = new VecInt();
                clause.push(1).push(4);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push(2).push(5);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push(3).push(7);
                solver.addClause(clause);
                solver.isSatisfiable();
                org.junit.Assert.fail("testlitNum2 should have thrown TimeoutException");
            }
            org.junit.Assert.fail("testlitNum2_failAssert2litNum920 should have thrown TimeoutException");
        } catch (TimeoutException expected) {
            Assert.assertEquals("Cannot decide the satisfiability", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testlitNum2_failAssert2litNum822_failAssert66() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                int[] backdoor = new int[]{ 0, 2, 4 };
                IOrder order = new SubsetVarOrder(backdoor);
                solver.setOrder(order);
                IVecInt clause = new VecInt();
                clause.push(1).push(4);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push(2).push(5);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push(3).push(6);
                solver.addClause(clause);
                solver.isSatisfiable();
                org.junit.Assert.fail("testlitNum2 should have thrown TimeoutException");
            }
            org.junit.Assert.fail("testlitNum2_failAssert2litNum822 should have thrown TimeoutException");
        } catch (TimeoutException expected) {
            Assert.assertEquals("Cannot decide the satisfiability", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testlitNum2_failAssert2litNum825_failAssert68() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                int[] backdoor = new int[]{ 0, 2, 2 };
                IOrder order = new SubsetVarOrder(backdoor);
                solver.setOrder(order);
                IVecInt clause = new VecInt();
                clause.push(1).push(4);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push(2).push(5);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push(3).push(6);
                solver.addClause(clause);
                solver.isSatisfiable();
                org.junit.Assert.fail("testlitNum2 should have thrown TimeoutException");
            }
            org.junit.Assert.fail("testlitNum2_failAssert2litNum825 should have thrown TimeoutException");
        } catch (TimeoutException expected) {
            Assert.assertEquals("Cannot decide the satisfiability", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testlitNum2_failAssert2litNum809_failAssert72() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                int[] backdoor = new int[]{ 0, 3, 3 };
                IOrder order = new SubsetVarOrder(backdoor);
                solver.setOrder(order);
                IVecInt clause = new VecInt();
                clause.push(1).push(4);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push(2).push(5);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push(3).push(6);
                solver.addClause(clause);
                solver.isSatisfiable();
                org.junit.Assert.fail("testlitNum2 should have thrown TimeoutException");
            }
            org.junit.Assert.fail("testlitNum2_failAssert2litNum809 should have thrown TimeoutException");
        } catch (TimeoutException expected) {
            Assert.assertEquals("Cannot decide the satisfiability", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testlitNum6_failAssert6litNum901_failAssert79() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                int[] backdoor = new int[]{ 1, 3, 3 };
                IOrder order = new SubsetVarOrder(backdoor);
                solver.setOrder(order);
                IVecInt clause = new VecInt();
                clause.push(1).push(4);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push(2).push(5);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push(2).push(6);
                solver.addClause(clause);
                solver.isSatisfiable();
                org.junit.Assert.fail("testlitNum6 should have thrown TimeoutException");
            }
            org.junit.Assert.fail("testlitNum6_failAssert6litNum901 should have thrown TimeoutException");
        } catch (TimeoutException expected) {
            Assert.assertEquals("Cannot decide the satisfiability", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testlitNum6_failAssert6litNum923_failAssert83() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                int[] backdoor = new int[]{ 1, 3, 3 };
                IOrder order = new SubsetVarOrder(backdoor);
                solver.setOrder(order);
                IVecInt clause = new VecInt();
                clause.push(1).push(4);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push(2).push(5);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push(3).push(7);
                solver.addClause(clause);
                solver.isSatisfiable();
                org.junit.Assert.fail("testlitNum6 should have thrown TimeoutException");
            }
            org.junit.Assert.fail("testlitNum6_failAssert6litNum923 should have thrown TimeoutException");
        } catch (TimeoutException expected) {
            Assert.assertEquals("Cannot decide the satisfiability", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testlitNum6_failAssert6litNum838_failAssert86() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                int[] backdoor = new int[]{ 1, 3, 3 };
                IOrder order = new SubsetVarOrder(backdoor);
                solver.setOrder(order);
                IVecInt clause = new VecInt();
                clause.push(1).push(3);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push(2).push(5);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push(3).push(6);
                solver.addClause(clause);
                solver.isSatisfiable();
                org.junit.Assert.fail("testlitNum6 should have thrown TimeoutException");
            }
            org.junit.Assert.fail("testlitNum6_failAssert6litNum838 should have thrown TimeoutException");
        } catch (TimeoutException expected) {
            Assert.assertEquals("Cannot decide the satisfiability", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testlitNum6_failAssert6litNum799_failAssert89() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                int[] backdoor = new int[]{ 1, 3, 4 };
                IOrder order = new SubsetVarOrder(backdoor);
                solver.setOrder(order);
                IVecInt clause = new VecInt();
                clause.push(1).push(4);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push(2).push(5);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push(3).push(6);
                solver.addClause(clause);
                solver.isSatisfiable();
                org.junit.Assert.fail("testlitNum6 should have thrown TimeoutException");
            }
            org.junit.Assert.fail("testlitNum6_failAssert6litNum799 should have thrown TimeoutException");
        } catch (TimeoutException expected) {
            Assert.assertEquals("Cannot decide the satisfiability", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testlitNum1_failAssert1litNum1021_failAssert94() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                int[] backdoor = new int[]{ 2, 3, 3 };
                IOrder order = new SubsetVarOrder(backdoor);
                solver.setOrder(order);
                IVecInt clause = new VecInt();
                clause.push(1).push(4);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push(2).push(5);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push(3).push(6);
                solver.addClause(clause);
                solver.isSatisfiable();
                org.junit.Assert.fail("testlitNum1 should have thrown TimeoutException");
            }
            org.junit.Assert.fail("testlitNum1_failAssert1litNum1021 should have thrown TimeoutException");
        } catch (TimeoutException expected) {
            Assert.assertEquals("Cannot decide the satisfiability", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testlitNum1_failAssert1litNum1043_failAssert100() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                int[] backdoor = new int[]{ 2, 2, 2 };
                IOrder order = new SubsetVarOrder(backdoor);
                solver.setOrder(order);
                IVecInt clause = new VecInt();
                clause.push(1).push(4);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push(2).push(5);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push(3).push(6);
                solver.addClause(clause);
                solver.isSatisfiable();
                org.junit.Assert.fail("testlitNum1 should have thrown TimeoutException");
            }
            org.junit.Assert.fail("testlitNum1_failAssert1litNum1043 should have thrown TimeoutException");
        } catch (TimeoutException expected) {
            Assert.assertEquals("Cannot decide the satisfiability", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testlitNum10_failAssert10litNum502_failAssert111() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                int[] backdoor = new int[]{ 1, 0, 3 };
                IOrder order = new SubsetVarOrder(backdoor);
                solver.setOrder(order);
                IVecInt clause = new VecInt();
                clause.push(1).push(3);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push(2).push(5);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push(3).push(6);
                solver.addClause(clause);
                solver.isSatisfiable();
                org.junit.Assert.fail("testlitNum10 should have thrown TimeoutException");
            }
            org.junit.Assert.fail("testlitNum10_failAssert10litNum502 should have thrown TimeoutException");
        } catch (TimeoutException expected) {
            Assert.assertEquals("Cannot decide the satisfiability", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testlitNum13_failAssert13litNum606_failAssert141() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                int[] backdoor = new int[]{ 1, 2, 2 };
                IOrder order = new SubsetVarOrder(backdoor);
                solver.setOrder(order);
                IVecInt clause = new VecInt();
                clause.push(2).push(4);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push(2).push(5);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push(3).push(6);
                solver.addClause(clause);
                solver.isSatisfiable();
                org.junit.Assert.fail("testlitNum13 should have thrown TimeoutException");
            }
            org.junit.Assert.fail("testlitNum13_failAssert13litNum606 should have thrown TimeoutException");
        } catch (TimeoutException expected) {
            Assert.assertEquals("Cannot decide the satisfiability", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testlitNum1_failAssert1litNum1100_failAssert151() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                int[] backdoor = new int[]{ 2, 2, 3 };
                IOrder order = new SubsetVarOrder(backdoor);
                solver.setOrder(order);
                IVecInt clause = new VecInt();
                clause.push(1).push(4);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push(64193086).push(5);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push(3).push(6);
                solver.addClause(clause);
                solver.isSatisfiable();
                org.junit.Assert.fail("testlitNum1 should have thrown TimeoutException");
            }
            org.junit.Assert.fail("testlitNum1_failAssert1litNum1100 should have thrown TimeoutException");
        } catch (TimeoutException expected) {
            Assert.assertEquals("Cannot decide the satisfiability", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testlitNum50_failAssert34litNum1014_failAssert165() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                int[] backdoor = new int[]{ 1, 2, 3 };
                IOrder order = new SubsetVarOrder(backdoor);
                solver.setOrder(order);
                IVecInt clause = new VecInt();
                clause.push(1).push(4);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push(2).push(Integer.MIN_VALUE);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push(3).push(Integer.MIN_VALUE);
                solver.addClause(clause);
                solver.isSatisfiable();
                org.junit.Assert.fail("testlitNum50 should have thrown ArrayIndexOutOfBoundsException");
            }
            org.junit.Assert.fail("testlitNum50_failAssert34litNum1014 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-2147483648", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testlitNum2_failAssert2litNum819_failAssert166() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                int[] backdoor = new int[]{ 0, 1365792299, 3 };
                IOrder order = new SubsetVarOrder(backdoor);
                solver.setOrder(order);
                IVecInt clause = new VecInt();
                clause.push(1).push(4);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push(2).push(5);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push(3).push(6);
                solver.addClause(clause);
                solver.isSatisfiable();
                org.junit.Assert.fail("testlitNum2 should have thrown TimeoutException");
            }
            org.junit.Assert.fail("testlitNum2_failAssert2litNum819 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("1365792299", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testlitNum50_failAssert34_add1132_failAssert37_add2715_failAssert193() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    SolverFactory.newGlucose();
                    SolverFactory.newGlucose();
                    Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                    int[] backdoor = new int[]{ 1, 2, 3 };
                    IOrder order = new SubsetVarOrder(backdoor);
                    solver.setOrder(order);
                    IVecInt clause = new VecInt();
                    clause.push(1).push(4);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push(2).push(5);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push(3).push(Integer.MIN_VALUE);
                    solver.addClause(clause);
                    solver.isSatisfiable();
                    org.junit.Assert.fail("testlitNum50 should have thrown ArrayIndexOutOfBoundsException");
                }
                org.junit.Assert.fail("testlitNum50_failAssert34_add1132 should have thrown ArrayIndexOutOfBoundsException");
            }
            org.junit.Assert.fail("testlitNum50_failAssert34_add1132_failAssert37_add2715 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-2147483648", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testlitNum15_failAssert15_add570_failAssert39_add2254_failAssert196() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    SolverFactory.newGlucose();
                    SolverFactory.newGlucose();
                    Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                    int[] backdoor = new int[]{ 1, 2, Integer.MIN_VALUE };
                    IOrder order = new SubsetVarOrder(backdoor);
                    solver.setOrder(order);
                    IVecInt clause = new VecInt();
                    clause.push(1).push(4);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push(2).push(5);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push(3).push(6);
                    solver.addClause(clause);
                    solver.isSatisfiable();
                    org.junit.Assert.fail("testlitNum15 should have thrown ArrayIndexOutOfBoundsException");
                }
                org.junit.Assert.fail("testlitNum15_failAssert15_add570 should have thrown ArrayIndexOutOfBoundsException");
            }
            org.junit.Assert.fail("testlitNum15_failAssert15_add570_failAssert39_add2254 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-2147483648", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testlitNum21_failAssert20_add397_failAssert40_add2494_failAssert198() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    SolverFactory.newGlucose();
                    SolverFactory.newGlucose();
                    Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                    int[] backdoor = new int[]{ 1, 2, 3 };
                    IOrder order = new SubsetVarOrder(backdoor);
                    solver.setOrder(order);
                    IVecInt clause = new VecInt();
                    clause.push(Integer.MIN_VALUE).push(4);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push(2).push(5);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push(3).push(6);
                    solver.addClause(clause);
                    solver.isSatisfiable();
                    org.junit.Assert.fail("testlitNum21 should have thrown ArrayIndexOutOfBoundsException");
                }
                org.junit.Assert.fail("testlitNum21_failAssert20_add397 should have thrown ArrayIndexOutOfBoundsException");
            }
            org.junit.Assert.fail("testlitNum21_failAssert20_add397_failAssert40_add2494 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-2147483648", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testlitNum8_failAssert8_add755_failAssert43_add2235_failAssert201() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    SolverFactory.newGlucose();
                    SolverFactory.newGlucose();
                    Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                    int[] backdoor = new int[]{ 1, Integer.MAX_VALUE, 3 };
                    IOrder order = new SubsetVarOrder(backdoor);
                    solver.setOrder(order);
                    IVecInt clause = new VecInt();
                    clause.push(1).push(4);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push(2).push(5);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push(3).push(6);
                    solver.addClause(clause);
                    solver.isSatisfiable();
                    org.junit.Assert.fail("testlitNum8 should have thrown ArrayIndexOutOfBoundsException");
                }
                org.junit.Assert.fail("testlitNum8_failAssert8_add755 should have thrown ArrayIndexOutOfBoundsException");
            }
            org.junit.Assert.fail("testlitNum8_failAssert8_add755_failAssert43_add2235 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("2147483647", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testlitNum3_failAssert3_add483_failAssert44_add2468_failAssert203() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    SolverFactory.newGlucose();
                    SolverFactory.newGlucose();
                    Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                    int[] backdoor = new int[]{ Integer.MAX_VALUE, 2, 3 };
                    IOrder order = new SubsetVarOrder(backdoor);
                    solver.setOrder(order);
                    IVecInt clause = new VecInt();
                    clause.push(1).push(4);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push(2).push(5);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push(3).push(6);
                    solver.addClause(clause);
                    solver.isSatisfiable();
                    org.junit.Assert.fail("testlitNum3 should have thrown ArrayIndexOutOfBoundsException");
                }
                org.junit.Assert.fail("testlitNum3_failAssert3_add483 should have thrown ArrayIndexOutOfBoundsException");
            }
            org.junit.Assert.fail("testlitNum3_failAssert3_add483_failAssert44_add2468 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("2147483647", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testlitNum19_failAssert18_add1152_failAssert46_add2669_failAssert206() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    SolverFactory.newGlucose();
                    SolverFactory.newGlucose();
                    Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                    int[] backdoor = new int[]{ 1, 2, 3 };
                    IOrder order = new SubsetVarOrder(backdoor);
                    solver.setOrder(order);
                    IVecInt clause = new VecInt();
                    clause.push(0).push(4);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push(2).push(5);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push(3).push(6);
                    solver.addClause(clause);
                    solver.isSatisfiable();
                    org.junit.Assert.fail("testlitNum19 should have thrown IllegalArgumentException");
                }
                org.junit.Assert.fail("testlitNum19_failAssert18_add1152 should have thrown IllegalArgumentException");
            }
            org.junit.Assert.fail("testlitNum19_failAssert18_add1152_failAssert46_add2669 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testlitNum31_failAssert24_add1250_failAssert50_add2099_failAssert208() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    SolverFactory.newGlucose();
                    SolverFactory.newGlucose();
                    Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                    int[] backdoor = new int[]{ 1, 2, 3 };
                    IOrder order = new SubsetVarOrder(backdoor);
                    solver.setOrder(order);
                    IVecInt clause = new VecInt();
                    clause.push(1).push(4);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push(Integer.MAX_VALUE).push(5);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push(3).push(6);
                    solver.addClause(clause);
                    solver.isSatisfiable();
                    org.junit.Assert.fail("testlitNum31 should have thrown NegativeArraySizeException");
                }
                org.junit.Assert.fail("testlitNum31_failAssert24_add1250 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testlitNum31_failAssert24_add1250_failAssert50_add2099 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testlitNum45_failAssert32_add1208_failAssert47_add2848_failAssert209() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    SolverFactory.newGlucose();
                    SolverFactory.newGlucose();
                    Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                    int[] backdoor = new int[]{ 1, 2, 3 };
                    IOrder order = new SubsetVarOrder(backdoor);
                    solver.setOrder(order);
                    IVecInt clause = new VecInt();
                    clause.push(1).push(4);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push(2).push(5);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push(0).push(6);
                    solver.addClause(clause);
                    solver.isSatisfiable();
                    org.junit.Assert.fail("testlitNum45 should have thrown IllegalArgumentException");
                }
                org.junit.Assert.fail("testlitNum45_failAssert32_add1208 should have thrown IllegalArgumentException");
            }
            org.junit.Assert.fail("testlitNum45_failAssert32_add1208_failAssert47_add2848 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testlitNum33_failAssert26_add1155_failAssert48_add2249_failAssert211() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    SolverFactory.newGlucose();
                    SolverFactory.newGlucose();
                    Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                    int[] backdoor = new int[]{ 1, 2, 3 };
                    IOrder order = new SubsetVarOrder(backdoor);
                    solver.setOrder(order);
                    IVecInt clause = new VecInt();
                    clause.push(1).push(4);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push(0).push(5);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push(3).push(6);
                    solver.addClause(clause);
                    solver.isSatisfiable();
                    org.junit.Assert.fail("testlitNum33 should have thrown IllegalArgumentException");
                }
                org.junit.Assert.fail("testlitNum33_failAssert26_add1155 should have thrown IllegalArgumentException");
            }
            org.junit.Assert.fail("testlitNum33_failAssert26_add1155_failAssert48_add2249 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testlitNum25_failAssert21_add778_failAssert52_add2859_failAssert215() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    SolverFactory.newGlucose();
                    SolverFactory.newGlucose();
                    Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                    int[] backdoor = new int[]{ 1, 2, 3 };
                    IOrder order = new SubsetVarOrder(backdoor);
                    solver.setOrder(order);
                    IVecInt clause = new VecInt();
                    clause.push(1).push(Integer.MAX_VALUE);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push(2).push(5);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push(3).push(6);
                    solver.addClause(clause);
                    solver.isSatisfiable();
                    org.junit.Assert.fail("testlitNum25 should have thrown NegativeArraySizeException");
                }
                org.junit.Assert.fail("testlitNum25_failAssert21_add778 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testlitNum25_failAssert21_add778_failAssert52_add2859 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testlitNum20_failAssert19_add992_failAssert53_add3003_failAssert217() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    SolverFactory.newGlucose();
                    SolverFactory.newGlucose();
                    Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                    int[] backdoor = new int[]{ 1, 2, 3 };
                    IOrder order = new SubsetVarOrder(backdoor);
                    solver.setOrder(order);
                    IVecInt clause = new VecInt();
                    clause.push(Integer.MAX_VALUE).push(4);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push(2).push(5);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push(3).push(6);
                    solver.addClause(clause);
                    solver.isSatisfiable();
                    org.junit.Assert.fail("testlitNum20 should have thrown NegativeArraySizeException");
                }
                org.junit.Assert.fail("testlitNum20_failAssert19_add992 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testlitNum20_failAssert19_add992_failAssert53_add3003 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testlitNum27_failAssert23_add571_failAssert49_add1879_failAssert220() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    SolverFactory.newGlucose();
                    SolverFactory.newGlucose();
                    Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                    int[] backdoor = new int[]{ 1, 2, 3 };
                    IOrder order = new SubsetVarOrder(backdoor);
                    solver.setOrder(order);
                    IVecInt clause = new VecInt();
                    clause.push(1).push(0);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push(2).push(5);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push(3).push(6);
                    solver.addClause(clause);
                    solver.isSatisfiable();
                    org.junit.Assert.fail("testlitNum27 should have thrown IllegalArgumentException");
                }
                org.junit.Assert.fail("testlitNum27_failAssert23_add571 should have thrown IllegalArgumentException");
            }
            org.junit.Assert.fail("testlitNum27_failAssert23_add571_failAssert49_add1879 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testlitNum21_failAssert20_add397_failAssert40_add2497_failAssert256() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    SolverFactory.newGlucose();
                    Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                    int[] backdoor = new int[]{ 1, 2, 3 };
                    IOrder order = new SubsetVarOrder(backdoor);
                    solver.setOrder(order);
                    solver.setOrder(order);
                    IVecInt clause = new VecInt();
                    clause.push(Integer.MIN_VALUE).push(4);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push(2).push(5);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push(3).push(6);
                    solver.addClause(clause);
                    solver.isSatisfiable();
                    org.junit.Assert.fail("testlitNum21 should have thrown ArrayIndexOutOfBoundsException");
                }
                org.junit.Assert.fail("testlitNum21_failAssert20_add397 should have thrown ArrayIndexOutOfBoundsException");
            }
            org.junit.Assert.fail("testlitNum21_failAssert20_add397_failAssert40_add2497 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-2147483648", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testlitNum2_failAssert2litNum832_failAssert60litNum2601_failAssert258() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                    int[] backdoor = new int[]{ 0, 2, 0 };
                    IOrder order = new SubsetVarOrder(backdoor);
                    solver.setOrder(order);
                    IVecInt clause = new VecInt();
                    clause.push(1).push(4);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push(2).push(5);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push(3).push(5);
                    solver.addClause(clause);
                    solver.isSatisfiable();
                    org.junit.Assert.fail("testlitNum2 should have thrown TimeoutException");
                }
                org.junit.Assert.fail("testlitNum2_failAssert2litNum832 should have thrown TimeoutException");
            }
            org.junit.Assert.fail("testlitNum2_failAssert2litNum832_failAssert60litNum2601 should have thrown TimeoutException");
        } catch (TimeoutException expected) {
            Assert.assertEquals("Cannot decide the satisfiability", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testlitNum2_failAssert2litNum810_failAssert58litNum2322_failAssert259() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                    int[] backdoor = new int[]{ 0, 1, 3 };
                    IOrder order = new SubsetVarOrder(backdoor);
                    solver.setOrder(order);
                    IVecInt clause = new VecInt();
                    clause.push(1).push(3);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push(2).push(5);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push(3).push(6);
                    solver.addClause(clause);
                    solver.isSatisfiable();
                    org.junit.Assert.fail("testlitNum2 should have thrown TimeoutException");
                }
                org.junit.Assert.fail("testlitNum2_failAssert2litNum810 should have thrown TimeoutException");
            }
            org.junit.Assert.fail("testlitNum2_failAssert2litNum810_failAssert58litNum2322 should have thrown TimeoutException");
        } catch (TimeoutException expected) {
            Assert.assertEquals("Cannot decide the satisfiability", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testlitNum2_failAssert2litNum810_failAssert58litNum2402_failAssert262() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                    int[] backdoor = new int[]{ 0, 1, 3 };
                    IOrder order = new SubsetVarOrder(backdoor);
                    solver.setOrder(order);
                    IVecInt clause = new VecInt();
                    clause.push(1).push(4);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push(2).push(5);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push(3).push(7);
                    solver.addClause(clause);
                    solver.isSatisfiable();
                    org.junit.Assert.fail("testlitNum2 should have thrown TimeoutException");
                }
                org.junit.Assert.fail("testlitNum2_failAssert2litNum810 should have thrown TimeoutException");
            }
            org.junit.Assert.fail("testlitNum2_failAssert2litNum810_failAssert58litNum2402 should have thrown TimeoutException");
        } catch (TimeoutException expected) {
            Assert.assertEquals("Cannot decide the satisfiability", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testlitNum2_failAssert2litNum832_failAssert60litNum2505_failAssert263() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                    int[] backdoor = new int[]{ 0, 0, 0 };
                    IOrder order = new SubsetVarOrder(backdoor);
                    solver.setOrder(order);
                    IVecInt clause = new VecInt();
                    clause.push(1).push(4);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push(2).push(5);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push(3).push(6);
                    solver.addClause(clause);
                    solver.isSatisfiable();
                    org.junit.Assert.fail("testlitNum2 should have thrown TimeoutException");
                }
                org.junit.Assert.fail("testlitNum2_failAssert2litNum832 should have thrown TimeoutException");
            }
            org.junit.Assert.fail("testlitNum2_failAssert2litNum832_failAssert60litNum2505 should have thrown TimeoutException");
        } catch (TimeoutException expected) {
            Assert.assertEquals("Cannot decide the satisfiability", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testlitNum2_failAssert2litNum832_failAssert60litNum2511_failAssert264() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                    int[] backdoor = new int[]{ 0, 2, 0 };
                    IOrder order = new SubsetVarOrder(backdoor);
                    solver.setOrder(order);
                    IVecInt clause = new VecInt();
                    clause.push(2).push(4);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push(2).push(5);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push(3).push(6);
                    solver.addClause(clause);
                    solver.isSatisfiable();
                    org.junit.Assert.fail("testlitNum2 should have thrown TimeoutException");
                }
                org.junit.Assert.fail("testlitNum2_failAssert2litNum832 should have thrown TimeoutException");
            }
            org.junit.Assert.fail("testlitNum2_failAssert2litNum832_failAssert60litNum2511 should have thrown TimeoutException");
        } catch (TimeoutException expected) {
            Assert.assertEquals("Cannot decide the satisfiability", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testlitNum2_failAssert2litNum832_failAssert60litNum2560_failAssert272() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                    int[] backdoor = new int[]{ 0, 2, 0 };
                    IOrder order = new SubsetVarOrder(backdoor);
                    solver.setOrder(order);
                    IVecInt clause = new VecInt();
                    clause.push(1).push(4);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push(2).push(4);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push(3).push(6);
                    solver.addClause(clause);
                    solver.isSatisfiable();
                    org.junit.Assert.fail("testlitNum2 should have thrown TimeoutException");
                }
                org.junit.Assert.fail("testlitNum2_failAssert2litNum832 should have thrown TimeoutException");
            }
            org.junit.Assert.fail("testlitNum2_failAssert2litNum832_failAssert60litNum2560 should have thrown TimeoutException");
        } catch (TimeoutException expected) {
            Assert.assertEquals("Cannot decide the satisfiability", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testlitNum2_failAssert2litNum822_failAssert66litNum1701_failAssert287() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                    int[] backdoor = new int[]{ 0, 2, 4 };
                    IOrder order = new SubsetVarOrder(backdoor);
                    solver.setOrder(order);
                    IVecInt clause = new VecInt();
                    clause.push(1).push(4);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push(3).push(5);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push(3).push(6);
                    solver.addClause(clause);
                    solver.isSatisfiable();
                    org.junit.Assert.fail("testlitNum2 should have thrown TimeoutException");
                }
                org.junit.Assert.fail("testlitNum2_failAssert2litNum822 should have thrown TimeoutException");
            }
            org.junit.Assert.fail("testlitNum2_failAssert2litNum822_failAssert66litNum1701 should have thrown TimeoutException");
        } catch (TimeoutException expected) {
            Assert.assertEquals("Cannot decide the satisfiability", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testlitNum2_failAssert2litNum832_failAssert60litNum2557_failAssert294() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                    int[] backdoor = new int[]{ 0, 2, 0 };
                    IOrder order = new SubsetVarOrder(backdoor);
                    solver.setOrder(order);
                    IVecInt clause = new VecInt();
                    clause.push(1).push(4);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push(2).push(6);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push(3).push(6);
                    solver.addClause(clause);
                    solver.isSatisfiable();
                    org.junit.Assert.fail("testlitNum2 should have thrown TimeoutException");
                }
                org.junit.Assert.fail("testlitNum2_failAssert2litNum832 should have thrown TimeoutException");
            }
            org.junit.Assert.fail("testlitNum2_failAssert2litNum832_failAssert60litNum2557 should have thrown TimeoutException");
        } catch (TimeoutException expected) {
            Assert.assertEquals("Cannot decide the satisfiability", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testlitNum2_failAssert2litNum809_failAssert72litNum1703_failAssert311() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                    int[] backdoor = new int[]{ 0, 3, 3 };
                    IOrder order = new SubsetVarOrder(backdoor);
                    solver.setOrder(order);
                    IVecInt clause = new VecInt();
                    clause.push(1).push(4);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push(1).push(5);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push(3).push(6);
                    solver.addClause(clause);
                    solver.isSatisfiable();
                    org.junit.Assert.fail("testlitNum2 should have thrown TimeoutException");
                }
                org.junit.Assert.fail("testlitNum2_failAssert2litNum809 should have thrown TimeoutException");
            }
            org.junit.Assert.fail("testlitNum2_failAssert2litNum809_failAssert72litNum1703 should have thrown TimeoutException");
        } catch (TimeoutException expected) {
            Assert.assertEquals("Cannot decide the satisfiability", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testlitNum2_failAssert2litNum825_failAssert68litNum1830_failAssert322() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                    int[] backdoor = new int[]{ 0, 2, 2 };
                    IOrder order = new SubsetVarOrder(backdoor);
                    solver.setOrder(order);
                    IVecInt clause = new VecInt();
                    clause.push(2).push(4);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push(2).push(5);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push(3).push(6);
                    solver.addClause(clause);
                    solver.isSatisfiable();
                    org.junit.Assert.fail("testlitNum2 should have thrown TimeoutException");
                }
                org.junit.Assert.fail("testlitNum2_failAssert2litNum825 should have thrown TimeoutException");
            }
            org.junit.Assert.fail("testlitNum2_failAssert2litNum825_failAssert68litNum1830 should have thrown TimeoutException");
        } catch (TimeoutException expected) {
            Assert.assertEquals("Cannot decide the satisfiability", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testlitNum2_failAssert2litNum822_failAssert66litNum1757_failAssert332() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                    int[] backdoor = new int[]{ 0, 2, 4 };
                    IOrder order = new SubsetVarOrder(backdoor);
                    solver.setOrder(order);
                    IVecInt clause = new VecInt();
                    clause.push(1).push(4);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push(2).push(5);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push(3).push(7);
                    solver.addClause(clause);
                    solver.isSatisfiable();
                    org.junit.Assert.fail("testlitNum2 should have thrown TimeoutException");
                }
                org.junit.Assert.fail("testlitNum2_failAssert2litNum822 should have thrown TimeoutException");
            }
            org.junit.Assert.fail("testlitNum2_failAssert2litNum822_failAssert66litNum1757 should have thrown TimeoutException");
        } catch (TimeoutException expected) {
            Assert.assertEquals("Cannot decide the satisfiability", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testlitNum2_failAssert2litNum809_failAssert72litNum1691_failAssert339() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                    int[] backdoor = new int[]{ 0, 3, 3 };
                    IOrder order = new SubsetVarOrder(backdoor);
                    solver.setOrder(order);
                    IVecInt clause = new VecInt();
                    clause.push(1).push(3);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push(2).push(5);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push(3).push(6);
                    solver.addClause(clause);
                    solver.isSatisfiable();
                    org.junit.Assert.fail("testlitNum2 should have thrown TimeoutException");
                }
                org.junit.Assert.fail("testlitNum2_failAssert2litNum809 should have thrown TimeoutException");
            }
            org.junit.Assert.fail("testlitNum2_failAssert2litNum809_failAssert72litNum1691 should have thrown TimeoutException");
        } catch (TimeoutException expected) {
            Assert.assertEquals("Cannot decide the satisfiability", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testlitNum2_failAssert2litNum809_failAssert72litNum1665_failAssert344() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                    int[] backdoor = new int[]{ 0, 3, 2 };
                    IOrder order = new SubsetVarOrder(backdoor);
                    solver.setOrder(order);
                    IVecInt clause = new VecInt();
                    clause.push(1).push(4);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push(2).push(5);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push(3).push(6);
                    solver.addClause(clause);
                    solver.isSatisfiable();
                    org.junit.Assert.fail("testlitNum2 should have thrown TimeoutException");
                }
                org.junit.Assert.fail("testlitNum2_failAssert2litNum809 should have thrown TimeoutException");
            }
            org.junit.Assert.fail("testlitNum2_failAssert2litNum809_failAssert72litNum1665 should have thrown TimeoutException");
        } catch (TimeoutException expected) {
            Assert.assertEquals("Cannot decide the satisfiability", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testlitNum2_failAssert2litNum825_failAssert68litNum1836_failAssert347() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                    int[] backdoor = new int[]{ 0, 2, 2 };
                    IOrder order = new SubsetVarOrder(backdoor);
                    solver.setOrder(order);
                    IVecInt clause = new VecInt();
                    clause.push(1).push(5);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push(2).push(5);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push(3).push(6);
                    solver.addClause(clause);
                    solver.isSatisfiable();
                    org.junit.Assert.fail("testlitNum2 should have thrown TimeoutException");
                }
                org.junit.Assert.fail("testlitNum2_failAssert2litNum825 should have thrown TimeoutException");
            }
            org.junit.Assert.fail("testlitNum2_failAssert2litNum825_failAssert68litNum1836 should have thrown TimeoutException");
        } catch (TimeoutException expected) {
            Assert.assertEquals("Cannot decide the satisfiability", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testlitNum6_failAssert6litNum838_failAssert86litNum2001_failAssert381() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                    int[] backdoor = new int[]{ 1, 3, 3 };
                    IOrder order = new SubsetVarOrder(backdoor);
                    solver.setOrder(order);
                    IVecInt clause = new VecInt();
                    clause.push(1).push(3);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push(2).push(5);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push(2).push(6);
                    solver.addClause(clause);
                    solver.isSatisfiable();
                    org.junit.Assert.fail("testlitNum6 should have thrown TimeoutException");
                }
                org.junit.Assert.fail("testlitNum6_failAssert6litNum838 should have thrown TimeoutException");
            }
            org.junit.Assert.fail("testlitNum6_failAssert6litNum838_failAssert86litNum2001 should have thrown TimeoutException");
        } catch (TimeoutException expected) {
            Assert.assertEquals("Cannot decide the satisfiability", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test2litNum3416_failAssert383() throws Exception, ContradictionException, TimeoutException {
        try {
            Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
            int[] backdoor = new int[]{ 2, 2, 3 };
            IOrder order = new SubsetVarOrder(backdoor);
            solver.setOrder(order);
            IVecInt clause = new VecInt();
            clause.push((-1)).push(4);
            solver.addClause(clause);
            clause = new VecInt();
            clause.push((-2)).push(5);
            solver.addClause(clause);
            clause = new VecInt();
            clause.push((-3)).push(6);
            solver.addClause(clause);
            solver.isSatisfiable();
            org.junit.Assert.fail("test2litNum3416 should have thrown TimeoutException");
        } catch (TimeoutException expected) {
            Assert.assertEquals("Cannot decide the satisfiability", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test2litNum3417_failAssert384() throws Exception, ContradictionException, TimeoutException {
        try {
            Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
            int[] backdoor = new int[]{ 0, 2, 3 };
            IOrder order = new SubsetVarOrder(backdoor);
            solver.setOrder(order);
            IVecInt clause = new VecInt();
            clause.push((-1)).push(4);
            solver.addClause(clause);
            clause = new VecInt();
            clause.push((-2)).push(5);
            solver.addClause(clause);
            clause = new VecInt();
            clause.push((-3)).push(6);
            solver.addClause(clause);
            solver.isSatisfiable();
            org.junit.Assert.fail("test2litNum3417 should have thrown TimeoutException");
        } catch (TimeoutException expected) {
            Assert.assertEquals("Cannot decide the satisfiability", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test2litNum3418_failAssert385() throws Exception, ContradictionException, TimeoutException {
        try {
            Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
            int[] backdoor = new int[]{ Integer.MAX_VALUE, 2, 3 };
            IOrder order = new SubsetVarOrder(backdoor);
            solver.setOrder(order);
            IVecInt clause = new VecInt();
            clause.push((-1)).push(4);
            solver.addClause(clause);
            clause = new VecInt();
            clause.push((-2)).push(5);
            solver.addClause(clause);
            clause = new VecInt();
            clause.push((-3)).push(6);
            solver.addClause(clause);
            solver.isSatisfiable();
            org.junit.Assert.fail("test2litNum3418 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("2147483647", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test2litNum3421_failAssert388() throws Exception, ContradictionException, TimeoutException {
        try {
            Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
            int[] backdoor = new int[]{ 1, 3, 3 };
            IOrder order = new SubsetVarOrder(backdoor);
            solver.setOrder(order);
            IVecInt clause = new VecInt();
            clause.push((-1)).push(4);
            solver.addClause(clause);
            clause = new VecInt();
            clause.push((-2)).push(5);
            solver.addClause(clause);
            clause = new VecInt();
            clause.push((-3)).push(6);
            solver.addClause(clause);
            solver.isSatisfiable();
            org.junit.Assert.fail("test2litNum3421 should have thrown TimeoutException");
        } catch (TimeoutException expected) {
            Assert.assertEquals("Cannot decide the satisfiability", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test2litNum3422_failAssert389() throws Exception, ContradictionException, TimeoutException {
        try {
            Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
            int[] backdoor = new int[]{ 1, 1, 3 };
            IOrder order = new SubsetVarOrder(backdoor);
            solver.setOrder(order);
            IVecInt clause = new VecInt();
            clause.push((-1)).push(4);
            solver.addClause(clause);
            clause = new VecInt();
            clause.push((-2)).push(5);
            solver.addClause(clause);
            clause = new VecInt();
            clause.push((-3)).push(6);
            solver.addClause(clause);
            solver.isSatisfiable();
            org.junit.Assert.fail("test2litNum3422 should have thrown TimeoutException");
        } catch (TimeoutException expected) {
            Assert.assertEquals("Cannot decide the satisfiability", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test2litNum3423_failAssert390() throws Exception, ContradictionException, TimeoutException {
        try {
            Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
            int[] backdoor = new int[]{ 1, Integer.MAX_VALUE, 3 };
            IOrder order = new SubsetVarOrder(backdoor);
            solver.setOrder(order);
            IVecInt clause = new VecInt();
            clause.push((-1)).push(4);
            solver.addClause(clause);
            clause = new VecInt();
            clause.push((-2)).push(5);
            solver.addClause(clause);
            clause = new VecInt();
            clause.push((-3)).push(6);
            solver.addClause(clause);
            solver.isSatisfiable();
            org.junit.Assert.fail("test2litNum3423 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("2147483647", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test2litNum3425_failAssert392() throws Exception, ContradictionException, TimeoutException {
        try {
            Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
            int[] backdoor = new int[]{ 1, 0, 3 };
            IOrder order = new SubsetVarOrder(backdoor);
            solver.setOrder(order);
            IVecInt clause = new VecInt();
            clause.push((-1)).push(4);
            solver.addClause(clause);
            clause = new VecInt();
            clause.push((-2)).push(5);
            solver.addClause(clause);
            clause = new VecInt();
            clause.push((-3)).push(6);
            solver.addClause(clause);
            solver.isSatisfiable();
            org.junit.Assert.fail("test2litNum3425 should have thrown TimeoutException");
        } catch (TimeoutException expected) {
            Assert.assertEquals("Cannot decide the satisfiability", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test2litNum3427_failAssert394() throws Exception, ContradictionException, TimeoutException {
        try {
            Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
            int[] backdoor = new int[]{ 1, 2, 4 };
            IOrder order = new SubsetVarOrder(backdoor);
            solver.setOrder(order);
            IVecInt clause = new VecInt();
            clause.push((-1)).push(4);
            solver.addClause(clause);
            clause = new VecInt();
            clause.push((-2)).push(5);
            solver.addClause(clause);
            clause = new VecInt();
            clause.push((-3)).push(6);
            solver.addClause(clause);
            solver.isSatisfiable();
            org.junit.Assert.fail("test2litNum3427 should have thrown TimeoutException");
        } catch (TimeoutException expected) {
            Assert.assertEquals("Cannot decide the satisfiability", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test2litNum3429_failAssert396() throws Exception, ContradictionException, TimeoutException {
        try {
            Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
            int[] backdoor = new int[]{ 1, 2, Integer.MAX_VALUE };
            IOrder order = new SubsetVarOrder(backdoor);
            solver.setOrder(order);
            IVecInt clause = new VecInt();
            clause.push((-1)).push(4);
            solver.addClause(clause);
            clause = new VecInt();
            clause.push((-2)).push(5);
            solver.addClause(clause);
            clause = new VecInt();
            clause.push((-3)).push(6);
            solver.addClause(clause);
            solver.isSatisfiable();
            org.junit.Assert.fail("test2litNum3429 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("2147483647", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test2litNum3434_failAssert400() throws Exception, ContradictionException, TimeoutException {
        try {
            Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
            int[] backdoor = new int[]{ 1, 2, 3 };
            IOrder order = new SubsetVarOrder(backdoor);
            solver.setOrder(order);
            IVecInt clause = new VecInt();
            clause.push((-0)).push(4);
            solver.addClause(clause);
            clause = new VecInt();
            clause.push((-2)).push(5);
            solver.addClause(clause);
            clause = new VecInt();
            clause.push((-3)).push(6);
            solver.addClause(clause);
            solver.isSatisfiable();
            org.junit.Assert.fail("test2litNum3434 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test2litNum3435_failAssert401() throws Exception, ContradictionException, TimeoutException {
        try {
            Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
            int[] backdoor = new int[]{ 1, 2, 3 };
            IOrder order = new SubsetVarOrder(backdoor);
            solver.setOrder(order);
            IVecInt clause = new VecInt();
            clause.push((-(Integer.MAX_VALUE))).push(4);
            solver.addClause(clause);
            clause = new VecInt();
            clause.push((-2)).push(5);
            solver.addClause(clause);
            clause = new VecInt();
            clause.push((-3)).push(6);
            solver.addClause(clause);
            solver.isSatisfiable();
            org.junit.Assert.fail("test2litNum3435 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test2litNum3436_failAssert402() throws Exception, ContradictionException, TimeoutException {
        try {
            Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
            int[] backdoor = new int[]{ 1, 2, 3 };
            IOrder order = new SubsetVarOrder(backdoor);
            solver.setOrder(order);
            IVecInt clause = new VecInt();
            clause.push((-(Integer.MIN_VALUE))).push(4);
            solver.addClause(clause);
            clause = new VecInt();
            clause.push((-2)).push(5);
            solver.addClause(clause);
            clause = new VecInt();
            clause.push((-3)).push(6);
            solver.addClause(clause);
            solver.isSatisfiable();
            org.junit.Assert.fail("test2litNum3436 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-2147483648", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test2litNum3440_failAssert403() throws Exception, ContradictionException, TimeoutException {
        try {
            Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
            int[] backdoor = new int[]{ 1, 2, 3 };
            IOrder order = new SubsetVarOrder(backdoor);
            solver.setOrder(order);
            IVecInt clause = new VecInt();
            clause.push((-1)).push(Integer.MAX_VALUE);
            solver.addClause(clause);
            clause = new VecInt();
            clause.push((-2)).push(5);
            solver.addClause(clause);
            clause = new VecInt();
            clause.push((-3)).push(6);
            solver.addClause(clause);
            solver.isSatisfiable();
            org.junit.Assert.fail("test2litNum3440 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test2litNum3442_failAssert405() throws Exception, ContradictionException, TimeoutException {
        try {
            Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
            int[] backdoor = new int[]{ 1, 2, 3 };
            IOrder order = new SubsetVarOrder(backdoor);
            solver.setOrder(order);
            IVecInt clause = new VecInt();
            clause.push((-1)).push(0);
            solver.addClause(clause);
            clause = new VecInt();
            clause.push((-2)).push(5);
            solver.addClause(clause);
            clause = new VecInt();
            clause.push((-3)).push(6);
            solver.addClause(clause);
            solver.isSatisfiable();
            org.junit.Assert.fail("test2litNum3442 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test2litNum3446_failAssert406() throws Exception, ContradictionException, TimeoutException {
        try {
            Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
            int[] backdoor = new int[]{ 1, 2, 3 };
            IOrder order = new SubsetVarOrder(backdoor);
            solver.setOrder(order);
            IVecInt clause = new VecInt();
            clause.push((-1)).push(4);
            solver.addClause(clause);
            clause = new VecInt();
            clause.push((-(Integer.MAX_VALUE))).push(5);
            solver.addClause(clause);
            clause = new VecInt();
            clause.push((-3)).push(6);
            solver.addClause(clause);
            solver.isSatisfiable();
            org.junit.Assert.fail("test2litNum3446 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test2litNum3448_failAssert408() throws Exception, ContradictionException, TimeoutException {
        try {
            Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
            int[] backdoor = new int[]{ 1, 2, 3 };
            IOrder order = new SubsetVarOrder(backdoor);
            solver.setOrder(order);
            IVecInt clause = new VecInt();
            clause.push((-1)).push(4);
            solver.addClause(clause);
            clause = new VecInt();
            clause.push((-0)).push(5);
            solver.addClause(clause);
            clause = new VecInt();
            clause.push((-3)).push(6);
            solver.addClause(clause);
            solver.isSatisfiable();
            org.junit.Assert.fail("test2litNum3448 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test2litNum3452_failAssert409() throws Exception, ContradictionException, TimeoutException {
        try {
            Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
            int[] backdoor = new int[]{ 1, 2, 3 };
            IOrder order = new SubsetVarOrder(backdoor);
            solver.setOrder(order);
            IVecInt clause = new VecInt();
            clause.push((-1)).push(4);
            solver.addClause(clause);
            clause = new VecInt();
            clause.push((-2)).push(Integer.MAX_VALUE);
            solver.addClause(clause);
            clause = new VecInt();
            clause.push((-3)).push(6);
            solver.addClause(clause);
            solver.isSatisfiable();
            org.junit.Assert.fail("test2litNum3452 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test2litNum3458_failAssert412() throws Exception, ContradictionException, TimeoutException {
        try {
            Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
            int[] backdoor = new int[]{ 1, 2, 3 };
            IOrder order = new SubsetVarOrder(backdoor);
            solver.setOrder(order);
            IVecInt clause = new VecInt();
            clause.push((-1)).push(4);
            solver.addClause(clause);
            clause = new VecInt();
            clause.push((-2)).push(5);
            solver.addClause(clause);
            clause = new VecInt();
            clause.push((-(Integer.MAX_VALUE))).push(6);
            solver.addClause(clause);
            solver.isSatisfiable();
            org.junit.Assert.fail("test2litNum3458 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test2litNum3460_failAssert414() throws Exception, ContradictionException, TimeoutException {
        try {
            Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
            int[] backdoor = new int[]{ 1, 2, 3 };
            IOrder order = new SubsetVarOrder(backdoor);
            solver.setOrder(order);
            IVecInt clause = new VecInt();
            clause.push((-1)).push(4);
            solver.addClause(clause);
            clause = new VecInt();
            clause.push((-2)).push(5);
            solver.addClause(clause);
            clause = new VecInt();
            clause.push((-0)).push(6);
            solver.addClause(clause);
            solver.isSatisfiable();
            org.junit.Assert.fail("test2litNum3460 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test2litNum3436_failAssert402_add3807_failAssert418() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                int[] backdoor = new int[]{ 1, 2, 3 };
                IOrder order = new SubsetVarOrder(backdoor);
                solver.setOrder(order);
                IVecInt clause = new VecInt();
                clause.push((-(Integer.MIN_VALUE))).push(4);
                clause.push((-(Integer.MIN_VALUE))).push(4);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push((-2)).push(5);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push((-3)).push(6);
                solver.addClause(clause);
                solver.isSatisfiable();
                org.junit.Assert.fail("test2litNum3436 should have thrown ArrayIndexOutOfBoundsException");
            }
            org.junit.Assert.fail("test2litNum3436_failAssert402_add3807 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-2147483648", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test2litNum3429_failAssert396_add4459_failAssert420() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                SolverFactory.newGlucose();
                Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                int[] backdoor = new int[]{ 1, 2, Integer.MAX_VALUE };
                IOrder order = new SubsetVarOrder(backdoor);
                solver.setOrder(order);
                IVecInt clause = new VecInt();
                clause.push((-1)).push(4);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push((-2)).push(5);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push((-3)).push(6);
                solver.addClause(clause);
                solver.isSatisfiable();
                org.junit.Assert.fail("test2litNum3429 should have thrown ArrayIndexOutOfBoundsException");
            }
            org.junit.Assert.fail("test2litNum3429_failAssert396_add4459 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("2147483647", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test2litNum3418_failAssert385_add4397_failAssert421() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                SolverFactory.newGlucose();
                Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                int[] backdoor = new int[]{ Integer.MAX_VALUE, 2, 3 };
                IOrder order = new SubsetVarOrder(backdoor);
                solver.setOrder(order);
                IVecInt clause = new VecInt();
                clause.push((-1)).push(4);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push((-2)).push(5);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push((-3)).push(6);
                solver.addClause(clause);
                solver.isSatisfiable();
                org.junit.Assert.fail("test2litNum3418 should have thrown ArrayIndexOutOfBoundsException");
            }
            org.junit.Assert.fail("test2litNum3418_failAssert385_add4397 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("2147483647", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test2litNum3423_failAssert390_add3820_failAssert422() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                SolverFactory.newGlucose();
                Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                int[] backdoor = new int[]{ 1, Integer.MAX_VALUE, 3 };
                IOrder order = new SubsetVarOrder(backdoor);
                solver.setOrder(order);
                IVecInt clause = new VecInt();
                clause.push((-1)).push(4);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push((-2)).push(5);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push((-3)).push(6);
                solver.addClause(clause);
                solver.isSatisfiable();
                org.junit.Assert.fail("test2litNum3423 should have thrown ArrayIndexOutOfBoundsException");
            }
            org.junit.Assert.fail("test2litNum3423_failAssert390_add3820 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("2147483647", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test2litNum3446_failAssert406_add3986_failAssert424() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                int[] backdoor = new int[]{ 1, 2, 3 };
                IOrder order = new SubsetVarOrder(backdoor);
                solver.setOrder(order);
                IVecInt clause = new VecInt();
                clause.push((-1)).push(4);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push((-(Integer.MAX_VALUE))).push(5);
                clause.push((-(Integer.MAX_VALUE))).push(5);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push((-3)).push(6);
                solver.addClause(clause);
                solver.isSatisfiable();
                org.junit.Assert.fail("test2litNum3446 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("test2litNum3446_failAssert406_add3986 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test2litNum3458_failAssert412_add4202_failAssert425() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                int[] backdoor = new int[]{ 1, 2, 3 };
                IOrder order = new SubsetVarOrder(backdoor);
                solver.setOrder(order);
                IVecInt clause = new VecInt();
                clause.push((-1)).push(4);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push((-2)).push(5);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push((-(Integer.MAX_VALUE))).push(6);
                clause.push((-(Integer.MAX_VALUE))).push(6);
                solver.addClause(clause);
                solver.isSatisfiable();
                org.junit.Assert.fail("test2litNum3458 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("test2litNum3458_failAssert412_add4202 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test2litNum3435_failAssert401_add4214_failAssert426() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                int[] backdoor = new int[]{ 1, 2, 3 };
                IOrder order = new SubsetVarOrder(backdoor);
                solver.setOrder(order);
                IVecInt clause = new VecInt();
                clause.push((-(Integer.MAX_VALUE))).push(4);
                clause.push((-(Integer.MAX_VALUE))).push(4);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push((-2)).push(5);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push((-3)).push(6);
                solver.addClause(clause);
                solver.isSatisfiable();
                org.junit.Assert.fail("test2litNum3435 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("test2litNum3435_failAssert401_add4214 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test2litNum3448_failAssert408_add3786_failAssert427() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                SolverFactory.newGlucose();
                Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                int[] backdoor = new int[]{ 1, 2, 3 };
                IOrder order = new SubsetVarOrder(backdoor);
                solver.setOrder(order);
                IVecInt clause = new VecInt();
                clause.push((-1)).push(4);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push((-0)).push(5);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push((-3)).push(6);
                solver.addClause(clause);
                solver.isSatisfiable();
                org.junit.Assert.fail("test2litNum3448 should have thrown IllegalArgumentException");
            }
            org.junit.Assert.fail("test2litNum3448_failAssert408_add3786 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test2litNum3442_failAssert405_add3956_failAssert428() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                SolverFactory.newGlucose();
                Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                int[] backdoor = new int[]{ 1, 2, 3 };
                IOrder order = new SubsetVarOrder(backdoor);
                solver.setOrder(order);
                IVecInt clause = new VecInt();
                clause.push((-1)).push(0);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push((-2)).push(5);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push((-3)).push(6);
                solver.addClause(clause);
                solver.isSatisfiable();
                org.junit.Assert.fail("test2litNum3442 should have thrown IllegalArgumentException");
            }
            org.junit.Assert.fail("test2litNum3442_failAssert405_add3956 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test2litNum3460_failAssert414_add3955_failAssert429() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                SolverFactory.newGlucose();
                Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                int[] backdoor = new int[]{ 1, 2, 3 };
                IOrder order = new SubsetVarOrder(backdoor);
                solver.setOrder(order);
                IVecInt clause = new VecInt();
                clause.push((-1)).push(4);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push((-2)).push(5);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push((-0)).push(6);
                solver.addClause(clause);
                solver.isSatisfiable();
                org.junit.Assert.fail("test2litNum3460 should have thrown IllegalArgumentException");
            }
            org.junit.Assert.fail("test2litNum3460_failAssert414_add3955 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test2litNum3434_failAssert400_add4414_failAssert430() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                SolverFactory.newGlucose();
                Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                int[] backdoor = new int[]{ 1, 2, 3 };
                IOrder order = new SubsetVarOrder(backdoor);
                solver.setOrder(order);
                IVecInt clause = new VecInt();
                clause.push((-0)).push(4);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push((-2)).push(5);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push((-3)).push(6);
                solver.addClause(clause);
                solver.isSatisfiable();
                org.junit.Assert.fail("test2litNum3434 should have thrown IllegalArgumentException");
            }
            org.junit.Assert.fail("test2litNum3434_failAssert400_add4414 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test2litNum3440_failAssert403_add4183_failAssert432() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                int[] backdoor = new int[]{ 1, 2, 3 };
                IOrder order = new SubsetVarOrder(backdoor);
                solver.setOrder(order);
                IVecInt clause = new VecInt();
                clause.push((-1)).push(Integer.MAX_VALUE);
                clause.push((-1)).push(Integer.MAX_VALUE);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push((-2)).push(5);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push((-3)).push(6);
                solver.addClause(clause);
                solver.isSatisfiable();
                org.junit.Assert.fail("test2litNum3440 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("test2litNum3440_failAssert403_add4183 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test2litNum3425_failAssert392litNum4220_failAssert438() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                int[] backdoor = new int[]{ 1, 0, 2 };
                IOrder order = new SubsetVarOrder(backdoor);
                solver.setOrder(order);
                IVecInt clause = new VecInt();
                clause.push((-1)).push(4);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push((-2)).push(5);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push((-3)).push(6);
                solver.addClause(clause);
                solver.isSatisfiable();
                org.junit.Assert.fail("test2litNum3425 should have thrown TimeoutException");
            }
            org.junit.Assert.fail("test2litNum3425_failAssert392litNum4220 should have thrown TimeoutException");
        } catch (TimeoutException expected) {
            Assert.assertEquals("Cannot decide the satisfiability", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test2litNum3425_failAssert392litNum4232_failAssert439() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                int[] backdoor = new int[]{ 1, 0, 0 };
                IOrder order = new SubsetVarOrder(backdoor);
                solver.setOrder(order);
                IVecInt clause = new VecInt();
                clause.push((-1)).push(4);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push((-2)).push(5);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push((-3)).push(6);
                solver.addClause(clause);
                solver.isSatisfiable();
                org.junit.Assert.fail("test2litNum3425 should have thrown TimeoutException");
            }
            org.junit.Assert.fail("test2litNum3425_failAssert392litNum4232 should have thrown TimeoutException");
        } catch (TimeoutException expected) {
            Assert.assertEquals("Cannot decide the satisfiability", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test2litNum3416_failAssert383litNum4500_failAssert440() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                int[] backdoor = new int[]{ 2, 2, 0 };
                IOrder order = new SubsetVarOrder(backdoor);
                solver.setOrder(order);
                IVecInt clause = new VecInt();
                clause.push((-1)).push(4);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push((-2)).push(5);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push((-3)).push(6);
                solver.addClause(clause);
                solver.isSatisfiable();
                org.junit.Assert.fail("test2litNum3416 should have thrown TimeoutException");
            }
            org.junit.Assert.fail("test2litNum3416_failAssert383litNum4500 should have thrown TimeoutException");
        } catch (TimeoutException expected) {
            Assert.assertEquals("Cannot decide the satisfiability", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test2litNum3425_failAssert392litNum4261_failAssert448() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                int[] backdoor = new int[]{ 1, 0, 3 };
                IOrder order = new SubsetVarOrder(backdoor);
                solver.setOrder(order);
                IVecInt clause = new VecInt();
                clause.push((-1)).push(3);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push((-2)).push(5);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push((-3)).push(6);
                solver.addClause(clause);
                solver.isSatisfiable();
                org.junit.Assert.fail("test2litNum3425 should have thrown TimeoutException");
            }
            org.junit.Assert.fail("test2litNum3425_failAssert392litNum4261 should have thrown TimeoutException");
        } catch (TimeoutException expected) {
            Assert.assertEquals("Cannot decide the satisfiability", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test2litNum3421_failAssert388litNum4424_failAssert458() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                int[] backdoor = new int[]{ 1, 3, 4 };
                IOrder order = new SubsetVarOrder(backdoor);
                solver.setOrder(order);
                IVecInt clause = new VecInt();
                clause.push((-1)).push(4);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push((-2)).push(5);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push((-3)).push(6);
                solver.addClause(clause);
                solver.isSatisfiable();
                org.junit.Assert.fail("test2litNum3421 should have thrown TimeoutException");
            }
            org.junit.Assert.fail("test2litNum3421_failAssert388litNum4424 should have thrown TimeoutException");
        } catch (TimeoutException expected) {
            Assert.assertEquals("Cannot decide the satisfiability", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test2litNum3422_failAssert389litNum3901_failAssert459() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                int[] backdoor = new int[]{ 1, 1, 3 };
                IOrder order = new SubsetVarOrder(backdoor);
                solver.setOrder(order);
                IVecInt clause = new VecInt();
                clause.push((-2)).push(4);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push((-2)).push(5);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push((-3)).push(6);
                solver.addClause(clause);
                solver.isSatisfiable();
                org.junit.Assert.fail("test2litNum3422 should have thrown TimeoutException");
            }
            org.junit.Assert.fail("test2litNum3422_failAssert389litNum3901 should have thrown TimeoutException");
        } catch (TimeoutException expected) {
            Assert.assertEquals("Cannot decide the satisfiability", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test2litNum3421_failAssert388litNum4454_failAssert468() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                int[] backdoor = new int[]{ 1, 3, 3 };
                IOrder order = new SubsetVarOrder(backdoor);
                solver.setOrder(order);
                IVecInt clause = new VecInt();
                clause.push((-1)).push(3);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push((-2)).push(5);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push((-3)).push(6);
                solver.addClause(clause);
                solver.isSatisfiable();
                org.junit.Assert.fail("test2litNum3421 should have thrown TimeoutException");
            }
            org.junit.Assert.fail("test2litNum3421_failAssert388litNum4454 should have thrown TimeoutException");
        } catch (TimeoutException expected) {
            Assert.assertEquals("Cannot decide the satisfiability", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test2litNum3421_failAssert388litNum4533_failAssert469() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                int[] backdoor = new int[]{ 1, 3, 3 };
                IOrder order = new SubsetVarOrder(backdoor);
                solver.setOrder(order);
                IVecInt clause = new VecInt();
                clause.push((-1)).push(4);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push((-2)).push(5);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push((-3)).push(7);
                solver.addClause(clause);
                solver.isSatisfiable();
                org.junit.Assert.fail("test2litNum3421 should have thrown TimeoutException");
            }
            org.junit.Assert.fail("test2litNum3421_failAssert388litNum4533 should have thrown TimeoutException");
        } catch (TimeoutException expected) {
            Assert.assertEquals("Cannot decide the satisfiability", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test2litNum3422_failAssert389litNum3925_failAssert471() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                int[] backdoor = new int[]{ 1, 1, 3 };
                IOrder order = new SubsetVarOrder(backdoor);
                solver.setOrder(order);
                IVecInt clause = new VecInt();
                clause.push((-1)).push(0);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push((-2)).push(5);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push((-3)).push(6);
                solver.addClause(clause);
                solver.isSatisfiable();
                org.junit.Assert.fail("test2litNum3422 should have thrown TimeoutException");
            }
            org.junit.Assert.fail("test2litNum3422_failAssert389litNum3925 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test2litNum3416_failAssert383litNum4474_failAssert488() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                int[] backdoor = new int[]{ 2, 0, 3 };
                IOrder order = new SubsetVarOrder(backdoor);
                solver.setOrder(order);
                IVecInt clause = new VecInt();
                clause.push((-1)).push(4);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push((-2)).push(5);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push((-3)).push(6);
                solver.addClause(clause);
                solver.isSatisfiable();
                org.junit.Assert.fail("test2litNum3416 should have thrown TimeoutException");
            }
            org.junit.Assert.fail("test2litNum3416_failAssert383litNum4474 should have thrown TimeoutException");
        } catch (TimeoutException expected) {
            Assert.assertEquals("Cannot decide the satisfiability", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test2litNum3422_failAssert389litNum3944_failAssert490() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                int[] backdoor = new int[]{ 1, 1, 3 };
                IOrder order = new SubsetVarOrder(backdoor);
                solver.setOrder(order);
                IVecInt clause = new VecInt();
                clause.push((-1)).push(4);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push((-2)).push(5);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push((-2)).push(6);
                solver.addClause(clause);
                solver.isSatisfiable();
                org.junit.Assert.fail("test2litNum3422 should have thrown TimeoutException");
            }
            org.junit.Assert.fail("test2litNum3422_failAssert389litNum3944 should have thrown TimeoutException");
        } catch (TimeoutException expected) {
            Assert.assertEquals("Cannot decide the satisfiability", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test2litNum3416_failAssert383litNum4457_failAssert507() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                int[] backdoor = new int[]{ 2, 3, 3 };
                IOrder order = new SubsetVarOrder(backdoor);
                solver.setOrder(order);
                IVecInt clause = new VecInt();
                clause.push((-1)).push(4);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push((-2)).push(5);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push((-3)).push(6);
                solver.addClause(clause);
                solver.isSatisfiable();
                org.junit.Assert.fail("test2litNum3416 should have thrown TimeoutException");
            }
            org.junit.Assert.fail("test2litNum3416_failAssert383litNum4457 should have thrown TimeoutException");
        } catch (TimeoutException expected) {
            Assert.assertEquals("Cannot decide the satisfiability", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test2litNum3416_failAssert383litNum4487_failAssert515() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                int[] backdoor = new int[]{ 2, 2, 2 };
                IOrder order = new SubsetVarOrder(backdoor);
                solver.setOrder(order);
                IVecInt clause = new VecInt();
                clause.push((-1)).push(4);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push((-2)).push(5);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push((-3)).push(6);
                solver.addClause(clause);
                solver.isSatisfiable();
                org.junit.Assert.fail("test2litNum3416 should have thrown TimeoutException");
            }
            org.junit.Assert.fail("test2litNum3416_failAssert383litNum4487 should have thrown TimeoutException");
        } catch (TimeoutException expected) {
            Assert.assertEquals("Cannot decide the satisfiability", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test2litNum3427_failAssert394litNum4175_failAssert524() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                int[] backdoor = new int[]{ 1, 2, 4 };
                IOrder order = new SubsetVarOrder(backdoor);
                solver.setOrder(order);
                IVecInt clause = new VecInt();
                clause.push((-1)).push(4);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push((-2)).push(5);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push((-3)).push(7);
                solver.addClause(clause);
                solver.isSatisfiable();
                org.junit.Assert.fail("test2litNum3427 should have thrown TimeoutException");
            }
            org.junit.Assert.fail("test2litNum3427_failAssert394litNum4175 should have thrown TimeoutException");
        } catch (TimeoutException expected) {
            Assert.assertEquals("Cannot decide the satisfiability", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test2litNum3417_failAssert384litNum4452_failAssert531() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                int[] backdoor = new int[]{ 0, 981581536, 3 };
                IOrder order = new SubsetVarOrder(backdoor);
                solver.setOrder(order);
                IVecInt clause = new VecInt();
                clause.push((-1)).push(4);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push((-2)).push(5);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push((-3)).push(6);
                solver.addClause(clause);
                solver.isSatisfiable();
                org.junit.Assert.fail("test2litNum3417 should have thrown TimeoutException");
            }
            org.junit.Assert.fail("test2litNum3417_failAssert384litNum4452 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("981581536", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test2litNum3436_failAssert402_add3807_failAssert418_add6282_failAssert549() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                    int[] backdoor = new int[]{ 1, 2, 3 };
                    IOrder order = new SubsetVarOrder(backdoor);
                    solver.setOrder(order);
                    IVecInt clause = new VecInt();
                    clause.push((-(Integer.MIN_VALUE))).push(4);
                    clause.push((-(Integer.MIN_VALUE))).push(4);
                    clause.push((-(Integer.MIN_VALUE))).push(4);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-2)).push(5);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-3)).push(6);
                    solver.addClause(clause);
                    solver.isSatisfiable();
                    org.junit.Assert.fail("test2litNum3436 should have thrown ArrayIndexOutOfBoundsException");
                }
                org.junit.Assert.fail("test2litNum3436_failAssert402_add3807 should have thrown ArrayIndexOutOfBoundsException");
            }
            org.junit.Assert.fail("test2litNum3436_failAssert402_add3807_failAssert418_add6282 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-2147483648", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test2litNum3436_failAssert402_add3807_failAssert418_add6278_failAssert551() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    SolverFactory.newGlucose();
                    Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                    int[] backdoor = new int[]{ 1, 2, 3 };
                    IOrder order = new SubsetVarOrder(backdoor);
                    solver.setOrder(order);
                    IVecInt clause = new VecInt();
                    clause.push((-(Integer.MIN_VALUE))).push(4);
                    clause.push((-(Integer.MIN_VALUE))).push(4);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-2)).push(5);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-3)).push(6);
                    solver.addClause(clause);
                    solver.isSatisfiable();
                    org.junit.Assert.fail("test2litNum3436 should have thrown ArrayIndexOutOfBoundsException");
                }
                org.junit.Assert.fail("test2litNum3436_failAssert402_add3807 should have thrown ArrayIndexOutOfBoundsException");
            }
            org.junit.Assert.fail("test2litNum3436_failAssert402_add3807_failAssert418_add6278 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-2147483648", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test2litNum3429_failAssert396_add4459_failAssert420_add6033_failAssert552() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    SolverFactory.newGlucose();
                    SolverFactory.newGlucose();
                    Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                    int[] backdoor = new int[]{ 1, 2, Integer.MAX_VALUE };
                    IOrder order = new SubsetVarOrder(backdoor);
                    solver.setOrder(order);
                    IVecInt clause = new VecInt();
                    clause.push((-1)).push(4);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-2)).push(5);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-3)).push(6);
                    solver.addClause(clause);
                    solver.isSatisfiable();
                    org.junit.Assert.fail("test2litNum3429 should have thrown ArrayIndexOutOfBoundsException");
                }
                org.junit.Assert.fail("test2litNum3429_failAssert396_add4459 should have thrown ArrayIndexOutOfBoundsException");
            }
            org.junit.Assert.fail("test2litNum3429_failAssert396_add4459_failAssert420_add6033 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("2147483647", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test2litNum3418_failAssert385_add4397_failAssert421_add6244_failAssert553() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    SolverFactory.newGlucose();
                    SolverFactory.newGlucose();
                    Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                    int[] backdoor = new int[]{ Integer.MAX_VALUE, 2, 3 };
                    IOrder order = new SubsetVarOrder(backdoor);
                    solver.setOrder(order);
                    IVecInt clause = new VecInt();
                    clause.push((-1)).push(4);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-2)).push(5);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-3)).push(6);
                    solver.addClause(clause);
                    solver.isSatisfiable();
                    org.junit.Assert.fail("test2litNum3418 should have thrown ArrayIndexOutOfBoundsException");
                }
                org.junit.Assert.fail("test2litNum3418_failAssert385_add4397 should have thrown ArrayIndexOutOfBoundsException");
            }
            org.junit.Assert.fail("test2litNum3418_failAssert385_add4397_failAssert421_add6244 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("2147483647", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test2litNum3423_failAssert390_add3820_failAssert422_add5287_failAssert556() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    SolverFactory.newGlucose();
                    SolverFactory.newGlucose();
                    Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                    int[] backdoor = new int[]{ 1, Integer.MAX_VALUE, 3 };
                    IOrder order = new SubsetVarOrder(backdoor);
                    solver.setOrder(order);
                    IVecInt clause = new VecInt();
                    clause.push((-1)).push(4);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-2)).push(5);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-3)).push(6);
                    solver.addClause(clause);
                    solver.isSatisfiable();
                    org.junit.Assert.fail("test2litNum3423 should have thrown ArrayIndexOutOfBoundsException");
                }
                org.junit.Assert.fail("test2litNum3423_failAssert390_add3820 should have thrown ArrayIndexOutOfBoundsException");
            }
            org.junit.Assert.fail("test2litNum3423_failAssert390_add3820_failAssert422_add5287 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("2147483647", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test2litNum3446_failAssert406_add3986_failAssert424_add5562_failAssert560() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                    int[] backdoor = new int[]{ 1, 2, 3 };
                    IOrder order = new SubsetVarOrder(backdoor);
                    solver.setOrder(order);
                    IVecInt clause = new VecInt();
                    clause.push((-1)).push(4);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-(Integer.MAX_VALUE))).push(5);
                    clause.push((-(Integer.MAX_VALUE))).push(5);
                    clause.push((-(Integer.MAX_VALUE))).push(5);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-3)).push(6);
                    solver.addClause(clause);
                    solver.isSatisfiable();
                    org.junit.Assert.fail("test2litNum3446 should have thrown NegativeArraySizeException");
                }
                org.junit.Assert.fail("test2litNum3446_failAssert406_add3986 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("test2litNum3446_failAssert406_add3986_failAssert424_add5562 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test2litNum3417_failAssert384litNum4452_failAssert531litNum6101_failAssert562() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                    int[] backdoor = new int[]{ 0, 981581536, 2 };
                    IOrder order = new SubsetVarOrder(backdoor);
                    solver.setOrder(order);
                    IVecInt clause = new VecInt();
                    clause.push((-1)).push(4);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-2)).push(5);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-3)).push(6);
                    solver.addClause(clause);
                    solver.isSatisfiable();
                    org.junit.Assert.fail("test2litNum3417 should have thrown TimeoutException");
                }
                org.junit.Assert.fail("test2litNum3417_failAssert384litNum4452 should have thrown ArrayIndexOutOfBoundsException");
            }
            org.junit.Assert.fail("test2litNum3417_failAssert384litNum4452_failAssert531litNum6101 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("981581536", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test2litNum3417_failAssert384litNum4452_failAssert531litNum6140_failAssert563() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                    int[] backdoor = new int[]{ 0, 981581536, 3 };
                    IOrder order = new SubsetVarOrder(backdoor);
                    solver.setOrder(order);
                    IVecInt clause = new VecInt();
                    clause.push((-1)).push(0);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-2)).push(5);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-3)).push(6);
                    solver.addClause(clause);
                    solver.isSatisfiable();
                    org.junit.Assert.fail("test2litNum3417 should have thrown TimeoutException");
                }
                org.junit.Assert.fail("test2litNum3417_failAssert384litNum4452 should have thrown ArrayIndexOutOfBoundsException");
            }
            org.junit.Assert.fail("test2litNum3417_failAssert384litNum4452_failAssert531litNum6140 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test2litNum3417_failAssert384litNum4452_failAssert531litNum6203_failAssert564() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                    int[] backdoor = new int[]{ 0, 981581536, 3 };
                    IOrder order = new SubsetVarOrder(backdoor);
                    solver.setOrder(order);
                    IVecInt clause = new VecInt();
                    clause.push((-1)).push(4);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-2)).push(5);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-0)).push(6);
                    solver.addClause(clause);
                    solver.isSatisfiable();
                    org.junit.Assert.fail("test2litNum3417 should have thrown TimeoutException");
                }
                org.junit.Assert.fail("test2litNum3417_failAssert384litNum4452 should have thrown ArrayIndexOutOfBoundsException");
            }
            org.junit.Assert.fail("test2litNum3417_failAssert384litNum4452_failAssert531litNum6203 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test2litNum3417_failAssert384litNum4452_failAssert531litNum6180_failAssert568() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                    int[] backdoor = new int[]{ 0, 981581536, 3 };
                    IOrder order = new SubsetVarOrder(backdoor);
                    solver.setOrder(order);
                    IVecInt clause = new VecInt();
                    clause.push((-1)).push(4);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-2)).push(0);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-3)).push(6);
                    solver.addClause(clause);
                    solver.isSatisfiable();
                    org.junit.Assert.fail("test2litNum3417 should have thrown TimeoutException");
                }
                org.junit.Assert.fail("test2litNum3417_failAssert384litNum4452 should have thrown ArrayIndexOutOfBoundsException");
            }
            org.junit.Assert.fail("test2litNum3417_failAssert384litNum4452_failAssert531litNum6180 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test2litNum3417_failAssert384litNum4452_failAssert531litNum6116_failAssert571() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                    int[] backdoor = new int[]{ 0, 981581536, 3 };
                    IOrder order = new SubsetVarOrder(backdoor);
                    solver.setOrder(order);
                    IVecInt clause = new VecInt();
                    clause.push((-0)).push(4);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-2)).push(5);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-3)).push(6);
                    solver.addClause(clause);
                    solver.isSatisfiable();
                    org.junit.Assert.fail("test2litNum3417 should have thrown TimeoutException");
                }
                org.junit.Assert.fail("test2litNum3417_failAssert384litNum4452 should have thrown ArrayIndexOutOfBoundsException");
            }
            org.junit.Assert.fail("test2litNum3417_failAssert384litNum4452_failAssert531litNum6116 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test2litNum3417_failAssert384litNum4452_failAssert531litNum6165_failAssert578() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                    int[] backdoor = new int[]{ 0, 981581536, 3 };
                    IOrder order = new SubsetVarOrder(backdoor);
                    solver.setOrder(order);
                    IVecInt clause = new VecInt();
                    clause.push((-1)).push(4);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-2)).push(6);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-3)).push(6);
                    solver.addClause(clause);
                    solver.isSatisfiable();
                    org.junit.Assert.fail("test2litNum3417 should have thrown TimeoutException");
                }
                org.junit.Assert.fail("test2litNum3417_failAssert384litNum4452 should have thrown ArrayIndexOutOfBoundsException");
            }
            org.junit.Assert.fail("test2litNum3417_failAssert384litNum4452_failAssert531litNum6165 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("981581536", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test2litNum3416_failAssert383litNum4500_failAssert440litNum5513_failAssert581() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                    int[] backdoor = new int[]{ 2, 2, 0 };
                    IOrder order = new SubsetVarOrder(backdoor);
                    solver.setOrder(order);
                    IVecInt clause = new VecInt();
                    clause.push((-1)).push(0);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-2)).push(5);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-3)).push(6);
                    solver.addClause(clause);
                    solver.isSatisfiable();
                    org.junit.Assert.fail("test2litNum3416 should have thrown TimeoutException");
                }
                org.junit.Assert.fail("test2litNum3416_failAssert383litNum4500 should have thrown TimeoutException");
            }
            org.junit.Assert.fail("test2litNum3416_failAssert383litNum4500_failAssert440litNum5513 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test2litNum3416_failAssert383litNum4500_failAssert440litNum5503_failAssert586() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                    int[] backdoor = new int[]{ 2, 2, 0 };
                    IOrder order = new SubsetVarOrder(backdoor);
                    solver.setOrder(order);
                    IVecInt clause = new VecInt();
                    clause.push((-1)).push(5);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-2)).push(5);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-3)).push(6);
                    solver.addClause(clause);
                    solver.isSatisfiable();
                    org.junit.Assert.fail("test2litNum3416 should have thrown TimeoutException");
                }
                org.junit.Assert.fail("test2litNum3416_failAssert383litNum4500 should have thrown TimeoutException");
            }
            org.junit.Assert.fail("test2litNum3416_failAssert383litNum4500_failAssert440litNum5503 should have thrown TimeoutException");
        } catch (TimeoutException expected) {
            Assert.assertEquals("Cannot decide the satisfiability", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test2litNum3416_failAssert383litNum4500_failAssert440litNum5505_failAssert587() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                    int[] backdoor = new int[]{ 2, 2, 0 };
                    IOrder order = new SubsetVarOrder(backdoor);
                    solver.setOrder(order);
                    IVecInt clause = new VecInt();
                    clause.push((-1)).push(3);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-2)).push(5);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-3)).push(6);
                    solver.addClause(clause);
                    solver.isSatisfiable();
                    org.junit.Assert.fail("test2litNum3416 should have thrown TimeoutException");
                }
                org.junit.Assert.fail("test2litNum3416_failAssert383litNum4500 should have thrown TimeoutException");
            }
            org.junit.Assert.fail("test2litNum3416_failAssert383litNum4500_failAssert440litNum5505 should have thrown TimeoutException");
        } catch (TimeoutException expected) {
            Assert.assertEquals("Cannot decide the satisfiability", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test2litNum3458_failAssert412_add4202_failAssert425_add5827_failAssert590() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                    int[] backdoor = new int[]{ 1, 2, 3 };
                    IOrder order = new SubsetVarOrder(backdoor);
                    solver.setOrder(order);
                    IVecInt clause = new VecInt();
                    clause.push((-1)).push(4);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-2)).push(5);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-(Integer.MAX_VALUE))).push(6);
                    clause.push((-(Integer.MAX_VALUE))).push(6);
                    clause.push((-(Integer.MAX_VALUE))).push(6);
                    solver.addClause(clause);
                    solver.isSatisfiable();
                    org.junit.Assert.fail("test2litNum3458 should have thrown NegativeArraySizeException");
                }
                org.junit.Assert.fail("test2litNum3458_failAssert412_add4202 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("test2litNum3458_failAssert412_add4202_failAssert425_add5827 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test2litNum3425_failAssert392litNum4220_failAssert438litNum5305_failAssert596() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                    int[] backdoor = new int[]{ 1, 0, 2 };
                    IOrder order = new SubsetVarOrder(backdoor);
                    solver.setOrder(order);
                    IVecInt clause = new VecInt();
                    clause.push((-2)).push(4);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-2)).push(5);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-3)).push(6);
                    solver.addClause(clause);
                    solver.isSatisfiable();
                    org.junit.Assert.fail("test2litNum3425 should have thrown TimeoutException");
                }
                org.junit.Assert.fail("test2litNum3425_failAssert392litNum4220 should have thrown TimeoutException");
            }
            org.junit.Assert.fail("test2litNum3425_failAssert392litNum4220_failAssert438litNum5305 should have thrown TimeoutException");
        } catch (TimeoutException expected) {
            Assert.assertEquals("Cannot decide the satisfiability", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test2litNum3425_failAssert392litNum4220_failAssert438litNum5323_failAssert597() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                    int[] backdoor = new int[]{ 1, 0, 2 };
                    IOrder order = new SubsetVarOrder(backdoor);
                    solver.setOrder(order);
                    IVecInt clause = new VecInt();
                    clause.push((-1)).push(5);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-2)).push(5);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-3)).push(6);
                    solver.addClause(clause);
                    solver.isSatisfiable();
                    org.junit.Assert.fail("test2litNum3425 should have thrown TimeoutException");
                }
                org.junit.Assert.fail("test2litNum3425_failAssert392litNum4220 should have thrown TimeoutException");
            }
            org.junit.Assert.fail("test2litNum3425_failAssert392litNum4220_failAssert438litNum5323 should have thrown TimeoutException");
        } catch (TimeoutException expected) {
            Assert.assertEquals("Cannot decide the satisfiability", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test2litNum3416_failAssert383litNum4500_failAssert440litNum5519_failAssert602() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                    int[] backdoor = new int[]{ 2, 2, 0 };
                    IOrder order = new SubsetVarOrder(backdoor);
                    solver.setOrder(order);
                    IVecInt clause = new VecInt();
                    clause.push((-1)).push(4);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-1)).push(5);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-3)).push(6);
                    solver.addClause(clause);
                    solver.isSatisfiable();
                    org.junit.Assert.fail("test2litNum3416 should have thrown TimeoutException");
                }
                org.junit.Assert.fail("test2litNum3416_failAssert383litNum4500 should have thrown TimeoutException");
            }
            org.junit.Assert.fail("test2litNum3416_failAssert383litNum4500_failAssert440litNum5519 should have thrown TimeoutException");
        } catch (TimeoutException expected) {
            Assert.assertEquals("Cannot decide the satisfiability", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test2litNum3416_failAssert383litNum4500_failAssert440litNum5491_failAssert605() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                    int[] backdoor = new int[]{ 2, 2, 0 };
                    IOrder order = new SubsetVarOrder(backdoor);
                    solver.setOrder(order);
                    IVecInt clause = new VecInt();
                    clause.push((-2)).push(4);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-2)).push(5);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-3)).push(6);
                    solver.addClause(clause);
                    solver.isSatisfiable();
                    org.junit.Assert.fail("test2litNum3416 should have thrown TimeoutException");
                }
                org.junit.Assert.fail("test2litNum3416_failAssert383litNum4500 should have thrown TimeoutException");
            }
            org.junit.Assert.fail("test2litNum3416_failAssert383litNum4500_failAssert440litNum5491 should have thrown TimeoutException");
        } catch (TimeoutException expected) {
            Assert.assertEquals("Cannot decide the satisfiability", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test2litNum3435_failAssert401_add4214_failAssert426_add5584_failAssert622() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                    int[] backdoor = new int[]{ 1, 2, 3 };
                    IOrder order = new SubsetVarOrder(backdoor);
                    solver.setOrder(order);
                    IVecInt clause = new VecInt();
                    clause.push((-(Integer.MAX_VALUE))).push(4);
                    clause.push((-(Integer.MAX_VALUE))).push(4);
                    clause.push((-(Integer.MAX_VALUE))).push(4);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-2)).push(5);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-3)).push(6);
                    solver.addClause(clause);
                    solver.isSatisfiable();
                    org.junit.Assert.fail("test2litNum3435 should have thrown NegativeArraySizeException");
                }
                org.junit.Assert.fail("test2litNum3435_failAssert401_add4214 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("test2litNum3435_failAssert401_add4214_failAssert426_add5584 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test2litNum3422_failAssert389litNum3901_failAssert459litNum5211_failAssert630() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                    int[] backdoor = new int[]{ 1, 1, 3 };
                    IOrder order = new SubsetVarOrder(backdoor);
                    solver.setOrder(order);
                    IVecInt clause = new VecInt();
                    clause.push((-2)).push(4);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-2)).push(5);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-3)).push(5);
                    solver.addClause(clause);
                    solver.isSatisfiable();
                    org.junit.Assert.fail("test2litNum3422 should have thrown TimeoutException");
                }
                org.junit.Assert.fail("test2litNum3422_failAssert389litNum3901 should have thrown TimeoutException");
            }
            org.junit.Assert.fail("test2litNum3422_failAssert389litNum3901_failAssert459litNum5211 should have thrown TimeoutException");
        } catch (TimeoutException expected) {
            Assert.assertEquals("Cannot decide the satisfiability", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test2litNum3425_failAssert392litNum4261_failAssert448litNum5704_failAssert634() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                    int[] backdoor = new int[]{ 1, 0, 3 };
                    IOrder order = new SubsetVarOrder(backdoor);
                    solver.setOrder(order);
                    IVecInt clause = new VecInt();
                    clause.push((-1)).push(3);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-2)).push(5);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-4)).push(6);
                    solver.addClause(clause);
                    solver.isSatisfiable();
                    org.junit.Assert.fail("test2litNum3425 should have thrown TimeoutException");
                }
                org.junit.Assert.fail("test2litNum3425_failAssert392litNum4261 should have thrown TimeoutException");
            }
            org.junit.Assert.fail("test2litNum3425_failAssert392litNum4261_failAssert448litNum5704 should have thrown TimeoutException");
        } catch (TimeoutException expected) {
            Assert.assertEquals("Cannot decide the satisfiability", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test2litNum3421_failAssert388litNum4454_failAssert468litNum5301_failAssert644() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                    int[] backdoor = new int[]{ 1, 3, 3 };
                    IOrder order = new SubsetVarOrder(backdoor);
                    solver.setOrder(order);
                    IVecInt clause = new VecInt();
                    clause.push((-1)).push(3);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-2)).push(5);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-2)).push(6);
                    solver.addClause(clause);
                    solver.isSatisfiable();
                    org.junit.Assert.fail("test2litNum3421 should have thrown TimeoutException");
                }
                org.junit.Assert.fail("test2litNum3421_failAssert388litNum4454 should have thrown TimeoutException");
            }
            org.junit.Assert.fail("test2litNum3421_failAssert388litNum4454_failAssert468litNum5301 should have thrown TimeoutException");
        } catch (TimeoutException expected) {
            Assert.assertEquals("Cannot decide the satisfiability", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test2litNum3422_failAssert389litNum3901_failAssert459litNum5170_failAssert646() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                    int[] backdoor = new int[]{ 1, 1, 3 };
                    IOrder order = new SubsetVarOrder(backdoor);
                    solver.setOrder(order);
                    IVecInt clause = new VecInt();
                    clause.push((-2)).push(4);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-1)).push(5);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-3)).push(6);
                    solver.addClause(clause);
                    solver.isSatisfiable();
                    org.junit.Assert.fail("test2litNum3422 should have thrown TimeoutException");
                }
                org.junit.Assert.fail("test2litNum3422_failAssert389litNum3901 should have thrown TimeoutException");
            }
            org.junit.Assert.fail("test2litNum3422_failAssert389litNum3901_failAssert459litNum5170 should have thrown TimeoutException");
        } catch (TimeoutException expected) {
            Assert.assertEquals("Cannot decide the satisfiability", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test2litNum3421_failAssert388litNum4424_failAssert458litNum5084_failAssert657() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                    int[] backdoor = new int[]{ 1, 3, 4 };
                    IOrder order = new SubsetVarOrder(backdoor);
                    solver.setOrder(order);
                    IVecInt clause = new VecInt();
                    clause.push((-1)).push(4);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-2)).push(5);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-3)).push(7);
                    solver.addClause(clause);
                    solver.isSatisfiable();
                    org.junit.Assert.fail("test2litNum3421 should have thrown TimeoutException");
                }
                org.junit.Assert.fail("test2litNum3421_failAssert388litNum4424 should have thrown TimeoutException");
            }
            org.junit.Assert.fail("test2litNum3421_failAssert388litNum4424_failAssert458litNum5084 should have thrown TimeoutException");
        } catch (TimeoutException expected) {
            Assert.assertEquals("Cannot decide the satisfiability", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test2litNum3422_failAssert389litNum3944_failAssert490litNum6014_failAssert672() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                    int[] backdoor = new int[]{ 1, 1, 3 };
                    IOrder order = new SubsetVarOrder(backdoor);
                    solver.setOrder(order);
                    IVecInt clause = new VecInt();
                    clause.push((-1)).push(4);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-2)).push(6);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-2)).push(6);
                    solver.addClause(clause);
                    solver.isSatisfiable();
                    org.junit.Assert.fail("test2litNum3422 should have thrown TimeoutException");
                }
                org.junit.Assert.fail("test2litNum3422_failAssert389litNum3944 should have thrown TimeoutException");
            }
            org.junit.Assert.fail("test2litNum3422_failAssert389litNum3944_failAssert490litNum6014 should have thrown TimeoutException");
        } catch (TimeoutException expected) {
            Assert.assertEquals("Cannot decide the satisfiability", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test2litNum3416_failAssert383litNum4457_failAssert507litNum5654_failAssert685() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                    int[] backdoor = new int[]{ 2, 3, 0 };
                    IOrder order = new SubsetVarOrder(backdoor);
                    solver.setOrder(order);
                    IVecInt clause = new VecInt();
                    clause.push((-1)).push(4);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-2)).push(5);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-3)).push(6);
                    solver.addClause(clause);
                    solver.isSatisfiable();
                    org.junit.Assert.fail("test2litNum3416 should have thrown TimeoutException");
                }
                org.junit.Assert.fail("test2litNum3416_failAssert383litNum4457 should have thrown TimeoutException");
            }
            org.junit.Assert.fail("test2litNum3416_failAssert383litNum4457_failAssert507litNum5654 should have thrown TimeoutException");
        } catch (TimeoutException expected) {
            Assert.assertEquals("Cannot decide the satisfiability", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test2litNum3416_failAssert383litNum4487_failAssert515litNum5950_failAssert698() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                    int[] backdoor = new int[]{ 2, 2, 2 };
                    IOrder order = new SubsetVarOrder(backdoor);
                    solver.setOrder(order);
                    IVecInt clause = new VecInt();
                    clause.push((-1)).push(4);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-2)).push(5);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-2)).push(6);
                    solver.addClause(clause);
                    solver.isSatisfiable();
                    org.junit.Assert.fail("test2litNum3416 should have thrown TimeoutException");
                }
                org.junit.Assert.fail("test2litNum3416_failAssert383litNum4487 should have thrown TimeoutException");
            }
            org.junit.Assert.fail("test2litNum3416_failAssert383litNum4487_failAssert515litNum5950 should have thrown TimeoutException");
        } catch (TimeoutException expected) {
            Assert.assertEquals("Cannot decide the satisfiability", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test2litNum3416_failAssert383litNum4487_failAssert515litNum5843_failAssert703() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                    int[] backdoor = new int[]{ 2, 1, 2 };
                    IOrder order = new SubsetVarOrder(backdoor);
                    solver.setOrder(order);
                    IVecInt clause = new VecInt();
                    clause.push((-1)).push(4);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-2)).push(5);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-3)).push(6);
                    solver.addClause(clause);
                    solver.isSatisfiable();
                    org.junit.Assert.fail("test2litNum3416 should have thrown TimeoutException");
                }
                org.junit.Assert.fail("test2litNum3416_failAssert383litNum4487 should have thrown TimeoutException");
            }
            org.junit.Assert.fail("test2litNum3416_failAssert383litNum4487_failAssert515litNum5843 should have thrown TimeoutException");
        } catch (TimeoutException expected) {
            Assert.assertEquals("Cannot decide the satisfiability", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test2litNum3416_failAssert383litNum4487_failAssert515litNum5933_failAssert704() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                    int[] backdoor = new int[]{ 2, 2, 2 };
                    IOrder order = new SubsetVarOrder(backdoor);
                    solver.setOrder(order);
                    IVecInt clause = new VecInt();
                    clause.push((-1)).push(4);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-2)).push(4);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-3)).push(6);
                    solver.addClause(clause);
                    solver.isSatisfiable();
                    org.junit.Assert.fail("test2litNum3416 should have thrown TimeoutException");
                }
                org.junit.Assert.fail("test2litNum3416_failAssert383litNum4487 should have thrown TimeoutException");
            }
            org.junit.Assert.fail("test2litNum3416_failAssert383litNum4487_failAssert515litNum5933 should have thrown TimeoutException");
        } catch (TimeoutException expected) {
            Assert.assertEquals("Cannot decide the satisfiability", expected.getMessage());
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
    public void test3litNum6693_failAssert716() throws Exception, ContradictionException, TimeoutException {
        try {
            Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
            solver.setSearchListener(new TextOutputTracing<Object>(null));
            int[] backdoor = new int[]{ 2, 2, 3 };
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
            org.junit.Assert.fail("test3litNum6693 should have thrown TimeoutException");
        } catch (TimeoutException expected) {
            Assert.assertEquals("Cannot decide the satisfiability", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test3litNum6694_failAssert717() throws Exception, ContradictionException, TimeoutException {
        try {
            Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
            solver.setSearchListener(new TextOutputTracing<Object>(null));
            int[] backdoor = new int[]{ 0, 2, 3 };
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
            org.junit.Assert.fail("test3litNum6694 should have thrown TimeoutException");
        } catch (TimeoutException expected) {
            Assert.assertEquals("Cannot decide the satisfiability", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test3litNum6695_failAssert718() throws Exception, ContradictionException, TimeoutException {
        try {
            Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
            solver.setSearchListener(new TextOutputTracing<Object>(null));
            int[] backdoor = new int[]{ Integer.MAX_VALUE, 2, 3 };
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
            org.junit.Assert.fail("test3litNum6695 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("2147483647", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test3litNum6698_failAssert721() throws Exception, ContradictionException, TimeoutException {
        try {
            Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
            solver.setSearchListener(new TextOutputTracing<Object>(null));
            int[] backdoor = new int[]{ 1, 3, 3 };
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
            org.junit.Assert.fail("test3litNum6698 should have thrown TimeoutException");
        } catch (TimeoutException expected) {
            Assert.assertEquals("Cannot decide the satisfiability", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test3litNum6700_failAssert723() throws Exception, ContradictionException, TimeoutException {
        try {
            Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
            solver.setSearchListener(new TextOutputTracing<Object>(null));
            int[] backdoor = new int[]{ 1, Integer.MAX_VALUE, 3 };
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
            org.junit.Assert.fail("test3litNum6700 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("2147483647", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test3litNum6702_failAssert725() throws Exception, ContradictionException, TimeoutException {
        try {
            Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
            solver.setSearchListener(new TextOutputTracing<Object>(null));
            int[] backdoor = new int[]{ 1, 0, 3 };
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
            org.junit.Assert.fail("test3litNum6702 should have thrown TimeoutException");
        } catch (TimeoutException expected) {
            Assert.assertEquals("Cannot decide the satisfiability", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test3litNum6704_failAssert727() throws Exception, ContradictionException, TimeoutException {
        try {
            Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
            solver.setSearchListener(new TextOutputTracing<Object>(null));
            int[] backdoor = new int[]{ 1, 2, 4 };
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
            org.junit.Assert.fail("test3litNum6704 should have thrown TimeoutException");
        } catch (TimeoutException expected) {
            Assert.assertEquals("Cannot decide the satisfiability", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test3litNum6706_failAssert729() throws Exception, ContradictionException, TimeoutException {
        try {
            Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
            solver.setSearchListener(new TextOutputTracing<Object>(null));
            int[] backdoor = new int[]{ 1, 2, Integer.MAX_VALUE };
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
            org.junit.Assert.fail("test3litNum6706 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("2147483647", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test3litNum6711_failAssert733() throws Exception, ContradictionException, TimeoutException {
        try {
            Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
            solver.setSearchListener(new TextOutputTracing<Object>(null));
            int[] backdoor = new int[]{ 1, 2, 3 };
            IOrder order = new SubsetVarOrder(backdoor);
            solver.setOrder(order);
            IVecInt clause = new VecInt();
            clause.push((-0)).push(4).push(7);
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
            org.junit.Assert.fail("test3litNum6711 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test3litNum6712_failAssert734() throws Exception, ContradictionException, TimeoutException {
        try {
            Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
            solver.setSearchListener(new TextOutputTracing<Object>(null));
            int[] backdoor = new int[]{ 1, 2, 3 };
            IOrder order = new SubsetVarOrder(backdoor);
            solver.setOrder(order);
            IVecInt clause = new VecInt();
            clause.push((-(Integer.MAX_VALUE))).push(4).push(7);
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
            org.junit.Assert.fail("test3litNum6712 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test3litNum6713_failAssert735() throws Exception, ContradictionException, TimeoutException {
        try {
            Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
            solver.setSearchListener(new TextOutputTracing<Object>(null));
            int[] backdoor = new int[]{ 1, 2, 3 };
            IOrder order = new SubsetVarOrder(backdoor);
            solver.setOrder(order);
            IVecInt clause = new VecInt();
            clause.push((-(Integer.MIN_VALUE))).push(4).push(7);
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
            org.junit.Assert.fail("test3litNum6713 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-2147483648", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test3litNum6715_failAssert736() throws Exception, ContradictionException, TimeoutException {
        try {
            Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
            solver.setSearchListener(new TextOutputTracing<Object>(null));
            int[] backdoor = new int[]{ 1, 2, 3 };
            IOrder order = new SubsetVarOrder(backdoor);
            solver.setOrder(order);
            IVecInt clause = new VecInt();
            clause.push((-1)).push(5).push(7);
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
            org.junit.Assert.fail("test3litNum6715 should have thrown TimeoutException");
        } catch (TimeoutException expected) {
            Assert.assertEquals("Cannot decide the satisfiability", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test3litNum6717_failAssert737() throws Exception, ContradictionException, TimeoutException {
        try {
            Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
            solver.setSearchListener(new TextOutputTracing<Object>(null));
            int[] backdoor = new int[]{ 1, 2, 3 };
            IOrder order = new SubsetVarOrder(backdoor);
            solver.setOrder(order);
            IVecInt clause = new VecInt();
            clause.push((-1)).push(Integer.MAX_VALUE).push(7);
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
            org.junit.Assert.fail("test3litNum6717 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test3litNum6719_failAssert739() throws Exception, ContradictionException, TimeoutException {
        try {
            Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
            solver.setSearchListener(new TextOutputTracing<Object>(null));
            int[] backdoor = new int[]{ 1, 2, 3 };
            IOrder order = new SubsetVarOrder(backdoor);
            solver.setOrder(order);
            IVecInt clause = new VecInt();
            clause.push((-1)).push(0).push(7);
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
            org.junit.Assert.fail("test3litNum6719 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test3litNum6729_failAssert745() throws Exception, ContradictionException, TimeoutException {
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
            clause.push((-(Integer.MAX_VALUE))).push(5).push(7);
            solver.addClause(clause);
            clause = new VecInt();
            clause.push((-3)).push(6).push(5);
            solver.addClause(clause);
            clause = new VecInt();
            clause.push(1).push(2).push(3).push(7).push(8);
            solver.addClause(clause);
            solver.isSatisfiable();
            org.junit.Assert.fail("test3litNum6729 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test3litNum6731_failAssert747() throws Exception, ContradictionException, TimeoutException {
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
            clause.push((-0)).push(5).push(7);
            solver.addClause(clause);
            clause = new VecInt();
            clause.push((-3)).push(6).push(5);
            solver.addClause(clause);
            clause = new VecInt();
            clause.push(1).push(2).push(3).push(7).push(8);
            solver.addClause(clause);
            solver.isSatisfiable();
            org.junit.Assert.fail("test3litNum6731 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test3litNum6745_failAssert758() throws Exception, ContradictionException, TimeoutException {
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
            clause.push((-4)).push(6).push(5);
            solver.addClause(clause);
            clause = new VecInt();
            clause.push(1).push(2).push(3).push(7).push(8);
            solver.addClause(clause);
            solver.isSatisfiable();
            org.junit.Assert.fail("test3litNum6745 should have thrown TimeoutException");
        } catch (TimeoutException expected) {
            Assert.assertEquals("Cannot decide the satisfiability", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test3litNum6747_failAssert759() throws Exception, ContradictionException, TimeoutException {
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
            clause.push((-(Integer.MAX_VALUE))).push(6).push(5);
            solver.addClause(clause);
            clause = new VecInt();
            clause.push(1).push(2).push(3).push(7).push(8);
            solver.addClause(clause);
            solver.isSatisfiable();
            org.junit.Assert.fail("test3litNum6747 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test3litNum6749_failAssert761() throws Exception, ContradictionException, TimeoutException {
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
            clause.push((-0)).push(6).push(5);
            solver.addClause(clause);
            clause = new VecInt();
            clause.push(1).push(2).push(3).push(7).push(8);
            solver.addClause(clause);
            solver.isSatisfiable();
            org.junit.Assert.fail("test3litNum6749 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test3litNum6764_failAssert771() throws Exception, ContradictionException, TimeoutException {
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
            clause.push(0).push(2).push(3).push(7).push(8);
            solver.addClause(clause);
            solver.isSatisfiable();
            org.junit.Assert.fail("test3litNum6764 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test3litNum6765_failAssert772() throws Exception, ContradictionException, TimeoutException {
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
            clause.push(Integer.MAX_VALUE).push(2).push(3).push(7).push(8);
            solver.addClause(clause);
            solver.isSatisfiable();
            org.junit.Assert.fail("test3litNum6765 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test3_add6798_failAssert798() throws Exception, ContradictionException, TimeoutException {
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
            solver.addClause(clause);
            clause = new VecInt();
            clause.push((-3)).push(6).push(5);
            solver.addClause(clause);
            clause = new VecInt();
            clause.push(1).push(2).push(3).push(7).push(8);
            solver.addClause(clause);
            solver.isSatisfiable();
            org.junit.Assert.fail("test3_add6798 should have thrown TimeoutException");
        } catch (TimeoutException expected) {
            Assert.assertEquals("Cannot decide the satisfiability", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test3_add6798_failAssert798_add7764_failAssert814() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                solver.setSearchListener(new TextOutputTracing<Object>(null));
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
                solver.addClause(clause);
                clause = new VecInt();
                clause.push((-3)).push(6).push(5);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push(1).push(2).push(3).push(7).push(8);
                solver.addClause(clause);
                solver.isSatisfiable();
                org.junit.Assert.fail("test3_add6798 should have thrown TimeoutException");
            }
            org.junit.Assert.fail("test3_add6798_failAssert798_add7764 should have thrown TimeoutException");
        } catch (TimeoutException expected) {
            Assert.assertEquals("Cannot decide the satisfiability", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test3litNum6713_failAssert735_add9150_failAssert815() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                solver.setSearchListener(new TextOutputTracing<Object>(null));
                solver.setSearchListener(new TextOutputTracing<Object>(null));
                int[] backdoor = new int[]{ 1, 2, 3 };
                IOrder order = new SubsetVarOrder(backdoor);
                solver.setOrder(order);
                IVecInt clause = new VecInt();
                clause.push((-(Integer.MIN_VALUE))).push(4).push(7);
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
                org.junit.Assert.fail("test3litNum6713 should have thrown ArrayIndexOutOfBoundsException");
            }
            org.junit.Assert.fail("test3litNum6713_failAssert735_add9150 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-2147483648", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test3litNum6695_failAssert718_add8385_failAssert816() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                solver.setSearchListener(new TextOutputTracing<Object>(null));
                solver.setSearchListener(new TextOutputTracing<Object>(null));
                int[] backdoor = new int[]{ Integer.MAX_VALUE, 2, 3 };
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
                org.junit.Assert.fail("test3litNum6695 should have thrown ArrayIndexOutOfBoundsException");
            }
            org.junit.Assert.fail("test3litNum6695_failAssert718_add8385 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("2147483647", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test3litNum6706_failAssert729_add7917_failAssert817() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                solver.setSearchListener(new TextOutputTracing<Object>(null));
                solver.setSearchListener(new TextOutputTracing<Object>(null));
                int[] backdoor = new int[]{ 1, 2, Integer.MAX_VALUE };
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
                org.junit.Assert.fail("test3litNum6706 should have thrown ArrayIndexOutOfBoundsException");
            }
            org.junit.Assert.fail("test3litNum6706_failAssert729_add7917 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("2147483647", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test3litNum6700_failAssert723_add8795_failAssert818() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                solver.setSearchListener(new TextOutputTracing<Object>(null));
                solver.setSearchListener(new TextOutputTracing<Object>(null));
                int[] backdoor = new int[]{ 1, Integer.MAX_VALUE, 3 };
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
                org.junit.Assert.fail("test3litNum6700 should have thrown ArrayIndexOutOfBoundsException");
            }
            org.junit.Assert.fail("test3litNum6700_failAssert723_add8795 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("2147483647", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test3litNum6749_failAssert761_add8832_failAssert819() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                solver.setSearchListener(new TextOutputTracing<Object>(null));
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
                clause.push((-0)).push(6).push(5);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push(1).push(2).push(3).push(7).push(8);
                solver.addClause(clause);
                solver.isSatisfiable();
                org.junit.Assert.fail("test3litNum6749 should have thrown IllegalArgumentException");
            }
            org.junit.Assert.fail("test3litNum6749_failAssert761_add8832 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test3litNum6719_failAssert739_add7294_failAssert820() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                solver.setSearchListener(new TextOutputTracing<Object>(null));
                solver.setSearchListener(new TextOutputTracing<Object>(null));
                int[] backdoor = new int[]{ 1, 2, 3 };
                IOrder order = new SubsetVarOrder(backdoor);
                solver.setOrder(order);
                IVecInt clause = new VecInt();
                clause.push((-1)).push(0).push(7);
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
                org.junit.Assert.fail("test3litNum6719 should have thrown IllegalArgumentException");
            }
            org.junit.Assert.fail("test3litNum6719_failAssert739_add7294 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test3litNum6731_failAssert747_add7569_failAssert821() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                solver.setSearchListener(new TextOutputTracing<Object>(null));
                solver.setSearchListener(new TextOutputTracing<Object>(null));
                int[] backdoor = new int[]{ 1, 2, 3 };
                IOrder order = new SubsetVarOrder(backdoor);
                solver.setOrder(order);
                IVecInt clause = new VecInt();
                clause.push((-1)).push(4).push(7);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push((-0)).push(5).push(7);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push((-3)).push(6).push(5);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push(1).push(2).push(3).push(7).push(8);
                solver.addClause(clause);
                solver.isSatisfiable();
                org.junit.Assert.fail("test3litNum6731 should have thrown IllegalArgumentException");
            }
            org.junit.Assert.fail("test3litNum6731_failAssert747_add7569 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test3litNum6764_failAssert771_add7260_failAssert822() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                solver.setSearchListener(new TextOutputTracing<Object>(null));
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
                clause.push(0).push(2).push(3).push(7).push(8);
                solver.addClause(clause);
                solver.isSatisfiable();
                org.junit.Assert.fail("test3litNum6764 should have thrown IllegalArgumentException");
            }
            org.junit.Assert.fail("test3litNum6764_failAssert771_add7260 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test3litNum6711_failAssert733_add8730_failAssert823() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                solver.setSearchListener(new TextOutputTracing<Object>(null));
                solver.setSearchListener(new TextOutputTracing<Object>(null));
                int[] backdoor = new int[]{ 1, 2, 3 };
                IOrder order = new SubsetVarOrder(backdoor);
                solver.setOrder(order);
                IVecInt clause = new VecInt();
                clause.push((-0)).push(4).push(7);
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
                org.junit.Assert.fail("test3litNum6711 should have thrown IllegalArgumentException");
            }
            org.junit.Assert.fail("test3litNum6711_failAssert733_add8730 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test3litNum6747_failAssert759_add8558_failAssert824() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                solver.setSearchListener(new TextOutputTracing<Object>(null));
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
                clause.push((-(Integer.MAX_VALUE))).push(6).push(5);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push(1).push(2).push(3).push(7).push(8);
                solver.addClause(clause);
                solver.isSatisfiable();
                org.junit.Assert.fail("test3litNum6747 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("test3litNum6747_failAssert759_add8558 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test3litNum6729_failAssert745_add8014_failAssert825() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                solver.setSearchListener(new TextOutputTracing<Object>(null));
                solver.setSearchListener(new TextOutputTracing<Object>(null));
                int[] backdoor = new int[]{ 1, 2, 3 };
                IOrder order = new SubsetVarOrder(backdoor);
                solver.setOrder(order);
                IVecInt clause = new VecInt();
                clause.push((-1)).push(4).push(7);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push((-(Integer.MAX_VALUE))).push(5).push(7);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push((-3)).push(6).push(5);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push(1).push(2).push(3).push(7).push(8);
                solver.addClause(clause);
                solver.isSatisfiable();
                org.junit.Assert.fail("test3litNum6729 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("test3litNum6729_failAssert745_add8014 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test3litNum6712_failAssert734_add8661_failAssert826() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                solver.setSearchListener(new TextOutputTracing<Object>(null));
                solver.setSearchListener(new TextOutputTracing<Object>(null));
                int[] backdoor = new int[]{ 1, 2, 3 };
                IOrder order = new SubsetVarOrder(backdoor);
                solver.setOrder(order);
                IVecInt clause = new VecInt();
                clause.push((-(Integer.MAX_VALUE))).push(4).push(7);
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
                org.junit.Assert.fail("test3litNum6712 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("test3litNum6712_failAssert734_add8661 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test3litNum6765_failAssert772_add8213_failAssert827() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                solver.setSearchListener(new TextOutputTracing<Object>(null));
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
                clause.push(Integer.MAX_VALUE).push(2).push(3).push(7).push(8);
                solver.addClause(clause);
                solver.isSatisfiable();
                org.junit.Assert.fail("test3litNum6765 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("test3litNum6765_failAssert772_add8213 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test3litNum6717_failAssert737_add7512_failAssert828() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                solver.setSearchListener(new TextOutputTracing<Object>(null));
                solver.setSearchListener(new TextOutputTracing<Object>(null));
                int[] backdoor = new int[]{ 1, 2, 3 };
                IOrder order = new SubsetVarOrder(backdoor);
                solver.setOrder(order);
                IVecInt clause = new VecInt();
                clause.push((-1)).push(Integer.MAX_VALUE).push(7);
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
                org.junit.Assert.fail("test3litNum6717 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("test3litNum6717_failAssert737_add7512 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test3litNum6698_failAssert721_add9239_failAssert829() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                solver.setSearchListener(new TextOutputTracing<Object>(null));
                solver.setSearchListener(new TextOutputTracing<Object>(null));
                int[] backdoor = new int[]{ 1, 3, 3 };
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
                org.junit.Assert.fail("test3litNum6698 should have thrown TimeoutException");
            }
            org.junit.Assert.fail("test3litNum6698_failAssert721_add9239 should have thrown TimeoutException");
        } catch (TimeoutException expected) {
            Assert.assertEquals("Cannot decide the satisfiability", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test3litNum6694_failAssert717_add9265_failAssert830() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                solver.setSearchListener(new TextOutputTracing<Object>(null));
                solver.setSearchListener(new TextOutputTracing<Object>(null));
                int[] backdoor = new int[]{ 0, 2, 3 };
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
                org.junit.Assert.fail("test3litNum6694 should have thrown TimeoutException");
            }
            org.junit.Assert.fail("test3litNum6694_failAssert717_add9265 should have thrown TimeoutException");
        } catch (TimeoutException expected) {
            Assert.assertEquals("Cannot decide the satisfiability", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test3litNum6745_failAssert758_add9072_failAssert831() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                solver.setSearchListener(new TextOutputTracing<Object>(null));
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
                clause.push((-4)).push(6).push(5);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push(1).push(2).push(3).push(7).push(8);
                solver.addClause(clause);
                solver.isSatisfiable();
                org.junit.Assert.fail("test3litNum6745 should have thrown TimeoutException");
            }
            org.junit.Assert.fail("test3litNum6745_failAssert758_add9072 should have thrown TimeoutException");
        } catch (TimeoutException expected) {
            Assert.assertEquals("Cannot decide the satisfiability", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test3litNum6693_failAssert716_add9343_failAssert832() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                solver.setSearchListener(new TextOutputTracing<Object>(null));
                solver.setSearchListener(new TextOutputTracing<Object>(null));
                int[] backdoor = new int[]{ 2, 2, 3 };
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
                org.junit.Assert.fail("test3litNum6693 should have thrown TimeoutException");
            }
            org.junit.Assert.fail("test3litNum6693_failAssert716_add9343 should have thrown TimeoutException");
        } catch (TimeoutException expected) {
            Assert.assertEquals("Cannot decide the satisfiability", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test3litNum6704_failAssert727_add7453_failAssert834() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                solver.setSearchListener(new TextOutputTracing<Object>(null));
                solver.setSearchListener(new TextOutputTracing<Object>(null));
                int[] backdoor = new int[]{ 1, 2, 4 };
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
                org.junit.Assert.fail("test3litNum6704 should have thrown TimeoutException");
            }
            org.junit.Assert.fail("test3litNum6704_failAssert727_add7453 should have thrown TimeoutException");
        } catch (TimeoutException expected) {
            Assert.assertEquals("Cannot decide the satisfiability", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test3litNum6702_failAssert725_add8351_failAssert835() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                solver.setSearchListener(new TextOutputTracing<Object>(null));
                solver.setSearchListener(new TextOutputTracing<Object>(null));
                int[] backdoor = new int[]{ 1, 0, 3 };
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
                org.junit.Assert.fail("test3litNum6702 should have thrown TimeoutException");
            }
            org.junit.Assert.fail("test3litNum6702_failAssert725_add8351 should have thrown TimeoutException");
        } catch (TimeoutException expected) {
            Assert.assertEquals("Cannot decide the satisfiability", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test3litNum6713_failAssert735_add9157_failAssert837() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                solver.setSearchListener(new TextOutputTracing<Object>(null));
                int[] backdoor = new int[]{ 1, 2, 3 };
                IOrder order = new SubsetVarOrder(backdoor);
                solver.setOrder(order);
                IVecInt clause = new VecInt();
                clause.push((-(Integer.MIN_VALUE))).push(4).push(7);
                clause.push((-(Integer.MIN_VALUE))).push(4).push(7);
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
                org.junit.Assert.fail("test3litNum6713 should have thrown ArrayIndexOutOfBoundsException");
            }
            org.junit.Assert.fail("test3litNum6713_failAssert735_add9157 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-2147483648", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test3litNum6747_failAssert759_add8612_failAssert844() throws Exception, ContradictionException, TimeoutException {
        try {
            {
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
                clause.push((-(Integer.MAX_VALUE))).push(6).push(5);
                clause.push((-(Integer.MAX_VALUE))).push(6).push(5);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push(1).push(2).push(3).push(7).push(8);
                solver.addClause(clause);
                solver.isSatisfiable();
                org.junit.Assert.fail("test3litNum6747 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("test3litNum6747_failAssert759_add8612 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test3litNum6729_failAssert745_add8040_failAssert846() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                solver.setSearchListener(new TextOutputTracing<Object>(null));
                int[] backdoor = new int[]{ 1, 2, 3 };
                IOrder order = new SubsetVarOrder(backdoor);
                solver.setOrder(order);
                IVecInt clause = new VecInt();
                clause.push((-1)).push(4).push(7);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push((-(Integer.MAX_VALUE))).push(5).push(7);
                clause.push((-(Integer.MAX_VALUE))).push(5).push(7);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push((-3)).push(6).push(5);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push(1).push(2).push(3).push(7).push(8);
                solver.addClause(clause);
                solver.isSatisfiable();
                org.junit.Assert.fail("test3litNum6729 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("test3litNum6729_failAssert745_add8040 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test3litNum6712_failAssert734_add8669_failAssert847() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                solver.setSearchListener(new TextOutputTracing<Object>(null));
                int[] backdoor = new int[]{ 1, 2, 3 };
                IOrder order = new SubsetVarOrder(backdoor);
                solver.setOrder(order);
                IVecInt clause = new VecInt();
                clause.push((-(Integer.MAX_VALUE))).push(4).push(7);
                clause.push((-(Integer.MAX_VALUE))).push(4).push(7);
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
                org.junit.Assert.fail("test3litNum6712 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("test3litNum6712_failAssert734_add8669 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test3litNum6717_failAssert737_add7520_failAssert848() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                solver.setSearchListener(new TextOutputTracing<Object>(null));
                int[] backdoor = new int[]{ 1, 2, 3 };
                IOrder order = new SubsetVarOrder(backdoor);
                solver.setOrder(order);
                IVecInt clause = new VecInt();
                clause.push((-1)).push(Integer.MAX_VALUE).push(7);
                clause.push((-1)).push(Integer.MAX_VALUE).push(7);
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
                org.junit.Assert.fail("test3litNum6717 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("test3litNum6717_failAssert737_add7520 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test3litNum6731_failAssert747_add7564_failAssert862() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                SolverFactory.newGlucose();
                Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                solver.setSearchListener(new TextOutputTracing<Object>(null));
                int[] backdoor = new int[]{ 1, 2, 3 };
                IOrder order = new SubsetVarOrder(backdoor);
                solver.setOrder(order);
                IVecInt clause = new VecInt();
                clause.push((-1)).push(4).push(7);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push((-0)).push(5).push(7);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push((-3)).push(6).push(5);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push(1).push(2).push(3).push(7).push(8);
                solver.addClause(clause);
                solver.isSatisfiable();
                org.junit.Assert.fail("test3litNum6731 should have thrown IllegalArgumentException");
            }
            org.junit.Assert.fail("test3litNum6731_failAssert747_add7564 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test3litNum6702_failAssert725litNum8003_failAssert865() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                solver.setSearchListener(new TextOutputTracing<Object>(null));
                int[] backdoor = new int[]{ 1, 0, 0 };
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
                org.junit.Assert.fail("test3litNum6702 should have thrown TimeoutException");
            }
            org.junit.Assert.fail("test3litNum6702_failAssert725litNum8003 should have thrown TimeoutException");
        } catch (TimeoutException expected) {
            Assert.assertEquals("Cannot decide the satisfiability", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test3litNum6702_failAssert725litNum8232_failAssert874() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                solver.setSearchListener(new TextOutputTracing<Object>(null));
                int[] backdoor = new int[]{ 1, 0, 3 };
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
                clause.push(1).push(2).push(2).push(7).push(8);
                solver.addClause(clause);
                solver.isSatisfiable();
                org.junit.Assert.fail("test3litNum6702 should have thrown TimeoutException");
            }
            org.junit.Assert.fail("test3litNum6702_failAssert725litNum8232 should have thrown TimeoutException");
        } catch (TimeoutException expected) {
            Assert.assertEquals("Cannot decide the satisfiability", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test3litNum6702_failAssert725litNum8174_failAssert905() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                solver.setSearchListener(new TextOutputTracing<Object>(null));
                int[] backdoor = new int[]{ 1, 0, 3 };
                IOrder order = new SubsetVarOrder(backdoor);
                solver.setOrder(order);
                IVecInt clause = new VecInt();
                clause.push((-1)).push(4).push(7);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push((-2)).push(5).push(7);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push((-3)).push(6).push(6);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push(1).push(2).push(3).push(7).push(8);
                solver.addClause(clause);
                solver.isSatisfiable();
                org.junit.Assert.fail("test3litNum6702 should have thrown TimeoutException");
            }
            org.junit.Assert.fail("test3litNum6702_failAssert725litNum8174 should have thrown TimeoutException");
        } catch (TimeoutException expected) {
            Assert.assertEquals("Cannot decide the satisfiability", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test3litNum6704_failAssert727litNum7240_failAssert909() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                solver.setSearchListener(new TextOutputTracing<Object>(null));
                int[] backdoor = new int[]{ 1, 2, 4 };
                IOrder order = new SubsetVarOrder(backdoor);
                solver.setOrder(order);
                IVecInt clause = new VecInt();
                clause.push((-1)).push(4).push(7);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push((-2)).push(5).push(7);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push((-3)).push(5).push(5);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push(1).push(2).push(3).push(7).push(8);
                solver.addClause(clause);
                solver.isSatisfiable();
                org.junit.Assert.fail("test3litNum6704 should have thrown TimeoutException");
            }
            org.junit.Assert.fail("test3litNum6704_failAssert727litNum7240 should have thrown TimeoutException");
        } catch (TimeoutException expected) {
            Assert.assertEquals("Cannot decide the satisfiability", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test3litNum6702_failAssert725litNum7992_failAssert930() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                solver.setSearchListener(new TextOutputTracing<Object>(null));
                int[] backdoor = new int[]{ 1, 0, 4 };
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
                org.junit.Assert.fail("test3litNum6702 should have thrown TimeoutException");
            }
            org.junit.Assert.fail("test3litNum6702_failAssert725litNum7992 should have thrown TimeoutException");
        } catch (TimeoutException expected) {
            Assert.assertEquals("Cannot decide the satisfiability", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test3litNum6694_failAssert717litNum9103_failAssert963() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                solver.setSearchListener(new TextOutputTracing<Object>(null));
                int[] backdoor = new int[]{ 0, 2, 3 };
                IOrder order = new SubsetVarOrder(backdoor);
                solver.setOrder(order);
                IVecInt clause = new VecInt();
                clause.push((-1)).push(4).push(7);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push((-2)).push(5).push(7);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push((-3)).push(5).push(5);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push(1).push(2).push(3).push(7).push(8);
                solver.addClause(clause);
                solver.isSatisfiable();
                org.junit.Assert.fail("test3litNum6694 should have thrown TimeoutException");
            }
            org.junit.Assert.fail("test3litNum6694_failAssert717litNum9103 should have thrown TimeoutException");
        } catch (TimeoutException expected) {
            Assert.assertEquals("Cannot decide the satisfiability", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test3litNum6694_failAssert717litNum9151_failAssert991() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                solver.setSearchListener(new TextOutputTracing<Object>(null));
                int[] backdoor = new int[]{ 0, 2, 3 };
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
                clause.push(1).push(1).push(3).push(7).push(8);
                solver.addClause(clause);
                solver.isSatisfiable();
                org.junit.Assert.fail("test3litNum6694 should have thrown TimeoutException");
            }
            org.junit.Assert.fail("test3litNum6694_failAssert717litNum9151 should have thrown TimeoutException");
        } catch (TimeoutException expected) {
            Assert.assertEquals("Cannot decide the satisfiability", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test3litNum6693_failAssert716litNum9216_failAssert995() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                solver.setSearchListener(new TextOutputTracing<Object>(null));
                int[] backdoor = new int[]{ 2, 2, 3 };
                IOrder order = new SubsetVarOrder(backdoor);
                solver.setOrder(order);
                IVecInt clause = new VecInt();
                clause.push((-1)).push(3).push(7);
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
                org.junit.Assert.fail("test3litNum6693 should have thrown TimeoutException");
            }
            org.junit.Assert.fail("test3litNum6693_failAssert716litNum9216 should have thrown TimeoutException");
        } catch (TimeoutException expected) {
            Assert.assertEquals("Cannot decide the satisfiability", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test3litNum6713_failAssert735_add9150_failAssert815_add13108_failAssert1000() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                    solver.setSearchListener(new TextOutputTracing<Object>(null));
                    solver.setSearchListener(new TextOutputTracing<Object>(null));
                    solver.setSearchListener(new TextOutputTracing<Object>(null));
                    int[] backdoor = new int[]{ 1, 2, 3 };
                    IOrder order = new SubsetVarOrder(backdoor);
                    solver.setOrder(order);
                    IVecInt clause = new VecInt();
                    clause.push((-(Integer.MIN_VALUE))).push(4).push(7);
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
                    org.junit.Assert.fail("test3litNum6713 should have thrown ArrayIndexOutOfBoundsException");
                }
                org.junit.Assert.fail("test3litNum6713_failAssert735_add9150 should have thrown ArrayIndexOutOfBoundsException");
            }
            org.junit.Assert.fail("test3litNum6713_failAssert735_add9150_failAssert815_add13108 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-2147483648", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test3litNum6695_failAssert718_add8385_failAssert816_add11657_failAssert1002() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                    solver.setSearchListener(new TextOutputTracing<Object>(null));
                    solver.setSearchListener(new TextOutputTracing<Object>(null));
                    solver.setSearchListener(new TextOutputTracing<Object>(null));
                    int[] backdoor = new int[]{ Integer.MAX_VALUE, 2, 3 };
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
                    org.junit.Assert.fail("test3litNum6695 should have thrown ArrayIndexOutOfBoundsException");
                }
                org.junit.Assert.fail("test3litNum6695_failAssert718_add8385 should have thrown ArrayIndexOutOfBoundsException");
            }
            org.junit.Assert.fail("test3litNum6695_failAssert718_add8385_failAssert816_add11657 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("2147483647", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test3litNum6706_failAssert729_add7917_failAssert817_add12146_failAssert1004() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                    solver.setSearchListener(new TextOutputTracing<Object>(null));
                    solver.setSearchListener(new TextOutputTracing<Object>(null));
                    solver.setSearchListener(new TextOutputTracing<Object>(null));
                    int[] backdoor = new int[]{ 1, 2, Integer.MAX_VALUE };
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
                    org.junit.Assert.fail("test3litNum6706 should have thrown ArrayIndexOutOfBoundsException");
                }
                org.junit.Assert.fail("test3litNum6706_failAssert729_add7917 should have thrown ArrayIndexOutOfBoundsException");
            }
            org.junit.Assert.fail("test3litNum6706_failAssert729_add7917_failAssert817_add12146 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("2147483647", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test3litNum6700_failAssert723_add8795_failAssert818_add10147_failAssert1006() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                    solver.setSearchListener(new TextOutputTracing<Object>(null));
                    solver.setSearchListener(new TextOutputTracing<Object>(null));
                    solver.setSearchListener(new TextOutputTracing<Object>(null));
                    int[] backdoor = new int[]{ 1, Integer.MAX_VALUE, 3 };
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
                    org.junit.Assert.fail("test3litNum6700 should have thrown ArrayIndexOutOfBoundsException");
                }
                org.junit.Assert.fail("test3litNum6700_failAssert723_add8795 should have thrown ArrayIndexOutOfBoundsException");
            }
            org.junit.Assert.fail("test3litNum6700_failAssert723_add8795_failAssert818_add10147 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("2147483647", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test3litNum6747_failAssert759_add8558_failAssert824_add10149_failAssert1008() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                    solver.setSearchListener(new TextOutputTracing<Object>(null));
                    solver.setSearchListener(new TextOutputTracing<Object>(null));
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
                    clause.push((-(Integer.MAX_VALUE))).push(6).push(5);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push(1).push(2).push(3).push(7).push(8);
                    solver.addClause(clause);
                    solver.isSatisfiable();
                    org.junit.Assert.fail("test3litNum6747 should have thrown NegativeArraySizeException");
                }
                org.junit.Assert.fail("test3litNum6747_failAssert759_add8558 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("test3litNum6747_failAssert759_add8558_failAssert824_add10149 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test3_add6798_failAssert798_add7764_failAssert814_add12634_failAssert1010() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                    solver.setSearchListener(new TextOutputTracing<Object>(null));
                    solver.setSearchListener(new TextOutputTracing<Object>(null));
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
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-3)).push(6).push(5);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push(1).push(2).push(3).push(7).push(8);
                    solver.addClause(clause);
                    solver.isSatisfiable();
                    org.junit.Assert.fail("test3_add6798 should have thrown TimeoutException");
                }
                org.junit.Assert.fail("test3_add6798_failAssert798_add7764 should have thrown TimeoutException");
            }
            org.junit.Assert.fail("test3_add6798_failAssert798_add7764_failAssert814_add12634 should have thrown TimeoutException");
        } catch (TimeoutException expected) {
            Assert.assertEquals("Cannot decide the satisfiability", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test3litNum6729_failAssert745_add8014_failAssert825_add10628_failAssert1012() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                    solver.setSearchListener(new TextOutputTracing<Object>(null));
                    solver.setSearchListener(new TextOutputTracing<Object>(null));
                    solver.setSearchListener(new TextOutputTracing<Object>(null));
                    int[] backdoor = new int[]{ 1, 2, 3 };
                    IOrder order = new SubsetVarOrder(backdoor);
                    solver.setOrder(order);
                    IVecInt clause = new VecInt();
                    clause.push((-1)).push(4).push(7);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-(Integer.MAX_VALUE))).push(5).push(7);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-3)).push(6).push(5);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push(1).push(2).push(3).push(7).push(8);
                    solver.addClause(clause);
                    solver.isSatisfiable();
                    org.junit.Assert.fail("test3litNum6729 should have thrown NegativeArraySizeException");
                }
                org.junit.Assert.fail("test3litNum6729_failAssert745_add8014 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("test3litNum6729_failAssert745_add8014_failAssert825_add10628 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test3litNum6712_failAssert734_add8661_failAssert826_add13049_failAssert1014() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                    solver.setSearchListener(new TextOutputTracing<Object>(null));
                    solver.setSearchListener(new TextOutputTracing<Object>(null));
                    solver.setSearchListener(new TextOutputTracing<Object>(null));
                    int[] backdoor = new int[]{ 1, 2, 3 };
                    IOrder order = new SubsetVarOrder(backdoor);
                    solver.setOrder(order);
                    IVecInt clause = new VecInt();
                    clause.push((-(Integer.MAX_VALUE))).push(4).push(7);
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
                    org.junit.Assert.fail("test3litNum6712 should have thrown NegativeArraySizeException");
                }
                org.junit.Assert.fail("test3litNum6712_failAssert734_add8661 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("test3litNum6712_failAssert734_add8661_failAssert826_add13049 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test3litNum6765_failAssert772_add8213_failAssert827_add13357_failAssert1016() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                    solver.setSearchListener(new TextOutputTracing<Object>(null));
                    solver.setSearchListener(new TextOutputTracing<Object>(null));
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
                    clause.push(Integer.MAX_VALUE).push(2).push(3).push(7).push(8);
                    solver.addClause(clause);
                    solver.isSatisfiable();
                    org.junit.Assert.fail("test3litNum6765 should have thrown NegativeArraySizeException");
                }
                org.junit.Assert.fail("test3litNum6765_failAssert772_add8213 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("test3litNum6765_failAssert772_add8213_failAssert827_add13357 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test3litNum6717_failAssert737_add7512_failAssert828_add11705_failAssert1018() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                    solver.setSearchListener(new TextOutputTracing<Object>(null));
                    solver.setSearchListener(new TextOutputTracing<Object>(null));
                    solver.setSearchListener(new TextOutputTracing<Object>(null));
                    int[] backdoor = new int[]{ 1, 2, 3 };
                    IOrder order = new SubsetVarOrder(backdoor);
                    solver.setOrder(order);
                    IVecInt clause = new VecInt();
                    clause.push((-1)).push(Integer.MAX_VALUE).push(7);
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
                    org.junit.Assert.fail("test3litNum6717 should have thrown NegativeArraySizeException");
                }
                org.junit.Assert.fail("test3litNum6717_failAssert737_add7512 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("test3litNum6717_failAssert737_add7512_failAssert828_add11705 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test3litNum6719_failAssert739_add7294_failAssert820_add10767_failAssert1020() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                    solver.setSearchListener(new TextOutputTracing<Object>(null));
                    solver.setSearchListener(new TextOutputTracing<Object>(null));
                    solver.setSearchListener(new TextOutputTracing<Object>(null));
                    int[] backdoor = new int[]{ 1, 2, 3 };
                    IOrder order = new SubsetVarOrder(backdoor);
                    solver.setOrder(order);
                    IVecInt clause = new VecInt();
                    clause.push((-1)).push(0).push(7);
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
                    org.junit.Assert.fail("test3litNum6719 should have thrown IllegalArgumentException");
                }
                org.junit.Assert.fail("test3litNum6719_failAssert739_add7294 should have thrown IllegalArgumentException");
            }
            org.junit.Assert.fail("test3litNum6719_failAssert739_add7294_failAssert820_add10767 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test3litNum6749_failAssert761_add8832_failAssert819_add10409_failAssert1021() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                    solver.setSearchListener(new TextOutputTracing<Object>(null));
                    solver.setSearchListener(new TextOutputTracing<Object>(null));
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
                    clause.push((-0)).push(6).push(5);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push(1).push(2).push(3).push(7).push(8);
                    solver.addClause(clause);
                    solver.isSatisfiable();
                    org.junit.Assert.fail("test3litNum6749 should have thrown IllegalArgumentException");
                }
                org.junit.Assert.fail("test3litNum6749_failAssert761_add8832 should have thrown IllegalArgumentException");
            }
            org.junit.Assert.fail("test3litNum6749_failAssert761_add8832_failAssert819_add10409 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test3litNum6731_failAssert747_add7569_failAssert821_add11187_failAssert1024() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                    solver.setSearchListener(new TextOutputTracing<Object>(null));
                    solver.setSearchListener(new TextOutputTracing<Object>(null));
                    solver.setSearchListener(new TextOutputTracing<Object>(null));
                    int[] backdoor = new int[]{ 1, 2, 3 };
                    IOrder order = new SubsetVarOrder(backdoor);
                    solver.setOrder(order);
                    IVecInt clause = new VecInt();
                    clause.push((-1)).push(4).push(7);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-0)).push(5).push(7);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-3)).push(6).push(5);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push(1).push(2).push(3).push(7).push(8);
                    solver.addClause(clause);
                    solver.isSatisfiable();
                    org.junit.Assert.fail("test3litNum6731 should have thrown IllegalArgumentException");
                }
                org.junit.Assert.fail("test3litNum6731_failAssert747_add7569 should have thrown IllegalArgumentException");
            }
            org.junit.Assert.fail("test3litNum6731_failAssert747_add7569_failAssert821_add11187 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test3litNum6764_failAssert771_add7260_failAssert822_add10806_failAssert1026() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                    solver.setSearchListener(new TextOutputTracing<Object>(null));
                    solver.setSearchListener(new TextOutputTracing<Object>(null));
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
                    clause.push(0).push(2).push(3).push(7).push(8);
                    solver.addClause(clause);
                    solver.isSatisfiable();
                    org.junit.Assert.fail("test3litNum6764 should have thrown IllegalArgumentException");
                }
                org.junit.Assert.fail("test3litNum6764_failAssert771_add7260 should have thrown IllegalArgumentException");
            }
            org.junit.Assert.fail("test3litNum6764_failAssert771_add7260_failAssert822_add10806 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test3litNum6711_failAssert733_add8730_failAssert823_add11226_failAssert1028() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                    solver.setSearchListener(new TextOutputTracing<Object>(null));
                    solver.setSearchListener(new TextOutputTracing<Object>(null));
                    solver.setSearchListener(new TextOutputTracing<Object>(null));
                    int[] backdoor = new int[]{ 1, 2, 3 };
                    IOrder order = new SubsetVarOrder(backdoor);
                    solver.setOrder(order);
                    IVecInt clause = new VecInt();
                    clause.push((-0)).push(4).push(7);
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
                    org.junit.Assert.fail("test3litNum6711 should have thrown IllegalArgumentException");
                }
                org.junit.Assert.fail("test3litNum6711_failAssert733_add8730 should have thrown IllegalArgumentException");
            }
            org.junit.Assert.fail("test3litNum6711_failAssert733_add8730_failAssert823_add11226 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test3litNum6704_failAssert727litNum7240_failAssert909litNum9943_failAssert1031() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                    solver.setSearchListener(new TextOutputTracing<Object>(null));
                    int[] backdoor = new int[]{ 1, 2, 4 };
                    IOrder order = new SubsetVarOrder(backdoor);
                    solver.setOrder(order);
                    IVecInt clause = new VecInt();
                    clause.push((-1)).push(4).push(7);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-2)).push(5).push(7);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-3)).push(5).push(5);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push(1).push(2).push(3).push(0).push(8);
                    solver.addClause(clause);
                    solver.isSatisfiable();
                    org.junit.Assert.fail("test3litNum6704 should have thrown TimeoutException");
                }
                org.junit.Assert.fail("test3litNum6704_failAssert727litNum7240 should have thrown TimeoutException");
            }
            org.junit.Assert.fail("test3litNum6704_failAssert727litNum7240_failAssert909litNum9943 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test3litNum6704_failAssert727litNum7240_failAssert909litNum9903_failAssert1033() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                    solver.setSearchListener(new TextOutputTracing<Object>(null));
                    int[] backdoor = new int[]{ 1, 2, 4 };
                    IOrder order = new SubsetVarOrder(backdoor);
                    solver.setOrder(order);
                    IVecInt clause = new VecInt();
                    clause.push((-1)).push(4).push(7);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-2)).push(5).push(7);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-3)).push(5).push(5);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push(1).push(2).push(2).push(7).push(8);
                    solver.addClause(clause);
                    solver.isSatisfiable();
                    org.junit.Assert.fail("test3litNum6704 should have thrown TimeoutException");
                }
                org.junit.Assert.fail("test3litNum6704_failAssert727litNum7240 should have thrown TimeoutException");
            }
            org.junit.Assert.fail("test3litNum6704_failAssert727litNum7240_failAssert909litNum9903 should have thrown TimeoutException");
        } catch (TimeoutException expected) {
            Assert.assertEquals("Cannot decide the satisfiability", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test3litNum6704_failAssert727litNum7240_failAssert909litNum9821_failAssert1034() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                    solver.setSearchListener(new TextOutputTracing<Object>(null));
                    int[] backdoor = new int[]{ 1, 2, 4 };
                    IOrder order = new SubsetVarOrder(backdoor);
                    solver.setOrder(order);
                    IVecInt clause = new VecInt();
                    clause.push((-1)).push(4).push(7);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-2)).push(5).push(7);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-3)).push(5).push(6);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push(1).push(2).push(3).push(7).push(8);
                    solver.addClause(clause);
                    solver.isSatisfiable();
                    org.junit.Assert.fail("test3litNum6704 should have thrown TimeoutException");
                }
                org.junit.Assert.fail("test3litNum6704_failAssert727litNum7240 should have thrown TimeoutException");
            }
            org.junit.Assert.fail("test3litNum6704_failAssert727litNum7240_failAssert909litNum9821 should have thrown TimeoutException");
        } catch (TimeoutException expected) {
            Assert.assertEquals("Cannot decide the satisfiability", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test3litNum6702_failAssert725litNum8003_failAssert865litNum12310_failAssert1053() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                    solver.setSearchListener(new TextOutputTracing<Object>(null));
                    int[] backdoor = new int[]{ 1, 0, 0 };
                    IOrder order = new SubsetVarOrder(backdoor);
                    solver.setOrder(order);
                    IVecInt clause = new VecInt();
                    clause.push((-1)).push(4).push(8);
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
                    org.junit.Assert.fail("test3litNum6702 should have thrown TimeoutException");
                }
                org.junit.Assert.fail("test3litNum6702_failAssert725litNum8003 should have thrown TimeoutException");
            }
            org.junit.Assert.fail("test3litNum6702_failAssert725litNum8003_failAssert865litNum12310 should have thrown TimeoutException");
        } catch (TimeoutException expected) {
            Assert.assertEquals("Cannot decide the satisfiability", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test3litNum6702_failAssert725litNum8003_failAssert865litNum12416_failAssert1064() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                    solver.setSearchListener(new TextOutputTracing<Object>(null));
                    int[] backdoor = new int[]{ 1, 0, 0 };
                    IOrder order = new SubsetVarOrder(backdoor);
                    solver.setOrder(order);
                    IVecInt clause = new VecInt();
                    clause.push((-1)).push(4).push(7);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-2)).push(5).push(7);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-3)).push(5).push(5);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push(1).push(2).push(3).push(7).push(8);
                    solver.addClause(clause);
                    solver.isSatisfiable();
                    org.junit.Assert.fail("test3litNum6702 should have thrown TimeoutException");
                }
                org.junit.Assert.fail("test3litNum6702_failAssert725litNum8003 should have thrown TimeoutException");
            }
            org.junit.Assert.fail("test3litNum6702_failAssert725litNum8003_failAssert865litNum12416 should have thrown TimeoutException");
        } catch (TimeoutException expected) {
            Assert.assertEquals("Cannot decide the satisfiability", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test3litNum6702_failAssert725litNum8003_failAssert865litNum12280_failAssert1068() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                    solver.setSearchListener(new TextOutputTracing<Object>(null));
                    int[] backdoor = new int[]{ 1, 0, 0 };
                    IOrder order = new SubsetVarOrder(backdoor);
                    solver.setOrder(order);
                    IVecInt clause = new VecInt();
                    clause.push((-2)).push(4).push(7);
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
                    org.junit.Assert.fail("test3litNum6702 should have thrown TimeoutException");
                }
                org.junit.Assert.fail("test3litNum6702_failAssert725litNum8003 should have thrown TimeoutException");
            }
            org.junit.Assert.fail("test3litNum6702_failAssert725litNum8003_failAssert865litNum12280 should have thrown TimeoutException");
        } catch (TimeoutException expected) {
            Assert.assertEquals("Cannot decide the satisfiability", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test3litNum6702_failAssert725litNum8003_failAssert865litNum12454_failAssert1079() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                    solver.setSearchListener(new TextOutputTracing<Object>(null));
                    int[] backdoor = new int[]{ 1, 0, 0 };
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
                    clause.push(2).push(2).push(3).push(7).push(8);
                    solver.addClause(clause);
                    solver.isSatisfiable();
                    org.junit.Assert.fail("test3litNum6702 should have thrown TimeoutException");
                }
                org.junit.Assert.fail("test3litNum6702_failAssert725litNum8003 should have thrown TimeoutException");
            }
            org.junit.Assert.fail("test3litNum6702_failAssert725litNum8003_failAssert865litNum12454 should have thrown TimeoutException");
        } catch (TimeoutException expected) {
            Assert.assertEquals("Cannot decide the satisfiability", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test3litNum6702_failAssert725litNum8232_failAssert874litNum11603_failAssert1091() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                    solver.setSearchListener(new TextOutputTracing<Object>(null));
                    int[] backdoor = new int[]{ 1, 0, 3 };
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
                    clause.push(1).push(2).push(2).push(6).push(8);
                    solver.addClause(clause);
                    solver.isSatisfiable();
                    org.junit.Assert.fail("test3litNum6702 should have thrown TimeoutException");
                }
                org.junit.Assert.fail("test3litNum6702_failAssert725litNum8232 should have thrown TimeoutException");
            }
            org.junit.Assert.fail("test3litNum6702_failAssert725litNum8232_failAssert874litNum11603 should have thrown TimeoutException");
        } catch (TimeoutException expected) {
            Assert.assertEquals("Cannot decide the satisfiability", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test3litNum6702_failAssert725litNum8232_failAssert874litNum11518_failAssert1104() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                    solver.setSearchListener(new TextOutputTracing<Object>(null));
                    int[] backdoor = new int[]{ 1, 0, 3 };
                    IOrder order = new SubsetVarOrder(backdoor);
                    solver.setOrder(order);
                    IVecInt clause = new VecInt();
                    clause.push((-1)).push(4).push(7);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-2)).push(5).push(7);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-3)).push(5).push(5);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push(1).push(2).push(2).push(7).push(8);
                    solver.addClause(clause);
                    solver.isSatisfiable();
                    org.junit.Assert.fail("test3litNum6702 should have thrown TimeoutException");
                }
                org.junit.Assert.fail("test3litNum6702_failAssert725litNum8232 should have thrown TimeoutException");
            }
            org.junit.Assert.fail("test3litNum6702_failAssert725litNum8232_failAssert874litNum11518 should have thrown TimeoutException");
        } catch (TimeoutException expected) {
            Assert.assertEquals("Cannot decide the satisfiability", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test3litNum6702_failAssert725litNum8232_failAssert874litNum11537_failAssert1111() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                    solver.setSearchListener(new TextOutputTracing<Object>(null));
                    int[] backdoor = new int[]{ 1, 0, 3 };
                    IOrder order = new SubsetVarOrder(backdoor);
                    solver.setOrder(order);
                    IVecInt clause = new VecInt();
                    clause.push((-1)).push(4).push(7);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-2)).push(5).push(7);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-3)).push(6).push(6);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push(1).push(2).push(2).push(7).push(8);
                    solver.addClause(clause);
                    solver.isSatisfiable();
                    org.junit.Assert.fail("test3litNum6702 should have thrown TimeoutException");
                }
                org.junit.Assert.fail("test3litNum6702_failAssert725litNum8232 should have thrown TimeoutException");
            }
            org.junit.Assert.fail("test3litNum6702_failAssert725litNum8232_failAssert874litNum11537 should have thrown TimeoutException");
        } catch (TimeoutException expected) {
            Assert.assertEquals("Cannot decide the satisfiability", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test3litNum6702_failAssert725litNum8174_failAssert905litNum11800_failAssert1112() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                    solver.setSearchListener(new TextOutputTracing<Object>(null));
                    int[] backdoor = new int[]{ 1, 0, 3 };
                    IOrder order = new SubsetVarOrder(backdoor);
                    solver.setOrder(order);
                    IVecInt clause = new VecInt();
                    clause.push((-1)).push(4).push(7);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-2)).push(5).push(7);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-3)).push(6).push(6);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push(1).push(2).push(3).push(7).push(9);
                    solver.addClause(clause);
                    solver.isSatisfiable();
                    org.junit.Assert.fail("test3litNum6702 should have thrown TimeoutException");
                }
                org.junit.Assert.fail("test3litNum6702_failAssert725litNum8174 should have thrown TimeoutException");
            }
            org.junit.Assert.fail("test3litNum6702_failAssert725litNum8174_failAssert905litNum11800 should have thrown TimeoutException");
        } catch (TimeoutException expected) {
            Assert.assertEquals("Cannot decide the satisfiability", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test3litNum6702_failAssert725litNum8232_failAssert874litNum11576_failAssert1118() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                    solver.setSearchListener(new TextOutputTracing<Object>(null));
                    int[] backdoor = new int[]{ 1, 0, 3 };
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
                    clause.push(1).push(3).push(2).push(7).push(8);
                    solver.addClause(clause);
                    solver.isSatisfiable();
                    org.junit.Assert.fail("test3litNum6702 should have thrown TimeoutException");
                }
                org.junit.Assert.fail("test3litNum6702_failAssert725litNum8232 should have thrown TimeoutException");
            }
            org.junit.Assert.fail("test3litNum6702_failAssert725litNum8232_failAssert874litNum11576 should have thrown TimeoutException");
        } catch (TimeoutException expected) {
            Assert.assertEquals("Cannot decide the satisfiability", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test3litNum6702_failAssert725litNum7992_failAssert930litNum10140_failAssert1125() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                    solver.setSearchListener(new TextOutputTracing<Object>(null));
                    int[] backdoor = new int[]{ 1, 0, 4 };
                    IOrder order = new SubsetVarOrder(backdoor);
                    solver.setOrder(order);
                    IVecInt clause = new VecInt();
                    clause.push((-1)).push(4).push(6);
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
                    org.junit.Assert.fail("test3litNum6702 should have thrown TimeoutException");
                }
                org.junit.Assert.fail("test3litNum6702_failAssert725litNum7992 should have thrown TimeoutException");
            }
            org.junit.Assert.fail("test3litNum6702_failAssert725litNum7992_failAssert930litNum10140 should have thrown TimeoutException");
        } catch (TimeoutException expected) {
            Assert.assertEquals("Cannot decide the satisfiability", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test3litNum6702_failAssert725litNum7992_failAssert930litNum10242_failAssert1140() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                    solver.setSearchListener(new TextOutputTracing<Object>(null));
                    int[] backdoor = new int[]{ 1, 0, 4 };
                    IOrder order = new SubsetVarOrder(backdoor);
                    solver.setOrder(order);
                    IVecInt clause = new VecInt();
                    clause.push((-1)).push(4).push(7);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-2)).push(5).push(7);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-3)).push(5).push(5);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push(1).push(2).push(3).push(7).push(8);
                    solver.addClause(clause);
                    solver.isSatisfiable();
                    org.junit.Assert.fail("test3litNum6702 should have thrown TimeoutException");
                }
                org.junit.Assert.fail("test3litNum6702_failAssert725litNum7992 should have thrown TimeoutException");
            }
            org.junit.Assert.fail("test3litNum6702_failAssert725litNum7992_failAssert930litNum10242 should have thrown TimeoutException");
        } catch (TimeoutException expected) {
            Assert.assertEquals("Cannot decide the satisfiability", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test3litNum6702_failAssert725litNum7992_failAssert930litNum10260_failAssert1150() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                    solver.setSearchListener(new TextOutputTracing<Object>(null));
                    int[] backdoor = new int[]{ 1, 0, 4 };
                    IOrder order = new SubsetVarOrder(backdoor);
                    solver.setOrder(order);
                    IVecInt clause = new VecInt();
                    clause.push((-1)).push(4).push(7);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-2)).push(5).push(7);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-3)).push(6).push(6);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push(1).push(2).push(3).push(7).push(8);
                    solver.addClause(clause);
                    solver.isSatisfiable();
                    org.junit.Assert.fail("test3litNum6702 should have thrown TimeoutException");
                }
                org.junit.Assert.fail("test3litNum6702_failAssert725litNum7992 should have thrown TimeoutException");
            }
            org.junit.Assert.fail("test3litNum6702_failAssert725litNum7992_failAssert930litNum10260 should have thrown TimeoutException");
        } catch (TimeoutException expected) {
            Assert.assertEquals("Cannot decide the satisfiability", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test3litNum6694_failAssert717litNum9103_failAssert963litNum11223_failAssert1171() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                    solver.setSearchListener(new TextOutputTracing<Object>(null));
                    int[] backdoor = new int[]{ 0, 2, 3 };
                    IOrder order = new SubsetVarOrder(backdoor);
                    solver.setOrder(order);
                    IVecInt clause = new VecInt();
                    clause.push((-1)).push(4).push(7);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-2)).push(5).push(7);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-3)).push(5).push(5);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push(2).push(2).push(3).push(7).push(8);
                    solver.addClause(clause);
                    solver.isSatisfiable();
                    org.junit.Assert.fail("test3litNum6694 should have thrown TimeoutException");
                }
                org.junit.Assert.fail("test3litNum6694_failAssert717litNum9103 should have thrown TimeoutException");
            }
            org.junit.Assert.fail("test3litNum6694_failAssert717litNum9103_failAssert963litNum11223 should have thrown TimeoutException");
        } catch (TimeoutException expected) {
            Assert.assertEquals("Cannot decide the satisfiability", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test3litNum6694_failAssert717litNum9103_failAssert963litNum11241_failAssert1172() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                    solver.setSearchListener(new TextOutputTracing<Object>(null));
                    int[] backdoor = new int[]{ 0, 2, 3 };
                    IOrder order = new SubsetVarOrder(backdoor);
                    solver.setOrder(order);
                    IVecInt clause = new VecInt();
                    clause.push((-1)).push(4).push(7);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-2)).push(5).push(7);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-3)).push(5).push(5);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push(1).push(3).push(3).push(7).push(8);
                    solver.addClause(clause);
                    solver.isSatisfiable();
                    org.junit.Assert.fail("test3litNum6694 should have thrown TimeoutException");
                }
                org.junit.Assert.fail("test3litNum6694_failAssert717litNum9103 should have thrown TimeoutException");
            }
            org.junit.Assert.fail("test3litNum6694_failAssert717litNum9103_failAssert963litNum11241 should have thrown TimeoutException");
        } catch (TimeoutException expected) {
            Assert.assertEquals("Cannot decide the satisfiability", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test3litNum6694_failAssert717litNum9103_failAssert963litNum11206_failAssert1176() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                    solver.setSearchListener(new TextOutputTracing<Object>(null));
                    int[] backdoor = new int[]{ 0, 2, 3 };
                    IOrder order = new SubsetVarOrder(backdoor);
                    solver.setOrder(order);
                    IVecInt clause = new VecInt();
                    clause.push((-1)).push(4).push(7);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-2)).push(5).push(7);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-3)).push(5).push(6);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push(1).push(2).push(3).push(7).push(8);
                    solver.addClause(clause);
                    solver.isSatisfiable();
                    org.junit.Assert.fail("test3litNum6694 should have thrown TimeoutException");
                }
                org.junit.Assert.fail("test3litNum6694_failAssert717litNum9103 should have thrown TimeoutException");
            }
            org.junit.Assert.fail("test3litNum6694_failAssert717litNum9103_failAssert963litNum11206 should have thrown TimeoutException");
        } catch (TimeoutException expected) {
            Assert.assertEquals("Cannot decide the satisfiability", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test3litNum6694_failAssert717litNum9103_failAssert963litNum11209_failAssert1180() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                    solver.setSearchListener(new TextOutputTracing<Object>(null));
                    int[] backdoor = new int[]{ 0, 2, 3 };
                    IOrder order = new SubsetVarOrder(backdoor);
                    solver.setOrder(order);
                    IVecInt clause = new VecInt();
                    clause.push((-1)).push(4).push(7);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-2)).push(5).push(7);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-3)).push(5).push(4);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push(1).push(2).push(3).push(7).push(8);
                    solver.addClause(clause);
                    solver.isSatisfiable();
                    org.junit.Assert.fail("test3litNum6694 should have thrown TimeoutException");
                }
                org.junit.Assert.fail("test3litNum6694_failAssert717litNum9103 should have thrown TimeoutException");
            }
            org.junit.Assert.fail("test3litNum6694_failAssert717litNum9103_failAssert963litNum11209 should have thrown TimeoutException");
        } catch (TimeoutException expected) {
            Assert.assertEquals("Cannot decide the satisfiability", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test3litNum6694_failAssert717litNum9103_failAssert963litNum11190_failAssert1184() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                    solver.setSearchListener(new TextOutputTracing<Object>(null));
                    int[] backdoor = new int[]{ 0, 2, 3 };
                    IOrder order = new SubsetVarOrder(backdoor);
                    solver.setOrder(order);
                    IVecInt clause = new VecInt();
                    clause.push((-1)).push(4).push(7);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-2)).push(5).push(7);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-4)).push(5).push(5);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push(1).push(2).push(3).push(7).push(8);
                    solver.addClause(clause);
                    solver.isSatisfiable();
                    org.junit.Assert.fail("test3litNum6694 should have thrown TimeoutException");
                }
                org.junit.Assert.fail("test3litNum6694_failAssert717litNum9103 should have thrown TimeoutException");
            }
            org.junit.Assert.fail("test3litNum6694_failAssert717litNum9103_failAssert963litNum11190 should have thrown TimeoutException");
        } catch (TimeoutException expected) {
            Assert.assertEquals("Cannot decide the satisfiability", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void test3litNum6694_failAssert717litNum9151_failAssert991litNum10620_failAssert1191() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                    solver.setSearchListener(new TextOutputTracing<Object>(null));
                    int[] backdoor = new int[]{ 0, 2, 3 };
                    IOrder order = new SubsetVarOrder(backdoor);
                    solver.setOrder(order);
                    IVecInt clause = new VecInt();
                    clause.push((-1)).push(4).push(7);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-2)).push(5).push(7);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-3)).push(6).push(4);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push(1).push(1).push(3).push(7).push(8);
                    solver.addClause(clause);
                    solver.isSatisfiable();
                    org.junit.Assert.fail("test3litNum6694 should have thrown TimeoutException");
                }
                org.junit.Assert.fail("test3litNum6694_failAssert717litNum9151 should have thrown TimeoutException");
            }
            org.junit.Assert.fail("test3litNum6694_failAssert717litNum9151_failAssert991litNum10620 should have thrown TimeoutException");
        } catch (TimeoutException expected) {
            Assert.assertEquals("Cannot decide the satisfiability", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testJeanGuy1litNum13805_failAssert1195() throws Exception, ContradictionException, TimeoutException {
        try {
            Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
            int[] backdoor = new int[]{ Integer.MAX_VALUE, 2, 3, 4 };
            IOrder order = new SubsetVarOrder(backdoor);
            solver.setOrder(order);
            IVecInt clause = new VecInt();
            clause.push((-1)).push(5);
            solver.addClause(clause);
            clause = new VecInt();
            clause.push((-2)).push(3).push(5);
            solver.addClause(clause);
            clause = new VecInt();
            clause.push((-4)).push(5);
            solver.addClause(clause);
            solver.isSatisfiable();
            org.junit.Assert.fail("testJeanGuy1litNum13805 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("2147483647", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testJeanGuy1litNum13807_failAssert1197() throws Exception, ContradictionException, TimeoutException {
        try {
            Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
            int[] backdoor = new int[]{ 1261236322, 2, 3, 4 };
            IOrder order = new SubsetVarOrder(backdoor);
            solver.setOrder(order);
            IVecInt clause = new VecInt();
            clause.push((-1)).push(5);
            solver.addClause(clause);
            clause = new VecInt();
            clause.push((-2)).push(3).push(5);
            solver.addClause(clause);
            clause = new VecInt();
            clause.push((-4)).push(5);
            solver.addClause(clause);
            solver.isSatisfiable();
            org.junit.Assert.fail("testJeanGuy1litNum13807 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("1261236322", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testJeanGuy1litNum13810_failAssert1198() throws Exception, ContradictionException, TimeoutException {
        try {
            Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
            int[] backdoor = new int[]{ 1, Integer.MAX_VALUE, 3, 4 };
            IOrder order = new SubsetVarOrder(backdoor);
            solver.setOrder(order);
            IVecInt clause = new VecInt();
            clause.push((-1)).push(5);
            solver.addClause(clause);
            clause = new VecInt();
            clause.push((-2)).push(3).push(5);
            solver.addClause(clause);
            clause = new VecInt();
            clause.push((-4)).push(5);
            solver.addClause(clause);
            solver.isSatisfiable();
            org.junit.Assert.fail("testJeanGuy1litNum13810 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("2147483647", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testJeanGuy1litNum13816_failAssert1201() throws Exception, ContradictionException, TimeoutException {
        try {
            Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
            int[] backdoor = new int[]{ 1, 2, Integer.MAX_VALUE, 4 };
            IOrder order = new SubsetVarOrder(backdoor);
            solver.setOrder(order);
            IVecInt clause = new VecInt();
            clause.push((-1)).push(5);
            solver.addClause(clause);
            clause = new VecInt();
            clause.push((-2)).push(3).push(5);
            solver.addClause(clause);
            clause = new VecInt();
            clause.push((-4)).push(5);
            solver.addClause(clause);
            solver.isSatisfiable();
            org.junit.Assert.fail("testJeanGuy1litNum13816 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("2147483647", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testJeanGuy1litNum13827_failAssert1207() throws Exception, ContradictionException, TimeoutException {
        try {
            Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
            int[] backdoor = new int[]{ 1, 2, 3, 4 };
            IOrder order = new SubsetVarOrder(backdoor);
            solver.setOrder(order);
            IVecInt clause = new VecInt();
            clause.push((-0)).push(5);
            solver.addClause(clause);
            clause = new VecInt();
            clause.push((-2)).push(3).push(5);
            solver.addClause(clause);
            clause = new VecInt();
            clause.push((-4)).push(5);
            solver.addClause(clause);
            solver.isSatisfiable();
            org.junit.Assert.fail("testJeanGuy1litNum13827 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testJeanGuy1litNum13828_failAssert1208() throws Exception, ContradictionException, TimeoutException {
        try {
            Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
            int[] backdoor = new int[]{ 1, 2, 3, 4 };
            IOrder order = new SubsetVarOrder(backdoor);
            solver.setOrder(order);
            IVecInt clause = new VecInt();
            clause.push((-(Integer.MAX_VALUE))).push(5);
            solver.addClause(clause);
            clause = new VecInt();
            clause.push((-2)).push(3).push(5);
            solver.addClause(clause);
            clause = new VecInt();
            clause.push((-4)).push(5);
            solver.addClause(clause);
            solver.isSatisfiable();
            org.junit.Assert.fail("testJeanGuy1litNum13828 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testJeanGuy1litNum13829_failAssert1209() throws Exception, ContradictionException, TimeoutException {
        try {
            Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
            int[] backdoor = new int[]{ 1, 2, 3, 4 };
            IOrder order = new SubsetVarOrder(backdoor);
            solver.setOrder(order);
            IVecInt clause = new VecInt();
            clause.push((-(Integer.MIN_VALUE))).push(5);
            solver.addClause(clause);
            clause = new VecInt();
            clause.push((-2)).push(3).push(5);
            solver.addClause(clause);
            clause = new VecInt();
            clause.push((-4)).push(5);
            solver.addClause(clause);
            solver.isSatisfiable();
            org.junit.Assert.fail("testJeanGuy1litNum13829 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-2147483648", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testJeanGuy1litNum13833_failAssert1210() throws Exception, ContradictionException, TimeoutException {
        try {
            Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
            int[] backdoor = new int[]{ 1, 2, 3, 4 };
            IOrder order = new SubsetVarOrder(backdoor);
            solver.setOrder(order);
            IVecInt clause = new VecInt();
            clause.push((-1)).push(Integer.MAX_VALUE);
            solver.addClause(clause);
            clause = new VecInt();
            clause.push((-2)).push(3).push(5);
            solver.addClause(clause);
            clause = new VecInt();
            clause.push((-4)).push(5);
            solver.addClause(clause);
            solver.isSatisfiable();
            org.junit.Assert.fail("testJeanGuy1litNum13833 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testJeanGuy1litNum13835_failAssert1212() throws Exception, ContradictionException, TimeoutException {
        try {
            Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
            int[] backdoor = new int[]{ 1, 2, 3, 4 };
            IOrder order = new SubsetVarOrder(backdoor);
            solver.setOrder(order);
            IVecInt clause = new VecInt();
            clause.push((-1)).push(0);
            solver.addClause(clause);
            clause = new VecInt();
            clause.push((-2)).push(3).push(5);
            solver.addClause(clause);
            clause = new VecInt();
            clause.push((-4)).push(5);
            solver.addClause(clause);
            solver.isSatisfiable();
            org.junit.Assert.fail("testJeanGuy1litNum13835 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testJeanGuy1litNum13839_failAssert1213() throws Exception, ContradictionException, TimeoutException {
        try {
            Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
            int[] backdoor = new int[]{ 1, 2, 3, 4 };
            IOrder order = new SubsetVarOrder(backdoor);
            solver.setOrder(order);
            IVecInt clause = new VecInt();
            clause.push((-1)).push(5);
            solver.addClause(clause);
            clause = new VecInt();
            clause.push((-(Integer.MAX_VALUE))).push(3).push(5);
            solver.addClause(clause);
            clause = new VecInt();
            clause.push((-4)).push(5);
            solver.addClause(clause);
            solver.isSatisfiable();
            org.junit.Assert.fail("testJeanGuy1litNum13839 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testJeanGuy1litNum13841_failAssert1215() throws Exception, ContradictionException, TimeoutException {
        try {
            Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
            int[] backdoor = new int[]{ 1, 2, 3, 4 };
            IOrder order = new SubsetVarOrder(backdoor);
            solver.setOrder(order);
            IVecInt clause = new VecInt();
            clause.push((-1)).push(5);
            solver.addClause(clause);
            clause = new VecInt();
            clause.push((-0)).push(3).push(5);
            solver.addClause(clause);
            clause = new VecInt();
            clause.push((-4)).push(5);
            solver.addClause(clause);
            solver.isSatisfiable();
            org.junit.Assert.fail("testJeanGuy1litNum13841 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testJeanGuy1litNum13847_failAssert1218() throws Exception, ContradictionException, TimeoutException {
        try {
            Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
            int[] backdoor = new int[]{ 1, 2, 3, 4 };
            IOrder order = new SubsetVarOrder(backdoor);
            solver.setOrder(order);
            IVecInt clause = new VecInt();
            clause.push((-1)).push(5);
            solver.addClause(clause);
            clause = new VecInt();
            clause.push((-2)).push(0).push(5);
            solver.addClause(clause);
            clause = new VecInt();
            clause.push((-4)).push(5);
            solver.addClause(clause);
            solver.isSatisfiable();
            org.junit.Assert.fail("testJeanGuy1litNum13847 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testJeanGuy1litNum13857_failAssert1222() throws Exception, ContradictionException, TimeoutException {
        try {
            Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
            int[] backdoor = new int[]{ 1, 2, 3, 4 };
            IOrder order = new SubsetVarOrder(backdoor);
            solver.setOrder(order);
            IVecInt clause = new VecInt();
            clause.push((-1)).push(5);
            solver.addClause(clause);
            clause = new VecInt();
            clause.push((-2)).push(3).push(5);
            solver.addClause(clause);
            clause = new VecInt();
            clause.push((-(Integer.MAX_VALUE))).push(5);
            solver.addClause(clause);
            solver.isSatisfiable();
            org.junit.Assert.fail("testJeanGuy1litNum13857 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testJeanGuy1litNum13859_failAssert1224() throws Exception, ContradictionException, TimeoutException {
        try {
            Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
            int[] backdoor = new int[]{ 1, 2, 3, 4 };
            IOrder order = new SubsetVarOrder(backdoor);
            solver.setOrder(order);
            IVecInt clause = new VecInt();
            clause.push((-1)).push(5);
            solver.addClause(clause);
            clause = new VecInt();
            clause.push((-2)).push(3).push(5);
            solver.addClause(clause);
            clause = new VecInt();
            clause.push((-0)).push(5);
            solver.addClause(clause);
            solver.isSatisfiable();
            org.junit.Assert.fail("testJeanGuy1litNum13859 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testJeanGuy1litNum13829_failAssert1209_add14740_failAssert1228() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                int[] backdoor = new int[]{ 1, 2, 3, 4 };
                IOrder order = new SubsetVarOrder(backdoor);
                solver.setOrder(order);
                IVecInt clause = new VecInt();
                clause.push((-(Integer.MIN_VALUE))).push(5);
                clause.push((-(Integer.MIN_VALUE))).push(5);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push((-2)).push(3).push(5);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push((-4)).push(5);
                solver.addClause(clause);
                solver.isSatisfiable();
                org.junit.Assert.fail("testJeanGuy1litNum13829 should have thrown ArrayIndexOutOfBoundsException");
            }
            org.junit.Assert.fail("testJeanGuy1litNum13829_failAssert1209_add14740 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-2147483648", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testJeanGuy1litNum13805_failAssert1195_add14891_failAssert1230() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                SolverFactory.newGlucose();
                Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                int[] backdoor = new int[]{ Integer.MAX_VALUE, 2, 3, 4 };
                IOrder order = new SubsetVarOrder(backdoor);
                solver.setOrder(order);
                IVecInt clause = new VecInt();
                clause.push((-1)).push(5);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push((-2)).push(3).push(5);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push((-4)).push(5);
                solver.addClause(clause);
                solver.isSatisfiable();
                org.junit.Assert.fail("testJeanGuy1litNum13805 should have thrown ArrayIndexOutOfBoundsException");
            }
            org.junit.Assert.fail("testJeanGuy1litNum13805_failAssert1195_add14891 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("2147483647", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testJeanGuy1litNum13810_failAssert1198_add14877_failAssert1231() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                SolverFactory.newGlucose();
                Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                int[] backdoor = new int[]{ 1, Integer.MAX_VALUE, 3, 4 };
                IOrder order = new SubsetVarOrder(backdoor);
                solver.setOrder(order);
                IVecInt clause = new VecInt();
                clause.push((-1)).push(5);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push((-2)).push(3).push(5);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push((-4)).push(5);
                solver.addClause(clause);
                solver.isSatisfiable();
                org.junit.Assert.fail("testJeanGuy1litNum13810 should have thrown ArrayIndexOutOfBoundsException");
            }
            org.junit.Assert.fail("testJeanGuy1litNum13810_failAssert1198_add14877 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("2147483647", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testJeanGuy1litNum13816_failAssert1201_add14493_failAssert1232() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                SolverFactory.newGlucose();
                Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                int[] backdoor = new int[]{ 1, 2, Integer.MAX_VALUE, 4 };
                IOrder order = new SubsetVarOrder(backdoor);
                solver.setOrder(order);
                IVecInt clause = new VecInt();
                clause.push((-1)).push(5);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push((-2)).push(3).push(5);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push((-4)).push(5);
                solver.addClause(clause);
                solver.isSatisfiable();
                org.junit.Assert.fail("testJeanGuy1litNum13816 should have thrown ArrayIndexOutOfBoundsException");
            }
            org.junit.Assert.fail("testJeanGuy1litNum13816_failAssert1201_add14493 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("2147483647", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testJeanGuy1litNum13839_failAssert1213_add14562_failAssert1233() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                int[] backdoor = new int[]{ 1, 2, 3, 4 };
                IOrder order = new SubsetVarOrder(backdoor);
                solver.setOrder(order);
                IVecInt clause = new VecInt();
                clause.push((-1)).push(5);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push((-(Integer.MAX_VALUE))).push(3).push(5);
                clause.push((-(Integer.MAX_VALUE))).push(3).push(5);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push((-4)).push(5);
                solver.addClause(clause);
                solver.isSatisfiable();
                org.junit.Assert.fail("testJeanGuy1litNum13839 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testJeanGuy1litNum13839_failAssert1213_add14562 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testJeanGuy1litNum13828_failAssert1208_add14805_failAssert1235() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                int[] backdoor = new int[]{ 1, 2, 3, 4 };
                IOrder order = new SubsetVarOrder(backdoor);
                solver.setOrder(order);
                IVecInt clause = new VecInt();
                clause.push((-(Integer.MAX_VALUE))).push(5);
                clause.push((-(Integer.MAX_VALUE))).push(5);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push((-2)).push(3).push(5);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push((-4)).push(5);
                solver.addClause(clause);
                solver.isSatisfiable();
                org.junit.Assert.fail("testJeanGuy1litNum13828 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testJeanGuy1litNum13828_failAssert1208_add14805 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testJeanGuy1litNum13839_failAssert1213_add14565_failAssert1236() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                int[] backdoor = new int[]{ 1, 2, 3, 4 };
                IOrder order = new SubsetVarOrder(backdoor);
                solver.setOrder(order);
                IVecInt clause = new VecInt();
                clause.push((-1)).push(5);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push((-(Integer.MAX_VALUE))).push(3);
                clause.push((-(Integer.MAX_VALUE))).push(3).push(5);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push((-4)).push(5);
                solver.addClause(clause);
                solver.isSatisfiable();
                org.junit.Assert.fail("testJeanGuy1litNum13839 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testJeanGuy1litNum13839_failAssert1213_add14565 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testJeanGuy1litNum13857_failAssert1222_add14291_failAssert1237() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                int[] backdoor = new int[]{ 1, 2, 3, 4 };
                IOrder order = new SubsetVarOrder(backdoor);
                solver.setOrder(order);
                IVecInt clause = new VecInt();
                clause.push((-1)).push(5);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push((-2)).push(3).push(5);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push((-(Integer.MAX_VALUE))).push(5);
                clause.push((-(Integer.MAX_VALUE))).push(5);
                solver.addClause(clause);
                solver.isSatisfiable();
                org.junit.Assert.fail("testJeanGuy1litNum13857 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testJeanGuy1litNum13857_failAssert1222_add14291 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testJeanGuy1litNum13859_failAssert1224_add14406_failAssert1238() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                SolverFactory.newGlucose();
                Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                int[] backdoor = new int[]{ 1, 2, 3, 4 };
                IOrder order = new SubsetVarOrder(backdoor);
                solver.setOrder(order);
                IVecInt clause = new VecInt();
                clause.push((-1)).push(5);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push((-2)).push(3).push(5);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push((-0)).push(5);
                solver.addClause(clause);
                solver.isSatisfiable();
                org.junit.Assert.fail("testJeanGuy1litNum13859 should have thrown IllegalArgumentException");
            }
            org.junit.Assert.fail("testJeanGuy1litNum13859_failAssert1224_add14406 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testJeanGuy1litNum13847_failAssert1218_add14560_failAssert1239() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                SolverFactory.newGlucose();
                Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                int[] backdoor = new int[]{ 1, 2, 3, 4 };
                IOrder order = new SubsetVarOrder(backdoor);
                solver.setOrder(order);
                IVecInt clause = new VecInt();
                clause.push((-1)).push(5);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push((-2)).push(0).push(5);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push((-4)).push(5);
                solver.addClause(clause);
                solver.isSatisfiable();
                org.junit.Assert.fail("testJeanGuy1litNum13847 should have thrown IllegalArgumentException");
            }
            org.junit.Assert.fail("testJeanGuy1litNum13847_failAssert1218_add14560 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testJeanGuy1litNum13827_failAssert1207_add14243_failAssert1240() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                SolverFactory.newGlucose();
                Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                int[] backdoor = new int[]{ 1, 2, 3, 4 };
                IOrder order = new SubsetVarOrder(backdoor);
                solver.setOrder(order);
                IVecInt clause = new VecInt();
                clause.push((-0)).push(5);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push((-2)).push(3).push(5);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push((-4)).push(5);
                solver.addClause(clause);
                solver.isSatisfiable();
                org.junit.Assert.fail("testJeanGuy1litNum13827 should have thrown IllegalArgumentException");
            }
            org.junit.Assert.fail("testJeanGuy1litNum13827_failAssert1207_add14243 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testJeanGuy1litNum13835_failAssert1212_add14300_failAssert1242() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                SolverFactory.newGlucose();
                Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                int[] backdoor = new int[]{ 1, 2, 3, 4 };
                IOrder order = new SubsetVarOrder(backdoor);
                solver.setOrder(order);
                IVecInt clause = new VecInt();
                clause.push((-1)).push(0);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push((-2)).push(3).push(5);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push((-4)).push(5);
                solver.addClause(clause);
                solver.isSatisfiable();
                org.junit.Assert.fail("testJeanGuy1litNum13835 should have thrown IllegalArgumentException");
            }
            org.junit.Assert.fail("testJeanGuy1litNum13835_failAssert1212_add14300 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testJeanGuy1litNum13807_failAssert1197litNum14435_failAssert1248() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                int[] backdoor = new int[]{ 1261236322, 2, 3, 0 };
                IOrder order = new SubsetVarOrder(backdoor);
                solver.setOrder(order);
                IVecInt clause = new VecInt();
                clause.push((-1)).push(5);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push((-2)).push(3).push(5);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push((-4)).push(5);
                solver.addClause(clause);
                solver.isSatisfiable();
                org.junit.Assert.fail("testJeanGuy1litNum13807 should have thrown ArrayIndexOutOfBoundsException");
            }
            org.junit.Assert.fail("testJeanGuy1litNum13807_failAssert1197litNum14435 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("1261236322", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testJeanGuy1litNum13807_failAssert1197litNum14522_failAssert1254() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                int[] backdoor = new int[]{ 1261236322, 2, 3, 4 };
                IOrder order = new SubsetVarOrder(backdoor);
                solver.setOrder(order);
                IVecInt clause = new VecInt();
                clause.push((-1)).push(5);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push((-2)).push(3).push(5);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push((-5)).push(5);
                solver.addClause(clause);
                solver.isSatisfiable();
                org.junit.Assert.fail("testJeanGuy1litNum13807 should have thrown ArrayIndexOutOfBoundsException");
            }
            org.junit.Assert.fail("testJeanGuy1litNum13807_failAssert1197litNum14522 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("1261236322", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testJeanGuy1litNum13833_failAssert1210_add14331_failAssert1257() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                int[] backdoor = new int[]{ 1, 2, 3, 4 };
                IOrder order = new SubsetVarOrder(backdoor);
                solver.setOrder(order);
                IVecInt clause = new VecInt();
                clause.push((-1)).push(Integer.MAX_VALUE);
                clause.push((-1)).push(Integer.MAX_VALUE);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push((-2)).push(3).push(5);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push((-4)).push(5);
                solver.addClause(clause);
                solver.isSatisfiable();
                org.junit.Assert.fail("testJeanGuy1litNum13833 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testJeanGuy1litNum13833_failAssert1210_add14331 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testJeanGuy1litNum13839_failAssert1213_add14551_failAssert1266() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                SolverFactory.newGlucose();
                Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                int[] backdoor = new int[]{ 1, 2, 3, 4 };
                IOrder order = new SubsetVarOrder(backdoor);
                solver.setOrder(order);
                IVecInt clause = new VecInt();
                clause.push((-1)).push(5);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push((-(Integer.MAX_VALUE))).push(3).push(5);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push((-4)).push(5);
                solver.addClause(clause);
                solver.isSatisfiable();
                org.junit.Assert.fail("testJeanGuy1litNum13839 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testJeanGuy1litNum13839_failAssert1213_add14551 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testJeanGuy1litNum13807_failAssert1197litNum14475_failAssert1268() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                int[] backdoor = new int[]{ 1261236322, 2, 3, 4 };
                IOrder order = new SubsetVarOrder(backdoor);
                solver.setOrder(order);
                IVecInt clause = new VecInt();
                clause.push((-1)).push(5);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push((-3)).push(3).push(5);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push((-4)).push(5);
                solver.addClause(clause);
                solver.isSatisfiable();
                org.junit.Assert.fail("testJeanGuy1litNum13807 should have thrown ArrayIndexOutOfBoundsException");
            }
            org.junit.Assert.fail("testJeanGuy1litNum13807_failAssert1197litNum14475 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("1261236322", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testJeanGuy1litNum13805_failAssert1195_add14896_failAssert1284() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                int[] backdoor = new int[]{ Integer.MAX_VALUE, 2, 3, 4 };
                IOrder order = new SubsetVarOrder(backdoor);
                solver.setOrder(order);
                IVecInt clause = new VecInt();
                clause.push((-1)).push(5);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push((-2)).push(3).push(5);
                clause.push((-2)).push(3).push(5);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push((-4)).push(5);
                solver.addClause(clause);
                solver.isSatisfiable();
                org.junit.Assert.fail("testJeanGuy1litNum13805 should have thrown ArrayIndexOutOfBoundsException");
            }
            org.junit.Assert.fail("testJeanGuy1litNum13805_failAssert1195_add14896 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("2147483647", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testJeanGuy1litNum13810_failAssert1198_add14882_failAssert1285() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                int[] backdoor = new int[]{ 1, Integer.MAX_VALUE, 3, 4 };
                IOrder order = new SubsetVarOrder(backdoor);
                solver.setOrder(order);
                IVecInt clause = new VecInt();
                clause.push((-1)).push(5);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push((-2)).push(3).push(5);
                clause.push((-2)).push(3).push(5);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push((-4)).push(5);
                solver.addClause(clause);
                solver.isSatisfiable();
                org.junit.Assert.fail("testJeanGuy1litNum13810 should have thrown ArrayIndexOutOfBoundsException");
            }
            org.junit.Assert.fail("testJeanGuy1litNum13810_failAssert1198_add14882 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("2147483647", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testJeanGuy1litNum13816_failAssert1201_add14505_failAssert1286() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                int[] backdoor = new int[]{ 1, 2, Integer.MAX_VALUE, 4 };
                IOrder order = new SubsetVarOrder(backdoor);
                solver.setOrder(order);
                IVecInt clause = new VecInt();
                clause.push((-1)).push(5);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push((-2)).push(3).push(5);
                clause.push((-2)).push(3).push(5);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push((-4)).push(5);
                solver.addClause(clause);
                solver.isSatisfiable();
                org.junit.Assert.fail("testJeanGuy1litNum13816 should have thrown ArrayIndexOutOfBoundsException");
            }
            org.junit.Assert.fail("testJeanGuy1litNum13816_failAssert1201_add14505 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("2147483647", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testJeanGuy1litNum13857_failAssert1222litNum14209_failAssert1374() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                int[] backdoor = new int[]{ 1, 2, 3, 4 };
                IOrder order = new SubsetVarOrder(backdoor);
                solver.setOrder(order);
                IVecInt clause = new VecInt();
                clause.push((-1)).push(5);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push((-2)).push(3).push(6);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push((-(Integer.MAX_VALUE))).push(5);
                solver.addClause(clause);
                solver.isSatisfiable();
                org.junit.Assert.fail("testJeanGuy1litNum13857 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testJeanGuy1litNum13857_failAssert1222litNum14209 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testJeanGuy1litNum13828_failAssert1208litNum14723_failAssert1386() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                int[] backdoor = new int[]{ 1, 2, 3, 4 };
                IOrder order = new SubsetVarOrder(backdoor);
                solver.setOrder(order);
                IVecInt clause = new VecInt();
                clause.push((-(Integer.MAX_VALUE))).push(5);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push((-2)).push(3).push(5);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push((-4)).push(4);
                solver.addClause(clause);
                solver.isSatisfiable();
                org.junit.Assert.fail("testJeanGuy1litNum13828 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testJeanGuy1litNum13828_failAssert1208litNum14723 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testJeanGuy1litNum13857_failAssert1222litNum14187_failAssert1413() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                int[] backdoor = new int[]{ 1, 2, 3, 4 };
                IOrder order = new SubsetVarOrder(backdoor);
                solver.setOrder(order);
                IVecInt clause = new VecInt();
                clause.push((-1)).push(5);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push((-3)).push(3).push(5);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push((-(Integer.MAX_VALUE))).push(5);
                solver.addClause(clause);
                solver.isSatisfiable();
                org.junit.Assert.fail("testJeanGuy1litNum13857 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testJeanGuy1litNum13857_failAssert1222litNum14187 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testJeanGuy1litNum13807_failAssert1197litNum14522_failAssert1254litNum16110_failAssert1421() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                    int[] backdoor = new int[]{ 1261236322, 2, 3, 4 };
                    IOrder order = new SubsetVarOrder(backdoor);
                    solver.setOrder(order);
                    IVecInt clause = new VecInt();
                    clause.push((-1)).push(5);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-2)).push(0).push(5);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-5)).push(5);
                    solver.addClause(clause);
                    solver.isSatisfiable();
                    org.junit.Assert.fail("testJeanGuy1litNum13807 should have thrown ArrayIndexOutOfBoundsException");
                }
                org.junit.Assert.fail("testJeanGuy1litNum13807_failAssert1197litNum14522 should have thrown ArrayIndexOutOfBoundsException");
            }
            org.junit.Assert.fail("testJeanGuy1litNum13807_failAssert1197litNum14522_failAssert1254litNum16110 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testJeanGuy1litNum13807_failAssert1197litNum14522_failAssert1254litNum16102_failAssert1422() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                    int[] backdoor = new int[]{ 1261236322, 2, 3, 4 };
                    IOrder order = new SubsetVarOrder(backdoor);
                    solver.setOrder(order);
                    IVecInt clause = new VecInt();
                    clause.push((-1)).push(5);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-2)).push(2).push(5);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-5)).push(5);
                    solver.addClause(clause);
                    solver.isSatisfiable();
                    org.junit.Assert.fail("testJeanGuy1litNum13807 should have thrown ArrayIndexOutOfBoundsException");
                }
                org.junit.Assert.fail("testJeanGuy1litNum13807_failAssert1197litNum14522 should have thrown ArrayIndexOutOfBoundsException");
            }
            org.junit.Assert.fail("testJeanGuy1litNum13807_failAssert1197litNum14522_failAssert1254litNum16102 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("1261236322", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testJeanGuy1litNum13807_failAssert1197litNum14522_failAssert1254litNum16132_failAssert1424() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                    int[] backdoor = new int[]{ 1261236322, 2, 3, 4 };
                    IOrder order = new SubsetVarOrder(backdoor);
                    solver.setOrder(order);
                    IVecInt clause = new VecInt();
                    clause.push((-1)).push(5);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-2)).push(3).push(5);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-5)).push(4);
                    solver.addClause(clause);
                    solver.isSatisfiable();
                    org.junit.Assert.fail("testJeanGuy1litNum13807 should have thrown ArrayIndexOutOfBoundsException");
                }
                org.junit.Assert.fail("testJeanGuy1litNum13807_failAssert1197litNum14522 should have thrown ArrayIndexOutOfBoundsException");
            }
            org.junit.Assert.fail("testJeanGuy1litNum13807_failAssert1197litNum14522_failAssert1254litNum16132 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("1261236322", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testJeanGuy1litNum13807_failAssert1197litNum14522_failAssert1254litNum16114_failAssert1425() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                    int[] backdoor = new int[]{ 1261236322, 2, 3, 4 };
                    IOrder order = new SubsetVarOrder(backdoor);
                    solver.setOrder(order);
                    IVecInt clause = new VecInt();
                    clause.push((-1)).push(5);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-2)).push(3).push(6);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-5)).push(5);
                    solver.addClause(clause);
                    solver.isSatisfiable();
                    org.junit.Assert.fail("testJeanGuy1litNum13807 should have thrown ArrayIndexOutOfBoundsException");
                }
                org.junit.Assert.fail("testJeanGuy1litNum13807_failAssert1197litNum14522 should have thrown ArrayIndexOutOfBoundsException");
            }
            org.junit.Assert.fail("testJeanGuy1litNum13807_failAssert1197litNum14522_failAssert1254litNum16114 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("1261236322", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testJeanGuy1litNum13807_failAssert1197litNum14522_failAssert1254litNum16139_failAssert1427() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                    int[] backdoor = new int[]{ 1261236322, 2, 3, 4 };
                    IOrder order = new SubsetVarOrder(backdoor);
                    solver.setOrder(order);
                    IVecInt clause = new VecInt();
                    clause.push((-1)).push(5);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-2)).push(3).push(5);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-5)).push(0);
                    solver.addClause(clause);
                    solver.isSatisfiable();
                    org.junit.Assert.fail("testJeanGuy1litNum13807 should have thrown ArrayIndexOutOfBoundsException");
                }
                org.junit.Assert.fail("testJeanGuy1litNum13807_failAssert1197litNum14522 should have thrown ArrayIndexOutOfBoundsException");
            }
            org.junit.Assert.fail("testJeanGuy1litNum13807_failAssert1197litNum14522_failAssert1254litNum16139 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testJeanGuy1litNum13807_failAssert1197litNum14435_failAssert1248litNum15920_failAssert1429() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                    int[] backdoor = new int[]{ 1261236322, 2, 3, 0 };
                    IOrder order = new SubsetVarOrder(backdoor);
                    solver.setOrder(order);
                    IVecInt clause = new VecInt();
                    clause.push((-1)).push(4);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-2)).push(3).push(5);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-4)).push(5);
                    solver.addClause(clause);
                    solver.isSatisfiable();
                    org.junit.Assert.fail("testJeanGuy1litNum13807 should have thrown ArrayIndexOutOfBoundsException");
                }
                org.junit.Assert.fail("testJeanGuy1litNum13807_failAssert1197litNum14435 should have thrown ArrayIndexOutOfBoundsException");
            }
            org.junit.Assert.fail("testJeanGuy1litNum13807_failAssert1197litNum14435_failAssert1248litNum15920 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("1261236322", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testJeanGuy1litNum13807_failAssert1197litNum14435_failAssert1248litNum15927_failAssert1434() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                    int[] backdoor = new int[]{ 1261236322, 2, 3, 0 };
                    IOrder order = new SubsetVarOrder(backdoor);
                    solver.setOrder(order);
                    IVecInt clause = new VecInt();
                    clause.push((-1)).push(0);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-2)).push(3).push(5);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-4)).push(5);
                    solver.addClause(clause);
                    solver.isSatisfiable();
                    org.junit.Assert.fail("testJeanGuy1litNum13807 should have thrown ArrayIndexOutOfBoundsException");
                }
                org.junit.Assert.fail("testJeanGuy1litNum13807_failAssert1197litNum14435 should have thrown ArrayIndexOutOfBoundsException");
            }
            org.junit.Assert.fail("testJeanGuy1litNum13807_failAssert1197litNum14435_failAssert1248litNum15927 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testJeanGuy1litNum13807_failAssert1197litNum14435_failAssert1248litNum15931_failAssert1436() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                    int[] backdoor = new int[]{ 1261236322, 2, 3, 0 };
                    IOrder order = new SubsetVarOrder(backdoor);
                    solver.setOrder(order);
                    IVecInt clause = new VecInt();
                    clause.push((-1)).push(5);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-3)).push(3).push(5);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-4)).push(5);
                    solver.addClause(clause);
                    solver.isSatisfiable();
                    org.junit.Assert.fail("testJeanGuy1litNum13807 should have thrown ArrayIndexOutOfBoundsException");
                }
                org.junit.Assert.fail("testJeanGuy1litNum13807_failAssert1197litNum14435 should have thrown ArrayIndexOutOfBoundsException");
            }
            org.junit.Assert.fail("testJeanGuy1litNum13807_failAssert1197litNum14435_failAssert1248litNum15931 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("1261236322", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testJeanGuy1litNum13807_failAssert1197litNum14435_failAssert1248litNum15909_failAssert1440() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                    int[] backdoor = new int[]{ 1261236322, 2, 3, 0 };
                    IOrder order = new SubsetVarOrder(backdoor);
                    solver.setOrder(order);
                    IVecInt clause = new VecInt();
                    clause.push((-0)).push(5);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-2)).push(3).push(5);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-4)).push(5);
                    solver.addClause(clause);
                    solver.isSatisfiable();
                    org.junit.Assert.fail("testJeanGuy1litNum13807 should have thrown ArrayIndexOutOfBoundsException");
                }
                org.junit.Assert.fail("testJeanGuy1litNum13807_failAssert1197litNum14435 should have thrown ArrayIndexOutOfBoundsException");
            }
            org.junit.Assert.fail("testJeanGuy1litNum13807_failAssert1197litNum14435_failAssert1248litNum15909 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testJeanGuy1litNum13807_failAssert1197litNum14475_failAssert1268litNum15608_failAssert1457() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                    int[] backdoor = new int[]{ 1261236322, 2, 3, 4 };
                    IOrder order = new SubsetVarOrder(backdoor);
                    solver.setOrder(order);
                    IVecInt clause = new VecInt();
                    clause.push((-1)).push(5);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-3)).push(3).push(5);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-4)).push(0);
                    solver.addClause(clause);
                    solver.isSatisfiable();
                    org.junit.Assert.fail("testJeanGuy1litNum13807 should have thrown ArrayIndexOutOfBoundsException");
                }
                org.junit.Assert.fail("testJeanGuy1litNum13807_failAssert1197litNum14475 should have thrown ArrayIndexOutOfBoundsException");
            }
            org.junit.Assert.fail("testJeanGuy1litNum13807_failAssert1197litNum14475_failAssert1268litNum15608 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testJeanGuy1litNum13807_failAssert1197litNum14475_failAssert1268litNum15589_failAssert1471() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                    int[] backdoor = new int[]{ 1261236322, 2, 3, 4 };
                    IOrder order = new SubsetVarOrder(backdoor);
                    solver.setOrder(order);
                    IVecInt clause = new VecInt();
                    clause.push((-1)).push(5);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-3)).push(3).push(5);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-3)).push(5);
                    solver.addClause(clause);
                    solver.isSatisfiable();
                    org.junit.Assert.fail("testJeanGuy1litNum13807 should have thrown ArrayIndexOutOfBoundsException");
                }
                org.junit.Assert.fail("testJeanGuy1litNum13807_failAssert1197litNum14475 should have thrown ArrayIndexOutOfBoundsException");
            }
            org.junit.Assert.fail("testJeanGuy1litNum13807_failAssert1197litNum14475_failAssert1268litNum15589 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("1261236322", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testJeanGuy1litNum13829_failAssert1209_add14740_failAssert1228_add16764_failAssert1473() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                    int[] backdoor = new int[]{ 1, 2, 3, 4 };
                    IOrder order = new SubsetVarOrder(backdoor);
                    solver.setOrder(order);
                    IVecInt clause = new VecInt();
                    clause.push((-(Integer.MIN_VALUE))).push(5);
                    clause.push((-(Integer.MIN_VALUE))).push(5);
                    clause.push((-(Integer.MIN_VALUE))).push(5);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-2)).push(3).push(5);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-4)).push(5);
                    solver.addClause(clause);
                    solver.isSatisfiable();
                    org.junit.Assert.fail("testJeanGuy1litNum13829 should have thrown ArrayIndexOutOfBoundsException");
                }
                org.junit.Assert.fail("testJeanGuy1litNum13829_failAssert1209_add14740 should have thrown ArrayIndexOutOfBoundsException");
            }
            org.junit.Assert.fail("testJeanGuy1litNum13829_failAssert1209_add14740_failAssert1228_add16764 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-2147483648", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testJeanGuy1litNum13807_failAssert1197litNum14435_failAssert1248litNum15929_failAssert1475() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                    int[] backdoor = new int[]{ 1261236322, 2, 3, 0 };
                    IOrder order = new SubsetVarOrder(backdoor);
                    solver.setOrder(order);
                    IVecInt clause = new VecInt();
                    clause.push((-1)).push(16488704);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-2)).push(3).push(5);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-4)).push(5);
                    solver.addClause(clause);
                    solver.isSatisfiable();
                    org.junit.Assert.fail("testJeanGuy1litNum13807 should have thrown ArrayIndexOutOfBoundsException");
                }
                org.junit.Assert.fail("testJeanGuy1litNum13807_failAssert1197litNum14435 should have thrown ArrayIndexOutOfBoundsException");
            }
            org.junit.Assert.fail("testJeanGuy1litNum13807_failAssert1197litNum14435_failAssert1248litNum15929 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("1261236322", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testJeanGuy1litNum13807_failAssert1197litNum14475_failAssert1268litNum15597_failAssert1476() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                    int[] backdoor = new int[]{ 1261236322, 2, 3, 4 };
                    IOrder order = new SubsetVarOrder(backdoor);
                    solver.setOrder(order);
                    IVecInt clause = new VecInt();
                    clause.push((-1)).push(5);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-3)).push(3).push(5);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-33175465)).push(5);
                    solver.addClause(clause);
                    solver.isSatisfiable();
                    org.junit.Assert.fail("testJeanGuy1litNum13807 should have thrown ArrayIndexOutOfBoundsException");
                }
                org.junit.Assert.fail("testJeanGuy1litNum13807_failAssert1197litNum14475 should have thrown ArrayIndexOutOfBoundsException");
            }
            org.junit.Assert.fail("testJeanGuy1litNum13807_failAssert1197litNum14475_failAssert1268litNum15597 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("1261236322", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testJeanGuy1litNum13839_failAssert1213_add14562_failAssert1233_add16481_failAssert1477() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                    int[] backdoor = new int[]{ 1, 2, 3, 4 };
                    IOrder order = new SubsetVarOrder(backdoor);
                    solver.setOrder(order);
                    IVecInt clause = new VecInt();
                    clause.push((-1)).push(5);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-(Integer.MAX_VALUE))).push(3).push(5);
                    clause.push((-(Integer.MAX_VALUE))).push(3).push(5);
                    clause.push((-(Integer.MAX_VALUE))).push(3).push(5);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-4)).push(5);
                    solver.addClause(clause);
                    solver.isSatisfiable();
                    org.junit.Assert.fail("testJeanGuy1litNum13839 should have thrown NegativeArraySizeException");
                }
                org.junit.Assert.fail("testJeanGuy1litNum13839_failAssert1213_add14562 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testJeanGuy1litNum13839_failAssert1213_add14562_failAssert1233_add16481 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testJeanGuy1litNum13807_failAssert1197litNum14522_failAssert1254litNum16112_failAssert1479() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                    int[] backdoor = new int[]{ 1261236322, 2, 3, 4 };
                    IOrder order = new SubsetVarOrder(backdoor);
                    solver.setOrder(order);
                    IVecInt clause = new VecInt();
                    clause.push((-1)).push(5);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-2)).push(-16895777).push(5);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-5)).push(5);
                    solver.addClause(clause);
                    solver.isSatisfiable();
                    org.junit.Assert.fail("testJeanGuy1litNum13807 should have thrown ArrayIndexOutOfBoundsException");
                }
                org.junit.Assert.fail("testJeanGuy1litNum13807_failAssert1197litNum14522 should have thrown ArrayIndexOutOfBoundsException");
            }
            org.junit.Assert.fail("testJeanGuy1litNum13807_failAssert1197litNum14522_failAssert1254litNum16112 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("1261236322", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testJeanGuy1litNum13807_failAssert1197litNum14435_failAssert1248litNum15982_failAssert1481() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                    int[] backdoor = new int[]{ 1261236322, 2, 3, 0 };
                    IOrder order = new SubsetVarOrder(backdoor);
                    solver.setOrder(order);
                    IVecInt clause = new VecInt();
                    clause.push((-1)).push(5);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-2)).push(3).push(5);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-1129396951)).push(5);
                    solver.addClause(clause);
                    solver.isSatisfiable();
                    org.junit.Assert.fail("testJeanGuy1litNum13807 should have thrown ArrayIndexOutOfBoundsException");
                }
                org.junit.Assert.fail("testJeanGuy1litNum13807_failAssert1197litNum14435 should have thrown ArrayIndexOutOfBoundsException");
            }
            org.junit.Assert.fail("testJeanGuy1litNum13807_failAssert1197litNum14435_failAssert1248litNum15982 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testJeanGuy1litNum13829_failAssert1209_add14740_failAssert1228_add16760_failAssert1482() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    SolverFactory.newGlucose();
                    Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                    int[] backdoor = new int[]{ 1, 2, 3, 4 };
                    IOrder order = new SubsetVarOrder(backdoor);
                    solver.setOrder(order);
                    IVecInt clause = new VecInt();
                    clause.push((-(Integer.MIN_VALUE))).push(5);
                    clause.push((-(Integer.MIN_VALUE))).push(5);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-2)).push(3).push(5);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-4)).push(5);
                    solver.addClause(clause);
                    solver.isSatisfiable();
                    org.junit.Assert.fail("testJeanGuy1litNum13829 should have thrown ArrayIndexOutOfBoundsException");
                }
                org.junit.Assert.fail("testJeanGuy1litNum13829_failAssert1209_add14740 should have thrown ArrayIndexOutOfBoundsException");
            }
            org.junit.Assert.fail("testJeanGuy1litNum13829_failAssert1209_add14740_failAssert1228_add16760 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-2147483648", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testJeanGuy1litNum13857_failAssert1222litNum14187_failAssert1413litNum15506_failAssert1488() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                    int[] backdoor = new int[]{ 1, 2, 3, 0 };
                    IOrder order = new SubsetVarOrder(backdoor);
                    solver.setOrder(order);
                    IVecInt clause = new VecInt();
                    clause.push((-1)).push(5);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-3)).push(3).push(5);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-(Integer.MAX_VALUE))).push(5);
                    solver.addClause(clause);
                    solver.isSatisfiable();
                    org.junit.Assert.fail("testJeanGuy1litNum13857 should have thrown NegativeArraySizeException");
                }
                org.junit.Assert.fail("testJeanGuy1litNum13857_failAssert1222litNum14187 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testJeanGuy1litNum13857_failAssert1222litNum14187_failAssert1413litNum15506 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testJeanGuy1litNum13828_failAssert1208litNum14723_failAssert1386litNum15721_failAssert1492() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                    int[] backdoor = new int[]{ 1, 2, 3, 4 };
                    IOrder order = new SubsetVarOrder(backdoor);
                    solver.setOrder(order);
                    IVecInt clause = new VecInt();
                    clause.push((-(Integer.MAX_VALUE))).push(0);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-2)).push(3).push(5);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-4)).push(4);
                    solver.addClause(clause);
                    solver.isSatisfiable();
                    org.junit.Assert.fail("testJeanGuy1litNum13828 should have thrown NegativeArraySizeException");
                }
                org.junit.Assert.fail("testJeanGuy1litNum13828_failAssert1208litNum14723 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testJeanGuy1litNum13828_failAssert1208litNum14723_failAssert1386litNum15721 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testJeanGuy1litNum13857_failAssert1222litNum14187_failAssert1413litNum15568_failAssert1509() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                    int[] backdoor = new int[]{ 1, 2, 3, 4 };
                    IOrder order = new SubsetVarOrder(backdoor);
                    solver.setOrder(order);
                    IVecInt clause = new VecInt();
                    clause.push((-1)).push(5);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-3)).push(2).push(5);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-(Integer.MAX_VALUE))).push(5);
                    solver.addClause(clause);
                    solver.isSatisfiable();
                    org.junit.Assert.fail("testJeanGuy1litNum13857 should have thrown NegativeArraySizeException");
                }
                org.junit.Assert.fail("testJeanGuy1litNum13857_failAssert1222litNum14187 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testJeanGuy1litNum13857_failAssert1222litNum14187_failAssert1413litNum15568 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testJeanGuy1litNum13810_failAssert1198_add14877_failAssert1231_add16157_failAssert1520() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    SolverFactory.newGlucose();
                    SolverFactory.newGlucose();
                    Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                    int[] backdoor = new int[]{ 1, Integer.MAX_VALUE, 3, 4 };
                    IOrder order = new SubsetVarOrder(backdoor);
                    solver.setOrder(order);
                    IVecInt clause = new VecInt();
                    clause.push((-1)).push(5);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-2)).push(3).push(5);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-4)).push(5);
                    solver.addClause(clause);
                    solver.isSatisfiable();
                    org.junit.Assert.fail("testJeanGuy1litNum13810 should have thrown ArrayIndexOutOfBoundsException");
                }
                org.junit.Assert.fail("testJeanGuy1litNum13810_failAssert1198_add14877 should have thrown ArrayIndexOutOfBoundsException");
            }
            org.junit.Assert.fail("testJeanGuy1litNum13810_failAssert1198_add14877_failAssert1231_add16157 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("2147483647", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testJeanGuy1litNum13816_failAssert1201_add14493_failAssert1232_add16731_failAssert1523() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    SolverFactory.newGlucose();
                    SolverFactory.newGlucose();
                    Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                    int[] backdoor = new int[]{ 1, 2, Integer.MAX_VALUE, 4 };
                    IOrder order = new SubsetVarOrder(backdoor);
                    solver.setOrder(order);
                    IVecInt clause = new VecInt();
                    clause.push((-1)).push(5);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-2)).push(3).push(5);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-4)).push(5);
                    solver.addClause(clause);
                    solver.isSatisfiable();
                    org.junit.Assert.fail("testJeanGuy1litNum13816 should have thrown ArrayIndexOutOfBoundsException");
                }
                org.junit.Assert.fail("testJeanGuy1litNum13816_failAssert1201_add14493 should have thrown ArrayIndexOutOfBoundsException");
            }
            org.junit.Assert.fail("testJeanGuy1litNum13816_failAssert1201_add14493_failAssert1232_add16731 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("2147483647", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testJeanGuy1litNum13828_failAssert1208_add14805_failAssert1235_add16358_failAssert1549() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                    int[] backdoor = new int[]{ 1, 2, 3, 4 };
                    IOrder order = new SubsetVarOrder(backdoor);
                    solver.setOrder(order);
                    IVecInt clause = new VecInt();
                    clause.push((-(Integer.MAX_VALUE))).push(5);
                    clause.push((-(Integer.MAX_VALUE))).push(5);
                    clause.push((-(Integer.MAX_VALUE))).push(5);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-2)).push(3).push(5);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-4)).push(5);
                    solver.addClause(clause);
                    solver.isSatisfiable();
                    org.junit.Assert.fail("testJeanGuy1litNum13828 should have thrown NegativeArraySizeException");
                }
                org.junit.Assert.fail("testJeanGuy1litNum13828_failAssert1208_add14805 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testJeanGuy1litNum13828_failAssert1208_add14805_failAssert1235_add16358 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testJeanGuy1litNum13857_failAssert1222_add14291_failAssert1237_add16027_failAssert1555() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                    int[] backdoor = new int[]{ 1, 2, 3, 4 };
                    IOrder order = new SubsetVarOrder(backdoor);
                    solver.setOrder(order);
                    IVecInt clause = new VecInt();
                    clause.push((-1)).push(5);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-2)).push(3).push(5);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-(Integer.MAX_VALUE))).push(5);
                    clause.push((-(Integer.MAX_VALUE))).push(5);
                    clause.push((-(Integer.MAX_VALUE))).push(5);
                    solver.addClause(clause);
                    solver.isSatisfiable();
                    org.junit.Assert.fail("testJeanGuy1litNum13857 should have thrown NegativeArraySizeException");
                }
                org.junit.Assert.fail("testJeanGuy1litNum13857_failAssert1222_add14291 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testJeanGuy1litNum13857_failAssert1222_add14291_failAssert1237_add16027 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testJeanGuy1litNum13833_failAssert1210_add14331_failAssert1257_add15485_failAssert1561() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                    int[] backdoor = new int[]{ 1, 2, 3, 4 };
                    IOrder order = new SubsetVarOrder(backdoor);
                    solver.setOrder(order);
                    IVecInt clause = new VecInt();
                    clause.push((-1)).push(Integer.MAX_VALUE);
                    clause.push((-1)).push(Integer.MAX_VALUE);
                    clause.push((-1)).push(Integer.MAX_VALUE);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-2)).push(3).push(5);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-4)).push(5);
                    solver.addClause(clause);
                    solver.isSatisfiable();
                    org.junit.Assert.fail("testJeanGuy1litNum13833 should have thrown NegativeArraySizeException");
                }
                org.junit.Assert.fail("testJeanGuy1litNum13833_failAssert1210_add14331 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testJeanGuy1litNum13833_failAssert1210_add14331_failAssert1257_add15485 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testJeanGuy1litNum13839_failAssert1213_add14551_failAssert1266_add15862_failAssert1563() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    SolverFactory.newGlucose();
                    SolverFactory.newGlucose();
                    Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                    int[] backdoor = new int[]{ 1, 2, 3, 4 };
                    IOrder order = new SubsetVarOrder(backdoor);
                    solver.setOrder(order);
                    IVecInt clause = new VecInt();
                    clause.push((-1)).push(5);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-(Integer.MAX_VALUE))).push(3).push(5);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-4)).push(5);
                    solver.addClause(clause);
                    solver.isSatisfiable();
                    org.junit.Assert.fail("testJeanGuy1litNum13839 should have thrown NegativeArraySizeException");
                }
                org.junit.Assert.fail("testJeanGuy1litNum13839_failAssert1213_add14551 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testJeanGuy1litNum13839_failAssert1213_add14551_failAssert1266_add15862 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testJeanGuy1litNum13833_failAssert1210_add14331_failAssert1257_add15473_failAssert1565() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    SolverFactory.newGlucose();
                    Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                    int[] backdoor = new int[]{ 1, 2, 3, 4 };
                    IOrder order = new SubsetVarOrder(backdoor);
                    solver.setOrder(order);
                    IVecInt clause = new VecInt();
                    clause.push((-1)).push(Integer.MAX_VALUE);
                    clause.push((-1)).push(Integer.MAX_VALUE);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-2)).push(3).push(5);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-4)).push(5);
                    solver.addClause(clause);
                    solver.isSatisfiable();
                    org.junit.Assert.fail("testJeanGuy1litNum13833 should have thrown NegativeArraySizeException");
                }
                org.junit.Assert.fail("testJeanGuy1litNum13833_failAssert1210_add14331 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testJeanGuy1litNum13833_failAssert1210_add14331_failAssert1257_add15473 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testJeanGuy1litNum13807_failAssert1197litNum14522_failAssert1254litNum16135_failAssert1602() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                    int[] backdoor = new int[]{ 1261236322, 2, 3, 4 };
                    IOrder order = new SubsetVarOrder(backdoor);
                    solver.setOrder(order);
                    IVecInt clause = new VecInt();
                    clause.push((-1)).push(5);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-2)).push(3).push(5);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-5)).push(Integer.MAX_VALUE);
                    solver.addClause(clause);
                    solver.isSatisfiable();
                    org.junit.Assert.fail("testJeanGuy1litNum13807 should have thrown ArrayIndexOutOfBoundsException");
                }
                org.junit.Assert.fail("testJeanGuy1litNum13807_failAssert1197litNum14522 should have thrown ArrayIndexOutOfBoundsException");
            }
            org.junit.Assert.fail("testJeanGuy1litNum13807_failAssert1197litNum14522_failAssert1254litNum16135 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testJeanGuy2litNum17174_failAssert1605() throws Exception, ContradictionException, TimeoutException {
        try {
            Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
            int[] backdoor = new int[]{ 6 };
            IOrder order = new SubsetVarOrder(backdoor);
            solver.setOrder(order);
            IVecInt clause = new VecInt();
            clause.push((-1)).push(5);
            solver.addClause(clause);
            clause = new VecInt();
            clause.push((-2)).push(3).push(5);
            solver.addClause(clause);
            clause = new VecInt();
            clause.push((-4)).push(5);
            solver.addClause(clause);
            solver.isSatisfiable();
            org.junit.Assert.fail("testJeanGuy2litNum17174 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("6", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testJeanGuy2litNum17178_failAssert1608() throws Exception, ContradictionException, TimeoutException {
        try {
            Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
            int[] backdoor = new int[]{ 0 };
            IOrder order = new SubsetVarOrder(backdoor);
            solver.setOrder(order);
            IVecInt clause = new VecInt();
            clause.push((-1)).push(5);
            solver.addClause(clause);
            clause = new VecInt();
            clause.push((-2)).push(3).push(5);
            solver.addClause(clause);
            clause = new VecInt();
            clause.push((-4)).push(5);
            solver.addClause(clause);
            solver.isSatisfiable();
            org.junit.Assert.fail("testJeanGuy2litNum17178 should have thrown TimeoutException");
        } catch (TimeoutException expected) {
            Assert.assertEquals("Cannot decide the satisfiability", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testJeanGuy2litNum17179_failAssert1609() throws Exception, ContradictionException, TimeoutException {
        try {
            Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
            int[] backdoor = new int[]{ 1663232332 };
            IOrder order = new SubsetVarOrder(backdoor);
            solver.setOrder(order);
            IVecInt clause = new VecInt();
            clause.push((-1)).push(5);
            solver.addClause(clause);
            clause = new VecInt();
            clause.push((-2)).push(3).push(5);
            solver.addClause(clause);
            clause = new VecInt();
            clause.push((-4)).push(5);
            solver.addClause(clause);
            solver.isSatisfiable();
            org.junit.Assert.fail("testJeanGuy2litNum17179 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("1663232332", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testJeanGuy2litNum17181_failAssert1610() throws Exception, ContradictionException, TimeoutException {
        try {
            Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
            int[] backdoor = new int[]{ 5 };
            IOrder order = new SubsetVarOrder(backdoor);
            solver.setOrder(order);
            IVecInt clause = new VecInt();
            clause.push((-0)).push(5);
            solver.addClause(clause);
            clause = new VecInt();
            clause.push((-2)).push(3).push(5);
            solver.addClause(clause);
            clause = new VecInt();
            clause.push((-4)).push(5);
            solver.addClause(clause);
            solver.isSatisfiable();
            org.junit.Assert.fail("testJeanGuy2litNum17181 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testJeanGuy2litNum17182_failAssert1611() throws Exception, ContradictionException, TimeoutException {
        try {
            Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
            int[] backdoor = new int[]{ 5 };
            IOrder order = new SubsetVarOrder(backdoor);
            solver.setOrder(order);
            IVecInt clause = new VecInt();
            clause.push((-(Integer.MAX_VALUE))).push(5);
            solver.addClause(clause);
            clause = new VecInt();
            clause.push((-2)).push(3).push(5);
            solver.addClause(clause);
            clause = new VecInt();
            clause.push((-4)).push(5);
            solver.addClause(clause);
            solver.isSatisfiable();
            org.junit.Assert.fail("testJeanGuy2litNum17182 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testJeanGuy2litNum17183_failAssert1612() throws Exception, ContradictionException, TimeoutException {
        try {
            Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
            int[] backdoor = new int[]{ 5 };
            IOrder order = new SubsetVarOrder(backdoor);
            solver.setOrder(order);
            IVecInt clause = new VecInt();
            clause.push((-(Integer.MIN_VALUE))).push(5);
            solver.addClause(clause);
            clause = new VecInt();
            clause.push((-2)).push(3).push(5);
            solver.addClause(clause);
            clause = new VecInt();
            clause.push((-4)).push(5);
            solver.addClause(clause);
            solver.isSatisfiable();
            org.junit.Assert.fail("testJeanGuy2litNum17183 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-2147483648", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testJeanGuy2litNum17185_failAssert1613() throws Exception, ContradictionException, TimeoutException {
        try {
            Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
            int[] backdoor = new int[]{ 5 };
            IOrder order = new SubsetVarOrder(backdoor);
            solver.setOrder(order);
            IVecInt clause = new VecInt();
            clause.push((-1)).push(6);
            solver.addClause(clause);
            clause = new VecInt();
            clause.push((-2)).push(3).push(5);
            solver.addClause(clause);
            clause = new VecInt();
            clause.push((-4)).push(5);
            solver.addClause(clause);
            solver.isSatisfiable();
            org.junit.Assert.fail("testJeanGuy2litNum17185 should have thrown TimeoutException");
        } catch (TimeoutException expected) {
            Assert.assertEquals("Cannot decide the satisfiability", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testJeanGuy2litNum17186_failAssert1614() throws Exception, ContradictionException, TimeoutException {
        try {
            Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
            int[] backdoor = new int[]{ 5 };
            IOrder order = new SubsetVarOrder(backdoor);
            solver.setOrder(order);
            IVecInt clause = new VecInt();
            clause.push((-1)).push(4);
            solver.addClause(clause);
            clause = new VecInt();
            clause.push((-2)).push(3).push(5);
            solver.addClause(clause);
            clause = new VecInt();
            clause.push((-4)).push(5);
            solver.addClause(clause);
            solver.isSatisfiable();
            org.junit.Assert.fail("testJeanGuy2litNum17186 should have thrown TimeoutException");
        } catch (TimeoutException expected) {
            Assert.assertEquals("Cannot decide the satisfiability", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testJeanGuy2litNum17187_failAssert1615() throws Exception, ContradictionException, TimeoutException {
        try {
            Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
            int[] backdoor = new int[]{ 5 };
            IOrder order = new SubsetVarOrder(backdoor);
            solver.setOrder(order);
            IVecInt clause = new VecInt();
            clause.push((-1)).push(Integer.MAX_VALUE);
            solver.addClause(clause);
            clause = new VecInt();
            clause.push((-2)).push(3).push(5);
            solver.addClause(clause);
            clause = new VecInt();
            clause.push((-4)).push(5);
            solver.addClause(clause);
            solver.isSatisfiable();
            org.junit.Assert.fail("testJeanGuy2litNum17187 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testJeanGuy2litNum17189_failAssert1617() throws Exception, ContradictionException, TimeoutException {
        try {
            Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
            int[] backdoor = new int[]{ 5 };
            IOrder order = new SubsetVarOrder(backdoor);
            solver.setOrder(order);
            IVecInt clause = new VecInt();
            clause.push((-1)).push(0);
            solver.addClause(clause);
            clause = new VecInt();
            clause.push((-2)).push(3).push(5);
            solver.addClause(clause);
            clause = new VecInt();
            clause.push((-4)).push(5);
            solver.addClause(clause);
            solver.isSatisfiable();
            org.junit.Assert.fail("testJeanGuy2litNum17189 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testJeanGuy2litNum17193_failAssert1618() throws Exception, ContradictionException, TimeoutException {
        try {
            Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
            int[] backdoor = new int[]{ 5 };
            IOrder order = new SubsetVarOrder(backdoor);
            solver.setOrder(order);
            IVecInt clause = new VecInt();
            clause.push((-1)).push(5);
            solver.addClause(clause);
            clause = new VecInt();
            clause.push((-(Integer.MAX_VALUE))).push(3).push(5);
            solver.addClause(clause);
            clause = new VecInt();
            clause.push((-4)).push(5);
            solver.addClause(clause);
            solver.isSatisfiable();
            org.junit.Assert.fail("testJeanGuy2litNum17193 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testJeanGuy2litNum17195_failAssert1620() throws Exception, ContradictionException, TimeoutException {
        try {
            Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
            int[] backdoor = new int[]{ 5 };
            IOrder order = new SubsetVarOrder(backdoor);
            solver.setOrder(order);
            IVecInt clause = new VecInt();
            clause.push((-1)).push(5);
            solver.addClause(clause);
            clause = new VecInt();
            clause.push((-0)).push(3).push(5);
            solver.addClause(clause);
            clause = new VecInt();
            clause.push((-4)).push(5);
            solver.addClause(clause);
            solver.isSatisfiable();
            org.junit.Assert.fail("testJeanGuy2litNum17195 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testJeanGuy2litNum17203_failAssert1625() throws Exception, ContradictionException, TimeoutException {
        try {
            Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
            int[] backdoor = new int[]{ 5 };
            IOrder order = new SubsetVarOrder(backdoor);
            solver.setOrder(order);
            IVecInt clause = new VecInt();
            clause.push((-1)).push(5);
            solver.addClause(clause);
            clause = new VecInt();
            clause.push((-2)).push(3).push(6);
            solver.addClause(clause);
            clause = new VecInt();
            clause.push((-4)).push(5);
            solver.addClause(clause);
            solver.isSatisfiable();
            org.junit.Assert.fail("testJeanGuy2litNum17203 should have thrown TimeoutException");
        } catch (TimeoutException expected) {
            Assert.assertEquals("Cannot decide the satisfiability", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testJeanGuy2litNum17211_failAssert1630() throws Exception, ContradictionException, TimeoutException {
        try {
            Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
            int[] backdoor = new int[]{ 5 };
            IOrder order = new SubsetVarOrder(backdoor);
            solver.setOrder(order);
            IVecInt clause = new VecInt();
            clause.push((-1)).push(5);
            solver.addClause(clause);
            clause = new VecInt();
            clause.push((-2)).push(3).push(5);
            solver.addClause(clause);
            clause = new VecInt();
            clause.push((-(Integer.MAX_VALUE))).push(5);
            solver.addClause(clause);
            solver.isSatisfiable();
            org.junit.Assert.fail("testJeanGuy2litNum17211 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testJeanGuy2litNum17213_failAssert1632() throws Exception, ContradictionException, TimeoutException {
        try {
            Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
            int[] backdoor = new int[]{ 5 };
            IOrder order = new SubsetVarOrder(backdoor);
            solver.setOrder(order);
            IVecInt clause = new VecInt();
            clause.push((-1)).push(5);
            solver.addClause(clause);
            clause = new VecInt();
            clause.push((-2)).push(3).push(5);
            solver.addClause(clause);
            clause = new VecInt();
            clause.push((-0)).push(5);
            solver.addClause(clause);
            solver.isSatisfiable();
            org.junit.Assert.fail("testJeanGuy2litNum17213 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testJeanGuy2litNum17215_failAssert1633() throws Exception, ContradictionException, TimeoutException {
        try {
            Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
            int[] backdoor = new int[]{ 5 };
            IOrder order = new SubsetVarOrder(backdoor);
            solver.setOrder(order);
            IVecInt clause = new VecInt();
            clause.push((-1)).push(5);
            solver.addClause(clause);
            clause = new VecInt();
            clause.push((-2)).push(3).push(5);
            solver.addClause(clause);
            clause = new VecInt();
            clause.push((-4)).push(6);
            solver.addClause(clause);
            solver.isSatisfiable();
            org.junit.Assert.fail("testJeanGuy2litNum17215 should have thrown TimeoutException");
        } catch (TimeoutException expected) {
            Assert.assertEquals("Cannot decide the satisfiability", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testJeanGuy2litNum17219_failAssert1636() throws Exception, ContradictionException, TimeoutException {
        try {
            Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
            int[] backdoor = new int[]{ 5 };
            IOrder order = new SubsetVarOrder(backdoor);
            solver.setOrder(order);
            IVecInt clause = new VecInt();
            clause.push((-1)).push(5);
            solver.addClause(clause);
            clause = new VecInt();
            clause.push((-2)).push(3).push(5);
            solver.addClause(clause);
            clause = new VecInt();
            clause.push((-4)).push(0);
            solver.addClause(clause);
            solver.isSatisfiable();
            org.junit.Assert.fail("testJeanGuy2litNum17219 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testJeanGuy2litNum17220_failAssert1637() throws Exception, ContradictionException, TimeoutException {
        try {
            Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
            int[] backdoor = new int[]{ 5 };
            IOrder order = new SubsetVarOrder(backdoor);
            solver.setOrder(order);
            IVecInt clause = new VecInt();
            clause.push((-1)).push(5);
            solver.addClause(clause);
            clause = new VecInt();
            clause.push((-2)).push(3).push(5);
            solver.addClause(clause);
            clause = new VecInt();
            clause.push((-4)).push(25089575);
            solver.addClause(clause);
            solver.isSatisfiable();
            org.junit.Assert.fail("testJeanGuy2litNum17220 should have thrown TimeoutException");
        } catch (TimeoutException expected) {
            Assert.assertEquals("Cannot decide the satisfiability", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testJeanGuy2litNum17183_failAssert1612_add17524_failAssert1638() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                int[] backdoor = new int[]{ 5 };
                IOrder order = new SubsetVarOrder(backdoor);
                solver.setOrder(order);
                IVecInt clause = new VecInt();
                clause.push((-(Integer.MIN_VALUE))).push(5);
                clause.push((-(Integer.MIN_VALUE))).push(5);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push((-2)).push(3).push(5);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push((-4)).push(5);
                solver.addClause(clause);
                solver.isSatisfiable();
                org.junit.Assert.fail("testJeanGuy2litNum17183 should have thrown ArrayIndexOutOfBoundsException");
            }
            org.junit.Assert.fail("testJeanGuy2litNum17183_failAssert1612_add17524 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-2147483648", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testJeanGuy2litNum17193_failAssert1618_add17738_failAssert1640() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                int[] backdoor = new int[]{ 5 };
                IOrder order = new SubsetVarOrder(backdoor);
                solver.setOrder(order);
                IVecInt clause = new VecInt();
                clause.push((-1)).push(5);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push((-(Integer.MAX_VALUE))).push(3).push(5);
                clause.push((-(Integer.MAX_VALUE))).push(3).push(5);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push((-4)).push(5);
                solver.addClause(clause);
                solver.isSatisfiable();
                org.junit.Assert.fail("testJeanGuy2litNum17193 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testJeanGuy2litNum17193_failAssert1618_add17738 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testJeanGuy2litNum17182_failAssert1611_add17721_failAssert1643() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                int[] backdoor = new int[]{ 5 };
                IOrder order = new SubsetVarOrder(backdoor);
                solver.setOrder(order);
                IVecInt clause = new VecInt();
                clause.push((-(Integer.MAX_VALUE))).push(5);
                clause.push((-(Integer.MAX_VALUE))).push(5);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push((-2)).push(3).push(5);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push((-4)).push(5);
                solver.addClause(clause);
                solver.isSatisfiable();
                org.junit.Assert.fail("testJeanGuy2litNum17182 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testJeanGuy2litNum17182_failAssert1611_add17721 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testJeanGuy2litNum17211_failAssert1630_add18010_failAssert1644() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                int[] backdoor = new int[]{ 5 };
                IOrder order = new SubsetVarOrder(backdoor);
                solver.setOrder(order);
                IVecInt clause = new VecInt();
                clause.push((-1)).push(5);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push((-2)).push(3).push(5);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push((-(Integer.MAX_VALUE))).push(5);
                clause.push((-(Integer.MAX_VALUE))).push(5);
                solver.addClause(clause);
                solver.isSatisfiable();
                org.junit.Assert.fail("testJeanGuy2litNum17211 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testJeanGuy2litNum17211_failAssert1630_add18010 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testJeanGuy2litNum17189_failAssert1617_add17915_failAssert1645() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                SolverFactory.newGlucose();
                Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                int[] backdoor = new int[]{ 5 };
                IOrder order = new SubsetVarOrder(backdoor);
                solver.setOrder(order);
                IVecInt clause = new VecInt();
                clause.push((-1)).push(0);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push((-2)).push(3).push(5);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push((-4)).push(5);
                solver.addClause(clause);
                solver.isSatisfiable();
                org.junit.Assert.fail("testJeanGuy2litNum17189 should have thrown IllegalArgumentException");
            }
            org.junit.Assert.fail("testJeanGuy2litNum17189_failAssert1617_add17915 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testJeanGuy2litNum17219_failAssert1636_add17668_failAssert1646() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                SolverFactory.newGlucose();
                Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                int[] backdoor = new int[]{ 5 };
                IOrder order = new SubsetVarOrder(backdoor);
                solver.setOrder(order);
                IVecInt clause = new VecInt();
                clause.push((-1)).push(5);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push((-2)).push(3).push(5);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push((-4)).push(0);
                solver.addClause(clause);
                solver.isSatisfiable();
                org.junit.Assert.fail("testJeanGuy2litNum17219 should have thrown IllegalArgumentException");
            }
            org.junit.Assert.fail("testJeanGuy2litNum17219_failAssert1636_add17668 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testJeanGuy2litNum17195_failAssert1620_add17492_failAssert1647() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                SolverFactory.newGlucose();
                Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                int[] backdoor = new int[]{ 5 };
                IOrder order = new SubsetVarOrder(backdoor);
                solver.setOrder(order);
                IVecInt clause = new VecInt();
                clause.push((-1)).push(5);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push((-0)).push(3).push(5);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push((-4)).push(5);
                solver.addClause(clause);
                solver.isSatisfiable();
                org.junit.Assert.fail("testJeanGuy2litNum17195 should have thrown IllegalArgumentException");
            }
            org.junit.Assert.fail("testJeanGuy2litNum17195_failAssert1620_add17492 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testJeanGuy2litNum17181_failAssert1610_add17718_failAssert1648() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                SolverFactory.newGlucose();
                Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                int[] backdoor = new int[]{ 5 };
                IOrder order = new SubsetVarOrder(backdoor);
                solver.setOrder(order);
                IVecInt clause = new VecInt();
                clause.push((-0)).push(5);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push((-2)).push(3).push(5);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push((-4)).push(5);
                solver.addClause(clause);
                solver.isSatisfiable();
                org.junit.Assert.fail("testJeanGuy2litNum17181 should have thrown IllegalArgumentException");
            }
            org.junit.Assert.fail("testJeanGuy2litNum17181_failAssert1610_add17718 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testJeanGuy2litNum17187_failAssert1615_add18099_failAssert1650() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                int[] backdoor = new int[]{ 5 };
                IOrder order = new SubsetVarOrder(backdoor);
                solver.setOrder(order);
                IVecInt clause = new VecInt();
                clause.push((-1)).push(Integer.MAX_VALUE);
                clause.push((-1)).push(Integer.MAX_VALUE);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push((-2)).push(3).push(5);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push((-4)).push(5);
                solver.addClause(clause);
                solver.isSatisfiable();
                org.junit.Assert.fail("testJeanGuy2litNum17187 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testJeanGuy2litNum17187_failAssert1615_add18099 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testJeanGuy2litNum17193_failAssert1618_add17726_failAssert1651() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                SolverFactory.newGlucose();
                Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                int[] backdoor = new int[]{ 5 };
                IOrder order = new SubsetVarOrder(backdoor);
                solver.setOrder(order);
                IVecInt clause = new VecInt();
                clause.push((-1)).push(5);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push((-(Integer.MAX_VALUE))).push(3).push(5);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push((-4)).push(5);
                solver.addClause(clause);
                solver.isSatisfiable();
                org.junit.Assert.fail("testJeanGuy2litNum17193 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testJeanGuy2litNum17193_failAssert1618_add17726 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testJeanGuy2litNum17211_failAssert1630_add17972_failAssert1653() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                SolverFactory.newGlucose();
                Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                int[] backdoor = new int[]{ 5 };
                IOrder order = new SubsetVarOrder(backdoor);
                solver.setOrder(order);
                IVecInt clause = new VecInt();
                clause.push((-1)).push(5);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push((-2)).push(3).push(5);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push((-(Integer.MAX_VALUE))).push(5);
                solver.addClause(clause);
                solver.isSatisfiable();
                org.junit.Assert.fail("testJeanGuy2litNum17211 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testJeanGuy2litNum17211_failAssert1630_add17972 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testJeanGuy2litNum17174_failAssert1605litNum18013_failAssert1656() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                int[] backdoor = new int[]{ 6 };
                IOrder order = new SubsetVarOrder(backdoor);
                solver.setOrder(order);
                IVecInt clause = new VecInt();
                clause.push((-2)).push(5);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push((-2)).push(3).push(5);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push((-4)).push(5);
                solver.addClause(clause);
                solver.isSatisfiable();
                org.junit.Assert.fail("testJeanGuy2litNum17174 should have thrown ArrayIndexOutOfBoundsException");
            }
            org.junit.Assert.fail("testJeanGuy2litNum17174_failAssert1605litNum18013 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("6", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testJeanGuy2litNum17174_failAssert1605litNum18040_failAssert1657() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                int[] backdoor = new int[]{ 6 };
                IOrder order = new SubsetVarOrder(backdoor);
                solver.setOrder(order);
                IVecInt clause = new VecInt();
                clause.push((-1)).push(5);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push((-3)).push(3).push(5);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push((-4)).push(5);
                solver.addClause(clause);
                solver.isSatisfiable();
                org.junit.Assert.fail("testJeanGuy2litNum17174 should have thrown ArrayIndexOutOfBoundsException");
            }
            org.junit.Assert.fail("testJeanGuy2litNum17174_failAssert1605litNum18040 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("6", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testJeanGuy2litNum17174_failAssert1605litNum18027_failAssert1664() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                int[] backdoor = new int[]{ 6 };
                IOrder order = new SubsetVarOrder(backdoor);
                solver.setOrder(order);
                IVecInt clause = new VecInt();
                clause.push((-1)).push(6);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push((-2)).push(3).push(5);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push((-4)).push(5);
                solver.addClause(clause);
                solver.isSatisfiable();
                org.junit.Assert.fail("testJeanGuy2litNum17174 should have thrown ArrayIndexOutOfBoundsException");
            }
            org.junit.Assert.fail("testJeanGuy2litNum17174_failAssert1605litNum18027 should have thrown TimeoutException");
        } catch (TimeoutException expected) {
            Assert.assertEquals("Cannot decide the satisfiability", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testJeanGuy2litNum17174_failAssert1605litNum18073_failAssert1669() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                int[] backdoor = new int[]{ 6 };
                IOrder order = new SubsetVarOrder(backdoor);
                solver.setOrder(order);
                IVecInt clause = new VecInt();
                clause.push((-1)).push(5);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push((-2)).push(3).push(5);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push((-5)).push(5);
                solver.addClause(clause);
                solver.isSatisfiable();
                org.junit.Assert.fail("testJeanGuy2litNum17174 should have thrown ArrayIndexOutOfBoundsException");
            }
            org.junit.Assert.fail("testJeanGuy2litNum17174_failAssert1605litNum18073 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("6", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testJeanGuy2litNum17174_failAssert1605litNum18065_failAssert1670() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                int[] backdoor = new int[]{ 6 };
                IOrder order = new SubsetVarOrder(backdoor);
                solver.setOrder(order);
                IVecInt clause = new VecInt();
                clause.push((-1)).push(5);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push((-2)).push(3).push(6);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push((-4)).push(5);
                solver.addClause(clause);
                solver.isSatisfiable();
                org.junit.Assert.fail("testJeanGuy2litNum17174 should have thrown ArrayIndexOutOfBoundsException");
            }
            org.junit.Assert.fail("testJeanGuy2litNum17174_failAssert1605litNum18065 should have thrown TimeoutException");
        } catch (TimeoutException expected) {
            Assert.assertEquals("Cannot decide the satisfiability", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testJeanGuy2litNum17174_failAssert1605litNum18076_failAssert1671() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                int[] backdoor = new int[]{ 6 };
                IOrder order = new SubsetVarOrder(backdoor);
                solver.setOrder(order);
                IVecInt clause = new VecInt();
                clause.push((-1)).push(5);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push((-2)).push(3).push(5);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push((-3)).push(5);
                solver.addClause(clause);
                solver.isSatisfiable();
                org.junit.Assert.fail("testJeanGuy2litNum17174 should have thrown ArrayIndexOutOfBoundsException");
            }
            org.junit.Assert.fail("testJeanGuy2litNum17174_failAssert1605litNum18076 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("6", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testJeanGuy2litNum17174_failAssert1605litNum18086_failAssert1672() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                int[] backdoor = new int[]{ 6 };
                IOrder order = new SubsetVarOrder(backdoor);
                solver.setOrder(order);
                IVecInt clause = new VecInt();
                clause.push((-1)).push(5);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push((-2)).push(3).push(5);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push((-4)).push(6);
                solver.addClause(clause);
                solver.isSatisfiable();
                org.junit.Assert.fail("testJeanGuy2litNum17174 should have thrown ArrayIndexOutOfBoundsException");
            }
            org.junit.Assert.fail("testJeanGuy2litNum17174_failAssert1605litNum18086 should have thrown TimeoutException");
        } catch (TimeoutException expected) {
            Assert.assertEquals("Cannot decide the satisfiability", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testJeanGuy2litNum17174_failAssert1605litNum18096_failAssert1678() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                int[] backdoor = new int[]{ 6 };
                IOrder order = new SubsetVarOrder(backdoor);
                solver.setOrder(order);
                IVecInt clause = new VecInt();
                clause.push((-1)).push(5);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push((-2)).push(3).push(5);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push((-4)).push(-78850829);
                solver.addClause(clause);
                solver.isSatisfiable();
                org.junit.Assert.fail("testJeanGuy2litNum17174 should have thrown ArrayIndexOutOfBoundsException");
            }
            org.junit.Assert.fail("testJeanGuy2litNum17174_failAssert1605litNum18096 should have thrown TimeoutException");
        } catch (TimeoutException expected) {
            Assert.assertEquals("Cannot decide the satisfiability", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testJeanGuy2litNum17220_failAssert1637_add17532_failAssert1680() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                SolverFactory.newGlucose();
                Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                int[] backdoor = new int[]{ 5 };
                IOrder order = new SubsetVarOrder(backdoor);
                solver.setOrder(order);
                IVecInt clause = new VecInt();
                clause.push((-1)).push(5);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push((-2)).push(3).push(5);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push((-4)).push(25089575);
                solver.addClause(clause);
                solver.isSatisfiable();
                org.junit.Assert.fail("testJeanGuy2litNum17220 should have thrown TimeoutException");
            }
            org.junit.Assert.fail("testJeanGuy2litNum17220_failAssert1637_add17532 should have thrown TimeoutException");
        } catch (TimeoutException expected) {
            Assert.assertEquals("Cannot decide the satisfiability", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testJeanGuy2litNum17203_failAssert1625litNum17511_failAssert1682() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                int[] backdoor = new int[]{ 5 };
                IOrder order = new SubsetVarOrder(backdoor);
                solver.setOrder(order);
                IVecInt clause = new VecInt();
                clause.push((-1)).push(5);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push((-2)).push(3).push(6);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push((-3)).push(5);
                solver.addClause(clause);
                solver.isSatisfiable();
                org.junit.Assert.fail("testJeanGuy2litNum17203 should have thrown TimeoutException");
            }
            org.junit.Assert.fail("testJeanGuy2litNum17203_failAssert1625litNum17511 should have thrown TimeoutException");
        } catch (TimeoutException expected) {
            Assert.assertEquals("Cannot decide the satisfiability", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testJeanGuy2litNum17203_failAssert1625litNum17510_failAssert1684() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                int[] backdoor = new int[]{ 5 };
                IOrder order = new SubsetVarOrder(backdoor);
                solver.setOrder(order);
                IVecInt clause = new VecInt();
                clause.push((-1)).push(5);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push((-2)).push(3).push(6);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push((-5)).push(5);
                solver.addClause(clause);
                solver.isSatisfiable();
                org.junit.Assert.fail("testJeanGuy2litNum17203 should have thrown TimeoutException");
            }
            org.junit.Assert.fail("testJeanGuy2litNum17203_failAssert1625litNum17510 should have thrown TimeoutException");
        } catch (TimeoutException expected) {
            Assert.assertEquals("Cannot decide the satisfiability", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testJeanGuy2litNum17186_failAssert1614litNum17822_failAssert1697() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                int[] backdoor = new int[]{ 5 };
                IOrder order = new SubsetVarOrder(backdoor);
                solver.setOrder(order);
                IVecInt clause = new VecInt();
                clause.push((-1)).push(4);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push((-2)).push(3).push(4);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push((-4)).push(5);
                solver.addClause(clause);
                solver.isSatisfiable();
                org.junit.Assert.fail("testJeanGuy2litNum17186 should have thrown TimeoutException");
            }
            org.junit.Assert.fail("testJeanGuy2litNum17186_failAssert1614litNum17822 should have thrown TimeoutException");
        } catch (TimeoutException expected) {
            Assert.assertEquals("Cannot decide the satisfiability", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testJeanGuy2litNum17185_failAssert1613litNum17932_failAssert1703() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                int[] backdoor = new int[]{ 5 };
                IOrder order = new SubsetVarOrder(backdoor);
                solver.setOrder(order);
                IVecInt clause = new VecInt();
                clause.push((-1)).push(6);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push((-3)).push(3).push(5);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push((-4)).push(5);
                solver.addClause(clause);
                solver.isSatisfiable();
                org.junit.Assert.fail("testJeanGuy2litNum17185 should have thrown TimeoutException");
            }
            org.junit.Assert.fail("testJeanGuy2litNum17185_failAssert1613litNum17932 should have thrown TimeoutException");
        } catch (TimeoutException expected) {
            Assert.assertEquals("Cannot decide the satisfiability", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testJeanGuy2litNum17178_failAssert1608litNum17841_failAssert1707() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                int[] backdoor = new int[]{ 0 };
                IOrder order = new SubsetVarOrder(backdoor);
                solver.setOrder(order);
                IVecInt clause = new VecInt();
                clause.push((-1)).push(5);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push((-2)).push(4).push(5);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push((-4)).push(5);
                solver.addClause(clause);
                solver.isSatisfiable();
                org.junit.Assert.fail("testJeanGuy2litNum17178 should have thrown TimeoutException");
            }
            org.junit.Assert.fail("testJeanGuy2litNum17178_failAssert1608litNum17841 should have thrown TimeoutException");
        } catch (TimeoutException expected) {
            Assert.assertEquals("Cannot decide the satisfiability", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testJeanGuy2litNum17178_failAssert1608litNum17815_failAssert1709() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                int[] backdoor = new int[]{ 0 };
                IOrder order = new SubsetVarOrder(backdoor);
                solver.setOrder(order);
                IVecInt clause = new VecInt();
                clause.push((-1)).push(5);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push((-3)).push(3).push(5);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push((-4)).push(5);
                solver.addClause(clause);
                solver.isSatisfiable();
                org.junit.Assert.fail("testJeanGuy2litNum17178 should have thrown TimeoutException");
            }
            org.junit.Assert.fail("testJeanGuy2litNum17178_failAssert1608litNum17815 should have thrown TimeoutException");
        } catch (TimeoutException expected) {
            Assert.assertEquals("Cannot decide the satisfiability", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testJeanGuy2litNum17186_failAssert1614litNum17843_failAssert1711() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                int[] backdoor = new int[]{ 5 };
                IOrder order = new SubsetVarOrder(backdoor);
                solver.setOrder(order);
                IVecInt clause = new VecInt();
                clause.push((-1)).push(4);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push((-2)).push(3).push(5);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push((-5)).push(5);
                solver.addClause(clause);
                solver.isSatisfiable();
                org.junit.Assert.fail("testJeanGuy2litNum17186 should have thrown TimeoutException");
            }
            org.junit.Assert.fail("testJeanGuy2litNum17186_failAssert1614litNum17843 should have thrown TimeoutException");
        } catch (TimeoutException expected) {
            Assert.assertEquals("Cannot decide the satisfiability", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testJeanGuy2litNum17185_failAssert1613litNum17944_failAssert1712() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                int[] backdoor = new int[]{ 5 };
                IOrder order = new SubsetVarOrder(backdoor);
                solver.setOrder(order);
                IVecInt clause = new VecInt();
                clause.push((-1)).push(6);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push((-2)).push(4).push(5);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push((-4)).push(5);
                solver.addClause(clause);
                solver.isSatisfiable();
                org.junit.Assert.fail("testJeanGuy2litNum17185 should have thrown TimeoutException");
            }
            org.junit.Assert.fail("testJeanGuy2litNum17185_failAssert1613litNum17944 should have thrown TimeoutException");
        } catch (TimeoutException expected) {
            Assert.assertEquals("Cannot decide the satisfiability", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testJeanGuy2litNum17185_failAssert1613litNum17955_failAssert1724() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                int[] backdoor = new int[]{ 5 };
                IOrder order = new SubsetVarOrder(backdoor);
                solver.setOrder(order);
                IVecInt clause = new VecInt();
                clause.push((-1)).push(6);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push((-2)).push(3).push(6);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push((-4)).push(5);
                solver.addClause(clause);
                solver.isSatisfiable();
                org.junit.Assert.fail("testJeanGuy2litNum17185 should have thrown TimeoutException");
            }
            org.junit.Assert.fail("testJeanGuy2litNum17185_failAssert1613litNum17955 should have thrown TimeoutException");
        } catch (TimeoutException expected) {
            Assert.assertEquals("Cannot decide the satisfiability", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testJeanGuy2litNum17178_failAssert1608litNum17883_failAssert1731() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                int[] backdoor = new int[]{ 0 };
                IOrder order = new SubsetVarOrder(backdoor);
                solver.setOrder(order);
                IVecInt clause = new VecInt();
                clause.push((-1)).push(5);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push((-2)).push(3).push(5);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push((-5)).push(5);
                solver.addClause(clause);
                solver.isSatisfiable();
                org.junit.Assert.fail("testJeanGuy2litNum17178 should have thrown TimeoutException");
            }
            org.junit.Assert.fail("testJeanGuy2litNum17178_failAssert1608litNum17883 should have thrown TimeoutException");
        } catch (TimeoutException expected) {
            Assert.assertEquals("Cannot decide the satisfiability", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testJeanGuy2litNum17215_failAssert1633_add17465_failAssert1774() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                SolverFactory.newGlucose();
                Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                int[] backdoor = new int[]{ 5 };
                IOrder order = new SubsetVarOrder(backdoor);
                solver.setOrder(order);
                IVecInt clause = new VecInt();
                clause.push((-1)).push(5);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push((-2)).push(3).push(5);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push((-4)).push(6);
                solver.addClause(clause);
                solver.isSatisfiable();
                org.junit.Assert.fail("testJeanGuy2litNum17215 should have thrown TimeoutException");
            }
            org.junit.Assert.fail("testJeanGuy2litNum17215_failAssert1633_add17465 should have thrown TimeoutException");
        } catch (TimeoutException expected) {
            Assert.assertEquals("Cannot decide the satisfiability", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testJeanGuy2litNum17186_failAssert1614litNum17879_failAssert1781() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                int[] backdoor = new int[]{ 5 };
                IOrder order = new SubsetVarOrder(backdoor);
                solver.setOrder(order);
                IVecInt clause = new VecInt();
                clause.push((-1)).push(4);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push((-2)).push(3).push(5);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push((-4)).push(-52586358);
                solver.addClause(clause);
                solver.isSatisfiable();
                org.junit.Assert.fail("testJeanGuy2litNum17186 should have thrown TimeoutException");
            }
            org.junit.Assert.fail("testJeanGuy2litNum17186_failAssert1614litNum17879 should have thrown TimeoutException");
        } catch (TimeoutException expected) {
            Assert.assertEquals("Cannot decide the satisfiability", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testJeanGuy2litNum17219_failAssert1636_add17688_failAssert1785() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                int[] backdoor = new int[]{ 5 };
                IOrder order = new SubsetVarOrder(backdoor);
                solver.setOrder(order);
                IVecInt clause = new VecInt();
                clause.push((-1)).push(5);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push((-2)).push(3).push(5);
                clause.push((-2)).push(3).push(5);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push((-4)).push(0);
                solver.addClause(clause);
                solver.isSatisfiable();
                org.junit.Assert.fail("testJeanGuy2litNum17219 should have thrown IllegalArgumentException");
            }
            org.junit.Assert.fail("testJeanGuy2litNum17219_failAssert1636_add17688 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testJeanGuy2litNum17195_failAssert1620_add17501_failAssert1786() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                int[] backdoor = new int[]{ 5 };
                IOrder order = new SubsetVarOrder(backdoor);
                solver.setOrder(order);
                IVecInt clause = new VecInt();
                clause.push((-1)).push(5);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push((-0)).push(3).push(5);
                clause.push((-0)).push(3).push(5);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push((-4)).push(5);
                solver.addClause(clause);
                solver.isSatisfiable();
                org.junit.Assert.fail("testJeanGuy2litNum17195 should have thrown IllegalArgumentException");
            }
            org.junit.Assert.fail("testJeanGuy2litNum17195_failAssert1620_add17501 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testJeanGuy2litNum17211_failAssert1630_add17995_failAssert1793() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                int[] backdoor = new int[]{ 5 };
                IOrder order = new SubsetVarOrder(backdoor);
                solver.setOrder(order);
                IVecInt clause = new VecInt();
                clause.push((-1)).push(5);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push((-2)).push(3).push(5);
                clause.push((-2)).push(3).push(5);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push((-(Integer.MAX_VALUE))).push(5);
                solver.addClause(clause);
                solver.isSatisfiable();
                org.junit.Assert.fail("testJeanGuy2litNum17211 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testJeanGuy2litNum17211_failAssert1630_add17995 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testJeanGuy2litNum17195_failAssert1620_add17499_failAssert1803() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                int[] backdoor = new int[]{ 5 };
                IOrder order = new SubsetVarOrder(backdoor);
                solver.setOrder(order);
                IVecInt clause = new VecInt();
                clause.push((-1)).push(5);
                solver.addClause(clause);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push((-0)).push(3).push(5);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push((-4)).push(5);
                solver.addClause(clause);
                solver.isSatisfiable();
                org.junit.Assert.fail("testJeanGuy2litNum17195 should have thrown IllegalArgumentException");
            }
            org.junit.Assert.fail("testJeanGuy2litNum17195_failAssert1620_add17499 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testJeanGuy2litNum17219_failAssert1636_add17695_failAssert1804() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                int[] backdoor = new int[]{ 5 };
                IOrder order = new SubsetVarOrder(backdoor);
                solver.setOrder(order);
                IVecInt clause = new VecInt();
                clause.push((-1)).push(5);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push((-2)).push(3).push(5);
                solver.addClause(clause);
                solver.addClause(clause);
                clause = new VecInt();
                clause.push((-4)).push(0);
                solver.addClause(clause);
                solver.isSatisfiable();
                org.junit.Assert.fail("testJeanGuy2litNum17219 should have thrown IllegalArgumentException");
            }
            org.junit.Assert.fail("testJeanGuy2litNum17219_failAssert1636_add17695 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testJeanGuy2litNum17183_failAssert1612_add17524_failAssert1638_add19756_failAssert1805() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                    int[] backdoor = new int[]{ 5 };
                    IOrder order = new SubsetVarOrder(backdoor);
                    solver.setOrder(order);
                    IVecInt clause = new VecInt();
                    clause.push((-(Integer.MIN_VALUE))).push(5);
                    clause.push((-(Integer.MIN_VALUE))).push(5);
                    clause.push((-(Integer.MIN_VALUE))).push(5);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-2)).push(3).push(5);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-4)).push(5);
                    solver.addClause(clause);
                    solver.isSatisfiable();
                    org.junit.Assert.fail("testJeanGuy2litNum17183 should have thrown ArrayIndexOutOfBoundsException");
                }
                org.junit.Assert.fail("testJeanGuy2litNum17183_failAssert1612_add17524 should have thrown ArrayIndexOutOfBoundsException");
            }
            org.junit.Assert.fail("testJeanGuy2litNum17183_failAssert1612_add17524_failAssert1638_add19756 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-2147483648", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testJeanGuy2litNum17193_failAssert1618_add17738_failAssert1640_add19968_failAssert1807() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                    int[] backdoor = new int[]{ 5 };
                    IOrder order = new SubsetVarOrder(backdoor);
                    solver.setOrder(order);
                    IVecInt clause = new VecInt();
                    clause.push((-1)).push(5);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-(Integer.MAX_VALUE))).push(3).push(5);
                    clause.push((-(Integer.MAX_VALUE))).push(3).push(5);
                    clause.push((-(Integer.MAX_VALUE))).push(3).push(5);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-4)).push(5);
                    solver.addClause(clause);
                    solver.isSatisfiable();
                    org.junit.Assert.fail("testJeanGuy2litNum17193 should have thrown NegativeArraySizeException");
                }
                org.junit.Assert.fail("testJeanGuy2litNum17193_failAssert1618_add17738 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testJeanGuy2litNum17193_failAssert1618_add17738_failAssert1640_add19968 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testJeanGuy2litNum17183_failAssert1612_add17524_failAssert1638_add19743_failAssert1809() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    SolverFactory.newGlucose();
                    Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                    int[] backdoor = new int[]{ 5 };
                    IOrder order = new SubsetVarOrder(backdoor);
                    solver.setOrder(order);
                    IVecInt clause = new VecInt();
                    clause.push((-(Integer.MIN_VALUE))).push(5);
                    clause.push((-(Integer.MIN_VALUE))).push(5);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-2)).push(3).push(5);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-4)).push(5);
                    solver.addClause(clause);
                    solver.isSatisfiable();
                    org.junit.Assert.fail("testJeanGuy2litNum17183 should have thrown ArrayIndexOutOfBoundsException");
                }
                org.junit.Assert.fail("testJeanGuy2litNum17183_failAssert1612_add17524 should have thrown ArrayIndexOutOfBoundsException");
            }
            org.junit.Assert.fail("testJeanGuy2litNum17183_failAssert1612_add17524_failAssert1638_add19743 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-2147483648", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testJeanGuy2litNum17182_failAssert1611_add17721_failAssert1643_add19294_failAssert1818() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                    int[] backdoor = new int[]{ 5 };
                    IOrder order = new SubsetVarOrder(backdoor);
                    solver.setOrder(order);
                    IVecInt clause = new VecInt();
                    clause.push((-(Integer.MAX_VALUE))).push(5);
                    clause.push((-(Integer.MAX_VALUE))).push(5);
                    clause.push((-(Integer.MAX_VALUE))).push(5);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-2)).push(3).push(5);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-4)).push(5);
                    solver.addClause(clause);
                    solver.isSatisfiable();
                    org.junit.Assert.fail("testJeanGuy2litNum17182 should have thrown NegativeArraySizeException");
                }
                org.junit.Assert.fail("testJeanGuy2litNum17182_failAssert1611_add17721 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testJeanGuy2litNum17182_failAssert1611_add17721_failAssert1643_add19294 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testJeanGuy2litNum17211_failAssert1630_add18010_failAssert1644_add19544_failAssert1820() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                    int[] backdoor = new int[]{ 5 };
                    IOrder order = new SubsetVarOrder(backdoor);
                    solver.setOrder(order);
                    IVecInt clause = new VecInt();
                    clause.push((-1)).push(5);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-2)).push(3).push(5);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-(Integer.MAX_VALUE))).push(5);
                    clause.push((-(Integer.MAX_VALUE))).push(5);
                    clause.push((-(Integer.MAX_VALUE))).push(5);
                    solver.addClause(clause);
                    solver.isSatisfiable();
                    org.junit.Assert.fail("testJeanGuy2litNum17211 should have thrown NegativeArraySizeException");
                }
                org.junit.Assert.fail("testJeanGuy2litNum17211_failAssert1630_add18010 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testJeanGuy2litNum17211_failAssert1630_add18010_failAssert1644_add19544 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testJeanGuy2litNum17182_failAssert1611_add17721_failAssert1643_add19284_failAssert1823() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    SolverFactory.newGlucose();
                    Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                    int[] backdoor = new int[]{ 5 };
                    IOrder order = new SubsetVarOrder(backdoor);
                    solver.setOrder(order);
                    IVecInt clause = new VecInt();
                    clause.push((-(Integer.MAX_VALUE))).push(5);
                    clause.push((-(Integer.MAX_VALUE))).push(5);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-2)).push(3).push(5);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-4)).push(5);
                    solver.addClause(clause);
                    solver.isSatisfiable();
                    org.junit.Assert.fail("testJeanGuy2litNum17182 should have thrown NegativeArraySizeException");
                }
                org.junit.Assert.fail("testJeanGuy2litNum17182_failAssert1611_add17721 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testJeanGuy2litNum17182_failAssert1611_add17721_failAssert1643_add19284 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testJeanGuy2litNum17211_failAssert1630_add17972_failAssert1653_add19265_failAssert1824() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    SolverFactory.newGlucose();
                    Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                    int[] backdoor = new int[]{ 5 };
                    IOrder order = new SubsetVarOrder(backdoor);
                    solver.setOrder(order);
                    IVecInt clause = new VecInt();
                    clause.push((-1)).push(5);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-2)).push(3).push(5);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-(Integer.MAX_VALUE))).push(5);
                    clause.push((-(Integer.MAX_VALUE))).push(5);
                    solver.addClause(clause);
                    solver.isSatisfiable();
                    org.junit.Assert.fail("testJeanGuy2litNum17211 should have thrown NegativeArraySizeException");
                }
                org.junit.Assert.fail("testJeanGuy2litNum17211_failAssert1630_add17972 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testJeanGuy2litNum17211_failAssert1630_add17972_failAssert1653_add19265 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testJeanGuy2litNum17187_failAssert1615_add18099_failAssert1650_add19840_failAssert1825() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                    int[] backdoor = new int[]{ 5 };
                    IOrder order = new SubsetVarOrder(backdoor);
                    solver.setOrder(order);
                    IVecInt clause = new VecInt();
                    clause.push((-1)).push(Integer.MAX_VALUE);
                    clause.push((-1)).push(Integer.MAX_VALUE);
                    clause.push((-1)).push(Integer.MAX_VALUE);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-2)).push(3).push(5);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-4)).push(5);
                    solver.addClause(clause);
                    solver.isSatisfiable();
                    org.junit.Assert.fail("testJeanGuy2litNum17187 should have thrown NegativeArraySizeException");
                }
                org.junit.Assert.fail("testJeanGuy2litNum17187_failAssert1615_add18099 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testJeanGuy2litNum17187_failAssert1615_add18099_failAssert1650_add19840 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testJeanGuy2litNum17187_failAssert1615_add18099_failAssert1650_add19822_failAssert1828() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    SolverFactory.newGlucose();
                    Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                    int[] backdoor = new int[]{ 5 };
                    IOrder order = new SubsetVarOrder(backdoor);
                    solver.setOrder(order);
                    IVecInt clause = new VecInt();
                    clause.push((-1)).push(Integer.MAX_VALUE);
                    clause.push((-1)).push(Integer.MAX_VALUE);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-2)).push(3).push(5);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-4)).push(5);
                    solver.addClause(clause);
                    solver.isSatisfiable();
                    org.junit.Assert.fail("testJeanGuy2litNum17187 should have thrown NegativeArraySizeException");
                }
                org.junit.Assert.fail("testJeanGuy2litNum17187_failAssert1615_add18099 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testJeanGuy2litNum17187_failAssert1615_add18099_failAssert1650_add19822 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testJeanGuy2litNum17203_failAssert1625litNum17511_failAssert1682litNum18521_failAssert1829() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                    int[] backdoor = new int[]{ 5 };
                    IOrder order = new SubsetVarOrder(backdoor);
                    solver.setOrder(order);
                    IVecInt clause = new VecInt();
                    clause.push((-1)).push(5);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-2)).push(3).push(6);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-3)).push(6);
                    solver.addClause(clause);
                    solver.isSatisfiable();
                    org.junit.Assert.fail("testJeanGuy2litNum17203 should have thrown TimeoutException");
                }
                org.junit.Assert.fail("testJeanGuy2litNum17203_failAssert1625litNum17511 should have thrown TimeoutException");
            }
            org.junit.Assert.fail("testJeanGuy2litNum17203_failAssert1625litNum17511_failAssert1682litNum18521 should have thrown TimeoutException");
        } catch (TimeoutException expected) {
            Assert.assertEquals("Cannot decide the satisfiability", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testJeanGuy2litNum17203_failAssert1625litNum17511_failAssert1682litNum18536_failAssert1830() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                    int[] backdoor = new int[]{ 5 };
                    IOrder order = new SubsetVarOrder(backdoor);
                    solver.setOrder(order);
                    IVecInt clause = new VecInt();
                    clause.push((-1)).push(5);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-2)).push(3).push(6);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-3)).push(0);
                    solver.addClause(clause);
                    solver.isSatisfiable();
                    org.junit.Assert.fail("testJeanGuy2litNum17203 should have thrown TimeoutException");
                }
                org.junit.Assert.fail("testJeanGuy2litNum17203_failAssert1625litNum17511 should have thrown TimeoutException");
            }
            org.junit.Assert.fail("testJeanGuy2litNum17203_failAssert1625litNum17511_failAssert1682litNum18536 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testJeanGuy2litNum17203_failAssert1625litNum17510_failAssert1684litNum18675_failAssert1833() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                    int[] backdoor = new int[]{ 5 };
                    IOrder order = new SubsetVarOrder(backdoor);
                    solver.setOrder(order);
                    IVecInt clause = new VecInt();
                    clause.push((-1)).push(5);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-2)).push(3).push(6);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-5)).push(4);
                    solver.addClause(clause);
                    solver.isSatisfiable();
                    org.junit.Assert.fail("testJeanGuy2litNum17203 should have thrown TimeoutException");
                }
                org.junit.Assert.fail("testJeanGuy2litNum17203_failAssert1625litNum17510 should have thrown TimeoutException");
            }
            org.junit.Assert.fail("testJeanGuy2litNum17203_failAssert1625litNum17510_failAssert1684litNum18675 should have thrown TimeoutException");
        } catch (TimeoutException expected) {
            Assert.assertEquals("Cannot decide the satisfiability", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testJeanGuy2litNum17193_failAssert1618_add17726_failAssert1651_add19067_failAssert1834() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    SolverFactory.newGlucose();
                    SolverFactory.newGlucose();
                    Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                    int[] backdoor = new int[]{ 5 };
                    IOrder order = new SubsetVarOrder(backdoor);
                    solver.setOrder(order);
                    IVecInt clause = new VecInt();
                    clause.push((-1)).push(5);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-(Integer.MAX_VALUE))).push(3).push(5);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-4)).push(5);
                    solver.addClause(clause);
                    solver.isSatisfiable();
                    org.junit.Assert.fail("testJeanGuy2litNum17193 should have thrown NegativeArraySizeException");
                }
                org.junit.Assert.fail("testJeanGuy2litNum17193_failAssert1618_add17726 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testJeanGuy2litNum17193_failAssert1618_add17726_failAssert1651_add19067 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testJeanGuy2litNum17186_failAssert1614litNum17843_failAssert1711litNum19000_failAssert1836() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                    int[] backdoor = new int[]{ 5 };
                    IOrder order = new SubsetVarOrder(backdoor);
                    solver.setOrder(order);
                    IVecInt clause = new VecInt();
                    clause.push((-1)).push(4);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-2)).push(0).push(5);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-5)).push(5);
                    solver.addClause(clause);
                    solver.isSatisfiable();
                    org.junit.Assert.fail("testJeanGuy2litNum17186 should have thrown TimeoutException");
                }
                org.junit.Assert.fail("testJeanGuy2litNum17186_failAssert1614litNum17843 should have thrown TimeoutException");
            }
            org.junit.Assert.fail("testJeanGuy2litNum17186_failAssert1614litNum17843_failAssert1711litNum19000 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testJeanGuy2litNum17186_failAssert1614litNum17843_failAssert1711litNum19020_failAssert1840() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                    int[] backdoor = new int[]{ 5 };
                    IOrder order = new SubsetVarOrder(backdoor);
                    solver.setOrder(order);
                    IVecInt clause = new VecInt();
                    clause.push((-1)).push(4);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-2)).push(3).push(5);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-5)).push(6);
                    solver.addClause(clause);
                    solver.isSatisfiable();
                    org.junit.Assert.fail("testJeanGuy2litNum17186 should have thrown TimeoutException");
                }
                org.junit.Assert.fail("testJeanGuy2litNum17186_failAssert1614litNum17843 should have thrown TimeoutException");
            }
            org.junit.Assert.fail("testJeanGuy2litNum17186_failAssert1614litNum17843_failAssert1711litNum19020 should have thrown TimeoutException");
        } catch (TimeoutException expected) {
            Assert.assertEquals("Cannot decide the satisfiability", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testJeanGuy2litNum17185_failAssert1613litNum17932_failAssert1703litNum18621_failAssert1841() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                    int[] backdoor = new int[]{ 5 };
                    IOrder order = new SubsetVarOrder(backdoor);
                    solver.setOrder(order);
                    IVecInt clause = new VecInt();
                    clause.push((-1)).push(6);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-3)).push(4).push(5);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-4)).push(5);
                    solver.addClause(clause);
                    solver.isSatisfiable();
                    org.junit.Assert.fail("testJeanGuy2litNum17185 should have thrown TimeoutException");
                }
                org.junit.Assert.fail("testJeanGuy2litNum17185_failAssert1613litNum17932 should have thrown TimeoutException");
            }
            org.junit.Assert.fail("testJeanGuy2litNum17185_failAssert1613litNum17932_failAssert1703litNum18621 should have thrown TimeoutException");
        } catch (TimeoutException expected) {
            Assert.assertEquals("Cannot decide the satisfiability", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testJeanGuy2litNum17185_failAssert1613litNum17932_failAssert1703litNum18672_failAssert1843() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                    int[] backdoor = new int[]{ 5 };
                    IOrder order = new SubsetVarOrder(backdoor);
                    solver.setOrder(order);
                    IVecInt clause = new VecInt();
                    clause.push((-1)).push(6);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-3)).push(3).push(5);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-4)).push(0);
                    solver.addClause(clause);
                    solver.isSatisfiable();
                    org.junit.Assert.fail("testJeanGuy2litNum17185 should have thrown TimeoutException");
                }
                org.junit.Assert.fail("testJeanGuy2litNum17185_failAssert1613litNum17932 should have thrown TimeoutException");
            }
            org.junit.Assert.fail("testJeanGuy2litNum17185_failAssert1613litNum17932_failAssert1703litNum18672 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testJeanGuy2litNum17185_failAssert1613litNum17932_failAssert1703litNum18624_failAssert1844() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                    int[] backdoor = new int[]{ 5 };
                    IOrder order = new SubsetVarOrder(backdoor);
                    solver.setOrder(order);
                    IVecInt clause = new VecInt();
                    clause.push((-1)).push(6);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-3)).push(2).push(5);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-4)).push(5);
                    solver.addClause(clause);
                    solver.isSatisfiable();
                    org.junit.Assert.fail("testJeanGuy2litNum17185 should have thrown TimeoutException");
                }
                org.junit.Assert.fail("testJeanGuy2litNum17185_failAssert1613litNum17932 should have thrown TimeoutException");
            }
            org.junit.Assert.fail("testJeanGuy2litNum17185_failAssert1613litNum17932_failAssert1703litNum18624 should have thrown TimeoutException");
        } catch (TimeoutException expected) {
            Assert.assertEquals("Cannot decide the satisfiability", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testJeanGuy2litNum17185_failAssert1613litNum17932_failAssert1703litNum18651_failAssert1845() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                    int[] backdoor = new int[]{ 5 };
                    IOrder order = new SubsetVarOrder(backdoor);
                    solver.setOrder(order);
                    IVecInt clause = new VecInt();
                    clause.push((-1)).push(6);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-3)).push(3).push(5);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-3)).push(5);
                    solver.addClause(clause);
                    solver.isSatisfiable();
                    org.junit.Assert.fail("testJeanGuy2litNum17185 should have thrown TimeoutException");
                }
                org.junit.Assert.fail("testJeanGuy2litNum17185_failAssert1613litNum17932 should have thrown TimeoutException");
            }
            org.junit.Assert.fail("testJeanGuy2litNum17185_failAssert1613litNum17932_failAssert1703litNum18651 should have thrown TimeoutException");
        } catch (TimeoutException expected) {
            Assert.assertEquals("Cannot decide the satisfiability", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testJeanGuy2litNum17186_failAssert1614litNum17843_failAssert1711litNum19006_failAssert1846() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                    int[] backdoor = new int[]{ 5 };
                    IOrder order = new SubsetVarOrder(backdoor);
                    solver.setOrder(order);
                    IVecInt clause = new VecInt();
                    clause.push((-1)).push(4);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-2)).push(3).push(6);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-5)).push(5);
                    solver.addClause(clause);
                    solver.isSatisfiable();
                    org.junit.Assert.fail("testJeanGuy2litNum17186 should have thrown TimeoutException");
                }
                org.junit.Assert.fail("testJeanGuy2litNum17186_failAssert1614litNum17843 should have thrown TimeoutException");
            }
            org.junit.Assert.fail("testJeanGuy2litNum17186_failAssert1614litNum17843_failAssert1711litNum19006 should have thrown TimeoutException");
        } catch (TimeoutException expected) {
            Assert.assertEquals("Cannot decide the satisfiability", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testJeanGuy2litNum17185_failAssert1613litNum17932_failAssert1703litNum18663_failAssert1855() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                    int[] backdoor = new int[]{ 5 };
                    IOrder order = new SubsetVarOrder(backdoor);
                    solver.setOrder(order);
                    IVecInt clause = new VecInt();
                    clause.push((-1)).push(6);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-3)).push(3).push(5);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-4)).push(6);
                    solver.addClause(clause);
                    solver.isSatisfiable();
                    org.junit.Assert.fail("testJeanGuy2litNum17185 should have thrown TimeoutException");
                }
                org.junit.Assert.fail("testJeanGuy2litNum17185_failAssert1613litNum17932 should have thrown TimeoutException");
            }
            org.junit.Assert.fail("testJeanGuy2litNum17185_failAssert1613litNum17932_failAssert1703litNum18663 should have thrown TimeoutException");
        } catch (TimeoutException expected) {
            Assert.assertEquals("Cannot decide the satisfiability", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testJeanGuy2litNum17185_failAssert1613litNum17932_failAssert1703litNum18665_failAssert1856() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                    int[] backdoor = new int[]{ 5 };
                    IOrder order = new SubsetVarOrder(backdoor);
                    solver.setOrder(order);
                    IVecInt clause = new VecInt();
                    clause.push((-1)).push(6);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-3)).push(3).push(5);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-4)).push(4);
                    solver.addClause(clause);
                    solver.isSatisfiable();
                    org.junit.Assert.fail("testJeanGuy2litNum17185 should have thrown TimeoutException");
                }
                org.junit.Assert.fail("testJeanGuy2litNum17185_failAssert1613litNum17932 should have thrown TimeoutException");
            }
            org.junit.Assert.fail("testJeanGuy2litNum17185_failAssert1613litNum17932_failAssert1703litNum18665 should have thrown TimeoutException");
        } catch (TimeoutException expected) {
            Assert.assertEquals("Cannot decide the satisfiability", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testJeanGuy2litNum17185_failAssert1613litNum17944_failAssert1712litNum19702_failAssert1858() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                    int[] backdoor = new int[]{ 5 };
                    IOrder order = new SubsetVarOrder(backdoor);
                    solver.setOrder(order);
                    IVecInt clause = new VecInt();
                    clause.push((-1)).push(6);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-2)).push(4).push(5);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-4)).push(6);
                    solver.addClause(clause);
                    solver.isSatisfiable();
                    org.junit.Assert.fail("testJeanGuy2litNum17185 should have thrown TimeoutException");
                }
                org.junit.Assert.fail("testJeanGuy2litNum17185_failAssert1613litNum17944 should have thrown TimeoutException");
            }
            org.junit.Assert.fail("testJeanGuy2litNum17185_failAssert1613litNum17944_failAssert1712litNum19702 should have thrown TimeoutException");
        } catch (TimeoutException expected) {
            Assert.assertEquals("Cannot decide the satisfiability", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testJeanGuy2litNum17185_failAssert1613litNum17944_failAssert1712litNum19663_failAssert1864() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                    int[] backdoor = new int[]{ 5 };
                    IOrder order = new SubsetVarOrder(backdoor);
                    solver.setOrder(order);
                    IVecInt clause = new VecInt();
                    clause.push((-1)).push(6);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-2)).push(4).push(4);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-4)).push(5);
                    solver.addClause(clause);
                    solver.isSatisfiable();
                    org.junit.Assert.fail("testJeanGuy2litNum17185 should have thrown TimeoutException");
                }
                org.junit.Assert.fail("testJeanGuy2litNum17185_failAssert1613litNum17944 should have thrown TimeoutException");
            }
            org.junit.Assert.fail("testJeanGuy2litNum17185_failAssert1613litNum17944_failAssert1712litNum19663 should have thrown TimeoutException");
        } catch (TimeoutException expected) {
            Assert.assertEquals("Cannot decide the satisfiability", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testJeanGuy2litNum17178_failAssert1608litNum17841_failAssert1707litNum18731_failAssert1865() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                    int[] backdoor = new int[]{ 0 };
                    IOrder order = new SubsetVarOrder(backdoor);
                    solver.setOrder(order);
                    IVecInt clause = new VecInt();
                    clause.push((-1)).push(5);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-2)).push(4).push(6);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-4)).push(5);
                    solver.addClause(clause);
                    solver.isSatisfiable();
                    org.junit.Assert.fail("testJeanGuy2litNum17178 should have thrown TimeoutException");
                }
                org.junit.Assert.fail("testJeanGuy2litNum17178_failAssert1608litNum17841 should have thrown TimeoutException");
            }
            org.junit.Assert.fail("testJeanGuy2litNum17178_failAssert1608litNum17841_failAssert1707litNum18731 should have thrown TimeoutException");
        } catch (TimeoutException expected) {
            Assert.assertEquals("Cannot decide the satisfiability", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testJeanGuy2litNum17178_failAssert1608litNum17841_failAssert1707litNum18733_failAssert1866() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                    int[] backdoor = new int[]{ 0 };
                    IOrder order = new SubsetVarOrder(backdoor);
                    solver.setOrder(order);
                    IVecInt clause = new VecInt();
                    clause.push((-1)).push(5);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-2)).push(4).push(4);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-4)).push(5);
                    solver.addClause(clause);
                    solver.isSatisfiable();
                    org.junit.Assert.fail("testJeanGuy2litNum17178 should have thrown TimeoutException");
                }
                org.junit.Assert.fail("testJeanGuy2litNum17178_failAssert1608litNum17841 should have thrown TimeoutException");
            }
            org.junit.Assert.fail("testJeanGuy2litNum17178_failAssert1608litNum17841_failAssert1707litNum18733 should have thrown TimeoutException");
        } catch (TimeoutException expected) {
            Assert.assertEquals("Cannot decide the satisfiability", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testJeanGuy2litNum17186_failAssert1614litNum17822_failAssert1697litNum18546_failAssert1867() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                    int[] backdoor = new int[]{ 5 };
                    IOrder order = new SubsetVarOrder(backdoor);
                    solver.setOrder(order);
                    IVecInt clause = new VecInt();
                    clause.push((-1)).push(4);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-2)).push(3).push(4);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-3)).push(5);
                    solver.addClause(clause);
                    solver.isSatisfiable();
                    org.junit.Assert.fail("testJeanGuy2litNum17186 should have thrown TimeoutException");
                }
                org.junit.Assert.fail("testJeanGuy2litNum17186_failAssert1614litNum17822 should have thrown TimeoutException");
            }
            org.junit.Assert.fail("testJeanGuy2litNum17186_failAssert1614litNum17822_failAssert1697litNum18546 should have thrown TimeoutException");
        } catch (TimeoutException expected) {
            Assert.assertEquals("Cannot decide the satisfiability", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testJeanGuy2litNum17178_failAssert1608litNum17841_failAssert1707litNum18743_failAssert1869() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                    int[] backdoor = new int[]{ 0 };
                    IOrder order = new SubsetVarOrder(backdoor);
                    solver.setOrder(order);
                    IVecInt clause = new VecInt();
                    clause.push((-1)).push(5);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-2)).push(4).push(5);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-3)).push(5);
                    solver.addClause(clause);
                    solver.isSatisfiable();
                    org.junit.Assert.fail("testJeanGuy2litNum17178 should have thrown TimeoutException");
                }
                org.junit.Assert.fail("testJeanGuy2litNum17178_failAssert1608litNum17841 should have thrown TimeoutException");
            }
            org.junit.Assert.fail("testJeanGuy2litNum17178_failAssert1608litNum17841_failAssert1707litNum18743 should have thrown TimeoutException");
        } catch (TimeoutException expected) {
            Assert.assertEquals("Cannot decide the satisfiability", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testJeanGuy2litNum17186_failAssert1614litNum17822_failAssert1697litNum18556_failAssert1873() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                    int[] backdoor = new int[]{ 5 };
                    IOrder order = new SubsetVarOrder(backdoor);
                    solver.setOrder(order);
                    IVecInt clause = new VecInt();
                    clause.push((-1)).push(4);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-2)).push(3).push(4);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-4)).push(4);
                    solver.addClause(clause);
                    solver.isSatisfiable();
                    org.junit.Assert.fail("testJeanGuy2litNum17186 should have thrown TimeoutException");
                }
                org.junit.Assert.fail("testJeanGuy2litNum17186_failAssert1614litNum17822 should have thrown TimeoutException");
            }
            org.junit.Assert.fail("testJeanGuy2litNum17186_failAssert1614litNum17822_failAssert1697litNum18556 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("5", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testJeanGuy2litNum17178_failAssert1608litNum17841_failAssert1707litNum18742_failAssert1874() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                    int[] backdoor = new int[]{ 0 };
                    IOrder order = new SubsetVarOrder(backdoor);
                    solver.setOrder(order);
                    IVecInt clause = new VecInt();
                    clause.push((-1)).push(5);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-2)).push(4).push(5);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-5)).push(5);
                    solver.addClause(clause);
                    solver.isSatisfiable();
                    org.junit.Assert.fail("testJeanGuy2litNum17178 should have thrown TimeoutException");
                }
                org.junit.Assert.fail("testJeanGuy2litNum17178_failAssert1608litNum17841 should have thrown TimeoutException");
            }
            org.junit.Assert.fail("testJeanGuy2litNum17178_failAssert1608litNum17841_failAssert1707litNum18742 should have thrown TimeoutException");
        } catch (TimeoutException expected) {
            Assert.assertEquals("Cannot decide the satisfiability", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testJeanGuy2litNum17185_failAssert1613litNum17944_failAssert1712litNum19685_failAssert1881() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                    int[] backdoor = new int[]{ 5 };
                    IOrder order = new SubsetVarOrder(backdoor);
                    solver.setOrder(order);
                    IVecInt clause = new VecInt();
                    clause.push((-1)).push(6);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-2)).push(4).push(5);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-3)).push(5);
                    solver.addClause(clause);
                    solver.isSatisfiable();
                    org.junit.Assert.fail("testJeanGuy2litNum17185 should have thrown TimeoutException");
                }
                org.junit.Assert.fail("testJeanGuy2litNum17185_failAssert1613litNum17944 should have thrown TimeoutException");
            }
            org.junit.Assert.fail("testJeanGuy2litNum17185_failAssert1613litNum17944_failAssert1712litNum19685 should have thrown TimeoutException");
        } catch (TimeoutException expected) {
            Assert.assertEquals("Cannot decide the satisfiability", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testJeanGuy2litNum17178_failAssert1608litNum17883_failAssert1731litNum19305_failAssert1891() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                    int[] backdoor = new int[]{ 0 };
                    IOrder order = new SubsetVarOrder(backdoor);
                    solver.setOrder(order);
                    IVecInt clause = new VecInt();
                    clause.push((-1)).push(5);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-2)).push(2).push(5);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-5)).push(5);
                    solver.addClause(clause);
                    solver.isSatisfiable();
                    org.junit.Assert.fail("testJeanGuy2litNum17178 should have thrown TimeoutException");
                }
                org.junit.Assert.fail("testJeanGuy2litNum17178_failAssert1608litNum17883 should have thrown TimeoutException");
            }
            org.junit.Assert.fail("testJeanGuy2litNum17178_failAssert1608litNum17883_failAssert1731litNum19305 should have thrown TimeoutException");
        } catch (TimeoutException expected) {
            Assert.assertEquals("Cannot decide the satisfiability", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testJeanGuy2litNum17178_failAssert1608litNum17815_failAssert1709litNum18850_failAssert1895() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                    int[] backdoor = new int[]{ 0 };
                    IOrder order = new SubsetVarOrder(backdoor);
                    solver.setOrder(order);
                    IVecInt clause = new VecInt();
                    clause.push((-1)).push(5);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-3)).push(3).push(6);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-4)).push(5);
                    solver.addClause(clause);
                    solver.isSatisfiable();
                    org.junit.Assert.fail("testJeanGuy2litNum17178 should have thrown TimeoutException");
                }
                org.junit.Assert.fail("testJeanGuy2litNum17178_failAssert1608litNum17815 should have thrown TimeoutException");
            }
            org.junit.Assert.fail("testJeanGuy2litNum17178_failAssert1608litNum17815_failAssert1709litNum18850 should have thrown TimeoutException");
        } catch (TimeoutException expected) {
            Assert.assertEquals("Cannot decide the satisfiability", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testJeanGuy2litNum17178_failAssert1608litNum17815_failAssert1709litNum18836_failAssert1906() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                    int[] backdoor = new int[]{ 0 };
                    IOrder order = new SubsetVarOrder(backdoor);
                    solver.setOrder(order);
                    IVecInt clause = new VecInt();
                    clause.push((-1)).push(5);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-3)).push(2).push(5);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-4)).push(5);
                    solver.addClause(clause);
                    solver.isSatisfiable();
                    org.junit.Assert.fail("testJeanGuy2litNum17178 should have thrown TimeoutException");
                }
                org.junit.Assert.fail("testJeanGuy2litNum17178_failAssert1608litNum17815 should have thrown TimeoutException");
            }
            org.junit.Assert.fail("testJeanGuy2litNum17178_failAssert1608litNum17815_failAssert1709litNum18836 should have thrown TimeoutException");
        } catch (TimeoutException expected) {
            Assert.assertEquals("Cannot decide the satisfiability", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testJeanGuy2litNum17189_failAssert1617_add17915_failAssert1645_add19157_failAssert1924() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    SolverFactory.newGlucose();
                    SolverFactory.newGlucose();
                    Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                    int[] backdoor = new int[]{ 5 };
                    IOrder order = new SubsetVarOrder(backdoor);
                    solver.setOrder(order);
                    IVecInt clause = new VecInt();
                    clause.push((-1)).push(0);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-2)).push(3).push(5);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-4)).push(5);
                    solver.addClause(clause);
                    solver.isSatisfiable();
                    org.junit.Assert.fail("testJeanGuy2litNum17189 should have thrown IllegalArgumentException");
                }
                org.junit.Assert.fail("testJeanGuy2litNum17189_failAssert1617_add17915 should have thrown IllegalArgumentException");
            }
            org.junit.Assert.fail("testJeanGuy2litNum17189_failAssert1617_add17915_failAssert1645_add19157 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testJeanGuy2litNum17181_failAssert1610_add17718_failAssert1648_add19578_failAssert1930() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    SolverFactory.newGlucose();
                    SolverFactory.newGlucose();
                    Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                    int[] backdoor = new int[]{ 5 };
                    IOrder order = new SubsetVarOrder(backdoor);
                    solver.setOrder(order);
                    IVecInt clause = new VecInt();
                    clause.push((-0)).push(5);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-2)).push(3).push(5);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-4)).push(5);
                    solver.addClause(clause);
                    solver.isSatisfiable();
                    org.junit.Assert.fail("testJeanGuy2litNum17181 should have thrown IllegalArgumentException");
                }
                org.junit.Assert.fail("testJeanGuy2litNum17181_failAssert1610_add17718 should have thrown IllegalArgumentException");
            }
            org.junit.Assert.fail("testJeanGuy2litNum17181_failAssert1610_add17718_failAssert1648_add19578 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testJeanGuy2litNum17178_failAssert1608litNum17883_failAssert1731litNum19339_failAssert1936() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                    int[] backdoor = new int[]{ 0 };
                    IOrder order = new SubsetVarOrder(backdoor);
                    solver.setOrder(order);
                    IVecInt clause = new VecInt();
                    clause.push((-1)).push(5);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-2)).push(3).push(-778809);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-5)).push(5);
                    solver.addClause(clause);
                    solver.isSatisfiable();
                    org.junit.Assert.fail("testJeanGuy2litNum17178 should have thrown TimeoutException");
                }
                org.junit.Assert.fail("testJeanGuy2litNum17178_failAssert1608litNum17883 should have thrown TimeoutException");
            }
            org.junit.Assert.fail("testJeanGuy2litNum17178_failAssert1608litNum17883_failAssert1731litNum19339 should have thrown TimeoutException");
        } catch (TimeoutException expected) {
            Assert.assertEquals("Cannot decide the satisfiability", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testJeanGuy2litNum17185_failAssert1613litNum17955_failAssert1724litNum19838_failAssert1940() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                    int[] backdoor = new int[]{ 5 };
                    IOrder order = new SubsetVarOrder(backdoor);
                    solver.setOrder(order);
                    IVecInt clause = new VecInt();
                    clause.push((-1)).push(6);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-2)).push(3).push(6);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-44780624)).push(5);
                    solver.addClause(clause);
                    solver.isSatisfiable();
                    org.junit.Assert.fail("testJeanGuy2litNum17185 should have thrown TimeoutException");
                }
                org.junit.Assert.fail("testJeanGuy2litNum17185_failAssert1613litNum17955 should have thrown TimeoutException");
            }
            org.junit.Assert.fail("testJeanGuy2litNum17185_failAssert1613litNum17955_failAssert1724litNum19838 should have thrown TimeoutException");
        } catch (TimeoutException expected) {
            Assert.assertEquals("Cannot decide the satisfiability", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testJeanGuy2litNum17174_failAssert1605litNum18013_failAssert1656litNum18522_failAssert1947() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                    int[] backdoor = new int[]{ 6 };
                    IOrder order = new SubsetVarOrder(backdoor);
                    solver.setOrder(order);
                    IVecInt clause = new VecInt();
                    clause.push((-2)).push(6);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-2)).push(3).push(5);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-4)).push(5);
                    solver.addClause(clause);
                    solver.isSatisfiable();
                    org.junit.Assert.fail("testJeanGuy2litNum17174 should have thrown ArrayIndexOutOfBoundsException");
                }
                org.junit.Assert.fail("testJeanGuy2litNum17174_failAssert1605litNum18013 should have thrown ArrayIndexOutOfBoundsException");
            }
            org.junit.Assert.fail("testJeanGuy2litNum17174_failAssert1605litNum18013_failAssert1656litNum18522 should have thrown TimeoutException");
        } catch (TimeoutException expected) {
            Assert.assertEquals("Cannot decide the satisfiability", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testJeanGuy2litNum17174_failAssert1605litNum18040_failAssert1657litNum18721_failAssert1949() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                    int[] backdoor = new int[]{ 6 };
                    IOrder order = new SubsetVarOrder(backdoor);
                    solver.setOrder(order);
                    IVecInt clause = new VecInt();
                    clause.push((-1)).push(5);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-3)).push(2).push(5);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-4)).push(5);
                    solver.addClause(clause);
                    solver.isSatisfiable();
                    org.junit.Assert.fail("testJeanGuy2litNum17174 should have thrown ArrayIndexOutOfBoundsException");
                }
                org.junit.Assert.fail("testJeanGuy2litNum17174_failAssert1605litNum18040 should have thrown ArrayIndexOutOfBoundsException");
            }
            org.junit.Assert.fail("testJeanGuy2litNum17174_failAssert1605litNum18040_failAssert1657litNum18721 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("6", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testJeanGuy2litNum17174_failAssert1605litNum18013_failAssert1656litNum18525_failAssert1950() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                    int[] backdoor = new int[]{ 6 };
                    IOrder order = new SubsetVarOrder(backdoor);
                    solver.setOrder(order);
                    IVecInt clause = new VecInt();
                    clause.push((-2)).push(4);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-2)).push(3).push(5);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-4)).push(5);
                    solver.addClause(clause);
                    solver.isSatisfiable();
                    org.junit.Assert.fail("testJeanGuy2litNum17174 should have thrown ArrayIndexOutOfBoundsException");
                }
                org.junit.Assert.fail("testJeanGuy2litNum17174_failAssert1605litNum18013 should have thrown ArrayIndexOutOfBoundsException");
            }
            org.junit.Assert.fail("testJeanGuy2litNum17174_failAssert1605litNum18013_failAssert1656litNum18525 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("6", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testJeanGuy2litNum17174_failAssert1605litNum18040_failAssert1657litNum18750_failAssert1953() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                    int[] backdoor = new int[]{ 6 };
                    IOrder order = new SubsetVarOrder(backdoor);
                    solver.setOrder(order);
                    IVecInt clause = new VecInt();
                    clause.push((-1)).push(5);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-3)).push(3).push(5);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-3)).push(5);
                    solver.addClause(clause);
                    solver.isSatisfiable();
                    org.junit.Assert.fail("testJeanGuy2litNum17174 should have thrown ArrayIndexOutOfBoundsException");
                }
                org.junit.Assert.fail("testJeanGuy2litNum17174_failAssert1605litNum18040 should have thrown ArrayIndexOutOfBoundsException");
            }
            org.junit.Assert.fail("testJeanGuy2litNum17174_failAssert1605litNum18040_failAssert1657litNum18750 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("6", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testJeanGuy2litNum17174_failAssert1605litNum18040_failAssert1657litNum18773_failAssert1970() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    Solver<DataStructureFactory> solver = SolverFactory.newGlucose();
                    int[] backdoor = new int[]{ 6 };
                    IOrder order = new SubsetVarOrder(backdoor);
                    solver.setOrder(order);
                    IVecInt clause = new VecInt();
                    clause.push((-1)).push(5);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-3)).push(3).push(5);
                    solver.addClause(clause);
                    clause = new VecInt();
                    clause.push((-4)).push(4);
                    solver.addClause(clause);
                    solver.isSatisfiable();
                    org.junit.Assert.fail("testJeanGuy2litNum17174 should have thrown ArrayIndexOutOfBoundsException");
                }
                org.junit.Assert.fail("testJeanGuy2litNum17174_failAssert1605litNum18040 should have thrown ArrayIndexOutOfBoundsException");
            }
            org.junit.Assert.fail("testJeanGuy2litNum17174_failAssert1605litNum18040_failAssert1657litNum18773 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("6", expected.getMessage());
        }
    }
}

