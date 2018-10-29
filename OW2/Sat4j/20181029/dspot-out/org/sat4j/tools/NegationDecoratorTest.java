package org.sat4j.tools;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.sat4j.core.ConstrGroup;
import org.sat4j.core.VecInt;
import org.sat4j.minisat.SolverFactory;
import org.sat4j.specs.ContradictionException;
import org.sat4j.specs.IConstr;
import org.sat4j.specs.ISolver;
import org.sat4j.specs.IVecInt;
import org.sat4j.specs.TimeoutException;


public class NegationDecoratorTest {
    private ISolver solver;

    @Before
    public void setUp() throws Exception {
        solver = new NegationDecorator<ISolver>(SolverFactory.newDefault());
    }

    @Test(timeout = 10000)
    public void testNegatingTwoClauses() throws Exception, ContradictionException, TimeoutException {
        int o_testNegatingTwoClauses__1 = solver.newVar(3);
        Assert.assertEquals(3, ((int) (o_testNegatingTwoClauses__1)));
        IVecInt clause = new VecInt();
        IVecInt o_testNegatingTwoClauses__4 = clause.push(1).push(2).push(3);
        Assert.assertEquals("1,2,3", ((VecInt) (o_testNegatingTwoClauses__4)).toString());
        Assert.assertEquals(2, ((int) (((VecInt) (o_testNegatingTwoClauses__4)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNegatingTwoClauses__4)).isEmpty());
        IConstr o_testNegatingTwoClauses__7 = solver.addClause(clause);
        Assert.assertEquals(0.0, ((double) (((ConstrGroup) (o_testNegatingTwoClauses__7)).getActivity())), 0.1);
        Assert.assertEquals("-1[?] 4[?],-2[?] 4[?],-3[?] 4[?]", ((ConstrGroup) (o_testNegatingTwoClauses__7)).toString());
        clause.clear();
        IVecInt o_testNegatingTwoClauses__9 = clause.push((-1)).push(2).push(3);
        Assert.assertEquals("-1,2,3", ((VecInt) (o_testNegatingTwoClauses__9)).toString());
        Assert.assertEquals(1, ((int) (((VecInt) (o_testNegatingTwoClauses__9)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNegatingTwoClauses__9)).isEmpty());
        IConstr o_testNegatingTwoClauses__13 = solver.addClause(clause);
        Assert.assertEquals(0.0, ((double) (((ConstrGroup) (o_testNegatingTwoClauses__13)).getActivity())), 0.1);
        Assert.assertEquals("1[?] 5[?],-2[?] 5[?],-3[?] 5[?]", ((ConstrGroup) (o_testNegatingTwoClauses__13)).toString());
        solver.isSatisfiable();
        int[] model = solver.model();
        int int_3 = model[1];
        int int_4 = model[2];
        Assert.assertEquals(3, ((int) (o_testNegatingTwoClauses__1)));
        Assert.assertEquals("-1,2,3", ((VecInt) (o_testNegatingTwoClauses__4)).toString());
        Assert.assertEquals(1, ((int) (((VecInt) (o_testNegatingTwoClauses__4)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNegatingTwoClauses__4)).isEmpty());
        Assert.assertEquals(0.0, ((double) (((ConstrGroup) (o_testNegatingTwoClauses__7)).getActivity())), 0.1);
        Assert.assertEquals("-1[?] 4[?],-2[?] 4[?],-3[?] 4[?]", ((ConstrGroup) (o_testNegatingTwoClauses__7)).toString());
        Assert.assertEquals("-1,2,3", ((VecInt) (o_testNegatingTwoClauses__9)).toString());
        Assert.assertEquals(1, ((int) (((VecInt) (o_testNegatingTwoClauses__9)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testNegatingTwoClauses__9)).isEmpty());
        Assert.assertEquals(0.0, ((double) (((ConstrGroup) (o_testNegatingTwoClauses__13)).getActivity())), 0.1);
        Assert.assertEquals("1[?] 5[?],-2[?] 5[?],-3[?] 5[?]", ((ConstrGroup) (o_testNegatingTwoClauses__13)).toString());
    }
}

