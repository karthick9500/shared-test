def call()
{


  sh "curl -i -H 'Authorization : Basic a2FydGhpY2s6YWRtaW4xMjM=' --insecure X GET 'https://localhost:9002/management/weblogic/latest/edit/appDeployments'"
}
