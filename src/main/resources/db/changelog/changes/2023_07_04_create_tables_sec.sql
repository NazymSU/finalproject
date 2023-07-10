CREATE TABLE permission (
    id BIGINT AUTO_INCREMENT,
    role VARCHAR(255),
    PRIMARY KEY (id)
);

CREATE TABLE users (
   id BIGINT AUTO_INCREMENT,
   fullname VARCHAR(255),
   password VARCHAR(255),
   repassword VARCHAR(255),
   username VARCHAR(255),
   birthday VARCHAR(255),
   phone VARCHAR(255),
   PRIMARY KEY (id)
);

CREATE TABLE users_permissions(
    user_id bigint,
    permissions_id bigint
);

ALTER TABLE users_permissions
    ADD CONSTRAINT fk_users_permissions_users
        FOREIGN KEY (user_id)
            REFERENCES users (id)
            ON DELETE CASCADE;

ALTER TABLE users_permissions
    ADD CONSTRAINT fk_users_permissions_permission
        FOREIGN KEY (permissions_id)
            REFERENCES permission (id)
            ON DELETE CASCADE;
