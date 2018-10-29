package org.sat4j.tools;


import java.util.List;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.sat4j.core.VecInt;
import org.sat4j.minisat.SolverFactory;
import org.sat4j.minisat.constraints.cnf.OriginalBinaryClause;
import org.sat4j.minisat.constraints.cnf.OriginalWLClause;
import org.sat4j.specs.ContradictionException;
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
    public void testSimpleCase() throws Exception {
        IVecInt c1 = new VecInt();
        IVecInt c2 = new VecInt();
        IVecInt c3 = new VecInt();
        IVecInt c4 = new VecInt();
        IVecInt c5 = new VecInt();
        IVecInt o_testSimpleCase__11 = c1.push(1);
        Assert.assertEquals("1", ((VecInt) (o_testSimpleCase__11)).toString());
        Assert.assertEquals(1, ((int) (((VecInt) (o_testSimpleCase__11)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testSimpleCase__11)).isEmpty());
        IVecInt o_testSimpleCase__12 = c2.push(2);
        Assert.assertEquals("2", ((VecInt) (o_testSimpleCase__12)).toString());
        Assert.assertEquals(2, ((int) (((VecInt) (o_testSimpleCase__12)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testSimpleCase__12)).isEmpty());
        IVecInt o_testSimpleCase__13 = c3.push((-1)).push((-2));
        Assert.assertEquals("-1,-2", ((VecInt) (o_testSimpleCase__13)).toString());
        Assert.assertEquals(-1, ((int) (((VecInt) (o_testSimpleCase__13)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testSimpleCase__13)).isEmpty());
        IVecInt o_testSimpleCase__17 = c4.push(3);
        Assert.assertEquals("3", ((VecInt) (o_testSimpleCase__17)).toString());
        Assert.assertEquals(3, ((int) (((VecInt) (o_testSimpleCase__17)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testSimpleCase__17)).isEmpty());
        IVecInt o_testSimpleCase__18 = c5.push((-3));
        Assert.assertEquals("-3", ((VecInt) (o_testSimpleCase__18)).toString());
        Assert.assertEquals(-3, ((int) (((VecInt) (o_testSimpleCase__18)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testSimpleCase__18)).isEmpty());
        int o_testSimpleCase__20 = this.solver.newVar(3);
        Assert.assertEquals(3, ((int) (o_testSimpleCase__20)));
        System.out.println("mus should be = [1,2,3 / 4,5]");
        try {
            IConstr o_testSimpleCase__24 = this.solver.addClause(c1, 1);
            int[] array_749485736 = new int[]{2,8};
            	int[] array_345486466 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testSimpleCase__24).getLits();
            	for(int ii = 0; ii <array_749485736.length; ii++) {
            		org.junit.Assert.assertEquals(array_749485736[ii], array_345486466[ii]);
            	};
            Assert.assertFalse(((OriginalBinaryClause) (o_testSimpleCase__24)).isSatisfied());
            Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testSimpleCase__24)).getActivity())), 0.1);
            Assert.assertEquals("1[?] 4[?]", ((OriginalBinaryClause) (o_testSimpleCase__24)).toString());
            Assert.assertEquals(5, ((int) (((OriginalBinaryClause) (o_testSimpleCase__24)).hashCode())));
            IConstr o_testSimpleCase__25 = this.solver.addClause(c2, 2);
            int[] array_983381124 = new int[]{4,10};
            	int[] array_589292090 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testSimpleCase__25).getLits();
            	for(int ii = 0; ii <array_983381124.length; ii++) {
            		org.junit.Assert.assertEquals(array_983381124[ii], array_589292090[ii]);
            	};
            Assert.assertFalse(((OriginalBinaryClause) (o_testSimpleCase__25)).isSatisfied());
            Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testSimpleCase__25)).getActivity())), 0.1);
            Assert.assertEquals("2[?] 5[?]", ((OriginalBinaryClause) (o_testSimpleCase__25)).toString());
            Assert.assertEquals(7, ((int) (((OriginalBinaryClause) (o_testSimpleCase__25)).hashCode())));
            IConstr o_testSimpleCase__26 = this.solver.addClause(c3, 3);
            int[] array_772042924 = new int[]{3,5,12};
            	int[] array_1574117232 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testSimpleCase__26).getLits();
            	for(int ii = 0; ii <array_772042924.length; ii++) {
            		org.junit.Assert.assertEquals(array_772042924[ii], array_1574117232[ii]);
            	};
            Assert.assertFalse(((OriginalWLClause) (o_testSimpleCase__26)).isSatisfied());
            Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testSimpleCase__26)).getActivity())), 0.1);
            Assert.assertEquals("-1[?] -2[?] 6[?] ", ((OriginalWLClause) (o_testSimpleCase__26)).toString());
            Assert.assertEquals(6, ((int) (((OriginalWLClause) (o_testSimpleCase__26)).hashCode())));
            IConstr o_testSimpleCase__27 = this.solver.addClause(c4, 4);
            int[] array_314941198 = new int[]{6,14};
            	int[] array_882709000 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testSimpleCase__27).getLits();
            	for(int ii = 0; ii <array_314941198.length; ii++) {
            		org.junit.Assert.assertEquals(array_314941198[ii], array_882709000[ii]);
            	};
            Assert.assertFalse(((OriginalBinaryClause) (o_testSimpleCase__27)).isSatisfied());
            Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testSimpleCase__27)).getActivity())), 0.1);
            Assert.assertEquals("3[?] 7[?]", ((OriginalBinaryClause) (o_testSimpleCase__27)).toString());
            Assert.assertEquals(10, ((int) (((OriginalBinaryClause) (o_testSimpleCase__27)).hashCode())));
            IConstr o_testSimpleCase__28 = this.solver.addClause(c5, 5);
            int[] array_1670829473 = new int[]{7,16};
            	int[] array_1547727969 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testSimpleCase__28).getLits();
            	for(int ii = 0; ii <array_1670829473.length; ii++) {
            		org.junit.Assert.assertEquals(array_1670829473[ii], array_1547727969[ii]);
            	};
            Assert.assertFalse(((OriginalBinaryClause) (o_testSimpleCase__28)).isSatisfied());
            Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testSimpleCase__28)).getActivity())), 0.1);
            Assert.assertEquals("-3[?] 8[?]", ((OriginalBinaryClause) (o_testSimpleCase__28)).toString());
            Assert.assertEquals(11, ((int) (((OriginalBinaryClause) (o_testSimpleCase__28)).hashCode())));
            List<IVecInt> muses = this.allMUSes.computeAllMUSes();
            int o_testSimpleCase__31 = muses.size();
            Assert.assertEquals(2, ((int) (o_testSimpleCase__31)));
            int[] array_470226195 = new int[]{2,8};
            	int[] array_450047133 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testSimpleCase__24).getLits();
            	for(int ii = 0; ii <array_470226195.length; ii++) {
            		org.junit.Assert.assertEquals(array_470226195[ii], array_450047133[ii]);
            	};
            Assert.assertFalse(((OriginalBinaryClause) (o_testSimpleCase__24)).isSatisfied());
            Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testSimpleCase__24)).getActivity())), 0.1);
            Assert.assertEquals("1[?] 4[?]", ((OriginalBinaryClause) (o_testSimpleCase__24)).toString());
            Assert.assertEquals(5, ((int) (((OriginalBinaryClause) (o_testSimpleCase__24)).hashCode())));
            int[] array_556289569 = new int[]{4,10};
            	int[] array_1096858921 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testSimpleCase__25).getLits();
            	for(int ii = 0; ii <array_556289569.length; ii++) {
            		org.junit.Assert.assertEquals(array_556289569[ii], array_1096858921[ii]);
            	};
            Assert.assertFalse(((OriginalBinaryClause) (o_testSimpleCase__25)).isSatisfied());
            Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testSimpleCase__25)).getActivity())), 0.1);
            Assert.assertEquals("2[?] 5[?]", ((OriginalBinaryClause) (o_testSimpleCase__25)).toString());
            Assert.assertEquals(7, ((int) (((OriginalBinaryClause) (o_testSimpleCase__25)).hashCode())));
            int[] array_1888624061 = new int[]{12,5,3};
            	int[] array_2094027604 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testSimpleCase__26).getLits();
            	for(int ii = 0; ii <array_1888624061.length; ii++) {
            		org.junit.Assert.assertEquals(array_1888624061[ii], array_2094027604[ii]);
            	};
            Assert.assertFalse(((OriginalWLClause) (o_testSimpleCase__26)).isSatisfied());
            Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testSimpleCase__26)).getActivity())), 0.1);
            Assert.assertEquals("6[?] -2[?] -1[?] ", ((OriginalWLClause) (o_testSimpleCase__26)).toString());
            Assert.assertEquals(6, ((int) (((OriginalWLClause) (o_testSimpleCase__26)).hashCode())));
            int[] array_784963679 = new int[]{6,14};
            	int[] array_887514515 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testSimpleCase__27).getLits();
            	for(int ii = 0; ii <array_784963679.length; ii++) {
            		org.junit.Assert.assertEquals(array_784963679[ii], array_887514515[ii]);
            	};
            Assert.assertFalse(((OriginalBinaryClause) (o_testSimpleCase__27)).isSatisfied());
            Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testSimpleCase__27)).getActivity())), 0.1);
            Assert.assertEquals("3[?] 7[?]", ((OriginalBinaryClause) (o_testSimpleCase__27)).toString());
            Assert.assertEquals(10, ((int) (((OriginalBinaryClause) (o_testSimpleCase__27)).hashCode())));
            int[] array_1485842533 = new int[]{7,16};
            	int[] array_794185248 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testSimpleCase__28).getLits();
            	for(int ii = 0; ii <array_1485842533.length; ii++) {
            		org.junit.Assert.assertEquals(array_1485842533[ii], array_794185248[ii]);
            	};
            Assert.assertFalse(((OriginalBinaryClause) (o_testSimpleCase__28)).isSatisfied());
            Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testSimpleCase__28)).getActivity())), 0.1);
            Assert.assertEquals("-3[?] 8[?]", ((OriginalBinaryClause) (o_testSimpleCase__28)).toString());
            Assert.assertEquals(11, ((int) (((OriginalBinaryClause) (o_testSimpleCase__28)).hashCode())));
        } catch (ContradictionException e) {
            e.printStackTrace();
        }
        Assert.assertEquals("1,4", ((VecInt) (o_testSimpleCase__11)).toString());
        Assert.assertEquals(2, ((int) (((VecInt) (o_testSimpleCase__11)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testSimpleCase__11)).isEmpty());
        Assert.assertEquals("2,5", ((VecInt) (o_testSimpleCase__12)).toString());
        Assert.assertEquals(3, ((int) (((VecInt) (o_testSimpleCase__12)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testSimpleCase__12)).isEmpty());
        Assert.assertEquals("-1,-2,6", ((VecInt) (o_testSimpleCase__13)).toString());
        Assert.assertEquals(1, ((int) (((VecInt) (o_testSimpleCase__13)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testSimpleCase__13)).isEmpty());
        Assert.assertEquals("3,7", ((VecInt) (o_testSimpleCase__17)).toString());
        Assert.assertEquals(5, ((int) (((VecInt) (o_testSimpleCase__17)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testSimpleCase__17)).isEmpty());
        Assert.assertEquals("-3,8", ((VecInt) (o_testSimpleCase__18)).toString());
        Assert.assertEquals(2, ((int) (((VecInt) (o_testSimpleCase__18)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testSimpleCase__18)).isEmpty());
        Assert.assertEquals(3, ((int) (o_testSimpleCase__20)));
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
        try {
            IConstr o_testSimpleCaseWithGroups__24 = this.solver.addClause(c1, 1);
            int[] array_591378289 = new int[]{2,8};
            	int[] array_746725465 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testSimpleCaseWithGroups__24).getLits();
            	for(int ii = 0; ii <array_591378289.length; ii++) {
            		org.junit.Assert.assertEquals(array_591378289[ii], array_746725465[ii]);
            	};
            Assert.assertFalse(((OriginalBinaryClause) (o_testSimpleCaseWithGroups__24)).isSatisfied());
            Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testSimpleCaseWithGroups__24)).getActivity())), 0.1);
            Assert.assertEquals("1[?] 4[?]", ((OriginalBinaryClause) (o_testSimpleCaseWithGroups__24)).toString());
            Assert.assertEquals(5, ((int) (((OriginalBinaryClause) (o_testSimpleCaseWithGroups__24)).hashCode())));
            IConstr o_testSimpleCaseWithGroups__25 = this.solver.addClause(c2, 1);
            int[] array_1197893885 = new int[]{4,8};
            	int[] array_261710085 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testSimpleCaseWithGroups__25).getLits();
            	for(int ii = 0; ii <array_1197893885.length; ii++) {
            		org.junit.Assert.assertEquals(array_1197893885[ii], array_261710085[ii]);
            	};
            Assert.assertFalse(((OriginalBinaryClause) (o_testSimpleCaseWithGroups__25)).isSatisfied());
            Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testSimpleCaseWithGroups__25)).getActivity())), 0.1);
            Assert.assertEquals("2[?] 4[?]", ((OriginalBinaryClause) (o_testSimpleCaseWithGroups__25)).toString());
            Assert.assertEquals(6, ((int) (((OriginalBinaryClause) (o_testSimpleCaseWithGroups__25)).hashCode())));
            IConstr o_testSimpleCaseWithGroups__26 = this.solver.addClause(c3, 1);
            int[] array_1577678971 = new int[]{3,5,8};
            	int[] array_1594763541 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testSimpleCaseWithGroups__26).getLits();
            	for(int ii = 0; ii <array_1577678971.length; ii++) {
            		org.junit.Assert.assertEquals(array_1577678971[ii], array_1594763541[ii]);
            	};
            Assert.assertFalse(((OriginalWLClause) (o_testSimpleCaseWithGroups__26)).isSatisfied());
            Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testSimpleCaseWithGroups__26)).getActivity())), 0.1);
            Assert.assertEquals("-1[?] -2[?] 4[?] ", ((OriginalWLClause) (o_testSimpleCaseWithGroups__26)).toString());
            Assert.assertEquals(5, ((int) (((OriginalWLClause) (o_testSimpleCaseWithGroups__26)).hashCode())));
            IConstr o_testSimpleCaseWithGroups__27 = this.solver.addClause(c4, 2);
            int[] array_1129235743 = new int[]{6,10};
            	int[] array_1108964358 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testSimpleCaseWithGroups__27).getLits();
            	for(int ii = 0; ii <array_1129235743.length; ii++) {
            		org.junit.Assert.assertEquals(array_1129235743[ii], array_1108964358[ii]);
            	};
            Assert.assertFalse(((OriginalBinaryClause) (o_testSimpleCaseWithGroups__27)).isSatisfied());
            Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testSimpleCaseWithGroups__27)).getActivity())), 0.1);
            Assert.assertEquals("3[?] 5[?]", ((OriginalBinaryClause) (o_testSimpleCaseWithGroups__27)).toString());
            Assert.assertEquals(8, ((int) (((OriginalBinaryClause) (o_testSimpleCaseWithGroups__27)).hashCode())));
            IConstr o_testSimpleCaseWithGroups__28 = this.solver.addClause(c5, 2);
            int[] array_678321841 = new int[]{7,10};
            	int[] array_123827724 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testSimpleCaseWithGroups__28).getLits();
            	for(int ii = 0; ii <array_678321841.length; ii++) {
            		org.junit.Assert.assertEquals(array_678321841[ii], array_123827724[ii]);
            	};
            Assert.assertFalse(((OriginalBinaryClause) (o_testSimpleCaseWithGroups__28)).isSatisfied());
            Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testSimpleCaseWithGroups__28)).getActivity())), 0.1);
            Assert.assertEquals("-3[?] 5[?]", ((OriginalBinaryClause) (o_testSimpleCaseWithGroups__28)).toString());
            Assert.assertEquals(8, ((int) (((OriginalBinaryClause) (o_testSimpleCaseWithGroups__28)).hashCode())));
            List<IVecInt> muses = this.allMUSes.computeAllMUSes();
            int o_testSimpleCaseWithGroups__31 = muses.size();
            Assert.assertEquals(2, ((int) (o_testSimpleCaseWithGroups__31)));
            int[] array_1777426142 = new int[]{2,8};
            	int[] array_284104692 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testSimpleCaseWithGroups__24).getLits();
            	for(int ii = 0; ii <array_1777426142.length; ii++) {
            		org.junit.Assert.assertEquals(array_1777426142[ii], array_284104692[ii]);
            	};
            Assert.assertFalse(((OriginalBinaryClause) (o_testSimpleCaseWithGroups__24)).isSatisfied());
            Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testSimpleCaseWithGroups__24)).getActivity())), 0.1);
            Assert.assertEquals("1[?] 4[?]", ((OriginalBinaryClause) (o_testSimpleCaseWithGroups__24)).toString());
            Assert.assertEquals(5, ((int) (((OriginalBinaryClause) (o_testSimpleCaseWithGroups__24)).hashCode())));
            int[] array_706062190 = new int[]{4,8};
            	int[] array_1944537630 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testSimpleCaseWithGroups__25).getLits();
            	for(int ii = 0; ii <array_706062190.length; ii++) {
            		org.junit.Assert.assertEquals(array_706062190[ii], array_1944537630[ii]);
            	};
            Assert.assertFalse(((OriginalBinaryClause) (o_testSimpleCaseWithGroups__25)).isSatisfied());
            Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testSimpleCaseWithGroups__25)).getActivity())), 0.1);
            Assert.assertEquals("2[?] 4[?]", ((OriginalBinaryClause) (o_testSimpleCaseWithGroups__25)).toString());
            Assert.assertEquals(6, ((int) (((OriginalBinaryClause) (o_testSimpleCaseWithGroups__25)).hashCode())));
            int[] array_1652536072 = new int[]{3,5,8};
            	int[] array_987921239 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testSimpleCaseWithGroups__26).getLits();
            	for(int ii = 0; ii <array_1652536072.length; ii++) {
            		org.junit.Assert.assertEquals(array_1652536072[ii], array_987921239[ii]);
            	};
            Assert.assertFalse(((OriginalWLClause) (o_testSimpleCaseWithGroups__26)).isSatisfied());
            Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testSimpleCaseWithGroups__26)).getActivity())), 0.1);
            Assert.assertEquals("-1[?] -2[?] 4[?] ", ((OriginalWLClause) (o_testSimpleCaseWithGroups__26)).toString());
            Assert.assertEquals(5, ((int) (((OriginalWLClause) (o_testSimpleCaseWithGroups__26)).hashCode())));
            int[] array_1041138019 = new int[]{6,10};
            	int[] array_828373553 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testSimpleCaseWithGroups__27).getLits();
            	for(int ii = 0; ii <array_1041138019.length; ii++) {
            		org.junit.Assert.assertEquals(array_1041138019[ii], array_828373553[ii]);
            	};
            Assert.assertFalse(((OriginalBinaryClause) (o_testSimpleCaseWithGroups__27)).isSatisfied());
            Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testSimpleCaseWithGroups__27)).getActivity())), 0.1);
            Assert.assertEquals("3[?] 5[?]", ((OriginalBinaryClause) (o_testSimpleCaseWithGroups__27)).toString());
            Assert.assertEquals(8, ((int) (((OriginalBinaryClause) (o_testSimpleCaseWithGroups__27)).hashCode())));
            int[] array_585737644 = new int[]{7,10};
            	int[] array_1571685347 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testSimpleCaseWithGroups__28).getLits();
            	for(int ii = 0; ii <array_585737644.length; ii++) {
            		org.junit.Assert.assertEquals(array_585737644[ii], array_1571685347[ii]);
            	};
            Assert.assertFalse(((OriginalBinaryClause) (o_testSimpleCaseWithGroups__28)).isSatisfied());
            Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testSimpleCaseWithGroups__28)).getActivity())), 0.1);
            Assert.assertEquals("-3[?] 5[?]", ((OriginalBinaryClause) (o_testSimpleCaseWithGroups__28)).toString());
            Assert.assertEquals(8, ((int) (((OriginalBinaryClause) (o_testSimpleCaseWithGroups__28)).hashCode())));
        } catch (ContradictionException e) {
            e.printStackTrace();
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
    public void testSimpleCaseWithGroups4() throws Exception {
        IVecInt c1 = new VecInt();
        IVecInt c2 = new VecInt();
        IVecInt c3 = new VecInt();
        IVecInt c4 = new VecInt();
        IVecInt c5 = new VecInt();
        IVecInt o_testSimpleCaseWithGroups4__11 = c1.push(1);
        Assert.assertEquals("1", ((VecInt) (o_testSimpleCaseWithGroups4__11)).toString());
        Assert.assertEquals(1, ((int) (((VecInt) (o_testSimpleCaseWithGroups4__11)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testSimpleCaseWithGroups4__11)).isEmpty());
        IVecInt o_testSimpleCaseWithGroups4__12 = c2.push(2);
        Assert.assertEquals("2", ((VecInt) (o_testSimpleCaseWithGroups4__12)).toString());
        Assert.assertEquals(2, ((int) (((VecInt) (o_testSimpleCaseWithGroups4__12)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testSimpleCaseWithGroups4__12)).isEmpty());
        IVecInt o_testSimpleCaseWithGroups4__13 = c3.push((-1)).push((-2));
        Assert.assertEquals("-1,-2", ((VecInt) (o_testSimpleCaseWithGroups4__13)).toString());
        Assert.assertEquals(-1, ((int) (((VecInt) (o_testSimpleCaseWithGroups4__13)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testSimpleCaseWithGroups4__13)).isEmpty());
        IVecInt o_testSimpleCaseWithGroups4__17 = c4.push(3);
        Assert.assertEquals("3", ((VecInt) (o_testSimpleCaseWithGroups4__17)).toString());
        Assert.assertEquals(3, ((int) (((VecInt) (o_testSimpleCaseWithGroups4__17)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testSimpleCaseWithGroups4__17)).isEmpty());
        IVecInt o_testSimpleCaseWithGroups4__18 = c5.push((-3));
        Assert.assertEquals("-3", ((VecInt) (o_testSimpleCaseWithGroups4__18)).toString());
        Assert.assertEquals(-3, ((int) (((VecInt) (o_testSimpleCaseWithGroups4__18)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testSimpleCaseWithGroups4__18)).isEmpty());
        int o_testSimpleCaseWithGroups4__20 = this.solver.newVar(3);
        Assert.assertEquals(3, ((int) (o_testSimpleCaseWithGroups4__20)));
        System.out.println("mus should be = [1,4 / 1,2,3]");
        try {
            IConstr o_testSimpleCaseWithGroups4__24 = this.solver.addClause(c1, 1);
            int[] array_823002707 = new int[]{2,8};
            	int[] array_1372257622 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testSimpleCaseWithGroups4__24).getLits();
            	for(int ii = 0; ii <array_823002707.length; ii++) {
            		org.junit.Assert.assertEquals(array_823002707[ii], array_1372257622[ii]);
            	};
            Assert.assertFalse(((OriginalBinaryClause) (o_testSimpleCaseWithGroups4__24)).isSatisfied());
            Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testSimpleCaseWithGroups4__24)).getActivity())), 0.1);
            Assert.assertEquals("1[?] 4[?]", ((OriginalBinaryClause) (o_testSimpleCaseWithGroups4__24)).toString());
            Assert.assertEquals(5, ((int) (((OriginalBinaryClause) (o_testSimpleCaseWithGroups4__24)).hashCode())));
            IConstr o_testSimpleCaseWithGroups4__25 = this.solver.addClause(c2, 2);
            int[] array_760124868 = new int[]{4,10};
            	int[] array_2114114659 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testSimpleCaseWithGroups4__25).getLits();
            	for(int ii = 0; ii <array_760124868.length; ii++) {
            		org.junit.Assert.assertEquals(array_760124868[ii], array_2114114659[ii]);
            	};
            Assert.assertFalse(((OriginalBinaryClause) (o_testSimpleCaseWithGroups4__25)).isSatisfied());
            Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testSimpleCaseWithGroups4__25)).getActivity())), 0.1);
            Assert.assertEquals("2[?] 5[?]", ((OriginalBinaryClause) (o_testSimpleCaseWithGroups4__25)).toString());
            Assert.assertEquals(7, ((int) (((OriginalBinaryClause) (o_testSimpleCaseWithGroups4__25)).hashCode())));
            IConstr o_testSimpleCaseWithGroups4__26 = this.solver.addClause(c3, 3);
            int[] array_1357620404 = new int[]{3,5,12};
            	int[] array_1331600276 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testSimpleCaseWithGroups4__26).getLits();
            	for(int ii = 0; ii <array_1357620404.length; ii++) {
            		org.junit.Assert.assertEquals(array_1357620404[ii], array_1331600276[ii]);
            	};
            Assert.assertFalse(((OriginalWLClause) (o_testSimpleCaseWithGroups4__26)).isSatisfied());
            Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testSimpleCaseWithGroups4__26)).getActivity())), 0.1);
            Assert.assertEquals("-1[?] -2[?] 6[?] ", ((OriginalWLClause) (o_testSimpleCaseWithGroups4__26)).toString());
            Assert.assertEquals(6, ((int) (((OriginalWLClause) (o_testSimpleCaseWithGroups4__26)).hashCode())));
            IConstr o_testSimpleCaseWithGroups4__27 = this.solver.addClause(c4, 4);
            int[] array_757435015 = new int[]{6,14};
            	int[] array_537550252 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testSimpleCaseWithGroups4__27).getLits();
            	for(int ii = 0; ii <array_757435015.length; ii++) {
            		org.junit.Assert.assertEquals(array_757435015[ii], array_537550252[ii]);
            	};
            Assert.assertFalse(((OriginalBinaryClause) (o_testSimpleCaseWithGroups4__27)).isSatisfied());
            Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testSimpleCaseWithGroups4__27)).getActivity())), 0.1);
            Assert.assertEquals("3[?] 7[?]", ((OriginalBinaryClause) (o_testSimpleCaseWithGroups4__27)).toString());
            Assert.assertEquals(10, ((int) (((OriginalBinaryClause) (o_testSimpleCaseWithGroups4__27)).hashCode())));
            IConstr o_testSimpleCaseWithGroups4__28 = this.solver.addClause(c5, 1);
            int[] array_977273294 = new int[]{7,8};
            	int[] array_941279842 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testSimpleCaseWithGroups4__28).getLits();
            	for(int ii = 0; ii <array_977273294.length; ii++) {
            		org.junit.Assert.assertEquals(array_977273294[ii], array_941279842[ii]);
            	};
            Assert.assertFalse(((OriginalBinaryClause) (o_testSimpleCaseWithGroups4__28)).isSatisfied());
            Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testSimpleCaseWithGroups4__28)).getActivity())), 0.1);
            Assert.assertEquals("-3[?] 4[?]", ((OriginalBinaryClause) (o_testSimpleCaseWithGroups4__28)).toString());
            Assert.assertEquals(7, ((int) (((OriginalBinaryClause) (o_testSimpleCaseWithGroups4__28)).hashCode())));
            List<IVecInt> muses = this.allMUSes.computeAllMUSes();
            int o_testSimpleCaseWithGroups4__31 = muses.size();
            Assert.assertEquals(2, ((int) (o_testSimpleCaseWithGroups4__31)));
            int[] array_1038643553 = new int[]{2,8};
            	int[] array_274256090 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testSimpleCaseWithGroups4__24).getLits();
            	for(int ii = 0; ii <array_1038643553.length; ii++) {
            		org.junit.Assert.assertEquals(array_1038643553[ii], array_274256090[ii]);
            	};
            Assert.assertFalse(((OriginalBinaryClause) (o_testSimpleCaseWithGroups4__24)).isSatisfied());
            Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testSimpleCaseWithGroups4__24)).getActivity())), 0.1);
            Assert.assertEquals("1[?] 4[F]", ((OriginalBinaryClause) (o_testSimpleCaseWithGroups4__24)).toString());
            Assert.assertEquals(5, ((int) (((OriginalBinaryClause) (o_testSimpleCaseWithGroups4__24)).hashCode())));
            int[] array_222559585 = new int[]{4,10};
            	int[] array_695499885 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testSimpleCaseWithGroups4__25).getLits();
            	for(int ii = 0; ii <array_222559585.length; ii++) {
            		org.junit.Assert.assertEquals(array_222559585[ii], array_695499885[ii]);
            	};
            Assert.assertFalse(((OriginalBinaryClause) (o_testSimpleCaseWithGroups4__25)).isSatisfied());
            Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testSimpleCaseWithGroups4__25)).getActivity())), 0.1);
            Assert.assertEquals("2[?] 5[?]", ((OriginalBinaryClause) (o_testSimpleCaseWithGroups4__25)).toString());
            Assert.assertEquals(7, ((int) (((OriginalBinaryClause) (o_testSimpleCaseWithGroups4__25)).hashCode())));
            int[] array_227038335 = new int[]{12,5,3};
            	int[] array_2018419883 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testSimpleCaseWithGroups4__26).getLits();
            	for(int ii = 0; ii <array_227038335.length; ii++) {
            		org.junit.Assert.assertEquals(array_227038335[ii], array_2018419883[ii]);
            	};
            Assert.assertFalse(((OriginalWLClause) (o_testSimpleCaseWithGroups4__26)).isSatisfied());
            Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testSimpleCaseWithGroups4__26)).getActivity())), 0.1);
            Assert.assertEquals("6[?] -2[?] -1[?] ", ((OriginalWLClause) (o_testSimpleCaseWithGroups4__26)).toString());
            Assert.assertEquals(6, ((int) (((OriginalWLClause) (o_testSimpleCaseWithGroups4__26)).hashCode())));
            int[] array_281411453 = new int[]{6,14};
            	int[] array_926859555 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testSimpleCaseWithGroups4__27).getLits();
            	for(int ii = 0; ii <array_281411453.length; ii++) {
            		org.junit.Assert.assertEquals(array_281411453[ii], array_926859555[ii]);
            	};
            Assert.assertFalse(((OriginalBinaryClause) (o_testSimpleCaseWithGroups4__27)).isSatisfied());
            Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testSimpleCaseWithGroups4__27)).getActivity())), 0.1);
            Assert.assertEquals("3[?] 7[?]", ((OriginalBinaryClause) (o_testSimpleCaseWithGroups4__27)).toString());
            Assert.assertEquals(10, ((int) (((OriginalBinaryClause) (o_testSimpleCaseWithGroups4__27)).hashCode())));
            int[] array_1690879753 = new int[]{7,8};
            	int[] array_1220137489 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testSimpleCaseWithGroups4__28).getLits();
            	for(int ii = 0; ii <array_1690879753.length; ii++) {
            		org.junit.Assert.assertEquals(array_1690879753[ii], array_1220137489[ii]);
            	};
            Assert.assertFalse(((OriginalBinaryClause) (o_testSimpleCaseWithGroups4__28)).isSatisfied());
            Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testSimpleCaseWithGroups4__28)).getActivity())), 0.1);
            Assert.assertEquals("-3[?] 4[F]", ((OriginalBinaryClause) (o_testSimpleCaseWithGroups4__28)).toString());
            Assert.assertEquals(7, ((int) (((OriginalBinaryClause) (o_testSimpleCaseWithGroups4__28)).hashCode())));
        } catch (ContradictionException e) {
            e.printStackTrace();
        }
        Assert.assertEquals("1,4", ((VecInt) (o_testSimpleCaseWithGroups4__11)).toString());
        Assert.assertEquals(2, ((int) (((VecInt) (o_testSimpleCaseWithGroups4__11)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testSimpleCaseWithGroups4__11)).isEmpty());
        Assert.assertEquals("2,5", ((VecInt) (o_testSimpleCaseWithGroups4__12)).toString());
        Assert.assertEquals(3, ((int) (((VecInt) (o_testSimpleCaseWithGroups4__12)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testSimpleCaseWithGroups4__12)).isEmpty());
        Assert.assertEquals("-1,-2,6", ((VecInt) (o_testSimpleCaseWithGroups4__13)).toString());
        Assert.assertEquals(1, ((int) (((VecInt) (o_testSimpleCaseWithGroups4__13)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testSimpleCaseWithGroups4__13)).isEmpty());
        Assert.assertEquals("3,7", ((VecInt) (o_testSimpleCaseWithGroups4__17)).toString());
        Assert.assertEquals(5, ((int) (((VecInt) (o_testSimpleCaseWithGroups4__17)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testSimpleCaseWithGroups4__17)).isEmpty());
        Assert.assertEquals("-3,4", ((VecInt) (o_testSimpleCaseWithGroups4__18)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_testSimpleCaseWithGroups4__18)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testSimpleCaseWithGroups4__18)).isEmpty());
        Assert.assertEquals(3, ((int) (o_testSimpleCaseWithGroups4__20)));
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
        try {
            IConstr o_testVerySimpleCase__12 = this.solver.addClause(c1, 1);
            int[] array_62044524 = new int[]{2,4};
            	int[] array_1063108186 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testVerySimpleCase__12).getLits();
            	for(int ii = 0; ii <array_62044524.length; ii++) {
            		org.junit.Assert.assertEquals(array_62044524[ii], array_1063108186[ii]);
            	};
            Assert.assertFalse(((OriginalBinaryClause) (o_testVerySimpleCase__12)).isSatisfied());
            Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testVerySimpleCase__12)).getActivity())), 0.1);
            Assert.assertEquals("1[?] 2[?]", ((OriginalBinaryClause) (o_testVerySimpleCase__12)).toString());
            Assert.assertEquals(3, ((int) (((OriginalBinaryClause) (o_testVerySimpleCase__12)).hashCode())));
            IConstr o_testVerySimpleCase__13 = this.solver.addClause(c2, 2);
            int[] array_1923705246 = new int[]{3,6};
            	int[] array_1521116451 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testVerySimpleCase__13).getLits();
            	for(int ii = 0; ii <array_1923705246.length; ii++) {
            		org.junit.Assert.assertEquals(array_1923705246[ii], array_1521116451[ii]);
            	};
            Assert.assertFalse(((OriginalBinaryClause) (o_testVerySimpleCase__13)).isSatisfied());
            Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testVerySimpleCase__13)).getActivity())), 0.1);
            Assert.assertEquals("-1[?] 3[?]", ((OriginalBinaryClause) (o_testVerySimpleCase__13)).toString());
            Assert.assertEquals(4, ((int) (((OriginalBinaryClause) (o_testVerySimpleCase__13)).hashCode())));
            List<IVecInt> muses = this.allMUSes.computeAllMUSes();
            int o_testVerySimpleCase__16 = muses.size();
            Assert.assertEquals(1, ((int) (o_testVerySimpleCase__16)));
            int[] array_1346453646 = new int[]{2,4};
            	int[] array_278638225 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testVerySimpleCase__12).getLits();
            	for(int ii = 0; ii <array_1346453646.length; ii++) {
            		org.junit.Assert.assertEquals(array_1346453646[ii], array_278638225[ii]);
            	};
            Assert.assertFalse(((OriginalBinaryClause) (o_testVerySimpleCase__12)).isSatisfied());
            Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testVerySimpleCase__12)).getActivity())), 0.1);
            Assert.assertEquals("1[?] 2[F]", ((OriginalBinaryClause) (o_testVerySimpleCase__12)).toString());
            Assert.assertEquals(3, ((int) (((OriginalBinaryClause) (o_testVerySimpleCase__12)).hashCode())));
            int[] array_2097144326 = new int[]{3,6};
            	int[] array_9719232 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testVerySimpleCase__13).getLits();
            	for(int ii = 0; ii <array_2097144326.length; ii++) {
            		org.junit.Assert.assertEquals(array_2097144326[ii], array_9719232[ii]);
            	};
            Assert.assertFalse(((OriginalBinaryClause) (o_testVerySimpleCase__13)).isSatisfied());
            Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testVerySimpleCase__13)).getActivity())), 0.1);
            Assert.assertEquals("-1[?] 3[F]", ((OriginalBinaryClause) (o_testVerySimpleCase__13)).toString());
            Assert.assertEquals(4, ((int) (((OriginalBinaryClause) (o_testVerySimpleCase__13)).hashCode())));
        } catch (ContradictionException e) {
            e.printStackTrace();
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

