-- create schema
CREATE SCHEMA IF NOT EXISTS polling;

-- create tables
CREATE TABLE IF NOT EXISTS polling.recording (
    id INTEGER PRIMARY KEY AUTO_INCREMENT   COMMENT 'ID for the address',
    polling_timestamp DATETIME NOT NULL     COMMENT 'Datetime the product was created',
	download_speed DECIMAL NOT NULL         COMMENT 'Download speed recorded as part of the polling',
	upload_speed DECIMAL NOT NULL           COMMENT 'Upload speed recorded as part of the polling',
	download_speed_limit DECIMAL NOT NULL   COMMENT 'Rate limit for download speed at time of polling',
	upload_speed_limit DECIMAL NOT NULL     COMMENT 'Rate limit for u0load speed at time of polling',
	provider_name VARCHAR(100) NOT NULL     COMMENT 'Name of the ISP'
) COMMENT 'Details of a polling recording';
