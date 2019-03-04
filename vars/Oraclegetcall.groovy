@Grab(group='org.codehaus.groovy.modules.http-builder', module='http-builder', version='0.7.1')

import groovyx.net.http.*
import groovyx.net.http.ContentType.*
import groovyx.net.http.Method.*
import net.sf.json.*







def call()
{
script{
  def oracleHttpObj
  def BasicAuth = 'Basic a2FydGhpY2s6YWRtaW4xMjM='

  new HTTPBuilder('https://localhost:9002').request(Method.GET, ContentType.JSON){ req ->
    uri.path = "/management/weblogic/latest/edit/appDeployments"
    headers.'Authorization' = "$BasicAuth"
    //uri.query = [format:'json']
    //body = jsonBody

    response.success = { resp, json ->
        assert resp.status == 200
        println "sssssss"
        newItemId = json
        println "$newItemId"
    }
    // not logged in response
    response.'302' = { resp ->
        throw new Exception("Stopping at item POST: uri: " + uri + "\n" +
            "   You are not logging in properly. Item will not be created.")
    }
    response.failure = { resp, json ->
      println "failure"
      println json
    }

  println "printing from library"

}
}
