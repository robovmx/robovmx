/*
 * Copyright (C) 2013-2015 RoboVM AB
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
package org.robovm.apple.phase;

/*<imports>*/
import java.io.*;
import java.nio.*;
import java.util.*;
import org.robovm.objc.*;
import org.robovm.objc.annotation.*;
import org.robovm.objc.block.*;
import org.robovm.rt.*;
import org.robovm.rt.annotation.*;
import org.robovm.rt.bro.*;
import org.robovm.rt.bro.annotation.*;
import org.robovm.rt.bro.ptr.*;
import org.robovm.apple.foundation.*;
import org.robovm.apple.coreaudio.*;
import org.robovm.apple.avfoundation.*;
import org.robovm.apple.modelio.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 15.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("PHASE") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/PHASECardioidDirectivityModelSubbandParameters/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class PHASECardioidDirectivityModelSubbandParametersPtr extends Ptr<PHASECardioidDirectivityModelSubbandParameters, PHASECardioidDirectivityModelSubbandParametersPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(PHASECardioidDirectivityModelSubbandParameters.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public PHASECardioidDirectivityModelSubbandParameters() {}
    protected PHASECardioidDirectivityModelSubbandParameters(Handle h, long handle) { super(h, handle); }
    protected PHASECardioidDirectivityModelSubbandParameters(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "frequency")
    public native double getFrequency();
    @Property(selector = "setFrequency:")
    public native void setFrequency(double v);
    @Property(selector = "pattern")
    public native double getPattern();
    @Property(selector = "setPattern:")
    public native void setPattern(double v);
    @Property(selector = "sharpness")
    public native double getSharpness();
    @Property(selector = "setSharpness:")
    public native void setSharpness(double v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
