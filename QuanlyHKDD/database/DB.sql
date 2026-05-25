-- Tạo database
CREATE DATABASE flight_management;
USE flight_management;

-- 1. Bảng login
CREATE TABLE login (
    loginID INT PRIMARY KEY AUTO_INCREMENT,
    username VARCHAR(45) NOT NULL,
    password VARCHAR(45) NOT NULL,
    role ENUM('admin', 'manager', 'passenger') NOT NULL
);

-- 2. Bảng aircraft
CREATE TABLE aircraft (
    aircraftID INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(45) NOT NULL,
    available BOOLEAN DEFAULT TRUE
);
-- sua data type cua take_off thanh datetime
-- 3. Bảng flight
CREATE TABLE flight (
    flightID INT PRIMARY KEY AUTO_INCREMENT,
    aircraftID INT NOT NULL,
    seat_available INT NOT NULL,
    take_off DATE,
    FOREIGN KEY (aircraftID) REFERENCES aircraft(aircraftID)
);

-- 4. Bảng passenger
CREATE TABLE passenger (
    ID INT PRIMARY KEY AUTO_INCREMENT,
    loginID INT NOT NULL,
    name VARCHAR(45),
    date_of_birth DATE,
    passport VARCHAR(45),
    email VARCHAR(45),
    FOREIGN KEY (loginID) REFERENCES login(loginID)
);
-- co the them trang thai
-- 5. Bảng booking
CREATE TABLE booking (
    bookingID INT PRIMARY KEY AUTO_INCREMENT,
    flightID INT NOT NULL,
    ID INT NOT NULL,
    FOREIGN KEY (flightID) REFERENCES flight(flightID),
    FOREIGN KEY (ID) REFERENCES passenger(ID)
);