def newGit(repo)
{
  git "${repo}"
}
def newMaven()
{
sh 'mvn package'
}
def newDeploy(jobname,ip,context)
{

  sh "scp /var/lib/jenkins/workspace/${jobname}/webapp/target/webapp.war ubuntu@${ip}:/var/lib/tomcat9/webapps/${context}.war"

}
def newTest(jobname)
{

  sh "java -jar /var/lib/jenkins/workspace/${jobname}/testing.jar"

}
  


