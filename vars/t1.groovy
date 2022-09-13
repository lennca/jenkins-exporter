/* groovylint-disable CompileStatic */
/* groovylint-disable-next-line NoDef */
import jenkins.model.Jenkins

def getInstance() {
    def test = Jenkins.instance.getJobNames()
    if (test == null) {
        echo 'Null!!!!'
        return
    }
    for (element in test) {
      echo "${element}"
    }
}

return this