create table `Teacher` (
	`TeacherId` int(11) unsigned NOT NULL,
	`Name` varchar(50) NOT NULL DEFAULT '',
	`BirthYear` int(11) unsigned NOT NULL,
	`Country` varchar(20) NOT NULL DEFAULT '',
    `Faculty` varchar(50) NOT NULL DEFAULT '',
    `Degree` varchar(20) NOT NULL DEFAULT '',
    `ClassHours` int(11) unsigned NOT NULL DEFAULT '0',
    `Allowance` int(11) unsigned NOT NULL DEFAULT '0',
    `CoefficientSalary` float(11) unsigned NOT NULL DEFAULT '0',
  PRIMARY KEY (`TeacherId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

create table `Staff` (
	`StaffId` int(11) unsigned NOT NULL,
	`Name` varchar(50) NOT NULL DEFAULT '',
	`BirthYear` int(11) unsigned NOT NULL,
	`Country` varchar(20) NOT NULL DEFAULT '',
    `Department` varchar(50) NOT NULL DEFAULT '',
    `Position` varchar(20) NOT NULL DEFAULT '',
    `WorkDays` int(11) unsigned NOT NULL DEFAULT '0',
    `Allowance` int(11) unsigned NOT NULL DEFAULT '0',
    `CoefficientSalary` float(11) unsigned NOT NULL DEFAULT '0',
  PRIMARY KEY (`StaffId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

create table `User` (
	`UserId` int(11) unsigned NOT NULL PRIMARY KEY AUTO_INCREMENT,
	`Username` varchar(50) NOT NULL DEFAULT '',
	`Password` varchar(20) NOT NULL DEFAULT '',
    `Role` varchar(20) NOT NULL DEFAULT '',
    `Active` tinyint(1) NOT NULL DEFAULT '1'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

ALTER TABLE Teacher ADD FOREIGN KEY(TeacherId) REFERENCES User(UserId);
ALTER TABLE Staff ADD FOREIGN KEY(StaffId) REFERENCES User(UserId);