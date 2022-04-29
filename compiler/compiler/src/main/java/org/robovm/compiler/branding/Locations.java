package org.robovm.compiler.branding;

import org.robovm.compiler.Version;

import java.io.File;

/**
 * Default locations for RoboVM entities such as cache/sdk etc
 * @author dkimitsa
 */
public final class Locations {
    private Locations() {}

    public final static File UserHome = new File(System.getProperty("user.home"));
    public final static File SdkHomeBase = new File(UserHome, Brand.SdkDir);
    public final static File SdkHome = new File(SdkHomeBase,"robovm-" + Version.getCompilerVersion());
    public final static File Home = new File(UserHome, Brand.HomeDir);
    public final static File Cache = new File(Home, "cache");

    public static File inHomeDir(String fileName) {
        return new File(Home, fileName);
    }

    public static File buildDir(File moduleDir) {
        return new File(moduleDir, Brand.BuildDir);
    }

    public static File inBuildDir(File moduleDir, String subDir) {
        return new File(buildDir(moduleDir), subDir);
    }
}
