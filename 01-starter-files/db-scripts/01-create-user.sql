# Run one by one

DROP USER `vnsapp`@`localhost`;

flush privileges;

CREATE USER `vnsapp`@`localhost` IDENTIFIED BY 'vnsapp';

GRANT ALL PRIVILEGES ON *.* TO `vnsapp`@`localhost`;

#ALTER USER `vnsapp`@`localhost` IDENTIFIED WITH mysql_native_password BY 'vnsapp';