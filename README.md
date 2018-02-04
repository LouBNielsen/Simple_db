1) Clone projektet

2) Jeg formoder at java skal installeres, da jeg har skrevet i java. Det skulle jeg i hvert fald.

  - $ apt-get install -y oracle-java8-installer
  - https://dzone.com/articles/creating-a-docker-image-with-ubuntu-and-java
  
3) Kør følgende for at lave et build af HelloDocker.java filen
  
  - $ javac HelloDocker.java
  
4) Kør følgende for at se indholdet af filen

  - java HelloDocker
  - Dette opretter en fil kaldet fileToReadAndWrite
  - Og følgende printes:
  
  Hello Docker
  {1=A, 2=B, 3=C}
  File has been created...
  1 : A
  2 : B
  3 : C
  File has been read.
  
5) For at se output i binary kør følgende

  - $ xxd fileToReadAndWrite
