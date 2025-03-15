#AI-Email-Assistant

## Description

**AI-Email-Assistant** is an AI-powered email assistant that streamlines email communication.  

It features:  
- A **Spring Boot** backend that provides an API for generating email responses.  
- A **React** frontend for an interactive user interface.  
- A **browser extension** built with **Manifest V3**, which integrates seamlessly with **Gmail**.  

Users can choose from three response tones to match their communication style:  
- **Professional**  
- **Casual**  
- **Friendly**  


## Setup and Installation

### Backend

1. Clone the repository:

   ```bash
   git clone <repository-url>
   cd email-writer-sb
   ```

2. Build the project using Maven:

   ```bash
   mvn clean install
   ```

3. Run the application:
   ```bash
   mvn spring-boot:run
   ```

### Extension

1. Navigate to the `email-writer-ext` directory.
2. Load the extension in your browser:
   - For Chrome: Go to `chrome://extensions/`, enable "Developer mode," and click "Load unpacked." Select the `email-writer-ext` directory.

## API Endpoints

### Generate Email

- **Endpoint:** `/api/email/generate`
- **Method:** `POST`
- **Request Body:**
  ```json
  {
    "emailRequest": {
      // Include the necessary fields for the email request
    }
  }
  ```
- **Response:**
  - Returns a generated email reply as a string.

## Extension Features
- **Name:** Email Writer Assistant
- **Description:** AI-powered email reply generator that integrates with Gmail.
- **Permissions:** Active tab access, storage.
- **Content Scripts:** Runs on Gmail pages to enhance user experience.

![Screenshot 2025-03-15 202542](https://github.com/user-attachments/assets/58828891-9117-47b0-a830-b575f3d385c9)

![Screenshot 2025-03-15 202733](https://github.com/user-attachments/assets/7fd02c74-52fe-4d5b-8870-d0798dd985af)

![Screenshot 2025-03-15 202818](https://github.com/user-attachments/assets/d3660f82-1343-453c-9303-909cbf5a03dd)



