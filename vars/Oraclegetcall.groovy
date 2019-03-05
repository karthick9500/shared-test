@Grab(group='org.codehaus.groovy.modules.http-builder', module='http-builder', version='0.7.1')

import groovyx.net.http.*
import groovyx.net.http.ContentType.*
import groovyx.net.http.Method.*
import net.sf.json.*







def call()
{
script{

  def patchOrg = """
  {"name": "deployer",
  "sourcePath": "/deployments/fairShare.war"}
  """
  def response = httpRequest ignoreSslErrors: true, customHeaders: [[name: 'Content-Type', value: 'application/json'],[name: 'Accept', value: 'application/json'],[name: 'X-Requested-By', value: 'MyClient']], httpMode: 'POST', requestBody: patchOrg, authentication :'oracle-call', url: "https://localhost:9002/management/weblogic/latest/edit/appDeployments"


  println(response.content)
}

}
