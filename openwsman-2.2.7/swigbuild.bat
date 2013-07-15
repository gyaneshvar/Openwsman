set curr_dir=%cd%
chdir /D %OPENWS_BASE%\openwsman-2.2.7\bindings
rmdir /s /q "out" 
mkdir out
mkdir out\gen-src
mkdir out\win32
mkdir out\x64
mkdir out\classes
mkdir out\gen-src\org
mkdir out\gen-src\org\openwsman
swig  -outdir "out\gen-src\org\openwsman" -package org.openwsman -o ..\openwsman_wrap.c -java openwsman.i
chdir /D %curr_dir%

