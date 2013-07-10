set curr_dir=%cd%
chdir /D %OPENWS_BASE%\openwsman-2.2.7\bindings
mkdir out\classes
javadoc -d out\javadoc  -sourcepath out\gen-src -subpackages org.openwsman
javac -d out\classes out\gen-src\org\openwsman\*.java
chdir /D out\classes
jar cf ..\openwsmanclient.jar .\*
chdir /D %curr_dir%