📄 Project Documentation – Amazon Automation with Selenium
1. Project Overview

This project demonstrates web automation on Amazon.in using Selenium WebDriver with Java.
It covers basic automation tasks such as product search, selection, cart operations, menu navigation, and extracting data from the webpage.

2. Objectives

Automate Amazon search and product selection.

Handle multiple windows and dropdowns.

Perform add-to-cart functionality.

Interact with the hamburger menu and close it programmatically.

Count and print all links available on the homepage.

3. Features Implemented

✔️ Launches Amazon.in homepage
✔️ Searches for “Dairy Milk”
✔️ Selects product (Cadbury Dairy Milk Silk Oreo Chocolate Bars, 58.5 g)
✔️ Switches to new tab & selects quantity (e.g., 2)
✔️ Adds product to Cart
✔️ Navigates to Mobiles & Computers from hamburger menu
✔️ Closes the menu using close button (X)
✔️ Extracts and prints all available links (a tags)

4. Technologies Used

Programming Language: Java (JDK 8 or above)

Automation Tool: Selenium WebDriver

Browser Driver: ChromeDriver

IDE: Eclipse 

Build Tool: Maven (optional for dependency management)

5. Project Structure
amazon/
│── src/
│   └── amazon/
│       └── Launch.java
│── pom.xml   (if Maven is used)
│── README.md

6. Workflow Diagram

Step 1: Open Amazon → Search product
Step 2: Click product → Switch to new window
Step 3: Select quantity → Add to cart
Step 4: Navigate hamburger menu → Mobiles & Computers
Step 5: Close menu → Extract all links → Print

7. How to Run the Project

Install Java JDK and configure environment variables.

Install an IDE like Eclipse or IntelliJ IDEA.

Download and install ChromeDriver (same version as Chrome browser).

Clone the repository:

git clone https://github.com/your-username/amazon-automation.git


Update the ChromeDriver path in Launch.java:

System.setProperty("webdriver.chrome.driver", "C:\\path\\to\\chromedriver.exe");


Run the program.

8. Sample Output
Total Links Found: 212
Today's Deals
Mobiles
Customer Service
Electronics
Fashion
...

9. Future Enhancements

🔹 Convert project into a Maven project with pom.xml.
🔹 Add TestNG or JUnit for structured test cases.
🔹 Implement Page Object Model (POM) for maintainability.
🔹 Automate multiple products and cart scenarios.

10. Author

👨‍💻 Santhi Senthil
Third-Year IT Student | Data Analyst | Web Developer | Automation Enthusiast

📧 Contact: [your-email@example.com
]
