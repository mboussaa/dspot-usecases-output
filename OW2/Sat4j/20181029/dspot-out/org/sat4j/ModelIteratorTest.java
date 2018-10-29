package org.sat4j;


import org.junit.Assert;
import org.junit.Test;
import org.sat4j.core.VecInt;
import org.sat4j.minisat.SolverFactory;
import org.sat4j.specs.ContradictionException;
import org.sat4j.specs.IVecInt;
import org.sat4j.specs.TimeoutException;
import org.sat4j.tools.SolutionCounter;


public class ModelIteratorTest {
    @Test(timeout = 12000)
    public void testSpecificValues() throws Exception, ContradictionException, TimeoutException {
        long o_testSpecificValues__1 = count(2);
        Assert.assertEquals(3L, ((long) (o_testSpecificValues__1)));
        long o_testSpecificValues__2 = count(3);
        Assert.assertEquals(7L, ((long) (o_testSpecificValues__2)));
        long o_testSpecificValues__3 = count(4);
        Assert.assertEquals(15L, ((long) (o_testSpecificValues__3)));
        long o_testSpecificValues__4 = count(5);
        Assert.assertEquals(31L, ((long) (o_testSpecificValues__4)));
        long o_testSpecificValues__5 = count(6);
        Assert.assertEquals(63L, ((long) (o_testSpecificValues__5)));
        long o_testSpecificValues__6 = count(7);
        Assert.assertEquals(127L, ((long) (o_testSpecificValues__6)));
        long o_testSpecificValues__7 = count(8);
        Assert.assertEquals(255L, ((long) (o_testSpecificValues__7)));
        long o_testSpecificValues__8 = count(9);
        Assert.assertEquals(511L, ((long) (o_testSpecificValues__8)));
        Assert.assertEquals(3L, ((long) (o_testSpecificValues__1)));
        Assert.assertEquals(7L, ((long) (o_testSpecificValues__2)));
        Assert.assertEquals(15L, ((long) (o_testSpecificValues__3)));
        Assert.assertEquals(31L, ((long) (o_testSpecificValues__4)));
        Assert.assertEquals(63L, ((long) (o_testSpecificValues__5)));
        Assert.assertEquals(127L, ((long) (o_testSpecificValues__6)));
        Assert.assertEquals(255L, ((long) (o_testSpecificValues__7)));
    }

    private long count(int size) throws ContradictionException, TimeoutException {
        SolutionCounter counter = new SolutionCounter(SolverFactory.newDefault());
        IVecInt clause = new VecInt();
        for (int i = 1; i <= size; i++) {
            clause.push(i);
        }
        counter.addClause(clause);
        counter.setTimeout(10);
        return counter.countSolutions();
    }
}

