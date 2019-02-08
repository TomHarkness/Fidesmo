# FidesmoOSX
Build environment for working with JavaCard for Fidesmo / VivoKey on OS X Using intelliJ IDE

THIS REPO IS CURRENTLY BARE BONES - things may not work as expected right away. 

Contains both JCard kit 2.2.2 and 3.0.4 for working with Fidesmo products and the VivoKey implant along with the HelloFidesmo applet and test tool from their tutorial.

Simply import the project and buildfile in to intelliJ and things should work out of the box. The build.xml file needs some work and I will add a testing component that will run the final cap file through JCardSim asap.


Setup:

1. Install IntelliJ IDE 
2. Edit the setup.sh script and put your fidesmo Developer details in the obvious place
3. Run the setup.sh script 
4. Import project into intelliJ

TODO:

-add test build options and JCardSim
