/*
 *   Copyright 2015, Tanmay Parikh
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */

package com.tanmay.blip;

import java.util.ArrayList;

public class KeysSample {

    public static final String GOOGLE_PLAY_RSA_PUBLIC = "YOUR_GPLAY_KEY";

    public static ArrayList<String> SKU_NAMES;

    static {
        final ArrayList<String> names = new ArrayList<>();
        names.add("NAME");
        names.add("NAME");
        names.add("NAME");
        names.add("NAME");
        SKU_NAMES = names;
    }

}
