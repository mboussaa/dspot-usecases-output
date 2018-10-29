package org.sat4j.core;


import org.junit.Before;
import org.mockito.Mockito;
import org.sat4j.reader.JSONReader;
import org.sat4j.specs.ISolver;


public class AmplJsonReaderTest {
    private ISolver solver;

    private JSONReader<ISolver> reader;

    @Before
    public void setUp() throws Exception {
        solver = Mockito.mock(ISolver.class);
        reader = new JSONReader<ISolver>(solver);
    }
}

