# Football API

## A Comprehensive API for Managing Football Data

Welcome to the Football API project! This backend application is designed to manage  data
efficiently. It provides CRUD operations for players, teams, matches and includes functionality
for processing and analyzing football data from CSV files and identifies the pair of football players who have played 
together in common matches for the longest time and the combined duration for each of those matches.
Built with Java Spring Boot and PostgreSQL, this API offers
robust performance and flexibility for managing football data.


## Features

- Manage players, teams, matches, and match records.
- CRUD operations for all entities.
- Data import from CSV files.
- Efficient querying and data processing using PostgreSQL.
- Retrieve football player pairs who played together for the longest time.

## Installation and Usage

### Prerequisites

- Java 17 or later
- Maven 3.6 or later
- PostgreSQL 12 or later
- IntelliJ IDEA

### How to use this API

- Clone the repository from this link: https://github.com/looppp/Sirma-Academy/tree/main/Java/Java%202024%20Final%20Project%20Assignment
- Setup PostgreSQL and create an empty database named "football"
- Load the project inside IntelliJ
- Run the "FootballApiApplication" located in src/main/java/com.sirma.footballapi
- The application will start on http://localhost:8080 and it will load all the CSV files that are located in the /recources/csv folder

## API Endpoints

### Players

- **Get All Players**: `GET /api/players`  
  Retrieves a list of all players.

- **Get Player by ID**: `GET /api/players/{id}`  
  Retrieves a player by their ID.

- **Create Player**: `POST /api/players`  
  Creates a new player. The request body must include player details.

- **Update Player**: `PUT /api/players/{id}`  
  Updates an existing player. The request body must include updated player details.

- **Delete Player**: `DELETE /api/players/{id}`  
  Deletes a player by their ID.

### Teams

- **Get All Teams**: `GET /api/teams`  
  Retrieves a list of all teams.

- **Create Team**: `POST /api/teams/create`  
  Creates a new team. The request body must include team details.

- **Update Team**: `PUT /api/teams/{id}`  
  Updates an existing team. The request body must include updated team details.

- **Delete Team**: `DELETE /api/teams/{id}`  
  Deletes a team by their ID.

### Matches

- **Get All Matches**: `GET /api/matches`  
  Retrieves a list of all matches.

- **Get Match by ID**: `GET /api/matches/{id}`  
  Retrieves a match by its ID.

- **Create Match**: `POST /api/matches`  
  Creates a new match. The request body must include match details.

- **Update Match**: `PUT /api/matches/{id}`  
  Updates an existing match. The request body must include updated match details.

- **Delete Match**: `DELETE /api/matches/{id}`  
  Deletes a match by its ID.

### Player Pairs

- **Get Longest Playing Pair**: `GET /api/pairs`  
  Retrieves the pair of football players who played together for the longest time.

### Please note that due to foreign key constraints, the following limitations apply:

**Teams and Players**: Teams and players cannot be deleted if they are referenced by other entities
(e.g., players associated with teams, match records involving players).
Attempting to delete such entities will result in a constraint violation error.
Ensure that any associated data is handled appropriately before attempting to delete
a team or player.