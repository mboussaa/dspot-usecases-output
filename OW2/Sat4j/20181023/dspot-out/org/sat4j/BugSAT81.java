package org.sat4j;


import java.util.HashSet;
import java.util.Set;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.sat4j.core.VecInt;
import org.sat4j.minisat.SolverFactory;
import org.sat4j.minisat.constraints.cnf.UnitClause;
import org.sat4j.specs.ContradictionException;
import org.sat4j.specs.IConstr;
import org.sat4j.specs.IVecInt;
import org.sat4j.specs.TimeoutException;
import org.sat4j.tools.GateTranslator;


public class BugSAT81 {
    private GateTranslator solver;

    @Before
    public void setUp() throws Exception {
        solver = new GateTranslator(SolverFactory.newDefault());
    }

    @Test(timeout = 10000)
    public void testSimplePhoneSATSmall() throws Exception, ContradictionException, TimeoutException {
        VecInt clause0 = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause0)).toString());
        Assert.assertTrue(((VecInt) (clause0)).isEmpty());
        IVecInt o_testSimplePhoneSATSmall__4 = clause0.push(1);
        Assert.assertEquals("1", ((VecInt) (o_testSimplePhoneSATSmall__4)).toString());
        Assert.assertEquals(1, ((int) (((VecInt) (o_testSimplePhoneSATSmall__4)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testSimplePhoneSATSmall__4)).isEmpty());
        IConstr o_testSimplePhoneSATSmall__5 = solver.addClause(clause0);
        Assert.assertTrue(((UnitClause) (o_testSimplePhoneSATSmall__5)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_testSimplePhoneSATSmall__5)).getActivity())), 0.1);
        Assert.assertEquals("1", ((UnitClause) (o_testSimplePhoneSATSmall__5)).toString());
        VecInt clause1 = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause1)).toString());
        Assert.assertTrue(((VecInt) (clause1)).isEmpty());
        IVecInt o_testSimplePhoneSATSmall__9 = clause1.push(1);
        Assert.assertEquals("1", ((VecInt) (o_testSimplePhoneSATSmall__9)).toString());
        Assert.assertEquals(1, ((int) (((VecInt) (o_testSimplePhoneSATSmall__9)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testSimplePhoneSATSmall__9)).isEmpty());
        IVecInt o_testSimplePhoneSATSmall__10 = clause1.push((-2));
        Assert.assertEquals("1,-2", ((VecInt) (o_testSimplePhoneSATSmall__10)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_testSimplePhoneSATSmall__10)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testSimplePhoneSATSmall__10)).isEmpty());
        solver.addClause(clause1);
        VecInt clause2 = new VecInt();
        clause2.push(2);
        clause2.push((-1));
        solver.addClause(clause2);
        VecInt clause3 = new VecInt();
        clause3.push(3);
        clause3.push((-2));
        solver.addClause(clause3);
        VecInt clause8 = new VecInt();
        clause8.push(2);
        clause8.push((-3));
        solver.addClause(clause8);
        VecInt clause4 = new VecInt();
        clause4.push((-4));
        clause4.push(1);
        solver.addClause(clause4);
        VecInt clause5 = new VecInt();
        clause5.push((-5));
        clause5.push(4);
        solver.addClause(clause5);
        VecInt clause6 = new VecInt();
        clause6.push((-6));
        clause6.push(4);
        solver.addClause(clause6);
        VecInt clause7 = new VecInt();
        clause7.push(5);
        clause7.push(6);
        clause7.push((-4));
        solver.addAtLeast(clause6, 1);
        solver.isSatisfiable();
        VecInt bound1 = new VecInt();
        bound1.push(3);
        solver.findModel(bound1);
        VecInt bound2 = new VecInt();
        bound2.push((-3));
        solver.findModel(bound2);
        VecInt bound3 = new VecInt();
        bound3.push(5);
        bound3.push(3);
        solver.findModel(bound3);
        VecInt bound4 = new VecInt();
        bound4.push(5);
        bound4.push((-3));
        solver.findModel(bound4);
        VecInt bound5 = new VecInt();
        bound5.push(4);
        bound5.push((-3));
        solver.findModel(bound5);
        VecInt bound6 = new VecInt();
        bound6.push(4);
        bound6.push(3);
        solver.findModel(bound6);
        VecInt bound7 = new VecInt();
        bound7.push(4);
        int[] model = solver.findModel(bound7);
        Set<Integer> satisfiedModel = new HashSet<Integer>();
        for (int i : model) {
            satisfiedModel.add(new Integer(i));
        }
        satisfiedModel.contains(new Integer(4));
        satisfiedModel.contains(new Integer(1));
        satisfiedModel.contains(new Integer(2));
    }
}

