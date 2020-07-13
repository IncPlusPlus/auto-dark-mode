package com.github.weisj.darkmode.platform;

import com.intellij.openapi.util.SystemInfo;
import com.intellij.util.SystemProperties;

public final class LibraryUtil {

    public static final String jreArchitecture = System.getProperty("sun.arch.data.model");
    public static final String userHomeDirectory = SystemProperties.getUserHome();
    public static final boolean isX86;
    public static final boolean isX64;
    public static final boolean undefinedArchitecture;
    public static final String X86 = "32";
    public static final String X64 = "64";
    public static boolean isWin10OrNewer = SystemInfo.isWin10OrNewer;
    public static boolean isMacOSMojave = SystemInfo.isMacOSMojave;
    public static boolean isMacOSCatalina = SystemInfo.isMacOSCatalina;
    public static boolean isGnome = SystemInfo.isGNOME;

    static {
        isX64 = X64.equals(jreArchitecture);
        isX86 = X86.equals(jreArchitecture);
        undefinedArchitecture = !isX64 && !isX86;
    }
}
