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
package org.robovm.apple.gamecontroller;

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
import org.robovm.apple.dispatch.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.corehaptic.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GCLinearInputAdapter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements GCLinearInput/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*/
    @NotImplemented("valueDidChangeHandler")
    public @Block VoidBlock3<GCPhysicalInputElement, GCLinearInput, Float> getValueDidChangeHandler() { return null; }
    @NotImplemented("setValueDidChangeHandler:")
    public void setValueDidChangeHandler(@Block VoidBlock3<GCPhysicalInputElement, GCLinearInput, Float> v) {}
    @NotImplemented("value")
    public float getValue() { return 0; }
    @NotImplemented("isAnalog")
    public boolean isAnalog() { return false; }
    @NotImplemented("canWrap")
    public boolean canWrap() { return false; }
    @NotImplemented("lastValueTimestamp")
    public double getLastValueTimestamp() { return 0; }
    @NotImplemented("lastValueLatency")
    public double getLastValueLatency() { return 0; }
    /**
     * @since Available in iOS 17.0 and later.
     */
    @NotImplemented("sources")
    public NSSet<?> getSources() { return null; }
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
