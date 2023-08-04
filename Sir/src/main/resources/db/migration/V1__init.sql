CREATE TABLE IF NOT EXISTS busstop(
id SERIAL,
name VARCHAR(100) NOT NULL,
PRIMARY KEY(id)
);

CREATE TABLE IF NOT EXISTS line(
id SERIAL,
number INT NOT NULL,
PRIMARY KEY(id)
);

CREATE TABLE IF NOT EXISTS route(
id SERIAL,
name VARCHAR(100) NOT NULL,
direction VARCHAR(150) NOT NULL,
line_id INT,
cant_busstop INT,
PRIMARY KEY(id),
FOREIGN KEY(line_id) REFERENCES line(id)

);


CREATE TABLE IF NOT EXISTS busstop_route(
id SERIAL,
orden INT NOT NULL,
busstop_id INT NOT NULL,
route_id INT,
tiempo INT,
PRIMARY KEY(id),
UNIQUE(busstop_id,route_id),
FOREIGN KEY(busstop_id) REFERENCES busstop(id),
FOREIGN KEY(route_id) REFERENCES route(id)
);