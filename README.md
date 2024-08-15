# iNotes

## Getting Started

### Prerequisites

- **Java Development Kit (JDK)**
- **Eclipse IDE** (or any Java IDE)
- **Apache Tomcat Server**
- **MySQL Database**

### Setup Instructions

1. **Clone the Repository**
    ```bash
    git clone https://github.com/your-username/iNotes.git
    ```
   
2. **Import the Project into Eclipse**
    - Open Eclipse and select `File > Import > Existing Projects into Workspace`.
    - Browse to the location where you cloned the repository and import the project.

3. **Set Up the MySQL Database**
    - Create a new MySQL database called `iNotes`.
    - Run the following SQL script to create the `notes` table:
    ```sql
    CREATE DATABASE iNotes;
    USE iNotes;

    CREATE TABLE notes (
        id INT AUTO_INCREMENT PRIMARY KEY,
        title VARCHAR(255) NOT NULL,
        content TEXT NOT NULL,
        timestamp TIMESTAMP DEFAULT CURRENT_TIMESTAMP
    );
    ```
   
4. **Configure Database Connection**
    - Open the `DBConnection.java` file located in `src/com/inotes`.
    - Update the database URL, username, and password according to your MySQL setup.

    ```java
    private static final String DB_URL = "jdbc:mysql://localhost:3306/iNotes";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "your_password";
    ```

5. **Deploy the Project**
    - Right-click on the project in Eclipse and select `Run As > Run on Server`.
    - Choose Apache Tomcat as the server and click `Finish`.

6. **Access the Application**
    - Open your web browser and navigate to `http://localhost:8080/iNotes`.

## Usage

- **Home Page**: Displays the list of all notes with options to add, update, or delete them.
- **Add Note**: Click on the "Add Note" button to create a new note.
- **Update Note**: Click on the "Edit" link next to a note to modify its content.
- **Delete Note**: Click on the "Delete" link next to a note to remove it.

---

**Happy Coding!**
