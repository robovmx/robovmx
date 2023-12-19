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
package org.robovm.apple.cinematic;

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
import org.robovm.apple.avfoundation.*;
import org.robovm.apple.coremedia.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.corevideo.*;
import org.robovm.apple.metal.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 17.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Cinematic") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CNCustomDetectionTrack/*</name>*/ 
    extends /*<extends>*/CNDetectionTrack/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CNCustomDetectionTrackPtr extends Ptr<CNCustomDetectionTrack, CNCustomDetectionTrackPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CNCustomDetectionTrack.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected CNCustomDetectionTrack() {}
    protected CNCustomDetectionTrack(Handle h, long handle) { super(h, handle); }
    protected CNCustomDetectionTrack(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithDetections:smooth:")
    public CNCustomDetectionTrack(NSArray<CNDetection> detections, boolean applySmoothing) { super((SkipInit) null); initObject(init(detections, applySmoothing)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "allDetections")
    public native NSArray<CNDetection> getAllDetections();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithDetections:smooth:")
    protected native @Pointer long init(NSArray<CNDetection> detections, boolean applySmoothing);
    /*</methods>*/
}
