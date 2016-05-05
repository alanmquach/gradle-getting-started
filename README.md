# gradle-getting-started

A barebones Gradle app, which can easily be deployed to Heroku.

This application support the [Getting Started with Gradle on Heroku](https://devcenter.heroku.com/articles/getting-started-with-gradle-on-heroku) article - check it out.

## Development setup

Included in the configuration is the ability to create an [IntelliJ IDEA](https://www.jetbrains.com/idea/) project.

```sh
$ git clone https://github.com/alanmquach/gradle-getting-started.git
$ cd gradle-getting-started
$ ./gradlew idea
```

This will bootstreap your development environment by creating a `gradle-getting-started.ipr` file that you can open in IntelliJ IDEA.

## Running Locally

Make sure you have Java installed.  Also, install the [Heroku Toolbelt](https://toolbelt.heroku.com/).

```sh
$ ./gradlew stage
$ heroku local web
```

Your app should now be running on [localhost:5000](http://localhost:5000/).

If you're going to use a database, ensure you have a local `.env` file that reads something like this:

```
DATABASE_URL=postgres://localhost:5432/gradle_database_name
```

## Deploying to Heroku

```sh
$ heroku create
$ git push heroku master
$ heroku open
```

## Documentation

For more information about using Java on Heroku, see these Dev Center articles:

- [Java on Heroku](https://devcenter.heroku.com/categories/java)
