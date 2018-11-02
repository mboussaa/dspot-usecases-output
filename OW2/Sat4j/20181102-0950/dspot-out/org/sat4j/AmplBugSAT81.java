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


public class AmplBugSAT81 {
    private GateTranslator solver;

    @Before
    public void setUp() throws Exception {
        solver = new GateTranslator(SolverFactory.newDefault());
    }

    @Test(timeout = 30000)
    public void testSimplePhoneSATSmall() throws Exception, ContradictionException, TimeoutException {
        VecInt clause0 = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause0)).toString());
        Assert.assertTrue(((VecInt) (clause0)).isEmpty());
        IVecInt o_testSimplePhoneSATSmall__4 = clause0.push(1);
        Assert.assertEquals("1", ((VecInt) (o_testSimplePhoneSATSmall__4)).toString());
        Assert.assertEquals(1, ((int) (((VecInt) (o_testSimplePhoneSATSmall__4)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testSimplePhoneSATSmall__4)).isEmpty());
        IConstr o_testSimplePhoneSATSmall__5 = solver.addClause(clause0);
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_testSimplePhoneSATSmall__5)).getActivity())), 0.1);
        Assert.assertTrue(((UnitClause) (o_testSimplePhoneSATSmall__5)).isSatisfied());
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

    @Test(timeout = 30000)
    public void testSimplePhoneSATSmall_add240() throws Exception, ContradictionException, TimeoutException {
        VecInt clause0 = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause0)).toString());
        Assert.assertTrue(((VecInt) (clause0)).isEmpty());
        IVecInt o_testSimplePhoneSATSmall_add240__4 = clause0.push(1);
        Assert.assertEquals("1", ((VecInt) (o_testSimplePhoneSATSmall_add240__4)).toString());
        Assert.assertEquals(1, ((int) (((VecInt) (o_testSimplePhoneSATSmall_add240__4)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testSimplePhoneSATSmall_add240__4)).isEmpty());
        IConstr o_testSimplePhoneSATSmall_add240__5 = this.solver.addClause(clause0);
        Assert.assertTrue(((UnitClause) (o_testSimplePhoneSATSmall_add240__5)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_testSimplePhoneSATSmall_add240__5)).getActivity())), 0.1);
        Assert.assertEquals("1", ((UnitClause) (o_testSimplePhoneSATSmall_add240__5)).toString());
        VecInt clause1 = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause1)).toString());
        Assert.assertTrue(((VecInt) (clause1)).isEmpty());
        IVecInt o_testSimplePhoneSATSmall_add240__9 = clause1.push(1);
        Assert.assertEquals("1", ((VecInt) (o_testSimplePhoneSATSmall_add240__9)).toString());
        Assert.assertEquals(1, ((int) (((VecInt) (o_testSimplePhoneSATSmall_add240__9)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testSimplePhoneSATSmall_add240__9)).isEmpty());
        IVecInt o_testSimplePhoneSATSmall_add240__10 = clause1.push((-2));
        Assert.assertEquals("1,-2", ((VecInt) (o_testSimplePhoneSATSmall_add240__10)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_testSimplePhoneSATSmall_add240__10)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testSimplePhoneSATSmall_add240__10)).isEmpty());
        this.solver.addClause(clause1);
        VecInt clause2 = new VecInt();
        clause2.push(2);
        clause2.push((-1));
        this.solver.addClause(clause2);
        VecInt clause3 = new VecInt();
        clause3.push(3);
        clause3.push((-2));
        this.solver.addClause(clause3);
        VecInt clause8 = new VecInt();
        clause8.push(2);
        clause8.push((-3));
        this.solver.addClause(clause8);
        VecInt clause4 = new VecInt();
        clause4.push((-4));
        clause4.push(1);
        this.solver.addClause(clause4);
        VecInt clause5 = new VecInt();
        clause5.push((-5));
        clause5.push(4);
        this.solver.addClause(clause5);
        VecInt clause6 = new VecInt();
        clause6.push((-6));
        clause6.push(4);
        this.solver.addClause(clause6);
        VecInt clause7 = new VecInt();
        clause7.push(5);
        clause7.push(6);
        clause7.push((-4));
        this.solver.addAtLeast(clause6, 1);
        this.solver.isSatisfiable();
        VecInt bound1 = new VecInt();
        bound1.push(3);
        this.solver.findModel(bound1);
        VecInt bound2 = new VecInt();
        bound2.push((-3));
        this.solver.findModel(bound2);
        VecInt bound3 = new VecInt();
        bound3.push(5);
        bound3.push(3);
        this.solver.findModel(bound3);
        VecInt bound4 = new VecInt();
        bound4.push(5);
        bound4.push((-3));
        this.solver.findModel(bound4);
        VecInt bound5 = new VecInt();
        bound5.push(4);
        bound5.push((-3));
        this.solver.findModel(bound5);
        VecInt bound6 = new VecInt();
        bound6.push(4);
        bound6.push(3);
        this.solver.findModel(bound6);
        VecInt bound7 = new VecInt();
        bound7.push(4);
        int[] model = this.solver.findModel(bound7);
        Set<Integer> satisfiedModel = new HashSet<Integer>();
        for (int i : model) {
            satisfiedModel.add(new Integer(i));
        }
        satisfiedModel.contains(new Integer(4));
        satisfiedModel.contains(new Integer(4));
        satisfiedModel.contains(new Integer(1));
        satisfiedModel.contains(new Integer(2));
    }

    @Test(timeout = 30000)
    public void testSimplePhoneSATSmall_add194() throws Exception, ContradictionException, TimeoutException {
        VecInt clause0 = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause0)).toString());
        Assert.assertTrue(((VecInt) (clause0)).isEmpty());
        IVecInt o_testSimplePhoneSATSmall_add194__4 = clause0.push(1);
        Assert.assertEquals("1", ((VecInt) (o_testSimplePhoneSATSmall_add194__4)).toString());
        Assert.assertEquals(1, ((int) (((VecInt) (o_testSimplePhoneSATSmall_add194__4)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testSimplePhoneSATSmall_add194__4)).isEmpty());
        IConstr o_testSimplePhoneSATSmall_add194__5 = this.solver.addClause(clause0);
        Assert.assertTrue(((UnitClause) (o_testSimplePhoneSATSmall_add194__5)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_testSimplePhoneSATSmall_add194__5)).getActivity())), 0.1);
        Assert.assertEquals("1", ((UnitClause) (o_testSimplePhoneSATSmall_add194__5)).toString());
        this.solver.addClause(clause0);
        VecInt clause1 = new VecInt();
        clause1.push(1);
        clause1.push((-2));
        this.solver.addClause(clause1);
        VecInt clause2 = new VecInt();
        clause2.push(2);
        clause2.push((-1));
        this.solver.addClause(clause2);
        VecInt clause3 = new VecInt();
        clause3.push(3);
        clause3.push((-2));
        this.solver.addClause(clause3);
        VecInt clause8 = new VecInt();
        clause8.push(2);
        clause8.push((-3));
        this.solver.addClause(clause8);
        VecInt clause4 = new VecInt();
        clause4.push((-4));
        clause4.push(1);
        this.solver.addClause(clause4);
        VecInt clause5 = new VecInt();
        clause5.push((-5));
        clause5.push(4);
        this.solver.addClause(clause5);
        VecInt clause6 = new VecInt();
        clause6.push((-6));
        clause6.push(4);
        this.solver.addClause(clause6);
        VecInt clause7 = new VecInt();
        clause7.push(5);
        clause7.push(6);
        clause7.push((-4));
        this.solver.addAtLeast(clause6, 1);
        this.solver.isSatisfiable();
        VecInt bound1 = new VecInt();
        bound1.push(3);
        this.solver.findModel(bound1);
        VecInt bound2 = new VecInt();
        bound2.push((-3));
        this.solver.findModel(bound2);
        VecInt bound3 = new VecInt();
        bound3.push(5);
        bound3.push(3);
        this.solver.findModel(bound3);
        VecInt bound4 = new VecInt();
        bound4.push(5);
        bound4.push((-3));
        this.solver.findModel(bound4);
        VecInt bound5 = new VecInt();
        bound5.push(4);
        bound5.push((-3));
        this.solver.findModel(bound5);
        VecInt bound6 = new VecInt();
        bound6.push(4);
        bound6.push(3);
        this.solver.findModel(bound6);
        VecInt bound7 = new VecInt();
        bound7.push(4);
        int[] model = this.solver.findModel(bound7);
        Set<Integer> satisfiedModel = new HashSet<Integer>();
        for (int i : model) {
            satisfiedModel.add(new Integer(i));
        }
        satisfiedModel.contains(new Integer(4));
        satisfiedModel.contains(new Integer(1));
        satisfiedModel.contains(new Integer(2));
    }

    @Test(timeout = 30000)
    public void testSimplePhoneSATSmalllitNum6() throws Exception, ContradictionException, TimeoutException {
        VecInt clause0 = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause0)).toString());
        Assert.assertTrue(((VecInt) (clause0)).isEmpty());
        IVecInt o_testSimplePhoneSATSmalllitNum6__4 = clause0.push(1);
        Assert.assertEquals("1", ((VecInt) (o_testSimplePhoneSATSmalllitNum6__4)).toString());
        Assert.assertEquals(1, ((int) (((VecInt) (o_testSimplePhoneSATSmalllitNum6__4)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testSimplePhoneSATSmalllitNum6__4)).isEmpty());
        IConstr o_testSimplePhoneSATSmalllitNum6__5 = this.solver.addClause(clause0);
        Assert.assertTrue(((UnitClause) (o_testSimplePhoneSATSmalllitNum6__5)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_testSimplePhoneSATSmalllitNum6__5)).getActivity())), 0.1);
        Assert.assertEquals("1", ((UnitClause) (o_testSimplePhoneSATSmalllitNum6__5)).toString());
        VecInt clause1 = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause1)).toString());
        Assert.assertTrue(((VecInt) (clause1)).isEmpty());
        IVecInt o_testSimplePhoneSATSmalllitNum6__9 = clause1.push(2);
        Assert.assertEquals("2", ((VecInt) (o_testSimplePhoneSATSmalllitNum6__9)).toString());
        Assert.assertEquals(2, ((int) (((VecInt) (o_testSimplePhoneSATSmalllitNum6__9)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testSimplePhoneSATSmalllitNum6__9)).isEmpty());
        IVecInt o_testSimplePhoneSATSmalllitNum6__10 = clause1.push((-2));
        Assert.assertEquals("2,-2", ((VecInt) (o_testSimplePhoneSATSmalllitNum6__10)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_testSimplePhoneSATSmalllitNum6__10)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testSimplePhoneSATSmalllitNum6__10)).isEmpty());
        this.solver.addClause(clause1);
        VecInt clause2 = new VecInt();
        clause2.push(2);
        clause2.push((-1));
        this.solver.addClause(clause2);
        VecInt clause3 = new VecInt();
        clause3.push(3);
        clause3.push((-2));
        this.solver.addClause(clause3);
        VecInt clause8 = new VecInt();
        clause8.push(2);
        clause8.push((-3));
        this.solver.addClause(clause8);
        VecInt clause4 = new VecInt();
        clause4.push((-4));
        clause4.push(1);
        this.solver.addClause(clause4);
        VecInt clause5 = new VecInt();
        clause5.push((-5));
        clause5.push(4);
        this.solver.addClause(clause5);
        VecInt clause6 = new VecInt();
        clause6.push((-6));
        clause6.push(4);
        this.solver.addClause(clause6);
        VecInt clause7 = new VecInt();
        clause7.push(5);
        clause7.push(6);
        clause7.push((-4));
        this.solver.addAtLeast(clause6, 1);
        this.solver.isSatisfiable();
        VecInt bound1 = new VecInt();
        bound1.push(3);
        this.solver.findModel(bound1);
        VecInt bound2 = new VecInt();
        bound2.push((-3));
        this.solver.findModel(bound2);
        VecInt bound3 = new VecInt();
        bound3.push(5);
        bound3.push(3);
        this.solver.findModel(bound3);
        VecInt bound4 = new VecInt();
        bound4.push(5);
        bound4.push((-3));
        this.solver.findModel(bound4);
        VecInt bound5 = new VecInt();
        bound5.push(4);
        bound5.push((-3));
        this.solver.findModel(bound5);
        VecInt bound6 = new VecInt();
        bound6.push(4);
        bound6.push(3);
        this.solver.findModel(bound6);
        VecInt bound7 = new VecInt();
        bound7.push(4);
        int[] model = this.solver.findModel(bound7);
        Set<Integer> satisfiedModel = new HashSet<Integer>();
        for (int i : model) {
            satisfiedModel.add(new Integer(i));
        }
        satisfiedModel.contains(new Integer(4));
        satisfiedModel.contains(new Integer(1));
        satisfiedModel.contains(new Integer(2));
    }

    @Test(timeout = 30000)
    public void testSimplePhoneSATSmalllitNum23() throws Exception, ContradictionException, TimeoutException {
        VecInt clause0 = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause0)).toString());
        Assert.assertTrue(((VecInt) (clause0)).isEmpty());
        IVecInt o_testSimplePhoneSATSmalllitNum23__4 = clause0.push(1);
        Assert.assertEquals("1", ((VecInt) (o_testSimplePhoneSATSmalllitNum23__4)).toString());
        Assert.assertEquals(1, ((int) (((VecInt) (o_testSimplePhoneSATSmalllitNum23__4)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testSimplePhoneSATSmalllitNum23__4)).isEmpty());
        IConstr o_testSimplePhoneSATSmalllitNum23__5 = this.solver.addClause(clause0);
        Assert.assertTrue(((UnitClause) (o_testSimplePhoneSATSmalllitNum23__5)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_testSimplePhoneSATSmalllitNum23__5)).getActivity())), 0.1);
        Assert.assertEquals("1", ((UnitClause) (o_testSimplePhoneSATSmalllitNum23__5)).toString());
        VecInt clause1 = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause1)).toString());
        Assert.assertTrue(((VecInt) (clause1)).isEmpty());
        IVecInt o_testSimplePhoneSATSmalllitNum23__9 = clause1.push(1);
        Assert.assertEquals("1", ((VecInt) (o_testSimplePhoneSATSmalllitNum23__9)).toString());
        Assert.assertEquals(1, ((int) (((VecInt) (o_testSimplePhoneSATSmalllitNum23__9)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testSimplePhoneSATSmalllitNum23__9)).isEmpty());
        IVecInt o_testSimplePhoneSATSmalllitNum23__10 = clause1.push((-2));
        Assert.assertEquals("1,-2", ((VecInt) (o_testSimplePhoneSATSmalllitNum23__10)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_testSimplePhoneSATSmalllitNum23__10)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testSimplePhoneSATSmalllitNum23__10)).isEmpty());
        this.solver.addClause(clause1);
        VecInt clause2 = new VecInt();
        clause2.push(2);
        clause2.push((-2));
        this.solver.addClause(clause2);
        VecInt clause3 = new VecInt();
        clause3.push(3);
        clause3.push((-2));
        this.solver.addClause(clause3);
        VecInt clause8 = new VecInt();
        clause8.push(2);
        clause8.push((-3));
        this.solver.addClause(clause8);
        VecInt clause4 = new VecInt();
        clause4.push((-4));
        clause4.push(1);
        this.solver.addClause(clause4);
        VecInt clause5 = new VecInt();
        clause5.push((-5));
        clause5.push(4);
        this.solver.addClause(clause5);
        VecInt clause6 = new VecInt();
        clause6.push((-6));
        clause6.push(4);
        this.solver.addClause(clause6);
        VecInt clause7 = new VecInt();
        clause7.push(5);
        clause7.push(6);
        clause7.push((-4));
        this.solver.addAtLeast(clause6, 1);
        this.solver.isSatisfiable();
        VecInt bound1 = new VecInt();
        bound1.push(3);
        this.solver.findModel(bound1);
        VecInt bound2 = new VecInt();
        bound2.push((-3));
        this.solver.findModel(bound2);
        VecInt bound3 = new VecInt();
        bound3.push(5);
        bound3.push(3);
        this.solver.findModel(bound3);
        VecInt bound4 = new VecInt();
        bound4.push(5);
        bound4.push((-3));
        this.solver.findModel(bound4);
        VecInt bound5 = new VecInt();
        bound5.push(4);
        bound5.push((-3));
        this.solver.findModel(bound5);
        VecInt bound6 = new VecInt();
        bound6.push(4);
        bound6.push(3);
        this.solver.findModel(bound6);
        VecInt bound7 = new VecInt();
        bound7.push(4);
        int[] model = this.solver.findModel(bound7);
        Set<Integer> satisfiedModel = new HashSet<Integer>();
        for (int i : model) {
            satisfiedModel.add(new Integer(i));
        }
        satisfiedModel.contains(new Integer(4));
        satisfiedModel.contains(new Integer(1));
        satisfiedModel.contains(new Integer(2));
    }

    @Test(timeout = 30000)
    public void testSimplePhoneSATSmalllitNum70() throws Exception, ContradictionException, TimeoutException {
        VecInt clause0 = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause0)).toString());
        Assert.assertTrue(((VecInt) (clause0)).isEmpty());
        IVecInt o_testSimplePhoneSATSmalllitNum70__4 = clause0.push(1);
        Assert.assertEquals("1", ((VecInt) (o_testSimplePhoneSATSmalllitNum70__4)).toString());
        Assert.assertEquals(1, ((int) (((VecInt) (o_testSimplePhoneSATSmalllitNum70__4)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testSimplePhoneSATSmalllitNum70__4)).isEmpty());
        IConstr o_testSimplePhoneSATSmalllitNum70__5 = this.solver.addClause(clause0);
        Assert.assertTrue(((UnitClause) (o_testSimplePhoneSATSmalllitNum70__5)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_testSimplePhoneSATSmalllitNum70__5)).getActivity())), 0.1);
        Assert.assertEquals("1", ((UnitClause) (o_testSimplePhoneSATSmalllitNum70__5)).toString());
        VecInt clause1 = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause1)).toString());
        Assert.assertTrue(((VecInt) (clause1)).isEmpty());
        IVecInt o_testSimplePhoneSATSmalllitNum70__9 = clause1.push(1);
        Assert.assertEquals("1", ((VecInt) (o_testSimplePhoneSATSmalllitNum70__9)).toString());
        Assert.assertEquals(1, ((int) (((VecInt) (o_testSimplePhoneSATSmalllitNum70__9)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testSimplePhoneSATSmalllitNum70__9)).isEmpty());
        IVecInt o_testSimplePhoneSATSmalllitNum70__10 = clause1.push((-2));
        Assert.assertEquals("1,-2", ((VecInt) (o_testSimplePhoneSATSmalllitNum70__10)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_testSimplePhoneSATSmalllitNum70__10)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testSimplePhoneSATSmalllitNum70__10)).isEmpty());
        this.solver.addClause(clause1);
        VecInt clause2 = new VecInt();
        clause2.push(2);
        clause2.push((-1));
        this.solver.addClause(clause2);
        VecInt clause3 = new VecInt();
        clause3.push(3);
        clause3.push((-2));
        this.solver.addClause(clause3);
        VecInt clause8 = new VecInt();
        clause8.push(2);
        clause8.push((-3));
        this.solver.addClause(clause8);
        VecInt clause4 = new VecInt();
        clause4.push((-4));
        clause4.push(1);
        this.solver.addClause(clause4);
        VecInt clause5 = new VecInt();
        clause5.push((-5));
        clause5.push(3);
        this.solver.addClause(clause5);
        VecInt clause6 = new VecInt();
        clause6.push((-6));
        clause6.push(4);
        this.solver.addClause(clause6);
        VecInt clause7 = new VecInt();
        clause7.push(5);
        clause7.push(6);
        clause7.push((-4));
        this.solver.addAtLeast(clause6, 1);
        this.solver.isSatisfiable();
        VecInt bound1 = new VecInt();
        bound1.push(3);
        this.solver.findModel(bound1);
        VecInt bound2 = new VecInt();
        bound2.push((-3));
        this.solver.findModel(bound2);
        VecInt bound3 = new VecInt();
        bound3.push(5);
        bound3.push(3);
        this.solver.findModel(bound3);
        VecInt bound4 = new VecInt();
        bound4.push(5);
        bound4.push((-3));
        this.solver.findModel(bound4);
        VecInt bound5 = new VecInt();
        bound5.push(4);
        bound5.push((-3));
        this.solver.findModel(bound5);
        VecInt bound6 = new VecInt();
        bound6.push(4);
        bound6.push(3);
        this.solver.findModel(bound6);
        VecInt bound7 = new VecInt();
        bound7.push(4);
        int[] model = this.solver.findModel(bound7);
        Set<Integer> satisfiedModel = new HashSet<Integer>();
        for (int i : model) {
            satisfiedModel.add(new Integer(i));
        }
        satisfiedModel.contains(new Integer(4));
        satisfiedModel.contains(new Integer(1));
        satisfiedModel.contains(new Integer(2));
    }

    @Test(timeout = 30000)
    public void testSimplePhoneSATSmalllitNum18() throws Exception, ContradictionException, TimeoutException {
        VecInt clause0 = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause0)).toString());
        Assert.assertTrue(((VecInt) (clause0)).isEmpty());
        IVecInt o_testSimplePhoneSATSmalllitNum18__4 = clause0.push(1);
        Assert.assertEquals("1", ((VecInt) (o_testSimplePhoneSATSmalllitNum18__4)).toString());
        Assert.assertEquals(1, ((int) (((VecInt) (o_testSimplePhoneSATSmalllitNum18__4)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testSimplePhoneSATSmalllitNum18__4)).isEmpty());
        IConstr o_testSimplePhoneSATSmalllitNum18__5 = this.solver.addClause(clause0);
        Assert.assertTrue(((UnitClause) (o_testSimplePhoneSATSmalllitNum18__5)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_testSimplePhoneSATSmalllitNum18__5)).getActivity())), 0.1);
        Assert.assertEquals("1", ((UnitClause) (o_testSimplePhoneSATSmalllitNum18__5)).toString());
        VecInt clause1 = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause1)).toString());
        Assert.assertTrue(((VecInt) (clause1)).isEmpty());
        IVecInt o_testSimplePhoneSATSmalllitNum18__9 = clause1.push(1);
        Assert.assertEquals("1", ((VecInt) (o_testSimplePhoneSATSmalllitNum18__9)).toString());
        Assert.assertEquals(1, ((int) (((VecInt) (o_testSimplePhoneSATSmalllitNum18__9)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testSimplePhoneSATSmalllitNum18__9)).isEmpty());
        IVecInt o_testSimplePhoneSATSmalllitNum18__10 = clause1.push((-2));
        Assert.assertEquals("1,-2", ((VecInt) (o_testSimplePhoneSATSmalllitNum18__10)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_testSimplePhoneSATSmalllitNum18__10)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testSimplePhoneSATSmalllitNum18__10)).isEmpty());
        this.solver.addClause(clause1);
        VecInt clause2 = new VecInt();
        clause2.push(1);
        clause2.push((-1));
        this.solver.addClause(clause2);
        VecInt clause3 = new VecInt();
        clause3.push(3);
        clause3.push((-2));
        this.solver.addClause(clause3);
        VecInt clause8 = new VecInt();
        clause8.push(2);
        clause8.push((-3));
        this.solver.addClause(clause8);
        VecInt clause4 = new VecInt();
        clause4.push((-4));
        clause4.push(1);
        this.solver.addClause(clause4);
        VecInt clause5 = new VecInt();
        clause5.push((-5));
        clause5.push(4);
        this.solver.addClause(clause5);
        VecInt clause6 = new VecInt();
        clause6.push((-6));
        clause6.push(4);
        this.solver.addClause(clause6);
        VecInt clause7 = new VecInt();
        clause7.push(5);
        clause7.push(6);
        clause7.push((-4));
        this.solver.addAtLeast(clause6, 1);
        this.solver.isSatisfiable();
        VecInt bound1 = new VecInt();
        bound1.push(3);
        this.solver.findModel(bound1);
        VecInt bound2 = new VecInt();
        bound2.push((-3));
        this.solver.findModel(bound2);
        VecInt bound3 = new VecInt();
        bound3.push(5);
        bound3.push(3);
        this.solver.findModel(bound3);
        VecInt bound4 = new VecInt();
        bound4.push(5);
        bound4.push((-3));
        this.solver.findModel(bound4);
        VecInt bound5 = new VecInt();
        bound5.push(4);
        bound5.push((-3));
        this.solver.findModel(bound5);
        VecInt bound6 = new VecInt();
        bound6.push(4);
        bound6.push(3);
        this.solver.findModel(bound6);
        VecInt bound7 = new VecInt();
        bound7.push(4);
        int[] model = this.solver.findModel(bound7);
        Set<Integer> satisfiedModel = new HashSet<Integer>();
        for (int i : model) {
            satisfiedModel.add(new Integer(i));
        }
        satisfiedModel.contains(new Integer(4));
        satisfiedModel.contains(new Integer(1));
        satisfiedModel.contains(new Integer(2));
    }

    @Test(timeout = 30000)
    public void testSimplePhoneSATSmalllitNum34() throws Exception, ContradictionException, TimeoutException {
        VecInt clause0 = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause0)).toString());
        Assert.assertTrue(((VecInt) (clause0)).isEmpty());
        IVecInt o_testSimplePhoneSATSmalllitNum34__4 = clause0.push(1);
        Assert.assertEquals("1", ((VecInt) (o_testSimplePhoneSATSmalllitNum34__4)).toString());
        Assert.assertEquals(1, ((int) (((VecInt) (o_testSimplePhoneSATSmalllitNum34__4)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testSimplePhoneSATSmalllitNum34__4)).isEmpty());
        IConstr o_testSimplePhoneSATSmalllitNum34__5 = this.solver.addClause(clause0);
        Assert.assertTrue(((UnitClause) (o_testSimplePhoneSATSmalllitNum34__5)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_testSimplePhoneSATSmalllitNum34__5)).getActivity())), 0.1);
        Assert.assertEquals("1", ((UnitClause) (o_testSimplePhoneSATSmalllitNum34__5)).toString());
        VecInt clause1 = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause1)).toString());
        Assert.assertTrue(((VecInt) (clause1)).isEmpty());
        IVecInt o_testSimplePhoneSATSmalllitNum34__9 = clause1.push(1);
        Assert.assertEquals("1", ((VecInt) (o_testSimplePhoneSATSmalllitNum34__9)).toString());
        Assert.assertEquals(1, ((int) (((VecInt) (o_testSimplePhoneSATSmalllitNum34__9)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testSimplePhoneSATSmalllitNum34__9)).isEmpty());
        IVecInt o_testSimplePhoneSATSmalllitNum34__10 = clause1.push((-2));
        Assert.assertEquals("1,-2", ((VecInt) (o_testSimplePhoneSATSmalllitNum34__10)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_testSimplePhoneSATSmalllitNum34__10)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testSimplePhoneSATSmalllitNum34__10)).isEmpty());
        this.solver.addClause(clause1);
        VecInt clause2 = new VecInt();
        clause2.push(2);
        clause2.push((-1));
        this.solver.addClause(clause2);
        VecInt clause3 = new VecInt();
        clause3.push(3);
        clause3.push((-3));
        this.solver.addClause(clause3);
        VecInt clause8 = new VecInt();
        clause8.push(2);
        clause8.push((-3));
        this.solver.addClause(clause8);
        VecInt clause4 = new VecInt();
        clause4.push((-4));
        clause4.push(1);
        this.solver.addClause(clause4);
        VecInt clause5 = new VecInt();
        clause5.push((-5));
        clause5.push(4);
        this.solver.addClause(clause5);
        VecInt clause6 = new VecInt();
        clause6.push((-6));
        clause6.push(4);
        this.solver.addClause(clause6);
        VecInt clause7 = new VecInt();
        clause7.push(5);
        clause7.push(6);
        clause7.push((-4));
        this.solver.addAtLeast(clause6, 1);
        this.solver.isSatisfiable();
        VecInt bound1 = new VecInt();
        bound1.push(3);
        this.solver.findModel(bound1);
        VecInt bound2 = new VecInt();
        bound2.push((-3));
        this.solver.findModel(bound2);
        VecInt bound3 = new VecInt();
        bound3.push(5);
        bound3.push(3);
        this.solver.findModel(bound3);
        VecInt bound4 = new VecInt();
        bound4.push(5);
        bound4.push((-3));
        this.solver.findModel(bound4);
        VecInt bound5 = new VecInt();
        bound5.push(4);
        bound5.push((-3));
        this.solver.findModel(bound5);
        VecInt bound6 = new VecInt();
        bound6.push(4);
        bound6.push(3);
        this.solver.findModel(bound6);
        VecInt bound7 = new VecInt();
        bound7.push(4);
        int[] model = this.solver.findModel(bound7);
        Set<Integer> satisfiedModel = new HashSet<Integer>();
        for (int i : model) {
            satisfiedModel.add(new Integer(i));
        }
        satisfiedModel.contains(new Integer(4));
        satisfiedModel.contains(new Integer(1));
        satisfiedModel.contains(new Integer(2));
    }

    @Test(timeout = 30000)
    public void testSimplePhoneSATSmalllitNum64() throws Exception, ContradictionException, TimeoutException {
        VecInt clause0 = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause0)).toString());
        Assert.assertTrue(((VecInt) (clause0)).isEmpty());
        IVecInt o_testSimplePhoneSATSmalllitNum64__4 = clause0.push(1);
        Assert.assertEquals("1", ((VecInt) (o_testSimplePhoneSATSmalllitNum64__4)).toString());
        Assert.assertEquals(1, ((int) (((VecInt) (o_testSimplePhoneSATSmalllitNum64__4)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testSimplePhoneSATSmalllitNum64__4)).isEmpty());
        IConstr o_testSimplePhoneSATSmalllitNum64__5 = this.solver.addClause(clause0);
        Assert.assertTrue(((UnitClause) (o_testSimplePhoneSATSmalllitNum64__5)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_testSimplePhoneSATSmalllitNum64__5)).getActivity())), 0.1);
        Assert.assertEquals("1", ((UnitClause) (o_testSimplePhoneSATSmalllitNum64__5)).toString());
        VecInt clause1 = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause1)).toString());
        Assert.assertTrue(((VecInt) (clause1)).isEmpty());
        IVecInt o_testSimplePhoneSATSmalllitNum64__9 = clause1.push(1);
        Assert.assertEquals("1", ((VecInt) (o_testSimplePhoneSATSmalllitNum64__9)).toString());
        Assert.assertEquals(1, ((int) (((VecInt) (o_testSimplePhoneSATSmalllitNum64__9)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testSimplePhoneSATSmalllitNum64__9)).isEmpty());
        IVecInt o_testSimplePhoneSATSmalllitNum64__10 = clause1.push((-2));
        Assert.assertEquals("1,-2", ((VecInt) (o_testSimplePhoneSATSmalllitNum64__10)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_testSimplePhoneSATSmalllitNum64__10)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testSimplePhoneSATSmalllitNum64__10)).isEmpty());
        this.solver.addClause(clause1);
        VecInt clause2 = new VecInt();
        clause2.push(2);
        clause2.push((-1));
        this.solver.addClause(clause2);
        VecInt clause3 = new VecInt();
        clause3.push(3);
        clause3.push((-2));
        this.solver.addClause(clause3);
        VecInt clause8 = new VecInt();
        clause8.push(2);
        clause8.push((-3));
        this.solver.addClause(clause8);
        VecInt clause4 = new VecInt();
        clause4.push((-4));
        clause4.push(1);
        this.solver.addClause(clause4);
        VecInt clause5 = new VecInt();
        clause5.push((-4));
        clause5.push(4);
        this.solver.addClause(clause5);
        VecInt clause6 = new VecInt();
        clause6.push((-6));
        clause6.push(4);
        this.solver.addClause(clause6);
        VecInt clause7 = new VecInt();
        clause7.push(5);
        clause7.push(6);
        clause7.push((-4));
        this.solver.addAtLeast(clause6, 1);
        this.solver.isSatisfiable();
        VecInt bound1 = new VecInt();
        bound1.push(3);
        this.solver.findModel(bound1);
        VecInt bound2 = new VecInt();
        bound2.push((-3));
        this.solver.findModel(bound2);
        VecInt bound3 = new VecInt();
        bound3.push(5);
        bound3.push(3);
        this.solver.findModel(bound3);
        VecInt bound4 = new VecInt();
        bound4.push(5);
        bound4.push((-3));
        this.solver.findModel(bound4);
        VecInt bound5 = new VecInt();
        bound5.push(4);
        bound5.push((-3));
        this.solver.findModel(bound5);
        VecInt bound6 = new VecInt();
        bound6.push(4);
        bound6.push(3);
        this.solver.findModel(bound6);
        VecInt bound7 = new VecInt();
        bound7.push(4);
        int[] model = this.solver.findModel(bound7);
        Set<Integer> satisfiedModel = new HashSet<Integer>();
        for (int i : model) {
            satisfiedModel.add(new Integer(i));
        }
        satisfiedModel.contains(new Integer(4));
        satisfiedModel.contains(new Integer(1));
        satisfiedModel.contains(new Integer(2));
    }

    @Test(timeout = 30000)
    public void testSimplePhoneSATSmalllitNum82() throws Exception, ContradictionException, TimeoutException {
        VecInt clause0 = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause0)).toString());
        Assert.assertTrue(((VecInt) (clause0)).isEmpty());
        IVecInt o_testSimplePhoneSATSmalllitNum82__4 = clause0.push(1);
        Assert.assertEquals("1", ((VecInt) (o_testSimplePhoneSATSmalllitNum82__4)).toString());
        Assert.assertEquals(1, ((int) (((VecInt) (o_testSimplePhoneSATSmalllitNum82__4)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testSimplePhoneSATSmalllitNum82__4)).isEmpty());
        IConstr o_testSimplePhoneSATSmalllitNum82__5 = this.solver.addClause(clause0);
        Assert.assertTrue(((UnitClause) (o_testSimplePhoneSATSmalllitNum82__5)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_testSimplePhoneSATSmalllitNum82__5)).getActivity())), 0.1);
        Assert.assertEquals("1", ((UnitClause) (o_testSimplePhoneSATSmalllitNum82__5)).toString());
        VecInt clause1 = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause1)).toString());
        Assert.assertTrue(((VecInt) (clause1)).isEmpty());
        IVecInt o_testSimplePhoneSATSmalllitNum82__9 = clause1.push(1);
        Assert.assertEquals("1", ((VecInt) (o_testSimplePhoneSATSmalllitNum82__9)).toString());
        Assert.assertEquals(1, ((int) (((VecInt) (o_testSimplePhoneSATSmalllitNum82__9)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testSimplePhoneSATSmalllitNum82__9)).isEmpty());
        IVecInt o_testSimplePhoneSATSmalllitNum82__10 = clause1.push((-2));
        Assert.assertEquals("1,-2", ((VecInt) (o_testSimplePhoneSATSmalllitNum82__10)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_testSimplePhoneSATSmalllitNum82__10)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testSimplePhoneSATSmalllitNum82__10)).isEmpty());
        this.solver.addClause(clause1);
        VecInt clause2 = new VecInt();
        clause2.push(2);
        clause2.push((-1));
        this.solver.addClause(clause2);
        VecInt clause3 = new VecInt();
        clause3.push(3);
        clause3.push((-2));
        this.solver.addClause(clause3);
        VecInt clause8 = new VecInt();
        clause8.push(2);
        clause8.push((-3));
        this.solver.addClause(clause8);
        VecInt clause4 = new VecInt();
        clause4.push((-4));
        clause4.push(1);
        this.solver.addClause(clause4);
        VecInt clause5 = new VecInt();
        clause5.push((-5));
        clause5.push(4);
        this.solver.addClause(clause5);
        VecInt clause6 = new VecInt();
        clause6.push((-6));
        clause6.push(3);
        this.solver.addClause(clause6);
        VecInt clause7 = new VecInt();
        clause7.push(5);
        clause7.push(6);
        clause7.push((-4));
        this.solver.addAtLeast(clause6, 1);
        this.solver.isSatisfiable();
        VecInt bound1 = new VecInt();
        bound1.push(3);
        this.solver.findModel(bound1);
        VecInt bound2 = new VecInt();
        bound2.push((-3));
        this.solver.findModel(bound2);
        VecInt bound3 = new VecInt();
        bound3.push(5);
        bound3.push(3);
        this.solver.findModel(bound3);
        VecInt bound4 = new VecInt();
        bound4.push(5);
        bound4.push((-3));
        this.solver.findModel(bound4);
        VecInt bound5 = new VecInt();
        bound5.push(4);
        bound5.push((-3));
        this.solver.findModel(bound5);
        VecInt bound6 = new VecInt();
        bound6.push(4);
        bound6.push(3);
        this.solver.findModel(bound6);
        VecInt bound7 = new VecInt();
        bound7.push(4);
        int[] model = this.solver.findModel(bound7);
        Set<Integer> satisfiedModel = new HashSet<Integer>();
        for (int i : model) {
            satisfiedModel.add(new Integer(i));
        }
        satisfiedModel.contains(new Integer(4));
        satisfiedModel.contains(new Integer(1));
        satisfiedModel.contains(new Integer(2));
    }

    @Test(timeout = 30000)
    public void testSimplePhoneSATSmalllitNum29() throws Exception, ContradictionException, TimeoutException {
        VecInt clause0 = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause0)).toString());
        Assert.assertTrue(((VecInt) (clause0)).isEmpty());
        IVecInt o_testSimplePhoneSATSmalllitNum29__4 = clause0.push(1);
        Assert.assertEquals("1", ((VecInt) (o_testSimplePhoneSATSmalllitNum29__4)).toString());
        Assert.assertEquals(1, ((int) (((VecInt) (o_testSimplePhoneSATSmalllitNum29__4)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testSimplePhoneSATSmalllitNum29__4)).isEmpty());
        IConstr o_testSimplePhoneSATSmalllitNum29__5 = this.solver.addClause(clause0);
        Assert.assertTrue(((UnitClause) (o_testSimplePhoneSATSmalllitNum29__5)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_testSimplePhoneSATSmalllitNum29__5)).getActivity())), 0.1);
        Assert.assertEquals("1", ((UnitClause) (o_testSimplePhoneSATSmalllitNum29__5)).toString());
        VecInt clause1 = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause1)).toString());
        Assert.assertTrue(((VecInt) (clause1)).isEmpty());
        IVecInt o_testSimplePhoneSATSmalllitNum29__9 = clause1.push(1);
        Assert.assertEquals("1", ((VecInt) (o_testSimplePhoneSATSmalllitNum29__9)).toString());
        Assert.assertEquals(1, ((int) (((VecInt) (o_testSimplePhoneSATSmalllitNum29__9)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testSimplePhoneSATSmalllitNum29__9)).isEmpty());
        IVecInt o_testSimplePhoneSATSmalllitNum29__10 = clause1.push((-2));
        Assert.assertEquals("1,-2", ((VecInt) (o_testSimplePhoneSATSmalllitNum29__10)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_testSimplePhoneSATSmalllitNum29__10)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testSimplePhoneSATSmalllitNum29__10)).isEmpty());
        this.solver.addClause(clause1);
        VecInt clause2 = new VecInt();
        clause2.push(2);
        clause2.push((-1));
        this.solver.addClause(clause2);
        VecInt clause3 = new VecInt();
        clause3.push(2);
        clause3.push((-2));
        this.solver.addClause(clause3);
        VecInt clause8 = new VecInt();
        clause8.push(2);
        clause8.push((-3));
        this.solver.addClause(clause8);
        VecInt clause4 = new VecInt();
        clause4.push((-4));
        clause4.push(1);
        this.solver.addClause(clause4);
        VecInt clause5 = new VecInt();
        clause5.push((-5));
        clause5.push(4);
        this.solver.addClause(clause5);
        VecInt clause6 = new VecInt();
        clause6.push((-6));
        clause6.push(4);
        this.solver.addClause(clause6);
        VecInt clause7 = new VecInt();
        clause7.push(5);
        clause7.push(6);
        clause7.push((-4));
        this.solver.addAtLeast(clause6, 1);
        this.solver.isSatisfiable();
        VecInt bound1 = new VecInt();
        bound1.push(3);
        this.solver.findModel(bound1);
        VecInt bound2 = new VecInt();
        bound2.push((-3));
        this.solver.findModel(bound2);
        VecInt bound3 = new VecInt();
        bound3.push(5);
        bound3.push(3);
        this.solver.findModel(bound3);
        VecInt bound4 = new VecInt();
        bound4.push(5);
        bound4.push((-3));
        this.solver.findModel(bound4);
        VecInt bound5 = new VecInt();
        bound5.push(4);
        bound5.push((-3));
        this.solver.findModel(bound5);
        VecInt bound6 = new VecInt();
        bound6.push(4);
        bound6.push(3);
        this.solver.findModel(bound6);
        VecInt bound7 = new VecInt();
        bound7.push(4);
        int[] model = this.solver.findModel(bound7);
        Set<Integer> satisfiedModel = new HashSet<Integer>();
        for (int i : model) {
            satisfiedModel.add(new Integer(i));
        }
        satisfiedModel.contains(new Integer(4));
        satisfiedModel.contains(new Integer(1));
        satisfiedModel.contains(new Integer(2));
    }

    @Test(timeout = 30000)
    public void testSimplePhoneSATSmalllitNum28() throws Exception, ContradictionException, TimeoutException {
        VecInt clause0 = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause0)).toString());
        Assert.assertTrue(((VecInt) (clause0)).isEmpty());
        IVecInt o_testSimplePhoneSATSmalllitNum28__4 = clause0.push(1);
        Assert.assertEquals("1", ((VecInt) (o_testSimplePhoneSATSmalllitNum28__4)).toString());
        Assert.assertEquals(1, ((int) (((VecInt) (o_testSimplePhoneSATSmalllitNum28__4)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testSimplePhoneSATSmalllitNum28__4)).isEmpty());
        IConstr o_testSimplePhoneSATSmalllitNum28__5 = this.solver.addClause(clause0);
        Assert.assertTrue(((UnitClause) (o_testSimplePhoneSATSmalllitNum28__5)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_testSimplePhoneSATSmalllitNum28__5)).getActivity())), 0.1);
        Assert.assertEquals("1", ((UnitClause) (o_testSimplePhoneSATSmalllitNum28__5)).toString());
        VecInt clause1 = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause1)).toString());
        Assert.assertTrue(((VecInt) (clause1)).isEmpty());
        IVecInt o_testSimplePhoneSATSmalllitNum28__9 = clause1.push(1);
        Assert.assertEquals("1", ((VecInt) (o_testSimplePhoneSATSmalllitNum28__9)).toString());
        Assert.assertEquals(1, ((int) (((VecInt) (o_testSimplePhoneSATSmalllitNum28__9)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testSimplePhoneSATSmalllitNum28__9)).isEmpty());
        IVecInt o_testSimplePhoneSATSmalllitNum28__10 = clause1.push((-2));
        Assert.assertEquals("1,-2", ((VecInt) (o_testSimplePhoneSATSmalllitNum28__10)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_testSimplePhoneSATSmalllitNum28__10)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testSimplePhoneSATSmalllitNum28__10)).isEmpty());
        this.solver.addClause(clause1);
        VecInt clause2 = new VecInt();
        clause2.push(2);
        clause2.push((-1));
        this.solver.addClause(clause2);
        VecInt clause3 = new VecInt();
        clause3.push(4);
        clause3.push((-2));
        this.solver.addClause(clause3);
        VecInt clause8 = new VecInt();
        clause8.push(2);
        clause8.push((-3));
        this.solver.addClause(clause8);
        VecInt clause4 = new VecInt();
        clause4.push((-4));
        clause4.push(1);
        this.solver.addClause(clause4);
        VecInt clause5 = new VecInt();
        clause5.push((-5));
        clause5.push(4);
        this.solver.addClause(clause5);
        VecInt clause6 = new VecInt();
        clause6.push((-6));
        clause6.push(4);
        this.solver.addClause(clause6);
        VecInt clause7 = new VecInt();
        clause7.push(5);
        clause7.push(6);
        clause7.push((-4));
        this.solver.addAtLeast(clause6, 1);
        this.solver.isSatisfiable();
        VecInt bound1 = new VecInt();
        bound1.push(3);
        this.solver.findModel(bound1);
        VecInt bound2 = new VecInt();
        bound2.push((-3));
        this.solver.findModel(bound2);
        VecInt bound3 = new VecInt();
        bound3.push(5);
        bound3.push(3);
        this.solver.findModel(bound3);
        VecInt bound4 = new VecInt();
        bound4.push(5);
        bound4.push((-3));
        this.solver.findModel(bound4);
        VecInt bound5 = new VecInt();
        bound5.push(4);
        bound5.push((-3));
        this.solver.findModel(bound5);
        VecInt bound6 = new VecInt();
        bound6.push(4);
        bound6.push(3);
        this.solver.findModel(bound6);
        VecInt bound7 = new VecInt();
        bound7.push(4);
        int[] model = this.solver.findModel(bound7);
        Set<Integer> satisfiedModel = new HashSet<Integer>();
        for (int i : model) {
            satisfiedModel.add(new Integer(i));
        }
        satisfiedModel.contains(new Integer(4));
        satisfiedModel.contains(new Integer(1));
        satisfiedModel.contains(new Integer(2));
    }

    @Test(timeout = 30000)
    public void testSimplePhoneSATSmalllitNum120() throws Exception, ContradictionException, TimeoutException {
        VecInt clause0 = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause0)).toString());
        Assert.assertTrue(((VecInt) (clause0)).isEmpty());
        IVecInt o_testSimplePhoneSATSmalllitNum120__4 = clause0.push(1);
        Assert.assertEquals("1", ((VecInt) (o_testSimplePhoneSATSmalllitNum120__4)).toString());
        Assert.assertEquals(1, ((int) (((VecInt) (o_testSimplePhoneSATSmalllitNum120__4)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testSimplePhoneSATSmalllitNum120__4)).isEmpty());
        IConstr o_testSimplePhoneSATSmalllitNum120__5 = this.solver.addClause(clause0);
        Assert.assertTrue(((UnitClause) (o_testSimplePhoneSATSmalllitNum120__5)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_testSimplePhoneSATSmalllitNum120__5)).getActivity())), 0.1);
        Assert.assertEquals("1", ((UnitClause) (o_testSimplePhoneSATSmalllitNum120__5)).toString());
        VecInt clause1 = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause1)).toString());
        Assert.assertTrue(((VecInt) (clause1)).isEmpty());
        IVecInt o_testSimplePhoneSATSmalllitNum120__9 = clause1.push(1);
        Assert.assertEquals("1", ((VecInt) (o_testSimplePhoneSATSmalllitNum120__9)).toString());
        Assert.assertEquals(1, ((int) (((VecInt) (o_testSimplePhoneSATSmalllitNum120__9)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testSimplePhoneSATSmalllitNum120__9)).isEmpty());
        IVecInt o_testSimplePhoneSATSmalllitNum120__10 = clause1.push((-2));
        Assert.assertEquals("1,-2", ((VecInt) (o_testSimplePhoneSATSmalllitNum120__10)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_testSimplePhoneSATSmalllitNum120__10)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testSimplePhoneSATSmalllitNum120__10)).isEmpty());
        this.solver.addClause(clause1);
        VecInt clause2 = new VecInt();
        clause2.push(2);
        clause2.push((-1));
        this.solver.addClause(clause2);
        VecInt clause3 = new VecInt();
        clause3.push(3);
        clause3.push((-2));
        this.solver.addClause(clause3);
        VecInt clause8 = new VecInt();
        clause8.push(2);
        clause8.push((-3));
        this.solver.addClause(clause8);
        VecInt clause4 = new VecInt();
        clause4.push((-4));
        clause4.push(1);
        this.solver.addClause(clause4);
        VecInt clause5 = new VecInt();
        clause5.push((-5));
        clause5.push(4);
        this.solver.addClause(clause5);
        VecInt clause6 = new VecInt();
        clause6.push((-6));
        clause6.push(4);
        this.solver.addClause(clause6);
        VecInt clause7 = new VecInt();
        clause7.push(5);
        clause7.push(6);
        clause7.push((-4));
        this.solver.addAtLeast(clause6, 1);
        this.solver.isSatisfiable();
        VecInt bound1 = new VecInt();
        bound1.push(3);
        this.solver.findModel(bound1);
        VecInt bound2 = new VecInt();
        bound2.push((-0));
        this.solver.findModel(bound2);
        VecInt bound3 = new VecInt();
        bound3.push(5);
        bound3.push(3);
        this.solver.findModel(bound3);
        VecInt bound4 = new VecInt();
        bound4.push(5);
        bound4.push((-3));
        this.solver.findModel(bound4);
        VecInt bound5 = new VecInt();
        bound5.push(4);
        bound5.push((-3));
        this.solver.findModel(bound5);
        VecInt bound6 = new VecInt();
        bound6.push(4);
        bound6.push(3);
        this.solver.findModel(bound6);
        VecInt bound7 = new VecInt();
        bound7.push(4);
        int[] model = this.solver.findModel(bound7);
        Set<Integer> satisfiedModel = new HashSet<Integer>();
        for (int i : model) {
            satisfiedModel.add(new Integer(i));
        }
        satisfiedModel.contains(new Integer(4));
        satisfiedModel.contains(new Integer(1));
        satisfiedModel.contains(new Integer(2));
    }

    @Test(timeout = 30000)
    public void testSimplePhoneSATSmalllitNum150() throws Exception, ContradictionException, TimeoutException {
        VecInt clause0 = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause0)).toString());
        Assert.assertTrue(((VecInt) (clause0)).isEmpty());
        IVecInt o_testSimplePhoneSATSmalllitNum150__4 = clause0.push(1);
        Assert.assertEquals("1", ((VecInt) (o_testSimplePhoneSATSmalllitNum150__4)).toString());
        Assert.assertEquals(1, ((int) (((VecInt) (o_testSimplePhoneSATSmalllitNum150__4)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testSimplePhoneSATSmalllitNum150__4)).isEmpty());
        IConstr o_testSimplePhoneSATSmalllitNum150__5 = this.solver.addClause(clause0);
        Assert.assertTrue(((UnitClause) (o_testSimplePhoneSATSmalllitNum150__5)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_testSimplePhoneSATSmalllitNum150__5)).getActivity())), 0.1);
        Assert.assertEquals("1", ((UnitClause) (o_testSimplePhoneSATSmalllitNum150__5)).toString());
        VecInt clause1 = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause1)).toString());
        Assert.assertTrue(((VecInt) (clause1)).isEmpty());
        IVecInt o_testSimplePhoneSATSmalllitNum150__9 = clause1.push(1);
        Assert.assertEquals("1", ((VecInt) (o_testSimplePhoneSATSmalllitNum150__9)).toString());
        Assert.assertEquals(1, ((int) (((VecInt) (o_testSimplePhoneSATSmalllitNum150__9)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testSimplePhoneSATSmalllitNum150__9)).isEmpty());
        IVecInt o_testSimplePhoneSATSmalllitNum150__10 = clause1.push((-2));
        Assert.assertEquals("1,-2", ((VecInt) (o_testSimplePhoneSATSmalllitNum150__10)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_testSimplePhoneSATSmalllitNum150__10)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testSimplePhoneSATSmalllitNum150__10)).isEmpty());
        this.solver.addClause(clause1);
        VecInt clause2 = new VecInt();
        clause2.push(2);
        clause2.push((-1));
        this.solver.addClause(clause2);
        VecInt clause3 = new VecInt();
        clause3.push(3);
        clause3.push((-2));
        this.solver.addClause(clause3);
        VecInt clause8 = new VecInt();
        clause8.push(2);
        clause8.push((-3));
        this.solver.addClause(clause8);
        VecInt clause4 = new VecInt();
        clause4.push((-4));
        clause4.push(1);
        this.solver.addClause(clause4);
        VecInt clause5 = new VecInt();
        clause5.push((-5));
        clause5.push(4);
        this.solver.addClause(clause5);
        VecInt clause6 = new VecInt();
        clause6.push((-6));
        clause6.push(4);
        this.solver.addClause(clause6);
        VecInt clause7 = new VecInt();
        clause7.push(5);
        clause7.push(6);
        clause7.push((-4));
        this.solver.addAtLeast(clause6, 1);
        this.solver.isSatisfiable();
        VecInt bound1 = new VecInt();
        bound1.push(3);
        this.solver.findModel(bound1);
        VecInt bound2 = new VecInt();
        bound2.push((-3));
        this.solver.findModel(bound2);
        VecInt bound3 = new VecInt();
        bound3.push(5);
        bound3.push(3);
        this.solver.findModel(bound3);
        VecInt bound4 = new VecInt();
        bound4.push(5);
        bound4.push((-3));
        this.solver.findModel(bound4);
        VecInt bound5 = new VecInt();
        bound5.push(0);
        bound5.push((-3));
        this.solver.findModel(bound5);
        VecInt bound6 = new VecInt();
        bound6.push(4);
        bound6.push(3);
        this.solver.findModel(bound6);
        VecInt bound7 = new VecInt();
        bound7.push(4);
        int[] model = this.solver.findModel(bound7);
        Set<Integer> satisfiedModel = new HashSet<Integer>();
        for (int i : model) {
            satisfiedModel.add(new Integer(i));
        }
        satisfiedModel.contains(new Integer(4));
        satisfiedModel.contains(new Integer(1));
        satisfiedModel.contains(new Integer(2));
    }

    @Test(timeout = 30000)
    public void testSimplePhoneSATSmalllitNum126() throws Exception, ContradictionException, TimeoutException {
        VecInt clause0 = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause0)).toString());
        Assert.assertTrue(((VecInt) (clause0)).isEmpty());
        IVecInt o_testSimplePhoneSATSmalllitNum126__4 = clause0.push(1);
        Assert.assertEquals("1", ((VecInt) (o_testSimplePhoneSATSmalllitNum126__4)).toString());
        Assert.assertEquals(1, ((int) (((VecInt) (o_testSimplePhoneSATSmalllitNum126__4)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testSimplePhoneSATSmalllitNum126__4)).isEmpty());
        IConstr o_testSimplePhoneSATSmalllitNum126__5 = this.solver.addClause(clause0);
        Assert.assertTrue(((UnitClause) (o_testSimplePhoneSATSmalllitNum126__5)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_testSimplePhoneSATSmalllitNum126__5)).getActivity())), 0.1);
        Assert.assertEquals("1", ((UnitClause) (o_testSimplePhoneSATSmalllitNum126__5)).toString());
        VecInt clause1 = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause1)).toString());
        Assert.assertTrue(((VecInt) (clause1)).isEmpty());
        IVecInt o_testSimplePhoneSATSmalllitNum126__9 = clause1.push(1);
        Assert.assertEquals("1", ((VecInt) (o_testSimplePhoneSATSmalllitNum126__9)).toString());
        Assert.assertEquals(1, ((int) (((VecInt) (o_testSimplePhoneSATSmalllitNum126__9)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testSimplePhoneSATSmalllitNum126__9)).isEmpty());
        IVecInt o_testSimplePhoneSATSmalllitNum126__10 = clause1.push((-2));
        Assert.assertEquals("1,-2", ((VecInt) (o_testSimplePhoneSATSmalllitNum126__10)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_testSimplePhoneSATSmalllitNum126__10)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testSimplePhoneSATSmalllitNum126__10)).isEmpty());
        this.solver.addClause(clause1);
        VecInt clause2 = new VecInt();
        clause2.push(2);
        clause2.push((-1));
        this.solver.addClause(clause2);
        VecInt clause3 = new VecInt();
        clause3.push(3);
        clause3.push((-2));
        this.solver.addClause(clause3);
        VecInt clause8 = new VecInt();
        clause8.push(2);
        clause8.push((-3));
        this.solver.addClause(clause8);
        VecInt clause4 = new VecInt();
        clause4.push((-4));
        clause4.push(1);
        this.solver.addClause(clause4);
        VecInt clause5 = new VecInt();
        clause5.push((-5));
        clause5.push(4);
        this.solver.addClause(clause5);
        VecInt clause6 = new VecInt();
        clause6.push((-6));
        clause6.push(4);
        this.solver.addClause(clause6);
        VecInt clause7 = new VecInt();
        clause7.push(5);
        clause7.push(6);
        clause7.push((-4));
        this.solver.addAtLeast(clause6, 1);
        this.solver.isSatisfiable();
        VecInt bound1 = new VecInt();
        bound1.push(3);
        this.solver.findModel(bound1);
        VecInt bound2 = new VecInt();
        bound2.push((-3));
        this.solver.findModel(bound2);
        VecInt bound3 = new VecInt();
        bound3.push(0);
        bound3.push(3);
        this.solver.findModel(bound3);
        VecInt bound4 = new VecInt();
        bound4.push(5);
        bound4.push((-3));
        this.solver.findModel(bound4);
        VecInt bound5 = new VecInt();
        bound5.push(4);
        bound5.push((-3));
        this.solver.findModel(bound5);
        VecInt bound6 = new VecInt();
        bound6.push(4);
        bound6.push(3);
        this.solver.findModel(bound6);
        VecInt bound7 = new VecInt();
        bound7.push(4);
        int[] model = this.solver.findModel(bound7);
        Set<Integer> satisfiedModel = new HashSet<Integer>();
        for (int i : model) {
            satisfiedModel.add(new Integer(i));
        }
        satisfiedModel.contains(new Integer(4));
        satisfiedModel.contains(new Integer(1));
        satisfiedModel.contains(new Integer(2));
    }

    @Test(timeout = 30000)
    public void testSimplePhoneSATSmalllitNum123() throws Exception, ContradictionException, TimeoutException {
        VecInt clause0 = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause0)).toString());
        Assert.assertTrue(((VecInt) (clause0)).isEmpty());
        IVecInt o_testSimplePhoneSATSmalllitNum123__4 = clause0.push(1);
        Assert.assertEquals("1", ((VecInt) (o_testSimplePhoneSATSmalllitNum123__4)).toString());
        Assert.assertEquals(1, ((int) (((VecInt) (o_testSimplePhoneSATSmalllitNum123__4)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testSimplePhoneSATSmalllitNum123__4)).isEmpty());
        IConstr o_testSimplePhoneSATSmalllitNum123__5 = this.solver.addClause(clause0);
        Assert.assertTrue(((UnitClause) (o_testSimplePhoneSATSmalllitNum123__5)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_testSimplePhoneSATSmalllitNum123__5)).getActivity())), 0.1);
        Assert.assertEquals("1", ((UnitClause) (o_testSimplePhoneSATSmalllitNum123__5)).toString());
        VecInt clause1 = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause1)).toString());
        Assert.assertTrue(((VecInt) (clause1)).isEmpty());
        IVecInt o_testSimplePhoneSATSmalllitNum123__9 = clause1.push(1);
        Assert.assertEquals("1", ((VecInt) (o_testSimplePhoneSATSmalllitNum123__9)).toString());
        Assert.assertEquals(1, ((int) (((VecInt) (o_testSimplePhoneSATSmalllitNum123__9)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testSimplePhoneSATSmalllitNum123__9)).isEmpty());
        IVecInt o_testSimplePhoneSATSmalllitNum123__10 = clause1.push((-2));
        Assert.assertEquals("1,-2", ((VecInt) (o_testSimplePhoneSATSmalllitNum123__10)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_testSimplePhoneSATSmalllitNum123__10)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testSimplePhoneSATSmalllitNum123__10)).isEmpty());
        this.solver.addClause(clause1);
        VecInt clause2 = new VecInt();
        clause2.push(2);
        clause2.push((-1));
        this.solver.addClause(clause2);
        VecInt clause3 = new VecInt();
        clause3.push(3);
        clause3.push((-2));
        this.solver.addClause(clause3);
        VecInt clause8 = new VecInt();
        clause8.push(2);
        clause8.push((-3));
        this.solver.addClause(clause8);
        VecInt clause4 = new VecInt();
        clause4.push((-4));
        clause4.push(1);
        this.solver.addClause(clause4);
        VecInt clause5 = new VecInt();
        clause5.push((-5));
        clause5.push(4);
        this.solver.addClause(clause5);
        VecInt clause6 = new VecInt();
        clause6.push((-6));
        clause6.push(4);
        this.solver.addClause(clause6);
        VecInt clause7 = new VecInt();
        clause7.push(5);
        clause7.push(6);
        clause7.push((-4));
        this.solver.addAtLeast(clause6, 1);
        this.solver.isSatisfiable();
        VecInt bound1 = new VecInt();
        bound1.push(3);
        this.solver.findModel(bound1);
        VecInt bound2 = new VecInt();
        bound2.push((-3));
        this.solver.findModel(bound2);
        VecInt bound3 = new VecInt();
        bound3.push(4);
        bound3.push(3);
        this.solver.findModel(bound3);
        VecInt bound4 = new VecInt();
        bound4.push(5);
        bound4.push((-3));
        this.solver.findModel(bound4);
        VecInt bound5 = new VecInt();
        bound5.push(4);
        bound5.push((-3));
        this.solver.findModel(bound5);
        VecInt bound6 = new VecInt();
        bound6.push(4);
        bound6.push(3);
        this.solver.findModel(bound6);
        VecInt bound7 = new VecInt();
        bound7.push(4);
        int[] model = this.solver.findModel(bound7);
        Set<Integer> satisfiedModel = new HashSet<Integer>();
        for (int i : model) {
            satisfiedModel.add(new Integer(i));
        }
        satisfiedModel.contains(new Integer(4));
        satisfiedModel.contains(new Integer(1));
        satisfiedModel.contains(new Integer(2));
    }

    @Test(timeout = 30000)
    public void testSimplePhoneSATSmalllitNum106() throws Exception, ContradictionException, TimeoutException {
        VecInt clause0 = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause0)).toString());
        Assert.assertTrue(((VecInt) (clause0)).isEmpty());
        IVecInt o_testSimplePhoneSATSmalllitNum106__4 = clause0.push(1);
        Assert.assertEquals("1", ((VecInt) (o_testSimplePhoneSATSmalllitNum106__4)).toString());
        Assert.assertEquals(1, ((int) (((VecInt) (o_testSimplePhoneSATSmalllitNum106__4)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testSimplePhoneSATSmalllitNum106__4)).isEmpty());
        IConstr o_testSimplePhoneSATSmalllitNum106__5 = this.solver.addClause(clause0);
        Assert.assertTrue(((UnitClause) (o_testSimplePhoneSATSmalllitNum106__5)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_testSimplePhoneSATSmalllitNum106__5)).getActivity())), 0.1);
        Assert.assertEquals("1", ((UnitClause) (o_testSimplePhoneSATSmalllitNum106__5)).toString());
        VecInt clause1 = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause1)).toString());
        Assert.assertTrue(((VecInt) (clause1)).isEmpty());
        IVecInt o_testSimplePhoneSATSmalllitNum106__9 = clause1.push(1);
        Assert.assertEquals("1", ((VecInt) (o_testSimplePhoneSATSmalllitNum106__9)).toString());
        Assert.assertEquals(1, ((int) (((VecInt) (o_testSimplePhoneSATSmalllitNum106__9)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testSimplePhoneSATSmalllitNum106__9)).isEmpty());
        IVecInt o_testSimplePhoneSATSmalllitNum106__10 = clause1.push((-2));
        Assert.assertEquals("1,-2", ((VecInt) (o_testSimplePhoneSATSmalllitNum106__10)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_testSimplePhoneSATSmalllitNum106__10)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testSimplePhoneSATSmalllitNum106__10)).isEmpty());
        this.solver.addClause(clause1);
        VecInt clause2 = new VecInt();
        clause2.push(2);
        clause2.push((-1));
        this.solver.addClause(clause2);
        VecInt clause3 = new VecInt();
        clause3.push(3);
        clause3.push((-2));
        this.solver.addClause(clause3);
        VecInt clause8 = new VecInt();
        clause8.push(2);
        clause8.push((-3));
        this.solver.addClause(clause8);
        VecInt clause4 = new VecInt();
        clause4.push((-4));
        clause4.push(1);
        this.solver.addClause(clause4);
        VecInt clause5 = new VecInt();
        clause5.push((-5));
        clause5.push(4);
        this.solver.addClause(clause5);
        VecInt clause6 = new VecInt();
        clause6.push((-6));
        clause6.push(4);
        this.solver.addClause(clause6);
        VecInt clause7 = new VecInt();
        clause7.push(5);
        clause7.push(6);
        clause7.push((-4));
        this.solver.addAtLeast(clause6, 0);
        this.solver.isSatisfiable();
        VecInt bound1 = new VecInt();
        bound1.push(3);
        this.solver.findModel(bound1);
        VecInt bound2 = new VecInt();
        bound2.push((-3));
        this.solver.findModel(bound2);
        VecInt bound3 = new VecInt();
        bound3.push(5);
        bound3.push(3);
        this.solver.findModel(bound3);
        VecInt bound4 = new VecInt();
        bound4.push(5);
        bound4.push((-3));
        this.solver.findModel(bound4);
        VecInt bound5 = new VecInt();
        bound5.push(4);
        bound5.push((-3));
        this.solver.findModel(bound5);
        VecInt bound6 = new VecInt();
        bound6.push(4);
        bound6.push(3);
        this.solver.findModel(bound6);
        VecInt bound7 = new VecInt();
        bound7.push(4);
        int[] model = this.solver.findModel(bound7);
        Set<Integer> satisfiedModel = new HashSet<Integer>();
        for (int i : model) {
            satisfiedModel.add(new Integer(i));
        }
        satisfiedModel.contains(new Integer(4));
        satisfiedModel.contains(new Integer(1));
        satisfiedModel.contains(new Integer(2));
    }

    @Test(timeout = 30000)
    public void testSimplePhoneSATSmalllitNum144() throws Exception, ContradictionException, TimeoutException {
        VecInt clause0 = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause0)).toString());
        Assert.assertTrue(((VecInt) (clause0)).isEmpty());
        IVecInt o_testSimplePhoneSATSmalllitNum144__4 = clause0.push(1);
        Assert.assertEquals("1", ((VecInt) (o_testSimplePhoneSATSmalllitNum144__4)).toString());
        Assert.assertEquals(1, ((int) (((VecInt) (o_testSimplePhoneSATSmalllitNum144__4)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testSimplePhoneSATSmalllitNum144__4)).isEmpty());
        IConstr o_testSimplePhoneSATSmalllitNum144__5 = this.solver.addClause(clause0);
        Assert.assertTrue(((UnitClause) (o_testSimplePhoneSATSmalllitNum144__5)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_testSimplePhoneSATSmalllitNum144__5)).getActivity())), 0.1);
        Assert.assertEquals("1", ((UnitClause) (o_testSimplePhoneSATSmalllitNum144__5)).toString());
        VecInt clause1 = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause1)).toString());
        Assert.assertTrue(((VecInt) (clause1)).isEmpty());
        IVecInt o_testSimplePhoneSATSmalllitNum144__9 = clause1.push(1);
        Assert.assertEquals("1", ((VecInt) (o_testSimplePhoneSATSmalllitNum144__9)).toString());
        Assert.assertEquals(1, ((int) (((VecInt) (o_testSimplePhoneSATSmalllitNum144__9)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testSimplePhoneSATSmalllitNum144__9)).isEmpty());
        IVecInt o_testSimplePhoneSATSmalllitNum144__10 = clause1.push((-2));
        Assert.assertEquals("1,-2", ((VecInt) (o_testSimplePhoneSATSmalllitNum144__10)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_testSimplePhoneSATSmalllitNum144__10)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testSimplePhoneSATSmalllitNum144__10)).isEmpty());
        this.solver.addClause(clause1);
        VecInt clause2 = new VecInt();
        clause2.push(2);
        clause2.push((-1));
        this.solver.addClause(clause2);
        VecInt clause3 = new VecInt();
        clause3.push(3);
        clause3.push((-2));
        this.solver.addClause(clause3);
        VecInt clause8 = new VecInt();
        clause8.push(2);
        clause8.push((-3));
        this.solver.addClause(clause8);
        VecInt clause4 = new VecInt();
        clause4.push((-4));
        clause4.push(1);
        this.solver.addClause(clause4);
        VecInt clause5 = new VecInt();
        clause5.push((-5));
        clause5.push(4);
        this.solver.addClause(clause5);
        VecInt clause6 = new VecInt();
        clause6.push((-6));
        clause6.push(4);
        this.solver.addClause(clause6);
        VecInt clause7 = new VecInt();
        clause7.push(5);
        clause7.push(6);
        clause7.push((-4));
        this.solver.addAtLeast(clause6, 1);
        this.solver.isSatisfiable();
        VecInt bound1 = new VecInt();
        bound1.push(3);
        this.solver.findModel(bound1);
        VecInt bound2 = new VecInt();
        bound2.push((-3));
        this.solver.findModel(bound2);
        VecInt bound3 = new VecInt();
        bound3.push(5);
        bound3.push(3);
        this.solver.findModel(bound3);
        VecInt bound4 = new VecInt();
        bound4.push(5);
        bound4.push((-0));
        this.solver.findModel(bound4);
        VecInt bound5 = new VecInt();
        bound5.push(4);
        bound5.push((-3));
        this.solver.findModel(bound5);
        VecInt bound6 = new VecInt();
        bound6.push(4);
        bound6.push(3);
        this.solver.findModel(bound6);
        VecInt bound7 = new VecInt();
        bound7.push(4);
        int[] model = this.solver.findModel(bound7);
        Set<Integer> satisfiedModel = new HashSet<Integer>();
        for (int i : model) {
            satisfiedModel.add(new Integer(i));
        }
        satisfiedModel.contains(new Integer(4));
        satisfiedModel.contains(new Integer(1));
        satisfiedModel.contains(new Integer(2));
    }

    @Test(timeout = 30000)
    public void testSimplePhoneSATSmalllitNum105() throws Exception, ContradictionException, TimeoutException {
        VecInt clause0 = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause0)).toString());
        Assert.assertTrue(((VecInt) (clause0)).isEmpty());
        IVecInt o_testSimplePhoneSATSmalllitNum105__4 = clause0.push(1);
        Assert.assertEquals("1", ((VecInt) (o_testSimplePhoneSATSmalllitNum105__4)).toString());
        Assert.assertEquals(1, ((int) (((VecInt) (o_testSimplePhoneSATSmalllitNum105__4)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testSimplePhoneSATSmalllitNum105__4)).isEmpty());
        IConstr o_testSimplePhoneSATSmalllitNum105__5 = this.solver.addClause(clause0);
        Assert.assertTrue(((UnitClause) (o_testSimplePhoneSATSmalllitNum105__5)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_testSimplePhoneSATSmalllitNum105__5)).getActivity())), 0.1);
        Assert.assertEquals("1", ((UnitClause) (o_testSimplePhoneSATSmalllitNum105__5)).toString());
        VecInt clause1 = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause1)).toString());
        Assert.assertTrue(((VecInt) (clause1)).isEmpty());
        IVecInt o_testSimplePhoneSATSmalllitNum105__9 = clause1.push(1);
        Assert.assertEquals("1", ((VecInt) (o_testSimplePhoneSATSmalllitNum105__9)).toString());
        Assert.assertEquals(1, ((int) (((VecInt) (o_testSimplePhoneSATSmalllitNum105__9)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testSimplePhoneSATSmalllitNum105__9)).isEmpty());
        IVecInt o_testSimplePhoneSATSmalllitNum105__10 = clause1.push((-2));
        Assert.assertEquals("1,-2", ((VecInt) (o_testSimplePhoneSATSmalllitNum105__10)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_testSimplePhoneSATSmalllitNum105__10)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testSimplePhoneSATSmalllitNum105__10)).isEmpty());
        this.solver.addClause(clause1);
        VecInt clause2 = new VecInt();
        clause2.push(2);
        clause2.push((-1));
        this.solver.addClause(clause2);
        VecInt clause3 = new VecInt();
        clause3.push(3);
        clause3.push((-2));
        this.solver.addClause(clause3);
        VecInt clause8 = new VecInt();
        clause8.push(2);
        clause8.push((-3));
        this.solver.addClause(clause8);
        VecInt clause4 = new VecInt();
        clause4.push((-4));
        clause4.push(1);
        this.solver.addClause(clause4);
        VecInt clause5 = new VecInt();
        clause5.push((-5));
        clause5.push(4);
        this.solver.addClause(clause5);
        VecInt clause6 = new VecInt();
        clause6.push((-6));
        clause6.push(4);
        this.solver.addClause(clause6);
        VecInt clause7 = new VecInt();
        clause7.push(5);
        clause7.push(6);
        clause7.push((-4));
        this.solver.addAtLeast(clause6, 2);
        this.solver.isSatisfiable();
        VecInt bound1 = new VecInt();
        bound1.push(3);
        this.solver.findModel(bound1);
        VecInt bound2 = new VecInt();
        bound2.push((-3));
        this.solver.findModel(bound2);
        VecInt bound3 = new VecInt();
        bound3.push(5);
        bound3.push(3);
        this.solver.findModel(bound3);
        VecInt bound4 = new VecInt();
        bound4.push(5);
        bound4.push((-3));
        this.solver.findModel(bound4);
        VecInt bound5 = new VecInt();
        bound5.push(4);
        bound5.push((-3));
        this.solver.findModel(bound5);
        VecInt bound6 = new VecInt();
        bound6.push(4);
        bound6.push(3);
        this.solver.findModel(bound6);
        VecInt bound7 = new VecInt();
        bound7.push(4);
        int[] model = this.solver.findModel(bound7);
        Set<Integer> satisfiedModel = new HashSet<Integer>();
        for (int i : model) {
            satisfiedModel.add(new Integer(i));
        }
        satisfiedModel.contains(new Integer(4));
        satisfiedModel.contains(new Integer(1));
        satisfiedModel.contains(new Integer(2));
    }

    @Test(timeout = 30000)
    public void testSimplePhoneSATSmalllitNum135() throws Exception, ContradictionException, TimeoutException {
        VecInt clause0 = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause0)).toString());
        Assert.assertTrue(((VecInt) (clause0)).isEmpty());
        IVecInt o_testSimplePhoneSATSmalllitNum135__4 = clause0.push(1);
        Assert.assertEquals("1", ((VecInt) (o_testSimplePhoneSATSmalllitNum135__4)).toString());
        Assert.assertEquals(1, ((int) (((VecInt) (o_testSimplePhoneSATSmalllitNum135__4)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testSimplePhoneSATSmalllitNum135__4)).isEmpty());
        IConstr o_testSimplePhoneSATSmalllitNum135__5 = this.solver.addClause(clause0);
        Assert.assertTrue(((UnitClause) (o_testSimplePhoneSATSmalllitNum135__5)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_testSimplePhoneSATSmalllitNum135__5)).getActivity())), 0.1);
        Assert.assertEquals("1", ((UnitClause) (o_testSimplePhoneSATSmalllitNum135__5)).toString());
        VecInt clause1 = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause1)).toString());
        Assert.assertTrue(((VecInt) (clause1)).isEmpty());
        IVecInt o_testSimplePhoneSATSmalllitNum135__9 = clause1.push(1);
        Assert.assertEquals("1", ((VecInt) (o_testSimplePhoneSATSmalllitNum135__9)).toString());
        Assert.assertEquals(1, ((int) (((VecInt) (o_testSimplePhoneSATSmalllitNum135__9)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testSimplePhoneSATSmalllitNum135__9)).isEmpty());
        IVecInt o_testSimplePhoneSATSmalllitNum135__10 = clause1.push((-2));
        Assert.assertEquals("1,-2", ((VecInt) (o_testSimplePhoneSATSmalllitNum135__10)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_testSimplePhoneSATSmalllitNum135__10)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testSimplePhoneSATSmalllitNum135__10)).isEmpty());
        this.solver.addClause(clause1);
        VecInt clause2 = new VecInt();
        clause2.push(2);
        clause2.push((-1));
        this.solver.addClause(clause2);
        VecInt clause3 = new VecInt();
        clause3.push(3);
        clause3.push((-2));
        this.solver.addClause(clause3);
        VecInt clause8 = new VecInt();
        clause8.push(2);
        clause8.push((-3));
        this.solver.addClause(clause8);
        VecInt clause4 = new VecInt();
        clause4.push((-4));
        clause4.push(1);
        this.solver.addClause(clause4);
        VecInt clause5 = new VecInt();
        clause5.push((-5));
        clause5.push(4);
        this.solver.addClause(clause5);
        VecInt clause6 = new VecInt();
        clause6.push((-6));
        clause6.push(4);
        this.solver.addClause(clause6);
        VecInt clause7 = new VecInt();
        clause7.push(5);
        clause7.push(6);
        clause7.push((-4));
        this.solver.addAtLeast(clause6, 1);
        this.solver.isSatisfiable();
        VecInt bound1 = new VecInt();
        bound1.push(3);
        this.solver.findModel(bound1);
        VecInt bound2 = new VecInt();
        bound2.push((-3));
        this.solver.findModel(bound2);
        VecInt bound3 = new VecInt();
        bound3.push(5);
        bound3.push(3);
        this.solver.findModel(bound3);
        VecInt bound4 = new VecInt();
        bound4.push(4);
        bound4.push((-3));
        this.solver.findModel(bound4);
        VecInt bound5 = new VecInt();
        bound5.push(4);
        bound5.push((-3));
        this.solver.findModel(bound5);
        VecInt bound6 = new VecInt();
        bound6.push(4);
        bound6.push(3);
        this.solver.findModel(bound6);
        VecInt bound7 = new VecInt();
        bound7.push(4);
        int[] model = this.solver.findModel(bound7);
        Set<Integer> satisfiedModel = new HashSet<Integer>();
        for (int i : model) {
            satisfiedModel.add(new Integer(i));
        }
        satisfiedModel.contains(new Integer(4));
        satisfiedModel.contains(new Integer(1));
        satisfiedModel.contains(new Integer(2));
    }

    @Test(timeout = 30000)
    public void testSimplePhoneSATSmalllitNum116() throws Exception, ContradictionException, TimeoutException {
        VecInt clause0 = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause0)).toString());
        Assert.assertTrue(((VecInt) (clause0)).isEmpty());
        IVecInt o_testSimplePhoneSATSmalllitNum116__4 = clause0.push(1);
        Assert.assertEquals("1", ((VecInt) (o_testSimplePhoneSATSmalllitNum116__4)).toString());
        Assert.assertEquals(1, ((int) (((VecInt) (o_testSimplePhoneSATSmalllitNum116__4)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testSimplePhoneSATSmalllitNum116__4)).isEmpty());
        IConstr o_testSimplePhoneSATSmalllitNum116__5 = this.solver.addClause(clause0);
        Assert.assertTrue(((UnitClause) (o_testSimplePhoneSATSmalllitNum116__5)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_testSimplePhoneSATSmalllitNum116__5)).getActivity())), 0.1);
        Assert.assertEquals("1", ((UnitClause) (o_testSimplePhoneSATSmalllitNum116__5)).toString());
        VecInt clause1 = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause1)).toString());
        Assert.assertTrue(((VecInt) (clause1)).isEmpty());
        IVecInt o_testSimplePhoneSATSmalllitNum116__9 = clause1.push(1);
        Assert.assertEquals("1", ((VecInt) (o_testSimplePhoneSATSmalllitNum116__9)).toString());
        Assert.assertEquals(1, ((int) (((VecInt) (o_testSimplePhoneSATSmalllitNum116__9)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testSimplePhoneSATSmalllitNum116__9)).isEmpty());
        IVecInt o_testSimplePhoneSATSmalllitNum116__10 = clause1.push((-2));
        Assert.assertEquals("1,-2", ((VecInt) (o_testSimplePhoneSATSmalllitNum116__10)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_testSimplePhoneSATSmalllitNum116__10)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testSimplePhoneSATSmalllitNum116__10)).isEmpty());
        this.solver.addClause(clause1);
        VecInt clause2 = new VecInt();
        clause2.push(2);
        clause2.push((-1));
        this.solver.addClause(clause2);
        VecInt clause3 = new VecInt();
        clause3.push(3);
        clause3.push((-2));
        this.solver.addClause(clause3);
        VecInt clause8 = new VecInt();
        clause8.push(2);
        clause8.push((-3));
        this.solver.addClause(clause8);
        VecInt clause4 = new VecInt();
        clause4.push((-4));
        clause4.push(1);
        this.solver.addClause(clause4);
        VecInt clause5 = new VecInt();
        clause5.push((-5));
        clause5.push(4);
        this.solver.addClause(clause5);
        VecInt clause6 = new VecInt();
        clause6.push((-6));
        clause6.push(4);
        this.solver.addClause(clause6);
        VecInt clause7 = new VecInt();
        clause7.push(5);
        clause7.push(6);
        clause7.push((-4));
        this.solver.addAtLeast(clause6, 1);
        this.solver.isSatisfiable();
        VecInt bound1 = new VecInt();
        bound1.push(3);
        this.solver.findModel(bound1);
        VecInt bound2 = new VecInt();
        bound2.push((-4));
        this.solver.findModel(bound2);
        VecInt bound3 = new VecInt();
        bound3.push(5);
        bound3.push(3);
        this.solver.findModel(bound3);
        VecInt bound4 = new VecInt();
        bound4.push(5);
        bound4.push((-3));
        this.solver.findModel(bound4);
        VecInt bound5 = new VecInt();
        bound5.push(4);
        bound5.push((-3));
        this.solver.findModel(bound5);
        VecInt bound6 = new VecInt();
        bound6.push(4);
        bound6.push(3);
        this.solver.findModel(bound6);
        VecInt bound7 = new VecInt();
        bound7.push(4);
        int[] model = this.solver.findModel(bound7);
        Set<Integer> satisfiedModel = new HashSet<Integer>();
        for (int i : model) {
            satisfiedModel.add(new Integer(i));
        }
        satisfiedModel.contains(new Integer(4));
        satisfiedModel.contains(new Integer(1));
        satisfiedModel.contains(new Integer(2));
    }

    @Test(timeout = 30000)
    public void testSimplePhoneSATSmalllitNum152() throws Exception, ContradictionException, TimeoutException {
        VecInt clause0 = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause0)).toString());
        Assert.assertTrue(((VecInt) (clause0)).isEmpty());
        IVecInt o_testSimplePhoneSATSmalllitNum152__4 = clause0.push(1);
        Assert.assertEquals("1", ((VecInt) (o_testSimplePhoneSATSmalllitNum152__4)).toString());
        Assert.assertEquals(1, ((int) (((VecInt) (o_testSimplePhoneSATSmalllitNum152__4)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testSimplePhoneSATSmalllitNum152__4)).isEmpty());
        IConstr o_testSimplePhoneSATSmalllitNum152__5 = this.solver.addClause(clause0);
        Assert.assertTrue(((UnitClause) (o_testSimplePhoneSATSmalllitNum152__5)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_testSimplePhoneSATSmalllitNum152__5)).getActivity())), 0.1);
        Assert.assertEquals("1", ((UnitClause) (o_testSimplePhoneSATSmalllitNum152__5)).toString());
        VecInt clause1 = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause1)).toString());
        Assert.assertTrue(((VecInt) (clause1)).isEmpty());
        IVecInt o_testSimplePhoneSATSmalllitNum152__9 = clause1.push(1);
        Assert.assertEquals("1", ((VecInt) (o_testSimplePhoneSATSmalllitNum152__9)).toString());
        Assert.assertEquals(1, ((int) (((VecInt) (o_testSimplePhoneSATSmalllitNum152__9)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testSimplePhoneSATSmalllitNum152__9)).isEmpty());
        IVecInt o_testSimplePhoneSATSmalllitNum152__10 = clause1.push((-2));
        Assert.assertEquals("1,-2", ((VecInt) (o_testSimplePhoneSATSmalllitNum152__10)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_testSimplePhoneSATSmalllitNum152__10)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testSimplePhoneSATSmalllitNum152__10)).isEmpty());
        this.solver.addClause(clause1);
        VecInt clause2 = new VecInt();
        clause2.push(2);
        clause2.push((-1));
        this.solver.addClause(clause2);
        VecInt clause3 = new VecInt();
        clause3.push(3);
        clause3.push((-2));
        this.solver.addClause(clause3);
        VecInt clause8 = new VecInt();
        clause8.push(2);
        clause8.push((-3));
        this.solver.addClause(clause8);
        VecInt clause4 = new VecInt();
        clause4.push((-4));
        clause4.push(1);
        this.solver.addClause(clause4);
        VecInt clause5 = new VecInt();
        clause5.push((-5));
        clause5.push(4);
        this.solver.addClause(clause5);
        VecInt clause6 = new VecInt();
        clause6.push((-6));
        clause6.push(4);
        this.solver.addClause(clause6);
        VecInt clause7 = new VecInt();
        clause7.push(5);
        clause7.push(6);
        clause7.push((-4));
        this.solver.addAtLeast(clause6, 1);
        this.solver.isSatisfiable();
        VecInt bound1 = new VecInt();
        bound1.push(3);
        this.solver.findModel(bound1);
        VecInt bound2 = new VecInt();
        bound2.push((-3));
        this.solver.findModel(bound2);
        VecInt bound3 = new VecInt();
        bound3.push(5);
        bound3.push(3);
        this.solver.findModel(bound3);
        VecInt bound4 = new VecInt();
        bound4.push(5);
        bound4.push((-3));
        this.solver.findModel(bound4);
        VecInt bound5 = new VecInt();
        bound5.push(4);
        bound5.push((-4));
        this.solver.findModel(bound5);
        VecInt bound6 = new VecInt();
        bound6.push(4);
        bound6.push(3);
        this.solver.findModel(bound6);
        VecInt bound7 = new VecInt();
        bound7.push(4);
        int[] model = this.solver.findModel(bound7);
        Set<Integer> satisfiedModel = new HashSet<Integer>();
        for (int i : model) {
            satisfiedModel.add(new Integer(i));
        }
        satisfiedModel.contains(new Integer(4));
        satisfiedModel.contains(new Integer(1));
        satisfiedModel.contains(new Integer(2));
    }

    @Test(timeout = 30000)
    public void testSimplePhoneSATSmalllitNum156() throws Exception, ContradictionException, TimeoutException {
        VecInt clause0 = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause0)).toString());
        Assert.assertTrue(((VecInt) (clause0)).isEmpty());
        IVecInt o_testSimplePhoneSATSmalllitNum156__4 = clause0.push(1);
        Assert.assertEquals("1", ((VecInt) (o_testSimplePhoneSATSmalllitNum156__4)).toString());
        Assert.assertEquals(1, ((int) (((VecInt) (o_testSimplePhoneSATSmalllitNum156__4)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testSimplePhoneSATSmalllitNum156__4)).isEmpty());
        IConstr o_testSimplePhoneSATSmalllitNum156__5 = this.solver.addClause(clause0);
        Assert.assertTrue(((UnitClause) (o_testSimplePhoneSATSmalllitNum156__5)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_testSimplePhoneSATSmalllitNum156__5)).getActivity())), 0.1);
        Assert.assertEquals("1", ((UnitClause) (o_testSimplePhoneSATSmalllitNum156__5)).toString());
        VecInt clause1 = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause1)).toString());
        Assert.assertTrue(((VecInt) (clause1)).isEmpty());
        IVecInt o_testSimplePhoneSATSmalllitNum156__9 = clause1.push(1);
        Assert.assertEquals("1", ((VecInt) (o_testSimplePhoneSATSmalllitNum156__9)).toString());
        Assert.assertEquals(1, ((int) (((VecInt) (o_testSimplePhoneSATSmalllitNum156__9)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testSimplePhoneSATSmalllitNum156__9)).isEmpty());
        IVecInt o_testSimplePhoneSATSmalllitNum156__10 = clause1.push((-2));
        Assert.assertEquals("1,-2", ((VecInt) (o_testSimplePhoneSATSmalllitNum156__10)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_testSimplePhoneSATSmalllitNum156__10)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testSimplePhoneSATSmalllitNum156__10)).isEmpty());
        this.solver.addClause(clause1);
        VecInt clause2 = new VecInt();
        clause2.push(2);
        clause2.push((-1));
        this.solver.addClause(clause2);
        VecInt clause3 = new VecInt();
        clause3.push(3);
        clause3.push((-2));
        this.solver.addClause(clause3);
        VecInt clause8 = new VecInt();
        clause8.push(2);
        clause8.push((-3));
        this.solver.addClause(clause8);
        VecInt clause4 = new VecInt();
        clause4.push((-4));
        clause4.push(1);
        this.solver.addClause(clause4);
        VecInt clause5 = new VecInt();
        clause5.push((-5));
        clause5.push(4);
        this.solver.addClause(clause5);
        VecInt clause6 = new VecInt();
        clause6.push((-6));
        clause6.push(4);
        this.solver.addClause(clause6);
        VecInt clause7 = new VecInt();
        clause7.push(5);
        clause7.push(6);
        clause7.push((-4));
        this.solver.addAtLeast(clause6, 1);
        this.solver.isSatisfiable();
        VecInt bound1 = new VecInt();
        bound1.push(3);
        this.solver.findModel(bound1);
        VecInt bound2 = new VecInt();
        bound2.push((-3));
        this.solver.findModel(bound2);
        VecInt bound3 = new VecInt();
        bound3.push(5);
        bound3.push(3);
        this.solver.findModel(bound3);
        VecInt bound4 = new VecInt();
        bound4.push(5);
        bound4.push((-3));
        this.solver.findModel(bound4);
        VecInt bound5 = new VecInt();
        bound5.push(4);
        bound5.push((-0));
        this.solver.findModel(bound5);
        VecInt bound6 = new VecInt();
        bound6.push(4);
        bound6.push(3);
        this.solver.findModel(bound6);
        VecInt bound7 = new VecInt();
        bound7.push(4);
        int[] model = this.solver.findModel(bound7);
        Set<Integer> satisfiedModel = new HashSet<Integer>();
        for (int i : model) {
            satisfiedModel.add(new Integer(i));
        }
        satisfiedModel.contains(new Integer(4));
        satisfiedModel.contains(new Integer(1));
        satisfiedModel.contains(new Integer(2));
    }

    @Test(timeout = 30000)
    public void testSimplePhoneSATSmalllitNum147() throws Exception, ContradictionException, TimeoutException {
        VecInt clause0 = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause0)).toString());
        Assert.assertTrue(((VecInt) (clause0)).isEmpty());
        IVecInt o_testSimplePhoneSATSmalllitNum147__4 = clause0.push(1);
        Assert.assertEquals("1", ((VecInt) (o_testSimplePhoneSATSmalllitNum147__4)).toString());
        Assert.assertEquals(1, ((int) (((VecInt) (o_testSimplePhoneSATSmalllitNum147__4)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testSimplePhoneSATSmalllitNum147__4)).isEmpty());
        IConstr o_testSimplePhoneSATSmalllitNum147__5 = this.solver.addClause(clause0);
        Assert.assertTrue(((UnitClause) (o_testSimplePhoneSATSmalllitNum147__5)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_testSimplePhoneSATSmalllitNum147__5)).getActivity())), 0.1);
        Assert.assertEquals("1", ((UnitClause) (o_testSimplePhoneSATSmalllitNum147__5)).toString());
        VecInt clause1 = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause1)).toString());
        Assert.assertTrue(((VecInt) (clause1)).isEmpty());
        IVecInt o_testSimplePhoneSATSmalllitNum147__9 = clause1.push(1);
        Assert.assertEquals("1", ((VecInt) (o_testSimplePhoneSATSmalllitNum147__9)).toString());
        Assert.assertEquals(1, ((int) (((VecInt) (o_testSimplePhoneSATSmalllitNum147__9)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testSimplePhoneSATSmalllitNum147__9)).isEmpty());
        IVecInt o_testSimplePhoneSATSmalllitNum147__10 = clause1.push((-2));
        Assert.assertEquals("1,-2", ((VecInt) (o_testSimplePhoneSATSmalllitNum147__10)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_testSimplePhoneSATSmalllitNum147__10)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testSimplePhoneSATSmalllitNum147__10)).isEmpty());
        this.solver.addClause(clause1);
        VecInt clause2 = new VecInt();
        clause2.push(2);
        clause2.push((-1));
        this.solver.addClause(clause2);
        VecInt clause3 = new VecInt();
        clause3.push(3);
        clause3.push((-2));
        this.solver.addClause(clause3);
        VecInt clause8 = new VecInt();
        clause8.push(2);
        clause8.push((-3));
        this.solver.addClause(clause8);
        VecInt clause4 = new VecInt();
        clause4.push((-4));
        clause4.push(1);
        this.solver.addClause(clause4);
        VecInt clause5 = new VecInt();
        clause5.push((-5));
        clause5.push(4);
        this.solver.addClause(clause5);
        VecInt clause6 = new VecInt();
        clause6.push((-6));
        clause6.push(4);
        this.solver.addClause(clause6);
        VecInt clause7 = new VecInt();
        clause7.push(5);
        clause7.push(6);
        clause7.push((-4));
        this.solver.addAtLeast(clause6, 1);
        this.solver.isSatisfiable();
        VecInt bound1 = new VecInt();
        bound1.push(3);
        this.solver.findModel(bound1);
        VecInt bound2 = new VecInt();
        bound2.push((-3));
        this.solver.findModel(bound2);
        VecInt bound3 = new VecInt();
        bound3.push(5);
        bound3.push(3);
        this.solver.findModel(bound3);
        VecInt bound4 = new VecInt();
        bound4.push(5);
        bound4.push((-3));
        this.solver.findModel(bound4);
        VecInt bound5 = new VecInt();
        bound5.push(3);
        bound5.push((-3));
        this.solver.findModel(bound5);
        VecInt bound6 = new VecInt();
        bound6.push(4);
        bound6.push(3);
        this.solver.findModel(bound6);
        VecInt bound7 = new VecInt();
        bound7.push(4);
        int[] model = this.solver.findModel(bound7);
        Set<Integer> satisfiedModel = new HashSet<Integer>();
        for (int i : model) {
            satisfiedModel.add(new Integer(i));
        }
        satisfiedModel.contains(new Integer(4));
        satisfiedModel.contains(new Integer(1));
        satisfiedModel.contains(new Integer(2));
    }

    @Test(timeout = 30000)
    public void testSimplePhoneSATSmalllitNum108() throws Exception, ContradictionException, TimeoutException {
        VecInt clause0 = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause0)).toString());
        Assert.assertTrue(((VecInt) (clause0)).isEmpty());
        IVecInt o_testSimplePhoneSATSmalllitNum108__4 = clause0.push(1);
        Assert.assertEquals("1", ((VecInt) (o_testSimplePhoneSATSmalllitNum108__4)).toString());
        Assert.assertEquals(1, ((int) (((VecInt) (o_testSimplePhoneSATSmalllitNum108__4)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testSimplePhoneSATSmalllitNum108__4)).isEmpty());
        IConstr o_testSimplePhoneSATSmalllitNum108__5 = this.solver.addClause(clause0);
        Assert.assertTrue(((UnitClause) (o_testSimplePhoneSATSmalllitNum108__5)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_testSimplePhoneSATSmalllitNum108__5)).getActivity())), 0.1);
        Assert.assertEquals("1", ((UnitClause) (o_testSimplePhoneSATSmalllitNum108__5)).toString());
        VecInt clause1 = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause1)).toString());
        Assert.assertTrue(((VecInt) (clause1)).isEmpty());
        IVecInt o_testSimplePhoneSATSmalllitNum108__9 = clause1.push(1);
        Assert.assertEquals("1", ((VecInt) (o_testSimplePhoneSATSmalllitNum108__9)).toString());
        Assert.assertEquals(1, ((int) (((VecInt) (o_testSimplePhoneSATSmalllitNum108__9)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testSimplePhoneSATSmalllitNum108__9)).isEmpty());
        IVecInt o_testSimplePhoneSATSmalllitNum108__10 = clause1.push((-2));
        Assert.assertEquals("1,-2", ((VecInt) (o_testSimplePhoneSATSmalllitNum108__10)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_testSimplePhoneSATSmalllitNum108__10)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testSimplePhoneSATSmalllitNum108__10)).isEmpty());
        this.solver.addClause(clause1);
        VecInt clause2 = new VecInt();
        clause2.push(2);
        clause2.push((-1));
        this.solver.addClause(clause2);
        VecInt clause3 = new VecInt();
        clause3.push(3);
        clause3.push((-2));
        this.solver.addClause(clause3);
        VecInt clause8 = new VecInt();
        clause8.push(2);
        clause8.push((-3));
        this.solver.addClause(clause8);
        VecInt clause4 = new VecInt();
        clause4.push((-4));
        clause4.push(1);
        this.solver.addClause(clause4);
        VecInt clause5 = new VecInt();
        clause5.push((-5));
        clause5.push(4);
        this.solver.addClause(clause5);
        VecInt clause6 = new VecInt();
        clause6.push((-6));
        clause6.push(4);
        this.solver.addClause(clause6);
        VecInt clause7 = new VecInt();
        clause7.push(5);
        clause7.push(6);
        clause7.push((-4));
        this.solver.addAtLeast(clause6, Integer.MIN_VALUE);
        this.solver.isSatisfiable();
        VecInt bound1 = new VecInt();
        bound1.push(3);
        this.solver.findModel(bound1);
        VecInt bound2 = new VecInt();
        bound2.push((-3));
        this.solver.findModel(bound2);
        VecInt bound3 = new VecInt();
        bound3.push(5);
        bound3.push(3);
        this.solver.findModel(bound3);
        VecInt bound4 = new VecInt();
        bound4.push(5);
        bound4.push((-3));
        this.solver.findModel(bound4);
        VecInt bound5 = new VecInt();
        bound5.push(4);
        bound5.push((-3));
        this.solver.findModel(bound5);
        VecInt bound6 = new VecInt();
        bound6.push(4);
        bound6.push(3);
        this.solver.findModel(bound6);
        VecInt bound7 = new VecInt();
        bound7.push(4);
        int[] model = this.solver.findModel(bound7);
        Set<Integer> satisfiedModel = new HashSet<Integer>();
        for (int i : model) {
            satisfiedModel.add(new Integer(i));
        }
        satisfiedModel.contains(new Integer(4));
        satisfiedModel.contains(new Integer(1));
        satisfiedModel.contains(new Integer(2));
    }

    @Test(timeout = 30000)
    public void testSimplePhoneSATSmalllitNum74() throws Exception, ContradictionException, TimeoutException {
        VecInt clause0 = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause0)).toString());
        Assert.assertTrue(((VecInt) (clause0)).isEmpty());
        IVecInt o_testSimplePhoneSATSmalllitNum74__4 = clause0.push(1);
        Assert.assertEquals("1", ((VecInt) (o_testSimplePhoneSATSmalllitNum74__4)).toString());
        Assert.assertEquals(1, ((int) (((VecInt) (o_testSimplePhoneSATSmalllitNum74__4)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testSimplePhoneSATSmalllitNum74__4)).isEmpty());
        IConstr o_testSimplePhoneSATSmalllitNum74__5 = this.solver.addClause(clause0);
        Assert.assertTrue(((UnitClause) (o_testSimplePhoneSATSmalllitNum74__5)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_testSimplePhoneSATSmalllitNum74__5)).getActivity())), 0.1);
        Assert.assertEquals("1", ((UnitClause) (o_testSimplePhoneSATSmalllitNum74__5)).toString());
        VecInt clause1 = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause1)).toString());
        Assert.assertTrue(((VecInt) (clause1)).isEmpty());
        IVecInt o_testSimplePhoneSATSmalllitNum74__9 = clause1.push(1);
        Assert.assertEquals("1", ((VecInt) (o_testSimplePhoneSATSmalllitNum74__9)).toString());
        Assert.assertEquals(1, ((int) (((VecInt) (o_testSimplePhoneSATSmalllitNum74__9)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testSimplePhoneSATSmalllitNum74__9)).isEmpty());
        IVecInt o_testSimplePhoneSATSmalllitNum74__10 = clause1.push((-2));
        Assert.assertEquals("1,-2", ((VecInt) (o_testSimplePhoneSATSmalllitNum74__10)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_testSimplePhoneSATSmalllitNum74__10)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testSimplePhoneSATSmalllitNum74__10)).isEmpty());
        this.solver.addClause(clause1);
        VecInt clause2 = new VecInt();
        clause2.push(2);
        clause2.push((-1));
        this.solver.addClause(clause2);
        VecInt clause3 = new VecInt();
        clause3.push(3);
        clause3.push((-2));
        this.solver.addClause(clause3);
        VecInt clause8 = new VecInt();
        clause8.push(2);
        clause8.push((-3));
        this.solver.addClause(clause8);
        VecInt clause4 = new VecInt();
        clause4.push((-4));
        clause4.push(1);
        this.solver.addClause(clause4);
        VecInt clause5 = new VecInt();
        clause5.push((-5));
        clause5.push(73170972);
        this.solver.addClause(clause5);
        VecInt clause6 = new VecInt();
        clause6.push((-6));
        clause6.push(4);
        this.solver.addClause(clause6);
        VecInt clause7 = new VecInt();
        clause7.push(5);
        clause7.push(6);
        clause7.push((-4));
        this.solver.addAtLeast(clause6, 1);
        this.solver.isSatisfiable();
        VecInt bound1 = new VecInt();
        bound1.push(3);
        this.solver.findModel(bound1);
        VecInt bound2 = new VecInt();
        bound2.push((-3));
        this.solver.findModel(bound2);
        VecInt bound3 = new VecInt();
        bound3.push(5);
        bound3.push(3);
        this.solver.findModel(bound3);
        VecInt bound4 = new VecInt();
        bound4.push(5);
        bound4.push((-3));
        this.solver.findModel(bound4);
        VecInt bound5 = new VecInt();
        bound5.push(4);
        bound5.push((-3));
        this.solver.findModel(bound5);
        VecInt bound6 = new VecInt();
        bound6.push(4);
        bound6.push(3);
        this.solver.findModel(bound6);
        VecInt bound7 = new VecInt();
        bound7.push(4);
        int[] model = this.solver.findModel(bound7);
        Set<Integer> satisfiedModel = new HashSet<Integer>();
        for (int i : model) {
            satisfiedModel.add(new Integer(i));
        }
        satisfiedModel.contains(new Integer(4));
        satisfiedModel.contains(new Integer(1));
        satisfiedModel.contains(new Integer(2));
    }

    @Test(timeout = 30000)
    public void testSimplePhoneSATSmalllitNum163() throws Exception, ContradictionException, TimeoutException {
        VecInt clause0 = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause0)).toString());
        Assert.assertTrue(((VecInt) (clause0)).isEmpty());
        IVecInt o_testSimplePhoneSATSmalllitNum163__4 = clause0.push(1);
        Assert.assertEquals("1", ((VecInt) (o_testSimplePhoneSATSmalllitNum163__4)).toString());
        Assert.assertEquals(1, ((int) (((VecInt) (o_testSimplePhoneSATSmalllitNum163__4)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testSimplePhoneSATSmalllitNum163__4)).isEmpty());
        IConstr o_testSimplePhoneSATSmalllitNum163__5 = this.solver.addClause(clause0);
        Assert.assertTrue(((UnitClause) (o_testSimplePhoneSATSmalllitNum163__5)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_testSimplePhoneSATSmalllitNum163__5)).getActivity())), 0.1);
        Assert.assertEquals("1", ((UnitClause) (o_testSimplePhoneSATSmalllitNum163__5)).toString());
        VecInt clause1 = new VecInt();
        Assert.assertEquals("", ((VecInt) (clause1)).toString());
        Assert.assertTrue(((VecInt) (clause1)).isEmpty());
        IVecInt o_testSimplePhoneSATSmalllitNum163__9 = clause1.push(1);
        Assert.assertEquals("1", ((VecInt) (o_testSimplePhoneSATSmalllitNum163__9)).toString());
        Assert.assertEquals(1, ((int) (((VecInt) (o_testSimplePhoneSATSmalllitNum163__9)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testSimplePhoneSATSmalllitNum163__9)).isEmpty());
        IVecInt o_testSimplePhoneSATSmalllitNum163__10 = clause1.push((-2));
        Assert.assertEquals("1,-2", ((VecInt) (o_testSimplePhoneSATSmalllitNum163__10)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_testSimplePhoneSATSmalllitNum163__10)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testSimplePhoneSATSmalllitNum163__10)).isEmpty());
        this.solver.addClause(clause1);
        VecInt clause2 = new VecInt();
        clause2.push(2);
        clause2.push((-1));
        this.solver.addClause(clause2);
        VecInt clause3 = new VecInt();
        clause3.push(3);
        clause3.push((-2));
        this.solver.addClause(clause3);
        VecInt clause8 = new VecInt();
        clause8.push(2);
        clause8.push((-3));
        this.solver.addClause(clause8);
        VecInt clause4 = new VecInt();
        clause4.push((-4));
        clause4.push(1);
        this.solver.addClause(clause4);
        VecInt clause5 = new VecInt();
        clause5.push((-5));
        clause5.push(4);
        this.solver.addClause(clause5);
        VecInt clause6 = new VecInt();
        clause6.push((-6));
        clause6.push(4);
        this.solver.addClause(clause6);
        VecInt clause7 = new VecInt();
        clause7.push(5);
        clause7.push(6);
        clause7.push((-4));
        this.solver.addAtLeast(clause6, 1);
        this.solver.isSatisfiable();
        VecInt bound1 = new VecInt();
        bound1.push(3);
        this.solver.findModel(bound1);
        VecInt bound2 = new VecInt();
        bound2.push((-3));
        this.solver.findModel(bound2);
        VecInt bound3 = new VecInt();
        bound3.push(5);
        bound3.push(3);
        this.solver.findModel(bound3);
        VecInt bound4 = new VecInt();
        bound4.push(5);
        bound4.push((-3));
        this.solver.findModel(bound4);
        VecInt bound5 = new VecInt();
        bound5.push(4);
        bound5.push((-3));
        this.solver.findModel(bound5);
        VecInt bound6 = new VecInt();
        bound6.push(-29637313);
        bound6.push(3);
        this.solver.findModel(bound6);
        VecInt bound7 = new VecInt();
        bound7.push(4);
        int[] model = this.solver.findModel(bound7);
        Set<Integer> satisfiedModel = new HashSet<Integer>();
        for (int i : model) {
            satisfiedModel.add(new Integer(i));
        }
        satisfiedModel.contains(new Integer(4));
        satisfiedModel.contains(new Integer(1));
        satisfiedModel.contains(new Integer(2));
    }

    @Test(timeout = 30000)
    public void testSimplePhoneSATSmalllitNum2_failAssert0() throws Exception, ContradictionException, TimeoutException {
        try {
            VecInt clause0 = new VecInt();
            clause0.push(0);
            this.solver.addClause(clause0);
            VecInt clause1 = new VecInt();
            clause1.push(1);
            clause1.push((-2));
            this.solver.addClause(clause1);
            VecInt clause2 = new VecInt();
            clause2.push(2);
            clause2.push((-1));
            this.solver.addClause(clause2);
            VecInt clause3 = new VecInt();
            clause3.push(3);
            clause3.push((-2));
            this.solver.addClause(clause3);
            VecInt clause8 = new VecInt();
            clause8.push(2);
            clause8.push((-3));
            this.solver.addClause(clause8);
            VecInt clause4 = new VecInt();
            clause4.push((-4));
            clause4.push(1);
            this.solver.addClause(clause4);
            VecInt clause5 = new VecInt();
            clause5.push((-5));
            clause5.push(4);
            this.solver.addClause(clause5);
            VecInt clause6 = new VecInt();
            clause6.push((-6));
            clause6.push(4);
            this.solver.addClause(clause6);
            VecInt clause7 = new VecInt();
            clause7.push(5);
            clause7.push(6);
            clause7.push((-4));
            this.solver.addAtLeast(clause6, 1);
            this.solver.isSatisfiable();
            VecInt bound1 = new VecInt();
            bound1.push(3);
            this.solver.findModel(bound1);
            VecInt bound2 = new VecInt();
            bound2.push((-3));
            this.solver.findModel(bound2);
            VecInt bound3 = new VecInt();
            bound3.push(5);
            bound3.push(3);
            this.solver.findModel(bound3);
            VecInt bound4 = new VecInt();
            bound4.push(5);
            bound4.push((-3));
            this.solver.findModel(bound4);
            VecInt bound5 = new VecInt();
            bound5.push(4);
            bound5.push((-3));
            this.solver.findModel(bound5);
            VecInt bound6 = new VecInt();
            bound6.push(4);
            bound6.push(3);
            this.solver.findModel(bound6);
            VecInt bound7 = new VecInt();
            bound7.push(4);
            int[] model = this.solver.findModel(bound7);
            Set<Integer> satisfiedModel = new HashSet<Integer>();
            for (int i : model) {
                satisfiedModel.add(new Integer(i));
            }
            satisfiedModel.contains(new Integer(4));
            satisfiedModel.contains(new Integer(1));
            satisfiedModel.contains(new Integer(2));
            org.junit.Assert.fail("testSimplePhoneSATSmalllitNum2 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSimplePhoneSATSmalllitNum7_failAssert1() throws Exception, ContradictionException, TimeoutException {
        try {
            VecInt clause0 = new VecInt();
            clause0.push(1);
            this.solver.addClause(clause0);
            VecInt clause1 = new VecInt();
            clause1.push(0);
            clause1.push((-2));
            this.solver.addClause(clause1);
            VecInt clause2 = new VecInt();
            clause2.push(2);
            clause2.push((-1));
            this.solver.addClause(clause2);
            VecInt clause3 = new VecInt();
            clause3.push(3);
            clause3.push((-2));
            this.solver.addClause(clause3);
            VecInt clause8 = new VecInt();
            clause8.push(2);
            clause8.push((-3));
            this.solver.addClause(clause8);
            VecInt clause4 = new VecInt();
            clause4.push((-4));
            clause4.push(1);
            this.solver.addClause(clause4);
            VecInt clause5 = new VecInt();
            clause5.push((-5));
            clause5.push(4);
            this.solver.addClause(clause5);
            VecInt clause6 = new VecInt();
            clause6.push((-6));
            clause6.push(4);
            this.solver.addClause(clause6);
            VecInt clause7 = new VecInt();
            clause7.push(5);
            clause7.push(6);
            clause7.push((-4));
            this.solver.addAtLeast(clause6, 1);
            this.solver.isSatisfiable();
            VecInt bound1 = new VecInt();
            bound1.push(3);
            this.solver.findModel(bound1);
            VecInt bound2 = new VecInt();
            bound2.push((-3));
            this.solver.findModel(bound2);
            VecInt bound3 = new VecInt();
            bound3.push(5);
            bound3.push(3);
            this.solver.findModel(bound3);
            VecInt bound4 = new VecInt();
            bound4.push(5);
            bound4.push((-3));
            this.solver.findModel(bound4);
            VecInt bound5 = new VecInt();
            bound5.push(4);
            bound5.push((-3));
            this.solver.findModel(bound5);
            VecInt bound6 = new VecInt();
            bound6.push(4);
            bound6.push(3);
            this.solver.findModel(bound6);
            VecInt bound7 = new VecInt();
            bound7.push(4);
            int[] model = this.solver.findModel(bound7);
            Set<Integer> satisfiedModel = new HashSet<Integer>();
            for (int i : model) {
                satisfiedModel.add(new Integer(i));
            }
            satisfiedModel.contains(new Integer(4));
            satisfiedModel.contains(new Integer(1));
            satisfiedModel.contains(new Integer(2));
            org.junit.Assert.fail("testSimplePhoneSATSmalllitNum7 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSimplePhoneSATSmalllitNum21_failAssert2() throws Exception, ContradictionException, TimeoutException {
        try {
            VecInt clause0 = new VecInt();
            clause0.push(1);
            this.solver.addClause(clause0);
            VecInt clause1 = new VecInt();
            clause1.push(1);
            clause1.push((-2));
            this.solver.addClause(clause1);
            VecInt clause2 = new VecInt();
            clause2.push(0);
            clause2.push((-1));
            this.solver.addClause(clause2);
            VecInt clause3 = new VecInt();
            clause3.push(3);
            clause3.push((-2));
            this.solver.addClause(clause3);
            VecInt clause8 = new VecInt();
            clause8.push(2);
            clause8.push((-3));
            this.solver.addClause(clause8);
            VecInt clause4 = new VecInt();
            clause4.push((-4));
            clause4.push(1);
            this.solver.addClause(clause4);
            VecInt clause5 = new VecInt();
            clause5.push((-5));
            clause5.push(4);
            this.solver.addClause(clause5);
            VecInt clause6 = new VecInt();
            clause6.push((-6));
            clause6.push(4);
            this.solver.addClause(clause6);
            VecInt clause7 = new VecInt();
            clause7.push(5);
            clause7.push(6);
            clause7.push((-4));
            this.solver.addAtLeast(clause6, 1);
            this.solver.isSatisfiable();
            VecInt bound1 = new VecInt();
            bound1.push(3);
            this.solver.findModel(bound1);
            VecInt bound2 = new VecInt();
            bound2.push((-3));
            this.solver.findModel(bound2);
            VecInt bound3 = new VecInt();
            bound3.push(5);
            bound3.push(3);
            this.solver.findModel(bound3);
            VecInt bound4 = new VecInt();
            bound4.push(5);
            bound4.push((-3));
            this.solver.findModel(bound4);
            VecInt bound5 = new VecInt();
            bound5.push(4);
            bound5.push((-3));
            this.solver.findModel(bound5);
            VecInt bound6 = new VecInt();
            bound6.push(4);
            bound6.push(3);
            this.solver.findModel(bound6);
            VecInt bound7 = new VecInt();
            bound7.push(4);
            int[] model = this.solver.findModel(bound7);
            Set<Integer> satisfiedModel = new HashSet<Integer>();
            for (int i : model) {
                satisfiedModel.add(new Integer(i));
            }
            satisfiedModel.contains(new Integer(4));
            satisfiedModel.contains(new Integer(1));
            satisfiedModel.contains(new Integer(2));
            org.junit.Assert.fail("testSimplePhoneSATSmalllitNum21 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSimplePhoneSATSmalllitNum32_failAssert3() throws Exception, ContradictionException, TimeoutException {
        try {
            VecInt clause0 = new VecInt();
            clause0.push(1);
            this.solver.addClause(clause0);
            VecInt clause1 = new VecInt();
            clause1.push(1);
            clause1.push((-2));
            this.solver.addClause(clause1);
            VecInt clause2 = new VecInt();
            clause2.push(2);
            clause2.push((-1));
            this.solver.addClause(clause2);
            VecInt clause3 = new VecInt();
            clause3.push(0);
            clause3.push((-2));
            this.solver.addClause(clause3);
            VecInt clause8 = new VecInt();
            clause8.push(2);
            clause8.push((-3));
            this.solver.addClause(clause8);
            VecInt clause4 = new VecInt();
            clause4.push((-4));
            clause4.push(1);
            this.solver.addClause(clause4);
            VecInt clause5 = new VecInt();
            clause5.push((-5));
            clause5.push(4);
            this.solver.addClause(clause5);
            VecInt clause6 = new VecInt();
            clause6.push((-6));
            clause6.push(4);
            this.solver.addClause(clause6);
            VecInt clause7 = new VecInt();
            clause7.push(5);
            clause7.push(6);
            clause7.push((-4));
            this.solver.addAtLeast(clause6, 1);
            this.solver.isSatisfiable();
            VecInt bound1 = new VecInt();
            bound1.push(3);
            this.solver.findModel(bound1);
            VecInt bound2 = new VecInt();
            bound2.push((-3));
            this.solver.findModel(bound2);
            VecInt bound3 = new VecInt();
            bound3.push(5);
            bound3.push(3);
            this.solver.findModel(bound3);
            VecInt bound4 = new VecInt();
            bound4.push(5);
            bound4.push((-3));
            this.solver.findModel(bound4);
            VecInt bound5 = new VecInt();
            bound5.push(4);
            bound5.push((-3));
            this.solver.findModel(bound5);
            VecInt bound6 = new VecInt();
            bound6.push(4);
            bound6.push(3);
            this.solver.findModel(bound6);
            VecInt bound7 = new VecInt();
            bound7.push(4);
            int[] model = this.solver.findModel(bound7);
            Set<Integer> satisfiedModel = new HashSet<Integer>();
            for (int i : model) {
                satisfiedModel.add(new Integer(i));
            }
            satisfiedModel.contains(new Integer(4));
            satisfiedModel.contains(new Integer(1));
            satisfiedModel.contains(new Integer(2));
            org.junit.Assert.fail("testSimplePhoneSATSmalllitNum32 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSimplePhoneSATSmalllitNum73_failAssert8() throws Exception, ContradictionException, TimeoutException {
        try {
            VecInt clause0 = new VecInt();
            clause0.push(1);
            this.solver.addClause(clause0);
            VecInt clause1 = new VecInt();
            clause1.push(1);
            clause1.push((-2));
            this.solver.addClause(clause1);
            VecInt clause2 = new VecInt();
            clause2.push(2);
            clause2.push((-1));
            this.solver.addClause(clause2);
            VecInt clause3 = new VecInt();
            clause3.push(3);
            clause3.push((-2));
            this.solver.addClause(clause3);
            VecInt clause8 = new VecInt();
            clause8.push(2);
            clause8.push((-3));
            this.solver.addClause(clause8);
            VecInt clause4 = new VecInt();
            clause4.push((-4));
            clause4.push(1);
            this.solver.addClause(clause4);
            VecInt clause5 = new VecInt();
            clause5.push((-5));
            clause5.push(0);
            this.solver.addClause(clause5);
            VecInt clause6 = new VecInt();
            clause6.push((-6));
            clause6.push(4);
            this.solver.addClause(clause6);
            VecInt clause7 = new VecInt();
            clause7.push(5);
            clause7.push(6);
            clause7.push((-4));
            this.solver.addAtLeast(clause6, 1);
            this.solver.isSatisfiable();
            VecInt bound1 = new VecInt();
            bound1.push(3);
            this.solver.findModel(bound1);
            VecInt bound2 = new VecInt();
            bound2.push((-3));
            this.solver.findModel(bound2);
            VecInt bound3 = new VecInt();
            bound3.push(5);
            bound3.push(3);
            this.solver.findModel(bound3);
            VecInt bound4 = new VecInt();
            bound4.push(5);
            bound4.push((-3));
            this.solver.findModel(bound4);
            VecInt bound5 = new VecInt();
            bound5.push(4);
            bound5.push((-3));
            this.solver.findModel(bound5);
            VecInt bound6 = new VecInt();
            bound6.push(4);
            bound6.push(3);
            this.solver.findModel(bound6);
            VecInt bound7 = new VecInt();
            bound7.push(4);
            int[] model = this.solver.findModel(bound7);
            Set<Integer> satisfiedModel = new HashSet<Integer>();
            for (int i : model) {
                satisfiedModel.add(new Integer(i));
            }
            satisfiedModel.contains(new Integer(4));
            satisfiedModel.contains(new Integer(1));
            satisfiedModel.contains(new Integer(2));
            org.junit.Assert.fail("testSimplePhoneSATSmalllitNum73 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSimplePhoneSATSmalllitNum85_failAssert12() throws Exception, ContradictionException, TimeoutException {
        try {
            VecInt clause0 = new VecInt();
            clause0.push(1);
            this.solver.addClause(clause0);
            VecInt clause1 = new VecInt();
            clause1.push(1);
            clause1.push((-2));
            this.solver.addClause(clause1);
            VecInt clause2 = new VecInt();
            clause2.push(2);
            clause2.push((-1));
            this.solver.addClause(clause2);
            VecInt clause3 = new VecInt();
            clause3.push(3);
            clause3.push((-2));
            this.solver.addClause(clause3);
            VecInt clause8 = new VecInt();
            clause8.push(2);
            clause8.push((-3));
            this.solver.addClause(clause8);
            VecInt clause4 = new VecInt();
            clause4.push((-4));
            clause4.push(1);
            this.solver.addClause(clause4);
            VecInt clause5 = new VecInt();
            clause5.push((-5));
            clause5.push(4);
            this.solver.addClause(clause5);
            VecInt clause6 = new VecInt();
            clause6.push((-6));
            clause6.push(0);
            this.solver.addClause(clause6);
            VecInt clause7 = new VecInt();
            clause7.push(5);
            clause7.push(6);
            clause7.push((-4));
            this.solver.addAtLeast(clause6, 1);
            this.solver.isSatisfiable();
            VecInt bound1 = new VecInt();
            bound1.push(3);
            this.solver.findModel(bound1);
            VecInt bound2 = new VecInt();
            bound2.push((-3));
            this.solver.findModel(bound2);
            VecInt bound3 = new VecInt();
            bound3.push(5);
            bound3.push(3);
            this.solver.findModel(bound3);
            VecInt bound4 = new VecInt();
            bound4.push(5);
            bound4.push((-3));
            this.solver.findModel(bound4);
            VecInt bound5 = new VecInt();
            bound5.push(4);
            bound5.push((-3));
            this.solver.findModel(bound5);
            VecInt bound6 = new VecInt();
            bound6.push(4);
            bound6.push(3);
            this.solver.findModel(bound6);
            VecInt bound7 = new VecInt();
            bound7.push(4);
            int[] model = this.solver.findModel(bound7);
            Set<Integer> satisfiedModel = new HashSet<Integer>();
            for (int i : model) {
                satisfiedModel.add(new Integer(i));
            }
            satisfiedModel.contains(new Integer(4));
            satisfiedModel.contains(new Integer(1));
            satisfiedModel.contains(new Integer(2));
            org.junit.Assert.fail("testSimplePhoneSATSmalllitNum85 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSimplePhoneSATSmalllitNum118_failAssert15() throws Exception, ContradictionException, TimeoutException {
        try {
            VecInt clause0 = new VecInt();
            clause0.push(1);
            this.solver.addClause(clause0);
            VecInt clause1 = new VecInt();
            clause1.push(1);
            clause1.push((-2));
            this.solver.addClause(clause1);
            VecInt clause2 = new VecInt();
            clause2.push(2);
            clause2.push((-1));
            this.solver.addClause(clause2);
            VecInt clause3 = new VecInt();
            clause3.push(3);
            clause3.push((-2));
            this.solver.addClause(clause3);
            VecInt clause8 = new VecInt();
            clause8.push(2);
            clause8.push((-3));
            this.solver.addClause(clause8);
            VecInt clause4 = new VecInt();
            clause4.push((-4));
            clause4.push(1);
            this.solver.addClause(clause4);
            VecInt clause5 = new VecInt();
            clause5.push((-5));
            clause5.push(4);
            this.solver.addClause(clause5);
            VecInt clause6 = new VecInt();
            clause6.push((-6));
            clause6.push(4);
            this.solver.addClause(clause6);
            VecInt clause7 = new VecInt();
            clause7.push(5);
            clause7.push(6);
            clause7.push((-4));
            this.solver.addAtLeast(clause6, 1);
            this.solver.isSatisfiable();
            VecInt bound1 = new VecInt();
            bound1.push(3);
            this.solver.findModel(bound1);
            VecInt bound2 = new VecInt();
            bound2.push((-(Integer.MAX_VALUE)));
            this.solver.findModel(bound2);
            VecInt bound3 = new VecInt();
            bound3.push(5);
            bound3.push(3);
            this.solver.findModel(bound3);
            VecInt bound4 = new VecInt();
            bound4.push(5);
            bound4.push((-3));
            this.solver.findModel(bound4);
            VecInt bound5 = new VecInt();
            bound5.push(4);
            bound5.push((-3));
            this.solver.findModel(bound5);
            VecInt bound6 = new VecInt();
            bound6.push(4);
            bound6.push(3);
            this.solver.findModel(bound6);
            VecInt bound7 = new VecInt();
            bound7.push(4);
            int[] model = this.solver.findModel(bound7);
            Set<Integer> satisfiedModel = new HashSet<Integer>();
            for (int i : model) {
                satisfiedModel.add(new Integer(i));
            }
            satisfiedModel.contains(new Integer(4));
            satisfiedModel.contains(new Integer(1));
            satisfiedModel.contains(new Integer(2));
            org.junit.Assert.fail("testSimplePhoneSATSmalllitNum118 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSimplePhoneSATSmalllitNum154_failAssert16() throws Exception, ContradictionException, TimeoutException {
        try {
            VecInt clause0 = new VecInt();
            clause0.push(1);
            this.solver.addClause(clause0);
            VecInt clause1 = new VecInt();
            clause1.push(1);
            clause1.push((-2));
            this.solver.addClause(clause1);
            VecInt clause2 = new VecInt();
            clause2.push(2);
            clause2.push((-1));
            this.solver.addClause(clause2);
            VecInt clause3 = new VecInt();
            clause3.push(3);
            clause3.push((-2));
            this.solver.addClause(clause3);
            VecInt clause8 = new VecInt();
            clause8.push(2);
            clause8.push((-3));
            this.solver.addClause(clause8);
            VecInt clause4 = new VecInt();
            clause4.push((-4));
            clause4.push(1);
            this.solver.addClause(clause4);
            VecInt clause5 = new VecInt();
            clause5.push((-5));
            clause5.push(4);
            this.solver.addClause(clause5);
            VecInt clause6 = new VecInt();
            clause6.push((-6));
            clause6.push(4);
            this.solver.addClause(clause6);
            VecInt clause7 = new VecInt();
            clause7.push(5);
            clause7.push(6);
            clause7.push((-4));
            this.solver.addAtLeast(clause6, 1);
            this.solver.isSatisfiable();
            VecInt bound1 = new VecInt();
            bound1.push(3);
            this.solver.findModel(bound1);
            VecInt bound2 = new VecInt();
            bound2.push((-3));
            this.solver.findModel(bound2);
            VecInt bound3 = new VecInt();
            bound3.push(5);
            bound3.push(3);
            this.solver.findModel(bound3);
            VecInt bound4 = new VecInt();
            bound4.push(5);
            bound4.push((-3));
            this.solver.findModel(bound4);
            VecInt bound5 = new VecInt();
            bound5.push(4);
            bound5.push((-(Integer.MAX_VALUE)));
            this.solver.findModel(bound5);
            VecInt bound6 = new VecInt();
            bound6.push(4);
            bound6.push(3);
            this.solver.findModel(bound6);
            VecInt bound7 = new VecInt();
            bound7.push(4);
            int[] model = this.solver.findModel(bound7);
            Set<Integer> satisfiedModel = new HashSet<Integer>();
            for (int i : model) {
                satisfiedModel.add(new Integer(i));
            }
            satisfiedModel.contains(new Integer(4));
            satisfiedModel.contains(new Integer(1));
            satisfiedModel.contains(new Integer(2));
            org.junit.Assert.fail("testSimplePhoneSATSmalllitNum154 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSimplePhoneSATSmalllitNum142_failAssert19() throws Exception, ContradictionException, TimeoutException {
        try {
            VecInt clause0 = new VecInt();
            clause0.push(1);
            this.solver.addClause(clause0);
            VecInt clause1 = new VecInt();
            clause1.push(1);
            clause1.push((-2));
            this.solver.addClause(clause1);
            VecInt clause2 = new VecInt();
            clause2.push(2);
            clause2.push((-1));
            this.solver.addClause(clause2);
            VecInt clause3 = new VecInt();
            clause3.push(3);
            clause3.push((-2));
            this.solver.addClause(clause3);
            VecInt clause8 = new VecInt();
            clause8.push(2);
            clause8.push((-3));
            this.solver.addClause(clause8);
            VecInt clause4 = new VecInt();
            clause4.push((-4));
            clause4.push(1);
            this.solver.addClause(clause4);
            VecInt clause5 = new VecInt();
            clause5.push((-5));
            clause5.push(4);
            this.solver.addClause(clause5);
            VecInt clause6 = new VecInt();
            clause6.push((-6));
            clause6.push(4);
            this.solver.addClause(clause6);
            VecInt clause7 = new VecInt();
            clause7.push(5);
            clause7.push(6);
            clause7.push((-4));
            this.solver.addAtLeast(clause6, 1);
            this.solver.isSatisfiable();
            VecInt bound1 = new VecInt();
            bound1.push(3);
            this.solver.findModel(bound1);
            VecInt bound2 = new VecInt();
            bound2.push((-3));
            this.solver.findModel(bound2);
            VecInt bound3 = new VecInt();
            bound3.push(5);
            bound3.push(3);
            this.solver.findModel(bound3);
            VecInt bound4 = new VecInt();
            bound4.push(5);
            bound4.push((-(Integer.MAX_VALUE)));
            this.solver.findModel(bound4);
            VecInt bound5 = new VecInt();
            bound5.push(4);
            bound5.push((-3));
            this.solver.findModel(bound5);
            VecInt bound6 = new VecInt();
            bound6.push(4);
            bound6.push(3);
            this.solver.findModel(bound6);
            VecInt bound7 = new VecInt();
            bound7.push(4);
            int[] model = this.solver.findModel(bound7);
            Set<Integer> satisfiedModel = new HashSet<Integer>();
            for (int i : model) {
                satisfiedModel.add(new Integer(i));
            }
            satisfiedModel.contains(new Integer(4));
            satisfiedModel.contains(new Integer(1));
            satisfiedModel.contains(new Integer(2));
            org.junit.Assert.fail("testSimplePhoneSATSmalllitNum142 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSimplePhoneSATSmalllitNum48_failAssert21() throws Exception, ContradictionException, TimeoutException {
        try {
            VecInt clause0 = new VecInt();
            clause0.push(1);
            this.solver.addClause(clause0);
            VecInt clause1 = new VecInt();
            clause1.push(1);
            clause1.push((-2));
            this.solver.addClause(clause1);
            VecInt clause2 = new VecInt();
            clause2.push(2);
            clause2.push((-1));
            this.solver.addClause(clause2);
            VecInt clause3 = new VecInt();
            clause3.push(3);
            clause3.push((-2));
            this.solver.addClause(clause3);
            VecInt clause8 = new VecInt();
            clause8.push(2);
            clause8.push((-(Integer.MAX_VALUE)));
            this.solver.addClause(clause8);
            VecInt clause4 = new VecInt();
            clause4.push((-4));
            clause4.push(1);
            this.solver.addClause(clause4);
            VecInt clause5 = new VecInt();
            clause5.push((-5));
            clause5.push(4);
            this.solver.addClause(clause5);
            VecInt clause6 = new VecInt();
            clause6.push((-6));
            clause6.push(4);
            this.solver.addClause(clause6);
            VecInt clause7 = new VecInt();
            clause7.push(5);
            clause7.push(6);
            clause7.push((-4));
            this.solver.addAtLeast(clause6, 1);
            this.solver.isSatisfiable();
            VecInt bound1 = new VecInt();
            bound1.push(3);
            this.solver.findModel(bound1);
            VecInt bound2 = new VecInt();
            bound2.push((-3));
            this.solver.findModel(bound2);
            VecInt bound3 = new VecInt();
            bound3.push(5);
            bound3.push(3);
            this.solver.findModel(bound3);
            VecInt bound4 = new VecInt();
            bound4.push(5);
            bound4.push((-3));
            this.solver.findModel(bound4);
            VecInt bound5 = new VecInt();
            bound5.push(4);
            bound5.push((-3));
            this.solver.findModel(bound5);
            VecInt bound6 = new VecInt();
            bound6.push(4);
            bound6.push(3);
            this.solver.findModel(bound6);
            VecInt bound7 = new VecInt();
            bound7.push(4);
            int[] model = this.solver.findModel(bound7);
            Set<Integer> satisfiedModel = new HashSet<Integer>();
            for (int i : model) {
                satisfiedModel.add(new Integer(i));
            }
            satisfiedModel.contains(new Integer(4));
            satisfiedModel.contains(new Integer(1));
            satisfiedModel.contains(new Integer(2));
            org.junit.Assert.fail("testSimplePhoneSATSmalllitNum48 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSimplePhoneSATSmalllitNum77_failAssert23() throws Exception, ContradictionException, TimeoutException {
        try {
            VecInt clause0 = new VecInt();
            clause0.push(1);
            this.solver.addClause(clause0);
            VecInt clause1 = new VecInt();
            clause1.push(1);
            clause1.push((-2));
            this.solver.addClause(clause1);
            VecInt clause2 = new VecInt();
            clause2.push(2);
            clause2.push((-1));
            this.solver.addClause(clause2);
            VecInt clause3 = new VecInt();
            clause3.push(3);
            clause3.push((-2));
            this.solver.addClause(clause3);
            VecInt clause8 = new VecInt();
            clause8.push(2);
            clause8.push((-3));
            this.solver.addClause(clause8);
            VecInt clause4 = new VecInt();
            clause4.push((-4));
            clause4.push(1);
            this.solver.addClause(clause4);
            VecInt clause5 = new VecInt();
            clause5.push((-5));
            clause5.push(4);
            this.solver.addClause(clause5);
            VecInt clause6 = new VecInt();
            clause6.push((-(Integer.MAX_VALUE)));
            clause6.push(4);
            this.solver.addClause(clause6);
            VecInt clause7 = new VecInt();
            clause7.push(5);
            clause7.push(6);
            clause7.push((-4));
            this.solver.addAtLeast(clause6, 1);
            this.solver.isSatisfiable();
            VecInt bound1 = new VecInt();
            bound1.push(3);
            this.solver.findModel(bound1);
            VecInt bound2 = new VecInt();
            bound2.push((-3));
            this.solver.findModel(bound2);
            VecInt bound3 = new VecInt();
            bound3.push(5);
            bound3.push(3);
            this.solver.findModel(bound3);
            VecInt bound4 = new VecInt();
            bound4.push(5);
            bound4.push((-3));
            this.solver.findModel(bound4);
            VecInt bound5 = new VecInt();
            bound5.push(4);
            bound5.push((-3));
            this.solver.findModel(bound5);
            VecInt bound6 = new VecInt();
            bound6.push(4);
            bound6.push(3);
            this.solver.findModel(bound6);
            VecInt bound7 = new VecInt();
            bound7.push(4);
            int[] model = this.solver.findModel(bound7);
            Set<Integer> satisfiedModel = new HashSet<Integer>();
            for (int i : model) {
                satisfiedModel.add(new Integer(i));
            }
            satisfiedModel.contains(new Integer(4));
            satisfiedModel.contains(new Integer(1));
            satisfiedModel.contains(new Integer(2));
            org.junit.Assert.fail("testSimplePhoneSATSmalllitNum77 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSimplePhoneSATSmalllitNum25_failAssert26() throws Exception, ContradictionException, TimeoutException {
        try {
            VecInt clause0 = new VecInt();
            clause0.push(1);
            this.solver.addClause(clause0);
            VecInt clause1 = new VecInt();
            clause1.push(1);
            clause1.push((-2));
            this.solver.addClause(clause1);
            VecInt clause2 = new VecInt();
            clause2.push(2);
            clause2.push((-(Integer.MAX_VALUE)));
            this.solver.addClause(clause2);
            VecInt clause3 = new VecInt();
            clause3.push(3);
            clause3.push((-2));
            this.solver.addClause(clause3);
            VecInt clause8 = new VecInt();
            clause8.push(2);
            clause8.push((-3));
            this.solver.addClause(clause8);
            VecInt clause4 = new VecInt();
            clause4.push((-4));
            clause4.push(1);
            this.solver.addClause(clause4);
            VecInt clause5 = new VecInt();
            clause5.push((-5));
            clause5.push(4);
            this.solver.addClause(clause5);
            VecInt clause6 = new VecInt();
            clause6.push((-6));
            clause6.push(4);
            this.solver.addClause(clause6);
            VecInt clause7 = new VecInt();
            clause7.push(5);
            clause7.push(6);
            clause7.push((-4));
            this.solver.addAtLeast(clause6, 1);
            this.solver.isSatisfiable();
            VecInt bound1 = new VecInt();
            bound1.push(3);
            this.solver.findModel(bound1);
            VecInt bound2 = new VecInt();
            bound2.push((-3));
            this.solver.findModel(bound2);
            VecInt bound3 = new VecInt();
            bound3.push(5);
            bound3.push(3);
            this.solver.findModel(bound3);
            VecInt bound4 = new VecInt();
            bound4.push(5);
            bound4.push((-3));
            this.solver.findModel(bound4);
            VecInt bound5 = new VecInt();
            bound5.push(4);
            bound5.push((-3));
            this.solver.findModel(bound5);
            VecInt bound6 = new VecInt();
            bound6.push(4);
            bound6.push(3);
            this.solver.findModel(bound6);
            VecInt bound7 = new VecInt();
            bound7.push(4);
            int[] model = this.solver.findModel(bound7);
            Set<Integer> satisfiedModel = new HashSet<Integer>();
            for (int i : model) {
                satisfiedModel.add(new Integer(i));
            }
            satisfiedModel.contains(new Integer(4));
            satisfiedModel.contains(new Integer(1));
            satisfiedModel.contains(new Integer(2));
            org.junit.Assert.fail("testSimplePhoneSATSmalllitNum25 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSimplePhoneSATSmalllitNum65_failAssert28() throws Exception, ContradictionException, TimeoutException {
        try {
            VecInt clause0 = new VecInt();
            clause0.push(1);
            this.solver.addClause(clause0);
            VecInt clause1 = new VecInt();
            clause1.push(1);
            clause1.push((-2));
            this.solver.addClause(clause1);
            VecInt clause2 = new VecInt();
            clause2.push(2);
            clause2.push((-1));
            this.solver.addClause(clause2);
            VecInt clause3 = new VecInt();
            clause3.push(3);
            clause3.push((-2));
            this.solver.addClause(clause3);
            VecInt clause8 = new VecInt();
            clause8.push(2);
            clause8.push((-3));
            this.solver.addClause(clause8);
            VecInt clause4 = new VecInt();
            clause4.push((-4));
            clause4.push(1);
            this.solver.addClause(clause4);
            VecInt clause5 = new VecInt();
            clause5.push((-(Integer.MAX_VALUE)));
            clause5.push(4);
            this.solver.addClause(clause5);
            VecInt clause6 = new VecInt();
            clause6.push((-6));
            clause6.push(4);
            this.solver.addClause(clause6);
            VecInt clause7 = new VecInt();
            clause7.push(5);
            clause7.push(6);
            clause7.push((-4));
            this.solver.addAtLeast(clause6, 1);
            this.solver.isSatisfiable();
            VecInt bound1 = new VecInt();
            bound1.push(3);
            this.solver.findModel(bound1);
            VecInt bound2 = new VecInt();
            bound2.push((-3));
            this.solver.findModel(bound2);
            VecInt bound3 = new VecInt();
            bound3.push(5);
            bound3.push(3);
            this.solver.findModel(bound3);
            VecInt bound4 = new VecInt();
            bound4.push(5);
            bound4.push((-3));
            this.solver.findModel(bound4);
            VecInt bound5 = new VecInt();
            bound5.push(4);
            bound5.push((-3));
            this.solver.findModel(bound5);
            VecInt bound6 = new VecInt();
            bound6.push(4);
            bound6.push(3);
            this.solver.findModel(bound6);
            VecInt bound7 = new VecInt();
            bound7.push(4);
            int[] model = this.solver.findModel(bound7);
            Set<Integer> satisfiedModel = new HashSet<Integer>();
            for (int i : model) {
                satisfiedModel.add(new Integer(i));
            }
            satisfiedModel.contains(new Integer(4));
            satisfiedModel.contains(new Integer(1));
            satisfiedModel.contains(new Integer(2));
            org.junit.Assert.fail("testSimplePhoneSATSmalllitNum65 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSimplePhoneSATSmalllitNum13_failAssert33() throws Exception, ContradictionException, TimeoutException {
        try {
            VecInt clause0 = new VecInt();
            clause0.push(1);
            this.solver.addClause(clause0);
            VecInt clause1 = new VecInt();
            clause1.push(1);
            clause1.push((-(Integer.MAX_VALUE)));
            this.solver.addClause(clause1);
            VecInt clause2 = new VecInt();
            clause2.push(2);
            clause2.push((-1));
            this.solver.addClause(clause2);
            VecInt clause3 = new VecInt();
            clause3.push(3);
            clause3.push((-2));
            this.solver.addClause(clause3);
            VecInt clause8 = new VecInt();
            clause8.push(2);
            clause8.push((-3));
            this.solver.addClause(clause8);
            VecInt clause4 = new VecInt();
            clause4.push((-4));
            clause4.push(1);
            this.solver.addClause(clause4);
            VecInt clause5 = new VecInt();
            clause5.push((-5));
            clause5.push(4);
            this.solver.addClause(clause5);
            VecInt clause6 = new VecInt();
            clause6.push((-6));
            clause6.push(4);
            this.solver.addClause(clause6);
            VecInt clause7 = new VecInt();
            clause7.push(5);
            clause7.push(6);
            clause7.push((-4));
            this.solver.addAtLeast(clause6, 1);
            this.solver.isSatisfiable();
            VecInt bound1 = new VecInt();
            bound1.push(3);
            this.solver.findModel(bound1);
            VecInt bound2 = new VecInt();
            bound2.push((-3));
            this.solver.findModel(bound2);
            VecInt bound3 = new VecInt();
            bound3.push(5);
            bound3.push(3);
            this.solver.findModel(bound3);
            VecInt bound4 = new VecInt();
            bound4.push(5);
            bound4.push((-3));
            this.solver.findModel(bound4);
            VecInt bound5 = new VecInt();
            bound5.push(4);
            bound5.push((-3));
            this.solver.findModel(bound5);
            VecInt bound6 = new VecInt();
            bound6.push(4);
            bound6.push(3);
            this.solver.findModel(bound6);
            VecInt bound7 = new VecInt();
            bound7.push(4);
            int[] model = this.solver.findModel(bound7);
            Set<Integer> satisfiedModel = new HashSet<Integer>();
            for (int i : model) {
                satisfiedModel.add(new Integer(i));
            }
            satisfiedModel.contains(new Integer(4));
            satisfiedModel.contains(new Integer(1));
            satisfiedModel.contains(new Integer(2));
            org.junit.Assert.fail("testSimplePhoneSATSmalllitNum13 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSimplePhoneSATSmalllitNum14_failAssert34() throws Exception, ContradictionException, TimeoutException {
        try {
            VecInt clause0 = new VecInt();
            clause0.push(1);
            this.solver.addClause(clause0);
            VecInt clause1 = new VecInt();
            clause1.push(1);
            clause1.push((-(Integer.MIN_VALUE)));
            this.solver.addClause(clause1);
            VecInt clause2 = new VecInt();
            clause2.push(2);
            clause2.push((-1));
            this.solver.addClause(clause2);
            VecInt clause3 = new VecInt();
            clause3.push(3);
            clause3.push((-2));
            this.solver.addClause(clause3);
            VecInt clause8 = new VecInt();
            clause8.push(2);
            clause8.push((-3));
            this.solver.addClause(clause8);
            VecInt clause4 = new VecInt();
            clause4.push((-4));
            clause4.push(1);
            this.solver.addClause(clause4);
            VecInt clause5 = new VecInt();
            clause5.push((-5));
            clause5.push(4);
            this.solver.addClause(clause5);
            VecInt clause6 = new VecInt();
            clause6.push((-6));
            clause6.push(4);
            this.solver.addClause(clause6);
            VecInt clause7 = new VecInt();
            clause7.push(5);
            clause7.push(6);
            clause7.push((-4));
            this.solver.addAtLeast(clause6, 1);
            this.solver.isSatisfiable();
            VecInt bound1 = new VecInt();
            bound1.push(3);
            this.solver.findModel(bound1);
            VecInt bound2 = new VecInt();
            bound2.push((-3));
            this.solver.findModel(bound2);
            VecInt bound3 = new VecInt();
            bound3.push(5);
            bound3.push(3);
            this.solver.findModel(bound3);
            VecInt bound4 = new VecInt();
            bound4.push(5);
            bound4.push((-3));
            this.solver.findModel(bound4);
            VecInt bound5 = new VecInt();
            bound5.push(4);
            bound5.push((-3));
            this.solver.findModel(bound5);
            VecInt bound6 = new VecInt();
            bound6.push(4);
            bound6.push(3);
            this.solver.findModel(bound6);
            VecInt bound7 = new VecInt();
            bound7.push(4);
            int[] model = this.solver.findModel(bound7);
            Set<Integer> satisfiedModel = new HashSet<Integer>();
            for (int i : model) {
                satisfiedModel.add(new Integer(i));
            }
            satisfiedModel.contains(new Integer(4));
            satisfiedModel.contains(new Integer(1));
            satisfiedModel.contains(new Integer(2));
            org.junit.Assert.fail("testSimplePhoneSATSmalllitNum14 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-2147483648", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSimplePhoneSATSmalllitNum166_failAssert35() throws Exception, ContradictionException, TimeoutException {
        try {
            VecInt clause0 = new VecInt();
            clause0.push(1);
            this.solver.addClause(clause0);
            VecInt clause1 = new VecInt();
            clause1.push(1);
            clause1.push((-2));
            this.solver.addClause(clause1);
            VecInt clause2 = new VecInt();
            clause2.push(2);
            clause2.push((-1));
            this.solver.addClause(clause2);
            VecInt clause3 = new VecInt();
            clause3.push(3);
            clause3.push((-2));
            this.solver.addClause(clause3);
            VecInt clause8 = new VecInt();
            clause8.push(2);
            clause8.push((-3));
            this.solver.addClause(clause8);
            VecInt clause4 = new VecInt();
            clause4.push((-4));
            clause4.push(1);
            this.solver.addClause(clause4);
            VecInt clause5 = new VecInt();
            clause5.push((-5));
            clause5.push(4);
            this.solver.addClause(clause5);
            VecInt clause6 = new VecInt();
            clause6.push((-6));
            clause6.push(4);
            this.solver.addClause(clause6);
            VecInt clause7 = new VecInt();
            clause7.push(5);
            clause7.push(6);
            clause7.push((-4));
            this.solver.addAtLeast(clause6, 1);
            this.solver.isSatisfiable();
            VecInt bound1 = new VecInt();
            bound1.push(3);
            this.solver.findModel(bound1);
            VecInt bound2 = new VecInt();
            bound2.push((-3));
            this.solver.findModel(bound2);
            VecInt bound3 = new VecInt();
            bound3.push(5);
            bound3.push(3);
            this.solver.findModel(bound3);
            VecInt bound4 = new VecInt();
            bound4.push(5);
            bound4.push((-3));
            this.solver.findModel(bound4);
            VecInt bound5 = new VecInt();
            bound5.push(4);
            bound5.push((-3));
            this.solver.findModel(bound5);
            VecInt bound6 = new VecInt();
            bound6.push(4);
            bound6.push(Integer.MAX_VALUE);
            this.solver.findModel(bound6);
            VecInt bound7 = new VecInt();
            bound7.push(4);
            int[] model = this.solver.findModel(bound7);
            Set<Integer> satisfiedModel = new HashSet<Integer>();
            for (int i : model) {
                satisfiedModel.add(new Integer(i));
            }
            satisfiedModel.contains(new Integer(4));
            satisfiedModel.contains(new Integer(1));
            satisfiedModel.contains(new Integer(2));
            org.junit.Assert.fail("testSimplePhoneSATSmalllitNum166 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSimplePhoneSATSmalllitNum107_failAssert39() throws Exception, ContradictionException, TimeoutException {
        try {
            VecInt clause0 = new VecInt();
            clause0.push(1);
            this.solver.addClause(clause0);
            VecInt clause1 = new VecInt();
            clause1.push(1);
            clause1.push((-2));
            this.solver.addClause(clause1);
            VecInt clause2 = new VecInt();
            clause2.push(2);
            clause2.push((-1));
            this.solver.addClause(clause2);
            VecInt clause3 = new VecInt();
            clause3.push(3);
            clause3.push((-2));
            this.solver.addClause(clause3);
            VecInt clause8 = new VecInt();
            clause8.push(2);
            clause8.push((-3));
            this.solver.addClause(clause8);
            VecInt clause4 = new VecInt();
            clause4.push((-4));
            clause4.push(1);
            this.solver.addClause(clause4);
            VecInt clause5 = new VecInt();
            clause5.push((-5));
            clause5.push(4);
            this.solver.addClause(clause5);
            VecInt clause6 = new VecInt();
            clause6.push((-6));
            clause6.push(4);
            this.solver.addClause(clause6);
            VecInt clause7 = new VecInt();
            clause7.push(5);
            clause7.push(6);
            clause7.push((-4));
            this.solver.addAtLeast(clause6, Integer.MAX_VALUE);
            this.solver.isSatisfiable();
            VecInt bound1 = new VecInt();
            bound1.push(3);
            this.solver.findModel(bound1);
            VecInt bound2 = new VecInt();
            bound2.push((-3));
            this.solver.findModel(bound2);
            VecInt bound3 = new VecInt();
            bound3.push(5);
            bound3.push(3);
            this.solver.findModel(bound3);
            VecInt bound4 = new VecInt();
            bound4.push(5);
            bound4.push((-3));
            this.solver.findModel(bound4);
            VecInt bound5 = new VecInt();
            bound5.push(4);
            bound5.push((-3));
            this.solver.findModel(bound5);
            VecInt bound6 = new VecInt();
            bound6.push(4);
            bound6.push(3);
            this.solver.findModel(bound6);
            VecInt bound7 = new VecInt();
            bound7.push(4);
            int[] model = this.solver.findModel(bound7);
            Set<Integer> satisfiedModel = new HashSet<Integer>();
            for (int i : model) {
                satisfiedModel.add(new Integer(i));
            }
            satisfiedModel.contains(new Integer(4));
            satisfiedModel.contains(new Integer(1));
            satisfiedModel.contains(new Integer(2));
            org.junit.Assert.fail("testSimplePhoneSATSmalllitNum107 should have thrown ContradictionException");
        } catch (ContradictionException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSimplePhoneSATSmalllitNum124_failAssert45() throws Exception, ContradictionException, TimeoutException {
        try {
            VecInt clause0 = new VecInt();
            clause0.push(1);
            this.solver.addClause(clause0);
            VecInt clause1 = new VecInt();
            clause1.push(1);
            clause1.push((-2));
            this.solver.addClause(clause1);
            VecInt clause2 = new VecInt();
            clause2.push(2);
            clause2.push((-1));
            this.solver.addClause(clause2);
            VecInt clause3 = new VecInt();
            clause3.push(3);
            clause3.push((-2));
            this.solver.addClause(clause3);
            VecInt clause8 = new VecInt();
            clause8.push(2);
            clause8.push((-3));
            this.solver.addClause(clause8);
            VecInt clause4 = new VecInt();
            clause4.push((-4));
            clause4.push(1);
            this.solver.addClause(clause4);
            VecInt clause5 = new VecInt();
            clause5.push((-5));
            clause5.push(4);
            this.solver.addClause(clause5);
            VecInt clause6 = new VecInt();
            clause6.push((-6));
            clause6.push(4);
            this.solver.addClause(clause6);
            VecInt clause7 = new VecInt();
            clause7.push(5);
            clause7.push(6);
            clause7.push((-4));
            this.solver.addAtLeast(clause6, 1);
            this.solver.isSatisfiable();
            VecInt bound1 = new VecInt();
            bound1.push(3);
            this.solver.findModel(bound1);
            VecInt bound2 = new VecInt();
            bound2.push((-3));
            this.solver.findModel(bound2);
            VecInt bound3 = new VecInt();
            bound3.push(Integer.MAX_VALUE);
            bound3.push(3);
            this.solver.findModel(bound3);
            VecInt bound4 = new VecInt();
            bound4.push(5);
            bound4.push((-3));
            this.solver.findModel(bound4);
            VecInt bound5 = new VecInt();
            bound5.push(4);
            bound5.push((-3));
            this.solver.findModel(bound5);
            VecInt bound6 = new VecInt();
            bound6.push(4);
            bound6.push(3);
            this.solver.findModel(bound6);
            VecInt bound7 = new VecInt();
            bound7.push(4);
            int[] model = this.solver.findModel(bound7);
            Set<Integer> satisfiedModel = new HashSet<Integer>();
            for (int i : model) {
                satisfiedModel.add(new Integer(i));
            }
            satisfiedModel.contains(new Integer(4));
            satisfiedModel.contains(new Integer(1));
            satisfiedModel.contains(new Integer(2));
            org.junit.Assert.fail("testSimplePhoneSATSmalllitNum124 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSimplePhoneSATSmalllitNum112_failAssert47() throws Exception, ContradictionException, TimeoutException {
        try {
            VecInt clause0 = new VecInt();
            clause0.push(1);
            this.solver.addClause(clause0);
            VecInt clause1 = new VecInt();
            clause1.push(1);
            clause1.push((-2));
            this.solver.addClause(clause1);
            VecInt clause2 = new VecInt();
            clause2.push(2);
            clause2.push((-1));
            this.solver.addClause(clause2);
            VecInt clause3 = new VecInt();
            clause3.push(3);
            clause3.push((-2));
            this.solver.addClause(clause3);
            VecInt clause8 = new VecInt();
            clause8.push(2);
            clause8.push((-3));
            this.solver.addClause(clause8);
            VecInt clause4 = new VecInt();
            clause4.push((-4));
            clause4.push(1);
            this.solver.addClause(clause4);
            VecInt clause5 = new VecInt();
            clause5.push((-5));
            clause5.push(4);
            this.solver.addClause(clause5);
            VecInt clause6 = new VecInt();
            clause6.push((-6));
            clause6.push(4);
            this.solver.addClause(clause6);
            VecInt clause7 = new VecInt();
            clause7.push(5);
            clause7.push(6);
            clause7.push((-4));
            this.solver.addAtLeast(clause6, 1);
            this.solver.isSatisfiable();
            VecInt bound1 = new VecInt();
            bound1.push(Integer.MAX_VALUE);
            this.solver.findModel(bound1);
            VecInt bound2 = new VecInt();
            bound2.push((-3));
            this.solver.findModel(bound2);
            VecInt bound3 = new VecInt();
            bound3.push(5);
            bound3.push(3);
            this.solver.findModel(bound3);
            VecInt bound4 = new VecInt();
            bound4.push(5);
            bound4.push((-3));
            this.solver.findModel(bound4);
            VecInt bound5 = new VecInt();
            bound5.push(4);
            bound5.push((-3));
            this.solver.findModel(bound5);
            VecInt bound6 = new VecInt();
            bound6.push(4);
            bound6.push(3);
            this.solver.findModel(bound6);
            VecInt bound7 = new VecInt();
            bound7.push(4);
            int[] model = this.solver.findModel(bound7);
            Set<Integer> satisfiedModel = new HashSet<Integer>();
            for (int i : model) {
                satisfiedModel.add(new Integer(i));
            }
            satisfiedModel.contains(new Integer(4));
            satisfiedModel.contains(new Integer(1));
            satisfiedModel.contains(new Integer(2));
            org.junit.Assert.fail("testSimplePhoneSATSmalllitNum112 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSimplePhoneSATSmalllitNum3_failAssert66() throws Exception, ContradictionException, TimeoutException {
        try {
            VecInt clause0 = new VecInt();
            clause0.push(Integer.MAX_VALUE);
            this.solver.addClause(clause0);
            VecInt clause1 = new VecInt();
            clause1.push(1);
            clause1.push((-2));
            this.solver.addClause(clause1);
            VecInt clause2 = new VecInt();
            clause2.push(2);
            clause2.push((-1));
            this.solver.addClause(clause2);
            VecInt clause3 = new VecInt();
            clause3.push(3);
            clause3.push((-2));
            this.solver.addClause(clause3);
            VecInt clause8 = new VecInt();
            clause8.push(2);
            clause8.push((-3));
            this.solver.addClause(clause8);
            VecInt clause4 = new VecInt();
            clause4.push((-4));
            clause4.push(1);
            this.solver.addClause(clause4);
            VecInt clause5 = new VecInt();
            clause5.push((-5));
            clause5.push(4);
            this.solver.addClause(clause5);
            VecInt clause6 = new VecInt();
            clause6.push((-6));
            clause6.push(4);
            this.solver.addClause(clause6);
            VecInt clause7 = new VecInt();
            clause7.push(5);
            clause7.push(6);
            clause7.push((-4));
            this.solver.addAtLeast(clause6, 1);
            this.solver.isSatisfiable();
            VecInt bound1 = new VecInt();
            bound1.push(3);
            this.solver.findModel(bound1);
            VecInt bound2 = new VecInt();
            bound2.push((-3));
            this.solver.findModel(bound2);
            VecInt bound3 = new VecInt();
            bound3.push(5);
            bound3.push(3);
            this.solver.findModel(bound3);
            VecInt bound4 = new VecInt();
            bound4.push(5);
            bound4.push((-3));
            this.solver.findModel(bound4);
            VecInt bound5 = new VecInt();
            bound5.push(4);
            bound5.push((-3));
            this.solver.findModel(bound5);
            VecInt bound6 = new VecInt();
            bound6.push(4);
            bound6.push(3);
            this.solver.findModel(bound6);
            VecInt bound7 = new VecInt();
            bound7.push(4);
            int[] model = this.solver.findModel(bound7);
            Set<Integer> satisfiedModel = new HashSet<Integer>();
            for (int i : model) {
                satisfiedModel.add(new Integer(i));
            }
            satisfiedModel.contains(new Integer(4));
            satisfiedModel.contains(new Integer(1));
            satisfiedModel.contains(new Integer(2));
            org.junit.Assert.fail("testSimplePhoneSATSmalllitNum3 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSimplePhoneSATSmalllitNum107_failAssert39litNum8003_failAssert68() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                VecInt clause0 = new VecInt();
                clause0.push(1);
                this.solver.addClause(clause0);
                VecInt clause1 = new VecInt();
                clause1.push(1);
                clause1.push((-2));
                this.solver.addClause(clause1);
                VecInt clause2 = new VecInt();
                clause2.push(2);
                clause2.push((-1));
                this.solver.addClause(clause2);
                VecInt clause3 = new VecInt();
                clause3.push(3);
                clause3.push((-2));
                this.solver.addClause(clause3);
                VecInt clause8 = new VecInt();
                clause8.push(2);
                clause8.push((-3));
                this.solver.addClause(clause8);
                VecInt clause4 = new VecInt();
                clause4.push((-4));
                clause4.push(1);
                this.solver.addClause(clause4);
                VecInt clause5 = new VecInt();
                clause5.push((-5));
                clause5.push(4);
                this.solver.addClause(clause5);
                VecInt clause6 = new VecInt();
                clause6.push((-6));
                clause6.push(4);
                this.solver.addClause(clause6);
                VecInt clause7 = new VecInt();
                clause7.push(5);
                clause7.push(6);
                clause7.push((-4));
                this.solver.addAtLeast(clause6, Integer.MAX_VALUE);
                this.solver.isSatisfiable();
                VecInt bound1 = new VecInt();
                bound1.push(3);
                this.solver.findModel(bound1);
                VecInt bound2 = new VecInt();
                bound2.push((-3));
                this.solver.findModel(bound2);
                VecInt bound3 = new VecInt();
                bound3.push(5);
                bound3.push(3);
                this.solver.findModel(bound3);
                VecInt bound4 = new VecInt();
                bound4.push(5);
                bound4.push((-3));
                this.solver.findModel(bound4);
                VecInt bound5 = new VecInt();
                bound5.push(4);
                bound5.push((-3));
                this.solver.findModel(bound5);
                VecInt bound6 = new VecInt();
                bound6.push(4);
                bound6.push(3);
                this.solver.findModel(bound6);
                VecInt bound7 = new VecInt();
                bound7.push(4);
                int[] model = this.solver.findModel(bound7);
                Set<Integer> satisfiedModel = new HashSet<Integer>();
                for (int i : model) {
                    satisfiedModel.add(new Integer(i));
                }
                satisfiedModel.contains(new Integer(0));
                satisfiedModel.contains(new Integer(1));
                satisfiedModel.contains(new Integer(2));
                org.junit.Assert.fail("testSimplePhoneSATSmalllitNum107 should have thrown ContradictionException");
            }
            org.junit.Assert.fail("testSimplePhoneSATSmalllitNum107_failAssert39litNum8003 should have thrown ContradictionException");
        } catch (ContradictionException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSimplePhoneSATSmalllitNum3_failAssert66litNum9910_failAssert69() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                VecInt clause0 = new VecInt();
                clause0.push(Integer.MAX_VALUE);
                this.solver.addClause(clause0);
                VecInt clause1 = new VecInt();
                clause1.push(1);
                clause1.push((-2));
                this.solver.addClause(clause1);
                VecInt clause2 = new VecInt();
                clause2.push(2);
                clause2.push((-1));
                this.solver.addClause(clause2);
                VecInt clause3 = new VecInt();
                clause3.push(3);
                clause3.push((-2));
                this.solver.addClause(clause3);
                VecInt clause8 = new VecInt();
                clause8.push(2);
                clause8.push((-3));
                this.solver.addClause(clause8);
                VecInt clause4 = new VecInt();
                clause4.push((-4));
                clause4.push(1);
                this.solver.addClause(clause4);
                VecInt clause5 = new VecInt();
                clause5.push((-5));
                clause5.push(4);
                this.solver.addClause(clause5);
                VecInt clause6 = new VecInt();
                clause6.push((-6));
                clause6.push(4);
                this.solver.addClause(clause6);
                VecInt clause7 = new VecInt();
                clause7.push(5);
                clause7.push(6);
                clause7.push((-0));
                this.solver.addAtLeast(clause6, 1);
                this.solver.isSatisfiable();
                VecInt bound1 = new VecInt();
                bound1.push(3);
                this.solver.findModel(bound1);
                VecInt bound2 = new VecInt();
                bound2.push((-3));
                this.solver.findModel(bound2);
                VecInt bound3 = new VecInt();
                bound3.push(5);
                bound3.push(3);
                this.solver.findModel(bound3);
                VecInt bound4 = new VecInt();
                bound4.push(5);
                bound4.push((-3));
                this.solver.findModel(bound4);
                VecInt bound5 = new VecInt();
                bound5.push(4);
                bound5.push((-3));
                this.solver.findModel(bound5);
                VecInt bound6 = new VecInt();
                bound6.push(4);
                bound6.push(3);
                this.solver.findModel(bound6);
                VecInt bound7 = new VecInt();
                bound7.push(4);
                int[] model = this.solver.findModel(bound7);
                Set<Integer> satisfiedModel = new HashSet<Integer>();
                for (int i : model) {
                    satisfiedModel.add(new Integer(i));
                }
                satisfiedModel.contains(new Integer(4));
                satisfiedModel.contains(new Integer(1));
                satisfiedModel.contains(new Integer(2));
                org.junit.Assert.fail("testSimplePhoneSATSmalllitNum3 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testSimplePhoneSATSmalllitNum3_failAssert66litNum9910 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSimplePhoneSATSmalllitNum107_failAssert39litNum7502_failAssert72() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                VecInt clause0 = new VecInt();
                clause0.push(1);
                this.solver.addClause(clause0);
                VecInt clause1 = new VecInt();
                clause1.push(1);
                clause1.push((-2));
                this.solver.addClause(clause1);
                VecInt clause2 = new VecInt();
                clause2.push(2);
                clause2.push((-1));
                this.solver.addClause(clause2);
                VecInt clause3 = new VecInt();
                clause3.push(3);
                clause3.push((-2));
                this.solver.addClause(clause3);
                VecInt clause8 = new VecInt();
                clause8.push(2);
                clause8.push((-0));
                this.solver.addClause(clause8);
                VecInt clause4 = new VecInt();
                clause4.push((-4));
                clause4.push(1);
                this.solver.addClause(clause4);
                VecInt clause5 = new VecInt();
                clause5.push((-5));
                clause5.push(4);
                this.solver.addClause(clause5);
                VecInt clause6 = new VecInt();
                clause6.push((-6));
                clause6.push(4);
                this.solver.addClause(clause6);
                VecInt clause7 = new VecInt();
                clause7.push(5);
                clause7.push(6);
                clause7.push((-4));
                this.solver.addAtLeast(clause6, Integer.MAX_VALUE);
                this.solver.isSatisfiable();
                VecInt bound1 = new VecInt();
                bound1.push(3);
                this.solver.findModel(bound1);
                VecInt bound2 = new VecInt();
                bound2.push((-3));
                this.solver.findModel(bound2);
                VecInt bound3 = new VecInt();
                bound3.push(5);
                bound3.push(3);
                this.solver.findModel(bound3);
                VecInt bound4 = new VecInt();
                bound4.push(5);
                bound4.push((-3));
                this.solver.findModel(bound4);
                VecInt bound5 = new VecInt();
                bound5.push(4);
                bound5.push((-3));
                this.solver.findModel(bound5);
                VecInt bound6 = new VecInt();
                bound6.push(4);
                bound6.push(3);
                this.solver.findModel(bound6);
                VecInt bound7 = new VecInt();
                bound7.push(4);
                int[] model = this.solver.findModel(bound7);
                Set<Integer> satisfiedModel = new HashSet<Integer>();
                for (int i : model) {
                    satisfiedModel.add(new Integer(i));
                }
                satisfiedModel.contains(new Integer(4));
                satisfiedModel.contains(new Integer(1));
                satisfiedModel.contains(new Integer(2));
                org.junit.Assert.fail("testSimplePhoneSATSmalllitNum107 should have thrown ContradictionException");
            }
            org.junit.Assert.fail("testSimplePhoneSATSmalllitNum107_failAssert39litNum7502 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSimplePhoneSATSmalllitNum107_failAssert39litNum7323_failAssert90() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                VecInt clause0 = new VecInt();
                clause0.push(0);
                this.solver.addClause(clause0);
                VecInt clause1 = new VecInt();
                clause1.push(1);
                clause1.push((-2));
                this.solver.addClause(clause1);
                VecInt clause2 = new VecInt();
                clause2.push(2);
                clause2.push((-1));
                this.solver.addClause(clause2);
                VecInt clause3 = new VecInt();
                clause3.push(3);
                clause3.push((-2));
                this.solver.addClause(clause3);
                VecInt clause8 = new VecInt();
                clause8.push(2);
                clause8.push((-3));
                this.solver.addClause(clause8);
                VecInt clause4 = new VecInt();
                clause4.push((-4));
                clause4.push(1);
                this.solver.addClause(clause4);
                VecInt clause5 = new VecInt();
                clause5.push((-5));
                clause5.push(4);
                this.solver.addClause(clause5);
                VecInt clause6 = new VecInt();
                clause6.push((-6));
                clause6.push(4);
                this.solver.addClause(clause6);
                VecInt clause7 = new VecInt();
                clause7.push(5);
                clause7.push(6);
                clause7.push((-4));
                this.solver.addAtLeast(clause6, Integer.MAX_VALUE);
                this.solver.isSatisfiable();
                VecInt bound1 = new VecInt();
                bound1.push(3);
                this.solver.findModel(bound1);
                VecInt bound2 = new VecInt();
                bound2.push((-3));
                this.solver.findModel(bound2);
                VecInt bound3 = new VecInt();
                bound3.push(5);
                bound3.push(3);
                this.solver.findModel(bound3);
                VecInt bound4 = new VecInt();
                bound4.push(5);
                bound4.push((-3));
                this.solver.findModel(bound4);
                VecInt bound5 = new VecInt();
                bound5.push(4);
                bound5.push((-3));
                this.solver.findModel(bound5);
                VecInt bound6 = new VecInt();
                bound6.push(4);
                bound6.push(3);
                this.solver.findModel(bound6);
                VecInt bound7 = new VecInt();
                bound7.push(4);
                int[] model = this.solver.findModel(bound7);
                Set<Integer> satisfiedModel = new HashSet<Integer>();
                for (int i : model) {
                    satisfiedModel.add(new Integer(i));
                }
                satisfiedModel.contains(new Integer(4));
                satisfiedModel.contains(new Integer(1));
                satisfiedModel.contains(new Integer(2));
                org.junit.Assert.fail("testSimplePhoneSATSmalllitNum107 should have thrown ContradictionException");
            }
            org.junit.Assert.fail("testSimplePhoneSATSmalllitNum107_failAssert39litNum7323 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSimplePhoneSATSmalllitNum107_failAssert39litNum7402_failAssert91() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                VecInt clause0 = new VecInt();
                clause0.push(1);
                this.solver.addClause(clause0);
                VecInt clause1 = new VecInt();
                clause1.push(1);
                clause1.push((-2));
                this.solver.addClause(clause1);
                VecInt clause2 = new VecInt();
                clause2.push(2);
                clause2.push((-2));
                this.solver.addClause(clause2);
                VecInt clause3 = new VecInt();
                clause3.push(3);
                clause3.push((-2));
                this.solver.addClause(clause3);
                VecInt clause8 = new VecInt();
                clause8.push(2);
                clause8.push((-3));
                this.solver.addClause(clause8);
                VecInt clause4 = new VecInt();
                clause4.push((-4));
                clause4.push(1);
                this.solver.addClause(clause4);
                VecInt clause5 = new VecInt();
                clause5.push((-5));
                clause5.push(4);
                this.solver.addClause(clause5);
                VecInt clause6 = new VecInt();
                clause6.push((-6));
                clause6.push(4);
                this.solver.addClause(clause6);
                VecInt clause7 = new VecInt();
                clause7.push(5);
                clause7.push(6);
                clause7.push((-4));
                this.solver.addAtLeast(clause6, Integer.MAX_VALUE);
                this.solver.isSatisfiable();
                VecInt bound1 = new VecInt();
                bound1.push(3);
                this.solver.findModel(bound1);
                VecInt bound2 = new VecInt();
                bound2.push((-3));
                this.solver.findModel(bound2);
                VecInt bound3 = new VecInt();
                bound3.push(5);
                bound3.push(3);
                this.solver.findModel(bound3);
                VecInt bound4 = new VecInt();
                bound4.push(5);
                bound4.push((-3));
                this.solver.findModel(bound4);
                VecInt bound5 = new VecInt();
                bound5.push(4);
                bound5.push((-3));
                this.solver.findModel(bound5);
                VecInt bound6 = new VecInt();
                bound6.push(4);
                bound6.push(3);
                this.solver.findModel(bound6);
                VecInt bound7 = new VecInt();
                bound7.push(4);
                int[] model = this.solver.findModel(bound7);
                Set<Integer> satisfiedModel = new HashSet<Integer>();
                for (int i : model) {
                    satisfiedModel.add(new Integer(i));
                }
                satisfiedModel.contains(new Integer(4));
                satisfiedModel.contains(new Integer(1));
                satisfiedModel.contains(new Integer(2));
                org.junit.Assert.fail("testSimplePhoneSATSmalllitNum107 should have thrown ContradictionException");
            }
            org.junit.Assert.fail("testSimplePhoneSATSmalllitNum107_failAssert39litNum7402 should have thrown ContradictionException");
        } catch (ContradictionException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSimplePhoneSATSmalllitNum107_failAssert39litNum7420_failAssert92() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                VecInt clause0 = new VecInt();
                clause0.push(1);
                this.solver.addClause(clause0);
                VecInt clause1 = new VecInt();
                clause1.push(1);
                clause1.push((-2));
                this.solver.addClause(clause1);
                VecInt clause2 = new VecInt();
                clause2.push(2);
                clause2.push((-1));
                this.solver.addClause(clause2);
                VecInt clause3 = new VecInt();
                clause3.push(4);
                clause3.push((-2));
                this.solver.addClause(clause3);
                VecInt clause8 = new VecInt();
                clause8.push(2);
                clause8.push((-3));
                this.solver.addClause(clause8);
                VecInt clause4 = new VecInt();
                clause4.push((-4));
                clause4.push(1);
                this.solver.addClause(clause4);
                VecInt clause5 = new VecInt();
                clause5.push((-5));
                clause5.push(4);
                this.solver.addClause(clause5);
                VecInt clause6 = new VecInt();
                clause6.push((-6));
                clause6.push(4);
                this.solver.addClause(clause6);
                VecInt clause7 = new VecInt();
                clause7.push(5);
                clause7.push(6);
                clause7.push((-4));
                this.solver.addAtLeast(clause6, Integer.MAX_VALUE);
                this.solver.isSatisfiable();
                VecInt bound1 = new VecInt();
                bound1.push(3);
                this.solver.findModel(bound1);
                VecInt bound2 = new VecInt();
                bound2.push((-3));
                this.solver.findModel(bound2);
                VecInt bound3 = new VecInt();
                bound3.push(5);
                bound3.push(3);
                this.solver.findModel(bound3);
                VecInt bound4 = new VecInt();
                bound4.push(5);
                bound4.push((-3));
                this.solver.findModel(bound4);
                VecInt bound5 = new VecInt();
                bound5.push(4);
                bound5.push((-3));
                this.solver.findModel(bound5);
                VecInt bound6 = new VecInt();
                bound6.push(4);
                bound6.push(3);
                this.solver.findModel(bound6);
                VecInt bound7 = new VecInt();
                bound7.push(4);
                int[] model = this.solver.findModel(bound7);
                Set<Integer> satisfiedModel = new HashSet<Integer>();
                for (int i : model) {
                    satisfiedModel.add(new Integer(i));
                }
                satisfiedModel.contains(new Integer(4));
                satisfiedModel.contains(new Integer(1));
                satisfiedModel.contains(new Integer(2));
                org.junit.Assert.fail("testSimplePhoneSATSmalllitNum107 should have thrown ContradictionException");
            }
            org.junit.Assert.fail("testSimplePhoneSATSmalllitNum107_failAssert39litNum7420 should have thrown ContradictionException");
        } catch (ContradictionException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSimplePhoneSATSmalllitNum107_failAssert39litNum7524_failAssert93() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                VecInt clause0 = new VecInt();
                clause0.push(1);
                this.solver.addClause(clause0);
                VecInt clause1 = new VecInt();
                clause1.push(1);
                clause1.push((-2));
                this.solver.addClause(clause1);
                VecInt clause2 = new VecInt();
                clause2.push(2);
                clause2.push((-1));
                this.solver.addClause(clause2);
                VecInt clause3 = new VecInt();
                clause3.push(3);
                clause3.push((-2));
                this.solver.addClause(clause3);
                VecInt clause8 = new VecInt();
                clause8.push(2);
                clause8.push((-3));
                this.solver.addClause(clause8);
                VecInt clause4 = new VecInt();
                clause4.push((-0));
                clause4.push(1);
                this.solver.addClause(clause4);
                VecInt clause5 = new VecInt();
                clause5.push((-5));
                clause5.push(4);
                this.solver.addClause(clause5);
                VecInt clause6 = new VecInt();
                clause6.push((-6));
                clause6.push(4);
                this.solver.addClause(clause6);
                VecInt clause7 = new VecInt();
                clause7.push(5);
                clause7.push(6);
                clause7.push((-4));
                this.solver.addAtLeast(clause6, Integer.MAX_VALUE);
                this.solver.isSatisfiable();
                VecInt bound1 = new VecInt();
                bound1.push(3);
                this.solver.findModel(bound1);
                VecInt bound2 = new VecInt();
                bound2.push((-3));
                this.solver.findModel(bound2);
                VecInt bound3 = new VecInt();
                bound3.push(5);
                bound3.push(3);
                this.solver.findModel(bound3);
                VecInt bound4 = new VecInt();
                bound4.push(5);
                bound4.push((-3));
                this.solver.findModel(bound4);
                VecInt bound5 = new VecInt();
                bound5.push(4);
                bound5.push((-3));
                this.solver.findModel(bound5);
                VecInt bound6 = new VecInt();
                bound6.push(4);
                bound6.push(3);
                this.solver.findModel(bound6);
                VecInt bound7 = new VecInt();
                bound7.push(4);
                int[] model = this.solver.findModel(bound7);
                Set<Integer> satisfiedModel = new HashSet<Integer>();
                for (int i : model) {
                    satisfiedModel.add(new Integer(i));
                }
                satisfiedModel.contains(new Integer(4));
                satisfiedModel.contains(new Integer(1));
                satisfiedModel.contains(new Integer(2));
                org.junit.Assert.fail("testSimplePhoneSATSmalllitNum107 should have thrown ContradictionException");
            }
            org.junit.Assert.fail("testSimplePhoneSATSmalllitNum107_failAssert39litNum7524 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSimplePhoneSATSmalllitNum107_failAssert39litNum7641_failAssert94() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                VecInt clause0 = new VecInt();
                clause0.push(1);
                this.solver.addClause(clause0);
                VecInt clause1 = new VecInt();
                clause1.push(1);
                clause1.push((-2));
                this.solver.addClause(clause1);
                VecInt clause2 = new VecInt();
                clause2.push(2);
                clause2.push((-1));
                this.solver.addClause(clause2);
                VecInt clause3 = new VecInt();
                clause3.push(3);
                clause3.push((-2));
                this.solver.addClause(clause3);
                VecInt clause8 = new VecInt();
                clause8.push(2);
                clause8.push((-3));
                this.solver.addClause(clause8);
                VecInt clause4 = new VecInt();
                clause4.push((-4));
                clause4.push(1);
                this.solver.addClause(clause4);
                VecInt clause5 = new VecInt();
                clause5.push((-5));
                clause5.push(4);
                this.solver.addClause(clause5);
                VecInt clause6 = new VecInt();
                clause6.push((-6));
                clause6.push(0);
                this.solver.addClause(clause6);
                VecInt clause7 = new VecInt();
                clause7.push(5);
                clause7.push(6);
                clause7.push((-4));
                this.solver.addAtLeast(clause6, Integer.MAX_VALUE);
                this.solver.isSatisfiable();
                VecInt bound1 = new VecInt();
                bound1.push(3);
                this.solver.findModel(bound1);
                VecInt bound2 = new VecInt();
                bound2.push((-3));
                this.solver.findModel(bound2);
                VecInt bound3 = new VecInt();
                bound3.push(5);
                bound3.push(3);
                this.solver.findModel(bound3);
                VecInt bound4 = new VecInt();
                bound4.push(5);
                bound4.push((-3));
                this.solver.findModel(bound4);
                VecInt bound5 = new VecInt();
                bound5.push(4);
                bound5.push((-3));
                this.solver.findModel(bound5);
                VecInt bound6 = new VecInt();
                bound6.push(4);
                bound6.push(3);
                this.solver.findModel(bound6);
                VecInt bound7 = new VecInt();
                bound7.push(4);
                int[] model = this.solver.findModel(bound7);
                Set<Integer> satisfiedModel = new HashSet<Integer>();
                for (int i : model) {
                    satisfiedModel.add(new Integer(i));
                }
                satisfiedModel.contains(new Integer(4));
                satisfiedModel.contains(new Integer(1));
                satisfiedModel.contains(new Integer(2));
                org.junit.Assert.fail("testSimplePhoneSATSmalllitNum107 should have thrown ContradictionException");
            }
            org.junit.Assert.fail("testSimplePhoneSATSmalllitNum107_failAssert39litNum7641 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSimplePhoneSATSmalllitNum107_failAssert39litNum7405_failAssert99() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                VecInt clause0 = new VecInt();
                clause0.push(1);
                this.solver.addClause(clause0);
                VecInt clause1 = new VecInt();
                clause1.push(1);
                clause1.push((-2));
                this.solver.addClause(clause1);
                VecInt clause2 = new VecInt();
                clause2.push(2);
                clause2.push((-0));
                this.solver.addClause(clause2);
                VecInt clause3 = new VecInt();
                clause3.push(3);
                clause3.push((-2));
                this.solver.addClause(clause3);
                VecInt clause8 = new VecInt();
                clause8.push(2);
                clause8.push((-3));
                this.solver.addClause(clause8);
                VecInt clause4 = new VecInt();
                clause4.push((-4));
                clause4.push(1);
                this.solver.addClause(clause4);
                VecInt clause5 = new VecInt();
                clause5.push((-5));
                clause5.push(4);
                this.solver.addClause(clause5);
                VecInt clause6 = new VecInt();
                clause6.push((-6));
                clause6.push(4);
                this.solver.addClause(clause6);
                VecInt clause7 = new VecInt();
                clause7.push(5);
                clause7.push(6);
                clause7.push((-4));
                this.solver.addAtLeast(clause6, Integer.MAX_VALUE);
                this.solver.isSatisfiable();
                VecInt bound1 = new VecInt();
                bound1.push(3);
                this.solver.findModel(bound1);
                VecInt bound2 = new VecInt();
                bound2.push((-3));
                this.solver.findModel(bound2);
                VecInt bound3 = new VecInt();
                bound3.push(5);
                bound3.push(3);
                this.solver.findModel(bound3);
                VecInt bound4 = new VecInt();
                bound4.push(5);
                bound4.push((-3));
                this.solver.findModel(bound4);
                VecInt bound5 = new VecInt();
                bound5.push(4);
                bound5.push((-3));
                this.solver.findModel(bound5);
                VecInt bound6 = new VecInt();
                bound6.push(4);
                bound6.push(3);
                this.solver.findModel(bound6);
                VecInt bound7 = new VecInt();
                bound7.push(4);
                int[] model = this.solver.findModel(bound7);
                Set<Integer> satisfiedModel = new HashSet<Integer>();
                for (int i : model) {
                    satisfiedModel.add(new Integer(i));
                }
                satisfiedModel.contains(new Integer(4));
                satisfiedModel.contains(new Integer(1));
                satisfiedModel.contains(new Integer(2));
                org.junit.Assert.fail("testSimplePhoneSATSmalllitNum107 should have thrown ContradictionException");
            }
            org.junit.Assert.fail("testSimplePhoneSATSmalllitNum107_failAssert39litNum7405 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSimplePhoneSATSmalllitNum107_failAssert39litNum7343_failAssert108() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                VecInt clause0 = new VecInt();
                clause0.push(1);
                this.solver.addClause(clause0);
                VecInt clause1 = new VecInt();
                clause1.push(0);
                clause1.push((-2));
                this.solver.addClause(clause1);
                VecInt clause2 = new VecInt();
                clause2.push(2);
                clause2.push((-1));
                this.solver.addClause(clause2);
                VecInt clause3 = new VecInt();
                clause3.push(3);
                clause3.push((-2));
                this.solver.addClause(clause3);
                VecInt clause8 = new VecInt();
                clause8.push(2);
                clause8.push((-3));
                this.solver.addClause(clause8);
                VecInt clause4 = new VecInt();
                clause4.push((-4));
                clause4.push(1);
                this.solver.addClause(clause4);
                VecInt clause5 = new VecInt();
                clause5.push((-5));
                clause5.push(4);
                this.solver.addClause(clause5);
                VecInt clause6 = new VecInt();
                clause6.push((-6));
                clause6.push(4);
                this.solver.addClause(clause6);
                VecInt clause7 = new VecInt();
                clause7.push(5);
                clause7.push(6);
                clause7.push((-4));
                this.solver.addAtLeast(clause6, Integer.MAX_VALUE);
                this.solver.isSatisfiable();
                VecInt bound1 = new VecInt();
                bound1.push(3);
                this.solver.findModel(bound1);
                VecInt bound2 = new VecInt();
                bound2.push((-3));
                this.solver.findModel(bound2);
                VecInt bound3 = new VecInt();
                bound3.push(5);
                bound3.push(3);
                this.solver.findModel(bound3);
                VecInt bound4 = new VecInt();
                bound4.push(5);
                bound4.push((-3));
                this.solver.findModel(bound4);
                VecInt bound5 = new VecInt();
                bound5.push(4);
                bound5.push((-3));
                this.solver.findModel(bound5);
                VecInt bound6 = new VecInt();
                bound6.push(4);
                bound6.push(3);
                this.solver.findModel(bound6);
                VecInt bound7 = new VecInt();
                bound7.push(4);
                int[] model = this.solver.findModel(bound7);
                Set<Integer> satisfiedModel = new HashSet<Integer>();
                for (int i : model) {
                    satisfiedModel.add(new Integer(i));
                }
                satisfiedModel.contains(new Integer(4));
                satisfiedModel.contains(new Integer(1));
                satisfiedModel.contains(new Integer(2));
                org.junit.Assert.fail("testSimplePhoneSATSmalllitNum107 should have thrown ContradictionException");
            }
            org.junit.Assert.fail("testSimplePhoneSATSmalllitNum107_failAssert39litNum7343 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSimplePhoneSATSmalllitNum107_failAssert39litNum7424_failAssert109() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                VecInt clause0 = new VecInt();
                clause0.push(1);
                this.solver.addClause(clause0);
                VecInt clause1 = new VecInt();
                clause1.push(1);
                clause1.push((-2));
                this.solver.addClause(clause1);
                VecInt clause2 = new VecInt();
                clause2.push(2);
                clause2.push((-1));
                this.solver.addClause(clause2);
                VecInt clause3 = new VecInt();
                clause3.push(2);
                clause3.push((-2));
                this.solver.addClause(clause3);
                VecInt clause8 = new VecInt();
                clause8.push(2);
                clause8.push((-3));
                this.solver.addClause(clause8);
                VecInt clause4 = new VecInt();
                clause4.push((-4));
                clause4.push(1);
                this.solver.addClause(clause4);
                VecInt clause5 = new VecInt();
                clause5.push((-5));
                clause5.push(4);
                this.solver.addClause(clause5);
                VecInt clause6 = new VecInt();
                clause6.push((-6));
                clause6.push(4);
                this.solver.addClause(clause6);
                VecInt clause7 = new VecInt();
                clause7.push(5);
                clause7.push(6);
                clause7.push((-4));
                this.solver.addAtLeast(clause6, Integer.MAX_VALUE);
                this.solver.isSatisfiable();
                VecInt bound1 = new VecInt();
                bound1.push(3);
                this.solver.findModel(bound1);
                VecInt bound2 = new VecInt();
                bound2.push((-3));
                this.solver.findModel(bound2);
                VecInt bound3 = new VecInt();
                bound3.push(5);
                bound3.push(3);
                this.solver.findModel(bound3);
                VecInt bound4 = new VecInt();
                bound4.push(5);
                bound4.push((-3));
                this.solver.findModel(bound4);
                VecInt bound5 = new VecInt();
                bound5.push(4);
                bound5.push((-3));
                this.solver.findModel(bound5);
                VecInt bound6 = new VecInt();
                bound6.push(4);
                bound6.push(3);
                this.solver.findModel(bound6);
                VecInt bound7 = new VecInt();
                bound7.push(4);
                int[] model = this.solver.findModel(bound7);
                Set<Integer> satisfiedModel = new HashSet<Integer>();
                for (int i : model) {
                    satisfiedModel.add(new Integer(i));
                }
                satisfiedModel.contains(new Integer(4));
                satisfiedModel.contains(new Integer(1));
                satisfiedModel.contains(new Integer(2));
                org.junit.Assert.fail("testSimplePhoneSATSmalllitNum107 should have thrown ContradictionException");
            }
            org.junit.Assert.fail("testSimplePhoneSATSmalllitNum107_failAssert39litNum7424 should have thrown ContradictionException");
        } catch (ContradictionException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSimplePhoneSATSmalllitNum107_failAssert39litNum7441_failAssert125() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                VecInt clause0 = new VecInt();
                clause0.push(1);
                this.solver.addClause(clause0);
                VecInt clause1 = new VecInt();
                clause1.push(1);
                clause1.push((-2));
                this.solver.addClause(clause1);
                VecInt clause2 = new VecInt();
                clause2.push(2);
                clause2.push((-1));
                this.solver.addClause(clause2);
                VecInt clause3 = new VecInt();
                clause3.push(3);
                clause3.push((-3));
                this.solver.addClause(clause3);
                VecInt clause8 = new VecInt();
                clause8.push(2);
                clause8.push((-3));
                this.solver.addClause(clause8);
                VecInt clause4 = new VecInt();
                clause4.push((-4));
                clause4.push(1);
                this.solver.addClause(clause4);
                VecInt clause5 = new VecInt();
                clause5.push((-5));
                clause5.push(4);
                this.solver.addClause(clause5);
                VecInt clause6 = new VecInt();
                clause6.push((-6));
                clause6.push(4);
                this.solver.addClause(clause6);
                VecInt clause7 = new VecInt();
                clause7.push(5);
                clause7.push(6);
                clause7.push((-4));
                this.solver.addAtLeast(clause6, Integer.MAX_VALUE);
                this.solver.isSatisfiable();
                VecInt bound1 = new VecInt();
                bound1.push(3);
                this.solver.findModel(bound1);
                VecInt bound2 = new VecInt();
                bound2.push((-3));
                this.solver.findModel(bound2);
                VecInt bound3 = new VecInt();
                bound3.push(5);
                bound3.push(3);
                this.solver.findModel(bound3);
                VecInt bound4 = new VecInt();
                bound4.push(5);
                bound4.push((-3));
                this.solver.findModel(bound4);
                VecInt bound5 = new VecInt();
                bound5.push(4);
                bound5.push((-3));
                this.solver.findModel(bound5);
                VecInt bound6 = new VecInt();
                bound6.push(4);
                bound6.push(3);
                this.solver.findModel(bound6);
                VecInt bound7 = new VecInt();
                bound7.push(4);
                int[] model = this.solver.findModel(bound7);
                Set<Integer> satisfiedModel = new HashSet<Integer>();
                for (int i : model) {
                    satisfiedModel.add(new Integer(i));
                }
                satisfiedModel.contains(new Integer(4));
                satisfiedModel.contains(new Integer(1));
                satisfiedModel.contains(new Integer(2));
                org.junit.Assert.fail("testSimplePhoneSATSmalllitNum107 should have thrown ContradictionException");
            }
            org.junit.Assert.fail("testSimplePhoneSATSmalllitNum107_failAssert39litNum7441 should have thrown ContradictionException");
        } catch (ContradictionException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSimplePhoneSATSmalllitNum107_failAssert39litNum7954_failAssert187() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                VecInt clause0 = new VecInt();
                clause0.push(1);
                this.solver.addClause(clause0);
                VecInt clause1 = new VecInt();
                clause1.push(1);
                clause1.push((-2));
                this.solver.addClause(clause1);
                VecInt clause2 = new VecInt();
                clause2.push(2);
                clause2.push((-1));
                this.solver.addClause(clause2);
                VecInt clause3 = new VecInt();
                clause3.push(3);
                clause3.push((-2));
                this.solver.addClause(clause3);
                VecInt clause8 = new VecInt();
                clause8.push(2);
                clause8.push((-3));
                this.solver.addClause(clause8);
                VecInt clause4 = new VecInt();
                clause4.push((-4));
                clause4.push(1);
                this.solver.addClause(clause4);
                VecInt clause5 = new VecInt();
                clause5.push((-5));
                clause5.push(4);
                this.solver.addClause(clause5);
                VecInt clause6 = new VecInt();
                clause6.push((-6));
                clause6.push(4);
                this.solver.addClause(clause6);
                VecInt clause7 = new VecInt();
                clause7.push(5);
                clause7.push(6);
                clause7.push((-4));
                this.solver.addAtLeast(clause6, Integer.MAX_VALUE);
                this.solver.isSatisfiable();
                VecInt bound1 = new VecInt();
                bound1.push(3);
                this.solver.findModel(bound1);
                VecInt bound2 = new VecInt();
                bound2.push((-3));
                this.solver.findModel(bound2);
                VecInt bound3 = new VecInt();
                bound3.push(5);
                bound3.push(3);
                this.solver.findModel(bound3);
                VecInt bound4 = new VecInt();
                bound4.push(5);
                bound4.push((-3));
                this.solver.findModel(bound4);
                VecInt bound5 = new VecInt();
                bound5.push(4);
                bound5.push((-3));
                this.solver.findModel(bound5);
                VecInt bound6 = new VecInt();
                bound6.push(4);
                bound6.push(0);
                this.solver.findModel(bound6);
                VecInt bound7 = new VecInt();
                bound7.push(4);
                int[] model = this.solver.findModel(bound7);
                Set<Integer> satisfiedModel = new HashSet<Integer>();
                for (int i : model) {
                    satisfiedModel.add(new Integer(i));
                }
                satisfiedModel.contains(new Integer(4));
                satisfiedModel.contains(new Integer(1));
                satisfiedModel.contains(new Integer(2));
                org.junit.Assert.fail("testSimplePhoneSATSmalllitNum107 should have thrown ContradictionException");
            }
            org.junit.Assert.fail("testSimplePhoneSATSmalllitNum107_failAssert39litNum7954 should have thrown ContradictionException");
        } catch (ContradictionException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSimplePhoneSATSmalllitNum107_failAssert39litNum7339_failAssert190() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                VecInt clause0 = new VecInt();
                clause0.push(1);
                this.solver.addClause(clause0);
                VecInt clause1 = new VecInt();
                clause1.push(2);
                clause1.push((-2));
                this.solver.addClause(clause1);
                VecInt clause2 = new VecInt();
                clause2.push(2);
                clause2.push((-1));
                this.solver.addClause(clause2);
                VecInt clause3 = new VecInt();
                clause3.push(3);
                clause3.push((-2));
                this.solver.addClause(clause3);
                VecInt clause8 = new VecInt();
                clause8.push(2);
                clause8.push((-3));
                this.solver.addClause(clause8);
                VecInt clause4 = new VecInt();
                clause4.push((-4));
                clause4.push(1);
                this.solver.addClause(clause4);
                VecInt clause5 = new VecInt();
                clause5.push((-5));
                clause5.push(4);
                this.solver.addClause(clause5);
                VecInt clause6 = new VecInt();
                clause6.push((-6));
                clause6.push(4);
                this.solver.addClause(clause6);
                VecInt clause7 = new VecInt();
                clause7.push(5);
                clause7.push(6);
                clause7.push((-4));
                this.solver.addAtLeast(clause6, Integer.MAX_VALUE);
                this.solver.isSatisfiable();
                VecInt bound1 = new VecInt();
                bound1.push(3);
                this.solver.findModel(bound1);
                VecInt bound2 = new VecInt();
                bound2.push((-3));
                this.solver.findModel(bound2);
                VecInt bound3 = new VecInt();
                bound3.push(5);
                bound3.push(3);
                this.solver.findModel(bound3);
                VecInt bound4 = new VecInt();
                bound4.push(5);
                bound4.push((-3));
                this.solver.findModel(bound4);
                VecInt bound5 = new VecInt();
                bound5.push(4);
                bound5.push((-3));
                this.solver.findModel(bound5);
                VecInt bound6 = new VecInt();
                bound6.push(4);
                bound6.push(3);
                this.solver.findModel(bound6);
                VecInt bound7 = new VecInt();
                bound7.push(4);
                int[] model = this.solver.findModel(bound7);
                Set<Integer> satisfiedModel = new HashSet<Integer>();
                for (int i : model) {
                    satisfiedModel.add(new Integer(i));
                }
                satisfiedModel.contains(new Integer(4));
                satisfiedModel.contains(new Integer(1));
                satisfiedModel.contains(new Integer(2));
                org.junit.Assert.fail("testSimplePhoneSATSmalllitNum107 should have thrown ContradictionException");
            }
            org.junit.Assert.fail("testSimplePhoneSATSmalllitNum107_failAssert39litNum7339 should have thrown ContradictionException");
        } catch (ContradictionException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSimplePhoneSATSmalllitNum107_failAssert39litNum7386_failAssert191() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                VecInt clause0 = new VecInt();
                clause0.push(1);
                this.solver.addClause(clause0);
                VecInt clause1 = new VecInt();
                clause1.push(1);
                clause1.push((-2));
                this.solver.addClause(clause1);
                VecInt clause2 = new VecInt();
                clause2.push(1);
                clause2.push((-1));
                this.solver.addClause(clause2);
                VecInt clause3 = new VecInt();
                clause3.push(3);
                clause3.push((-2));
                this.solver.addClause(clause3);
                VecInt clause8 = new VecInt();
                clause8.push(2);
                clause8.push((-3));
                this.solver.addClause(clause8);
                VecInt clause4 = new VecInt();
                clause4.push((-4));
                clause4.push(1);
                this.solver.addClause(clause4);
                VecInt clause5 = new VecInt();
                clause5.push((-5));
                clause5.push(4);
                this.solver.addClause(clause5);
                VecInt clause6 = new VecInt();
                clause6.push((-6));
                clause6.push(4);
                this.solver.addClause(clause6);
                VecInt clause7 = new VecInt();
                clause7.push(5);
                clause7.push(6);
                clause7.push((-4));
                this.solver.addAtLeast(clause6, Integer.MAX_VALUE);
                this.solver.isSatisfiable();
                VecInt bound1 = new VecInt();
                bound1.push(3);
                this.solver.findModel(bound1);
                VecInt bound2 = new VecInt();
                bound2.push((-3));
                this.solver.findModel(bound2);
                VecInt bound3 = new VecInt();
                bound3.push(5);
                bound3.push(3);
                this.solver.findModel(bound3);
                VecInt bound4 = new VecInt();
                bound4.push(5);
                bound4.push((-3));
                this.solver.findModel(bound4);
                VecInt bound5 = new VecInt();
                bound5.push(4);
                bound5.push((-3));
                this.solver.findModel(bound5);
                VecInt bound6 = new VecInt();
                bound6.push(4);
                bound6.push(3);
                this.solver.findModel(bound6);
                VecInt bound7 = new VecInt();
                bound7.push(4);
                int[] model = this.solver.findModel(bound7);
                Set<Integer> satisfiedModel = new HashSet<Integer>();
                for (int i : model) {
                    satisfiedModel.add(new Integer(i));
                }
                satisfiedModel.contains(new Integer(4));
                satisfiedModel.contains(new Integer(1));
                satisfiedModel.contains(new Integer(2));
                org.junit.Assert.fail("testSimplePhoneSATSmalllitNum107 should have thrown ContradictionException");
            }
            org.junit.Assert.fail("testSimplePhoneSATSmalllitNum107_failAssert39litNum7386 should have thrown ContradictionException");
        } catch (ContradictionException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSimplePhoneSATSmalllitNum3_failAssert66litNum9879_failAssert211() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                VecInt clause0 = new VecInt();
                clause0.push(Integer.MAX_VALUE);
                this.solver.addClause(clause0);
                VecInt clause1 = new VecInt();
                clause1.push(1);
                clause1.push((-2));
                this.solver.addClause(clause1);
                VecInt clause2 = new VecInt();
                clause2.push(2);
                clause2.push((-1));
                this.solver.addClause(clause2);
                VecInt clause3 = new VecInt();
                clause3.push(3);
                clause3.push((-2));
                this.solver.addClause(clause3);
                VecInt clause8 = new VecInt();
                clause8.push(2);
                clause8.push((-3));
                this.solver.addClause(clause8);
                VecInt clause4 = new VecInt();
                clause4.push((-4));
                clause4.push(1);
                this.solver.addClause(clause4);
                VecInt clause5 = new VecInt();
                clause5.push((-5));
                clause5.push(4);
                this.solver.addClause(clause5);
                VecInt clause6 = new VecInt();
                clause6.push((-6));
                clause6.push(4);
                this.solver.addClause(clause6);
                VecInt clause7 = new VecInt();
                clause7.push(6);
                clause7.push(6);
                clause7.push((-4));
                this.solver.addAtLeast(clause6, 1);
                this.solver.isSatisfiable();
                VecInt bound1 = new VecInt();
                bound1.push(3);
                this.solver.findModel(bound1);
                VecInt bound2 = new VecInt();
                bound2.push((-3));
                this.solver.findModel(bound2);
                VecInt bound3 = new VecInt();
                bound3.push(5);
                bound3.push(3);
                this.solver.findModel(bound3);
                VecInt bound4 = new VecInt();
                bound4.push(5);
                bound4.push((-3));
                this.solver.findModel(bound4);
                VecInt bound5 = new VecInt();
                bound5.push(4);
                bound5.push((-3));
                this.solver.findModel(bound5);
                VecInt bound6 = new VecInt();
                bound6.push(4);
                bound6.push(3);
                this.solver.findModel(bound6);
                VecInt bound7 = new VecInt();
                bound7.push(4);
                int[] model = this.solver.findModel(bound7);
                Set<Integer> satisfiedModel = new HashSet<Integer>();
                for (int i : model) {
                    satisfiedModel.add(new Integer(i));
                }
                satisfiedModel.contains(new Integer(4));
                satisfiedModel.contains(new Integer(1));
                satisfiedModel.contains(new Integer(2));
                org.junit.Assert.fail("testSimplePhoneSATSmalllitNum3 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testSimplePhoneSATSmalllitNum3_failAssert66litNum9879 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSimplePhoneSATSmalllitNum107_failAssert39litNum7343_failAssert108_add13340_failAssert268() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    VecInt clause0 = new VecInt();
                    clause0.push(1);
                    this.solver.addClause(clause0);
                    VecInt clause1 = new VecInt();
                    clause1.push(0);
                    clause1.push((-2));
                    this.solver.addClause(clause1);
                    VecInt clause2 = new VecInt();
                    clause2.push(2);
                    clause2.push((-1));
                    this.solver.addClause(clause2);
                    VecInt clause3 = new VecInt();
                    clause3.push(3);
                    clause3.push((-2));
                    this.solver.addClause(clause3);
                    VecInt clause8 = new VecInt();
                    clause8.push(2);
                    clause8.push((-3));
                    this.solver.addClause(clause8);
                    VecInt clause4 = new VecInt();
                    clause4.push((-4));
                    clause4.push(1);
                    this.solver.addClause(clause4);
                    VecInt clause5 = new VecInt();
                    clause5.push((-5));
                    clause5.push(4);
                    this.solver.addClause(clause5);
                    VecInt clause6 = new VecInt();
                    clause6.push((-6));
                    clause6.push(4);
                    this.solver.addClause(clause6);
                    VecInt clause7 = new VecInt();
                    clause7.push(5);
                    clause7.push(6);
                    clause7.push((-4));
                    this.solver.addAtLeast(clause6, Integer.MAX_VALUE);
                    this.solver.addAtLeast(clause6, Integer.MAX_VALUE);
                    this.solver.isSatisfiable();
                    VecInt bound1 = new VecInt();
                    bound1.push(3);
                    this.solver.findModel(bound1);
                    VecInt bound2 = new VecInt();
                    bound2.push((-3));
                    this.solver.findModel(bound2);
                    VecInt bound3 = new VecInt();
                    bound3.push(5);
                    bound3.push(3);
                    this.solver.findModel(bound3);
                    VecInt bound4 = new VecInt();
                    bound4.push(5);
                    bound4.push((-3));
                    this.solver.findModel(bound4);
                    VecInt bound5 = new VecInt();
                    bound5.push(4);
                    bound5.push((-3));
                    this.solver.findModel(bound5);
                    VecInt bound6 = new VecInt();
                    bound6.push(4);
                    bound6.push(3);
                    this.solver.findModel(bound6);
                    VecInt bound7 = new VecInt();
                    bound7.push(4);
                    int[] model = this.solver.findModel(bound7);
                    Set<Integer> satisfiedModel = new HashSet<Integer>();
                    for (int i : model) {
                        satisfiedModel.add(new Integer(i));
                    }
                    satisfiedModel.contains(new Integer(4));
                    satisfiedModel.contains(new Integer(1));
                    satisfiedModel.contains(new Integer(2));
                    org.junit.Assert.fail("testSimplePhoneSATSmalllitNum107 should have thrown ContradictionException");
                }
                org.junit.Assert.fail("testSimplePhoneSATSmalllitNum107_failAssert39litNum7343 should have thrown IllegalArgumentException");
            }
            org.junit.Assert.fail("testSimplePhoneSATSmalllitNum107_failAssert39litNum7343_failAssert108_add13340 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSimplePhoneSATSmalllitNum107_failAssert39litNum7641_failAssert94_add12979_failAssert269() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    VecInt clause0 = new VecInt();
                    clause0.push(1);
                    this.solver.addClause(clause0);
                    VecInt clause1 = new VecInt();
                    clause1.push(1);
                    clause1.push((-2));
                    this.solver.addClause(clause1);
                    VecInt clause2 = new VecInt();
                    clause2.push(2);
                    clause2.push((-1));
                    this.solver.addClause(clause2);
                    VecInt clause3 = new VecInt();
                    clause3.push(3);
                    clause3.push((-2));
                    this.solver.addClause(clause3);
                    VecInt clause8 = new VecInt();
                    clause8.push(2);
                    clause8.push((-3));
                    this.solver.addClause(clause8);
                    VecInt clause4 = new VecInt();
                    clause4.push((-4));
                    clause4.push(1);
                    this.solver.addClause(clause4);
                    VecInt clause5 = new VecInt();
                    clause5.push((-5));
                    clause5.push(4);
                    this.solver.addClause(clause5);
                    VecInt clause6 = new VecInt();
                    clause6.push((-6));
                    clause6.push(0);
                    this.solver.addClause(clause6);
                    VecInt clause7 = new VecInt();
                    clause7.push(5);
                    clause7.push(6);
                    clause7.push((-4));
                    this.solver.addAtLeast(clause6, Integer.MAX_VALUE);
                    this.solver.addAtLeast(clause6, Integer.MAX_VALUE);
                    this.solver.isSatisfiable();
                    VecInt bound1 = new VecInt();
                    bound1.push(3);
                    this.solver.findModel(bound1);
                    VecInt bound2 = new VecInt();
                    bound2.push((-3));
                    this.solver.findModel(bound2);
                    VecInt bound3 = new VecInt();
                    bound3.push(5);
                    bound3.push(3);
                    this.solver.findModel(bound3);
                    VecInt bound4 = new VecInt();
                    bound4.push(5);
                    bound4.push((-3));
                    this.solver.findModel(bound4);
                    VecInt bound5 = new VecInt();
                    bound5.push(4);
                    bound5.push((-3));
                    this.solver.findModel(bound5);
                    VecInt bound6 = new VecInt();
                    bound6.push(4);
                    bound6.push(3);
                    this.solver.findModel(bound6);
                    VecInt bound7 = new VecInt();
                    bound7.push(4);
                    int[] model = this.solver.findModel(bound7);
                    Set<Integer> satisfiedModel = new HashSet<Integer>();
                    for (int i : model) {
                        satisfiedModel.add(new Integer(i));
                    }
                    satisfiedModel.contains(new Integer(4));
                    satisfiedModel.contains(new Integer(1));
                    satisfiedModel.contains(new Integer(2));
                    org.junit.Assert.fail("testSimplePhoneSATSmalllitNum107 should have thrown ContradictionException");
                }
                org.junit.Assert.fail("testSimplePhoneSATSmalllitNum107_failAssert39litNum7641 should have thrown IllegalArgumentException");
            }
            org.junit.Assert.fail("testSimplePhoneSATSmalllitNum107_failAssert39litNum7641_failAssert94_add12979 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSimplePhoneSATSmalllitNum107_failAssert39litNum7405_failAssert99_add13667_failAssert270() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    VecInt clause0 = new VecInt();
                    clause0.push(1);
                    this.solver.addClause(clause0);
                    VecInt clause1 = new VecInt();
                    clause1.push(1);
                    clause1.push((-2));
                    this.solver.addClause(clause1);
                    VecInt clause2 = new VecInt();
                    clause2.push(2);
                    clause2.push((-0));
                    this.solver.addClause(clause2);
                    VecInt clause3 = new VecInt();
                    clause3.push(3);
                    clause3.push((-2));
                    this.solver.addClause(clause3);
                    VecInt clause8 = new VecInt();
                    clause8.push(2);
                    clause8.push((-3));
                    this.solver.addClause(clause8);
                    VecInt clause4 = new VecInt();
                    clause4.push((-4));
                    clause4.push(1);
                    this.solver.addClause(clause4);
                    VecInt clause5 = new VecInt();
                    clause5.push((-5));
                    clause5.push(4);
                    this.solver.addClause(clause5);
                    VecInt clause6 = new VecInt();
                    clause6.push((-6));
                    clause6.push(4);
                    this.solver.addClause(clause6);
                    VecInt clause7 = new VecInt();
                    clause7.push(5);
                    clause7.push(6);
                    clause7.push((-4));
                    this.solver.addAtLeast(clause6, Integer.MAX_VALUE);
                    this.solver.addAtLeast(clause6, Integer.MAX_VALUE);
                    this.solver.isSatisfiable();
                    VecInt bound1 = new VecInt();
                    bound1.push(3);
                    this.solver.findModel(bound1);
                    VecInt bound2 = new VecInt();
                    bound2.push((-3));
                    this.solver.findModel(bound2);
                    VecInt bound3 = new VecInt();
                    bound3.push(5);
                    bound3.push(3);
                    this.solver.findModel(bound3);
                    VecInt bound4 = new VecInt();
                    bound4.push(5);
                    bound4.push((-3));
                    this.solver.findModel(bound4);
                    VecInt bound5 = new VecInt();
                    bound5.push(4);
                    bound5.push((-3));
                    this.solver.findModel(bound5);
                    VecInt bound6 = new VecInt();
                    bound6.push(4);
                    bound6.push(3);
                    this.solver.findModel(bound6);
                    VecInt bound7 = new VecInt();
                    bound7.push(4);
                    int[] model = this.solver.findModel(bound7);
                    Set<Integer> satisfiedModel = new HashSet<Integer>();
                    for (int i : model) {
                        satisfiedModel.add(new Integer(i));
                    }
                    satisfiedModel.contains(new Integer(4));
                    satisfiedModel.contains(new Integer(1));
                    satisfiedModel.contains(new Integer(2));
                    org.junit.Assert.fail("testSimplePhoneSATSmalllitNum107 should have thrown ContradictionException");
                }
                org.junit.Assert.fail("testSimplePhoneSATSmalllitNum107_failAssert39litNum7405 should have thrown IllegalArgumentException");
            }
            org.junit.Assert.fail("testSimplePhoneSATSmalllitNum107_failAssert39litNum7405_failAssert99_add13667 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSimplePhoneSATSmalllitNum107_failAssert39litNum7524_failAssert93_add13573_failAssert271() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    VecInt clause0 = new VecInt();
                    clause0.push(1);
                    this.solver.addClause(clause0);
                    VecInt clause1 = new VecInt();
                    clause1.push(1);
                    clause1.push((-2));
                    this.solver.addClause(clause1);
                    VecInt clause2 = new VecInt();
                    clause2.push(2);
                    clause2.push((-1));
                    this.solver.addClause(clause2);
                    VecInt clause3 = new VecInt();
                    clause3.push(3);
                    clause3.push((-2));
                    this.solver.addClause(clause3);
                    VecInt clause8 = new VecInt();
                    clause8.push(2);
                    clause8.push((-3));
                    this.solver.addClause(clause8);
                    VecInt clause4 = new VecInt();
                    clause4.push((-0));
                    clause4.push(1);
                    this.solver.addClause(clause4);
                    VecInt clause5 = new VecInt();
                    clause5.push((-5));
                    clause5.push(4);
                    this.solver.addClause(clause5);
                    VecInt clause6 = new VecInt();
                    clause6.push((-6));
                    clause6.push(4);
                    this.solver.addClause(clause6);
                    VecInt clause7 = new VecInt();
                    clause7.push(5);
                    clause7.push(6);
                    clause7.push((-4));
                    this.solver.addAtLeast(clause6, Integer.MAX_VALUE);
                    this.solver.addAtLeast(clause6, Integer.MAX_VALUE);
                    this.solver.isSatisfiable();
                    VecInt bound1 = new VecInt();
                    bound1.push(3);
                    this.solver.findModel(bound1);
                    VecInt bound2 = new VecInt();
                    bound2.push((-3));
                    this.solver.findModel(bound2);
                    VecInt bound3 = new VecInt();
                    bound3.push(5);
                    bound3.push(3);
                    this.solver.findModel(bound3);
                    VecInt bound4 = new VecInt();
                    bound4.push(5);
                    bound4.push((-3));
                    this.solver.findModel(bound4);
                    VecInt bound5 = new VecInt();
                    bound5.push(4);
                    bound5.push((-3));
                    this.solver.findModel(bound5);
                    VecInt bound6 = new VecInt();
                    bound6.push(4);
                    bound6.push(3);
                    this.solver.findModel(bound6);
                    VecInt bound7 = new VecInt();
                    bound7.push(4);
                    int[] model = this.solver.findModel(bound7);
                    Set<Integer> satisfiedModel = new HashSet<Integer>();
                    for (int i : model) {
                        satisfiedModel.add(new Integer(i));
                    }
                    satisfiedModel.contains(new Integer(4));
                    satisfiedModel.contains(new Integer(1));
                    satisfiedModel.contains(new Integer(2));
                    org.junit.Assert.fail("testSimplePhoneSATSmalllitNum107 should have thrown ContradictionException");
                }
                org.junit.Assert.fail("testSimplePhoneSATSmalllitNum107_failAssert39litNum7524 should have thrown IllegalArgumentException");
            }
            org.junit.Assert.fail("testSimplePhoneSATSmalllitNum107_failAssert39litNum7524_failAssert93_add13573 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSimplePhoneSATSmalllitNum107_failAssert39litNum7323_failAssert90_add12344_failAssert272() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    VecInt clause0 = new VecInt();
                    clause0.push(0);
                    this.solver.addClause(clause0);
                    VecInt clause1 = new VecInt();
                    clause1.push(1);
                    clause1.push((-2));
                    this.solver.addClause(clause1);
                    VecInt clause2 = new VecInt();
                    clause2.push(2);
                    clause2.push((-1));
                    this.solver.addClause(clause2);
                    VecInt clause3 = new VecInt();
                    clause3.push(3);
                    clause3.push((-2));
                    this.solver.addClause(clause3);
                    VecInt clause8 = new VecInt();
                    clause8.push(2);
                    clause8.push((-3));
                    this.solver.addClause(clause8);
                    VecInt clause4 = new VecInt();
                    clause4.push((-4));
                    clause4.push(1);
                    this.solver.addClause(clause4);
                    VecInt clause5 = new VecInt();
                    clause5.push((-5));
                    clause5.push(4);
                    this.solver.addClause(clause5);
                    VecInt clause6 = new VecInt();
                    clause6.push((-6));
                    clause6.push(4);
                    this.solver.addClause(clause6);
                    VecInt clause7 = new VecInt();
                    clause7.push(5);
                    clause7.push(6);
                    clause7.push((-4));
                    this.solver.addAtLeast(clause6, Integer.MAX_VALUE);
                    this.solver.addAtLeast(clause6, Integer.MAX_VALUE);
                    this.solver.isSatisfiable();
                    VecInt bound1 = new VecInt();
                    bound1.push(3);
                    this.solver.findModel(bound1);
                    VecInt bound2 = new VecInt();
                    bound2.push((-3));
                    this.solver.findModel(bound2);
                    VecInt bound3 = new VecInt();
                    bound3.push(5);
                    bound3.push(3);
                    this.solver.findModel(bound3);
                    VecInt bound4 = new VecInt();
                    bound4.push(5);
                    bound4.push((-3));
                    this.solver.findModel(bound4);
                    VecInt bound5 = new VecInt();
                    bound5.push(4);
                    bound5.push((-3));
                    this.solver.findModel(bound5);
                    VecInt bound6 = new VecInt();
                    bound6.push(4);
                    bound6.push(3);
                    this.solver.findModel(bound6);
                    VecInt bound7 = new VecInt();
                    bound7.push(4);
                    int[] model = this.solver.findModel(bound7);
                    Set<Integer> satisfiedModel = new HashSet<Integer>();
                    for (int i : model) {
                        satisfiedModel.add(new Integer(i));
                    }
                    satisfiedModel.contains(new Integer(4));
                    satisfiedModel.contains(new Integer(1));
                    satisfiedModel.contains(new Integer(2));
                    org.junit.Assert.fail("testSimplePhoneSATSmalllitNum107 should have thrown ContradictionException");
                }
                org.junit.Assert.fail("testSimplePhoneSATSmalllitNum107_failAssert39litNum7323 should have thrown IllegalArgumentException");
            }
            org.junit.Assert.fail("testSimplePhoneSATSmalllitNum107_failAssert39litNum7323_failAssert90_add12344 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSimplePhoneSATSmalllitNum107_failAssert39litNum7502_failAssert72_add11452_failAssert273() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    VecInt clause0 = new VecInt();
                    clause0.push(1);
                    this.solver.addClause(clause0);
                    VecInt clause1 = new VecInt();
                    clause1.push(1);
                    clause1.push((-2));
                    this.solver.addClause(clause1);
                    VecInt clause2 = new VecInt();
                    clause2.push(2);
                    clause2.push((-1));
                    this.solver.addClause(clause2);
                    VecInt clause3 = new VecInt();
                    clause3.push(3);
                    clause3.push((-2));
                    this.solver.addClause(clause3);
                    VecInt clause8 = new VecInt();
                    clause8.push(2);
                    clause8.push((-0));
                    this.solver.addClause(clause8);
                    VecInt clause4 = new VecInt();
                    clause4.push((-4));
                    clause4.push(1);
                    this.solver.addClause(clause4);
                    VecInt clause5 = new VecInt();
                    clause5.push((-5));
                    clause5.push(4);
                    this.solver.addClause(clause5);
                    VecInt clause6 = new VecInt();
                    clause6.push((-6));
                    clause6.push(4);
                    this.solver.addClause(clause6);
                    VecInt clause7 = new VecInt();
                    clause7.push(5);
                    clause7.push(6);
                    clause7.push((-4));
                    this.solver.addAtLeast(clause6, Integer.MAX_VALUE);
                    this.solver.addAtLeast(clause6, Integer.MAX_VALUE);
                    this.solver.isSatisfiable();
                    VecInt bound1 = new VecInt();
                    bound1.push(3);
                    this.solver.findModel(bound1);
                    VecInt bound2 = new VecInt();
                    bound2.push((-3));
                    this.solver.findModel(bound2);
                    VecInt bound3 = new VecInt();
                    bound3.push(5);
                    bound3.push(3);
                    this.solver.findModel(bound3);
                    VecInt bound4 = new VecInt();
                    bound4.push(5);
                    bound4.push((-3));
                    this.solver.findModel(bound4);
                    VecInt bound5 = new VecInt();
                    bound5.push(4);
                    bound5.push((-3));
                    this.solver.findModel(bound5);
                    VecInt bound6 = new VecInt();
                    bound6.push(4);
                    bound6.push(3);
                    this.solver.findModel(bound6);
                    VecInt bound7 = new VecInt();
                    bound7.push(4);
                    int[] model = this.solver.findModel(bound7);
                    Set<Integer> satisfiedModel = new HashSet<Integer>();
                    for (int i : model) {
                        satisfiedModel.add(new Integer(i));
                    }
                    satisfiedModel.contains(new Integer(4));
                    satisfiedModel.contains(new Integer(1));
                    satisfiedModel.contains(new Integer(2));
                    org.junit.Assert.fail("testSimplePhoneSATSmalllitNum107 should have thrown ContradictionException");
                }
                org.junit.Assert.fail("testSimplePhoneSATSmalllitNum107_failAssert39litNum7502 should have thrown IllegalArgumentException");
            }
            org.junit.Assert.fail("testSimplePhoneSATSmalllitNum107_failAssert39litNum7502_failAssert72_add11452 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSimplePhoneSATSmalllitNum107_failAssert39litNum7343_failAssert108_add13299_failAssert299() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    VecInt clause0 = new VecInt();
                    clause0.push(1);
                    this.solver.addClause(clause0);
                    VecInt clause1 = new VecInt();
                    clause1.push(0);
                    clause1.push((-2));
                    this.solver.addClause(clause1);
                    VecInt clause2 = new VecInt();
                    clause2.push(2);
                    clause2.push((-1));
                    this.solver.addClause(clause2);
                    VecInt clause3 = new VecInt();
                    clause3.push(3);
                    clause3.push((-2));
                    this.solver.addClause(clause3);
                    VecInt clause8 = new VecInt();
                    clause8.push(2);
                    clause8.push((-3));
                    this.solver.addClause(clause8);
                    VecInt clause4 = new VecInt();
                    clause4.push((-4));
                    clause4.push(1);
                    this.solver.addClause(clause4);
                    this.solver.addClause(clause4);
                    VecInt clause5 = new VecInt();
                    clause5.push((-5));
                    clause5.push(4);
                    this.solver.addClause(clause5);
                    VecInt clause6 = new VecInt();
                    clause6.push((-6));
                    clause6.push(4);
                    this.solver.addClause(clause6);
                    VecInt clause7 = new VecInt();
                    clause7.push(5);
                    clause7.push(6);
                    clause7.push((-4));
                    this.solver.addAtLeast(clause6, Integer.MAX_VALUE);
                    this.solver.isSatisfiable();
                    VecInt bound1 = new VecInt();
                    bound1.push(3);
                    this.solver.findModel(bound1);
                    VecInt bound2 = new VecInt();
                    bound2.push((-3));
                    this.solver.findModel(bound2);
                    VecInt bound3 = new VecInt();
                    bound3.push(5);
                    bound3.push(3);
                    this.solver.findModel(bound3);
                    VecInt bound4 = new VecInt();
                    bound4.push(5);
                    bound4.push((-3));
                    this.solver.findModel(bound4);
                    VecInt bound5 = new VecInt();
                    bound5.push(4);
                    bound5.push((-3));
                    this.solver.findModel(bound5);
                    VecInt bound6 = new VecInt();
                    bound6.push(4);
                    bound6.push(3);
                    this.solver.findModel(bound6);
                    VecInt bound7 = new VecInt();
                    bound7.push(4);
                    int[] model = this.solver.findModel(bound7);
                    Set<Integer> satisfiedModel = new HashSet<Integer>();
                    for (int i : model) {
                        satisfiedModel.add(new Integer(i));
                    }
                    satisfiedModel.contains(new Integer(4));
                    satisfiedModel.contains(new Integer(1));
                    satisfiedModel.contains(new Integer(2));
                    org.junit.Assert.fail("testSimplePhoneSATSmalllitNum107 should have thrown ContradictionException");
                }
                org.junit.Assert.fail("testSimplePhoneSATSmalllitNum107_failAssert39litNum7343 should have thrown IllegalArgumentException");
            }
            org.junit.Assert.fail("testSimplePhoneSATSmalllitNum107_failAssert39litNum7343_failAssert108_add13299 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSimplePhoneSATSmalllitNum107_failAssert39litNum7641_failAssert94_add12952_failAssert319() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    VecInt clause0 = new VecInt();
                    clause0.push(1);
                    this.solver.addClause(clause0);
                    VecInt clause1 = new VecInt();
                    clause1.push(1);
                    clause1.push((-2));
                    this.solver.addClause(clause1);
                    VecInt clause2 = new VecInt();
                    clause2.push(2);
                    clause2.push((-1));
                    this.solver.addClause(clause2);
                    VecInt clause3 = new VecInt();
                    clause3.push(3);
                    clause3.push((-2));
                    this.solver.addClause(clause3);
                    VecInt clause8 = new VecInt();
                    clause8.push(2);
                    clause8.push((-3));
                    this.solver.addClause(clause8);
                    VecInt clause4 = new VecInt();
                    clause4.push((-4));
                    clause4.push(1);
                    this.solver.addClause(clause4);
                    VecInt clause5 = new VecInt();
                    clause5.push((-5));
                    clause5.push(4);
                    this.solver.addClause(clause5);
                    this.solver.addClause(clause5);
                    VecInt clause6 = new VecInt();
                    clause6.push((-6));
                    clause6.push(0);
                    this.solver.addClause(clause6);
                    VecInt clause7 = new VecInt();
                    clause7.push(5);
                    clause7.push(6);
                    clause7.push((-4));
                    this.solver.addAtLeast(clause6, Integer.MAX_VALUE);
                    this.solver.isSatisfiable();
                    VecInt bound1 = new VecInt();
                    bound1.push(3);
                    this.solver.findModel(bound1);
                    VecInt bound2 = new VecInt();
                    bound2.push((-3));
                    this.solver.findModel(bound2);
                    VecInt bound3 = new VecInt();
                    bound3.push(5);
                    bound3.push(3);
                    this.solver.findModel(bound3);
                    VecInt bound4 = new VecInt();
                    bound4.push(5);
                    bound4.push((-3));
                    this.solver.findModel(bound4);
                    VecInt bound5 = new VecInt();
                    bound5.push(4);
                    bound5.push((-3));
                    this.solver.findModel(bound5);
                    VecInt bound6 = new VecInt();
                    bound6.push(4);
                    bound6.push(3);
                    this.solver.findModel(bound6);
                    VecInt bound7 = new VecInt();
                    bound7.push(4);
                    int[] model = this.solver.findModel(bound7);
                    Set<Integer> satisfiedModel = new HashSet<Integer>();
                    for (int i : model) {
                        satisfiedModel.add(new Integer(i));
                    }
                    satisfiedModel.contains(new Integer(4));
                    satisfiedModel.contains(new Integer(1));
                    satisfiedModel.contains(new Integer(2));
                    org.junit.Assert.fail("testSimplePhoneSATSmalllitNum107 should have thrown ContradictionException");
                }
                org.junit.Assert.fail("testSimplePhoneSATSmalllitNum107_failAssert39litNum7641 should have thrown IllegalArgumentException");
            }
            org.junit.Assert.fail("testSimplePhoneSATSmalllitNum107_failAssert39litNum7641_failAssert94_add12952 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSimplePhoneSATSmalllitNum107_failAssert39litNum7405_failAssert99_add13645_failAssert320() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    VecInt clause0 = new VecInt();
                    clause0.push(1);
                    this.solver.addClause(clause0);
                    VecInt clause1 = new VecInt();
                    clause1.push(1);
                    clause1.push((-2));
                    this.solver.addClause(clause1);
                    this.solver.addClause(clause1);
                    VecInt clause2 = new VecInt();
                    clause2.push(2);
                    clause2.push((-0));
                    this.solver.addClause(clause2);
                    VecInt clause3 = new VecInt();
                    clause3.push(3);
                    clause3.push((-2));
                    this.solver.addClause(clause3);
                    VecInt clause8 = new VecInt();
                    clause8.push(2);
                    clause8.push((-3));
                    this.solver.addClause(clause8);
                    VecInt clause4 = new VecInt();
                    clause4.push((-4));
                    clause4.push(1);
                    this.solver.addClause(clause4);
                    VecInt clause5 = new VecInt();
                    clause5.push((-5));
                    clause5.push(4);
                    this.solver.addClause(clause5);
                    VecInt clause6 = new VecInt();
                    clause6.push((-6));
                    clause6.push(4);
                    this.solver.addClause(clause6);
                    VecInt clause7 = new VecInt();
                    clause7.push(5);
                    clause7.push(6);
                    clause7.push((-4));
                    this.solver.addAtLeast(clause6, Integer.MAX_VALUE);
                    this.solver.isSatisfiable();
                    VecInt bound1 = new VecInt();
                    bound1.push(3);
                    this.solver.findModel(bound1);
                    VecInt bound2 = new VecInt();
                    bound2.push((-3));
                    this.solver.findModel(bound2);
                    VecInt bound3 = new VecInt();
                    bound3.push(5);
                    bound3.push(3);
                    this.solver.findModel(bound3);
                    VecInt bound4 = new VecInt();
                    bound4.push(5);
                    bound4.push((-3));
                    this.solver.findModel(bound4);
                    VecInt bound5 = new VecInt();
                    bound5.push(4);
                    bound5.push((-3));
                    this.solver.findModel(bound5);
                    VecInt bound6 = new VecInt();
                    bound6.push(4);
                    bound6.push(3);
                    this.solver.findModel(bound6);
                    VecInt bound7 = new VecInt();
                    bound7.push(4);
                    int[] model = this.solver.findModel(bound7);
                    Set<Integer> satisfiedModel = new HashSet<Integer>();
                    for (int i : model) {
                        satisfiedModel.add(new Integer(i));
                    }
                    satisfiedModel.contains(new Integer(4));
                    satisfiedModel.contains(new Integer(1));
                    satisfiedModel.contains(new Integer(2));
                    org.junit.Assert.fail("testSimplePhoneSATSmalllitNum107 should have thrown ContradictionException");
                }
                org.junit.Assert.fail("testSimplePhoneSATSmalllitNum107_failAssert39litNum7405 should have thrown IllegalArgumentException");
            }
            org.junit.Assert.fail("testSimplePhoneSATSmalllitNum107_failAssert39litNum7405_failAssert99_add13645 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSimplePhoneSATSmalllitNum107_failAssert39litNum7954_failAssert187_add13334_failAssert382() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    VecInt clause0 = new VecInt();
                    clause0.push(1);
                    this.solver.addClause(clause0);
                    VecInt clause1 = new VecInt();
                    clause1.push(1);
                    clause1.push((-2));
                    this.solver.addClause(clause1);
                    VecInt clause2 = new VecInt();
                    clause2.push(2);
                    clause2.push((-1));
                    this.solver.addClause(clause2);
                    VecInt clause3 = new VecInt();
                    clause3.push(3);
                    clause3.push((-2));
                    this.solver.addClause(clause3);
                    VecInt clause8 = new VecInt();
                    clause8.push(2);
                    clause8.push((-3));
                    this.solver.addClause(clause8);
                    VecInt clause4 = new VecInt();
                    clause4.push((-4));
                    clause4.push(1);
                    this.solver.addClause(clause4);
                    VecInt clause5 = new VecInt();
                    clause5.push((-5));
                    clause5.push(4);
                    this.solver.addClause(clause5);
                    VecInt clause6 = new VecInt();
                    clause6.push((-6));
                    clause6.push(4);
                    this.solver.addClause(clause6);
                    VecInt clause7 = new VecInt();
                    clause7.push(5);
                    clause7.push(6);
                    clause7.push((-4));
                    this.solver.addAtLeast(clause6, Integer.MAX_VALUE);
                    this.solver.addAtLeast(clause6, Integer.MAX_VALUE);
                    this.solver.isSatisfiable();
                    VecInt bound1 = new VecInt();
                    bound1.push(3);
                    this.solver.findModel(bound1);
                    VecInt bound2 = new VecInt();
                    bound2.push((-3));
                    this.solver.findModel(bound2);
                    VecInt bound3 = new VecInt();
                    bound3.push(5);
                    bound3.push(3);
                    this.solver.findModel(bound3);
                    VecInt bound4 = new VecInt();
                    bound4.push(5);
                    bound4.push((-3));
                    this.solver.findModel(bound4);
                    VecInt bound5 = new VecInt();
                    bound5.push(4);
                    bound5.push((-3));
                    this.solver.findModel(bound5);
                    VecInt bound6 = new VecInt();
                    bound6.push(4);
                    bound6.push(0);
                    this.solver.findModel(bound6);
                    VecInt bound7 = new VecInt();
                    bound7.push(4);
                    int[] model = this.solver.findModel(bound7);
                    Set<Integer> satisfiedModel = new HashSet<Integer>();
                    for (int i : model) {
                        satisfiedModel.add(new Integer(i));
                    }
                    satisfiedModel.contains(new Integer(4));
                    satisfiedModel.contains(new Integer(1));
                    satisfiedModel.contains(new Integer(2));
                    org.junit.Assert.fail("testSimplePhoneSATSmalllitNum107 should have thrown ContradictionException");
                }
                org.junit.Assert.fail("testSimplePhoneSATSmalllitNum107_failAssert39litNum7954 should have thrown ContradictionException");
            }
            org.junit.Assert.fail("testSimplePhoneSATSmalllitNum107_failAssert39litNum7954_failAssert187_add13334 should have thrown ContradictionException");
        } catch (ContradictionException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSimplePhoneSATSmalllitNum107_failAssert39litNum7386_failAssert191_add11537_failAssert385() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    VecInt clause0 = new VecInt();
                    clause0.push(1);
                    this.solver.addClause(clause0);
                    VecInt clause1 = new VecInt();
                    clause1.push(1);
                    clause1.push((-2));
                    this.solver.addClause(clause1);
                    VecInt clause2 = new VecInt();
                    clause2.push(1);
                    clause2.push((-1));
                    this.solver.addClause(clause2);
                    VecInt clause3 = new VecInt();
                    clause3.push(3);
                    clause3.push((-2));
                    this.solver.addClause(clause3);
                    VecInt clause8 = new VecInt();
                    clause8.push(2);
                    clause8.push((-3));
                    this.solver.addClause(clause8);
                    VecInt clause4 = new VecInt();
                    clause4.push((-4));
                    clause4.push(1);
                    this.solver.addClause(clause4);
                    VecInt clause5 = new VecInt();
                    clause5.push((-5));
                    clause5.push(4);
                    this.solver.addClause(clause5);
                    VecInt clause6 = new VecInt();
                    clause6.push((-6));
                    clause6.push(4);
                    this.solver.addClause(clause6);
                    VecInt clause7 = new VecInt();
                    clause7.push(5);
                    clause7.push(6);
                    clause7.push((-4));
                    this.solver.addAtLeast(clause6, Integer.MAX_VALUE);
                    this.solver.addAtLeast(clause6, Integer.MAX_VALUE);
                    this.solver.isSatisfiable();
                    VecInt bound1 = new VecInt();
                    bound1.push(3);
                    this.solver.findModel(bound1);
                    VecInt bound2 = new VecInt();
                    bound2.push((-3));
                    this.solver.findModel(bound2);
                    VecInt bound3 = new VecInt();
                    bound3.push(5);
                    bound3.push(3);
                    this.solver.findModel(bound3);
                    VecInt bound4 = new VecInt();
                    bound4.push(5);
                    bound4.push((-3));
                    this.solver.findModel(bound4);
                    VecInt bound5 = new VecInt();
                    bound5.push(4);
                    bound5.push((-3));
                    this.solver.findModel(bound5);
                    VecInt bound6 = new VecInt();
                    bound6.push(4);
                    bound6.push(3);
                    this.solver.findModel(bound6);
                    VecInt bound7 = new VecInt();
                    bound7.push(4);
                    int[] model = this.solver.findModel(bound7);
                    Set<Integer> satisfiedModel = new HashSet<Integer>();
                    for (int i : model) {
                        satisfiedModel.add(new Integer(i));
                    }
                    satisfiedModel.contains(new Integer(4));
                    satisfiedModel.contains(new Integer(1));
                    satisfiedModel.contains(new Integer(2));
                    org.junit.Assert.fail("testSimplePhoneSATSmalllitNum107 should have thrown ContradictionException");
                }
                org.junit.Assert.fail("testSimplePhoneSATSmalllitNum107_failAssert39litNum7386 should have thrown ContradictionException");
            }
            org.junit.Assert.fail("testSimplePhoneSATSmalllitNum107_failAssert39litNum7386_failAssert191_add11537 should have thrown ContradictionException");
        } catch (ContradictionException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSimplePhoneSATSmalllitNum107_failAssert39litNum7339_failAssert190_add13032_failAssert390() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    VecInt clause0 = new VecInt();
                    clause0.push(1);
                    this.solver.addClause(clause0);
                    VecInt clause1 = new VecInt();
                    clause1.push(2);
                    clause1.push((-2));
                    this.solver.addClause(clause1);
                    VecInt clause2 = new VecInt();
                    clause2.push(2);
                    clause2.push((-1));
                    this.solver.addClause(clause2);
                    VecInt clause3 = new VecInt();
                    clause3.push(3);
                    clause3.push((-2));
                    this.solver.addClause(clause3);
                    VecInt clause8 = new VecInt();
                    clause8.push(2);
                    clause8.push((-3));
                    this.solver.addClause(clause8);
                    VecInt clause4 = new VecInt();
                    clause4.push((-4));
                    clause4.push(1);
                    this.solver.addClause(clause4);
                    VecInt clause5 = new VecInt();
                    clause5.push((-5));
                    clause5.push(4);
                    this.solver.addClause(clause5);
                    VecInt clause6 = new VecInt();
                    clause6.push((-6));
                    clause6.push(4);
                    this.solver.addClause(clause6);
                    VecInt clause7 = new VecInt();
                    clause7.push(5);
                    clause7.push(6);
                    clause7.push((-4));
                    this.solver.addAtLeast(clause6, Integer.MAX_VALUE);
                    this.solver.addAtLeast(clause6, Integer.MAX_VALUE);
                    this.solver.isSatisfiable();
                    VecInt bound1 = new VecInt();
                    bound1.push(3);
                    this.solver.findModel(bound1);
                    VecInt bound2 = new VecInt();
                    bound2.push((-3));
                    this.solver.findModel(bound2);
                    VecInt bound3 = new VecInt();
                    bound3.push(5);
                    bound3.push(3);
                    this.solver.findModel(bound3);
                    VecInt bound4 = new VecInt();
                    bound4.push(5);
                    bound4.push((-3));
                    this.solver.findModel(bound4);
                    VecInt bound5 = new VecInt();
                    bound5.push(4);
                    bound5.push((-3));
                    this.solver.findModel(bound5);
                    VecInt bound6 = new VecInt();
                    bound6.push(4);
                    bound6.push(3);
                    this.solver.findModel(bound6);
                    VecInt bound7 = new VecInt();
                    bound7.push(4);
                    int[] model = this.solver.findModel(bound7);
                    Set<Integer> satisfiedModel = new HashSet<Integer>();
                    for (int i : model) {
                        satisfiedModel.add(new Integer(i));
                    }
                    satisfiedModel.contains(new Integer(4));
                    satisfiedModel.contains(new Integer(1));
                    satisfiedModel.contains(new Integer(2));
                    org.junit.Assert.fail("testSimplePhoneSATSmalllitNum107 should have thrown ContradictionException");
                }
                org.junit.Assert.fail("testSimplePhoneSATSmalllitNum107_failAssert39litNum7339 should have thrown ContradictionException");
            }
            org.junit.Assert.fail("testSimplePhoneSATSmalllitNum107_failAssert39litNum7339_failAssert190_add13032 should have thrown ContradictionException");
        } catch (ContradictionException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSimplePhoneSATSmalllitNum107_failAssert39litNum7424_failAssert109_add11630_failAssert391() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    VecInt clause0 = new VecInt();
                    clause0.push(1);
                    this.solver.addClause(clause0);
                    VecInt clause1 = new VecInt();
                    clause1.push(1);
                    clause1.push((-2));
                    this.solver.addClause(clause1);
                    VecInt clause2 = new VecInt();
                    clause2.push(2);
                    clause2.push((-1));
                    this.solver.addClause(clause2);
                    VecInt clause3 = new VecInt();
                    clause3.push(2);
                    clause3.push((-2));
                    this.solver.addClause(clause3);
                    VecInt clause8 = new VecInt();
                    clause8.push(2);
                    clause8.push((-3));
                    this.solver.addClause(clause8);
                    VecInt clause4 = new VecInt();
                    clause4.push((-4));
                    clause4.push(1);
                    this.solver.addClause(clause4);
                    VecInt clause5 = new VecInt();
                    clause5.push((-5));
                    clause5.push(4);
                    this.solver.addClause(clause5);
                    VecInt clause6 = new VecInt();
                    clause6.push((-6));
                    clause6.push(4);
                    this.solver.addClause(clause6);
                    VecInt clause7 = new VecInt();
                    clause7.push(5);
                    clause7.push(6);
                    clause7.push((-4));
                    this.solver.addAtLeast(clause6, Integer.MAX_VALUE);
                    this.solver.addAtLeast(clause6, Integer.MAX_VALUE);
                    this.solver.isSatisfiable();
                    VecInt bound1 = new VecInt();
                    bound1.push(3);
                    this.solver.findModel(bound1);
                    VecInt bound2 = new VecInt();
                    bound2.push((-3));
                    this.solver.findModel(bound2);
                    VecInt bound3 = new VecInt();
                    bound3.push(5);
                    bound3.push(3);
                    this.solver.findModel(bound3);
                    VecInt bound4 = new VecInt();
                    bound4.push(5);
                    bound4.push((-3));
                    this.solver.findModel(bound4);
                    VecInt bound5 = new VecInt();
                    bound5.push(4);
                    bound5.push((-3));
                    this.solver.findModel(bound5);
                    VecInt bound6 = new VecInt();
                    bound6.push(4);
                    bound6.push(3);
                    this.solver.findModel(bound6);
                    VecInt bound7 = new VecInt();
                    bound7.push(4);
                    int[] model = this.solver.findModel(bound7);
                    Set<Integer> satisfiedModel = new HashSet<Integer>();
                    for (int i : model) {
                        satisfiedModel.add(new Integer(i));
                    }
                    satisfiedModel.contains(new Integer(4));
                    satisfiedModel.contains(new Integer(1));
                    satisfiedModel.contains(new Integer(2));
                    org.junit.Assert.fail("testSimplePhoneSATSmalllitNum107 should have thrown ContradictionException");
                }
                org.junit.Assert.fail("testSimplePhoneSATSmalllitNum107_failAssert39litNum7424 should have thrown ContradictionException");
            }
            org.junit.Assert.fail("testSimplePhoneSATSmalllitNum107_failAssert39litNum7424_failAssert109_add11630 should have thrown ContradictionException");
        } catch (ContradictionException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSimplePhoneSATSmalllitNum107_failAssert39litNum7441_failAssert125_add12431_failAssert392() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    VecInt clause0 = new VecInt();
                    clause0.push(1);
                    this.solver.addClause(clause0);
                    VecInt clause1 = new VecInt();
                    clause1.push(1);
                    clause1.push((-2));
                    this.solver.addClause(clause1);
                    VecInt clause2 = new VecInt();
                    clause2.push(2);
                    clause2.push((-1));
                    this.solver.addClause(clause2);
                    VecInt clause3 = new VecInt();
                    clause3.push(3);
                    clause3.push((-3));
                    this.solver.addClause(clause3);
                    VecInt clause8 = new VecInt();
                    clause8.push(2);
                    clause8.push((-3));
                    this.solver.addClause(clause8);
                    VecInt clause4 = new VecInt();
                    clause4.push((-4));
                    clause4.push(1);
                    this.solver.addClause(clause4);
                    VecInt clause5 = new VecInt();
                    clause5.push((-5));
                    clause5.push(4);
                    this.solver.addClause(clause5);
                    VecInt clause6 = new VecInt();
                    clause6.push((-6));
                    clause6.push(4);
                    this.solver.addClause(clause6);
                    VecInt clause7 = new VecInt();
                    clause7.push(5);
                    clause7.push(6);
                    clause7.push((-4));
                    this.solver.addAtLeast(clause6, Integer.MAX_VALUE);
                    this.solver.addAtLeast(clause6, Integer.MAX_VALUE);
                    this.solver.isSatisfiable();
                    VecInt bound1 = new VecInt();
                    bound1.push(3);
                    this.solver.findModel(bound1);
                    VecInt bound2 = new VecInt();
                    bound2.push((-3));
                    this.solver.findModel(bound2);
                    VecInt bound3 = new VecInt();
                    bound3.push(5);
                    bound3.push(3);
                    this.solver.findModel(bound3);
                    VecInt bound4 = new VecInt();
                    bound4.push(5);
                    bound4.push((-3));
                    this.solver.findModel(bound4);
                    VecInt bound5 = new VecInt();
                    bound5.push(4);
                    bound5.push((-3));
                    this.solver.findModel(bound5);
                    VecInt bound6 = new VecInt();
                    bound6.push(4);
                    bound6.push(3);
                    this.solver.findModel(bound6);
                    VecInt bound7 = new VecInt();
                    bound7.push(4);
                    int[] model = this.solver.findModel(bound7);
                    Set<Integer> satisfiedModel = new HashSet<Integer>();
                    for (int i : model) {
                        satisfiedModel.add(new Integer(i));
                    }
                    satisfiedModel.contains(new Integer(4));
                    satisfiedModel.contains(new Integer(1));
                    satisfiedModel.contains(new Integer(2));
                    org.junit.Assert.fail("testSimplePhoneSATSmalllitNum107 should have thrown ContradictionException");
                }
                org.junit.Assert.fail("testSimplePhoneSATSmalllitNum107_failAssert39litNum7441 should have thrown ContradictionException");
            }
            org.junit.Assert.fail("testSimplePhoneSATSmalllitNum107_failAssert39litNum7441_failAssert125_add12431 should have thrown ContradictionException");
        } catch (ContradictionException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSimplePhoneSATSmalllitNum107_failAssert39litNum7402_failAssert91litNum12010_failAssert394() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    VecInt clause0 = new VecInt();
                    clause0.push(1);
                    this.solver.addClause(clause0);
                    VecInt clause1 = new VecInt();
                    clause1.push(1);
                    clause1.push((-2));
                    this.solver.addClause(clause1);
                    VecInt clause2 = new VecInt();
                    clause2.push(2);
                    clause2.push((-2));
                    this.solver.addClause(clause2);
                    VecInt clause3 = new VecInt();
                    clause3.push(3);
                    clause3.push((-2));
                    this.solver.addClause(clause3);
                    VecInt clause8 = new VecInt();
                    clause8.push(2);
                    clause8.push((-3));
                    this.solver.addClause(clause8);
                    VecInt clause4 = new VecInt();
                    clause4.push((-4));
                    clause4.push(1);
                    this.solver.addClause(clause4);
                    VecInt clause5 = new VecInt();
                    clause5.push((-5));
                    clause5.push(4);
                    this.solver.addClause(clause5);
                    VecInt clause6 = new VecInt();
                    clause6.push((-6));
                    clause6.push(4);
                    this.solver.addClause(clause6);
                    VecInt clause7 = new VecInt();
                    clause7.push(5);
                    clause7.push(6);
                    clause7.push((-4));
                    this.solver.addAtLeast(clause6, Integer.MAX_VALUE);
                    this.solver.isSatisfiable();
                    VecInt bound1 = new VecInt();
                    bound1.push(3);
                    this.solver.findModel(bound1);
                    VecInt bound2 = new VecInt();
                    bound2.push((-3));
                    this.solver.findModel(bound2);
                    VecInt bound3 = new VecInt();
                    bound3.push(5);
                    bound3.push(0);
                    this.solver.findModel(bound3);
                    VecInt bound4 = new VecInt();
                    bound4.push(5);
                    bound4.push((-3));
                    this.solver.findModel(bound4);
                    VecInt bound5 = new VecInt();
                    bound5.push(4);
                    bound5.push((-3));
                    this.solver.findModel(bound5);
                    VecInt bound6 = new VecInt();
                    bound6.push(4);
                    bound6.push(3);
                    this.solver.findModel(bound6);
                    VecInt bound7 = new VecInt();
                    bound7.push(4);
                    int[] model = this.solver.findModel(bound7);
                    Set<Integer> satisfiedModel = new HashSet<Integer>();
                    for (int i : model) {
                        satisfiedModel.add(new Integer(i));
                    }
                    satisfiedModel.contains(new Integer(4));
                    satisfiedModel.contains(new Integer(1));
                    satisfiedModel.contains(new Integer(2));
                    org.junit.Assert.fail("testSimplePhoneSATSmalllitNum107 should have thrown ContradictionException");
                }
                org.junit.Assert.fail("testSimplePhoneSATSmalllitNum107_failAssert39litNum7402 should have thrown ContradictionException");
            }
            org.junit.Assert.fail("testSimplePhoneSATSmalllitNum107_failAssert39litNum7402_failAssert91litNum12010 should have thrown ContradictionException");
        } catch (ContradictionException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSimplePhoneSATSmalllitNum107_failAssert39litNum7420_failAssert92litNum11004_failAssert395() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    VecInt clause0 = new VecInt();
                    clause0.push(1);
                    this.solver.addClause(clause0);
                    VecInt clause1 = new VecInt();
                    clause1.push(1);
                    clause1.push((-2));
                    this.solver.addClause(clause1);
                    VecInt clause2 = new VecInt();
                    clause2.push(2);
                    clause2.push((-1));
                    this.solver.addClause(clause2);
                    VecInt clause3 = new VecInt();
                    clause3.push(4);
                    clause3.push((-2));
                    this.solver.addClause(clause3);
                    VecInt clause8 = new VecInt();
                    clause8.push(2);
                    clause8.push((-3));
                    this.solver.addClause(clause8);
                    VecInt clause4 = new VecInt();
                    clause4.push((-4));
                    clause4.push(1);
                    this.solver.addClause(clause4);
                    VecInt clause5 = new VecInt();
                    clause5.push((-5));
                    clause5.push(4);
                    this.solver.addClause(clause5);
                    VecInt clause6 = new VecInt();
                    clause6.push((-6));
                    clause6.push(4);
                    this.solver.addClause(clause6);
                    VecInt clause7 = new VecInt();
                    clause7.push(0);
                    clause7.push(6);
                    clause7.push((-4));
                    this.solver.addAtLeast(clause6, Integer.MAX_VALUE);
                    this.solver.isSatisfiable();
                    VecInt bound1 = new VecInt();
                    bound1.push(3);
                    this.solver.findModel(bound1);
                    VecInt bound2 = new VecInt();
                    bound2.push((-3));
                    this.solver.findModel(bound2);
                    VecInt bound3 = new VecInt();
                    bound3.push(5);
                    bound3.push(3);
                    this.solver.findModel(bound3);
                    VecInt bound4 = new VecInt();
                    bound4.push(5);
                    bound4.push((-3));
                    this.solver.findModel(bound4);
                    VecInt bound5 = new VecInt();
                    bound5.push(4);
                    bound5.push((-3));
                    this.solver.findModel(bound5);
                    VecInt bound6 = new VecInt();
                    bound6.push(4);
                    bound6.push(3);
                    this.solver.findModel(bound6);
                    VecInt bound7 = new VecInt();
                    bound7.push(4);
                    int[] model = this.solver.findModel(bound7);
                    Set<Integer> satisfiedModel = new HashSet<Integer>();
                    for (int i : model) {
                        satisfiedModel.add(new Integer(i));
                    }
                    satisfiedModel.contains(new Integer(4));
                    satisfiedModel.contains(new Integer(1));
                    satisfiedModel.contains(new Integer(2));
                    org.junit.Assert.fail("testSimplePhoneSATSmalllitNum107 should have thrown ContradictionException");
                }
                org.junit.Assert.fail("testSimplePhoneSATSmalllitNum107_failAssert39litNum7420 should have thrown ContradictionException");
            }
            org.junit.Assert.fail("testSimplePhoneSATSmalllitNum107_failAssert39litNum7420_failAssert92litNum11004 should have thrown ContradictionException");
        } catch (ContradictionException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSimplePhoneSATSmalllitNum107_failAssert39litNum7402_failAssert91litNum12022_failAssert402() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    VecInt clause0 = new VecInt();
                    clause0.push(1);
                    this.solver.addClause(clause0);
                    VecInt clause1 = new VecInt();
                    clause1.push(1);
                    clause1.push((-2));
                    this.solver.addClause(clause1);
                    VecInt clause2 = new VecInt();
                    clause2.push(2);
                    clause2.push((-2));
                    this.solver.addClause(clause2);
                    VecInt clause3 = new VecInt();
                    clause3.push(3);
                    clause3.push((-2));
                    this.solver.addClause(clause3);
                    VecInt clause8 = new VecInt();
                    clause8.push(2);
                    clause8.push((-3));
                    this.solver.addClause(clause8);
                    VecInt clause4 = new VecInt();
                    clause4.push((-4));
                    clause4.push(1);
                    this.solver.addClause(clause4);
                    VecInt clause5 = new VecInt();
                    clause5.push((-5));
                    clause5.push(4);
                    this.solver.addClause(clause5);
                    VecInt clause6 = new VecInt();
                    clause6.push((-6));
                    clause6.push(4);
                    this.solver.addClause(clause6);
                    VecInt clause7 = new VecInt();
                    clause7.push(5);
                    clause7.push(6);
                    clause7.push((-4));
                    this.solver.addAtLeast(clause6, Integer.MAX_VALUE);
                    this.solver.isSatisfiable();
                    VecInt bound1 = new VecInt();
                    bound1.push(3);
                    this.solver.findModel(bound1);
                    VecInt bound2 = new VecInt();
                    bound2.push((-3));
                    this.solver.findModel(bound2);
                    VecInt bound3 = new VecInt();
                    bound3.push(5);
                    bound3.push(3);
                    this.solver.findModel(bound3);
                    VecInt bound4 = new VecInt();
                    bound4.push(4);
                    bound4.push((-3));
                    this.solver.findModel(bound4);
                    VecInt bound5 = new VecInt();
                    bound5.push(4);
                    bound5.push((-3));
                    this.solver.findModel(bound5);
                    VecInt bound6 = new VecInt();
                    bound6.push(4);
                    bound6.push(3);
                    this.solver.findModel(bound6);
                    VecInt bound7 = new VecInt();
                    bound7.push(4);
                    int[] model = this.solver.findModel(bound7);
                    Set<Integer> satisfiedModel = new HashSet<Integer>();
                    for (int i : model) {
                        satisfiedModel.add(new Integer(i));
                    }
                    satisfiedModel.contains(new Integer(4));
                    satisfiedModel.contains(new Integer(1));
                    satisfiedModel.contains(new Integer(2));
                    org.junit.Assert.fail("testSimplePhoneSATSmalllitNum107 should have thrown ContradictionException");
                }
                org.junit.Assert.fail("testSimplePhoneSATSmalllitNum107_failAssert39litNum7402 should have thrown ContradictionException");
            }
            org.junit.Assert.fail("testSimplePhoneSATSmalllitNum107_failAssert39litNum7402_failAssert91litNum12022 should have thrown ContradictionException");
        } catch (ContradictionException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSimplePhoneSATSmalllitNum107_failAssert39litNum7402_failAssert91litNum11711_failAssert407() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    VecInt clause0 = new VecInt();
                    clause0.push(1);
                    this.solver.addClause(clause0);
                    VecInt clause1 = new VecInt();
                    clause1.push(1);
                    clause1.push((-2));
                    this.solver.addClause(clause1);
                    VecInt clause2 = new VecInt();
                    clause2.push(2);
                    clause2.push((-2));
                    this.solver.addClause(clause2);
                    VecInt clause3 = new VecInt();
                    clause3.push(3);
                    clause3.push((-2));
                    this.solver.addClause(clause3);
                    VecInt clause8 = new VecInt();
                    clause8.push(2);
                    clause8.push((-3));
                    this.solver.addClause(clause8);
                    VecInt clause4 = new VecInt();
                    clause4.push((-0));
                    clause4.push(1);
                    this.solver.addClause(clause4);
                    VecInt clause5 = new VecInt();
                    clause5.push((-5));
                    clause5.push(4);
                    this.solver.addClause(clause5);
                    VecInt clause6 = new VecInt();
                    clause6.push((-6));
                    clause6.push(4);
                    this.solver.addClause(clause6);
                    VecInt clause7 = new VecInt();
                    clause7.push(5);
                    clause7.push(6);
                    clause7.push((-4));
                    this.solver.addAtLeast(clause6, Integer.MAX_VALUE);
                    this.solver.isSatisfiable();
                    VecInt bound1 = new VecInt();
                    bound1.push(3);
                    this.solver.findModel(bound1);
                    VecInt bound2 = new VecInt();
                    bound2.push((-3));
                    this.solver.findModel(bound2);
                    VecInt bound3 = new VecInt();
                    bound3.push(5);
                    bound3.push(3);
                    this.solver.findModel(bound3);
                    VecInt bound4 = new VecInt();
                    bound4.push(5);
                    bound4.push((-3));
                    this.solver.findModel(bound4);
                    VecInt bound5 = new VecInt();
                    bound5.push(4);
                    bound5.push((-3));
                    this.solver.findModel(bound5);
                    VecInt bound6 = new VecInt();
                    bound6.push(4);
                    bound6.push(3);
                    this.solver.findModel(bound6);
                    VecInt bound7 = new VecInt();
                    bound7.push(4);
                    int[] model = this.solver.findModel(bound7);
                    Set<Integer> satisfiedModel = new HashSet<Integer>();
                    for (int i : model) {
                        satisfiedModel.add(new Integer(i));
                    }
                    satisfiedModel.contains(new Integer(4));
                    satisfiedModel.contains(new Integer(1));
                    satisfiedModel.contains(new Integer(2));
                    org.junit.Assert.fail("testSimplePhoneSATSmalllitNum107 should have thrown ContradictionException");
                }
                org.junit.Assert.fail("testSimplePhoneSATSmalllitNum107_failAssert39litNum7402 should have thrown ContradictionException");
            }
            org.junit.Assert.fail("testSimplePhoneSATSmalllitNum107_failAssert39litNum7402_failAssert91litNum11711 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSimplePhoneSATSmalllitNum107_failAssert39litNum7420_failAssert92litNum11037_failAssert444() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    VecInt clause0 = new VecInt();
                    clause0.push(1);
                    this.solver.addClause(clause0);
                    VecInt clause1 = new VecInt();
                    clause1.push(1);
                    clause1.push((-2));
                    this.solver.addClause(clause1);
                    VecInt clause2 = new VecInt();
                    clause2.push(2);
                    clause2.push((-1));
                    this.solver.addClause(clause2);
                    VecInt clause3 = new VecInt();
                    clause3.push(4);
                    clause3.push((-2));
                    this.solver.addClause(clause3);
                    VecInt clause8 = new VecInt();
                    clause8.push(2);
                    clause8.push((-3));
                    this.solver.addClause(clause8);
                    VecInt clause4 = new VecInt();
                    clause4.push((-4));
                    clause4.push(1);
                    this.solver.addClause(clause4);
                    VecInt clause5 = new VecInt();
                    clause5.push((-5));
                    clause5.push(4);
                    this.solver.addClause(clause5);
                    VecInt clause6 = new VecInt();
                    clause6.push((-6));
                    clause6.push(4);
                    this.solver.addClause(clause6);
                    VecInt clause7 = new VecInt();
                    clause7.push(5);
                    clause7.push(6);
                    clause7.push((-3));
                    this.solver.addAtLeast(clause6, Integer.MAX_VALUE);
                    this.solver.isSatisfiable();
                    VecInt bound1 = new VecInt();
                    bound1.push(3);
                    this.solver.findModel(bound1);
                    VecInt bound2 = new VecInt();
                    bound2.push((-3));
                    this.solver.findModel(bound2);
                    VecInt bound3 = new VecInt();
                    bound3.push(5);
                    bound3.push(3);
                    this.solver.findModel(bound3);
                    VecInt bound4 = new VecInt();
                    bound4.push(5);
                    bound4.push((-3));
                    this.solver.findModel(bound4);
                    VecInt bound5 = new VecInt();
                    bound5.push(4);
                    bound5.push((-3));
                    this.solver.findModel(bound5);
                    VecInt bound6 = new VecInt();
                    bound6.push(4);
                    bound6.push(3);
                    this.solver.findModel(bound6);
                    VecInt bound7 = new VecInt();
                    bound7.push(4);
                    int[] model = this.solver.findModel(bound7);
                    Set<Integer> satisfiedModel = new HashSet<Integer>();
                    for (int i : model) {
                        satisfiedModel.add(new Integer(i));
                    }
                    satisfiedModel.contains(new Integer(4));
                    satisfiedModel.contains(new Integer(1));
                    satisfiedModel.contains(new Integer(2));
                    org.junit.Assert.fail("testSimplePhoneSATSmalllitNum107 should have thrown ContradictionException");
                }
                org.junit.Assert.fail("testSimplePhoneSATSmalllitNum107_failAssert39litNum7420 should have thrown ContradictionException");
            }
            org.junit.Assert.fail("testSimplePhoneSATSmalllitNum107_failAssert39litNum7420_failAssert92litNum11037 should have thrown ContradictionException");
        } catch (ContradictionException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSimplePhoneSATSmalllitNum107_failAssert39litNum7402_failAssert91litNum11625_failAssert450() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    VecInt clause0 = new VecInt();
                    clause0.push(1);
                    this.solver.addClause(clause0);
                    VecInt clause1 = new VecInt();
                    clause1.push(1);
                    clause1.push((-2));
                    this.solver.addClause(clause1);
                    VecInt clause2 = new VecInt();
                    clause2.push(2);
                    clause2.push((-2));
                    this.solver.addClause(clause2);
                    VecInt clause3 = new VecInt();
                    clause3.push(3);
                    clause3.push((-0));
                    this.solver.addClause(clause3);
                    VecInt clause8 = new VecInt();
                    clause8.push(2);
                    clause8.push((-3));
                    this.solver.addClause(clause8);
                    VecInt clause4 = new VecInt();
                    clause4.push((-4));
                    clause4.push(1);
                    this.solver.addClause(clause4);
                    VecInt clause5 = new VecInt();
                    clause5.push((-5));
                    clause5.push(4);
                    this.solver.addClause(clause5);
                    VecInt clause6 = new VecInt();
                    clause6.push((-6));
                    clause6.push(4);
                    this.solver.addClause(clause6);
                    VecInt clause7 = new VecInt();
                    clause7.push(5);
                    clause7.push(6);
                    clause7.push((-4));
                    this.solver.addAtLeast(clause6, Integer.MAX_VALUE);
                    this.solver.isSatisfiable();
                    VecInt bound1 = new VecInt();
                    bound1.push(3);
                    this.solver.findModel(bound1);
                    VecInt bound2 = new VecInt();
                    bound2.push((-3));
                    this.solver.findModel(bound2);
                    VecInt bound3 = new VecInt();
                    bound3.push(5);
                    bound3.push(3);
                    this.solver.findModel(bound3);
                    VecInt bound4 = new VecInt();
                    bound4.push(5);
                    bound4.push((-3));
                    this.solver.findModel(bound4);
                    VecInt bound5 = new VecInt();
                    bound5.push(4);
                    bound5.push((-3));
                    this.solver.findModel(bound5);
                    VecInt bound6 = new VecInt();
                    bound6.push(4);
                    bound6.push(3);
                    this.solver.findModel(bound6);
                    VecInt bound7 = new VecInt();
                    bound7.push(4);
                    int[] model = this.solver.findModel(bound7);
                    Set<Integer> satisfiedModel = new HashSet<Integer>();
                    for (int i : model) {
                        satisfiedModel.add(new Integer(i));
                    }
                    satisfiedModel.contains(new Integer(4));
                    satisfiedModel.contains(new Integer(1));
                    satisfiedModel.contains(new Integer(2));
                    org.junit.Assert.fail("testSimplePhoneSATSmalllitNum107 should have thrown ContradictionException");
                }
                org.junit.Assert.fail("testSimplePhoneSATSmalllitNum107_failAssert39litNum7402 should have thrown ContradictionException");
            }
            org.junit.Assert.fail("testSimplePhoneSATSmalllitNum107_failAssert39litNum7402_failAssert91litNum11625 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSimplePhoneSATSmalllitNum107_failAssert39litNum7402_failAssert91litNum11653_failAssert464() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    VecInt clause0 = new VecInt();
                    clause0.push(1);
                    this.solver.addClause(clause0);
                    VecInt clause1 = new VecInt();
                    clause1.push(1);
                    clause1.push((-2));
                    this.solver.addClause(clause1);
                    VecInt clause2 = new VecInt();
                    clause2.push(2);
                    clause2.push((-2));
                    this.solver.addClause(clause2);
                    VecInt clause3 = new VecInt();
                    clause3.push(3);
                    clause3.push((-2));
                    this.solver.addClause(clause3);
                    VecInt clause8 = new VecInt();
                    clause8.push(0);
                    clause8.push((-3));
                    this.solver.addClause(clause8);
                    VecInt clause4 = new VecInt();
                    clause4.push((-4));
                    clause4.push(1);
                    this.solver.addClause(clause4);
                    VecInt clause5 = new VecInt();
                    clause5.push((-5));
                    clause5.push(4);
                    this.solver.addClause(clause5);
                    VecInt clause6 = new VecInt();
                    clause6.push((-6));
                    clause6.push(4);
                    this.solver.addClause(clause6);
                    VecInt clause7 = new VecInt();
                    clause7.push(5);
                    clause7.push(6);
                    clause7.push((-4));
                    this.solver.addAtLeast(clause6, Integer.MAX_VALUE);
                    this.solver.isSatisfiable();
                    VecInt bound1 = new VecInt();
                    bound1.push(3);
                    this.solver.findModel(bound1);
                    VecInt bound2 = new VecInt();
                    bound2.push((-3));
                    this.solver.findModel(bound2);
                    VecInt bound3 = new VecInt();
                    bound3.push(5);
                    bound3.push(3);
                    this.solver.findModel(bound3);
                    VecInt bound4 = new VecInt();
                    bound4.push(5);
                    bound4.push((-3));
                    this.solver.findModel(bound4);
                    VecInt bound5 = new VecInt();
                    bound5.push(4);
                    bound5.push((-3));
                    this.solver.findModel(bound5);
                    VecInt bound6 = new VecInt();
                    bound6.push(4);
                    bound6.push(3);
                    this.solver.findModel(bound6);
                    VecInt bound7 = new VecInt();
                    bound7.push(4);
                    int[] model = this.solver.findModel(bound7);
                    Set<Integer> satisfiedModel = new HashSet<Integer>();
                    for (int i : model) {
                        satisfiedModel.add(new Integer(i));
                    }
                    satisfiedModel.contains(new Integer(4));
                    satisfiedModel.contains(new Integer(1));
                    satisfiedModel.contains(new Integer(2));
                    org.junit.Assert.fail("testSimplePhoneSATSmalllitNum107 should have thrown ContradictionException");
                }
                org.junit.Assert.fail("testSimplePhoneSATSmalllitNum107_failAssert39litNum7402 should have thrown ContradictionException");
            }
            org.junit.Assert.fail("testSimplePhoneSATSmalllitNum107_failAssert39litNum7402_failAssert91litNum11653 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }
}

