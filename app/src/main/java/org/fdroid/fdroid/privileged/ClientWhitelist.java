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
            new Pair<>("org.fdroid.fdroid", "9BBEB9FDFF654D5776CC7D40637537A153F78F77FD68AE7CC75073DA6541537E"), // marlin releasekey
            new Pair<>("org.fdroid.fdroid", "7BEAB5572132C6970573105C9FDA5A5A0A3ECC216E0D0835DB34E3A0BFE6C8A4"), // marlin platform (deprecated)
            new Pair<>("org.fdroid.fdroid", "0473254CE0F37E23461744F26C72914539FF9671BEBAA1F276A8C81DB75DCDF7"), // sailfish releasekey
            new Pair<>("org.fdroid.fdroid", "1A01659565EB3E564B18C41FA683C858C94DA7CDC52B651B5EDB6A93033D22EA"), // sailfish platform (deprecated)
            new Pair<>("org.fdroid.fdroid", "435772C6E17A1D157864098C4D46133F1E2012630304B54EB003A516B62DEA6C"), // taimen releasekey
            new Pair<>("org.fdroid.fdroid", "835F9A98D1498069D5229FFAE8C43122121DAC8238077529C1455BDAC5F98D5D")  // walleye releasekey
    ));

}
