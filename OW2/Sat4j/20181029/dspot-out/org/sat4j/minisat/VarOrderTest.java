package org.sat4j.minisat;


import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.sat4j.minisat.constraints.ClausalDataStructureWL;
import org.sat4j.minisat.core.ILits;
import org.sat4j.minisat.core.IOrder;
import org.sat4j.minisat.orders.VarOrderHeap;


public class VarOrderTest {
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

    public void testNewVarint() {
    }

    public void testSelect() {
    }

    public void testSetVarDecay() {
    }

    public void testUndo() {
    }

    public void testUpdateVar() {
    }

    public void testVarDecayActivity() {
    }

    public void testNumberOfInterestingVariables() {
    }

    public void testGetVocabulary() {
    }

    @Before
    public void setUp() throws Exception {
        this.voc = new ClausalDataStructureWL().getVocabulary();
        this.voc.ensurePool(5);
        this.order = new VarOrderHeap();
        this.order.setLits(this.voc);
    }

    private ILits voc;

    private IOrder order;
}

