def call()
{


  sh "curl -i -X GET 'https://localhost:9002/management/weblogic/latest/edit/appDeployments'
}
