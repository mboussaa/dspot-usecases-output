package org.sat4j.tools;


import java.util.List;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.sat4j.core.VecInt;
import org.sat4j.minisat.SolverFactory;
import org.sat4j.minisat.constraints.cnf.OriginalBinaryClause;
import org.sat4j.specs.IConstr;
import org.sat4j.specs.IGroupSolver;
import org.sat4j.specs.IVecInt;


public class TestAllMSSes {
    private AllMUSes allMUSes;

    private IGroupSolver solver;

    @Before
    public void setUp() throws Exception {
        this.allMUSes = new AllMUSes(true, SolverFactory.instance());
        this.solver = allMUSes.getSolverInstance();
    }

    @Test(timeout = 10000)
    public void testSimpleCasePermut() throws Exception {
        IVecInt c1 = new VecInt();
        IVecInt c2 = new VecInt();
        IVecInt c3 = new VecInt();
        IVecInt c4 = new VecInt();
        IVecInt c5 = new VecInt();
        IVecInt c6 = new VecInt();
        IVecInt c7 = new VecInt();
        IVecInt o_testSimpleCasePermut__15 = c1.push(1);
        Assert.assertEquals("1", ((VecInt) (o_testSimpleCasePermut__15)).toString());
        Assert.assertEquals(1, ((int) (((VecInt) (o_testSimpleCasePermut__15)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testSimpleCasePermut__15)).isEmpty());
        IVecInt o_testSimpleCasePermut__18 = c2.push(2);
        Assert.assertEquals("2", ((VecInt) (o_testSimpleCasePermut__18)).toString());
        Assert.assertEquals(2, ((int) (((VecInt) (o_testSimpleCasePermut__18)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testSimpleCasePermut__18)).isEmpty());
        IVecInt o_testSimpleCasePermut__19 = c3.push(1);
        Assert.assertEquals("1", ((VecInt) (o_testSimpleCasePermut__19)).toString());
        Assert.assertEquals(1, ((int) (((VecInt) (o_testSimpleCasePermut__19)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testSimpleCasePermut__19)).isEmpty());
        IVecInt o_testSimpleCasePermut__21 = c4.push(3);
        Assert.assertEquals("3", ((VecInt) (o_testSimpleCasePermut__21)).toString());
        Assert.assertEquals(3, ((int) (((VecInt) (o_testSimpleCasePermut__21)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testSimpleCasePermut__21)).isEmpty());
        IVecInt o_testSimpleCasePermut__22 = c5.push(4);
        Assert.assertEquals("4", ((VecInt) (o_testSimpleCasePermut__22)).toString());
        Assert.assertEquals(4, ((int) (((VecInt) (o_testSimpleCasePermut__22)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testSimpleCasePermut__22)).isEmpty());
        IVecInt o_testSimpleCasePermut__24 = c6.push(2);
        Assert.assertEquals("2", ((VecInt) (o_testSimpleCasePermut__24)).toString());
        Assert.assertEquals(2, ((int) (((VecInt) (o_testSimpleCasePermut__24)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testSimpleCasePermut__24)).isEmpty());
        IVecInt o_testSimpleCasePermut__25 = c7.push((-4)).push((-1));
        Assert.assertEquals("-4,-1", ((VecInt) (o_testSimpleCasePermut__25)).toString());
        Assert.assertEquals(-2, ((int) (((VecInt) (o_testSimpleCasePermut__25)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testSimpleCasePermut__25)).isEmpty());
        int o_testSimpleCasePermut__30 = this.solver.newVar(4);
        Assert.assertEquals(4, ((int) (o_testSimpleCasePermut__30)));
        {
            IConstr o_testSimpleCasePermut__32 = this.solver.addClause(c1, 1);
            int[] array_992516511 = new int[]{2,10};
            	int[] array_461243474 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testSimpleCasePermut__32).getLits();
            	for(int ii = 0; ii <array_992516511.length; ii++) {
            		org.junit.Assert.assertEquals(array_992516511[ii], array_461243474[ii]);
            	};
            Assert.assertFalse(((OriginalBinaryClause) (o_testSimpleCasePermut__32)).isSatisfied());
            Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testSimpleCasePermut__32)).getActivity())), 0.1);
            Assert.assertEquals("1[?] 5[?]", ((OriginalBinaryClause) (o_testSimpleCasePermut__32)).toString());
            Assert.assertEquals(6, ((int) (((OriginalBinaryClause) (o_testSimpleCasePermut__32)).hashCode())));
            IConstr o_testSimpleCasePermut__33 = this.solver.addClause(c2, 1);
            int[] array_214670271 = new int[]{4,10};
            	int[] array_1681506115 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testSimpleCasePermut__33).getLits();
            	for(int ii = 0; ii <array_214670271.length; ii++) {
            		org.junit.Assert.assertEquals(array_214670271[ii], array_1681506115[ii]);
            	};
            Assert.assertFalse(((OriginalBinaryClause) (o_testSimpleCasePermut__33)).isSatisfied());
            Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testSimpleCasePermut__33)).getActivity())), 0.1);
            Assert.assertEquals("2[?] 5[?]", ((OriginalBinaryClause) (o_testSimpleCasePermut__33)).toString());
            Assert.assertEquals(7, ((int) (((OriginalBinaryClause) (o_testSimpleCasePermut__33)).hashCode())));
            IConstr o_testSimpleCasePermut__34 = this.solver.addClause(c3, 2);
            int[] array_1956005284 = new int[]{2,12};
            	int[] array_1733896969 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testSimpleCasePermut__34).getLits();
            	for(int ii = 0; ii <array_1956005284.length; ii++) {
            		org.junit.Assert.assertEquals(array_1956005284[ii], array_1733896969[ii]);
            	};
            Assert.assertFalse(((OriginalBinaryClause) (o_testSimpleCasePermut__34)).isSatisfied());
            Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testSimpleCasePermut__34)).getActivity())), 0.1);
            Assert.assertEquals("1[?] 6[?]", ((OriginalBinaryClause) (o_testSimpleCasePermut__34)).toString());
            Assert.assertEquals(7, ((int) (((OriginalBinaryClause) (o_testSimpleCasePermut__34)).hashCode())));
            IConstr o_testSimpleCasePermut__35 = this.solver.addClause(c4, 2);
            int[] array_994963651 = new int[]{6,12};
            	int[] array_1810461298 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testSimpleCasePermut__35).getLits();
            	for(int ii = 0; ii <array_994963651.length; ii++) {
            		org.junit.Assert.assertEquals(array_994963651[ii], array_1810461298[ii]);
            	};
            Assert.assertFalse(((OriginalBinaryClause) (o_testSimpleCasePermut__35)).isSatisfied());
            Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testSimpleCasePermut__35)).getActivity())), 0.1);
            Assert.assertEquals("3[?] 6[?]", ((OriginalBinaryClause) (o_testSimpleCasePermut__35)).toString());
            Assert.assertEquals(9, ((int) (((OriginalBinaryClause) (o_testSimpleCasePermut__35)).hashCode())));
            IConstr o_testSimpleCasePermut__36 = this.solver.addClause(c5, 3);
            int[] array_1227856507 = new int[]{8,14};
            	int[] array_713970107 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testSimpleCasePermut__36).getLits();
            	for(int ii = 0; ii <array_1227856507.length; ii++) {
            		org.junit.Assert.assertEquals(array_1227856507[ii], array_713970107[ii]);
            	};
            Assert.assertFalse(((OriginalBinaryClause) (o_testSimpleCasePermut__36)).isSatisfied());
            Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testSimpleCasePermut__36)).getActivity())), 0.1);
            Assert.assertEquals("4[?] 7[?]", ((OriginalBinaryClause) (o_testSimpleCasePermut__36)).toString());
            Assert.assertEquals(11, ((int) (((OriginalBinaryClause) (o_testSimpleCasePermut__36)).hashCode())));
            IConstr o_testSimpleCasePermut__37 = this.solver.addClause(c6, 3);
            int[] array_99366260 = new int[]{4,14};
            	int[] array_1733528622 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testSimpleCasePermut__37).getLits();
            	for(int ii = 0; ii <array_99366260.length; ii++) {
            		org.junit.Assert.assertEquals(array_99366260[ii], array_1733528622[ii]);
            	};
            Assert.assertFalse(((OriginalBinaryClause) (o_testSimpleCasePermut__37)).isSatisfied());
            Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testSimpleCasePermut__37)).getActivity())), 0.1);
            Assert.assertEquals("2[?] 7[?]", ((OriginalBinaryClause) (o_testSimpleCasePermut__37)).toString());
            Assert.assertEquals(9, ((int) (((OriginalBinaryClause) (o_testSimpleCasePermut__37)).hashCode())));
            IConstr o_testSimpleCasePermut__38 = this.solver.addClause(c7, 0);
            int[] array_1658132961 = new int[]{3,9};
            	int[] array_118887561 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testSimpleCasePermut__38).getLits();
            	for(int ii = 0; ii <array_1658132961.length; ii++) {
            		org.junit.Assert.assertEquals(array_1658132961[ii], array_118887561[ii]);
            	};
            Assert.assertFalse(((OriginalBinaryClause) (o_testSimpleCasePermut__38)).isSatisfied());
            Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testSimpleCasePermut__38)).getActivity())), 0.1);
            Assert.assertEquals("-1[?] -4[?]", ((OriginalBinaryClause) (o_testSimpleCasePermut__38)).toString());
            Assert.assertEquals(6, ((int) (((OriginalBinaryClause) (o_testSimpleCasePermut__38)).hashCode())));
            List<IVecInt> muses = this.allMUSes.computeAllMUSes();
            List<IVecInt> msses = this.allMUSes.getMssList();
            System.out.println("MSS should be {b & c , b & d} and {a & c} i.e. {1,2} and {3}");
            System.out.println(("MSS = " + msses));
            System.out.println("MUS should be {a & c, b & c} and {a & c, b & d} i.e. {3,1} and {3,2}");
            System.out.println(("MUS = " + muses));
            int o_testSimpleCasePermut__47 = msses.size();
            Assert.assertEquals(2, ((int) (o_testSimpleCasePermut__47)));
            int[] array_944630394 = new int[]{2,10};
            	int[] array_218714234 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testSimpleCasePermut__32).getLits();
            	for(int ii = 0; ii <array_944630394.length; ii++) {
            		org.junit.Assert.assertEquals(array_944630394[ii], array_218714234[ii]);
            	};
            Assert.assertFalse(((OriginalBinaryClause) (o_testSimpleCasePermut__32)).isSatisfied());
            Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testSimpleCasePermut__32)).getActivity())), 0.1);
            Assert.assertEquals("1[?] 5[?]", ((OriginalBinaryClause) (o_testSimpleCasePermut__32)).toString());
            Assert.assertEquals(6, ((int) (((OriginalBinaryClause) (o_testSimpleCasePermut__32)).hashCode())));
            int[] array_1520847815 = new int[]{4,10};
            	int[] array_2069838431 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testSimpleCasePermut__33).getLits();
            	for(int ii = 0; ii <array_1520847815.length; ii++) {
            		org.junit.Assert.assertEquals(array_1520847815[ii], array_2069838431[ii]);
            	};
            Assert.assertFalse(((OriginalBinaryClause) (o_testSimpleCasePermut__33)).isSatisfied());
            Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testSimpleCasePermut__33)).getActivity())), 0.1);
            Assert.assertEquals("2[?] 5[?]", ((OriginalBinaryClause) (o_testSimpleCasePermut__33)).toString());
            Assert.assertEquals(7, ((int) (((OriginalBinaryClause) (o_testSimpleCasePermut__33)).hashCode())));
            int[] array_444312794 = new int[]{2,12};
            	int[] array_1448749422 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testSimpleCasePermut__34).getLits();
            	for(int ii = 0; ii <array_444312794.length; ii++) {
            		org.junit.Assert.assertEquals(array_444312794[ii], array_1448749422[ii]);
            	};
            Assert.assertFalse(((OriginalBinaryClause) (o_testSimpleCasePermut__34)).isSatisfied());
            Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testSimpleCasePermut__34)).getActivity())), 0.1);
            Assert.assertEquals("1[?] 6[?]", ((OriginalBinaryClause) (o_testSimpleCasePermut__34)).toString());
            Assert.assertEquals(7, ((int) (((OriginalBinaryClause) (o_testSimpleCasePermut__34)).hashCode())));
            int[] array_362830603 = new int[]{6,12};
            	int[] array_1130414306 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testSimpleCasePermut__35).getLits();
            	for(int ii = 0; ii <array_362830603.length; ii++) {
            		org.junit.Assert.assertEquals(array_362830603[ii], array_1130414306[ii]);
            	};
            Assert.assertFalse(((OriginalBinaryClause) (o_testSimpleCasePermut__35)).isSatisfied());
            Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testSimpleCasePermut__35)).getActivity())), 0.1);
            Assert.assertEquals("3[?] 6[?]", ((OriginalBinaryClause) (o_testSimpleCasePermut__35)).toString());
            Assert.assertEquals(9, ((int) (((OriginalBinaryClause) (o_testSimpleCasePermut__35)).hashCode())));
            int[] array_1757647601 = new int[]{8,14};
            	int[] array_613481288 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testSimpleCasePermut__36).getLits();
            	for(int ii = 0; ii <array_1757647601.length; ii++) {
            		org.junit.Assert.assertEquals(array_1757647601[ii], array_613481288[ii]);
            	};
            Assert.assertFalse(((OriginalBinaryClause) (o_testSimpleCasePermut__36)).isSatisfied());
            Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testSimpleCasePermut__36)).getActivity())), 0.1);
            Assert.assertEquals("4[?] 7[F]", ((OriginalBinaryClause) (o_testSimpleCasePermut__36)).toString());
            Assert.assertEquals(11, ((int) (((OriginalBinaryClause) (o_testSimpleCasePermut__36)).hashCode())));
            int[] array_220926561 = new int[]{4,14};
            	int[] array_513100619 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testSimpleCasePermut__37).getLits();
            	for(int ii = 0; ii <array_220926561.length; ii++) {
            		org.junit.Assert.assertEquals(array_220926561[ii], array_513100619[ii]);
            	};
            Assert.assertFalse(((OriginalBinaryClause) (o_testSimpleCasePermut__37)).isSatisfied());
            Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testSimpleCasePermut__37)).getActivity())), 0.1);
            Assert.assertEquals("2[?] 7[F]", ((OriginalBinaryClause) (o_testSimpleCasePermut__37)).toString());
            Assert.assertEquals(9, ((int) (((OriginalBinaryClause) (o_testSimpleCasePermut__37)).hashCode())));
            int[] array_203350472 = new int[]{3,9};
            	int[] array_934378535 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testSimpleCasePermut__38).getLits();
            	for(int ii = 0; ii <array_203350472.length; ii++) {
            		org.junit.Assert.assertEquals(array_203350472[ii], array_934378535[ii]);
            	};
            Assert.assertFalse(((OriginalBinaryClause) (o_testSimpleCasePermut__38)).isSatisfied());
            Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testSimpleCasePermut__38)).getActivity())), 0.1);
            Assert.assertEquals("-1[?] -4[?]", ((OriginalBinaryClause) (o_testSimpleCasePermut__38)).toString());
            Assert.assertEquals(6, ((int) (((OriginalBinaryClause) (o_testSimpleCasePermut__38)).hashCode())));
        }
        Assert.assertEquals("1,5", ((VecInt) (o_testSimpleCasePermut__15)).toString());
        Assert.assertEquals(3, ((int) (((VecInt) (o_testSimpleCasePermut__15)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testSimpleCasePermut__15)).isEmpty());
        Assert.assertEquals("2,5", ((VecInt) (o_testSimpleCasePermut__18)).toString());
        Assert.assertEquals(3, ((int) (((VecInt) (o_testSimpleCasePermut__18)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testSimpleCasePermut__18)).isEmpty());
        Assert.assertEquals("1,6", ((VecInt) (o_testSimpleCasePermut__19)).toString());
        Assert.assertEquals(3, ((int) (((VecInt) (o_testSimpleCasePermut__19)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testSimpleCasePermut__19)).isEmpty());
        Assert.assertEquals("3,6", ((VecInt) (o_testSimpleCasePermut__21)).toString());
        Assert.assertEquals(4, ((int) (((VecInt) (o_testSimpleCasePermut__21)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testSimpleCasePermut__21)).isEmpty());
        Assert.assertEquals("4,7", ((VecInt) (o_testSimpleCasePermut__22)).toString());
        Assert.assertEquals(5, ((int) (((VecInt) (o_testSimpleCasePermut__22)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testSimpleCasePermut__22)).isEmpty());
        Assert.assertEquals("2,7", ((VecInt) (o_testSimpleCasePermut__24)).toString());
        Assert.assertEquals(4, ((int) (((VecInt) (o_testSimpleCasePermut__24)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testSimpleCasePermut__24)).isEmpty());
        Assert.assertEquals("-4,-1", ((VecInt) (o_testSimpleCasePermut__25)).toString());
        Assert.assertEquals(-2, ((int) (((VecInt) (o_testSimpleCasePermut__25)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testSimpleCasePermut__25)).isEmpty());
        Assert.assertEquals(4, ((int) (o_testSimpleCasePermut__30)));
    }
}

