FROM tomcat:latest
RUN rm -rf /usr/local/tomcat/webapps/*
COPY target/studentManager-0.0.1-SNAPSHOT.war /usr/local/tomcat/webapps/studentManager-0.0.1-SNAPSHOT.war
EXPOSE 8080
CMD ["catalina.sh", "run"]