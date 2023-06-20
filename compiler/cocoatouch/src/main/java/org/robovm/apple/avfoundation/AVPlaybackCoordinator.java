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
package org.robovm.apple.avfoundation;

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
import org.robovm.apple.corefoundation.*;
import org.robovm.apple.dispatch.*;
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.coreimage.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coreaudio.*;
import org.robovm.apple.coremedia.*;
import org.robovm.apple.corevideo.*;
import org.robovm.apple.mediatoolbox.*;
import org.robovm.apple.audiotoolbox.*;
import org.robovm.apple.coremidi.*;
import org.robovm.apple.uikit.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 15.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("AVFoundation") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AVPlaybackCoordinator/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class AVPlaybackCoordinatorPtr extends Ptr<AVPlaybackCoordinator, AVPlaybackCoordinatorPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(AVPlaybackCoordinator.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected AVPlaybackCoordinator() {}
    protected AVPlaybackCoordinator(Handle h, long handle) { super(h, handle); }
    protected AVPlaybackCoordinator(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "otherParticipants")
    public native NSArray<AVCoordinatedPlaybackParticipant> getOtherParticipants();
    @Property(selector = "suspensionReasons")
    public native NSArray<NSString> getSuspensionReasons();
    @Property(selector = "suspensionReasonsThatTriggerWaiting")
    public native NSArray<NSString> getSuspensionReasonsThatTriggerWaiting();
    @Property(selector = "setSuspensionReasonsThatTriggerWaiting:")
    public native void setSuspensionReasonsThatTriggerWaiting(NSArray<NSString> v);
    @Property(selector = "pauseSnapsToMediaTimeOfOriginator")
    public native boolean isPauseSnapsToMediaTimeOfOriginator();
    @Property(selector = "setPauseSnapsToMediaTimeOfOriginator:")
    public native void setPauseSnapsToMediaTimeOfOriginator(boolean v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Library("AVFoundation")
    public static class Notifications {
        static { Bro.bind(Notifications.class); }

        /**
         * @since Available in iOS 15.0 and later.
         */
        @GlobalValue(symbol="AVPlaybackCoordinatorOtherParticipantsDidChangeNotification", optional=true)
        public static native NSString OtherParticipantsDidChange();
        /**
         * @since Available in iOS 15.0 and later.
         */
        @GlobalValue(symbol="AVPlaybackCoordinatorSuspensionReasonsDidChangeNotification", optional=true)
        public static native NSString SuspensionReasonsDidChange();
    }
    
    @Method(selector = "beginSuspensionForReason:")
    public native AVCoordinatedPlaybackSuspension beginSuspensionForReason(AVCoordinatedPlaybackSuspensionReason suspensionReason);
    @Method(selector = "expectedItemTimeAtHostTime:")
    public native @ByVal CMTime expectedItemTimeAtHostTime(@ByVal CMTime hostClockTime);
    @Method(selector = "setParticipantLimit:forWaitingOutSuspensionsWithReason:")
    public native void setParticipantLimitForWaitingOutSuspensions(@MachineSizedSInt long participantLimit, AVCoordinatedPlaybackSuspensionReason reason);
    @Method(selector = "participantLimitForWaitingOutSuspensionsWithReason:")
    public native @MachineSizedSInt long getParticipantLimitForWaitingOutSuspensions(AVCoordinatedPlaybackSuspensionReason reason);
    /*</methods>*/
}
