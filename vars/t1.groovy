/* groovylint-disable CompileStatic */
/* groovylint-disable-next-line NoDef */
import jenkins.model.Jenkins

jenkins = Jenkins.instance

def getInstance() {
    def test = jenkins.getJobNames()
    if (test == null) {
        echo 'Null!!!!'
        return
    }
    for (element in test) {
      echo "${element}"
    }
}

return this