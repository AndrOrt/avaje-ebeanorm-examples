create table p_customer (
  id                        bigserial not null,
  inactive                  boolean,
  name                      varchar(100),
  registered                timestamp,
  comments                  varchar(1000),
  tags                      hstore,
  version                   bigint not null,
  when_created              timestamp not null,
  when_updated              timestamp not null,
  constraint pk_p_customer primary key (id))
;


