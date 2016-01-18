
create databases blog701;
use blog701;




--create category

CREATE TABLE `category` (
  `id` int(14) NOT NULL AUTO_INCREMENT,
  `name` varchar(200) DEFAULT '' COMMENT 'strict charactors',
  `slug` varchar(200) DEFAULT '' COMMENT 'none strict charactors',
  `belongto` varchar(1000) DEFAULT '' COMMENT 'which categorys(ids) this belongs to, splite by [,]',
  `articles` longtext COMMENT 'articles ids which directly belong to this category',
  `comment` varchar(200) DEFAULT '',
  `extend` varchar(200) DEFAULT '' COMMENT 'reserved column',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET='utf8';