# FidesmoOSX
Build environment for working with JavaCard for Fidesmo / VivoKey on OS X Using intelliJ IDE

Should also work under windows as long as you change paths in the build.properties file.

Contains both JCard kit 2.2.2 and 3.0.4 for working with Fidesmo products and the VivoKey implant along with the HelloFidesmo applet and test tool from their tutorial.

Simply import the project and buildfile in to intelliJ and things should work out of the box. The build.xml file needs some work and I will add a testing component that will run the final cap file through JCardSim asap.

Prerequisites:

- JDK version 8

Setup:

1. Install IntelliJ IDE
2. IMPORTANT! If you are running OS X. RENAME the IntelliJ App so that it is just named "IntelliJ"
    This is important as otherwise paths get messed up and things don't work. The path in build.properties:
    idea.home=/Applications/IntelliJ.app/Contents
    is important from what I can tell and having spaces in the APP name freaks things out.

3. Edit the setup.sh script and put your fidesmo Developer details in the obvious place
4. Run the setup.sh script
5. Open the project in IntelliJ - do not import, just open as importing will overwrite the .idea folder which contains IDE settings.

TODO:

