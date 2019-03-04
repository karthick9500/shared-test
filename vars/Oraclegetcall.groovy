@Grab(group='org.codehaus.groovy.modules.http-builder', module='http-builder', version='0.7.1')

import groovyx.net.http.*
import groovyx.net.http.ContentType.*
import groovyx.net.http.Method.*
import net.sf.json.*







def call()
{

new HttpGet(script:this).run()
  println "printing from library"
}
