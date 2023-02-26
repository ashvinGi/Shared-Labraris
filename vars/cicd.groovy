def newgit(repo)
{
  git "${repo}"
}
def maven()
{
sh 'mvn package'
}
