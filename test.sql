DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`(
    `name` varchar(30) DEFAULT NULL, 
    `password` varchar(30) DEFAULT NULL 
)ENGINE=innoDB DEFAULT CHARSET=utf8;


insert into user
(name,password)
VALUES
("root","12345");
