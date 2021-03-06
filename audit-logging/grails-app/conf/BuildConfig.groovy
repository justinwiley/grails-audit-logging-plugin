/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
*/

grails.project.class.dir = "target/classes"
grails.project.test.class.dir = "target/test-classes"
grails.project.test.reports.dir = "target/test-reports"

grails.project.dependency.resolver = "maven" // or ivy
grails.project.dependency.resolution = {
    inherits("global") {
    }

    log "warn"

    repositories {
        grailsCentral()
        mavenLocal()
        mavenCentral()
    }

    dependencies {
        /*
        runtime 'dom4j:dom4j:1.6.1', {
            excludes 'jaxen', 'jaxme-api', 'junitperf', 'pull-parser', 'relaxngDatatype', 'stax-api',
                     'stax-ri', 'xalan', 'xercesImpl', 'xpp3', 'xsdlib', 'xml-apis'
        }
        */
    }

    plugins {
        build(":release:3.0.1", ":rest-client-builder:1.0.3") {
            export = false
        }
    }
}
