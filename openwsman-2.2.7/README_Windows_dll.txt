######################################################################

Download links and Setting Environment variables:
				
	1.	Openssl :	http://slproweb.com/download/Win32OpenSSL-1_0_1e.exe
		Install and Set Environment Variable : OPENSSL_HOME - C:\OpenSSL-Win32 
	
	2.  libcurl : http://curl.haxx.se/download/libcurl-7.19.3-win32-ssl-msvc.zip	
		Extract and Set Environment Variable : LIBCURL_HOME - C:\OpenSSL-Win32  
		
	3. 	A. http://sourceforge.net/projects/gnuwin32/files/libiconv/1.9.2-1/libiconv-1.9.2-1.exe/download
		B. http://sourceforge.net/projects/gnuwin32/files/zlib/1.2.3/zlib-1.2.3.exe/download
		Note : We have downloaded libxml2 from http://xmlsoft.org/sources/win32/libxml2-2.7.8.win32.zip 
				and kept as part of openwsman.	
		File A and B will be installed in like " C:\Program Files (x86)\GnuWin32"
		
		Set Environment Variable OPENWS_GNU  :  C:\Program Files (x86)\GnuWin32
	
	4.	Set Environment Variable JAVA_HOME   : 	C:\Program Files (x86)\Java\jdk1.6.0_25
	5. 	Set Environment Variable OPENWS_BASE :  D:\Openwsbase ( Should Contain openwsman-2.2.7)
	
	
	
Building dll : 

	1. Open OpenWsmanLib.sln in Visual Studio 
	2. Build will generate wsman.dll in "OPENWS_BASE"

Building Jar :

	1. Open project Openwscreatejar in to Eclipse
	2. Copy wsman.dll to src folder
	3. Export as Jar file openwsman.jar.
	
Testing Jar :

	1. Open as existing progect "OpenwsJarTest" in Eclipse.
	2. Copy openwsman.jar to OpenwsJarTest->lib folder
	3. Run identify.java ,cim_enumerate_registered_profiles.java or others to test.Please modify the Authentication property in these files
	
	


	