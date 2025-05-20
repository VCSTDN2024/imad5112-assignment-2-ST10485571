1. Basic Information


Start with a header section that includes the following basic details:

BMWQUIZ
- Developer: Sabelo Kagiso Gwele
- Student Number: ST10485571
- Group: 1
- Course: HAW1
- Subject: IMAD5112

Links
- GitHub Repository: 
- YouTube Video: 


2. Project Overview



Project Overview

The BMWQUIZ is a mobile application developed as part of an assignment in the IMAD5112 subject. This application was created using Kotlin and Android Studio. The app's primary purpose is t0 help users study and test their knowledge of BMW history through a flashcard-style quiz that provides immediate feedback, scores, and a review of correct answers.


The app was developed to meet the requirements of the assignment, which includes creating a functional mobile app and utilizing GitHub for version control and CI/CD automation using GitHub Actions.


3. App Purpose and Features


Purpose and Features

Purpose:
The main goal of this app is to educate users on the historical BMW facts through an interactive flashcard quiz that tests their knowledge using true/false questions. It encourages learning by offering instant feedback, tracking scores, and allowing users to review correct answers.

Key Features:
- Feature 1: Scoring System: Keeps track of many questions the user answers correctly and shows the final score after the last question.
- Feature 2: ScrollView: Helps to scroll through the review of questions and their correct answer.
- Feature 3: BMWActivity Screen: Displays one true/false question at a time. Provides instant feedback ("Incorrect!" or "Correct!").

These features aim to provide To provide a simple and interactive way for users to test and improve their knowledge of historical facts using a true/false flashcard quiz format.


4. Design Considerations


Design Considerations

The design of the BMWQUIZ was based on the following key considerations:

1. User Experience (UX): The app was designed with the goal of providing an intuitive and easy-to-navigate user interface, ensuring a seamless user experience. Smooth transitions between questions to maintain focus.
   
2. Responsiveness: The app was built to ensure it performs well on different screen sizes, with particular attention to device compatibility. No unnecessary background tasks to keep the app responsive.
   
3. Simplicity: The design is minimalistic, focusing on core features without overwhelming the user and to make navigation intuitive.
   
4. Performance: Code optimization was considered to ensure fast response times and low battery usage. Lightweight app with fast loading screens.



5. GitHub and GitHub Actions Utilization


GitHub and GitHub Actions

This project was managed using GitHub for version control, where all code changes were committed and pushed regularly. GitHub enabled collaborative coding, allowing me to keep track of changes and maintain project integrity.

GitHub Actions:
I utilized GitHub Actions to automate the build and deployment process. This includes:

- Running automated tests to ensure the app’s functionality.
- Uploading these build artifacts to GitHub for easy access.

The workflow ensures that my project is automatically built and tested every time I push changes, and it simplifies the process of delivering the final APK/AAB files for submission.


6. Screenshots and App Demo


Screenshots

App Screenshots:
[Screenshot 1](path_to_screenshot_1.png)
Caption for screenshot 1: [Describe the context, e.g., "The home screen of the app showing the task list."]*

[Screenshot 2](path_to_screenshot_2.png)
Caption for screenshot 2: [Describe the context, e.g., "The user profile screen where personal information is updated."]*

Video Demo:

A video showcasing the app's functionality can be viewed here: [YouTube Video Link].



7. Challenges and Learnings



Challenges and Learnings

During the development of this project, I encountered several challenges, including:

1. Challenge 1: Null Safety: Avoiding NullPointerException when receiving intent data, and also handling cases where arrays might not be passed correctly.
   - Solution: Arrays and Logic: Use arrays to manage questions and answers logically.
   
2. Challenge 2: Activity Navigation and Data Transfer: Passing data (questions, score and answers) accurately.
   - Solution: Intents and Data Passing: Used Intent.putExtra and getExtra() to send and receive data between screens.

From these challenges, I learned important lessons in debugging, using version control, and automating build processes with GitHub Actions.


8. Future Enhancements


Future Enhancements

While the current version of the app provides the core functionality, there are several features that could be added in the future, including:

1. Feature 1: Time Mode: Insert countdown for each question answer to make it more challenging.
2. Feature 2: Progress Tracking: Store quiz history and scores using local storage or a database. Let users see their improvement over time.
3. Feature 3: Daily Quiz: Introduce daily question or 5 question quiz to help with staying consistent. Awarding the user with badges or streaks for participation and consistency.

These enhancements would improve the app’s usability and make it even more versatile for end-users.


9. References


References

1. OpenAI CHATGPT(2025) ChatGPT conversation about historical BMW quiz app. Available at: https://chatgpt.com/c/682ca842-1218-8008-8757-f4f501a0de12 (Accessed: 20 May 2025).
2. .K.Garanganga.,2025. Introduction To Mobile Application Development[IMAD5112].[online via internal VLE] The Independent Institution Of Education. Accessed 28 March 2025
3. 2024.GitHub Android Studio. [video online] Available at: <https://youtu.be/bhfADZgW_4w? [Accessed 31 March 2025].



10. List of Figures


List of Figures

- Figure 1: Screenshot of the app's home screen.
- Figure 2: Screenshot of the user profile screen.



11. Disclosure of AI Usage in My Assessment


Disclosure of AI Usage in My Assessment

In the development of this project, I have used generative AI tools to assist in various parts of the assignment. Below is a detailed disclosure of where and how these tools were used:

1. Section(s) in which Generative AI was used:**
   
- Project Overview for README: used for correct grammar and punctuation. 
- Design Considerations for README: used to help with my design considerations
- Key Features for README: Help me discover the key features of the app. 
- Challenges and Solutions for README: to help write and figure out my challenges and solutions
- Future Features: helped to discover future features to add to my app.
   


2. Name of AI Tool(s) Used:
- ChatGPT (OpenAI)

3. Purpose/Intention Behind Use:
- Brainstorming: Used ChatGPT to generate ideas for the app’s features and functionality.
- Meaning Making: Used AI to clarify some concepts and gain a better understanding of how certain technologies (e.g., GitHub Actions) work.
- Initial Investigation: Utilized AI to conduct research on best practices for Android app development and GitHub Actions setup.
- Code Assistance: GitHub Copilot was used to assist in writing specific parts of the code, such as setting up GitHub Actions and working with Gradle.
- Correcting Grammar and Spelling: ChatGPT helped review and correct the grammar and clarity of my project report.

5. Link to the AI Chat(s) or Screenshots:
- Chat 1 (Brainstorming App Features): https://chatgpt.com/c/682ca842-1218-8008-8757-f4f501a0de12  
  
