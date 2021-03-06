package org.sat4j.minisat.core;


import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;
import org.sat4j.minisat.orders.ActivityBasedVariableComparator;


public class HeapTest {
    public void testSetBounds() {
    }

    @Test(timeout = 10000)
    public void testInHeap() throws Exception {
        Heap heap = new Heap(new ActivityBasedVariableComparator(new double[]{ 0.0, 3.0, 9.0, 2.0 }));
        heap.setBounds(5);
        boolean o_testInHeap__5 = heap.inHeap(1);
        Assert.assertFalse(o_testInHeap__5);
        boolean o_testInHeap__6 = heap.inHeap(2);
        Assert.assertFalse(o_testInHeap__6);
        boolean o_testInHeap__7 = heap.inHeap(3);
        Assert.assertFalse(o_testInHeap__7);
        heap.insert(1);
        boolean o_testInHeap__9 = heap.inHeap(1);
        Assert.assertTrue(o_testInHeap__9);
        boolean o_testInHeap__10 = heap.inHeap(2);
        Assert.assertFalse(o_testInHeap__10);
        boolean o_testInHeap__11 = heap.inHeap(2);
        Assert.assertFalse(o_testInHeap__11);
        boolean o_testInHeap__12 = heap.inHeap(3);
        Assert.assertFalse(o_testInHeap__12);
        boolean o_testInHeap__13 = heap.inHeap(3);
        Assert.assertFalse(o_testInHeap__13);
        heap.insert(2);
        boolean o_testInHeap__15 = heap.inHeap(1);
        Assert.assertTrue(o_testInHeap__15);
        boolean o_testInHeap__16 = heap.inHeap(1);
        Assert.assertTrue(o_testInHeap__16);
        boolean o_testInHeap__17 = heap.inHeap(2);
        Assert.assertTrue(o_testInHeap__17);
        boolean o_testInHeap__18 = heap.inHeap(3);
        Assert.assertFalse(o_testInHeap__18);
        boolean o_testInHeap__19 = heap.inHeap(3);
        Assert.assertFalse(o_testInHeap__19);
        boolean o_testInHeap__20 = heap.inHeap(3);
        Assert.assertFalse(o_testInHeap__20);
        heap.insert(3);
        boolean o_testInHeap__22 = heap.inHeap(1);
        Assert.assertTrue(o_testInHeap__22);
        boolean o_testInHeap__23 = heap.inHeap(1);
        Assert.assertTrue(o_testInHeap__23);
        boolean o_testInHeap__24 = heap.inHeap(1);
        Assert.assertTrue(o_testInHeap__24);
        boolean o_testInHeap__25 = heap.inHeap(2);
        Assert.assertTrue(o_testInHeap__25);
        boolean o_testInHeap__26 = heap.inHeap(2);
        Assert.assertTrue(o_testInHeap__26);
        boolean o_testInHeap__27 = heap.inHeap(3);
        Assert.assertTrue(o_testInHeap__27);
        heap.getmin();
        boolean o_testInHeap__29 = heap.inHeap(1);
        Assert.assertTrue(o_testInHeap__29);
        boolean o_testInHeap__30 = heap.inHeap(1);
        Assert.assertTrue(o_testInHeap__30);
        boolean o_testInHeap__31 = heap.inHeap(1);
        Assert.assertTrue(o_testInHeap__31);
        boolean o_testInHeap__32 = heap.inHeap(1);
        Assert.assertTrue(o_testInHeap__32);
        boolean o_testInHeap__33 = heap.inHeap(2);
        Assert.assertFalse(o_testInHeap__33);
        boolean o_testInHeap__34 = heap.inHeap(2);
        Assert.assertFalse(o_testInHeap__34);
        boolean o_testInHeap__35 = heap.inHeap(2);
        Assert.assertFalse(o_testInHeap__35);
        boolean o_testInHeap__36 = heap.inHeap(3);
        Assert.assertTrue(o_testInHeap__36);
        boolean o_testInHeap__37 = heap.inHeap(3);
        Assert.assertTrue(o_testInHeap__37);
        heap.getmin();
        boolean o_testInHeap__39 = heap.inHeap(1);
        Assert.assertFalse(o_testInHeap__39);
        boolean o_testInHeap__40 = heap.inHeap(1);
        Assert.assertFalse(o_testInHeap__40);
        boolean o_testInHeap__41 = heap.inHeap(2);
        Assert.assertFalse(o_testInHeap__41);
        boolean o_testInHeap__42 = heap.inHeap(2);
        Assert.assertFalse(o_testInHeap__42);
        boolean o_testInHeap__43 = heap.inHeap(2);
        Assert.assertFalse(o_testInHeap__43);
        boolean o_testInHeap__44 = heap.inHeap(2);
        Assert.assertFalse(o_testInHeap__44);
        boolean o_testInHeap__45 = heap.inHeap(3);
        Assert.assertTrue(o_testInHeap__45);
        boolean o_testInHeap__46 = heap.inHeap(3);
        Assert.assertTrue(o_testInHeap__46);
        boolean o_testInHeap__47 = heap.inHeap(3);
        Assert.assertTrue(o_testInHeap__47);
        heap.getmin();
        boolean o_testInHeap__49 = heap.inHeap(1);
        Assert.assertFalse(o_testInHeap__49);
        boolean o_testInHeap__50 = heap.inHeap(1);
        Assert.assertFalse(o_testInHeap__50);
        boolean o_testInHeap__51 = heap.inHeap(1);
        Assert.assertFalse(o_testInHeap__51);
        boolean o_testInHeap__52 = heap.inHeap(2);
        Assert.assertFalse(o_testInHeap__52);
        boolean o_testInHeap__53 = heap.inHeap(2);
        Assert.assertFalse(o_testInHeap__53);
        boolean o_testInHeap__54 = heap.inHeap(2);
        Assert.assertFalse(o_testInHeap__54);
        boolean o_testInHeap__55 = heap.inHeap(2);
        Assert.assertFalse(o_testInHeap__55);
        boolean o_testInHeap__56 = heap.inHeap(2);
        Assert.assertFalse(o_testInHeap__56);
        boolean o_testInHeap__57 = heap.inHeap(3);
        Assert.assertFalse(o_testInHeap__57);
        boolean o_testInHeap__58 = heap.inHeap(3);
        Assert.assertFalse(o_testInHeap__58);
        boolean o_testInHeap__59 = heap.inHeap(3);
        Assert.assertFalse(o_testInHeap__59);
        boolean o_testInHeap__60 = heap.inHeap(3);
        Assert.assertFalse(o_testInHeap__60);
        Assert.assertFalse(o_testInHeap__5);
        Assert.assertFalse(o_testInHeap__6);
        Assert.assertFalse(o_testInHeap__7);
        Assert.assertTrue(o_testInHeap__9);
        Assert.assertFalse(o_testInHeap__10);
        Assert.assertFalse(o_testInHeap__11);
        Assert.assertFalse(o_testInHeap__12);
        Assert.assertFalse(o_testInHeap__13);
        Assert.assertTrue(o_testInHeap__15);
        Assert.assertTrue(o_testInHeap__16);
        Assert.assertTrue(o_testInHeap__17);
        Assert.assertFalse(o_testInHeap__18);
        Assert.assertFalse(o_testInHeap__19);
        Assert.assertFalse(o_testInHeap__20);
        Assert.assertTrue(o_testInHeap__22);
        Assert.assertTrue(o_testInHeap__23);
        Assert.assertTrue(o_testInHeap__24);
        Assert.assertTrue(o_testInHeap__25);
        Assert.assertTrue(o_testInHeap__26);
        Assert.assertTrue(o_testInHeap__27);
        Assert.assertTrue(o_testInHeap__29);
        Assert.assertTrue(o_testInHeap__30);
        Assert.assertTrue(o_testInHeap__31);
        Assert.assertTrue(o_testInHeap__32);
        Assert.assertFalse(o_testInHeap__33);
        Assert.assertFalse(o_testInHeap__34);
        Assert.assertFalse(o_testInHeap__35);
        Assert.assertTrue(o_testInHeap__36);
        Assert.assertTrue(o_testInHeap__37);
        Assert.assertFalse(o_testInHeap__39);
        Assert.assertFalse(o_testInHeap__40);
        Assert.assertFalse(o_testInHeap__41);
        Assert.assertFalse(o_testInHeap__42);
        Assert.assertFalse(o_testInHeap__43);
        Assert.assertFalse(o_testInHeap__44);
        Assert.assertTrue(o_testInHeap__45);
        Assert.assertTrue(o_testInHeap__46);
        Assert.assertTrue(o_testInHeap__47);
        Assert.assertFalse(o_testInHeap__49);
        Assert.assertFalse(o_testInHeap__50);
        Assert.assertFalse(o_testInHeap__51);
        Assert.assertFalse(o_testInHeap__52);
        Assert.assertFalse(o_testInHeap__53);
        Assert.assertFalse(o_testInHeap__54);
        Assert.assertFalse(o_testInHeap__55);
        Assert.assertFalse(o_testInHeap__56);
        Assert.assertFalse(o_testInHeap__57);
        Assert.assertFalse(o_testInHeap__58);
        Assert.assertFalse(o_testInHeap__59);
    }

    public void testIncrease() {
    }

    public void testHeapProperty() {
    }

    public void testHeapPropertyInt() {
    }
}

