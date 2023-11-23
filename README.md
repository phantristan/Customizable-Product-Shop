<strong>** DO NOT DISTRIBUTE OR PUBLICLY POST SOLUTIONS TO THESE LABS. MAKE ALL FORKS OF THIS REPOSITORY WITH SOLUTION CODE PRIVATE. PLEASE REFER TO THE STUDENT CODE OF CONDUCT AND ETHICAL EXPECTATIONS FOR COLLEGE OF INFORMATION TECHNOLOGY STUDENTS FOR SPECIFICS. ** </strong>

# WESTERN GOVERNOR UNIVERSITY 
## D287 – JAVA FRAMEWORKS
Welcome to Java Frameworks! This is an opportunity for students to implement user interfaces and learn to leverage existing frameworks, assets, and content for object-oriented programming.
FOR SPECIFIC TASK INSTRUCTIONS AND REQUIREMENTS FOR THIS ASSESSMENT, PLEASE REFER TO THE COURSE PAGE.
## BASIC INSTRUCTIONS
For this project, you will use the Integrated Development Environment (IDE) link in the web links section of this assessment to install the IDE, IntelliJ IDEA (Ultimate Edition). All relevant links are on the course page. Please refer to the course of study for specific links. You will sign up for a free student license using your WGU.edu email address. Please see the “IntelliJ Ultimate Edition Instructions” attachment for instructions on how do this. Next you will download the “Inventory Management Application Template Code” provided in the web links section and open it in IntelliJ IDEA (Ultimate Edition). You will upload this project to a private external GitLab repository and backup regularly. As a part of this, you have been provided with a base code (starting point). 

## SUPPLEMENTAL RESOURCES  
1.	How to clone a project to IntelliJ using Git?

> Ensure that you have Git installed on your system and that IntelliJ is installed using [Toolbox](https://www.jetbrains.com/toolbox-app/). Make sure that you are using version 2022.3.2. Once this has been confirmed, click the clone button and use the 'IntelliJ IDEA (HTTPS)' button. This will open IntelliJ with a prompt to clone the proejct. Save it in a safe location for the directory and press clone. IntelliJ will prompt you for your credentials. Enter in your WGU Credentials and the project will be cloned onto your local machine.  

2. How to create a branch and start Development?

- GitLab method
> Press the '+' button located near your branch name. In the dropdown list, press the 'New branch' button. This will allow you to create a name for your branch. Once the branch has been named, you can select 'Create Branch' to push the branch to your repository.

- IntelliJ method
> In IntelliJ, Go to the 'Git' button on the top toolbar. Select the new branch option and create a name for the branch. Make sure checkout branch is selected and press create. You can now add a commit message and push the new branch to the local repo.

## SUPPORT
If you need additional support, please navigate to the course page and reach out to your course instructor.
## FUTURE USE
Take this opportunity to create or add to a simple resume portfolio to highlight and showcase your work for future use in career search, experience, and education!

Notes:

Task C -
    mainscreen.html
        Line 14 & 25 - Change name to reflect custom shop
Task D -
    mainscreen.html
        Line 18 - 22 - Added a nav section to link to about page
    about.html
        Created About Page
    AboutController.java
        Create controller for "about" page
**mental note, check if mainscreen button is formatted correctly on about page
Task E - 
    BootStrapData.java
        Line 42 - If statement to check if partRepository and productRepository are empty
        Line 44 - 92 - Create parts
        Line 108 - 128 - Create products
**mental note, check products are created correctly
Task F - 
    mainscreen.html
        Line 91 - 94 - Add "Buy Now" button
    MainScreenControllerr.java
        Line 13 - 15 - Import statements
        Line 58 - 63 - Create controller method
    ProductService.java
        Line 20 - Define decrementInventory method
    ProductServiceImpl.java
        Line 70 - 82 - Implement decrementInventory
    buyconfirmation.html
        Create new file for confirmation page
**mental note, check buyconfirmation links correctly
Task G -
    Part.java
        Line 111 - 131 - Add minimum fields, maximum fields, getter methods, and setter methods
        Line 133 - 135 - Checks if inventory is between/at minimum/maximum value
    BootStrapData.java
        Line 50 - 51, 60 - 61, 70 - 71, 80 - 81, 90 - 91 - Set min and max inventory
    InhousePartForm.html
        Line 23 - 24 - Add min/max text inputs
    OutsourcedPartForm.html
        Line 24 - 25 - Add min/max text inputs
    application.properties
        Line 6 - Change file name
    AddInHousePartController.java
        Line 43 - 45 - Uses isInventoryValid method to generate error message
    AddOutsourcedPartController.java
        Line 44 - 46 - Uses isInventoryValid method to generate error message
Task H -
    AddInHousePartController.java
        Line 47 - 53 - Displays more specific error messages regarding invalid inventory
    AddOutsourcedPartController.java
        Line 48 - 54 - Displays more specific error messages regarding invalid inventory
    EnufPartsValidator.java
        Line 36 - Add additional requirement in if statement to check if any parts would fall below minimum
    ValidEnufParts
        Line 20 - Update message to be more specific
Task I -
    PartTest.java
        Line 160 - 194 - Add Unit tests
Task J -