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
package org.robovm.apple.uikit;

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
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coredata.*;
import org.robovm.apple.coreimage.*;
import org.robovm.apple.coretext.*;
import org.robovm.apple.corelocation.*;
import org.robovm.apple.cloudkit.*;
import org.robovm.apple.fileprovider.*;
import org.robovm.apple.intents.*;
import org.robovm.apple.usernotifications.*;
import org.robovm.apple.linkpresentation.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 15.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("UIKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NSTextContentStorage/*</name>*/ 
    extends /*<extends>*/NSTextContentManager/*</extends>*/ 
    /*<implements>*/implements NSTextStorageObserving/*</implements>*/ {

    /*<ptr>*/public static class NSTextContentStoragePtr extends Ptr<NSTextContentStorage, NSTextContentStoragePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NSTextContentStorage.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public NSTextContentStorage() {}
    protected NSTextContentStorage(Handle h, long handle) { super(h, handle); }
    protected NSTextContentStorage(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCoder:")
    public NSTextContentStorage(NSCoder coder) { super(coder); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "delegate")
    public native NSTextContentStorageDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(NSTextContentStorageDelegate v);
    @Property(selector = "attributedString")
    public native NSAttributedString getAttributedString();
    @Property(selector = "setAttributedString:")
    public native void setAttributedString(NSAttributedString v);
    @Property(selector = "textStorage")
    public native NSTextStorage getTextStorage();
    @Property(selector = "setTextStorage:")
    public native void setTextStorage(NSTextStorage v);
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Library("UIKit")
    public static class Notifications {
        static { Bro.bind(Notifications.class); }

        /**
         * @since Available in iOS 15.0 and later.
         */
        @GlobalValue(symbol="NSTextContentStorageUnsupportedAttributeAddedNotification", optional=true)
        public static native String UnsupportedAttributeAdded();
    }
    
    @Method(selector = "attributedStringForTextElement:")
    public native NSAttributedString attributedStringForTextElement(NSTextElement textElement);
    @Method(selector = "textElementForAttributedString:")
    public native NSTextElement textElementForAttributedString(NSAttributedString attributedString);
    @Method(selector = "locationFromLocation:withOffset:")
    public native NSTextLocation locationFromLocation(NSTextLocation location, @MachineSizedSInt long offset);
    @Method(selector = "offsetFromLocation:toLocation:")
    public native @MachineSizedSInt long offsetFromLocation(NSTextLocation from, NSTextLocation to);
    @Method(selector = "adjustedRangeFromRange:forEditingTextSelection:")
    public native NSTextRange adjustedRangeFromRange(NSTextRange textRange, boolean forEditingTextSelection);
    @Method(selector = "processEditingForTextStorage:edited:range:changeInLength:invalidatedRange:")
    public native void processEditingForTextStorage(NSTextStorage textStorage, NSTextStorageEditActions editMask, @ByVal NSRange newCharRange, @MachineSizedSInt long delta, @ByVal NSRange invalidatedCharRange);
    @Method(selector = "performEditingTransactionForTextStorage:usingBlock:")
    public native void performEditingTransactionForTextStorage(NSTextStorage textStorage, @Block Runnable transaction);
    /*</methods>*/
}
