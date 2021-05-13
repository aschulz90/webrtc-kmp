package com.shepeliev.webrtckmp

import org.webrtc.IceCandidate as NativeIceCandidate

actual class IceCandidate internal constructor(val native: NativeIceCandidate) {
    actual val sdpMid: String = native.sdpMid
    actual val sdpMLineIndex: Int = native.sdpMLineIndex
    actual val candidate: String = native.sdp

    actual override fun toString(): String = native.toString()
}
