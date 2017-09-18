CREATE TABLE TB_TAGS (	
	ID NUMBER(10,0) PRIMARY KEY, 
	TAG_NAME VARCHAR2(1000 BYTE), 
	STATUS CHAR(1 BYTE), 
	PUBLISH_DATE DATE DEFAULT sysdate, 
	LASTMODIFY_DATE DATE DEFAULT sysdate
);

Insert into TB_TAGS (ID,TAG_NAME,STATUS,PUBLISH_DATE,LASTMODIFY_DATE) values (1001,'去澳洲过圣诞节','A',to_date('10-7月 -17','DD-MON-RR'),to_date('27-12月-16','DD-MON-RR'));
Insert into TB_TAGS (ID,TAG_NAME,STATUS,PUBLISH_DATE,LASTMODIFY_DATE) values (1002,'去澳洲旅游','A',to_date('27-12月-16','DD-MON-RR'),to_date('27-12月-16','DD-MON-RR'));
Insert into TB_TAGS (ID,TAG_NAME,STATUS,PUBLISH_DATE,LASTMODIFY_DATE) values (1003,'去北欧过年','A',to_date('27-12月-16','DD-MON-RR'),to_date('27-12月-16','DD-MON-RR'));
Insert into TB_TAGS (ID,TAG_NAME,STATUS,PUBLISH_DATE,LASTMODIFY_DATE) values (1004,'徒步喜马拉雅计划','A',to_date('27-12月-16','DD-MON-RR'),to_date('27-12月-16','DD-MON-RR'));
Insert into TB_TAGS (ID,TAG_NAME,STATUS,PUBLISH_DATE,LASTMODIFY_DATE) values (1011,'去澳洲过圣诞节','B',to_date('27-12月-16','DD-MON-RR'),to_date('27-12月-16','DD-MON-RR'));
Insert into TB_TAGS (ID,TAG_NAME,STATUS,PUBLISH_DATE,LASTMODIFY_DATE) values (1012,'去澳洲旅游','B',to_date('25-12月-16','DD-MON-RR'),to_date('27-12月-16','DD-MON-RR'));
Insert into TB_TAGS (ID,TAG_NAME,STATUS,PUBLISH_DATE,LASTMODIFY_DATE) values (1013,'去北欧过年','B',to_date('24-12月-16','DD-MON-RR'),to_date('27-12月-16','DD-MON-RR'));
Insert into TB_TAGS (ID,TAG_NAME,STATUS,PUBLISH_DATE,LASTMODIFY_DATE) values (1014,'徒步喜马拉雅计划','B',to_date('23-12月-16','DD-MON-RR'),to_date('27-12月-16','DD-MON-RR'));
Insert into TB_TAGS (ID,TAG_NAME,STATUS,PUBLISH_DATE,LASTMODIFY_DATE) values (1031,'去澳洲过圣诞节','C',to_date('27-12月-16','DD-MON-RR'),to_date('27-12月-16','DD-MON-RR'));
Insert into TB_TAGS (ID,TAG_NAME,STATUS,PUBLISH_DATE,LASTMODIFY_DATE) values (1032,'去澳洲旅游','C',to_date('25-12月-16','DD-MON-RR'),to_date('27-12月-16','DD-MON-RR'));
Insert into TB_TAGS (ID,TAG_NAME,STATUS,PUBLISH_DATE,LASTMODIFY_DATE) values (1033,'去北欧过年','C',to_date('24-12月-16','DD-MON-RR'),to_date('27-12月-16','DD-MON-RR'));
Insert into TB_TAGS (ID,TAG_NAME,STATUS,PUBLISH_DATE,LASTMODIFY_DATE) values (1034,'徒步喜马拉雅计划','C',to_date('23-12月-16','DD-MON-RR'),to_date('27-12月-16','DD-MON-RR'));
