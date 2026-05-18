DELIMITER $$

-- Khi đặt vé: giảm ghế
CREATE TRIGGER after_booking_insert
AFTER INSERT ON booking
FOR EACH ROW
BEGIN
    UPDATE flight
    SET seat_available = seat_available - 1
    WHERE flightID = NEW.flightID;
END$$

-- Khi huỷ vé: tăng ghế
CREATE TRIGGER after_booking_delete
AFTER DELETE ON booking
FOR EACH ROW
BEGIN
    UPDATE flight
    SET seat_available = seat_available + 1
    WHERE flightID = OLD.flightID;
END$$

-- Chặn đặt vé khi hết chỗ
CREATE TRIGGER before_booking_insert
BEFORE INSERT ON booking
FOR EACH ROW
BEGIN
    DECLARE seats INT;
    SELECT seat_available INTO seats
    FROM flight WHERE flightID = NEW.flightID;

    IF seats <= 0 THEN
        SIGNAL SQLSTATE '45000'
        SET MESSAGE_TEXT = 'Chuyến bay đã hết chỗ!';
    END IF;
END$$

DELIMITER ;