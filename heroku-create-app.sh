#!/usr/bin/env sh

heroku apps:create register-of-vehicles
heroku addons:create heroku-postgresql:hobby-dev --app register-of-vehicles