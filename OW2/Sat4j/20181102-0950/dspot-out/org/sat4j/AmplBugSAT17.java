package org.sat4j;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.sat4j.core.VecInt;
import org.sat4j.minisat.SolverFactory;
import org.sat4j.specs.ContradictionException;
import org.sat4j.specs.ISolver;
import org.sat4j.specs.TimeoutException;


public class AmplBugSAT17 {
    private ISolver solver;

    @Before
    public void setup() throws ContradictionException {
        this.solver = SolverFactory.newDefault();
        this.solver.addClause(new VecInt(new int[]{ 1 }));
        this.solver.addClause(new VecInt(new int[]{ 2 }));
    }

    @Test(timeout = 30000)
    public void testAlllitNum1() throws Exception, ContradictionException, TimeoutException {
        boolean o_testAlllitNum1__1 = this.solver.isSatisfiable(new VecInt(new int[]{ -3 }));
        Assert.assertTrue(o_testAlllitNum1__1);
        boolean o_testAlllitNum1__4 = this.solver.isSatisfiable(new VecInt(new int[]{ 2, -2 }));
        Assert.assertFalse(o_testAlllitNum1__4);
        boolean o_testAlllitNum1__7 = this.solver.isSatisfiable(new VecInt(new int[]{ 1, -2 }));
        Assert.assertFalse(o_testAlllitNum1__7);
        boolean o_testAlllitNum1__10 = this.solver.isSatisfiable(new VecInt(new int[]{ 2, 1 }));
        Assert.assertTrue(o_testAlllitNum1__10);
        Assert.assertTrue(o_testAlllitNum1__1);
        Assert.assertFalse(o_testAlllitNum1__4);
        Assert.assertFalse(o_testAlllitNum1__7);
    }

    @Test(timeout = 30000)
    public void testAlllitNum2() throws Exception, ContradictionException, TimeoutException {
        boolean o_testAlllitNum2__1 = this.solver.isSatisfiable(new VecInt(new int[]{ -1 }));
        Assert.assertFalse(o_testAlllitNum2__1);
        boolean o_testAlllitNum2__4 = this.solver.isSatisfiable(new VecInt(new int[]{ 2, -2 }));
        Assert.assertFalse(o_testAlllitNum2__4);
        boolean o_testAlllitNum2__7 = this.solver.isSatisfiable(new VecInt(new int[]{ 1, -2 }));
        Assert.assertFalse(o_testAlllitNum2__7);
        boolean o_testAlllitNum2__10 = this.solver.isSatisfiable(new VecInt(new int[]{ 2, 1 }));
        Assert.assertTrue(o_testAlllitNum2__10);
        Assert.assertFalse(o_testAlllitNum2__1);
        Assert.assertFalse(o_testAlllitNum2__4);
        Assert.assertFalse(o_testAlllitNum2__7);
    }

    @Test(timeout = 30000)
    public void testAlllitNum5() throws Exception, ContradictionException, TimeoutException {
        boolean o_testAlllitNum5__1 = this.solver.isSatisfiable(new VecInt(new int[]{ -0 }));
        Assert.assertTrue(o_testAlllitNum5__1);
        boolean o_testAlllitNum5__4 = this.solver.isSatisfiable(new VecInt(new int[]{ 2, -2 }));
        Assert.assertFalse(o_testAlllitNum5__4);
        boolean o_testAlllitNum5__7 = this.solver.isSatisfiable(new VecInt(new int[]{ 1, -2 }));
        Assert.assertFalse(o_testAlllitNum5__7);
        boolean o_testAlllitNum5__10 = this.solver.isSatisfiable(new VecInt(new int[]{ 2, 1 }));
        Assert.assertTrue(o_testAlllitNum5__10);
        Assert.assertTrue(o_testAlllitNum5__1);
        Assert.assertFalse(o_testAlllitNum5__4);
        Assert.assertFalse(o_testAlllitNum5__7);
    }

    @Test(timeout = 30000)
    public void testAlllitNum7() throws Exception, ContradictionException, TimeoutException {
        boolean o_testAlllitNum7__1 = this.solver.isSatisfiable(new VecInt(new int[]{ -2 }));
        Assert.assertFalse(o_testAlllitNum7__1);
        boolean o_testAlllitNum7__4 = this.solver.isSatisfiable(new VecInt(new int[]{ 3, -2 }));
        Assert.assertFalse(o_testAlllitNum7__4);
        boolean o_testAlllitNum7__7 = this.solver.isSatisfiable(new VecInt(new int[]{ 1, -2 }));
        Assert.assertFalse(o_testAlllitNum7__7);
        boolean o_testAlllitNum7__10 = this.solver.isSatisfiable(new VecInt(new int[]{ 2, 1 }));
        Assert.assertTrue(o_testAlllitNum7__10);
        Assert.assertFalse(o_testAlllitNum7__1);
        Assert.assertFalse(o_testAlllitNum7__4);
        Assert.assertFalse(o_testAlllitNum7__7);
    }

    @Test(timeout = 30000)
    public void testAlllitNum11() throws Exception, ContradictionException, TimeoutException {
        boolean o_testAlllitNum11__1 = this.solver.isSatisfiable(new VecInt(new int[]{ -2 }));
        Assert.assertFalse(o_testAlllitNum11__1);
        boolean o_testAlllitNum11__4 = this.solver.isSatisfiable(new VecInt(new int[]{ 0, -2 }));
        Assert.assertFalse(o_testAlllitNum11__4);
        boolean o_testAlllitNum11__7 = this.solver.isSatisfiable(new VecInt(new int[]{ 1, -2 }));
        Assert.assertFalse(o_testAlllitNum11__7);
        boolean o_testAlllitNum11__10 = this.solver.isSatisfiable(new VecInt(new int[]{ 2, 1 }));
        Assert.assertTrue(o_testAlllitNum11__10);
        Assert.assertFalse(o_testAlllitNum11__1);
        Assert.assertFalse(o_testAlllitNum11__4);
        Assert.assertFalse(o_testAlllitNum11__7);
    }

    @Test(timeout = 30000)
    public void testAlllitNum30() throws Exception, ContradictionException, TimeoutException {
        boolean o_testAlllitNum30__1 = this.solver.isSatisfiable(new VecInt(new int[]{ -2 }));
        Assert.assertFalse(o_testAlllitNum30__1);
        boolean o_testAlllitNum30__4 = this.solver.isSatisfiable(new VecInt(new int[]{ 2, -2 }));
        Assert.assertFalse(o_testAlllitNum30__4);
        boolean o_testAlllitNum30__7 = this.solver.isSatisfiable(new VecInt(new int[]{ 1, -2 }));
        Assert.assertFalse(o_testAlllitNum30__7);
        boolean o_testAlllitNum30__10 = this.solver.isSatisfiable(new VecInt(new int[]{ 3, 1 }));
        Assert.assertTrue(o_testAlllitNum30__10);
        Assert.assertFalse(o_testAlllitNum30__1);
        Assert.assertFalse(o_testAlllitNum30__4);
        Assert.assertFalse(o_testAlllitNum30__7);
    }

    @Test(timeout = 30000)
    public void testAlllitNum34() throws Exception, ContradictionException, TimeoutException {
        boolean o_testAlllitNum34__1 = this.solver.isSatisfiable(new VecInt(new int[]{ -2 }));
        Assert.assertFalse(o_testAlllitNum34__1);
        boolean o_testAlllitNum34__4 = this.solver.isSatisfiable(new VecInt(new int[]{ 2, -2 }));
        Assert.assertFalse(o_testAlllitNum34__4);
        boolean o_testAlllitNum34__7 = this.solver.isSatisfiable(new VecInt(new int[]{ 1, -2 }));
        Assert.assertFalse(o_testAlllitNum34__7);
        boolean o_testAlllitNum34__10 = this.solver.isSatisfiable(new VecInt(new int[]{ 0, 1 }));
        Assert.assertTrue(o_testAlllitNum34__10);
        Assert.assertFalse(o_testAlllitNum34__1);
        Assert.assertFalse(o_testAlllitNum34__4);
        Assert.assertFalse(o_testAlllitNum34__7);
    }

    @Test(timeout = 30000)
    public void testAll_add44() throws Exception, ContradictionException, TimeoutException {
        boolean o_testAll_add44__1 = this.solver.isSatisfiable(new VecInt(new int[]{ -2 }));
        Assert.assertFalse(o_testAll_add44__1);
        boolean o_testAll_add44__4 = this.solver.isSatisfiable(new VecInt(new int[]{ 2, -2 }));
        Assert.assertFalse(o_testAll_add44__4);
        boolean o_testAll_add44__7 = this.solver.isSatisfiable(new VecInt(new int[]{ 1, -2 }));
        Assert.assertFalse(o_testAll_add44__7);
        boolean o_testAll_add44__10 = this.solver.isSatisfiable(new VecInt(new int[]{ 2, 1 }));
        Assert.assertTrue(o_testAll_add44__10);
        boolean o_testAll_add44__12 = this.solver.isSatisfiable(new VecInt(new int[]{ 2, 1 }));
        Assert.assertTrue(o_testAll_add44__12);
        Assert.assertFalse(o_testAll_add44__1);
        Assert.assertFalse(o_testAll_add44__4);
        Assert.assertFalse(o_testAll_add44__7);
        Assert.assertTrue(o_testAll_add44__10);
    }

    @Test(timeout = 30000)
    public void testAlllitNum3_failAssert0() throws Exception, ContradictionException, TimeoutException {
        try {
            this.solver.isSatisfiable(new VecInt(new int[]{ -(Integer.MAX_VALUE) }));
            this.solver.isSatisfiable(new VecInt(new int[]{ 2, -2 }));
            this.solver.isSatisfiable(new VecInt(new int[]{ 1, -2 }));
            this.solver.isSatisfiable(new VecInt(new int[]{ 2, 1 }));
            org.junit.Assert.fail("testAlllitNum3 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testAlllitNum9_failAssert2() throws Exception, ContradictionException, TimeoutException {
        try {
            this.solver.isSatisfiable(new VecInt(new int[]{ -2 }));
            this.solver.isSatisfiable(new VecInt(new int[]{ Integer.MAX_VALUE, -2 }));
            this.solver.isSatisfiable(new VecInt(new int[]{ 1, -2 }));
            this.solver.isSatisfiable(new VecInt(new int[]{ 2, 1 }));
            org.junit.Assert.fail("testAlllitNum9 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testAlllitNum21_failAssert6() throws Exception, ContradictionException, TimeoutException {
        try {
            this.solver.isSatisfiable(new VecInt(new int[]{ -2 }));
            this.solver.isSatisfiable(new VecInt(new int[]{ 2, -2 }));
            this.solver.isSatisfiable(new VecInt(new int[]{ Integer.MAX_VALUE, -2 }));
            this.solver.isSatisfiable(new VecInt(new int[]{ 2, 1 }));
            org.junit.Assert.fail("testAlllitNum21 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testAlllitNum22_failAssert7() throws Exception, ContradictionException, TimeoutException {
        try {
            this.solver.isSatisfiable(new VecInt(new int[]{ -2 }));
            this.solver.isSatisfiable(new VecInt(new int[]{ 2, -2 }));
            this.solver.isSatisfiable(new VecInt(new int[]{ Integer.MIN_VALUE, -2 }));
            this.solver.isSatisfiable(new VecInt(new int[]{ 2, 1 }));
            org.junit.Assert.fail("testAlllitNum22 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-2147483648", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testAll_add44_add314() throws Exception, ContradictionException, TimeoutException {
        boolean o_testAll_add44__1 = this.solver.isSatisfiable(new VecInt(new int[]{ -2 }));
        boolean o_testAll_add44__4 = this.solver.isSatisfiable(new VecInt(new int[]{ 2, -2 }));
        boolean o_testAll_add44_add314__11 = this.solver.isSatisfiable(new VecInt(new int[]{ 1, -2 }));
        Assert.assertFalse(o_testAll_add44_add314__11);
        boolean o_testAll_add44__7 = this.solver.isSatisfiable(new VecInt(new int[]{ 1, -2 }));
        boolean o_testAll_add44__10 = this.solver.isSatisfiable(new VecInt(new int[]{ 2, 1 }));
        boolean o_testAll_add44__12 = this.solver.isSatisfiable(new VecInt(new int[]{ 2, 1 }));
        Assert.assertFalse(o_testAll_add44_add314__11);
    }

    @Test(timeout = 30000)
    public void testAlllitNum34_add459() throws Exception, ContradictionException, TimeoutException {
        boolean o_testAlllitNum34__1 = this.solver.isSatisfiable(new VecInt(new int[]{ -2 }));
        boolean o_testAlllitNum34__4 = this.solver.isSatisfiable(new VecInt(new int[]{ 2, -2 }));
        boolean o_testAlllitNum34_add459__11 = this.solver.isSatisfiable(new VecInt(new int[]{ 1, -2 }));
        Assert.assertFalse(o_testAlllitNum34_add459__11);
        boolean o_testAlllitNum34__7 = this.solver.isSatisfiable(new VecInt(new int[]{ 1, -2 }));
        boolean o_testAlllitNum34__10 = this.solver.isSatisfiable(new VecInt(new int[]{ 0, 1 }));
        Assert.assertFalse(o_testAlllitNum34_add459__11);
    }

    @Test(timeout = 30000)
    public void testAll_add44litNum196_failAssert16() throws Exception, ContradictionException, TimeoutException {
        try {
            boolean o_testAll_add44__1 = this.solver.isSatisfiable(new VecInt(new int[]{ -2 }));
            boolean o_testAll_add44__4 = this.solver.isSatisfiable(new VecInt(new int[]{ 2, -(Integer.MAX_VALUE) }));
            boolean o_testAll_add44__7 = this.solver.isSatisfiable(new VecInt(new int[]{ 1, -2 }));
            boolean o_testAll_add44__10 = this.solver.isSatisfiable(new VecInt(new int[]{ 2, 1 }));
            boolean o_testAll_add44__12 = this.solver.isSatisfiable(new VecInt(new int[]{ 2, 1 }));
            org.junit.Assert.fail("testAll_add44litNum196 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testAll_add44litNum160_failAssert18() throws Exception, ContradictionException, TimeoutException {
        try {
            boolean o_testAll_add44__1 = this.solver.isSatisfiable(new VecInt(new int[]{ -(Integer.MAX_VALUE) }));
            boolean o_testAll_add44__4 = this.solver.isSatisfiable(new VecInt(new int[]{ 2, -2 }));
            boolean o_testAll_add44__7 = this.solver.isSatisfiable(new VecInt(new int[]{ 1, -2 }));
            boolean o_testAll_add44__10 = this.solver.isSatisfiable(new VecInt(new int[]{ 2, 1 }));
            boolean o_testAll_add44__12 = this.solver.isSatisfiable(new VecInt(new int[]{ 2, 1 }));
            org.junit.Assert.fail("testAll_add44litNum160 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testAll_add44litNum234_failAssert20() throws Exception, ContradictionException, TimeoutException {
        try {
            boolean o_testAll_add44__1 = this.solver.isSatisfiable(new VecInt(new int[]{ -2 }));
            boolean o_testAll_add44__4 = this.solver.isSatisfiable(new VecInt(new int[]{ 2, -2 }));
            boolean o_testAll_add44__7 = this.solver.isSatisfiable(new VecInt(new int[]{ 1, -(Integer.MIN_VALUE) }));
            boolean o_testAll_add44__10 = this.solver.isSatisfiable(new VecInt(new int[]{ 2, 1 }));
            boolean o_testAll_add44__12 = this.solver.isSatisfiable(new VecInt(new int[]{ 2, 1 }));
            org.junit.Assert.fail("testAll_add44litNum234 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-2147483648", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testAll_add44litNum279_failAssert22() throws Exception, ContradictionException, TimeoutException {
        try {
            boolean o_testAll_add44__1 = this.solver.isSatisfiable(new VecInt(new int[]{ -2 }));
            boolean o_testAll_add44__4 = this.solver.isSatisfiable(new VecInt(new int[]{ 2, -2 }));
            boolean o_testAll_add44__7 = this.solver.isSatisfiable(new VecInt(new int[]{ 1, -2 }));
            boolean o_testAll_add44__10 = this.solver.isSatisfiable(new VecInt(new int[]{ 2, 1 }));
            boolean o_testAll_add44__12 = this.solver.isSatisfiable(new VecInt(new int[]{ Integer.MAX_VALUE, 1 }));
            org.junit.Assert.fail("testAll_add44litNum279 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testAlllitNum9_failAssert2litNum532_failAssert35() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                this.solver.isSatisfiable(new VecInt(new int[]{ -2 }));
                this.solver.isSatisfiable(new VecInt(new int[]{ Integer.MAX_VALUE, -2 }));
                this.solver.isSatisfiable(new VecInt(new int[]{ 1, -0 }));
                this.solver.isSatisfiable(new VecInt(new int[]{ 2, 1 }));
                org.junit.Assert.fail("testAlllitNum9 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testAlllitNum9_failAssert2litNum532 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testAlllitNum9_failAssert2litNum480_failAssert38() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                this.solver.isSatisfiable(new VecInt(new int[]{ -0 }));
                this.solver.isSatisfiable(new VecInt(new int[]{ Integer.MAX_VALUE, -2 }));
                this.solver.isSatisfiable(new VecInt(new int[]{ 1, -2 }));
                this.solver.isSatisfiable(new VecInt(new int[]{ 2, 1 }));
                org.junit.Assert.fail("testAlllitNum9 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testAlllitNum9_failAssert2litNum480 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testAlllitNum9_failAssert2litNum468_failAssert46() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                this.solver.isSatisfiable(new VecInt(new int[]{ -3 }));
                this.solver.isSatisfiable(new VecInt(new int[]{ Integer.MAX_VALUE, -2 }));
                this.solver.isSatisfiable(new VecInt(new int[]{ 1, -2 }));
                this.solver.isSatisfiable(new VecInt(new int[]{ 2, 1 }));
                org.junit.Assert.fail("testAlllitNum9 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testAlllitNum9_failAssert2litNum468 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testAlllitNum21_failAssert6litNum211_failAssert66() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                this.solver.isSatisfiable(new VecInt(new int[]{ -2 }));
                this.solver.isSatisfiable(new VecInt(new int[]{ 0, -2 }));
                this.solver.isSatisfiable(new VecInt(new int[]{ Integer.MAX_VALUE, -2 }));
                this.solver.isSatisfiable(new VecInt(new int[]{ 2, 1 }));
                org.junit.Assert.fail("testAlllitNum21 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testAlllitNum21_failAssert6litNum211 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testAlllitNum21_failAssert6litNum223_failAssert70() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                this.solver.isSatisfiable(new VecInt(new int[]{ -2 }));
                this.solver.isSatisfiable(new VecInt(new int[]{ 2, -3 }));
                this.solver.isSatisfiable(new VecInt(new int[]{ Integer.MAX_VALUE, -2 }));
                this.solver.isSatisfiable(new VecInt(new int[]{ 2, 1 }));
                org.junit.Assert.fail("testAlllitNum21 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testAlllitNum21_failAssert6litNum223 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testAlllitNum21_failAssert6litNum244_failAssert71() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                this.solver.isSatisfiable(new VecInt(new int[]{ -2 }));
                this.solver.isSatisfiable(new VecInt(new int[]{ 2, -0 }));
                this.solver.isSatisfiable(new VecInt(new int[]{ Integer.MAX_VALUE, -2 }));
                this.solver.isSatisfiable(new VecInt(new int[]{ 2, 1 }));
                org.junit.Assert.fail("testAlllitNum21 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testAlllitNum21_failAssert6litNum244 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testAlllitNum21_failAssert6litNum190_failAssert74() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                this.solver.isSatisfiable(new VecInt(new int[]{ -2 }));
                this.solver.isSatisfiable(new VecInt(new int[]{ 3, -2 }));
                this.solver.isSatisfiable(new VecInt(new int[]{ Integer.MAX_VALUE, -2 }));
                this.solver.isSatisfiable(new VecInt(new int[]{ 2, 1 }));
                org.junit.Assert.fail("testAlllitNum21 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testAlllitNum21_failAssert6litNum190 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testAlllitNum21_failAssert6litNum178_failAssert78() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                this.solver.isSatisfiable(new VecInt(new int[]{ -0 }));
                this.solver.isSatisfiable(new VecInt(new int[]{ 2, -2 }));
                this.solver.isSatisfiable(new VecInt(new int[]{ Integer.MAX_VALUE, -2 }));
                this.solver.isSatisfiable(new VecInt(new int[]{ 2, 1 }));
                org.junit.Assert.fail("testAlllitNum21 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testAlllitNum21_failAssert6litNum178 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testAlllitNum21_failAssert6litNum158_failAssert81() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                this.solver.isSatisfiable(new VecInt(new int[]{ -3 }));
                this.solver.isSatisfiable(new VecInt(new int[]{ 2, -2 }));
                this.solver.isSatisfiable(new VecInt(new int[]{ Integer.MAX_VALUE, -2 }));
                this.solver.isSatisfiable(new VecInt(new int[]{ 2, 1 }));
                org.junit.Assert.fail("testAlllitNum21 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testAlllitNum21_failAssert6litNum158 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testAlllitNum34_add459_add1052() throws Exception, ContradictionException, TimeoutException {
        boolean o_testAlllitNum34_add459_add1052__1 = this.solver.isSatisfiable(new VecInt(new int[]{ -2 }));
        Assert.assertFalse(o_testAlllitNum34_add459_add1052__1);
        boolean o_testAlllitNum34__1 = this.solver.isSatisfiable(new VecInt(new int[]{ -2 }));
        boolean o_testAlllitNum34__4 = this.solver.isSatisfiable(new VecInt(new int[]{ 2, -2 }));
        boolean o_testAlllitNum34_add459__11 = this.solver.isSatisfiable(new VecInt(new int[]{ 1, -2 }));
        boolean o_testAlllitNum34__7 = this.solver.isSatisfiable(new VecInt(new int[]{ 1, -2 }));
        boolean o_testAlllitNum34__10 = this.solver.isSatisfiable(new VecInt(new int[]{ 0, 1 }));
        Assert.assertFalse(o_testAlllitNum34_add459_add1052__1);
    }

    @Test(timeout = 30000)
    public void testAll_add44litNum234_failAssert20_add1180_failAssert163() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                boolean o_testAll_add44__1 = this.solver.isSatisfiable(new VecInt(new int[]{ -2 }));
                boolean o_testAll_add44__4 = this.solver.isSatisfiable(new VecInt(new int[]{ 2, -2 }));
                this.solver.isSatisfiable(new VecInt(new int[]{ 1, -(Integer.MIN_VALUE) }));
                boolean o_testAll_add44__7 = this.solver.isSatisfiable(new VecInt(new int[]{ 1, -(Integer.MIN_VALUE) }));
                boolean o_testAll_add44__10 = this.solver.isSatisfiable(new VecInt(new int[]{ 2, 1 }));
                boolean o_testAll_add44__12 = this.solver.isSatisfiable(new VecInt(new int[]{ 2, 1 }));
                org.junit.Assert.fail("testAll_add44litNum234 should have thrown ArrayIndexOutOfBoundsException");
            }
            org.junit.Assert.fail("testAll_add44litNum234_failAssert20_add1180 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-2147483648", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testAll_add44litNum196_failAssert16_add1168_failAssert164() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                boolean o_testAll_add44__1 = this.solver.isSatisfiable(new VecInt(new int[]{ -2 }));
                this.solver.isSatisfiable(new VecInt(new int[]{ 2, -(Integer.MAX_VALUE) }));
                boolean o_testAll_add44__4 = this.solver.isSatisfiable(new VecInt(new int[]{ 2, -(Integer.MAX_VALUE) }));
                boolean o_testAll_add44__7 = this.solver.isSatisfiable(new VecInt(new int[]{ 1, -2 }));
                boolean o_testAll_add44__10 = this.solver.isSatisfiable(new VecInt(new int[]{ 2, 1 }));
                boolean o_testAll_add44__12 = this.solver.isSatisfiable(new VecInt(new int[]{ 2, 1 }));
                org.junit.Assert.fail("testAll_add44litNum196 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testAll_add44litNum196_failAssert16_add1168 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testAll_add44litNum160_failAssert18_add1415_failAssert165() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                this.solver.isSatisfiable(new VecInt(new int[]{ -(Integer.MAX_VALUE) }));
                boolean o_testAll_add44__1 = this.solver.isSatisfiable(new VecInt(new int[]{ -(Integer.MAX_VALUE) }));
                boolean o_testAll_add44__4 = this.solver.isSatisfiable(new VecInt(new int[]{ 2, -2 }));
                boolean o_testAll_add44__7 = this.solver.isSatisfiable(new VecInt(new int[]{ 1, -2 }));
                boolean o_testAll_add44__10 = this.solver.isSatisfiable(new VecInt(new int[]{ 2, 1 }));
                boolean o_testAll_add44__12 = this.solver.isSatisfiable(new VecInt(new int[]{ 2, 1 }));
                org.junit.Assert.fail("testAll_add44litNum160 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testAll_add44litNum160_failAssert18_add1415 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testAll_add44litNum279_failAssert22_add1513_failAssert166() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                boolean o_testAll_add44__1 = this.solver.isSatisfiable(new VecInt(new int[]{ -2 }));
                boolean o_testAll_add44__4 = this.solver.isSatisfiable(new VecInt(new int[]{ 2, -2 }));
                boolean o_testAll_add44__7 = this.solver.isSatisfiable(new VecInt(new int[]{ 1, -2 }));
                boolean o_testAll_add44__10 = this.solver.isSatisfiable(new VecInt(new int[]{ 2, 1 }));
                this.solver.isSatisfiable(new VecInt(new int[]{ Integer.MAX_VALUE, 1 }));
                boolean o_testAll_add44__12 = this.solver.isSatisfiable(new VecInt(new int[]{ Integer.MAX_VALUE, 1 }));
                org.junit.Assert.fail("testAll_add44litNum279 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testAll_add44litNum279_failAssert22_add1513 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testAll_add44litNum196_failAssert16_add1167_failAssert180() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                this.solver.isSatisfiable(new VecInt(new int[]{ -2 }));
                boolean o_testAll_add44__1 = this.solver.isSatisfiable(new VecInt(new int[]{ -2 }));
                boolean o_testAll_add44__4 = this.solver.isSatisfiable(new VecInt(new int[]{ 2, -(Integer.MAX_VALUE) }));
                boolean o_testAll_add44__7 = this.solver.isSatisfiable(new VecInt(new int[]{ 1, -2 }));
                boolean o_testAll_add44__10 = this.solver.isSatisfiable(new VecInt(new int[]{ 2, 1 }));
                boolean o_testAll_add44__12 = this.solver.isSatisfiable(new VecInt(new int[]{ 2, 1 }));
                org.junit.Assert.fail("testAll_add44litNum196 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testAll_add44litNum196_failAssert16_add1167 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testAll_add44litNum279_failAssert22_add1512_failAssert181() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                boolean o_testAll_add44__1 = this.solver.isSatisfiable(new VecInt(new int[]{ -2 }));
                boolean o_testAll_add44__4 = this.solver.isSatisfiable(new VecInt(new int[]{ 2, -2 }));
                boolean o_testAll_add44__7 = this.solver.isSatisfiable(new VecInt(new int[]{ 1, -2 }));
                this.solver.isSatisfiable(new VecInt(new int[]{ 2, 1 }));
                boolean o_testAll_add44__10 = this.solver.isSatisfiable(new VecInt(new int[]{ 2, 1 }));
                boolean o_testAll_add44__12 = this.solver.isSatisfiable(new VecInt(new int[]{ Integer.MAX_VALUE, 1 }));
                org.junit.Assert.fail("testAll_add44litNum279 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testAll_add44litNum279_failAssert22_add1512 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testAlllitNum9_failAssert2litNum480_failAssert38litNum1412_failAssert205() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    this.solver.isSatisfiable(new VecInt(new int[]{ -0 }));
                    this.solver.isSatisfiable(new VecInt(new int[]{ Integer.MAX_VALUE, -2 }));
                    this.solver.isSatisfiable(new VecInt(new int[]{ 1, -0 }));
                    this.solver.isSatisfiable(new VecInt(new int[]{ 2, 1 }));
                    org.junit.Assert.fail("testAlllitNum9 should have thrown NegativeArraySizeException");
                }
                org.junit.Assert.fail("testAlllitNum9_failAssert2litNum480 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testAlllitNum9_failAssert2litNum480_failAssert38litNum1412 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testAlllitNum9_failAssert2litNum468_failAssert46litNum1200_failAssert218() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    this.solver.isSatisfiable(new VecInt(new int[]{ -3 }));
                    this.solver.isSatisfiable(new VecInt(new int[]{ Integer.MAX_VALUE, -2 }));
                    this.solver.isSatisfiable(new VecInt(new int[]{ 2, -2 }));
                    this.solver.isSatisfiable(new VecInt(new int[]{ 2, 1 }));
                    org.junit.Assert.fail("testAlllitNum9 should have thrown NegativeArraySizeException");
                }
                org.junit.Assert.fail("testAlllitNum9_failAssert2litNum468 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testAlllitNum9_failAssert2litNum468_failAssert46litNum1200 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testAlllitNum21_failAssert6litNum211_failAssert66litNum991_failAssert233() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    this.solver.isSatisfiable(new VecInt(new int[]{ -2 }));
                    this.solver.isSatisfiable(new VecInt(new int[]{ 0, -0 }));
                    this.solver.isSatisfiable(new VecInt(new int[]{ Integer.MAX_VALUE, -2 }));
                    this.solver.isSatisfiable(new VecInt(new int[]{ 2, 1 }));
                    org.junit.Assert.fail("testAlllitNum21 should have thrown NegativeArraySizeException");
                }
                org.junit.Assert.fail("testAlllitNum21_failAssert6litNum211 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testAlllitNum21_failAssert6litNum211_failAssert66litNum991 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testAlllitNum21_failAssert6litNum211_failAssert66litNum983_failAssert234() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    this.solver.isSatisfiable(new VecInt(new int[]{ -2 }));
                    this.solver.isSatisfiable(new VecInt(new int[]{ 0, -3 }));
                    this.solver.isSatisfiable(new VecInt(new int[]{ Integer.MAX_VALUE, -2 }));
                    this.solver.isSatisfiable(new VecInt(new int[]{ 2, 1 }));
                    org.junit.Assert.fail("testAlllitNum21 should have thrown NegativeArraySizeException");
                }
                org.junit.Assert.fail("testAlllitNum21_failAssert6litNum211 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testAlllitNum21_failAssert6litNum211_failAssert66litNum983 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testAlllitNum21_failAssert6litNum211_failAssert66litNum985_failAssert235() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    this.solver.isSatisfiable(new VecInt(new int[]{ -2 }));
                    this.solver.isSatisfiable(new VecInt(new int[]{ 0, -1 }));
                    this.solver.isSatisfiable(new VecInt(new int[]{ Integer.MAX_VALUE, -2 }));
                    this.solver.isSatisfiable(new VecInt(new int[]{ 2, 1 }));
                    org.junit.Assert.fail("testAlllitNum21 should have thrown NegativeArraySizeException");
                }
                org.junit.Assert.fail("testAlllitNum21_failAssert6litNum211 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testAlllitNum21_failAssert6litNum211_failAssert66litNum985 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testAlllitNum21_failAssert6litNum178_failAssert78litNum984_failAssert239() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    this.solver.isSatisfiable(new VecInt(new int[]{ -0 }));
                    this.solver.isSatisfiable(new VecInt(new int[]{ 3, -2 }));
                    this.solver.isSatisfiable(new VecInt(new int[]{ Integer.MAX_VALUE, -2 }));
                    this.solver.isSatisfiable(new VecInt(new int[]{ 2, 1 }));
                    org.junit.Assert.fail("testAlllitNum21 should have thrown NegativeArraySizeException");
                }
                org.junit.Assert.fail("testAlllitNum21_failAssert6litNum178 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testAlllitNum21_failAssert6litNum178_failAssert78litNum984 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testAlllitNum21_failAssert6litNum178_failAssert78litNum988_failAssert241() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    this.solver.isSatisfiable(new VecInt(new int[]{ -0 }));
                    this.solver.isSatisfiable(new VecInt(new int[]{ 1, -2 }));
                    this.solver.isSatisfiable(new VecInt(new int[]{ Integer.MAX_VALUE, -2 }));
                    this.solver.isSatisfiable(new VecInt(new int[]{ 2, 1 }));
                    org.junit.Assert.fail("testAlllitNum21 should have thrown NegativeArraySizeException");
                }
                org.junit.Assert.fail("testAlllitNum21_failAssert6litNum178 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testAlllitNum21_failAssert6litNum178_failAssert78litNum988 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testAlllitNum21_failAssert6litNum223_failAssert70litNum1100_failAssert242() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    this.solver.isSatisfiable(new VecInt(new int[]{ -2 }));
                    this.solver.isSatisfiable(new VecInt(new int[]{ 2, -3 }));
                    this.solver.isSatisfiable(new VecInt(new int[]{ Integer.MAX_VALUE, -2 }));
                    this.solver.isSatisfiable(new VecInt(new int[]{ 0, 1 }));
                    org.junit.Assert.fail("testAlllitNum21 should have thrown NegativeArraySizeException");
                }
                org.junit.Assert.fail("testAlllitNum21_failAssert6litNum223 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testAlllitNum21_failAssert6litNum223_failAssert70litNum1100 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testAlllitNum21_failAssert6litNum190_failAssert74litNum1410_failAssert252() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    this.solver.isSatisfiable(new VecInt(new int[]{ -2 }));
                    this.solver.isSatisfiable(new VecInt(new int[]{ 3, -2 }));
                    this.solver.isSatisfiable(new VecInt(new int[]{ Integer.MAX_VALUE, -2 }));
                    this.solver.isSatisfiable(new VecInt(new int[]{ 0, 1 }));
                    org.junit.Assert.fail("testAlllitNum21 should have thrown NegativeArraySizeException");
                }
                org.junit.Assert.fail("testAlllitNum21_failAssert6litNum190 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testAlllitNum21_failAssert6litNum190_failAssert74litNum1410 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testAlllitNum21_failAssert6litNum190_failAssert74litNum1362_failAssert263() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    this.solver.isSatisfiable(new VecInt(new int[]{ -2 }));
                    this.solver.isSatisfiable(new VecInt(new int[]{ 3, -0 }));
                    this.solver.isSatisfiable(new VecInt(new int[]{ Integer.MAX_VALUE, -2 }));
                    this.solver.isSatisfiable(new VecInt(new int[]{ 2, 1 }));
                    org.junit.Assert.fail("testAlllitNum21 should have thrown NegativeArraySizeException");
                }
                org.junit.Assert.fail("testAlllitNum21_failAssert6litNum190 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testAlllitNum21_failAssert6litNum190_failAssert74litNum1362 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testAlllitNum21_failAssert6litNum178_failAssert78litNum1001_failAssert265() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    this.solver.isSatisfiable(new VecInt(new int[]{ -0 }));
                    this.solver.isSatisfiable(new VecInt(new int[]{ 0, -2 }));
                    this.solver.isSatisfiable(new VecInt(new int[]{ Integer.MAX_VALUE, -2 }));
                    this.solver.isSatisfiable(new VecInt(new int[]{ 2, 1 }));
                    org.junit.Assert.fail("testAlllitNum21 should have thrown NegativeArraySizeException");
                }
                org.junit.Assert.fail("testAlllitNum21_failAssert6litNum178 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testAlllitNum21_failAssert6litNum178_failAssert78litNum1001 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testAlllitNum21_failAssert6litNum158_failAssert81litNum1304_failAssert266() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    this.solver.isSatisfiable(new VecInt(new int[]{ -3 }));
                    this.solver.isSatisfiable(new VecInt(new int[]{ 2, -2 }));
                    this.solver.isSatisfiable(new VecInt(new int[]{ Integer.MAX_VALUE, -2 }));
                    this.solver.isSatisfiable(new VecInt(new int[]{ 2, 0 }));
                    org.junit.Assert.fail("testAlllitNum21 should have thrown NegativeArraySizeException");
                }
                org.junit.Assert.fail("testAlllitNum21_failAssert6litNum158 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testAlllitNum21_failAssert6litNum158_failAssert81litNum1304 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testAlllitNum21_failAssert6litNum190_failAssert74litNum1346_failAssert273() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    this.solver.isSatisfiable(new VecInt(new int[]{ -2 }));
                    this.solver.isSatisfiable(new VecInt(new int[]{ 3, -3 }));
                    this.solver.isSatisfiable(new VecInt(new int[]{ Integer.MAX_VALUE, -2 }));
                    this.solver.isSatisfiable(new VecInt(new int[]{ 2, 1 }));
                    org.junit.Assert.fail("testAlllitNum21 should have thrown NegativeArraySizeException");
                }
                org.junit.Assert.fail("testAlllitNum21_failAssert6litNum190 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testAlllitNum21_failAssert6litNum190_failAssert74litNum1346 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("3", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testAlllitNum21_failAssert6litNum178_failAssert78litNum1010_failAssert275() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    this.solver.isSatisfiable(new VecInt(new int[]{ -0 }));
                    this.solver.isSatisfiable(new VecInt(new int[]{ 2, -3 }));
                    this.solver.isSatisfiable(new VecInt(new int[]{ Integer.MAX_VALUE, -2 }));
                    this.solver.isSatisfiable(new VecInt(new int[]{ 2, 1 }));
                    org.junit.Assert.fail("testAlllitNum21 should have thrown NegativeArraySizeException");
                }
                org.junit.Assert.fail("testAlllitNum21_failAssert6litNum178 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testAlllitNum21_failAssert6litNum178_failAssert78litNum1010 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testAlllitNum21_failAssert6litNum158_failAssert81litNum1170_failAssert276() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    this.solver.isSatisfiable(new VecInt(new int[]{ -3 }));
                    this.solver.isSatisfiable(new VecInt(new int[]{ 3, -2 }));
                    this.solver.isSatisfiable(new VecInt(new int[]{ Integer.MAX_VALUE, -2 }));
                    this.solver.isSatisfiable(new VecInt(new int[]{ 2, 1 }));
                    org.junit.Assert.fail("testAlllitNum21 should have thrown NegativeArraySizeException");
                }
                org.junit.Assert.fail("testAlllitNum21_failAssert6litNum158 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testAlllitNum21_failAssert6litNum158_failAssert81litNum1170 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testAlllitNum21_failAssert6litNum158_failAssert81litNum1238_failAssert281() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    this.solver.isSatisfiable(new VecInt(new int[]{ -3 }));
                    this.solver.isSatisfiable(new VecInt(new int[]{ 2, -0 }));
                    this.solver.isSatisfiable(new VecInt(new int[]{ Integer.MAX_VALUE, -2 }));
                    this.solver.isSatisfiable(new VecInt(new int[]{ 2, 1 }));
                    org.junit.Assert.fail("testAlllitNum21 should have thrown NegativeArraySizeException");
                }
                org.junit.Assert.fail("testAlllitNum21_failAssert6litNum158 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testAlllitNum21_failAssert6litNum158_failAssert81litNum1238 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testAlllitNum21_failAssert6litNum158_failAssert81litNum1185_failAssert285() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    this.solver.isSatisfiable(new VecInt(new int[]{ -3 }));
                    this.solver.isSatisfiable(new VecInt(new int[]{ 0, -2 }));
                    this.solver.isSatisfiable(new VecInt(new int[]{ Integer.MAX_VALUE, -2 }));
                    this.solver.isSatisfiable(new VecInt(new int[]{ 2, 1 }));
                    org.junit.Assert.fail("testAlllitNum21 should have thrown NegativeArraySizeException");
                }
                org.junit.Assert.fail("testAlllitNum21_failAssert6litNum158 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testAlllitNum21_failAssert6litNum158_failAssert81litNum1185 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testAlllitNum21_failAssert6litNum178_failAssert78litNum1026_failAssert286() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    this.solver.isSatisfiable(new VecInt(new int[]{ -0 }));
                    this.solver.isSatisfiable(new VecInt(new int[]{ 2, -0 }));
                    this.solver.isSatisfiable(new VecInt(new int[]{ Integer.MAX_VALUE, -2 }));
                    this.solver.isSatisfiable(new VecInt(new int[]{ 2, 1 }));
                    org.junit.Assert.fail("testAlllitNum21 should have thrown NegativeArraySizeException");
                }
                org.junit.Assert.fail("testAlllitNum21_failAssert6litNum178 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testAlllitNum21_failAssert6litNum178_failAssert78litNum1026 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testAlllitNum21_failAssert6litNum158_failAssert81litNum1194_failAssert293() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    this.solver.isSatisfiable(new VecInt(new int[]{ -3 }));
                    this.solver.isSatisfiable(new VecInt(new int[]{ 2, -3 }));
                    this.solver.isSatisfiable(new VecInt(new int[]{ Integer.MAX_VALUE, -2 }));
                    this.solver.isSatisfiable(new VecInt(new int[]{ 2, 1 }));
                    org.junit.Assert.fail("testAlllitNum21 should have thrown NegativeArraySizeException");
                }
                org.junit.Assert.fail("testAlllitNum21_failAssert6litNum158 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testAlllitNum21_failAssert6litNum158_failAssert81litNum1194 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testAll_add44litNum279_failAssert22litNum1490_failAssert323() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                boolean o_testAll_add44__1 = this.solver.isSatisfiable(new VecInt(new int[]{ -2 }));
                boolean o_testAll_add44__4 = this.solver.isSatisfiable(new VecInt(new int[]{ 2, -2 }));
                boolean o_testAll_add44__7 = this.solver.isSatisfiable(new VecInt(new int[]{ 1, -(Integer.MIN_VALUE) }));
                boolean o_testAll_add44__10 = this.solver.isSatisfiable(new VecInt(new int[]{ 2, 1 }));
                boolean o_testAll_add44__12 = this.solver.isSatisfiable(new VecInt(new int[]{ Integer.MAX_VALUE, 1 }));
                org.junit.Assert.fail("testAll_add44litNum279 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testAll_add44litNum279_failAssert22litNum1490 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-2147483648", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSingleLitlitNum4103() throws Exception, ContradictionException, TimeoutException {
        boolean o_testSingleLitlitNum4103__1 = this.solver.isSatisfiable(new VecInt(new int[]{ -3 }));
        Assert.assertTrue(o_testSingleLitlitNum4103__1);
    }

    @Test(timeout = 30000)
    public void testSingleLitlitNum4104() throws Exception, ContradictionException, TimeoutException {
        boolean o_testSingleLitlitNum4104__1 = this.solver.isSatisfiable(new VecInt(new int[]{ -1 }));
        Assert.assertFalse(o_testSingleLitlitNum4104__1);
    }

    @Test(timeout = 30000)
    public void testSingleLitlitNum4107() throws Exception, ContradictionException, TimeoutException {
        boolean o_testSingleLitlitNum4107__1 = this.solver.isSatisfiable(new VecInt(new int[]{ -0 }));
        Assert.assertTrue(o_testSingleLitlitNum4107__1);
    }

    @Test(timeout = 30000)
    public void testSingleLit_add4109() throws Exception, ContradictionException, TimeoutException {
        boolean o_testSingleLit_add4109__1 = this.solver.isSatisfiable(new VecInt(new int[]{ -2 }));
        Assert.assertFalse(o_testSingleLit_add4109__1);
        boolean o_testSingleLit_add4109__4 = this.solver.isSatisfiable(new VecInt(new int[]{ -2 }));
        Assert.assertFalse(o_testSingleLit_add4109__4);
        Assert.assertFalse(o_testSingleLit_add4109__1);
    }

    @Test(timeout = 30000)
    public void testSingleLitlitNum4105_failAssert712() throws Exception, ContradictionException, TimeoutException {
        try {
            this.solver.isSatisfiable(new VecInt(new int[]{ -(Integer.MAX_VALUE) }));
            org.junit.Assert.fail("testSingleLitlitNum4105 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSingleLitlitNum4106_failAssert713() throws Exception, ContradictionException, TimeoutException {
        try {
            this.solver.isSatisfiable(new VecInt(new int[]{ -(Integer.MIN_VALUE) }));
            org.junit.Assert.fail("testSingleLitlitNum4106 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-2147483648", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSingleLitlitNum4103_add4130() throws Exception, ContradictionException, TimeoutException {
        boolean o_testSingleLitlitNum4103_add4130__1 = this.solver.isSatisfiable(new VecInt(new int[]{ -3 }));
        Assert.assertTrue(o_testSingleLitlitNum4103_add4130__1);
        boolean o_testSingleLitlitNum4103__1 = this.solver.isSatisfiable(new VecInt(new int[]{ -3 }));
        Assert.assertTrue(o_testSingleLitlitNum4103_add4130__1);
    }

    @Test(timeout = 30000)
    public void testSingleLitlitNum4104_add4128() throws Exception, ContradictionException, TimeoutException {
        boolean o_testSingleLitlitNum4104_add4128__1 = this.solver.isSatisfiable(new VecInt(new int[]{ -1 }));
        Assert.assertFalse(o_testSingleLitlitNum4104_add4128__1);
        boolean o_testSingleLitlitNum4104__1 = this.solver.isSatisfiable(new VecInt(new int[]{ -1 }));
        Assert.assertFalse(o_testSingleLitlitNum4104_add4128__1);
    }

    @Test(timeout = 30000)
    public void testSingleLitlitNum4107_add4132() throws Exception, ContradictionException, TimeoutException {
        boolean o_testSingleLitlitNum4107_add4132__1 = this.solver.isSatisfiable(new VecInt(new int[]{ -0 }));
        Assert.assertTrue(o_testSingleLitlitNum4107_add4132__1);
        boolean o_testSingleLitlitNum4107__1 = this.solver.isSatisfiable(new VecInt(new int[]{ -0 }));
        Assert.assertTrue(o_testSingleLitlitNum4107_add4132__1);
    }

    @Test(timeout = 30000)
    public void testSingleLit_add4109litNum4136_failAssert714() throws Exception, ContradictionException, TimeoutException {
        try {
            boolean o_testSingleLit_add4109__1 = this.solver.isSatisfiable(new VecInt(new int[]{ -(Integer.MAX_VALUE) }));
            boolean o_testSingleLit_add4109__4 = this.solver.isSatisfiable(new VecInt(new int[]{ -2 }));
            org.junit.Assert.fail("testSingleLit_add4109litNum4136 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSingleLit_add4109litNum4142_failAssert716() throws Exception, ContradictionException, TimeoutException {
        try {
            boolean o_testSingleLit_add4109__1 = this.solver.isSatisfiable(new VecInt(new int[]{ -2 }));
            boolean o_testSingleLit_add4109__4 = this.solver.isSatisfiable(new VecInt(new int[]{ -(Integer.MAX_VALUE) }));
            org.junit.Assert.fail("testSingleLit_add4109litNum4142 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSingleLitlitNum4103_add4130_add4201() throws Exception, ContradictionException, TimeoutException {
        boolean o_testSingleLitlitNum4103_add4130_add4201__1 = this.solver.isSatisfiable(new VecInt(new int[]{ -3 }));
        Assert.assertTrue(o_testSingleLitlitNum4103_add4130_add4201__1);
        boolean o_testSingleLitlitNum4103_add4130__1 = this.solver.isSatisfiable(new VecInt(new int[]{ -3 }));
        boolean o_testSingleLitlitNum4103__1 = this.solver.isSatisfiable(new VecInt(new int[]{ -3 }));
        Assert.assertTrue(o_testSingleLitlitNum4103_add4130_add4201__1);
    }

    @Test(timeout = 30000)
    public void testSingleLitlitNum4104_add4128_add4200() throws Exception, ContradictionException, TimeoutException {
        boolean o_testSingleLitlitNum4104_add4128_add4200__1 = this.solver.isSatisfiable(new VecInt(new int[]{ -1 }));
        Assert.assertFalse(o_testSingleLitlitNum4104_add4128_add4200__1);
        boolean o_testSingleLitlitNum4104_add4128__1 = this.solver.isSatisfiable(new VecInt(new int[]{ -1 }));
        boolean o_testSingleLitlitNum4104__1 = this.solver.isSatisfiable(new VecInt(new int[]{ -1 }));
        Assert.assertFalse(o_testSingleLitlitNum4104_add4128_add4200__1);
    }

    @Test(timeout = 30000)
    public void testSingleLitlitNum4107_add4132_add4206() throws Exception, ContradictionException, TimeoutException {
        boolean o_testSingleLitlitNum4107_add4132_add4206__1 = this.solver.isSatisfiable(new VecInt(new int[]{ -0 }));
        Assert.assertTrue(o_testSingleLitlitNum4107_add4132_add4206__1);
        boolean o_testSingleLitlitNum4107_add4132__1 = this.solver.isSatisfiable(new VecInt(new int[]{ -0 }));
        boolean o_testSingleLitlitNum4107__1 = this.solver.isSatisfiable(new VecInt(new int[]{ -0 }));
        Assert.assertTrue(o_testSingleLitlitNum4107_add4132_add4206__1);
    }

    @Test(timeout = 30000)
    public void testSingleLit_add4109litNum4136_failAssert714litNum4209_failAssert722() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                boolean o_testSingleLit_add4109__1 = this.solver.isSatisfiable(new VecInt(new int[]{ -(Integer.MAX_VALUE) }));
                boolean o_testSingleLit_add4109__4 = this.solver.isSatisfiable(new VecInt(new int[]{ -3 }));
                org.junit.Assert.fail("testSingleLit_add4109litNum4136 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testSingleLit_add4109litNum4136_failAssert714litNum4209 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSingleLit_add4109litNum4136_failAssert714litNum4218_failAssert726() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                boolean o_testSingleLit_add4109__1 = this.solver.isSatisfiable(new VecInt(new int[]{ -(Integer.MAX_VALUE) }));
                boolean o_testSingleLit_add4109__4 = this.solver.isSatisfiable(new VecInt(new int[]{ -0 }));
                org.junit.Assert.fail("testSingleLit_add4109litNum4136 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testSingleLit_add4109litNum4136_failAssert714litNum4218 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSingleLit_add4109litNum4142_failAssert716litNum4204_failAssert731() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                boolean o_testSingleLit_add4109__1 = this.solver.isSatisfiable(new VecInt(new int[]{ -3 }));
                boolean o_testSingleLit_add4109__4 = this.solver.isSatisfiable(new VecInt(new int[]{ -(Integer.MAX_VALUE) }));
                org.junit.Assert.fail("testSingleLit_add4109litNum4142 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testSingleLit_add4109litNum4142_failAssert716litNum4204 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSingleLit_add4109litNum4142_failAssert716litNum4205_failAssert732() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                boolean o_testSingleLit_add4109__1 = this.solver.isSatisfiable(new VecInt(new int[]{ -1 }));
                boolean o_testSingleLit_add4109__4 = this.solver.isSatisfiable(new VecInt(new int[]{ -(Integer.MAX_VALUE) }));
                org.junit.Assert.fail("testSingleLit_add4109litNum4142 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testSingleLit_add4109litNum4142_failAssert716litNum4205 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSingleLit_add4109litNum4142_failAssert716litNum4211_failAssert735() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                boolean o_testSingleLit_add4109__1 = this.solver.isSatisfiable(new VecInt(new int[]{ -0 }));
                boolean o_testSingleLit_add4109__4 = this.solver.isSatisfiable(new VecInt(new int[]{ -(Integer.MAX_VALUE) }));
                org.junit.Assert.fail("testSingleLit_add4109litNum4142 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testSingleLit_add4109litNum4142_failAssert716litNum4211 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSingleLit_add4109litNum4142_failAssert716_add4216_failAssert736() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                this.solver.isSatisfiable(new VecInt(new int[]{ -2 }));
                boolean o_testSingleLit_add4109__1 = this.solver.isSatisfiable(new VecInt(new int[]{ -2 }));
                boolean o_testSingleLit_add4109__4 = this.solver.isSatisfiable(new VecInt(new int[]{ -(Integer.MAX_VALUE) }));
                org.junit.Assert.fail("testSingleLit_add4109litNum4142 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testSingleLit_add4109litNum4142_failAssert716_add4216 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testInconsistentLitslitNum1912() throws Exception, ContradictionException, TimeoutException {
        boolean o_testInconsistentLitslitNum1912__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 3, -2 }));
        Assert.assertFalse(o_testInconsistentLitslitNum1912__1);
    }

    @Test(timeout = 30000)
    public void testInconsistentLitslitNum1913() throws Exception, ContradictionException, TimeoutException {
        boolean o_testInconsistentLitslitNum1913__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 1, -2 }));
        Assert.assertFalse(o_testInconsistentLitslitNum1913__1);
    }

    @Test(timeout = 30000)
    public void testInconsistentLitslitNum1916() throws Exception, ContradictionException, TimeoutException {
        boolean o_testInconsistentLitslitNum1916__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 0, -2 }));
        Assert.assertFalse(o_testInconsistentLitslitNum1916__1);
    }

    @Test(timeout = 30000)
    public void testInconsistentLitslitNum1917() throws Exception, ContradictionException, TimeoutException {
        boolean o_testInconsistentLitslitNum1917__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 132729307, -2 }));
        Assert.assertFalse(o_testInconsistentLitslitNum1917__1);
    }

    @Test(timeout = 30000)
    public void testInconsistentLitslitNum1918() throws Exception, ContradictionException, TimeoutException {
        boolean o_testInconsistentLitslitNum1918__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 2, -3 }));
        Assert.assertTrue(o_testInconsistentLitslitNum1918__1);
    }

    @Test(timeout = 30000)
    public void testInconsistentLitslitNum1922() throws Exception, ContradictionException, TimeoutException {
        boolean o_testInconsistentLitslitNum1922__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 2, -0 }));
        Assert.assertTrue(o_testInconsistentLitslitNum1922__1);
    }

    @Test(timeout = 30000)
    public void testInconsistentLits_add1924() throws Exception, ContradictionException, TimeoutException {
        boolean o_testInconsistentLits_add1924__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 2, -2 }));
        Assert.assertFalse(o_testInconsistentLits_add1924__1);
        boolean o_testInconsistentLits_add1924__4 = this.solver.isSatisfiable(new VecInt(new int[]{ 2, -2 }));
        Assert.assertFalse(o_testInconsistentLits_add1924__4);
        Assert.assertFalse(o_testInconsistentLits_add1924__1);
    }

    @Test(timeout = 30000)
    public void testInconsistentLitslitNum1914_failAssert351() throws Exception, ContradictionException, TimeoutException {
        try {
            this.solver.isSatisfiable(new VecInt(new int[]{ Integer.MAX_VALUE, -2 }));
            org.junit.Assert.fail("testInconsistentLitslitNum1914 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testInconsistentLitslitNum1920_failAssert353() throws Exception, ContradictionException, TimeoutException {
        try {
            this.solver.isSatisfiable(new VecInt(new int[]{ 2, -(Integer.MAX_VALUE) }));
            org.junit.Assert.fail("testInconsistentLitslitNum1920 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testInconsistentLitslitNum1921_failAssert354() throws Exception, ContradictionException, TimeoutException {
        try {
            this.solver.isSatisfiable(new VecInt(new int[]{ 2, -(Integer.MIN_VALUE) }));
            org.junit.Assert.fail("testInconsistentLitslitNum1921 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-2147483648", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testInconsistentLitslitNum1912_add2014() throws Exception, ContradictionException, TimeoutException {
        boolean o_testInconsistentLitslitNum1912_add2014__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 3, -2 }));
        Assert.assertFalse(o_testInconsistentLitslitNum1912_add2014__1);
        boolean o_testInconsistentLitslitNum1912__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 3, -2 }));
        Assert.assertFalse(o_testInconsistentLitslitNum1912_add2014__1);
    }

    @Test(timeout = 30000)
    public void testInconsistentLitslitNum1913_add2000() throws Exception, ContradictionException, TimeoutException {
        boolean o_testInconsistentLitslitNum1913_add2000__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 1, -2 }));
        Assert.assertFalse(o_testInconsistentLitslitNum1913_add2000__1);
        boolean o_testInconsistentLitslitNum1913__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 1, -2 }));
        Assert.assertFalse(o_testInconsistentLitslitNum1913_add2000__1);
    }

    @Test(timeout = 30000)
    public void testInconsistentLitslitNum1916_add1977() throws Exception, ContradictionException, TimeoutException {
        boolean o_testInconsistentLitslitNum1916_add1977__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 0, -2 }));
        Assert.assertFalse(o_testInconsistentLitslitNum1916_add1977__1);
        boolean o_testInconsistentLitslitNum1916__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 0, -2 }));
        Assert.assertFalse(o_testInconsistentLitslitNum1916_add1977__1);
    }

    @Test(timeout = 30000)
    public void testInconsistentLitslitNum1918_add1983() throws Exception, ContradictionException, TimeoutException {
        boolean o_testInconsistentLitslitNum1918_add1983__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 2, -3 }));
        Assert.assertTrue(o_testInconsistentLitslitNum1918_add1983__1);
        boolean o_testInconsistentLitslitNum1918__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 2, -3 }));
        Assert.assertTrue(o_testInconsistentLitslitNum1918_add1983__1);
    }

    @Test(timeout = 30000)
    public void testInconsistentLitslitNum1922_add1982() throws Exception, ContradictionException, TimeoutException {
        boolean o_testInconsistentLitslitNum1922_add1982__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 2, -0 }));
        Assert.assertTrue(o_testInconsistentLitslitNum1922_add1982__1);
        boolean o_testInconsistentLitslitNum1922__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 2, -0 }));
        Assert.assertTrue(o_testInconsistentLitslitNum1922_add1982__1);
    }

    @Test(timeout = 30000)
    public void testInconsistentLitslitNum1912litNum2004_failAssert355() throws Exception, ContradictionException, TimeoutException {
        try {
            boolean o_testInconsistentLitslitNum1912__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 3, -3 }));
            org.junit.Assert.fail("testInconsistentLitslitNum1912litNum2004 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("3", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testInconsistentLitslitNum1912litNum2007_failAssert356() throws Exception, ContradictionException, TimeoutException {
        try {
            boolean o_testInconsistentLitslitNum1912__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 3, -(Integer.MAX_VALUE) }));
            org.junit.Assert.fail("testInconsistentLitslitNum1912litNum2007 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testInconsistentLits_add1924litNum2012_failAssert362() throws Exception, ContradictionException, TimeoutException {
        try {
            boolean o_testInconsistentLits_add1924__1 = this.solver.isSatisfiable(new VecInt(new int[]{ Integer.MAX_VALUE, -2 }));
            boolean o_testInconsistentLits_add1924__4 = this.solver.isSatisfiable(new VecInt(new int[]{ 2, -2 }));
            org.junit.Assert.fail("testInconsistentLits_add1924litNum2012 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testInconsistentLits_add1924litNum2027_failAssert366() throws Exception, ContradictionException, TimeoutException {
        try {
            boolean o_testInconsistentLits_add1924__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 2, -2 }));
            boolean o_testInconsistentLits_add1924__4 = this.solver.isSatisfiable(new VecInt(new int[]{ Integer.MAX_VALUE, -2 }));
            org.junit.Assert.fail("testInconsistentLits_add1924litNum2027 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testInconsistentLitslitNum1914_failAssert351litNum1960_failAssert370() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                this.solver.isSatisfiable(new VecInt(new int[]{ Integer.MAX_VALUE, -3 }));
                org.junit.Assert.fail("testInconsistentLitslitNum1914 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testInconsistentLitslitNum1914_failAssert351litNum1960 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testInconsistentLitslitNum1912_add2014_add2309() throws Exception, ContradictionException, TimeoutException {
        boolean o_testInconsistentLitslitNum1912_add2014_add2309__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 3, -2 }));
        Assert.assertFalse(o_testInconsistentLitslitNum1912_add2014_add2309__1);
        boolean o_testInconsistentLitslitNum1912_add2014__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 3, -2 }));
        boolean o_testInconsistentLitslitNum1912__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 3, -2 }));
        Assert.assertFalse(o_testInconsistentLitslitNum1912_add2014_add2309__1);
    }

    @Test(timeout = 30000)
    public void testInconsistentLitslitNum1913_add2000_add2258() throws Exception, ContradictionException, TimeoutException {
        boolean o_testInconsistentLitslitNum1913_add2000_add2258__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 1, -2 }));
        Assert.assertFalse(o_testInconsistentLitslitNum1913_add2000_add2258__1);
        boolean o_testInconsistentLitslitNum1913_add2000__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 1, -2 }));
        boolean o_testInconsistentLitslitNum1913__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 1, -2 }));
        Assert.assertFalse(o_testInconsistentLitslitNum1913_add2000_add2258__1);
    }

    @Test(timeout = 30000)
    public void testInconsistentLitslitNum1916_add1977_add2260() throws Exception, ContradictionException, TimeoutException {
        boolean o_testInconsistentLitslitNum1916_add1977_add2260__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 0, -2 }));
        Assert.assertFalse(o_testInconsistentLitslitNum1916_add1977_add2260__1);
        boolean o_testInconsistentLitslitNum1916_add1977__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 0, -2 }));
        boolean o_testInconsistentLitslitNum1916__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 0, -2 }));
        Assert.assertFalse(o_testInconsistentLitslitNum1916_add1977_add2260__1);
    }

    @Test(timeout = 30000)
    public void testInconsistentLitslitNum1918_add1983_add2301() throws Exception, ContradictionException, TimeoutException {
        boolean o_testInconsistentLitslitNum1918_add1983_add2301__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 2, -3 }));
        Assert.assertTrue(o_testInconsistentLitslitNum1918_add1983_add2301__1);
        boolean o_testInconsistentLitslitNum1918_add1983__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 2, -3 }));
        boolean o_testInconsistentLitslitNum1918__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 2, -3 }));
        Assert.assertTrue(o_testInconsistentLitslitNum1918_add1983_add2301__1);
    }

    @Test(timeout = 30000)
    public void testInconsistentLitslitNum1922_add1982_add2266() throws Exception, ContradictionException, TimeoutException {
        boolean o_testInconsistentLitslitNum1922_add1982_add2266__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 2, -0 }));
        Assert.assertTrue(o_testInconsistentLitslitNum1922_add1982_add2266__1);
        boolean o_testInconsistentLitslitNum1922_add1982__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 2, -0 }));
        boolean o_testInconsistentLitslitNum1922__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 2, -0 }));
        Assert.assertTrue(o_testInconsistentLitslitNum1922_add1982_add2266__1);
    }

    @Test(timeout = 30000)
    public void testInconsistentLitslitNum1912_add2014litNum2268_failAssert392() throws Exception, ContradictionException, TimeoutException {
        try {
            boolean o_testInconsistentLitslitNum1912_add2014__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 3, -3 }));
            boolean o_testInconsistentLitslitNum1912__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 3, -2 }));
            org.junit.Assert.fail("testInconsistentLitslitNum1912_add2014litNum2268 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("3", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testInconsistentLitslitNum1912_add2014litNum2273_failAssert393() throws Exception, ContradictionException, TimeoutException {
        try {
            boolean o_testInconsistentLitslitNum1912_add2014__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 3, -(Integer.MAX_VALUE) }));
            boolean o_testInconsistentLitslitNum1912__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 3, -2 }));
            org.junit.Assert.fail("testInconsistentLitslitNum1912_add2014litNum2273 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testInconsistentLitslitNum1912_add2014litNum2276_failAssert394() throws Exception, ContradictionException, TimeoutException {
        try {
            boolean o_testInconsistentLitslitNum1912_add2014__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 3, -(Integer.MIN_VALUE) }));
            boolean o_testInconsistentLitslitNum1912__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 3, -2 }));
            org.junit.Assert.fail("testInconsistentLitslitNum1912_add2014litNum2276 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-2147483648", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testInconsistentLitslitNum1912_add2014litNum2296_failAssert395() throws Exception, ContradictionException, TimeoutException {
        try {
            boolean o_testInconsistentLitslitNum1912_add2014__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 3, -2 }));
            boolean o_testInconsistentLitslitNum1912__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 3, -(Integer.MAX_VALUE) }));
            org.junit.Assert.fail("testInconsistentLitslitNum1912_add2014litNum2296 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testInconsistentLitslitNum1913_add2000litNum2243_failAssert399() throws Exception, ContradictionException, TimeoutException {
        try {
            boolean o_testInconsistentLitslitNum1913_add2000__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 1, -2 }));
            boolean o_testInconsistentLitslitNum1913__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 1, -(Integer.MAX_VALUE) }));
            org.junit.Assert.fail("testInconsistentLitslitNum1913_add2000litNum2243 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testInconsistentLitslitNum1916_add1977litNum2244_failAssert403() throws Exception, ContradictionException, TimeoutException {
        try {
            boolean o_testInconsistentLitslitNum1916_add1977__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 0, -2 }));
            boolean o_testInconsistentLitslitNum1916__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 0, -(Integer.MAX_VALUE) }));
            org.junit.Assert.fail("testInconsistentLitslitNum1916_add1977litNum2244 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testInconsistentLitslitNum1918_add1983litNum2284_failAssert405() throws Exception, ContradictionException, TimeoutException {
        try {
            boolean o_testInconsistentLitslitNum1918_add1983__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 2, -3 }));
            boolean o_testInconsistentLitslitNum1918__1 = this.solver.isSatisfiable(new VecInt(new int[]{ Integer.MAX_VALUE, -3 }));
            org.junit.Assert.fail("testInconsistentLitslitNum1918_add1983litNum2284 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testInconsistentLitslitNum1922_add1982litNum2254_failAssert407() throws Exception, ContradictionException, TimeoutException {
        try {
            boolean o_testInconsistentLitslitNum1922_add1982__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 2, -0 }));
            boolean o_testInconsistentLitslitNum1922__1 = this.solver.isSatisfiable(new VecInt(new int[]{ Integer.MAX_VALUE, -0 }));
            org.junit.Assert.fail("testInconsistentLitslitNum1922_add1982litNum2254 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testInconsistentLits_add1924litNum2012_failAssert362litNum2271_failAssert413() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                boolean o_testInconsistentLits_add1924__1 = this.solver.isSatisfiable(new VecInt(new int[]{ Integer.MAX_VALUE, -3 }));
                boolean o_testInconsistentLits_add1924__4 = this.solver.isSatisfiable(new VecInt(new int[]{ 2, -2 }));
                org.junit.Assert.fail("testInconsistentLits_add1924litNum2012 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testInconsistentLits_add1924litNum2012_failAssert362litNum2271 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testInconsistentLits_add1924litNum2027_failAssert366litNum2295_failAssert442() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                boolean o_testInconsistentLits_add1924__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 2, -2 }));
                boolean o_testInconsistentLits_add1924__4 = this.solver.isSatisfiable(new VecInt(new int[]{ Integer.MAX_VALUE, -3 }));
                org.junit.Assert.fail("testInconsistentLits_add1924litNum2027 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testInconsistentLits_add1924litNum2027_failAssert366litNum2295 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testTwoLitslitNum4277() throws Exception, ContradictionException, TimeoutException {
        boolean o_testTwoLitslitNum4277__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 2, -2 }));
        Assert.assertFalse(o_testTwoLitslitNum4277__1);
    }

    @Test(timeout = 30000)
    public void testTwoLitslitNum4278() throws Exception, ContradictionException, TimeoutException {
        boolean o_testTwoLitslitNum4278__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 0, -2 }));
        Assert.assertFalse(o_testTwoLitslitNum4278__1);
    }

    @Test(timeout = 30000)
    public void testTwoLitslitNum4282() throws Exception, ContradictionException, TimeoutException {
        boolean o_testTwoLitslitNum4282__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 1, -3 }));
        Assert.assertTrue(o_testTwoLitslitNum4282__1);
    }

    @Test(timeout = 30000)
    public void testTwoLitslitNum4283() throws Exception, ContradictionException, TimeoutException {
        boolean o_testTwoLitslitNum4283__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 1, -1 }));
        Assert.assertFalse(o_testTwoLitslitNum4283__1);
    }

    @Test(timeout = 30000)
    public void testTwoLitslitNum4286() throws Exception, ContradictionException, TimeoutException {
        boolean o_testTwoLitslitNum4286__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 1, -0 }));
        Assert.assertTrue(o_testTwoLitslitNum4286__1);
    }

    @Test(timeout = 30000)
    public void testTwoLits_add4288() throws Exception, ContradictionException, TimeoutException {
        boolean o_testTwoLits_add4288__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 1, -2 }));
        Assert.assertFalse(o_testTwoLits_add4288__1);
        boolean o_testTwoLits_add4288__4 = this.solver.isSatisfiable(new VecInt(new int[]{ 1, -2 }));
        Assert.assertFalse(o_testTwoLits_add4288__4);
        Assert.assertFalse(o_testTwoLits_add4288__1);
    }

    @Test(timeout = 30000)
    public void testTwoLitslitNum4279_failAssert739() throws Exception, ContradictionException, TimeoutException {
        try {
            this.solver.isSatisfiable(new VecInt(new int[]{ Integer.MAX_VALUE, -2 }));
            org.junit.Assert.fail("testTwoLitslitNum4279 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testTwoLitslitNum4284_failAssert741() throws Exception, ContradictionException, TimeoutException {
        try {
            this.solver.isSatisfiable(new VecInt(new int[]{ 1, -(Integer.MAX_VALUE) }));
            org.junit.Assert.fail("testTwoLitslitNum4284 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testTwoLitslitNum4285_failAssert742() throws Exception, ContradictionException, TimeoutException {
        try {
            this.solver.isSatisfiable(new VecInt(new int[]{ 1, -(Integer.MIN_VALUE) }));
            org.junit.Assert.fail("testTwoLitslitNum4285 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-2147483648", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testTwoLitslitNum4277_add4370() throws Exception, ContradictionException, TimeoutException {
        boolean o_testTwoLitslitNum4277_add4370__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 2, -2 }));
        Assert.assertFalse(o_testTwoLitslitNum4277_add4370__1);
        boolean o_testTwoLitslitNum4277__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 2, -2 }));
        Assert.assertFalse(o_testTwoLitslitNum4277_add4370__1);
    }

    @Test(timeout = 30000)
    public void testTwoLitslitNum4278_add4350() throws Exception, ContradictionException, TimeoutException {
        boolean o_testTwoLitslitNum4278_add4350__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 0, -2 }));
        Assert.assertFalse(o_testTwoLitslitNum4278_add4350__1);
        boolean o_testTwoLitslitNum4278__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 0, -2 }));
        Assert.assertFalse(o_testTwoLitslitNum4278_add4350__1);
    }

    @Test(timeout = 30000)
    public void testTwoLitslitNum4282_add4320() throws Exception, ContradictionException, TimeoutException {
        boolean o_testTwoLitslitNum4282_add4320__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 1, -3 }));
        Assert.assertTrue(o_testTwoLitslitNum4282_add4320__1);
        boolean o_testTwoLitslitNum4282__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 1, -3 }));
        Assert.assertTrue(o_testTwoLitslitNum4282_add4320__1);
    }

    @Test(timeout = 30000)
    public void testTwoLitslitNum4286_add4319() throws Exception, ContradictionException, TimeoutException {
        boolean o_testTwoLitslitNum4286_add4319__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 1, -0 }));
        Assert.assertTrue(o_testTwoLitslitNum4286_add4319__1);
        boolean o_testTwoLitslitNum4286__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 1, -0 }));
        Assert.assertTrue(o_testTwoLitslitNum4286_add4319__1);
    }

    @Test(timeout = 30000)
    public void testTwoLitslitNum4277litNum4359_failAssert743() throws Exception, ContradictionException, TimeoutException {
        try {
            boolean o_testTwoLitslitNum4277__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 2, -(Integer.MAX_VALUE) }));
            org.junit.Assert.fail("testTwoLitslitNum4277litNum4359 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testTwoLits_add4288litNum4332_failAssert747() throws Exception, ContradictionException, TimeoutException {
        try {
            boolean o_testTwoLits_add4288__1 = this.solver.isSatisfiable(new VecInt(new int[]{ Integer.MAX_VALUE, -2 }));
            boolean o_testTwoLits_add4288__4 = this.solver.isSatisfiable(new VecInt(new int[]{ 1, -2 }));
            org.junit.Assert.fail("testTwoLits_add4288litNum4332 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testTwoLits_add4288litNum4337_failAssert748() throws Exception, ContradictionException, TimeoutException {
        try {
            boolean o_testTwoLits_add4288__1 = this.solver.isSatisfiable(new VecInt(new int[]{ Integer.MIN_VALUE, -2 }));
            boolean o_testTwoLits_add4288__4 = this.solver.isSatisfiable(new VecInt(new int[]{ 1, -2 }));
            org.junit.Assert.fail("testTwoLits_add4288litNum4337 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-2147483648", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testTwoLits_add4288litNum4369_failAssert751() throws Exception, ContradictionException, TimeoutException {
        try {
            boolean o_testTwoLits_add4288__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 1, -2 }));
            boolean o_testTwoLits_add4288__4 = this.solver.isSatisfiable(new VecInt(new int[]{ Integer.MAX_VALUE, -2 }));
            org.junit.Assert.fail("testTwoLits_add4288litNum4369 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testTwoLits_add4288litNum4372_failAssert752() throws Exception, ContradictionException, TimeoutException {
        try {
            boolean o_testTwoLits_add4288__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 1, -2 }));
            boolean o_testTwoLits_add4288__4 = this.solver.isSatisfiable(new VecInt(new int[]{ Integer.MIN_VALUE, -2 }));
            org.junit.Assert.fail("testTwoLits_add4288litNum4372 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-2147483648", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testTwoLitslitNum4277_add4370_add4639() throws Exception, ContradictionException, TimeoutException {
        boolean o_testTwoLitslitNum4277_add4370_add4639__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 2, -2 }));
        Assert.assertFalse(o_testTwoLitslitNum4277_add4370_add4639__1);
        boolean o_testTwoLitslitNum4277_add4370__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 2, -2 }));
        boolean o_testTwoLitslitNum4277__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 2, -2 }));
        Assert.assertFalse(o_testTwoLitslitNum4277_add4370_add4639__1);
    }

    @Test(timeout = 30000)
    public void testTwoLitslitNum4278_add4350_add4579() throws Exception, ContradictionException, TimeoutException {
        boolean o_testTwoLitslitNum4278_add4350_add4579__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 0, -2 }));
        Assert.assertFalse(o_testTwoLitslitNum4278_add4350_add4579__1);
        boolean o_testTwoLitslitNum4278_add4350__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 0, -2 }));
        boolean o_testTwoLitslitNum4278__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 0, -2 }));
        Assert.assertFalse(o_testTwoLitslitNum4278_add4350_add4579__1);
    }

    @Test(timeout = 30000)
    public void testTwoLitslitNum4282_add4320_add4550() throws Exception, ContradictionException, TimeoutException {
        boolean o_testTwoLitslitNum4282_add4320_add4550__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 1, -3 }));
        Assert.assertTrue(o_testTwoLitslitNum4282_add4320_add4550__1);
        boolean o_testTwoLitslitNum4282_add4320__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 1, -3 }));
        boolean o_testTwoLitslitNum4282__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 1, -3 }));
        Assert.assertTrue(o_testTwoLitslitNum4282_add4320_add4550__1);
    }

    @Test(timeout = 30000)
    public void testTwoLitslitNum4286_add4319_add4558() throws Exception, ContradictionException, TimeoutException {
        boolean o_testTwoLitslitNum4286_add4319_add4558__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 1, -0 }));
        Assert.assertTrue(o_testTwoLitslitNum4286_add4319_add4558__1);
        boolean o_testTwoLitslitNum4286_add4319__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 1, -0 }));
        boolean o_testTwoLitslitNum4286__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 1, -0 }));
        Assert.assertTrue(o_testTwoLitslitNum4286_add4319_add4558__1);
    }

    @Test(timeout = 30000)
    public void testTwoLitslitNum4277_add4370litNum4600_failAssert774() throws Exception, ContradictionException, TimeoutException {
        try {
            boolean o_testTwoLitslitNum4277_add4370__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 2, -(Integer.MAX_VALUE) }));
            boolean o_testTwoLitslitNum4277__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 2, -2 }));
            org.junit.Assert.fail("testTwoLitslitNum4277_add4370litNum4600 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testTwoLitslitNum4277_add4370litNum4623_failAssert776() throws Exception, ContradictionException, TimeoutException {
        try {
            boolean o_testTwoLitslitNum4277_add4370__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 2, -2 }));
            boolean o_testTwoLitslitNum4277__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 2, -(Integer.MAX_VALUE) }));
            org.junit.Assert.fail("testTwoLitslitNum4277_add4370litNum4623 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testTwoLitslitNum4278_add4350litNum4560_failAssert780() throws Exception, ContradictionException, TimeoutException {
        try {
            boolean o_testTwoLitslitNum4278_add4350__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 0, -2 }));
            boolean o_testTwoLitslitNum4278__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 0, -(Integer.MAX_VALUE) }));
            org.junit.Assert.fail("testTwoLitslitNum4278_add4350litNum4560 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testTwoLitslitNum4282_add4320litNum4532_failAssert782() throws Exception, ContradictionException, TimeoutException {
        try {
            boolean o_testTwoLitslitNum4282_add4320__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 1, -3 }));
            boolean o_testTwoLitslitNum4282__1 = this.solver.isSatisfiable(new VecInt(new int[]{ Integer.MAX_VALUE, -3 }));
            org.junit.Assert.fail("testTwoLitslitNum4282_add4320litNum4532 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testTwoLitslitNum4286_add4319litNum4545_failAssert784() throws Exception, ContradictionException, TimeoutException {
        try {
            boolean o_testTwoLitslitNum4286_add4319__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 1, -0 }));
            boolean o_testTwoLitslitNum4286__1 = this.solver.isSatisfiable(new VecInt(new int[]{ Integer.MAX_VALUE, -0 }));
            org.junit.Assert.fail("testTwoLitslitNum4286_add4319litNum4545 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testTwoLits_add4288litNum4332_failAssert747litNum4527_failAssert788() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                boolean o_testTwoLits_add4288__1 = this.solver.isSatisfiable(new VecInt(new int[]{ Integer.MAX_VALUE, -3 }));
                boolean o_testTwoLits_add4288__4 = this.solver.isSatisfiable(new VecInt(new int[]{ 1, -2 }));
                org.junit.Assert.fail("testTwoLits_add4288litNum4332 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testTwoLits_add4288litNum4332_failAssert747litNum4527 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testTwoLits_add4288litNum4369_failAssert751litNum4616_failAssert838() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                boolean o_testTwoLits_add4288__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 1, -2 }));
                boolean o_testTwoLits_add4288__4 = this.solver.isSatisfiable(new VecInt(new int[]{ Integer.MAX_VALUE, -(Integer.MAX_VALUE) }));
                org.junit.Assert.fail("testTwoLits_add4288litNum4369 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testTwoLits_add4288litNum4369_failAssert751litNum4616 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testTwoLits_add4288litNum4372_failAssert752litNum4620_failAssert853() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                boolean o_testTwoLits_add4288__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 1, -11052921 }));
                boolean o_testTwoLits_add4288__4 = this.solver.isSatisfiable(new VecInt(new int[]{ Integer.MIN_VALUE, -2 }));
                org.junit.Assert.fail("testTwoLits_add4288litNum4372 should have thrown ArrayIndexOutOfBoundsException");
            }
            org.junit.Assert.fail("testTwoLits_add4288litNum4372_failAssert752litNum4620 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-2147483648", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSameLitslitNum3465() throws Exception, ContradictionException, TimeoutException {
        boolean o_testSameLitslitNum3465__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 3, 1 }));
        Assert.assertTrue(o_testSameLitslitNum3465__1);
    }

    @Test(timeout = 30000)
    public void testSameLitslitNum3466() throws Exception, ContradictionException, TimeoutException {
        boolean o_testSameLitslitNum3466__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 1, 1 }));
        Assert.assertTrue(o_testSameLitslitNum3466__1);
    }

    @Test(timeout = 30000)
    public void testSameLitslitNum3469() throws Exception, ContradictionException, TimeoutException {
        boolean o_testSameLitslitNum3469__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 0, 1 }));
        Assert.assertTrue(o_testSameLitslitNum3469__1);
    }

    @Test(timeout = 30000)
    public void testSameLits_add3476() throws Exception, ContradictionException, TimeoutException {
        boolean o_testSameLits_add3476__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 2, 1 }));
        Assert.assertTrue(o_testSameLits_add3476__1);
        boolean o_testSameLits_add3476__3 = this.solver.isSatisfiable(new VecInt(new int[]{ 2, 1 }));
        Assert.assertTrue(o_testSameLits_add3476__3);
        Assert.assertTrue(o_testSameLits_add3476__1);
    }

    @Test(timeout = 30000)
    public void testSameLitslitNum3467_failAssert607() throws Exception, ContradictionException, TimeoutException {
        try {
            this.solver.isSatisfiable(new VecInt(new int[]{ Integer.MAX_VALUE, 1 }));
            org.junit.Assert.fail("testSameLitslitNum3467 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSameLitslitNum3473_failAssert609() throws Exception, ContradictionException, TimeoutException {
        try {
            this.solver.isSatisfiable(new VecInt(new int[]{ 2, Integer.MAX_VALUE }));
            org.junit.Assert.fail("testSameLitslitNum3473 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSameLitslitNum3474_failAssert610() throws Exception, ContradictionException, TimeoutException {
        try {
            this.solver.isSatisfiable(new VecInt(new int[]{ 2, Integer.MIN_VALUE }));
            org.junit.Assert.fail("testSameLitslitNum3474 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-2147483648", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSameLitslitNum3465_add3564() throws Exception, ContradictionException, TimeoutException {
        boolean o_testSameLitslitNum3465_add3564__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 3, 1 }));
        Assert.assertTrue(o_testSameLitslitNum3465_add3564__1);
        boolean o_testSameLitslitNum3465__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 3, 1 }));
        Assert.assertTrue(o_testSameLitslitNum3465_add3564__1);
    }

    @Test(timeout = 30000)
    public void testSameLitslitNum3466_add3531() throws Exception, ContradictionException, TimeoutException {
        boolean o_testSameLitslitNum3466_add3531__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 1, 1 }));
        Assert.assertTrue(o_testSameLitslitNum3466_add3531__1);
        boolean o_testSameLitslitNum3466__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 1, 1 }));
        Assert.assertTrue(o_testSameLitslitNum3466_add3531__1);
    }

    @Test(timeout = 30000)
    public void testSameLitslitNum3469_add3561() throws Exception, ContradictionException, TimeoutException {
        boolean o_testSameLitslitNum3469_add3561__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 0, 1 }));
        Assert.assertTrue(o_testSameLitslitNum3469_add3561__1);
        boolean o_testSameLitslitNum3469__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 0, 1 }));
        Assert.assertTrue(o_testSameLitslitNum3469_add3561__1);
    }

    @Test(timeout = 30000)
    public void testSameLits_add3476_add3570() throws Exception, ContradictionException, TimeoutException {
        boolean o_testSameLits_add3476_add3570__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 2, 1 }));
        Assert.assertTrue(o_testSameLits_add3476_add3570__1);
        boolean o_testSameLits_add3476__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 2, 1 }));
        boolean o_testSameLits_add3476__3 = this.solver.isSatisfiable(new VecInt(new int[]{ 2, 1 }));
        Assert.assertTrue(o_testSameLits_add3476_add3570__1);
    }

    @Test(timeout = 30000)
    public void testSameLitslitNum3465litNum3554_failAssert611() throws Exception, ContradictionException, TimeoutException {
        try {
            boolean o_testSameLitslitNum3465__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 3, Integer.MAX_VALUE }));
            org.junit.Assert.fail("testSameLitslitNum3465litNum3554 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSameLits_add3476litNum3517_failAssert617() throws Exception, ContradictionException, TimeoutException {
        try {
            boolean o_testSameLits_add3476__1 = this.solver.isSatisfiable(new VecInt(new int[]{ Integer.MAX_VALUE, 1 }));
            boolean o_testSameLits_add3476__3 = this.solver.isSatisfiable(new VecInt(new int[]{ 2, 1 }));
            org.junit.Assert.fail("testSameLits_add3476litNum3517 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSameLits_add3476litNum3548_failAssert621() throws Exception, ContradictionException, TimeoutException {
        try {
            boolean o_testSameLits_add3476__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 2, 1 }));
            boolean o_testSameLits_add3476__3 = this.solver.isSatisfiable(new VecInt(new int[]{ Integer.MAX_VALUE, 1 }));
            org.junit.Assert.fail("testSameLits_add3476litNum3548 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSameLitslitNum3474_failAssert610litNum3511_failAssert641() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                this.solver.isSatisfiable(new VecInt(new int[]{ 1, Integer.MIN_VALUE }));
                org.junit.Assert.fail("testSameLitslitNum3474 should have thrown ArrayIndexOutOfBoundsException");
            }
            org.junit.Assert.fail("testSameLitslitNum3474_failAssert610litNum3511 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-2147483648", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSameLitslitNum3465_add3564_add3775() throws Exception, ContradictionException, TimeoutException {
        boolean o_testSameLitslitNum3465_add3564_add3775__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 3, 1 }));
        Assert.assertTrue(o_testSameLitslitNum3465_add3564_add3775__1);
        boolean o_testSameLitslitNum3465_add3564__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 3, 1 }));
        boolean o_testSameLitslitNum3465__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 3, 1 }));
        Assert.assertTrue(o_testSameLitslitNum3465_add3564_add3775__1);
    }

    @Test(timeout = 30000)
    public void testSameLitslitNum3466_add3531_add3747() throws Exception, ContradictionException, TimeoutException {
        boolean o_testSameLitslitNum3466_add3531_add3747__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 1, 1 }));
        Assert.assertTrue(o_testSameLitslitNum3466_add3531_add3747__1);
        boolean o_testSameLitslitNum3466_add3531__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 1, 1 }));
        boolean o_testSameLitslitNum3466__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 1, 1 }));
        Assert.assertTrue(o_testSameLitslitNum3466_add3531_add3747__1);
    }

    @Test(timeout = 30000)
    public void testSameLitslitNum3469_add3561_add3748() throws Exception, ContradictionException, TimeoutException {
        boolean o_testSameLitslitNum3469_add3561_add3748__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 0, 1 }));
        Assert.assertTrue(o_testSameLitslitNum3469_add3561_add3748__1);
        boolean o_testSameLitslitNum3469_add3561__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 0, 1 }));
        boolean o_testSameLitslitNum3469__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 0, 1 }));
        Assert.assertTrue(o_testSameLitslitNum3469_add3561_add3748__1);
    }

    @Test(timeout = 30000)
    public void testSameLitslitNum3465_add3564litNum3756_failAssert647() throws Exception, ContradictionException, TimeoutException {
        try {
            boolean o_testSameLitslitNum3465_add3564__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 3, Integer.MAX_VALUE }));
            boolean o_testSameLitslitNum3465__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 3, 1 }));
            org.junit.Assert.fail("testSameLitslitNum3465_add3564litNum3756 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSameLitslitNum3465_add3564litNum3767_failAssert649() throws Exception, ContradictionException, TimeoutException {
        try {
            boolean o_testSameLitslitNum3465_add3564__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 3, 1 }));
            boolean o_testSameLitslitNum3465__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 3, Integer.MAX_VALUE }));
            org.junit.Assert.fail("testSameLitslitNum3465_add3564litNum3767 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSameLitslitNum3466_add3531litNum3739_failAssert654() throws Exception, ContradictionException, TimeoutException {
        try {
            boolean o_testSameLitslitNum3466_add3531__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 1, 1 }));
            boolean o_testSameLitslitNum3466__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 1, Integer.MAX_VALUE }));
            org.junit.Assert.fail("testSameLitslitNum3466_add3531litNum3739 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSameLitslitNum3469_add3561litNum3740_failAssert658() throws Exception, ContradictionException, TimeoutException {
        try {
            boolean o_testSameLitslitNum3469_add3561__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 0, 1 }));
            boolean o_testSameLitslitNum3469__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 0, Integer.MAX_VALUE }));
            org.junit.Assert.fail("testSameLitslitNum3469_add3561litNum3740 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSameLits_add3476_add3570litNum3761_failAssert660() throws Exception, ContradictionException, TimeoutException {
        try {
            boolean o_testSameLits_add3476_add3570__1 = this.solver.isSatisfiable(new VecInt(new int[]{ Integer.MAX_VALUE, 1 }));
            boolean o_testSameLits_add3476__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 2, 1 }));
            boolean o_testSameLits_add3476__3 = this.solver.isSatisfiable(new VecInt(new int[]{ 2, 1 }));
            org.junit.Assert.fail("testSameLits_add3476_add3570litNum3761 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSameLits_add3476_add3570litNum3802_failAssert667() throws Exception, ContradictionException, TimeoutException {
        try {
            boolean o_testSameLits_add3476_add3570__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 2, 1 }));
            boolean o_testSameLits_add3476__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 2, Integer.MIN_VALUE }));
            boolean o_testSameLits_add3476__3 = this.solver.isSatisfiable(new VecInt(new int[]{ 2, 1 }));
            org.junit.Assert.fail("testSameLits_add3476_add3570litNum3802 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-2147483648", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testOneSameOneContradictorylitNum2567() throws Exception, ContradictionException, TimeoutException {
        boolean o_testOneSameOneContradictorylitNum2567__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 3, -1 }));
        Assert.assertFalse(o_testOneSameOneContradictorylitNum2567__1);
        boolean o_testOneSameOneContradictorylitNum2567__4 = this.solver.isSatisfiable(new VecInt(new int[]{ -2 }));
        Assert.assertFalse(o_testOneSameOneContradictorylitNum2567__4);
        Assert.assertFalse(o_testOneSameOneContradictorylitNum2567__1);
    }

    @Test(timeout = 30000)
    public void testOneSameOneContradictorylitNum2568() throws Exception, ContradictionException, TimeoutException {
        boolean o_testOneSameOneContradictorylitNum2568__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 1, -1 }));
        Assert.assertFalse(o_testOneSameOneContradictorylitNum2568__1);
        boolean o_testOneSameOneContradictorylitNum2568__4 = this.solver.isSatisfiable(new VecInt(new int[]{ -2 }));
        Assert.assertFalse(o_testOneSameOneContradictorylitNum2568__4);
        Assert.assertFalse(o_testOneSameOneContradictorylitNum2568__1);
    }

    @Test(timeout = 30000)
    public void testOneSameOneContradictorylitNum2571() throws Exception, ContradictionException, TimeoutException {
        boolean o_testOneSameOneContradictorylitNum2571__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 0, -1 }));
        Assert.assertFalse(o_testOneSameOneContradictorylitNum2571__1);
        boolean o_testOneSameOneContradictorylitNum2571__4 = this.solver.isSatisfiable(new VecInt(new int[]{ -2 }));
        Assert.assertFalse(o_testOneSameOneContradictorylitNum2571__4);
        Assert.assertFalse(o_testOneSameOneContradictorylitNum2571__1);
    }

    @Test(timeout = 30000)
    public void testOneSameOneContradictorylitNum2574() throws Exception, ContradictionException, TimeoutException {
        boolean o_testOneSameOneContradictorylitNum2574__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 2, -0 }));
        Assert.assertTrue(o_testOneSameOneContradictorylitNum2574__1);
        boolean o_testOneSameOneContradictorylitNum2574__4 = this.solver.isSatisfiable(new VecInt(new int[]{ -2 }));
        Assert.assertFalse(o_testOneSameOneContradictorylitNum2574__4);
        Assert.assertTrue(o_testOneSameOneContradictorylitNum2574__1);
    }

    @Test(timeout = 30000)
    public void testOneSameOneContradictorylitNum2578() throws Exception, ContradictionException, TimeoutException {
        boolean o_testOneSameOneContradictorylitNum2578__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 2, -1 }));
        Assert.assertFalse(o_testOneSameOneContradictorylitNum2578__1);
        boolean o_testOneSameOneContradictorylitNum2578__4 = this.solver.isSatisfiable(new VecInt(new int[]{ -3 }));
        Assert.assertTrue(o_testOneSameOneContradictorylitNum2578__4);
        Assert.assertFalse(o_testOneSameOneContradictorylitNum2578__1);
    }

    @Test(timeout = 30000)
    public void testOneSameOneContradictorylitNum2582() throws Exception, ContradictionException, TimeoutException {
        boolean o_testOneSameOneContradictorylitNum2582__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 2, -1 }));
        Assert.assertFalse(o_testOneSameOneContradictorylitNum2582__1);
        boolean o_testOneSameOneContradictorylitNum2582__4 = this.solver.isSatisfiable(new VecInt(new int[]{ -0 }));
        Assert.assertTrue(o_testOneSameOneContradictorylitNum2582__4);
        Assert.assertFalse(o_testOneSameOneContradictorylitNum2582__1);
    }

    @Test(timeout = 30000)
    public void testOneSameOneContradictorylitNum2569_failAssert452() throws Exception, ContradictionException, TimeoutException {
        try {
            this.solver.isSatisfiable(new VecInt(new int[]{ Integer.MAX_VALUE, -1 }));
            this.solver.isSatisfiable(new VecInt(new int[]{ -2 }));
            org.junit.Assert.fail("testOneSameOneContradictorylitNum2569 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testOneSameOneContradictorylitNum2572_failAssert454() throws Exception, ContradictionException, TimeoutException {
        try {
            this.solver.isSatisfiable(new VecInt(new int[]{ 1096862091, -1 }));
            this.solver.isSatisfiable(new VecInt(new int[]{ -2 }));
            org.junit.Assert.fail("testOneSameOneContradictorylitNum2572 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testOneSameOneContradictorylitNum2575_failAssert455() throws Exception, ContradictionException, TimeoutException {
        try {
            this.solver.isSatisfiable(new VecInt(new int[]{ 2, -(Integer.MAX_VALUE) }));
            this.solver.isSatisfiable(new VecInt(new int[]{ -2 }));
            org.junit.Assert.fail("testOneSameOneContradictorylitNum2575 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testOneSameOneContradictorylitNum2580_failAssert457() throws Exception, ContradictionException, TimeoutException {
        try {
            this.solver.isSatisfiable(new VecInt(new int[]{ 2, -1 }));
            this.solver.isSatisfiable(new VecInt(new int[]{ -(Integer.MAX_VALUE) }));
            org.junit.Assert.fail("testOneSameOneContradictorylitNum2580 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testOneSameOneContradictorylitNum2581_failAssert458() throws Exception, ContradictionException, TimeoutException {
        try {
            this.solver.isSatisfiable(new VecInt(new int[]{ 2, -1 }));
            this.solver.isSatisfiable(new VecInt(new int[]{ -(Integer.MIN_VALUE) }));
            org.junit.Assert.fail("testOneSameOneContradictorylitNum2581 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-2147483648", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testOneSameOneContradictorylitNum2567_add2743() throws Exception, ContradictionException, TimeoutException {
        boolean o_testOneSameOneContradictorylitNum2567_add2743__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 3, -1 }));
        Assert.assertFalse(o_testOneSameOneContradictorylitNum2567_add2743__1);
        boolean o_testOneSameOneContradictorylitNum2567__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 3, -1 }));
        boolean o_testOneSameOneContradictorylitNum2567__4 = this.solver.isSatisfiable(new VecInt(new int[]{ -2 }));
        Assert.assertFalse(o_testOneSameOneContradictorylitNum2567_add2743__1);
    }

    @Test(timeout = 30000)
    public void testOneSameOneContradictorylitNum2568_add2699() throws Exception, ContradictionException, TimeoutException {
        boolean o_testOneSameOneContradictorylitNum2568_add2699__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 1, -1 }));
        Assert.assertFalse(o_testOneSameOneContradictorylitNum2568_add2699__1);
        boolean o_testOneSameOneContradictorylitNum2568__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 1, -1 }));
        boolean o_testOneSameOneContradictorylitNum2568__4 = this.solver.isSatisfiable(new VecInt(new int[]{ -2 }));
        Assert.assertFalse(o_testOneSameOneContradictorylitNum2568_add2699__1);
    }

    @Test(timeout = 30000)
    public void testOneSameOneContradictorylitNum2571_add2675() throws Exception, ContradictionException, TimeoutException {
        boolean o_testOneSameOneContradictorylitNum2571_add2675__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 0, -1 }));
        Assert.assertFalse(o_testOneSameOneContradictorylitNum2571_add2675__1);
        boolean o_testOneSameOneContradictorylitNum2571__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 0, -1 }));
        boolean o_testOneSameOneContradictorylitNum2571__4 = this.solver.isSatisfiable(new VecInt(new int[]{ -2 }));
        Assert.assertFalse(o_testOneSameOneContradictorylitNum2571_add2675__1);
    }

    @Test(timeout = 30000)
    public void testOneSameOneContradictorylitNum2574_add2720() throws Exception, ContradictionException, TimeoutException {
        boolean o_testOneSameOneContradictorylitNum2574_add2720__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 2, -0 }));
        Assert.assertTrue(o_testOneSameOneContradictorylitNum2574_add2720__1);
        boolean o_testOneSameOneContradictorylitNum2574__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 2, -0 }));
        boolean o_testOneSameOneContradictorylitNum2574__4 = this.solver.isSatisfiable(new VecInt(new int[]{ -2 }));
        Assert.assertTrue(o_testOneSameOneContradictorylitNum2574_add2720__1);
    }

    @Test(timeout = 30000)
    public void testOneSameOneContradictorylitNum2578_add2688() throws Exception, ContradictionException, TimeoutException {
        boolean o_testOneSameOneContradictorylitNum2578_add2688__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 2, -1 }));
        Assert.assertFalse(o_testOneSameOneContradictorylitNum2578_add2688__1);
        boolean o_testOneSameOneContradictorylitNum2578__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 2, -1 }));
        boolean o_testOneSameOneContradictorylitNum2578__4 = this.solver.isSatisfiable(new VecInt(new int[]{ -3 }));
        Assert.assertFalse(o_testOneSameOneContradictorylitNum2578_add2688__1);
    }

    @Test(timeout = 30000)
    public void testOneSameOneContradictorylitNum2578_add2692() throws Exception, ContradictionException, TimeoutException {
        boolean o_testOneSameOneContradictorylitNum2578__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 2, -1 }));
        boolean o_testOneSameOneContradictorylitNum2578_add2692__6 = this.solver.isSatisfiable(new VecInt(new int[]{ -3 }));
        Assert.assertTrue(o_testOneSameOneContradictorylitNum2578_add2692__6);
        boolean o_testOneSameOneContradictorylitNum2578__4 = this.solver.isSatisfiable(new VecInt(new int[]{ -3 }));
        Assert.assertTrue(o_testOneSameOneContradictorylitNum2578_add2692__6);
    }

    @Test(timeout = 30000)
    public void testOneSameOneContradictorylitNum2582_add2640() throws Exception, ContradictionException, TimeoutException {
        boolean o_testOneSameOneContradictorylitNum2582_add2640__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 2, -1 }));
        Assert.assertFalse(o_testOneSameOneContradictorylitNum2582_add2640__1);
        boolean o_testOneSameOneContradictorylitNum2582__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 2, -1 }));
        boolean o_testOneSameOneContradictorylitNum2582__4 = this.solver.isSatisfiable(new VecInt(new int[]{ -0 }));
        Assert.assertFalse(o_testOneSameOneContradictorylitNum2582_add2640__1);
    }

    @Test(timeout = 30000)
    public void testOneSameOneContradictorylitNum2567litNum2717_failAssert459() throws Exception, ContradictionException, TimeoutException {
        try {
            boolean o_testOneSameOneContradictorylitNum2567__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 3, -(Integer.MAX_VALUE) }));
            boolean o_testOneSameOneContradictorylitNum2567__4 = this.solver.isSatisfiable(new VecInt(new int[]{ -2 }));
            org.junit.Assert.fail("testOneSameOneContradictorylitNum2567litNum2717 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testOneSameOneContradictorylitNum2567litNum2732_failAssert461() throws Exception, ContradictionException, TimeoutException {
        try {
            boolean o_testOneSameOneContradictorylitNum2567__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 3, -1 }));
            boolean o_testOneSameOneContradictorylitNum2567__4 = this.solver.isSatisfiable(new VecInt(new int[]{ -(Integer.MAX_VALUE) }));
            org.junit.Assert.fail("testOneSameOneContradictorylitNum2567litNum2732 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testOneSameOneContradictorylitNum2567litNum2736_failAssert462() throws Exception, ContradictionException, TimeoutException {
        try {
            boolean o_testOneSameOneContradictorylitNum2567__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 3, -1 }));
            boolean o_testOneSameOneContradictorylitNum2567__4 = this.solver.isSatisfiable(new VecInt(new int[]{ -(Integer.MIN_VALUE) }));
            org.junit.Assert.fail("testOneSameOneContradictorylitNum2567litNum2736 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-2147483648", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testOneSameOneContradictorylitNum2568litNum2687_failAssert465() throws Exception, ContradictionException, TimeoutException {
        try {
            boolean o_testOneSameOneContradictorylitNum2568__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 1, -1 }));
            boolean o_testOneSameOneContradictorylitNum2568__4 = this.solver.isSatisfiable(new VecInt(new int[]{ -(Integer.MAX_VALUE) }));
            org.junit.Assert.fail("testOneSameOneContradictorylitNum2568litNum2687 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testOneSameOneContradictorylitNum2571litNum2657_failAssert469() throws Exception, ContradictionException, TimeoutException {
        try {
            boolean o_testOneSameOneContradictorylitNum2571__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 0, -1 }));
            boolean o_testOneSameOneContradictorylitNum2571__4 = this.solver.isSatisfiable(new VecInt(new int[]{ -(Integer.MAX_VALUE) }));
            org.junit.Assert.fail("testOneSameOneContradictorylitNum2571litNum2657 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testOneSameOneContradictorylitNum2574litNum2701_failAssert471() throws Exception, ContradictionException, TimeoutException {
        try {
            boolean o_testOneSameOneContradictorylitNum2574__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 2, -0 }));
            boolean o_testOneSameOneContradictorylitNum2574__4 = this.solver.isSatisfiable(new VecInt(new int[]{ -(Integer.MAX_VALUE) }));
            org.junit.Assert.fail("testOneSameOneContradictorylitNum2574litNum2701 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testOneSameOneContradictorylitNum2569_failAssert452litNum2634_failAssert473() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                this.solver.isSatisfiable(new VecInt(new int[]{ Integer.MAX_VALUE, -2 }));
                this.solver.isSatisfiable(new VecInt(new int[]{ -2 }));
                org.junit.Assert.fail("testOneSameOneContradictorylitNum2569 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testOneSameOneContradictorylitNum2569_failAssert452litNum2634 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testOneSameOneContradictorylitNum2567_add2743_add3148() throws Exception, ContradictionException, TimeoutException {
        boolean o_testOneSameOneContradictorylitNum2567_add2743_add3148__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 3, -1 }));
        Assert.assertFalse(o_testOneSameOneContradictorylitNum2567_add2743_add3148__1);
        boolean o_testOneSameOneContradictorylitNum2567_add2743__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 3, -1 }));
        boolean o_testOneSameOneContradictorylitNum2567__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 3, -1 }));
        boolean o_testOneSameOneContradictorylitNum2567__4 = this.solver.isSatisfiable(new VecInt(new int[]{ -2 }));
        Assert.assertFalse(o_testOneSameOneContradictorylitNum2567_add2743_add3148__1);
    }

    @Test(timeout = 30000)
    public void testOneSameOneContradictorylitNum2568_add2699_add3059() throws Exception, ContradictionException, TimeoutException {
        boolean o_testOneSameOneContradictorylitNum2568_add2699_add3059__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 1, -1 }));
        Assert.assertFalse(o_testOneSameOneContradictorylitNum2568_add2699_add3059__1);
        boolean o_testOneSameOneContradictorylitNum2568_add2699__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 1, -1 }));
        boolean o_testOneSameOneContradictorylitNum2568__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 1, -1 }));
        boolean o_testOneSameOneContradictorylitNum2568__4 = this.solver.isSatisfiable(new VecInt(new int[]{ -2 }));
        Assert.assertFalse(o_testOneSameOneContradictorylitNum2568_add2699_add3059__1);
    }

    @Test(timeout = 30000)
    public void testOneSameOneContradictorylitNum2571_add2675_add3115() throws Exception, ContradictionException, TimeoutException {
        boolean o_testOneSameOneContradictorylitNum2571_add2675_add3115__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 0, -1 }));
        Assert.assertFalse(o_testOneSameOneContradictorylitNum2571_add2675_add3115__1);
        boolean o_testOneSameOneContradictorylitNum2571_add2675__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 0, -1 }));
        boolean o_testOneSameOneContradictorylitNum2571__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 0, -1 }));
        boolean o_testOneSameOneContradictorylitNum2571__4 = this.solver.isSatisfiable(new VecInt(new int[]{ -2 }));
        Assert.assertFalse(o_testOneSameOneContradictorylitNum2571_add2675_add3115__1);
    }

    @Test(timeout = 30000)
    public void testOneSameOneContradictorylitNum2574_add2720_add3086() throws Exception, ContradictionException, TimeoutException {
        boolean o_testOneSameOneContradictorylitNum2574_add2720_add3086__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 2, -0 }));
        Assert.assertTrue(o_testOneSameOneContradictorylitNum2574_add2720_add3086__1);
        boolean o_testOneSameOneContradictorylitNum2574_add2720__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 2, -0 }));
        boolean o_testOneSameOneContradictorylitNum2574__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 2, -0 }));
        boolean o_testOneSameOneContradictorylitNum2574__4 = this.solver.isSatisfiable(new VecInt(new int[]{ -2 }));
        Assert.assertTrue(o_testOneSameOneContradictorylitNum2574_add2720_add3086__1);
    }

    @Test(timeout = 30000)
    public void testOneSameOneContradictorylitNum2578_add2688_add3023() throws Exception, ContradictionException, TimeoutException {
        boolean o_testOneSameOneContradictorylitNum2578_add2688_add3023__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 2, -1 }));
        Assert.assertFalse(o_testOneSameOneContradictorylitNum2578_add2688_add3023__1);
        boolean o_testOneSameOneContradictorylitNum2578_add2688__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 2, -1 }));
        boolean o_testOneSameOneContradictorylitNum2578__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 2, -1 }));
        boolean o_testOneSameOneContradictorylitNum2578__4 = this.solver.isSatisfiable(new VecInt(new int[]{ -3 }));
        Assert.assertFalse(o_testOneSameOneContradictorylitNum2578_add2688_add3023__1);
    }

    @Test(timeout = 30000)
    public void testOneSameOneContradictorylitNum2578_add2688_add3030() throws Exception, ContradictionException, TimeoutException {
        boolean o_testOneSameOneContradictorylitNum2578_add2688__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 2, -1 }));
        boolean o_testOneSameOneContradictorylitNum2578__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 2, -1 }));
        boolean o_testOneSameOneContradictorylitNum2578_add2688_add3030__11 = this.solver.isSatisfiable(new VecInt(new int[]{ -3 }));
        Assert.assertTrue(o_testOneSameOneContradictorylitNum2578_add2688_add3030__11);
        boolean o_testOneSameOneContradictorylitNum2578__4 = this.solver.isSatisfiable(new VecInt(new int[]{ -3 }));
        Assert.assertTrue(o_testOneSameOneContradictorylitNum2578_add2688_add3030__11);
    }

    @Test(timeout = 30000)
    public void testOneSameOneContradictorylitNum2582_add2640_add3024() throws Exception, ContradictionException, TimeoutException {
        boolean o_testOneSameOneContradictorylitNum2582_add2640_add3024__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 2, -1 }));
        Assert.assertFalse(o_testOneSameOneContradictorylitNum2582_add2640_add3024__1);
        boolean o_testOneSameOneContradictorylitNum2582_add2640__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 2, -1 }));
        boolean o_testOneSameOneContradictorylitNum2582__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 2, -1 }));
        boolean o_testOneSameOneContradictorylitNum2582__4 = this.solver.isSatisfiable(new VecInt(new int[]{ -0 }));
        Assert.assertFalse(o_testOneSameOneContradictorylitNum2582_add2640_add3024__1);
    }

    @Test(timeout = 30000)
    public void testOneSameOneContradictorylitNum2567_add2743litNum3109_failAssert536() throws Exception, ContradictionException, TimeoutException {
        try {
            boolean o_testOneSameOneContradictorylitNum2567_add2743__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 3, -(Integer.MAX_VALUE) }));
            boolean o_testOneSameOneContradictorylitNum2567__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 3, -1 }));
            boolean o_testOneSameOneContradictorylitNum2567__4 = this.solver.isSatisfiable(new VecInt(new int[]{ -2 }));
            org.junit.Assert.fail("testOneSameOneContradictorylitNum2567_add2743litNum3109 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testOneSameOneContradictorylitNum2567_add2743litNum3122_failAssert538() throws Exception, ContradictionException, TimeoutException {
        try {
            boolean o_testOneSameOneContradictorylitNum2567_add2743__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 3, -1 }));
            boolean o_testOneSameOneContradictorylitNum2567__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 3, -(Integer.MAX_VALUE) }));
            boolean o_testOneSameOneContradictorylitNum2567__4 = this.solver.isSatisfiable(new VecInt(new int[]{ -2 }));
            org.junit.Assert.fail("testOneSameOneContradictorylitNum2567_add2743litNum3122 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testOneSameOneContradictorylitNum2567_add2743litNum3136_failAssert540() throws Exception, ContradictionException, TimeoutException {
        try {
            boolean o_testOneSameOneContradictorylitNum2567_add2743__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 3, -1 }));
            boolean o_testOneSameOneContradictorylitNum2567__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 3, -1 }));
            boolean o_testOneSameOneContradictorylitNum2567__4 = this.solver.isSatisfiable(new VecInt(new int[]{ -(Integer.MAX_VALUE) }));
            org.junit.Assert.fail("testOneSameOneContradictorylitNum2567_add2743litNum3136 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testOneSameOneContradictorylitNum2568_add2699litNum3033_failAssert544() throws Exception, ContradictionException, TimeoutException {
        try {
            boolean o_testOneSameOneContradictorylitNum2568_add2699__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 1, -1 }));
            boolean o_testOneSameOneContradictorylitNum2568__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 1, -(Integer.MAX_VALUE) }));
            boolean o_testOneSameOneContradictorylitNum2568__4 = this.solver.isSatisfiable(new VecInt(new int[]{ -2 }));
            org.junit.Assert.fail("testOneSameOneContradictorylitNum2568_add2699litNum3033 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testOneSameOneContradictorylitNum2571_add2675litNum3081_failAssert549() throws Exception, ContradictionException, TimeoutException {
        try {
            boolean o_testOneSameOneContradictorylitNum2571_add2675__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 0, -(Integer.MIN_VALUE) }));
            boolean o_testOneSameOneContradictorylitNum2571__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 0, -1 }));
            boolean o_testOneSameOneContradictorylitNum2571__4 = this.solver.isSatisfiable(new VecInt(new int[]{ -2 }));
            org.junit.Assert.fail("testOneSameOneContradictorylitNum2571_add2675litNum3081 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-2147483648", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testOneSameOneContradictorylitNum2571_add2675litNum3091_failAssert550() throws Exception, ContradictionException, TimeoutException {
        try {
            boolean o_testOneSameOneContradictorylitNum2571_add2675__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 0, -1 }));
            boolean o_testOneSameOneContradictorylitNum2571__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 0, -(Integer.MAX_VALUE) }));
            boolean o_testOneSameOneContradictorylitNum2571__4 = this.solver.isSatisfiable(new VecInt(new int[]{ -2 }));
            org.junit.Assert.fail("testOneSameOneContradictorylitNum2571_add2675litNum3091 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testOneSameOneContradictorylitNum2571_add2675litNum3105_failAssert552() throws Exception, ContradictionException, TimeoutException {
        try {
            boolean o_testOneSameOneContradictorylitNum2571_add2675__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 0, -1 }));
            boolean o_testOneSameOneContradictorylitNum2571__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 0, -1 }));
            boolean o_testOneSameOneContradictorylitNum2571__4 = this.solver.isSatisfiable(new VecInt(new int[]{ -(Integer.MAX_VALUE) }));
            org.junit.Assert.fail("testOneSameOneContradictorylitNum2571_add2675litNum3105 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testOneSameOneContradictorylitNum2574_add2720litNum3045_failAssert554() throws Exception, ContradictionException, TimeoutException {
        try {
            boolean o_testOneSameOneContradictorylitNum2574_add2720__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 2, -0 }));
            boolean o_testOneSameOneContradictorylitNum2574__1 = this.solver.isSatisfiable(new VecInt(new int[]{ Integer.MAX_VALUE, -0 }));
            boolean o_testOneSameOneContradictorylitNum2574__4 = this.solver.isSatisfiable(new VecInt(new int[]{ -2 }));
            org.junit.Assert.fail("testOneSameOneContradictorylitNum2574_add2720litNum3045 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testOneSameOneContradictorylitNum2574_add2720litNum3066_failAssert556() throws Exception, ContradictionException, TimeoutException {
        try {
            boolean o_testOneSameOneContradictorylitNum2574_add2720__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 2, -0 }));
            boolean o_testOneSameOneContradictorylitNum2574__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 2, -0 }));
            boolean o_testOneSameOneContradictorylitNum2574__4 = this.solver.isSatisfiable(new VecInt(new int[]{ -(Integer.MAX_VALUE) }));
            org.junit.Assert.fail("testOneSameOneContradictorylitNum2574_add2720litNum3066 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testOneSameOneContradictorylitNum2567litNum2732_failAssert461litNum3039_failAssert567() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                boolean o_testOneSameOneContradictorylitNum2567__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 3, -0 }));
                boolean o_testOneSameOneContradictorylitNum2567__4 = this.solver.isSatisfiable(new VecInt(new int[]{ -(Integer.MAX_VALUE) }));
                org.junit.Assert.fail("testOneSameOneContradictorylitNum2567litNum2732 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testOneSameOneContradictorylitNum2567litNum2732_failAssert461litNum3039 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testOneSameOneContradictorylitNum2567litNum2732_failAssert461litNum3047_failAssert570() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                boolean o_testOneSameOneContradictorylitNum2567__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 3, -27399841 }));
                boolean o_testOneSameOneContradictorylitNum2567__4 = this.solver.isSatisfiable(new VecInt(new int[]{ -(Integer.MAX_VALUE) }));
                org.junit.Assert.fail("testOneSameOneContradictorylitNum2567litNum2732 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testOneSameOneContradictorylitNum2567litNum2732_failAssert461litNum3047 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testOneSameOneContradictorylitNum2568litNum2687_failAssert465litNum3135_failAssert582() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                boolean o_testOneSameOneContradictorylitNum2568__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 1, -0 }));
                boolean o_testOneSameOneContradictorylitNum2568__4 = this.solver.isSatisfiable(new VecInt(new int[]{ -(Integer.MAX_VALUE) }));
                org.junit.Assert.fail("testOneSameOneContradictorylitNum2568litNum2687 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testOneSameOneContradictorylitNum2568litNum2687_failAssert465litNum3135 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testOneSameOneContradictorylitNum2571litNum2657_failAssert469litNum3137_failAssert592() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                boolean o_testOneSameOneContradictorylitNum2571__1 = this.solver.isSatisfiable(new VecInt(new int[]{ 0, -11438003 }));
                boolean o_testOneSameOneContradictorylitNum2571__4 = this.solver.isSatisfiable(new VecInt(new int[]{ -(Integer.MAX_VALUE) }));
                org.junit.Assert.fail("testOneSameOneContradictorylitNum2571litNum2657 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testOneSameOneContradictorylitNum2571litNum2657_failAssert469litNum3137 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testOneSameOneContradictorylitNum2569_failAssert452litNum2634_failAssert473litNum3089_failAssert599() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    this.solver.isSatisfiable(new VecInt(new int[]{ Integer.MAX_VALUE, -2 }));
                    this.solver.isSatisfiable(new VecInt(new int[]{ -3 }));
                    org.junit.Assert.fail("testOneSameOneContradictorylitNum2569 should have thrown NegativeArraySizeException");
                }
                org.junit.Assert.fail("testOneSameOneContradictorylitNum2569_failAssert452litNum2634 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testOneSameOneContradictorylitNum2569_failAssert452litNum2634_failAssert473litNum3089 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }
}

