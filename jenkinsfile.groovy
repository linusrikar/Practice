pipeline {
agent any
stages {
stage('Some steps') {
steps {
...
}
}
}
post {
always {
	echo “Pipeline finished”
	bat ./performCleanUp.bat
}
}
}