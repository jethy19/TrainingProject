# Spring Boot Setup and Source Code

In this project, I downloaded the Spring Boot Application with all the required dependencies from Spring Initializer. Then, I set up the project in Eclipse IDE and developed some endpoints which returned the configured HTML page. Below are the details, including screenshots of the source code and the result when the project runs on localhost port 9000.

## Source Code

![sourcecode1](https://github.com/user-attachments/assets/2cc8e87d-f68f-4769-ad62-e8bdc6171865)

## Code Output

### Localhost Port 9000

![springbootlocalhost9000](https://github.com/user-attachments/assets/13aa196c-7c25-4a6d-b597-4ee4900d08a4)

![springbootlocalhost9000_contents](https://github.com/user-attachments/assets/f4e671dd-fbf6-471d-b6b0-21272e02a72b)

![springbootlocalhost9000_lastpage](https://github.com/user-attachments/assets/e1798d04-64dc-4ec2-90f3-ce8827a1d24b)

# Pushing Into GitHub

Next, I pushed the same Spring Boot project into GitHub. The command sequence I used is as follows:
1. `git status`
2. `git add .`
3. `git commit -m "some message"`
4. `git push reponame`

Below are the screenshots of the process:

![github1](https://github.com/user-attachments/assets/095dbfa3-95f4-4c3f-ad08-40443984bd91)

![github2](https://github.com/user-attachments/assets/cd55bd78-3961-4f9e-9c54-7dddd9eea8e2)

# Jenkins Integration

Then, I installed Jenkins on my local system and integrated it with my GitHub repository to create a CI/CD pipeline. After this, whenever I push any changes into my GitHub repository, it automatically builds and checks whether the build is successful or fails. Below are the screenshots of the process:

![jenkins3](https://github.com/user-attachments/assets/9e486f97-bc20-446f-8381-ff1a98c58441)

![jenkins1](https://github.com/user-attachments/assets/02490e9e-d5d6-438a-a4d2-0d6e8e34d25c)

![jenkins2](https://github.com/user-attachments/assets/4ade115e-7418-44a3-9608-9ad9e7a1ed5a)

# Docker Image Creation

After all these processes, I created a Docker image of the project and then ran the Docker image to check that after creating the image of my Spring Boot project, I run the image in a different port, mapping the previous port 9000 to 9001. Below are the screenshots of the Docker image creation process and the Docker image running process.

## Image Creation

![docker1](https://github.com/user-attachments/assets/adb3b843-159f-490a-9101-96e8da12d2bb)

## Image Running
Here the Running Port is 9001

![docker2](https://github.com/user-attachments/assets/251266c7-23c2-49e2-bf73-ae8c360ad828)

### Localhost Port 9001

![dockerlocalhost9001](https://github.com/user-attachments/assets/5c0b6075-2774-4b2a-8a05-0f7175288d9a)

![dockerlocalhost9001_contents](https://github.com/user-attachments/assets/2d6b99b3-c66d-4169-9707-a85784cf32fc)

![dockerlocalhost9001_lastpage](https://github.com/user-attachments/assets/aee1a614-58af-40ca-9661-c6052e5e3d7e)

# Pushing Into DockerHub

Finally, I pushed the created image to DockerHub from where it can be pulled and used by anyone on any system. Below is the link to the DockerHub repository and the screenshots of the process:

[Docker Hub Repository: jj20/trainingproject](https://hub.docker.com/repository/docker/jj20/trainingproject/general)

![docker3](https://github.com/user-attachments/assets/5f208e91-7a65-4c78-8369-20ada42d75ee)

![dockerhub](https://github.com/user-attachments/assets/ee8ca536-9604-4a24-a071-7a57b795ec14)
