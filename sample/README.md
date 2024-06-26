# WebRTC KMP sample app

Demo application for WebRTC KMP.

## Build and start

```bash
git clone https://github.com/shepeliev/webrtc-kmp.git
cd webrtc-kmp
```

### Android

Run Android emulator or connect real device.

```bash
./gradlew installDebug
```

### iOS

Open `sample/iosApp/iosApp.xcodeproj` in XCode build and run

### Web JS

```bash
./gradlew sample:composeApp:jsBrowserRun 
```

### Web WasmJS

```bash
./gradlew sample:composeApp:wasmJsBrowserRun 
```

### JVM Desktop

```bash
./gradlew ":sample:composeApp:run" -DmainClass="MainKt" --quiet
```