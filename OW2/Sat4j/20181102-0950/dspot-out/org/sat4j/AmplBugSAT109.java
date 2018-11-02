package org.sat4j;


import org.junit.Assert;
import org.junit.Test;
import org.sat4j.core.VecInt;
import org.sat4j.minisat.SolverFactory;
import org.sat4j.minisat.constraints.cnf.OriginalBinaryClause;
import org.sat4j.minisat.constraints.cnf.UnitClause;
import org.sat4j.specs.ContradictionException;
import org.sat4j.specs.IConstr;
import org.sat4j.specs.ISolver;
import org.sat4j.specs.IVecInt;
import org.sat4j.specs.TimeoutException;
import org.sat4j.tools.ModelIterator;
import org.sat4j.tools.SubModelIterator;


public class AmplBugSAT109 {
    @Test(timeout = 30000)
    public void testModelIteratorlitNum1() throws Exception, ContradictionException, TimeoutException {
        ModelIterator iterator = new ModelIterator(SolverFactory.newDefault());
        Assert.assertTrue(((ModelIterator) (iterator)).isSatisfiable());
        Assert.assertEquals(2147483, ((int) (((ModelIterator) (iterator)).getTimeout())));
        Assert.assertFalse(((ModelIterator) (iterator)).isDBSimplificationAllowed());
        Assert.assertEquals(2147483647L, ((long) (((ModelIterator) (iterator)).getTimeoutMs())));
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
        Assert.assertFalse(((ModelIterator) (iterator)).isVerbose());
        Assert.assertEquals("c ", ((ModelIterator) (iterator)).getLogPrefix());
        Assert.assertFalse(((ModelIterator) (iterator)).isSolverKeptHot());
        Assert.assertEquals(2147483, ((int) (((ISolver) (((ModelIterator) (iterator)).getSolvingEngine())).getTimeout())));
        Assert.assertFalse(((ISolver) (((ModelIterator) (iterator)).getSolvingEngine())).isDBSimplificationAllowed());
        Assert.assertEquals(2147483647L, ((long) (((ISolver) (((ModelIterator) (iterator)).getSolvingEngine())).getTimeoutMs())));
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
        Assert.assertFalse(((ISolver) (((ModelIterator) (iterator)).getSolvingEngine())).isVerbose());
        Assert.assertEquals("c ", ((ISolver) (((ModelIterator) (iterator)).getSolvingEngine())).getLogPrefix());
        Assert.assertFalse(((ISolver) (((ModelIterator) (iterator)).getSolvingEngine())).isSolverKeptHot());
        Assert.assertEquals(2147483, ((int) (((ISolver) (((ISolver) (((ModelIterator) (iterator)).getSolvingEngine())).getSolvingEngine())).getTimeout())));
        Assert.assertFalse(((ISolver) (((ISolver) (((ModelIterator) (iterator)).getSolvingEngine())).getSolvingEngine())).isDBSimplificationAllowed());
        Assert.assertEquals(2147483647L, ((long) (((ISolver) (((ISolver) (((ModelIterator) (iterator)).getSolvingEngine())).getSolvingEngine())).getTimeoutMs())));
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
        Assert.assertFalse(((ISolver) (((ISolver) (((ModelIterator) (iterator)).getSolvingEngine())).getSolvingEngine())).isVerbose());
        Assert.assertEquals("c ", ((ISolver) (((ISolver) (((ModelIterator) (iterator)).getSolvingEngine())).getSolvingEngine())).getLogPrefix());
        Assert.assertFalse(((ISolver) (((ISolver) (((ModelIterator) (iterator)).getSolvingEngine())).getSolvingEngine())).isSolverKeptHot());
        Assert.assertTrue(((ISolver) (((ISolver) (((ModelIterator) (iterator)).getSolvingEngine())).getSolvingEngine())).isSatisfiable());
        Assert.assertTrue(((ISolver) (((ModelIterator) (iterator)).getSolvingEngine())).isSatisfiable());
        IConstr o_testModelIteratorlitNum1__4 = iterator.addClause(new VecInt(new int[]{ 2, 2 }));
        Assert.assertTrue(((UnitClause) (o_testModelIteratorlitNum1__4)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_testModelIteratorlitNum1__4)).getActivity())), 0.1);
        Assert.assertEquals("2", ((UnitClause) (o_testModelIteratorlitNum1__4)).toString());
        IConstr o_testModelIteratorlitNum1__6 = iterator.addClause(new VecInt(new int[]{ -1, -2 }));
        Assert.assertTrue(((UnitClause) (o_testModelIteratorlitNum1__6)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_testModelIteratorlitNum1__6)).getActivity())), 0.1);
        Assert.assertEquals("-1", ((UnitClause) (o_testModelIteratorlitNum1__6)).toString());
        IConstr o_testModelIteratorlitNum1__10 = iterator.addClause(new VecInt(new int[]{ -3, -4 }));
        Assert.assertFalse(((OriginalBinaryClause) (o_testModelIteratorlitNum1__10)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testModelIteratorlitNum1__10)).getActivity())), 0.1);
        int[] array_960178132 = new int[]{7,9};
        	int[] array_1131787365 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testModelIteratorlitNum1__10).getLits();
        	for(int ii = 0; ii <array_960178132.length; ii++) {
        		org.junit.Assert.assertEquals(array_960178132[ii], array_1131787365[ii]);
        	};
        Assert.assertEquals("-3[?] -4[?]", ((OriginalBinaryClause) (o_testModelIteratorlitNum1__10)).toString());
        Assert.assertEquals(8, ((int) (((OriginalBinaryClause) (o_testModelIteratorlitNum1__10)).hashCode())));
        IConstr o_testModelIteratorlitNum1__14 = iterator.addClause(new VecInt(new int[]{ 5, 6 }));
        Assert.assertFalse(((OriginalBinaryClause) (o_testModelIteratorlitNum1__14)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testModelIteratorlitNum1__14)).getActivity())), 0.1);
        int[] array_1240554721 = new int[]{10,12};
        	int[] array_1148018720 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testModelIteratorlitNum1__14).getLits();
        	for(int ii = 0; ii <array_1240554721.length; ii++) {
        		org.junit.Assert.assertEquals(array_1240554721[ii], array_1148018720[ii]);
        	};
        Assert.assertEquals("5[?] 6[?]", ((OriginalBinaryClause) (o_testModelIteratorlitNum1__14)).toString());
        Assert.assertEquals(11, ((int) (((OriginalBinaryClause) (o_testModelIteratorlitNum1__14)).hashCode())));
        IConstr o_testModelIteratorlitNum1__16 = iterator.addClause(new VecInt(new int[]{ -5, -6 }));
        Assert.assertFalse(((OriginalBinaryClause) (o_testModelIteratorlitNum1__16)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testModelIteratorlitNum1__16)).getActivity())), 0.1);
        int[] array_1063632618 = new int[]{11,13};
        	int[] array_804819380 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testModelIteratorlitNum1__16).getLits();
        	for(int ii = 0; ii <array_1063632618.length; ii++) {
        		org.junit.Assert.assertEquals(array_1063632618[ii], array_804819380[ii]);
        	};
        Assert.assertEquals("-5[?] -6[?]", ((OriginalBinaryClause) (o_testModelIteratorlitNum1__16)).toString());
        Assert.assertEquals(12, ((int) (((OriginalBinaryClause) (o_testModelIteratorlitNum1__16)).hashCode())));
        iterator.addClause(new VecInt(new int[]{ -1, 3 }));
        int counter = 0;
        int[] sub = new int[0];
        while (iterator.isSatisfiable()) {
            sub = iterator.model();
            counter++;
        } 
    }

    @Test(timeout = 30000)
    public void testModelIteratorlitNum18() throws Exception, ContradictionException, TimeoutException {
        ModelIterator iterator = new ModelIterator(SolverFactory.newDefault());
        Assert.assertTrue(((ModelIterator) (iterator)).isSatisfiable());
        Assert.assertEquals(2147483, ((int) (((ModelIterator) (iterator)).getTimeout())));
        Assert.assertFalse(((ModelIterator) (iterator)).isDBSimplificationAllowed());
        Assert.assertEquals(2147483647L, ((long) (((ModelIterator) (iterator)).getTimeoutMs())));
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
        Assert.assertFalse(((ModelIterator) (iterator)).isVerbose());
        Assert.assertEquals("c ", ((ModelIterator) (iterator)).getLogPrefix());
        Assert.assertFalse(((ModelIterator) (iterator)).isSolverKeptHot());
        Assert.assertEquals(2147483, ((int) (((ISolver) (((ModelIterator) (iterator)).getSolvingEngine())).getTimeout())));
        Assert.assertFalse(((ISolver) (((ModelIterator) (iterator)).getSolvingEngine())).isDBSimplificationAllowed());
        Assert.assertEquals(2147483647L, ((long) (((ISolver) (((ModelIterator) (iterator)).getSolvingEngine())).getTimeoutMs())));
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
        Assert.assertFalse(((ISolver) (((ModelIterator) (iterator)).getSolvingEngine())).isVerbose());
        Assert.assertEquals("c ", ((ISolver) (((ModelIterator) (iterator)).getSolvingEngine())).getLogPrefix());
        Assert.assertFalse(((ISolver) (((ModelIterator) (iterator)).getSolvingEngine())).isSolverKeptHot());
        Assert.assertEquals(2147483, ((int) (((ISolver) (((ISolver) (((ModelIterator) (iterator)).getSolvingEngine())).getSolvingEngine())).getTimeout())));
        Assert.assertFalse(((ISolver) (((ISolver) (((ModelIterator) (iterator)).getSolvingEngine())).getSolvingEngine())).isDBSimplificationAllowed());
        Assert.assertEquals(2147483647L, ((long) (((ISolver) (((ISolver) (((ModelIterator) (iterator)).getSolvingEngine())).getSolvingEngine())).getTimeoutMs())));
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
        Assert.assertFalse(((ISolver) (((ISolver) (((ModelIterator) (iterator)).getSolvingEngine())).getSolvingEngine())).isVerbose());
        Assert.assertEquals("c ", ((ISolver) (((ISolver) (((ModelIterator) (iterator)).getSolvingEngine())).getSolvingEngine())).getLogPrefix());
        Assert.assertFalse(((ISolver) (((ISolver) (((ModelIterator) (iterator)).getSolvingEngine())).getSolvingEngine())).isSolverKeptHot());
        Assert.assertTrue(((ISolver) (((ISolver) (((ModelIterator) (iterator)).getSolvingEngine())).getSolvingEngine())).isSatisfiable());
        Assert.assertTrue(((ISolver) (((ModelIterator) (iterator)).getSolvingEngine())).isSatisfiable());
        IConstr o_testModelIteratorlitNum18__4 = iterator.addClause(new VecInt(new int[]{ 1, 2 }));
        Assert.assertFalse(((OriginalBinaryClause) (o_testModelIteratorlitNum18__4)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testModelIteratorlitNum18__4)).getActivity())), 0.1);
        int[] array_432070049 = new int[]{2,4};
        	int[] array_1644972435 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testModelIteratorlitNum18__4).getLits();
        	for(int ii = 0; ii <array_432070049.length; ii++) {
        		org.junit.Assert.assertEquals(array_432070049[ii], array_1644972435[ii]);
        	};
        Assert.assertEquals("1[?] 2[?]", ((OriginalBinaryClause) (o_testModelIteratorlitNum18__4)).toString());
        Assert.assertEquals(3, ((int) (((OriginalBinaryClause) (o_testModelIteratorlitNum18__4)).hashCode())));
        IConstr o_testModelIteratorlitNum18__6 = iterator.addClause(new VecInt(new int[]{ -1, -1 }));
        Assert.assertTrue(((UnitClause) (o_testModelIteratorlitNum18__6)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((UnitClause) (o_testModelIteratorlitNum18__6)).getActivity())), 0.1);
        Assert.assertEquals("-1", ((UnitClause) (o_testModelIteratorlitNum18__6)).toString());
        IConstr o_testModelIteratorlitNum18__10 = iterator.addClause(new VecInt(new int[]{ -3, -4 }));
        Assert.assertFalse(((OriginalBinaryClause) (o_testModelIteratorlitNum18__10)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testModelIteratorlitNum18__10)).getActivity())), 0.1);
        int[] array_932571789 = new int[]{7,9};
        	int[] array_1277197333 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testModelIteratorlitNum18__10).getLits();
        	for(int ii = 0; ii <array_932571789.length; ii++) {
        		org.junit.Assert.assertEquals(array_932571789[ii], array_1277197333[ii]);
        	};
        Assert.assertEquals("-3[?] -4[?]", ((OriginalBinaryClause) (o_testModelIteratorlitNum18__10)).toString());
        Assert.assertEquals(8, ((int) (((OriginalBinaryClause) (o_testModelIteratorlitNum18__10)).hashCode())));
        IConstr o_testModelIteratorlitNum18__14 = iterator.addClause(new VecInt(new int[]{ 5, 6 }));
        Assert.assertFalse(((OriginalBinaryClause) (o_testModelIteratorlitNum18__14)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testModelIteratorlitNum18__14)).getActivity())), 0.1);
        int[] array_451559378 = new int[]{10,12};
        	int[] array_539305492 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testModelIteratorlitNum18__14).getLits();
        	for(int ii = 0; ii <array_451559378.length; ii++) {
        		org.junit.Assert.assertEquals(array_451559378[ii], array_539305492[ii]);
        	};
        Assert.assertEquals("5[?] 6[?]", ((OriginalBinaryClause) (o_testModelIteratorlitNum18__14)).toString());
        Assert.assertEquals(11, ((int) (((OriginalBinaryClause) (o_testModelIteratorlitNum18__14)).hashCode())));
        IConstr o_testModelIteratorlitNum18__16 = iterator.addClause(new VecInt(new int[]{ -5, -6 }));
        Assert.assertFalse(((OriginalBinaryClause) (o_testModelIteratorlitNum18__16)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testModelIteratorlitNum18__16)).getActivity())), 0.1);
        int[] array_2041404087 = new int[]{11,13};
        	int[] array_806323824 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testModelIteratorlitNum18__16).getLits();
        	for(int ii = 0; ii <array_2041404087.length; ii++) {
        		org.junit.Assert.assertEquals(array_2041404087[ii], array_806323824[ii]);
        	};
        Assert.assertEquals("-5[?] -6[?]", ((OriginalBinaryClause) (o_testModelIteratorlitNum18__16)).toString());
        Assert.assertEquals(12, ((int) (((OriginalBinaryClause) (o_testModelIteratorlitNum18__16)).hashCode())));
        iterator.addClause(new VecInt(new int[]{ -1, 3 }));
        int counter = 0;
        int[] sub = new int[0];
        while (iterator.isSatisfiable()) {
            sub = iterator.model();
            counter++;
        } 
    }

    @Test(timeout = 30000)
    public void testModelIteratorlitNum2_failAssert0() throws Exception, ContradictionException, TimeoutException {
        try {
            ModelIterator iterator = new ModelIterator(SolverFactory.newDefault());
            iterator.addClause(new VecInt(new int[]{ 0, 2 }));
            iterator.addClause(new VecInt(new int[]{ -1, -2 }));
            iterator.addClause(new VecInt(new int[]{ -3, -4 }));
            iterator.addClause(new VecInt(new int[]{ 5, 6 }));
            iterator.addClause(new VecInt(new int[]{ -5, -6 }));
            iterator.addClause(new VecInt(new int[]{ -1, 3 }));
            int counter = 0;
            int[] sub = new int[0];
            while (iterator.isSatisfiable()) {
                sub = iterator.model();
                counter++;
            } 
            org.junit.Assert.fail("testModelIteratorlitNum2 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testModelIteratorlitNum3_failAssert1() throws Exception, ContradictionException, TimeoutException {
        try {
            ModelIterator iterator = new ModelIterator(SolverFactory.newDefault());
            iterator.addClause(new VecInt(new int[]{ Integer.MAX_VALUE, 2 }));
            iterator.addClause(new VecInt(new int[]{ -1, -2 }));
            iterator.addClause(new VecInt(new int[]{ -3, -4 }));
            iterator.addClause(new VecInt(new int[]{ 5, 6 }));
            iterator.addClause(new VecInt(new int[]{ -5, -6 }));
            iterator.addClause(new VecInt(new int[]{ -1, 3 }));
            int counter = 0;
            int[] sub = new int[0];
            while (iterator.isSatisfiable()) {
                sub = iterator.model();
                counter++;
            } 
            org.junit.Assert.fail("testModelIteratorlitNum3 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testModelIteratorlitNum4_failAssert2() throws Exception, ContradictionException, TimeoutException {
        try {
            ModelIterator iterator = new ModelIterator(SolverFactory.newDefault());
            iterator.addClause(new VecInt(new int[]{ Integer.MIN_VALUE, 2 }));
            iterator.addClause(new VecInt(new int[]{ -1, -2 }));
            iterator.addClause(new VecInt(new int[]{ -3, -4 }));
            iterator.addClause(new VecInt(new int[]{ 5, 6 }));
            iterator.addClause(new VecInt(new int[]{ -5, -6 }));
            iterator.addClause(new VecInt(new int[]{ -1, 3 }));
            int counter = 0;
            int[] sub = new int[0];
            while (iterator.isSatisfiable()) {
                sub = iterator.model();
                counter++;
            } 
            org.junit.Assert.fail("testModelIteratorlitNum4 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-2147483648", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testModelIteratorlitNum8_failAssert3() throws Exception, ContradictionException, TimeoutException {
        try {
            ModelIterator iterator = new ModelIterator(SolverFactory.newDefault());
            iterator.addClause(new VecInt(new int[]{ 1, Integer.MAX_VALUE }));
            iterator.addClause(new VecInt(new int[]{ -1, -2 }));
            iterator.addClause(new VecInt(new int[]{ -3, -4 }));
            iterator.addClause(new VecInt(new int[]{ 5, 6 }));
            iterator.addClause(new VecInt(new int[]{ -5, -6 }));
            iterator.addClause(new VecInt(new int[]{ -1, 3 }));
            int counter = 0;
            int[] sub = new int[0];
            while (iterator.isSatisfiable()) {
                sub = iterator.model();
                counter++;
            } 
            org.junit.Assert.fail("testModelIteratorlitNum8 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testModelIteratorlitNum10_failAssert5() throws Exception, ContradictionException, TimeoutException {
        try {
            ModelIterator iterator = new ModelIterator(SolverFactory.newDefault());
            iterator.addClause(new VecInt(new int[]{ 1, 0 }));
            iterator.addClause(new VecInt(new int[]{ -1, -2 }));
            iterator.addClause(new VecInt(new int[]{ -3, -4 }));
            iterator.addClause(new VecInt(new int[]{ 5, 6 }));
            iterator.addClause(new VecInt(new int[]{ -5, -6 }));
            iterator.addClause(new VecInt(new int[]{ -1, 3 }));
            int counter = 0;
            int[] sub = new int[0];
            while (iterator.isSatisfiable()) {
                sub = iterator.model();
                counter++;
            } 
            org.junit.Assert.fail("testModelIteratorlitNum10 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testModelIteratorlitNum13_failAssert6() throws Exception, ContradictionException, TimeoutException {
        try {
            ModelIterator iterator = new ModelIterator(SolverFactory.newDefault());
            iterator.addClause(new VecInt(new int[]{ 1, 2 }));
            iterator.addClause(new VecInt(new int[]{ -0, -2 }));
            iterator.addClause(new VecInt(new int[]{ -3, -4 }));
            iterator.addClause(new VecInt(new int[]{ 5, 6 }));
            iterator.addClause(new VecInt(new int[]{ -5, -6 }));
            iterator.addClause(new VecInt(new int[]{ -1, 3 }));
            int counter = 0;
            int[] sub = new int[0];
            while (iterator.isSatisfiable()) {
                sub = iterator.model();
                counter++;
            } 
            org.junit.Assert.fail("testModelIteratorlitNum13 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testModelIteratorlitNum14_failAssert7() throws Exception, ContradictionException, TimeoutException {
        try {
            ModelIterator iterator = new ModelIterator(SolverFactory.newDefault());
            iterator.addClause(new VecInt(new int[]{ 1, 2 }));
            iterator.addClause(new VecInt(new int[]{ -(Integer.MAX_VALUE), -2 }));
            iterator.addClause(new VecInt(new int[]{ -3, -4 }));
            iterator.addClause(new VecInt(new int[]{ 5, 6 }));
            iterator.addClause(new VecInt(new int[]{ -5, -6 }));
            iterator.addClause(new VecInt(new int[]{ -1, 3 }));
            int counter = 0;
            int[] sub = new int[0];
            while (iterator.isSatisfiable()) {
                sub = iterator.model();
                counter++;
            } 
            org.junit.Assert.fail("testModelIteratorlitNum14 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testModelIteratorlitNum25_failAssert12() throws Exception, ContradictionException, TimeoutException {
        try {
            ModelIterator iterator = new ModelIterator(SolverFactory.newDefault());
            iterator.addClause(new VecInt(new int[]{ 1, 2 }));
            iterator.addClause(new VecInt(new int[]{ -1, -2 }));
            iterator.addClause(new VecInt(new int[]{ -(Integer.MAX_VALUE), -4 }));
            iterator.addClause(new VecInt(new int[]{ 5, 6 }));
            iterator.addClause(new VecInt(new int[]{ -5, -6 }));
            iterator.addClause(new VecInt(new int[]{ -1, 3 }));
            int counter = 0;
            int[] sub = new int[0];
            while (iterator.isSatisfiable()) {
                sub = iterator.model();
                counter++;
            } 
            org.junit.Assert.fail("testModelIteratorlitNum25 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testModelIteratorlitNum27_failAssert14() throws Exception, ContradictionException, TimeoutException {
        try {
            ModelIterator iterator = new ModelIterator(SolverFactory.newDefault());
            iterator.addClause(new VecInt(new int[]{ 1, 2 }));
            iterator.addClause(new VecInt(new int[]{ -1, -2 }));
            iterator.addClause(new VecInt(new int[]{ -0, -4 }));
            iterator.addClause(new VecInt(new int[]{ 5, 6 }));
            iterator.addClause(new VecInt(new int[]{ -5, -6 }));
            iterator.addClause(new VecInt(new int[]{ -1, 3 }));
            int counter = 0;
            int[] sub = new int[0];
            while (iterator.isSatisfiable()) {
                sub = iterator.model();
                counter++;
            } 
            org.junit.Assert.fail("testModelIteratorlitNum27 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testModelIteratorlitNum60_failAssert30() throws Exception, ContradictionException, TimeoutException {
        try {
            ModelIterator iterator = new ModelIterator(SolverFactory.newDefault());
            iterator.addClause(new VecInt(new int[]{ 1, 2 }));
            iterator.addClause(new VecInt(new int[]{ -1, -2 }));
            iterator.addClause(new VecInt(new int[]{ -3, -4 }));
            iterator.addClause(new VecInt(new int[]{ 5, 6 }));
            iterator.addClause(new VecInt(new int[]{ -5, -6 }));
            iterator.addClause(new VecInt(new int[]{ -0, 3 }));
            int counter = 0;
            int[] sub = new int[0];
            while (iterator.isSatisfiable()) {
                sub = iterator.model();
                counter++;
            } 
            org.junit.Assert.fail("testModelIteratorlitNum60 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testModelIteratorlitNum61_failAssert31() throws Exception, ContradictionException, TimeoutException {
        try {
            ModelIterator iterator = new ModelIterator(SolverFactory.newDefault());
            iterator.addClause(new VecInt(new int[]{ 1, 2 }));
            iterator.addClause(new VecInt(new int[]{ -1, -2 }));
            iterator.addClause(new VecInt(new int[]{ -3, -4 }));
            iterator.addClause(new VecInt(new int[]{ 5, 6 }));
            iterator.addClause(new VecInt(new int[]{ -5, -6 }));
            iterator.addClause(new VecInt(new int[]{ -(Integer.MAX_VALUE), 3 }));
            int counter = 0;
            int[] sub = new int[0];
            while (iterator.isSatisfiable()) {
                sub = iterator.model();
                counter++;
            } 
            org.junit.Assert.fail("testModelIteratorlitNum61 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testModelIteratorlitNum67_failAssert34() throws Exception, ContradictionException, TimeoutException {
        try {
            ModelIterator iterator = new ModelIterator(SolverFactory.newDefault());
            iterator.addClause(new VecInt(new int[]{ 1, 2 }));
            iterator.addClause(new VecInt(new int[]{ -1, -2 }));
            iterator.addClause(new VecInt(new int[]{ -3, -4 }));
            iterator.addClause(new VecInt(new int[]{ 5, 6 }));
            iterator.addClause(new VecInt(new int[]{ -5, -6 }));
            iterator.addClause(new VecInt(new int[]{ -1, Integer.MIN_VALUE }));
            int counter = 0;
            int[] sub = new int[0];
            while (iterator.isSatisfiable()) {
                sub = iterator.model();
                counter++;
            } 
            org.junit.Assert.fail("testModelIteratorlitNum67 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-2147483648", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testModelIteratorlitNum18litNum1291_failAssert39() throws Exception, ContradictionException, TimeoutException {
        try {
            ModelIterator iterator = new ModelIterator(SolverFactory.newDefault());
            IConstr o_testModelIteratorlitNum18__4 = iterator.addClause(new VecInt(new int[]{ 1, 2 }));
            int[] array_432070049 = new int[]{2,4};
            	int[] array_1644972435 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testModelIteratorlitNum18__4).getLits();
            	for(int ii = 0; ii <array_432070049.length; ii++) {
            		org.junit.Assert.assertEquals(array_432070049[ii], array_1644972435[ii]);
            	};
            IConstr o_testModelIteratorlitNum18__6 = iterator.addClause(new VecInt(new int[]{ -1, -1 }));
            IConstr o_testModelIteratorlitNum18__10 = iterator.addClause(new VecInt(new int[]{ -3, -4 }));
            int[] array_932571789 = new int[]{7,9};
            	int[] array_1277197333 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testModelIteratorlitNum18__10).getLits();
            	for(int ii = 0; ii <array_932571789.length; ii++) {
            		org.junit.Assert.assertEquals(array_932571789[ii], array_1277197333[ii]);
            	};
            IConstr o_testModelIteratorlitNum18__14 = iterator.addClause(new VecInt(new int[]{ 5, 6 }));
            int[] array_451559378 = new int[]{10,12};
            	int[] array_539305492 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testModelIteratorlitNum18__14).getLits();
            	for(int ii = 0; ii <array_451559378.length; ii++) {
            		org.junit.Assert.assertEquals(array_451559378[ii], array_539305492[ii]);
            	};
            IConstr o_testModelIteratorlitNum18__16 = iterator.addClause(new VecInt(new int[]{ -(Integer.MAX_VALUE), -6 }));
            int[] array_2041404087 = new int[]{11,13};
            	int[] array_806323824 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testModelIteratorlitNum18__16).getLits();
            	for(int ii = 0; ii <array_2041404087.length; ii++) {
            		org.junit.Assert.assertEquals(array_2041404087[ii], array_806323824[ii]);
            	};
            iterator.addClause(new VecInt(new int[]{ -1, 3 }));
            int counter = 0;
            int[] sub = new int[0];
            while (iterator.isSatisfiable()) {
                sub = iterator.model();
                counter++;
            } 
            org.junit.Assert.fail("testModelIteratorlitNum18litNum1291 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testModelIteratorlitNum18litNum1314_failAssert41() throws Exception, ContradictionException, TimeoutException {
        try {
            ModelIterator iterator = new ModelIterator(SolverFactory.newDefault());
            IConstr o_testModelIteratorlitNum18__4 = iterator.addClause(new VecInt(new int[]{ 1, 2 }));
            int[] array_432070049 = new int[]{2,4};
            	int[] array_1644972435 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testModelIteratorlitNum18__4).getLits();
            	for(int ii = 0; ii <array_432070049.length; ii++) {
            		org.junit.Assert.assertEquals(array_432070049[ii], array_1644972435[ii]);
            	};
            IConstr o_testModelIteratorlitNum18__6 = iterator.addClause(new VecInt(new int[]{ -1, -1 }));
            IConstr o_testModelIteratorlitNum18__10 = iterator.addClause(new VecInt(new int[]{ -3, -4 }));
            int[] array_932571789 = new int[]{7,9};
            	int[] array_1277197333 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testModelIteratorlitNum18__10).getLits();
            	for(int ii = 0; ii <array_932571789.length; ii++) {
            		org.junit.Assert.assertEquals(array_932571789[ii], array_1277197333[ii]);
            	};
            IConstr o_testModelIteratorlitNum18__14 = iterator.addClause(new VecInt(new int[]{ 5, 6 }));
            int[] array_451559378 = new int[]{10,12};
            	int[] array_539305492 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testModelIteratorlitNum18__14).getLits();
            	for(int ii = 0; ii <array_451559378.length; ii++) {
            		org.junit.Assert.assertEquals(array_451559378[ii], array_539305492[ii]);
            	};
            IConstr o_testModelIteratorlitNum18__16 = iterator.addClause(new VecInt(new int[]{ -5, -6 }));
            int[] array_2041404087 = new int[]{11,13};
            	int[] array_806323824 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testModelIteratorlitNum18__16).getLits();
            	for(int ii = 0; ii <array_2041404087.length; ii++) {
            		org.junit.Assert.assertEquals(array_2041404087[ii], array_806323824[ii]);
            	};
            iterator.addClause(new VecInt(new int[]{ -(Integer.MAX_VALUE), 3 }));
            int counter = 0;
            int[] sub = new int[0];
            while (iterator.isSatisfiable()) {
                sub = iterator.model();
                counter++;
            } 
            org.junit.Assert.fail("testModelIteratorlitNum18litNum1314 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testModelIteratorlitNum18litNum1013_failAssert43() throws Exception, ContradictionException, TimeoutException {
        try {
            ModelIterator iterator = new ModelIterator(SolverFactory.newDefault());
            IConstr o_testModelIteratorlitNum18__4 = iterator.addClause(new VecInt(new int[]{ 1, 2 }));
            int[] array_432070049 = new int[]{2,4};
            	int[] array_1644972435 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testModelIteratorlitNum18__4).getLits();
            	for(int ii = 0; ii <array_432070049.length; ii++) {
            		org.junit.Assert.assertEquals(array_432070049[ii], array_1644972435[ii]);
            	};
            IConstr o_testModelIteratorlitNum18__6 = iterator.addClause(new VecInt(new int[]{ -1, -1 }));
            IConstr o_testModelIteratorlitNum18__10 = iterator.addClause(new VecInt(new int[]{ -3, -(Integer.MAX_VALUE) }));
            int[] array_932571789 = new int[]{7,9};
            	int[] array_1277197333 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testModelIteratorlitNum18__10).getLits();
            	for(int ii = 0; ii <array_932571789.length; ii++) {
            		org.junit.Assert.assertEquals(array_932571789[ii], array_1277197333[ii]);
            	};
            IConstr o_testModelIteratorlitNum18__14 = iterator.addClause(new VecInt(new int[]{ 5, 6 }));
            int[] array_451559378 = new int[]{10,12};
            	int[] array_539305492 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testModelIteratorlitNum18__14).getLits();
            	for(int ii = 0; ii <array_451559378.length; ii++) {
            		org.junit.Assert.assertEquals(array_451559378[ii], array_539305492[ii]);
            	};
            IConstr o_testModelIteratorlitNum18__16 = iterator.addClause(new VecInt(new int[]{ -5, -6 }));
            int[] array_2041404087 = new int[]{11,13};
            	int[] array_806323824 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testModelIteratorlitNum18__16).getLits();
            	for(int ii = 0; ii <array_2041404087.length; ii++) {
            		org.junit.Assert.assertEquals(array_2041404087[ii], array_806323824[ii]);
            	};
            iterator.addClause(new VecInt(new int[]{ -1, 3 }));
            int counter = 0;
            int[] sub = new int[0];
            while (iterator.isSatisfiable()) {
                sub = iterator.model();
                counter++;
            } 
            org.junit.Assert.fail("testModelIteratorlitNum18litNum1013 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testModelIteratorlitNum18litNum1032_failAssert46() throws Exception, ContradictionException, TimeoutException {
        try {
            ModelIterator iterator = new ModelIterator(SolverFactory.newDefault());
            IConstr o_testModelIteratorlitNum18__4 = iterator.addClause(new VecInt(new int[]{ 1, 2 }));
            int[] array_432070049 = new int[]{2,4};
            	int[] array_1644972435 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testModelIteratorlitNum18__4).getLits();
            	for(int ii = 0; ii <array_432070049.length; ii++) {
            		org.junit.Assert.assertEquals(array_432070049[ii], array_1644972435[ii]);
            	};
            IConstr o_testModelIteratorlitNum18__6 = iterator.addClause(new VecInt(new int[]{ -1, -1 }));
            IConstr o_testModelIteratorlitNum18__10 = iterator.addClause(new VecInt(new int[]{ -3, -(Integer.MIN_VALUE) }));
            int[] array_932571789 = new int[]{7,9};
            	int[] array_1277197333 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testModelIteratorlitNum18__10).getLits();
            	for(int ii = 0; ii <array_932571789.length; ii++) {
            		org.junit.Assert.assertEquals(array_932571789[ii], array_1277197333[ii]);
            	};
            IConstr o_testModelIteratorlitNum18__14 = iterator.addClause(new VecInt(new int[]{ 5, 6 }));
            int[] array_451559378 = new int[]{10,12};
            	int[] array_539305492 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testModelIteratorlitNum18__14).getLits();
            	for(int ii = 0; ii <array_451559378.length; ii++) {
            		org.junit.Assert.assertEquals(array_451559378[ii], array_539305492[ii]);
            	};
            IConstr o_testModelIteratorlitNum18__16 = iterator.addClause(new VecInt(new int[]{ -5, -6 }));
            int[] array_2041404087 = new int[]{11,13};
            	int[] array_806323824 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testModelIteratorlitNum18__16).getLits();
            	for(int ii = 0; ii <array_2041404087.length; ii++) {
            		org.junit.Assert.assertEquals(array_2041404087[ii], array_806323824[ii]);
            	};
            iterator.addClause(new VecInt(new int[]{ -1, 3 }));
            int counter = 0;
            int[] sub = new int[0];
            while (iterator.isSatisfiable()) {
                sub = iterator.model();
                counter++;
            } 
            org.junit.Assert.fail("testModelIteratorlitNum18litNum1032 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-2147483648", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testModelIteratorlitNum18litNum824_failAssert48() throws Exception, ContradictionException, TimeoutException {
        try {
            ModelIterator iterator = new ModelIterator(SolverFactory.newDefault());
            IConstr o_testModelIteratorlitNum18__4 = iterator.addClause(new VecInt(new int[]{ 1, 2 }));
            int[] array_432070049 = new int[]{2,4};
            	int[] array_1644972435 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testModelIteratorlitNum18__4).getLits();
            	for(int ii = 0; ii <array_432070049.length; ii++) {
            		org.junit.Assert.assertEquals(array_432070049[ii], array_1644972435[ii]);
            	};
            IConstr o_testModelIteratorlitNum18__6 = iterator.addClause(new VecInt(new int[]{ -(Integer.MAX_VALUE), -1 }));
            IConstr o_testModelIteratorlitNum18__10 = iterator.addClause(new VecInt(new int[]{ -3, -4 }));
            int[] array_932571789 = new int[]{7,9};
            	int[] array_1277197333 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testModelIteratorlitNum18__10).getLits();
            	for(int ii = 0; ii <array_932571789.length; ii++) {
            		org.junit.Assert.assertEquals(array_932571789[ii], array_1277197333[ii]);
            	};
            IConstr o_testModelIteratorlitNum18__14 = iterator.addClause(new VecInt(new int[]{ 5, 6 }));
            int[] array_451559378 = new int[]{10,12};
            	int[] array_539305492 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testModelIteratorlitNum18__14).getLits();
            	for(int ii = 0; ii <array_451559378.length; ii++) {
            		org.junit.Assert.assertEquals(array_451559378[ii], array_539305492[ii]);
            	};
            IConstr o_testModelIteratorlitNum18__16 = iterator.addClause(new VecInt(new int[]{ -5, -6 }));
            int[] array_2041404087 = new int[]{11,13};
            	int[] array_806323824 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testModelIteratorlitNum18__16).getLits();
            	for(int ii = 0; ii <array_2041404087.length; ii++) {
            		org.junit.Assert.assertEquals(array_2041404087[ii], array_806323824[ii]);
            	};
            iterator.addClause(new VecInt(new int[]{ -1, 3 }));
            int counter = 0;
            int[] sub = new int[0];
            while (iterator.isSatisfiable()) {
                sub = iterator.model();
                counter++;
            } 
            org.junit.Assert.fail("testModelIteratorlitNum18litNum824 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testModelIteratorlitNum18litNum1350_failAssert54() throws Exception, ContradictionException, TimeoutException {
        try {
            ModelIterator iterator = new ModelIterator(SolverFactory.newDefault());
            IConstr o_testModelIteratorlitNum18__4 = iterator.addClause(new VecInt(new int[]{ 1, 2 }));
            int[] array_432070049 = new int[]{2,4};
            	int[] array_1644972435 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testModelIteratorlitNum18__4).getLits();
            	for(int ii = 0; ii <array_432070049.length; ii++) {
            		org.junit.Assert.assertEquals(array_432070049[ii], array_1644972435[ii]);
            	};
            IConstr o_testModelIteratorlitNum18__6 = iterator.addClause(new VecInt(new int[]{ -1, -1 }));
            IConstr o_testModelIteratorlitNum18__10 = iterator.addClause(new VecInt(new int[]{ -3, -4 }));
            int[] array_932571789 = new int[]{7,9};
            	int[] array_1277197333 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testModelIteratorlitNum18__10).getLits();
            	for(int ii = 0; ii <array_932571789.length; ii++) {
            		org.junit.Assert.assertEquals(array_932571789[ii], array_1277197333[ii]);
            	};
            IConstr o_testModelIteratorlitNum18__14 = iterator.addClause(new VecInt(new int[]{ 5, 6 }));
            int[] array_451559378 = new int[]{10,12};
            	int[] array_539305492 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testModelIteratorlitNum18__14).getLits();
            	for(int ii = 0; ii <array_451559378.length; ii++) {
            		org.junit.Assert.assertEquals(array_451559378[ii], array_539305492[ii]);
            	};
            IConstr o_testModelIteratorlitNum18__16 = iterator.addClause(new VecInt(new int[]{ -5, -6 }));
            int[] array_2041404087 = new int[]{11,13};
            	int[] array_806323824 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testModelIteratorlitNum18__16).getLits();
            	for(int ii = 0; ii <array_2041404087.length; ii++) {
            		org.junit.Assert.assertEquals(array_2041404087[ii], array_806323824[ii]);
            	};
            iterator.addClause(new VecInt(new int[]{ -1, 3 }));
            int counter = 0;
            int[] sub = new int[Integer.MIN_VALUE];
            while (iterator.isSatisfiable()) {
                sub = iterator.model();
                counter++;
            } 
            org.junit.Assert.fail("testModelIteratorlitNum18litNum1350 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testModelIteratorlitNum18litNum724_failAssert58() throws Exception, ContradictionException, TimeoutException {
        try {
            ModelIterator iterator = new ModelIterator(SolverFactory.newDefault());
            IConstr o_testModelIteratorlitNum18__4 = iterator.addClause(new VecInt(new int[]{ 1, Integer.MAX_VALUE }));
            int[] array_432070049 = new int[]{2,4};
            	int[] array_1644972435 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testModelIteratorlitNum18__4).getLits();
            	for(int ii = 0; ii <array_432070049.length; ii++) {
            		org.junit.Assert.assertEquals(array_432070049[ii], array_1644972435[ii]);
            	};
            IConstr o_testModelIteratorlitNum18__6 = iterator.addClause(new VecInt(new int[]{ -1, -1 }));
            IConstr o_testModelIteratorlitNum18__10 = iterator.addClause(new VecInt(new int[]{ -3, -4 }));
            int[] array_932571789 = new int[]{7,9};
            	int[] array_1277197333 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testModelIteratorlitNum18__10).getLits();
            	for(int ii = 0; ii <array_932571789.length; ii++) {
            		org.junit.Assert.assertEquals(array_932571789[ii], array_1277197333[ii]);
            	};
            IConstr o_testModelIteratorlitNum18__14 = iterator.addClause(new VecInt(new int[]{ 5, 6 }));
            int[] array_451559378 = new int[]{10,12};
            	int[] array_539305492 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testModelIteratorlitNum18__14).getLits();
            	for(int ii = 0; ii <array_451559378.length; ii++) {
            		org.junit.Assert.assertEquals(array_451559378[ii], array_539305492[ii]);
            	};
            IConstr o_testModelIteratorlitNum18__16 = iterator.addClause(new VecInt(new int[]{ -5, -6 }));
            int[] array_2041404087 = new int[]{11,13};
            	int[] array_806323824 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testModelIteratorlitNum18__16).getLits();
            	for(int ii = 0; ii <array_2041404087.length; ii++) {
            		org.junit.Assert.assertEquals(array_2041404087[ii], array_806323824[ii]);
            	};
            iterator.addClause(new VecInt(new int[]{ -1, 3 }));
            int counter = 0;
            int[] sub = new int[0];
            while (iterator.isSatisfiable()) {
                sub = iterator.model();
                counter++;
            } 
            org.junit.Assert.fail("testModelIteratorlitNum18litNum724 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testModelIteratorlitNum18litNum1032_failAssert46_add2741_failAssert61() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                ModelIterator iterator = new ModelIterator(SolverFactory.newDefault());
                IConstr o_testModelIteratorlitNum18__4 = iterator.addClause(new VecInt(new int[]{ 1, 2 }));
                int[] array_432070049 = new int[]{2,4};
                	int[] array_1644972435 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testModelIteratorlitNum18__4).getLits();
                	for(int ii = 0; ii <array_432070049.length; ii++) {
                		org.junit.Assert.assertEquals(array_432070049[ii], array_1644972435[ii]);
                	};
                IConstr o_testModelIteratorlitNum18__6 = iterator.addClause(new VecInt(new int[]{ -1, -1 }));
                iterator.addClause(new VecInt(new int[]{ -3, -(Integer.MIN_VALUE) }));
                IConstr o_testModelIteratorlitNum18__10 = iterator.addClause(new VecInt(new int[]{ -3, -(Integer.MIN_VALUE) }));
                int[] array_932571789 = new int[]{7,9};
                	int[] array_1277197333 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testModelIteratorlitNum18__10).getLits();
                	for(int ii = 0; ii <array_932571789.length; ii++) {
                		org.junit.Assert.assertEquals(array_932571789[ii], array_1277197333[ii]);
                	};
                IConstr o_testModelIteratorlitNum18__14 = iterator.addClause(new VecInt(new int[]{ 5, 6 }));
                int[] array_451559378 = new int[]{10,12};
                	int[] array_539305492 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testModelIteratorlitNum18__14).getLits();
                	for(int ii = 0; ii <array_451559378.length; ii++) {
                		org.junit.Assert.assertEquals(array_451559378[ii], array_539305492[ii]);
                	};
                IConstr o_testModelIteratorlitNum18__16 = iterator.addClause(new VecInt(new int[]{ -5, -6 }));
                int[] array_2041404087 = new int[]{11,13};
                	int[] array_806323824 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testModelIteratorlitNum18__16).getLits();
                	for(int ii = 0; ii <array_2041404087.length; ii++) {
                		org.junit.Assert.assertEquals(array_2041404087[ii], array_806323824[ii]);
                	};
                iterator.addClause(new VecInt(new int[]{ -1, 3 }));
                int counter = 0;
                int[] sub = new int[0];
                while (iterator.isSatisfiable()) {
                    sub = iterator.model();
                    counter++;
                } 
                org.junit.Assert.fail("testModelIteratorlitNum18litNum1032 should have thrown ArrayIndexOutOfBoundsException");
            }
            org.junit.Assert.fail("testModelIteratorlitNum18litNum1032_failAssert46_add2741 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-2147483648", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testModelIteratorlitNum18litNum1291_failAssert39_add2504_failAssert62() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                ModelIterator iterator = new ModelIterator(SolverFactory.newDefault());
                IConstr o_testModelIteratorlitNum18__4 = iterator.addClause(new VecInt(new int[]{ 1, 2 }));
                int[] array_432070049 = new int[]{2,4};
                	int[] array_1644972435 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testModelIteratorlitNum18__4).getLits();
                	for(int ii = 0; ii <array_432070049.length; ii++) {
                		org.junit.Assert.assertEquals(array_432070049[ii], array_1644972435[ii]);
                	};
                IConstr o_testModelIteratorlitNum18__6 = iterator.addClause(new VecInt(new int[]{ -1, -1 }));
                IConstr o_testModelIteratorlitNum18__10 = iterator.addClause(new VecInt(new int[]{ -3, -4 }));
                int[] array_932571789 = new int[]{7,9};
                	int[] array_1277197333 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testModelIteratorlitNum18__10).getLits();
                	for(int ii = 0; ii <array_932571789.length; ii++) {
                		org.junit.Assert.assertEquals(array_932571789[ii], array_1277197333[ii]);
                	};
                IConstr o_testModelIteratorlitNum18__14 = iterator.addClause(new VecInt(new int[]{ 5, 6 }));
                int[] array_451559378 = new int[]{10,12};
                	int[] array_539305492 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testModelIteratorlitNum18__14).getLits();
                	for(int ii = 0; ii <array_451559378.length; ii++) {
                		org.junit.Assert.assertEquals(array_451559378[ii], array_539305492[ii]);
                	};
                iterator.addClause(new VecInt(new int[]{ -(Integer.MAX_VALUE), -6 }));
                IConstr o_testModelIteratorlitNum18__16 = iterator.addClause(new VecInt(new int[]{ -(Integer.MAX_VALUE), -6 }));
                int[] array_2041404087 = new int[]{11,13};
                	int[] array_806323824 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testModelIteratorlitNum18__16).getLits();
                	for(int ii = 0; ii <array_2041404087.length; ii++) {
                		org.junit.Assert.assertEquals(array_2041404087[ii], array_806323824[ii]);
                	};
                iterator.addClause(new VecInt(new int[]{ -1, 3 }));
                int counter = 0;
                int[] sub = new int[0];
                while (iterator.isSatisfiable()) {
                    sub = iterator.model();
                    counter++;
                } 
                org.junit.Assert.fail("testModelIteratorlitNum18litNum1291 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testModelIteratorlitNum18litNum1291_failAssert39_add2504 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testModelIteratorlitNum18litNum1314_failAssert41_add2516_failAssert64() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                ModelIterator iterator = new ModelIterator(SolverFactory.newDefault());
                IConstr o_testModelIteratorlitNum18__4 = iterator.addClause(new VecInt(new int[]{ 1, 2 }));
                int[] array_432070049 = new int[]{2,4};
                	int[] array_1644972435 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testModelIteratorlitNum18__4).getLits();
                	for(int ii = 0; ii <array_432070049.length; ii++) {
                		org.junit.Assert.assertEquals(array_432070049[ii], array_1644972435[ii]);
                	};
                IConstr o_testModelIteratorlitNum18__6 = iterator.addClause(new VecInt(new int[]{ -1, -1 }));
                IConstr o_testModelIteratorlitNum18__10 = iterator.addClause(new VecInt(new int[]{ -3, -4 }));
                int[] array_932571789 = new int[]{7,9};
                	int[] array_1277197333 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testModelIteratorlitNum18__10).getLits();
                	for(int ii = 0; ii <array_932571789.length; ii++) {
                		org.junit.Assert.assertEquals(array_932571789[ii], array_1277197333[ii]);
                	};
                IConstr o_testModelIteratorlitNum18__14 = iterator.addClause(new VecInt(new int[]{ 5, 6 }));
                int[] array_451559378 = new int[]{10,12};
                	int[] array_539305492 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testModelIteratorlitNum18__14).getLits();
                	for(int ii = 0; ii <array_451559378.length; ii++) {
                		org.junit.Assert.assertEquals(array_451559378[ii], array_539305492[ii]);
                	};
                IConstr o_testModelIteratorlitNum18__16 = iterator.addClause(new VecInt(new int[]{ -5, -6 }));
                int[] array_2041404087 = new int[]{11,13};
                	int[] array_806323824 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testModelIteratorlitNum18__16).getLits();
                	for(int ii = 0; ii <array_2041404087.length; ii++) {
                		org.junit.Assert.assertEquals(array_2041404087[ii], array_806323824[ii]);
                	};
                iterator.addClause(new VecInt(new int[]{ -(Integer.MAX_VALUE), 3 }));
                iterator.addClause(new VecInt(new int[]{ -(Integer.MAX_VALUE), 3 }));
                int counter = 0;
                int[] sub = new int[0];
                while (iterator.isSatisfiable()) {
                    sub = iterator.model();
                    counter++;
                } 
                org.junit.Assert.fail("testModelIteratorlitNum18litNum1314 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testModelIteratorlitNum18litNum1314_failAssert41_add2516 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testModelIteratorlitNum18litNum824_failAssert48_add2507_failAssert65() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                ModelIterator iterator = new ModelIterator(SolverFactory.newDefault());
                IConstr o_testModelIteratorlitNum18__4 = iterator.addClause(new VecInt(new int[]{ 1, 2 }));
                int[] array_432070049 = new int[]{2,4};
                	int[] array_1644972435 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testModelIteratorlitNum18__4).getLits();
                	for(int ii = 0; ii <array_432070049.length; ii++) {
                		org.junit.Assert.assertEquals(array_432070049[ii], array_1644972435[ii]);
                	};
                iterator.addClause(new VecInt(new int[]{ -(Integer.MAX_VALUE), -1 }));
                IConstr o_testModelIteratorlitNum18__6 = iterator.addClause(new VecInt(new int[]{ -(Integer.MAX_VALUE), -1 }));
                IConstr o_testModelIteratorlitNum18__10 = iterator.addClause(new VecInt(new int[]{ -3, -4 }));
                int[] array_932571789 = new int[]{7,9};
                	int[] array_1277197333 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testModelIteratorlitNum18__10).getLits();
                	for(int ii = 0; ii <array_932571789.length; ii++) {
                		org.junit.Assert.assertEquals(array_932571789[ii], array_1277197333[ii]);
                	};
                IConstr o_testModelIteratorlitNum18__14 = iterator.addClause(new VecInt(new int[]{ 5, 6 }));
                int[] array_451559378 = new int[]{10,12};
                	int[] array_539305492 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testModelIteratorlitNum18__14).getLits();
                	for(int ii = 0; ii <array_451559378.length; ii++) {
                		org.junit.Assert.assertEquals(array_451559378[ii], array_539305492[ii]);
                	};
                IConstr o_testModelIteratorlitNum18__16 = iterator.addClause(new VecInt(new int[]{ -5, -6 }));
                int[] array_2041404087 = new int[]{11,13};
                	int[] array_806323824 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testModelIteratorlitNum18__16).getLits();
                	for(int ii = 0; ii <array_2041404087.length; ii++) {
                		org.junit.Assert.assertEquals(array_2041404087[ii], array_806323824[ii]);
                	};
                iterator.addClause(new VecInt(new int[]{ -1, 3 }));
                int counter = 0;
                int[] sub = new int[0];
                while (iterator.isSatisfiable()) {
                    sub = iterator.model();
                    counter++;
                } 
                org.junit.Assert.fail("testModelIteratorlitNum18litNum824 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testModelIteratorlitNum18litNum824_failAssert48_add2507 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testModelIteratorlitNum18litNum724_failAssert58_add2489_failAssert66() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                ModelIterator iterator = new ModelIterator(SolverFactory.newDefault());
                iterator.addClause(new VecInt(new int[]{ 1, Integer.MAX_VALUE }));
                IConstr o_testModelIteratorlitNum18__4 = iterator.addClause(new VecInt(new int[]{ 1, Integer.MAX_VALUE }));
                int[] array_432070049 = new int[]{2,4};
                	int[] array_1644972435 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testModelIteratorlitNum18__4).getLits();
                	for(int ii = 0; ii <array_432070049.length; ii++) {
                		org.junit.Assert.assertEquals(array_432070049[ii], array_1644972435[ii]);
                	};
                IConstr o_testModelIteratorlitNum18__6 = iterator.addClause(new VecInt(new int[]{ -1, -1 }));
                IConstr o_testModelIteratorlitNum18__10 = iterator.addClause(new VecInt(new int[]{ -3, -4 }));
                int[] array_932571789 = new int[]{7,9};
                	int[] array_1277197333 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testModelIteratorlitNum18__10).getLits();
                	for(int ii = 0; ii <array_932571789.length; ii++) {
                		org.junit.Assert.assertEquals(array_932571789[ii], array_1277197333[ii]);
                	};
                IConstr o_testModelIteratorlitNum18__14 = iterator.addClause(new VecInt(new int[]{ 5, 6 }));
                int[] array_451559378 = new int[]{10,12};
                	int[] array_539305492 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testModelIteratorlitNum18__14).getLits();
                	for(int ii = 0; ii <array_451559378.length; ii++) {
                		org.junit.Assert.assertEquals(array_451559378[ii], array_539305492[ii]);
                	};
                IConstr o_testModelIteratorlitNum18__16 = iterator.addClause(new VecInt(new int[]{ -5, -6 }));
                int[] array_2041404087 = new int[]{11,13};
                	int[] array_806323824 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testModelIteratorlitNum18__16).getLits();
                	for(int ii = 0; ii <array_2041404087.length; ii++) {
                		org.junit.Assert.assertEquals(array_2041404087[ii], array_806323824[ii]);
                	};
                iterator.addClause(new VecInt(new int[]{ -1, 3 }));
                int counter = 0;
                int[] sub = new int[0];
                while (iterator.isSatisfiable()) {
                    sub = iterator.model();
                    counter++;
                } 
                org.junit.Assert.fail("testModelIteratorlitNum18litNum724 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testModelIteratorlitNum18litNum724_failAssert58_add2489 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testModelIteratorlitNum18litNum1032_failAssert46_add2739_failAssert68() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                ModelIterator iterator = new ModelIterator(SolverFactory.newDefault());
                IConstr o_testModelIteratorlitNum18__4 = iterator.addClause(new VecInt(new int[]{ 1, 2 }));
                int[] array_432070049 = new int[]{2,4};
                	int[] array_1644972435 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testModelIteratorlitNum18__4).getLits();
                	for(int ii = 0; ii <array_432070049.length; ii++) {
                		org.junit.Assert.assertEquals(array_432070049[ii], array_1644972435[ii]);
                	};
                iterator.addClause(new VecInt(new int[]{ -1, -1 }));
                IConstr o_testModelIteratorlitNum18__6 = iterator.addClause(new VecInt(new int[]{ -1, -1 }));
                IConstr o_testModelIteratorlitNum18__10 = iterator.addClause(new VecInt(new int[]{ -3, -(Integer.MIN_VALUE) }));
                int[] array_932571789 = new int[]{7,9};
                	int[] array_1277197333 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testModelIteratorlitNum18__10).getLits();
                	for(int ii = 0; ii <array_932571789.length; ii++) {
                		org.junit.Assert.assertEquals(array_932571789[ii], array_1277197333[ii]);
                	};
                IConstr o_testModelIteratorlitNum18__14 = iterator.addClause(new VecInt(new int[]{ 5, 6 }));
                int[] array_451559378 = new int[]{10,12};
                	int[] array_539305492 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testModelIteratorlitNum18__14).getLits();
                	for(int ii = 0; ii <array_451559378.length; ii++) {
                		org.junit.Assert.assertEquals(array_451559378[ii], array_539305492[ii]);
                	};
                IConstr o_testModelIteratorlitNum18__16 = iterator.addClause(new VecInt(new int[]{ -5, -6 }));
                int[] array_2041404087 = new int[]{11,13};
                	int[] array_806323824 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testModelIteratorlitNum18__16).getLits();
                	for(int ii = 0; ii <array_2041404087.length; ii++) {
                		org.junit.Assert.assertEquals(array_2041404087[ii], array_806323824[ii]);
                	};
                iterator.addClause(new VecInt(new int[]{ -1, 3 }));
                int counter = 0;
                int[] sub = new int[0];
                while (iterator.isSatisfiable()) {
                    sub = iterator.model();
                    counter++;
                } 
                org.junit.Assert.fail("testModelIteratorlitNum18litNum1032 should have thrown ArrayIndexOutOfBoundsException");
            }
            org.junit.Assert.fail("testModelIteratorlitNum18litNum1032_failAssert46_add2739 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-2147483648", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testModelIteratorlitNum18litNum1291_failAssert39_add2493_failAssert73() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                ModelIterator iterator = new ModelIterator(SolverFactory.newDefault());
                IConstr o_testModelIteratorlitNum18__4 = iterator.addClause(new VecInt(new int[]{ 1, 2 }));
                int[] array_432070049 = new int[]{2,4};
                	int[] array_1644972435 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testModelIteratorlitNum18__4).getLits();
                	for(int ii = 0; ii <array_432070049.length; ii++) {
                		org.junit.Assert.assertEquals(array_432070049[ii], array_1644972435[ii]);
                	};
                iterator.addClause(new VecInt(new int[]{ -1, -1 }));
                IConstr o_testModelIteratorlitNum18__6 = iterator.addClause(new VecInt(new int[]{ -1, -1 }));
                IConstr o_testModelIteratorlitNum18__10 = iterator.addClause(new VecInt(new int[]{ -3, -4 }));
                int[] array_932571789 = new int[]{7,9};
                	int[] array_1277197333 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testModelIteratorlitNum18__10).getLits();
                	for(int ii = 0; ii <array_932571789.length; ii++) {
                		org.junit.Assert.assertEquals(array_932571789[ii], array_1277197333[ii]);
                	};
                IConstr o_testModelIteratorlitNum18__14 = iterator.addClause(new VecInt(new int[]{ 5, 6 }));
                int[] array_451559378 = new int[]{10,12};
                	int[] array_539305492 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testModelIteratorlitNum18__14).getLits();
                	for(int ii = 0; ii <array_451559378.length; ii++) {
                		org.junit.Assert.assertEquals(array_451559378[ii], array_539305492[ii]);
                	};
                IConstr o_testModelIteratorlitNum18__16 = iterator.addClause(new VecInt(new int[]{ -(Integer.MAX_VALUE), -6 }));
                int[] array_2041404087 = new int[]{11,13};
                	int[] array_806323824 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testModelIteratorlitNum18__16).getLits();
                	for(int ii = 0; ii <array_2041404087.length; ii++) {
                		org.junit.Assert.assertEquals(array_2041404087[ii], array_806323824[ii]);
                	};
                iterator.addClause(new VecInt(new int[]{ -1, 3 }));
                int counter = 0;
                int[] sub = new int[0];
                while (iterator.isSatisfiable()) {
                    sub = iterator.model();
                    counter++;
                } 
                org.junit.Assert.fail("testModelIteratorlitNum18litNum1291 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testModelIteratorlitNum18litNum1291_failAssert39_add2493 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testModelIteratorlitNum18litNum1314_failAssert41_add2500_failAssert77() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                ModelIterator iterator = new ModelIterator(SolverFactory.newDefault());
                IConstr o_testModelIteratorlitNum18__4 = iterator.addClause(new VecInt(new int[]{ 1, 2 }));
                int[] array_432070049 = new int[]{2,4};
                	int[] array_1644972435 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testModelIteratorlitNum18__4).getLits();
                	for(int ii = 0; ii <array_432070049.length; ii++) {
                		org.junit.Assert.assertEquals(array_432070049[ii], array_1644972435[ii]);
                	};
                iterator.addClause(new VecInt(new int[]{ -1, -1 }));
                IConstr o_testModelIteratorlitNum18__6 = iterator.addClause(new VecInt(new int[]{ -1, -1 }));
                IConstr o_testModelIteratorlitNum18__10 = iterator.addClause(new VecInt(new int[]{ -3, -4 }));
                int[] array_932571789 = new int[]{7,9};
                	int[] array_1277197333 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testModelIteratorlitNum18__10).getLits();
                	for(int ii = 0; ii <array_932571789.length; ii++) {
                		org.junit.Assert.assertEquals(array_932571789[ii], array_1277197333[ii]);
                	};
                IConstr o_testModelIteratorlitNum18__14 = iterator.addClause(new VecInt(new int[]{ 5, 6 }));
                int[] array_451559378 = new int[]{10,12};
                	int[] array_539305492 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testModelIteratorlitNum18__14).getLits();
                	for(int ii = 0; ii <array_451559378.length; ii++) {
                		org.junit.Assert.assertEquals(array_451559378[ii], array_539305492[ii]);
                	};
                IConstr o_testModelIteratorlitNum18__16 = iterator.addClause(new VecInt(new int[]{ -5, -6 }));
                int[] array_2041404087 = new int[]{11,13};
                	int[] array_806323824 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testModelIteratorlitNum18__16).getLits();
                	for(int ii = 0; ii <array_2041404087.length; ii++) {
                		org.junit.Assert.assertEquals(array_2041404087[ii], array_806323824[ii]);
                	};
                iterator.addClause(new VecInt(new int[]{ -(Integer.MAX_VALUE), 3 }));
                int counter = 0;
                int[] sub = new int[0];
                while (iterator.isSatisfiable()) {
                    sub = iterator.model();
                    counter++;
                } 
                org.junit.Assert.fail("testModelIteratorlitNum18litNum1314 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testModelIteratorlitNum18litNum1314_failAssert41_add2500 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testModelIteratorlitNum18litNum1350_failAssert54_add2700_failAssert89() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                ModelIterator iterator = new ModelIterator(SolverFactory.newDefault());
                IConstr o_testModelIteratorlitNum18__4 = iterator.addClause(new VecInt(new int[]{ 1, 2 }));
                int[] array_432070049 = new int[]{2,4};
                	int[] array_1644972435 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testModelIteratorlitNum18__4).getLits();
                	for(int ii = 0; ii <array_432070049.length; ii++) {
                		org.junit.Assert.assertEquals(array_432070049[ii], array_1644972435[ii]);
                	};
                iterator.addClause(new VecInt(new int[]{ -1, -1 }));
                IConstr o_testModelIteratorlitNum18__6 = iterator.addClause(new VecInt(new int[]{ -1, -1 }));
                IConstr o_testModelIteratorlitNum18__10 = iterator.addClause(new VecInt(new int[]{ -3, -4 }));
                int[] array_932571789 = new int[]{7,9};
                	int[] array_1277197333 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testModelIteratorlitNum18__10).getLits();
                	for(int ii = 0; ii <array_932571789.length; ii++) {
                		org.junit.Assert.assertEquals(array_932571789[ii], array_1277197333[ii]);
                	};
                IConstr o_testModelIteratorlitNum18__14 = iterator.addClause(new VecInt(new int[]{ 5, 6 }));
                int[] array_451559378 = new int[]{10,12};
                	int[] array_539305492 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testModelIteratorlitNum18__14).getLits();
                	for(int ii = 0; ii <array_451559378.length; ii++) {
                		org.junit.Assert.assertEquals(array_451559378[ii], array_539305492[ii]);
                	};
                IConstr o_testModelIteratorlitNum18__16 = iterator.addClause(new VecInt(new int[]{ -5, -6 }));
                int[] array_2041404087 = new int[]{11,13};
                	int[] array_806323824 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testModelIteratorlitNum18__16).getLits();
                	for(int ii = 0; ii <array_2041404087.length; ii++) {
                		org.junit.Assert.assertEquals(array_2041404087[ii], array_806323824[ii]);
                	};
                iterator.addClause(new VecInt(new int[]{ -1, 3 }));
                int counter = 0;
                int[] sub = new int[Integer.MIN_VALUE];
                while (iterator.isSatisfiable()) {
                    sub = iterator.model();
                    counter++;
                } 
                org.junit.Assert.fail("testModelIteratorlitNum18litNum1350 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testModelIteratorlitNum18litNum1350_failAssert54_add2700 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testModelIteratorlitNum18litNum824_failAssert48_add2502_failAssert100() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                ModelIterator iterator = new ModelIterator(SolverFactory.newDefault());
                iterator.addClause(new VecInt(new int[]{ 1, 2 }));
                IConstr o_testModelIteratorlitNum18__4 = iterator.addClause(new VecInt(new int[]{ 1, 2 }));
                int[] array_432070049 = new int[]{2,4};
                	int[] array_1644972435 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testModelIteratorlitNum18__4).getLits();
                	for(int ii = 0; ii <array_432070049.length; ii++) {
                		org.junit.Assert.assertEquals(array_432070049[ii], array_1644972435[ii]);
                	};
                IConstr o_testModelIteratorlitNum18__6 = iterator.addClause(new VecInt(new int[]{ -(Integer.MAX_VALUE), -1 }));
                IConstr o_testModelIteratorlitNum18__10 = iterator.addClause(new VecInt(new int[]{ -3, -4 }));
                int[] array_932571789 = new int[]{7,9};
                	int[] array_1277197333 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testModelIteratorlitNum18__10).getLits();
                	for(int ii = 0; ii <array_932571789.length; ii++) {
                		org.junit.Assert.assertEquals(array_932571789[ii], array_1277197333[ii]);
                	};
                IConstr o_testModelIteratorlitNum18__14 = iterator.addClause(new VecInt(new int[]{ 5, 6 }));
                int[] array_451559378 = new int[]{10,12};
                	int[] array_539305492 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testModelIteratorlitNum18__14).getLits();
                	for(int ii = 0; ii <array_451559378.length; ii++) {
                		org.junit.Assert.assertEquals(array_451559378[ii], array_539305492[ii]);
                	};
                IConstr o_testModelIteratorlitNum18__16 = iterator.addClause(new VecInt(new int[]{ -5, -6 }));
                int[] array_2041404087 = new int[]{11,13};
                	int[] array_806323824 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testModelIteratorlitNum18__16).getLits();
                	for(int ii = 0; ii <array_2041404087.length; ii++) {
                		org.junit.Assert.assertEquals(array_2041404087[ii], array_806323824[ii]);
                	};
                iterator.addClause(new VecInt(new int[]{ -1, 3 }));
                int counter = 0;
                int[] sub = new int[0];
                while (iterator.isSatisfiable()) {
                    sub = iterator.model();
                    counter++;
                } 
                org.junit.Assert.fail("testModelIteratorlitNum18litNum824 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testModelIteratorlitNum18litNum824_failAssert48_add2502 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testModelIteratorlitNum18litNum1350_failAssert54litNum2611_failAssert143() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                ModelIterator iterator = new ModelIterator(SolverFactory.newDefault());
                IConstr o_testModelIteratorlitNum18__4 = iterator.addClause(new VecInt(new int[]{ 1, 2 }));
                int[] array_432070049 = new int[]{2,4};
                	int[] array_1644972435 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testModelIteratorlitNum18__4).getLits();
                	for(int ii = 0; ii <array_432070049.length; ii++) {
                		org.junit.Assert.assertEquals(array_432070049[ii], array_1644972435[ii]);
                	};
                IConstr o_testModelIteratorlitNum18__6 = iterator.addClause(new VecInt(new int[]{ -1, -1 }));
                IConstr o_testModelIteratorlitNum18__10 = iterator.addClause(new VecInt(new int[]{ -3, -4 }));
                int[] array_932571789 = new int[]{7,9};
                	int[] array_1277197333 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testModelIteratorlitNum18__10).getLits();
                	for(int ii = 0; ii <array_932571789.length; ii++) {
                		org.junit.Assert.assertEquals(array_932571789[ii], array_1277197333[ii]);
                	};
                IConstr o_testModelIteratorlitNum18__14 = iterator.addClause(new VecInt(new int[]{ 5, 0 }));
                int[] array_451559378 = new int[]{10,12};
                	int[] array_539305492 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testModelIteratorlitNum18__14).getLits();
                	for(int ii = 0; ii <array_451559378.length; ii++) {
                		org.junit.Assert.assertEquals(array_451559378[ii], array_539305492[ii]);
                	};
                IConstr o_testModelIteratorlitNum18__16 = iterator.addClause(new VecInt(new int[]{ -5, -6 }));
                int[] array_2041404087 = new int[]{11,13};
                	int[] array_806323824 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testModelIteratorlitNum18__16).getLits();
                	for(int ii = 0; ii <array_2041404087.length; ii++) {
                		org.junit.Assert.assertEquals(array_2041404087[ii], array_806323824[ii]);
                	};
                iterator.addClause(new VecInt(new int[]{ -1, 3 }));
                int counter = 0;
                int[] sub = new int[Integer.MIN_VALUE];
                while (iterator.isSatisfiable()) {
                    sub = iterator.model();
                    counter++;
                } 
                org.junit.Assert.fail("testModelIteratorlitNum18litNum1350 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testModelIteratorlitNum18litNum1350_failAssert54litNum2611 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testModelIteratorlitNum18litNum824_failAssert48litNum2235_failAssert148() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                ModelIterator iterator = new ModelIterator(SolverFactory.newDefault());
                IConstr o_testModelIteratorlitNum18__4 = iterator.addClause(new VecInt(new int[]{ 1, 1 }));
                int[] array_432070049 = new int[]{2,4};
                	int[] array_1644972435 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testModelIteratorlitNum18__4).getLits();
                	for(int ii = 0; ii <array_432070049.length; ii++) {
                		org.junit.Assert.assertEquals(array_432070049[ii], array_1644972435[ii]);
                	};
                IConstr o_testModelIteratorlitNum18__6 = iterator.addClause(new VecInt(new int[]{ -(Integer.MAX_VALUE), -1 }));
                IConstr o_testModelIteratorlitNum18__10 = iterator.addClause(new VecInt(new int[]{ -3, -4 }));
                int[] array_932571789 = new int[]{7,9};
                	int[] array_1277197333 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testModelIteratorlitNum18__10).getLits();
                	for(int ii = 0; ii <array_932571789.length; ii++) {
                		org.junit.Assert.assertEquals(array_932571789[ii], array_1277197333[ii]);
                	};
                IConstr o_testModelIteratorlitNum18__14 = iterator.addClause(new VecInt(new int[]{ 5, 6 }));
                int[] array_451559378 = new int[]{10,12};
                	int[] array_539305492 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testModelIteratorlitNum18__14).getLits();
                	for(int ii = 0; ii <array_451559378.length; ii++) {
                		org.junit.Assert.assertEquals(array_451559378[ii], array_539305492[ii]);
                	};
                IConstr o_testModelIteratorlitNum18__16 = iterator.addClause(new VecInt(new int[]{ -5, -6 }));
                int[] array_2041404087 = new int[]{11,13};
                	int[] array_806323824 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testModelIteratorlitNum18__16).getLits();
                	for(int ii = 0; ii <array_2041404087.length; ii++) {
                		org.junit.Assert.assertEquals(array_2041404087[ii], array_806323824[ii]);
                	};
                iterator.addClause(new VecInt(new int[]{ -1, 3 }));
                int counter = 0;
                int[] sub = new int[0];
                while (iterator.isSatisfiable()) {
                    sub = iterator.model();
                    counter++;
                } 
                org.junit.Assert.fail("testModelIteratorlitNum18litNum824 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testModelIteratorlitNum18litNum824_failAssert48litNum2235 should have thrown ClassCastException");
        } catch (ClassCastException expected) {
            Assert.assertEquals("org.sat4j.minisat.constraints.cnf.UnitClause cannot be cast to org.sat4j.minisat.constraints.cnf.OriginalBinaryClause", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testModelIteratorlitNum18litNum1350_failAssert54litNum2533_failAssert155() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                ModelIterator iterator = new ModelIterator(SolverFactory.newDefault());
                IConstr o_testModelIteratorlitNum18__4 = iterator.addClause(new VecInt(new int[]{ 1, 0 }));
                int[] array_432070049 = new int[]{2,4};
                	int[] array_1644972435 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testModelIteratorlitNum18__4).getLits();
                	for(int ii = 0; ii <array_432070049.length; ii++) {
                		org.junit.Assert.assertEquals(array_432070049[ii], array_1644972435[ii]);
                	};
                IConstr o_testModelIteratorlitNum18__6 = iterator.addClause(new VecInt(new int[]{ -1, -1 }));
                IConstr o_testModelIteratorlitNum18__10 = iterator.addClause(new VecInt(new int[]{ -3, -4 }));
                int[] array_932571789 = new int[]{7,9};
                	int[] array_1277197333 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testModelIteratorlitNum18__10).getLits();
                	for(int ii = 0; ii <array_932571789.length; ii++) {
                		org.junit.Assert.assertEquals(array_932571789[ii], array_1277197333[ii]);
                	};
                IConstr o_testModelIteratorlitNum18__14 = iterator.addClause(new VecInt(new int[]{ 5, 6 }));
                int[] array_451559378 = new int[]{10,12};
                	int[] array_539305492 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testModelIteratorlitNum18__14).getLits();
                	for(int ii = 0; ii <array_451559378.length; ii++) {
                		org.junit.Assert.assertEquals(array_451559378[ii], array_539305492[ii]);
                	};
                IConstr o_testModelIteratorlitNum18__16 = iterator.addClause(new VecInt(new int[]{ -5, -6 }));
                int[] array_2041404087 = new int[]{11,13};
                	int[] array_806323824 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testModelIteratorlitNum18__16).getLits();
                	for(int ii = 0; ii <array_2041404087.length; ii++) {
                		org.junit.Assert.assertEquals(array_2041404087[ii], array_806323824[ii]);
                	};
                iterator.addClause(new VecInt(new int[]{ -1, 3 }));
                int counter = 0;
                int[] sub = new int[Integer.MIN_VALUE];
                while (iterator.isSatisfiable()) {
                    sub = iterator.model();
                    counter++;
                } 
                org.junit.Assert.fail("testModelIteratorlitNum18litNum1350 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testModelIteratorlitNum18litNum1350_failAssert54litNum2533 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testModelIteratorlitNum18litNum1350_failAssert54litNum2580_failAssert156() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                ModelIterator iterator = new ModelIterator(SolverFactory.newDefault());
                IConstr o_testModelIteratorlitNum18__4 = iterator.addClause(new VecInt(new int[]{ 1, 2 }));
                int[] array_432070049 = new int[]{2,4};
                	int[] array_1644972435 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testModelIteratorlitNum18__4).getLits();
                	for(int ii = 0; ii <array_432070049.length; ii++) {
                		org.junit.Assert.assertEquals(array_432070049[ii], array_1644972435[ii]);
                	};
                IConstr o_testModelIteratorlitNum18__6 = iterator.addClause(new VecInt(new int[]{ -1, -1 }));
                IConstr o_testModelIteratorlitNum18__10 = iterator.addClause(new VecInt(new int[]{ -3, -0 }));
                int[] array_932571789 = new int[]{7,9};
                	int[] array_1277197333 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testModelIteratorlitNum18__10).getLits();
                	for(int ii = 0; ii <array_932571789.length; ii++) {
                		org.junit.Assert.assertEquals(array_932571789[ii], array_1277197333[ii]);
                	};
                IConstr o_testModelIteratorlitNum18__14 = iterator.addClause(new VecInt(new int[]{ 5, 6 }));
                int[] array_451559378 = new int[]{10,12};
                	int[] array_539305492 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testModelIteratorlitNum18__14).getLits();
                	for(int ii = 0; ii <array_451559378.length; ii++) {
                		org.junit.Assert.assertEquals(array_451559378[ii], array_539305492[ii]);
                	};
                IConstr o_testModelIteratorlitNum18__16 = iterator.addClause(new VecInt(new int[]{ -5, -6 }));
                int[] array_2041404087 = new int[]{11,13};
                	int[] array_806323824 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testModelIteratorlitNum18__16).getLits();
                	for(int ii = 0; ii <array_2041404087.length; ii++) {
                		org.junit.Assert.assertEquals(array_2041404087[ii], array_806323824[ii]);
                	};
                iterator.addClause(new VecInt(new int[]{ -1, 3 }));
                int counter = 0;
                int[] sub = new int[Integer.MIN_VALUE];
                while (iterator.isSatisfiable()) {
                    sub = iterator.model();
                    counter++;
                } 
                org.junit.Assert.fail("testModelIteratorlitNum18litNum1350 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testModelIteratorlitNum18litNum1350_failAssert54litNum2580 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testModelIteratorlitNum18litNum1350_failAssert54litNum2604_failAssert157() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                ModelIterator iterator = new ModelIterator(SolverFactory.newDefault());
                IConstr o_testModelIteratorlitNum18__4 = iterator.addClause(new VecInt(new int[]{ 1, 2 }));
                int[] array_432070049 = new int[]{2,4};
                	int[] array_1644972435 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testModelIteratorlitNum18__4).getLits();
                	for(int ii = 0; ii <array_432070049.length; ii++) {
                		org.junit.Assert.assertEquals(array_432070049[ii], array_1644972435[ii]);
                	};
                IConstr o_testModelIteratorlitNum18__6 = iterator.addClause(new VecInt(new int[]{ -1, -1 }));
                IConstr o_testModelIteratorlitNum18__10 = iterator.addClause(new VecInt(new int[]{ -3, -4 }));
                int[] array_932571789 = new int[]{7,9};
                	int[] array_1277197333 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testModelIteratorlitNum18__10).getLits();
                	for(int ii = 0; ii <array_932571789.length; ii++) {
                		org.junit.Assert.assertEquals(array_932571789[ii], array_1277197333[ii]);
                	};
                IConstr o_testModelIteratorlitNum18__14 = iterator.addClause(new VecInt(new int[]{ 5, 5 }));
                int[] array_451559378 = new int[]{10,12};
                	int[] array_539305492 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testModelIteratorlitNum18__14).getLits();
                	for(int ii = 0; ii <array_451559378.length; ii++) {
                		org.junit.Assert.assertEquals(array_451559378[ii], array_539305492[ii]);
                	};
                IConstr o_testModelIteratorlitNum18__16 = iterator.addClause(new VecInt(new int[]{ -5, -6 }));
                int[] array_2041404087 = new int[]{11,13};
                	int[] array_806323824 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testModelIteratorlitNum18__16).getLits();
                	for(int ii = 0; ii <array_2041404087.length; ii++) {
                		org.junit.Assert.assertEquals(array_2041404087[ii], array_806323824[ii]);
                	};
                iterator.addClause(new VecInt(new int[]{ -1, 3 }));
                int counter = 0;
                int[] sub = new int[Integer.MIN_VALUE];
                while (iterator.isSatisfiable()) {
                    sub = iterator.model();
                    counter++;
                } 
                org.junit.Assert.fail("testModelIteratorlitNum18litNum1350 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testModelIteratorlitNum18litNum1350_failAssert54litNum2604 should have thrown ClassCastException");
        } catch (ClassCastException expected) {
            Assert.assertEquals("org.sat4j.minisat.constraints.cnf.UnitClause cannot be cast to org.sat4j.minisat.constraints.cnf.OriginalBinaryClause", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testModelIteratorlitNum18litNum1350_failAssert54litNum2540_failAssert162() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                ModelIterator iterator = new ModelIterator(SolverFactory.newDefault());
                IConstr o_testModelIteratorlitNum18__4 = iterator.addClause(new VecInt(new int[]{ 1, 2 }));
                int[] array_432070049 = new int[]{2,4};
                	int[] array_1644972435 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testModelIteratorlitNum18__4).getLits();
                	for(int ii = 0; ii <array_432070049.length; ii++) {
                		org.junit.Assert.assertEquals(array_432070049[ii], array_1644972435[ii]);
                	};
                IConstr o_testModelIteratorlitNum18__6 = iterator.addClause(new VecInt(new int[]{ -2, -1 }));
                IConstr o_testModelIteratorlitNum18__10 = iterator.addClause(new VecInt(new int[]{ -3, -4 }));
                int[] array_932571789 = new int[]{7,9};
                	int[] array_1277197333 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testModelIteratorlitNum18__10).getLits();
                	for(int ii = 0; ii <array_932571789.length; ii++) {
                		org.junit.Assert.assertEquals(array_932571789[ii], array_1277197333[ii]);
                	};
                IConstr o_testModelIteratorlitNum18__14 = iterator.addClause(new VecInt(new int[]{ 5, 6 }));
                int[] array_451559378 = new int[]{10,12};
                	int[] array_539305492 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testModelIteratorlitNum18__14).getLits();
                	for(int ii = 0; ii <array_451559378.length; ii++) {
                		org.junit.Assert.assertEquals(array_451559378[ii], array_539305492[ii]);
                	};
                IConstr o_testModelIteratorlitNum18__16 = iterator.addClause(new VecInt(new int[]{ -5, -6 }));
                int[] array_2041404087 = new int[]{11,13};
                	int[] array_806323824 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testModelIteratorlitNum18__16).getLits();
                	for(int ii = 0; ii <array_2041404087.length; ii++) {
                		org.junit.Assert.assertEquals(array_2041404087[ii], array_806323824[ii]);
                	};
                iterator.addClause(new VecInt(new int[]{ -1, 3 }));
                int counter = 0;
                int[] sub = new int[Integer.MIN_VALUE];
                while (iterator.isSatisfiable()) {
                    sub = iterator.model();
                    counter++;
                } 
                org.junit.Assert.fail("testModelIteratorlitNum18litNum1350 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testModelIteratorlitNum18litNum1350_failAssert54litNum2540 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testModelIteratorlitNum18litNum1350_failAssert54litNum2543_failAssert164() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                ModelIterator iterator = new ModelIterator(SolverFactory.newDefault());
                IConstr o_testModelIteratorlitNum18__4 = iterator.addClause(new VecInt(new int[]{ 1, 2 }));
                int[] array_432070049 = new int[]{2,4};
                	int[] array_1644972435 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testModelIteratorlitNum18__4).getLits();
                	for(int ii = 0; ii <array_432070049.length; ii++) {
                		org.junit.Assert.assertEquals(array_432070049[ii], array_1644972435[ii]);
                	};
                IConstr o_testModelIteratorlitNum18__6 = iterator.addClause(new VecInt(new int[]{ -0, -1 }));
                IConstr o_testModelIteratorlitNum18__10 = iterator.addClause(new VecInt(new int[]{ -3, -4 }));
                int[] array_932571789 = new int[]{7,9};
                	int[] array_1277197333 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testModelIteratorlitNum18__10).getLits();
                	for(int ii = 0; ii <array_932571789.length; ii++) {
                		org.junit.Assert.assertEquals(array_932571789[ii], array_1277197333[ii]);
                	};
                IConstr o_testModelIteratorlitNum18__14 = iterator.addClause(new VecInt(new int[]{ 5, 6 }));
                int[] array_451559378 = new int[]{10,12};
                	int[] array_539305492 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testModelIteratorlitNum18__14).getLits();
                	for(int ii = 0; ii <array_451559378.length; ii++) {
                		org.junit.Assert.assertEquals(array_451559378[ii], array_539305492[ii]);
                	};
                IConstr o_testModelIteratorlitNum18__16 = iterator.addClause(new VecInt(new int[]{ -5, -6 }));
                int[] array_2041404087 = new int[]{11,13};
                	int[] array_806323824 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testModelIteratorlitNum18__16).getLits();
                	for(int ii = 0; ii <array_2041404087.length; ii++) {
                		org.junit.Assert.assertEquals(array_2041404087[ii], array_806323824[ii]);
                	};
                iterator.addClause(new VecInt(new int[]{ -1, 3 }));
                int counter = 0;
                int[] sub = new int[Integer.MIN_VALUE];
                while (iterator.isSatisfiable()) {
                    sub = iterator.model();
                    counter++;
                } 
                org.junit.Assert.fail("testModelIteratorlitNum18litNum1350 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testModelIteratorlitNum18litNum1350_failAssert54litNum2543 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testModelIteratorlitNum18litNum1350_failAssert54litNum2565_failAssert172() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                ModelIterator iterator = new ModelIterator(SolverFactory.newDefault());
                IConstr o_testModelIteratorlitNum18__4 = iterator.addClause(new VecInt(new int[]{ 1, 2 }));
                int[] array_432070049 = new int[]{2,4};
                	int[] array_1644972435 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testModelIteratorlitNum18__4).getLits();
                	for(int ii = 0; ii <array_432070049.length; ii++) {
                		org.junit.Assert.assertEquals(array_432070049[ii], array_1644972435[ii]);
                	};
                IConstr o_testModelIteratorlitNum18__6 = iterator.addClause(new VecInt(new int[]{ -1, -1 }));
                IConstr o_testModelIteratorlitNum18__10 = iterator.addClause(new VecInt(new int[]{ -0, -4 }));
                int[] array_932571789 = new int[]{7,9};
                	int[] array_1277197333 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testModelIteratorlitNum18__10).getLits();
                	for(int ii = 0; ii <array_932571789.length; ii++) {
                		org.junit.Assert.assertEquals(array_932571789[ii], array_1277197333[ii]);
                	};
                IConstr o_testModelIteratorlitNum18__14 = iterator.addClause(new VecInt(new int[]{ 5, 6 }));
                int[] array_451559378 = new int[]{10,12};
                	int[] array_539305492 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testModelIteratorlitNum18__14).getLits();
                	for(int ii = 0; ii <array_451559378.length; ii++) {
                		org.junit.Assert.assertEquals(array_451559378[ii], array_539305492[ii]);
                	};
                IConstr o_testModelIteratorlitNum18__16 = iterator.addClause(new VecInt(new int[]{ -5, -6 }));
                int[] array_2041404087 = new int[]{11,13};
                	int[] array_806323824 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testModelIteratorlitNum18__16).getLits();
                	for(int ii = 0; ii <array_2041404087.length; ii++) {
                		org.junit.Assert.assertEquals(array_2041404087[ii], array_806323824[ii]);
                	};
                iterator.addClause(new VecInt(new int[]{ -1, 3 }));
                int counter = 0;
                int[] sub = new int[Integer.MIN_VALUE];
                while (iterator.isSatisfiable()) {
                    sub = iterator.model();
                    counter++;
                } 
                org.junit.Assert.fail("testModelIteratorlitNum18litNum1350 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testModelIteratorlitNum18litNum1350_failAssert54litNum2565 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testModelIteratorlitNum18litNum1350_failAssert54litNum2653_failAssert174() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                ModelIterator iterator = new ModelIterator(SolverFactory.newDefault());
                IConstr o_testModelIteratorlitNum18__4 = iterator.addClause(new VecInt(new int[]{ 1, 2 }));
                int[] array_432070049 = new int[]{2,4};
                	int[] array_1644972435 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testModelIteratorlitNum18__4).getLits();
                	for(int ii = 0; ii <array_432070049.length; ii++) {
                		org.junit.Assert.assertEquals(array_432070049[ii], array_1644972435[ii]);
                	};
                IConstr o_testModelIteratorlitNum18__6 = iterator.addClause(new VecInt(new int[]{ -1, -1 }));
                IConstr o_testModelIteratorlitNum18__10 = iterator.addClause(new VecInt(new int[]{ -3, -4 }));
                int[] array_932571789 = new int[]{7,9};
                	int[] array_1277197333 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testModelIteratorlitNum18__10).getLits();
                	for(int ii = 0; ii <array_932571789.length; ii++) {
                		org.junit.Assert.assertEquals(array_932571789[ii], array_1277197333[ii]);
                	};
                IConstr o_testModelIteratorlitNum18__14 = iterator.addClause(new VecInt(new int[]{ 5, 6 }));
                int[] array_451559378 = new int[]{10,12};
                	int[] array_539305492 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testModelIteratorlitNum18__14).getLits();
                	for(int ii = 0; ii <array_451559378.length; ii++) {
                		org.junit.Assert.assertEquals(array_451559378[ii], array_539305492[ii]);
                	};
                IConstr o_testModelIteratorlitNum18__16 = iterator.addClause(new VecInt(new int[]{ -5, -6 }));
                int[] array_2041404087 = new int[]{11,13};
                	int[] array_806323824 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testModelIteratorlitNum18__16).getLits();
                	for(int ii = 0; ii <array_2041404087.length; ii++) {
                		org.junit.Assert.assertEquals(array_2041404087[ii], array_806323824[ii]);
                	};
                iterator.addClause(new VecInt(new int[]{ -0, 3 }));
                int counter = 0;
                int[] sub = new int[Integer.MIN_VALUE];
                while (iterator.isSatisfiable()) {
                    sub = iterator.model();
                    counter++;
                } 
                org.junit.Assert.fail("testModelIteratorlitNum18litNum1350 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testModelIteratorlitNum18litNum1350_failAssert54litNum2653 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testModelIteratorlitNum18litNum1013_failAssert43litNum2549_failAssert231() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                ModelIterator iterator = new ModelIterator(SolverFactory.newDefault());
                IConstr o_testModelIteratorlitNum18__4 = iterator.addClause(new VecInt(new int[]{ 1, 2 }));
                int[] array_432070049 = new int[]{2,4};
                	int[] array_1644972435 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testModelIteratorlitNum18__4).getLits();
                	for(int ii = 0; ii <array_432070049.length; ii++) {
                		org.junit.Assert.assertEquals(array_432070049[ii], array_1644972435[ii]);
                	};
                IConstr o_testModelIteratorlitNum18__6 = iterator.addClause(new VecInt(new int[]{ -2, -1 }));
                IConstr o_testModelIteratorlitNum18__10 = iterator.addClause(new VecInt(new int[]{ -3, -(Integer.MAX_VALUE) }));
                int[] array_932571789 = new int[]{7,9};
                	int[] array_1277197333 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testModelIteratorlitNum18__10).getLits();
                	for(int ii = 0; ii <array_932571789.length; ii++) {
                		org.junit.Assert.assertEquals(array_932571789[ii], array_1277197333[ii]);
                	};
                IConstr o_testModelIteratorlitNum18__14 = iterator.addClause(new VecInt(new int[]{ 5, 6 }));
                int[] array_451559378 = new int[]{10,12};
                	int[] array_539305492 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testModelIteratorlitNum18__14).getLits();
                	for(int ii = 0; ii <array_451559378.length; ii++) {
                		org.junit.Assert.assertEquals(array_451559378[ii], array_539305492[ii]);
                	};
                IConstr o_testModelIteratorlitNum18__16 = iterator.addClause(new VecInt(new int[]{ -5, -6 }));
                int[] array_2041404087 = new int[]{11,13};
                	int[] array_806323824 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testModelIteratorlitNum18__16).getLits();
                	for(int ii = 0; ii <array_2041404087.length; ii++) {
                		org.junit.Assert.assertEquals(array_2041404087[ii], array_806323824[ii]);
                	};
                iterator.addClause(new VecInt(new int[]{ -1, 3 }));
                int counter = 0;
                int[] sub = new int[0];
                while (iterator.isSatisfiable()) {
                    sub = iterator.model();
                    counter++;
                } 
                org.junit.Assert.fail("testModelIteratorlitNum18litNum1013 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testModelIteratorlitNum18litNum1013_failAssert43litNum2549 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSubModelIteratorlitNum3173_failAssert245() throws Exception, ContradictionException, TimeoutException {
        try {
            IVecInt subset = new VecInt(new int[]{ 1, 2, 3, 4 });
            ModelIterator iterator = new SubModelIterator(SolverFactory.newDefault(), subset);
            iterator.addClause(new VecInt(new int[]{ 0, 2 }));
            iterator.addClause(new VecInt(new int[]{ -1, -2 }));
            iterator.addClause(new VecInt(new int[]{ -3, -4 }));
            iterator.addClause(new VecInt(new int[]{ 5, 6 }));
            iterator.addClause(new VecInt(new int[]{ -5, -6 }));
            iterator.addClause(new VecInt(new int[]{ -1, 3 }));
            int counter = 0;
            int[] sub = new int[0];
            while (iterator.isSatisfiable()) {
                sub = iterator.model();
                counter++;
            } 
            org.junit.Assert.fail("testSubModelIteratorlitNum3173 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSubModelIteratorlitNum3174_failAssert246() throws Exception, ContradictionException, TimeoutException {
        try {
            IVecInt subset = new VecInt(new int[]{ 1, 2, 3, 4 });
            ModelIterator iterator = new SubModelIterator(SolverFactory.newDefault(), subset);
            iterator.addClause(new VecInt(new int[]{ Integer.MAX_VALUE, 2 }));
            iterator.addClause(new VecInt(new int[]{ -1, -2 }));
            iterator.addClause(new VecInt(new int[]{ -3, -4 }));
            iterator.addClause(new VecInt(new int[]{ 5, 6 }));
            iterator.addClause(new VecInt(new int[]{ -5, -6 }));
            iterator.addClause(new VecInt(new int[]{ -1, 3 }));
            int counter = 0;
            int[] sub = new int[0];
            while (iterator.isSatisfiable()) {
                sub = iterator.model();
                counter++;
            } 
            org.junit.Assert.fail("testSubModelIteratorlitNum3174 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSubModelIteratorlitNum3175_failAssert247() throws Exception, ContradictionException, TimeoutException {
        try {
            IVecInt subset = new VecInt(new int[]{ 1, 2, 3, 4 });
            ModelIterator iterator = new SubModelIterator(SolverFactory.newDefault(), subset);
            iterator.addClause(new VecInt(new int[]{ Integer.MIN_VALUE, 2 }));
            iterator.addClause(new VecInt(new int[]{ -1, -2 }));
            iterator.addClause(new VecInt(new int[]{ -3, -4 }));
            iterator.addClause(new VecInt(new int[]{ 5, 6 }));
            iterator.addClause(new VecInt(new int[]{ -5, -6 }));
            iterator.addClause(new VecInt(new int[]{ -1, 3 }));
            int counter = 0;
            int[] sub = new int[0];
            while (iterator.isSatisfiable()) {
                sub = iterator.model();
                counter++;
            } 
            org.junit.Assert.fail("testSubModelIteratorlitNum3175 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-2147483648", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSubModelIteratorlitNum3179_failAssert248() throws Exception, ContradictionException, TimeoutException {
        try {
            IVecInt subset = new VecInt(new int[]{ 1, 2, 3, 4 });
            ModelIterator iterator = new SubModelIterator(SolverFactory.newDefault(), subset);
            iterator.addClause(new VecInt(new int[]{ 1, Integer.MAX_VALUE }));
            iterator.addClause(new VecInt(new int[]{ -1, -2 }));
            iterator.addClause(new VecInt(new int[]{ -3, -4 }));
            iterator.addClause(new VecInt(new int[]{ 5, 6 }));
            iterator.addClause(new VecInt(new int[]{ -5, -6 }));
            iterator.addClause(new VecInt(new int[]{ -1, 3 }));
            int counter = 0;
            int[] sub = new int[0];
            while (iterator.isSatisfiable()) {
                sub = iterator.model();
                counter++;
            } 
            org.junit.Assert.fail("testSubModelIteratorlitNum3179 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSubModelIteratorlitNum3181_failAssert250() throws Exception, ContradictionException, TimeoutException {
        try {
            IVecInt subset = new VecInt(new int[]{ 1, 2, 3, 4 });
            ModelIterator iterator = new SubModelIterator(SolverFactory.newDefault(), subset);
            iterator.addClause(new VecInt(new int[]{ 1, 0 }));
            iterator.addClause(new VecInt(new int[]{ -1, -2 }));
            iterator.addClause(new VecInt(new int[]{ -3, -4 }));
            iterator.addClause(new VecInt(new int[]{ 5, 6 }));
            iterator.addClause(new VecInt(new int[]{ -5, -6 }));
            iterator.addClause(new VecInt(new int[]{ -1, 3 }));
            int counter = 0;
            int[] sub = new int[0];
            while (iterator.isSatisfiable()) {
                sub = iterator.model();
                counter++;
            } 
            org.junit.Assert.fail("testSubModelIteratorlitNum3181 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSubModelIteratorlitNum3184_failAssert251() throws Exception, ContradictionException, TimeoutException {
        try {
            IVecInt subset = new VecInt(new int[]{ 1, 2, 3, 4 });
            ModelIterator iterator = new SubModelIterator(SolverFactory.newDefault(), subset);
            iterator.addClause(new VecInt(new int[]{ 1, 2 }));
            iterator.addClause(new VecInt(new int[]{ -0, -2 }));
            iterator.addClause(new VecInt(new int[]{ -3, -4 }));
            iterator.addClause(new VecInt(new int[]{ 5, 6 }));
            iterator.addClause(new VecInt(new int[]{ -5, -6 }));
            iterator.addClause(new VecInt(new int[]{ -1, 3 }));
            int counter = 0;
            int[] sub = new int[0];
            while (iterator.isSatisfiable()) {
                sub = iterator.model();
                counter++;
            } 
            org.junit.Assert.fail("testSubModelIteratorlitNum3184 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSubModelIteratorlitNum3185_failAssert252() throws Exception, ContradictionException, TimeoutException {
        try {
            IVecInt subset = new VecInt(new int[]{ 1, 2, 3, 4 });
            ModelIterator iterator = new SubModelIterator(SolverFactory.newDefault(), subset);
            iterator.addClause(new VecInt(new int[]{ 1, 2 }));
            iterator.addClause(new VecInt(new int[]{ -(Integer.MAX_VALUE), -2 }));
            iterator.addClause(new VecInt(new int[]{ -3, -4 }));
            iterator.addClause(new VecInt(new int[]{ 5, 6 }));
            iterator.addClause(new VecInt(new int[]{ -5, -6 }));
            iterator.addClause(new VecInt(new int[]{ -1, 3 }));
            int counter = 0;
            int[] sub = new int[0];
            while (iterator.isSatisfiable()) {
                sub = iterator.model();
                counter++;
            } 
            org.junit.Assert.fail("testSubModelIteratorlitNum3185 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSubModelIteratorlitNum3196_failAssert257() throws Exception, ContradictionException, TimeoutException {
        try {
            IVecInt subset = new VecInt(new int[]{ 1, 2, 3, 4 });
            ModelIterator iterator = new SubModelIterator(SolverFactory.newDefault(), subset);
            iterator.addClause(new VecInt(new int[]{ 1, 2 }));
            iterator.addClause(new VecInt(new int[]{ -1, -2 }));
            iterator.addClause(new VecInt(new int[]{ -(Integer.MAX_VALUE), -4 }));
            iterator.addClause(new VecInt(new int[]{ 5, 6 }));
            iterator.addClause(new VecInt(new int[]{ -5, -6 }));
            iterator.addClause(new VecInt(new int[]{ -1, 3 }));
            int counter = 0;
            int[] sub = new int[0];
            while (iterator.isSatisfiable()) {
                sub = iterator.model();
                counter++;
            } 
            org.junit.Assert.fail("testSubModelIteratorlitNum3196 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSubModelIteratorlitNum3197_failAssert258() throws Exception, ContradictionException, TimeoutException {
        try {
            IVecInt subset = new VecInt(new int[]{ 1, 2, 3, 4 });
            ModelIterator iterator = new SubModelIterator(SolverFactory.newDefault(), subset);
            iterator.addClause(new VecInt(new int[]{ 1, 2 }));
            iterator.addClause(new VecInt(new int[]{ -1, -2 }));
            iterator.addClause(new VecInt(new int[]{ -(Integer.MIN_VALUE), -4 }));
            iterator.addClause(new VecInt(new int[]{ 5, 6 }));
            iterator.addClause(new VecInt(new int[]{ -5, -6 }));
            iterator.addClause(new VecInt(new int[]{ -1, 3 }));
            int counter = 0;
            int[] sub = new int[0];
            while (iterator.isSatisfiable()) {
                sub = iterator.model();
                counter++;
            } 
            org.junit.Assert.fail("testSubModelIteratorlitNum3197 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-2147483648", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSubModelIteratorlitNum3198_failAssert259() throws Exception, ContradictionException, TimeoutException {
        try {
            IVecInt subset = new VecInt(new int[]{ 1, 2, 3, 4 });
            ModelIterator iterator = new SubModelIterator(SolverFactory.newDefault(), subset);
            iterator.addClause(new VecInt(new int[]{ 1, 2 }));
            iterator.addClause(new VecInt(new int[]{ -1, -2 }));
            iterator.addClause(new VecInt(new int[]{ -0, -4 }));
            iterator.addClause(new VecInt(new int[]{ 5, 6 }));
            iterator.addClause(new VecInt(new int[]{ -5, -6 }));
            iterator.addClause(new VecInt(new int[]{ -1, 3 }));
            int counter = 0;
            int[] sub = new int[0];
            while (iterator.isSatisfiable()) {
                sub = iterator.model();
                counter++;
            } 
            org.junit.Assert.fail("testSubModelIteratorlitNum3198 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSubModelIteratorlitNum3231_failAssert275() throws Exception, ContradictionException, TimeoutException {
        try {
            IVecInt subset = new VecInt(new int[]{ 1, 2, 3, 4 });
            ModelIterator iterator = new SubModelIterator(SolverFactory.newDefault(), subset);
            iterator.addClause(new VecInt(new int[]{ 1, 2 }));
            iterator.addClause(new VecInt(new int[]{ -1, -2 }));
            iterator.addClause(new VecInt(new int[]{ -3, -4 }));
            iterator.addClause(new VecInt(new int[]{ 5, 6 }));
            iterator.addClause(new VecInt(new int[]{ -5, -6 }));
            iterator.addClause(new VecInt(new int[]{ -0, 3 }));
            int counter = 0;
            int[] sub = new int[0];
            while (iterator.isSatisfiable()) {
                sub = iterator.model();
                counter++;
            } 
            org.junit.Assert.fail("testSubModelIteratorlitNum3231 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSubModelIteratorlitNum3232_failAssert276() throws Exception, ContradictionException, TimeoutException {
        try {
            IVecInt subset = new VecInt(new int[]{ 1, 2, 3, 4 });
            ModelIterator iterator = new SubModelIterator(SolverFactory.newDefault(), subset);
            iterator.addClause(new VecInt(new int[]{ 1, 2 }));
            iterator.addClause(new VecInt(new int[]{ -1, -2 }));
            iterator.addClause(new VecInt(new int[]{ -3, -4 }));
            iterator.addClause(new VecInt(new int[]{ 5, 6 }));
            iterator.addClause(new VecInt(new int[]{ -5, -6 }));
            iterator.addClause(new VecInt(new int[]{ -(Integer.MAX_VALUE), 3 }));
            int counter = 0;
            int[] sub = new int[0];
            while (iterator.isSatisfiable()) {
                sub = iterator.model();
                counter++;
            } 
            org.junit.Assert.fail("testSubModelIteratorlitNum3232 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSubModelIteratorlitNum3197_failAssert258_add4395_failAssert283() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                IVecInt subset = new VecInt(new int[]{ 1, 2, 3, 4 });
                ModelIterator iterator = new SubModelIterator(SolverFactory.newDefault(), subset);
                iterator.addClause(new VecInt(new int[]{ 1, 2 }));
                iterator.addClause(new VecInt(new int[]{ -1, -2 }));
                iterator.addClause(new VecInt(new int[]{ -(Integer.MIN_VALUE), -4 }));
                iterator.addClause(new VecInt(new int[]{ -(Integer.MIN_VALUE), -4 }));
                iterator.addClause(new VecInt(new int[]{ 5, 6 }));
                iterator.addClause(new VecInt(new int[]{ -5, -6 }));
                iterator.addClause(new VecInt(new int[]{ -1, 3 }));
                int counter = 0;
                int[] sub = new int[0];
                while (iterator.isSatisfiable()) {
                    sub = iterator.model();
                    counter++;
                } 
                org.junit.Assert.fail("testSubModelIteratorlitNum3197 should have thrown ArrayIndexOutOfBoundsException");
            }
            org.junit.Assert.fail("testSubModelIteratorlitNum3197_failAssert258_add4395 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-2147483648", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSubModelIteratorlitNum3175_failAssert247_add4371_failAssert284() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                IVecInt subset = new VecInt(new int[]{ 1, 2, 3, 4 });
                ModelIterator iterator = new SubModelIterator(SolverFactory.newDefault(), subset);
                iterator.addClause(new VecInt(new int[]{ Integer.MIN_VALUE, 2 }));
                iterator.addClause(new VecInt(new int[]{ Integer.MIN_VALUE, 2 }));
                iterator.addClause(new VecInt(new int[]{ -1, -2 }));
                iterator.addClause(new VecInt(new int[]{ -3, -4 }));
                iterator.addClause(new VecInt(new int[]{ 5, 6 }));
                iterator.addClause(new VecInt(new int[]{ -5, -6 }));
                iterator.addClause(new VecInt(new int[]{ -1, 3 }));
                int counter = 0;
                int[] sub = new int[0];
                while (iterator.isSatisfiable()) {
                    sub = iterator.model();
                    counter++;
                } 
                org.junit.Assert.fail("testSubModelIteratorlitNum3175 should have thrown ArrayIndexOutOfBoundsException");
            }
            org.junit.Assert.fail("testSubModelIteratorlitNum3175_failAssert247_add4371 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-2147483648", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSubModelIteratorlitNum3185_failAssert252_add4632_failAssert286() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                IVecInt subset = new VecInt(new int[]{ 1, 2, 3, 4 });
                ModelIterator iterator = new SubModelIterator(SolverFactory.newDefault(), subset);
                iterator.addClause(new VecInt(new int[]{ 1, 2 }));
                iterator.addClause(new VecInt(new int[]{ -(Integer.MAX_VALUE), -2 }));
                iterator.addClause(new VecInt(new int[]{ -(Integer.MAX_VALUE), -2 }));
                iterator.addClause(new VecInt(new int[]{ -3, -4 }));
                iterator.addClause(new VecInt(new int[]{ 5, 6 }));
                iterator.addClause(new VecInt(new int[]{ -5, -6 }));
                iterator.addClause(new VecInt(new int[]{ -1, 3 }));
                int counter = 0;
                int[] sub = new int[0];
                while (iterator.isSatisfiable()) {
                    sub = iterator.model();
                    counter++;
                } 
                org.junit.Assert.fail("testSubModelIteratorlitNum3185 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testSubModelIteratorlitNum3185_failAssert252_add4632 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSubModelIteratorlitNum3232_failAssert276_add4258_failAssert287() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                IVecInt subset = new VecInt(new int[]{ 1, 2, 3, 4 });
                ModelIterator iterator = new SubModelIterator(SolverFactory.newDefault(), subset);
                iterator.addClause(new VecInt(new int[]{ 1, 2 }));
                iterator.addClause(new VecInt(new int[]{ -1, -2 }));
                iterator.addClause(new VecInt(new int[]{ -3, -4 }));
                iterator.addClause(new VecInt(new int[]{ 5, 6 }));
                iterator.addClause(new VecInt(new int[]{ -5, -6 }));
                iterator.addClause(new VecInt(new int[]{ -(Integer.MAX_VALUE), 3 }));
                iterator.addClause(new VecInt(new int[]{ -(Integer.MAX_VALUE), 3 }));
                int counter = 0;
                int[] sub = new int[0];
                while (iterator.isSatisfiable()) {
                    sub = iterator.model();
                    counter++;
                } 
                org.junit.Assert.fail("testSubModelIteratorlitNum3232 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testSubModelIteratorlitNum3232_failAssert276_add4258 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSubModelIteratorlitNum3179_failAssert248_add3801_failAssert288() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                IVecInt subset = new VecInt(new int[]{ 1, 2, 3, 4 });
                ModelIterator iterator = new SubModelIterator(SolverFactory.newDefault(), subset);
                iterator.addClause(new VecInt(new int[]{ 1, Integer.MAX_VALUE }));
                iterator.addClause(new VecInt(new int[]{ 1, Integer.MAX_VALUE }));
                iterator.addClause(new VecInt(new int[]{ -1, -2 }));
                iterator.addClause(new VecInt(new int[]{ -3, -4 }));
                iterator.addClause(new VecInt(new int[]{ 5, 6 }));
                iterator.addClause(new VecInt(new int[]{ -5, -6 }));
                iterator.addClause(new VecInt(new int[]{ -1, 3 }));
                int counter = 0;
                int[] sub = new int[0];
                while (iterator.isSatisfiable()) {
                    sub = iterator.model();
                    counter++;
                } 
                org.junit.Assert.fail("testSubModelIteratorlitNum3179 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testSubModelIteratorlitNum3179_failAssert248_add3801 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSubModelIteratorlitNum3174_failAssert246_add4058_failAssert289() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                IVecInt subset = new VecInt(new int[]{ 1, 2, 3, 4 });
                ModelIterator iterator = new SubModelIterator(SolverFactory.newDefault(), subset);
                iterator.addClause(new VecInt(new int[]{ Integer.MAX_VALUE, 2 }));
                iterator.addClause(new VecInt(new int[]{ Integer.MAX_VALUE, 2 }));
                iterator.addClause(new VecInt(new int[]{ -1, -2 }));
                iterator.addClause(new VecInt(new int[]{ -3, -4 }));
                iterator.addClause(new VecInt(new int[]{ 5, 6 }));
                iterator.addClause(new VecInt(new int[]{ -5, -6 }));
                iterator.addClause(new VecInt(new int[]{ -1, 3 }));
                int counter = 0;
                int[] sub = new int[0];
                while (iterator.isSatisfiable()) {
                    sub = iterator.model();
                    counter++;
                } 
                org.junit.Assert.fail("testSubModelIteratorlitNum3174 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testSubModelIteratorlitNum3174_failAssert246_add4058 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSubModelIteratorlitNum3198_failAssert259_add4559_failAssert300() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                IVecInt subset = new VecInt(new int[]{ 1, 2, 3, 4 });
                ModelIterator iterator = new SubModelIterator(SolverFactory.newDefault(), subset);
                iterator.addClause(new VecInt(new int[]{ 1, 2 }));
                iterator.addClause(new VecInt(new int[]{ -1, -2 }));
                iterator.addClause(new VecInt(new int[]{ -0, -4 }));
                iterator.addClause(new VecInt(new int[]{ 5, 6 }));
                iterator.addClause(new VecInt(new int[]{ -5, -6 }));
                iterator.addClause(new VecInt(new int[]{ -5, -6 }));
                iterator.addClause(new VecInt(new int[]{ -1, 3 }));
                int counter = 0;
                int[] sub = new int[0];
                while (iterator.isSatisfiable()) {
                    sub = iterator.model();
                    counter++;
                } 
                org.junit.Assert.fail("testSubModelIteratorlitNum3198 should have thrown IllegalArgumentException");
            }
            org.junit.Assert.fail("testSubModelIteratorlitNum3198_failAssert259_add4559 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSubModelIteratorlitNum3173_failAssert245_add4565_failAssert303() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                IVecInt subset = new VecInt(new int[]{ 1, 2, 3, 4 });
                ModelIterator iterator = new SubModelIterator(SolverFactory.newDefault(), subset);
                iterator.addClause(new VecInt(new int[]{ 0, 2 }));
                iterator.addClause(new VecInt(new int[]{ -1, -2 }));
                iterator.addClause(new VecInt(new int[]{ -3, -4 }));
                iterator.addClause(new VecInt(new int[]{ 5, 6 }));
                iterator.addClause(new VecInt(new int[]{ -5, -6 }));
                iterator.addClause(new VecInt(new int[]{ -5, -6 }));
                iterator.addClause(new VecInt(new int[]{ -1, 3 }));
                int counter = 0;
                int[] sub = new int[0];
                while (iterator.isSatisfiable()) {
                    sub = iterator.model();
                    counter++;
                } 
                org.junit.Assert.fail("testSubModelIteratorlitNum3173 should have thrown IllegalArgumentException");
            }
            org.junit.Assert.fail("testSubModelIteratorlitNum3173_failAssert245_add4565 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSubModelIteratorlitNum3184_failAssert251_add4039_failAssert304() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                IVecInt subset = new VecInt(new int[]{ 1, 2, 3, 4 });
                ModelIterator iterator = new SubModelIterator(SolverFactory.newDefault(), subset);
                iterator.addClause(new VecInt(new int[]{ 1, 2 }));
                iterator.addClause(new VecInt(new int[]{ -0, -2 }));
                iterator.addClause(new VecInt(new int[]{ -3, -4 }));
                iterator.addClause(new VecInt(new int[]{ 5, 6 }));
                iterator.addClause(new VecInt(new int[]{ -5, -6 }));
                iterator.addClause(new VecInt(new int[]{ -5, -6 }));
                iterator.addClause(new VecInt(new int[]{ -1, 3 }));
                int counter = 0;
                int[] sub = new int[0];
                while (iterator.isSatisfiable()) {
                    sub = iterator.model();
                    counter++;
                } 
                org.junit.Assert.fail("testSubModelIteratorlitNum3184 should have thrown IllegalArgumentException");
            }
            org.junit.Assert.fail("testSubModelIteratorlitNum3184_failAssert251_add4039 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSubModelIteratorlitNum3181_failAssert250_add4417_failAssert307() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                IVecInt subset = new VecInt(new int[]{ 1, 2, 3, 4 });
                ModelIterator iterator = new SubModelIterator(SolverFactory.newDefault(), subset);
                iterator.addClause(new VecInt(new int[]{ 1, 0 }));
                iterator.addClause(new VecInt(new int[]{ -1, -2 }));
                iterator.addClause(new VecInt(new int[]{ -3, -4 }));
                iterator.addClause(new VecInt(new int[]{ 5, 6 }));
                iterator.addClause(new VecInt(new int[]{ -5, -6 }));
                iterator.addClause(new VecInt(new int[]{ -5, -6 }));
                iterator.addClause(new VecInt(new int[]{ -1, 3 }));
                int counter = 0;
                int[] sub = new int[0];
                while (iterator.isSatisfiable()) {
                    sub = iterator.model();
                    counter++;
                } 
                org.junit.Assert.fail("testSubModelIteratorlitNum3181 should have thrown IllegalArgumentException");
            }
            org.junit.Assert.fail("testSubModelIteratorlitNum3181_failAssert250_add4417 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSubModelIteratorlitNum3231_failAssert275_add3732_failAssert309() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                IVecInt subset = new VecInt(new int[]{ 1, 2, 3, 4 });
                ModelIterator iterator = new SubModelIterator(SolverFactory.newDefault(), subset);
                iterator.addClause(new VecInt(new int[]{ 1, 2 }));
                iterator.addClause(new VecInt(new int[]{ -1, -2 }));
                iterator.addClause(new VecInt(new int[]{ -3, -4 }));
                iterator.addClause(new VecInt(new int[]{ 5, 6 }));
                iterator.addClause(new VecInt(new int[]{ -5, -6 }));
                iterator.addClause(new VecInt(new int[]{ -5, -6 }));
                iterator.addClause(new VecInt(new int[]{ -0, 3 }));
                int counter = 0;
                int[] sub = new int[0];
                while (iterator.isSatisfiable()) {
                    sub = iterator.model();
                    counter++;
                } 
                org.junit.Assert.fail("testSubModelIteratorlitNum3231 should have thrown IllegalArgumentException");
            }
            org.junit.Assert.fail("testSubModelIteratorlitNum3231_failAssert275_add3732 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSubModelIteratorlitNum3173_failAssert245_add4562_failAssert324() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                IVecInt subset = new VecInt(new int[]{ 1, 2, 3, 4 });
                ModelIterator iterator = new SubModelIterator(SolverFactory.newDefault(), subset);
                iterator.addClause(new VecInt(new int[]{ 0, 2 }));
                iterator.addClause(new VecInt(new int[]{ -1, -2 }));
                iterator.addClause(new VecInt(new int[]{ -3, -4 }));
                iterator.addClause(new VecInt(new int[]{ 5, 6 }));
                iterator.addClause(new VecInt(new int[]{ 5, 6 }));
                iterator.addClause(new VecInt(new int[]{ -5, -6 }));
                iterator.addClause(new VecInt(new int[]{ -1, 3 }));
                int counter = 0;
                int[] sub = new int[0];
                while (iterator.isSatisfiable()) {
                    sub = iterator.model();
                    counter++;
                } 
                org.junit.Assert.fail("testSubModelIteratorlitNum3173 should have thrown IllegalArgumentException");
            }
            org.junit.Assert.fail("testSubModelIteratorlitNum3173_failAssert245_add4562 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSubModelIteratorlitNum3185_failAssert252_add4634_failAssert345() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                IVecInt subset = new VecInt(new int[]{ 1, 2, 3, 4 });
                ModelIterator iterator = new SubModelIterator(SolverFactory.newDefault(), subset);
                iterator.addClause(new VecInt(new int[]{ 1, 2 }));
                iterator.addClause(new VecInt(new int[]{ -(Integer.MAX_VALUE), -2 }));
                iterator.addClause(new VecInt(new int[]{ -3, -4 }));
                iterator.addClause(new VecInt(new int[]{ 5, 6 }));
                iterator.addClause(new VecInt(new int[]{ 5, 6 }));
                iterator.addClause(new VecInt(new int[]{ -5, -6 }));
                iterator.addClause(new VecInt(new int[]{ -1, 3 }));
                int counter = 0;
                int[] sub = new int[0];
                while (iterator.isSatisfiable()) {
                    sub = iterator.model();
                    counter++;
                } 
                org.junit.Assert.fail("testSubModelIteratorlitNum3185 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testSubModelIteratorlitNum3185_failAssert252_add4634 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSubModelIteratorlitNum3232_failAssert276litNum4002_failAssert462() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                IVecInt subset = new VecInt(new int[]{ 1, 2, 3, 4 });
                ModelIterator iterator = new SubModelIterator(SolverFactory.newDefault(), subset);
                iterator.addClause(new VecInt(new int[]{ 1, 2 }));
                iterator.addClause(new VecInt(new int[]{ -1, -2 }));
                iterator.addClause(new VecInt(new int[]{ -3, -4 }));
                iterator.addClause(new VecInt(new int[]{ 5, 6 }));
                iterator.addClause(new VecInt(new int[]{ -6, -6 }));
                iterator.addClause(new VecInt(new int[]{ -(Integer.MAX_VALUE), 3 }));
                int counter = 0;
                int[] sub = new int[0];
                while (iterator.isSatisfiable()) {
                    sub = iterator.model();
                    counter++;
                } 
                org.junit.Assert.fail("testSubModelIteratorlitNum3232 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testSubModelIteratorlitNum3232_failAssert276litNum4002 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSubModelIteratorlitNum3197_failAssert258_add4395_failAssert283_add6366_failAssert483() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    IVecInt subset = new VecInt(new int[]{ 1, 2, 3, 4 });
                    ModelIterator iterator = new SubModelIterator(SolverFactory.newDefault(), subset);
                    iterator.addClause(new VecInt(new int[]{ 1, 2 }));
                    iterator.addClause(new VecInt(new int[]{ -1, -2 }));
                    iterator.addClause(new VecInt(new int[]{ -(Integer.MIN_VALUE), -4 }));
                    iterator.addClause(new VecInt(new int[]{ -(Integer.MIN_VALUE), -4 }));
                    iterator.addClause(new VecInt(new int[]{ -(Integer.MIN_VALUE), -4 }));
                    iterator.addClause(new VecInt(new int[]{ 5, 6 }));
                    iterator.addClause(new VecInt(new int[]{ -5, -6 }));
                    iterator.addClause(new VecInt(new int[]{ -1, 3 }));
                    int counter = 0;
                    int[] sub = new int[0];
                    while (iterator.isSatisfiable()) {
                        sub = iterator.model();
                        counter++;
                    } 
                    org.junit.Assert.fail("testSubModelIteratorlitNum3197 should have thrown ArrayIndexOutOfBoundsException");
                }
                org.junit.Assert.fail("testSubModelIteratorlitNum3197_failAssert258_add4395 should have thrown ArrayIndexOutOfBoundsException");
            }
            org.junit.Assert.fail("testSubModelIteratorlitNum3197_failAssert258_add4395_failAssert283_add6366 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-2147483648", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSubModelIteratorlitNum3232_failAssert276litNum4002_failAssert462litNum5600_failAssert485() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    IVecInt subset = new VecInt(new int[]{ 1, 2, 3, 4 });
                    ModelIterator iterator = new SubModelIterator(SolverFactory.newDefault(), subset);
                    iterator.addClause(new VecInt(new int[]{ 1, 2 }));
                    iterator.addClause(new VecInt(new int[]{ -1, -2 }));
                    iterator.addClause(new VecInt(new int[]{ -3, -4 }));
                    iterator.addClause(new VecInt(new int[]{ 5, 6 }));
                    iterator.addClause(new VecInt(new int[]{ -6, -6 }));
                    iterator.addClause(new VecInt(new int[]{ -(Integer.MAX_VALUE), 0 }));
                    int counter = 0;
                    int[] sub = new int[0];
                    while (iterator.isSatisfiable()) {
                        sub = iterator.model();
                        counter++;
                    } 
                    org.junit.Assert.fail("testSubModelIteratorlitNum3232 should have thrown NegativeArraySizeException");
                }
                org.junit.Assert.fail("testSubModelIteratorlitNum3232_failAssert276litNum4002 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testSubModelIteratorlitNum3232_failAssert276litNum4002_failAssert462litNum5600 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSubModelIteratorlitNum3232_failAssert276litNum4002_failAssert462litNum5578_failAssert486() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    IVecInt subset = new VecInt(new int[]{ 1, 2, 3, 4 });
                    ModelIterator iterator = new SubModelIterator(SolverFactory.newDefault(), subset);
                    iterator.addClause(new VecInt(new int[]{ 1, 2 }));
                    iterator.addClause(new VecInt(new int[]{ -1, -2 }));
                    iterator.addClause(new VecInt(new int[]{ -3, -4 }));
                    iterator.addClause(new VecInt(new int[]{ 5, 6 }));
                    iterator.addClause(new VecInt(new int[]{ -6, -0 }));
                    iterator.addClause(new VecInt(new int[]{ -(Integer.MAX_VALUE), 3 }));
                    int counter = 0;
                    int[] sub = new int[0];
                    while (iterator.isSatisfiable()) {
                        sub = iterator.model();
                        counter++;
                    } 
                    org.junit.Assert.fail("testSubModelIteratorlitNum3232 should have thrown NegativeArraySizeException");
                }
                org.junit.Assert.fail("testSubModelIteratorlitNum3232_failAssert276litNum4002 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testSubModelIteratorlitNum3232_failAssert276litNum4002_failAssert462litNum5578 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSubModelIteratorlitNum3232_failAssert276litNum4002_failAssert462litNum5563_failAssert488() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    IVecInt subset = new VecInt(new int[]{ 1, 2, 3, 4 });
                    ModelIterator iterator = new SubModelIterator(SolverFactory.newDefault(), subset);
                    iterator.addClause(new VecInt(new int[]{ 1, 2 }));
                    iterator.addClause(new VecInt(new int[]{ -1, -2 }));
                    iterator.addClause(new VecInt(new int[]{ -3, -4 }));
                    iterator.addClause(new VecInt(new int[]{ 5, 6 }));
                    iterator.addClause(new VecInt(new int[]{ -6, -7 }));
                    iterator.addClause(new VecInt(new int[]{ -(Integer.MAX_VALUE), 3 }));
                    int counter = 0;
                    int[] sub = new int[0];
                    while (iterator.isSatisfiable()) {
                        sub = iterator.model();
                        counter++;
                    } 
                    org.junit.Assert.fail("testSubModelIteratorlitNum3232 should have thrown NegativeArraySizeException");
                }
                org.junit.Assert.fail("testSubModelIteratorlitNum3232_failAssert276litNum4002 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testSubModelIteratorlitNum3232_failAssert276litNum4002_failAssert462litNum5563 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSubModelIteratorlitNum3232_failAssert276litNum4002_failAssert462litNum5566_failAssert490() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    IVecInt subset = new VecInt(new int[]{ 1, 2, 3, 4 });
                    ModelIterator iterator = new SubModelIterator(SolverFactory.newDefault(), subset);
                    iterator.addClause(new VecInt(new int[]{ 1, 2 }));
                    iterator.addClause(new VecInt(new int[]{ -1, -2 }));
                    iterator.addClause(new VecInt(new int[]{ -3, -4 }));
                    iterator.addClause(new VecInt(new int[]{ 5, 6 }));
                    iterator.addClause(new VecInt(new int[]{ -6, -5 }));
                    iterator.addClause(new VecInt(new int[]{ -(Integer.MAX_VALUE), 3 }));
                    int counter = 0;
                    int[] sub = new int[0];
                    while (iterator.isSatisfiable()) {
                        sub = iterator.model();
                        counter++;
                    } 
                    org.junit.Assert.fail("testSubModelIteratorlitNum3232 should have thrown NegativeArraySizeException");
                }
                org.junit.Assert.fail("testSubModelIteratorlitNum3232_failAssert276litNum4002 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testSubModelIteratorlitNum3232_failAssert276litNum4002_failAssert462litNum5566 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSubModelIteratorlitNum3175_failAssert247_add4371_failAssert284_add5898_failAssert495() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    IVecInt subset = new VecInt(new int[]{ 1, 2, 3, 4 });
                    ModelIterator iterator = new SubModelIterator(SolverFactory.newDefault(), subset);
                    iterator.addClause(new VecInt(new int[]{ Integer.MIN_VALUE, 2 }));
                    iterator.addClause(new VecInt(new int[]{ Integer.MIN_VALUE, 2 }));
                    iterator.addClause(new VecInt(new int[]{ Integer.MIN_VALUE, 2 }));
                    iterator.addClause(new VecInt(new int[]{ -1, -2 }));
                    iterator.addClause(new VecInt(new int[]{ -3, -4 }));
                    iterator.addClause(new VecInt(new int[]{ 5, 6 }));
                    iterator.addClause(new VecInt(new int[]{ -5, -6 }));
                    iterator.addClause(new VecInt(new int[]{ -1, 3 }));
                    int counter = 0;
                    int[] sub = new int[0];
                    while (iterator.isSatisfiable()) {
                        sub = iterator.model();
                        counter++;
                    } 
                    org.junit.Assert.fail("testSubModelIteratorlitNum3175 should have thrown ArrayIndexOutOfBoundsException");
                }
                org.junit.Assert.fail("testSubModelIteratorlitNum3175_failAssert247_add4371 should have thrown ArrayIndexOutOfBoundsException");
            }
            org.junit.Assert.fail("testSubModelIteratorlitNum3175_failAssert247_add4371_failAssert284_add5898 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-2147483648", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSubModelIteratorlitNum3185_failAssert252_add4632_failAssert286_add6299_failAssert502() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    IVecInt subset = new VecInt(new int[]{ 1, 2, 3, 4 });
                    ModelIterator iterator = new SubModelIterator(SolverFactory.newDefault(), subset);
                    iterator.addClause(new VecInt(new int[]{ 1, 2 }));
                    iterator.addClause(new VecInt(new int[]{ -(Integer.MAX_VALUE), -2 }));
                    iterator.addClause(new VecInt(new int[]{ -(Integer.MAX_VALUE), -2 }));
                    iterator.addClause(new VecInt(new int[]{ -(Integer.MAX_VALUE), -2 }));
                    iterator.addClause(new VecInt(new int[]{ -3, -4 }));
                    iterator.addClause(new VecInt(new int[]{ 5, 6 }));
                    iterator.addClause(new VecInt(new int[]{ -5, -6 }));
                    iterator.addClause(new VecInt(new int[]{ -1, 3 }));
                    int counter = 0;
                    int[] sub = new int[0];
                    while (iterator.isSatisfiable()) {
                        sub = iterator.model();
                        counter++;
                    } 
                    org.junit.Assert.fail("testSubModelIteratorlitNum3185 should have thrown NegativeArraySizeException");
                }
                org.junit.Assert.fail("testSubModelIteratorlitNum3185_failAssert252_add4632 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testSubModelIteratorlitNum3185_failAssert252_add4632_failAssert286_add6299 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSubModelIteratorlitNum3174_failAssert246_add4058_failAssert289_add6298_failAssert506() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    IVecInt subset = new VecInt(new int[]{ 1, 2, 3, 4 });
                    ModelIterator iterator = new SubModelIterator(SolverFactory.newDefault(), subset);
                    iterator.addClause(new VecInt(new int[]{ Integer.MAX_VALUE, 2 }));
                    iterator.addClause(new VecInt(new int[]{ Integer.MAX_VALUE, 2 }));
                    iterator.addClause(new VecInt(new int[]{ Integer.MAX_VALUE, 2 }));
                    iterator.addClause(new VecInt(new int[]{ -1, -2 }));
                    iterator.addClause(new VecInt(new int[]{ -3, -4 }));
                    iterator.addClause(new VecInt(new int[]{ 5, 6 }));
                    iterator.addClause(new VecInt(new int[]{ -5, -6 }));
                    iterator.addClause(new VecInt(new int[]{ -1, 3 }));
                    int counter = 0;
                    int[] sub = new int[0];
                    while (iterator.isSatisfiable()) {
                        sub = iterator.model();
                        counter++;
                    } 
                    org.junit.Assert.fail("testSubModelIteratorlitNum3174 should have thrown NegativeArraySizeException");
                }
                org.junit.Assert.fail("testSubModelIteratorlitNum3174_failAssert246_add4058 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testSubModelIteratorlitNum3174_failAssert246_add4058_failAssert289_add6298 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSubModelIteratorlitNum3179_failAssert248_add3801_failAssert288_add5516_failAssert507() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    IVecInt subset = new VecInt(new int[]{ 1, 2, 3, 4 });
                    ModelIterator iterator = new SubModelIterator(SolverFactory.newDefault(), subset);
                    iterator.addClause(new VecInt(new int[]{ 1, Integer.MAX_VALUE }));
                    iterator.addClause(new VecInt(new int[]{ 1, Integer.MAX_VALUE }));
                    iterator.addClause(new VecInt(new int[]{ 1, Integer.MAX_VALUE }));
                    iterator.addClause(new VecInt(new int[]{ -1, -2 }));
                    iterator.addClause(new VecInt(new int[]{ -3, -4 }));
                    iterator.addClause(new VecInt(new int[]{ 5, 6 }));
                    iterator.addClause(new VecInt(new int[]{ -5, -6 }));
                    iterator.addClause(new VecInt(new int[]{ -1, 3 }));
                    int counter = 0;
                    int[] sub = new int[0];
                    while (iterator.isSatisfiable()) {
                        sub = iterator.model();
                        counter++;
                    } 
                    org.junit.Assert.fail("testSubModelIteratorlitNum3179 should have thrown NegativeArraySizeException");
                }
                org.junit.Assert.fail("testSubModelIteratorlitNum3179_failAssert248_add3801 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testSubModelIteratorlitNum3179_failAssert248_add3801_failAssert288_add5516 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSubModelIteratorlitNum3232_failAssert276litNum4002_failAssert462_add5692_failAssert515() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    IVecInt subset = new VecInt(new int[]{ 1, 2, 3, 4 });
                    ModelIterator iterator = new SubModelIterator(SolverFactory.newDefault(), subset);
                    iterator.addClause(new VecInt(new int[]{ 1, 2 }));
                    iterator.addClause(new VecInt(new int[]{ -1, -2 }));
                    iterator.addClause(new VecInt(new int[]{ -3, -4 }));
                    iterator.addClause(new VecInt(new int[]{ 5, 6 }));
                    iterator.addClause(new VecInt(new int[]{ -6, -6 }));
                    iterator.addClause(new VecInt(new int[]{ -(Integer.MAX_VALUE), 3 }));
                    int counter = 0;
                    int[] sub = new int[0];
                    while (iterator.isSatisfiable()) {
                        sub = iterator.model();
                        counter++;
                    } 
                    org.junit.Assert.fail("testSubModelIteratorlitNum3232 should have thrown NegativeArraySizeException");
                }
                org.junit.Assert.fail("testSubModelIteratorlitNum3232_failAssert276litNum4002 should have thrown NegativeArraySizeException");
            }
            org.junit.Assert.fail("testSubModelIteratorlitNum3232_failAssert276litNum4002_failAssert462_add5692 should have thrown NegativeArraySizeException");
        } catch (NegativeArraySizeException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSubModelIteratorlitNum3173_failAssert245_add4562_failAssert324litNum5803_failAssert569() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    IVecInt subset = new VecInt(new int[]{ 1, 2, 3, 4 });
                    ModelIterator iterator = new SubModelIterator(SolverFactory.newDefault(), subset);
                    iterator.addClause(new VecInt(new int[]{ 0, 2 }));
                    iterator.addClause(new VecInt(new int[]{ -1, -2 }));
                    iterator.addClause(new VecInt(new int[]{ -3, -4 }));
                    iterator.addClause(new VecInt(new int[]{ 0, 6 }));
                    iterator.addClause(new VecInt(new int[]{ 5, 6 }));
                    iterator.addClause(new VecInt(new int[]{ -5, -6 }));
                    iterator.addClause(new VecInt(new int[]{ -1, 3 }));
                    int counter = 0;
                    int[] sub = new int[0];
                    while (iterator.isSatisfiable()) {
                        sub = iterator.model();
                        counter++;
                    } 
                    org.junit.Assert.fail("testSubModelIteratorlitNum3173 should have thrown IllegalArgumentException");
                }
                org.junit.Assert.fail("testSubModelIteratorlitNum3173_failAssert245_add4562 should have thrown IllegalArgumentException");
            }
            org.junit.Assert.fail("testSubModelIteratorlitNum3173_failAssert245_add4562_failAssert324litNum5803 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSubModelIteratorlitNum3181_failAssert250_add4417_failAssert307litNum5401_failAssert619() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    IVecInt subset = new VecInt(new int[]{ 1, 2, 3, 4 });
                    ModelIterator iterator = new SubModelIterator(SolverFactory.newDefault(), subset);
                    iterator.addClause(new VecInt(new int[]{ 1, 0 }));
                    iterator.addClause(new VecInt(new int[]{ -1, -2 }));
                    iterator.addClause(new VecInt(new int[]{ -3, -4 }));
                    iterator.addClause(new VecInt(new int[]{ 5, 6 }));
                    iterator.addClause(new VecInt(new int[]{ -0, -6 }));
                    iterator.addClause(new VecInt(new int[]{ -5, -6 }));
                    iterator.addClause(new VecInt(new int[]{ -1, 3 }));
                    int counter = 0;
                    int[] sub = new int[0];
                    while (iterator.isSatisfiable()) {
                        sub = iterator.model();
                        counter++;
                    } 
                    org.junit.Assert.fail("testSubModelIteratorlitNum3181 should have thrown IllegalArgumentException");
                }
                org.junit.Assert.fail("testSubModelIteratorlitNum3181_failAssert250_add4417 should have thrown IllegalArgumentException");
            }
            org.junit.Assert.fail("testSubModelIteratorlitNum3181_failAssert250_add4417_failAssert307litNum5401 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSubModelIteratorlitNum3231_failAssert275_add3732_failAssert309litNum6022_failAssert628() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    IVecInt subset = new VecInt(new int[]{ 1, 2, 3, 4 });
                    ModelIterator iterator = new SubModelIterator(SolverFactory.newDefault(), subset);
                    iterator.addClause(new VecInt(new int[]{ 1, 2 }));
                    iterator.addClause(new VecInt(new int[]{ -1, -2 }));
                    iterator.addClause(new VecInt(new int[]{ -3, -4 }));
                    iterator.addClause(new VecInt(new int[]{ 5, 6 }));
                    iterator.addClause(new VecInt(new int[]{ -5, -6 }));
                    iterator.addClause(new VecInt(new int[]{ -5, -6 }));
                    iterator.addClause(new VecInt(new int[]{ -0, 0 }));
                    int counter = 0;
                    int[] sub = new int[0];
                    while (iterator.isSatisfiable()) {
                        sub = iterator.model();
                        counter++;
                    } 
                    org.junit.Assert.fail("testSubModelIteratorlitNum3231 should have thrown IllegalArgumentException");
                }
                org.junit.Assert.fail("testSubModelIteratorlitNum3231_failAssert275_add3732 should have thrown IllegalArgumentException");
            }
            org.junit.Assert.fail("testSubModelIteratorlitNum3231_failAssert275_add3732_failAssert309litNum6022 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSubModelIteratorlitNum3184_failAssert251_add4039_failAssert304litNum5140_failAssert637() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    IVecInt subset = new VecInt(new int[]{ 1, 2, 3, 4 });
                    ModelIterator iterator = new SubModelIterator(SolverFactory.newDefault(), subset);
                    iterator.addClause(new VecInt(new int[]{ 1, 2 }));
                    iterator.addClause(new VecInt(new int[]{ -0, -2 }));
                    iterator.addClause(new VecInt(new int[]{ -3, -4 }));
                    iterator.addClause(new VecInt(new int[]{ 5, 6 }));
                    iterator.addClause(new VecInt(new int[]{ -5, -0 }));
                    iterator.addClause(new VecInt(new int[]{ -5, -6 }));
                    iterator.addClause(new VecInt(new int[]{ -1, 3 }));
                    int counter = 0;
                    int[] sub = new int[0];
                    while (iterator.isSatisfiable()) {
                        sub = iterator.model();
                        counter++;
                    } 
                    org.junit.Assert.fail("testSubModelIteratorlitNum3184 should have thrown IllegalArgumentException");
                }
                org.junit.Assert.fail("testSubModelIteratorlitNum3184_failAssert251_add4039 should have thrown IllegalArgumentException");
            }
            org.junit.Assert.fail("testSubModelIteratorlitNum3184_failAssert251_add4039_failAssert304litNum5140 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            Assert.assertEquals("0 is not a valid variable identifier", expected.getMessage());
        }
    }
}

