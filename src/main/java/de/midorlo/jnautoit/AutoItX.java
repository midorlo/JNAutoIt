/*
 * Copyright 2018 midorlo.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package de.midorlo.jnautoit;

import com.sun.jna.Native;

/**
 *
 * @author midorlo
 */
public class AutoItX {

    AutoItXLibrary INSTANCEA;

    public AutoItX() {
        INSTANCEA = (AutoItXLibrary) Native.loadLibrary(("AutoItX3_x64.dll"), AutoItXLibrary.class);
        INSTANCEA.AU3_Init();
    }
    
    public static void main(String[] args) {
        new AutoItX().INSTANCEA.AU3_Init();
    }

}
