#!/bin/sh
#
# run as
# DEVELOPMENT_VERSION=10.2.2 ./setversion.sh
#
set -e
: ${DEVELOPMENT_VERSION?"Need to set env var DEVELOPMENT_VERSION for next development version, e.g. 2.1.0 (don't include SNAPSHOT)"}
export DEVELOPMENT_VERSION="${DEVELOPMENT_VERSION}-SNAPSHOT"
export TIMESTAMP=`date +"%Y%m%d%H%M"`

#
# set maven version everywhere 
#
mvn versions:set -DnewVersion="$DEVELOPMENT_VERSION"
mvn versions:commit


#
# update plugins/eclipse
#
#cd plugins/eclipse
## Set the pom version to the next development version
#mvn org.eclipse.tycho:tycho-versions-plugin:1.5.1:set-version -DnewVersion="$DEVELOPMENT_VERSION"
#mv pom.xml pom.xml.bak && sed "s/<robovm.version>.*<\/robovm.version>/<robovm.version>$DEVELOPMENT_VERSION-SNAPSHOT<\/robovm.version>/" pom.xml.bak > pom.xml
#rm pom.xml.bak

#
# update plugins/idea
#
# Set the pom version to the next development version (it always have to be development)
cd plugins/idea
mvn versions:set -DnewVersion=$DEVELOPMENT_VERSION
mvn versions:commit
mv pom.xml pom.xml.bak && sed "s/<robovm.version>.*<\/robovm.version>/<robovm.version>$DEVELOPMENT_VERSION<\/robovm.version>/" pom.xml.bak > pom.xml
rm pom.xml.bak

# Set the gradle version to the next development version
sed "s/^version *=.*/version = '$DEVELOPMENT_VERSION'/" build.gradle | sed "s/roboVMVersion *=.*/roboVMVersion = '$DEVELOPMENT_VERSION'/" > build.gradle.tmp
mv build.gradle.tmp build.gradle

#
# update Gradle plugin
#
cd ../gradle
sed "s/^version *=.*/version = '$DEVELOPMENT_VERSION'/" build.gradle | sed "s/roboVMVersion *=.*/roboVMVersion = '$DEVELOPMENT_VERSION'/" > build.gradle.tmp
mv build.gradle.tmp build.gradle

