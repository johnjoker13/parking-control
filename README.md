# parking-control
A simple Spring-Boot application for a vehicles parking control.
# Built with
  - Spring-Boot
  - Docker
  - Postgresql
  - JPA
  - Hibernate
# Installation guide
 - Make sure you have Java 8+ installed in your PC
 - Make sure you have Docker installed in your PC
 - After cloning the project go to parking-control dir and then run: mvn install
 - Then, run: docker-compose up -d
 # Usage
  ## Routes
   - POST "/parking-spot"
     - example JSON: 
      ```
      {
	      "parkingSpotNumber": "3005",
	      "licensePlateCar": "CCC1237",
	      "brandCar": "BMW",
	      "modelCar": "X1",
	      "colorCar": "Black",
	      "responsibleName": "Erick",
	      "apartment": "802",
	      "block": 10
      }
      ```
  - GET "/parking-spot"
  - GET "/parking-spot/{id}"
  - GET "/parking-spot?page=0&sort=registrationDate,ASC"
  - PUT "/parking-spot/{id}"
  - DELETE "/parking-spot/{id}"
