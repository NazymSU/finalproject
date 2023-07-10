INSERT INTO permission(role)
VALUES
    ('ROLE_ADMIN'),
    ('ROLE_CLIENT');

INSERT INTO users (fullname,password,username)
VALUES
    ('Nazym Kazizmurat', '$2a$12$lAPInxNo/Oryn7TOzrRkMOP790LsUn8VgtsyNDd.z.kBLqKYGRMHW', 'nkazizmuratova@gmail.com');

INSERT INTO users_permissions(user_id,permissions_id)
VALUES
    (1,1);