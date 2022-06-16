# Maybe is needed run this
```
eval $(minikube -p minikube docker-env)
```
# Create the docker image
```
cd app
minikube image build -t hugocasiano/hello-world ./app
```
# Run kubernetes pod
```
kubectl create -f helloworld.yml
```
# Check if is running
```
kubectl get pods
```
it must be completed
```
hugocasiano-hello-world-87spf    0/1     Completed   0              99s
```
check logs to see if run ok
```
kubectl logs hugocasiano-hello-world-87spf
```
it must show this:
```
Hello World!
```
