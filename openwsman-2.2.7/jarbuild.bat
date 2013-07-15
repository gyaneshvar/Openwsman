echo off

set arg1=%1
echo %arg1%
set curr_dir=%cd%
chdir /D %OPENWS_BASE%\openwsman-2.2.7\bindings
mkdir out\classes
javadoc -d out\javadoc  -sourcepath out\gen-src -subpackages org.openwsman
javac -d out\classes out\gen-src\org\openwsman\*.java
chdir /D out\classes
echo 
echo 
if "%1" =="" (
echo "### DEFAULT IT WILL CREATING 64 BIT  JAR ###"
echo "### TO CREATE 32 BIT OUTPUT JAR PLEASE USE COMMAND "jarbuild.bat 32"###"
echo "### Creating Jar for 64 bit jvm "###"
xcopy /b/v/y ..\x64\*.dll .
jar cf ..\x64\openwsmanclient.jar .\* 
chdir /D %curr_dir%
exit /b
)

echo "### Creating Jar for 32 bit jvm ###"
xcopy /b/v/y ..\win32\*.dll .
jar cf ..\win32\openwsmanclient.jar .\* 
chdir /D %curr_dir%
exit /b


