# Karate OAuth2 example 
This example covers the following
* Login to OAuth server
* Fetch JWT Bearer token
* Use the token to fetch user details

## Import Certificate
In case the certificate does not work import the certificate into your 
JDK keystort. 

### How to download the certificate from browser
* Goto the auth server login page
* Click on the certificate on the left of your browser url window
* Down the public key of the certificate as DER encoded binary file
* Import the certificate using java keytool command
```
keytool -import -alias certificatename -keystore \
\path\to\your\jdk\jre\lib\security\cacerts -file \
path\to\your\exported\certificate\certificatename.der
```

## Default Output
Default DEBUG is on. To turn off DEBUG add logback-test.xml file and change 
the following logger to INFO
```
<logger name="com.intuit.karate" level="INFO"/>
```

## Running tests
* To run individual test run only the specified Runner java file
* To run all test run TestRunner file
