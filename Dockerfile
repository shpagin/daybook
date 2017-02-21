FROM anapsix/alpine-java

COPY build/libs/daybook-0.1.1.jar /home/daybook-0.1.1.jar

CMD ["java","-jar","/home/daybook-0.1.1.jar"]
