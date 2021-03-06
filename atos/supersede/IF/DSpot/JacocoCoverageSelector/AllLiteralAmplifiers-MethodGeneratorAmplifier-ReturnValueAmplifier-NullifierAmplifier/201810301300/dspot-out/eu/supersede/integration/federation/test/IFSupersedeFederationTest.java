package eu.supersede.integration.federation.test;


import eu.supersede.integration.api.datastore.integration.types.SupersedePlatform;
import eu.supersede.integration.federation.SupersedeFederation;
import java.util.List;
import org.junit.BeforeClass;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.Assert;

import static org.junit.Assert.assertEquals;


public class IFSupersedeFederationTest {
    private static final Logger log = LoggerFactory.getLogger(IFSupersedeFederationTest.class);

    private static SupersedeFederation federation;

    @BeforeClass
    public static void setup() throws Exception {
        IFSupersedeFederationTest.federation = new SupersedeFederation();
    }

    @Test(timeout = 30000)
    public void testSupersedeFederationnull6_failAssert0() throws Exception {
        try {
            List<SupersedePlatform> platforms = IFSupersedeFederationTest.federation.getFederatedSupersedePlatforms();
            Assert.notEmpty(platforms);
            SupersedePlatform localPlatform = IFSupersedeFederationTest.federation.getLocalFederatedSupersedePlatform();
            Assert.notNull(null);
            org.junit.Assert.fail("testSupersedeFederationnull6 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            assertEquals("[Assertion failed] - this argument is required; it must not be null", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSupersedeFederationnull6_failAssert0_mg22_failAssert1() throws Exception {
        try {
            {
                String __DSPOT_mb_user_4 = "8;0L`A=SO/woO!OKS@Rl";
                List<SupersedePlatform> platforms = IFSupersedeFederationTest.federation.getFederatedSupersedePlatforms();
                Assert.notEmpty(platforms);
                SupersedePlatform localPlatform = IFSupersedeFederationTest.federation.getLocalFederatedSupersedePlatform();
                Assert.notNull(null);
                org.junit.Assert.fail("testSupersedeFederationnull6 should have thrown IllegalArgumentException");
                localPlatform.setMb_User(__DSPOT_mb_user_4);
            }
            org.junit.Assert.fail("testSupersedeFederationnull6_failAssert0_mg22 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            assertEquals("[Assertion failed] - this argument is required; it must not be null", expected.getMessage());
        }
    }

    @Test(timeout = 30000)
    public void testSupersedeFederationnull6_failAssert0_mg22_failAssert1litString36_failAssert5() throws Exception {
        try {
            {
                {
                    String __DSPOT_mb_user_4 = "8;0L`A}SO/woO!OKS@Rl";
                    List<SupersedePlatform> platforms = IFSupersedeFederationTest.federation.getFederatedSupersedePlatforms();
                    Assert.notEmpty(platforms);
                    SupersedePlatform localPlatform = IFSupersedeFederationTest.federation.getLocalFederatedSupersedePlatform();
                    Assert.notNull(null);
                    org.junit.Assert.fail("testSupersedeFederationnull6 should have thrown IllegalArgumentException");
                    localPlatform.setMb_User(__DSPOT_mb_user_4);
                }
                org.junit.Assert.fail("testSupersedeFederationnull6_failAssert0_mg22 should have thrown IllegalArgumentException");
            }
            org.junit.Assert.fail("testSupersedeFederationnull6_failAssert0_mg22_failAssert1litString36 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            assertEquals("[Assertion failed] - this argument is required; it must not be null", expected.getMessage());
        }
    }
}

