-- ROOM
INSERT INTO ROOM (room_id, room_name)
VALUES (ROOM_SEQ.NEXTVAL, 'Room01');

INSERT INTO ROOM (room_id, room_name)
VALUES (ROOM_SEQ.NEXTVAL, 'Room02');

INSERT INTO ROOM (room_id, room_name)
VALUES (ROOM_SEQ.NEXTVAL, 'Room03');

INSERT INTO ROOM (room_id, room_name)
VALUES (ROOM_SEQ.NEXTVAL, 'Room04');

INSERT INTO ROOM (room_id, room_name)
VALUES (ROOM_SEQ.NEXTVAL, 'Room05');

INSERT INTO ROOM (room_id, room_name)
VALUES (ROOM_SEQ.NEXTVAL, 'Room06');

INSERT INTO ROOM (room_id, room_name)
VALUES (ROOM_SEQ.NEXTVAL, 'Room07');

INSERT INTO ROOM (room_id, room_name)
VALUES (ROOM_SEQ.NEXTVAL, 'Room08');

INSERT INTO ROOM (room_id, room_name)
VALUES (ROOM_SEQ.NEXTVAL, 'Room09');

INSERT INTO ROOM (room_id, room_name)
VALUES (ROOM_SEQ.NEXTVAL, 'Room10');

-- CHAT
INSERT INTO CHAT (chat_id, room_id, writer, msg)
VALUES (ROOM_SEQ.NEXTVAL, 1, 'user01', 'msg001');

INSERT INTO CHAT (chat_id, room_id, writer, msg)
VALUES (ROOM_SEQ.NEXTVAL, 3, 'user02', 'msg002');

INSERT INTO CHAT (chat_id, room_id, writer, msg)
VALUES (ROOM_SEQ.NEXTVAL, 1, 'user02', 'msg003');

INSERT INTO CHAT (chat_id, room_id, writer, msg)
VALUES (ROOM_SEQ.NEXTVAL, 2, 'user02', 'msg004');

INSERT INTO CHAT (chat_id, room_id, writer, msg)
VALUES (ROOM_SEQ.NEXTVAL, 3, 'user03', 'msg005');

INSERT INTO CHAT (chat_id, room_id, writer, msg)
VALUES (ROOM_SEQ.NEXTVAL, 1, 'user01', 'msg006');

INSERT INTO CHAT (chat_id, room_id, writer, msg)
VALUES (ROOM_SEQ.NEXTVAL, 2, 'user02', 'msg007');

INSERT INTO CHAT (chat_id, room_id, writer, msg)
VALUES (ROOM_SEQ.NEXTVAL, 3, 'user03', 'msg008');

INSERT INTO CHAT (chat_id, room_id, writer, msg)
VALUES (ROOM_SEQ.NEXTVAL, 1, 'user03', 'msg009');

INSERT INTO CHAT (chat_id, room_id, writer, msg)
VALUES (ROOM_SEQ.NEXTVAL, 1, 'user02', 'msg010');

INSERT INTO CHAT (chat_id, room_id, writer, msg)
VALUES (ROOM_SEQ.NEXTVAL, 2, 'user01', 'msg011');

INSERT INTO CHAT (chat_id, room_id, writer, msg)
VALUES (ROOM_SEQ.NEXTVAL, 1, 'user02', 'msg012');

INSERT INTO CHAT (chat_id, room_id, writer, msg)
VALUES (ROOM_SEQ.NEXTVAL, 3, 'user01', 'msg013');

INSERT INTO CHAT (chat_id, room_id, writer, msg)
VALUES (ROOM_SEQ.NEXTVAL, 1, 'user03', 'msg014');

INSERT INTO CHAT (chat_id, room_id, writer, msg)
VALUES (ROOM_SEQ.NEXTVAL, 2, 'user02', 'msg015');

INSERT INTO CHAT (chat_id, room_id, writer, msg)
VALUES (ROOM_SEQ.NEXTVAL, 1, 'user01', 'msg016');
