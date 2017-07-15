CREATE TABLE userinf(
	userid int not null,
    username varchar(20) not null,
    useremail varchar(30)  null,
    pwd varchar(30) not null,
    regtime timestamp default CURRENT_TIMESTAMP,
    primary key (userid),
    unique index `email_UNIQUE` (`useremail` asc));
    
    insert into userinf(userid,username,useremail,pwd) values(0,'jiao','1197018093@qq.com',123456),
    (1,'chen','1197018092@qq.com',123456),
    (2,'li','1197018091@qq.com',123456),
    (3,'wang','1197018090@qq.com',123456);
    
CREATE TABLE post(
	pid int not null,
    uid int not null,
    cretime timestamp default CURRENT_TIMESTAMP,
    contentdep blob null, 
    content text null,
    title varchar(100) not null,
    primary key (pid));
    
     insert into post(pid,uid,title) values(0,0,'今日世界'),
    (1,0,'今日财经'),
    (2,0,'今日媒体'),
    (3,0,'今日头条');
    
    
update post set content='薛甄珠女士的浮夸做作，却又看点十足的表演，你注意了没？' where pid=0;