package org.sat4j.minisat.core;


import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;
import org.sat4j.minisat.orders.LevelAndActivityVariableComparator;


public class HeapLevelTest {
    public void testSetBounds() {
    }

    @Test(timeout = 10000)
    public void testInHeap3() throws Exception {
        Heap heap = new Heap(new LevelAndActivityVariableComparator(new double[]{ 0.0, 3.0, 9.0, 2.0 }, new int[]{ Integer.MAX_VALUE, 3, 2, 1 }));
        heap.setBounds(5);
        boolean o_testInHeap3__5 = heap.inHeap(1);
        Assert.assertFalse(o_testInHeap3__5);
        boolean o_testInHeap3__6 = heap.inHeap(2);
        Assert.assertFalse(o_testInHeap3__6);
        boolean o_testInHeap3__7 = heap.inHeap(3);
        Assert.assertFalse(o_testInHeap3__7);
        heap.insert(1);
        boolean o_testInHeap3__9 = heap.inHeap(1);
        Assert.assertTrue(o_testInHeap3__9);
        boolean o_testInHeap3__10 = heap.inHeap(2);
        Assert.assertFalse(o_testInHeap3__10);
        boolean o_testInHeap3__11 = heap.inHeap(2);
        Assert.assertFalse(o_testInHeap3__11);
        boolean o_testInHeap3__12 = heap.inHeap(3);
        Assert.assertFalse(o_testInHeap3__12);
        boolean o_testInHeap3__13 = heap.inHeap(3);
        Assert.assertFalse(o_testInHeap3__13);
        heap.insert(2);
        boolean o_testInHeap3__15 = heap.inHeap(1);
        Assert.assertTrue(o_testInHeap3__15);
        boolean o_testInHeap3__16 = heap.inHeap(1);
        Assert.assertTrue(o_testInHeap3__16);
        boolean o_testInHeap3__17 = heap.inHeap(2);
        Assert.assertTrue(o_testInHeap3__17);
        boolean o_testInHeap3__18 = heap.inHeap(3);
        Assert.assertFalse(o_testInHeap3__18);
        boolean o_testInHeap3__19 = heap.inHeap(3);
        Assert.assertFalse(o_testInHeap3__19);
        boolean o_testInHeap3__20 = heap.inHeap(3);
        Assert.assertFalse(o_testInHeap3__20);
        heap.insert(3);
        boolean o_testInHeap3__22 = heap.inHeap(1);
        Assert.assertTrue(o_testInHeap3__22);
        boolean o_testInHeap3__23 = heap.inHeap(1);
        Assert.assertTrue(o_testInHeap3__23);
        boolean o_testInHeap3__24 = heap.inHeap(1);
        Assert.assertTrue(o_testInHeap3__24);
        boolean o_testInHeap3__25 = heap.inHeap(2);
        Assert.assertTrue(o_testInHeap3__25);
        boolean o_testInHeap3__26 = heap.inHeap(2);
        Assert.assertTrue(o_testInHeap3__26);
        boolean o_testInHeap3__27 = heap.inHeap(3);
        Assert.assertTrue(o_testInHeap3__27);
        heap.getmin();
        boolean o_testInHeap3__29 = heap.inHeap(1);
        Assert.assertTrue(o_testInHeap3__29);
        boolean o_testInHeap3__30 = heap.inHeap(1);
        Assert.assertTrue(o_testInHeap3__30);
        boolean o_testInHeap3__31 = heap.inHeap(1);
        Assert.assertTrue(o_testInHeap3__31);
        boolean o_testInHeap3__32 = heap.inHeap(1);
        Assert.assertTrue(o_testInHeap3__32);
        boolean o_testInHeap3__33 = heap.inHeap(2);
        Assert.assertTrue(o_testInHeap3__33);
        boolean o_testInHeap3__34 = heap.inHeap(2);
        Assert.assertTrue(o_testInHeap3__34);
        boolean o_testInHeap3__35 = heap.inHeap(2);
        Assert.assertTrue(o_testInHeap3__35);
        boolean o_testInHeap3__36 = heap.inHeap(3);
        Assert.assertFalse(o_testInHeap3__36);
        boolean o_testInHeap3__37 = heap.inHeap(3);
        Assert.assertFalse(o_testInHeap3__37);
        boolean o_testInHeap3__38 = heap.inHeap(3);
        Assert.assertFalse(o_testInHeap3__38);
        boolean o_testInHeap3__39 = heap.inHeap(3);
        Assert.assertFalse(o_testInHeap3__39);
        heap.getmin();
        boolean o_testInHeap3__41 = heap.inHeap(1);
        Assert.assertTrue(o_testInHeap3__41);
        boolean o_testInHeap3__42 = heap.inHeap(1);
        Assert.assertTrue(o_testInHeap3__42);
        boolean o_testInHeap3__43 = heap.inHeap(1);
        Assert.assertTrue(o_testInHeap3__43);
        boolean o_testInHeap3__44 = heap.inHeap(1);
        Assert.assertTrue(o_testInHeap3__44);
        boolean o_testInHeap3__45 = heap.inHeap(1);
        Assert.assertTrue(o_testInHeap3__45);
        boolean o_testInHeap3__46 = heap.inHeap(2);
        Assert.assertFalse(o_testInHeap3__46);
        boolean o_testInHeap3__47 = heap.inHeap(2);
        Assert.assertFalse(o_testInHeap3__47);
        boolean o_testInHeap3__48 = heap.inHeap(2);
        Assert.assertFalse(o_testInHeap3__48);
        boolean o_testInHeap3__49 = heap.inHeap(3);
        Assert.assertFalse(o_testInHeap3__49);
        boolean o_testInHeap3__50 = heap.inHeap(3);
        Assert.assertFalse(o_testInHeap3__50);
        boolean o_testInHeap3__51 = heap.inHeap(3);
        Assert.assertFalse(o_testInHeap3__51);
        boolean o_testInHeap3__52 = heap.inHeap(3);
        Assert.assertFalse(o_testInHeap3__52);
        boolean o_testInHeap3__53 = heap.inHeap(3);
        Assert.assertFalse(o_testInHeap3__53);
        heap.getmin();
        boolean o_testInHeap3__55 = heap.inHeap(1);
        Assert.assertFalse(o_testInHeap3__55);
        boolean o_testInHeap3__56 = heap.inHeap(1);
        Assert.assertFalse(o_testInHeap3__56);
        boolean o_testInHeap3__57 = heap.inHeap(2);
        Assert.assertFalse(o_testInHeap3__57);
        boolean o_testInHeap3__58 = heap.inHeap(2);
        Assert.assertFalse(o_testInHeap3__58);
        boolean o_testInHeap3__59 = heap.inHeap(2);
        Assert.assertFalse(o_testInHeap3__59);
        boolean o_testInHeap3__60 = heap.inHeap(2);
        Assert.assertFalse(o_testInHeap3__60);
        boolean o_testInHeap3__61 = heap.inHeap(3);
        Assert.assertFalse(o_testInHeap3__61);
        boolean o_testInHeap3__62 = heap.inHeap(3);
        Assert.assertFalse(o_testInHeap3__62);
        boolean o_testInHeap3__63 = heap.inHeap(3);
        Assert.assertFalse(o_testInHeap3__63);
        boolean o_testInHeap3__64 = heap.inHeap(3);
        Assert.assertFalse(o_testInHeap3__64);
        boolean o_testInHeap3__65 = heap.inHeap(3);
        Assert.assertFalse(o_testInHeap3__65);
        boolean o_testInHeap3__66 = heap.inHeap(3);
        Assert.assertFalse(o_testInHeap3__66);
        Assert.assertFalse(o_testInHeap3__5);
        Assert.assertFalse(o_testInHeap3__6);
        Assert.assertFalse(o_testInHeap3__7);
        Assert.assertTrue(o_testInHeap3__9);
        Assert.assertFalse(o_testInHeap3__10);
        Assert.assertFalse(o_testInHeap3__11);
        Assert.assertFalse(o_testInHeap3__12);
        Assert.assertFalse(o_testInHeap3__13);
        Assert.assertTrue(o_testInHeap3__15);
        Assert.assertTrue(o_testInHeap3__16);
        Assert.assertTrue(o_testInHeap3__17);
        Assert.assertFalse(o_testInHeap3__18);
        Assert.assertFalse(o_testInHeap3__19);
        Assert.assertFalse(o_testInHeap3__20);
        Assert.assertTrue(o_testInHeap3__22);
        Assert.assertTrue(o_testInHeap3__23);
        Assert.assertTrue(o_testInHeap3__24);
        Assert.assertTrue(o_testInHeap3__25);
        Assert.assertTrue(o_testInHeap3__26);
        Assert.assertTrue(o_testInHeap3__27);
        Assert.assertTrue(o_testInHeap3__29);
        Assert.assertTrue(o_testInHeap3__30);
        Assert.assertTrue(o_testInHeap3__31);
        Assert.assertTrue(o_testInHeap3__32);
        Assert.assertTrue(o_testInHeap3__33);
        Assert.assertTrue(o_testInHeap3__34);
        Assert.assertTrue(o_testInHeap3__35);
        Assert.assertFalse(o_testInHeap3__36);
        Assert.assertFalse(o_testInHeap3__37);
        Assert.assertFalse(o_testInHeap3__38);
        Assert.assertFalse(o_testInHeap3__39);
        Assert.assertTrue(o_testInHeap3__41);
        Assert.assertTrue(o_testInHeap3__42);
        Assert.assertTrue(o_testInHeap3__43);
        Assert.assertTrue(o_testInHeap3__44);
        Assert.assertTrue(o_testInHeap3__45);
        Assert.assertFalse(o_testInHeap3__46);
        Assert.assertFalse(o_testInHeap3__47);
        Assert.assertFalse(o_testInHeap3__48);
        Assert.assertFalse(o_testInHeap3__49);
        Assert.assertFalse(o_testInHeap3__50);
        Assert.assertFalse(o_testInHeap3__51);
        Assert.assertFalse(o_testInHeap3__52);
        Assert.assertFalse(o_testInHeap3__53);
        Assert.assertFalse(o_testInHeap3__55);
        Assert.assertFalse(o_testInHeap3__56);
        Assert.assertFalse(o_testInHeap3__57);
        Assert.assertFalse(o_testInHeap3__58);
        Assert.assertFalse(o_testInHeap3__59);
        Assert.assertFalse(o_testInHeap3__60);
        Assert.assertFalse(o_testInHeap3__61);
        Assert.assertFalse(o_testInHeap3__62);
        Assert.assertFalse(o_testInHeap3__63);
        Assert.assertFalse(o_testInHeap3__64);
        Assert.assertFalse(o_testInHeap3__65);
    }

    public void testIncrease() {
    }

    public void testHeapProperty() {
    }

    public void testHeapPropertyInt() {
    }
}

