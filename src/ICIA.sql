DROP TABLE PLAYER;
DROP TABLE BMAP;
DROP TABLE MEMBER;

CREATE TABLE MEMBER(
MNUM NUMBER UNIQUE, 
MID NVARCHAR2(20) PRIMARY KEY, 
MPW  NVARCHAR2(20), 
MNAME  NVARCHAR2(20)
);

CREATE TABLE BMAP(
PLOCATION NUMBER PRIMARY KEY,
BNAME NVARCHAR2(20),
B_OWNER NVARCHAR2(20),
BUILDING_COUNT NUMBER,
PURCHASE_PRICE NUMBER,
RENT_PRICE NUMBER
);

INSERT INTO BMAP VALUES(1, '출발',NULL,0,100,0);
INSERT INTO BMAP VALUES(2, '서울',NULL,0,100,0);
INSERT INTO BMAP VALUES(3, '인천',NULL,0,100,0);
INSERT INTO BMAP VALUES(4, '대전',NULL,0,100,0);
INSERT INTO BMAP VALUES(5, '전주',NULL,0,100,0);
INSERT INTO BMAP VALUES(6, '동두천',NULL,0,100,0);
INSERT INTO BMAP VALUES(7, '홍천',NULL,0,100,0);
INSERT INTO BMAP VALUES(8, '영종도',NULL,0,100,0);
INSERT INTO BMAP VALUES(9, '남원',NULL,0,100,0);
INSERT INTO BMAP VALUES(10, '무인도',NULL,0,100,0);
INSERT INTO BMAP VALUES(11, '울릉도',NULL,0,100,0);
INSERT INTO BMAP VALUES(12, '의정부',NULL,0,100,0);
INSERT INTO BMAP VALUES(13, '한번더',NULL,0,100,0);
INSERT INTO BMAP VALUES(14, '횡성',NULL,0,100,0);
INSERT INTO BMAP VALUES(15, '영주시',NULL,0,100,0);
INSERT INTO BMAP VALUES(16, '남해',NULL,0,100,0);
INSERT INTO BMAP VALUES(17, '제주도',NULL,0,100,0);
INSERT INTO BMAP VALUES(18, '양양',NULL,0,100,0);
INSERT INTO BMAP VALUES(19, '남양주',NULL,0,100,0);
INSERT INTO BMAP VALUES(20, '부산',NULL,0,100,0);
INSERT INTO BMAP VALUES(21, '강화도',NULL,0,100,0);
INSERT INTO BMAP VALUES(22, '강릉',NULL,0,100,0);
INSERT INTO BMAP VALUES(23, '춘천',NULL,0,100,0);
INSERT INTO BMAP VALUES(24, '파주',NULL,0,100,0);

CREATE TABLE PLAYER (
PLAYERNUM NUMBER PRIMARY KEY,
PNAME NVARCHAR2(20),
PLOCATION NUMBER REFERENCES BMAP,
PBUDGET NUMBER
);

COMMIT;
DELETE player;