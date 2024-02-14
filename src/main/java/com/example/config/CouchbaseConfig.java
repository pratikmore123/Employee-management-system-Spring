package com.example.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.couchbase.config.AbstractCouchbaseConfiguration;

@Configuration
public class CouchbaseConfig extends AbstractCouchbaseConfiguration {

    @Override
    public String getConnectionString() {
        // Return the Couchbase connection string (e.g., couchbase://localhost)
        return "couchbase://localhost:8081";
    }

    @Override
    public String getUserName() {
        // Return the Couchbase username
        return "test";
    }

    @Override
    public String getPassword() {
        // Return the Couchbase password
        return "pratikmore";
    }

    @Override
    public String getBucketName() {
        // Return the Couchbase bucket name
        return "employee";
    }
}

