package org.sat4j;


import org.junit.Assert;
import org.junit.Test;
import org.sat4j.core.VecInt;
import org.sat4j.minisat.SolverFactory;
import org.sat4j.minisat.constraints.cnf.UnitClause;
import org.sat4j.minisat.core.RestartStrategy;
import org.sat4j.minisat.core.SearchParams;
import org.sat4j.minisat.core.Solver;
import org.sat4j.specs.ContradictionException;
import org.sat4j.specs.IConstr;
import org.sat4j.specs.ISolver;
import org.sat4j.specs.IVec;
import org.sat4j.specs.IVecInt;
import org.sat4j.specs.TimeoutException;
import org.sat4j.tools.ModelIterator;


public class AmplBugSAT139 {
    @Test(timeout = 30000)
    public void checkModelIterationWithExactlylitNum3_failAssert0() throws Exception, ContradictionException, TimeoutException {
        try {
            ISolver solver = SolverFactory.newDefault();
            solver.newVar(Integer.MAX_VALUE);
            solver.setExpectedNumberOfClauses(1);
            solver.addClause(new VecInt(new int[]{ 1, 2, 3, 4, 5 }));
            solver.addExactly(new VecInt(new int[]{ 1, 2, 3 }), 1);
            ModelIterator iterator = new ModelIterator(solver);
            while (iterator.isSatisfiable()) {
                iterator.model();
            } 
            iterator.numberOfModelsFoundSoFar();
            org.junit.Assert.fail("checkModelIterationWithExactlylitNum3 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithExactlylitNum4_failAssert1() throws Exception, ContradictionException, TimeoutException {
        try {
            ISolver solver = SolverFactory.newDefault();
            solver.newVar(Integer.MIN_VALUE);
            solver.setExpectedNumberOfClauses(1);
            solver.addClause(new VecInt(new int[]{ 1, 2, 3, 4, 5 }));
            solver.addExactly(new VecInt(new int[]{ 1, 2, 3 }), 1);
            ModelIterator iterator = new ModelIterator(solver);
            while (iterator.isSatisfiable()) {
                iterator.model();
            } 
            iterator.numberOfModelsFoundSoFar();
            org.junit.Assert.fail("checkModelIterationWithExactlylitNum4 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithExactlylitNum6_failAssert2() throws Exception, ContradictionException, TimeoutException {
        try {
            ISolver solver = SolverFactory.newDefault();
            solver.newVar(-395967801);
            solver.setExpectedNumberOfClauses(1);
            solver.addClause(new VecInt(new int[]{ 1, 2, 3, 4, 5 }));
            solver.addExactly(new VecInt(new int[]{ 1, 2, 3 }), 1);
            ModelIterator iterator = new ModelIterator(solver);
            while (iterator.isSatisfiable()) {
                iterator.model();
            } 
            iterator.numberOfModelsFoundSoFar();
            org.junit.Assert.fail("checkModelIterationWithExactlylitNum6 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithExactlylitNum13_failAssert3() throws Exception, ContradictionException, TimeoutException {
        try {
            ISolver solver = SolverFactory.newDefault();
            solver.newVar(5);
            solver.setExpectedNumberOfClauses(1);
            solver.addClause(new VecInt(new int[]{ 0, 2, 3, 4, 5 }));
            solver.addExactly(new VecInt(new int[]{ 1, 2, 3 }), 1);
            ModelIterator iterator = new ModelIterator(solver);
            while (iterator.isSatisfiable()) {
                iterator.model();
            } 
            iterator.numberOfModelsFoundSoFar();
            org.junit.Assert.fail("checkModelIterationWithExactlylitNum13 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithExactlylitNum14_failAssert4() throws Exception, ContradictionException, TimeoutException {
        try {
            ISolver solver = SolverFactory.newDefault();
            solver.newVar(5);
            solver.setExpectedNumberOfClauses(1);
            solver.addClause(new VecInt(new int[]{ Integer.MAX_VALUE, 2, 3, 4, 5 }));
            solver.addExactly(new VecInt(new int[]{ 1, 2, 3 }), 1);
            ModelIterator iterator = new ModelIterator(solver);
            while (iterator.isSatisfiable()) {
                iterator.model();
            } 
            iterator.numberOfModelsFoundSoFar();
            org.junit.Assert.fail("checkModelIterationWithExactlylitNum14 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithExactlylitNum15_failAssert5() throws Exception, ContradictionException, TimeoutException {
        try {
            ISolver solver = SolverFactory.newDefault();
            solver.newVar(5);
            solver.setExpectedNumberOfClauses(1);
            solver.addClause(new VecInt(new int[]{ Integer.MIN_VALUE, 2, 3, 4, 5 }));
            solver.addExactly(new VecInt(new int[]{ 1, 2, 3 }), 1);
            ModelIterator iterator = new ModelIterator(solver);
            while (iterator.isSatisfiable()) {
                iterator.model();
            } 
            iterator.numberOfModelsFoundSoFar();
            org.junit.Assert.fail("checkModelIterationWithExactlylitNum15 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-2147483648", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithExactlylitNum19_failAssert6() throws Exception, ContradictionException, TimeoutException {
        try {
            ISolver solver = SolverFactory.newDefault();
            solver.newVar(5);
            solver.setExpectedNumberOfClauses(1);
            solver.addClause(new VecInt(new int[]{ 1, Integer.MAX_VALUE, 3, 4, 5 }));
            solver.addExactly(new VecInt(new int[]{ 1, 2, 3 }), 1);
            ModelIterator iterator = new ModelIterator(solver);
            while (iterator.isSatisfiable()) {
                iterator.model();
            } 
            iterator.numberOfModelsFoundSoFar();
            org.junit.Assert.fail("checkModelIterationWithExactlylitNum19 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithExactlylitNum21_failAssert8() throws Exception, ContradictionException, TimeoutException {
        try {
            ISolver solver = SolverFactory.newDefault();
            solver.newVar(5);
            solver.setExpectedNumberOfClauses(1);
            solver.addClause(new VecInt(new int[]{ 1, 0, 3, 4, 5 }));
            solver.addExactly(new VecInt(new int[]{ 1, 2, 3 }), 1);
            ModelIterator iterator = new ModelIterator(solver);
            while (iterator.isSatisfiable()) {
                iterator.model();
            } 
            iterator.numberOfModelsFoundSoFar();
            org.junit.Assert.fail("checkModelIterationWithExactlylitNum21 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithExactlylitNum41_failAssert18() throws Exception, ContradictionException, TimeoutException {
        try {
            ISolver solver = SolverFactory.newDefault();
            solver.newVar(5);
            solver.setExpectedNumberOfClauses(1);
            solver.addClause(new VecInt(new int[]{ 1, 2, 3, 4, 5 }));
            solver.addExactly(new VecInt(new int[]{ 2, 2, 3 }), 1);
            ModelIterator iterator = new ModelIterator(solver);
            while (iterator.isSatisfiable()) {
                iterator.model();
            } 
            iterator.numberOfModelsFoundSoFar();
            org.junit.Assert.fail("checkModelIterationWithExactlylitNum41 should have thrown ContradictionException");
        } catch (ContradictionException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithExactlylitNum42_failAssert19() throws Exception, ContradictionException, TimeoutException {
        try {
            ISolver solver = SolverFactory.newDefault();
            solver.newVar(5);
            solver.setExpectedNumberOfClauses(1);
            solver.addClause(new VecInt(new int[]{ 1, 2, 3, 4, 5 }));
            solver.addExactly(new VecInt(new int[]{ 0, 2, 3 }), 1);
            ModelIterator iterator = new ModelIterator(solver);
            while (iterator.isSatisfiable()) {
                iterator.model();
            } 
            iterator.numberOfModelsFoundSoFar();
            org.junit.Assert.fail("checkModelIterationWithExactlylitNum42 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithExactlylitNum43_failAssert20() throws Exception, ContradictionException, TimeoutException {
        try {
            ISolver solver = SolverFactory.newDefault();
            solver.newVar(5);
            solver.setExpectedNumberOfClauses(1);
            solver.addClause(new VecInt(new int[]{ 1, 2, 3, 4, 5 }));
            solver.addExactly(new VecInt(new int[]{ Integer.MAX_VALUE, 2, 3 }), 1);
            ModelIterator iterator = new ModelIterator(solver);
            while (iterator.isSatisfiable()) {
                iterator.model();
            } 
            iterator.numberOfModelsFoundSoFar();
            org.junit.Assert.fail("checkModelIterationWithExactlylitNum43 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithExactlylitNum47_failAssert23() throws Exception, ContradictionException, TimeoutException {
        try {
            ISolver solver = SolverFactory.newDefault();
            solver.newVar(5);
            solver.setExpectedNumberOfClauses(1);
            solver.addClause(new VecInt(new int[]{ 1, 2, 3, 4, 5 }));
            solver.addExactly(new VecInt(new int[]{ 1, 1, 3 }), 1);
            ModelIterator iterator = new ModelIterator(solver);
            while (iterator.isSatisfiable()) {
                iterator.model();
            } 
            iterator.numberOfModelsFoundSoFar();
            org.junit.Assert.fail("checkModelIterationWithExactlylitNum47 should have thrown ContradictionException");
        } catch (ContradictionException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithExactlylitNum60_failAssert31() throws Exception, ContradictionException, TimeoutException {
        try {
            ISolver solver = SolverFactory.newDefault();
            solver.newVar(5);
            solver.setExpectedNumberOfClauses(1);
            solver.addClause(new VecInt(new int[]{ 1, 2, 3, 4, 5 }));
            solver.addExactly(new VecInt(new int[]{ 1, 2, 3 }), Integer.MAX_VALUE);
            ModelIterator iterator = new ModelIterator(solver);
            while (iterator.isSatisfiable()) {
                iterator.model();
            } 
            iterator.numberOfModelsFoundSoFar();
            org.junit.Assert.fail("checkModelIterationWithExactlylitNum60 should have thrown ContradictionException");
        } catch (ContradictionException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithExactlylitNum15_failAssert5_add919_failAssert33() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                ISolver solver = SolverFactory.newDefault();
                solver.newVar(5);
                solver.setExpectedNumberOfClauses(1);
                solver.addClause(new VecInt(new int[]{ Integer.MIN_VALUE, 2, 3, 4, 5 }));
                solver.addClause(new VecInt(new int[]{ Integer.MIN_VALUE, 2, 3, 4, 5 }));
                solver.addExactly(new VecInt(new int[]{ 1, 2, 3 }), 1);
                ModelIterator iterator = new ModelIterator(solver);
                while (iterator.isSatisfiable()) {
                    iterator.model();
                } 
                iterator.numberOfModelsFoundSoFar();
                org.junit.Assert.fail("checkModelIterationWithExactlylitNum15 should have thrown ArrayIndexOutOfBoundsException");
            }
            org.junit.Assert.fail("checkModelIterationWithExactlylitNum15_failAssert5_add919 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-2147483648", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithExactlylitNum43_failAssert20_add533_failAssert34() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                ISolver solver = SolverFactory.newDefault();
                solver.newVar(5);
                solver.setExpectedNumberOfClauses(1);
                solver.addClause(new VecInt(new int[]{ 1, 2, 3, 4, 5 }));
                solver.addExactly(new VecInt(new int[]{ Integer.MAX_VALUE, 2, 3 }), 1);
                solver.addExactly(new VecInt(new int[]{ Integer.MAX_VALUE, 2, 3 }), 1);
                ModelIterator iterator = new ModelIterator(solver);
                while (iterator.isSatisfiable()) {
                    iterator.model();
                } 
                iterator.numberOfModelsFoundSoFar();
                org.junit.Assert.fail("checkModelIterationWithExactlylitNum43 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("checkModelIterationWithExactlylitNum43_failAssert20_add533 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithExactlylitNum19_failAssert6_add877_failAssert35() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                ISolver solver = SolverFactory.newDefault();
                solver.newVar(5);
                solver.setExpectedNumberOfClauses(1);
                solver.addClause(new VecInt(new int[]{ 1, Integer.MAX_VALUE, 3, 4, 5 }));
                solver.addClause(new VecInt(new int[]{ 1, Integer.MAX_VALUE, 3, 4, 5 }));
                solver.addExactly(new VecInt(new int[]{ 1, 2, 3 }), 1);
                ModelIterator iterator = new ModelIterator(solver);
                while (iterator.isSatisfiable()) {
                    iterator.model();
                } 
                iterator.numberOfModelsFoundSoFar();
                org.junit.Assert.fail("checkModelIterationWithExactlylitNum19 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("checkModelIterationWithExactlylitNum19_failAssert6_add877 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithExactlylitNum14_failAssert4_add985_failAssert36() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                ISolver solver = SolverFactory.newDefault();
                solver.newVar(5);
                solver.setExpectedNumberOfClauses(1);
                solver.addClause(new VecInt(new int[]{ Integer.MAX_VALUE, 2, 3, 4, 5 }));
                solver.addClause(new VecInt(new int[]{ Integer.MAX_VALUE, 2, 3, 4, 5 }));
                solver.addExactly(new VecInt(new int[]{ 1, 2, 3 }), 1);
                ModelIterator iterator = new ModelIterator(solver);
                while (iterator.isSatisfiable()) {
                    iterator.model();
                } 
                iterator.numberOfModelsFoundSoFar();
                org.junit.Assert.fail("checkModelIterationWithExactlylitNum14 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("checkModelIterationWithExactlylitNum14_failAssert4_add985 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithExactlylitNum60_failAssert31_add476_failAssert37() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                ISolver solver = SolverFactory.newDefault();
                solver.newVar(5);
                solver.setExpectedNumberOfClauses(1);
                solver.addClause(new VecInt(new int[]{ 1, 2, 3, 4, 5 }));
                solver.addExactly(new VecInt(new int[]{ 1, 2, 3 }), Integer.MAX_VALUE);
                solver.addExactly(new VecInt(new int[]{ 1, 2, 3 }), Integer.MAX_VALUE);
                ModelIterator iterator = new ModelIterator(solver);
                while (iterator.isSatisfiable()) {
                    iterator.model();
                } 
                iterator.numberOfModelsFoundSoFar();
                org.junit.Assert.fail("checkModelIterationWithExactlylitNum60 should have thrown ContradictionException");
            }
            org.junit.Assert.fail("checkModelIterationWithExactlylitNum60_failAssert31_add476 should have thrown ContradictionException");
        } catch (ContradictionException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithExactlylitNum42_failAssert19_add645_failAssert39() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                ISolver solver = SolverFactory.newDefault();
                solver.newVar(5);
                solver.setExpectedNumberOfClauses(1);
                solver.addClause(new VecInt(new int[]{ 1, 2, 3, 4, 5 }));
                solver.addClause(new VecInt(new int[]{ 1, 2, 3, 4, 5 }));
                solver.addExactly(new VecInt(new int[]{ 0, 2, 3 }), 1);
                ModelIterator iterator = new ModelIterator(solver);
                while (iterator.isSatisfiable()) {
                    iterator.model();
                } 
                iterator.numberOfModelsFoundSoFar();
                org.junit.Assert.fail("checkModelIterationWithExactlylitNum42 should have thrown IllegalArgumentException");
            }
            org.junit.Assert.fail("checkModelIterationWithExactlylitNum42_failAssert19_add645 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithExactlylitNum42_failAssert19_add651_failAssert40() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                ISolver solver = SolverFactory.newDefault();
                solver.newVar(5);
                solver.setExpectedNumberOfClauses(1);
                solver.addClause(new VecInt(new int[]{ 1, 2, 3, 4, 5 }));
                solver.addExactly(new VecInt(new int[]{ 0, 2, 3 }), 1);
                solver.addExactly(new VecInt(new int[]{ 0, 2, 3 }), 1);
                ModelIterator iterator = new ModelIterator(solver);
                while (iterator.isSatisfiable()) {
                    iterator.model();
                } 
                iterator.numberOfModelsFoundSoFar();
                org.junit.Assert.fail("checkModelIterationWithExactlylitNum42 should have thrown IllegalArgumentException");
            }
            org.junit.Assert.fail("checkModelIterationWithExactlylitNum42_failAssert19_add651 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithExactlylitNum21_failAssert8_add446_failAssert41() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                ISolver solver = SolverFactory.newDefault();
                solver.newVar(5);
                solver.setExpectedNumberOfClauses(1);
                solver.addClause(new VecInt(new int[]{ 1, 0, 3, 4, 5 }));
                solver.addClause(new VecInt(new int[]{ 1, 0, 3, 4, 5 }));
                solver.addExactly(new VecInt(new int[]{ 1, 2, 3 }), 1);
                ModelIterator iterator = new ModelIterator(solver);
                while (iterator.isSatisfiable()) {
                    iterator.model();
                } 
                iterator.numberOfModelsFoundSoFar();
                org.junit.Assert.fail("checkModelIterationWithExactlylitNum21 should have thrown IllegalArgumentException");
            }
            org.junit.Assert.fail("checkModelIterationWithExactlylitNum21_failAssert8_add446 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithExactlylitNum13_failAssert3_add832_failAssert42() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                ISolver solver = SolverFactory.newDefault();
                solver.newVar(5);
                solver.setExpectedNumberOfClauses(1);
                solver.addClause(new VecInt(new int[]{ 0, 2, 3, 4, 5 }));
                solver.addClause(new VecInt(new int[]{ 0, 2, 3, 4, 5 }));
                solver.addExactly(new VecInt(new int[]{ 1, 2, 3 }), 1);
                ModelIterator iterator = new ModelIterator(solver);
                while (iterator.isSatisfiable()) {
                    iterator.model();
                } 
                iterator.numberOfModelsFoundSoFar();
                org.junit.Assert.fail("checkModelIterationWithExactlylitNum13 should have thrown IllegalArgumentException");
            }
            org.junit.Assert.fail("checkModelIterationWithExactlylitNum13_failAssert3_add832 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithExactlylitNum43_failAssert20_add528_failAssert45() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                ISolver solver = SolverFactory.newDefault();
                solver.newVar(5);
                solver.setExpectedNumberOfClauses(1);
                solver.addClause(new VecInt(new int[]{ 1, 2, 3, 4, 5 }));
                solver.addClause(new VecInt(new int[]{ 1, 2, 3, 4, 5 }));
                solver.addExactly(new VecInt(new int[]{ Integer.MAX_VALUE, 2, 3 }), 1);
                ModelIterator iterator = new ModelIterator(solver);
                while (iterator.isSatisfiable()) {
                    iterator.model();
                } 
                iterator.numberOfModelsFoundSoFar();
                org.junit.Assert.fail("checkModelIterationWithExactlylitNum43 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("checkModelIterationWithExactlylitNum43_failAssert20_add528 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithExactlylitNum3_failAssert0_add917_failAssert48() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                ISolver solver = SolverFactory.newDefault();
                solver.newVar(Integer.MAX_VALUE);
                solver.setExpectedNumberOfClauses(1);
                solver.addClause(new VecInt(new int[]{ 1, 2, 3, 4, 5 }));
                solver.addClause(new VecInt(new int[]{ 1, 2, 3, 4, 5 }));
                solver.addExactly(new VecInt(new int[]{ 1, 2, 3 }), 1);
                ModelIterator iterator = new ModelIterator(solver);
                while (iterator.isSatisfiable()) {
                    iterator.model();
                } 
                iterator.numberOfModelsFoundSoFar();
                org.junit.Assert.fail("checkModelIterationWithExactlylitNum3 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("checkModelIterationWithExactlylitNum3_failAssert0_add917 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithExactlylitNum4_failAssert1_add610_failAssert49() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                ISolver solver = SolverFactory.newDefault();
                solver.newVar(Integer.MIN_VALUE);
                solver.setExpectedNumberOfClauses(1);
                solver.addClause(new VecInt(new int[]{ 1, 2, 3, 4, 5 }));
                solver.addClause(new VecInt(new int[]{ 1, 2, 3, 4, 5 }));
                solver.addExactly(new VecInt(new int[]{ 1, 2, 3 }), 1);
                ModelIterator iterator = new ModelIterator(solver);
                while (iterator.isSatisfiable()) {
                    iterator.model();
                } 
                iterator.numberOfModelsFoundSoFar();
                org.junit.Assert.fail("checkModelIterationWithExactlylitNum4 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("checkModelIterationWithExactlylitNum4_failAssert1_add610 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithExactlylitNum4_failAssert1_add612_failAssert51() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                ISolver solver = SolverFactory.newDefault();
                solver.newVar(Integer.MIN_VALUE);
                solver.setExpectedNumberOfClauses(1);
                solver.addClause(new VecInt(new int[]{ 1, 2, 3, 4, 5 }));
                solver.addExactly(new VecInt(new int[]{ 1, 2, 3 }), 1);
                solver.addExactly(new VecInt(new int[]{ 1, 2, 3 }), 1);
                ModelIterator iterator = new ModelIterator(solver);
                while (iterator.isSatisfiable()) {
                    iterator.model();
                } 
                iterator.numberOfModelsFoundSoFar();
                org.junit.Assert.fail("checkModelIterationWithExactlylitNum4 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("checkModelIterationWithExactlylitNum4_failAssert1_add612 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithExactlylitNum60_failAssert31_add473_failAssert52() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                ISolver solver = SolverFactory.newDefault();
                solver.newVar(5);
                solver.setExpectedNumberOfClauses(1);
                solver.addClause(new VecInt(new int[]{ 1, 2, 3, 4, 5 }));
                solver.addClause(new VecInt(new int[]{ 1, 2, 3, 4, 5 }));
                solver.addExactly(new VecInt(new int[]{ 1, 2, 3 }), Integer.MAX_VALUE);
                ModelIterator iterator = new ModelIterator(solver);
                while (iterator.isSatisfiable()) {
                    iterator.model();
                } 
                iterator.numberOfModelsFoundSoFar();
                org.junit.Assert.fail("checkModelIterationWithExactlylitNum60 should have thrown ContradictionException");
            }
            org.junit.Assert.fail("checkModelIterationWithExactlylitNum60_failAssert31_add473 should have thrown ContradictionException");
        } catch (ContradictionException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithExactlylitNum41_failAssert18litNum513_failAssert56() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                ISolver solver = SolverFactory.newDefault();
                solver.newVar(5);
                solver.setExpectedNumberOfClauses(1);
                solver.addClause(new VecInt(new int[]{ 1, 2, 3, 4, 6 }));
                solver.addExactly(new VecInt(new int[]{ 2, 2, 3 }), 1);
                ModelIterator iterator = new ModelIterator(solver);
                while (iterator.isSatisfiable()) {
                    iterator.model();
                } 
                iterator.numberOfModelsFoundSoFar();
                org.junit.Assert.fail("checkModelIterationWithExactlylitNum41 should have thrown ContradictionException");
            }
            org.junit.Assert.fail("checkModelIterationWithExactlylitNum41_failAssert18litNum513 should have thrown ContradictionException");
        } catch (ContradictionException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithExactlylitNum47_failAssert23litNum320_failAssert59() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                ISolver solver = SolverFactory.newDefault();
                solver.newVar(5);
                solver.setExpectedNumberOfClauses(1);
                solver.addClause(new VecInt(new int[]{ 1, 2, 3, 4, 5 }));
                solver.addExactly(new VecInt(new int[]{ 1, 1, 3 }), 0);
                ModelIterator iterator = new ModelIterator(solver);
                while (iterator.isSatisfiable()) {
                    iterator.model();
                } 
                iterator.numberOfModelsFoundSoFar();
                org.junit.Assert.fail("checkModelIterationWithExactlylitNum47 should have thrown ContradictionException");
            }
            org.junit.Assert.fail("checkModelIterationWithExactlylitNum47_failAssert23litNum320 should have thrown ContradictionException");
        } catch (ContradictionException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithExactlylitNum41_failAssert18litNum516_failAssert60() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                ISolver solver = SolverFactory.newDefault();
                solver.newVar(5);
                solver.setExpectedNumberOfClauses(1);
                solver.addClause(new VecInt(new int[]{ 1, 2, 3, 4, 4 }));
                solver.addExactly(new VecInt(new int[]{ 2, 2, 3 }), 1);
                ModelIterator iterator = new ModelIterator(solver);
                while (iterator.isSatisfiable()) {
                    iterator.model();
                } 
                iterator.numberOfModelsFoundSoFar();
                org.junit.Assert.fail("checkModelIterationWithExactlylitNum41 should have thrown ContradictionException");
            }
            org.junit.Assert.fail("checkModelIterationWithExactlylitNum41_failAssert18litNum516 should have thrown ContradictionException");
        } catch (ContradictionException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithExactlylitNum6_failAssert2litNum700_failAssert95() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                ISolver solver = SolverFactory.newDefault();
                solver.newVar(-395967801);
                solver.setExpectedNumberOfClauses(1);
                solver.addClause(new VecInt(new int[]{ 1, 2, 3, 4, 0 }));
                solver.addExactly(new VecInt(new int[]{ 1, 2, 3 }), 1);
                ModelIterator iterator = new ModelIterator(solver);
                while (iterator.isSatisfiable()) {
                    iterator.model();
                } 
                iterator.numberOfModelsFoundSoFar();
                org.junit.Assert.fail("checkModelIterationWithExactlylitNum6 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("checkModelIterationWithExactlylitNum6_failAssert2litNum700 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithExactlylitNum6_failAssert2litNum722_failAssert96() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                ISolver solver = SolverFactory.newDefault();
                solver.newVar(-395967801);
                solver.setExpectedNumberOfClauses(1);
                solver.addClause(new VecInt(new int[]{ 1, 2, 3, 4, 5 }));
                solver.addExactly(new VecInt(new int[]{ 1, 0, 3 }), 1);
                ModelIterator iterator = new ModelIterator(solver);
                while (iterator.isSatisfiable()) {
                    iterator.model();
                } 
                iterator.numberOfModelsFoundSoFar();
                org.junit.Assert.fail("checkModelIterationWithExactlylitNum6 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("checkModelIterationWithExactlylitNum6_failAssert2litNum722 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithExactlylitNum6_failAssert2litNum634_failAssert98() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                ISolver solver = SolverFactory.newDefault();
                solver.newVar(-395967801);
                solver.setExpectedNumberOfClauses(1);
                solver.addClause(new VecInt(new int[]{ 0, 2, 3, 4, 5 }));
                solver.addExactly(new VecInt(new int[]{ 1, 2, 3 }), 1);
                ModelIterator iterator = new ModelIterator(solver);
                while (iterator.isSatisfiable()) {
                    iterator.model();
                } 
                iterator.numberOfModelsFoundSoFar();
                org.junit.Assert.fail("checkModelIterationWithExactlylitNum6 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("checkModelIterationWithExactlylitNum6_failAssert2litNum634 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithExactlylitNum6_failAssert2litNum661_failAssert99() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                ISolver solver = SolverFactory.newDefault();
                solver.newVar(-395967801);
                solver.setExpectedNumberOfClauses(1);
                solver.addClause(new VecInt(new int[]{ 1, 2, 2, 4, 5 }));
                solver.addExactly(new VecInt(new int[]{ 1, 2, 3 }), 1);
                ModelIterator iterator = new ModelIterator(solver);
                while (iterator.isSatisfiable()) {
                    iterator.model();
                } 
                iterator.numberOfModelsFoundSoFar();
                org.junit.Assert.fail("checkModelIterationWithExactlylitNum6 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("checkModelIterationWithExactlylitNum6_failAssert2litNum661 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithExactlylitNum6_failAssert2litNum704_failAssert100() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                ISolver solver = SolverFactory.newDefault();
                solver.newVar(-395967801);
                solver.setExpectedNumberOfClauses(1);
                solver.addClause(new VecInt(new int[]{ 1, 2, 3, 4, 5 }));
                solver.addExactly(new VecInt(new int[]{ 2, 2, 3 }), 1);
                ModelIterator iterator = new ModelIterator(solver);
                while (iterator.isSatisfiable()) {
                    iterator.model();
                } 
                iterator.numberOfModelsFoundSoFar();
                org.junit.Assert.fail("checkModelIterationWithExactlylitNum6 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("checkModelIterationWithExactlylitNum6_failAssert2litNum704 should have thrown ContradictionException");
        } catch (ContradictionException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithExactlylitNum6_failAssert2litNum742_failAssert103() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                ISolver solver = SolverFactory.newDefault();
                solver.newVar(-395967801);
                solver.setExpectedNumberOfClauses(1);
                solver.addClause(new VecInt(new int[]{ 1, 2, 3, 4, 5 }));
                solver.addExactly(new VecInt(new int[]{ 1, 2, 3 }), 0);
                ModelIterator iterator = new ModelIterator(solver);
                while (iterator.isSatisfiable()) {
                    iterator.model();
                } 
                iterator.numberOfModelsFoundSoFar();
                org.junit.Assert.fail("checkModelIterationWithExactlylitNum6 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("checkModelIterationWithExactlylitNum6_failAssert2litNum742 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithExactlylitNum6_failAssert2litNum739_failAssert119() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                ISolver solver = SolverFactory.newDefault();
                solver.newVar(-395967801);
                solver.setExpectedNumberOfClauses(1);
                solver.addClause(new VecInt(new int[]{ 1, 2, 3, 4, 5 }));
                solver.addExactly(new VecInt(new int[]{ 1, 2, 3 }), 2);
                ModelIterator iterator = new ModelIterator(solver);
                while (iterator.isSatisfiable()) {
                    iterator.model();
                } 
                iterator.numberOfModelsFoundSoFar();
                org.junit.Assert.fail("checkModelIterationWithExactlylitNum6 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("checkModelIterationWithExactlylitNum6_failAssert2litNum739 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithExactlylitNum6_failAssert2litNum748_failAssert128() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                ISolver solver = SolverFactory.newDefault();
                solver.newVar(-395967801);
                solver.setExpectedNumberOfClauses(1);
                solver.addClause(new VecInt(new int[]{ 1, 2, 3, 4, 5 }));
                solver.addExactly(new VecInt(new int[]{ 1, 2, 3 }), 1340285504);
                ModelIterator iterator = new ModelIterator(solver);
                while (iterator.isSatisfiable()) {
                    iterator.model();
                } 
                iterator.numberOfModelsFoundSoFar();
                org.junit.Assert.fail("checkModelIterationWithExactlylitNum6 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("checkModelIterationWithExactlylitNum6_failAssert2litNum748 should have thrown ContradictionException");
        } catch (ContradictionException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithExactlylitNum47_failAssert23_add344_failAssert148() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                ISolver solver = SolverFactory.newDefault();
                solver.newVar(5);
                solver.setExpectedNumberOfClauses(1);
                solver.addClause(new VecInt(new int[]{ 1, 2, 3, 4, 5 }));
                solver.addClause(new VecInt(new int[]{ 1, 2, 3, 4, 5 }));
                solver.addExactly(new VecInt(new int[]{ 1, 1, 3 }), 1);
                ModelIterator iterator = new ModelIterator(solver);
                while (iterator.isSatisfiable()) {
                    iterator.model();
                } 
                iterator.numberOfModelsFoundSoFar();
                org.junit.Assert.fail("checkModelIterationWithExactlylitNum47 should have thrown ContradictionException");
            }
            org.junit.Assert.fail("checkModelIterationWithExactlylitNum47_failAssert23_add344 should have thrown ContradictionException");
        } catch (ContradictionException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithExactlylitNum4_failAssert1_add619_failAssert154() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                ISolver solver = SolverFactory.newDefault();
                solver.newVar(Integer.MIN_VALUE);
                solver.setExpectedNumberOfClauses(1);
                solver.addClause(new VecInt(new int[]{ 1, 2, 3, 4, 5 }));
                solver.addExactly(new VecInt(new int[]{ 1, 2, 3 }), 1);
                ModelIterator iterator = new ModelIterator(solver);
                while (iterator.isSatisfiable()) {
                    iterator.model();
                } 
                iterator.numberOfModelsFoundSoFar();
                iterator.numberOfModelsFoundSoFar();
                org.junit.Assert.fail("checkModelIterationWithExactlylitNum4 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("checkModelIterationWithExactlylitNum4_failAssert1_add619 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithExactlylitNum41_failAssert18_add613_failAssert155() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                ISolver solver = SolverFactory.newDefault();
                solver.newVar(5);
                solver.newVar(5);
                solver.setExpectedNumberOfClauses(1);
                solver.addClause(new VecInt(new int[]{ 1, 2, 3, 4, 5 }));
                solver.addExactly(new VecInt(new int[]{ 2, 2, 3 }), 1);
                ModelIterator iterator = new ModelIterator(solver);
                while (iterator.isSatisfiable()) {
                    iterator.model();
                } 
                iterator.numberOfModelsFoundSoFar();
                org.junit.Assert.fail("checkModelIterationWithExactlylitNum41 should have thrown ContradictionException");
            }
            org.junit.Assert.fail("checkModelIterationWithExactlylitNum41_failAssert18_add613 should have thrown ContradictionException");
        } catch (ContradictionException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithExactlylitNum15_failAssert5litNum693_failAssert168() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                ISolver solver = SolverFactory.newDefault();
                solver.newVar(Integer.MIN_VALUE);
                solver.setExpectedNumberOfClauses(1);
                solver.addClause(new VecInt(new int[]{ Integer.MIN_VALUE, 2, 3, 4, 5 }));
                solver.addExactly(new VecInt(new int[]{ 1, 2, 3 }), 1);
                ModelIterator iterator = new ModelIterator(solver);
                while (iterator.isSatisfiable()) {
                    iterator.model();
                } 
                iterator.numberOfModelsFoundSoFar();
                org.junit.Assert.fail("checkModelIterationWithExactlylitNum15 should have thrown ArrayIndexOutOfBoundsException");
            }
            org.junit.Assert.fail("checkModelIterationWithExactlylitNum15_failAssert5litNum693 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-2147483648", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithExactlylitNum60_failAssert31litNum414_failAssert196() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                ISolver solver = SolverFactory.newDefault();
                solver.newVar(5);
                solver.setExpectedNumberOfClauses(1);
                solver.addClause(new VecInt(new int[]{ 1, 2, 3, 5, 5 }));
                solver.addExactly(new VecInt(new int[]{ 1, 2, 3 }), Integer.MAX_VALUE);
                ModelIterator iterator = new ModelIterator(solver);
                while (iterator.isSatisfiable()) {
                    iterator.model();
                } 
                iterator.numberOfModelsFoundSoFar();
                org.junit.Assert.fail("checkModelIterationWithExactlylitNum60 should have thrown ContradictionException");
            }
            org.junit.Assert.fail("checkModelIterationWithExactlylitNum60_failAssert31litNum414 should have thrown ContradictionException");
        } catch (ContradictionException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithExactlylitNum60_failAssert31litNum423_failAssert198() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                ISolver solver = SolverFactory.newDefault();
                solver.newVar(5);
                solver.setExpectedNumberOfClauses(1);
                solver.addClause(new VecInt(new int[]{ 1, 2, 3, 4, 6 }));
                solver.addExactly(new VecInt(new int[]{ 1, 2, 3 }), Integer.MAX_VALUE);
                ModelIterator iterator = new ModelIterator(solver);
                while (iterator.isSatisfiable()) {
                    iterator.model();
                } 
                iterator.numberOfModelsFoundSoFar();
                org.junit.Assert.fail("checkModelIterationWithExactlylitNum60 should have thrown ContradictionException");
            }
            org.junit.Assert.fail("checkModelIterationWithExactlylitNum60_failAssert31litNum423 should have thrown ContradictionException");
        } catch (ContradictionException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithExactlylitNum15_failAssert5_add919_failAssert33_add3149_failAssert208() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    ISolver solver = SolverFactory.newDefault();
                    solver.newVar(5);
                    solver.setExpectedNumberOfClauses(1);
                    solver.addClause(new VecInt(new int[]{ Integer.MIN_VALUE, 2, 3, 4, 5 }));
                    solver.addClause(new VecInt(new int[]{ Integer.MIN_VALUE, 2, 3, 4, 5 }));
                    solver.addClause(new VecInt(new int[]{ Integer.MIN_VALUE, 2, 3, 4, 5 }));
                    solver.addExactly(new VecInt(new int[]{ 1, 2, 3 }), 1);
                    ModelIterator iterator = new ModelIterator(solver);
                    while (iterator.isSatisfiable()) {
                        iterator.model();
                    } 
                    iterator.numberOfModelsFoundSoFar();
                    org.junit.Assert.fail("checkModelIterationWithExactlylitNum15 should have thrown ArrayIndexOutOfBoundsException");
                }
                org.junit.Assert.fail("checkModelIterationWithExactlylitNum15_failAssert5_add919 should have thrown ArrayIndexOutOfBoundsException");
            }
            org.junit.Assert.fail("checkModelIterationWithExactlylitNum15_failAssert5_add919_failAssert33_add3149 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-2147483648", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithExactlylitNum43_failAssert20_add533_failAssert34_add2814_failAssert210() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    ISolver solver = SolverFactory.newDefault();
                    solver.newVar(5);
                    solver.setExpectedNumberOfClauses(1);
                    solver.addClause(new VecInt(new int[]{ 1, 2, 3, 4, 5 }));
                    solver.addExactly(new VecInt(new int[]{ Integer.MAX_VALUE, 2, 3 }), 1);
                    solver.addExactly(new VecInt(new int[]{ Integer.MAX_VALUE, 2, 3 }), 1);
                    solver.addExactly(new VecInt(new int[]{ Integer.MAX_VALUE, 2, 3 }), 1);
                    ModelIterator iterator = new ModelIterator(solver);
                    while (iterator.isSatisfiable()) {
                        iterator.model();
                    } 
                    iterator.numberOfModelsFoundSoFar();
                    org.junit.Assert.fail("checkModelIterationWithExactlylitNum43 should have thrown NegativeArraySizeException");
                }
                org.junit.Assert.fail("checkModelIterationWithExactlylitNum43_failAssert20_add533 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("checkModelIterationWithExactlylitNum43_failAssert20_add533_failAssert34_add2814 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithExactlylitNum19_failAssert6_add877_failAssert35_add3076_failAssert212() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    ISolver solver = SolverFactory.newDefault();
                    solver.newVar(5);
                    solver.setExpectedNumberOfClauses(1);
                    solver.addClause(new VecInt(new int[]{ 1, Integer.MAX_VALUE, 3, 4, 5 }));
                    solver.addClause(new VecInt(new int[]{ 1, Integer.MAX_VALUE, 3, 4, 5 }));
                    solver.addClause(new VecInt(new int[]{ 1, Integer.MAX_VALUE, 3, 4, 5 }));
                    solver.addExactly(new VecInt(new int[]{ 1, 2, 3 }), 1);
                    ModelIterator iterator = new ModelIterator(solver);
                    while (iterator.isSatisfiable()) {
                        iterator.model();
                    } 
                    iterator.numberOfModelsFoundSoFar();
                    org.junit.Assert.fail("checkModelIterationWithExactlylitNum19 should have thrown NegativeArraySizeException");
                }
                org.junit.Assert.fail("checkModelIterationWithExactlylitNum19_failAssert6_add877 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("checkModelIterationWithExactlylitNum19_failAssert6_add877_failAssert35_add3076 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithExactlylitNum14_failAssert4_add985_failAssert36_add1777_failAssert214() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    ISolver solver = SolverFactory.newDefault();
                    solver.newVar(5);
                    solver.setExpectedNumberOfClauses(1);
                    solver.addClause(new VecInt(new int[]{ Integer.MAX_VALUE, 2, 3, 4, 5 }));
                    solver.addClause(new VecInt(new int[]{ Integer.MAX_VALUE, 2, 3, 4, 5 }));
                    solver.addClause(new VecInt(new int[]{ Integer.MAX_VALUE, 2, 3, 4, 5 }));
                    solver.addExactly(new VecInt(new int[]{ 1, 2, 3 }), 1);
                    ModelIterator iterator = new ModelIterator(solver);
                    while (iterator.isSatisfiable()) {
                        iterator.model();
                    } 
                    iterator.numberOfModelsFoundSoFar();
                    org.junit.Assert.fail("checkModelIterationWithExactlylitNum14 should have thrown NegativeArraySizeException");
                }
                org.junit.Assert.fail("checkModelIterationWithExactlylitNum14_failAssert4_add985 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("checkModelIterationWithExactlylitNum14_failAssert4_add985_failAssert36_add1777 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithExactlylitNum60_failAssert31_add476_failAssert37_add2255_failAssert216() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    ISolver solver = SolverFactory.newDefault();
                    solver.newVar(5);
                    solver.setExpectedNumberOfClauses(1);
                    solver.addClause(new VecInt(new int[]{ 1, 2, 3, 4, 5 }));
                    solver.addExactly(new VecInt(new int[]{ 1, 2, 3 }), Integer.MAX_VALUE);
                    solver.addExactly(new VecInt(new int[]{ 1, 2, 3 }), Integer.MAX_VALUE);
                    solver.addExactly(new VecInt(new int[]{ 1, 2, 3 }), Integer.MAX_VALUE);
                    ModelIterator iterator = new ModelIterator(solver);
                    while (iterator.isSatisfiable()) {
                        iterator.model();
                    } 
                    iterator.numberOfModelsFoundSoFar();
                    org.junit.Assert.fail("checkModelIterationWithExactlylitNum60 should have thrown ContradictionException");
                }
                org.junit.Assert.fail("checkModelIterationWithExactlylitNum60_failAssert31_add476 should have thrown ContradictionException");
            }
            org.junit.Assert.fail("checkModelIterationWithExactlylitNum60_failAssert31_add476_failAssert37_add2255 should have thrown ContradictionException");
        } catch (ContradictionException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithExactlylitNum43_failAssert20_add528_failAssert45_add1762_failAssert219() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    ISolver solver = SolverFactory.newDefault();
                    solver.newVar(5);
                    solver.setExpectedNumberOfClauses(1);
                    solver.addClause(new VecInt(new int[]{ 1, 2, 3, 4, 5 }));
                    solver.addClause(new VecInt(new int[]{ 1, 2, 3, 4, 5 }));
                    solver.addExactly(new VecInt(new int[]{ Integer.MAX_VALUE, 2, 3 }), 1);
                    solver.addExactly(new VecInt(new int[]{ Integer.MAX_VALUE, 2, 3 }), 1);
                    ModelIterator iterator = new ModelIterator(solver);
                    while (iterator.isSatisfiable()) {
                        iterator.model();
                    } 
                    iterator.numberOfModelsFoundSoFar();
                    org.junit.Assert.fail("checkModelIterationWithExactlylitNum43 should have thrown NegativeArraySizeException");
                }
                org.junit.Assert.fail("checkModelIterationWithExactlylitNum43_failAssert20_add528 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("checkModelIterationWithExactlylitNum43_failAssert20_add528_failAssert45_add1762 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithExactlylitNum41_failAssert18litNum516_failAssert60litNum2211_failAssert223() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    ISolver solver = SolverFactory.newDefault();
                    solver.newVar(5);
                    solver.setExpectedNumberOfClauses(1);
                    solver.addClause(new VecInt(new int[]{ 1, 2, 3, 4, 4 }));
                    solver.addExactly(new VecInt(new int[]{ 2, 2, 2 }), 1);
                    ModelIterator iterator = new ModelIterator(solver);
                    while (iterator.isSatisfiable()) {
                        iterator.model();
                    } 
                    iterator.numberOfModelsFoundSoFar();
                    org.junit.Assert.fail("checkModelIterationWithExactlylitNum41 should have thrown ContradictionException");
                }
                org.junit.Assert.fail("checkModelIterationWithExactlylitNum41_failAssert18litNum516 should have thrown ContradictionException");
            }
            org.junit.Assert.fail("checkModelIterationWithExactlylitNum41_failAssert18litNum516_failAssert60litNum2211 should have thrown ContradictionException");
        } catch (ContradictionException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithExactlylitNum41_failAssert18litNum516_failAssert60litNum2224_failAssert224() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    ISolver solver = SolverFactory.newDefault();
                    solver.newVar(5);
                    solver.setExpectedNumberOfClauses(1);
                    solver.addClause(new VecInt(new int[]{ 1, 2, 3, 4, 4 }));
                    solver.addExactly(new VecInt(new int[]{ 2, 2, 0 }), 1);
                    ModelIterator iterator = new ModelIterator(solver);
                    while (iterator.isSatisfiable()) {
                        iterator.model();
                    } 
                    iterator.numberOfModelsFoundSoFar();
                    org.junit.Assert.fail("checkModelIterationWithExactlylitNum41 should have thrown ContradictionException");
                }
                org.junit.Assert.fail("checkModelIterationWithExactlylitNum41_failAssert18litNum516 should have thrown ContradictionException");
            }
            org.junit.Assert.fail("checkModelIterationWithExactlylitNum41_failAssert18litNum516_failAssert60litNum2224 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithExactlylitNum41_failAssert18litNum516_failAssert60litNum2207_failAssert225() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    ISolver solver = SolverFactory.newDefault();
                    solver.newVar(5);
                    solver.setExpectedNumberOfClauses(1);
                    solver.addClause(new VecInt(new int[]{ 1, 2, 3, 4, 4 }));
                    solver.addExactly(new VecInt(new int[]{ 2, 2, 4 }), 1);
                    ModelIterator iterator = new ModelIterator(solver);
                    while (iterator.isSatisfiable()) {
                        iterator.model();
                    } 
                    iterator.numberOfModelsFoundSoFar();
                    org.junit.Assert.fail("checkModelIterationWithExactlylitNum41 should have thrown ContradictionException");
                }
                org.junit.Assert.fail("checkModelIterationWithExactlylitNum41_failAssert18litNum516 should have thrown ContradictionException");
            }
            org.junit.Assert.fail("checkModelIterationWithExactlylitNum41_failAssert18litNum516_failAssert60litNum2207 should have thrown ContradictionException");
        } catch (ContradictionException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithExactlylitNum41_failAssert18litNum513_failAssert56litNum2780_failAssert228() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    ISolver solver = SolverFactory.newDefault();
                    solver.newVar(5);
                    solver.setExpectedNumberOfClauses(1);
                    solver.addClause(new VecInt(new int[]{ 1, 2, 3, 4, 6 }));
                    solver.addExactly(new VecInt(new int[]{ 2, 0, 3 }), 1);
                    ModelIterator iterator = new ModelIterator(solver);
                    while (iterator.isSatisfiable()) {
                        iterator.model();
                    } 
                    iterator.numberOfModelsFoundSoFar();
                    org.junit.Assert.fail("checkModelIterationWithExactlylitNum41 should have thrown ContradictionException");
                }
                org.junit.Assert.fail("checkModelIterationWithExactlylitNum41_failAssert18litNum513 should have thrown ContradictionException");
            }
            org.junit.Assert.fail("checkModelIterationWithExactlylitNum41_failAssert18litNum513_failAssert56litNum2780 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithExactlylitNum41_failAssert18litNum513_failAssert56litNum2807_failAssert229() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    ISolver solver = SolverFactory.newDefault();
                    solver.newVar(5);
                    solver.setExpectedNumberOfClauses(1);
                    solver.addClause(new VecInt(new int[]{ 1, 2, 3, 4, 6 }));
                    solver.addExactly(new VecInt(new int[]{ 2, 2, 3 }), 0);
                    ModelIterator iterator = new ModelIterator(solver);
                    while (iterator.isSatisfiable()) {
                        iterator.model();
                    } 
                    iterator.numberOfModelsFoundSoFar();
                    org.junit.Assert.fail("checkModelIterationWithExactlylitNum41 should have thrown ContradictionException");
                }
                org.junit.Assert.fail("checkModelIterationWithExactlylitNum41_failAssert18litNum513 should have thrown ContradictionException");
            }
            org.junit.Assert.fail("checkModelIterationWithExactlylitNum41_failAssert18litNum513_failAssert56litNum2807 should have thrown ContradictionException");
        } catch (ContradictionException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithExactlylitNum41_failAssert18litNum513_failAssert56litNum2765_failAssert232() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    ISolver solver = SolverFactory.newDefault();
                    solver.newVar(5);
                    solver.setExpectedNumberOfClauses(1);
                    solver.addClause(new VecInt(new int[]{ 1, 2, 3, 4, 6 }));
                    solver.addExactly(new VecInt(new int[]{ 2, 3, 3 }), 1);
                    ModelIterator iterator = new ModelIterator(solver);
                    while (iterator.isSatisfiable()) {
                        iterator.model();
                    } 
                    iterator.numberOfModelsFoundSoFar();
                    org.junit.Assert.fail("checkModelIterationWithExactlylitNum41 should have thrown ContradictionException");
                }
                org.junit.Assert.fail("checkModelIterationWithExactlylitNum41_failAssert18litNum513 should have thrown ContradictionException");
            }
            org.junit.Assert.fail("checkModelIterationWithExactlylitNum41_failAssert18litNum513_failAssert56litNum2765 should have thrown ContradictionException");
        } catch (ContradictionException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithExactlylitNum60_failAssert31_add476_failAssert37_add2252_failAssert236() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    ISolver solver = SolverFactory.newDefault();
                    solver.newVar(5);
                    solver.setExpectedNumberOfClauses(1);
                    solver.addClause(new VecInt(new int[]{ 1, 2, 3, 4, 5 }));
                    solver.addClause(new VecInt(new int[]{ 1, 2, 3, 4, 5 }));
                    solver.addExactly(new VecInt(new int[]{ 1, 2, 3 }), Integer.MAX_VALUE);
                    solver.addExactly(new VecInt(new int[]{ 1, 2, 3 }), Integer.MAX_VALUE);
                    ModelIterator iterator = new ModelIterator(solver);
                    while (iterator.isSatisfiable()) {
                        iterator.model();
                    } 
                    iterator.numberOfModelsFoundSoFar();
                    org.junit.Assert.fail("checkModelIterationWithExactlylitNum60 should have thrown ContradictionException");
                }
                org.junit.Assert.fail("checkModelIterationWithExactlylitNum60_failAssert31_add476 should have thrown ContradictionException");
            }
            org.junit.Assert.fail("checkModelIterationWithExactlylitNum60_failAssert31_add476_failAssert37_add2252 should have thrown ContradictionException");
        } catch (ContradictionException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithExactlylitNum41_failAssert18litNum516_failAssert60litNum2228_failAssert238() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    ISolver solver = SolverFactory.newDefault();
                    solver.newVar(5);
                    solver.setExpectedNumberOfClauses(1);
                    solver.addClause(new VecInt(new int[]{ 1, 2, 3, 4, 4 }));
                    solver.addExactly(new VecInt(new int[]{ 2, 2, -25096874 }), 1);
                    ModelIterator iterator = new ModelIterator(solver);
                    while (iterator.isSatisfiable()) {
                        iterator.model();
                    } 
                    iterator.numberOfModelsFoundSoFar();
                    org.junit.Assert.fail("checkModelIterationWithExactlylitNum41 should have thrown ContradictionException");
                }
                org.junit.Assert.fail("checkModelIterationWithExactlylitNum41_failAssert18litNum516 should have thrown ContradictionException");
            }
            org.junit.Assert.fail("checkModelIterationWithExactlylitNum41_failAssert18litNum516_failAssert60litNum2228 should have thrown ContradictionException");
        } catch (ContradictionException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithExactlylitNum41_failAssert18litNum516_failAssert60litNum2245_failAssert239() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    ISolver solver = SolverFactory.newDefault();
                    solver.newVar(5);
                    solver.setExpectedNumberOfClauses(1);
                    solver.addClause(new VecInt(new int[]{ 1, 2, 3, 4, 4 }));
                    solver.addExactly(new VecInt(new int[]{ 2, 2, 3 }), -307222590);
                    ModelIterator iterator = new ModelIterator(solver);
                    while (iterator.isSatisfiable()) {
                        iterator.model();
                    } 
                    iterator.numberOfModelsFoundSoFar();
                    org.junit.Assert.fail("checkModelIterationWithExactlylitNum41 should have thrown ContradictionException");
                }
                org.junit.Assert.fail("checkModelIterationWithExactlylitNum41_failAssert18litNum516 should have thrown ContradictionException");
            }
            org.junit.Assert.fail("checkModelIterationWithExactlylitNum41_failAssert18litNum516_failAssert60litNum2245 should have thrown ContradictionException");
        } catch (ContradictionException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithExactlylitNum41_failAssert18litNum513_failAssert56litNum2820_failAssert240() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    ISolver solver = SolverFactory.newDefault();
                    solver.newVar(5);
                    solver.setExpectedNumberOfClauses(1);
                    solver.addClause(new VecInt(new int[]{ 1, 2, 3, 4, 6 }));
                    solver.addExactly(new VecInt(new int[]{ 2, 2, 3 }), -327671496);
                    ModelIterator iterator = new ModelIterator(solver);
                    while (iterator.isSatisfiable()) {
                        iterator.model();
                    } 
                    iterator.numberOfModelsFoundSoFar();
                    org.junit.Assert.fail("checkModelIterationWithExactlylitNum41 should have thrown ContradictionException");
                }
                org.junit.Assert.fail("checkModelIterationWithExactlylitNum41_failAssert18litNum513 should have thrown ContradictionException");
            }
            org.junit.Assert.fail("checkModelIterationWithExactlylitNum41_failAssert18litNum513_failAssert56litNum2820 should have thrown ContradictionException");
        } catch (ContradictionException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithExactlylitNum6_failAssert2litNum704_failAssert100litNum1770_failAssert241() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    ISolver solver = SolverFactory.newDefault();
                    solver.newVar(-395967801);
                    solver.setExpectedNumberOfClauses(1);
                    solver.addClause(new VecInt(new int[]{ 1, 2, 3, 0, 5 }));
                    solver.addExactly(new VecInt(new int[]{ 2, 2, 3 }), 1);
                    ModelIterator iterator = new ModelIterator(solver);
                    while (iterator.isSatisfiable()) {
                        iterator.model();
                    } 
                    iterator.numberOfModelsFoundSoFar();
                    org.junit.Assert.fail("checkModelIterationWithExactlylitNum6 should have thrown NegativeArraySizeException");
                }
                org.junit.Assert.fail("checkModelIterationWithExactlylitNum6_failAssert2litNum704 should have thrown ContradictionException");
            }
            org.junit.Assert.fail("checkModelIterationWithExactlylitNum6_failAssert2litNum704_failAssert100litNum1770 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithExactlylitNum6_failAssert2litNum704_failAssert100litNum1760_failAssert243() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    ISolver solver = SolverFactory.newDefault();
                    solver.newVar(-395967801);
                    solver.setExpectedNumberOfClauses(1);
                    solver.addClause(new VecInt(new int[]{ 1, 2, 3, 3, 5 }));
                    solver.addExactly(new VecInt(new int[]{ 2, 2, 3 }), 1);
                    ModelIterator iterator = new ModelIterator(solver);
                    while (iterator.isSatisfiable()) {
                        iterator.model();
                    } 
                    iterator.numberOfModelsFoundSoFar();
                    org.junit.Assert.fail("checkModelIterationWithExactlylitNum6 should have thrown NegativeArraySizeException");
                }
                org.junit.Assert.fail("checkModelIterationWithExactlylitNum6_failAssert2litNum704 should have thrown ContradictionException");
            }
            org.junit.Assert.fail("checkModelIterationWithExactlylitNum6_failAssert2litNum704_failAssert100litNum1760 should have thrown ContradictionException");
        } catch (ContradictionException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithExactlylitNum6_failAssert2litNum704_failAssert100litNum1807_failAssert245() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    ISolver solver = SolverFactory.newDefault();
                    solver.newVar(-395967801);
                    solver.setExpectedNumberOfClauses(1);
                    solver.addClause(new VecInt(new int[]{ 1, 2, 3, 4, 5 }));
                    solver.addExactly(new VecInt(new int[]{ 2, 0, 3 }), 1);
                    ModelIterator iterator = new ModelIterator(solver);
                    while (iterator.isSatisfiable()) {
                        iterator.model();
                    } 
                    iterator.numberOfModelsFoundSoFar();
                    org.junit.Assert.fail("checkModelIterationWithExactlylitNum6 should have thrown NegativeArraySizeException");
                }
                org.junit.Assert.fail("checkModelIterationWithExactlylitNum6_failAssert2litNum704 should have thrown ContradictionException");
            }
            org.junit.Assert.fail("checkModelIterationWithExactlylitNum6_failAssert2litNum704_failAssert100litNum1807 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithExactlylitNum6_failAssert2litNum704_failAssert100litNum1817_failAssert249() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    ISolver solver = SolverFactory.newDefault();
                    solver.newVar(-395967801);
                    solver.setExpectedNumberOfClauses(1);
                    solver.addClause(new VecInt(new int[]{ 1, 2, 3, 4, 5 }));
                    solver.addExactly(new VecInt(new int[]{ 2, 2, 2 }), 1);
                    ModelIterator iterator = new ModelIterator(solver);
                    while (iterator.isSatisfiable()) {
                        iterator.model();
                    } 
                    iterator.numberOfModelsFoundSoFar();
                    org.junit.Assert.fail("checkModelIterationWithExactlylitNum6 should have thrown NegativeArraySizeException");
                }
                org.junit.Assert.fail("checkModelIterationWithExactlylitNum6_failAssert2litNum704 should have thrown ContradictionException");
            }
            org.junit.Assert.fail("checkModelIterationWithExactlylitNum6_failAssert2litNum704_failAssert100litNum1817 should have thrown ContradictionException");
        } catch (ContradictionException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithExactlylitNum6_failAssert2litNum704_failAssert100litNum1797_failAssert256() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    ISolver solver = SolverFactory.newDefault();
                    solver.newVar(-395967801);
                    solver.setExpectedNumberOfClauses(1);
                    solver.addClause(new VecInt(new int[]{ 1, 2, 3, 4, 5 }));
                    solver.addExactly(new VecInt(new int[]{ 2, 1, 3 }), 1);
                    ModelIterator iterator = new ModelIterator(solver);
                    while (iterator.isSatisfiable()) {
                        iterator.model();
                    } 
                    iterator.numberOfModelsFoundSoFar();
                    org.junit.Assert.fail("checkModelIterationWithExactlylitNum6 should have thrown NegativeArraySizeException");
                }
                org.junit.Assert.fail("checkModelIterationWithExactlylitNum6_failAssert2litNum704 should have thrown ContradictionException");
            }
            org.junit.Assert.fail("checkModelIterationWithExactlylitNum6_failAssert2litNum704_failAssert100litNum1797 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithExactlylitNum6_failAssert2litNum661_failAssert99litNum1601_failAssert258() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    ISolver solver = SolverFactory.newDefault();
                    solver.newVar(-395967801);
                    solver.setExpectedNumberOfClauses(1);
                    solver.addClause(new VecInt(new int[]{ 1, 2, 2, 4, 4 }));
                    solver.addExactly(new VecInt(new int[]{ 1, 2, 3 }), 1);
                    ModelIterator iterator = new ModelIterator(solver);
                    while (iterator.isSatisfiable()) {
                        iterator.model();
                    } 
                    iterator.numberOfModelsFoundSoFar();
                    org.junit.Assert.fail("checkModelIterationWithExactlylitNum6 should have thrown NegativeArraySizeException");
                }
                org.junit.Assert.fail("checkModelIterationWithExactlylitNum6_failAssert2litNum661 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("checkModelIterationWithExactlylitNum6_failAssert2litNum661_failAssert99litNum1601 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithExactlylitNum6_failAssert2litNum661_failAssert99litNum1582_failAssert264() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    ISolver solver = SolverFactory.newDefault();
                    solver.newVar(-395967801);
                    solver.setExpectedNumberOfClauses(1);
                    solver.addClause(new VecInt(new int[]{ 1, 2, 2, 3, 5 }));
                    solver.addExactly(new VecInt(new int[]{ 1, 2, 3 }), 1);
                    ModelIterator iterator = new ModelIterator(solver);
                    while (iterator.isSatisfiable()) {
                        iterator.model();
                    } 
                    iterator.numberOfModelsFoundSoFar();
                    org.junit.Assert.fail("checkModelIterationWithExactlylitNum6 should have thrown NegativeArraySizeException");
                }
                org.junit.Assert.fail("checkModelIterationWithExactlylitNum6_failAssert2litNum661 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("checkModelIterationWithExactlylitNum6_failAssert2litNum661_failAssert99litNum1582 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithExactlylitNum6_failAssert2litNum661_failAssert99litNum1670_failAssert267() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    ISolver solver = SolverFactory.newDefault();
                    solver.newVar(-395967801);
                    solver.setExpectedNumberOfClauses(1);
                    solver.addClause(new VecInt(new int[]{ 1, 2, 2, 4, 5 }));
                    solver.addExactly(new VecInt(new int[]{ 1, 2, 3 }), 2);
                    ModelIterator iterator = new ModelIterator(solver);
                    while (iterator.isSatisfiable()) {
                        iterator.model();
                    } 
                    iterator.numberOfModelsFoundSoFar();
                    org.junit.Assert.fail("checkModelIterationWithExactlylitNum6 should have thrown NegativeArraySizeException");
                }
                org.junit.Assert.fail("checkModelIterationWithExactlylitNum6_failAssert2litNum661 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("checkModelIterationWithExactlylitNum6_failAssert2litNum661_failAssert99litNum1670 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithExactlylitNum6_failAssert2litNum661_failAssert99litNum1674_failAssert271() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    ISolver solver = SolverFactory.newDefault();
                    solver.newVar(-395967801);
                    solver.setExpectedNumberOfClauses(1);
                    solver.addClause(new VecInt(new int[]{ 1, 2, 2, 4, 5 }));
                    solver.addExactly(new VecInt(new int[]{ 1, 2, 3 }), 0);
                    ModelIterator iterator = new ModelIterator(solver);
                    while (iterator.isSatisfiable()) {
                        iterator.model();
                    } 
                    iterator.numberOfModelsFoundSoFar();
                    org.junit.Assert.fail("checkModelIterationWithExactlylitNum6 should have thrown NegativeArraySizeException");
                }
                org.junit.Assert.fail("checkModelIterationWithExactlylitNum6_failAssert2litNum661 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("checkModelIterationWithExactlylitNum6_failAssert2litNum661_failAssert99litNum1674 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithExactlylitNum6_failAssert2litNum661_failAssert99litNum1579_failAssert272() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    ISolver solver = SolverFactory.newDefault();
                    solver.newVar(-395967801);
                    solver.setExpectedNumberOfClauses(1);
                    solver.addClause(new VecInt(new int[]{ 1, 2, 2, 5, 5 }));
                    solver.addExactly(new VecInt(new int[]{ 1, 2, 3 }), 1);
                    ModelIterator iterator = new ModelIterator(solver);
                    while (iterator.isSatisfiable()) {
                        iterator.model();
                    } 
                    iterator.numberOfModelsFoundSoFar();
                    org.junit.Assert.fail("checkModelIterationWithExactlylitNum6 should have thrown NegativeArraySizeException");
                }
                org.junit.Assert.fail("checkModelIterationWithExactlylitNum6_failAssert2litNum661 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("checkModelIterationWithExactlylitNum6_failAssert2litNum661_failAssert99litNum1579 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithExactlylitNum6_failAssert2litNum739_failAssert119litNum2646_failAssert282() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    ISolver solver = SolverFactory.newDefault();
                    solver.newVar(-395967801);
                    solver.setExpectedNumberOfClauses(1);
                    solver.addClause(new VecInt(new int[]{ 1, 2, 3, 4, 5 }));
                    solver.addExactly(new VecInt(new int[]{ 1, 2, 4 }), 2);
                    ModelIterator iterator = new ModelIterator(solver);
                    while (iterator.isSatisfiable()) {
                        iterator.model();
                    } 
                    iterator.numberOfModelsFoundSoFar();
                    org.junit.Assert.fail("checkModelIterationWithExactlylitNum6 should have thrown NegativeArraySizeException");
                }
                org.junit.Assert.fail("checkModelIterationWithExactlylitNum6_failAssert2litNum739 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("checkModelIterationWithExactlylitNum6_failAssert2litNum739_failAssert119litNum2646 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithExactlylitNum6_failAssert2litNum704_failAssert100litNum1849_failAssert288() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    ISolver solver = SolverFactory.newDefault();
                    solver.newVar(-395967801);
                    solver.setExpectedNumberOfClauses(1);
                    solver.addClause(new VecInt(new int[]{ 1, 2, 3, 4, 5 }));
                    solver.addExactly(new VecInt(new int[]{ 2, 2, 3 }), -565221601);
                    ModelIterator iterator = new ModelIterator(solver);
                    while (iterator.isSatisfiable()) {
                        iterator.model();
                    } 
                    iterator.numberOfModelsFoundSoFar();
                    org.junit.Assert.fail("checkModelIterationWithExactlylitNum6 should have thrown NegativeArraySizeException");
                }
                org.junit.Assert.fail("checkModelIterationWithExactlylitNum6_failAssert2litNum704 should have thrown ContradictionException");
            }
            org.junit.Assert.fail("checkModelIterationWithExactlylitNum6_failAssert2litNum704_failAssert100litNum1849 should have thrown ContradictionException");
        } catch (ContradictionException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithExactlylitNum6_failAssert2litNum739_failAssert119litNum2598_failAssert289() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    ISolver solver = SolverFactory.newDefault();
                    solver.newVar(-395967801);
                    solver.setExpectedNumberOfClauses(1);
                    solver.addClause(new VecInt(new int[]{ 1, 2, 3, -551520, 5 }));
                    solver.addExactly(new VecInt(new int[]{ 1, 2, 3 }), 2);
                    ModelIterator iterator = new ModelIterator(solver);
                    while (iterator.isSatisfiable()) {
                        iterator.model();
                    } 
                    iterator.numberOfModelsFoundSoFar();
                    org.junit.Assert.fail("checkModelIterationWithExactlylitNum6 should have thrown NegativeArraySizeException");
                }
                org.junit.Assert.fail("checkModelIterationWithExactlylitNum6_failAssert2litNum739 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("checkModelIterationWithExactlylitNum6_failAssert2litNum739_failAssert119litNum2598 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithExactlylitNum41_failAssert18_add613_failAssert155litNum1410_failAssert295() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    ISolver solver = SolverFactory.newDefault();
                    solver.newVar(5);
                    solver.newVar(5);
                    solver.setExpectedNumberOfClauses(1);
                    solver.addClause(new VecInt(new int[]{ 1, 2, 0, 4, 5 }));
                    solver.addExactly(new VecInt(new int[]{ 2, 2, 3 }), 1);
                    ModelIterator iterator = new ModelIterator(solver);
                    while (iterator.isSatisfiable()) {
                        iterator.model();
                    } 
                    iterator.numberOfModelsFoundSoFar();
                    org.junit.Assert.fail("checkModelIterationWithExactlylitNum41 should have thrown ContradictionException");
                }
                org.junit.Assert.fail("checkModelIterationWithExactlylitNum41_failAssert18_add613 should have thrown ContradictionException");
            }
            org.junit.Assert.fail("checkModelIterationWithExactlylitNum41_failAssert18_add613_failAssert155litNum1410 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithExactlylitNum41_failAssert18_add613_failAssert155litNum1421_failAssert296() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    ISolver solver = SolverFactory.newDefault();
                    solver.newVar(5);
                    solver.newVar(5);
                    solver.setExpectedNumberOfClauses(1);
                    solver.addClause(new VecInt(new int[]{ 1, 2, 3, 3, 5 }));
                    solver.addExactly(new VecInt(new int[]{ 2, 2, 3 }), 1);
                    ModelIterator iterator = new ModelIterator(solver);
                    while (iterator.isSatisfiable()) {
                        iterator.model();
                    } 
                    iterator.numberOfModelsFoundSoFar();
                    org.junit.Assert.fail("checkModelIterationWithExactlylitNum41 should have thrown ContradictionException");
                }
                org.junit.Assert.fail("checkModelIterationWithExactlylitNum41_failAssert18_add613 should have thrown ContradictionException");
            }
            org.junit.Assert.fail("checkModelIterationWithExactlylitNum41_failAssert18_add613_failAssert155litNum1421 should have thrown ContradictionException");
        } catch (ContradictionException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithExactlylitNum41_failAssert18_add613_failAssert155litNum1504_failAssert298() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    ISolver solver = SolverFactory.newDefault();
                    solver.newVar(5);
                    solver.newVar(5);
                    solver.setExpectedNumberOfClauses(1);
                    solver.addClause(new VecInt(new int[]{ 1, 2, 3, 4, 5 }));
                    solver.addExactly(new VecInt(new int[]{ 2, 2, 0 }), 1);
                    ModelIterator iterator = new ModelIterator(solver);
                    while (iterator.isSatisfiable()) {
                        iterator.model();
                    } 
                    iterator.numberOfModelsFoundSoFar();
                    org.junit.Assert.fail("checkModelIterationWithExactlylitNum41 should have thrown ContradictionException");
                }
                org.junit.Assert.fail("checkModelIterationWithExactlylitNum41_failAssert18_add613 should have thrown ContradictionException");
            }
            org.junit.Assert.fail("checkModelIterationWithExactlylitNum41_failAssert18_add613_failAssert155litNum1504 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithExactlylitNum41_failAssert18_add613_failAssert155litNum1441_failAssert299() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    ISolver solver = SolverFactory.newDefault();
                    solver.newVar(5);
                    solver.newVar(5);
                    solver.setExpectedNumberOfClauses(1);
                    solver.addClause(new VecInt(new int[]{ 1, 2, 3, 4, 6 }));
                    solver.addExactly(new VecInt(new int[]{ 2, 2, 3 }), 1);
                    ModelIterator iterator = new ModelIterator(solver);
                    while (iterator.isSatisfiable()) {
                        iterator.model();
                    } 
                    iterator.numberOfModelsFoundSoFar();
                    org.junit.Assert.fail("checkModelIterationWithExactlylitNum41 should have thrown ContradictionException");
                }
                org.junit.Assert.fail("checkModelIterationWithExactlylitNum41_failAssert18_add613 should have thrown ContradictionException");
            }
            org.junit.Assert.fail("checkModelIterationWithExactlylitNum41_failAssert18_add613_failAssert155litNum1441 should have thrown ContradictionException");
        } catch (ContradictionException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithExactlylitNum41_failAssert18_add613_failAssert155litNum1517_failAssert303() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    ISolver solver = SolverFactory.newDefault();
                    solver.newVar(5);
                    solver.newVar(5);
                    solver.setExpectedNumberOfClauses(1);
                    solver.addClause(new VecInt(new int[]{ 1, 2, 3, 4, 5 }));
                    solver.addExactly(new VecInt(new int[]{ 2, 2, 3 }), 0);
                    ModelIterator iterator = new ModelIterator(solver);
                    while (iterator.isSatisfiable()) {
                        iterator.model();
                    } 
                    iterator.numberOfModelsFoundSoFar();
                    org.junit.Assert.fail("checkModelIterationWithExactlylitNum41 should have thrown ContradictionException");
                }
                org.junit.Assert.fail("checkModelIterationWithExactlylitNum41_failAssert18_add613 should have thrown ContradictionException");
            }
            org.junit.Assert.fail("checkModelIterationWithExactlylitNum41_failAssert18_add613_failAssert155litNum1517 should have thrown ContradictionException");
        } catch (ContradictionException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithExactlylitNum15_failAssert5litNum693_failAssert168_add1798_failAssert313() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    ISolver solver = SolverFactory.newDefault();
                    solver.newVar(Integer.MIN_VALUE);
                    solver.setExpectedNumberOfClauses(1);
                    solver.addClause(new VecInt(new int[]{ Integer.MIN_VALUE, 2, 3, 4, 5 }));
                    solver.addClause(new VecInt(new int[]{ Integer.MIN_VALUE, 2, 3, 4, 5 }));
                    solver.addExactly(new VecInt(new int[]{ 1, 2, 3 }), 1);
                    ModelIterator iterator = new ModelIterator(solver);
                    while (iterator.isSatisfiable()) {
                        iterator.model();
                    } 
                    iterator.numberOfModelsFoundSoFar();
                    org.junit.Assert.fail("checkModelIterationWithExactlylitNum15 should have thrown ArrayIndexOutOfBoundsException");
                }
                org.junit.Assert.fail("checkModelIterationWithExactlylitNum15_failAssert5litNum693 should have thrown ArrayIndexOutOfBoundsException");
            }
            org.junit.Assert.fail("checkModelIterationWithExactlylitNum15_failAssert5litNum693_failAssert168_add1798 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-2147483648", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithExactlylitNum41_failAssert18_add613_failAssert155litNum1529_failAssert319() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    ISolver solver = SolverFactory.newDefault();
                    solver.newVar(5);
                    solver.newVar(5);
                    solver.setExpectedNumberOfClauses(1);
                    solver.addClause(new VecInt(new int[]{ 1, 2, 3, 4, 5 }));
                    solver.addExactly(new VecInt(new int[]{ 2, 2, 3 }), -628279076);
                    ModelIterator iterator = new ModelIterator(solver);
                    while (iterator.isSatisfiable()) {
                        iterator.model();
                    } 
                    iterator.numberOfModelsFoundSoFar();
                    org.junit.Assert.fail("checkModelIterationWithExactlylitNum41 should have thrown ContradictionException");
                }
                org.junit.Assert.fail("checkModelIterationWithExactlylitNum41_failAssert18_add613 should have thrown ContradictionException");
            }
            org.junit.Assert.fail("checkModelIterationWithExactlylitNum41_failAssert18_add613_failAssert155litNum1529 should have thrown ContradictionException");
        } catch (ContradictionException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithExactlylitNum42_failAssert19_add645_failAssert39_add2368_failAssert323() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    ISolver solver = SolverFactory.newDefault();
                    solver.newVar(5);
                    solver.setExpectedNumberOfClauses(1);
                    solver.addClause(new VecInt(new int[]{ 1, 2, 3, 4, 5 }));
                    solver.addClause(new VecInt(new int[]{ 1, 2, 3, 4, 5 }));
                    solver.addClause(new VecInt(new int[]{ 1, 2, 3, 4, 5 }));
                    solver.addExactly(new VecInt(new int[]{ 0, 2, 3 }), 1);
                    ModelIterator iterator = new ModelIterator(solver);
                    while (iterator.isSatisfiable()) {
                        iterator.model();
                    } 
                    iterator.numberOfModelsFoundSoFar();
                    org.junit.Assert.fail("checkModelIterationWithExactlylitNum42 should have thrown IllegalArgumentException");
                }
                org.junit.Assert.fail("checkModelIterationWithExactlylitNum42_failAssert19_add645 should have thrown IllegalArgumentException");
            }
            org.junit.Assert.fail("checkModelIterationWithExactlylitNum42_failAssert19_add645_failAssert39_add2368 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithExactlylitNum41_failAssert18litNum516_failAssert60_add2281_failAssert326() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    ISolver solver = SolverFactory.newDefault();
                    solver.newVar(5);
                    solver.setExpectedNumberOfClauses(1);
                    solver.addClause(new VecInt(new int[]{ 1, 2, 3, 4, 4 }));
                    solver.addExactly(new VecInt(new int[]{ 2, 2, 3 }), 1);
                    ModelIterator iterator = new ModelIterator(solver);
                    while (iterator.isSatisfiable()) {
                        iterator.model();
                    } 
                    iterator.numberOfModelsFoundSoFar();
                    org.junit.Assert.fail("checkModelIterationWithExactlylitNum41 should have thrown ContradictionException");
                }
                org.junit.Assert.fail("checkModelIterationWithExactlylitNum41_failAssert18litNum516 should have thrown ContradictionException");
            }
            org.junit.Assert.fail("checkModelIterationWithExactlylitNum41_failAssert18litNum516_failAssert60_add2281 should have thrown ContradictionException");
        } catch (ContradictionException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithExactlylitNum15_failAssert5_add919_failAssert33litNum2856_failAssert340() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    ISolver solver = SolverFactory.newDefault();
                    solver.newVar(Integer.MAX_VALUE);
                    solver.setExpectedNumberOfClauses(1);
                    solver.addClause(new VecInt(new int[]{ Integer.MIN_VALUE, 2, 3, 4, 5 }));
                    solver.addClause(new VecInt(new int[]{ Integer.MIN_VALUE, 2, 3, 4, 5 }));
                    solver.addExactly(new VecInt(new int[]{ 1, 2, 3 }), 1);
                    ModelIterator iterator = new ModelIterator(solver);
                    while (iterator.isSatisfiable()) {
                        iterator.model();
                    } 
                    iterator.numberOfModelsFoundSoFar();
                    org.junit.Assert.fail("checkModelIterationWithExactlylitNum15 should have thrown ArrayIndexOutOfBoundsException");
                }
                org.junit.Assert.fail("checkModelIterationWithExactlylitNum15_failAssert5_add919 should have thrown ArrayIndexOutOfBoundsException");
            }
            org.junit.Assert.fail("checkModelIterationWithExactlylitNum15_failAssert5_add919_failAssert33litNum2856 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithExactlylitNum21_failAssert8_add446_failAssert41_add2305_failAssert362() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    ISolver solver = SolverFactory.newDefault();
                    solver.newVar(5);
                    solver.setExpectedNumberOfClauses(1);
                    solver.addClause(new VecInt(new int[]{ 1, 0, 3, 4, 5 }));
                    solver.addClause(new VecInt(new int[]{ 1, 0, 3, 4, 5 }));
                    solver.addClause(new VecInt(new int[]{ 1, 0, 3, 4, 5 }));
                    solver.addExactly(new VecInt(new int[]{ 1, 2, 3 }), 1);
                    ModelIterator iterator = new ModelIterator(solver);
                    while (iterator.isSatisfiable()) {
                        iterator.model();
                    } 
                    iterator.numberOfModelsFoundSoFar();
                    org.junit.Assert.fail("checkModelIterationWithExactlylitNum21 should have thrown IllegalArgumentException");
                }
                org.junit.Assert.fail("checkModelIterationWithExactlylitNum21_failAssert8_add446 should have thrown IllegalArgumentException");
            }
            org.junit.Assert.fail("checkModelIterationWithExactlylitNum21_failAssert8_add446_failAssert41_add2305 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithExactlylitNum13_failAssert3_add832_failAssert42_add2544_failAssert363() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    ISolver solver = SolverFactory.newDefault();
                    solver.newVar(5);
                    solver.setExpectedNumberOfClauses(1);
                    solver.addClause(new VecInt(new int[]{ 0, 2, 3, 4, 5 }));
                    solver.addClause(new VecInt(new int[]{ 0, 2, 3, 4, 5 }));
                    solver.addClause(new VecInt(new int[]{ 0, 2, 3, 4, 5 }));
                    solver.addExactly(new VecInt(new int[]{ 1, 2, 3 }), 1);
                    ModelIterator iterator = new ModelIterator(solver);
                    while (iterator.isSatisfiable()) {
                        iterator.model();
                    } 
                    iterator.numberOfModelsFoundSoFar();
                    org.junit.Assert.fail("checkModelIterationWithExactlylitNum13 should have thrown IllegalArgumentException");
                }
                org.junit.Assert.fail("checkModelIterationWithExactlylitNum13_failAssert3_add832 should have thrown IllegalArgumentException");
            }
            org.junit.Assert.fail("checkModelIterationWithExactlylitNum13_failAssert3_add832_failAssert42_add2544 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithExactlylitNum4_failAssert1_add610_failAssert49_add2997_failAssert372() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    ISolver solver = SolverFactory.newDefault();
                    solver.newVar(Integer.MIN_VALUE);
                    solver.setExpectedNumberOfClauses(1);
                    solver.addClause(new VecInt(new int[]{ 1, 2, 3, 4, 5 }));
                    solver.addClause(new VecInt(new int[]{ 1, 2, 3, 4, 5 }));
                    solver.addClause(new VecInt(new int[]{ 1, 2, 3, 4, 5 }));
                    solver.addExactly(new VecInt(new int[]{ 1, 2, 3 }), 1);
                    ModelIterator iterator = new ModelIterator(solver);
                    while (iterator.isSatisfiable()) {
                        iterator.model();
                    } 
                    iterator.numberOfModelsFoundSoFar();
                    org.junit.Assert.fail("checkModelIterationWithExactlylitNum4 should have thrown NegativeArraySizeException");
                }
                org.junit.Assert.fail("checkModelIterationWithExactlylitNum4_failAssert1_add610 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("checkModelIterationWithExactlylitNum4_failAssert1_add610_failAssert49_add2997 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithUnitlitNum3575litNum3741() throws Exception, ContradictionException, TimeoutException {
        ISolver solver = SolverFactory.newDefault();
        Assert.assertEquals(100, ((int) (((SearchParams) (((Solver) (solver)).getSearchParams())).getInitConflictBound())));
        Assert.assertEquals(1.5, ((double) (((SearchParams) (((Solver) (solver)).getSearchParams())).getConflictBoundIncFactor())), 0.1);
        Assert.assertEquals(0.95, ((double) (((SearchParams) (((Solver) (solver)).getSearchParams())).getVarDecay())), 0.1);
        Assert.assertEquals(0.999, ((double) (((SearchParams) (((Solver) (solver)).getSearchParams())).getClaDecay())), 0.1);
        Assert.assertFalse(((RestartStrategy) (((Solver) (solver)).getRestartStrategy())).shouldRestart());
        Assert.assertEquals(2147483647L, ((long) (((Solver) (solver)).getTimeoutMs())));
        Assert.assertTrue(((org.sat4j.minisat.core.Solver)solver).getStat().containsKey("inspects"));
        Assert.assertEquals(0L, ((org.sat4j.minisat.core.Solver)solver).getStat().get("inspects"));
        Assert.assertTrue(((org.sat4j.minisat.core.Solver)solver).getStat().containsKey("propagations"));
        Assert.assertEquals(0L, ((org.sat4j.minisat.core.Solver)solver).getStat().get("propagations"));
        Assert.assertTrue(((org.sat4j.minisat.core.Solver)solver).getStat().containsKey("shortcuts"));
        Assert.assertEquals(0, ((org.sat4j.minisat.core.Solver)solver).getStat().get("shortcuts"));
        Assert.assertTrue(((org.sat4j.minisat.core.Solver)solver).getStat().containsKey("ignoredclauses"));
        Assert.assertEquals(0L, ((org.sat4j.minisat.core.Solver)solver).getStat().get("ignoredclauses"));
        Assert.assertTrue(((org.sat4j.minisat.core.Solver)solver).getStat().containsKey("learnedclauses"));
        Assert.assertEquals(0L, ((org.sat4j.minisat.core.Solver)solver).getStat().get("learnedclauses"));
        Assert.assertTrue(((org.sat4j.minisat.core.Solver)solver).getStat().containsKey("importedUnits"));
        Assert.assertEquals(0, ((org.sat4j.minisat.core.Solver)solver).getStat().get("importedUnits"));
        Assert.assertTrue(((org.sat4j.minisat.core.Solver)solver).getStat().containsKey("learnedbinaryclauses"));
        Assert.assertEquals(0L, ((org.sat4j.minisat.core.Solver)solver).getStat().get("learnedbinaryclauses"));
        Assert.assertTrue(((org.sat4j.minisat.core.Solver)solver).getStat().containsKey("reduceddb"));
        Assert.assertEquals(0, ((org.sat4j.minisat.core.Solver)solver).getStat().get("reduceddb"));
        Assert.assertTrue(((org.sat4j.minisat.core.Solver)solver).getStat().containsKey("updateLBD"));
        Assert.assertEquals(0L, ((org.sat4j.minisat.core.Solver)solver).getStat().get("updateLBD"));
        Assert.assertTrue(((org.sat4j.minisat.core.Solver)solver).getStat().containsKey("learnedliterals"));
        Assert.assertEquals(0L, ((org.sat4j.minisat.core.Solver)solver).getStat().get("learnedliterals"));
        Assert.assertTrue(((org.sat4j.minisat.core.Solver)solver).getStat().containsKey("conflicts"));
        Assert.assertEquals(0L, ((org.sat4j.minisat.core.Solver)solver).getStat().get("conflicts"));
        Assert.assertTrue(((org.sat4j.minisat.core.Solver)solver).getStat().containsKey("learnedternaryclauses"));
        Assert.assertEquals(0L, ((org.sat4j.minisat.core.Solver)solver).getStat().get("learnedternaryclauses"));
        Assert.assertTrue(((org.sat4j.minisat.core.Solver)solver).getStat().containsKey("changedreason"));
        Assert.assertEquals(0L, ((org.sat4j.minisat.core.Solver)solver).getStat().get("changedreason"));
        Assert.assertTrue(((org.sat4j.minisat.core.Solver)solver).getStat().containsKey("decisions"));
        Assert.assertEquals(0L, ((org.sat4j.minisat.core.Solver)solver).getStat().get("decisions"));
        Assert.assertTrue(((org.sat4j.minisat.core.Solver)solver).getStat().containsKey("starts"));
        Assert.assertEquals(0, ((org.sat4j.minisat.core.Solver)solver).getStat().get("starts"));
        Assert.assertTrue(((org.sat4j.minisat.core.Solver)solver).getStat().containsKey("rootSimplifications"));
        Assert.assertEquals(0L, ((org.sat4j.minisat.core.Solver)solver).getStat().get("rootSimplifications"));
        Assert.assertTrue(((org.sat4j.minisat.core.Solver)solver).getStat().containsKey("reducedliterals"));
        Assert.assertEquals(0L, ((org.sat4j.minisat.core.Solver)solver).getStat().get("reducedliterals"));
        Assert.assertFalse(((Solver) (solver)).isDBSimplificationAllowed());
        Assert.assertFalse(((Solver) (solver)).isVerbose());
        Assert.assertEquals("c ", ((Solver) (solver)).getLogPrefix());
        Assert.assertFalse(((Solver) (solver)).isSolverKeptHot());
        Assert.assertEquals(2147483647L, ((long) (((ISolver) (((Solver) (solver)).getSolvingEngine())).getTimeoutMs())));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getStat().containsKey("inspects"));
        Assert.assertEquals(0L, ((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getStat().get("inspects"));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getStat().containsKey("propagations"));
        Assert.assertEquals(0L, ((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getStat().get("propagations"));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getStat().containsKey("shortcuts"));
        Assert.assertEquals(0, ((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getStat().get("shortcuts"));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getStat().containsKey("ignoredclauses"));
        Assert.assertEquals(0L, ((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getStat().get("ignoredclauses"));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getStat().containsKey("learnedclauses"));
        Assert.assertEquals(0L, ((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getStat().get("learnedclauses"));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getStat().containsKey("importedUnits"));
        Assert.assertEquals(0, ((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getStat().get("importedUnits"));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getStat().containsKey("learnedbinaryclauses"));
        Assert.assertEquals(0L, ((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getStat().get("learnedbinaryclauses"));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getStat().containsKey("reduceddb"));
        Assert.assertEquals(0, ((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getStat().get("reduceddb"));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getStat().containsKey("updateLBD"));
        Assert.assertEquals(0L, ((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getStat().get("updateLBD"));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getStat().containsKey("learnedliterals"));
        Assert.assertEquals(0L, ((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getStat().get("learnedliterals"));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getStat().containsKey("conflicts"));
        Assert.assertEquals(0L, ((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getStat().get("conflicts"));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getStat().containsKey("learnedternaryclauses"));
        Assert.assertEquals(0L, ((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getStat().get("learnedternaryclauses"));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getStat().containsKey("changedreason"));
        Assert.assertEquals(0L, ((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getStat().get("changedreason"));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getStat().containsKey("decisions"));
        Assert.assertEquals(0L, ((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getStat().get("decisions"));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getStat().containsKey("starts"));
        Assert.assertEquals(0, ((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getStat().get("starts"));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getStat().containsKey("rootSimplifications"));
        Assert.assertEquals(0L, ((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getStat().get("rootSimplifications"));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getStat().containsKey("reducedliterals"));
        Assert.assertEquals(0L, ((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getStat().get("reducedliterals"));
        Assert.assertFalse(((ISolver) (((Solver) (solver)).getSolvingEngine())).isDBSimplificationAllowed());
        Assert.assertFalse(((ISolver) (((Solver) (solver)).getSolvingEngine())).isVerbose());
        Assert.assertEquals("c ", ((ISolver) (((Solver) (solver)).getSolvingEngine())).getLogPrefix());
        Assert.assertFalse(((ISolver) (((Solver) (solver)).getSolvingEngine())).isSolverKeptHot());
        Assert.assertEquals(2147483647L, ((long) (((ISolver) (((ISolver) (((Solver) (solver)).getSolvingEngine())).getSolvingEngine())).getTimeoutMs())));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getSolvingEngine()).getStat().containsKey("inspects"));
        Assert.assertEquals(0L, ((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getSolvingEngine()).getStat().get("inspects"));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getSolvingEngine()).getStat().containsKey("propagations"));
        Assert.assertEquals(0L, ((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getSolvingEngine()).getStat().get("propagations"));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getSolvingEngine()).getStat().containsKey("shortcuts"));
        Assert.assertEquals(0, ((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getSolvingEngine()).getStat().get("shortcuts"));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getSolvingEngine()).getStat().containsKey("ignoredclauses"));
        Assert.assertEquals(0L, ((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getSolvingEngine()).getStat().get("ignoredclauses"));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getSolvingEngine()).getStat().containsKey("learnedclauses"));
        Assert.assertEquals(0L, ((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getSolvingEngine()).getStat().get("learnedclauses"));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getSolvingEngine()).getStat().containsKey("importedUnits"));
        Assert.assertEquals(0, ((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getSolvingEngine()).getStat().get("importedUnits"));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getSolvingEngine()).getStat().containsKey("learnedbinaryclauses"));
        Assert.assertEquals(0L, ((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getSolvingEngine()).getStat().get("learnedbinaryclauses"));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getSolvingEngine()).getStat().containsKey("reduceddb"));
        Assert.assertEquals(0, ((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getSolvingEngine()).getStat().get("reduceddb"));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getSolvingEngine()).getStat().containsKey("updateLBD"));
        Assert.assertEquals(0L, ((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getSolvingEngine()).getStat().get("updateLBD"));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getSolvingEngine()).getStat().containsKey("learnedliterals"));
        Assert.assertEquals(0L, ((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getSolvingEngine()).getStat().get("learnedliterals"));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getSolvingEngine()).getStat().containsKey("conflicts"));
        Assert.assertEquals(0L, ((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getSolvingEngine()).getStat().get("conflicts"));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getSolvingEngine()).getStat().containsKey("learnedternaryclauses"));
        Assert.assertEquals(0L, ((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getSolvingEngine()).getStat().get("learnedternaryclauses"));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getSolvingEngine()).getStat().containsKey("changedreason"));
        Assert.assertEquals(0L, ((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getSolvingEngine()).getStat().get("changedreason"));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getSolvingEngine()).getStat().containsKey("decisions"));
        Assert.assertEquals(0L, ((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getSolvingEngine()).getStat().get("decisions"));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getSolvingEngine()).getStat().containsKey("starts"));
        Assert.assertEquals(0, ((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getSolvingEngine()).getStat().get("starts"));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getSolvingEngine()).getStat().containsKey("rootSimplifications"));
        Assert.assertEquals(0L, ((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getSolvingEngine()).getStat().get("rootSimplifications"));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getSolvingEngine()).getStat().containsKey("reducedliterals"));
        Assert.assertEquals(0L, ((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getSolvingEngine()).getStat().get("reducedliterals"));
        Assert.assertFalse(((ISolver) (((ISolver) (((Solver) (solver)).getSolvingEngine())).getSolvingEngine())).isDBSimplificationAllowed());
        Assert.assertFalse(((ISolver) (((ISolver) (((Solver) (solver)).getSolvingEngine())).getSolvingEngine())).isVerbose());
        Assert.assertEquals("c ", ((ISolver) (((ISolver) (((Solver) (solver)).getSolvingEngine())).getSolvingEngine())).getLogPrefix());
        Assert.assertFalse(((ISolver) (((ISolver) (((Solver) (solver)).getSolvingEngine())).getSolvingEngine())).isSolverKeptHot());
        Assert.assertEquals(2147483, ((int) (((ISolver) (((ISolver) (((Solver) (solver)).getSolvingEngine())).getSolvingEngine())).getTimeout())));
        Assert.assertTrue(((ISolver) (((ISolver) (((Solver) (solver)).getSolvingEngine())).getSolvingEngine())).isSatisfiable());
        Assert.assertEquals(2147483, ((int) (((ISolver) (((Solver) (solver)).getSolvingEngine())).getTimeout())));
        Assert.assertTrue(((ISolver) (((Solver) (solver)).getSolvingEngine())).isSatisfiable());
        Assert.assertTrue(((IVecInt) (((Solver) (solver)).getOutLearnt())).isEmpty());
        Assert.assertTrue(((IVec) (((Solver) (solver)).getLearnedConstraints())).isEmpty());
        Assert.assertTrue(((Solver) (solver)).isSatisfiable());
        Assert.assertEquals(2147483, ((int) (((Solver) (solver)).getTimeout())));
        int o_checkModelIterationWithUnitlitNum3575litNum3741__3 = solver.newVar(3);
        Assert.assertEquals(3, ((int) (o_checkModelIterationWithUnitlitNum3575litNum3741__3)));
        solver.setExpectedNumberOfClauses(4);
        IConstr o_checkModelIterationWithUnitlitNum3575litNum3741__5 = solver.addClause(new VecInt(new int[]{ 1 }));
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_checkModelIterationWithUnitlitNum3575litNum3741__5)).getActivity())), 0.1);
        Assert.assertTrue(((UnitClause) (o_checkModelIterationWithUnitlitNum3575litNum3741__5)).isSatisfied());
        Assert.assertEquals("1", ((UnitClause) (o_checkModelIterationWithUnitlitNum3575litNum3741__5)).toString());
        solver.addClause(new VecInt(new int[]{ 1, 2 }));
        solver.addClause(new VecInt(new int[]{ -1, -2 }));
        ModelIterator iterator = new ModelIterator(solver);
        while (iterator.isSatisfiable()) {
            iterator.model();
        } 
        iterator.numberOfModelsFoundSoFar();
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithUnitlitNum3575litNum3742() throws Exception, ContradictionException, TimeoutException {
        ISolver solver = SolverFactory.newDefault();
        Assert.assertEquals(100, ((int) (((SearchParams) (((Solver) (solver)).getSearchParams())).getInitConflictBound())));
        Assert.assertEquals(1.5, ((double) (((SearchParams) (((Solver) (solver)).getSearchParams())).getConflictBoundIncFactor())), 0.1);
        Assert.assertEquals(0.95, ((double) (((SearchParams) (((Solver) (solver)).getSearchParams())).getVarDecay())), 0.1);
        Assert.assertEquals(0.999, ((double) (((SearchParams) (((Solver) (solver)).getSearchParams())).getClaDecay())), 0.1);
        Assert.assertFalse(((RestartStrategy) (((Solver) (solver)).getRestartStrategy())).shouldRestart());
        Assert.assertEquals(2147483647L, ((long) (((Solver) (solver)).getTimeoutMs())));
        Assert.assertTrue(((org.sat4j.minisat.core.Solver)solver).getStat().containsKey("inspects"));
        Assert.assertEquals(0L, ((org.sat4j.minisat.core.Solver)solver).getStat().get("inspects"));
        Assert.assertTrue(((org.sat4j.minisat.core.Solver)solver).getStat().containsKey("propagations"));
        Assert.assertEquals(0L, ((org.sat4j.minisat.core.Solver)solver).getStat().get("propagations"));
        Assert.assertTrue(((org.sat4j.minisat.core.Solver)solver).getStat().containsKey("shortcuts"));
        Assert.assertEquals(0, ((org.sat4j.minisat.core.Solver)solver).getStat().get("shortcuts"));
        Assert.assertTrue(((org.sat4j.minisat.core.Solver)solver).getStat().containsKey("ignoredclauses"));
        Assert.assertEquals(0L, ((org.sat4j.minisat.core.Solver)solver).getStat().get("ignoredclauses"));
        Assert.assertTrue(((org.sat4j.minisat.core.Solver)solver).getStat().containsKey("learnedclauses"));
        Assert.assertEquals(0L, ((org.sat4j.minisat.core.Solver)solver).getStat().get("learnedclauses"));
        Assert.assertTrue(((org.sat4j.minisat.core.Solver)solver).getStat().containsKey("importedUnits"));
        Assert.assertEquals(0, ((org.sat4j.minisat.core.Solver)solver).getStat().get("importedUnits"));
        Assert.assertTrue(((org.sat4j.minisat.core.Solver)solver).getStat().containsKey("learnedbinaryclauses"));
        Assert.assertEquals(0L, ((org.sat4j.minisat.core.Solver)solver).getStat().get("learnedbinaryclauses"));
        Assert.assertTrue(((org.sat4j.minisat.core.Solver)solver).getStat().containsKey("reduceddb"));
        Assert.assertEquals(0, ((org.sat4j.minisat.core.Solver)solver).getStat().get("reduceddb"));
        Assert.assertTrue(((org.sat4j.minisat.core.Solver)solver).getStat().containsKey("updateLBD"));
        Assert.assertEquals(0L, ((org.sat4j.minisat.core.Solver)solver).getStat().get("updateLBD"));
        Assert.assertTrue(((org.sat4j.minisat.core.Solver)solver).getStat().containsKey("learnedliterals"));
        Assert.assertEquals(0L, ((org.sat4j.minisat.core.Solver)solver).getStat().get("learnedliterals"));
        Assert.assertTrue(((org.sat4j.minisat.core.Solver)solver).getStat().containsKey("conflicts"));
        Assert.assertEquals(0L, ((org.sat4j.minisat.core.Solver)solver).getStat().get("conflicts"));
        Assert.assertTrue(((org.sat4j.minisat.core.Solver)solver).getStat().containsKey("learnedternaryclauses"));
        Assert.assertEquals(0L, ((org.sat4j.minisat.core.Solver)solver).getStat().get("learnedternaryclauses"));
        Assert.assertTrue(((org.sat4j.minisat.core.Solver)solver).getStat().containsKey("changedreason"));
        Assert.assertEquals(0L, ((org.sat4j.minisat.core.Solver)solver).getStat().get("changedreason"));
        Assert.assertTrue(((org.sat4j.minisat.core.Solver)solver).getStat().containsKey("decisions"));
        Assert.assertEquals(0L, ((org.sat4j.minisat.core.Solver)solver).getStat().get("decisions"));
        Assert.assertTrue(((org.sat4j.minisat.core.Solver)solver).getStat().containsKey("starts"));
        Assert.assertEquals(0, ((org.sat4j.minisat.core.Solver)solver).getStat().get("starts"));
        Assert.assertTrue(((org.sat4j.minisat.core.Solver)solver).getStat().containsKey("rootSimplifications"));
        Assert.assertEquals(0L, ((org.sat4j.minisat.core.Solver)solver).getStat().get("rootSimplifications"));
        Assert.assertTrue(((org.sat4j.minisat.core.Solver)solver).getStat().containsKey("reducedliterals"));
        Assert.assertEquals(0L, ((org.sat4j.minisat.core.Solver)solver).getStat().get("reducedliterals"));
        Assert.assertFalse(((Solver) (solver)).isDBSimplificationAllowed());
        Assert.assertFalse(((Solver) (solver)).isVerbose());
        Assert.assertEquals("c ", ((Solver) (solver)).getLogPrefix());
        Assert.assertFalse(((Solver) (solver)).isSolverKeptHot());
        Assert.assertEquals(2147483647L, ((long) (((ISolver) (((Solver) (solver)).getSolvingEngine())).getTimeoutMs())));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getStat().containsKey("inspects"));
        Assert.assertEquals(0L, ((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getStat().get("inspects"));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getStat().containsKey("propagations"));
        Assert.assertEquals(0L, ((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getStat().get("propagations"));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getStat().containsKey("shortcuts"));
        Assert.assertEquals(0, ((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getStat().get("shortcuts"));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getStat().containsKey("ignoredclauses"));
        Assert.assertEquals(0L, ((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getStat().get("ignoredclauses"));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getStat().containsKey("learnedclauses"));
        Assert.assertEquals(0L, ((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getStat().get("learnedclauses"));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getStat().containsKey("importedUnits"));
        Assert.assertEquals(0, ((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getStat().get("importedUnits"));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getStat().containsKey("learnedbinaryclauses"));
        Assert.assertEquals(0L, ((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getStat().get("learnedbinaryclauses"));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getStat().containsKey("reduceddb"));
        Assert.assertEquals(0, ((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getStat().get("reduceddb"));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getStat().containsKey("updateLBD"));
        Assert.assertEquals(0L, ((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getStat().get("updateLBD"));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getStat().containsKey("learnedliterals"));
        Assert.assertEquals(0L, ((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getStat().get("learnedliterals"));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getStat().containsKey("conflicts"));
        Assert.assertEquals(0L, ((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getStat().get("conflicts"));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getStat().containsKey("learnedternaryclauses"));
        Assert.assertEquals(0L, ((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getStat().get("learnedternaryclauses"));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getStat().containsKey("changedreason"));
        Assert.assertEquals(0L, ((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getStat().get("changedreason"));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getStat().containsKey("decisions"));
        Assert.assertEquals(0L, ((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getStat().get("decisions"));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getStat().containsKey("starts"));
        Assert.assertEquals(0, ((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getStat().get("starts"));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getStat().containsKey("rootSimplifications"));
        Assert.assertEquals(0L, ((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getStat().get("rootSimplifications"));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getStat().containsKey("reducedliterals"));
        Assert.assertEquals(0L, ((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getStat().get("reducedliterals"));
        Assert.assertFalse(((ISolver) (((Solver) (solver)).getSolvingEngine())).isDBSimplificationAllowed());
        Assert.assertFalse(((ISolver) (((Solver) (solver)).getSolvingEngine())).isVerbose());
        Assert.assertEquals("c ", ((ISolver) (((Solver) (solver)).getSolvingEngine())).getLogPrefix());
        Assert.assertFalse(((ISolver) (((Solver) (solver)).getSolvingEngine())).isSolverKeptHot());
        Assert.assertEquals(2147483647L, ((long) (((ISolver) (((ISolver) (((Solver) (solver)).getSolvingEngine())).getSolvingEngine())).getTimeoutMs())));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getSolvingEngine()).getStat().containsKey("inspects"));
        Assert.assertEquals(0L, ((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getSolvingEngine()).getStat().get("inspects"));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getSolvingEngine()).getStat().containsKey("propagations"));
        Assert.assertEquals(0L, ((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getSolvingEngine()).getStat().get("propagations"));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getSolvingEngine()).getStat().containsKey("shortcuts"));
        Assert.assertEquals(0, ((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getSolvingEngine()).getStat().get("shortcuts"));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getSolvingEngine()).getStat().containsKey("ignoredclauses"));
        Assert.assertEquals(0L, ((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getSolvingEngine()).getStat().get("ignoredclauses"));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getSolvingEngine()).getStat().containsKey("learnedclauses"));
        Assert.assertEquals(0L, ((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getSolvingEngine()).getStat().get("learnedclauses"));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getSolvingEngine()).getStat().containsKey("importedUnits"));
        Assert.assertEquals(0, ((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getSolvingEngine()).getStat().get("importedUnits"));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getSolvingEngine()).getStat().containsKey("learnedbinaryclauses"));
        Assert.assertEquals(0L, ((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getSolvingEngine()).getStat().get("learnedbinaryclauses"));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getSolvingEngine()).getStat().containsKey("reduceddb"));
        Assert.assertEquals(0, ((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getSolvingEngine()).getStat().get("reduceddb"));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getSolvingEngine()).getStat().containsKey("updateLBD"));
        Assert.assertEquals(0L, ((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getSolvingEngine()).getStat().get("updateLBD"));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getSolvingEngine()).getStat().containsKey("learnedliterals"));
        Assert.assertEquals(0L, ((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getSolvingEngine()).getStat().get("learnedliterals"));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getSolvingEngine()).getStat().containsKey("conflicts"));
        Assert.assertEquals(0L, ((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getSolvingEngine()).getStat().get("conflicts"));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getSolvingEngine()).getStat().containsKey("learnedternaryclauses"));
        Assert.assertEquals(0L, ((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getSolvingEngine()).getStat().get("learnedternaryclauses"));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getSolvingEngine()).getStat().containsKey("changedreason"));
        Assert.assertEquals(0L, ((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getSolvingEngine()).getStat().get("changedreason"));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getSolvingEngine()).getStat().containsKey("decisions"));
        Assert.assertEquals(0L, ((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getSolvingEngine()).getStat().get("decisions"));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getSolvingEngine()).getStat().containsKey("starts"));
        Assert.assertEquals(0, ((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getSolvingEngine()).getStat().get("starts"));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getSolvingEngine()).getStat().containsKey("rootSimplifications"));
        Assert.assertEquals(0L, ((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getSolvingEngine()).getStat().get("rootSimplifications"));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getSolvingEngine()).getStat().containsKey("reducedliterals"));
        Assert.assertEquals(0L, ((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getSolvingEngine()).getStat().get("reducedliterals"));
        Assert.assertFalse(((ISolver) (((ISolver) (((Solver) (solver)).getSolvingEngine())).getSolvingEngine())).isDBSimplificationAllowed());
        Assert.assertFalse(((ISolver) (((ISolver) (((Solver) (solver)).getSolvingEngine())).getSolvingEngine())).isVerbose());
        Assert.assertEquals("c ", ((ISolver) (((ISolver) (((Solver) (solver)).getSolvingEngine())).getSolvingEngine())).getLogPrefix());
        Assert.assertFalse(((ISolver) (((ISolver) (((Solver) (solver)).getSolvingEngine())).getSolvingEngine())).isSolverKeptHot());
        Assert.assertEquals(2147483, ((int) (((ISolver) (((ISolver) (((Solver) (solver)).getSolvingEngine())).getSolvingEngine())).getTimeout())));
        Assert.assertTrue(((ISolver) (((ISolver) (((Solver) (solver)).getSolvingEngine())).getSolvingEngine())).isSatisfiable());
        Assert.assertEquals(2147483, ((int) (((ISolver) (((Solver) (solver)).getSolvingEngine())).getTimeout())));
        Assert.assertTrue(((ISolver) (((Solver) (solver)).getSolvingEngine())).isSatisfiable());
        Assert.assertTrue(((IVecInt) (((Solver) (solver)).getOutLearnt())).isEmpty());
        Assert.assertTrue(((IVec) (((Solver) (solver)).getLearnedConstraints())).isEmpty());
        Assert.assertTrue(((Solver) (solver)).isSatisfiable());
        Assert.assertEquals(2147483, ((int) (((Solver) (solver)).getTimeout())));
        int o_checkModelIterationWithUnitlitNum3575litNum3742__3 = solver.newVar(3);
        Assert.assertEquals(3, ((int) (o_checkModelIterationWithUnitlitNum3575litNum3742__3)));
        solver.setExpectedNumberOfClauses(2);
        IConstr o_checkModelIterationWithUnitlitNum3575litNum3742__5 = solver.addClause(new VecInt(new int[]{ 1 }));
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_checkModelIterationWithUnitlitNum3575litNum3742__5)).getActivity())), 0.1);
        Assert.assertTrue(((UnitClause) (o_checkModelIterationWithUnitlitNum3575litNum3742__5)).isSatisfied());
        Assert.assertEquals("1", ((UnitClause) (o_checkModelIterationWithUnitlitNum3575litNum3742__5)).toString());
        solver.addClause(new VecInt(new int[]{ 1, 2 }));
        solver.addClause(new VecInt(new int[]{ -1, -2 }));
        ModelIterator iterator = new ModelIterator(solver);
        while (iterator.isSatisfiable()) {
            iterator.model();
        } 
        iterator.numberOfModelsFoundSoFar();
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithUnitlitNum3575litNum3746() throws Exception, ContradictionException, TimeoutException {
        ISolver solver = SolverFactory.newDefault();
        Assert.assertEquals(100, ((int) (((SearchParams) (((Solver) (solver)).getSearchParams())).getInitConflictBound())));
        Assert.assertEquals(1.5, ((double) (((SearchParams) (((Solver) (solver)).getSearchParams())).getConflictBoundIncFactor())), 0.1);
        Assert.assertEquals(0.95, ((double) (((SearchParams) (((Solver) (solver)).getSearchParams())).getVarDecay())), 0.1);
        Assert.assertEquals(0.999, ((double) (((SearchParams) (((Solver) (solver)).getSearchParams())).getClaDecay())), 0.1);
        Assert.assertFalse(((RestartStrategy) (((Solver) (solver)).getRestartStrategy())).shouldRestart());
        Assert.assertEquals(2147483647L, ((long) (((Solver) (solver)).getTimeoutMs())));
        Assert.assertTrue(((org.sat4j.minisat.core.Solver)solver).getStat().containsKey("inspects"));
        Assert.assertEquals(0L, ((org.sat4j.minisat.core.Solver)solver).getStat().get("inspects"));
        Assert.assertTrue(((org.sat4j.minisat.core.Solver)solver).getStat().containsKey("propagations"));
        Assert.assertEquals(0L, ((org.sat4j.minisat.core.Solver)solver).getStat().get("propagations"));
        Assert.assertTrue(((org.sat4j.minisat.core.Solver)solver).getStat().containsKey("shortcuts"));
        Assert.assertEquals(0, ((org.sat4j.minisat.core.Solver)solver).getStat().get("shortcuts"));
        Assert.assertTrue(((org.sat4j.minisat.core.Solver)solver).getStat().containsKey("ignoredclauses"));
        Assert.assertEquals(0L, ((org.sat4j.minisat.core.Solver)solver).getStat().get("ignoredclauses"));
        Assert.assertTrue(((org.sat4j.minisat.core.Solver)solver).getStat().containsKey("learnedclauses"));
        Assert.assertEquals(0L, ((org.sat4j.minisat.core.Solver)solver).getStat().get("learnedclauses"));
        Assert.assertTrue(((org.sat4j.minisat.core.Solver)solver).getStat().containsKey("importedUnits"));
        Assert.assertEquals(0, ((org.sat4j.minisat.core.Solver)solver).getStat().get("importedUnits"));
        Assert.assertTrue(((org.sat4j.minisat.core.Solver)solver).getStat().containsKey("learnedbinaryclauses"));
        Assert.assertEquals(0L, ((org.sat4j.minisat.core.Solver)solver).getStat().get("learnedbinaryclauses"));
        Assert.assertTrue(((org.sat4j.minisat.core.Solver)solver).getStat().containsKey("reduceddb"));
        Assert.assertEquals(0, ((org.sat4j.minisat.core.Solver)solver).getStat().get("reduceddb"));
        Assert.assertTrue(((org.sat4j.minisat.core.Solver)solver).getStat().containsKey("updateLBD"));
        Assert.assertEquals(0L, ((org.sat4j.minisat.core.Solver)solver).getStat().get("updateLBD"));
        Assert.assertTrue(((org.sat4j.minisat.core.Solver)solver).getStat().containsKey("learnedliterals"));
        Assert.assertEquals(0L, ((org.sat4j.minisat.core.Solver)solver).getStat().get("learnedliterals"));
        Assert.assertTrue(((org.sat4j.minisat.core.Solver)solver).getStat().containsKey("conflicts"));
        Assert.assertEquals(0L, ((org.sat4j.minisat.core.Solver)solver).getStat().get("conflicts"));
        Assert.assertTrue(((org.sat4j.minisat.core.Solver)solver).getStat().containsKey("learnedternaryclauses"));
        Assert.assertEquals(0L, ((org.sat4j.minisat.core.Solver)solver).getStat().get("learnedternaryclauses"));
        Assert.assertTrue(((org.sat4j.minisat.core.Solver)solver).getStat().containsKey("changedreason"));
        Assert.assertEquals(0L, ((org.sat4j.minisat.core.Solver)solver).getStat().get("changedreason"));
        Assert.assertTrue(((org.sat4j.minisat.core.Solver)solver).getStat().containsKey("decisions"));
        Assert.assertEquals(0L, ((org.sat4j.minisat.core.Solver)solver).getStat().get("decisions"));
        Assert.assertTrue(((org.sat4j.minisat.core.Solver)solver).getStat().containsKey("starts"));
        Assert.assertEquals(0, ((org.sat4j.minisat.core.Solver)solver).getStat().get("starts"));
        Assert.assertTrue(((org.sat4j.minisat.core.Solver)solver).getStat().containsKey("rootSimplifications"));
        Assert.assertEquals(0L, ((org.sat4j.minisat.core.Solver)solver).getStat().get("rootSimplifications"));
        Assert.assertTrue(((org.sat4j.minisat.core.Solver)solver).getStat().containsKey("reducedliterals"));
        Assert.assertEquals(0L, ((org.sat4j.minisat.core.Solver)solver).getStat().get("reducedliterals"));
        Assert.assertFalse(((Solver) (solver)).isDBSimplificationAllowed());
        Assert.assertFalse(((Solver) (solver)).isVerbose());
        Assert.assertEquals("c ", ((Solver) (solver)).getLogPrefix());
        Assert.assertFalse(((Solver) (solver)).isSolverKeptHot());
        Assert.assertEquals(2147483647L, ((long) (((ISolver) (((Solver) (solver)).getSolvingEngine())).getTimeoutMs())));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getStat().containsKey("inspects"));
        Assert.assertEquals(0L, ((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getStat().get("inspects"));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getStat().containsKey("propagations"));
        Assert.assertEquals(0L, ((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getStat().get("propagations"));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getStat().containsKey("shortcuts"));
        Assert.assertEquals(0, ((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getStat().get("shortcuts"));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getStat().containsKey("ignoredclauses"));
        Assert.assertEquals(0L, ((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getStat().get("ignoredclauses"));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getStat().containsKey("learnedclauses"));
        Assert.assertEquals(0L, ((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getStat().get("learnedclauses"));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getStat().containsKey("importedUnits"));
        Assert.assertEquals(0, ((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getStat().get("importedUnits"));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getStat().containsKey("learnedbinaryclauses"));
        Assert.assertEquals(0L, ((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getStat().get("learnedbinaryclauses"));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getStat().containsKey("reduceddb"));
        Assert.assertEquals(0, ((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getStat().get("reduceddb"));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getStat().containsKey("updateLBD"));
        Assert.assertEquals(0L, ((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getStat().get("updateLBD"));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getStat().containsKey("learnedliterals"));
        Assert.assertEquals(0L, ((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getStat().get("learnedliterals"));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getStat().containsKey("conflicts"));
        Assert.assertEquals(0L, ((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getStat().get("conflicts"));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getStat().containsKey("learnedternaryclauses"));
        Assert.assertEquals(0L, ((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getStat().get("learnedternaryclauses"));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getStat().containsKey("changedreason"));
        Assert.assertEquals(0L, ((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getStat().get("changedreason"));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getStat().containsKey("decisions"));
        Assert.assertEquals(0L, ((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getStat().get("decisions"));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getStat().containsKey("starts"));
        Assert.assertEquals(0, ((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getStat().get("starts"));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getStat().containsKey("rootSimplifications"));
        Assert.assertEquals(0L, ((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getStat().get("rootSimplifications"));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getStat().containsKey("reducedliterals"));
        Assert.assertEquals(0L, ((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getStat().get("reducedliterals"));
        Assert.assertFalse(((ISolver) (((Solver) (solver)).getSolvingEngine())).isDBSimplificationAllowed());
        Assert.assertFalse(((ISolver) (((Solver) (solver)).getSolvingEngine())).isVerbose());
        Assert.assertEquals("c ", ((ISolver) (((Solver) (solver)).getSolvingEngine())).getLogPrefix());
        Assert.assertFalse(((ISolver) (((Solver) (solver)).getSolvingEngine())).isSolverKeptHot());
        Assert.assertEquals(2147483647L, ((long) (((ISolver) (((ISolver) (((Solver) (solver)).getSolvingEngine())).getSolvingEngine())).getTimeoutMs())));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getSolvingEngine()).getStat().containsKey("inspects"));
        Assert.assertEquals(0L, ((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getSolvingEngine()).getStat().get("inspects"));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getSolvingEngine()).getStat().containsKey("propagations"));
        Assert.assertEquals(0L, ((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getSolvingEngine()).getStat().get("propagations"));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getSolvingEngine()).getStat().containsKey("shortcuts"));
        Assert.assertEquals(0, ((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getSolvingEngine()).getStat().get("shortcuts"));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getSolvingEngine()).getStat().containsKey("ignoredclauses"));
        Assert.assertEquals(0L, ((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getSolvingEngine()).getStat().get("ignoredclauses"));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getSolvingEngine()).getStat().containsKey("learnedclauses"));
        Assert.assertEquals(0L, ((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getSolvingEngine()).getStat().get("learnedclauses"));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getSolvingEngine()).getStat().containsKey("importedUnits"));
        Assert.assertEquals(0, ((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getSolvingEngine()).getStat().get("importedUnits"));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getSolvingEngine()).getStat().containsKey("learnedbinaryclauses"));
        Assert.assertEquals(0L, ((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getSolvingEngine()).getStat().get("learnedbinaryclauses"));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getSolvingEngine()).getStat().containsKey("reduceddb"));
        Assert.assertEquals(0, ((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getSolvingEngine()).getStat().get("reduceddb"));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getSolvingEngine()).getStat().containsKey("updateLBD"));
        Assert.assertEquals(0L, ((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getSolvingEngine()).getStat().get("updateLBD"));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getSolvingEngine()).getStat().containsKey("learnedliterals"));
        Assert.assertEquals(0L, ((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getSolvingEngine()).getStat().get("learnedliterals"));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getSolvingEngine()).getStat().containsKey("conflicts"));
        Assert.assertEquals(0L, ((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getSolvingEngine()).getStat().get("conflicts"));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getSolvingEngine()).getStat().containsKey("learnedternaryclauses"));
        Assert.assertEquals(0L, ((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getSolvingEngine()).getStat().get("learnedternaryclauses"));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getSolvingEngine()).getStat().containsKey("changedreason"));
        Assert.assertEquals(0L, ((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getSolvingEngine()).getStat().get("changedreason"));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getSolvingEngine()).getStat().containsKey("decisions"));
        Assert.assertEquals(0L, ((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getSolvingEngine()).getStat().get("decisions"));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getSolvingEngine()).getStat().containsKey("starts"));
        Assert.assertEquals(0, ((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getSolvingEngine()).getStat().get("starts"));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getSolvingEngine()).getStat().containsKey("rootSimplifications"));
        Assert.assertEquals(0L, ((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getSolvingEngine()).getStat().get("rootSimplifications"));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getSolvingEngine()).getStat().containsKey("reducedliterals"));
        Assert.assertEquals(0L, ((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getSolvingEngine()).getStat().get("reducedliterals"));
        Assert.assertFalse(((ISolver) (((ISolver) (((Solver) (solver)).getSolvingEngine())).getSolvingEngine())).isDBSimplificationAllowed());
        Assert.assertFalse(((ISolver) (((ISolver) (((Solver) (solver)).getSolvingEngine())).getSolvingEngine())).isVerbose());
        Assert.assertEquals("c ", ((ISolver) (((ISolver) (((Solver) (solver)).getSolvingEngine())).getSolvingEngine())).getLogPrefix());
        Assert.assertFalse(((ISolver) (((ISolver) (((Solver) (solver)).getSolvingEngine())).getSolvingEngine())).isSolverKeptHot());
        Assert.assertEquals(2147483, ((int) (((ISolver) (((ISolver) (((Solver) (solver)).getSolvingEngine())).getSolvingEngine())).getTimeout())));
        Assert.assertTrue(((ISolver) (((ISolver) (((Solver) (solver)).getSolvingEngine())).getSolvingEngine())).isSatisfiable());
        Assert.assertEquals(2147483, ((int) (((ISolver) (((Solver) (solver)).getSolvingEngine())).getTimeout())));
        Assert.assertTrue(((ISolver) (((Solver) (solver)).getSolvingEngine())).isSatisfiable());
        Assert.assertTrue(((IVecInt) (((Solver) (solver)).getOutLearnt())).isEmpty());
        Assert.assertTrue(((IVec) (((Solver) (solver)).getLearnedConstraints())).isEmpty());
        Assert.assertTrue(((Solver) (solver)).isSatisfiable());
        Assert.assertEquals(2147483, ((int) (((Solver) (solver)).getTimeout())));
        int o_checkModelIterationWithUnitlitNum3575litNum3746__3 = solver.newVar(3);
        Assert.assertEquals(3, ((int) (o_checkModelIterationWithUnitlitNum3575litNum3746__3)));
        solver.setExpectedNumberOfClauses(875083084);
        IConstr o_checkModelIterationWithUnitlitNum3575litNum3746__5 = solver.addClause(new VecInt(new int[]{ 1 }));
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_checkModelIterationWithUnitlitNum3575litNum3746__5)).getActivity())), 0.1);
        Assert.assertTrue(((UnitClause) (o_checkModelIterationWithUnitlitNum3575litNum3746__5)).isSatisfied());
        Assert.assertEquals("1", ((UnitClause) (o_checkModelIterationWithUnitlitNum3575litNum3746__5)).toString());
        solver.addClause(new VecInt(new int[]{ 1, 2 }));
        solver.addClause(new VecInt(new int[]{ -1, -2 }));
        ModelIterator iterator = new ModelIterator(solver);
        while (iterator.isSatisfiable()) {
            iterator.model();
        } 
        iterator.numberOfModelsFoundSoFar();
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithUnitlitNum3575litNum3757() throws Exception, ContradictionException, TimeoutException {
        ISolver solver = SolverFactory.newDefault();
        Assert.assertEquals(100, ((int) (((SearchParams) (((Solver) (solver)).getSearchParams())).getInitConflictBound())));
        Assert.assertEquals(1.5, ((double) (((SearchParams) (((Solver) (solver)).getSearchParams())).getConflictBoundIncFactor())), 0.1);
        Assert.assertEquals(0.95, ((double) (((SearchParams) (((Solver) (solver)).getSearchParams())).getVarDecay())), 0.1);
        Assert.assertEquals(0.999, ((double) (((SearchParams) (((Solver) (solver)).getSearchParams())).getClaDecay())), 0.1);
        Assert.assertFalse(((RestartStrategy) (((Solver) (solver)).getRestartStrategy())).shouldRestart());
        Assert.assertEquals(2147483647L, ((long) (((Solver) (solver)).getTimeoutMs())));
        Assert.assertTrue(((org.sat4j.minisat.core.Solver)solver).getStat().containsKey("inspects"));
        Assert.assertEquals(0L, ((org.sat4j.minisat.core.Solver)solver).getStat().get("inspects"));
        Assert.assertTrue(((org.sat4j.minisat.core.Solver)solver).getStat().containsKey("propagations"));
        Assert.assertEquals(0L, ((org.sat4j.minisat.core.Solver)solver).getStat().get("propagations"));
        Assert.assertTrue(((org.sat4j.minisat.core.Solver)solver).getStat().containsKey("shortcuts"));
        Assert.assertEquals(0, ((org.sat4j.minisat.core.Solver)solver).getStat().get("shortcuts"));
        Assert.assertTrue(((org.sat4j.minisat.core.Solver)solver).getStat().containsKey("ignoredclauses"));
        Assert.assertEquals(0L, ((org.sat4j.minisat.core.Solver)solver).getStat().get("ignoredclauses"));
        Assert.assertTrue(((org.sat4j.minisat.core.Solver)solver).getStat().containsKey("learnedclauses"));
        Assert.assertEquals(0L, ((org.sat4j.minisat.core.Solver)solver).getStat().get("learnedclauses"));
        Assert.assertTrue(((org.sat4j.minisat.core.Solver)solver).getStat().containsKey("importedUnits"));
        Assert.assertEquals(0, ((org.sat4j.minisat.core.Solver)solver).getStat().get("importedUnits"));
        Assert.assertTrue(((org.sat4j.minisat.core.Solver)solver).getStat().containsKey("learnedbinaryclauses"));
        Assert.assertEquals(0L, ((org.sat4j.minisat.core.Solver)solver).getStat().get("learnedbinaryclauses"));
        Assert.assertTrue(((org.sat4j.minisat.core.Solver)solver).getStat().containsKey("reduceddb"));
        Assert.assertEquals(0, ((org.sat4j.minisat.core.Solver)solver).getStat().get("reduceddb"));
        Assert.assertTrue(((org.sat4j.minisat.core.Solver)solver).getStat().containsKey("updateLBD"));
        Assert.assertEquals(0L, ((org.sat4j.minisat.core.Solver)solver).getStat().get("updateLBD"));
        Assert.assertTrue(((org.sat4j.minisat.core.Solver)solver).getStat().containsKey("learnedliterals"));
        Assert.assertEquals(0L, ((org.sat4j.minisat.core.Solver)solver).getStat().get("learnedliterals"));
        Assert.assertTrue(((org.sat4j.minisat.core.Solver)solver).getStat().containsKey("conflicts"));
        Assert.assertEquals(0L, ((org.sat4j.minisat.core.Solver)solver).getStat().get("conflicts"));
        Assert.assertTrue(((org.sat4j.minisat.core.Solver)solver).getStat().containsKey("learnedternaryclauses"));
        Assert.assertEquals(0L, ((org.sat4j.minisat.core.Solver)solver).getStat().get("learnedternaryclauses"));
        Assert.assertTrue(((org.sat4j.minisat.core.Solver)solver).getStat().containsKey("changedreason"));
        Assert.assertEquals(0L, ((org.sat4j.minisat.core.Solver)solver).getStat().get("changedreason"));
        Assert.assertTrue(((org.sat4j.minisat.core.Solver)solver).getStat().containsKey("decisions"));
        Assert.assertEquals(0L, ((org.sat4j.minisat.core.Solver)solver).getStat().get("decisions"));
        Assert.assertTrue(((org.sat4j.minisat.core.Solver)solver).getStat().containsKey("starts"));
        Assert.assertEquals(0, ((org.sat4j.minisat.core.Solver)solver).getStat().get("starts"));
        Assert.assertTrue(((org.sat4j.minisat.core.Solver)solver).getStat().containsKey("rootSimplifications"));
        Assert.assertEquals(0L, ((org.sat4j.minisat.core.Solver)solver).getStat().get("rootSimplifications"));
        Assert.assertTrue(((org.sat4j.minisat.core.Solver)solver).getStat().containsKey("reducedliterals"));
        Assert.assertEquals(0L, ((org.sat4j.minisat.core.Solver)solver).getStat().get("reducedliterals"));
        Assert.assertFalse(((Solver) (solver)).isDBSimplificationAllowed());
        Assert.assertFalse(((Solver) (solver)).isVerbose());
        Assert.assertEquals("c ", ((Solver) (solver)).getLogPrefix());
        Assert.assertFalse(((Solver) (solver)).isSolverKeptHot());
        Assert.assertEquals(2147483647L, ((long) (((ISolver) (((Solver) (solver)).getSolvingEngine())).getTimeoutMs())));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getStat().containsKey("inspects"));
        Assert.assertEquals(0L, ((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getStat().get("inspects"));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getStat().containsKey("propagations"));
        Assert.assertEquals(0L, ((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getStat().get("propagations"));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getStat().containsKey("shortcuts"));
        Assert.assertEquals(0, ((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getStat().get("shortcuts"));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getStat().containsKey("ignoredclauses"));
        Assert.assertEquals(0L, ((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getStat().get("ignoredclauses"));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getStat().containsKey("learnedclauses"));
        Assert.assertEquals(0L, ((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getStat().get("learnedclauses"));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getStat().containsKey("importedUnits"));
        Assert.assertEquals(0, ((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getStat().get("importedUnits"));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getStat().containsKey("learnedbinaryclauses"));
        Assert.assertEquals(0L, ((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getStat().get("learnedbinaryclauses"));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getStat().containsKey("reduceddb"));
        Assert.assertEquals(0, ((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getStat().get("reduceddb"));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getStat().containsKey("updateLBD"));
        Assert.assertEquals(0L, ((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getStat().get("updateLBD"));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getStat().containsKey("learnedliterals"));
        Assert.assertEquals(0L, ((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getStat().get("learnedliterals"));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getStat().containsKey("conflicts"));
        Assert.assertEquals(0L, ((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getStat().get("conflicts"));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getStat().containsKey("learnedternaryclauses"));
        Assert.assertEquals(0L, ((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getStat().get("learnedternaryclauses"));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getStat().containsKey("changedreason"));
        Assert.assertEquals(0L, ((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getStat().get("changedreason"));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getStat().containsKey("decisions"));
        Assert.assertEquals(0L, ((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getStat().get("decisions"));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getStat().containsKey("starts"));
        Assert.assertEquals(0, ((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getStat().get("starts"));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getStat().containsKey("rootSimplifications"));
        Assert.assertEquals(0L, ((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getStat().get("rootSimplifications"));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getStat().containsKey("reducedliterals"));
        Assert.assertEquals(0L, ((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getStat().get("reducedliterals"));
        Assert.assertFalse(((ISolver) (((Solver) (solver)).getSolvingEngine())).isDBSimplificationAllowed());
        Assert.assertFalse(((ISolver) (((Solver) (solver)).getSolvingEngine())).isVerbose());
        Assert.assertEquals("c ", ((ISolver) (((Solver) (solver)).getSolvingEngine())).getLogPrefix());
        Assert.assertFalse(((ISolver) (((Solver) (solver)).getSolvingEngine())).isSolverKeptHot());
        Assert.assertEquals(2147483647L, ((long) (((ISolver) (((ISolver) (((Solver) (solver)).getSolvingEngine())).getSolvingEngine())).getTimeoutMs())));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getSolvingEngine()).getStat().containsKey("inspects"));
        Assert.assertEquals(0L, ((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getSolvingEngine()).getStat().get("inspects"));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getSolvingEngine()).getStat().containsKey("propagations"));
        Assert.assertEquals(0L, ((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getSolvingEngine()).getStat().get("propagations"));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getSolvingEngine()).getStat().containsKey("shortcuts"));
        Assert.assertEquals(0, ((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getSolvingEngine()).getStat().get("shortcuts"));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getSolvingEngine()).getStat().containsKey("ignoredclauses"));
        Assert.assertEquals(0L, ((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getSolvingEngine()).getStat().get("ignoredclauses"));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getSolvingEngine()).getStat().containsKey("learnedclauses"));
        Assert.assertEquals(0L, ((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getSolvingEngine()).getStat().get("learnedclauses"));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getSolvingEngine()).getStat().containsKey("importedUnits"));
        Assert.assertEquals(0, ((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getSolvingEngine()).getStat().get("importedUnits"));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getSolvingEngine()).getStat().containsKey("learnedbinaryclauses"));
        Assert.assertEquals(0L, ((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getSolvingEngine()).getStat().get("learnedbinaryclauses"));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getSolvingEngine()).getStat().containsKey("reduceddb"));
        Assert.assertEquals(0, ((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getSolvingEngine()).getStat().get("reduceddb"));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getSolvingEngine()).getStat().containsKey("updateLBD"));
        Assert.assertEquals(0L, ((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getSolvingEngine()).getStat().get("updateLBD"));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getSolvingEngine()).getStat().containsKey("learnedliterals"));
        Assert.assertEquals(0L, ((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getSolvingEngine()).getStat().get("learnedliterals"));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getSolvingEngine()).getStat().containsKey("conflicts"));
        Assert.assertEquals(0L, ((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getSolvingEngine()).getStat().get("conflicts"));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getSolvingEngine()).getStat().containsKey("learnedternaryclauses"));
        Assert.assertEquals(0L, ((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getSolvingEngine()).getStat().get("learnedternaryclauses"));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getSolvingEngine()).getStat().containsKey("changedreason"));
        Assert.assertEquals(0L, ((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getSolvingEngine()).getStat().get("changedreason"));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getSolvingEngine()).getStat().containsKey("decisions"));
        Assert.assertEquals(0L, ((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getSolvingEngine()).getStat().get("decisions"));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getSolvingEngine()).getStat().containsKey("starts"));
        Assert.assertEquals(0, ((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getSolvingEngine()).getStat().get("starts"));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getSolvingEngine()).getStat().containsKey("rootSimplifications"));
        Assert.assertEquals(0L, ((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getSolvingEngine()).getStat().get("rootSimplifications"));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getSolvingEngine()).getStat().containsKey("reducedliterals"));
        Assert.assertEquals(0L, ((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getSolvingEngine()).getStat().get("reducedliterals"));
        Assert.assertFalse(((ISolver) (((ISolver) (((Solver) (solver)).getSolvingEngine())).getSolvingEngine())).isDBSimplificationAllowed());
        Assert.assertFalse(((ISolver) (((ISolver) (((Solver) (solver)).getSolvingEngine())).getSolvingEngine())).isVerbose());
        Assert.assertEquals("c ", ((ISolver) (((ISolver) (((Solver) (solver)).getSolvingEngine())).getSolvingEngine())).getLogPrefix());
        Assert.assertFalse(((ISolver) (((ISolver) (((Solver) (solver)).getSolvingEngine())).getSolvingEngine())).isSolverKeptHot());
        Assert.assertEquals(2147483, ((int) (((ISolver) (((ISolver) (((Solver) (solver)).getSolvingEngine())).getSolvingEngine())).getTimeout())));
        Assert.assertTrue(((ISolver) (((ISolver) (((Solver) (solver)).getSolvingEngine())).getSolvingEngine())).isSatisfiable());
        Assert.assertEquals(2147483, ((int) (((ISolver) (((Solver) (solver)).getSolvingEngine())).getTimeout())));
        Assert.assertTrue(((ISolver) (((Solver) (solver)).getSolvingEngine())).isSatisfiable());
        Assert.assertTrue(((IVecInt) (((Solver) (solver)).getOutLearnt())).isEmpty());
        Assert.assertTrue(((IVec) (((Solver) (solver)).getLearnedConstraints())).isEmpty());
        Assert.assertTrue(((Solver) (solver)).isSatisfiable());
        Assert.assertEquals(2147483, ((int) (((Solver) (solver)).getTimeout())));
        int o_checkModelIterationWithUnitlitNum3575litNum3757__3 = solver.newVar(3);
        Assert.assertEquals(3, ((int) (o_checkModelIterationWithUnitlitNum3575litNum3757__3)));
        solver.setExpectedNumberOfClauses(3);
        IConstr o_checkModelIterationWithUnitlitNum3575litNum3757__5 = solver.addClause(new VecInt(new int[]{ 1 }));
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_checkModelIterationWithUnitlitNum3575litNum3757__5)).getActivity())), 0.1);
        Assert.assertTrue(((UnitClause) (o_checkModelIterationWithUnitlitNum3575litNum3757__5)).isSatisfied());
        Assert.assertEquals("1", ((UnitClause) (o_checkModelIterationWithUnitlitNum3575litNum3757__5)).toString());
        solver.addClause(new VecInt(new int[]{ 1, 3 }));
        solver.addClause(new VecInt(new int[]{ -1, -2 }));
        ModelIterator iterator = new ModelIterator(solver);
        while (iterator.isSatisfiable()) {
            iterator.model();
        } 
        iterator.numberOfModelsFoundSoFar();
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithUnitlitNum3575litNum3763() throws Exception, ContradictionException, TimeoutException {
        ISolver solver = SolverFactory.newDefault();
        Assert.assertEquals(100, ((int) (((SearchParams) (((Solver) (solver)).getSearchParams())).getInitConflictBound())));
        Assert.assertEquals(1.5, ((double) (((SearchParams) (((Solver) (solver)).getSearchParams())).getConflictBoundIncFactor())), 0.1);
        Assert.assertEquals(0.95, ((double) (((SearchParams) (((Solver) (solver)).getSearchParams())).getVarDecay())), 0.1);
        Assert.assertEquals(0.999, ((double) (((SearchParams) (((Solver) (solver)).getSearchParams())).getClaDecay())), 0.1);
        Assert.assertFalse(((RestartStrategy) (((Solver) (solver)).getRestartStrategy())).shouldRestart());
        Assert.assertEquals(2147483647L, ((long) (((Solver) (solver)).getTimeoutMs())));
        Assert.assertTrue(((org.sat4j.minisat.core.Solver)solver).getStat().containsKey("inspects"));
        Assert.assertEquals(0L, ((org.sat4j.minisat.core.Solver)solver).getStat().get("inspects"));
        Assert.assertTrue(((org.sat4j.minisat.core.Solver)solver).getStat().containsKey("propagations"));
        Assert.assertEquals(0L, ((org.sat4j.minisat.core.Solver)solver).getStat().get("propagations"));
        Assert.assertTrue(((org.sat4j.minisat.core.Solver)solver).getStat().containsKey("shortcuts"));
        Assert.assertEquals(0, ((org.sat4j.minisat.core.Solver)solver).getStat().get("shortcuts"));
        Assert.assertTrue(((org.sat4j.minisat.core.Solver)solver).getStat().containsKey("ignoredclauses"));
        Assert.assertEquals(0L, ((org.sat4j.minisat.core.Solver)solver).getStat().get("ignoredclauses"));
        Assert.assertTrue(((org.sat4j.minisat.core.Solver)solver).getStat().containsKey("learnedclauses"));
        Assert.assertEquals(0L, ((org.sat4j.minisat.core.Solver)solver).getStat().get("learnedclauses"));
        Assert.assertTrue(((org.sat4j.minisat.core.Solver)solver).getStat().containsKey("importedUnits"));
        Assert.assertEquals(0, ((org.sat4j.minisat.core.Solver)solver).getStat().get("importedUnits"));
        Assert.assertTrue(((org.sat4j.minisat.core.Solver)solver).getStat().containsKey("learnedbinaryclauses"));
        Assert.assertEquals(0L, ((org.sat4j.minisat.core.Solver)solver).getStat().get("learnedbinaryclauses"));
        Assert.assertTrue(((org.sat4j.minisat.core.Solver)solver).getStat().containsKey("reduceddb"));
        Assert.assertEquals(0, ((org.sat4j.minisat.core.Solver)solver).getStat().get("reduceddb"));
        Assert.assertTrue(((org.sat4j.minisat.core.Solver)solver).getStat().containsKey("updateLBD"));
        Assert.assertEquals(0L, ((org.sat4j.minisat.core.Solver)solver).getStat().get("updateLBD"));
        Assert.assertTrue(((org.sat4j.minisat.core.Solver)solver).getStat().containsKey("learnedliterals"));
        Assert.assertEquals(0L, ((org.sat4j.minisat.core.Solver)solver).getStat().get("learnedliterals"));
        Assert.assertTrue(((org.sat4j.minisat.core.Solver)solver).getStat().containsKey("conflicts"));
        Assert.assertEquals(0L, ((org.sat4j.minisat.core.Solver)solver).getStat().get("conflicts"));
        Assert.assertTrue(((org.sat4j.minisat.core.Solver)solver).getStat().containsKey("learnedternaryclauses"));
        Assert.assertEquals(0L, ((org.sat4j.minisat.core.Solver)solver).getStat().get("learnedternaryclauses"));
        Assert.assertTrue(((org.sat4j.minisat.core.Solver)solver).getStat().containsKey("changedreason"));
        Assert.assertEquals(0L, ((org.sat4j.minisat.core.Solver)solver).getStat().get("changedreason"));
        Assert.assertTrue(((org.sat4j.minisat.core.Solver)solver).getStat().containsKey("decisions"));
        Assert.assertEquals(0L, ((org.sat4j.minisat.core.Solver)solver).getStat().get("decisions"));
        Assert.assertTrue(((org.sat4j.minisat.core.Solver)solver).getStat().containsKey("starts"));
        Assert.assertEquals(0, ((org.sat4j.minisat.core.Solver)solver).getStat().get("starts"));
        Assert.assertTrue(((org.sat4j.minisat.core.Solver)solver).getStat().containsKey("rootSimplifications"));
        Assert.assertEquals(0L, ((org.sat4j.minisat.core.Solver)solver).getStat().get("rootSimplifications"));
        Assert.assertTrue(((org.sat4j.minisat.core.Solver)solver).getStat().containsKey("reducedliterals"));
        Assert.assertEquals(0L, ((org.sat4j.minisat.core.Solver)solver).getStat().get("reducedliterals"));
        Assert.assertFalse(((Solver) (solver)).isDBSimplificationAllowed());
        Assert.assertFalse(((Solver) (solver)).isVerbose());
        Assert.assertEquals("c ", ((Solver) (solver)).getLogPrefix());
        Assert.assertFalse(((Solver) (solver)).isSolverKeptHot());
        Assert.assertEquals(2147483647L, ((long) (((ISolver) (((Solver) (solver)).getSolvingEngine())).getTimeoutMs())));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getStat().containsKey("inspects"));
        Assert.assertEquals(0L, ((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getStat().get("inspects"));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getStat().containsKey("propagations"));
        Assert.assertEquals(0L, ((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getStat().get("propagations"));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getStat().containsKey("shortcuts"));
        Assert.assertEquals(0, ((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getStat().get("shortcuts"));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getStat().containsKey("ignoredclauses"));
        Assert.assertEquals(0L, ((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getStat().get("ignoredclauses"));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getStat().containsKey("learnedclauses"));
        Assert.assertEquals(0L, ((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getStat().get("learnedclauses"));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getStat().containsKey("importedUnits"));
        Assert.assertEquals(0, ((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getStat().get("importedUnits"));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getStat().containsKey("learnedbinaryclauses"));
        Assert.assertEquals(0L, ((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getStat().get("learnedbinaryclauses"));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getStat().containsKey("reduceddb"));
        Assert.assertEquals(0, ((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getStat().get("reduceddb"));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getStat().containsKey("updateLBD"));
        Assert.assertEquals(0L, ((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getStat().get("updateLBD"));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getStat().containsKey("learnedliterals"));
        Assert.assertEquals(0L, ((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getStat().get("learnedliterals"));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getStat().containsKey("conflicts"));
        Assert.assertEquals(0L, ((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getStat().get("conflicts"));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getStat().containsKey("learnedternaryclauses"));
        Assert.assertEquals(0L, ((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getStat().get("learnedternaryclauses"));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getStat().containsKey("changedreason"));
        Assert.assertEquals(0L, ((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getStat().get("changedreason"));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getStat().containsKey("decisions"));
        Assert.assertEquals(0L, ((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getStat().get("decisions"));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getStat().containsKey("starts"));
        Assert.assertEquals(0, ((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getStat().get("starts"));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getStat().containsKey("rootSimplifications"));
        Assert.assertEquals(0L, ((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getStat().get("rootSimplifications"));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getStat().containsKey("reducedliterals"));
        Assert.assertEquals(0L, ((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getStat().get("reducedliterals"));
        Assert.assertFalse(((ISolver) (((Solver) (solver)).getSolvingEngine())).isDBSimplificationAllowed());
        Assert.assertFalse(((ISolver) (((Solver) (solver)).getSolvingEngine())).isVerbose());
        Assert.assertEquals("c ", ((ISolver) (((Solver) (solver)).getSolvingEngine())).getLogPrefix());
        Assert.assertFalse(((ISolver) (((Solver) (solver)).getSolvingEngine())).isSolverKeptHot());
        Assert.assertEquals(2147483647L, ((long) (((ISolver) (((ISolver) (((Solver) (solver)).getSolvingEngine())).getSolvingEngine())).getTimeoutMs())));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getSolvingEngine()).getStat().containsKey("inspects"));
        Assert.assertEquals(0L, ((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getSolvingEngine()).getStat().get("inspects"));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getSolvingEngine()).getStat().containsKey("propagations"));
        Assert.assertEquals(0L, ((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getSolvingEngine()).getStat().get("propagations"));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getSolvingEngine()).getStat().containsKey("shortcuts"));
        Assert.assertEquals(0, ((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getSolvingEngine()).getStat().get("shortcuts"));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getSolvingEngine()).getStat().containsKey("ignoredclauses"));
        Assert.assertEquals(0L, ((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getSolvingEngine()).getStat().get("ignoredclauses"));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getSolvingEngine()).getStat().containsKey("learnedclauses"));
        Assert.assertEquals(0L, ((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getSolvingEngine()).getStat().get("learnedclauses"));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getSolvingEngine()).getStat().containsKey("importedUnits"));
        Assert.assertEquals(0, ((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getSolvingEngine()).getStat().get("importedUnits"));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getSolvingEngine()).getStat().containsKey("learnedbinaryclauses"));
        Assert.assertEquals(0L, ((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getSolvingEngine()).getStat().get("learnedbinaryclauses"));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getSolvingEngine()).getStat().containsKey("reduceddb"));
        Assert.assertEquals(0, ((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getSolvingEngine()).getStat().get("reduceddb"));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getSolvingEngine()).getStat().containsKey("updateLBD"));
        Assert.assertEquals(0L, ((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getSolvingEngine()).getStat().get("updateLBD"));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getSolvingEngine()).getStat().containsKey("learnedliterals"));
        Assert.assertEquals(0L, ((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getSolvingEngine()).getStat().get("learnedliterals"));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getSolvingEngine()).getStat().containsKey("conflicts"));
        Assert.assertEquals(0L, ((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getSolvingEngine()).getStat().get("conflicts"));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getSolvingEngine()).getStat().containsKey("learnedternaryclauses"));
        Assert.assertEquals(0L, ((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getSolvingEngine()).getStat().get("learnedternaryclauses"));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getSolvingEngine()).getStat().containsKey("changedreason"));
        Assert.assertEquals(0L, ((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getSolvingEngine()).getStat().get("changedreason"));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getSolvingEngine()).getStat().containsKey("decisions"));
        Assert.assertEquals(0L, ((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getSolvingEngine()).getStat().get("decisions"));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getSolvingEngine()).getStat().containsKey("starts"));
        Assert.assertEquals(0, ((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getSolvingEngine()).getStat().get("starts"));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getSolvingEngine()).getStat().containsKey("rootSimplifications"));
        Assert.assertEquals(0L, ((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getSolvingEngine()).getStat().get("rootSimplifications"));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getSolvingEngine()).getStat().containsKey("reducedliterals"));
        Assert.assertEquals(0L, ((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.minisat.core.Solver)solver).getSolvingEngine()).getSolvingEngine()).getStat().get("reducedliterals"));
        Assert.assertFalse(((ISolver) (((ISolver) (((Solver) (solver)).getSolvingEngine())).getSolvingEngine())).isDBSimplificationAllowed());
        Assert.assertFalse(((ISolver) (((ISolver) (((Solver) (solver)).getSolvingEngine())).getSolvingEngine())).isVerbose());
        Assert.assertEquals("c ", ((ISolver) (((ISolver) (((Solver) (solver)).getSolvingEngine())).getSolvingEngine())).getLogPrefix());
        Assert.assertFalse(((ISolver) (((ISolver) (((Solver) (solver)).getSolvingEngine())).getSolvingEngine())).isSolverKeptHot());
        Assert.assertEquals(2147483, ((int) (((ISolver) (((ISolver) (((Solver) (solver)).getSolvingEngine())).getSolvingEngine())).getTimeout())));
        Assert.assertTrue(((ISolver) (((ISolver) (((Solver) (solver)).getSolvingEngine())).getSolvingEngine())).isSatisfiable());
        Assert.assertEquals(2147483, ((int) (((ISolver) (((Solver) (solver)).getSolvingEngine())).getTimeout())));
        Assert.assertTrue(((ISolver) (((Solver) (solver)).getSolvingEngine())).isSatisfiable());
        Assert.assertTrue(((IVecInt) (((Solver) (solver)).getOutLearnt())).isEmpty());
        Assert.assertTrue(((IVec) (((Solver) (solver)).getLearnedConstraints())).isEmpty());
        Assert.assertTrue(((Solver) (solver)).isSatisfiable());
        Assert.assertEquals(2147483, ((int) (((Solver) (solver)).getTimeout())));
        int o_checkModelIterationWithUnitlitNum3575litNum3763__3 = solver.newVar(3);
        Assert.assertEquals(3, ((int) (o_checkModelIterationWithUnitlitNum3575litNum3763__3)));
        solver.setExpectedNumberOfClauses(3);
        IConstr o_checkModelIterationWithUnitlitNum3575litNum3763__5 = solver.addClause(new VecInt(new int[]{ 1 }));
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_checkModelIterationWithUnitlitNum3575litNum3763__5)).getActivity())), 0.1);
        Assert.assertTrue(((UnitClause) (o_checkModelIterationWithUnitlitNum3575litNum3763__5)).isSatisfied());
        Assert.assertEquals("1", ((UnitClause) (o_checkModelIterationWithUnitlitNum3575litNum3763__5)).toString());
        solver.addClause(new VecInt(new int[]{ 1, 2 }));
        solver.addClause(new VecInt(new int[]{ -2, -2 }));
        ModelIterator iterator = new ModelIterator(solver);
        while (iterator.isSatisfiable()) {
            iterator.model();
        } 
        iterator.numberOfModelsFoundSoFar();
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithUnitlitNum3575litNum3748_failAssert394() throws Exception, ContradictionException, TimeoutException {
        try {
            ISolver solver = SolverFactory.newDefault();
            solver.newVar(3);
            solver.setExpectedNumberOfClauses(3);
            solver.addClause(new VecInt(new int[]{ 0 }));
            solver.addClause(new VecInt(new int[]{ 1, 2 }));
            solver.addClause(new VecInt(new int[]{ -1, -2 }));
            ModelIterator iterator = new ModelIterator(solver);
            while (iterator.isSatisfiable()) {
                iterator.model();
            } 
            iterator.numberOfModelsFoundSoFar();
            org.junit.Assert.fail("checkModelIterationWithUnitlitNum3575litNum3748 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithUnitlitNum3575litNum3749_failAssert395() throws Exception, ContradictionException, TimeoutException {
        try {
            ISolver solver = SolverFactory.newDefault();
            solver.newVar(3);
            solver.setExpectedNumberOfClauses(3);
            solver.addClause(new VecInt(new int[]{ Integer.MAX_VALUE }));
            solver.addClause(new VecInt(new int[]{ 1, 2 }));
            solver.addClause(new VecInt(new int[]{ -1, -2 }));
            ModelIterator iterator = new ModelIterator(solver);
            while (iterator.isSatisfiable()) {
                iterator.model();
            } 
            iterator.numberOfModelsFoundSoFar();
            org.junit.Assert.fail("checkModelIterationWithUnitlitNum3575litNum3749 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithUnitlitNum3575litNum3750_failAssert396() throws Exception, ContradictionException, TimeoutException {
        try {
            ISolver solver = SolverFactory.newDefault();
            solver.newVar(3);
            solver.setExpectedNumberOfClauses(3);
            solver.addClause(new VecInt(new int[]{ Integer.MIN_VALUE }));
            solver.addClause(new VecInt(new int[]{ 1, 2 }));
            solver.addClause(new VecInt(new int[]{ -1, -2 }));
            ModelIterator iterator = new ModelIterator(solver);
            while (iterator.isSatisfiable()) {
                iterator.model();
            } 
            iterator.numberOfModelsFoundSoFar();
            org.junit.Assert.fail("checkModelIterationWithUnitlitNum3575litNum3750 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-2147483648", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithUnitlitNum3575litNum3752_failAssert397() throws Exception, ContradictionException, TimeoutException {
        try {
            ISolver solver = SolverFactory.newDefault();
            solver.newVar(3);
            solver.setExpectedNumberOfClauses(3);
            solver.addClause(new VecInt(new int[]{ 1 }));
            solver.addClause(new VecInt(new int[]{ 2, 2 }));
            solver.addClause(new VecInt(new int[]{ -1, -2 }));
            ModelIterator iterator = new ModelIterator(solver);
            while (iterator.isSatisfiable()) {
                iterator.model();
            } 
            iterator.numberOfModelsFoundSoFar();
            org.junit.Assert.fail("checkModelIterationWithUnitlitNum3575litNum3752 should have thrown ContradictionException");
        } catch (ContradictionException expected) {
            Assert.assertEquals("Creating Empty clause ?", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithUnitlitNum3575litNum3753_failAssert398() throws Exception, ContradictionException, TimeoutException {
        try {
            ISolver solver = SolverFactory.newDefault();
            solver.newVar(3);
            solver.setExpectedNumberOfClauses(3);
            solver.addClause(new VecInt(new int[]{ 1 }));
            solver.addClause(new VecInt(new int[]{ 0, 2 }));
            solver.addClause(new VecInt(new int[]{ -1, -2 }));
            ModelIterator iterator = new ModelIterator(solver);
            while (iterator.isSatisfiable()) {
                iterator.model();
            } 
            iterator.numberOfModelsFoundSoFar();
            org.junit.Assert.fail("checkModelIterationWithUnitlitNum3575litNum3753 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithUnitlitNum3575litNum3754_failAssert399() throws Exception, ContradictionException, TimeoutException {
        try {
            ISolver solver = SolverFactory.newDefault();
            solver.newVar(3);
            solver.setExpectedNumberOfClauses(3);
            solver.addClause(new VecInt(new int[]{ 1 }));
            solver.addClause(new VecInt(new int[]{ Integer.MAX_VALUE, 2 }));
            solver.addClause(new VecInt(new int[]{ -1, -2 }));
            ModelIterator iterator = new ModelIterator(solver);
            while (iterator.isSatisfiable()) {
                iterator.model();
            } 
            iterator.numberOfModelsFoundSoFar();
            org.junit.Assert.fail("checkModelIterationWithUnitlitNum3575litNum3754 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithUnitlitNum3575litNum3764_failAssert404() throws Exception, ContradictionException, TimeoutException {
        try {
            ISolver solver = SolverFactory.newDefault();
            solver.newVar(3);
            solver.setExpectedNumberOfClauses(3);
            solver.addClause(new VecInt(new int[]{ 1 }));
            solver.addClause(new VecInt(new int[]{ 1, 2 }));
            solver.addClause(new VecInt(new int[]{ -0, -2 }));
            ModelIterator iterator = new ModelIterator(solver);
            while (iterator.isSatisfiable()) {
                iterator.model();
            } 
            iterator.numberOfModelsFoundSoFar();
            org.junit.Assert.fail("checkModelIterationWithUnitlitNum3575litNum3764 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithUnitlitNum3575litNum3765_failAssert405() throws Exception, ContradictionException, TimeoutException {
        try {
            ISolver solver = SolverFactory.newDefault();
            solver.newVar(3);
            solver.setExpectedNumberOfClauses(3);
            solver.addClause(new VecInt(new int[]{ 1 }));
            solver.addClause(new VecInt(new int[]{ 1, 2 }));
            solver.addClause(new VecInt(new int[]{ -(Integer.MAX_VALUE), -2 }));
            ModelIterator iterator = new ModelIterator(solver);
            while (iterator.isSatisfiable()) {
                iterator.model();
            } 
            iterator.numberOfModelsFoundSoFar();
            org.junit.Assert.fail("checkModelIterationWithUnitlitNum3575litNum3765 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithUnitlitNum3575litNum3769_failAssert407() throws Exception, ContradictionException, TimeoutException {
        try {
            ISolver solver = SolverFactory.newDefault();
            solver.newVar(3);
            solver.setExpectedNumberOfClauses(3);
            solver.addClause(new VecInt(new int[]{ 1 }));
            solver.addClause(new VecInt(new int[]{ 1, 2 }));
            solver.addClause(new VecInt(new int[]{ -1, -1 }));
            ModelIterator iterator = new ModelIterator(solver);
            while (iterator.isSatisfiable()) {
                iterator.model();
            } 
            iterator.numberOfModelsFoundSoFar();
            org.junit.Assert.fail("checkModelIterationWithUnitlitNum3575litNum3769 should have thrown ContradictionException");
        } catch (ContradictionException expected) {
            Assert.assertEquals("Creating Empty clause ?", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithUnitlitNum3575litNum3772_failAssert410() throws Exception, ContradictionException, TimeoutException {
        try {
            ISolver solver = SolverFactory.newDefault();
            solver.newVar(3);
            solver.setExpectedNumberOfClauses(3);
            solver.addClause(new VecInt(new int[]{ 1 }));
            solver.addClause(new VecInt(new int[]{ 1, 2 }));
            solver.addClause(new VecInt(new int[]{ -1, -0 }));
            ModelIterator iterator = new ModelIterator(solver);
            while (iterator.isSatisfiable()) {
                iterator.model();
            } 
            iterator.numberOfModelsFoundSoFar();
            org.junit.Assert.fail("checkModelIterationWithUnitlitNum3575litNum3772 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithUnitlitNum3575litNum3752_failAssert397litNum3911_failAssert412() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                ISolver solver = SolverFactory.newDefault();
                solver.newVar(3);
                solver.setExpectedNumberOfClauses(3);
                solver.addClause(new VecInt(new int[]{ 1 }));
                solver.addClause(new VecInt(new int[]{ 2, 2 }));
                solver.addClause(new VecInt(new int[]{ -1, -0 }));
                ModelIterator iterator = new ModelIterator(solver);
                while (iterator.isSatisfiable()) {
                    iterator.model();
                } 
                iterator.numberOfModelsFoundSoFar();
                org.junit.Assert.fail("checkModelIterationWithUnitlitNum3575litNum3752 should have thrown ContradictionException");
            }
            org.junit.Assert.fail("checkModelIterationWithUnitlitNum3575litNum3752_failAssert397litNum3911 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithUnitlitNum3575litNum3752_failAssert397litNum3903_failAssert413() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                ISolver solver = SolverFactory.newDefault();
                solver.newVar(3);
                solver.setExpectedNumberOfClauses(3);
                solver.addClause(new VecInt(new int[]{ 1 }));
                solver.addClause(new VecInt(new int[]{ 2, 2 }));
                solver.addClause(new VecInt(new int[]{ -1, -1 }));
                ModelIterator iterator = new ModelIterator(solver);
                while (iterator.isSatisfiable()) {
                    iterator.model();
                } 
                iterator.numberOfModelsFoundSoFar();
                org.junit.Assert.fail("checkModelIterationWithUnitlitNum3575litNum3752 should have thrown ContradictionException");
            }
            org.junit.Assert.fail("checkModelIterationWithUnitlitNum3575litNum3752_failAssert397litNum3903 should have thrown ContradictionException");
        } catch (ContradictionException expected) {
            Assert.assertEquals("Creating Empty clause ?", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithUnitlitNum3575litNum3752_failAssert397litNum3878_failAssert416() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                ISolver solver = SolverFactory.newDefault();
                solver.newVar(3);
                solver.setExpectedNumberOfClauses(3);
                solver.addClause(new VecInt(new int[]{ 1 }));
                solver.addClause(new VecInt(new int[]{ 2, 0 }));
                solver.addClause(new VecInt(new int[]{ -1, -2 }));
                ModelIterator iterator = new ModelIterator(solver);
                while (iterator.isSatisfiable()) {
                    iterator.model();
                } 
                iterator.numberOfModelsFoundSoFar();
                org.junit.Assert.fail("checkModelIterationWithUnitlitNum3575litNum3752 should have thrown ContradictionException");
            }
            org.junit.Assert.fail("checkModelIterationWithUnitlitNum3575litNum3752_failAssert397litNum3878 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithUnitlitNum3575litNum3769_failAssert407litNum3873_failAssert420() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                ISolver solver = SolverFactory.newDefault();
                solver.newVar(3);
                solver.setExpectedNumberOfClauses(3);
                solver.addClause(new VecInt(new int[]{ 1 }));
                solver.addClause(new VecInt(new int[]{ 1, 1 }));
                solver.addClause(new VecInt(new int[]{ -1, -1 }));
                ModelIterator iterator = new ModelIterator(solver);
                while (iterator.isSatisfiable()) {
                    iterator.model();
                } 
                iterator.numberOfModelsFoundSoFar();
                org.junit.Assert.fail("checkModelIterationWithUnitlitNum3575litNum3769 should have thrown ContradictionException");
            }
            org.junit.Assert.fail("checkModelIterationWithUnitlitNum3575litNum3769_failAssert407litNum3873 should have thrown ContradictionException");
        } catch (ContradictionException expected) {
            Assert.assertEquals("Creating Empty clause ?", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithUnitlitNum3575litNum3769_failAssert407litNum3893_failAssert421() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                ISolver solver = SolverFactory.newDefault();
                solver.newVar(3);
                solver.setExpectedNumberOfClauses(3);
                solver.addClause(new VecInt(new int[]{ 1 }));
                solver.addClause(new VecInt(new int[]{ 1, 2 }));
                solver.addClause(new VecInt(new int[]{ -0, -1 }));
                ModelIterator iterator = new ModelIterator(solver);
                while (iterator.isSatisfiable()) {
                    iterator.model();
                } 
                iterator.numberOfModelsFoundSoFar();
                org.junit.Assert.fail("checkModelIterationWithUnitlitNum3575litNum3769 should have thrown ContradictionException");
            }
            org.junit.Assert.fail("checkModelIterationWithUnitlitNum3575litNum3769_failAssert407litNum3893 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithUnitlitNum3575litNum3749_failAssert395litNum4100_failAssert423() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                ISolver solver = SolverFactory.newDefault();
                solver.newVar(3);
                solver.setExpectedNumberOfClauses(3);
                solver.addClause(new VecInt(new int[]{ Integer.MAX_VALUE }));
                solver.addClause(new VecInt(new int[]{ 1, 2 }));
                solver.addClause(new VecInt(new int[]{ -1, -0 }));
                ModelIterator iterator = new ModelIterator(solver);
                while (iterator.isSatisfiable()) {
                    iterator.model();
                } 
                iterator.numberOfModelsFoundSoFar();
                org.junit.Assert.fail("checkModelIterationWithUnitlitNum3575litNum3749 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("checkModelIterationWithUnitlitNum3575litNum3749_failAssert395litNum4100 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithUnitlitNum3575litNum3754_failAssert399litNum3912_failAssert424() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                ISolver solver = SolverFactory.newDefault();
                solver.newVar(3);
                solver.setExpectedNumberOfClauses(0);
                solver.addClause(new VecInt(new int[]{ 1 }));
                solver.addClause(new VecInt(new int[]{ Integer.MAX_VALUE, 2 }));
                solver.addClause(new VecInt(new int[]{ -1, -2 }));
                ModelIterator iterator = new ModelIterator(solver);
                while (iterator.isSatisfiable()) {
                    iterator.model();
                } 
                iterator.numberOfModelsFoundSoFar();
                org.junit.Assert.fail("checkModelIterationWithUnitlitNum3575litNum3754 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("checkModelIterationWithUnitlitNum3575litNum3754_failAssert399litNum3912 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithUnitlitNum3575litNum3754_failAssert399litNum3917_failAssert436() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                ISolver solver = SolverFactory.newDefault();
                solver.newVar(3);
                solver.setExpectedNumberOfClauses(3);
                solver.addClause(new VecInt(new int[]{ 0 }));
                solver.addClause(new VecInt(new int[]{ Integer.MAX_VALUE, 2 }));
                solver.addClause(new VecInt(new int[]{ -1, -2 }));
                ModelIterator iterator = new ModelIterator(solver);
                while (iterator.isSatisfiable()) {
                    iterator.model();
                } 
                iterator.numberOfModelsFoundSoFar();
                org.junit.Assert.fail("checkModelIterationWithUnitlitNum3575litNum3754 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("checkModelIterationWithUnitlitNum3575litNum3754_failAssert399litNum3917 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithUnitlitNum3575litNum3765_failAssert405litNum4020_failAssert449() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                ISolver solver = SolverFactory.newDefault();
                solver.newVar(3);
                solver.setExpectedNumberOfClauses(3);
                solver.addClause(new VecInt(new int[]{ 1 }));
                solver.addClause(new VecInt(new int[]{ 1, 1 }));
                solver.addClause(new VecInt(new int[]{ -(Integer.MAX_VALUE), -2 }));
                ModelIterator iterator = new ModelIterator(solver);
                while (iterator.isSatisfiable()) {
                    iterator.model();
                } 
                iterator.numberOfModelsFoundSoFar();
                org.junit.Assert.fail("checkModelIterationWithUnitlitNum3575litNum3765 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("checkModelIterationWithUnitlitNum3575litNum3765_failAssert405litNum4020 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithUnitlitNum3575litNum3765_failAssert405litNum4004_failAssert451() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                ISolver solver = SolverFactory.newDefault();
                solver.newVar(3);
                solver.setExpectedNumberOfClauses(3);
                solver.addClause(new VecInt(new int[]{ 1 }));
                solver.addClause(new VecInt(new int[]{ 2, 2 }));
                solver.addClause(new VecInt(new int[]{ -(Integer.MAX_VALUE), -2 }));
                ModelIterator iterator = new ModelIterator(solver);
                while (iterator.isSatisfiable()) {
                    iterator.model();
                } 
                iterator.numberOfModelsFoundSoFar();
                org.junit.Assert.fail("checkModelIterationWithUnitlitNum3575litNum3765 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("checkModelIterationWithUnitlitNum3575litNum3765_failAssert405litNum4004 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithUnitlitNum3575litNum3765_failAssert405litNum4026_failAssert453() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                ISolver solver = SolverFactory.newDefault();
                solver.newVar(3);
                solver.setExpectedNumberOfClauses(3);
                solver.addClause(new VecInt(new int[]{ 1 }));
                solver.addClause(new VecInt(new int[]{ 1, 0 }));
                solver.addClause(new VecInt(new int[]{ -(Integer.MAX_VALUE), -2 }));
                ModelIterator iterator = new ModelIterator(solver);
                while (iterator.isSatisfiable()) {
                    iterator.model();
                } 
                iterator.numberOfModelsFoundSoFar();
                org.junit.Assert.fail("checkModelIterationWithUnitlitNum3575litNum3765 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("checkModelIterationWithUnitlitNum3575litNum3765_failAssert405litNum4026 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithUnitlitNum3575litNum3765_failAssert405litNum3991_failAssert487() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                ISolver solver = SolverFactory.newDefault();
                solver.newVar(3);
                solver.setExpectedNumberOfClauses(406407834);
                solver.addClause(new VecInt(new int[]{ 1 }));
                solver.addClause(new VecInt(new int[]{ 1, 2 }));
                solver.addClause(new VecInt(new int[]{ -(Integer.MAX_VALUE), -2 }));
                ModelIterator iterator = new ModelIterator(solver);
                while (iterator.isSatisfiable()) {
                    iterator.model();
                } 
                iterator.numberOfModelsFoundSoFar();
                org.junit.Assert.fail("checkModelIterationWithUnitlitNum3575litNum3765 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("checkModelIterationWithUnitlitNum3575litNum3765_failAssert405litNum3991 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithUnitlitNum3575litNum3752_failAssert397_add3933_failAssert496() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                ISolver solver = SolverFactory.newDefault();
                solver.newVar(3);
                solver.newVar(3);
                solver.setExpectedNumberOfClauses(3);
                solver.addClause(new VecInt(new int[]{ 1 }));
                solver.addClause(new VecInt(new int[]{ 2, 2 }));
                solver.addClause(new VecInt(new int[]{ -1, -2 }));
                ModelIterator iterator = new ModelIterator(solver);
                while (iterator.isSatisfiable()) {
                    iterator.model();
                } 
                iterator.numberOfModelsFoundSoFar();
                org.junit.Assert.fail("checkModelIterationWithUnitlitNum3575litNum3752 should have thrown ContradictionException");
            }
            org.junit.Assert.fail("checkModelIterationWithUnitlitNum3575litNum3752_failAssert397_add3933 should have thrown ContradictionException");
        } catch (ContradictionException expected) {
            Assert.assertEquals("Creating Empty clause ?", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithUnitlitNum3575litNum3769_failAssert407_add3922_failAssert497() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                ISolver solver = SolverFactory.newDefault();
                solver.newVar(3);
                solver.newVar(3);
                solver.setExpectedNumberOfClauses(3);
                solver.addClause(new VecInt(new int[]{ 1 }));
                solver.addClause(new VecInt(new int[]{ 1, 2 }));
                solver.addClause(new VecInt(new int[]{ -1, -1 }));
                ModelIterator iterator = new ModelIterator(solver);
                while (iterator.isSatisfiable()) {
                    iterator.model();
                } 
                iterator.numberOfModelsFoundSoFar();
                org.junit.Assert.fail("checkModelIterationWithUnitlitNum3575litNum3769 should have thrown ContradictionException");
            }
            org.junit.Assert.fail("checkModelIterationWithUnitlitNum3575litNum3769_failAssert407_add3922 should have thrown ContradictionException");
        } catch (ContradictionException expected) {
            Assert.assertEquals("Creating Empty clause ?", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithUnitlitNum3575litNum3750_failAssert396litNum4010_failAssert498() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                ISolver solver = SolverFactory.newDefault();
                solver.newVar(3);
                solver.setExpectedNumberOfClauses(3);
                solver.addClause(new VecInt(new int[]{ Integer.MIN_VALUE }));
                solver.addClause(new VecInt(new int[]{ 1, 0 }));
                solver.addClause(new VecInt(new int[]{ -1, -2 }));
                ModelIterator iterator = new ModelIterator(solver);
                while (iterator.isSatisfiable()) {
                    iterator.model();
                } 
                iterator.numberOfModelsFoundSoFar();
                org.junit.Assert.fail("checkModelIterationWithUnitlitNum3575litNum3750 should have thrown ArrayIndexOutOfBoundsException");
            }
            org.junit.Assert.fail("checkModelIterationWithUnitlitNum3575litNum3750_failAssert396litNum4010 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-2147483648", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithUnitlitNum3575litNum3749_failAssert395_add4104_failAssert519() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                ISolver solver = SolverFactory.newDefault();
                solver.newVar(3);
                solver.newVar(3);
                solver.setExpectedNumberOfClauses(3);
                solver.addClause(new VecInt(new int[]{ Integer.MAX_VALUE }));
                solver.addClause(new VecInt(new int[]{ 1, 2 }));
                solver.addClause(new VecInt(new int[]{ -1, -2 }));
                ModelIterator iterator = new ModelIterator(solver);
                while (iterator.isSatisfiable()) {
                    iterator.model();
                } 
                iterator.numberOfModelsFoundSoFar();
                org.junit.Assert.fail("checkModelIterationWithUnitlitNum3575litNum3749 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("checkModelIterationWithUnitlitNum3575litNum3749_failAssert395_add4104 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithUnitlitNum3575litNum3754_failAssert399_add3959_failAssert520() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                ISolver solver = SolverFactory.newDefault();
                solver.newVar(3);
                solver.newVar(3);
                solver.setExpectedNumberOfClauses(3);
                solver.addClause(new VecInt(new int[]{ 1 }));
                solver.addClause(new VecInt(new int[]{ Integer.MAX_VALUE, 2 }));
                solver.addClause(new VecInt(new int[]{ -1, -2 }));
                ModelIterator iterator = new ModelIterator(solver);
                while (iterator.isSatisfiable()) {
                    iterator.model();
                } 
                iterator.numberOfModelsFoundSoFar();
                org.junit.Assert.fail("checkModelIterationWithUnitlitNum3575litNum3754 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("checkModelIterationWithUnitlitNum3575litNum3754_failAssert399_add3959 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithUnitlitNum3575litNum3765_failAssert405_add4049_failAssert527() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                ISolver solver = SolverFactory.newDefault();
                solver.newVar(3);
                solver.newVar(3);
                solver.setExpectedNumberOfClauses(3);
                solver.addClause(new VecInt(new int[]{ 1 }));
                solver.addClause(new VecInt(new int[]{ 1, 2 }));
                solver.addClause(new VecInt(new int[]{ -(Integer.MAX_VALUE), -2 }));
                ModelIterator iterator = new ModelIterator(solver);
                while (iterator.isSatisfiable()) {
                    iterator.model();
                } 
                iterator.numberOfModelsFoundSoFar();
                org.junit.Assert.fail("checkModelIterationWithUnitlitNum3575litNum3765 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("checkModelIterationWithUnitlitNum3575litNum3765_failAssert405_add4049 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithUnitlitNum3575litNum3772_failAssert410_add3970_failAssert536() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                ISolver solver = SolverFactory.newDefault();
                solver.newVar(3);
                solver.newVar(3);
                solver.setExpectedNumberOfClauses(3);
                solver.addClause(new VecInt(new int[]{ 1 }));
                solver.addClause(new VecInt(new int[]{ 1, 2 }));
                solver.addClause(new VecInt(new int[]{ -1, -0 }));
                ModelIterator iterator = new ModelIterator(solver);
                while (iterator.isSatisfiable()) {
                    iterator.model();
                } 
                iterator.numberOfModelsFoundSoFar();
                org.junit.Assert.fail("checkModelIterationWithUnitlitNum3575litNum3772 should have thrown IllegalArgumentException");
            }
            org.junit.Assert.fail("checkModelIterationWithUnitlitNum3575litNum3772_failAssert410_add3970 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithUnitlitNum3575litNum3748_failAssert394_add4138_failAssert538() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                ISolver solver = SolverFactory.newDefault();
                solver.newVar(3);
                solver.newVar(3);
                solver.setExpectedNumberOfClauses(3);
                solver.addClause(new VecInt(new int[]{ 0 }));
                solver.addClause(new VecInt(new int[]{ 1, 2 }));
                solver.addClause(new VecInt(new int[]{ -1, -2 }));
                ModelIterator iterator = new ModelIterator(solver);
                while (iterator.isSatisfiable()) {
                    iterator.model();
                } 
                iterator.numberOfModelsFoundSoFar();
                org.junit.Assert.fail("checkModelIterationWithUnitlitNum3575litNum3748 should have thrown IllegalArgumentException");
            }
            org.junit.Assert.fail("checkModelIterationWithUnitlitNum3575litNum3748_failAssert394_add4138 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithUnitlitNum3575litNum3753_failAssert398_add3886_failAssert540() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                ISolver solver = SolverFactory.newDefault();
                solver.newVar(3);
                solver.newVar(3);
                solver.setExpectedNumberOfClauses(3);
                solver.addClause(new VecInt(new int[]{ 1 }));
                solver.addClause(new VecInt(new int[]{ 0, 2 }));
                solver.addClause(new VecInt(new int[]{ -1, -2 }));
                ModelIterator iterator = new ModelIterator(solver);
                while (iterator.isSatisfiable()) {
                    iterator.model();
                } 
                iterator.numberOfModelsFoundSoFar();
                org.junit.Assert.fail("checkModelIterationWithUnitlitNum3575litNum3753 should have thrown IllegalArgumentException");
            }
            org.junit.Assert.fail("checkModelIterationWithUnitlitNum3575litNum3753_failAssert398_add3886 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithUnitlitNum3575litNum3750_failAssert396_add4063_failAssert584() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                ISolver solver = SolverFactory.newDefault();
                solver.newVar(3);
                solver.newVar(3);
                solver.setExpectedNumberOfClauses(3);
                solver.addClause(new VecInt(new int[]{ Integer.MIN_VALUE }));
                solver.addClause(new VecInt(new int[]{ 1, 2 }));
                solver.addClause(new VecInt(new int[]{ -1, -2 }));
                ModelIterator iterator = new ModelIterator(solver);
                while (iterator.isSatisfiable()) {
                    iterator.model();
                } 
                iterator.numberOfModelsFoundSoFar();
                org.junit.Assert.fail("checkModelIterationWithUnitlitNum3575litNum3750 should have thrown ArrayIndexOutOfBoundsException");
            }
            org.junit.Assert.fail("checkModelIterationWithUnitlitNum3575litNum3750_failAssert396_add4063 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-2147483648", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithUnitAndSatisfiableTruelitNum5497_failAssert588() throws Exception, ContradictionException, TimeoutException {
        try {
            ISolver solver = SolverFactory.newDefault();
            solver.newVar(Integer.MAX_VALUE);
            solver.setExpectedNumberOfClauses(3);
            solver.addClause(new VecInt(new int[]{ 1 }));
            solver.addClause(new VecInt(new int[]{ 1, 2 }));
            solver.addClause(new VecInt(new int[]{ -1, -2 }));
            ModelIterator iterator = new ModelIterator(solver);
            while (iterator.isSatisfiable(true)) {
                iterator.model();
            } 
            iterator.numberOfModelsFoundSoFar();
            org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5497 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithUnitAndSatisfiableTruelitNum5498_failAssert589() throws Exception, ContradictionException, TimeoutException {
        try {
            ISolver solver = SolverFactory.newDefault();
            solver.newVar(Integer.MIN_VALUE);
            solver.setExpectedNumberOfClauses(3);
            solver.addClause(new VecInt(new int[]{ 1 }));
            solver.addClause(new VecInt(new int[]{ 1, 2 }));
            solver.addClause(new VecInt(new int[]{ -1, -2 }));
            ModelIterator iterator = new ModelIterator(solver);
            while (iterator.isSatisfiable(true)) {
                iterator.model();
            } 
            iterator.numberOfModelsFoundSoFar();
            org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5498 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithUnitAndSatisfiableTruelitNum5500_failAssert590() throws Exception, ContradictionException, TimeoutException {
        try {
            ISolver solver = SolverFactory.newDefault();
            solver.newVar(-890174617);
            solver.setExpectedNumberOfClauses(3);
            solver.addClause(new VecInt(new int[]{ 1 }));
            solver.addClause(new VecInt(new int[]{ 1, 2 }));
            solver.addClause(new VecInt(new int[]{ -1, -2 }));
            ModelIterator iterator = new ModelIterator(solver);
            while (iterator.isSatisfiable(true)) {
                iterator.model();
            } 
            iterator.numberOfModelsFoundSoFar();
            org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5500 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithUnitAndSatisfiableTruelitNum5508_failAssert591() throws Exception, ContradictionException, TimeoutException {
        try {
            ISolver solver = SolverFactory.newDefault();
            solver.newVar(2);
            solver.setExpectedNumberOfClauses(3);
            solver.addClause(new VecInt(new int[]{ 0 }));
            solver.addClause(new VecInt(new int[]{ 1, 2 }));
            solver.addClause(new VecInt(new int[]{ -1, -2 }));
            ModelIterator iterator = new ModelIterator(solver);
            while (iterator.isSatisfiable(true)) {
                iterator.model();
            } 
            iterator.numberOfModelsFoundSoFar();
            org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5508 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithUnitAndSatisfiableTruelitNum5509_failAssert592() throws Exception, ContradictionException, TimeoutException {
        try {
            ISolver solver = SolverFactory.newDefault();
            solver.newVar(2);
            solver.setExpectedNumberOfClauses(3);
            solver.addClause(new VecInt(new int[]{ Integer.MAX_VALUE }));
            solver.addClause(new VecInt(new int[]{ 1, 2 }));
            solver.addClause(new VecInt(new int[]{ -1, -2 }));
            ModelIterator iterator = new ModelIterator(solver);
            while (iterator.isSatisfiable(true)) {
                iterator.model();
            } 
            iterator.numberOfModelsFoundSoFar();
            org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5509 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithUnitAndSatisfiableTruelitNum5510_failAssert593() throws Exception, ContradictionException, TimeoutException {
        try {
            ISolver solver = SolverFactory.newDefault();
            solver.newVar(2);
            solver.setExpectedNumberOfClauses(3);
            solver.addClause(new VecInt(new int[]{ Integer.MIN_VALUE }));
            solver.addClause(new VecInt(new int[]{ 1, 2 }));
            solver.addClause(new VecInt(new int[]{ -1, -2 }));
            ModelIterator iterator = new ModelIterator(solver);
            while (iterator.isSatisfiable(true)) {
                iterator.model();
            } 
            iterator.numberOfModelsFoundSoFar();
            org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5510 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-2147483648", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithUnitAndSatisfiableTruelitNum5512_failAssert594() throws Exception, ContradictionException, TimeoutException {
        try {
            ISolver solver = SolverFactory.newDefault();
            solver.newVar(2);
            solver.setExpectedNumberOfClauses(3);
            solver.addClause(new VecInt(new int[]{ 1 }));
            solver.addClause(new VecInt(new int[]{ 2, 2 }));
            solver.addClause(new VecInt(new int[]{ -1, -2 }));
            ModelIterator iterator = new ModelIterator(solver);
            while (iterator.isSatisfiable(true)) {
                iterator.model();
            } 
            iterator.numberOfModelsFoundSoFar();
            org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5512 should have thrown ContradictionException");
        } catch (ContradictionException expected) {
            Assert.assertEquals("Creating Empty clause ?", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithUnitAndSatisfiableTruelitNum5513_failAssert595() throws Exception, ContradictionException, TimeoutException {
        try {
            ISolver solver = SolverFactory.newDefault();
            solver.newVar(2);
            solver.setExpectedNumberOfClauses(3);
            solver.addClause(new VecInt(new int[]{ 1 }));
            solver.addClause(new VecInt(new int[]{ 0, 2 }));
            solver.addClause(new VecInt(new int[]{ -1, -2 }));
            ModelIterator iterator = new ModelIterator(solver);
            while (iterator.isSatisfiable(true)) {
                iterator.model();
            } 
            iterator.numberOfModelsFoundSoFar();
            org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5513 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithUnitAndSatisfiableTruelitNum5514_failAssert596() throws Exception, ContradictionException, TimeoutException {
        try {
            ISolver solver = SolverFactory.newDefault();
            solver.newVar(2);
            solver.setExpectedNumberOfClauses(3);
            solver.addClause(new VecInt(new int[]{ 1 }));
            solver.addClause(new VecInt(new int[]{ Integer.MAX_VALUE, 2 }));
            solver.addClause(new VecInt(new int[]{ -1, -2 }));
            ModelIterator iterator = new ModelIterator(solver);
            while (iterator.isSatisfiable(true)) {
                iterator.model();
            } 
            iterator.numberOfModelsFoundSoFar();
            org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5514 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithUnitAndSatisfiableTruelitNum5520_failAssert599() throws Exception, ContradictionException, TimeoutException {
        try {
            ISolver solver = SolverFactory.newDefault();
            solver.newVar(2);
            solver.setExpectedNumberOfClauses(3);
            solver.addClause(new VecInt(new int[]{ 1 }));
            solver.addClause(new VecInt(new int[]{ 1, Integer.MIN_VALUE }));
            solver.addClause(new VecInt(new int[]{ -1, -2 }));
            ModelIterator iterator = new ModelIterator(solver);
            while (iterator.isSatisfiable(true)) {
                iterator.model();
            } 
            iterator.numberOfModelsFoundSoFar();
            org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5520 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-2147483648", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithUnitAndSatisfiableTruelitNum5524_failAssert601() throws Exception, ContradictionException, TimeoutException {
        try {
            ISolver solver = SolverFactory.newDefault();
            solver.newVar(2);
            solver.setExpectedNumberOfClauses(3);
            solver.addClause(new VecInt(new int[]{ 1 }));
            solver.addClause(new VecInt(new int[]{ 1, 2 }));
            solver.addClause(new VecInt(new int[]{ -0, -2 }));
            ModelIterator iterator = new ModelIterator(solver);
            while (iterator.isSatisfiable(true)) {
                iterator.model();
            } 
            iterator.numberOfModelsFoundSoFar();
            org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5524 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithUnitAndSatisfiableTruelitNum5525_failAssert602() throws Exception, ContradictionException, TimeoutException {
        try {
            ISolver solver = SolverFactory.newDefault();
            solver.newVar(2);
            solver.setExpectedNumberOfClauses(3);
            solver.addClause(new VecInt(new int[]{ 1 }));
            solver.addClause(new VecInt(new int[]{ 1, 2 }));
            solver.addClause(new VecInt(new int[]{ -(Integer.MAX_VALUE), -2 }));
            ModelIterator iterator = new ModelIterator(solver);
            while (iterator.isSatisfiable(true)) {
                iterator.model();
            } 
            iterator.numberOfModelsFoundSoFar();
            org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5525 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithUnitAndSatisfiableTruelitNum5529_failAssert604() throws Exception, ContradictionException, TimeoutException {
        try {
            ISolver solver = SolverFactory.newDefault();
            solver.newVar(2);
            solver.setExpectedNumberOfClauses(3);
            solver.addClause(new VecInt(new int[]{ 1 }));
            solver.addClause(new VecInt(new int[]{ 1, 2 }));
            solver.addClause(new VecInt(new int[]{ -1, -1 }));
            ModelIterator iterator = new ModelIterator(solver);
            while (iterator.isSatisfiable(true)) {
                iterator.model();
            } 
            iterator.numberOfModelsFoundSoFar();
            org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5529 should have thrown ContradictionException");
        } catch (ContradictionException expected) {
            Assert.assertEquals("Creating Empty clause ?", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithUnitAndSatisfiableTruelitNum5520_failAssert599_add6137_failAssert608() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                ISolver solver = SolverFactory.newDefault();
                solver.newVar(2);
                solver.setExpectedNumberOfClauses(3);
                solver.addClause(new VecInt(new int[]{ 1 }));
                solver.addClause(new VecInt(new int[]{ 1, Integer.MIN_VALUE }));
                solver.addClause(new VecInt(new int[]{ 1, Integer.MIN_VALUE }));
                solver.addClause(new VecInt(new int[]{ -1, -2 }));
                ModelIterator iterator = new ModelIterator(solver);
                while (iterator.isSatisfiable(true)) {
                    iterator.model();
                } 
                iterator.numberOfModelsFoundSoFar();
                org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5520 should have thrown ArrayIndexOutOfBoundsException");
            }
            org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5520_failAssert599_add6137 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-2147483648", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithUnitAndSatisfiableTruelitNum5510_failAssert593_add5974_failAssert609() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                ISolver solver = SolverFactory.newDefault();
                solver.newVar(2);
                solver.setExpectedNumberOfClauses(3);
                solver.addClause(new VecInt(new int[]{ Integer.MIN_VALUE }));
                solver.addClause(new VecInt(new int[]{ Integer.MIN_VALUE }));
                solver.addClause(new VecInt(new int[]{ 1, 2 }));
                solver.addClause(new VecInt(new int[]{ -1, -2 }));
                ModelIterator iterator = new ModelIterator(solver);
                while (iterator.isSatisfiable(true)) {
                    iterator.model();
                } 
                iterator.numberOfModelsFoundSoFar();
                org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5510 should have thrown ArrayIndexOutOfBoundsException");
            }
            org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5510_failAssert593_add5974 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-2147483648", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithUnitAndSatisfiableTruelitNum5525_failAssert602_add6020_failAssert610() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                ISolver solver = SolverFactory.newDefault();
                solver.newVar(2);
                solver.setExpectedNumberOfClauses(3);
                solver.addClause(new VecInt(new int[]{ 1 }));
                solver.addClause(new VecInt(new int[]{ 1, 2 }));
                solver.addClause(new VecInt(new int[]{ -(Integer.MAX_VALUE), -2 }));
                solver.addClause(new VecInt(new int[]{ -(Integer.MAX_VALUE), -2 }));
                ModelIterator iterator = new ModelIterator(solver);
                while (iterator.isSatisfiable(true)) {
                    iterator.model();
                } 
                iterator.numberOfModelsFoundSoFar();
                org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5525 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5525_failAssert602_add6020 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithUnitAndSatisfiableTruelitNum5509_failAssert592_add6132_failAssert612() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                ISolver solver = SolverFactory.newDefault();
                solver.newVar(2);
                solver.setExpectedNumberOfClauses(3);
                solver.addClause(new VecInt(new int[]{ Integer.MAX_VALUE }));
                solver.addClause(new VecInt(new int[]{ Integer.MAX_VALUE }));
                solver.addClause(new VecInt(new int[]{ 1, 2 }));
                solver.addClause(new VecInt(new int[]{ -1, -2 }));
                ModelIterator iterator = new ModelIterator(solver);
                while (iterator.isSatisfiable(true)) {
                    iterator.model();
                } 
                iterator.numberOfModelsFoundSoFar();
                org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5509 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5509_failAssert592_add6132 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithUnitAndSatisfiableTruelitNum5513_failAssert595_add5778_failAssert617() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                ISolver solver = SolverFactory.newDefault();
                solver.newVar(2);
                solver.setExpectedNumberOfClauses(3);
                solver.addClause(new VecInt(new int[]{ 1 }));
                solver.addClause(new VecInt(new int[]{ 0, 2 }));
                solver.addClause(new VecInt(new int[]{ -1, -2 }));
                solver.addClause(new VecInt(new int[]{ -1, -2 }));
                ModelIterator iterator = new ModelIterator(solver);
                while (iterator.isSatisfiable(true)) {
                    iterator.model();
                } 
                iterator.numberOfModelsFoundSoFar();
                org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5513 should have thrown IllegalArgumentException");
            }
            org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5513_failAssert595_add5778 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithUnitAndSatisfiableTruelitNum5508_failAssert591_add5782_failAssert618() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                ISolver solver = SolverFactory.newDefault();
                solver.newVar(2);
                solver.setExpectedNumberOfClauses(3);
                solver.addClause(new VecInt(new int[]{ 0 }));
                solver.addClause(new VecInt(new int[]{ 1, 2 }));
                solver.addClause(new VecInt(new int[]{ -1, -2 }));
                solver.addClause(new VecInt(new int[]{ -1, -2 }));
                ModelIterator iterator = new ModelIterator(solver);
                while (iterator.isSatisfiable(true)) {
                    iterator.model();
                } 
                iterator.numberOfModelsFoundSoFar();
                org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5508 should have thrown IllegalArgumentException");
            }
            org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5508_failAssert591_add5782 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithUnitAndSatisfiableTruelitNum5524_failAssert601_add6028_failAssert619() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                ISolver solver = SolverFactory.newDefault();
                solver.newVar(2);
                solver.setExpectedNumberOfClauses(3);
                solver.addClause(new VecInt(new int[]{ 1 }));
                solver.addClause(new VecInt(new int[]{ 1, 2 }));
                solver.addClause(new VecInt(new int[]{ -0, -2 }));
                solver.addClause(new VecInt(new int[]{ -0, -2 }));
                ModelIterator iterator = new ModelIterator(solver);
                while (iterator.isSatisfiable(true)) {
                    iterator.model();
                } 
                iterator.numberOfModelsFoundSoFar();
                org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5524 should have thrown IllegalArgumentException");
            }
            org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5524_failAssert601_add6028 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithUnitAndSatisfiableTruelitNum5500_failAssert590litNum5800_failAssert620() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                ISolver solver = SolverFactory.newDefault();
                solver.newVar(-890174617);
                solver.setExpectedNumberOfClauses(3);
                solver.addClause(new VecInt(new int[]{ 2 }));
                solver.addClause(new VecInt(new int[]{ 1, 2 }));
                solver.addClause(new VecInt(new int[]{ -1, -2 }));
                ModelIterator iterator = new ModelIterator(solver);
                while (iterator.isSatisfiable(true)) {
                    iterator.model();
                } 
                iterator.numberOfModelsFoundSoFar();
                org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5500 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5500_failAssert590litNum5800 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithUnitAndSatisfiableTruelitNum5500_failAssert590litNum5802_failAssert621() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                ISolver solver = SolverFactory.newDefault();
                solver.newVar(-890174617);
                solver.setExpectedNumberOfClauses(3);
                solver.addClause(new VecInt(new int[]{ 0 }));
                solver.addClause(new VecInt(new int[]{ 1, 2 }));
                solver.addClause(new VecInt(new int[]{ -1, -2 }));
                ModelIterator iterator = new ModelIterator(solver);
                while (iterator.isSatisfiable(true)) {
                    iterator.model();
                } 
                iterator.numberOfModelsFoundSoFar();
                org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5500 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5500_failAssert590litNum5802 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithUnitAndSatisfiableTruelitNum5500_failAssert590litNum5824_failAssert622() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                ISolver solver = SolverFactory.newDefault();
                solver.newVar(-890174617);
                solver.setExpectedNumberOfClauses(3);
                solver.addClause(new VecInt(new int[]{ 1 }));
                solver.addClause(new VecInt(new int[]{ 1, 0 }));
                solver.addClause(new VecInt(new int[]{ -1, -2 }));
                ModelIterator iterator = new ModelIterator(solver);
                while (iterator.isSatisfiable(true)) {
                    iterator.model();
                } 
                iterator.numberOfModelsFoundSoFar();
                org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5500 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5500_failAssert590litNum5824 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithUnitAndSatisfiableTruelitNum5500_failAssert590litNum5841_failAssert623() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                ISolver solver = SolverFactory.newDefault();
                solver.newVar(-890174617);
                solver.setExpectedNumberOfClauses(3);
                solver.addClause(new VecInt(new int[]{ 1 }));
                solver.addClause(new VecInt(new int[]{ 1, 2 }));
                solver.addClause(new VecInt(new int[]{ -1, -1 }));
                ModelIterator iterator = new ModelIterator(solver);
                while (iterator.isSatisfiable(true)) {
                    iterator.model();
                } 
                iterator.numberOfModelsFoundSoFar();
                org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5500 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5500_failAssert590litNum5841 should have thrown ContradictionException");
        } catch (ContradictionException expected) {
            Assert.assertEquals("Creating Empty clause ?", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithUnitAndSatisfiableTruelitNum5500_failAssert590litNum5816_failAssert627() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                ISolver solver = SolverFactory.newDefault();
                solver.newVar(-890174617);
                solver.setExpectedNumberOfClauses(3);
                solver.addClause(new VecInt(new int[]{ 1 }));
                solver.addClause(new VecInt(new int[]{ 1, 3 }));
                solver.addClause(new VecInt(new int[]{ -1, -2 }));
                ModelIterator iterator = new ModelIterator(solver);
                while (iterator.isSatisfiable(true)) {
                    iterator.model();
                } 
                iterator.numberOfModelsFoundSoFar();
                org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5500 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5500_failAssert590litNum5816 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithUnitAndSatisfiableTruelitNum5500_failAssert590litNum5808_failAssert628() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                ISolver solver = SolverFactory.newDefault();
                solver.newVar(-890174617);
                solver.setExpectedNumberOfClauses(3);
                solver.addClause(new VecInt(new int[]{ 1 }));
                solver.addClause(new VecInt(new int[]{ 2, 2 }));
                solver.addClause(new VecInt(new int[]{ -1, -2 }));
                ModelIterator iterator = new ModelIterator(solver);
                while (iterator.isSatisfiable(true)) {
                    iterator.model();
                } 
                iterator.numberOfModelsFoundSoFar();
                org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5500 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5500_failAssert590litNum5808 should have thrown ContradictionException");
        } catch (ContradictionException expected) {
            Assert.assertEquals("Creating Empty clause ?", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithUnitAndSatisfiableTruelitNum5500_failAssert590litNum5827_failAssert629() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                ISolver solver = SolverFactory.newDefault();
                solver.newVar(-890174617);
                solver.setExpectedNumberOfClauses(3);
                solver.addClause(new VecInt(new int[]{ 1 }));
                solver.addClause(new VecInt(new int[]{ 1, 2 }));
                solver.addClause(new VecInt(new int[]{ -2, -2 }));
                ModelIterator iterator = new ModelIterator(solver);
                while (iterator.isSatisfiable(true)) {
                    iterator.model();
                } 
                iterator.numberOfModelsFoundSoFar();
                org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5500 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5500_failAssert590litNum5827 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithUnitAndSatisfiableTruelitNum5500_failAssert590litNum5829_failAssert630() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                ISolver solver = SolverFactory.newDefault();
                solver.newVar(-890174617);
                solver.setExpectedNumberOfClauses(3);
                solver.addClause(new VecInt(new int[]{ 1 }));
                solver.addClause(new VecInt(new int[]{ 1, 2 }));
                solver.addClause(new VecInt(new int[]{ -0, -2 }));
                ModelIterator iterator = new ModelIterator(solver);
                while (iterator.isSatisfiable(true)) {
                    iterator.model();
                } 
                iterator.numberOfModelsFoundSoFar();
                org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5500 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5500_failAssert590litNum5829 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithUnitAndSatisfiableTruelitNum5524_failAssert601_add6026_failAssert637() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                ISolver solver = SolverFactory.newDefault();
                solver.newVar(2);
                solver.setExpectedNumberOfClauses(3);
                solver.addClause(new VecInt(new int[]{ 1 }));
                solver.addClause(new VecInt(new int[]{ 1, 2 }));
                solver.addClause(new VecInt(new int[]{ 1, 2 }));
                solver.addClause(new VecInt(new int[]{ -0, -2 }));
                ModelIterator iterator = new ModelIterator(solver);
                while (iterator.isSatisfiable(true)) {
                    iterator.model();
                } 
                iterator.numberOfModelsFoundSoFar();
                org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5524 should have thrown IllegalArgumentException");
            }
            org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5524_failAssert601_add6026 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithUnitAndSatisfiableTruelitNum5497_failAssert588_add5767_failAssert638() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                ISolver solver = SolverFactory.newDefault();
                solver.newVar(Integer.MAX_VALUE);
                solver.setExpectedNumberOfClauses(3);
                solver.addClause(new VecInt(new int[]{ 1 }));
                solver.addClause(new VecInt(new int[]{ 1, 2 }));
                solver.addClause(new VecInt(new int[]{ -1, -2 }));
                solver.addClause(new VecInt(new int[]{ -1, -2 }));
                ModelIterator iterator = new ModelIterator(solver);
                while (iterator.isSatisfiable(true)) {
                    iterator.model();
                } 
                iterator.numberOfModelsFoundSoFar();
                org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5497 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5497_failAssert588_add5767 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithUnitAndSatisfiableTruelitNum5498_failAssert589_add5837_failAssert639() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                ISolver solver = SolverFactory.newDefault();
                solver.newVar(Integer.MIN_VALUE);
                solver.setExpectedNumberOfClauses(3);
                solver.addClause(new VecInt(new int[]{ 1 }));
                solver.addClause(new VecInt(new int[]{ 1, 2 }));
                solver.addClause(new VecInt(new int[]{ -1, -2 }));
                solver.addClause(new VecInt(new int[]{ -1, -2 }));
                ModelIterator iterator = new ModelIterator(solver);
                while (iterator.isSatisfiable(true)) {
                    iterator.model();
                } 
                iterator.numberOfModelsFoundSoFar();
                org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5498 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5498_failAssert589_add5837 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithUnitAndSatisfiableTruelitNum5525_failAssert602_add6016_failAssert642() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                ISolver solver = SolverFactory.newDefault();
                solver.newVar(2);
                solver.setExpectedNumberOfClauses(3);
                solver.addClause(new VecInt(new int[]{ 1 }));
                solver.addClause(new VecInt(new int[]{ 1, 2 }));
                solver.addClause(new VecInt(new int[]{ 1, 2 }));
                solver.addClause(new VecInt(new int[]{ -(Integer.MAX_VALUE), -2 }));
                ModelIterator iterator = new ModelIterator(solver);
                while (iterator.isSatisfiable(true)) {
                    iterator.model();
                } 
                iterator.numberOfModelsFoundSoFar();
                org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5525 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5525_failAssert602_add6016 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithUnitAndSatisfiableTruelitNum5498_failAssert589_add5830_failAssert651() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                ISolver solver = SolverFactory.newDefault();
                solver.newVar(Integer.MIN_VALUE);
                solver.setExpectedNumberOfClauses(3);
                solver.addClause(new VecInt(new int[]{ 1 }));
                solver.addClause(new VecInt(new int[]{ 1 }));
                solver.addClause(new VecInt(new int[]{ 1, 2 }));
                solver.addClause(new VecInt(new int[]{ -1, -2 }));
                ModelIterator iterator = new ModelIterator(solver);
                while (iterator.isSatisfiable(true)) {
                    iterator.model();
                } 
                iterator.numberOfModelsFoundSoFar();
                org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5498 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5498_failAssert589_add5830 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithUnitAndSatisfiableTruelitNum5500_failAssert590litNum5799_failAssert653() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                ISolver solver = SolverFactory.newDefault();
                solver.newVar(-890174617);
                solver.setExpectedNumberOfClauses(437485623);
                solver.addClause(new VecInt(new int[]{ 1 }));
                solver.addClause(new VecInt(new int[]{ 1, 2 }));
                solver.addClause(new VecInt(new int[]{ -1, -2 }));
                ModelIterator iterator = new ModelIterator(solver);
                while (iterator.isSatisfiable(true)) {
                    iterator.model();
                } 
                iterator.numberOfModelsFoundSoFar();
                org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5500 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5500_failAssert590litNum5799 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithUnitAndSatisfiableTruelitNum5512_failAssert594_add5990_failAssert656() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                ISolver solver = SolverFactory.newDefault();
                solver.newVar(2);
                solver.setExpectedNumberOfClauses(3);
                solver.addClause(new VecInt(new int[]{ 1 }));
                solver.addClause(new VecInt(new int[]{ 2, 2 }));
                solver.addClause(new VecInt(new int[]{ -1, -2 }));
                solver.addClause(new VecInt(new int[]{ -1, -2 }));
                ModelIterator iterator = new ModelIterator(solver);
                while (iterator.isSatisfiable(true)) {
                    iterator.model();
                } 
                iterator.numberOfModelsFoundSoFar();
                org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5512 should have thrown ContradictionException");
            }
            org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5512_failAssert594_add5990 should have thrown ContradictionException");
        } catch (ContradictionException expected) {
            Assert.assertEquals("Creating Empty clause ?", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithUnitAndSatisfiableTruelitNum5529_failAssert604_add6123_failAssert657() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                ISolver solver = SolverFactory.newDefault();
                solver.newVar(2);
                solver.setExpectedNumberOfClauses(3);
                solver.addClause(new VecInt(new int[]{ 1 }));
                solver.addClause(new VecInt(new int[]{ 1, 2 }));
                solver.addClause(new VecInt(new int[]{ -1, -1 }));
                solver.addClause(new VecInt(new int[]{ -1, -1 }));
                ModelIterator iterator = new ModelIterator(solver);
                while (iterator.isSatisfiable(true)) {
                    iterator.model();
                } 
                iterator.numberOfModelsFoundSoFar();
                org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5529 should have thrown ContradictionException");
            }
            org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5529_failAssert604_add6123 should have thrown ContradictionException");
        } catch (ContradictionException expected) {
            Assert.assertEquals("Creating Empty clause ?", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithUnitAndSatisfiableTruelitNum5512_failAssert594_add5987_failAssert658() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                ISolver solver = SolverFactory.newDefault();
                solver.newVar(2);
                solver.setExpectedNumberOfClauses(3);
                solver.addClause(new VecInt(new int[]{ 1 }));
                solver.addClause(new VecInt(new int[]{ 2, 2 }));
                solver.addClause(new VecInt(new int[]{ 2, 2 }));
                solver.addClause(new VecInt(new int[]{ -1, -2 }));
                ModelIterator iterator = new ModelIterator(solver);
                while (iterator.isSatisfiable(true)) {
                    iterator.model();
                } 
                iterator.numberOfModelsFoundSoFar();
                org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5512 should have thrown ContradictionException");
            }
            org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5512_failAssert594_add5987 should have thrown ContradictionException");
        } catch (ContradictionException expected) {
            Assert.assertEquals("Creating Empty clause ?", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithUnitAndSatisfiableTruelitNum5529_failAssert604_add6121_failAssert659() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                ISolver solver = SolverFactory.newDefault();
                solver.newVar(2);
                solver.setExpectedNumberOfClauses(3);
                solver.addClause(new VecInt(new int[]{ 1 }));
                solver.addClause(new VecInt(new int[]{ 1, 2 }));
                solver.addClause(new VecInt(new int[]{ 1, 2 }));
                solver.addClause(new VecInt(new int[]{ -1, -1 }));
                ModelIterator iterator = new ModelIterator(solver);
                while (iterator.isSatisfiable(true)) {
                    iterator.model();
                } 
                iterator.numberOfModelsFoundSoFar();
                org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5529 should have thrown ContradictionException");
            }
            org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5529_failAssert604_add6121 should have thrown ContradictionException");
        } catch (ContradictionException expected) {
            Assert.assertEquals("Creating Empty clause ?", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithUnitAndSatisfiableTruelitNum5529_failAssert604litNum6055_failAssert668() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                ISolver solver = SolverFactory.newDefault();
                solver.newVar(2);
                solver.setExpectedNumberOfClauses(3);
                solver.addClause(new VecInt(new int[]{ 1 }));
                solver.addClause(new VecInt(new int[]{ 1, 3 }));
                solver.addClause(new VecInt(new int[]{ -1, -1 }));
                ModelIterator iterator = new ModelIterator(solver);
                while (iterator.isSatisfiable(true)) {
                    iterator.model();
                } 
                iterator.numberOfModelsFoundSoFar();
                org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5529 should have thrown ContradictionException");
            }
            org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5529_failAssert604litNum6055 should have thrown ContradictionException");
        } catch (ContradictionException expected) {
            Assert.assertEquals("Creating Empty clause ?", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithUnitAndSatisfiableTruelitNum5512_failAssert594litNum5948_failAssert671() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                ISolver solver = SolverFactory.newDefault();
                solver.newVar(2);
                solver.setExpectedNumberOfClauses(3);
                solver.addClause(new VecInt(new int[]{ 1 }));
                solver.addClause(new VecInt(new int[]{ 2, 2 }));
                solver.addClause(new VecInt(new int[]{ -0, -2 }));
                ModelIterator iterator = new ModelIterator(solver);
                while (iterator.isSatisfiable(true)) {
                    iterator.model();
                } 
                iterator.numberOfModelsFoundSoFar();
                org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5512 should have thrown ContradictionException");
            }
            org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5512_failAssert594litNum5948 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithUnitAndSatisfiableTruelitNum5512_failAssert594litNum5910_failAssert689() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                ISolver solver = SolverFactory.newDefault();
                solver.newVar(2);
                solver.setExpectedNumberOfClauses(186148185);
                solver.addClause(new VecInt(new int[]{ 1 }));
                solver.addClause(new VecInt(new int[]{ 2, 2 }));
                solver.addClause(new VecInt(new int[]{ -1, -2 }));
                ModelIterator iterator = new ModelIterator(solver);
                while (iterator.isSatisfiable(true)) {
                    iterator.model();
                } 
                iterator.numberOfModelsFoundSoFar();
                org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5512 should have thrown ContradictionException");
            }
            org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5512_failAssert594litNum5910 should have thrown ContradictionException");
        } catch (ContradictionException expected) {
            Assert.assertEquals("Creating Empty clause ?", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithUnitAndSatisfiableTruelitNum5509_failAssert592litNum6011_failAssert694() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                ISolver solver = SolverFactory.newDefault();
                solver.newVar(0);
                solver.setExpectedNumberOfClauses(3);
                solver.addClause(new VecInt(new int[]{ Integer.MAX_VALUE }));
                solver.addClause(new VecInt(new int[]{ 1, 2 }));
                solver.addClause(new VecInt(new int[]{ -1, -2 }));
                ModelIterator iterator = new ModelIterator(solver);
                while (iterator.isSatisfiable(true)) {
                    iterator.model();
                } 
                iterator.numberOfModelsFoundSoFar();
                org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5509 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5509_failAssert592litNum6011 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithUnitAndSatisfiableTruelitNum5514_failAssert596litNum5859_failAssert719() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                ISolver solver = SolverFactory.newDefault();
                solver.newVar(0);
                solver.setExpectedNumberOfClauses(3);
                solver.addClause(new VecInt(new int[]{ 1 }));
                solver.addClause(new VecInt(new int[]{ Integer.MAX_VALUE, 2 }));
                solver.addClause(new VecInt(new int[]{ -1, -2 }));
                ModelIterator iterator = new ModelIterator(solver);
                while (iterator.isSatisfiable(true)) {
                    iterator.model();
                } 
                iterator.numberOfModelsFoundSoFar();
                org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5514 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5514_failAssert596litNum5859 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithUnitAndSatisfiableTruelitNum5525_failAssert602litNum5880_failAssert761() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                ISolver solver = SolverFactory.newDefault();
                solver.newVar(0);
                solver.setExpectedNumberOfClauses(3);
                solver.addClause(new VecInt(new int[]{ 1 }));
                solver.addClause(new VecInt(new int[]{ 1, 2 }));
                solver.addClause(new VecInt(new int[]{ -(Integer.MAX_VALUE), -2 }));
                ModelIterator iterator = new ModelIterator(solver);
                while (iterator.isSatisfiable(true)) {
                    iterator.model();
                } 
                iterator.numberOfModelsFoundSoFar();
                org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5525 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5525_failAssert602litNum5880 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithUnitAndSatisfiableTruelitNum5525_failAssert602litNum5940_failAssert762() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                ISolver solver = SolverFactory.newDefault();
                solver.newVar(2);
                solver.setExpectedNumberOfClauses(3);
                solver.addClause(new VecInt(new int[]{ 1 }));
                solver.addClause(new VecInt(new int[]{ 2, 2 }));
                solver.addClause(new VecInt(new int[]{ -(Integer.MAX_VALUE), -2 }));
                ModelIterator iterator = new ModelIterator(solver);
                while (iterator.isSatisfiable(true)) {
                    iterator.model();
                } 
                iterator.numberOfModelsFoundSoFar();
                org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5525 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5525_failAssert602litNum5940 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithUnitAndSatisfiableTruelitNum5525_failAssert602litNum5865_failAssert765() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                ISolver solver = SolverFactory.newDefault();
                solver.newVar(1);
                solver.setExpectedNumberOfClauses(3);
                solver.addClause(new VecInt(new int[]{ 1 }));
                solver.addClause(new VecInt(new int[]{ 1, 2 }));
                solver.addClause(new VecInt(new int[]{ -(Integer.MAX_VALUE), -2 }));
                ModelIterator iterator = new ModelIterator(solver);
                while (iterator.isSatisfiable(true)) {
                    iterator.model();
                } 
                iterator.numberOfModelsFoundSoFar();
                org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5525 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5525_failAssert602litNum5865 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithUnitAndSatisfiableTruelitNum5525_failAssert602litNum5981_failAssert771() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                ISolver solver = SolverFactory.newDefault();
                solver.newVar(2);
                solver.setExpectedNumberOfClauses(3);
                solver.addClause(new VecInt(new int[]{ 1 }));
                solver.addClause(new VecInt(new int[]{ 1, 2 }));
                solver.addClause(new VecInt(new int[]{ -(Integer.MAX_VALUE), -3 }));
                ModelIterator iterator = new ModelIterator(solver);
                while (iterator.isSatisfiable(true)) {
                    iterator.model();
                } 
                iterator.numberOfModelsFoundSoFar();
                org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5525 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5525_failAssert602litNum5981 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithUnitAndSatisfiableTruelitNum5520_failAssert599_add6137_failAssert608_add7595_failAssert791() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    ISolver solver = SolverFactory.newDefault();
                    solver.newVar(2);
                    solver.setExpectedNumberOfClauses(3);
                    solver.addClause(new VecInt(new int[]{ 1 }));
                    solver.addClause(new VecInt(new int[]{ 1, Integer.MIN_VALUE }));
                    solver.addClause(new VecInt(new int[]{ 1, Integer.MIN_VALUE }));
                    solver.addClause(new VecInt(new int[]{ 1, Integer.MIN_VALUE }));
                    solver.addClause(new VecInt(new int[]{ -1, -2 }));
                    ModelIterator iterator = new ModelIterator(solver);
                    while (iterator.isSatisfiable(true)) {
                        iterator.model();
                    } 
                    iterator.numberOfModelsFoundSoFar();
                    org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5520 should have thrown ArrayIndexOutOfBoundsException");
                }
                org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5520_failAssert599_add6137 should have thrown ArrayIndexOutOfBoundsException");
            }
            org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5520_failAssert599_add6137_failAssert608_add7595 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-2147483648", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithUnitAndSatisfiableTruelitNum5510_failAssert593_add5974_failAssert609_add7748_failAssert793() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    ISolver solver = SolverFactory.newDefault();
                    solver.newVar(2);
                    solver.setExpectedNumberOfClauses(3);
                    solver.addClause(new VecInt(new int[]{ Integer.MIN_VALUE }));
                    solver.addClause(new VecInt(new int[]{ Integer.MIN_VALUE }));
                    solver.addClause(new VecInt(new int[]{ Integer.MIN_VALUE }));
                    solver.addClause(new VecInt(new int[]{ 1, 2 }));
                    solver.addClause(new VecInt(new int[]{ -1, -2 }));
                    ModelIterator iterator = new ModelIterator(solver);
                    while (iterator.isSatisfiable(true)) {
                        iterator.model();
                    } 
                    iterator.numberOfModelsFoundSoFar();
                    org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5510 should have thrown ArrayIndexOutOfBoundsException");
                }
                org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5510_failAssert593_add5974 should have thrown ArrayIndexOutOfBoundsException");
            }
            org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5510_failAssert593_add5974_failAssert609_add7748 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-2147483648", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithUnitAndSatisfiableTruelitNum5525_failAssert602_add6020_failAssert610_add7224_failAssert795() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    ISolver solver = SolverFactory.newDefault();
                    solver.newVar(2);
                    solver.setExpectedNumberOfClauses(3);
                    solver.addClause(new VecInt(new int[]{ 1 }));
                    solver.addClause(new VecInt(new int[]{ 1, 2 }));
                    solver.addClause(new VecInt(new int[]{ -(Integer.MAX_VALUE), -2 }));
                    solver.addClause(new VecInt(new int[]{ -(Integer.MAX_VALUE), -2 }));
                    solver.addClause(new VecInt(new int[]{ -(Integer.MAX_VALUE), -2 }));
                    ModelIterator iterator = new ModelIterator(solver);
                    while (iterator.isSatisfiable(true)) {
                        iterator.model();
                    } 
                    iterator.numberOfModelsFoundSoFar();
                    org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5525 should have thrown NegativeArraySizeException");
                }
                org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5525_failAssert602_add6020 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5525_failAssert602_add6020_failAssert610_add7224 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithUnitAndSatisfiableTruelitNum5509_failAssert592_add6132_failAssert612_add7396_failAssert797() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    ISolver solver = SolverFactory.newDefault();
                    solver.newVar(2);
                    solver.setExpectedNumberOfClauses(3);
                    solver.addClause(new VecInt(new int[]{ Integer.MAX_VALUE }));
                    solver.addClause(new VecInt(new int[]{ Integer.MAX_VALUE }));
                    solver.addClause(new VecInt(new int[]{ Integer.MAX_VALUE }));
                    solver.addClause(new VecInt(new int[]{ 1, 2 }));
                    solver.addClause(new VecInt(new int[]{ -1, -2 }));
                    ModelIterator iterator = new ModelIterator(solver);
                    while (iterator.isSatisfiable(true)) {
                        iterator.model();
                    } 
                    iterator.numberOfModelsFoundSoFar();
                    org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5509 should have thrown NegativeArraySizeException");
                }
                org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5509_failAssert592_add6132 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5509_failAssert592_add6132_failAssert612_add7396 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithUnitAndSatisfiableTruelitNum5525_failAssert602_add6016_failAssert642_add7739_failAssert803() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    ISolver solver = SolverFactory.newDefault();
                    solver.newVar(2);
                    solver.setExpectedNumberOfClauses(3);
                    solver.addClause(new VecInt(new int[]{ 1 }));
                    solver.addClause(new VecInt(new int[]{ 1, 2 }));
                    solver.addClause(new VecInt(new int[]{ 1, 2 }));
                    solver.addClause(new VecInt(new int[]{ -(Integer.MAX_VALUE), -2 }));
                    solver.addClause(new VecInt(new int[]{ -(Integer.MAX_VALUE), -2 }));
                    ModelIterator iterator = new ModelIterator(solver);
                    while (iterator.isSatisfiable(true)) {
                        iterator.model();
                    } 
                    iterator.numberOfModelsFoundSoFar();
                    org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5525 should have thrown NegativeArraySizeException");
                }
                org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5525_failAssert602_add6016 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5525_failAssert602_add6016_failAssert642_add7739 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithUnitAndSatisfiableTruelitNum5500_failAssert590litNum5800_failAssert620litNum7016_failAssert815() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    ISolver solver = SolverFactory.newDefault();
                    solver.newVar(-890174617);
                    solver.setExpectedNumberOfClauses(3);
                    solver.addClause(new VecInt(new int[]{ 2 }));
                    solver.addClause(new VecInt(new int[]{ 1, 2 }));
                    solver.addClause(new VecInt(new int[]{ -1, -0 }));
                    ModelIterator iterator = new ModelIterator(solver);
                    while (iterator.isSatisfiable(true)) {
                        iterator.model();
                    } 
                    iterator.numberOfModelsFoundSoFar();
                    org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5500 should have thrown NegativeArraySizeException");
                }
                org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5500_failAssert590litNum5800 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5500_failAssert590litNum5800_failAssert620litNum7016 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithUnitAndSatisfiableTruelitNum5500_failAssert590litNum5800_failAssert620litNum7005_failAssert816() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    ISolver solver = SolverFactory.newDefault();
                    solver.newVar(-890174617);
                    solver.setExpectedNumberOfClauses(3);
                    solver.addClause(new VecInt(new int[]{ 2 }));
                    solver.addClause(new VecInt(new int[]{ 1, 2 }));
                    solver.addClause(new VecInt(new int[]{ -1, -3 }));
                    ModelIterator iterator = new ModelIterator(solver);
                    while (iterator.isSatisfiable(true)) {
                        iterator.model();
                    } 
                    iterator.numberOfModelsFoundSoFar();
                    org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5500 should have thrown NegativeArraySizeException");
                }
                org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5500_failAssert590litNum5800 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5500_failAssert590litNum5800_failAssert620litNum7005 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithUnitAndSatisfiableTruelitNum5500_failAssert590litNum5800_failAssert620litNum7007_failAssert817() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    ISolver solver = SolverFactory.newDefault();
                    solver.newVar(-890174617);
                    solver.setExpectedNumberOfClauses(3);
                    solver.addClause(new VecInt(new int[]{ 2 }));
                    solver.addClause(new VecInt(new int[]{ 1, 2 }));
                    solver.addClause(new VecInt(new int[]{ -1, -1 }));
                    ModelIterator iterator = new ModelIterator(solver);
                    while (iterator.isSatisfiable(true)) {
                        iterator.model();
                    } 
                    iterator.numberOfModelsFoundSoFar();
                    org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5500 should have thrown NegativeArraySizeException");
                }
                org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5500_failAssert590litNum5800 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5500_failAssert590litNum5800_failAssert620litNum7007 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithUnitAndSatisfiableTruelitNum5500_failAssert590litNum5800_failAssert620litNum6984_failAssert818() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    ISolver solver = SolverFactory.newDefault();
                    solver.newVar(-890174617);
                    solver.setExpectedNumberOfClauses(3);
                    solver.addClause(new VecInt(new int[]{ 2 }));
                    solver.addClause(new VecInt(new int[]{ 1, 0 }));
                    solver.addClause(new VecInt(new int[]{ -1, -2 }));
                    ModelIterator iterator = new ModelIterator(solver);
                    while (iterator.isSatisfiable(true)) {
                        iterator.model();
                    } 
                    iterator.numberOfModelsFoundSoFar();
                    org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5500 should have thrown NegativeArraySizeException");
                }
                org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5500_failAssert590litNum5800 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5500_failAssert590litNum5800_failAssert620litNum6984 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithUnitAndSatisfiableTruelitNum5500_failAssert590litNum5800_failAssert620litNum6956_failAssert820() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    ISolver solver = SolverFactory.newDefault();
                    solver.newVar(-890174617);
                    solver.setExpectedNumberOfClauses(3);
                    solver.addClause(new VecInt(new int[]{ 2 }));
                    solver.addClause(new VecInt(new int[]{ 2, 2 }));
                    solver.addClause(new VecInt(new int[]{ -1, -2 }));
                    ModelIterator iterator = new ModelIterator(solver);
                    while (iterator.isSatisfiable(true)) {
                        iterator.model();
                    } 
                    iterator.numberOfModelsFoundSoFar();
                    org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5500 should have thrown NegativeArraySizeException");
                }
                org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5500_failAssert590litNum5800 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5500_failAssert590litNum5800_failAssert620litNum6956 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithUnitAndSatisfiableTruelitNum5500_failAssert590litNum5800_failAssert620litNum6974_failAssert821() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    ISolver solver = SolverFactory.newDefault();
                    solver.newVar(-890174617);
                    solver.setExpectedNumberOfClauses(3);
                    solver.addClause(new VecInt(new int[]{ 2 }));
                    solver.addClause(new VecInt(new int[]{ 1, 3 }));
                    solver.addClause(new VecInt(new int[]{ -1, -2 }));
                    ModelIterator iterator = new ModelIterator(solver);
                    while (iterator.isSatisfiable(true)) {
                        iterator.model();
                    } 
                    iterator.numberOfModelsFoundSoFar();
                    org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5500 should have thrown NegativeArraySizeException");
                }
                org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5500_failAssert590litNum5800 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5500_failAssert590litNum5800_failAssert620litNum6974 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithUnitAndSatisfiableTruelitNum5500_failAssert590litNum5800_failAssert620litNum6976_failAssert822() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    ISolver solver = SolverFactory.newDefault();
                    solver.newVar(-890174617);
                    solver.setExpectedNumberOfClauses(3);
                    solver.addClause(new VecInt(new int[]{ 2 }));
                    solver.addClause(new VecInt(new int[]{ 1, 1 }));
                    solver.addClause(new VecInt(new int[]{ -1, -2 }));
                    ModelIterator iterator = new ModelIterator(solver);
                    while (iterator.isSatisfiable(true)) {
                        iterator.model();
                    } 
                    iterator.numberOfModelsFoundSoFar();
                    org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5500 should have thrown NegativeArraySizeException");
                }
                org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5500_failAssert590litNum5800 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5500_failAssert590litNum5800_failAssert620litNum6976 should have thrown ContradictionException");
        } catch (ContradictionException expected) {
            Assert.assertEquals("Creating Empty clause ?", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithUnitAndSatisfiableTruelitNum5500_failAssert590litNum5800_failAssert620litNum6989_failAssert824() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    ISolver solver = SolverFactory.newDefault();
                    solver.newVar(-890174617);
                    solver.setExpectedNumberOfClauses(3);
                    solver.addClause(new VecInt(new int[]{ 2 }));
                    solver.addClause(new VecInt(new int[]{ 1, 2 }));
                    solver.addClause(new VecInt(new int[]{ -2, -2 }));
                    ModelIterator iterator = new ModelIterator(solver);
                    while (iterator.isSatisfiable(true)) {
                        iterator.model();
                    } 
                    iterator.numberOfModelsFoundSoFar();
                    org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5500 should have thrown NegativeArraySizeException");
                }
                org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5500_failAssert590litNum5800 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5500_failAssert590litNum5800_failAssert620litNum6989 should have thrown ContradictionException");
        } catch (ContradictionException expected) {
            Assert.assertEquals("Creating Empty clause ?", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithUnitAndSatisfiableTruelitNum5500_failAssert590litNum5816_failAssert627litNum6700_failAssert825() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    ISolver solver = SolverFactory.newDefault();
                    solver.newVar(-890174617);
                    solver.setExpectedNumberOfClauses(3);
                    solver.addClause(new VecInt(new int[]{ 0 }));
                    solver.addClause(new VecInt(new int[]{ 1, 3 }));
                    solver.addClause(new VecInt(new int[]{ -1, -2 }));
                    ModelIterator iterator = new ModelIterator(solver);
                    while (iterator.isSatisfiable(true)) {
                        iterator.model();
                    } 
                    iterator.numberOfModelsFoundSoFar();
                    org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5500 should have thrown NegativeArraySizeException");
                }
                org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5500_failAssert590litNum5816 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5500_failAssert590litNum5816_failAssert627litNum6700 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithUnitAndSatisfiableTruelitNum5500_failAssert590litNum5816_failAssert627litNum6743_failAssert828() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    ISolver solver = SolverFactory.newDefault();
                    solver.newVar(-890174617);
                    solver.setExpectedNumberOfClauses(3);
                    solver.addClause(new VecInt(new int[]{ 1 }));
                    solver.addClause(new VecInt(new int[]{ 1, 3 }));
                    solver.addClause(new VecInt(new int[]{ -2, -2 }));
                    ModelIterator iterator = new ModelIterator(solver);
                    while (iterator.isSatisfiable(true)) {
                        iterator.model();
                    } 
                    iterator.numberOfModelsFoundSoFar();
                    org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5500 should have thrown NegativeArraySizeException");
                }
                org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5500_failAssert590litNum5816 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5500_failAssert590litNum5816_failAssert627litNum6743 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithUnitAndSatisfiableTruelitNum5500_failAssert590litNum5827_failAssert629litNum7658_failAssert836() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    ISolver solver = SolverFactory.newDefault();
                    solver.newVar(-890174617);
                    solver.setExpectedNumberOfClauses(3);
                    solver.addClause(new VecInt(new int[]{ 1 }));
                    solver.addClause(new VecInt(new int[]{ 1, 2 }));
                    solver.addClause(new VecInt(new int[]{ -2, -3 }));
                    ModelIterator iterator = new ModelIterator(solver);
                    while (iterator.isSatisfiable(true)) {
                        iterator.model();
                    } 
                    iterator.numberOfModelsFoundSoFar();
                    org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5500 should have thrown NegativeArraySizeException");
                }
                org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5500_failAssert590litNum5827 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5500_failAssert590litNum5827_failAssert629litNum7658 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithUnitAndSatisfiableTruelitNum5500_failAssert590litNum5799_failAssert653litNum7251_failAssert840() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    ISolver solver = SolverFactory.newDefault();
                    solver.newVar(-890174617);
                    solver.setExpectedNumberOfClauses(437485623);
                    solver.addClause(new VecInt(new int[]{ 1 }));
                    solver.addClause(new VecInt(new int[]{ 2, 2 }));
                    solver.addClause(new VecInt(new int[]{ -1, -2 }));
                    ModelIterator iterator = new ModelIterator(solver);
                    while (iterator.isSatisfiable(true)) {
                        iterator.model();
                    } 
                    iterator.numberOfModelsFoundSoFar();
                    org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5500 should have thrown NegativeArraySizeException");
                }
                org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5500_failAssert590litNum5799 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5500_failAssert590litNum5799_failAssert653litNum7251 should have thrown ContradictionException");
        } catch (ContradictionException expected) {
            Assert.assertEquals("Creating Empty clause ?", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithUnitAndSatisfiableTruelitNum5500_failAssert590litNum5799_failAssert653litNum7237_failAssert842() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    ISolver solver = SolverFactory.newDefault();
                    solver.newVar(-890174617);
                    solver.setExpectedNumberOfClauses(437485623);
                    solver.addClause(new VecInt(new int[]{ 2 }));
                    solver.addClause(new VecInt(new int[]{ 1, 2 }));
                    solver.addClause(new VecInt(new int[]{ -1, -2 }));
                    ModelIterator iterator = new ModelIterator(solver);
                    while (iterator.isSatisfiable(true)) {
                        iterator.model();
                    } 
                    iterator.numberOfModelsFoundSoFar();
                    org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5500 should have thrown NegativeArraySizeException");
                }
                org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5500_failAssert590litNum5799 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5500_failAssert590litNum5799_failAssert653litNum7237 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithUnitAndSatisfiableTruelitNum5500_failAssert590litNum5799_failAssert653litNum7239_failAssert843() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    ISolver solver = SolverFactory.newDefault();
                    solver.newVar(-890174617);
                    solver.setExpectedNumberOfClauses(437485623);
                    solver.addClause(new VecInt(new int[]{ 0 }));
                    solver.addClause(new VecInt(new int[]{ 1, 2 }));
                    solver.addClause(new VecInt(new int[]{ -1, -2 }));
                    ModelIterator iterator = new ModelIterator(solver);
                    while (iterator.isSatisfiable(true)) {
                        iterator.model();
                    } 
                    iterator.numberOfModelsFoundSoFar();
                    org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5500 should have thrown NegativeArraySizeException");
                }
                org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5500_failAssert590litNum5799 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5500_failAssert590litNum5799_failAssert653litNum7239 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithUnitAndSatisfiableTruelitNum5529_failAssert604litNum6055_failAssert668litNum7606_failAssert846() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    ISolver solver = SolverFactory.newDefault();
                    solver.newVar(2);
                    solver.setExpectedNumberOfClauses(3);
                    solver.addClause(new VecInt(new int[]{ 1 }));
                    solver.addClause(new VecInt(new int[]{ 1, 3 }));
                    solver.addClause(new VecInt(new int[]{ -0, -1 }));
                    ModelIterator iterator = new ModelIterator(solver);
                    while (iterator.isSatisfiable(true)) {
                        iterator.model();
                    } 
                    iterator.numberOfModelsFoundSoFar();
                    org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5529 should have thrown ContradictionException");
                }
                org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5529_failAssert604litNum6055 should have thrown ContradictionException");
            }
            org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5529_failAssert604litNum6055_failAssert668litNum7606 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithUnitAndSatisfiableTruelitNum5529_failAssert604litNum6055_failAssert668litNum7586_failAssert847() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    ISolver solver = SolverFactory.newDefault();
                    solver.newVar(2);
                    solver.setExpectedNumberOfClauses(3);
                    solver.addClause(new VecInt(new int[]{ 1 }));
                    solver.addClause(new VecInt(new int[]{ 2, 3 }));
                    solver.addClause(new VecInt(new int[]{ -1, -1 }));
                    ModelIterator iterator = new ModelIterator(solver);
                    while (iterator.isSatisfiable(true)) {
                        iterator.model();
                    } 
                    iterator.numberOfModelsFoundSoFar();
                    org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5529 should have thrown ContradictionException");
                }
                org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5529_failAssert604litNum6055 should have thrown ContradictionException");
            }
            org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5529_failAssert604litNum6055_failAssert668litNum7586 should have thrown ContradictionException");
        } catch (ContradictionException expected) {
            Assert.assertEquals("Creating Empty clause ?", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithUnitAndSatisfiableTruelitNum5529_failAssert604litNum6055_failAssert668litNum7589_failAssert848() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    ISolver solver = SolverFactory.newDefault();
                    solver.newVar(2);
                    solver.setExpectedNumberOfClauses(3);
                    solver.addClause(new VecInt(new int[]{ 1 }));
                    solver.addClause(new VecInt(new int[]{ 0, 3 }));
                    solver.addClause(new VecInt(new int[]{ -1, -1 }));
                    ModelIterator iterator = new ModelIterator(solver);
                    while (iterator.isSatisfiable(true)) {
                        iterator.model();
                    } 
                    iterator.numberOfModelsFoundSoFar();
                    org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5529 should have thrown ContradictionException");
                }
                org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5529_failAssert604litNum6055 should have thrown ContradictionException");
            }
            org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5529_failAssert604litNum6055_failAssert668litNum7589 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithUnitAndSatisfiableTruelitNum5500_failAssert590litNum5799_failAssert653litNum7264_failAssert850() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    ISolver solver = SolverFactory.newDefault();
                    solver.newVar(-890174617);
                    solver.setExpectedNumberOfClauses(437485623);
                    solver.addClause(new VecInt(new int[]{ 1 }));
                    solver.addClause(new VecInt(new int[]{ 24031904, 2 }));
                    solver.addClause(new VecInt(new int[]{ -1, -2 }));
                    ModelIterator iterator = new ModelIterator(solver);
                    while (iterator.isSatisfiable(true)) {
                        iterator.model();
                    } 
                    iterator.numberOfModelsFoundSoFar();
                    org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5500 should have thrown NegativeArraySizeException");
                }
                org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5500_failAssert590litNum5799 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5500_failAssert590litNum5799_failAssert653litNum7264 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithUnitAndSatisfiableTruelitNum5520_failAssert599_add6137_failAssert608litNum7437_failAssert857() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    ISolver solver = SolverFactory.newDefault();
                    solver.newVar(Integer.MAX_VALUE);
                    solver.setExpectedNumberOfClauses(3);
                    solver.addClause(new VecInt(new int[]{ 1 }));
                    solver.addClause(new VecInt(new int[]{ 1, Integer.MIN_VALUE }));
                    solver.addClause(new VecInt(new int[]{ 1, Integer.MIN_VALUE }));
                    solver.addClause(new VecInt(new int[]{ -1, -2 }));
                    ModelIterator iterator = new ModelIterator(solver);
                    while (iterator.isSatisfiable(true)) {
                        iterator.model();
                    } 
                    iterator.numberOfModelsFoundSoFar();
                    org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5520 should have thrown ArrayIndexOutOfBoundsException");
                }
                org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5520_failAssert599_add6137 should have thrown ArrayIndexOutOfBoundsException");
            }
            org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5520_failAssert599_add6137_failAssert608litNum7437 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithUnitAndSatisfiableTruelitNum5520_failAssert599_add6137_failAssert608litNum7439_failAssert858() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    ISolver solver = SolverFactory.newDefault();
                    solver.newVar(Integer.MIN_VALUE);
                    solver.setExpectedNumberOfClauses(3);
                    solver.addClause(new VecInt(new int[]{ 1 }));
                    solver.addClause(new VecInt(new int[]{ 1, Integer.MIN_VALUE }));
                    solver.addClause(new VecInt(new int[]{ 1, Integer.MIN_VALUE }));
                    solver.addClause(new VecInt(new int[]{ -1, -2 }));
                    ModelIterator iterator = new ModelIterator(solver);
                    while (iterator.isSatisfiable(true)) {
                        iterator.model();
                    } 
                    iterator.numberOfModelsFoundSoFar();
                    org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5520 should have thrown ArrayIndexOutOfBoundsException");
                }
                org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5520_failAssert599_add6137 should have thrown ArrayIndexOutOfBoundsException");
            }
            org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5520_failAssert599_add6137_failAssert608litNum7439 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-2147483648", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithUnitAndSatisfiableTruelitNum5520_failAssert599_add6137_failAssert608litNum7500_failAssert863() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    ISolver solver = SolverFactory.newDefault();
                    solver.newVar(2);
                    solver.setExpectedNumberOfClauses(3);
                    solver.addClause(new VecInt(new int[]{ 1 }));
                    solver.addClause(new VecInt(new int[]{ Integer.MAX_VALUE, Integer.MIN_VALUE }));
                    solver.addClause(new VecInt(new int[]{ 1, Integer.MIN_VALUE }));
                    solver.addClause(new VecInt(new int[]{ -1, -2 }));
                    ModelIterator iterator = new ModelIterator(solver);
                    while (iterator.isSatisfiable(true)) {
                        iterator.model();
                    } 
                    iterator.numberOfModelsFoundSoFar();
                    org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5520 should have thrown ArrayIndexOutOfBoundsException");
                }
                org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5520_failAssert599_add6137 should have thrown ArrayIndexOutOfBoundsException");
            }
            org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5520_failAssert599_add6137_failAssert608litNum7500 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithUnitAndSatisfiableTruelitNum5510_failAssert593_add5974_failAssert609litNum7637_failAssert874() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    ISolver solver = SolverFactory.newDefault();
                    solver.newVar(Integer.MIN_VALUE);
                    solver.setExpectedNumberOfClauses(3);
                    solver.addClause(new VecInt(new int[]{ Integer.MIN_VALUE }));
                    solver.addClause(new VecInt(new int[]{ Integer.MIN_VALUE }));
                    solver.addClause(new VecInt(new int[]{ 1, 2 }));
                    solver.addClause(new VecInt(new int[]{ -1, -2 }));
                    ModelIterator iterator = new ModelIterator(solver);
                    while (iterator.isSatisfiable(true)) {
                        iterator.model();
                    } 
                    iterator.numberOfModelsFoundSoFar();
                    org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5510 should have thrown ArrayIndexOutOfBoundsException");
                }
                org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5510_failAssert593_add5974 should have thrown ArrayIndexOutOfBoundsException");
            }
            org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5510_failAssert593_add5974_failAssert609litNum7637 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-2147483648", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithUnitAndSatisfiableTruelitNum5498_failAssert589_add5837_failAssert639_add7545_failAssert877() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    ISolver solver = SolverFactory.newDefault();
                    solver.newVar(Integer.MIN_VALUE);
                    solver.setExpectedNumberOfClauses(3);
                    solver.addClause(new VecInt(new int[]{ 1 }));
                    solver.addClause(new VecInt(new int[]{ 1, 2 }));
                    solver.addClause(new VecInt(new int[]{ -1, -2 }));
                    solver.addClause(new VecInt(new int[]{ -1, -2 }));
                    solver.addClause(new VecInt(new int[]{ -1, -2 }));
                    ModelIterator iterator = new ModelIterator(solver);
                    while (iterator.isSatisfiable(true)) {
                        iterator.model();
                    } 
                    iterator.numberOfModelsFoundSoFar();
                    org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5498 should have thrown NegativeArraySizeException");
                }
                org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5498_failAssert589_add5837 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5498_failAssert589_add5837_failAssert639_add7545 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithUnitAndSatisfiableTruelitNum5508_failAssert591_add5782_failAssert618_add6838_failAssert883() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    ISolver solver = SolverFactory.newDefault();
                    solver.newVar(2);
                    solver.setExpectedNumberOfClauses(3);
                    solver.addClause(new VecInt(new int[]{ 0 }));
                    solver.addClause(new VecInt(new int[]{ 1, 2 }));
                    solver.addClause(new VecInt(new int[]{ -1, -2 }));
                    solver.addClause(new VecInt(new int[]{ -1, -2 }));
                    solver.addClause(new VecInt(new int[]{ -1, -2 }));
                    ModelIterator iterator = new ModelIterator(solver);
                    while (iterator.isSatisfiable(true)) {
                        iterator.model();
                    } 
                    iterator.numberOfModelsFoundSoFar();
                    org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5508 should have thrown IllegalArgumentException");
                }
                org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5508_failAssert591_add5782 should have thrown IllegalArgumentException");
            }
            org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5508_failAssert591_add5782_failAssert618_add6838 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithUnitAndSatisfiableTruelitNum5524_failAssert601_add6028_failAssert619_add6936_failAssert887() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    ISolver solver = SolverFactory.newDefault();
                    solver.newVar(2);
                    solver.setExpectedNumberOfClauses(3);
                    solver.addClause(new VecInt(new int[]{ 1 }));
                    solver.addClause(new VecInt(new int[]{ 1, 2 }));
                    solver.addClause(new VecInt(new int[]{ -0, -2 }));
                    solver.addClause(new VecInt(new int[]{ -0, -2 }));
                    solver.addClause(new VecInt(new int[]{ -0, -2 }));
                    ModelIterator iterator = new ModelIterator(solver);
                    while (iterator.isSatisfiable(true)) {
                        iterator.model();
                    } 
                    iterator.numberOfModelsFoundSoFar();
                    org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5524 should have thrown IllegalArgumentException");
                }
                org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5524_failAssert601_add6028 should have thrown IllegalArgumentException");
            }
            org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5524_failAssert601_add6028_failAssert619_add6936 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithUnitAndSatisfiableTruelitNum5512_failAssert594litNum5910_failAssert689litNum7323_failAssert889() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    ISolver solver = SolverFactory.newDefault();
                    solver.newVar(2);
                    solver.setExpectedNumberOfClauses(186148185);
                    solver.addClause(new VecInt(new int[]{ 0 }));
                    solver.addClause(new VecInt(new int[]{ 2, 2 }));
                    solver.addClause(new VecInt(new int[]{ -1, -2 }));
                    ModelIterator iterator = new ModelIterator(solver);
                    while (iterator.isSatisfiable(true)) {
                        iterator.model();
                    } 
                    iterator.numberOfModelsFoundSoFar();
                    org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5512 should have thrown ContradictionException");
                }
                org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5512_failAssert594litNum5910 should have thrown ContradictionException");
            }
            org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5512_failAssert594litNum5910_failAssert689litNum7323 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithUnitAndSatisfiableTruelitNum5512_failAssert594litNum5910_failAssert689litNum7352_failAssert890() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    ISolver solver = SolverFactory.newDefault();
                    solver.newVar(2);
                    solver.setExpectedNumberOfClauses(186148185);
                    solver.addClause(new VecInt(new int[]{ 1 }));
                    solver.addClause(new VecInt(new int[]{ 2, 0 }));
                    solver.addClause(new VecInt(new int[]{ -1, -2 }));
                    ModelIterator iterator = new ModelIterator(solver);
                    while (iterator.isSatisfiable(true)) {
                        iterator.model();
                    } 
                    iterator.numberOfModelsFoundSoFar();
                    org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5512 should have thrown ContradictionException");
                }
                org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5512_failAssert594litNum5910 should have thrown ContradictionException");
            }
            org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5512_failAssert594litNum5910_failAssert689litNum7352 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithUnitAndSatisfiableTruelitNum5512_failAssert594litNum5910_failAssert689litNum7363_failAssert891() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    ISolver solver = SolverFactory.newDefault();
                    solver.newVar(2);
                    solver.setExpectedNumberOfClauses(186148185);
                    solver.addClause(new VecInt(new int[]{ 1 }));
                    solver.addClause(new VecInt(new int[]{ 2, 2 }));
                    solver.addClause(new VecInt(new int[]{ -0, -2 }));
                    ModelIterator iterator = new ModelIterator(solver);
                    while (iterator.isSatisfiable(true)) {
                        iterator.model();
                    } 
                    iterator.numberOfModelsFoundSoFar();
                    org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5512 should have thrown ContradictionException");
                }
                org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5512_failAssert594litNum5910 should have thrown ContradictionException");
            }
            org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5512_failAssert594litNum5910_failAssert689litNum7363 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithUnitAndSatisfiableTruelitNum5512_failAssert594litNum5910_failAssert689litNum7358_failAssert893() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    ISolver solver = SolverFactory.newDefault();
                    solver.newVar(2);
                    solver.setExpectedNumberOfClauses(186148185);
                    solver.addClause(new VecInt(new int[]{ 1 }));
                    solver.addClause(new VecInt(new int[]{ 2, 2 }));
                    solver.addClause(new VecInt(new int[]{ -2, -2 }));
                    ModelIterator iterator = new ModelIterator(solver);
                    while (iterator.isSatisfiable(true)) {
                        iterator.model();
                    } 
                    iterator.numberOfModelsFoundSoFar();
                    org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5512 should have thrown ContradictionException");
                }
                org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5512_failAssert594litNum5910 should have thrown ContradictionException");
            }
            org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5512_failAssert594litNum5910_failAssert689litNum7358 should have thrown ContradictionException");
        } catch (ContradictionException expected) {
            Assert.assertEquals("Creating Empty clause ?", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithUnitAndSatisfiableTruelitNum5524_failAssert601_add6028_failAssert619_add6927_failAssert900() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    ISolver solver = SolverFactory.newDefault();
                    solver.newVar(2);
                    solver.setExpectedNumberOfClauses(3);
                    solver.addClause(new VecInt(new int[]{ 1 }));
                    solver.addClause(new VecInt(new int[]{ 1, 2 }));
                    solver.addClause(new VecInt(new int[]{ 1, 2 }));
                    solver.addClause(new VecInt(new int[]{ -0, -2 }));
                    solver.addClause(new VecInt(new int[]{ -0, -2 }));
                    ModelIterator iterator = new ModelIterator(solver);
                    while (iterator.isSatisfiable(true)) {
                        iterator.model();
                    } 
                    iterator.numberOfModelsFoundSoFar();
                    org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5524 should have thrown IllegalArgumentException");
                }
                org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5524_failAssert601_add6028 should have thrown IllegalArgumentException");
            }
            org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5524_failAssert601_add6028_failAssert619_add6927 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithUnitAndSatisfiableTruelitNum5520_failAssert599_add6137_failAssert608_add7582_failAssert926() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    ISolver solver = SolverFactory.newDefault();
                    solver.newVar(2);
                    solver.newVar(2);
                    solver.setExpectedNumberOfClauses(3);
                    solver.addClause(new VecInt(new int[]{ 1 }));
                    solver.addClause(new VecInt(new int[]{ 1, Integer.MIN_VALUE }));
                    solver.addClause(new VecInt(new int[]{ 1, Integer.MIN_VALUE }));
                    solver.addClause(new VecInt(new int[]{ -1, -2 }));
                    ModelIterator iterator = new ModelIterator(solver);
                    while (iterator.isSatisfiable(true)) {
                        iterator.model();
                    } 
                    iterator.numberOfModelsFoundSoFar();
                    org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5520 should have thrown ArrayIndexOutOfBoundsException");
                }
                org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5520_failAssert599_add6137 should have thrown ArrayIndexOutOfBoundsException");
            }
            org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5520_failAssert599_add6137_failAssert608_add7582 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-2147483648", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithUnitAndSatisfiableTruelitNum5500_failAssert590litNum5808_failAssert628litNum7581_failAssert929() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    ISolver solver = SolverFactory.newDefault();
                    solver.newVar(-890174617);
                    solver.setExpectedNumberOfClauses(3);
                    solver.addClause(new VecInt(new int[]{ 1 }));
                    solver.addClause(new VecInt(new int[]{ 2, 2 }));
                    solver.addClause(new VecInt(new int[]{ -1, -3 }));
                    ModelIterator iterator = new ModelIterator(solver);
                    while (iterator.isSatisfiable(true)) {
                        iterator.model();
                    } 
                    iterator.numberOfModelsFoundSoFar();
                    org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5500 should have thrown NegativeArraySizeException");
                }
                org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5500_failAssert590litNum5808 should have thrown ContradictionException");
            }
            org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5500_failAssert590litNum5808_failAssert628litNum7581 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithUnitAndSatisfiableTruelitNum5500_failAssert590litNum5808_failAssert628litNum7568_failAssert933() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    ISolver solver = SolverFactory.newDefault();
                    solver.newVar(-890174617);
                    solver.setExpectedNumberOfClauses(3);
                    solver.addClause(new VecInt(new int[]{ 1 }));
                    solver.addClause(new VecInt(new int[]{ 2, 2 }));
                    solver.addClause(new VecInt(new int[]{ -0, -2 }));
                    ModelIterator iterator = new ModelIterator(solver);
                    while (iterator.isSatisfiable(true)) {
                        iterator.model();
                    } 
                    iterator.numberOfModelsFoundSoFar();
                    org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5500 should have thrown NegativeArraySizeException");
                }
                org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5500_failAssert590litNum5808 should have thrown ContradictionException");
            }
            org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5500_failAssert590litNum5808_failAssert628litNum7568 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithUnitAndSatisfiableTruelitNum5510_failAssert593_add5974_failAssert609_add7745_failAssert935() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    ISolver solver = SolverFactory.newDefault();
                    solver.newVar(2);
                    solver.newVar(2);
                    solver.setExpectedNumberOfClauses(3);
                    solver.addClause(new VecInt(new int[]{ Integer.MIN_VALUE }));
                    solver.addClause(new VecInt(new int[]{ Integer.MIN_VALUE }));
                    solver.addClause(new VecInt(new int[]{ 1, 2 }));
                    solver.addClause(new VecInt(new int[]{ -1, -2 }));
                    ModelIterator iterator = new ModelIterator(solver);
                    while (iterator.isSatisfiable(true)) {
                        iterator.model();
                    } 
                    iterator.numberOfModelsFoundSoFar();
                    org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5510 should have thrown ArrayIndexOutOfBoundsException");
                }
                org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5510_failAssert593_add5974 should have thrown ArrayIndexOutOfBoundsException");
            }
            org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5510_failAssert593_add5974_failAssert609_add7745 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-2147483648", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithUnitAndSatisfiableTruelitNum5512_failAssert594litNum5948_failAssert671litNum7673_failAssert936() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    ISolver solver = SolverFactory.newDefault();
                    solver.newVar(2);
                    solver.setExpectedNumberOfClauses(3);
                    solver.addClause(new VecInt(new int[]{ 1 }));
                    solver.addClause(new VecInt(new int[]{ 2, 2 }));
                    solver.addClause(new VecInt(new int[]{ -0, -1 }));
                    ModelIterator iterator = new ModelIterator(solver);
                    while (iterator.isSatisfiable(true)) {
                        iterator.model();
                    } 
                    iterator.numberOfModelsFoundSoFar();
                    org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5512 should have thrown ContradictionException");
                }
                org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5512_failAssert594litNum5948 should have thrown IllegalArgumentException");
            }
            org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5512_failAssert594litNum5948_failAssert671litNum7673 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithUnitAndSatisfiableTruelitNum5500_failAssert590litNum5816_failAssert627_add6832_failAssert941() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    ISolver solver = SolverFactory.newDefault();
                    solver.newVar(-890174617);
                    solver.setExpectedNumberOfClauses(3);
                    solver.addClause(new VecInt(new int[]{ 1 }));
                    solver.addClause(new VecInt(new int[]{ 1, 3 }));
                    solver.addClause(new VecInt(new int[]{ -1, -2 }));
                    ModelIterator iterator = new ModelIterator(solver);
                    while (iterator.isSatisfiable(true)) {
                        iterator.model();
                        iterator.model();
                    } 
                    iterator.numberOfModelsFoundSoFar();
                    org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5500 should have thrown NegativeArraySizeException");
                }
                org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5500_failAssert590litNum5816 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5500_failAssert590litNum5816_failAssert627_add6832 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithUnitAndSatisfiableTruelitNum5500_failAssert590litNum5827_failAssert629_add7716_failAssert942() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    ISolver solver = SolverFactory.newDefault();
                    solver.newVar(-890174617);
                    solver.setExpectedNumberOfClauses(3);
                    solver.addClause(new VecInt(new int[]{ 1 }));
                    solver.addClause(new VecInt(new int[]{ 1, 2 }));
                    solver.addClause(new VecInt(new int[]{ -2, -2 }));
                    ModelIterator iterator = new ModelIterator(solver);
                    while (iterator.isSatisfiable(true)) {
                        iterator.model();
                        iterator.model();
                    } 
                    iterator.numberOfModelsFoundSoFar();
                    org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5500 should have thrown NegativeArraySizeException");
                }
                org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5500_failAssert590litNum5827 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5500_failAssert590litNum5827_failAssert629_add7716 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithUnitAndSatisfiableTruelitNum5509_failAssert592litNum6011_failAssert694litNum7530_failAssert943() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    ISolver solver = SolverFactory.newDefault();
                    solver.newVar(0);
                    solver.setExpectedNumberOfClauses(3);
                    solver.addClause(new VecInt(new int[]{ Integer.MAX_VALUE }));
                    solver.addClause(new VecInt(new int[]{ 1, 2 }));
                    solver.addClause(new VecInt(new int[]{ -1, -0 }));
                    ModelIterator iterator = new ModelIterator(solver);
                    while (iterator.isSatisfiable(true)) {
                        iterator.model();
                    } 
                    iterator.numberOfModelsFoundSoFar();
                    org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5509 should have thrown NegativeArraySizeException");
                }
                org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5509_failAssert592litNum6011 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5509_failAssert592litNum6011_failAssert694litNum7530 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void checkModelIterationWithUnitAndSatisfiableTruelitNum5509_failAssert592litNum6011_failAssert694litNum7482_failAssert949() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    ISolver solver = SolverFactory.newDefault();
                    solver.newVar(0);
                    solver.setExpectedNumberOfClauses(3);
                    solver.addClause(new VecInt(new int[]{ Integer.MAX_VALUE }));
                    solver.addClause(new VecInt(new int[]{ 1, 3 }));
                    solver.addClause(new VecInt(new int[]{ -1, -2 }));
                    ModelIterator iterator = new ModelIterator(solver);
                    while (iterator.isSatisfiable(true)) {
                        iterator.model();
                    } 
                    iterator.numberOfModelsFoundSoFar();
                    org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5509 should have thrown NegativeArraySizeException");
                }
                org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5509_failAssert592litNum6011 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("checkModelIterationWithUnitAndSatisfiableTruelitNum5509_failAssert592litNum6011_failAssert694litNum7482 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }
}

