$ apt-get install -y oracle-java8-installer
  - https://dzone.com/articles/creating-a-docker-image-with-ubuntu-and-java
  - for at installere java

$ docker run --rm -v "$PWD":/usr/src/hello-docker -w /usr/src/hello-docker openjdk:8 java HelloDocker
  - Virker kun måske - måske der skal password på?

$ javac HelloDocker.java 
  - For at lave et 'build'

$ java HelloDocker
  - For at se indholdet. Dette burde printe:
  
  "Hello Docker
  {1=A, 2=B, 3=C}
  File has been created...
  1 : A
  2 : B
  3 : C
  File has been read."
  
$ xxd fileToReadAndWrite for at se output i binary
