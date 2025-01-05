This is a demonstation hello world WebObjects application showing it is now possible to build a WOApp very simply. To build this application, all you need to do is

Step 0 (you only need to do this once to install webobjects in your local maven repo, then it is no longer necessary. Once this step is complete, redoing this step will just reprint the license info and paths, so it is not wasteful if you include it in part of a build script.)

* mvn io.github.wocommunity:woinstall-maven-plugin:woinstall

The other steps,

* git clone https://github.com/nullterminated/SimpleWOApp.git
* cd SimpleWOApp
* mvn clean package
* cd target/SimpleWOApp-1.0.0-SNAPSHOT.woa/
* export NEXT_ROOT=/;./SimpleWOApp

This will build and launch the SimpleWOApp.
