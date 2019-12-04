create table USER
(
    ID           INTEGER auto_increment,
    ACCOUNT_ID   VARCHAR(100),
    NAME         VARCHAR(50),
    GMT_CREATE   BIGINT,
    GMT_MODIFIED BIGINT,
    TOKEN        CHAR(36)
);
