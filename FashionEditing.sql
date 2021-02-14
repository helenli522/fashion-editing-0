use fashion;

drop table if exists User;

drop table if exists Line;

drop table if exists Ornament;

drop table if exists Texture;

drop table if exists Work;


create table User
(
    UserID          int not null auto_increment,
    Name            varchar(20) not null,
    Password        varchar(20) not null,
    Email           varchar(30) not null,
    Gender          varchar(6),
    primary key (UserID)
)default character set utf8;


create table Line
(
    LID             int not null auto_increment,
    LType           int not null,
    LGender         varchar(6),
    ImageUrl        varchar(100) not null,
    primary key (LID)
)default character set utf8;


create table Texture
(
    TID             int not null auto_increment,
    ImageUrl        varchar(100) not null,
    primary key (TID)
)default character set utf8;


create table Work
(
    WorkID          int not null auto_increment,
    UserID          int not null,
    LID             int not null,
    TID             int not null,
    ImageUrl        varchar(100) not null,
    primary key (WorkID)
)default character set utf8;


create table Ornament
(
    OID             int not null auto_increment,
    OType           int not null,
    ImageUrl        varchar(100) not null,
    primary key (OID)
)default character set utf8;

alter table Work add constraint FK_作为作者 foreign key (UserID)
      references User (UserID) on delete restrict on update restrict;

alter table Work add constraint FK_作为线条 foreign key (LID)
      references Line (LID) on delete restrict on update restrict;

alter table Work add constraint FK_作为纹理 foreign key (TID)
      references Texture (TID) on delete restrict on update restrict;