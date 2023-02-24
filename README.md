Exercise
==

## Part 1

Build a Spring boot application with:
- An endpoint /ping responding the following response:

```json
{"message":"pong"}
```


## Part 2 

Make this applicattion run in a container, using Docker.

- Build the dockerfile
- Add the documentation how to run the dockerfile
- Explain how to request to the /ping endpoing when the container is up


## Part 3

- Create a database, with a table called PERSON with ID and NAME ;
- Connect your spring boot application to the database
- Create an endpoing called /person
- Make this endpoing to respond something like:
```json
{
    "persons": [
        {
            "id": "1",
            "name": "John Doe"
        }
    ]
}