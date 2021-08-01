docker pull selenium/node-chrome-debug

docker run --name googleContainer -d -p 4444:4444 -p 5800:5800 -v /Users/apunnuri/practiceVolume:/Users/apunnuri/practiceVolume selenium/standalone-chrome-debug

sleep 30

docker ps

echo "Running the test cases"

mvn clean install test

docker stop googleContainer

docker rm $(docker ps --filter status=exited -q)
