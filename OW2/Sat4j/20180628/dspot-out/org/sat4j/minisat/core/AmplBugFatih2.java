package org.sat4j.minisat.core;


import org.junit.Assert;
import org.junit.Test;
import org.sat4j.core.VecInt;
import org.sat4j.minisat.SolverFactory;
import org.sat4j.opt.MaxSatDecorator;
import org.sat4j.specs.ContradictionException;
import org.sat4j.specs.IConstr;
import org.sat4j.specs.TimeoutException;
import org.sat4j.tools.ModelIterator;
import org.sat4j.tools.OptToSatAdapter;


public class AmplBugFatih2 {
    @Test(timeout = 10000)
    public void testBugReport() throws Exception, ContradictionException, TimeoutException {
        ModelIterator solver = new ModelIterator(new OptToSatAdapter(new MaxSatDecorator(SolverFactory.newDefault())));
        System.out.println(("Taille de voc : " + (solver.nVars())));
        int o_testBugReport__10 = solver.newVar(13);
        Assert.assertEquals(13, ((int) (o_testBugReport__10)));
        solver.setExpectedNumberOfClauses(24);
        IConstr o_testBugReport__12 = solver.addClause(new VecInt(new int[]{ -1 }));
        Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testBugReport__12).getActivity())), 0.1);
        Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testBugReport__12).isSatisfied());
        int[] array_1352744571 = new int[]{3, 28};
        	int[] array_551977022 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testBugReport__12).getLits();
        	for(int ii = 0; ii <array_1352744571.length; ii++) {
        		org.junit.Assert.assertEquals(array_1352744571[ii], array_551977022[ii]);
        	};
        Assert.assertEquals("-1[?] 14[?]", ((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testBugReport__12).toString());
        Assert.assertEquals(15, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testBugReport__12).hashCode())));
        IConstr o_testBugReport__15 = solver.addClause(new VecInt(new int[]{ -2 }));
        Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testBugReport__15).getActivity())), 0.1);
        Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testBugReport__15).isSatisfied());
        int[] array_541611308 = new int[]{5, 30};
        	int[] array_1075896060 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testBugReport__15).getLits();
        	for(int ii = 0; ii <array_541611308.length; ii++) {
        		org.junit.Assert.assertEquals(array_541611308[ii], array_1075896060[ii]);
        	};
        Assert.assertEquals("-2[?] 15[?]", ((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testBugReport__15).toString());
        Assert.assertEquals(17, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testBugReport__15).hashCode())));
        IConstr o_testBugReport__18 = solver.addClause(new VecInt(new int[]{ -3, 4 }));
        Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testBugReport__18).getActivity())), 0.1);
        Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testBugReport__18).isSatisfied());
        int[] array_682353075 = new int[]{7, 8, 32};
        	int[] array_82884878 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testBugReport__18).getLits();
        	for(int ii = 0; ii <array_682353075.length; ii++) {
        		org.junit.Assert.assertEquals(array_682353075[ii], array_82884878[ii]);
        	};
        Assert.assertEquals("-3[?] 4[?] 16[?] ", ((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testBugReport__18).toString());
        Assert.assertEquals(15, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testBugReport__18).hashCode())));
        IConstr o_testBugReport__21 = solver.addClause(new VecInt(new int[]{ -3, 5 }));
        Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testBugReport__21).getActivity())), 0.1);
        Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testBugReport__21).isSatisfied());
        int[] array_88009965 = new int[]{7, 10, 34};
        	int[] array_1332478853 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testBugReport__21).getLits();
        	for(int ii = 0; ii <array_88009965.length; ii++) {
        		org.junit.Assert.assertEquals(array_88009965[ii], array_1332478853[ii]);
        	};
        Assert.assertEquals("-3[?] 5[?] 17[?] ", ((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testBugReport__21).toString());
        Assert.assertEquals(17, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testBugReport__21).hashCode())));
        IConstr o_testBugReport__24 = solver.addClause(new VecInt(new int[]{ -3, 6 }));
        Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testBugReport__24).getActivity())), 0.1);
        Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testBugReport__24).isSatisfied());
        int[] array_202437780 = new int[]{7, 12, 36};
        	int[] array_256583365 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testBugReport__24).getLits();
        	for(int ii = 0; ii <array_202437780.length; ii++) {
        		org.junit.Assert.assertEquals(array_202437780[ii], array_256583365[ii]);
        	};
        Assert.assertEquals("-3[?] 6[?] 18[?] ", ((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testBugReport__24).toString());
        Assert.assertEquals(18, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testBugReport__24).hashCode())));
        IConstr o_testBugReport__27 = solver.addClause(new VecInt(new int[]{ -1, 7 }));
        Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testBugReport__27).getActivity())), 0.1);
        Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testBugReport__27).isSatisfied());
        int[] array_292052944 = new int[]{3, 14, 38};
        	int[] array_974405979 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testBugReport__27).getLits();
        	for(int ii = 0; ii <array_292052944.length; ii++) {
        		org.junit.Assert.assertEquals(array_292052944[ii], array_974405979[ii]);
        	};
        Assert.assertEquals("-1[?] 7[?] 19[?] ", ((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testBugReport__27).toString());
        Assert.assertEquals(18, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testBugReport__27).hashCode())));
        IConstr o_testBugReport__30 = solver.addClause(new VecInt(new int[]{ -2, 6 }));
        Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testBugReport__30).getActivity())), 0.1);
        Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testBugReport__30).isSatisfied());
        int[] array_1618669629 = new int[]{5, 12, 40};
        	int[] array_1597744700 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testBugReport__30).getLits();
        	for(int ii = 0; ii <array_1618669629.length; ii++) {
        		org.junit.Assert.assertEquals(array_1618669629[ii], array_1597744700[ii]);
        	};
        Assert.assertEquals("-2[?] 6[?] 20[?] ", ((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testBugReport__30).toString());
        Assert.assertEquals(19, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testBugReport__30).hashCode())));
        IConstr o_testBugReport__33 = solver.addClause(new VecInt(new int[]{ -4, 3 }));
        Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testBugReport__33).getActivity())), 0.1);
        Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testBugReport__33).isSatisfied());
        int[] array_535783344 = new int[]{6, 9, 42};
        	int[] array_1384249954 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testBugReport__33).getLits();
        	for(int ii = 0; ii <array_535783344.length; ii++) {
        		org.junit.Assert.assertEquals(array_535783344[ii], array_1384249954[ii]);
        	};
        Assert.assertEquals("3[?] -4[?] 21[?] ", ((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testBugReport__33).toString());
        Assert.assertEquals(19, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testBugReport__33).hashCode())));
        IConstr o_testBugReport__36 = solver.addClause(new VecInt(new int[]{ -5, 3 }));
        Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testBugReport__36).getActivity())), 0.1);
        Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testBugReport__36).isSatisfied());
        int[] array_1830319410 = new int[]{6, 11, 44};
        	int[] array_1582929596 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testBugReport__36).getLits();
        	for(int ii = 0; ii <array_1830319410.length; ii++) {
        		org.junit.Assert.assertEquals(array_1830319410[ii], array_1582929596[ii]);
        	};
        Assert.assertEquals("3[?] -5[?] 22[?] ", ((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testBugReport__36).toString());
        Assert.assertEquals(20, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testBugReport__36).hashCode())));
        IConstr o_testBugReport__39 = solver.addClause(new VecInt(new int[]{ -6, 3, 2 }));
        Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testBugReport__39).getActivity())), 0.1);
        Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testBugReport__39).isSatisfied());
        int[] array_1844084588 = new int[]{4, 6, 13, 46};
        	int[] array_552152772 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testBugReport__39).getLits();
        	for(int ii = 0; ii <array_1844084588.length; ii++) {
        		org.junit.Assert.assertEquals(array_1844084588[ii], array_552152772[ii]);
        	};
        Assert.assertEquals("2[?] 3[?] -6[?] 23[?] ", ((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testBugReport__39).toString());
        Assert.assertEquals(17, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testBugReport__39).hashCode())));
        IConstr o_testBugReport__42 = solver.addClause(new VecInt(new int[]{ -7, 1 }));
        Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testBugReport__42).getActivity())), 0.1);
        Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testBugReport__42).isSatisfied());
        int[] array_1477321960 = new int[]{2, 15, 48};
        	int[] array_668631891 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testBugReport__42).getLits();
        	for(int ii = 0; ii <array_1477321960.length; ii++) {
        		org.junit.Assert.assertEquals(array_1477321960[ii], array_668631891[ii]);
        	};
        Assert.assertEquals("1[?] -7[?] 24[?] ", ((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testBugReport__42).toString());
        Assert.assertEquals(21, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testBugReport__42).hashCode())));
        IConstr o_testBugReport__45 = solver.addClause(new VecInt(new int[]{ 3, -1, 8 }));
        Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testBugReport__45).getActivity())), 0.1);
        Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testBugReport__45).isSatisfied());
        int[] array_2035544258 = new int[]{3, 6, 16, 50};
        	int[] array_1650846545 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testBugReport__45).getLits();
        	for(int ii = 0; ii <array_2035544258.length; ii++) {
        		org.junit.Assert.assertEquals(array_2035544258[ii], array_1650846545[ii]);
        	};
        Assert.assertEquals("-1[?] 3[?] 8[?] 25[?] ", ((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testBugReport__45).toString());
        Assert.assertEquals(18, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testBugReport__45).hashCode())));
        IConstr o_testBugReport__48 = solver.addClause(new VecInt(new int[]{ -3, 1, 8 }));
        Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testBugReport__48).getActivity())), 0.1);
        Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testBugReport__48).isSatisfied());
        int[] array_1294923761 = new int[]{2, 7, 16, 52};
        	int[] array_547186133 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testBugReport__48).getLits();
        	for(int ii = 0; ii <array_1294923761.length; ii++) {
        		org.junit.Assert.assertEquals(array_1294923761[ii], array_547186133[ii]);
        	};
        Assert.assertEquals("1[?] -3[?] 8[?] 26[?] ", ((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testBugReport__48).toString());
        Assert.assertEquals(19, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testBugReport__48).hashCode())));
        IConstr o_testBugReport__51 = solver.addClause(new VecInt(new int[]{ -3, -1, 9 }));
        Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testBugReport__51).getActivity())), 0.1);
        Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testBugReport__51).isSatisfied());
        int[] array_2096018921 = new int[]{3, 7, 18, 54};
        	int[] array_234843415 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testBugReport__51).getLits();
        	for(int ii = 0; ii <array_2096018921.length; ii++) {
        		org.junit.Assert.assertEquals(array_2096018921[ii], array_234843415[ii]);
        	};
        Assert.assertEquals("-1[?] -3[?] 9[?] 27[?] ", ((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testBugReport__51).toString());
        Assert.assertEquals(20, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testBugReport__51).hashCode())));
        IConstr o_testBugReport__55 = solver.addClause(new VecInt(new int[]{ -9 }));
        Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testBugReport__55).getActivity())), 0.1);
        Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testBugReport__55).isSatisfied());
        int[] array_1093504419 = new int[]{19, 56};
        	int[] array_1569961614 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testBugReport__55).getLits();
        	for(int ii = 0; ii <array_1093504419.length; ii++) {
        		org.junit.Assert.assertEquals(array_1093504419[ii], array_1569961614[ii]);
        	};
        Assert.assertEquals("-9[?] 28[?]", ((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testBugReport__55).toString());
        Assert.assertEquals(37, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testBugReport__55).hashCode())));
        IConstr o_testBugReport__58 = solver.addClause(new VecInt(new int[]{ 1, -2, 10 }));
        Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testBugReport__58).getActivity())), 0.1);
        Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testBugReport__58).isSatisfied());
        int[] array_699819759 = new int[]{2, 5, 20, 58};
        	int[] array_591333741 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testBugReport__58).getLits();
        	for(int ii = 0; ii <array_699819759.length; ii++) {
        		org.junit.Assert.assertEquals(array_699819759[ii], array_591333741[ii]);
        	};
        Assert.assertEquals("1[?] -2[?] 10[?] 29[?] ", ((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testBugReport__58).toString());
        Assert.assertEquals(21, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testBugReport__58).hashCode())));
        IConstr o_testBugReport__61 = solver.addClause(new VecInt(new int[]{ -1, 2, 10 }));
        Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testBugReport__61).getActivity())), 0.1);
        Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testBugReport__61).isSatisfied());
        int[] array_863235762 = new int[]{3, 4, 20, 60};
        	int[] array_1837747737 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testBugReport__61).getLits();
        	for(int ii = 0; ii <array_863235762.length; ii++) {
        		org.junit.Assert.assertEquals(array_863235762[ii], array_1837747737[ii]);
        	};
        Assert.assertEquals("-1[?] 2[?] 10[?] 30[?] ", ((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testBugReport__61).toString());
        Assert.assertEquals(21, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testBugReport__61).hashCode())));
        IConstr o_testBugReport__64 = solver.addClause(new VecInt(new int[]{ -1, -2, 11 }));
        Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testBugReport__64).getActivity())), 0.1);
        Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testBugReport__64).isSatisfied());
        int[] array_981265085 = new int[]{3, 5, 22, 62};
        	int[] array_216865762 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testBugReport__64).getLits();
        	for(int ii = 0; ii <array_981265085.length; ii++) {
        		org.junit.Assert.assertEquals(array_981265085[ii], array_216865762[ii]);
        	};
        Assert.assertEquals("-1[?] -2[?] 11[?] 31[?] ", ((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testBugReport__64).toString());
        Assert.assertEquals(23, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testBugReport__64).hashCode())));
        IConstr o_testBugReport__68 = solver.addClause(new VecInt(new int[]{ -10 }));
        Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testBugReport__68).getActivity())), 0.1);
        Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testBugReport__68).isSatisfied());
        int[] array_2005107434 = new int[]{21, 64};
        	int[] array_1074991441 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testBugReport__68).getLits();
        	for(int ii = 0; ii <array_2005107434.length; ii++) {
        		org.junit.Assert.assertEquals(array_2005107434[ii], array_1074991441[ii]);
        	};
        Assert.assertEquals("-10[?] 32[?]", ((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testBugReport__68).toString());
        Assert.assertEquals(42, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testBugReport__68).hashCode())));
        IConstr o_testBugReport__71 = solver.addClause(new VecInt(new int[]{ -11 }));
        Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testBugReport__71).getActivity())), 0.1);
        Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testBugReport__71).isSatisfied());
        int[] array_1692892407 = new int[]{23, 66};
        	int[] array_72198292 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testBugReport__71).getLits();
        	for(int ii = 0; ii <array_1692892407.length; ii++) {
        		org.junit.Assert.assertEquals(array_1692892407[ii], array_72198292[ii]);
        	};
        Assert.assertEquals("-11[?] 33[?]", ((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testBugReport__71).toString());
        Assert.assertEquals(44, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testBugReport__71).hashCode())));
        IConstr o_testBugReport__74 = solver.addClause(new VecInt(new int[]{ 3, -1, 12 }));
        Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testBugReport__74).getActivity())), 0.1);
        Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testBugReport__74).isSatisfied());
        int[] array_352628246 = new int[]{3, 6, 24, 68};
        	int[] array_1637010670 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testBugReport__74).getLits();
        	for(int ii = 0; ii <array_352628246.length; ii++) {
        		org.junit.Assert.assertEquals(array_352628246[ii], array_1637010670[ii]);
        	};
        Assert.assertEquals("-1[?] 3[?] 12[?] 34[?] ", ((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testBugReport__74).toString());
        Assert.assertEquals(25, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testBugReport__74).hashCode())));
        IConstr o_testBugReport__77 = solver.addClause(new VecInt(new int[]{ -3, 1, 12 }));
        Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testBugReport__77).getActivity())), 0.1);
        Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testBugReport__77).isSatisfied());
        int[] array_285837890 = new int[]{2, 7, 24, 70};
        	int[] array_1289466678 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testBugReport__77).getLits();
        	for(int ii = 0; ii <array_285837890.length; ii++) {
        		org.junit.Assert.assertEquals(array_285837890[ii], array_1289466678[ii]);
        	};
        Assert.assertEquals("1[?] -3[?] 12[?] 35[?] ", ((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testBugReport__77).toString());
        Assert.assertEquals(25, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testBugReport__77).hashCode())));
        IConstr o_testBugReport__80 = solver.addClause(new VecInt(new int[]{ -3, -1, 13 }));
        Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testBugReport__80).getActivity())), 0.1);
        Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testBugReport__80).isSatisfied());
        int[] array_57601349 = new int[]{3, 7, 26, 72};
        	int[] array_679015983 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testBugReport__80).getLits();
        	for(int ii = 0; ii <array_57601349.length; ii++) {
        		org.junit.Assert.assertEquals(array_57601349[ii], array_679015983[ii]);
        	};
        Assert.assertEquals("-1[?] -3[?] 13[?] 36[?] ", ((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testBugReport__80).toString());
        Assert.assertEquals(27, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testBugReport__80).hashCode())));
        IConstr o_testBugReport__84 = solver.addClause(new VecInt(new int[]{ -13 }));
        Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testBugReport__84).getActivity())), 0.1);
        Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testBugReport__84).isSatisfied());
        int[] array_1418443332 = new int[]{27, 74};
        	int[] array_586039462 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testBugReport__84).getLits();
        	for(int ii = 0; ii <array_1418443332.length; ii++) {
        		org.junit.Assert.assertEquals(array_1418443332[ii], array_586039462[ii]);
        	};
        Assert.assertEquals("-13[?] 37[?]", ((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testBugReport__84).toString());
        Assert.assertEquals(50, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testBugReport__84).hashCode())));
        System.out.println(("Taille de voc : " + (solver.nVars())));
        if (solver.isSatisfiable()) {
            System.out.println(("Taille du modèle : " + (solver.model().length)));
            for (int i = 1; i <= (solver.model().length); i++) {
                System.out.print(((solver.model(i)) + " "));
            }
            System.out.println();
        }
        Assert.assertEquals(13, ((int) (o_testBugReport__10)));
        Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testBugReport__12).getActivity())), 0.1);
        Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testBugReport__12).isSatisfied());
        int[] array_1528602795 = new int[]{3, 28};
        	int[] array_1746423145 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testBugReport__12).getLits();
        	for(int ii = 0; ii <array_1528602795.length; ii++) {
        		org.junit.Assert.assertEquals(array_1528602795[ii], array_1746423145[ii]);
        	};
        Assert.assertEquals("-1[?] 14[?]", ((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testBugReport__12).toString());
        Assert.assertEquals(15, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testBugReport__12).hashCode())));
        Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testBugReport__15).getActivity())), 0.1);
        Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testBugReport__15).isSatisfied());
        int[] array_1908207666 = new int[]{5, 30};
        	int[] array_1685399892 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testBugReport__15).getLits();
        	for(int ii = 0; ii <array_1908207666.length; ii++) {
        		org.junit.Assert.assertEquals(array_1908207666[ii], array_1685399892[ii]);
        	};
        Assert.assertEquals("-2[?] 15[?]", ((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testBugReport__15).toString());
        Assert.assertEquals(17, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testBugReport__15).hashCode())));
        Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testBugReport__18).getActivity())), 0.1);
        Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testBugReport__18).isSatisfied());
        int[] array_1681343802 = new int[]{7, 8, 32};
        	int[] array_1123892875 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testBugReport__18).getLits();
        	for(int ii = 0; ii <array_1681343802.length; ii++) {
        		org.junit.Assert.assertEquals(array_1681343802[ii], array_1123892875[ii]);
        	};
        Assert.assertEquals("-3[?] 4[?] 16[?] ", ((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testBugReport__18).toString());
        Assert.assertEquals(15, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testBugReport__18).hashCode())));
        Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testBugReport__21).getActivity())), 0.1);
        Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testBugReport__21).isSatisfied());
        int[] array_150625040 = new int[]{7, 10, 34};
        	int[] array_1512818959 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testBugReport__21).getLits();
        	for(int ii = 0; ii <array_150625040.length; ii++) {
        		org.junit.Assert.assertEquals(array_150625040[ii], array_1512818959[ii]);
        	};
        Assert.assertEquals("-3[?] 5[?] 17[?] ", ((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testBugReport__21).toString());
        Assert.assertEquals(17, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testBugReport__21).hashCode())));
        Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testBugReport__24).getActivity())), 0.1);
        Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testBugReport__24).isSatisfied());
        int[] array_316774110 = new int[]{7, 12, 36};
        	int[] array_132111952 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testBugReport__24).getLits();
        	for(int ii = 0; ii <array_316774110.length; ii++) {
        		org.junit.Assert.assertEquals(array_316774110[ii], array_132111952[ii]);
        	};
        Assert.assertEquals("-3[?] 6[?] 18[?] ", ((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testBugReport__24).toString());
        Assert.assertEquals(18, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testBugReport__24).hashCode())));
        Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testBugReport__27).getActivity())), 0.1);
        Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testBugReport__27).isSatisfied());
        int[] array_250487923 = new int[]{3, 14, 38};
        	int[] array_549821501 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testBugReport__27).getLits();
        	for(int ii = 0; ii <array_250487923.length; ii++) {
        		org.junit.Assert.assertEquals(array_250487923[ii], array_549821501[ii]);
        	};
        Assert.assertEquals("-1[?] 7[?] 19[?] ", ((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testBugReport__27).toString());
        Assert.assertEquals(18, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testBugReport__27).hashCode())));
        Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testBugReport__30).getActivity())), 0.1);
        Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testBugReport__30).isSatisfied());
        int[] array_2980723 = new int[]{5, 12, 40};
        	int[] array_743230722 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testBugReport__30).getLits();
        	for(int ii = 0; ii <array_2980723.length; ii++) {
        		org.junit.Assert.assertEquals(array_2980723[ii], array_743230722[ii]);
        	};
        Assert.assertEquals("-2[?] 6[?] 20[?] ", ((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testBugReport__30).toString());
        Assert.assertEquals(19, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testBugReport__30).hashCode())));
        Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testBugReport__33).getActivity())), 0.1);
        Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testBugReport__33).isSatisfied());
        int[] array_90127212 = new int[]{9, 6, 42};
        	int[] array_162785270 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testBugReport__33).getLits();
        	for(int ii = 0; ii <array_90127212.length; ii++) {
        		org.junit.Assert.assertEquals(array_90127212[ii], array_162785270[ii]);
        	};
        Assert.assertEquals("-4[?] 3[?] 21[?] ", ((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testBugReport__33).toString());
        Assert.assertEquals(19, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testBugReport__33).hashCode())));
        Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testBugReport__36).getActivity())), 0.1);
        Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testBugReport__36).isSatisfied());
        int[] array_1193822264 = new int[]{11, 6, 44};
        	int[] array_431586996 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testBugReport__36).getLits();
        	for(int ii = 0; ii <array_1193822264.length; ii++) {
        		org.junit.Assert.assertEquals(array_1193822264[ii], array_431586996[ii]);
        	};
        Assert.assertEquals("-5[?] 3[?] 22[?] ", ((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testBugReport__36).toString());
        Assert.assertEquals(20, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testBugReport__36).hashCode())));
        Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testBugReport__39).getActivity())), 0.1);
        Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testBugReport__39).isSatisfied());
        int[] array_1749816181 = new int[]{13, 6, 4, 46};
        	int[] array_2138657593 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testBugReport__39).getLits();
        	for(int ii = 0; ii <array_1749816181.length; ii++) {
        		org.junit.Assert.assertEquals(array_1749816181[ii], array_2138657593[ii]);
        	};
        Assert.assertEquals("-6[?] 3[?] 2[?] 23[?] ", ((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testBugReport__39).toString());
        Assert.assertEquals(17, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testBugReport__39).hashCode())));
        Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testBugReport__42).getActivity())), 0.1);
        Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testBugReport__42).isSatisfied());
        int[] array_860120133 = new int[]{15, 48, 2};
        	int[] array_135727051 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testBugReport__42).getLits();
        	for(int ii = 0; ii <array_860120133.length; ii++) {
        		org.junit.Assert.assertEquals(array_860120133[ii], array_135727051[ii]);
        	};
        Assert.assertEquals("-7[?] 24[?] 1[?] ", ((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testBugReport__42).toString());
        Assert.assertEquals(21, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testBugReport__42).hashCode())));
        Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testBugReport__45).getActivity())), 0.1);
        Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testBugReport__45).isSatisfied());
        int[] array_1471069008 = new int[]{3, 6, 16, 50};
        	int[] array_371425714 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testBugReport__45).getLits();
        	for(int ii = 0; ii <array_1471069008.length; ii++) {
        		org.junit.Assert.assertEquals(array_1471069008[ii], array_371425714[ii]);
        	};
        Assert.assertEquals("-1[?] 3[?] 8[?] 25[?] ", ((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testBugReport__45).toString());
        Assert.assertEquals(18, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testBugReport__45).hashCode())));
        Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testBugReport__48).getActivity())), 0.1);
        Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testBugReport__48).isSatisfied());
        int[] array_93077606 = new int[]{7, 16, 2, 52};
        	int[] array_1660760198 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testBugReport__48).getLits();
        	for(int ii = 0; ii <array_93077606.length; ii++) {
        		org.junit.Assert.assertEquals(array_93077606[ii], array_1660760198[ii]);
        	};
        Assert.assertEquals("-3[?] 8[?] 1[?] 26[?] ", ((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testBugReport__48).toString());
        Assert.assertEquals(19, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testBugReport__48).hashCode())));
        Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testBugReport__51).getActivity())), 0.1);
        Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testBugReport__51).isSatisfied());
        int[] array_1371126589 = new int[]{3, 7, 18, 54};
        	int[] array_459316089 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testBugReport__51).getLits();
        	for(int ii = 0; ii <array_1371126589.length; ii++) {
        		org.junit.Assert.assertEquals(array_1371126589[ii], array_459316089[ii]);
        	};
        Assert.assertEquals("-1[?] -3[?] 9[?] 27[?] ", ((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testBugReport__51).toString());
        Assert.assertEquals(20, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testBugReport__51).hashCode())));
        Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testBugReport__55).getActivity())), 0.1);
        Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testBugReport__55).isSatisfied());
        int[] array_791673254 = new int[]{19, 56};
        	int[] array_626511813 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testBugReport__55).getLits();
        	for(int ii = 0; ii <array_791673254.length; ii++) {
        		org.junit.Assert.assertEquals(array_791673254[ii], array_626511813[ii]);
        	};
        Assert.assertEquals("-9[?] 28[?]", ((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testBugReport__55).toString());
        Assert.assertEquals(37, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testBugReport__55).hashCode())));
        Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testBugReport__58).getActivity())), 0.1);
        Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testBugReport__58).isSatisfied());
        int[] array_857740484 = new int[]{5, 58, 20, 2};
        	int[] array_1219658779 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testBugReport__58).getLits();
        	for(int ii = 0; ii <array_857740484.length; ii++) {
        		org.junit.Assert.assertEquals(array_857740484[ii], array_1219658779[ii]);
        	};
        Assert.assertEquals("-2[?] 29[?] 10[?] 1[?] ", ((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testBugReport__58).toString());
        Assert.assertEquals(21, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testBugReport__58).hashCode())));
        Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testBugReport__61).getActivity())), 0.1);
        Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testBugReport__61).isSatisfied());
        int[] array_866297653 = new int[]{3, 4, 20, 60};
        	int[] array_288027983 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testBugReport__61).getLits();
        	for(int ii = 0; ii <array_866297653.length; ii++) {
        		org.junit.Assert.assertEquals(array_866297653[ii], array_288027983[ii]);
        	};
        Assert.assertEquals("-1[?] 2[?] 10[?] 30[?] ", ((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testBugReport__61).toString());
        Assert.assertEquals(21, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testBugReport__61).hashCode())));
        Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testBugReport__64).getActivity())), 0.1);
        Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testBugReport__64).isSatisfied());
        int[] array_6673440 = new int[]{3, 5, 22, 62};
        	int[] array_1048528542 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testBugReport__64).getLits();
        	for(int ii = 0; ii <array_6673440.length; ii++) {
        		org.junit.Assert.assertEquals(array_6673440[ii], array_1048528542[ii]);
        	};
        Assert.assertEquals("-1[?] -2[?] 11[?] 31[?] ", ((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testBugReport__64).toString());
        Assert.assertEquals(23, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testBugReport__64).hashCode())));
        Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testBugReport__68).getActivity())), 0.1);
        Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testBugReport__68).isSatisfied());
        int[] array_80830477 = new int[]{21, 64};
        	int[] array_396831297 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testBugReport__68).getLits();
        	for(int ii = 0; ii <array_80830477.length; ii++) {
        		org.junit.Assert.assertEquals(array_80830477[ii], array_396831297[ii]);
        	};
        Assert.assertEquals("-10[?] 32[?]", ((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testBugReport__68).toString());
        Assert.assertEquals(42, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testBugReport__68).hashCode())));
        Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testBugReport__71).getActivity())), 0.1);
        Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testBugReport__71).isSatisfied());
        int[] array_242181305 = new int[]{23, 66};
        	int[] array_1986915569 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testBugReport__71).getLits();
        	for(int ii = 0; ii <array_242181305.length; ii++) {
        		org.junit.Assert.assertEquals(array_242181305[ii], array_1986915569[ii]);
        	};
        Assert.assertEquals("-11[?] 33[?]", ((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testBugReport__71).toString());
        Assert.assertEquals(44, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testBugReport__71).hashCode())));
        Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testBugReport__74).getActivity())), 0.1);
        Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testBugReport__74).isSatisfied());
        int[] array_1554844862 = new int[]{3, 6, 24, 68};
        	int[] array_97134742 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testBugReport__74).getLits();
        	for(int ii = 0; ii <array_1554844862.length; ii++) {
        		org.junit.Assert.assertEquals(array_1554844862[ii], array_97134742[ii]);
        	};
        Assert.assertEquals("-1[?] 3[?] 12[?] 34[?] ", ((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testBugReport__74).toString());
        Assert.assertEquals(25, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testBugReport__74).hashCode())));
        Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testBugReport__77).getActivity())), 0.1);
        Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testBugReport__77).isSatisfied());
        int[] array_7765382 = new int[]{7, 24, 2, 70};
        	int[] array_447308089 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testBugReport__77).getLits();
        	for(int ii = 0; ii <array_7765382.length; ii++) {
        		org.junit.Assert.assertEquals(array_7765382[ii], array_447308089[ii]);
        	};
        Assert.assertEquals("-3[?] 12[?] 1[?] 35[?] ", ((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testBugReport__77).toString());
        Assert.assertEquals(25, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testBugReport__77).hashCode())));
        Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testBugReport__80).getActivity())), 0.1);
        Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testBugReport__80).isSatisfied());
        int[] array_619654276 = new int[]{3, 7, 26, 72};
        	int[] array_1022669800 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testBugReport__80).getLits();
        	for(int ii = 0; ii <array_619654276.length; ii++) {
        		org.junit.Assert.assertEquals(array_619654276[ii], array_1022669800[ii]);
        	};
        Assert.assertEquals("-1[?] -3[?] 13[?] 36[?] ", ((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testBugReport__80).toString());
        Assert.assertEquals(27, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testBugReport__80).hashCode())));
        Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testBugReport__84).getActivity())), 0.1);
        Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testBugReport__84).isSatisfied());
        int[] array_2130656791 = new int[]{27, 74};
        	int[] array_768359185 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testBugReport__84).getLits();
        	for(int ii = 0; ii <array_2130656791.length; ii++) {
        		org.junit.Assert.assertEquals(array_2130656791[ii], array_768359185[ii]);
        	};
        Assert.assertEquals("-13[?] 37[?]", ((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testBugReport__84).toString());
        Assert.assertEquals(50, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testBugReport__84).hashCode())));
    }
}

