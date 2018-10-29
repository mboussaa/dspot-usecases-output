package org.sat4j.tools;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.sat4j.core.VecInt;
import org.sat4j.minisat.SolverFactory;
import org.sat4j.specs.IVecInt;


public class TestCheckItIsAMUSAmpl {
    private CheckMUSSolutionListener check;

    @Before
    public void setUp() throws Exception {
        check = new CheckMUSSolutionListener(SolverFactory.instance());
    }

    @Test(timeout = 10000)
    public void testItWorksOnSimpleNonMUSes() throws Exception {
        IVecInt c1 = new VecInt();
        IVecInt o_testItWorksOnSimpleNonMUSes__3 = c1.push(1);
        Assert.assertEquals("1", ((org.sat4j.core.VecInt)o_testItWorksOnSimpleNonMUSes__3).toString());
        Assert.assertEquals(1, ((int) (((org.sat4j.core.VecInt)o_testItWorksOnSimpleNonMUSes__3).hashCode())));
        Assert.assertFalse(((org.sat4j.core.VecInt)o_testItWorksOnSimpleNonMUSes__3).isEmpty());
        check.addOriginalClause(c1);
        c1.clear();
        IVecInt o_testItWorksOnSimpleNonMUSes__6 = c1.push(2);
        Assert.assertEquals("2", ((org.sat4j.core.VecInt)o_testItWorksOnSimpleNonMUSes__6).toString());
        Assert.assertEquals(2, ((int) (((org.sat4j.core.VecInt)o_testItWorksOnSimpleNonMUSes__6).hashCode())));
        Assert.assertFalse(((org.sat4j.core.VecInt)o_testItWorksOnSimpleNonMUSes__6).isEmpty());
        check.addOriginalClause(c1);
        IVecInt mus = new VecInt();
        IVecInt o_testItWorksOnSimpleNonMUSes__13 = mus.push(1).push(2);
        Assert.assertEquals("1,2", ((org.sat4j.core.VecInt)o_testItWorksOnSimpleNonMUSes__13).toString());
        Assert.assertEquals(1, ((int) (((org.sat4j.core.VecInt)o_testItWorksOnSimpleNonMUSes__13).hashCode())));
        Assert.assertFalse(((org.sat4j.core.VecInt)o_testItWorksOnSimpleNonMUSes__13).isEmpty());
        boolean o_testItWorksOnSimpleNonMUSes__15 = this.check.checkThatItIsAMUS(mus);
        Assert.assertFalse(o_testItWorksOnSimpleNonMUSes__15);
        Assert.assertEquals("2", ((org.sat4j.core.VecInt)o_testItWorksOnSimpleNonMUSes__3).toString());
        Assert.assertEquals(2, ((int) (((org.sat4j.core.VecInt)o_testItWorksOnSimpleNonMUSes__3).hashCode())));
        Assert.assertFalse(((org.sat4j.core.VecInt)o_testItWorksOnSimpleNonMUSes__3).isEmpty());
        Assert.assertEquals("2", ((org.sat4j.core.VecInt)o_testItWorksOnSimpleNonMUSes__6).toString());
        Assert.assertEquals(2, ((int) (((org.sat4j.core.VecInt)o_testItWorksOnSimpleNonMUSes__6).hashCode())));
        Assert.assertFalse(((org.sat4j.core.VecInt)o_testItWorksOnSimpleNonMUSes__6).isEmpty());
        Assert.assertEquals("1,2", ((org.sat4j.core.VecInt)o_testItWorksOnSimpleNonMUSes__13).toString());
        Assert.assertEquals(1, ((int) (((org.sat4j.core.VecInt)o_testItWorksOnSimpleNonMUSes__13).hashCode())));
        Assert.assertFalse(((org.sat4j.core.VecInt)o_testItWorksOnSimpleNonMUSes__13).isEmpty());
    }
}

