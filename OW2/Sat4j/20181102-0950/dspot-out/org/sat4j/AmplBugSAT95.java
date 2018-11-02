package org.sat4j;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.sat4j.core.VecInt;
import org.sat4j.minisat.SolverFactory;
import org.sat4j.opt.MinOneDecorator;
import org.sat4j.specs.ContradictionException;
import org.sat4j.specs.ISolver;
import org.sat4j.specs.IVecInt;
import org.sat4j.specs.TimeoutException;
import org.sat4j.tools.FullClauseSelectorSolver;
import org.sat4j.tools.OptToSatAdapter;


public class AmplBugSAT95 {
    private ISolver solver;

    private MinOneDecorator minOne;

    private OptToSatAdapter adapter;

    @Before
    public void setUp() throws ContradictionException {
        solver = SolverFactory.newDefault();
        minOne = new MinOneDecorator(solver);
        adapter = new OptToSatAdapter(minOne);
        IVecInt clause = new VecInt();
        clause.push(1).push(2);
        minOne.addClause(clause);
        clause.clear();
        clause = new VecInt();
        clause.push(1).push((-3));
        minOne.addClause(clause);
        clause.clear();
        clause = new VecInt();
        clause.push(1).push(3).push(4);
        minOne.addClause(clause);
        clause.clear();
    }

    @Test(timeout = 30000)
    public void testOptimalSolutionWithMinOneIsSatisfiablePlusModel_add1482() throws Exception, ContradictionException, TimeoutException {
        adapter.isSatisfiable();
        int[] o_testOptimalSolutionWithMinOneIsSatisfiablePlusModel_add1482__2 = adapter.model();
        int[] array_1691152357 = new int[]{1,-2,-3,-4};
        	int[] array_1386510587 = (int[])o_testOptimalSolutionWithMinOneIsSatisfiablePlusModel_add1482__2;
        	for(int ii = 0; ii <array_1691152357.length; ii++) {
        		org.junit.Assert.assertEquals(array_1691152357[ii], array_1386510587[ii]);
        	};
        int[] model = adapter.model();
        int int_692 = model[0];
        int int_693 = model[1];
        int int_694 = model[2];
        int int_695 = model[3];
        int[] array_489017200 = new int[]{1,-2,-3,-4};
        	int[] array_1933766792 = (int[])o_testOptimalSolutionWithMinOneIsSatisfiablePlusModel_add1482__2;
        	for(int ii = 0; ii <array_489017200.length; ii++) {
        		org.junit.Assert.assertEquals(array_489017200[ii], array_1933766792[ii]);
        	};
    }

    @Test(timeout = 30000)
    public void testOptimalSolutionWithMinOneIsSatisfiablePlusModellitNum1454_failAssert373() throws Exception, ContradictionException, TimeoutException {
        try {
            adapter.isSatisfiable();
            int[] model = adapter.model();
            int int_580 = model[0];
            int int_581 = model[Integer.MAX_VALUE];
            int int_582 = model[2];
            int int_583 = model[3];
            org.junit.Assert.fail("testOptimalSolutionWithMinOneIsSatisfiablePlusModellitNum1454 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("2147483647", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testOptimalSolutionWithMinOneIsSatisfiablePlusModel_add1482_add1639() throws Exception, ContradictionException, TimeoutException {
        adapter.isSatisfiable();
        int[] o_testOptimalSolutionWithMinOneIsSatisfiablePlusModel_add1482_add1639__2 = adapter.model();
        int[] array_1435309734 = new int[]{1,-2,-3,-4};
        	int[] array_172853821 = (int[])o_testOptimalSolutionWithMinOneIsSatisfiablePlusModel_add1482_add1639__2;
        	for(int ii = 0; ii <array_1435309734.length; ii++) {
        		org.junit.Assert.assertEquals(array_1435309734[ii], array_172853821[ii]);
        	};
        int[] o_testOptimalSolutionWithMinOneIsSatisfiablePlusModel_add1482__2 = adapter.model();
        int[] array_1691152357 = new int[]{1,-2,-3,-4};
        	int[] array_1386510587 = (int[])o_testOptimalSolutionWithMinOneIsSatisfiablePlusModel_add1482__2;
        	for(int ii = 0; ii <array_1691152357.length; ii++) {
        		org.junit.Assert.assertEquals(array_1691152357[ii], array_1386510587[ii]);
        	};
        int[] model = adapter.model();
        int int_692 = model[0];
        int int_693 = model[1];
        int int_694 = model[2];
        int int_695 = model[3];
        int[] array_489017200 = new int[]{1,-2,-3,-4};
        	int[] array_1933766792 = (int[])o_testOptimalSolutionWithMinOneIsSatisfiablePlusModel_add1482__2;
        	for(int ii = 0; ii <array_489017200.length; ii++) {
        		org.junit.Assert.assertEquals(array_489017200[ii], array_1933766792[ii]);
        	};
        int[] array_737683999 = new int[]{1,-2,-3,-4};
        	int[] array_1956755684 = (int[])o_testOptimalSolutionWithMinOneIsSatisfiablePlusModel_add1482_add1639__2;
        	for(int ii = 0; ii <array_737683999.length; ii++) {
        		org.junit.Assert.assertEquals(array_737683999[ii], array_1956755684[ii]);
        	};
    }

    @Test(timeout = 30000)
    public void testOptimalSolutionWithMinOneIsSatisfiablePlusModel_add1482litNum1602_failAssert385() throws Exception, ContradictionException, TimeoutException {
        try {
            adapter.isSatisfiable();
            int[] o_testOptimalSolutionWithMinOneIsSatisfiablePlusModel_add1482__2 = adapter.model();
            int[] array_1691152357 = new int[]{1,-2,-3,-4};
            	int[] array_1386510587 = (int[])o_testOptimalSolutionWithMinOneIsSatisfiablePlusModel_add1482__2;
            	for(int ii = 0; ii <array_1691152357.length; ii++) {
            		org.junit.Assert.assertEquals(array_1691152357[ii], array_1386510587[ii]);
            	};
            int[] model = adapter.model();
            int int_692 = model[Integer.MIN_VALUE];
            int int_693 = model[1];
            int int_694 = model[2];
            int int_695 = model[3];
            int[] array_489017200 = new int[]{1,-2,-3,-4};
            	int[] array_1933766792 = (int[])o_testOptimalSolutionWithMinOneIsSatisfiablePlusModel_add1482__2;
            	for(int ii = 0; ii <array_489017200.length; ii++) {
            		org.junit.Assert.assertEquals(array_489017200[ii], array_1933766792[ii]);
            	};
            org.junit.Assert.fail("testOptimalSolutionWithMinOneIsSatisfiablePlusModel_add1482litNum1602 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-2147483648", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testOptimalSolutionWithMinOneIsSatisfiablePlusModellitNum1454_failAssert373_add1642_failAssert415() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                adapter.isSatisfiable();
                adapter.isSatisfiable();
                int[] model = adapter.model();
                int int_580 = model[0];
                int int_581 = model[Integer.MAX_VALUE];
                int int_582 = model[2];
                int int_583 = model[3];
                org.junit.Assert.fail("testOptimalSolutionWithMinOneIsSatisfiablePlusModellitNum1454 should have thrown ArrayIndexOutOfBoundsException");
            }
            org.junit.Assert.fail("testOptimalSolutionWithMinOneIsSatisfiablePlusModellitNum1454_failAssert373_add1642 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("2147483647", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testOptimalSolutionWithMinOneIsSatisfiablePlusModel_add1482_add1639_add1814() throws Exception, ContradictionException, TimeoutException {
        adapter.isSatisfiable();
        int[] o_testOptimalSolutionWithMinOneIsSatisfiablePlusModel_add1482_add1639_add1814__2 = adapter.model();
        int[] array_1007060390 = new int[]{1,-2,-3,-4};
        	int[] array_1458702562 = (int[])o_testOptimalSolutionWithMinOneIsSatisfiablePlusModel_add1482_add1639_add1814__2;
        	for(int ii = 0; ii <array_1007060390.length; ii++) {
        		org.junit.Assert.assertEquals(array_1007060390[ii], array_1458702562[ii]);
        	};
        int[] o_testOptimalSolutionWithMinOneIsSatisfiablePlusModel_add1482_add1639__2 = adapter.model();
        int[] array_1435309734 = new int[]{1,-2,-3,-4};
        	int[] array_172853821 = (int[])o_testOptimalSolutionWithMinOneIsSatisfiablePlusModel_add1482_add1639__2;
        	for(int ii = 0; ii <array_1435309734.length; ii++) {
        		org.junit.Assert.assertEquals(array_1435309734[ii], array_172853821[ii]);
        	};
        int[] o_testOptimalSolutionWithMinOneIsSatisfiablePlusModel_add1482__2 = adapter.model();
        int[] array_1691152357 = new int[]{1,-2,-3,-4};
        	int[] array_1386510587 = (int[])o_testOptimalSolutionWithMinOneIsSatisfiablePlusModel_add1482__2;
        	for(int ii = 0; ii <array_1691152357.length; ii++) {
        		org.junit.Assert.assertEquals(array_1691152357[ii], array_1386510587[ii]);
        	};
        int[] model = adapter.model();
        int int_692 = model[0];
        int int_693 = model[1];
        int int_694 = model[2];
        int int_695 = model[3];
        int[] array_489017200 = new int[]{1,-2,-3,-4};
        	int[] array_1933766792 = (int[])o_testOptimalSolutionWithMinOneIsSatisfiablePlusModel_add1482__2;
        	for(int ii = 0; ii <array_489017200.length; ii++) {
        		org.junit.Assert.assertEquals(array_489017200[ii], array_1933766792[ii]);
        	};
        int[] array_737683999 = new int[]{1,-2,-3,-4};
        	int[] array_1956755684 = (int[])o_testOptimalSolutionWithMinOneIsSatisfiablePlusModel_add1482_add1639__2;
        	for(int ii = 0; ii <array_737683999.length; ii++) {
        		org.junit.Assert.assertEquals(array_737683999[ii], array_1956755684[ii]);
        	};
        int[] array_1833981872 = new int[]{1,-2,-3,-4};
        	int[] array_867401450 = (int[])o_testOptimalSolutionWithMinOneIsSatisfiablePlusModel_add1482_add1639_add1814__2;
        	for(int ii = 0; ii <array_1833981872.length; ii++) {
        		org.junit.Assert.assertEquals(array_1833981872[ii], array_867401450[ii]);
        	};
    }

    @Test(timeout = 30000)
    public void testOptimalSolutionWithMinOneIsSatisfiablePlusModel_add1482litNum1602_failAssert385litNum1765_failAssert436() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                adapter.isSatisfiable();
                int[] o_testOptimalSolutionWithMinOneIsSatisfiablePlusModel_add1482__2 = adapter.model();
                int[] array_1691152357 = new int[]{1,-2,-3,-4};
                	int[] array_1386510587 = (int[])o_testOptimalSolutionWithMinOneIsSatisfiablePlusModel_add1482__2;
                	for(int ii = 0; ii <array_1691152357.length; ii++) {
                		org.junit.Assert.assertEquals(array_1691152357[ii], array_1386510587[ii]);
                	};
                int[] model = adapter.model();
                int int_692 = model[Integer.MIN_VALUE];
                int int_693 = model[1111474497];
                int int_694 = model[2];
                int int_695 = model[3];
                int[] array_489017200 = new int[]{1,-2,-3,-4};
                	int[] array_1933766792 = (int[])o_testOptimalSolutionWithMinOneIsSatisfiablePlusModel_add1482__2;
                	for(int ii = 0; ii <array_489017200.length; ii++) {
                		org.junit.Assert.assertEquals(array_489017200[ii], array_1933766792[ii]);
                	};
                org.junit.Assert.fail("testOptimalSolutionWithMinOneIsSatisfiablePlusModel_add1482litNum1602 should have thrown ArrayIndexOutOfBoundsException");
            }
            org.junit.Assert.fail("testOptimalSolutionWithMinOneIsSatisfiablePlusModel_add1482litNum1602_failAssert385litNum1765 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-2147483648", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testOptimalSolutionWithMinOneIsSatisfiablePlusModel_add1482litNum1602_failAssert385_add1809_failAssert449() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                adapter.isSatisfiable();
                adapter.isSatisfiable();
                int[] o_testOptimalSolutionWithMinOneIsSatisfiablePlusModel_add1482__2 = adapter.model();
                int[] array_1691152357 = new int[]{1,-2,-3,-4};
                	int[] array_1386510587 = (int[])o_testOptimalSolutionWithMinOneIsSatisfiablePlusModel_add1482__2;
                	for(int ii = 0; ii <array_1691152357.length; ii++) {
                		org.junit.Assert.assertEquals(array_1691152357[ii], array_1386510587[ii]);
                	};
                int[] model = adapter.model();
                int int_692 = model[Integer.MIN_VALUE];
                int int_693 = model[1];
                int int_694 = model[2];
                int int_695 = model[3];
                int[] array_489017200 = new int[]{1,-2,-3,-4};
                	int[] array_1933766792 = (int[])o_testOptimalSolutionWithMinOneIsSatisfiablePlusModel_add1482__2;
                	for(int ii = 0; ii <array_489017200.length; ii++) {
                		org.junit.Assert.assertEquals(array_489017200[ii], array_1933766792[ii]);
                	};
                org.junit.Assert.fail("testOptimalSolutionWithMinOneIsSatisfiablePlusModel_add1482litNum1602 should have thrown ArrayIndexOutOfBoundsException");
            }
            org.junit.Assert.fail("testOptimalSolutionWithMinOneIsSatisfiablePlusModel_add1482litNum1602_failAssert385_add1809 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-2147483648", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testOptimalSolutionWithMinOneFindModellitNum928_failAssert234() throws Exception, ContradictionException, TimeoutException {
        try {
            int[] model = adapter.findModel();
            int int_360 = model[-1];
            int int_361 = model[1];
            int int_362 = model[2];
            int int_363 = model[3];
            org.junit.Assert.fail("testOptimalSolutionWithMinOneFindModellitNum928 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-1", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testOptimalSolutionWithMinOneFindModellitNum941_failAssert238() throws Exception, ContradictionException, TimeoutException {
        try {
            int[] model = adapter.findModel();
            int int_412 = model[0];
            int int_413 = model[Integer.MAX_VALUE];
            int int_414 = model[2];
            int int_415 = model[3];
            org.junit.Assert.fail("testOptimalSolutionWithMinOneFindModellitNum941 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("2147483647", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testOptimalSolutionWithMinOneFindModel_add968_failAssert248() throws Exception, ContradictionException, TimeoutException {
        try {
            adapter.findModel();
            int[] model = adapter.findModel();
            int int_520 = model[0];
            int int_521 = model[1];
            int int_522 = model[2];
            int int_523 = model[3];
            org.junit.Assert.fail("testOptimalSolutionWithMinOneFindModel_add968 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testOptimalSolutionWithMinOneFindModellitNum928_failAssert234litNum1080_failAssert249() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                int[] model = adapter.findModel();
                int int_360 = model[-1];
                int int_361 = model[2];
                int int_362 = model[2];
                int int_363 = model[3];
                org.junit.Assert.fail("testOptimalSolutionWithMinOneFindModellitNum928 should have thrown ArrayIndexOutOfBoundsException");
            }
            org.junit.Assert.fail("testOptimalSolutionWithMinOneFindModellitNum928_failAssert234litNum1080 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-1", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testOptimalSolutionWithMinOneFindModellitNum928_failAssert234_add1132_failAssert266() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                adapter.findModel();
                int[] model = adapter.findModel();
                int int_360 = model[-1];
                int int_361 = model[1];
                int int_362 = model[2];
                int int_363 = model[3];
                org.junit.Assert.fail("testOptimalSolutionWithMinOneFindModellitNum928 should have thrown ArrayIndexOutOfBoundsException");
            }
            org.junit.Assert.fail("testOptimalSolutionWithMinOneFindModellitNum928_failAssert234_add1132 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testOptimalSolutionWithMinOneFindModellitNum941_failAssert238_add1143_failAssert286() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                adapter.findModel();
                int[] model = adapter.findModel();
                int int_412 = model[0];
                int int_413 = model[Integer.MAX_VALUE];
                int int_414 = model[2];
                int int_415 = model[3];
                org.junit.Assert.fail("testOptimalSolutionWithMinOneFindModellitNum941 should have thrown ArrayIndexOutOfBoundsException");
            }
            org.junit.Assert.fail("testOptimalSolutionWithMinOneFindModellitNum941_failAssert238_add1143 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testOptimalSolutionWithMinOneFindModellitNum928_failAssert234litNum1080_failAssert249litNum1275_failAssert314() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    int[] model = adapter.findModel();
                    int int_360 = model[-1];
                    int int_361 = model[2];
                    int int_362 = model[3];
                    int int_363 = model[3];
                    org.junit.Assert.fail("testOptimalSolutionWithMinOneFindModellitNum928 should have thrown ArrayIndexOutOfBoundsException");
                }
                org.junit.Assert.fail("testOptimalSolutionWithMinOneFindModellitNum928_failAssert234litNum1080 should have thrown ArrayIndexOutOfBoundsException");
            }
            org.junit.Assert.fail("testOptimalSolutionWithMinOneFindModellitNum928_failAssert234litNum1080_failAssert249litNum1275 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-1", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testOptimalSolutionWithMinOneFindModellitNum928_failAssert234litNum1080_failAssert249_add1322_failAssert326() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    adapter.findModel();
                    int[] model = adapter.findModel();
                    int int_360 = model[-1];
                    int int_361 = model[2];
                    int int_362 = model[2];
                    int int_363 = model[3];
                    org.junit.Assert.fail("testOptimalSolutionWithMinOneFindModellitNum928 should have thrown ArrayIndexOutOfBoundsException");
                }
                org.junit.Assert.fail("testOptimalSolutionWithMinOneFindModellitNum928_failAssert234litNum1080 should have thrown ArrayIndexOutOfBoundsException");
            }
            org.junit.Assert.fail("testOptimalSolutionWithMinOneFindModellitNum928_failAssert234litNum1080_failAssert249_add1322 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testOptimalSolutionWithMinOneFindModellitNum941_failAssert238_add1143_failAssert286litNum1286_failAssert351() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    adapter.findModel();
                    int[] model = adapter.findModel();
                    int int_412 = model[Integer.MIN_VALUE];
                    int int_413 = model[Integer.MAX_VALUE];
                    int int_414 = model[2];
                    int int_415 = model[3];
                    org.junit.Assert.fail("testOptimalSolutionWithMinOneFindModellitNum941 should have thrown ArrayIndexOutOfBoundsException");
                }
                org.junit.Assert.fail("testOptimalSolutionWithMinOneFindModellitNum941_failAssert238_add1143 should have thrown NullPointerException");
            }
            org.junit.Assert.fail("testOptimalSolutionWithMinOneFindModellitNum941_failAssert238_add1143_failAssert286litNum1286 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testOptimalSolutionWithFullClauseSelectorIsSatisfiablePlusModellitNum533_failAssert141() throws Exception, ContradictionException, TimeoutException {
        try {
            FullClauseSelectorSolver<ISolver> softSolver = new FullClauseSelectorSolver<ISolver>(adapter, false);
            softSolver.isSatisfiable();
            int[] model = softSolver.model();
            int int_188 = model[-1];
            int int_189 = model[1];
            int int_190 = model[2];
            int int_191 = model[3];
            org.junit.Assert.fail("testOptimalSolutionWithFullClauseSelectorIsSatisfiablePlusModellitNum533 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-1", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testOptimalSolutionWithFullClauseSelectorIsSatisfiablePlusModellitNum535_failAssert143() throws Exception, ContradictionException, TimeoutException {
        try {
            FullClauseSelectorSolver<ISolver> softSolver = new FullClauseSelectorSolver<ISolver>(adapter, false);
            softSolver.isSatisfiable();
            int[] model = softSolver.model();
            int int_196 = model[Integer.MIN_VALUE];
            int int_197 = model[1];
            int int_198 = model[2];
            int int_199 = model[3];
            org.junit.Assert.fail("testOptimalSolutionWithFullClauseSelectorIsSatisfiablePlusModellitNum535 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-2147483648", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testOptimalSolutionWithFullClauseSelectorIsSatisfiablePlusModellitNum533_failAssert141litNum690_failAssert155() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                FullClauseSelectorSolver<ISolver> softSolver = new FullClauseSelectorSolver<ISolver>(adapter, false);
                softSolver.isSatisfiable();
                int[] model = softSolver.model();
                int int_188 = model[-1];
                int int_189 = model[2];
                int int_190 = model[2];
                int int_191 = model[3];
                org.junit.Assert.fail("testOptimalSolutionWithFullClauseSelectorIsSatisfiablePlusModellitNum533 should have thrown ArrayIndexOutOfBoundsException");
            }
            org.junit.Assert.fail("testOptimalSolutionWithFullClauseSelectorIsSatisfiablePlusModellitNum533_failAssert141litNum690 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-1", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testOptimalSolutionWithFullClauseSelectorIsSatisfiablePlusModellitNum533_failAssert141_add727_failAssert172() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                FullClauseSelectorSolver<ISolver> softSolver = new FullClauseSelectorSolver<ISolver>(adapter, false);
                softSolver.isSatisfiable();
                softSolver.isSatisfiable();
                int[] model = softSolver.model();
                int int_188 = model[-1];
                int int_189 = model[1];
                int int_190 = model[2];
                int int_191 = model[3];
                org.junit.Assert.fail("testOptimalSolutionWithFullClauseSelectorIsSatisfiablePlusModellitNum533 should have thrown ArrayIndexOutOfBoundsException");
            }
            org.junit.Assert.fail("testOptimalSolutionWithFullClauseSelectorIsSatisfiablePlusModellitNum533_failAssert141_add727 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-1", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testOptimalSolutionWithFullClauseSelectorIsSatisfiablePlusModellitNum535_failAssert143litNum712_failAssert187() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                FullClauseSelectorSolver<ISolver> softSolver = new FullClauseSelectorSolver<ISolver>(adapter, false);
                softSolver.isSatisfiable();
                int[] model = softSolver.model();
                int int_196 = model[Integer.MIN_VALUE];
                int int_197 = model[1];
                int int_198 = model[2];
                int int_199 = model[2];
                org.junit.Assert.fail("testOptimalSolutionWithFullClauseSelectorIsSatisfiablePlusModellitNum535 should have thrown ArrayIndexOutOfBoundsException");
            }
            org.junit.Assert.fail("testOptimalSolutionWithFullClauseSelectorIsSatisfiablePlusModellitNum535_failAssert143litNum712 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-2147483648", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testOptimalSolutionWithFullClauseSelectorIsSatisfiablePlusModellitNum533_failAssert141litNum690_failAssert155litNum811_failAssert195() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    FullClauseSelectorSolver<ISolver> softSolver = new FullClauseSelectorSolver<ISolver>(adapter, false);
                    softSolver.isSatisfiable();
                    int[] model = softSolver.model();
                    int int_188 = model[-1];
                    int int_189 = model[2];
                    int int_190 = model[3];
                    int int_191 = model[3];
                    org.junit.Assert.fail("testOptimalSolutionWithFullClauseSelectorIsSatisfiablePlusModellitNum533 should have thrown ArrayIndexOutOfBoundsException");
                }
                org.junit.Assert.fail("testOptimalSolutionWithFullClauseSelectorIsSatisfiablePlusModellitNum533_failAssert141litNum690 should have thrown ArrayIndexOutOfBoundsException");
            }
            org.junit.Assert.fail("testOptimalSolutionWithFullClauseSelectorIsSatisfiablePlusModellitNum533_failAssert141litNum690_failAssert155litNum811 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-1", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testOptimalSolutionWithFullClauseSelectorIsSatisfiablePlusModellitNum533_failAssert141litNum690_failAssert155_add846_failAssert207() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    FullClauseSelectorSolver<ISolver> softSolver = new FullClauseSelectorSolver<ISolver>(adapter, false);
                    softSolver.isSatisfiable();
                    softSolver.isSatisfiable();
                    int[] model = softSolver.model();
                    int int_188 = model[-1];
                    int int_189 = model[2];
                    int int_190 = model[2];
                    int int_191 = model[3];
                    org.junit.Assert.fail("testOptimalSolutionWithFullClauseSelectorIsSatisfiablePlusModellitNum533 should have thrown ArrayIndexOutOfBoundsException");
                }
                org.junit.Assert.fail("testOptimalSolutionWithFullClauseSelectorIsSatisfiablePlusModellitNum533_failAssert141litNum690 should have thrown ArrayIndexOutOfBoundsException");
            }
            org.junit.Assert.fail("testOptimalSolutionWithFullClauseSelectorIsSatisfiablePlusModellitNum533_failAssert141litNum690_failAssert155_add846 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-1", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testOptimalSolutionWithFullClauseSelectorIsSatisfiablePlusModellitNum535_failAssert143litNum712_failAssert187_add813_failAssert231() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    FullClauseSelectorSolver<ISolver> softSolver = new FullClauseSelectorSolver<ISolver>(adapter, false);
                    softSolver.isSatisfiable();
                    softSolver.isSatisfiable();
                    int[] model = softSolver.model();
                    int int_196 = model[Integer.MIN_VALUE];
                    int int_197 = model[1];
                    int int_198 = model[2];
                    int int_199 = model[2];
                    org.junit.Assert.fail("testOptimalSolutionWithFullClauseSelectorIsSatisfiablePlusModellitNum535 should have thrown ArrayIndexOutOfBoundsException");
                }
                org.junit.Assert.fail("testOptimalSolutionWithFullClauseSelectorIsSatisfiablePlusModellitNum535_failAssert143litNum712 should have thrown ArrayIndexOutOfBoundsException");
            }
            org.junit.Assert.fail("testOptimalSolutionWithFullClauseSelectorIsSatisfiablePlusModellitNum535_failAssert143litNum712_failAssert187_add813 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-2147483648", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testOptimalSolutionWithFullClauseSelectorFindModellitNum2_failAssert0() throws Exception, ContradictionException, TimeoutException {
        try {
            FullClauseSelectorSolver<ISolver> softSolver = new FullClauseSelectorSolver<ISolver>(adapter, false);
            int[] model = softSolver.findModel();
            int int_20 = model[-1];
            int int_21 = model[1];
            int int_22 = model[2];
            int int_23 = model[3];
            org.junit.Assert.fail("testOptimalSolutionWithFullClauseSelectorFindModellitNum2 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-1", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testOptimalSolutionWithFullClauseSelectorFindModellitNum16_failAssert5() throws Exception, ContradictionException, TimeoutException {
        try {
            FullClauseSelectorSolver<ISolver> softSolver = new FullClauseSelectorSolver<ISolver>(adapter, false);
            int[] model = softSolver.findModel();
            int int_76 = model[0];
            int int_77 = model[Integer.MIN_VALUE];
            int int_78 = model[2];
            int int_79 = model[3];
            org.junit.Assert.fail("testOptimalSolutionWithFullClauseSelectorFindModellitNum16 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-2147483648", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testOptimalSolutionWithFullClauseSelectorFindModel_add42_failAssert14() throws Exception, ContradictionException, TimeoutException {
        try {
            FullClauseSelectorSolver<ISolver> softSolver = new FullClauseSelectorSolver<ISolver>(adapter, false);
            softSolver.findModel();
            int[] model = softSolver.findModel();
            int int_180 = model[0];
            int int_181 = model[1];
            int int_182 = model[2];
            int int_183 = model[3];
            org.junit.Assert.fail("testOptimalSolutionWithFullClauseSelectorFindModel_add42 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testOptimalSolutionWithFullClauseSelectorFindModellitNum2_failAssert0litNum155_failAssert15() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                FullClauseSelectorSolver<ISolver> softSolver = new FullClauseSelectorSolver<ISolver>(adapter, false);
                int[] model = softSolver.findModel();
                int int_20 = model[-1];
                int int_21 = model[2];
                int int_22 = model[2];
                int int_23 = model[3];
                org.junit.Assert.fail("testOptimalSolutionWithFullClauseSelectorFindModellitNum2 should have thrown ArrayIndexOutOfBoundsException");
            }
            org.junit.Assert.fail("testOptimalSolutionWithFullClauseSelectorFindModellitNum2_failAssert0litNum155 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-1", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testOptimalSolutionWithFullClauseSelectorFindModellitNum2_failAssert0_add215_failAssert32() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                FullClauseSelectorSolver<ISolver> softSolver = new FullClauseSelectorSolver<ISolver>(adapter, false);
                softSolver.findModel();
                int[] model = softSolver.findModel();
                int int_20 = model[-1];
                int int_21 = model[1];
                int int_22 = model[2];
                int int_23 = model[3];
                org.junit.Assert.fail("testOptimalSolutionWithFullClauseSelectorFindModellitNum2 should have thrown ArrayIndexOutOfBoundsException");
            }
            org.junit.Assert.fail("testOptimalSolutionWithFullClauseSelectorFindModellitNum2_failAssert0_add215 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testOptimalSolutionWithFullClauseSelectorFindModel_add42_failAssert14_add209_failAssert77() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                FullClauseSelectorSolver<ISolver> softSolver = new FullClauseSelectorSolver<ISolver>(adapter, false);
                softSolver.findModel();
                softSolver.findModel();
                int[] model = softSolver.findModel();
                int int_180 = model[0];
                int int_181 = model[1];
                int int_182 = model[2];
                int int_183 = model[3];
                org.junit.Assert.fail("testOptimalSolutionWithFullClauseSelectorFindModel_add42 should have thrown NullPointerException");
            }
            org.junit.Assert.fail("testOptimalSolutionWithFullClauseSelectorFindModel_add42_failAssert14_add209 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testOptimalSolutionWithFullClauseSelectorFindModellitNum2_failAssert0litNum155_failAssert15litNum349_failAssert80() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    FullClauseSelectorSolver<ISolver> softSolver = new FullClauseSelectorSolver<ISolver>(adapter, false);
                    int[] model = softSolver.findModel();
                    int int_20 = model[-1];
                    int int_21 = model[2];
                    int int_22 = model[3];
                    int int_23 = model[3];
                    org.junit.Assert.fail("testOptimalSolutionWithFullClauseSelectorFindModellitNum2 should have thrown ArrayIndexOutOfBoundsException");
                }
                org.junit.Assert.fail("testOptimalSolutionWithFullClauseSelectorFindModellitNum2_failAssert0litNum155 should have thrown ArrayIndexOutOfBoundsException");
            }
            org.junit.Assert.fail("testOptimalSolutionWithFullClauseSelectorFindModellitNum2_failAssert0litNum155_failAssert15litNum349 should have thrown ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
            Assert.assertEquals("-1", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testOptimalSolutionWithFullClauseSelectorFindModellitNum2_failAssert0litNum155_failAssert15_add367_failAssert92() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    FullClauseSelectorSolver<ISolver> softSolver = new FullClauseSelectorSolver<ISolver>(adapter, false);
                    softSolver.findModel();
                    int[] model = softSolver.findModel();
                    int int_20 = model[-1];
                    int int_21 = model[2];
                    int int_22 = model[2];
                    int int_23 = model[3];
                    org.junit.Assert.fail("testOptimalSolutionWithFullClauseSelectorFindModellitNum2 should have thrown ArrayIndexOutOfBoundsException");
                }
                org.junit.Assert.fail("testOptimalSolutionWithFullClauseSelectorFindModellitNum2_failAssert0litNum155 should have thrown ArrayIndexOutOfBoundsException");
            }
            org.junit.Assert.fail("testOptimalSolutionWithFullClauseSelectorFindModellitNum2_failAssert0litNum155_failAssert15_add367 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testOptimalSolutionWithFullClauseSelectorFindModellitNum2_failAssert0_add215_failAssert32litNum384_failAssert104() throws Exception, ContradictionException, TimeoutException {
        try {
            {
                {
                    FullClauseSelectorSolver<ISolver> softSolver = new FullClauseSelectorSolver<ISolver>(adapter, false);
                    softSolver.findModel();
                    int[] model = softSolver.findModel();
                    int int_20 = model[-1];
                    int int_21 = model[1];
                    int int_22 = model[607740843];
                    int int_23 = model[3];
                    org.junit.Assert.fail("testOptimalSolutionWithFullClauseSelectorFindModellitNum2 should have thrown ArrayIndexOutOfBoundsException");
                }
                org.junit.Assert.fail("testOptimalSolutionWithFullClauseSelectorFindModellitNum2_failAssert0_add215 should have thrown NullPointerException");
            }
            org.junit.Assert.fail("testOptimalSolutionWithFullClauseSelectorFindModellitNum2_failAssert0_add215_failAssert32litNum384 should have thrown NullPointerException");
        } catch (NullPointerException expected) {
            Assert.assertEquals(null, expected.getMessage());
        }
    }
}

