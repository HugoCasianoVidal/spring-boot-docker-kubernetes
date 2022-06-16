eval $(minikube docker-env)

## Build and run using Docker
~/apache-maven-3.8.6-bin/apache-maven-3.8.6/bin/mvn clean
docker build -t hugocasiano/basic-spring-boot-docker:2 .
docker run -p 8080:8080 hugocasiano/basic-spring-boot-docker:2

## Build and run image in a pod (without a manifesto)
kubectl run basic-spring-boot-docker --image=hugocasiano/basic-spring-boot-docker:2 --image-pull-policy=Never

## Run a kubernetes cluster
kubectl apply -f deployment.yaml
kubectl get services

Check output:
NAME                  TYPE           CLUSTER-IP      EXTERNAL-IP   PORT(S)          AGE
kubernetes            ClusterIP      10.96.0.1       <none>        443/TCP          21h
spring-test-service   LoadBalancer   10.105.55.247   <pending>     8080:30431/TCP   50m

get minikubeip:
minikube ip

get resource:
curl 192.168.59.100:30431/hello






si sale este error aplicar esto
unable to resolve docker endpoint: open /home/hugo/.minikube/certs/ca.pem: permission denied

owner @{HOME}/.minikube/certs/* to: /var/lib/snapd/apparmor/profiles/snap.docker.docker, and then run: apparmor_parser -r /var/lib/snapd/apparmor/profiles/snap.docker.docker