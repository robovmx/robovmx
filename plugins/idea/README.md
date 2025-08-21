RoboVM Intellij IDEA Plugin
===========================
An IDEA plugin packaging is based on the Gradle. Development is possible using both Idea or Gradle 

### Packaging with gradle 
Simply do `gradlew clean buildPlugin` in the root dir. You'll end up with a zip in the `build/distributions` folder to which you can point Intellij IDEA.

### Packaging with maven 
Not supported any more due removed `-extdir` in Java9+ 

### Development with Maven 
* Install recent *Intellij IDEA Community Edition * under /Applications/Intellij IDEA CE.app/ (https://download.jetbrains.com/idea/)
* Install Swing UI Designer plugin
* Install this plugin, it allows us to use [Maven for plugin development](https://plugins.jetbrains.com/plugin/7127?pr=). *Note*: outdated and might not work for recent versions of Idea, open source alternative is available at [dkimitsa/support-maven-devkit-plugins](https://github.com/dkimitsa/support-maven-devkit-plugins).   
* Clone this repo https://github.com/JetBrains/intellij-community.git
* Checkout the branch that corresponds to the respective IDEA version you installed, e.g. 139 for Idea 14.0.x, see http://www.jetbrains.org/pages/viewpage.action?pageId=983225
* Open Intellij IDEA CE, setup the IDEA sdk pointing it at your IDEA installation. Add source path to root of repo cloned above. Also add following JARs to SDK from IDEA directory:
 - /Applications/IntelliJ IDEA CE.app/Contents/plugins/maven/lib/maven.jar
 - /Applications/IntelliJ IDEA CE.app/Contents/plugins/maven/lib/maven-server.jar
 - /Applications/IntelliJ IDEA CE.app/Contents/plugins/gradle/lib/gradle.jar
 - /Applications/IntelliJ IDEA CE.app/Contents/plugins/gradle/lib/gradle-api-?.?.jar
 - /Applications/IntelliJ IDEA CE.app/Contents/plugins/gradle-java/lib/gradle-java.jar
* Open the project by selecting it's POM
* Open File -> Project Structure, Click on the Project menu entry, and select the IDEA sdk under Project SDK
* Click OK

* Run `dependency:copy` goal in `RoboVM plugin for Intellij IDEA/Plugins/dependency` to get `src/main/resources/robovm-dist` resolved
* Optionally import the robovm-compiler, robovm-debugger, robovm-ibxcode projects as modules. IDEA will resolve the dependencies to those modules so you can debug and code hotswap the compiler and debugger!
* Create a new run configuration, using the Plugin run config type. Set the module. Happy coding.

### Development with Gradle
Simply open gradle file as project, create Run configuration and debug  

### if maven based project doesn't deploy plugin
Check `plugins/idea/org.robovm.idea.iml` for module type field missing should be as bellow:
```xml
<?xml version="1.0" encoding="UTF-8"?>
<module version="4" type="PLUGIN_MODULE">
  <component name="DevKit.ModuleBuildProperties" url="file://$MODULE_DIR$/src/main/resources/META-INF/plugin.xml" />
</module>
```