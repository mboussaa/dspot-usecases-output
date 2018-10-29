package org.sat4j.minisat.constraints;


import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.sat4j.minisat.VarOrderTest;
import org.sat4j.minisat.constraints.cnf.Lits;
import org.sat4j.minisat.core.ILits;


public class LitTest {
    private ILits lits;

    public LitTest(String arg0) {
        super(arg0);
    }

    @Before
    public void setUp() throws Exception {
        this.lits = new Lits();
    }

    @Test(timeout = 10000)
    public void testNewVar() throws Exception {
        int p = this.voc.getFromPool((-1));
        Assert.assertEquals(3, ((int) (p)));
        this.order.init();
        int o_testNewVar__5 = this.order.select();
        Assert.assertEquals(3, ((int) (o_testNewVar__5)));
        this.voc.satisfies(2);
        int o_testNewVar__8 = this.order.select();
        Assert.assertEquals(-1, ((int) (o_testNewVar__8)));
        Assert.assertEquals(3, ((int) (p)));
        Assert.assertEquals(3, ((int) (o_testNewVar__5)));
    }
}

