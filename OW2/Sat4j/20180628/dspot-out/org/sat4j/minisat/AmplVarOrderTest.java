package org.sat4j.minisat;


import org.junit.Before;
import org.sat4j.minisat.constraints.ClausalDataStructureWL;
import org.sat4j.minisat.core.ILits;
import org.sat4j.minisat.core.IOrder;
import org.sat4j.minisat.orders.VarOrderHeap;


public class AmplVarOrderTest {
    private ILits voc;

    private IOrder order;

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
}

