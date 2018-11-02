package org.sat4j;


import java.io.IOException;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.sat4j.minisat.SolverFactory;
import org.sat4j.reader.InstanceReader;
import org.sat4j.reader.ParseFormatException;
import org.sat4j.reader.Reader;
import org.sat4j.specs.ContradictionException;


public class AmplBugSAT145 {
    @Test(timeout = 30000)
    public void testWindowsPath() throws IOException, Exception, ParseFormatException, ContradictionException {
        Reader mockReader = Mockito.mock(Reader.class);
        InstanceReader instanceReader = new InstanceReader(SolverFactory.newDefault(), mockReader);
        Assert.assertFalse(((InstanceReader) (instanceReader)).hasAMapping());
        Assert.assertTrue(((InstanceReader) (instanceReader)).getMapping().isEmpty());
        Assert.assertFalse(((InstanceReader) (instanceReader)).isVerbose());
        Assert.assertFalse(((InstanceReader) (instanceReader)).isUsingMapping());
        instanceReader.parseInstance("EZCNF:C:\\projects\\bla\\testcomments.cnf");
        Mockito.verify(mockReader).parseInstance("C:\\projects\\bla\\testcomments.cnf");
    }

    @Test(timeout = 30000)
    public void testWindowsPath_remove13() throws IOException, Exception, ParseFormatException, ContradictionException {
        Reader mockReader = Mockito.mock(Reader.class);
        InstanceReader instanceReader = new InstanceReader(SolverFactory.newDefault(), mockReader);
        Assert.assertFalse(((InstanceReader) (instanceReader)).hasAMapping());
        Assert.assertTrue(((InstanceReader) (instanceReader)).getMapping().isEmpty());
        Assert.assertFalse(((InstanceReader) (instanceReader)).isVerbose());
        Assert.assertFalse(((InstanceReader) (instanceReader)).isUsingMapping());
        instanceReader.parseInstance("EZCNF:C:\\projects\\bla\\testcomments.cnf");
    }

    @Test(timeout = 30000)
    public void testWindowsPath_remove13_remove19() throws IOException, Exception, ParseFormatException, ContradictionException {
        Reader mockReader = Mockito.mock(Reader.class);
        InstanceReader instanceReader = new InstanceReader(SolverFactory.newDefault(), mockReader);
        Assert.assertFalse(((InstanceReader) (instanceReader)).hasAMapping());
        Assert.assertTrue(((InstanceReader) (instanceReader)).getMapping().isEmpty());
        Assert.assertFalse(((InstanceReader) (instanceReader)).isVerbose());
        Assert.assertFalse(((InstanceReader) (instanceReader)).isUsingMapping());
    }

    @Test(timeout = 30000)
    public void testUnixPath() throws IOException, Exception, ParseFormatException, ContradictionException {
        Reader mockReader = Mockito.mock(Reader.class);
        InstanceReader instanceReader = new InstanceReader(SolverFactory.newDefault(), mockReader);
        Assert.assertFalse(((InstanceReader) (instanceReader)).hasAMapping());
        Assert.assertTrue(((InstanceReader) (instanceReader)).getMapping().isEmpty());
        Assert.assertFalse(((InstanceReader) (instanceReader)).isVerbose());
        Assert.assertFalse(((InstanceReader) (instanceReader)).isUsingMapping());
        instanceReader.parseInstance("EZCNF:/projects/bla/testcomments.cnf");
        Mockito.verify(mockReader).parseInstance("/projects/bla/testcomments.cnf");
    }

    @Test(timeout = 30000)
    public void testUnixPath_remove2() throws IOException, Exception, ParseFormatException, ContradictionException {
        Reader mockReader = Mockito.mock(Reader.class);
        InstanceReader instanceReader = new InstanceReader(SolverFactory.newDefault(), mockReader);
        Assert.assertFalse(((InstanceReader) (instanceReader)).hasAMapping());
        Assert.assertTrue(((InstanceReader) (instanceReader)).getMapping().isEmpty());
        Assert.assertFalse(((InstanceReader) (instanceReader)).isVerbose());
        Assert.assertFalse(((InstanceReader) (instanceReader)).isUsingMapping());
        instanceReader.parseInstance("EZCNF:/projects/bla/testcomments.cnf");
    }

    @Test(timeout = 30000)
    public void testUnixPath_remove2_remove8() throws IOException, Exception, ParseFormatException, ContradictionException {
        Reader mockReader = Mockito.mock(Reader.class);
        InstanceReader instanceReader = new InstanceReader(SolverFactory.newDefault(), mockReader);
        Assert.assertFalse(((InstanceReader) (instanceReader)).hasAMapping());
        Assert.assertTrue(((InstanceReader) (instanceReader)).getMapping().isEmpty());
        Assert.assertFalse(((InstanceReader) (instanceReader)).isVerbose());
        Assert.assertFalse(((InstanceReader) (instanceReader)).isUsingMapping());
    }
}

