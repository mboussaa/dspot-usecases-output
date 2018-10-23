package eu.supersede.integration.api.adaptation.proxies.test;


import eu.supersede.integration.api.adaptation.proxies.AdaptationConfigurationProxy;
import eu.supersede.integration.api.adaptation.types.AdaptationMode;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.http.HttpStatus;
import org.springframework.util.Assert;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class AdaptationConfigurationProxyTest {
    private static AdaptationConfigurationProxy<?, ?> proxy;

    @BeforeClass
    public static void setup() throws Exception {
        AdaptationConfigurationProxyTest.proxy = new AdaptationConfigurationProxy<Object, Object>();
    }

    @Test(timeout = 30000)
    public void testGetAdaptationConfigurationModenull25_failAssert8() throws Exception {
        try {
            AdaptationMode mode = AdaptationConfigurationProxyTest.proxy.getAdaptationConfigurationMode();
            Assert.notNull(null);
            org.junit.Assert.fail("testGetAdaptationConfigurationModenull25 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            assertEquals("[Assertion failed] - this argument is required; it must not be null", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSetAdaptationConfigurationMode() throws Exception {
        HttpStatus o_testSetAdaptationConfigurationMode__1 = AdaptationConfigurationProxyTest.proxy.setAdaptationConfigurationMode(AdaptationMode.SUPERVISED);
        assertEquals("OK", ((HttpStatus) (o_testSetAdaptationConfigurationMode__1)).getReasonPhrase());
        assertFalse(((HttpStatus) (o_testSetAdaptationConfigurationMode__1)).is1xxInformational());
        assertTrue(((HttpStatus) (o_testSetAdaptationConfigurationMode__1)).is2xxSuccessful());
        assertFalse(((HttpStatus) (o_testSetAdaptationConfigurationMode__1)).is3xxRedirection());
        assertFalse(((HttpStatus) (o_testSetAdaptationConfigurationMode__1)).is4xxClientError());
        assertFalse(((HttpStatus) (o_testSetAdaptationConfigurationMode__1)).is5xxServerError());
        assertEquals("200", ((HttpStatus) (o_testSetAdaptationConfigurationMode__1)).toString());
    }

    @Test(timeout = 30000)
    public void testAdaptationModelitString1_failAssert0() throws Exception {
        try {
            AdaptationMode mode = AdaptationMode.valueOf("SUPER*ISED");
            org.junit.Assert.fail("testAdaptationModelitString1 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            assertEquals("No enum constant eu.supersede.integration.api.adaptation.types.AdaptationMode.SUPER*ISED", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testAdaptationModelitString2_failAssert1() throws Exception {
        try {
            AdaptationMode mode = AdaptationMode.valueOf("S}UPERVISED");
            org.junit.Assert.fail("testAdaptationModelitString2 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            assertEquals("No enum constant eu.supersede.integration.api.adaptation.types.AdaptationMode.S}UPERVISED", expected.getMessage());
        }
    }
}

