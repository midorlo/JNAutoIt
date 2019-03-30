/*
 * Copyright 2018 midorlo.
 * Updated 2019 by sergueik
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
import java.util.HashMap;
import java.util.Map;

/**
 * @via https://www.autoitscript.com/forum/topic/72905-c-use-of-the-dll-some-idears-for-you/
 * @author midorlo
 * @author sergueik
 */
public class Constants {

	public static final int AU3_INTDEFAULT = -2147483647; // "Default" value for
																												// _some_ final int
																												// parameters (largest
																												// negative number)
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

	public static final int RUN_LOGON_NOPROFILE = 0;
	public static final int RUN_LOGON_PROFILE = 1;
	public static final int RUN_LOGON_NETWORK = 2;
	public static final int RUN_LOGON_INHERIT = 4;

	// The AutoIt v3 functions return values are unusual
	// for a Java program
	// e.g.
	// https://www.autoitscript.com/autoit3/docs/functions/WinClose.htm
	// https://www.autoitscript.com/autoit3/docs/functions/WinKill.htm
	// etc. illustrate the pattern:
	// Success: 1.
	// Failure: 0 if the window is not found,
	// or can not be activated
	// some functions only return success value of 1.

	// https://www.autoitscript.com/autoit3/docs/appendix/AutoItConstants.htm
	// https://github.com/310ken1/AutoItSciTEj/blob/master/language/au3/Include/AutoItConstants.au3
	// TODO: rename constants used in this class
	public static final int AU3_SUCCESS = 1;
	public static final int AU3_FAILURE = 0;

	public static final int AU3_WINDOWS_NOONTOP = 0;
	public static final int AU3_WINDOWS_ONTOP = 1;

	public static final int WIN_STATE_EXISTS = 1;
	public static final int WIN_STATE_VISIBLE = 2;
	public static final int WIN_STATE_ENABLED = 4;
	public static final int WIN_STATE_ACTIVE = 8;
	public static final int WIN_STATE_MINIMIZED = 16;
	public static final int WIN_STATE_MAXIMIZED = 32;

	public static final Map<Integer, String> stateNames = new HashMap<>();
	static {
		stateNames.put(WIN_STATE_EXISTS, "Window exists");
		stateNames.put(WIN_STATE_VISIBLE, "Window is visible");
		stateNames.put(WIN_STATE_ENABLED, "Window is enabled");
		stateNames.put(WIN_STATE_ACTIVE, "Window is active");
		stateNames.put(WIN_STATE_MINIMIZED, "Window is minimized");
		stateNames.put(WIN_STATE_MAXIMIZED, "Window is maximized");
	}

	public static final int AU3_SEND_DEFAULT = 0;
	public static final int AU3_SEND_RAW = 1;

	public static final String DLL = (System.getProperty("os.arch")
			.equals("amd64") ? "AutoItX3_x64.dll" : "AutoItX3.dll");
}
