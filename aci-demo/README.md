
# Cloud Infrastructure Management & Operations Project

Welcome to the repository for my Cloud Infrastructure Management and Operations project, focused on deploying a Spring Boot-based Finance application using Azure services by Microsoft with Docker and GitHub Actions to Build the project.

This project, built as a part of my DevOps and cloud-native learning, showcases practical end-to-end implementation in Dockerization, CI/CD pipelines, container registries, and deployment into a production-grade environment using Azure Container Instance (ACI) and Azure Container Registry (ACR). It also includes custom domain mapping (via GoDaddy) to the live Azure-hosted container.

### Project Highlights

- Spring Boot application containerized with Docker
- CI pipeline created using GitHub Actions
- Image pushed to Azure Container Registry (ACR)
- Deployment to Azure Container Instance (ACI)
- Custom domain setup using GoDaddy DNS (CNAME)

---

## Project Breakdown and Task List

### Task 1: Spring Boot Application Setup

- Created a basic Spring Boot finance application
- Added UI from Mini Finance (Tooplate #2135)
- Built `pom.xml` and verified local execution

> Here are some screenshots of the webpage running locally.

![alt text](<images/All the images/Pasted image 20250719125658.png>)
![alt text](<images/All the images/Pasted image 20250719125738.png>)
![alt text](<images/All the images/Pasted image 20250719125802.png>)
![alt text](<images/All the images/Pasted image 20250719125817.png>)
![alt text](<images/All the images/Pasted image 20250719125836.png>)

### Task 2: Docker and Containerization

- Wrote Dockerfile using `openjdk:17-jdk-slim` base image
- Fixed auto-HTTPS redirect issues in Spring Boot
- Updated `application.properties` to disable SSL by default

**application.properties**

![Application Properties](<images/All the images/Pasted image 20250719130212.png>)

**Dockerfile**

![Dockerfile](<images/All the images/Pasted image 20250719130324.png>)

### Task 3: Azure Container Registry (ACR Setup)

- Created ACR named `aaravregistry`
- Retrieved credentials using Azure CLI
- Logged in to ACR and pushed image `acidemo:latest`

![ACR Push Screenshot](<images/All the images/Pasted image 20250719130623.png>)

### Task 4: GitHub Actions CI Workflow

- Configured `.github/workflows/ci.yml`
- Set up secrets for ACR login (username & password)
- Triggered on push to `Project` branch
- Built & pushed Docker image automatically to ACR

1. `ci.yml` file:

![CI Workflow](<images/All the images/Pasted image 20250719130913.png>)

2. GitHub Secrets setup:

![Secrets](<images/All the images/Pasted image 20250719131215.png>)

3. GitHub Actions tab:

![GitHub Actions](<images/All the images/Pasted image 20250719131453.png>)

### Task 5: Deploy to Azure Container Instance

- Created ACI named `finance-container`
- Pulled image from ACR
- Assigned public IP with port 8080

![ACI Deployment](images/All%20the%20images/WhatsApp%20Image%202025-07-18%20at%2018.02.13_2819ea6f.jpg)

### Task 6: Custom Domain Mapping via GoDaddy

- Domain: `aaravdevops.xyz`
- Created CNAME record in DNS for `celebal.aaravdevops.xyz`
- Mapped to ACI's public DNS
- Final URL: http://celebal.aaravdevops.xyz:8080

![Custom Domain Mapping](<images/All the images/Pasted image 20250719132754.png>)

> Note: If the URL shows an error like the image below, open it in **Incognito Mode**. The app is served on HTTP only. Modern browsers may automatically redirect to HTTPS, which will fail without a certificate.

![HTTP Error](<images/All the images/Pasted image 20250719131907.png>)

---

### Additional Information

**GitHub Secrets Used:**

- `ACR_USERNAME`: Azure Container Registry username
- `ACR_PASSWORD`: One of the password values from ACR credential JSON
- Stored in: GitHub > Repository > Settings > Secrets & Variables > Actions

**Repository Structure:**

![Repo Structure 1](<images/All the images/Pasted image 20250719133126.png>)

![Repo Structure 2](<images/All the images/Pasted image 20250719133247.png>)

---

## Future Enhancements

- Add Azure Front Door for HTTPS termination
- Use Azure DevOps Release Pipelines
- Add monitoring and alerting via Azure Monitor

## Acknowledgements

- Mini Finance Template (Tooplate)
- Microsoft Azure (Free Tier)
- GitHub Actions

## Final Outcome

Your app is live at: 🔗 http://celebal.aaravdevops.xyz:8080 
Use **HTTP**, not HTTPS. Open in **Private/Incognito mode** to avoid forced HTTPS redirection.
