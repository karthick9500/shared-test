def call()
{


  sh "curl -i -H 'Authorization : Basic a2FydGhpY2s6YWRtaW4xMjM=' -H 'Content-Type:application/json'  -H 'X-Requested-By:MyClient' -H 'Accept:application/json' --insecure X GET 'https://localhost:9002/management/weblogic/latest/edit/appDeployments'"
}
