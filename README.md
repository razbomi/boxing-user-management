# Central User Service (micro-service)

Store postgres https://elements.heroku.com/addons/heroku-postgresql

Monitor new-relic https://elements.heroku.com/addons/newrelic

Stats graphite https://elements.heroku.com/addons/hostedgraphite

Logs papertrail https://elements.heroku.com/addons/papertrail or

# Blazemeter

Add a (Blazemeter Taurus)[http://gettaurus.org/] test, make sure that your Blasemeter is connected to Newrelic

```
---
execution:
- concurrency: 10
  ramp-up: 1s
  hold-for: 1m
  scenario: quick-test

scenarios:
  quick-test:
    requests:
    - https://boxing-user-management.herokuapp.com
```

#Newrelic Add-On

Enable add-on by running heroku addons:create newrelic

Enable it by adding -javaagent:target/dependency/newrelic-agent.jar to your JAVA_OPTS.

Customise the newrelic.yml using the following environment vars
-- NEW_RELIC_APP_NAME

The following have values provided by heroku add-on
-- NEW_RELIC_LICENSE_KEY
-- NEW_RELIC_LOG="stdout"

[newrelic java|http://newrelic.com/java]

[newrelic java agent|https://docs.newrelic.com/docs/agents/java-agent]

[newrelic add-on|https://elements.heroku.com/addons/newrelic]

[newrelic add-on java|https://devcenter.heroku.com/articles/newrelic#java-installation-and-configuration]

# Deployment via Travis

https://docs.travis-ci.com/user/languages/java/

# Java specifics

https://devcenter.heroku.com/articles/java-support

https://devcenter.heroku.com/articles/config-vars

