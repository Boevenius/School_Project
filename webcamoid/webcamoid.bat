@echo off

rem Default values: desktop | angle | software
rem set QT_OPENGL=angle

rem Default values: d3d11 | d3d9 | warp
rem set QT_ANGLE_PLATFORM=d3d11

rem Default values: software | d3d12 | openvg
rem set QT_QUICK_BACKEND=""

rem Enable plugin debugging
rem set QT_DEBUG_PLUGINS=1

start /b "" "%~dp0bin\webcamoid" -p "%~dp0lib\avkys" -q "%~dp0share\qt5\qml" -c "%~dp0share\config"
