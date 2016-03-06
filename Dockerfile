FROM java:7
COPY DockerHelloWorld.java .
RUN javac DockerHelloWorld.java

CMD ["java", "DockerHelloWorld"]
