# spring-boot-docker-kubernetes
Basic App which integrates Spring Boot, Docker and Kubernetes

# Using Minikube
Minikube is a local kubernetes.
## Install all tools
https://computingforgeeks.com/how-to-install-minikube-on-ubuntu-debian-linux/
## Use docker images on minikube
https://levelup.gitconnected.com/two-easy-ways-to-use-local-docker-images-in-minikube-cd4dcb1a5379
https://medium.com/swlh/how-to-run-locally-built-docker-images-in-kubernetes-b28fbc32cc1d
to check files and run example go to the folder basic-kubernetes-with-echo-app


### Common errors
```
sudo kubectl get nodes
The connection to the server localhost:8080 was refused - did you specify the right host or port?
```
kubectl is not running, so run:
```
sudo minikube start
```
