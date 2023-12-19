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
package org.robovm.apple.foundation;

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
import org.robovm.apple.corefoundation.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.coretext.*;
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.coredata.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coremedia.*;
import org.robovm.apple.security.*;
import org.robovm.apple.dispatch.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 17.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Foundation") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NSTermOfAddress/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class NSTermOfAddressPtr extends Ptr<NSTermOfAddress, NSTermOfAddressPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NSTermOfAddress.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected NSTermOfAddress() {}
    protected NSTermOfAddress(Handle h, long handle) { super(h, handle); }
    protected NSTermOfAddress(SkipInit skipInit) { super(skipInit); }
    public NSTermOfAddress(String language, NSArray<NSMorphologyPronoun> pronouns) { super((Handle) null, create(language, pronouns)); retain(getHandle()); }
    @Method(selector = "initWithCoder:")
    public NSTermOfAddress(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "languageIdentifier")
    public native String getLanguageIdentifier();
    @Property(selector = "pronouns")
    public native NSArray<NSMorphologyPronoun> getPronouns();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "neutral")
    public static native NSTermOfAddress neutral();
    @Method(selector = "feminine")
    public static native NSTermOfAddress feminine();
    @Method(selector = "masculine")
    public static native NSTermOfAddress masculine();
    @Method(selector = "localizedForLanguageIdentifier:withPronouns:")
    protected static native @Pointer long create(String language, NSArray<NSMorphologyPronoun> pronouns);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    /*</methods>*/
}
