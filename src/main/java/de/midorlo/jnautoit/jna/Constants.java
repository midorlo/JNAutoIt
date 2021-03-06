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
package de.midorlo.jnautoit.jna;

/**
 * @via https://www.autoitscript.com/forum/topic/72905-c-use-of-the-dll-some-idears-for-you/
 * @author midorlo
 */
public class Constants {

    public static final int AU3_INTDEFAULT = -2147483647; // "Default" value for _some_ final int parameters (largest negative number)
    public static final int ERROR = 1;
    public static final int SW_HIDE = 2;
    public static final int SW_MAXIMIZE = 3;
    public static final int SW_MINIMIZE = 4;
    public static final int SW_RESTORE = 5;
    public static final int SW_SHOW = 6;
    public static final int SW_SHOWDEFAULT = 7;
    public static final int SW_SHOWMAXIMIZED = 8;
    public static final int SW_SHOWMINIMIZED = 9;
    public static final int SW_SHOWMINNOACTIVE = 10;
    public static final int SW_SHOWNA = 11;
    public static final int SW_SHOWNOACTIVATE = 12;
    public static final int SW_SHOWNORMAL = 13;
    public static final int VERSION = 109;
    
    public static final String DLL = (System.getProperty("os.arch").equals("amd64")?"AutoItX3_x64.dll":"AutoItX3.dll");
}
