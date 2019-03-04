@Grab(group='org.codehaus.groovy.modules.http-builder', module='http-builder', version='0.7.1')

import groovyx.net.http.*
import groovyx.net.http.ContentType.*
import groovyx.net.http.Method.*
import net.sf.json.*


def oracleHttpObj
def BasicAuth = 'Basic a2FydGhpY2s6YWRtaW4xMjM='

oracleHttpObj = new HTTPBuilder('https://localhost:9002')
oracleHttpObj.ignoreSSLIssues()




def call()
{

  println "printing from library"
}
