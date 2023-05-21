def newGit(repo)
{
  git "${repo}"
}
def newMaven()
{
sh 'mvn package'
}
def newDeploy(${env.JOB_NAME},ip,context)
{

  sh "scp /var/lib/jenkins/workspace/${env.JOB_NAME}/webapp/target/webapp.war ubuntu@${ip}:/var/lib/tomcat9/webapps/${context}.war"

}
def newTest(${env.JOB_NAME})
{

  sh "java -jar /var/lib/jenkins/workspace/${env.JOB_NAME}/testing.jar"

}
  


