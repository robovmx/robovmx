package org.robovm.compiler.namespace;

/**
 * Specifies generic brand titles and names which can be in case of need (e.x. custom test builds)
 *
 * @author dkimitsa
 */
public final class RoboVmDefines {
    private RoboVmDefines() {
    }

    /**
     * Title that to be used everywhere applicable (menu text etc)
     */
    public final static String RoboVM = "RoboVMx";

    /**
     * Home directory name where robovm related files and cache to be located
     */
    public final static String BaseDirName = ".robovmx";

    /**
     * SDK directory
     */
    public final static String SdkDirName = ".robovmx-sdks";

    /**
     * name of build dir
     */
    public final static String BuildDirName = "robovmx-build";
}
