FROM openjdk:8-jre-alpine
MAINTAINER Me

ENTRYPOINT ["/usr/bin/java", "-jar", "/usr/share/myservice/texas-two.jar"]

# Add Maven dependencies (not shaded into the artifact; Docker-cached)
# ADD target/lib           /usr/share/myservice/lib
# Add the service itself
ARG JAR_FILE
ADD target/${JAR_FILE} /usr/share/myservice/texas-two.jar