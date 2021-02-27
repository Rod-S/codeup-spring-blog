
insert into posts (title, body) values ('hybrid', 'rhoncus aliquam lacus morbi quis tortor id nulla ultrices aliquet maecenas leo');
insert into posts (title, body) values ('background', 'ac nulla sed vel enim sit amet nunc viverra dapibus nulla suscipit ligula');
insert into posts (title, body) values ('heuristic', 'magna ac consequat metus sapien ut nunc vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia curae');
insert into posts (title, body) values ('website', 'duis consequat dui nec nisi volutpat eleifend donec ut dolor morbi vel');
insert into posts (title, body) values ('system engine', 'ut dolor morbi vel lectus in quam fringilla rhoncus mauris enim leo rhoncus');
User user = new User();
user.setUsername("cody");
user.setEmail("cody@codeup.com");
user.setPassword("codeuprocks");
userDao.save(user);
