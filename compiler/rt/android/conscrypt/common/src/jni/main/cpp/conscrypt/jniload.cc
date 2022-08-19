/*
 * Copyright (C) 2017 The Android Open Source Project
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

#include <jni.h>

#include <conscrypt/compatibility_close_monitor.h>
#include <conscrypt/jniutil.h>
#include <conscrypt/logging.h>
#include <conscrypt/native_crypto.h>

#ifndef CONSCRYPT_JNI_VERSION
#define CONSCRYPT_JNI_VERSION JNI_VERSION_1_6
#endif  // !CONSCRYPT_JNI_VERSION

using conscrypt::CompatibilityCloseMonitor;
using conscrypt::NativeCrypto;

// RoboVM note: JNI_OnLoad() is not supported with static JNI. The NativeCrypto Java class has been changed to call a native method named onload() instead.
extern "C" void Java_com_android_org_conscrypt_NativeCrypto_onload(JNIEnv* env, jclass) {
    JavaVM* vm;
    env->GetJavaVM(&vm);

    // Initialize the JNI constants.
    conscrypt::jniutil::init(vm, env);

// RoboVM note: no need in registration as using fully qualified names
//    // Register all of the native JNI methods.
//    NativeCrypto::registerNativeMethods(env);

    // Perform static initialization of the close monitor (if required on this platform).
    CompatibilityCloseMonitor::init();
}

// RoboVM note: commented out as not used
//#ifdef STATIC_LIB
//
//// A version of OnLoad called when the Conscrypt library has been statically linked to the JVM (For
//// Java >= 1.8). The manner in which the library is statically linked is implementation specific.
////
//// See http://openjdk.java.net/jeps/178
//CONSCRYPT_PUBLIC jint JNI_OnLoad_conscrypt(JavaVM* vm, void* reserved) {
//    return libconscrypt_JNI_OnLoad(vm, reserved);
//}
//
//#else  // !STATIC_LIB
//
//// Method called by the JVM when the Conscrypt shared library is loaded.
//CONSCRYPT_PUBLIC jint JNICALL JNI_OnLoad(JavaVM* vm, void* reserved) {
//    return libconscrypt_JNI_OnLoad(vm, reserved);
//}
//
//#endif  // !STATIC_LIB