-- USER_TBL 더미 데이터
INSERT INTO USER_TBL (user_id, social_id, email, nickname, profile_image, status, regdate, birth)
VALUES
  (USER_TBL_SEQ.NEXTVAL, 'asd001', 'email1@example.com', 'User1', NULL, 'YES', TO_DATE('20220201', 'YYYYMMDD'), TO_DATE('19900101', 'YYYYMMDD'));

INSERT INTO USER_TBL (user_id, social_id, email, nickname, profile_image, status, regdate, birth)
VALUES
  (USER_TBL_SEQ.NEXTVAL, 'asd002', 'email2@example.com', 'User2', NULL, 'NO', TO_DATE('20220202', 'YYYYMMDD'), TO_DATE('19900202', 'YYYYMMDD'));

INSERT INTO USER_TBL (user_id, social_id, email, nickname, profile_image, status, regdate, birth)
VALUES
  (USER_TBL_SEQ.NEXTVAL, 'asd003', 'email3@example.com', 'User3', NULL, 'YES', TO_DATE('20220203', 'YYYYMMDD'), TO_DATE('19900303', 'YYYYMMDD'));

INSERT INTO USER_TBL (user_id, social_id, email, nickname, profile_image, status, regdate, birth)
VALUES
  (USER_TBL_SEQ.NEXTVAL, 'asd004', 'email4@example.com', 'User4', NULL, 'NO', TO_DATE('20220204', 'YYYYMMDD'), TO_DATE('19900404', 'YYYYMMDD'));

INSERT INTO USER_TBL (user_id, social_id, email, nickname, profile_image, status, regdate, birth)
VALUES
  (USER_TBL_SEQ.NEXTVAL, 'asd005', 'email5@example.com', 'User5', NULL, 'YES', TO_DATE('20220205', 'YYYYMMDD'), TO_DATE('19900505', 'YYYYMMDD'));

INSERT INTO USER_TBL (user_id, social_id, email, nickname, profile_image, status, regdate, birth)
VALUES
  (USER_TBL_SEQ.NEXTVAL, 'asd006', 'email6@example.com', 'User6', NULL, 'NO', TO_DATE('20220206', 'YYYYMMDD'), TO_DATE('19900606', 'YYYYMMDD'));

INSERT INTO USER_TBL (user_id, social_id, email, nickname, profile_image, status, regdate, birth)
VALUES
  (USER_TBL_SEQ.NEXTVAL, 'asd007', 'email7@example.com', 'User7', NULL, 'YES', TO_DATE('20220207', 'YYYYMMDD'), TO_DATE('19900707', 'YYYYMMDD'));

INSERT INTO USER_TBL (user_id, social_id, email, nickname, profile_image, status, regdate, birth)
VALUES
  (USER_TBL_SEQ.NEXTVAL, 'asd008', 'email8@example.com', 'User8', NULL, 'YES', TO_DATE('20220208', 'YYYYMMDD'), TO_DATE('19900808', 'YYYYMMDD'));

INSERT INTO USER_TBL (user_id, social_id, email, nickname, profile_image, status, regdate, birth)
VALUES
  (USER_TBL_SEQ.NEXTVAL, 'asd009', 'email9@example.com', 'User9', NULL, 'NO', TO_DATE('20220209', 'YYYYMMDD'), TO_DATE('19900909', 'YYYYMMDD'));

INSERT INTO USER_TBL (user_id, social_id, email, nickname, profile_image, status, regdate, birth)
VALUES
  (USER_TBL_SEQ.NEXTVAL, 'asd010', 'email10@example.com', 'User10', NULL, 'YES', TO_DATE('20220210', 'YYYYMMDD'), TO_DATE('19901010', 'YYYYMMDD'));

-- SERVER 더미 데이터
INSERT INTO SERVER (server_id, user_id, server_name, regdate, user_total)
VALUES
  (SERVER_SEQ.NEXTVAL, 1 , 'Server1', TO_DATE('20220201', 'YYYYMMDD'), 10);

INSERT INTO SERVER (server_id, user_id, server_name, regdate, user_total)
VALUES
  (SERVER_SEQ.NEXTVAL, 2, 'Server2', TO_DATE('20220202', 'YYYYMMDD'), 100);

INSERT INTO SERVER (server_id, user_id, server_name, regdate, user_total)
VALUES
  (SERVER_SEQ.NEXTVAL, 3, 'Server3', TO_DATE('20220203', 'YYYYMMDD'), 100);

INSERT INTO SERVER (server_id, user_id, server_name, regdate, user_total)
VALUES
  (SERVER_SEQ.NEXTVAL, 4, 'Server4', TO_DATE('20220204', 'YYYYMMDD'), 100);

INSERT INTO SERVER (server_id, user_id, server_name, regdate, user_total)
VALUES
  (SERVER_SEQ.NEXTVAL, 5, 'Server5', TO_DATE('20220205', 'YYYYMMDD'), 100);

INSERT INTO SERVER (server_id, user_id, server_name, regdate, user_total)
VALUES
  (SERVER_SEQ.NEXTVAL, 6, 'Server6', TO_DATE('20220206', 'YYYYMMDD'), 100);

INSERT INTO SERVER (server_id, user_id, server_name, regdate, user_total)
VALUES
  (SERVER_SEQ.NEXTVAL, 7, 'Server7', TO_DATE('20220207', 'YYYYMMDD'), 100);

INSERT INTO SERVER (server_id, user_id, server_name, regdate, user_total)
VALUES
  (SERVER_SEQ.NEXTVAL, 8, 'Server8', TO_DATE('20220208', 'YYYYMMDD'), 100);

INSERT INTO SERVER (server_id, user_id, server_name, regdate, user_total)
VALUES
  (SERVER_SEQ.NEXTVAL, 9, 'Server9', TO_DATE('20220209', 'YYYYMMDD'), 100);

INSERT INTO SERVER (server_id, user_id, server_name, regdate, user_total)
VALUES
  (SERVER_SEQ.NEXTVAL, 10, 'Server10', TO_DATE('20220210', 'YYYYMMDD'), 100);

-- USER_SERVER 더미 데이터
INSERT INTO USER_SERVER (server_id, user_id)
VALUES
  (SERVER_SEQ.CURRVAL, 1);	

INSERT INTO USER_SERVER (server_id, user_id)
VALUES
  (SERVER_SEQ.CURRVAL, 2);

INSERT INTO USER_SERVER (server_id, user_id)
VALUES
  (SERVER_SEQ.CURRVAL, 3);

INSERT INTO USER_SERVER (server_id, user_id)
VALUES
  (SERVER_SEQ.CURRVAL, 4);

INSERT INTO USER_SERVER (server_id, user_id)
VALUES
  (SERVER_SEQ.CURRVAL, 5);

INSERT INTO USER_SERVER (server_id, user_id)
VALUES
  (SERVER_SEQ.CURRVAL, 6);

INSERT INTO USER_SERVER (server_id, user_id)
VALUES
  (SERVER_SEQ.CURRVAL, 7);

INSERT INTO USER_SERVER (server_id, user_id)
VALUES
  (SERVER_SEQ.CURRVAL, 8);

INSERT INTO USER_SERVER (server_id, user_id)
VALUES
  (SERVER_SEQ.CURRVAL, 9);

INSERT INTO USER_SERVER (server_id, user_id)
VALUES
  (SERVER_SEQ.CURRVAL, 10);

-- CHANNEL 더미 데이터
INSERT INTO CHANNEL (channel_id, server_id, channel_name)
VALUES
  (CHANNEL_SEQ.NEXTVAL, 1, 'Channel1');

INSERT INTO CHANNEL (channel_id, server_id, channel_name)
VALUES
  (CHANNEL_SEQ.NEXTVAL, 2, 'Channel2');

INSERT INTO CHANNEL (channel_id,server_id, channel_name)
VALUES
  (CHANNEL_SEQ.NEXTVAL, 3, 'Channel3');

INSERT INTO CHANNEL (channel_id, server_id, channel_name)
VALUES
  (CHANNEL_SEQ.NEXTVAL, 4, 'Channel4');

INSERT INTO CHANNEL (channel_id, server_id, channel_name)
VALUES
  (CHANNEL_SEQ.NEXTVAL, 5, 'Channel5');

INSERT INTO CHANNEL (channel_id, server_id, channel_name)
VALUES
  (CHANNEL_SEQ.NEXTVAL, 6, 'Channel6');

INSERT INTO CHANNEL (channel_id, server_id, channel_name)
VALUES
  (CHANNEL_SEQ.NEXTVAL, 7, 'Channel7');

INSERT INTO CHANNEL (channel_id, server_id, channel_name)
VALUES
  (CHANNEL_SEQ.NEXTVAL, 8, 'Channel8');

INSERT INTO CHANNEL (channel_id, server_id, channel_name)
VALUES
  (CHANNEL_SEQ.NEXTVAL, 9, 'Channel9');

INSERT INTO CHANNEL (channel_id, server_id, channel_name)
VALUES
  (CHANNEL_SEQ.NEXTVAL, 10, 'Channel10');

-- USER_CHANNEL 더미 데이터
INSERT INTO USER_CHANNEL (server_id, channel_id)
VALUES
  (1, CHANNEL_SEQ.CURRVAL);

INSERT INTO USER_CHANNEL (server_id, channel_id)
VALUES
  (2, CHANNEL_SEQ.CURRVAL);

INSERT INTO USER_CHANNEL (server_id, channel_id)
VALUES
  (3, CHANNEL_SEQ.CURRVAL);

INSERT INTO USER_CHANNEL (server_id, channel_id)
VALUES
  (4, CHANNEL_SEQ.CURRVAL);

INSERT INTO USER_CHANNEL (server_id, channel_id)
VALUES
  (5, CHANNEL_SEQ.CURRVAL);

INSERT INTO USER_CHANNEL (server_id, channel_id)
VALUES
  (6, CHANNEL_SEQ.CURRVAL);

INSERT INTO USER_CHANNEL (server_id, channel_id)
VALUES
  (7, CHANNEL_SEQ.CURRVAL);

INSERT INTO USER_CHANNEL (server_id, channel_id)
VALUES
  (8, CHANNEL_SEQ.CURRVAL);

INSERT INTO USER_CHANNEL (server_id, channel_id)
VALUES
  (9, CHANNEL_SEQ.CURRVAL);

INSERT INTO USER_CHANNEL (server_id, channel_id)
VALUES
  (10, CHANNEL_SEQ.CURRVAL);
