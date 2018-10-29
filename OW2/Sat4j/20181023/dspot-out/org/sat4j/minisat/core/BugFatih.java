package org.sat4j.minisat.core;


import org.junit.Assert;
import org.junit.Test;
import org.sat4j.core.VecInt;
import org.sat4j.minisat.SolverFactory;
import org.sat4j.minisat.constraints.cnf.OriginalBinaryClause;
import org.sat4j.minisat.constraints.cnf.OriginalWLClause;
import org.sat4j.opt.MaxSatDecorator;
import org.sat4j.specs.ContradictionException;
import org.sat4j.specs.IConstr;
import org.sat4j.specs.TimeoutException;
import org.sat4j.tools.ModelIterator;
import org.sat4j.tools.OptToSatAdapter;


public class BugFatih {
    @Test(timeout = 10000)
    public void testBugReport() throws Exception, ContradictionException, TimeoutException {
        ModelIterator solver = new ModelIterator(new OptToSatAdapter(new MaxSatDecorator(SolverFactory.newDefault())));
        System.out.println(("Taille de voc : " + (solver.nVars())));
        int o_testBugReport__8 = solver.newVar(3);
        Assert.assertEquals(3, ((int) (o_testBugReport__8)));
        solver.setExpectedNumberOfClauses(3);
        IConstr o_testBugReport__10 = solver.addClause(new VecInt(new int[]{ 1, 2 }));
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testBugReport__10)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalWLClause) (o_testBugReport__10)).isSatisfied());
        int[] array_2133363011 = new int[]{2,4,8};
        	int[] array_1140420648 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testBugReport__10).getLits();
        	for(int ii = 0; ii <array_2133363011.length; ii++) {
        		org.junit.Assert.assertEquals(array_2133363011[ii], array_1140420648[ii]);
        	};
        Assert.assertEquals("1[?] 2[?] 4[?] ", ((OriginalWLClause) (o_testBugReport__10)).toString());
        Assert.assertEquals(4, ((int) (((OriginalWLClause) (o_testBugReport__10)).hashCode())));
        IConstr o_testBugReport__12 = solver.addClause(new VecInt(new int[]{ 1, 3 }));
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testBugReport__12)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalWLClause) (o_testBugReport__12)).isSatisfied());
        int[] array_1354204545 = new int[]{2,6,10};
        	int[] array_231660145 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testBugReport__12).getLits();
        	for(int ii = 0; ii <array_1354204545.length; ii++) {
        		org.junit.Assert.assertEquals(array_1354204545[ii], array_231660145[ii]);
        	};
        Assert.assertEquals("1[?] 3[?] 5[?] ", ((OriginalWLClause) (o_testBugReport__12)).toString());
        Assert.assertEquals(6, ((int) (((OriginalWLClause) (o_testBugReport__12)).hashCode())));
        IConstr o_testBugReport__14 = solver.addClause(new VecInt(new int[]{ 2, 3 }));
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testBugReport__14)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalWLClause) (o_testBugReport__14)).isSatisfied());
        int[] array_2107232173 = new int[]{4,6,12};
        	int[] array_888302443 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testBugReport__14).getLits();
        	for(int ii = 0; ii <array_2107232173.length; ii++) {
        		org.junit.Assert.assertEquals(array_2107232173[ii], array_888302443[ii]);
        	};
        Assert.assertEquals("2[?] 3[?] 6[?] ", ((OriginalWLClause) (o_testBugReport__14)).toString());
        Assert.assertEquals(7, ((int) (((OriginalWLClause) (o_testBugReport__14)).hashCode())));
        System.out.println(("Taille de voc : " + (solver.nVars())));
        if (solver.isSatisfiable()) {
            System.out.println(("Taille du modèle : " + (solver.model().length)));
            for (int i = 1; i <= (solver.model().length); i++) {
                System.out.print(((solver.model(i)) + " "));
            }
            System.out.println();
        }
        solver.reset();
        System.out.println(("Taille de voc : " + (solver.nVars())));
        int o_testBugReport__34 = solver.newVar(2);
        Assert.assertEquals(2, ((int) (o_testBugReport__34)));
        solver.setExpectedNumberOfClauses(2);
        IConstr o_testBugReport__36 = solver.addClause(new VecInt(new int[]{ 1, 2 }));
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testBugReport__36)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalWLClause) (o_testBugReport__36)).isSatisfied());
        int[] array_2097260477 = new int[]{2,4,6};
        	int[] array_1454982327 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testBugReport__36).getLits();
        	for(int ii = 0; ii <array_2097260477.length; ii++) {
        		org.junit.Assert.assertEquals(array_2097260477[ii], array_1454982327[ii]);
        	};
        Assert.assertEquals("1[?] 2[?] 3[?] ", ((OriginalWLClause) (o_testBugReport__36)).toString());
        Assert.assertEquals(4, ((int) (((OriginalWLClause) (o_testBugReport__36)).hashCode())));
        IConstr o_testBugReport__38 = solver.addClause(new VecInt(new int[]{ 2 }));
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testBugReport__38)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalBinaryClause) (o_testBugReport__38)).isSatisfied());
        int[] array_1135764624 = new int[]{4,8};
        	int[] array_1944614705 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testBugReport__38).getLits();
        	for(int ii = 0; ii <array_1135764624.length; ii++) {
        		org.junit.Assert.assertEquals(array_1135764624[ii], array_1944614705[ii]);
        	};
        Assert.assertEquals("2[?] 4[?]", ((OriginalBinaryClause) (o_testBugReport__38)).toString());
        Assert.assertEquals(6, ((int) (((OriginalBinaryClause) (o_testBugReport__38)).hashCode())));
        System.out.println(("Taille de voc : " + (solver.nVars())));
        if (solver.isSatisfiable()) {
            System.out.println(("Taille du modèle : " + (solver.model().length)));
            for (int i = 1; i <= (solver.model().length); i++) {
                System.out.print(((solver.model(i)) + " "));
            }
            System.out.println();
        }
        System.out.println("The End.");
        Assert.assertEquals(3, ((int) (o_testBugReport__8)));
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testBugReport__10)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalWLClause) (o_testBugReport__10)).isSatisfied());
        int[] array_564448070 = new int[]{4,8,2};
        	int[] array_1116118474 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testBugReport__10).getLits();
        	for(int ii = 0; ii <array_564448070.length; ii++) {
        		org.junit.Assert.assertEquals(array_564448070[ii], array_1116118474[ii]);
        	};
        Assert.assertEquals("2[?] 4[?] 1[?] ", ((OriginalWLClause) (o_testBugReport__10)).toString());
        Assert.assertEquals(4, ((int) (((OriginalWLClause) (o_testBugReport__10)).hashCode())));
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testBugReport__12)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalWLClause) (o_testBugReport__12)).isSatisfied());
        int[] array_696072730 = new int[]{6,10,2};
        	int[] array_1141906742 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testBugReport__12).getLits();
        	for(int ii = 0; ii <array_696072730.length; ii++) {
        		org.junit.Assert.assertEquals(array_696072730[ii], array_1141906742[ii]);
        	};
        Assert.assertEquals("3[?] 5[?] 1[?] ", ((OriginalWLClause) (o_testBugReport__12)).toString());
        Assert.assertEquals(6, ((int) (((OriginalWLClause) (o_testBugReport__12)).hashCode())));
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testBugReport__14)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalWLClause) (o_testBugReport__14)).isSatisfied());
        int[] array_1279429236 = new int[]{4,6,12};
        	int[] array_1152296711 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testBugReport__14).getLits();
        	for(int ii = 0; ii <array_1279429236.length; ii++) {
        		org.junit.Assert.assertEquals(array_1279429236[ii], array_1152296711[ii]);
        	};
        Assert.assertEquals("2[?] 3[?] 6[?] ", ((OriginalWLClause) (o_testBugReport__14)).toString());
        Assert.assertEquals(7, ((int) (((OriginalWLClause) (o_testBugReport__14)).hashCode())));
        Assert.assertEquals(2, ((int) (o_testBugReport__34)));
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testBugReport__36)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalWLClause) (o_testBugReport__36)).isSatisfied());
        int[] array_2123796144 = new int[]{4,6,2};
        	int[] array_765938660 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testBugReport__36).getLits();
        	for(int ii = 0; ii <array_2123796144.length; ii++) {
        		org.junit.Assert.assertEquals(array_2123796144[ii], array_765938660[ii]);
        	};
        Assert.assertEquals("2[?] 3[?] 1[?] ", ((OriginalWLClause) (o_testBugReport__36)).toString());
        Assert.assertEquals(4, ((int) (((OriginalWLClause) (o_testBugReport__36)).hashCode())));
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testBugReport__38)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalBinaryClause) (o_testBugReport__38)).isSatisfied());
        int[] array_1204484662 = new int[]{4,8};
        	int[] array_482581 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testBugReport__38).getLits();
        	for(int ii = 0; ii <array_1204484662.length; ii++) {
        		org.junit.Assert.assertEquals(array_1204484662[ii], array_482581[ii]);
        	};
        Assert.assertEquals("2[?] 4[?]", ((OriginalBinaryClause) (o_testBugReport__38)).toString());
        Assert.assertEquals(6, ((int) (((OriginalBinaryClause) (o_testBugReport__38)).hashCode())));
    }
}

