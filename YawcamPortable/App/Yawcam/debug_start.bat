Regedit /e /a %temp%\ddesktopreg.txt "HKEY_CURRENT_USER\Software\Microsoft\Windows\CurrentVersion\Explorer\Shell Folders"
find /i %temp%\ddesktopreg.txt "Desktop" >%temp%\desktopreg.txt
For /F "tokens=2 delims==" %%a in (%temp%\desktopreg.txt) do set desktopfolder=%%a
DEL %temp%\ddesktopreg.txt
DEL %temp%\desktopreg.txt
java.exe -cp .;lib/activation.jar;lib/commons-jxpath-1.1.jar;lib/commons-logging.jar;lib/commons-logging-api.jar;lib/dsj.jar;lib/monte-cc.jar;lib/mail.jar;lib/mx4j-impl.jar;lib/mx4j-jmx.jar;lib/mx4j-remote.jar;lib/mx4j-tools.jar;lib/sbbi-jmx-1.0.jar;lib/sbbi-upnplib-1.0.4.jar;lib/ftp4j.jar;lib/commons-codec-1.4.jar;lib/turbojpeg.jar -Djava.net.preferIPv4Stack=true -splash:img/splash.gif yawcam.Main > %desktopfolder%\yawcam_debug_log.txt 2>&1