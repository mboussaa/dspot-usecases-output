package org.sat4j;


import java.io.ByteArrayInputStream;
import java.io.IOException;
import org.junit.Assert;
import org.junit.Test;
import org.sat4j.minisat.SolverFactory;
import org.sat4j.reader.InstanceReader;
import org.sat4j.reader.ParseFormatException;
import org.sat4j.specs.ContradictionException;


public class AmplBugSAT25 {
    @Test(timeout = 30000)
    public void testReaderFromInstanceReader_add17_failAssert1() throws IOException, Exception, ParseFormatException, ContradictionException {
        try {
            String cnfString = "p cnf 3 4\n1 2 3 0\n-1 -2 0\n-1 -3 0\n-2 -3 0";
            SolverFactory.newDefault();
            InstanceReader reader = new InstanceReader(SolverFactory.newDefault());
            reader.parseInstance(new ByteArrayInputStream(cnfString.getBytes()));
            org.junit.Assert.fail("testReaderFromInstanceReader_add17 should have thrown UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) {
            Assert.assertEquals("Use a domain specific Reader (LecteurDimacs, AIGReader, etc.) for stream input ", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testReaderFromInstanceReader_add19_failAssert3() throws IOException, Exception, ParseFormatException, ContradictionException {
        try {
            String cnfString = "p cnf 3 4\n1 2 3 0\n-1 -2 0\n-1 -3 0\n-2 -3 0";
            InstanceReader reader = new InstanceReader(SolverFactory.newDefault());
            cnfString.getBytes();
            reader.parseInstance(new ByteArrayInputStream(cnfString.getBytes()));
            org.junit.Assert.fail("testReaderFromInstanceReader_add19 should have thrown UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) {
            Assert.assertEquals("Use a domain specific Reader (LecteurDimacs, AIGReader, etc.) for stream input ", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testReaderFromInstanceReader_add17_failAssert1_add29_failAssert4() throws IOException, Exception, ParseFormatException, ContradictionException {
        try {
            {
                String cnfString = "p cnf 3 4\n1 2 3 0\n-1 -2 0\n-1 -3 0\n-2 -3 0";
                SolverFactory.newDefault();
                SolverFactory.newDefault();
                InstanceReader reader = new InstanceReader(SolverFactory.newDefault());
                reader.parseInstance(new ByteArrayInputStream(cnfString.getBytes()));
                org.junit.Assert.fail("testReaderFromInstanceReader_add17 should have thrown UnsupportedOperationException");
            }
            org.junit.Assert.fail("testReaderFromInstanceReader_add17_failAssert1_add29 should have thrown UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) {
            Assert.assertEquals("Use a domain specific Reader (LecteurDimacs, AIGReader, etc.) for stream input ", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testReaderFromInstanceReader_add17_failAssert1_add31_failAssert5() throws IOException, Exception, ParseFormatException, ContradictionException {
        try {
            {
                String cnfString = "p cnf 3 4\n1 2 3 0\n-1 -2 0\n-1 -3 0\n-2 -3 0";
                SolverFactory.newDefault();
                SolverFactory.newDefault();
                InstanceReader reader = new InstanceReader(SolverFactory.newDefault());
                reader.parseInstance(new ByteArrayInputStream(cnfString.getBytes()));
                org.junit.Assert.fail("testReaderFromInstanceReader_add17 should have thrown UnsupportedOperationException");
            }
            org.junit.Assert.fail("testReaderFromInstanceReader_add17_failAssert1_add31 should have thrown UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) {
            Assert.assertEquals("Use a domain specific Reader (LecteurDimacs, AIGReader, etc.) for stream input ", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testReaderFromInstanceReader_add17_failAssert1_add29_failAssert4_add56_failAssert14() throws IOException, Exception, ParseFormatException, ContradictionException {
        try {
            {
                {
                    String cnfString = "p cnf 3 4\n1 2 3 0\n-1 -2 0\n-1 -3 0\n-2 -3 0";
                    SolverFactory.newDefault();
                    SolverFactory.newDefault();
                    SolverFactory.newDefault();
                    InstanceReader reader = new InstanceReader(SolverFactory.newDefault());
                    reader.parseInstance(new ByteArrayInputStream(cnfString.getBytes()));
                    org.junit.Assert.fail("testReaderFromInstanceReader_add17 should have thrown UnsupportedOperationException");
                }
                org.junit.Assert.fail("testReaderFromInstanceReader_add17_failAssert1_add29 should have thrown UnsupportedOperationException");
            }
            org.junit.Assert.fail("testReaderFromInstanceReader_add17_failAssert1_add29_failAssert4_add56 should have thrown UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) {
            Assert.assertEquals("Use a domain specific Reader (LecteurDimacs, AIGReader, etc.) for stream input ", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testReaderFromInstanceReader_add17_failAssert1_add31_failAssert5_add60_failAssert22() throws IOException, Exception, ParseFormatException, ContradictionException {
        try {
            {
                {
                    String cnfString = "p cnf 3 4\n1 2 3 0\n-1 -2 0\n-1 -3 0\n-2 -3 0";
                    SolverFactory.newDefault();
                    SolverFactory.newDefault();
                    SolverFactory.newDefault();
                    InstanceReader reader = new InstanceReader(SolverFactory.newDefault());
                    reader.parseInstance(new ByteArrayInputStream(cnfString.getBytes()));
                    org.junit.Assert.fail("testReaderFromInstanceReader_add17 should have thrown UnsupportedOperationException");
                }
                org.junit.Assert.fail("testReaderFromInstanceReader_add17_failAssert1_add31 should have thrown UnsupportedOperationException");
            }
            org.junit.Assert.fail("testReaderFromInstanceReader_add17_failAssert1_add31_failAssert5_add60 should have thrown UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) {
            Assert.assertEquals("Use a domain specific Reader (LecteurDimacs, AIGReader, etc.) for stream input ", expected.getMessage());
        }
    }
}

