CREATE TABLE user(
	user_id int auto_increment not null,
    user_name varchar(20) not null,
    user_email varchar(30)  null,
    user_pwd varchar(30) not null,
    user_regtime timestamp default CURRENT_TIMESTAMP,
    primary key (user_id),
    unique index `name_UNIQUE`  (`user_name` asc),
    unique index `email_UNIQUE` (`user_email` asc));
    
    insert into userinf(userid,username,useremail,pwd) values(0,'jiao','1197018093@qq.com',123456),
    (1,'chen','1197018092@qq.com',123456),
    (2,'li','1197018091@qq.com',123456),
    (3,'wang','1197018090@qq.com',123456);
    
CREATE TABLE post(
	post_id int auto_increment,
    post_uid int not null,
    post_cretime timestamp default CURRENT_TIMESTAMP,
    post_content mediumblob null,
    post_title varchar(100) not null,
    post_clicknum int default 0,
    primary key (post_id));
    
     insert into post(pid,uid,title) values(0,0,'今日世界'),
    (1,0,'今日财经'),
    (2,0,'今日媒体'),
    (3,0,'今日头条');
    
CREATE TABLE reply(
	reply_id int auto_increment not null,
    reply_uid int not null,
    reply_uname int not null,
    reply_pid int not null,
    reply_cretime timestamp default CURRENT_TIMESTAMP,
    reply_content blob null,
    primary key (reply_id)
);