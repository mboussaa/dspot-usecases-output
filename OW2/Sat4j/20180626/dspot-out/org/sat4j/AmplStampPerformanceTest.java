package org.sat4j;


import org.junit.Assert;
import org.junit.Test;
import org.sat4j.core.VecInt;
import org.sat4j.minisat.SolverFactory;
import org.sat4j.specs.ContradictionException;
import org.sat4j.specs.IConstr;
import org.sat4j.specs.IVecInt;
import org.sat4j.specs.TimeoutException;
import org.sat4j.tools.ModelIterator;


public class AmplStampPerformanceTest {
    @Test(timeout = 10000)
    public void testGlobalTimeoutIterator() throws Exception {
        ModelIterator iterator = new ModelIterator(SolverFactory.newDefault());
        Assert.assertTrue(((org.sat4j.tools.ModelIterator)iterator).isSatisfiable());
        Assert.assertEquals(2147483647L, ((long) (((org.sat4j.tools.ModelIterator)iterator).getTimeoutMs())));
        Assert.assertEquals(2147483, ((int) (((org.sat4j.tools.ModelIterator)iterator).getTimeout())));
        Assert.assertTrue(((org.sat4j.tools.ModelIterator)iterator).getStat().containsKey("inspects"));
        Assert.assertEquals(0L, ((org.sat4j.tools.ModelIterator)iterator).getStat().get("inspects"));
        Assert.assertTrue(((org.sat4j.tools.ModelIterator)iterator).getStat().containsKey("propagations"));
        Assert.assertEquals(0L, ((org.sat4j.tools.ModelIterator)iterator).getStat().get("propagations"));
        Assert.assertTrue(((org.sat4j.tools.ModelIterator)iterator).getStat().containsKey("shortcuts"));
        Assert.assertEquals(0, ((org.sat4j.tools.ModelIterator)iterator).getStat().get("shortcuts"));
        Assert.assertTrue(((org.sat4j.tools.ModelIterator)iterator).getStat().containsKey("ignoredclauses"));
        Assert.assertEquals(0L, ((org.sat4j.tools.ModelIterator)iterator).getStat().get("ignoredclauses"));
        Assert.assertTrue(((org.sat4j.tools.ModelIterator)iterator).getStat().containsKey("learnedclauses"));
        Assert.assertEquals(0L, ((org.sat4j.tools.ModelIterator)iterator).getStat().get("learnedclauses"));
        Assert.assertTrue(((org.sat4j.tools.ModelIterator)iterator).getStat().containsKey("importedUnits"));
        Assert.assertEquals(0, ((org.sat4j.tools.ModelIterator)iterator).getStat().get("importedUnits"));
        Assert.assertTrue(((org.sat4j.tools.ModelIterator)iterator).getStat().containsKey("learnedbinaryclauses"));
        Assert.assertEquals(0L, ((org.sat4j.tools.ModelIterator)iterator).getStat().get("learnedbinaryclauses"));
        Assert.assertTrue(((org.sat4j.tools.ModelIterator)iterator).getStat().containsKey("reduceddb"));
        Assert.assertEquals(0, ((org.sat4j.tools.ModelIterator)iterator).getStat().get("reduceddb"));
        Assert.assertTrue(((org.sat4j.tools.ModelIterator)iterator).getStat().containsKey("updateLBD"));
        Assert.assertEquals(0L, ((org.sat4j.tools.ModelIterator)iterator).getStat().get("updateLBD"));
        Assert.assertTrue(((org.sat4j.tools.ModelIterator)iterator).getStat().containsKey("learnedliterals"));
        Assert.assertEquals(0L, ((org.sat4j.tools.ModelIterator)iterator).getStat().get("learnedliterals"));
        Assert.assertTrue(((org.sat4j.tools.ModelIterator)iterator).getStat().containsKey("conflicts"));
        Assert.assertEquals(0L, ((org.sat4j.tools.ModelIterator)iterator).getStat().get("conflicts"));
        Assert.assertTrue(((org.sat4j.tools.ModelIterator)iterator).getStat().containsKey("learnedternaryclauses"));
        Assert.assertEquals(0L, ((org.sat4j.tools.ModelIterator)iterator).getStat().get("learnedternaryclauses"));
        Assert.assertTrue(((org.sat4j.tools.ModelIterator)iterator).getStat().containsKey("changedreason"));
        Assert.assertEquals(0L, ((org.sat4j.tools.ModelIterator)iterator).getStat().get("changedreason"));
        Assert.assertTrue(((org.sat4j.tools.ModelIterator)iterator).getStat().containsKey("decisions"));
        Assert.assertEquals(0L, ((org.sat4j.tools.ModelIterator)iterator).getStat().get("decisions"));
        Assert.assertTrue(((org.sat4j.tools.ModelIterator)iterator).getStat().containsKey("starts"));
        Assert.assertEquals(1, ((org.sat4j.tools.ModelIterator)iterator).getStat().get("starts"));
        Assert.assertTrue(((org.sat4j.tools.ModelIterator)iterator).getStat().containsKey("rootSimplifications"));
        Assert.assertEquals(0L, ((org.sat4j.tools.ModelIterator)iterator).getStat().get("rootSimplifications"));
        Assert.assertTrue(((org.sat4j.tools.ModelIterator)iterator).getStat().containsKey("reducedliterals"));
        Assert.assertEquals(0L, ((org.sat4j.tools.ModelIterator)iterator).getStat().get("reducedliterals"));
        Assert.assertFalse(((org.sat4j.tools.ModelIterator)iterator).isDBSimplificationAllowed());
        Assert.assertFalse(((org.sat4j.tools.ModelIterator)iterator).isVerbose());
        Assert.assertEquals("c ", ((org.sat4j.tools.ModelIterator)iterator).getLogPrefix());
        Assert.assertFalse(((org.sat4j.tools.ModelIterator)iterator).isSolverKeptHot());
        Assert.assertEquals(2147483647L, ((long) (((org.sat4j.specs.ISolver)((org.sat4j.tools.ModelIterator)iterator).getSolvingEngine()).getTimeoutMs())));
        Assert.assertEquals(2147483, ((int) (((org.sat4j.specs.ISolver)((org.sat4j.tools.ModelIterator)iterator).getSolvingEngine()).getTimeout())));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.tools.ModelIterator)iterator).getSolvingEngine()).getStat().containsKey("inspects"));
        Assert.assertEquals(0L, ((org.sat4j.specs.ISolver)((org.sat4j.tools.ModelIterator)iterator).getSolvingEngine()).getStat().get("inspects"));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.tools.ModelIterator)iterator).getSolvingEngine()).getStat().containsKey("propagations"));
        Assert.assertEquals(0L, ((org.sat4j.specs.ISolver)((org.sat4j.tools.ModelIterator)iterator).getSolvingEngine()).getStat().get("propagations"));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.tools.ModelIterator)iterator).getSolvingEngine()).getStat().containsKey("shortcuts"));
        Assert.assertEquals(0, ((org.sat4j.specs.ISolver)((org.sat4j.tools.ModelIterator)iterator).getSolvingEngine()).getStat().get("shortcuts"));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.tools.ModelIterator)iterator).getSolvingEngine()).getStat().containsKey("ignoredclauses"));
        Assert.assertEquals(0L, ((org.sat4j.specs.ISolver)((org.sat4j.tools.ModelIterator)iterator).getSolvingEngine()).getStat().get("ignoredclauses"));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.tools.ModelIterator)iterator).getSolvingEngine()).getStat().containsKey("learnedclauses"));
        Assert.assertEquals(0L, ((org.sat4j.specs.ISolver)((org.sat4j.tools.ModelIterator)iterator).getSolvingEngine()).getStat().get("learnedclauses"));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.tools.ModelIterator)iterator).getSolvingEngine()).getStat().containsKey("importedUnits"));
        Assert.assertEquals(0, ((org.sat4j.specs.ISolver)((org.sat4j.tools.ModelIterator)iterator).getSolvingEngine()).getStat().get("importedUnits"));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.tools.ModelIterator)iterator).getSolvingEngine()).getStat().containsKey("learnedbinaryclauses"));
        Assert.assertEquals(0L, ((org.sat4j.specs.ISolver)((org.sat4j.tools.ModelIterator)iterator).getSolvingEngine()).getStat().get("learnedbinaryclauses"));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.tools.ModelIterator)iterator).getSolvingEngine()).getStat().containsKey("reduceddb"));
        Assert.assertEquals(0, ((org.sat4j.specs.ISolver)((org.sat4j.tools.ModelIterator)iterator).getSolvingEngine()).getStat().get("reduceddb"));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.tools.ModelIterator)iterator).getSolvingEngine()).getStat().containsKey("updateLBD"));
        Assert.assertEquals(0L, ((org.sat4j.specs.ISolver)((org.sat4j.tools.ModelIterator)iterator).getSolvingEngine()).getStat().get("updateLBD"));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.tools.ModelIterator)iterator).getSolvingEngine()).getStat().containsKey("learnedliterals"));
        Assert.assertEquals(0L, ((org.sat4j.specs.ISolver)((org.sat4j.tools.ModelIterator)iterator).getSolvingEngine()).getStat().get("learnedliterals"));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.tools.ModelIterator)iterator).getSolvingEngine()).getStat().containsKey("conflicts"));
        Assert.assertEquals(0L, ((org.sat4j.specs.ISolver)((org.sat4j.tools.ModelIterator)iterator).getSolvingEngine()).getStat().get("conflicts"));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.tools.ModelIterator)iterator).getSolvingEngine()).getStat().containsKey("learnedternaryclauses"));
        Assert.assertEquals(0L, ((org.sat4j.specs.ISolver)((org.sat4j.tools.ModelIterator)iterator).getSolvingEngine()).getStat().get("learnedternaryclauses"));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.tools.ModelIterator)iterator).getSolvingEngine()).getStat().containsKey("changedreason"));
        Assert.assertEquals(0L, ((org.sat4j.specs.ISolver)((org.sat4j.tools.ModelIterator)iterator).getSolvingEngine()).getStat().get("changedreason"));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.tools.ModelIterator)iterator).getSolvingEngine()).getStat().containsKey("decisions"));
        Assert.assertEquals(0L, ((org.sat4j.specs.ISolver)((org.sat4j.tools.ModelIterator)iterator).getSolvingEngine()).getStat().get("decisions"));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.tools.ModelIterator)iterator).getSolvingEngine()).getStat().containsKey("starts"));
        Assert.assertEquals(1, ((org.sat4j.specs.ISolver)((org.sat4j.tools.ModelIterator)iterator).getSolvingEngine()).getStat().get("starts"));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.tools.ModelIterator)iterator).getSolvingEngine()).getStat().containsKey("rootSimplifications"));
        Assert.assertEquals(0L, ((org.sat4j.specs.ISolver)((org.sat4j.tools.ModelIterator)iterator).getSolvingEngine()).getStat().get("rootSimplifications"));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.tools.ModelIterator)iterator).getSolvingEngine()).getStat().containsKey("reducedliterals"));
        Assert.assertEquals(0L, ((org.sat4j.specs.ISolver)((org.sat4j.tools.ModelIterator)iterator).getSolvingEngine()).getStat().get("reducedliterals"));
        Assert.assertFalse(((org.sat4j.specs.ISolver)((org.sat4j.tools.ModelIterator)iterator).getSolvingEngine()).isDBSimplificationAllowed());
        Assert.assertFalse(((org.sat4j.specs.ISolver)((org.sat4j.tools.ModelIterator)iterator).getSolvingEngine()).isVerbose());
        Assert.assertEquals("c ", ((org.sat4j.specs.ISolver)((org.sat4j.tools.ModelIterator)iterator).getSolvingEngine()).getLogPrefix());
        Assert.assertFalse(((org.sat4j.specs.ISolver)((org.sat4j.tools.ModelIterator)iterator).getSolvingEngine()).isSolverKeptHot());
        Assert.assertEquals(2147483647L, ((long) (((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.tools.ModelIterator)iterator).getSolvingEngine()).getSolvingEngine()).getTimeoutMs())));
        Assert.assertEquals(2147483, ((int) (((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.tools.ModelIterator)iterator).getSolvingEngine()).getSolvingEngine()).getTimeout())));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.tools.ModelIterator)iterator).getSolvingEngine()).getSolvingEngine()).getStat().containsKey("inspects"));
        Assert.assertEquals(0L, ((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.tools.ModelIterator)iterator).getSolvingEngine()).getSolvingEngine()).getStat().get("inspects"));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.tools.ModelIterator)iterator).getSolvingEngine()).getSolvingEngine()).getStat().containsKey("propagations"));
        Assert.assertEquals(0L, ((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.tools.ModelIterator)iterator).getSolvingEngine()).getSolvingEngine()).getStat().get("propagations"));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.tools.ModelIterator)iterator).getSolvingEngine()).getSolvingEngine()).getStat().containsKey("shortcuts"));
        Assert.assertEquals(0, ((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.tools.ModelIterator)iterator).getSolvingEngine()).getSolvingEngine()).getStat().get("shortcuts"));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.tools.ModelIterator)iterator).getSolvingEngine()).getSolvingEngine()).getStat().containsKey("ignoredclauses"));
        Assert.assertEquals(0L, ((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.tools.ModelIterator)iterator).getSolvingEngine()).getSolvingEngine()).getStat().get("ignoredclauses"));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.tools.ModelIterator)iterator).getSolvingEngine()).getSolvingEngine()).getStat().containsKey("learnedclauses"));
        Assert.assertEquals(0L, ((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.tools.ModelIterator)iterator).getSolvingEngine()).getSolvingEngine()).getStat().get("learnedclauses"));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.tools.ModelIterator)iterator).getSolvingEngine()).getSolvingEngine()).getStat().containsKey("importedUnits"));
        Assert.assertEquals(0, ((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.tools.ModelIterator)iterator).getSolvingEngine()).getSolvingEngine()).getStat().get("importedUnits"));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.tools.ModelIterator)iterator).getSolvingEngine()).getSolvingEngine()).getStat().containsKey("learnedbinaryclauses"));
        Assert.assertEquals(0L, ((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.tools.ModelIterator)iterator).getSolvingEngine()).getSolvingEngine()).getStat().get("learnedbinaryclauses"));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.tools.ModelIterator)iterator).getSolvingEngine()).getSolvingEngine()).getStat().containsKey("reduceddb"));
        Assert.assertEquals(0, ((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.tools.ModelIterator)iterator).getSolvingEngine()).getSolvingEngine()).getStat().get("reduceddb"));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.tools.ModelIterator)iterator).getSolvingEngine()).getSolvingEngine()).getStat().containsKey("updateLBD"));
        Assert.assertEquals(0L, ((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.tools.ModelIterator)iterator).getSolvingEngine()).getSolvingEngine()).getStat().get("updateLBD"));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.tools.ModelIterator)iterator).getSolvingEngine()).getSolvingEngine()).getStat().containsKey("learnedliterals"));
        Assert.assertEquals(0L, ((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.tools.ModelIterator)iterator).getSolvingEngine()).getSolvingEngine()).getStat().get("learnedliterals"));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.tools.ModelIterator)iterator).getSolvingEngine()).getSolvingEngine()).getStat().containsKey("conflicts"));
        Assert.assertEquals(0L, ((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.tools.ModelIterator)iterator).getSolvingEngine()).getSolvingEngine()).getStat().get("conflicts"));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.tools.ModelIterator)iterator).getSolvingEngine()).getSolvingEngine()).getStat().containsKey("learnedternaryclauses"));
        Assert.assertEquals(0L, ((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.tools.ModelIterator)iterator).getSolvingEngine()).getSolvingEngine()).getStat().get("learnedternaryclauses"));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.tools.ModelIterator)iterator).getSolvingEngine()).getSolvingEngine()).getStat().containsKey("changedreason"));
        Assert.assertEquals(0L, ((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.tools.ModelIterator)iterator).getSolvingEngine()).getSolvingEngine()).getStat().get("changedreason"));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.tools.ModelIterator)iterator).getSolvingEngine()).getSolvingEngine()).getStat().containsKey("decisions"));
        Assert.assertEquals(0L, ((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.tools.ModelIterator)iterator).getSolvingEngine()).getSolvingEngine()).getStat().get("decisions"));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.tools.ModelIterator)iterator).getSolvingEngine()).getSolvingEngine()).getStat().containsKey("starts"));
        Assert.assertEquals(1, ((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.tools.ModelIterator)iterator).getSolvingEngine()).getSolvingEngine()).getStat().get("starts"));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.tools.ModelIterator)iterator).getSolvingEngine()).getSolvingEngine()).getStat().containsKey("rootSimplifications"));
        Assert.assertEquals(0L, ((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.tools.ModelIterator)iterator).getSolvingEngine()).getSolvingEngine()).getStat().get("rootSimplifications"));
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.tools.ModelIterator)iterator).getSolvingEngine()).getSolvingEngine()).getStat().containsKey("reducedliterals"));
        Assert.assertEquals(0L, ((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.tools.ModelIterator)iterator).getSolvingEngine()).getSolvingEngine()).getStat().get("reducedliterals"));
        Assert.assertFalse(((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.tools.ModelIterator)iterator).getSolvingEngine()).getSolvingEngine()).isDBSimplificationAllowed());
        Assert.assertFalse(((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.tools.ModelIterator)iterator).getSolvingEngine()).getSolvingEngine()).isVerbose());
        Assert.assertEquals("c ", ((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.tools.ModelIterator)iterator).getSolvingEngine()).getSolvingEngine()).getLogPrefix());
        Assert.assertFalse(((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.tools.ModelIterator)iterator).getSolvingEngine()).getSolvingEngine()).isSolverKeptHot());
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.tools.ModelIterator)iterator).getSolvingEngine()).getSolvingEngine()).isSatisfiable());
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.tools.ModelIterator)iterator).getSolvingEngine()).isSatisfiable());
        IVecInt clause = new VecInt();
        Assert.assertEquals("", ((org.sat4j.core.VecInt)clause).toString());
        Assert.assertTrue(((org.sat4j.core.VecInt)clause).isEmpty());
        for (int i = 1; i < 100; i++) {
            clause.push(i);
        }
        try {
            IConstr o_testGlobalTimeoutIterator__13 = iterator.addClause(clause);
            Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testGlobalTimeoutIterator__13).isSatisfied());
            Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testGlobalTimeoutIterator__13).getActivity())), 0.1);
            int[] array_678520478 = new int[]{2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32, 34, 36, 38, 40, 42, 44, 46, 48, 50, 52, 54, 56, 58, 60, 62, 64, 66, 68, 70, 72, 74, 76, 78, 80, 82, 84, 86, 88, 90, 92, 94, 96, 98, 100, 102, 104, 106, 108, 110, 112, 114, 116, 118, 120, 122, 124, 126, 128, 130, 132, 134, 136, 138, 140, 142, 144, 146, 148, 150, 152, 154, 156, 158, 160, 162, 164, 166, 168, 170, 172, 174, 176, 178, 180, 182, 184, 186, 188, 190, 192, 194, 196, 198};
            	int[] array_624869627 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testGlobalTimeoutIterator__13).getLits();
            	for(int ii = 0; ii <array_678520478.length; ii++) {
            		org.junit.Assert.assertEquals(array_678520478[ii], array_624869627[ii]);
            	};
            Assert.assertEquals("1[?] 2[?] 3[?] 4[?] 5[?] 6[?] 7[?] 8[?] 9[?] 10[?] 11[?] 12[?] 13[?] 14[?] 15[?] 16[?] 17[?] 18[?] 19[?] 20[?] 21[?] 22[?] 23[?] 24[?] 25[?] 26[?] 27[?] 28[?] 29[?] 30[?] 31[?] 32[?] 33[?] 34[?] 35[?] 36[?] 37[?] 38[?] 39[?] 40[?] 41[?] 42[?] 43[?] 44[?] 45[?] 46[?] 47[?] 48[?] 49[?] 50[?] 51[?] 52[?] 53[?] 54[?] 55[?] 56[?] 57[?] 58[?] 59[?] 60[?] 61[?] 62[?] 63[?] 64[?] 65[?] 66[?] 67[?] 68[?] 69[?] 70[?] 71[?] 72[?] 73[?] 74[?] 75[?] 76[?] 77[?] 78[?] 79[?] 80[?] 81[?] 82[?] 83[?] 84[?] 85[?] 86[?] 87[?] 88[?] 89[?] 90[?] 91[?] 92[?] 93[?] 94[?] 95[?] 96[?] 97[?] 98[?] 99[?] ", ((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testGlobalTimeoutIterator__13).toString());
            Assert.assertEquals(100, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testGlobalTimeoutIterator__13).hashCode())));
            iterator.setTimeout(3);
            while (iterator.isSatisfiable()) {
                iterator.model();
            } 
        } catch (TimeoutException e) {
        } catch (ContradictionException e) {
        }
        Assert.assertTrue(((org.sat4j.tools.ModelIterator)iterator).isSatisfiable());
        Assert.assertEquals(3000L, ((long) (((org.sat4j.tools.ModelIterator)iterator).getTimeoutMs())));
        Assert.assertEquals(3, ((int) (((org.sat4j.tools.ModelIterator)iterator).getTimeout())));
        Assert.assertFalse(((org.sat4j.tools.ModelIterator)iterator).isDBSimplificationAllowed());
        Assert.assertFalse(((org.sat4j.tools.ModelIterator)iterator).isVerbose());
        Assert.assertEquals("c ", ((org.sat4j.tools.ModelIterator)iterator).getLogPrefix());
        Assert.assertFalse(((org.sat4j.tools.ModelIterator)iterator).isSolverKeptHot());
        Assert.assertEquals(3000L, ((long) (((org.sat4j.specs.ISolver)((org.sat4j.tools.ModelIterator)iterator).getSolvingEngine()).getTimeoutMs())));
        Assert.assertEquals(3, ((int) (((org.sat4j.specs.ISolver)((org.sat4j.tools.ModelIterator)iterator).getSolvingEngine()).getTimeout())));
        Assert.assertFalse(((org.sat4j.specs.ISolver)((org.sat4j.tools.ModelIterator)iterator).getSolvingEngine()).isDBSimplificationAllowed());
        Assert.assertFalse(((org.sat4j.specs.ISolver)((org.sat4j.tools.ModelIterator)iterator).getSolvingEngine()).isVerbose());
        Assert.assertEquals("c ", ((org.sat4j.specs.ISolver)((org.sat4j.tools.ModelIterator)iterator).getSolvingEngine()).getLogPrefix());
        Assert.assertFalse(((org.sat4j.specs.ISolver)((org.sat4j.tools.ModelIterator)iterator).getSolvingEngine()).isSolverKeptHot());
        Assert.assertEquals(3000L, ((long) (((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.tools.ModelIterator)iterator).getSolvingEngine()).getSolvingEngine()).getTimeoutMs())));
        Assert.assertEquals(3, ((int) (((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.tools.ModelIterator)iterator).getSolvingEngine()).getSolvingEngine()).getTimeout())));
        Assert.assertFalse(((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.tools.ModelIterator)iterator).getSolvingEngine()).getSolvingEngine()).isDBSimplificationAllowed());
        Assert.assertFalse(((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.tools.ModelIterator)iterator).getSolvingEngine()).getSolvingEngine()).isVerbose());
        Assert.assertEquals("c ", ((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.tools.ModelIterator)iterator).getSolvingEngine()).getSolvingEngine()).getLogPrefix());
        Assert.assertFalse(((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.tools.ModelIterator)iterator).getSolvingEngine()).getSolvingEngine()).isSolverKeptHot());
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.specs.ISolver)((org.sat4j.tools.ModelIterator)iterator).getSolvingEngine()).getSolvingEngine()).isSatisfiable());
        Assert.assertTrue(((org.sat4j.specs.ISolver)((org.sat4j.tools.ModelIterator)iterator).getSolvingEngine()).isSatisfiable());
        Assert.assertEquals("1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,88,89,90,91,92,93,94,95,96,97,98,99", ((org.sat4j.core.VecInt)clause).toString());
        Assert.assertEquals(50, ((int) (((org.sat4j.core.VecInt)clause).hashCode())));
        Assert.assertFalse(((org.sat4j.core.VecInt)clause).isEmpty());
    }
}

