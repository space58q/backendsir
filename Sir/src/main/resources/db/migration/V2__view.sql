CREATE VIEW busstop_route_view AS
SELECT br.*, b.name AS namebusstop
FROM busstop_route br
JOIN busstop b ON br.busstop_id = b.id;