package org.robovm.compiler.branding;

/**
 * Specifies generic brand titles and names which can be in case of need (e.x. custom test builds)
 *
 * @author dkimitsa
 */
public final class Brand {
    private Brand() {
    }

    /**
     * Title that to be used everywhere applicable (menu text etc)
     */
    public final static String RoboVM = "RoboVMx";

    /**
     * Home directory name where robovm related files and cache to be located
     */
    public final static String HomeDir = ".robovmx";

    /**
     * SDK directory
     */
    public final static String SdkDir = ".robovmx-sdks";

    /**
     * name of build dir
     */
    public final static String BuildDir = "robovmx-build";
}
