CREATE TABLE account (
   id BIGINT AUTO_INCREMENT,
   account_number varchar(255),
   balance double,
   PRIMARY KEY (id)
);

CREATE TABLE transaction (
   id BIGINT AUTO_INCREMENT,
   amount double,
   source_account_id bigint,
   target_account_id bigint,
   timestamp datetime(6),
   PRIMARY KEY (id)
);

CREATE TABLE transaction_accounts(
    transaction_id bigint,
    accounts_id bigint
);
CREATE TABLE users_accounts(
     user_id bigint,
     accounts_id bigint
);

ALTER TABLE transaction_accounts
    ADD CONSTRAINT fk_transaction_accounts_transactions
        FOREIGN KEY (transaction_id)
            REFERENCES transaction (id)
            ON DELETE CASCADE;

ALTER TABLE transaction_accounts
    ADD CONSTRAINT fk_transaction_accounts_accounts
        FOREIGN KEY (accounts_id)
            REFERENCES account (id)
            ON DELETE CASCADE;

ALTER TABLE users_accounts
    ADD CONSTRAINT fk_users_accounts_users
        FOREIGN KEY (user_id)
            REFERENCES users (id)
            ON DELETE CASCADE;

ALTER TABLE users_accounts
    ADD CONSTRAINT fk_users_accounts_accounts
        FOREIGN KEY (accounts_id)
            REFERENCES account (id)
            ON DELETE CASCADE;