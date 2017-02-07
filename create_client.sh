#!/bin/bash

wsimport -s client/src/main/java/  -d client/client_description  http://localhost:9091/authentication?wsdl
wsimport -s client/src/main/java/  -d client/client_description  http://localhost:9091/itinerary?wsdl
wsimport -s client/src/main/java/  -d client/client_description  http://localhost:9091/bookings?wsdl
wsimport -s client/src/main/java/  -d client/client_description  http://localhost:9091/tickets?wsdl