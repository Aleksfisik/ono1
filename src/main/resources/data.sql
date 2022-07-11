
INSERT INTO `users` (`id`, `name`, `password`, `age`,`email`)
VALUES
(1,'admin','$2a$12$u2BZJWT.s3BARveDOhCGYeXKzp2TxbpQJaeM7hywIAKI244Xtl8Yq', 33,'11@mail.ru'),
(2,'user','$2a$12$u2BZJWT.s3BARveDOhCGYeXKzp2TxbpQJaeM7hywIAKI244Xtl8Yq', 33,'12@mail.ru');

INSERT INTO `roles` (`id`, `role`)
VALUES
(1,'ROLE_ADMIN'),
(2,'ROLE_USER');

insert into users_roles
values
(1, 1),
(2, 2);