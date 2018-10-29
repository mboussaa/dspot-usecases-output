package org.sat4j.tools;


import java.util.List;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.sat4j.core.VecInt;
import org.sat4j.minisat.SolverFactory;
import org.sat4j.minisat.constraints.cnf.OriginalBinaryClause;
import org.sat4j.minisat.constraints.cnf.OriginalWLClause;
import org.sat4j.specs.IConstr;
import org.sat4j.specs.IGroupSolver;
import org.sat4j.specs.IVecInt;


public class TestAllMUSesGroupTest {
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
        Assert.assertEquals("1", ((VecInt) (o_testSimpleCaseWithGroups__11)).toString());
        Assert.assertEquals(1, ((int) (((VecInt) (o_testSimpleCaseWithGroups__11)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testSimpleCaseWithGroups__11)).isEmpty());
        IVecInt o_testSimpleCaseWithGroups__12 = c2.push(2);
        Assert.assertEquals("2", ((VecInt) (o_testSimpleCaseWithGroups__12)).toString());
        Assert.assertEquals(2, ((int) (((VecInt) (o_testSimpleCaseWithGroups__12)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testSimpleCaseWithGroups__12)).isEmpty());
        IVecInt o_testSimpleCaseWithGroups__13 = c3.push((-1)).push((-2));
        Assert.assertEquals("-1,-2", ((VecInt) (o_testSimpleCaseWithGroups__13)).toString());
        Assert.assertEquals(-1, ((int) (((VecInt) (o_testSimpleCaseWithGroups__13)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testSimpleCaseWithGroups__13)).isEmpty());
        IVecInt o_testSimpleCaseWithGroups__17 = c4.push(3);
        Assert.assertEquals("3", ((VecInt) (o_testSimpleCaseWithGroups__17)).toString());
        Assert.assertEquals(3, ((int) (((VecInt) (o_testSimpleCaseWithGroups__17)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testSimpleCaseWithGroups__17)).isEmpty());
        IVecInt o_testSimpleCaseWithGroups__18 = c5.push((-3));
        Assert.assertEquals("-3", ((VecInt) (o_testSimpleCaseWithGroups__18)).toString());
        Assert.assertEquals(-3, ((int) (((VecInt) (o_testSimpleCaseWithGroups__18)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testSimpleCaseWithGroups__18)).isEmpty());
        int o_testSimpleCaseWithGroups__20 = this.solver.newVar(3);
        Assert.assertEquals(3, ((int) (o_testSimpleCaseWithGroups__20)));
        System.out.println("mus should be = [1 / 2]");
        {
            IConstr o_testSimpleCaseWithGroups__23 = this.solver.addClause(c1, 1);
            int[] array_784963679 = new int[]{2,8};
            	int[] array_887514515 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testSimpleCaseWithGroups__23).getLits();
            	for(int ii = 0; ii <array_784963679.length; ii++) {
            		org.junit.Assert.assertEquals(array_784963679[ii], array_887514515[ii]);
            	};
            Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testSimpleCaseWithGroups__23)).getActivity())), 0.1);
            Assert.assertFalse(((OriginalBinaryClause) (o_testSimpleCaseWithGroups__23)).isSatisfied());
            Assert.assertEquals("1[?] 4[?]", ((OriginalBinaryClause) (o_testSimpleCaseWithGroups__23)).toString());
            Assert.assertEquals(5, ((int) (((OriginalBinaryClause) (o_testSimpleCaseWithGroups__23)).hashCode())));
            IConstr o_testSimpleCaseWithGroups__24 = this.solver.addClause(c2, 1);
            int[] array_1485842533 = new int[]{4,8};
            	int[] array_794185248 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testSimpleCaseWithGroups__24).getLits();
            	for(int ii = 0; ii <array_1485842533.length; ii++) {
            		org.junit.Assert.assertEquals(array_1485842533[ii], array_794185248[ii]);
            	};
            Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testSimpleCaseWithGroups__24)).getActivity())), 0.1);
            Assert.assertFalse(((OriginalBinaryClause) (o_testSimpleCaseWithGroups__24)).isSatisfied());
            Assert.assertEquals("2[?] 4[?]", ((OriginalBinaryClause) (o_testSimpleCaseWithGroups__24)).toString());
            Assert.assertEquals(6, ((int) (((OriginalBinaryClause) (o_testSimpleCaseWithGroups__24)).hashCode())));
            IConstr o_testSimpleCaseWithGroups__25 = this.solver.addClause(c3, 1);
            int[] array_591378289 = new int[]{3,5,8};
            	int[] array_746725465 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testSimpleCaseWithGroups__25).getLits();
            	for(int ii = 0; ii <array_591378289.length; ii++) {
            		org.junit.Assert.assertEquals(array_591378289[ii], array_746725465[ii]);
            	};
            Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testSimpleCaseWithGroups__25)).getActivity())), 0.1);
            Assert.assertFalse(((OriginalWLClause) (o_testSimpleCaseWithGroups__25)).isSatisfied());
            Assert.assertEquals("-1[?] -2[?] 4[?] ", ((OriginalWLClause) (o_testSimpleCaseWithGroups__25)).toString());
            Assert.assertEquals(5, ((int) (((OriginalWLClause) (o_testSimpleCaseWithGroups__25)).hashCode())));
            IConstr o_testSimpleCaseWithGroups__26 = this.solver.addClause(c4, 2);
            int[] array_1197893885 = new int[]{6,10};
            	int[] array_261710085 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testSimpleCaseWithGroups__26).getLits();
            	for(int ii = 0; ii <array_1197893885.length; ii++) {
            		org.junit.Assert.assertEquals(array_1197893885[ii], array_261710085[ii]);
            	};
            Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testSimpleCaseWithGroups__26)).getActivity())), 0.1);
            Assert.assertFalse(((OriginalBinaryClause) (o_testSimpleCaseWithGroups__26)).isSatisfied());
            Assert.assertEquals("3[?] 5[?]", ((OriginalBinaryClause) (o_testSimpleCaseWithGroups__26)).toString());
            Assert.assertEquals(8, ((int) (((OriginalBinaryClause) (o_testSimpleCaseWithGroups__26)).hashCode())));
            IConstr o_testSimpleCaseWithGroups__27 = this.solver.addClause(c5, 2);
            int[] array_1577678971 = new int[]{7,10};
            	int[] array_1594763541 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testSimpleCaseWithGroups__27).getLits();
            	for(int ii = 0; ii <array_1577678971.length; ii++) {
            		org.junit.Assert.assertEquals(array_1577678971[ii], array_1594763541[ii]);
            	};
            Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testSimpleCaseWithGroups__27)).getActivity())), 0.1);
            Assert.assertFalse(((OriginalBinaryClause) (o_testSimpleCaseWithGroups__27)).isSatisfied());
            Assert.assertEquals("-3[?] 5[?]", ((OriginalBinaryClause) (o_testSimpleCaseWithGroups__27)).toString());
            Assert.assertEquals(8, ((int) (((OriginalBinaryClause) (o_testSimpleCaseWithGroups__27)).hashCode())));
            List<IVecInt> muses = this.allMUSes.computeAllMUSes();
            int o_testSimpleCaseWithGroups__30 = muses.size();
            Assert.assertEquals(2, ((int) (o_testSimpleCaseWithGroups__30)));
            int[] array_1129235743 = new int[]{2,8};
            	int[] array_1108964358 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testSimpleCaseWithGroups__23).getLits();
            	for(int ii = 0; ii <array_1129235743.length; ii++) {
            		org.junit.Assert.assertEquals(array_1129235743[ii], array_1108964358[ii]);
            	};
            Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testSimpleCaseWithGroups__23)).getActivity())), 0.1);
            Assert.assertFalse(((OriginalBinaryClause) (o_testSimpleCaseWithGroups__23)).isSatisfied());
            Assert.assertEquals("1[?] 4[?]", ((OriginalBinaryClause) (o_testSimpleCaseWithGroups__23)).toString());
            Assert.assertEquals(5, ((int) (((OriginalBinaryClause) (o_testSimpleCaseWithGroups__23)).hashCode())));
            int[] array_678321841 = new int[]{4,8};
            	int[] array_123827724 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testSimpleCaseWithGroups__24).getLits();
            	for(int ii = 0; ii <array_678321841.length; ii++) {
            		org.junit.Assert.assertEquals(array_678321841[ii], array_123827724[ii]);
            	};
            Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testSimpleCaseWithGroups__24)).getActivity())), 0.1);
            Assert.assertFalse(((OriginalBinaryClause) (o_testSimpleCaseWithGroups__24)).isSatisfied());
            Assert.assertEquals("2[?] 4[?]", ((OriginalBinaryClause) (o_testSimpleCaseWithGroups__24)).toString());
            Assert.assertEquals(6, ((int) (((OriginalBinaryClause) (o_testSimpleCaseWithGroups__24)).hashCode())));
            int[] array_1777426142 = new int[]{3,5,8};
            	int[] array_284104692 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testSimpleCaseWithGroups__25).getLits();
            	for(int ii = 0; ii <array_1777426142.length; ii++) {
            		org.junit.Assert.assertEquals(array_1777426142[ii], array_284104692[ii]);
            	};
            Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testSimpleCaseWithGroups__25)).getActivity())), 0.1);
            Assert.assertFalse(((OriginalWLClause) (o_testSimpleCaseWithGroups__25)).isSatisfied());
            Assert.assertEquals("-1[?] -2[?] 4[?] ", ((OriginalWLClause) (o_testSimpleCaseWithGroups__25)).toString());
            Assert.assertEquals(5, ((int) (((OriginalWLClause) (o_testSimpleCaseWithGroups__25)).hashCode())));
            int[] array_706062190 = new int[]{6,10};
            	int[] array_1944537630 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testSimpleCaseWithGroups__26).getLits();
            	for(int ii = 0; ii <array_706062190.length; ii++) {
            		org.junit.Assert.assertEquals(array_706062190[ii], array_1944537630[ii]);
            	};
            Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testSimpleCaseWithGroups__26)).getActivity())), 0.1);
            Assert.assertFalse(((OriginalBinaryClause) (o_testSimpleCaseWithGroups__26)).isSatisfied());
            Assert.assertEquals("3[?] 5[?]", ((OriginalBinaryClause) (o_testSimpleCaseWithGroups__26)).toString());
            Assert.assertEquals(8, ((int) (((OriginalBinaryClause) (o_testSimpleCaseWithGroups__26)).hashCode())));
            int[] array_1652536072 = new int[]{7,10};
            	int[] array_987921239 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testSimpleCaseWithGroups__27).getLits();
            	for(int ii = 0; ii <array_1652536072.length; ii++) {
            		org.junit.Assert.assertEquals(array_1652536072[ii], array_987921239[ii]);
            	};
            Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testSimpleCaseWithGroups__27)).getActivity())), 0.1);
            Assert.assertFalse(((OriginalBinaryClause) (o_testSimpleCaseWithGroups__27)).isSatisfied());
            Assert.assertEquals("-3[?] 5[?]", ((OriginalBinaryClause) (o_testSimpleCaseWithGroups__27)).toString());
            Assert.assertEquals(8, ((int) (((OriginalBinaryClause) (o_testSimpleCaseWithGroups__27)).hashCode())));
        }
        Assert.assertEquals("1,4", ((VecInt) (o_testSimpleCaseWithGroups__11)).toString());
        Assert.assertEquals(2, ((int) (((VecInt) (o_testSimpleCaseWithGroups__11)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testSimpleCaseWithGroups__11)).isEmpty());
        Assert.assertEquals("2,4", ((VecInt) (o_testSimpleCaseWithGroups__12)).toString());
        Assert.assertEquals(3, ((int) (((VecInt) (o_testSimpleCaseWithGroups__12)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testSimpleCaseWithGroups__12)).isEmpty());
        Assert.assertEquals("-1,-2,4", ((VecInt) (o_testSimpleCaseWithGroups__13)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_testSimpleCaseWithGroups__13)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testSimpleCaseWithGroups__13)).isEmpty());
        Assert.assertEquals("3,5", ((VecInt) (o_testSimpleCaseWithGroups__17)).toString());
        Assert.assertEquals(4, ((int) (((VecInt) (o_testSimpleCaseWithGroups__17)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testSimpleCaseWithGroups__17)).isEmpty());
        Assert.assertEquals("-3,5", ((VecInt) (o_testSimpleCaseWithGroups__18)).toString());
        Assert.assertEquals(1, ((int) (((VecInt) (o_testSimpleCaseWithGroups__18)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testSimpleCaseWithGroups__18)).isEmpty());
        Assert.assertEquals(3, ((int) (o_testSimpleCaseWithGroups__20)));
    }

    @Test(timeout = 10000)
    public void testSimpleCaseWithGroups2() throws Exception {
        IVecInt c1 = new VecInt();
        IVecInt c2 = new VecInt();
        IVecInt c3 = new VecInt();
        IVecInt c4 = new VecInt();
        IVecInt c5 = new VecInt();
        IVecInt o_testSimpleCaseWithGroups2__11 = c1.push(1);
        Assert.assertEquals("1", ((VecInt) (o_testSimpleCaseWithGroups2__11)).toString());
        Assert.assertEquals(1, ((int) (((VecInt) (o_testSimpleCaseWithGroups2__11)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testSimpleCaseWithGroups2__11)).isEmpty());
        IVecInt o_testSimpleCaseWithGroups2__12 = c2.push(2);
        Assert.assertEquals("2", ((VecInt) (o_testSimpleCaseWithGroups2__12)).toString());
        Assert.assertEquals(2, ((int) (((VecInt) (o_testSimpleCaseWithGroups2__12)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testSimpleCaseWithGroups2__12)).isEmpty());
        IVecInt o_testSimpleCaseWithGroups2__13 = c3.push((-1)).push((-2));
        Assert.assertEquals("-1,-2", ((VecInt) (o_testSimpleCaseWithGroups2__13)).toString());
        Assert.assertEquals(-1, ((int) (((VecInt) (o_testSimpleCaseWithGroups2__13)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testSimpleCaseWithGroups2__13)).isEmpty());
        IVecInt o_testSimpleCaseWithGroups2__17 = c4.push(3);
        Assert.assertEquals("3", ((VecInt) (o_testSimpleCaseWithGroups2__17)).toString());
        Assert.assertEquals(3, ((int) (((VecInt) (o_testSimpleCaseWithGroups2__17)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testSimpleCaseWithGroups2__17)).isEmpty());
        IVecInt o_testSimpleCaseWithGroups2__18 = c5.push((-3));
        Assert.assertEquals("-3", ((VecInt) (o_testSimpleCaseWithGroups2__18)).toString());
        Assert.assertEquals(-3, ((int) (((VecInt) (o_testSimpleCaseWithGroups2__18)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testSimpleCaseWithGroups2__18)).isEmpty());
        int o_testSimpleCaseWithGroups2__20 = this.solver.newVar(3);
        Assert.assertEquals(3, ((int) (o_testSimpleCaseWithGroups2__20)));
        System.out.println("mus should be = [1,2]");
        {
            IConstr o_testSimpleCaseWithGroups2__23 = this.solver.addClause(c1, 1);
            int[] array_1041138019 = new int[]{2,8};
            	int[] array_828373553 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testSimpleCaseWithGroups2__23).getLits();
            	for(int ii = 0; ii <array_1041138019.length; ii++) {
            		org.junit.Assert.assertEquals(array_1041138019[ii], array_828373553[ii]);
            	};
            Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testSimpleCaseWithGroups2__23)).getActivity())), 0.1);
            Assert.assertFalse(((OriginalBinaryClause) (o_testSimpleCaseWithGroups2__23)).isSatisfied());
            Assert.assertEquals("1[?] 4[?]", ((OriginalBinaryClause) (o_testSimpleCaseWithGroups2__23)).toString());
            Assert.assertEquals(5, ((int) (((OriginalBinaryClause) (o_testSimpleCaseWithGroups2__23)).hashCode())));
            IConstr o_testSimpleCaseWithGroups2__24 = this.solver.addClause(c2, 2);
            int[] array_585737644 = new int[]{4,10};
            	int[] array_1571685347 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testSimpleCaseWithGroups2__24).getLits();
            	for(int ii = 0; ii <array_585737644.length; ii++) {
            		org.junit.Assert.assertEquals(array_585737644[ii], array_1571685347[ii]);
            	};
            Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testSimpleCaseWithGroups2__24)).getActivity())), 0.1);
            Assert.assertFalse(((OriginalBinaryClause) (o_testSimpleCaseWithGroups2__24)).isSatisfied());
            Assert.assertEquals("2[?] 5[?]", ((OriginalBinaryClause) (o_testSimpleCaseWithGroups2__24)).toString());
            Assert.assertEquals(7, ((int) (((OriginalBinaryClause) (o_testSimpleCaseWithGroups2__24)).hashCode())));
            IConstr o_testSimpleCaseWithGroups2__25 = this.solver.addClause(c3, 1);
            int[] array_721640606 = new int[]{3,5,8};
            	int[] array_1447957359 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testSimpleCaseWithGroups2__25).getLits();
            	for(int ii = 0; ii <array_721640606.length; ii++) {
            		org.junit.Assert.assertEquals(array_721640606[ii], array_1447957359[ii]);
            	};
            Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testSimpleCaseWithGroups2__25)).getActivity())), 0.1);
            Assert.assertFalse(((OriginalWLClause) (o_testSimpleCaseWithGroups2__25)).isSatisfied());
            Assert.assertEquals("-1[?] -2[?] 4[?] ", ((OriginalWLClause) (o_testSimpleCaseWithGroups2__25)).toString());
            Assert.assertEquals(5, ((int) (((OriginalWLClause) (o_testSimpleCaseWithGroups2__25)).hashCode())));
            IConstr o_testSimpleCaseWithGroups2__26 = this.solver.addClause(c4, 2);
            int[] array_152275132 = new int[]{6,10};
            	int[] array_1048103814 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testSimpleCaseWithGroups2__26).getLits();
            	for(int ii = 0; ii <array_152275132.length; ii++) {
            		org.junit.Assert.assertEquals(array_152275132[ii], array_1048103814[ii]);
            	};
            Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testSimpleCaseWithGroups2__26)).getActivity())), 0.1);
            Assert.assertFalse(((OriginalBinaryClause) (o_testSimpleCaseWithGroups2__26)).isSatisfied());
            Assert.assertEquals("3[?] 5[?]", ((OriginalBinaryClause) (o_testSimpleCaseWithGroups2__26)).toString());
            Assert.assertEquals(8, ((int) (((OriginalBinaryClause) (o_testSimpleCaseWithGroups2__26)).hashCode())));
            IConstr o_testSimpleCaseWithGroups2__27 = this.solver.addClause(c5, 1);
            int[] array_721967590 = new int[]{7,8};
            	int[] array_1297459958 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testSimpleCaseWithGroups2__27).getLits();
            	for(int ii = 0; ii <array_721967590.length; ii++) {
            		org.junit.Assert.assertEquals(array_721967590[ii], array_1297459958[ii]);
            	};
            Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testSimpleCaseWithGroups2__27)).getActivity())), 0.1);
            Assert.assertFalse(((OriginalBinaryClause) (o_testSimpleCaseWithGroups2__27)).isSatisfied());
            Assert.assertEquals("-3[?] 4[?]", ((OriginalBinaryClause) (o_testSimpleCaseWithGroups2__27)).toString());
            Assert.assertEquals(7, ((int) (((OriginalBinaryClause) (o_testSimpleCaseWithGroups2__27)).hashCode())));
            List<IVecInt> muses = this.allMUSes.computeAllMUSes();
            int o_testSimpleCaseWithGroups2__30 = muses.size();
            Assert.assertEquals(1, ((int) (o_testSimpleCaseWithGroups2__30)));
            int[] array_2110649158 = new int[]{2,8};
            	int[] array_862217034 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testSimpleCaseWithGroups2__23).getLits();
            	for(int ii = 0; ii <array_2110649158.length; ii++) {
            		org.junit.Assert.assertEquals(array_2110649158[ii], array_862217034[ii]);
            	};
            Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testSimpleCaseWithGroups2__23)).getActivity())), 0.1);
            Assert.assertFalse(((OriginalBinaryClause) (o_testSimpleCaseWithGroups2__23)).isSatisfied());
            Assert.assertEquals("1[?] 4[F]", ((OriginalBinaryClause) (o_testSimpleCaseWithGroups2__23)).toString());
            Assert.assertEquals(5, ((int) (((OriginalBinaryClause) (o_testSimpleCaseWithGroups2__23)).hashCode())));
            int[] array_1671688712 = new int[]{4,10};
            	int[] array_1189637424 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testSimpleCaseWithGroups2__24).getLits();
            	for(int ii = 0; ii <array_1671688712.length; ii++) {
            		org.junit.Assert.assertEquals(array_1671688712[ii], array_1189637424[ii]);
            	};
            Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testSimpleCaseWithGroups2__24)).getActivity())), 0.1);
            Assert.assertFalse(((OriginalBinaryClause) (o_testSimpleCaseWithGroups2__24)).isSatisfied());
            Assert.assertEquals("2[?] 5[F]", ((OriginalBinaryClause) (o_testSimpleCaseWithGroups2__24)).toString());
            Assert.assertEquals(7, ((int) (((OriginalBinaryClause) (o_testSimpleCaseWithGroups2__24)).hashCode())));
            int[] array_1134615722 = new int[]{5,3,8};
            	int[] array_252246465 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testSimpleCaseWithGroups2__25).getLits();
            	for(int ii = 0; ii <array_1134615722.length; ii++) {
            		org.junit.Assert.assertEquals(array_1134615722[ii], array_252246465[ii]);
            	};
            Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testSimpleCaseWithGroups2__25)).getActivity())), 0.1);
            Assert.assertFalse(((OriginalWLClause) (o_testSimpleCaseWithGroups2__25)).isSatisfied());
            Assert.assertEquals("-2[?] -1[?] 4[F] ", ((OriginalWLClause) (o_testSimpleCaseWithGroups2__25)).toString());
            Assert.assertEquals(5, ((int) (((OriginalWLClause) (o_testSimpleCaseWithGroups2__25)).hashCode())));
            int[] array_605527779 = new int[]{6,10};
            	int[] array_1268946624 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testSimpleCaseWithGroups2__26).getLits();
            	for(int ii = 0; ii <array_605527779.length; ii++) {
            		org.junit.Assert.assertEquals(array_605527779[ii], array_1268946624[ii]);
            	};
            Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testSimpleCaseWithGroups2__26)).getActivity())), 0.1);
            Assert.assertFalse(((OriginalBinaryClause) (o_testSimpleCaseWithGroups2__26)).isSatisfied());
            Assert.assertEquals("3[?] 5[F]", ((OriginalBinaryClause) (o_testSimpleCaseWithGroups2__26)).toString());
            Assert.assertEquals(8, ((int) (((OriginalBinaryClause) (o_testSimpleCaseWithGroups2__26)).hashCode())));
            int[] array_846788200 = new int[]{7,8};
            	int[] array_235018526 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testSimpleCaseWithGroups2__27).getLits();
            	for(int ii = 0; ii <array_846788200.length; ii++) {
            		org.junit.Assert.assertEquals(array_846788200[ii], array_235018526[ii]);
            	};
            Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testSimpleCaseWithGroups2__27)).getActivity())), 0.1);
            Assert.assertFalse(((OriginalBinaryClause) (o_testSimpleCaseWithGroups2__27)).isSatisfied());
            Assert.assertEquals("-3[?] 4[F]", ((OriginalBinaryClause) (o_testSimpleCaseWithGroups2__27)).toString());
            Assert.assertEquals(7, ((int) (((OriginalBinaryClause) (o_testSimpleCaseWithGroups2__27)).hashCode())));
        }
        Assert.assertEquals("1,4", ((VecInt) (o_testSimpleCaseWithGroups2__11)).toString());
        Assert.assertEquals(2, ((int) (((VecInt) (o_testSimpleCaseWithGroups2__11)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testSimpleCaseWithGroups2__11)).isEmpty());
        Assert.assertEquals("2,5", ((VecInt) (o_testSimpleCaseWithGroups2__12)).toString());
        Assert.assertEquals(3, ((int) (((VecInt) (o_testSimpleCaseWithGroups2__12)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testSimpleCaseWithGroups2__12)).isEmpty());
        Assert.assertEquals("-1,-2,4", ((VecInt) (o_testSimpleCaseWithGroups2__13)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_testSimpleCaseWithGroups2__13)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testSimpleCaseWithGroups2__13)).isEmpty());
        Assert.assertEquals("3,5", ((VecInt) (o_testSimpleCaseWithGroups2__17)).toString());
        Assert.assertEquals(4, ((int) (((VecInt) (o_testSimpleCaseWithGroups2__17)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testSimpleCaseWithGroups2__17)).isEmpty());
        Assert.assertEquals("-3,4", ((VecInt) (o_testSimpleCaseWithGroups2__18)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_testSimpleCaseWithGroups2__18)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testSimpleCaseWithGroups2__18)).isEmpty());
        Assert.assertEquals(3, ((int) (o_testSimpleCaseWithGroups2__20)));
    }

    @Test(timeout = 10000)
    public void testVerySimpleCase() throws Exception {
        IVecInt c1 = new VecInt();
        IVecInt c2 = new VecInt();
        IVecInt o_testVerySimpleCase__5 = c1.push(1);
        Assert.assertEquals("1", ((VecInt) (o_testVerySimpleCase__5)).toString());
        Assert.assertEquals(1, ((int) (((VecInt) (o_testVerySimpleCase__5)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testVerySimpleCase__5)).isEmpty());
        IVecInt o_testVerySimpleCase__6 = c2.push((-1));
        Assert.assertEquals("-1", ((VecInt) (o_testVerySimpleCase__6)).toString());
        Assert.assertEquals(-1, ((int) (((VecInt) (o_testVerySimpleCase__6)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testVerySimpleCase__6)).isEmpty());
        int o_testVerySimpleCase__8 = this.solver.newVar(1);
        Assert.assertEquals(1, ((int) (o_testVerySimpleCase__8)));
        System.out.println("mus should be = [1,2]");
        {
            IConstr o_testVerySimpleCase__11 = this.solver.addClause(c1, 1);
            int[] array_281411453 = new int[]{2,4};
            	int[] array_926859555 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testVerySimpleCase__11).getLits();
            	for(int ii = 0; ii <array_281411453.length; ii++) {
            		org.junit.Assert.assertEquals(array_281411453[ii], array_926859555[ii]);
            	};
            Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testVerySimpleCase__11)).getActivity())), 0.1);
            Assert.assertFalse(((OriginalBinaryClause) (o_testVerySimpleCase__11)).isSatisfied());
            Assert.assertEquals("1[?] 2[?]", ((OriginalBinaryClause) (o_testVerySimpleCase__11)).toString());
            Assert.assertEquals(3, ((int) (((OriginalBinaryClause) (o_testVerySimpleCase__11)).hashCode())));
            IConstr o_testVerySimpleCase__12 = this.solver.addClause(c2, 2);
            int[] array_1690879753 = new int[]{3,6};
            	int[] array_1220137489 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testVerySimpleCase__12).getLits();
            	for(int ii = 0; ii <array_1690879753.length; ii++) {
            		org.junit.Assert.assertEquals(array_1690879753[ii], array_1220137489[ii]);
            	};
            Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testVerySimpleCase__12)).getActivity())), 0.1);
            Assert.assertFalse(((OriginalBinaryClause) (o_testVerySimpleCase__12)).isSatisfied());
            Assert.assertEquals("-1[?] 3[?]", ((OriginalBinaryClause) (o_testVerySimpleCase__12)).toString());
            Assert.assertEquals(4, ((int) (((OriginalBinaryClause) (o_testVerySimpleCase__12)).hashCode())));
            List<IVecInt> muses = this.allMUSes.computeAllMUSes();
            int o_testVerySimpleCase__15 = muses.size();
            Assert.assertEquals(1, ((int) (o_testVerySimpleCase__15)));
            int[] array_62044524 = new int[]{2,4};
            	int[] array_1063108186 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testVerySimpleCase__11).getLits();
            	for(int ii = 0; ii <array_62044524.length; ii++) {
            		org.junit.Assert.assertEquals(array_62044524[ii], array_1063108186[ii]);
            	};
            Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testVerySimpleCase__11)).getActivity())), 0.1);
            Assert.assertFalse(((OriginalBinaryClause) (o_testVerySimpleCase__11)).isSatisfied());
            Assert.assertEquals("1[?] 2[F]", ((OriginalBinaryClause) (o_testVerySimpleCase__11)).toString());
            Assert.assertEquals(3, ((int) (((OriginalBinaryClause) (o_testVerySimpleCase__11)).hashCode())));
            int[] array_1923705246 = new int[]{3,6};
            	int[] array_1521116451 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testVerySimpleCase__12).getLits();
            	for(int ii = 0; ii <array_1923705246.length; ii++) {
            		org.junit.Assert.assertEquals(array_1923705246[ii], array_1521116451[ii]);
            	};
            Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testVerySimpleCase__12)).getActivity())), 0.1);
            Assert.assertFalse(((OriginalBinaryClause) (o_testVerySimpleCase__12)).isSatisfied());
            Assert.assertEquals("-1[?] 3[F]", ((OriginalBinaryClause) (o_testVerySimpleCase__12)).toString());
            Assert.assertEquals(4, ((int) (((OriginalBinaryClause) (o_testVerySimpleCase__12)).hashCode())));
        }
        Assert.assertEquals("1,2", ((VecInt) (o_testVerySimpleCase__5)).toString());
        Assert.assertEquals(1, ((int) (((VecInt) (o_testVerySimpleCase__5)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testVerySimpleCase__5)).isEmpty());
        Assert.assertEquals("-1,3", ((VecInt) (o_testVerySimpleCase__6)).toString());
        Assert.assertEquals(1, ((int) (((VecInt) (o_testVerySimpleCase__6)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testVerySimpleCase__6)).isEmpty());
        Assert.assertEquals(1, ((int) (o_testVerySimpleCase__8)));
    }
}

