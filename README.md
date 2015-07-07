# VpnConfigCreater
This is to create Mac OS X vpn configuration file.


# Package
mvn package

# Usage
java -jar target/TemplateRender-1.0-SNAPSHOT-jar-with-dependencies.jar -t path/to/template.mustache -s path/to/source.json

# Create Static Server and Serve Config File
npm install serve-static
http-server .
