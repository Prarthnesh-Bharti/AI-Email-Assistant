# Email Writer

## Description

Email Writer is a demo project that includes a Spring Boot backend and a browser extension for generating email replies. The backend provides an API for generating email responses, while the extension enhances the user experience by integrating with Gmail.

## Technologies Used

- **Backend:**
  - Spring Boot
  
- **Extension:**
  - Manifest V3
  - JavaScript 
  - CSS

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

