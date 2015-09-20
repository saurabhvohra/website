CREATE TABLE `PERSON`(
`id` int(20) NOT NULL AUTO_INCREMENT,
`firstname` varchar(20),
`lastname` varchar(20) NOT NULL,
`country` varchar(20) NOT NULL,
`book_id` int(20) NOT NULL,
PRIMARY KEY(`id`) 
)ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;  

CREATE TABLE `BOOK`(
`id` int(20) NOT NULL AUTO_INCREMENT,
`book_name` varchar(20),
`book_edition` varchar(20) NOT NULL,
`author_id` int(20) NOT NULL,
PRIMARY KEY(`id`) 
)ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;



CREATE TABLE `AUTHOR`(
`id` int(20) NOT NULL AUTO_INCREMENT,
`firstname` varchar(20),
`lastname` varchar(20) NOT NULL,
PRIMARY KEY(`id`) 
)ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;


ALTER TABLE BOOK
ADD FOREIGN KEY (author_id)
REFERENCES AUTHOR(id)

ALTER TABLE PERSON
ADD FOREIGN KEY (book_id)
REFERENCES BOOK(id)




