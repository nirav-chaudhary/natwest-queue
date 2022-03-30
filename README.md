# natwest-queue

-Implement a pseudo queue backend that acts as a fake queue.

-Tech stack : Spring Boot, in memory database or JPA or JDBC or SQL

#Minimum Requirement

-Write a backend in the techstack mentioned. The backend should expose an API that returns the necessary response. -The backend must accept a transaction object.

Example transaction object:

{ 
  Account Number:"123456789", 
  Type:"Credit" ,
  Amount:"10000",
  Currency:"INR",
  AccountFrom:"987654321" 
}


This is the sender microservice which sends the data to QUEUE (receiver API ) which in turn stores the data.

https://user-images.githubusercontent.com/30567030/160813545-a83a05b5-00a2-4c9b-91bd-aa9cee04e9ae.JPG
