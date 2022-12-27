DROP DATABASE IF EXISTS user_management;
CREATE DATABASE user_management;
USE user_management;

-- Create table user
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`(
	id 				INT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
    `name` 			VARCHAR(50) NOT NULL,
    email			VARCHAR(50) UNIQUE KEY NOT NULL,
    `password`		VARCHAR(50) NOT NULL
);

DROP PROCEDURE IF EXISTS sp_delete_user;
DELIMITER $$
CREATE PROCEDURE sp_delete_user(IN in_id INT UNSIGNED)
BEGIN
	DELETE FROM `user`
    WHERE id = in_id;
END $$
DELIMITER ;
