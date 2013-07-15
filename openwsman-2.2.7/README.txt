
Folder Contents :

	1.openwsman-2.2.7     : Modified openwsman-2.2.7 for creating dll on Windows .
	2.OpenwsJarTest       : Eclipse Project to Test openwsclient jar.
	3.dlls 				  : Copy the contents of dll to following
							C:\Windows\System32  If your system has 32 bit os
							OR
							C:\Windows\SysWOW64  If your system has 64 bit os

							
################################## Quick Jar Test SET-UP ####################################

To Quick Test :
			
 Import OpenwsJarTest as existing project in Eclipse.
 
		1. If you have 64 bit jdk installed then copy openwsman-2.2.7\bindings\out\x64\openwsmanclient.jar 
		    to OpenwsJarTest\lib folder.
		  OR
		   If you have 32 bit jdk installed then copy openwsman-2.2.7\bindings\out\win32\openwsmanclient.jar 
		    to OpenwsJarTest\lib folder.
		  
		2. Open identify.java modify the username password and IP,Port , then run.
			
		

Output should be :
				<?xml version="1.0"?>
				<s:Envelope xmlns:s="http://www.w3.org/2003/05/soap-envelope" xmlns:wsmid="http:
				//schemas.dmtf.org/wbem/wsman/identity/1/wsmanidentity.xsd">
				  <s:Header/>
				  <s:Body>
					<wsmid:Identify/>
				  </s:Body>
				</s:Envelope>
				
				ProtocolVersion: http://schemas.dmtf.org/wbem/wsman/1/wsman.xsd
				ProductVendor: Microsoft Corporation
				ProductVersion: OS: 6.2.9200 SP: 0.0 Stack: 3.0
					
		
			
############################### For Full SET-UP #######################################

Download links and Setting Environment variables:
				
	1.	Openssl :	http://slproweb.com/download/Win32OpenSSL-1_0_1e.exe
		Install and Set Environment Variable : OPENSSL_HOME - C:\OpenSSL-Win32 
	
	2.  libcurl : http://curl.haxx.se/download/libcurl-7.19.3-win32-ssl-msvc.zip	
		Extract and Set Environment Variable : LIBCURL_HOME - C:\libcurl
		
	3. 	A. http://sourceforge.net/projects/gnuwin32/files/libiconv/1.9.2-1/libiconv-1.9.2-1.exe/download
		B. http://sourceforge.net/projects/gnuwin32/files/zlib/1.2.3/zlib-1.2.3.exe/download
		
		Note : We have downloaded libxml2 from http://xmlsoft.org/sources/win32/libxml2-2.7.8.win32.zip 
				and kept as part of openwsman.	
		File A and B will be installed in like " C:\Program Files (x86)\GnuWin32"
		Open folder C:\Program Files\GnuWin32\lib rename libiconv.lib to iconv.lib in 
		
		Set Environment Variable OPENWS_GNU  :  C:\Program Files (x86)\GnuWin32
	
	4.	Set Environment Variable JAVA_HOME   : 	C:\Program Files (x86)\Java\jdk1.6.0_25 (JAVA Installation DIR)
			Add "C:\Program Files (x86)\Java\jdk1.6.0_25\bin;" to System Path
			
	5. 	Set Environment Variable OPENWS_BASE :  D:\Openwsbase (Should Contain openwsman-2.2.7)
	
	6.  SWIG Download Link : http://citylan.dl.sourceforge.net/project/swig/swigwin/swigwin-2.0.10/swigwin-2.0.10.zip
			Extract the swigwin-2.0.10.zip to "C:\Program Files (x86)\"
			Add to System Path "C:\Program Files (x86)\swigwin-2.0.10;"
		
							 
								
		
######################################################################

SWIG Tool :It will generate openwsman_wrap.c and java client supporting files.

			> cd openwsman-2.2.7\
			> swigbuild.bat

######################################################################
Building dll : 
			
			1. Open OpenWsmanLib.sln in Visual Studio
			2. For 64 bit:
						Select Project -> Properties -> Configuration Manager ( Top Right ) -> Active solution platform ( Select x64 ) -> close -> Apply 
						Build the project. It will generate wsmanclient.dll in "openwsman-2.2.7\bindings\out\x64" .
			   For 32 bit:
						Select Project -> Properties -> Configuration Manager ( Top Right ) -> Active solution platform ( Select Win32 ) -> close -> Apply 
						Build the project .	It will generate wsmanclient.dll in "openwsman-2.2.7\bindings\out\win32" .	
						
		
	
######################################################################

Building Jar and Javadoc : It will use the swig generated java files and dll to generate openwsmanclient.jar

	1. > cd openwsman-2.2.7\
	2.  For 64 bit:
			> jarbuild.bat 
			 Jar file will be created as openwsman-2.2.7\bindings\out\x64\openwsmanclient.jar
		For 32 bit:
			> jarbuild.bat 32
			 Jar file will be created as openwsman-2.2.7\bindings\out\win32\openwsmanclient.jar

	4. It will also generate javadoc in dir openwsman-2.2.7\bindings\out for openwsmanclient.jar

######################################################################	

Testing Jar :

	1. Open "OpenwsJarTest" as existing project in Eclipse.
	2. For 64 bit :
			Copy openwsman-2.2.7\bindings\out\x64\openwsmanclient.jar to OpenwsJarTest->lib folder
	   For 32 bit :
			Copy openwsman-2.2.7\bindings\out\win32\openwsmanclient.jar to OpenwsJarTest->lib folder
			
	3. Run identify.java ,cim_enumerate_registered_profiles.java or others to test.
		Please modify the Authentication property in these files
	
	
#######################################################################


	

	