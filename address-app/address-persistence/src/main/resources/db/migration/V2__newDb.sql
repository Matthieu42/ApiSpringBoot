drop table IF EXISTS target cascade ;

create table target (uuid UUID PRIMARY KEY , firstname text, name text, ipAddress text);

create table webSite(uuid uuid PRIMARY KEY , name text, street text);

create table webUrl(uuid uuid PRIMARY KEY, domainName text, webResource text, website_uuid uuid REFERENCES webSite(uuid));

create table targetHistory (
  target_uuid uuid references target(uuid),

  weburl_uuid uuid REFERENCES webUrl(uuid), PRIMARY KEY(target_uuid, weburl_uuid),

  date Date
);

