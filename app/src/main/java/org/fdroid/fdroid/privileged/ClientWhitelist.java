/*
 * Copyright (C) 2016 Dominik Schürmann <dominik@dominikschuermann.de>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http//www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.fdroid.fdroid.privileged;

import android.util.Pair;

import java.util.Arrays;
import java.util.HashSet;

/**
 * Only apps signed using a certificate with a SHA-256 hash listed here
 * can access the Privileged Extension!
 * 1. Get SHA-256 of certificate with
 * keytool -list -printcert -jarfile com.example.apk
 * 2. Add here as lowercase without colons
 */
public class ClientWhitelist {

    public static HashSet<Pair<String, String>> whitelist = new HashSet<>(Arrays.asList(
            // certificate SHA-256 of https//f-droid.org/FDroid.apk
            new Pair<>("org.fdroid.fdroid", "67760df25e94ae6c955d9e17ca1bc8e195da5d91d5a58023805ab3579463d1b8"), // legacy releasekey
            new Pair<>("org.fdroid.fdroid", "449391570558013f23a3cd06330bc4718b18b1d910f5161c3f68270d60d72904"), // legacy platform (deprecated)
            new Pair<>("org.fdroid.fdroid", "E45CBB9EA4FC706403BF0EA1C077A3051CAEB1AE327A3154195F32E9CC496597"), // marlin releasekey
            new Pair<>("org.fdroid.fdroid", "A9612638C9CE3F8EAB94B147F64FCBF09F042A8C4C78CF0CEDF905B71F4AB010"), // marlin platform (deprecated)
            new Pair<>("org.fdroid.fdroid", "DB4D61574BABBE726D8BD40B97D04FF983887A3F657D0A8BFD57CFDC1479F0E4"), // sailfish releasekey
            new Pair<>("org.fdroid.fdroid", "82D3A2413ECA3E0CA5086C9715424847C8D81C41098D7D40E066B093058B96FB"), // sailfish platform (deprecated)
            new Pair<>("org.fdroid.fdroid", "D001133A0037AD10CEDD5A3B34BB012A0F43F4F435C26B4CB53E1AEED7F2C0F5"), // taimen releasekey
            new Pair<>("org.fdroid.fdroid", "542E26DD2F205C8C00E429E8AABF69711D3DCC4A381AD311C543DE77E729C638")  // walleye releasekey
    ));

}
