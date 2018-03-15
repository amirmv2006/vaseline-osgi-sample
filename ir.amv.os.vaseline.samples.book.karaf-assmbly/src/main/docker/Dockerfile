FROM java:8-jdk
ENV JAVA_HOME /usr/lib/jvm/java-8-openjdk-amd64

ADD *.tar.gz /karaf/

EXPOSE 8181
CMD /karaf/ir.amv.os.vaseline.samples.book.karaf-assmbly-1.0-SNAPSHOT/bin/karaf server
