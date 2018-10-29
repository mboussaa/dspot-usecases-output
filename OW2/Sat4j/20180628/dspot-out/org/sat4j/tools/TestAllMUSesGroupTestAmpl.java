package org.sat4j.tools;


import java.util.List;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.sat4j.core.VecInt;
import org.sat4j.minisat.SolverFactory;
import org.sat4j.specs.ContradictionException;
import org.sat4j.specs.IConstr;
import org.sat4j.specs.IGroupSolver;
import org.sat4j.specs.IVecInt;


public class TestAllMUSesGroupTestAmpl {
    private IGroupSolver solver;

    private AllMUSes allMUSes;

    @Before
    public void setUp() throws Exception {
        this.allMUSes = new AllMUSes(true, SolverFactory.instance());
        this.solver = allMUSes.getSolverInstance();
    }

    @Test(timeout = 10000)
    public void testSimpleCaseWithGroups() throws Exception {
        IVecInt c1 = new VecInt();
        IVecInt c2 = new VecInt();
        IVecInt c3 = new VecInt();
        IVecInt c4 = new VecInt();
        IVecInt c5 = new VecInt();
        IVecInt o_testSimpleCaseWithGroups__11 = c1.push(1);
        Assert.assertEquals("1", ((org.sat4j.core.VecInt)o_testSimpleCaseWithGroups__11).toString());
        Assert.assertEquals(1, ((int) (((org.sat4j.core.VecInt)o_testSimpleCaseWithGroups__11).hashCode())));
        Assert.assertFalse(((org.sat4j.core.VecInt)o_testSimpleCaseWithGroups__11).isEmpty());
        IVecInt o_testSimpleCaseWithGroups__12 = c2.push(2);
        Assert.assertEquals("2", ((org.sat4j.core.VecInt)o_testSimpleCaseWithGroups__12).toString());
        Assert.assertEquals(2, ((int) (((org.sat4j.core.VecInt)o_testSimpleCaseWithGroups__12).hashCode())));
        Assert.assertFalse(((org.sat4j.core.VecInt)o_testSimpleCaseWithGroups__12).isEmpty());
        IVecInt o_testSimpleCaseWithGroups__13 = c3.push((-1)).push((-2));
        Assert.assertEquals("-1,-2", ((org.sat4j.core.VecInt)o_testSimpleCaseWithGroups__13).toString());
        Assert.assertEquals(-1, ((int) (((org.sat4j.core.VecInt)o_testSimpleCaseWithGroups__13).hashCode())));
        Assert.assertFalse(((org.sat4j.core.VecInt)o_testSimpleCaseWithGroups__13).isEmpty());
        IVecInt o_testSimpleCaseWithGroups__17 = c4.push(3);
        Assert.assertEquals("3", ((org.sat4j.core.VecInt)o_testSimpleCaseWithGroups__17).toString());
        Assert.assertEquals(3, ((int) (((org.sat4j.core.VecInt)o_testSimpleCaseWithGroups__17).hashCode())));
        Assert.assertFalse(((org.sat4j.core.VecInt)o_testSimpleCaseWithGroups__17).isEmpty());
        IVecInt o_testSimpleCaseWithGroups__18 = c5.push((-3));
        Assert.assertEquals("-3", ((org.sat4j.core.VecInt)o_testSimpleCaseWithGroups__18).toString());
        Assert.assertEquals(-3, ((int) (((org.sat4j.core.VecInt)o_testSimpleCaseWithGroups__18).hashCode())));
        Assert.assertFalse(((org.sat4j.core.VecInt)o_testSimpleCaseWithGroups__18).isEmpty());
        int o_testSimpleCaseWithGroups__20 = this.solver.newVar(3);
        Assert.assertEquals(3, ((int) (o_testSimpleCaseWithGroups__20)));
        System.out.println("mus should be = [1 / 2]");
        try {
            IConstr o_testSimpleCaseWithGroups__24 = this.solver.addClause(c1, 1);
            int[] array_678321841 = new int[]{2, 8};
            	int[] array_123827724 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testSimpleCaseWithGroups__24).getLits();
            	for(int ii = 0; ii <array_678321841.length; ii++) {
            		org.junit.Assert.assertEquals(array_678321841[ii], array_123827724[ii]);
            	};
            Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testSimpleCaseWithGroups__24).isSatisfied());
            Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testSimpleCaseWithGroups__24).getActivity())), 0.1);
            Assert.assertEquals("1[?] 4[?]", ((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testSimpleCaseWithGroups__24).toString());
            Assert.assertEquals(5, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testSimpleCaseWithGroups__24).hashCode())));
            IConstr o_testSimpleCaseWithGroups__25 = this.solver.addClause(c2, 1);
            int[] array_1777426142 = new int[]{4, 8};
            	int[] array_284104692 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testSimpleCaseWithGroups__25).getLits();
            	for(int ii = 0; ii <array_1777426142.length; ii++) {
            		org.junit.Assert.assertEquals(array_1777426142[ii], array_284104692[ii]);
            	};
            Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testSimpleCaseWithGroups__25).isSatisfied());
            Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testSimpleCaseWithGroups__25).getActivity())), 0.1);
            Assert.assertEquals("2[?] 4[?]", ((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testSimpleCaseWithGroups__25).toString());
            Assert.assertEquals(6, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testSimpleCaseWithGroups__25).hashCode())));
            IConstr o_testSimpleCaseWithGroups__26 = this.solver.addClause(c3, 1);
            int[] array_706062190 = new int[]{3, 5, 8};
            	int[] array_1944537630 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testSimpleCaseWithGroups__26).getLits();
            	for(int ii = 0; ii <array_706062190.length; ii++) {
            		org.junit.Assert.assertEquals(array_706062190[ii], array_1944537630[ii]);
            	};
            Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testSimpleCaseWithGroups__26).isSatisfied());
            Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testSimpleCaseWithGroups__26).getActivity())), 0.1);
            Assert.assertEquals("-1[?] -2[?] 4[?] ", ((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testSimpleCaseWithGroups__26).toString());
            Assert.assertEquals(5, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testSimpleCaseWithGroups__26).hashCode())));
            IConstr o_testSimpleCaseWithGroups__27 = this.solver.addClause(c4, 2);
            int[] array_1652536072 = new int[]{6, 10};
            	int[] array_987921239 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testSimpleCaseWithGroups__27).getLits();
            	for(int ii = 0; ii <array_1652536072.length; ii++) {
            		org.junit.Assert.assertEquals(array_1652536072[ii], array_987921239[ii]);
            	};
            Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testSimpleCaseWithGroups__27).isSatisfied());
            Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testSimpleCaseWithGroups__27).getActivity())), 0.1);
            Assert.assertEquals("3[?] 5[?]", ((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testSimpleCaseWithGroups__27).toString());
            Assert.assertEquals(8, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testSimpleCaseWithGroups__27).hashCode())));
            IConstr o_testSimpleCaseWithGroups__28 = this.solver.addClause(c5, 2);
            int[] array_1041138019 = new int[]{7, 10};
            	int[] array_828373553 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testSimpleCaseWithGroups__28).getLits();
            	for(int ii = 0; ii <array_1041138019.length; ii++) {
            		org.junit.Assert.assertEquals(array_1041138019[ii], array_828373553[ii]);
            	};
            Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testSimpleCaseWithGroups__28).isSatisfied());
            Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testSimpleCaseWithGroups__28).getActivity())), 0.1);
            Assert.assertEquals("-3[?] 5[?]", ((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testSimpleCaseWithGroups__28).toString());
            Assert.assertEquals(8, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testSimpleCaseWithGroups__28).hashCode())));
            List<IVecInt> muses = this.allMUSes.computeAllMUSes();
            int o_testSimpleCaseWithGroups__31 = muses.size();
            Assert.assertEquals(2, ((int) (o_testSimpleCaseWithGroups__31)));
            int[] array_585737644 = new int[]{2, 8};
            	int[] array_1571685347 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testSimpleCaseWithGroups__24).getLits();
            	for(int ii = 0; ii <array_585737644.length; ii++) {
            		org.junit.Assert.assertEquals(array_585737644[ii], array_1571685347[ii]);
            	};
            Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testSimpleCaseWithGroups__24).isSatisfied());
            Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testSimpleCaseWithGroups__24).getActivity())), 0.1);
            Assert.assertEquals("1[?] 4[?]", ((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testSimpleCaseWithGroups__24).toString());
            Assert.assertEquals(5, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testSimpleCaseWithGroups__24).hashCode())));
            int[] array_721640606 = new int[]{4, 8};
            	int[] array_1447957359 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testSimpleCaseWithGroups__25).getLits();
            	for(int ii = 0; ii <array_721640606.length; ii++) {
            		org.junit.Assert.assertEquals(array_721640606[ii], array_1447957359[ii]);
            	};
            Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testSimpleCaseWithGroups__25).isSatisfied());
            Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testSimpleCaseWithGroups__25).getActivity())), 0.1);
            Assert.assertEquals("2[?] 4[?]", ((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testSimpleCaseWithGroups__25).toString());
            Assert.assertEquals(6, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testSimpleCaseWithGroups__25).hashCode())));
            int[] array_152275132 = new int[]{3, 5, 8};
            	int[] array_1048103814 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testSimpleCaseWithGroups__26).getLits();
            	for(int ii = 0; ii <array_152275132.length; ii++) {
            		org.junit.Assert.assertEquals(array_152275132[ii], array_1048103814[ii]);
            	};
            Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testSimpleCaseWithGroups__26).isSatisfied());
            Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testSimpleCaseWithGroups__26).getActivity())), 0.1);
            Assert.assertEquals("-1[?] -2[?] 4[?] ", ((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testSimpleCaseWithGroups__26).toString());
            Assert.assertEquals(5, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testSimpleCaseWithGroups__26).hashCode())));
            int[] array_721967590 = new int[]{6, 10};
            	int[] array_1297459958 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testSimpleCaseWithGroups__27).getLits();
            	for(int ii = 0; ii <array_721967590.length; ii++) {
            		org.junit.Assert.assertEquals(array_721967590[ii], array_1297459958[ii]);
            	};
            Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testSimpleCaseWithGroups__27).isSatisfied());
            Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testSimpleCaseWithGroups__27).getActivity())), 0.1);
            Assert.assertEquals("3[?] 5[?]", ((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testSimpleCaseWithGroups__27).toString());
            Assert.assertEquals(8, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testSimpleCaseWithGroups__27).hashCode())));
            int[] array_2110649158 = new int[]{7, 10};
            	int[] array_862217034 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testSimpleCaseWithGroups__28).getLits();
            	for(int ii = 0; ii <array_2110649158.length; ii++) {
            		org.junit.Assert.assertEquals(array_2110649158[ii], array_862217034[ii]);
            	};
            Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testSimpleCaseWithGroups__28).isSatisfied());
            Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testSimpleCaseWithGroups__28).getActivity())), 0.1);
            Assert.assertEquals("-3[?] 5[?]", ((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testSimpleCaseWithGroups__28).toString());
            Assert.assertEquals(8, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testSimpleCaseWithGroups__28).hashCode())));
        } catch (ContradictionException e) {
            e.printStackTrace();
        }
        Assert.assertEquals("1,4", ((org.sat4j.core.VecInt)o_testSimpleCaseWithGroups__11).toString());
        Assert.assertEquals(2, ((int) (((org.sat4j.core.VecInt)o_testSimpleCaseWithGroups__11).hashCode())));
        Assert.assertFalse(((org.sat4j.core.VecInt)o_testSimpleCaseWithGroups__11).isEmpty());
        Assert.assertEquals("2,4", ((org.sat4j.core.VecInt)o_testSimpleCaseWithGroups__12).toString());
        Assert.assertEquals(3, ((int) (((org.sat4j.core.VecInt)o_testSimpleCaseWithGroups__12).hashCode())));
        Assert.assertFalse(((org.sat4j.core.VecInt)o_testSimpleCaseWithGroups__12).isEmpty());
        Assert.assertEquals("-1,-2,4", ((org.sat4j.core.VecInt)o_testSimpleCaseWithGroups__13).toString());
        Assert.assertEquals(0, ((int) (((org.sat4j.core.VecInt)o_testSimpleCaseWithGroups__13).hashCode())));
        Assert.assertFalse(((org.sat4j.core.VecInt)o_testSimpleCaseWithGroups__13).isEmpty());
        Assert.assertEquals("3,5", ((org.sat4j.core.VecInt)o_testSimpleCaseWithGroups__17).toString());
        Assert.assertEquals(4, ((int) (((org.sat4j.core.VecInt)o_testSimpleCaseWithGroups__17).hashCode())));
        Assert.assertFalse(((org.sat4j.core.VecInt)o_testSimpleCaseWithGroups__17).isEmpty());
        Assert.assertEquals("-3,5", ((org.sat4j.core.VecInt)o_testSimpleCaseWithGroups__18).toString());
        Assert.assertEquals(1, ((int) (((org.sat4j.core.VecInt)o_testSimpleCaseWithGroups__18).hashCode())));
        Assert.assertFalse(((org.sat4j.core.VecInt)o_testSimpleCaseWithGroups__18).isEmpty());
        Assert.assertEquals(3, ((int) (o_testSimpleCaseWithGroups__20)));
    }
}

