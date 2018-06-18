create table team (
	id number(15),
	team_name varchar2(10),
	country varchar2(10),
	team_value number(15),
	team_budget number(15)
);

create table player(
	id number(15),
	first_name varchar2(10),
	last_name varchar2(10),
	country varchar2(10),
	age number(4),
	market_value number(15),
	present_On_Transfer_List number(1),
	player_type varchar2(15),
	team_id number(15)
);
