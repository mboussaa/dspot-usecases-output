package org.sat4j;


import org.junit.Assert;
import org.junit.Test;
import org.sat4j.core.VecInt;
import org.sat4j.minisat.SolverFactory;
import org.sat4j.specs.ContradictionException;
import org.sat4j.specs.ISolver;
import org.sat4j.specs.TimeoutException;


public class AmplBugSAT43 {
    @Test(timeout = 30000)
    public void testNoDeclaredVariableslitNum4453_failAssert815() throws Exception, ContradictionException, TimeoutException {
        try {
            ISolver solver = SolverFactory.newDefault();
            solver.nVars();
            solver.realNumberOfVariables();
            for (int i = 0; i < 10; i++) {
                solver.nextFreeVarId(true);
            }
            solver.nVars();
            solver.realNumberOfVariables();
            solver.addClause(new VecInt(new int[]{ 0, 2, 3 }));
            int[] model1 = solver.findModel();
            int[] model2 = solver.modelWithInternalVariables();
            org.junit.Assert.fail("testNoDeclaredVariableslitNum4453 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testNoDeclaredVariableslitNum4454_failAssert816() throws Exception, ContradictionException, TimeoutException {
        try {
            ISolver solver = SolverFactory.newDefault();
            solver.nVars();
            solver.realNumberOfVariables();
            for (int i = 0; i < 10; i++) {
                solver.nextFreeVarId(true);
            }
            solver.nVars();
            solver.realNumberOfVariables();
            solver.addClause(new VecInt(new int[]{ Integer.MAX_VALUE, 2, 3 }));
            int[] model1 = solver.findModel();
            int[] model2 = solver.modelWithInternalVariables();
            org.junit.Assert.fail("testNoDeclaredVariableslitNum4454 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testNoDeclaredVariableslitNum4455_failAssert817() throws Exception, ContradictionException, TimeoutException {
        try {
            ISolver solver = SolverFactory.newDefault();
            solver.nVars();
            solver.realNumberOfVariables();
            for (int i = 0; i < 10; i++) {
                solver.nextFreeVarId(true);
            }
            solver.nVars();
            solver.realNumberOfVariables();
            solver.addClause(new VecInt(new int[]{ Integer.MIN_VALUE, 2, 3 }));
            int[] model1 = solver.findModel();
            int[] model2 = solver.modelWithInternalVariables();
            org.junit.Assert.fail("testNoDeclaredVariableslitNum4455 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-2147483648", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testNoDeclaredVariableslitNum4459_failAssert818() throws Exception, ContradictionException, TimeoutException {
        try {
            ISolver solver = SolverFactory.newDefault();
            solver.nVars();
            solver.realNumberOfVariables();
            for (int i = 0; i < 10; i++) {
                solver.nextFreeVarId(true);
            }
            solver.nVars();
            solver.realNumberOfVariables();
            solver.addClause(new VecInt(new int[]{ 1, Integer.MAX_VALUE, 3 }));
            int[] model1 = solver.findModel();
            int[] model2 = solver.modelWithInternalVariables();
            org.junit.Assert.fail("testNoDeclaredVariableslitNum4459 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testNoDeclaredVariableslitNum4461_failAssert820() throws Exception, ContradictionException, TimeoutException {
        try {
            ISolver solver = SolverFactory.newDefault();
            solver.nVars();
            solver.realNumberOfVariables();
            for (int i = 0; i < 10; i++) {
                solver.nextFreeVarId(true);
            }
            solver.nVars();
            solver.realNumberOfVariables();
            solver.addClause(new VecInt(new int[]{ 1, 0, 3 }));
            int[] model1 = solver.findModel();
            int[] model2 = solver.modelWithInternalVariables();
            org.junit.Assert.fail("testNoDeclaredVariableslitNum4461 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testNoDeclaredVariableslitNum4466_failAssert823() throws Exception, ContradictionException, TimeoutException {
        try {
            ISolver solver = SolverFactory.newDefault();
            solver.nVars();
            solver.realNumberOfVariables();
            for (int i = 0; i < 10; i++) {
                solver.nextFreeVarId(true);
            }
            solver.nVars();
            solver.realNumberOfVariables();
            solver.addClause(new VecInt(new int[]{ 1, 2, Integer.MIN_VALUE }));
            int[] model1 = solver.findModel();
            int[] model2 = solver.modelWithInternalVariables();
            org.junit.Assert.fail("testNoDeclaredVariableslitNum4466 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-2147483648", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testNoDeclaredVariableslitNum4453_failAssert815litNum4579_failAssert825() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                ISolver solver = SolverFactory.newDefault();
                solver.nVars();
                solver.realNumberOfVariables();
                for (int i = 0; i < 11; i++) {
                    solver.nextFreeVarId(true);
                }
                solver.nVars();
                solver.realNumberOfVariables();
                solver.addClause(new VecInt(new int[]{ 0, 2, 3 }));
                int[] model1 = solver.findModel();
                int[] model2 = solver.modelWithInternalVariables();
                org.junit.Assert.fail("testNoDeclaredVariableslitNum4453 should have thrown IllegalArgumentException");
            }
            org.junit.Assert.fail("testNoDeclaredVariableslitNum4453_failAssert815litNum4579 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testNoDeclaredVariableslitNum4453_failAssert815litNum4596_failAssert827() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                ISolver solver = SolverFactory.newDefault();
                solver.nVars();
                solver.realNumberOfVariables();
                for (int i = 0; i < (Integer.MIN_VALUE); i++) {
                    solver.nextFreeVarId(true);
                }
                solver.nVars();
                solver.realNumberOfVariables();
                solver.addClause(new VecInt(new int[]{ 0, 2, 3 }));
                int[] model1 = solver.findModel();
                int[] model2 = solver.modelWithInternalVariables();
                org.junit.Assert.fail("testNoDeclaredVariableslitNum4453 should have thrown IllegalArgumentException");
            }
            org.junit.Assert.fail("testNoDeclaredVariableslitNum4453_failAssert815litNum4596 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testNoDeclaredVariableslitNum4454_failAssert816litNum4579_failAssert851() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                ISolver solver = SolverFactory.newDefault();
                solver.nVars();
                solver.realNumberOfVariables();
                for (int i = 1; i < 10; i++) {
                    solver.nextFreeVarId(true);
                }
                solver.nVars();
                solver.realNumberOfVariables();
                solver.addClause(new VecInt(new int[]{ Integer.MAX_VALUE, 2, 3 }));
                int[] model1 = solver.findModel();
                int[] model2 = solver.modelWithInternalVariables();
                org.junit.Assert.fail("testNoDeclaredVariableslitNum4454 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testNoDeclaredVariableslitNum4454_failAssert816litNum4579 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testNoDeclaredVariableslitNum4454_failAssert816litNum4588_failAssert853() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                ISolver solver = SolverFactory.newDefault();
                solver.nVars();
                solver.realNumberOfVariables();
                for (int i = Integer.MAX_VALUE; i < 10; i++) {
                    solver.nextFreeVarId(true);
                }
                solver.nVars();
                solver.realNumberOfVariables();
                solver.addClause(new VecInt(new int[]{ Integer.MAX_VALUE, 2, 3 }));
                int[] model1 = solver.findModel();
                int[] model2 = solver.modelWithInternalVariables();
                org.junit.Assert.fail("testNoDeclaredVariableslitNum4454 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testNoDeclaredVariableslitNum4454_failAssert816litNum4588 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testNoDeclaredVariableslitNum4455_failAssert817litNum4691_failAssert881() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                ISolver solver = SolverFactory.newDefault();
                solver.nVars();
                solver.realNumberOfVariables();
                for (int i = 1; i < 10; i++) {
                    solver.nextFreeVarId(true);
                }
                solver.nVars();
                solver.realNumberOfVariables();
                solver.addClause(new VecInt(new int[]{ Integer.MIN_VALUE, 2, 3 }));
                int[] model1 = solver.findModel();
                int[] model2 = solver.modelWithInternalVariables();
                org.junit.Assert.fail("testNoDeclaredVariableslitNum4455 should have thrown ArrayIndexOutOfBoundsException");
            }
            org.junit.Assert.fail("testNoDeclaredVariableslitNum4455_failAssert817litNum4691 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-2147483648", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testNoDeclaredVariableslitNum4455_failAssert817litNum4698_failAssert883() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                ISolver solver = SolverFactory.newDefault();
                solver.nVars();
                solver.realNumberOfVariables();
                for (int i = Integer.MAX_VALUE; i < 10; i++) {
                    solver.nextFreeVarId(true);
                }
                solver.nVars();
                solver.realNumberOfVariables();
                solver.addClause(new VecInt(new int[]{ Integer.MIN_VALUE, 2, 3 }));
                int[] model1 = solver.findModel();
                int[] model2 = solver.modelWithInternalVariables();
                org.junit.Assert.fail("testNoDeclaredVariableslitNum4455 should have thrown ArrayIndexOutOfBoundsException");
            }
            org.junit.Assert.fail("testNoDeclaredVariableslitNum4455_failAssert817litNum4698 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-2147483648", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testNoDeclaredVariableslitNum4459_failAssert818litNum4577_failAssert912() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                ISolver solver = SolverFactory.newDefault();
                solver.nVars();
                solver.realNumberOfVariables();
                for (int i = 1; i < 10; i++) {
                    solver.nextFreeVarId(true);
                }
                solver.nVars();
                solver.realNumberOfVariables();
                solver.addClause(new VecInt(new int[]{ 1, Integer.MAX_VALUE, 3 }));
                int[] model1 = solver.findModel();
                int[] model2 = solver.modelWithInternalVariables();
                org.junit.Assert.fail("testNoDeclaredVariableslitNum4459 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testNoDeclaredVariableslitNum4459_failAssert818litNum4577 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testNoDeclaredVariableslitNum4459_failAssert818litNum4585_failAssert914() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                ISolver solver = SolverFactory.newDefault();
                solver.nVars();
                solver.realNumberOfVariables();
                for (int i = Integer.MAX_VALUE; i < 10; i++) {
                    solver.nextFreeVarId(true);
                }
                solver.nVars();
                solver.realNumberOfVariables();
                solver.addClause(new VecInt(new int[]{ 1, Integer.MAX_VALUE, 3 }));
                int[] model1 = solver.findModel();
                int[] model2 = solver.modelWithInternalVariables();
                org.junit.Assert.fail("testNoDeclaredVariableslitNum4459 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testNoDeclaredVariableslitNum4459_failAssert818litNum4585 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testNoDeclaredVariableslitNum4461_failAssert820litNum4681_failAssert941() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                ISolver solver = SolverFactory.newDefault();
                solver.nVars();
                solver.realNumberOfVariables();
                for (int i = 0; i < 11; i++) {
                    solver.nextFreeVarId(true);
                }
                solver.nVars();
                solver.realNumberOfVariables();
                solver.addClause(new VecInt(new int[]{ 1, 0, 3 }));
                int[] model1 = solver.findModel();
                int[] model2 = solver.modelWithInternalVariables();
                org.junit.Assert.fail("testNoDeclaredVariableslitNum4461 should have thrown IllegalArgumentException");
            }
            org.junit.Assert.fail("testNoDeclaredVariableslitNum4461_failAssert820litNum4681 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testNoDeclaredVariableslitNum4461_failAssert820litNum4687_failAssert943() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                ISolver solver = SolverFactory.newDefault();
                solver.nVars();
                solver.realNumberOfVariables();
                for (int i = 0; i < (Integer.MIN_VALUE); i++) {
                    solver.nextFreeVarId(true);
                }
                solver.nVars();
                solver.realNumberOfVariables();
                solver.addClause(new VecInt(new int[]{ 1, 0, 3 }));
                int[] model1 = solver.findModel();
                int[] model2 = solver.modelWithInternalVariables();
                org.junit.Assert.fail("testNoDeclaredVariableslitNum4461 should have thrown IllegalArgumentException");
            }
            org.junit.Assert.fail("testNoDeclaredVariableslitNum4461_failAssert820litNum4687 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testNoDeclaredVariableslitNum4461_failAssert820_add4740_failAssert961() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                ISolver solver = SolverFactory.newDefault();
                solver.nVars();
                solver.realNumberOfVariables();
                for (int i = 0; i < 10; i++) {
                    solver.nextFreeVarId(true);
                }
                solver.nVars();
                solver.nVars();
                solver.realNumberOfVariables();
                solver.addClause(new VecInt(new int[]{ 1, 0, 3 }));
                int[] model1 = solver.findModel();
                int[] model2 = solver.modelWithInternalVariables();
                org.junit.Assert.fail("testNoDeclaredVariableslitNum4461 should have thrown IllegalArgumentException");
            }
            org.junit.Assert.fail("testNoDeclaredVariableslitNum4461_failAssert820_add4740 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testNoDeclaredVariableslitNum4455_failAssert817litNum4698_failAssert883_add5353_failAssert995() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    ISolver solver = SolverFactory.newDefault();
                    solver.nVars();
                    solver.realNumberOfVariables();
                    for (int i = Integer.MAX_VALUE; i < 10; i++) {
                        solver.nextFreeVarId(true);
                    }
                    solver.nVars();
                    solver.realNumberOfVariables();
                    solver.addClause(new VecInt(new int[]{ Integer.MIN_VALUE, 2, 3 }));
                    solver.addClause(new VecInt(new int[]{ Integer.MIN_VALUE, 2, 3 }));
                    int[] model1 = solver.findModel();
                    int[] model2 = solver.modelWithInternalVariables();
                    org.junit.Assert.fail("testNoDeclaredVariableslitNum4455 should have thrown ArrayIndexOutOfBoundsException");
                }
                org.junit.Assert.fail("testNoDeclaredVariableslitNum4455_failAssert817litNum4698 should have thrown ArrayIndexOutOfBoundsException");
            }
            org.junit.Assert.fail("testNoDeclaredVariableslitNum4455_failAssert817litNum4698_failAssert883_add5353 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-2147483648", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testNoDeclaredVariableslitNum4459_failAssert818litNum4585_failAssert914_add5284_failAssert996() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    ISolver solver = SolverFactory.newDefault();
                    solver.nVars();
                    solver.realNumberOfVariables();
                    for (int i = Integer.MAX_VALUE; i < 10; i++) {
                        solver.nextFreeVarId(true);
                    }
                    solver.nVars();
                    solver.realNumberOfVariables();
                    solver.addClause(new VecInt(new int[]{ 1, Integer.MAX_VALUE, 3 }));
                    solver.addClause(new VecInt(new int[]{ 1, Integer.MAX_VALUE, 3 }));
                    int[] model1 = solver.findModel();
                    int[] model2 = solver.modelWithInternalVariables();
                    org.junit.Assert.fail("testNoDeclaredVariableslitNum4459 should have thrown NegativeArraySizeException");
                }
                org.junit.Assert.fail("testNoDeclaredVariableslitNum4459_failAssert818litNum4585 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testNoDeclaredVariableslitNum4459_failAssert818litNum4585_failAssert914_add5284 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testNoDeclaredVariableslitNum4454_failAssert816litNum4588_failAssert853_add5420_failAssert997() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    ISolver solver = SolverFactory.newDefault();
                    solver.nVars();
                    solver.realNumberOfVariables();
                    for (int i = Integer.MAX_VALUE; i < 10; i++) {
                        solver.nextFreeVarId(true);
                    }
                    solver.nVars();
                    solver.realNumberOfVariables();
                    solver.addClause(new VecInt(new int[]{ Integer.MAX_VALUE, 2, 3 }));
                    solver.addClause(new VecInt(new int[]{ Integer.MAX_VALUE, 2, 3 }));
                    int[] model1 = solver.findModel();
                    int[] model2 = solver.modelWithInternalVariables();
                    org.junit.Assert.fail("testNoDeclaredVariableslitNum4454 should have thrown NegativeArraySizeException");
                }
                org.junit.Assert.fail("testNoDeclaredVariableslitNum4454_failAssert816litNum4588 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testNoDeclaredVariableslitNum4454_failAssert816litNum4588_failAssert853_add5420 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testNoDeclaredVariableslitNum4455_failAssert817litNum4691_failAssert881_add5371_failAssert998() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    ISolver solver = SolverFactory.newDefault();
                    solver.nVars();
                    solver.realNumberOfVariables();
                    for (int i = 1; i < 10; i++) {
                        solver.nextFreeVarId(true);
                    }
                    solver.nVars();
                    solver.realNumberOfVariables();
                    solver.addClause(new VecInt(new int[]{ Integer.MIN_VALUE, 2, 3 }));
                    solver.addClause(new VecInt(new int[]{ Integer.MIN_VALUE, 2, 3 }));
                    int[] model1 = solver.findModel();
                    int[] model2 = solver.modelWithInternalVariables();
                    org.junit.Assert.fail("testNoDeclaredVariableslitNum4455 should have thrown ArrayIndexOutOfBoundsException");
                }
                org.junit.Assert.fail("testNoDeclaredVariableslitNum4455_failAssert817litNum4691 should have thrown ArrayIndexOutOfBoundsException");
            }
            org.junit.Assert.fail("testNoDeclaredVariableslitNum4455_failAssert817litNum4691_failAssert881_add5371 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-2147483648", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testNoDeclaredVariableslitNum4459_failAssert818litNum4577_failAssert912_add5210_failAssert1000() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    ISolver solver = SolverFactory.newDefault();
                    solver.nVars();
                    solver.realNumberOfVariables();
                    for (int i = 1; i < 10; i++) {
                        solver.nextFreeVarId(true);
                    }
                    solver.nVars();
                    solver.realNumberOfVariables();
                    solver.addClause(new VecInt(new int[]{ 1, Integer.MAX_VALUE, 3 }));
                    solver.addClause(new VecInt(new int[]{ 1, Integer.MAX_VALUE, 3 }));
                    int[] model1 = solver.findModel();
                    int[] model2 = solver.modelWithInternalVariables();
                    org.junit.Assert.fail("testNoDeclaredVariableslitNum4459 should have thrown NegativeArraySizeException");
                }
                org.junit.Assert.fail("testNoDeclaredVariableslitNum4459_failAssert818litNum4577 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testNoDeclaredVariableslitNum4459_failAssert818litNum4577_failAssert912_add5210 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testNoDeclaredVariableslitNum4454_failAssert816litNum4579_failAssert851_add5250_failAssert1001() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    ISolver solver = SolverFactory.newDefault();
                    solver.nVars();
                    solver.realNumberOfVariables();
                    for (int i = 1; i < 10; i++) {
                        solver.nextFreeVarId(true);
                    }
                    solver.nVars();
                    solver.realNumberOfVariables();
                    solver.addClause(new VecInt(new int[]{ Integer.MAX_VALUE, 2, 3 }));
                    solver.addClause(new VecInt(new int[]{ Integer.MAX_VALUE, 2, 3 }));
                    int[] model1 = solver.findModel();
                    int[] model2 = solver.modelWithInternalVariables();
                    org.junit.Assert.fail("testNoDeclaredVariableslitNum4454 should have thrown NegativeArraySizeException");
                }
                org.junit.Assert.fail("testNoDeclaredVariableslitNum4454_failAssert816litNum4579 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testNoDeclaredVariableslitNum4454_failAssert816litNum4579_failAssert851_add5250 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testNoDeclaredVariableslitNum4453_failAssert815litNum4596_failAssert827_add5344_failAssert1002() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    ISolver solver = SolverFactory.newDefault();
                    solver.nVars();
                    solver.realNumberOfVariables();
                    for (int i = 0; i < (Integer.MIN_VALUE); i++) {
                        solver.nextFreeVarId(true);
                    }
                    solver.nVars();
                    solver.realNumberOfVariables();
                    solver.addClause(new VecInt(new int[]{ 0, 2, 3 }));
                    solver.addClause(new VecInt(new int[]{ 0, 2, 3 }));
                    int[] model1 = solver.findModel();
                    int[] model2 = solver.modelWithInternalVariables();
                    org.junit.Assert.fail("testNoDeclaredVariableslitNum4453 should have thrown IllegalArgumentException");
                }
                org.junit.Assert.fail("testNoDeclaredVariableslitNum4453_failAssert815litNum4596 should have thrown IllegalArgumentException");
            }
            org.junit.Assert.fail("testNoDeclaredVariableslitNum4453_failAssert815litNum4596_failAssert827_add5344 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testNoDeclaredVariableslitNum4461_failAssert820litNum4687_failAssert943_add5239_failAssert1003() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    ISolver solver = SolverFactory.newDefault();
                    solver.nVars();
                    solver.realNumberOfVariables();
                    for (int i = 0; i < (Integer.MIN_VALUE); i++) {
                        solver.nextFreeVarId(true);
                    }
                    solver.nVars();
                    solver.realNumberOfVariables();
                    solver.addClause(new VecInt(new int[]{ 1, 0, 3 }));
                    solver.addClause(new VecInt(new int[]{ 1, 0, 3 }));
                    int[] model1 = solver.findModel();
                    int[] model2 = solver.modelWithInternalVariables();
                    org.junit.Assert.fail("testNoDeclaredVariableslitNum4461 should have thrown IllegalArgumentException");
                }
                org.junit.Assert.fail("testNoDeclaredVariableslitNum4461_failAssert820litNum4687 should have thrown IllegalArgumentException");
            }
            org.junit.Assert.fail("testNoDeclaredVariableslitNum4461_failAssert820litNum4687_failAssert943_add5239 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testNoDeclaredVariableslitNum4461_failAssert820_add4740_failAssert961_add5381_failAssert1005() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    ISolver solver = SolverFactory.newDefault();
                    solver.nVars();
                    solver.realNumberOfVariables();
                    for (int i = 0; i < 10; i++) {
                        solver.nextFreeVarId(true);
                    }
                    solver.nVars();
                    solver.nVars();
                    solver.realNumberOfVariables();
                    solver.addClause(new VecInt(new int[]{ 1, 0, 3 }));
                    solver.addClause(new VecInt(new int[]{ 1, 0, 3 }));
                    int[] model1 = solver.findModel();
                    int[] model2 = solver.modelWithInternalVariables();
                    org.junit.Assert.fail("testNoDeclaredVariableslitNum4461 should have thrown IllegalArgumentException");
                }
                org.junit.Assert.fail("testNoDeclaredVariableslitNum4461_failAssert820_add4740 should have thrown IllegalArgumentException");
            }
            org.junit.Assert.fail("testNoDeclaredVariableslitNum4461_failAssert820_add4740_failAssert961_add5381 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testNoDeclaredVariableslitNum4455_failAssert817litNum4698_failAssert883_add5338_failAssert1006() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    ISolver solver = SolverFactory.newDefault();
                    solver.nVars();
                    solver.realNumberOfVariables();
                    solver.realNumberOfVariables();
                    for (int i = Integer.MAX_VALUE; i < 10; i++) {
                        solver.nextFreeVarId(true);
                    }
                    solver.nVars();
                    solver.realNumberOfVariables();
                    solver.addClause(new VecInt(new int[]{ Integer.MIN_VALUE, 2, 3 }));
                    int[] model1 = solver.findModel();
                    int[] model2 = solver.modelWithInternalVariables();
                    org.junit.Assert.fail("testNoDeclaredVariableslitNum4455 should have thrown ArrayIndexOutOfBoundsException");
                }
                org.junit.Assert.fail("testNoDeclaredVariableslitNum4455_failAssert817litNum4698 should have thrown ArrayIndexOutOfBoundsException");
            }
            org.junit.Assert.fail("testNoDeclaredVariableslitNum4455_failAssert817litNum4698_failAssert883_add5338 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-2147483648", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testNoDeclaredVariableslitNum4461_failAssert820litNum4681_failAssert941litNum5149_failAssert1015() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    ISolver solver = SolverFactory.newDefault();
                    solver.nVars();
                    solver.realNumberOfVariables();
                    for (int i = 0; i < 11; i++) {
                        solver.nextFreeVarId(true);
                    }
                    solver.nVars();
                    solver.realNumberOfVariables();
                    solver.addClause(new VecInt(new int[]{ 0, 0, 3 }));
                    int[] model1 = solver.findModel();
                    int[] model2 = solver.modelWithInternalVariables();
                    org.junit.Assert.fail("testNoDeclaredVariableslitNum4461 should have thrown IllegalArgumentException");
                }
                org.junit.Assert.fail("testNoDeclaredVariableslitNum4461_failAssert820litNum4681 should have thrown IllegalArgumentException");
            }
            org.junit.Assert.fail("testNoDeclaredVariableslitNum4461_failAssert820litNum4681_failAssert941litNum5149 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testNoDeclaredVariableslitNum4461_failAssert820litNum4681_failAssert941litNum5162_failAssert1042() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    ISolver solver = SolverFactory.newDefault();
                    solver.nVars();
                    solver.realNumberOfVariables();
                    for (int i = 0; i < 11; i++) {
                        solver.nextFreeVarId(true);
                    }
                    solver.nVars();
                    solver.realNumberOfVariables();
                    solver.addClause(new VecInt(new int[]{ 223744804, 0, 3 }));
                    int[] model1 = solver.findModel();
                    int[] model2 = solver.modelWithInternalVariables();
                    org.junit.Assert.fail("testNoDeclaredVariableslitNum4461 should have thrown IllegalArgumentException");
                }
                org.junit.Assert.fail("testNoDeclaredVariableslitNum4461_failAssert820litNum4681 should have thrown IllegalArgumentException");
            }
            org.junit.Assert.fail("testNoDeclaredVariableslitNum4461_failAssert820litNum4681_failAssert941litNum5162 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testDeclaredVariableslitNum1318_failAssert398() throws Exception, ContradictionException, TimeoutException {
        try {
            ISolver solver = SolverFactory.newDefault();
            solver.newVar(Integer.MAX_VALUE);
            solver.nVars();
            solver.realNumberOfVariables();
            solver.addClause(new VecInt(new int[]{ 1, 2, 3 }));
            int[] model1 = solver.findModel();
            int[] model2 = solver.modelWithInternalVariables();
            for (int i = 0; i < 10; i++) {
                solver.nextFreeVarId(true);
            }
            solver.nVars();
            solver.nVars();
            solver.realNumberOfVariables();
            model1 = solver.findModel();
            System.out.println(new VecInt(model1));
            model2 = solver.modelWithInternalVariables();
            int[] clause = new int[]{ 14, 16, 19 };
            solver.addClause(new VecInt(clause));
            model1 = solver.findModel();
            System.out.println(new VecInt(model1));
            model2 = solver.modelWithInternalVariables();
            org.junit.Assert.fail("testDeclaredVariableslitNum1318 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testDeclaredVariableslitNum1319_failAssert399() throws Exception, ContradictionException, TimeoutException {
        try {
            ISolver solver = SolverFactory.newDefault();
            solver.newVar(Integer.MIN_VALUE);
            solver.nVars();
            solver.realNumberOfVariables();
            solver.addClause(new VecInt(new int[]{ 1, 2, 3 }));
            int[] model1 = solver.findModel();
            int[] model2 = solver.modelWithInternalVariables();
            for (int i = 0; i < 10; i++) {
                solver.nextFreeVarId(true);
            }
            solver.nVars();
            solver.nVars();
            solver.realNumberOfVariables();
            model1 = solver.findModel();
            System.out.println(new VecInt(model1));
            model2 = solver.modelWithInternalVariables();
            int[] clause = new int[]{ 14, 16, 19 };
            solver.addClause(new VecInt(clause));
            model1 = solver.findModel();
            System.out.println(new VecInt(model1));
            model2 = solver.modelWithInternalVariables();
            org.junit.Assert.fail("testDeclaredVariableslitNum1319 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testDeclaredVariableslitNum1321_failAssert400() throws Exception, ContradictionException, TimeoutException {
        try {
            ISolver solver = SolverFactory.newDefault();
            solver.newVar(-451333783);
            solver.nVars();
            solver.realNumberOfVariables();
            solver.addClause(new VecInt(new int[]{ 1, 2, 3 }));
            int[] model1 = solver.findModel();
            int[] model2 = solver.modelWithInternalVariables();
            for (int i = 0; i < 10; i++) {
                solver.nextFreeVarId(true);
            }
            solver.nVars();
            solver.nVars();
            solver.realNumberOfVariables();
            model1 = solver.findModel();
            System.out.println(new VecInt(model1));
            model2 = solver.modelWithInternalVariables();
            int[] clause = new int[]{ 14, 16, 19 };
            solver.addClause(new VecInt(clause));
            model1 = solver.findModel();
            System.out.println(new VecInt(model1));
            model2 = solver.modelWithInternalVariables();
            org.junit.Assert.fail("testDeclaredVariableslitNum1321 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testDeclaredVariableslitNum1323_failAssert401() throws Exception, ContradictionException, TimeoutException {
        try {
            ISolver solver = SolverFactory.newDefault();
            solver.newVar(10);
            solver.nVars();
            solver.realNumberOfVariables();
            solver.addClause(new VecInt(new int[]{ 0, 2, 3 }));
            int[] model1 = solver.findModel();
            int[] model2 = solver.modelWithInternalVariables();
            for (int i = 0; i < 10; i++) {
                solver.nextFreeVarId(true);
            }
            solver.nVars();
            solver.nVars();
            solver.realNumberOfVariables();
            model1 = solver.findModel();
            System.out.println(new VecInt(model1));
            model2 = solver.modelWithInternalVariables();
            int[] clause = new int[]{ 14, 16, 19 };
            solver.addClause(new VecInt(clause));
            model1 = solver.findModel();
            System.out.println(new VecInt(model1));
            model2 = solver.modelWithInternalVariables();
            org.junit.Assert.fail("testDeclaredVariableslitNum1323 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testDeclaredVariableslitNum1324_failAssert402() throws Exception, ContradictionException, TimeoutException {
        try {
            ISolver solver = SolverFactory.newDefault();
            solver.newVar(10);
            solver.nVars();
            solver.realNumberOfVariables();
            solver.addClause(new VecInt(new int[]{ Integer.MAX_VALUE, 2, 3 }));
            int[] model1 = solver.findModel();
            int[] model2 = solver.modelWithInternalVariables();
            for (int i = 0; i < 10; i++) {
                solver.nextFreeVarId(true);
            }
            solver.nVars();
            solver.nVars();
            solver.realNumberOfVariables();
            model1 = solver.findModel();
            System.out.println(new VecInt(model1));
            model2 = solver.modelWithInternalVariables();
            int[] clause = new int[]{ 14, 16, 19 };
            solver.addClause(new VecInt(clause));
            model1 = solver.findModel();
            System.out.println(new VecInt(model1));
            model2 = solver.modelWithInternalVariables();
            org.junit.Assert.fail("testDeclaredVariableslitNum1324 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testDeclaredVariableslitNum1325_failAssert403() throws Exception, ContradictionException, TimeoutException {
        try {
            ISolver solver = SolverFactory.newDefault();
            solver.newVar(10);
            solver.nVars();
            solver.realNumberOfVariables();
            solver.addClause(new VecInt(new int[]{ Integer.MIN_VALUE, 2, 3 }));
            int[] model1 = solver.findModel();
            int[] model2 = solver.modelWithInternalVariables();
            for (int i = 0; i < 10; i++) {
                solver.nextFreeVarId(true);
            }
            solver.nVars();
            solver.nVars();
            solver.realNumberOfVariables();
            model1 = solver.findModel();
            System.out.println(new VecInt(model1));
            model2 = solver.modelWithInternalVariables();
            int[] clause = new int[]{ 14, 16, 19 };
            solver.addClause(new VecInt(clause));
            model1 = solver.findModel();
            System.out.println(new VecInt(model1));
            model2 = solver.modelWithInternalVariables();
            org.junit.Assert.fail("testDeclaredVariableslitNum1325 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-2147483648", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testDeclaredVariableslitNum1329_failAssert404() throws Exception, ContradictionException, TimeoutException {
        try {
            ISolver solver = SolverFactory.newDefault();
            solver.newVar(10);
            solver.nVars();
            solver.realNumberOfVariables();
            solver.addClause(new VecInt(new int[]{ 1, Integer.MAX_VALUE, 3 }));
            int[] model1 = solver.findModel();
            int[] model2 = solver.modelWithInternalVariables();
            for (int i = 0; i < 10; i++) {
                solver.nextFreeVarId(true);
            }
            solver.nVars();
            solver.nVars();
            solver.realNumberOfVariables();
            model1 = solver.findModel();
            System.out.println(new VecInt(model1));
            model2 = solver.modelWithInternalVariables();
            int[] clause = new int[]{ 14, 16, 19 };
            solver.addClause(new VecInt(clause));
            model1 = solver.findModel();
            System.out.println(new VecInt(model1));
            model2 = solver.modelWithInternalVariables();
            org.junit.Assert.fail("testDeclaredVariableslitNum1329 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testDeclaredVariableslitNum1331_failAssert406() throws Exception, ContradictionException, TimeoutException {
        try {
            ISolver solver = SolverFactory.newDefault();
            solver.newVar(10);
            solver.nVars();
            solver.realNumberOfVariables();
            solver.addClause(new VecInt(new int[]{ 1, 0, 3 }));
            int[] model1 = solver.findModel();
            int[] model2 = solver.modelWithInternalVariables();
            for (int i = 0; i < 10; i++) {
                solver.nextFreeVarId(true);
            }
            solver.nVars();
            solver.nVars();
            solver.realNumberOfVariables();
            model1 = solver.findModel();
            System.out.println(new VecInt(model1));
            model2 = solver.modelWithInternalVariables();
            int[] clause = new int[]{ 14, 16, 19 };
            solver.addClause(new VecInt(clause));
            model1 = solver.findModel();
            System.out.println(new VecInt(model1));
            model2 = solver.modelWithInternalVariables();
            org.junit.Assert.fail("testDeclaredVariableslitNum1331 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testDeclaredVariableslitNum1337_failAssert409() throws Exception, ContradictionException, TimeoutException {
        try {
            ISolver solver = SolverFactory.newDefault();
            solver.newVar(10);
            solver.nVars();
            solver.realNumberOfVariables();
            solver.addClause(new VecInt(new int[]{ 1, 2, 0 }));
            int[] model1 = solver.findModel();
            int[] model2 = solver.modelWithInternalVariables();
            for (int i = 0; i < 10; i++) {
                solver.nextFreeVarId(true);
            }
            solver.nVars();
            solver.nVars();
            solver.realNumberOfVariables();
            model1 = solver.findModel();
            System.out.println(new VecInt(model1));
            model2 = solver.modelWithInternalVariables();
            int[] clause = new int[]{ 14, 16, 19 };
            solver.addClause(new VecInt(clause));
            model1 = solver.findModel();
            System.out.println(new VecInt(model1));
            model2 = solver.modelWithInternalVariables();
            org.junit.Assert.fail("testDeclaredVariableslitNum1337 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testDeclaredVariableslitNum1353_failAssert410() throws Exception, ContradictionException, TimeoutException {
        try {
            ISolver solver = SolverFactory.newDefault();
            solver.newVar(10);
            solver.nVars();
            solver.realNumberOfVariables();
            solver.addClause(new VecInt(new int[]{ 1, 2, 3 }));
            int[] model1 = solver.findModel();
            int[] model2 = solver.modelWithInternalVariables();
            for (int i = 0; i < 10; i++) {
                solver.nextFreeVarId(true);
            }
            solver.nVars();
            solver.nVars();
            solver.realNumberOfVariables();
            model1 = solver.findModel();
            System.out.println(new VecInt(model1));
            model2 = solver.modelWithInternalVariables();
            int[] clause = new int[]{ Integer.MAX_VALUE, 16, 19 };
            solver.addClause(new VecInt(clause));
            model1 = solver.findModel();
            System.out.println(new VecInt(model1));
            model2 = solver.modelWithInternalVariables();
            org.junit.Assert.fail("testDeclaredVariableslitNum1353 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testDeclaredVariableslitNum1355_failAssert412() throws Exception, ContradictionException, TimeoutException {
        try {
            ISolver solver = SolverFactory.newDefault();
            solver.newVar(10);
            solver.nVars();
            solver.realNumberOfVariables();
            solver.addClause(new VecInt(new int[]{ 1, 2, 3 }));
            int[] model1 = solver.findModel();
            int[] model2 = solver.modelWithInternalVariables();
            for (int i = 0; i < 10; i++) {
                solver.nextFreeVarId(true);
            }
            solver.nVars();
            solver.nVars();
            solver.realNumberOfVariables();
            model1 = solver.findModel();
            System.out.println(new VecInt(model1));
            model2 = solver.modelWithInternalVariables();
            int[] clause = new int[]{ 0, 16, 19 };
            solver.addClause(new VecInt(clause));
            model1 = solver.findModel();
            System.out.println(new VecInt(model1));
            model2 = solver.modelWithInternalVariables();
            org.junit.Assert.fail("testDeclaredVariableslitNum1355 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testDeclaredVariableslitNum1325_failAssert403_add1765_failAssert419() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                ISolver solver = SolverFactory.newDefault();
                solver.newVar(10);
                solver.nVars();
                solver.realNumberOfVariables();
                solver.addClause(new VecInt(new int[]{ Integer.MIN_VALUE, 2, 3 }));
                solver.addClause(new VecInt(new int[]{ Integer.MIN_VALUE, 2, 3 }));
                int[] model1 = solver.findModel();
                int[] model2 = solver.modelWithInternalVariables();
                for (int i = 0; i < 10; i++) {
                    solver.nextFreeVarId(true);
                }
                solver.nVars();
                solver.nVars();
                solver.realNumberOfVariables();
                model1 = solver.findModel();
                System.out.println(new VecInt(model1));
                model2 = solver.modelWithInternalVariables();
                int[] clause = new int[]{ 14, 16, 19 };
                solver.addClause(new VecInt(clause));
                model1 = solver.findModel();
                System.out.println(new VecInt(model1));
                model2 = solver.modelWithInternalVariables();
                org.junit.Assert.fail("testDeclaredVariableslitNum1325 should have thrown ArrayIndexOutOfBoundsException");
            }
            org.junit.Assert.fail("testDeclaredVariableslitNum1325_failAssert403_add1765 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-2147483648", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testDeclaredVariableslitNum1329_failAssert404_add1807_failAssert420() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                ISolver solver = SolverFactory.newDefault();
                solver.newVar(10);
                solver.nVars();
                solver.realNumberOfVariables();
                solver.addClause(new VecInt(new int[]{ 1, Integer.MAX_VALUE, 3 }));
                solver.addClause(new VecInt(new int[]{ 1, Integer.MAX_VALUE, 3 }));
                int[] model1 = solver.findModel();
                int[] model2 = solver.modelWithInternalVariables();
                for (int i = 0; i < 10; i++) {
                    solver.nextFreeVarId(true);
                }
                solver.nVars();
                solver.nVars();
                solver.realNumberOfVariables();
                model1 = solver.findModel();
                System.out.println(new VecInt(model1));
                model2 = solver.modelWithInternalVariables();
                int[] clause = new int[]{ 14, 16, 19 };
                solver.addClause(new VecInt(clause));
                model1 = solver.findModel();
                System.out.println(new VecInt(model1));
                model2 = solver.modelWithInternalVariables();
                org.junit.Assert.fail("testDeclaredVariableslitNum1329 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testDeclaredVariableslitNum1329_failAssert404_add1807 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testDeclaredVariableslitNum1324_failAssert402_add1960_failAssert421() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                ISolver solver = SolverFactory.newDefault();
                solver.newVar(10);
                solver.nVars();
                solver.realNumberOfVariables();
                solver.addClause(new VecInt(new int[]{ Integer.MAX_VALUE, 2, 3 }));
                solver.addClause(new VecInt(new int[]{ Integer.MAX_VALUE, 2, 3 }));
                int[] model1 = solver.findModel();
                int[] model2 = solver.modelWithInternalVariables();
                for (int i = 0; i < 10; i++) {
                    solver.nextFreeVarId(true);
                }
                solver.nVars();
                solver.nVars();
                solver.realNumberOfVariables();
                model1 = solver.findModel();
                System.out.println(new VecInt(model1));
                model2 = solver.modelWithInternalVariables();
                int[] clause = new int[]{ 14, 16, 19 };
                solver.addClause(new VecInt(clause));
                model1 = solver.findModel();
                System.out.println(new VecInt(model1));
                model2 = solver.modelWithInternalVariables();
                org.junit.Assert.fail("testDeclaredVariableslitNum1324 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testDeclaredVariableslitNum1324_failAssert402_add1960 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testDeclaredVariableslitNum1337_failAssert409_add2197_failAssert424() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                ISolver solver = SolverFactory.newDefault();
                solver.newVar(10);
                solver.nVars();
                solver.realNumberOfVariables();
                solver.addClause(new VecInt(new int[]{ 1, 2, 0 }));
                int[] model1 = solver.findModel();
                int[] model2 = solver.modelWithInternalVariables();
                for (int i = 0; i < 10; i++) {
                    solver.nextFreeVarId(true);
                }
                solver.nVars();
                solver.nVars();
                solver.realNumberOfVariables();
                model1 = solver.findModel();
                System.out.println(new VecInt(model1));
                model2 = solver.modelWithInternalVariables();
                int[] clause = new int[]{ 14, 16, 19 };
                solver.addClause(new VecInt(clause));
                model1 = solver.findModel();
                System.out.println(new VecInt(model1));
                System.out.println(new VecInt(model1));
                model2 = solver.modelWithInternalVariables();
                org.junit.Assert.fail("testDeclaredVariableslitNum1337 should have thrown IllegalArgumentException");
            }
            org.junit.Assert.fail("testDeclaredVariableslitNum1337_failAssert409_add2197 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testDeclaredVariableslitNum1323_failAssert401_add2187_failAssert426() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                ISolver solver = SolverFactory.newDefault();
                solver.newVar(10);
                solver.nVars();
                solver.realNumberOfVariables();
                solver.addClause(new VecInt(new int[]{ 0, 2, 3 }));
                int[] model1 = solver.findModel();
                int[] model2 = solver.modelWithInternalVariables();
                for (int i = 0; i < 10; i++) {
                    solver.nextFreeVarId(true);
                }
                solver.nVars();
                solver.nVars();
                solver.realNumberOfVariables();
                model1 = solver.findModel();
                System.out.println(new VecInt(model1));
                model2 = solver.modelWithInternalVariables();
                int[] clause = new int[]{ 14, 16, 19 };
                solver.addClause(new VecInt(clause));
                model1 = solver.findModel();
                System.out.println(new VecInt(model1));
                System.out.println(new VecInt(model1));
                model2 = solver.modelWithInternalVariables();
                org.junit.Assert.fail("testDeclaredVariableslitNum1323 should have thrown IllegalArgumentException");
            }
            org.junit.Assert.fail("testDeclaredVariableslitNum1323_failAssert401_add2187 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testDeclaredVariableslitNum1355_failAssert412_add1992_failAssert430() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                ISolver solver = SolverFactory.newDefault();
                solver.newVar(10);
                solver.nVars();
                solver.realNumberOfVariables();
                solver.addClause(new VecInt(new int[]{ 1, 2, 3 }));
                int[] model1 = solver.findModel();
                int[] model2 = solver.modelWithInternalVariables();
                for (int i = 0; i < 10; i++) {
                    solver.nextFreeVarId(true);
                }
                solver.nVars();
                solver.nVars();
                solver.realNumberOfVariables();
                model1 = solver.findModel();
                System.out.println(new VecInt(model1));
                System.out.println(new VecInt(model1));
                model2 = solver.modelWithInternalVariables();
                int[] clause = new int[]{ 0, 16, 19 };
                solver.addClause(new VecInt(clause));
                model1 = solver.findModel();
                System.out.println(new VecInt(model1));
                model2 = solver.modelWithInternalVariables();
                org.junit.Assert.fail("testDeclaredVariableslitNum1355 should have thrown IllegalArgumentException");
            }
            org.junit.Assert.fail("testDeclaredVariableslitNum1355_failAssert412_add1992 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testDeclaredVariableslitNum1319_failAssert399_add2058_failAssert436() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                ISolver solver = SolverFactory.newDefault();
                solver.newVar(Integer.MIN_VALUE);
                solver.nVars();
                solver.realNumberOfVariables();
                solver.addClause(new VecInt(new int[]{ 1, 2, 3 }));
                int[] model1 = solver.findModel();
                int[] model2 = solver.modelWithInternalVariables();
                for (int i = 0; i < 10; i++) {
                    solver.nextFreeVarId(true);
                }
                solver.nVars();
                solver.nVars();
                solver.realNumberOfVariables();
                model1 = solver.findModel();
                System.out.println(new VecInt(model1));
                model2 = solver.modelWithInternalVariables();
                int[] clause = new int[]{ 14, 16, 19 };
                solver.addClause(new VecInt(clause));
                model1 = solver.findModel();
                System.out.println(new VecInt(model1));
                System.out.println(new VecInt(model1));
                model2 = solver.modelWithInternalVariables();
                org.junit.Assert.fail("testDeclaredVariableslitNum1319 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testDeclaredVariableslitNum1319_failAssert399_add2058 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testDeclaredVariableslitNum1318_failAssert398_add2228_failAssert437() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                ISolver solver = SolverFactory.newDefault();
                solver.newVar(Integer.MAX_VALUE);
                solver.nVars();
                solver.realNumberOfVariables();
                solver.addClause(new VecInt(new int[]{ 1, 2, 3 }));
                int[] model1 = solver.findModel();
                int[] model2 = solver.modelWithInternalVariables();
                for (int i = 0; i < 10; i++) {
                    solver.nextFreeVarId(true);
                }
                solver.nVars();
                solver.nVars();
                solver.realNumberOfVariables();
                model1 = solver.findModel();
                System.out.println(new VecInt(model1));
                model2 = solver.modelWithInternalVariables();
                int[] clause = new int[]{ 14, 16, 19 };
                solver.addClause(new VecInt(clause));
                model1 = solver.findModel();
                System.out.println(new VecInt(model1));
                System.out.println(new VecInt(model1));
                model2 = solver.modelWithInternalVariables();
                org.junit.Assert.fail("testDeclaredVariableslitNum1318 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testDeclaredVariableslitNum1318_failAssert398_add2228 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testDeclaredVariableslitNum1353_failAssert410_add1847_failAssert440() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                ISolver solver = SolverFactory.newDefault();
                solver.newVar(10);
                solver.nVars();
                solver.realNumberOfVariables();
                solver.addClause(new VecInt(new int[]{ 1, 2, 3 }));
                int[] model1 = solver.findModel();
                int[] model2 = solver.modelWithInternalVariables();
                for (int i = 0; i < 10; i++) {
                    solver.nextFreeVarId(true);
                }
                solver.nVars();
                solver.nVars();
                solver.realNumberOfVariables();
                model1 = solver.findModel();
                System.out.println(new VecInt(model1));
                System.out.println(new VecInt(model1));
                model2 = solver.modelWithInternalVariables();
                int[] clause = new int[]{ Integer.MAX_VALUE, 16, 19 };
                solver.addClause(new VecInt(clause));
                model1 = solver.findModel();
                System.out.println(new VecInt(model1));
                model2 = solver.modelWithInternalVariables();
                org.junit.Assert.fail("testDeclaredVariableslitNum1353 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testDeclaredVariableslitNum1353_failAssert410_add1847 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testDeclaredVariableslitNum1355_failAssert412_add1959_failAssert445() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                ISolver solver = SolverFactory.newDefault();
                solver.newVar(10);
                solver.nVars();
                solver.realNumberOfVariables();
                solver.addClause(new VecInt(new int[]{ 1, 2, 3 }));
                solver.addClause(new VecInt(new int[]{ 1, 2, 3 }));
                int[] model1 = solver.findModel();
                int[] model2 = solver.modelWithInternalVariables();
                for (int i = 0; i < 10; i++) {
                    solver.nextFreeVarId(true);
                }
                solver.nVars();
                solver.nVars();
                solver.realNumberOfVariables();
                model1 = solver.findModel();
                System.out.println(new VecInt(model1));
                model2 = solver.modelWithInternalVariables();
                int[] clause = new int[]{ 0, 16, 19 };
                solver.addClause(new VecInt(clause));
                model1 = solver.findModel();
                System.out.println(new VecInt(model1));
                model2 = solver.modelWithInternalVariables();
                org.junit.Assert.fail("testDeclaredVariableslitNum1355 should have thrown IllegalArgumentException");
            }
            org.junit.Assert.fail("testDeclaredVariableslitNum1355_failAssert412_add1959 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testDeclaredVariableslitNum1319_failAssert399_add2009_failAssert447() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                ISolver solver = SolverFactory.newDefault();
                solver.newVar(Integer.MIN_VALUE);
                solver.nVars();
                solver.realNumberOfVariables();
                solver.addClause(new VecInt(new int[]{ 1, 2, 3 }));
                solver.addClause(new VecInt(new int[]{ 1, 2, 3 }));
                int[] model1 = solver.findModel();
                int[] model2 = solver.modelWithInternalVariables();
                for (int i = 0; i < 10; i++) {
                    solver.nextFreeVarId(true);
                }
                solver.nVars();
                solver.nVars();
                solver.realNumberOfVariables();
                model1 = solver.findModel();
                System.out.println(new VecInt(model1));
                model2 = solver.modelWithInternalVariables();
                int[] clause = new int[]{ 14, 16, 19 };
                solver.addClause(new VecInt(clause));
                model1 = solver.findModel();
                System.out.println(new VecInt(model1));
                model2 = solver.modelWithInternalVariables();
                org.junit.Assert.fail("testDeclaredVariableslitNum1319 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testDeclaredVariableslitNum1319_failAssert399_add2009 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testDeclaredVariableslitNum1353_failAssert410_add1811_failAssert449() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                ISolver solver = SolverFactory.newDefault();
                solver.newVar(10);
                solver.nVars();
                solver.realNumberOfVariables();
                solver.addClause(new VecInt(new int[]{ 1, 2, 3 }));
                solver.addClause(new VecInt(new int[]{ 1, 2, 3 }));
                int[] model1 = solver.findModel();
                int[] model2 = solver.modelWithInternalVariables();
                for (int i = 0; i < 10; i++) {
                    solver.nextFreeVarId(true);
                }
                solver.nVars();
                solver.nVars();
                solver.realNumberOfVariables();
                model1 = solver.findModel();
                System.out.println(new VecInt(model1));
                model2 = solver.modelWithInternalVariables();
                int[] clause = new int[]{ Integer.MAX_VALUE, 16, 19 };
                solver.addClause(new VecInt(clause));
                model1 = solver.findModel();
                System.out.println(new VecInt(model1));
                model2 = solver.modelWithInternalVariables();
                org.junit.Assert.fail("testDeclaredVariableslitNum1353 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testDeclaredVariableslitNum1353_failAssert410_add1811 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testDeclaredVariableslitNum1321_failAssert400litNum1602_failAssert456() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                ISolver solver = SolverFactory.newDefault();
                solver.newVar(-451333783);
                solver.nVars();
                solver.realNumberOfVariables();
                solver.addClause(new VecInt(new int[]{ 1, 2, 4 }));
                int[] model1 = solver.findModel();
                int[] model2 = solver.modelWithInternalVariables();
                for (int i = 0; i < 10; i++) {
                    solver.nextFreeVarId(true);
                }
                solver.nVars();
                solver.nVars();
                solver.realNumberOfVariables();
                model1 = solver.findModel();
                System.out.println(new VecInt(model1));
                model2 = solver.modelWithInternalVariables();
                int[] clause = new int[]{ 14, 16, 19 };
                solver.addClause(new VecInt(clause));
                model1 = solver.findModel();
                System.out.println(new VecInt(model1));
                model2 = solver.modelWithInternalVariables();
                org.junit.Assert.fail("testDeclaredVariableslitNum1321 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testDeclaredVariableslitNum1321_failAssert400litNum1602 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testDeclaredVariableslitNum1321_failAssert400litNum1616_failAssert458() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                ISolver solver = SolverFactory.newDefault();
                solver.newVar(-451333783);
                solver.nVars();
                solver.realNumberOfVariables();
                solver.addClause(new VecInt(new int[]{ 1, 2, 0 }));
                int[] model1 = solver.findModel();
                int[] model2 = solver.modelWithInternalVariables();
                for (int i = 0; i < 10; i++) {
                    solver.nextFreeVarId(true);
                }
                solver.nVars();
                solver.nVars();
                solver.realNumberOfVariables();
                model1 = solver.findModel();
                System.out.println(new VecInt(model1));
                model2 = solver.modelWithInternalVariables();
                int[] clause = new int[]{ 14, 16, 19 };
                solver.addClause(new VecInt(clause));
                model1 = solver.findModel();
                System.out.println(new VecInt(model1));
                model2 = solver.modelWithInternalVariables();
                org.junit.Assert.fail("testDeclaredVariableslitNum1321 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testDeclaredVariableslitNum1321_failAssert400litNum1616 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testDeclaredVariableslitNum1321_failAssert400litNum1606_failAssert459() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                ISolver solver = SolverFactory.newDefault();
                solver.newVar(-451333783);
                solver.nVars();
                solver.realNumberOfVariables();
                solver.addClause(new VecInt(new int[]{ 1, 2, 2 }));
                int[] model1 = solver.findModel();
                int[] model2 = solver.modelWithInternalVariables();
                for (int i = 0; i < 10; i++) {
                    solver.nextFreeVarId(true);
                }
                solver.nVars();
                solver.nVars();
                solver.realNumberOfVariables();
                model1 = solver.findModel();
                System.out.println(new VecInt(model1));
                model2 = solver.modelWithInternalVariables();
                int[] clause = new int[]{ 14, 16, 19 };
                solver.addClause(new VecInt(clause));
                model1 = solver.findModel();
                System.out.println(new VecInt(model1));
                model2 = solver.modelWithInternalVariables();
                org.junit.Assert.fail("testDeclaredVariableslitNum1321 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testDeclaredVariableslitNum1321_failAssert400litNum1606 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testDeclaredVariableslitNum1321_failAssert400litNum1565_failAssert465() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                ISolver solver = SolverFactory.newDefault();
                solver.newVar(-451333783);
                solver.nVars();
                solver.realNumberOfVariables();
                solver.addClause(new VecInt(new int[]{ 2, 2, 3 }));
                int[] model1 = solver.findModel();
                int[] model2 = solver.modelWithInternalVariables();
                for (int i = 0; i < 10; i++) {
                    solver.nextFreeVarId(true);
                }
                solver.nVars();
                solver.nVars();
                solver.realNumberOfVariables();
                model1 = solver.findModel();
                System.out.println(new VecInt(model1));
                model2 = solver.modelWithInternalVariables();
                int[] clause = new int[]{ 14, 16, 19 };
                solver.addClause(new VecInt(clause));
                model1 = solver.findModel();
                System.out.println(new VecInt(model1));
                model2 = solver.modelWithInternalVariables();
                org.junit.Assert.fail("testDeclaredVariableslitNum1321 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testDeclaredVariableslitNum1321_failAssert400litNum1565 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testDeclaredVariableslitNum1321_failAssert400litNum1569_failAssert469() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                ISolver solver = SolverFactory.newDefault();
                solver.newVar(-451333783);
                solver.nVars();
                solver.realNumberOfVariables();
                solver.addClause(new VecInt(new int[]{ 0, 2, 3 }));
                int[] model1 = solver.findModel();
                int[] model2 = solver.modelWithInternalVariables();
                for (int i = 0; i < 10; i++) {
                    solver.nextFreeVarId(true);
                }
                solver.nVars();
                solver.nVars();
                solver.realNumberOfVariables();
                model1 = solver.findModel();
                System.out.println(new VecInt(model1));
                model2 = solver.modelWithInternalVariables();
                int[] clause = new int[]{ 14, 16, 19 };
                solver.addClause(new VecInt(clause));
                model1 = solver.findModel();
                System.out.println(new VecInt(model1));
                model2 = solver.modelWithInternalVariables();
                org.junit.Assert.fail("testDeclaredVariableslitNum1321 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testDeclaredVariableslitNum1321_failAssert400litNum1569 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testDeclaredVariableslitNum1321_failAssert400_add1747_failAssert516() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                ISolver solver = SolverFactory.newDefault();
                solver.newVar(-451333783);
                solver.nVars();
                solver.realNumberOfVariables();
                solver.addClause(new VecInt(new int[]{ 1, 2, 3 }));
                solver.addClause(new VecInt(new int[]{ 1, 2, 3 }));
                int[] model1 = solver.findModel();
                int[] model2 = solver.modelWithInternalVariables();
                for (int i = 0; i < 10; i++) {
                    solver.nextFreeVarId(true);
                }
                solver.nVars();
                solver.nVars();
                solver.realNumberOfVariables();
                model1 = solver.findModel();
                System.out.println(new VecInt(model1));
                model2 = solver.modelWithInternalVariables();
                int[] clause = new int[]{ 14, 16, 19 };
                solver.addClause(new VecInt(clause));
                model1 = solver.findModel();
                System.out.println(new VecInt(model1));
                model2 = solver.modelWithInternalVariables();
                org.junit.Assert.fail("testDeclaredVariableslitNum1321 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testDeclaredVariableslitNum1321_failAssert400_add1747 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testDeclaredVariableslitNum1353_failAssert410litNum1725_failAssert541() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                ISolver solver = SolverFactory.newDefault();
                solver.newVar(10);
                solver.nVars();
                solver.realNumberOfVariables();
                solver.addClause(new VecInt(new int[]{ 1, 2, 3 }));
                int[] model1 = solver.findModel();
                int[] model2 = solver.modelWithInternalVariables();
                for (int i = 0; i < 0; i++) {
                    solver.nextFreeVarId(true);
                }
                solver.nVars();
                solver.nVars();
                solver.realNumberOfVariables();
                model1 = solver.findModel();
                System.out.println(new VecInt(model1));
                model2 = solver.modelWithInternalVariables();
                int[] clause = new int[]{ Integer.MAX_VALUE, 16, 19 };
                solver.addClause(new VecInt(clause));
                model1 = solver.findModel();
                System.out.println(new VecInt(model1));
                model2 = solver.modelWithInternalVariables();
                org.junit.Assert.fail("testDeclaredVariableslitNum1353 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testDeclaredVariableslitNum1353_failAssert410litNum1725 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testDeclaredVariableslitNum1353_failAssert410litNum1585_failAssert545() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                ISolver solver = SolverFactory.newDefault();
                solver.newVar(0);
                solver.nVars();
                solver.realNumberOfVariables();
                solver.addClause(new VecInt(new int[]{ 1, 2, 3 }));
                int[] model1 = solver.findModel();
                int[] model2 = solver.modelWithInternalVariables();
                for (int i = 0; i < 10; i++) {
                    solver.nextFreeVarId(true);
                }
                solver.nVars();
                solver.nVars();
                solver.realNumberOfVariables();
                model1 = solver.findModel();
                System.out.println(new VecInt(model1));
                model2 = solver.modelWithInternalVariables();
                int[] clause = new int[]{ Integer.MAX_VALUE, 16, 19 };
                solver.addClause(new VecInt(clause));
                model1 = solver.findModel();
                System.out.println(new VecInt(model1));
                model2 = solver.modelWithInternalVariables();
                org.junit.Assert.fail("testDeclaredVariableslitNum1353 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testDeclaredVariableslitNum1353_failAssert410litNum1585 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testDeclaredVariableslitNum1353_failAssert410litNum1622_failAssert559() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                ISolver solver = SolverFactory.newDefault();
                solver.newVar(10);
                solver.nVars();
                solver.realNumberOfVariables();
                solver.addClause(new VecInt(new int[]{ 1, 1, 3 }));
                int[] model1 = solver.findModel();
                int[] model2 = solver.modelWithInternalVariables();
                for (int i = 0; i < 10; i++) {
                    solver.nextFreeVarId(true);
                }
                solver.nVars();
                solver.nVars();
                solver.realNumberOfVariables();
                model1 = solver.findModel();
                System.out.println(new VecInt(model1));
                model2 = solver.modelWithInternalVariables();
                int[] clause = new int[]{ Integer.MAX_VALUE, 16, 19 };
                solver.addClause(new VecInt(clause));
                model1 = solver.findModel();
                System.out.println(new VecInt(model1));
                model2 = solver.modelWithInternalVariables();
                org.junit.Assert.fail("testDeclaredVariableslitNum1353 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testDeclaredVariableslitNum1353_failAssert410litNum1622 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testDeclaredVariableslitNum1324_failAssert402litNum1796_failAssert580() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                ISolver solver = SolverFactory.newDefault();
                solver.newVar(0);
                solver.nVars();
                solver.realNumberOfVariables();
                solver.addClause(new VecInt(new int[]{ Integer.MAX_VALUE, 2, 3 }));
                int[] model1 = solver.findModel();
                int[] model2 = solver.modelWithInternalVariables();
                for (int i = 0; i < 10; i++) {
                    solver.nextFreeVarId(true);
                }
                solver.nVars();
                solver.nVars();
                solver.realNumberOfVariables();
                model1 = solver.findModel();
                System.out.println(new VecInt(model1));
                model2 = solver.modelWithInternalVariables();
                int[] clause = new int[]{ 14, 16, 19 };
                solver.addClause(new VecInt(clause));
                model1 = solver.findModel();
                System.out.println(new VecInt(model1));
                model2 = solver.modelWithInternalVariables();
                org.junit.Assert.fail("testDeclaredVariableslitNum1324 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testDeclaredVariableslitNum1324_failAssert402litNum1796 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testDeclaredVariableslitNum1329_failAssert404litNum1584_failAssert587() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                ISolver solver = SolverFactory.newDefault();
                solver.newVar(0);
                solver.nVars();
                solver.realNumberOfVariables();
                solver.addClause(new VecInt(new int[]{ 1, Integer.MAX_VALUE, 3 }));
                int[] model1 = solver.findModel();
                int[] model2 = solver.modelWithInternalVariables();
                for (int i = 0; i < 10; i++) {
                    solver.nextFreeVarId(true);
                }
                solver.nVars();
                solver.nVars();
                solver.realNumberOfVariables();
                model1 = solver.findModel();
                System.out.println(new VecInt(model1));
                model2 = solver.modelWithInternalVariables();
                int[] clause = new int[]{ 14, 16, 19 };
                solver.addClause(new VecInt(clause));
                model1 = solver.findModel();
                System.out.println(new VecInt(model1));
                model2 = solver.modelWithInternalVariables();
                org.junit.Assert.fail("testDeclaredVariableslitNum1329 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testDeclaredVariableslitNum1329_failAssert404litNum1584 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testDeclaredVariableslitNum1325_failAssert403_add1765_failAssert419_add3977_failAssert616() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    ISolver solver = SolverFactory.newDefault();
                    solver.newVar(10);
                    solver.nVars();
                    solver.realNumberOfVariables();
                    solver.addClause(new VecInt(new int[]{ Integer.MIN_VALUE, 2, 3 }));
                    solver.addClause(new VecInt(new int[]{ Integer.MIN_VALUE, 2, 3 }));
                    solver.addClause(new VecInt(new int[]{ Integer.MIN_VALUE, 2, 3 }));
                    int[] model1 = solver.findModel();
                    int[] model2 = solver.modelWithInternalVariables();
                    for (int i = 0; i < 10; i++) {
                        solver.nextFreeVarId(true);
                    }
                    solver.nVars();
                    solver.nVars();
                    solver.realNumberOfVariables();
                    model1 = solver.findModel();
                    System.out.println(new VecInt(model1));
                    model2 = solver.modelWithInternalVariables();
                    int[] clause = new int[]{ 14, 16, 19 };
                    solver.addClause(new VecInt(clause));
                    model1 = solver.findModel();
                    System.out.println(new VecInt(model1));
                    model2 = solver.modelWithInternalVariables();
                    org.junit.Assert.fail("testDeclaredVariableslitNum1325 should have thrown ArrayIndexOutOfBoundsException");
                }
                org.junit.Assert.fail("testDeclaredVariableslitNum1325_failAssert403_add1765 should have thrown ArrayIndexOutOfBoundsException");
            }
            org.junit.Assert.fail("testDeclaredVariableslitNum1325_failAssert403_add1765_failAssert419_add3977 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-2147483648", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testDeclaredVariableslitNum1329_failAssert404_add1807_failAssert420_add3668_failAssert618() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    ISolver solver = SolverFactory.newDefault();
                    solver.newVar(10);
                    solver.nVars();
                    solver.realNumberOfVariables();
                    solver.addClause(new VecInt(new int[]{ 1, Integer.MAX_VALUE, 3 }));
                    solver.addClause(new VecInt(new int[]{ 1, Integer.MAX_VALUE, 3 }));
                    solver.addClause(new VecInt(new int[]{ 1, Integer.MAX_VALUE, 3 }));
                    int[] model1 = solver.findModel();
                    int[] model2 = solver.modelWithInternalVariables();
                    for (int i = 0; i < 10; i++) {
                        solver.nextFreeVarId(true);
                    }
                    solver.nVars();
                    solver.nVars();
                    solver.realNumberOfVariables();
                    model1 = solver.findModel();
                    System.out.println(new VecInt(model1));
                    model2 = solver.modelWithInternalVariables();
                    int[] clause = new int[]{ 14, 16, 19 };
                    solver.addClause(new VecInt(clause));
                    model1 = solver.findModel();
                    System.out.println(new VecInt(model1));
                    model2 = solver.modelWithInternalVariables();
                    org.junit.Assert.fail("testDeclaredVariableslitNum1329 should have thrown NegativeArraySizeException");
                }
                org.junit.Assert.fail("testDeclaredVariableslitNum1329_failAssert404_add1807 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testDeclaredVariableslitNum1329_failAssert404_add1807_failAssert420_add3668 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testDeclaredVariableslitNum1324_failAssert402_add1960_failAssert421_add2946_failAssert620() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    ISolver solver = SolverFactory.newDefault();
                    solver.newVar(10);
                    solver.nVars();
                    solver.realNumberOfVariables();
                    solver.addClause(new VecInt(new int[]{ Integer.MAX_VALUE, 2, 3 }));
                    solver.addClause(new VecInt(new int[]{ Integer.MAX_VALUE, 2, 3 }));
                    solver.addClause(new VecInt(new int[]{ Integer.MAX_VALUE, 2, 3 }));
                    int[] model1 = solver.findModel();
                    int[] model2 = solver.modelWithInternalVariables();
                    for (int i = 0; i < 10; i++) {
                        solver.nextFreeVarId(true);
                    }
                    solver.nVars();
                    solver.nVars();
                    solver.realNumberOfVariables();
                    model1 = solver.findModel();
                    System.out.println(new VecInt(model1));
                    model2 = solver.modelWithInternalVariables();
                    int[] clause = new int[]{ 14, 16, 19 };
                    solver.addClause(new VecInt(clause));
                    model1 = solver.findModel();
                    System.out.println(new VecInt(model1));
                    model2 = solver.modelWithInternalVariables();
                    org.junit.Assert.fail("testDeclaredVariableslitNum1324 should have thrown NegativeArraySizeException");
                }
                org.junit.Assert.fail("testDeclaredVariableslitNum1324_failAssert402_add1960 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testDeclaredVariableslitNum1324_failAssert402_add1960_failAssert421_add2946 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testDeclaredVariableslitNum1321_failAssert400litNum1602_failAssert456litNum3138_failAssert635() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    ISolver solver = SolverFactory.newDefault();
                    solver.newVar(-451333783);
                    solver.nVars();
                    solver.realNumberOfVariables();
                    solver.addClause(new VecInt(new int[]{ 1, 2, 4 }));
                    int[] model1 = solver.findModel();
                    int[] model2 = solver.modelWithInternalVariables();
                    for (int i = 0; i < 10; i++) {
                        solver.nextFreeVarId(true);
                    }
                    solver.nVars();
                    solver.nVars();
                    solver.realNumberOfVariables();
                    model1 = solver.findModel();
                    System.out.println(new VecInt(model1));
                    model2 = solver.modelWithInternalVariables();
                    int[] clause = new int[]{ 14, 0, 19 };
                    solver.addClause(new VecInt(clause));
                    model1 = solver.findModel();
                    System.out.println(new VecInt(model1));
                    model2 = solver.modelWithInternalVariables();
                    org.junit.Assert.fail("testDeclaredVariableslitNum1321 should have thrown NegativeArraySizeException");
                }
                org.junit.Assert.fail("testDeclaredVariableslitNum1321_failAssert400litNum1602 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testDeclaredVariableslitNum1321_failAssert400litNum1602_failAssert456litNum3138 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testDeclaredVariableslitNum1321_failAssert400litNum1606_failAssert459litNum2680_failAssert639() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    ISolver solver = SolverFactory.newDefault();
                    solver.newVar(-451333783);
                    solver.nVars();
                    solver.realNumberOfVariables();
                    solver.addClause(new VecInt(new int[]{ 1, 2, 2 }));
                    int[] model1 = solver.findModel();
                    int[] model2 = solver.modelWithInternalVariables();
                    for (int i = 0; i < 10; i++) {
                        solver.nextFreeVarId(true);
                    }
                    solver.nVars();
                    solver.nVars();
                    solver.realNumberOfVariables();
                    model1 = solver.findModel();
                    System.out.println(new VecInt(model1));
                    model2 = solver.modelWithInternalVariables();
                    int[] clause = new int[]{ 14, 0, 19 };
                    solver.addClause(new VecInt(clause));
                    model1 = solver.findModel();
                    System.out.println(new VecInt(model1));
                    model2 = solver.modelWithInternalVariables();
                    org.junit.Assert.fail("testDeclaredVariableslitNum1321 should have thrown NegativeArraySizeException");
                }
                org.junit.Assert.fail("testDeclaredVariableslitNum1321_failAssert400litNum1606 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testDeclaredVariableslitNum1321_failAssert400litNum1606_failAssert459litNum2680 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testDeclaredVariableslitNum1321_failAssert400litNum1565_failAssert465litNum2900_failAssert663() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    ISolver solver = SolverFactory.newDefault();
                    solver.newVar(-451333783);
                    solver.nVars();
                    solver.realNumberOfVariables();
                    solver.addClause(new VecInt(new int[]{ 2, 0, 3 }));
                    int[] model1 = solver.findModel();
                    int[] model2 = solver.modelWithInternalVariables();
                    for (int i = 0; i < 10; i++) {
                        solver.nextFreeVarId(true);
                    }
                    solver.nVars();
                    solver.nVars();
                    solver.realNumberOfVariables();
                    model1 = solver.findModel();
                    System.out.println(new VecInt(model1));
                    model2 = solver.modelWithInternalVariables();
                    int[] clause = new int[]{ 14, 16, 19 };
                    solver.addClause(new VecInt(clause));
                    model1 = solver.findModel();
                    System.out.println(new VecInt(model1));
                    model2 = solver.modelWithInternalVariables();
                    org.junit.Assert.fail("testDeclaredVariableslitNum1321 should have thrown NegativeArraySizeException");
                }
                org.junit.Assert.fail("testDeclaredVariableslitNum1321_failAssert400litNum1565 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testDeclaredVariableslitNum1321_failAssert400litNum1565_failAssert465litNum2900 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testDeclaredVariableslitNum1321_failAssert400litNum1565_failAssert465litNum2906_failAssert671() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    ISolver solver = SolverFactory.newDefault();
                    solver.newVar(-451333783);
                    solver.nVars();
                    solver.realNumberOfVariables();
                    solver.addClause(new VecInt(new int[]{ 2, 2, 2 }));
                    int[] model1 = solver.findModel();
                    int[] model2 = solver.modelWithInternalVariables();
                    for (int i = 0; i < 10; i++) {
                        solver.nextFreeVarId(true);
                    }
                    solver.nVars();
                    solver.nVars();
                    solver.realNumberOfVariables();
                    model1 = solver.findModel();
                    System.out.println(new VecInt(model1));
                    model2 = solver.modelWithInternalVariables();
                    int[] clause = new int[]{ 14, 16, 19 };
                    solver.addClause(new VecInt(clause));
                    model1 = solver.findModel();
                    System.out.println(new VecInt(model1));
                    model2 = solver.modelWithInternalVariables();
                    org.junit.Assert.fail("testDeclaredVariableslitNum1321 should have thrown NegativeArraySizeException");
                }
                org.junit.Assert.fail("testDeclaredVariableslitNum1321_failAssert400litNum1565 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testDeclaredVariableslitNum1321_failAssert400litNum1565_failAssert465litNum2906 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testDeclaredVariableslitNum1321_failAssert400litNum1565_failAssert465litNum2905_failAssert672() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    ISolver solver = SolverFactory.newDefault();
                    solver.newVar(-451333783);
                    solver.nVars();
                    solver.realNumberOfVariables();
                    solver.addClause(new VecInt(new int[]{ 2, 2, 4 }));
                    int[] model1 = solver.findModel();
                    int[] model2 = solver.modelWithInternalVariables();
                    for (int i = 0; i < 10; i++) {
                        solver.nextFreeVarId(true);
                    }
                    solver.nVars();
                    solver.nVars();
                    solver.realNumberOfVariables();
                    model1 = solver.findModel();
                    System.out.println(new VecInt(model1));
                    model2 = solver.modelWithInternalVariables();
                    int[] clause = new int[]{ 14, 16, 19 };
                    solver.addClause(new VecInt(clause));
                    model1 = solver.findModel();
                    System.out.println(new VecInt(model1));
                    model2 = solver.modelWithInternalVariables();
                    org.junit.Assert.fail("testDeclaredVariableslitNum1321 should have thrown NegativeArraySizeException");
                }
                org.junit.Assert.fail("testDeclaredVariableslitNum1321_failAssert400litNum1565 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testDeclaredVariableslitNum1321_failAssert400litNum1565_failAssert465litNum2905 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testDeclaredVariableslitNum1321_failAssert400litNum1565_failAssert465litNum2892_failAssert674() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    ISolver solver = SolverFactory.newDefault();
                    solver.newVar(-451333783);
                    solver.nVars();
                    solver.realNumberOfVariables();
                    solver.addClause(new VecInt(new int[]{ 2, 1, 3 }));
                    int[] model1 = solver.findModel();
                    int[] model2 = solver.modelWithInternalVariables();
                    for (int i = 0; i < 10; i++) {
                        solver.nextFreeVarId(true);
                    }
                    solver.nVars();
                    solver.nVars();
                    solver.realNumberOfVariables();
                    model1 = solver.findModel();
                    System.out.println(new VecInt(model1));
                    model2 = solver.modelWithInternalVariables();
                    int[] clause = new int[]{ 14, 16, 19 };
                    solver.addClause(new VecInt(clause));
                    model1 = solver.findModel();
                    System.out.println(new VecInt(model1));
                    model2 = solver.modelWithInternalVariables();
                    org.junit.Assert.fail("testDeclaredVariableslitNum1321 should have thrown NegativeArraySizeException");
                }
                org.junit.Assert.fail("testDeclaredVariableslitNum1321_failAssert400litNum1565 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testDeclaredVariableslitNum1321_failAssert400litNum1565_failAssert465litNum2892 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testDeclaredVariableslitNum1321_failAssert400litNum1565_failAssert465litNum2917_failAssert704() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    ISolver solver = SolverFactory.newDefault();
                    solver.newVar(-451333783);
                    solver.nVars();
                    solver.realNumberOfVariables();
                    solver.addClause(new VecInt(new int[]{ 2, 2, 1075726179 }));
                    int[] model1 = solver.findModel();
                    int[] model2 = solver.modelWithInternalVariables();
                    for (int i = 0; i < 10; i++) {
                        solver.nextFreeVarId(true);
                    }
                    solver.nVars();
                    solver.nVars();
                    solver.realNumberOfVariables();
                    model1 = solver.findModel();
                    System.out.println(new VecInt(model1));
                    model2 = solver.modelWithInternalVariables();
                    int[] clause = new int[]{ 14, 16, 19 };
                    solver.addClause(new VecInt(clause));
                    model1 = solver.findModel();
                    System.out.println(new VecInt(model1));
                    model2 = solver.modelWithInternalVariables();
                    org.junit.Assert.fail("testDeclaredVariableslitNum1321 should have thrown NegativeArraySizeException");
                }
                org.junit.Assert.fail("testDeclaredVariableslitNum1321_failAssert400litNum1565 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testDeclaredVariableslitNum1321_failAssert400litNum1565_failAssert465litNum2917 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testDeclaredVariableslitNum1337_failAssert409_add2197_failAssert424_add3459_failAssert707() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    ISolver solver = SolverFactory.newDefault();
                    solver.newVar(10);
                    solver.nVars();
                    solver.realNumberOfVariables();
                    solver.addClause(new VecInt(new int[]{ 1, 2, 0 }));
                    int[] model1 = solver.findModel();
                    int[] model2 = solver.modelWithInternalVariables();
                    for (int i = 0; i < 10; i++) {
                        solver.nextFreeVarId(true);
                    }
                    solver.nVars();
                    solver.nVars();
                    solver.realNumberOfVariables();
                    model1 = solver.findModel();
                    System.out.println(new VecInt(model1));
                    model2 = solver.modelWithInternalVariables();
                    int[] clause = new int[]{ 14, 16, 19 };
                    solver.addClause(new VecInt(clause));
                    model1 = solver.findModel();
                    System.out.println(new VecInt(model1));
                    System.out.println(new VecInt(model1));
                    System.out.println(new VecInt(model1));
                    model2 = solver.modelWithInternalVariables();
                    org.junit.Assert.fail("testDeclaredVariableslitNum1337 should have thrown IllegalArgumentException");
                }
                org.junit.Assert.fail("testDeclaredVariableslitNum1337_failAssert409_add2197 should have thrown IllegalArgumentException");
            }
            org.junit.Assert.fail("testDeclaredVariableslitNum1337_failAssert409_add2197_failAssert424_add3459 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testDeclaredVariableslitNum1319_failAssert399_add2058_failAssert436_add2929_failAssert709() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    ISolver solver = SolverFactory.newDefault();
                    solver.newVar(Integer.MIN_VALUE);
                    solver.nVars();
                    solver.realNumberOfVariables();
                    solver.addClause(new VecInt(new int[]{ 1, 2, 3 }));
                    int[] model1 = solver.findModel();
                    int[] model2 = solver.modelWithInternalVariables();
                    for (int i = 0; i < 10; i++) {
                        solver.nextFreeVarId(true);
                    }
                    solver.nVars();
                    solver.nVars();
                    solver.realNumberOfVariables();
                    model1 = solver.findModel();
                    System.out.println(new VecInt(model1));
                    model2 = solver.modelWithInternalVariables();
                    int[] clause = new int[]{ 14, 16, 19 };
                    solver.addClause(new VecInt(clause));
                    model1 = solver.findModel();
                    System.out.println(new VecInt(model1));
                    System.out.println(new VecInt(model1));
                    System.out.println(new VecInt(model1));
                    model2 = solver.modelWithInternalVariables();
                    org.junit.Assert.fail("testDeclaredVariableslitNum1319 should have thrown NegativeArraySizeException");
                }
                org.junit.Assert.fail("testDeclaredVariableslitNum1319_failAssert399_add2058 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testDeclaredVariableslitNum1319_failAssert399_add2058_failAssert436_add2929 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testDeclaredVariableslitNum1318_failAssert398_add2228_failAssert437_add3238_failAssert713() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    ISolver solver = SolverFactory.newDefault();
                    solver.newVar(Integer.MAX_VALUE);
                    solver.nVars();
                    solver.realNumberOfVariables();
                    solver.addClause(new VecInt(new int[]{ 1, 2, 3 }));
                    int[] model1 = solver.findModel();
                    int[] model2 = solver.modelWithInternalVariables();
                    for (int i = 0; i < 10; i++) {
                        solver.nextFreeVarId(true);
                    }
                    solver.nVars();
                    solver.nVars();
                    solver.realNumberOfVariables();
                    model1 = solver.findModel();
                    System.out.println(new VecInt(model1));
                    model2 = solver.modelWithInternalVariables();
                    int[] clause = new int[]{ 14, 16, 19 };
                    solver.addClause(new VecInt(clause));
                    model1 = solver.findModel();
                    System.out.println(new VecInt(model1));
                    System.out.println(new VecInt(model1));
                    System.out.println(new VecInt(model1));
                    model2 = solver.modelWithInternalVariables();
                    org.junit.Assert.fail("testDeclaredVariableslitNum1318 should have thrown NegativeArraySizeException");
                }
                org.junit.Assert.fail("testDeclaredVariableslitNum1318_failAssert398_add2228 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testDeclaredVariableslitNum1318_failAssert398_add2228_failAssert437_add3238 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testDeclaredVariableslitNum1323_failAssert401_add2187_failAssert426_add3268_failAssert716() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    ISolver solver = SolverFactory.newDefault();
                    solver.newVar(10);
                    solver.nVars();
                    solver.realNumberOfVariables();
                    solver.addClause(new VecInt(new int[]{ 0, 2, 3 }));
                    int[] model1 = solver.findModel();
                    int[] model2 = solver.modelWithInternalVariables();
                    for (int i = 0; i < 10; i++) {
                        solver.nextFreeVarId(true);
                    }
                    solver.nVars();
                    solver.nVars();
                    solver.realNumberOfVariables();
                    model1 = solver.findModel();
                    System.out.println(new VecInt(model1));
                    model2 = solver.modelWithInternalVariables();
                    int[] clause = new int[]{ 14, 16, 19 };
                    solver.addClause(new VecInt(clause));
                    model1 = solver.findModel();
                    System.out.println(new VecInt(model1));
                    System.out.println(new VecInt(model1));
                    System.out.println(new VecInt(model1));
                    model2 = solver.modelWithInternalVariables();
                    org.junit.Assert.fail("testDeclaredVariableslitNum1323 should have thrown IllegalArgumentException");
                }
                org.junit.Assert.fail("testDeclaredVariableslitNum1323_failAssert401_add2187 should have thrown IllegalArgumentException");
            }
            org.junit.Assert.fail("testDeclaredVariableslitNum1323_failAssert401_add2187_failAssert426_add3268 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testDeclaredVariableslitNum1353_failAssert410_add1847_failAssert440_add4037_failAssert719() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    ISolver solver = SolverFactory.newDefault();
                    solver.newVar(10);
                    solver.nVars();
                    solver.realNumberOfVariables();
                    solver.addClause(new VecInt(new int[]{ 1, 2, 3 }));
                    int[] model1 = solver.findModel();
                    int[] model2 = solver.modelWithInternalVariables();
                    for (int i = 0; i < 10; i++) {
                        solver.nextFreeVarId(true);
                    }
                    solver.nVars();
                    solver.nVars();
                    solver.realNumberOfVariables();
                    model1 = solver.findModel();
                    System.out.println(new VecInt(model1));
                    System.out.println(new VecInt(model1));
                    model2 = solver.modelWithInternalVariables();
                    int[] clause = new int[]{ Integer.MAX_VALUE, 16, 19 };
                    solver.addClause(new VecInt(clause));
                    model1 = solver.findModel();
                    System.out.println(new VecInt(model1));
                    System.out.println(new VecInt(model1));
                    model2 = solver.modelWithInternalVariables();
                    org.junit.Assert.fail("testDeclaredVariableslitNum1353 should have thrown NegativeArraySizeException");
                }
                org.junit.Assert.fail("testDeclaredVariableslitNum1353_failAssert410_add1847 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testDeclaredVariableslitNum1353_failAssert410_add1847_failAssert440_add4037 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testDeclaredVariableslitNum1355_failAssert412_add1992_failAssert430_add3394_failAssert722() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    ISolver solver = SolverFactory.newDefault();
                    solver.newVar(10);
                    solver.nVars();
                    solver.realNumberOfVariables();
                    solver.addClause(new VecInt(new int[]{ 1, 2, 3 }));
                    int[] model1 = solver.findModel();
                    int[] model2 = solver.modelWithInternalVariables();
                    for (int i = 0; i < 10; i++) {
                        solver.nextFreeVarId(true);
                    }
                    solver.nVars();
                    solver.nVars();
                    solver.realNumberOfVariables();
                    model1 = solver.findModel();
                    System.out.println(new VecInt(model1));
                    System.out.println(new VecInt(model1));
                    System.out.println(new VecInt(model1));
                    model2 = solver.modelWithInternalVariables();
                    int[] clause = new int[]{ 0, 16, 19 };
                    solver.addClause(new VecInt(clause));
                    model1 = solver.findModel();
                    System.out.println(new VecInt(model1));
                    model2 = solver.modelWithInternalVariables();
                    org.junit.Assert.fail("testDeclaredVariableslitNum1355 should have thrown IllegalArgumentException");
                }
                org.junit.Assert.fail("testDeclaredVariableslitNum1355_failAssert412_add1992 should have thrown IllegalArgumentException");
            }
            org.junit.Assert.fail("testDeclaredVariableslitNum1355_failAssert412_add1992_failAssert430_add3394 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testDeclaredVariableslitNum1319_failAssert399_add2058_failAssert436_add2876_failAssert737() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    ISolver solver = SolverFactory.newDefault();
                    solver.newVar(Integer.MIN_VALUE);
                    solver.nVars();
                    solver.realNumberOfVariables();
                    solver.addClause(new VecInt(new int[]{ 1, 2, 3 }));
                    solver.addClause(new VecInt(new int[]{ 1, 2, 3 }));
                    int[] model1 = solver.findModel();
                    int[] model2 = solver.modelWithInternalVariables();
                    for (int i = 0; i < 10; i++) {
                        solver.nextFreeVarId(true);
                    }
                    solver.nVars();
                    solver.nVars();
                    solver.realNumberOfVariables();
                    model1 = solver.findModel();
                    System.out.println(new VecInt(model1));
                    model2 = solver.modelWithInternalVariables();
                    int[] clause = new int[]{ 14, 16, 19 };
                    solver.addClause(new VecInt(clause));
                    model1 = solver.findModel();
                    System.out.println(new VecInt(model1));
                    System.out.println(new VecInt(model1));
                    model2 = solver.modelWithInternalVariables();
                    org.junit.Assert.fail("testDeclaredVariableslitNum1319 should have thrown NegativeArraySizeException");
                }
                org.junit.Assert.fail("testDeclaredVariableslitNum1319_failAssert399_add2058 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testDeclaredVariableslitNum1319_failAssert399_add2058_failAssert436_add2876 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testDeclaredVariableslitNum1355_failAssert412_add1959_failAssert445_add3659_failAssert750() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    ISolver solver = SolverFactory.newDefault();
                    solver.newVar(10);
                    solver.nVars();
                    solver.realNumberOfVariables();
                    solver.addClause(new VecInt(new int[]{ 1, 2, 3 }));
                    solver.addClause(new VecInt(new int[]{ 1, 2, 3 }));
                    int[] model1 = solver.findModel();
                    int[] model2 = solver.modelWithInternalVariables();
                    for (int i = 0; i < 10; i++) {
                        solver.nextFreeVarId(true);
                    }
                    solver.nVars();
                    solver.nVars();
                    solver.realNumberOfVariables();
                    model1 = solver.findModel();
                    System.out.println(new VecInt(model1));
                    model2 = solver.modelWithInternalVariables();
                    int[] clause = new int[]{ 0, 16, 19 };
                    solver.addClause(new VecInt(clause));
                    model1 = solver.findModel();
                    System.out.println(new VecInt(model1));
                    System.out.println(new VecInt(model1));
                    model2 = solver.modelWithInternalVariables();
                    org.junit.Assert.fail("testDeclaredVariableslitNum1355 should have thrown IllegalArgumentException");
                }
                org.junit.Assert.fail("testDeclaredVariableslitNum1355_failAssert412_add1959 should have thrown IllegalArgumentException");
            }
            org.junit.Assert.fail("testDeclaredVariableslitNum1355_failAssert412_add1959_failAssert445_add3659 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testDeclaredVariableslitNum1325_failAssert403_add1765_failAssert419litNum3742_failAssert751() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    ISolver solver = SolverFactory.newDefault();
                    solver.newVar(Integer.MIN_VALUE);
                    solver.nVars();
                    solver.realNumberOfVariables();
                    solver.addClause(new VecInt(new int[]{ Integer.MIN_VALUE, 2, 3 }));
                    solver.addClause(new VecInt(new int[]{ Integer.MIN_VALUE, 2, 3 }));
                    int[] model1 = solver.findModel();
                    int[] model2 = solver.modelWithInternalVariables();
                    for (int i = 0; i < 10; i++) {
                        solver.nextFreeVarId(true);
                    }
                    solver.nVars();
                    solver.nVars();
                    solver.realNumberOfVariables();
                    model1 = solver.findModel();
                    System.out.println(new VecInt(model1));
                    model2 = solver.modelWithInternalVariables();
                    int[] clause = new int[]{ 14, 16, 19 };
                    solver.addClause(new VecInt(clause));
                    model1 = solver.findModel();
                    System.out.println(new VecInt(model1));
                    model2 = solver.modelWithInternalVariables();
                    org.junit.Assert.fail("testDeclaredVariableslitNum1325 should have thrown ArrayIndexOutOfBoundsException");
                }
                org.junit.Assert.fail("testDeclaredVariableslitNum1325_failAssert403_add1765 should have thrown ArrayIndexOutOfBoundsException");
            }
            org.junit.Assert.fail("testDeclaredVariableslitNum1325_failAssert403_add1765_failAssert419litNum3742 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-2147483648", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testDeclaredVariableslitNum1353_failAssert410_add1811_failAssert449_add3647_failAssert754() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    ISolver solver = SolverFactory.newDefault();
                    solver.newVar(10);
                    solver.nVars();
                    solver.realNumberOfVariables();
                    solver.addClause(new VecInt(new int[]{ 1, 2, 3 }));
                    solver.addClause(new VecInt(new int[]{ 1, 2, 3 }));
                    int[] model1 = solver.findModel();
                    int[] model2 = solver.modelWithInternalVariables();
                    for (int i = 0; i < 10; i++) {
                        solver.nextFreeVarId(true);
                    }
                    solver.nVars();
                    solver.nVars();
                    solver.realNumberOfVariables();
                    model1 = solver.findModel();
                    System.out.println(new VecInt(model1));
                    model2 = solver.modelWithInternalVariables();
                    int[] clause = new int[]{ Integer.MAX_VALUE, 16, 19 };
                    solver.addClause(new VecInt(clause));
                    model1 = solver.findModel();
                    System.out.println(new VecInt(model1));
                    System.out.println(new VecInt(model1));
                    model2 = solver.modelWithInternalVariables();
                    org.junit.Assert.fail("testDeclaredVariableslitNum1353 should have thrown NegativeArraySizeException");
                }
                org.junit.Assert.fail("testDeclaredVariableslitNum1353_failAssert410_add1811 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testDeclaredVariableslitNum1353_failAssert410_add1811_failAssert449_add3647 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testDeclaredVariableslitNum1325_failAssert403_add1765_failAssert419_add3968_failAssert786() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    ISolver solver = SolverFactory.newDefault();
                    solver.newVar(10);
                    solver.newVar(10);
                    solver.nVars();
                    solver.realNumberOfVariables();
                    solver.addClause(new VecInt(new int[]{ Integer.MIN_VALUE, 2, 3 }));
                    solver.addClause(new VecInt(new int[]{ Integer.MIN_VALUE, 2, 3 }));
                    int[] model1 = solver.findModel();
                    int[] model2 = solver.modelWithInternalVariables();
                    for (int i = 0; i < 10; i++) {
                        solver.nextFreeVarId(true);
                    }
                    solver.nVars();
                    solver.nVars();
                    solver.realNumberOfVariables();
                    model1 = solver.findModel();
                    System.out.println(new VecInt(model1));
                    model2 = solver.modelWithInternalVariables();
                    int[] clause = new int[]{ 14, 16, 19 };
                    solver.addClause(new VecInt(clause));
                    model1 = solver.findModel();
                    System.out.println(new VecInt(model1));
                    model2 = solver.modelWithInternalVariables();
                    org.junit.Assert.fail("testDeclaredVariableslitNum1325 should have thrown ArrayIndexOutOfBoundsException");
                }
                org.junit.Assert.fail("testDeclaredVariableslitNum1325_failAssert403_add1765 should have thrown ArrayIndexOutOfBoundsException");
            }
            org.junit.Assert.fail("testDeclaredVariableslitNum1325_failAssert403_add1765_failAssert419_add3968 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-2147483648", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testDeclaredVariableslitNum1353_failAssert410litNum1725_failAssert541litNum3450_failAssert787() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    ISolver solver = SolverFactory.newDefault();
                    solver.newVar(10);
                    solver.nVars();
                    solver.realNumberOfVariables();
                    solver.addClause(new VecInt(new int[]{ 1, 2, 3 }));
                    int[] model1 = solver.findModel();
                    int[] model2 = solver.modelWithInternalVariables();
                    for (int i = 0; i < 0; i++) {
                        solver.nextFreeVarId(true);
                    }
                    solver.nVars();
                    solver.nVars();
                    solver.realNumberOfVariables();
                    model1 = solver.findModel();
                    System.out.println(new VecInt(model1));
                    model2 = solver.modelWithInternalVariables();
                    int[] clause = new int[]{ Integer.MAX_VALUE, 16, 0 };
                    solver.addClause(new VecInt(clause));
                    model1 = solver.findModel();
                    System.out.println(new VecInt(model1));
                    model2 = solver.modelWithInternalVariables();
                    org.junit.Assert.fail("testDeclaredVariableslitNum1353 should have thrown NegativeArraySizeException");
                }
                org.junit.Assert.fail("testDeclaredVariableslitNum1353_failAssert410litNum1725 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testDeclaredVariableslitNum1353_failAssert410litNum1725_failAssert541litNum3450 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testDeclaredVariableslitNum1353_failAssert410litNum1585_failAssert545litNum3811_failAssert789() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    ISolver solver = SolverFactory.newDefault();
                    solver.newVar(0);
                    solver.nVars();
                    solver.realNumberOfVariables();
                    solver.addClause(new VecInt(new int[]{ 1, 2, 3 }));
                    int[] model1 = solver.findModel();
                    int[] model2 = solver.modelWithInternalVariables();
                    for (int i = 0; i < 10; i++) {
                        solver.nextFreeVarId(true);
                    }
                    solver.nVars();
                    solver.nVars();
                    solver.realNumberOfVariables();
                    model1 = solver.findModel();
                    System.out.println(new VecInt(model1));
                    model2 = solver.modelWithInternalVariables();
                    int[] clause = new int[]{ Integer.MAX_VALUE, 16, 0 };
                    solver.addClause(new VecInt(clause));
                    model1 = solver.findModel();
                    System.out.println(new VecInt(model1));
                    model2 = solver.modelWithInternalVariables();
                    org.junit.Assert.fail("testDeclaredVariableslitNum1353 should have thrown NegativeArraySizeException");
                }
                org.junit.Assert.fail("testDeclaredVariableslitNum1353_failAssert410litNum1585 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testDeclaredVariableslitNum1353_failAssert410litNum1585_failAssert545litNum3811 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testDeclaredVariableslitNum1353_failAssert410litNum1585_failAssert545litNum3728_failAssert790() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    ISolver solver = SolverFactory.newDefault();
                    solver.newVar(0);
                    solver.nVars();
                    solver.realNumberOfVariables();
                    solver.addClause(new VecInt(new int[]{ 1, 2, 3 }));
                    int[] model1 = solver.findModel();
                    int[] model2 = solver.modelWithInternalVariables();
                    for (int i = 0; i < 0; i++) {
                        solver.nextFreeVarId(true);
                    }
                    solver.nVars();
                    solver.nVars();
                    solver.realNumberOfVariables();
                    model1 = solver.findModel();
                    System.out.println(new VecInt(model1));
                    model2 = solver.modelWithInternalVariables();
                    int[] clause = new int[]{ Integer.MAX_VALUE, 16, 19 };
                    solver.addClause(new VecInt(clause));
                    model1 = solver.findModel();
                    System.out.println(new VecInt(model1));
                    model2 = solver.modelWithInternalVariables();
                    org.junit.Assert.fail("testDeclaredVariableslitNum1353 should have thrown NegativeArraySizeException");
                }
                org.junit.Assert.fail("testDeclaredVariableslitNum1353_failAssert410litNum1585 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testDeclaredVariableslitNum1353_failAssert410litNum1585_failAssert545litNum3728 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testDeclaredVariableslitNum1353_failAssert410litNum1622_failAssert559litNum2741_failAssert794() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    ISolver solver = SolverFactory.newDefault();
                    solver.newVar(10);
                    solver.nVars();
                    solver.realNumberOfVariables();
                    solver.addClause(new VecInt(new int[]{ 1, 1, 3 }));
                    int[] model1 = solver.findModel();
                    int[] model2 = solver.modelWithInternalVariables();
                    for (int i = 0; i < 10; i++) {
                        solver.nextFreeVarId(true);
                    }
                    solver.nVars();
                    solver.nVars();
                    solver.realNumberOfVariables();
                    model1 = solver.findModel();
                    System.out.println(new VecInt(model1));
                    model2 = solver.modelWithInternalVariables();
                    int[] clause = new int[]{ Integer.MAX_VALUE, 0, 19 };
                    solver.addClause(new VecInt(clause));
                    model1 = solver.findModel();
                    System.out.println(new VecInt(model1));
                    model2 = solver.modelWithInternalVariables();
                    org.junit.Assert.fail("testDeclaredVariableslitNum1353 should have thrown NegativeArraySizeException");
                }
                org.junit.Assert.fail("testDeclaredVariableslitNum1353_failAssert410litNum1622 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testDeclaredVariableslitNum1353_failAssert410litNum1622_failAssert559litNum2741 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testDeclaredVariableslitNum1353_failAssert410litNum1725_failAssert541litNum3421_failAssert795() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    ISolver solver = SolverFactory.newDefault();
                    solver.newVar(10);
                    solver.nVars();
                    solver.realNumberOfVariables();
                    solver.addClause(new VecInt(new int[]{ 1, 2, 3 }));
                    int[] model1 = solver.findModel();
                    int[] model2 = solver.modelWithInternalVariables();
                    for (int i = 0; i < 0; i++) {
                        solver.nextFreeVarId(true);
                    }
                    solver.nVars();
                    solver.nVars();
                    solver.realNumberOfVariables();
                    model1 = solver.findModel();
                    System.out.println(new VecInt(model1));
                    model2 = solver.modelWithInternalVariables();
                    int[] clause = new int[]{ Integer.MAX_VALUE, 15, 19 };
                    solver.addClause(new VecInt(clause));
                    model1 = solver.findModel();
                    System.out.println(new VecInt(model1));
                    model2 = solver.modelWithInternalVariables();
                    org.junit.Assert.fail("testDeclaredVariableslitNum1353 should have thrown NegativeArraySizeException");
                }
                org.junit.Assert.fail("testDeclaredVariableslitNum1353_failAssert410litNum1725 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testDeclaredVariableslitNum1353_failAssert410litNum1725_failAssert541litNum3421 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testDeclaredVariableslitNum1353_failAssert410litNum1622_failAssert559litNum2711_failAssert796() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    ISolver solver = SolverFactory.newDefault();
                    solver.newVar(10);
                    solver.nVars();
                    solver.realNumberOfVariables();
                    solver.addClause(new VecInt(new int[]{ 1, 1, 3 }));
                    int[] model1 = solver.findModel();
                    int[] model2 = solver.modelWithInternalVariables();
                    for (int i = 0; i < 0; i++) {
                        solver.nextFreeVarId(true);
                    }
                    solver.nVars();
                    solver.nVars();
                    solver.realNumberOfVariables();
                    model1 = solver.findModel();
                    System.out.println(new VecInt(model1));
                    model2 = solver.modelWithInternalVariables();
                    int[] clause = new int[]{ Integer.MAX_VALUE, 16, 19 };
                    solver.addClause(new VecInt(clause));
                    model1 = solver.findModel();
                    System.out.println(new VecInt(model1));
                    model2 = solver.modelWithInternalVariables();
                    org.junit.Assert.fail("testDeclaredVariableslitNum1353 should have thrown NegativeArraySizeException");
                }
                org.junit.Assert.fail("testDeclaredVariableslitNum1353_failAssert410litNum1622 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testDeclaredVariableslitNum1353_failAssert410litNum1622_failAssert559litNum2711 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testDeclaredVariableslitNum1353_failAssert410litNum1585_failAssert545litNum3610_failAssert801() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    ISolver solver = SolverFactory.newDefault();
                    solver.newVar(0);
                    solver.nVars();
                    solver.realNumberOfVariables();
                    solver.addClause(new VecInt(new int[]{ 1, 1, 3 }));
                    int[] model1 = solver.findModel();
                    int[] model2 = solver.modelWithInternalVariables();
                    for (int i = 0; i < 10; i++) {
                        solver.nextFreeVarId(true);
                    }
                    solver.nVars();
                    solver.nVars();
                    solver.realNumberOfVariables();
                    model1 = solver.findModel();
                    System.out.println(new VecInt(model1));
                    model2 = solver.modelWithInternalVariables();
                    int[] clause = new int[]{ Integer.MAX_VALUE, 16, 19 };
                    solver.addClause(new VecInt(clause));
                    model1 = solver.findModel();
                    System.out.println(new VecInt(model1));
                    model2 = solver.modelWithInternalVariables();
                    org.junit.Assert.fail("testDeclaredVariableslitNum1353 should have thrown NegativeArraySizeException");
                }
                org.junit.Assert.fail("testDeclaredVariableslitNum1353_failAssert410litNum1585 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testDeclaredVariableslitNum1353_failAssert410litNum1585_failAssert545litNum3610 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testDeclaredVariableslitNum1324_failAssert402litNum1796_failAssert580litNum3322_failAssert803() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    ISolver solver = SolverFactory.newDefault();
                    solver.newVar(0);
                    solver.nVars();
                    solver.realNumberOfVariables();
                    solver.addClause(new VecInt(new int[]{ Integer.MAX_VALUE, 2, 3 }));
                    int[] model1 = solver.findModel();
                    int[] model2 = solver.modelWithInternalVariables();
                    for (int i = 0; i < 10; i++) {
                        solver.nextFreeVarId(true);
                    }
                    solver.nVars();
                    solver.nVars();
                    solver.realNumberOfVariables();
                    model1 = solver.findModel();
                    System.out.println(new VecInt(model1));
                    model2 = solver.modelWithInternalVariables();
                    int[] clause = new int[]{ 14, 0, 19 };
                    solver.addClause(new VecInt(clause));
                    model1 = solver.findModel();
                    System.out.println(new VecInt(model1));
                    model2 = solver.modelWithInternalVariables();
                    org.junit.Assert.fail("testDeclaredVariableslitNum1324 should have thrown NegativeArraySizeException");
                }
                org.junit.Assert.fail("testDeclaredVariableslitNum1324_failAssert402litNum1796 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testDeclaredVariableslitNum1324_failAssert402litNum1796_failAssert580litNum3322 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testDeclaredVariableslitNum1353_failAssert410litNum1585_failAssert545litNum3618_failAssert805() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    ISolver solver = SolverFactory.newDefault();
                    solver.newVar(0);
                    solver.nVars();
                    solver.realNumberOfVariables();
                    solver.addClause(new VecInt(new int[]{ 1, 0, 3 }));
                    int[] model1 = solver.findModel();
                    int[] model2 = solver.modelWithInternalVariables();
                    for (int i = 0; i < 10; i++) {
                        solver.nextFreeVarId(true);
                    }
                    solver.nVars();
                    solver.nVars();
                    solver.realNumberOfVariables();
                    model1 = solver.findModel();
                    System.out.println(new VecInt(model1));
                    model2 = solver.modelWithInternalVariables();
                    int[] clause = new int[]{ Integer.MAX_VALUE, 16, 19 };
                    solver.addClause(new VecInt(clause));
                    model1 = solver.findModel();
                    System.out.println(new VecInt(model1));
                    model2 = solver.modelWithInternalVariables();
                    org.junit.Assert.fail("testDeclaredVariableslitNum1353 should have thrown NegativeArraySizeException");
                }
                org.junit.Assert.fail("testDeclaredVariableslitNum1353_failAssert410litNum1585 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testDeclaredVariableslitNum1353_failAssert410litNum1585_failAssert545litNum3618 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testDeclaredVariableslitNum1353_failAssert410litNum1585_failAssert545litNum3607_failAssert808() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    ISolver solver = SolverFactory.newDefault();
                    solver.newVar(0);
                    solver.nVars();
                    solver.realNumberOfVariables();
                    solver.addClause(new VecInt(new int[]{ 1, 3, 3 }));
                    int[] model1 = solver.findModel();
                    int[] model2 = solver.modelWithInternalVariables();
                    for (int i = 0; i < 10; i++) {
                        solver.nextFreeVarId(true);
                    }
                    solver.nVars();
                    solver.nVars();
                    solver.realNumberOfVariables();
                    model1 = solver.findModel();
                    System.out.println(new VecInt(model1));
                    model2 = solver.modelWithInternalVariables();
                    int[] clause = new int[]{ Integer.MAX_VALUE, 16, 19 };
                    solver.addClause(new VecInt(clause));
                    model1 = solver.findModel();
                    System.out.println(new VecInt(model1));
                    model2 = solver.modelWithInternalVariables();
                    org.junit.Assert.fail("testDeclaredVariableslitNum1353 should have thrown NegativeArraySizeException");
                }
                org.junit.Assert.fail("testDeclaredVariableslitNum1353_failAssert410litNum1585 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testDeclaredVariableslitNum1353_failAssert410litNum1585_failAssert545litNum3607 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testDeclaredVariableslitNum1329_failAssert404litNum1584_failAssert587litNum3110_failAssert813() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    ISolver solver = SolverFactory.newDefault();
                    solver.newVar(0);
                    solver.nVars();
                    solver.realNumberOfVariables();
                    solver.addClause(new VecInt(new int[]{ 1, Integer.MAX_VALUE, 3 }));
                    int[] model1 = solver.findModel();
                    int[] model2 = solver.modelWithInternalVariables();
                    for (int i = 0; i < 10; i++) {
                        solver.nextFreeVarId(true);
                    }
                    solver.nVars();
                    solver.nVars();
                    solver.realNumberOfVariables();
                    model1 = solver.findModel();
                    System.out.println(new VecInt(model1));
                    model2 = solver.modelWithInternalVariables();
                    int[] clause = new int[]{ 14, 16, 0 };
                    solver.addClause(new VecInt(clause));
                    model1 = solver.findModel();
                    System.out.println(new VecInt(model1));
                    model2 = solver.modelWithInternalVariables();
                    org.junit.Assert.fail("testDeclaredVariableslitNum1329 should have thrown NegativeArraySizeException");
                }
                org.junit.Assert.fail("testDeclaredVariableslitNum1329_failAssert404litNum1584 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testDeclaredVariableslitNum1329_failAssert404litNum1584_failAssert587litNum3110 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void implicitDeclarationOfVariableslitNum2_failAssert0() throws Exception, ContradictionException, TimeoutException {
        try {
            ISolver solver = SolverFactory.newDefault();
            solver.nVars();
            solver.realNumberOfVariables();
            solver.addClause(new VecInt(new int[]{ 0, 2, 3 }));
            solver.nVars();
            solver.realNumberOfVariables();
            for (int i = 0; i < 10; i++) {
                solver.nextFreeVarId(true);
            }
            solver.nVars();
            solver.realNumberOfVariables();
            int[] model1 = solver.findModel();
            int[] model2 = solver.modelWithInternalVariables();
            org.junit.Assert.fail("implicitDeclarationOfVariableslitNum2 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void implicitDeclarationOfVariableslitNum3_failAssert1() throws Exception, ContradictionException, TimeoutException {
        try {
            ISolver solver = SolverFactory.newDefault();
            solver.nVars();
            solver.realNumberOfVariables();
            solver.addClause(new VecInt(new int[]{ Integer.MAX_VALUE, 2, 3 }));
            solver.nVars();
            solver.realNumberOfVariables();
            for (int i = 0; i < 10; i++) {
                solver.nextFreeVarId(true);
            }
            solver.nVars();
            solver.realNumberOfVariables();
            int[] model1 = solver.findModel();
            int[] model2 = solver.modelWithInternalVariables();
            org.junit.Assert.fail("implicitDeclarationOfVariableslitNum3 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void implicitDeclarationOfVariableslitNum4_failAssert2() throws Exception, ContradictionException, TimeoutException {
        try {
            ISolver solver = SolverFactory.newDefault();
            solver.nVars();
            solver.realNumberOfVariables();
            solver.addClause(new VecInt(new int[]{ Integer.MIN_VALUE, 2, 3 }));
            solver.nVars();
            solver.realNumberOfVariables();
            for (int i = 0; i < 10; i++) {
                solver.nextFreeVarId(true);
            }
            solver.nVars();
            solver.realNumberOfVariables();
            int[] model1 = solver.findModel();
            int[] model2 = solver.modelWithInternalVariables();
            org.junit.Assert.fail("implicitDeclarationOfVariableslitNum4 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-2147483648", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void implicitDeclarationOfVariableslitNum8_failAssert3() throws Exception, ContradictionException, TimeoutException {
        try {
            ISolver solver = SolverFactory.newDefault();
            solver.nVars();
            solver.realNumberOfVariables();
            solver.addClause(new VecInt(new int[]{ 1, Integer.MAX_VALUE, 3 }));
            solver.nVars();
            solver.realNumberOfVariables();
            for (int i = 0; i < 10; i++) {
                solver.nextFreeVarId(true);
            }
            solver.nVars();
            solver.realNumberOfVariables();
            int[] model1 = solver.findModel();
            int[] model2 = solver.modelWithInternalVariables();
            org.junit.Assert.fail("implicitDeclarationOfVariableslitNum8 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void implicitDeclarationOfVariableslitNum10_failAssert5() throws Exception, ContradictionException, TimeoutException {
        try {
            ISolver solver = SolverFactory.newDefault();
            solver.nVars();
            solver.realNumberOfVariables();
            solver.addClause(new VecInt(new int[]{ 1, 0, 3 }));
            solver.nVars();
            solver.realNumberOfVariables();
            for (int i = 0; i < 10; i++) {
                solver.nextFreeVarId(true);
            }
            solver.nVars();
            solver.realNumberOfVariables();
            int[] model1 = solver.findModel();
            int[] model2 = solver.modelWithInternalVariables();
            org.junit.Assert.fail("implicitDeclarationOfVariableslitNum10 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void implicitDeclarationOfVariableslitNum16_failAssert8() throws Exception, ContradictionException, TimeoutException {
        try {
            ISolver solver = SolverFactory.newDefault();
            solver.nVars();
            solver.realNumberOfVariables();
            solver.addClause(new VecInt(new int[]{ 1, 2, 0 }));
            solver.nVars();
            solver.realNumberOfVariables();
            for (int i = 0; i < 10; i++) {
                solver.nextFreeVarId(true);
            }
            solver.nVars();
            solver.realNumberOfVariables();
            int[] model1 = solver.findModel();
            int[] model2 = solver.modelWithInternalVariables();
            org.junit.Assert.fail("implicitDeclarationOfVariableslitNum16 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void implicitDeclarationOfVariableslitNum2_failAssert0litNum241_failAssert9() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                ISolver solver = SolverFactory.newDefault();
                solver.nVars();
                solver.realNumberOfVariables();
                solver.addClause(new VecInt(new int[]{ 0, 3, 3 }));
                solver.nVars();
                solver.realNumberOfVariables();
                for (int i = 0; i < 10; i++) {
                    solver.nextFreeVarId(true);
                }
                solver.nVars();
                solver.realNumberOfVariables();
                int[] model1 = solver.findModel();
                int[] model2 = solver.modelWithInternalVariables();
                org.junit.Assert.fail("implicitDeclarationOfVariableslitNum2 should have thrown IllegalArgumentException");
            }
            org.junit.Assert.fail("implicitDeclarationOfVariableslitNum2_failAssert0litNum241 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void implicitDeclarationOfVariableslitNum3_failAssert1litNum147_failAssert45() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                ISolver solver = SolverFactory.newDefault();
                solver.nVars();
                solver.realNumberOfVariables();
                solver.addClause(new VecInt(new int[]{ Integer.MAX_VALUE, 3, 3 }));
                solver.nVars();
                solver.realNumberOfVariables();
                for (int i = 0; i < 10; i++) {
                    solver.nextFreeVarId(true);
                }
                solver.nVars();
                solver.realNumberOfVariables();
                int[] model1 = solver.findModel();
                int[] model2 = solver.modelWithInternalVariables();
                org.junit.Assert.fail("implicitDeclarationOfVariableslitNum3 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("implicitDeclarationOfVariableslitNum3_failAssert1litNum147 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void implicitDeclarationOfVariableslitNum3_failAssert1_add256_failAssert71() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                ISolver solver = SolverFactory.newDefault();
                solver.nVars();
                solver.realNumberOfVariables();
                solver.realNumberOfVariables();
                solver.addClause(new VecInt(new int[]{ Integer.MAX_VALUE, 2, 3 }));
                solver.nVars();
                solver.realNumberOfVariables();
                for (int i = 0; i < 10; i++) {
                    solver.nextFreeVarId(true);
                }
                solver.nVars();
                solver.realNumberOfVariables();
                int[] model1 = solver.findModel();
                int[] model2 = solver.modelWithInternalVariables();
                org.junit.Assert.fail("implicitDeclarationOfVariableslitNum3 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("implicitDeclarationOfVariableslitNum3_failAssert1_add256 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void implicitDeclarationOfVariableslitNum4_failAssert2litNum264_failAssert81() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                ISolver solver = SolverFactory.newDefault();
                solver.nVars();
                solver.realNumberOfVariables();
                solver.addClause(new VecInt(new int[]{ Integer.MIN_VALUE, 3, 3 }));
                solver.nVars();
                solver.realNumberOfVariables();
                for (int i = 0; i < 10; i++) {
                    solver.nextFreeVarId(true);
                }
                solver.nVars();
                solver.realNumberOfVariables();
                int[] model1 = solver.findModel();
                int[] model2 = solver.modelWithInternalVariables();
                org.junit.Assert.fail("implicitDeclarationOfVariableslitNum4 should have thrown ArrayIndexOutOfBoundsException");
            }
            org.junit.Assert.fail("implicitDeclarationOfVariableslitNum4_failAssert2litNum264 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-2147483648", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void implicitDeclarationOfVariableslitNum8_failAssert3litNum149_failAssert117() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                ISolver solver = SolverFactory.newDefault();
                solver.nVars();
                solver.realNumberOfVariables();
                solver.addClause(new VecInt(new int[]{ 2, Integer.MAX_VALUE, 3 }));
                solver.nVars();
                solver.realNumberOfVariables();
                for (int i = 0; i < 10; i++) {
                    solver.nextFreeVarId(true);
                }
                solver.nVars();
                solver.realNumberOfVariables();
                int[] model1 = solver.findModel();
                int[] model2 = solver.modelWithInternalVariables();
                org.junit.Assert.fail("implicitDeclarationOfVariableslitNum8 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("implicitDeclarationOfVariableslitNum8_failAssert3litNum149 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void implicitDeclarationOfVariableslitNum8_failAssert3litNum244_failAssert137() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                ISolver solver = SolverFactory.newDefault();
                solver.nVars();
                solver.realNumberOfVariables();
                solver.addClause(new VecInt(new int[]{ 1, Integer.MAX_VALUE, 3 }));
                solver.nVars();
                solver.realNumberOfVariables();
                for (int i = 0; i < 0; i++) {
                    solver.nextFreeVarId(true);
                }
                solver.nVars();
                solver.realNumberOfVariables();
                int[] model1 = solver.findModel();
                int[] model2 = solver.modelWithInternalVariables();
                org.junit.Assert.fail("implicitDeclarationOfVariableslitNum8 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("implicitDeclarationOfVariableslitNum8_failAssert3litNum244 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void implicitDeclarationOfVariableslitNum10_failAssert5litNum146_failAssert151() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                ISolver solver = SolverFactory.newDefault();
                solver.nVars();
                solver.realNumberOfVariables();
                solver.addClause(new VecInt(new int[]{ 1, 0, 4 }));
                solver.nVars();
                solver.realNumberOfVariables();
                for (int i = 0; i < 10; i++) {
                    solver.nextFreeVarId(true);
                }
                solver.nVars();
                solver.realNumberOfVariables();
                int[] model1 = solver.findModel();
                int[] model2 = solver.modelWithInternalVariables();
                org.junit.Assert.fail("implicitDeclarationOfVariableslitNum10 should have thrown IllegalArgumentException");
            }
            org.junit.Assert.fail("implicitDeclarationOfVariableslitNum10_failAssert5litNum146 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void implicitDeclarationOfVariableslitNum2_failAssert0litNum241_failAssert9litNum737_failAssert205() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    ISolver solver = SolverFactory.newDefault();
                    solver.nVars();
                    solver.realNumberOfVariables();
                    solver.addClause(new VecInt(new int[]{ 0, 3, 4 }));
                    solver.nVars();
                    solver.realNumberOfVariables();
                    for (int i = 0; i < 10; i++) {
                        solver.nextFreeVarId(true);
                    }
                    solver.nVars();
                    solver.realNumberOfVariables();
                    int[] model1 = solver.findModel();
                    int[] model2 = solver.modelWithInternalVariables();
                    org.junit.Assert.fail("implicitDeclarationOfVariableslitNum2 should have thrown IllegalArgumentException");
                }
                org.junit.Assert.fail("implicitDeclarationOfVariableslitNum2_failAssert0litNum241 should have thrown IllegalArgumentException");
            }
            org.junit.Assert.fail("implicitDeclarationOfVariableslitNum2_failAssert0litNum241_failAssert9litNum737 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void implicitDeclarationOfVariableslitNum3_failAssert1litNum147_failAssert45litNum740_failAssert235() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    ISolver solver = SolverFactory.newDefault();
                    solver.nVars();
                    solver.realNumberOfVariables();
                    solver.addClause(new VecInt(new int[]{ Integer.MAX_VALUE, 3, 4 }));
                    solver.nVars();
                    solver.realNumberOfVariables();
                    for (int i = 0; i < 10; i++) {
                        solver.nextFreeVarId(true);
                    }
                    solver.nVars();
                    solver.realNumberOfVariables();
                    int[] model1 = solver.findModel();
                    int[] model2 = solver.modelWithInternalVariables();
                    org.junit.Assert.fail("implicitDeclarationOfVariableslitNum3 should have thrown NegativeArraySizeException");
                }
                org.junit.Assert.fail("implicitDeclarationOfVariableslitNum3_failAssert1litNum147 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("implicitDeclarationOfVariableslitNum3_failAssert1litNum147_failAssert45litNum740 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void implicitDeclarationOfVariableslitNum4_failAssert2litNum264_failAssert81litNum837_failAssert302() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    ISolver solver = SolverFactory.newDefault();
                    solver.nVars();
                    solver.realNumberOfVariables();
                    solver.addClause(new VecInt(new int[]{ Integer.MIN_VALUE, 3, 4 }));
                    solver.nVars();
                    solver.realNumberOfVariables();
                    for (int i = 0; i < 10; i++) {
                        solver.nextFreeVarId(true);
                    }
                    solver.nVars();
                    solver.realNumberOfVariables();
                    int[] model1 = solver.findModel();
                    int[] model2 = solver.modelWithInternalVariables();
                    org.junit.Assert.fail("implicitDeclarationOfVariableslitNum4 should have thrown ArrayIndexOutOfBoundsException");
                }
                org.junit.Assert.fail("implicitDeclarationOfVariableslitNum4_failAssert2litNum264 should have thrown ArrayIndexOutOfBoundsException");
            }
            org.junit.Assert.fail("implicitDeclarationOfVariableslitNum4_failAssert2litNum264_failAssert81litNum837 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-2147483648", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void implicitDeclarationOfVariableslitNum8_failAssert3litNum149_failAssert117litNum737_failAssert332() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    ISolver solver = SolverFactory.newDefault();
                    solver.nVars();
                    solver.realNumberOfVariables();
                    solver.addClause(new VecInt(new int[]{ 2, Integer.MAX_VALUE, 4 }));
                    solver.nVars();
                    solver.realNumberOfVariables();
                    for (int i = 0; i < 10; i++) {
                        solver.nextFreeVarId(true);
                    }
                    solver.nVars();
                    solver.realNumberOfVariables();
                    int[] model1 = solver.findModel();
                    int[] model2 = solver.modelWithInternalVariables();
                    org.junit.Assert.fail("implicitDeclarationOfVariableslitNum8 should have thrown NegativeArraySizeException");
                }
                org.junit.Assert.fail("implicitDeclarationOfVariableslitNum8_failAssert3litNum149 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("implicitDeclarationOfVariableslitNum8_failAssert3litNum149_failAssert117litNum737 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void implicitDeclarationOfVariableslitNum8_failAssert3litNum149_failAssert117litNum758_failAssert338() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    ISolver solver = SolverFactory.newDefault();
                    solver.nVars();
                    solver.realNumberOfVariables();
                    solver.addClause(new VecInt(new int[]{ 2, Integer.MAX_VALUE, 3 }));
                    solver.nVars();
                    solver.realNumberOfVariables();
                    for (int i = 1; i < 10; i++) {
                        solver.nextFreeVarId(true);
                    }
                    solver.nVars();
                    solver.realNumberOfVariables();
                    int[] model1 = solver.findModel();
                    int[] model2 = solver.modelWithInternalVariables();
                    org.junit.Assert.fail("implicitDeclarationOfVariableslitNum8 should have thrown NegativeArraySizeException");
                }
                org.junit.Assert.fail("implicitDeclarationOfVariableslitNum8_failAssert3litNum149 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("implicitDeclarationOfVariableslitNum8_failAssert3litNum149_failAssert117litNum758 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void implicitDeclarationOfVariableslitNum10_failAssert5litNum146_failAssert151litNum739_failAssert374() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    ISolver solver = SolverFactory.newDefault();
                    solver.nVars();
                    solver.realNumberOfVariables();
                    solver.addClause(new VecInt(new int[]{ 1, 0, 4 }));
                    solver.nVars();
                    solver.realNumberOfVariables();
                    for (int i = 1; i < 10; i++) {
                        solver.nextFreeVarId(true);
                    }
                    solver.nVars();
                    solver.realNumberOfVariables();
                    int[] model1 = solver.findModel();
                    int[] model2 = solver.modelWithInternalVariables();
                    org.junit.Assert.fail("implicitDeclarationOfVariableslitNum10 should have thrown IllegalArgumentException");
                }
                org.junit.Assert.fail("implicitDeclarationOfVariableslitNum10_failAssert5litNum146 should have thrown IllegalArgumentException");
            }
            org.junit.Assert.fail("implicitDeclarationOfVariableslitNum10_failAssert5litNum146_failAssert151litNum739 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }
}

