create database dna;
use dna;
CREATE TABLE records(
             name1 varchar(255) DEFAULT NULL,
             number1 int DEFAULT NULL,
             dna varchar(255) DEFAULT NULL,
             ID int NOT NULL AUTO_INCREMENT,
             PRIMARY KEY (ID)); 

insert into records value ("Suad Ahmad",0595969888,"AACCTGCGGAAGGAT",1);
insert into records value ("Sana Bassam",0595969778,"GCTTGTCGCCGCCGT",2);
insert into records value ("Mays Rami",0595889888,"ATCCGGCGGAAGGAT",3);
insert into records value ("Mohamad Aabed",0595689888,"GCTTGTCGGACCCGT",4);
insert into records value ("Basem Sairafi",0595969899,"TCGGACGCCGTACTC",5);
insert into records value ("Iyad jaber",0595969708,"ATCCGGCCGTAAGAT",6);
insert into records value ("Bayan nimer",0595969500,"CTCCGGCCGTATGAT",7);
insert into records value ("Manal Makho",0595969345,"GTCCTGCCGTAAGAT",8);
insert into records value ("Noor Aabed",0595969234,"ATCCGGCCGCAACGT",9);
insert into records value ("Abdallah Bardan",0595969908,"GTCCGGCCGCAAGAT",10);
insert into records value ("Saed Mona",0595964567,"CTCCGCCCGTCAGAT",11);
insert into records value ("Zain Abd",0595965678,"GTCCGGCTGTACGAT",12);
insert into records value ("Sondos Hosnie",0595969684,"TTCCCGCCGTGAGAT",13);
SELECT * FROM dna.records;
