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

import com.sun.jna.Library;
import com.sun.jna.Pointer;
import com.sun.jna.WString;
import com.sun.jna.platform.win32.WTypes.LPWSTR;
import com.sun.jna.platform.win32.WinDef.DWORD;
import com.sun.jna.platform.win32.WinDef.HWND;
import com.sun.jna.platform.win32.WinDef.RECT;

/**
 *
 * @author midorlo
 */
public interface AutoItXLibrary extends Library {

//    com.sun.jna.platform.win32.WinDef.HWND x;
    String AU3_WinMinimizeAll();

    void AU3_Init();

    int AU3_error();

    int AU3_AutoItSetOption(WString szOption, int nValue);

    void AU3_ClipGet(LPWSTR szClip, int nBufSize);

    void AU3_ClipPut(WString szClip);

//        int AU3_ControlClick(WString szTitle, WString szText, WString szControl, WString szButton, int nNumClicks, int nX
//        = AU3_INTDEFAULT, int nY = AU3_INTDEFAULT
//
//        );
//        int AU3_ControlClickByHandle(HWND hWnd, HWND hCtrl, WString szButton, int nNumClicks, int nX
//        = AU3_INTDEFAULT, int nY = AU3_INTDEFAULT
//
//        );
    void AU3_ControlCommand(WString szTitle, WString szText, WString szControl, WString szCommand, WString szExtra, LPWSTR szResult, int nBufSize);

    void AU3_ControlCommandByHandle(HWND hWnd, HWND hCtrl, WString szCommand, WString szExtra, LPWSTR szResult, int nBufSize);

    void AU3_ControlListView(WString szTitle, WString szText, WString szControl, WString szCommand, WString szExtra1, WString szExtra2, LPWSTR szResult, int nBufSize);

    void AU3_ControlListViewByHandle(HWND hWnd, HWND hCtrl, WString szCommand, WString szExtra1, WString szExtra2, LPWSTR szResult, int nBufSize);

    int AU3_ControlDisable(WString szTitle, WString szText, WString szControl);

    int AU3_ControlDisableByHandle(HWND hWnd, HWND hCtrl);

    int AU3_ControlEnable(WString szTitle, WString szText, WString szControl);

    int AU3_ControlEnableByHandle(HWND hWnd, HWND hCtrl);

    int AU3_ControlFocus(WString szTitle, WString szText, WString szControl);

    int AU3_ControlFocusByHandle(HWND hWnd, HWND hCtrl);

    void AU3_ControlGetFocus(WString szTitle, WString szText, LPWSTR szControlWithFocus, int nBufSize);

    void AU3_ControlGetFocusByHandle(HWND hWnd, LPWSTR szControlWithFocus, int nBufSize);

    HWND AU3_ControlGetHandle(HWND hWnd, WString szControl);

    void AU3_ControlGetHandleAsText(WString szTitle, /*[in,defaultvalue("")]*/ WString szText, WString szControl, LPWSTR szRetText, int nBufSize);

    int AU3_ControlGetPos(WString szTitle, WString szText, WString szControl, RECT lpRect);

    int AU3_ControlGetPosByHandle(HWND hWnd, HWND hCtrl, RECT lpRect);

    void AU3_ControlGetText(WString szTitle, WString szText, WString szControl, LPWSTR szControlText, int nBufSize);

    void AU3_ControlGetTextByHandle(HWND hWnd, HWND hCtrl, LPWSTR szControlText, int nBufSize);

    int AU3_ControlHide(WString szTitle, WString szText, WString szControl);

    int AU3_ControlHideByHandle(HWND hWnd, HWND hCtrl);

//        int AU3_ControlMove(WString szTitle, WString szText, WString szControl, int nX, int nY, int nWidth
//        = -1, int nHeight = -1
//
//        );
//        int AU3_ControlMoveByHandle(HWND hWnd, HWND hCtrl, int nX, int nY, int nWidth
//        = -1, int nHeight = -1
//
//        );
//        int AU3_ControlSend(WString szTitle, WString szText, WString szControl, WString szSendText, int nMode
//
//        = 0);
//        int AU3_ControlSendByHandle(HWND hWnd, HWND hCtrl, WString szSendText, int nMode
//
//        = 0);
    int AU3_ControlSetText(WString szTitle, WString szText, WString szControl, WString szControlText);

    int AU3_ControlSetTextByHandle(HWND hWnd, HWND hCtrl, WString szControlText);

    int AU3_ControlShow(WString szTitle, WString szText, WString szControl);

    int AU3_ControlShowByHandle(HWND hWnd, HWND hCtrl);

    void AU3_ControlTreeView(WString szTitle, WString szText, WString szControl, WString szCommand, WString szExtra1, WString szExtra2, LPWSTR szResult, int nBufSize);

    void AU3_ControlTreeViewByHandle(HWND hWnd, HWND hCtrl, WString szCommand, WString szExtra1, WString szExtra2, LPWSTR szResult, int nBufSize);

    void AU3_DriveMapAdd(WString szDevice, WString szShare, int nFlags, /*[in,defaultvalue("")]*/ WString szUser, /*[in,defaultvalue("")]*/ WString szPwd, LPWSTR szResult, int nBufSize);

    int AU3_DriveMapDel(WString szDevice);

    void AU3_DriveMapGet(WString szDevice, LPWSTR szMapping, int nBufSize);

    int AU3_IsAdmin();

//        int AU3_MouseClick(/*[in,defaultvalue("LEFT")]*/WString szButton, int nX
//        = AU3_INTDEFAULT, int nY = AU3_INTDEFAULT, int nClicks = 1, int nSpeed = -1
//
//        );
//        int AU3_MouseClickDrag(WString szButton, int nX1, int nY1, int nX2, int nY2, int nSpeed
//        = -1);
    void AU3_MouseDown(/*[in,defaultvalue("LEFT")]*/WString szButton);

    int AU3_MouseGetCursor();

//        void AU3_MouseGetPos(Pointer lpPoint);
//
//        int AU3_MouseMove(int nX, int nY, int nSpeed
//
//        = -1);
    void AU3_MouseUp(/*[in,defaultvalue("LEFT")]*/WString szButton);

    void AU3_MouseWheel(WString szDirection, int nClicks);

    int AU3_Opt(WString szOption, int nValue);

//        unsigned
//
//        int AU3_PixelChecksum(RECT lpRect, int nStep
//
//        = 1);
    int AU3_PixelGetColor(int nX, int nY);

    void AU3_PixelSearch(RECT lpRect, int nCol, /*default 0*/ int nVar, /*default 1*/ int nStep, Pointer pPointResult);

    int AU3_ProcessClose(WString szProcess);

    int AU3_ProcessExists(WString szProcess);

    int AU3_ProcessSetPriority(WString szProcess, int nPriority);

//        int AU3_ProcessWait(WString szProcess, int nTimeout
//
//        = 0);
//        int AU3_ProcessWaitClose(WString szProcess, int nTimeout
//
//        = 0);
//
//        int AU3_Run(WString szProgram, /*[in,defaultvalue("")]*/ WString szDir, int nShowFlag
//
//        = SW_SHOWNORMAL);
//        int AU3_RunWait(WString szProgram, /*[in,defaultvalue("")]*/ WString szDir, int nShowFlag
//
//        = SW_SHOWNORMAL);
//        int AU3_RunAs(WString szUser, WString szDomain, WString szPassword, int nLogonFlag, WString szProgram, /*[in,defaultvalue("")]*/ WString szDir, int nShowFlag
//
//        = SW_SHOWNORMAL);
//        int AU3_RunAsWait(WString szUser, WString szDomain, WString szPassword, int nLogonFlag, WString szProgram, /*[in,defaultvalue("")]*/ WString szDir, int nShowFlag
//
//        = SW_SHOWNORMAL);
//
//        void AU3_Send(WString szSendText, int nMode
//
//        = 0);
    int AU3_Shutdown(int nFlags);

    void AU3_Sleep(int nMilliseconds);

    int AU3_StatusbarGetText(WString szTitle, /*[in,defaultvalue("")]*/ WString szText, /*[in,defaultvalue(1)]*/ int nPart, LPWSTR szStatusText, int nBufSize);

    int AU3_StatusbarGetTextByHandle(HWND hWnd, /*[in,defaultvalue(1)]*/ int nPart, LPWSTR szStatusText, int nBufSize);

//        void AU3_ToolTip(WString szTip, int nX
//        = AU3_INTDEFAULT, int nY = AU3_INTDEFAULT
//
//        );
    int AU3_WinActivate(WString szTitle, /*[in,defaultvalue("")]*/ WString szText);

    int AU3_WinActivateByHandle(HWND hWnd);

    int AU3_WinActive(WString szTitle, /*[in,defaultvalue("")]*/ WString szText);

    int AU3_WinActiveByHandle(HWND hWnd);

    int AU3_WinClose(String szTitle, /*[in,defaultvalue("")]*/ String szText);

    int AU3_WinCloseByHandle(HWND hWnd);

    int AU3_WinExists(WString szTitle, /*[in,defaultvalue("")]*/ WString szText);

    int AU3_WinExistsByHandle(HWND hWnd);

    int AU3_WinGetCaretPos(Pointer lpPoint);

    void AU3_WinGetClassList(WString szTitle, /*[in,defaultvalue("")]*/ WString szText, LPWSTR szRetText, int nBufSize);

    void AU3_WinGetClassListByHandle(HWND hWnd, LPWSTR szRetText, int nBufSize);

    int AU3_WinGetClientSize(WString szTitle, /*[in,defaultvalue("")]*/ WString szText, RECT lpRect);

    int AU3_WinGetClientSizeByHandle(HWND hWnd, RECT lpRect);

    HWND AU3_WinGetHandle(WString szTitle, /*[in,defaultvalue("")]*/ WString szText);

    void AU3_WinGetHandleAsText(WString szTitle, /*[in,defaultvalue("")]*/ WString szText, LPWSTR szRetText, int nBufSize);

    int AU3_WinGetPos(WString szTitle, /*[in,defaultvalue("")]*/ WString szText, RECT lpRect);

    int AU3_WinGetPosByHandle(HWND hWnd, RECT lpRect);

    DWORD AU3_WinGetProcess(WString szTitle, /*[in,defaultvalue("")]*/ WString szText);

    DWORD AU3_WinGetProcessByHandle(HWND hWnd);

    int AU3_WinGetState(WString szTitle, /*[in,defaultvalue("")]*/ WString szText);

    int AU3_WinGetStateByHandle(HWND hWnd);

    void AU3_WinGetText(WString szTitle, /*[in,defaultvalue("")]*/ WString szText, LPWSTR szRetText, int nBufSize);

    void AU3_WinGetTextByHandle(HWND hWnd, LPWSTR szRetText, int nBufSize);

    void AU3_WinGetTitle(WString szTitle, /*[in,defaultvalue("")]*/ WString szText, LPWSTR szRetText, int nBufSize);

    void AU3_WinGetTitleByHandle(HWND hWnd, LPWSTR szRetText, int nBufSize);

    int AU3_WinKill(WString szTitle, /*[in,defaultvalue("")]*/ WString szText);

    int AU3_WinKillByHandle(HWND hWnd);

    int AU3_WinMenuSelectItem(WString szTitle, /*[in,defaultvalue("")]*/ WString szText, WString szItem1, WString szItem2, WString szItem3, WString szItem4, WString szItem5, WString szItem6, WString szItem7, WString szItem8);

    int AU3_WinMenuSelectItemByHandle(HWND hWnd, WString szItem1, WString szItem2, WString szItem3, WString szItem4, WString szItem5, WString szItem6, WString szItem7, WString szItem8);

//        void AU3_WinMinimizeAll();
//
//        void AU3_WinMinimizeAllUndo();
//
//        int AU3_WinMove(WString szTitle, /*[in,defaultvalue("")]*/ WString szText, int nX, int nY, int nWidth
//        = -1, int nHeight = -1
//
//        );
//        int AU3_WinMoveByHandle(HWND hWnd, int nX, int nY, int nWidth, int nHeight = -1
//
//        );
    int AU3_WinSetOnTop(WString szTitle, /*[in,defaultvalue("")]*/ WString szText, int nFlag);

    int AU3_WinSetOnTopByHandle(HWND hWnd, int nFlag);

    int AU3_WinSetState(WString szTitle, /*[in,defaultvalue("")]*/ WString szText, int nFlags);

    int AU3_WinSetStateByHandle(HWND hWnd, int nFlags);

    int AU3_WinSetTitle(WString szTitle, WString szTitledefaultvalue, WString szText, WString szNewTitle);

    default int AU3_WinSetTitle(WString szTitle, WString szText, WString szNewTitle) {

        return AU3_WinSetTitle(szTitle, null, szText, szNewTitle);
    }

    int AU3_WinSetTitleByHandle(HWND hWnd, WString szNewTitle);

    int AU3_WinSetTrans(WString szTitle, /*[in,defaultvalue("")]*/ WString szText, int nTrans);

    int AU3_WinSetTransByHandle(HWND hWnd, int nTrans);

//        int AU3_WinWait(WString szTitle, /*[in,defaultvalue("")]*/ WString szText, int nTimeout);
//
//        = 0);
//        int AU3_WinWaitByHandle(HWND hWnd, int nTimeout);
//
//        int AU3_WinWaitActive(WString szTitle, /*[in,defaultvalue("")]*/ WString szText, int nTimeout);
//
//        = 0);
//        int AU3_WinWaitActiveByHandle(HWND hWnd, int nTimeout);
//
//        int AU3_WinWaitClose(WString szTitle, /*[in,defaultvalue("")]*/ WString szText, int nTimeout);
//
//        = 0);
    int AU3_WinWaitCloseByHandle(HWND hWnd, int nTimeout);

    int AU3_WinWaitNotActive(WString szTitle, /*[in,defaultvalue("")]*/ WString szText, int nTimeout);
}


