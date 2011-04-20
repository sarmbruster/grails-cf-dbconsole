## Introduction

This is a small Grails application intended to be deployed on http://www.cloudfoundry.com and gives access to the underlying database using a mini grails application embedding the [dbconsole plugin](http://www.grails.org/plugin/dbconsole).
The original idea for this was brought up by Burt Beckwith in a reply on grail-user mailinglist, see http://grails.1312388.n4.nabble.com/cloudfoundry-deployment-trouble-caused-by-database-migrations-plugin-td3460656.html#a3461668

## Usage

* Install [Grails 1.3.7](http://dist.springframework.org/release/GRAILS/grails-1.3.7.zip)
* Clone the project 
* setup your cloudfoundry credentials as described in [Peter Ledbrook's blog post](http://blog.springsource.com/2011/04/12/one-step-deployment-with-grails-and-cloud-foundry/)
* push the application: `grails prod cf-push`
* be aware to choose a different name for the deployed app
* look up the db connection parameters: `grails cf-logs`
* access your pushed app using http://<appname>.cloudfoundry.com, select mysql database type, fill in host, dbname, user and password from cf-logs output
