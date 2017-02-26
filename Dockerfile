FROM anapsix/alpine-java

COPY build/libs/daybook-0.1.2.jar /home/daybook.jar

CMD ["java","-jar","/home/daybook.jar"]
