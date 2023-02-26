def newgit(repo)
{
  git "${repo}"

}

def newMaven()
{
sh 'mvn package'
}

