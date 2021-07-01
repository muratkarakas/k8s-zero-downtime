
# K8s zero downtime deployment samples

## Spring Boot Based Implementation

* navigate to demo.zero.downtime.sb
* build with 'build.sh'
* Deploy to K8s with 'kubectl apply -f platform/k8s'
* Perform load test with [JMeter](https://jmeter.apache.org/) (load_test.jmx)
* change requests.cpu value and apply with  kubectl apply -f platform/k8s/02_deployment.yml
* Monitor JMeter Results for error response
