/**
 * See the NOTICE file distributed with this work for additional
 * information regarding copyright ownership.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package org.xwiki.crypto.cipher.internal.asymmetric.factory;


import java.security.GeneralSecurityException;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.xwiki.crypto.AsymmetricKeyFactory;
import org.xwiki.crypto.BinaryStringEncoder;
import org.xwiki.crypto.cipher.Cipher;
import org.xwiki.crypto.cipher.CipherFactory;
import org.xwiki.crypto.internal.DefaultSecureRandomProvider;
import org.xwiki.crypto.internal.asymmetric.keyfactory.BcRSAKeyFactory;
import org.xwiki.crypto.internal.encoder.Base64BinaryStringEncoder;
import org.xwiki.crypto.internal.encoder.HexBinaryStringEncoder;
import org.xwiki.crypto.params.cipher.asymmetric.AsymmetricCipherParameters;
import org.xwiki.crypto.params.cipher.asymmetric.PrivateKeyParameters;
import org.xwiki.crypto.params.cipher.asymmetric.PublicKeyParameters;
import org.xwiki.crypto.params.cipher.symmetric.SymmetricCipherParameters;
import org.xwiki.test.annotation.ComponentList;
import org.xwiki.test.mockito.MockitoComponentMockingRule;


@ComponentList({ Base64BinaryStringEncoder.class, HexBinaryStringEncoder.class, BcRSAKeyFactory.class, DefaultSecureRandomProvider.class })
public class AmplBcRsaOaepCipherFactoryTest {
    // Link to decoded ASN.1: https://goo.gl/kgV0IB
    private static final String PRIVATE_KEY = "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQDCmjim/3likJ4" + (((((((((((((((((((((((("VF564UyygqPjIX/z090AImLl0fDLUkIyCVTSd18wJ3axr1qjLtSgNPWet0puSxO" + "FH0AzFKRCJOjUkQRU8iAkz64MLAf9xrx4nBECciqeB941s01kLtG8C/UqC3O9Sw") + "HSdhtUpUU8V/91SiD09yNJsnODi3WqM3oLg1QYzKhoaD2mVo2xJLQ/QXqr2XIc5") + "i2Mlpfq6S5JNbFD/I+UFhBUlBNuDOEV7ttIt2eFMEUsfkCestGo0YoQYOpTLPcP") + "GRS7MnSY1CLWGUYqaMSnes0nS8ke2PPD4Q0suAZz4msnhNufanscstM8tcNtsZF") + "6hj0JvbZok89szAgMBAAECggEBAKWJ1SlR5ysORDtDBXRc5HiiZEbnSGIFtYXaj") + "N/nCsJBWBVCb+jZeirmU9bEGoB20OQ6WOjHYCnAqraQ51wMK5HgXvZBGtSMD/AH") + "pkiF4YsOYULlXiUL2aQ4NijdvEC1sz1Cw9CAKmElb83UtZ1ZGkJnjhi35giZvU5") + "BQRgbK5k57DFY66yv9VDg8tuD/enI9sRsCUZfCImuShGv4nLqhPMPg+1UxDPGet") + "Vs8uEaJQ017E14wLKLA0DlED13icelU1A7ufkEdeBSv/yZ7ENjervzPwa9nITK/") + "19uzqaHOcYZxmDQn6UHTnaLpIEaUvpp/pbed5S97ETSsqUBC8fqEUECgYEA/Sba") + "o6efydhlXDHbXtyvaJWao19sbI9OfxGC6dR2fZiBx8Do9kVDDbMtb1PYEfLhYbi") + "urmKGbUtcLSFgxNbZifUmG54M92nBsnsetMCqvMVNzYl2Je83V+NrIsLJjFIZ2C") + "BvZa/FKOLDTwSe35fNqaS0ExdwcGNMIT//bDQCmyECgYEAxMq6rN+HpBRuhvvst") + "V99zV+lI/1DzZuXExd+c3PSchiqkJrTLaQDvcaHQir9hK7RqF9vO7tvdluJjgX+") + "f/CMPNQuC5k6vY/0fS4V2NQWtln9BBSzHtocTnZzFNq8tAZqyEhZUHIbkncroXv") + "eUXqtlfOnKB2aYI/+3gPEMYJlH9MCgYA4exjA9r9B65QB0+Xb7mT8cpSD6uBoAD") + "lFRITu4sZlE0exZ6sSdzWUsutqMUy+BHCguvHOWpEfhXbVYuMSR9VVYGrWMpc2B") + "FSBG9MoBOyTHXpUZ10C7bJtW4IlyUvqkM7PV71C9MqKar2kvaUswdPTC7pZoBso") + "GB9+M6crXxdNwQKBgDUVMlGbYi1CTaYfonQyM+8IE7WnhXiatZ+ywKtH3MZmHOw") + "wtzIigdfZC3cvvX7i4S73vztvjdtxSaODvmiobEukOF9sj8m+YQa7Pa1lWFML5x") + "IIu2BhGS2ZCeXgMvKkoH0x9tWaUhGqD5zZmtiDrPs75CUQBypw7SDaBzwLnld9A") + "oGBAPgUh90PvUzbVVkzpVCPI82cmOIVMI1rDE6uCeNzIlN6Xu80RimCSaaDsESi") + "tBtoVWLRWWmuCINyqr6e9AdyvbvT6mQCjbn9+y7t6ZAhLaya5ZMUVEBLyLLqMzr") + "y oi/huj7m4nV4kPZz9LKxDRu3r6o0Pah+daDsTxEYObtsKa7e");

    // Link to decoded ASN.1: https://goo.gl/2YsSco
    private static final String PUBLIC_KEY = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAwpo4pv95YpCeFReeuFM" + ((((("soKj4yF/89PdACJi5dHwy1JCMglU0ndfMCd2sa9aoy7UoDT1nrdKbksThR9AMxS" + "kQiTo1JEEVPIgJM+uDCwH/ca8eJwRAnIqngfeNbNNZC7RvAv1KgtzvUsB0nYbVK") + "VFPFf/dUog9PcjSbJzg4t1qjN6C4NUGMyoaGg9plaNsSS0P0F6q9lyHOYtjJaX6") + "ukuSTWxQ/yPlBYQVJQTbgzhFe7bSLdnhTBFLH5AnrLRqNGKEGDqUyz3DxkUuzJ0") + "mNQi1hlGKmjEp3rNJ0vJHtjzw+ENLLgGc+JrJ4Tbn2p7HLLTPLXDbbGReoY9Cb2") + "2aJPPbMwIDAQAB");

    private static final String INPUT = "4e6f77206973207468652074696d6520666f7220616c6c20676f6f64206d656e";

    @Rule
    public final MockitoComponentMockingRule<CipherFactory> mocker = new MockitoComponentMockingRule<CipherFactory>(BcRsaOaepCipherFactory.class);

    private CipherFactory factory;

    private static PrivateKeyParameters privateKey;

    private static PublicKeyParameters publicKey;

    private static byte[] input;

    @Before
    public void configure() throws Exception {
        factory = mocker.getComponentUnderTest();
        // Decode keys once for all tests.
        if ((AmplBcRsaOaepCipherFactoryTest.privateKey) == null) {
            BinaryStringEncoder base64Encoder = mocker.getInstance(BinaryStringEncoder.class, "Base64");
            BinaryStringEncoder hexEencoder = mocker.getInstance(BinaryStringEncoder.class, "Base64");
            AsymmetricKeyFactory keyfactory = mocker.getInstance(AsymmetricKeyFactory.class, "RSA");
            AmplBcRsaOaepCipherFactoryTest.privateKey = keyfactory.fromPKCS8(base64Encoder.decode(AmplBcRsaOaepCipherFactoryTest.PRIVATE_KEY));
            AmplBcRsaOaepCipherFactoryTest.publicKey = keyfactory.fromX509(base64Encoder.decode(AmplBcRsaOaepCipherFactoryTest.PUBLIC_KEY));
            AmplBcRsaOaepCipherFactoryTest.input = hexEencoder.decode(AmplBcRsaOaepCipherFactoryTest.INPUT);
        }
    }

    @Test(timeout = 10000)
    public void testRSAEncryptionDecryptionProgressive_failAssert2() throws Exception {
        // AssertGenerator generate try/catch block with fail statement
        try {
            Cipher cipher = factory.getInstance(true, AmplBcRsaOaepCipherFactoryTest.publicKey);
            cipher.update(AmplBcRsaOaepCipherFactoryTest.input, 0, 17);
            cipher.update(AmplBcRsaOaepCipherFactoryTest.input, 17, 1);
            cipher.update(AmplBcRsaOaepCipherFactoryTest.input, 18, ((AmplBcRsaOaepCipherFactoryTest.input.length) - 18));
            byte[] encrypted = cipher.doFinal();
            cipher = factory.getInstance(false, AmplBcRsaOaepCipherFactoryTest.privateKey);
            cipher.update(encrypted, 0, 65);
            cipher.update(encrypted, 65, 1);
            cipher.update(encrypted, 66, ((encrypted.length) - 66));
            cipher.doFinal();
            CoreMatchers.equalTo(AmplBcRsaOaepCipherFactoryTest.input);
            cipher = factory.getInstance(true, AmplBcRsaOaepCipherFactoryTest.privateKey);
            cipher.update(AmplBcRsaOaepCipherFactoryTest.input, 0, 15);
            cipher.update(AmplBcRsaOaepCipherFactoryTest.input, 15, 1);
            encrypted = cipher.doFinal(AmplBcRsaOaepCipherFactoryTest.input, 16, ((AmplBcRsaOaepCipherFactoryTest.input.length) - 16));
            cipher = factory.getInstance(false, AmplBcRsaOaepCipherFactoryTest.publicKey);
            cipher.update(encrypted);
            cipher.doFinal();
            CoreMatchers.equalTo(AmplBcRsaOaepCipherFactoryTest.input);
            cipher.doFinal();
            CoreMatchers.equalTo(AmplBcRsaOaepCipherFactoryTest.input);
            org.junit.Assert.fail("testRSAEncryptionDecryptionProgressive should have thrown GeneralSecurityException");
        } catch (GeneralSecurityException expected) {
            Assert.assertEquals("Cipher failed to process data.", expected.getMessage());
        }
    }

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    class WrongParameters implements AsymmetricCipherParameters {}

    class SymmetricParameters implements SymmetricCipherParameters {}
}

