# Email Writer

## Description

**Email Writer** is an AI-powered email assistant that streamlines email communication. It features a **Spring Boot** backend, a **React** frontend, and a **browser extension** built with **Manifest V3**. The backend provides an API for generating email responses, while the extension integrates with **Gmail**, offering a seamless and efficient writing experience. Users can choose from **Professional**, **Casual**, or **Friendly** tones for their replies.

## Technologies Used

- **Backend:**  
  - Spring Boot  

- **Frontend:**  
  - React  

- **Browser Extension:**  
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

![Screenshot 2025-03-15 202542](https://github.com/user-attachments/assets/58828891-9117-47b0-a830-b575f3d385c9)

![Screenshot 2025-03-15 202733](https://github.com/user-attachments/assets/7fd02c74-52fe-4d5b-8870-d0798dd985af)

![Screenshot 2025-03-15 202818](https://github.com/user-attachments/assets/d3660f82-1343-453c-9303-909cbf5a03dd)



