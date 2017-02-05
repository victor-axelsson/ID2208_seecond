#!/bin/bash

wsgen -verbose -cp ./server/target/classes/ -d service_description  se.kth.webservice.second.service.Authentication -wsdl
