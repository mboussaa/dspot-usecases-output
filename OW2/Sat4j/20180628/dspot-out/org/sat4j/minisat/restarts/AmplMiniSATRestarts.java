package org.sat4j.minisat.restarts;


import org.junit.Assert;
import org.junit.Test;
import org.sat4j.core.VecInt;
import org.sat4j.minisat.constraints.cnf.OriginalBinaryClause;
import org.sat4j.minisat.core.RestartStrategy;
import org.sat4j.minisat.core.SearchParams;
import org.sat4j.minisat.core.SolverStats;
import org.sat4j.minisat.core.TestSizeComparatorAmpl;
import org.sat4j.specs.Constr;
import org.sat4j.specs.IVec;
import org.sat4j.specs.IVecInt;


public final class AmplMiniSATRestarts implements RestartStrategy {
    private static final long serialVersionUID = 1L;

    private double nofConflicts;

    private SearchParams params;

    private int conflictcount;

    public void init(SearchParams theParams, SolverStats stats) {
        this.params = theParams;
        this.nofConflicts = theParams.getInitConflictBound();
        this.conflictcount = 0;
    }

    public long nextRestartNumberOfConflict() {
        return Math.round(this.nofConflicts);
    }

    public void onRestart() {
        this.nofConflicts *= this.params.getConflictBoundIncFactor();
    }

    @Override
    public String toString() {
        return "MiniSAT restarts strategy";
    }

    public void onBackjumpToRootLevel() {
        this.conflictcount = 0;
    }

    public void reset() {
        this.conflictcount = 0;
    }

    public void newConflict() {
        (this.conflictcount)++;
    }

    public void newLearnedClause(Constr learned, int trailLevel) {
    }

    @Test(timeout = 10000)
    public void testSizeComparatorWithTie() throws Exception {
        IVec<Constr> o_testSizeComparatorWithTie__1 = this.constrs.push(this.c4).push(this.c3).push(this.c2).push(this.c1);
        Assert.assertEquals("1[?] 3[?] 4[?] 5[?] 9[?] 12[?] 15[?] ,-1[?] -2[?] -3[?] -5[?] -8[?] ,1[?] 3[?] 4[?] 5[?] ,1[?] 2[?]", ((org.sat4j.core.Vec)o_testSizeComparatorWithTie__1).toString());
        Assert.assertEquals(6, ((int) (((org.sat4j.core.Vec)o_testSizeComparatorWithTie__1).hashCode())));
        Assert.assertFalse(((org.sat4j.core.Vec)o_testSizeComparatorWithTie__1).isEmpty());
        this.constrs.sort(TestSizeComparatorAmpl.comparator);
        Constr o_testSizeComparatorWithTie__6 = this.constrs.get(0);
        Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testSizeComparatorWithTie__6).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testSizeComparatorWithTie__6).getActivity())), 0.1);
        int[] array_77614905 = new int[]{2, 4};
        	int[] array_1211344611 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testSizeComparatorWithTie__6).getLits();
        	for(int ii = 0; ii <array_77614905.length; ii++) {
        		org.junit.Assert.assertEquals(array_77614905[ii], array_1211344611[ii]);
        	};
        Assert.assertEquals("1[?] 2[?]", ((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testSizeComparatorWithTie__6).toString());
        Assert.assertEquals(3, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testSizeComparatorWithTie__6).hashCode())));
        Constr o_testSizeComparatorWithTie__7 = this.constrs.get(1);
        Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testSizeComparatorWithTie__7).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testSizeComparatorWithTie__7).getActivity())), 0.1);
        int[] array_419846341 = new int[]{2, 6, 8, 10};
        	int[] array_2077728141 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testSizeComparatorWithTie__7).getLits();
        	for(int ii = 0; ii <array_419846341.length; ii++) {
        		org.junit.Assert.assertEquals(array_419846341[ii], array_2077728141[ii]);
        	};
        Assert.assertEquals("1[?] 3[?] 4[?] 5[?] ", ((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testSizeComparatorWithTie__7).toString());
        Assert.assertEquals(6, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testSizeComparatorWithTie__7).hashCode())));
        Constr o_testSizeComparatorWithTie__8 = this.constrs.get(2);
        Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testSizeComparatorWithTie__8).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testSizeComparatorWithTie__8).getActivity())), 0.1);
        int[] array_99173693 = new int[]{3, 5, 7, 11, 17};
        	int[] array_119824515 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testSizeComparatorWithTie__8).getLits();
        	for(int ii = 0; ii <array_99173693.length; ii++) {
        		org.junit.Assert.assertEquals(array_99173693[ii], array_119824515[ii]);
        	};
        Assert.assertEquals("-1[?] -2[?] -3[?] -5[?] -8[?] ", ((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testSizeComparatorWithTie__8).toString());
        Assert.assertEquals(8, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testSizeComparatorWithTie__8).hashCode())));
        Constr o_testSizeComparatorWithTie__9 = this.constrs.get(3);
        Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testSizeComparatorWithTie__9).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testSizeComparatorWithTie__9).getActivity())), 0.1);
        int[] array_1523459939 = new int[]{2, 6, 8, 10, 18, 24, 30};
        	int[] array_1539297395 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testSizeComparatorWithTie__9).getLits();
        	for(int ii = 0; ii <array_1523459939.length; ii++) {
        		org.junit.Assert.assertEquals(array_1523459939[ii], array_1539297395[ii]);
        	};
        Assert.assertEquals("1[?] 3[?] 4[?] 5[?] 9[?] 12[?] 15[?] ", ((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testSizeComparatorWithTie__9).toString());
        Assert.assertEquals(14, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testSizeComparatorWithTie__9).hashCode())));
        Assert.assertEquals("1[?] 2[?],1[?] 3[?] 4[?] 5[?] ,-1[?] -2[?] -3[?] -5[?] -8[?] ,1[?] 3[?] 4[?] 5[?] 9[?] 12[?] 15[?] ", ((org.sat4j.core.Vec)o_testSizeComparatorWithTie__1).toString());
        Assert.assertEquals(6, ((int) (((org.sat4j.core.Vec)o_testSizeComparatorWithTie__1).hashCode())));
        Assert.assertFalse(((org.sat4j.core.Vec)o_testSizeComparatorWithTie__1).isEmpty());
        Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testSizeComparatorWithTie__6).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testSizeComparatorWithTie__6).getActivity())), 0.1);
        int[] array_455044136 = new int[]{2, 4};
        	int[] array_193893194 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testSizeComparatorWithTie__6).getLits();
        	for(int ii = 0; ii <array_455044136.length; ii++) {
        		org.junit.Assert.assertEquals(array_455044136[ii], array_193893194[ii]);
        	};
        Assert.assertEquals("1[?] 2[?]", ((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testSizeComparatorWithTie__6).toString());
        Assert.assertEquals(3, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testSizeComparatorWithTie__6).hashCode())));
        Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testSizeComparatorWithTie__7).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testSizeComparatorWithTie__7).getActivity())), 0.1);
        int[] array_353699734 = new int[]{2, 6, 8, 10};
        	int[] array_1690891046 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testSizeComparatorWithTie__7).getLits();
        	for(int ii = 0; ii <array_353699734.length; ii++) {
        		org.junit.Assert.assertEquals(array_353699734[ii], array_1690891046[ii]);
        	};
        Assert.assertEquals("1[?] 3[?] 4[?] 5[?] ", ((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testSizeComparatorWithTie__7).toString());
        Assert.assertEquals(6, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testSizeComparatorWithTie__7).hashCode())));
        Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testSizeComparatorWithTie__8).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testSizeComparatorWithTie__8).getActivity())), 0.1);
        int[] array_780889173 = new int[]{3, 5, 7, 11, 17};
        	int[] array_617195729 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testSizeComparatorWithTie__8).getLits();
        	for(int ii = 0; ii <array_780889173.length; ii++) {
        		org.junit.Assert.assertEquals(array_780889173[ii], array_617195729[ii]);
        	};
        Assert.assertEquals("-1[?] -2[?] -3[?] -5[?] -8[?] ", ((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testSizeComparatorWithTie__8).toString());
        Assert.assertEquals(8, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testSizeComparatorWithTie__8).hashCode())));
    }

    @Test(timeout = 10000)
    public void testSizeComparator() throws Exception {
        IVec<Constr> o_testSizeComparator__1 = this.constrs.push(this.c4).push(this.c3).push(this.c2).push(this.c1);
        Assert.assertEquals("1[?] 3[?] 4[?] 5[?] 9[?] 12[?] 15[?] ,-1[?] -2[?] -3[?] -5[?] -8[?] ,1[?] 3[?] 4[?] 5[?] ,1[?] 2[?]", ((org.sat4j.core.Vec)o_testSizeComparator__1).toString());
        Assert.assertEquals(6, ((int) (((org.sat4j.core.Vec)o_testSizeComparator__1).hashCode())));
        Assert.assertFalse(((org.sat4j.core.Vec)o_testSizeComparator__1).isEmpty());
        this.c1.setActivity(5.0);
        IVecInt clause = new VecInt();
        clause = new VecInt();
        IVecInt o_testSizeComparator__10 = clause.push(2).push(4);
        Assert.assertEquals("2,4", ((org.sat4j.core.VecInt)o_testSizeComparator__10).toString());
        Assert.assertEquals(3, ((int) (((org.sat4j.core.VecInt)o_testSizeComparator__10).hashCode())));
        Assert.assertFalse(((org.sat4j.core.VecInt)o_testSizeComparator__10).isEmpty());
        Constr c5 = new OriginalBinaryClause(clause, this.voc);
        c5.setActivity(10.0);
        clause.clear();
        clause = new VecInt();
        IVecInt o_testSizeComparator__18 = clause.push(2).push(4);
        Assert.assertEquals("2,4", ((org.sat4j.core.VecInt)o_testSizeComparator__18).toString());
        Assert.assertEquals(3, ((int) (((org.sat4j.core.VecInt)o_testSizeComparator__18).hashCode())));
        Assert.assertFalse(((org.sat4j.core.VecInt)o_testSizeComparator__18).isEmpty());
        Constr c6 = new OriginalBinaryClause(clause, this.voc);
        c5.setActivity(20.0);
        clause.clear();
        clause = new VecInt();
        IVecInt o_testSizeComparator__26 = clause.push(2).push(4);
        Assert.assertEquals("2,4", ((org.sat4j.core.VecInt)o_testSizeComparator__26).toString());
        Assert.assertEquals(3, ((int) (((org.sat4j.core.VecInt)o_testSizeComparator__26).hashCode())));
        Assert.assertFalse(((org.sat4j.core.VecInt)o_testSizeComparator__26).isEmpty());
        Constr c7 = new OriginalBinaryClause(clause, this.voc);
        c5.setActivity(30.0);
        clause.clear();
        clause = new VecInt();
        IVecInt o_testSizeComparator__34 = clause.push(2).push(4);
        Assert.assertEquals("2,4", ((org.sat4j.core.VecInt)o_testSizeComparator__34).toString());
        Assert.assertEquals(3, ((int) (((org.sat4j.core.VecInt)o_testSizeComparator__34).hashCode())));
        Assert.assertFalse(((org.sat4j.core.VecInt)o_testSizeComparator__34).isEmpty());
        Constr c8 = new OriginalBinaryClause(clause, this.voc);
        c5.setActivity(40.0);
        clause.clear();
        IVec<Constr> o_testSizeComparator__40 = this.constrs.push(c5).push(c6).push(c7).push(c8);
        Assert.assertEquals("1[?] 3[?] 4[?] 5[?] 9[?] 12[?] 15[?] ,-1[?] -2[?] -3[?] -5[?] -8[?] ,1[?] 3[?] 4[?] 5[?] ,1[?] 2[?],1[?] 2[?],1[?] 2[?],1[?] 2[?],1[?] 2[?]", ((org.sat4j.core.Vec)o_testSizeComparator__40).toString());
        Assert.assertEquals(2, ((int) (((org.sat4j.core.Vec)o_testSizeComparator__40).hashCode())));
        Assert.assertFalse(((org.sat4j.core.Vec)o_testSizeComparator__40).isEmpty());
        this.constrs.sort(TestSizeComparatorAmpl.comparator);
        Constr o_testSizeComparator__45 = this.constrs.get(0);
        Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testSizeComparator__45).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testSizeComparator__45).getActivity())), 0.1);
        int[] array_466383236 = new int[]{2, 4};
        	int[] array_1814801145 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testSizeComparator__45).getLits();
        	for(int ii = 0; ii <array_466383236.length; ii++) {
        		org.junit.Assert.assertEquals(array_466383236[ii], array_1814801145[ii]);
        	};
        Assert.assertEquals("1[?] 2[?]", ((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testSizeComparator__45).toString());
        Assert.assertEquals(3, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testSizeComparator__45).hashCode())));
        Constr o_testSizeComparator__46 = this.constrs.get(1);
        Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testSizeComparator__46).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testSizeComparator__46).getActivity())), 0.1);
        int[] array_572682986 = new int[]{2, 4};
        	int[] array_2146536536 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testSizeComparator__46).getLits();
        	for(int ii = 0; ii <array_572682986.length; ii++) {
        		org.junit.Assert.assertEquals(array_572682986[ii], array_2146536536[ii]);
        	};
        Assert.assertEquals("1[?] 2[?]", ((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testSizeComparator__46).toString());
        Assert.assertEquals(3, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testSizeComparator__46).hashCode())));
        Constr o_testSizeComparator__47 = this.constrs.get(2);
        Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testSizeComparator__47).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testSizeComparator__47).getActivity())), 0.1);
        int[] array_683775193 = new int[]{2, 4};
        	int[] array_1693298471 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testSizeComparator__47).getLits();
        	for(int ii = 0; ii <array_683775193.length; ii++) {
        		org.junit.Assert.assertEquals(array_683775193[ii], array_1693298471[ii]);
        	};
        Assert.assertEquals("1[?] 2[?]", ((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testSizeComparator__47).toString());
        Assert.assertEquals(3, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testSizeComparator__47).hashCode())));
        Constr o_testSizeComparator__48 = this.constrs.get(3);
        Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testSizeComparator__48).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testSizeComparator__48).getActivity())), 0.1);
        int[] array_229961417 = new int[]{2, 4};
        	int[] array_411048556 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testSizeComparator__48).getLits();
        	for(int ii = 0; ii <array_229961417.length; ii++) {
        		org.junit.Assert.assertEquals(array_229961417[ii], array_411048556[ii]);
        	};
        Assert.assertEquals("1[?] 2[?]", ((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testSizeComparator__48).toString());
        Assert.assertEquals(3, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testSizeComparator__48).hashCode())));
        Constr o_testSizeComparator__49 = this.constrs.get(4);
        Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testSizeComparator__49).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testSizeComparator__49).getActivity())), 0.1);
        int[] array_2045443968 = new int[]{2, 4};
        	int[] array_1684880193 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testSizeComparator__49).getLits();
        	for(int ii = 0; ii <array_2045443968.length; ii++) {
        		org.junit.Assert.assertEquals(array_2045443968[ii], array_1684880193[ii]);
        	};
        Assert.assertEquals("1[?] 2[?]", ((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testSizeComparator__49).toString());
        Assert.assertEquals(3, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testSizeComparator__49).hashCode())));
        Constr o_testSizeComparator__50 = this.constrs.get(5);
        Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testSizeComparator__50).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testSizeComparator__50).getActivity())), 0.1);
        int[] array_1001709341 = new int[]{2, 6, 8, 10};
        	int[] array_980101166 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testSizeComparator__50).getLits();
        	for(int ii = 0; ii <array_1001709341.length; ii++) {
        		org.junit.Assert.assertEquals(array_1001709341[ii], array_980101166[ii]);
        	};
        Assert.assertEquals("1[?] 3[?] 4[?] 5[?] ", ((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testSizeComparator__50).toString());
        Assert.assertEquals(6, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testSizeComparator__50).hashCode())));
        Constr o_testSizeComparator__51 = this.constrs.get(6);
        Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testSizeComparator__51).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testSizeComparator__51).getActivity())), 0.1);
        int[] array_1548094317 = new int[]{3, 5, 7, 11, 17};
        	int[] array_1532223203 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testSizeComparator__51).getLits();
        	for(int ii = 0; ii <array_1548094317.length; ii++) {
        		org.junit.Assert.assertEquals(array_1548094317[ii], array_1532223203[ii]);
        	};
        Assert.assertEquals("-1[?] -2[?] -3[?] -5[?] -8[?] ", ((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testSizeComparator__51).toString());
        Assert.assertEquals(8, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testSizeComparator__51).hashCode())));
        Constr o_testSizeComparator__52 = this.constrs.get(7);
        Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testSizeComparator__52).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testSizeComparator__52).getActivity())), 0.1);
        int[] array_149630311 = new int[]{2, 6, 8, 10, 18, 24, 30};
        	int[] array_1680090992 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testSizeComparator__52).getLits();
        	for(int ii = 0; ii <array_149630311.length; ii++) {
        		org.junit.Assert.assertEquals(array_149630311[ii], array_1680090992[ii]);
        	};
        Assert.assertEquals("1[?] 3[?] 4[?] 5[?] 9[?] 12[?] 15[?] ", ((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testSizeComparator__52).toString());
        Assert.assertEquals(14, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testSizeComparator__52).hashCode())));
        Assert.assertEquals("1[?] 2[?],1[?] 2[?],1[?] 2[?],1[?] 2[?],1[?] 2[?],1[?] 3[?] 4[?] 5[?] ,-1[?] -2[?] -3[?] -5[?] -8[?] ,1[?] 3[?] 4[?] 5[?] 9[?] 12[?] 15[?] ", ((org.sat4j.core.Vec)o_testSizeComparator__1).toString());
        Assert.assertEquals(2, ((int) (((org.sat4j.core.Vec)o_testSizeComparator__1).hashCode())));
        Assert.assertFalse(((org.sat4j.core.Vec)o_testSizeComparator__1).isEmpty());
        Assert.assertEquals("", ((org.sat4j.core.VecInt)o_testSizeComparator__10).toString());
        Assert.assertTrue(((org.sat4j.core.VecInt)o_testSizeComparator__10).isEmpty());
        Assert.assertEquals("", ((org.sat4j.core.VecInt)o_testSizeComparator__18).toString());
        Assert.assertTrue(((org.sat4j.core.VecInt)o_testSizeComparator__18).isEmpty());
        Assert.assertEquals("", ((org.sat4j.core.VecInt)o_testSizeComparator__26).toString());
        Assert.assertTrue(((org.sat4j.core.VecInt)o_testSizeComparator__26).isEmpty());
        Assert.assertEquals("", ((org.sat4j.core.VecInt)o_testSizeComparator__34).toString());
        Assert.assertTrue(((org.sat4j.core.VecInt)o_testSizeComparator__34).isEmpty());
        Assert.assertEquals("1[?] 2[?],1[?] 2[?],1[?] 2[?],1[?] 2[?],1[?] 2[?],1[?] 3[?] 4[?] 5[?] ,-1[?] -2[?] -3[?] -5[?] -8[?] ,1[?] 3[?] 4[?] 5[?] 9[?] 12[?] 15[?] ", ((org.sat4j.core.Vec)o_testSizeComparator__40).toString());
        Assert.assertEquals(2, ((int) (((org.sat4j.core.Vec)o_testSizeComparator__40).hashCode())));
        Assert.assertFalse(((org.sat4j.core.Vec)o_testSizeComparator__40).isEmpty());
        Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testSizeComparator__45).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testSizeComparator__45).getActivity())), 0.1);
        int[] array_264178467 = new int[]{2, 4};
        	int[] array_756832910 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testSizeComparator__45).getLits();
        	for(int ii = 0; ii <array_264178467.length; ii++) {
        		org.junit.Assert.assertEquals(array_264178467[ii], array_756832910[ii]);
        	};
        Assert.assertEquals("1[?] 2[?]", ((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testSizeComparator__45).toString());
        Assert.assertEquals(3, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testSizeComparator__45).hashCode())));
        Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testSizeComparator__46).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testSizeComparator__46).getActivity())), 0.1);
        int[] array_467541199 = new int[]{2, 4};
        	int[] array_409435878 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testSizeComparator__46).getLits();
        	for(int ii = 0; ii <array_467541199.length; ii++) {
        		org.junit.Assert.assertEquals(array_467541199[ii], array_409435878[ii]);
        	};
        Assert.assertEquals("1[?] 2[?]", ((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testSizeComparator__46).toString());
        Assert.assertEquals(3, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testSizeComparator__46).hashCode())));
        Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testSizeComparator__47).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testSizeComparator__47).getActivity())), 0.1);
        int[] array_631894873 = new int[]{2, 4};
        	int[] array_1591925718 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testSizeComparator__47).getLits();
        	for(int ii = 0; ii <array_631894873.length; ii++) {
        		org.junit.Assert.assertEquals(array_631894873[ii], array_1591925718[ii]);
        	};
        Assert.assertEquals("1[?] 2[?]", ((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testSizeComparator__47).toString());
        Assert.assertEquals(3, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testSizeComparator__47).hashCode())));
        Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testSizeComparator__48).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testSizeComparator__48).getActivity())), 0.1);
        int[] array_1374519889 = new int[]{2, 4};
        	int[] array_1544496552 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testSizeComparator__48).getLits();
        	for(int ii = 0; ii <array_1374519889.length; ii++) {
        		org.junit.Assert.assertEquals(array_1374519889[ii], array_1544496552[ii]);
        	};
        Assert.assertEquals("1[?] 2[?]", ((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testSizeComparator__48).toString());
        Assert.assertEquals(3, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testSizeComparator__48).hashCode())));
        Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testSizeComparator__49).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testSizeComparator__49).getActivity())), 0.1);
        int[] array_1218120343 = new int[]{2, 4};
        	int[] array_1638122640 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testSizeComparator__49).getLits();
        	for(int ii = 0; ii <array_1218120343.length; ii++) {
        		org.junit.Assert.assertEquals(array_1218120343[ii], array_1638122640[ii]);
        	};
        Assert.assertEquals("1[?] 2[?]", ((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testSizeComparator__49).toString());
        Assert.assertEquals(3, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testSizeComparator__49).hashCode())));
        Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testSizeComparator__50).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testSizeComparator__50).getActivity())), 0.1);
        int[] array_755613613 = new int[]{2, 6, 8, 10};
        	int[] array_1873133004 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testSizeComparator__50).getLits();
        	for(int ii = 0; ii <array_755613613.length; ii++) {
        		org.junit.Assert.assertEquals(array_755613613[ii], array_1873133004[ii]);
        	};
        Assert.assertEquals("1[?] 3[?] 4[?] 5[?] ", ((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testSizeComparator__50).toString());
        Assert.assertEquals(6, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testSizeComparator__50).hashCode())));
        Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testSizeComparator__51).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testSizeComparator__51).getActivity())), 0.1);
        int[] array_409865418 = new int[]{3, 5, 7, 11, 17};
        	int[] array_743356295 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testSizeComparator__51).getLits();
        	for(int ii = 0; ii <array_409865418.length; ii++) {
        		org.junit.Assert.assertEquals(array_409865418[ii], array_743356295[ii]);
        	};
        Assert.assertEquals("-1[?] -2[?] -3[?] -5[?] -8[?] ", ((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testSizeComparator__51).toString());
        Assert.assertEquals(8, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testSizeComparator__51).hashCode())));
    }
}

