#!/bin/bash

wsgen -verbose -cp ./target/classes/ -d service_description  se.kth.webservice.second.service.AuthenticationService -wsdl
