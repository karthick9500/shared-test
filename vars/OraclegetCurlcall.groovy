def call()
{


  sh "curl -o /dev/null -s -X GET 'https://localhost:9002/management/weblogic/latest/edit/appDeployments'
}
