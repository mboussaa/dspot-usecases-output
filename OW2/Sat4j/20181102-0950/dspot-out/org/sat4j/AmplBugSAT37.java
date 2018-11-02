package org.sat4j;


import java.util.NoSuchElementException;
import org.junit.Assert;
import org.junit.Test;
import org.sat4j.core.VecInt;
import org.sat4j.minisat.SolverFactory;
import org.sat4j.specs.ContradictionException;
import org.sat4j.specs.IConstr;
import org.sat4j.specs.ISolver;


public class AmplBugSAT37 {
    @Test(timeout = 30000)
    public void testSolverlitNum3_failAssert0() throws Exception {
        try {
            ISolver s = SolverFactory.newDefault();
            int resVars = s.newVar(Integer.MAX_VALUE);
            {
                s.addClause(new VecInt(new int[]{ -1, -3 }));
                s.addClause(new VecInt(new int[]{ -2, -4 }));
                s.addClause(new VecInt(new int[]{ 1 }));
                s.addClause(new VecInt(new int[]{ 3 }));
                IConstr r = s.addAtMost(new VecInt(new int[]{ 5, 6 }), 1);
                int[] model = s.findModel();
                s.removeConstr(r);
                model = s.findModel();
            }
            org.junit.Assert.fail("testSolverlitNum3 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSolverlitNum8_failAssert1() throws Exception {
        try {
            ISolver s = SolverFactory.newDefault();
            int resVars = s.newVar(6);
            {
                s.addClause(new VecInt(new int[]{ -0, -3 }));
                s.addClause(new VecInt(new int[]{ -2, -4 }));
                s.addClause(new VecInt(new int[]{ 1 }));
                s.addClause(new VecInt(new int[]{ 3 }));
                IConstr r = s.addAtMost(new VecInt(new int[]{ 5, 6 }), 1);
                int[] model = s.findModel();
                s.removeConstr(r);
                model = s.findModel();
            }
            org.junit.Assert.fail("testSolverlitNum8 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSolverlitNum9_failAssert2() throws Exception {
        try {
            ISolver s = SolverFactory.newDefault();
            int resVars = s.newVar(6);
            {
                s.addClause(new VecInt(new int[]{ -(Integer.MAX_VALUE), -3 }));
                s.addClause(new VecInt(new int[]{ -2, -4 }));
                s.addClause(new VecInt(new int[]{ 1 }));
                s.addClause(new VecInt(new int[]{ 3 }));
                IConstr r = s.addAtMost(new VecInt(new int[]{ 5, 6 }), 1);
                int[] model = s.findModel();
                s.removeConstr(r);
                model = s.findModel();
            }
            org.junit.Assert.fail("testSolverlitNum9 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSolverlitNum10_failAssert3() throws Exception {
        try {
            ISolver s = SolverFactory.newDefault();
            int resVars = s.newVar(6);
            {
                s.addClause(new VecInt(new int[]{ -(Integer.MIN_VALUE), -3 }));
                s.addClause(new VecInt(new int[]{ -2, -4 }));
                s.addClause(new VecInt(new int[]{ 1 }));
                s.addClause(new VecInt(new int[]{ 3 }));
                IConstr r = s.addAtMost(new VecInt(new int[]{ 5, 6 }), 1);
                int[] model = s.findModel();
                s.removeConstr(r);
                model = s.findModel();
            }
            org.junit.Assert.fail("testSolverlitNum10 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-2147483648", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSolverlitNum14_failAssert4() throws Exception {
        try {
            ISolver s = SolverFactory.newDefault();
            int resVars = s.newVar(6);
            {
                s.addClause(new VecInt(new int[]{ -1, -(Integer.MAX_VALUE) }));
                s.addClause(new VecInt(new int[]{ -2, -4 }));
                s.addClause(new VecInt(new int[]{ 1 }));
                s.addClause(new VecInt(new int[]{ 3 }));
                IConstr r = s.addAtMost(new VecInt(new int[]{ 5, 6 }), 1);
                int[] model = s.findModel();
                s.removeConstr(r);
                model = s.findModel();
            }
            org.junit.Assert.fail("testSolverlitNum14 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSolverlitNum16_failAssert6() throws Exception {
        try {
            ISolver s = SolverFactory.newDefault();
            int resVars = s.newVar(6);
            {
                s.addClause(new VecInt(new int[]{ -1, -0 }));
                s.addClause(new VecInt(new int[]{ -2, -4 }));
                s.addClause(new VecInt(new int[]{ 1 }));
                s.addClause(new VecInt(new int[]{ 3 }));
                IConstr r = s.addAtMost(new VecInt(new int[]{ 5, 6 }), 1);
                int[] model = s.findModel();
                s.removeConstr(r);
                model = s.findModel();
            }
            org.junit.Assert.fail("testSolverlitNum16 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSolverlitNum20_failAssert7() throws Exception {
        try {
            ISolver s = SolverFactory.newDefault();
            int resVars = s.newVar(6);
            {
                s.addClause(new VecInt(new int[]{ -1, -3 }));
                s.addClause(new VecInt(new int[]{ -(Integer.MAX_VALUE), -4 }));
                s.addClause(new VecInt(new int[]{ 1 }));
                s.addClause(new VecInt(new int[]{ 3 }));
                IConstr r = s.addAtMost(new VecInt(new int[]{ 5, 6 }), 1);
                int[] model = s.findModel();
                s.removeConstr(r);
                model = s.findModel();
            }
            org.junit.Assert.fail("testSolverlitNum20 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSolverlitNum22_failAssert9() throws Exception {
        try {
            ISolver s = SolverFactory.newDefault();
            int resVars = s.newVar(6);
            {
                s.addClause(new VecInt(new int[]{ -1, -3 }));
                s.addClause(new VecInt(new int[]{ -0, -4 }));
                s.addClause(new VecInt(new int[]{ 1 }));
                s.addClause(new VecInt(new int[]{ 3 }));
                IConstr r = s.addAtMost(new VecInt(new int[]{ 5, 6 }), 1);
                int[] model = s.findModel();
                s.removeConstr(r);
                model = s.findModel();
            }
            org.junit.Assert.fail("testSolverlitNum22 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSolverlitNum31_failAssert13() throws Exception {
        try {
            ISolver s = SolverFactory.newDefault();
            int resVars = s.newVar(6);
            {
                s.addClause(new VecInt(new int[]{ -1, -3 }));
                s.addClause(new VecInt(new int[]{ -2, -4 }));
                s.addClause(new VecInt(new int[]{ 0 }));
                s.addClause(new VecInt(new int[]{ 3 }));
                IConstr r = s.addAtMost(new VecInt(new int[]{ 5, 6 }), 1);
                int[] model = s.findModel();
                s.removeConstr(r);
                model = s.findModel();
            }
            org.junit.Assert.fail("testSolverlitNum31 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSolverlitNum32_failAssert14() throws Exception {
        try {
            ISolver s = SolverFactory.newDefault();
            int resVars = s.newVar(6);
            {
                s.addClause(new VecInt(new int[]{ -1, -3 }));
                s.addClause(new VecInt(new int[]{ -2, -4 }));
                s.addClause(new VecInt(new int[]{ Integer.MAX_VALUE }));
                s.addClause(new VecInt(new int[]{ 3 }));
                IConstr r = s.addAtMost(new VecInt(new int[]{ 5, 6 }), 1);
                int[] model = s.findModel();
                s.removeConstr(r);
                model = s.findModel();
            }
            org.junit.Assert.fail("testSolverlitNum32 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSolverlitNum37_failAssert16() throws Exception {
        try {
            ISolver s = SolverFactory.newDefault();
            int resVars = s.newVar(6);
            {
                s.addClause(new VecInt(new int[]{ -1, -3 }));
                s.addClause(new VecInt(new int[]{ -2, -4 }));
                s.addClause(new VecInt(new int[]{ 1 }));
                s.addClause(new VecInt(new int[]{ Integer.MAX_VALUE }));
                IConstr r = s.addAtMost(new VecInt(new int[]{ 5, 6 }), 1);
                int[] model = s.findModel();
                s.removeConstr(r);
                model = s.findModel();
            }
            org.junit.Assert.fail("testSolverlitNum37 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSolverlitNum39_failAssert18() throws Exception {
        try {
            ISolver s = SolverFactory.newDefault();
            int resVars = s.newVar(6);
            {
                s.addClause(new VecInt(new int[]{ -1, -3 }));
                s.addClause(new VecInt(new int[]{ -2, -4 }));
                s.addClause(new VecInt(new int[]{ 1 }));
                s.addClause(new VecInt(new int[]{ 0 }));
                IConstr r = s.addAtMost(new VecInt(new int[]{ 5, 6 }), 1);
                int[] model = s.findModel();
                s.removeConstr(r);
                model = s.findModel();
            }
            org.junit.Assert.fail("testSolverlitNum39 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSolverlitNum43_failAssert19() throws Exception {
        try {
            ISolver s = SolverFactory.newDefault();
            int resVars = s.newVar(6);
            {
                s.addClause(new VecInt(new int[]{ -1, -3 }));
                s.addClause(new VecInt(new int[]{ -2, -4 }));
                s.addClause(new VecInt(new int[]{ 1 }));
                s.addClause(new VecInt(new int[]{ 3 }));
                IConstr r = s.addAtMost(new VecInt(new int[]{ Integer.MAX_VALUE, 6 }), 1);
                int[] model = s.findModel();
                s.removeConstr(r);
                model = s.findModel();
            }
            org.junit.Assert.fail("testSolverlitNum43 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSolverlitNum45_failAssert21() throws Exception {
        try {
            ISolver s = SolverFactory.newDefault();
            int resVars = s.newVar(6);
            {
                s.addClause(new VecInt(new int[]{ -1, -3 }));
                s.addClause(new VecInt(new int[]{ -2, -4 }));
                s.addClause(new VecInt(new int[]{ 1 }));
                s.addClause(new VecInt(new int[]{ 3 }));
                IConstr r = s.addAtMost(new VecInt(new int[]{ 0, 6 }), 1);
                int[] model = s.findModel();
                s.removeConstr(r);
                model = s.findModel();
            }
            org.junit.Assert.fail("testSolverlitNum45 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSolver_add66_failAssert25() throws Exception {
        try {
            ISolver s = SolverFactory.newDefault();
            int resVars = s.newVar(6);
            {
                s.addClause(new VecInt(new int[]{ -1, -3 }));
                s.addClause(new VecInt(new int[]{ -2, -4 }));
                s.addClause(new VecInt(new int[]{ 1 }));
                s.addClause(new VecInt(new int[]{ 3 }));
                IConstr r = s.addAtMost(new VecInt(new int[]{ 5, 6 }), 1);
                int[] model = s.findModel();
                s.removeConstr(r);
                s.removeConstr(r);
                model = s.findModel();
            }
            org.junit.Assert.fail("testSolver_add66 should have thrown NoSuchElementException");
        } catch (NoSuchElementException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSolverlitNum10_failAssert3_add595_failAssert26() throws Exception {
        try {
            {
                ISolver s = SolverFactory.newDefault();
                int resVars = s.newVar(6);
                {
                    s.addClause(new VecInt(new int[]{ -(Integer.MIN_VALUE), -3 }));
                    s.addClause(new VecInt(new int[]{ -(Integer.MIN_VALUE), -3 }));
                    s.addClause(new VecInt(new int[]{ -2, -4 }));
                    s.addClause(new VecInt(new int[]{ 1 }));
                    s.addClause(new VecInt(new int[]{ 3 }));
                    IConstr r = s.addAtMost(new VecInt(new int[]{ 5, 6 }), 1);
                    int[] model = s.findModel();
                    s.removeConstr(r);
                    model = s.findModel();
                }
                org.junit.Assert.fail("testSolverlitNum10 should have thrown ArrayIndexOutOfBoundsException");
            }
            org.junit.Assert.fail("testSolverlitNum10_failAssert3_add595 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-2147483648", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSolverlitNum14_failAssert4_add388_failAssert27() throws Exception {
        try {
            {
                ISolver s = SolverFactory.newDefault();
                int resVars = s.newVar(6);
                {
                    s.addClause(new VecInt(new int[]{ -1, -(Integer.MAX_VALUE) }));
                    s.addClause(new VecInt(new int[]{ -1, -(Integer.MAX_VALUE) }));
                    s.addClause(new VecInt(new int[]{ -2, -4 }));
                    s.addClause(new VecInt(new int[]{ 1 }));
                    s.addClause(new VecInt(new int[]{ 3 }));
                    IConstr r = s.addAtMost(new VecInt(new int[]{ 5, 6 }), 1);
                    int[] model = s.findModel();
                    s.removeConstr(r);
                    model = s.findModel();
                }
                org.junit.Assert.fail("testSolverlitNum14 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testSolverlitNum14_failAssert4_add388 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSolverlitNum20_failAssert7_add801_failAssert28() throws Exception {
        try {
            {
                ISolver s = SolverFactory.newDefault();
                int resVars = s.newVar(6);
                {
                    s.addClause(new VecInt(new int[]{ -1, -3 }));
                    s.addClause(new VecInt(new int[]{ -(Integer.MAX_VALUE), -4 }));
                    s.addClause(new VecInt(new int[]{ -(Integer.MAX_VALUE), -4 }));
                    s.addClause(new VecInt(new int[]{ 1 }));
                    s.addClause(new VecInt(new int[]{ 3 }));
                    IConstr r = s.addAtMost(new VecInt(new int[]{ 5, 6 }), 1);
                    int[] model = s.findModel();
                    s.removeConstr(r);
                    model = s.findModel();
                }
                org.junit.Assert.fail("testSolverlitNum20 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testSolverlitNum20_failAssert7_add801 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSolverlitNum43_failAssert19_add991_failAssert29() throws Exception {
        try {
            {
                ISolver s = SolverFactory.newDefault();
                int resVars = s.newVar(6);
                {
                    s.addClause(new VecInt(new int[]{ -1, -3 }));
                    s.addClause(new VecInt(new int[]{ -2, -4 }));
                    s.addClause(new VecInt(new int[]{ 1 }));
                    s.addClause(new VecInt(new int[]{ 3 }));
                    s.addAtMost(new VecInt(new int[]{ Integer.MAX_VALUE, 6 }), 1);
                    IConstr r = s.addAtMost(new VecInt(new int[]{ Integer.MAX_VALUE, 6 }), 1);
                    int[] model = s.findModel();
                    s.removeConstr(r);
                    model = s.findModel();
                }
                org.junit.Assert.fail("testSolverlitNum43 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testSolverlitNum43_failAssert19_add991 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSolverlitNum9_failAssert2_add708_failAssert30() throws Exception {
        try {
            {
                ISolver s = SolverFactory.newDefault();
                int resVars = s.newVar(6);
                {
                    s.addClause(new VecInt(new int[]{ -(Integer.MAX_VALUE), -3 }));
                    s.addClause(new VecInt(new int[]{ -(Integer.MAX_VALUE), -3 }));
                    s.addClause(new VecInt(new int[]{ -2, -4 }));
                    s.addClause(new VecInt(new int[]{ 1 }));
                    s.addClause(new VecInt(new int[]{ 3 }));
                    IConstr r = s.addAtMost(new VecInt(new int[]{ 5, 6 }), 1);
                    int[] model = s.findModel();
                    s.removeConstr(r);
                    model = s.findModel();
                }
                org.junit.Assert.fail("testSolverlitNum9 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testSolverlitNum9_failAssert2_add708 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSolverlitNum37_failAssert16_add696_failAssert31() throws Exception {
        try {
            {
                ISolver s = SolverFactory.newDefault();
                int resVars = s.newVar(6);
                {
                    s.addClause(new VecInt(new int[]{ -1, -3 }));
                    s.addClause(new VecInt(new int[]{ -2, -4 }));
                    s.addClause(new VecInt(new int[]{ 1 }));
                    s.addClause(new VecInt(new int[]{ Integer.MAX_VALUE }));
                    s.addClause(new VecInt(new int[]{ Integer.MAX_VALUE }));
                    IConstr r = s.addAtMost(new VecInt(new int[]{ 5, 6 }), 1);
                    int[] model = s.findModel();
                    s.removeConstr(r);
                    model = s.findModel();
                }
                org.junit.Assert.fail("testSolverlitNum37 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testSolverlitNum37_failAssert16_add696 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSolverlitNum32_failAssert14_add432_failAssert32() throws Exception {
        try {
            {
                ISolver s = SolverFactory.newDefault();
                int resVars = s.newVar(6);
                {
                    s.addClause(new VecInt(new int[]{ -1, -3 }));
                    s.addClause(new VecInt(new int[]{ -2, -4 }));
                    s.addClause(new VecInt(new int[]{ Integer.MAX_VALUE }));
                    s.addClause(new VecInt(new int[]{ Integer.MAX_VALUE }));
                    s.addClause(new VecInt(new int[]{ 3 }));
                    IConstr r = s.addAtMost(new VecInt(new int[]{ 5, 6 }), 1);
                    int[] model = s.findModel();
                    s.removeConstr(r);
                    model = s.findModel();
                }
                org.junit.Assert.fail("testSolverlitNum32 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testSolverlitNum32_failAssert14_add432 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSolverlitNum39_failAssert18_add1019_failAssert37() throws Exception {
        try {
            {
                ISolver s = SolverFactory.newDefault();
                int resVars = s.newVar(6);
                {
                    s.addClause(new VecInt(new int[]{ -1, -3 }));
                    s.addClause(new VecInt(new int[]{ -2, -4 }));
                    s.addClause(new VecInt(new int[]{ 1 }));
                    s.addClause(new VecInt(new int[]{ 0 }));
                    s.addAtMost(new VecInt(new int[]{ 5, 6 }), 1);
                    IConstr r = s.addAtMost(new VecInt(new int[]{ 5, 6 }), 1);
                    int[] model = s.findModel();
                    s.removeConstr(r);
                    model = s.findModel();
                }
                org.junit.Assert.fail("testSolverlitNum39 should have thrown IllegalArgumentException");
            }
            org.junit.Assert.fail("testSolverlitNum39_failAssert18_add1019 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSolverlitNum45_failAssert21_add392_failAssert40() throws Exception {
        try {
            {
                ISolver s = SolverFactory.newDefault();
                int resVars = s.newVar(6);
                {
                    s.addClause(new VecInt(new int[]{ -1, -3 }));
                    s.addClause(new VecInt(new int[]{ -2, -4 }));
                    s.addClause(new VecInt(new int[]{ 1 }));
                    s.addClause(new VecInt(new int[]{ 3 }));
                    s.addAtMost(new VecInt(new int[]{ 0, 6 }), 1);
                    IConstr r = s.addAtMost(new VecInt(new int[]{ 0, 6 }), 1);
                    int[] model = s.findModel();
                    s.removeConstr(r);
                    model = s.findModel();
                }
                org.junit.Assert.fail("testSolverlitNum45 should have thrown IllegalArgumentException");
            }
            org.junit.Assert.fail("testSolverlitNum45_failAssert21_add392 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSolverlitNum31_failAssert13_add901_failAssert41() throws Exception {
        try {
            {
                ISolver s = SolverFactory.newDefault();
                int resVars = s.newVar(6);
                {
                    s.addClause(new VecInt(new int[]{ -1, -3 }));
                    s.addClause(new VecInt(new int[]{ -2, -4 }));
                    s.addClause(new VecInt(new int[]{ 0 }));
                    s.addClause(new VecInt(new int[]{ 3 }));
                    s.addAtMost(new VecInt(new int[]{ 5, 6 }), 1);
                    IConstr r = s.addAtMost(new VecInt(new int[]{ 5, 6 }), 1);
                    int[] model = s.findModel();
                    s.removeConstr(r);
                    model = s.findModel();
                }
                org.junit.Assert.fail("testSolverlitNum31 should have thrown IllegalArgumentException");
            }
            org.junit.Assert.fail("testSolverlitNum31_failAssert13_add901 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSolverlitNum22_failAssert9_add1030_failAssert42() throws Exception {
        try {
            {
                ISolver s = SolverFactory.newDefault();
                int resVars = s.newVar(6);
                {
                    s.addClause(new VecInt(new int[]{ -1, -3 }));
                    s.addClause(new VecInt(new int[]{ -0, -4 }));
                    s.addClause(new VecInt(new int[]{ 1 }));
                    s.addClause(new VecInt(new int[]{ 3 }));
                    s.addAtMost(new VecInt(new int[]{ 5, 6 }), 1);
                    IConstr r = s.addAtMost(new VecInt(new int[]{ 5, 6 }), 1);
                    int[] model = s.findModel();
                    s.removeConstr(r);
                    model = s.findModel();
                }
                org.junit.Assert.fail("testSolverlitNum22 should have thrown IllegalArgumentException");
            }
            org.junit.Assert.fail("testSolverlitNum22_failAssert9_add1030 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSolverlitNum45_failAssert21_add378_failAssert43() throws Exception {
        try {
            {
                ISolver s = SolverFactory.newDefault();
                int resVars = s.newVar(6);
                {
                    s.addClause(new VecInt(new int[]{ -1, -3 }));
                    s.addClause(new VecInt(new int[]{ -2, -4 }));
                    s.addClause(new VecInt(new int[]{ -2, -4 }));
                    s.addClause(new VecInt(new int[]{ 1 }));
                    s.addClause(new VecInt(new int[]{ 3 }));
                    IConstr r = s.addAtMost(new VecInt(new int[]{ 0, 6 }), 1);
                    int[] model = s.findModel();
                    s.removeConstr(r);
                    model = s.findModel();
                }
                org.junit.Assert.fail("testSolverlitNum45 should have thrown IllegalArgumentException");
            }
            org.junit.Assert.fail("testSolverlitNum45_failAssert21_add378 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSolverlitNum16_failAssert6_add970_failAssert49() throws Exception {
        try {
            {
                ISolver s = SolverFactory.newDefault();
                int resVars = s.newVar(6);
                {
                    s.addClause(new VecInt(new int[]{ -1, -0 }));
                    s.addClause(new VecInt(new int[]{ -2, -4 }));
                    s.addClause(new VecInt(new int[]{ 1 }));
                    s.addClause(new VecInt(new int[]{ 3 }));
                    s.addAtMost(new VecInt(new int[]{ 5, 6 }), 1);
                    IConstr r = s.addAtMost(new VecInt(new int[]{ 5, 6 }), 1);
                    int[] model = s.findModel();
                    s.removeConstr(r);
                    model = s.findModel();
                }
                org.junit.Assert.fail("testSolverlitNum16 should have thrown IllegalArgumentException");
            }
            org.junit.Assert.fail("testSolverlitNum16_failAssert6_add970 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSolverlitNum8_failAssert1_add447_failAssert53() throws Exception {
        try {
            {
                ISolver s = SolverFactory.newDefault();
                int resVars = s.newVar(6);
                {
                    s.addClause(new VecInt(new int[]{ -0, -3 }));
                    s.addClause(new VecInt(new int[]{ -2, -4 }));
                    s.addClause(new VecInt(new int[]{ 1 }));
                    s.addClause(new VecInt(new int[]{ 3 }));
                    s.addAtMost(new VecInt(new int[]{ 5, 6 }), 1);
                    IConstr r = s.addAtMost(new VecInt(new int[]{ 5, 6 }), 1);
                    int[] model = s.findModel();
                    s.removeConstr(r);
                    model = s.findModel();
                }
                org.junit.Assert.fail("testSolverlitNum8 should have thrown IllegalArgumentException");
            }
            org.junit.Assert.fail("testSolverlitNum8_failAssert1_add447 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSolverlitNum39_failAssert18_add1016_failAssert63() throws Exception {
        try {
            {
                ISolver s = SolverFactory.newDefault();
                int resVars = s.newVar(6);
                {
                    s.addClause(new VecInt(new int[]{ -1, -3 }));
                    s.addClause(new VecInt(new int[]{ -2, -4 }));
                    s.addClause(new VecInt(new int[]{ 1 }));
                    s.addClause(new VecInt(new int[]{ 1 }));
                    s.addClause(new VecInt(new int[]{ 0 }));
                    IConstr r = s.addAtMost(new VecInt(new int[]{ 5, 6 }), 1);
                    int[] model = s.findModel();
                    s.removeConstr(r);
                    model = s.findModel();
                }
                org.junit.Assert.fail("testSolverlitNum39 should have thrown IllegalArgumentException");
            }
            org.junit.Assert.fail("testSolverlitNum39_failAssert18_add1016 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSolverlitNum43_failAssert19_add983_failAssert66() throws Exception {
        try {
            {
                ISolver s = SolverFactory.newDefault();
                int resVars = s.newVar(6);
                {
                    s.addClause(new VecInt(new int[]{ -1, -3 }));
                    s.addClause(new VecInt(new int[]{ -2, -4 }));
                    s.addClause(new VecInt(new int[]{ -2, -4 }));
                    s.addClause(new VecInt(new int[]{ 1 }));
                    s.addClause(new VecInt(new int[]{ 3 }));
                    IConstr r = s.addAtMost(new VecInt(new int[]{ Integer.MAX_VALUE, 6 }), 1);
                    int[] model = s.findModel();
                    s.removeConstr(r);
                    model = s.findModel();
                }
                org.junit.Assert.fail("testSolverlitNum43 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testSolverlitNum43_failAssert19_add983 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSolverlitNum45_failAssert21_add387_failAssert71() throws Exception {
        try {
            {
                ISolver s = SolverFactory.newDefault();
                int resVars = s.newVar(6);
                {
                    s.addClause(new VecInt(new int[]{ -1, -3 }));
                    s.addClause(new VecInt(new int[]{ -2, -4 }));
                    s.addClause(new VecInt(new int[]{ 1 }));
                    s.addClause(new VecInt(new int[]{ 3 }));
                    s.addClause(new VecInt(new int[]{ 3 }));
                    IConstr r = s.addAtMost(new VecInt(new int[]{ 0, 6 }), 1);
                    int[] model = s.findModel();
                    s.removeConstr(r);
                    model = s.findModel();
                }
                org.junit.Assert.fail("testSolverlitNum45 should have thrown IllegalArgumentException");
            }
            org.junit.Assert.fail("testSolverlitNum45_failAssert21_add387 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSolverlitNum3_failAssert0_add942_failAssert80() throws Exception {
        try {
            {
                ISolver s = SolverFactory.newDefault();
                int resVars = s.newVar(Integer.MAX_VALUE);
                {
                    s.addClause(new VecInt(new int[]{ -1, -3 }));
                    s.addClause(new VecInt(new int[]{ -2, -4 }));
                    s.addClause(new VecInt(new int[]{ 1 }));
                    s.addClause(new VecInt(new int[]{ 3 }));
                    s.addAtMost(new VecInt(new int[]{ 5, 6 }), 1);
                    IConstr r = s.addAtMost(new VecInt(new int[]{ 5, 6 }), 1);
                    int[] model = s.findModel();
                    s.removeConstr(r);
                    model = s.findModel();
                }
                org.junit.Assert.fail("testSolverlitNum3 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testSolverlitNum3_failAssert0_add942 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSolver_add66_failAssert25litNum511_failAssert83() throws Exception {
        try {
            {
                ISolver s = SolverFactory.newDefault();
                int resVars = s.newVar(6);
                {
                    s.addClause(new VecInt(new int[]{ -1, -3 }));
                    s.addClause(new VecInt(new int[]{ -2, -3 }));
                    s.addClause(new VecInt(new int[]{ 1 }));
                    s.addClause(new VecInt(new int[]{ 3 }));
                    IConstr r = s.addAtMost(new VecInt(new int[]{ 5, 6 }), 1);
                    int[] model = s.findModel();
                    s.removeConstr(r);
                    s.removeConstr(r);
                    model = s.findModel();
                }
                org.junit.Assert.fail("testSolver_add66 should have thrown NoSuchElementException");
            }
            org.junit.Assert.fail("testSolver_add66_failAssert25litNum511 should have thrown NoSuchElementException");
        } catch (NoSuchElementException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSolver_add66_failAssert25litNum427_failAssert85() throws Exception {
        try {
            {
                ISolver s = SolverFactory.newDefault();
                int resVars = s.newVar(0);
                {
                    s.addClause(new VecInt(new int[]{ -1, -3 }));
                    s.addClause(new VecInt(new int[]{ -2, -4 }));
                    s.addClause(new VecInt(new int[]{ 1 }));
                    s.addClause(new VecInt(new int[]{ 3 }));
                    IConstr r = s.addAtMost(new VecInt(new int[]{ 5, 6 }), 1);
                    int[] model = s.findModel();
                    s.removeConstr(r);
                    s.removeConstr(r);
                    model = s.findModel();
                }
                org.junit.Assert.fail("testSolver_add66 should have thrown NoSuchElementException");
            }
            org.junit.Assert.fail("testSolver_add66_failAssert25litNum427 should have thrown NoSuchElementException");
        } catch (NoSuchElementException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSolver_add66_failAssert25litNum601_failAssert89() throws Exception {
        try {
            {
                ISolver s = SolverFactory.newDefault();
                int resVars = s.newVar(6);
                {
                    s.addClause(new VecInt(new int[]{ -1, -3 }));
                    s.addClause(new VecInt(new int[]{ -2, -4 }));
                    s.addClause(new VecInt(new int[]{ 1 }));
                    s.addClause(new VecInt(new int[]{ 3 }));
                    IConstr r = s.addAtMost(new VecInt(new int[]{ 5, 7 }), 1);
                    int[] model = s.findModel();
                    s.removeConstr(r);
                    s.removeConstr(r);
                    model = s.findModel();
                }
                org.junit.Assert.fail("testSolver_add66 should have thrown NoSuchElementException");
            }
            org.junit.Assert.fail("testSolver_add66_failAssert25litNum601 should have thrown NoSuchElementException");
        } catch (NoSuchElementException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSolver_add66_failAssert25litNum605_failAssert94() throws Exception {
        try {
            {
                ISolver s = SolverFactory.newDefault();
                int resVars = s.newVar(6);
                {
                    s.addClause(new VecInt(new int[]{ -1, -3 }));
                    s.addClause(new VecInt(new int[]{ -2, -4 }));
                    s.addClause(new VecInt(new int[]{ 1 }));
                    s.addClause(new VecInt(new int[]{ 3 }));
                    IConstr r = s.addAtMost(new VecInt(new int[]{ 5, 5 }), 1);
                    int[] model = s.findModel();
                    s.removeConstr(r);
                    s.removeConstr(r);
                    model = s.findModel();
                }
                org.junit.Assert.fail("testSolver_add66 should have thrown NoSuchElementException");
            }
            org.junit.Assert.fail("testSolver_add66_failAssert25litNum605 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-1", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSolver_add66_failAssert25litNum462_failAssert96() throws Exception {
        try {
            {
                ISolver s = SolverFactory.newDefault();
                int resVars = s.newVar(6);
                {
                    s.addClause(new VecInt(new int[]{ -1, -2 }));
                    s.addClause(new VecInt(new int[]{ -2, -4 }));
                    s.addClause(new VecInt(new int[]{ 1 }));
                    s.addClause(new VecInt(new int[]{ 3 }));
                    IConstr r = s.addAtMost(new VecInt(new int[]{ 5, 6 }), 1);
                    int[] model = s.findModel();
                    s.removeConstr(r);
                    s.removeConstr(r);
                    model = s.findModel();
                }
                org.junit.Assert.fail("testSolver_add66 should have thrown NoSuchElementException");
            }
            org.junit.Assert.fail("testSolver_add66_failAssert25litNum462 should have thrown NoSuchElementException");
        } catch (NoSuchElementException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSolver_add66_failAssert25litNum532_failAssert97() throws Exception {
        try {
            {
                ISolver s = SolverFactory.newDefault();
                int resVars = s.newVar(6);
                {
                    s.addClause(new VecInt(new int[]{ -1, -3 }));
                    s.addClause(new VecInt(new int[]{ -2, -4 }));
                    s.addClause(new VecInt(new int[]{ 2 }));
                    s.addClause(new VecInt(new int[]{ 3 }));
                    IConstr r = s.addAtMost(new VecInt(new int[]{ 5, 6 }), 1);
                    int[] model = s.findModel();
                    s.removeConstr(r);
                    s.removeConstr(r);
                    model = s.findModel();
                }
                org.junit.Assert.fail("testSolver_add66 should have thrown NoSuchElementException");
            }
            org.junit.Assert.fail("testSolver_add66_failAssert25litNum532 should have thrown NoSuchElementException");
        } catch (NoSuchElementException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSolver_add66_failAssert25litNum507_failAssert100() throws Exception {
        try {
            {
                ISolver s = SolverFactory.newDefault();
                int resVars = s.newVar(6);
                {
                    s.addClause(new VecInt(new int[]{ -1, -3 }));
                    s.addClause(new VecInt(new int[]{ -2, -5 }));
                    s.addClause(new VecInt(new int[]{ 1 }));
                    s.addClause(new VecInt(new int[]{ 3 }));
                    IConstr r = s.addAtMost(new VecInt(new int[]{ 5, 6 }), 1);
                    int[] model = s.findModel();
                    s.removeConstr(r);
                    s.removeConstr(r);
                    model = s.findModel();
                }
                org.junit.Assert.fail("testSolver_add66 should have thrown NoSuchElementException");
            }
            org.junit.Assert.fail("testSolver_add66_failAssert25litNum507 should have thrown NoSuchElementException");
        } catch (NoSuchElementException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSolver_add66_failAssert25litNum436_failAssert103() throws Exception {
        try {
            {
                ISolver s = SolverFactory.newDefault();
                int resVars = s.newVar(6);
                {
                    s.addClause(new VecInt(new int[]{ -2, -3 }));
                    s.addClause(new VecInt(new int[]{ -2, -4 }));
                    s.addClause(new VecInt(new int[]{ 1 }));
                    s.addClause(new VecInt(new int[]{ 3 }));
                    IConstr r = s.addAtMost(new VecInt(new int[]{ 5, 6 }), 1);
                    int[] model = s.findModel();
                    s.removeConstr(r);
                    s.removeConstr(r);
                    model = s.findModel();
                }
                org.junit.Assert.fail("testSolver_add66 should have thrown NoSuchElementException");
            }
            org.junit.Assert.fail("testSolver_add66_failAssert25litNum436 should have thrown NoSuchElementException");
        } catch (NoSuchElementException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSolver_add66_failAssert25litNum483_failAssert104() throws Exception {
        try {
            {
                ISolver s = SolverFactory.newDefault();
                int resVars = s.newVar(6);
                {
                    s.addClause(new VecInt(new int[]{ -1, -3 }));
                    s.addClause(new VecInt(new int[]{ -1, -4 }));
                    s.addClause(new VecInt(new int[]{ 1 }));
                    s.addClause(new VecInt(new int[]{ 3 }));
                    IConstr r = s.addAtMost(new VecInt(new int[]{ 5, 6 }), 1);
                    int[] model = s.findModel();
                    s.removeConstr(r);
                    s.removeConstr(r);
                    model = s.findModel();
                }
                org.junit.Assert.fail("testSolver_add66 should have thrown NoSuchElementException");
            }
            org.junit.Assert.fail("testSolver_add66_failAssert25litNum483 should have thrown NoSuchElementException");
        } catch (NoSuchElementException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSolver_add66_failAssert25litNum582_failAssert106() throws Exception {
        try {
            {
                ISolver s = SolverFactory.newDefault();
                int resVars = s.newVar(6);
                {
                    s.addClause(new VecInt(new int[]{ -1, -3 }));
                    s.addClause(new VecInt(new int[]{ -2, -4 }));
                    s.addClause(new VecInt(new int[]{ 1 }));
                    s.addClause(new VecInt(new int[]{ 3 }));
                    IConstr r = s.addAtMost(new VecInt(new int[]{ 4, 6 }), 1);
                    int[] model = s.findModel();
                    s.removeConstr(r);
                    s.removeConstr(r);
                    model = s.findModel();
                }
                org.junit.Assert.fail("testSolver_add66 should have thrown NoSuchElementException");
            }
            org.junit.Assert.fail("testSolver_add66_failAssert25litNum582 should have thrown NoSuchElementException");
        } catch (NoSuchElementException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSolver_add66_failAssert25litNum625_failAssert107() throws Exception {
        try {
            {
                ISolver s = SolverFactory.newDefault();
                int resVars = s.newVar(6);
                {
                    s.addClause(new VecInt(new int[]{ -1, -3 }));
                    s.addClause(new VecInt(new int[]{ -2, -4 }));
                    s.addClause(new VecInt(new int[]{ 1 }));
                    s.addClause(new VecInt(new int[]{ 3 }));
                    IConstr r = s.addAtMost(new VecInt(new int[]{ 5, 6 }), 2);
                    int[] model = s.findModel();
                    s.removeConstr(r);
                    s.removeConstr(r);
                    model = s.findModel();
                }
                org.junit.Assert.fail("testSolver_add66 should have thrown NoSuchElementException");
            }
            org.junit.Assert.fail("testSolver_add66_failAssert25litNum625 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-1", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSolver_add66_failAssert25litNum457_failAssert110() throws Exception {
        try {
            {
                ISolver s = SolverFactory.newDefault();
                int resVars = s.newVar(6);
                {
                    s.addClause(new VecInt(new int[]{ -1, -4 }));
                    s.addClause(new VecInt(new int[]{ -2, -4 }));
                    s.addClause(new VecInt(new int[]{ 1 }));
                    s.addClause(new VecInt(new int[]{ 3 }));
                    IConstr r = s.addAtMost(new VecInt(new int[]{ 5, 6 }), 1);
                    int[] model = s.findModel();
                    s.removeConstr(r);
                    s.removeConstr(r);
                    model = s.findModel();
                }
                org.junit.Assert.fail("testSolver_add66 should have thrown NoSuchElementException");
            }
            org.junit.Assert.fail("testSolver_add66_failAssert25litNum457 should have thrown NoSuchElementException");
        } catch (NoSuchElementException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSolverlitNum43_failAssert19_add988_failAssert116() throws Exception {
        try {
            {
                ISolver s = SolverFactory.newDefault();
                int resVars = s.newVar(6);
                {
                    s.addClause(new VecInt(new int[]{ -1, -3 }));
                    s.addClause(new VecInt(new int[]{ -2, -4 }));
                    s.addClause(new VecInt(new int[]{ 1 }));
                    s.addClause(new VecInt(new int[]{ 3 }));
                    s.addClause(new VecInt(new int[]{ 3 }));
                    IConstr r = s.addAtMost(new VecInt(new int[]{ Integer.MAX_VALUE, 6 }), 1);
                    int[] model = s.findModel();
                    s.removeConstr(r);
                    model = s.findModel();
                }
                org.junit.Assert.fail("testSolverlitNum43 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testSolverlitNum43_failAssert19_add988 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSolverlitNum37_failAssert16_add693_failAssert117() throws Exception {
        try {
            {
                ISolver s = SolverFactory.newDefault();
                int resVars = s.newVar(6);
                {
                    s.addClause(new VecInt(new int[]{ -1, -3 }));
                    s.addClause(new VecInt(new int[]{ -2, -4 }));
                    s.addClause(new VecInt(new int[]{ 1 }));
                    s.addClause(new VecInt(new int[]{ 1 }));
                    s.addClause(new VecInt(new int[]{ Integer.MAX_VALUE }));
                    IConstr r = s.addAtMost(new VecInt(new int[]{ 5, 6 }), 1);
                    int[] model = s.findModel();
                    s.removeConstr(r);
                    model = s.findModel();
                }
                org.junit.Assert.fail("testSolverlitNum37 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testSolverlitNum37_failAssert16_add693 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSolver_add66_failAssert25litNum642_failAssert124() throws Exception {
        try {
            {
                ISolver s = SolverFactory.newDefault();
                int resVars = s.newVar(6);
                {
                    s.addClause(new VecInt(new int[]{ -1, -3 }));
                    s.addClause(new VecInt(new int[]{ -2, -4 }));
                    s.addClause(new VecInt(new int[]{ 1 }));
                    s.addClause(new VecInt(new int[]{ 3 }));
                    IConstr r = s.addAtMost(new VecInt(new int[]{ 5, 6 }), 404048116);
                    int[] model = s.findModel();
                    s.removeConstr(r);
                    s.removeConstr(r);
                    model = s.findModel();
                }
                org.junit.Assert.fail("testSolver_add66 should have thrown NoSuchElementException");
            }
            org.junit.Assert.fail("testSolver_add66_failAssert25litNum642 should have thrown NoSuchElementException");
        } catch (NoSuchElementException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSolver_add66_failAssert25litNum622_failAssert125() throws Exception {
        try {
            {
                ISolver s = SolverFactory.newDefault();
                int resVars = s.newVar(6);
                {
                    s.addClause(new VecInt(new int[]{ -1, -3 }));
                    s.addClause(new VecInt(new int[]{ -2, -4 }));
                    s.addClause(new VecInt(new int[]{ 1 }));
                    s.addClause(new VecInt(new int[]{ 3 }));
                    IConstr r = s.addAtMost(new VecInt(new int[]{ 5, -94969102 }), 1);
                    int[] model = s.findModel();
                    s.removeConstr(r);
                    s.removeConstr(r);
                    model = s.findModel();
                }
                org.junit.Assert.fail("testSolver_add66 should have thrown NoSuchElementException");
            }
            org.junit.Assert.fail("testSolver_add66_failAssert25litNum622 should have thrown NoSuchElementException");
        } catch (NoSuchElementException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSolver_add66_failAssert25_add661_failAssert140() throws Exception {
        try {
            {
                ISolver s = SolverFactory.newDefault();
                s.newVar(6);
                int resVars = s.newVar(6);
                {
                    s.addClause(new VecInt(new int[]{ -1, -3 }));
                    s.addClause(new VecInt(new int[]{ -2, -4 }));
                    s.addClause(new VecInt(new int[]{ 1 }));
                    s.addClause(new VecInt(new int[]{ 3 }));
                    IConstr r = s.addAtMost(new VecInt(new int[]{ 5, 6 }), 1);
                    int[] model = s.findModel();
                    s.removeConstr(r);
                    s.removeConstr(r);
                    model = s.findModel();
                }
                org.junit.Assert.fail("testSolver_add66 should have thrown NoSuchElementException");
            }
            org.junit.Assert.fail("testSolver_add66_failAssert25_add661 should have thrown NoSuchElementException");
        } catch (NoSuchElementException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSolver_add66_failAssert25_add687_failAssert144() throws Exception {
        try {
            {
                ISolver s = SolverFactory.newDefault();
                int resVars = s.newVar(6);
                {
                    s.addClause(new VecInt(new int[]{ -1, -3 }));
                    s.addClause(new VecInt(new int[]{ -2, -4 }));
                    s.addClause(new VecInt(new int[]{ 1 }));
                    s.addClause(new VecInt(new int[]{ 3 }));
                    IConstr r = s.addAtMost(new VecInt(new int[]{ 5, 6 }), 1);
                    s.findModel();
                    int[] model = s.findModel();
                    s.removeConstr(r);
                    s.removeConstr(r);
                    model = s.findModel();
                }
                org.junit.Assert.fail("testSolver_add66 should have thrown NoSuchElementException");
            }
            org.junit.Assert.fail("testSolver_add66_failAssert25_add687 should have thrown NoSuchElementException");
        } catch (NoSuchElementException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSolverlitNum3_failAssert0litNum898_failAssert169() throws Exception {
        try {
            {
                ISolver s = SolverFactory.newDefault();
                int resVars = s.newVar(Integer.MAX_VALUE);
                {
                    s.addClause(new VecInt(new int[]{ -1, -3 }));
                    s.addClause(new VecInt(new int[]{ -2, -4 }));
                    s.addClause(new VecInt(new int[]{ 1 }));
                    s.addClause(new VecInt(new int[]{ 3 }));
                    IConstr r = s.addAtMost(new VecInt(new int[]{ 5, 5 }), 1);
                    int[] model = s.findModel();
                    s.removeConstr(r);
                    model = s.findModel();
                }
                org.junit.Assert.fail("testSolverlitNum3 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testSolverlitNum3_failAssert0litNum898 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSolverlitNum9_failAssert2litNum490_failAssert174() throws Exception {
        try {
            {
                ISolver s = SolverFactory.newDefault();
                int resVars = s.newVar(0);
                {
                    s.addClause(new VecInt(new int[]{ -(Integer.MAX_VALUE), -3 }));
                    s.addClause(new VecInt(new int[]{ -2, -4 }));
                    s.addClause(new VecInt(new int[]{ 1 }));
                    s.addClause(new VecInt(new int[]{ 3 }));
                    IConstr r = s.addAtMost(new VecInt(new int[]{ 5, 6 }), 1);
                    int[] model = s.findModel();
                    s.removeConstr(r);
                    model = s.findModel();
                }
                org.junit.Assert.fail("testSolverlitNum9 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testSolverlitNum9_failAssert2litNum490 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSolverlitNum32_failAssert14litNum245_failAssert196() throws Exception {
        try {
            {
                ISolver s = SolverFactory.newDefault();
                int resVars = s.newVar(0);
                {
                    s.addClause(new VecInt(new int[]{ -1, -3 }));
                    s.addClause(new VecInt(new int[]{ -2, -4 }));
                    s.addClause(new VecInt(new int[]{ Integer.MAX_VALUE }));
                    s.addClause(new VecInt(new int[]{ 3 }));
                    IConstr r = s.addAtMost(new VecInt(new int[]{ 5, 6 }), 1);
                    int[] model = s.findModel();
                    s.removeConstr(r);
                    model = s.findModel();
                }
                org.junit.Assert.fail("testSolverlitNum32 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testSolverlitNum32_failAssert14litNum245 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSolverlitNum43_failAssert19litNum724_failAssert213() throws Exception {
        try {
            {
                ISolver s = SolverFactory.newDefault();
                int resVars = s.newVar(0);
                {
                    s.addClause(new VecInt(new int[]{ -1, -3 }));
                    s.addClause(new VecInt(new int[]{ -2, -4 }));
                    s.addClause(new VecInt(new int[]{ 1 }));
                    s.addClause(new VecInt(new int[]{ 3 }));
                    IConstr r = s.addAtMost(new VecInt(new int[]{ Integer.MAX_VALUE, 6 }), 1);
                    int[] model = s.findModel();
                    s.removeConstr(r);
                    model = s.findModel();
                }
                org.junit.Assert.fail("testSolverlitNum43 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testSolverlitNum43_failAssert19litNum724 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSolverlitNum10_failAssert3_add595_failAssert26_add3275_failAssert219() throws Exception {
        try {
            {
                {
                    ISolver s = SolverFactory.newDefault();
                    int resVars = s.newVar(6);
                    {
                        s.addClause(new VecInt(new int[]{ -(Integer.MIN_VALUE), -3 }));
                        s.addClause(new VecInt(new int[]{ -(Integer.MIN_VALUE), -3 }));
                        s.addClause(new VecInt(new int[]{ -(Integer.MIN_VALUE), -3 }));
                        s.addClause(new VecInt(new int[]{ -2, -4 }));
                        s.addClause(new VecInt(new int[]{ 1 }));
                        s.addClause(new VecInt(new int[]{ 3 }));
                        IConstr r = s.addAtMost(new VecInt(new int[]{ 5, 6 }), 1);
                        int[] model = s.findModel();
                        s.removeConstr(r);
                        model = s.findModel();
                    }
                    org.junit.Assert.fail("testSolverlitNum10 should have thrown ArrayIndexOutOfBoundsException");
                }
                org.junit.Assert.fail("testSolverlitNum10_failAssert3_add595 should have thrown ArrayIndexOutOfBoundsException");
            }
            org.junit.Assert.fail("testSolverlitNum10_failAssert3_add595_failAssert26_add3275 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-2147483648", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSolverlitNum14_failAssert4_add388_failAssert27_add3424_failAssert221() throws Exception {
        try {
            {
                {
                    ISolver s = SolverFactory.newDefault();
                    int resVars = s.newVar(6);
                    {
                        s.addClause(new VecInt(new int[]{ -1, -(Integer.MAX_VALUE) }));
                        s.addClause(new VecInt(new int[]{ -1, -(Integer.MAX_VALUE) }));
                        s.addClause(new VecInt(new int[]{ -1, -(Integer.MAX_VALUE) }));
                        s.addClause(new VecInt(new int[]{ -2, -4 }));
                        s.addClause(new VecInt(new int[]{ 1 }));
                        s.addClause(new VecInt(new int[]{ 3 }));
                        IConstr r = s.addAtMost(new VecInt(new int[]{ 5, 6 }), 1);
                        int[] model = s.findModel();
                        s.removeConstr(r);
                        model = s.findModel();
                    }
                    org.junit.Assert.fail("testSolverlitNum14 should have thrown NegativeArraySizeException");
                }
                org.junit.Assert.fail("testSolverlitNum14_failAssert4_add388 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testSolverlitNum14_failAssert4_add388_failAssert27_add3424 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSolverlitNum20_failAssert7_add801_failAssert28_add3189_failAssert223() throws Exception {
        try {
            {
                {
                    ISolver s = SolverFactory.newDefault();
                    int resVars = s.newVar(6);
                    {
                        s.addClause(new VecInt(new int[]{ -1, -3 }));
                        s.addClause(new VecInt(new int[]{ -(Integer.MAX_VALUE), -4 }));
                        s.addClause(new VecInt(new int[]{ -(Integer.MAX_VALUE), -4 }));
                        s.addClause(new VecInt(new int[]{ -(Integer.MAX_VALUE), -4 }));
                        s.addClause(new VecInt(new int[]{ 1 }));
                        s.addClause(new VecInt(new int[]{ 3 }));
                        IConstr r = s.addAtMost(new VecInt(new int[]{ 5, 6 }), 1);
                        int[] model = s.findModel();
                        s.removeConstr(r);
                        model = s.findModel();
                    }
                    org.junit.Assert.fail("testSolverlitNum20 should have thrown NegativeArraySizeException");
                }
                org.junit.Assert.fail("testSolverlitNum20_failAssert7_add801 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testSolverlitNum20_failAssert7_add801_failAssert28_add3189 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSolverlitNum43_failAssert19_add991_failAssert29_add3392_failAssert225() throws Exception {
        try {
            {
                {
                    ISolver s = SolverFactory.newDefault();
                    int resVars = s.newVar(6);
                    {
                        s.addClause(new VecInt(new int[]{ -1, -3 }));
                        s.addClause(new VecInt(new int[]{ -2, -4 }));
                        s.addClause(new VecInt(new int[]{ 1 }));
                        s.addClause(new VecInt(new int[]{ 3 }));
                        s.addAtMost(new VecInt(new int[]{ Integer.MAX_VALUE, 6 }), 1);
                        s.addAtMost(new VecInt(new int[]{ Integer.MAX_VALUE, 6 }), 1);
                        IConstr r = s.addAtMost(new VecInt(new int[]{ Integer.MAX_VALUE, 6 }), 1);
                        int[] model = s.findModel();
                        s.removeConstr(r);
                        model = s.findModel();
                    }
                    org.junit.Assert.fail("testSolverlitNum43 should have thrown NegativeArraySizeException");
                }
                org.junit.Assert.fail("testSolverlitNum43_failAssert19_add991 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testSolverlitNum43_failAssert19_add991_failAssert29_add3392 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSolverlitNum9_failAssert2_add708_failAssert30_add3482_failAssert227() throws Exception {
        try {
            {
                {
                    ISolver s = SolverFactory.newDefault();
                    int resVars = s.newVar(6);
                    {
                        s.addClause(new VecInt(new int[]{ -(Integer.MAX_VALUE), -3 }));
                        s.addClause(new VecInt(new int[]{ -(Integer.MAX_VALUE), -3 }));
                        s.addClause(new VecInt(new int[]{ -(Integer.MAX_VALUE), -3 }));
                        s.addClause(new VecInt(new int[]{ -2, -4 }));
                        s.addClause(new VecInt(new int[]{ 1 }));
                        s.addClause(new VecInt(new int[]{ 3 }));
                        IConstr r = s.addAtMost(new VecInt(new int[]{ 5, 6 }), 1);
                        int[] model = s.findModel();
                        s.removeConstr(r);
                        model = s.findModel();
                    }
                    org.junit.Assert.fail("testSolverlitNum9 should have thrown NegativeArraySizeException");
                }
                org.junit.Assert.fail("testSolverlitNum9_failAssert2_add708 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testSolverlitNum9_failAssert2_add708_failAssert30_add3482 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSolverlitNum37_failAssert16_add696_failAssert31_add2338_failAssert229() throws Exception {
        try {
            {
                {
                    ISolver s = SolverFactory.newDefault();
                    int resVars = s.newVar(6);
                    {
                        s.addClause(new VecInt(new int[]{ -1, -3 }));
                        s.addClause(new VecInt(new int[]{ -2, -4 }));
                        s.addClause(new VecInt(new int[]{ 1 }));
                        s.addClause(new VecInt(new int[]{ Integer.MAX_VALUE }));
                        s.addClause(new VecInt(new int[]{ Integer.MAX_VALUE }));
                        s.addClause(new VecInt(new int[]{ Integer.MAX_VALUE }));
                        IConstr r = s.addAtMost(new VecInt(new int[]{ 5, 6 }), 1);
                        int[] model = s.findModel();
                        s.removeConstr(r);
                        model = s.findModel();
                    }
                    org.junit.Assert.fail("testSolverlitNum37 should have thrown NegativeArraySizeException");
                }
                org.junit.Assert.fail("testSolverlitNum37_failAssert16_add696 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testSolverlitNum37_failAssert16_add696_failAssert31_add2338 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSolverlitNum32_failAssert14_add432_failAssert32_add2587_failAssert231() throws Exception {
        try {
            {
                {
                    ISolver s = SolverFactory.newDefault();
                    int resVars = s.newVar(6);
                    {
                        s.addClause(new VecInt(new int[]{ -1, -3 }));
                        s.addClause(new VecInt(new int[]{ -2, -4 }));
                        s.addClause(new VecInt(new int[]{ Integer.MAX_VALUE }));
                        s.addClause(new VecInt(new int[]{ Integer.MAX_VALUE }));
                        s.addClause(new VecInt(new int[]{ Integer.MAX_VALUE }));
                        s.addClause(new VecInt(new int[]{ 3 }));
                        IConstr r = s.addAtMost(new VecInt(new int[]{ 5, 6 }), 1);
                        int[] model = s.findModel();
                        s.removeConstr(r);
                        model = s.findModel();
                    }
                    org.junit.Assert.fail("testSolverlitNum32 should have thrown NegativeArraySizeException");
                }
                org.junit.Assert.fail("testSolverlitNum32_failAssert14_add432 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testSolverlitNum32_failAssert14_add432_failAssert32_add2587 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSolverlitNum43_failAssert19_add983_failAssert66_add2853_failAssert241() throws Exception {
        try {
            {
                {
                    ISolver s = SolverFactory.newDefault();
                    int resVars = s.newVar(6);
                    {
                        s.addClause(new VecInt(new int[]{ -1, -3 }));
                        s.addClause(new VecInt(new int[]{ -2, -4 }));
                        s.addClause(new VecInt(new int[]{ -2, -4 }));
                        s.addClause(new VecInt(new int[]{ 1 }));
                        s.addClause(new VecInt(new int[]{ 3 }));
                        s.addAtMost(new VecInt(new int[]{ Integer.MAX_VALUE, 6 }), 1);
                        IConstr r = s.addAtMost(new VecInt(new int[]{ Integer.MAX_VALUE, 6 }), 1);
                        int[] model = s.findModel();
                        s.removeConstr(r);
                        model = s.findModel();
                    }
                    org.junit.Assert.fail("testSolverlitNum43 should have thrown NegativeArraySizeException");
                }
                org.junit.Assert.fail("testSolverlitNum43_failAssert19_add983 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testSolverlitNum43_failAssert19_add983_failAssert66_add2853 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSolverlitNum43_failAssert19_add988_failAssert116_add3115_failAssert247() throws Exception {
        try {
            {
                {
                    ISolver s = SolverFactory.newDefault();
                    int resVars = s.newVar(6);
                    {
                        s.addClause(new VecInt(new int[]{ -1, -3 }));
                        s.addClause(new VecInt(new int[]{ -2, -4 }));
                        s.addClause(new VecInt(new int[]{ 1 }));
                        s.addClause(new VecInt(new int[]{ 3 }));
                        s.addClause(new VecInt(new int[]{ 3 }));
                        s.addAtMost(new VecInt(new int[]{ Integer.MAX_VALUE, 6 }), 1);
                        IConstr r = s.addAtMost(new VecInt(new int[]{ Integer.MAX_VALUE, 6 }), 1);
                        int[] model = s.findModel();
                        s.removeConstr(r);
                        model = s.findModel();
                    }
                    org.junit.Assert.fail("testSolverlitNum43 should have thrown NegativeArraySizeException");
                }
                org.junit.Assert.fail("testSolverlitNum43_failAssert19_add988 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testSolverlitNum43_failAssert19_add988_failAssert116_add3115 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSolverlitNum37_failAssert16_add693_failAssert117_add3304_failAssert262() throws Exception {
        try {
            {
                {
                    ISolver s = SolverFactory.newDefault();
                    int resVars = s.newVar(6);
                    {
                        s.addClause(new VecInt(new int[]{ -1, -3 }));
                        s.addClause(new VecInt(new int[]{ -2, -4 }));
                        s.addClause(new VecInt(new int[]{ 1 }));
                        s.addClause(new VecInt(new int[]{ 1 }));
                        s.addClause(new VecInt(new int[]{ Integer.MAX_VALUE }));
                        s.addClause(new VecInt(new int[]{ Integer.MAX_VALUE }));
                        IConstr r = s.addAtMost(new VecInt(new int[]{ 5, 6 }), 1);
                        int[] model = s.findModel();
                        s.removeConstr(r);
                        model = s.findModel();
                    }
                    org.junit.Assert.fail("testSolverlitNum37 should have thrown NegativeArraySizeException");
                }
                org.junit.Assert.fail("testSolverlitNum37_failAssert16_add693 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testSolverlitNum37_failAssert16_add693_failAssert117_add3304 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSolver_add66_failAssert25litNum511_failAssert83litNum2600_failAssert268() throws Exception {
        try {
            {
                {
                    ISolver s = SolverFactory.newDefault();
                    int resVars = s.newVar(6);
                    {
                        s.addClause(new VecInt(new int[]{ -1, -3 }));
                        s.addClause(new VecInt(new int[]{ -2, -3 }));
                        s.addClause(new VecInt(new int[]{ 1 }));
                        s.addClause(new VecInt(new int[]{ 3 }));
                        IConstr r = s.addAtMost(new VecInt(new int[]{ 5, 6 }), 0);
                        int[] model = s.findModel();
                        s.removeConstr(r);
                        s.removeConstr(r);
                        model = s.findModel();
                    }
                    org.junit.Assert.fail("testSolver_add66 should have thrown NoSuchElementException");
                }
                org.junit.Assert.fail("testSolver_add66_failAssert25litNum511 should have thrown NoSuchElementException");
            }
            org.junit.Assert.fail("testSolver_add66_failAssert25litNum511_failAssert83litNum2600 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-1", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSolver_add66_failAssert25litNum511_failAssert83litNum2502_failAssert269() throws Exception {
        try {
            {
                {
                    ISolver s = SolverFactory.newDefault();
                    int resVars = s.newVar(6);
                    {
                        s.addClause(new VecInt(new int[]{ -1, -3 }));
                        s.addClause(new VecInt(new int[]{ -3, -3 }));
                        s.addClause(new VecInt(new int[]{ 1 }));
                        s.addClause(new VecInt(new int[]{ 3 }));
                        IConstr r = s.addAtMost(new VecInt(new int[]{ 5, 6 }), 1);
                        int[] model = s.findModel();
                        s.removeConstr(r);
                        s.removeConstr(r);
                        model = s.findModel();
                    }
                    org.junit.Assert.fail("testSolver_add66 should have thrown NoSuchElementException");
                }
                org.junit.Assert.fail("testSolver_add66_failAssert25litNum511 should have thrown NoSuchElementException");
            }
            org.junit.Assert.fail("testSolver_add66_failAssert25litNum511_failAssert83litNum2502 should have thrown ContradictionException");
        } catch (ContradictionException expected) {
            Assert.assertEquals("Creating Empty clause ?", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSolver_add66_failAssert25litNum511_failAssert83litNum2520_failAssert270() throws Exception {
        try {
            {
                {
                    ISolver s = SolverFactory.newDefault();
                    int resVars = s.newVar(6);
                    {
                        s.addClause(new VecInt(new int[]{ -1, -3 }));
                        s.addClause(new VecInt(new int[]{ -2, -3 }));
                        s.addClause(new VecInt(new int[]{ 2 }));
                        s.addClause(new VecInt(new int[]{ 3 }));
                        IConstr r = s.addAtMost(new VecInt(new int[]{ 5, 6 }), 1);
                        int[] model = s.findModel();
                        s.removeConstr(r);
                        s.removeConstr(r);
                        model = s.findModel();
                    }
                    org.junit.Assert.fail("testSolver_add66 should have thrown NoSuchElementException");
                }
                org.junit.Assert.fail("testSolver_add66_failAssert25litNum511 should have thrown NoSuchElementException");
            }
            org.junit.Assert.fail("testSolver_add66_failAssert25litNum511_failAssert83litNum2520 should have thrown NoSuchElementException");
        } catch (NoSuchElementException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSolver_add66_failAssert25litNum511_failAssert83litNum2581_failAssert271() throws Exception {
        try {
            {
                {
                    ISolver s = SolverFactory.newDefault();
                    int resVars = s.newVar(6);
                    {
                        s.addClause(new VecInt(new int[]{ -1, -3 }));
                        s.addClause(new VecInt(new int[]{ -2, -3 }));
                        s.addClause(new VecInt(new int[]{ 1 }));
                        s.addClause(new VecInt(new int[]{ 3 }));
                        IConstr r = s.addAtMost(new VecInt(new int[]{ 5, 0 }), 1);
                        int[] model = s.findModel();
                        s.removeConstr(r);
                        s.removeConstr(r);
                        model = s.findModel();
                    }
                    org.junit.Assert.fail("testSolver_add66 should have thrown NoSuchElementException");
                }
                org.junit.Assert.fail("testSolver_add66_failAssert25litNum511 should have thrown NoSuchElementException");
            }
            org.junit.Assert.fail("testSolver_add66_failAssert25litNum511_failAssert83litNum2581 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSolver_add66_failAssert25litNum511_failAssert83litNum2523_failAssert272() throws Exception {
        try {
            {
                {
                    ISolver s = SolverFactory.newDefault();
                    int resVars = s.newVar(6);
                    {
                        s.addClause(new VecInt(new int[]{ -1, -3 }));
                        s.addClause(new VecInt(new int[]{ -2, -3 }));
                        s.addClause(new VecInt(new int[]{ 0 }));
                        s.addClause(new VecInt(new int[]{ 3 }));
                        IConstr r = s.addAtMost(new VecInt(new int[]{ 5, 6 }), 1);
                        int[] model = s.findModel();
                        s.removeConstr(r);
                        s.removeConstr(r);
                        model = s.findModel();
                    }
                    org.junit.Assert.fail("testSolver_add66 should have thrown NoSuchElementException");
                }
                org.junit.Assert.fail("testSolver_add66_failAssert25litNum511 should have thrown NoSuchElementException");
            }
            org.junit.Assert.fail("testSolver_add66_failAssert25litNum511_failAssert83litNum2523 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSolver_add66_failAssert25litNum511_failAssert83litNum2552_failAssert273() throws Exception {
        try {
            {
                {
                    ISolver s = SolverFactory.newDefault();
                    int resVars = s.newVar(6);
                    {
                        s.addClause(new VecInt(new int[]{ -1, -3 }));
                        s.addClause(new VecInt(new int[]{ -2, -3 }));
                        s.addClause(new VecInt(new int[]{ 1 }));
                        s.addClause(new VecInt(new int[]{ 0 }));
                        IConstr r = s.addAtMost(new VecInt(new int[]{ 5, 6 }), 1);
                        int[] model = s.findModel();
                        s.removeConstr(r);
                        s.removeConstr(r);
                        model = s.findModel();
                    }
                    org.junit.Assert.fail("testSolver_add66 should have thrown NoSuchElementException");
                }
                org.junit.Assert.fail("testSolver_add66_failAssert25litNum511 should have thrown NoSuchElementException");
            }
            org.junit.Assert.fail("testSolver_add66_failAssert25litNum511_failAssert83litNum2552 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSolver_add66_failAssert25litNum511_failAssert83litNum2506_failAssert274() throws Exception {
        try {
            {
                {
                    ISolver s = SolverFactory.newDefault();
                    int resVars = s.newVar(6);
                    {
                        s.addClause(new VecInt(new int[]{ -1, -3 }));
                        s.addClause(new VecInt(new int[]{ -1, -3 }));
                        s.addClause(new VecInt(new int[]{ 1 }));
                        s.addClause(new VecInt(new int[]{ 3 }));
                        IConstr r = s.addAtMost(new VecInt(new int[]{ 5, 6 }), 1);
                        int[] model = s.findModel();
                        s.removeConstr(r);
                        s.removeConstr(r);
                        model = s.findModel();
                    }
                    org.junit.Assert.fail("testSolver_add66 should have thrown NoSuchElementException");
                }
                org.junit.Assert.fail("testSolver_add66_failAssert25litNum511 should have thrown NoSuchElementException");
            }
            org.junit.Assert.fail("testSolver_add66_failAssert25litNum511_failAssert83litNum2506 should have thrown NoSuchElementException");
        } catch (NoSuchElementException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSolver_add66_failAssert25litNum511_failAssert83litNum2516_failAssert275() throws Exception {
        try {
            {
                {
                    ISolver s = SolverFactory.newDefault();
                    int resVars = s.newVar(6);
                    {
                        s.addClause(new VecInt(new int[]{ -1, -3 }));
                        s.addClause(new VecInt(new int[]{ -0, -3 }));
                        s.addClause(new VecInt(new int[]{ 1 }));
                        s.addClause(new VecInt(new int[]{ 3 }));
                        IConstr r = s.addAtMost(new VecInt(new int[]{ 5, 6 }), 1);
                        int[] model = s.findModel();
                        s.removeConstr(r);
                        s.removeConstr(r);
                        model = s.findModel();
                    }
                    org.junit.Assert.fail("testSolver_add66 should have thrown NoSuchElementException");
                }
                org.junit.Assert.fail("testSolver_add66_failAssert25litNum511 should have thrown NoSuchElementException");
            }
            org.junit.Assert.fail("testSolver_add66_failAssert25litNum511_failAssert83litNum2516 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSolver_add66_failAssert25litNum511_failAssert83litNum2542_failAssert276() throws Exception {
        try {
            {
                {
                    ISolver s = SolverFactory.newDefault();
                    int resVars = s.newVar(6);
                    {
                        s.addClause(new VecInt(new int[]{ -1, -3 }));
                        s.addClause(new VecInt(new int[]{ -2, -3 }));
                        s.addClause(new VecInt(new int[]{ 1 }));
                        s.addClause(new VecInt(new int[]{ 2 }));
                        IConstr r = s.addAtMost(new VecInt(new int[]{ 5, 6 }), 1);
                        int[] model = s.findModel();
                        s.removeConstr(r);
                        s.removeConstr(r);
                        model = s.findModel();
                    }
                    org.junit.Assert.fail("testSolver_add66 should have thrown NoSuchElementException");
                }
                org.junit.Assert.fail("testSolver_add66_failAssert25litNum511 should have thrown NoSuchElementException");
            }
            org.junit.Assert.fail("testSolver_add66_failAssert25litNum511_failAssert83litNum2542 should have thrown NoSuchElementException");
        } catch (NoSuchElementException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSolver_add66_failAssert25litNum511_failAssert83litNum2570_failAssert279() throws Exception {
        try {
            {
                {
                    ISolver s = SolverFactory.newDefault();
                    int resVars = s.newVar(6);
                    {
                        s.addClause(new VecInt(new int[]{ -1, -3 }));
                        s.addClause(new VecInt(new int[]{ -2, -3 }));
                        s.addClause(new VecInt(new int[]{ 1 }));
                        s.addClause(new VecInt(new int[]{ 3 }));
                        IConstr r = s.addAtMost(new VecInt(new int[]{ 5, 7 }), 1);
                        int[] model = s.findModel();
                        s.removeConstr(r);
                        s.removeConstr(r);
                        model = s.findModel();
                    }
                    org.junit.Assert.fail("testSolver_add66 should have thrown NoSuchElementException");
                }
                org.junit.Assert.fail("testSolver_add66_failAssert25litNum511 should have thrown NoSuchElementException");
            }
            org.junit.Assert.fail("testSolver_add66_failAssert25litNum511_failAssert83litNum2570 should have thrown NoSuchElementException");
        } catch (NoSuchElementException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSolver_add66_failAssert25litNum601_failAssert89litNum2024_failAssert281() throws Exception {
        try {
            {
                {
                    ISolver s = SolverFactory.newDefault();
                    int resVars = s.newVar(6);
                    {
                        s.addClause(new VecInt(new int[]{ -1, -3 }));
                        s.addClause(new VecInt(new int[]{ -2, -4 }));
                        s.addClause(new VecInt(new int[]{ 1 }));
                        s.addClause(new VecInt(new int[]{ 3 }));
                        IConstr r = s.addAtMost(new VecInt(new int[]{ 5, 7 }), 2);
                        int[] model = s.findModel();
                        s.removeConstr(r);
                        s.removeConstr(r);
                        model = s.findModel();
                    }
                    org.junit.Assert.fail("testSolver_add66 should have thrown NoSuchElementException");
                }
                org.junit.Assert.fail("testSolver_add66_failAssert25litNum601 should have thrown NoSuchElementException");
            }
            org.junit.Assert.fail("testSolver_add66_failAssert25litNum601_failAssert89litNum2024 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-1", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSolver_add66_failAssert25litNum427_failAssert85litNum2814_failAssert282() throws Exception {
        try {
            {
                {
                    ISolver s = SolverFactory.newDefault();
                    int resVars = s.newVar(0);
                    {
                        s.addClause(new VecInt(new int[]{ -1, -3 }));
                        s.addClause(new VecInt(new int[]{ -2, -4 }));
                        s.addClause(new VecInt(new int[]{ 1 }));
                        s.addClause(new VecInt(new int[]{ 3 }));
                        IConstr r = s.addAtMost(new VecInt(new int[]{ 5, 0 }), 1);
                        int[] model = s.findModel();
                        s.removeConstr(r);
                        s.removeConstr(r);
                        model = s.findModel();
                    }
                    org.junit.Assert.fail("testSolver_add66 should have thrown NoSuchElementException");
                }
                org.junit.Assert.fail("testSolver_add66_failAssert25litNum427 should have thrown NoSuchElementException");
            }
            org.junit.Assert.fail("testSolver_add66_failAssert25litNum427_failAssert85litNum2814 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSolver_add66_failAssert25litNum601_failAssert89litNum2027_failAssert283() throws Exception {
        try {
            {
                {
                    ISolver s = SolverFactory.newDefault();
                    int resVars = s.newVar(6);
                    {
                        s.addClause(new VecInt(new int[]{ -1, -3 }));
                        s.addClause(new VecInt(new int[]{ -2, -4 }));
                        s.addClause(new VecInt(new int[]{ 1 }));
                        s.addClause(new VecInt(new int[]{ 3 }));
                        IConstr r = s.addAtMost(new VecInt(new int[]{ 5, 7 }), 0);
                        int[] model = s.findModel();
                        s.removeConstr(r);
                        s.removeConstr(r);
                        model = s.findModel();
                    }
                    org.junit.Assert.fail("testSolver_add66 should have thrown NoSuchElementException");
                }
                org.junit.Assert.fail("testSolver_add66_failAssert25litNum601 should have thrown NoSuchElementException");
            }
            org.junit.Assert.fail("testSolver_add66_failAssert25litNum601_failAssert89litNum2027 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-1", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSolver_add66_failAssert25litNum511_failAssert83litNum2539_failAssert286() throws Exception {
        try {
            {
                {
                    ISolver s = SolverFactory.newDefault();
                    int resVars = s.newVar(6);
                    {
                        s.addClause(new VecInt(new int[]{ -1, -3 }));
                        s.addClause(new VecInt(new int[]{ -2, -3 }));
                        s.addClause(new VecInt(new int[]{ 1 }));
                        s.addClause(new VecInt(new int[]{ 4 }));
                        IConstr r = s.addAtMost(new VecInt(new int[]{ 5, 6 }), 1);
                        int[] model = s.findModel();
                        s.removeConstr(r);
                        s.removeConstr(r);
                        model = s.findModel();
                    }
                    org.junit.Assert.fail("testSolver_add66 should have thrown NoSuchElementException");
                }
                org.junit.Assert.fail("testSolver_add66_failAssert25litNum511 should have thrown NoSuchElementException");
            }
            org.junit.Assert.fail("testSolver_add66_failAssert25litNum511_failAssert83litNum2539 should have thrown NoSuchElementException");
        } catch (NoSuchElementException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSolver_add66_failAssert25litNum511_failAssert83litNum2585_failAssert288() throws Exception {
        try {
            {
                {
                    ISolver s = SolverFactory.newDefault();
                    int resVars = s.newVar(6);
                    {
                        s.addClause(new VecInt(new int[]{ -1, -3 }));
                        s.addClause(new VecInt(new int[]{ -2, -3 }));
                        s.addClause(new VecInt(new int[]{ 1 }));
                        s.addClause(new VecInt(new int[]{ 3 }));
                        IConstr r = s.addAtMost(new VecInt(new int[]{ 5, 6 }), 2);
                        int[] model = s.findModel();
                        s.removeConstr(r);
                        s.removeConstr(r);
                        model = s.findModel();
                    }
                    org.junit.Assert.fail("testSolver_add66 should have thrown NoSuchElementException");
                }
                org.junit.Assert.fail("testSolver_add66_failAssert25litNum511 should have thrown NoSuchElementException");
            }
            org.junit.Assert.fail("testSolver_add66_failAssert25litNum511_failAssert83litNum2585 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-1", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSolver_add66_failAssert25litNum427_failAssert85litNum2801_failAssert289() throws Exception {
        try {
            {
                {
                    ISolver s = SolverFactory.newDefault();
                    int resVars = s.newVar(0);
                    {
                        s.addClause(new VecInt(new int[]{ -1, -3 }));
                        s.addClause(new VecInt(new int[]{ -2, -4 }));
                        s.addClause(new VecInt(new int[]{ 1 }));
                        s.addClause(new VecInt(new int[]{ 3 }));
                        IConstr r = s.addAtMost(new VecInt(new int[]{ 5, 7 }), 1);
                        int[] model = s.findModel();
                        s.removeConstr(r);
                        s.removeConstr(r);
                        model = s.findModel();
                    }
                    org.junit.Assert.fail("testSolver_add66 should have thrown NoSuchElementException");
                }
                org.junit.Assert.fail("testSolver_add66_failAssert25litNum427 should have thrown NoSuchElementException");
            }
            org.junit.Assert.fail("testSolver_add66_failAssert25litNum427_failAssert85litNum2801 should have thrown NoSuchElementException");
        } catch (NoSuchElementException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSolver_add66_failAssert25litNum427_failAssert85litNum2820_failAssert291() throws Exception {
        try {
            {
                {
                    ISolver s = SolverFactory.newDefault();
                    int resVars = s.newVar(0);
                    {
                        s.addClause(new VecInt(new int[]{ -1, -3 }));
                        s.addClause(new VecInt(new int[]{ -2, -4 }));
                        s.addClause(new VecInt(new int[]{ 1 }));
                        s.addClause(new VecInt(new int[]{ 3 }));
                        IConstr r = s.addAtMost(new VecInt(new int[]{ 5, 6 }), 2);
                        int[] model = s.findModel();
                        s.removeConstr(r);
                        s.removeConstr(r);
                        model = s.findModel();
                    }
                    org.junit.Assert.fail("testSolver_add66 should have thrown NoSuchElementException");
                }
                org.junit.Assert.fail("testSolver_add66_failAssert25litNum427 should have thrown NoSuchElementException");
            }
            org.junit.Assert.fail("testSolver_add66_failAssert25litNum427_failAssert85litNum2820 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-1", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSolver_add66_failAssert25litNum427_failAssert85litNum2716_failAssert294() throws Exception {
        try {
            {
                {
                    ISolver s = SolverFactory.newDefault();
                    int resVars = s.newVar(0);
                    {
                        s.addClause(new VecInt(new int[]{ -1, -3 }));
                        s.addClause(new VecInt(new int[]{ -0, -4 }));
                        s.addClause(new VecInt(new int[]{ 1 }));
                        s.addClause(new VecInt(new int[]{ 3 }));
                        IConstr r = s.addAtMost(new VecInt(new int[]{ 5, 6 }), 1);
                        int[] model = s.findModel();
                        s.removeConstr(r);
                        s.removeConstr(r);
                        model = s.findModel();
                    }
                    org.junit.Assert.fail("testSolver_add66 should have thrown NoSuchElementException");
                }
                org.junit.Assert.fail("testSolver_add66_failAssert25litNum427 should have thrown NoSuchElementException");
            }
            org.junit.Assert.fail("testSolver_add66_failAssert25litNum427_failAssert85litNum2716 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSolver_add66_failAssert25litNum427_failAssert85litNum2805_failAssert295() throws Exception {
        try {
            {
                {
                    ISolver s = SolverFactory.newDefault();
                    int resVars = s.newVar(0);
                    {
                        s.addClause(new VecInt(new int[]{ -1, -3 }));
                        s.addClause(new VecInt(new int[]{ -2, -4 }));
                        s.addClause(new VecInt(new int[]{ 1 }));
                        s.addClause(new VecInt(new int[]{ 3 }));
                        IConstr r = s.addAtMost(new VecInt(new int[]{ 5, 5 }), 1);
                        int[] model = s.findModel();
                        s.removeConstr(r);
                        s.removeConstr(r);
                        model = s.findModel();
                    }
                    org.junit.Assert.fail("testSolver_add66 should have thrown NoSuchElementException");
                }
                org.junit.Assert.fail("testSolver_add66_failAssert25litNum427 should have thrown NoSuchElementException");
            }
            org.junit.Assert.fail("testSolver_add66_failAssert25litNum427_failAssert85litNum2805 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-1", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSolver_add66_failAssert25litNum532_failAssert97litNum1712_failAssert297() throws Exception {
        try {
            {
                {
                    ISolver s = SolverFactory.newDefault();
                    int resVars = s.newVar(6);
                    {
                        s.addClause(new VecInt(new int[]{ -1, -3 }));
                        s.addClause(new VecInt(new int[]{ -2, -4 }));
                        s.addClause(new VecInt(new int[]{ 2 }));
                        s.addClause(new VecInt(new int[]{ 2 }));
                        IConstr r = s.addAtMost(new VecInt(new int[]{ 5, 6 }), 1);
                        int[] model = s.findModel();
                        s.removeConstr(r);
                        s.removeConstr(r);
                        model = s.findModel();
                    }
                    org.junit.Assert.fail("testSolver_add66 should have thrown NoSuchElementException");
                }
                org.junit.Assert.fail("testSolver_add66_failAssert25litNum532 should have thrown NoSuchElementException");
            }
            org.junit.Assert.fail("testSolver_add66_failAssert25litNum532_failAssert97litNum1712 should have thrown NoSuchElementException");
        } catch (NoSuchElementException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSolver_add66_failAssert25litNum427_failAssert85litNum2707_failAssert299() throws Exception {
        try {
            {
                {
                    ISolver s = SolverFactory.newDefault();
                    int resVars = s.newVar(0);
                    {
                        s.addClause(new VecInt(new int[]{ -1, -3 }));
                        s.addClause(new VecInt(new int[]{ -1, -4 }));
                        s.addClause(new VecInt(new int[]{ 1 }));
                        s.addClause(new VecInt(new int[]{ 3 }));
                        IConstr r = s.addAtMost(new VecInt(new int[]{ 5, 6 }), 1);
                        int[] model = s.findModel();
                        s.removeConstr(r);
                        s.removeConstr(r);
                        model = s.findModel();
                    }
                    org.junit.Assert.fail("testSolver_add66 should have thrown NoSuchElementException");
                }
                org.junit.Assert.fail("testSolver_add66_failAssert25litNum427 should have thrown NoSuchElementException");
            }
            org.junit.Assert.fail("testSolver_add66_failAssert25litNum427_failAssert85litNum2707 should have thrown NoSuchElementException");
        } catch (NoSuchElementException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSolver_add66_failAssert25litNum427_failAssert85litNum2751_failAssert303() throws Exception {
        try {
            {
                {
                    ISolver s = SolverFactory.newDefault();
                    int resVars = s.newVar(0);
                    {
                        s.addClause(new VecInt(new int[]{ -1, -3 }));
                        s.addClause(new VecInt(new int[]{ -2, -4 }));
                        s.addClause(new VecInt(new int[]{ 2 }));
                        s.addClause(new VecInt(new int[]{ 3 }));
                        IConstr r = s.addAtMost(new VecInt(new int[]{ 5, 6 }), 1);
                        int[] model = s.findModel();
                        s.removeConstr(r);
                        s.removeConstr(r);
                        model = s.findModel();
                    }
                    org.junit.Assert.fail("testSolver_add66 should have thrown NoSuchElementException");
                }
                org.junit.Assert.fail("testSolver_add66_failAssert25litNum427 should have thrown NoSuchElementException");
            }
            org.junit.Assert.fail("testSolver_add66_failAssert25litNum427_failAssert85litNum2751 should have thrown NoSuchElementException");
        } catch (NoSuchElementException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSolver_add66_failAssert25litNum427_failAssert85litNum2754_failAssert306() throws Exception {
        try {
            {
                {
                    ISolver s = SolverFactory.newDefault();
                    int resVars = s.newVar(0);
                    {
                        s.addClause(new VecInt(new int[]{ -1, -3 }));
                        s.addClause(new VecInt(new int[]{ -2, -4 }));
                        s.addClause(new VecInt(new int[]{ 0 }));
                        s.addClause(new VecInt(new int[]{ 3 }));
                        IConstr r = s.addAtMost(new VecInt(new int[]{ 5, 6 }), 1);
                        int[] model = s.findModel();
                        s.removeConstr(r);
                        s.removeConstr(r);
                        model = s.findModel();
                    }
                    org.junit.Assert.fail("testSolver_add66 should have thrown NoSuchElementException");
                }
                org.junit.Assert.fail("testSolver_add66_failAssert25litNum427 should have thrown NoSuchElementException");
            }
            org.junit.Assert.fail("testSolver_add66_failAssert25litNum427_failAssert85litNum2754 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSolver_add66_failAssert25litNum462_failAssert96litNum1514_failAssert307() throws Exception {
        try {
            {
                {
                    ISolver s = SolverFactory.newDefault();
                    int resVars = s.newVar(6);
                    {
                        s.addClause(new VecInt(new int[]{ -1, -2 }));
                        s.addClause(new VecInt(new int[]{ -2, -4 }));
                        s.addClause(new VecInt(new int[]{ 1 }));
                        s.addClause(new VecInt(new int[]{ 4 }));
                        IConstr r = s.addAtMost(new VecInt(new int[]{ 5, 6 }), 1);
                        int[] model = s.findModel();
                        s.removeConstr(r);
                        s.removeConstr(r);
                        model = s.findModel();
                    }
                    org.junit.Assert.fail("testSolver_add66 should have thrown NoSuchElementException");
                }
                org.junit.Assert.fail("testSolver_add66_failAssert25litNum462 should have thrown NoSuchElementException");
            }
            org.junit.Assert.fail("testSolver_add66_failAssert25litNum462_failAssert96litNum1514 should have thrown NoSuchElementException");
        } catch (NoSuchElementException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSolver_add66_failAssert25litNum462_failAssert96litNum1541_failAssert308() throws Exception {
        try {
            {
                {
                    ISolver s = SolverFactory.newDefault();
                    int resVars = s.newVar(6);
                    {
                        s.addClause(new VecInt(new int[]{ -1, -2 }));
                        s.addClause(new VecInt(new int[]{ -2, -4 }));
                        s.addClause(new VecInt(new int[]{ 1 }));
                        s.addClause(new VecInt(new int[]{ 3 }));
                        IConstr r = s.addAtMost(new VecInt(new int[]{ 6, 6 }), 1);
                        int[] model = s.findModel();
                        s.removeConstr(r);
                        s.removeConstr(r);
                        model = s.findModel();
                    }
                    org.junit.Assert.fail("testSolver_add66 should have thrown NoSuchElementException");
                }
                org.junit.Assert.fail("testSolver_add66_failAssert25litNum462 should have thrown NoSuchElementException");
            }
            org.junit.Assert.fail("testSolver_add66_failAssert25litNum462_failAssert96litNum1541 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-1", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSolver_add66_failAssert25litNum427_failAssert85litNum2735_failAssert309() throws Exception {
        try {
            {
                {
                    ISolver s = SolverFactory.newDefault();
                    int resVars = s.newVar(0);
                    {
                        s.addClause(new VecInt(new int[]{ -1, -3 }));
                        s.addClause(new VecInt(new int[]{ -2, -5 }));
                        s.addClause(new VecInt(new int[]{ 1 }));
                        s.addClause(new VecInt(new int[]{ 3 }));
                        IConstr r = s.addAtMost(new VecInt(new int[]{ 5, 6 }), 1);
                        int[] model = s.findModel();
                        s.removeConstr(r);
                        s.removeConstr(r);
                        model = s.findModel();
                    }
                    org.junit.Assert.fail("testSolver_add66 should have thrown NoSuchElementException");
                }
                org.junit.Assert.fail("testSolver_add66_failAssert25litNum427 should have thrown NoSuchElementException");
            }
            org.junit.Assert.fail("testSolver_add66_failAssert25litNum427_failAssert85litNum2735 should have thrown NoSuchElementException");
        } catch (NoSuchElementException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSolver_add66_failAssert25litNum462_failAssert96litNum1434_failAssert311() throws Exception {
        try {
            {
                {
                    ISolver s = SolverFactory.newDefault();
                    int resVars = s.newVar(6);
                    {
                        s.addClause(new VecInt(new int[]{ -1, -2 }));
                        s.addClause(new VecInt(new int[]{ -3, -4 }));
                        s.addClause(new VecInt(new int[]{ 1 }));
                        s.addClause(new VecInt(new int[]{ 3 }));
                        IConstr r = s.addAtMost(new VecInt(new int[]{ 5, 6 }), 1);
                        int[] model = s.findModel();
                        s.removeConstr(r);
                        s.removeConstr(r);
                        model = s.findModel();
                    }
                    org.junit.Assert.fail("testSolver_add66 should have thrown NoSuchElementException");
                }
                org.junit.Assert.fail("testSolver_add66_failAssert25litNum462 should have thrown NoSuchElementException");
            }
            org.junit.Assert.fail("testSolver_add66_failAssert25litNum462_failAssert96litNum1434 should have thrown NoSuchElementException");
        } catch (NoSuchElementException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSolver_add66_failAssert25litNum427_failAssert85litNum2682_failAssert312() throws Exception {
        try {
            {
                {
                    ISolver s = SolverFactory.newDefault();
                    int resVars = s.newVar(0);
                    {
                        s.addClause(new VecInt(new int[]{ -1, -4 }));
                        s.addClause(new VecInt(new int[]{ -2, -4 }));
                        s.addClause(new VecInt(new int[]{ 1 }));
                        s.addClause(new VecInt(new int[]{ 3 }));
                        IConstr r = s.addAtMost(new VecInt(new int[]{ 5, 6 }), 1);
                        int[] model = s.findModel();
                        s.removeConstr(r);
                        s.removeConstr(r);
                        model = s.findModel();
                    }
                    org.junit.Assert.fail("testSolver_add66 should have thrown NoSuchElementException");
                }
                org.junit.Assert.fail("testSolver_add66_failAssert25litNum427 should have thrown NoSuchElementException");
            }
            org.junit.Assert.fail("testSolver_add66_failAssert25litNum427_failAssert85litNum2682 should have thrown NoSuchElementException");
        } catch (NoSuchElementException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSolver_add66_failAssert25litNum427_failAssert85litNum2776_failAssert313() throws Exception {
        try {
            {
                {
                    ISolver s = SolverFactory.newDefault();
                    int resVars = s.newVar(0);
                    {
                        s.addClause(new VecInt(new int[]{ -1, -3 }));
                        s.addClause(new VecInt(new int[]{ -2, -4 }));
                        s.addClause(new VecInt(new int[]{ 1 }));
                        s.addClause(new VecInt(new int[]{ 0 }));
                        IConstr r = s.addAtMost(new VecInt(new int[]{ 5, 6 }), 1);
                        int[] model = s.findModel();
                        s.removeConstr(r);
                        s.removeConstr(r);
                        model = s.findModel();
                    }
                    org.junit.Assert.fail("testSolver_add66 should have thrown NoSuchElementException");
                }
                org.junit.Assert.fail("testSolver_add66_failAssert25litNum427 should have thrown NoSuchElementException");
            }
            org.junit.Assert.fail("testSolver_add66_failAssert25litNum427_failAssert85litNum2776 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSolver_add66_failAssert25litNum462_failAssert96litNum1462_failAssert315() throws Exception {
        try {
            {
                {
                    ISolver s = SolverFactory.newDefault();
                    int resVars = s.newVar(6);
                    {
                        s.addClause(new VecInt(new int[]{ -1, -2 }));
                        s.addClause(new VecInt(new int[]{ -2, -5 }));
                        s.addClause(new VecInt(new int[]{ 1 }));
                        s.addClause(new VecInt(new int[]{ 3 }));
                        IConstr r = s.addAtMost(new VecInt(new int[]{ 5, 6 }), 1);
                        int[] model = s.findModel();
                        s.removeConstr(r);
                        s.removeConstr(r);
                        model = s.findModel();
                    }
                    org.junit.Assert.fail("testSolver_add66 should have thrown NoSuchElementException");
                }
                org.junit.Assert.fail("testSolver_add66_failAssert25litNum462 should have thrown NoSuchElementException");
            }
            org.junit.Assert.fail("testSolver_add66_failAssert25litNum462_failAssert96litNum1462 should have thrown NoSuchElementException");
        } catch (NoSuchElementException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSolver_add66_failAssert25litNum532_failAssert97litNum1733_failAssert316() throws Exception {
        try {
            {
                {
                    ISolver s = SolverFactory.newDefault();
                    int resVars = s.newVar(6);
                    {
                        s.addClause(new VecInt(new int[]{ -1, -3 }));
                        s.addClause(new VecInt(new int[]{ -2, -4 }));
                        s.addClause(new VecInt(new int[]{ 2 }));
                        s.addClause(new VecInt(new int[]{ 3 }));
                        IConstr r = s.addAtMost(new VecInt(new int[]{ 6, 6 }), 1);
                        int[] model = s.findModel();
                        s.removeConstr(r);
                        s.removeConstr(r);
                        model = s.findModel();
                    }
                    org.junit.Assert.fail("testSolver_add66 should have thrown NoSuchElementException");
                }
                org.junit.Assert.fail("testSolver_add66_failAssert25litNum532 should have thrown NoSuchElementException");
            }
            org.junit.Assert.fail("testSolver_add66_failAssert25litNum532_failAssert97litNum1733 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-1", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSolver_add66_failAssert25litNum427_failAssert85litNum2665_failAssert318() throws Exception {
        try {
            {
                {
                    ISolver s = SolverFactory.newDefault();
                    int resVars = s.newVar(0);
                    {
                        s.addClause(new VecInt(new int[]{ -2, -3 }));
                        s.addClause(new VecInt(new int[]{ -2, -4 }));
                        s.addClause(new VecInt(new int[]{ 1 }));
                        s.addClause(new VecInt(new int[]{ 3 }));
                        IConstr r = s.addAtMost(new VecInt(new int[]{ 5, 6 }), 1);
                        int[] model = s.findModel();
                        s.removeConstr(r);
                        s.removeConstr(r);
                        model = s.findModel();
                    }
                    org.junit.Assert.fail("testSolver_add66 should have thrown NoSuchElementException");
                }
                org.junit.Assert.fail("testSolver_add66_failAssert25litNum427 should have thrown NoSuchElementException");
            }
            org.junit.Assert.fail("testSolver_add66_failAssert25litNum427_failAssert85litNum2665 should have thrown NoSuchElementException");
        } catch (NoSuchElementException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSolver_add66_failAssert25litNum427_failAssert85litNum2696_failAssert319() throws Exception {
        try {
            {
                {
                    ISolver s = SolverFactory.newDefault();
                    int resVars = s.newVar(0);
                    {
                        s.addClause(new VecInt(new int[]{ -1, -0 }));
                        s.addClause(new VecInt(new int[]{ -2, -4 }));
                        s.addClause(new VecInt(new int[]{ 1 }));
                        s.addClause(new VecInt(new int[]{ 3 }));
                        IConstr r = s.addAtMost(new VecInt(new int[]{ 5, 6 }), 1);
                        int[] model = s.findModel();
                        s.removeConstr(r);
                        s.removeConstr(r);
                        model = s.findModel();
                    }
                    org.junit.Assert.fail("testSolver_add66 should have thrown NoSuchElementException");
                }
                org.junit.Assert.fail("testSolver_add66_failAssert25litNum427 should have thrown NoSuchElementException");
            }
            org.junit.Assert.fail("testSolver_add66_failAssert25litNum427_failAssert85litNum2696 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSolver_add66_failAssert25litNum462_failAssert96litNum1546_failAssert323() throws Exception {
        try {
            {
                {
                    ISolver s = SolverFactory.newDefault();
                    int resVars = s.newVar(6);
                    {
                        s.addClause(new VecInt(new int[]{ -1, -2 }));
                        s.addClause(new VecInt(new int[]{ -2, -4 }));
                        s.addClause(new VecInt(new int[]{ 1 }));
                        s.addClause(new VecInt(new int[]{ 3 }));
                        IConstr r = s.addAtMost(new VecInt(new int[]{ 4, 6 }), 1);
                        int[] model = s.findModel();
                        s.removeConstr(r);
                        s.removeConstr(r);
                        model = s.findModel();
                    }
                    org.junit.Assert.fail("testSolver_add66 should have thrown NoSuchElementException");
                }
                org.junit.Assert.fail("testSolver_add66_failAssert25litNum462 should have thrown NoSuchElementException");
            }
            org.junit.Assert.fail("testSolver_add66_failAssert25litNum462_failAssert96litNum1546 should have thrown NoSuchElementException");
        } catch (NoSuchElementException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSolver_add66_failAssert25litNum427_failAssert85litNum2668_failAssert326() throws Exception {
        try {
            {
                {
                    ISolver s = SolverFactory.newDefault();
                    int resVars = s.newVar(0);
                    {
                        s.addClause(new VecInt(new int[]{ -0, -3 }));
                        s.addClause(new VecInt(new int[]{ -2, -4 }));
                        s.addClause(new VecInt(new int[]{ 1 }));
                        s.addClause(new VecInt(new int[]{ 3 }));
                        IConstr r = s.addAtMost(new VecInt(new int[]{ 5, 6 }), 1);
                        int[] model = s.findModel();
                        s.removeConstr(r);
                        s.removeConstr(r);
                        model = s.findModel();
                    }
                    org.junit.Assert.fail("testSolver_add66 should have thrown NoSuchElementException");
                }
                org.junit.Assert.fail("testSolver_add66_failAssert25litNum427 should have thrown NoSuchElementException");
            }
            org.junit.Assert.fail("testSolver_add66_failAssert25litNum427_failAssert85litNum2668 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSolver_add66_failAssert25litNum427_failAssert85litNum2686_failAssert327() throws Exception {
        try {
            {
                {
                    ISolver s = SolverFactory.newDefault();
                    int resVars = s.newVar(0);
                    {
                        s.addClause(new VecInt(new int[]{ -1, -2 }));
                        s.addClause(new VecInt(new int[]{ -2, -4 }));
                        s.addClause(new VecInt(new int[]{ 1 }));
                        s.addClause(new VecInt(new int[]{ 3 }));
                        IConstr r = s.addAtMost(new VecInt(new int[]{ 5, 6 }), 1);
                        int[] model = s.findModel();
                        s.removeConstr(r);
                        s.removeConstr(r);
                        model = s.findModel();
                    }
                    org.junit.Assert.fail("testSolver_add66 should have thrown NoSuchElementException");
                }
                org.junit.Assert.fail("testSolver_add66_failAssert25litNum427 should have thrown NoSuchElementException");
            }
            org.junit.Assert.fail("testSolver_add66_failAssert25litNum427_failAssert85litNum2686 should have thrown NoSuchElementException");
        } catch (NoSuchElementException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSolver_add66_failAssert25litNum462_failAssert96litNum1491_failAssert329() throws Exception {
        try {
            {
                {
                    ISolver s = SolverFactory.newDefault();
                    int resVars = s.newVar(6);
                    {
                        s.addClause(new VecInt(new int[]{ -1, -2 }));
                        s.addClause(new VecInt(new int[]{ -2, -4 }));
                        s.addClause(new VecInt(new int[]{ 2 }));
                        s.addClause(new VecInt(new int[]{ 3 }));
                        IConstr r = s.addAtMost(new VecInt(new int[]{ 5, 6 }), 1);
                        int[] model = s.findModel();
                        s.removeConstr(r);
                        s.removeConstr(r);
                        model = s.findModel();
                    }
                    org.junit.Assert.fail("testSolver_add66 should have thrown NoSuchElementException");
                }
                org.junit.Assert.fail("testSolver_add66_failAssert25litNum462 should have thrown NoSuchElementException");
            }
            org.junit.Assert.fail("testSolver_add66_failAssert25litNum462_failAssert96litNum1491 should have thrown NoSuchElementException");
        } catch (NoSuchElementException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSolver_add66_failAssert25litNum532_failAssert97litNum1737_failAssert331() throws Exception {
        try {
            {
                {
                    ISolver s = SolverFactory.newDefault();
                    int resVars = s.newVar(6);
                    {
                        s.addClause(new VecInt(new int[]{ -1, -3 }));
                        s.addClause(new VecInt(new int[]{ -2, -4 }));
                        s.addClause(new VecInt(new int[]{ 2 }));
                        s.addClause(new VecInt(new int[]{ 3 }));
                        IConstr r = s.addAtMost(new VecInt(new int[]{ 4, 6 }), 1);
                        int[] model = s.findModel();
                        s.removeConstr(r);
                        s.removeConstr(r);
                        model = s.findModel();
                    }
                    org.junit.Assert.fail("testSolver_add66 should have thrown NoSuchElementException");
                }
                org.junit.Assert.fail("testSolver_add66_failAssert25litNum532 should have thrown NoSuchElementException");
            }
            org.junit.Assert.fail("testSolver_add66_failAssert25litNum532_failAssert97litNum1737 should have thrown NoSuchElementException");
        } catch (NoSuchElementException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSolver_add66_failAssert25litNum462_failAssert96litNum1565_failAssert336() throws Exception {
        try {
            {
                {
                    ISolver s = SolverFactory.newDefault();
                    int resVars = s.newVar(6);
                    {
                        s.addClause(new VecInt(new int[]{ -1, -2 }));
                        s.addClause(new VecInt(new int[]{ -2, -4 }));
                        s.addClause(new VecInt(new int[]{ 1 }));
                        s.addClause(new VecInt(new int[]{ 3 }));
                        IConstr r = s.addAtMost(new VecInt(new int[]{ 5, 7 }), 1);
                        int[] model = s.findModel();
                        s.removeConstr(r);
                        s.removeConstr(r);
                        model = s.findModel();
                    }
                    org.junit.Assert.fail("testSolver_add66 should have thrown NoSuchElementException");
                }
                org.junit.Assert.fail("testSolver_add66_failAssert25litNum462 should have thrown NoSuchElementException");
            }
            org.junit.Assert.fail("testSolver_add66_failAssert25litNum462_failAssert96litNum1565 should have thrown NoSuchElementException");
        } catch (NoSuchElementException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSolver_add66_failAssert25litNum462_failAssert96litNum1592_failAssert337() throws Exception {
        try {
            {
                {
                    ISolver s = SolverFactory.newDefault();
                    int resVars = s.newVar(6);
                    {
                        s.addClause(new VecInt(new int[]{ -1, -2 }));
                        s.addClause(new VecInt(new int[]{ -2, -4 }));
                        s.addClause(new VecInt(new int[]{ 1 }));
                        s.addClause(new VecInt(new int[]{ 3 }));
                        IConstr r = s.addAtMost(new VecInt(new int[]{ 5, 6 }), 2);
                        int[] model = s.findModel();
                        s.removeConstr(r);
                        s.removeConstr(r);
                        model = s.findModel();
                    }
                    org.junit.Assert.fail("testSolver_add66 should have thrown NoSuchElementException");
                }
                org.junit.Assert.fail("testSolver_add66_failAssert25litNum462 should have thrown NoSuchElementException");
            }
            org.junit.Assert.fail("testSolver_add66_failAssert25litNum462_failAssert96litNum1592 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-1", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSolver_add66_failAssert25litNum532_failAssert97litNum1759_failAssert340() throws Exception {
        try {
            {
                {
                    ISolver s = SolverFactory.newDefault();
                    int resVars = s.newVar(6);
                    {
                        s.addClause(new VecInt(new int[]{ -1, -3 }));
                        s.addClause(new VecInt(new int[]{ -2, -4 }));
                        s.addClause(new VecInt(new int[]{ 2 }));
                        s.addClause(new VecInt(new int[]{ 3 }));
                        IConstr r = s.addAtMost(new VecInt(new int[]{ 5, 7 }), 1);
                        int[] model = s.findModel();
                        s.removeConstr(r);
                        s.removeConstr(r);
                        model = s.findModel();
                    }
                    org.junit.Assert.fail("testSolver_add66 should have thrown NoSuchElementException");
                }
                org.junit.Assert.fail("testSolver_add66_failAssert25litNum532 should have thrown NoSuchElementException");
            }
            org.junit.Assert.fail("testSolver_add66_failAssert25litNum532_failAssert97litNum1759 should have thrown NoSuchElementException");
        } catch (NoSuchElementException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSolver_add66_failAssert25litNum532_failAssert97litNum1786_failAssert341() throws Exception {
        try {
            {
                {
                    ISolver s = SolverFactory.newDefault();
                    int resVars = s.newVar(6);
                    {
                        s.addClause(new VecInt(new int[]{ -1, -3 }));
                        s.addClause(new VecInt(new int[]{ -2, -4 }));
                        s.addClause(new VecInt(new int[]{ 2 }));
                        s.addClause(new VecInt(new int[]{ 3 }));
                        IConstr r = s.addAtMost(new VecInt(new int[]{ 5, 6 }), 2);
                        int[] model = s.findModel();
                        s.removeConstr(r);
                        s.removeConstr(r);
                        model = s.findModel();
                    }
                    org.junit.Assert.fail("testSolver_add66 should have thrown NoSuchElementException");
                }
                org.junit.Assert.fail("testSolver_add66_failAssert25litNum532 should have thrown NoSuchElementException");
            }
            org.junit.Assert.fail("testSolver_add66_failAssert25litNum532_failAssert97litNum1786 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-1", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSolver_add66_failAssert25litNum457_failAssert110litNum2000_failAssert349() throws Exception {
        try {
            {
                {
                    ISolver s = SolverFactory.newDefault();
                    int resVars = s.newVar(6);
                    {
                        s.addClause(new VecInt(new int[]{ -1, -4 }));
                        s.addClause(new VecInt(new int[]{ -2, -4 }));
                        s.addClause(new VecInt(new int[]{ 2 }));
                        s.addClause(new VecInt(new int[]{ 3 }));
                        IConstr r = s.addAtMost(new VecInt(new int[]{ 5, 6 }), 1);
                        int[] model = s.findModel();
                        s.removeConstr(r);
                        s.removeConstr(r);
                        model = s.findModel();
                    }
                    org.junit.Assert.fail("testSolver_add66 should have thrown NoSuchElementException");
                }
                org.junit.Assert.fail("testSolver_add66_failAssert25litNum457 should have thrown NoSuchElementException");
            }
            org.junit.Assert.fail("testSolver_add66_failAssert25litNum457_failAssert110litNum2000 should have thrown NoSuchElementException");
        } catch (NoSuchElementException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSolver_add66_failAssert25litNum436_failAssert103litNum1531_failAssert352() throws Exception {
        try {
            {
                {
                    ISolver s = SolverFactory.newDefault();
                    int resVars = s.newVar(6);
                    {
                        s.addClause(new VecInt(new int[]{ -2, -3 }));
                        s.addClause(new VecInt(new int[]{ -2, -4 }));
                        s.addClause(new VecInt(new int[]{ 1 }));
                        s.addClause(new VecInt(new int[]{ 3 }));
                        IConstr r = s.addAtMost(new VecInt(new int[]{ 5, 5 }), 1);
                        int[] model = s.findModel();
                        s.removeConstr(r);
                        s.removeConstr(r);
                        model = s.findModel();
                    }
                    org.junit.Assert.fail("testSolver_add66 should have thrown NoSuchElementException");
                }
                org.junit.Assert.fail("testSolver_add66_failAssert25litNum436 should have thrown NoSuchElementException");
            }
            org.junit.Assert.fail("testSolver_add66_failAssert25litNum436_failAssert103litNum1531 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-1", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSolver_add66_failAssert25litNum436_failAssert103litNum1470_failAssert360() throws Exception {
        try {
            {
                {
                    ISolver s = SolverFactory.newDefault();
                    int resVars = s.newVar(6);
                    {
                        s.addClause(new VecInt(new int[]{ -2, -3 }));
                        s.addClause(new VecInt(new int[]{ -2, -3 }));
                        s.addClause(new VecInt(new int[]{ 1 }));
                        s.addClause(new VecInt(new int[]{ 3 }));
                        IConstr r = s.addAtMost(new VecInt(new int[]{ 5, 6 }), 1);
                        int[] model = s.findModel();
                        s.removeConstr(r);
                        s.removeConstr(r);
                        model = s.findModel();
                    }
                    org.junit.Assert.fail("testSolver_add66 should have thrown NoSuchElementException");
                }
                org.junit.Assert.fail("testSolver_add66_failAssert25litNum436 should have thrown NoSuchElementException");
            }
            org.junit.Assert.fail("testSolver_add66_failAssert25litNum436_failAssert103litNum1470 should have thrown NoSuchElementException");
        } catch (NoSuchElementException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSolver_add66_failAssert25litNum436_failAssert103litNum1515_failAssert361() throws Exception {
        try {
            {
                {
                    ISolver s = SolverFactory.newDefault();
                    int resVars = s.newVar(6);
                    {
                        s.addClause(new VecInt(new int[]{ -2, -3 }));
                        s.addClause(new VecInt(new int[]{ -2, -4 }));
                        s.addClause(new VecInt(new int[]{ 1 }));
                        s.addClause(new VecInt(new int[]{ 3 }));
                        IConstr r = s.addAtMost(new VecInt(new int[]{ 4, 6 }), 1);
                        int[] model = s.findModel();
                        s.removeConstr(r);
                        s.removeConstr(r);
                        model = s.findModel();
                    }
                    org.junit.Assert.fail("testSolver_add66 should have thrown NoSuchElementException");
                }
                org.junit.Assert.fail("testSolver_add66_failAssert25litNum436 should have thrown NoSuchElementException");
            }
            org.junit.Assert.fail("testSolver_add66_failAssert25litNum436_failAssert103litNum1515 should have thrown NoSuchElementException");
        } catch (NoSuchElementException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSolver_add66_failAssert25litNum483_failAssert104litNum1613_failAssert362() throws Exception {
        try {
            {
                {
                    ISolver s = SolverFactory.newDefault();
                    int resVars = s.newVar(6);
                    {
                        s.addClause(new VecInt(new int[]{ -1, -0 }));
                        s.addClause(new VecInt(new int[]{ -1, -4 }));
                        s.addClause(new VecInt(new int[]{ 1 }));
                        s.addClause(new VecInt(new int[]{ 3 }));
                        IConstr r = s.addAtMost(new VecInt(new int[]{ 5, 6 }), 1);
                        int[] model = s.findModel();
                        s.removeConstr(r);
                        s.removeConstr(r);
                        model = s.findModel();
                    }
                    org.junit.Assert.fail("testSolver_add66 should have thrown NoSuchElementException");
                }
                org.junit.Assert.fail("testSolver_add66_failAssert25litNum483 should have thrown NoSuchElementException");
            }
            org.junit.Assert.fail("testSolver_add66_failAssert25litNum483_failAssert104litNum1613 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSolver_add66_failAssert25litNum436_failAssert103litNum1433_failAssert366() throws Exception {
        try {
            {
                {
                    ISolver s = SolverFactory.newDefault();
                    int resVars = s.newVar(6);
                    {
                        s.addClause(new VecInt(new int[]{ -2, -4 }));
                        s.addClause(new VecInt(new int[]{ -2, -4 }));
                        s.addClause(new VecInt(new int[]{ 1 }));
                        s.addClause(new VecInt(new int[]{ 3 }));
                        IConstr r = s.addAtMost(new VecInt(new int[]{ 5, 6 }), 1);
                        int[] model = s.findModel();
                        s.removeConstr(r);
                        s.removeConstr(r);
                        model = s.findModel();
                    }
                    org.junit.Assert.fail("testSolver_add66 should have thrown NoSuchElementException");
                }
                org.junit.Assert.fail("testSolver_add66_failAssert25litNum436 should have thrown NoSuchElementException");
            }
            org.junit.Assert.fail("testSolver_add66_failAssert25litNum436_failAssert103litNum1433 should have thrown NoSuchElementException");
        } catch (NoSuchElementException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSolver_add66_failAssert25litNum457_failAssert110litNum2051_failAssert373() throws Exception {
        try {
            {
                {
                    ISolver s = SolverFactory.newDefault();
                    int resVars = s.newVar(6);
                    {
                        s.addClause(new VecInt(new int[]{ -1, -4 }));
                        s.addClause(new VecInt(new int[]{ -2, -4 }));
                        s.addClause(new VecInt(new int[]{ 1 }));
                        s.addClause(new VecInt(new int[]{ 3 }));
                        IConstr r = s.addAtMost(new VecInt(new int[]{ 5, 7 }), 1);
                        int[] model = s.findModel();
                        s.removeConstr(r);
                        s.removeConstr(r);
                        model = s.findModel();
                    }
                    org.junit.Assert.fail("testSolver_add66 should have thrown NoSuchElementException");
                }
                org.junit.Assert.fail("testSolver_add66_failAssert25litNum457 should have thrown NoSuchElementException");
            }
            org.junit.Assert.fail("testSolver_add66_failAssert25litNum457_failAssert110litNum2051 should have thrown NoSuchElementException");
        } catch (NoSuchElementException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSolver_add66_failAssert25litNum436_failAssert103litNum1437_failAssert375() throws Exception {
        try {
            {
                {
                    ISolver s = SolverFactory.newDefault();
                    int resVars = s.newVar(6);
                    {
                        s.addClause(new VecInt(new int[]{ -2, -2 }));
                        s.addClause(new VecInt(new int[]{ -2, -4 }));
                        s.addClause(new VecInt(new int[]{ 1 }));
                        s.addClause(new VecInt(new int[]{ 3 }));
                        IConstr r = s.addAtMost(new VecInt(new int[]{ 5, 6 }), 1);
                        int[] model = s.findModel();
                        s.removeConstr(r);
                        s.removeConstr(r);
                        model = s.findModel();
                    }
                    org.junit.Assert.fail("testSolver_add66 should have thrown NoSuchElementException");
                }
                org.junit.Assert.fail("testSolver_add66_failAssert25litNum436 should have thrown NoSuchElementException");
            }
            org.junit.Assert.fail("testSolver_add66_failAssert25litNum436_failAssert103litNum1437 should have thrown NoSuchElementException");
        } catch (NoSuchElementException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSolver_add66_failAssert25litNum457_failAssert110litNum2034_failAssert376() throws Exception {
        try {
            {
                {
                    ISolver s = SolverFactory.newDefault();
                    int resVars = s.newVar(6);
                    {
                        s.addClause(new VecInt(new int[]{ -1, -4 }));
                        s.addClause(new VecInt(new int[]{ -2, -4 }));
                        s.addClause(new VecInt(new int[]{ 1 }));
                        s.addClause(new VecInt(new int[]{ 3 }));
                        IConstr r = s.addAtMost(new VecInt(new int[]{ 6, 6 }), 1);
                        int[] model = s.findModel();
                        s.removeConstr(r);
                        s.removeConstr(r);
                        model = s.findModel();
                    }
                    org.junit.Assert.fail("testSolver_add66 should have thrown NoSuchElementException");
                }
                org.junit.Assert.fail("testSolver_add66_failAssert25litNum457 should have thrown NoSuchElementException");
            }
            org.junit.Assert.fail("testSolver_add66_failAssert25litNum457_failAssert110litNum2034 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-1", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSolver_add66_failAssert25litNum507_failAssert100litNum1918_failAssert380() throws Exception {
        try {
            {
                {
                    ISolver s = SolverFactory.newDefault();
                    int resVars = s.newVar(6);
                    {
                        s.addClause(new VecInt(new int[]{ -1, -3 }));
                        s.addClause(new VecInt(new int[]{ -2, -5 }));
                        s.addClause(new VecInt(new int[]{ 1 }));
                        s.addClause(new VecInt(new int[]{ 3 }));
                        IConstr r = s.addAtMost(new VecInt(new int[]{ 5, 7 }), 1);
                        int[] model = s.findModel();
                        s.removeConstr(r);
                        s.removeConstr(r);
                        model = s.findModel();
                    }
                    org.junit.Assert.fail("testSolver_add66 should have thrown NoSuchElementException");
                }
                org.junit.Assert.fail("testSolver_add66_failAssert25litNum507 should have thrown NoSuchElementException");
            }
            org.junit.Assert.fail("testSolver_add66_failAssert25litNum507_failAssert100litNum1918 should have thrown NoSuchElementException");
        } catch (NoSuchElementException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSolver_add66_failAssert25litNum457_failAssert110litNum2037_failAssert383() throws Exception {
        try {
            {
                {
                    ISolver s = SolverFactory.newDefault();
                    int resVars = s.newVar(6);
                    {
                        s.addClause(new VecInt(new int[]{ -1, -4 }));
                        s.addClause(new VecInt(new int[]{ -2, -4 }));
                        s.addClause(new VecInt(new int[]{ 1 }));
                        s.addClause(new VecInt(new int[]{ 3 }));
                        IConstr r = s.addAtMost(new VecInt(new int[]{ 4, 6 }), 1);
                        int[] model = s.findModel();
                        s.removeConstr(r);
                        s.removeConstr(r);
                        model = s.findModel();
                    }
                    org.junit.Assert.fail("testSolver_add66 should have thrown NoSuchElementException");
                }
                org.junit.Assert.fail("testSolver_add66_failAssert25litNum457 should have thrown NoSuchElementException");
            }
            org.junit.Assert.fail("testSolver_add66_failAssert25litNum457_failAssert110litNum2037 should have thrown NoSuchElementException");
        } catch (NoSuchElementException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSolver_add66_failAssert25litNum436_failAssert103litNum1545_failAssert384() throws Exception {
        try {
            {
                {
                    ISolver s = SolverFactory.newDefault();
                    int resVars = s.newVar(6);
                    {
                        s.addClause(new VecInt(new int[]{ -2, -3 }));
                        s.addClause(new VecInt(new int[]{ -2, -4 }));
                        s.addClause(new VecInt(new int[]{ 1 }));
                        s.addClause(new VecInt(new int[]{ 3 }));
                        IConstr r = s.addAtMost(new VecInt(new int[]{ 5, 6 }), 2);
                        int[] model = s.findModel();
                        s.removeConstr(r);
                        s.removeConstr(r);
                        model = s.findModel();
                    }
                    org.junit.Assert.fail("testSolver_add66 should have thrown NoSuchElementException");
                }
                org.junit.Assert.fail("testSolver_add66_failAssert25litNum436 should have thrown NoSuchElementException");
            }
            org.junit.Assert.fail("testSolver_add66_failAssert25litNum436_failAssert103litNum1545 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-1", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSolver_add66_failAssert25litNum483_failAssert104litNum1633_failAssert389() throws Exception {
        try {
            {
                {
                    ISolver s = SolverFactory.newDefault();
                    int resVars = s.newVar(6);
                    {
                        s.addClause(new VecInt(new int[]{ -1, -3 }));
                        s.addClause(new VecInt(new int[]{ -1, -4 }));
                        s.addClause(new VecInt(new int[]{ 2 }));
                        s.addClause(new VecInt(new int[]{ 3 }));
                        IConstr r = s.addAtMost(new VecInt(new int[]{ 5, 6 }), 1);
                        int[] model = s.findModel();
                        s.removeConstr(r);
                        s.removeConstr(r);
                        model = s.findModel();
                    }
                    org.junit.Assert.fail("testSolver_add66 should have thrown NoSuchElementException");
                }
                org.junit.Assert.fail("testSolver_add66_failAssert25litNum483 should have thrown NoSuchElementException");
            }
            org.junit.Assert.fail("testSolver_add66_failAssert25litNum483_failAssert104litNum1633 should have thrown NoSuchElementException");
        } catch (NoSuchElementException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSolver_add66_failAssert25litNum436_failAssert103litNum1529_failAssert393() throws Exception {
        try {
            {
                {
                    ISolver s = SolverFactory.newDefault();
                    int resVars = s.newVar(6);
                    {
                        s.addClause(new VecInt(new int[]{ -2, -3 }));
                        s.addClause(new VecInt(new int[]{ -2, -4 }));
                        s.addClause(new VecInt(new int[]{ 1 }));
                        s.addClause(new VecInt(new int[]{ 3 }));
                        IConstr r = s.addAtMost(new VecInt(new int[]{ 5, 7 }), 1);
                        int[] model = s.findModel();
                        s.removeConstr(r);
                        s.removeConstr(r);
                        model = s.findModel();
                    }
                    org.junit.Assert.fail("testSolver_add66 should have thrown NoSuchElementException");
                }
                org.junit.Assert.fail("testSolver_add66_failAssert25litNum436 should have thrown NoSuchElementException");
            }
            org.junit.Assert.fail("testSolver_add66_failAssert25litNum436_failAssert103litNum1529 should have thrown NoSuchElementException");
        } catch (NoSuchElementException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSolver_add66_failAssert25litNum483_failAssert104litNum1617_failAssert397() throws Exception {
        try {
            {
                {
                    ISolver s = SolverFactory.newDefault();
                    int resVars = s.newVar(6);
                    {
                        s.addClause(new VecInt(new int[]{ -1, -3 }));
                        s.addClause(new VecInt(new int[]{ -1, -5 }));
                        s.addClause(new VecInt(new int[]{ 1 }));
                        s.addClause(new VecInt(new int[]{ 3 }));
                        IConstr r = s.addAtMost(new VecInt(new int[]{ 5, 6 }), 1);
                        int[] model = s.findModel();
                        s.removeConstr(r);
                        s.removeConstr(r);
                        model = s.findModel();
                    }
                    org.junit.Assert.fail("testSolver_add66 should have thrown NoSuchElementException");
                }
                org.junit.Assert.fail("testSolver_add66_failAssert25litNum483 should have thrown NoSuchElementException");
            }
            org.junit.Assert.fail("testSolver_add66_failAssert25litNum483_failAssert104litNum1617 should have thrown NoSuchElementException");
        } catch (NoSuchElementException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSolver_add66_failAssert25litNum483_failAssert104litNum1682_failAssert399() throws Exception {
        try {
            {
                {
                    ISolver s = SolverFactory.newDefault();
                    int resVars = s.newVar(6);
                    {
                        s.addClause(new VecInt(new int[]{ -1, -3 }));
                        s.addClause(new VecInt(new int[]{ -1, -4 }));
                        s.addClause(new VecInt(new int[]{ 1 }));
                        s.addClause(new VecInt(new int[]{ 3 }));
                        IConstr r = s.addAtMost(new VecInt(new int[]{ 5, 5 }), 1);
                        int[] model = s.findModel();
                        s.removeConstr(r);
                        s.removeConstr(r);
                        model = s.findModel();
                    }
                    org.junit.Assert.fail("testSolver_add66 should have thrown NoSuchElementException");
                }
                org.junit.Assert.fail("testSolver_add66_failAssert25litNum483 should have thrown NoSuchElementException");
            }
            org.junit.Assert.fail("testSolver_add66_failAssert25litNum483_failAssert104litNum1682 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-1", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSolver_add66_failAssert25litNum483_failAssert104litNum1681_failAssert401() throws Exception {
        try {
            {
                {
                    ISolver s = SolverFactory.newDefault();
                    int resVars = s.newVar(6);
                    {
                        s.addClause(new VecInt(new int[]{ -1, -3 }));
                        s.addClause(new VecInt(new int[]{ -1, -4 }));
                        s.addClause(new VecInt(new int[]{ 1 }));
                        s.addClause(new VecInt(new int[]{ 3 }));
                        IConstr r = s.addAtMost(new VecInt(new int[]{ 5, 7 }), 1);
                        int[] model = s.findModel();
                        s.removeConstr(r);
                        s.removeConstr(r);
                        model = s.findModel();
                    }
                    org.junit.Assert.fail("testSolver_add66 should have thrown NoSuchElementException");
                }
                org.junit.Assert.fail("testSolver_add66_failAssert25litNum483 should have thrown NoSuchElementException");
            }
            org.junit.Assert.fail("testSolver_add66_failAssert25litNum483_failAssert104litNum1681 should have thrown NoSuchElementException");
        } catch (NoSuchElementException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSolver_add66_failAssert25litNum582_failAssert106litNum1760_failAssert402() throws Exception {
        try {
            {
                {
                    ISolver s = SolverFactory.newDefault();
                    int resVars = s.newVar(6);
                    {
                        s.addClause(new VecInt(new int[]{ -1, -3 }));
                        s.addClause(new VecInt(new int[]{ -2, -4 }));
                        s.addClause(new VecInt(new int[]{ 1 }));
                        s.addClause(new VecInt(new int[]{ 4 }));
                        IConstr r = s.addAtMost(new VecInt(new int[]{ 4, 6 }), 1);
                        int[] model = s.findModel();
                        s.removeConstr(r);
                        s.removeConstr(r);
                        model = s.findModel();
                    }
                    org.junit.Assert.fail("testSolver_add66 should have thrown NoSuchElementException");
                }
                org.junit.Assert.fail("testSolver_add66_failAssert25litNum582 should have thrown NoSuchElementException");
            }
            org.junit.Assert.fail("testSolver_add66_failAssert25litNum582_failAssert106litNum1760 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-1", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSolver_add66_failAssert25litNum582_failAssert106litNum1780_failAssert403() throws Exception {
        try {
            {
                {
                    ISolver s = SolverFactory.newDefault();
                    int resVars = s.newVar(6);
                    {
                        s.addClause(new VecInt(new int[]{ -1, -3 }));
                        s.addClause(new VecInt(new int[]{ -2, -4 }));
                        s.addClause(new VecInt(new int[]{ 1 }));
                        s.addClause(new VecInt(new int[]{ 3 }));
                        IConstr r = s.addAtMost(new VecInt(new int[]{ 4, 5 }), 1);
                        int[] model = s.findModel();
                        s.removeConstr(r);
                        s.removeConstr(r);
                        model = s.findModel();
                    }
                    org.junit.Assert.fail("testSolver_add66 should have thrown NoSuchElementException");
                }
                org.junit.Assert.fail("testSolver_add66_failAssert25litNum582 should have thrown NoSuchElementException");
            }
            org.junit.Assert.fail("testSolver_add66_failAssert25litNum582_failAssert106litNum1780 should have thrown NoSuchElementException");
        } catch (NoSuchElementException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSolver_add66_failAssert25litNum436_failAssert103litNum1497_failAssert409() throws Exception {
        try {
            {
                {
                    ISolver s = SolverFactory.newDefault();
                    int resVars = s.newVar(6);
                    {
                        s.addClause(new VecInt(new int[]{ -2, -3 }));
                        s.addClause(new VecInt(new int[]{ -2, -4 }));
                        s.addClause(new VecInt(new int[]{ 1 }));
                        s.addClause(new VecInt(new int[]{ 4 }));
                        IConstr r = s.addAtMost(new VecInt(new int[]{ 5, 6 }), 1);
                        int[] model = s.findModel();
                        s.removeConstr(r);
                        s.removeConstr(r);
                        model = s.findModel();
                    }
                    org.junit.Assert.fail("testSolver_add66 should have thrown NoSuchElementException");
                }
                org.junit.Assert.fail("testSolver_add66_failAssert25litNum436 should have thrown NoSuchElementException");
            }
            org.junit.Assert.fail("testSolver_add66_failAssert25litNum436_failAssert103litNum1497 should have thrown NoSuchElementException");
        } catch (NoSuchElementException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSolver_add66_failAssert25litNum483_failAssert104litNum1647_failAssert410() throws Exception {
        try {
            {
                {
                    ISolver s = SolverFactory.newDefault();
                    int resVars = s.newVar(6);
                    {
                        s.addClause(new VecInt(new int[]{ -1, -3 }));
                        s.addClause(new VecInt(new int[]{ -1, -4 }));
                        s.addClause(new VecInt(new int[]{ 1 }));
                        s.addClause(new VecInt(new int[]{ 4 }));
                        IConstr r = s.addAtMost(new VecInt(new int[]{ 5, 6 }), 1);
                        int[] model = s.findModel();
                        s.removeConstr(r);
                        s.removeConstr(r);
                        model = s.findModel();
                    }
                    org.junit.Assert.fail("testSolver_add66 should have thrown NoSuchElementException");
                }
                org.junit.Assert.fail("testSolver_add66_failAssert25litNum483 should have thrown NoSuchElementException");
            }
            org.junit.Assert.fail("testSolver_add66_failAssert25litNum483_failAssert104litNum1647 should have thrown NoSuchElementException");
        } catch (NoSuchElementException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSolver_add66_failAssert25litNum457_failAssert110litNum2069_failAssert412() throws Exception {
        try {
            {
                {
                    ISolver s = SolverFactory.newDefault();
                    int resVars = s.newVar(6);
                    {
                        s.addClause(new VecInt(new int[]{ -1, -4 }));
                        s.addClause(new VecInt(new int[]{ -2, -4 }));
                        s.addClause(new VecInt(new int[]{ 1 }));
                        s.addClause(new VecInt(new int[]{ 3 }));
                        IConstr r = s.addAtMost(new VecInt(new int[]{ 5, 6 }), 2);
                        int[] model = s.findModel();
                        s.removeConstr(r);
                        s.removeConstr(r);
                        model = s.findModel();
                    }
                    org.junit.Assert.fail("testSolver_add66 should have thrown NoSuchElementException");
                }
                org.junit.Assert.fail("testSolver_add66_failAssert25litNum457 should have thrown NoSuchElementException");
            }
            org.junit.Assert.fail("testSolver_add66_failAssert25litNum457_failAssert110litNum2069 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-1", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSolver_add66_failAssert25litNum507_failAssert100litNum1899_failAssert413() throws Exception {
        try {
            {
                {
                    ISolver s = SolverFactory.newDefault();
                    int resVars = s.newVar(6);
                    {
                        s.addClause(new VecInt(new int[]{ -1, -3 }));
                        s.addClause(new VecInt(new int[]{ -2, -5 }));
                        s.addClause(new VecInt(new int[]{ 1 }));
                        s.addClause(new VecInt(new int[]{ 3 }));
                        IConstr r = s.addAtMost(new VecInt(new int[]{ 6, 6 }), 1);
                        int[] model = s.findModel();
                        s.removeConstr(r);
                        s.removeConstr(r);
                        model = s.findModel();
                    }
                    org.junit.Assert.fail("testSolver_add66 should have thrown NoSuchElementException");
                }
                org.junit.Assert.fail("testSolver_add66_failAssert25litNum507 should have thrown NoSuchElementException");
            }
            org.junit.Assert.fail("testSolver_add66_failAssert25litNum507_failAssert100litNum1899 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-1", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSolver_add66_failAssert25litNum483_failAssert104litNum1693_failAssert414() throws Exception {
        try {
            {
                {
                    ISolver s = SolverFactory.newDefault();
                    int resVars = s.newVar(6);
                    {
                        s.addClause(new VecInt(new int[]{ -1, -3 }));
                        s.addClause(new VecInt(new int[]{ -1, -4 }));
                        s.addClause(new VecInt(new int[]{ 1 }));
                        s.addClause(new VecInt(new int[]{ 3 }));
                        IConstr r = s.addAtMost(new VecInt(new int[]{ 5, 6 }), 2);
                        int[] model = s.findModel();
                        s.removeConstr(r);
                        s.removeConstr(r);
                        model = s.findModel();
                    }
                    org.junit.Assert.fail("testSolver_add66 should have thrown NoSuchElementException");
                }
                org.junit.Assert.fail("testSolver_add66_failAssert25litNum483 should have thrown NoSuchElementException");
            }
            org.junit.Assert.fail("testSolver_add66_failAssert25litNum483_failAssert104litNum1693 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-1", expected.getMessage());
        }
    }
}

