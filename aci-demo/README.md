
Welcome to the repository for my Cloud Infrastructure Management and Operations project, focused on deploying a Spring Boot-based Finance application using Azure services by Microsoft with Docker and GitHub Actions to Build the project.

This Project, built as a part of my Devops and cloud-native learning, showcases practical end-to-end in Dockerization, CI/CD pipelines, container registries and deploying into a production-grade environment using Azure Container Instance (ACI) and Azure Container Registry (ACR). In this project I added a feature of custom domain (via GoDaddy) mapped to the live Azure-hosted Container.  

### Project Highlights

-  Spring Boot application containerized with Docker

-  CI pipeline created using GitHub Actions

-  Image pushed to Azure Container Registry (ACR)

-  Deployment to Azure Container Instance (ACI)

-  Custom domain setup using GoDaddy DNS (CNAME)

Project Breakdown and Task List

**Task 1 : Spring Boot Application Setup** 

- Created a basic Spring Boot finance application

- Added UI from Mini Finance  (Tooplate #2135)

- Built `pom.xml` and verified local execution

> Here are some screenshot of the webpage running locally.   

![Screenshot 1](images/20250719125658.png)

![Screenshot 2](images/20250719125738.png)

![Screenshot 3](images/20250719125802.png)

![Screenshot 4](images/20250719125817.png)

![Screenshot 5](images/20250719125836.png)

**Task 2 : Docker and containerization**

- Wrote Dockerfile for openjdk:17-jdk-slim base image

- Fixed auto-HTTPS redirect issues in Spring Boot

- Updated `application.properties` to avoid SSL by default

`Application.properties` file

![Application Properties](images/20250719130212.png)

`Dockerfile`

![Dockerfile](images/20250719130324.png)

**Task 3 : Azure Container Registry (ACR Setup)**

- Created ACR named `aaravregistry`

- Retrieved credentials using Azure CLI

- Logged in to ACR and pushed image `acidemo:latest`

![[Pasted image 20250719130623.png]]

**Task 4 : GitHub Actions CI Workflows**

- Configured `.github/workflows/ci.yml`

- Set up secrets for ACR login (username & password)

- Triggered on push to `Project` branch

- Built & pushed Docker image automatically to ACR

1. `ci.yml file`

![[Pasted image 20250719130913.png|1009]]

2. Secrets for ACR login
 
 ![[Pasted image 20250719131215.png]]

3. Actions Tab on GitHub

![Actions Tab on GitHub](images/20250719131453.png)

**Task 5 : Deploy to Azure Container Instance** 

- Created ACI named `finance-container`

- Pulled image from ACR

- Assigned public IP with port 8080

![ACI Deployment Screenshot](images/WhatsApp%20Image%202025-07-18%20at%2018.02.13_2819ea6f.jpg)

**Task 6 : Custom Domain Mapping via GoDaddy** 

- Domain: `aaravdevops.xyz` (already owned)

- Created CNAME record in DNS for `celebal.aaravdevops.xyz`

- Mapped to ACI's public DNS

- Final URL: http://celebal.aaravdevops.xyz:8080

![Custom Domain Mapping](images/20250719132754.png)

 Note: If the URL shows this type of error

![HTTP Error Example](images/20250719131907.png)

Than use incognito mode or private Tab because this webserver only works with `HTTP` not `Https` but most of the browsers redirect it on `HTTPS` service even with copy paste URL. To allocate my webserver of `HTTPS` also I have to buy the  SSL Certificate. Or by using Azure Front Door Service I have to pay a lot to use that.  

### Some more details regarding the project

1. GitHub Secrets Used
	- `ACR_USERNAME`: Azure Container Registry username

	- `ACR_PASSWORD`: One of the password values from ACR credential JSON

	- Stored via GitHub > Repo > Settings > Secrets & Variables > Actions 

2. Repository Structure

![Repository Structure 1](images/20250719133126.png)
![Repository Structure 2](images/20250719133247.png)

## Future Enhancements

- Add Azure Front Door for HTTPS termination

- Use Azure DevOps Release Pipelines (already experimented)

- Add monitoring and alerting via Azure Monitor

## Acknowledgements

-  Mini Finance Template 

- Microsoft Azure for free-tier usage

- GitHub Actions for seamless CI

## Final Outcome

Your app is now live at: 🔗 http://project.aaravdevops.xyz

But remember use private window to open and check after pasting the URL as well it should be `HTTP` not `HTTPS`. 