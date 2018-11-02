package org.sat4j;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.sat4j.core.VecInt;
import org.sat4j.minisat.SolverFactory;
import org.sat4j.specs.ContradictionException;
import org.sat4j.specs.ISolver;
import org.sat4j.specs.TimeoutException;


public class AmplBugSAT18 {
    private ISolver solver;

    @Before
    public void setup() throws ContradictionException {
        this.solver = SolverFactory.newDefault();
        this.solver.setTimeout(15);
        this.solver.addClause(new VecInt(new int[]{ 1 }));
        this.solver.addClause(new VecInt(new int[]{ -1, 2 }));
        this.solver.addClause(new VecInt(new int[]{ -1, 3 }));
        this.solver.addClause(new VecInt(new int[]{ -2, 1 }));
        this.solver.addClause(new VecInt(new int[]{ -4, 1 }));
        this.solver.addClause(new VecInt(new int[]{ -3, 1 }));
        this.solver.addClause(new VecInt(new int[]{ -3, 5 }));
        this.solver.addClause(new VecInt(new int[]{ -5, 3 }));
        this.solver.addClause(new VecInt(new int[]{ 6 }));
        this.solver.addClause(new VecInt(new int[]{ -7 }));
        this.solver.addClause(new VecInt(new int[]{ 2, 5, 4, 6 }));
    }

    @Test(timeout = 30000)
    public void testAlllitNum1() throws Exception, ContradictionException, TimeoutException {
        boolean o_testAlllitNum1__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 5, -3 }));
        Assert.assertFalse(o_testAlllitNum1__1);
        boolean o_testAlllitNum1__4 = this.solver.isSatisfiable(new VecInt(new int[]{ 5, -3 }));
        Assert.assertFalse(o_testAlllitNum1__4);
        boolean o_testAlllitNum1__7 = this.solver.isSatisfiable(new VecInt(new int[]{ 5, -3 }));
        Assert.assertFalse(o_testAlllitNum1__7);
        Assert.assertFalse(o_testAlllitNum1__1);
        Assert.assertFalse(o_testAlllitNum1__4);
    }

    @Test(timeout = 30000)
    public void testAlllitNum5() throws Exception, ContradictionException, TimeoutException {
        boolean o_testAlllitNum5__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 0, -3 }));
        Assert.assertFalse(o_testAlllitNum5__1);
        boolean o_testAlllitNum5__4 = this.solver.isSatisfiable(new VecInt(new int[]{ 5, -3 }));
        Assert.assertFalse(o_testAlllitNum5__4);
        Assert.assertFalse(o_testAlllitNum5__1);
    }

    @Test(timeout = 30000)
    public void testAlllitNum7() throws Exception, ContradictionException, TimeoutException {
        boolean o_testAlllitNum7__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 4, -4 }));
        Assert.assertFalse(o_testAlllitNum7__1);
        boolean o_testAlllitNum7__4 = this.solver.isSatisfiable(new VecInt(new int[]{ 5, -3 }));
        Assert.assertFalse(o_testAlllitNum7__4);
        Assert.assertFalse(o_testAlllitNum7__1);
    }

    @Test(timeout = 30000)
    public void testAlllitNum8() throws Exception, ContradictionException, TimeoutException {
        boolean o_testAlllitNum8__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 4, -2 }));
        Assert.assertFalse(o_testAlllitNum8__1);
        boolean o_testAlllitNum8__4 = this.solver.isSatisfiable(new VecInt(new int[]{ 5, -3 }));
        Assert.assertFalse(o_testAlllitNum8__4);
        Assert.assertFalse(o_testAlllitNum8__1);
    }

    @Test(timeout = 30000)
    public void testAlllitNum11() throws Exception, ContradictionException, TimeoutException {
        boolean o_testAlllitNum11__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 4, -0 }));
        Assert.assertTrue(o_testAlllitNum11__1);
        boolean o_testAlllitNum11__4 = this.solver.isSatisfiable(new VecInt(new int[]{ 5, -3 }));
        Assert.assertFalse(o_testAlllitNum11__4);
        Assert.assertTrue(o_testAlllitNum11__1);
    }

    @Test(timeout = 30000)
    public void testAlllitNum14() throws Exception, ContradictionException, TimeoutException {
        boolean o_testAlllitNum14__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 4, -3 }));
        Assert.assertFalse(o_testAlllitNum14__1);
        boolean o_testAlllitNum14__4 = this.solver.isSatisfiable(new VecInt(new int[]{ 4, -3 }));
        Assert.assertFalse(o_testAlllitNum14__4);
        boolean o_testAlllitNum14__7 = this.solver.isSatisfiable(new VecInt(new int[]{ 4, -3 }));
        Assert.assertFalse(o_testAlllitNum14__7);
        Assert.assertFalse(o_testAlllitNum14__1);
        Assert.assertFalse(o_testAlllitNum14__4);
    }

    @Test(timeout = 30000)
    public void testAlllitNum17() throws Exception, ContradictionException, TimeoutException {
        boolean o_testAlllitNum17__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 4, -3 }));
        Assert.assertFalse(o_testAlllitNum17__1);
        boolean o_testAlllitNum17__4 = this.solver.isSatisfiable(new VecInt(new int[]{ 0, -3 }));
        Assert.assertFalse(o_testAlllitNum17__4);
        Assert.assertFalse(o_testAlllitNum17__1);
    }

    @Test(timeout = 30000)
    public void testAlllitNum19() throws Exception, ContradictionException, TimeoutException {
        boolean o_testAlllitNum19__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 4, -3 }));
        Assert.assertFalse(o_testAlllitNum19__1);
        boolean o_testAlllitNum19__4 = this.solver.isSatisfiable(new VecInt(new int[]{ 5, -4 }));
        Assert.assertTrue(o_testAlllitNum19__4);
        Assert.assertFalse(o_testAlllitNum19__1);
    }

    @Test(timeout = 30000)
    public void testAlllitNum23() throws Exception, ContradictionException, TimeoutException {
        boolean o_testAlllitNum23__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 4, -3 }));
        Assert.assertFalse(o_testAlllitNum23__1);
        boolean o_testAlllitNum23__4 = this.solver.isSatisfiable(new VecInt(new int[]{ 5, -0 }));
        Assert.assertTrue(o_testAlllitNum23__4);
        Assert.assertFalse(o_testAlllitNum23__1);
    }

    @Test(timeout = 30000)
    public void testAlllitNum3_failAssert0() throws Exception, ContradictionException, TimeoutException {
        try {
            this.solver.isSatisfiable(new VecInt(new int[]{ Integer.MAX_VALUE, -3 }));
            this.solver.isSatisfiable(new VecInt(new int[]{ 5, -3 }));
            org.junit.Assert.fail("testAlllitNum3 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testAlllitNum9_failAssert3() throws Exception, ContradictionException, TimeoutException {
        try {
            this.solver.isSatisfiable(new VecInt(new int[]{ 4, -(Integer.MAX_VALUE) }));
            this.solver.isSatisfiable(new VecInt(new int[]{ 5, -3 }));
            org.junit.Assert.fail("testAlllitNum9 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testAlllitNum15_failAssert5() throws Exception, ContradictionException, TimeoutException {
        try {
            this.solver.isSatisfiable(new VecInt(new int[]{ 4, -3 }));
            this.solver.isSatisfiable(new VecInt(new int[]{ Integer.MAX_VALUE, -3 }));
            org.junit.Assert.fail("testAlllitNum15 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testAlllitNum22_failAssert8() throws Exception, ContradictionException, TimeoutException {
        try {
            this.solver.isSatisfiable(new VecInt(new int[]{ 4, -3 }));
            this.solver.isSatisfiable(new VecInt(new int[]{ 5, -(Integer.MIN_VALUE) }));
            org.junit.Assert.fail("testAlllitNum22 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-2147483648", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testAlllitNum14_add256() throws Exception, ContradictionException, TimeoutException {
        boolean o_testAlllitNum14__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 4, -3 }));
        boolean o_testAlllitNum14__4 = this.solver.isSatisfiable(new VecInt(new int[]{ 4, -3 }));
        boolean o_testAlllitNum14_add256__11 = this.solver.isSatisfiable(new VecInt(new int[]{ 4, -3 }));
        Assert.assertFalse(o_testAlllitNum14_add256__11);
        boolean o_testAlllitNum14__7 = this.solver.isSatisfiable(new VecInt(new int[]{ 4, -3 }));
        Assert.assertFalse(o_testAlllitNum14_add256__11);
    }

    @Test(timeout = 30000)
    public void testAlllitNum1_add276() throws Exception, ContradictionException, TimeoutException {
        boolean o_testAlllitNum1__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 5, -3 }));
        boolean o_testAlllitNum1_add276__6 = this.solver.isSatisfiable(new VecInt(new int[]{ 5, -3 }));
        Assert.assertFalse(o_testAlllitNum1_add276__6);
        boolean o_testAlllitNum1__4 = this.solver.isSatisfiable(new VecInt(new int[]{ 5, -3 }));
        boolean o_testAlllitNum1__7 = this.solver.isSatisfiable(new VecInt(new int[]{ 5, -3 }));
        Assert.assertFalse(o_testAlllitNum1_add276__6);
    }

    @Test(timeout = 30000)
    public void testAlllitNum5_add190() throws Exception, ContradictionException, TimeoutException {
        boolean o_testAlllitNum5_add190__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 0, -3 }));
        Assert.assertFalse(o_testAlllitNum5_add190__1);
        boolean o_testAlllitNum5__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 0, -3 }));
        boolean o_testAlllitNum5__4 = this.solver.isSatisfiable(new VecInt(new int[]{ 5, -3 }));
        Assert.assertFalse(o_testAlllitNum5_add190__1);
    }

    @Test(timeout = 30000)
    public void testAlllitNum7_add234() throws Exception, ContradictionException, TimeoutException {
        boolean o_testAlllitNum7_add234__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 4, -4 }));
        Assert.assertFalse(o_testAlllitNum7_add234__1);
        boolean o_testAlllitNum7__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 4, -4 }));
        boolean o_testAlllitNum7__4 = this.solver.isSatisfiable(new VecInt(new int[]{ 5, -3 }));
        Assert.assertFalse(o_testAlllitNum7_add234__1);
    }

    @Test(timeout = 30000)
    public void testAlllitNum8_add131() throws Exception, ContradictionException, TimeoutException {
        boolean o_testAlllitNum8__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 4, -2 }));
        boolean o_testAlllitNum8_add131__6 = this.solver.isSatisfiable(new VecInt(new int[]{ 5, -3 }));
        Assert.assertFalse(o_testAlllitNum8_add131__6);
        boolean o_testAlllitNum8__4 = this.solver.isSatisfiable(new VecInt(new int[]{ 5, -3 }));
        Assert.assertFalse(o_testAlllitNum8_add131__6);
    }

    @Test(timeout = 30000)
    public void testAlllitNum11_add270() throws Exception, ContradictionException, TimeoutException {
        boolean o_testAlllitNum11_add270__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 4, -0 }));
        Assert.assertTrue(o_testAlllitNum11_add270__1);
        boolean o_testAlllitNum11__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 4, -0 }));
        boolean o_testAlllitNum11__4 = this.solver.isSatisfiable(new VecInt(new int[]{ 5, -3 }));
        Assert.assertTrue(o_testAlllitNum11_add270__1);
    }

    @Test(timeout = 30000)
    public void testAlllitNum23_add132() throws Exception, ContradictionException, TimeoutException {
        boolean o_testAlllitNum23_add132__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 4, -3 }));
        Assert.assertFalse(o_testAlllitNum23_add132__1);
        boolean o_testAlllitNum23__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 4, -3 }));
        boolean o_testAlllitNum23__4 = this.solver.isSatisfiable(new VecInt(new int[]{ 5, -0 }));
        Assert.assertFalse(o_testAlllitNum23_add132__1);
    }

    @Test(timeout = 30000)
    public void testAlllitNum23_add134() throws Exception, ContradictionException, TimeoutException {
        boolean o_testAlllitNum23__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 4, -3 }));
        boolean o_testAlllitNum23_add134__6 = this.solver.isSatisfiable(new VecInt(new int[]{ 5, -0 }));
        Assert.assertTrue(o_testAlllitNum23_add134__6);
        boolean o_testAlllitNum23__4 = this.solver.isSatisfiable(new VecInt(new int[]{ 5, -0 }));
        Assert.assertTrue(o_testAlllitNum23_add134__6);
    }

    @Test(timeout = 30000)
    public void testAlllitNum19_add126() throws Exception, ContradictionException, TimeoutException {
        boolean o_testAlllitNum19_add126__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 4, -3 }));
        Assert.assertFalse(o_testAlllitNum19_add126__1);
        boolean o_testAlllitNum19__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 4, -3 }));
        boolean o_testAlllitNum19__4 = this.solver.isSatisfiable(new VecInt(new int[]{ 5, -4 }));
        Assert.assertFalse(o_testAlllitNum19_add126__1);
    }

    @Test(timeout = 30000)
    public void testAlllitNum19_add128() throws Exception, ContradictionException, TimeoutException {
        boolean o_testAlllitNum19__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 4, -3 }));
        boolean o_testAlllitNum19_add128__6 = this.solver.isSatisfiable(new VecInt(new int[]{ 5, -4 }));
        Assert.assertTrue(o_testAlllitNum19_add128__6);
        boolean o_testAlllitNum19__4 = this.solver.isSatisfiable(new VecInt(new int[]{ 5, -4 }));
        Assert.assertTrue(o_testAlllitNum19_add128__6);
    }

    @Test(timeout = 30000)
    public void testAlllitNum17_add164() throws Exception, ContradictionException, TimeoutException {
        boolean o_testAlllitNum17__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 4, -3 }));
        boolean o_testAlllitNum17_add164__6 = this.solver.isSatisfiable(new VecInt(new int[]{ 0, -3 }));
        Assert.assertFalse(o_testAlllitNum17_add164__6);
        boolean o_testAlllitNum17__4 = this.solver.isSatisfiable(new VecInt(new int[]{ 0, -3 }));
        Assert.assertFalse(o_testAlllitNum17_add164__6);
    }

    @Test(timeout = 30000)
    public void testAlllitNum14litNum196_failAssert9() throws Exception, ContradictionException, TimeoutException {
        try {
            boolean o_testAlllitNum14__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 4, -3 }));
            boolean o_testAlllitNum14__4 = this.solver.isSatisfiable(new VecInt(new int[]{ 4, -(Integer.MAX_VALUE) }));
            boolean o_testAlllitNum14__7 = this.solver.isSatisfiable(new VecInt(new int[]{ 4, -3 }));
            org.junit.Assert.fail("testAlllitNum14litNum196 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testAlllitNum14litNum146_failAssert10() throws Exception, ContradictionException, TimeoutException {
        try {
            boolean o_testAlllitNum14__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 4, -(Integer.MAX_VALUE) }));
            boolean o_testAlllitNum14__4 = this.solver.isSatisfiable(new VecInt(new int[]{ 4, -3 }));
            boolean o_testAlllitNum14__7 = this.solver.isSatisfiable(new VecInt(new int[]{ 4, -3 }));
            org.junit.Assert.fail("testAlllitNum14litNum146 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testAlllitNum1litNum199_failAssert17() throws Exception, ContradictionException, TimeoutException {
        try {
            boolean o_testAlllitNum1__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 5, -3 }));
            boolean o_testAlllitNum1__4 = this.solver.isSatisfiable(new VecInt(new int[]{ 5, -(Integer.MAX_VALUE) }));
            boolean o_testAlllitNum1__7 = this.solver.isSatisfiable(new VecInt(new int[]{ 5, -3 }));
            org.junit.Assert.fail("testAlllitNum1litNum199 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testAlllitNum5litNum160_failAssert27() throws Exception, ContradictionException, TimeoutException {
        try {
            boolean o_testAlllitNum5__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 0, -3 }));
            boolean o_testAlllitNum5__4 = this.solver.isSatisfiable(new VecInt(new int[]{ Integer.MAX_VALUE, -3 }));
            org.junit.Assert.fail("testAlllitNum5litNum160 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testAlllitNum7litNum203_failAssert30() throws Exception, ContradictionException, TimeoutException {
        try {
            boolean o_testAlllitNum7__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 4, -4 }));
            boolean o_testAlllitNum7__4 = this.solver.isSatisfiable(new VecInt(new int[]{ Integer.MAX_VALUE, -3 }));
            org.junit.Assert.fail("testAlllitNum7litNum203 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testAlllitNum8litNum116_failAssert38() throws Exception, ContradictionException, TimeoutException {
        try {
            boolean o_testAlllitNum8__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 4, -2 }));
            boolean o_testAlllitNum8__4 = this.solver.isSatisfiable(new VecInt(new int[]{ 5, -(Integer.MAX_VALUE) }));
            org.junit.Assert.fail("testAlllitNum8litNum116 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testAlllitNum11litNum245_failAssert40() throws Exception, ContradictionException, TimeoutException {
        try {
            boolean o_testAlllitNum11__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 4, -0 }));
            boolean o_testAlllitNum11__4 = this.solver.isSatisfiable(new VecInt(new int[]{ Integer.MAX_VALUE, -3 }));
            org.junit.Assert.fail("testAlllitNum11litNum245 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testAlllitNum3_failAssert0_add312_failAssert52() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                this.solver.isSatisfiable(new VecInt(new int[]{ Integer.MAX_VALUE, -3 }));
                this.solver.isSatisfiable(new VecInt(new int[]{ Integer.MAX_VALUE, -3 }));
                this.solver.isSatisfiable(new VecInt(new int[]{ 5, -3 }));
                org.junit.Assert.fail("testAlllitNum3 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testAlllitNum3_failAssert0_add312 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testAlllitNum14_add256_add1159() throws Exception, ContradictionException, TimeoutException {
        boolean o_testAlllitNum14__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 4, -3 }));
        boolean o_testAlllitNum14__4 = this.solver.isSatisfiable(new VecInt(new int[]{ 4, -3 }));
        boolean o_testAlllitNum14_add256__11 = this.solver.isSatisfiable(new VecInt(new int[]{ 4, -3 }));
        boolean o_testAlllitNum14_add256_add1159__16 = this.solver.isSatisfiable(new VecInt(new int[]{ 4, -3 }));
        Assert.assertFalse(o_testAlllitNum14_add256_add1159__16);
        boolean o_testAlllitNum14__7 = this.solver.isSatisfiable(new VecInt(new int[]{ 4, -3 }));
        Assert.assertFalse(o_testAlllitNum14_add256_add1159__16);
    }

    @Test(timeout = 30000)
    public void testAlllitNum1_add276_add1139() throws Exception, ContradictionException, TimeoutException {
        boolean o_testAlllitNum1__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 5, -3 }));
        boolean o_testAlllitNum1_add276_add1139__6 = this.solver.isSatisfiable(new VecInt(new int[]{ 5, -3 }));
        Assert.assertFalse(o_testAlllitNum1_add276_add1139__6);
        boolean o_testAlllitNum1_add276__6 = this.solver.isSatisfiable(new VecInt(new int[]{ 5, -3 }));
        boolean o_testAlllitNum1__4 = this.solver.isSatisfiable(new VecInt(new int[]{ 5, -3 }));
        boolean o_testAlllitNum1__7 = this.solver.isSatisfiable(new VecInt(new int[]{ 5, -3 }));
        Assert.assertFalse(o_testAlllitNum1_add276_add1139__6);
    }

    @Test(timeout = 30000)
    public void testAlllitNum3_failAssert0_add312_failAssert52_add956_failAssert102() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    this.solver.isSatisfiable(new VecInt(new int[]{ Integer.MAX_VALUE, -3 }));
                    this.solver.isSatisfiable(new VecInt(new int[]{ Integer.MAX_VALUE, -3 }));
                    this.solver.isSatisfiable(new VecInt(new int[]{ Integer.MAX_VALUE, -3 }));
                    this.solver.isSatisfiable(new VecInt(new int[]{ 5, -3 }));
                    org.junit.Assert.fail("testAlllitNum3 should have thrown NegativeArraySizeException");
                }
                org.junit.Assert.fail("testAlllitNum3_failAssert0_add312 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testAlllitNum3_failAssert0_add312_failAssert52_add956 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testAlllitNum14litNum146_failAssert10_add1002_failAssert105() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                this.solver.isSatisfiable(new VecInt(new int[]{ 4, -(Integer.MAX_VALUE) }));
                boolean o_testAlllitNum14__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 4, -(Integer.MAX_VALUE) }));
                boolean o_testAlllitNum14__4 = this.solver.isSatisfiable(new VecInt(new int[]{ 4, -3 }));
                boolean o_testAlllitNum14__7 = this.solver.isSatisfiable(new VecInt(new int[]{ 4, -3 }));
                org.junit.Assert.fail("testAlllitNum14litNum146 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testAlllitNum14litNum146_failAssert10_add1002 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testAlllitNum14litNum196_failAssert9_add848_failAssert106() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                boolean o_testAlllitNum14__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 4, -3 }));
                this.solver.isSatisfiable(new VecInt(new int[]{ 4, -(Integer.MAX_VALUE) }));
                boolean o_testAlllitNum14__4 = this.solver.isSatisfiable(new VecInt(new int[]{ 4, -(Integer.MAX_VALUE) }));
                boolean o_testAlllitNum14__7 = this.solver.isSatisfiable(new VecInt(new int[]{ 4, -3 }));
                org.junit.Assert.fail("testAlllitNum14litNum196 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testAlllitNum14litNum196_failAssert9_add848 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testAlllitNum1litNum199_failAssert17_add934_failAssert107() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                boolean o_testAlllitNum1__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 5, -3 }));
                this.solver.isSatisfiable(new VecInt(new int[]{ 5, -(Integer.MAX_VALUE) }));
                boolean o_testAlllitNum1__4 = this.solver.isSatisfiable(new VecInt(new int[]{ 5, -(Integer.MAX_VALUE) }));
                boolean o_testAlllitNum1__7 = this.solver.isSatisfiable(new VecInt(new int[]{ 5, -3 }));
                org.junit.Assert.fail("testAlllitNum1litNum199 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testAlllitNum1litNum199_failAssert17_add934 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testAlllitNum14litNum196_failAssert9litNum786_failAssert174() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                boolean o_testAlllitNum14__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 4, -4 }));
                boolean o_testAlllitNum14__4 = this.solver.isSatisfiable(new VecInt(new int[]{ 4, -(Integer.MAX_VALUE) }));
                boolean o_testAlllitNum14__7 = this.solver.isSatisfiable(new VecInt(new int[]{ 4, -3 }));
                org.junit.Assert.fail("testAlllitNum14litNum196 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testAlllitNum14litNum196_failAssert9litNum786 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testAlllitNum14litNum196_failAssert9litNum800_failAssert181() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                boolean o_testAlllitNum14__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 4, -0 }));
                boolean o_testAlllitNum14__4 = this.solver.isSatisfiable(new VecInt(new int[]{ 4, -(Integer.MAX_VALUE) }));
                boolean o_testAlllitNum14__7 = this.solver.isSatisfiable(new VecInt(new int[]{ 4, -3 }));
                org.junit.Assert.fail("testAlllitNum14litNum196 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testAlllitNum14litNum196_failAssert9litNum800 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testAlllitNum1litNum199_failAssert17litNum861_failAssert185() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                boolean o_testAlllitNum1__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 5, -4 }));
                boolean o_testAlllitNum1__4 = this.solver.isSatisfiable(new VecInt(new int[]{ 5, -(Integer.MAX_VALUE) }));
                boolean o_testAlllitNum1__7 = this.solver.isSatisfiable(new VecInt(new int[]{ 5, -3 }));
                org.junit.Assert.fail("testAlllitNum1litNum199 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testAlllitNum1litNum199_failAssert17litNum861 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testAlllitNum1litNum199_failAssert17litNum874_failAssert186() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                boolean o_testAlllitNum1__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 5, -0 }));
                boolean o_testAlllitNum1__4 = this.solver.isSatisfiable(new VecInt(new int[]{ 5, -(Integer.MAX_VALUE) }));
                boolean o_testAlllitNum1__7 = this.solver.isSatisfiable(new VecInt(new int[]{ 5, -3 }));
                org.junit.Assert.fail("testAlllitNum1litNum199 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testAlllitNum1litNum199_failAssert17litNum874 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testAlllitNum8_add131litNum913_failAssert191() throws Exception, ContradictionException, TimeoutException {
        try {
            boolean o_testAlllitNum8__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 4, -2 }));
            boolean o_testAlllitNum8_add131__6 = this.solver.isSatisfiable(new VecInt(new int[]{ 5, -3 }));
            boolean o_testAlllitNum8__4 = this.solver.isSatisfiable(new VecInt(new int[]{ Integer.MIN_VALUE, -3 }));
            org.junit.Assert.fail("testAlllitNum8_add131litNum913 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-2147483648", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSingle1litNum1633() throws Exception, ContradictionException, TimeoutException {
        boolean o_testSingle1litNum1633__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 5, -3 }));
        Assert.assertFalse(o_testSingle1litNum1633__1);
    }

    @Test(timeout = 30000)
    public void testSingle1litNum1634() throws Exception, ContradictionException, TimeoutException {
        boolean o_testSingle1litNum1634__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 3, -3 }));
        Assert.assertFalse(o_testSingle1litNum1634__1);
    }

    @Test(timeout = 30000)
    public void testSingle1litNum1637() throws Exception, ContradictionException, TimeoutException {
        boolean o_testSingle1litNum1637__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 0, -3 }));
        Assert.assertFalse(o_testSingle1litNum1637__1);
    }

    @Test(timeout = 30000)
    public void testSingle1litNum1639() throws Exception, ContradictionException, TimeoutException {
        boolean o_testSingle1litNum1639__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 4, -4 }));
        Assert.assertFalse(o_testSingle1litNum1639__1);
    }

    @Test(timeout = 30000)
    public void testSingle1litNum1640() throws Exception, ContradictionException, TimeoutException {
        boolean o_testSingle1litNum1640__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 4, -2 }));
        Assert.assertFalse(o_testSingle1litNum1640__1);
    }

    @Test(timeout = 30000)
    public void testSingle1litNum1643() throws Exception, ContradictionException, TimeoutException {
        boolean o_testSingle1litNum1643__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 4, -0 }));
        Assert.assertTrue(o_testSingle1litNum1643__1);
    }

    @Test(timeout = 30000)
    public void testSingle1_add1645() throws Exception, ContradictionException, TimeoutException {
        boolean o_testSingle1_add1645__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 4, -3 }));
        Assert.assertFalse(o_testSingle1_add1645__1);
        boolean o_testSingle1_add1645__4 = this.solver.isSatisfiable(new VecInt(new int[]{ 4, -3 }));
        Assert.assertFalse(o_testSingle1_add1645__4);
        Assert.assertFalse(o_testSingle1_add1645__1);
    }

    @Test(timeout = 30000)
    public void testSingle1litNum1635_failAssert193() throws Exception, ContradictionException, TimeoutException {
        try {
            this.solver.isSatisfiable(new VecInt(new int[]{ Integer.MAX_VALUE, -3 }));
            org.junit.Assert.fail("testSingle1litNum1635 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSingle1litNum1641_failAssert195() throws Exception, ContradictionException, TimeoutException {
        try {
            this.solver.isSatisfiable(new VecInt(new int[]{ 4, -(Integer.MAX_VALUE) }));
            org.junit.Assert.fail("testSingle1litNum1641 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSingle1litNum1642_failAssert196() throws Exception, ContradictionException, TimeoutException {
        try {
            this.solver.isSatisfiable(new VecInt(new int[]{ 4, -(Integer.MIN_VALUE) }));
            org.junit.Assert.fail("testSingle1litNum1642 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-2147483648", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSingle1litNum1633_add1719() throws Exception, ContradictionException, TimeoutException {
        boolean o_testSingle1litNum1633_add1719__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 5, -3 }));
        Assert.assertFalse(o_testSingle1litNum1633_add1719__1);
        boolean o_testSingle1litNum1633__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 5, -3 }));
        Assert.assertFalse(o_testSingle1litNum1633_add1719__1);
    }

    @Test(timeout = 30000)
    public void testSingle1litNum1637_add1700() throws Exception, ContradictionException, TimeoutException {
        boolean o_testSingle1litNum1637_add1700__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 0, -3 }));
        Assert.assertFalse(o_testSingle1litNum1637_add1700__1);
        boolean o_testSingle1litNum1637__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 0, -3 }));
        Assert.assertFalse(o_testSingle1litNum1637_add1700__1);
    }

    @Test(timeout = 30000)
    public void testSingle1litNum1639_add1710() throws Exception, ContradictionException, TimeoutException {
        boolean o_testSingle1litNum1639_add1710__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 4, -4 }));
        Assert.assertFalse(o_testSingle1litNum1639_add1710__1);
        boolean o_testSingle1litNum1639__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 4, -4 }));
        Assert.assertFalse(o_testSingle1litNum1639_add1710__1);
    }

    @Test(timeout = 30000)
    public void testSingle1litNum1640_add1704() throws Exception, ContradictionException, TimeoutException {
        boolean o_testSingle1litNum1640_add1704__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 4, -2 }));
        Assert.assertFalse(o_testSingle1litNum1640_add1704__1);
        boolean o_testSingle1litNum1640__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 4, -2 }));
        Assert.assertFalse(o_testSingle1litNum1640_add1704__1);
    }

    @Test(timeout = 30000)
    public void testSingle1litNum1643_add1727() throws Exception, ContradictionException, TimeoutException {
        boolean o_testSingle1litNum1643_add1727__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 4, -0 }));
        Assert.assertTrue(o_testSingle1litNum1643_add1727__1);
        boolean o_testSingle1litNum1643__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 4, -0 }));
        Assert.assertTrue(o_testSingle1litNum1643_add1727__1);
    }

    @Test(timeout = 30000)
    public void testSingle1_add1645_add1750() throws Exception, ContradictionException, TimeoutException {
        boolean o_testSingle1_add1645_add1750__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 4, -3 }));
        Assert.assertFalse(o_testSingle1_add1645_add1750__1);
        boolean o_testSingle1_add1645__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 4, -3 }));
        boolean o_testSingle1_add1645__4 = this.solver.isSatisfiable(new VecInt(new int[]{ 4, -3 }));
        Assert.assertFalse(o_testSingle1_add1645_add1750__1);
    }

    @Test(timeout = 30000)
    public void testSingle1litNum1633litNum1709_failAssert197() throws Exception, ContradictionException, TimeoutException {
        try {
            boolean o_testSingle1litNum1633__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 5, -(Integer.MAX_VALUE) }));
            org.junit.Assert.fail("testSingle1litNum1633litNum1709 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSingle1_add1645litNum1692_failAssert203() throws Exception, ContradictionException, TimeoutException {
        try {
            boolean o_testSingle1_add1645__1 = this.solver.isSatisfiable(new VecInt(new int[]{ Integer.MAX_VALUE, -3 }));
            boolean o_testSingle1_add1645__4 = this.solver.isSatisfiable(new VecInt(new int[]{ 4, -3 }));
            org.junit.Assert.fail("testSingle1_add1645litNum1692 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSingle1_add1645litNum1730_failAssert208() throws Exception, ContradictionException, TimeoutException {
        try {
            boolean o_testSingle1_add1645__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 4, -3 }));
            boolean o_testSingle1_add1645__4 = this.solver.isSatisfiable(new VecInt(new int[]{ Integer.MAX_VALUE, -3 }));
            org.junit.Assert.fail("testSingle1_add1645litNum1730 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSingle1litNum1633_add1719_add2058() throws Exception, ContradictionException, TimeoutException {
        boolean o_testSingle1litNum1633_add1719_add2058__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 5, -3 }));
        Assert.assertFalse(o_testSingle1litNum1633_add1719_add2058__1);
        boolean o_testSingle1litNum1633_add1719__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 5, -3 }));
        boolean o_testSingle1litNum1633__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 5, -3 }));
        Assert.assertFalse(o_testSingle1litNum1633_add1719_add2058__1);
    }

    @Test(timeout = 30000)
    public void testSingle1litNum1637_add1700_add2014() throws Exception, ContradictionException, TimeoutException {
        boolean o_testSingle1litNum1637_add1700_add2014__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 0, -3 }));
        Assert.assertFalse(o_testSingle1litNum1637_add1700_add2014__1);
        boolean o_testSingle1litNum1637_add1700__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 0, -3 }));
        boolean o_testSingle1litNum1637__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 0, -3 }));
        Assert.assertFalse(o_testSingle1litNum1637_add1700_add2014__1);
    }

    @Test(timeout = 30000)
    public void testSingle1litNum1639_add1710_add1957() throws Exception, ContradictionException, TimeoutException {
        boolean o_testSingle1litNum1639_add1710_add1957__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 4, -4 }));
        Assert.assertFalse(o_testSingle1litNum1639_add1710_add1957__1);
        boolean o_testSingle1litNum1639_add1710__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 4, -4 }));
        boolean o_testSingle1litNum1639__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 4, -4 }));
        Assert.assertFalse(o_testSingle1litNum1639_add1710_add1957__1);
    }

    @Test(timeout = 30000)
    public void testSingle1litNum1640_add1704_add2001() throws Exception, ContradictionException, TimeoutException {
        boolean o_testSingle1litNum1640_add1704_add2001__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 4, -2 }));
        Assert.assertFalse(o_testSingle1litNum1640_add1704_add2001__1);
        boolean o_testSingle1litNum1640_add1704__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 4, -2 }));
        boolean o_testSingle1litNum1640__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 4, -2 }));
        Assert.assertFalse(o_testSingle1litNum1640_add1704_add2001__1);
    }

    @Test(timeout = 30000)
    public void testSingle1litNum1643_add1727_add1956() throws Exception, ContradictionException, TimeoutException {
        boolean o_testSingle1litNum1643_add1727_add1956__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 4, -0 }));
        Assert.assertTrue(o_testSingle1litNum1643_add1727_add1956__1);
        boolean o_testSingle1litNum1643_add1727__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 4, -0 }));
        boolean o_testSingle1litNum1643__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 4, -0 }));
        Assert.assertTrue(o_testSingle1litNum1643_add1727_add1956__1);
    }

    @Test(timeout = 30000)
    public void testSingle1litNum1633_add1719litNum2033_failAssert234() throws Exception, ContradictionException, TimeoutException {
        try {
            boolean o_testSingle1litNum1633_add1719__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 5, -(Integer.MAX_VALUE) }));
            boolean o_testSingle1litNum1633__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 5, -3 }));
            org.junit.Assert.fail("testSingle1litNum1633_add1719litNum2033 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSingle1litNum1633_add1719litNum2049_failAssert236() throws Exception, ContradictionException, TimeoutException {
        try {
            boolean o_testSingle1litNum1633_add1719__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 5, -3 }));
            boolean o_testSingle1litNum1633__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 5, -(Integer.MAX_VALUE) }));
            org.junit.Assert.fail("testSingle1litNum1633_add1719litNum2049 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSingle1litNum1637_add1700litNum1999_failAssert241() throws Exception, ContradictionException, TimeoutException {
        try {
            boolean o_testSingle1litNum1637_add1700__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 0, -3 }));
            boolean o_testSingle1litNum1637__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 0, -(Integer.MAX_VALUE) }));
            org.junit.Assert.fail("testSingle1litNum1637_add1700litNum1999 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSingle1litNum1639_add1710litNum1938_failAssert243() throws Exception, ContradictionException, TimeoutException {
        try {
            boolean o_testSingle1litNum1639_add1710__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 4, -4 }));
            boolean o_testSingle1litNum1639__1 = this.solver.isSatisfiable(new VecInt(new int[]{ Integer.MAX_VALUE, -4 }));
            org.junit.Assert.fail("testSingle1litNum1639_add1710litNum1938 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSingle1litNum1640_add1704litNum1982_failAssert245() throws Exception, ContradictionException, TimeoutException {
        try {
            boolean o_testSingle1litNum1640_add1704__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 4, -2 }));
            boolean o_testSingle1litNum1640__1 = this.solver.isSatisfiable(new VecInt(new int[]{ Integer.MAX_VALUE, -2 }));
            org.junit.Assert.fail("testSingle1litNum1640_add1704litNum1982 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSingle1litNum1640_add1704litNum1986_failAssert246() throws Exception, ContradictionException, TimeoutException {
        try {
            boolean o_testSingle1litNum1640_add1704__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 4, -2 }));
            boolean o_testSingle1litNum1640__1 = this.solver.isSatisfiable(new VecInt(new int[]{ Integer.MIN_VALUE, -2 }));
            org.junit.Assert.fail("testSingle1litNum1640_add1704litNum1986 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-2147483648", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSingle1litNum1643_add1727litNum1935_failAssert247() throws Exception, ContradictionException, TimeoutException {
        try {
            boolean o_testSingle1litNum1643_add1727__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 4, -0 }));
            boolean o_testSingle1litNum1643__1 = this.solver.isSatisfiable(new VecInt(new int[]{ Integer.MAX_VALUE, -0 }));
            org.junit.Assert.fail("testSingle1litNum1643_add1727litNum1935 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSingle1_add1645_add1750litNum1937_failAssert249() throws Exception, ContradictionException, TimeoutException {
        try {
            boolean o_testSingle1_add1645_add1750__1 = this.solver.isSatisfiable(new VecInt(new int[]{ Integer.MAX_VALUE, -3 }));
            boolean o_testSingle1_add1645__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 4, -3 }));
            boolean o_testSingle1_add1645__4 = this.solver.isSatisfiable(new VecInt(new int[]{ 4, -3 }));
            org.junit.Assert.fail("testSingle1_add1645_add1750litNum1937 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSingle2litNum2380() throws Exception, ContradictionException, TimeoutException {
        boolean o_testSingle2litNum2380__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 6, -3 }));
        Assert.assertFalse(o_testSingle2litNum2380__1);
    }

    @Test(timeout = 30000)
    public void testSingle2litNum2381() throws Exception, ContradictionException, TimeoutException {
        boolean o_testSingle2litNum2381__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 4, -3 }));
        Assert.assertFalse(o_testSingle2litNum2381__1);
    }

    @Test(timeout = 30000)
    public void testSingle2litNum2384() throws Exception, ContradictionException, TimeoutException {
        boolean o_testSingle2litNum2384__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 0, -3 }));
        Assert.assertFalse(o_testSingle2litNum2384__1);
    }

    @Test(timeout = 30000)
    public void testSingle2litNum2386() throws Exception, ContradictionException, TimeoutException {
        boolean o_testSingle2litNum2386__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 5, -4 }));
        Assert.assertTrue(o_testSingle2litNum2386__1);
    }

    @Test(timeout = 30000)
    public void testSingle2litNum2390() throws Exception, ContradictionException, TimeoutException {
        boolean o_testSingle2litNum2390__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 5, -0 }));
        Assert.assertTrue(o_testSingle2litNum2390__1);
    }

    @Test(timeout = 30000)
    public void testSingle2_add2392() throws Exception, ContradictionException, TimeoutException {
        boolean o_testSingle2_add2392__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 5, -3 }));
        Assert.assertFalse(o_testSingle2_add2392__1);
        boolean o_testSingle2_add2392__4 = this.solver.isSatisfiable(new VecInt(new int[]{ 5, -3 }));
        Assert.assertFalse(o_testSingle2_add2392__4);
        Assert.assertFalse(o_testSingle2_add2392__1);
    }

    @Test(timeout = 30000)
    public void testSingle2litNum2382_failAssert301() throws Exception, ContradictionException, TimeoutException {
        try {
            this.solver.isSatisfiable(new VecInt(new int[]{ Integer.MAX_VALUE, -3 }));
            org.junit.Assert.fail("testSingle2litNum2382 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSingle2litNum2383_failAssert302() throws Exception, ContradictionException, TimeoutException {
        try {
            this.solver.isSatisfiable(new VecInt(new int[]{ Integer.MIN_VALUE, -3 }));
            org.junit.Assert.fail("testSingle2litNum2383 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-2147483648", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSingle2litNum2388_failAssert303() throws Exception, ContradictionException, TimeoutException {
        try {
            this.solver.isSatisfiable(new VecInt(new int[]{ 5, -(Integer.MAX_VALUE) }));
            org.junit.Assert.fail("testSingle2litNum2388 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSingle2litNum2380_add2495() throws Exception, ContradictionException, TimeoutException {
        boolean o_testSingle2litNum2380_add2495__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 6, -3 }));
        Assert.assertFalse(o_testSingle2litNum2380_add2495__1);
        boolean o_testSingle2litNum2380__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 6, -3 }));
        Assert.assertFalse(o_testSingle2litNum2380_add2495__1);
    }

    @Test(timeout = 30000)
    public void testSingle2litNum2381_add2480() throws Exception, ContradictionException, TimeoutException {
        boolean o_testSingle2litNum2381_add2480__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 4, -3 }));
        Assert.assertFalse(o_testSingle2litNum2381_add2480__1);
        boolean o_testSingle2litNum2381__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 4, -3 }));
        Assert.assertFalse(o_testSingle2litNum2381_add2480__1);
    }

    @Test(timeout = 30000)
    public void testSingle2litNum2384_add2452() throws Exception, ContradictionException, TimeoutException {
        boolean o_testSingle2litNum2384_add2452__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 0, -3 }));
        Assert.assertFalse(o_testSingle2litNum2384_add2452__1);
        boolean o_testSingle2litNum2384__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 0, -3 }));
        Assert.assertFalse(o_testSingle2litNum2384_add2452__1);
    }

    @Test(timeout = 30000)
    public void testSingle2litNum2386_add2464() throws Exception, ContradictionException, TimeoutException {
        boolean o_testSingle2litNum2386_add2464__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 5, -4 }));
        Assert.assertTrue(o_testSingle2litNum2386_add2464__1);
        boolean o_testSingle2litNum2386__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 5, -4 }));
        Assert.assertTrue(o_testSingle2litNum2386_add2464__1);
    }

    @Test(timeout = 30000)
    public void testSingle2litNum2390_add2481() throws Exception, ContradictionException, TimeoutException {
        boolean o_testSingle2litNum2390_add2481__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 5, -0 }));
        Assert.assertTrue(o_testSingle2litNum2390_add2481__1);
        boolean o_testSingle2litNum2390__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 5, -0 }));
        Assert.assertTrue(o_testSingle2litNum2390_add2481__1);
    }

    @Test(timeout = 30000)
    public void testSingle2litNum2380litNum2489_failAssert305() throws Exception, ContradictionException, TimeoutException {
        try {
            boolean o_testSingle2litNum2380__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 6, -(Integer.MAX_VALUE) }));
            org.junit.Assert.fail("testSingle2litNum2380litNum2489 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSingle2_add2392litNum2437_failAssert311() throws Exception, ContradictionException, TimeoutException {
        try {
            boolean o_testSingle2_add2392__1 = this.solver.isSatisfiable(new VecInt(new int[]{ Integer.MAX_VALUE, -3 }));
            boolean o_testSingle2_add2392__4 = this.solver.isSatisfiable(new VecInt(new int[]{ 5, -3 }));
            org.junit.Assert.fail("testSingle2_add2392litNum2437 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSingle2_add2392litNum2469_failAssert315() throws Exception, ContradictionException, TimeoutException {
        try {
            boolean o_testSingle2_add2392__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 5, -3 }));
            boolean o_testSingle2_add2392__4 = this.solver.isSatisfiable(new VecInt(new int[]{ Integer.MAX_VALUE, -3 }));
            org.junit.Assert.fail("testSingle2_add2392litNum2469 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSingle2_add2392litNum2474_failAssert316() throws Exception, ContradictionException, TimeoutException {
        try {
            boolean o_testSingle2_add2392__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 5, -3 }));
            boolean o_testSingle2_add2392__4 = this.solver.isSatisfiable(new VecInt(new int[]{ Integer.MIN_VALUE, -3 }));
            org.junit.Assert.fail("testSingle2_add2392litNum2474 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-2147483648", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSingle2litNum2380_add2495_add2769() throws Exception, ContradictionException, TimeoutException {
        boolean o_testSingle2litNum2380_add2495_add2769__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 6, -3 }));
        Assert.assertFalse(o_testSingle2litNum2380_add2495_add2769__1);
        boolean o_testSingle2litNum2380_add2495__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 6, -3 }));
        boolean o_testSingle2litNum2380__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 6, -3 }));
        Assert.assertFalse(o_testSingle2litNum2380_add2495_add2769__1);
    }

    @Test(timeout = 30000)
    public void testSingle2litNum2381_add2480_add2716() throws Exception, ContradictionException, TimeoutException {
        boolean o_testSingle2litNum2381_add2480_add2716__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 4, -3 }));
        Assert.assertFalse(o_testSingle2litNum2381_add2480_add2716__1);
        boolean o_testSingle2litNum2381_add2480__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 4, -3 }));
        boolean o_testSingle2litNum2381__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 4, -3 }));
        Assert.assertFalse(o_testSingle2litNum2381_add2480_add2716__1);
    }

    @Test(timeout = 30000)
    public void testSingle2litNum2384_add2452_add2718() throws Exception, ContradictionException, TimeoutException {
        boolean o_testSingle2litNum2384_add2452_add2718__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 0, -3 }));
        Assert.assertFalse(o_testSingle2litNum2384_add2452_add2718__1);
        boolean o_testSingle2litNum2384_add2452__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 0, -3 }));
        boolean o_testSingle2litNum2384__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 0, -3 }));
        Assert.assertFalse(o_testSingle2litNum2384_add2452_add2718__1);
    }

    @Test(timeout = 30000)
    public void testSingle2litNum2386_add2464_add2736() throws Exception, ContradictionException, TimeoutException {
        boolean o_testSingle2litNum2386_add2464_add2736__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 5, -4 }));
        Assert.assertTrue(o_testSingle2litNum2386_add2464_add2736__1);
        boolean o_testSingle2litNum2386_add2464__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 5, -4 }));
        boolean o_testSingle2litNum2386__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 5, -4 }));
        Assert.assertTrue(o_testSingle2litNum2386_add2464_add2736__1);
    }

    @Test(timeout = 30000)
    public void testSingle2litNum2390_add2481_add2712() throws Exception, ContradictionException, TimeoutException {
        boolean o_testSingle2litNum2390_add2481_add2712__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 5, -0 }));
        Assert.assertTrue(o_testSingle2litNum2390_add2481_add2712__1);
        boolean o_testSingle2litNum2390_add2481__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 5, -0 }));
        boolean o_testSingle2litNum2390__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 5, -0 }));
        Assert.assertTrue(o_testSingle2litNum2390_add2481_add2712__1);
    }

    @Test(timeout = 30000)
    public void testSingle2litNum2380_add2495litNum2740_failAssert341() throws Exception, ContradictionException, TimeoutException {
        try {
            boolean o_testSingle2litNum2380_add2495__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 6, -(Integer.MAX_VALUE) }));
            boolean o_testSingle2litNum2380__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 6, -3 }));
            org.junit.Assert.fail("testSingle2litNum2380_add2495litNum2740 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSingle2litNum2380_add2495litNum2755_failAssert343() throws Exception, ContradictionException, TimeoutException {
        try {
            boolean o_testSingle2litNum2380_add2495__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 6, -3 }));
            boolean o_testSingle2litNum2380__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 6, -(Integer.MAX_VALUE) }));
            org.junit.Assert.fail("testSingle2litNum2380_add2495litNum2755 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSingle2litNum2381_add2480litNum2698_failAssert347() throws Exception, ContradictionException, TimeoutException {
        try {
            boolean o_testSingle2litNum2381_add2480__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 4, -3 }));
            boolean o_testSingle2litNum2381__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 4, -(Integer.MAX_VALUE) }));
            org.junit.Assert.fail("testSingle2litNum2381_add2480litNum2698 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSingle2litNum2384_add2452litNum2700_failAssert351() throws Exception, ContradictionException, TimeoutException {
        try {
            boolean o_testSingle2litNum2384_add2452__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 0, -3 }));
            boolean o_testSingle2litNum2384__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 0, -(Integer.MAX_VALUE) }));
            org.junit.Assert.fail("testSingle2litNum2384_add2452litNum2700 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSingle2litNum2386_add2464litNum2725_failAssert354() throws Exception, ContradictionException, TimeoutException {
        try {
            boolean o_testSingle2litNum2386_add2464__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 5, -4 }));
            boolean o_testSingle2litNum2386__1 = this.solver.isSatisfiable(new VecInt(new int[]{ Integer.MAX_VALUE, -4 }));
            org.junit.Assert.fail("testSingle2litNum2386_add2464litNum2725 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSingle2litNum2390_add2481litNum2696_failAssert356() throws Exception, ContradictionException, TimeoutException {
        try {
            boolean o_testSingle2litNum2390_add2481__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 5, -0 }));
            boolean o_testSingle2litNum2390__1 = this.solver.isSatisfiable(new VecInt(new int[]{ Integer.MAX_VALUE, -0 }));
            org.junit.Assert.fail("testSingle2litNum2390_add2481litNum2696 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSingle2_add2392litNum2437_failAssert311litNum2730_failAssert360() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                boolean o_testSingle2_add2392__1 = this.solver.isSatisfiable(new VecInt(new int[]{ Integer.MAX_VALUE, -4 }));
                boolean o_testSingle2_add2392__4 = this.solver.isSatisfiable(new VecInt(new int[]{ 5, -3 }));
                org.junit.Assert.fail("testSingle2_add2392litNum2437 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testSingle2_add2392litNum2437_failAssert311litNum2730 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSingle2_add2392litNum2474_failAssert316litNum2759_failAssert405() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                boolean o_testSingle2_add2392__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 5, -4 }));
                boolean o_testSingle2_add2392__4 = this.solver.isSatisfiable(new VecInt(new int[]{ Integer.MIN_VALUE, -3 }));
                org.junit.Assert.fail("testSingle2_add2392litNum2474 should have thrown ArrayIndexOutOfBoundsException");
            }
            org.junit.Assert.fail("testSingle2_add2392litNum2474_failAssert316litNum2759 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-2147483648", expected.getMessage());
        }
    }
}

