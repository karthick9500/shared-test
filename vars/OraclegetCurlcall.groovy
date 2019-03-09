def call()
{

  def patchOrg = """
  {"name": "deployer",
  "sourcePath": "/deployments/fairShare.war"}
  """

  sh "curl -i X POST -d '$patchOrg' -H 'Authorization:Basic a2FydGhpY2s6YWRtaW4xMjM=' -H 'Content-Type:application/json'  -H 'X-Requested-By:MyClient' -H 'Accept:application/json' --insecure  'https://localhost:9002/management/weblogic/latest/edit/appDeployments'"
}
